import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 extends class123 {

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field1917 = -1;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1923 = -1;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "Loa;")
    public static class98 field1932 = class38.method349(255, "(Udns");

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field1933 = 0;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "[I")
    public static int[] field1930 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field1931 = 0;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field1936 = 0;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Loc;")
    public static class100 field1922;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Loc;")
    public static class100 field1924;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "Ltb;")
    public static class130 field1916;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "Loa;")
    public class98 field1935;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "[I")
    public static int[] field1925;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "[I")
    public static int[] field1928;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "[I")
    public static int[] field1934;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBI)V")
    public static final void method693(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -35 / ((arg2 + 34) / 34);
        field1929++;
        if (class32.field784 == 0 || arg0 == 0 || class127.field2830 >= 50) {
            return;
        }
        class64.field1370[class127.field2830] = arg1;
        class46.field1046[class127.field2830] = arg0;
        class15.field318[class127.field2830] = arg3;
        class26.field634[class127.field2830] = null;
        class134.field3267[class127.field2830] = 0;
        class127.field2830++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILwb;)V")
    public static final void method694(int arg0, class148 arg1) {
        if (arg0 != -5694) {
            return;
        }
        if (class119.field2680 == arg1.field3666 || arg1.field3612 == -1 || arg1.field3605 != 0 || arg1.field3604 + 1 > class48.method413(-102, arg1.field3612).field794[arg1.field3641]) {
            int var2 = arg1.field3666 - arg1.field3602;
            int var3 = arg1.field3660 * 64 + arg1.field3621 * 128;
            int var4 = class119.field2680 - arg1.field3602;
            int var5 = arg1.field3660 * 64 + arg1.field3651 * 128;
            int var6 = arg1.field3660 * 64 + arg1.field3647 * 128;
            arg1.field3657 = ((var2 - var4) * var3 + var4 * var5) / var2;
            int var7 = arg1.field3660 * 64 + arg1.field3623 * 128;
            arg1.field3667 = ((var2 - var4) * var7 + var4 * var6) / var2;
        }
        arg1.field3637 = 0;
        if (arg1.field3646 == 0) {
            arg1.field3652 = 1024;
        }
        if (arg1.field3646 == 1) {
            arg1.field3652 = 1536;
        }
        if (arg1.field3646 == 2) {
            arg1.field3652 = 0;
        }
        field1926++;
        if (arg1.field3646 == 3) {
            arg1.field3652 = 512;
        }
        arg1.field3620 = arg1.field3652;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILtd;)Loa;")
    public static final class98 method695(int arg0, int arg1, class132 arg2) {
        field1919++;
        if (!class63.method518(94, class39.method351(73, arg2), arg0)) {
            return null;
        }
        if (arg1 != -326) {
            method694(24, null);
        }
        if (arg2.field3190 == null || arg2.field3190.length <= arg0 || arg2.field3190[arg0] == null || arg2.field3190[arg0].method789(true).method790(102) == 0) {
            return class81.field1837 ? class102.method840(new class98[] { class137.field3314, class132.method1074(arg0, (byte) 60) }, arg1 + 336) : null;
        } else {
            return arg2.field3190[arg0];
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIIZ)V")
    public static final void method696(int[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class6.field108.method714(-52);
        class78.field1708.method830(arg3, 0);
        if (arg4) {
            if (arg0[arg1] != -1) {
                if (arg1 == 0) {
                    class113.field2558.method830(22, 10);
                }
                if (arg1 == 1) {
                    class123.field2747.method830(54, 8);
                }
                if (arg1 == 2) {
                    class123.field2747.method830(82, 8);
                }
                if (arg1 == 3) {
                    class102.field2359.method830(110, 8);
                }
                if (arg1 == 4) {
                    field1924.method830(153, 8);
                }
                if (arg1 == 5) {
                    field1924.method830(181, 8);
                }
                if (arg1 == 6) {
                    class105.field2417.method830(209, 9);
                }
            }
            if (arg0[0] != -1 && arg2 != 0) {
                class97.field2241[0].method830(29, 13);
            }
            if (arg0[1] != -1 && arg2 != 1) {
                class97.field2241[1].method830(53, 11);
            }
            if (arg0[2] != -1 && arg2 != 2) {
                class97.field2241[2].method830(82, 11);
            }
            if (arg0[3] != -1 && arg2 != 3) {
                class97.field2241[3].method830(115, 12);
            }
            if (arg0[4] != -1 && arg2 != 4) {
                class97.field2241[4].method830(153, 13);
            }
            if (arg0[5] != -1 && arg2 != 5) {
                class97.field2241[5].method830(180, 11);
            }
            if (arg0[6] != -1 && arg2 != 6) {
                class97.field2241[6].method830(208, 13);
            }
        }
        class132.field3161.method714(arg3 + 126);
        class26.field637.method830(0, 0);
        if (arg4) {
            if (arg0[arg1] != -1) {
                if (arg1 == 7) {
                    class82.field1903.method830(42, 0);
                }
                if (arg1 == 8) {
                    field1922.method830(74, 0);
                }
                if (arg1 == 9) {
                    field1922.method830(102, 0);
                }
                if (arg1 == 10) {
                    class48.field1089.method830(130, 1);
                }
                if (arg1 == 11) {
                    class127.field2852.method830(173, 0);
                }
                if (arg1 == 12) {
                    class127.field2852.method830(201, 0);
                }
                if (arg1 == 13) {
                    class134.field3285.method830(229, 0);
                }
            }
            if (arg0[8] != -1 && arg2 != 8) {
                class97.field2241[7].method830(74, 2);
            }
            if (arg0[9] != -1 && arg2 != 9) {
                class97.field2241[8].method830(102, 3);
            }
            if (arg0[10] != -1 && arg2 != 10) {
                class97.field2241[9].method830(137, 4);
            }
            if (arg0[11] != -1 && arg2 != 11) {
                class97.field2241[10].method830(174, 2);
            }
            if (arg0[12] != -1 && arg2 != 12) {
                class97.field2241[11].method830(201, 2);
            }
            if (arg0[13] != -1 && arg2 != 13) {
                class97.field2241[12].method830(226, 2);
            }
        }
        field1927++;
        try {
            Graphics var5 = class73.field1506.getGraphics();
            class6.field108.method406(arg3 + 32, 160, 516, var5);
            class132.field3161.method406(arg3 + 32, 466, 496, var5);
        } catch (Exception var6) {
            class73.field1506.repaint();
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static void method697(byte arg0) {
        field1916 = null;
        field1928 = null;
        field1925 = null;
        field1930 = null;
        field1922 = null;
        if (arg0 < 46) {
            method695(-120, 32, null);
        }
        field1932 = null;
        field1934 = null;
        field1924 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILtd;)Z")
    public static final boolean method698(int arg0, class132 arg1) {
        field1918++;
        int var2 = arg1.field3126;
        if (class27.field665 == 2) {
            if (var2 == 201) {
                class15.field306 = true;
                class145.field3505 = class105.field2409;
                class149.field3691 = 0;
                class145.field3502 = class145.field3503;
                class91.field2110 = 1;
                class126.field2826 = true;
            }
            if (var2 == 202) {
                class145.field3502 = class145.field3503;
                class91.field2110 = 2;
                class149.field3691 = 0;
                class126.field2826 = true;
                class145.field3505 = class96.field2200;
                class15.field306 = true;
            }
        }
        if (var2 == 205) {
            class75.field1650 = 250;
            return true;
        }
        if (var2 == 501) {
            class15.field306 = true;
            class145.field3505 = class131.field3068;
            class145.field3502 = class145.field3503;
            class91.field2110 = 4;
            class149.field3691 = 0;
            class126.field2826 = true;
        }
        if (var2 == 502) {
            class15.field306 = true;
            class145.field3502 = class145.field3503;
            class149.field3691 = 0;
            class145.field3505 = class26.field624;
            class91.field2110 = 5;
            class126.field2826 = true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class91.field2088.method566(var3, var4 == 1, 12);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = var2 & 0x1;
            int var6 = (var2 - 314) / 2;
            class91.field2088.method575(var6, arg0 - 6, var5 == 1);
        }
        if (var2 == 324) {
            class91.field2088.method564(false, -1);
        }
        if (var2 == 325) {
            class91.field2088.method564(true, -1);
        }
        if (arg0 != 11) {
            field1925 = null;
        }
        if (var2 == 326) {
            class78.field1723++;
            class132.field3116.method177(6624, 63);
            class91.field2088.method577(class132.field3116, false);
            return true;
        }
        if (var2 == 620) {
            class84.field1955 = !class84.field1955;
        }
        if (var2 >= 601 && var2 <= 613) {
            class1.method1(arg0 - 114);
            if (class145.field3499.method790(91) > 0) {
                class57.field1262++;
                class132.field3116.method177(6624, 39);
                class132.field3116.method92(true, class145.field3499.method809(0));
                class132.field3116.method95(var2 - 601, true);
                class132.field3116.method95(class84.field1955 ? 1 : 0, true);
            }
        }
        return false;
    }
}
