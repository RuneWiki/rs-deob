import java.awt.Image;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class167 extends class12 {

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "[Lpc;")
    public class167[] field3029;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Z")
    public boolean field3009;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Lkh;")
    public static class117 field3020 = class224.method1450((byte) 17, "Spieler");

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "Z")
    public static boolean field3021 = false;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "Loh;")
    public class161 field3022;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Lug;")
    public class226 field3013;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Ljava/awt/Image;")
    public static Image field3010;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "[I")
    public static int[] field3016;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "[[I")
    public static int[][] field3030;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)[[I")
    public final int[][] method1180(int arg0, int arg1, int arg2) {
        if (arg1 != 26851) {
            field3030 = null;
        }
        field3018++;
        if (!this.field3029[arg2].field3009) {
            return this.field3029[arg2].method116(arg0, arg1 - 36030);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field3029[arg2].method53((byte) -96, arg0);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method1181(int arg0) {
        field3030 = null;
        if (arg0 == -32492) {
            field3010 = null;
            field3020 = null;
            field3016 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public void method262(int arg0) {
        field3028++;
        int var2 = -91 / ((-arg0 - 18) / 59);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I")
    public int method523(int arg0) {
        if (arg0 != 21556) {
            method1182((byte) -75, -71L);
        }
        field3032++;
        return -1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)[I")
    public int[] method53(byte arg0, int arg1) {
        field3026++;
        if (arg0 == -96) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)Lkh;")
    public static final class117 method1182(byte arg0, long arg1) {
        class216.field3918.setTime(new Date(arg1));
        field3027++;
        int var3 = class216.field3918.get(7);
        int var4 = class216.field3918.get(5);
        if (arg0 <= 21) {
            method1187(-56, null, 78, 74);
        }
        int var5 = class216.field3918.get(2);
        int var6 = class216.field3918.get(1);
        int var7 = class216.field3918.get(11);
        int var8 = class216.field3918.get(12);
        int var9 = class216.field3918.get(13);
        return class36.method316((byte) -34, new class117[] { class81.field1519[var3 - 1], class221.field3989, class42.method358(var4 / 10, (byte) 34), class42.method358(var4 % 10, (byte) 34), class57.field1187, class69.field1320[var5], class57.field1187, class42.method358(var6, (byte) 34), class93.field1708, class42.method358(var7 / 10, (byte) 34), class42.method358(var7 % 10, (byte) 34), class37.field861, class42.method358(var8 / 10, (byte) 34), class42.method358(var8 % 10, (byte) 34), class37.field861, class42.method358(var9 / 10, (byte) 34), class42.method358(var9 % 10, (byte) 34), class92.field1689 });
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III[Lah;IIIIII)V")
    public static final void method1183(int arg0, int arg1, int arg2, class9[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class83.method575(arg6, arg8, arg2, arg0);
        class89.method614();
        int var10 = 0;
        if (arg4 != 420588875) {
            return;
        }
        while (var10 < arg3.length) {
            class9 var11 = arg3[var10];
            if (var11 != null && (var11.field175 == arg5 || arg5 == -1412584499 && class67.field1290 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class7.field114[class139.field2530] = var11.field283 + arg1;
                    class36.field843[class139.field2530] = var11.field227 + arg7;
                    class1.field7[class139.field2530] = var11.field256;
                    class100.field1834[class139.field2530] = var11.field207;
                    var12 = class139.field2530++;
                } else {
                    var12 = arg9;
                }
                var11.field297 = class44.field966;
                var11.field204 = var12;
                if (!var11.field249 || !class148.method1060(var11, (byte) -122)) {
                    label781: {
                        if (var11.field244 > 0) {
                            class49.method387(var11, (byte) -95);
                        }
                        int var13 = var11.field203;
                        int var14 = var11.field283 + arg1;
                        int var15 = var11.field227 + arg7;
                        if (class103.field1882 && (class187.method1269(var11, (byte) 16) != 0 || var11.field225 == 0) && var13 > 127) {
                            var13 = 127;
                        }
                        if (class67.field1290 == var11) {
                            if (arg5 != -1412584499 && !var11.field243) {
                                class75.field1431 = arg1;
                                class223.field4023 = arg3;
                                class170.field3054 = arg7;
                                break label781;
                            }
                            if (class39.field893 && class143.field2599) {
                                int var16 = class137.field2479;
                                int var17 = var16 - class32.field757;
                                if (var17 < class213.field3874) {
                                    var17 = class213.field3874;
                                }
                                int var18 = class199.field3571;
                                int var19 = var18 - class207.field3710;
                                if (var19 < class92.field1695) {
                                    var19 = class92.field1695;
                                }
                                if (class213.field3874 + class93.field1700.field256 < var17 - -var11.field256) {
                                    var17 = class213.field3874 + class93.field1700.field256 - var11.field256;
                                }
                                var14 = var17;
                                if (class92.field1695 + class93.field1700.field207 < var11.field207 + var19) {
                                    var19 = class92.field1695 + class93.field1700.field207 - var11.field207;
                                }
                                var15 = var19;
                            }
                            if (!var11.field243) {
                                var13 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field225 == 2) {
                            var20 = arg6;
                            var21 = arg2;
                            var22 = arg8;
                            var23 = arg0;
                        } else {
                            var20 = var14 > arg6 ? var14 : arg6;
                            int var24 = var11.field256 + var14;
                            var22 = var15 <= arg8 ? arg8 : var15;
                            int var25 = var15 + var11.field207;
                            if (var11.field225 == 9) {
                                var25++;
                                var24++;
                            }
                            var21 = arg2 > var24 ? var24 : arg2;
                            var23 = var25 >= arg0 ? arg0 : var25;
                        }
                        if (!var11.field249 || var21 > var20 && var22 < var23) {
                            label786: {
                                if (var11.field244 != 0) {
                                    if (var11.field244 == 1337) {
                                        class33.field764 = var14;
                                        class38.field866 = var15;
                                        class54.method416(var15, var11.field207, (byte) 43, var11.field256, var14);
                                        class83.method575(arg6, arg8, arg2, arg0);
                                        break label786;
                                    }
                                    if (var11.field244 == 1338) {
                                        if (var11.method75(0)) {
                                            class74.method520(var14, var15, var12, -46, var11);
                                            class83.method575(arg6, arg8, arg2, arg0);
                                        }
                                        break label786;
                                    }
                                    if (var11.field244 == 1339) {
                                        if (var11.method75(0)) {
                                            class67.method475(var14, var15, var11, -4, var12);
                                            class83.method575(arg6, arg8, arg2, arg0);
                                        }
                                        break label786;
                                    }
                                    if (var11.field244 == 1400) {
                                        class215.method1413((byte) -118, var11.field256, var11.field207, var15, var14);
                                        class173.field3126[var12] = true;
                                        class51.field1058[var12] = true;
                                        class83.method575(arg6, arg8, arg2, arg0);
                                        break label786;
                                    }
                                    if (var11.field244 == 1401) {
                                        class204.method1358(var15, var14, var11.field207, (byte) 110, var11.field256);
                                        class173.field3126[var12] = true;
                                        class51.field1058[var12] = true;
                                        class83.method575(arg6, arg8, arg2, arg0);
                                        break label786;
                                    }
                                }
                                int var26 = class199.field3571;
                                int var27 = class137.field2479;
                                if (var11.field225 == 0 && var11.field281 && var20 <= class137.field2479 && var22 <= class199.field3571 && class137.field2479 < var21 && var23 > class199.field3571 && !class182.field3289 && !class103.field1882) {
                                    class194.field3462[0] = 1004;
                                    class25.field612[0] = class208.field3737;
                                    class100.field1825 = 1;
                                    class56.field1160[0] = class169.field3042;
                                }
                                if (!class182.field3289 && var27 >= var20 && var22 <= var26 && var21 > var27 && var26 < var23) {
                                    class154.method1099((byte) 125, var27 - var14, var11, var26 - var15);
                                }
                                if (var11.field225 == 0) {
                                    if (!var11.field249 && class148.method1060(var11, (byte) 93) && class196.field3500 != var11) {
                                        break label786;
                                    }
                                    if (!var11.field249) {
                                        if (var11.field294 - var11.field207 < var11.field247) {
                                            var11.field247 = var11.field294 - var11.field207;
                                        }
                                        if (var11.field247 < 0) {
                                            var11.field247 = 0;
                                        }
                                    }
                                    method1183(var23, var14 - var11.field255, var21, arg3, 420588875, var11.field218, var20, var15 - var11.field247, var22, var12);
                                    if (var11.field157 != null) {
                                        method1183(var23, var14 - var11.field255, var21, var11.field157, 420588875, var11.field218, var20, var15 - var11.field247, var22, var12);
                                    }
                                    class73 var28 = (class73) class11.field371.method460((long) var11.field218, 1);
                                    if (var28 != null) {
                                        if (var28.field1398 == 0 && class137.field2479 >= var20 && class199.field3571 >= var22 && var21 > class137.field2479 && var23 > class199.field3571 && !class182.field3289 && !class103.field1882) {
                                            class100.field1825 = 1;
                                            class25.field612[0] = class208.field3737;
                                            class194.field3462[0] = 1004;
                                            class56.field1160[0] = class169.field3042;
                                        }
                                        class226.method1469(var22, var21, var23, var20, var15, (byte) 65, var14, var28.field1397, var12);
                                    }
                                    class83.method575(arg6, arg8, arg2, arg0);
                                    class89.method614();
                                }
                                if (class17.field498[var12] || class93.field1711 > 1) {
                                    if (var11.field225 == 0 && !var11.field249 && var11.field294 > var11.field207) {
                                        class161.method1143(var15, var11.field207, arg4 ^ 0x1911AD24, var11.field294, var11.field247, var14 + var11.field256);
                                    }
                                    if (var11.field225 != 1) {
                                        if (var11.field225 == 2) {
                                            int var29 = 0;
                                            for (int var30 = 0; var30 < var11.field304; var30++) {
                                                for (int var31 = 0; var31 < var11.field222; var31++) {
                                                    int var32 = (var11.field234 + 32) * var31 + var14;
                                                    int var33 = (var11.field275 + 32) * var30 + var15;
                                                    if (var29 < 20) {
                                                        var33 += var11.field295[var29];
                                                        var32 += var11.field284[var29];
                                                    }
                                                    if (var11.field224[var29] > 0) {
                                                        boolean var35 = false;
                                                        boolean var36 = false;
                                                        int var37 = var11.field224[var29] - 1;
                                                        if (var32 + 32 > arg6 && var32 < arg2 && var33 + 32 > arg8 && arg0 > var33 || class19.field537 == var11 && class30.field713 == var29) {
                                                            class31 var38;
                                                            if (class86.field1623 == 1 && class184.field3309 == var29 && class60.field1206 == var11.field218) {
                                                                var38 = class155.method1107(var11.field189[var29], var11.field286, -666512666, 0, 2, var37);
                                                            } else {
                                                                var38 = class155.method1107(var11.field189[var29], var11.field286, arg4 ^ 0xC1547FAD, 3153952, 1, var37);
                                                            }
                                                            if (class89.field1659) {
                                                                class173.field3126[var12] = true;
                                                            }
                                                            if (var38 == null) {
                                                                class62.method457(var11, 0);
                                                            } else if (class19.field537 == var11 && class30.field713 == var29) {
                                                                int var39 = class137.field2479 - class40.field908;
                                                                if (var39 < 5 && var39 > -5) {
                                                                    var39 = 0;
                                                                }
                                                                int var40 = class199.field3571 - class130.field2396;
                                                                if (var40 < 5 && var40 > -5) {
                                                                    var40 = 0;
                                                                }
                                                                if (class74.field1404 < 5) {
                                                                    var40 = 0;
                                                                    var39 = 0;
                                                                }
                                                                var38.method270(var32 + var39, var33 + var40, 128);
                                                                if (arg5 != -1) {
                                                                    class9 var41 = arg3[arg5 & 0xFFFF];
                                                                    int var42 = class83.field1563;
                                                                    int var43 = class83.field1566;
                                                                    if (var33 + var40 < var43 && var41.field247 > 0) {
                                                                        int var44 = (var43 - var33 - var40) * class28.field691 / 3;
                                                                        if (class28.field691 * 10 < var44) {
                                                                            var44 = class28.field691 * 10;
                                                                        }
                                                                        if (var41.field247 < var44) {
                                                                            var44 = var41.field247;
                                                                        }
                                                                        class130.field2396 += var44;
                                                                        var41.field247 -= var44;
                                                                        class62.method457(var41, arg4 - 420588875);
                                                                    }
                                                                    if (var33 + var40 + 32 > var42 && var41.field247 < var41.field294 - var41.field207) {
                                                                        int var45 = (var33 + var40 + 32 - var42) * class28.field691 / 3;
                                                                        if (var45 > class28.field691 * 10) {
                                                                            var45 = class28.field691 * 10;
                                                                        }
                                                                        if (var41.field294 - var41.field207 - var41.field247 < var45) {
                                                                            var45 = var41.field294 - var41.field207 - var41.field247;
                                                                        }
                                                                        var41.field247 += var45;
                                                                        class130.field2396 -= var45;
                                                                        class62.method457(var41, 0);
                                                                    }
                                                                }
                                                            } else if (class115.field2141 == var11 && class166.field2999 == var29) {
                                                                var38.method270(var32, var33, 128);
                                                            } else {
                                                                var38.method273(var32, var33);
                                                            }
                                                        }
                                                    } else if (var11.field193 != null && var29 < 20) {
                                                        class31 var34 = var11.method64(var29, 0);
                                                        if (var34 != null) {
                                                            var34.method273(var32, var33);
                                                        } else if (class101.field1851) {
                                                            class62.method457(var11, 0);
                                                        }
                                                    }
                                                    var29++;
                                                }
                                            }
                                        } else if (var11.field225 == 3) {
                                            int var46;
                                            if (class4.method34(2, var11)) {
                                                var46 = var11.field192;
                                                if (class196.field3500 == var11 && var11.field174 != 0) {
                                                    var46 = var11.field174;
                                                }
                                            } else {
                                                var46 = var11.field149;
                                                if (class196.field3500 == var11 && var11.field254 != 0) {
                                                    var46 = var11.field254;
                                                }
                                            }
                                            if (var13 == 0) {
                                                if (var11.field242) {
                                                    class83.method579(var14, var15, var11.field256, var11.field207, var46);
                                                } else {
                                                    class83.method586(var14, var15, var11.field256, var11.field207, var46);
                                                }
                                            } else if (var11.field242) {
                                                class83.method580(var14, var15, var11.field256, var11.field207, var46, 256 - (var13 & 0xFF));
                                            } else {
                                                class83.method585(var14, var15, var11.field256, var11.field207, var46, 256 - (var13 & 0xFF));
                                            }
                                        } else if (var11.field225 == 4) {
                                            class138 var47 = var11.method70(class120.field2267, -1);
                                            if (var47 != null) {
                                                class117 var48 = var11.field162;
                                                int var49;
                                                if (class4.method34(2, var11)) {
                                                    var49 = var11.field192;
                                                    if (class196.field3500 == var11 && var11.field174 != 0) {
                                                        var49 = var11.field174;
                                                    }
                                                    if (var11.field282.method819((byte) -100) > 0) {
                                                        var48 = var11.field282;
                                                    }
                                                } else {
                                                    var49 = var11.field149;
                                                    if (class196.field3500 == var11 && var11.field254 != 0) {
                                                        var49 = var11.field254;
                                                    }
                                                }
                                                if (var11.field249 && var11.field158 != -1) {
                                                    class154 var50 = class214.method1408((byte) 102, var11.field158);
                                                    var48 = var50.field2812;
                                                    if (var48 == null) {
                                                        var48 = class179.field3248;
                                                    }
                                                    if ((var50.field2806 == 1 || var11.field151 != 1) && var11.field151 != -1) {
                                                        var48 = class36.method316((byte) -34, new class117[] { class237.field4287, var48, class210.field3768, class203.method1351(74250408, var11.field151) });
                                                    }
                                                }
                                                if (class191.field3407 == var11) {
                                                    var49 = var11.field149;
                                                    var48 = class246.field4528;
                                                }
                                                if (!var11.field249) {
                                                    var48 = class119.method840((byte) 114, var48, var11);
                                                }
                                                var47.method919(var48, var14, var15, var11.field256, var11.field207, var49, var11.field288 ? 0 : -1, var11.field261, var11.field216, var11.field212);
                                            } else if (class101.field1851) {
                                                class62.method457(var11, 0);
                                            }
                                        } else if (var11.field225 == 5) {
                                            if (var11.field249) {
                                                class31 var51;
                                                if (var11.field158 == -1) {
                                                    var51 = var11.method69(-23845, false);
                                                } else {
                                                    var51 = class155.method1107(var11.field151, var11.field286, -666512666, var11.field274, var11.field194, var11.field158);
                                                }
                                                if (var51 != null) {
                                                    int var52 = var51.field736;
                                                    int var53 = var51.field727;
                                                    if (var11.field188) {
                                                        int var55 = (var11.field256 + var52 - 1) / var52;
                                                        int var56 = (var53 + var11.field207 - 1) / var53;
                                                        class83.method570(var14, var15, var11.field256 + var14, var11.field207 + var15);
                                                        int var57 = 0;
                                                        while (true) {
                                                            if (var57 >= var55) {
                                                                class83.method575(arg6, arg8, arg2, arg0);
                                                                break;
                                                            }
                                                            for (int var58 = 0; var58 < var56; var58++) {
                                                                if (var11.field219 != 0) {
                                                                    var51.method272(var11.field219, true, 4096, var14 + var52 / 2 + var52 * var57, var53 / 2 + var53 * var58 + var15);
                                                                } else if (var13 == 0) {
                                                                    var51.method273(var52 * var57 + var14, var53 * var58 + var15);
                                                                } else {
                                                                    var51.method270(var52 * var57 + var14, var53 * var58 + var15, 256 - (var13 & 0xFF));
                                                                }
                                                            }
                                                            var57++;
                                                        }
                                                    } else {
                                                        int var54 = var11.field256 * 4096 / var52;
                                                        if (var11.field219 != 0) {
                                                            var51.method272(var11.field219, true, var54, var11.field256 / 2 + var14, var11.field207 / 2 + var15);
                                                        } else if (var13 != 0) {
                                                            var51.method268(var14, var15, var11.field256, var11.field207, 256 - (var13 & 0xFF));
                                                        } else if (var11.field256 == var52 && var11.field207 == var53) {
                                                            var51.method273(var14, var15);
                                                        } else {
                                                            var51.method267(var14, var15, var11.field256, var11.field207);
                                                        }
                                                    }
                                                } else if (class101.field1851) {
                                                    class62.method457(var11, 0);
                                                }
                                            } else {
                                                class31 var59 = var11.method69(-23845, class4.method34(2, var11));
                                                if (var59 != null) {
                                                    var59.method273(var14, var15);
                                                } else if (class101.field1851) {
                                                    class62.method457(var11, arg4 - 420588875);
                                                }
                                            }
                                        } else if (var11.field225 == 6) {
                                            boolean var60 = class4.method34(2, var11);
                                            int var61;
                                            if (var60) {
                                                var61 = var11.field196;
                                            } else {
                                                var61 = var11.field291;
                                            }
                                            class29 var62 = null;
                                            int var63 = 0;
                                            if (var11.field158 != -1) {
                                                class154 var68 = class214.method1408((byte) 102, var11.field158);
                                                if (var68 != null) {
                                                    class154 var69 = var68.method1102(var11.field151, (byte) 62);
                                                    var62 = var69.method1097(1, 112, 0, null);
                                                    if (var62 == null) {
                                                        class62.method457(var11, arg4 ^ 0x1911AD4B);
                                                    } else {
                                                        var63 = -var62.method134() / 2;
                                                    }
                                                }
                                            } else if (var11.field245 == 5) {
                                                if (var11.field235 == -1) {
                                                    var62 = class10.field364.method665(null, -1, -1, null, -105);
                                                } else {
                                                    int var65 = var11.field235 & 0x7FF;
                                                    if (class72.field1387 == var65) {
                                                        var65 = 2047;
                                                    }
                                                    class56 var66 = class43.field950[var65];
                                                    class174 var67 = var61 == -1 ? null : class81.method555(var61, (byte) -81);
                                                    if (var66 != null && (int) var66.field1141.method813((byte) 93) << 11 == (var11.field235 & 0xFFFFF800)) {
                                                        var62 = var66.field1143.method665(var67, var11.field299, 0, null, -126);
                                                    }
                                                }
                                            } else if (var61 == -1) {
                                                var62 = var11.method73(class93.field1712.field1143, null, (byte) 62, -1, var60);
                                                if (var62 == null && class101.field1851) {
                                                    class62.method457(var11, arg4 - 420588875);
                                                }
                                            } else {
                                                class174 var64 = class81.method555(var61, (byte) -80);
                                                var62 = var11.method73(class93.field1712.field1143, var64, (byte) 68, var11.field299, var60);
                                                if (var62 == null && class101.field1851) {
                                                    class62.method457(var11, 0);
                                                }
                                            }
                                            if (var62 != null) {
                                                int var70;
                                                if (var11.field179 <= 0) {
                                                    var70 = 256;
                                                } else {
                                                    var70 = (var11.field256 << 8) / var11.field179;
                                                }
                                                int var71;
                                                if (var11.field226 > 0) {
                                                    var71 = (var11.field207 << 8) / var11.field226;
                                                } else {
                                                    var71 = 256;
                                                }
                                                int var72 = (var11.field191 * var70 >> 8) + var11.field256 / 2 + var14;
                                                int var73 = (var11.field298 * var71 >> 8) + var11.field207 / 2 + var15;
                                                class89.method625(var72, var73);
                                                int var74 = class89.field1650[var11.field229] * var11.field195 >> 16;
                                                int var75 = class89.field1646[var11.field229] * var11.field195 >> 16;
                                                if (!var11.field249) {
                                                    var62.method261(0, var11.field209, 0, var11.field229, 0, var74, var75);
                                                } else if (var11.field233) {
                                                    ((class107) var62).method724(0, var11.field209, var11.field293, var11.field229, var11.field202, var63 + var74 + var11.field150, var11.field150 + var75, var11.field195);
                                                } else {
                                                    var62.method261(0, var11.field209, var11.field293, var11.field229, var11.field202, var63 + var74 + var11.field150, var11.field150 + var75);
                                                }
                                                class89.method617();
                                            }
                                        } else {
                                            label770: {
                                                if (var11.field225 == 7) {
                                                    class138 var76 = var11.method70(class120.field2267, -1);
                                                    if (var76 == null) {
                                                        if (class101.field1851) {
                                                            class62.method457(var11, 0);
                                                        }
                                                        break label770;
                                                    }
                                                    int var77 = 0;
                                                    for (int var78 = 0; var78 < var11.field304; var78++) {
                                                        for (int var79 = 0; var79 < var11.field222; var79++) {
                                                            if (var11.field224[var77] > 0) {
                                                                class154 var80 = class214.method1408((byte) 102, var11.field224[var77] - 1);
                                                                class117 var81;
                                                                if (var80.field2806 != 1 && var11.field189[var77] == 1) {
                                                                    var81 = class36.method316((byte) -34, new class117[] { class237.field4287, var80.field2812, class201.field3652 });
                                                                } else {
                                                                    var81 = class36.method316((byte) -34, new class117[] { class237.field4287, var80.field2812, class210.field3768, class203.method1351(arg4 - 346338467, var11.field189[var77]) });
                                                                }
                                                                int var82 = var14 + (var11.field234 + 115) * var79;
                                                                int var83 = var15 + (var11.field275 + 12) * var78;
                                                                if (var11.field261 == 0) {
                                                                    var76.method938(var81, var82, var83, var11.field149, var11.field288 ? 0 : -1);
                                                                } else if (var11.field261 == 1) {
                                                                    var76.method935(var81, var82 + 57, var83, var11.field149, var11.field288 ? 0 : -1);
                                                                } else {
                                                                    var76.method929(var81, var82 + 115 - 1, var83, var11.field149, var11.field288 ? 0 : -1);
                                                                }
                                                            }
                                                            var77++;
                                                        }
                                                    }
                                                }
                                                if (var11.field225 == 8 && class28.field685 == var11 && class8.field138 == class165.field2987) {
                                                    int var84 = 0;
                                                    int var85 = 0;
                                                    class138 var86 = class53.field1081;
                                                    class117 var87 = var11.field162;
                                                    class117 var88 = class119.method840((byte) -42, var87, var11);
                                                    while (var88.method819((byte) -125) > 0) {
                                                        int var96 = var88.method799(class225.field4054, 0);
                                                        class117 var97;
                                                        if (var96 == -1) {
                                                            var97 = var88;
                                                            var88 = class169.field3042;
                                                        } else {
                                                            var97 = var88.method781(true, 0, var96);
                                                            var88 = var88.method802(var96 + 4, arg4 + 756230871);
                                                        }
                                                        int var98 = var86.method928(var97);
                                                        if (var84 < var98) {
                                                            var84 = var98;
                                                        }
                                                        var85 += var86.field2526 + 1;
                                                    }
                                                    var85 += 7;
                                                    var84 += 6;
                                                    int var89 = var11.field207 + var15 + 5;
                                                    int var90 = var11.field256 + var14 - var84 - 5;
                                                    if (var89 + var85 > arg0) {
                                                        var89 = arg0 - var85;
                                                    }
                                                    if (var90 < var14 + 5) {
                                                        var90 = var14 + 5;
                                                    }
                                                    if (var90 + var84 > arg2) {
                                                        var90 = arg2 - var84;
                                                    }
                                                    class83.method579(var90, var89, var84, var85, 16777120);
                                                    class83.method586(var90, var89, var84, var85, 0);
                                                    class117 var91 = var11.field162;
                                                    int var92 = var89 + var86.field2526 + 2;
                                                    class117 var93 = class119.method840((byte) 115, var91, var11);
                                                    while (var93.method819((byte) -86) > 0) {
                                                        int var94 = var93.method799(class225.field4054, arg4 ^ 0x1911AD4B);
                                                        class117 var95;
                                                        if (var94 == -1) {
                                                            var95 = var93;
                                                            var93 = class169.field3042;
                                                        } else {
                                                            var95 = var93.method781(true, 0, var94);
                                                            var93 = var93.method802(var94 + 4, 1176819746);
                                                        }
                                                        var86.method938(var95, var90 + 3, var92, 0, -1);
                                                        var92 += var86.field2526 + 1;
                                                    }
                                                }
                                                if (var11.field225 == 9) {
                                                    int var99;
                                                    int var100;
                                                    int var101;
                                                    int var102;
                                                    if (var11.field257) {
                                                        var99 = var14 + var11.field256;
                                                        var100 = var14;
                                                        var101 = var15;
                                                        var102 = var15 + var11.field207;
                                                    } else {
                                                        var100 = var14;
                                                        var99 = var11.field256 + var14;
                                                        var101 = var11.field207 + var15;
                                                        var102 = var15;
                                                    }
                                                    if (var11.field303 == 1) {
                                                        class83.method567(var100, var102, var99, var101, var11.field149);
                                                    } else {
                                                        class83.method572(var100, var102, var99, var101, var11.field149, var11.field303);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
        field3019++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)V")
    public final void method1184(int arg0, byte arg1, int arg2) {
        field3015++;
        int var4 = this.field3031 == 255 ? arg2 : this.field3031;
        if (this.field3009) {
            this.field3013 = new class226(var4, arg2, arg0);
        } else {
            this.field3022 = new class161(var4, arg2, arg0);
        }
        if (arg1 != 45) {
            field3016 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public void method525(int arg0) {
        if (this.field3009) {
            this.field3013.method1466(21744);
            this.field3013 = null;
        } else {
            this.field3022.method1146(arg0 + 128);
            this.field3022 = null;
        }
        if (arg0 != -1) {
            field3030 = null;
        }
        field3008++;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)I")
    public int method701(byte arg0) {
        int var2 = 124 % ((14 - arg0) / 60);
        field3012++;
        return -1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lai;III)[Lo;")
    public static final class153[] method1185(class10 arg0, int arg1, int arg2, int arg3) {
        field3017++;
        if (arg1 == -1) {
            return class96.method654(arg2, arg1 ^ 0x86D, arg3, arg0) ? class115.method768(arg1 + 77) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[[I")
    public int[][] method116(int arg0, int arg1) {
        field3014++;
        if (arg1 != -9179) {
            this.method523(-46);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lnc;ZI)V")
    public void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1181(112);
        }
        field3023++;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)[I")
    public final int[] method1186(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method116(67, -62);
        }
        field3025++;
        return this.field3029[arg2].field3009 ? this.field3029[arg2].method53((byte) -96, arg0) : this.field3029[arg2].method116(arg0, arg1 - 9179)[0];
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILai;II)Lr;")
    public static final class186 method1187(int arg0, class10 arg1, int arg2, int arg3) {
        field3011++;
        if (arg0 == 0) {
            return class96.method654(arg3, -2158, arg2, arg1) ? class98.method667((byte) 127) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1188(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = -64 / ((arg4 + 41) / 50);
        field3024++;
        int var7 = arg1 - arg3;
        int var8 = arg2 - arg0;
        if (var7 == 0) {
            if (var8 != 0) {
                class223.method1445((byte) 88, arg0, arg5, arg3, arg2);
            }
        } else if (var8 == 0) {
            class28.method237((byte) -80, arg3, arg0, arg5, arg1);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var8 < 0) {
                var8 = -var8;
            }
            boolean var9 = var8 > var7;
            if (var9) {
                int var10 = arg3;
                arg3 = arg0;
                int var11 = arg1;
                arg1 = arg2;
                arg0 = var10;
                arg2 = var11;
            }
            if (arg1 < arg3) {
                int var12 = arg3;
                arg3 = arg1;
                arg1 = var12;
                int var13 = arg0;
                arg0 = arg2;
                arg2 = var13;
            }
            int var14 = arg0;
            int var15 = arg1 - arg3;
            int var16 = arg2 - arg0;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg2 <= arg0 ? -1 : 1;
            int var18 = -(var15 >> 1);
            if (var9) {
                for (int var19 = arg3; var19 <= arg1; var19++) {
                    var18 += var16;
                    field3030[var19][var14] = arg5;
                    if (var18 > 0) {
                        var14 += var17;
                        var18 -= var15;
                    }
                }
            } else {
                for (int var20 = arg3; var20 <= arg1; var20++) {
                    var18 += var16;
                    field3030[var14][var20] = arg5;
                    if (var18 > 0) {
                        var18 -= var15;
                        var14 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IZ)V")
    public class167(int arg0, boolean arg1) {
        this.field3029 = new class167[arg0];
        this.field3009 = arg1;
    }
}
