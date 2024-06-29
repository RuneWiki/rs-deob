import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class154 {

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2135 = "Allocated memory";

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "S")
    public static short field2138 = 1;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Ldc;")
    public static class75 field2133;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lda;", line = 8)
    public static final class155 method1112(int arg0, int arg1) {
        field2137++;
        if (arg1 >= -47) {
            field2133 = (class75) null;
        }
        class155 var2 = (class155) class8.field84.method716((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1122.method955(30, arg0, -21853);
        class155 var4 = new class155();
        if (var3 != null) {
            var4.method1121(0, new class316(var3), arg0);
        }
        class8.field84.method721((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Z", line = 32)
    public static final boolean method1113(int arg0) {
        field2140++;
        if (class67.field908) {
            return true;
        } else {
            if (arg0 >= -99) {
                field2134 = -85;
            }
            return class292.field4355;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILbo;)V", line = 49)
    public static final void method1114(int arg0, class256 arg1) {
        field2132++;
        int var2 = -54 % ((arg0 + 40) / 35);
        class194 var3 = arg1.method1753(-1);
        arg1.field3719 = var3.field2665;
        if (arg1.field3743 == 0) {
            arg1.field3662 = 0;
            return;
        }
        if (arg1.field3668 != -1 && arg1.field3762 == 0) {
            class125 var4 = class52.method361(true, arg1.field3668);
            if (arg1.field3727 > 0 && var4.field1717 == 0) {
                arg1.field3662++;
                return;
            }
            if (arg1.field3727 <= 0 && var4.field1709 == 0) {
                arg1.field3662++;
                return;
            }
        }
        if (arg1.field3715 != -1 && arg1.field3710 <= class329.field4966) {
            class309 var5 = class336.method2329(-42, arg1.field3715);
            if (var5.field4664 && var5.field4662 != -1) {
                class125 var6 = class52.method361(true, var5.field4662);
                if (arg1.field3727 > 0 && var6.field1717 == 0) {
                    arg1.field3662++;
                    return;
                }
                if (arg1.field3727 <= 0 && var6.field1709 == 0) {
                    arg1.field3662++;
                    return;
                }
            }
        }
        int var7 = arg1.field3745;
        int var8 = arg1.field3679;
        int var9 = arg1.field3706[arg1.field3743 - 1] * 128 + arg1.method1653(-1) * 64;
        int var10 = arg1.field3768[arg1.field3743 - 1] * 128 + (arg1.method1653(-1) * 64);
        if ((var9 - var7) > 256 || var9 - var7 < -256 || (var10 - var8) > 256 || (var10 - var8) < -256) {
            arg1.field3679 = var10;
            arg1.field3745 = var9;
            return;
        }
        if (var9 > var7) {
            if (var8 < var10) {
                arg1.field3666 = 1280;
            } else if (var10 >= var8) {
                arg1.field3666 = 1536;
            } else {
                arg1.field3666 = 1792;
            }
        } else if (var9 >= var7) {
            if (var8 < var10) {
                arg1.field3666 = 1024;
            } else if (var10 < var8) {
                arg1.field3666 = 0;
            }
        } else if (var10 > var8) {
            arg1.field3666 = 768;
        } else if (var10 >= var8) {
            arg1.field3666 = 512;
        } else {
            arg1.field3666 = 256;
        }
        int var11 = arg1.field3666 - arg1.field3746 & 0x7FF;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        int var12 = 4;
        boolean var13 = true;
        int var14 = var3.field2668;
        if (var11 >= -256 && var11 <= 256) {
            var14 = var3.field2703;
        } else if (var11 >= 256 && var11 < 768) {
            var14 = var3.field2689;
        } else if (var11 >= -768 && var11 <= -256) {
            var14 = var3.field2705;
        }
        byte var15 = 1;
        if (var14 == -1) {
            var14 = var3.field2703;
        }
        arg1.field3719 = var14;
        if (arg1 instanceof class329) {
            var13 = ((class329) arg1).field4961.field2489;
        }
        if (var13) {
            if (arg1.field3746 != arg1.field3666 && arg1.field3676 == -1 && arg1.field3665 != 0) {
                var12 = 2;
            }
            if (arg1.field3743 > 2) {
                var12 = 6;
            }
            if (arg1.field3743 > 3) {
                var12 = 8;
            }
            if (arg1.field3662 > 0 && arg1.field3743 > 1) {
                arg1.field3662--;
                var12 = 8;
            }
        } else {
            if (arg1.field3743 > 1) {
                var12 = 6;
            }
            if (arg1.field3743 > 2) {
                var12 = 8;
            }
            if (arg1.field3662 > 0 && arg1.field3743 > 1) {
                var12 = 8;
                arg1.field3662--;
            }
        }
        if (arg1.field3750[arg1.field3743 - 1] == 2) {
            var12 <<= 0x1;
            var15 = 2;
        } else if (arg1.field3750[arg1.field3743 - 1] == 0) {
            var12 >>= 0x1;
            var15 = 0;
        }
        if (var12 < 8 || var3.field2682 == -1) {
            if (var3.field2699 != -1 && var15 == 0) {
                if (arg1.field3719 == var3.field2668 && var3.field2667 != -1) {
                    arg1.field3719 = var3.field2667;
                } else if (arg1.field3719 == var3.field2705 && var3.field2685 != -1) {
                    arg1.field3719 = var3.field2685;
                } else if (arg1.field3719 == var3.field2689 && var3.field2670 != -1) {
                    arg1.field3719 = var3.field2670;
                } else {
                    arg1.field3719 = var3.field2699;
                }
            }
        } else if (arg1.field3719 == var3.field2668 && var3.field2691 != -1) {
            arg1.field3719 = var3.field2691;
        } else if (arg1.field3719 == var3.field2705 && var3.field2701 != -1) {
            arg1.field3719 = var3.field2701;
        } else if (arg1.field3719 == var3.field2689 && var3.field2680 != -1) {
            arg1.field3719 = var3.field2680;
        } else {
            arg1.field3719 = var3.field2682;
        }
        if (var3.field2675 != -1) {
            int var16 = var12 << 7;
            if (arg1.field3743 == 1) {
                int var17 = arg1.field3693 * arg1.field3693;
                int var18 = (arg1.field3745 > var9 ? arg1.field3745 - var9 : -arg1.field3745 + var9) << 7;
                int var19 = (var10 < arg1.field3679 ? arg1.field3679 - var10 : -arg1.field3679 + var10) << 7;
                int var20 = var19 < var18 ? var18 : var19;
                int var21 = var3.field2675 * 2 * var20;
                if (var17 > var21) {
                    arg1.field3693 /= 2;
                } else if (var20 < var17 / 2) {
                    arg1.field3693 -= var3.field2675;
                    if (arg1.field3693 < 0) {
                        arg1.field3693 = 0;
                    }
                } else if (arg1.field3693 < var16) {
                    arg1.field3693 += var3.field2675;
                    if (arg1.field3693 > var16) {
                        arg1.field3693 = var16;
                    }
                }
            } else if (var16 > arg1.field3693) {
                arg1.field3693 += var3.field2675;
                if (arg1.field3693 > var16) {
                    arg1.field3693 = var16;
                }
            } else if (arg1.field3693 > 0) {
                arg1.field3693 -= var3.field2675;
                if (arg1.field3693 < 0) {
                    arg1.field3693 = 0;
                }
            }
            var12 = arg1.field3693 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var8 < var10) {
            arg1.field3679 += var12;
            if (var10 < arg1.field3679) {
                arg1.field3679 = var10;
            }
        } else if (var8 > var10) {
            arg1.field3679 -= var12;
            if (arg1.field3679 < var10) {
                arg1.field3679 = var10;
            }
        }
        if (var9 > var7) {
            arg1.field3745 += var12;
            if (var9 < arg1.field3745) {
                arg1.field3745 = var9;
            }
        } else if (var9 < var7) {
            arg1.field3745 -= var12;
            if (var9 > arg1.field3745) {
                arg1.field3745 = var9;
            }
        }
        if (arg1.field3745 == var9 && arg1.field3679 == var10) {
            if (arg1.field3727 > 0) {
                arg1.field3727--;
            }
            arg1.field3743--;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIJ)Z", line = 413)
    public static final boolean method1115(int arg0, int arg1, int arg2, long arg3) {
        class202 var5 = class142.field1940[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2873 != null && var5.field2873.field69 == arg3) {
            return true;
        } else if (var5.field2879 != null && var5.field2879.field3992 == arg3) {
            return true;
        } else if (var5.field2869 != null && var5.field2869.field4580 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2875; var6++) {
                if (var5.field2896[var6].field4203 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I", line = 443)
    public static final int method1116(int arg0) {
        field2139++;
        if ((double) class343.field5137 == 3.0D) {
            return 37;
        } else if (arg0 != -12173) {
            return 86;
        } else if ((double) class343.field5137 == 4.0D) {
            return 50;
        } else if ((double) class343.field5137 == 6.0D) {
            return 75;
        } else if ((double) class343.field5137 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 468)
    public static void method1117(byte arg0) {
        field2135 = null;
        if (arg0 != -59) {
            method1112(120, -122);
        }
        field2133 = null;
    }
}
