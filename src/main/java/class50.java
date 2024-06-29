import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 {

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lu;")
    public static class135 field1189 = class87.method676((byte) -65, "mapscene");

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lu;")
    public static class135 field1192 = class87.method676((byte) -95, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lu;")
    public static class135 field1197 = class87.method676((byte) -95, "sideicons");

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lu;")
    public static class135 field1184 = class87.method676((byte) -65, "(U2");

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lu;")
    public static class135 field1198 = class87.method676((byte) -57, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[B")
    public static byte[] field1191 = new byte[520];

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lu;")
    public static class135 field1201 = class87.method676((byte) -81, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Lu;")
    public class135 field1200;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Ljava/awt/Image;")
    public static Image field1196;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Z")
    public boolean field1185;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
    public static int[] field1188;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[Lbc;")
    public static class11[] field1177;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[Lae;")
    public static class6[] field1180;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILu;Lic;)I")
    public static final int method372(int arg0, class135 arg1, class59 arg2) {
        field1193++;
        int var3 = arg2.field1485;
        arg2.method487((byte) 127, arg1.field3255);
        if (arg0 > -11) {
            field1184 = null;
        }
        arg2.field1485 += class124.field2973.method371(arg1.field3266, 0, arg2.field1495, arg1.field3255, arg2.field1485, -1);
        return arg2.field1485 - var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method373(int arg0) {
        field1199++;
        try {
            int var1 = 26 / ((arg0 + 43) / 38);
            if (class12.field290 == 1) {
                int var2 = class17.field380.method1155(-16138);
                if (var2 > 0 && class17.field380.method1140(-101)) {
                    int var3 = var2 - class87.field2075;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class17.field380.method1157(1, var3);
                } else {
                    class17.field380.method1147((byte) 122);
                    class17.field380.method1151(31441);
                    class39.field891 = null;
                    class129.field3102 = null;
                    if (class76.field1804 == null) {
                        class12.field290 = 0;
                    } else {
                        class12.field290 = 2;
                    }
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class17.field380.method1147((byte) 117);
            class12.field290 = 0;
            class129.field3102 = null;
            class39.field891 = null;
            class76.field1804 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static void method374(int arg0) {
        field1177 = null;
        if (arg0 > -15) {
            method374(93);
        }
        field1197 = null;
        field1198 = null;
        field1191 = null;
        field1192 = null;
        field1201 = null;
        field1189 = null;
        field1196 = null;
        field1180 = null;
        field1184 = null;
        field1188 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Lcc;")
    public static final class18 method375(byte arg0) {
        if (arg0 != -26) {
            method374(50);
        }
        field1195++;
        class18 var1 = new class18(class107.field2567, class86.field2061, client.field533, class69.field1696, class29.field699);
        class43.method320(44);
        return var1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILsd;IIIILob;)V")
    public static final void method376(int arg0, int arg1, int arg2, int arg3, class127 arg4, int arg5, int arg6, int arg7, int arg8, class99 arg9) {
        field1178++;
        int var10 = class68.field1682[arg8][arg2][arg3];
        int var11 = class68.field1682[arg8][arg2 + 1][arg3];
        int var12 = class68.field1682[arg8][arg2 + 1][arg3 + 1];
        int var13 = class68.field1682[arg8][arg2][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        int var15 = (arg3 << 7) + (arg6 << 14) + arg2 + 1073741824;
        int var16 = (arg1 << 6) + arg7;
        class119 var17 = class2.method9(false, arg6);
        if (var17.field2877 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        if (var17.field2850 == 1) {
            var16 += 256;
        }
        if (arg7 == 22) {
            class143 var18;
            if (var17.field2874 == -1 && var17.field2825 == null) {
                var18 = var17.method939(22, var13, var12, 13151, var10, arg1, var11);
            } else {
                var18 = new class35(arg6, 22, arg1, var10, var11, var12, var13, var17.field2874, true, null);
            }
            arg4.method1029(arg0, arg2, arg3, var14, var18, var15, var16);
            if (var17.field2834 == 1) {
                arg9.method818(arg3, arg2, (byte) 70);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class143 var38;
            if (var17.field2874 == -1 && var17.field2825 == null) {
                var38 = var17.method939(10, var13, var12, 13151, var10, arg1, var11);
            } else {
                var38 = new class35(arg6, 10, arg1, var10, var11, var12, var13, var17.field2874, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg1 == 1 || arg1 == 3) {
                    var40 = var17.field2860;
                    var39 = var17.field2890;
                } else {
                    var39 = var17.field2860;
                    var40 = var17.field2890;
                }
                int var41 = 0;
                if (arg7 == 11) {
                    var41 += 256;
                }
                arg4.method1005(arg0, arg2, arg3, var14, var40, var39, var38, var41, var15, var16);
            }
            if (var17.field2834 != 0) {
                arg9.method806(arg1, var17.field2860, arg3, -109, var17.field2890, arg2, var17.field2862);
            }
        } else if (arg7 >= 12) {
            class143 var19;
            if (var17.field2874 == -1 && var17.field2825 == null) {
                var19 = var17.method939(arg7, var13, var12, 13151, var10, arg1, var11);
            } else {
                var19 = new class35(arg6, arg7, arg1, var10, var11, var12, var13, var17.field2874, true, null);
            }
            arg4.method1005(arg0, arg2, arg3, var14, 1, 1, var19, 0, var15, var16);
            if (var17.field2834 != 0) {
                arg9.method806(arg1, var17.field2860, arg3, 127, var17.field2890, arg2, var17.field2862);
            }
        } else {
            if (arg5 != 4) {
                method374(70);
            }
            if (arg7 == 0) {
                class143 var20;
                if (var17.field2874 == -1 && var17.field2825 == null) {
                    var20 = var17.method939(0, var13, var12, 13151, var10, arg1, var11);
                } else {
                    var20 = new class35(arg6, 0, arg1, var10, var11, var12, var13, var17.field2874, true, null);
                }
                arg4.method1001(arg0, arg2, arg3, var14, var20, null, class117.field2808[arg1], 0, var15, var16);
                if (var17.field2834 != 0) {
                    arg9.method811(true, arg7, var17.field2862, arg2, arg3, arg1);
                }
            } else if (arg7 == 1) {
                class143 var21;
                if (var17.field2874 == -1 && var17.field2825 == null) {
                    var21 = var17.method939(1, var13, var12, 13151, var10, arg1, var11);
                } else {
                    var21 = new class35(arg6, 1, arg1, var10, var11, var12, var13, var17.field2874, true, null);
                }
                arg4.method1001(arg0, arg2, arg3, var14, var21, null, class131.field3156[arg1], 0, var15, var16);
                if (var17.field2834 != 0) {
                    arg9.method811(true, arg7, var17.field2862, arg2, arg3, arg1);
                }
            } else if (arg7 == 2) {
                int var22 = arg1 + 1 & 0x3;
                class143 var23;
                class143 var24;
                if (var17.field2874 == -1 && var17.field2825 == null) {
                    var23 = var17.method939(2, var13, var12, 13151, var10, arg1 + 4, var11);
                    var24 = var17.method939(2, var13, var12, 13151, var10, var22, var11);
                } else {
                    var23 = new class35(arg6, 2, arg1 + 4, var10, var11, var12, var13, var17.field2874, true, null);
                    var24 = new class35(arg6, 2, var22, var10, var11, var12, var13, var17.field2874, true, null);
                }
                arg4.method1001(arg0, arg2, arg3, var14, var23, var24, class117.field2808[arg1], class117.field2808[var22], var15, var16);
                if (var17.field2834 != 0) {
                    arg9.method811(true, arg7, var17.field2862, arg2, arg3, arg1);
                }
            } else if (arg7 == 3) {
                class143 var25;
                if (var17.field2874 == -1 && var17.field2825 == null) {
                    var25 = var17.method939(3, var13, var12, 13151, var10, arg1, var11);
                } else {
                    var25 = new class35(arg6, 3, arg1, var10, var11, var12, var13, var17.field2874, true, null);
                }
                arg4.method1001(arg0, arg2, arg3, var14, var25, null, class131.field3156[arg1], 0, var15, var16);
                if (var17.field2834 != 0) {
                    arg9.method811(true, arg7, var17.field2862, arg2, arg3, arg1);
                }
            } else if (arg7 == 9) {
                class143 var26;
                if (var17.field2874 == -1 && var17.field2825 == null) {
                    var26 = var17.method939(arg7, var13, var12, 13151, var10, arg1, var11);
                } else {
                    var26 = new class35(arg6, arg7, arg1, var10, var11, var12, var13, var17.field2874, true, null);
                }
                arg4.method1005(arg0, arg2, arg3, var14, 1, 1, var26, 0, var15, var16);
                if (var17.field2834 != 0) {
                    arg9.method806(arg1, var17.field2860, arg3, 12, var17.field2890, arg2, var17.field2862);
                }
            } else {
                if (var17.field2838) {
                    if (arg1 == 1) {
                        int var30 = var13;
                        var13 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var30;
                    } else if (arg1 == 2) {
                        int var27 = var13;
                        var13 = var11;
                        var11 = var27;
                        int var28 = var12;
                        var12 = var10;
                        var10 = var28;
                    } else if (arg1 == 3) {
                        int var29 = var13;
                        var13 = var10;
                        var10 = var11;
                        var11 = var12;
                        var12 = var29;
                    }
                }
                if (arg7 == 4) {
                    class143 var31;
                    if (var17.field2874 == -1 && var17.field2825 == null) {
                        var31 = var17.method939(4, var13, var12, 13151, var10, 0, var11);
                    } else {
                        var31 = new class35(arg6, 4, 0, var10, var11, var12, var13, var17.field2874, true, null);
                    }
                    arg4.method999(arg0, arg2, arg3, var14, var31, class117.field2808[arg1], arg1 * 512, 0, 0, var15, var16);
                } else if (arg7 == 5) {
                    int var32 = 16;
                    int var33 = arg4.method1019(arg0, arg2, arg3);
                    if (var33 != 0) {
                        var32 = class2.method9(false, var33 >> 14 & 0x7FFF).field2855;
                    }
                    class143 var34;
                    if (var17.field2874 == -1 && var17.field2825 == null) {
                        var34 = var17.method939(4, var13, var12, 13151, var10, 0, var11);
                    } else {
                        var34 = new class35(arg6, 4, 0, var10, var11, var12, var13, var17.field2874, true, null);
                    }
                    arg4.method999(arg0, arg2, arg3, var14, var34, class117.field2808[arg1], arg1 * 512, class84.field1994[arg1] * var32, class106.field2562[arg1] * var32, var15, var16);
                } else if (arg7 == 6) {
                    class143 var35;
                    if (var17.field2874 == -1 && var17.field2825 == null) {
                        var35 = var17.method939(4, var13, var12, 13151, var10, 0, var11);
                    } else {
                        var35 = new class35(arg6, 4, 0, var10, var11, var12, var13, var17.field2874, true, null);
                    }
                    arg4.method999(arg0, arg2, arg3, var14, var35, 256, arg1, 0, 0, var15, var16);
                } else if (arg7 == 7) {
                    class143 var36;
                    if (var17.field2874 == -1 && var17.field2825 == null) {
                        var36 = var17.method939(4, var13, var12, 13151, var10, 0, var11);
                    } else {
                        var36 = new class35(arg6, 4, 0, var10, var11, var12, var13, var17.field2874, true, null);
                    }
                    arg4.method999(arg0, arg2, arg3, var14, var36, 512, arg1, 0, 0, var15, var16);
                } else if (arg7 == 8) {
                    class143 var37;
                    if (var17.field2874 == -1 && var17.field2825 == null) {
                        var37 = var17.method939(4, var13, var12, arg5 ^ 0x335B, var10, 0, var11);
                    } else {
                        var37 = new class35(arg6, 4, 0, var10, var11, var12, var13, var17.field2874, true, null);
                    }
                    arg4.method999(arg0, arg2, arg3, var14, var37, 768, arg1, 0, 0, var15, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static final void method377(int arg0) {
        class97.field2354 = new byte[4][104][104];
        class128.field3095 = 99;
        class116.field2800 = new int[104];
        class44.field1055 = new byte[4][104][104];
        class113.field2726 = new int[104];
        class132.field3199 = new int[4][105][105];
        class32.field759 = new int[105][105];
        field1179++;
        int var1 = 87 % ((arg0 + 55) / 50);
        class132.field3197 = new byte[4][104][104];
        class135.field3237 = new int[104];
        class122.field2924 = new int[104];
        class52.field1241 = new byte[4][105][105];
        class152.field3754 = new int[104];
        class107.field2576 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lu;BILu;Lg;Z)V")
    public static final void method378(class135 arg0, byte arg1, int arg2, class135 arg3, class43 arg4, boolean arg5) {
        int var6 = arg4.method317((byte) 13, arg3);
        field1194++;
        if (arg1 != -51) {
            field1197 = null;
        }
        int var7 = arg4.method340(var6, (byte) 37, arg0);
        class4.method16(var7, arg4, var6, 111, arg5, arg2);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static final void method379(boolean arg0) {
        field1187++;
        class117.field2819 = 0;
        for (int var1 = -1; var1 < class34.field790 + class14.field329; var1++) {
            class9 var18;
            if (var1 == -1) {
                var18 = class116.field2789;
            } else if (var1 < class14.field329) {
                var18 = class131.field3166[class108.field2600[var1]];
            } else {
                var18 = class96.field2340[class47.field1124[var1 - class14.field329]];
            }
            if (var18 != null && var18.method45((byte) 55)) {
                if (var18 instanceof class111) {
                    class55 var19 = ((class111) var18).field2697;
                    if (var19.field1302 != null) {
                        var19 = var19.method418(0);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class14.field329 <= var1) {
                    class55 var20 = ((class111) var18).field2697;
                    if (var20.field1302 != null) {
                        var20 = var20.method418(0);
                    }
                    if (var20.field1288 >= 0 && class124.field2969.length > var20.field1288) {
                        class98.method805(var18, -8439, var18.field167 + 15);
                        if (class138.field3351 > -1) {
                            class124.field2969[var20.field1288].method76(class138.field3351 - 12, class65.field1614 + -30);
                        }
                    }
                    if (class60.field1509 == 1 && class47.field1124[var1 - class14.field329] == class145.field3529 && class126.field2998 % 20 < 10) {
                        class98.method805(var18, -8439, var18.field167 + 15);
                        if (class138.field3351 > -1) {
                            class65.field1623[0].method76(class138.field3351 - 12, class65.field1614 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class145 var22 = (class145) var18;
                    if (var22.field3511 != -1 || var22.field3545 != -1) {
                        class98.method805(var18, -8439, var18.field167 + 15);
                        if (class138.field3351 > -1) {
                            if (var22.field3511 != -1) {
                                field1177[var22.field3511].method76(class138.field3351 - 12, class65.field1614 - var21);
                                var21 += 25;
                            }
                            if (var22.field3545 != -1) {
                                class124.field2969[var22.field3545].method76(class138.field3351 - 12, -var21 + class65.field1614);
                                var21 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class60.field1509 == 10 && class108.field2600[var1] == class63.field1575) {
                        class98.method805(var18, -8439, var18.field167 + 15);
                        if (class138.field3351 > -1) {
                            class65.field1623[1].method76(class138.field3351 - 12, -var21 + class65.field1614);
                        }
                    }
                }
                if (var18.field179 != null && (class14.field329 <= var1 || class79.field1858 == 0 || class79.field1858 == 3 || class79.field1858 == 1 && class9.method48(((class145) var18).field3516, 0))) {
                    class98.method805(var18, -8439, var18.field167);
                    if (class138.field3351 > -1 && class117.field2819 < class37.field840) {
                        class37.field852[class117.field2819] = class63.field1579.method115(var18.field179) / 2;
                        class37.field851[class117.field2819] = class63.field1579.field394;
                        class37.field843[class117.field2819] = class138.field3351;
                        class37.field846[class117.field2819] = class65.field1614;
                        class37.field836[class117.field2819] = var18.field181;
                        class37.field838[class117.field2819] = var18.field158;
                        class37.field841[class117.field2819] = var18.field190;
                        class37.field849[class117.field2819] = var18.field179;
                        class117.field2819++;
                    }
                }
                if (var18.field164 > class126.field2998) {
                    class98.method805(var18, -8439, var18.field167 + 15);
                    if (class138.field3351 > -1) {
                        int var23 = var18.field199 * 30 / var18.field171;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class70.method564(class138.field3351 - 15, class65.field1614 - 3, var23, 5, 65280);
                        class70.method564(class138.field3351 + var23 - 15, class65.field1614 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class126.field2998 < var18.field220[var24]) {
                        class98.method805(var18, -8439, var18.field167 / 2);
                        if (class138.field3351 > -1) {
                            if (var24 == 1) {
                                class65.field1614 -= 20;
                            }
                            if (var24 == 2) {
                                class65.field1614 -= 10;
                                class138.field3351 -= 15;
                            }
                            if (var24 == 3) {
                                class65.field1614 -= 10;
                                class138.field3351 += 15;
                            }
                            class32.field752[var18.field233[var24]].method76(class138.field3351 - 12, class65.field1614 - 12);
                            class143.field3500.method127(class68.method547(-1, var18.field202[var24]), class138.field3351, class65.field1614 + 4, 0);
                            class143.field3500.method127(class68.method547(-1, var18.field202[var24]), class138.field3351 - 1, class65.field1614 - -3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class117.field2819; var2++) {
            int var3 = class37.field843[var2];
            int var4 = class37.field846[var2];
            int var5 = class37.field851[var2];
            boolean var6 = true;
            int var7 = class37.field852[var2];
            while (var6) {
                var6 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (var4 + 2 > class37.field846[var17] + -class37.field851[var17] && class37.field846[var17] + 2 > var4 - var5 && var3 - var7 < class37.field852[var17] + class37.field843[var17] && var3 + var7 > class37.field843[var17] + -class37.field852[var17] && var4 > class37.field846[var17] - class37.field851[var17]) {
                        var4 = class37.field846[var17] - class37.field851[var17];
                        var6 = true;
                    }
                }
            }
            class138.field3351 = class37.field843[var2];
            class65.field1614 = class37.field846[var2] = var4;
            class135 var8 = class37.field849[var2];
            if (class78.field1840 == 0) {
                int var9 = 16776960;
                if (class37.field836[var2] < 6) {
                    var9 = class1.field10[class37.field836[var2]];
                }
                if (class37.field836[var2] == 6) {
                    var9 = class69.field1704 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class37.field836[var2] == 7) {
                    var9 = class69.field1704 % 20 >= 10 ? 65535 : 255;
                }
                if (class37.field836[var2] == 8) {
                    var9 = class69.field1704 % 20 < 10 ? 45056 : 8454016;
                }
                if (class37.field836[var2] == 9) {
                    int var10 = 150 - class37.field841[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class37.field836[var2] == 10) {
                    int var11 = 150 - class37.field841[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 + 255 + 500 - var11 * 5 - 32768000;
                    }
                }
                if (class37.field836[var2] == 11) {
                    int var12 = 150 - class37.field841[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 49545215 - var12 * 327680;
                    }
                }
                if (class37.field838[var2] == 0) {
                    class63.field1579.method127(var8, class138.field3351, class65.field1614 + 1, 0);
                    class63.field1579.method127(var8, class138.field3351, class65.field1614, var9);
                }
                if (class37.field838[var2] == 1) {
                    class63.field1579.method129(var8, class138.field3351, class65.field1614 + 1, 0, class69.field1704);
                    class63.field1579.method129(var8, class138.field3351, class65.field1614, var9, class69.field1704);
                }
                if (class37.field838[var2] == 2) {
                    class63.field1579.method133(var8, class138.field3351, class65.field1614 + 1, 0, class69.field1704);
                    class63.field1579.method133(var8, class138.field3351, class65.field1614, var9, class69.field1704);
                }
                if (class37.field838[var2] == 3) {
                    class63.field1579.method132(var8, class138.field3351, class65.field1614 + 1, 0, class69.field1704, 150 - class37.field841[var2]);
                    class63.field1579.method132(var8, class138.field3351, class65.field1614, var9, class69.field1704, 150 - class37.field841[var2]);
                }
                if (class37.field838[var2] == 4) {
                    int var13 = class63.field1579.method115(var8);
                    int var14 = (150 - class37.field841[var2]) * (var13 + 100) / 150;
                    class70.method573(class138.field3351 - 50, 0, class138.field3351 + 50, 334);
                    class63.field1579.method121(var8, class138.field3351 + 50 - var14, class65.field1614 + 1, 0);
                    class63.field1579.method121(var8, class138.field3351 + 50 - var14, class65.field1614, var9);
                    class70.method561();
                }
                if (class37.field838[var2] == 5) {
                    int var15 = 150 - class37.field841[var2];
                    class70.method573(0, class65.field1614 - class63.field1579.field394 - 1, 512, class65.field1614 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class63.field1579.method127(var8, class138.field3351, class65.field1614 + var16 + 1, 0);
                    class63.field1579.method127(var8, class138.field3351, class65.field1614 + var16, var9);
                    class70.method561();
                }
            } else {
                class63.field1579.method127(var8, class138.field3351, class65.field1614 + 1, 0);
                class63.field1579.method127(var8, class138.field3351, class65.field1614, 16776960);
            }
        }
        if (arg0) {
            method374(92);
        }
    }
}
