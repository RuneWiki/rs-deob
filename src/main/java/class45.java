import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class45 {

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public int field670 = 128;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public int field674 = 128;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Lff;")
    public static class9 field668 = new class9(14, 6);

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field673;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qn", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field677;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "[Lii;")
    public static class386[] field676;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
    public static void method315(boolean arg0) {
        field668 = null;
        field676 = null;
        if (arg0) {
            field668 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lit;ZI)V")
    public static final void method316(class455 arg0, boolean arg1, int arg2) {
        field673++;
        class20 var3 = arg0.method2600(arg2 + 112);
        if (arg0.field6257 == 0) {
            class270.field3542 = 0;
            arg0.field6263 = 0;
            class51.field803 = -1;
            return;
        }
        if (arg0.field6185 != -1 && arg0.field6248 == 0) {
            class5 var4 = class423.field5791.method1601(arg0.field6185, (byte) -114);
            if (arg0.field6259 > 0 && var4.field128 == 0) {
                class51.field803 = -1;
                arg0.field6263++;
                class270.field3542 = 0;
                return;
            }
            if (arg0.field6259 <= 0 && var4.field144 == 0) {
                arg0.field6263++;
                class51.field803 = -1;
                class270.field3542 = 0;
                return;
            }
        }
        if (arg0.field6163 != -1 && arg0.field6209 <= class31.field516) {
            class155 var5 = class441.field6049.method725(arg2 + 14888, arg0.field6163);
            if (var5.field2264 && var5.field2271 != -1) {
                class5 var6 = class423.field5791.method1601(var5.field2271, (byte) -116);
                if (arg0.field6259 > 0 && var6.field128 == 0) {
                    class51.field803 = -1;
                    class270.field3542 = 0;
                    arg0.field6263++;
                    return;
                }
                if (arg0.field6259 <= 0 && var6.field144 == 0) {
                    class270.field3542 = 0;
                    class51.field803 = -1;
                    arg0.field6263++;
                    return;
                }
            }
        }
        if (arg0.field6163 != -1 && arg0.field6209 <= class31.field516) {
            class155 var7 = class441.field6049.method725(14896, arg0.field6163);
            if (var7.field2264 && var7.field2271 != -1) {
                class5 var8 = class423.field5791.method1601(var7.field2271, (byte) -125);
                if (arg0.field6259 > 0 && var8.field128 == 0) {
                    arg0.field6263++;
                    class51.field803 = -1;
                    class270.field3542 = 0;
                    return;
                }
                if (arg0.field6259 <= 0 && var8.field144 == 0) {
                    arg0.field6263++;
                    class51.field803 = -1;
                    class270.field3542 = 0;
                    return;
                }
            }
        }
        int var9 = arg0.field584;
        int var10 = arg0.field574;
        int var11 = arg0.field6261[arg0.field6257 - 1] * 128 + arg0.method2590(0) * 64;
        int var12 = arg0.field6266[arg0.field6257 - 1] * 128 + arg0.method2590(0) * 64;
        if (var9 >= var11) {
            if (var9 <= var11) {
                if (var10 < var12) {
                    arg0.method2595(8192, false);
                } else if (var12 < var10) {
                    arg0.method2595(0, false);
                }
            } else if (var10 < var12) {
                arg0.method2595(6144, false);
            } else if (var12 < var10) {
                arg0.method2595(2048, false);
            } else {
                arg0.method2595(4096, false);
            }
        } else if (var10 < var12) {
            arg0.method2595(10240, false);
        } else if (var12 >= var10) {
            arg0.method2595(12288, false);
        } else {
            arg0.method2595(14336, false);
        }
        byte var13 = arg0.field6265[arg0.field6257 - 1];
        if (!arg1 && ((var11 - var9) > 256 || var11 - var9 < -256 || var12 - var10 > 256 || (var12 - var10) < -256)) {
            arg0.field574 = var12;
            arg0.field584 = var11;
            arg0.method2593(arg0.field6222, false);
            class270.field3542 = 0;
            arg0.field6257--;
            class51.field803 = -1;
            if (arg0.field6259 > 0) {
                arg0.field6259--;
            }
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg0 instanceof class117) {
            var15 = ((class117) arg0).field1661.field7025;
        }
        if (var15) {
            int var16 = arg0.field6222 - arg0.field6233.field3755;
            if (var16 != 0 && arg0.field6202 == -1 && arg0.field6177 != 0) {
                var14 = 2;
            }
            if (!arg1 && arg0.field6257 > 2) {
                var14 = 6;
            }
            if (!arg1 && arg0.field6257 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg1 && arg0.field6257 > 1) {
                var14 = 6;
            }
            if (!arg1 && arg0.field6257 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field6263 > 0 && arg0.field6257 > 1) {
            var14 = 8;
            arg0.field6263--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class270.field3542 = 0;
        if (var3.field355 != -1) {
            int var17 = var14 << 7;
            if (arg0.field6257 == 1) {
                int var18 = arg0.field6256 * arg0.field6256;
                int var19 = (var11 >= arg0.field584 ? var11 - arg0.field584 : -var11 + arg0.field584) << 7;
                int var20 = (arg0.field574 > var12 ? arg0.field574 - var12 : var12 - arg0.field574) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var21 * 2 * var3.field355;
                if (var18 > var22) {
                    arg0.field6256 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg0.field6256 -= var3.field355;
                    if (arg0.field6256 < 0) {
                        arg0.field6256 = 0;
                    }
                } else if (var17 > arg0.field6256) {
                    arg0.field6256 += var3.field355;
                    if (var17 < arg0.field6256) {
                        arg0.field6256 = var17;
                    }
                }
            } else if (var17 > arg0.field6256) {
                arg0.field6256 += var3.field355;
                if (var17 < arg0.field6256) {
                    arg0.field6256 = var17;
                }
            } else if (arg0.field6256 > 0) {
                arg0.field6256 -= var3.field355;
                if (arg0.field6256 < 0) {
                    arg0.field6256 = 0;
                }
            }
            var14 = arg0.field6256 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var11 > var9) {
            class270.field3542 |= 0x4;
            arg0.field584 += var14;
            if (arg0.field584 > var11) {
                arg0.field584 = var11;
            }
        } else if (var9 > var11) {
            arg0.field584 -= var14;
            class270.field3542 |= 0x8;
            if (var11 > arg0.field584) {
                arg0.field584 = var11;
            }
        }
        if (var10 < var12) {
            class270.field3542 |= 0x1;
            arg0.field574 += var14;
            if (arg0.field574 > var12) {
                arg0.field574 = var12;
            }
        } else if (var10 > var12) {
            arg0.field574 -= var14;
            class270.field3542 |= 0x2;
            if (var12 > arg0.field574) {
                arg0.field574 = var12;
            }
        }
        if (var14 >= arg2) {
            class51.field803 = 2;
        } else {
            class51.field803 = var13;
        }
        if (arg0.field584 == var11 && arg0.field574 == var12) {
            if (arg0.field6259 > 0) {
                arg0.field6259--;
            }
            arg0.field6257--;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lit;I)V")
    public static final void method317(class455 arg0, int arg1) {
        field669++;
        int var2 = arg0.field6179 - class31.field516;
        int var3 = arg0.field6221 * arg1 + (arg0.method2590(0) * 64);
        int var4 = arg0.field6223 * 128 + (arg0.method2590(0) * 64);
        arg0.field574 += (var4 - arg0.field574) / var2;
        arg0.field6263 = 0;
        arg0.field584 += (var3 - arg0.field584) / var2;
        if (arg0.field6225 == 0) {
            arg0.method2595(8192, false);
        }
        if (arg0.field6225 == 1) {
            arg0.method2595(12288, false);
        }
        if (arg0.field6225 == 2) {
            arg0.method2595(0, false);
        }
        if (arg0.field6225 == 3) {
            arg0.method2595(4096, false);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lqa;Leq;III)V")
    public static final void method318(class162 arg0, class140 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class439.field6036) {
            class409 var5 = class497.field6886[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field5618 != null && var5.field5618.method126((byte) 54)) {
                arg1.method127(1, 0, arg0, var5.field5618, class220.field2979, 0, true);
            }
        }
        if (arg4 < class439.field6036) {
            class409 var6 = class497.field6886[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field5618 != null && var6.field5618.method126((byte) 54)) {
                arg1.method127(1, 0, arg0, var6.field5618, 0, class220.field2979, true);
            }
        }
        if (arg3 < class439.field6036 && arg4 < class318.field4170) {
            class409 var7 = class497.field6886[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field5618 != null && var7.field5618.method126((byte) 54)) {
                arg1.method127(1, 0, arg0, var7.field5618, class220.field2979, class220.field2979, true);
            }
        }
        if (arg3 < class439.field6036 && arg4 > 0) {
            class409 var8 = class497.field6886[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field5618 != null && var8.field5618.method126((byte) 54)) {
                arg1.method127(1, 0, arg0, var8.field5618, class220.field2979, -class220.field2979, true);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lqn;I)V")
    public final void method319(class45 arg0, int arg1) {
        this.field672 = arg0.field672;
        this.field667 = arg0.field667;
        this.field670 = arg0.field670;
        field666++;
        this.field665 = arg0.field665;
        this.field675 = arg0.field675;
        this.field674 = arg0.field674;
        if (arg1 != 3) {
            this.field672 = -59;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)Lqn;")
    public final class45 method320(boolean arg0) {
        field671++;
        return arg0 ? null : new class45(this.field672, this.field674, this.field670, this.field665, this.field675, this.field667);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIBIIIIILqa;)V")
    public static final void method321(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8) {
        field664++;
        class338 var9 = (class338) class234.method1453(arg7, arg4, arg6);
        if (var9 != null) {
            class1 var10 = class402.field5388.method1994(arg2 ^ 0x43DD, var9.method347((byte) -87));
            int var11 = var9.method344(-4534) & 0x3;
            int var12 = var9.method345(-1736);
            if (var10.field45 == -1) {
                int var13 = arg5;
                if (var10.field83 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method1098(arg2 ^ 0x3736, arg0, var13, 4, arg1);
                    } else if (var11 == 1) {
                        arg8.method1092(var13, -19380, 4, arg0, arg1);
                    } else if (var11 == 2) {
                        arg8.method1098(-14183, arg0, var13, 4, arg1 + 3);
                    } else if (var11 == 3) {
                        arg8.method1092(var13, -19380, 4, arg0 + 3, arg1);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method1093(1, arg1, arg0, 3, 1, var13);
                    } else if (var11 == 1) {
                        arg8.method1093(1, arg1 + 3, arg0, 3, 1, var13);
                    } else if (var11 == 2) {
                        arg8.method1093(1, arg1 + 3, arg0 + 3, arg2 ^ 0xFFFFFFAC, 1, var13);
                    } else if (var11 == 3) {
                        arg8.method1093(1, arg1, arg0 + 3, 3, 1, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method1092(var13, arg2 - 19299, 4, arg0, arg1);
                    } else if (var11 == 1) {
                        arg8.method1098(-14183, arg0, var13, 4, arg1 + 3);
                    } else if (var11 == 2) {
                        arg8.method1092(var13, -19380, 4, arg0 + 3, arg1);
                    } else if (var11 == 3) {
                        arg8.method1098(arg2 - 14102, arg0, var13, 4, arg1);
                    }
                }
            } else {
                class171.method1144(arg0, 23, arg8, arg1, var10, var11);
            }
        }
        if (arg2 != -81) {
            method316(null, true, -114);
        }
        class338 var14 = (class338) class504.method2874(arg7, arg4, arg6, field677 == null ? (field677 = method322("np")) : field677);
        if (var14 != null) {
            class1 var15 = class402.field5388.method1994(arg2 - 17213, var14.method347((byte) -87));
            int var16 = var14.method344(-4534) & 0x3;
            int var17 = var14.method345(-1736);
            if (var15.field45 != -1) {
                class171.method1144(arg0, -117, arg8, arg1, var15, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field83 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method1096(arg0 + 3, var18, (byte) 86, arg1, arg0, arg1 + 3);
                } else {
                    arg8.method1096(arg0, var18, (byte) 83, arg1, arg0 + 3, arg1 + 3);
                }
            }
        }
        class338 var19 = (class338) class466.method2648(arg7, arg4, arg6);
        if (var19 == null) {
            return;
        }
        class1 var20 = class402.field5388.method1994(-17294, var19.method347((byte) -87));
        int var21 = var19.method344(-4534) & 0x3;
        if (var20.field45 != -1) {
            class171.method1144(arg0, -117, arg8, arg1, var20, var21);
            return;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(I)V")
    public class45(int arg0) {
        this.field672 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIII)V")
    private class45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field674 = arg1;
        this.field667 = arg5;
        this.field672 = arg0;
        this.field675 = arg4;
        this.field670 = arg2;
        this.field665 = arg3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method322(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
