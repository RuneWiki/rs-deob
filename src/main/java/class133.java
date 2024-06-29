import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class133 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lr;")
    private static class118 field3029 = class153.method1136(104, "Walk here");

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lr;")
    public static class118 field3031 = class153.method1136(111, "title)3jpg");

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lr;")
    public static class118 field3033 = class153.method1136(93, "mapscene");

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lr;")
    public static class118 field3040 = class153.method1136(104, "p11_full");

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lr;")
    public static class118 field3039 = class153.method1136(109, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lr;")
    public static class118 field3043 = field3029;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lr;")
    public static class118 field3037 = class153.method1136(81, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Z")
    public static volatile boolean field3042 = false;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lr;")
    private static class118 field3045 = class153.method1136(77, "This world is full)3");

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lr;")
    public static class118 field3038 = field3045;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lef;")
    public static class35 field3030;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[Lvd;")
    public static class150[] field3032;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public static final int method1022(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field3036++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg0 != 15702) {
            field3044 = 39;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1023(int arg0) {
        field3031 = null;
        field3030 = null;
        field3039 = null;
        field3038 = null;
        field3033 = null;
        field3043 = null;
        field3045 = null;
        field3032 = null;
        field3029 = null;
        field3037 = null;
        if (arg0 != -128) {
            method1023(-126);
        }
        field3040 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
    public static final int method1024(int arg0, int arg1, int arg2) {
        if (arg0 != 18084) {
            field3044 = 72;
        }
        int var3 = class42.method347(arg2 + 45365, 4, arg0 - 17970, arg1 - -91923) + (class42.method347(arg2 + 10294, 2, 96, arg1 + 37821) - 128 >> 1) + (class42.method347(arg2, 1, arg0 + -17995, arg1) + -128 >> 2) - 128;
        field3034++;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
