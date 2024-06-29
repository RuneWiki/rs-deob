import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class40 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lrd;")
    public static class173 field817 = class133.method843(")3runescape)3com", -104);

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    public static int[] field819 = new int[1000];

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lrd;")
    public static class173 field829 = class133.method843("W-=hlen Sie eine Welt", -69);

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lrd;")
    public static class173 field823 = class133.method843("sl_button", 75);

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Lrd;")
    public static class173 field818 = class133.method843("Sie haben gerade eine andere Welt verlassen)3", -68);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static volatile int field816 = 0;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Lrd;")
    private static class173 field837 = class133.method843("Connection timed out)3", -67);

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Lrd;")
    public static class173 field828 = field837;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Lbc;")
    public static class14 field831;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Lbc;")
    public static class14 field835;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Lrd;")
    public class173 field833;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "La;")
    public static class1 field830;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Z")
    public boolean field834;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIII)I")
    public static final int method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if (arg5 <= 44) {
            return 63;
        }
        field836++;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 1 + 7 - arg6 - arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg3 - arg4;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I")
    public static final int method294(int arg0, int arg1, int arg2, int arg3) {
        field827++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else {
            if (arg2 != -12) {
                field817 = null;
            }
            return var4 == 2 ? 7 - arg3 : arg0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[III)I")
    public static final int method295(int arg0, int[] arg1, int arg2, int arg3) {
        field821++;
        if (arg3 != 0) {
            field837 = null;
        }
        return arg1[0] * arg0 + arg1[1] * arg2;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method296(int arg0) {
        if (arg0 != -3903) {
            return;
        }
        field837 = null;
        field818 = null;
        field831 = null;
        field835 = null;
        field823 = null;
        field829 = null;
        field830 = null;
        field828 = null;
        field817 = null;
        field819 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static final void method297(byte arg0) {
        for (class87 var1 = (class87) class35.field757.method915(-1); var1 != null; var1 = (class87) class35.field757.method910((byte) 88)) {
            if (var1.field1704 != null) {
                class171.field3308.method686(var1.field1704);
                var1.field1704 = null;
            }
            if (var1.field1705 != null) {
                class171.field3308.method686(var1.field1705);
                var1.field1705 = null;
            }
        }
        class35.field757.method916((byte) 110);
        if (arg0 != 36) {
            field828 = null;
        }
        field839++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public static final void method298(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1954 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V")
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class79.field1547 = 0;
        field838++;
        for (int var5 = -1; var5 < class66.field1291 + class18.field378; var5++) {
            class147 var21;
            if (var5 == -1) {
                var21 = class175.field3447;
            } else if (var5 >= class18.field378) {
                var21 = client.field632[class139.field2597[var5 - class18.field378]];
            } else {
                var21 = class183.field3600[class189.field3703[var5]];
            }
            if (var21 != null && var21.method727(true)) {
                if (var21 instanceof class120) {
                    class45 var22 = ((class120) var21).field2215;
                    if (var22.field922 != null) {
                        var22 = var22.method318((byte) 92);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class18.field378) {
                    class45 var28 = ((class120) var21).field2215;
                    if (var28.field922 != null) {
                        var28 = var28.method318((byte) 92);
                    }
                    if (var28.field906 >= 0 && var28.field906 < class211.field4080.length) {
                        class145.method922(var21, var21.method974(200) + 15, -127);
                        if (class189.field3678 > -1) {
                            class211.field4080[var28.field906].method1222(arg4 + class189.field3678 - 12, class15.field352 + arg2 - 30);
                        }
                    }
                    class67[] var29 = class105.field1971;
                    for (int var30 = 0; var30 < var29.length; var30++) {
                        class67 var32 = var29[var30];
                        if (var32 != null && var32.field1310 == 1 && class139.field2597[var5 - class18.field378] == var32.field1311 && class217.field4203 % 20 < 10) {
                            class145.method922(var21, var21.method974(200) + 15, arg3 ^ 0x2711);
                            if (class189.field3678 > -1) {
                                class203.field3954[var32.field1309].method1222(class189.field3678 + arg4 - 12, class15.field352 + -28 + arg2);
                            }
                        }
                    }
                } else {
                    class212 var23 = (class212) var21;
                    int var24 = 30;
                    if (var23.field4120 != -1 || var23.field4102 != -1) {
                        class145.method922(var21, var21.method974(200) + 15, -119);
                        if (class189.field3678 > -1) {
                            if (var23.field4120 != -1) {
                                class26.field547[var23.field4120].method1222(arg4 + class189.field3678 - 12, class15.field352 + arg2 + -var24);
                                var24 += 25;
                            }
                            if (var23.field4102 != -1) {
                                class211.field4080[var23.field4102].method1222(arg4 + class189.field3678 - 12, arg2 - -class15.field352 + -var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0) {
                        int var25 = 0;
                        class67[] var26 = class105.field1971;
                        while (var25 < var26.length) {
                            class67 var27 = var26[var25];
                            if (var27 != null && var27.field1310 == 10 && class189.field3703[var5] == var27.field1311) {
                                class145.method922(var21, var21.method974(200) + 15, -116);
                                if (class189.field3678 > -1) {
                                    class203.field3954[var27.field1309].method1222(arg4 + class189.field3678 - 12, -var24 + class15.field352 + arg2);
                                }
                            }
                            var25++;
                        }
                    }
                }
                if (var21.field2774 != null && (var5 >= class18.field378 || class124.field2341 == 0 || class124.field2341 == 3 || class124.field2341 == 1 && class178.method1196(((class212) var21).field4097, false))) {
                    class145.method922(var21, var21.method974(arg3 ^ 0xFFFFD858), arg3 + 9983);
                    if (class189.field3678 > -1 && class28.field573 > class79.field1547) {
                        class28.field587[class79.field1547] = class158.field2955.method539(var21.field2774) / 2;
                        class28.field571[class79.field1547] = class158.field2955.field1617;
                        class28.field568[class79.field1547] = class189.field3678;
                        class28.field579[class79.field1547] = class15.field352;
                        class28.field580[class79.field1547] = var21.field2782;
                        class28.field578[class79.field1547] = var21.field2750;
                        class28.field590[class79.field1547] = var21.field2817;
                        class28.field586[class79.field1547] = var21.field2774;
                        class79.field1547++;
                    }
                }
                if (var21.field2808 > class217.field4203) {
                    class145.method922(var21, var21.method974(200) + 15, -127);
                    if (class189.field3678 > -1) {
                        class27.method219(arg4 + class189.field3678 - 15, arg2 - (-class15.field352 - -3), var21.field2784, 5, 65280);
                        class27.method219(class189.field3678 + arg4 + var21.field2784 - 15, arg2 - -class15.field352 + -3, 30 - var21.field2784, 5, 16711680);
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class217.field4203 < var21.field2769[var31]) {
                        class145.method922(var21, var21.method974(arg3 + 10296) / 2, arg3 ^ 0x2717);
                        if (class189.field3678 > -1) {
                            if (var31 == 1) {
                                class15.field352 -= 20;
                            }
                            if (var31 == 2) {
                                class15.field352 -= 10;
                                class189.field3678 -= 15;
                            }
                            if (var31 == 3) {
                                class15.field352 -= 10;
                                class189.field3678 += 15;
                            }
                            class81.field1593[var21.field2781[var31]].method1222(class189.field3678 + arg4 - 12, class15.field352 + arg2 - 12);
                            class7.field130.method543(class93.method588(var21.field2813[var31], true), class189.field3678 + arg4 - 1, class15.field352 - -3 + arg2, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg3 != -10096) {
            return;
        }
        for (int var6 = 0; var6 < class79.field1547; var6++) {
            int var7 = class28.field579[var6];
            int var8 = class28.field587[var6];
            int var9 = class28.field571[var6];
            int var10 = class28.field568[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class28.field579[var20] - class28.field571[var20] < var7 + 2 && class28.field579[var20] + 2 > var7 - var9 && var10 - var8 < class28.field587[var20] + class28.field568[var20] && class28.field568[var20] - class28.field587[var20] < var8 + var10 && class28.field579[var20] - class28.field571[var20] < var7) {
                        var7 = class28.field579[var20] - class28.field571[var20];
                        var11 = true;
                    }
                }
            }
            class189.field3678 = class28.field568[var6];
            class15.field352 = class28.field579[var6] = var7;
            class173 var12 = class28.field586[var6];
            if (class77.field1501 == 0) {
                int var13 = 16776960;
                if (class28.field580[var6] < 6) {
                    var13 = class67.field1306[class28.field580[var6]];
                }
                if (class28.field580[var6] == 6) {
                    var13 = class41.field851 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class28.field580[var6] == 7) {
                    var13 = class41.field851 % 20 < 10 ? 255 : 65535;
                }
                if (class28.field580[var6] == 8) {
                    var13 = class41.field851 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class28.field580[var6] == 9) {
                    int var14 = 150 - class28.field590[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class28.field580[var6] == 10) {
                    int var15 = 150 - class28.field590[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 + 16384000 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 + 500 - var15 * 5;
                    }
                }
                if (class28.field580[var6] == 11) {
                    int var16 = 150 - class28.field590[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class28.field578[var6] == 0) {
                    class158.field2955.method543(var12, class189.field3678 + arg4, arg2 - -class15.field352, var13, 0);
                }
                if (class28.field578[var6] == 1) {
                    class158.field2955.method542(var12, arg4 + class189.field3678, class15.field352 + arg2, var13, 0, class41.field851);
                }
                if (class28.field578[var6] == 2) {
                    class158.field2955.method526(var12, arg4 + class189.field3678, class15.field352 + arg2, var13, 0, class41.field851);
                }
                if (class28.field578[var6] == 3) {
                    class158.field2955.method530(var12, arg4 + class189.field3678, class15.field352 + arg2, var13, 0, class41.field851, 150 - class28.field590[var6]);
                }
                if (class28.field578[var6] == 4) {
                    int var17 = (150 - class28.field590[var6]) * (class158.field2955.method539(var12) + 100) / 150;
                    class27.method213(class189.field3678 + arg4 - 50, arg2, arg4 + class189.field3678 + 50, arg1 + arg2);
                    class158.field2955.method534(var12, arg4 + class189.field3678 + 50 - var17, class15.field352 + arg2, var13, 0);
                    class27.method212(arg4, arg2, arg0 + arg4, arg1 + arg2);
                }
                if (class28.field578[var6] == 5) {
                    int var18 = 150 - class28.field590[var6];
                    class27.method213(arg4, class15.field352 + arg2 - class158.field2955.field1617 - 1, arg0 + arg4, arg2 + class15.field352 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class158.field2955.method543(var12, class189.field3678 + arg4, class15.field352 + arg2 - -var19, var13, 0);
                    class27.method212(arg4, arg2, arg4 + arg0, arg1 + arg2);
                }
            } else {
                class158.field2955.method543(var12, class189.field3678 + arg4, class15.field352 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(IIIIIII)V")
    public static final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field824++;
        class189.method1263(arg1, -125);
        int var7 = 0;
        int var8 = arg1 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = 84 % ((-arg0 - 31) / 41);
        int var10 = var8;
        int var11 = arg1;
        int var12 = -arg1;
        int var13 = -var8;
        int var14 = -1;
        if (class37.field790 <= arg4 && arg4 <= class20.field445) {
            int[] var15 = class107.field1998[arg4];
            int var16 = class68.method421(arg2 - arg1, class194.field3778, -36, class96.field1766);
            int var17 = class68.method421(arg1 + arg2, class194.field3778, -84, class96.field1766);
            int var18 = class68.method421(arg2 - var8, class194.field3778, -115, class96.field1766);
            int var19 = class68.method421(arg2 + var8, class194.field3778, -112, class96.field1766);
            class51.method350(var16, arg6, (byte) -125, var15, var18);
            class51.method350(var18, arg3, (byte) -123, var15, var19);
            class51.method350(var19, arg6, (byte) -119, var15, var17);
        }
        int var20 = -1;
        while (var7 < var11) {
            var14 += 2;
            var12 += var14;
            var20 += 2;
            var13 += var20;
            if (var13 >= 0 && var10 >= 1) {
                var10--;
                class212.field4117[var10] = var7;
                var13 -= var10 << 1;
            }
            var7++;
            if (var12 >= 0) {
                var11--;
                int var21 = arg4 + var11;
                var12 -= var11 << 1;
                int var22 = arg4 - var11;
                if (class37.field790 <= var21 && var22 <= class20.field445) {
                    if (var11 >= var8) {
                        int var23 = class68.method421(arg2 + var7, class194.field3778, 125, class96.field1766);
                        int var24 = class68.method421(arg2 - var7, class194.field3778, -50, class96.field1766);
                        if (class20.field445 >= var21) {
                            class51.method350(var24, arg6, (byte) -126, class107.field1998[var21], var23);
                        }
                        if (var22 >= class37.field790) {
                            class51.method350(var24, arg6, (byte) -117, class107.field1998[var22], var23);
                        }
                    } else {
                        int var25 = class212.field4117[var11];
                        int var26 = class68.method421(arg2 + var7, class194.field3778, -58, class96.field1766);
                        int var27 = class68.method421(arg2 - var7, class194.field3778, 60, class96.field1766);
                        int var28 = class68.method421(arg2 + var25, class194.field3778, 113, class96.field1766);
                        int var29 = class68.method421(arg2 - var25, class194.field3778, 87, class96.field1766);
                        if (class20.field445 >= var21) {
                            int[] var30 = class107.field1998[var21];
                            class51.method350(var27, arg6, (byte) -121, var30, var29);
                            class51.method350(var29, arg3, (byte) -128, var30, var28);
                            class51.method350(var28, arg6, (byte) -126, var30, var26);
                        }
                        if (var22 >= class37.field790) {
                            int[] var31 = class107.field1998[var22];
                            class51.method350(var27, arg6, (byte) -123, var31, var29);
                            class51.method350(var29, arg3, (byte) -120, var31, var28);
                            class51.method350(var28, arg6, (byte) -125, var31, var26);
                        }
                    }
                }
            }
            int var32 = arg4 - var7;
            int var33 = arg4 + var7;
            if (var33 >= class37.field790 && var32 <= class20.field445) {
                int var34 = arg2 + var11;
                int var35 = arg2 - var11;
                if (class194.field3778 <= var34 && class96.field1766 >= var35) {
                    int var36 = class68.method421(var34, class194.field3778, 124, class96.field1766);
                    int var37 = class68.method421(var35, class194.field3778, 104, class96.field1766);
                    if (var7 < var8) {
                        int var38 = var10 >= var7 ? var10 : class212.field4117[var7];
                        int var39 = class68.method421(arg2 + var38, class194.field3778, 68, class96.field1766);
                        int var40 = class68.method421(arg2 - var38, class194.field3778, -44, class96.field1766);
                        if (class20.field445 >= var33) {
                            int[] var41 = class107.field1998[var33];
                            class51.method350(var37, arg6, (byte) -125, var41, var40);
                            class51.method350(var40, arg3, (byte) -123, var41, var39);
                            class51.method350(var39, arg6, (byte) -119, var41, var36);
                        }
                        if (var32 >= class37.field790) {
                            int[] var42 = class107.field1998[var32];
                            class51.method350(var37, arg6, (byte) -125, var42, var40);
                            class51.method350(var40, arg3, (byte) -127, var42, var39);
                            class51.method350(var39, arg6, (byte) -121, var42, var36);
                        }
                    } else {
                        if (var33 <= class20.field445) {
                            class51.method350(var37, arg6, (byte) -119, class107.field1998[var33], var36);
                        }
                        if (var32 >= class37.field790) {
                            class51.method350(var37, arg6, (byte) -121, class107.field1998[var32], var36);
                        }
                    }
                }
            }
        }
    }
}
