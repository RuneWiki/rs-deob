import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class142 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Z")
    public static boolean field2279 = true;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
    public static boolean field2288 = false;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lvc;")
    public class142 field2280;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lvc;")
    public class142 field2281;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 4)
    public static final boolean method1002(String arg0, int arg1) {
        field2284++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class339.field5458; var2++) {
            if (arg0.equalsIgnoreCase(class31.field476[var2])) {
                return true;
            }
        }
        if (arg1 != 64) {
            field2288 = false;
        }
        if (arg0.equalsIgnoreCase(class329.field5388.field597)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V", line = 40)
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class39.field602 = arg3;
        class170.field2662 = arg5;
        class206.field3132 = arg0;
        field2285++;
        class190.field2948 = arg1;
        class355.field5629 = arg2;
        int var6 = -5 % ((-arg4 - 46) / 53);
        if (class206.field3132 >= 100) {
            int var7 = class170.field2662 * 128 + 64;
            int var8 = class355.field5629 * 128 + 64;
            int var9 = client.method889(var7, class120.field1779, var8, -122) - class190.field2948;
            int var10 = var7 - class41.field625;
            int var11 = var9 - class74.field1117;
            int var12 = var8 - class259.field4098;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class54.field817 = (int) (Math.atan2((double) var11, (double) var13) * 325.949D) & 0x7FF;
            class147.field2369 = (int) (-325.949D * Math.atan2((double) var10, (double) var12)) & 0x7FF;
            if (class54.field817 < 128) {
                class54.field817 = 128;
            }
            if (class54.field817 > 383) {
                class54.field817 = 383;
            }
        }
        class269.field4427 = 2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lod;I)I", line = 90)
    public static final int method1004(class233 arg0, int arg1) {
        field2290++;
        class139 var2 = arg0.field3702;
        if (var2.field2229 != null) {
            var2 = var2.method987(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2223;
        class118 var4 = arg0.method2025((byte) 118);
        if (arg0.field4750 == var4.field1739) {
            var3 = var2.field2221;
        } else if (arg0.field4750 == var4.field1738 || arg0.field4750 == var4.field1749 || arg0.field4750 == var4.field1713 || arg0.field4750 == var4.field1715) {
            var3 = var2.field2222;
        } else if (arg0.field4750 == var4.field1741 || arg0.field4750 == var4.field1751 || arg0.field4750 == var4.field1727 || arg0.field4750 == var4.field1752) {
            var3 = var2.field2252;
        }
        if (arg1 != 20438) {
            field2279 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 131)
    public final void method1005(byte arg0) {
        if (arg0 >= -67) {
            return;
        }
        field2286++;
        if (this.field2281 != null) {
            this.field2281.field2280 = this.field2280;
            this.field2280.field2281 = this.field2281;
            this.field2280 = null;
            this.field2281 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lre;I)V", line = 149)
    public static final void method1006(class287 arg0, int arg1) {
        field2287++;
        if (arg0.field4732 == 0) {
            return;
        }
        class118 var2 = arg0.method2025((byte) 127);
        if (arg0.field4695 != -1 && arg0.field4695 < 32768) {
            class233 var3 = class329.field5377[arg0.field4695];
            if (var3 != null) {
                int var4 = arg0.field4796 - var3.field4796;
                int var5 = arg0.field4783 - var3.field4783;
                if (var4 != 0 || var5 != 0) {
                    arg0.field4780 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4695 >= 32768) {
            int var6 = arg0.field4695 - 32768;
            if (class102.field1490 == var6) {
                var6 = 2047;
            }
            class39 var7 = class130.field1984[var6];
            if (var7 != null) {
                int var8 = arg0.field4796 - var7.field4796;
                int var9 = arg0.field4783 - var7.field4783;
                if (var8 != 0 || var9 != 0) {
                    arg0.field4780 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((~arg0.field4735 != arg1 || arg0.field4704 != 0) && (arg0.field4792 == 0 || arg0.field4725 > 0)) {
            int var10 = arg0.field4796 - ((arg0.field4735 - class215.field3313 - class215.field3313) * 64);
            int var11 = arg0.field4783 - (arg0.field4704 - class150.field2420 - class150.field2420) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field4780 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field4704 = 0;
            arg0.field4735 = 0;
        }
        int var12 = arg0.field4780 - arg0.field4778 & 0x7FF;
        if (var12 == 0) {
            arg0.field4774 = 0;
            arg0.field4742 = 0;
        } else if (var2.field1723 == 0) {
            arg0.field4774++;
            if (var12 <= 1024) {
                boolean var13 = true;
                arg0.field4778 += arg0.field4732;
                if (var12 < arg0.field4732 || var12 > (2048 - arg0.field4732)) {
                    arg0.field4778 = arg0.field4780;
                    var13 = false;
                }
                if (arg0.field4774 > 25 || var13) {
                    arg0.field4750 = var2.field1742;
                    if (arg0.field4792 <= 0) {
                        if (var2.field1737 != -1) {
                            arg0.field4750 = var2.field1737;
                        }
                    } else if (arg0.field4693[arg0.field4792 - 1] == 2) {
                        if (var2.field1732 != -1) {
                            arg0.field4750 = var2.field1732;
                        } else if (var2.field1738 != -1) {
                            arg0.field4750 = var2.field1738;
                        }
                    } else if (arg0.field4693[arg0.field4792 - 1] == 0) {
                        if (var2.field1733 != -1) {
                            arg0.field4750 = var2.field1733;
                        } else if (var2.field1741 != -1) {
                            arg0.field4750 = var2.field1741;
                        }
                    } else if (var2.field1731 != -1) {
                        arg0.field4750 = var2.field1731;
                    }
                }
            } else {
                boolean var14 = true;
                arg0.field4778 -= arg0.field4732;
                if (var12 < arg0.field4732 || (2048 - arg0.field4732) < var12) {
                    arg0.field4778 = arg0.field4780;
                    var14 = false;
                }
                if (arg0.field4774 > 25 || var14) {
                    arg0.field4750 = var2.field1742;
                    if (arg0.field4792 <= 0) {
                        if (var2.field1750 != -1) {
                            arg0.field4750 = var2.field1750;
                        }
                    } else if (arg0.field4693[arg0.field4792 - 1] == 2) {
                        if (var2.field1729 != -1) {
                            arg0.field4750 = var2.field1729;
                        } else if (var2.field1738 != -1) {
                            arg0.field4750 = var2.field1738;
                        }
                    } else if (arg0.field4693[arg0.field4792 - 1] == 0) {
                        if (var2.field1728 != -1) {
                            arg0.field4750 = var2.field1728;
                        } else if (var2.field1741 != -1) {
                            arg0.field4750 = var2.field1741;
                        }
                    } else if (var2.field1721 != -1) {
                        arg0.field4750 = var2.field1721;
                    }
                }
            }
            arg0.field4778 &= 0x7FF;
        } else {
            arg0.field4750 = -1;
            int var15 = arg0.field4780 << 5;
            if (arg0.field4772 != var15) {
                arg0.field4772 = var15;
                arg0.field4760 = 0;
                int var16 = arg0.field4742 * arg0.field4742 / (var2.field1723 * 2);
                int var17 = var15 - arg0.field4746 & 0xFFFF;
                if (arg0.field4742 > 0 && var17 >= var16 && (var17 - var16) < 32768) {
                    arg0.field4733 = var17 / 2;
                    arg0.field4790 = true;
                    int var18 = var2.field1744 * var2.field1744 / (var2.field1723 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg0.field4733) {
                        arg0.field4733 = var17 - var18;
                    }
                } else if (arg0.field4742 < 0 && var16 <= 65536 - var17 && 65536 - var16 - var17 < 32768) {
                    arg0.field4733 = (65536 - var17) / 2;
                    arg0.field4790 = true;
                    int var19 = var2.field1744 * var2.field1744 / (var2.field1723 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (arg0.field4733 > var19) {
                        arg0.field4733 = 65536 - var17 - var19;
                    }
                } else {
                    arg0.field4790 = false;
                }
            }
            if (arg0.field4742 == 0) {
                int var20 = arg0.field4772 - arg0.field4746 & 0xFFFF;
                if (var20 >= var2.field1723) {
                    arg0.field4760 = 0;
                    arg0.field4790 = true;
                    int var21 = var2.field1744 * var2.field1744 / (var2.field1723 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg0.field4733 = (65536 - var20) / 2;
                        if (var21 < arg0.field4733) {
                            arg0.field4733 = 65536 - var21 - var20;
                        }
                        arg0.field4742 = -var2.field1723;
                    } else {
                        arg0.field4742 = var2.field1723;
                        arg0.field4733 = var20 / 2;
                        if (var21 < arg0.field4733) {
                            arg0.field4733 = var20 - var21;
                        }
                    }
                } else {
                    arg0.field4746 = arg0.field4772;
                }
            } else if (arg0.field4742 <= 0) {
                if (arg0.field4760 >= arg0.field4733) {
                    arg0.field4790 = false;
                }
                if (!arg0.field4790) {
                    arg0.field4742 += var2.field1723;
                    if (arg0.field4742 > 0) {
                        arg0.field4742 = 0;
                    }
                } else if (arg0.field4742 > -var2.field1744) {
                    arg0.field4742 -= var2.field1723;
                }
            } else {
                if (arg0.field4760 >= arg0.field4733) {
                    arg0.field4790 = false;
                }
                if (!arg0.field4790) {
                    arg0.field4742 -= var2.field1723;
                    if (arg0.field4742 < 0) {
                        arg0.field4742 = 0;
                    }
                } else if (var2.field1744 > arg0.field4742) {
                    arg0.field4742 += var2.field1723;
                }
            }
            arg0.field4746 += arg0.field4742;
            arg0.field4746 &= 0xFFFF;
            if (arg0.field4742 > 0) {
                arg0.field4760 += arg0.field4742;
            } else {
                arg0.field4760 -= arg0.field4742;
            }
            arg0.field4778 = arg0.field4746 >> 5;
            if (arg0.field4742 < 0) {
                if (arg0.field4792 > 0) {
                    if (arg0.field4693[arg0.field4792 - 1] == 2) {
                        if (var2.field1729 != -1) {
                            arg0.field4750 = var2.field1729;
                        } else if (var2.field1738 != -1) {
                            arg0.field4750 = var2.field1738;
                        }
                    } else if (arg0.field4693[arg0.field4792 - 1] == 0) {
                        if (var2.field1728 != -1) {
                            arg0.field4750 = var2.field1728;
                        } else if (var2.field1741 != -1) {
                            arg0.field4750 = var2.field1741;
                        }
                    }
                }
                if (arg0.field4750 == -1) {
                    if (var2.field1721 != -1) {
                        arg0.field4750 = var2.field1721;
                    } else if (var2.field1750 != -1) {
                        arg0.field4750 = var2.field1750;
                    }
                }
            } else {
                if (arg0.field4792 > 0) {
                    if (arg0.field4693[arg0.field4792 - 1] == 2) {
                        if (var2.field1732 != -1) {
                            arg0.field4750 = var2.field1732;
                        } else if (var2.field1738 != -1) {
                            arg0.field4750 = var2.field1738;
                        }
                    } else if (arg0.field4693[arg0.field4792 - 1] == 0) {
                        if (var2.field1733 != -1) {
                            arg0.field4750 = var2.field1733;
                        } else if (var2.field1741 != -1) {
                            arg0.field4750 = var2.field1741;
                        }
                    }
                }
                if (arg0.field4750 == -1) {
                    if (var2.field1731 != -1) {
                        arg0.field4750 = var2.field1731;
                    } else if (var2.field1737 != -1) {
                        arg0.field4750 = var2.field1737;
                    }
                }
            }
            if (arg0.field4750 == -1) {
                arg0.field4750 = var2.field1742;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBLnm;)[Lfo;", line = 581)
    public static final class239[] method1007(int arg0, int arg1, byte arg2, class221 arg3) {
        field2289++;
        if (arg2 != 24) {
            method1006((class287) null, -58);
        }
        return class334.method2361(arg0, arg3, arg2 + 16812, arg1) ? class305.method2136(0) : null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 604)
    public static final void method1008(int arg0) {
        class159.field2552.method255(8);
        int var1 = class159.field2552.method246(arg0 - 65528, 8);
        field2282++;
        if (class294.field4892 > var1) {
            for (int var2 = var1; var2 < class294.field4892; var2++) {
                class292.field4846[class153.field2485++] = class243.field3843[var2];
            }
        }
        if (class294.field4892 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class294.field4892 = 0;
        if (arg0 != 65536) {
            field2279 = false;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class243.field3843[var3];
            class233 var5 = class329.field5377[var4];
            int var6 = class159.field2552.method246(8, 1);
            if (var6 == 0) {
                class243.field3843[class294.field4892++] = var4;
                var5.field4743 = class58.field875;
            } else {
                int var7 = class159.field2552.method246(arg0 - 65528, 2);
                if (var7 == 0) {
                    class243.field3843[class294.field4892++] = var4;
                    var5.field4743 = class58.field875;
                    class166.field2611[class99.field1440++] = var4;
                } else if (var7 == 1) {
                    class243.field3843[class294.field4892++] = var4;
                    var5.field4743 = class58.field875;
                    int var12 = class159.field2552.method246(8, 3);
                    var5.method2036(1, 67, var12);
                    int var13 = class159.field2552.method246(8, 1);
                    if (var13 == 1) {
                        class166.field2611[class99.field1440++] = var4;
                    }
                } else if (var7 == 2) {
                    class243.field3843[class294.field4892++] = var4;
                    var5.field4743 = class58.field875;
                    if (class159.field2552.method246(arg0 - 65528, 1) == 1) {
                        int var9 = class159.field2552.method246(8, 3);
                        var5.method2036(2, 103, var9);
                        int var10 = class159.field2552.method246(8, 3);
                        var5.method2036(2, 88, var10);
                    } else {
                        int var8 = class159.field2552.method246(arg0 ^ 0x10008, 3);
                        var5.method2036(0, 115, var8);
                    }
                    int var11 = class159.field2552.method246(arg0 ^ 0x10008, 1);
                    if (var11 == 1) {
                        class166.field2611[class99.field1440++] = var4;
                    }
                } else if (var7 == 3) {
                    class292.field4846[class153.field2485++] = var4;
                }
            }
        }
    }
}
