import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class283 extends class261 {

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Los;")
    public static class309 field4261 = new class309("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "[[B")
    public static byte[][] field4262 = new byte[50][];

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "Los;")
    public static class309 field4263 = new class309("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public int field4258;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "[I")
    public int[] field4265;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "[[S")
    public static short[][] field4264;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method206(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method209(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method1769(int arg0) {
        field4261 = null;
        if (arg0 != 32) {
            method1769(1);
        }
        field4263 = null;
        field4262 = null;
        field4264 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method210(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)Z")
    public static final boolean method1770(int arg0) throws IOException {
        field4259++;
        if (class216.field3417 == null) {
            return false;
        }
        int var1 = class216.field3417.method2321(arg0 + 65536);
        if (var1 == 0) {
            return false;
        }
        if (class523.field7592 == null) {
            if (class130.field2211) {
                var1--;
                class216.field3417.method2322(0, 1, (byte) 114, class219.field3446.field4408);
                class130.field2211 = false;
                class214.field3395++;
            }
            class219.field3446.field4399 = 0;
            if (class219.field3446.method260((byte) -121)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class216.field3417.method2322(1, 1, (byte) 114, class219.field3446.field4408);
                class214.field3395++;
            }
            class130.field2211 = true;
            class186[] var2 = class177.method1215(23);
            int var3 = class219.field3446.method269((byte) 30);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3 + " ip:" + class219.field3446.field4399);
            }
            class523.field7592 = var2[var3];
            class234.field3606 = class523.field7592.field2993;
        }
        if (class234.field3606 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class216.field3417.method2322(0, 1, (byte) 114, class219.field3446.field4408);
            var1--;
            class214.field3395++;
            class234.field3606 = class219.field3446.field4408[0] & 0xFF;
        }
        if (arg0 != -65536) {
            return false;
        }
        if (class234.field3606 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class216.field3417.method2322(0, 2, (byte) 114, class219.field3446.field4408);
            class219.field3446.field4399 = 0;
            var1 -= 2;
            class234.field3606 = class219.field3446.method1841((byte) 72);
            class214.field3395 += 2;
        }
        if (class234.field3606 > var1) {
            return false;
        }
        class219.field3446.field4399 = 0;
        class216.field3417.method2322(0, class234.field3606, (byte) 114, class219.field3446.field4408);
        class398.field6039 = class363.field5302;
        class214.field3395 += class234.field3606;
        class255.field3906 = 0;
        class363.field5302 = class215.field3401;
        class215.field3401 = class523.field7592;
        if (class523.field7592 == class442.field6568) {
            boolean var4 = class219.field3446.method1858(-3256) == 1;
            String var5 = class219.field3446.method1834(-17823);
            String var6 = var5;
            if (var4) {
                var6 = class219.field3446.method1834(-17823);
            }
            long var7 = (long) class219.field3446.method1841((byte) -126);
            long var9 = (long) class219.field3446.method1863(-61);
            int var11 = class219.field3446.method1858(arg0 + 62280);
            int var12 = class219.field3446.method1841((byte) 67);
            long var13 = (var7 << 32) + var9;
            boolean var15 = false;
            int var16 = 0;
            while (true) {
                if (var16 >= 100) {
                    if (var11 <= 1 && class517.method3073(true, var6)) {
                        var15 = true;
                    }
                    break;
                }
                if (class299.field4522[var16] == var13) {
                    var15 = true;
                    break;
                }
                var16++;
            }
            if (!var15 && class179.field2913 == 0) {
                class299.field4522[class83.field1733] = var13;
                class83.field1733 = (class83.field1733 + 1) % 100;
                String var17 = class17.field280.method195(var12, -32769).method2401(true, class219.field3446);
                if (var11 == 2) {
                    class304.method1942(var12, null, var17, "<img=1>" + var6, true, 0, "<img=1>" + var5, 18);
                } else if (var11 == 1) {
                    class304.method1942(var12, null, var17, "<img=0>" + var6, true, 0, "<img=0>" + var5, 18);
                } else {
                    class304.method1942(var12, null, var17, var6, true, 0, var5, 18);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class83.field1728 == class523.field7592) {
            class373.field5468 = class219.field3446.method1858(-3256);
            class523.field7592 = null;
            class509.field7423 = class112.field2032;
            return true;
        } else if (class523.field7592 == class513.field7454) {
            int var18 = class219.field3446.method1827(arg0 ^ 0xFFFF007B);
            int var19 = class219.field3446.method1842(97);
            if (class17.method114(var18, 65535)) {
                class461.field6862 = var19;
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class166.field2687) {
            class391.method2414(false, 5424);
            class523.field7592 = null;
            return false;
        } else if (class523.field7592 == class249.field3841) {
            while (class234.field3606 > class219.field3446.field4399) {
                boolean var30 = class219.field3446.method1858(-3256) == 1;
                String var31 = class219.field3446.method1834(arg0 ^ 0xBA61);
                String var32 = class219.field3446.method1834(arg0 + 47713);
                int var33 = class219.field3446.method1841((byte) -124);
                int var34 = class219.field3446.method1858(-3256);
                String var35 = "";
                boolean var36 = false;
                if (var33 > 0) {
                    var35 = class219.field3446.method1834(-17823);
                    var36 = class219.field3446.method1858(-3256) == 1;
                }
                for (int var37 = 0; var37 < class513.field7453; var37++) {
                    if (var30) {
                        if (var32.equals(class330.field5008[var37])) {
                            class330.field5008[var37] = var31;
                            class59.field1232[var37] = var32;
                            var31 = null;
                            break;
                        }
                    } else if (var31.equals(class330.field5008[var37])) {
                        if (class207.field3317[var37] != var33) {
                            boolean var38 = true;
                            for (class257 var39 = (class257) class441.field6536.method533((byte) -58); var39 != null; var39 = (class257) class441.field6536.method536(-59)) {
                                if (var39.field3938.equals(var31)) {
                                    if (var33 != 0 && var39.field3943 == 0) {
                                        var38 = false;
                                        var39.method2352((byte) 114);
                                    } else if (var33 == 0 && var39.field3943 != 0) {
                                        var38 = false;
                                        var39.method2352((byte) 112);
                                    }
                                }
                            }
                            if (var38) {
                                class441.field6536.method531((byte) -111, new class257(var31, var33));
                            }
                            class207.field3317[var37] = var33;
                        }
                        class59.field1232[var37] = var32;
                        class296.field4497[var37] = var35;
                        class498.field7315[var37] = var34;
                        class114.field2064[var37] = var36;
                        var31 = null;
                        break;
                    }
                }
                if (var31 != null && class513.field7453 < 200) {
                    class330.field5008[class513.field7453] = var31;
                    class59.field1232[class513.field7453] = var32;
                    class207.field3317[class513.field7453] = var33;
                    class296.field4497[class513.field7453] = var35;
                    class498.field7315[class513.field7453] = var34;
                    class114.field2064[class513.field7453] = var36;
                    class513.field7453++;
                }
            }
            class398.field6037 = class112.field2032;
            class199.field3234 = 2;
            boolean var20 = false;
            int var21 = class513.field7453;
            while (var21 > 0) {
                boolean var22 = true;
                var21--;
                for (int var23 = 0; var23 < var21; var23++) {
                    if (class207.field3317[var23] != class444.field6606.field3818 && class207.field3317[var23 + 1] == class444.field6606.field3818 || class207.field3317[var23] == 0 && class207.field3317[var23 + 1] != 0) {
                        int var24 = class207.field3317[var23];
                        class207.field3317[var23] = class207.field3317[var23 + 1];
                        class207.field3317[var23 + 1] = var24;
                        String var25 = class296.field4497[var23];
                        class296.field4497[var23] = class296.field4497[var23 + 1];
                        class296.field4497[var23 + 1] = var25;
                        String var26 = class330.field5008[var23];
                        class330.field5008[var23] = class330.field5008[var23 + 1];
                        class330.field5008[var23 + 1] = var26;
                        String var27 = class59.field1232[var23];
                        class59.field1232[var23] = class59.field1232[var23 + 1];
                        class59.field1232[var23 + 1] = var27;
                        int var28 = class498.field7315[var23];
                        class498.field7315[var23] = class498.field7315[var23 + 1];
                        class498.field7315[var23 + 1] = var28;
                        boolean var29 = class114.field2064[var23];
                        class114.field2064[var23] = class114.field2064[var23 + 1];
                        var22 = false;
                        class114.field2064[var23 + 1] = var29;
                    }
                }
                if (var22) {
                    break;
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class192.field3108) {
            class252.method1629(class146.field2453, (byte) 61);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class450.field6694) {
            int var40 = class219.field3446.method1854(-11428);
            int var41 = class219.field3446.method1815((byte) -77);
            int var42 = class219.field3446.method1859(255);
            int var43 = class219.field3446.method1827(arg0 ^ 0xFFFF007E);
            if (class17.method114(var40, 65535)) {
                class141 var44 = (class141) class470.field6975.method1622((long) var41, -124);
                if (var44 != null) {
                    class86.method797(false, (byte) 102, var44, var44.field2342 != var43);
                }
                class377.method2316(var42, var41, var43, false, (byte) -4);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class14.field264) {
            class311.field4709 = class219.field3446.method1832(arg0 ^ 0x8C45) << 3;
            class445.field6627 = class219.field3446.method1839(117);
            class237.field3667 = class219.field3446.method1816(true) << 3;
            for (class354 var45 = (class354) class169.field2757.method1615(0); var45 != null; var45 = (class354) class169.field2757.method1621((byte) -98)) {
                int var47 = (int) (var45.field3977 >> 28 & 0x3L);
                int var48 = (int) (var45.field3977 & 0x3FFFL);
                int var49 = var48 - class496.field7292;
                int var50 = (int) (var45.field3977 >> 14 & 0x3FFFL);
                int var51 = var50 - class212.field3378;
                if (class445.field6627 == var47 && class311.field4709 <= var49 && (class311.field4709 + 8) > var49 && class237.field3667 <= var51 && var51 < class237.field3667 + 8) {
                    var45.method1676(true);
                    if (var49 >= 0 && var51 >= 0 && var49 < class339.field5099 && class484.field7129 > var51) {
                        class502.method3023(class445.field6627, var51, var49, -29969);
                    }
                }
            }
            for (class169 var46 = (class169) class378.field5541.method1892(121); var46 != null; var46 = (class169) class378.field5541.method1893((byte) -2)) {
                if (class311.field4709 <= var46.field2747 && var46.field2747 < class311.field4709 + 8 && class237.field3667 <= var46.field2756 && var46.field2756 < (class237.field3667 + 8) && class445.field6627 == var46.field2758) {
                    var46.field2742 = 0;
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class139.field2329) {
            String var52 = class219.field3446.method1834(-17823);
            int var53 = class219.field3446.method1841((byte) 57);
            int var54 = class219.field3446.method1841((byte) 45);
            if (class17.method114(var54, ~arg0)) {
                class526.method3112((byte) -126, var53, var52);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class485.field7137) {
            int var55 = class219.field3446.method1824(-2);
            int var56 = class219.field3446.method1876((byte) -103);
            int var57 = class219.field3446.method1824(-2);
            int var58 = class219.field3446.method1854(-11428);
            if (class17.method114(var58, 65535)) {
                class450.method2688(arg0 ^ 0xFFFF24EE, var56, 5, var57, var55);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class274.field4162) {
            int var59 = class219.field3446.method1827(122);
            int var60 = class219.field3446.method1827(arg0 ^ 0xFFFF007F);
            int var61 = class219.field3446.method1815((byte) -79);
            if (class17.method114(var60, arg0 + 131071)) {
                class41.method254(-21619, var61, var59);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class257.field3945) {
            int var62 = class219.field3446.method1854(-11428);
            if (var62 == 65535) {
                var62 = -1;
            }
            int var63 = class219.field3446.method1815((byte) -43);
            int var64 = class219.field3446.method1854(-11428);
            int var65 = class219.field3446.method1854(-11428);
            int var66 = class219.field3446.method1876((byte) -109);
            if (var66 == 65535) {
                var66 = -1;
            }
            if (class17.method114(var65, 65535)) {
                for (int var67 = var66; var67 <= var62; var67++) {
                    long var68 = ((long) var63 << 32) + (long) var67;
                    class99 var70 = (class99) class248.field3828.method1622(var68, 46);
                    class99 var71;
                    if (var70 != null) {
                        var71 = new class99(var70.field1911, var64);
                        var70.method1676(true);
                    } else if (var67 == -1) {
                        var71 = new class99(class271.method1716(27411, var63).field5697.field1911, var64);
                    } else {
                        var71 = new class99(0, var64);
                    }
                    class248.field3828.method1618(var71, var68, -1);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class187.field3004) {
            int var72 = class219.field3446.method1841((byte) 115);
            int var73 = class219.field3446.method1858(-3256);
            int var74 = class219.field3446.method1858(-3256);
            int var75 = class219.field3446.method1841((byte) 41) << 0;
            int var76 = class219.field3446.method1858(-3256);
            int var77 = class219.field3446.method1858(arg0 ^ 0xF348);
            if (class17.method114(var72, 65535)) {
                class485.method2907(var77, var73, var76, true, (byte) 53, var75, var74);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class514.field7470) {
            class249.method1619(arg0 ^ 0xFFA2, class497.field7305, class219.field3446, class234.field3606);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class434.field6465) {
            int var78 = class219.field3446.method1854(-11428);
            byte var79 = class219.field3446.method1837((byte) -113);
            int var80 = class219.field3446.method1876((byte) -126);
            if (class17.method114(var80, 65535)) {
                class67.method590(var79, (byte) 78, var78);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class239.field3712) {
            int var81 = class219.field3446.method1841((byte) -118);
            int var82 = class219.field3446.method1858(arg0 + 62280);
            boolean var83 = (var82 & 0x1) == 1;
            while (class219.field3446.field4399 < class234.field3606) {
                int var84 = class219.field3446.method1825((byte) -114);
                int var85 = class219.field3446.method1841((byte) 59);
                int var86 = 0;
                if (var85 != 0) {
                    var86 = class219.field3446.method1858(-3256);
                    if (var86 == 255) {
                        var86 = class219.field3446.method1815((byte) -83);
                    }
                }
                class45.method454(var81, var84, var85 - 1, var83, 20964, var86);
            }
            class208.field3336[class490.method2960(class266.field4047++, 31)] = var81;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class210.field3360) {
            class252.method1629(class247.field3808, (byte) 104);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class103.field1953) {
            int var87 = class219.field3446.method1841((byte) 107);
            if (var87 == 65535) {
                var87 = -1;
            }
            int var88 = class219.field3446.method1858(-3256);
            int var89 = class219.field3446.method1841((byte) 38);
            int var90 = class219.field3446.method1858(-3256);
            class253.method1641(var90, 1, var87, var88, var89);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class522.field7578) {
            int var91 = class219.field3446.method1841((byte) 55);
            String var92 = class219.field3446.method1834(-17823);
            Object[] var93 = new Object[var92.length() + 1];
            for (int var94 = var92.length() - 1; var94 >= 0; var94--) {
                if (var92.charAt(var94) == 's') {
                    var93[var94 + 1] = class219.field3446.method1834(-17823);
                } else {
                    var93[var94 + 1] = Integer.valueOf(class219.field3446.method1815((byte) -93));
                }
            }
            var93[0] = Integer.valueOf(class219.field3446.method1815((byte) -47));
            if (class17.method114(var91, 65535)) {
                class322 var95 = new class322();
                var95.field4911 = var93;
                class495.method2982(var95);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class155.field2522) {
            class252.method1629(class366.field5372, (byte) 90);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class280.field4230) {
            int var96 = class219.field3446.method1841((byte) -119);
            int var97 = class219.field3446.method1858(-3256);
            boolean var98 = (var97 & 0x1) == 1;
            class95.method852(var98, (byte) -23, var96);
            int var99 = class219.field3446.method1841((byte) 28);
            for (int var100 = 0; var100 < var99; var100++) {
                int var101 = class219.field3446.method1876((byte) -123);
                int var102 = class219.field3446.method1858(-3256);
                if (var102 == 255) {
                    var102 = class219.field3446.method1843((byte) 82);
                }
                class45.method454(var96, var100, var101 - 1, var98, 20964, var102);
            }
            class208.field3336[class490.method2960(class266.field4047++, 31)] = var96;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class10.field141) {
            if (class155.field2523 != -1) {
                class187.method1277(class155.field2523, 0, -3816);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class156.field2564) {
            class292.method1901((byte) 127, true);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class35.field535) {
            int var103 = class219.field3446.method1854(-11428);
            int var104 = class219.field3446.method1868(9464);
            int var105 = class219.field3446.method1871((byte) -117);
            int var106 = class219.field3446.method1833(128);
            if (class17.method114(var103, ~arg0)) {
                class397.method2462(var105, true, var106, var104);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class486.field7156) {
            int var107 = class219.field3446.method1824(-2);
            int var108 = class219.field3446.method1841((byte) -12);
            if (var108 == 65535) {
                var108 = -1;
            }
            int var109 = class219.field3446.method1815((byte) -117);
            int var110 = class219.field3446.method1854(-11428);
            if (class17.method114(var110, ~arg0)) {
                class189.method1287((byte) -95, var109, var108, var107);
                class12 var111 = class135.field2271.method1636(var108, -126);
                class248.method1610(arg0 + 65662, var111.field172, var111.field168, var111.field152, var109);
                class505.method3032(var111.field203, var111.field218, var111.field185, var109, -114);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class473.field7003) {
            int var112 = class219.field3446.method1876((byte) -103);
            int var113 = class219.field3446.method1841((byte) -124);
            int var114 = class219.field3446.method1841((byte) 21);
            if (class17.method114(var114, 65535)) {
                class225.method1503(var113, 3, var112, 0);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class137.field2306) {
            if (class332.method2097((byte) -33, class466.field6932)) {
                class483.field7115 = (int) ((float) class219.field3446.method1841((byte) -128) * 2.5F);
            } else {
                class483.field7115 = class219.field3446.method1841((byte) -122) * 30;
            }
            class509.field7423 = class112.field2032;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class171.field2772) {
            boolean var115 = class219.field3446.method1858(-3256) == 1;
            String var116 = class219.field3446.method1834(-17823);
            String var117 = var116;
            if (var115) {
                var117 = class219.field3446.method1834(-17823);
            }
            int var118 = class219.field3446.method1858(-3256);
            int var119 = class219.field3446.method1841((byte) -128);
            boolean var120 = false;
            if (var118 <= 1 && class517.method3073(true, var117)) {
                var120 = true;
            }
            if (!var120 && class179.field2913 == 0) {
                String var121 = class17.field280.method195(var119, -32769).method2401(true, class219.field3446);
                if (var118 == 2) {
                    class304.method1942(var119, null, var121, "<img=1>" + var117, true, 0, "<img=1>" + var116, 25);
                } else if (var118 == 1) {
                    class304.method1942(var119, null, var121, "<img=0>" + var117, true, 0, "<img=0>" + var116, 25);
                } else {
                    class304.method1942(var119, null, var121, var117, true, 0, var116, 25);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class220.field3462) {
            int var122 = class219.field3446.method1858(arg0 + 62280);
            if (class219.field3446.method1858(arg0 + 62280) == 0) {
                class140.field2337[var122] = new class439();
            } else {
                class219.field3446.field4399--;
                class140.field2337[var122] = new class439(class219.field3446);
            }
            class422.field6359 = class112.field2032;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class226.field3528) {
            int var123 = class219.field3446.method1841((byte) 22);
            int var124 = class219.field3446.method1876((byte) -100);
            int var125 = class219.field3446.method1843((byte) 54);
            if (class17.method114(var124, 65535)) {
                class67.method590(var125, (byte) 78, var123);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class368.field5394) {
            class353.field5217 = class219.field3446.method1848((byte) 123);
            class509.field7423 = class112.field2032;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class356.field5235) {
            class486.method2911((byte) -86);
            class523.field7592 = null;
            return false;
        } else if (class523.field7592 == class23.field337) {
            class179.method1229(30419);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class204.field3266) {
            int var126 = class219.field3446.method1841((byte) -118);
            int var127 = class219.field3446.method1858(-3256);
            int var128 = class219.field3446.method1858(arg0 + 62280);
            int var129 = class219.field3446.method1858(-3256);
            int var130 = class219.field3446.method1858(-3256);
            int var131 = class219.field3446.method1841((byte) 5);
            if (class17.method114(var126, arg0 + 131071)) {
                class122.field2128[var127] = true;
                class19.field310[var127] = var128;
                class218.field3418[var127] = var129;
                class102.field1938[var127] = var130;
                class447.field6648[var127] = var131;
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class50.field998) {
            class252.method1629(class4.field78, (byte) 76);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class314.field4724) {
            int var132 = class219.field3446.method1841((byte) -119);
            if (var132 == 65535) {
                var132 = -1;
            }
            int var133 = class219.field3446.method1858(arg0 + 62280);
            int var134 = class219.field3446.method1841((byte) -124);
            int var135 = class219.field3446.method1858(-3256);
            class175.method1209(var133, var135, var132, 8, var134);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class421.field6341) {
            int var136 = class219.field3446.method1876((byte) -116);
            if (var136 == 65535) {
                var136 = -1;
            }
            int var137 = class219.field3446.method1841((byte) 101);
            int var138 = class219.field3446.method1824(-2);
            if (class17.method114(var137, 65535)) {
                class105.method905(var138, (byte) -111, var136);
            }
            class523.field7592 = null;
            return true;
        } else if (class76.field1545 == class523.field7592) {
            class252.method1629(class483.field7120, (byte) 52);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class166.field2686) {
            class219.field3446.field4399 += 28;
            if (class219.field3446.method1867(true)) {
                class407.method2525(class219.field3446.field4399 - 28, arg0 + 65540, class219.field3446);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class320.field4896) {
            class172.field2777 = class219.field3446.method1858(-3256);
            for (int var139 = 0; var139 < class172.field2777; var139++) {
                class395.field6015[var139] = class219.field3446.method1834(class509.method3048(arg0, 47713));
                class52.field1118[var139] = class219.field3446.method1834(-17823);
                if (class52.field1118[var139].equals("")) {
                    class52.field1118[var139] = class395.field6015[var139];
                }
                class143.field2380[var139] = class219.field3446.method1834(class509.method3048(arg0, 47713));
                class317.field4821[var139] = class219.field3446.method1834(-17823);
                if (class317.field4821[var139].equals("")) {
                    class317.field4821[var139] = class143.field2380[var139];
                }
                class407.field6170[var139] = false;
            }
            class398.field6037 = class112.field2032;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class292.field4465) {
            int var140 = class219.field3446.method1827(122);
            if (var140 == 65535) {
                var140 = -1;
            }
            int var141 = class219.field3446.method1858(-3256);
            int var142 = class219.field3446.method1858(-3256);
            class170.method1190(var142, false, var141, var140);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class363.field5317) {
            int var143 = class219.field3446.method1858(-3256);
            int var144 = class219.field3446.method1851(false);
            int var145 = class219.field3446.method1841((byte) 60);
            if (var145 == 65535) {
                var145 = -1;
            }
            class154.method1119(var144, var143, 0, var145);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class482.field7110) {
            boolean var146 = class219.field3446.method1858(-3256) == 1;
            String var147 = class219.field3446.method1834(-17823);
            String var148 = var147;
            if (var146) {
                var148 = class219.field3446.method1834(-17823);
            }
            long var149 = class219.field3446.method1877(false);
            long var151 = (long) class219.field3446.method1841((byte) 89);
            long var153 = (long) class219.field3446.method1863(-76);
            int var155 = class219.field3446.method1858(-3256);
            long var156 = (var151 << 32) + var153;
            boolean var158 = false;
            int var159 = 0;
            while (true) {
                if (var159 >= 100) {
                    if (var155 <= 1) {
                        if (!(!class453.field6733 || class85.field1747) || class410.field6203) {
                            var158 = true;
                        } else if (class517.method3073(true, var148)) {
                            var158 = true;
                        }
                    }
                    break;
                }
                if (class299.field4522[var159] == var156) {
                    var158 = true;
                    break;
                }
                var159++;
            }
            if (!var158 && class179.field2913 == 0) {
                class299.field4522[class83.field1733] = var156;
                class83.field1733 = (class83.field1733 + 1) % 100;
                String var160 = class231.method1524(class409.method2538(-2, class219.field3446), (byte) -84);
                if (var155 == 2 || var155 == 3) {
                    class304.method1942(-1, class304.method1943((byte) 116, var149), var160, "<img=1>" + var148, true, 0, "<img=1>" + var147, 9);
                } else if (var155 == 1) {
                    class304.method1942(-1, class304.method1943((byte) 116, var149), var160, "<img=0>" + var148, true, 0, "<img=0>" + var147, 9);
                } else {
                    class304.method1942(-1, class304.method1943((byte) 116, var149), var160, var148, true, 0, var147, 9);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class309.field4685) {
            int var161 = class219.field3446.method1825((byte) -114);
            int var162 = class219.field3446.method1815((byte) -83);
            int var163 = class219.field3446.method1858(-3256);
            String var164 = "";
            String var165 = var164;
            if ((var163 & 0x1) != 0) {
                var164 = class219.field3446.method1834(-17823);
                if ((var163 & 0x2) == 0) {
                    var165 = var164;
                } else {
                    var165 = class219.field3446.method1834(-17823);
                }
            }
            String var166 = class219.field3446.method1834(-17823);
            if (var161 == 99) {
                class113.method944((byte) -117, var166);
            } else if (var165.equals("") || !class517.method3073(true, var165)) {
                class492.method2969(var164, var162, var166, var165, arg0 ^ 0xFFFF0000, var161);
            } else {
                class523.field7592 = null;
                return true;
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class140.field2336) {
            int var167 = class219.field3446.method1827(125);
            int var168 = class219.field3446.method1841((byte) -128);
            int var169 = class219.field3446.method1854(-11428);
            int var170 = class219.field3446.method1843((byte) 60);
            if (class17.method114(var167, ~arg0)) {
                class355.method2193(0, (var169 << 16) + var168, var170);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class455.field6757) {
            int var171 = class219.field3446.method1841((byte) -122);
            if (var171 == 65535) {
                var171 = -1;
            }
            int var172 = class219.field3446.method1842(55);
            int var173 = class219.field3446.method1842(-82);
            String var174 = class219.field3446.method1834(-17823);
            if (var172 >= 1 && var172 <= 8) {
                if (var174.equalsIgnoreCase("null")) {
                    var174 = null;
                }
                class320.field4894[var172 - 1] = var174;
                class210.field3353[var172 - 1] = var171;
                class56.field1191[var172 - 1] = var173 == 0;
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class276.field4174) {
            int var175 = class219.field3446.method1841((byte) -127);
            int var176 = class219.field3446.method1841((byte) 11);
            int var177 = class219.field3446.method1871((byte) -123);
            if (class17.method114(var176, 65535)) {
                class449.method2682(var177, false, var175);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class470.field6982) {
            int var178 = class219.field3446.method1841((byte) 88);
            byte var179 = class219.field3446.method1832(-29627);
            class402.field6080.method89(-69, var179, var178);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class315.field4752) {
            boolean var180 = class219.field3446.method1858(-3256) == 1;
            String var181 = class219.field3446.method1834(-17823);
            String var182 = var181;
            if (var180) {
                var182 = class219.field3446.method1834(-17823);
            }
            long var183 = (long) class219.field3446.method1841((byte) -117);
            long var185 = (long) class219.field3446.method1863(arg0 + 65461);
            int var187 = class219.field3446.method1858(-3256);
            long var188 = (var183 << 32) + var185;
            boolean var190 = false;
            int var191 = 0;
            while (true) {
                if (var191 >= 100) {
                    if (var187 <= 1) {
                        if (!(!class453.field6733 || class85.field1747) || class410.field6203) {
                            var190 = true;
                        } else if (class517.method3073(true, var182)) {
                            var190 = true;
                        }
                    }
                    break;
                }
                if (class299.field4522[var191] == var188) {
                    var190 = true;
                    break;
                }
                var191++;
            }
            if (!var190 && class179.field2913 == 0) {
                class299.field4522[class83.field1733] = var188;
                class83.field1733 = (class83.field1733 + 1) % 100;
                String var192 = class231.method1524(class409.method2538(arg0 + 65534, class219.field3446), (byte) -84);
                if (var187 == 2) {
                    class304.method1942(-1, null, var192, "<img=1>" + var182, true, 0, "<img=1>" + var181, 7);
                } else if (var187 == 1) {
                    class304.method1942(-1, null, var192, "<img=0>" + var182, true, 0, "<img=0>" + var181, 7);
                } else {
                    class304.method1942(-1, null, var192, var182, true, 0, var181, 3);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class479.field7064) {
            for (int var193 = 0; var193 < class73.field1444.length; var193++) {
                if (class73.field1444[var193] != null) {
                    class73.field1444[var193].field7768 = -1;
                }
            }
            for (int var194 = 0; var194 < class334.field5054; var194++) {
                class525.field7636[var194].field6471.field7768 = -1;
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class460.field6850) {
            int var195 = class219.field3446.method1841((byte) -124);
            int var196 = class219.field3446.method1842(arg0 ^ 0xFFB1);
            class402.field6080.method98(var195, var196, -22498);
            class523.field7592 = null;
            return true;
        } else if (class93.field1847 == class523.field7592) {
            class419.field6312 = class219.field3446.method1858(-3256);
            class523.field7592 = null;
            return true;
        } else if (class68.field1375 == class523.field7592) {
            int var197 = class219.field3446.method1827(124);
            int var198 = class219.field3446.method1859(255);
            int var199 = class219.field3446.method1841((byte) -119);
            if (class17.method114(var197, 65535)) {
                if (var198 == 2) {
                    class70.method602((byte) 125);
                }
                class155.field2523 = var199;
                class160.method1143((byte) -94, var199);
                class505.method3033((byte) 126, false);
                class495.method2984(class155.field2523);
                for (int var200 = 0; var200 < 100; var200++) {
                    class486.field7167[var200] = true;
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class271.field4106) {
            class521.field7568 = class112.field2032;
            if (class234.field3606 == 0) {
                class384.field5610 = null;
                class110.field2021 = null;
                class291.field4446 = null;
                class332.field5047 = 0;
                class523.field7592 = null;
                return true;
            }
            class291.field4446 = class219.field3446.method1834(arg0 + 47713);
            boolean var201 = class219.field3446.method1858(-3256) == 1;
            if (var201) {
                class219.field3446.method1834(-17823);
            }
            long var202 = class219.field3446.method1877(false);
            class110.field2021 = class356.method2198(10601, var202);
            class404.field6099 = class219.field3446.method1816(true);
            int var204 = class219.field3446.method1858(arg0 ^ 0xF348);
            if (var204 == 255) {
                class523.field7592 = null;
                return true;
            }
            class332.field5047 = var204;
            class414[] var205 = new class414[100];
            for (int var206 = 0; var206 < class332.field5047; var206++) {
                var205[var206] = new class414();
                var205[var206].field6259 = class219.field3446.method1834(-17823);
                boolean var212 = class219.field3446.method1858(-3256) == 1;
                if (var212) {
                    var205[var206].field6261 = class219.field3446.method1834(-17823);
                } else {
                    var205[var206].field6261 = var205[var206].field6259;
                }
                var205[var206].field6264 = class502.method3025(arg0 + 65523, var205[var206].field6261);
                var205[var206].field6260 = class219.field3446.method1841((byte) 14);
                var205[var206].field6265 = class219.field3446.method1816(true);
                var205[var206].field6263 = class219.field3446.method1834(-17823);
                if (var205[var206].field6261.equals(class15.field266.field5381)) {
                    class433.field6454 = var205[var206].field6265;
                }
            }
            boolean var207 = false;
            int var208 = class332.field5047;
            while (var208 > 0) {
                boolean var209 = true;
                var208--;
                for (int var210 = 0; var210 < var208; var210++) {
                    if (var205[var210].field6264.compareTo(var205[var210 + 1].field6264) > 0) {
                        class414 var211 = var205[var210];
                        var205[var210] = var205[var210 + 1];
                        var209 = false;
                        var205[var210 + 1] = var211;
                    }
                }
                if (var209) {
                    break;
                }
            }
            class384.field5610 = var205;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class331.field5032) {
            int var213 = class219.field3446.method1871((byte) -125);
            int var214 = class219.field3446.method1841((byte) -126);
            int var215 = class219.field3446.method1848((byte) 118);
            if (class17.method114(var214, 65535)) {
                class110.method927(var213, 0, var215);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class507.field7393) {
            int var216 = class219.field3446.method1854(-11428);
            int var217 = class219.field3446.method1815((byte) -107);
            int var218 = class219.field3446.method1876((byte) -105);
            int var219 = class219.field3446.method1827(126);
            int var220 = class219.field3446.method1876((byte) -122);
            if (class17.method114(var220, 65535)) {
                class248.method1610(64, var216, var219, var218, var217);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class123.field2133) {
            int var221 = class219.field3446.method1841((byte) 79);
            int var222 = class219.field3446.method1858(-3256);
            int var223 = class219.field3446.method1858(arg0 + 62280);
            int var224 = class219.field3446.method1841((byte) -121) << 0;
            int var225 = class219.field3446.method1858(-3256);
            int var226 = class219.field3446.method1858(arg0 ^ 0xF348);
            if (class17.method114(var221, 65535)) {
                class218.method1456(var224, var225, var223, var226, var222, -128);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class106.field1971) {
            int var227 = class219.field3446.method1843((byte) 122);
            int var228 = class219.field3446.method1841((byte) 11);
            if (class17.method114(var228, 65535)) {
                class450.method2688(9454, -1, 3, -1, var227);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class129.field2195) {
            int var229 = class219.field3446.method1841((byte) -127);
            if (class17.method114(var229, ~arg0)) {
                class472.method2820((byte) 102);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class212.field3381) {
            int var230 = class219.field3446.method1841((byte) -7);
            int var231 = class219.field3446.method1815((byte) -106);
            if (class17.method114(var230, 65535)) {
                class141 var232 = (class141) class470.field6975.method1622((long) var231, -102);
                if (var232 != null) {
                    class86.method797(false, (byte) 126, var232, true);
                }
                if (class299.field4518 != null) {
                    class429.method2587(class299.field4518, (byte) -63);
                    class299.field4518 = null;
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class506.field7379) {
            int var233 = class219.field3446.method1854(-11428);
            int var234 = class219.field3446.method1839(123);
            int var235 = class219.field3446.method1854(arg0 ^ 0xD35C);
            class435 var236 = (class435) class209.field3337.method1622((long) var233, -106);
            if (var236 != null) {
                class239.method1569(var235, var236.field6471, -1, var234);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class499.field7326) {
            int var237 = class219.field3446.method1841((byte) -121);
            int var238 = class219.field3446.method1841((byte) -125);
            int var239 = class219.field3446.method1841((byte) 39);
            int var240 = class219.field3446.method1841((byte) -10);
            if (class17.method114(var237, 65535) && class419.field6326[var238] != null) {
                for (int var241 = var239; var241 < var240; var241++) {
                    int var242 = class219.field3446.method1863(108);
                    if (var241 < class419.field6326[var238].length && class419.field6326[var238][var241] != null) {
                        class419.field6326[var238][var241].field5806 = var242;
                    }
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class393.field6006) {
            class252.method1629(class421.field6344, (byte) 67);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class119.field2085) {
            class311.field4709 = class219.field3446.method1832(arg0 ^ 0x8C45) << 3;
            class445.field6627 = class219.field3446.method1858(-3256);
            class237.field3667 = class219.field3446.method1832(-29627) << 3;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class381.field5567) {
            int var243 = class219.field3446.method1858(-3256);
            boolean var244 = (var243 & 0x1) == 1;
            String var245 = class219.field3446.method1834(-17823);
            String var246 = class219.field3446.method1834(-17823);
            if (var246.equals("")) {
                var246 = var245;
            }
            String var247 = class219.field3446.method1834(arg0 + 47713);
            String var248 = class219.field3446.method1834(-17823);
            if (var248.equals("")) {
                var248 = var247;
            }
            if (var244) {
                for (int var249 = 0; var249 < class172.field2777; var249++) {
                    if (class52.field1118[var249].equals(var248)) {
                        class395.field6015[var249] = var245;
                        class52.field1118[var249] = var246;
                        class143.field2380[var249] = var247;
                        class317.field4821[var249] = var248;
                        break;
                    }
                }
            } else {
                class395.field6015[class172.field2777] = var245;
                class52.field1118[class172.field2777] = var246;
                class143.field2380[class172.field2777] = var247;
                class317.field4821[class172.field2777] = var248;
                class407.field6170[class172.field2777] = class490.method2960(2, var243) == 2;
                class172.field2777++;
            }
            class398.field6037 = class112.field2032;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class188.field3008) {
            int var250 = class219.field3446.method1843((byte) 97);
            int var251 = class219.field3446.method1841((byte) 99);
            class402.field6080.method89(-120, var250, var251);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class19.field304) {
            class395.field6019 = class219.field3446.method1858(-3256);
            class76.field1544 = class219.field3446.method1839(116);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class383.field5602) {
            class320.field4899 = class219.field3446.method1864(21329);
            class453.field6733 = class219.field3446.method1858(-3256) == 1;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class496.field7283) {
            int var252 = class219.field3446.method1876((byte) -120);
            if (var252 == 65535) {
                var252 = -1;
            }
            int var253 = class219.field3446.method1876((byte) -127);
            int var254 = class219.field3446.method1815((byte) -40);
            if (class17.method114(var253, ~arg0)) {
                class450.method2688(9454, var252, 1, -1, var254);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class517.field7504) {
            class237.field3667 = class219.field3446.method1837((byte) -103) << 3;
            class311.field4709 = class219.field3446.method1831(255) << 3;
            class445.field6627 = class219.field3446.method1839(arg0 + 65657);
            while (class234.field3606 > class219.field3446.field4399) {
                class531 var255 = class289.method1872(126)[class219.field3446.method1858(-3256)];
                class252.method1629(var255, (byte) 49);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class271.field4112) {
            int var256 = class219.field3446.method1871((byte) -114);
            int var257 = class219.field3446.method1841((byte) -126);
            int var258 = class219.field3446.method1843((byte) 66);
            if (class17.method114(var257, 65535)) {
                class141 var259 = (class141) class470.field6975.method1622((long) var258, 34);
                class141 var260 = (class141) class470.field6975.method1622((long) var256, 116);
                if (var260 != null) {
                    class86.method797(false, (byte) 101, var260, var259 == null || var259.field2342 != var260.field2342);
                }
                if (var259 != null) {
                    var259.method1676(true);
                    class470.field6975.method1618(var259, (long) var256, -1);
                }
                class388 var261 = class271.method1716(27411, var258);
                if (var261 != null) {
                    class429.method2587(var261, (byte) -63);
                }
                class388 var262 = class271.method1716(27411, var256);
                if (var262 != null) {
                    class429.method2587(var262, (byte) -63);
                    class379.method2331(true, arg0 + 65415, var262);
                }
                if (class155.field2523 != -1) {
                    class187.method1277(class155.field2523, 1, -3816);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class144.field2429) {
            String var263 = class219.field3446.method1834(-17823);
            String var264 = class231.method1524(class409.method2538(-2, class219.field3446), (byte) -84);
            class492.method2969(var263, 0, var264, var263, 0, 6);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class268.field4060) {
            class252.method1629(class71.field1431, (byte) 81);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class259.field3959) {
            int var265 = class219.field3446.method1854(-11428);
            int var266 = class219.field3446.method1871((byte) -116);
            int var267 = class219.field3446.method1876((byte) -112);
            if (var267 == 65535) {
                var267 = -1;
            }
            if (class17.method114(var265, 65535)) {
                class450.method2688(arg0 ^ 0xFFFF24EE, var267, 2, -1, var266);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class481.field7105) {
            int var268 = class219.field3446.method1841((byte) -128);
            if (class17.method114(var268, 65535)) {
                class211.method1434(true);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class309.field4691) {
            class252.method1629(class397.field6027, (byte) 59);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class383.field5596) {
            class252.method1629(class298.field4517, (byte) 34);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class498.field7310) {
            int var269 = class219.field3446.method1842(arg0 + 65478);
            int var270 = class219.field3446.method1843((byte) 53);
            int var271 = class219.field3446.method1859(255);
            class519.field7543[var271] = var270;
            class499.field7330[var271] = var269;
            class327.field4969[var271] = 1;
            int var272 = class75.field1530[var271] - 1;
            for (int var273 = 0; var273 < var272; var273++) {
                if (var270 >= class246.field3799[var273]) {
                    class327.field4969[var271] = var273 + 2;
                }
            }
            class432.field6438[class490.method2960(31, class434.field6457++)] = var271;
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class320.field4897) {
            class391.method2414(class355.field5228, 5424);
            class523.field7592 = null;
            return false;
        } else if (class523.field7592 == class1.field47) {
            String var274 = class219.field3446.method1834(-17823);
            int var275 = class219.field3446.method1876((byte) -114);
            int var276 = class219.field3446.method1876((byte) -96);
            if (class17.method114(var275, 65535)) {
                class526.method3112((byte) -126, var276, var274);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class378.field5539) {
            class421.method2573(false, class234.field3606, class219.field3446);
            class523.field7592 = null;
            return true;
        } else if (class71.field1421 == class523.field7592) {
            int var277 = class219.field3446.method1815((byte) -100);
            class127.field2171 = class497.field7305.method2876(0, var277);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class334.field5055) {
            int var278 = class219.field3446.method1842(65);
            int var279 = var278 >> 2;
            int var280 = var278 & 0x3;
            int var281 = class87.field1784[var279];
            int var282 = class219.field3446.method1843((byte) 66);
            int var283 = var282 >> 28 & 0x3;
            int var284 = (var282 & 0xFFFC3AF) >> 14;
            int var285 = var282 & 0x3FFF;
            int var286 = class219.field3446.method1827(123);
            if (var286 == 65535) {
                var286 = -1;
            }
            int var287 = var284 - class496.field7292;
            int var288 = var285 - class212.field3378;
            class492.method2970(var279, var281, var287, var283, var288, var286, var280, 32295);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class289.field4366) {
            class356.method2197(23537);
            class523.field7592 = null;
            return false;
        } else if (class523.field7592 == class29.field479) {
            int var289 = class219.field3446.method1841((byte) -119);
            int var290 = class219.field3446.method1854(-11428);
            int var291 = class219.field3446.method1876((byte) -105);
            int var292 = class219.field3446.method1824(-2);
            int var293 = class219.field3446.method1854(-11428);
            if (class17.method114(var293, 65535)) {
                class450.method2688(9454, var289 | var291 << 16, 7, var290, var292);
            }
            class523.field7592 = null;
            return true;
        } else if (class96.field1882 == class523.field7592) {
            int var294 = class219.field3446.method1871((byte) -112);
            int var295 = class219.field3446.method1841((byte) 100);
            if (class17.method114(var295, 65535)) {
                class450.method2688(9454, class174.field2806, 5, 0, var294);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class327.field4953) {
            class252.method1629(class142.field2352, (byte) 79);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class278.field4194) {
            if (class387.field5662 != null) {
                class56.method509(-1, true, class186.field2990.field2536, -1, false);
            }
            byte[] var296 = new byte[class234.field3606];
            class219.field3446.method265(var296, class234.field3606, false, 0);
            String var297 = class185.method1259(0, var296, class234.field3606, (byte) 125);
            class188.method1282((byte) -33, class133.field2236 == 1, true, class497.field7305, var297);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class347.field5162) {
            boolean var298 = class219.field3446.method1858(arg0 + 62280) == 1;
            String var299 = class219.field3446.method1834(-17823);
            String var300 = var299;
            if (var298) {
                var300 = class219.field3446.method1834(-17823);
            }
            long var301 = class219.field3446.method1877(false);
            long var303 = (long) class219.field3446.method1841((byte) 108);
            long var305 = (long) class219.field3446.method1863(112);
            int var307 = class219.field3446.method1858(-3256);
            int var308 = class219.field3446.method1841((byte) -127);
            long var309 = (var303 << 32) + var305;
            boolean var311 = false;
            int var312 = 0;
            while (true) {
                if (var312 >= 100) {
                    if (var307 <= 1 && class517.method3073(true, var300)) {
                        var311 = true;
                    }
                    break;
                }
                if (class299.field4522[var312] == var309) {
                    var311 = true;
                    break;
                }
                var312++;
            }
            if (!var311 && class179.field2913 == 0) {
                class299.field4522[class83.field1733] = var309;
                class83.field1733 = (class83.field1733 + 1) % 100;
                String var313 = class17.field280.method195(var308, arg0 ^ 0x7FFF).method2401(true, class219.field3446);
                if (var307 == 2) {
                    class304.method1942(var308, class304.method1943((byte) 116, var301), var313, "<img=1>" + var300, true, 0, "<img=1>" + var299, 20);
                } else if (var307 == 1) {
                    class304.method1942(var308, class304.method1943((byte) 116, var301), var313, "<img=0>" + var300, true, 0, "<img=0>" + var299, 20);
                } else {
                    class304.method1942(var308, class304.method1943((byte) 116, var301), var313, var300, true, 0, var299, 20);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class222.field3468) {
            boolean var314 = class219.field3446.method1858(-3256) == 1;
            String var315 = class219.field3446.method1834(-17823);
            String var316 = var315;
            if (var314) {
                var316 = class219.field3446.method1834(-17823);
            }
            int var317 = class219.field3446.method1858(-3256);
            boolean var318 = false;
            if (var317 <= 1) {
                if (!(!class453.field6733 || class85.field1747) || class410.field6203) {
                    var318 = true;
                } else if (var317 <= 1 && class517.method3073(true, var316)) {
                    var318 = true;
                }
            }
            if (!var318 && class179.field2913 == 0) {
                String var319 = class231.method1524(class409.method2538(arg0 ^ 0xFFFE, class219.field3446), (byte) -84);
                if (var317 == 2) {
                    class304.method1942(-1, null, var319, "<img=1>" + var316, true, 0, "<img=1>" + var315, 24);
                } else if (var317 == 1) {
                    class304.method1942(-1, null, var319, "<img=0>" + var316, true, 0, "<img=0>" + var315, 24);
                } else {
                    class304.method1942(-1, null, var319, var316, true, 0, var315, 24);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class192.field3094) {
            int var320 = class219.field3446.method1871((byte) -113);
            int var321 = class219.field3446.method1827(125);
            int var322 = class219.field3446.method1841((byte) -126);
            if (var322 == 65535) {
                var322 = -1;
            }
            int var323 = class219.field3446.method1824(-2);
            int var324 = class219.field3446.method1827(arg0 + 65662);
            if (var324 == 65535) {
                var324 = -1;
            }
            if (class17.method114(var321, arg0 + 131071)) {
                for (int var325 = var324; var325 <= var322; var325++) {
                    long var326 = ((long) var320 << 32) + (long) var325;
                    class99 var328 = (class99) class248.field3828.method1622(var326, -105);
                    class99 var329;
                    if (var328 != null) {
                        var329 = new class99(var323, var328.field1918);
                        var328.method1676(true);
                    } else if (var325 == -1) {
                        var329 = new class99(var323, class271.method1716(27411, var320).field5697.field1918);
                    } else {
                        var329 = new class99(var323, -1);
                    }
                    class248.field3828.method1618(var329, var326, -1);
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class320.field4889) {
            class252.method1629(class275.field4169, (byte) 94);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class120.field2113) {
            class252.method1629(class384.field5608, (byte) 109);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class246.field3797) {
            class7.field107 = class234.field3606 > 2 ? class219.field3446.method1834(-17823) : class95.field1861.method1977(class146.field2452, -92);
            class353.field5218 = class234.field3606 <= 0 ? -1 : class219.field3446.method1841((byte) 18);
            class523.field7592 = null;
            if (class353.field5218 == 65535) {
                class353.field5218 = -1;
            }
            return true;
        } else if (class523.field7592 == class244.field3775) {
            class355.method2191(arg0 ^ 0xFFAA, class219.field3446.method1834(-17823));
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class429.field6413) {
            int var330 = class219.field3446.method1842(arg0 + 65599);
            int var331 = class219.field3446.method1827(124);
            boolean var332 = (var330 & 0x1) == 1;
            class278.method1749(-123, var331, var332);
            class208.field3336[class490.method2960(class266.field4047++, 31)] = var331;
            class523.field7592 = null;
            return true;
        } else if (class88.field1793 == class523.field7592) {
            int var333 = class219.field3446.method1858(-3256);
            int var334 = class219.field3446.method1859(arg0 + 65791);
            if (var333 == 255) {
                var333 = -1;
                var334 = -1;
            }
            class417.method2554(var333, var334, 0);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class200.field3255) {
            class252.method1629(class496.field7291, (byte) 91);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class484.field7130) {
            int var335 = class219.field3446.method1841((byte) 68);
            int var336 = class219.field3446.method1871((byte) -101);
            int var337 = class219.field3446.method1876((byte) -118);
            if (class17.method114(var335, arg0 + 131071)) {
                class272.method1722(14440, var337, var336);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class2.field51) {
            int var338 = class219.field3446.method1841((byte) -120);
            int var339 = class219.field3446.method1871((byte) -109);
            int var340 = class219.field3446.method1859(255);
            if (class17.method114(var338, 65535)) {
                class509.method3047((byte) 90, var340, var339);
            }
            class523.field7592 = null;
            return true;
        } else if (class9.field132 == class523.field7592) {
            class252.method1629(class329.field4993, (byte) 76);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class434.field6466) {
            int var341 = class219.field3446.method1858(-3256);
            int var342 = var341 >> 5;
            int var343 = var341 & 0x1F;
            if (var343 == 0) {
                class139.field2328[var342] = null;
                class523.field7592 = null;
                return true;
            }
            class481 var344 = new class481();
            var344.field7094 = var343;
            var344.field7098 = class219.field3446.method1858(-3256);
            if (var344.field7098 >= 0 && class398.field6036.length > var344.field7098) {
                if (var344.field7094 == 1 || var344.field7094 == 10) {
                    var344.field7100 = class219.field3446.method1841((byte) 11);
                    class219.field3446.field4399 += 6;
                } else if (var344.field7094 >= 2 && var344.field7094 <= 6) {
                    if (var344.field7094 == 2) {
                        var344.field7099 = 64;
                        var344.field7104 = 64;
                    }
                    if (var344.field7094 == 3) {
                        var344.field7104 = 64;
                        var344.field7099 = 0;
                    }
                    if (var344.field7094 == 4) {
                        var344.field7104 = 64;
                        var344.field7099 = 128;
                    }
                    if (var344.field7094 == 5) {
                        var344.field7099 = 64;
                        var344.field7104 = 0;
                    }
                    if (var344.field7094 == 6) {
                        var344.field7099 = 64;
                        var344.field7104 = 128;
                    }
                    var344.field7094 = 2;
                    var344.field7095 = class219.field3446.method1858(-3256);
                    var344.field7099 += class219.field3446.method1841((byte) -8) - class496.field7292 << 7;
                    var344.field7104 += class219.field3446.method1841((byte) 109) - class212.field3378 << 7;
                    var344.field7103 = class219.field3446.method1858(-3256) << 0;
                    var344.field7096 = class219.field3446.method1841((byte) -124);
                }
                var344.field7101 = class219.field3446.method1841((byte) -128);
                if (var344.field7101 == 65535) {
                    var344.field7101 = -1;
                }
                class139.field2328[var342] = var344;
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class441.field6556) {
            int var345 = class219.field3446.method1871((byte) -94);
            int var346 = class219.field3446.method1854(-11428);
            class402.field6080.method98(var346, var345, arg0 + 43038);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class13.field248) {
            class292.method1901((byte) 127, false);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class47.field978) {
            String var347 = class219.field3446.method1834(-17823);
            int var348 = class219.field3446.method1841((byte) -120);
            String var349 = class17.field280.method195(var348, -32769).method2401(true, class219.field3446);
            class304.method1942(var348, null, var349, var347, true, 0, var347, 19);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class134.field2248) {
            String var350 = class219.field3446.method1834(-17823);
            boolean var351 = class219.field3446.method1858(-3256) == 1;
            String var352;
            if (var351) {
                var352 = class219.field3446.method1834(-17823);
            } else {
                var352 = var350;
            }
            int var353 = class219.field3446.method1841((byte) -121);
            byte var354 = class219.field3446.method1816(true);
            boolean var355 = false;
            if (var354 == -128) {
                var355 = true;
            }
            if (var355) {
                if (class332.field5047 == 0) {
                    class523.field7592 = null;
                    return true;
                }
                boolean var356 = false;
                int var357;
                for (var357 = 0; class332.field5047 > var357 && (!class384.field5610[var357].field6261.equals(var352) || class384.field5610[var357].field6260 != var353); var357++) {
                }
                if (var357 < class332.field5047) {
                    while (class332.field5047 - 1 > var357) {
                        class384.field5610[var357] = class384.field5610[var357 + 1];
                        var357++;
                    }
                    class332.field5047--;
                    class384.field5610[class332.field5047] = null;
                }
            } else {
                String var358 = class219.field3446.method1834(-17823);
                class414 var359 = new class414();
                var359.field6259 = var350;
                var359.field6261 = var352;
                var359.field6264 = class502.method3025(-13, var359.field6261);
                var359.field6263 = var358;
                var359.field6260 = var353;
                var359.field6265 = var354;
                int var360;
                for (var360 = class332.field5047 - 1; var360 >= 0; var360--) {
                    int var361 = class384.field5610[var360].field6264.compareTo(var359.field6264);
                    if (var361 == 0) {
                        class384.field5610[var360].field6260 = var353;
                        class384.field5610[var360].field6265 = var354;
                        class384.field5610[var360].field6263 = var358;
                        if (var352.equals(class15.field266.field5381)) {
                            class433.field6454 = var354;
                        }
                        class523.field7592 = null;
                        class521.field7568 = class112.field2032;
                        return true;
                    }
                    if (var361 < 0) {
                        break;
                    }
                }
                if (class384.field5610.length <= class332.field5047) {
                    class523.field7592 = null;
                    return true;
                }
                for (int var362 = class332.field5047 - 1; var362 > var360; var362--) {
                    class384.field5610[var362 + 1] = class384.field5610[var362];
                }
                if (class332.field5047 == 0) {
                    class384.field5610 = new class414[100];
                }
                class384.field5610[var360 + 1] = var359;
                class332.field5047++;
                if (var352.equals(class15.field266.field5381)) {
                    class433.field6454 = var354;
                }
            }
            class523.field7592 = null;
            class521.field7568 = class112.field2032;
            return true;
        } else if (class523.field7592 == class430.field6423) {
            class252.method1629(class499.field7321, (byte) 50);
            class523.field7592 = null;
            return true;
        } else if (class79.field1580 == class523.field7592) {
            int var363 = class219.field3446.method1815((byte) -52);
            int var364 = class219.field3446.method1841((byte) 103);
            int var365 = class219.field3446.method1841((byte) -117);
            int var366 = class219.field3446.method1839(arg0 ^ 0xFFFF007D);
            int var367 = class219.field3446.method1854(-11428);
            boolean var368 = (var366 & 0x80) != 0;
            if (var363 >> 30 != 0) {
                int var369 = (var363 & 0x39B5B827) >> 28;
                int var370 = ((var363 & 0xFFFD6A6) >> 14) - class496.field7292;
                int var371 = (var363 & 0x3FFF) - class212.field3378;
                if (var370 >= 0 && var371 >= 0 && var370 < class339.field5099 && class484.field7129 > var371) {
                    int var372 = var370 * 128 + 64;
                    int var373 = var371 * 128 + 64;
                    int var374 = var369;
                    if (var369 < 3 && class304.method1941(var371, var370, 1)) {
                        var374 = var369 + 1;
                    }
                    class419 var375 = new class419(var367, 0, class62.field1268, var369, var374, var372, class483.method2899(var369, var372, var373, false) - var365, var373, var370, var370, var371, var371, var366);
                    class244.field3781.method1885(false, new class252(var375));
                }
            } else if ((var363 >> 29) != 0) {
                int var391 = var363 & 0xFFFF;
                class435 var392 = (class435) class209.field3337.method1622((long) var391, 59);
                if (var392 != null) {
                    class163 var393 = var392.field6471;
                    if (var367 == 65535) {
                        var367 = -1;
                    }
                    boolean var394 = true;
                    int var395 = var368 ? var393.field7836 : var393.field7843;
                    if (var367 != -1 && var395 != -1) {
                        if (var367 == var395) {
                            class533 var400 = class514.field7469.method595(arg0 + 53350, var367);
                            if (var400.field7738 && var400.field7734 != -1) {
                                class57 var401 = class422.field6355.method236(var400.field7734, (byte) -119);
                                int var402 = var401.field1203;
                                if (var402 == 0 || var402 == 2) {
                                    var394 = false;
                                } else if (var402 == 1) {
                                    var394 = true;
                                }
                            }
                        } else {
                            class533 var396 = class514.field7469.method595(arg0 + 53350, var367);
                            class533 var397 = class514.field7469.method595(arg0 + 53350, var395);
                            if (var396.field7734 != -1 && var397.field7734 != -1) {
                                class57 var398 = class422.field6355.method236(var396.field7734, (byte) -98);
                                class57 var399 = class422.field6355.method236(var397.field7734, (byte) -113);
                                if (var398.field1204 < var399.field1204) {
                                    var394 = false;
                                }
                            }
                        }
                    }
                    if (var394) {
                        if (var368) {
                            var393.field7799 = 0;
                            var393.field7780 = class62.field1268 + var364;
                            var393.field7842 = 1;
                            var393.field7808 = var365;
                            var393.field7849 = var366 & 0x7;
                            var393.field7774 = 0;
                            var393.field7836 = var367;
                            if (var393.field7780 > class62.field1268) {
                                var393.field7799 = -1;
                            }
                            if (var393.field7836 != -1 && class62.field1268 == var393.field7780) {
                                int var405 = class514.field7469.method595(-12186, var393.field7836).field7734;
                                if (var405 != -1) {
                                    class57 var406 = class422.field6355.method236(var405, (byte) -60);
                                    if (var406 != null && var406.field1202 != null) {
                                        class433.method2602(var406, var393.field6073, var393.field6078, (byte) 74, var393.field6084, 0, false);
                                    }
                                }
                            }
                        } else {
                            var393.field7803 = class62.field1268 + var364;
                            var393.field7784 = 1;
                            var393.field7795 = 0;
                            var393.field7797 = var366 & 0x7;
                            var393.field7843 = var367;
                            var393.field7790 = var365;
                            var393.field7767 = 0;
                            if (var393.field7803 > class62.field1268) {
                                var393.field7767 = -1;
                            }
                            if (var393.field7843 != -1 && class62.field1268 == var393.field7803) {
                                int var403 = class514.field7469.method595(-12186, var393.field7843).field7734;
                                if (var403 != -1) {
                                    class57 var404 = class422.field6355.method236(var403, (byte) -76);
                                    if (var404 != null && var404.field1202 != null) {
                                        class433.method2602(var404, var393.field6073, var393.field6078, (byte) 91, var393.field6084, 0, false);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var363 >> 28 != 0) {
                int var376 = var363 & 0xFFFF;
                class366 var377;
                if (class174.field2806 == var376) {
                    var377 = class15.field266;
                } else {
                    var377 = class73.field1444[var376];
                }
                if (var377 != null) {
                    if (var367 == 65535) {
                        var367 = -1;
                    }
                    boolean var378 = true;
                    int var379 = var368 ? var377.field7836 : var377.field7843;
                    if (var367 != -1 && var379 != -1) {
                        if (var367 == var379) {
                            class533 var380 = class514.field7469.method595(-12186, var367);
                            if (var380.field7738 && var380.field7734 != -1) {
                                class57 var381 = class422.field6355.method236(var380.field7734, (byte) 44);
                                int var382 = var381.field1203;
                                if (var382 == 0 || var382 == 2) {
                                    var378 = false;
                                } else if (var382 == 1) {
                                    var378 = true;
                                }
                            }
                        } else {
                            class533 var383 = class514.field7469.method595(-12186, var367);
                            class533 var384 = class514.field7469.method595(-12186, var379);
                            if (var383.field7734 != -1 && var384.field7734 != -1) {
                                class57 var385 = class422.field6355.method236(var383.field7734, (byte) 56);
                                class57 var386 = class422.field6355.method236(var384.field7734, (byte) -118);
                                if (var385.field1204 < var386.field1204) {
                                    var378 = false;
                                }
                            }
                        }
                    }
                    if (var378) {
                        if (var368) {
                            var377.field7836 = var367;
                            var377.field7780 = class62.field1268 + var364;
                            var377.field7849 = var366 & 0x7;
                            var377.field7799 = 0;
                            var377.field7842 = 1;
                            var377.field7808 = var365;
                            var377.field7774 = 0;
                            if (var377.field7836 == 65535) {
                                var377.field7836 = -1;
                            }
                            if (class62.field1268 < var377.field7780) {
                                var377.field7799 = -1;
                            }
                            if (var377.field7836 != -1 && class62.field1268 == var377.field7780) {
                                int var389 = class514.field7469.method595(arg0 + 53350, var377.field7836).field7734;
                                if (var389 != -1) {
                                    class57 var390 = class422.field6355.method236(var389, (byte) -69);
                                    if (var390 != null && var390.field1202 != null) {
                                        class433.method2602(var390, var377.field6073, var377.field6078, (byte) 75, var377.field6084, 0, class15.field266 == var377);
                                    }
                                }
                            }
                        } else {
                            var377.field7790 = var365;
                            var377.field7843 = var367;
                            var377.field7797 = var366 & 0x7;
                            var377.field7767 = 0;
                            var377.field7803 = class62.field1268 + var364;
                            var377.field7784 = 1;
                            var377.field7795 = 0;
                            if (class62.field1268 < var377.field7803) {
                                var377.field7767 = -1;
                            }
                            if (var377.field7843 == 65535) {
                                var377.field7843 = -1;
                            }
                            if (var377.field7843 != -1 && class62.field1268 == var377.field7803) {
                                int var387 = class514.field7469.method595(arg0 + 53350, var377.field7843).field7734;
                                if (var387 != -1) {
                                    class57 var388 = class422.field6355.method236(var387, (byte) -76);
                                    if (var388 != null && var388.field1202 != null) {
                                        class433.method2602(var388, var377.field6073, var377.field6078, (byte) 70, var377.field6084, 0, class15.field266 == var377);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class139.field2327) {
            class402.field6080.method93(114);
            class523.field7592 = null;
            class46.field969 += 32;
            return true;
        } else if (class523.field7592 == class373.field5464) {
            class398.field6037 = class112.field2032;
            class523.field7592 = null;
            class199.field3234 = 1;
            return true;
        } else if (class94.field1857 == class523.field7592) {
            class3.field68 = class355.method2190(class219.field3446.method1858(-3256), arg0 + 65525);
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class252.field3872) {
            int var407 = class219.field3446.method1843((byte) 62);
            String var408 = class219.field3446.method1834(arg0 + 47713);
            int var409 = class219.field3446.method1827(125);
            if (class17.method114(var409, 65535)) {
                class210.method1432(3, var408, var407);
            }
            class523.field7592 = null;
            return true;
        } else if (class523.field7592 == class281.field4237) {
            boolean var410 = class219.field3446.method1858(-3256) == 1;
            byte[] var411 = new byte[class234.field3606 - 1];
            class219.field3446.method1849(class234.field3606 - 1, -1, var411, 0);
            class447.method2674(var410, 0, var411);
            class523.field7592 = null;
            return true;
        } else {
            class486.method2913("T1 - " + (class523.field7592 == null ? -1 : class523.field7592.method1272(1)) + "," + (class363.field5302 == null ? -1 : class363.field5302.method1272(1)) + "," + (class398.field6039 == null ? -1 : class398.field6039.method1272(1)) + " - " + class234.field3606, null, (byte) -109);
            class391.method2414(false, 5424);
            return true;
        }
    }
}
