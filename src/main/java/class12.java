import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class12 extends class170 {

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    private int field388 = 4;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    private int field392 = 4;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[I", line = 5)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            method93(true, (class127[]) null, (class127[]) null, (class127[]) null, (class314) null, (class127[]) null, (class231[]) null);
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int var4 = field390 / this.field392;
            int var5 = class185.field3225 / this.field388;
            int[] var6;
            if (var4 <= 0) {
                var6 = this.method1142((byte) 44, 0, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method1142((byte) 44, 0, field390 * var7 / var4);
            }
            for (int var8 = 0; var8 < class185.field3225; var8++) {
                if (var5 > 0) {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class185.field3225 * var9 / var5];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        field387++;
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILbg;B)V", line = 75)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            return;
        }
        field385++;
        if (arg0 == 0) {
            this.field388 = arg1.method1325(7627);
        } else if (arg0 == 1) {
            this.field392 = arg1.method1325(arg2 ^ 0x1DC6);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 112)
    public static final void method92(boolean arg0) {
        field393++;
        if (class254.field4382 == 0 || class254.field4382 == 5) {
            return;
        }
        if (arg0) {
            field389 = -105;
        }
        try {
            if ((++class132.field2290) > 2000) {
                if (class121.field2041 != null) {
                    class121.field2041.method1229(false);
                    class121.field2041 = null;
                }
                if (class261.field4532 >= 1) {
                    class77.field1413 = -5;
                    class254.field4382 = 0;
                    return;
                }
                class254.field4382 = 1;
                class261.field4532++;
                if (class53.field1028 == class303.field5127) {
                    class53.field1028 = class203.field3592;
                } else {
                    class53.field1028 = class303.field5127;
                }
                class132.field2290 = 0;
            }
            if (class254.field4382 == 1) {
                class118.field1994 = class288.field4925.method1902(57, class241.field4137, class53.field1028);
                class254.field4382 = 2;
            }
            if (class254.field4382 == 2) {
                if (class118.field1994.field560 == 2) {
                    throw new IOException();
                }
                if (class118.field1994.field560 != 1) {
                    return;
                }
                class121.field2041 = new class180((Socket) class118.field1994.field562, class288.field4925);
                class118.field1994 = null;
                long var1 = class306.field5211 = class273.field4736.method819((byte) 108);
                class71.field1320.field3380 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class71.field1320.method1352(7528, 14);
                class71.field1320.method1352(7528, var3);
                class121.field2041.method1228(class71.field1320.field3417, 0, false, 2);
                if (class257.field4412 != null) {
                    class257.field4412.method1676(-6244);
                }
                if (class310.field5264 != null) {
                    class310.field5264.method1676(-6244);
                }
                int var4 = class121.field2041.method1231(-1);
                if (class257.field4412 != null) {
                    class257.field4412.method1676(-6244);
                }
                if (class310.field5264 != null) {
                    class310.field5264.method1676(-6244);
                }
                if (var4 != 0) {
                    class254.field4382 = 0;
                    class77.field1413 = var4;
                    class121.field2041.method1229(arg0);
                    class121.field2041 = null;
                    return;
                }
                class254.field4382 = 3;
            }
            if (class254.field4382 == 3) {
                if (class121.field2041.method1230((byte) -114) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class121.field2041.method1227(class54.field1051.field3417, (byte) -81, 0, 8);
                class54.field1051.field3380 = 0;
                class61.field1139 = class54.field1051.method1321(20169);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class61.field1139 >> 32);
                var5[3] = (int) class61.field1139;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class71.field1320.field3380 = 0;
                class71.field1320.method1352(7528, 10);
                class71.field1320.method1337(-120, var5[0]);
                class71.field1320.method1337(-98, var5[1]);
                class71.field1320.method1337(-52, var5[2]);
                class71.field1320.method1337(-83, var5[3]);
                class71.field1320.method1344(109, class273.field4736.method819((byte) 118));
                class71.field1320.method1343((byte) 66, class273.field4728);
                class71.field1320.method1305((byte) -116, class143.field2446, class9.field195);
                class289.field4933.field3380 = 0;
                if (class105.field1799 == 40) {
                    class289.field4933.method1352(7528, 18);
                } else {
                    class289.field4933.method1352(7528, 16);
                }
                class289.field4933.method1324((class71.field1320.field3380 + class306.method2093(class221.field3890, -1)) + 154, 15803);
                class289.field4933.method1337(-95, 516);
                class289.field4933.method1352(7528, class173.field3024);
                class289.field4933.method1352(7528, class268.field4645 ? 1 : 0);
                class289.field4933.method1352(7528, 1);
                class289.field4933.method1352(7528, class166.method1089(2));
                class289.field4933.method1324(class199.field3465, 15803);
                class289.field4933.method1324(class16.field420, 15803);
                class145.method971(class289.field4933, (byte) -19);
                class289.field4933.method1343((byte) 66, class221.field3890);
                class289.field4933.method1337(-104, class36.field743);
                class289.field4933.method1337(-88, class82.method525(0));
                class183.field3204 = true;
                class289.field4933.method1324(class298.field5082, 15803);
                class289.field4933.method1337(-107, class234.field4035.method2169((byte) 119));
                class289.field4933.method1337(-103, class248.field4267.method2169((byte) 120));
                class289.field4933.method1337(-42, class130.field2278.method2169((byte) 117));
                class289.field4933.method1337(-55, class129.field2252.method2169((byte) 117));
                class289.field4933.method1337(-128, class143.field2439.method2169((byte) 126));
                class289.field4933.method1337(-113, class288.field4924.method2169((byte) 116));
                class289.field4933.method1337(-115, class162.field2765.method2169((byte) 114));
                class289.field4933.method1337(-60, class147.field2539.method2169((byte) 111));
                class289.field4933.method1337(-124, class4.field74.method2169((byte) 114));
                class289.field4933.method1337(-75, class211.field3734.method2169((byte) 119));
                class289.field4933.method1337(-95, class108.field1829.method2169((byte) 117));
                class289.field4933.method1337(-70, class104.field1781.method2169((byte) 115));
                class289.field4933.method1337(-85, class311.field5266.method2169((byte) 124));
                class289.field4933.method1337(-45, class107.field1822.method2169((byte) 114));
                class289.field4933.method1337(-89, class259.field4481.method2169((byte) 111));
                class289.field4933.method1337(-80, class96.field1611.method2169((byte) 116));
                class289.field4933.method1337(-56, class262.field4551.method2169((byte) 113));
                class289.field4933.method1337(-43, class294.field5037.method2169((byte) 116));
                class289.field4933.method1337(-101, class167.field2881.method2169((byte) 124));
                class289.field4933.method1337(-81, class173.field3062.method2169((byte) 111));
                class289.field4933.method1337(-60, class155.field2675.method2169((byte) 118));
                class289.field4933.method1337(-78, class77.field1416.method2169((byte) 111));
                class289.field4933.method1337(-61, class206.field3628.method2169((byte) 122));
                class289.field4933.method1337(-90, class188.field3258.method2169((byte) 122));
                class289.field4933.method1337(-53, class38.field770.method2169((byte) 115));
                class289.field4933.method1337(-51, class86.field1505.method2169((byte) 122));
                class289.field4933.method1337(-56, class257.field4432.method2169((byte) 114));
                class289.field4933.method1303((byte) 61, class71.field1320.field3380, 0, class71.field1320.field3417);
                class121.field2041.method1228(class289.field4933.field3417, 0, false, class289.field4933.field3380);
                class71.field1320.method563(-101, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class54.field1051.method563(-115, var5);
                class254.field4382 = 4;
            }
            if (class254.field4382 == 4) {
                if (class121.field2041.method1230((byte) 69) < 1) {
                    return;
                }
                int var7 = class121.field2041.method1231(-1);
                if (var7 == 21) {
                    class254.field4382 = 7;
                } else if (var7 == 29) {
                    class254.field4382 = 10;
                } else if (var7 == 1) {
                    class254.field4382 = 5;
                    class77.field1413 = var7;
                    return;
                } else if (var7 == 2) {
                    class254.field4382 = 8;
                } else if (var7 == 15) {
                    class254.field4382 = 0;
                    class77.field1413 = var7;
                    return;
                } else if (var7 == 23 && class261.field4532 < 1) {
                    class132.field2290 = 0;
                    class254.field4382 = 1;
                    class261.field4532++;
                    class121.field2041.method1229(false);
                    class121.field2041 = null;
                    return;
                } else {
                    class77.field1413 = var7;
                    class254.field4382 = 0;
                    class121.field2041.method1229(arg0);
                    class121.field2041 = null;
                    return;
                }
            }
            if (class254.field4382 == 6) {
                class71.field1320.field3380 = 0;
                class71.field1320.method570(17, -1);
                class121.field2041.method1228(class71.field1320.field3417, 0, arg0, class71.field1320.field3380);
                class254.field4382 = 4;
                return;
            }
            if (class254.field4382 == 7) {
                if (class121.field2041.method1230((byte) 69) >= 1) {
                    class268.field4641 = class121.field2041.method1231(-1) * 60 + 180;
                    class77.field1413 = 21;
                    class254.field4382 = 0;
                    class121.field2041.method1229(arg0);
                    class121.field2041 = null;
                    return;
                }
                return;
            }
            if (class254.field4382 == 10) {
                if (class121.field2041.method1230((byte) -128) >= 1) {
                    class82.field1468 = class121.field2041.method1231(-1);
                    class254.field4382 = 0;
                    class77.field1413 = 29;
                    class121.field2041.method1229(arg0);
                    class121.field2041 = null;
                    return;
                }
                return;
            }
            if (class254.field4382 == 8) {
                if (class121.field2041.method1230((byte) -91) < 12) {
                    return;
                }
                class121.field2041.method1227(class54.field1051.field3417, (byte) -81, 0, 12);
                class54.field1051.field3380 = 0;
                class226.field3943 = class54.field1051.method1325(7627);
                class112.field1866 = class54.field1051.method1325(7627);
                class191.field3311 = class54.field1051.method1325(7627);
                if (!class268.field4645) {
                    if (class191.field3311 == 1) {
                        try {
                            class173.field3018.method843(true, class288.field4925.field4677);
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class292.field4991.method843(true, class288.field4925.field4677);
                        } catch (Throwable var11) {
                        }
                    }
                }
                class208.field3681 = class54.field1051.method1325(7627);
                class211.field3741 = class54.field1051.method1325(7627) == 1;
                class104.field1780 = class54.field1051.method1308(-118);
                class239.field4084 = class54.field1051.method1325(7627) == 1;
                class170.field2961 = class54.field1051.method1325(7627) == 1;
                class200.method1385((byte) -109, class170.field2961);
                class190.method1275(class170.field2961, -108);
                class298.field5086 = class54.field1051.method566((byte) -70);
                class102.field1749 = class54.field1051.method1308(-39);
                class254.field4382 = 9;
            }
            if (class254.field4382 == 9) {
                if (class121.field2041.method1230((byte) -121) >= class102.field1749) {
                    class54.field1051.field3380 = 0;
                    class121.field2041.method1227(class54.field1051.field3417, (byte) -81, 0, class102.field1749);
                    class254.field4382 = 0;
                    class77.field1413 = 2;
                    class143.method951(123);
                    class164.field2825 = -1;
                    class57.method382(-82, false);
                    class298.field5086 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class121.field2041 != null) {
                class121.field2041.method1229(false);
                class121.field2041 = null;
            }
            if (class261.field4532 >= 1) {
                class77.field1413 = -4;
                class254.field4382 = 0;
            } else {
                class132.field2290 = 0;
                class254.field4382 = 1;
                if (class53.field1028 == class303.field5127) {
                    class53.field1028 = class203.field3592;
                } else {
                    class53.field1028 = class303.field5127;
                }
                class261.field4532++;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[[I", line = 489)
    public final int[][] method62(int arg0, int arg1) {
        field386++;
        int var3 = 116 % ((-arg1 - 24) / 46);
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int var5 = field390 / this.field392;
            int var6 = class185.field3225 / this.field388;
            int[][] var7;
            if (var5 <= 0) {
                var7 = this.method1139(0, 0, 0);
            } else {
                int var8 = arg0 % var5;
                var7 = this.method1139(0, field390 * var8 / var5, 0);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; var15 < class185.field3225; var15++) {
                int var17;
                if (var6 > 0) {
                    int var16 = var15 % var6;
                    var17 = class185.field3225 * var16 / var6;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var11[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 593)
    public class12() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z[Lvd;[Lvd;[Lvd;Ldj;[Lvd;[Lqg;)V", line = 564)
    public static final void method93(boolean arg0, class127[] arg1, class127[] arg2, class127[] arg3, class314 arg4, class127[] arg5, class231[] arg6) {
        field391++;
        class204.field3602 = arg1;
        class110.field1860 = arg6;
        if (arg0) {
            method93(true, (class127[]) null, (class127[]) null, (class127[]) null, (class314) null, (class127[]) null, (class231[]) null);
        }
        class242.field4139 = arg3;
        class254.field4377 = arg2;
        class278.field4795 = arg5;
        class115.field1944 = arg4;
        class102.field1741.method2025((byte) -97);
        int var7 = class115.field1944.method2142(1, class129.field2258);
        int[] var8 = class115.field1944.method2145(var7, 0);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class102.field1741.method2029((byte) -34, class205.method1418(new class194(class115.field1944.method2155(var8[var9], var7, (byte) 70)), 0));
        }
    }
}
