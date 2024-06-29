import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class24 extends class272 {

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    private int field388 = 1638;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    private int field393 = 4;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "[B")
    private byte[] field394 = new byte[512];

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    private int field398 = 4;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    private int field399 = 4;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    private int field411 = 0;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "Z")
    private boolean field414 = true;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "Lli;")
    public static class185 field404 = class245.method1649("ul", -125);

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lli;")
    public static class185 field408 = class245.method1649("<img=1>", -89);

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field405 = 0;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "Lli;")
    public static class185 field410 = class245.method1649("blanc:", -13);

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "Lli;")
    public static class185 field403;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lhi;")
    public static class250 field407;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "[S")
    private short[] field390;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "[S")
    private short[] field391;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIB)I")
    public static final int method159(byte[] arg0, int arg1, byte arg2) {
        ++field396;
        if (arg2 < 88) {
            field408 = null;
        }
        return class214.method1494(arg0, 0, arg1, 1);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field406;
        int var4 = 75 % ((-21 - arg1) / 55);
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field393 = arg0.method867(false);
            } else {
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        this.field399 = this.field398 = arg0.method867(false);
                        return;
                    }
                    if (arg2 == 4) {
                        this.field411 = arg0.method867(false);
                        return;
                    }
                    if (arg2 == 5) {
                        this.field399 = arg0.method867(false);
                        return;
                    }
                    if (arg2 == 6) {
                        this.field398 = arg0.method867(false);
                        return;
                    }
                } else {
                    this.field388 = arg0.method876(65280);
                    if (this.field388 < 0) {
                        this.field390 = new short[this.field393];
                        for (int var6 = 0; ~var6 > ~this.field393; ++var6) {
                            this.field390[var6] = (short) arg0.method876(65280);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field414 = ~arg0.method867(false) == -2;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            method160(false);
        }
        int[] var3 = super.field4819.method1632(arg1 + -4421, arg0);
        ++field389;
        if (super.field4819.field4294) {
            this.method164(arg0, var3, -71);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.field394 = class39.method244(this.field411, arg0 + 255);
        ++field395;
        this.method167(95);
        if (arg0 != 0) {
            field408 = null;
        }
        for (int var2 = this.field393 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field390[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field393;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class24() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Z)V")
    public static final void method160(boolean arg0) {
        Container var1;
        if (class144.field2746 != null) {
            var1 = class144.field2746;
        } else if (class131.field2357 == null) {
            var1 = class124.field2238.field3022;
        } else {
            var1 = class131.field2357;
        }
        class201.field3680 = var1.getSize().width;
        class266.field4715 = var1.getSize().height;
        if (class131.field2357 == var1) {
            Insets var2 = class131.field2357.getInsets();
            class266.field4715 -= var2.top + var2.bottom;
            class201.field3680 -= var2.right + var2.left;
        }
        ++field412;
        if (class123.method898(true) < 2) {
            class70.field1226 = 0;
            class204.field3738 = 765;
            class210.field3841 = (class201.field3680 + -765) / 2;
            class148.field2796 = 503;
        } else {
            class204.field3738 = class201.field3680;
            class210.field3841 = 0;
            class148.field2796 = class266.field4715;
            class70.field1226 = 0;
        }
        class30.field500.setSize(class204.field3738, class148.field2796);
        if (class131.field2357 != var1) {
            class30.field500.setLocation(class210.field3841, class70.field1226);
        } else {
            Insets var3 = class131.field2357.getInsets();
            class30.field500.setLocation(class210.field3841 + var3.left, class70.field1226 + var3.top);
        }
        if (~class275.field4877 != 0) {
            class176.method1245(true, -1);
        }
        class120.method889((byte) -114);
        if (arg0) {
            method159((byte[]) null, -30, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static void method161(byte arg0) {
        field410 = null;
        if (arg0 == -104) {
            field408 = null;
            field403 = null;
            field407 = null;
            field404 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)I")
    private final int method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field397;
        int var8 = arg3 + -4096;
        int var9 = arg1 >> 12;
        int var10 = arg1 & 4095;
        int var11 = class80.field1400[var10];
        int var12 = var10 + -4096;
        int var13 = var9 + 1;
        if (var13 >= arg4) {
            var13 = 0;
        }
        int var14 = var13 & 255;
        int var15 = var9 & 255;
        int var16 = 3 & this.field394[arg6 + var15];
        int var17;
        if (~var16 >= -2) {
            var17 = var16 != 0 ? -var10 + arg3 : arg3 + var10;
        } else {
            var17 = var16 != 2 ? -var10 - arg3 : var10 - arg3;
        }
        int var18 = 3 & this.field394[arg6 + var14];
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? var12 - -arg3 : arg3 - var12;
        } else {
            var19 = ~var18 == -3 ? -arg3 + var12 : -arg3 + -var12;
        }
        int var20 = this.field394[arg2 + var15] & 3;
        int var21 = ((-var17 + var19) * var11 >> 12) + var17;
        int var22;
        if (var20 > 1) {
            var22 = ~var20 == -3 ? -var8 + var10 : -var8 + -var10;
        } else {
            var22 = ~var20 != -1 ? -var10 + var8 : var10 - -var8;
        }
        int var23 = this.field394[var14 - -arg2] & arg5;
        int var24;
        if (var23 <= 1) {
            var24 = var23 != 0 ? -var12 + var8 : var12 - -var8;
        } else {
            var24 = ~var23 != -3 ? -var8 + -var12 : -var8 + var12;
        }
        int var25 = ((var24 - var22) * var11 >> 12) + var22;
        return ((-var21 + var25) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZIBIIIIIII)Z")
    public static final boolean method163(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var32 = 0; var32 < 104; ++var32) {
                class27.field462[var12][var32] = 0;
                class263.field4673[var12][var32] = 99999999;
            }
        }
        class27.field462[arg0][arg11] = 99;
        ++field413;
        int var13 = -110 / ((31 - arg4) / 34);
        class263.field4673[arg0][arg11] = 0;
        int var14 = arg11;
        int var15 = arg0;
        int var16 = 0;
        byte var17 = 0;
        class173.field3178[var17] = arg0;
        int var33 = var17 + 1;
        class9.field191[var17] = arg11;
        boolean var18 = false;
        int[][] var19 = class165.field3090[class265.field4703].field757;
        while (~var16 != ~var33) {
            var14 = class9.field191[var16];
            var15 = class173.field3178[var16];
            var16 = 4095 & var16 + 1;
            if (arg5 == var15 && ~arg8 == ~var14) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((~arg3 > -6 || ~arg3 == -11) && class165.field3090[class265.field4703].method288(1, var14, arg5, arg8, arg3 + -1, arg7, (byte) 53, var15)) {
                    var18 = true;
                    break;
                }
                if (~arg3 > -11 && class165.field3090[class265.field4703].method290(arg3 + -1, var14, 1, arg7, var15, (byte) 47, arg5, arg8)) {
                    var18 = true;
                    break;
                }
            }
            if (~arg9 != -1 && arg6 != 0 && class165.field3090[class265.field4703].method302(arg8, arg9, var15, arg1, var14, 1, arg5, arg6, 1)) {
                var18 = true;
                break;
            }
            int var31 = class263.field4673[var15][var14] - -1;
            if (~var15 < -1 && class27.field462[var15 + -1][var14] == 0 && ~(19661064 & var19[var15 + -1][var14]) == -1) {
                class173.field3178[var33] = var15 - 1;
                class9.field191[var33] = var14;
                var33 = var33 + 1 & 4095;
                class27.field462[var15 - 1][var14] = 2;
                class263.field4673[var15 + -1][var14] = var31;
            }
            if (var15 < 103 && ~class27.field462[var15 + 1][var14] == -1 && (19661184 & var19[var15 + 1][var14]) == 0) {
                class173.field3178[var33] = var15 + 1;
                class9.field191[var33] = var14;
                var33 = 4095 & var33 + 1;
                class27.field462[var15 + 1][var14] = 8;
                class263.field4673[var15 - -1][var14] = var31;
            }
            if (var14 > 0 && ~class27.field462[var15][var14 + -1] == -1 && (19661058 & var19[var15][var14 - 1]) == 0) {
                class173.field3178[var33] = var15;
                class9.field191[var33] = var14 + -1;
                class27.field462[var15][var14 + -1] = 1;
                var33 = var33 - -1 & 4095;
                class263.field4673[var15][var14 - 1] = var31;
            }
            if (~var14 > -104 && ~class27.field462[var15][var14 - -1] == -1 && ~(var19[var15][var14 + 1] & 19661088) == -1) {
                class173.field3178[var33] = var15;
                class9.field191[var33] = var14 + 1;
                class27.field462[var15][var14 + 1] = 4;
                var33 = 4095 & var33 + 1;
                class263.field4673[var15][var14 - -1] = var31;
            }
            if (~var15 < -1 && ~var14 < -1 && class27.field462[var15 - 1][var14 + -1] == 0 && ~(19661070 & var19[var15 + -1][var14 - 1]) == -1 && (19661064 & var19[var15 + -1][var14]) == 0 && ~(var19[var15][var14 + -1] & 19661058) == -1) {
                class173.field3178[var33] = var15 - 1;
                class9.field191[var33] = var14 + -1;
                var33 = 4095 & var33 + 1;
                class27.field462[var15 + -1][var14 + -1] = 3;
                class263.field4673[var15 - 1][var14 + -1] = var31;
            }
            if (var15 < 103 && var14 > 0 && ~class27.field462[var15 + 1][var14 - 1] == -1 && (19661187 & var19[var15 + 1][var14 + -1]) == 0 && (var19[var15 + 1][var14] & 19661184) == 0 && (19661058 & var19[var15][var14 + -1]) == 0) {
                class173.field3178[var33] = var15 - -1;
                class9.field191[var33] = var14 - 1;
                var33 = 4095 & var33 + 1;
                class27.field462[var15 + 1][var14 + -1] = 9;
                class263.field4673[var15 - -1][var14 + -1] = var31;
            }
            if (var15 > 0 && ~var14 > -104 && class27.field462[var15 - 1][var14 + 1] == 0 && ~(var19[var15 - 1][var14 + 1] & 19661112) == -1 && ~(19661064 & var19[var15 + -1][var14]) == -1 && ~(19661088 & var19[var15][var14 + 1]) == -1) {
                class173.field3178[var33] = var15 - 1;
                class9.field191[var33] = var14 - -1;
                class27.field462[var15 + -1][var14 + 1] = 6;
                class263.field4673[var15 + -1][var14 + 1] = var31;
                var33 = var33 + 1 & 4095;
            }
            if (var15 < 103 && ~var14 > -104 && class27.field462[var15 + 1][var14 - -1] == 0 && ~(19661280 & var19[var15 + 1][var14 + 1]) == -1 && ~(var19[var15 + 1][var14] & 19661184) == -1 && (var19[var15][var14 + 1] & 19661088) == 0) {
                class173.field3178[var33] = var15 + 1;
                class9.field191[var33] = var14 + 1;
                class27.field462[var15 + 1][var14 + 1] = 12;
                var33 = 4095 & var33 + 1;
                class263.field4673[var15 - -1][var14 + 1] = var31;
            }
        }
        class258.field4587 = 0;
        if (!var18) {
            if (!arg2) {
                return false;
            }
            byte var20 = 10;
            int var21 = 1000;
            int var22 = 100;
            for (int var23 = -var20 + arg5; arg5 + var20 >= var23; ++var23) {
                for (int var24 = -var20 + arg8; var24 <= arg8 + var20; ++var24) {
                    if (~var23 <= -1 && var24 >= 0 && var23 < 104 && var24 < 104 && class263.field4673[var23][var24] < 100) {
                        int var25 = 0;
                        if (var24 < arg8) {
                            var25 = -var24 + arg8;
                        } else if (arg8 + -1 - -arg6 < var24) {
                            var25 = -arg6 + var24 + -arg8 + 1;
                        }
                        int var26 = 0;
                        if (arg5 > var23) {
                            var26 = -var23 + arg5;
                        } else if (~(arg5 - -arg9 - 1) > ~var23) {
                            var26 = -arg9 - -1 + -arg5 + var23;
                        }
                        int var27 = var26 * var26 - -(var25 * var25);
                        if (var27 < var21 || var21 == var27 && ~class263.field4673[var23][var24] > ~var22) {
                            var14 = var24;
                            var15 = var23;
                            var22 = class263.field4673[var23][var24];
                            var21 = var27;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var15 && arg11 == var14) {
                return false;
            }
            class258.field4587 = 1;
        }
        byte var28 = 0;
        class173.field3178[var28] = var15;
        int var34 = var28 + 1;
        class9.field191[var28] = var14;
        int var29;
        int var30 = var29 = class27.field462[var15][var14];
        while (arg0 != var15 || ~arg11 != ~var14) {
            if (~var29 != ~var30) {
                class173.field3178[var34] = var15;
                var29 = var30;
                class9.field191[var34++] = var14;
            }
            if (~(1 & var30) == -1) {
                if ((4 & var30) != 0) {
                    --var14;
                }
            } else {
                ++var14;
            }
            if ((2 & var30) == 0) {
                if ((8 & var30) != 0) {
                    --var15;
                }
            } else {
                ++var15;
            }
            var30 = class27.field462[var15][var14];
        }
        if (var34 > 0) {
            class237.method1610(var34, (byte) 4, arg10);
            return true;
        } else if (~arg10 == -2) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[II)V")
    private final void method164(int arg0, int[] arg1, int arg2) {
        ++field402;
        int var4 = class232.field4177[arg0] * this.field398;
        int var5 = -84 % (-arg2 / 57);
        if (~this.field393 == -2) {
            int var6 = this.field391[0] << 12;
            int var7 = this.field399 * var6 >> 12;
            short var8 = this.field390[0];
            int var9 = this.field398 * var6 >> 12;
            int var10 = var4 * var6 >> 12;
            int var11 = var10 >> 12;
            int var12 = var10 & 4095;
            int var13 = class80.field1400[var12];
            int var14 = var11 + 1;
            int var15 = this.field394[var11 & 255] & 255;
            if (var9 <= var14) {
                var14 = 0;
            }
            int var16 = 255 & this.field394[var14 & 255];
            if (this.field414) {
                for (int var17 = 0; ~class246.field4385 < ~var17; ++var17) {
                    int var18 = class38.field598[var17] * this.field399;
                    int var19 = this.method162(var13, var6 * var18 >> 12, var16, var12, var7, 3, var15);
                    int var20 = var8 * var19 >> 12;
                    arg1[var17] = (var20 >> 1) + 2048;
                }
            } else {
                for (int var21 = 0; ~class246.field4385 < ~var21; ++var21) {
                    int var22 = class38.field598[var21] * this.field399;
                    int var23 = this.method162(var13, var6 * var22 >> 12, var16, var12, var7, 3, var15);
                    arg1[var21] = var8 * var23 >> 12;
                }
            }
        } else {
            short var24 = this.field390[0];
            if (var24 > 8 || var24 < -8) {
                int var25 = this.field391[0] << 12;
                int var26 = this.field399 * var25 >> 12;
                int var27 = var4 * var25 >> 12;
                int var28 = this.field398 * var25 >> 12;
                int var29 = var27 >> 12;
                int var30 = var27 & 4095;
                int var31 = 255 & this.field394[255 & var29];
                int var32 = var29 - -1;
                int var33 = class80.field1400[var30];
                if (~var28 >= ~var32) {
                    var32 = 0;
                }
                int var34 = this.field394[255 & var32] & 255;
                for (int var35 = 0; ~var35 > ~class246.field4385; ++var35) {
                    int var55 = class38.field598[var35] * this.field399;
                    int var56 = this.method162(var33, var25 * var55 >> 12, var34, var30, var26, 3, var31);
                    arg1[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; ~this.field393 < ~var36; ++var36) {
                short var37 = this.field390[var36];
                if (var37 > 8 || var37 < -8) {
                    int var38 = this.field391[var36] << 12;
                    int var39 = this.field398 * var38 >> 12;
                    int var40 = var4 * var38 >> 12;
                    int var41 = this.field399 * var38 >> 12;
                    int var42 = var40 >> 12;
                    int var43 = 255 & this.field394[255 & var42];
                    int var44 = var40 & 4095;
                    int var45 = class80.field1400[var44];
                    int var46 = var42 - -1;
                    if (~var39 >= ~var46) {
                        var46 = 0;
                    }
                    int var47 = 255 & this.field394[var46 & 255];
                    if (this.field414 && ~(this.field393 + -1) == ~var36) {
                        for (int var48 = 0; ~class246.field4385 < ~var48; ++var48) {
                            int var49 = class38.field598[var48] * this.field399;
                            int var50 = this.method162(var45, var38 * var49 >> 12, var47, var44, var41, 3, var43);
                            int var51 = (var37 * var50 >> 12) + arg1[var48];
                            arg1[var48] = 2048 - -(var51 >> 1);
                        }
                    } else {
                        for (int var52 = 0; ~var52 > ~class246.field4385; ++var52) {
                            int var53 = class38.field598[var52] * this.field399;
                            int var54 = this.method162(var45, var38 * var53 >> 12, var47, var44, var41, 3, var43);
                            arg1[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Lli;")
    public static final class185 method165(int arg0, int arg1) {
        if (arg0 != -29515) {
            return null;
        } else {
            ++field400;
            return ~arg1 > -1000000000 ? class90.method591(arg1, arg0 ^ -29515) : class127.field2274;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILti;)V")
    public static final void method166(int arg0, int arg1, int arg2, class188 arg3) {
        ++field409;
        if ((arg1 & 1024) != 0) {
            int var4 = class142.field2669.method851(arg0 ^ 21058);
            if (~var4 == -65536) {
                var4 = -1;
            }
            int var5 = class142.field2669.method875((byte) 47);
            boolean var6 = true;
            if (~var4 != 0 && ~arg3.field2709 != 0 && ~class253.method1712(class255.method1728(var4, (byte) 95).field4193, -127).field32 > ~class253.method1712(class255.method1728(arg3.field2709, (byte) 95).field4193, -125).field32) {
                var6 = false;
            }
            if (var6) {
                arg3.field2674 = var5 >> 16;
                arg3.field2703 = (65535 & var5) + class211.field3851;
                arg3.field2656 = 0;
                arg3.field2709 = var4;
                if (~class211.field3851 > ~arg3.field2703) {
                    arg3.field2656 = -1;
                }
                arg3.field2664 = 0;
                if (~arg3.field2709 != 0 && class211.field3851 == arg3.field2703) {
                    int var7 = class255.method1728(arg3.field2709, (byte) 95).field4193;
                    if (~var7 != 0) {
                        class2 var8 = class253.method1712(var7, -123);
                        if (var8 != null && var8.field37 != null) {
                            class31.method188(arg0 + -23155, var8, arg3.field2687, class241.field4310 == arg3, 0, arg3.field2694);
                        }
                    }
                }
            }
        }
        if ((arg1 & 1) != 0) {
            arg3.field2713 = class142.field2669.method865(9199);
            if (~arg3.field2713.method1328((byte) 96, 0) == -127) {
                arg3.field2713 = arg3.field2713.method1310(39, 1);
                class1.method5(arg3.method1355(8), 2, true, arg3.field2713);
            } else if (class241.field4310 == arg3) {
                class1.method5(arg3.method1355(8), 2, true, arg3.field2713);
            }
            arg3.field2727 = 0;
            arg3.field2650 = 0;
            arg3.field2657 = 150;
        }
        if ((64 & arg1) != 0) {
            int var9 = class142.field2669.method854((byte) 80);
            byte[] var10 = new byte[var9];
            class118 var11 = new class118(var10);
            class142.field2669.method858(true, 0, var10, var9);
            class47.field778[arg2] = var11;
            arg3.method1354(var11, false);
        }
        if (arg0 != 23154) {
            method160(true);
        }
        if (~(16 & arg1) != -1) {
            arg3.field2717 = class142.field2669.method872(arg0 + -23138);
            arg3.field2649 = class142.field2669.method831((byte) -111);
        }
        if ((arg1 & 4) != 0) {
            int var12 = class142.field2669.method836((byte) 106);
            int var13 = class142.field2669.method832((byte) -116);
            arg3.method1016(var13, var12, class211.field3851, false);
            arg3.field2688 = class211.field3851 + 300;
            arg3.field2675 = class142.field2669.method821(arg0 ^ -23055);
        }
        if ((32 & arg1) != 0) {
            int var14 = class142.field2669.method872(16);
            boolean var15 = ~(32768 & var14) != -1;
            int var16 = class142.field2669.method854((byte) 97);
            int var17 = class142.field2669.method867(false);
            int var18 = class142.field2669.field2155;
            if (arg3.field3514 != null && arg3.field3478 != null) {
                boolean var19 = false;
                long var20 = arg3.field3514.method1327((byte) 101);
                if (~var16 >= -2) {
                    if (var15 || (!class212.field3864 || class118.field2142) && !class275.field4880) {
                        for (int var22 = 0; var22 < class127.field2276; ++var22) {
                            if (~class165.field3088[var22] == ~var20) {
                                var19 = true;
                                break;
                            }
                        }
                    } else {
                        var19 = true;
                    }
                }
                if (!var19 && class79.field1388 == 0) {
                    class184.field3383.field2155 = 0;
                    class142.field2669.method822(var17, class184.field3383.field2115, 0, (byte) -84);
                    int var23 = -1;
                    class184.field3383.field2155 = 0;
                    class185 var25;
                    if (var15) {
                        var14 &= 32767;
                        class152 var24 = class54.method368(115, class184.field3383);
                        var23 = var24.field2875;
                        var25 = var24.field2876.method743(class184.field3383, (byte) -115);
                    } else {
                        var25 = class270.method1844(class80.method515(class184.field3383, 32767).method1316(arg0 + -29171));
                    }
                    arg3.field2713 = var25.method1309(arg0 ^ -23155);
                    arg3.field2650 = var14 >> 8;
                    arg3.field2657 = 150;
                    arg3.field2727 = var14 & 255;
                    if (~var16 != -3) {
                        if (~var16 == -2) {
                            class7.method77(class87.method567(-11039, new class185[] { class85.field1683, arg3.method1355(8) }), var15 ? 17 : 1, var23, -14486, (class185) null, var25);
                        } else {
                            class7.method77(arg3.method1355(8), !var15 ? 2 : 17, var23, -14486, (class185) null, var25);
                        }
                    } else {
                        class7.method77(class87.method567(-11039, new class185[] { class266.field4707, arg3.method1355(arg0 ^ 23162) }), var15 ? 17 : 1, var23, -14486, (class185) null, var25);
                    }
                }
            }
            class142.field2669.field2155 = var18 - -var17;
        }
        if (~(arg1 & 8) != -1) {
            arg3.field2665 = class142.field2669.method851(2096);
            if (arg3.field2665 == 65535) {
                arg3.field2665 = -1;
            }
        }
        if ((256 & arg1) != 0) {
            arg3.field2708 = class142.field2669.method867(false);
            arg3.field2685 = class142.field2669.method867(false);
            arg3.field2682 = class142.field2669.method832((byte) 80);
            arg3.field2659 = class142.field2669.method867(false);
            arg3.field2702 = class142.field2669.method831((byte) -82) + class211.field3851;
            arg3.field2672 = class142.field2669.method851(2096) + class211.field3851;
            arg3.field2706 = class142.field2669.method867(false);
            arg3.field2686 = 1;
            arg3.field2661 = 0;
        }
        if ((512 & arg1) != 0) {
            int var26 = class142.field2669.method836((byte) 121);
            int var27 = class142.field2669.method854((byte) 89);
            arg3.method1016(var27, var26, class211.field3851, false);
        }
        if (~(2 & arg1) != -1) {
            int var28 = class142.field2669.method872(arg0 + -23138);
            int var29 = class142.field2669.method832((byte) 86);
            if (var28 == 65535) {
                var28 = -1;
            }
            class238.method1617(arg3, var28, arg0 + -19029, var29);
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    private final void method167(int arg0) {
        if (~this.field388 < -1) {
            this.field391 = new short[this.field393];
            this.field390 = new short[this.field393];
            for (int var2 = 0; this.field393 > var2; ++var2) {
                this.field390[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field388 / 4096.0F), (double) var2)));
                this.field391[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field390 != null && ~this.field390.length == ~this.field393) {
            this.field391 = new short[this.field393];
            for (int var3 = 0; ~var3 > ~this.field393; ++var3) {
                this.field391[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        int var4 = -89 / ((10 - arg0) / 45);
        ++field401;
    }
}
