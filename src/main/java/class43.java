import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field988 = 0;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lva;")
    private static class121 field995 = class107.method797("Members object", -10983);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lva;")
    public static class121 field1000 = field995;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lva;")
    public static class121 field997 = class107.method797("@cya@", -10983);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lva;")
    private static class121 field1001 = class107.method797("Select", -10983);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lva;")
    public static class121 field998 = field1001;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Lbe;")
    public static class12 field990;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lec;")
    public static class28 field999;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[Lbc;")
    public static class10[] field987;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[IIZ)V", line = 31)
    public static final void method286(int arg0, int arg1, int[] arg2, int arg3, boolean arg4) {
        field992++;
        class63.field1530.method984(arg1 ^ 0x3942);
        class75.field1736.method502(0, 0);
        if (arg4) {
            if (arg2[arg3] != -1) {
                if (arg3 == 0) {
                    class86.field1987.method502(22, 10);
                }
                if (arg3 == 1) {
                    class59.field1414.method502(54, 8);
                }
                if (arg3 == 2) {
                    class59.field1414.method502(82, 8);
                }
                if (arg3 == 3) {
                    class1.field11.method502(110, 8);
                }
                if (arg3 == 4) {
                    class40.field897.method502(153, 8);
                }
                if (arg3 == 5) {
                    class40.field897.method502(181, 8);
                }
                if (arg3 == 6) {
                    class41.field940.method502(209, 9);
                }
            }
            if (arg2[0] != -1 && arg0 != 0) {
                class126.field2869[0].method502(29, 13);
            }
            if (arg2[1] != -1 && arg0 != 1) {
                class126.field2869[1].method502(53, 11);
            }
            if (arg2[2] != -1 && arg0 != 2) {
                class126.field2869[2].method502(82, 11);
            }
            if (arg2[3] != -1 && arg0 != 3) {
                class126.field2869[3].method502(115, 12);
            }
            if (arg2[4] != -1 && arg0 != 4) {
                class126.field2869[4].method502(153, 13);
            }
            if (arg2[5] != -1 && arg0 != 5) {
                class126.field2869[5].method502(180, 11);
            }
            if (arg2[6] != -1 && arg0 != 6) {
                class126.field2869[6].method502(208, 13);
            }
        }
        class27.field681.method984(-1);
        class66.field1589.method502(0, 0);
        if (arg1 != -14659) {
            field998 = null;
        }
        if (arg4) {
            if (arg2[arg3] != -1) {
                if (arg3 == 7) {
                    class116.field2636.method502(42, 0);
                }
                if (arg3 == 8) {
                    class124.field2832.method502(74, 0);
                }
                if (arg3 == 9) {
                    class124.field2832.method502(102, 0);
                }
                if (arg3 == 10) {
                    class56.field1309.method502(130, 1);
                }
                if (arg3 == 11) {
                    class14.field255.method502(173, 0);
                }
                if (arg3 == 12) {
                    class14.field255.method502(201, 0);
                }
                if (arg3 == 13) {
                    class4.field55.method502(229, 0);
                }
            }
            if (arg2[8] != -1 && arg0 != 8) {
                class126.field2869[7].method502(74, 2);
            }
            if (arg2[9] != -1 && arg0 != 9) {
                class126.field2869[8].method502(102, 3);
            }
            if (arg2[10] != -1 && arg0 != 10) {
                class126.field2869[9].method502(137, 4);
            }
            if (arg2[11] != -1 && arg0 != 11) {
                class126.field2869[10].method502(174, 2);
            }
            if (arg2[12] != -1 && arg0 != 12) {
                class126.field2869[11].method502(201, 2);
            }
            if (arg2[13] != -1 && arg0 != 13) {
                class126.field2869[12].method502(226, 2);
            }
        }
        try {
            Graphics var5 = class46.field1079.getGraphics();
            class63.field1530.method196(-5917, 160, 516, var5);
            class27.field681.method196(arg1 + 8742, 466, 496, var5);
        } catch (Exception var6) {
            class46.field1079.repaint();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V", line = 174)
    public static void method287(boolean arg0) {
        field995 = null;
        field999 = null;
        field997 = null;
        field1001 = null;
        field1000 = null;
        field987 = null;
        field998 = null;
        if (!arg0) {
            field999 = null;
        }
        field990 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILme;)V", line = 191)
    public static final void method288(int arg0, int arg1, int arg2, class77 arg3) {
        if ((arg1 & 0x80) != 0) {
            arg3.field749 = class66.field1578.method842((byte) 110);
            arg3.field731 = class66.field1578.method829(512);
        }
        field993++;
        if ((arg1 & 0x20) != 0) {
            arg3.field753 = class66.field1578.method851(-12543);
            if (arg3.field753 == 65535) {
                arg3.field753 = -1;
            }
        }
        if ((arg1 & 0x400) != 0) {
            int var4 = class66.field1578.method821(true);
            int var5 = class66.field1578.method853(true);
            arg3.method228(class115.field2614, arg2 ^ 0xFF, var4, var5);
            arg3.field735 = class115.field2614 + 300;
            arg3.field770 = class66.field1578.method853(true);
            arg3.field757 = class66.field1578.method819(-762);
        }
        if ((arg1 & 0x100) != 0) {
            arg3.field751 = class66.field1578.method842((byte) 123);
            int var6 = class66.field1578.method830((byte) 94);
            if (arg3.field751 == 65535) {
                arg3.field751 = -1;
            }
            arg3.field783 = 0;
            arg3.field727 = (var6 & 0xFFFF) + class115.field2614;
            arg3.field732 = 0;
            if (class115.field2614 < arg3.field727) {
                arg3.field732 = -1;
            }
            arg3.field772 = var6 >> 16;
        }
        if (arg2 != 255) {
            field995 = null;
        }
        if ((arg1 & 0x2) != 0) {
            int var7 = class66.field1578.method829(512);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class66.field1578.method819(arg2 ^ 0xFFFFFDF9);
            if (arg3.field793 == var7 && var7 != -1) {
                int var9 = class5.method33(9, var7).field937;
                if (var9 == 1) {
                    arg3.field785 = 0;
                    arg3.field734 = 0;
                    arg3.field778 = var8;
                    arg3.field746 = 0;
                }
                if (var9 == 2) {
                    arg3.field734 = 0;
                }
            } else if (var7 == -1 || arg3.field793 == -1 || class5.method33(9, var7).field918 >= class5.method33(9, arg3.field793).field918) {
                arg3.field785 = 0;
                arg3.field778 = var8;
                arg3.field773 = arg3.field724;
                arg3.field734 = 0;
                arg3.field746 = 0;
                arg3.field793 = var7;
            }
        }
        if ((arg1 & 0x8) != 0) {
            int var10 = class66.field1578.method819(-762);
            byte[] var11 = new byte[var10];
            class113 var12 = new class113(var11);
            class66.field1578.method849(var11, 0, false, var10);
            class14.field254[arg0] = var12;
            arg3.method530(var12, false);
        }
        if ((arg1 & 0x4) != 0) {
            int var13 = class66.field1578.method870(arg2 - 256);
            int var14 = class66.field1578.method845(false);
            int var15 = class66.field1578.method821(true);
            int var16 = class66.field1578.field2507;
            if (arg3.field1766 != null && arg3.field1769 != null) {
                long var17 = arg3.field1766.method932(124);
                boolean var19 = false;
                if (var14 <= 1) {
                    for (int var20 = 0; var20 < class97.field2169; var20++) {
                        if (class69.field1650[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                }
                if (!var19 && class20.field528 == 0) {
                    class62.field1486.field2507 = 0;
                    class66.field1578.method849(class62.field1486.field2512, 0, false, var15);
                    class62.field1486.field2507 = 0;
                    class121 var21 = class22.method186(class62.field1486, 32767).method966((byte) 37);
                    arg3.field737 = var21.method955(false);
                    arg3.field789 = var13 & 0xFF;
                    arg3.field768 = var13 >> 8;
                    arg3.field760 = 150;
                    if (var14 == 2 || var14 == 3) {
                        class62.method448(class113.method866((byte) -87, new class121[] { class54.field1249, arg3.field1766 }), var21, 1, false);
                    } else if (var14 == 1) {
                        class62.method448(class113.method866((byte) -116, new class121[] { class126.field2866, arg3.field1766 }), var21, 1, false);
                    } else {
                        class62.method448(arg3.field1766, var21, 2, false);
                    }
                }
            }
            class66.field1578.field2507 = var15 + var16;
        }
        if ((arg1 & 0x1) != 0) {
            int var22 = class66.field1578.method821(true);
            int var23 = class66.field1578.method845(false);
            arg3.method228(class115.field2614, 0, var22, var23);
            arg3.field735 = class115.field2614 + 300;
            arg3.field770 = class66.field1578.method821(true);
            arg3.field757 = class66.field1578.method845(false);
        }
        if ((arg1 & 0x200) != 0) {
            arg3.field764 = class66.field1578.method819(arg2 - 1017);
            arg3.field745 = class66.field1578.method819(-762);
            arg3.field741 = class66.field1578.method853(true);
            arg3.field787 = class66.field1578.method853(true);
            arg3.field726 = class66.field1578.method842((byte) 125) + class115.field2614;
            arg3.field780 = class66.field1578.method851(-12543) + class115.field2614;
            arg3.field748 = class66.field1578.method845(false);
            arg3.method226(-99);
        }
        if ((arg1 & 0x10) == 0) {
            return;
        }
        arg3.field737 = class66.field1578.method861(20356);
        if (arg3.field737.method947(true, 0) == 126) {
            arg3.field737 = arg3.field737.method965(arg2 - 192, 1);
            class62.method448(arg3.field1766, arg3.field737, 2, false);
        } else if (class62.field1494 == arg3) {
            class62.method448(arg3.field1766, arg3.field737, 2, false);
        }
        arg3.field789 = 0;
        arg3.field768 = 0;
        arg3.field760 = 150;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 419)
    public static final void method289(int arg0) {
        field994++;
        class127.method994(class63.field1525, -1);
        if (class4.field59 != -1) {
            class127.method994(class4.field59, -1);
        }
        if (arg0 >= -68) {
            field991 = -118;
        }
        class128.field2955 = 0;
        class119.field2731.method984(-1);
        class101.field2248 = class83.method577(class101.field2248);
        class55.method395();
        class46.method310(0, 765, -1, 0, 0, class63.field1525, (byte) 99, 503, 0);
        if (class4.field59 != -1) {
            class46.method310(0, 765, -1, 0, 0, class4.field59, (byte) 99, 503, 0);
        }
        if (class100.field2245) {
            class100.method677((byte) 62);
        } else {
            class25.method202(74);
            class42.method282((byte) 125);
        }
        try {
            Graphics var1 = class46.field1079.getGraphics();
            class119.field2731.method196(-5917, 0, 0, var1);
        } catch (Exception var2) {
            class46.field1079.repaint();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 472)
    public static final void method290(byte arg0) {
        if (arg0 <= 45) {
            return;
        }
        field996++;
        if (class21.field568 != 1) {
            return;
        }
        if (class15.field280 >= 6 && class15.field280 <= 106 && class82.field1909 >= 467 && class82.field1909 <= 499) {
            class63.field1526 = (class63.field1526 + 1) % 4;
            class9.field140 = true;
            class91.field2070 = true;
            class48.field1143++;
            class60.field1437.method622(251, true);
            class60.field1437.method836(0, class63.field1526);
            class60.field1437.method836(0, class19.field492);
            class60.field1437.method836(0, class4.field69);
        }
        if (class15.field280 >= 135 && class15.field280 <= 235 && class82.field1909 >= 467 && class82.field1909 <= 499) {
            class91.field2070 = true;
            class9.field140 = true;
            class48.field1143++;
            class19.field492 = (class19.field492 + 1) % 3;
            class60.field1437.method622(251, true);
            class60.field1437.method836(0, class63.field1526);
            class60.field1437.method836(0, class19.field492);
            class60.field1437.method836(0, class4.field69);
        }
        if (class15.field280 >= 273 && class15.field280 <= 373 && class82.field1909 >= 467 && class82.field1909 <= 499) {
            class4.field69 = (class4.field69 + 1) % 3;
            class91.field2070 = true;
            class9.field140 = true;
            class48.field1143++;
            class60.field1437.method622(251, true);
            class60.field1437.method836(0, class63.field1526);
            class60.field1437.method836(0, class19.field492);
            class60.field1437.method836(0, class4.field69);
        }
        if (class15.field280 < 412 || class15.field280 > 512 || class82.field1909 < 467 || class82.field1909 > 499) {
            return;
        }
        if (class26.field659 == -1) {
            class52.method373(true);
            if (class8.field109 != -1) {
                client.field431 = false;
                class18.field383 = class18.field415;
                class47.field1123 = class26.field659 = class8.field109;
                return;
            }
        } else {
            class62.method448(class18.field415, class69.field1658, 0, false);
        }
        return;
    }
}
