import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class444 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    private int field6080 = -1;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    private int field6088 = 0;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lwl;")
    private class280 field6085 = new class280();

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Z")
    public boolean field6091 = false;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    private int field6082;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    private int field6078;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "[Ljm;")
    private class484[] field6084;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[[[I")
    private int[][][] field6081;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "J")
    public static long field6087 = 0L;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Lem;")
    public static class149 field6089;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 4)
    public final void method2558(int arg0) {
        field6086++;
        for (int var2 = 0; var2 < this.field6078; var2++) {
            this.field6081[var2][0] = null;
            this.field6081[var2][1] = null;
            this.field6081[var2][2] = null;
            this.field6081[var2] = null;
        }
        this.field6081 = null;
        this.field6084 = null;
        this.field6085.method1670((byte) -104);
        this.field6085 = null;
        if (arg0 < 81) {
            method2559(-46);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(III)V", line = 596)
    public class444(int arg0, int arg1, int arg2) {
        this.field6082 = arg1;
        this.field6078 = arg0;
        this.field6084 = new class484[this.field6082];
        this.field6081 = new int[this.field6078][3][arg2];
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 37)
    public static void method2559(int arg0) {
        if (arg0 <= 102) {
            method2559(-126);
        }
        field6089 = null;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)[[[I", line = 47)
    public final int[][][] method2560(int arg0) {
        field6077++;
        if (this.field6082 != this.field6078) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != 28427) {
            this.field6084 = null;
        }
        while (var2 < this.field6078) {
            this.field6084[var2] = class140.field2037;
            var2++;
        }
        return this.field6081;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I", line = 75)
    public final int[][] method2561(int arg0, int arg1) {
        field6079++;
        if (arg1 != 0) {
            return null;
        } else if (this.field6082 == this.field6078) {
            this.field6091 = this.field6084[arg0] == null;
            this.field6084[arg0] = class140.field2037;
            return this.field6081[arg0];
        } else if (this.field6078 == 1) {
            this.field6091 = this.field6080 != arg0;
            this.field6080 = arg0;
            return this.field6081[0];
        } else {
            class484 var3 = this.field6084[arg0];
            if (var3 == null) {
                this.field6091 = true;
                if (this.field6078 <= this.field6088) {
                    class484 var4 = (class484) this.field6085.method1673(101);
                    var3 = new class484(arg0, var4.field6736);
                    this.field6084[var4.field6737] = null;
                    var4.method300(false);
                } else {
                    var3 = new class484(arg0, this.field6088);
                    this.field6088++;
                }
                this.field6084[arg0] = var3;
            } else {
                this.field6091 = false;
            }
            this.field6085.method1659((byte) 34, var3);
            return this.field6081[var3.field6736];
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V", line = 146)
    public static final void method2562(int arg0) {
        field6083++;
        if (class27.field459 == 0 || class27.field459 == 5) {
            return;
        }
        try {
            if ((++class513.field7560) > 2000) {
                if (class304.field4004 != null) {
                    class304.field4004.method1886(-1);
                    class304.field4004 = null;
                }
                if (class241.field3221 >= 1) {
                    class458.field6312 = -5;
                    class27.field459 = 0;
                    return;
                }
                if (class456.field6271 == class437.field5997) {
                    class456.field6271 = class477.field6572;
                } else {
                    class456.field6271 = class437.field5997;
                }
                class27.field459 = 1;
                class241.field3221++;
                class513.field7560 = 0;
            }
            if (class27.field459 == 1) {
                class354.field4786 = class389.field5281.method1376(1, class456.field6271, class273.field3588);
                class27.field459 = 2;
            }
            if (class27.field459 == 2) {
                if (class354.field4786.field6100 == 2) {
                    throw new IOException();
                }
                if (class354.field4786.field6100 != 1) {
                    return;
                }
                class304.field4004 = new class326((Socket) class354.field4786.field6104, class389.field5281);
                class354.field4786 = null;
                long var1 = class428.field5859 = class33.method259(class266.field3513, 0);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class193.field2708.field5173 = 0;
                class193.field2708.method2200(7, class514.field7572.field1514);
                class193.field2708.method2200(7, var3);
                class304.field4004.method1880(class193.field2708.field5152, 95, 0, 2);
                class242.method1488((byte) 81);
                int var4 = class304.field4004.method1887((byte) -124);
                class242.method1488((byte) 81);
                if (var4 != 0) {
                    class27.field459 = 0;
                    class458.field6312 = var4;
                    class304.field4004.method1886(-1);
                    class304.field4004 = null;
                    return;
                }
                class27.field459 = 3;
            }
            if (class27.field459 == 3) {
                if (class304.field4004.method1879(0) < 8) {
                    return;
                }
                class304.field4004.method1884(8, class481.field6632.field5152, 0, (byte) 125);
                class481.field6632.field5173 = 0;
                class359.field4844 = class481.field6632.method2220(943016720);
                class379 var5 = new class379(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class359.field4844 >> 32), (int) class359.field4844 };
                var5.method2200(7, 10);
                var5.method2214(34, var6[0]);
                var5.method2214(106, var6[1]);
                var5.method2214(109, var6[2]);
                var5.method2214(79, var6[3]);
                var5.method2193(class33.method259(class266.field3513, 0), -128);
                var5.method2216(class494.field6860, -114);
                var5.method2250(class477.field6575, class234.field3150, (byte) 125);
                class193.field2708.field5173 = 0;
                if (class454.field6161 == 40) {
                    class193.field2708.method2200(7, class514.field7578.field1514);
                } else {
                    class193.field2708.method2200(7, class514.field7576.field1514);
                }
                class193.field2708.method2246(0, (byte) -105);
                int var7 = class193.field2708.field5173;
                class193.field2708.method2214(78, 585);
                class193.field2708.method2200(7, class365.field4945);
                class193.field2708.method2200(7, class170.method1136((byte) 102));
                class193.field2708.method2246(class149.field2132, (byte) -110);
                class193.field2708.method2246(class175.field2555, (byte) -83);
                class193.field2708.method2200(7, class154.field2244.field7756);
                class240.method1478(class193.field2708, true);
                class193.field2708.method2216(class88.field1341, -121);
                class193.field2708.method2214(15, class213.field2891);
                class379 var8 = class154.field2244.method1853((byte) -72);
                class193.field2708.method2200(7, var8.field5173);
                class193.field2708.method2211(0, var8.field5173, var8.field5152, (byte) -111);
                class121.field1774 = true;
                class193.field2708.method2246(class47.field710, (byte) -95);
                class193.field2708.method2214(87, class226.field3056.method2726(-12075));
                class193.field2708.method2214(62, class124.field1821.method2726(-12075));
                class193.field2708.method2214(53, class258.field3420.method2726(-12075));
                class193.field2708.method2214(28, class184.field2619.method2726(-12075));
                class193.field2708.method2214(126, class50.field774.method2726(-12075));
                class193.field2708.method2214(9, class88.field1340.method2726(-12075));
                class193.field2708.method2214(86, class449.field6118.method2726(-12075));
                class193.field2708.method2214(11, class505.field6946.method2726(-12075));
                class193.field2708.method2214(74, class71.field1082.method2726(-12075));
                class193.field2708.method2214(104, class273.field3581.method2726(-12075));
                class193.field2708.method2214(52, class131.field1899.method2726(-12075));
                class193.field2708.method2214(14, class53.field816.method2726(-12075));
                class193.field2708.method2214(76, class48.field752.method2726(-12075));
                class193.field2708.method2214(92, class201.field2790.method2726(-12075));
                class193.field2708.method2214(91, class204.field2826.method2726(-12075));
                class193.field2708.method2214(84, class496.field6878.method2726(-12075));
                class193.field2708.method2214(80, class347.field4685.method2726(-12075));
                class193.field2708.method2214(74, class149.field2130.method2726(-12075));
                class193.field2708.method2214(29, class280.field3677.method2726(-12075));
                class193.field2708.method2214(95, class277.field3630.method2726(-12075));
                class193.field2708.method2214(79, class435.field5973.method2726(-12075));
                class193.field2708.method2214(122, class48.field753.method2726(-12075));
                class193.field2708.method2214(32, class366.field4956.method2726(-12075));
                class193.field2708.method2214(24, class393.field5326.method2726(-12075));
                class193.field2708.method2214(116, class150.field2136.method2726(-12075));
                class193.field2708.method2214(52, class461.field6375.method2726(-12075));
                class193.field2708.method2214(100, class98.field1471.method2726(-12075));
                class193.field2708.method2214(40, class226.field3054.method2726(-12075));
                class193.field2708.method2214(69, class23.field403.method2726(-12075));
                class193.field2708.method2214(77, class359.field4848.method2726(-12075));
                class193.field2708.method2211(0, var5.field5173, var5.field5152, (byte) -111);
                class193.field2708.method2224(class193.field2708.field5173 - var7, false);
                class304.field4004.method1880(class193.field2708.field5152, 111, 0, class193.field2708.field5173);
                class193.field2708.method754(var6, 0);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class481.field6632.method754(var6, 0);
                class27.field459 = 4;
            }
            if (class27.field459 == 4) {
                if (class304.field4004.method1879(0) < 1) {
                    return;
                }
                int var10 = class304.field4004.method1887((byte) -125);
                if (var10 == 21) {
                    class27.field459 = 7;
                } else if (var10 == 29) {
                    class27.field459 = 11;
                } else if (var10 == 1) {
                    class27.field459 = 5;
                    class458.field6312 = var10;
                    return;
                } else if (var10 == 2) {
                    class27.field459 = 8;
                } else if (var10 == 15) {
                    class27.field459 = 12;
                    class219.field2965 = -2;
                } else if (var10 == 23 && class241.field3221 < 1) {
                    class27.field459 = 1;
                    class513.field7560 = 0;
                    class241.field3221++;
                    class304.field4004.method1886(-1);
                    class304.field4004 = null;
                    return;
                } else {
                    class458.field6312 = var10;
                    class27.field459 = 0;
                    class304.field4004.method1886(-1);
                    class304.field4004 = null;
                    return;
                }
            }
            if (class27.field459 == 6) {
                class193.field2708.field5173 = 0;
                class193.field2708.method749((byte) 107, class514.field7577.field1514);
                class304.field4004.method1880(class193.field2708.field5152, 88, 0, class193.field2708.field5173);
                class27.field459 = 4;
            } else {
                int var11 = 32 % ((arg0 - 90) / 36);
                if (class27.field459 == 7) {
                    if (class304.field4004.method1879(0) >= 1) {
                        class382.field5209 = (class304.field4004.method1887((byte) 9) + 3) * 60;
                        class27.field459 = 0;
                        class458.field6312 = 21;
                        class304.field4004.method1886(-1);
                        class304.field4004 = null;
                    }
                } else if (class27.field459 != 11) {
                    if (class27.field459 == 8) {
                        if (class304.field4004.method1879(0) < 13) {
                            return;
                        }
                        class304.field4004.method1884(13, class481.field6632.field5152, 0, (byte) 126);
                        class481.field6632.field5173 = 0;
                        class196.field2745 = class481.field6632.method2238(255);
                        class131.field1898 = class481.field6632.method2238(255);
                        class16.field282 = class481.field6632.method2238(255) == 1;
                        class513.field7557 = class481.field6632.method2238(255) == 1;
                        class406.field5591 = class481.field6632.method2238(255) == 1;
                        class362.field4900 = class481.field6632.method2238(255) == 1;
                        class391.field5305 = class481.field6632.method2212((byte) 83);
                        class412.field5681 = class481.field6632.method2238(255) == 1;
                        class5.field151 = class481.field6632.method2238(255) == 1;
                        class402.field5388.method2004(class5.field151, (byte) -72);
                        class127.field1852.method2398((byte) 19, class5.field151);
                        class206.field2849.method2548(11353, class5.field151);
                        if ((!class16.field282 || class406.field5591) && !class412.field5681) {
                            try {
                                class87.method637(-104, class389.field5281.field2917, "unzap");
                            } catch (Throwable var15) {
                            }
                        } else {
                            try {
                                class87.method637(-74, class389.field5281.field2917, "zap");
                            } catch (Throwable var17) {
                                if (class35.field560) {
                                    try {
                                        class389.field5281.field2917.getAppletContext().showDocument(new URL(class389.field5281.field2917.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var16) {
                                    }
                                }
                            }
                        }
                        if (class281.field3698 == class168.field2433) {
                            try {
                                class87.method637(-107, class389.field5281.field2917, "loggedin");
                            } catch (Throwable var14) {
                            }
                        }
                        class27.field459 = 10;
                    }
                    if (class27.field459 == 10) {
                        if (class481.field6632.method753(0)) {
                            if (class304.field4004.method1879(0) < 1) {
                                return;
                            }
                            class304.field4004.method1884(1, class481.field6632.field5152, class481.field6632.field5173 + 2, (byte) 127);
                        }
                        class34.field551 = class245.method1492((byte) 120)[class481.field6632.method758(-14533)];
                        class219.field2965 = class481.field6632.method2212((byte) 83);
                        class27.field459 = 9;
                    }
                    if (class27.field459 == 9) {
                        if (class304.field4004.method1879(0) >= class219.field2965) {
                            class304.field4004.method1884(class219.field2965, class481.field6632.field5152, 0, (byte) 127);
                            class481.field6632.field5173 = 0;
                            class458.field6312 = 2;
                            class27.field459 = 0;
                            int var12 = class219.field2965;
                            class518.method3050(-107);
                            class40.method296((byte) 109, class481.field6632);
                            class522.field7715 = -1;
                            class168.method1128((byte) -121);
                            if (class481.field6632.field5173 != var12) {
                                throw new RuntimeException("lswp pos:" + class481.field6632.field5173 + " psize:" + var12);
                            }
                            class34.field551 = null;
                        }
                    } else if (class27.field459 == 12) {
                        if (class219.field2965 == -2) {
                            if (class304.field4004.method1879(0) < 2) {
                                return;
                            }
                            class304.field4004.method1884(2, class481.field6632.field5152, 0, (byte) 124);
                            class481.field6632.field5173 = 0;
                            class219.field2965 = class481.field6632.method2212((byte) 83);
                        }
                        if (class304.field4004.method1879(0) >= class219.field2965) {
                            class304.field4004.method1884(class219.field2965, class481.field6632.field5152, 0, (byte) 127);
                            class481.field6632.field5173 = 0;
                            int var13 = class219.field2965;
                            class27.field459 = 0;
                            class458.field6312 = 15;
                            class327.method1893(0);
                            class40.method296((byte) 112, class481.field6632);
                            if (class481.field6632.field5173 != var13) {
                                throw new RuntimeException("lswpr pos:" + class481.field6632.field5173 + " psize:" + var13);
                            }
                            class34.field551 = null;
                        }
                    }
                } else if (class304.field4004.method1879(0) >= 1) {
                    class186.field2630 = class304.field4004.method1887((byte) 36);
                    class27.field459 = 0;
                    class458.field6312 = 29;
                    class304.field4004.method1886(-1);
                    class304.field4004 = null;
                }
            }
        } catch (IOException var18) {
            if (class304.field4004 != null) {
                class304.field4004.method1886(-1);
                class304.field4004 = null;
            }
            if (class241.field3221 < 1) {
                class241.field3221++;
                class513.field7560 = 0;
                if (class456.field6271 == class437.field5997) {
                    class456.field6271 = class477.field6572;
                } else {
                    class456.field6271 = class437.field5997;
                }
                class27.field459 = 1;
            } else {
                class458.field6312 = -4;
                class27.field459 = 0;
            }
        }
    }
}
