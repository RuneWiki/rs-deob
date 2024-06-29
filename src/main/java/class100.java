import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class100 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
    public static int[] field1450 = new int[500];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1448 = "Loaded fonts";

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "[F")
    public static float[] field1449 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lui;")
    public static class98 field1452 = new class98(64);

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field1453 = 0;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 9)
    public static void method656(byte arg0) {
        field1448 = null;
        if (arg0 == 1) {
            field1449 = null;
            field1450 = null;
            field1452 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLre;)V", line = 35)
    public static final void method657(boolean arg0, class287 arg1) {
        class118 var2 = arg1.method2025((byte) 127);
        field1451++;
        if (arg0) {
            method657(true, (class287) null);
        }
        arg1.field4750 = var2.field1739;
        if (arg1.field4792 == 0) {
            arg1.field4725 = 0;
            return;
        }
        if (arg1.field4795 != -1 && arg1.field4715 == 0) {
            class131 var3 = class68.method476((byte) 109, arg1.field4795);
            if (arg1.field4694 > 0 && var3.field2000 == 0) {
                arg1.field4725++;
                return;
            }
            if (arg1.field4694 <= 0 && var3.field2016 == 0) {
                arg1.field4725++;
                return;
            }
        }
        if (arg1.field4784 != -1 && arg1.field4777 <= class58.field875) {
            class172 var4 = class214.method1455((byte) -6, arg1.field4784);
            if (var4.field2689 && var4.field2675 != -1) {
                class131 var5 = class68.method476((byte) 72, var4.field2675);
                if (arg1.field4694 > 0 && var5.field2000 == 0) {
                    arg1.field4725++;
                    return;
                }
                if (arg1.field4694 <= 0 && var5.field2016 == 0) {
                    arg1.field4725++;
                    return;
                }
            }
        }
        int var6 = arg1.field4796;
        int var7 = arg1.field4783;
        int var8 = arg1.field4762[arg1.field4792 - 1] * 128 + (arg1.method312(-92) * 64);
        int var9 = arg1.field4757[arg1.field4792 - 1] * 128 + (arg1.method312(-76) * 64);
        if ((var8 - var6) > 256 || var8 - var6 < -256 || var9 - var7 > 256 || var9 - var7 < -256) {
            arg1.field4783 = var9;
            arg1.field4796 = var8;
            return;
        }
        if (var8 <= var6) {
            if (var8 >= var6) {
                if (var7 < var9) {
                    arg1.field4780 = 1024;
                } else if (var7 > var9) {
                    arg1.field4780 = 0;
                }
            } else if (var9 > var7) {
                arg1.field4780 = 768;
            } else if (var9 >= var7) {
                arg1.field4780 = 512;
            } else {
                arg1.field4780 = 256;
            }
        } else if (var7 < var9) {
            arg1.field4780 = 1280;
        } else if (var9 >= var7) {
            arg1.field4780 = 1536;
        } else {
            arg1.field4780 = 1792;
        }
        int var10 = var2.field1718;
        int var11 = arg1.field4780 - arg1.field4778 & 0x7FF;
        byte var12 = 1;
        boolean var13 = true;
        int var14 = 4;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 >= -256 && var11 <= 256) {
            var10 = var2.field1742;
        } else if (var11 >= 256 && var11 < 768) {
            var10 = var2.field1748;
        } else if (var11 >= -768 && var11 <= -256) {
            var10 = var2.field1719;
        }
        if (var10 == -1) {
            var10 = var2.field1742;
        }
        arg1.field4750 = var10;
        if (arg1 instanceof class233) {
            var13 = ((class233) arg1).field3702.field2185;
        }
        if (var13) {
            if (arg1.field4780 != arg1.field4778 && arg1.field4695 == -1 && arg1.field4732 != 0) {
                var14 = 2;
            }
            if (arg1.field4792 > 2) {
                var14 = 6;
            }
            if (arg1.field4792 > 3) {
                var14 = 8;
            }
            if (arg1.field4725 > 0 && arg1.field4792 > 1) {
                var14 = 8;
                arg1.field4725--;
            }
        } else {
            if (arg1.field4792 > 1) {
                var14 = 6;
            }
            if (arg1.field4792 > 2) {
                var14 = 8;
            }
            if (arg1.field4725 > 0 && arg1.field4792 > 1) {
                var14 = 8;
                arg1.field4725--;
            }
        }
        if (arg1.field4693[arg1.field4792 - 1] == 2) {
            var12 = 2;
            var14 <<= 0x1;
        } else if (arg1.field4693[arg1.field4792 - 1] == 0) {
            var12 = 0;
            var14 >>= 0x1;
        }
        if (var14 < 8 || var2.field1738 == -1) {
            if (var2.field1741 != -1 && var12 == 0) {
                if (arg1.field4750 == var2.field1718 && var2.field1751 != -1) {
                    arg1.field4750 = var2.field1751;
                } else if (arg1.field4750 == var2.field1719 && var2.field1752 != -1) {
                    arg1.field4750 = var2.field1752;
                } else if (arg1.field4750 == var2.field1748 && var2.field1727 != -1) {
                    arg1.field4750 = var2.field1727;
                } else {
                    arg1.field4750 = var2.field1741;
                }
            }
        } else if (arg1.field4750 == var2.field1718 && var2.field1749 != -1) {
            arg1.field4750 = var2.field1749;
        } else if (arg1.field4750 == var2.field1719 && var2.field1715 != -1) {
            arg1.field4750 = var2.field1715;
        } else if (arg1.field4750 == var2.field1748 && var2.field1713 != -1) {
            arg1.field4750 = var2.field1713;
        } else {
            arg1.field4750 = var2.field1738;
        }
        if (var2.field1730 != -1) {
            int var15 = var14 << 7;
            if (arg1.field4792 == 1) {
                int var16 = arg1.field4752 * arg1.field4752;
                int var17 = (var8 >= arg1.field4796 ? var8 - arg1.field4796 : -var8 + arg1.field4796) << 7;
                int var18 = (var9 >= arg1.field4783 ? var9 - arg1.field4783 : -var9 + arg1.field4783) << 7;
                int var19 = var18 < var17 ? var17 : var18;
                int var20 = var2.field1730 * 2 * var19;
                if (var16 > var20) {
                    arg1.field4752 /= 2;
                } else if (var16 / 2 > var19) {
                    arg1.field4752 -= var2.field1730;
                    if (arg1.field4752 < 0) {
                        arg1.field4752 = 0;
                    }
                } else if (arg1.field4752 < var15) {
                    arg1.field4752 += var2.field1730;
                    if (var15 < arg1.field4752) {
                        arg1.field4752 = var15;
                    }
                }
            } else if (arg1.field4752 < var15) {
                arg1.field4752 += var2.field1730;
                if (arg1.field4752 > var15) {
                    arg1.field4752 = var15;
                }
            } else if (arg1.field4752 > 0) {
                arg1.field4752 -= var2.field1730;
                if (arg1.field4752 < 0) {
                    arg1.field4752 = 0;
                }
            }
            var14 = arg1.field4752 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var6 < var8) {
            arg1.field4796 += var14;
            if (arg1.field4796 > var8) {
                arg1.field4796 = var8;
            }
        } else if (var6 > var8) {
            arg1.field4796 -= var14;
            if (var8 > arg1.field4796) {
                arg1.field4796 = var8;
            }
        }
        if (var7 < var9) {
            arg1.field4783 += var14;
            if (arg1.field4783 > var9) {
                arg1.field4783 = var9;
            }
        } else if (var7 > var9) {
            arg1.field4783 -= var14;
            if (var9 > arg1.field4783) {
                arg1.field4783 = var9;
            }
        }
        if (arg1.field4796 == var8 && arg1.field4783 == var9) {
            if (arg1.field4694 > 0) {
                arg1.field4694--;
            }
            arg1.field4792--;
        }
    }
}
