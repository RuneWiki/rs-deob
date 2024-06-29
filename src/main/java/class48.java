import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class48 extends class23 {

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    private int field934 = 1;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    private int field937 = 1;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "[I")
    public static int[] field933 = new int[2000];

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "[Llc;")
    public static class143[] field932 = new class143[100];

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "[[[I")
    public static int[][][] field939 = new int[2][][];

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V")
    public static final void method290(byte arg0) {
        ++field941;
        if (arg0 < -90) {
            class171.field3053.method824(-123);
            class282.field4971.method824(-119);
            class24.field411.method824(-121);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        if (arg1 != 1) {
            method292(-88, 87, (class143) null, (class143) null, (class143) null);
        }
        ++field936;
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int var4 = this.field934 + this.field934 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field937 - -this.field937 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field934; ~(this.field934 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method161(var9 & class79.field1426, 0, 0);
                int var20 = 0;
                int[][] var21 = new int[3][class72.field1359];
                int var22 = 0;
                int[] var23 = var19[0];
                int[] var24 = var19[1];
                int var25 = 0;
                int[] var26 = var19[2];
                for (int var27 = -this.field937; ~var27 >= ~this.field937; ++var27) {
                    int var37 = class172.field3077 & var27;
                    var22 += var24[var37];
                    var25 += var26[var37];
                    var20 += var23[var37];
                }
                int[] var28 = var21[0];
                int[] var29 = var21[2];
                int[] var30 = var21[1];
                int var31 = 0;
                while (~class72.field1359 < ~var31) {
                    var28[var31] = var7 * var20 >> 16;
                    var30[var31] = var7 * var22 >> 16;
                    var29[var31] = var7 * var25 >> 16;
                    int var32 = var31 - this.field937 & class172.field3077;
                    int var33 = var20 - var23[var32];
                    int var34 = var22 - var24[var32];
                    int var35 = var25 - var26[var32];
                    ++var31;
                    int var36 = class172.field3077 & this.field937 + var31;
                    var25 = var26[var36] + var35;
                    var22 = var24[var36] + var34;
                    var20 = var23[var36] + var33;
                }
                var8[this.field934 + var9 - arg0] = var21;
            }
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            int[] var12 = var3[0];
            for (int var13 = 0; var13 < class72.field1359; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var12[var13] = var5 * var14 >> 16;
                var10[var13] = var5 * var15 >> 16;
                var11[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(BI)I")
    public static final int method291(byte arg0, int arg1) {
        class149 var2 = class49.method300(arg0 ^ -41, arg1);
        ++field931;
        int var3 = var2.field2750;
        int var4 = var2.field2737;
        if (arg0 != -43) {
            return -52;
        } else {
            int var5 = var2.field2738;
            int var6 = class13.field238[var5 - var4];
            return var6 & class148.field2691[var3] >> var4;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILlc;Llc;Llc;)V")
    public static final void method292(int arg0, int arg1, class143 arg2, class143 arg3, class143 arg4) {
        ++field930;
        class173.method1135(arg1, arg1 ^ -4, arg0, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class48() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field937 = 94;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field373 = arg0.method1265(124) == 1;
                }
            } else {
                this.field934 = arg0.method1265(126);
            }
        } else {
            this.field937 = arg0.method1265(120);
        }
        ++field942;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field940;
        if (arg0 > -13) {
            return null;
        } else {
            int[] var3 = super.field369.method306(arg1, -23179);
            if (super.field369.field1005) {
                int var4 = this.field934 + 1 + this.field934;
                int var5 = 65536 / var4;
                int var6 = this.field937 - -this.field937 - -1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field934 + arg1; this.field934 + arg1 >= var9; ++var9) {
                    int[] var13 = this.method155(var9 & class79.field1426, (byte) 82, 0);
                    int[] var14 = new int[class72.field1359];
                    int var15 = 0;
                    for (int var16 = -this.field937; ~var16 >= ~this.field937; ++var16) {
                        var15 += var13[var16 & class172.field3077];
                    }
                    int var17 = 0;
                    while (~class72.field1359 < ~var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[-this.field937 + var17 & class172.field3077];
                        ++var17;
                        var15 = var13[this.field937 + var17 & class172.field3077] + var18;
                    }
                    var8[-arg1 + var9 + this.field934] = var14;
                }
                for (int var10 = 0; class72.field1359 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var4 < ~var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)Lqh;")
    public static final class263 method293(int arg0, byte arg1) {
        ++field938;
        class263 var2 = (class263) class39.field680.method826((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class6.field94.method41(-18328, 0, arg0);
            class263 var4 = new class263();
            if (var3 != null) {
                var4.method1748(8, new class190(var3));
            }
            var4.method1749(-95);
            int var5 = 110 % ((arg1 - -1) / 42);
            class39.field680.method827(-3, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
    public static void method294(int arg0) {
        field933 = null;
        field939 = null;
        field932 = null;
        if (arg0 != 1) {
            method294(91);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V")
    public static final void method295(int arg0, int arg1, int arg2) {
        ++field935;
        class191 var3 = class130.field2306[class170.field3044][arg0][arg1];
        if (var3 == null) {
            class11.method94(class170.field3044, arg0, arg1);
        } else {
            int var4 = -99999999;
            class21 var5 = null;
            for (class21 var6 = (class21) var3.method1294(false); var6 != null; var6 = (class21) var3.method1292((byte) 80)) {
                class148 var13 = class262.method1743(var6.field332.field4629, arg2 + 17238);
                int var14 = var13.field2730;
                if (var13.field2693 == 1) {
                    var14 = (var6.field332.field4621 + 1) * var14;
                }
                if (var14 > var4) {
                    var4 = var14;
                    var5 = var6;
                }
            }
            if (var5 == null) {
                class11.method94(class170.field3044, arg0, arg1);
            } else {
                var3.method1297((byte) 23, var5);
                class257 var7 = null;
                class21 var8 = (class21) var3.method1294(false);
                class257 var9 = null;
                while (var8 != null) {
                    class257 var12 = var8.field332;
                    if (~var5.field332.field4629 != ~var12.field4629) {
                        if (var7 == null) {
                            var7 = var12;
                        }
                        if (var7.field4629 != var12.field4629 && var9 == null) {
                            var9 = var12;
                        }
                    }
                    var8 = (class21) var3.method1292((byte) 119);
                }
                long var10 = (long) (arg0 - -(arg1 << 7) - -1610612736);
                class75.method433(class170.field3044, arg0, arg1, class20.method140(arg0 * arg2 + 64, 119, arg1 * 128 + 64, class170.field3044), var5.field332, var10, var7, var9);
            }
        }
    }
}
