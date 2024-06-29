import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class34 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "J")
    public static volatile long field496 = 0L;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[I")
    public int[] field489;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 9)
    public static final void method248(int arg0) {
        field490++;
        if (class205.field3012 == 0) {
            return;
        }
        try {
            if (++class8.field110 > 2000) {
                if (class124.field2028 != null) {
                    class124.field2028.method1654(-21013);
                    class124.field2028 = null;
                }
                if (class28.field421 >= 1) {
                    class205.field3012 = 0;
                    class349.field4965 = -5;
                    return;
                }
                if (class86.field1396 == class250.field3621) {
                    class86.field1396 = class397.field5833;
                } else {
                    class86.field1396 = class250.field3621;
                }
                class205.field3012 = 1;
                class8.field110 = 0;
                class28.field421++;
            }
            if (class205.field3012 == 1) {
                class20.field296 = class188.field2783.method1383(class86.field1396, true, class447.field6515);
                class205.field3012 = 2;
            }
            if (class205.field3012 == 2) {
                if (class20.field296.field2121 == 2) {
                    throw new IOException();
                }
                if (class20.field296.field2121 != 1) {
                    return;
                }
                class124.field2028 = new class219((Socket) class20.field296.field2125, class188.field2783);
                class20.field296 = null;
                class124.field2028.method1653(class13.field216.field578, 3, class13.field216.field565, 0);
                if (class157.field2389 != null) {
                    class157.field2389.method2257(-17664);
                }
                if (class91.field1446 != null) {
                    class91.field1446.method2257(-17664);
                }
                int var1 = class124.field2028.method1662(1);
                if (class157.field2389 != null) {
                    class157.field2389.method2257(-17664);
                }
                if (class91.field1446 != null) {
                    class91.field1446.method2257(-17664);
                }
                if (var1 != 21) {
                    class349.field4965 = var1;
                    class205.field3012 = 0;
                    class124.field2028.method1654(-21013);
                    class124.field2028 = null;
                    return;
                }
                class205.field3012 = 3;
            }
            if (class205.field3012 == 3) {
                if (class124.field2028.method1655(-10561) < 1) {
                    return;
                }
                class62.field997 = new String[class124.field2028.method1662(1)];
                class205.field3012 = 4;
            }
            if (arg0 >= 37 && class205.field3012 == 4 && class124.field2028.method1655(-10561) >= class62.field997.length * 8) {
                class268.field4020.field565 = 0;
                class124.field2028.method1659(117, class268.field4020.field578, class62.field997.length * 8, 0);
                for (int var2 = 0; var2 < class62.field997.length; var2++) {
                    class62.field997[var2] = class242.method1761(class268.field4020.method315(-55), (byte) -110);
                }
                class205.field3012 = 0;
                class349.field4965 = 21;
                class124.field2028.method1654(-21013);
                class124.field2028 = null;
            }
        } catch (IOException var3) {
            if (class124.field2028 != null) {
                class124.field2028.method1654(-21013);
                class124.field2028 = null;
            }
            if (class28.field421 < 1) {
                class28.field421++;
                if (class86.field1396 == class250.field3621) {
                    class86.field1396 = class397.field5833;
                } else {
                    class86.field1396 = class250.field3621;
                }
                class205.field3012 = 1;
                class8.field110 = 0;
            } else {
                class349.field4965 = -4;
                class205.field3012 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 167)
    public static final void method249(int arg0) {
        class18 var1 = class439.field6386;
        synchronized (class439.field6386) {
            if (arg0 != 8) {
                return;
            }
            class439.field6386.method106((byte) -122);
        }
        field494++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method246(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method247(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method250(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);
}
