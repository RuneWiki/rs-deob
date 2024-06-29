import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class62 {

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[Lod;")
    public static class24[] field901 = new class24[14];

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljf;")
    public static class216 field895 = new class216(128);

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Ltf;")
    public static class244 field902;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Lvl;")
    public static class73 field903;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method392(byte arg0) {
        field895 = null;
        field902 = null;
        int var1 = -36 % ((arg0 - 71) / 39);
        field903 = null;
        field901 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V")
    public static final void method393(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1922) {
            method397(93, -1, -90, true);
        }
        int var4 = class136.field1960 * arg0 >> 8;
        if (var4 != 0 && arg1 != -1) {
            class198.method1381(var4, 0, -59, arg1, false, class245.field3998);
            class229.field3542 = true;
        }
        field899++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lvl;III)Lff;")
    public static final class48 method394(class73 arg0, int arg1, int arg2, int arg3) {
        field905++;
        if (class135.method862(arg2, arg3, (byte) -66, arg0)) {
            int var4 = 117 % ((arg1 - 5) / 63);
            return class99.method666(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method395(int arg0) {
        if (arg0 != -256) {
            field901 = null;
        }
        field897++;
        class84.field1301.method1510(10283);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)[B")
    public abstract byte[] method396(int arg0);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIZ)V")
    public static final void method397(int arg0, int arg1, int arg2, boolean arg3) {
        field898++;
        String var4 = "::tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        if (arg3) {
            method394((class73) null, -109, 49, -117);
        }
        class254.method1801(var4, (byte) 93);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public static final void method398(byte arg0) {
        field896++;
        class161.field2407.method1510(10283);
        class248.field4032.method1510(10283);
        class198.field3137.method1510(10283);
        if (arg0 > -123) {
            method399((class243) null, 3);
        }
        class11.field172.method1510(10283);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lu;I)V")
    public static final void method399(class243 arg0, int arg1) {
        class163 var2 = arg0.method1725(-126);
        arg0.field3946 = var2.field2517;
        field894++;
        if (arg0.field3974 == arg1) {
            arg0.field3984 = 0;
            return;
        }
        if (arg0.field3987 != -1 && arg0.field3977 == 0) {
            class57 var3 = class174.method1241(52, arg0.field3987);
            if (arg0.field3976 > 0 && var3.field832 == 0) {
                arg0.field3984++;
                return;
            }
            if (arg0.field3976 <= 0 && var3.field835 == 0) {
                arg0.field3984++;
                return;
            }
        }
        if (arg0.field3904 != -1 && arg0.field3935 <= class311.field4996) {
            class214 var4 = class92.method629(arg0.field3904, arg1 ^ 0x3000);
            if (var4.field3346 && var4.field3338 != -1) {
                class57 var5 = class174.method1241(arg1 ^ 0xFFFFFF80, var4.field3338);
                if (arg0.field3976 > 0 && var5.field832 == 0) {
                    arg0.field3984++;
                    return;
                }
                if (arg0.field3976 <= 0 && var5.field835 == 0) {
                    arg0.field3984++;
                    return;
                }
            }
        }
        int var6 = arg0.field3915;
        int var7 = arg0.field3920;
        int var8 = arg0.field3970[arg0.field3974 - 1] * 128 + arg0.method8((byte) -69) * 64;
        int var9 = arg0.field3972[arg0.field3974 - 1] * 128 + arg0.method8((byte) -82) * 64;
        if (var8 - var6 > 256 || var8 - var6 < -256 || var9 - var7 > 256 || (var9 - var7) < -256) {
            arg0.field3920 = var9;
            arg0.field3915 = var8;
            return;
        }
        if (var8 <= var6) {
            if (var8 >= var6) {
                if (var9 > var7) {
                    arg0.field3924 = 1024;
                } else if (var9 < var7) {
                    arg0.field3924 = 0;
                }
            } else if (var9 > var7) {
                arg0.field3924 = 768;
            } else if (var7 > var9) {
                arg0.field3924 = 256;
            } else {
                arg0.field3924 = 512;
            }
        } else if (var9 > var7) {
            arg0.field3924 = 1280;
        } else if (var7 > var9) {
            arg0.field3924 = 1792;
        } else {
            arg0.field3924 = 1536;
        }
        int var10 = arg0.field3924 - arg0.field3913 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        int var11 = var2.field2510;
        if (var10 >= -256 && var10 <= 256) {
            var11 = var2.field2502;
        } else if (var10 >= 256 && var10 < 768) {
            var11 = var2.field2528;
        } else if (var10 >= -768 && var10 <= -256) {
            var11 = var2.field2526;
        }
        int var12 = 4;
        if (var11 == -1) {
            var11 = var2.field2502;
        }
        arg0.field3946 = var11;
        boolean var13 = true;
        if (arg0 instanceof class86) {
            var13 = ((class86) arg0).field1321.field1895;
        }
        if (var13) {
            if (arg0.field3924 != arg0.field3913 && arg0.field3927 == -1 && arg0.field3983 != 0) {
                var12 = 2;
            }
            if (arg0.field3974 > 2) {
                var12 = 6;
            }
            if (arg0.field3974 > 3) {
                var12 = 8;
            }
            if (arg0.field3984 > 0 && arg0.field3974 > 1) {
                var12 = 8;
                arg0.field3984--;
            }
        } else {
            if (arg0.field3974 > 1) {
                var12 = 6;
            }
            if (arg0.field3974 > 2) {
                var12 = 8;
            }
            if (arg0.field3984 > 0 && arg0.field3974 > 1) {
                var12 = 8;
                arg0.field3984--;
            }
        }
        byte var14 = 1;
        if (arg0.field3896[arg0.field3974 - 1] == 2) {
            var14 = 2;
            var12 <<= 0x1;
        } else if (arg0.field3896[arg0.field3974 - 1] == 0) {
            var12 >>= 0x1;
            var14 = 0;
        }
        if (var12 < 8 || var2.field2511 == -1) {
            if (var2.field2523 != -1 && var14 == 0) {
                if (arg0.field3946 == var2.field2510 && var2.field2518 != -1) {
                    arg0.field3946 = var2.field2518;
                } else if (arg0.field3946 == var2.field2526 && var2.field2525 != -1) {
                    arg0.field3946 = var2.field2525;
                } else if (arg0.field3946 == var2.field2528 && var2.field2520 != -1) {
                    arg0.field3946 = var2.field2520;
                } else {
                    arg0.field3946 = var2.field2523;
                }
            }
        } else if (arg0.field3946 == var2.field2510 && var2.field2501 != -1) {
            arg0.field3946 = var2.field2501;
        } else if (arg0.field3946 == var2.field2526 && var2.field2509 != -1) {
            arg0.field3946 = var2.field2509;
        } else if (arg0.field3946 == var2.field2528 && var2.field2527 != -1) {
            arg0.field3946 = var2.field2527;
        } else {
            arg0.field3946 = var2.field2511;
        }
        if (var2.field2521 != -1) {
            int var15 = var12 << 7;
            if (arg0.field3974 == 1) {
                int var16 = arg0.field3933 * arg0.field3933;
                int var17 = (var9 >= arg0.field3920 ? var9 - arg0.field3920 : -var9 + arg0.field3920) << 7;
                int var18 = (arg0.field3915 > var8 ? arg0.field3915 - var8 : -arg0.field3915 + var8) << 7;
                int var19 = var18 <= var17 ? var17 : var18;
                int var20 = var2.field2521 * 2 * var19;
                if (var20 < var16) {
                    arg0.field3933 /= 2;
                } else if ((var16 / 2) > var19) {
                    arg0.field3933 -= var2.field2521;
                    if (arg0.field3933 < 0) {
                        arg0.field3933 = 0;
                    }
                } else if (var15 > arg0.field3933) {
                    arg0.field3933 += var2.field2521;
                    if (arg0.field3933 > var15) {
                        arg0.field3933 = var15;
                    }
                }
            } else if (arg0.field3933 < var15) {
                arg0.field3933 += var2.field2521;
                if (var15 < arg0.field3933) {
                    arg0.field3933 = var15;
                }
            } else if (arg0.field3933 > 0) {
                arg0.field3933 -= var2.field2521;
                if (arg0.field3933 < 0) {
                    arg0.field3933 = 0;
                }
            }
            var12 = arg0.field3933 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var7 < var9) {
            arg0.field3920 += var12;
            if (arg0.field3920 > var9) {
                arg0.field3920 = var9;
            }
        } else if (var9 < var7) {
            arg0.field3920 -= var12;
            if (arg0.field3920 < var9) {
                arg0.field3920 = var9;
            }
        }
        if (var8 > var6) {
            arg0.field3915 += var12;
            if (arg0.field3915 > var8) {
                arg0.field3915 = var8;
            }
        } else if (var8 < var6) {
            arg0.field3915 -= var12;
            if (var8 > arg0.field3915) {
                arg0.field3915 = var8;
            }
        }
        if (arg0.field3915 == var8 && arg0.field3920 == var9) {
            if (arg0.field3976 > 0) {
                arg0.field3976--;
            }
            arg0.field3974--;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BIILvl;)Lff;")
    public static final class48 method400(byte arg0, int arg1, int arg2, class73 arg3) {
        field900++;
        if (class135.method862(arg2, arg1, (byte) 115, arg3)) {
            int var4 = -22 / ((arg0 - 55) / 60);
            return class92.method624((byte) 32);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
    public abstract void method401(byte[] arg0, int arg1);
}
