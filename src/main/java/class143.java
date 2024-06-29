import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class143 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lva;")
    private class145 field3309 = new class145();

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Lcf;")
    private class21 field3327 = new class21();

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    private int field3323;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lc;")
    private class15 field3324;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3311 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3307 = 0;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "[I")
    public static int[] field3321 = new int[25];

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[Lsa;")
    public static class126[] field3316 = new class126[4];

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Ltd;")
    public static class136 field3320 = class145.method1172("oberen Rand der Webseite ausw-=hlen)3", 45);

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3322 = 0;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lue;")
    public static class143 field3315 = new class143(100);

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lk;")
    public static class69 field3326 = new class69();

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lpd;")
    public static class108 field3328;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1159(int arg0) {
        field3320 = null;
        field3321 = null;
        field3316 = null;
        if (arg0 != 45056) {
            method1161(null, 108, null);
        }
        field3328 = null;
        field3315 = null;
        field3326 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
    public static final void method1160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3318++;
        class125.field2892 = 0;
        int var5 = -1;
        if (arg3 <= 88) {
            return;
        }
        while (class55.field1255 + class51.field1145 > var5) {
            class155 var21;
            if (var5 == -1) {
                var21 = class24.field555;
            } else if (var5 >= class55.field1255) {
                var21 = class122.field2846[class139.field3237[var5 - class55.field1255]];
            } else {
                var21 = class154.field3518[class24.field564[var5]];
            }
            if (var21 != null && var21.method91(83)) {
                label309: {
                    if (var21 instanceof class67) {
                        class96 var22 = ((class67) var21).field1428;
                        if (var22.field2258 != null) {
                            var22 = var22.method732((byte) -114);
                        }
                        if (var22 == null) {
                            break label309;
                        }
                    }
                    if (class55.field1255 <= var5) {
                        class96 var25 = ((class67) var21).field1428;
                        if (var25.field2258 != null) {
                            var25 = var25.method732((byte) -114);
                        }
                        if (var25.field2293 >= 0 && class142.field3304.length > var25.field2293) {
                            class128.method1047(var21, 103, var21.field3605 + 15);
                            if (class105.field2480 > -1) {
                                class142.field3304[var25.field2293].method46(class105.field2480 + arg4 - 12, arg2 + -30 + class18.field355);
                            }
                        }
                        if (class153.field3494 == 1 && class139.field3237[var5 - class55.field1255] == class93.field2191 && class44.field1013 % 20 < 10) {
                            class128.method1047(var21, 112, var21.field3605 + 15);
                            if (class105.field2480 > -1) {
                                class149.field3427[0].method46(arg4 + class105.field2480 - 12, arg2 - -class18.field355 + -28);
                            }
                        }
                    } else {
                        int var23 = 30;
                        class13 var24 = (class13) var21;
                        if (var24.field237 != -1 || var24.field243 != -1) {
                            class128.method1047(var21, 125, var21.field3605 + 15);
                            if (class105.field2480 > -1) {
                                if (var24.field237 != -1) {
                                    class101.field2424[var24.field237].method46(arg4 + class105.field2480 - 12, arg2 - -class18.field355 + -var23);
                                    var23 += 25;
                                }
                                if (var24.field243 != -1) {
                                    class142.field3304[var24.field243].method46(class105.field2480 + arg4 - 12, class18.field355 + arg2 + -var23);
                                    var23 += 25;
                                }
                            }
                        }
                        if (var5 >= 0 && class153.field3494 == 10 && class24.field564[var5] == class77.field1743) {
                            class128.method1047(var21, 111, var21.field3605 + 15);
                            if (class105.field2480 > -1) {
                                class149.field3427[1].method46(class105.field2480 + arg4 - 12, arg2 - -class18.field355 - var23);
                            }
                        }
                    }
                    if (var21.field3548 != null && (class55.field1255 <= var5 || class146.field3365 == 0 || class146.field3365 == 3 || class146.field3365 == 1 && class11.method77(((class13) var21).field249, (byte) 76))) {
                        class128.method1047(var21, 101, var21.field3605);
                        if (class105.field2480 > -1 && class125.field2892 < class119.field2704) {
                            class119.field2699[class125.field2892] = class81.field1943.method706(var21.field3548) / 2;
                            class119.field2724[class125.field2892] = class81.field1943.field2225;
                            class119.field2727[class125.field2892] = class105.field2480;
                            class119.field2714[class125.field2892] = class18.field355;
                            class119.field2703[class125.field2892] = var21.field3553;
                            class119.field2700[class125.field2892] = var21.field3568;
                            class119.field2722[class125.field2892] = var21.field3609;
                            class119.field2708[class125.field2892] = var21.field3548;
                            class125.field2892++;
                        }
                    }
                    if (var21.field3596 > class44.field1013) {
                        class128.method1047(var21, 125, var21.field3605 + 15);
                        if (class105.field2480 > -1) {
                            int var26 = var21.field3600 * 30 / var21.field3549;
                            if (var26 > 30) {
                                var26 = 30;
                            }
                            class114.method891(class105.field2480 + arg4 - 15, arg2 - (-class18.field355 + 3), var26, 5, 65280);
                            class114.method891(var26 + class105.field2480 + arg4 - 15, arg2 + -3 - -class18.field355, 30 - var26, 5, 16711680);
                        }
                    }
                    for (int var27 = 0; var27 < 4; var27++) {
                        if (var21.field3547[var27] > class44.field1013) {
                            class128.method1047(var21, 114, var21.field3605 / 2);
                            if (class105.field2480 > -1) {
                                if (var27 == 1) {
                                    class18.field355 -= 20;
                                }
                                if (var27 == 2) {
                                    class18.field355 -= 10;
                                    class105.field2480 -= 15;
                                }
                                if (var27 == 3) {
                                    class18.field355 -= 10;
                                    class105.field2480 += 15;
                                }
                                class93.field2195[var21.field3559[var27]].method46(arg4 + class105.field2480 - 12, arg2 + -12 + class18.field355);
                                class87.field2039.method724(class19.method140(var21.field3544[var27], -78), arg4 + class105.field2480 - 1, arg2 + 3 + class18.field355, 16777215, 0);
                            }
                        }
                    }
                }
            }
            var5++;
        }
        for (int var6 = 0; var6 < class125.field2892; var6++) {
            int var7 = class119.field2727[var6];
            int var8 = class119.field2699[var6];
            int var9 = class119.field2714[var6];
            boolean var10 = true;
            int var11 = class119.field2724[var6];
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class119.field2714[var20] - class119.field2724[var20] < var9 - -2 && var9 - var11 < class119.field2714[var20] + 2 && class119.field2727[var20] + class119.field2699[var20] > var7 - var8 && class119.field2727[var20] - class119.field2699[var20] < var7 + var8 && class119.field2714[var20] - class119.field2724[var20] < var9) {
                        var10 = true;
                        var9 = class119.field2714[var20] - class119.field2724[var20];
                    }
                }
            }
            class105.field2480 = class119.field2727[var6];
            class18.field355 = class119.field2714[var6] = var9;
            class136 var12 = class119.field2708[var6];
            if (class73.field1532 == 0) {
                int var13 = 16776960;
                if (class119.field2703[var6] < 6) {
                    var13 = class4.field82[class119.field2703[var6]];
                }
                if (class119.field2703[var6] == 6) {
                    var13 = class136.field3190 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class119.field2703[var6] == 7) {
                    var13 = class136.field3190 % 20 >= 10 ? 65535 : 255;
                }
                if (class119.field2703[var6] == 8) {
                    var13 = class136.field3190 % 20 < 10 ? 45056 : 8454016;
                }
                if (class119.field2703[var6] == 9) {
                    int var14 = 150 - class119.field2722[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 + 16384000 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 64780;
                    }
                }
                if (class119.field2703[var6] == 10) {
                    int var15 = 150 - class119.field2722[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 - (var15 - 100) * 5;
                    }
                }
                if (class119.field2703[var6] == 11) {
                    int var16 = 150 - class119.field2722[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 - 16318970;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class119.field2700[var6] == 0) {
                    class81.field1943.method724(var12, arg4 + class105.field2480, class18.field355 + arg2, var13, 0);
                }
                if (class119.field2700[var6] == 1) {
                    class81.field1943.method712(var12, class105.field2480 + arg4, class18.field355 + arg2, var13, 0, class136.field3190);
                }
                if (class119.field2700[var6] == 2) {
                    class81.field1943.method707(var12, class105.field2480 + arg4, arg2 - -class18.field355, var13, 0, class136.field3190);
                }
                if (class119.field2700[var6] == 3) {
                    class81.field1943.method713(var12, class105.field2480 + arg4, class18.field355 + arg2, var13, 0, class136.field3190, 150 - class119.field2722[var6]);
                }
                if (class119.field2700[var6] == 4) {
                    int var17 = (150 - class119.field2722[var6]) * (class81.field1943.method706(var12) - -100) / 150;
                    class114.method892(class105.field2480 + arg4 - 50, arg2, arg4 + class105.field2480 + 50, arg1 + arg2);
                    class81.field1943.method702(var12, arg4 + class105.field2480 + 50 - var17, class18.field355 + arg2, var13, 0);
                    class114.method902(arg4, arg2, arg0 + arg4, arg2 - -arg1);
                }
                if (class119.field2700[var6] == 5) {
                    int var18 = 150 - class119.field2722[var6];
                    class114.method892(arg4, arg2 + class18.field355 - class81.field1943.field2225 - 1, arg0 + arg4, arg2 + class18.field355 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class81.field1943.method724(var12, arg4 + class105.field2480, arg2 - -class18.field355 + var19, var13, 0);
                    class114.method902(arg4, arg2, arg0 + arg4, arg1 + arg2);
                }
            } else {
                class81.field1943.method724(var12, class105.field2480 + arg4, arg2 - -class18.field355, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lke;ILtd;)Ltd;")
    public static final class136 method1161(class74 arg0, int arg1, class136 arg2) {
        field3310++;
        if (arg2.method1100(class116.field2665, arg1 ^ arg1) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method1100(class155.field3612, arg1);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method1100(class99.field2397, 0);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method1100(class153.field3501, 0);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method1100(class40.field932, arg1);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method1100(class13.field262, 0);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method1100(class122.field2841, arg1);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class136 var9 = class37.field871;
                                                    if (class21.field423 != null) {
                                                        var9 = class43.method353(class21.field423.field3439, 1674879824);
                                                        try {
                                                            if (class21.field423.field3441 != null) {
                                                                byte[] var10 = ((String) class21.field423.field3441).getBytes("ISO-8859-1");
                                                                var9 = class131.method1066(var10, arg1 - 24256, 0, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class79.method570(0, new class136[] { arg2.method1105(0, (byte) -7, var8), var9, arg2.method1108(var8 + 4, -16621) });
                                                }
                                            }
                                            arg2 = class79.method570(0, new class136[] { arg2.method1105(0, (byte) -7, var7), class133.method1071(class141.method1147(4, (byte) -121, arg0), (byte) -123), arg2.method1108(var7 + 2, -16621) });
                                        }
                                    }
                                    arg2 = class79.method570(arg1, new class136[] { arg2.method1105(0, (byte) -7, var6), class133.method1071(class141.method1147(3, (byte) 95, arg0), (byte) -126), arg2.method1108(var6 + 2, -16621) });
                                }
                            }
                            arg2 = class79.method570(0, new class136[] { arg2.method1105(0, (byte) -7, var5), class133.method1071(class141.method1147(2, (byte) -108, arg0), (byte) -94), arg2.method1108(var5 + 2, -16621) });
                        }
                    }
                    arg2 = class79.method570(0, new class136[] { arg2.method1105(0, (byte) -7, var4), class133.method1071(class141.method1147(1, (byte) 89, arg0), (byte) -90), arg2.method1108(var4 + 2, -16621) });
                }
            }
            arg2 = class79.method570(0, new class136[] { arg2.method1105(0, (byte) -7, var3), class133.method1071(class141.method1147(0, (byte) 65, arg0), (byte) -104), arg2.method1108(var3 + 2, -16621) });
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JZ)Lva;")
    public final class145 method1162(long arg0, boolean arg1) {
        field3313++;
        class145 var4 = (class145) this.field3324.method109(111, arg0);
        if (var4 != null) {
            this.field3327.method156(-30773, var4);
        }
        if (!arg1) {
            field3321 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1163(int arg0, int arg1, byte arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        field3308++;
        class128 var3 = class142.method1154(arg1, -81);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return arg2 >= -53 ? false : var3.method1056(true, arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JLva;B)V")
    public final void method1164(long arg0, class145 arg1, byte arg2) {
        field3306++;
        if (this.field3325 == 0) {
            class145 var5 = this.field3327.method154(64);
            var5.method674(32);
            var5.method1171(true);
            if (this.field3309 == var5) {
                class145 var6 = this.field3327.method154(32);
                var6.method674(32);
                var6.method1171(true);
            }
        } else {
            this.field3325--;
        }
        this.field3324.method112(arg1, (byte) 3, arg0);
        this.field3327.method156(-30773, arg1);
        if (arg2 <= 125) {
            method1159(-23);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public final void method1165(byte arg0) {
        field3314++;
        if (arg0 != -73) {
            return;
        }
        while (true) {
            class145 var2 = this.field3327.method154(61);
            if (var2 == null) {
                this.field3325 = this.field3323;
                return;
            }
            var2.method674(32);
            var2.method1171(true);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IJ)V")
    public final void method1166(int arg0, long arg1) {
        int var4 = -56 % ((44 - arg0) / 61);
        field3317++;
        class145 var5 = (class145) this.field3324.method109(102, arg1);
        if (var5 != null) {
            var5.method674(32);
            var5.method1171(true);
            this.field3325++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIBI)I")
    public static final int method1167(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 65536 - class103.field2452[arg1 * 1024 / arg2] >> 1;
        field3312++;
        int var6 = -108 / ((arg3 + 67) / 32);
        return ((65536 - var5) * arg0 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V")
    public class143(int arg0) {
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3325 = arg0;
        this.field3323 = arg0;
        this.field3324 = new class15(var2);
    }
}
