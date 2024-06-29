import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class90 extends class17 {

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "[I")
    public static int[] field1414 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field1416 = 0;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "Lsf;")
    public static class108 field1421 = class140.method973(255, " s(West connect-B)3");

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field1422 = 0;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lsf;")
    public static class108 field1424 = class140.method973(255, "Fps:");

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "[I")
    public static int[] field1417;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)Z", line = 6)
    public static final boolean method608(int arg0) {
        field1419++;
        class330 var1 = class229.field3987;
        synchronized (class229.field3987) {
            if (class8.field93 == class108.field1853) {
                return false;
            }
            class115.field1989 = class211.field3769[class8.field93];
            class285.field4981 = class292.field5113[class8.field93];
            if (arg0 == 9) {
                class8.field93 = class8.field93 + 1 & 0x7F;
                return true;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V", line = 26)
    public static final void method609(int arg0) {
        field1418++;
        if (class166.field2988 == 0 || class166.field2988 == 5 || arg0 >= -7) {
            return;
        }
        try {
            if ((++class317.field5447) > 2000) {
                if (class14.field161 != null) {
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                }
                if (class96.field1556 >= 1) {
                    class166.field2988 = 0;
                    class211.field3766 = -5;
                    return;
                }
                class317.field5447 = 0;
                if (class149.field2723 == class135.field2345) {
                    class149.field2723 = class78.field1184;
                } else {
                    class149.field2723 = class135.field2345;
                }
                class96.field1556++;
                class166.field2988 = 1;
            }
            if (class166.field2988 == 1) {
                class93.field1489 = class289.field5052.method970(class68.field1061, class149.field2723, (byte) -110);
                class166.field2988 = 2;
            }
            if (class166.field2988 == 2) {
                if (class93.field1489.field3686 == 2) {
                    throw new IOException();
                }
                if (class93.field1489.field3686 != 1) {
                    return;
                }
                class14.field161 = new class216((Socket) class93.field1489.field3685, class289.field5052);
                class93.field1489 = null;
                long var1 = class46.field661 = class63.field1014.method743(false);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class256.field4471.field4314 = 0;
                class256.field4471.method1759(-32768, 14);
                class256.field4471.method1759(-32768, var3);
                class14.field161.method1483(2, 0, false, class256.field4471.field4338);
                if (class308.field5347 != null) {
                    class308.field5347.method1406((byte) 66);
                }
                if (class261.field4601 != null) {
                    class261.field4601.method1406((byte) 66);
                }
                int var4 = class14.field161.method1482((byte) 126);
                if (class308.field5347 != null) {
                    class308.field5347.method1406((byte) 66);
                }
                if (class261.field4601 != null) {
                    class261.field4601.method1406((byte) 66);
                }
                if (var4 != 0) {
                    class166.field2988 = 0;
                    class211.field3766 = var4;
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                    return;
                }
                class166.field2988 = 3;
            }
            if (class166.field2988 == 3) {
                if (class14.field161.method1486(7) < 8) {
                    return;
                }
                class14.field161.method1478(0, 8, false, class293.field5127.field4338);
                class293.field5127.field4314 = 0;
                class290.field5077 = class293.field5127.method1764((byte) -111);
                class256.field4471.field4314 = 0;
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class290.field5077 >> 32), (int) class290.field5077 };
                class256.field4471.method1759(-32768, 10);
                class256.field4471.method1741(var5[0], -1580277072);
                class256.field4471.method1741(var5[1], -1580277072);
                class256.field4471.method1741(var5[2], -1580277072);
                class256.field4471.method1741(var5[3], -1580277072);
                class256.field4471.method1735((byte) -26, class63.field1014.method743(false));
                class256.field4471.method1708(class63.field1009, 7733);
                class256.field4471.method1730(class184.field3379, -13560, class234.field4133);
                class175.field3192.field4314 = 0;
                if (class203.field3658 == 40) {
                    class175.field3192.method1759(-32768, 18);
                } else {
                    class175.field3192.method1759(-32768, 16);
                }
                class175.field3192.method1724(false, class256.field4471.field4314 + class87.method599(12904, class160.field2869) + 159);
                class175.field3192.method1741(524, -1580277072);
                class175.field3192.method1759(-32768, class303.field5255);
                class175.field3192.method1759(-32768, class329.field5618 ? 1 : 0);
                class175.field3192.method1759(-32768, 1);
                class175.field3192.method1759(-32768, class281.method2020((byte) -44));
                class175.field3192.method1724(false, class73.field1110);
                class175.field3192.method1724(false, class21.field331);
                class175.field3192.method1759(-32768, class184.field3372);
                class224.method1524((byte) 73, class175.field3192);
                class175.field3192.method1708(class160.field2869, 7733);
                class175.field3192.method1741(class247.field4269, -1580277072);
                class175.field3192.method1741(class100.method695(46), -1580277072);
                class99.field1758 = true;
                class175.field3192.method1724(false, class196.field3542);
                class175.field3192.method1741(class223.field3950.method1863((byte) 115), -1580277072);
                class175.field3192.method1741(class17.field221.method1863((byte) 77), -1580277072);
                class175.field3192.method1741(class270.field4725.method1863((byte) 80), -1580277072);
                class175.field3192.method1741(class283.field4957.method1863((byte) 93), -1580277072);
                class175.field3192.method1741(class291.field5104.method1863((byte) 75), -1580277072);
                class175.field3192.method1741(class247.field4277.method1863((byte) 112), -1580277072);
                class175.field3192.method1741(class96.field1535.method1863((byte) 105), -1580277072);
                class175.field3192.method1741(class13.field150.method1863((byte) 94), -1580277072);
                class175.field3192.method1741(class215.field3801.method1863((byte) 119), -1580277072);
                class175.field3192.method1741(class73.field1104.method1863((byte) 78), -1580277072);
                class175.field3192.method1741(class143.field2527.method1863((byte) 84), -1580277072);
                class175.field3192.method1741(class69.field1079.method1863((byte) 118), -1580277072);
                class175.field3192.method1741(class92.field1479.method1863((byte) 89), -1580277072);
                class175.field3192.method1741(class62.field994.method1863((byte) 70), -1580277072);
                class175.field3192.method1741(class161.field2889.method1863((byte) 120), -1580277072);
                class175.field3192.method1741(class195.field3524.method1863((byte) 70), -1580277072);
                class175.field3192.method1741(class128.field2189.method1863((byte) 108), -1580277072);
                class175.field3192.method1741(class96.field1525.method1863((byte) 116), -1580277072);
                class175.field3192.method1741(class101.field1781.method1863((byte) 71), -1580277072);
                class175.field3192.method1741(class178.field3228.method1863((byte) 97), -1580277072);
                class175.field3192.method1741(class246.field4262.method1863((byte) 92), -1580277072);
                class175.field3192.method1741(class7.field86.method1863((byte) 83), -1580277072);
                class175.field3192.method1741(class178.field3237.method1863((byte) 82), -1580277072);
                class175.field3192.method1741(class210.field3763.method1863((byte) 97), -1580277072);
                class175.field3192.method1741(class1.field16.method1863((byte) 113), -1580277072);
                class175.field3192.method1741(class221.field3932.method1863((byte) 102), -1580277072);
                class175.field3192.method1741(class242.field4201.method1863((byte) 69), -1580277072);
                class175.field3192.method1741(class200.field3627.method1863((byte) 98), -1580277072);
                class175.field3192.method1732(3, class256.field4471.field4338, 0, class256.field4471.field4314);
                class14.field161.method1483(class175.field3192.field4314, 0, false, class175.field3192.field4338);
                class256.field4471.method1434(var5, (byte) 39);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class293.field5127.method1434(var5, (byte) 125);
                class166.field2988 = 4;
            }
            if (class166.field2988 == 4) {
                if (class14.field161.method1486(7) < 1) {
                    return;
                }
                int var7 = class14.field161.method1482((byte) 127);
                if (var7 == 21) {
                    class166.field2988 = 7;
                } else if (var7 == 29) {
                    class166.field2988 = 10;
                } else if (var7 == 1) {
                    class211.field3766 = var7;
                    class166.field2988 = 5;
                    return;
                } else if (var7 == 2) {
                    class166.field2988 = 8;
                } else if (var7 == 15) {
                    class166.field2988 = 0;
                    class211.field3766 = var7;
                    return;
                } else if (var7 == 23 && class96.field1556 < 1) {
                    class317.field5447 = 0;
                    class166.field2988 = 1;
                    class96.field1556++;
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                    return;
                } else {
                    class166.field2988 = 0;
                    class211.field3766 = var7;
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                    return;
                }
            }
            if (class166.field2988 == 6) {
                class256.field4471.field4314 = 0;
                class256.field4471.method1427(17, 0);
                class14.field161.method1483(class256.field4471.field4314, 0, false, class256.field4471.field4338);
                class166.field2988 = 4;
                return;
            }
            if (class166.field2988 == 7) {
                if (class14.field161.method1486(7) >= 1) {
                    class261.field4602 = (class14.field161.method1482((byte) 127) + 3) * 60;
                    class211.field3766 = 21;
                    class166.field2988 = 0;
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                    return;
                }
                return;
            }
            if (class166.field2988 == 10) {
                if (class14.field161.method1486(7) < 1) {
                    return;
                }
                class183.field3365 = class14.field161.method1482((byte) 127);
                class211.field3766 = 29;
                class166.field2988 = 0;
                class14.field161.method1487(13881);
                class14.field161 = null;
                return;
            }
            if (class166.field2988 == 8) {
                if (class14.field161.method1486(7) < 14) {
                    return;
                }
                class14.field161.method1478(0, 14, false, class293.field5127.field4338);
                class293.field5127.field4314 = 0;
                class299.field5191 = class293.field5127.method1731(true);
                class310.field5356 = class293.field5127.method1731(true);
                class106.field1832 = class293.field5127.method1731(true) == 1;
                class318.field5457 = class293.field5127.method1731(true) == 1;
                class219.field3898 = class293.field5127.method1731(true) == 1;
                class151.field2737 = class293.field5127.method1731(true) == 1;
                class47.field691 = class293.field5127.method1731(true) == 1;
                class185.field3409 = class293.field5127.method1712(-1);
                class304.field5290 = class293.field5127.method1731(true) == 1;
                class293.field5130 = class293.field5127.method1731(true) == 1;
                class94.method646(class293.field5130, -82);
                class224.method1523(class293.field5130, true);
                if (!class329.field5618) {
                    if ((!class106.field1832 || class219.field3898) && !class304.field5290) {
                        try {
                            class327.field5585.method752(30488, class289.field5052.field2441);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class149.field2720.method752(30488, class289.field5052.field2441);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class191.field3457 = class293.field5127.method1428((byte) 121);
                class191.field3471 = class293.field5127.method1712(-1);
                class166.field2988 = 9;
            }
            if (class166.field2988 == 9) {
                if (class14.field161.method1486(7) < class191.field3471) {
                    return;
                }
                class293.field5127.field4314 = 0;
                class14.field161.method1478(0, class191.field3471, false, class293.field5127.field4338);
                class166.field2988 = 0;
                class211.field3766 = 2;
                class163.method1129(-122);
                class45.field653 = -1;
                class190.method1352(false, false);
                class191.field3457 = -1;
                return;
            }
        } catch (IOException var13) {
            if (class14.field161 != null) {
                class14.field161.method1487(13881);
                class14.field161 = null;
            }
            if (class96.field1556 < 1) {
                class317.field5447 = 0;
                class96.field1556++;
                class166.field2988 = 1;
                if (class149.field2723 == class135.field2345) {
                    class149.field2723 = class78.field1184;
                } else {
                    class149.field2723 = class135.field2345;
                }
            } else {
                class211.field3766 = -4;
                class166.field2988 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BZ)V", line = 402)
    public static final void method610(byte arg0, boolean arg1) {
        field1415++;
        byte[][] var2;
        if (class231.field4051 && arg1) {
            var2 = class129.field2216;
        } else {
            var2 = class144.field2539;
        }
        if (arg0 >= -24) {
            field1417 = (int[]) null;
        }
        int var3 = class322.field5513.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class57.field838[var4] & 0xFF) * 64 - class137.field2421;
                int var7 = (class57.field838[var4] >> 8) * 64 - class305.field5295;
                class212.method1460((byte) -16);
                class276.method1993((byte) -32, var5, var7, class330.field5644, var6, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 441)
    public static void method611(byte arg0) {
        field1414 = null;
        if (arg0 <= 59) {
            field1414 = (int[]) null;
        }
        field1417 = null;
        field1424 = null;
        field1421 = null;
    }

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "(I)V", line = 459)
    public static final void method612(int arg0) {
        field1423++;
        int var1 = class256.field4525.method543(class17.field209);
        for (int var2 = 0; var2 < class311.field5374; var2++) {
            int var3 = class256.field4525.method543(class210.method1453((byte) -109, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class311.field5374 * 15 + 21;
        int var5 = class184.field3382 - (var1 / 2);
        int var6 = class195.field3537;
        if (class73.field1110 < var5 + var1) {
            var5 = class73.field1110 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (arg0 != -19775) {
            method612(124);
        }
        if (var4 + var6 > class21.field331) {
            var6 = class21.field331 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class324.field5528 == 1) {
            if (class184.field3382 == class134.field2314 && class261.field4604 == class195.field3537) {
                class62.field989 = true;
                class167.field2998 = var1;
                class324.field5528 = 0;
                class296.field5167 = var6;
                class203.field3665 = var5;
                class190.field3453 = class311.field5374 * 15 + 22;
            }
        } else if (class87.field1382 == class184.field3382 && class195.field3537 == class170.field3041) {
            class203.field3665 = var5;
            class190.field3453 = class311.field5374 * 15 + 22;
            class324.field5528 = 0;
            class62.field989 = true;
            class167.field2998 = var1;
            class296.field5167 = var6;
        } else {
            class134.field2314 = class87.field1382;
            class324.field5528 = 1;
            class261.field4604 = class170.field3041;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 560)
    public class90() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(II)[I", line = 585)
    public final int[] method120(int arg0, int arg1) {
        field1420++;
        if (arg0 > -95) {
            field1424 = (class108) null;
        }
        return class61.field979;
    }
}
