import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class209 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3131 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3130 = new String[200];

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lrg;")
    public static class222 field3129;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Led;")
    public static class228 field3126;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lbf;")
    public static class281 field3128;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[[B")
    public static byte[][] field3125;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IC)C")
    public static final char method1376(int arg0, char arg1) {
        field3132++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else {
            if (arg0 > -39) {
                field3127 = -125;
            }
            if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lkc;I)V")
    public static final void method1377(class25 arg0, int arg1) {
        field3133++;
        if (arg0.field432 == 0) {
            return;
        }
        if (arg1 > -120) {
            method1377((class25) null, -51);
        }
        class110 var2 = arg0.method165((byte) -83);
        if (arg0.field430 != -1 && arg0.field430 < 32768) {
            class87 var3 = class243.field3762[arg0.field430];
            if (var3 != null) {
                int var4 = arg0.field455 - var3.field455;
                int var5 = arg0.field425 - var3.field425;
                if (var5 != 0 || var4 != 0) {
                    arg0.field484 = (int) (Math.atan2((double) var5, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field430 >= 32768) {
            int var6 = arg0.field430 - 32768;
            if (class138.field1996 == var6) {
                var6 = 2047;
            }
            class224 var7 = class166.field2438[var6];
            if (var7 != null) {
                int var8 = arg0.field425 - var7.field425;
                int var9 = arg0.field455 - var7.field455;
                if (var8 != 0 || var9 != 0) {
                    arg0.field484 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field417 != 0 || arg0.field474 != 0) && (arg0.field441 == 0 || arg0.field478 > 0)) {
            int var10 = arg0.field425 - ((arg0.field417 - class90.field1367 - class90.field1367) * 64);
            int var11 = arg0.field455 - ((arg0.field474 - class188.field2774 - class188.field2774) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field484 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field474 = 0;
            arg0.field417 = 0;
        }
        int var12 = arg0.field484 - arg0.field471 & 0x7FF;
        if (var12 == 0) {
            arg0.field447 = 0;
            arg0.field435 = 0;
        } else if (var2.field1657 == 0) {
            arg0.field447++;
            if (var12 > 1024) {
                arg0.field471 -= arg0.field432;
                boolean var13 = true;
                if (var12 < arg0.field432 || 2048 - arg0.field432 < var12) {
                    arg0.field471 = arg0.field484;
                    var13 = false;
                }
                if (arg0.field447 > 25 || var13) {
                    arg0.field399 = var2.field1631;
                    if (arg0.field441 <= 0) {
                        if (var2.field1640 != -1) {
                            arg0.field399 = var2.field1640;
                        }
                    } else if (arg0.field400[arg0.field441 - 1] == 2) {
                        if (var2.field1655 != -1) {
                            arg0.field399 = var2.field1655;
                        } else if (var2.field1636 != -1) {
                            arg0.field399 = var2.field1636;
                        }
                    } else if (arg0.field400[arg0.field441 - 1] == 0) {
                        if (var2.field1647 != -1) {
                            arg0.field399 = var2.field1647;
                        } else if (var2.field1650 != -1) {
                            arg0.field399 = var2.field1650;
                        }
                    } else if (var2.field1648 != -1) {
                        arg0.field399 = var2.field1648;
                    }
                }
            } else {
                boolean var14 = true;
                arg0.field471 += arg0.field432;
                if (var12 < arg0.field432 || var12 > (2048 - arg0.field432)) {
                    var14 = false;
                    arg0.field471 = arg0.field484;
                }
                if (arg0.field447 > 25 || var14) {
                    arg0.field399 = var2.field1631;
                    if (arg0.field441 <= 0) {
                        if (var2.field1643 != -1) {
                            arg0.field399 = var2.field1643;
                        }
                    } else if (arg0.field400[arg0.field441 - 1] == 2) {
                        if (var2.field1661 != -1) {
                            arg0.field399 = var2.field1661;
                        } else if (var2.field1636 != -1) {
                            arg0.field399 = var2.field1636;
                        }
                    } else if (arg0.field400[arg0.field441 - 1] == 0) {
                        if (var2.field1669 != -1) {
                            arg0.field399 = var2.field1669;
                        } else if (var2.field1650 != -1) {
                            arg0.field399 = var2.field1650;
                        }
                    } else if (var2.field1668 != -1) {
                        arg0.field399 = var2.field1668;
                    }
                }
            }
            arg0.field471 &= 0x7FF;
        } else {
            int var15 = arg0.field484 << 5;
            if (arg0.field409 != var15) {
                arg0.field445 = 0;
                int var16 = var15 - arg0.field490 & 0xFFFF;
                int var17 = arg0.field435 * arg0.field435 / (var2.field1657 * 2);
                if (arg0.field435 > 0 && var16 >= var17 && (var16 - var17) < 32768) {
                    arg0.field457 = true;
                    arg0.field448 = var16 / 2;
                    int var18 = var2.field1663 * var2.field1663 / (var2.field1657 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg0.field448) {
                        arg0.field448 = var16 - var18;
                    }
                } else if (arg0.field435 < 0 && (65536 - var16) >= var17 && (65536 - var17 - var16) < 32768) {
                    arg0.field457 = true;
                    int var19 = var2.field1663 * var2.field1663 / (var2.field1657 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    arg0.field448 = (65536 - var16) / 2;
                    if (arg0.field448 > var19) {
                        arg0.field448 = 65536 - var16 - var19;
                    }
                } else {
                    arg0.field457 = false;
                }
                arg0.field409 = var15;
            }
            arg0.field399 = -1;
            if (arg0.field435 == 0) {
                int var20 = arg0.field409 - arg0.field490 & 0xFFFF;
                if (var20 < var2.field1657) {
                    arg0.field490 = arg0.field409;
                } else {
                    arg0.field457 = true;
                    arg0.field445 = 0;
                    int var21 = var2.field1663 * var2.field1663 / (var2.field1657 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 < 32768) {
                        arg0.field448 = var20 / 2;
                        arg0.field435 = var2.field1657;
                        if (arg0.field448 > var21) {
                            arg0.field448 = var20 - var21;
                        }
                    } else {
                        arg0.field448 = (65536 - var20) / 2;
                        arg0.field435 = -var2.field1657;
                        if (var21 < arg0.field448) {
                            arg0.field448 = 65536 - var20 - var21;
                        }
                    }
                }
            } else if (arg0.field435 > 0) {
                if (arg0.field445 >= arg0.field448) {
                    arg0.field457 = false;
                }
                if (!arg0.field457) {
                    arg0.field435 -= var2.field1657;
                    if (arg0.field435 < 0) {
                        arg0.field435 = 0;
                    }
                } else if (arg0.field435 < var2.field1663) {
                    arg0.field435 += var2.field1657;
                }
            } else {
                if (arg0.field445 >= arg0.field448) {
                    arg0.field457 = false;
                }
                if (!arg0.field457) {
                    arg0.field435 += var2.field1657;
                    if (arg0.field435 > 0) {
                        arg0.field435 = 0;
                    }
                } else if (-var2.field1663 < arg0.field435) {
                    arg0.field435 -= var2.field1657;
                }
            }
            if (arg0.field435 > 0) {
                arg0.field445 += arg0.field435;
            } else {
                arg0.field445 -= arg0.field435;
            }
            arg0.field490 += arg0.field435;
            arg0.field490 &= 0xFFFF;
            arg0.field471 = arg0.field490 >> 5;
            if (arg0.field435 < 0) {
                if (arg0.field441 > 0) {
                    if (arg0.field400[arg0.field441 - 1] == 2) {
                        if (var2.field1655 != -1) {
                            arg0.field399 = var2.field1655;
                        } else if (var2.field1636 != -1) {
                            arg0.field399 = var2.field1636;
                        }
                    } else if (arg0.field400[arg0.field441 - 1] == 0) {
                        if (var2.field1647 != -1) {
                            arg0.field399 = var2.field1647;
                        } else if (var2.field1650 != -1) {
                            arg0.field399 = var2.field1650;
                        }
                    }
                }
                if (arg0.field399 == -1) {
                    if (var2.field1648 != -1) {
                        arg0.field399 = var2.field1648;
                    } else if (var2.field1640 != -1) {
                        arg0.field399 = var2.field1640;
                    }
                }
            } else {
                if (arg0.field441 > 0) {
                    if (arg0.field400[arg0.field441 - 1] == 2) {
                        if (var2.field1661 != -1) {
                            arg0.field399 = var2.field1661;
                        } else if (var2.field1636 != -1) {
                            arg0.field399 = var2.field1636;
                        }
                    } else if (arg0.field400[arg0.field441 - 1] == 0) {
                        if (var2.field1669 != -1) {
                            arg0.field399 = var2.field1669;
                        } else if (var2.field1650 != -1) {
                            arg0.field399 = var2.field1650;
                        }
                    }
                }
                if (arg0.field399 == -1) {
                    if (var2.field1668 != -1) {
                        arg0.field399 = var2.field1668;
                    } else if (var2.field1643 != -1) {
                        arg0.field399 = var2.field1643;
                    }
                }
            }
            if (arg0.field399 == -1) {
                arg0.field399 = var2.field1631;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method1378(byte arg0) {
        if (arg0 != 90) {
            method1376(61, (char) 65514);
        }
        field3125 = null;
        field3126 = null;
        field3128 = null;
        field3130 = null;
        field3131 = null;
        field3129 = null;
    }
}
