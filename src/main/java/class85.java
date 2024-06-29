import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class85 extends class185 {

    @OriginalMember(owner = "client!b", name = "T", descriptor = "Z")
    private boolean field1363 = true;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "Z")
    private boolean field1369 = true;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "Z")
    public static boolean field1354 = false;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field1355 = -1;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field1366 = 0;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field1367 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "Lll;")
    public static class211 field1359;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "[I")
    public static int[] field1356;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method556(int arg0, String arg1) {
        ++field1362;
        if (class184.field2779 != null) {
            int var2 = 0;
            long var3 = class94.method604((byte) 84, arg1);
            if (~var3 != -1L) {
                while (~class184.field2779.length < ~var2 && ~class184.field2779[var2].field1321 != ~var3) {
                    ++var2;
                }
                if (~var2 > ~class184.field2779.length && class184.field2779[var2] != null) {
                    ++class98.field1545;
                    class196.field2979.method1106(arg0, false);
                    class196.field2979.method1610(791715792, class184.field2779[var2].field1321);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
    public static final void method557(byte arg0) {
        ++field1364;
        if (~field1355 != 0 && class293.field4618 != -1) {
            int var1 = ((-class166.field2558 + class243.field3642) * class52.field841 >> 16) + class166.field2558;
            class52.field841 += var1;
            if (class52.field841 >= 65535) {
                if (class250.field3810) {
                    class158.field2436 = false;
                } else {
                    class158.field2436 = true;
                }
                class52.field841 = 65535;
                class250.field3810 = true;
            } else {
                class158.field2436 = false;
                class250.field3810 = false;
            }
            float var2 = (float) class52.field841 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class255.field3877 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class217.field3270[field1355][var4 + 1][var5] * 3;
                int var22 = class217.field3270[field1355][var4][var5] * 3;
                int var23 = class217.field3270[field1355][var4][var5];
                int var24 = (class217.field3270[field1355][var4 + 2][var5] + -class217.field3270[field1355][var4 + 3][var5] + class217.field3270[field1355][var4 + 2][var5]) * 3;
                int var25 = var22 - var21 * 2 + var24;
                int var26 = -var22 + var21;
                int var27 = class217.field3270[field1355][var4 + 2][var5] + var21 + -var23 + -var24;
                var3[var5] = (((float) var27 * var2 + (float) var25) * var2 + (float) var26) * var2 + (float) var23;
            }
            class128.field1922 = (int) var3[0] - class81.field1303 * 128;
            class47.field763 = (int) var3[2] + -(class147.field2141 * 128);
            class213.field3184 = (int) var3[1] * -1;
            int var6 = class184.field2791 * 2;
            float[] var7 = new float[3];
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class217.field3270[class293.field4618][var6][var8] * 3;
                int var15 = class217.field3270[class293.field4618][var6 + 1][var8] * 3;
                int var16 = (class217.field3270[class293.field4618][var6 + 2][var8] + -class217.field3270[class293.field4618][var6 + 3][var8] + class217.field3270[class293.field4618][var6 + 2][var8]) * 3;
                int var17 = var15 - var14;
                int var18 = class217.field3270[class293.field4618][var6][var8];
                int var19 = -(var15 * 2) + var16 + var14;
                int var20 = class217.field3270[class293.field4618][var6 + 2][var8] + -var18 + -var16 + var15;
                var7[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var17) * var2 + (float) var18;
            }
            float var9 = var7[0] + -var3[0];
            float var10 = var7[2] + -var3[2];
            if (arg0 == 44) {
                float var11 = (var7[1] - var3[1]) * -1.0F;
                double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
                class243.field3636 = (float) Math.atan2((double) var11, var12);
                class120.field1811 = -((float) Math.atan2((double) var9, (double) var10));
                class272.field4088 = 2047 & (int) ((double) class120.field1811 * 325.949D);
                class259.field3949 = (int) ((double) class243.field3636 * 325.949D) & 2047;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field1368;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2814 = arg1.method1593((byte) 27) == 1;
                }
            } else {
                this.field1363 = arg1.method1593((byte) 27) == 1;
            }
        } else {
            this.field1369 = arg1.method1593((byte) 27) == 1;
        }
        if (arg2 != -6357) {
            method560(-103, (int[]) null, 107, (int[]) null, (byte) -9);
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(B)V")
    public static final void method558(byte arg0) {
        ++field1357;
        if (!class259.field3951) {
            if (arg0 == -28) {
                class259.field3951 = true;
                class177.field2722 = true;
                if (!class195.field2970) {
                    class252.field3828 += (-24.0F - class252.field3828) / 2.0F;
                } else {
                    class84.field1336 = (float) ((int) class84.field1336 + -65 & -128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(B)V")
    public static void method559(byte arg0) {
        if (arg0 != -112) {
            field1356 = null;
        }
        field1356 = null;
        field1359 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 < 70) {
            field1356 = null;
        }
        ++field1353;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int[] var4 = this.method1146((byte) 125, !this.field1363 ? arg0 : class10.field133 - arg0, 0);
            if (!this.field1369) {
                class193.method1208(var4, 0, var3, 0, class174.field2648);
            } else {
                for (int var5 = 0; var5 < class174.field2648; ++var5) {
                    var3[var5] = var4[-var5 + class53.field873];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field1365;
            int[][] var3 = super.field2802.method753(1, arg1);
            if (super.field2802.field1807) {
                int[][] var4 = this.method1152(false, 0, !this.field1363 ? arg1 : -arg1 + class10.field133);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                if (this.field1369) {
                    for (int var11 = 0; ~var11 > ~class174.field2648; ++var11) {
                        var10[var11] = var5[-var11 + class53.field873];
                        var8[var11] = var7[-var11 + class53.field873];
                        var9[var11] = var6[-var11 + class53.field873];
                    }
                } else {
                    for (int var12 = 0; class174.field2648 > var12; ++var12) {
                        var10[var12] = var5[var12];
                        var8[var12] = var7[var12];
                        var9[var12] = var6[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[II[IB)V")
    public static final void method560(int arg0, int[] arg1, int arg2, int[] arg3, byte arg4) {
        if (arg2 < arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var6;
            int var7 = arg2;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; ++var9) {
                if ((var9 & 1) + var6 < arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7++] = var11;
                }
            }
            arg1[arg0] = arg1[var7];
            arg1[var7] = var6;
            arg3[arg0] = arg3[var7];
            arg3[var7] = var8;
            method560(var7 + -1, arg1, arg2, arg3, (byte) -103);
            method560(arg0, arg1, var7 + 1, arg3, (byte) -103);
        }
        ++field1361;
        if (arg4 != -103) {
            method558((byte) -10);
        }
    }
}
