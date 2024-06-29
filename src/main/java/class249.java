import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class249 extends class107 {

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    private int field4078 = 4;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    private int field4077 = 0;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    private int field4088 = 8;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    private int field4081 = 1024;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    private int field4091 = 1024;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
    private int field4096 = 409;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    private int field4089 = 81;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    private int field4079 = 204;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4075 = "flash1:";

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field4084 = 0;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "I")
    public static int field4099 = 0;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    private int field4080;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    private int field4082;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "[I")
    private int[] field4083;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "[[I")
    private int[][] field4085;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "[[I")
    private int[][] field4092;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        if (arg0 != 35) {
            this.field4082 = 82;
        }
        ++field4076;
        this.method1693(-86);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    private final void method1693(int arg0) {
        ++field4098;
        Random var2 = new Random((long) this.field4088);
        this.field4080 = this.field4089 / 2;
        this.field4085 = new int[this.field4088][this.field4078 + 1];
        this.field4083 = new int[this.field4088 + 1];
        this.field4092 = new int[this.field4088][this.field4078];
        this.field4097 = 4096 / this.field4088;
        this.field4082 = 4096 / this.field4078;
        int var3 = this.field4097 / 2;
        int var4 = this.field4082 / 2;
        this.field4083[0] = 0;
        if (arg0 <= -27) {
            for (int var5 = 0; var5 < this.field4088; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field4097;
                    int var7 = (class182.method1288(21953, var2, 4096) + -2048) * this.field4079 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field4083[var5] = this.field4083[var5 + -1] + var8;
                }
                this.field4085[var5][0] = 0;
                for (int var9 = 0; ~this.field4078 < ~var9; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field4082;
                        int var11 = (-2048 + class182.method1288(21953, var2, 4096)) * this.field4096 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field4085[var5][var9] = this.field4085[var5][var9 - 1] + var12;
                    }
                    this.field4092[var5][var9] = ~this.field4081 >= -1 ? 4096 : -class182.method1288(21953, var2, this.field4081) + 4096;
                }
                this.field4085[var5][this.field4078] = 4096;
            }
            this.field4083[this.field4088] = 4096;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lrj;IIIIIIIZ)V")
    public static final void method1694(class9 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class35.field567;
        int var11;
        int var12 = var11 = (arg7 << 7) - class280.field4561;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class166.field2746[arg1][arg6][arg7] - class251.field4123;
        int var18 = class166.field2746[arg1][arg6 + 1][arg7] - class251.field4123;
        int var19 = class166.field2746[arg1][arg6 + 1][arg7 + 1] - class251.field4123;
        int var20 = class166.field2746[arg1][arg6][arg7 + 1] - class251.field4123;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class136.field2199;
                        int var46 = (var24 << 9) / var25 + class136.field2194;
                        int var47 = (var27 << 9) / var31 + class136.field2199;
                        int var48 = (var30 << 9) / var31 + class136.field2194;
                        int var49 = (var33 << 9) / var37 + class136.field2199;
                        int var50 = (var36 << 9) / var37 + class136.field2194;
                        int var51 = (var39 << 9) / var43 + class136.field2199;
                        int var52 = (var42 << 9) / var43 + class136.field2194;
                        class136.field2197 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class24.field449 && method1692(class79.field1274 + class136.field2199, class23.field431 + class136.field2194, var50, var52, var48, var49, var51, var47)) {
                                class134.field2179 = arg6;
                                class33.field548 = arg7;
                            }
                            if (!arg8) {
                                class136.field2206 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class136.field2195 || var51 > class136.field2195 || var47 > class136.field2195) {
                                    class136.field2206 = true;
                                }
                                if (arg0.field190 == -1) {
                                    if (arg0.field191 != 12345678) {
                                        class136.method936(var50, var52, var48, var49, var51, var47, arg0.field191, arg0.field192, arg0.field196);
                                    }
                                } else if (class4.field95) {
                                    if (arg0.field195) {
                                        class136.method947(var50, var52, var48, var49, var51, var47, arg0.field191, arg0.field192, arg0.field196, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field190);
                                    } else {
                                        class136.method947(var50, var52, var48, var49, var51, var47, arg0.field191, arg0.field192, arg0.field196, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field190);
                                    }
                                } else {
                                    int var53 = class136.field2196.method1027((byte) 106, arg0.field190);
                                    class136.method936(var50, var52, var48, var49, var51, var47, class287.method1953(var53, arg0.field191), class287.method1953(var53, arg0.field192), class287.method1953(var53, arg0.field196));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class24.field449 && method1692(class79.field1274 + class136.field2199, class23.field431 + class136.field2194, var46, var48, var52, var45, var47, var51)) {
                                class134.field2179 = arg6;
                                class33.field548 = arg7;
                            }
                            if (!arg8) {
                                class136.field2206 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class136.field2195 || var47 > class136.field2195 || var51 > class136.field2195) {
                                    class136.field2206 = true;
                                }
                                if (arg0.field190 == -1) {
                                    if (arg0.field199 != 12345678) {
                                        class136.method936(var46, var48, var52, var45, var47, var51, arg0.field199, arg0.field196, arg0.field192);
                                        return;
                                    }
                                } else {
                                    if (class4.field95) {
                                        class136.method947(var46, var48, var52, var45, var47, var51, arg0.field199, arg0.field196, arg0.field192, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field190);
                                        return;
                                    }
                                    int var54 = class136.field2196.method1027((byte) 97, arg0.field190);
                                    class136.method936(var46, var48, var52, var45, var47, var51, class287.method1953(var54, arg0.field199), class287.method1953(var54, arg0.field196), class287.method1953(var54, arg0.field192));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field4081 = arg1.method1837(252);
                                    }
                                } else {
                                    this.field4089 = arg1.method1837(252);
                                }
                            } else {
                                this.field4077 = arg1.method1837(252);
                            }
                        } else {
                            this.field4091 = arg1.method1837(arg2 + 224);
                        }
                    } else {
                        this.field4079 = arg1.method1837(arg2 ^ 224);
                    }
                } else {
                    this.field4096 = arg1.method1837(252);
                }
            } else {
                this.field4088 = arg1.method1849(arg2 + 227);
            }
        } else {
            this.field4078 = arg1.method1849(255);
        }
        if (arg2 != 28) {
            this.field4078 = -98;
        }
        ++field4086;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public static final void method1695(boolean arg0) {
        ++field4094;
        if (!arg0) {
            if (~class199.field3195 == -6) {
                class199.field3195 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IB)Lfi;")
    public static final class118 method1696(int arg0, byte arg1) {
        ++field4090;
        class118 var2 = (class118) class267.field4326.method1879(arg1 ^ 8844, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 != 59) {
            return null;
        } else {
            byte[] var3 = class139.field2245.method1156(0, arg0, (byte) -16);
            class118 var4 = new class118();
            if (var3 != null) {
                var4.method814(new class274(var3), 23848);
            }
            var4.method810(arg1 + 20640);
            class267.field4326.method1883((long) arg0, 31, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(III)V")
    public static final void method1697(int arg0, int arg1, int arg2) {
        class310.field5022[arg1] = arg0;
        if (arg2 >= -67) {
            method1698(-77);
        }
        ++field4087;
        class199 var3 = (class199) class265.field4318.method371(63, (long) arg1);
        if (var3 != null) {
            if (var3.field3190 != 4611686018427387905L) {
                var3.field3190 = 4611686018427387904L | 500L + class264.method1778(6573);
                return;
            }
        } else {
            class199 var4 = new class199(4611686018427387905L);
            class265.field4318.method368((long) arg1, var4, -92);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field4100;
        int[] var3 = super.field1661.method894(112, arg1);
        int var4 = 107 % ((arg0 - -34) / 49);
        if (super.field1661.field2115) {
            int var5 = 0;
            int var6;
            for (var6 = class259.field4254[arg1] - -this.field4077; ~var6 > -1; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (~var5 > ~this.field4088 && this.field4083[var5] <= var6) {
                ++var5;
            }
            int var7 = var5 + -1;
            int var8 = this.field4083[var5];
            boolean var9 = ~(var5 & 1) == -1;
            int var10 = this.field4083[var5 - 1];
            if (~(this.field4080 + var10) > ~var6 && var6 < -this.field4080 + var8) {
                for (int var11 = 0; var11 < class24.field443; ++var11) {
                    int var12 = 0;
                    int var13 = !var9 ? -this.field4091 : this.field4091;
                    int var14;
                    for (var14 = (this.field4082 * var13 >> 12) + class221.field3486[var11]; ~var14 > -1; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (~this.field4078 < ~var12 && ~this.field4085[var7][var12] >= ~var14) {
                        ++var12;
                    }
                    int var15 = var12 + -1;
                    int var16 = this.field4085[var7][var12];
                    int var17 = this.field4085[var7][var15];
                    if (~var14 < ~(this.field4080 + var17) && ~var14 > ~(-this.field4080 + var16)) {
                        var3[var11] = this.field4092[var7][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class282.method1920(var3, 0, class24.field443, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class249() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method1698(int arg0) {
        if (arg0 != 0) {
            method1692(-62, 67, 58, 93, -76, 55, -104, 39);
        }
        field4075 = null;
    }
}
