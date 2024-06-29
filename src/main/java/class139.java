import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class139 extends class90 {

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Z")
    public boolean field2872;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "[Lp;")
    public class139[] field2870;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public static int field2862 = 2;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "[I")
    public static int[] field2869 = new int[1000];

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field2873 = 0;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static volatile int field2860 = 0;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public int field2861;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Lkg;")
    public static class102 field2855;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Lvg;")
    public class200 field2859;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "Leb;")
    public class43 field2866;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public void method127(int arg0) {
        field2856++;
        if (arg0 != 0) {
            this.field2866 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)[[I")
    public final int[][] method910(byte arg0, int arg1, int arg2) {
        field2851++;
        if (arg0 >= -26) {
            return null;
        } else if (this.field2870[arg2].field2872) {
            int[] var4 = this.field2870[arg2].method61(arg1, 7451);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2870[arg2].method77(116, arg1);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)[[I")
    public int[][] method77(int arg0, int arg1) {
        field2864++;
        if (arg0 < 53) {
            this.method910((byte) 15, 62, -16);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static void method911(boolean arg0) {
        field2869 = null;
        if (!arg0) {
            method914(30);
        }
        field2855 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILfa;)V")
    public void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 == 21) {
            field2852++;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public static final void method912(byte arg0) {
        int var1 = 127 / ((-arg0 - 65) / 61);
        field2857++;
        for (class62 var2 = (class62) class140.field2888.method46(-102); var2 != null; var2 = (class62) class140.field2888.method53(7759444)) {
            if (var2.field1319 != null) {
                var2.method452(200);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZII)V")
    public final void method913(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return;
        }
        field2868++;
        int var4 = this.field2861 == 255 ? arg1 : this.field2861;
        if (this.field2872) {
            this.field2859 = new class200(var4, arg1, arg2);
        } else {
            this.field2866 = new class43(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public static final void method914(int arg0) {
        field2865++;
        if (arg0 < 74) {
            return;
        }
        try {
            if (class73.field1523 == 0) {
                if (class92.field2004 != null) {
                    class92.field2004.method694((byte) -64);
                    class92.field2004 = null;
                }
                class186.field3716 = 0;
                class117.field2474 = false;
                class143.field2947 = null;
                class73.field1523 = 1;
            }
            if (class73.field1523 == 1) {
                if (class143.field2947 == null) {
                    class143.field2947 = class10.field197.method473(-27627, class177.field3578, class108.field2254);
                }
                if (class143.field2947.field855 == 2) {
                    throw new IOException();
                }
                if (class143.field2947.field855 == 1) {
                    class92.field2004 = new class102((Socket) class143.field2947.field854, class10.field197);
                    class73.field1523 = 2;
                    class143.field2947 = null;
                }
            }
            if (class73.field1523 == 2) {
                long var1 = class97.field2081 = class202.field3989.method1058(-115);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class141.field2896.field1033 = 0;
                class141.field2896.method370(14, (byte) 123);
                class141.field2896.method370(var3, (byte) 123);
                class92.field2004.method697(class141.field2896.field1054, 2, (byte) -122, 0);
                class73.field1523 = 3;
                class105.field2195.field1033 = 0;
            }
            if (class73.field1523 == 3) {
                if (class118.field2496 != null) {
                    class118.field2496.method1194(true);
                }
                if (class195.field3830 != null) {
                    class195.field3830.method1194(true);
                }
                int var4 = class92.field2004.method695(false);
                if (class118.field2496 != null) {
                    class118.field2496.method1194(true);
                }
                if (class195.field3830 != null) {
                    class195.field3830.method1194(true);
                }
                if (var4 != 0) {
                    class119.method813(var4, -19);
                    return;
                }
                class105.field2195.field1033 = 0;
                class73.field1523 = 4;
            }
            if (class73.field1523 == 4) {
                if (class105.field2195.field1033 < 8) {
                    int var5 = class92.field2004.method693(-121);
                    if (8 - class105.field2195.field1033 < var5) {
                        var5 = 8 - class105.field2195.field1033;
                    }
                    if (var5 > 0) {
                        class92.field2004.method699(class105.field2195.field1033, true, var5, class105.field2195.field1054);
                        class105.field2195.field1033 += var5;
                    }
                }
                if (class105.field2195.field1033 == 8) {
                    class105.field2195.field1033 = 0;
                    class17.field289 = class105.field2195.method379(false);
                    class73.field1523 = 5;
                }
            }
            if (class73.field1523 == 5) {
                int[] var6 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), 0, (int) class17.field289 };
                class141.field2896.field1033 = 0;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                var6[2] = (int) (class17.field289 >> 32);
                class141.field2896.method370(10, (byte) 123);
                class141.field2896.method369(var6[0], (byte) -122);
                class141.field2896.method369(var6[1], (byte) -122);
                class141.field2896.method369(var6[2], (byte) -128);
                class141.field2896.method369(var6[3], (byte) -123);
                class141.field2896.method373((byte) -52, class202.field3989.method1058(112));
                class141.field2896.method342(true, class202.field3990);
                class141.field2896.method337(true, class57.field1145, class120.field2524);
                class37.field750.field1033 = 0;
                if (class16.field277 == 40) {
                    class37.field750.method370(18, (byte) 123);
                } else {
                    class37.field750.method370(16, (byte) 123);
                }
                class37.field750.method370(class141.field2896.field1033 + 93, (byte) 123);
                class37.field750.method369(483, (byte) -128);
                class37.field750.method370(class86.field1880 ? 1 : 0, (byte) 123);
                class196.method1302(class37.field750, 24);
                class37.field750.method369(class49.field958.field3681, (byte) -128);
                class37.field750.method369(class163.field3311.field3681, (byte) -120);
                class37.field750.method369(class41.field842.field3681, (byte) -127);
                class37.field750.method369(class62.field1313.field3681, (byte) -128);
                class37.field750.method369(class121.field2552.field3681, (byte) -120);
                class37.field750.method369(class72.field1519.field3681, (byte) -111);
                class37.field750.method369(class134.field2777.field3681, (byte) -117);
                class37.field750.method369(class17.field299.field3681, (byte) -115);
                class37.field750.method369(class175.field3517.field3681, (byte) -117);
                class37.field750.method369(class167.field3398.field3681, (byte) -124);
                class37.field750.method369(class108.field2246.field3681, (byte) -119);
                class37.field750.method369(class181.field3630.field3681, (byte) -115);
                class37.field750.method369(class95.field2032.field3681, (byte) -128);
                class37.field750.method369(class202.field3981.field3681, (byte) -121);
                class37.field750.method369(class194.field3824.field3681, (byte) -119);
                class37.field750.method369(class128.field2624.field3681, (byte) -119);
                class37.field750.method365(class141.field2896.field1033, -1640531527, class141.field2896.field1054, 0);
                class92.field2004.method697(class37.field750.field1054, class37.field750.field1033, (byte) -118, 0);
                class141.field2896.method333(104, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class105.field2195.method333(104, var6);
                class73.field1523 = 6;
            }
            if (class73.field1523 == 6 && class92.field2004.method693(-113) > 0) {
                int var8 = class92.field2004.method695(false);
                if (var8 == 21 && class16.field277 == 20) {
                    class73.field1523 = 7;
                } else if (var8 == 2) {
                    class73.field1523 = 9;
                } else if (var8 == 15 && class16.field277 == 40) {
                    class90.method629((byte) -21);
                    return;
                } else if (var8 == 23 && client.field606 < 1) {
                    class73.field1523 = 0;
                    client.field606++;
                } else {
                    class119.method813(var8, -19);
                    return;
                }
            }
            if (class73.field1523 == 7 && class92.field2004.method693(-123) > 0) {
                class128.field2620 = (class92.field2004.method695(false) + 3) * 60;
                class73.field1523 = 8;
            }
            if (class73.field1523 == 8) {
                class186.field3716 = 0;
                class16.method106(class25.field459, class180.method1216(new class163[] { class34.method217(class128.field2620 / 60, -58), class129.field2666 }, false), (byte) 120, class116.field2463);
                if (--class128.field2620 <= 0) {
                    class73.field1523 = 0;
                }
            } else {
                if (class73.field1523 == 9 && class92.field2004.method693(-118) >= 9) {
                    class21.field366 = class92.field2004.method695(false);
                    class65.field1381 = class92.field2004.method695(false);
                    class107.field2227 = class92.field2004.method695(false) == 1;
                    class200.field3962 = class92.field2004.method695(false);
                    class200.field3962 <<= 0x8;
                    class200.field3962 += class92.field2004.method695(false);
                    class155.field3215 = class92.field2004.method695(false);
                    class92.field2004.method699(0, true, 1, class105.field2195.field1054);
                    class105.field2195.field1033 = 0;
                    class105.field2185 = class105.field2195.method335(true);
                    class92.field2004.method699(0, true, 2, class105.field2195.field1054);
                    class105.field2195.field1033 = 0;
                    class74.field1554 = class105.field2195.method390((byte) 96);
                    class73.field1523 = 10;
                }
                if (class73.field1523 != 10) {
                    class186.field3716++;
                    if (class186.field3716 > 2000) {
                        if (client.field606 < 1) {
                            if (class62.field1324 == class177.field3578) {
                                class177.field3578 = class4.field71;
                            } else {
                                class177.field3578 = class62.field1324;
                            }
                            client.field606++;
                            class73.field1523 = 0;
                        } else {
                            class119.method813(-3, -19);
                        }
                    }
                } else if (class92.field2004.method693(-112) >= class74.field1554) {
                    class105.field2195.field1033 = 0;
                    class92.field2004.method699(0, true, class74.field1554, class105.field2195.field1054);
                    class3.method27(82);
                    class116.field2454 = -1;
                    class48.method288(false, (byte) -99);
                    class105.field2185 = -1;
                }
            }
        } catch (IOException var9) {
            if (client.field606 < 1) {
                if (class62.field1324 == class177.field3578) {
                    class177.field3578 = class4.field71;
                } else {
                    class177.field3578 = class62.field1324;
                }
                client.field606++;
                class73.field1523 = 0;
            } else {
                class119.method813(-2, -19);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)I")
    public static final int method915(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 1) {
            method911(true);
        }
        field2858++;
        return (4096 - arg0) * arg3 + arg0 * arg1 >> 12;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)[I")
    public int[] method61(int arg0, int arg1) {
        field2867++;
        if (arg1 == 7451) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
    public int method897(byte arg0) {
        if (arg0 == 90) {
            field2853++;
            return -1;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
    public final void method916(byte arg0) {
        if (this.field2872) {
            this.field2859.method1316(774285124);
            this.field2859 = null;
        } else {
            this.field2866.method260(0);
            this.field2866 = null;
        }
        if (arg0 > -50) {
            this.method77(30, -125);
        }
        field2850++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZ)[I")
    public final int[] method917(int arg0, int arg1, boolean arg2) {
        field2854++;
        if (!arg2) {
            this.method919(false);
        }
        return this.field2870[arg1].field2872 ? this.field2870[arg1].method61(arg0, 7451) : this.field2870[arg1].method77(84, arg0)[0];
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II)I")
    public static final int method918(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)I")
    public int method919(boolean arg0) {
        field2863++;
        if (arg0) {
            this.field2871 = 94;
        }
        return -1;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IZ)V")
    public class139(int arg0, boolean arg1) {
        this.field2872 = arg1;
        this.field2870 = new class139[arg0];
    }
}
