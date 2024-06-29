import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class234 {

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3820 = 0;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lqh;")
    public static class201 field3819;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static final void method1631(int arg0) {
        if (arg0 == 6) {
            field3822++;
            class90.field1484.method481(false);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method1632(int arg0) {
        if (arg0 == 2) {
            field3819 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public static final void method1633(int arg0) {
        field3818++;
        if (class28.field445 > class221.field3668) {
            class221.field3668 = (float) ((double) class221.field3668 / 30.0D + (double) class221.field3668);
            if (class221.field3668 > class28.field445) {
                class221.field3668 = class28.field445;
            }
            class6.method47(-125);
        } else if (class28.field445 < class221.field3668) {
            class221.field3668 = (float) ((double) class221.field3668 - (double) class221.field3668 / 30.0D);
            if (class28.field445 > class221.field3668) {
                class221.field3668 = class28.field445;
            }
            class6.method47(94);
        }
        if (arg0 <= 117 || class182.field2866 == -1 || class129.field2090 == -1) {
            return;
        }
        int var1 = class182.field2866 - class28.field448;
        int var2 = class129.field2090 - class126.field2046;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class126.field2046 += var2;
        class28.field448 -= -var1;
        if (var1 == 0 && var2 == 0) {
            class182.field2866 = -1;
            class129.field2090 = -1;
        }
        class6.method47(66);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILnb;)V")
    public static final void method1634(int arg0, class207 arg1) {
        class252 var2 = arg1.method1435(0);
        if (arg0 != -256) {
            return;
        }
        arg1.field3338 = var2.field3988;
        field3817++;
        if (arg1.field3399 == 0) {
            arg1.field3337 = 0;
            return;
        }
        if (arg1.field3378 != -1 && arg1.field3406 == 0) {
            class181 var3 = class49.method384(arg1.field3378, arg0 + 346);
            if (arg1.field3346 > 0 && var3.field2842 == 0) {
                arg1.field3337++;
                return;
            }
            if (arg1.field3346 <= 0 && var3.field2843 == 0) {
                arg1.field3337++;
                return;
            }
        }
        int var4 = arg1.field3389;
        int var5 = arg1.field3341;
        int var6 = arg1.field3340[arg1.field3399 - 1] * 128 + arg1.method278(arg0 ^ 0xFFFFFF00) * 64;
        int var7 = arg1.field3321[arg1.field3399 - 1] * 128 + arg1.method278(0) * 64;
        if ((var6 - var4) > 256 || var6 - var4 < -256 || (var7 - var5) > 256 || var7 - var5 < -256) {
            arg1.field3341 = var7;
            arg1.field3389 = var6;
            return;
        }
        if (var4 >= var6) {
            if (var6 < var4) {
                if (var5 < var7) {
                    arg1.field3322 = 768;
                } else if (var7 < var5) {
                    arg1.field3322 = 256;
                } else {
                    arg1.field3322 = 512;
                }
            } else if (var5 < var7) {
                arg1.field3322 = 1024;
            } else if (var5 > var7) {
                arg1.field3322 = 0;
            }
        } else if (var7 > var5) {
            arg1.field3322 = 1280;
        } else if (var5 > var7) {
            arg1.field3322 = 1792;
        } else {
            arg1.field3322 = 1536;
        }
        int var8 = arg1.field3322 - arg1.field3320 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var9 = var2.field4007;
        if (var8 >= -256 && var8 <= 256) {
            var9 = var2.field4012;
        } else if (var8 >= 256 && var8 < 768) {
            var9 = var2.field3993;
        } else if (var8 >= -768 && var8 <= -256) {
            var9 = var2.field4006;
        }
        if (var9 == -1) {
            var9 = var2.field4012;
        }
        arg1.field3338 = var9;
        int var10 = 4;
        boolean var11 = true;
        byte var12 = 1;
        if (arg1 instanceof class15) {
            var11 = ((class15) arg1).field258.field1765;
        }
        if (var11) {
            if (arg1.field3322 != arg1.field3320 && arg1.field3374 == -1 && arg1.field3362 != 0) {
                var10 = 2;
            }
            if (arg1.field3399 > 2) {
                var10 = 6;
            }
            if (arg1.field3399 > 3) {
                var10 = 8;
            }
            if (arg1.field3337 > 0 && arg1.field3399 > 1) {
                arg1.field3337--;
                var10 = 8;
            }
        } else {
            if (arg1.field3399 > 1) {
                var10 = 6;
            }
            if (arg1.field3399 > 2) {
                var10 = 8;
            }
            if (arg1.field3337 > 0 && arg1.field3399 > 1) {
                arg1.field3337--;
                var10 = 8;
            }
        }
        if (arg1.field3365[arg1.field3399 - 1] == 2) {
            var10 <<= 0x1;
            var12 = 2;
        } else if (arg1.field3365[arg1.field3399 - 1] == 0) {
            var12 = 0;
            var10 >>= 0x1;
        }
        if (var10 < 8 || var2.field4021 == -1) {
            if (var2.field4001 != -1 && var12 == 0) {
                if (arg1.field3338 == var2.field4007 && var2.field4023 != -1) {
                    arg1.field3338 = var2.field4023;
                } else if (arg1.field3338 == var2.field4006 && var2.field3992 != -1) {
                    arg1.field3338 = var2.field3992;
                } else if (arg1.field3338 == var2.field3993 && var2.field4000 != -1) {
                    arg1.field3338 = var2.field4000;
                } else {
                    arg1.field3338 = var2.field4001;
                }
            }
        } else if (arg1.field3338 == var2.field4007 && var2.field4016 != -1) {
            arg1.field3338 = var2.field4016;
        } else if (arg1.field3338 == var2.field4006 && var2.field3998 != -1) {
            arg1.field3338 = var2.field3998;
        } else if (arg1.field3338 == var2.field3993 && var2.field3996 != -1) {
            arg1.field3338 = var2.field3996;
        } else {
            arg1.field3338 = var2.field4021;
        }
        if (var2.field4013 != -1) {
            int var13 = var10 << 7;
            if (arg1.field3399 == 1) {
                int var14 = arg1.field3372 * arg1.field3372;
                int var15 = (var6 < arg1.field3389 ? arg1.field3389 - var6 : var6 - arg1.field3389) << 7;
                int var16 = (arg1.field3341 > var7 ? arg1.field3341 - var7 : -arg1.field3341 + var7) << 7;
                int var17 = var16 >= var15 ? var16 : var15;
                int var18 = var17 * 2 * var2.field4013;
                if (var18 < var14) {
                    arg1.field3372 /= 2;
                } else if (var17 < var14 / 2) {
                    arg1.field3372 -= var2.field4013;
                    if (arg1.field3372 < 0) {
                        arg1.field3372 = 0;
                    }
                } else if (arg1.field3372 < var13) {
                    arg1.field3372 += var2.field4013;
                    if (var13 < arg1.field3372) {
                        arg1.field3372 = var13;
                    }
                }
            } else if (var13 > arg1.field3372) {
                arg1.field3372 += var2.field4013;
                if (arg1.field3372 > var13) {
                    arg1.field3372 = var13;
                }
            } else if (arg1.field3372 > 0) {
                arg1.field3372 -= var2.field4013;
                if (arg1.field3372 < 0) {
                    arg1.field3372 = 0;
                }
            }
            var10 = arg1.field3372 >> 7;
            if (var10 < 1) {
                var10 = 1;
            }
        }
        if (var5 < var7) {
            arg1.field3341 += var10;
            if (arg1.field3341 > var7) {
                arg1.field3341 = var7;
            }
        } else if (var5 > var7) {
            arg1.field3341 -= var10;
            if (var7 > arg1.field3341) {
                arg1.field3341 = var7;
            }
        }
        if (var4 < var6) {
            arg1.field3389 += var10;
            if (arg1.field3389 > var6) {
                arg1.field3389 = var6;
            }
        } else if (var4 > var6) {
            arg1.field3389 -= var10;
            if (var6 > arg1.field3389) {
                arg1.field3389 = var6;
            }
        }
        if (arg1.field3389 == var6 && arg1.field3341 == var7) {
            if (arg1.field3346 > 0) {
                arg1.field3346--;
            }
            arg1.field3399--;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)V")
    public static final void method1635(byte arg0, int arg1, int arg2) {
        field3821++;
        class173 var3 = class34.method289(arg1, (byte) -94);
        int var4 = var3.field2729;
        int var5 = var3.field2724;
        if (arg0 >= -89) {
            field3820 = 86;
        }
        int var6 = var3.field2730;
        int var7 = class285.field4504[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class113.method832(var4, class43.field794[var4] & ~var8 | var8 & arg2 << var5, (byte) -59);
    }
}
