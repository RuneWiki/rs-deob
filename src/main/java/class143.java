import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class143 extends class53 {

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    private int field2473 = 1;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    private int field2461 = 1;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field2463 = 0;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "Lwa;")
    private static class75 field2466 = class66.method560("glow2:", false);

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "Lwa;")
    public static class75 field2462 = class66.method560(":duelstake:", false);

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "Lwa;")
    public static class75 field2465 = field2466;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "Lwa;")
    public static class75 field2475 = class66.method560("Clientscript error in: ", false);

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "[I")
    public static int[] field2464 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Lwa;")
    public static class75 field2470 = class66.method560("Lade Texturen )2 ", false);

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lwa;")
    public static class75 field2476 = class66.method560("http:)4)4", false);

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "Lwa;")
    public static class75 field2477 = class66.method560("sl_back", false);

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "Lwa;")
    public static class75 field2479 = field2466;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILja;Z)V", line = 29)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field2461 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field2473 = arg1.method501(0);
        } else if (arg0 == 2) {
            this.field880 = arg1.method501(0) == 1;
        }
        if (!arg2) {
            method1106(-96, -102);
        }
        field2468++;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V", line = 70)
    public static void method1105(int arg0) {
        field2479 = null;
        field2476 = null;
        field2465 = null;
        field2475 = null;
        field2462 = null;
        field2464 = null;
        field2466 = null;
        field2477 = null;
        if (arg0 != -1) {
            field2471 = -28;
        }
        field2470 = null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 114)
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[[I", line = 121)
    public final int[][] method66(int arg0, int arg1) {
        int var3 = -72 / ((arg1 - 76) / 42);
        field2478++;
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int var5 = this.field2473 + this.field2473 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field2461 + this.field2461 + 1;
            int[][][] var8 = new int[var5][][];
            int var9 = 65536 / var7;
            for (int var10 = arg0 - this.field2473; var10 <= this.field2473 + arg0; var10++) {
                int[][] var11 = this.method388(119, 0, var10 & class3.field31);
                int[][] var12 = new int[3][class269.field4644];
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int[] var16 = var11[1];
                int[] var17 = var11[2];
                int[] var18 = var11[0];
                for (int var19 = -this.field2461; var19 <= this.field2461; var19++) {
                    int var20 = class157.field2697 & var19;
                    var14 += var16[var20];
                    var15 += var17[var20];
                    var13 += var18[var20];
                }
                int[] var21 = var12[0];
                int[] var22 = var12[1];
                int[] var23 = var12[2];
                int var24 = 0;
                while (class269.field4644 > var24) {
                    var21[var24] = var9 * var13 >> 16;
                    var22[var24] = var9 * var14 >> 16;
                    var23[var24] = var9 * var15 >> 16;
                    int var25 = class157.field2697 & var24 - this.field2461;
                    int var26 = var15 - var17[var25];
                    int var27 = var14 - var16[var25];
                    var24++;
                    int var28 = var13 - var18[var25];
                    int var29 = this.field2461 + var24 & class157.field2697;
                    var13 = var18[var29] + var28;
                    var15 = var17[var29] + var26;
                    var14 = var16[var29] + var27;
                }
                var8[var10 + this.field2473 - arg0] = var12;
            }
            int[] var30 = var4[1];
            int[] var31 = var4[0];
            int[] var32 = var4[2];
            for (int var33 = 0; var33 < class269.field4644; var33++) {
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = 0; var37 < var5; var37++) {
                    int[][] var38 = var8[var37];
                    var36 += var38[1][var33];
                    var34 += var38[0][var33];
                    var35 += var38[2][var33];
                }
                var31[var33] = var6 * var34 >> 16;
                var30[var33] = var6 * var36 >> 16;
                var32[var33] = var6 * var35 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)Lnk;", line = 255)
    public static final class12 method1106(int arg0, int arg1) {
        field2467++;
        class12 var2 = (class12) class249.field4190.method1514(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = -22 % ((67 - arg0) / 33);
        byte[] var4 = class97.field1599.method1911(5, arg1, -44);
        class12 var5 = new class12();
        if (var4 != null) {
            var5.method65(new class60(var4), -50);
        }
        class249.field4190.method1509((long) arg1, var5, -1);
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)[I", line = 284)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            return (int[]) null;
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 122);
        field2469++;
        if (this.field878.field3749) {
            int var4 = this.field2473 + this.field2473 + 1;
            int var5 = 65536 / var4;
            int[][] var6 = new int[var4][];
            int var7 = this.field2461 + this.field2461 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg1 - this.field2473; var9 <= arg1 + this.field2473; var9++) {
                int[] var10 = this.method391(0, 0, var9 & class3.field31);
                int var11 = 0;
                for (int var12 = -this.field2461; var12 <= this.field2461; var12++) {
                    var11 += var10[var12 & class157.field2697];
                }
                int[] var13 = new int[class269.field4644];
                int var14 = 0;
                while (class269.field4644 > var14) {
                    var13[var14] = var8 * var11 >> 16;
                    int var15 = var11 - var10[var14 - this.field2461 & class157.field2697];
                    var14++;
                    var11 = var10[class157.field2697 & this.field2461 + var14] + var15;
                }
                var6[this.field2473 + var9 - arg1] = var13;
            }
            for (int var16 = 0; var16 < class269.field4644; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var6[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V", line = 368)
    public static final void method1107(int arg0) {
        class32 var1 = class13.field171;
        synchronized (class13.field171) {
            class145.field2499++;
            class190.field3172 = class195.field3279;
            if (class130.field2247 >= 0) {
                while (class178.field3007 != class130.field2247) {
                    int var2 = class97.field1602[class178.field3007];
                    class178.field3007 = class178.field3007 + 1 & 0x7F;
                    if (var2 < 0) {
                        class163.field2767[~var2] = false;
                    } else {
                        class163.field2767[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class163.field2767[var3] = false;
                }
                class130.field2247 = class178.field3007;
            }
            if (arg0 < 49) {
                method1107(36);
            }
            class195.field3279 = class265.field4576;
        }
        field2474++;
    }
}
