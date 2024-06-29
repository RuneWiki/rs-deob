import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class163 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lud;")
    private static class279 field2932 = class130.method1024("Please wait)3)3)3", 255);

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lud;")
    public static class279 field2937 = field2932;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lud;")
    private static class279 field2939 = class130.method1024("purple:", 255);

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lud;")
    public static class279 field2933 = field2939;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lud;")
    public static class279 field2938 = field2939;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Ldg;")
    public static class317 field2935 = new class317();

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lud;")
    public static class279 field2942 = class130.method1024("Ausw-=hlen", 255);

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lud;")
    public static class279 field2944 = class130.method1024("Fps:", 255);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Lud;")
    public static class279 field2945 = class130.method1024("", 255);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lhj;")
    public static class29 field2943;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lgn;")
    public static class5 field2931;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1280(boolean arg0) {
        field2944 = null;
        field2935 = null;
        field2932 = null;
        field2945 = null;
        field2938 = null;
        field2942 = null;
        field2943 = null;
        field2939 = null;
        field2933 = null;
        field2937 = null;
        field2931 = null;
        if (arg0) {
            method1281(false, -9, 69);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZII)V", line = 27)
    public static final void method1281(boolean arg0, int arg1, int arg2) {
        field2936++;
        if (class215.field3787 != arg2) {
            class133.field2424 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class133.field2424[var3] = (var3 << 12) / arg2;
            }
            class309.field5478 = arg2 - 1;
            class59.field1251 = arg2 == 64 ? 2048 : 4096;
            class215.field3787 = arg2;
        }
        if (!arg0 || class324.field5667 == arg1) {
            return;
        }
        if (class215.field3787 == arg1) {
            class200.field3574 = class133.field2424;
        } else {
            class200.field3574 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class200.field3574[var4] = (var4 << 12) / arg1;
            }
        }
        class324.field5667 = arg1;
        class262.field4688 = arg1 - 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V", line = 80)
    public static final void method1282(int arg0, int arg1) {
        if (arg0 != -1) {
            field2938 = (class279) null;
        }
        field2934++;
        if (class181.field3310 == 0) {
            class17.field538.method130(108, arg1);
        } else {
            class243.field4322 = arg1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lvh;I)Lph;", line = 99)
    public static final class79 method1283(class53 arg0, int arg1) {
        field2940++;
        return arg1 == -1305124212 ? new class79(arg0.method495((byte) -82), arg0.method495((byte) 103), arg0.method495((byte) 73), arg0.method495((byte) -76), arg0.method461((byte) 116), arg0.method483(arg1 ^ 0x4DCA9D1A)) : (class79) null;
    }
}
