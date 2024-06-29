import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class546 {

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "[[I")
    private static int[][] field7568 = new int[5][5000];

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    private static int field7576 = 0;

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "[Ljava/lang/String;")
    private static String[] field7588 = new String[1000];

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
    private static int field7580 = 0;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "[Lwfa;")
    private static class390[] field7571 = new class390[50];

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "[I")
    private static int[] field7575 = new int[3];

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "[I")
    private static int[] field7573 = new int[1000];

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    private static int field7570 = 0;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "[I")
    private static int[] field7593 = new int[5];

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "Lgw;")
    public static class690 field7592 = new class690(4);

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "I")
    private static int field7594 = 0;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "Lnia;")
    private static class493 field7583;

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "Luv;")
    private static class755 field7590;

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "Luv;")
    private static class755 field7591;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "[I")
    private static int[] field7579;

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "[Ljava/lang/String;")
    private static String[] field7585;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 5)
    private static final void method3222(String arg0, int arg1) {
        if (class290.field4163 == 0 && !(!class214.field2807 || class571.field7897) || class464.field6463) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class155.field2166.method978(0, (byte) -120))) {
            var3 = 0;
            arg0 = arg0.substring(class155.field2166.method978(0, (byte) -113).length());
        } else if (var2.startsWith(class155.field2167.method978(0, (byte) -113))) {
            var3 = 1;
            arg0 = arg0.substring(class155.field2167.method978(0, (byte) -127).length());
        } else if (var2.startsWith(class155.field2168.method978(0, (byte) -119))) {
            var3 = 2;
            arg0 = arg0.substring(class155.field2168.method978(0, (byte) -122).length());
        } else if (var2.startsWith(class155.field2169.method978(0, (byte) -114))) {
            var3 = 3;
            arg0 = arg0.substring(class155.field2169.method978(0, (byte) -109).length());
        } else if (var2.startsWith(class155.field2170.method978(0, (byte) -107))) {
            var3 = 4;
            arg0 = arg0.substring(class155.field2170.method978(0, (byte) -108).length());
        } else if (var2.startsWith(class155.field2171.method978(0, (byte) -111))) {
            var3 = 5;
            arg0 = arg0.substring(class155.field2171.method978(0, (byte) -127).length());
        } else if (var2.startsWith(class155.field2172.method978(0, (byte) -119))) {
            var3 = 6;
            arg0 = arg0.substring(class155.field2172.method978(0, (byte) -124).length());
        } else if (var2.startsWith(class155.field2173.method978(0, (byte) -121))) {
            var3 = 7;
            arg0 = arg0.substring(class155.field2173.method978(0, (byte) -112).length());
        } else if (var2.startsWith(class155.field2174.method978(0, (byte) -109))) {
            var3 = 8;
            arg0 = arg0.substring(class155.field2174.method978(0, (byte) -126).length());
        } else if (var2.startsWith(class155.field2175.method978(0, (byte) -128))) {
            var3 = 9;
            arg0 = arg0.substring(class155.field2175.method978(0, (byte) -113).length());
        } else if (var2.startsWith(class155.field2176.method978(0, (byte) -121))) {
            var3 = 10;
            arg0 = arg0.substring(class155.field2176.method978(0, (byte) -108).length());
        } else if (var2.startsWith(class155.field2177.method978(0, (byte) -126))) {
            var3 = 11;
            arg0 = arg0.substring(class155.field2177.method978(0, (byte) -123).length());
        } else if (class120.field1576 != 0) {
            if (var2.startsWith(class155.field2166.method978(class120.field1576, (byte) -125))) {
                var3 = 0;
                arg0 = arg0.substring(class155.field2166.method978(class120.field1576, (byte) -114).length());
            } else if (var2.startsWith(class155.field2167.method978(class120.field1576, (byte) -114))) {
                var3 = 1;
                arg0 = arg0.substring(class155.field2167.method978(class120.field1576, (byte) -114).length());
            } else if (var2.startsWith(class155.field2168.method978(class120.field1576, (byte) -121))) {
                var3 = 2;
                arg0 = arg0.substring(class155.field2168.method978(class120.field1576, (byte) -121).length());
            } else if (var2.startsWith(class155.field2169.method978(class120.field1576, (byte) -121))) {
                var3 = 3;
                arg0 = arg0.substring(class155.field2169.method978(class120.field1576, (byte) -107).length());
            } else if (var2.startsWith(class155.field2170.method978(class120.field1576, (byte) -115))) {
                var3 = 4;
                arg0 = arg0.substring(class155.field2170.method978(class120.field1576, (byte) -114).length());
            } else if (var2.startsWith(class155.field2171.method978(class120.field1576, (byte) -109))) {
                var3 = 5;
                arg0 = arg0.substring(class155.field2171.method978(class120.field1576, (byte) -109).length());
            } else if (var2.startsWith(class155.field2172.method978(class120.field1576, (byte) -118))) {
                var3 = 6;
                arg0 = arg0.substring(class155.field2172.method978(class120.field1576, (byte) -110).length());
            } else if (var2.startsWith(class155.field2173.method978(class120.field1576, (byte) -111))) {
                var3 = 7;
                arg0 = arg0.substring(class155.field2173.method978(class120.field1576, (byte) -120).length());
            } else if (var2.startsWith(class155.field2174.method978(class120.field1576, (byte) -114))) {
                var3 = 8;
                arg0 = arg0.substring(class155.field2174.method978(class120.field1576, (byte) -123).length());
            } else if (var2.startsWith(class155.field2175.method978(class120.field1576, (byte) -107))) {
                var3 = 9;
                arg0 = arg0.substring(class155.field2175.method978(class120.field1576, (byte) -109).length());
            } else if (var2.startsWith(class155.field2176.method978(class120.field1576, (byte) -114))) {
                var3 = 10;
                arg0 = arg0.substring(class155.field2176.method978(class120.field1576, (byte) -127).length());
            } else if (var2.startsWith(class155.field2177.method978(class120.field1576, (byte) -115))) {
                var3 = 11;
                arg0 = arg0.substring(class155.field2177.method978(class120.field1576, (byte) -117).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class155.field2178.method978(0, (byte) -120))) {
            var5 = 1;
            arg0 = arg0.substring(class155.field2178.method978(0, (byte) -124).length());
        } else if (var4.startsWith(class155.field2179.method978(0, (byte) -123))) {
            var5 = 2;
            arg0 = arg0.substring(class155.field2179.method978(0, (byte) -113).length());
        } else if (var4.startsWith(class155.field2180.method978(0, (byte) -124))) {
            var5 = 3;
            arg0 = arg0.substring(class155.field2180.method978(0, (byte) -123).length());
        } else if (var4.startsWith(class155.field2181.method978(0, (byte) -120))) {
            var5 = 4;
            arg0 = arg0.substring(class155.field2181.method978(0, (byte) -124).length());
        } else if (var4.startsWith(class155.field2182.method978(0, (byte) -109))) {
            var5 = 5;
            arg0 = arg0.substring(class155.field2182.method978(0, (byte) -110).length());
        } else if (class120.field1576 != 0) {
            if (var4.startsWith(class155.field2178.method978(class120.field1576, (byte) -127))) {
                var5 = 1;
                arg0 = arg0.substring(class155.field2178.method978(class120.field1576, (byte) -115).length());
            } else if (var4.startsWith(class155.field2179.method978(class120.field1576, (byte) -120))) {
                var5 = 2;
                arg0 = arg0.substring(class155.field2179.method978(class120.field1576, (byte) -111).length());
            } else if (var4.startsWith(class155.field2180.method978(class120.field1576, (byte) -127))) {
                var5 = 3;
                arg0 = arg0.substring(class155.field2180.method978(class120.field1576, (byte) -122).length());
            } else if (var4.startsWith(class155.field2181.method978(class120.field1576, (byte) -112))) {
                var5 = 4;
                arg0 = arg0.substring(class155.field2181.method978(class120.field1576, (byte) -128).length());
            } else if (var4.startsWith(class155.field2182.method978(class120.field1576, (byte) -112))) {
                var5 = 5;
                arg0 = arg0.substring(class155.field2182.method978(class120.field1576, (byte) -109).length());
            }
        }
        field7569++;
        class583 var6 = class54.method400(class213.field2800, (byte) 94, class589.field8017);
        var6.field7963.method444(0, 128);
        int var7 = var6.field7963.field956;
        var6.field7963.method444(var3, 128);
        var6.field7963.method444(var5, 128);
        class542.method3206(arg0, var6.field7963, (byte) 30);
        var6.field7963.method487(var6.field7963.field956 - var7, (byte) -110);
        class463.method2838(var6, (byte) 117);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(C)I", line = 279)
    private static final int method3223(char arg0) {
        return class142.method936(arg0, (byte) -124) ? 1 : 0;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "()V", line = 286)
    public static final void method3224() {
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZ)V", line = 293)
    private static final void method3225(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field7576 -= 3;
                int var2 = field7573[field7576];
                int var3 = field7573[field7576 + 1];
                int var4 = field7573[field7576 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class755 var5 = class189.method1182(var2, (byte) -101);
                if (var5.field10503 == null) {
                    var5.field10503 = new class755[var4 + 1];
                }
                if (var5.field10503.length <= var4) {
                    class755[] var6 = new class755[var4 + 1];
                    for (int var7 = 0; var7 < var5.field10503.length; var7++) {
                        var6[var7] = var5.field10503[var7];
                    }
                    var5.field10503 = var6;
                }
                if (var4 > 0 && var5.field10503[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class755 var8 = new class755();
                var8.field10416 = var3;
                var8.field10552 = var8.field10445 = var5.field10445;
                var8.field10469 = var4;
                var5.field10503[var4] = var8;
                if (arg1) {
                    field7590 = var8;
                } else {
                    field7591 = var8;
                }
                class27.method159((byte) -105, var5);
                return;
            }
            if (arg0 == 101) {
                class755 var9 = arg1 ? field7590 : field7591;
                if (var9.field10469 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class755 var10 = class189.method1182(var9.field10445, (byte) -101);
                var10.field10503[var9.field10469] = null;
                class27.method159((byte) -105, var10);
                return;
            }
            if (arg0 == 102) {
                class755 var11 = class189.method1182(field7573[--field7576], (byte) -101);
                var11.field10503 = null;
                class27.method159((byte) -105, var11);
                return;
            }
            if (arg0 == 200) {
                field7576 -= 2;
                int var12 = field7573[field7576];
                int var13 = field7573[field7576 + 1];
                class755 var14 = class171.method1093((byte) 121, var12, var13);
                if (var14 != null && var13 != -1) {
                    field7573[field7576++] = 1;
                    if (arg1) {
                        field7590 = var14;
                        return;
                    }
                    field7591 = var14;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7573[--field7576];
                class755 var16 = class189.method1182(var15, (byte) -101);
                if (var16 != null) {
                    field7573[field7576++] = 1;
                    if (arg1) {
                        field7590 = var16;
                        return;
                    }
                    field7591 = var16;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7573[--field7576];
                method3228(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7573[--field7576];
                method3235(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field7576 -= 2;
                int var19 = field7573[field7576];
                int var20 = field7573[field7576 + 1];
                if (class388.field5601.field1366 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class129.field1805.length; var21++) {
                    if (class129.field1805[var21] == var19) {
                        class388.field5601.field1366.method227(class145.field2041, var21, (byte) -3, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class705.field9822.length; var22++) {
                    if (class705.field9822[var22] == var19) {
                        class388.field5601.field1366.method227(class145.field2041, var22, (byte) -3, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field7576 -= 2;
                int var23 = field7573[field7576];
                int var24 = field7573[field7576 + 1];
                if (class388.field5601.field1366 == null) {
                    return;
                }
                class388.field5601.field1366.method232(71, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7573[--field7576] != 0;
                if (class388.field5601.field1366 == null) {
                    return;
                }
                class388.field5601.field1366.method225(var25, (byte) -107);
                return;
            }
            if (arg0 == 411) {
                field7576 -= 2;
                int var26 = field7573[field7576];
                int var27 = field7573[field7576 + 1];
                if (class388.field5601.field1366 == null) {
                    return;
                }
                class388.field5601.field1366.method226(var27, var26, class291.field4179, true);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class755 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class189.method1182(field7573[--field7576], (byte) -101);
            } else {
                var28 = arg1 ? field7590 : field7591;
            }
            if (arg0 == 1000) {
                field7576 -= 4;
                var28.field10429 = field7573[field7576];
                var28.field10489 = field7573[field7576 + 1];
                int var29 = field7573[field7576 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field7573[field7576 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field10492 = (byte) var29;
                var28.field10420 = (byte) var30;
                class27.method159((byte) -105, var28);
                class394.method2465(0, var28);
                if (var28.field10469 == -1) {
                    class636.method3565(true, var28.field10445);
                }
                return;
            }
            if (arg0 == 1001) {
                field7576 -= 4;
                var28.field10527 = field7573[field7576];
                var28.field10550 = field7573[field7576 + 1];
                var28.field10468 = 0;
                var28.field10524 = 0;
                int var31 = field7573[field7576 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field7573[field7576 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field10423 = (byte) var31;
                var28.field10432 = (byte) var32;
                class27.method159((byte) -105, var28);
                class394.method2465(0, var28);
                if (var28.field10416 == 0) {
                    class194.method1202(88, false, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field7573[--field7576] == 1;
                if (var28.field10531 != var33) {
                    var28.field10531 = var33;
                    class27.method159((byte) -105, var28);
                }
                if (var28.field10469 == -1) {
                    class563.method3305(-120, var28.field10445);
                }
                return;
            }
            if (arg0 == 1004) {
                field7576 -= 2;
                var28.field10470 = field7573[field7576];
                var28.field10454 = field7573[field7576 + 1];
                class27.method159((byte) -105, var28);
                class394.method2465(0, var28);
                if (var28.field10416 == 0) {
                    class194.method1202(93, false, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field10519 = field7573[--field7576] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class755 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class189.method1182(field7573[--field7576], (byte) -101);
            } else {
                var34 = arg1 ? field7590 : field7591;
            }
            if (arg0 == 1100) {
                field7576 -= 2;
                var34.field10535 = field7573[field7576];
                if (var34.field10535 > var34.field10433 - var34.field10393) {
                    var34.field10535 = var34.field10433 - var34.field10393;
                }
                if (var34.field10535 < 0) {
                    var34.field10535 = 0;
                }
                var34.field10532 = field7573[field7576 + 1];
                if (var34.field10532 > var34.field10479 - var34.field10501) {
                    var34.field10532 = var34.field10479 - var34.field10501;
                }
                if (var34.field10532 < 0) {
                    var34.field10532 = 0;
                }
                class27.method159((byte) -105, var34);
                if (var34.field10469 == -1) {
                    class400.method2493(var34.field10445, 12);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field10388 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                if (var34.field10469 == -1) {
                    class521.method3107(var34.field10445, (byte) -128);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field10449 = field7573[--field7576] == 1;
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field10510 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field10410 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field7573[--field7576];
                if (var34.field10490 != var35) {
                    var34.field10490 = var35;
                    class27.method159((byte) -105, var34);
                }
                if (var34.field10469 == -1) {
                    class523.method3113(var34.field10445, 32010);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field10466 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field10412 = field7573[--field7576] == 1;
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field10516 = 1;
                var34.field10406 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                if (var34.field10469 == -1) {
                    class290.method1921(var34.field10445, -1);
                }
                return;
            }
            if (arg0 == 1109) {
                field7576 -= 6;
                var34.field10446 = field7573[field7576];
                var34.field10481 = field7573[field7576 + 1];
                var34.field10514 = field7573[field7576 + 2];
                var34.field10522 = field7573[field7576 + 3];
                var34.field10520 = field7573[field7576 + 4];
                var34.field10544 = field7573[field7576 + 5];
                class27.method159((byte) -105, var34);
                if (var34.field10469 == -1) {
                    class559.method3294(var34.field10445, 123);
                    class687.method3872(var34.field10445, -122);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field7573[--field7576];
                if (var34.field10498 != var36) {
                    var34.field10498 = var36;
                    var34.field10465 = 0;
                    var34.field10549 = 1;
                    var34.field10425 = 0;
                    class57 var37 = var34.field10498 == -1 ? null : class607.field8188.method3001(-12575, var34.field10498);
                    if (var37 != null) {
                        class401.method2499(var37, var34.field10465, -26802);
                    }
                    class27.method159((byte) -105, var34);
                }
                if (var34.field10469 == -1) {
                    class63.method446(true, var34.field10445);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field10402 = field7573[--field7576] == 1;
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field7588[--field7580];
                if (!var38.equals(var34.field10542)) {
                    var34.field10542 = var38;
                    class27.method159((byte) -105, var34);
                }
                if (var34.field10469 == -1) {
                    class443.method2714(124, var34.field10445);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field10400 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                if (var34.field10469 == -1) {
                    class455.method2785(var34.field10445, 64);
                }
                return;
            }
            if (arg0 == 1114) {
                field7576 -= 3;
                var34.field10517 = field7573[field7576];
                var34.field10444 = field7573[field7576 + 1];
                var34.field10411 = field7573[field7576 + 2];
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field10399 = field7573[--field7576] == 1;
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field10472 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field10495 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field10392 = field7573[--field7576] == 1;
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field10521 = field7573[--field7576] == 1;
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1120) {
                field7576 -= 2;
                var34.field10433 = field7573[field7576];
                var34.field10479 = field7573[field7576 + 1];
                class27.method159((byte) -105, var34);
                if (var34.field10416 == 0) {
                    class194.method1202(82, false, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field10397 = field7573[--field7576] == 1;
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field10544 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                if (var34.field10469 == -1) {
                    class559.method3294(var34.field10445, 119);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field7573[--field7576];
                var34.field10486 = var39 == 1;
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1125) {
                field7576 -= 2;
                var34.field10543 = field7573[field7576];
                var34.field10456 = field7573[field7576 + 1];
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field10407 = field7573[--field7576];
                class27.method159((byte) -105, var34);
                return;
            }
            if (arg0 == 1127) {
                field7576 -= 2;
                int var40 = field7573[field7576];
                int var41 = field7573[field7576 + 1];
                class648 var42 = class360.field5161.method2279(-123, var40);
                if (var42.field8689 != var41) {
                    var34.method4188(var41, var40, (byte) 64);
                    return;
                }
                var34.method4199(var40, true);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field7573[--field7576];
                String var44 = field7588[--field7580];
                class648 var45 = class360.field5161.method2279(-66, var43);
                if (!var45.field8687.equals(var44)) {
                    var34.method4189(var44, var43, true);
                    return;
                }
                var34.method4199(var43, true);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field7573[--field7576];
                if (var34.field10416 != 5 && arg0 == 1129 || var34.field10416 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field10391 != var46) {
                    var34.field10391 = var46;
                    class27.method159((byte) -105, var34);
                }
                if (var34.field10469 == -1) {
                    class154.method972(68, var34.field10445);
                }
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class755 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class189.method1182(field7573[--field7576], (byte) -101);
            } else {
                var47 = arg1 ? field7590 : field7591;
            }
            class27.method159((byte) -105, var47);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field7576 -= 2;
                int var48 = field7573[field7576];
                int var49 = field7573[field7576 + 1];
                if (var47.field10469 == -1) {
                    class608.method3456(var47.field10445, false);
                    class559.method3294(var47.field10445, 92);
                    class687.method3872(var47.field10445, -126);
                }
                if (var48 == -1) {
                    var47.field10516 = 1;
                    var47.field10406 = -1;
                    var47.field10441 = -1;
                    return;
                }
                var47.field10441 = var48;
                var47.field10439 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field10526 = true;
                } else {
                    var47.field10526 = false;
                }
                class671 var50 = class291.field4179.method1313(var48, true);
                var47.field10514 = var50.field9269;
                var47.field10522 = var50.field9322;
                var47.field10520 = var50.field9330;
                var47.field10446 = var50.field9307;
                var47.field10481 = var50.field9303;
                var47.field10544 = var50.field9332;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field10533 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field10533 = 1;
                } else {
                    var47.field10533 = 2;
                }
                if (var47.field10468 > 0) {
                    var47.field10544 = var47.field10544 * 32 / var47.field10468;
                    return;
                }
                if (var47.field10527 > 0) {
                    var47.field10544 = var47.field10544 * 32 / var47.field10527;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field10516 = 2;
                var47.field10406 = field7573[--field7576];
                if (var47.field10469 == -1) {
                    class290.method1921(var47.field10445, -1);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field10516 = 3;
                var47.field10406 = -1;
                if (var47.field10469 == -1) {
                    class290.method1921(var47.field10445, -1);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field10516 = 6;
                var47.field10406 = field7573[--field7576];
                if (var47.field10469 == -1) {
                    class290.method1921(var47.field10445, -1);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field10516 = 5;
                var47.field10406 = field7573[--field7576];
                if (var47.field10469 == -1) {
                    class290.method1921(var47.field10445, -1);
                }
                return;
            }
            if (arg0 == 1206) {
                field7576 -= 4;
                var47.field10451 = field7573[field7576];
                var47.field10515 = field7573[field7576 + 1];
                var47.field10431 = field7573[field7576 + 2];
                var47.field10509 = field7573[field7576 + 3];
                class27.method159((byte) -105, var47);
                return;
            }
            if (arg0 == 1207) {
                field7576 -= 2;
                var47.field10482 = field7573[field7576];
                var47.field10440 = field7573[field7576 + 1];
                class27.method159((byte) -105, var47);
                return;
            }
            if (arg0 == 1210) {
                field7576 -= 4;
                var47.field10406 = field7573[field7576];
                var47.field10504 = field7573[field7576 + 1];
                if (field7573[field7576 + 2] == 1) {
                    var47.field10516 = 9;
                } else {
                    var47.field10516 = 8;
                }
                if (field7573[field7576 + 3] == 1) {
                    var47.field10526 = true;
                } else {
                    var47.field10526 = false;
                }
                if (var47.field10469 == -1) {
                    class290.method1921(var47.field10445, -1);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field10516 = 5;
                var47.field10406 = class145.field2037;
                var47.field10504 = 0;
                if (var47.field10469 == -1) {
                    class290.method1921(var47.field10445, -1);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class755 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class189.method1182(field7573[--field7576], (byte) -101);
            } else {
                var51 = arg1 ? field7590 : field7591;
            }
            if (arg0 == 1300) {
                int var52 = field7573[--field7576] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method4198(field7588[--field7580], var52, (byte) -32);
                    return;
                }
                field7580--;
                return;
            }
            if (arg0 == 1301) {
                field7576 -= 2;
                int var53 = field7573[field7576];
                int var54 = field7573[field7576 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field10528 = null;
                    return;
                }
                var51.field10528 = class171.method1093((byte) 120, var53, var54);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field7573[--field7576];
                if (class520.field7252 != var55 && class520.field7253 != var55 && class701.field9772 != var55) {
                    return;
                }
                var51.field10419 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field10539 = field7573[--field7576];
                return;
            }
            if (arg0 == 1304) {
                var51.field10430 = field7573[--field7576];
                return;
            }
            if (arg0 == 1305) {
                var51.field10448 = field7588[--field7580];
                return;
            }
            if (arg0 == 1306) {
                var51.field10408 = field7588[--field7580];
                return;
            }
            if (arg0 == 1307) {
                var51.field10551 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field10462 = field7573[--field7576];
                var51.field10467 = field7573[--field7576];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field7573[--field7576];
                int var57 = field7573[--field7576];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method4184((byte) -65, var56, var57 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field10398 = field7588[--field7580];
                return;
            }
            if (arg0 == 1311) {
                var51.field10438 = field7573[--field7576];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field7576 -= 3;
                    var58 = field7573[field7576] - 1;
                    var59 = field7573[field7576 + 1];
                    var60 = field7573[field7576 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field7576 -= 2;
                    var58 = 10;
                    var59 = field7573[field7576];
                    var60 = field7573[field7576 + 1];
                }
                if (var51.field10404 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field10404 = new byte[11];
                    var51.field10414 = new byte[11];
                    var51.field10435 = new int[11];
                }
                var51.field10404[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field10493 = false;
                    for (int var61 = 0; var61 < var51.field10404.length; var61++) {
                        if (var51.field10404[var61] != 0) {
                            var51.field10493 = true;
                            break;
                        }
                    }
                } else {
                    var51.field10493 = true;
                }
                var51.field10414[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field10394 = field7573[--field7576];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class755 var62;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var62 = class189.method1182(field7573[--field7576], (byte) -101);
            } else {
                var62 = arg1 ? field7590 : field7591;
            }
            if (arg0 == 1499) {
                var62.method4192(false);
                return;
            }
            String var63 = field7588[--field7580];
            int[] var64 = null;
            if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                int var65 = field7573[--field7576];
                if (var65 > 0) {
                    var64 = new int[var65];
                    while (var65-- > 0) {
                        var64[var65] = field7573[--field7576];
                    }
                }
                var63 = var63.substring(0, var63.length() - 1);
            }
            Object[] var66 = new Object[var63.length() + 1];
            for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                if (var63.charAt(var67 - 1) == 's') {
                    var66[var67] = field7588[--field7580];
                } else {
                    var66[var67] = Integer.valueOf(field7573[--field7576]);
                }
            }
            int var68 = field7573[--field7576];
            if (var68 == -1) {
                var66 = null;
            } else {
                var66[0] = Integer.valueOf(var68);
            }
            if (arg0 == 1400) {
                var62.field10529 = var66;
            } else if (arg0 == 1401) {
                var62.field10436 = var66;
            } else if (arg0 == 1402) {
                var62.field10452 = var66;
            } else if (arg0 == 1403) {
                var62.field10405 = var66;
            } else if (arg0 == 1404) {
                var62.field10471 = var66;
            } else if (arg0 == 1405) {
                var62.field10415 = var66;
            } else if (arg0 == 1406) {
                var62.field10487 = var66;
            } else if (arg0 == 1407) {
                var62.field10518 = var66;
                var62.field10389 = var64;
            } else if (arg0 == 1408) {
                var62.field10484 = var66;
            } else if (arg0 == 1409) {
                var62.field10502 = var66;
            } else if (arg0 == 1410) {
                var62.field10426 = var66;
            } else if (arg0 == 1411) {
                var62.field10403 = var66;
            } else if (arg0 == 1412) {
                var62.field10506 = var66;
            } else if (arg0 == 1414) {
                var62.field10540 = var66;
                var62.field10401 = var64;
            } else if (arg0 == 1415) {
                var62.field10553 = var66;
                var62.field10525 = var64;
            } else if (arg0 == 1416) {
                var62.field10496 = var66;
            } else if (arg0 == 1417) {
                var62.field10395 = var66;
            } else if (arg0 == 1418) {
                var62.field10485 = var66;
            } else if (arg0 == 1419) {
                var62.field10538 = var66;
            } else if (arg0 == 1420) {
                var62.field10460 = var66;
            } else if (arg0 == 1421) {
                var62.field10500 = var66;
            } else if (arg0 == 1422) {
                var62.field10458 = var66;
            } else if (arg0 == 1423) {
                var62.field10424 = var66;
            } else if (arg0 == 1424) {
                var62.field10536 = var66;
            } else if (arg0 == 1425) {
                var62.field10523 = var66;
            } else if (arg0 == 1426) {
                var62.field10483 = var66;
            } else if (arg0 == 1427) {
                var62.field10418 = var66;
            } else if (arg0 == 1428) {
                var62.field10455 = var66;
                var62.field10473 = var64;
            } else if (arg0 == 1429) {
                var62.field10505 = var66;
                var62.field10463 = var64;
            } else if (arg0 == 1430) {
                var62.field10417 = var66;
            }
            var62.field10396 = true;
            return;
        } else if (arg0 < 1600) {
            class755 var69 = arg1 ? field7590 : field7591;
            if (arg0 == 1500) {
                field7573[field7576++] = var69.field10443;
                return;
            }
            if (arg0 == 1501) {
                field7573[field7576++] = var69.field10447;
                return;
            }
            if (arg0 == 1502) {
                field7573[field7576++] = var69.field10393;
                return;
            }
            if (arg0 == 1503) {
                field7573[field7576++] = var69.field10501;
                return;
            }
            if (arg0 == 1504) {
                field7573[field7576++] = var69.field10531 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field7573[field7576++] = var69.field10552;
                return;
            }
            if (arg0 == 1506) {
                class755 var70 = class528.method3138(0, var69);
                field7573[field7576++] = var70 == null ? -1 : var70.field10445;
                return;
            }
        } else if (arg0 < 1700) {
            class755 var71 = arg1 ? field7590 : field7591;
            if (arg0 == 1600) {
                field7573[field7576++] = var71.field10535;
                return;
            }
            if (arg0 == 1601) {
                field7573[field7576++] = var71.field10532;
                return;
            }
            if (arg0 == 1602) {
                field7588[field7580++] = var71.field10542;
                return;
            }
            if (arg0 == 1603) {
                field7573[field7576++] = var71.field10433;
                return;
            }
            if (arg0 == 1604) {
                field7573[field7576++] = var71.field10479;
                return;
            }
            if (arg0 == 1605) {
                field7573[field7576++] = var71.field10544;
                return;
            }
            if (arg0 == 1606) {
                field7573[field7576++] = var71.field10514;
                return;
            }
            if (arg0 == 1607) {
                field7573[field7576++] = var71.field10520;
                return;
            }
            if (arg0 == 1608) {
                field7573[field7576++] = var71.field10522;
                return;
            }
            if (arg0 == 1609) {
                field7573[field7576++] = var71.field10510;
                return;
            }
            if (arg0 == 1610) {
                field7573[field7576++] = var71.field10446;
                return;
            }
            if (arg0 == 1611) {
                field7573[field7576++] = var71.field10481;
                return;
            }
            if (arg0 == 1612) {
                field7573[field7576++] = var71.field10490;
                return;
            }
            if (arg0 == 1613) {
                int var72 = field7573[--field7576];
                class648 var73 = class360.field5161.method2279(-109, var72);
                if (var73.method3628((byte) -16)) {
                    field7588[field7580++] = var71.method4196((byte) 57, var72, var73.field8687);
                    return;
                }
                field7573[field7576++] = var71.method4185(var73.field8689, var72, true);
                return;
            }
            if (arg0 == 1614) {
                field7573[field7576++] = var71.field10466;
                return;
            }
            if (arg0 == 2614) {
                field7573[field7576++] = var71.field10516 == 1 ? var71.field10406 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class755 var74 = arg1 ? field7590 : field7591;
            if (arg0 == 1700) {
                field7573[field7576++] = var74.field10441;
                return;
            }
            if (arg0 == 1701) {
                if (var74.field10441 != -1) {
                    field7573[field7576++] = var74.field10439;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field7573[field7576++] = var74.field10469;
                return;
            }
        } else if (arg0 < 1900) {
            class755 var75 = arg1 ? field7590 : field7591;
            if (arg0 == 1800) {
                field7573[field7576++] = client.method2738(var75).method1838((byte) 102);
                return;
            }
            if (arg0 == 1801) {
                int var76 = field7573[--field7576];
                int var360 = var76 - 1;
                if (var75.field10551 != null && var360 < var75.field10551.length && var75.field10551[var360] != null) {
                    field7588[field7580++] = var75.field10551[var360];
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var75.field10448 == null) {
                    field7588[field7580++] = "";
                    return;
                }
                field7588[field7580++] = var75.field10448;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class755 var358;
            if (arg0 >= 2000) {
                var358 = class189.method1182(field7573[--field7576], (byte) -101);
                arg0 -= 1000;
            } else {
                var358 = arg1 ? field7590 : field7591;
            }
            if (field7594 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var358.field10418 == null) {
                    return;
                }
                class142 var359 = new class142();
                var359.field2020 = var358;
                var359.field2024 = var358.field10418;
                var359.field2022 = field7594 + 1;
                class218.field2845.method3610(9289, var359);
                return;
            }
        } else if (arg0 < 2600) {
            class755 var77 = class189.method1182(field7573[--field7576], (byte) -101);
            if (arg0 == 2500) {
                field7573[field7576++] = var77.field10443;
                return;
            }
            if (arg0 == 2501) {
                field7573[field7576++] = var77.field10447;
                return;
            }
            if (arg0 == 2502) {
                field7573[field7576++] = var77.field10393;
                return;
            }
            if (arg0 == 2503) {
                field7573[field7576++] = var77.field10501;
                return;
            }
            if (arg0 == 2504) {
                field7573[field7576++] = var77.field10531 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field7573[field7576++] = var77.field10552;
                return;
            }
            if (arg0 == 1506) {
                class755 var78 = class528.method3138(0, var77);
                field7573[field7576++] = var78 == null ? -1 : var78.field10445;
                return;
            }
        } else if (arg0 < 2700) {
            class755 var79 = class189.method1182(field7573[--field7576], (byte) -101);
            if (arg0 == 2600) {
                field7573[field7576++] = var79.field10535;
                return;
            }
            if (arg0 == 2601) {
                field7573[field7576++] = var79.field10532;
                return;
            }
            if (arg0 == 2602) {
                field7588[field7580++] = var79.field10542;
                return;
            }
            if (arg0 == 2603) {
                field7573[field7576++] = var79.field10433;
                return;
            }
            if (arg0 == 2604) {
                field7573[field7576++] = var79.field10479;
                return;
            }
            if (arg0 == 2605) {
                field7573[field7576++] = var79.field10544;
                return;
            }
            if (arg0 == 2606) {
                field7573[field7576++] = var79.field10514;
                return;
            }
            if (arg0 == 2607) {
                field7573[field7576++] = var79.field10520;
                return;
            }
            if (arg0 == 2608) {
                field7573[field7576++] = var79.field10522;
                return;
            }
            if (arg0 == 2609) {
                field7573[field7576++] = var79.field10510;
                return;
            }
            if (arg0 == 2610) {
                field7573[field7576++] = var79.field10446;
                return;
            }
            if (arg0 == 2611) {
                field7573[field7576++] = var79.field10481;
                return;
            }
            if (arg0 == 2612) {
                field7573[field7576++] = var79.field10490;
                return;
            }
            if (arg0 == 2613) {
                field7573[field7576++] = var79.field10466;
                return;
            }
            if (arg0 == 2614) {
                field7573[field7576++] = var79.field10516 == 1 ? var79.field10406 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class755 var80 = class189.method1182(field7573[--field7576], (byte) -101);
                field7573[field7576++] = var80.field10441;
                return;
            }
            if (arg0 == 2701) {
                class755 var81 = class189.method1182(field7573[--field7576], (byte) -101);
                if (var81.field10441 == -1) {
                    field7573[field7576++] = 0;
                    return;
                } else {
                    field7573[field7576++] = var81.field10439;
                    return;
                }
            }
            if (arg0 == 2702) {
                int var82 = field7573[--field7576];
                class654 var83 = (class654) class259.field3747.method812(106, (long) var82);
                if (var83 != null) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class755 var84 = class189.method1182(field7573[--field7576], (byte) -101);
                if (var84.field10503 == null) {
                    field7573[field7576++] = 0;
                    return;
                }
                int var85 = var84.field10503.length;
                for (int var86 = 0; var86 < var84.field10503.length; var86++) {
                    if (var84.field10503[var86] == null) {
                        var85 = var86;
                        break;
                    }
                }
                field7573[field7576++] = var85;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field7576 -= 2;
                int var87 = field7573[field7576];
                int var88 = field7573[field7576 + 1];
                class654 var89 = (class654) class259.field3747.method812(108, (long) var87);
                if (var89 != null && var89.field8745 == var88) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class755 var90 = class189.method1182(field7573[--field7576], (byte) -101);
            if (arg0 == 2800) {
                field7573[field7576++] = client.method2738(var90).method1838((byte) 106);
                return;
            }
            if (arg0 == 2801) {
                int var91 = field7573[--field7576];
                int var361 = var91 - 1;
                if (var90.field10551 != null && var361 < var90.field10551.length && var90.field10551[var361] != null) {
                    field7588[field7580++] = var90.field10551[var361];
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var90.field10448 == null) {
                    field7588[field7580++] = "";
                    return;
                }
                field7588[field7580++] = var90.field10448;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var92 = field7588[--field7580];
                class542.method3208((byte) -128, var92);
                return;
            }
            if (arg0 == 3101) {
                field7576 -= 2;
                class368.method2319(field7573[field7576 + 1], field7573[field7576], 1000, class388.field5601);
                return;
            }
            if (arg0 == 3103) {
                class77.method570((byte) 91, true);
                return;
            }
            if (arg0 == 3104) {
                String var93 = field7588[--field7580];
                int var94 = 0;
                if (class134.method849(var93, 0)) {
                    var94 = class341.method2169(var93, -90);
                }
                field7584++;
                class583 var95 = class54.method400(class213.field2800, (byte) -91, class25.field315);
                var95.field7963.method473(-123, var94);
                class463.method2838(var95, (byte) 123);
                return;
            }
            if (arg0 == 3105) {
                String var96 = field7588[--field7580];
                field7577++;
                class583 var97 = class54.method400(class213.field2800, (byte) -101, class424.field5950);
                var97.field7963.method444(var96.length() + 1, 128);
                var97.field7963.method510(var96, (byte) 61);
                class463.method2838(var97, (byte) 126);
                return;
            }
            if (arg0 == 3106) {
                String var98 = field7588[--field7580];
                field7578++;
                class583 var99 = class54.method400(class213.field2800, (byte) 116, class18.field188);
                var99.field7963.method444(var98.length() + 1, 128);
                var99.field7963.method510(var98, (byte) 61);
                class463.method2838(var99, (byte) 117);
                return;
            }
            if (arg0 == 3107) {
                int var100 = field7573[--field7576];
                String var101 = field7588[--field7580];
                class553.method3271(var101, -5, var100);
                return;
            }
            if (arg0 == 3108) {
                field7576 -= 3;
                int var102 = field7573[field7576];
                int var103 = field7573[field7576 + 1];
                int var104 = field7573[field7576 + 2];
                class755 var105 = class189.method1182(var104, (byte) -101);
                class177.method1115(var103, var102, var105, 0);
                return;
            }
            if (arg0 == 3109) {
                field7576 -= 2;
                int var106 = field7573[field7576];
                int var107 = field7573[field7576 + 1];
                class755 var108 = arg1 ? field7590 : field7591;
                class177.method1115(var107, var106, var108, 0);
                return;
            }
            if (arg0 == 3110) {
                int var109 = field7573[--field7576];
                field7572++;
                class583 var110 = class54.method400(class213.field2800, (byte) 100, class313.field4352);
                var110.field7963.method492(-2, var109);
                class463.method2838(var110, (byte) 120);
                return;
            }
            if (arg0 == 3111) {
                field7576 -= 2;
                int var111 = field7573[field7576];
                int var112 = field7573[field7576 + 1];
                class654 var113 = (class654) class259.field3747.method812(106, (long) var111);
                if (var113 != null) {
                    class39.method217((byte) 96, var113, var113.field8745 != var112, true);
                }
                class549.method3256(3, var112, true, (byte) 96, var111);
                return;
            }
            if (arg0 == 3112) {
                field7576--;
                int var114 = field7573[field7576];
                class654 var115 = (class654) class259.field3747.method812(109, (long) var114);
                if (var115 != null && var115.field8746 == 3) {
                    class39.method217((byte) 96, var115, true, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class180.method1139((byte) 33, field7588[--field7580]);
                return;
            }
            if (arg0 == 3114) {
                field7576 -= 2;
                int var116 = field7573[field7576];
                int var117 = field7573[field7576 + 1];
                String var118 = field7588[--field7580];
                class476.method2904(var118, "", "", "", var116, -1, var117);
                return;
            }
            if (arg0 == 3115) {
                field7576 -= 11;
                class557[] var119 = client.method2746(0);
                class125[] var120 = class146.method947(-53);
                class507.method3045(var120[field7573[field7576 + 1]], field7573[field7576 + 5], field7573[field7576 + 4], field7573[field7576 + 7], field7573[field7576 + 8], field7573[field7576 + 9], var119[field7573[field7576]], field7573[field7576 + 2], field7573[field7576 + 10], field7573[field7576 + 3], (byte) -93, field7573[field7576 + 6]);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field7576 -= 3;
                class604.method3439(field7573[field7576], -397, 256, 255, field7573[field7576 + 1], field7573[field7576 + 2]);
                return;
            }
            if (arg0 == 3201) {
                class301.method1982(field7573[--field7576], 50, 0, 255);
                return;
            }
            if (arg0 == 3202) {
                field7576 -= 2;
                class302.method1992(field7573[field7576 + 1], 255, -1, field7573[field7576]);
                return;
            }
            if (arg0 == 3203) {
                field7576 -= 4;
                class604.method3439(field7573[field7576], -397, 256, field7573[field7576 + 3], field7573[field7576 + 1], field7573[field7576 + 2]);
                return;
            }
            if (arg0 == 3204) {
                field7576 -= 3;
                class301.method1982(field7573[field7576], field7573[field7576 + 2], 0, field7573[field7576 + 1]);
                return;
            }
            if (arg0 == 3205) {
                field7576 -= 3;
                class302.method1992(field7573[field7576 + 1], field7573[field7576 + 2], -1, field7573[field7576]);
                return;
            }
            if (arg0 == 3206) {
                field7576 -= 4;
                class545.method3220(field7573[field7576 + 3], field7573[field7576], 256, false, (byte) 114, field7573[field7576 + 2], field7573[field7576 + 1]);
                return;
            }
            if (arg0 == 3207) {
                field7576 -= 4;
                class545.method3220(field7573[field7576 + 3], field7573[field7576], 256, true, (byte) 60, field7573[field7576 + 2], field7573[field7576 + 1]);
                return;
            }
            if (arg0 == 3208) {
                field7576 -= 5;
                class604.method3439(field7573[field7576], -397, field7573[field7576 + 4], field7573[field7576 + 3], field7573[field7576 + 1], field7573[field7576 + 2]);
                return;
            }
            if (arg0 == 3209) {
                field7576 -= 5;
                class545.method3220(field7573[field7576 + 3], field7573[field7576], field7573[field7576 + 4], false, (byte) 73, field7573[field7576 + 2], field7573[field7576 + 1]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field7573[field7576++] = class483.field6741;
                return;
            }
            if (arg0 == 3301) {
                field7576 -= 2;
                int var121 = field7573[field7576];
                int var122 = field7573[field7576 + 1];
                field7573[field7576++] = class608.method3457(true, false, var121, var122);
                return;
            }
            if (arg0 == 3302) {
                field7576 -= 2;
                int var123 = field7573[field7576];
                int var124 = field7573[field7576 + 1];
                field7573[field7576++] = class87.method605(var123, false, -1, var124);
                return;
            }
            if (arg0 == 3303) {
                field7576 -= 2;
                int var125 = field7573[field7576];
                int var126 = field7573[field7576 + 1];
                field7573[field7576++] = class346.method2211(var126, false, var125, 0);
                return;
            }
            if (arg0 == 3304) {
                int var127 = field7573[--field7576];
                field7573[field7576++] = class258.field3739.method3295((byte) 81, var127).field8034;
                return;
            }
            if (arg0 == 3305) {
                int var128 = field7573[--field7576];
                field7573[field7576++] = class581.field7955[var128];
                return;
            }
            if (arg0 == 3306) {
                int var129 = field7573[--field7576];
                field7573[field7576++] = class444.field6168[var129];
                return;
            }
            if (arg0 == 3307) {
                int var130 = field7573[--field7576];
                field7573[field7576++] = class481.field6708[var130];
                return;
            }
            if (arg0 == 3308) {
                byte var131 = class388.field5601.field4408;
                int var132 = (class388.field5601.field4410 >> 9) + class113.field1509;
                int var133 = (class388.field5601.field4418 >> 9) + class587.field7995;
                field7573[field7576++] = (var131 << 28) + (var132 << 14) + var133;
                return;
            }
            if (arg0 == 3309) {
                int var134 = field7573[--field7576];
                field7573[field7576++] = var134 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var135 = field7573[--field7576];
                field7573[field7576++] = var135 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var136 = field7573[--field7576];
                field7573[field7576++] = var136 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field7573[field7576++] = class560.field7795 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field7576 -= 2;
                int var137 = field7573[field7576];
                int var138 = field7573[field7576 + 1];
                field7573[field7576++] = class608.method3457(true, true, var137, var138);
                return;
            }
            if (arg0 == 3314) {
                field7576 -= 2;
                int var139 = field7573[field7576];
                int var140 = field7573[field7576 + 1];
                field7573[field7576++] = class87.method605(var139, true, -1, var140);
                return;
            }
            if (arg0 == 3315) {
                field7576 -= 2;
                int var141 = field7573[field7576];
                int var142 = field7573[field7576 + 1];
                field7573[field7576++] = class346.method2211(var142, true, var141, 0);
                return;
            }
            if (arg0 == 3316) {
                if (class290.field4163 >= 2) {
                    field7573[field7576++] = class290.field4163;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field7573[field7576++] = class84.field1188;
                return;
            }
            if (arg0 == 3318) {
                field7573[field7576++] = class416.field5882.field6484;
                return;
            }
            if (arg0 == 3321) {
                field7573[field7576++] = class195.field2631;
                return;
            }
            if (arg0 == 3322) {
                field7573[field7576++] = class505.field7023;
                return;
            }
            if (arg0 == 3323) {
                if (class263.field3854 >= 5 && class263.field3854 <= 9) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class263.field3854 >= 5 && class263.field3854 <= 9) {
                    field7573[field7576++] = class263.field3854;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field7573[field7576++] = class630.field8463 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field7573[field7576++] = class388.field5601.field1342;
                return;
            }
            if (arg0 == 3327) {
                field7573[field7576++] = class388.field5601.field1366 != null && class388.field5601.field1366.field503 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field7573[field7576++] = class464.field6463 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var143 = field7573[--field7576];
                field7573[field7576++] = class533.method3167(var143, 5265, false);
                return;
            }
            if (arg0 == 3331) {
                field7576 -= 2;
                int var144 = field7573[field7576];
                int var145 = field7573[field7576 + 1];
                field7573[field7576++] = class712.method4006(false, var145, false, var144, (byte) -18);
                return;
            }
            if (arg0 == 3332) {
                field7576 -= 2;
                int var146 = field7573[field7576];
                int var147 = field7573[field7576 + 1];
                field7573[field7576++] = class712.method4006(false, var147, true, var146, (byte) -119);
                return;
            }
            if (arg0 == 3333) {
                field7573[field7576++] = class336.field4726;
                return;
            }
            if (arg0 == 3335) {
                field7573[field7576++] = class120.field1576;
                return;
            }
            if (arg0 == 3336) {
                field7576 -= 4;
                int var148 = field7573[field7576];
                int var149 = field7573[field7576 + 1];
                int var150 = field7573[field7576 + 2];
                int var151 = field7573[field7576 + 3];
                int var152 = (var149 << 14) + var148;
                int var153 = (var150 << 28) + var152;
                int var154 = var151 + var153;
                field7573[field7576++] = var154;
                return;
            }
            if (arg0 == 3337) {
                field7573[field7576++] = class593.field8043;
                return;
            }
            if (arg0 == 3338) {
                field7573[field7576++] = class726.method4054(false);
                return;
            }
            if (arg0 == 3339) {
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field7573[field7576++] = class121.field1585 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field7573[field7576++] = class38.field479 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field7573[field7576++] = class103.field1419.method1553((byte) 63);
                return;
            }
            if (arg0 == 3343) {
                field7573[field7576++] = class103.field1419.method1556(20);
                return;
            }
            if (arg0 == 3344) {
                field7588[field7580++] = class737.method4104(0);
                return;
            }
            if (arg0 == 3345) {
                field7588[field7580++] = class670.method3775((byte) -118);
                return;
            }
            if (arg0 == 3346) {
                field7573[field7576++] = class310.method2039((byte) 69);
                return;
            }
            if (arg0 == 3347) {
                field7573[field7576++] = class10.field88;
                return;
            }
            if (arg0 == 3349) {
                field7573[field7576++] = class388.field5601.field7125.method168(false) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field7576 -= 2;
                int var155 = field7573[field7576];
                int var156 = field7573[field7576 + 1];
                class537 var157 = class189.field2579.method3264((byte) 38, var155);
                field7588[field7580++] = var157.method3175((byte) -68, var156);
                return;
            }
            if (arg0 == 3408) {
                field7576 -= 4;
                int var158 = field7573[field7576];
                int var159 = field7573[field7576 + 1];
                int var160 = field7573[field7576 + 2];
                int var161 = field7573[field7576 + 3];
                class537 var162 = class189.field2579.method3264((byte) 38, var160);
                if (var162.field7444 == var158 && var162.field7439 == var159) {
                    if (var159 == 115) {
                        field7588[field7580++] = var162.method3175((byte) -74, var161);
                        return;
                    }
                    field7573[field7576++] = var162.method3178(var161, (byte) -27);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var160 + "-" + var161);
            }
            if (arg0 == 3409) {
                field7576 -= 3;
                int var163 = field7573[field7576];
                int var164 = field7573[field7576 + 1];
                int var165 = field7573[field7576 + 2];
                if (var164 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class537 var166 = class189.field2579.method3264((byte) 38, var164);
                if (var166.field7439 != var163) {
                    throw new RuntimeException("C3409-1");
                }
                field7573[field7576++] = var166.method3174((byte) 67, var165) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var167 = field7573[--field7576];
                String var168 = field7588[--field7580];
                if (var167 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class537 var169 = class189.field2579.method3264((byte) 38, var167);
                if (var169.field7439 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field7573[field7576++] = var169.method3184(var168, 63) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var170 = field7573[--field7576];
                class537 var171 = class189.field2579.method3264((byte) 38, var170);
                field7573[field7576++] = var171.field7442.method816((byte) -36);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class432.field6031 == 0) {
                    field7573[field7576++] = -2;
                    return;
                }
                if (class432.field6031 == 1) {
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = class239.field3558;
                return;
            }
            if (arg0 == 3601) {
                int var172 = field7573[--field7576];
                if (class432.field6031 == 2 && var172 < class239.field3558) {
                    field7588[field7580++] = class193.field2627[var172];
                    if (class342.field4854[var172] != null) {
                        field7588[field7580++] = class342.field4854[var172];
                        return;
                    }
                    field7588[field7580++] = "";
                    return;
                }
                field7588[field7580++] = "";
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var173 = field7573[--field7576];
                if (class432.field6031 == 2 && var173 < class239.field3558) {
                    field7573[field7576++] = class88.field1246[var173];
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var174 = field7573[--field7576];
                if (class432.field6031 == 2 && var174 < class239.field3558) {
                    field7573[field7576++] = class473.field6553[var174];
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var175 = field7588[--field7580];
                int var176 = field7573[--field7576];
                class177.method1114((byte) -122, var176, var175);
                return;
            }
            if (arg0 == 3605) {
                String var177 = field7588[--field7580];
                class728.method4065(var177, (byte) 21);
                return;
            }
            if (arg0 == 3606) {
                String var178 = field7588[--field7580];
                class417.method2595(3863, var178);
                return;
            }
            if (arg0 == 3607) {
                String var179 = field7588[--field7580];
                class360.method2294((byte) -46, false, var179);
                return;
            }
            if (arg0 == 3608) {
                String var180 = field7588[--field7580];
                class510.method3054(var180, 1);
                return;
            }
            if (arg0 == 3609) {
                String var181 = field7588[--field7580];
                if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                    var181 = var181.substring(7);
                }
                field7573[field7576++] = class207.method1241(var181, 3) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var182 = field7573[--field7576];
                if (class432.field6031 == 2 && var182 < class239.field3558) {
                    field7588[field7580++] = class573.field7908[var182];
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class13.field126 != null) {
                    field7588[field7580++] = class27.method158(class13.field126, 106);
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class13.field126 != null) {
                    field7573[field7576++] = class691.field9619;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var183 = field7573[--field7576];
                if (class13.field126 != null && var183 < class691.field9619) {
                    field7588[field7580++] = class623.field8402[var183].field3654;
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var184 = field7573[--field7576];
                if (class13.field126 != null && var184 < class691.field9619) {
                    field7573[field7576++] = class623.field8402[var184].field3657;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var185 = field7573[--field7576];
                if (class13.field126 != null && var185 < class691.field9619) {
                    field7573[field7576++] = class623.field8402[var185].field3658;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field7573[field7576++] = class723.field10043;
                return;
            }
            if (arg0 == 3617) {
                String var186 = field7588[--field7580];
                class646.method3613(var186, (byte) -30);
                return;
            }
            if (arg0 == 3618) {
                field7573[field7576++] = class62.field894;
                return;
            }
            if (arg0 == 3619) {
                String var187 = field7588[--field7580];
                class621.method3506(var187, true);
                return;
            }
            if (arg0 == 3620) {
                class436.method2688(3);
                return;
            }
            if (arg0 == 3621) {
                if (class432.field6031 == 0) {
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = class97.field1370;
                return;
            }
            if (arg0 == 3622) {
                int var188 = field7573[--field7576];
                if (class432.field6031 != 0 && var188 < class97.field1370) {
                    field7588[field7580++] = class438.field6108[var188];
                    if (class747.field10288[var188] != null) {
                        field7588[field7580++] = class747.field10288[var188];
                        return;
                    }
                    field7588[field7580++] = "";
                    return;
                }
                field7588[field7580++] = "";
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var189 = field7588[--field7580];
                if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                    var189 = var189.substring(7);
                }
                field7573[field7576++] = class113.method728(var189, true) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var190 = field7573[--field7576];
                if (class623.field8402 != null && var190 < class691.field9619 && class623.field8402[var190].field3655.equalsIgnoreCase(class388.field5601.field1313)) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class513.field7088 != null) {
                    field7588[field7580++] = class513.field7088;
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var191 = field7573[--field7576];
                if (class13.field126 != null && var191 < class691.field9619) {
                    field7588[field7580++] = class623.field8402[var191].field3656;
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var192 = field7573[--field7576];
                if (class432.field6031 == 2 && var192 >= 0 && var192 < class239.field3558) {
                    field7573[field7576++] = class580.field7945[var192] ? 1 : 0;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var193 = field7588[--field7580];
                if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                    var193 = var193.substring(7);
                }
                field7573[field7576++] = class370.method2325(var193, (byte) 117);
                return;
            }
            if (arg0 == 3629) {
                field7573[field7576++] = class259.field3749;
                return;
            }
            if (arg0 == 3630) {
                String var194 = field7588[--field7580];
                class360.method2294((byte) -46, true, var194);
                return;
            }
            if (arg0 == 3631) {
                int var195 = field7573[--field7576];
                field7573[field7576++] = class315.field4362[var195] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var196 = field7573[--field7576];
                if (class13.field126 != null && var196 < class691.field9619) {
                    field7588[field7580++] = class623.field8402[var196].field3655;
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var197 = field7573[--field7576];
                if (class432.field6031 != 0 && var197 < class97.field1370) {
                    field7588[field7580++] = class532.field7393[var197];
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var198 = field7573[--field7576];
                field7573[field7576++] = class109.field1467[var198].method1724((byte) -105);
                return;
            }
            if (arg0 == 3904) {
                int var199 = field7573[--field7576];
                field7573[field7576++] = class109.field1467[var199].field3694;
                return;
            }
            if (arg0 == 3905) {
                int var200 = field7573[--field7576];
                field7573[field7576++] = class109.field1467[var200].field3690;
                return;
            }
            if (arg0 == 3906) {
                int var201 = field7573[--field7576];
                field7573[field7576++] = class109.field1467[var201].field3693;
                return;
            }
            if (arg0 == 3907) {
                int var202 = field7573[--field7576];
                field7573[field7576++] = class109.field1467[var202].field3689;
                return;
            }
            if (arg0 == 3908) {
                int var203 = field7573[--field7576];
                field7573[field7576++] = class109.field1467[var203].field3688;
                return;
            }
            if (arg0 == 3910) {
                int var204 = field7573[--field7576];
                int var205 = class109.field1467[var204].method1722((byte) -107);
                field7573[field7576++] = var205 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var206 = field7573[--field7576];
                int var207 = class109.field1467[var206].method1722((byte) -107);
                field7573[field7576++] = var207 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var208 = field7573[--field7576];
                int var209 = class109.field1467[var208].method1722((byte) -107);
                field7573[field7576++] = var209 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var210 = field7573[--field7576];
                int var211 = class109.field1467[var210].method1722((byte) -107);
                field7573[field7576++] = var211 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field7576 -= 2;
                int var212 = field7573[field7576];
                int var213 = field7573[field7576 + 1];
                field7573[field7576++] = var212 + var213;
                return;
            }
            if (arg0 == 4001) {
                field7576 -= 2;
                int var214 = field7573[field7576];
                int var215 = field7573[field7576 + 1];
                field7573[field7576++] = var214 - var215;
                return;
            }
            if (arg0 == 4002) {
                field7576 -= 2;
                int var216 = field7573[field7576];
                int var217 = field7573[field7576 + 1];
                field7573[field7576++] = var216 * var217;
                return;
            }
            if (arg0 == 4003) {
                field7576 -= 2;
                int var218 = field7573[field7576];
                int var219 = field7573[field7576 + 1];
                field7573[field7576++] = var218 / var219;
                return;
            }
            if (arg0 == 4004) {
                int var220 = field7573[--field7576];
                field7573[field7576++] = (int) (Math.random() * (double) var220);
                return;
            }
            if (arg0 == 4005) {
                int var221 = field7573[--field7576];
                field7573[field7576++] = (int) (Math.random() * (double) (var221 + 1));
                return;
            }
            if (arg0 == 4006) {
                field7576 -= 5;
                int var222 = field7573[field7576];
                int var223 = field7573[field7576 + 1];
                int var224 = field7573[field7576 + 2];
                int var225 = field7573[field7576 + 3];
                int var226 = field7573[field7576 + 4];
                field7573[field7576++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                return;
            }
            if (arg0 == 4007) {
                field7576 -= 2;
                long var227 = (long) field7573[field7576];
                long var229 = (long) field7573[field7576 + 1];
                field7573[field7576++] = (int) (var227 * var229 / 100L + var227);
                return;
            }
            if (arg0 == 4008) {
                field7576 -= 2;
                int var231 = field7573[field7576];
                int var232 = field7573[field7576 + 1];
                field7573[field7576++] = var231 | 0x1 << var232;
                return;
            }
            if (arg0 == 4009) {
                field7576 -= 2;
                int var233 = field7573[field7576];
                int var234 = field7573[field7576 + 1];
                field7573[field7576++] = var233 & -(0x1 << var234) - 1;
                return;
            }
            if (arg0 == 4010) {
                field7576 -= 2;
                int var235 = field7573[field7576];
                int var236 = field7573[field7576 + 1];
                field7573[field7576++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field7576 -= 2;
                int var237 = field7573[field7576];
                int var238 = field7573[field7576 + 1];
                field7573[field7576++] = var237 % var238;
                return;
            }
            if (arg0 == 4012) {
                field7576 -= 2;
                int var239 = field7573[field7576];
                int var240 = field7573[field7576 + 1];
                if (var239 == 0) {
                    field7573[field7576++] = 0;
                    return;
                }
                field7573[field7576++] = (int) Math.pow((double) var239, (double) var240);
                return;
            }
            if (arg0 == 4013) {
                field7576 -= 2;
                int var241 = field7573[field7576];
                int var242 = field7573[field7576 + 1];
                if (var241 == 0) {
                    field7573[field7576++] = 0;
                    return;
                }
                if (var242 == 0) {
                    field7573[field7576++] = Integer.MAX_VALUE;
                    return;
                }
                field7573[field7576++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                return;
            }
            if (arg0 == 4014) {
                field7576 -= 2;
                int var243 = field7573[field7576];
                int var244 = field7573[field7576 + 1];
                field7573[field7576++] = var243 & var244;
                return;
            }
            if (arg0 == 4015) {
                field7576 -= 2;
                int var245 = field7573[field7576];
                int var246 = field7573[field7576 + 1];
                field7573[field7576++] = var245 | var246;
                return;
            }
            if (arg0 == 4016) {
                field7576 -= 2;
                int var247 = field7573[field7576];
                int var248 = field7573[field7576 + 1];
                field7573[field7576++] = var247 < var248 ? var247 : var248;
                return;
            }
            if (arg0 == 4017) {
                field7576 -= 2;
                int var249 = field7573[field7576];
                int var250 = field7573[field7576 + 1];
                field7573[field7576++] = var249 > var250 ? var249 : var250;
                return;
            }
            if (arg0 == 4018) {
                field7576 -= 3;
                long var251 = (long) field7573[field7576];
                long var253 = (long) field7573[field7576 + 1];
                long var255 = (long) field7573[field7576 + 2];
                field7573[field7576++] = (int) (var251 * var255 / var253);
                return;
            }
            if (arg0 == 4019) {
                field7576 -= 2;
                int var257 = field7573[field7576];
                int var258 = field7573[field7576 + 1];
                if (var257 > 700 || var258 > 700) {
                    field7573[field7576++] = 256;
                }
                double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                field7573[field7576++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var261 = field7588[--field7580];
                int var262 = field7573[--field7576];
                field7588[field7580++] = var261 + var262;
                return;
            }
            if (arg0 == 4101) {
                field7580 -= 2;
                String var263 = field7588[field7580];
                String var264 = field7588[field7580 + 1];
                field7588[field7580++] = var263 + var264;
                return;
            }
            if (arg0 == 4102) {
                String var265 = field7588[--field7580];
                int var266 = field7573[--field7576];
                field7588[field7580++] = var265 + class378.method2368(var266, true, (byte) -120);
                return;
            }
            if (arg0 == 4103) {
                String var267 = field7588[--field7580];
                field7588[field7580++] = var267.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field7588[field7580++] = class26.method154(124, class120.field1576, class659.method3665(-1, field7573[--field7576]));
                return;
            }
            if (arg0 == 4105) {
                field7580 -= 2;
                String var268 = field7588[field7580];
                String var269 = field7588[field7580 + 1];
                if (class388.field5601.field1366 != null && class388.field5601.field1366.field503) {
                    field7588[field7580++] = var269;
                    return;
                }
                field7588[field7580++] = var268;
                return;
            }
            if (arg0 == 4106) {
                int var270 = field7573[--field7576];
                field7588[field7580++] = Integer.toString(var270);
                return;
            }
            if (arg0 == 4107) {
                field7580 -= 2;
                field7573[field7576++] = class529.method3145(class120.field1576, field7588[field7580], field7588[field7580 + 1], -1);
                return;
            }
            if (arg0 == 4108) {
                String var271 = field7588[--field7580];
                field7576 -= 2;
                int var272 = field7573[field7576];
                int var273 = field7573[field7576 + 1];
                class179 var274 = class506.method3043(0, var273, 35, class307.field4312);
                field7573[field7576++] = var274.method1136(-257, var271, var272, class113.field1513);
                return;
            }
            if (arg0 == 4109) {
                String var275 = field7588[--field7580];
                field7576 -= 2;
                int var276 = field7573[field7576];
                int var277 = field7573[field7576 + 1];
                class179 var278 = class506.method3043(0, var277, 104, class307.field4312);
                field7573[field7576++] = var278.method1134(class113.field1513, var275, 1839, var276);
                return;
            }
            if (arg0 == 4110) {
                field7580 -= 2;
                String var279 = field7588[field7580];
                String var280 = field7588[field7580 + 1];
                if (field7573[--field7576] == 1) {
                    field7588[field7580++] = var279;
                    return;
                }
                field7588[field7580++] = var280;
                return;
            }
            if (arg0 == 4111) {
                String var281 = field7588[--field7580];
                field7588[field7580++] = class572.method3354(var281, -61);
                return;
            }
            if (arg0 == 4112) {
                String var282 = field7588[--field7580];
                int var283 = field7573[--field7576];
                if (var283 == -1) {
                    throw new RuntimeException("null char");
                }
                field7588[field7580++] = var282 + (char) var283;
                return;
            }
            if (arg0 == 4113) {
                int var284 = field7573[--field7576];
                field7573[field7576++] = method3223((char) var284);
                return;
            }
            if (arg0 == 4114) {
                int var285 = field7573[--field7576];
                field7573[field7576++] = class758.method4206(-91, (char) var285) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var286 = field7573[--field7576];
                field7573[field7576++] = class238.method1609(-32179, (char) var286) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var287 = field7573[--field7576];
                field7573[field7576++] = class697.method3937(31304, (char) var287) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var288 = field7588[--field7580];
                if (var288 != null) {
                    field7573[field7576++] = var288.length();
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var289 = field7588[--field7580];
                field7576 -= 2;
                int var290 = field7573[field7576];
                int var291 = field7573[field7576 + 1];
                field7588[field7580++] = var289.substring(var290, var291);
                return;
            }
            if (arg0 == 4119) {
                String var292 = field7588[--field7580];
                StringBuffer var293 = new StringBuffer(var292.length());
                boolean var294 = false;
                for (int var295 = 0; var295 < var292.length(); var295++) {
                    char var296 = var292.charAt(var295);
                    if (var296 == '<') {
                        var294 = true;
                    } else if (var296 == '>') {
                        var294 = false;
                    } else if (!var294) {
                        var293.append(var296);
                    }
                }
                field7588[field7580++] = var293.toString();
                return;
            }
            if (arg0 == 4120) {
                String var297 = field7588[--field7580];
                field7576 -= 2;
                int var298 = field7573[field7576];
                int var299 = field7573[field7576 + 1];
                field7573[field7576++] = var297.indexOf(var298, var299);
                return;
            }
            if (arg0 == 4121) {
                field7580 -= 2;
                String var300 = field7588[field7580];
                String var301 = field7588[field7580 + 1];
                int var302 = field7573[--field7576];
                field7573[field7576++] = var300.indexOf(var301, var302);
                return;
            }
            if (arg0 == 4122) {
                int var303 = field7573[--field7576];
                field7573[field7576++] = Character.toLowerCase((char) var303);
                return;
            }
            if (arg0 == 4123) {
                int var304 = field7573[--field7576];
                field7573[field7576++] = Character.toUpperCase((char) var304);
                return;
            }
            if (arg0 == 4124) {
                boolean var305 = field7573[--field7576] != 0;
                int var306 = field7573[--field7576];
                field7588[field7580++] = class10.method48(0, var305, class120.field1576, 1, (long) var306);
                return;
            }
            if (arg0 == 4125) {
                String var307 = field7588[--field7580];
                int var308 = field7573[--field7576];
                class179 var309 = class506.method3043(0, var308, 21, class307.field4312);
                field7573[field7576++] = var309.method1137(256, class113.field1513, var307);
                return;
            }
            if (arg0 == 4126) {
                field7588[field7580++] = class8.method38(-14655, (long) field7573[--field7576] * 60000L, class120.field1576);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var310 = field7573[--field7576];
                field7588[field7580++] = class291.field4179.method1313(var310, true).field9281;
                return;
            }
            if (arg0 == 4201) {
                field7576 -= 2;
                int var311 = field7573[field7576];
                int var312 = field7573[field7576 + 1];
                class671 var313 = class291.field4179.method1313(var311, true);
                if (var312 >= 1 && var312 <= 5 && var313.field9280[var312 - 1] != null) {
                    field7588[field7580++] = var313.field9280[var312 - 1];
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 4202) {
                field7576 -= 2;
                int var314 = field7573[field7576];
                int var315 = field7573[field7576 + 1];
                class671 var316 = class291.field4179.method1313(var314, true);
                if (var315 >= 1 && var315 <= 5 && var316.field9279[var315 - 1] != null) {
                    field7588[field7580++] = var316.field9279[var315 - 1];
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var317 = field7573[--field7576];
                field7573[field7576++] = class291.field4179.method1313(var317, true).field9286;
                return;
            }
            if (arg0 == 4204) {
                int var318 = field7573[--field7576];
                field7573[field7576++] = class291.field4179.method1313(var318, true).field9316 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var319 = field7573[--field7576];
                class671 var320 = class291.field4179.method1313(var319, true);
                if (var320.field9324 == -1 && var320.field9333 >= 0) {
                    field7573[field7576++] = var320.field9333;
                    return;
                }
                field7573[field7576++] = var319;
                return;
            }
            if (arg0 == 4206) {
                int var321 = field7573[--field7576];
                class671 var322 = class291.field4179.method1313(var321, true);
                if (var322.field9324 >= 0 && var322.field9333 >= 0) {
                    field7573[field7576++] = var322.field9333;
                    return;
                }
                field7573[field7576++] = var321;
                return;
            }
            if (arg0 == 4207) {
                int var323 = field7573[--field7576];
                field7573[field7576++] = class291.field4179.method1313(var323, true).field9266 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field7576 -= 2;
                int var324 = field7573[field7576];
                int var325 = field7573[field7576 + 1];
                class648 var326 = class360.field5161.method2279(-76, var325);
                if (var326.method3628((byte) -16)) {
                    field7588[field7580++] = class291.field4179.method1313(var324, true).method3793(var325, var326.field8687, 20526);
                    return;
                }
                field7573[field7576++] = class291.field4179.method1313(var324, true).method3783(0, var326.field8689, var325);
                return;
            }
            if (arg0 == 4209) {
                field7576 -= 2;
                int var327 = field7573[field7576];
                int var328 = field7573[field7576 + 1] - 1;
                class671 var329 = class291.field4179.method1313(var327, true);
                if (var329.field9309 == var328) {
                    field7573[field7576++] = var329.field9329;
                    return;
                }
                if (var329.field9289 == var328) {
                    field7573[field7576++] = var329.field9300;
                    return;
                }
                field7573[field7576++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var330 = field7588[--field7580];
                int var331 = field7573[--field7576];
                class179.method1128(var331 == 1, var330, (byte) 94);
                field7573[field7576++] = class619.field8309;
                return;
            }
            if (arg0 == 4211) {
                if (class602.field8142 != null && class232.field3271 < class619.field8309) {
                    field7573[field7576++] = class602.field8142[class232.field3271++] & 0xFFFF;
                    return;
                }
                field7573[field7576++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class232.field3271 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var332 = field7573[--field7576];
                field7573[field7576++] = class291.field4179.method1313(var332, true).field9296;
                return;
            }
            if (arg0 == 4214) {
                String var333 = field7588[--field7580];
                field7576 -= 3;
                int var334 = field7573[field7576];
                int var335 = field7573[field7576 + 1];
                int var336 = field7573[field7576 + 2];
                class66.method532(var335, var336, var333, (byte) -126, var334 == 1);
                field7573[field7576++] = class619.field8309;
                return;
            }
            if (arg0 == 4215) {
                field7580 -= 2;
                field7576 -= 2;
                String var337 = field7588[field7580];
                int var338 = field7573[field7576];
                int var339 = field7573[field7576 + 1];
                String var340 = field7588[field7580 + 1];
                class290.method1925(var340, var339, -1, var338 == 1, var337);
                field7573[field7576++] = class619.field8309;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field7576 -= 2;
                int var341 = field7573[field7576];
                int var342 = field7573[field7576 + 1];
                class648 var343 = class360.field5161.method2279(-111, var342);
                if (var343.method3628((byte) -16)) {
                    field7588[field7580++] = class525.field7291.method146(2, var341).method770(var343.field8687, var342, false);
                    return;
                }
                field7573[field7576++] = class525.field7291.method146(2, var341).method763(var342, 16071, var343.field8689);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field7576 -= 2;
                int var344 = field7573[field7576];
                int var345 = field7573[field7576 + 1];
                class648 var346 = class360.field5161.method2279(-126, var345);
                if (var346.method3628((byte) -16)) {
                    field7588[field7580++] = class20.field192.method716(6, var344).method1300(var346.field8687, var345, 67);
                    return;
                }
                field7573[field7576++] = class20.field192.method716(6, var344).method1301(var346.field8689, (byte) 96, var345);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field7576 -= 2;
                int var347 = field7573[field7576];
                int var348 = field7573[field7576 + 1];
                class648 var349 = class360.field5161.method2279(-100, var348);
                if (var349.method3628((byte) -16)) {
                    field7588[field7580++] = class664.field8919.method3533(var347, true).method2993((byte) -65, var348, var349.field8687);
                    return;
                }
                field7573[field7576++] = class664.field8919.method3533(var347, true).method2994(var349.field8689, var348, 0);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var350 = field7573[--field7576];
                class32 var351 = class464.field6461.method557(var350, (byte) 43);
                if (var351.field385 != null && var351.field385.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field387[0];
                    for (int var354 = 1; var354 < var351.field385.length; var354++) {
                        if (var351.field387[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field387[var354];
                        }
                    }
                    field7573[field7576++] = var351.field385[var352];
                    return;
                }
                field7573[field7576++] = var351.field390;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field7573[field7576++] = class142.field2018 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var355 = field7588[--field7580];
                if (class102.field1401 == 7 && class538.field7453 == 0) {
                    if (var355.length() > 20) {
                        class445.field6186 = -4;
                        return;
                    }
                    class445.field6186 = -1;
                    class583 var356 = class54.method400(class213.field2800, (byte) 94, class468.field6496);
                    var356.field7963.method444(0, 128);
                    int var357 = var356.field7963.field956;
                    var356.field7963.method510(var355, (byte) 61);
                    var356.field7963.method487(var356.field7963.field956 - var357, (byte) -110);
                    class463.method2838(var356, (byte) 118);
                    return;
                }
                class445.field6186 = -5;
                return;
            }
            if (arg0 == 4702) {
                field7573[field7576++] = class445.field6186;
                if (class445.field6186 != -1) {
                    class445.field6186 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lwn;II)V", line = 4165)
    public static final void method3226(class585 arg0, int arg1, int arg2) {
        class12 var3 = class290.method1912(arg1, arg2, arg0, 210851152);
        if (var3 == null) {
            return;
        }
        field7579 = new int[var3.field103];
        field7585 = new String[var3.field117];
        if (class470.field6527 == var3.field115 || class13.field121 == var3.field115 || class258.field3731 == var3.field115) {
            int var4 = 0;
            int var5 = 0;
            if (class655.field8755 != null) {
                var4 = class655.field8755.field10443;
                var5 = class655.field8755.field10447;
            }
            field7579[0] = class103.field1419.method1553((byte) 121) - var4;
            field7579[1] = class103.field1419.method1556(20) - var5;
        }
        method3234(var3, 200000);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lnt;I)V", line = 4192)
    private static final void method3227(class142 arg0, int arg1) {
        Object[] var2 = arg0.field2024;
        int var3 = (Integer) var2[0];
        class12 var4 = class44.method240(-75, var3);
        if (var4 == null) {
            return;
        }
        field7579 = new int[var4.field103];
        int var5 = 0;
        field7585 = new String[var4.field117];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2013;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2023;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2020 == null ? -1 : arg0.field2020.field10445;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2027;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2020 == null ? -1 : arg0.field2020.field10469;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2017 == null ? -1 : arg0.field2017.field10445;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2017 == null ? -1 : arg0.field2017.field10469;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2019;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2025;
                }
                field7579[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2016;
                }
                field7585[var6++] = var9;
            }
        }
        field7594 = arg0.field2022;
        method3234(var4, arg1);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V", line = 4271)
    private static final void method3228(int arg0) {
        class755 var1 = class189.method1182(arg0, (byte) -101);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class755[] var3 = class39.field483[var2];
        if (var3 == null) {
            class755[] var4 = class266.field3900[var2];
            int var5 = var4.length;
            var3 = class39.field483[var2] = new class755[var5];
            class245.method1649(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class245.method1649(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(IZ)V", line = 4313)
    private static final void method3229(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7573[field7576++] = class197.field2641;
                return;
            }
            if (arg0 == 5001) {
                field7576 -= 3;
                class197.field2641 = field7573[field7576];
                class600.field8129 = class47.method334(field7573[field7576 + 1], (byte) -98);
                if (class600.field8129 == null) {
                    class600.field8129 = class95.field1305;
                }
                class669.field9237 = field7573[field7576 + 2];
                field7586++;
                class583 var2 = class54.method400(class213.field2800, (byte) 122, class476.field6626);
                var2.field7963.method444(class197.field2641, 128);
                var2.field7963.method444(class600.field8129.field1142, 128);
                var2.field7963.method444(class669.field9237, 128);
                class463.method2838(var2, (byte) 122);
                return;
            }
            if (arg0 == 5002) {
                field7580 -= 2;
                String var3 = field7588[field7580];
                String var4 = field7588[field7580 + 1];
                field7576 -= 2;
                int var5 = field7573[field7576];
                int var6 = field7573[field7576 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field7582++;
                class583 var7 = class54.method400(class213.field2800, (byte) -100, class131.field1844);
                var7.field7963.method444(class712.method4007(var3, 4927) + class712.method4007(var4, 4927) + 2, 128);
                var7.field7963.method510(var3, (byte) 61);
                var7.field7963.method444(var5 - 1, 128);
                var7.field7963.method444(var6, 128);
                var7.field7963.method510(var4, (byte) 61);
                class463.method2838(var7, (byte) 127);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field7573[--field7576];
                class359 var9 = class197.method1207(var8, (byte) 117);
                String var10 = "";
                if (var9 != null && var9.field5139 != null) {
                    var10 = var9.field5139;
                }
                field7588[field7580++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field7573[--field7576];
                class359 var12 = class197.method1207(var11, (byte) 82);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field5142;
                }
                field7573[field7576++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class600.field8129 == null) {
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = class600.field8129.field1142;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field7573[--field7576];
                class583 var15 = class54.method400(class213.field2800, (byte) 118, class102.field1397);
                var15.field7963.method444(var14, 128);
                class463.method2838(var15, (byte) 117);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field7588[--field7580];
                method3222(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7580 -= 2;
                String var17 = field7588[field7580];
                String var18 = field7588[field7580 + 1];
                if (class290.field4163 != 0 || (!class214.field2807 || class571.field7897) && !class464.field6463) {
                    field7581++;
                    class583 var19 = class54.method400(class213.field2800, (byte) 120, class688.field9577);
                    var19.field7963.method444(0, 128);
                    int var20 = var19.field7963.field956;
                    var19.field7963.method510(var17, (byte) 61);
                    class542.method3206(var18, var19.field7963, (byte) 30);
                    var19.field7963.method487(var19.field7963.field956 - var20, (byte) -110);
                    class463.method2838(var19, (byte) 127);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field7573[--field7576];
                class359 var22 = class197.method1207(var21, (byte) 82);
                String var23 = "";
                if (var22 != null && var22.field5135 != null) {
                    var23 = var22.field5135;
                }
                field7588[field7580++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field7573[--field7576];
                class359 var25 = class197.method1207(var24, (byte) 85);
                String var26 = "";
                if (var25 != null && var25.field5144 != null) {
                    var26 = var25.field5144;
                }
                field7588[field7580++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field7573[--field7576];
                class359 var28 = class197.method1207(var27, (byte) 87);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field5137;
                }
                field7573[field7576++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class388.field5601 == null || class388.field5601.field1347 == null) {
                    var30 = "";
                } else {
                    var30 = class388.field5601.method661(true, (byte) -96);
                }
                field7588[field7580++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field7573[field7576++] = class669.field9237;
                return;
            }
            if (arg0 == 5017) {
                field7573[field7576++] = class38.method206(4);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field7573[--field7576];
                class359 var32 = class197.method1207(var31, (byte) 112);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field5136;
                }
                field7573[field7576++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field7573[--field7576];
                class359 var35 = class197.method1207(var34, (byte) 84);
                String var36 = "";
                if (var35 != null && var35.field5147 != null) {
                    var36 = var35.field5147;
                }
                field7588[field7580++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class388.field5601 == null || class388.field5601.field1347 == null) {
                    var37 = "";
                } else {
                    var37 = class388.field5601.method658(44, false);
                }
                field7588[field7580++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field7573[--field7576];
                class359 var39 = class197.method1207(var38, (byte) 113);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field5146;
                }
                field7573[field7576++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field7573[--field7576];
                class359 var42 = class197.method1207(var41, (byte) 82);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field5141;
                }
                field7573[field7576++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field7573[--field7576];
                class359 var45 = class197.method1207(var44, (byte) 110);
                String var46 = "";
                if (var45 != null && var45.field5143 != null) {
                    var46 = var45.field5143;
                }
                field7588[field7580++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field7573[--field7576];
                field7588[field7580++] = class179.field2470.method923((byte) 26, var47).field6120;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field7573[--field7576];
                class438 var49 = class179.field2470.method923((byte) 26, var48);
                if (var49.field6106 == null) {
                    field7573[field7576++] = 0;
                    return;
                }
                field7573[field7576++] = var49.field6106.length;
                return;
            }
            if (arg0 == 5052) {
                field7576 -= 2;
                int var50 = field7573[field7576];
                int var51 = field7573[field7576 + 1];
                class438 var52 = class179.field2470.method923((byte) 26, var50);
                int var53 = var52.field6106[var51];
                field7573[field7576++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field7573[--field7576];
                class438 var55 = class179.field2470.method923((byte) 26, var54);
                if (var55.field6118 == null) {
                    field7573[field7576++] = 0;
                    return;
                }
                field7573[field7576++] = var55.field6118.length;
                return;
            }
            if (arg0 == 5054) {
                field7576 -= 2;
                int var56 = field7573[field7576];
                int var57 = field7573[field7576 + 1];
                field7573[field7576++] = class179.field2470.method923((byte) 26, var56).field6118[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field7573[--field7576];
                field7588[field7580++] = class145.field2038.method1107(true, var58).method1189(64);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field7573[--field7576];
                class192 var60 = class145.field2038.method1107(true, var59);
                if (var60.field2615 == null) {
                    field7573[field7576++] = 0;
                    return;
                }
                field7573[field7576++] = var60.field2615.length;
                return;
            }
            if (arg0 == 5057) {
                field7576 -= 2;
                int var61 = field7573[field7576];
                int var62 = field7573[field7576 + 1];
                field7573[field7576++] = class145.field2038.method1107(true, var61).field2615[var62];
                return;
            }
            if (arg0 == 5058) {
                field7583 = new class493();
                field7583.field6915 = field7573[--field7576];
                field7583.field6914 = class145.field2038.method1107(true, field7583.field6915);
                field7583.field6911 = new int[field7583.field6914.method1191(-79)];
                return;
            }
            if (arg0 == 5059) {
                field7587++;
                class583 var63 = class54.method400(class213.field2800, (byte) 119, class450.field6243);
                var63.field7963.method444(0, 128);
                int var64 = var63.field7963.field956;
                var63.field7963.method444(0, 128);
                var63.field7963.method492(-2, field7583.field6915);
                field7583.field6914.method1190(field7583.field6911, true, var63.field7963);
                var63.field7963.method487(var63.field7963.field956 - var64, (byte) -110);
                class463.method2838(var63, (byte) 123);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field7588[--field7580];
                field7574++;
                class583 var66 = class54.method400(class213.field2800, (byte) 104, class573.field7907);
                var66.field7963.method444(0, 128);
                int var67 = var66.field7963.field956;
                var66.field7963.method510(var65, (byte) 61);
                var66.field7963.method492(-2, field7583.field6915);
                field7583.field6914.method1190(field7583.field6911, true, var66.field7963);
                var66.field7963.method487(var66.field7963.field956 - var67, (byte) -110);
                class463.method2838(var66, (byte) 127);
                return;
            }
            if (arg0 == 5061) {
                field7587++;
                class583 var68 = class54.method400(class213.field2800, (byte) -97, class450.field6243);
                var68.field7963.method444(0, 128);
                int var69 = var68.field7963.field956;
                var68.field7963.method444(1, 128);
                var68.field7963.method492(-2, field7583.field6915);
                field7583.field6914.method1190(field7583.field6911, true, var68.field7963);
                var68.field7963.method487(var68.field7963.field956 - var69, (byte) -110);
                class463.method2838(var68, (byte) 118);
                return;
            }
            if (arg0 == 5062) {
                field7576 -= 2;
                int var70 = field7573[field7576];
                int var71 = field7573[field7576 + 1];
                field7573[field7576++] = class179.field2470.method923((byte) 26, var70).field6111[var71];
                return;
            }
            if (arg0 == 5063) {
                field7576 -= 2;
                int var72 = field7573[field7576];
                int var73 = field7573[field7576 + 1];
                field7573[field7576++] = class179.field2470.method923((byte) 26, var72).field6109[var73];
                return;
            }
            if (arg0 == 5064) {
                field7576 -= 2;
                int var74 = field7573[field7576];
                int var75 = field7573[field7576 + 1];
                if (var75 == -1) {
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = class179.field2470.method923((byte) 26, var74).method2699((char) var75, -1);
                return;
            }
            if (arg0 == 5065) {
                field7576 -= 2;
                int var76 = field7573[field7576];
                int var77 = field7573[field7576 + 1];
                if (var77 == -1) {
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = class179.field2470.method923((byte) 26, var76).method2693((char) var77, 0);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field7573[--field7576];
                field7573[field7576++] = class145.field2038.method1107(true, var78).method1191(-96);
                return;
            }
            if (arg0 == 5067) {
                field7576 -= 2;
                int var79 = field7573[field7576];
                int var80 = field7573[field7576 + 1];
                int var81 = class145.field2038.method1107(true, var79).method1194(var80, 93).field4478;
                field7573[field7576++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field7576 -= 2;
                int var82 = field7573[field7576];
                int var83 = field7573[field7576 + 1];
                field7583.field6911[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field7576 -= 2;
                int var84 = field7573[field7576];
                int var85 = field7573[field7576 + 1];
                field7583.field6911[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field7576 -= 3;
                int var86 = field7573[field7576];
                int var87 = field7573[field7576 + 1];
                int var88 = field7573[field7576 + 2];
                class192 var89 = class145.field2038.method1107(true, var86);
                if (var89.method1194(var87, 64).field4478 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7573[field7576++] = var89.method1197(var88, -20, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field7588[--field7580];
                boolean var91 = field7573[--field7576] == 1;
                class42.method234(var91, var90, -109);
                field7573[field7576++] = class619.field8309;
                return;
            }
            if (arg0 == 5072) {
                if (class602.field8142 != null && class232.field3271 < class619.field8309) {
                    field7573[field7576++] = class602.field8142[class232.field3271++] & 0xFFFF;
                    return;
                }
                field7573[field7576++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class232.field3271 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class224.field3014.method129(86, 125)) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class224.field3014.method129(82, 127)) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class224.field3014.method129(81, 98)) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class352.method2271(field7573[--field7576], -32459);
                return;
            }
            if (arg0 == 5201) {
                field7573[field7576++] = class26.method151(64);
                return;
            }
            if (arg0 == 5205) {
                class429.method2662(field7573[--field7576], -1, false, -1, 99);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field7573[--field7576];
                class604 var93 = class461.method2814(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = var93.field8166;
                return;
            }
            if (arg0 == 5207) {
                class604 var94 = class461.method2823(field7573[--field7576]);
                if (var94 != null && var94.field8167 != null) {
                    field7588[field7580++] = var94.field8167;
                    return;
                }
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7573[field7576++] = class534.field7407;
                field7573[field7576++] = class263.field3855;
                return;
            }
            if (arg0 == 5209) {
                field7573[field7576++] = class513.field7087 + class461.field6400;
                field7573[field7576++] = class718.field10001 + class461.field6408;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field7573[--field7576];
                class604 var96 = class461.method2823(var95);
                if (var96 == null) {
                    field7573[field7576++] = 0;
                    field7573[field7576++] = 0;
                    return;
                }
                field7573[field7576++] = var96.field8161 >> 14 & 0x3FFF;
                field7573[field7576++] = var96.field8161 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field7573[--field7576];
                class604 var98 = class461.method2823(var97);
                if (var98 == null) {
                    field7573[field7576++] = 0;
                    field7573[field7576++] = 0;
                    return;
                }
                field7573[field7576++] = var98.field8165 - var98.field8158;
                field7573[field7576++] = var98.field8154 - var98.field8168;
                return;
            }
            if (arg0 == 5212) {
                class717 var99 = class162.method1004(-29606);
                if (var99 == null) {
                    field7573[field7576++] = -1;
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = var99.field9990;
                int var100 = var99.field9982 << 28 | class461.field6400 + var99.field9989 << 14 | class461.field6408 + var99.field9985;
                field7573[field7576++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class717 var101 = class513.method3066((byte) -126);
                if (var101 == null) {
                    field7573[field7576++] = -1;
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = var101.field9990;
                int var102 = var101.field9982 << 28 | class461.field6400 + var101.field9989 << 14 | class461.field6408 + var101.field9985;
                field7573[field7576++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field7573[--field7576];
                class604 var104 = class140.method925(-125);
                if (var104 != null) {
                    boolean var105 = var104.method3441(var103 >> 14 & 0x3FFF, var103 >> 28 & 0x3, var103 & 0x3FFF, field7575, (byte) 1);
                    if (var105) {
                        class533.method3165(-1, field7575[2], field7575[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field7576 -= 2;
                int var106 = field7573[field7576];
                int var107 = field7573[field7576 + 1];
                class680 var108 = class461.method2807(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class604 var110 = (class604) var108.method3828(102); var110 != null; var110 = (class604) var108.method3829(-29202)) {
                    if (var110.field8166 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field7573[--field7576];
                class604 var112 = class461.method2823(var111);
                if (var112 == null) {
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = var112.field8157;
                return;
            }
            if (arg0 == 5220) {
                field7573[field7576++] = class537.field7447 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field7573[--field7576];
                class533.method3165(-1, var113 & 0x3FFF, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class604 var114 = class140.method925(-101);
                if (var114 != null) {
                    boolean var115 = var114.method3440(field7575, class513.field7087 + class461.field6400, true, class718.field10001 + class461.field6408);
                    if (var115) {
                        field7573[field7576++] = field7575[1];
                        field7573[field7576++] = field7575[2];
                        return;
                    }
                    field7573[field7576++] = -1;
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = -1;
                field7573[field7576++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field7576 -= 2;
                int var116 = field7573[field7576];
                int var117 = field7573[field7576 + 1];
                class429.method2662(var116, var117 >> 14 & 0x3FFF, false, var117 & 0x3FFF, -17);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field7573[--field7576];
                class604 var119 = class140.method925(-54);
                if (var119 != null) {
                    boolean var120 = var119.method3441(var118 >> 14 & 0x3FFF, var118 >> 28 & 0x3, var118 & 0x3FFF, field7575, (byte) 1);
                    if (var120) {
                        field7573[field7576++] = field7575[1];
                        field7573[field7576++] = field7575[2];
                        return;
                    }
                    field7573[field7576++] = -1;
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = -1;
                field7573[field7576++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field7573[--field7576];
                class604 var122 = class140.method925(-96);
                if (var122 != null) {
                    boolean var123 = var122.method3440(field7575, var121 >> 14 & 0x3FFF, true, var121 & 0x3FFF);
                    if (var123) {
                        field7573[field7576++] = field7575[1];
                        field7573[field7576++] = field7575[2];
                        return;
                    }
                    field7573[field7576++] = -1;
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = -1;
                field7573[field7576++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class6.method28(125, field7573[--field7576]);
                return;
            }
            if (arg0 == 5227) {
                field7576 -= 2;
                int var124 = field7573[field7576];
                int var125 = field7573[field7576 + 1];
                class429.method2662(var124, var125 >> 14 & 0x3FFF, true, var125 & 0x3FFF, -119);
                return;
            }
            if (arg0 == 5228) {
                class487.field6815 = field7573[--field7576] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7573[field7576++] = class487.field6815 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field7573[--field7576];
                class728.method4064((byte) 110, var126);
                return;
            }
            if (arg0 == 5231) {
                field7576 -= 2;
                int var127 = field7573[field7576];
                boolean var128 = field7573[field7576 + 1] == 1;
                if (class561.field7801 != null) {
                    class71 var129 = class561.field7801.method812(112, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method549(6410);
                        return;
                    }
                    if (var129 == null && var128) {
                        class71 var130 = new class71();
                        class561.field7801.method820((long) var127, (byte) -42, var130);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field7573[--field7576];
                if (class561.field7801 != null) {
                    class71 var132 = class561.field7801.method812(109, (long) var131);
                    field7573[field7576++] = var132 == null ? 0 : 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field7576 -= 2;
                int var133 = field7573[field7576];
                boolean var134 = field7573[field7576 + 1] == 1;
                if (class676.field9376 != null) {
                    class71 var135 = class676.field9376.method812(110, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method549(6410);
                        return;
                    }
                    if (var135 == null && var134) {
                        class71 var136 = new class71();
                        class676.field9376.method820((long) var133, (byte) -42, var136);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field7573[--field7576];
                if (class676.field9376 != null) {
                    class71 var138 = class676.field9376.method812(125, (long) var137);
                    field7573[field7576++] = var138 == null ? 0 : 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7573[field7576++] = class461.field6384 == null ? -1 : class461.field6384.field8166;
                return;
            }
            if (arg0 == 5236) {
                field7576 -= 2;
                int var139 = field7573[field7576];
                int var140 = field7573[field7576 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class501.method3022(-23253, var139, var142, var141);
                if (var143 < 0) {
                    field7573[field7576++] = -1;
                    return;
                }
                field7573[field7576++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class293.method1943(7);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field7576 -= 2;
                int var144 = field7573[field7576];
                int var145 = field7573[field7576 + 1];
                class372.method2330(var145, 3, var144, false, 3);
                field7573[field7576++] = class178.field2452 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class178.field2452 != null) {
                    class372.method2330(-1, class332.field4707.field4801.method2799(0), -1, false, 3);
                }
                return;
            }
            if (arg0 == 5302) {
                class83[] var146 = class688.method3875(-88);
                field7573[field7576++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field7573[--field7576];
                class83[] var148 = class688.method3875(-96);
                field7573[field7576++] = var148[var147].field1187;
                field7573[field7576++] = var148[var147].field1186;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class326.field4500;
                int var150 = class47.field688;
                int var151 = -1;
                class83[] var152 = class688.method3875(-114);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class83 var154 = var152[var153];
                    if (var154.field1187 == var149 && var154.field1186 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field7573[field7576++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field7573[field7576++] = class710.method3997(3);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field7573[--field7576];
                if (var155 >= 1 && var155 <= 2) {
                    class372.method2330(-1, var155, -1, false, 3);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7573[field7576++] = class332.field4707.field4801.method2799(0);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field7573[--field7576];
                if (var156 >= 1 && var156 <= 2) {
                    class332.field4707.method2158(var156, class332.field4707.field4801, -15);
                    class332.field4707.method2158(var156, class332.field4707.field4761, -15);
                    class263.method1802(-2);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7580 -= 2;
                String var157 = field7588[field7580];
                String var158 = field7588[field7580 + 1];
                int var159 = field7573[--field7576];
                field7589++;
                class583 var160 = class54.method400(class213.field2800, (byte) 120, class32.field393);
                var160.field7963.method444(class712.method4007(var157, 4927) + class712.method4007(var158, 4927) + 1, 128);
                var160.field7963.method510(var157, (byte) 61);
                var160.field7963.method510(var158, (byte) 61);
                var160.field7963.method444(var159, 128);
                class463.method2838(var160, (byte) 122);
                return;
            }
            if (arg0 == 5401) {
                field7576 -= 2;
                class250.field3669[field7573[field7576]] = (short) class424.method2640(field7573[field7576 + 1], false);
                class291.field4179.method1310((byte) 101);
                class291.field4179.method1315(-121);
                class525.field7291.method144(1);
                class235.method1566(16349);
                return;
            }
            if (arg0 == 5405) {
                field7576 -= 2;
                int var161 = field7573[field7576];
                int var162 = field7573[field7576 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class318.field4420[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field7576 -= 7;
                int var163 = field7573[field7576];
                int var164 = field7573[field7576 + 1] << 1;
                int var165 = field7573[field7576 + 2];
                int var166 = field7573[field7576 + 3];
                int var167 = field7573[field7576 + 4];
                int var168 = field7573[field7576 + 5];
                int var169 = field7573[field7576 + 6];
                if (var163 >= 0 && var163 < 2 && class318.field4420[var163] != null && var164 >= 0 && var164 < class318.field4420[var163].length) {
                    class318.field4420[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class318.field4420[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class318.field4420[field7573[--field7576]].length >> 1;
                field7573[field7576++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class178.field2452 != null) {
                    class372.method2330(-1, class332.field4707.field4801.method2799(0), -1, false, 3);
                }
                if (class553.field7717 != null) {
                    class705.method3971(69);
                    System.exit(0);
                    return;
                }
                String var171 = class376.field5290 == null ? class9.method47(109) : class376.field5290;
                class610.method3462(class332.field4707.field4789.method963(0) == 1, false, var171, (byte) -68, class159.field2227);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class596.field8095 != null) {
                    if (class596.field8095.field3638 == null) {
                        var172 = class336.method2137((byte) -55, class596.field8095.field3637);
                    } else {
                        var172 = (String) class596.field8095.field3638;
                    }
                }
                field7588[field7580++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field7573[field7576++] = class159.field2227.field1936 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class178.field2452 != null) {
                    class372.method2330(-1, class332.field4707.field4801.method2799(0), -1, false, 3);
                }
                String var173 = field7588[--field7580];
                boolean var174 = field7573[--field7576] == 1;
                String var175 = class9.method47(104) + var173;
                class610.method3462(class332.field4707.field4789.method963(0) == 1, var174, var175, (byte) -67, class159.field2227);
                return;
            }
            if (arg0 == 5422) {
                field7580 -= 2;
                String var176 = field7588[field7580];
                String var177 = field7588[field7580 + 1];
                int var178 = field7573[--field7576];
                if (var176.length() > 0) {
                    if (class240.field3594 == null) {
                        class240.field3594 = new String[class379.field5420[class289.field4140.field7713]];
                    }
                    class240.field3594[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class206.field2704 == null) {
                        class206.field2704 = new String[class379.field5420[class289.field4140.field7713]];
                    }
                    class206.field2704[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7588[--field7580]);
                return;
            }
            if (arg0 == 5424) {
                field7576 -= 11;
                class292.field4197 = field7573[field7576];
                class593.field8042 = field7573[field7576 + 1];
                class333.field4712 = field7573[field7576 + 2];
                class383.field5503 = field7573[field7576 + 3];
                class287.field4123 = field7573[field7576 + 4];
                class667.field9198 = field7573[field7576 + 5];
                class629.field8458 = field7573[field7576 + 6];
                class62.field891 = field7573[field7576 + 7];
                class156.field2197 = field7573[field7576 + 8];
                class126.field1735 = field7573[field7576 + 9];
                class162.field2245 = field7573[field7576 + 10];
                class671.field9318.method1578(class287.field4123, (byte) -81);
                class671.field9318.method1578(class667.field9198, (byte) -81);
                class671.field9318.method1578(class629.field8458, (byte) -81);
                class671.field9318.method1578(class62.field891, (byte) -81);
                class671.field9318.method1578(class156.field2197, (byte) -81);
                class622.field8327 = null;
                class535.field7425 = null;
                class81.field1166 = null;
                class78.field1136 = null;
                class674.field9365 = null;
                class189.field2584 = null;
                class515.field7185 = null;
                class702.field9784 = null;
                class484.field6743 = true;
                return;
            }
            if (arg0 == 5425) {
                class625.method3522(112);
                class484.field6743 = false;
                return;
            }
            if (arg0 == 5426) {
                field7576 -= 2;
                class420.field5917 = field7573[field7576];
                class42.field520 = field7573[field7576 + 1];
                return;
            }
            if (arg0 == 5427) {
                field7576 -= 2;
                class323.field4473 = field7573[field7576 + 1];
                return;
            }
            if (arg0 == 5428) {
                field7576 -= 2;
                int var179 = field7573[field7576];
                int var180 = field7573[field7576 + 1];
                field7573[field7576++] = class320.method2065(var179, var180, -1) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class537.method3182((byte) -93, field7588[--field7580], false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class69.method540("accountcreated", class320.field4445, -127);
                    return;
                } catch (Throwable var326) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class69.method540("accountcreatestarted", class320.field4445, -126);
                    return;
                } catch (Throwable var327) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class430.field6017 != null) {
                    Transferable var182 = class430.field6017.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var328) {
                        }
                    }
                }
                field7588[field7580++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class225.field3031 = field7573[--field7576];
                return;
            }
            if (arg0 == 5435) {
                field7573[field7576++] = class258.field3740 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field7576 -= 4;
                int var183 = field7573[field7576];
                int var184 = field7573[field7576 + 1];
                int var185 = field7573[field7576 + 2];
                int var186 = field7573[field7576 + 3];
                class243.method1632(false, var185, -89, var184 << 2, (var183 & 0x3FFF) - class587.field7995, var186, (var183 >> 14 & 0x3FFF) - class113.field1509);
                return;
            }
            if (arg0 == 5501) {
                field7576 -= 4;
                int var187 = field7573[field7576];
                int var188 = field7573[field7576 + 1];
                int var189 = field7573[field7576 + 2];
                int var190 = field7573[field7576 + 3];
                class200.method1216(30, var190, var189, var188 << 2, (var187 >> 14 & 0x3FFF) - class113.field1509, (var187 & 0x3FFF) - class587.field7995);
                return;
            }
            if (arg0 == 5502) {
                field7576 -= 6;
                int var191 = field7573[field7576];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class712.field9954 = var191;
                int var192 = field7573[field7576 + 1];
                if (var192 + 1 >= class318.field4420[class712.field9954].length >> 1) {
                    throw new RuntimeException();
                }
                class202.field2681 = var192;
                class413.field5862 = 0;
                class763.field10632 = field7573[field7576 + 2];
                class43.field530 = field7573[field7576 + 3];
                int var193 = field7573[field7576 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class299.field4237 = var193;
                int var194 = field7573[field7576 + 5];
                if (var194 + 1 >= class318.field4420[class299.field4237].length >> 1) {
                    throw new RuntimeException();
                }
                class532.field7388 = var194;
                class720.field10023 = 3;
                class221.field2987 = -1;
                class388.field5597 = -1;
                return;
            }
            if (arg0 == 5503) {
                class634.method3555(17220);
                return;
            }
            if (arg0 == 5504) {
                field7576 -= 2;
                class434.method2680(0, 3, field7573[field7576], field7573[field7576 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field7573[field7576++] = (int) class589.field8028 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7573[field7576++] = (int) class596.field8093 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class288.method1905((byte) 120);
                return;
            }
            if (arg0 == 5508) {
                class253.method1727((byte) 83);
                return;
            }
            if (arg0 == 5509) {
                class277.method1863(0);
                return;
            }
            if (arg0 == 5510) {
                class709.method3991(-2);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field7573[--field7576];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class113.field1509;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class277.field4036) {
                    var198 = class277.field4036;
                }
                int var199 = var197 - class587.field7995;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class667.field9202) {
                    var199 = class667.field9202;
                }
                class43.field532 = (var198 << 9) + 256;
                class544.field7541 = (var199 << 9) + 256;
                class720.field10023 = 4;
                class221.field2987 = -1;
                class388.field5597 = -1;
                return;
            }
            if (arg0 == 5512) {
                class496.method3006((byte) -46);
                return;
            }
            if (arg0 == 5514) {
                class3.field27 = field7573[--field7576];
                return;
            }
            if (arg0 == 5516) {
                field7573[field7576++] = class3.field27;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field7573[--field7576];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class113.field1509;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class277.field4036) {
                        var203 = class277.field4036;
                    }
                    int var204 = var202 - class587.field7995;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class667.field9202) {
                        var204 = class667.field9202;
                    }
                    class388.field5597 = (var203 << 9) + 256;
                    class221.field2987 = (var204 << 9) + 256;
                    return;
                }
                class388.field5597 = -1;
                class221.field2987 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7580 -= 2;
                String var205 = field7588[field7580];
                String var206 = field7588[field7580 + 1];
                int var207 = field7573[--field7576];
                if (var205.length() > 320) {
                    return;
                }
                if (class102.field1401 != 3) {
                    return;
                }
                if (class538.field7453 == 0 && class210.field2748 == 0) {
                    class707.field9849 = var205;
                    class605.field8178 = var206;
                    class336.field4726 = var207;
                    class647.method3624(6, true);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class520.method3099((byte) 30);
                return;
            }
            if (arg0 == 5602) {
                if (class538.field7453 == 0) {
                    class47.field668 = -2;
                    class12.field102 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field7580--;
                if (class102.field1401 != 3) {
                    return;
                }
                if (class538.field7453 == 0 && class210.field2748 == 0) {
                    class1.method9((byte) 1, field7588[field7580]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7580 -= 2;
                field7576 -= 2;
                if (class102.field1401 != 3) {
                    return;
                }
                if (class538.field7453 == 0 && class210.field2748 == 0) {
                    class347.method2217(field7588[field7580], field7573[field7576], true, field7588[field7580 + 1], field7573[field7576 + 1] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class210.field2748 == 0) {
                    class332.field4708 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7573[field7576++] = class12.field102;
                return;
            }
            if (arg0 == 5608) {
                field7573[field7576++] = class175.field2408;
                return;
            }
            if (arg0 == 5609) {
                field7573[field7576++] = class332.field4708;
                return;
            }
            if (arg0 == 5611) {
                field7573[field7576++] = class700.field9770;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field7573[--field7576];
                if (class102.field1401 != 7) {
                    return;
                }
                if (class538.field7453 == 0 && class210.field2748 == 0) {
                    if (class713.field9960 != null) {
                        class713.field9960.method2226((byte) 123);
                        class713.field9960 = null;
                    }
                    class336.field4726 = var208;
                    class647.method3624(9, true);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field7573[field7576++] = class12.field102;
                return;
            }
            if (arg0 == 5615) {
                field7580 -= 2;
                String var209 = field7588[field7580];
                String var210 = field7588[field7580 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class102.field1401 != 3) {
                    return;
                }
                if (class538.field7453 == 0 && class210.field2748 == 0) {
                    if (class713.field9960 != null) {
                        class713.field9960.method2226((byte) -113);
                        class713.field9960 = null;
                    }
                    class707.field9849 = var209;
                    class605.field8178 = var210;
                    class647.method3624(5, true);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class327.method2089(false, false);
                return;
            }
            if (arg0 == 5617) {
                field7573[field7576++] = class47.field668;
                return;
            }
            if (arg0 == 5618) {
                field7576--;
                return;
            }
            if (arg0 == 5619) {
                field7576--;
                return;
            }
            if (arg0 == 5620) {
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field7580 -= 2;
                field7576 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class420.field5918 != null) {
                    field7573[field7576++] = 1;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field7573[field7576++] = (int) (class350.field4971 >> 32);
                field7573[field7576++] = (int) (class350.field4971 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field7573[field7576++] = class485.field6765 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class485.field6765 = true;
                class13.method61(-4006);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field7573[--field7576];
                class332.field4707.method2158(var211, class332.field4707.field4780, -15);
                class573.method3360(44);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field7573[--field7576] == 1;
                class332.field4707.method2158(var212 ? 1 : 0, class332.field4707.field4759, -15);
                class332.field4707.method2158(var212 ? 1 : 0, class332.field4707.field4774, -15);
                class573.method3360(85);
                class572.method3353(-45);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field7573[--field7576] == 1;
                class332.field4707.method2158(var213 ? 2 : 1, class332.field4707.field4763, -15);
                class332.field4707.method2158(var213 ? 2 : 1, class332.field4707.field4793, -15);
                class572.method3353(-22);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6005) {
                class332.field4707.method2158(field7573[--field7576] == 1 ? 1 : 0, class332.field4707.field4779, -15);
                class573.method3360(72);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6007) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4769, -15);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6008) {
                class332.field4707.method2158(field7573[--field7576] == 1 ? 1 : 0, class332.field4707.field4799, -15);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6010) {
                class332.field4707.method2158(field7573[--field7576] == 1 ? 1 : 0, class332.field4707.field4757, -15);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6011) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4787, -15);
                class573.method3360(88);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6012) {
                class332.field4707.method2158(field7573[--field7576] == 1 ? 1 : 0, class332.field4707.field4764, -15);
                class211.method1261(18388);
                class124.method777((byte) -61);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6014) {
                class332.field4707.method2158(field7573[--field7576] == 1 ? 2 : 0, class332.field4707.field4791, -15);
                class573.method3360(121);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6015) {
                class332.field4707.method2158(field7573[--field7576] == 1 ? 1 : 0, class332.field4707.field4765, -15);
                class573.method3360(124);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6016) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4773, -15);
                class393.method2459(class332.field4707.field4789.method963(0), false, 1);
                class263.method1802(-2);
                return;
            }
            if (arg0 == 6017) {
                class332.field4707.method2158(field7573[--field7576] == 1 ? 1 : 0, class332.field4707.field4778, -15);
                class698.method3942(107);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6018) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4782, -15);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field7573[--field7576];
                int var215 = class332.field4707.field4766.method1140(0);
                if (var214 != var215) {
                    if (class379.method2379(-128, class102.field1401)) {
                        if (var215 == 0 && class61.field883 != -1) {
                            class720.method4033(false, 0, var214, class477.field6645, class61.field883, false);
                            class512.method3059(-1);
                            class350.field4966 = false;
                        } else if (var214 == 0) {
                            class280.method1872(13155);
                            class350.field4966 = false;
                        } else {
                            class153.method967(var214, (byte) -111);
                        }
                    }
                    class332.field4707.method2158(var214, class332.field4707.field4766, -15);
                    class263.method1802(-2);
                    class726.field10056 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4797, -15);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class332.field4707.field4763.method2460(0);
                class332.field4707.method2158(field7573[--field7576] == 1 ? 0 : var216, class332.field4707.field4793, -15);
                class572.method3353(-89);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field7573[--field7576];
                class332.field4707.method2158(var217, class332.field4707.field4800, -15);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6024) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4756, -15);
                class263.method1802(-2);
                return;
            }
            if (arg0 == 6025) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4770, -15);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field7573[--field7576];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class424.method2639(var218 == 1, 10);
                return;
            }
            if (arg0 == 6028) {
                class332.field4707.method2158(field7573[--field7576] == 0 ? 0 : 1, class332.field4707.field4794, -15);
                class263.method1802(-2);
                return;
            }
            if (arg0 == 6029) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4769, -15);
                class263.method1802(-2);
                return;
            }
            if (arg0 == 6030) {
                class332.field4707.method2158(field7573[--field7576] == 0 ? 0 : 1, class332.field4707.field4752, -15);
                class263.method1802(-2);
                class573.method3360(121);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field7573[--field7576];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class393.method2459(var219, false, 1);
                return;
            }
            if (arg0 == 6032) {
                field7576 -= 2;
                int var220 = field7573[field7576];
                boolean var221 = field7573[field7576 + 1] == 1;
                class332.field4707.method2158(var220, class332.field4707.field4753, -15);
                if (!var221) {
                    class332.field4707.method2158(0, class332.field4707.field4785, -15);
                }
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6033) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4771, -15);
                class263.method1802(-2);
                return;
            }
            if (arg0 == 6034) {
                class332.field4707.method2158(field7573[--field7576] == 1 ? 1 : 0, class332.field4707.field4792, -15);
                class263.method1802(-2);
                class211.method1261(18388);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class332.field4707.field4759.method1242(0);
                class332.field4707.method2158(field7573[--field7576] == 1 ? 1 : var222, class332.field4707.field4774, -15);
                class573.method3360(62);
                class572.method3353(-125);
                return;
            }
            if (arg0 == 6036) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4758, -15);
                class263.method1802(-2);
                class641.field8597 = true;
                return;
            }
            if (arg0 == 6037) {
                class332.field4707.method2158(field7573[--field7576], class332.field4707.field4795, -15);
                class263.method1802(-2);
                class726.field10056 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field7573[--field7576];
                int var224 = class332.field4707.field4796.method1140(0);
                if (var223 != var224 && class756.field10560 == class61.field883) {
                    if (!class379.method2379(-127, class102.field1401)) {
                        if (var224 == 0) {
                            class720.method4033(false, 0, var223, class477.field6645, class61.field883, false);
                            class512.method3059(-1);
                            class350.field4966 = false;
                        } else if (var223 == 0) {
                            class280.method1872(13155);
                            class350.field4966 = false;
                        } else {
                            class153.method967(var223, (byte) -125);
                        }
                    }
                    class332.field4707.method2158(var223, class332.field4707.field4796, -15);
                    class263.method1802(-2);
                    class726.field10056 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field7573[--field7576];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class332.field4707.field4781.method630(0)) {
                    class332.field4707.method2158(var225, class332.field4707.field4781, -15);
                    class263.method1802(-2);
                    class726.field10056 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field7573[--field7576];
                if (var226 != class332.field4707.field4777.method677(0)) {
                    class332.field4707.method2158(var226, class332.field4707.field4777, -15);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    class110.method718(-1);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7573[field7576++] = class332.field4707.field4780.method3040(0);
                return;
            }
            if (arg0 == 6102) {
                field7573[field7576++] = class332.field4707.field4759.method1242(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7573[field7576++] = class332.field4707.field4763.method2460(0) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7573[field7576++] = class332.field4707.field4779.method1162(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7573[field7576++] = class332.field4707.field4769.method1864(0);
                return;
            }
            if (arg0 == 6108) {
                field7573[field7576++] = class332.field4707.field4799.method2307(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7573[field7576++] = class332.field4707.field4757.method2151(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7573[field7576++] = class332.field4707.field4787.method942(0);
                return;
            }
            if (arg0 == 6112) {
                field7573[field7576++] = class332.field4707.field4764.method3961(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7573[field7576++] = class332.field4707.field4791.method40(0) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7573[field7576++] = class332.field4707.field4765.method3375(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7573[field7576++] = class332.field4707.field4773.method2791(0);
                return;
            }
            if (arg0 == 6117) {
                field7573[field7576++] = class332.field4707.field4778.method2193(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7573[field7576++] = class332.field4707.field4782.method1140(0);
                return;
            }
            if (arg0 == 6119) {
                field7573[field7576++] = class332.field4707.field4766.method1140(0);
                return;
            }
            if (arg0 == 6120) {
                field7573[field7576++] = class332.field4707.field4797.method1140(0);
                return;
            }
            if (arg0 == 6123) {
                field7573[field7576++] = class678.method3816(928);
                return;
            }
            if (arg0 == 6124) {
                field7573[field7576++] = class332.field4707.field4756.method2791(0);
                return;
            }
            if (arg0 == 6125) {
                field7573[field7576++] = class332.field4707.field4770.method4029(0);
                return;
            }
            if (arg0 == 6127) {
                field7573[field7576++] = class332.field4707.field4767.method431(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7573[field7576++] = class332.field4707.field4794.method3266(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7573[field7576++] = class332.field4707.field4769.method1864(0);
                return;
            }
            if (arg0 == 6130) {
                field7573[field7576++] = class332.field4707.field4752.method62(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7573[field7576++] = class332.field4707.field4789.method963(0);
                return;
            }
            if (arg0 == 6132) {
                field7573[field7576++] = class332.field4707.field4753.method963(0);
                return;
            }
            if (arg0 == 6133) {
                field7573[field7576++] = class159.field2227.field1936 && !class159.field2227.field1929 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field7573[field7576++] = class332.field4707.field4771.method2015(0);
                return;
            }
            if (arg0 == 6136) {
                field7573[field7576++] = class332.field4707.field4792.method3641(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field7573[field7576++] = class470.method2864(200, class332.field4707.field4789.method963(0), 2048);
                return;
            }
            if (arg0 == 6139) {
                field7573[field7576++] = class332.field4707.field4758.method2724(0);
                return;
            }
            if (arg0 == 6142) {
                field7573[field7576++] = class332.field4707.field4795.method1140(0);
                return;
            }
            if (arg0 == 6143) {
                field7573[field7576++] = class332.field4707.field4796.method1140(0);
                return;
            }
            if (arg0 == 6144) {
                field7573[field7576++] = class580.field7940 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field7573[field7576++] = class332.field4707.field4781.method630(0);
                return;
            }
            if (arg0 == 6146) {
                field7573[field7576++] = class332.field4707.field4777.method677(0);
                return;
            }
            if (arg0 == 6147) {
                field7573[field7576++] = class372.field5248.field8060 < 512 || class580.field7940 || class88.field1244 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field7573[field7576++] = class292.field4188 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field7576 -= 2;
                class459.field6369 = (short) field7573[field7576];
                if (class459.field6369 <= 0) {
                    class459.field6369 = 256;
                }
                class687.field9561 = (short) field7573[field7576 + 1];
                if (class687.field9561 <= 0) {
                    class687.field9561 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field7576 -= 2;
                class67.field1037 = (short) field7573[field7576];
                if (class67.field1037 <= 0) {
                    class67.field1037 = 256;
                }
                class621.field8313 = (short) field7573[field7576 + 1];
                if (class621.field8313 <= 0) {
                    class621.field8313 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field7576 -= 4;
                class516.field7212 = (short) field7573[field7576];
                if (class516.field7212 <= 0) {
                    class516.field7212 = 1;
                }
                class388.field5602 = (short) field7573[field7576 + 1];
                if (class388.field5602 <= 0) {
                    class388.field5602 = 32767;
                } else if (class388.field5602 < class516.field7212) {
                    class388.field5602 = class516.field7212;
                }
                class518.field7228 = (short) field7573[field7576 + 2];
                if (class518.field7228 <= 0) {
                    class518.field7228 = 1;
                }
                class27.field348 = (short) field7573[field7576 + 3];
                if (class27.field348 <= 0) {
                    class27.field348 = 32767;
                    return;
                }
                if (class27.field348 < class518.field7228) {
                    class27.field348 = class518.field7228;
                }
                return;
            }
            if (arg0 == 6203) {
                class612.method3469(class509.field7066.field10501, (byte) -123, class509.field7066.field10393, false, 0, 0);
                field7573[field7576++] = class220.field2976;
                field7573[field7576++] = class6.field54;
                return;
            }
            if (arg0 == 6204) {
                field7573[field7576++] = class67.field1037;
                field7573[field7576++] = class621.field8313;
                return;
            }
            if (arg0 == 6205) {
                field7573[field7576++] = class459.field6369;
                field7573[field7576++] = class687.field9561;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7573[field7576++] = (int) (class97.method664((byte) -50) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7573[field7576++] = (int) (class97.method664((byte) -50) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field7576 -= 3;
                int var227 = field7573[field7576];
                int var228 = field7573[field7576 + 1];
                int var229 = field7573[field7576 + 2];
                long var230 = class571.method3351(var228, 0, 12, var227, var229, 14301, 0);
                int var232 = class75.method565((byte) 124, var230);
                if (var229 < 1970) {
                    var232--;
                }
                field7573[field7576++] = var232;
                return;
            }
            if (arg0 == 6303) {
                field7573[field7576++] = class73.method561(class97.method664((byte) -50), -115);
                return;
            }
            if (arg0 == 6304) {
                int var233 = field7573[--field7576];
                boolean var234 = true;
                if (var233 < 0) {
                    var234 = (var233 + 1) % 4 == 0;
                } else if (var233 < 1582) {
                    var234 = var233 % 4 == 0;
                } else if (var233 % 4 != 0) {
                    var234 = false;
                } else if (var233 % 100 != 0) {
                    var234 = true;
                } else if (var233 % 400 != 0) {
                    var234 = false;
                }
                field7573[field7576++] = var234 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7573[field7576++] = class475.method2896(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7573[field7576++] = class362.method2300(-121) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class102.field1401 == 7 && class538.field7453 == 0 && class210.field2748 == 0) {
                    if (class728.field10123) {
                        field7573[field7576++] = 0;
                        return;
                    }
                    if (class754.field10379 > class97.method664((byte) -50) - 1000L) {
                        field7573[field7576++] = 1;
                        return;
                    }
                    class728.field10123 = true;
                    class583 var235 = class54.method400(class213.field2800, (byte) -54, class243.field3611);
                    var235.field7963.method473(-13, class673.field9359);
                    class463.method2838(var235, (byte) 127);
                    field7573[field7576++] = 0;
                    return;
                }
                field7573[field7576++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class370 var236 = class162.method1007(0);
                if (var236 != null) {
                    field7573[field7576++] = var236.field5222;
                    field7573[field7576++] = var236.field6044;
                    field7588[field7580++] = var236.field5221;
                    class737 var237 = var236.method2322(false);
                    field7573[field7576++] = var237.field10197;
                    field7588[field7580++] = var237.field10196;
                    field7573[field7576++] = var236.field6040;
                    field7573[field7576++] = var236.field5225;
                    field7588[field7580++] = var236.field5224;
                    return;
                }
                field7573[field7576++] = -1;
                field7573[field7576++] = 0;
                field7588[field7580++] = "";
                field7573[field7576++] = 0;
                field7588[field7580++] = "";
                field7573[field7576++] = 0;
                field7573[field7576++] = 0;
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 6502) {
                class370 var238 = class467.method2853((byte) -96);
                if (var238 != null) {
                    field7573[field7576++] = var238.field5222;
                    field7573[field7576++] = var238.field6044;
                    field7588[field7580++] = var238.field5221;
                    class737 var239 = var238.method2322(false);
                    field7573[field7576++] = var239.field10197;
                    field7588[field7580++] = var239.field10196;
                    field7573[field7576++] = var238.field6040;
                    field7573[field7576++] = var238.field5225;
                    field7588[field7580++] = var238.field5224;
                    return;
                }
                field7573[field7576++] = -1;
                field7573[field7576++] = 0;
                field7588[field7580++] = "";
                field7573[field7576++] = 0;
                field7588[field7580++] = "";
                field7573[field7576++] = 0;
                field7573[field7576++] = 0;
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var240 = field7573[--field7576];
                String var241 = field7588[--field7580];
                if (class102.field1401 == 7 && class538.field7453 == 0 && class210.field2748 == 0) {
                    field7573[field7576++] = class137.method909(-7000, var240, var241) ? 1 : 0;
                    return;
                }
                field7573[field7576++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var242 = field7573[--field7576];
                class370 var243 = class76.method568(var242, 1);
                if (var243 != null) {
                    field7573[field7576++] = var243.field6044;
                    field7588[field7580++] = var243.field5221;
                    class737 var244 = var243.method2322(false);
                    field7573[field7576++] = var244.field10197;
                    field7588[field7580++] = var244.field10196;
                    field7573[field7576++] = var243.field6040;
                    field7573[field7576++] = var243.field5225;
                    field7588[field7580++] = var243.field5224;
                    return;
                }
                field7573[field7576++] = -1;
                field7588[field7580++] = "";
                field7573[field7576++] = 0;
                field7588[field7580++] = "";
                field7573[field7576++] = 0;
                field7573[field7576++] = 0;
                field7588[field7580++] = "";
                return;
            }
            if (arg0 == 6507) {
                field7576 -= 4;
                int var245 = field7573[field7576];
                boolean var246 = field7573[field7576 + 1] == 1;
                int var247 = field7573[field7576 + 2];
                boolean var248 = field7573[field7576 + 3] == 1;
                class7.method30(18857, var246, var245, var247, var248);
                return;
            }
            if (arg0 == 6508) {
                class350.method2233(5121);
                return;
            }
            if (arg0 == 6509) {
                if (class102.field1401 != 7) {
                    return;
                }
                class49.field736 = field7573[--field7576] == 1;
                return;
            }
            if (arg0 == 6510) {
                field7573[field7576++] = class497.field6953;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class76.field1115 == class675.field9367) {
                if (arg0 == 6700) {
                    int var249 = class259.field3747.method816((byte) -36);
                    if (class544.field7545 != -1) {
                        var249++;
                    }
                    field7573[field7576++] = var249;
                    return;
                }
                if (arg0 == 6701) {
                    int var250 = field7573[--field7576];
                    if (class544.field7545 != -1) {
                        if (var250 == 0) {
                            field7573[field7576++] = class544.field7545;
                            return;
                        }
                        var250--;
                    }
                    class654 var251 = (class654) class259.field3747.method821((byte) 112);
                    while (var250-- > 0) {
                        var251 = (class654) class259.field3747.method818(69);
                    }
                    field7573[field7576++] = var251.field8745;
                    return;
                }
                if (arg0 == 6702) {
                    int var252 = field7573[--field7576];
                    if (class266.field3900[var252] == null) {
                        field7588[field7580++] = "";
                        return;
                    }
                    String var253 = class266.field3900[var252][0].field10474;
                    if (var253 == null) {
                        field7588[field7580++] = "";
                        return;
                    }
                    field7588[field7580++] = var253.substring(0, var253.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var254 = field7573[--field7576];
                    if (class266.field3900[var254] == null) {
                        field7573[field7576++] = 0;
                        return;
                    }
                    field7573[field7576++] = class266.field3900[var254].length;
                    return;
                }
                if (arg0 == 6704) {
                    field7576 -= 2;
                    int var255 = field7573[field7576];
                    int var256 = field7573[field7576 + 1];
                    if (class266.field3900[var255] == null) {
                        field7588[field7580++] = "";
                        return;
                    }
                    String var257 = class266.field3900[var255][var256].field10474;
                    if (var257 == null) {
                        field7588[field7580++] = "";
                        return;
                    }
                    field7588[field7580++] = var257;
                    return;
                }
                if (arg0 == 6705) {
                    field7576 -= 2;
                    int var258 = field7573[field7576];
                    int var259 = field7573[field7576 + 1];
                    if (class266.field3900[var258] == null) {
                        field7573[field7576++] = 0;
                        return;
                    }
                    field7573[field7576++] = class266.field3900[var258][var259].field10491;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field7576 -= 3;
                    int var260 = field7573[field7576];
                    int var261 = field7573[field7576 + 1];
                    int var262 = field7573[field7576 + 2];
                    class516.method3088(var262, "", 1, var260 << 16 | var261, (byte) -44);
                    return;
                }
                if (arg0 == 6708) {
                    field7576 -= 3;
                    int var263 = field7573[field7576];
                    int var264 = field7573[field7576 + 1];
                    int var265 = field7573[field7576 + 2];
                    class516.method3088(var265, "", 2, var263 << 16 | var264, (byte) -44);
                    return;
                }
                if (arg0 == 6709) {
                    field7576 -= 3;
                    int var266 = field7573[field7576];
                    int var267 = field7573[field7576 + 1];
                    int var268 = field7573[field7576 + 2];
                    class516.method3088(var268, "", 3, var266 << 16 | var267, (byte) -44);
                    return;
                }
                if (arg0 == 6710) {
                    field7576 -= 3;
                    int var269 = field7573[field7576];
                    int var270 = field7573[field7576 + 1];
                    int var271 = field7573[field7576 + 2];
                    class516.method3088(var271, "", 4, var269 << 16 | var270, (byte) -44);
                    return;
                }
                if (arg0 == 6711) {
                    field7576 -= 3;
                    int var272 = field7573[field7576];
                    int var273 = field7573[field7576 + 1];
                    int var274 = field7573[field7576 + 2];
                    class516.method3088(var274, "", 5, var272 << 16 | var273, (byte) -44);
                    return;
                }
                if (arg0 == 6712) {
                    field7576 -= 3;
                    int var275 = field7573[field7576];
                    int var276 = field7573[field7576 + 1];
                    int var277 = field7573[field7576 + 2];
                    class516.method3088(var277, "", 6, var275 << 16 | var276, (byte) -44);
                    return;
                }
                if (arg0 == 6713) {
                    field7576 -= 3;
                    int var278 = field7573[field7576];
                    int var279 = field7573[field7576 + 1];
                    int var280 = field7573[field7576 + 2];
                    class516.method3088(var280, "", 7, var278 << 16 | var279, (byte) -44);
                    return;
                }
                if (arg0 == 6714) {
                    field7576 -= 3;
                    int var281 = field7573[field7576];
                    int var282 = field7573[field7576 + 1];
                    int var283 = field7573[field7576 + 2];
                    class516.method3088(var283, "", 8, var281 << 16 | var282, (byte) -44);
                    return;
                }
                if (arg0 == 6715) {
                    field7576 -= 3;
                    int var284 = field7573[field7576];
                    int var285 = field7573[field7576 + 1];
                    int var286 = field7573[field7576 + 2];
                    class516.method3088(var286, "", 9, var284 << 16 | var285, (byte) -44);
                    return;
                }
                if (arg0 == 6716) {
                    field7576 -= 3;
                    int var287 = field7573[field7576];
                    int var288 = field7573[field7576 + 1];
                    int var289 = field7573[field7576 + 2];
                    class516.method3088(var289, "", 10, var287 << 16 | var288, (byte) -44);
                    return;
                }
                if (arg0 == 6717) {
                    field7576 -= 3;
                    int var290 = field7573[field7576];
                    int var291 = field7573[field7576 + 1];
                    int var292 = field7573[field7576 + 2];
                    class755 var293 = class171.method1093((byte) 108, var290 << 16 | var291, var292);
                    class594.method3413((byte) 107);
                    class274 var294 = client.method2738(var293);
                    class470.method2862((byte) 106, var293, var294.field3971, var294.method1838((byte) 104));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var295 = field7573[--field7576];
                    class21 var296 = class700.field9771.method11(-119, var295);
                    if (var296.field210 == null) {
                        field7588[field7580++] = "";
                        return;
                    }
                    field7588[field7580++] = var296.field210;
                    return;
                }
                if (arg0 == 6801) {
                    int var297 = field7573[--field7576];
                    class21 var298 = class700.field9771.method11(114, var297);
                    field7573[field7576++] = var298.field244;
                    return;
                }
                if (arg0 == 6802) {
                    int var299 = field7573[--field7576];
                    class21 var300 = class700.field9771.method11(16, var299);
                    field7573[field7576++] = var300.field233;
                    return;
                }
                if (arg0 == 6803) {
                    int var301 = field7573[--field7576];
                    class21 var302 = class700.field9771.method11(63, var301);
                    field7573[field7576++] = var302.field235;
                    return;
                }
                if (arg0 == 6804) {
                    field7576 -= 2;
                    int var303 = field7573[field7576];
                    int var304 = field7573[field7576 + 1];
                    class648 var305 = class360.field5161.method2279(-77, var304);
                    if (var305.method3628((byte) -16)) {
                        field7588[field7580++] = class700.field9771.method11(16, var303).method115(var305.field8687, -83, var304);
                        return;
                    }
                    field7573[field7576++] = class700.field9771.method11(-115, var303).method113(var304, var305.field8689, true);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field7573[field7576++] = class214.field2807 && !class571.field7897 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field7573[field7576++] = (int) (class337.field4739 / 60000L);
                    field7573[field7576++] = class435.field6063 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field7573[field7576++] = class372.field5249;
                    return;
                }
                if (arg0 == 6903) {
                    field7573[field7576++] = class700.field9767;
                    return;
                }
                if (arg0 == 6904) {
                    field7573[field7576++] = class32.field435;
                    return;
                }
                if (arg0 == 6905) {
                    String var306 = "";
                    if (class596.field8095 != null) {
                        if (class596.field8095.field3638 == null) {
                            var306 = class336.method2137((byte) -55, class596.field8095.field3637);
                        } else {
                            var306 = (String) class596.field8095.field3638;
                        }
                    }
                    field7588[field7580++] = var306;
                    return;
                }
                if (arg0 == 6906) {
                    field7573[field7576++] = class534.field7408;
                    return;
                }
                if (arg0 == 6907) {
                    field7573[field7576++] = class697.field9742;
                    return;
                }
                if (arg0 == 6908) {
                    field7573[field7576++] = class289.field4131;
                    return;
                }
                if (arg0 == 6909) {
                    field7573[field7576++] = class265.field3893 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field7573[field7576++] = class134.field1911;
                    return;
                }
                if (arg0 == 6911) {
                    field7573[field7576++] = class524.field7282;
                    return;
                }
                if (arg0 == 6912) {
                    field7573[field7576++] = class731.field10161;
                    return;
                }
                if (arg0 == 6913) {
                    field7573[field7576++] = class548.field7619;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var307 = class368.method2320(2);
                    field7573[field7576++] = class100.field1387 = class332.field4707.field4789.method963(0);
                    field7573[field7576++] = var307;
                    class573.method3360(70);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class320.method2066((byte) -124);
                    class573.method3360(88);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class699.method3950((byte) -123);
                    class573.method3360(111);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class710.method3995((byte) -128);
                    class573.method3360(97);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class611.method3466((byte) 4, true);
                    class573.method3360(107);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class332.field4707.method2158(0, class332.field4707.field4785, -15);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class100.field1387 == 2) {
                        class151.field2083 = true;
                        return;
                    }
                    if (class100.field1387 == 1) {
                        class525.field7292 = true;
                        return;
                    }
                    if (class100.field1387 == 3) {
                        class577.field7933 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field7573[field7576++] = class332.field4707.field4785.method2910(0);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field7576 -= 2;
                    int var308 = field7573[field7576];
                    int var309 = field7573[field7576 + 1];
                    if (var308 != -1) {
                        if (var309 > 255) {
                            var309 = 255;
                        } else if (var309 < 0) {
                            var309 = 0;
                        }
                        class268.method1820((byte) -92, var308, var309, false);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var310 = field7573[--field7576];
                    if (var310 != -1) {
                        class480.method2923(var310, 0);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var311 = field7573[--field7576];
                    if (var311 != -1) {
                        class431.method2666(-1, var311);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field7573[field7576++] = class751.method4169(true, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field7573[field7576++] = class332.field4707.field4779.method1161(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field7573[field7576++] = class332.field4707.field4757.method2150(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field7573[field7576++] = class332.field4707.field4787.method940(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field7573[field7576++] = class332.field4707.field4791.method42(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field7573[field7576++] = class332.field4707.field4756.method2790(2048) && class129.field1802.method1441() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field7573[field7576++] = class332.field4707.field4800.method4163(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field7573[field7576++] = class332.field4707.field4770.method4030(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field7573[field7576++] = class332.field4707.field4767.method432(2048) && class129.field1802.method1446() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field7573[field7576++] = class332.field4707.field4752.method60(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field7573[field7576++] = class332.field4707.field4792.method3639(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field7573[field7576++] = class332.field4707.field4758.method2726(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field7573[field7576++] = class332.field4707.field4765.method3371(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field7573[field7576++] = class332.field4707.field4777.method676(2048) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field7573[field7576++] = class332.field4707.field4753.method960(2048) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var312 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4779.method36(var312, (byte) 22);
                    return;
                }
                if (arg0 == 7302) {
                    int var313 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4757.method36(var313, (byte) 22);
                    return;
                }
                if (arg0 == 7303) {
                    int var314 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4787.method36(var314, (byte) 22);
                    return;
                }
                if (arg0 == 7304) {
                    int var315 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4791.method36(var315, (byte) 22);
                    return;
                }
                if (arg0 == 7305) {
                    int var316 = field7573[--field7576];
                    if (!class129.field1802.method1441()) {
                        field7573[field7576++] = 3;
                        return;
                    }
                    field7573[field7576++] = class332.field4707.field4756.method36(var316, (byte) 22);
                    return;
                }
                if (arg0 == 7306) {
                    int var317 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4800.method36(var317, (byte) 22);
                    return;
                }
                if (arg0 == 7307) {
                    int var318 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4770.method36(var318, (byte) 22);
                    return;
                }
                if (arg0 == 7308) {
                    int var319 = field7573[--field7576];
                    if (!class129.field1802.method1446()) {
                        field7573[field7576++] = 3;
                        return;
                    }
                    field7573[field7576++] = class332.field4707.field4767.method36(var319, (byte) 22);
                    return;
                }
                if (arg0 == 7309) {
                    int var320 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4752.method36(var320, (byte) 22);
                    return;
                }
                if (arg0 == 7310) {
                    int var321 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4792.method36(var321, (byte) 22);
                    return;
                }
                if (arg0 == 7311) {
                    int var322 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4758.method36(var322, (byte) 22);
                    return;
                }
                if (arg0 == 7312) {
                    int var323 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4765.method36(var323, (byte) 22);
                    return;
                }
                if (arg0 == 7313) {
                    int var324 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4777.method36(var324, (byte) 22);
                    return;
                }
                if (arg0 == 7314) {
                    int var325 = field7573[--field7576];
                    field7573[field7576++] = class332.field4707.field4753.method36(var325, (byte) 22);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(IZ)V", line = 8054)
    public static final void method3230(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "()V", line = 8077)
    public static void method3231() {
        field7579 = null;
        field7585 = null;
        field7593 = null;
        field7568 = null;
        field7573 = null;
        field7588 = null;
        field7571 = null;
        field7591 = null;
        field7590 = null;
        field7583 = null;
        field7575 = null;
        field7592 = null;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V", line = 8092)
    public static final void method3232(int arg0) {
        if (arg0 == -1 || !class424.method2641(arg0, -11664)) {
            return;
        }
        class755[] var1 = class266.field3900[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class755 var3 = var1[var2];
            if (var3.field10508 != null) {
                class142 var4 = new class142();
                var4.field2020 = var3;
                var4.field2024 = var3.field10508;
                method3227(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lnt;)V", line = 8124)
    public static final void method3233(class142 arg0) {
        method3227(arg0, 200000);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lfi;I)V", line = 8131)
    private static final void method3234(class12 arg0, int arg1) {
        field7576 = 0;
        field7580 = 0;
        int var2 = -1;
        int[] var3 = arg0.field107;
        int[] var4 = arg0.field114;
        byte var5 = -1;
        field7570 = 0;
        try {
            int var6 = 0;
            label270: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method3225(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3229(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7573[field7576++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7573[field7576++] = class124.field1712.field8648[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class124.field1712.method3602(var8, field7573[--field7576], false);
                } else if (var43 == 3) {
                    field7588[field7580++] = arg0.field105[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field7576 -= 2;
                    if (field7573[field7576 + 1] != field7573[field7576]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field7576 -= 2;
                    if (field7573[field7576 + 1] == field7573[field7576]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field7576 -= 2;
                    if (field7573[field7576] < field7573[field7576 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field7576 -= 2;
                    if (field7573[field7576] > field7573[field7576 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7570 == 0) {
                        return;
                    }
                    class390 var9 = field7571[--field7570];
                    arg0 = var9.field5617;
                    var3 = arg0.field107;
                    var4 = arg0.field114;
                    var2 = var9.field5616;
                    field7579 = var9.field5622;
                    field7585 = var9.field5621;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7573[field7576++] = class124.field1712.method3172(var10, (byte) 124);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class124.field1712.method3599(field7573[--field7576], var11, (byte) 127);
                } else if (var43 == 31) {
                    field7576 -= 2;
                    if (field7573[field7576] <= field7573[field7576 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field7576 -= 2;
                    if (field7573[field7576] >= field7573[field7576 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7573[field7576++] = field7579[var4[var2]];
                } else if (var43 == 34) {
                    field7579[var4[var2]] = field7573[--field7576];
                } else if (var43 == 35) {
                    field7588[field7580++] = field7585[var4[var2]];
                } else if (var43 == 36) {
                    field7585[var4[var2]] = field7588[--field7580];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7580 -= var12;
                    String var13 = class355.method2277(-54, field7588, field7580, var12);
                    field7588[field7580++] = var13;
                } else if (var43 == 38) {
                    field7576--;
                } else if (var43 == 39) {
                    field7580--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class12 var15 = class44.method240(-126, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field103];
                    String[] var17 = new String[var15.field117];
                    for (int var18 = 0; var18 < var15.field112; var18++) {
                        var16[var18] = field7573[field7576 + var18 - var15.field112];
                    }
                    for (int var19 = 0; var19 < var15.field111; var19++) {
                        var17[var19] = field7588[field7580 + var19 - var15.field111];
                    }
                    field7576 -= var15.field112;
                    field7580 -= var15.field111;
                    class390 var20 = new class390();
                    var20.field5617 = arg0;
                    var20.field5616 = var2;
                    var20.field5622 = field7579;
                    var20.field5621 = field7585;
                    if (field7570 >= field7571.length) {
                        throw new RuntimeException();
                    }
                    field7571[field7570++] = var20;
                    arg0 = var15;
                    var3 = var15.field107;
                    var4 = var15.field114;
                    var2 = -1;
                    field7579 = var16;
                    field7585 = var17;
                } else if (var43 == 42) {
                    field7573[field7576++] = class621.field8315[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class621.field8315[var21] = field7573[--field7576];
                    class31.method169(var21, (byte) -43);
                    class696.field9689 |= class693.field9627[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7573[--field7576];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7593[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label270;
                            }
                            field7568[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7573[--field7576];
                    if (var28 < 0 || var28 >= field7593[var27]) {
                        throw new RuntimeException();
                    }
                    field7573[field7576++] = field7568[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field7576 -= 2;
                    int var30 = field7573[field7576];
                    if (var30 < 0 || var30 >= field7593[var29]) {
                        throw new RuntimeException();
                    }
                    field7568[var29][var30] = field7573[field7576 + 1];
                } else if (var43 == 47) {
                    String var31 = class380.field5458[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7588[field7580++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class380.field5458[var32] = field7588[--field7580];
                    class313.method2048((byte) -109, var32);
                } else if (var43 == 51) {
                    class130 var33 = arg0.field113[var4[var2]];
                    class27 var34 = (class27) var33.method812(106, (long) field7573[--field7576]);
                    if (var34 != null) {
                        var2 += var34.field347;
                    }
                } else if (var43 == 86) {
                    if (field7573[--field7576] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 87 && field7573[--field7576] == 0) {
                    var2 += var4[var2];
                }
            }
        } catch (Exception var42) {
            if (arg0.field110 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field1079).append(" ");
                for (int var41 = field7570 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7571[var41].field5617.field1079).append(" ");
                }
                var40.append("op: ").append(var5);
                class31.method172(var42, var40.toString(), 0);
            } else {
                class75.method566(4, true, "Clientscript error in: " + arg0.field110);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field110).append("\n");
                for (int var38 = field7570 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7571[var38].field5617.field110).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class31.method172(var42, var37.toString(), 0);
                class261.method1772((byte) -119, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)V")
    private static final void method3235(int arg0) {
        class755 var1 = class189.method1182(arg0, (byte) -101);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class755[] var3 = class39.field483[var2];
        if (var3 == null) {
            class755[] var4 = class266.field3900[var2];
            int var5 = var4.length;
            var3 = class39.field483[var2] = new class755[var5];
            class245.method1649(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class245.method1649(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }
}
