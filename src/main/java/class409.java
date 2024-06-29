import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class409 extends class130 implements class151 {

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    private int field5978;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Lri;")
    public static class74 field5972 = new class74(3, 6);

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "[F")
    public static float[] field5979 = new float[4];

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field5983;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "[I")
    public static int[] field5984;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
    public final int method1013(boolean arg0) {
        if (arg0) {
            return 10;
        } else {
            ++field5982;
            return 0;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
    public static final void method2445(int arg0) {
        if (arg0 != -33) {
            method2451(false);
        }
        class141.field2029.method709(64);
        ++field5980;
        for (int var1 = 0; var1 < 32; ++var1) {
            class200.field2828[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            client.field2811[var2] = 0L;
        }
        class398.field5826 = 0;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public static final void method2446(byte arg0) {
        int var1 = 0;
        if (arg0 < 64) {
            method2451(true);
        }
        while (~var1 > ~class228.field3242) {
            class233 var2 = class275.field3767[var1];
            if (var2.field3295 == 2) {
                if (var2.field3287 == null) {
                    var2.field3286 = Integer.MIN_VALUE;
                } else {
                    class361.field5267.method582(var2.field3287);
                }
            }
            ++var1;
        }
        ++field5985;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I[BIB)V")
    public final void method1016(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 != -87) {
            this.method1013(false);
        }
        this.method895(arg1, arg0);
        ++field5975;
        this.field5978 = arg2;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(CB)C")
    public static final char method2447(char arg0, byte arg1) {
        ++field5981;
        if (arg1 > -7) {
            field5972 = null;
        }
        if (~arg0 != -33 && arg0 != 160 && arg0 != '_' && ~arg0 != -46) {
            if (~arg0 != -92 && arg0 != ']' && ~arg0 != -36) {
                if (arg0 != 224 && ~arg0 != -226 && arg0 != 226 && ~arg0 != -229 && arg0 != 227 && arg0 != 192 && ~arg0 != -194 && ~arg0 != -195 && arg0 != 196 && ~arg0 != -196) {
                    if (~arg0 != -233 && arg0 != 233 && ~arg0 != -235 && ~arg0 != -236 && arg0 != 200 && ~arg0 != -202 && ~arg0 != -203 && arg0 != 203) {
                        if (arg0 != 237 && arg0 != 238 && ~arg0 != -240 && ~arg0 != -206 && ~arg0 != -207 && arg0 != 207) {
                            if (arg0 != 242 && ~arg0 != -244 && arg0 != 244 && ~arg0 != -247 && arg0 != 245 && arg0 != 210 && arg0 != 211 && ~arg0 != -213 && ~arg0 != -215 && arg0 != 213) {
                                if (~arg0 != -250 && ~arg0 != -251 && arg0 != 251 && arg0 != 252 && ~arg0 != -218 && arg0 != 218 && ~arg0 != -220 && arg0 != 220) {
                                    if (arg0 != 231 && ~arg0 != -200) {
                                        if (arg0 != 255 && arg0 != 376) {
                                            if (arg0 != 241 && ~arg0 != -210) {
                                                return ~arg0 == -224 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)I")
    public static final int method2448(boolean arg0, int arg1) {
        if (!arg0) {
            method2447((char) 65480, (byte) 35);
        }
        ++field5976;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lef;I[BI)V")
    public class409(class338 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5978 = arg1;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)I")
    public static final int method2449(int arg0, int arg1, int arg2) {
        ++field5977;
        int var3 = arg2 * 57 + arg0;
        if (arg1 != 1) {
            return 71;
        } else {
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return var5 >> 19 & 255;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lem;IILya;ILma;III)V")
    public static final void method2450(class150 arg0, int arg1, int arg2, class38 arg3, int arg4, class10 arg5, int arg6, int arg7, int arg8) {
        ++field5986;
        if (arg6 != 32) {
            method2446((byte) 80);
        }
        class146 var9 = class362.field5299.method141(arg1, false);
        if (var9 != null && var9.field2078 && var9.method985((byte) -117, class421.field6166)) {
            if (var9.field2090 != null) {
                int[] var10 = new int[var9.field2090.length];
                for (int var11 = 0; var10.length / 2 > var11; ++var11) {
                    int var13;
                    if (~class491.field7168 == -5) {
                        var13 = 16383 & (int) class498.field7255;
                    } else {
                        var13 = 16383 & (int) class498.field7255 + class302.field4143;
                    }
                    int var14 = class183.field2684[var13];
                    int var15 = class183.field2678[var13];
                    if (~class491.field7168 != -5) {
                        var14 = var14 * 256 / (class162.field2435 + 256);
                        var15 = var15 * 256 / (class162.field2435 - -256);
                    }
                    var10[var11 * 2] = ((arg2 - -(var9.field2090[var11 * 2] * 4)) * var15 + (var9.field2090[var11 * 2 + 1] * 4 + arg8) * var14 >> 15) + arg0.field2204 / 2 + arg4;
                    var10[var11 * 2 + 1] = arg7 - -(arg0.field2322 / 2) + -((arg8 - -(var9.field2090[var11 * 2 + 1] * 4)) * var15 + -((var9.field2090[var11 * 2] * 4 + arg2) * var14) >> 15);
                }
                class213.method1320(arg3, var10, var9.field2075, arg0.field2202, arg0.field2170);
                for (int var12 = 0; ~(var10.length / 2 + -1) < ~var12; ++var12) {
                    arg3.method317(var10[var12 * 2], var10[var12 * 2 - -1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field2109, 1, arg5, arg4, arg7);
                }
                arg3.method317(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field2109, 1, arg5, arg4, arg7);
            }
            class16 var16 = null;
            if (var9.field2113 != -1) {
                var16 = var9.method976(arg3, false, true);
                if (var16 != null) {
                    class315.method1835(arg2, arg6 + -32, arg5, arg4, var16, arg8, arg7, arg0);
                }
            }
            if (var9.field2082 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method98();
                }
                class315 var18 = class451.field6653;
                class490 var19 = class117.field1753;
                if (~var9.field2092 == -2) {
                    var19 = class278.field3809;
                    var18 = class297.field4084;
                }
                if (var9.field2092 == 2) {
                    var19 = class407.field5952;
                    var18 = class135.field1949;
                }
                class287.method1714(arg7, arg0, arg4, arg5, var17, 100, var19, arg8, var9.field2082, var18, var9.field2100, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)J")
    public final long method1015(int arg0) {
        ++field5974;
        return arg0 != -6936 ? -37L : super.field1915.method2592();
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)I")
    public final int method1014(boolean arg0) {
        ++field5973;
        if (!arg0) {
            field5984 = null;
        }
        return this.field5978;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(Z)V")
    public static void method2451(boolean arg0) {
        if (arg0) {
            field5984 = null;
        }
        field5972 = null;
        field5983 = null;
        field5984 = null;
        field5979 = null;
    }
}
