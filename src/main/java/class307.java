import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class307 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lie;")
    public static class94 field4742 = new class94(5000);

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4745 = "flash1:";

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field4747 = 0;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4754 = "glow1:";

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public int field4741;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public int field4744;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2157(int arg0, int arg1) {
        class89.field1108.method1236(-495037017, arg0);
        field4752++;
        int var2 = -118 % ((arg1 + 10) / 48);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 26)
    public static void method2158(byte arg0) {
        if (arg0 <= -77) {
            field4754 = null;
            field4745 = null;
            field4742 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 44)
    public static final void method2159(int arg0) {
        field4753++;
        if (class60.field739 == 0 || class60.field739 == 5 || arg0 <= 97) {
            return;
        }
        try {
            if ((++class336.field5179) > 2000) {
                if (class236.field3463 != null) {
                    class236.field3463.method1096((byte) 86);
                    class236.field3463 = null;
                }
                if (class157.field2173 >= 1) {
                    class60.field739 = 0;
                    class255.field3876 = -5;
                    return;
                }
                if (class152.field2095 == class15.field200) {
                    class152.field2095 = field4746;
                } else {
                    class152.field2095 = class15.field200;
                }
                class336.field5179 = 0;
                class60.field739 = 1;
                class157.field2173++;
            }
            if (class60.field739 == 1) {
                class163.field2259 = class9.field131.method1915(class320.field4916, class152.field2095, false);
                class60.field739 = 2;
            }
            if (class60.field739 == 2) {
                if (class163.field2259.field238 == 2) {
                    throw new IOException();
                }
                if (class163.field2259.field238 != 1) {
                    return;
                }
                class236.field3463 = new class167((Socket) class163.field2259.field241, class9.field131);
                class163.field2259 = null;
                long var1 = class267.field4208 = class48.method285((byte) -90, class222.field3147);
                class140.field1954.field1400 = 0;
                class140.field1954.method648(14, (byte) 38);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class140.field1954.method648(var3, (byte) 38);
                class236.field3463.method1097(class140.field1954.field1388, 0, true, 2);
                if (class170.field2380 != null) {
                    class170.field2380.method1717(-7234);
                }
                if (class224.field3186 != null) {
                    class224.field3186.method1717(-7234);
                }
                int var4 = class236.field3463.method1094((byte) 67);
                if (class170.field2380 != null) {
                    class170.field2380.method1717(-7234);
                }
                if (class224.field3186 != null) {
                    class224.field3186.method1717(-7234);
                }
                if (var4 != 0) {
                    class60.field739 = 0;
                    class255.field3876 = var4;
                    class236.field3463.method1096((byte) 76);
                    class236.field3463 = null;
                    return;
                }
                class60.field739 = 3;
            }
            if (class60.field739 == 3) {
                if (class236.field3463.method1091((byte) 18) < 8) {
                    return;
                }
                class236.field3463.method1092(0, 8, -1, field4742.field1388);
                field4742.field1400 = 0;
                class222.field3142 = field4742.method651(-13052);
                class140.field1954.field1400 = 0;
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class222.field3142 >> 32), (int) class222.field3142 };
                class140.field1954.method648(10, (byte) 38);
                class140.field1954.method641(1773202520, var5[0]);
                class140.field1954.method641(1773202520, var5[1]);
                class140.field1954.method641(1773202520, var5[2]);
                class140.field1954.method641(1773202520, var5[3]);
                class140.field1954.method678(class48.method285((byte) -90, class222.field3147), (byte) 118);
                class140.field1954.method636(255, class321.field4936);
                class140.field1954.method644(-1, class16.field219, class176.field2560);
                class221.field3120.field1400 = 0;
                if (class17.field236 == 40) {
                    class221.field3120.method648(18, (byte) 38);
                } else {
                    class221.field3120.method648(16, (byte) 38);
                }
                class221.field3120.method662(true, 163 - (-class140.field1954.field1400 - class309.method2164(class230.field3363, (byte) 117)));
                class221.field3120.method641(1773202520, 542);
                class221.field3120.method648(class304.field4719, (byte) 38);
                class221.field3120.method648(class175.field2511 ? 1 : 0, (byte) 38);
                class221.field3120.method648(1, (byte) 38);
                class221.field3120.method648(client.method1954(true), (byte) 38);
                class221.field3120.method662(true, class188.field2712);
                class221.field3120.method662(true, class314.field4847);
                class221.field3120.method648(class67.field878, (byte) 38);
                class161.method1061(class221.field3120, -114);
                class221.field3120.method636(255, class230.field3363);
                class221.field3120.method641(1773202520, class244.field3667);
                class221.field3120.method641(1773202520, class10.method49(0));
                class136.field1881 = true;
                class221.field3120.method662(true, class196.field2815);
                class221.field3120.method641(1773202520, class283.field4439.method1206(109));
                class221.field3120.method641(1773202520, class120.field1686.method1206(100));
                class221.field3120.method641(1773202520, class165.field2284.method1206(107));
                class221.field3120.method641(1773202520, class48.field568.method1206(69));
                class221.field3120.method641(1773202520, class148.field2060.method1206(67));
                class221.field3120.method641(1773202520, class222.field3133.method1206(105));
                class221.field3120.method641(1773202520, class318.field4892.method1206(70));
                class221.field3120.method641(1773202520, class48.field582.method1206(89));
                class221.field3120.method641(1773202520, class164.field2271.method1206(118));
                class221.field3120.method641(1773202520, class311.field4818.method1206(120));
                class221.field3120.method641(1773202520, class67.field864.method1206(124));
                class221.field3120.method641(1773202520, class320.field4914.method1206(122));
                class221.field3120.method641(1773202520, class254.field3862.method1206(70));
                class221.field3120.method641(1773202520, class78.field979.method1206(89));
                class221.field3120.method641(1773202520, class56.field677.method1206(67));
                class221.field3120.method641(1773202520, class326.field4989.method1206(91));
                class221.field3120.method641(1773202520, class237.field3480.method1206(78));
                class221.field3120.method641(1773202520, class261.field3951.method1206(94));
                class221.field3120.method641(1773202520, class206.field2881.method1206(101));
                class221.field3120.method641(1773202520, class140.field1955.method1206(106));
                class221.field3120.method641(1773202520, class128.field1765.method1206(120));
                class221.field3120.method641(1773202520, class140.field1952.method1206(81));
                class221.field3120.method641(1773202520, class289.field4534.method1206(96));
                class221.field3120.method641(1773202520, class206.field2889.method1206(118));
                class221.field3120.method641(1773202520, class60.field733.method1206(76));
                class221.field3120.method641(1773202520, class128.field1761.method1206(116));
                class221.field3120.method641(1773202520, class191.field2760.method1206(107));
                class221.field3120.method641(1773202520, class339.field5267.method1206(90));
                class221.field3120.method641(1773202520, class253.field3839.method1206(76));
                class221.field3120.method665(class140.field1954.field1400, class140.field1954.field1388, -127, 0);
                class236.field3463.method1097(class221.field3120.field1388, 0, true, class221.field3120.field1400);
                class140.field1954.method574((byte) -89, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                field4742.method574((byte) -82, var5);
                class60.field739 = 4;
            }
            if (class60.field739 == 4) {
                if (class236.field3463.method1091((byte) 18) < 1) {
                    return;
                }
                int var7 = class236.field3463.method1094((byte) 67);
                if (var7 == 21) {
                    class60.field739 = 7;
                } else if (var7 == 29) {
                    class60.field739 = 10;
                } else if (var7 == 1) {
                    class255.field3876 = var7;
                    class60.field739 = 5;
                    return;
                } else if (var7 == 2) {
                    class60.field739 = 8;
                } else if (var7 == 15) {
                    class255.field3876 = var7;
                    class60.field739 = 0;
                    return;
                } else if (var7 == 23 && class157.field2173 < 1) {
                    class336.field5179 = 0;
                    class60.field739 = 1;
                    class157.field2173++;
                    class236.field3463.method1096((byte) 89);
                    class236.field3463 = null;
                    return;
                } else {
                    class60.field739 = 0;
                    class255.field3876 = var7;
                    class236.field3463.method1096((byte) 88);
                    class236.field3463 = null;
                    return;
                }
            }
            if (class60.field739 == 6) {
                class140.field1954.field1400 = 0;
                class140.field1954.method573(123, 17);
                class236.field3463.method1097(class140.field1954.field1388, 0, true, class140.field1954.field1400);
                class60.field739 = 4;
                return;
            }
            if (class60.field739 == 7) {
                if (class236.field3463.method1091((byte) 18) < 1) {
                    return;
                }
                class145.field2014 = (class236.field3463.method1094((byte) 67) + 3) * 60;
                class60.field739 = 0;
                class255.field3876 = 21;
                class236.field3463.method1096((byte) 99);
                class236.field3463 = null;
                return;
            }
            if (class60.field739 == 10) {
                if (class236.field3463.method1091((byte) 18) < 1) {
                    return;
                }
                class322.field4945 = class236.field3463.method1094((byte) 67);
                class60.field739 = 0;
                class255.field3876 = 29;
                class236.field3463.method1096((byte) 117);
                class236.field3463 = null;
                return;
            }
            if (class60.field739 == 8) {
                if (class236.field3463.method1091((byte) 18) < 14) {
                    return;
                }
                class236.field3463.method1092(0, 14, -1, field4742.field1388);
                field4742.field1400 = 0;
                class154.field2151 = field4742.method661(-1);
                class262.field3958 = field4742.method661(-1);
                class270.field4257 = field4742.method661(-1) == 1;
                class136.field1884 = field4742.method661(-1) == 1;
                class275.field4289 = field4742.method661(-1) == 1;
                class316.field4872 = field4742.method661(-1) == 1;
                class220.field3100 = field4742.method661(-1) == 1;
                class117.field1655 = field4742.method624(14612);
                class14.field194 = field4742.method661(-1) == 1;
                class141.field1969 = field4742.method661(-1) == 1;
                class262.method1883(25654, class141.field1969);
                class128.method853(124, class141.field1969);
                if (!class175.field2511) {
                    if ((!class270.field4257 || class275.field4289) && !class14.field194) {
                        try {
                            class122.method824(class9.field131.field4179, 25315, "unzap");
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class122.method824(class9.field131.field4179, 25315, "zap");
                        } catch (Throwable var13) {
                        }
                    }
                }
                try {
                    class122.method824(class9.field131.field4179, 25315, "loggedin");
                } catch (Throwable var12) {
                }
                class308.field4757 = field4742.method567((byte) 5);
                class132.field1817 = field4742.method624(14612);
                class60.field739 = 9;
            }
            if (class60.field739 == 9) {
                if (class236.field3463.method1091((byte) 18) >= class132.field1817) {
                    field4742.field1400 = 0;
                    class236.field3463.method1092(0, class132.field1817, -1, field4742.field1388);
                    class60.field739 = 0;
                    class255.field3876 = 2;
                    class125.method843(0);
                    class146.field2033 = -1;
                    class128.method854(false, (byte) 127);
                    class308.field4757 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class236.field3463 != null) {
                class236.field3463.method1096((byte) 78);
                class236.field3463 = null;
            }
            if (class157.field2173 >= 1) {
                class60.field739 = 0;
                class255.field3876 = -4;
            } else {
                class60.field739 = 1;
                class336.field5179 = 0;
                if (class152.field2095 == class15.field200) {
                    class152.field2095 = field4746;
                } else {
                    class152.field2095 = class15.field200;
                }
                class157.field2173++;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V")
    public abstract void method1657(int arg0, int arg1);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public abstract void method1653(int arg0, int arg1, int arg2);
}
