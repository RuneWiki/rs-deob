import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class23 {

    @OriginalMember(owner = "client!p", name = "v", descriptor = "J")
    public long field298 = 0L;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lkd;")
    public static class316 field282 = null;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[[I")
    public static int[][] field281 = new int[5][5000];

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Loh;")
    public static class258 field292 = class153.method1046("Mem:", 96);

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Loh;")
    public static class258 field294 = class153.method1046("null", 104);

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Ls;")
    public static class171 field297 = null;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lrk;")
    public class123 field289;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lrk;")
    public class123 field291;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lkl;")
    public static class65 field278;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
    public static int[] field280;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[[Ls;")
    public static class171[][] field290;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 6)
    public static void method182(byte arg0) {
        field292 = null;
        field297 = null;
        field294 = null;
        if (arg0 >= -27) {
            field278 = (class65) null;
        }
        field290 = (class171[][]) null;
        field282 = null;
        field278 = null;
        field281 = (int[][]) null;
        field280 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)I", line = 26)
    public static final int method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class74.field1290) {
            arg2 = 1000000;
            class74.field1290 = false;
        }
        class60 var5 = class57.field899[arg0][arg4];
        field284++;
        float var6 = ((float) arg3 * 0.1F + 0.7F) * var5.field994;
        float var7 = var5.field999;
        if (arg1 > -75) {
            method182((byte) -120);
        }
        float var8 = var5.field993;
        int var9 = var5.field996;
        int var10 = var5.field992;
        int var11 = var5.field995;
        if (!class57.field896) {
            var11 = 0;
        }
        if (class164.field2780 != var9 || class36.field459 != var6 || class227.field3899 != var7 || class64.field1117 != var8 || class236.field4130 != var10 || class300.field5130 != var11) {
            class64.field1117 = var8;
            class228.field3946 = class307.field5213;
            class300.field5130 = var11;
            class236.field4130 = var10;
            class310.field5254 = class3.field48;
            class312.field5296 = 0;
            class164.field2780 = var9;
            class227.field3899 = var7;
            class137.field2338 = class249.field4299;
            class162.field2735 = class110.field1937;
            class109.field1923 = class218.field3753;
            class36.field459 = var6;
            class75.field1312 = class144.field2420;
        }
        if (class312.field5296 < 65536) {
            class312.field5296 += arg2 * 250;
            if (class312.field5296 >= 65536) {
                class312.field5296 = 65536;
            }
            int var12 = 65536 - class312.field5296 >> 8;
            int var13 = class312.field5296 >> 8;
            class218.field3753 = ((class236.field4130 & 0xFF00FF) * var13 + (class109.field1923 & 0xFF00FF) * var12 & 0xFF00FF00) + ((class236.field4130 & 0xFF00) * var13 + (class109.field1923 & 0xFF00) * var12 & 0xFF0000) >> 8;
            class110.field1937 = class300.field5130 * var13 + class162.field2735 * var12 >> 8;
            float var14 = (float) (65536 - class312.field5296) / 65536.0F;
            float var15 = (float) class312.field5296 / 65536.0F;
            class144.field2420 = class75.field1312 * var14 + class227.field3899 * var15;
            class307.field5213 = ((class228.field3946 & 0xFF00FF) * var12 + ((class164.field2780 & 0xFF00FF) * var13) & 0xFF00FF00) + ((class228.field3946 & 0xFF00) * var12 + (class164.field2780 & 0xFF00) * var13 & 0xFF0000) >> 8;
            class249.field4299 = class64.field1117 * var15 + class137.field2338 * var14;
            class3.field48 = class36.field459 * var15 + class310.field5254 * var14;
        }
        class304.method2132(class307.field5213, class3.field48, class144.field2420, class249.field4299);
        class304.method2122(class218.field3753, class110.field1937);
        class304.method2129((float) class128.field2274, (float) class144.field2409, (float) class283.field4862);
        class304.method2127();
        return class218.field3753;
    }
}
