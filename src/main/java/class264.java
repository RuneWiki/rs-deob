import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class264 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field3895 = 16777215;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public int field3910 = 8;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[I")
    public static int[] field3904 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[J")
    public static long[] field3899 = new long[100];

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
    public static int[] field3909 = new int[4096];

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "[[Z")
    public static boolean[][] field3914;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "[I")
    public static int[] field3915;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Z")
    public boolean field3902;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
    public static int[] field3901;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILaj;I)V", line = 9)
    private final void method1821(int arg0, int arg1, class1 arg2, int arg3) {
        field3906++;
        if (arg3 == 1) {
            this.field3910 = arg2.method56(19612);
        } else if (arg3 == 2) {
            this.field3902 = true;
        } else if (arg3 == 3) {
            this.field3896 = arg2.method41((byte) -66);
            this.field3911 = arg2.method41((byte) -66);
            this.field3900 = arg2.method41((byte) -66);
        } else if (arg3 == 4) {
            this.field3908 = arg2.method15((byte) -62);
        } else if (arg3 == 5) {
            this.field3912 = arg2.method56(19612);
        } else if (arg3 == 6) {
            this.field3895 = arg2.method4(true);
        }
        if (arg1 != 76) {
            method1827(true);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 61)
    private static final String method1822(boolean arg0, String arg1) {
        if (arg0) {
            return (String) null;
        }
        String var2 = class65.method520(119, class106.method851(arg1, -48));
        if (var2 == null) {
            var2 = "";
        }
        field3907++;
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLtk;)Z", line = 77)
    public static final boolean method1823(byte arg0, class266 arg1) {
        field3903++;
        if (arg1.field4033 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 > -83) {
            field3913 = -39;
        }
        while (var2 < arg1.field4033.length) {
            int var3 = class161.method1186(0, arg1, var2);
            int var4 = arg1.field3957[var2];
            if (arg1.field4033[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field4033[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field4033[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3909[var0] = class247.method1730((byte) -74, var0);
        }
        field3914 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };
        field3915 = new int[32];
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 142)
    public static final void method1824(int arg0, String arg1, byte arg2) {
        int var3 = 50 / ((53 - arg2) / 61);
        field3897++;
        String var4 = class323.method2274(5, method1822(false, arg1));
        boolean var5 = false;
        for (int var6 = 0; var6 < class45.field703; var6++) {
            class92 var7 = class74.field1140[class325.field5068[var6]];
            if (var7 != null && var7.field1486 != null && var7.field1486.equalsIgnoreCase(var4)) {
                if (arg0 == 1) {
                    class209.field3305.method1808((byte) -74, 85);
                    class209.field3305.method65(0, 0);
                    class247.field3676++;
                    class209.field3305.method26(-92, class325.field5068[var6]);
                } else if (arg0 == 4) {
                    class108.field1769++;
                    class209.field3305.method1808((byte) -74, 79);
                    class209.field3305.method26(-93, class325.field5068[var6]);
                    class209.field3305.method49(-60, 0);
                } else if (arg0 == 5) {
                    class10.field225++;
                    class209.field3305.method1808((byte) -74, 103);
                    class209.field3305.method47(class325.field5068[var6], false);
                    class209.field3305.method65(0, 0);
                } else if (arg0 == 6) {
                    class209.field3305.method1808((byte) -74, 172);
                    class66.field1008++;
                    class209.field3305.method26(-115, class325.field5068[var6]);
                    class209.field3305.method49(-85, 0);
                } else if (arg0 == 7) {
                    class191.field2996++;
                    class209.field3305.method1808((byte) -74, 173);
                    class209.field3305.method21(62, 0);
                    class209.field3305.method26(-93, class325.field5068[var6]);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class129.method1003(0, class18.field343 + var4, "", 110);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Laj;IB)V", line = 220)
    public final void method1825(class1 arg0, int arg1, byte arg2) {
        field3898++;
        int var4 = 40 / ((-arg2 - 40) / 59);
        while (true) {
            int var5 = arg0.method15((byte) 112);
            if (var5 == 0) {
                return;
            }
            this.method1821(arg1, 76, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 243)
    public static final void method1826(int arg0) {
        field3905++;
        if (class322.field5049 == null) {
            return;
        }
        if (class344.field5333 < 10) {
            if (!class285.field4446.method951(0, class322.field5049.field1470)) {
                class344.field5333 = class73.field1113.method955((byte) -124, class322.field5049.field1470) / 10;
                return;
            }
            class225.method1646((byte) 103);
            class344.field5333 = 10;
        }
        if (arg0 <= 120) {
            return;
        }
        if (class344.field5333 == 10) {
            class188.field2953 = class322.field5049.field1462 >> 6 << 6;
            class286.field4473 = (class322.field5049.field1452 >> 6 << 6) + 64 - class188.field2953;
            class227.field3512 = class322.field5049.field1454 >> 6 << 6;
            class113.field1833 = (class322.field5049.field1461 >> 6 << 6) + 64 - class227.field3512;
            int[] var1 = class322.field5049.method720((byte) -127, class75.field1153, (class345.field5363.field4672 >> 7) + class133.field2118, (class345.field5363.field4671 >> 7) + class117.field1902);
            int var2 = -1;
            int var3 = -1;
            if (var1 != null) {
                var3 = class286.field4473 + class188.field2953 - (var1[2] + 1);
                var2 = var1[1] - class227.field3512;
            }
            if (var2 >= 0 && var2 < class113.field1833 && var3 >= 0 && class286.field4473 > var3) {
                int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var2 + (int) (Math.random() * 10.0D) - 5;
                class67.field1013 = var4;
                class180.field2863 = var5;
            } else if (class245.field3665 == -1 || class70.field1062 == -1) {
                int[] var7 = class322.field5049.method722((byte) 89, (class322.field5049.field1458 & 0xFFFDA6A) >> 14, class322.field5049.field1458 & 0x3FFF);
                class180.field2863 = var7[1] - class227.field3512;
                class67.field1013 = class286.field4473 + class188.field2953 - var7[2] - 1;
            } else {
                int[] var6 = class322.field5049.method722((byte) -66, class245.field3665, class70.field1062);
                class70.field1062 = -1;
                class245.field3665 = -1;
                if (var6 != null) {
                    class67.field1013 = class286.field4473 + class188.field2953 - var6[2] - 1;
                    class180.field2863 = var6[1] - class227.field3512;
                }
            }
            if (class322.field5049.field1450 == 37) {
                class342.field5298 = 3.0F;
                class16.field333 = 3.0F;
            } else if (class322.field5049.field1450 == 50) {
                class342.field5298 = 4.0F;
                class16.field333 = 4.0F;
            } else if (class322.field5049.field1450 == 75) {
                class342.field5298 = 6.0F;
                class16.field333 = 6.0F;
            } else if (class322.field5049.field1450 == 100) {
                class342.field5298 = 8.0F;
                class16.field333 = 8.0F;
            } else if (class322.field5049.field1450 == 200) {
                class342.field5298 = 16.0F;
                class16.field333 = 16.0F;
            } else {
                class342.field5298 = 8.0F;
                class16.field333 = 8.0F;
            }
            class344.method2385((byte) 25);
            class107.field1755 = new int[class4.field115 + 1];
            int var8 = class286.field4473 >> 6;
            int var9 = class111.field1805 >> 1;
            int var10 = class67.field1016 >> 2 << 10;
            int var11 = class113.field1833 >> 6;
            class191.field2989 = new int[var11][var8][];
            class141.field2282 = new byte[var11][var8][];
            class3.field95 = new byte[var11][var8][];
            class258.field3828 = new byte[var11][var8][];
            class303.field4830 = new byte[var11][var8][];
            class178.field2837 = new int[var11][var8][];
            class52.field794 = new int[var11][var8][];
            class209.field3299 = new byte[var11][var8][];
            class241.method1706(var10, -1, var9);
            class344.field5333 = 20;
        } else if (class344.field5333 == 20) {
            class60.method487(new class1(class285.field4446.method935(class322.field5049.field1470, -73, "underlay")), -1);
            class344.field5333 = 30;
            class117.method920(true, 25);
            class166.method1241(2);
        } else if (class344.field5333 == 30) {
            class8.method140(new class1(class285.field4446.method935(class322.field5049.field1470, -76, "overlay")), -1);
            class344.field5333 = 40;
            class166.method1241(2);
        } else if (class344.field5333 == 40) {
            class131.method1013(-65, new class1(class285.field4446.method935(class322.field5049.field1470, -89, "overlay2")));
            class344.field5333 = 50;
            class166.method1241(2);
        } else if (class344.field5333 == 50) {
            class122.method978(new class1(class285.field4446.method935(class322.field5049.field1470, -111, "loc")), 29956);
            class344.field5333 = 60;
            class117.method920(true, 25);
            class166.method1241(2);
        } else if (class344.field5333 == 60) {
            if (class285.field4446.method943(true, class322.field5049.field1470 + "_labels")) {
                if (!class285.field4446.method951(0, class322.field5049.field1470 + "_labels")) {
                    return;
                }
                class62.field903 = class327.method2300(class285.field4446, true, class322.field5049.field1470 + "_labels");
            } else {
                class62.field903 = new class109(0);
            }
            class344.field5333 = 70;
            class166.method1241(2);
        } else if (class344.field5333 == 70) {
            class306.field4857 = new class132(11, true, class334.field5197);
            class344.field5333 = 73;
            class117.method920(true, 25);
            class166.method1241(2);
        } else if (class344.field5333 == 73) {
            class41.field635 = new class132(12, true, class334.field5197);
            class344.field5333 = 76;
            class117.method920(true, 25);
            class166.method1241(2);
        } else if (class344.field5333 == 76) {
            class331.field5165 = new class132(14, true, class334.field5197);
            class344.field5333 = 79;
            class117.method920(true, 25);
            class166.method1241(2);
        } else if (class344.field5333 == 79) {
            class3.field102 = new class132(17, true, class334.field5197);
            class344.field5333 = 82;
            class117.method920(true, 25);
            class166.method1241(2);
        } else if (class344.field5333 == 82) {
            class151.field2487 = new class132(19, true, class334.field5197);
            class344.field5333 = 85;
            class117.method920(true, 25);
            class166.method1241(2);
        } else if (class344.field5333 == 85) {
            class10.field234 = new class132(22, true, class334.field5197);
            class344.field5333 = 88;
            class117.method920(true, 25);
            class166.method1241(2);
        } else if (class344.field5333 == 88) {
            class340.field5255 = new class132(26, true, class334.field5197);
            class344.field5333 = 91;
            class117.method920(true, 25);
            class166.method1241(2);
        } else {
            class108.field1764 = new class132(30, true, class334.field5197);
            class344.field5333 = 100;
            class117.method920(true, 25);
            class166.method1241(2);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 493)
    public static void method1827(boolean arg0) {
        field3915 = null;
        if (arg0) {
            method1827(false);
        }
        field3899 = null;
        field3909 = null;
        field3901 = null;
        field3914 = (boolean[][]) null;
        field3904 = null;
    }
}
