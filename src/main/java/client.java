import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class257 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    public static int[] field4442 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field4449 = null;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field4452 = "Close";

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    public static boolean field4454;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1641(int arg0) {
        field4448++;
        class166.method1091(arg0 ^ 0xFFFFFD53);
        class284.field4364 = new class120();
        class80.field950 = new class158();
        if (class179.field2546 != 0) {
            class203.field2889 = new byte[50][];
        }
        class154.method1013(class115.field1592, arg0 ^ 0x3CB6);
        if (class200.field2851 == 0) {
            class163.field2342 = this.getCodeBase().getHost();
            class20.field250 = 443;
            class177.field2516 = 43594;
        } else if (class200.field2851 == 1) {
            class163.field2342 = this.getCodeBase().getHost();
            class177.field2516 = class46.field543 + 40000;
            class20.field250 = class46.field543 + 50000;
        } else if (class200.field2851 == 2) {
            class177.field2516 = class46.field543 + 40000;
            class163.field2342 = "127.0.0.1";
            class20.field250 = class46.field543 + 50000;
        }
        class151.field2198 = class163.field2342;
        if (arg0 != 80) {
            return;
        }
        class263.field3811 = class20.field250;
        class255.field3685 = class41.field501 = class200.field2839 = class118.field1663 = new short[256];
        class267.field3851 = class177.field2516;
        if (class56.field659 == 3 && class200.field2851 != 2) {
            class210.field2952 = class46.field543;
        }
        if (class5.field67 == 1) {
            class4.field62 = class29.field354;
            class3.field35 = class121.field1726;
            class205.field2916 = class12.field155;
            class32.field380 = true;
            class1.field9 = class246.field3574;
        } else {
            class4.field62 = class145.field2077;
            class3.field35 = class178.field2534;
            class205.field2916 = class68.field794;
            class1.field9 = class142.field2036;
        }
        class16.field194 = class177.field2516;
        class182.field2601 = class16.field194;
        class231.method1510(true);
        class182.method1185(-120, class181.field2574);
        class70.method428(0, class181.field2574);
        class296.field4673 = class82.method481((byte) -112);
        if (class296.field4673 != null) {
            class296.field4673.method986(true, class181.field2574);
        }
        class189.field2709 = class56.field659;
        try {
            if (class115.field1592.field654 != null) {
                class224.field3166 = new class99(class115.field1592.field654, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class170.field2435[var2] = new class99(class115.field1592.field663[var2], 6000, 0);
                }
                class274.field4100 = new class99(class115.field1592.field671, 6000, 0);
                class176.field2499 = new class105(255, class224.field3166, class274.field4100, 500000);
                class259.field3779 = new class99(class115.field1592.field662, 24, 0);
                class115.field1592.field671 = null;
                class115.field1592.field654 = null;
                class115.field1592.field662 = null;
                class115.field1592.field663 = null;
            }
        } catch (IOException var3) {
            class224.field3166 = null;
            class259.field3779 = null;
            class176.field2499 = null;
            class274.field4100 = null;
        }
        class6.field86 = class1.field3;
        if (class200.field2851 != 0) {
            class156.field2254 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method1914(byte arg0) {
        int var1 = 31 / ((arg0 - 19) / 60);
        field4442 = null;
        field4452 = null;
        field4449 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwe;)Lwe;")
    public static final class82 method1915(class82 arg0) {
        int var1 = method1920(arg0).method1155(0);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class182.method1187((byte) -41, arg0.field1101);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public static final void method1916(boolean arg0) {
        field4453++;
        if (class221.method1439(21322) != 2) {
            return;
        }
        byte var1 = (byte) (class241.field3505 - 4 & 0xFF);
        int var2 = class241.field3505 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class197.field2806[var3][var2][var16] = var1;
            }
        }
        if (class199.field2833 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class21.field258[var4] = -1000000;
            class279.field4239[var4] = 1000000;
            class288.field4481[var4] = 0;
            class296.field4670[var4] = 1000000;
            class238.field3428[var4] = 0;
        }
        if (class4.field61 == 1) {
            if ((class241.field3507[class199.field2833][class177.field2507.field4563 >> 7][class177.field2507.field4553 >> 7] & 0x4) != 0) {
                class296.method1973(class6.field94, class177.field2507.field4553 >> 7, class177.field2507.field4563 >> 7, false, -98, 0);
            }
            if (class280.field4246 < 310) {
                int var6 = class245.field3560 >> 7;
                int var7 = class177.field2507.field4563 >> 7;
                int var8 = class204.field2902 >> 7;
                int var9;
                if (var6 < var7) {
                    var9 = var7 - var6;
                } else {
                    var9 = var6 - var7;
                }
                int var10 = class177.field2507.field4553 >> 7;
                int var11;
                if (var8 < var10) {
                    var11 = var10 - var8;
                } else {
                    var11 = var8 - var10;
                }
                if (var9 == 0 && var11 == 0 || var9 <= -104 || var9 >= 104 || var11 <= -104 || var11 >= 104) {
                    class142.method918(-1, (Throwable) null, "RC: " + var6 + "," + var8 + " " + var7 + "," + var10 + " " + class110.field1473 + "," + class166.field2383);
                    return;
                }
                if (var11 >= var9) {
                    int var12 = var9 * 65536 / var11;
                    int var13 = 32768;
                    while (var8 != var10) {
                        if (var8 < var10) {
                            var8++;
                        } else if (var10 < var8) {
                            var8--;
                        }
                        if ((class241.field3507[class199.field2833][var6][var8] & 0x4) != 0) {
                            class296.method1973(class6.field94, var8, var6, false, -90, 1);
                            break;
                        }
                        var13 += var12;
                        if (var13 >= 65536) {
                            var13 -= 65536;
                            if (var7 > var6) {
                                var6++;
                            } else if (var7 < var6) {
                                var6--;
                            }
                            if ((class241.field3507[class199.field2833][var6][var8] & 0x4) != 0) {
                                class296.method1973(class6.field94, var8, var6, false, -97, 1);
                                break;
                            }
                        }
                    }
                } else {
                    int var14 = 32768;
                    int var15 = var11 * 65536 / var9;
                    while (var6 != var7) {
                        if (var7 > var6) {
                            var6++;
                        } else if (var6 > var7) {
                            var6--;
                        }
                        if ((class241.field3507[class199.field2833][var6][var8] & 0x4) != 0) {
                            class296.method1973(class6.field94, var8, var6, false, -96, 1);
                            break;
                        }
                        var14 += var15;
                        if (var14 >= 65536) {
                            if (var10 > var8) {
                                var8++;
                            } else if (var10 < var8) {
                                var8--;
                            }
                            var14 -= 65536;
                            if ((class241.field3507[class199.field2833][var6][var8] & 0x4) != 0) {
                                class296.method1973(class6.field94, var8, var6, false, -98, 1);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            int var5 = class4.method21(class204.field2902, class199.field2833, class245.field3560, (byte) 26);
            if ((var5 - class225.field3172) < 800 && (class241.field3507[class199.field2833][class245.field3560 >> 7][class204.field2902 >> 7] & 0x4) != 0) {
                class296.method1973(class6.field94, class204.field2902 >> 7, class245.field3560 >> 7, false, -125, 1);
            }
        }
        if (arg0) {
            method1915((class82) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1917(int arg0) {
        field4435++;
        if (class80.field950.field2298 > class14.field175) {
            if (class267.field3851 == class182.field2601) {
                class182.field2601 = class263.field3811;
            } else {
                class182.field2601 = class267.field3851;
            }
            class33.field393 = (class80.field950.field2298 - 1) * 50 * 5;
            if (class33.field393 > 3000) {
                class33.field393 = 3000;
            }
            if (class80.field950.field2298 >= 2 && class80.field950.field2299 == 6) {
                this.method1647((byte) 90, "js5connect_outofdate");
                class141.field2034 = 1000;
                return;
            }
            if (class80.field950.field2298 >= 4 && class80.field950.field2299 == -1) {
                this.method1647((byte) 90, "js5crc");
                class141.field2034 = 1000;
                return;
            }
            if (class80.field950.field2298 >= 4 && (class141.field2034 == 0 || class141.field2034 == 5)) {
                if (class80.field950.field2299 == 7 || class80.field950.field2299 == 9) {
                    this.method1647((byte) 90, "js5connect_full");
                } else if (class80.field950.field2299 > 0) {
                    this.method1647((byte) 90, "js5connect");
                } else {
                    this.method1647((byte) 90, "js5io");
                }
                class141.field2034 = 1000;
                return;
            }
        }
        class14.field175 = class80.field950.field2298;
        if (class33.field393 > 0) {
            class33.field393--;
            return;
        }
        try {
            if (class152.field2210 == 0) {
                class74.field884 = class115.field1592.method349(0, class182.field2601, class151.field2198);
                class152.field2210++;
            }
            if (class152.field2210 == 1) {
                if (class74.field884.field960 == 2) {
                    this.method1919(1000, arg0 ^ 0xF);
                    return;
                }
                if (class74.field884.field960 == 1) {
                    class152.field2210++;
                }
            }
            if (arg0 == 15) {
                if (class152.field2210 == 2) {
                    class136.field1980 = new class185((Socket) class74.field884.field958, class115.field1592);
                    class216 var2 = new class216(5);
                    var2.method1373(15, arg0 ^ 0xFFFFC950);
                    var2.method1410(541, (byte) -125);
                    class136.field1980.method1206(var2.field3030, 5, (byte) -43, 0);
                    class152.field2210++;
                    class293.field4635 = class86.method509(false);
                }
                if (class152.field2210 == 3) {
                    if (class141.field2034 == 0 || class141.field2034 == 5 || class136.field1980.method1202((byte) 91) > 0) {
                        int var3 = class136.field1980.method1209((byte) 100);
                        if (var3 != 0) {
                            this.method1919(var3, arg0 - 15);
                            return;
                        }
                        class152.field2210++;
                    } else if ((class86.method509(false) - class293.field4635) > 30000L) {
                        this.method1919(1001, 0);
                        return;
                    }
                }
                if (class152.field2210 == 4) {
                    boolean var4 = class141.field2034 == 5 || class141.field2034 == 10 || class141.field2034 == 28;
                    class80.field950.method1046((byte) 28, class136.field1980, !var4);
                    class136.field1980 = null;
                    class152.field2210 = 0;
                    class74.field884 = null;
                }
            }
        } catch (IOException var5) {
            this.method1919(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1636(int arg0) {
        field4441++;
        if (class141.field2034 == 1000) {
            return;
        }
        class198.field2819++;
        if (arg0 <= 53) {
            this.method1923(false, (byte[]) null);
        }
        if ((class198.field2819 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class166.field2389 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class206.field2919.setSeed((long) class166.field2389);
        }
        this.method1921(74);
        if (class157.field2261 != null) {
            class157.field2261.method259(-75);
        }
        class20.method121(0);
        class6.method32(109);
        class286.method1910(0);
        class144.method928(-98);
        if (class296.field4673 != null) {
            int var3 = class296.field4673.method985(-128);
            class161.field2320 = var3;
        }
        if (class141.field2034 == 0) {
            this.method1924(-26766);
            class66.method405(true);
        } else if (class141.field2034 == 5) {
            this.method1924(-26766);
            class66.method405(true);
        } else if (class141.field2034 == 25 || class141.field2034 == 28) {
            class200.method1288(99);
        }
        if (class141.field2034 == 10) {
            this.method1926(70);
            class97.method579(-9258);
            class37.method228((byte) 50);
            class1.method6(-2);
        } else if (class141.field2034 == 30) {
            class280.method1838(false);
            return;
        } else if (class141.field2034 == 40) {
            class1.method6(-2);
            if (class20.field247 != -3) {
                if (class20.field247 == 15) {
                    class170.method1113(-1);
                    return;
                }
                if (class20.field247 != 2) {
                    class233.method1517((byte) -48);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwe;)Z")
    public static final boolean method1918(class82 arg0) {
        if (class296.field4679) {
            if (method1920(arg0).field2525 != 0) {
                return false;
            }
            if (arg0.field1026 == 0) {
                return false;
            }
        }
        return arg0.field1013;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1919(int arg0, int arg1) {
        class74.field884 = null;
        field4439++;
        class80.field950.field2298++;
        class152.field2210 = arg1;
        class80.field950.field2299 = arg0;
        class136.field1980 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwe;)Lul;")
    public static final class178 method1920(class82 arg0) {
        class178 var1 = (class178) class68.field798.method1895(((long) arg0.field1025 << 32) + (long) arg0.field963, -119);
        return var1 == null ? arg0.field1008 : var1;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1921(int arg0) {
        field4443++;
        if (arg0 < 64) {
            field4446 = 46;
        }
        boolean var2 = class80.field950.method1053(-52);
        if (!var2) {
            this.method1917(15);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwe;IIIIIII)V")
    public static final void method1922(class82[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class82 var9 = arg0[var8];
            if (var9 != null && var9.field1101 == arg1 && (!var9.field1126 || var9.field1026 == 0 || var9.field976 || method1920(var9).field2525 != 0 || class219.field3093 == var9 || var9.field1136 == 1338) && (!var9.field1126 || !method1918(var9))) {
                int var10 = var9.field1000 + arg6;
                int var11 = var9.field1096 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1026 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1131 + var10;
                    int var17 = var9.field1048 + var11;
                    if (var9.field1026 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class131.field1886 == var9) {
                    class245.field3562 = true;
                    class166.field2387 = var10;
                    class228.field3209 = var11;
                }
                if (!var9.field1126 || var12 < var14 && var13 < var15) {
                    if (var9.field1026 == 0) {
                        if (!var9.field1126 && method1918(var9) && class246.field3580 != var9) {
                            continue;
                        }
                        if (var9.field1121 && class104.field1417 >= var12 && class37.field431 >= var13 && class104.field1417 < var14 && class37.field431 < var15) {
                            for (class11 var18 = (class11) class41.field496.method1532(-68); var18 != null; var18 = (class11) class41.field496.method1523(-113)) {
                                if (var18.field151) {
                                    var18.method1935(112);
                                    var18.field145.field1107 = false;
                                }
                            }
                            if (class199.field2837 == 0) {
                                class131.field1886 = null;
                                class219.field3093 = null;
                            }
                            class67.field792 = 0;
                        }
                    }
                    if (var9.field1126) {
                        boolean var19;
                        if (class104.field1417 >= var12 && class37.field431 >= var13 && class104.field1417 < var14 && class37.field431 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class151.field2193 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class52.field599 == 1 && class76.field905 >= var12 && class190.field2736 >= var13 && class76.field905 < var14 && class190.field2736 < var15) {
                            var21 = true;
                        }
                        if (var9.field995 != null) {
                            for (int var22 = 0; var22 < var9.field995.length; var22++) {
                                if (class260.field3784[var9.field995[var22]]) {
                                    if (var9.field1090 == null || class198.field2819 >= var9.field1090[var22]) {
                                        byte var23 = var9.field1128[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class260.field3784[86] && !class260.field3784[82] && !class260.field3784[81]) && ((var23 & 0x2) == 0 || class260.field3784[86]) && ((var23 & 0x1) == 0 || class260.field3784[82]) && ((var23 & 0x4) == 0 || class260.field3784[81])) {
                                            class45.method284(var9.field1025, -1, "", true, var22 + 1);
                                            int var24 = var9.field1063[var22];
                                            if (var9.field1090 == null) {
                                                var9.field1090 = new int[var9.field995.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field1090[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field1090[var22] = class198.field2819 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field1090 != null) {
                                    var9.field1090[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class54.method326(var9, class190.field2736 - var11, 119, class76.field905 - var10);
                        }
                        if (class131.field1886 != null && class131.field1886 != var9 && var19 && method1920(var9).method1162((byte) 70)) {
                            class251.field3638 = var9;
                        }
                        if (class219.field3093 == var9) {
                            class87.field1181 = true;
                            class247.field3602 = var10;
                            class249.field3618 = var11;
                        }
                        if (var9.field976 || var9.field1136 != 0) {
                            if (var19 && class161.field2320 != 0 && var9.field1061 != null) {
                                class11 var25 = new class11();
                                var25.field151 = true;
                                var25.field145 = var9;
                                var25.field140 = class161.field2320;
                                var25.field143 = var9.field1061;
                                class41.field496.method1522(var25, -87);
                            }
                            if (class131.field1886 != null || class209.field2948 != null || class177.field2518 || var9.field1136 != 1400 && class67.field792 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1136 != 0) {
                                if (var9.field1136 == 1337) {
                                    class173.field2476 = var9;
                                    continue;
                                }
                                if (var9.field1136 == 1338) {
                                    if (var21) {
                                        class248.field3611 = class76.field905 - var10;
                                        class276.field4205 = class190.field2736 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1136 == 1400) {
                                    class238.field3431 = var9;
                                    if (var21) {
                                        if (class260.field3784[82] && class88.field1192 > 0) {
                                            int var26 = (int) ((double) (class76.field905 - var10 - var9.field1131 / 2) * 2.0D / (double) class35.field414);
                                            int var27 = (int) ((double) (class190.field2736 - var11 - var9.field1048 / 2) * 2.0D / (double) class35.field414);
                                            int var28 = class261.field3800 + var26;
                                            int var29 = class271.field3963 + var27;
                                            int var30 = class230.field3313 + var28;
                                            int var31 = class133.field1940 + class1.field1 - var29 - 1;
                                            class71 var32 = class217.method1413((byte) -111);
                                            int[] var33 = var32.method441(38, var31, var30);
                                            if (var33 != null) {
                                                class87.method512(-127, var33[1], var33[0], var33[2]);
                                                class142.method922((byte) 114);
                                            }
                                            continue;
                                        }
                                        class67.field792 = 1;
                                        class213.field2984 = class104.field1417;
                                        class129.field1859 = class37.field431;
                                        continue;
                                    }
                                    if (var20 && class67.field792 > 0) {
                                        if (class67.field792 == 1 && (class213.field2984 != class104.field1417 || class37.field431 != class129.field1859)) {
                                            class54.field633 = class261.field3800;
                                            class247.field3593 = class271.field3963;
                                            class67.field792 = 2;
                                        }
                                        if (class67.field792 == 2) {
                                            class225.method1457((int) ((double) (class213.field2984 - class104.field1417) * 2.0D / (double) class273.field4042) + class54.field633, true);
                                            class169.method1107((int) ((double) (class129.field1859 - class37.field431) * 2.0D / (double) class273.field4042) + class247.field3593, -2836);
                                        }
                                        continue;
                                    }
                                    class67.field792 = 0;
                                    continue;
                                }
                                if (var9.field1136 == 1401) {
                                    if (var20) {
                                        class139.method911(-55, class104.field1417 - var10, class37.field431 - var11, var9.field1131, var9.field1048);
                                    }
                                    continue;
                                }
                                if (var9.field1136 == 1402) {
                                    class255.method1632(16711680, var9);
                                    continue;
                                }
                            }
                            if (!var9.field1084 && var21) {
                                var9.field1084 = true;
                                if (var9.field1053 != null) {
                                    class11 var34 = new class11();
                                    var34.field151 = true;
                                    var34.field145 = var9;
                                    var34.field147 = class76.field905 - var10;
                                    var34.field140 = class190.field2736 - var11;
                                    var34.field143 = var9.field1053;
                                    class41.field496.method1522(var34, -72);
                                }
                            }
                            if (var9.field1084 && var20 && var9.field981 != null) {
                                class11 var35 = new class11();
                                var35.field151 = true;
                                var35.field145 = var9;
                                var35.field147 = class104.field1417 - var10;
                                var35.field140 = class37.field431 - var11;
                                var35.field143 = var9.field981;
                                class41.field496.method1522(var35, 119);
                            }
                            if (var9.field1084 && !var20) {
                                var9.field1084 = false;
                                if (var9.field1007 != null) {
                                    class11 var36 = new class11();
                                    var36.field151 = true;
                                    var36.field145 = var9;
                                    var36.field147 = class104.field1417 - var10;
                                    var36.field140 = class37.field431 - var11;
                                    var36.field143 = var9.field1007;
                                    class16.field193.method1522(var36, 117);
                                }
                            }
                            if (var20 && var9.field1081 != null) {
                                class11 var37 = new class11();
                                var37.field151 = true;
                                var37.field145 = var9;
                                var37.field147 = class104.field1417 - var10;
                                var37.field140 = class37.field431 - var11;
                                var37.field143 = var9.field1081;
                                class41.field496.method1522(var37, 127);
                            }
                            if (!var9.field1107 && var19) {
                                var9.field1107 = true;
                                if (var9.field1029 != null) {
                                    class11 var38 = new class11();
                                    var38.field151 = true;
                                    var38.field145 = var9;
                                    var38.field147 = class104.field1417 - var10;
                                    var38.field140 = class37.field431 - var11;
                                    var38.field143 = var9.field1029;
                                    class41.field496.method1522(var38, -47);
                                }
                            }
                            if (var9.field1107 && var19 && var9.field1003 != null) {
                                class11 var39 = new class11();
                                var39.field151 = true;
                                var39.field145 = var9;
                                var39.field147 = class104.field1417 - var10;
                                var39.field140 = class37.field431 - var11;
                                var39.field143 = var9.field1003;
                                class41.field496.method1522(var39, 122);
                            }
                            if (var9.field1107 && !var19) {
                                var9.field1107 = false;
                                if (var9.field1104 != null) {
                                    class11 var40 = new class11();
                                    var40.field151 = true;
                                    var40.field145 = var9;
                                    var40.field147 = class104.field1417 - var10;
                                    var40.field140 = class37.field431 - var11;
                                    var40.field143 = var9.field1104;
                                    class16.field193.method1522(var40, 117);
                                }
                            }
                            if (var9.field985 != null) {
                                class11 var41 = new class11();
                                var41.field145 = var9;
                                var41.field143 = var9.field985;
                                class22.field267.method1522(var41, -48);
                            }
                            if (var9.field1019 != null && class151.field2195 > var9.field965) {
                                if (var9.field1120 == null || class151.field2195 - var9.field965 > 32) {
                                    class11 var46 = new class11();
                                    var46.field145 = var9;
                                    var46.field143 = var9.field1019;
                                    class41.field496.method1522(var46, 104);
                                } else {
                                    label572: for (int var42 = var9.field965; var42 < class151.field2195; var42++) {
                                        int var43 = class197.field2805[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field1120.length; var44++) {
                                            if (var9.field1120[var44] == var43) {
                                                class11 var45 = new class11();
                                                var45.field145 = var9;
                                                var45.field143 = var9.field1019;
                                                class41.field496.method1522(var45, -65);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field965 = class151.field2195;
                            }
                            if (var9.field1070 != null && class79.field938 > var9.field1118) {
                                if (var9.field968 == null || class79.field938 - var9.field1118 > 32) {
                                    class11 var51 = new class11();
                                    var51.field145 = var9;
                                    var51.field143 = var9.field1070;
                                    class41.field496.method1522(var51, -122);
                                } else {
                                    label548: for (int var47 = var9.field1118; var47 < class79.field938; var47++) {
                                        int var48 = class55.field650[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field968.length; var49++) {
                                            if (var9.field968[var49] == var48) {
                                                class11 var50 = new class11();
                                                var50.field145 = var9;
                                                var50.field143 = var9.field1070;
                                                class41.field496.method1522(var50, -84);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1118 = class79.field938;
                            }
                            if (var9.field971 != null && class203.field2895 > var9.field996) {
                                if (var9.field1127 == null || class203.field2895 - var9.field996 > 32) {
                                    class11 var56 = new class11();
                                    var56.field145 = var9;
                                    var56.field143 = var9.field971;
                                    class41.field496.method1522(var56, -128);
                                } else {
                                    label524: for (int var52 = var9.field996; var52 < class203.field2895; var52++) {
                                        int var53 = class216.field3025[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field1127.length; var54++) {
                                            if (var9.field1127[var54] == var53) {
                                                class11 var55 = new class11();
                                                var55.field145 = var9;
                                                var55.field143 = var9.field971;
                                                class41.field496.method1522(var55, 122);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field996 = class203.field2895;
                            }
                            if (var9.field998 != null && class203.field2876 > var9.field1082) {
                                if (var9.field1058 == null || class203.field2876 - var9.field1082 > 32) {
                                    class11 var61 = new class11();
                                    var61.field145 = var9;
                                    var61.field143 = var9.field998;
                                    class41.field496.method1522(var61, 113);
                                } else {
                                    label500: for (int var57 = var9.field1082; var57 < class203.field2876; var57++) {
                                        int var58 = class199.field2828[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field1058.length; var59++) {
                                            if (var9.field1058[var59] == var58) {
                                                class11 var60 = new class11();
                                                var60.field145 = var9;
                                                var60.field143 = var9.field998;
                                                class41.field496.method1522(var60, -35);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1082 = class203.field2876;
                            }
                            if (var9.field1052 != null && class19.field230 > var9.field1038) {
                                if (var9.field1122 == null || class19.field230 - var9.field1038 > 32) {
                                    class11 var66 = new class11();
                                    var66.field145 = var9;
                                    var66.field143 = var9.field1052;
                                    class41.field496.method1522(var66, 125);
                                } else {
                                    label476: for (int var62 = var9.field1038; var62 < class19.field230; var62++) {
                                        int var63 = class127.field1816[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field1122.length; var64++) {
                                            if (var9.field1122[var64] == var63) {
                                                class11 var65 = new class11();
                                                var65.field145 = var9;
                                                var65.field143 = var9.field1052;
                                                class41.field496.method1522(var65, 120);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1038 = class19.field230;
                            }
                            if (class181.field2580 > var9.field1111 && var9.field1039 != null) {
                                class11 var67 = new class11();
                                var67.field145 = var9;
                                var67.field143 = var9.field1039;
                                class41.field496.method1522(var67, 113);
                            }
                            if (class79.field934 > var9.field1111 && var9.field1075 != null) {
                                class11 var68 = new class11();
                                var68.field145 = var9;
                                var68.field143 = var9.field1075;
                                class41.field496.method1522(var68, 105);
                            }
                            if (class161.field2315 > var9.field1111 && var9.field1099 != null) {
                                class11 var69 = new class11();
                                var69.field145 = var9;
                                var69.field143 = var9.field1099;
                                class41.field496.method1522(var69, 108);
                            }
                            if (class149.field2174 > var9.field1111 && var9.field1087 != null) {
                                class11 var70 = new class11();
                                var70.field145 = var9;
                                var70.field143 = var9.field1087;
                                class41.field496.method1522(var70, -79);
                            }
                            if (class118.field1679 > var9.field1111 && var9.field1132 != null) {
                                class11 var71 = new class11();
                                var71.field145 = var9;
                                var71.field143 = var9.field1132;
                                class41.field496.method1522(var71, 114);
                            }
                            var9.field1111 = class176.field2500;
                            if (var9.field1016 != null) {
                                for (int var72 = 0; var72 < class235.field3383; var72++) {
                                    class11 var73 = new class11();
                                    var73.field145 = var9;
                                    var73.field149 = class51.field589[var72];
                                    var73.field142 = class247.field3594[var72];
                                    var73.field143 = var9.field1016;
                                    class41.field496.method1522(var73, 126);
                                }
                            }
                            if (class30.field364 && var9.field1022 != null) {
                                class11 var74 = new class11();
                                var74.field145 = var9;
                                var74.field143 = var9.field1022;
                                class41.field496.method1522(var74, 108);
                            }
                        }
                    }
                    if (!var9.field1126 && class131.field1886 == null && class209.field2948 == null && !class177.field2518) {
                        if ((var9.field992 >= 0 || var9.field1138 != 0) && class104.field1417 >= var12 && class37.field431 >= var13 && class104.field1417 < var14 && class37.field431 < var15) {
                            if (var9.field992 >= 0) {
                                class246.field3580 = arg0[var9.field992];
                            } else {
                                class246.field3580 = var9;
                            }
                        }
                        if (var9.field1026 == 8 && class104.field1417 >= var12 && class37.field431 >= var13 && class104.field1417 < var14 && class37.field431 < var15) {
                            class26.field311 = var9;
                        }
                        if (var9.field1079 > var9.field1048) {
                            class84.method507((byte) -71, var9.field1131 + var10, var9, class37.field431, var9.field1079, class104.field1417, var11, var9.field1048);
                        }
                    }
                    if (var9.field1026 == 0) {
                        method1922(arg0, var9.field1025, var12, var13, var14, var15, var10 - var9.field1125, var11 - var9.field1018);
                        if (var9.field1034 != null) {
                            method1922(var9.field1034, var9.field1025, var12, var13, var14, var15, var10 - var9.field1125, var11 - var9.field1018);
                        }
                        class166 var75 = (class166) class189.field2705.method1895((long) var9.field1025, -127);
                        if (var75 != null) {
                            class202.method1296(var10, true, var15, var13, var75.field2395, var14, var12, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4434++;
        if (!this.method1637((byte) 111)) {
            return;
        }
        class46.field543 = Integer.parseInt(this.getParameter("worldid"));
        class200.field2851 = Integer.parseInt(this.getParameter("modewhere"));
        if (class200.field2851 < 0 || class200.field2851 > 1) {
            class200.field2851 = 0;
        }
        class179.field2546 = Integer.parseInt(this.getParameter("modewhat"));
        if (class179.field2546 < 0 || class179.field2546 > 2) {
            class179.field2546 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class255.field3681 = true;
        } else {
            class255.field3681 = false;
        }
        try {
            class146.field2156 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class146.field2156 = 0;
        }
        class94.method565(class146.field2156, -29642);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class146.field2157 = true;
        } else {
            class146.field2157 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class270.field3939 = true;
        } else {
            class270.field3939 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class5.field67 = 1;
        } else {
            class5.field67 = 0;
        }
        try {
            class133.field1939 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class133.field1939 = 0;
        }
        field4449 = this.getParameter("settings");
        if (field4449 == null) {
            field4449 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class117.field1654 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class117.field1654 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class227.field3204 = true;
        } else {
            class227.field3204 = false;
        }
        class210.field2953 = this;
        this.method1644(765, false, 503, 541, class179.field2546 + 32);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field4450++;
        try {
            if (arg0.length != 4) {
                class265.method1693("argument count", 1);
            }
            class46.field543 = Integer.parseInt(arg0[0]);
            class200.field2851 = 2;
            if (arg0[1].equals("live")) {
                class179.field2546 = 0;
            } else if (arg0[1].equals("rc")) {
                class179.field2546 = 1;
            } else if (arg0[1].equals("wip")) {
                class179.field2546 = 2;
            } else {
                class265.method1693("modewhat", 1);
            }
            class255.field3681 = false;
            class146.field2156 = class23.method143(22976, arg0[2]);
            if (class146.field2156 == -1) {
                if (arg0[2].equals("english")) {
                    class146.field2156 = 0;
                } else if (arg0[2].equals("german")) {
                    class146.field2156 = 1;
                } else {
                    class265.method1693("language", 1);
                }
            }
            class94.method565(class146.field2156, -29642);
            class146.field2157 = false;
            class270.field3939 = false;
            if (arg0[3].equals("game0")) {
                class5.field67 = 0;
            } else if (arg0[3].equals("game1")) {
                class5.field67 = 1;
            } else {
                class265.method1693("game", 1);
            }
            field4449 = "";
            class117.field1654 = 0;
            class133.field1939 = 0;
            class227.field3204 = false;
            client var1 = new client();
            class210.field2953 = var1;
            var1.method1646("runescape", false, (byte) 100, 768, 541, 1024, class179.field2546 + 32, 29);
            class202.field2858.setLocation(40, 40);
        } catch (Exception var3) {
            class142.method918(-1, var3, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
    private final void method1923(boolean arg0, byte[] arg1) {
        class216 var3 = new class216(arg1);
        field4451++;
        while (true) {
            int var4 = var3.method1407(126);
            if (var4 == 0) {
                if (!arg0) {
                    method1925(-34, -96, 81, -72, 90, 102, 33, 45, -72, 87);
                    return;
                }
                return;
            }
            if (var4 == 1) {
                var3.method1380(true);
                var3.method1380(true);
                var3.method1380(true);
                var3.method1380(true);
                var3.method1380(true);
                var3.method1380(true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1924(int arg0) {
        if (!class247.field3590) {
            label241: while (true) {
                do {
                    if (!class52.method317(106)) {
                        break label241;
                    }
                } while (class101.field1392 != 's' && class101.field1392 != 'S');
                class247.field3590 = true;
            }
        }
        if (arg0 != -26766) {
            field4442 = null;
        }
        field4436++;
        if (class42.field522 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class86.method509(false);
            if (class245.field3564 == 0L) {
                class245.field3564 = var4;
            }
            if (var3 > 16384 && var4 - class245.field3564 < 5000L) {
                if ((var4 - class1.field19) > 1000L) {
                    System.gc();
                    class1.field19 = var4;
                }
                class40.field483 = 5;
                class243.field3545 = class5.field66;
            } else {
                class243.field3545 = class258.field3758;
                class40.field483 = 5;
                class42.field522 = 10;
            }
        } else if (class42.field522 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class127.field1825[var6] = new class137(104, 104);
            }
            class243.field3545 = class245.field3566;
            class40.field483 = 10;
            class42.field522 = 30;
        } else if (class42.field522 == 30) {
            if (class157.field2261 == null) {
                class157.field2261 = new class41(class80.field950, class284.field4364);
            }
            if (class157.field2261.method258((byte) -105)) {
                class206.field2920 = class101.method621(false, 2, true, true, 0);
                class188.field2701 = class101.method621(false, 2, true, true, 1);
                class100.field1357 = class101.method621(true, 2, false, true, 2);
                class185.field2685 = class101.method621(false, 2, true, true, 3);
                class61.field723 = class101.method621(false, 2, true, true, 4);
                class26.field305 = class101.method621(true, 2, true, true, 5);
                class163.field2346 = class101.method621(true, 2, true, false, 6);
                class217.field3074 = class101.method621(false, 2, true, true, 7);
                class120.field1705 = class101.method621(false, 2, true, true, 8);
                class28.field343 = class101.method621(false, arg0 ^ 0xFFFF9770, true, true, 9);
                class38.field465 = class101.method621(false, 2, true, true, 10);
                class235.field3393 = class101.method621(false, 2, true, true, 11);
                class168.field2420 = class101.method621(false, 2, true, true, 12);
                class72.field853 = class101.method621(false, 2, true, true, 13);
                class63.field740 = class101.method621(false, 2, true, false, 14);
                class104.field1419 = class101.method621(false, 2, true, true, 15);
                class193.field2776 = class101.method621(false, 2, true, true, 16);
                class40.field484 = class101.method621(false, 2, true, true, 17);
                class233.field3359 = class101.method621(false, arg0 ^ 0xFFFF9770, true, true, 18);
                class215.field3004 = class101.method621(false, 2, true, true, 19);
                class116.field1628 = class101.method621(false, arg0 + 26768, true, true, 20);
                class274.field4089 = class101.method621(false, 2, true, true, 21);
                class123.field1768 = class101.method621(false, 2, true, true, 22);
                class292.field4619 = class101.method621(true, 2, true, true, 23);
                class136.field1982 = class101.method621(false, 2, true, true, 24);
                class220.field3119 = class101.method621(false, 2, true, true, 25);
                class12.field158 = class101.method621(true, 2, true, true, 26);
                class76.field908 = class101.method621(false, 2, true, true, 27);
                class119.field1690 = class101.method621(true, 2, true, true, 28);
                class243.field3545 = class127.field1830;
                class42.field522 = 40;
                class40.field483 = 15;
            } else {
                class243.field3545 = class115.field1595;
                class40.field483 = 12;
            }
        } else if (class42.field522 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class33.field386[var8].method1885(61) * class286.field4414[var8] / 100;
            }
            if (var7 == 100) {
                class40.field483 = 20;
                class243.field3545 = class123.field1769;
                class284.method1896(arg0 ^ 0xFFFF9772, class120.field1705);
                class167.method1093(class120.field1705, 124);
                class252.method1620(class120.field1705, 9319);
                class42.field522 = 41;
            } else {
                class40.field483 = 20;
                if (var7 != 0) {
                    class243.field3545 = class270.field3949 + var7 + "%";
                }
            }
        } else if (class42.field522 == 41) {
            if (class119.field1690.method1866(-44)) {
                this.method1923(true, class119.field1690.method1863((byte) 86, 1));
                class243.field3545 = class212.field2975;
                class42.field522 = 45;
                class40.field483 = 25;
            } else {
                class243.field3545 = class212.field2971 + class119.field1690.method1859(arg0 ^ 0xFFFF9772) + "%";
                class40.field483 = 25;
            }
        } else if (class42.field522 == 45) {
            class71.method437(2, 22050, class287.field4461, true);
            class28.field341 = new class145();
            class28.field341.method956(16, 128, 9);
            class73.field878 = class122.method796(class115.field1592, class181.field2574, 22050, 0, (byte) 118);
            class73.field878.method837(class28.field341, (byte) -22);
            class61.method376(class61.field723, class63.field740, class28.field341, -21958, class104.field1419);
            class282.field4282 = class122.method796(class115.field1592, class181.field2574, 2048, 1, (byte) 118);
            class14.field178 = new class31();
            class282.field4282.method837(class14.field178, (byte) -22);
            class23.field281 = new class266(22050, class50.field571);
            class161.field2321 = class163.field2346.method1844("scape main", -89);
            class42.field522 = 50;
            class243.field3545 = class146.field2155;
            class40.field483 = 30;
        } else if (class42.field522 == 50) {
            int var9 = class229.method1496((byte) 121, class120.field1705, class72.field853);
            int var10 = class104.method630((byte) 57);
            if (var9 < var10) {
                class243.field3545 = class209.field2946 + var9 * 100 / var10 + "%";
                class40.field483 = 35;
            } else {
                class40.field483 = 35;
                class42.field522 = 60;
                class243.field3545 = class79.field941;
            }
        } else if (class42.field522 == 60) {
            int var11 = class185.method1201(0, class120.field1705);
            int var12 = class104.method631(-82);
            if (var12 > var11) {
                class243.field3545 = class216.field3070 + var11 * 100 / var12 + "%";
                class40.field483 = 40;
            } else {
                class243.field3545 = class26.field304;
                class40.field483 = 40;
                class42.field522 = 65;
            }
        } else if (class42.field522 == 65) {
            class248.method1598(class120.field1705, false, class72.field853);
            class40.field483 = 45;
            class243.field3545 = class243.field3549;
            class17.method105(5, (byte) -58);
            class42.field522 = 70;
        } else if (class42.field522 == 70) {
            class100.field1357.method1866(-98);
            byte var13 = 0;
            int var14 = var13 + class100.field1357.method1859(0);
            class193.field2776.method1866(-121);
            int var15 = var14 + class193.field2776.method1859(arg0 ^ 0xFFFF9772);
            class40.field484.method1866(arg0 ^ 0x68F2);
            int var16 = var15 + class40.field484.method1859(0);
            class233.field3359.method1866(-58);
            int var17 = var16 + class233.field3359.method1859(0);
            class215.field3004.method1866(-127);
            int var18 = var17 + class215.field3004.method1859(0);
            class116.field1628.method1866(-53);
            int var19 = var18 + class116.field1628.method1859(0);
            class274.field4089.method1866(-125);
            int var20 = var19 + class274.field4089.method1859(0);
            class123.field1768.method1866(-93);
            int var21 = var20 + class123.field1768.method1859(0);
            class136.field1982.method1866(-51);
            int var22 = var21 + class136.field1982.method1859(0);
            class220.field3119.method1866(-128);
            int var23 = var22 + class220.field3119.method1859(0);
            class76.field908.method1866(-64);
            int var24 = var23 + class76.field908.method1859(0);
            if (var24 < 1100) {
                class40.field483 = 50;
                class243.field3545 = class137.field2002 + var24 / 11 + "%";
            } else {
                class169.method1111((byte) -20, class100.field1357);
                class5.method28(class100.field1357, true);
                class29.method174(class100.field1357, false);
                class15.method90(class217.field3074, class100.field1357, 3);
                class210.method1334(class193.field2776, true, class217.field3074, (byte) 93);
                class130.method854(class233.field3359, class217.field3074, true);
                class27.method161(true, class217.field3074, class123.field1762, (byte) -118, class215.field3004);
                class50.method304(-116, class100.field1357);
                class269.method1723(class206.field2920, class116.field1628, class188.field2701, 0);
                class104.method632(0, class100.field1357);
                class103.method626(-15270, class274.field4089, class217.field3074);
                class26.method157(-100, class123.field1768);
                class117.method753(class100.field1357, -122);
                class261.method1670(class185.field2685, -117, class72.field853, class217.field3074, class120.field1705);
                class266.method1699(class100.field1357, 5);
                class125.method813(class40.field484, -6202);
                class75.method460(new class251(), class136.field1982, 1, class220.field3119);
                class75.method462(class136.field1982, (byte) 117, class220.field3119);
                class294.method1964((byte) -118, class100.field1357);
                class261.method1672(class100.field1357, arg0 + 26884);
                class143.method925(-13466, class100.field1357);
                class72.method448(64, class120.field1705, class100.field1357);
                class163.method1072(25702, class100.field1357, class120.field1705);
                class40.field483 = 50;
                class243.field3545 = class1.field20;
                class22.method133(0);
                class42.field522 = 80;
            }
        } else if (class42.field522 == 80) {
            int var25 = class26.method153(4, class120.field1705);
            int var26 = class223.method1446(15);
            if (var25 < var26) {
                class40.field483 = 60;
                class243.field3545 = class122.field1733 + var25 * 100 / var26 + "%";
            } else {
                class24.method144(class120.field1705, (byte) -105);
                class243.field3545 = class189.field2720;
                class42.field522 = 90;
                class40.field483 = 60;
            }
        } else if (class42.field522 == 90) {
            if (class12.field158.method1866(-110)) {
                class119 var27 = new class119(class28.field343, class12.field158, class120.field1705, 20, !class94.field1258);
                class297.method1991(var27);
                if (class204.field2906 == 1) {
                    class297.method1979(0.9F);
                }
                if (class204.field2906 == 2) {
                    class297.method1979(0.8F);
                }
                if (class204.field2906 == 3) {
                    class297.method1979(0.7F);
                }
                if (class204.field2906 == 4) {
                    class297.method1979(0.6F);
                }
                class40.field483 = 70;
                class243.field3545 = class140.field2028;
                class42.field522 = 100;
            } else {
                class243.field3545 = class156.field2257 + class12.field158.method1859(arg0 ^ 0xFFFF9772) + "%";
                class40.field483 = 70;
            }
        } else if (class42.field522 == 100) {
            if (class90.method547(class120.field1705, false)) {
                class42.field522 = 110;
            }
        } else if (class42.field522 == 110) {
            class247.field3596 = new class168();
            class115.field1592.method341(11569, 10, class247.field3596);
            class42.field522 = 120;
            class40.field483 = 75;
            class243.field3545 = class280.field4258;
        } else if (class42.field522 == 120) {
            if (class38.field465.method1852((byte) 8, "", "huffman")) {
                class129 var28 = new class129(class38.field465.method1871("", "huffman", 1));
                class2.method10(var28, (byte) -91);
                class40.field483 = 80;
                class42.field522 = 130;
                class243.field3545 = class229.field3232;
            } else {
                class243.field3545 = class157.field2272 + "0%";
                class40.field483 = 80;
            }
        } else if (class42.field522 == 130) {
            if (!class185.field2685.method1866(-108)) {
                class243.field3545 = class150.field2184 + class185.field2685.method1859(0) * 3 / 4 + "%";
                class40.field483 = 85;
            } else if (!class168.field2420.method1866(arg0 ^ 0x68BA)) {
                class243.field3545 = class150.field2184 + (class168.field2420.method1859(0) / 10 + 75) + "%";
                class40.field483 = 85;
            } else if (!class72.field853.method1866(-64)) {
                class243.field3545 = class150.field2184 + ((class72.field853.method1859(0) / 20) + 85) + "%";
                class40.field483 = 85;
            } else if (class292.field4619.method1848((byte) 120, "details")) {
                class258.method1652(class292.field4619, class60.field711, (byte) -55);
                class13.method83(class217.field3074);
                class40.field483 = 95;
                class243.field3545 = class93.field1253;
                class42.field522 = 135;
            } else {
                class243.field3545 = class150.field2184 + ((class292.field4619.method1845(13917, "details") / 10) + 90) + "%";
                class40.field483 = 85;
            }
        } else if (class42.field522 == 135) {
            int var29 = class33.method211((byte) -87);
            if (var29 == -1) {
                class243.field3545 = class259.field3761;
                class40.field483 = 95;
            } else if (var29 == 7 || var29 == 9) {
                this.method1647((byte) 90, "worldlistfull");
                class17.method105(1000, (byte) -117);
            } else if (class94.field1265) {
                class40.field483 = 96;
                class42.field522 = 140;
                class243.field3545 = class153.field2216;
            } else {
                this.method1647((byte) 90, "worldlistio_" + var29);
                class17.method105(1000, (byte) 84);
            }
        } else if (class42.field522 == 140) {
            class22.field275 = class185.field2685.method1844("loginscreen", arg0 ^ 0x68EF);
            class26.field305.method1843((byte) -72, false, true);
            class163.field2346.method1843((byte) -128, true, true);
            class120.field1705.method1843((byte) -110, true, true);
            class72.field853.method1843((byte) -97, true, true);
            class38.field465.method1843((byte) -114, true, true);
            class185.field2685.method1843((byte) -83, true, true);
            class42.field522 = 150;
            class40.field483 = 97;
            class178.field2535 = true;
            class243.field3545 = class91.field1234;
        } else if (class42.field522 == 150) {
            if (class247.field3590) {
                class188.field2698 = 0;
                class115.field1590 = 0;
                class54.field624 = 0;
                class118.field1666 = 0;
            }
            class247.field3590 = true;
            class123.method807(class115.field1592, true);
            class34.method212(-1, false, (byte) 108, class118.field1666, -1);
            class40.field483 = 100;
            class243.field3545 = class23.field280;
            class42.field522 = 160;
        } else if (class42.field522 == 160) {
            class35.method219((byte) -67, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class177.field2514 <= arg7 && class279.field4238 >= arg7 && class177.field2514 <= arg1 && arg1 <= class279.field4238 && class177.field2514 <= arg6 && class279.field4238 >= arg6 && class177.field2514 <= arg3 && class279.field4238 >= arg3 && class286.field4431 <= arg9 && class230.field3302 >= arg9 && class286.field4431 <= arg2 && class230.field3302 >= arg2 && class286.field4431 <= arg4 && arg4 <= class230.field3302 && arg5 >= class286.field4431 && arg5 <= class230.field3302) {
            class45.method285(arg5, arg8, arg4, arg3, 37, arg1, arg6, arg9, arg7, arg2);
        } else {
            class227.method1471(arg4, arg1, arg9, arg3, arg8, arg2, arg7, arg6, arg5, 128);
        }
        field4445++;
        if (arg0 != 0) {
            field4446 = -33;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1926(int arg0) {
        class235.field3383 = 0;
        field4440++;
        while (class52.method317(arg0 ^ 0x2F) && class235.field3383 < 128) {
            class51.field589[class235.field3383] = class224.field3165;
            class247.field3594[class235.field3383] = class101.field1392;
            class235.field3383++;
        }
        class123.field1771++;
        if (class123.field1776 != -1) {
            class202.method1296(0, true, field4437, 0, class123.field1776, class84.field1166, 0, 0);
        }
        class176.field2500++;
        class97.method581(3);
        while (true) {
            class11 var2;
            class82 var3;
            class82 var4;
            do {
                var2 = (class11) class22.field267.method1526(arg0 ^ 0x3FB9);
                if (var2 == null) {
                    while (true) {
                        class11 var5;
                        class82 var6;
                        class82 var7;
                        do {
                            var5 = (class11) class16.field193.method1526(16383);
                            if (var5 == null) {
                                while (true) {
                                    class11 var8;
                                    class82 var9;
                                    class82 var10;
                                    do {
                                        var8 = (class11) class41.field496.method1526(16383);
                                        if (var8 == null) {
                                            if (class131.field1886 != null) {
                                                class192.method1251(1);
                                            }
                                            if (class226.field3186 != null && class226.field3186.field960 == 1) {
                                                if (class226.field3186.field958 != null) {
                                                    class96.method575(class238.field3425, class171.field2445, arg0 - 69);
                                                }
                                                class238.field3425 = false;
                                                class226.field3186 = null;
                                                class171.field2445 = null;
                                            }
                                            if (class198.field2819 % 1500 == 0) {
                                                class219.method1425((byte) -59);
                                            }
                                            if (arg0 != 70) {
                                                method1922((class82[]) null, 9, -105, 39, -64, -77, -14, 43);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field145;
                                        if (var9.field963 < 0) {
                                            break;
                                        }
                                        var10 = class182.method1187((byte) -41, var9.field1101);
                                    } while (var10 == null || var10.field1034 == null || var9.field963 >= var10.field1034.length || var10.field1034[var9.field963] != var9);
                                    class110.method684(var8, false);
                                }
                            }
                            var6 = var5.field145;
                            if (var6.field963 < 0) {
                                break;
                            }
                            var7 = class182.method1187((byte) -41, var6.field1101);
                        } while (var7 == null || var7.field1034 == null || var7.field1034.length <= var6.field963 || var7.field1034[var6.field963] != var6);
                        class110.method684(var5, false);
                    }
                }
                var3 = var2.field145;
                if (var3.field963 < 0) {
                    break;
                }
                var4 = class182.method1187((byte) -41, var3.field1101);
            } while (var4 == null || var4.field1034 == null || var4.field1034.length <= var3.field963 || var4.field1034[var3.field963] != var3);
            class110.method684(var2, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1645(int arg0) {
        method1914((byte) 98);
        class87.method513(true);
        class71.method431((byte) 61);
        field4447++;
        class154.method1012(-18659);
        class260.method1666(arg0 ^ 0x4B);
        class153.method1003(arg0 ^ 0xFFFFFF85);
        class3.method14(-4287);
        class204.method1316(40);
        class257.method1643(arg0 ^ 0xFFFFFFAA);
        class24.method148(21);
        class168.method1106(arg0 ^ 0xFF00FFFE);
        class287.method1930(arg0 ^ 0x6520);
        class216.method1363(9707);
        class185.method1203(3175);
        class158.method1049((byte) -112);
        class120.method782((byte) 63);
        class41.method254(15988);
        class283.method1881((byte) -91);
        class282.method1860(-128);
        class105.method636(arg0 + 8);
        class9.method63(arg0 + 66);
        class54.method323(-82);
        class98.method585((byte) 82);
        class137.method890(536870912);
        class82.method495(0);
        class240.method1558((byte) 122);
        class234.method1524(40);
        class130.method855(23742);
        class284.method1888(-121);
        class149.method983(arg0 ^ 0xFFFFFFDE);
        class60.method374(37);
        class88.method518(8);
        class145.method951(-16257);
        class127.method835(-11383);
        class134.method878(-112);
        class274.method1765(2);
        class290.method1947(true);
        class133.method865(-78);
        class273.method1753(true);
        class206.method1323(arg0 + 79);
        class267.method1703((byte) 96);
        class166.method1092((byte) 49);
        class178.method1160(arg0 + 11985);
        class288.method1934(0);
        class259.method1660(0);
        class42.method267(arg0 ^ 0x1);
        class253.method1626(false);
        class58.method359(-25465);
        class214.method1345(9017);
        class179.method1165(117);
        class221.method1435(-7520);
        class45.method289(arg0 + 5);
        class167.method1097(1716695009);
        class7.method43((byte) 107);
        class136.method887(113);
        class197.method1271((byte) 67);
        class21.method127(arg0 ^ 0xFFFFFFFA);
        class52.method313(104);
        class247.method1593((byte) 127);
        class198.method1274(16777215);
        class212.method1338(40);
        class270.method1727(239);
        class113.method720();
        class280.method1839(29326);
        class229.method1482((byte) -126);
        class275.method1776();
        class289.method1938(-19929);
        class57.method354(true);
        class61.method381(-1);
        class74.method458(true);
        class40.method249((byte) 66);
        class202.method1297((byte) -106);
        class1.method5(-21);
        class89.method546();
        class5.method27(false);
        class271.method1734(arg0 ^ 0xFFFFD63E);
        class8.method44();
        class230.method1504((byte) 89);
        class238.method1550((byte) -36);
        class224.method1450(4);
        class262.method1673();
        class33.method204(arg0 ^ 0x1);
        class28.method172(70);
        class36.method223((byte) -102);
        class155.method1027();
        class254.method1628(-35);
        class292.method1953(true);
        class55.method334(arg0 ^ 0xFFFFB274);
        class241.method1571(-108);
        class150.method992(true);
        class121.method792(arg0 ^ 0xA26);
        class19.method118((byte) 69);
        class77.method471(-1083);
        class59.method360(64);
        class142.method920(-44);
        class285.method1907(1869);
        class101.method617((byte) 86);
        class263.method1685(29999);
        class199.method1278(arg0 + 106);
        class13.method80();
        class180.method1171((byte) -102);
        class203.method1301(arg0 ^ 0xFFFF8B6E);
        class226.method1466(48);
        class251.method1609(123);
        class235.method1536((byte) 75);
        class223.method1447((byte) -101);
        class65.method395();
        class276.method1785(1);
        class14.method84((byte) -21);
        class177.method1148(31280);
        class119.method768((byte) -109);
        class165.method1083(true);
        class95.method571((byte) -118);
        class30.method183(-1);
        class218.method1418();
        class297.method1986();
        class129.method844((byte) -114);
        class48.method294(2);
        class171.method1120((byte) 40);
        class215.method1348((byte) -126);
        class176.method1139(75);
        class16.method96(105);
        class140.method913(true);
        class104.method633(-50);
        class23.method141(0);
        class11.method76(-1);
        class131.method863(113);
        class243.method1581(4);
        class232.method1515(-1);
        class118.method760(-1);
        class163.method1073((byte) -88);
        class157.method1042(30208);
        class245.method1584((byte) -114);
        class256.method1635();
        class73.method453((byte) 110);
        class220.method1427((byte) -103);
        class12.method78(false);
        class132.method864();
        class68.method414((byte) 116);
        class29.method175(-57);
        class79.method476(true);
        class277.method1788(29910);
        class66.method411(2);
        class94.method569((byte) -117);
        class116.method751(-113);
        class63.method384(21203);
        class286.method1913(1);
        class239.method1554();
        class125.method812(-5346);
        class227.method1473(arg0 + 4098);
        class103.method628(-74);
        class182.method1182(0);
        class37.method230(-2);
        class217.method1417(true);
        class97.method577(-105);
        class219.method1422(-1);
        class122.method794(-9);
        class72.method445(false);
        class138.method903(-112);
        class112.method696(0);
        class75.method459(false);
        class67.method412(0);
        class51.method309(255);
        class80.method479(55);
        class108.method676(-3);
        class248.method1599(-122);
        class170.method1117(-93);
        class92.method556();
        class190.method1247(258);
        class96.method573(31576);
        class272.method1741((byte) 92);
        class93.method564(47);
        class151.method995(-121);
        class173.method1129(0);
        class85.method508();
        class242.method1579();
        class20.method124(-743019920);
        class296.method1970((byte) 98);
        class146.method971(true);
        class46.method290(64);
        class184.method1195();
        class126.method822();
        class107.method670(124);
        class49.method298(arg0 - 9683);
        class144.method926(arg0 ^ 0xFFFFFF83);
        class70.method426(2);
        class34.method214(122);
        class141.method915(-530095356);
        class188.method1238((byte) -43);
        class4.method19(5024);
        class268.method1716(true);
        class22.method136(arg0 ^ 0xFFFFFF80);
        class225.method1454((byte) 107);
        class255.method1630(8162);
        class209.method1331(4096);
        class189.method1241(-86);
        class152.method1000(5272);
        class161.method1068(124);
        class117.method757(409);
        class17.method100((byte) -104);
        class195.method1265(false);
        class269.method1722((byte) 97);
        class84.method501(false);
        class38.method237(-1);
        class91.method550((byte) -96);
        class258.method1650(arg0 ^ 0xC452B812);
        class200.method1285(-60);
        class205.method1320((byte) 127);
        class231.method1513(arg0 - 26267);
        class246.method1587(522);
        class53.method319(102);
        class143.method924((byte) -126);
        class110.method683(arg0 ^ 0xFFF006F5);
        class2.method11(128);
        class293.method1962(10694);
        class109.method682(-5227);
        class193.method1253(8847);
        class39.method245(arg0 + 4);
        class64.method388(5293);
        class172.method1122(50);
        class115.method741(true);
        class100.method609(0);
        class196.method1267((byte) 126);
        class252.method1621(arg0 + 1026);
        class228.method1477(true);
        class124.method808(true);
        class222.method1443(-124);
        class265.method1692(58);
        class114.method736(false);
        class6.method39(arg0 - 83);
        class233.method1518(-127);
        class44.method279(0);
        class32.method200(-30209);
        class35.method220(2047);
        class169.method1112(false);
        class164.method1080(-1);
        if (arg0 != -2) {
            method1914((byte) -115);
        }
        class192.method1249((byte) -102);
        class123.method805(arg0 ^ 0x71);
        class159.method1060((byte) -35);
        class261.method1671(true);
        class156.method1040(-22);
        class210.method1335(-6687);
        class237.method1546(126);
        class26.method160((byte) 125);
        class175.method1135(arg0 ^ 0xFFFFFF96);
        class76.method466((byte) -107);
        class27.method162(arg0 ^ 0xFFFFBC11);
        class181.method1180(-1382315316);
        class211.method1337(1284157804);
        class279.method1831(true);
        if (class257.field3745) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1639(int arg0) {
        field4438++;
        if (class141.field2034 == 1000) {
            return;
        }
        long var2 = class115.method740(false) / 1000000L - class185.field2670;
        class185.field2670 = class115.method740(false) / 1000000L;
        boolean var4 = class179.method1166(104);
        if (var4 && class19.field240 && class73.field878 != null) {
            class73.field878.method829((byte) 118);
        }
        if ((class141.field2034 == 30 || class141.field2034 == 10) && (class107.field1443 || class146.field2152 != 0L && class146.field2152 < class86.method509(false))) {
            class34.method212(class168.field2424, class107.field1443, (byte) -64, class285.method1903(32113), class137.field1993);
        }
        if (class48.field553 == null) {
            Container var5;
            if (class48.field553 != null) {
                var5 = class48.field553;
            } else if (class202.field2858 == null) {
                var5 = class115.field1592.field664;
            } else {
                var5 = class202.field2858;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class202.field2858 == var5) {
                Insets var8 = class202.field2858.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class98.field1311 != var6 || class35.field404 != var7) {
                if (class56.field666.startsWith("mac")) {
                    class98.field1311 = var6;
                    class35.field404 = var7;
                } else {
                    class166.method1091(-765);
                }
                class146.field2152 = class86.method509(false) + 500L;
            }
        }
        boolean var9 = false;
        if (class26.field315) {
            var9 = true;
            class26.field315 = false;
        }
        if (var9) {
            class199.method1280((byte) 114);
        }
        if (class141.field2034 == 0) {
            class180.method1175(class40.field483, (Color) null, (byte) -105, var9, class243.field3545);
        } else if (class141.field2034 == 5) {
            class22.method132((byte) -121, false, class248.field3614);
        } else if (class141.field2034 == 10) {
            class15.method94(false);
        } else if (class141.field2034 == 25 || class141.field2034 == 28) {
            if (class80.field946 == 1) {
                if (class168.field2423 > class196.field2796) {
                    class196.field2796 = class168.field2423;
                }
                int var10 = (class196.field2796 - class168.field2423) * 50 / class196.field2796;
                class117.method755(16777215, false, class168.field2418 + "<br>(" + var10 + "%)");
            } else if (class80.field946 == 2) {
                if (class121.field1722 > class163.field2348) {
                    class163.field2348 = class121.field1722;
                }
                int var11 = (class163.field2348 - class121.field1722) * 50 / class163.field2348 + 50;
                class117.method755(16777215, false, class168.field2418 + "<br>(" + var11 + "%)");
            } else {
                class117.method755(16777215, false, class168.field2418);
            }
        } else if (class141.field2034 == 30) {
            class96.method572(114, var2);
        } else if (class141.field2034 == 40) {
            class117.method755(16777215, false, class146.field2153 + "<br>" + class84.field1163);
        }
        if (arg0 > -29) {
            field4446 = -128;
        }
        if ((class141.field2034 == 30 || class141.field2034 == 10) && class21.field253 == 0 && !var9) {
            try {
                Graphics var12 = class181.field2574.getGraphics();
                for (int var13 = 0; var13 < class216.field3044; var13++) {
                    if (class163.field2341[var13]) {
                        class74.field890.method145(class124.field1788[var13], 21, class247.field3595[var13], class182.field2618[var13], class21.field259[var13], var12);
                        class163.field2341[var13] = false;
                    }
                }
            } catch (Exception var17) {
                class181.field2574.repaint();
            }
        } else if (class141.field2034 != 0) {
            try {
                Graphics var14 = class181.field2574.getGraphics();
                class74.field890.method149(0, 0, var14, -24);
                for (int var15 = 0; var15 < class216.field3044; var15++) {
                    class163.field2341[var15] = false;
                }
            } catch (Exception var16) {
                class181.field2574.repaint();
            }
        }
        if (class178.field2535) {
            class215.method1349(true);
        }
        if (class247.field3590 && class141.field2034 == 10 && class123.field1776 != -1) {
            class247.field3590 = false;
            class123.method807(class115.field1592, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1640(byte arg0) {
        if (class247.field3596 != null) {
            class247.field3596.field2416 = false;
        }
        field4444++;
        class247.field3596 = null;
        if (class117.field1637 != null) {
            class117.field1637.method1199(-105);
            class117.field1637 = null;
        }
        class59.method365(-92, class181.field2574);
        if (arg0 != -14) {
            return;
        }
        class68.method417(0, class181.field2574);
        if (class296.field4673 != null) {
            class296.field4673.method982(class181.field2574, false);
        }
        class266.method1697(2);
        class37.method232(0);
        class296.field4673 = null;
        if (class73.field878 != null) {
            class73.field878.method824(23610);
        }
        if (class282.field4282 != null) {
            class282.field4282.method824(23610);
        }
        class80.field950.method1055((byte) 97);
        class284.field4364.method786(121);
    }
}
