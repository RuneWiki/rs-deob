import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class203 implements class637 {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Lee;")
    public class676 field2408;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Lhaa;")
    public class82 field2412;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Z")
    public static boolean field2401 = false;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[[I")
    public static int[][] field2411 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "[Lufa;")
    public static class680[] field2413;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V", line = 7)
    public static void method1121(int arg0) {
        field2411 = null;
        if (arg0 > 104) {
            field2413 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[[BLms;)V", line = 30)
    public static final void method1122(int arg0, byte[][] arg1, class760 arg2) {
        field2409++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = 0;
        if (arg0 != 11948) {
            field2401 = false;
        }
        while (var4 < arg2.field3774) {
            class7.method18(22696);
            for (int var9 = 0; var9 < class272.field3589 >> 3; var9++) {
                for (int var10 = 0; var10 < (class3.field26 >> 3); var10++) {
                    int var11 = class117.field1548[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x3FE0511) >> 24;
                        if (!arg2.field3769 || var12 == 0) {
                            int var13 = (var11 & 0x7) >> 1;
                            int var14 = (var11 & 0xFFE196) >> 14;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class519.field6991.length; var17++) {
                                if (class519.field6991[var17] == var16 && arg1[var17] != null) {
                                    class611 var18 = new class611(arg1[var17]);
                                    arg2.method1711(var15, var10 * 8, var18, var13, var12, var9 * 8, arg0 - 11948, var14, class171.field2130, var4);
                                    arg2.method4224(var14, var15, var3[0] == -1 ? var3 : null, var9 * 8, var10 * 8, var18, class21.field142, var13, true, var12, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
        for (int var5 = 0; var5 < arg2.field3774; var5++) {
            class7.method18(22696);
            for (int var6 = 0; var6 < (class272.field3589 >> 3); var6++) {
                for (int var7 = 0; var7 < (class3.field26 >> 3); var7++) {
                    int var8 = class117.field1548[var5][var6][var7];
                    if (var8 == -1) {
                        arg2.method1703(8, var5, var6 * 8, 8, var7 * 8, arg0 ^ 0xFFFFD153);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class257.field3343 = class147.field1893.method2797(0, var3[0], var3[2], var3[1], class278.field3718, var3[3]);
            class604.field8422 = var3[4];
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Z", line = 148)
    public static final boolean method1123(int arg0, int arg1, int arg2) {
        int var3 = -125 % ((arg2 + 52) / 55);
        field2410++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lee;Lhaa;IIIIIII)V", line = 157)
    public class203(class676 arg0, class82 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2406 = arg3;
        this.field2403 = arg2;
        this.field2402 = arg5;
        this.field2405 = arg7;
        this.field2407 = arg6;
        this.field2408 = arg0;
        this.field2415 = arg4;
        this.field2414 = arg8;
        this.field2412 = arg1;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Lhda;", line = 176)
    public class750 method333(int arg0) {
        field2404++;
        if (arg0 != 30778) {
            this.field2408 = null;
        }
        return null;
    }
}
