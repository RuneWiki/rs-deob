import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class346 extends class250 {

    @OriginalMember(owner = "client!is", name = "V", descriptor = "Lgf;")
    public static class180 field5256;

    @OriginalMember(owner = "client!is", name = "M", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!is", name = "P", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!is", name = "R", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!is", name = "S", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!is", name = "T", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!is", name = "U", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!is", name = "W", descriptor = "Lhh;")
    public static class84 field5257;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "[B")
    private byte[] field5249;

    static {
        new class180("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field5256 = new class180("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V", line = 5)
    public static final void method2244(int arg0) {
        class106.field1669 = 0;
        field5248++;
        class246.field3563.method2264(47);
        class246.field3563.method2270(0, class169.field2542);
        if (arg0 >= -24) {
            field5257 = null;
        }
        class106.field1669++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIII)V", line = 19)
    public static final void method2245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5250++;
        class324[] var7 = class187.field2777;
        if (arg2 <= 17) {
            method2244(73);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class324 var9 = var7[var8];
            if (var9 != null && var9.field4969 == 2) {
                class205.method1372(arg4, (byte) 116, var9.field4971, arg3 >> 1, arg5 >> 1, var9.field4970, var9.field4967 * 2, var9.field4968, arg1);
                if (class387.field5746[0] > -1 && class180.field2734 % 20 < 10) {
                    class57.field829[var9.field4976].method3129(arg0 + class387.field5746[0] - 12, class387.field5746[1] + arg6 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIBII)V", line = 50)
    public static final void method2246(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5253++;
        for (int var5 = 0; var5 < class73.field1232; var5++) {
            Rectangle var6 = class135.field2072[var5];
            if (arg1 < (var6.x + var6.width) && arg1 + arg3 > var6.x && (var6.y + var6.height) > arg0 && var6.y < arg0 + arg4) {
                class165.field2473[var5] = true;
            }
        }
        if (arg2 != -93) {
            method2247(98, null);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 78)
    public static final boolean method2247(int arg0, String arg1) {
        field5254++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class424.field6218; var2++) {
            if (arg1.equalsIgnoreCase(class469.field6908[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class95.field1558.field1094)) {
            return true;
        } else {
            if (arg0 <= 12) {
                field5257 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V", line = 107)
    public class346() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V", line = 113)
    public static void method2248(byte arg0) {
        field5257 = null;
        field5256 = null;
        if (arg0 != -104) {
            field5256 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(IIIIIII)V", line = 124)
    public static final void method2249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5247++;
        int var7 = class333.field5117;
        class441.field6474 = 0;
        int[] var8 = class459.field6766;
        for (int var9 = 0; var9 < class322.field4943 + var7; var9++) {
            class148 var33 = null;
            class22 var34;
            if (var9 >= var7) {
                var34 = class132.field2030[class101.field1623[var9 - var7]];
                var33 = ((class13) var34).field210;
                if (var33.field2193 != null) {
                    var33 = var33.method1059((byte) -51, class526.field7733);
                    if (var33 == null) {
                        continue;
                    }
                }
            } else {
                var34 = class390.field5783[var8[var9]];
            }
            if (var34.field334 >= 0 && (class454.field6731 == var34.field353 || class95.field1558.field5538 == var34.field5538)) {
                class326.method2135(arg1, arg0, var34, var34.method113((byte) 116), arg2 >> 1, arg5 >> 1, true);
                if (class387.field5746[0] >= 0) {
                    if (var34.field350 != null && (var9 >= var7 || class509.field7439 == 0 || class509.field7439 == 3 || class509.field7439 == 1 && method2247(102, ((class62) var34).field1094)) && class441.field6474 < class11.field179) {
                        class11.field181[class441.field6474] = class476.field6998.method105(var34.field350, 1) / 2;
                        class11.field186[class441.field6474] = class387.field5746[0];
                        class11.field180[class441.field6474] = class387.field5746[1];
                        class11.field183[class441.field6474] = var34.field362;
                        class11.field193[class441.field6474] = var34.field326;
                        class11.field188[class441.field6474] = var34.field344;
                        class11.field177[class441.field6474] = var34.field350;
                        class441.field6474++;
                    }
                    int var35 = arg6 + class387.field5746[1];
                    int var46;
                    if (var34.field366 || var34.field336 <= class180.field2734) {
                        var46 = var35 - Math.max(class476.field6998.field194, class319.field4561[0].method139());
                    } else {
                        boolean var36 = true;
                        byte var37 = 1;
                        int var39;
                        if (var7 > var9) {
                            class62 var38 = class390.field5783[var8[var9]];
                            var39 = var34.method192(true).field6451;
                            if (var38.field1102) {
                                var37 = 2;
                            }
                        } else {
                            var39 = var33.field2221;
                            if (var39 == -1) {
                                var39 = var34.method192(true).field6451;
                            }
                        }
                        class528[] var40 = class319.field4561;
                        if (var39 != -1) {
                            class528[] var41 = (class528[]) class439.field6400.method2339(-80, (long) var39);
                            if (var41 == null) {
                                class158[] var42 = class158.method1137(class460.field6798, var39, 0);
                                if (var42 != null) {
                                    var41 = new class528[var42.length];
                                    for (int var43 = 0; var43 < var42.length; var43++) {
                                        var41[var43] = class394.field5821.method517(var42[var43], true);
                                    }
                                    class439.field6400.method2342((long) var39, var41, -104);
                                }
                            }
                            if (var41 != null && var41.length >= 2) {
                                var40 = var41;
                            }
                        }
                        if (var37 >= var40.length) {
                            var37 = 1;
                        }
                        class528 var44 = var40[0];
                        class528 var45 = var40[var37];
                        var46 = var35 - Math.max(class476.field6998.field194, var44.method139());
                        int var47 = arg3 - ((var44.method137() >> 1) - class387.field5746[0]);
                        int var48 = var44.method137() * var34.field354 / 255;
                        if (var34.field354 > 0 && var48 < 2) {
                            var48 = 2;
                        }
                        var44.method3129(var47, var46);
                        class394.field5821.method480(var47, var46, var47 + var48, var46 - -var44.method139());
                        var45.method3129(var47, var46);
                        class394.field5821.method509(arg3, arg6, arg3 + arg2, arg6 - -arg5);
                    }
                    var46 -= 2;
                    if (!var34.field366) {
                        if (var34.field325 > class180.field2734) {
                            class528 var49 = class18.field283[var34.field384 ? 2 : 0];
                            class528 var50 = class18.field283[var34.field384 ? 3 : 1];
                            boolean var51 = true;
                            int var52;
                            if ((var34 instanceof class13)) {
                                var52 = var33.field2236;
                                if (var52 == -1) {
                                    var52 = var34.method192(true).field6445;
                                }
                            } else {
                                var52 = var34.method192(true).field6445;
                            }
                            if (var52 != -1) {
                                class528[] var53 = (class528[]) class91.field1511.method2339(-91, (long) var52);
                                if (var53 == null) {
                                    class158[] var54 = class158.method1137(class460.field6798, var52, 0);
                                    if (var54 != null) {
                                        var53 = new class528[var54.length];
                                        for (int var55 = 0; var55 < var54.length; var55++) {
                                            var53[var55] = class394.field5821.method517(var54[var55], true);
                                        }
                                        class91.field1511.method2342((long) var52, var53, -64);
                                    }
                                }
                                if (var53 != null && var53.length == 4) {
                                    var50 = var53[var34.field384 ? 3 : 1];
                                    var49 = var53[var34.field384 ? 2 : 0];
                                }
                            }
                            int var56 = var34.field325 - class180.field2734;
                            int var57;
                            if (var34.field403 >= var56) {
                                var57 = var49.method137();
                            } else {
                                int var58 = var56 - var34.field403;
                                int var59 = var34.field382 == 0 ? 0 : (var34.field341 - var58) / var34.field382 * var34.field382;
                                var57 = var59 * var49.method137() / var34.field341;
                            }
                            int var60 = var49.method139();
                            var46 -= var60;
                            int var61 = arg3 - ((var49.method137() >> 1) - class387.field5746[0]);
                            var49.method3129(var61, var46);
                            class394.field5821.method480(var61, var46, var61 + var57, var46 + var60);
                            var50.method3129(var61, var46);
                            class394.field5821.method509(arg3, arg6, arg2 + arg3, arg5 + arg6);
                            var46 -= 2;
                        }
                        if (var9 < var7) {
                            class62 var63 = (class62) var34;
                            if (var63.field1065 != -1) {
                                var46 -= 25;
                                class364.field5482[var63.field1065].method3129(class387.field5746[0] + arg3 - 12, var46);
                                var46 -= 2;
                            }
                            if (var63.field1092 != -1) {
                                var46 -= 25;
                                class122.field1911[var63.field1092].method3129(arg3 + class387.field5746[0] - 12, var46);
                                var46 -= 2;
                            }
                        } else if (var33.field2240 >= 0 && class122.field1911.length > var33.field2240) {
                            class528 var62 = class122.field1911[var33.field2240];
                            var46 -= 25;
                            var62.method3129(class387.field5746[0] + arg3 - (var62.method137() >> 1), var46);
                            var46 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var34 instanceof class62)) {
                        int var64 = 0;
                        class324[] var65 = class187.field2777;
                        for (int var66 = 0; var66 < var65.length; var66++) {
                            class324 var68 = var65[var66];
                            if (var68 != null && var68.field4969 == 1 && class101.field1623[var9 - var7] == var68.field4972) {
                                class528 var69 = class57.field829[var68.field4976];
                                if (var64 < var69.method139()) {
                                    var64 = var69.method139();
                                }
                                if (class180.field2734 % 20 < 10) {
                                    var69.method3129(class387.field5746[0] + arg3 - 12, -var69.method139() + var46);
                                }
                            }
                        }
                        if (var64 > 0) {
                            var10000 = var46 - (var64 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var70 = 0;
                        class324[] var71 = class187.field2777;
                        for (int var72 = 0; var72 < var71.length; var72++) {
                            class324 var74 = var71[var72];
                            if (var74 != null && var74.field4969 == 10 && var8[var9] == var74.field4972) {
                                class528 var75 = class57.field829[var74.field4976];
                                if (var70 < var75.method139()) {
                                    var70 = var75.method139();
                                }
                                var75.method3129(class387.field5746[0] + arg3 - 12, var46 + -var75.method139());
                            }
                        }
                        if (var70 > 0) {
                            var10000 = var46 - (var70 + 2);
                        }
                    }
                    for (int var76 = 0; var76 < 4; var76++) {
                        if (class180.field2734 < var34.field310[var76]) {
                            int var77 = var34.method113((byte) 116) / 2;
                            class326.method2135(arg1, arg0, var34, var77, arg2 >> 1, arg5 >> 1, true);
                            if (class387.field5746[0] > -1) {
                                if (var76 == 1) {
                                    class387.field5746[1] -= 20;
                                }
                                if (var76 == 2) {
                                    class387.field5746[0] -= 15;
                                    class387.field5746[1] -= 10;
                                }
                                if (var76 == 3) {
                                    class387.field5746[0] += 15;
                                    class387.field5746[1] -= 10;
                                }
                                class205.field2957[var34.field323[var76]].method3129(class387.field5746[0] + arg3 - 12, arg6 - 12 + class387.field5746[1]);
                                class125.field1923.method2913(-1, arg6 + class387.field5746[1] + 3, 0, class387.field5746[0] + arg3 - 1, Integer.toString(var34.field308[var76]), (byte) 120);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class374.field5590; var10++) {
            int var29 = class46.field711[var10];
            class22 var30;
            if (var29 < 2048) {
                var30 = class390.field5783[var29];
            } else {
                var30 = class132.field2030[var29 - 2048];
            }
            int var31 = class226.field3305[var10];
            class22 var32;
            if (var31 < 2048) {
                var32 = class390.field5783[var31];
            } else {
                var32 = class132.field2030[var31 - 2048];
            }
            class275.method1753(arg5, arg2, arg6, var30, var32, 64, arg3, arg0, --var30.field317, arg1);
        }
        int var11 = class476.field6998.field194 + class476.field6998.field201 + 2;
        for (int var12 = 0; var12 < class441.field6474; var12++) {
            int var14 = class11.field186[var12];
            int var15 = class11.field180[var12];
            int var16 = class11.field181[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var28 = 0; var28 < var12; var28++) {
                    if (var15 + 2 > class11.field180[var28] + -var11 && var15 - var11 < class11.field180[var28] + 2 && class11.field186[var28] + class11.field181[var28] > -var16 + var14 && class11.field186[var28] - class11.field181[var28] < var14 + var16 && var15 > (class11.field180[var28] - var11)) {
                        var15 = class11.field180[var28] - var11;
                        var17 = true;
                    }
                }
            }
            class11.field180[var12] = var15;
            String var18 = class11.field177[var12];
            if (class66.field1153 == 0) {
                int var19 = 16776960;
                if (class11.field183[var12] < 6) {
                    var19 = class382.field5690[class11.field183[var12]];
                }
                if (class11.field183[var12] == 6) {
                    var19 = class454.field6731 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class11.field183[var12] == 7) {
                    var19 = class454.field6731 % 20 >= 10 ? 65535 : 255;
                }
                if (class11.field183[var12] == 8) {
                    var19 = (class454.field6731 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class11.field183[var12] == 9) {
                    int var20 = 150 - class11.field188[var12];
                    if (var20 < 50) {
                        var19 = (var20 * 1280) + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var19 = (var20 * 5) + 65280 - 500;
                    }
                }
                if (class11.field183[var12] == 10) {
                    int var21 = 150 - class11.field188[var12];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16384000 + 16711935 - (var21 * 327680);
                    } else if (var21 < 150) {
                        var19 = var21 * 327680 + 255 - ((var21 - 100) * 5) - 32768000;
                    }
                }
                if (class11.field183[var12] == 11) {
                    int var22 = 150 - class11.field188[var12];
                    if (var22 < 50) {
                        var19 = 16777215 - (var22 * 327685);
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 + 32768000 - (var22 * 327680);
                    }
                }
                int var23 = var19 | 0xFF000000;
                if (class11.field193[var12] == 0) {
                    class526.field7731.method2913(var23, arg6 + var15, -16777216, arg3 + var14, var18, (byte) -26);
                }
                if (class11.field193[var12] == 1) {
                    class526.field7731.method2910((byte) -125, var18, -16777216, var23, arg3 + var14, arg6 + var15, class454.field6731);
                }
                if (class11.field193[var12] == 2) {
                    class526.field7731.method2916(arg6 + var15, (byte) 100, -16777216, class454.field6731, var18, arg3 + var14, var23);
                }
                if (class11.field193[var12] == 3) {
                    class526.field7731.method2921(var23, 150 - class11.field188[var12], var18, 4874, arg3 + var14, arg6 - -var15, -16777216, class454.field6731);
                }
                if (class11.field193[var12] == 4) {
                    int var24 = (150 - class11.field188[var12]) * (class476.field6998.method105(var18, 1) + 100) / 150;
                    class394.field5821.method480(arg3 + var14 - 50, arg6, arg3 + var14 + 50, arg5 + arg6);
                    class526.field7731.method2912(-16777216, arg6 + var15, var23, var14 + arg3 + 50 - var24, var18, (byte) -86);
                    class394.field5821.method509(arg3, arg6, arg2 + arg3, arg5 + arg6);
                }
                if (class11.field193[var12] == 5) {
                    int var25 = 150 - class11.field188[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    int var27 = class476.field6998.field201 + class476.field6998.field194;
                    class394.field5821.method480(arg3, arg6 - (var27 - var15) - 1, arg3 - -arg2, arg6 + var15 + 5);
                    class526.field7731.method2913(var23, arg6 + var15 + var26, -16777216, arg3 + var14, var18, (byte) 108);
                    class394.field5821.method509(arg3, arg6, arg2 + arg3, arg5 + arg6);
                }
            } else {
                class526.field7731.method2913(-256, arg6 + var15, -16777216, arg3 + var14, var18, (byte) 112);
            }
        }
        int var13 = 11 % ((85 - arg4) / 35);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(IIII)[B", line = 707)
    public final byte[] method2250(int arg0, int arg1, int arg2, int arg3) {
        field5251++;
        this.field5249 = new byte[arg0 * arg3 * arg2 * 2];
        this.method572(-986971124, arg3, arg2, arg0);
        if (arg1 != 4096) {
            this.field5249 = null;
        }
        return this.field5249;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BBI)V", line = 720)
    public final void method1589(byte arg0, byte arg1, int arg2) {
        field5255++;
        int var4 = 26 % ((arg1 - 13) / 63);
        int var5 = arg2 * 2;
        int var6 = arg0 & 0xFF;
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field5249[var10001] = (byte) (var6 * 3 >> 5);
        this.field5249[var7] = (byte) (var6 * 3 >> 5);
    }
}
