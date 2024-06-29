import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class115 extends class29 {

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public int field2820 = 0;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field2826 = -1;

    @OriginalMember(owner = "client!tb", name = "ub", descriptor = "Lwb;")
    public static class130 field2838 = class26.method212("oder benutzen Sie eine andere Welt)3", -32376);

    @OriginalMember(owner = "client!tb", name = "wb", descriptor = "Lwb;")
    public static class130 field2840 = class26.method212("mapfunction", -32376);

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "Lwb;")
    public static class130 field2836 = class26.method212("@yel@", -32376);

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public static int field2825 = 0;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field2829 = 0;

    @OriginalMember(owner = "client!tb", name = "xb", descriptor = "Lwb;")
    private static class130 field2841 = class26.method212("To play on this world move to a free area first", -32376);

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public static int field2827 = 0;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "Lwb;")
    public static class130 field2832 = field2841;

    @OriginalMember(owner = "client!tb", name = "Ab", descriptor = "Lwb;")
    public static class130 field2844 = class26.method212("Freunde", -32376);

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "Lwb;")
    private static class130 field2824 = class26.method212("This computers address has been blocked", -32376);

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lwb;")
    private static class130 field2817 = class26.method212("Take", -32376);

    @OriginalMember(owner = "client!tb", name = "zb", descriptor = "I")
    public static int field2843 = -1;

    @OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
    public static int field2845 = -1;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lwb;")
    public static class130 field2819 = field2817;

    @OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
    public static volatile int field2846 = -1;

    @OriginalMember(owner = "client!tb", name = "Eb", descriptor = "Lwb;")
    public static class130 field2848 = field2824;

    @OriginalMember(owner = "client!tb", name = "Fb", descriptor = "Lwb;")
    private static class130 field2849 = class26.method212("Enter name of player to add to list", -32376);

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lwb;")
    public static class130 field2822 = field2849;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!tb", name = "tb", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!tb", name = "yb", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!tb", name = "Db", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!tb", name = "vb", descriptor = "[I")
    public static int[] field2839;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V", line = 10)
    public static final void method877(int arg0) {
        if (arg0 != 8243) {
            method887(null, null, true);
        }
        class90.field2187 = new class108();
        field2842++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILk;ZLk;)Lna;", line = 23)
    public static final class79 method878(byte arg0, int arg1, class60 arg2, boolean arg3, class60 arg4) {
        field2830++;
        boolean var5 = true;
        int[] var6 = arg2.method489(0, arg1);
        if (arg0 != -77) {
            field2840 = null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method512(var6[var7], -6151, arg1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg4.method512(var9, arg0 ^ 0x184A, 0);
                } else {
                    var10 = arg4.method512(0, -6151, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class79(arg2, arg4, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 85)
    public static final void method879(boolean arg0) {
        field2837++;
        Object var1 = class31.field871;
        synchronized (class31.field871) {
            if (class21.field600 == 0) {
                class113.field2779.method842(new class83(), (byte) 110, 5);
            }
            class21.field600 = 600;
        }
        if (arg0) {
            method889(null, -15, -40);
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V", line = 119)
    public static void method880(int arg0) {
        field2832 = null;
        field2819 = null;
        field2840 = null;
        if (arg0 != -1) {
            method878((byte) 81, -65, null, false, null);
        }
        field2849 = null;
        field2836 = null;
        field2838 = null;
        field2839 = null;
        field2817 = null;
        field2848 = null;
        field2841 = null;
        field2824 = null;
        field2844 = null;
        field2822 = null;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V", line = 148)
    public static final void method881(int arg0) {
        class120.field2930.method401(26116);
        field2816++;
        if (arg0 != 192) {
            field2846 = 74;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V", line = 159)
    public static final void method882(int arg0, int arg1) {
        if (arg1 != 3) {
            method889(null, 53, 80);
        }
        class84.method633(arg0, arg1 + 18244);
        field2835++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILfe;)V", line = 175)
    private final void method883(byte arg0, int arg1, class36 arg2) {
        field2828++;
        if (arg1 == 5) {
            this.field2820 = arg2.method351((byte) -106);
        }
        if (arg0 < 97) {
            method884(-96);
        }
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V", line = 199)
    public static final void method884(int arg0) {
        try {
            if (arg0 != 553) {
                field2824 = null;
            }
            Graphics var1 = class84.field2003.getGraphics();
            class21.field621.method187(205, var1, -26826, 553);
        } catch (Exception var2) {
            class84.field2003.repaint();
        }
        field2847++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)V", line = 220)
    public static final void method885(int arg0, byte arg1) {
        class65.method536(83);
        field2821++;
        int var2 = class45.method415(arg0, (byte) 120).field2820;
        if (var2 == 0) {
            return;
        }
        int var3 = class29.field819[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class12.method92(0.9D);
                ((class6) class12.field362).method46(true, 0.9D);
            }
            if (var3 == 2) {
                class12.method92(0.8D);
                ((class6) class12.field362).method46(true, 0.8D);
            }
            if (var3 == 3) {
                class12.method92(0.7D);
                ((class6) class12.field362).method46(true, 0.7D);
            }
            if (var3 == 4) {
                class12.method92(0.6D);
                ((class6) class12.field362).method46(true, 0.6D);
            }
            class24.method208(6);
            class43.field1191 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class113.field2804 != var4) {
                if (class113.field2804 == 0 && class17.field475 != -1) {
                    class65.method539(class17.field475, class29.field802, 0, 0, false, var4, (byte) 16);
                    class85.field2026 = 0;
                } else if (var4 == 0) {
                    class65.method534(0);
                    class85.field2026 = 0;
                } else {
                    class116.method896(var4, (byte) 119);
                }
                class113.field2804 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class22.field643 = 127;
            }
            if (var3 == 1) {
                class22.field643 = 96;
            }
            if (var3 == 2) {
                class22.field643 = 64;
            }
            if (var3 == 3) {
                class22.field643 = 32;
            }
            if (var3 == 4) {
                class22.field643 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class98.field2368 = 127;
            }
            if (var3 == 1) {
                class98.field2368 = 96;
            }
            if (var3 == 2) {
                class98.field2368 = 64;
            }
            if (var3 == 3) {
                class98.field2368 = 32;
            }
            if (var3 == 4) {
                class98.field2368 = 0;
            }
        }
        if (var2 == 8) {
            class129.field3047 = true;
            class53.field1397 = var3;
        }
        if (var2 == 9) {
            class45.field1224 = var3;
        }
        if (var2 == 6) {
            class52.field1366 = var3;
        }
        if (var2 == 5) {
            class117.field2893 = var3;
        }
        if (arg1 < 68) {
            method889(null, -42, -95);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILfe;)V", line = 394)
    public final void method886(int arg0, class36 arg1) {
        while (true) {
            int var3 = arg1.method365((byte) -127);
            if (var3 == 0) {
                if (arg0 != -1) {
                    method888((byte) -87);
                }
                field2823++;
                return;
            }
            this.method883((byte) 115, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lk;Lk;Z)V", line = 414)
    public static final void method887(class60 arg0, class60 arg1, boolean arg2) {
        field2834++;
        class30.field851 = arg0;
        if (!arg2) {
            class68.field1764 = arg1;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V", line = 427)
    public static final void method888(byte arg0) {
        field2818++;
        int var1 = 0;
        int var2 = 10 / ((-arg0 - 51) / 63);
        while (class45.field1220 > var1) {
            int var3 = class69.field1775[var1];
            class33 var4 = class26.field766[var3];
            int var5 = class67.field1682.method365((byte) -126);
            if ((var5 & 0x80) != 0) {
                var4.field913 = class89.method663(class67.field1682.method346(-32768), (byte) -6);
                var4.field2094 = var4.field913.field2013;
                var4.field2124 = var4.field913.field2011;
                var4.field2118 = var4.field913.field1990;
                var4.field2086 = var4.field913.field1993;
                var4.field2141 = var4.field913.field1996;
                var4.field2068 = var4.field913.field1969;
                var4.field2076 = var4.field913.field1981;
                var4.field2110 = var4.field913.field1999;
                var4.field2123 = var4.field913.field1986;
            }
            if ((var5 & 0x2) != 0) {
                int var6 = class67.field1682.method350((byte) -114);
                int var7 = class67.field1682.method350((byte) -100);
                var4.method651(110, var6, class130.field3128, var7);
                var4.field2102 = class130.field3128 + 300;
                var4.field2088 = class67.field1682.method365((byte) -121);
                var4.field2090 = class67.field1682.method365((byte) -128);
            }
            if ((var5 & 0x8) != 0) {
                int var8 = class67.field1682.method351((byte) -123);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class67.field1682.method365((byte) -127);
                if (var4.field2115 == var8 && var8 != -1) {
                    int var10 = class85.method641(var8, 12).field1114;
                    if (var10 == 1) {
                        var4.field2139 = var9;
                        var4.field2131 = 0;
                        var4.field2134 = 0;
                        var4.field2112 = 0;
                    }
                    if (var10 == 2) {
                        var4.field2131 = 0;
                    }
                } else if (var8 == -1 || var4.field2115 == -1 || class85.method641(var8, 12).field1133 >= class85.method641(var4.field2115, 12).field1133) {
                    var4.field2112 = 0;
                    var4.field2134 = 0;
                    var4.field2115 = var8;
                    var4.field2139 = var9;
                    var4.field2092 = var4.field2140;
                    var4.field2131 = 0;
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field2117 = class67.field1682.method346(-32768);
                int var11 = class67.field1682.method356(49152);
                if (var4.field2117 == 65535) {
                    var4.field2117 = -1;
                }
                var4.field2121 = 0;
                var4.field2129 = 0;
                var4.field2095 = var11 >> 16;
                var4.field2093 = (var11 & 0xFFFF) + class130.field3128;
                if (class130.field3128 < var4.field2093) {
                    var4.field2129 = -1;
                }
            }
            if ((var5 & 0x1) != 0) {
                int var12 = class67.field1682.method350((byte) -124);
                int var13 = class67.field1682.method350((byte) -128);
                var4.method651(116, var12, class130.field3128, var13);
                var4.field2102 = class130.field3128 + 300;
                var4.field2088 = class67.field1682.method367(-1);
                var4.field2090 = class67.field1682.method365((byte) -125);
            }
            if ((var5 & 0x20) != 0) {
                var4.field2116 = class67.field1682.method351((byte) -95);
                var4.field2125 = class67.field1682.method349((byte) 112);
            }
            if ((var5 & 0x40) != 0) {
                var4.field2074 = class67.field1682.method355((byte) 60);
                var4.field2089 = 100;
            }
            if ((var5 & 0x4) != 0) {
                var4.field2085 = class67.field1682.method337((byte) 13);
                if (var4.field2085 == 65535) {
                    var4.field2085 = -1;
                }
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lk;II)Lqd;", line = 585)
    public static final class100 method889(class60 arg0, int arg1, int arg2) {
        field2831++;
        if (arg1 != 2) {
            field2846 = 106;
        }
        return class53.method451(arg2, (byte) -94, arg0) ? class58.method478(14858) : null;
    }
}
