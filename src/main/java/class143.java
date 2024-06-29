import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class143 extends class455 implements class185 {

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Lck;")
    public class436 field2316;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "Z")
    private boolean field2337;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Lbg;")
    public static class310 field2317 = new class310(66, 7);

    @OriginalMember(owner = "client!em", name = "v", descriptor = "F")
    public static float field2321;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "[I")
    public static int[] field2332;

    static {
        new class423((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        new class423("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(III)Z", line = 3)
    public static final boolean method940(int arg0, int arg1, int arg2) {
        ++field2326;
        if (arg0 != 24662) {
            method941((byte) -108);
        }
        return (65536 & arg1) != 0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 17)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            this.method162((class318) null, (byte) 76, 48, -55);
        }
        ++field2322;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)I", line = 29)
    public final int method174(byte arg0) {
        ++field2323;
        return arg0 < 113 ? -24 : this.field2316.field6400;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)Z", line = 41)
    public final boolean method164(int arg0) {
        ++field2324;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lqq;I)V", line = 55)
    public final void method171(class318 arg0, int arg1) {
        this.field2316.method2547(-12, arg0);
        if (arg1 != 1577) {
            this.method176(true, (class318) null);
        }
        ++field2327;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 66)
    public final void method163(int arg0) {
        if (arg0 == 8793) {
            ++field2319;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V", line = 76)
    public static void method941(byte arg0) {
        field2332 = null;
        field2317 = null;
        int var1 = 103 % ((42 - arg0) / 39);
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(I)V", line = 89)
    public final void method168(int arg0) {
        int var2 = -64 % ((-53 - arg0) / 62);
        ++field2325;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 99)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        ++field2315;
        return arg1 ? null : this.field2316.method2550(false, 0, 0, arg0, -41, false, arg2);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lqq;BII)Z", line = 112)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -44) {
            return true;
        } else {
            ++field2335;
            class198 var5 = this.field2316.method2550(false, super.field6978, super.field6980, arg0, -72, false, 131072);
            if (var5 == null) {
                return false;
            } else {
                class496 var6 = arg0.method1976();
                var6.method198(super.field6980, super.field6982, super.field6978);
                return var5.method495(arg2, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z", line = 132)
    public final boolean method161(int arg0) {
        ++field2328;
        if (arg0 != 15275) {
            method942(64);
        }
        return this.field2316.method2542(-1);
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V", line = 146)
    public static final void method942(int arg0) {
        class111.method796();
        ++field2318;
        for (int var1 = arg0; ~var1 > -5; ++var1) {
            class91.field1641[var1].method2224(-1568);
        }
        class286.method1742(-1);
        class145.method954(120);
        System.gc();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLqq;)Lkm;", line = 164)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field2330;
        class198 var3 = this.field2316.method2550(true, super.field6978, super.field6980, arg1, -27, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class496 var4 = arg1.method1976();
            var4.method198(super.field6980, super.field6982, super.field6978);
            class227 var5 = null;
            if (arg0 >= -11) {
                return null;
            } else {
                if (this.field2337) {
                    var5 = class145.method951(1, 0);
                }
                if (this.field2316.field6402 == null) {
                    var3.method461(var4, var5 != null ? var5.field3476[0] : null, 0);
                } else {
                    class372 var6 = this.field2316.field6402.method2882();
                    arg1.method1983(var3, var6, var4, var5 == null ? null : var5.field3476[0], 0);
                }
                int var7 = super.field6980 >> 7;
                int var8 = super.field6978 >> 7;
                this.field2316.method2548(var8, var7, -400, var7, var3, true, arg1, var8);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lqq;Lin;IIIIIZIII)V", line = 205)
    public class143(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class388.method2309(arg9, (byte) 77, arg8));
        this.field2316 = new class436(arg0, arg1, arg8, arg9, arg2, arg3, super.field6980, super.field6978, arg7, arg10);
        this.field2337 = arg1.field895 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)I", line = 217)
    public final int method170(boolean arg0) {
        if (!arg0) {
            field2317 = null;
        }
        ++field2334;
        return this.field2316.field6421;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)B", line = 228)
    public static final byte method943(byte arg0, int arg1, int arg2) {
        ++field2333;
        if (~arg1 != -10) {
            return 0;
        } else {
            if (arg0 != -32) {
                field2321 = -1.3899823F;
            }
            return (byte) ((arg2 & 1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(ZLqq;)V", line = 251)
    public final void method172(boolean arg0, class318 arg1) {
        ++field2320;
        class198 var3 = this.field2316.method2550(true, super.field6978, super.field6980, arg1, -74, true, 262144);
        if (!arg0) {
            if (var3 != null) {
                int var4 = super.field6980 >> 7;
                int var5 = super.field6978 >> 7;
                this.field2316.method2548(var5, var4, -400, var4, var3, false, arg1, var5);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "h", descriptor = "(I)V", line = 272)
    public static final void method944(int arg0) {
        ++field2329;
        class377.method2269(true, false);
        class494.field7524 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class311.field4685.length; ++var2) {
            if (class469.field7187[var2] != -1 && class311.field4685[var2] == null) {
                class311.field4685[var2] = class73.field1310.method2715(0, class469.field7187[var2], false);
                if (class311.field4685[var2] == null) {
                    ++class494.field7524;
                    var1 = false;
                }
            }
            if (class105.field1852[var2] != -1 && class251.field3838[var2] == null) {
                class251.field3838[var2] = class73.field1310.method2742((byte) -106, class105.field1852[var2], class312.field4699[var2], 0);
                if (class251.field3838[var2] == null) {
                    var1 = false;
                    ++class494.field7524;
                }
            }
            if (~class423.field6058[var2] != 0 && class461.field7092[var2] == null) {
                class461.field7092[var2] = class73.field1310.method2715(0, class423.field6058[var2], false);
                if (class461.field7092[var2] == null) {
                    ++class494.field7524;
                    var1 = false;
                }
            }
            if (~class38.field512[var2] != 0 && class216.field3335[var2] == null) {
                class216.field3335[var2] = class73.field1310.method2715(0, class38.field512[var2], false);
                if (class216.field3335[var2] == null) {
                    var1 = false;
                    ++class494.field7524;
                }
            }
            if (class167.field2591 != null && class358.field5314[var2] == null && ~class167.field2591[var2] != 0) {
                class358.field5314[var2] = class73.field1310.method2742((byte) -65, class167.field2591[var2], class312.field4699[var2], 0);
                if (class358.field5314[var2] == null) {
                    ++class494.field7524;
                    var1 = false;
                }
            }
        }
        if (class383.field5575 == null) {
            if (class56.field918 != null && class232.field3524.method2725(-26362, class56.field918.field1268 + "_staticelements")) {
                if (class232.field3524.method2710(class56.field918.field1268 + "_staticelements", -93)) {
                    class383.field5575 = class460.method2752(true, class73.field1313, class56.field918.field1268 + "_staticelements", class232.field3524);
                } else {
                    var1 = false;
                    ++class494.field7524;
                }
            } else {
                class383.field5575 = new class230(0);
            }
        }
        if (!var1) {
            class457.field7006 = 1;
        } else {
            class178.field2788 = 0;
            boolean var3 = true;
            for (int var4 = 0; class311.field4685.length > var4; ++var4) {
                byte[] var19 = class251.field3838[var4];
                if (var19 != null) {
                    int var20 = (class61.field1032[var4] >> 8) * 64 - class381.field5550;
                    int var21 = (class61.field1032[var4] & 255) * 64 + -class320.field4827;
                    if (class21.field269 != 0) {
                        var21 = 10;
                        var20 = 10;
                    }
                    var3 &= class252.method1513(var20, var19, class150.field2422, var21, class21.field272, (byte) 109);
                }
                byte[] var22 = class216.field3335[var4];
                if (var22 != null) {
                    int var23 = (class61.field1032[var4] >> 8) * 64 - class381.field5550;
                    int var24 = (255 & class61.field1032[var4]) * 64 + -class320.field4827;
                    if (~class21.field269 != -1) {
                        var23 = 10;
                        var24 = 10;
                    }
                    var3 &= class252.method1513(var23, var22, class150.field2422, var24, class21.field272, (byte) -116);
                }
            }
            if (!var3) {
                class457.field7006 = 2;
            } else {
                if (~class457.field7006 != -1) {
                    class277.method1681(true, class217.field3343, class494.field7520.method2473(class406.field5898, -98) + "<br>(100%)", (byte) 17);
                }
                class233.method1400(false);
                class145.method954(123);
                boolean var5 = false;
                if (class345.field5116.method1942() && class463.field7116.field2943) {
                    for (int var6 = 0; ~class311.field4685.length < ~var6; ++var6) {
                        if (class216.field3335[var6] != null || class461.field7092[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class463.field7116.field2947) {
                    var7 = class376.field5476[class75.field1353];
                } else {
                    var7 = class110.field1890[class75.field1353];
                }
                if (class345.field5116.method1969()) {
                    ++var7;
                }
                class376.method2265(7, 4, class150.field2422, class21.field272, var7, var5, ~class345.field5116.method1986() < -1);
                for (int var8 = 0; var8 < 4; ++var8) {
                    class91.field1641[var8].method2224(-1568);
                }
                class472.method2844(0);
                class187.method1157(false, (byte) -11);
                class216.method1328((byte) -72);
                class96.field1741 = null;
                class233.method1400(false);
                System.gc();
                class377.method2269(true, true);
                class452.method2700(-58);
                class469.field7196 = class463.field7116.field2943;
                class27.field350 = !class463.field7116.field2948;
                class383.field5571 = class463.field7116.field2972;
                class257.field3916 = class463.field7116.field2974;
                class455.field6983 = class322.field4841 >= 96;
                class511.field7752 = class463.field7116.method75(-1, class30.field395) ? -1 : class455.field6976;
                class275.field4168 = class30.field395 == arg0 || class463.field7116.field2950;
                class6.field77 = new class282(4, class150.field2422, class21.field272, false);
                if (class21.field269 != 0) {
                    class498.method2993(class311.field4685, (byte) 0, class6.field77);
                } else {
                    class414.method2441(class311.field4685, class6.field77, 0);
                }
                class41.method288(class21.field272 >> 4, false, class150.field2422 >> 4);
                class504.method3017(0);
                if (var5) {
                    class7.method37(true);
                    class10.field125 = new class282(1, class150.field2422, class21.field272, true);
                    if (~class21.field269 != -1) {
                        class498.method2993(class461.field7092, (byte) 0, class10.field125);
                        class377.method2269(true, true);
                    } else {
                        class414.method2441(class461.field7092, class10.field125, 0);
                        class377.method2269(true, true);
                    }
                    class10.field125.method1735(0, class6.field77.field4286[0], (byte) -122);
                    class10.field125.method1726(class345.field5116, (class367[]) null, arg0 + 99, (int[][][]) null);
                    class7.method37(false);
                }
                class6.field77.method1726(class345.field5116, class91.field1641, 71, var5 ? class10.field125.field4286 : null);
                if (class21.field269 != 0) {
                    class377.method2269(true, true);
                    class402.method2386(class6.field77, 8, class251.field3838);
                } else {
                    class377.method2269(true, true);
                    class494.method2981(class251.field3838, class6.field77, 64);
                    if (class358.field5314 != null) {
                        class357.method2186(1909117475);
                    }
                }
                class145.method954(122);
                class377.method2269(true, true);
                class6.field77.method1731(!var5 ? null : class262.field3978[0], (class343) null, class345.field5116, (byte) -79);
                class6.field77.method1715(class345.field5116, 7115);
                class377.method2269(true, true);
                if (var5) {
                    class7.method37(true);
                    class377.method2269(true, true);
                    if (~class21.field269 == -1) {
                        class494.method2981(class216.field3335, class10.field125, 64);
                    } else {
                        class402.method2386(class10.field125, 8, class216.field3335);
                    }
                    class145.method954(124);
                    class377.method2269(true, true);
                    class10.field125.method1731((class343) null, class201.field3195[0], class345.field5116, (byte) 127);
                    class10.field125.method1715(class345.field5116, arg0 ^ 7114);
                    class377.method2269(true, true);
                    class7.method37(false);
                }
                class508.method3039(arg0);
                int var9 = class6.field77.field4270;
                if (var9 > class362.field5339) {
                    var9 = class362.field5339;
                }
                if (~var9 > ~(class362.field5339 + -1)) {
                    var9 = class362.field5339 + -1;
                }
                if (class463.field7116.method75(-1, class30.field395)) {
                    class138.method925(0);
                } else {
                    class138.method925(var9);
                }
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var17 = 0; class150.field2422 > var17; ++var17) {
                        for (int var18 = 0; class21.field272 > var18; ++var18) {
                            class59.method420(var17, (byte) 40, var18, var10);
                        }
                    }
                }
                class473.method2847((byte) 0);
                class233.method1400(false);
                class307.method1846(-20491);
                class145.method954(116);
                class150.field2424 = false;
                class432.method2531((byte) -127);
                if (class174.field2726 != null && class163.field2534 != null && client.field2992 == 25) {
                    ++class297.field4508;
                    class400.method2379((byte) -75, class366.field5377);
                    class230.field3508.method253(-102, 1057001181);
                }
                if (class21.field269 == 0) {
                    int var11 = (-(class150.field2422 >> 4) + class178.field2783) / 8;
                    int var12 = ((class150.field2422 >> 4) + class178.field2783) / 8;
                    int var13 = (-(class21.field272 >> 4) + class451.field6933) / 8;
                    int var14 = ((class21.field272 >> 4) + class451.field6933) / 8;
                    for (int var15 = var11 + -1; ~var15 >= ~(var12 + 1); ++var15) {
                        for (int var16 = var13 + -1; var16 <= var14 - -1; ++var16) {
                            if (~var15 > ~var11 || var12 < var15 || var13 > var16 || ~var14 > ~var16) {
                                class73.field1310.method2733("m" + var15 + "_" + var16, false);
                                class73.field1310.method2733("l" + var15 + "_" + var16, false);
                            }
                        }
                    }
                }
                if (client.field2992 == 28) {
                    class189.method1196(10, arg0 ^ -12253);
                } else {
                    class189.method1196(30, -12254);
                    if (class163.field2534 != null) {
                        class400.method2379((byte) -75, class272.field4133);
                    }
                }
                class170.method1072(86);
                class233.method1400(false);
                class469.method2831(arg0 + -17187);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)I", line = 723)
    public final int method173(int arg0) {
        if (arg0 != 1438) {
            field2317 = null;
        }
        ++field2331;
        return this.field2316.field6391;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLqq;)V", line = 742)
    public final void method176(boolean arg0, class318 arg1) {
        this.field2316.method2549(10, arg1);
        ++field2336;
        if (!arg0) {
            this.method168(102);
        }
    }
}
