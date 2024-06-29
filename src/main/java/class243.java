import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class243 extends class222 {

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    private int field4203 = 4096;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lwa;")
    public static class219 field4209 = new class219(8);

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "Lsb;")
    public static class98 field4214 = class47.method368("<col=ff9040>", 0);

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lsb;")
    public static class98 field4215 = class47.method368(":assist:", 0);

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "Lsb;")
    public static class98 field4216 = class47.method368(" ", 0);

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
    public static int field4219 = 0;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "Lsb;")
    public static class98 field4220 = class47.method368("Wordpack geladen)3", 0);

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "[[[I")
    public static int[][][] field4212 = new int[2][][];

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "Ltg;")
    public static class75 field4222;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "[I")
    public static int[] field4217;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "[Lqh;")
    public static class24[] field4218;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILlj;)V")
    public static final void method1673(int arg0, class216 arg1) {
        ++field4204;
        if (~(arg1.field3706.length + -arg1.field3728) <= -2) {
            int var2 = arg1.method1446(5350);
            if (var2 >= 0 && ~var2 >= -4) {
                byte var3;
                if (var2 == 3) {
                    var3 = 23;
                } else if (var2 == 2) {
                    var3 = 22;
                } else if (var2 == 1) {
                    var3 = 23;
                } else {
                    var3 = 19;
                }
                if (var3 <= arg1.field3706.length + -arg1.field3728) {
                    class120.field2172 = arg1.method1446(5350);
                    if (class120.field2172 >= 1) {
                        if (~class120.field2172 < -5) {
                            class120.field2172 = 4;
                        }
                    } else {
                        class120.field2172 = 1;
                    }
                    class191.method1317((byte) 123, ~arg1.method1446(5350) == -2);
                    class85.field1497 = arg1.method1446(5350) == 1;
                    class104.field1848 = arg1.method1446(5350) == 1;
                    class12.field238 = arg1.method1446(5350) == 1;
                    class199.field3423 = arg1.method1446(5350) == 1;
                    class91.field1593 = arg1.method1446(5350) == 1;
                    class45.field749 = ~arg1.method1446(5350) == -2;
                    class115.field2062 = ~arg1.method1446(5350) == -2;
                    class177.field3069 = arg1.method1446(5350);
                    if (class177.field3069 > 2) {
                        class177.field3069 = 2;
                    }
                    if (~var2 > -3) {
                        class229.field3932 = ~arg1.method1446(5350) == -2;
                        arg1.method1446(5350);
                    } else {
                        class229.field3932 = arg1.method1446(5350) == 1;
                    }
                    class41.field679 = ~arg1.method1446(5350) == -2;
                    class45.field747 = arg1.method1446(5350) == 1;
                    class120.field2184 = arg1.method1446(5350);
                    if (class120.field2184 > 2) {
                        class120.field2184 = 2;
                    }
                    class158.field2873 = ~arg1.method1446(5350) == -2;
                    if (arg0 < 111) {
                        field4212 = null;
                    }
                    class37.field627 = arg1.method1446(5350);
                    if (class37.field627 > 127) {
                        class37.field627 = 127;
                    }
                    class167.field2978 = arg1.method1446(5350);
                    class90.field1585 = arg1.method1446(5350);
                    if (~class90.field1585 < -128) {
                        class90.field1585 = 127;
                    }
                    if (~var2 <= -2) {
                        class223.field3854 = arg1.method1487(49);
                        class265.field4644 = arg1.method1487(63);
                    }
                    if (var2 >= 3) {
                        class68.field1082 = arg1.method1446(5350) == 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            ++field4213;
            if (arg2 == 0) {
                this.field4203 = arg0.method1487(127);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public static final void method1674(int arg0) {
        class211.field3609 = new class219(32);
        ++field4206;
        if (arg0 != 30522) {
            field4209 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 <= 35) {
            this.method7((byte) -90, 59);
        }
        ++field4205;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int[] var4 = this.method1537((byte) 104, 0, class191.field3299 & arg1 - 1);
            int[] var5 = this.method1537((byte) 118, 0, arg1);
            int[] var6 = this.method1537((byte) 104, 0, arg1 - -1 & class191.field3299);
            for (int var7 = 0; var7 < class13.field253; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4203;
                int var9 = (var5[class162.field2924 & var7 + 1] + -var5[var7 + -1 & class162.field2924]) * this.field4203;
                int var10 = var8 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 - -var11) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static void method1675(int arg0) {
        field4216 = null;
        field4220 = null;
        field4212 = null;
        field4209 = null;
        field4215 = null;
        field4222 = null;
        field4214 = null;
        field4217 = null;
        field4218 = null;
        if (arg0 != 151) {
            method1677((byte) 44);
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V")
    public static final void method1676(byte arg0) {
        if (arg0 >= -73) {
            field4212 = null;
        }
        ++field4210;
        class74.field1244 = new class48();
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)V")
    public static final void method1677(byte arg0) {
        ++field4211;
        if (class81.field1427 != 0 && ~class81.field1427 != -6) {
            try {
                if (arg0 >= 80) {
                    if (~(++class62.field1043) < -2001) {
                        if (class46.field774 != null) {
                            class46.field774.method790(false);
                            class46.field774 = null;
                        }
                        if (class237.field4094 >= 1) {
                            class176.field3068 = -5;
                            class81.field1427 = 0;
                            return;
                        }
                        class81.field1427 = 1;
                        ++class237.field4094;
                        class62.field1043 = 0;
                        if (class236.field4076 != class156.field2848) {
                            class236.field4076 = class156.field2848;
                        } else {
                            class236.field4076 = class188.field3235;
                        }
                    }
                    if (class81.field1427 == 1) {
                        class62.field1035 = class119.field2145.method38(class236.field4076, class85.field1507, -127);
                        class81.field1427 = 2;
                    }
                    if (class81.field1427 == 2) {
                        if (class62.field1035.field445 == 2) {
                            throw new IOException();
                        }
                        if (class62.field1035.field445 != 1) {
                            return;
                        }
                        class46.field774 = new class102((Socket) class62.field1035.field447, class119.field2145);
                        class62.field1035 = null;
                        long var1 = class116.field2082 = class233.field4017.method727((byte) 36);
                        class237.field4084.field3728 = 0;
                        class237.field4084.method1477(14, -26755);
                        int var3 = (int) (31L & var1 >> 16);
                        class237.field4084.method1477(var3, -26755);
                        class46.field774.method788(true, 0, 2, class237.field4084.field3706);
                        if (class262.field4606 != null) {
                            class262.field4606.method1579((byte) 64);
                        }
                        if (class235.field4057 != null) {
                            class235.field4057.method1579((byte) 64);
                        }
                        int var4 = class46.field774.method785(-1795);
                        if (class262.field4606 != null) {
                            class262.field4606.method1579((byte) 64);
                        }
                        if (class235.field4057 != null) {
                            class235.field4057.method1579((byte) 64);
                        }
                        if (var4 != 0) {
                            class81.field1427 = 0;
                            class176.field3068 = var4;
                            class46.field774.method790(false);
                            class46.field774 = null;
                            return;
                        }
                        class81.field1427 = 3;
                    }
                    if (~class81.field1427 == -4) {
                        if (class46.field774.method786(4316) < 8) {
                            return;
                        }
                        class46.field774.method787(class144.field2536.field3706, 0, 0, 8);
                        int[] var5 = new int[4];
                        class144.field2536.field3728 = 0;
                        class182.field3136 = class144.field2536.method1439(-715833952);
                        var5[3] = (int) class182.field3136;
                        class237.field4084.field3728 = 0;
                        var5[1] = (int) (9.9999999E7D * Math.random());
                        var5[0] = (int) (Math.random() * 9.9999999E7D);
                        var5[2] = (int) (class182.field3136 >> 32);
                        class237.field4084.method1477(10, -26755);
                        class237.field4084.method1456(var5[0], -23438);
                        class237.field4084.method1456(var5[1], -23438);
                        class237.field4084.method1456(var5[2], -23438);
                        class237.field4084.method1456(var5[3], -23438);
                        class237.field4084.method1484(class233.field4017.method727((byte) 36), (byte) 38);
                        class237.field4084.method1459(class233.field4010, (byte) 78);
                        class237.field4084.method1492(class143.field2521, -110, class54.field868);
                        class171.field3016.field3728 = 0;
                        if (~class249.field4370 != -41) {
                            class171.field3016.method1477(16, -26755);
                        } else {
                            class171.field3016.method1477(18, -26755);
                        }
                        class171.field3016.method1470((byte) -122, class237.field4084.field3728 + 151 + class20.method220(class154.field2809, true));
                        class171.field3016.method1456(510, -23438);
                        class171.field3016.method1477(class205.field3511, -26755);
                        class171.field3016.method1477(0, -26755);
                        class171.field3016.method1477(class151.method1114((byte) -80), -26755);
                        class171.field3016.method1470((byte) -122, class121.field2227);
                        class171.field3016.method1470((byte) -122, class180.field3111);
                        class184.method1270(class171.field3016, false);
                        class171.field3016.method1459(class154.field2809, (byte) 78);
                        class171.field3016.method1456(class184.field3166, -23438);
                        class171.field3016.method1456(class97.method697(false), -23438);
                        class224.field3865 = true;
                        class171.field3016.method1456(class86.field1517.field1291, -23438);
                        class171.field3016.method1456(class104.field1838.field1291, -23438);
                        class171.field3016.method1456(client.field1782.field1291, -23438);
                        class171.field3016.method1456(class137.field2419.field1291, -23438);
                        class171.field3016.method1456(class8.field156.field1291, -23438);
                        class171.field3016.method1456(class84.field1467.field1291, -23438);
                        class171.field3016.method1456(class143.field2525.field1291, -23438);
                        class171.field3016.method1456(class218.field3757.field1291, -23438);
                        class171.field3016.method1456(class31.field549.field1291, -23438);
                        class171.field3016.method1456(class70.field1123.field1291, -23438);
                        class171.field3016.method1456(class47.field787.field1291, -23438);
                        class171.field3016.method1456(class233.field4003.field1291, -23438);
                        class171.field3016.method1456(class205.field3507.field1291, -23438);
                        class171.field3016.method1456(class162.field2928.field1291, -23438);
                        class171.field3016.method1456(class197.field3401.field1291, -23438);
                        class171.field3016.method1456(class103.field1835.field1291, -23438);
                        class171.field3016.method1456(class59.field967.field1291, -23438);
                        class171.field3016.method1456(class41.field669.field1291, -23438);
                        class171.field3016.method1456(class164.field2957.field1291, -23438);
                        class171.field3016.method1456(class139.field2466.field1291, -23438);
                        class171.field3016.method1456(class120.field2177.field1291, -23438);
                        class171.field3016.method1456(class78.field1383.field1291, -23438);
                        class171.field3016.method1456(class212.field3626.field1291, -23438);
                        class171.field3016.method1456(class113.field1999.field1291, -23438);
                        class171.field3016.method1456(class45.field743.field1291, -23438);
                        class171.field3016.method1456(class255.field4522.field1291, -23438);
                        class171.field3016.method1456(class194.field3361.field1291, -23438);
                        class171.field3016.method1488(0, -76, class237.field4084.field3706, class237.field4084.field3728);
                        class46.field774.method788(true, 0, class171.field3016.field3728, class171.field3016.field3706);
                        class237.field4084.method489(var5, (byte) 119);
                        for (int var6 = 0; var6 < 4; ++var6) {
                            var5[var6] += 50;
                        }
                        class144.field2536.method489(var5, (byte) 119);
                        class81.field1427 = 4;
                    }
                    if (class81.field1427 == 4) {
                        if (class46.field774.method786(4316) < 1) {
                            return;
                        }
                        int var7 = class46.field774.method785(-1795);
                        if (var7 != 21) {
                            if (var7 == 1) {
                                class81.field1427 = 5;
                                class176.field3068 = var7;
                                return;
                            }
                            if (~var7 != -3) {
                                if (var7 == 15) {
                                    class81.field1427 = 0;
                                    class176.field3068 = var7;
                                    return;
                                }
                                if (var7 == 23 && class237.field4094 < 1) {
                                    class81.field1427 = 1;
                                    class62.field1043 = 0;
                                    ++class237.field4094;
                                    class46.field774.method790(false);
                                    class46.field774 = null;
                                    return;
                                }
                                class176.field3068 = var7;
                                class81.field1427 = 0;
                                class46.field774.method790(false);
                                class46.field774 = null;
                                return;
                            }
                            class81.field1427 = 8;
                        } else {
                            class81.field1427 = 7;
                        }
                    }
                    if (~class81.field1427 == -7) {
                        class237.field4084.field3728 = 0;
                        class237.field4084.method490(17, -70);
                        class46.field774.method788(true, 0, class237.field4084.field3728, class237.field4084.field3706);
                        class81.field1427 = 4;
                    } else if (class81.field1427 == 7) {
                        if (class46.field774.method786(4316) >= 1) {
                            class80.field1412 = (3 + class46.field774.method785(-1795)) * 60;
                            class81.field1427 = 0;
                            class176.field3068 = 21;
                            class46.field774.method790(false);
                            class46.field774 = null;
                        }
                    } else {
                        if (class81.field1427 == 8) {
                            if (~class46.field774.method786(4316) > -12) {
                                return;
                            }
                            class46.field774.method787(class144.field2536.field3706, 0, 0, 11);
                            class144.field2536.field3728 = 0;
                            class130.field2312 = class144.field2536.method1446(5350);
                            class13.field245 = class144.field2536.method1446(5350);
                            class190.field3286 = class144.field2536.method1446(5350);
                            if (class190.field3286 == 1) {
                                try {
                                    class34.field597.method707(115, class119.field2145.field76);
                                } catch (Throwable var9) {
                                }
                            } else {
                                try {
                                    class246.field4336.method707(-113, class119.field2145.field76);
                                } catch (Throwable var8) {
                                }
                            }
                            class105.field1878 = class144.field2536.method1446(5350);
                            class185.field3181 = class144.field2536.method1446(5350) == 1;
                            class234.field4046 = class144.field2536.method1487(12);
                            class55.field875 = class144.field2536.method1446(5350);
                            class222.field3824 = class144.field2536.method488((byte) -61);
                            class47.field789 = class144.field2536.method1487(45);
                            class81.field1427 = 9;
                        }
                        if (class81.field1427 == 9) {
                            if (~class46.field774.method786(4316) <= ~class47.field789) {
                                class144.field2536.field3728 = 0;
                                class46.field774.method787(class144.field2536.field3706, 0, 0, class47.field789);
                                class176.field3068 = 2;
                                class81.field1427 = 0;
                                class182.method1259((byte) 32);
                                class118.field2124 = -1;
                                class103.method793(false, 0);
                                class222.field3824 = -1;
                            }
                        }
                    }
                }
            } catch (IOException var10) {
                if (class46.field774 != null) {
                    class46.field774.method790(false);
                    class46.field774 = null;
                }
                if (class237.field4094 >= 1) {
                    class176.field3068 = -4;
                    class81.field1427 = 0;
                } else {
                    class62.field1043 = 0;
                    ++class237.field4094;
                    if (~class236.field4076 == ~class156.field2848) {
                        class236.field4076 = class188.field3235;
                    } else {
                        class236.field4076 = class156.field2848;
                    }
                    class81.field1427 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static final void method1678(String arg0, Throwable arg1, byte arg2) {
        ++field4208;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class100.method760(arg1, 62);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (arg2 >= -69) {
                field4212 = null;
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class185.field3202.field76 != null) {
                class22 var8 = class185.field3202.method34((byte) -103, new URL(class185.field3202.field76.getCodeBase(), "clienterror.ws?c=" + class248.field4368 + "&u=" + class116.field2082 + "&v1=" + class5.field72 + "&v2=" + class5.field82 + "&e=" + var7));
                while (var8.field445 == 0) {
                    class234.method1603(1L, 112);
                }
                if (~var8.field445 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field447;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(B)I")
    public static final int method1679(byte arg0) {
        if (arg0 != -53) {
            return -112;
        } else {
            ++field4221;
            return 6;
        }
    }
}
