import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class485 extends class11 {

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    private int field7089 = 1;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    private int field7091 = 1;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "[I")
    public static int[] field7092 = new int[2];

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
    public static int[] field7084 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "Lya;")
    public static class38 field7085;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
    public static int[] field7080;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "[I")
    public static int[] field7088;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "[[[Lhg;")
    public static class486[][][] field7086;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field7082;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int var4 = this.field7089 + this.field7089 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field7091 + this.field7091 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field7089; this.field7089 + arg1 >= var9; ++var9) {
                int[] var13 = this.method48(var9 & class183.field2683, 0, (byte) -85);
                int[] var14 = new int[class90.field1316];
                int var15 = 0;
                for (int var16 = -this.field7091; ~this.field7091 <= ~var16; ++var16) {
                    var15 += var13[var16 & class99.field1490];
                }
                int var17 = 0;
                while (~class90.field1316 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field7091 + var17 & class99.field1490];
                    ++var17;
                    var15 = var13[class99.field1490 & var17 - -this.field7091] + var18;
                }
                var8[-arg1 + this.field7089 + var9] = var14;
            }
            for (int var10 = 0; class90.field1316 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg0 > -42) {
            this.field7091 = -105;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI[B)[B")
    public static final byte[] method2850(byte arg0, int arg1, byte[] arg2) {
        int var3 = -71 / ((3 - arg0) / 36);
        ++field7083;
        byte[] var4 = new byte[arg1];
        class91.method678(arg2, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 >= -40) {
            method2850((byte) 43, -117, (byte[]) null);
        }
        ++field7093;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field167 = arg0.method2348(-2) == 1;
                }
            } else {
                this.field7089 = arg0.method2348(-2);
            }
        } else {
            this.field7091 = arg0.method2348(-2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V")
    public static final void method2851(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field7114 != null) {
                var3.field7114 = null;
            }
            if (var3.field7118 != null) {
                var3.field7118 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZII)I")
    public static final int method2852(int arg0, boolean arg1, int arg2, int arg3) {
        ++field7081;
        if (~arg0 == ~arg2) {
            return arg0;
        } else if (!arg1) {
            return -102;
        } else {
            int var4 = 128 - arg3;
            int var5 = (arg0 & 127) * var4 + (127 & arg2) * arg3 >> 7;
            int var6 = (arg0 & 896) * var4 - -((896 & arg2) * arg3) >> 7;
            int var7 = (arg0 & 64512) * var4 + (64512 & arg2) * arg3 >> 7;
            return 127 & var5 | var7 & 64512 | 896 & var6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
    public static final void method2853(int arg0, String arg1, byte arg2, String arg3) {
        class360.field5257 = arg0;
        ++field7087;
        class491.field7167 = arg1;
        class115.field1720 = arg3;
        if (!class491.field7167.equals("") && !class115.field1720.equals("")) {
            if (class316.field4329 != -1) {
                class226.method1399((byte) 13);
            } else {
                class489.field7144 = 1;
                if (arg2 > -69) {
                    field7086 = null;
                }
                class154.field2357 = -3;
                class526.field7782 = 0;
                class447.field6582 = 0;
                class391 var4 = new class391(128);
                var4.method2302(-4, 10);
                var4.method2359((int) (Math.random() * 9.9999999E7D), -113);
                var4.method2303(class506.method3021(-1453, class491.field7167), (byte) -28);
                var4.method2359((int) (Math.random() * 9.9999999E7D), -86);
                var4.method2349(class115.field1720, true);
                var4.method2359((int) (9.9999999E7D * Math.random()), -116);
                var4.method2363(class474.field6926, (byte) -74, class120.field1776);
                class481.field7027.field5719 = 0;
                class481.field7027.method2302(-4, class141.field2025.field311);
                class481.field7027.method2302(-4, var4.field5719 + 2);
                class481.field7027.method2355(1686288168, 591);
                class481.field7027.method2315(4, var4.field5719, var4.field5678, 0);
            }
        } else {
            class154.field2357 = 3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class485() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lya;)V")
    public static final void method2854(class38 arg0) {
        for (int var1 = class354.field5189; var1 < class253.field3523; ++var1) {
            for (int var2 = 0; var2 < class206.field2881; ++var2) {
                for (int var3 = 0; var3 < class371.field5427; ++var3) {
                    class486 var4 = class89.field1305[var1][var2][var3];
                    if (var4 != null) {
                        class90 var5 = var4.field7114;
                        class90 var6 = var4.field7118;
                        if (var5 != null && var5.method492(-1)) {
                            class291.method1730(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method492(-1)) {
                                class291.method1730(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method498(arg0, 0, false, var5, 0, 0, -1);
                                var6.method495(-124);
                            }
                            var5.method495(-113);
                        }
                        for (class164 var7 = var4.field7115; var7 != null; var7 = var7.field2467) {
                            class116 var9 = var7.field2468;
                            if (var9 != null && var9.method492(-1)) {
                                class291.method1730(arg0, var9, var1, var2, var3, var9.field1736 - var9.field1729 + 1, var9.field1742 - var9.field1730 + 1);
                                var9.method495(-105);
                            }
                        }
                        class117 var8 = var4.field7100;
                        if (var8 != null && var8.method492(-1)) {
                            class89.method670(arg0, var8, var1, var2, var3);
                            var8.method495(-120);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
    public static void method2855(int arg0) {
        if (arg0 == -16450) {
            field7084 = null;
            field7080 = null;
            field7086 = null;
            field7092 = null;
            field7085 = null;
            field7088 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        ++field7090;
        int[][] var3 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int var4 = this.field7089 + this.field7089 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field7091 + 1 + this.field7091;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field7089 + arg1; var9 <= this.field7089 + arg1; ++var9) {
                int[][] var19 = this.method49(var9 & class183.field2683, 0, 114);
                int[][] var20 = new int[3][class90.field1316];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field7091; ~var27 >= ~this.field7091; ++var27) {
                    int var37 = var27 & class99.field1490;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class90.field1316 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field7091 & class99.field1490;
                    int var33 = var22 - var25[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var23 - var26[var32];
                    ++var31;
                    int var36 = this.field7091 + var31 & class99.field1490;
                    var21 = var24[var36] + var34;
                    var22 = var25[var36] + var33;
                    var23 = var26[var36] + var35;
                }
                var8[var9 - (-this.field7089 - -arg1)] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class90.field1316; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        int var38 = -39 % ((-75 - arg0) / 49);
        return var3;
    }
}
