import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class151 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lwf;")
    public static class159 field3287 = null;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lic;")
    public static class59 field3286 = class59.method433(0, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lic;")
    public static class59 field3288 = class59.method433(0, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Llf;")
    public static class82 field3283 = new class82(64);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Z")
    public static boolean field3292 = false;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lic;")
    private static class59 field3294 = class59.method433(0, "Select");

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lic;")
    public static class59 field3293 = field3294;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lf;")
    public static class36 field3284;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1112(boolean arg0, Component arg1) {
        field3289++;
        arg1.removeMouseListener(class149.field3262);
        arg1.removeMouseMotionListener(class149.field3262);
        arg1.removeFocusListener(class149.field3262);
        if (!arg0) {
            method1112(true, null);
        }
        class139.field3106 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1113(byte arg0) {
        field3284 = null;
        if (arg0 <= 50) {
            method1113((byte) -22);
        }
        field3287 = null;
        field3293 = null;
        field3283 = null;
        field3288 = null;
        field3294 = null;
        field3286 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
    public static final int method1114(int arg0, int arg1, int arg2) {
        int var3 = class40.method304(arg2 - 85, arg1 + -1, arg0 - 1) + class40.method304(-126, arg1 - 1, arg0 + arg2) + class40.method304(-25, arg1 + 1, arg0 + -1) + class40.method304(-126, arg1 + 1, arg0 + 1);
        int var4 = class40.method304(-29, arg1, arg0 - 1) + class40.method304(arg2 ^ 0xFFFFFF99, arg1, arg0 + 1) + class40.method304(-99, arg1 + -1, arg0) + class40.method304(-83, arg1 + 1, arg0);
        field3290++;
        int var5 = class40.method304(arg2 ^ 0xFFFFFFB9, arg1, arg0);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public abstract void method16(int arg0);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)I")
    public abstract int method18(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)I")
    public static final int method1115(byte arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg0 >= -32) {
            field3286 = null;
        }
        field3285++;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }
}
