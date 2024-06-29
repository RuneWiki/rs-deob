import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class175 extends class117 {

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    private int field3184 = 4;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    private int field3187 = 4;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    private int field3178 = 4;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "Z")
    private boolean field3182 = true;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    private int field3186 = 1638;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
    private int field3194 = 0;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "[B")
    private byte[] field3201 = new byte[512];

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "[I")
    public static int[] field3181 = new int[256];

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Lhh;")
    public static class163 field3179 = class137.method1065(")4a=", 17);

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "Lhh;")
    public static class163 field3193 = class137.method1065("(U5", 17);

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    public static int field3192 = -1;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "Lpg;")
    public static class81 field3191;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "[S")
    private short[] field3190;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "[S")
    private short[] field3197;

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class175() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    private final void method1293(int arg0) {
        int var2 = -60 / ((arg0 - 4) / 41);
        if (this.field3186 > 0) {
            this.field3190 = new short[this.field3178];
            this.field3197 = new short[this.field3178];
            for (int var3 = 0; ~this.field3178 < ~var3; ++var3) {
                this.field3197[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3186 / 4096.0F), (double) var3)));
                this.field3190[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field3197 != null && this.field3197.length == this.field3178) {
            this.field3190 = new short[this.field3178];
            for (int var4 = 0; ~this.field3178 < ~var4; ++var4) {
                this.field3190[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
        ++field3183;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field3189;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3184 = arg2.method622(true);
                                }
                            } else {
                                this.field3187 = arg2.method622(true);
                            }
                        } else {
                            this.field3194 = arg2.method622(true);
                        }
                    } else {
                        this.field3187 = this.field3184 = arg2.method622(true);
                    }
                } else {
                    this.field3186 = arg2.method647(true);
                    if (~this.field3186 > -1) {
                        this.field3197 = new short[this.field3178];
                        for (int var5 = 0; var5 < this.field3178; ++var5) {
                            this.field3197[var5] = (short) arg2.method647(true);
                        }
                    }
                }
            } else {
                this.field3178 = arg2.method622(true);
            }
        } else {
            this.field3182 = ~arg2.method622(true) == -2;
        }
        if (arg0 != 0) {
            method1297(11, 54);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Lhh;")
    public static final class163 method1294(int arg0, int arg1) {
        if (arg0 != -30900) {
            method1296(-114);
        }
        ++field3200;
        if (~arg1 > -100001) {
            return class145.method1101(arg0 ^ -30900, new class163[] { class30.field474, class136.method1061(arg1, (byte) 116), class110.field2076 });
        } else {
            return arg1 < 10000000 ? class145.method1101(arg0 + 30900, new class163[] { class68.field1153, class136.method1061(arg1 / 1000, (byte) 104), class39.field655, class110.field2076 }) : class145.method1101(arg0 ^ -30900, new class163[] { class215.field3919, class136.method1061(arg1 / 1000000, (byte) 124), class119.field2246, class110.field2076 });
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[IZ)V")
    private final void method1295(int arg0, int[] arg1, boolean arg2) {
        ++field3196;
        int var4 = class214.field3911[arg0] * this.field3184;
        if (arg2) {
            field3192 = 42;
        }
        if (this.field3178 == 1) {
            int var5 = this.field3190[0] << 12;
            short var6 = this.field3197[0];
            int var7 = var4 * var5 >> 12;
            int var8 = var7 >> 12;
            int var9 = this.field3187 * var5 >> 12;
            int var10 = 255 & this.field3201[255 & var8];
            int var11 = var8 + 1;
            int var12 = var7 & 4095;
            int var13 = class11.field176[var12];
            int var14 = this.field3184 * var5 >> 12;
            if (~var11 <= ~var14) {
                var11 = 0;
            }
            int var15 = this.field3201[var11 & 255] & 255;
            if (!this.field3182) {
                for (int var16 = 0; ~class143.field2702 < ~var16; ++var16) {
                    int var17 = class26.field402[var16] * this.field3187;
                    int var18 = this.method1299(1238832940, var10, var13, var12, var9, var15, var5 * var17 >> 12);
                    arg1[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; ~var19 > ~class143.field2702; ++var19) {
                    int var20 = class26.field402[var19] * this.field3187;
                    int var21 = this.method1299(1238832940, var10, var13, var12, var9, var15, var5 * var20 >> 12);
                    int var22 = var6 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field3197[0];
            if (var23 > 8 || ~var23 > 7) {
                int var24 = this.field3190[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field3187 * var24 >> 12;
                int var27 = var25 >> 12;
                int var28 = var27 - -1;
                int var29 = this.field3184 * var24 >> 12;
                int var30 = 255 & this.field3201[var27 & 255];
                if (~var29 >= ~var28) {
                    var28 = 0;
                }
                int var31 = 255 & this.field3201[var28 & 255];
                int var32 = var25 & 4095;
                int var33 = class11.field176[var32];
                for (int var34 = 0; ~var34 > ~class143.field2702; ++var34) {
                    int var54 = class26.field402[var34] * this.field3187;
                    int var55 = this.method1299(1238832940, var30, var33, var32, var26, var31, var24 * var54 >> 12);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field3178 < ~var35; ++var35) {
                short var36 = this.field3197[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field3190[var35] << 12;
                    int var38 = this.field3184 * var37 >> 12;
                    int var39 = this.field3187 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = var41 - -1;
                    if (var38 <= var42) {
                        var42 = 0;
                    }
                    int var43 = var40 & 4095;
                    int var44 = class11.field176[var43];
                    int var45 = this.field3201[var42 & 255] & 255;
                    int var46 = this.field3201[var41 & 255] & 255;
                    if (this.field3182 && this.field3178 - 1 == var35) {
                        for (int var47 = 0; class143.field2702 > var47; ++var47) {
                            int var48 = class26.field402[var47] * this.field3187;
                            int var49 = this.method1299(1238832940, var46, var44, var43, var39, var45, var37 * var48 >> 12);
                            int var50 = arg1[var47] - -(var36 * var49 >> 12);
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class143.field2702; ++var51) {
                            int var52 = class26.field402[var51] * this.field3187;
                            int var53 = this.method1299(1238832940, var46, var44, var43, var39, var45, var37 * var52 >> 12);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)V")
    public static void method1296(int arg0) {
        field3193 = null;
        field3181 = null;
        field3179 = null;
        field3191 = null;
        if (arg0 != 33) {
            field3192 = -118;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)Lj;")
    public static final class117 method1297(int arg0, int arg1) {
        ++field3195;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (arg0 != 8) {
                                            if (arg0 != 9) {
                                                if (arg0 != 10) {
                                                    if (~arg0 != -12) {
                                                        if (~arg0 != -13) {
                                                            if (arg0 != 13) {
                                                                if (arg0 != 14) {
                                                                    if (~arg0 != -16) {
                                                                        if (arg0 != 16) {
                                                                            if (arg0 != 17) {
                                                                                if (arg0 != 18) {
                                                                                    if (arg0 != 19) {
                                                                                        if (~arg0 != -21) {
                                                                                            if (~arg0 != -22) {
                                                                                                if (arg0 != 22) {
                                                                                                    if (arg0 != 23) {
                                                                                                        if (arg0 != 24) {
                                                                                                            if (arg0 != 25) {
                                                                                                                if (~arg0 != -27) {
                                                                                                                    if (~arg0 != -28) {
                                                                                                                        if (~arg0 != -29) {
                                                                                                                            if (~arg0 != -30) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (arg0 != 31) {
                                                                                                                                        if (arg0 != 32) {
                                                                                                                                            if (arg0 != 33) {
                                                                                                                                                if (~arg0 != -35) {
                                                                                                                                                    if (arg0 != 35) {
                                                                                                                                                        if (arg0 != 36) {
                                                                                                                                                            if (arg0 != 37) {
                                                                                                                                                                if (~arg0 != -39) {
                                                                                                                                                                    if (arg0 == 39) {
                                                                                                                                                                        return new class13();
                                                                                                                                                                    } else {
                                                                                                                                                                        if (arg1 != 3) {
                                                                                                                                                                            field3181 = null;
                                                                                                                                                                        }
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class180();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class8();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class170();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class153();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class175();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class68();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class49();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class260();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class218();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class33();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class73();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class100();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class188();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class240();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class192();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class110();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class102();
                                                                                                }
                                                                                            } else {
                                                                                                return new class164();
                                                                                            }
                                                                                        } else {
                                                                                            return new class91();
                                                                                        }
                                                                                    } else {
                                                                                        return new class210();
                                                                                    }
                                                                                } else {
                                                                                    return new class203();
                                                                                }
                                                                            } else {
                                                                                return new class214();
                                                                            }
                                                                        } else {
                                                                            return new class50();
                                                                        }
                                                                    } else {
                                                                        return new class256();
                                                                    }
                                                                } else {
                                                                    return new class59();
                                                                }
                                                            } else {
                                                                return new class253();
                                                            }
                                                        } else {
                                                            return new class209();
                                                        }
                                                    } else {
                                                        return new class52();
                                                    }
                                                } else {
                                                    return new class65();
                                                }
                                            } else {
                                                return new class87();
                                            }
                                        } else {
                                            return new class26();
                                        }
                                    } else {
                                        return new class257();
                                    }
                                } else {
                                    return new class228();
                                }
                            } else {
                                return new class244();
                            }
                        } else {
                            return new class145();
                        }
                    } else {
                        return new class238();
                    }
                } else {
                    return new class24();
                }
            } else {
                return new class174();
            }
        } else {
            return new class248();
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg5;
        ++field3180;
        int var9 = 0;
        int var10 = 0;
        int var11 = -arg3 + arg4;
        int var12 = -arg3 + arg5;
        int var13 = arg4 * arg4;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var14 << 1;
        int var17 = var12 * var12;
        int var18 = var13 << 1;
        int var19 = var17 << 1;
        int var20 = arg5 << 1;
        int var21 = var15 << 1;
        int var22 = var12 << 1;
        int var23 = (-var20 + 1) * var13 + var16;
        int var24 = (-var22 + 1) * var15 + var19;
        int var25 = var13 << 2;
        int var26 = -((var22 + -1) * var21) + var17;
        int var27 = var17 << 2;
        int var28 = var14 << 2;
        int var29 = var14 - (var20 + -1) * var18;
        if (arg2 > -73) {
            field3191 = null;
        }
        int var30 = (var20 - 3) * var18;
        int var31 = var16 * 3;
        int var32 = var15 << 2;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var21;
        int var35 = var27;
        int var36 = (var12 - 1) * var32;
        int var37 = var28;
        if (~arg0 <= ~class182.field3344 && class201.field3593 >= arg0) {
            int[] var38 = class85.field1605[arg0];
            int var39 = class221.method1561(class127.field2465, (byte) -42, -arg4 + arg6, class252.field4407);
            int var40 = class221.method1561(class127.field2465, (byte) -42, arg4 + arg6, class252.field4407);
            int var41 = class221.method1561(class127.field2465, (byte) -42, -var11 + arg6, class252.field4407);
            int var42 = class221.method1561(class127.field2465, (byte) -42, arg6 + var11, class252.field4407);
            class227.method1585(var39, (byte) -66, arg7, var38, var41);
            class227.method1585(var41, (byte) -66, arg1, var38, var42);
            class227.method1585(var42, (byte) -66, arg7, var38, var40);
        }
        int var43 = (arg5 + -1) * var25;
        while (var8 > 0) {
            if (~var23 > -1) {
                while (var23 < 0) {
                    var29 += var37;
                    ++var9;
                    var23 += var31;
                    var31 += var28;
                    var37 += var28;
                }
            }
            if (~var29 > -1) {
                var23 += var31;
                ++var9;
                var31 += var28;
                var29 += var37;
                var37 += var28;
            }
            boolean var44 = var12 >= var8;
            var29 += -var30;
            --var8;
            var30 -= var25;
            int var45 = -var8 + arg0;
            int var46 = arg0 + var8;
            var23 += -var43;
            if (var44) {
                if (var24 < 0) {
                    while (~var24 > -1) {
                        ++var10;
                        var24 += var33;
                        var26 += var35;
                        var35 += var27;
                        var33 += var27;
                    }
                }
                if (var26 < 0) {
                    ++var10;
                    var24 += var33;
                    var33 += var27;
                    var26 += var35;
                    var35 += var27;
                }
                var24 += -var36;
                var36 -= var32;
                var26 += -var34;
                var34 -= var32;
            }
            var43 -= var25;
            if (~var46 <= ~class182.field3344 && ~class201.field3593 <= ~var45) {
                int var47 = class221.method1561(class127.field2465, (byte) -42, arg6 + var9, class252.field4407);
                int var48 = class221.method1561(class127.field2465, (byte) -42, -var9 + arg6, class252.field4407);
                if (var44) {
                    int var49 = class221.method1561(class127.field2465, (byte) -42, arg6 - -var10, class252.field4407);
                    int var50 = class221.method1561(class127.field2465, (byte) -42, arg6 - var10, class252.field4407);
                    if (~class182.field3344 >= ~var45) {
                        int[] var51 = class85.field1605[var45];
                        class227.method1585(var48, (byte) -66, arg7, var51, var50);
                        class227.method1585(var50, (byte) -66, arg1, var51, var49);
                        class227.method1585(var49, (byte) -66, arg7, var51, var47);
                    }
                    if (~class201.field3593 <= ~var46) {
                        int[] var52 = class85.field1605[var46];
                        class227.method1585(var48, (byte) -66, arg7, var52, var50);
                        class227.method1585(var50, (byte) -66, arg1, var52, var49);
                        class227.method1585(var49, (byte) -66, arg7, var52, var47);
                    }
                } else {
                    if (~class182.field3344 >= ~var45) {
                        class227.method1585(var48, (byte) -66, arg7, class85.field1605[var45], var47);
                    }
                    if (~class201.field3593 <= ~var46) {
                        class227.method1585(var48, (byte) -66, arg7, class85.field1605[var46], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)I")
    private final int method1299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3203;
        int var8 = arg3 + -4096;
        int var9 = arg6 >> 12;
        if (arg0 != 1238832940) {
            return 77;
        } else {
            int var10 = arg6 & 4095;
            int var11 = class11.field176[var10];
            int var12 = var9 - -1;
            if (~arg4 >= ~var12) {
                var12 = 0;
            }
            int var13 = var9 & 255;
            int var14 = 3 & this.field3201[arg1 + var13];
            int var15;
            if (var14 <= 1) {
                var15 = ~var14 != -1 ? -var10 + arg3 : arg3 + var10;
            } else {
                var15 = ~var14 == -3 ? var10 - arg3 : -arg3 + -var10;
            }
            int var16 = var10 + -4096;
            int var17 = var12 & 255;
            int var18 = 3 & this.field3201[arg1 + var17];
            int var19;
            if (~var18 >= -2) {
                var19 = var18 != 0 ? -var16 + arg3 : arg3 + var16;
            } else {
                var19 = var18 == 2 ? -arg3 + var16 : -var16 - arg3;
            }
            int var20 = 3 & this.field3201[var13 - -arg5];
            int var21 = var15 - -((-var15 + var19) * var11 >> 12);
            int var22;
            if (var20 > 1) {
                var22 = ~var20 != -3 ? -var8 + -var10 : -var8 + var10;
            } else {
                var22 = var20 == 0 ? var8 + var10 : -var10 + var8;
            }
            int var23 = this.field3201[arg5 + var17] & 3;
            int var24;
            if (~var23 < -2) {
                var24 = ~var23 == -3 ? -var8 + var16 : -var16 - var8;
            } else {
                var24 = var23 != 0 ? -var16 + var8 : var8 + var16;
            }
            int var25 = ((-var22 + var24) * var11 >> 12) + var22;
            return var21 - -((-var21 + var25) * arg2 >> 12);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            return null;
        } else {
            ++field3199;
            int[] var3 = super.field2218.method1044(arg1, 0);
            if (super.field2218.field2587) {
                this.method1295(arg1, var3, false);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILdb;IZLnk;ILgj;I)V")
    public static final void method1300(int arg0, class35 arg1, int arg2, boolean arg3, class2 arg4, int arg5, class126 arg6, int arg7) {
        ++field3185;
        class247 var8 = new class247();
        var8.field4368 = arg0;
        var8.field4361 = arg7 * 128;
        var8.field4373 = arg2 * 128;
        if (arg1 != null) {
            var8.field4347 = arg1.field533;
            var8.field4359 = arg1.field604;
            var8.field4357 = arg1.field572;
            var8.field4363 = arg1;
            int var9 = arg1.field591;
            int var10 = arg1.field574;
            if (~arg5 == -2 || arg5 == 3) {
                var10 = arg1.field591;
                var9 = arg1.field574;
            }
            var8.field4370 = arg1.field597;
            var8.field4358 = arg1.field541 * 128;
            var8.field4364 = (arg2 + var9) * 128;
            var8.field4356 = (arg7 - -var10) * 128;
            if (arg1.field577 != null) {
                var8.field4354 = true;
                var8.method1702(-19613);
            }
            if (var8.field4359 != null) {
                var8.field4352 = var8.field4357 - -((int) (Math.random() * (double) (-var8.field4357 + var8.field4347)));
            }
            class21.field334.method1018((byte) 104, var8);
        } else if (arg4 != null) {
            class181 var11 = arg4.field41;
            var8.field4374 = arg4;
            if (var11.field3329 != null) {
                var8.field4354 = true;
                var11 = var11.method1330(-1);
            }
            if (var11 != null) {
                var8.field4364 = (var11.field3274 + arg2) * 128;
                var8.field4356 = (var11.field3274 + arg7) * 128;
                var8.field4370 = class116.method926(arg4, 10);
                var8.field4358 = var11.field3307 * 128;
            }
            class57.field943.method1018((byte) 115, var8);
        } else if (arg6 != null) {
            var8.field4350 = arg6;
            var8.field4364 = (arg2 - -arg6.field3645) * 128;
            var8.field4356 = (arg6.field3645 + arg7) * 128;
            var8.field4370 = class223.method1574(11770, arg6);
            var8.field4358 = arg6.field2440 * 128;
            class39.field649.method1741(var8, false, arg6.field2424.method1193((byte) 65));
        }
        if (arg3) {
            method1298(-55, -86, 58, -5, -116, -122, -44, -43);
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        this.field3201 = class4.method37((byte) -101, this.field3194);
        if (arg0 < -92) {
            ++field3204;
            this.method1293(77);
            for (int var2 = this.field3178 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field3197[var2];
                if (~var3 < -9) {
                    return;
                }
                if (var3 < -8) {
                    return;
                }
                --this.field3178;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILhh;)Lek;")
    public static final class76 method1301(int arg0, class163 arg1) {
        if (arg0 != 16) {
            method1301(126, (class163) null);
        }
        ++field3188;
        for (class76 var2 = (class76) class259.field4530.method1017(78); var2 != null; var2 = (class76) class259.field4530.method1016((byte) -31)) {
            if (var2.field1438.method1208(arg1, (byte) -124)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "(I)V")
    public static final void method1302(int arg0) {
        class191.field3499.method75(218, 37);
        if (arg0 != 3) {
            field3181 = null;
        }
        ++class119.field2251;
        ++field3198;
        for (class222 var1 = (class222) class92.field1739.method1747((byte) 112); var1 != null; var1 = (class222) class92.field1739.method1745(-32496)) {
            if (var1.field4046 == 0) {
                class115.method913(true, var1, (byte) 106);
            }
        }
        if (class18.field283 != null) {
            class213.method1517((byte) 11, class18.field283);
            class18.field283 = null;
        }
    }
}
