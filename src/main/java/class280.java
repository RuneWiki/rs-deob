import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class280 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field3706 = 2048;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field3712 = 2048;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field3707 = 0;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field3710 = 0;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Z")
    public static boolean field3709 = false;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lao;")
    public static class191 field3705 = new class191(17, -1);

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
    public static boolean field3716 = false;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "[I")
    public static int[] field3711;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBLug;)V")
    private final void method1692(int arg0, byte arg1, class396 arg2) {
        if (arg0 == 1) {
            this.field3710 = arg2.method2388((byte) -112);
        } else if (arg0 == 2) {
            this.field3712 = arg2.method2386(-23648);
        } else if (arg0 == 3) {
            this.field3706 = arg2.method2386(-23648);
        } else if (arg0 == 4) {
            this.field3707 = arg2.method2433((byte) 115);
        }
        field3713++;
        if (arg1 >= -57) {
            field3705 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BZLwk;)V")
    public static final void method1693(byte arg0, boolean arg1, class96 arg2) {
        field3715++;
        class306 var3 = arg2.method547((byte) 117);
        if (arg2.field1254 == 0) {
            class169.field2196 = 0;
            arg2.field1256 = 0;
            class250.field3327 = -1;
            return;
        }
        if (arg2.field1196 != -1 && arg2.field1152 == 0) {
            class260 var4 = class7.field97.method2951(arg2.field1196, arg0 - 13786);
            if (arg2.field1257 > 0 && var4.field3483 == 0) {
                class250.field3327 = -1;
                class169.field2196 = 0;
                arg2.field1256++;
                return;
            }
            if (arg2.field1257 <= 0 && var4.field3473 == 0) {
                class169.field2196 = 0;
                class250.field3327 = -1;
                arg2.field1256++;
                return;
            }
        }
        if (arg2.field1210 != -1 && arg2.field1187 <= class532.field7836) {
            class88 var5 = class71.field914.method1608((byte) 82, arg2.field1210);
            if (var5.field1051 && var5.field1047 != -1) {
                class260 var6 = class7.field97.method2951(var5.field1047, -13765);
                if (arg2.field1257 > 0 && var6.field3483 == 0) {
                    arg2.field1256++;
                    class250.field3327 = -1;
                    class169.field2196 = 0;
                    return;
                }
                if (arg2.field1257 <= 0 && var6.field3473 == 0) {
                    arg2.field1256++;
                    class250.field3327 = -1;
                    class169.field2196 = 0;
                    return;
                }
            }
        }
        if (arg2.field1210 != -1 && class532.field7836 >= arg2.field1187) {
            class88 var7 = class71.field914.method1608((byte) 82, arg2.field1210);
            if (var7.field1051 && var7.field1047 != -1) {
                class260 var8 = class7.field97.method2951(var7.field1047, -13765);
                if (arg2.field1257 > 0 && var8.field3483 == 0) {
                    arg2.field1256++;
                    class169.field2196 = 0;
                    class250.field3327 = -1;
                    return;
                }
                if (arg2.field1257 <= 0 && var8.field3473 == 0) {
                    arg2.field1256++;
                    class250.field3327 = -1;
                    class169.field2196 = 0;
                    return;
                }
            }
        }
        int var9 = arg2.field3704;
        int var10 = arg2.field3694;
        int var11 = arg2.field1249[arg2.field1254 - 1] * 128 + (arg2.method546(24273) * 64);
        int var12 = arg2.field1251[arg2.field1254 - 1] * 128 + (arg2.method546(arg0 ^ 0x5EC4) * 64);
        if (var9 >= var11) {
            if (var9 > var11) {
                if (var10 < var12) {
                    arg2.method536(16383, 6144);
                } else if (var10 > var12) {
                    arg2.method536(16383, 2048);
                } else {
                    arg2.method536(16383, 4096);
                }
            } else if (var10 < var12) {
                arg2.method536(16383, 8192);
            } else if (var10 > var12) {
                arg2.method536(16383, 0);
            }
        } else if (var12 > var10) {
            arg2.method536(arg0 ^ 0x3FEA, 10240);
        } else if (var12 >= var10) {
            arg2.method536(16383, 12288);
        } else {
            arg2.method536(16383, 14336);
        }
        byte var13 = arg2.field1255[arg2.field1254 - 1];
        if (!arg1 && ((var11 - var9) > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || var12 - var10 < -256)) {
            arg2.field3704 = var11;
            arg2.field3694 = var12;
            arg2.method553(arg2.field1195, arg0 ^ 0x59);
            class250.field3327 = -1;
            class169.field2196 = 0;
            arg2.field1254--;
            if (arg2.field1257 > 0) {
                arg2.field1257--;
            }
        } else if (arg0 == 21) {
            int var14 = 4;
            boolean var15 = true;
            if (arg2 instanceof class22) {
                var15 = ((class22) arg2).field220.field2868;
            }
            if (var15) {
                int var16 = arg2.field1195 - arg2.field1231.field1382;
                if (var16 != 0 && arg2.field1156 == -1 && arg2.field1200 != 0) {
                    var14 = 2;
                }
                if (!arg1 && arg2.field1254 > 2) {
                    var14 = 6;
                }
                if (!arg1 && arg2.field1254 > 3) {
                    var14 = 8;
                }
            } else {
                if (!arg1 && arg2.field1254 > 1) {
                    var14 = 6;
                }
                if (!arg1 && arg2.field1254 > 2) {
                    var14 = 8;
                }
            }
            if (arg2.field1256 > 0 && arg2.field1254 > 1) {
                arg2.field1256--;
                var14 = 8;
            }
            if (var13 == 2) {
                var14 <<= 0x1;
            } else if (var13 == 0) {
                var14 >>= 0x1;
            }
            class169.field2196 = 0;
            if (var3.field4096 != -1) {
                int var17 = var14 << 7;
                if (arg2.field1254 == 1) {
                    int var18 = arg2.field1250 * arg2.field1250;
                    int var19 = (arg2.field3704 > var11 ? arg2.field3704 - var11 : -arg2.field3704 + var11) << 7;
                    int var20 = (arg2.field3694 <= var12 ? var12 - arg2.field3694 : arg2.field3694 - var12) << 7;
                    int var21 = var19 <= var20 ? var20 : var19;
                    int var22 = var3.field4096 * var21 * 2;
                    if (var22 < var18) {
                        arg2.field1250 /= 2;
                    } else if ((var18 / 2) > var21) {
                        arg2.field1250 -= var3.field4096;
                        if (arg2.field1250 < 0) {
                            arg2.field1250 = 0;
                        }
                    } else if (var17 > arg2.field1250) {
                        arg2.field1250 += var3.field4096;
                        if (arg2.field1250 > var17) {
                            arg2.field1250 = var17;
                        }
                    }
                } else if (arg2.field1250 < var17) {
                    arg2.field1250 += var3.field4096;
                    if (var17 < arg2.field1250) {
                        arg2.field1250 = var17;
                    }
                } else if (arg2.field1250 > 0) {
                    arg2.field1250 -= var3.field4096;
                    if (arg2.field1250 < 0) {
                        arg2.field1250 = 0;
                    }
                }
                var14 = arg2.field1250 >> 7;
                if (var14 < 1) {
                    var14 = 1;
                }
            }
            if (var11 > var9) {
                arg2.field3704 += var14;
                class169.field2196 |= 0x4;
                if (var11 < arg2.field3704) {
                    arg2.field3704 = var11;
                }
            } else if (var11 < var9) {
                class169.field2196 |= 0x8;
                arg2.field3704 -= var14;
                if (var11 > arg2.field3704) {
                    arg2.field3704 = var11;
                }
            }
            if (var10 < var12) {
                class169.field2196 |= 0x1;
                arg2.field3694 += var14;
                if (arg2.field3694 > var12) {
                    arg2.field3694 = var12;
                }
            } else if (var10 > var12) {
                class169.field2196 |= 0x2;
                arg2.field3694 -= var14;
                if (var12 > arg2.field3694) {
                    arg2.field3694 = var12;
                }
            }
            if (arg2.field3704 == var11 && arg2.field3694 == var12) {
                if (arg2.field1257 > 0) {
                    arg2.field1257--;
                }
                arg2.field1254--;
            }
            if (var14 >= 8) {
                class250.field3327 = 2;
            } else {
                class250.field3327 = var13;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static final void method1694(byte arg0) {
        class377.field5277 = null;
        class250.field3337 = null;
        class331.field4392 = null;
        class193.field2498 = null;
        class161.field2096 = null;
        class302.field3996 = null;
        class186.field2426 = null;
        class192.field2472 = null;
        class464.field6907 = null;
        class29.field286 = null;
        class331.field4394 = null;
        if (arg0 < 11) {
            method1693((byte) -9, true, null);
        }
        class513.field7468 = null;
        class79.field976 = null;
        field3714++;
        class12.field130 = null;
        class225.field3028 = null;
        class434.field6332 = null;
        class483.field7124 = null;
        class152.field1984 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static void method1695(byte arg0) {
        field3705 = null;
        field3711 = null;
        if (arg0 > -84) {
            field3705 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lug;I)V")
    public final void method1696(class396 arg0, int arg1) {
        if (arg1 != -19095) {
            method1693((byte) -126, false, null);
        }
        field3708++;
        while (true) {
            int var3 = arg0.method2388((byte) -111);
            if (var3 == 0) {
                return;
            }
            this.method1692(var3, (byte) -67, arg0);
        }
    }
}
