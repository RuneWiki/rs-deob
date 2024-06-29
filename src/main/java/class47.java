import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class122 {

    @OriginalMember(owner = "client!ge", name = "rb", descriptor = "I")
    private int field1018 = -1;

    @OriginalMember(owner = "client!ge", name = "wb", descriptor = "Z")
    private volatile boolean field1023 = false;

    @OriginalMember(owner = "client!ge", name = "Kb", descriptor = "Z")
    private boolean field1037 = false;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "Lt;")
    private class124 field1011;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "Lt;")
    private class124 field1007;

    @OriginalMember(owner = "client!ge", name = "Bb", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!ge", name = "sb", descriptor = "[[I")
    public static int[][] field1019 = new int[104][104];

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "Lmb;")
    private static class84 field1016 = class79.method672(true, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!ge", name = "Gb", descriptor = "Lmb;")
    public static class84 field1033 = field1016;

    @OriginalMember(owner = "client!ge", name = "zb", descriptor = "Lmb;")
    public static class84 field1026 = class79.method672(true, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ge", name = "Hb", descriptor = "Lmb;")
    public static class84 field1034 = class79.method672(true, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ge", name = "Ib", descriptor = "I")
    public static int field1035 = 0;

    @OriginalMember(owner = "client!ge", name = "vb", descriptor = "Lmb;")
    public static class84 field1022 = class79.method672(true, " hat sich ausgeloggt)3");

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ge", name = "tb", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ge", name = "ub", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ge", name = "xb", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ge", name = "Cb", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ge", name = "Db", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ge", name = "Eb", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ge", name = "Fb", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ge", name = "Jb", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!ge", name = "Ab", descriptor = "Lv;")
    public static class136 field1027;

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "Lge;")
    public static class47 field1008;

    @OriginalMember(owner = "client!ge", name = "yb", descriptor = "Ljd;")
    public static class66 field1025;

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "[Z")
    private volatile boolean[] field1013;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
    public final int method333(byte arg0) {
        int var2 = 0;
        if (arg0 != 30) {
            method338(-8, 52);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < super.field2918.length; ++var4) {
            if (super.field2959[var4] > 0) {
                var3 += this.method342(var4, 100);
                var2 += 100;
            }
        }
        ++field1021;
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
    public final void method334(byte arg0, int arg1) {
        class136.method1090(4, this.field1005, arg1);
        ++field1030;
        if (arg0 >= -43) {
            this.field1036 = 55;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)I")
    public static final int method335(int arg0, byte arg1, int arg2) {
        ++field1012;
        if (arg1 != 104) {
            method338(98, -11);
        }
        class37 var3 = (class37) class105.field2552.method959(true, (long) arg0);
        if (var3 == null) {
            return -1;
        } else {
            return ~arg2 <= -1 && ~var3.field826.length < ~arg2 ? var3.field826[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    private final void method336(byte arg0) {
        ++field1014;
        this.field1013 = new boolean[super.field2918.length];
        if (arg0 != -127) {
            field1034 = null;
        }
        for (int var2 = 0; ~var2 > ~this.field1013.length; ++var2) {
            this.field1013[var2] = false;
        }
        if (this.field1007 == null) {
            this.field1023 = true;
        } else {
            this.field1018 = -1;
            for (int var3 = 0; this.field1013.length > var3; ++var3) {
                if (~super.field2959[var3] < -1) {
                    class124.method1022(var3, this, false, this.field1007);
                    this.field1018 = var3;
                }
            }
            if (~this.field1018 == 0) {
                this.field1023 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BBZIZ)V")
    public final void method337(byte[] arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        ++field1024;
        if (arg2) {
            if (this.field1023) {
                throw new RuntimeException();
            }
            if (this.field1011 != null) {
                class92.method786(this.field1005, -33, this.field1011, arg0);
            }
            this.method1001(arg0, arg1 ^ 119);
            this.method336((byte) -127);
        } else {
            arg0[arg0.length + -2] = (byte) (super.field2908[arg3] >> 8);
            arg0[arg0.length + -1] = (byte) super.field2908[arg3];
            if (this.field1007 != null) {
                class92.method786(arg3, -123, this.field1007, arg0);
                this.field1013[arg3] = true;
            }
            if (arg4) {
                super.field2918[arg3] = class59.method518(arg0, (byte) 78, false);
            }
        }
        if (arg1 != 119) {
            field1026 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)Z")
    public static final boolean method338(int arg0, int arg1) {
        ++field1032;
        if (class68.field1649[arg1]) {
            return true;
        } else if (!class72.field1775.method1011((byte) -102, arg1)) {
            return false;
        } else {
            int var2 = class72.field1775.method989(arg1, 30);
            if (~var2 == -1) {
                class68.field1649[arg1] = true;
                return true;
            } else {
                if (class24.field557[arg1] == null) {
                    class24.field557[arg1] = new class57[var2];
                }
                int var3 = 0;
                int var4 = -86 % ((-36 - arg0) / 34);
                while (~var3 > ~var2) {
                    if (class24.field557[arg1][var3] == null) {
                        byte[] var5 = class72.field1775.method986(var3, arg1, (byte) 67);
                        if (var5 != null) {
                            class24.field557[arg1][var3] = new class57();
                            class24.field557[arg1][var3].field1369 = (arg1 << 16) + var3;
                            if (~var5[0] == 0) {
                                class24.field557[arg1][var3].method505(new class51(var5), 101);
                            } else {
                                class24.field557[arg1][var3].method503(new class51(var5), (byte) 68);
                            }
                        }
                    }
                    ++var3;
                }
                class68.field1649[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)V")
    public final void method339(int arg0, int arg1) {
        if (arg1 > 77) {
            this.field1036 = arg0;
            if (this.field1011 != null) {
                class88.method758(this.field1005, this.field1011, -65, this);
            } else {
                class136.method1117(this.field1036, (byte) 0, this, this.field1005, (byte) 74, 255, true);
            }
            ++field1017;
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)Lmb;")
    public static final class84 method340(int arg0, int arg1) {
        ++field1009;
        class84 var2 = new class84();
        var2.field2062 = arg0;
        var2.field2058 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IB)V")
    public final void method341(int arg0, byte arg1) {
        if (arg1 != 2) {
            this.field1018 = -98;
        }
        ++field1015;
        if (this.field1007 != null && this.field1013 != null && this.field1013[arg0]) {
            class88.method758(arg0, this.field1007, -36, this);
        } else {
            class136.method1117(super.field2921[arg0], (byte) 2, this, arg0, (byte) 74, this.field1005, true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)I")
    private final int method342(int arg0, int arg1) {
        ++field1031;
        if (super.field2918[arg0] != null) {
            return 100;
        } else if (arg1 != 100) {
            return 41;
        } else {
            return this.field1013[arg0] ? 100 : class111.method902(arg1 ^ -32, this.field1005, arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)I")
    public final int method343(int arg0) {
        ++field1029;
        if (this.field1023) {
            return 100;
        } else if (super.field2918 != null) {
            return 99;
        } else {
            int var2 = class111.method902(-108, 255, this.field1005);
            if (arg0 != -1) {
                return 126;
            } else {
                if (~var2 <= -101) {
                    var2 = 99;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIZLt;[B)V")
    public final void method344(byte arg0, int arg1, boolean arg2, class124 arg3, byte[] arg4) {
        if (arg0 != 60) {
            this.method339(-124, -96);
        }
        ++field1006;
        if (this.field1011 != arg3) {
            if (!arg2 && ~this.field1018 == ~arg1) {
                this.field1023 = true;
            }
            if (arg4 == null || arg4.length <= 2) {
                this.field1013[arg1] = false;
                if (this.field1037 || arg2) {
                    class136.method1117(super.field2921[arg1], (byte) 2, this, arg1, (byte) 74, this.field1005, arg2);
                }
                return;
            }
            class8.field151.reset();
            class8.field151.update(arg4, 0, arg4.length + -2);
            int var6 = (int) class8.field151.getValue();
            int var7 = (arg4[arg4.length + -2] << 8 & 65280) + (255 & arg4[arg4.length - 1]);
            if (~super.field2921[arg1] != ~var6 || super.field2908[arg1] != var7) {
                this.field1013[arg1] = false;
                if (this.field1037 || arg2) {
                    class136.method1117(super.field2921[arg1], (byte) 2, this, arg1, (byte) 74, this.field1005, arg2);
                }
                return;
            }
            this.field1013[arg1] = true;
            if (arg2) {
                super.field2918[arg1] = class59.method518(arg4, (byte) 78, false);
                return;
            }
        } else {
            if (this.field1023) {
                throw new RuntimeException();
            }
            if (arg4 == null) {
                class136.method1117(this.field1036, (byte) 0, this, this.field1005, (byte) 74, 255, true);
                return;
            }
            class8.field151.reset();
            class8.field151.update(arg4, 0, arg4.length);
            int var8 = (int) class8.field151.getValue();
            if (this.field1036 != var8) {
                class136.method1117(this.field1036, (byte) 0, this, this.field1005, (byte) 74, 255, true);
                return;
            }
            this.method1001(arg4, 0);
            this.method336((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    public static void method345(int arg0) {
        field1033 = null;
        field1019 = null;
        field1022 = null;
        field1008 = null;
        field1034 = null;
        field1025 = null;
        field1016 = null;
        field1027 = null;
        field1026 = null;
        if (arg0 != -166) {
            field1025 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lt;Lt;IZZZ)V")
    public class47(class124 arg0, class124 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1011 = arg1;
        this.field1037 = arg5;
        this.field1005 = arg2;
        this.field1007 = arg0;
        class80.method682(this, this.field1005, (byte) -2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public static final int method346(int arg0, int arg1, int arg2) {
        ++field1010;
        if (~arg2 == 0) {
            return 12345678;
        } else {
            int var3 = (arg2 & 127) * arg1 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return arg0 >= -100 ? 122 : (65408 & arg2) + var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
    public static final void method347(int arg0) {
        if (arg0 == 10172) {
            ++field1004;
            if (~class20.field429 <= -3 || client.field465 != 0 || class19.field409) {
                class84 var1;
                if (~client.field465 == -2 && ~class20.field429 > -3) {
                    var1 = class51.method408(new class84[] { class141.field3398, class91.field2280, class17.field367, class51.field1089 }, arg0 + -10298);
                } else if (class19.field409 && class20.field429 < 2) {
                    var1 = class51.method408(new class84[] { class40.field911, class91.field2280, class5.field72, class51.field1089 }, -128);
                } else {
                    var1 = class46.field994[class20.field429 + -1];
                }
                if (~class20.field429 < -3) {
                    var1 = class51.method408(new class84[] { var1, class108.field2619, class93.method787(22245, class20.field429 - 2), class22.field540 }, arg0 ^ 10195);
                }
                class13.field239.method214(var1, 4, 15, 16777215, true, class5.field100 / 1000);
            }
        }
    }
}
