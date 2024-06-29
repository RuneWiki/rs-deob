import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class153 extends class337 {

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    private int field2274 = 0;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    private int field2267 = 0;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    private int field2271 = 1;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "[Lwq;")
    public static class116[] field2265 = new class116[32768];

    @OriginalMember(owner = "client!em", name = "I", descriptor = "Lhp;")
    public static class217 field2272 = new class217(new byte[5000]);

    @OriginalMember(owner = "client!em", name = "O", descriptor = "[Lks;")
    public static class305[] field2278 = new class305[5];

    @OriginalMember(owner = "client!em", name = "J", descriptor = "F")
    public static float field2273;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)V")
    public static final void method1050(byte arg0, int arg1) {
        ++field2276;
        if (arg0 <= 55) {
            method1050((byte) -113, -123);
        }
        class211 var2 = class452.method2749(14, 126, arg1);
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(III)V")
    public static final void method1051(int arg0, int arg1, int arg2) {
        class138 var3 = client.field3311[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field2114 != null) {
                var3.field2114 = null;
            }
            if (var3.field2104 != null) {
                var3.field2104 = null;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
    public static final String method1052(int arg0, int arg1, byte[] arg2, byte arg3) {
        ++field2269;
        if (arg3 != -39) {
            return null;
        } else {
            char[] var4 = new char[arg1];
            int var5 = 0;
            for (int var6 = 0; var6 < arg1; ++var6) {
                int var7 = arg2[arg0 - -var6] & 255;
                if (~var7 != -1) {
                    if (var7 >= 128 && ~var7 > -161) {
                        char var8 = class190.field3210[var7 + -128];
                        if (~var8 == -1) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            return new String(var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            method1055(-90, -111, 2, (class295) null);
        }
        ++field2268;
        int[] var3 = super.field5007.method512(arg0, arg1 + 11);
        if (super.field5007.field687) {
            int var4 = class505.field7381[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class402.field5977 < ~var6; ++var6) {
                int var7 = class109.field1530[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field2274 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field2271 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field2271;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field2267 == 0) {
                    var12 = class60.field716[(var12 & 4091) >> 4] - -4096 >> 1;
                } else if (~this.field2267 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    public static void method1053(boolean arg0) {
        if (!arg0) {
            method1053(true);
        }
        field2265 = null;
        field2272 = null;
        field2278 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 22 / ((82 - arg0) / 40);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field2271 = arg2.method1515((byte) 125);
                }
            } else {
                this.field2267 = arg2.method1515((byte) 122);
            }
        } else {
            this.field2274 = arg2.method1515((byte) 126);
        }
        ++field2275;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V")
    public static final void method1054(boolean arg0) {
        class372.field5543.method93((byte) 95);
        ++field2270;
        class100.field1426.method93((byte) 77);
        if (!arg0) {
            field2272 = null;
        }
        class23.field282.method93((byte) 118);
        class48.field619.method93((byte) 91);
        class202.field3364.method93((byte) 121);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (arg0 < 1) {
            field2278 = null;
        }
        class61.method539((byte) 104);
        ++field2266;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIILad;)V")
    public static final void method1055(int arg0, int arg1, int arg2, class295 arg3) {
        ++field2277;
        if (arg3 != null && class456.field6644.field2077 != arg3) {
            int var4 = arg3.field4497;
            int var5 = arg3.field4493;
            int var6 = arg3.field4498;
            int var7 = (int) arg3.field4494;
            if (var6 >= 2000) {
                var6 -= 2000;
            }
            long var8 = arg3.field4494;
            if (~var6 == -12) {
                class177 var10 = class26.field319[var7];
                if (var10 != null) {
                    class363.field5374 = 0;
                    ++class353.field5233;
                    class407.field6061 = 2;
                    class88.field1266 = arg0;
                    class483.field6940 = arg1;
                    class74.method640(-29627, class315.field4750);
                    class71.field1020.method1539((byte) -106, var7);
                    class71.field1020.method1530(class101.field1456.method1045(82, (byte) 123) ? 1 : 0, (byte) -112);
                    class195.method1362(var10.field1976[0], true, var10.method953(-60), -2, var10.method953(-74), 0, var10.field1978[0], -1, 0);
                }
            }
            if (var6 == 20) {
                class88.field1266 = arg0;
                class363.field5374 = 0;
                class483.field6940 = arg1;
                class407.field6061 = 2;
                ++class36.field397;
                class74.method640(-29627, class356.field5280);
                class71.field1020.method1539((byte) -113, class176.field2613 + var5);
                class71.field1020.method1524(class390.field5842 + var4, arg2 ^ 129);
                class71.field1020.method1524(var7, 128);
                class71.field1020.method1525(-122, class101.field1456.method1045(82, (byte) -112) ? 1 : 0);
                class36.method239(arg2, var4, var5);
            }
            if (~var6 == -1013 || var6 == 1002 || var6 == 1008 || ~var6 == -1012 || ~var6 == -1010) {
                class401.method2512(var4, var6, var7, 1011);
            }
            if (~var6 == -1007) {
                class407.field6061 = 2;
                class363.field5374 = 0;
                class483.field6940 = arg1;
                class88.field1266 = arg0;
                class116 var11 = field2265[var7];
                if (var11 != null) {
                    class37 var12 = var11.field1763;
                    if (var12.field499 != null) {
                        var12 = var12.method256(126, class195.field3271);
                    }
                    if (var12 != null) {
                        ++class78.field1127;
                        class74.method640(arg2 + -29628, class2.field11);
                        class71.field1020.method1542(var12.field500, -2756);
                    }
                }
            }
            if (var6 == 13) {
                class177 var13 = class26.field319[var7];
                if (var13 != null) {
                    class483.field6940 = arg1;
                    class88.field1266 = arg0;
                    ++class396.field5928;
                    class363.field5374 = 0;
                    class407.field6061 = 2;
                    class74.method640(-29627, class223.field3655);
                    class71.field1020.method1508(-128, var7);
                    class71.field1020.method1530(class101.field1456.method1045(82, (byte) 109) ? 1 : 0, (byte) 119);
                    class195.method1362(var13.field1976[0], true, var13.method953(-122), -2, var13.method953(-40), 0, var13.field1978[0], -1, 0);
                }
            }
            if (~var6 == -16) {
                class363.field5374 = 0;
                class88.field1266 = arg0;
                class407.field6061 = 2;
                class483.field6940 = arg1;
                ++class113.field1572;
                class74.method640(-29627, class509.field7457);
                class71.field1020.method1539((byte) -106, class176.field2613 + var5);
                class71.field1020.method1543((byte) 121, class101.field1456.method1045(82, (byte) 121) ? 1 : 0);
                class71.field1020.method1542(var7, arg2 + -2757);
                class71.field1020.method1539((byte) -109, class390.field5842 + var4);
                class36.method239(arg2, var4, var5);
            }
            if (var6 == 12) {
                class116 var14 = field2265[var7];
                if (var14 != null) {
                    ++class434.field6417;
                    class88.field1266 = arg0;
                    class363.field5374 = 0;
                    class407.field6061 = 2;
                    class483.field6940 = arg1;
                    class74.method640(arg2 ^ -29628, class257.field3930);
                    class71.field1020.method1524(var7, 128);
                    class71.field1020.method1525(46, class101.field1456.method1045(82, (byte) -25) ? 1 : 0);
                    class195.method1362(var14.field1976[0], true, var14.method953(-84), -2, var14.method953(-53), 0, var14.field1978[0], arg2 ^ -2, 0);
                }
            }
            if (var6 == 57) {
                class407.field6061 = 2;
                class88.field1266 = arg0;
                ++class447.field6552;
                class483.field6940 = arg1;
                class363.field5374 = 0;
                class74.method640(-29627, class189.field3201);
                class71.field1020.method1539((byte) -118, class176.field2613 + var5);
                class71.field1020.method1524(class390.field5842 + var4, 128);
                class71.field1020.method1542((int) (var8 >>> 32) & Integer.MAX_VALUE, -2756);
                class71.field1020.method1530(class101.field1456.method1045(82, (byte) -17) ? 1 : 0, (byte) -58);
                class455.method2769(var5, var8, var4, arg2 ^ 126);
            }
            if (~var6 == -10) {
                class116 var15 = field2265[var7];
                if (var15 != null) {
                    class483.field6940 = arg1;
                    ++class141.field2133;
                    class407.field6061 = 2;
                    class363.field5374 = 0;
                    class88.field1266 = arg0;
                    class74.method640(-29627, class77.field1121);
                    class71.field1020.method1542(var7, -2756);
                    class71.field1020.method1525(120, !class101.field1456.method1045(82, (byte) -44) ? 0 : 1);
                    class195.method1362(var15.field1976[0], true, var15.method953(-84), -2, var15.method953(-115), 0, var15.field1978[0], -1, 0);
                }
            }
            if (var6 == 19) {
                class116 var16 = field2265[var7];
                if (var16 != null) {
                    ++class75.field1071;
                    class363.field5374 = 0;
                    class88.field1266 = arg0;
                    class483.field6940 = arg1;
                    class407.field6061 = 2;
                    class74.method640(-29627, class261.field4010);
                    class71.field1020.method1542(var7, arg2 + -2757);
                    class71.field1020.method1525(-122, !class101.field1456.method1045(82, (byte) -67) ? 0 : 1);
                    class195.method1362(var16.field1976[0], true, var16.method953(-53), -2, var16.method953(-111), 0, var16.field1978[0], -1, 0);
                }
            }
            if (arg2 == 1) {
                if (var6 == 4) {
                    class407.field6061 = 2;
                    class483.field6940 = arg1;
                    class363.field5374 = 0;
                    class88.field1266 = arg0;
                    ++class60.field714;
                    class74.method640(-29627, class26.field320);
                    class71.field1020.method1542(class176.field2613 + var5, arg2 ^ -2755);
                    class71.field1020.method1508(-128, var7);
                    class71.field1020.method1539((byte) -125, class390.field5842 + var4);
                    class71.field1020.method1545(class101.field1456.method1045(82, (byte) 120) ? 1 : 0, -50);
                    class36.method239(1, var4, var5);
                }
                if (var6 == 21) {
                    class363.field5374 = 0;
                    ++class12.field170;
                    class483.field6940 = arg1;
                    class407.field6061 = 2;
                    class88.field1266 = arg0;
                    class74.method640(-29627, class120.field1807);
                    class71.field1020.method1545(class101.field1456.method1045(82, (byte) -106) ? 1 : 0, -62);
                    class71.field1020.method1508(arg2 ^ -127, class398.field5947.field1881);
                    class71.field1020.method1539((byte) -123, class358.field5318);
                    class71.field1020.method1508(-128, class71.field1028);
                    class71.field1020.method1537((byte) 92, class371.field5524);
                }
                if (~var6 == -19) {
                    class407.field6061 = 2;
                    ++class113.field1571;
                    class88.field1266 = arg0;
                    class363.field5374 = 0;
                    class483.field6940 = arg1;
                    class74.method640(-29627, class63.field767);
                    class71.field1020.method1537((byte) -14, class371.field5524);
                    class71.field1020.method1545(class101.field1456.method1045(82, (byte) 122) ? 1 : 0, -125);
                    class71.field1020.method1524(class358.field5318, 128);
                    class71.field1020.method1539((byte) -120, class71.field1028);
                    class71.field1020.method1524(Integer.MAX_VALUE & (int) (var8 >>> 32), 128);
                    class71.field1020.method1508(arg2 ^ -127, class176.field2613 + var5);
                    class71.field1020.method1539((byte) -107, var4 - -class390.field5842);
                    class455.method2769(var5, var8, var4, 110);
                }
                if (var6 == 48) {
                    class88.field1266 = arg0;
                    class363.field5374 = 0;
                    ++class470.field6788;
                    class483.field6940 = arg1;
                    class407.field6061 = 2;
                    class74.method640(-29627, class208.field3404);
                    class71.field1020.method1525(89, class101.field1456.method1045(82, (byte) -85) ? 1 : 0);
                    class71.field1020.method1524((int) (var8 >>> 32) & Integer.MAX_VALUE, 128);
                    class71.field1020.method1539((byte) -111, class390.field5842 + var4);
                    class71.field1020.method1542(var5 - -class176.field2613, -2756);
                    class455.method2769(var5, var8, var4, 114);
                }
                if (var6 == 44) {
                    class116 var17 = field2265[var7];
                    if (var17 != null) {
                        class88.field1266 = arg0;
                        class363.field5374 = 0;
                        ++class495.field7139;
                        class407.field6061 = 2;
                        class483.field6940 = arg1;
                        class74.method640(-29627, class155.field2303);
                        class71.field1020.method1545(!class101.field1456.method1045(82, (byte) 92) ? 0 : 1, -125);
                        class71.field1020.method1508(-128, var7);
                        class195.method1362(var17.field1976[0], true, var17.method953(-82), -2, var17.method953(-73), 0, var17.field1978[0], -1, 0);
                    }
                }
                if (~var6 == -6) {
                    class363.field5374 = 0;
                    class483.field6940 = arg1;
                    class407.field6061 = 1;
                    class88.field1266 = arg0;
                    ++class265.field4072;
                    class74.method640(-29627, class27.field329);
                    class71.field1020.method1524(class358.field5318, 128);
                    class71.field1020.method1539((byte) -119, class390.field5842 + var4);
                    class71.field1020.method1522(class371.field5524, (byte) 102);
                    class71.field1020.method1542(class71.field1028, -2756);
                    class71.field1020.method1508(-128, class176.field2613 + var5);
                    class195.method1362(var5, true, 1, -4, 1, 0, var4, -1, 0);
                }
                if (var6 == 17) {
                    class177 var18 = class26.field319[var7];
                    if (var18 != null) {
                        class363.field5374 = 0;
                        class407.field6061 = 2;
                        ++class12.field170;
                        class483.field6940 = arg1;
                        class88.field1266 = arg0;
                        class74.method640(-29627, class120.field1807);
                        class71.field1020.method1545(class101.field1456.method1045(82, (byte) -52) ? 1 : 0, arg2 ^ -59);
                        class71.field1020.method1508(-128, var7);
                        class71.field1020.method1539((byte) -115, class358.field5318);
                        class71.field1020.method1508(-128, class71.field1028);
                        class71.field1020.method1537((byte) 110, class371.field5524);
                        class195.method1362(var18.field1976[0], true, var18.method953(-54), -2, var18.method953(arg2 ^ -46), 0, var18.field1978[0], arg2 + -2, 0);
                    }
                }
                if (var6 == 58) {
                    ++class298.field4528;
                    class363.field5374 = 0;
                    class483.field6940 = arg1;
                    class407.field6061 = 2;
                    class88.field1266 = arg0;
                    class74.method640(-29627, class494.field7131);
                    class71.field1020.method1508(-128, class390.field5842 + var4);
                    class71.field1020.method1539((byte) -108, var7);
                    class71.field1020.method1545(class101.field1456.method1045(82, (byte) -18) ? 1 : 0, -50);
                    class71.field1020.method1524(class176.field2613 + var5, 128);
                    class36.method239(1, var4, var5);
                }
                if (var6 == 3) {
                    class114 var19 = class181.method1210(var4, -2, var5);
                    if (var19 != null) {
                        class329.method2090(-1);
                        class386 var20 = client.method1387(var19);
                        class520.method3101(var19, var20.field5802, arg2 + -60, var20.method2410(-16758));
                        class412.field6176 = class260.method1742(var19, (byte) -106);
                        if (class412.field6176 == null) {
                            class412.field6176 = "Null";
                        }
                        class190.field3206 = var19.field1600 + "<col=ffffff>";
                    }
                } else {
                    if (var6 == 10) {
                        class407.field6061 = 2;
                        ++class355.field5257;
                        class483.field6940 = arg1;
                        class88.field1266 = arg0;
                        class363.field5374 = 0;
                        class74.method640(-29627, class158.field2385);
                        class71.field1020.method1542(class358.field5318, arg2 + -2757);
                        class71.field1020.method1539((byte) -107, class71.field1028);
                        class71.field1020.method1539((byte) -108, var7);
                        class71.field1020.method1524(class176.field2613 + var5, arg2 + 127);
                        class71.field1020.method1524(class390.field5842 + var4, 128);
                        class71.field1020.method1543((byte) 86, class101.field1456.method1045(82, (byte) 90) ? 1 : 0);
                        class71.field1020.method1522(class371.field5524, (byte) 82);
                        class36.method239(1, var4, var5);
                    }
                    if (~var6 == -51) {
                        if (class417.field6224 > 0 && class101.field1456.method1045(82, (byte) -25) && class101.field1456.method1045(81, (byte) 91)) {
                            class357.method2245(false, class398.field5947.field5826, class176.field2613 + var5, class390.field5842 - -var4);
                        } else {
                            class363.field5374 = 0;
                            class483.field6940 = arg1;
                            class88.field1266 = arg0;
                            class407.field6061 = 1;
                            ++class10.field143;
                            class74.method640(-29627, class58.field699);
                            class71.field1020.method1508(-128, class176.field2613 + var5);
                            class71.field1020.method1508(-128, class390.field5842 + var4);
                        }
                    }
                    if (var6 == 2 && class226.field3684 == null) {
                        class78.method671(var5, var4, (byte) 48);
                        class226.field3684 = class181.method1210(var4, -2, var5);
                        class262.method1747(20556, class226.field3684);
                    }
                    if (~var6 == -50) {
                        class407.field6061 = 2;
                        ++class258.field3941;
                        class363.field5374 = 0;
                        class483.field6940 = arg1;
                        class88.field1266 = arg0;
                        class74.method640(-29627, class382.field5750);
                        class71.field1020.method1542(class390.field5842 + var4, -2756);
                        class71.field1020.method1539((byte) -115, class176.field2613 + var5);
                        class71.field1020.method1530(!class101.field1456.method1045(82, (byte) 87) ? 0 : 1, (byte) -80);
                        class71.field1020.method1508(-128, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                        class455.method2769(var5, var8, var4, 104);
                    }
                    if (~var6 == -52) {
                        class114 var21 = class181.method1210(var4, -2, var5);
                        if (var21 != null) {
                            class357.method2244(var21, -30951);
                        }
                    }
                    if (~var6 == -46) {
                        class88.field1266 = arg0;
                        class363.field5374 = 0;
                        class483.field6940 = arg1;
                        class407.field6061 = 2;
                        ++class468.field6760;
                        class74.method640(-29627, class185.field2810);
                        class71.field1020.method1539((byte) -103, var7);
                        class71.field1020.method1530(!class101.field1456.method1045(82, (byte) 111) ? 0 : 1, (byte) -80);
                        class71.field1020.method1508(arg2 ^ -127, var5 - -class176.field2613);
                        class71.field1020.method1508(-128, class390.field5842 + var4);
                        class36.method239(1, var4, var5);
                    }
                    if (var6 == 22 || ~var6 == -1008) {
                        class385.method2405(var5, arg3.field4491, (byte) -31, var4, var7);
                    }
                    if (~var6 == -47) {
                        class177 var22 = class26.field319[var7];
                        if (var22 != null) {
                            class483.field6940 = arg1;
                            class88.field1266 = arg0;
                            class407.field6061 = 2;
                            class363.field5374 = 0;
                            ++class223.field3651;
                            class74.method640(-29627, class264.field4066);
                            class71.field1020.method1530(!class101.field1456.method1045(82, (byte) 88) ? 0 : 1, (byte) -63);
                            class71.field1020.method1542(var7, -2756);
                            class195.method1362(var22.field1976[0], true, var22.method953(-80), -2, var22.method953(-37), 0, var22.field1978[0], -1, 0);
                        }
                    }
                    if (var6 == 1004) {
                        ++class231.field3743;
                        class407.field6061 = 2;
                        class88.field1266 = arg0;
                        class483.field6940 = arg1;
                        class363.field5374 = 0;
                        class74.method640(-29627, class500.field7174);
                        class71.field1020.method1542(var7, -2756);
                    }
                    if (var6 == 1003) {
                        class363.field5374 = 0;
                        class483.field6940 = arg1;
                        class88.field1266 = arg0;
                        class407.field6061 = 2;
                        ++class531.field7759;
                        class74.method640(arg2 ^ -29628, class273.field4170);
                        class71.field1020.method1542(var7, arg2 + -2757);
                    }
                    if (~var6 == -26) {
                        class116 var23 = field2265[var7];
                        if (var23 != null) {
                            class483.field6940 = arg1;
                            class407.field6061 = 2;
                            ++class317.field4794;
                            class363.field5374 = 0;
                            class88.field1266 = arg0;
                            class74.method640(-29627, class322.field4827);
                            class71.field1020.method1524(class71.field1028, 128);
                            class71.field1020.method1539((byte) -125, class358.field5318);
                            class71.field1020.method1524(var7, 128);
                            class71.field1020.method1537((byte) 125, class371.field5524);
                            class71.field1020.method1545(class101.field1456.method1045(82, (byte) -116) ? 1 : 0, -88);
                            class195.method1362(var23.field1976[0], true, var23.method953(-45), -2, var23.method953(-62), 0, var23.field1978[0], arg2 ^ -2, 0);
                        }
                    }
                    if (var6 == 23) {
                        class177 var24 = class26.field319[var7];
                        if (var24 != null) {
                            class483.field6940 = arg1;
                            class88.field1266 = arg0;
                            ++class10.field141;
                            class407.field6061 = 2;
                            class363.field5374 = 0;
                            class74.method640(arg2 + -29628, class335.field4995);
                            class71.field1020.method1542(var7, arg2 + -2757);
                            class71.field1020.method1530(!class101.field1456.method1045(82, (byte) -28) ? 0 : 1, (byte) 111);
                            class195.method1362(var24.field1976[0], true, var24.method953(arg2 + -111), -2, var24.method953(-38), 0, var24.field1978[0], arg2 ^ -2, 0);
                        }
                    }
                    if (~var6 == -48) {
                        class483.field6940 = arg1;
                        class363.field5374 = 0;
                        class88.field1266 = arg0;
                        ++class421.field6272;
                        class407.field6061 = 2;
                        class74.method640(-29627, class390.field5841);
                        class71.field1020.method1524(Integer.MAX_VALUE & (int) (var8 >>> 32), 128);
                        class71.field1020.method1539((byte) -114, class176.field2613 + var5);
                        class71.field1020.method1530(!class101.field1456.method1045(82, (byte) -76) ? 0 : 1, (byte) -88);
                        class71.field1020.method1539((byte) -103, var4 - -class390.field5842);
                        class455.method2769(var5, var8, var4, arg2 + 118);
                    }
                    if (~var6 == -17) {
                        class116 var25 = field2265[var7];
                        if (var25 != null) {
                            class363.field5374 = 0;
                            class407.field6061 = 2;
                            ++class108.field1506;
                            class88.field1266 = arg0;
                            class483.field6940 = arg1;
                            class74.method640(-29627, class108.field1511);
                            class71.field1020.method1530(class101.field1456.method1045(82, (byte) 121) ? 1 : 0, (byte) 110);
                            class71.field1020.method1539((byte) -109, var7);
                            class195.method1362(var25.field1976[0], true, var25.method953(arg2 ^ -84), -2, var25.method953(-43), 0, var25.field1978[0], arg2 ^ -2, 0);
                        }
                    }
                    if (~var6 == -61) {
                        class177 var26 = class26.field319[var7];
                        if (var26 != null) {
                            class363.field5374 = 0;
                            class407.field6061 = 2;
                            ++class261.field3998;
                            class483.field6940 = arg1;
                            class88.field1266 = arg0;
                            class74.method640(-29627, class359.field5325);
                            class71.field1020.method1525(72, class101.field1456.method1045(82, (byte) 106) ? 1 : 0);
                            class71.field1020.method1539((byte) -102, var7);
                            class195.method1362(var26.field1976[0], true, var26.method953(arg2 ^ -70), -2, var26.method953(-61), 0, var26.field1978[0], arg2 ^ -2, 0);
                        }
                    }
                    if (~var6 == -60) {
                        class177 var27 = class26.field319[var7];
                        if (var27 != null) {
                            class483.field6940 = arg1;
                            class363.field5374 = 0;
                            ++class1.field2;
                            class407.field6061 = 2;
                            class88.field1266 = arg0;
                            class74.method640(-29627, class467.field6750);
                            class71.field1020.method1545(class101.field1456.method1045(82, (byte) -28) ? 1 : 0, arg2 ^ -43);
                            class71.field1020.method1508(-128, var7);
                            class195.method1362(var27.field1976[0], true, var27.method953(-68), -2, var27.method953(-36), 0, var27.field1978[0], -1, 0);
                        }
                    }
                    if (var6 == 30) {
                        class177 var28 = class26.field319[var7];
                        if (var28 != null) {
                            class407.field6061 = 2;
                            class88.field1266 = arg0;
                            class483.field6940 = arg1;
                            class363.field5374 = 0;
                            ++class333.field4981;
                            class74.method640(arg2 + -29628, class101.field1444);
                            class71.field1020.method1508(-128, var7);
                            class71.field1020.method1530(class101.field1456.method1045(82, (byte) -88) ? 1 : 0, (byte) 95);
                            class195.method1362(var28.field1976[0], true, var28.method953(-87), -2, var28.method953(arg2 + -80), 0, var28.field1978[0], arg2 ^ -2, 0);
                        }
                    }
                    if (~var6 == -7) {
                        class177 var29 = class26.field319[var7];
                        if (var29 != null) {
                            class363.field5374 = 0;
                            class483.field6940 = arg1;
                            class407.field6061 = 2;
                            ++class448.field6558;
                            class88.field1266 = arg0;
                            class74.method640(-29627, class131.field2009);
                            class71.field1020.method1543((byte) 108, class101.field1456.method1045(82, (byte) -58) ? 1 : 0);
                            class71.field1020.method1539((byte) -112, var7);
                            class195.method1362(var29.field1976[0], true, var29.method953(arg2 ^ -93), -2, var29.method953(arg2 + -57), 0, var29.field1978[0], arg2 + -2, 0);
                        }
                    }
                    if (~var6 == -9) {
                        if (class417.field6224 > 0 && class101.field1456.method1045(82, (byte) 118) && class101.field1456.method1045(81, (byte) 93)) {
                            class357.method2245(false, class398.field5947.field5826, class176.field2613 - -var5, class390.field5842 + var4);
                        } else {
                            class196.method1364(var4, var7, var5, -95);
                            if (~var7 != -2) {
                                class407.field6061 = 1;
                                class483.field6940 = arg1;
                                class88.field1266 = arg0;
                                class363.field5374 = 0;
                            } else {
                                class71.field1020.method1545(-1, -53);
                                class71.field1020.method1545(-1, arg2 + -37);
                                class71.field1020.method1542((int) class473.field6830, arg2 + -2757);
                                class71.field1020.method1545(57, -51);
                                class71.field1020.method1545(class162.field2414, -49);
                                class71.field1020.method1545(class4.field23, -30);
                                class71.field1020.method1545(89, -110);
                                class71.field1020.method1542(class398.field5947.field5837, -2756);
                                class71.field1020.method1542(class398.field5947.field5833, -2756);
                                class71.field1020.method1545(63, arg2 + -33);
                            }
                            class195.method1362(var5, true, 1, -4, 1, 0, var4, -1, 0);
                        }
                    }
                    if (var6 == 1010) {
                        class483.field6940 = arg1;
                        class407.field6061 = 2;
                        class363.field5374 = 0;
                        class88.field1266 = arg0;
                        ++class475.field6851;
                        class74.method640(arg2 ^ -29628, class264.field4052);
                        class71.field1020.method1508(-128, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                        class71.field1020.method1525(120, !class101.field1456.method1045(82, (byte) 86) ? 0 : 1);
                        class71.field1020.method1524(var5 - -class176.field2613, 128);
                        class71.field1020.method1542(var4 - -class390.field5842, -2756);
                        class455.method2769(var5, var8, var4, 99);
                    }
                    if (class245.field3859) {
                        class329.method2090(-1);
                    }
                    if (class511.field7464 != null && class197.field3287 == 0) {
                        class262.method1747(arg2 ^ 20557, class511.field7464);
                    }
                }
            }
        }
    }

    static {
        for (int var0 = 0; field2278.length > var0; ++var0) {
            field2278[var0] = new class305();
        }
    }
}
