import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class146 {

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Ltd;")
    public static class136 field3368 = class145.method1172("hitmarks", 45);

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3365 = 0;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Ltd;")
    private static class136 field3369 = class145.method1172("go back to the main RuneScape webpage", 45);

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Ltd;")
    public static class136 field3364 = field3369;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Ltd;")
    private static class136 field3371 = class145.method1172("Please enter your username)3", 45);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Ltd;")
    public static class136 field3360 = field3371;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lue;")
    public static class143 field3361 = new class143(50);

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Ltd;")
    public static class136 field3377 = class145.method1172(":tradereq:", 45);

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Z")
    public static boolean field3378 = false;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field3376 = 2;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lpd;")
    public static class108 field3370;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lo;")
    public static class97 field3366;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1176(int arg0) {
        field3366 = null;
        field3369 = null;
        field3368 = null;
        field3361 = null;
        field3377 = null;
        field3370 = null;
        if (arg0 != 0) {
            method1177(100, (byte) 5, null, null, -21, 115, 43);
        }
        field3371 = null;
        field3364 = null;
        field3360 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB[B[Lm;III)V")
    public static final void method1177(int arg0, byte arg1, byte[] arg2, class83[] arg3, int arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg5 + var12 > 0 && arg5 + var12 < 103 && arg4 + var13 > 0 && arg4 + var13 < 103) {
                        arg3[var7].field1972[arg5 + var12][arg4 + var13] = class154.method1207(arg3[var7].field1972[arg5 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        if (arg1 != 116) {
            method1176(-128);
        }
        field3362++;
        class127 var8 = new class127(arg2);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class85.method636(arg6, (byte) -67, var8, arg4 + var11, arg5 + var10, var9, 0, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static final void method1178(int arg0) {
        class61 var1 = class90.field2132;
        synchronized (class90.field2132) {
            class133.field3139 = class54.field1205;
            class18.field360 = class76.field1715;
            class142.field3292 = class131.field3102;
            class51.field1155 = class120.field2746;
            field3379 = class86.field2008;
            class8.field142 = class89.field2108;
            class152.field3476 = class89.field2115;
            class120.field2746 = arg0;
        }
        field3375++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)Lbb;")
    public static final class10 method1179(boolean arg0) {
        field3372++;
        class10 var1 = new class10();
        var1.field173 = class96.field2252;
        var1.field175 = class65.field1408[0];
        var1.field170 = class64.field1381;
        var1.field171 = class71.field1511[0];
        if (arg0) {
            method1177(70, (byte) 99, null, null, 99, -35, -29);
        }
        var1.field174 = class81.field1905[0];
        var1.field172 = class3.field59[0];
        int var2 = var1.field175 * var1.field172;
        var1.field169 = new int[var2];
        byte[] var3 = class124.field2887[0];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field169[var4] = class127.field2953[class154.method1207(255, var3[var4])];
        }
        class124.method957(97);
        return var1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BII)I")
    public static final int method1180(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1178(-1);
        }
        field3374++;
        return class109.method861(arg1, arg0, arg2 + 15003, 0);
    }
}
