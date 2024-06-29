import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class170 extends class71 {

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field2711 = 0;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "S")
    public static short field2716 = 32767;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "[Luj;")
    public static class151[] field2714 = new class151[50];

    @OriginalMember(owner = "client!e", name = "w", descriptor = "[I")
    public static int[] field2715 = new int[128];

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field2730 = 0;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILlg;)V", line = 5)
    public static final void method1159(int arg0, class132 arg1) {
        if (arg0 != -257) {
            field2715 = (int[]) null;
        }
        class206 var2 = arg1.method899(true);
        field2729++;
        arg1.field1994 = var2.field3354;
        if (arg1.field1951 == 0) {
            arg1.field2041 = 0;
            return;
        }
        if (arg1.field1968 != -1 && arg1.field2002 == 0) {
            class80 var3 = class37.method236(arg1.field1968, 20254);
            if (arg1.field2001 > 0 && var3.field1200 == 0) {
                arg1.field2041++;
                return;
            }
            if (arg1.field2001 <= 0 && var3.field1202 == 0) {
                arg1.field2041++;
                return;
            }
        }
        if (arg1.field2022 != -1 && class48.field648 >= arg1.field1945) {
            class20 var4 = class264.method1881((byte) 126, arg1.field2022);
            if (var4.field299 && var4.field302 != -1) {
                class80 var5 = class37.method236(var4.field302, arg0 ^ 0xFFFFB1E1);
                if (arg1.field2001 > 0 && var5.field1200 == 0) {
                    arg1.field2041++;
                    return;
                }
                if (arg1.field2001 <= 0 && var5.field1202 == 0) {
                    arg1.field2041++;
                    return;
                }
            }
        }
        int var6 = arg1.field1980;
        int var7 = arg1.field1944;
        int var8 = arg1.field1969[arg1.field1951 - 1] * 128 + arg1.method910(arg0 + 256) * 64;
        int var9 = arg1.field2006[arg1.field1951 - 1] * 128 + arg1.method910(-1) * 64;
        if ((var8 - var6) > 256 || var8 - var6 < -256 || (var9 - var7) > 256 || (var9 - var7) < -256) {
            arg1.field1980 = var8;
            arg1.field1944 = var9;
            return;
        }
        int var10 = var2.field3348;
        if (var8 <= var6) {
            if (var6 <= var8) {
                if (var9 > var7) {
                    arg1.field1973 = 1024;
                } else if (var7 > var9) {
                    arg1.field1973 = 0;
                }
            } else if (var9 > var7) {
                arg1.field1973 = 768;
            } else if (var9 >= var7) {
                arg1.field1973 = 512;
            } else {
                arg1.field1973 = 256;
            }
        } else if (var9 > var7) {
            arg1.field1973 = 1280;
        } else if (var7 <= var9) {
            arg1.field1973 = 1536;
        } else {
            arg1.field1973 = 1792;
        }
        int var11 = arg1.field1973 - arg1.field2037 & 0x7FF;
        int var12 = 4;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 >= -256 && var11 <= 256) {
            var10 = var2.field3345;
        } else if (var11 >= 256 && var11 < 768) {
            var10 = var2.field3386;
        } else if (var11 >= -768 && var11 <= -256) {
            var10 = var2.field3350;
        }
        if (var10 == -1) {
            var10 = var2.field3345;
        }
        arg1.field1994 = var10;
        byte var13 = 1;
        boolean var14 = true;
        if (arg1 instanceof class196) {
            var14 = ((class196) arg1).field3210.field1790;
        }
        if (var14) {
            if (arg1.field2037 != arg1.field1973 && arg1.field1976 == -1 && arg1.field1956 != 0) {
                var12 = 2;
            }
            if (arg1.field1951 > 2) {
                var12 = 6;
            }
            if (arg1.field1951 > 3) {
                var12 = 8;
            }
            if (arg1.field2041 > 0 && arg1.field1951 > 1) {
                arg1.field2041--;
                var12 = 8;
            }
        } else {
            if (arg1.field1951 > 1) {
                var12 = 6;
            }
            if (arg1.field1951 > 2) {
                var12 = 8;
            }
            if (arg1.field2041 > 0 && arg1.field1951 > 1) {
                var12 = 8;
                arg1.field2041--;
            }
        }
        if (arg1.field1972[arg1.field1951 - 1] == 2) {
            var13 = 2;
            var12 <<= 0x1;
        } else if (arg1.field1972[arg1.field1951 - 1] == 0) {
            var13 = 0;
            var12 >>= 0x1;
        }
        if (var12 < 8 || var2.field3347 == -1) {
            if (var2.field3380 != -1 && var13 == 0) {
                if (arg1.field1994 == var2.field3348 && var2.field3356 != -1) {
                    arg1.field1994 = var2.field3356;
                } else if (arg1.field1994 == var2.field3350 && var2.field3349 != -1) {
                    arg1.field1994 = var2.field3349;
                } else if (arg1.field1994 == var2.field3386 && var2.field3360 != -1) {
                    arg1.field1994 = var2.field3360;
                } else {
                    arg1.field1994 = var2.field3380;
                }
            }
        } else if (arg1.field1994 == var2.field3348 && var2.field3351 != -1) {
            arg1.field1994 = var2.field3351;
        } else if (arg1.field1994 == var2.field3350 && var2.field3377 != -1) {
            arg1.field1994 = var2.field3377;
        } else if (arg1.field1994 == var2.field3386 && var2.field3374 != -1) {
            arg1.field1994 = var2.field3374;
        } else {
            arg1.field1994 = var2.field3347;
        }
        if (var2.field3371 != -1) {
            int var15 = var12 << 7;
            if (arg1.field1951 == 1) {
                int var16 = arg1.field1970 * arg1.field1970;
                int var17 = (var9 >= arg1.field1944 ? var9 - arg1.field1944 : -var9 + arg1.field1944) << 7;
                int var18 = (arg1.field1980 <= var8 ? var8 - arg1.field1980 : arg1.field1980 - var8) << 7;
                int var19 = var17 >= var18 ? var17 : var18;
                int var20 = var2.field3371 * var19 * 2;
                if (var16 > var20) {
                    arg1.field1970 /= 2;
                } else if (var16 / 2 > var19) {
                    arg1.field1970 -= var2.field3371;
                    if (arg1.field1970 < 0) {
                        arg1.field1970 = 0;
                    }
                } else if (var15 > arg1.field1970) {
                    arg1.field1970 += var2.field3371;
                    if (var15 < arg1.field1970) {
                        arg1.field1970 = var15;
                    }
                }
            } else if (var15 > arg1.field1970) {
                arg1.field1970 += var2.field3371;
                if (arg1.field1970 > var15) {
                    arg1.field1970 = var15;
                }
            } else if (arg1.field1970 > 0) {
                arg1.field1970 -= var2.field3371;
                if (arg1.field1970 < 0) {
                    arg1.field1970 = 0;
                }
            }
            var12 = arg1.field1970 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var7 < var9) {
            arg1.field1944 += var12;
            if (arg1.field1944 > var9) {
                arg1.field1944 = var9;
            }
        } else if (var9 < var7) {
            arg1.field1944 -= var12;
            if (var9 > arg1.field1944) {
                arg1.field1944 = var9;
            }
        }
        if (var8 > var6) {
            arg1.field1980 += var12;
            if (arg1.field1980 > var8) {
                arg1.field1980 = var8;
            }
        } else if (var6 > var8) {
            arg1.field1980 -= var12;
            if (var8 > arg1.field1980) {
                arg1.field1980 = var8;
            }
        }
        if (arg1.field1980 == var8 && arg1.field1944 == var9) {
            arg1.field1951--;
            if (arg1.field2001 > 0) {
                arg1.field2001--;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Z", line = 354)
    public final boolean method1160(int arg0) {
        field2720++;
        if (arg0 > -6) {
            return false;
        } else {
            return (this.field2725 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 372)
    public static void method1161(int arg0) {
        field2715 = null;
        field2714 = null;
        if (arg0 != 1643688637) {
            field2714 = (class151[]) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)Z", line = 386)
    public final boolean method1162(byte arg0) {
        field2727++;
        if (arg0 != -48) {
            field2730 = 102;
        }
        return ((this.field2725 & 0x23C613) >> 21) != 0;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)Z", line = 401)
    public final boolean method1163(int arg0) {
        if (arg0 != 4626) {
            this.method1171(-59, 47);
        }
        field2726++;
        return (this.field2725 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)Z", line = 413)
    public final boolean method1164(int arg0) {
        field2717++;
        if (arg0 != 1) {
            this.method1163(-31);
        }
        return (this.field2725 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)I", line = 426)
    public final int method1165(byte arg0) {
        if (arg0 < 118) {
            this.method1169((byte) 58);
        }
        field2719++;
        return (this.field2725 & 0x1CCD8C) >> 18;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)Z", line = 438)
    public final boolean method1166(int arg0) {
        field2721++;
        if (arg0 == 0) {
            return (this.field2725 & 0x34064715) >> 29 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V", line = 450)
    public static final void method1167(byte arg0) {
        field2722++;
        class90.field1373.method876(-20427);
        for (int var1 = 0; var1 < 32; var1++) {
            class149.field2243[var1] = 0L;
        }
        int var2 = -110 % ((arg0 + 31) / 51);
        for (int var3 = 0; var3 < 32; var3++) {
            class198.field3257[var3] = 0L;
        }
        class17.field233 = 0;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)Z", line = 475)
    public final boolean method1168(int arg0) {
        field2724++;
        int var2 = -128 % ((arg0 + 9) / 59);
        return (this.field2725 & 0x1ED8F233) >> 28 != 0;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(B)Z", line = 485)
    public final boolean method1169(byte arg0) {
        field2718++;
        if (arg0 == 103) {
            return (this.field2725 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[S)[S", line = 500)
    public static final short[] method1170(int arg0, short[] arg1) {
        field2728++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class213.method1558(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Z", line = 515)
    public final boolean method1171(int arg0, int arg1) {
        if (arg0 == 8) {
            field2723++;
            return (this.field2725 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V", line = 528)
    public class170(int arg0, int arg1) {
        this.field2725 = arg0;
        this.field2712 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(B)I", line = 545)
    public final int method1172(byte arg0) {
        field2713++;
        if (arg0 >= -46) {
            this.method1163(50);
        }
        return class80.method594((byte) -109, this.field2725);
    }
}
