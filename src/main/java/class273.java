import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class273 extends class68 {

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    private int field4203 = 4;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "[B")
    private byte[] field4207 = new byte[512];

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "Z")
    private boolean field4210 = true;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    private int field4211 = 0;

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "I")
    private int field4224 = 4;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    private int field4212 = 1638;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "I")
    private int field4227 = 4;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Z")
    public static boolean field4202 = false;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    public static int field4217 = -1;

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "J")
    public static long field4222 = 0L;

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "Ljava/lang/String;")
    public static String field4226 = null;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "I")
    public static int field4228 = 0;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "Luc;")
    public static class39 field4216;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "[I")
    public static int[] field4208;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "[Lke;")
    public static class110[] field4205;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "[S")
    private short[] field4204;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "[S")
    private short[] field4213;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)V")
    private final void method1819(int[] arg0, int arg1, int arg2) {
        ++field4218;
        if (arg2 == 12748) {
            int var4 = class127.field1794[arg1] * this.field4227;
            if (this.field4203 == 1) {
                short var5 = this.field4204[0];
                int var6 = this.field4213[0] << 12;
                int var7 = this.field4224 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field4227 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 - -1;
                int var12 = this.field4207[var10 & 255] & 255;
                if (var11 >= var9) {
                    var11 = 0;
                }
                int var13 = this.field4207[var11 & 255] & 255;
                int var14 = var8 & 4095;
                int var15 = class268.field4102[var14];
                if (!this.field4210) {
                    for (int var16 = 0; ~class89.field1248 < ~var16; ++var16) {
                        int var17 = class215.field3231[var16] * this.field4224;
                        int var18 = this.method1825(var13, -54, var12, var7, var15, var14, var6 * var17 >> 12);
                        arg0[var16] = var5 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; ~class89.field1248 < ~var19; ++var19) {
                        int var20 = class215.field3231[var19] * this.field4224;
                        int var21 = this.method1825(var13, 7, var12, var7, var15, var14, var6 * var20 >> 12);
                        int var22 = var5 * var21 >> 12;
                        arg0[var19] = (var22 >> 1) + 2048;
                    }
                }
            } else {
                short var23 = this.field4204[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field4213[0] << 12;
                    int var25 = this.field4224 * var24 >> 12;
                    int var26 = var4 * var24 >> 12;
                    int var27 = this.field4227 * var24 >> 12;
                    int var28 = var26 >> 12;
                    int var29 = 255 & this.field4207[var28 & 255];
                    int var30 = var28 - -1;
                    int var31 = var26 & 4095;
                    if (~var30 <= ~var27) {
                        var30 = 0;
                    }
                    int var32 = class268.field4102[var31];
                    int var33 = 255 & this.field4207[var30 & 255];
                    for (int var34 = 0; ~class89.field1248 < ~var34; ++var34) {
                        int var54 = class215.field3231[var34] * this.field4224;
                        int var55 = this.method1825(var33, 127, var29, var25, var32, var31, var24 * var54 >> 12);
                        arg0[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; this.field4203 > var35; ++var35) {
                    short var36 = this.field4204[var35];
                    if (var36 > 8 || ~var36 > 7) {
                        int var37 = this.field4213[var35] << 12;
                        int var38 = this.field4224 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = var39 >> 12;
                        int var41 = var39 & 4095;
                        int var42 = var40 - -1;
                        int var43 = this.field4207[var40 & 255] & 255;
                        int var44 = this.field4227 * var37 >> 12;
                        if (~var44 >= ~var42) {
                            var42 = 0;
                        }
                        int var45 = 255 & this.field4207[var42 & 255];
                        int var46 = class268.field4102[var41];
                        if (this.field4210 && ~(this.field4203 - 1) == ~var35) {
                            for (int var47 = 0; var47 < class89.field1248; ++var47) {
                                int var48 = class215.field3231[var47] * this.field4224;
                                int var49 = this.method1825(var45, arg2 + -12624, var43, var38, var46, var41, var37 * var48 >> 12);
                                int var50 = (var36 * var49 >> 12) + arg0[var47];
                                arg0[var47] = 2048 - -(var50 >> 1);
                            }
                        } else {
                            for (int var51 = 0; class89.field1248 > var51; ++var51) {
                                int var52 = class215.field3231[var51] * this.field4224;
                                int var53 = this.method1825(var45, 25, var43, var38, var46, var41, var37 * var52 >> 12);
                                arg0[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        ++field4201;
        this.field4207 = class213.method1388(this.field4211, 512);
        this.method1820((byte) 99);
        if (arg0 > -18) {
            field4216 = null;
        }
        for (int var2 = this.field4203 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field4204[var2];
            if (~var3 < -9 || ~var3 > 7) {
                return;
            }
            --this.field4203;
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)V")
    private final void method1820(byte arg0) {
        ++field4219;
        if (arg0 != 99) {
            this.field4203 = 98;
        }
        if (this.field4212 <= 0) {
            if (this.field4204 != null && this.field4204.length == this.field4203) {
                this.field4213 = new short[this.field4203];
                for (int var2 = 0; ~var2 > ~this.field4203; ++var2) {
                    this.field4213[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field4213 = new short[this.field4203];
            this.field4204 = new short[this.field4203];
            for (int var3 = 0; ~this.field4203 < ~var3; ++var3) {
                this.field4204[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field4212 / 4096.0F), (double) var3)));
                this.field4213[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V")
    public static void method1821(int arg0) {
        field4216 = null;
        field4205 = null;
        field4208 = null;
        if (arg0 == -30572) {
            field4226 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)Z")
    public static final boolean method1822(int arg0) {
        ++field4220;
        try {
            if (~class202.field2806 == -3) {
                if (class197.field2741 == null) {
                    class197.field2741 = class166.method1093(client.field2186, class122.field1705, class247.field3782);
                    if (class197.field2741 == null) {
                        return false;
                    }
                }
                if (class255.field3909 == null) {
                    class255.field3909 = new class178(class159.field2219, class264.field3969);
                }
                if (class181.field2541.method1334(22050, class197.field2741, class255.field3909, class222.field3328, 110)) {
                    class181.field2541.method1356(128);
                    class181.field2541.method1343(true, class131.field1849);
                    class181.field2541.method1335(class82.field1117, class197.field2741, ~arg0);
                    class202.field2806 = 0;
                    client.field2186 = null;
                    class255.field3909 = null;
                    class197.field2741 = null;
                    return true;
                }
            }
            if (arg0 != 0) {
                field4202 = false;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class181.field2541.method1324((byte) -110);
            client.field2186 = null;
            class202.field2806 = 0;
            class255.field3909 = null;
            class197.field2741 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 >= -118) {
            this.method32(100, 47);
        }
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            this.method1819(var3, arg0, 12748);
        }
        ++field4214;
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BLjava/lang/String;)I")
    public static final int method1823(byte arg0, String arg1) {
        ++field4206;
        if (class146.field2037 != null && ~arg1.length() != -1) {
            for (int var2 = 0; ~class146.field2037.field2393 < ~var2; ++var2) {
                if (class180.method1176(class146.field2037.field2395[var2], " ", true, "<br>").equals(arg1)) {
                    return var2;
                }
            }
            if (arg0 >= -17) {
                field4226 = null;
            }
            return -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class273() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
    public static final void method1824(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -62 / ((-46 - arg2) / 63);
        String var5 = "::tele " + arg3 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 63) + "," + (63 & arg0);
        System.out.println(var5);
        ++field4221;
        class42.method283(false, var5);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field4209;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field4227 = arg0.method1453((byte) -128);
                                }
                            } else {
                                this.field4224 = arg0.method1453((byte) -128);
                            }
                        } else {
                            this.field4211 = arg0.method1453((byte) -128);
                        }
                    } else {
                        this.field4224 = this.field4227 = arg0.method1453((byte) -128);
                    }
                } else {
                    this.field4212 = arg0.method1479(false);
                    if (this.field4212 < 0) {
                        this.field4204 = new short[this.field4203];
                        for (int var5 = 0; this.field4203 > var5; ++var5) {
                            this.field4204[var5] = (short) arg0.method1479(!arg2);
                        }
                    }
                }
            } else {
                this.field4203 = arg0.method1453((byte) -128);
            }
        } else {
            this.field4210 = ~arg0.method1453((byte) -127) == -2;
        }
        if (!arg2) {
            this.method1819((int[]) null, -38, 13);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII)I")
    private final int method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4215;
        int var8 = arg5 + -4096;
        int var9 = 119 / ((arg1 - 81) / 42);
        int var10 = arg6 >> 12;
        int var11 = arg6 & 4095;
        int var12 = var11 - 4096;
        int var13 = var10 + 1;
        if (~var13 <= ~arg3) {
            var13 = 0;
        }
        int var14 = var13 & 255;
        int var15 = var10 & 255;
        int var16 = class268.field4102[var11];
        int var17 = this.field4207[var15 - -arg2] & 3;
        int var18;
        if (var17 > 1) {
            var18 = ~var17 == -3 ? var11 - arg5 : -arg5 + -var11;
        } else {
            var18 = var17 != 0 ? -var11 + arg5 : var11 - -arg5;
        }
        int var19 = 3 & this.field4207[arg2 + var14];
        int var20;
        if (~var19 < -2) {
            var20 = ~var19 == -3 ? -arg5 + var12 : -arg5 + -var12;
        } else {
            var20 = var19 == 0 ? arg5 + var12 : -var12 + arg5;
        }
        int var21 = ((-var18 + var20) * var16 >> 12) + var18;
        int var22 = this.field4207[arg0 + var15] & 3;
        int var23;
        if (~var22 >= -2) {
            var23 = ~var22 == -1 ? var8 + var11 : var8 - var11;
        } else {
            var23 = var22 != 2 ? -var11 - var8 : -var8 + var11;
        }
        int var24 = 3 & this.field4207[arg0 + var14];
        int var25;
        if (~var24 < -2) {
            var25 = ~var24 == -3 ? -var8 + var12 : -var8 + -var12;
        } else {
            var25 = ~var24 == -1 ? var12 - -var8 : -var12 + var8;
        }
        int var26 = ((var25 - var23) * var16 >> 12) + var23;
        return var21 - -((-var21 + var26) * arg4 >> 12);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)I")
    public static final int method1826(int arg0, int arg1, int arg2) {
        ++field4225;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 - -789221) * var4 - -1376312589 & arg0;
        return var5 >> 19 & 255;
    }
}
