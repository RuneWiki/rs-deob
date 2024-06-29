import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class261 extends class114 {

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    private int field4209 = 4096;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
    public static int[] field4198 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field4204 = 0;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field4206 = 0;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field4208 = 1;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lgh;")
    public static class33 field4201;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "[I")
    public static int[] field4205;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "[I")
    public static int[] field4207;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            this.field4209 = -84;
        }
        ++field4202;
        int[] var3 = super.field1630.method302(arg0, -106);
        if (super.field1630.field710) {
            int[] var4 = this.method729(class134.field1840 & arg0 + -1, 0, 0);
            int[] var5 = this.method729(arg0, 0, 0);
            int[] var6 = this.method729(arg0 + 1 & class134.field1840, 0, 0);
            for (int var7 = 0; var7 < class145.field2009; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4209;
                int var9 = (var5[class309.field4977 & var7 + 1] + -var5[var7 + -1 & class309.field4977]) * this.field4209;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 - -4096 + var12) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
    public static void method1699(int arg0) {
        field4207 = null;
        field4198 = null;
        if (arg0 != -8436) {
            field4198 = null;
        }
        field4205 = null;
        field4201 = null;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)Z")
    public static final boolean method1700(byte arg0) {
        ++field4200;
        try {
            if (arg0 >= 0) {
                field4205 = null;
            }
            return class192.method1214(0);
        } catch (IOException var4) {
            class260.method1698(89);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class108.field1546 + "," + class54.field776 + "," + class154.field2138 + " - " + class114.field1632 + "," + (class250.field3905.field4143[0] + class228.field3570) + "," + (class250.field3905.field4053[0] + class170.field2421) + " - ";
            for (int var3 = 0; ~class114.field1632 < ~var3 && var3 < 50; ++var3) {
                var2 = var2 + class131.field1830.field3287[var3] + ",";
            }
            class121.method780(160, var2, var5);
            class248.method1621(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 != 12953) {
            this.method13((class215) null, -63, -90);
        }
        ++field4203;
        if (~arg1 == -1) {
            this.field4209 = arg0.method1379(arg2 ^ -13012);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZIIIIZIIIIII)V")
    public static final void method1701(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var36 = 0; ~var36 > -105; ++var36) {
                class238.field3693[var12][var36] = 0;
                class106.field1517[var12][var36] = 99999999;
            }
        }
        class238.field3693[arg6][arg9] = 99;
        class106.field1517[arg6][arg9] = 0;
        ++field4199;
        int var13 = arg6;
        byte var14 = 0;
        int var15 = arg9;
        int var16 = 0;
        class23.field357[var14] = arg6;
        int var37 = var14 + 1;
        class301.field4784[var14] = arg9;
        int[][] var17 = class156.field2153[class166.field2364].field3204;
        boolean var18 = false;
        label313: while (var37 != var16) {
            var15 = class301.field4784[var16];
            var13 = class23.field357[var16];
            var16 = var16 + 1 & 4095;
            if (arg10 == var13 && ~arg2 == ~var15) {
                var18 = true;
                break;
            }
            if (~arg7 != -1) {
                if ((arg7 < 5 || ~arg7 == -11) && class156.field2153[class166.field2364].method1328(63, arg2, arg7 + -1, arg10, arg4, var15, arg11, var13)) {
                    var18 = true;
                    break;
                }
                if (~arg7 > -11 && class156.field2153[class166.field2364].method1329(arg11, arg2, var15, (byte) -127, arg10, var13, arg7 + -1, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (~arg1 != -1 && ~arg3 != -1 && class156.field2153[class166.field2364].method1337((byte) -110, arg1, var13, var15, arg10, arg4, arg8, arg3, arg2)) {
                var18 = true;
                break;
            }
            int var27 = class106.field1517[var13][var15] + 1;
            if (~var13 < -1 && ~class238.field3693[var13 - 1][var15] == -1 && (2883854 & var17[var13 + -1][var15]) == 0 && (var17[var13 + -1][arg4 + var15 + -1] & 2883896) == 0) {
                int var28 = 1;
                while (true) {
                    if (~var28 <= ~(arg4 + -1)) {
                        class23.field357[var37] = var13 - 1;
                        class301.field4784[var37] = var15;
                        class238.field3693[var13 + -1][var15] = 2;
                        var37 = var37 + 1 & 4095;
                        class106.field1517[var13 + -1][var15] = var27;
                        break;
                    }
                    if ((2883902 & var17[var13 + -1][var15 - -var28]) != 0) {
                        break;
                    }
                    ++var28;
                }
            }
            if (~var13 > -103 && class238.field3693[var13 + 1][var15] == 0 && ~(var17[arg4 + var13][var15] & 2883971) == -1 && ~(var17[var13 - -arg4][var15 - (-arg4 - -1)] & 2884064) == -1) {
                int var29 = 1;
                while (true) {
                    if (~var29 <= ~(arg4 + -1)) {
                        class23.field357[var37] = var13 + 1;
                        class301.field4784[var37] = var15;
                        var37 = var37 + 1 & 4095;
                        class238.field3693[var13 - -1][var15] = 8;
                        class106.field1517[var13 - -1][var15] = var27;
                        break;
                    }
                    if ((var17[arg4 + var13][var15 + var29] & 2884067) != 0) {
                        break;
                    }
                    ++var29;
                }
            }
            if (var15 > 0 && ~class238.field3693[var13][var15 + -1] == -1 && (var17[var13][var15 + -1] & 2883854) == 0 && (2883971 & var17[var13 - (-arg4 + 1)][var15 - 1]) == 0) {
                int var30 = 1;
                while (true) {
                    if (var30 >= arg4 + -1) {
                        class23.field357[var37] = var13;
                        class301.field4784[var37] = var15 + -1;
                        class238.field3693[var13][var15 + -1] = 1;
                        var37 = 4095 & var37 + 1;
                        class106.field1517[var13][var15 + -1] = var27;
                        break;
                    }
                    if (~(var17[var13 + var30][var15 + -1] & 2883983) != -1) {
                        break;
                    }
                    ++var30;
                }
            }
            if (~var15 > -103 && ~class238.field3693[var13][var15 - -1] == -1 && ~(2883896 & var17[var13][arg4 + var15]) == -1 && (2884064 & var17[arg4 + -1 + var13][arg4 + var15]) == 0) {
                int var31 = 1;
                while (true) {
                    if (arg4 + -1 <= var31) {
                        class23.field357[var37] = var13;
                        class301.field4784[var37] = var15 + 1;
                        class238.field3693[var13][var15 + 1] = 4;
                        class106.field1517[var13][var15 + 1] = var27;
                        var37 = var37 - -1 & 4095;
                        break;
                    }
                    if (~(2884088 & var17[var13 + var31][arg4 + var15]) != -1) {
                        break;
                    }
                    ++var31;
                }
            }
            if (~var13 < -1 && var15 > 0 && ~class238.field3693[var13 + -1][var15 + -1] == -1 && ~(2883854 & var17[var13 - 1][var15 + -1]) == -1) {
                int var32 = 1;
                while (true) {
                    if (~arg4 >= ~var32) {
                        class23.field357[var37] = var13 + -1;
                        class301.field4784[var37] = var15 - 1;
                        var37 = var37 + 1 & 4095;
                        class238.field3693[var13 + -1][var15 + -1] = 3;
                        class106.field1517[var13 + -1][var15 + -1] = var27;
                        break;
                    }
                    if (~(2883902 & var17[var13 + -1][var32 + -1 + var15]) != -1 || (var17[var13 - 1 - -var32][var15 - 1] & 2883983) != 0) {
                        break;
                    }
                    ++var32;
                }
            }
            if (~var13 > -103 && ~var15 < -1 && ~class238.field3693[var13 + 1][var15 + -1] == -1 && (2883971 & var17[arg4 + var13][var15 + -1]) == 0) {
                int var33 = 1;
                while (true) {
                    if (~arg4 >= ~var33) {
                        class23.field357[var37] = var13 + 1;
                        class301.field4784[var37] = var15 + -1;
                        class238.field3693[var13 + 1][var15 + -1] = 9;
                        var37 = 4095 & var37 + 1;
                        class106.field1517[var13 + 1][var15 + -1] = var27;
                        break;
                    }
                    if ((var17[arg4 + var13][var15 + -1 + var33] & 2884067) != 0 || (var17[var13 + var33][var15 + -1] & 2883983) != 0) {
                        break;
                    }
                    ++var33;
                }
            }
            if (var13 > 0 && var15 < 102 && class238.field3693[var13 - 1][var15 + 1] == 0 && (2883896 & var17[var13 + -1][arg4 + var15]) == 0) {
                int var34 = 1;
                while (true) {
                    if (~var34 <= ~arg4) {
                        class23.field357[var37] = var13 + -1;
                        class301.field4784[var37] = var15 - -1;
                        class238.field3693[var13 - 1][var15 + 1] = 6;
                        class106.field1517[var13 + -1][var15 + 1] = var27;
                        var37 = var37 + 1 & 4095;
                        break;
                    }
                    if ((2883902 & var17[var13 - 1][var15 + var34]) != 0 || ~(2884088 & var17[var34 + -1 + var13][var15 - -arg4]) != -1) {
                        break;
                    }
                    ++var34;
                }
            }
            if (~var13 > -103 && ~var15 > -103 && class238.field3693[var13 + 1][var15 + 1] == 0 && ~(2884064 & var17[arg4 + var13][arg4 + var15]) == -1) {
                for (int var35 = 1; var35 < arg4; ++var35) {
                    if (~(2884088 & var17[var13 + var35][arg4 + var15]) != -1 || ~(var17[arg4 + var13][var15 - -var35] & 2884067) != -1) {
                        continue label313;
                    }
                }
                class23.field357[var37] = var13 - -1;
                class301.field4784[var37] = var15 - -1;
                var37 = var37 - -1 & 4095;
                class238.field3693[var13 + 1][var15 + 1] = 12;
                class106.field1517[var13 + 1][var15 - -1] = var27;
            }
        }
        if (!var18) {
            if (!arg0) {
                return;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = -var21 + arg10; ~(arg10 + var21) <= ~var22; ++var22) {
                for (int var23 = -var21 + arg2; ~(arg2 - -var21) <= ~var23; ++var23) {
                    if (var22 >= 0 && var23 >= 0 && ~var22 > -105 && var23 < 104 && ~class106.field1517[var22][var23] > -101) {
                        int var24 = 0;
                        int var25 = 0;
                        if (~var23 <= ~arg2) {
                            if (~var23 < ~(arg3 + -1 + arg2)) {
                                var25 = -arg2 + 1 - arg3 + var23;
                            }
                        } else {
                            var25 = -var23 + arg2;
                        }
                        if (arg10 <= var22) {
                            if (var22 > arg10 - -arg1 + -1) {
                                var24 = -arg1 + 1 + -arg10 + var22;
                            }
                        } else {
                            var24 = arg10 - var22;
                        }
                        int var26 = var24 * var24 - -(var25 * var25);
                        if (var26 < var20 || var20 == var26 && ~class106.field1517[var22][var23] > ~var19) {
                            var13 = var22;
                            var15 = var23;
                            var19 = class106.field1517[var22][var23];
                            var20 = var26;
                        }
                    }
                }
            }
            if (~var20 == -1001) {
                return;
            }
            if (~arg6 == ~var13 && arg9 == var15) {
                return;
            }
        }
        class176.field2485 = arg5;
        class274.field4354 = var15;
        class141.field1939 = var13;
    }
}
