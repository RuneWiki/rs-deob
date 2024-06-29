import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class29 {

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    private int field553 = 0;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[Lod;")
    private class130[] field549;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "[Z")
    public static boolean[] field534 = new boolean[5];

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lsd;")
    private static class166 field533 = class135.method935("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 0);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lsd;")
    public static class166 field528 = class135.method935("blinken1:", 0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lsd;")
    public static class166 field527 = field533;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field532 = -1;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lsd;")
    public static class166 field537 = class135.method935("Die Adresse dieses Computers wurde gesperrt)1", 0);

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lsd;")
    public static class166 field535 = class135.method935("sl_arrows", 0);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "J")
    private long field546;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lod;")
    private class130 field529;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Lod;")
    private class130 field555;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lod;IJ)V")
    public final void method216(class130 arg0, int arg1, long arg2) {
        field542++;
        if (arg0.field2546 != null) {
            arg0.method915(0);
        }
        class130 var5 = this.field549[(int) ((long) (this.field548 - 1) & arg2)];
        arg0.field2546 = var5.field2546;
        arg0.field2552 = var5;
        arg0.field2546.field2552 = arg0;
        arg0.field2552.field2546 = arg0;
        arg0.field2541 = arg2;
        if (arg1 != 12682) {
            field531 = 114;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
    public final int method217(int arg0) {
        field545++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field548; var3++) {
            class130 var5 = this.field549[var3];
            class130 var6 = var5.field2552;
            while (var5 != var6) {
                var6 = var6.field2552;
                var2++;
            }
        }
        int var4 = 40 / ((17 - arg0) / 36);
        return var2;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Lod;)I")
    public final int method218(int arg0, class130[] arg1) {
        field552++;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field548; var4++) {
            class130 var5 = this.field549[var4];
            for (class130 var6 = var5.field2552; var6 != var5; var6 = var6.field2552) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)[B")
    public static final byte[] method219(byte[] arg0, byte arg1) {
        field554++;
        class53 var2 = new class53(arg0);
        int var3 = var2.method400(255);
        int var4 = var2.method419(arg1 ^ 0xFFFFFFCD);
        if (var4 < 0 || class110.field2138 != 0 && class110.field2138 < var4) {
            throw new RuntimeException();
        }
        if (arg1 != 49) {
            field528 = null;
        }
        if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method420(-1552680924, var5, 0, var4);
            return var5;
        }
        int var6 = var2.method419(-4);
        if (var6 < 0 || class110.field2138 != 0 && class110.field2138 < var6) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class1.method6(var7, var6, arg0, var4, 9);
        } else {
            class120.field2349.method240(true, var7, var2);
        }
        return var7;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lcg;")
    public static final class27 method220(int arg0, int arg1) {
        field538++;
        class27 var2 = (class27) class121.field2371.method64((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 39) {
            byte[] var3 = class129.field2529.method353(arg1, 0, -102);
            if (var3 == null) {
                return null;
            }
            class27 var4 = new class27();
            class53 var5 = new class53(var3);
            int var6 = 0;
            var5.field1000 = var5.field988.length - 12;
            int var7 = var5.method419(-4);
            var4.field474 = var5.method405(2);
            var4.field479 = var5.method405(arg0 - 37);
            var4.field471 = var5.method405(2);
            var4.field466 = var5.method405(arg0 - 37);
            var5.field1000 = 0;
            var4.field475 = var5.method414(0);
            var4.field477 = new class166[var7];
            var4.field469 = new int[var7];
            var4.field473 = new int[var7];
            while (var5.field988.length - 12 > var5.field1000) {
                int var8 = var5.method405(2);
                if (var8 == 3) {
                    var4.field477[var6] = var5.method436((byte) 75);
                } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                    var4.field469[var6] = var5.method400(255);
                } else {
                    var4.field469[var6] = var5.method419(-4);
                }
                var4.field473[var6++] = var8;
            }
            class121.field2371.method67(var4, 15266, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Lod;")
    public final class130 method221(int arg0) {
        this.field553 = arg0;
        field536++;
        return this.method222(58);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Lod;")
    public final class130 method222(int arg0) {
        field530++;
        if (this.field553 > 0 && this.field549[this.field553 - 1] != this.field555) {
            class130 var2 = this.field555;
            this.field555 = var2.field2552;
            return var2;
        }
        int var3 = -14 % ((-arg0 - 25) / 54);
        while (this.field553 < this.field548) {
            class130 var4 = this.field549[this.field553++].field2552;
            if (this.field549[this.field553 - 1] != var4) {
                this.field555 = var4.field2552;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public static final void method223(int arg0) {
        field541++;
        if (arg0 != -4) {
            field531 = -36;
        }
        class79.field1606 = new class29(32);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IJ)Lod;")
    public final class130 method224(int arg0, long arg1) {
        this.field546 = arg1;
        field543++;
        class130 var4 = this.field549[(int) (arg1 & (long) (this.field548 + arg0))];
        for (this.field529 = var4.field2552; this.field529 != var4; this.field529 = this.field529.field2552) {
            if (this.field529.field2541 == arg1) {
                class130 var5 = this.field529;
                this.field529 = this.field529.field2552;
                return var5;
            }
        }
        this.field529 = null;
        return null;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)Lod;")
    public final class130 method225(int arg0) {
        field547++;
        if (this.field529 == null) {
            return null;
        }
        class130 var2 = this.field549[(int) (this.field546 & (long) (this.field548 + arg0))];
        while (this.field529 != var2) {
            if (this.field529.field2541 == this.field546) {
                class130 var3 = this.field529;
                this.field529 = this.field529.field2552;
                return var3;
            }
            this.field529 = this.field529.field2552;
        }
        this.field529 = null;
        return null;
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public static final void method226(int arg0) {
        field550++;
        if (class97.field1858 && class37.field682 != class165.field3130) {
            class59.method504(class41.field728.field3554[0], (byte) -39, class165.field3130, class41.field728.field3521[0], field531, class60.field1233);
            return;
        }
        if (arg0 > -77) {
            field537 = null;
        }
        if (class165.field3130 != class102.field2016) {
            class102.field2016 = class165.field3130;
            class32.method239(104, class165.field3130);
        }
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public static void method227(int arg0) {
        field528 = null;
        field527 = null;
        int var1 = -107 % ((arg0 + 6) / 52);
        field535 = null;
        field534 = null;
        field533 = null;
        field537 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
    public static final void method228(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class77.field1602 = 0;
        for (int var5 = -1; var5 < class98.field1880 + class6.field131; var5++) {
            class184 var21;
            if (var5 == -1) {
                var21 = class41.field728;
            } else if (var5 < class6.field131) {
                var21 = class182.field3451[class53.field967[var5]];
            } else {
                var21 = class124.field2434[class58.field1186[var5 - class6.field131]];
            }
            if (var21 != null && var21.method885(5)) {
                if (var21 instanceof class154) {
                    class77 var22 = ((class154) var21).field2958;
                    if (var22.field1598 != null) {
                        var22 = var22.method637(-54);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class6.field131 <= var5) {
                    class77 var25 = ((class154) var21).field2958;
                    if (var25.field1598 != null) {
                        var25 = var25.method637(-111);
                    }
                    if (var25.field1588 >= 0 && var25.field1588 < class120.field2358.length) {
                        class144.method984(var21, 15 - var21.field756, arg1 + -11307);
                        if (class52.field943 > -1) {
                            class120.field2358[var25.field1588].method1055(class52.field943 + arg2 - 12, arg3 + -30 - -field532);
                        }
                    }
                    if (class180.field3411 == 1 && class58.field1186[var5 - class6.field131] == class103.field2023 && class49.field910 % 20 < 10) {
                        class144.method984(var21, 15 - var21.field756, -120);
                        if (class52.field943 > -1) {
                            class159.field3045[0].method1055(class52.field943 + arg2 - 12, arg3 + -28 - -field532);
                        }
                    }
                } else {
                    int var23 = 30;
                    class123 var24 = (class123) var21;
                    if (var24.field2403 != -1 || var24.field2401 != -1) {
                        class144.method984(var21, 15 - var21.field756, -95);
                        if (class52.field943 > -1) {
                            if (var24.field2403 != -1) {
                                class112.field2182[var24.field2403].method1055(arg2 + class52.field943 - 12, arg3 - (-field532 - -var23));
                                var23 += 25;
                            }
                            if (var24.field2401 != -1) {
                                class120.field2358[var24.field2401].method1055(arg2 + class52.field943 - 12, field532 + arg3 - var23);
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class180.field3411 == 10 && class53.field967[var5] == class81.field1656) {
                        class144.method984(var21, 15 - var21.field756, -98);
                        if (class52.field943 > -1) {
                            class159.field3045[1].method1055(arg2 + class52.field943 - 12, field532 + arg3 + -var23);
                        }
                    }
                }
                if (var21.field3495 != null && (var5 >= class6.field131 || class31.field573 == 0 || class31.field573 == 3 || class31.field573 == 1 && class86.method687(((class123) var21).field2412, arg1 ^ 0xFFFFD455))) {
                    class144.method984(var21, -var21.field756, -103);
                    if (class52.field943 > -1 && class159.field3033 > class77.field1602) {
                        class159.field3031[class77.field1602] = class125.field2464.method171(var21.field3495) / 2;
                        class159.field3025[class77.field1602] = class125.field2464.field411;
                        class159.field3022[class77.field1602] = class52.field943;
                        class159.field3040[class77.field1602] = field532;
                        class159.field3027[class77.field1602] = var21.field3499;
                        class159.field3017[class77.field1602] = var21.field3536;
                        class159.field3042[class77.field1602] = var21.field3527;
                        class159.field3030[class77.field1602] = var21.field3495;
                        class77.field1602++;
                    }
                }
                if (class49.field910 < var21.field3487) {
                    class144.method984(var21, 15 - var21.field756, 34);
                    if (class52.field943 > -1) {
                        int var26 = var21.field3545 * 30 / var21.field3503;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class17.method91(class52.field943 + arg2 - 15, arg3 + -3 + field532, var26, 5, 65280);
                        class17.method91(class52.field943 + arg2 + var26 - 15, field532 + arg3 - 3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var21.field3502[var27] > class49.field910) {
                        class144.method984(var21, -var21.field756 / 2, arg1 ^ 0x2B81);
                        if (class52.field943 > -1) {
                            if (var27 == 1) {
                                field532 -= 20;
                            }
                            if (var27 == 2) {
                                class52.field943 -= 15;
                                field532 -= 10;
                            }
                            if (var27 == 3) {
                                class52.field943 += 15;
                                field532 -= 10;
                            }
                            class196.field3904[var21.field3537[var27]].method1055(class52.field943 + arg2 - 12, arg3 - (-field532 + 12));
                            class160.field3068.method181(class174.method1192(false, var21.field3551[var27]), class52.field943 + arg2 - 1, field532 + arg3 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field551++;
        if (arg1 != 11216) {
            method220(-55, 13);
        }
        for (int var6 = 0; var6 < class77.field1602; var6++) {
            int var7 = class159.field3022[var6];
            int var8 = class159.field3040[var6];
            int var9 = class159.field3031[var6];
            boolean var10 = true;
            int var11 = class159.field3025[var6];
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class159.field3040[var20] - class159.field3025[var20] < var8 - -2 && class159.field3040[var20] + 2 > var8 - var11 && var7 - var9 < class159.field3031[var20] + class159.field3022[var20] && var7 + var9 > class159.field3022[var20] + -class159.field3031[var20] && class159.field3040[var20] - class159.field3025[var20] < var8) {
                        var8 = class159.field3040[var20] - class159.field3025[var20];
                        var10 = true;
                    }
                }
            }
            class52.field943 = class159.field3022[var6];
            field532 = class159.field3040[var6] = var8;
            class166 var12 = class159.field3030[var6];
            if (class130.field2554 == 0) {
                int var13 = 16776960;
                if (class159.field3027[var6] < 6) {
                    var13 = class114.field2218[class159.field3027[var6]];
                }
                if (class159.field3027[var6] == 6) {
                    var13 = class112.field2194 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class159.field3027[var6] == 7) {
                    var13 = class112.field2194 % 20 >= 10 ? 65535 : 255;
                }
                if (class159.field3027[var6] == 8) {
                    var13 = class112.field2194 % 20 < 10 ? 45056 : 8454016;
                }
                if (class159.field3027[var6] == 9) {
                    int var14 = 150 - class159.field3042[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16384000 + 16776960 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class159.field3027[var6] == 10) {
                    int var15 = 150 - class159.field3042[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 + 16384000 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 500 - var15 * 5 - 32767745;
                    }
                }
                if (class159.field3027[var6] == 11) {
                    int var16 = 150 - class159.field3042[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class159.field3017[var6] == 0) {
                    class125.field2464.method181(var12, class52.field943 + arg2, field532 + arg3, var13, 0);
                }
                if (class159.field3017[var6] == 1) {
                    class125.field2464.method185(var12, class52.field943 + arg2, arg3 - -field532, var13, 0, class112.field2194);
                }
                if (class159.field3017[var6] == 2) {
                    class125.field2464.method167(var12, class52.field943 + arg2, arg3 - -field532, var13, 0, class112.field2194);
                }
                if (class159.field3017[var6] == 3) {
                    class125.field2464.method187(var12, class52.field943 + arg2, field532 + arg3, var13, 0, class112.field2194, 150 - class159.field3042[var6]);
                }
                if (class159.field3017[var6] == 4) {
                    int var17 = (150 - class159.field3042[var6]) * (class125.field2464.method171(var12) - -100) / 150;
                    class17.method95(arg2 + class52.field943 - 50, arg3, arg2 + class52.field943 + 50, arg3 + arg4);
                    class125.field2464.method178(var12, arg2 + class52.field943 + 50 - var17, field532 + arg3, var13, 0);
                    class17.method90(arg2, arg3, arg0 + arg2, arg3 + arg4);
                }
                if (class159.field3017[var6] == 5) {
                    int var18 = 0;
                    int var19 = 150 - class159.field3042[var6];
                    if (var19 < 25) {
                        var18 = var19 - 25;
                    } else if (var19 > 125) {
                        var18 = var19 - 125;
                    }
                    class17.method95(arg2, field532 + arg3 - class125.field2464.field411 - 1, arg0 + arg2, arg3 + field532 + 5);
                    class125.field2464.method181(var12, arg2 + class52.field943, arg3 + var18 - -field532, var13, 0);
                    class17.method90(arg2, arg3, arg2 + arg0, arg3 - -arg4);
                }
            } else {
                class125.field2464.method181(var12, class52.field943 + arg2, arg3 - -field532, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field548 = arg0;
        this.field549 = new class130[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class130 var3 = this.field549[var2] = new class130();
            var3.field2552 = var3;
            var3.field2546 = var3;
        }
    }
}
