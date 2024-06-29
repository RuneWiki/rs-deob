import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class162 {

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "Lng;")
    private class79 field2445 = new class79();

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Lpf;")
    private class305 field2437;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2436 = "Loaded defaults";

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Z")
    public static boolean field2438 = false;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lub;")
    public static class92 field2423;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lub;")
    public static class92 field2430;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "[Lel;")
    public static class213[] field2433;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[S")
    public static short[] field2443;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
    public final void method1166(byte arg0, int arg1) {
        if (class120.field1812 != null) {
            for (class230 var3 = (class230) this.field2445.method620((byte) 84); var3 != null; var3 = (class230) this.field2445.method626((byte) 116)) {
                if (var3.method347((byte) -102)) {
                    if (var3.method348(-91) == null) {
                        var3.method995((byte) -114);
                        var3.method1463((byte) -108);
                        this.field2422++;
                    }
                } else if (++var3.field3237 > (long) arg1) {
                    class230 var4 = class120.field1812.method1576(120, var3);
                    this.field2437.method2046(var4, -57, var3.field2009);
                    class2.method4(var4, arg0 - 23, var3);
                    var3.method995((byte) -120);
                    var3.method1463((byte) -105);
                }
            }
        }
        field2428++;
        if (arg0 != 23) {
            this.method1166((byte) 126, 41);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/Object;J)V")
    public final void method1167(byte arg0, Object arg1, long arg2) {
        field2424++;
        this.method1168(arg2, 115);
        if (this.field2422 == 0) {
            class230 var5 = (class230) this.field2445.method617((byte) 114);
            var5.method995((byte) 47);
            var5.method1463((byte) -117);
        } else {
            this.field2422--;
        }
        int var6 = 17 / ((52 - arg0) / 40);
        class306 var7 = new class306(arg1);
        this.field2437.method2046(var7, -104, arg2);
        this.field2445.method621(var7, (byte) -89);
        var7.field3237 = 0L;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(JI)V")
    public final void method1168(long arg0, int arg1) {
        field2442++;
        class230 var4 = (class230) this.field2437.method2043(arg0, -1);
        if (var4 != null) {
            var4.method995((byte) 28);
            var4.method1463((byte) -111);
            this.field2422++;
        }
        if (arg1 < 13) {
            field2438 = false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public final void method1169(boolean arg0) {
        field2432++;
        for (class230 var2 = (class230) this.field2445.method620((byte) 94); var2 != null; var2 = (class230) this.field2445.method626((byte) 116)) {
            if (var2.method347((byte) -28)) {
                var2.method995((byte) -106);
                var2.method1463((byte) -117);
                this.field2422++;
            }
        }
        if (!arg0) {
            method1174(-76);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)I")
    public final int method1170(int arg0) {
        field2434++;
        int var2 = arg0;
        for (class230 var3 = (class230) this.field2445.method620((byte) 127); var3 != null; var3 = (class230) this.field2445.method626((byte) 116)) {
            if (!var3.method347((byte) -73)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method1171(int arg0) {
        field2441++;
        class41.field683.method1172((byte) 117);
        if (arg0 != 128) {
            field2427 = 58;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public final void method1172(byte arg0) {
        this.field2445.method627((byte) 114);
        this.field2437.method2044(0);
        if (arg0 >= 108) {
            this.field2422 = this.field2426;
            field2431++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
    public final Object method1173(long arg0, boolean arg1) {
        field2429++;
        class230 var4 = (class230) this.field2437.method2043(arg0, -1);
        if (var4 == null) {
            return null;
        }
        if (!arg1) {
            method1175(false);
        }
        Object var5 = var4.method348(-53);
        if (var5 == null) {
            var4.method995((byte) -114);
            var4.method1463((byte) -116);
            this.field2422++;
            return null;
        }
        if (var4.method347((byte) -4)) {
            class306 var6 = new class306(var5);
            this.field2437.method2046(var6, -97, var4.field2009);
            this.field2445.method621(var6, (byte) -88);
            var6.field3237 = 0L;
            var4.method995((byte) -120);
            var4.method1463((byte) -113);
        } else {
            this.field2445.method621(var4, (byte) -116);
            var4.field3237 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static final void method1174(int arg0) {
        class161.field2412++;
        field2439++;
        class240.field3826.method1762(239, true);
        class240.field3826.method305(class194.method1382(true), true);
        class240.field3826.method281((byte) -123, class179.field2816);
        class240.field3826.method281((byte) -125, class163.field2449);
        if (arg0 == 0) {
            class240.field3826.method305(class52.field825, true);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
    public static final void method1175(boolean arg0) {
        if (!arg0) {
            method1175(false);
        }
        while (true) {
            class220 var1;
            class296 var3;
            do {
                var1 = (class220) class257.field4087.method8(7);
                if (var1 == null) {
                    field2444++;
                    return;
                }
                if (var1.field3352 >= 0) {
                    int var2 = var1.field3352 - 1;
                    var3 = class116.field1781[var2];
                } else {
                    int var4 = -var1.field3352 - 1;
                    if (class107.field1677 == var4) {
                        var3 = class263.field4168;
                    } else {
                        var3 = class233.field3682[var4];
                    }
                }
            } while (var3 == null);
            class295 var5 = class166.method1209(103, var1.field3362);
            int var6;
            int var7;
            if (var1.field3368 == 1 || var1.field3368 == 3) {
                var7 = var5.field4592;
                var6 = var5.field4620;
            } else {
                var6 = var5.field4592;
                var7 = var5.field4620;
            }
            int var8 = (var7 >> 1) + var1.field3367;
            int var9 = (var7 + 1 >> 1) + var1.field3367;
            int var10 = (var6 >> 1) + var1.field3349;
            int var11 = (var6 + 1 >> 1) + var1.field3349;
            int[][] var12 = class233.field3684[class130.field1941];
            class55 var13 = null;
            int var14 = var12[var9][var10] + var12[var8][var10] - (-var12[var8][var11] - var12[var9][var11]) >> 2;
            int var15 = class280.field4431[var1.field3351];
            if (var15 == 0) {
                class163 var16 = class156.method1129(class130.field1941, var1.field3367, var1.field3349);
                if (var16 != null) {
                    var13 = var16.field2456;
                }
            } else if (var15 == 1) {
                class56 var17 = class230.method1582(class130.field1941, var1.field3367, var1.field3349);
                if (var17 != null) {
                    var13 = var17.field886;
                }
            } else if (var15 == 2) {
                class19 var18 = class138.method1023(class130.field1941, var1.field3367, var1.field3349);
                if (var18 != null) {
                    var13 = var18.field266;
                }
            } else if (var15 == 3) {
                class106 var19 = class118.method861(class130.field1941, var1.field3367, var1.field3349);
                if (var19 != null) {
                    var13 = var19.field1664;
                }
            }
            if (var13 != null) {
                class125.method937(var1.field3367, var1.field3358 + 1, (byte) -128, var1.field3349, class130.field1941, 0, -1, 0, var1.field3354 + 1, var15);
                var3.field4704 = var13;
                int var20 = var1.field3364;
                int var21 = var1.field3363;
                int var22 = var1.field3350;
                var3.field4731 = class41.field686 + var1.field3358;
                var3.field4692 = var14;
                var3.field4689 = var1.field3349 * 128 + (var6 * 64);
                var3.field4664 = var1.field3354 + class41.field686;
                var3.field4686 = var1.field3367 * 128 + var7 * 64;
                if (var20 > var21) {
                    int var23 = var20;
                    var20 = var21;
                    var21 = var23;
                }
                var3.field4726 = var1.field3367 + var21;
                int var24 = var1.field3353;
                if (var22 > var24) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field4770 = var1.field3367 + var20;
                var3.field4678 = var1.field3349 + var22;
                var3.field4721 = var1.field3349 + var24;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public static final void method1176(int arg0, int arg1, int arg2) {
        class69 var3 = class255.method1723((byte) 32, arg0, 6);
        var3.method556((byte) -109);
        var3.field1091 = arg1;
        field2425++;
        if (arg2 > -77) {
            field2433 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
    public static void method1177(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2433 = null;
        field2430 = null;
        field2443 = null;
        field2436 = null;
        field2423 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
    public class162(int arg0) {
        this.field2422 = arg0;
        this.field2426 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2437 = new class305(var2);
    }
}
