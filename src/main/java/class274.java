import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class274 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[B")
    public byte[] field4749 = new byte[4096];

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[[I")
    public int[][] field4764 = new int[6][258];

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
    public int[] field4752 = new int[256];

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public int field4762 = 0;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[[I")
    public int[][] field4765 = new int[6][258];

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[B")
    public byte[] field4759 = new byte[256];

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "[[B")
    public byte[][] field4770 = new byte[6][258];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public int field4758 = 0;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "[B")
    public byte[] field4773 = new byte[18002];

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "[I")
    public int[] field4776 = new int[16];

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "[I")
    public int[] field4775 = new int[6];

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "[Z")
    public boolean[] field4772 = new boolean[256];

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[Z")
    public boolean[] field4768 = new boolean[16];

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[B")
    public byte[] field4760 = new byte[18002];

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
    public int[] field4754 = new int[257];

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "[[I")
    public int[][] field4761 = new int[6][258];

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[I")
    public static int[] field4774 = new int[256];

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Lmb;")
    private static class96 field4789;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Lmb;")
    public static class96 field4787;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lmb;")
    public static class96 field4786;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "B")
    public byte field4778;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public int field4756;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4790;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "[B")
    public byte[] field4771;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "[B")
    public byte[] field4777;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "[S")
    public static short[] field4785;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLvi;)V")
    public static final void method1859(byte arg0, class197 arg1) {
        if (arg0 != 15) {
            return;
        }
        field4780++;
        for (class38 var2 = (class38) class248.field4296.method1811(2); var2 != null; var2 = (class38) class248.field4296.method1810(false)) {
            if (var2.field642 == arg1) {
                if (var2.field671 != null) {
                    class120.field2228.method1550(var2.field671);
                    var2.field671 = null;
                }
                var2.method1743((byte) 103);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIJZ)Lmb;")
    public static final class96 method1860(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        field4788++;
        class96 var6 = class162.method1178(0, arg1 ^ 0x7E);
        if (arg1 != 1) {
            field4785 = null;
        }
        if (arg3 < 0L) {
            arg3 = -arg3;
            var6.method690(class79.field1342, 0);
        }
        class96 var7 = class202.field3494;
        class96 var8 = class194.field3349;
        if (arg0 == 1) {
            var7 = class194.field3349;
            var8 = class202.field3494;
        }
        if (arg0 == 2) {
            var7 = class194.field3349;
            var8 = class222.field3794;
        }
        class96 var9 = class162.method1178(0, arg1 + 123);
        class96 var10 = class162.method1178(0, arg1 ^ 0x78);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method690(class31.method205((int) (arg3 % 10L), (byte) -78), arg1 ^ 0x1);
            arg3 /= 10L;
        }
        if (arg3 == 0L) {
            var9 = class163.field2895;
        }
        int var12 = 0;
        while (arg3 > 0L) {
            if (arg4 && var12 != 0 && var12 % 3 == 0) {
                var9.method690(var8, 0);
            }
            var12++;
            var9.method690(class31.method205((int) (arg3 % 10L), (byte) -78), 0);
            arg3 /= 10L;
        }
        if (var10.method707(-113) > 0) {
            var10.method690(var7, 0);
        }
        return class36.method289(arg1 - 5616, new class96[] { var6, var9.method699((byte) 7), var10.method699((byte) -33) });
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ltj;IIIIIIZ)V")
    public static final void method1861(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1131.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field1131[var9] - class211.field3646;
            int var23 = arg0.field1121[var9] - class262.field4598;
            int var24 = arg0.field1133[var9] - class21.field350;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1125 != null) {
                class66.field1119[var9] = var25;
                class66.field1132[var9] = var28;
                class66.field1114[var9] = var29;
            }
            class66.field1135[var9] = (var25 << 9) / var29 + class240.field4163;
            class66.field1128[var9] = (var28 << 9) / var29 + class240.field4164;
        }
        class240.field4171 = 0;
        int var10 = arg0.field1122.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field1122[var11];
            int var13 = arg0.field1118[var11];
            int var14 = arg0.field1134[var11];
            int var15 = class66.field1135[var12];
            int var16 = class66.field1135[var13];
            int var17 = class66.field1135[var14];
            int var18 = class66.field1128[var12];
            int var19 = class66.field1128[var13];
            int var20 = class66.field1128[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class269.field4679 && class177.method1265(class265.field4626 + class240.field4163, class62.field1054 + class240.field4164, var18, var19, var20, var15, var16, var17)) {
                    class5.field102 = arg5;
                    class150.field2638 = arg6;
                }
                if (!arg7) {
                    class240.field4173 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class240.field4172 || var16 > class240.field4172 || var17 > class240.field4172) {
                        class240.field4173 = true;
                    }
                    if (arg0.field1125 == null || arg0.field1125[var11] == -1) {
                        if (arg0.field1115[var11] != 12345678) {
                            class240.method1680(var18, var19, var20, var15, var16, var17, arg0.field1115[var11], arg0.field1127[var11], arg0.field1123[var11]);
                        }
                    } else if (!class94.field1550) {
                        int var21 = class240.field4167.method896(arg0.field1125[var11], 0);
                        class240.method1680(var18, var19, var20, var15, var16, var17, class122.method938(var21, arg0.field1115[var11]), class122.method938(var21, arg0.field1127[var11]), class122.method938(var21, arg0.field1123[var11]));
                    } else if (arg0.field1117) {
                        class240.method1694(var18, var19, var20, var15, var16, var17, arg0.field1115[var11], arg0.field1127[var11], arg0.field1123[var11], class66.field1119[0], class66.field1119[1], class66.field1119[3], class66.field1132[0], class66.field1132[1], class66.field1132[3], class66.field1114[0], class66.field1114[1], class66.field1114[3], arg0.field1125[var11]);
                    } else {
                        class240.method1694(var18, var19, var20, var15, var16, var17, arg0.field1115[var11], arg0.field1127[var11], arg0.field1123[var11], class66.field1119[var12], class66.field1119[var13], class66.field1119[var14], class66.field1132[var12], class66.field1132[var13], class66.field1132[var14], class66.field1114[var12], class66.field1114[var13], class66.field1114[var14], arg0.field1125[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method1862(int arg0) {
        if (class20.field335 != null) {
            class20.field335.method543((byte) 48);
        }
        field4757++;
        if (class80.field1362 != null) {
            class80.field1362.method543((byte) 48);
        }
        if (arg0 != 4527) {
            method1861((class66) null, -46, 54, 48, 53, -3, -45, true);
        }
        class10.method78(class22.field386, 2, 22050, arg0 - 36014);
        class20.field335 = class167.method1207(22050, arg0 ^ 0xFFFFBEA1, 0, class234.field4017, class3.field28);
        class20.field335.method542(-102, class11.field191);
        class80.field1362 = class167.method1207(2048, arg0 - 25249, 1, class234.field4017, class3.field28);
        class80.field1362.method542(-118, class120.field2228);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method1863(int arg0) {
        if (arg0 <= 65) {
            field4774 = null;
        }
        field4785 = null;
        field4790 = null;
        field4789 = null;
        field4774 = null;
        field4786 = null;
        field4787 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4774[var0] = var1;
        }
        field4789 = class243.method1708("Loaded textures", (byte) 97);
        field4787 = field4789;
        field4786 = class243.method1708("scrollbar", (byte) 104);
    }
}
