import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class215 extends class640 {

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3279 = new String[] { method1882(method1881("={\u001f)")), method1882(method1881("<m]\rx")), method1882(method1881("( ]k-")), method1882(method1881("<m]\u0002x")), method1882(method1881("<m]\u0003x")) };

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Leu;")
    public static class505 field3276 = new class505(4);

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[B")
    public static byte[] field3278 = new byte[32896];

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Loc;")
    public class215 field3273;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Loc;")
    public class215 field3274;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3278[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 7)
    public static void method1878(int arg0) {
        try {
            if (arg0 != 0) {
                method1878(120);
            }
            field3276 = null;
            field3278 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3279[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 18)
    public final void method1879(int arg0) {
        try {
            field3277++;
            if (this.field3273 != null) {
                if (arg0 != 0) {
                    method1878(120);
                }
                this.field3273.field3274 = this.field3274;
                this.field3274.field3273 = this.field3273;
                this.field3274 = null;
                this.field3273 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3279[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLec;Z)V", line = 41)
    public static final void method1880(boolean arg0, class247 arg1, boolean arg2) {
        try {
            field3275++;
            class144 var3 = arg1.method2099(108);
            if (arg1.field3862 == 0) {
                arg1.field3867 = 0;
                class458.field6669 = 0;
                class372.field5672 = -1;
            } else {
                if (arg1.field3814 != -1 && arg1.field3850 == 0) {
                    class344 var4 = class272.field4122.method2242(arg1.field3814, 100);
                    if (arg1.field3858 > 0 && var4.field5368 == 0) {
                        class372.field5672 = -1;
                        class458.field6669 = 0;
                        arg1.field3867++;
                        return;
                    }
                    if (arg1.field3858 <= 0 && var4.field5354 == 0) {
                        arg1.field3867++;
                        class458.field6669 = 0;
                        class372.field5672 = -1;
                        return;
                    }
                }
                for (int var5 = 0; var5 < arg1.field3775.length; var5++) {
                    if (arg1.field3775[var5].field563 != -1 && class375.field5711 >= arg1.field3775[var5].field562) {
                        class217 var6 = class771.field11208.method2509(-119, arg1.field3775[var5].field563);
                        if (var6.field3306 && var6.field3313 != -1) {
                            class344 var7 = class272.field4122.method2242(var6.field3313, 100);
                            if (arg1.field3858 > 0 && var7.field5368 == 0) {
                                class458.field6669 = 0;
                                class372.field5672 = -1;
                                arg1.field3867++;
                                return;
                            }
                            if (arg1.field3858 <= 0 && var7.field5354 == 0) {
                                arg1.field3867++;
                                class458.field6669 = 0;
                                class372.field5672 = -1;
                                return;
                            }
                        }
                    }
                }
                int var8 = arg1.field6197;
                int var9 = arg1.field6211;
                int var10 = arg1.field3859[arg1.field3862 - 1] * 512 + arg1.method2101(31463) * 256;
                int var11 = arg1.field3863[arg1.field3862 - 1] * 512 + arg1.method2101(31463) * 256;
                if (var10 <= var8) {
                    if (var10 >= var8) {
                        if (var9 < var11) {
                            arg1.method2097(8192, 0);
                        } else if (var11 < var9) {
                            arg1.method2097(0, 0);
                        }
                    } else if (var9 < var11) {
                        arg1.method2097(6144, 0);
                    } else if (var9 > var11) {
                        arg1.method2097(2048, 0);
                    } else {
                        arg1.method2097(4096, 0);
                    }
                } else if (var9 < var11) {
                    arg1.method2097(10240, 0);
                } else if (var11 >= var9) {
                    arg1.method2097(12288, 0);
                } else {
                    arg1.method2097(14336, 0);
                }
                byte var12 = arg1.field3857[arg1.field3862 - 1];
                if (arg2 || var10 - var8 <= 1024 && var10 - var8 >= -1024 && (var11 - var9) <= 1024 && (var11 - var9) >= -1024) {
                    int var13 = 16;
                    boolean var14 = true;
                    if (arg1 instanceof class612) {
                        var14 = ((class612) arg1).field8947.field7144;
                    }
                    if (!arg0) {
                        if (var14) {
                            int var15 = arg1.field3845 - arg1.field3839.field3110;
                            if (var15 != 0 && arg1.field3842 == -1 && arg1.field3810 != 0) {
                                var13 = 8;
                            }
                            if (!arg2 && arg1.field3862 > 2) {
                                var13 = 24;
                            }
                            if (!arg2 && arg1.field3862 > 3) {
                                var13 = 32;
                            }
                        } else {
                            if (!arg2 && arg1.field3862 > 1) {
                                var13 = 24;
                            }
                            if (!arg2 && arg1.field3862 > 2) {
                                var13 = 32;
                            }
                        }
                        if (arg1.field3867 > 0 && arg1.field3862 > 1) {
                            var13 = 32;
                            arg1.field3867--;
                        }
                        if (var12 == 2) {
                            var13 <<= 0x1;
                        } else if (var12 == 0) {
                            var13 >>= 0x1;
                        }
                        class458.field6669 = 0;
                        if (var3.field1761 != -1) {
                            int var16 = var13 << 9;
                            if (arg1.field3862 == 1) {
                                int var17 = arg1.field3866 * arg1.field3866;
                                int var18 = (arg1.field6197 <= var10 ? var10 - arg1.field6197 : -var10 + arg1.field6197) << 9;
                                int var19 = (arg1.field6211 <= var11 ? var11 - arg1.field6211 : arg1.field6211 - var11) << 9;
                                int var20 = var18 > var19 ? var18 : var19;
                                int var21 = var20 * 2 * var3.field1761;
                                if (var17 > var21) {
                                    arg1.field3866 /= 2;
                                } else if (var17 / 2 > var20) {
                                    arg1.field3866 -= var3.field1761;
                                    if (arg1.field3866 < 0) {
                                        arg1.field3866 = 0;
                                    }
                                } else if (arg1.field3866 < var16) {
                                    arg1.field3866 += var3.field1761;
                                    if (arg1.field3866 > var16) {
                                        arg1.field3866 = var16;
                                    }
                                }
                            } else if (var16 > arg1.field3866) {
                                arg1.field3866 += var3.field1761;
                                if (var16 < arg1.field3866) {
                                    arg1.field3866 = var16;
                                }
                            } else if (arg1.field3866 > 0) {
                                arg1.field3866 -= var3.field1761;
                                if (arg1.field3866 < 0) {
                                    arg1.field3866 = 0;
                                }
                            }
                            var13 = arg1.field3866 >> 9;
                            if (var13 < 1) {
                                var13 = 1;
                            }
                        }
                        if (var8 == var10 && var9 == var11) {
                            class372.field5672 = -1;
                        } else {
                            if (var10 > var8) {
                                class458.field6669 |= 0x4;
                                arg1.field6197 += var13;
                                if (var10 < arg1.field6197) {
                                    arg1.field6197 = var10;
                                }
                            } else if (var8 > var10) {
                                arg1.field6197 -= var13;
                                class458.field6669 |= 0x8;
                                if (var10 > arg1.field6197) {
                                    arg1.field6197 = var10;
                                }
                            }
                            if (var11 > var9) {
                                class458.field6669 |= 0x1;
                                arg1.field6211 += var13;
                                if (arg1.field6211 > var11) {
                                    arg1.field6211 = var11;
                                }
                            } else if (var9 > var11) {
                                class458.field6669 |= 0x2;
                                arg1.field6211 -= var13;
                                if (arg1.field6211 < var11) {
                                    arg1.field6211 = var11;
                                }
                            }
                            if (var13 < 32) {
                                class372.field5672 = var12;
                            } else {
                                class372.field5672 = 2;
                            }
                        }
                        if (arg1.field6197 == var10 && arg1.field6211 == var11) {
                            if (arg1.field3858 > 0) {
                                arg1.field3858--;
                            }
                            arg1.field3862--;
                        }
                    }
                } else {
                    arg1.field6211 = var11;
                    arg1.field6197 = var10;
                    arg1.method2103(0, arg1.field3845, false);
                    if (arg1.field3858 > 0) {
                        arg1.field3858--;
                    }
                    class458.field6669 = 0;
                    class372.field5672 = -1;
                    arg1.field3862--;
                }
            }
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field3279[1] + arg0 + ',' + (arg1 == null ? field3279[0] : field3279[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1881(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1882(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
