import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 {

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public int field142 = -1;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public int field139 = -1;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field136 = 0;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public int field147 = -1;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public int field152 = 0;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public int field141 = -1;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public int field155 = -1;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field144 = -1;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public int field138 = -1;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public int field150 = -1;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public int field157 = 0;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public int field158 = 0;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public int field153 = -1;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public int field145 = -1;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public int field151 = 0;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public int field159 = -1;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public int field160 = 0;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public int field167 = -1;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public int field149 = 0;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public int field168 = -1;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public int field170 = 0;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public int field154 = -1;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public int field169 = -1;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public int field174 = -1;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public int field148 = -1;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public int field173 = -1;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public int field171 = 0;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public int field166 = -1;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public int field165 = -1;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public int field175 = -1;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field135 = 0;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public int field164 = -1;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field162 = 0;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field140 = 0;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lta;")
    public static class262 field176 = new class262(100);

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Ljava/lang/String;")
    public static String field177 = "Loading config - ";

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field179 = -1;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field180 = 1;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "J")
    public static long field181;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[[I")
    public int[][] field137;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static final void method92(byte arg0) {
        field172++;
        class261.field4006 = new class188[class143.field2217.method1167(-128)][];
        int var1 = 56 / ((23 - arg0) / 51);
        class142.field2184 = new boolean[class143.field2217.method1167(-124)];
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static final void method93(byte arg0) {
        if (arg0 > -78) {
            field162 = -103;
        }
        field178++;
        if (field182 == 0 || field182 == 5) {
            return;
        }
        try {
            if ((++class171.field2543) > 2000) {
                if (class118.field1829 != null) {
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                }
                if (class6.field108 >= 1) {
                    field182 = 0;
                    class35.field572 = -5;
                    return;
                }
                field182 = 1;
                class171.field2543 = 0;
                if (class6.field104 == class51.field810) {
                    class6.field104 = class88.field1446;
                } else {
                    class6.field104 = class51.field810;
                }
                class6.field108++;
            }
            if (field182 == 1) {
                class272.field4302 = class22.field329.method480(class6.field104, (byte) -117, class217.field3374);
                field182 = 2;
            }
            if (field182 == 2) {
                if (class272.field4302.field3828 == 2) {
                    throw new IOException();
                }
                if (class272.field4302.field3828 != 1) {
                    return;
                }
                class118.field1829 = new class184((Socket) class272.field4302.field3831, class22.field329);
                class272.field4302 = null;
                long var1 = field181 = class247.method1668(class148.field2282, true);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class292.field4607.field588 = 0;
                class292.field4607.method287(440742616, 14);
                class292.field4607.method287(440742616, var3);
                class118.field1829.method1243(0, class292.field4607.field583, 2, (byte) -112);
                if (class33.field531 != null) {
                    class33.field531.method66((byte) 122);
                }
                if (class46.field737 != null) {
                    class46.field737.method66((byte) 122);
                }
                int var4 = class118.field1829.method1232(22221);
                if (class33.field531 != null) {
                    class33.field531.method66((byte) 122);
                }
                if (class46.field737 != null) {
                    class46.field737.method66((byte) 122);
                }
                if (var4 != 0) {
                    class35.field572 = var4;
                    field182 = 0;
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                    return;
                }
                field182 = 3;
            }
            if (field182 == 3) {
                if (class118.field1829.method1240((byte) 29) < 8) {
                    return;
                }
                class118.field1829.method1231(0, class239.field3692.field583, 8, 0);
                int[] var5 = new int[4];
                class239.field3692.field588 = 0;
                class205.field3196 = class239.field3692.method315(1744669920);
                class292.field4607.field588 = 0;
                var5[3] = (int) class205.field3196;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class205.field3196 >> 32);
                class292.field4607.method287(440742616, 10);
                class292.field4607.method289(var5[0], -125);
                class292.field4607.method289(var5[1], 50);
                class292.field4607.method289(var5[2], 51);
                class292.field4607.method289(var5[3], -125);
                class292.field4607.method337(2103219728, class247.method1668(class148.field2282, true));
                class292.field4607.method321(-72, class167.field2529);
                class292.field4607.method340(class186.field2806, -3350, class76.field1281);
                class5.field85.field588 = 0;
                if (class239.field3715 == 40) {
                    class5.field85.method287(440742616, 18);
                } else {
                    class5.field85.method287(440742616, 16);
                }
                class5.field85.method312(1489253544, class292.field4607.field588 + class39.method343(class174.field2588, 5509) + 163);
                class5.field85.method289(542, 17);
                class5.field85.method287(440742616, class153.field2345);
                class5.field85.method287(440742616, class191.field3038 ? 1 : 0);
                class5.field85.method287(440742616, 0);
                class5.field85.method287(440742616, class245.method1659(75));
                class5.field85.method312(1489253544, class35.field573);
                class5.field85.method312(1489253544, class277.field4369);
                class5.field85.method287(440742616, class30.field474);
                class197.method1319(class5.field85, 120);
                class5.field85.method321(34, class174.field2588);
                class5.field85.method289(class274.field4315, -128);
                class5.field85.method289(class149.method1015((byte) 82), -31);
                class258.field3956 = true;
                class5.field85.method312(1489253544, class109.field1741);
                class5.field85.method289(class221.field3461.method1161(100), -127);
                class5.field85.method289(class99.field1584.method1161(100), 12);
                class5.field85.method289(class285.field4487.method1161(100), -127);
                class5.field85.method289(class190.field3029.method1161(100), -125);
                class5.field85.method289(class72.field1152.method1161(100), -126);
                class5.field85.method289(client.field2408.method1161(100), -126);
                class5.field85.method289(class158.field2427.method1161(100), 37);
                class5.field85.method289(class259.field3983.method1161(100), -19);
                class5.field85.method289(class90.field1459.method1161(100), -125);
                class5.field85.method289(class214.field3304.method1161(100), 1);
                class5.field85.method289(class203.field3163.method1161(100), -128);
                class5.field85.method289(class146.field2273.method1161(100), 27);
                class5.field85.method289(class111.field1747.method1161(100), -127);
                class5.field85.method289(class230.field3591.method1161(100), 2);
                class5.field85.method289(class78.field1313.method1161(100), -128);
                class5.field85.method289(class289.field4558.method1161(100), 107);
                class5.field85.method289(class51.field806.method1161(100), -125);
                class5.field85.method289(class237.field3674.method1161(100), 85);
                class5.field85.method289(class215.field3313.method1161(100), 20);
                class5.field85.method289(class204.field3182.method1161(100), -18);
                class5.field85.method289(class251.field3855.method1161(100), 56);
                class5.field85.method289(class188.field3007.method1161(100), -126);
                class5.field85.method289(class133.field2055.method1161(100), -126);
                class5.field85.method289(class211.field3271.method1161(100), -21);
                class5.field85.method289(class228.field3566.method1161(100), 112);
                class5.field85.method289(class23.field361.method1161(100), 86);
                class5.field85.method289(class207.field3209.method1161(100), 60);
                class5.field85.method289(class71.field1130.method1161(100), -126);
                class5.field85.method289(class260.field4000.method1161(100), 110);
                class5.field85.method296(0, class292.field4607.field583, class292.field4607.field588, -20484);
                class118.field1829.method1243(0, class5.field85.field583, class5.field85.field588, (byte) -122);
                class292.field4607.method1257(-88, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class239.field3692.method1257(-116, var5);
                field182 = 4;
            }
            if (field182 == 4) {
                if (class118.field1829.method1240((byte) 17) < 1) {
                    return;
                }
                int var7 = class118.field1829.method1232(22221);
                if (var7 == 21) {
                    field182 = 7;
                } else if (var7 == 29) {
                    field182 = 10;
                } else if (var7 == 1) {
                    field182 = 5;
                    class35.field572 = var7;
                    return;
                } else if (var7 == 2) {
                    field182 = 8;
                } else if (var7 == 15) {
                    class35.field572 = var7;
                    field182 = 0;
                    return;
                } else if (var7 == 23 && class6.field108 < 1) {
                    class6.field108++;
                    class171.field2543 = 0;
                    field182 = 1;
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                    return;
                } else {
                    field182 = 0;
                    class35.field572 = var7;
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                    return;
                }
            }
            if (field182 == 6) {
                class292.field4607.field588 = 0;
                class292.field4607.method1251(17, (byte) -91);
                class118.field1829.method1243(0, class292.field4607.field583, class292.field4607.field588, (byte) -123);
                field182 = 4;
            } else if (field182 == 7) {
                if (class118.field1829.method1240((byte) 39) >= 1) {
                    class171.field2549 = (class118.field1829.method1232(22221) + 3) * 60;
                    field182 = 0;
                    class35.field572 = 21;
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                }
            } else if (field182 != 10) {
                if (field182 == 8) {
                    if (class118.field1829.method1240((byte) 125) < 14) {
                        return;
                    }
                    class118.field1829.method1231(0, class239.field3692.field583, 14, 0);
                    class239.field3692.field588 = 0;
                    class259.field3968 = class239.field3692.method333((byte) -59);
                    class209.field3253 = class239.field3692.method333((byte) -59);
                    class65.field1041 = class239.field3692.method333((byte) -59) == 1;
                    class31.field503 = class239.field3692.method333((byte) -59) == 1;
                    class296.field4672 = class239.field3692.method333((byte) -59) == 1;
                    class166.field2513 = class239.field3692.method333((byte) -59) == 1;
                    class251.field3864 = class239.field3692.method333((byte) -59) == 1;
                    class294.field4623 = class239.field3692.method293(-127);
                    class286.field4492 = class239.field3692.method333((byte) -59) == 1;
                    class249.field3844 = class239.field3692.method333((byte) -59) == 1;
                    class17.method159(class249.field3844, (byte) 11);
                    class208.method1392(true, class249.field3844);
                    if (!class191.field3038) {
                        if ((!class65.field1041 || class296.field4672) && !class286.field4492) {
                            try {
                                class138.method959("unzap", (byte) -62, class22.field329.field934);
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class138.method959("zap", (byte) -88, class22.field329.field934);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    try {
                        class138.method959("loggedin", (byte) -82, class22.field329.field934);
                    } catch (Throwable var8) {
                    }
                    class146.field2259 = class239.field3692.method1248(-31);
                    class79.field1329 = class239.field3692.method293(-77);
                    field182 = 9;
                }
                if (field182 == 9 && class118.field1829.method1240((byte) 29) >= class79.field1329) {
                    class239.field3692.field588 = 0;
                    class118.field1829.method1231(0, class239.field3692.field583, class79.field1329, 0);
                    field182 = 0;
                    class35.field572 = 2;
                    class70.method545(0);
                    class147.field2279 = -1;
                    class239.method1611(18589, false);
                    class146.field2259 = -1;
                }
            } else if (class118.field1829.method1240((byte) 57) >= 1) {
                class92.field1480 = class118.field1829.method1232(22221);
                field182 = 0;
                class35.field572 = 29;
                class118.field1829.method1242((byte) 113);
                class118.field1829 = null;
            }
        } catch (IOException var11) {
            if (class118.field1829 != null) {
                class118.field1829.method1242((byte) 113);
                class118.field1829 = null;
            }
            if (class6.field108 < 1) {
                field182 = 1;
                class6.field108++;
                class171.field2543 = 0;
                if (class6.field104 == class51.field810) {
                    class6.field104 = class88.field1446;
                } else {
                    class6.field104 = class51.field810;
                }
            } else {
                class35.field572 = -4;
                field182 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public static final void method94(byte arg0) {
        if (arg0 == -12) {
            field163++;
            class70.field1120.method1783(0);
            class39.field649.method1783(0);
            class203.field3169.method1783(0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIB)I")
    public static final int method95(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field134++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg3 != 125) {
                field177 = null;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    public static final void method96(int arg0, int arg1) {
        if (arg0 >= -109) {
            method92((byte) 19);
        }
        field156++;
        if (class295.field4641 == 0) {
            class61.field988.method1746(arg1, (byte) 100);
        } else {
            class174.field2583 = arg1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lf;B)V")
    public final void method97(class37 arg0, byte arg1) {
        if (arg1 > -78) {
            this.field152 = -118;
        }
        while (true) {
            int var3 = arg0.method333((byte) -59);
            if (var3 == 0) {
                field146++;
                return;
            }
            this.method99(var3, arg0, 62);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public final void method98(int arg0) {
        if (arg0 != 0) {
            method100(37);
        }
        field161++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILf;I)V")
    private final void method99(int arg0, class37 arg1, int arg2) {
        field143++;
        int var4 = -24 / ((arg2 + 26) / 42);
        if (arg0 == 1) {
            this.field142 = arg1.method293(-127);
            this.field165 = arg1.method293(112);
            if (this.field142 == 65535) {
                this.field142 = -1;
            }
            if (this.field165 == 65535) {
                this.field165 = -1;
            }
        } else if (arg0 == 2) {
            this.field148 = arg1.method293(124);
        } else if (arg0 == 3) {
            this.field159 = arg1.method293(-112);
        } else if (arg0 == 4) {
            this.field153 = arg1.method293(-103);
        } else if (arg0 == 5) {
            this.field166 = arg1.method293(-90);
        } else if (arg0 == 6) {
            this.field167 = arg1.method293(119);
        } else if (arg0 == 7) {
            this.field144 = arg1.method293(118);
        } else if (arg0 == 8) {
            this.field164 = arg1.method293(96);
        } else if (arg0 == 9) {
            this.field155 = arg1.method293(127);
        } else if (arg0 == 26) {
            this.field157 = (short) (arg1.method333((byte) -59) * 4);
            this.field152 = (short) (arg1.method333((byte) -59) * 4);
        } else if (arg0 == 27) {
            if (this.field137 == null) {
                this.field137 = new int[12][];
            }
            int var5 = arg1.method333((byte) -59);
            this.field137[var5] = new int[6];
            for (int var6 = 0; var6 < 6; var6++) {
                this.field137[var5][var6] = arg1.method306(121);
            }
        } else if (arg0 == 29) {
            this.field171 = arg1.method333((byte) -59);
        } else if (arg0 == 30) {
            this.field170 = arg1.method293(95);
        } else if (arg0 == 31) {
            this.field136 = arg1.method333((byte) -59);
        } else if (arg0 == 32) {
            this.field151 = arg1.method293(-101);
        } else if (arg0 == 33) {
            this.field149 = arg1.method306(73);
        } else if (arg0 == 34) {
            this.field158 = arg1.method333((byte) -59);
        } else if (arg0 == 35) {
            this.field135 = arg1.method293(103);
        } else if (arg0 == 36) {
            this.field160 = arg1.method306(124);
        } else if (arg0 == 37) {
            this.field139 = arg1.method333((byte) -59);
        } else if (arg0 == 38) {
            this.field168 = arg1.method293(102);
        } else if (arg0 == 39) {
            this.field169 = arg1.method293(-71);
        } else if (arg0 == 40) {
            this.field145 = arg1.method293(97);
        } else if (arg0 == 41) {
            this.field173 = arg1.method293(-63);
        } else if (arg0 == 42) {
            this.field141 = arg1.method293(-17);
        } else if (arg0 == 43) {
            arg1.method293(92);
        } else if (arg0 == 44) {
            arg1.method293(114);
        } else if (arg0 == 45) {
            arg1.method293(111);
        } else if (arg0 == 46) {
            this.field147 = arg1.method293(-42);
        } else if (arg0 == 47) {
            this.field154 = arg1.method293(-56);
        } else if (arg0 == 48) {
            this.field174 = arg1.method293(120);
        } else if (arg0 == 49) {
            this.field150 = arg1.method293(-102);
            return;
        } else if (arg0 == 50) {
            this.field175 = arg1.method293(94);
            return;
        } else if (arg0 == 51) {
            this.field138 = arg1.method293(-52);
            return;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public static void method100(int arg0) {
        field176 = null;
        field177 = null;
        if (arg0 != -1) {
            method96(-90, 101);
        }
    }
}
