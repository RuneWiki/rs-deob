import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class345 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "B")
    public byte field5410;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public int field5414;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    private int field5427;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lgh;")
    public class345 field5420;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field5408 = 0;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field5418 = -1;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[Ldl;")
    public static class48[] field5415 = new class48[14];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field5405;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field5409;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field5412;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public int field5416;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public int field5421;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public int field5423;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public int field5425;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 3)
    public static void method2225(byte arg0) {
        int var1 = -111 % ((64 - arg0) / 37);
        field5415 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)Lgh;", line = 12)
    public final class345 method2226(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            field5422++;
            return new class345(this.field5427, arg3, arg0, arg2, this.field5410);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Lvj;", line = 39)
    public final class153 method2227(int arg0) {
        field5419++;
        int var2 = 96 / ((-arg0 - 17) / 42);
        return class445.method2675(this.field5427, true);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZILou;)V", line = 50)
    public static final void method2228(boolean arg0, int arg1, class197 arg2) {
        field5406++;
        class49 var3 = arg2.method1308(-13076);
        if (arg2.field3153 == 0) {
            arg2.field3155 = 0;
            class507.field7382 = 0;
            class453.field6756 = -1;
            return;
        }
        if (arg2.field3136 != -1 && arg2.field3098 == 0) {
            class145 var4 = class130.field2232.method634(-1271654143, arg2.field3136);
            if (arg2.field3154 > 0 && var4.field2366 == 0) {
                class453.field6756 = -1;
                class507.field7382 = 0;
                arg2.field3155++;
                return;
            }
            if (arg2.field3154 <= 0 && var4.field2365 == 0) {
                class453.field6756 = -1;
                arg2.field3155++;
                class507.field7382 = 0;
                return;
            }
        }
        if (arg2.field3107 != -1 && class504.field7348 >= arg2.field3079) {
            class526 var5 = class30.field482.method2630((byte) 97, arg2.field3107);
            if (var5.field7743 && var5.field7752 != -1) {
                class145 var6 = class130.field2232.method634(-1271654143, var5.field7752);
                if (arg2.field3154 > 0 && var6.field2366 == 0) {
                    arg2.field3155++;
                    class453.field6756 = -1;
                    class507.field7382 = 0;
                    return;
                }
                if (arg2.field3154 <= 0 && var6.field2365 == 0) {
                    arg2.field3155++;
                    class507.field7382 = 0;
                    class453.field6756 = -1;
                    return;
                }
            }
        }
        if (arg2.field3107 != -1 && class504.field7348 >= arg2.field3079) {
            class526 var7 = class30.field482.method2630((byte) 115, arg2.field3107);
            if (var7.field7743 && var7.field7752 != -1) {
                class145 var8 = class130.field2232.method634(-1271654143, var7.field7752);
                if (arg2.field3154 > 0 && var8.field2366 == 0) {
                    arg2.field3155++;
                    class453.field6756 = -1;
                    class507.field7382 = 0;
                    return;
                }
                if (arg2.field3154 <= 0 && var8.field2365 == 0) {
                    class453.field6756 = -1;
                    class507.field7382 = 0;
                    arg2.field3155++;
                    return;
                }
            }
        }
        int var9 = arg2.field4716;
        int var10 = arg2.field4714;
        int var11 = arg2.field3159[arg2.field3153 - 1] * 128 + (arg2.method1143(0) * 64);
        int var12 = arg2.field3158[arg2.field3153 - 1] * 128 + arg2.method1143(0) * 64;
        if (var9 < var11) {
            if (var12 > var10) {
                arg2.method1304(10240, false);
            } else if (var12 >= var10) {
                arg2.method1304(12288, false);
            } else {
                arg2.method1304(14336, false);
            }
        } else if (var9 <= var11) {
            if (var12 > var10) {
                arg2.method1304(8192, false);
            } else if (var12 < var10) {
                arg2.method1304(0, false);
            }
        } else if (var10 < var12) {
            arg2.method1304(6144, false);
        } else if (var10 <= var12) {
            arg2.method1304(4096, false);
        } else {
            arg2.method1304(2048, false);
        }
        if (arg1 <= 109) {
            field5418 = 53;
        }
        byte var13 = arg2.field3152[arg2.field3153 - 1];
        if (!arg0 && (var11 - var9) > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || (var12 - var10) < -256) {
            arg2.field4714 = var12;
            arg2.field4716 = var11;
            arg2.method1305(16383, false, arg2.field3104);
            arg2.field3153--;
            if (arg2.field3154 > 0) {
                arg2.field3154--;
            }
            class507.field7382 = 0;
            class453.field6756 = -1;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg2 instanceof class265) {
            var15 = ((class265) arg2).field4430.field7432;
        }
        if (var15) {
            int var16 = arg2.field3104 - arg2.field3087.field5264;
            if (var16 != 0 && arg2.field3065 == -1 && arg2.field3135 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg2.field3153 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg2.field3153 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg2.field3153 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg2.field3153 > 2) {
                var14 = 8;
            }
        }
        if (arg2.field3155 > 0 && arg2.field3153 > 1) {
            var14 = 8;
            arg2.field3155--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field795 != -1) {
            int var17 = var14 << 7;
            if (arg2.field3153 == 1) {
                int var18 = arg2.field3156 * arg2.field3156;
                int var19 = (arg2.field4716 <= var11 ? var11 - arg2.field4716 : arg2.field4716 - var11) << 7;
                int var20 = (arg2.field4714 > var12 ? arg2.field4714 - var12 : -arg2.field4714 + var12) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field795 * var21 * 2;
                if (var22 < var18) {
                    arg2.field3156 /= 2;
                } else if (var21 < var18 / 2) {
                    arg2.field3156 -= var3.field795;
                    if (arg2.field3156 < 0) {
                        arg2.field3156 = 0;
                    }
                } else if (arg2.field3156 < var17) {
                    arg2.field3156 += var3.field795;
                    if (var17 < arg2.field3156) {
                        arg2.field3156 = var17;
                    }
                }
            } else if (var17 > arg2.field3156) {
                arg2.field3156 += var3.field795;
                if (var17 < arg2.field3156) {
                    arg2.field3156 = var17;
                }
            } else if (arg2.field3156 > 0) {
                arg2.field3156 -= var3.field795;
                if (arg2.field3156 < 0) {
                    arg2.field3156 = 0;
                }
            }
            var14 = arg2.field3156 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class507.field7382 = 0;
        if (var9 == var11 && var10 == var12) {
            class453.field6756 = -1;
        } else {
            if (var11 > var9) {
                arg2.field4716 += var14;
                class507.field7382 |= 0x4;
                if (arg2.field4716 > var11) {
                    arg2.field4716 = var11;
                }
            } else if (var11 < var9) {
                arg2.field4716 -= var14;
                class507.field7382 |= 0x8;
                if (var11 > arg2.field4716) {
                    arg2.field4716 = var11;
                }
            }
            if (var14 >= 8) {
                class453.field6756 = 2;
            } else {
                class453.field6756 = var13;
            }
            if (var12 > var10) {
                arg2.field4714 += var14;
                class507.field7382 |= 0x1;
                if (var12 < arg2.field4714) {
                    arg2.field4714 = var12;
                }
            } else if (var12 < var10) {
                arg2.field4714 -= var14;
                class507.field7382 |= 0x2;
                if (var12 > arg2.field4714) {
                    arg2.field4714 = var12;
                }
            }
        }
        if (arg2.field4716 == var11 && arg2.field4714 == var12) {
            if (arg2.field3154 > 0) {
                arg2.field3154--;
            }
            arg2.field3153--;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z", line = 409)
    public static final boolean method2229(int arg0, int arg1, int arg2) {
        int var3 = 42 % ((-arg2 - 10) / 60);
        field5417++;
        return (class536.method3173(arg0, -1, arg1) | (arg1 & 0x2000) != 0 | class444.method2665(arg1, arg0, false)) & class195.method1300(arg1, -46, arg0);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIB)V", line = 426)
    public class345(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field5407 = arg2;
        this.field5410 = arg4;
        this.field5414 = arg3;
        this.field5426 = arg1;
        this.field5427 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lgh;I)V", line = 437)
    public class345(class345 arg0, int arg1) {
        this.field5420 = arg0;
        this.field5414 = this.field5420.field5414 + arg1;
        this.field5427 = this.field5420.field5427;
        this.field5426 = this.field5420.field5426 + arg1;
        this.field5410 = this.field5420.field5410;
        this.field5407 = this.field5420.field5407 + arg1;
    }
}
