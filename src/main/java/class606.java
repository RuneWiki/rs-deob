import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class606 extends class253 {

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public int field8477;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "[I")
    public static int[] field8481 = new int[2];

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "[F")
    public static float[] field8478 = new float[4];

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "Lwv;")
    public static class37 field8482 = new class37(3, -1);

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "[I")
    public static int[] field8479;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "[I")
    public static int[] field8480;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
    public static final void method3517(int arg0) {
        field8484++;
        client var1 = class256.field3768;
        synchronized (class256.field3768) {
            if (class161.field2561 == null) {
                if (arg0 != 31719) {
                    field8480 = null;
                }
                Container var2;
                if (class384.field5278 != null) {
                    var2 = class384.field5278;
                } else if (class319.field4527 == null) {
                    var2 = class742.field10293;
                } else {
                    var2 = class319.field4527;
                }
                class179.field2787 = var2.getSize().width;
                class63.field759 = var2.getSize().height;
                if (class384.field5278 == var2) {
                    Insets var3 = class384.field5278.getInsets();
                    class63.field759 -= var3.top + var3.bottom;
                    class179.field2787 -= var3.right + var3.left;
                }
                if (class592.method3442((byte) -104) == 1) {
                    class423.field5786 = 0;
                    class714.field9895 = class296.field4307;
                    class428.field5825 = class527.field7532;
                    class270.field3918 = (class179.field2787 - class527.field7532) / 2;
                } else {
                    class666.method3796((byte) 92);
                }
                if (class622.field8739 != class300.field4326) {
                    boolean var10000;
                    if (class428.field5825 < 1024 && class714.field9895 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class629.field8819.setSize(class428.field5825, class714.field9895);
                if (class37.field491 != null) {
                    if (class195.field2997) {
                        class512.method3093(class629.field8819, (byte) -26);
                    } else {
                        class37.field491.method475(class629.field8819, class428.field5825, class714.field9895);
                    }
                }
                if (class384.field5278 == var2) {
                    Insets var4 = class384.field5278.getInsets();
                    class629.field8819.setLocation(var4.left + class270.field3918, class423.field5786 + var4.top);
                } else {
                    class629.field8819.setLocation(class270.field3918, class423.field5786);
                }
                if (class371.field5137 != -1) {
                    class661.method3773(true, -47);
                }
                class33.method270(arg0 - 31719);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lin;Lti;IIIIIIIIIIIIII)V")
    public class606(class97 arg0, class463 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field8477 = arg15;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(FFBF)I")
    public static final int method3518(float arg0, float arg1, byte arg2, float arg3) {
        field8483++;
        if (arg2 != -85) {
            field8479 = null;
        }
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        float var5 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var6 = (arg1 < 0.0F) ? -arg1 : arg1;
        if (var4 < var5 && var6 < var5) {
            return (arg0 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg1 > 0.0F ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lsaa;")
    public final class345 method1656(int arg0) {
        if (arg0 != 0) {
            field8480 = null;
        }
        field8485++;
        return class95.field1076;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
    public static void method3519(byte arg0) {
        field8479 = null;
        field8481 = null;
        field8482 = null;
        field8478 = null;
        if (arg0 <= -64) {
            field8480 = null;
        }
    }
}
