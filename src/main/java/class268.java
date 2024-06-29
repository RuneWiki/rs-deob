import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class268 {

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field4114 = 0;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "F")
    public static float field4115;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4116;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[[B")
    public static byte[][] field4111;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lbj;Z)V", line = 6)
    public static final void method1882(class98 arg0, boolean arg1) {
        if (!arg1) {
            method1884(92, 41);
        }
        class242 var2 = arg0.method699(0);
        arg0.field1507 = var2.field3597;
        field4110++;
        if (arg0.field1483 == 0) {
            arg0.field1565 = 0;
            return;
        }
        if (arg0.field1549 != -1 && arg0.field1538 == 0) {
            class272 var3 = class72.method468(arg0.field1549, -123);
            if (arg0.field1569 > 0 && var3.field4188 == 0) {
                arg0.field1565++;
                return;
            }
            if (arg0.field1569 <= 0 && var3.field4175 == 0) {
                arg0.field1565++;
                return;
            }
        }
        int var4 = arg0.field1566;
        int var5 = arg0.field1505;
        int var6 = arg0.field1541[arg0.field1483 - 1] * 128 + (arg0.method696((byte) 117) * 64);
        int var7 = arg0.field1516[arg0.field1483 - 1] * 128 + (arg0.method696((byte) 117) * 64);
        if ((var6 - var4) > 256 || var6 - var4 < -256 || (var7 - var5) > 256 || var7 - var5 < -256) {
            arg0.field1566 = var6;
            arg0.field1505 = var7;
            return;
        }
        if (var4 >= var6) {
            if (var6 >= var4) {
                if (var7 > var5) {
                    arg0.field1474 = 1024;
                } else if (var7 < var5) {
                    arg0.field1474 = 0;
                }
            } else if (var7 > var5) {
                arg0.field1474 = 768;
            } else if (var5 > var7) {
                arg0.field1474 = 256;
            } else {
                arg0.field1474 = 512;
            }
        } else if (var5 < var7) {
            arg0.field1474 = 1280;
        } else if (var5 > var7) {
            arg0.field1474 = 1792;
        } else {
            arg0.field1474 = 1536;
        }
        int var8 = 4;
        int var9 = var2.field3622;
        boolean var10 = true;
        byte var11 = 1;
        int var12 = arg0.field1474 - arg0.field1470 & 0x7FF;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 >= -256 && var12 <= 256) {
            var9 = var2.field3625;
        } else if (var12 >= 256 && var12 < 768) {
            var9 = var2.field3630;
        } else if (var12 >= -768 && var12 <= -256) {
            var9 = var2.field3624;
        }
        if (var9 == -1) {
            var9 = var2.field3625;
        }
        arg0.field1507 = var9;
        if (arg0 instanceof class69) {
            var10 = ((class69) arg0).field914.field753;
        }
        if (var10) {
            if (arg0.field1474 != arg0.field1470 && arg0.field1508 == -1 && arg0.field1475 != 0) {
                var8 = 2;
            }
            if (arg0.field1483 > 2) {
                var8 = 6;
            }
            if (arg0.field1483 > 3) {
                var8 = 8;
            }
            if (arg0.field1565 > 0 && arg0.field1483 > 1) {
                arg0.field1565--;
                var8 = 8;
            }
        } else {
            if (arg0.field1483 > 1) {
                var8 = 6;
            }
            if (arg0.field1483 > 2) {
                var8 = 8;
            }
            if (arg0.field1565 > 0 && arg0.field1483 > 1) {
                var8 = 8;
                arg0.field1565--;
            }
        }
        if (arg0.field1504[arg0.field1483 - 1] == 2) {
            var11 = 2;
            var8 <<= 0x1;
        } else if (arg0.field1504[arg0.field1483 - 1] == 0) {
            var8 >>= 0x1;
            var11 = 0;
        }
        if (var8 < 8 || var2.field3603 == -1) {
            if (var2.field3601 != -1 && var11 == 0) {
                if (arg0.field1507 == var2.field3622 && var2.field3621 != -1) {
                    arg0.field1507 = var2.field3621;
                } else if (arg0.field1507 == var2.field3624 && var2.field3611 != -1) {
                    arg0.field1507 = var2.field3611;
                } else if (arg0.field1507 == var2.field3630 && var2.field3628 != -1) {
                    arg0.field1507 = var2.field3628;
                } else {
                    arg0.field1507 = var2.field3601;
                }
            }
        } else if (arg0.field1507 == var2.field3622 && var2.field3604 != -1) {
            arg0.field1507 = var2.field3604;
        } else if (arg0.field1507 == var2.field3624 && var2.field3607 != -1) {
            arg0.field1507 = var2.field3607;
        } else if (arg0.field1507 == var2.field3630 && var2.field3600 != -1) {
            arg0.field1507 = var2.field3600;
        } else {
            arg0.field1507 = var2.field3603;
        }
        if (var2.field3610 != -1) {
            int var13 = var8 << 7;
            if (arg0.field1483 == 1) {
                int var14 = arg0.field1558 * arg0.field1558;
                int var15 = (var6 >= arg0.field1566 ? var6 - arg0.field1566 : arg0.field1566 - var6) << 7;
                int var16 = (var7 >= arg0.field1505 ? var7 - arg0.field1505 : arg0.field1505 - var7) << 7;
                int var17 = var16 < var15 ? var15 : var16;
                int var18 = var2.field3610 * 2 * var17;
                if (var18 < var14) {
                    arg0.field1558 /= 2;
                } else if ((var14 / 2) > var17) {
                    arg0.field1558 -= var2.field3610;
                    if (arg0.field1558 < 0) {
                        arg0.field1558 = 0;
                    }
                } else if (arg0.field1558 < var13) {
                    arg0.field1558 += var2.field3610;
                    if (arg0.field1558 > var13) {
                        arg0.field1558 = var13;
                    }
                }
            } else if (arg0.field1558 < var13) {
                arg0.field1558 += var2.field3610;
                if (var13 < arg0.field1558) {
                    arg0.field1558 = var13;
                }
            } else if (arg0.field1558 > 0) {
                arg0.field1558 -= var2.field3610;
                if (arg0.field1558 < 0) {
                    arg0.field1558 = 0;
                }
            }
            var8 = arg0.field1558 >> 7;
            if (var8 < 1) {
                var8 = 1;
            }
        }
        if (var5 < var7) {
            arg0.field1505 += var8;
            if (arg0.field1505 > var7) {
                arg0.field1505 = var7;
            }
        } else if (var7 < var5) {
            arg0.field1505 -= var8;
            if (arg0.field1505 < var7) {
                arg0.field1505 = var7;
            }
        }
        if (var4 < var6) {
            arg0.field1566 += var8;
            if (arg0.field1566 > var6) {
                arg0.field1566 = var6;
            }
        } else if (var4 > var6) {
            arg0.field1566 -= var8;
            if (arg0.field1566 < var6) {
                arg0.field1566 = var6;
            }
        }
        if (arg0.field1566 == var6 && arg0.field1505 == var7) {
            if (arg0.field1569 > 0) {
                arg0.field1569--;
            }
            arg0.field1483--;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[IJB)Ljava/lang/String;", line = 328)
    public static final String method1883(int arg0, int[] arg1, long arg2, byte arg3) {
        int var5 = -88 / ((51 - arg3) / 35);
        field4117++;
        if (class130.field2011 != null) {
            String var6 = class130.field2011.method1669(arg0, 10, arg1, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z", line = 355)
    public static final boolean method1884(int arg0, int arg1) {
        field4109++;
        if (arg0 <= 97) {
            method1882((class98) null, false);
        }
        class241.field3588 = true;
        class125.field1967 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 375)
    public static void method1885(int arg0) {
        field4116 = null;
        field4111 = (byte[][]) null;
        if (arg0 != 1280) {
            field4116 = (String) null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 393)
    public static final void method1886(boolean arg0) {
        class190.field2829 = 0;
        class92.field1379 = -1;
        class5.field27 = false;
        class166.field2498 = 0;
        field4113++;
        class234.field3507.field4025 = 0;
        class259.field3941 = -1;
        class318.field4790 = -1;
        class217.field3289 = -1;
        class207.field3137.field4025 = 0;
        class3.field13 = 0;
        class321.field4856 = 0;
        class70.field926 = 0;
        class253.field3844 = 0;
        for (int var1 = 0; var1 < class241.field3592.length; var1++) {
            if (class241.field3592[var1] != null) {
                class241.field3592[var1].field1508 = -1;
            }
        }
        for (int var2 = 0; var2 < class187.field2788.length; var2++) {
            if (class187.field2788[var2] != null) {
                class187.field2788[var2].field1508 = -1;
            }
        }
        class79.method531(32);
        class56.field710 = 1;
        class163.method1155(30, 10);
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                class22.field298[var3] = true;
            }
            class286.method1989((byte) 86);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BII)V", line = 455)
    public static final void method1887(byte arg0, int arg1, int arg2) {
        if (arg0 <= 8) {
            method1886(true);
        }
        field4112++;
        class169 var3 = class101.method712(arg2, 1, 2089666400);
        var3.method1183(false);
        var3.field2542 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I", line = 468)
    public static final int method1888(int arg0, int arg1, int arg2) {
        field4119++;
        class223 var3 = (class223) class295.field4520.method1320((long) arg1, 13002);
        if (arg2 > -5) {
            method1886(false);
        }
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field3395.length) {
            return var3.field3395[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLlm;)V", line = 487)
    public static final void method1889(byte arg0, class210 arg1) {
        class293.field4493 = class75.method480((byte) -35, arg1, class316.field4774);
        field4118++;
        class180.field2691 = new int[256];
        if (arg0 != -124) {
            method1887((byte) 16, 46, -120);
        }
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class248.field3692[var2] >> 16 & 0xFF);
            int var4 = (class248.field3692[var2 + 1] & 0xFF0000) >> 16;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) ((class248.field3692[var2] & 0xFF00) >> 8);
            int var7 = (class248.field3692[var2 + 1] & 0xFF00) >> 8;
            float var8 = ((float) var7 - var6) / 64.0F;
            float var9 = (float) (class248.field3692[var2] & 0xFF);
            int var10 = class248.field3692[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class180.field2691[var2 * 64 + var12] = class140.method1009(class140.method1009((int) var6 << 8, (int) var3 << 16), (int) var9);
                var9 += var11;
                var6 += var8;
                var3 += var5;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class180.field2691[var13] = class248.field3692[3];
        }
        class12.field135 = new int[32768];
        class74.field960 = new int[32768];
        class297.method2072(0, (class59) null);
        class78.field1083 = new int[32768];
        class123.field1928 = new int[32768];
        class223.field3401 = new class127(128, 254);
    }
}
