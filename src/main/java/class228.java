import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class228 implements class94 {

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3923 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field3919 = 0;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "[I")
    public static int[] field3927 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[J")
    public static long[] field3926 = new long[100];

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
    public static boolean field3922;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[[[B")
    public static byte[][][] field3924;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(JIB[I)Lsb;")
    public final class98 method687(long arg0, int arg1, byte arg2, int[] arg3) {
        field3921++;
        if (arg2 != -78) {
            this.method687(30L, 34, (byte) -17, (int[]) null);
        }
        if (arg1 == 0) {
            class132 var6 = class80.method604(arg2 ^ 0xFFFFFFB0, arg3[0]);
            return var6.method996((int) arg0, arg2 + 94);
        } else if (arg1 == 1 || arg1 == 10) {
            class245 var7 = class235.method1605(arg2 ^ 0xFFFFFFC2, (int) arg0);
            return var7.field4255;
        } else if (arg1 == 6 || arg1 == 7) {
            return class80.method604(2, arg3[0]).method996((int) arg0, 48);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method1573(int arg0) {
        field3926 = null;
        field3924 = null;
        field3927 = null;
        if (arg0 != -326) {
            method1573(104);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1574(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3925++;
        if (class118.field2124 == arg2 && class191.field3316 == arg6 && class93.field1632 == arg0 || class181.method1249((byte) 62)) {
            return;
        }
        class93.field1632 = arg0;
        int var7 = -29 / ((arg5 + 19) / 46);
        class118.field2124 = arg2;
        class191.field3316 = arg6;
        if (class181.method1249((byte) 62)) {
            class93.field1632 = 0;
        }
        if (arg4) {
            class220.method1521(28, 0);
        } else {
            class220.method1521(25, 0);
        }
        class92.method680(true, class106.field1909, true);
        int var8 = class189.field3277;
        class189.field3277 = (arg2 - 6) * 8;
        int var9 = class182.field3143;
        class182.field3143 = arg6 * 8 - 48;
        class37.field618 = class80.method605(class118.field2124 * 8, class191.field3316 * 8, (byte) -112);
        int var10 = class182.field3143 - var9;
        int var11 = class189.field3277 - var8;
        int var12 = class189.field3277;
        int var13 = class182.field3143;
        if (arg4) {
            class222.field3837 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class108 var15 = class180.field3109[var14];
                if (var15 != null) {
                    var15.field4466 -= var10 * 128;
                    var15.field4492 -= var11 * 128;
                    if (var15.field4492 >= 0 && var15.field4492 <= 13184 && var15.field4466 >= 0 && var15.field4466 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field4501[var16] -= var11;
                            var15.field4491[var16] -= var10;
                        }
                        class87.field1546[class222.field3837++] = var14;
                    } else {
                        class180.field3109[var14].field1928 = null;
                        class180.field3109[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class108 var33 = class180.field3109[var17];
                if (var33 != null) {
                    for (int var34 = 0; var34 < 10; var34++) {
                        var33.field4501[var34] -= var11;
                        var33.field4491[var34] -= var10;
                    }
                    var33.field4466 -= var10 * 128;
                    var33.field4492 -= var11 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class192 var31 = class141.field2499[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field4501[var32] -= var11;
                    var31.field4491[var32] -= var10;
                }
                var31.field4492 -= var11 * 128;
                var31.field4466 -= var10 * 128;
            }
        }
        byte var19 = 0;
        class265.field4640 = arg0;
        class163.field2943.method1765(false, arg3, arg1, (byte) 52);
        byte var20 = 1;
        byte var21 = 104;
        if (var11 < 0) {
            var20 = -1;
            var19 = 103;
            var21 = -1;
        }
        byte var22 = 104;
        byte var23 = 0;
        byte var24 = 1;
        if (var10 < 0) {
            var23 = 103;
            var22 = -1;
            var24 = -1;
        }
        for (int var25 = var19; var25 != var21; var25 += var20) {
            for (int var27 = var23; var27 != var22; var27 += var24) {
                int var28 = var11 + var25;
                int var29 = var27 + var10;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class115.field2050[var30][var25][var27] = class115.field2050[var30][var28][var29];
                    } else {
                        class115.field2050[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class262 var26 = (class262) class153.field2794.method371((byte) 61); var26 != null; var26 = (class262) class153.field2794.method370(true)) {
            var26.field4595 -= var10;
            var26.field4593 -= var11;
            if (var26.field4593 < 0 || var26.field4595 < 0 || var26.field4593 >= 104 || var26.field4595 >= 104) {
                var26.method1611((byte) 72);
            }
        }
        if (class250.field4387 != 0) {
            class95.field1646 -= var10;
            class250.field4387 -= var11;
        }
        class105.field1866 = 0;
        if (arg4) {
            class90.field1582 -= var10;
            class8.field133 -= var11;
            class118.field2116 -= var10;
            class53.field860 -= var11;
        } else {
            class207.field3549 = 1;
        }
        class117.field2107 = -1;
        class135.field2387.method382(false);
        class64.field1048.method382(false);
    }
}
