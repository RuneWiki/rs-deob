import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class193 extends class200 {

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
    private int field3459 = 1;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    private int field3451 = 1;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "Lid;")
    public static class149 field3452 = class60.method382("Starte 3D)2Softwarebibliothek)3", (byte) 91);

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "Lgk;")
    public static class157 field3456 = new class157();

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "Lid;")
    public static class149 field3462 = class60.method382(" ", (byte) 96);

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "Lal;")
    public static class230 field3461;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    public static void method1308(int arg0) {
        field3461 = null;
        field3452 = null;
        field3456 = null;
        if (arg0 == 0) {
            field3462 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lid;B)I")
    public static final int method1309(class149 arg0, byte arg1) {
        ++field3454;
        if (class168.field3120 != null && arg0.method1053((byte) -105) != 0) {
            if (arg1 < 85) {
                return -22;
            } else {
                for (int var2 = 0; ~var2 > ~class168.field3120.field4965; ++var2) {
                    if (class168.field3120.field4967[var2].method1030(class166.field3091, true, class86.field1566).method1041((byte) -109, arg0)) {
                        return var2;
                    }
                }
                return -1;
            }
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        int[][] var3 = super.field3632.method965(arg1, 82);
        if (!arg0) {
            this.field3451 = 21;
        }
        ++field3457;
        if (super.field3632.field2550) {
            int var4 = this.field3451 - -this.field3451 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3459 - -1 + this.field3459;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field3451; var9 <= this.field3451 + arg1; ++var9) {
                int[][] var19 = this.method1366(var9 & class191.field3436, false, 0);
                int[][] var20 = new int[3][class137.field2515];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[1];
                int[] var25 = var19[0];
                int[] var26 = var19[2];
                for (int var27 = -this.field3459; ~var27 >= ~this.field3459; ++var27) {
                    int var37 = class261.field4667 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[2];
                int[] var30 = var20[1];
                int var31 = 0;
                while (~class137.field2515 < ~var31) {
                    var28[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var23 >> 16;
                    int var32 = -this.field3459 + var31 & class261.field4667;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    ++var31;
                    int var35 = var23 - var26[var32];
                    int var36 = var31 - -this.field3459 & class261.field4667;
                    var23 = var26[var36] + var35;
                    var21 = var24[var36] + var33;
                    var22 = var25[var36] + var34;
                }
                var8[this.field3451 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class137.field2515 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)I")
    public static final int method1310(boolean arg0) {
        if (!arg0) {
            method1309((class149) null, (byte) -115);
        }
        ++field3463;
        return 15;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
    public static final void method1311(int arg0) {
        if (arg0 != 17819) {
            method1311(2);
        }
        for (class259 var1 = (class259) class85.field1550.method1140(0); var1 != null; var1 = (class259) class85.field1550.method1127(0)) {
            if (var1.field4530) {
                var1.method1784(arg0 ^ -17897);
            }
        }
        ++field3460;
        for (class259 var2 = (class259) class259.field4524.method1140(0); var2 != null; var2 = (class259) class259.field4524.method1127(0)) {
            if (var2.field4530) {
                var2.method1784(93);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field3458;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int var4 = this.field3451 + this.field3451 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3459 - -this.field3459 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field3451; var9 <= this.field3451 + arg0; ++var9) {
                int var13 = 0;
                int[] var14 = this.method1368(0, class191.field3436 & var9, false);
                for (int var15 = -this.field3459; ~var15 >= ~this.field3459; ++var15) {
                    var13 += var14[class261.field4667 & var15];
                }
                int[] var16 = new int[class137.field2515];
                int var17 = 0;
                while (var17 < class137.field2515) {
                    var16[var17] = var7 * var13 >> 16;
                    int var18 = var13 - var14[class261.field4667 & var17 - this.field3459];
                    ++var17;
                    var13 = var14[this.field3459 + var17 & class261.field4667] + var18;
                }
                var8[var9 - (-this.field3451 - -arg0)] = var16;
            }
            for (int var10 = 0; class137.field2515 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg1 != 55) {
            field3462 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V")
    public static final void method1312(byte arg0) {
        int var1 = class240.field4194;
        int var2 = class228.field3996;
        ++field3455;
        int var3 = class82.field1499;
        int var4 = client.field2845;
        if (class246.field4320 == null || class106.field1842 == null) {
            if (class270.field4864.method1556(class92.field1635, true) && class270.field4864.method1556(class277.field4947, true)) {
                class246.field4320 = class156.method1125(0, class270.field4864, false, class92.field1635);
                class106.field1842 = class156.method1125(0, class270.field4864, false, class277.field4947);
            } else {
                class72.method462(var1, var2, var3, 20, class25.field380, 256 - class236.field4145);
            }
        }
        if (arg0 != -18) {
            field3456 = null;
        }
        if (class246.field4320 != null && class106.field1842 != null) {
            int var5 = var3 / class246.field4320.field3399;
            for (int var6 = 0; ~var5 < ~var6; ++var6) {
                class246.field4320.method263(class246.field4320.field3399 * var6 + var1, var2);
            }
            class106.field1842.method263(var1, var2);
            class106.field1842.method266(var1 + var3 + -class106.field1842.field3399, var2);
        }
        class173.field3180.method1168(class198.field3603, var1 + 3, var2 + 14, class129.field2287, -1);
        class72.method462(var1, var2 + 20, var3, var4 - 20, class25.field380, -class236.field4145 + 256);
        int var7 = class49.field883;
        int var8 = class285.field5068;
        for (int var9 = 0; var9 < class60.field1092; ++var9) {
            int var17 = var2 - (-35 - (class60.field1092 + -1 + -var9) * 15);
            if (var1 < var7 && ~var7 > ~(var1 + var3) && var17 + -13 < var8 && var17 + 3 > var8) {
                class72.method462(var1, var17 + -13, var3, 16, class283.field5006, -class175.field3217 + 256);
            }
        }
        if ((class248.field4347 == null || class231.field4069 == null || class133.field2420 == null) && class270.field4864.method1556(class122.field2156, true) && class270.field4864.method1556(class54.field969, true) && class270.field4864.method1556(class186.field3353, true)) {
            class248.field4347 = class156.method1125(0, class270.field4864, false, class122.field2156);
            class231.field4069 = class156.method1125(0, class270.field4864, false, class54.field969);
            class133.field2420 = class156.method1125(0, class270.field4864, false, class186.field3353);
        }
        if (class248.field4347 != null && class231.field4069 != null && class133.field2420 != null) {
            int var10 = var3 / class248.field4347.field3399;
            for (int var11 = 0; var10 > var11; ++var11) {
                class248.field4347.method263(class248.field4347.field3399 * var11 + var1, var2 - -var4 + -class248.field4347.field3398);
            }
            int var12 = (var4 + -20) / class231.field4069.field3398;
            for (int var13 = 0; var12 > var13; ++var13) {
                class231.field4069.method263(var1, class231.field4069.field3398 * var13 + var2 + 20);
                class231.field4069.method266(var1 + var3 + -class231.field4069.field3399, class231.field4069.field3398 * var13 + var2 + 20);
            }
            class133.field2420.method263(var1, var2 - -var4 + -class133.field2420.field3398);
            class133.field2420.method266(var1 + var3 + -class133.field2420.field3399, -class133.field2420.field3398 + var4 + var2);
        }
        for (int var14 = 0; ~class60.field1092 < ~var14; ++var14) {
            int var15 = (-var14 + class60.field1092 - 1) * 15 + var2 + 35;
            int var16 = class129.field2287;
            if (var7 > var1 && ~(var1 + var3) < ~var7 && var8 > var15 + -13 && var15 + 3 > var8) {
                var16 = class155.field2838;
            }
            class173.field3180.method1168(class59.method365(var14, (byte) 112), var1 + 3, var15, var16, 0);
        }
        class44.method257(class228.field3996, client.field2845, class82.field1499, arg0 + -338, class240.field4194);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field3453;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field3641 = ~arg0.method489((byte) -118) == -2;
                }
            } else {
                this.field3451 = arg0.method489((byte) -48);
            }
        } else {
            this.field3459 = arg0.method489((byte) 121);
        }
        if (!arg1) {
            this.method26(-64, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class193() {
        super(1, false);
    }
}
