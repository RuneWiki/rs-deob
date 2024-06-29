import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class229 extends class220 {

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field3977 = -1;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "[I")
    public static int[] field3988 = new int[99];

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "Lmh;")
    public static class128 field3995 = class22.method156(125, "huffman");

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "[I")
    public static int[] field3993 = new int[256];

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "Lmh;")
    public class128 field3991;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V", line = 5)
    public static void method1565(byte arg0) {
        field3995 = null;
        field3988 = null;
        field3993 = null;
        if (arg0 < 124) {
            field3995 = (class128) null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3988[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V", line = 23)
    public final void method1566(byte arg0) {
        field3984++;
        this.field3876 = class71.method470(true) + 500L | this.field3876 & Long.MIN_VALUE;
        class308.field5235.method1046(0, this);
        if (arg0 != -3) {
            this.method1574(-118);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIZI)V", line = 37)
    public static final void method1567(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        for (class3 var5 = (class3) class232.field4006.method2024(0); var5 != null; var5 = (class3) class232.field4006.method2027(1211754408)) {
            class226.method1558(arg2, (byte) -87, var5, arg1, arg0, arg4);
        }
        for (class3 var6 = (class3) class63.field1195.method2024(0); var6 != null; var6 = (class3) class63.field1195.method2027(1211754408)) {
            byte var7 = 1;
            if (var6.field51.field482 == var6.field51.field474) {
                var7 = 0;
            } else if (var6.field51.field474 == var6.field51.field449) {
                var7 = 2;
            }
            if (var6.field58 != var7) {
                int var8 = class32.method233(var6.field51, -128);
                if (var6.field46 != var8) {
                    if (var6.field52 != null) {
                        class188.field3260.method393(var6.field52);
                        var6.field52 = null;
                    }
                    var6.field46 = var8;
                }
                var6.field58 = var7;
            }
            var6.field40 = var6.field51.field478;
            var6.field59 = var6.field51.field478 + (var6.field51.method118(-1) * 64);
            var6.field67 = var6.field51.field418;
            var6.field63 = var6.field51.field418 + (var6.field51.method118(-1) * 64);
            class226.method1558(arg2, (byte) -36, var6, arg1, arg0, arg4);
        }
        if (!arg3) {
            field3995 = (class128) null;
        }
        field3986++;
        for (class3 var9 = (class3) class203.field3585.method729(-118); var9 != null; var9 = (class3) class203.field3585.method732(1)) {
            byte var10 = 1;
            if (var9.field42.field482 == var9.field42.field474) {
                var10 = 0;
            } else if (var9.field42.field474 == var9.field42.field449) {
                var10 = 2;
            }
            if (var9.field58 != var10) {
                int var11 = class7.method45(var9.field42, -120);
                if (var9.field46 != var11) {
                    if (var9.field52 != null) {
                        class188.field3260.method393(var9.field52);
                        var9.field52 = null;
                    }
                    var9.field46 = var11;
                }
                var9.field58 = var10;
            }
            var9.field40 = var9.field42.field478;
            var9.field59 = var9.field42.field478 + (var9.field42.method118(-1) * 64);
            var9.field67 = var9.field42.field418;
            var9.field63 = var9.field42.field418 + var9.field42.method118(-1) * 64;
            class226.method1558(arg2, (byte) 126, var9, arg1, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)I", line = 137)
    public final int method1568(int arg0) {
        if (arg0 >= -94) {
            method1572(-125, 3, -58);
        }
        field3979++;
        return (int) this.field4915;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V", line = 150)
    public static final void method1569(byte arg0) {
        field3982++;
        class57.field1101 = 0;
        int var1 = (class163.field2796.field478 >> 7) + class221.field3889;
        int var2 = (class163.field2796.field418 >> 7) + class4.field72;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class57.field1101 = 1;
        }
        if (arg0 != 121) {
            method1569((byte) 10);
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class57.field1101 = 1;
        }
        if (class57.field1101 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class57.field1101 = 0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I", line = 190)
    public static final int method1570(int arg0, int arg1) {
        field3978++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        if (arg1 != 7283) {
            field3988 = (int[]) null;
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(B)I", line = 207)
    public final int method1571(byte arg0) {
        field3996++;
        return arg0 == -17 ? (int) (this.field4915 >>> 32 & 0xFFL) : 108;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lom;", line = 218)
    public static final class65 method1572(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2571;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V", line = 235)
    public static final void method1573(int arg0) {
        field3985++;
        class192.method1287((byte) -76, false);
        class97.field1670 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class8.field183.length; var2++) {
            if (class175.field3099[var2] != -1 && class8.field183[var2] == null) {
                class8.field183[var2] = class288.field4924.method2155(0, class175.field3099[var2], (byte) 70);
                if (class8.field183[var2] == null) {
                    class97.field1670++;
                    var1 = false;
                }
            }
            if (class56.field1079[var2] != -1 && class38.field810[var2] == null) {
                class38.field810[var2] = class288.field4924.method2167(false, 0, class144.field2461[var2], class56.field1079[var2]);
                if (class38.field810[var2] == null) {
                    class97.field1670++;
                    var1 = false;
                }
            }
            if (class247.field4247) {
                if (class189.field3283[var2] != -1 && class77.field1422[var2] == null) {
                    class77.field1422[var2] = class288.field4924.method2155(0, class189.field3283[var2], (byte) 70);
                    if (class77.field1422[var2] == null) {
                        var1 = false;
                        class97.field1670++;
                    }
                }
                if (class128.field2177[var2] != -1 && class52.field1025[var2] == null) {
                    class52.field1025[var2] = class288.field4924.method2155(0, class128.field2177[var2], (byte) 70);
                    if (class52.field1025[var2] == null) {
                        class97.field1670++;
                        var1 = false;
                    }
                }
            }
            if (class285.field4890 != null && class34.field733[var2] == null && class285.field4890[var2] != -1) {
                class34.field733[var2] = class288.field4924.method2167(false, 0, class144.field2461[var2], class285.field4890[var2]);
                if (class34.field733[var2] == null) {
                    class97.field1670++;
                    var1 = false;
                }
            }
        }
        if (class144.field2470 == null) {
            if (class297.field5065 == null || !class188.field3258.method2150((byte) -105, class28.method177((byte) -95, new class128[] { class297.field5065.field4130, class3.field61 }))) {
                class144.field2470 = new class54(0);
            } else if (class188.field3258.method2159(class28.method177((byte) -91, new class128[] { class297.field5065.field4130, class3.field61 }), (byte) -81)) {
                class144.field2470 = class106.method655(class28.method177((byte) -97, new class128[] { class297.field5065.field4130, class3.field61 }), 127, class188.field3258);
            } else {
                class97.field1670++;
                var1 = false;
            }
        }
        if (!var1) {
            class130.field2272 = 1;
            return;
        }
        class121.field2046 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class8.field183.length; var4++) {
            byte[] var5 = class38.field810[var4];
            if (var5 != null) {
                int var6 = (class226.field3949[var4] >> 8) * 64 - class221.field3889;
                int var7 = (class226.field3949[var4] & 0xFF) * 64 - class4.field72;
                if (class303.field5129) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class170.method1141(var7, var6, (byte) -116, var5);
            }
            if (class247.field4247) {
                byte[] var8 = class52.field1025[var4];
                if (var8 != null) {
                    int var9 = (class226.field3949[var4] >> 8) * 64 - class221.field3889;
                    int var10 = (class226.field3949[var4] & 0xFF) * 64 - class4.field72;
                    if (class303.field5129) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class170.method1141(var10, var9, (byte) -11, var8);
                }
            }
        }
        if (!var3) {
            class130.field2272 = 2;
            return;
        }
        if (class130.field2272 != 0) {
            class309.method2107(class28.method177((byte) -65, new class128[] { class32.field706, class309.field5254 }), true, -23465);
        }
        class218.method1503(false);
        boolean var11 = false;
        class248.method1726(16);
        if (class247.field4247 && class240.field4101) {
            for (int var12 = 0; var12 < class8.field183.length; var12++) {
                if (class52.field1025[var12] != null || class77.field1422[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class308.method2100(4, 104, 104, class247.field4247 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class180.field3158[var13].method1727((byte) 59);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class301.field5117[var14][var15][var16] = 0;
                }
            }
        }
        class30.method218(false, (byte) -42);
        if (class247.field4247) {
            class312.field5276.method812();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class312.field5275[var17][var18].field1729 = true;
                }
            }
        }
        if (class247.field4247) {
            class46.method316();
        }
        if (class247.field4247) {
            class11.method91(false);
        }
        class218.method1503(false);
        System.gc();
        class192.method1287((byte) 119, true);
        class104.method641(false, 113);
        if (!class303.field5129) {
            class72.method475(arg0 - 130, false);
            class192.method1287((byte) -82, true);
            if (class247.field4247) {
                int var19 = class163.field2796.field450[0] >> 3;
                int var20 = class163.field2796.field422[0] >> 3;
                class254.method1799(var19, (byte) 94, var20);
            }
            class159.method1057(false, -107);
            if (class34.field733 != null) {
                class109.method666((byte) -72);
            }
        }
        if (class303.field5129) {
            class26.method167(arg0 + 1, false);
            class192.method1287((byte) 76, true);
            if (class247.field4247) {
                int var21 = class163.field2796.field450[0] >> 3;
                int var22 = class163.field2796.field422[0] >> 3;
                class254.method1799(var21, (byte) 114, var22);
            }
            class257.method1809(false, 17335);
        }
        class248.method1726(16);
        class192.method1287((byte) -102, true);
        class275.method1934(false, arg0 - 1125844510, class180.field3158);
        if (class247.field4247) {
            class46.method309();
        }
        class192.method1287((byte) 85, true);
        int var23 = class50.field986;
        if (class133.field2315 < var23) {
            var23 = class133.field2315;
        }
        if (var23 < class133.field2315 - 1) {
            int var24 = class133.field2315 - 1;
        }
        if (class117.method702(true)) {
            class31.method224(0);
        } else {
            class31.method224(class50.field986);
        }
        class256.method1805(false);
        if (class247.field4247 && var11) {
            class156.method1031(true);
            class104.method641(true, 122);
            if (!class303.field5129) {
                class72.method475(arg0 - 129, true);
                class192.method1287((byte) -109, true);
                class159.method1057(true, 11);
            }
            if (class303.field5129) {
                class26.method167(7, true);
                class192.method1287((byte) -108, true);
                class257.method1809(true, 17335);
            }
            class248.method1726(16);
            class192.method1287((byte) 62, true);
            class275.method1934(true, -1125844504, class180.field3158);
            class192.method1287((byte) 100, true);
            class256.method1805(false);
            class156.method1031(false);
        }
        if (class247.field4247) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class312.field5275[var25][var26].method623(class250.field4334[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class155.method1029(var27, var28, -1);
            }
        }
        class152.method1014(arg0 ^ arg0);
        class218.method1503(false);
        class296.method2028(false);
        class248.method1726(16);
        if (class200.field3483 != null && class121.field2041 != null && class105.field1799 == 25) {
            class245.field4180++;
            class71.field1320.method570(175, -1);
            class71.field1320.method1337(arg0 ^ 0xFFFFFFD6, 1057001181);
        }
        if (!class303.field5129) {
            int var29 = (class164.field2825 - 6) / 8;
            int var30 = (class164.field2825 + 6) / 8;
            int var31 = (class51.field1010 + 6) / 8;
            int var32 = (class51.field1010 - 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var32 - 1; var34 <= var31 + 1; var34++) {
                    if (var29 > var33 || var33 > var30 || var34 < var32 || var31 < var34) {
                        class288.field4924.method2156(-9, class28.method177((byte) -128, new class128[] { class266.field4617, class257.method1811(var33, (byte) 85), class170.field2957, class257.method1811(var34, (byte) 67) }));
                        class288.field4924.method2156(120, class28.method177((byte) -77, new class128[] { class261.field4524, class257.method1811(var33, (byte) 5), class170.field2957, class257.method1811(var34, (byte) 65) }));
                    }
                }
            }
        }
        if (class105.field1799 == 28) {
            class298.method2039((byte) -52, 10);
        } else {
            class298.method2039((byte) -52, 30);
            if (class121.field2041 != null) {
                class71.field1320.method570(181, -1);
            }
        }
        class218.method1503(false);
        class265.method1855(32);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(II)V", line = 714)
    public class229(int arg0, int arg1) {
        this.field4915 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V", line = 723)
    public final void method1574(int arg0) {
        this.field3876 |= Long.MIN_VALUE;
        field3992++;
        if (this.method1575(127) == 0L) {
            class6.field117.method1046(arg0 - 3199, this);
        }
        if (arg0 != 3199) {
            this.field3991 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)J", line = 746)
    public final long method1575(int arg0) {
        if (arg0 <= 126) {
            this.field3991 = (class128) null;
        }
        field3989++;
        return Long.MAX_VALUE & this.field3876;
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)V", line = 779)
    public static final void method1576(int arg0) {
        field3990++;
        int var1 = 0;
        if (arg0 != -24999) {
            return;
        }
        while (var1 < class37.field749) {
            int var2 = class39.field839[var1];
            class115 var3 = class201.field3560[var2];
            if (var3 != null) {
                class203.method1410((byte) -49, var3.field1934.field3706, var3);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)Lmh;", line = 806)
    public static final class128 method1577(byte arg0, int arg1) {
        field3994++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class128 var2 = new class128();
        if (arg0 < 125) {
            method1573(102);
        }
        var2.field2181 = 1;
        var2.field2224 = new byte[1];
        var2.field2224[0] = (byte) arg1;
        return var2;
    }
}
