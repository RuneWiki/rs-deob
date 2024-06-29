import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field1098 = 0;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public int field1115 = 0;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
    public static int[] field1104 = new int[99];

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
    public static int[] field1099 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lec;")
    public static class28 field1116 = class28.method210(-46, " is already on your ignore list");

    @OriginalMember(owner = "client!i", name = "x", descriptor = "Lec;")
    public static class28 field1121;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Loc;")
    public class87 field1102;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Loc;")
    public class87 field1113;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static final void method384(boolean arg0) {
        if (arg0) {
            class93.field2058.method659(1000);
            field1101++;
            class8.field136.method659(1000);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)I")
    public static final int method385(int arg0, byte arg1, int arg2) {
        field1119++;
        int var3 = -2 / ((-arg1 - 25) / 48);
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 << 13 ^ var4;
        int var6 = (var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method386(byte arg0) {
        int var1 = -52 % ((arg0 + 66) / 41);
        field1112++;
        for (class47 var2 = (class47) class93.field2044.method326(0); var2 != null; var2 = (class47) class93.field2044.method325((byte) 125)) {
            if (class122.field2657 != var2.field1070 || class83.field1888 > var2.field1095) {
                var2.method319((byte) 5);
            } else if (class83.field1888 >= var2.field1072) {
                if (var2.field1065 > 0) {
                    class90 var3 = class88.field1956[var2.field1065 - 1];
                    if (var3 != null && var3.field1446 >= 0 && var3.field1446 < 13312 && var3.field1501 >= 0 && var3.field1501 < 13312) {
                        var2.method382((byte) -4, var3.field1501, class18.method107(var3.field1501, var3.field1446, -2049, var2.field1070) - var2.field1096, class83.field1888, var3.field1446);
                    }
                }
                if (var2.field1065 < 0) {
                    int var4 = -var2.field1065 - 1;
                    class43 var5;
                    if (class32.field674 == var4) {
                        var5 = class37.field848;
                    } else {
                        var5 = class129.field2779[var4];
                    }
                    if (var5 != null && var5.field1446 >= 0 && var5.field1446 < 13312 && var5.field1501 >= 0 && var5.field1501 < 13312) {
                        var2.method382((byte) -4, var5.field1501, class18.method107(var5.field1501, var5.field1446, -2049, var2.field1070) - var2.field1096, class83.field1888, var5.field1446);
                    }
                }
                var2.method379(class12.field197, 12800);
                class11.field179.method760(class122.field2657, (int) var2.field1091, (int) var2.field1059, (int) var2.field1088, 60, var2, var2.field1066, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method387(int arg0) {
        if (arg0 != -3) {
            field1121 = null;
        }
        class110 var1 = class49.field1133;
        synchronized (class49.field1133) {
            class94.field2078 = class74.field1644;
            if (class118.field2504 >= 0) {
                while (class118.field2504 != class106.field2253) {
                    int var2 = class76.field1690[class106.field2253];
                    class106.field2253 = class106.field2253 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class74.field1634[var2] = true;
                    } else {
                        class74.field1634[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class74.field1634[var3] = false;
                }
                class118.field2504 = class106.field2253;
            }
            class74.field1644 = class43.field914;
        }
        field1107++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ln;B)V")
    public static final void method388(class78 arg0, byte arg1) {
        field1109++;
        if (arg1 >= -49) {
            method384(false);
        }
        int var2 = arg0.field1796;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class25.field560 == 0) {
                arg0.field1803 = class119.field2573;
                arg0.field1806 = 0;
            } else if (var2 == 1 && class25.field560 == 1) {
                arg0.field1803 = class32.field685;
                arg0.field1806 = 0;
            } else if (var2 == 2 && class25.field560 != 2) {
                arg0.field1803 = class2.field20;
                arg0.field1806 = 0;
            } else {
                if (var2 > 700) {
                    var2 -= 601;
                } else {
                    var2--;
                }
                int var3 = class36.field829;
                if (class25.field560 != 2) {
                    var3 = 0;
                }
                if (var2 >= var3) {
                    arg0.field1803 = class125.field2721;
                    arg0.field1806 = 0;
                } else {
                    arg0.field1803 = class93.field2048[var2];
                    arg0.field1806 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || !(var2 < 801 || var2 > 900)) {
            if (var2 <= 800) {
                var2 -= 101;
            } else {
                var2 -= 701;
            }
            int var4 = class36.field829;
            if (class25.field560 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field1806 = 0;
                arg0.field1803 = class125.field2721;
            } else {
                if (class61.field1348[var2] == 0) {
                    arg0.field1803 = class93.field2050;
                } else if (class61.field1348[var2] < 5000) {
                    if (class61.field1348[var2] == class129.field2790) {
                        arg0.field1803 = class68.method537(1, new class28[] { class31.field670, class5.method25(6366, class61.field1348[var2]) });
                    } else {
                        arg0.field1803 = class68.method537(1, new class28[] { class45.field981, class5.method25(6366, class61.field1348[var2]) });
                    }
                } else if (class61.field1348[var2] == class129.field2790) {
                    arg0.field1803 = class68.method537(1, new class28[] { class49.field1130, class5.method25(6366, class61.field1348[var2] - 5000) });
                } else {
                    arg0.field1803 = class68.method537(1, new class28[] { class27.field579, class5.method25(6366, class61.field1348[var2] - 5000) });
                }
                arg0.field1806 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class36.field829;
            if (class25.field560 != 2) {
                var5 = 0;
            }
            arg0.field1756 = var5 * 15 + 20;
            if (arg0.field1756 <= arg0.field1765) {
                arg0.field1756 = arg0.field1765 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class25.field560 == 0) {
                arg0.field1806 = 0;
                arg0.field1803 = class61.field1355;
            } else if (var2 == 1 && class25.field560 == 0) {
                arg0.field1803 = class2.field20;
                arg0.field1806 = 0;
            } else {
                int var6 = class69.field1546;
                if (class25.field560 == 0) {
                    var6 = 0;
                }
                if (var2 >= var6) {
                    arg0.field1803 = class125.field2721;
                    arg0.field1806 = 0;
                } else {
                    arg0.field1803 = class46.method365(-64, class5.field92[var2]).method212((byte) 124);
                    arg0.field1806 = 1;
                }
            }
        } else if (var2 == 503) {
            arg0.field1756 = class69.field1546 * 15 + 20;
            if (arg0.field1765 >= arg0.field1756) {
                arg0.field1756 = arg0.field1765 + 1;
            }
        } else if (var2 == 327) {
            arg0.field1771 = 150;
            arg0.field1773 = (int) (Math.sin((double) class83.field1888 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1774 = 0;
            arg0.field1746 = 5;
        } else if (var2 == 324) {
            if (class49.field1154 == -1) {
                class49.field1154 = arg0.field1793;
                class34.field765 = arg0.field1741;
            }
            if (class49.field1144.field2413) {
                arg0.field1793 = class49.field1154;
            } else {
                arg0.field1793 = class34.field765;
            }
        } else if (var2 == 325) {
            if (class49.field1154 == -1) {
                class34.field765 = arg0.field1741;
                class49.field1154 = arg0.field1793;
            }
            if (class49.field1144.field2413) {
                arg0.field1793 = class34.field765;
            } else {
                arg0.field1793 = class49.field1154;
            }
        } else if (var2 == 600) {
            arg0.field1803 = class125.field2719;
            if (class83.field1888 % 20 < 10) {
                arg0.field1803 = arg0.field1803.method236(124, 41);
            } else {
                arg0.field1803 = arg0.field1803.method236(32, 78);
            }
        } else {
            if (var2 == 620) {
                if (class32.field691 < 1) {
                    arg0.field1803 = class125.field2721;
                } else if (class88.field1957) {
                    arg0.field1761 = 16711680;
                    arg0.field1803 = class22.field497;
                } else {
                    arg0.field1761 = 16777215;
                    arg0.field1803 = class86.field1917;
                }
            }
            if (var2 == 660) {
                int var7 = class18.field371 - class125.field2709;
                class28 var8;
                if (var7 <= 0) {
                    var8 = class80.field1844;
                } else if (var7 == 1) {
                    var8 = class64.field1415;
                } else {
                    var8 = class68.method537(1, new class28[] { class5.method25(6366, var7), class75.field1664 });
                }
                class28 var9 = class125.field2721;
                if (class68.field1539 != null) {
                    var9 = class16.method93((byte) -108, class68.field1539.field2155);
                    try {
                        if (class68.field1539.field2154 != null) {
                            byte[] var10 = ((String) class68.field1539.field2154).getBytes("ISO-8859-1");
                            var9 = class36.method297(var10.length, 0, var10, false);
                        }
                    } catch (UnsupportedEncodingException var14) {
                    }
                }
                arg0.field1803 = class68.method537(1, new class28[] { class43.field946, var8, class92.field2019, var9 });
            }
            if (var2 == 661) {
                if (class88.field1959 == 0) {
                    arg0.field1803 = class27.field575;
                } else if (class88.field1959 <= class18.field371) {
                    arg0.field1803 = class68.method537(1, new class28[] { class57.field1309, class127.method971(10, class88.field1959) });
                } else {
                    int var11 = class18.field371 + 14 - class88.field1959;
                    class28 var12;
                    if (var11 <= 0) {
                        var12 = class13.field214;
                    } else if (var11 == 1) {
                        var12 = class114.field2428;
                    } else {
                        var12 = class68.method537(1, new class28[] { class5.method25(6366, var11), class75.field1664 });
                    }
                    arg0.field1803 = class68.method537(1, new class28[] { var12, class5.field96, class127.method971(10, class88.field1959), class86.field1914 });
                }
            }
            if (var2 == 662) {
                class28 var13;
                if (class79.field1837 == 0) {
                    var13 = class88.field1952;
                } else if (class79.field1837 == 1) {
                    var13 = class92.field2038;
                } else {
                    var13 = class68.method537(1, new class28[] { class112.field2421, class5.method25(6366, class79.field1837), class15.field284 });
                }
                arg0.field1803 = class68.method537(1, new class28[] { class68.field1526, var13, class125.field2710 });
            }
            if (var2 == 663) {
                if (class118.field2520 > 0 && class18.field371 + 10 >= class118.field2520) {
                    arg0.field1803 = class68.method537(1, new class28[] { class119.field2587, class127.method971(10, class118.field2520) });
                } else {
                    arg0.field1803 = class23.field517;
                }
            }
            if (var2 == 664) {
                if (class61.field1343 == 0) {
                    arg0.field1803 = class55.field1276;
                }
                if (class61.field1343 == 1) {
                    arg0.field1803 = class68.method537(1, new class28[] { client.field397, class127.method971(10, class68.field1540) });
                }
                if (class61.field1343 == 2) {
                    arg0.field1803 = class30.field651;
                }
            }
            if (var2 == 665) {
                if (class16.field316 > 2 && !class74.field1640) {
                    arg0.field1803 = class94.field2080;
                } else if (class16.field316 > 2) {
                    arg0.field1803 = class68.method537(1, new class28[] { client.field403, class5.method25(6366, class16.field316), class50.field1175 });
                } else if (class16.field316 > 0) {
                    arg0.field1803 = class68.method537(1, new class28[] { class103.field2206, class5.method25(6366, class16.field316), class83.field1897 });
                } else {
                    arg0.field1803 = class15.field280;
                }
            }
            if (var2 == 667) {
                if (class16.field316 > 2 && !class74.field1640) {
                    arg0.field1803 = class20.field445;
                } else if (class16.field316 > 0) {
                    arg0.field1803 = class20.field435;
                } else {
                    arg0.field1803 = class87.field1944;
                }
            }
            if (var2 == 668) {
                if (class88.field1959 <= class18.field371) {
                    arg0.field1803 = class3.field49;
                } else {
                    arg0.field1803 = class66.field1512;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
    public static void method389(byte arg0) {
        field1104 = null;
        field1116 = null;
        field1099 = null;
        field1121 = null;
        if (arg0 >= -16) {
            field1105 = -81;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lud;Z)Lec;")
    public static final class28 method390(class119 arg0, boolean arg1) {
        if (arg1) {
            field1118 = 57;
        }
        field1111++;
        return class17.method96(32767, false, arg0);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1104[var1] = var0 / 4;
        }
        field1121 = class28.method210(-46, "RuneScape has been updated(Q");
    }
}
