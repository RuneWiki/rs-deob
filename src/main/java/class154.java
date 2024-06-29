import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class154 {

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "J")
    public long field2702 = 0L;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lia;")
    public static class257 field2689 = class28.method234(78, "floorshadows");

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lsf;")
    public static class33 field2706 = new class33();

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lia;")
    public static class257 field2707 = class28.method234(-61, "::fpson");

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[[[I")
    public static int[][][] field2708 = new int[4][13][13];

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Lia;")
    public static class257 field2709 = class28.method234(126, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lij;")
    public class166 field2698;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
    public static int[] field2701;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public static final void method1079(int arg0, int arg1) {
        class162.field2846 += arg1 * 128;
        field2705++;
        if (class227.field3816.length < class162.field2846) {
            class162.field2846 -= class227.field3816.length;
            int var2 = (int) (Math.random() * 12.0D);
            class222.method1467(false, class259.field4495[var2]);
        }
        int var3 = 112 / ((arg0 - 22) / 45);
        short var4 = 256;
        int var5 = arg1 * 128;
        int var6 = (var4 - arg1) * 128;
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var27 = class68.field1364[var7 + var5] - class227.field3816[class227.field3816.length - 1 & class162.field2846 + var7] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class68.field1364[var7++] = var27;
        }
        for (int var9 = var4 - arg1; var9 < var4; var9++) {
            int var24 = var9 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class68.field1364[var25 + var24] = 255;
                } else {
                    class68.field1364[var25 + var24] = 0;
                }
            }
        }
        for (int var10 = 0; var10 < (var4 - arg1); var10++) {
            class160.field2805[var10] = class160.field2805[arg1 + var10];
        }
        for (int var11 = var4 - arg1; var11 < var4; var11++) {
            class160.field2805[var11] = (int) (Math.sin((double) class151.field2604 / 14.0D) * 16.0D + Math.sin((double) class151.field2604 / 15.0D) * 14.0D + Math.sin((double) class151.field2604 / 16.0D) * 12.0D);
            class151.field2604++;
        }
        class116.field2081 += arg1;
        int var12 = ((class7.field153 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class116.field2081; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class68.field1364[(var23 << 7) + var22] = 192;
        }
        class116.field2081 = 0;
        for (int var14 = 0; var14 < var4; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if ((var12 + var21) < 128) {
                    var19 += class68.field1364[var20 + var21 + var12];
                }
                if (-(var12 - var21) - 1 >= 0) {
                    var19 -= class68.field1364[var21 + var20 - (var12 + 1)];
                }
                if (var21 >= 0) {
                    class217.field3673[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var4; var17++) {
                int var18 = var17 * 128;
                if (var4 > (var12 + var17)) {
                    var16 += class217.field3673[var15 + var18 + (var12 * 128)];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class217.field3673[var15 + var18 - (var12 * 128) - 128];
                }
                if (var17 >= 0) {
                    class68.field1364[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1080(int arg0) {
        if (arg0 != 29990) {
            field2709 = null;
        }
        field2707 = null;
        field2701 = null;
        field2708 = null;
        field2709 = null;
        field2706 = null;
        field2689 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[IJZ)Lia;")
    public static final class257 method1081(int arg0, int[] arg1, long arg2, boolean arg3) {
        field2692++;
        if (class136.field2430 != null) {
            class257 var5 = class136.field2430.method119(6, arg2, arg1, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 == 5) {
            return class199.method1334((byte) -128, arg2).method1717(-114);
        } else if (arg3) {
            return class39.method321(11901, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
    public static final void method1082(boolean arg0, byte arg1) {
        field2703++;
        byte var2 = 4;
        byte[][] var3 = class135.field2409;
        int var4 = 0;
        int var5 = 95 % ((87 - arg1) / 39);
        while (var4 < var2) {
            class39.method319((byte) 103);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = field2708[var4][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FFB) >> 3;
                            int var14 = (var12 / 8 << 8) + (var13 / 8);
                            for (int var15 = 0; var15 < class197.field3328.length; var15++) {
                                if (class197.field3328[var15] == var14 && var3[var15] != null) {
                                    var8 = true;
                                    class43.method335(var11, var3[var15], (var13 & 0x7) * 8, var10, arg0, var4, (var12 & 0x7) * 8, var6 * 8, class173.field2961, -102, var7 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class62.method469(var4, var7 * 8, -23262, var6 * 8, 8, 8);
                    }
                }
            }
            var4++;
        }
    }
}
