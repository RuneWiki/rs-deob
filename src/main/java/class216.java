import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class216 {

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "Lkr;")
    private class693 field3055 = new class693();

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "Ljava/lang/String;")
    public String field3048;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "[F")
    public static float[] field3046 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "Ldca;")
    public static class160 field3051 = new class160();

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
    private volatile int field3063;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "Lei;")
    private class161 field3059;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "[[Lvv;")
    public static class295[][] field3061;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lkc;I)V")
    public final void method1386(class118 arg0, int arg1) {
        field3049++;
        class693 var3 = this.field3055;
        synchronized (this.field3055) {
            if (arg1 <= 87) {
                return;
            }
            this.field3055.method3906(arg0, (byte) -19);
            this.field3063++;
        }
        if (this.field3059 != null) {
            class161 var4 = this.field3059;
            synchronized (this.field3059) {
                this.field3059.notify();
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z")
    public final boolean method1387(int arg0) {
        field3060++;
        int var2 = -10 / ((arg0 + 8) / 32);
        return this.field3063 == 0;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZB)V")
    public static final void method1388(boolean arg0, byte arg1) {
        field3053++;
        if (arg1 != -59) {
            field3051 = null;
        }
        for (class389 var2 = (class389) class327.field4437.method1436(arg1 + 29023); var2 != null; var2 = (class389) class327.field4437.method1443((byte) 6)) {
            if (var2.field5499 != null) {
                class61.field680.method1464(var2.field5499);
                var2.field5499 = null;
            }
            if (var2.field5503 != null) {
                class61.field680.method1464(var2.field5503);
                var2.field5503 = null;
            }
            var2.method2340(-48);
        }
        if (!arg0) {
            return;
        }
        for (class389 var3 = (class389) class552.field7451.method1436(28964); var3 != null; var3 = (class389) class552.field7451.method1443((byte) 6)) {
            if (var3.field5499 != null) {
                class61.field680.method1464(var3.field5499);
                var3.field5499 = null;
            }
            var3.method2340(-41);
        }
        for (class389 var4 = (class389) class122.field1683.method977(0); var4 != null; var4 = (class389) class122.field1683.method975(-1)) {
            if (var4.field5499 != null) {
                class61.field680.method1464(var4.field5499);
                var4.field5499 = null;
            }
            var4.method2340(113);
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)Lia;")
    public final class546 method1389(int arg0) {
        field3058++;
        if (arg0 <= 52) {
            this.field3048 = null;
        }
        Object var2 = null;
        class693 var3 = this.field3055;
        synchronized (this.field3055) {
            class546 var4 = this.field3055.method3898((byte) -71);
            var4.method3074((byte) 48);
            this.field3063--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILei;)V")
    public final void method1390(int arg0, class161 arg1) {
        if (arg0 == 0) {
            this.field3059 = arg1;
            field3054++;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)I")
    public static final int method1391(int arg0, int arg1, int arg2, int arg3) {
        field3056++;
        if (arg1 < 21) {
            return -4;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lvv;I)V")
    public final void method1392(class295 arg0, int arg1) {
        arg0.field4048 = false;
        if (arg1 != -2) {
            field3046 = null;
        }
        field3052++;
        class693 var3 = this.field3055;
        synchronized (this.field3055) {
            this.field3055.method3906(arg0, (byte) -19);
            this.field3063++;
        }
        if (this.field3059 != null) {
            class161 var4 = this.field3059;
            synchronized (this.field3059) {
                this.field3059.notify();
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V")
    public static void method1393(int arg0) {
        field3061 = null;
        field3046 = null;
        if (arg0 != 6145) {
            method1393(-97);
        }
        field3051 = null;
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
    public static final void method1394(int arg0) {
        field3057++;
        if (class37.field444 > 1) {
            class700.field9934 = class436.field6066;
            class37.field444--;
        }
        if (class700.field9933) {
            class700.field9933 = false;
            class455.method2586(true);
            return;
        }
        if (!class541.field7327) {
            class6.method18((byte) 114);
        }
        for (int var1 = 0; var1 < 100 && class436.method2494(127); var1++) {
        }
        if (class285.field3921 != 10) {
            return;
        }
        while (class357.method2048((byte) -122)) {
            class352 var2 = class290.method1786(98, class199.field2836, class418.field5909);
            var2.field4686.method2817(0, true);
            int var3 = var2.field4686.field6892;
            class315.method1908(arg0 + 17484, var2.field4686);
            var2.field4686.method2847(-8, var2.field4686.field6892 - var3);
            class602.method3388(var2, (byte) 28);
        }
        if (class108.field1501 == null) {
            if (class577.method3295((byte) 15) >= class706.field9973) {
                class108.field1501 = class531.field7185.method2901(class651.field9040.field2472, 15328);
            }
        } else if (class108.field1501.field2204 != -1) {
            class352 var4 = class290.method1786(98, class199.field2836, class342.field4589);
            var4.field4686.method2837(class108.field1501.field2204, arg0 + 17478);
            class602.method3388(var4, (byte) 28);
            class108.field1501 = null;
            class706.field9973 = class577.method3295((byte) 15) + 30000L;
        }
        class639 var5 = (class639) class508.field6960.method1436(28964);
        if (var5 != null || class118.field1594 < (class577.method3295((byte) 15) - 2000L)) {
            class352 var6 = null;
            int var7 = 0;
            for (class639 var8 = (class639) class368.field4958.method1436(28964); var8 != null && (var6 == null || var6.field4686.field6892 - var7 < 240); var8 = (class639) class368.field4958.method1443((byte) 6)) {
                var8.method2340(-59);
                int var9 = var8.method1010(-115);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1014(false);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class109.field1513 != var10 || class511.field7025 != var9) {
                    if (var6 == null) {
                        var6 = class290.method1786(arg0 ^ 0xFFFFBBDA, class199.field2836, class148.field2196);
                        class657.field9133++;
                        var6.field4686.method2817(0, true);
                        var7 = var6.field4686.field6892;
                    }
                    int var11 = var10 - class109.field1513;
                    class109.field1513 = var10;
                    int var12 = var9 - class511.field7025;
                    class511.field7025 = var9;
                    int var13 = (int) ((var8.method1012(-15665) - class118.field1594) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field4686.method2837((var11 << 6) + (var13 << 12) + var12, -2);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var6.field4686.method2817(var13 + 128, true);
                        var12 += 128;
                        var6.field4686.method2837((var11 << 8) + var12, -2);
                    } else if (var13 >= 32) {
                        var6.field4686.method2837(var13 + 57344, -2);
                        if (var10 == 1 || var9 == -1) {
                            var6.field4686.method2836(Integer.MIN_VALUE, -22164);
                        } else {
                            var6.field4686.method2836(var9 << 16 | var10, -22164);
                        }
                    } else {
                        var6.field4686.method2817(var13 + 192, true);
                        if (var10 == 1 || var9 == -1) {
                            var6.field4686.method2836(Integer.MIN_VALUE, -22164);
                        } else {
                            var6.field4686.method2836(var9 << 16 | var10, -22164);
                        }
                    }
                    class118.field1594 = var8.method1012(arg0 ^ 0x7977);
                }
            }
            if (var6 != null) {
                var6.field4686.method2847(-8, var6.field4686.field6892 - var7);
                class602.method3388(var6, (byte) 28);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1012(-15665) - class598.field8353) / 50L;
            class598.field8353 = var5.method1012(-15665);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method1010(-95);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1014(false);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1013(731) == 2) {
                var18 = 1;
            }
            class36.field436++;
            int var19 = (int) var14;
            class352 var20 = class290.method1786(arg0 ^ 0xFFFFBBDA, class199.field2836, class309.field4276);
            var20.field4686.method2836(var17 | var16 << 16, -22164);
            var20.field4686.method2823(var18 << 15 | var19, 103);
            class602.method3388(var20, (byte) 28);
        }
        if (class390.field5523 > 0) {
            class454.field6291++;
            class352 var21 = class290.method1786(98, class199.field2836, class202.field2856);
            var21.field4686.method2817(class390.field5523 * 3, true);
            for (int var22 = 0; var22 < class390.field5523; var22++) {
                class305 var23 = class677.field9670[var22];
                long var24 = (var23.method1851(30371) - class529.field7172) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class529.field7172 = var23.method1851(30371);
                var21.field4686.method2817(var23.method1852(arg0 ^ 0xFFFFD7B8), true);
                var21.field4686.method2837((int) var24, -2);
            }
            class602.method3388(var21, (byte) 28);
        }
        if (class487.field6691 > 0) {
            class487.field6691--;
        }
        if (class498.field6773 && class487.field6691 <= 0) {
            class498.field6773 = false;
            class657.field9132++;
            class487.field6691 = 20;
            class352 var26 = class290.method1786(98, class199.field2836, class99.field1384);
            var26.field4686.method2812(35, (int) class705.field9964 >> 3);
            var26.field4686.method2812(arg0 ^ 0xFFFFBBC3, (int) class228.field3168 >> 3);
            class602.method3388(var26, (byte) 28);
        }
        if (class556.field7487 != class48.field578) {
            class48.field578 = class556.field7487;
            class553.field7465++;
            class352 var27 = class290.method1786(98, class199.field2836, class248.field3392);
            var27.field4686.method2817(class556.field7487 ? 1 : 0, true);
            class602.method3388(var27, (byte) 28);
        }
        if (!class186.field2709) {
            class64.field761++;
            class352 var28 = class290.method1786(98, class199.field2836, class410.field5835);
            var28.field4686.method2817(0, true);
            int var29 = var28.field4686.field6892;
            class501 var30 = new class501(class159.method1126(100));
            class366.field4875.method3768((byte) 75, var30);
            var28.field4686.method2873(var30.field6892, 0, var30.field6855, -29981);
            var28.field4686.method2847(-8, var28.field4686.field6892 - var29);
            class602.method3388(var28, (byte) 28);
            class186.field2709 = true;
        }
        if (class295.field4051 != null) {
            if (class203.field2863 == 2) {
                class302.method1840(arg0 + 17353);
            } else if (class203.field2863 == 3) {
                class287.method1766(arg0 + 17480);
            }
        }
        if (class486.field6678) {
            class486.field6678 = false;
        } else {
            class367.field4942 /= 2.0F;
        }
        if (class339.field4548) {
            class339.field4548 = false;
        } else {
            class299.field4077 /= 2.0F;
        }
        class8.method26(11);
        if (class285.field3921 != 10) {
            return;
        }
        class116.method826(arg0 ^ 0xFFFFBC68);
        class605.method3402(arg0 + 7783);
        class548.method3082(0);
        class219.field3066++;
        if (class219.field3066 > 750) {
            class455.method2586(true);
            return;
        }
        class581.method3315((byte) -99);
        class367.method2125((byte) -79);
        class138.method964(false);
        for (int var31 = class578.field8156.method872((byte) -87, true); var31 != -1; var31 = class578.field8156.method872((byte) -102, false)) {
            class139.method973(var31, (byte) 123);
            class534.field7219[class136.method950(31, class29.field365++)] = var31;
        }
        for (class51 var32 = class425.method2451(arg0 ^ arg0); var32 != null; var32 = class425.method2451(0)) {
            int var33 = var32.method406(true);
            int var34 = var32.method405(255);
            if (var33 == 1) {
                class324.field4421[var34] = var32.field603;
                class9.field90 |= class588.field8266[var34];
                class54.field611[class136.method950(class119.field1630++, 31)] = var34;
            } else if (var33 == 2) {
                class675.field9526[var34] = var32.field600;
                class250.field3409[class136.method950(class703.field9946++, 31)] = var34;
            } else if (var33 == 3) {
                class78 var57 = class582.method3319((byte) -39, var34);
                if (!var32.field600.equals(var57.field1083)) {
                    var57.field1083 = var32.field600;
                    class26.method255(var57, -20229);
                }
            } else if (var33 == 4) {
                class78 var53 = class582.method3319((byte) -128, var34);
                int var54 = var32.field603;
                int var55 = var32.field605;
                int var56 = var32.field604;
                if (var53.field1084 != var54 || var53.field1114 != var55 || var53.field1127 != var56) {
                    var53.field1084 = var54;
                    var53.field1127 = var56;
                    var53.field1114 = var55;
                    class26.method255(var53, arg0 - 2749);
                }
            } else if (var33 == 5) {
                class78 var35 = class582.method3319((byte) -113, var34);
                if (var32.field603 != var35.field1028 || var32.field603 == -1) {
                    var35.field1045 = 1;
                    var35.field1176 = 0;
                    var35.field1028 = var32.field603;
                    var35.field1037 = 0;
                    class403 var36 = var35.field1028 == -1 ? null : class192.field2727.method3090(-123, var35.field1028);
                    if (var36 != null) {
                        class623.method3463(var36, var35.field1037, (byte) 36);
                    }
                    class26.method255(var35, -20229);
                }
            } else if (var33 == 6) {
                int var47 = var32.field603;
                int var48 = (var47 & 0x7DBB) >> 10;
                int var49 = var47 >> 5 & 0x1F;
                int var50 = var47 & 0x1F;
                int var51 = (var48 << 19) + (var49 << 11) + (var50 << 3);
                class78 var52 = class582.method3319((byte) -16, var34);
                if (var52.field1180 != var51) {
                    var52.field1180 = var51;
                    class26.method255(var52, -20229);
                }
            } else if (var33 == 7) {
                class78 var37 = class582.method3319((byte) -88, var34);
                boolean var38 = var32.field603 == 1;
                if (var37.field1059 != var38) {
                    var37.field1059 = var38;
                    class26.method255(var37, arg0 - 2749);
                }
            } else if (var33 == 8) {
                class78 var39 = class582.method3319((byte) -96, var34);
                if (var32.field603 != var39.field1097 || var32.field605 != var39.field1163 || var32.field604 != var39.field1155) {
                    var39.field1097 = var32.field603;
                    var39.field1163 = var32.field605;
                    var39.field1155 = var32.field604;
                    if (var39.field1145 != -1) {
                        if (var39.field1039 > 0) {
                            var39.field1155 = var39.field1155 * 32 / var39.field1039;
                        } else if (var39.field1085 > 0) {
                            var39.field1155 = var39.field1155 * 32 / var39.field1085;
                        }
                    }
                    class26.method255(var39, -20229);
                }
            } else if (var33 == 9) {
                class78 var46 = class582.method3319((byte) -14, var34);
                if (var32.field603 != var46.field1145 || var32.field605 != var46.field1095) {
                    var46.field1145 = var32.field603;
                    var46.field1095 = var32.field605;
                    class26.method255(var46, -20229);
                }
            } else if (var33 == 10) {
                class78 var40 = class582.method3319((byte) -51, var34);
                if (var32.field603 != var40.field1160 || var32.field605 != var40.field1016 || var32.field604 != var40.field1092) {
                    var40.field1016 = var32.field605;
                    var40.field1092 = var32.field604;
                    var40.field1160 = var32.field603;
                    class26.method255(var40, -20229);
                }
            } else if (var33 == 11) {
                class78 var45 = class582.method3319((byte) -26, var34);
                var45.field1078 = var45.field1018 = var32.field603;
                var45.field1169 = 0;
                var45.field1081 = var45.field1135 = var32.field605;
                var45.field1029 = 0;
                class26.method255(var45, arg0 - 2749);
            } else if (var33 == 12) {
                class78 var41 = class582.method3319((byte) -86, var34);
                int var42 = var32.field603;
                if (var41 != null && var41.field1075 == 0) {
                    if ((var41.field1128 - var41.field1050) < var42) {
                        var42 = var41.field1128 - var41.field1050;
                    }
                    if (var42 < 0) {
                        var42 = 0;
                    }
                    if (var41.field1170 != var42) {
                        var41.field1170 = var42;
                        class26.method255(var41, -20229);
                    }
                }
            } else if (var33 == 14) {
                class78 var44 = class582.method3319((byte) -83, var34);
                var44.field1136 = var32.field603;
            } else if (var33 == 15) {
                class583.field8209 = true;
                class525.field7124 = var32.field603;
                class289.field3961 = var32.field605;
            } else if (var33 == 16) {
                class78 var43 = class582.method3319((byte) -82, var34);
                var43.field1033 = var32.field603;
            }
        }
        class41.field479++;
        if (class543.field7378 != 0) {
            class333.field4489 += 20;
            if (class333.field4489 >= 400) {
                class543.field7378 = 0;
            }
        }
        if (class65.field853 != null) {
            class80.field1208++;
            if (class80.field1208 >= 15) {
                class26.method255(class65.field853, -20229);
                class65.field853 = null;
            }
        }
        class198.field2824 = false;
        class482.field6625 = null;
        class118.field1597 = false;
        class289.field3960 = null;
        class323.method1936(null, -1, arg0 ^ 0x443A, -1);
        class419.method2431(-1, -78, null, -1);
        if (!class426.field5971) {
            class112.field1563 = -1;
        }
        class452.method2569(0);
        class436.field6066++;
        if (class358.field4749) {
            class138.field1959++;
            class352 var58 = class290.method1786(98, class199.field2836, class539.field7279);
            var58.field4686.method2860(class458.field6352 | class314.field4338 << 28 | class613.field8520 << 14, (byte) 115);
            class602.method3388(var58, (byte) 28);
            class358.field4749 = false;
        }
        while (true) {
            class368 var59;
            class78 var60;
            class78 var61;
            do {
                var59 = (class368) class95.field1335.method1442(-10011);
                if (var59 == null) {
                    while (true) {
                        class368 var62;
                        class78 var63;
                        class78 var64;
                        do {
                            var62 = (class368) class68.field920.method1442(-10011);
                            if (var62 == null) {
                                while (true) {
                                    class368 var65;
                                    class78 var66;
                                    class78 var67;
                                    do {
                                        var65 = (class368) class69.field940.method1442(-10011);
                                        if (var65 == null) {
                                            if (class289.field3960 == null) {
                                                class614.field8574 = 0;
                                            }
                                            if (class396.field5579 != null) {
                                                class159.method1125(false);
                                            }
                                            if (class296.field4060 > 0 && class353.field4698.method34(82, -16215) && class353.field4698.method34(81, arg0 + 1265) && class26.field322 != 0) {
                                                int var68 = class143.field2063.field4053 - class26.field322;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class570.method3265(var68, class143.field2063.field1807[0] + class498.field6774, arg0 ^ 0xFFFFBBB9, class613.field8555 + class143.field2063.field1801[0]);
                                            }
                                            class578.method3299(false);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class81.field1215[var69]++;
                                            }
                                            if (class9.field90 && class282.field3848 < (class577.method3295((byte) 15) - 60000L)) {
                                                class235.method1477(-28971);
                                            }
                                            for (class559 var70 = (class559) class562.field7588.method3898((byte) -77); var70 != null; var70 = (class559) class562.field7588.method3902(true)) {
                                                if (class577.method3295((byte) 15) / 1000L - 5L > (long) var70.field7534) {
                                                    if (var70.field7537 > 0) {
                                                        class628.method3510("", -1, 0, 5, "", var70.field7535 + class65.field807.method555(class697.field9900, true), "");
                                                    }
                                                    if (var70.field7537 == 0) {
                                                        class628.method3510("", -1, 0, 5, "", var70.field7535 + class65.field808.method555(class697.field9900, true), "");
                                                    }
                                                    var70.method3074((byte) 48);
                                                }
                                            }
                                            class547.field7410++;
                                            if (class547.field7410 > 500) {
                                                class547.field7410 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x1) == 1) {
                                                    class166.field2416 += class259.field3522;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class568.field8077 += class407.field5703;
                                                }
                                                if ((var71 & 0x2) == 2) {
                                                    class607.field8447 += class24.field302;
                                                }
                                            }
                                            if (class166.field2416 < -50) {
                                                class259.field3522 = 2;
                                            }
                                            if (class607.field8447 < -55) {
                                                class24.field302 = 2;
                                            }
                                            if (class166.field2416 > 50) {
                                                class259.field3522 = -2;
                                            }
                                            if (class607.field8447 > 55) {
                                                class24.field302 = -2;
                                            }
                                            if (class568.field8077 < -40) {
                                                class407.field5703 = 1;
                                            }
                                            if (class568.field8077 > 40) {
                                                class407.field5703 = -1;
                                            }
                                            class180.field2607++;
                                            if (class180.field2607 > 500) {
                                                class180.field2607 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x2) == 2) {
                                                    field3062 += class663.field9304;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class174.field2526 += class184.field2668;
                                                }
                                            }
                                            if (class174.field2526 < -60) {
                                                class184.field2668 = 2;
                                            }
                                            if (class174.field2526 > 60) {
                                                class184.field2668 = -2;
                                            }
                                            if (field3062 < -20) {
                                                class663.field9304 = 1;
                                            }
                                            if (field3062 > 10) {
                                                class663.field9304 = -1;
                                            }
                                            class43.field515++;
                                            if (class43.field515 > 50) {
                                                class28.field349++;
                                                class352 var73 = class290.method1786(arg0 ^ 0xFFFFBBDA, class199.field2836, class355.field4718);
                                                class602.method3388(var73, (byte) 28);
                                            }
                                            if (class43.field509) {
                                                class696.method3909((byte) -76);
                                                class43.field509 = false;
                                            }
                                            try {
                                                class224.method1413((byte) 6);
                                                return;
                                            } catch (IOException var74) {
                                                class455.method2586(true);
                                                return;
                                            }
                                        }
                                        var66 = var65.field4957;
                                        if (var66.field1034 < 0) {
                                            break;
                                        }
                                        var67 = class582.method3319((byte) -26, var66.field1178);
                                    } while (var67 == null || var67.field1046 == null || var67.field1046.length <= var66.field1034 || var67.field1046[var66.field1034] != var66);
                                    class97.method708(var65);
                                }
                            }
                            var63 = var62.field4957;
                            if (var63.field1034 < 0) {
                                break;
                            }
                            var64 = class582.method3319((byte) -34, var63.field1178);
                        } while (var64 == null || var64.field1046 == null || var63.field1034 >= var64.field1046.length || var64.field1046[var63.field1034] != var63);
                        class97.method708(var62);
                    }
                }
                var60 = var59.field4957;
                if (var60.field1034 < 0) {
                    break;
                }
                var61 = class582.method3319((byte) -18, var60.field1178);
            } while (var61 == null || var61.field1046 == null || var61.field1046.length <= var60.field1034 || var61.field1046[var60.field1034] != var60);
            class97.method708(var59);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lpn;B)I")
    public static final int method1395(class692 arg0, byte arg1) {
        field3050++;
        if (arg1 >= -61) {
            return 37;
        } else if (class46.field554 == arg0) {
            return 6407;
        } else if (class129.field1851 == arg0) {
            return 6408;
        } else if (class559.field7539 == arg0) {
            return 6406;
        } else if (class301.field4189 == arg0) {
            return 6409;
        } else if (class283.field3875 == arg0) {
            return 6410;
        } else if (class309.field4277 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILvv;)V")
    public final void method1396(int arg0, class295 arg1) {
        field3047++;
        arg1.field4048 = true;
        class693 var3 = this.field3055;
        synchronized (this.field3055) {
            this.field3055.method3906(arg1, (byte) -19);
            this.field3063++;
        }
        if (this.field3059 != null) {
            class161 var4 = this.field3059;
            synchronized (this.field3059) {
                this.field3059.notify();
            }
        }
        if (arg0 != -10) {
            this.method1386(null, -101);
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class216(String arg0) {
        this.field3048 = arg0;
    }
}
