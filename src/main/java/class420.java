import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class420 implements Runnable {

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[Laq;")
    public volatile class234[] field5886 = new class234[2];

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Z")
    public volatile boolean field5885 = false;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "Z")
    public volatile boolean field5892 = false;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Z")
    public static boolean field5883 = false;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field5882 = 0;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
    public static int[] field5884 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Lbd;")
    public class304 field5887;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Lrk;")
    public static class427 field5888;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lpe;IZI)V", line = 3)
    public static final void method2591(class391 arg0, int arg1, boolean arg2, int arg3) {
        field5890++;
        class150.field2295 = new class116[arg3][arg1];
        class387.field5450 = arg0;
        if (class394.field5518 != null) {
            class6.field41 = class114.method925(0, class394.field5518[4], class394.field5518[1], class394.field5518[2], class394.field5518[0], class394.field5518[3], class394.field5518[5]);
        }
        class199.field2832 = new class116();
        class355.method2241(!arg2);
        if (arg2) {
            field5882 = -105;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 23)
    public static void method2592(int arg0) {
        field5884 = null;
        field5888 = null;
        if (arg0 != -811) {
            method2593(49);
        }
    }

    @OriginalMember(owner = "client!lo", name = "run", descriptor = "()V", line = 45)
    public final void run() {
        field5891++;
        this.field5892 = true;
        try {
            while (!this.field5885) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class234 var2 = this.field5886[var1];
                    if (var2 != null) {
                        var2.method1552(-89);
                    }
                }
                class229.method1541(120, 10L);
                class5.method30(false, (Object) null, this.field5887);
            }
        } catch (Exception var9) {
            class380.method2365(-2, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field5892 = false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I", line = 91)
    public static final int method2593(int arg0) {
        field5889++;
        try {
            if (class257.field3472 == 0) {
                if (class155.field2349 > (class108.method902((byte) -93) - 5000L)) {
                    return 0;
                }
                class128.field1821 = class30.field502.method1955(class124.field1736, class82.field1213, -53);
                class21.field392 = class108.method902((byte) -93);
                class257.field3472 = 1;
            }
            if (class21.field392 + 30000L < class108.method902((byte) -93)) {
                return class198.method1404(28468, 1000);
            }
            if (class257.field3472 == 1) {
                if (class128.field1821.field3345 == 2) {
                    return class198.method1404(28468, 1001);
                }
                if (class128.field1821.field3345 != 1) {
                    return -1;
                }
                class105.field1540 = new class441((Socket) class128.field1821.field3341, class30.field502);
                class128.field1821 = null;
                int var1 = 0;
                if (class132.field1875) {
                    var1 = class298.field4009;
                }
                class355.field4828.field3938 = 0;
                class355.field4828.method1824(55, 23);
                class355.field4828.method1854(var1, true);
                class105.field1540.method2737(class355.field4828.field3882, 0, class355.field4828.field3938, -127);
                if (class76.field1136 != null) {
                    class76.field1136.method1563(123);
                }
                if (class365.field5037 != null) {
                    class365.field5037.method1563(121);
                }
                int var2 = class105.field1540.method2742(5000);
                if (class76.field1136 != null) {
                    class76.field1136.method1563(123);
                }
                if (class365.field5037 != null) {
                    class365.field5037.method1563(122);
                }
                if (var2 != 0) {
                    return class198.method1404(28468, var2);
                }
                class257.field3472 = 2;
            }
            if (class257.field3472 == 2) {
                if (class105.field1540.method2732(0) < 2) {
                    return -1;
                }
                class446.field6423 = class105.field1540.method2742(5000);
                class446.field6423 <<= 0x8;
                class446.field6423 += class105.field1540.method2742(5000);
                class96.field1390 = 0;
                class315.field4276 = new byte[class446.field6423];
                class257.field3472 = 3;
            }
            if (class257.field3472 != 3) {
                if (arg0 <= 15) {
                    method2591((class391) null, -10, true, -58);
                }
                return -1;
            }
            int var3 = class105.field1540.method2732(0);
            if (var3 < 1) {
                return -1;
            }
            if ((class446.field6423 - class96.field1390) < var3) {
                var3 = class446.field6423 - class96.field1390;
            }
            class105.field1540.method2733(class96.field1390, class315.field4276, 86, var3);
            class96.field1390 += var3;
            if (class446.field6423 > class96.field1390) {
                return -1;
            } else if (class35.method359(class315.field4276, (byte) -93)) {
                class365.field5034 = new class187[class38.field583];
                int var4 = 0;
                for (int var5 = class192.field2766; var5 <= class227.field3155; var5++) {
                    class187 var6 = class32.method348(0, var5);
                    if (var6 != null) {
                        class365.field5034[var4++] = var6;
                    }
                }
                class167.field2477 = 0;
                class322.field4363 = null;
                class105.field1540.method2736(5000);
                class338.field4594 = 0;
                class105.field1540 = null;
                class315.field4276 = null;
                class257.field3472 = 0;
                class155.field2349 = class108.method902((byte) -93);
                return 0;
            } else {
                return class198.method1404(28468, 1002);
            }
        } catch (IOException var7) {
            return class198.method1404(28468, 1003);
        }
    }
}
