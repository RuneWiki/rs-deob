import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class119 extends class189 {

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    private int field2090;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Ls;")
    public static class186 field2085 = new class186(12, 3);

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "Lbj;")
    public static class162 field2088 = new class162(39, -1);

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2089 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "Lgi;")
    public static class482 field2093 = new class482();

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field2096 = 0;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "Lla;")
    public static class317 field2091;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "Lph;")
    public static class459 field2095;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "[Lnj;")
    public class164[] field2081;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "[[B")
    private byte[][] field2084;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
    public static void method957(boolean arg0) {
        field2089 = null;
        if (arg0) {
            field2096 = 111;
        }
        field2093 = null;
        field2091 = null;
        field2085 = null;
        field2095 = null;
        field2088 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)Z")
    public final boolean method958(int arg0, int arg1) {
        field2092++;
        int var3 = -43 / ((-arg0 - 70) / 52);
        return this.field2081[arg1].field2623;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)I")
    public static final int method959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 30699) {
            method957(false);
        }
        field2080++;
        int var5 = 65536 - class407.field6168[arg0 * 8192 / arg3] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)Z")
    public final boolean method960(byte arg0) {
        field2079++;
        if (this.field2081 != null) {
            return true;
        }
        if (this.field2084 == null) {
            if (!class60.field1254.method2744(20560, this.field2090)) {
                return false;
            }
            int[] var2 = class60.field1254.method2748(-88, this.field2090);
            this.field2084 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field2084[var3] = class60.field1254.method2757(this.field2090, var2[var3], (byte) -126);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field2084.length; var5++) {
            byte[] var14 = this.field2084[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class13.field249.method2739(var15, -97);
        }
        if (!var4) {
            return false;
        }
        class291 var6 = new class291();
        if (arg0 < 58) {
            method964(-94, -36, -3, 126, -124, 99, 13);
        }
        int var7 = class60.field1254.method2763(this.field2090, -3);
        this.field2081 = new class164[var7];
        int[] var8 = class60.field1254.method2748(-22, this.field2090);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field2084[var9];
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            class444 var12 = null;
            for (class444 var13 = (class444) var6.method1892(126); var13 != null; var13 = (class444) var6.method1893((byte) -2)) {
                if (var13.field6605 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class444(var11, class13.field249.method2760((byte) -55, var11));
                var6.method1885(false, var12);
            }
            this.field2081[var8[var9]] = new class164(var10, var12);
        }
        this.field2084 = null;
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)Z")
    public final boolean method961(int arg0, int arg1) {
        field2086++;
        if (arg0 != -5269) {
            method959(-3, 35, -109, 87, 79);
        }
        return this.field2081[arg1].field2624;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lms;I)V")
    public static final void method962(class535 arg0, int arg1) {
        field2083++;
        boolean var2 = false;
        if (class62.field1268 == arg0.field7827 || arg0.field7768 == -1 || arg0.field7815 != 0) {
            var2 = true;
        } else {
            class57 var3 = class422.field6355.method236(arg0.field7768, (byte) -58);
            if (var3.field1211 || (arg0.field7783 + 1) > var3.field1210[arg0.field7793]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field7827 - arg0.field7856;
            int var5 = class62.field1268 - arg0.field7856;
            int var6 = arg0.field7854 * 128 + (arg0.method2241(-89) * 64);
            int var7 = arg0.field7810 * 128 + (arg0.method2241(-52) * 64);
            int var8 = arg0.field7824 * 128 + arg0.method2241(arg1 - 1108289703) * 64;
            int var9 = arg0.field7819 * 128 + arg0.method2241(arg1 ^ 0xBDF0D738) * 64;
            arg0.field6073 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field6078 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field7872 = 0;
        if (arg0.field7821 == 0) {
            arg0.method3156(false, 126, 8192);
        }
        if (arg0.field7821 == 1) {
            arg0.method3156(false, 3, 12288);
        }
        if (arg0.field7821 == 2) {
            arg0.method3156(false, arg1 ^ 0xBDF0D763, 0);
        }
        if (arg0.field7821 == 3) {
            arg0.method3156(false, -78, 4096);
        }
        if (arg1 != 1108289672) {
            field2085 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(ZI)Z")
    public final boolean method963(boolean arg0, int arg1) {
        field2082++;
        return arg0 ? this.field2081[arg1].field2627 : false;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII)V")
    public static final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2078++;
        int var7 = class229.field3560;
        int[] var8 = class316.field4782;
        class23.field340 = 0;
        for (int var9 = 0; var9 < (class341.field5128 + var7); var9++) {
            class51 var32 = null;
            class535 var33;
            if (var7 <= var9) {
                var33 = ((class435) class209.field3337.method1622((long) class515.field7477[var9 - var7], 18)).field6471;
                var32 = ((class163) var33).field2613;
                if (var32.field1038 != null) {
                    var32 = var32.method475(class402.field6080, -1);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class73.field1444[var8[var9]];
            }
            if (var33.field7829 >= 0 && (class184.field2958 == var33.field7775 || class15.field266.field6084 == var33.field6084)) {
                class113.method936(var33, arg5, arg1 >> 1, arg0, var33.method1156((byte) -94), arg3 >> 1, true);
                if (class60.field1240[0] >= 0) {
                    if (var33.field7777 != null && (var7 <= var9 || class76.field1544 == 0 || class76.field1544 == 3 || class76.field1544 == 1 && class214.method1445(((class366) var33).field5381, 123)) && class23.field340 < class63.field1303) {
                        class63.field1297[class23.field340] = class272.field4126.method2808(var33.field7777, -82) / 2;
                        class63.field1295[class23.field340] = class60.field1240[0];
                        class63.field1298[class23.field340] = class60.field1240[1];
                        class63.field1304[class23.field340] = var33.field7811;
                        class63.field1300[class23.field340] = var33.field7779;
                        class63.field1305[class23.field340] = var33.field7766;
                        class63.field1293[class23.field340] = var33.field7777;
                        class23.field340++;
                    }
                    int var34 = arg6 + class60.field1240[1];
                    int var45;
                    if (var33.field7782 || class62.field1268 >= var33.field7818) {
                        var45 = var34 - Math.max(class272.field4126.field6972, class418.field6291[0].method154());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class366 var37 = class73.field1444[var8[var9]];
                            var38 = var33.method3169((byte) 23).field2643;
                            if (var37.field5354) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field1036;
                            if (var38 == -1) {
                                var38 = var33.method3169((byte) 23).field2643;
                            }
                        }
                        class24[] var39 = class418.field6291;
                        if (var38 != -1) {
                            class24[] var40 = (class24[]) class187.field2998.method2478(1, (long) var38);
                            if (var40 == null) {
                                class340[] var41 = class340.method2146(class455.field6758, var38, 0);
                                if (var41 != null) {
                                    var40 = new class24[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class262.field4006.method374(var41[var42], true);
                                    }
                                    class187.field2998.method2472(80, var40, (long) var38);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class24 var43 = var39[0];
                        class24 var44 = var39[var36];
                        var45 = var34 - Math.max(class272.field4126.field6972, var43.method154());
                        int var46 = class60.field1240[0] + arg2 - (var43.method157() >> 1);
                        int var47 = var43.method157() * var33.field7773 / 255;
                        if (var33.field7773 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method159(var46, var45);
                        class262.field4006.method344(var46, var45, var46 + var47, var43.method154() + var45);
                        var44.method159(var46, var45);
                        class262.field4006.method371(arg2, arg6, arg2 + arg3, arg1 + arg6);
                    }
                    var45 -= 2;
                    if (!var33.field7782) {
                        if (var33.field7817 > class62.field1268) {
                            class24 var48 = class219.field3449[var33.field7809 ? 2 : 0];
                            class24 var49 = class219.field3449[var33.field7809 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class163) {
                                var51 = var32.field1055;
                                if (var51 == -1) {
                                    var51 = var33.method3169((byte) 23).field2639;
                                }
                            } else {
                                var51 = var33.method3169((byte) 23).field2639;
                            }
                            if (var51 != -1) {
                                class24[] var52 = (class24[]) class491.field7197.method2478(1, (long) var51);
                                if (var52 == null) {
                                    class340[] var53 = class340.method2146(class455.field6758, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class24[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class262.field4006.method374(var53[var54], true);
                                        }
                                        class491.field7197.method2472(-67, var52, (long) var51);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field7809 ? 3 : 1];
                                    var48 = var52[var33.field7809 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field7817 - class62.field1268;
                            int var58;
                            if (var55 > var33.field7798) {
                                int var56 = var55 - var33.field7798;
                                int var57 = var33.field7833 == 0 ? 0 : (var33.field7801 - var56) / var33.field7833 * var33.field7833;
                                var58 = var48.method157() * var57 / var33.field7801;
                            } else {
                                var58 = var48.method157();
                            }
                            int var59 = var48.method154();
                            var45 -= var59;
                            int var60 = class60.field1240[0] + (arg2 - (var48.method157() >> 1));
                            var48.method159(var60, var45);
                            class262.field4006.method344(var60, var45, var58 + var60, var45 - -var59);
                            var49.method159(var60, var45);
                            var45 -= 2;
                            class262.field4006.method371(arg2, arg6, arg2 + arg3, arg1 + arg6);
                        }
                        if (var9 < var7) {
                            class366 var61 = (class366) var33;
                            if (var61.field5376 != -1) {
                                var45 -= 25;
                                class472.field6994[var61.field5376].method159(arg2 - (12 - class60.field1240[0]), var45);
                                var45 -= 2;
                            }
                            if (var61.field5359 != -1) {
                                var45 -= 25;
                                class86.field1767[var61.field5359].method159(arg2 - (12 - class60.field1240[0]), var45);
                                var45 -= 2;
                            }
                        } else if (var32.field1070 >= 0 && class86.field1767.length > var32.field1070) {
                            class24 var62 = class86.field1767[var32.field1070];
                            var45 -= 25;
                            var62.method159(class60.field1240[0] + arg2 - (var62.method157() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class366) {
                        int var69 = 0;
                        class481[] var70 = class139.field2328;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class481 var76 = var70[var71];
                            if (var76 != null && var76.field7094 == 1 && class515.field7477[var9 - var7] == var76.field7100) {
                                class24 var77 = class398.field6036[var76.field7098];
                                if (var69 < var77.method154()) {
                                    var69 = var77.method154();
                                }
                                if ((class62.field1268 % 20) < 10) {
                                    var77.method159(class60.field1240[0] + arg2 - 12, var45 + -var77.method154());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class481[] var64 = class139.field2328;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class481 var67 = var64[var65];
                            if (var67 != null && var67.field7094 == 10 && var8[var9] == var67.field7100) {
                                class24 var68 = class398.field6036[var67.field7098];
                                if (var68.method154() > var63) {
                                    var63 = var68.method154();
                                }
                                var68.method159(class60.field1240[0] + arg2 - 12, var45 + -var68.method154());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class62.field1268 < var33.field7769[var73]) {
                            int var74 = var33.method1156((byte) -87) / 2;
                            class113.method936(var33, arg5, arg1 >> 1, arg0, var74, arg3 >> 1, true);
                            if (class60.field1240[0] > -1) {
                                int var75 = class341.field5126[var33.field7847[var73]].method157();
                                if (var73 == 1) {
                                    class60.field1240[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class60.field1240[0] -= var75 - 9;
                                    class60.field1240[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class60.field1240[1] -= 10;
                                    class60.field1240[0] += var75 - 9;
                                }
                                class341.field5126[var33.field7847[var73]].method159(arg2 + class60.field1240[0] - (var75 >> 1), arg6 - -class60.field1240[1] - 12);
                                class276.field4179.method2010(arg2 + class60.field1240[0] - 1, Integer.toString(var33.field7840[var73]), -1, arg6 + class60.field1240[1] + 3, 0, 123);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class226.field3539; var10++) {
            int var28 = class344.field5141[var10];
            class535 var29;
            if (var28 < 2048) {
                var29 = class73.field1444[var28];
            } else {
                var29 = ((class435) class209.field3337.method1622((long) (var28 - 2048), 42)).field6471;
            }
            int var30 = class252.field3875[var10];
            class535 var31;
            if (var30 >= 2048) {
                var31 = ((class435) class209.field3337.method1622((long) (var30 - 2048), 84)).field6471;
            } else {
                var31 = class73.field1444[var30];
            }
            class59.method529(arg3, arg0, var29, arg1, (byte) 40, arg2, --var29.field7832, arg5, arg6, var31);
        }
        int var11 = class272.field4126.field6972 + class272.field4126.field6963 + 2;
        for (int var12 = 0; var12 < class23.field340; var12++) {
            int var13 = class63.field1295[var12];
            int var14 = class63.field1298[var12];
            int var15 = class63.field1297[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class63.field1298[var27] - var11) && var14 - var11 < class63.field1298[var27] + 2 && var13 - var15 < class63.field1297[var27] + class63.field1295[var27] && class63.field1295[var27] - class63.field1297[var27] < var13 + var15 && class63.field1298[var27] - var11 < var14) {
                        var14 = class63.field1298[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class63.field1298[var12] = var14;
            String var17 = class63.field1293[var12];
            if (class483.field7124 == 0) {
                int var18 = 16776960;
                if (class63.field1304[var12] < 6) {
                    var18 = class510.field7436[class63.field1304[var12]];
                }
                if (class63.field1304[var12] == 6) {
                    var18 = (class184.field2958 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class63.field1304[var12] == 7) {
                    var18 = (class184.field2958 % 20) < 10 ? 255 : 65535;
                }
                if (class63.field1304[var12] == 8) {
                    var18 = class184.field2958 % 20 < 10 ? 45056 : 8454016;
                }
                if (class63.field1304[var12] == 9) {
                    int var19 = 150 - class63.field1305[var12];
                    if (var19 < 50) {
                        var18 = (var19 * 1280) + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 65280 - 500;
                    }
                }
                if (class63.field1304[var12] == 10) {
                    int var20 = 150 - class63.field1305[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = ((var20 * 327680) + 255) + 500 - var20 * 5 - 32768000;
                    }
                }
                if (class63.field1304[var12] == 11) {
                    int var21 = 150 - class63.field1305[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = (var21 * 327685) + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class63.field1300[var12] == 0) {
                    class356.field5232.method2010(arg2 + var13, var17, var22, arg6 + var14, -16777216, 56);
                }
                if (class63.field1300[var12] == 1) {
                    class356.field5232.method2004(-7094, class184.field2958, arg6 + var14, var22, arg2 + var13, var17, -16777216);
                }
                if (class63.field1300[var12] == 2) {
                    class356.field5232.method2001(class184.field2958, var17, arg6 + var14, var22, arg2 + var13, -16777216, true);
                }
                if (class63.field1300[var12] == 3) {
                    class356.field5232.method2006(arg6 + var14, arg2 + var13, var22, var17, class184.field2958, -3, 150 - class63.field1305[var12], -16777216);
                }
                if (class63.field1300[var12] == 4) {
                    int var23 = (150 - class63.field1305[var12]) * (class272.field4126.method2808(var17, -102) + 100) / 150;
                    class262.field4006.method344(var13 + arg2 - 50, arg6, arg2 + var13 + 50, arg1 + arg6);
                    class356.field5232.method2017(arg2 + var13 + 50 - var23, var22, -16777216, (byte) -72, arg6 + var14, var17);
                    class262.field4006.method371(arg2, arg6, arg2 + arg3, arg1 + arg6);
                }
                if (class63.field1300[var12] == 5) {
                    int var24 = 150 - class63.field1305[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class272.field4126.field6972 + class272.field4126.field6963;
                    class262.field4006.method344(arg2, arg6 + var14 - var26 - 1, arg2 + arg3, arg6 + var14 + 5);
                    class356.field5232.method2010(arg2 + var13, var17, var22, var14 + var25 + arg6, -16777216, 91);
                    class262.field4006.method371(arg2, arg6, arg2 + arg3, arg1 + arg6);
                }
            } else {
                class356.field5232.method2010(arg2 + var13, var17, -256, arg6 + var14, -16777216, 67);
            }
        }
        if (arg4 >= -102) {
            field2088 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
    public class119(int arg0) {
        this.field2090 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static final void method965(int arg0) {
        if (class464.method2779(class466.field6932, true) || class332.method2097((byte) -120, class466.field6932)) {
            class194.method1313(class432.field6435 >> 10, class509.field7427 >> 10, 5000, -1);
        } else {
            int var1 = class15.field266.field7866[0] >> 3;
            int var2 = class15.field266.field7870[0] >> 3;
            if (var1 >= 0 && var1 < class339.field5099 >> 3 && var2 >= 0 && var2 < (class484.field7129 >> 3)) {
                class194.method1313(var2, var1, 5000, -1);
            } else {
                class194.method1313(class484.field7129 >> 4, class339.field5099 >> 4, 0, arg0 - 3444);
            }
        }
        field2087++;
        class100.method891(126);
        class75.method675((byte) 65);
        class533.method3141((byte) -127);
        if (arg0 != 3443) {
            method957(false);
        }
        class491.method2965(14968);
    }

    static {
        new class309(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    }
}
