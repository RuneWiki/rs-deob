import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lva;")
    private static class121 field856 = class107.method797("Your account is already logged in)3", -10983);

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lva;")
    public static class121 field866 = field856;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lva;")
    public static class121 field864 = class107.method797(" )2>", -10983);

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lva;")
    private static class121 field869 = class107.method797("Loading config )2 ", -10983);

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lva;")
    private static class121 field865 = class107.method797("Login server offline)3", -10983);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lva;")
    public static class121 field857 = field869;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lva;")
    public static class121 field868 = field865;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Li;")
    public static class48 field859 = new class48(50);

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[J")
    public static long[] field872 = new long[32];

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
    public static int[] field875 = new int[1000];

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field871 = 0;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field874 = 0;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lva;")
    public static class121 field876 = class107.method797("@or1@", -10983);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lw;")
    public static class125 field867;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lhe;")
    public static class47 field870;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lm;")
    public static class72 field873;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBII)I", line = 17)
    public static final int method254(int arg0, byte arg1, int arg2, int arg3) {
        field863++;
        if ((class23.field613[arg2][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class23.field613[1][arg0][arg3] & 0x2) == 0) {
            if (arg1 != 47) {
                method254(34, (byte) -15, -17, 48);
            }
            return arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 37)
    public static final void method255(int arg0) {
        field862++;
        try {
            if (arg0 != -18443) {
                method257((byte) 121);
            }
            Graphics var1 = class46.field1079.getGraphics();
            class114.field2594.method196(-5917, 205, 553, var1);
        } catch (Exception var2) {
            class46.field1079.repaint();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLd;)V", line = 57)
    public static final void method256(byte arg0, class19 arg1) {
        field858++;
        int var2 = arg1.field518;
        if (arg0 > -40) {
            return;
        }
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class20.field541 == 0) {
                arg1.field483 = 0;
                arg1.field468 = class44.field1015;
            } else if (var2 == 1 && class20.field541 == 1) {
                arg1.field468 = class85.field1962;
                arg1.field483 = 0;
            } else if (var2 == 2 && class20.field541 != 2) {
                arg1.field468 = class126.field2876;
                arg1.field483 = 0;
            } else {
                int var3 = class8.field119;
                if (var2 > 700) {
                    var2 -= 601;
                } else {
                    var2--;
                }
                if (class20.field541 != 2) {
                    var3 = 0;
                }
                if (var2 >= var3) {
                    arg1.field468 = class18.field415;
                    arg1.field483 = 0;
                } else {
                    arg1.field468 = class128.field2962[var2];
                    arg1.field483 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class8.field119;
            if (class20.field541 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg1.field468 = class18.field415;
                arg1.field483 = 0;
            } else {
                if (class41.field951[var2] == 0) {
                    arg1.field468 = class113.method866((byte) -105, new class121[] { class86.field1981, class115.field2624 });
                } else if (class41.field951[var2] >= 5000) {
                    if (class41.field951[var2] == class20.field547) {
                        arg1.field468 = class113.method866((byte) -79, new class121[] { class22.field589, class61.field1466, class35.method242(class41.field951[var2] - 5000, 10) });
                    } else {
                        arg1.field468 = class113.method866((byte) -81, new class121[] { class92.field2105, class61.field1466, class35.method242(class41.field951[var2] - 5000, 10) });
                    }
                } else if (class41.field951[var2] == class20.field547) {
                    arg1.field468 = class113.method866((byte) -48, new class121[] { class22.field589, class78.field1795, class35.method242(class41.field951[var2], 10) });
                } else {
                    arg1.field468 = class113.method866((byte) -38, new class121[] { class92.field2105, class78.field1795, class35.method242(class41.field951[var2], 10) });
                }
                arg1.field483 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class8.field119;
            if (class20.field541 != 2) {
                var5 = 0;
            }
            arg1.field476 = var5 * 15 + 20;
            if (arg1.field476 <= arg1.field449) {
                arg1.field476 = arg1.field449 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class20.field541 == 0) {
                arg1.field483 = 0;
                arg1.field468 = class45.field1063;
            } else if (var2 == 1 && class20.field541 == 0) {
                arg1.field483 = 0;
                arg1.field468 = class126.field2876;
            } else {
                int var6 = class97.field2169;
                if (class20.field541 == 0) {
                    var6 = 0;
                }
                if (var6 <= var2) {
                    arg1.field468 = class18.field415;
                    arg1.field483 = 0;
                } else {
                    arg1.field468 = class95.method636(-3, class69.field1650[var2]).method963(-14767);
                    arg1.field483 = 1;
                }
            }
        } else if (var2 == 503) {
            arg1.field476 = class97.field2169 * 15 + 20;
            if (arg1.field449 >= arg1.field476) {
                arg1.field476 = arg1.field449 + 1;
            }
        } else if (var2 == 327) {
            arg1.field485 = 150;
            arg1.field461 = (int) (Math.sin((double) class115.field2614 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field452 = 5;
            arg1.field450 = 0;
        } else if (var2 == 324) {
            if (class9.field142 == -1) {
                class52.field1212 = arg1.field462;
                class9.field142 = arg1.field447;
            }
            if (class97.field2162.field1912) {
                arg1.field447 = class9.field142;
            } else {
                arg1.field447 = class52.field1212;
            }
        } else if (var2 == 325) {
            if (class9.field142 == -1) {
                class52.field1212 = arg1.field462;
                class9.field142 = arg1.field447;
            }
            if (class97.field2162.field1912) {
                arg1.field447 = class52.field1212;
            } else {
                arg1.field447 = class9.field142;
            }
        } else if (var2 == 600) {
            arg1.field468 = class18.field383;
            if (class115.field2614 % 20 < 10) {
                arg1.field468 = arg1.field468.method958(38, 124);
            } else {
                arg1.field468 = arg1.field468.method958(38, 32);
            }
        } else if (var2 == 620) {
            if (class54.field1257 < 1) {
                arg1.field468 = class18.field415;
            } else if (client.field431) {
                arg1.field524 = 16711680;
                arg1.field468 = class126.field2859;
            } else {
                arg1.field524 = 16777215;
                arg1.field468 = class61.field1460;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 316)
    public static void method257(byte arg0) {
        field876 = null;
        field873 = null;
        field856 = null;
        field870 = null;
        field869 = null;
        int var1 = 40 % ((arg0 + 10) / 61);
        field867 = null;
        field868 = null;
        field859 = null;
        field864 = null;
        field857 = null;
        field865 = null;
        field872 = null;
        field875 = null;
        field866 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 362)
    public static final void method258(int arg0) {
        if (arg0 < -79) {
            field861++;
            class26.field651.method347(true);
            class113.field2510.method347(true);
        }
    }
}
