import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class131 {

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lke;")
    public static class65 field3170 = class1.method17("Zu viele Verbindungen von Ihrer Adresse)3", -121);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lke;")
    private static class65 field3168 = class1.method17("Loading )2 please wait)3", -128);

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lke;")
    private static class65 field3177 = class1.method17("Unexpected server response", -121);

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Lke;")
    private static class65 field3176 = class1.method17("Prepared visibility map", -123);

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lke;")
    public static class65 field3173 = class1.method17("Sie haben gerade eine andere Welt verlassen)3", -114);

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lke;")
    private static class65 field3174 = class1.method17("Message", -124);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lke;")
    private static class65 field3167 = class1.method17("From", -111);

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lke;")
    private static class65 field3179 = class1.method17("Loaded wordpack", -115);

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lke;")
    public static class65 field3183 = class1.method17("60 Sekunden noch einmal)3)3)3", -120);

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lke;")
    public static class65 field3181 = field3174;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lke;")
    public static class65 field3187 = field3168;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lke;")
    public static class65 field3184 = field3179;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lke;")
    private static class65 field3175 = class1.method17("Checking for updates )2 ", -128);

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lke;")
    public static class65 field3188 = field3177;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lke;")
    public static class65 field3182 = field3176;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lke;")
    public static class65 field3166 = field3167;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lke;")
    public static class65 field3169 = field3175;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Lke;")
    public static class65 field3186 = class1.method17("sch-Utteln:", -118);

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lke;")
    private static class65 field3192 = class1.method17("Hidden", -112);

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lke;")
    public static class65 field3178 = field3192;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Ljd;")
    public static class58 field3189;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[I")
    public static int[] field3185;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 38)
    public static void method1020(boolean arg0) {
        field3177 = null;
        field3166 = null;
        field3178 = null;
        field3168 = null;
        if (!arg0) {
            method1022(25, -25, -95, -113, -96, -10, -37);
        }
        field3181 = null;
        field3179 = null;
        field3182 = null;
        field3188 = null;
        field3186 = null;
        field3175 = null;
        field3167 = null;
        field3189 = null;
        field3184 = null;
        field3192 = null;
        field3187 = null;
        field3174 = null;
        field3183 = null;
        field3176 = null;
        field3170 = null;
        field3169 = null;
        field3173 = null;
        field3185 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I", line = 90)
    public static final int method1021(int arg0) {
        if (arg0 >= -88) {
            field3188 = null;
        }
        field3180++;
        return class80.field2129++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V", line = 109)
    public static final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3172++;
        int var7 = 2048 - arg2 & 0x7FF;
        int var8 = arg6 - arg3 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg0;
        if (var7 != 0) {
            int var12 = class37.field932[var7];
            int var13 = class37.field943[var7];
            int var14 = var10 * var13 - arg0 * var12 >> 16;
            var11 = var10 * var12 + arg0 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class37.field932[var8];
            int var16 = class37.field943[var8];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class76.field2038 = arg2;
        class102.field2642 = arg4 - var9;
        class51.field1293 = arg1 - var11;
        class5.field102 = arg5 - var10;
        class51.field1295 = arg3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lge;BI)V", line = 155)
    public static final void method1023(class41 arg0, byte arg1, int arg2) {
        int var3 = -113 % ((-arg1 - 43) / 52);
        field3191++;
        class83.method740(arg2, arg0.field1070, false, arg0.field1067);
    }
}
