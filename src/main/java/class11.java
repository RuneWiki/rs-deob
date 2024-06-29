import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 {

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lo;")
    public static class84 field211 = class15.method124("::errortest", 255);

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lo;")
    public static class84 field212 = class15.method124("(X", 255);

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field209 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[[I")
    public static int[][] field218 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field219 = 0;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field224 = 0;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lo;")
    private static class84 field223 = class15.method124("Members object", 255);

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lo;")
    public static class84 field222 = field223;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lo;")
    public static class84 field225 = class15.method124("wave2:", 255);

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lo;")
    public static class84 field221 = class15.method124("backbase2", 255);

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field226 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Ld;")
    public static class19 field220;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[[I")
    public static int[][] field217;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLmc;)V", line = 3)
    public static final void method103(boolean arg0, class75 arg1) {
        field205++;
        int var2 = arg1.field1624;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class49.field1033 == 0) {
                arg1.field1585 = class112.field2439;
                arg1.field1569 = 0;
            } else if (var2 == 1 && class49.field1033 == 1) {
                arg1.field1569 = 0;
                arg1.field1585 = class122.field2721;
            } else if (var2 == 2 && class49.field1033 != 2) {
                arg1.field1569 = 0;
                arg1.field1585 = class61.field1277;
            } else {
                int var3 = class27.field537;
                if (var2 <= 700) {
                    var2--;
                } else {
                    var2 -= 601;
                }
                if (class49.field1033 != 2) {
                    var3 = 0;
                }
                if (var2 >= var3) {
                    arg1.field1585 = class73.field1524;
                    arg1.field1569 = 0;
                } else {
                    arg1.field1585 = class60.field1256[var2];
                    arg1.field1569 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || !(var2 < 801 || var2 > 900)) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class27.field537;
            if (class49.field1033 != 2) {
                var4 = 0;
            }
            if (var4 <= var2) {
                arg1.field1569 = 0;
                arg1.field1585 = class73.field1524;
            } else {
                if (class74.field1547[var2] == 0) {
                    arg1.field1585 = class6.field104;
                } else if (class74.field1547[var2] >= 5000) {
                    if (class74.field1547[var2] == class5.field90) {
                        arg1.field1585 = class97.method746(0, new class84[] { class16.field293, class62.method489(class74.field1547[var2] - 5000, (byte) -126) });
                    } else {
                        arg1.field1585 = class97.method746(0, new class84[] { class85.field1930, class62.method489(class74.field1547[var2] - 5000, (byte) -127) });
                    }
                } else if (class74.field1547[var2] == class5.field90) {
                    arg1.field1585 = class97.method746(0, new class84[] { class51.field1089, class62.method489(class74.field1547[var2], (byte) -128) });
                } else {
                    arg1.field1585 = class97.method746(0, new class84[] { class93.field2046, class62.method489(class74.field1547[var2], (byte) -125) });
                }
                arg1.field1569 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class27.field537;
            if (class49.field1033 != 2) {
                var5 = 0;
            }
            arg1.field1609 = var5 * 15 + 20;
            if (arg1.field1623 >= arg1.field1609) {
                arg1.field1609 = arg1.field1623 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class49.field1033 == 0) {
                arg1.field1585 = class44.field894;
                arg1.field1569 = 0;
            } else if (var2 == 1 && class49.field1033 == 0) {
                arg1.field1569 = 0;
                arg1.field1585 = class61.field1277;
            } else {
                int var6 = class118.field2629;
                if (class49.field1033 == 0) {
                    var6 = 0;
                }
                if (var6 <= var2) {
                    arg1.field1569 = 0;
                    arg1.field1585 = class73.field1524;
                } else {
                    arg1.field1585 = class57.method463(class103.field2166[var2], (byte) -99).method637(true);
                    arg1.field1569 = 1;
                }
            }
        } else if (var2 == 503) {
            arg1.field1609 = class118.field2629 * 15 + 20;
            if (arg1.field1623 >= arg1.field1609) {
                arg1.field1609 = arg1.field1623 + 1;
            }
        } else if (var2 == 327) {
            arg1.field1573 = 150;
            arg1.field1628 = (int) (Math.sin((double) class128.field2837 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1617 = 5;
            arg1.field1610 = 0;
        } else if (var2 == 324) {
            if (class116.field2525 == -1) {
                class5.field89 = arg1.field1604;
                class116.field2525 = arg1.field1586;
            }
            if (class45.field947.field1511) {
                arg1.field1586 = class116.field2525;
            } else {
                arg1.field1586 = class5.field89;
            }
        } else if (var2 == 325) {
            if (class116.field2525 == -1) {
                class116.field2525 = arg1.field1586;
                class5.field89 = arg1.field1604;
            }
            if (class45.field947.field1511) {
                arg1.field1586 = class5.field89;
            } else {
                arg1.field1586 = class116.field2525;
            }
        } else if (!arg0) {
            if (var2 == 600) {
                arg1.field1585 = class73.field1528;
                if (class128.field2837 % 20 < 10) {
                    arg1.field1585 = arg1.field1585.method662((byte) -101, 124);
                } else {
                    arg1.field1585 = arg1.field1585.method662((byte) -37, 32);
                }
            } else {
                if (var2 == 620) {
                    if (class73.field1542 < 1) {
                        arg1.field1585 = class73.field1524;
                    } else if (class63.field1321) {
                        arg1.field1583 = 16711680;
                        arg1.field1585 = class17.field316;
                    } else {
                        arg1.field1585 = class114.field2486;
                        arg1.field1583 = 16777215;
                    }
                }
                if (var2 == 660) {
                    int var7 = class105.field2232 - class60.field1248;
                    class84 var8;
                    if (var7 <= 0) {
                        var8 = class85.field1934;
                    } else if (var7 == 1) {
                        var8 = class49.field1050;
                    } else {
                        var8 = class97.method746(0, new class84[] { class62.method489(var7, (byte) -128), class80.field1728 });
                    }
                    class84 var9 = class73.field1524;
                    if (class73.field1534 != null) {
                        var9 = class3.method11(class73.field1534.field2089, (byte) -104);
                        try {
                            if (class73.field1534.field2093 != null) {
                                byte[] var10 = ((String) class73.field1534.field2093).getBytes("ISO-8859-1");
                                var9 = class82.method601(var10.length, var10, 0, 0);
                            }
                        } catch (UnsupportedEncodingException var14) {
                        }
                    }
                    arg1.field1585 = class97.method746(0, new class84[] { class41.field846, var8, class71.field1493, var9 });
                }
                if (var2 == 661) {
                    if (class78.field1670 == 0) {
                        arg1.field1585 = class86.field1966;
                    } else if (class78.field1670 <= class105.field2232) {
                        arg1.field1585 = class97.method746(0, new class84[] { class30.field577, class1.method1((byte) -56, class78.field1670) });
                    } else {
                        int var11 = class105.field2232 + 14 - class78.field1670;
                        class84 var12;
                        if (var11 <= 0) {
                            var12 = class85.field1924;
                        } else if (var11 == 1) {
                            var12 = class39.field800;
                        } else {
                            var12 = class97.method746(0, new class84[] { class62.method489(var11, (byte) -127), class80.field1728 });
                        }
                        arg1.field1585 = class97.method746(0, new class84[] { var12, class112.field2433, class1.method1((byte) -128, class78.field1670), class120.field2689 });
                    }
                }
                if (var2 == 662) {
                    class84 var13;
                    if (class60.field1260 == 0) {
                        var13 = class4.field63;
                    } else if (class60.field1260 == 1) {
                        var13 = class128.field2822;
                    } else {
                        var13 = class97.method746(0, new class84[] { class119.field2638, class62.method489(class60.field1260, (byte) -124), class49.field1037 });
                    }
                    arg1.field1585 = class97.method746(0, new class84[] { class62.field1281, var13, class85.field1923 });
                }
                if (var2 == 663) {
                    if (class67.field1467 > 0 && class105.field2232 + 10 >= class67.field1467) {
                        arg1.field1585 = class97.method746(0, new class84[] { class54.field1121, class1.method1((byte) -65, class67.field1467) });
                    } else {
                        arg1.field1585 = class106.field2251;
                    }
                }
                if (var2 == 664) {
                    if (class44.field907 == 0) {
                        arg1.field1585 = class79.field1677;
                    }
                    if (class44.field907 == 1) {
                        arg1.field1585 = class97.method746(0, new class84[] { class37.field729, class1.method1((byte) -88, class101.field2148) });
                    }
                    if (class44.field907 == 2) {
                        arg1.field1585 = class127.field2812;
                    }
                }
                if (var2 == 665) {
                    if (class65.field1377 > 2 && !class21.field390) {
                        arg1.field1585 = class100.field2111;
                    } else if (class65.field1377 > 2) {
                        arg1.field1585 = class97.method746(0, new class84[] { class120.field2701, class62.method489(class65.field1377, (byte) -125), class19.field363 });
                    } else if (class65.field1377 > 0) {
                        arg1.field1585 = class97.method746(0, new class84[] { class30.field598, class62.method489(class65.field1377, (byte) -128), class67.field1464 });
                    } else {
                        arg1.field1585 = class89.field2016;
                    }
                }
                if (var2 == 667) {
                    if (class65.field1377 > 2 && !class21.field390) {
                        arg1.field1585 = class111.field2410;
                    } else if (class65.field1377 > 0) {
                        arg1.field1585 = class79.field1681;
                    } else {
                        arg1.field1585 = class64.field1356;
                    }
                }
                if (var2 == 668) {
                    if (class105.field2232 < class78.field1670) {
                        arg1.field1585 = class21.field383;
                    } else {
                        arg1.field1585 = class38.field741;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I", line = 411)
    public static final int method104(byte arg0) {
        field207++;
        if (arg0 != -61) {
            field225 = null;
        }
        return 19;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V", line = 423)
    public static void method105(byte arg0) {
        field217 = null;
        if (arg0 >= -32) {
            field216 = 41;
        }
        field218 = null;
        field221 = null;
        field223 = null;
        field211 = null;
        field212 = null;
        field220 = null;
        field209 = null;
        field222 = null;
        field225 = null;
    }
}
