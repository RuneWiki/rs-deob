import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class75 extends class263 {

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    private int field1066 = -1;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "[Laf;")
    public static class122[] field1059 = new class122[30];

    @OriginalMember(owner = "client!og", name = "K", descriptor = "Lfp;")
    public static class437 field1061 = new class437(15, 0, 1, 0);

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "[I")
    public int[] field1057;

    static {
        new class347("Select", "Auswählen", "Sélectionner", "Selecionar");
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)Z", line = 5)
    public final boolean method552(boolean arg0) {
        if (arg0) {
            this.field1055 = -69;
        }
        ++field1062;
        if (this.field1057 != null) {
            return true;
        } else if (this.field1066 >= 0) {
            class319 var2 = class474.field6985 < 0 ? class319.method1992(class446.field6578, this.field1066) : class319.method1994(class446.field6578, class474.field6985, this.field1066);
            var2.method1990();
            this.field1057 = var2.method1987();
            this.field1063 = var2.field4922;
            this.field1055 = var2.field4920;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V", line = 32)
    public final void method398(boolean arg0) {
        ++field1060;
        super.method398(arg0);
        this.field1057 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)[[I", line = 41)
    public int[][] method34(int arg0, byte arg1) {
        ++field1064;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681 && this.method552(false)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class372.field5635 == ~this.field1055 ? arg0 : this.field1055 * arg0 / class372.field5635) * this.field1063;
            if (~class367.field5597 == ~this.field1063) {
                for (int var8 = 0; ~var8 > ~class367.field5597; ++var8) {
                    int var9 = this.field1057[var7++];
                    var6[var8] = class140.method1023(4080, var9 << 4);
                    var5[var8] = class140.method1023(65280, var9) >> 4;
                    var4[var8] = class140.method1023(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; class367.field5597 > var10; ++var10) {
                    int var11 = this.field1063 * var10 / class367.field5597;
                    int var12 = this.field1057[var7 + var11];
                    var6[var10] = class140.method1023(4080, var12 << 4);
                    var5[var10] = class140.method1023(65280, var12) >> 4;
                    var4[var10] = class140.method1023(16711680, var12) >> 12;
                }
            }
        }
        if (arg1 > -45) {
            this.method32(-65, true, (class468) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([SI[Ljava/lang/String;II)V", line = 113)
    public static final void method553(short[] arg0, int arg1, String[] arg2, int arg3, int arg4) {
        ++field1058;
        if (~arg4 > ~arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg4; ~var9 > ~arg1; ++var9) {
                if (var7 == null || arg2[var9] != null && ~(var9 & 1) < ~arg2[var9].compareTo(var7)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var8;
            method553(arg0, var6 + -1, arg2, 105, arg4);
            method553(arg0, arg1, arg2, 94, var6 - -1);
        }
        if (arg3 <= 88) {
            field1069 = -25;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(Z)V", line = 167)
    public static final void method554(boolean arg0) {
        ++field1056;
        if (class130.field1926 != 0 && ~class130.field1926 != -6) {
            try {
                if (++class7.field63 > 2000) {
                    if (class232.field3269 != null) {
                        class232.field3269.method669((byte) 84);
                        class232.field3269 = null;
                    }
                    if (~class34.field472 <= -2) {
                        class130.field1926 = 0;
                        class61.method436(-5, 2000);
                        return;
                    }
                    ++class34.field472;
                    class130.field1926 = 1;
                    class7.field63 = 0;
                    if (class516.field7574 != 2 && ~class516.field7574 != -4) {
                        class107.field1600.field3024 = !class107.field1600.field3024;
                    } else {
                        class141.field2122.field3024 = !class141.field2122.field3024;
                    }
                }
                if (class130.field1926 == 1) {
                    if (class516.field7574 != 2 && class516.field7574 != 3) {
                        class455.field6667 = class25.field375.method832(class107.field1600.field3021, class107.field1600.method1356(-117), 0);
                    } else {
                        class455.field6667 = class25.field375.method832(class141.field2122.field3021, class141.field2122.method1356(-120), 0);
                    }
                    class130.field1926 = 2;
                }
                if (class130.field1926 == 2) {
                    if (class455.field6667.field7848 == 2) {
                        throw new IOException();
                    }
                    if (class455.field6667.field7848 != 1) {
                        return;
                    }
                    class232.field3269 = new class83((Socket) class455.field6667.field7849, class25.field375);
                    class455.field6667 = null;
                    long var1 = class200.field2920 = class123.method915(class368.field5603, (byte) 46);
                    class43.field559.field6830 = 0;
                    int var3 = (int) (31L & var1 >> 16);
                    class43.field559.method2754(class445.field6549.field1866, 5574);
                    class43.field559.method2754(var3, 5574);
                    class232.field3269.method658(14812, 0, 2, class43.field559.field6868);
                    class90.method698(-66);
                    int var4 = class232.field3269.method662(0);
                    class90.method698(-89);
                    if (var4 != 0) {
                        class130.field1926 = 0;
                        class61.method436(var4, 2000);
                        class232.field3269.method669((byte) 57);
                        class232.field3269 = null;
                        class480.method2867(-97);
                        return;
                    }
                    class130.field1926 = 3;
                }
                if (arg0) {
                    field1068 = 121;
                }
                if (class130.field1926 == 3) {
                    if (class232.field3269.method668(-122) < 8) {
                        return;
                    }
                    class232.field3269.method664(class400.field5966.field6868, (byte) 123, 0, 8);
                    class400.field5966.field6830 = 0;
                    class372.field5622 = class400.field5966.method2725(true);
                    class468 var5 = new class468(70);
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class372.field5622 >> 32), (int) class372.field5622 };
                    var5.method2754(10, 5574);
                    var5.method2717(var6[0], 496598568);
                    var5.method2717(var6[1], 496598568);
                    var5.method2717(var6[2], 496598568);
                    var5.method2717(var6[3], 496598568);
                    var5.method2718(class123.method915(class368.field5603, (byte) 46), -54);
                    var5.method2731(class462.field6730, (byte) -104);
                    var5.method2720(class107.field1596, 0, class53.field690);
                    class293 var7 = class43.field559;
                    var7.field6830 = 0;
                    if (class516.field7574 != 2 && class516.field7574 != 3) {
                        var7.method2754(class445.field6554.field1866, 5574);
                        var7.method2777((byte) 74, 0);
                        int var8 = var7.field6830;
                        var7.method2717(595, 496598568);
                        var7.method2754(class251.field3433.field3910, 5574);
                        var7.method2754(class30.field430, 5574);
                        class288.method1779(var7, (byte) 35);
                        var7.method2731(class339.field5232, (byte) -61);
                        var7.method2717(class86.field1357, 496598568);
                        class297.method1848(-256);
                        var7.method2736(-1, 0, var5.field6830, var5.field6868);
                        var7.method2751(-var8 + var7.field6830, (byte) 103);
                    } else {
                        if (class411.field6213 == 12) {
                            var7.method2754(class445.field6553.field1866, 5574);
                        } else {
                            var7.method2754(class445.field6551.field1866, 5574);
                        }
                        var7.method2777((byte) 74, 0);
                        int var9 = var7.field6830;
                        var7.method2717(595, 496598568);
                        var7.method2754(class42.field553, 5574);
                        var7.method2754(class437.method2568(-102), 5574);
                        var7.method2777((byte) 74, class155.field2347);
                        var7.method2777((byte) 74, class413.field6241);
                        var7.method2754(class454.field6661.field993, 5574);
                        class288.method1779(var7, (byte) 44);
                        var7.method2731(class339.field5232, (byte) -46);
                        var7.method2717(class86.field1357, 496598568);
                        class468 var10 = class454.field6661.method1529(0);
                        var7.method2754(var10.field6830, 5574);
                        var7.method2736(-1, 0, var10.field6830, var10.field6868);
                        class273.field4068 = true;
                        var7.method2777((byte) 74, class209.field3019);
                        class297.method1848(-256);
                        var7.method2736(-1, 0, var5.field6830, var5.field6868);
                        var7.method2751(-var9 + var7.field6830, (byte) 122);
                    }
                    class232.field3269.method658(14812, 0, var7.field6830, var7.field6868);
                    var7.method1825((byte) 19, var6);
                    for (int var11 = 0; var11 < 4; ++var11) {
                        var6[var11] += 50;
                    }
                    class400.field5966.method1825((byte) 19, var6);
                    class130.field1926 = 4;
                }
                if (~class130.field1926 == -5) {
                    if (~class232.field3269.method668(-102) > -2) {
                        return;
                    }
                    int var12 = class232.field3269.method662(0);
                    if (~var12 == -22) {
                        class130.field1926 = 7;
                    } else if (var12 != 29) {
                        if (~var12 == -2) {
                            class130.field1926 = 5;
                            class61.method436(var12, 2000);
                            return;
                        }
                        if (~var12 == -3) {
                            class130.field1926 = 8;
                        } else {
                            if (~var12 != -16) {
                                if (~var12 == -24 && class34.field472 < 1) {
                                    class7.field63 = 0;
                                    ++class34.field472;
                                    class130.field1926 = 1;
                                    class232.field3269.method669((byte) 68);
                                    class232.field3269 = null;
                                    return;
                                }
                                class130.field1926 = 0;
                                class61.method436(var12, 2000);
                                class232.field3269.method669((byte) 116);
                                class232.field3269 = null;
                                class480.method2867(-102);
                                return;
                            }
                            class158.field2386 = -2;
                            class130.field1926 = 14;
                        }
                    } else {
                        class130.field1926 = 13;
                    }
                }
                if (class130.field1926 == 6) {
                    class43.field559.field6830 = 0;
                    class43.field559.method1819(false, class445.field6552.field1866);
                    class232.field3269.method658(14812, 0, class43.field559.field6830, class43.field559.field6868);
                    class130.field1926 = 4;
                } else if (~class130.field1926 == -8) {
                    if (~class232.field3269.method668(-108) <= -2) {
                        class263.field3916 = 180 + class232.field3269.method662(0) * 60;
                        class130.field1926 = 0;
                        class61.method436(21, 2000);
                        class232.field3269.method669((byte) 42);
                        class232.field3269 = null;
                        class480.method2867(-112);
                    }
                } else if (~class130.field1926 == -14) {
                    if (~class232.field3269.method668(-114) <= -2) {
                        class446.field6587 = class232.field3269.method662(0);
                        class130.field1926 = 0;
                        class61.method436(29, 2000);
                        class232.field3269.method669((byte) 91);
                        class232.field3269 = null;
                        class480.method2867(-112);
                    }
                } else if (~class130.field1926 == -9) {
                    if (~class232.field3269.method668(-117) <= -2) {
                        class460.field6706 = class232.field3269.method662(0);
                        class130.field1926 = 9;
                    }
                } else {
                    if (class130.field1926 == 9) {
                        if (~class516.field7574 != -4) {
                            class483.field7133 = false;
                        } else {
                            class483.field7133 = true;
                        }
                        class293 var13 = class400.field5966;
                        if (~class516.field7574 != -3 && class516.field7574 != 3) {
                            if (class232.field3269.method668(-100) < class460.field6706) {
                                return;
                            }
                            class232.field3269.method664(var13.field6868, (byte) 110, 0, class460.field6706);
                            var13.field6830 = 0;
                            class234.field3291 = var13.method2765(49);
                            class337.field5195 = var13.method2765(101);
                            class252.field3437 = ~var13.method2765(83) == -2;
                            class488.field7284 = ~var13.method2765(103) == -2;
                            class514.field7516 = var13.method2765(76) == 1;
                            class123.field1871 = var13.method2727((byte) 43);
                            class226.field3195 = class123.field1871 > 0;
                            class411.field6207 = var13.method2727((byte) 43);
                            class161.field2401 = var13.method2727((byte) 43);
                            class378.field5694 = var13.method2727((byte) 43);
                            class170.field2505 = var13.method2722(false);
                            class291.field4361 = class25.field375.method838(class170.field2505, !arg0);
                            class372.field5619 = var13.method2765(116);
                            class22.field329 = var13.method2727((byte) 43);
                            class478.field7044 = var13.method2727((byte) 43);
                            class211.field3036 = ~var13.method2765(57) == -2;
                            class410.field6198.field7063 = class410.field6198.field7064 = var13.method2771((byte) 77);
                            class389.field5857 = new class210();
                            class389.field5857.field3023 = var13.method2727((byte) 43);
                            if (class389.field5857.field3023 == 65535) {
                                class389.field5857.field3023 = -1;
                            }
                            class389.field5857.field3021 = var13.method2771((byte) 77);
                            if (class52.field674 != class5.field47 && class141.field2128 == class141.field2122) {
                                class141.field2122 = class389.field5857;
                            }
                            if (class52.field674 != class149.field2269) {
                                class389.field5857.field3026 = 40000 - -class389.field5857.field3023;
                                class389.field5857.field3025 = 50000 - -class389.field5857.field3023;
                            }
                        } else {
                            if (~class232.field3269.method668(-123) > ~class460.field6706) {
                                return;
                            }
                            class232.field3269.method664(var13.field6868, (byte) 105, 0, class460.field6706);
                            var13.field6830 = 0;
                            class234.field3291 = var13.method2765(125);
                            class337.field5195 = var13.method2765(92);
                            class252.field3437 = ~var13.method2765(96) == -2;
                            class488.field7284 = ~var13.method2765(79) == -2;
                            class514.field7516 = ~var13.method2765(68) == -2;
                            class502.field7405 = ~var13.method2765(120) == -2;
                            class449.field6615 = var13.method2727((byte) 43);
                            class226.field3195 = var13.method2765(101) == 1;
                            class125.field1884 = var13.method2765(54) == 1;
                            if (class516.field7574 == 3) {
                                boolean var14 = ~var13.method2765(92) == -2;
                                if (var14) {
                                    long var15 = var13.method2725(true);
                                    String var17 = class10.method45(var15, (byte) 90);
                                    int var18 = var13.method2765(65);
                                    byte[] var19 = new byte[var18];
                                    var13.method1822(var19, var18, 0, !arg0);
                                    String var20 = class469.method2778(var19, false);
                                    class415 var21 = null;
                                    try {
                                        class533 var22 = class25.field375.method825(0, "3", false);
                                        while (~var22.field7848 == -1) {
                                            class389.method2332(121, 1L);
                                        }
                                        if (~var22.field7848 == -2) {
                                            var21 = (class415) var22.field7849;
                                            int var23 = var17.length() + 3 - (-2 + -var20.length() - 4);
                                            if (var23 > 50) {
                                                throw new RuntimeException(">50");
                                            }
                                            class468 var24 = new class468(var23 + 1);
                                            var24.method2754(var23, 5574);
                                            var24.method2754(0, 5574);
                                            var24.method2713(0, var17);
                                            var24.method2713(0, var20);
                                            var24.method2772((byte) 115);
                                            var21.method2489(0, 0, var24.field6830, var24.field6868);
                                        }
                                    } catch (Exception var33) {
                                    }
                                    try {
                                        if (var21 != null) {
                                            var21.method2485(107);
                                        }
                                    } catch (Exception var31) {
                                    }
                                }
                            }
                            class119.field1824.method254(50, class125.field1884);
                            class164.field2437.method1744((byte) 70, class125.field1884);
                            class373.field5641.method768((byte) 16, class125.field1884);
                        }
                        if ((!class252.field3437 || class514.field7516) && !class226.field3195) {
                            try {
                                class331.method2049(class25.field375.field1611, "unzap", -3460);
                            } catch (Throwable var30) {
                            }
                        } else {
                            try {
                                class331.method2049(class25.field375.field1611, "zap", -3460);
                            } catch (Throwable var32) {
                                if (class526.field7774) {
                                    try {
                                        class25.field375.field1611.getAppletContext().showDocument(new URL(class25.field375.field1611.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var29) {
                                    }
                                }
                            }
                        }
                        if (class52.field674 == class149.field2269) {
                            try {
                                class331.method2049(class25.field375.field1611, "loggedin", -3460);
                            } catch (Throwable var28) {
                            }
                        }
                        if (~class516.field7574 != -3 && ~class516.field7574 != -4) {
                            class130.field1926 = 0;
                            class61.method436(2, 2000);
                            class355.method2140(-50);
                            class526.method3137(6, 2270);
                            class305.field4553 = null;
                            return;
                        }
                        class130.field1926 = 11;
                    }
                    if (class130.field1926 == 11) {
                        if (class232.field3269.method668(-122) < 3) {
                            return;
                        }
                        class232.field3269.method664(class400.field5966.field6868, (byte) 103, 0, 3);
                        class130.field1926 = 12;
                    }
                    if (~class130.field1926 == -13) {
                        class293 var25 = class400.field5966;
                        var25.field6830 = 0;
                        if (var25.method1820(true)) {
                            if (~class232.field3269.method668(-118) > -2) {
                                return;
                            }
                            class232.field3269.method664(var25.field6868, (byte) 103, 3, 1);
                        }
                        class305.field4553 = class455.method2645(0)[var25.method1815(false)];
                        class158.field2386 = var25.method2727((byte) 43);
                        class130.field1926 = 10;
                    }
                    if (~class130.field1926 == -11) {
                        if (~class232.field3269.method668(-110) <= ~class158.field2386) {
                            class232.field3269.method664(class400.field5966.field6868, (byte) 115, 0, class158.field2386);
                            class400.field5966.field6830 = 0;
                            int var26 = class158.field2386;
                            class130.field1926 = 0;
                            class61.method436(2, 2000);
                            class340.method2077(80);
                            class418.method2493(class400.field5966, true);
                            class116.field1743 = -1;
                            class218.method1379(0);
                            if (~class400.field5966.field6830 != ~var26) {
                                throw new RuntimeException("lswp pos:" + class400.field5966.field6830 + " psize:" + var26);
                            } else {
                                class305.field4553 = null;
                            }
                        }
                    } else if (class130.field1926 == 14) {
                        if (~class158.field2386 == 1) {
                            if (~class232.field3269.method668(-119) > -3) {
                                return;
                            }
                            class232.field3269.method664(class400.field5966.field6868, (byte) 96, 0, 2);
                            class400.field5966.field6830 = 0;
                            class158.field2386 = class400.field5966.method2727((byte) 43);
                        }
                        if (~class232.field3269.method668(-106) <= ~class158.field2386) {
                            class232.field3269.method664(class400.field5966.field6868, (byte) 122, 0, class158.field2386);
                            class400.field5966.field6830 = 0;
                            int var27 = class158.field2386;
                            class130.field1926 = 0;
                            class61.method436(15, 2000);
                            class69.method480((byte) -45);
                            class418.method2493(class400.field5966, true);
                            if (~class400.field5966.field6830 != ~var27) {
                                throw new RuntimeException("lswpr pos:" + class400.field5966.field6830 + " psize:" + var27);
                            } else {
                                class305.field4553 = null;
                            }
                        }
                    }
                }
            } catch (IOException var34) {
                if (class232.field3269 != null) {
                    class232.field3269.method669((byte) 62);
                    class232.field3269 = null;
                }
                if (class34.field472 >= 1) {
                    class130.field1926 = 0;
                    class61.method436(-4, 2000);
                    class480.method2867(-94);
                } else {
                    class130.field1926 = 1;
                    ++class34.field472;
                    class7.field63 = 0;
                    if (class516.field7574 != 2 && class516.field7574 != 3) {
                        class107.field1600.field3024 = !class107.field1600.field3024;
                    } else {
                        class141.field2122.field3024 = !class141.field2122.field3024;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 772)
    public class75() {
        super(0, false);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)I", line = 775)
    public final int method555(boolean arg0) {
        if (arg0) {
            field1061 = null;
        }
        ++field1065;
        return this.field1066;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V", line = 798)
    public static void method556(int arg0) {
        field1061 = null;
        if (arg0 != 4508) {
            method554(true);
        }
        field1059 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLgk;)V", line = 818)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (~arg0 == -1) {
            this.field1066 = arg2.method2727((byte) 43);
        }
        if (!arg1) {
            this.field1057 = null;
        }
        ++field1067;
    }
}
