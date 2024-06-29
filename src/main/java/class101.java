import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class101 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
    public boolean field1475 = false;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[S")
    public static short[] field1484 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public static int[] field1477 = new int[256];

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
    public static int[] field1489 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field1490 = 20;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lef;")
    public static class221 field1488 = new class221();

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field1496 = -1;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lhj;")
    public static class73 field1494 = new class73(0, -1);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field1498 = 0;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    public static int[] field1476;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILlc;Llc;)Lba;")
    public static final class170 method763(int arg0, int arg1, int arg2, class86 arg3, class86 arg4) {
        if (arg0 != 2047) {
            field1490 = 27;
        }
        field1478++;
        return class156.method1155(arg1, arg3, arg0 ^ 0x7C1, arg2) ? class273.method1891(arg4.method643(arg1, arg2, false), -3) : null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method764(int arg0) {
        if (arg0 != -4268) {
            field1494 = null;
        }
        class235.field3794.method1556((byte) 71);
        field1485++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;Llc;)Lph;")
    public static final class80 method765(int arg0, String arg1, class86 arg2) {
        field1481++;
        int var3 = arg2.method619(arg0 ^ 0xFFFFFFFD, arg1);
        if (arg0 != 2) {
            field1489 = null;
        }
        if (var3 == -1) {
            return new class80(0);
        }
        int[] var4 = arg2.method641(0, var3);
        class80 var5 = new class80(var4.length);
        for (int var6 = 0; var6 < var5.field1150; var6++) {
            class152 var7 = new class152(arg2.method643(var4[var6], var3, false));
            var5.field1153[var6] = var7.method1078(-1);
            var5.field1161[var6] = var7.method1092((byte) -62);
            var5.field1165[var6] = var7.method1097(126);
            var5.field1164[var6] = var7.method1097(class148.method1051(arg0, 124));
        }
        return var5;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method766(int arg0, int arg1, boolean arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        class36 var3 = class134.method970(arg0, 0);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        field1487++;
        if (arg2) {
            field1482 = 28;
        }
        return var3.method275(0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILv;)V")
    private final void method767(int arg0, int arg1, int arg2, class152 arg3) {
        field1493++;
        if (arg1 != -3) {
            field1484 = null;
        }
        if (arg0 == 1) {
            this.field1491 = arg3.method1126(false);
        } else if (arg0 == 2) {
            this.field1480 = arg3.method1128((byte) -118);
        } else if (arg0 == 3) {
            this.field1475 = true;
        } else if (arg0 == 4) {
            this.field1491 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBZ)Lvd;")
    public final class4 method768(int arg0, byte arg1, boolean arg2) {
        field1486++;
        class4 var4 = (class4) class150.field2441.method1553((long) (this.field1491 | arg0 << 16 | (arg2 ? 262144 : 0)), (byte) -124);
        if (var4 != null) {
            return var4;
        }
        if (arg1 > -10) {
            this.method768(-109, (byte) -57, false);
        }
        class240.field3828.method634(this.field1491, 0);
        class4 var5 = class238.method1670((byte) 93, 0, this.field1491, class240.field3828);
        if (var5 != null) {
            var5.method25(class38.field534, field1482, class270.field4354);
            var5.field1654 = var5.field1656;
            var5.field1659 = var5.field1655;
            if (arg2) {
                var5.method17();
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                var5.method16();
            }
            class150.field2441.method1551(var5, 0, (long) (arg0 << 16 | this.field1491 | (arg2 ? 262144 : 0)));
        }
        return var5;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method769(int arg0) {
        field1476 = null;
        field1484 = null;
        field1488 = null;
        field1494 = null;
        field1489 = null;
        field1477 = null;
        if (arg0 != -32144) {
            method765(15, (String) null, (class86) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;I)V")
    public static final void method770(class128 arg0, int arg1) {
        field1492++;
        if (arg0.field1940 == 0) {
            return;
        }
        class235 var2 = arg0.method917((byte) 121);
        if (arg0.field1894 != -1 && arg0.field1894 < 32768) {
            class18 var3 = class169.field2730[arg0.field1894];
            if (var3 != null) {
                int var4 = arg0.field1979 - var3.field1979;
                int var5 = arg0.field1910 - var3.field1910;
                if (var4 != 0 || var5 != 0) {
                    arg0.field1928 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1894 >= 32768) {
            int var6 = arg0.field1894 - 32768;
            if (class40.field569 == var6) {
                var6 = 2047;
            }
            class29 var7 = class92.field1374[var6];
            if (var7 != null) {
                int var8 = arg0.field1910 - var7.field1910;
                int var9 = arg0.field1979 - var7.field1979;
                if (var9 != 0 || var8 != 0) {
                    arg0.field1928 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1975 != 0 || arg0.field1885 != 0) && (arg0.field1933 == 0 || arg0.field1954 > 0)) {
            int var10 = arg0.field1979 - (arg0.field1975 - class282.field4487 - class282.field4487) * 64;
            int var11 = arg0.field1910 - ((arg0.field1885 - class99.field1465 - class99.field1465) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field1928 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field1975 = 0;
            arg0.field1885 = 0;
        }
        int var12 = arg0.field1928 - arg0.field1893 & 0x7FF;
        if (arg1 == var12) {
            arg0.field1879 = 0;
            arg0.field1943 = 0;
        } else if (var2.field3773 == 0) {
            arg0.field1943++;
            if (var12 <= 1024) {
                arg0.field1893 += arg0.field1940;
                boolean var20 = true;
                if (var12 < arg0.field1940 || var12 > 2048 - arg0.field1940) {
                    var20 = false;
                    arg0.field1893 = arg0.field1928;
                }
                if (arg0.field1943 > 25 || var20) {
                    arg0.field1966 = var2.field3776;
                    if (arg0.field1933 > 0) {
                        if (arg0.field1959[arg0.field1933 - 1] == 2) {
                            if (var2.field3782 != -1) {
                                arg0.field1966 = var2.field3782;
                            } else if (var2.field3783 != -1) {
                                arg0.field1966 = var2.field3783;
                            }
                        } else if (arg0.field1959[arg0.field1933 - 1] == 0) {
                            if (var2.field3765 != -1) {
                                arg0.field1966 = var2.field3765;
                            } else if (var2.field3759 != -1) {
                                arg0.field1966 = var2.field3759;
                            }
                        } else if (var2.field3791 != -1) {
                            arg0.field1966 = var2.field3791;
                        }
                    } else if (var2.field3792 != -1) {
                        arg0.field1966 = var2.field3792;
                    }
                }
            } else {
                arg0.field1893 -= arg0.field1940;
                boolean var21 = true;
                if (arg0.field1940 > var12 || (2048 - arg0.field1940) < var12) {
                    arg0.field1893 = arg0.field1928;
                    var21 = false;
                }
                if (arg0.field1943 > 25 || var21) {
                    arg0.field1966 = var2.field3776;
                    if (arg0.field1933 <= 0) {
                        if (var2.field3788 != -1) {
                            arg0.field1966 = var2.field3788;
                        }
                    } else if (arg0.field1959[arg0.field1933 - 1] == 2) {
                        if (var2.field3784 != -1) {
                            arg0.field1966 = var2.field3784;
                        } else if (var2.field3783 != -1) {
                            arg0.field1966 = var2.field3783;
                        }
                    } else if (arg0.field1959[arg0.field1933 - 1] == 0) {
                        if (var2.field3780 != -1) {
                            arg0.field1966 = var2.field3780;
                        } else if (var2.field3759 != -1) {
                            arg0.field1966 = var2.field3759;
                        }
                    } else if (var2.field3756 != -1) {
                        arg0.field1966 = var2.field3756;
                    }
                }
            }
            arg0.field1893 &= 0x7FF;
        } else {
            arg0.field1966 = -1;
            int var13 = arg0.field1928 << 5;
            if (arg0.field1936 != var13) {
                arg0.field1881 = 0;
                int var14 = var13 - arg0.field1942 & 0xFFFF;
                int var15 = arg0.field1879 * arg0.field1879 / (var2.field3773 * 2);
                if (arg0.field1879 > 0 && var14 >= var15 && var14 - var15 < 32768) {
                    arg0.field1914 = var14 / 2;
                    arg0.field1963 = true;
                    int var16 = var2.field3772 * var2.field3772 / (var2.field3773 * 2);
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (arg0.field1914 > var16) {
                        arg0.field1914 = var14 - var16;
                    }
                } else if (arg0.field1879 < 0 && var15 <= 65536 - var14 && 65536 - var14 - var15 < 32768) {
                    arg0.field1914 = (65536 - var14) / 2;
                    arg0.field1963 = true;
                    int var17 = var2.field3772 * var2.field3772 / (var2.field3773 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg0.field1914 > var17) {
                        arg0.field1914 = 65536 - var14 - var17;
                    }
                } else {
                    arg0.field1963 = false;
                }
                arg0.field1936 = var13;
            }
            if (arg0.field1879 == 0) {
                int var18 = arg0.field1936 - arg0.field1942 & 0xFFFF;
                if (var18 >= var2.field3773) {
                    arg0.field1963 = true;
                    arg0.field1881 = 0;
                    int var19 = var2.field3772 * var2.field3772 / (var2.field3773 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 < 32768) {
                        arg0.field1914 = var18 / 2;
                        if (var19 < arg0.field1914) {
                            arg0.field1914 = var18 - var19;
                        }
                        arg0.field1879 = var2.field3773;
                    } else {
                        arg0.field1879 = -var2.field3773;
                        arg0.field1914 = (65536 - var18) / 2;
                        if (var19 < arg0.field1914) {
                            arg0.field1914 = 65536 - var18 - var19;
                        }
                    }
                } else {
                    arg0.field1942 = arg0.field1936;
                }
            } else if (arg0.field1879 <= 0) {
                if (arg0.field1914 <= arg0.field1881) {
                    arg0.field1963 = false;
                }
                if (!arg0.field1963) {
                    arg0.field1879 += var2.field3773;
                    if (arg0.field1879 > 0) {
                        arg0.field1879 = 0;
                    }
                } else if (arg0.field1879 > -var2.field3772) {
                    arg0.field1879 -= var2.field3773;
                }
            } else {
                if (arg0.field1881 >= arg0.field1914) {
                    arg0.field1963 = false;
                }
                if (!arg0.field1963) {
                    arg0.field1879 -= var2.field3773;
                    if (arg0.field1879 < 0) {
                        arg0.field1879 = 0;
                    }
                } else if (arg0.field1879 < var2.field3772) {
                    arg0.field1879 += var2.field3773;
                }
            }
            arg0.field1942 += arg0.field1879;
            if (arg0.field1879 <= 0) {
                arg0.field1881 -= arg0.field1879;
            } else {
                arg0.field1881 += arg0.field1879;
            }
            arg0.field1942 &= 0xFFFF;
            arg0.field1893 = arg0.field1942 >> 5;
            if (arg0.field1879 >= 0) {
                if (arg0.field1933 > 0) {
                    if (arg0.field1959[arg0.field1933 - 1] == 2) {
                        if (var2.field3782 != -1) {
                            arg0.field1966 = var2.field3782;
                        } else if (var2.field3783 != -1) {
                            arg0.field1966 = var2.field3783;
                        }
                    } else if (arg0.field1959[arg0.field1933 - 1] == 0) {
                        if (var2.field3765 != -1) {
                            arg0.field1966 = var2.field3765;
                        } else if (var2.field3759 != -1) {
                            arg0.field1966 = var2.field3759;
                        }
                    }
                }
                if (arg0.field1966 == -1) {
                    if (var2.field3791 != -1) {
                        arg0.field1966 = var2.field3791;
                    } else if (var2.field3792 != -1) {
                        arg0.field1966 = var2.field3792;
                    }
                }
            } else {
                if (arg0.field1933 > 0) {
                    if (arg0.field1959[arg0.field1933 - 1] == 2) {
                        if (var2.field3784 != -1) {
                            arg0.field1966 = var2.field3784;
                        } else if (var2.field3783 != -1) {
                            arg0.field1966 = var2.field3783;
                        }
                    } else if (arg0.field1959[arg0.field1933 - 1] == 0) {
                        if (var2.field3780 != -1) {
                            arg0.field1966 = var2.field3780;
                        } else if (var2.field3759 != -1) {
                            arg0.field1966 = var2.field3759;
                        }
                    }
                }
                if (arg0.field1966 == -1) {
                    if (var2.field3756 != -1) {
                        arg0.field1966 = var2.field3756;
                    } else if (var2.field3788 != -1) {
                        arg0.field1966 = var2.field3788;
                    }
                }
            }
            if (arg0.field1966 == -1) {
                arg0.field1966 = var2.field3776;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Z")
    public static final boolean method771(int arg0, int arg1) {
        field1495++;
        class223 var2 = class223.method1596(arg0 ^ 0xFFFF3FA6, arg1);
        if (var2 == null) {
            return false;
        } else if (class7.field62 == 1 || class7.field62 == 2 || class27.field313 == 2) {
            class233.field3729 = var2.field3574;
            class155.field2554 = var2.field3569;
            if (class27.field313 != 0) {
                class213.field3412 = class155.field2554 + 50000;
                class152.field2494 = class155.field2554 + 40000;
                class146.field2390 = class152.field2494;
            }
            return true;
        } else {
            String var3 = "";
            if (class27.field313 != 0) {
                var3 = ":" + (var2.field3569 + 7000);
            }
            if (arg0 != 40000) {
                method770((class128) null, 17);
            }
            String var4 = "";
            if (class154.field2539 != null) {
                var4 = "/p=" + class154.field2539;
            }
            String var5 = "http://" + var2.field3574 + var3 + "/l=" + class48.field701 + "/a=" + class57.field821 + var4 + "/j" + (class8.field81 ? "1" : "0") + ",o" + (class210.field3369 ? "1" : "0") + ",a2,m" + (class18.field196 ? "1" : "0");
            try {
                class18.field202.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLv;I)V")
    public final void method772(byte arg0, class152 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1111(255);
            if (var4 == 0) {
                field1483++;
                if (arg0 > -83) {
                    field1489 = null;
                    return;
                }
                return;
            }
            this.method767(var4, -3, arg2, arg1);
        }
    }
}
