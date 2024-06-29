import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class37 implements class133 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
    public static volatile boolean field562 = false;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lhc;I)V")
    public static final void method246(class235 arg0, int arg1) {
        class5.field44 = arg0;
        if (arg1 != 30640) {
            method248(-16, 54, 60);
        }
        field561++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIJ[I)Ljava/lang/String;")
    public final String method247(int arg0, int arg1, long arg2, int[] arg3) {
        field563++;
        if (arg1 < 79) {
            return null;
        } else if (arg0 == 0) {
            class74 var6 = class33.method218(arg3[0], false);
            return var6.method475((int) arg2, (byte) -68);
        } else if (arg0 == 1 || arg0 == 10) {
            class32 var7 = class73.method463((int) arg2, -31104);
            return var7.field437;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class33.method218(arg3[0], false).method475((int) arg2, (byte) -68);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lvi;")
    public static final class197 method248(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class197 var4 = var3.field1244;
            var3.field1244 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmi;B)V")
    public static final void method249(class266 arg0, byte arg1) {
        field564++;
        class151 var2 = arg0.method1741((byte) 8);
        if (arg1 != -6) {
            return;
        }
        arg0.field4050 = var2.field2106;
        if (arg0.field4052 == 0) {
            arg0.field4021 = 0;
            return;
        }
        if (arg0.field4040 != -1 && arg0.field3985 == 0) {
            class240 var3 = class132.method905(true, arg0.field4040);
            if (arg0.field4027 > 0 && var3.field3657 == 0) {
                arg0.field4021++;
                return;
            }
            if (arg0.field4027 <= 0 && var3.field3653 == 0) {
                arg0.field4021++;
                return;
            }
        }
        if (arg0.field4046 != -1 && class52.field740 >= arg0.field4041) {
            class191 var4 = class82.method512(arg0.field4046, (byte) 68);
            if (var4.field2630 && var4.field2638 != -1) {
                class240 var5 = class132.method905(true, var4.field2638);
                if (arg0.field4027 > 0 && var5.field3657 == 0) {
                    arg0.field4021++;
                    return;
                }
                if (arg0.field4027 <= 0 && var5.field3653 == 0) {
                    arg0.field4021++;
                    return;
                }
            }
        }
        int var6 = arg0.field4019;
        int var7 = arg0.field4085;
        int var8 = arg0.field4076[arg0.field4052 - 1] * 128 + (arg0.method561(-1) * 64);
        int var9 = arg0.field4032[arg0.field4052 - 1] * 128 + arg0.method561(-1) * 64;
        if (var8 - var6 > 256 || var8 - var6 < -256 || var9 - var7 > 256 || var9 - var7 < -256) {
            arg0.field4019 = var8;
            arg0.field4085 = var9;
            return;
        }
        if (var8 > var6) {
            if (var9 > var7) {
                arg0.field4009 = 1280;
            } else if (var7 > var9) {
                arg0.field4009 = 1792;
            } else {
                arg0.field4009 = 1536;
            }
        } else if (var8 >= var6) {
            if (var7 < var9) {
                arg0.field4009 = 1024;
            } else if (var7 > var9) {
                arg0.field4009 = 0;
            }
        } else if (var7 < var9) {
            arg0.field4009 = 768;
        } else if (var9 >= var7) {
            arg0.field4009 = 512;
        } else {
            arg0.field4009 = 256;
        }
        int var10 = var2.field2118;
        int var11 = 4;
        int var12 = arg0.field4009 - arg0.field4010 & 0x7FF;
        boolean var13 = true;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 >= -256 && var12 <= 256) {
            var10 = var2.field2109;
        } else if (var12 >= 256 && var12 < 768) {
            var10 = var2.field2099;
        } else if (var12 >= -768 && var12 <= -256) {
            var10 = var2.field2089;
        }
        if (var10 == -1) {
            var10 = var2.field2109;
        }
        arg0.field4050 = var10;
        if (arg0 instanceof class140) {
            var13 = ((class140) arg0).field1946.field4402;
        }
        if (var13) {
            if (arg0.field4010 != arg0.field4009 && arg0.field4014 == -1 && arg0.field3991 != 0) {
                var11 = 2;
            }
            if (arg0.field4052 > 2) {
                var11 = 6;
            }
            if (arg0.field4052 > 3) {
                var11 = 8;
            }
            if (arg0.field4021 > 0 && arg0.field4052 > 1) {
                arg0.field4021--;
                var11 = 8;
            }
        } else {
            if (arg0.field4052 > 1) {
                var11 = 6;
            }
            if (arg0.field4052 > 2) {
                var11 = 8;
            }
            if (arg0.field4021 > 0 && arg0.field4052 > 1) {
                arg0.field4021--;
                var11 = 8;
            }
        }
        byte var14 = 1;
        if (arg0.field4071[arg0.field4052 - 1] == 2) {
            var11 <<= 0x1;
            var14 = 2;
        } else if (arg0.field4071[arg0.field4052 - 1] == 0) {
            var11 >>= 0x1;
            var14 = 0;
        }
        if (var11 < 8 || var2.field2087 == -1) {
            if (var2.field2121 != -1 && var14 == 0) {
                if (arg0.field4050 == var2.field2118 && var2.field2119 != -1) {
                    arg0.field4050 = var2.field2119;
                } else if (arg0.field4050 == var2.field2089 && var2.field2101 != -1) {
                    arg0.field4050 = var2.field2101;
                } else if (arg0.field4050 == var2.field2099 && var2.field2113 != -1) {
                    arg0.field4050 = var2.field2113;
                } else {
                    arg0.field4050 = var2.field2121;
                }
            }
        } else if (arg0.field4050 == var2.field2118 && var2.field2090 != -1) {
            arg0.field4050 = var2.field2090;
        } else if (arg0.field4050 == var2.field2089 && var2.field2103 != -1) {
            arg0.field4050 = var2.field2103;
        } else if (arg0.field4050 == var2.field2099 && var2.field2086 != -1) {
            arg0.field4050 = var2.field2086;
        } else {
            arg0.field4050 = var2.field2087;
        }
        if (var2.field2097 != -1) {
            int var15 = var11 << 7;
            if (arg0.field4052 == 1) {
                int var16 = arg0.field4089 * arg0.field4089;
                int var17 = (arg0.field4019 > var8 ? arg0.field4019 - var8 : -arg0.field4019 + var8) << 7;
                int var18 = (var9 < arg0.field4085 ? arg0.field4085 - var9 : var9 - arg0.field4085) << 7;
                int var19 = var17 <= var18 ? var18 : var17;
                int var20 = var2.field2097 * var19 * 2;
                if (var20 < var16) {
                    arg0.field4089 /= 2;
                } else if (var16 / 2 > var19) {
                    arg0.field4089 -= var2.field2097;
                    if (arg0.field4089 < 0) {
                        arg0.field4089 = 0;
                    }
                } else if (arg0.field4089 < var15) {
                    arg0.field4089 += var2.field2097;
                    if (var15 < arg0.field4089) {
                        arg0.field4089 = var15;
                    }
                }
            } else if (arg0.field4089 < var15) {
                arg0.field4089 += var2.field2097;
                if (arg0.field4089 > var15) {
                    arg0.field4089 = var15;
                }
            } else if (arg0.field4089 > 0) {
                arg0.field4089 -= var2.field2097;
                if (arg0.field4089 < 0) {
                    arg0.field4089 = 0;
                }
            }
            var11 = arg0.field4089 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var7 < var9) {
            arg0.field4085 += var11;
            if (var9 < arg0.field4085) {
                arg0.field4085 = var9;
            }
        } else if (var7 > var9) {
            arg0.field4085 -= var11;
            if (arg0.field4085 < var9) {
                arg0.field4085 = var9;
            }
        }
        if (var6 < var8) {
            arg0.field4019 += var11;
            if (var8 < arg0.field4019) {
                arg0.field4019 = var8;
            }
        } else if (var6 > var8) {
            arg0.field4019 -= var11;
            if (var8 > arg0.field4019) {
                arg0.field4019 = var8;
            }
        }
        if (arg0.field4019 != var8 || arg0.field4085 != var9) {
            return;
        }
        arg0.field4052--;
        if (arg0.field4027 > 0) {
            arg0.field4027--;
            return;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static final void method250(byte arg0) {
        if (class139.field1933 != null) {
            class139.field1933.method859(-111);
        }
        field567++;
        if (class234.field3537 != null) {
            class234.field3537.method859(94);
        }
        class229.method1514(22050, 2, class261.field3954, -8001);
        if (arg0 == 68) {
            class139.field1933 = class13.method84(class156.field2177, class200.field2784, 22050, 0, false);
            class139.field1933.method856((byte) -117, class181.field2544);
            class234.field3537 = class13.method84(class156.field2177, class200.field2784, 2048, 1, false);
            class234.field3537.method856((byte) -118, class21.field298);
        }
    }
}
