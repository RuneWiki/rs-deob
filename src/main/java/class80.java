import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class80 extends class154 {

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
    private int field1254 = -1;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "Z")
    public static boolean field1247 = false;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "[[I")
    public static int[][] field1242 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "Leg;")
    public static class37 field1248 = class174.method1167(" x ", 99);

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "Leg;")
    public static class37 field1253 = class174.method1167(":trade:", -105);

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "Z")
    public static boolean field1258 = false;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!qb", name = "rb", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "[I")
    public int[] field1250;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class80() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZIIIIBIIII)Z")
    public static final boolean method537(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1252;
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class172.field2888[var12][var31] = 0;
                class102.field1603[var12][var31] = 99999999;
            }
        }
        if (arg7 >= -100) {
            method541(-69);
        }
        class172.field2888[arg1][arg4] = 99;
        class102.field1603[arg1][arg4] = 0;
        byte var13 = 0;
        int var14 = 0;
        int var15 = arg4;
        class89.field1428[var13] = arg1;
        int var16 = arg1;
        boolean var17 = false;
        int var32 = var13 + 1;
        class125.field2092[var13] = arg4;
        int[][] var18 = class215.field3719[class237.field4140].field2738;
        while (var32 != var14) {
            var15 = class125.field2092[var14];
            var16 = class89.field1428[var14];
            var14 = 4095 & var14 + 1;
            if (arg6 == var16 && ~arg3 == ~var15) {
                var17 = true;
                break;
            }
            if (arg11 != 0) {
                if ((~arg11 > -6 || ~arg11 == -11) && class215.field3719[class237.field4140].method1104(1, arg3, arg11 + -1, var16, arg9, true, var15, arg6)) {
                    var17 = true;
                    break;
                }
                if (~arg11 > -11 && class215.field3719[class237.field4140].method1109(var16, 1, var15, arg9, arg3, arg6, arg11 + -1, 0)) {
                    var17 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg10 != 0 && class215.field3719[class237.field4140].method1111(arg10, var16, arg5, arg3, arg6, 1, (byte) -101, arg8, var15)) {
                var17 = true;
                break;
            }
            int var30 = class102.field1603[var16][var15] + 1;
            if (~var16 < -1 && ~class172.field2888[var16 + -1][var15] == -1 && ~(var18[var16 - 1][var15] & 19661064) == -1) {
                class89.field1428[var32] = var16 + -1;
                class125.field2092[var32] = var15;
                var32 = var32 + 1 & 4095;
                class172.field2888[var16 + -1][var15] = 2;
                class102.field1603[var16 + -1][var15] = var30;
            }
            if (~var16 > -104 && ~class172.field2888[var16 + 1][var15] == -1 && ~(19661184 & var18[var16 + 1][var15]) == -1) {
                class89.field1428[var32] = var16 + 1;
                class125.field2092[var32] = var15;
                class172.field2888[var16 - -1][var15] = 8;
                var32 = 4095 & var32 + 1;
                class102.field1603[var16 + 1][var15] = var30;
            }
            if (~var15 < -1 && ~class172.field2888[var16][var15 - 1] == -1 && ~(var18[var16][var15 - 1] & 19661058) == -1) {
                class89.field1428[var32] = var16;
                class125.field2092[var32] = var15 + -1;
                class172.field2888[var16][var15 + -1] = 1;
                class102.field1603[var16][var15 + -1] = var30;
                var32 = 4095 & var32 - -1;
            }
            if (var15 < 103 && class172.field2888[var16][var15 - -1] == 0 && ~(19661088 & var18[var16][var15 + 1]) == -1) {
                class89.field1428[var32] = var16;
                class125.field2092[var32] = var15 + 1;
                var32 = 4095 & var32 - -1;
                class172.field2888[var16][var15 + 1] = 4;
                class102.field1603[var16][var15 + 1] = var30;
            }
            if (~var16 < -1 && var15 > 0 && ~class172.field2888[var16 + -1][var15 + -1] == -1 && ~(19661070 & var18[var16 + -1][var15 + -1]) == -1 && ~(var18[var16 + -1][var15] & 19661064) == -1 && ~(19661058 & var18[var16][var15 + -1]) == -1) {
                class89.field1428[var32] = var16 + -1;
                class125.field2092[var32] = var15 + -1;
                class172.field2888[var16 - 1][var15 + -1] = 3;
                class102.field1603[var16 - 1][var15 + -1] = var30;
                var32 = 4095 & var32 + 1;
            }
            if (~var16 > -104 && ~var15 < -1 && class172.field2888[var16 + 1][var15 + -1] == 0 && (var18[var16 + 1][var15 + -1] & 19661187) == 0 && (19661184 & var18[var16 - -1][var15]) == 0 && (19661058 & var18[var16][var15 + -1]) == 0) {
                class89.field1428[var32] = var16 + 1;
                class125.field2092[var32] = var15 - 1;
                var32 = var32 - -1 & 4095;
                class172.field2888[var16 - -1][var15 + -1] = 9;
                class102.field1603[var16 + 1][var15 + -1] = var30;
            }
            if (~var16 < -1 && var15 < 103 && class172.field2888[var16 - 1][var15 + 1] == 0 && (19661112 & var18[var16 + -1][var15 - -1]) == 0 && (19661064 & var18[var16 + -1][var15]) == 0 && (19661088 & var18[var16][var15 + 1]) == 0) {
                class89.field1428[var32] = var16 + -1;
                class125.field2092[var32] = var15 + 1;
                var32 = var32 - -1 & 4095;
                class172.field2888[var16 + -1][var15 + 1] = 6;
                class102.field1603[var16 + -1][var15 + 1] = var30;
            }
            if (var16 < 103 && ~var15 > -104 && class172.field2888[var16 - -1][var15 - -1] == 0 && ~(var18[var16 - -1][var15 - -1] & 19661280) == -1 && (var18[var16 + 1][var15] & 19661184) == 0 && ~(19661088 & var18[var16][var15 + 1]) == -1) {
                class89.field1428[var32] = var16 - -1;
                class125.field2092[var32] = var15 + 1;
                class172.field2888[var16 + 1][var15 - -1] = 12;
                class102.field1603[var16 + 1][var15 + 1] = var30;
                var32 = var32 + 1 & 4095;
            }
        }
        class36.field530 = 0;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = -var21 + arg6; arg6 + var21 >= var22; ++var22) {
                for (int var23 = -var21 + arg3; ~(arg3 - -var21) <= ~var23; ++var23) {
                    if (var22 >= 0 && ~var23 <= -1 && ~var22 > -105 && var23 < 104 && ~class102.field1603[var22][var23] > -101) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var22 >= arg6) {
                            if (arg6 - 1 + arg8 < var22) {
                                var25 = var22 - (arg8 + -1) - arg6;
                            }
                        } else {
                            var25 = -var22 + arg6;
                        }
                        if (arg3 > var23) {
                            var24 = -var23 + arg3;
                        } else if (~var23 < ~(arg3 + -1 + arg10)) {
                            var24 = -arg3 + 1 - arg10 + var23;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || ~var19 == ~var26 && ~class102.field1603[var22][var23] > ~var20) {
                            var16 = var22;
                            var19 = var26;
                            var20 = class102.field1603[var22][var23];
                            var15 = var23;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (~arg1 == ~var16 && arg4 == var15) {
                return false;
            }
            class36.field530 = 1;
        }
        byte var27 = 0;
        class89.field1428[var27] = var16;
        int var33 = var27 + 1;
        class125.field2092[var27] = var15;
        int var28;
        int var29 = var28 = class172.field2888[var16][var15];
        while (~arg1 != ~var16 || arg4 != var15) {
            if (var28 != var29) {
                class89.field1428[var33] = var16;
                var28 = var29;
                class125.field2092[var33++] = var15;
            }
            if ((2 & var29) == 0) {
                if ((8 & var29) != 0) {
                    --var16;
                }
            } else {
                ++var16;
            }
            if (~(1 & var29) != -1) {
                ++var15;
            } else if ((var29 & 4) != 0) {
                --var15;
            }
            var29 = class172.field2888[var16][var15];
        }
        if (~var33 < -1) {
            class93.method608(var33, arg0, (byte) 55);
            return true;
        } else if (~arg0 == -2) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static void method538(int arg0) {
        field1242 = null;
        field1253 = null;
        if (arg0 != -1) {
            method541(65);
        }
        field1248 = null;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method539(int arg0) {
        if (arg0 >= 53) {
            super.method539(107);
            ++field1243;
            this.field1250 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZII)V")
    public static final void method540(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field1245;
        boolean var5 = false;
        class116.field1982 = 0L;
        int var6 = class130.method921(arg3 ^ 19661134);
        if (~arg1 == -4 || ~var6 == -4) {
            arg2 = true;
        }
        if (class207.field3506.startsWith("mac") && ~arg1 < -1) {
            arg2 = true;
        }
        if (~var6 < -1 == ~arg1 >= -1) {
            var5 = true;
        }
        if (arg3 != 19661088) {
            field1248 = null;
        }
        if (arg2 && arg1 > 0) {
            var5 = true;
        }
        class199.method1387(var5, arg1, arg2, 4, arg0, arg4, var6);
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)Z")
    public static final boolean method541(int arg0) {
        ++field1244;
        class19 var1 = class4.field71;
        synchronized (class4.field71) {
            if (~class247.field4439 == ~class200.field3404) {
                return false;
            } else {
                class48.field758 = class105.field1632[class247.field4439];
                class241.field4287 = class78.field1210[class247.field4439];
                class247.field4439 = 127 & class247.field4439 + 1;
                int var3 = 36 / ((-7 - arg0) / 38);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)Z")
    public final boolean method542(int arg0) {
        ++field1251;
        int var2 = 99 / ((-56 - arg0) / 35);
        if (this.field1250 != null) {
            return true;
        } else if (this.field1254 >= 0) {
            class195 var3 = ~class224.field3844 > -1 ? class2.method14((byte) -90, this.field1254, class239.field4259) : class263.method1780(class224.field3844, (byte) -51, this.field1254, class239.field4259);
            var3.method1359();
            this.field1250 = var3.field3331;
            this.field1255 = var3.field1637;
            this.field1246 = var3.field1627;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I")
    public final int method543(byte arg0) {
        if (arg0 > -54) {
            this.method193((byte) 35, 86);
        }
        ++field1241;
        return this.field1254;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)Z")
    public static final boolean method544(int arg0, int arg1) {
        if (arg1 != -25598) {
            method540(77, -89, false, -101, -65);
        }
        ++field1259;
        return (2081902495 & arg0) >> 30 != 0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(BI)[[I")
    public int[][] method193(byte arg0, int arg1) {
        ++field1239;
        int[][] var3 = super.field2585.method1532(arg1, -87);
        if (arg0 != 115) {
            field1247 = false;
        }
        if (super.field2585.field3761 && this.method542(-99)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (class110.field1847 == this.field1255 ? arg1 : this.field1255 * arg1 / class110.field1847) * this.field1246;
            int[] var7 = var3[2];
            if (class227.field3898 == this.field1246) {
                for (int var8 = 0; ~class227.field3898 < ~var8; ++var8) {
                    int var9 = this.field1250[var6++];
                    var7[var8] = class96.method626(4080, var9 << 4);
                    var5[var8] = class96.method626(4080, var9 >> 4);
                    var4[var8] = class96.method626(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class227.field3898; ++var10) {
                    int var11 = this.field1246 * var10 / class227.field3898;
                    int var12 = this.field1250[var6 - -var11];
                    var7[var10] = class96.method626(255, var12) << 4;
                    var5[var10] = class96.method626(4080, var12 >> 4);
                    var4[var10] = class96.method626(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[BB)Leg;")
    public static final class37 method545(int arg0, int arg1, byte[] arg2, byte arg3) {
        ++field1257;
        if (arg3 != -19) {
            method540(-106, 26, true, 86, 25);
        }
        class37 var4 = new class37();
        var4.field599 = new byte[arg0];
        var4.field576 = 0;
        for (int var5 = arg1; ~(arg0 + arg1) < ~var5; ++var5) {
            if (~arg2[var5] != -1) {
                var4.field599[var4.field576++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field1256;
        if (arg2 == 0) {
            this.field1254 = arg0.method1244(false);
        }
        if (arg1 != -14015) {
            this.method539(29);
        }
    }
}
