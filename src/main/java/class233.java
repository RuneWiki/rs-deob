import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class233 extends class200 {

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "Lid;")
    private static class149 field4095 = class60.method382("green:", (byte) 42);

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "[S")
    public static short[] field4102 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "Lid;")
    public static class149 field4108 = field4095;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "Lid;")
    public static class149 field4109 = field4095;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "Lpc;")
    public static class21 field4097;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "Lal;")
    public static class230 field4104;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "Lal;")
    public static class230 field4107;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "[Lu;")
    private class119[] field4110;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "[Lid;")
    public static class149[] field4105;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field4101;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (arg1 != 55) {
            field4104 = null;
        }
        if (super.field3638.field4887) {
            this.method1569(super.field3638.method1885((byte) 66), arg1 + -55);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([[II)V")
    private final void method1569(int[][] arg0, int arg1) {
        ++field4096;
        int var3 = class137.field2515;
        int var4 = class276.field4934;
        class147.method1007(arg1 ^ -3, arg0);
        class45.method259(class261.field4667, 0, arg1, class191.field3436, (byte) -52);
        if (this.field4110 != null) {
            for (int var5 = 0; var5 < this.field4110.length; ++var5) {
                class119 var6 = this.field4110[var5];
                int var7 = var6.field2045;
                int var8 = var6.field2038;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method186((byte) -41, var3, var4);
                    }
                } else if (var8 < 0) {
                    var6.method187((byte) -36, var3, var4);
                } else {
                    var6.method188(var4, var3, (byte) -67);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
    public static final void method1570(int arg0) {
        ++field4098;
        boolean var1 = true;
        class78.method595(false, 121);
        class277.field4946 = 0;
        for (int var2 = 0; var2 < class103.field1808.length; ++var2) {
            if (~class122.field2153[var2] != 0 && class103.field1808[var2] == null) {
                class103.field1808[var2] = class221.field3874.method1562(-809612665, 0, class122.field2153[var2]);
                if (class103.field1808[var2] == null) {
                    ++class277.field4946;
                    var1 = false;
                }
            }
            if (class118.field2028[var2] != -1 && class82.field1502[var2] == null) {
                class82.field1502[var2] = class221.field3874.method1539((byte) 79, 0, class168.field3123[var2], class118.field2028[var2]);
                if (class82.field1502[var2] == null) {
                    var1 = false;
                    ++class277.field4946;
                }
            }
            if (class170.field3140 != null && class136.field2484[var2] == null && class170.field3140[var2] != -1) {
                class136.field2484[var2] = class221.field3874.method1539((byte) 116, 0, class168.field3123[var2], class170.field3140[var2]);
                if (class136.field2484[var2] == null) {
                    var1 = false;
                    ++class277.field4946;
                }
            }
        }
        if (class199.field3614 == null) {
            if (class283.field5004 != null && class169.field3133.method1532(class237.method1603(new class149[] { class283.field5004.field363, class92.field1636 }, -116), arg0 ^ -30458)) {
                if (class169.field3133.method1529(256, class237.method1603(new class149[] { class283.field5004.field363, class92.field1636 }, -109))) {
                    class199.field3614 = class255.method1760(arg0 ^ -18023, class237.method1603(new class149[] { class283.field5004.field363, class92.field1636 }, -128), class169.field3133);
                } else {
                    ++class277.field4946;
                    var1 = false;
                }
            } else {
                class199.field3614 = new class278(0);
            }
        }
        if (!var1) {
            class175.field3213 = 1;
        } else {
            class57.field1003 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class103.field1808.length < ~var4; ++var4) {
                byte[] var20 = class82.field1502[var4];
                if (var20 != null) {
                    int var21 = (class267.field4761[var4] & 255) * 64 + -class115.field1969;
                    int var22 = (class267.field4761[var4] >> 8) * 64 + -class125.field2199;
                    if (class104.field1819) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class206.method1409(var22, var20, 6685, var21);
                }
            }
            if (!var3) {
                class175.field3213 = 2;
            } else {
                if (arg0 != -30458) {
                    field4107 = null;
                }
                if (~class175.field3213 != -1) {
                    class73.method471(class237.method1603(new class149[] { class3.field39, class191.field3425 }, arg0 ^ 30338), true, (byte) -60);
                }
                boolean var5 = false;
                class279.method1923(64);
                class200.method1371(-18131);
                class196.method1344(4, 104, 104, 25, var5);
                for (int var6 = 0; var6 < 4; ++var6) {
                    class228.field3989[var6].method753(arg0 ^ -30417);
                }
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    for (int var18 = 0; ~var18 > -105; ++var18) {
                        for (int var19 = 0; var19 < 104; ++var19) {
                            class69.field1215[var7][var18][var19] = 0;
                        }
                    }
                }
                class273.method1893(false, 24077);
                class279.method1923(arg0 ^ -30394);
                System.gc();
                class78.method595(true, 97);
                class47.method295(false, arg0 + 30336);
                if (!class104.field1819) {
                    class276.method1905((byte) -7, false);
                    class78.method595(true, -126);
                    class140.method984(true, false);
                    if (class136.field2484 != null) {
                        class73.method470(63);
                    }
                }
                if (class104.field1819) {
                    class6.method34(false, 99);
                    class78.method595(true, 99);
                    class283.method1944((byte) -50, false);
                }
                class200.method1371(-18131);
                class78.method595(true, arg0 ^ -30373);
                class230.method1543(128, class228.field3989, false);
                class78.method595(true, -125);
                int var8 = class183.field3305;
                if (var8 > class277.field4948) {
                    var8 = class277.field4948;
                }
                if (var8 < class277.field4948 + -1) {
                    int var9 = class277.field4948 + -1;
                }
                if (!class123.method869(true)) {
                    class93.method677(class183.field3305);
                } else {
                    class93.method677(0);
                }
                class82.method614(8428);
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        class76.method557(72, var17, var10);
                    }
                }
                class224.method1505(512);
                class279.method1923(64);
                class161.method1176(true);
                class200.method1371(-18131);
                if (class69.field1203 != null && class164.field3047 != null && class107.field1845 == 25) {
                    class208.field3720.method162(2, 20);
                    class208.field3720.method517(1057001181, 126);
                    ++class268.field4795;
                }
                if (!class104.field1819) {
                    int var11 = (class141.field2600 + -6) / 8;
                    int var12 = (class141.field2600 - -6) / 8;
                    int var13 = (class277.field4953 + -6) / 8;
                    int var14 = (class277.field4953 - -6) / 8;
                    for (int var15 = var11 + -1; var12 + 1 >= var15; ++var15) {
                        for (int var16 = var13 + -1; var14 - -1 >= var16; ++var16) {
                            if (var15 < var11 || var15 > var12 || ~var16 > ~var13 || ~var14 > ~var16) {
                                class221.field3874.method1533(class237.method1603(new class149[] { class277.field4950, class211.method1434(var15, true), class63.field1125, class211.method1434(var16, true) }, -113), (byte) -123);
                                class221.field3874.method1533(class237.method1603(new class149[] { class71.field1244, class211.method1434(var15, true), class63.field1125, class211.method1434(var16, true) }, arg0 + 30352), (byte) -128);
                            }
                        }
                    }
                }
                if (class107.field1845 == 28) {
                    class50.method329(-11461, 10);
                } else {
                    class50.method329(-11461, 30);
                    if (class164.field3047 != null) {
                        class208.field3720.method162(2, 110);
                    }
                }
                class276.method1908(0);
                class279.method1923(64);
                class182.method1266(arg0 ^ -7046);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field4099;
        if (!arg1) {
            this.method26(-7, (byte) -106);
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field3641 = ~arg0.method489((byte) 90) == -2;
                return;
            }
        } else {
            this.field4110 = new class119[arg0.method489((byte) 118)];
            for (int var4 = 0; ~this.field4110.length < ~var4; ++var4) {
                int var5 = arg0.method489((byte) 108);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field4110[var4] = class200.method1370(arg0, (byte) -121);
                            }
                        } else {
                            this.field4110[var4] = class73.method474(arg0, 0);
                        }
                    } else {
                        this.field4110[var4] = class138.method962(64, arg0);
                    }
                } else {
                    this.field4110[var4] = class268.method1870(arg0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILid;Lgd;)I")
    public static final int method1571(int arg0, class149 arg1, class74 arg2) {
        if (arg0 >= -60) {
            method1572(-7);
        }
        ++field4100;
        int var3 = arg2.field1340;
        byte[] var4 = arg1.method1040(false);
        arg2.method508((byte) 63, var4.length);
        arg2.field1340 += class10.field136.method929(0, var4.length, arg2.field1321, arg2.field1340, var4, -121);
        return arg2.field1340 - var3;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public static void method1572(int arg0) {
        field4104 = null;
        field4102 = null;
        field4105 = null;
        field4109 = null;
        field4107 = null;
        field4095 = null;
        if (arg0 != 32154) {
            field4102 = null;
        }
        field4097 = null;
        field4108 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        ++field4103;
        int[][] var3 = super.field3632.method965(arg1, 77);
        if (super.field3632.field2550) {
            int var4 = class276.field4934;
            int var5 = class137.field2515;
            int[][][] var6 = super.field3632.method969((byte) -18);
            int[][] var7 = new int[var4][var5];
            this.method1569(var7, 0);
            for (int var8 = 0; ~var8 > ~class276.field4934; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class137.field2515 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class136.method953(4080, var15 << 4);
                    var12[var14] = class136.method953(var15 >> 4, 4080);
                    var11[var14] = class136.method953(16711680, var15) >> 12;
                }
            }
        }
        if (!arg0) {
            this.method26(68, (byte) -56);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class233() {
        super(0, true);
    }
}
