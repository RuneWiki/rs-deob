import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends class71 {

    @OriginalMember(owner = "client!r", name = "pb", descriptor = "Z")
    private boolean field2796 = false;

    @OriginalMember(owner = "client!r", name = "vb", descriptor = "Z")
    private volatile boolean field2802 = false;

    @OriginalMember(owner = "client!r", name = "Bb", descriptor = "I")
    private int field2808 = -1;

    @OriginalMember(owner = "client!r", name = "xb", descriptor = "Lsa;")
    private class126 field2804;

    @OriginalMember(owner = "client!r", name = "Cb", descriptor = "I")
    private int field2809;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "Lsa;")
    private class126 field2787;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "Laf;")
    private static class7 field2781 = class48.method406(40, "OFF");

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "Laf;")
    public static class7 field2779 = class48.method406(40, "compass");

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "Laf;")
    public static class7 field2791 = field2781;

    @OriginalMember(owner = "client!r", name = "ob", descriptor = "[J")
    public static long[] field2795 = new long[100];

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "Laf;")
    public static class7 field2782 = class48.method406(40, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!r", name = "sb", descriptor = "Laf;")
    public static class7 field2799 = class48.method406(40, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!r", name = "wb", descriptor = "Laf;")
    public static class7 field2803 = class48.method406(40, "<col=00ffff>");

    @OriginalMember(owner = "client!r", name = "zb", descriptor = "Laf;")
    public static class7 field2806 = class48.method406(40, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!r", name = "qb", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!r", name = "rb", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!r", name = "yb", descriptor = "I")
    private int field2805;

    @OriginalMember(owner = "client!r", name = "Ab", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!r", name = "Db", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "[Lfd;")
    public static class40[] field2785;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "[Lma;")
    public static class84[] field2780;

    @OriginalMember(owner = "client!r", name = "ub", descriptor = "[Z")
    private volatile boolean[] field2801;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Z)V")
    public static final void method907(boolean arg0) {
        ++field2798;
        if (class48.field1168 == null) {
            if (class81.field1865 == null) {
                int var1 = class13.field337;
                if (arg0) {
                    if (class78.field1817) {
                        if (var1 != 1) {
                            int var6 = class111.field2681;
                            int var7 = class113.field2709;
                            if (~(class24.field640 - 10) < ~var7 || var7 > class24.field640 - -class27.field711 - -10 || ~var6 > ~(class18.field436 + -10) || var6 > class18.field436 - -10 + class52.field1247) {
                                class78.field1817 = false;
                                class113.method892(class24.field640, 123, class18.field436, class27.field711, class52.field1247);
                            }
                        }
                        if (~var1 != -2) {
                            return;
                        }
                        int var8 = class24.field640;
                        int var9 = class18.field436;
                        int var10 = class10.field267;
                        int var11 = class27.field711;
                        int var12 = -1;
                        int var13 = class111.field2668;
                        for (int var14 = 0; ~class19.field449 < ~var14; ++var14) {
                            int var15 = var9 + 31 - -((class19.field449 - (var14 + 1)) * 15);
                            if (var8 < var10 && var10 < var8 + var11 && ~(var15 + -13) > ~var13 && ~var13 > ~(var15 + 3)) {
                                var12 = var14;
                            }
                        }
                        if (var12 != -1) {
                            class98.method805(var12, true);
                        }
                        class78.field1817 = false;
                        class113.method892(class24.field640, 114, class18.field436, class27.field711, class52.field1247);
                    } else {
                        if (~var1 == -2 && class19.field449 > 0) {
                            int var2 = class147.field3473[class19.field449 + -1];
                            if (~var2 == -23 || var2 == 20 || ~var2 == -6 || var2 == 14 || var2 == 33 || var2 == 18 || ~var2 == -59 || var2 == 15 || ~var2 == -29 || ~var2 == -12 || var2 == 43 || var2 == 1007) {
                                int var3 = class45.field1084[class19.field449 + -1];
                                int var4 = class115.field2731[class19.field449 + -1];
                                class103 var5 = class37.method328(0, var4);
                                if (class57.method462(false, class7.method98(26454, var5)) || class83.method699(-15602, class7.method98(26454, var5))) {
                                    client.field552 = false;
                                    class25.field666 = 0;
                                    if (class48.field1168 != null) {
                                        class141.method1151(15569, class48.field1168);
                                    }
                                    class48.field1168 = class37.method328(0, var4);
                                    class71.field1542 = class10.field267;
                                    class141.field3320 = class111.field2668;
                                    class44.field1048 = var3;
                                    class141.method1151(15569, class48.field1168);
                                    return;
                                }
                            }
                        }
                        if (var1 == 1 && (class86.field2015 == 1 && class19.field449 > 2 || class93.method749(class19.field449 + -1, (byte) 1))) {
                            var1 = 2;
                        }
                        if (~var1 == -2 && ~class19.field449 < -1) {
                            class98.method805(class19.field449 + -1, true);
                        }
                        if (~var1 == -3 && class19.field449 > 0) {
                            class93.method748((byte) 124);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(Z)V")
    public static final void method908(boolean arg0) {
        if (!arg0) {
            method907(false);
        }
        ++field2784;
        try {
            if (class148.field3479 == 1) {
                int var1 = class3.field22.method631(true);
                if (var1 > 0 && class3.field22.method626(192)) {
                    int var2 = var1 - class26.field689;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class3.field22.method630(72, var2);
                } else {
                    class3.field22.method629(5530);
                    class3.field22.method622(false);
                    if (class82.field1932 == null) {
                        class148.field3479 = 0;
                    } else {
                        class148.field3479 = 2;
                    }
                    class39.field973 = null;
                    class75.field1750 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class3.field22.method629(5530);
            class82.field1932 = null;
            class75.field1750 = null;
            class39.field973 = null;
            class148.field3479 = 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(Z)V")
    public static void method909(boolean arg0) {
        field2795 = null;
        field2785 = null;
        field2779 = null;
        field2799 = null;
        field2803 = null;
        field2781 = null;
        field2780 = null;
        if (arg0) {
            field2782 = null;
            field2806 = null;
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lsa;Lsa;IZZZ)V")
    public class118(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2796 = arg5;
        this.field2804 = arg1;
        this.field2809 = arg2;
        this.field2787 = arg0;
        class11.method120(this.field2809, false, this);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIZ[BI)V")
    public final void method910(boolean arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field2788;
        if (arg1 != 1) {
            method909(true);
        }
        if (arg0) {
            if (this.field2802) {
                throw new RuntimeException();
            } else {
                if (this.field2804 != null) {
                    class52.method427(arg3, this.field2804, this.field2809, 126);
                }
                this.method576(arg3, 0);
                this.method911(-32607);
            }
        } else {
            arg3[arg3.length - 2] = (byte) (super.field1547[arg4] >> 8);
            arg3[arg3.length - 1] = (byte) super.field1547[arg4];
            if (this.field2787 != null) {
                class52.method427(arg3, this.field2787, arg4, 84);
                this.field2801[arg4] = true;
            }
            if (arg2) {
                super.field1575[arg4] = class96.method786(false, arg3, false);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(II)V")
    public final void method585(int arg0, int arg1) {
        if (this.field2787 != null && this.field2801 != null && this.field2801[arg0]) {
            class32.method286(-1, this.field2787, arg0, this);
        } else {
            class18.method171(arg0, true, arg1 ^ -21029, (byte) 2, this.field2809, this, super.field1552[arg0]);
        }
        ++field2778;
        if (arg1 != -1) {
            this.method917(-116);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    private final void method911(int arg0) {
        this.field2801 = new boolean[super.field1575.length];
        ++field2783;
        for (int var2 = 0; this.field2801.length > var2; ++var2) {
            this.field2801[var2] = false;
        }
        if (this.field2787 == null) {
            this.field2802 = true;
        } else {
            this.field2808 = -1;
            if (arg0 != -32607) {
                this.method912(113, 62);
            }
            for (int var3 = 0; this.field2801.length > var3; ++var3) {
                if (~super.field1545[var3] < -1) {
                    class20.method189(var3, 29095, this.field2787, this);
                    this.field2808 = var3;
                }
            }
            if (this.field2808 == -1) {
                this.field2802 = true;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(II)I")
    private final int method912(int arg0, int arg1) {
        ++field2786;
        if (super.field1575[arg1] != null) {
            return 100;
        } else if (this.field2801[arg1]) {
            return 100;
        } else {
            if (arg0 <= 3) {
                method915((byte) 35);
            }
            return class27.method243(this.field2809, arg1, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)I")
    public final int method913(int arg0) {
        int var2 = 0;
        int var3 = 0;
        ++field2790;
        int var4 = 0;
        int var5 = 39 % ((-31 - arg0) / 48);
        while (~var4 > ~super.field1575.length) {
            if (~super.field1545[var4] < -1) {
                var3 += 100;
                var2 += this.method912(37, var4);
            }
            ++var4;
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BIZLsa;B)V")
    public final void method914(byte[] arg0, int arg1, boolean arg2, class126 arg3, byte arg4) {
        ++field2807;
        int var6 = -6 % ((62 - arg4) / 55);
        if (this.field2804 == arg3) {
            if (this.field2802) {
                throw new RuntimeException();
            } else if (arg0 == null) {
                class18.method171(this.field2809, true, 21028, (byte) 0, 255, this, this.field2805);
            } else {
                class32.field849.reset();
                class32.field849.update(arg0, 0, arg0.length);
                int var7 = (int) class32.field849.getValue();
                if (this.field2805 == var7 && super.field1586 == this.field2793) {
                    this.method576(arg0, 0);
                    this.method911(-32607);
                } else {
                    class18.method171(this.field2809, true, 21028, (byte) 0, 255, this, this.field2805);
                }
            }
        } else {
            if (!arg2 && ~this.field2808 == ~arg1) {
                this.field2802 = true;
            }
            if (arg0 != null && arg0.length > 2) {
                class32.field849.reset();
                class32.field849.update(arg0, 0, arg0.length + -2);
                int var8 = (int) class32.field849.getValue();
                int var9 = ((255 & arg0[arg0.length + -2]) << 8) + (255 & arg0[arg0.length - 1]);
                if (~super.field1552[arg1] == ~var8 && ~super.field1547[arg1] == ~var9) {
                    this.field2801[arg1] = true;
                    if (arg2) {
                        super.field1575[arg1] = class96.method786(false, arg0, false);
                    }
                } else {
                    this.field2801[arg1] = false;
                    if (this.field2796 || arg2) {
                        class18.method171(arg1, arg2, 21028, (byte) 2, this.field2809, this, super.field1552[arg1]);
                    }
                }
            } else {
                this.field2801[arg1] = false;
                if (this.field2796 || arg2) {
                    class18.method171(arg1, arg2, 21028, (byte) 2, this.field2809, this, super.field1552[arg1]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static final void method915(byte arg0) {
        if (class111.field2674 != null) {
            class111.field2674.method595((byte) 118);
        }
        if (class133.field3118 != null) {
            class133.field3118.method595((byte) 116);
        }
        int var1 = 97 / ((-10 - arg0) / 44);
        ++field2794;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(II)V")
    public final void method575(int arg0, int arg1) {
        ++field2797;
        class42.method371((byte) -36, this.field2809, arg1);
        if (arg0 != 0) {
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)Z")
    public static final boolean method916(int arg0) {
        ++field2810;
        class113 var1 = class82.field1882;
        synchronized (class82.field1882) {
            if (class64.field1415 == class144.field3399) {
                return false;
            } else {
                class25.field667 = class55.field1332[class64.field1415];
                class2.field12 = class22.field615[class64.field1415];
                class64.field1415 = arg0 & class64.field1415 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)I")
    public final int method917(int arg0) {
        ++field2789;
        int var2 = -87 % ((15 - arg0) / 39);
        if (this.field2802) {
            return 100;
        } else if (super.field1575 != null) {
            return 99;
        } else {
            int var3 = class27.method243(255, this.field2809, (byte) -50);
            if (~var3 <= -101) {
                var3 = 99;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(III)V")
    public final void method918(int arg0, int arg1, int arg2) {
        ++field2792;
        this.field2793 = arg0;
        this.field2805 = arg2;
        if (arg1 != -1946) {
            this.field2787 = null;
        }
        if (this.field2804 != null) {
            class32.method286(-1, this.field2804, this.field2809, this);
        } else {
            class18.method171(this.field2809, true, arg1 ^ -21950, (byte) 0, 255, this, this.field2805);
        }
    }
}
