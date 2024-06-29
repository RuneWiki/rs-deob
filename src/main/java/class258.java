import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class258 extends class86 {

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    private int field3950 = 4096;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    private int field3953 = 2048;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    private int field3954 = 0;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    private int field3958 = 2048;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    private int field3960 = 12288;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    private int field3957 = 0;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    private int field3961 = 8192;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "Z")
    public static boolean field3951 = true;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V", line = 4)
    public static final void method1899(int arg0) {
        class246.method1852(3, false);
        field3956++;
        if (arg0 <= 5) {
            field3948 = 97;
        }
        class106.field1600 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class37.field570.length; var2++) {
            if (class360.field5714[var2] != -1 && class37.field570[var2] == null) {
                class37.field570[var2] = class181.field2856.method187(class360.field5714[var2], 0, -1);
                if (class37.field570[var2] == null) {
                    var1 = false;
                    class106.field1600++;
                }
            }
            if (class135.field2254[var2] != -1 && class22.field336[var2] == null) {
                class22.field336[var2] = class181.field2856.method192(0, 1, class135.field2254[var2], class320.field4938[var2]);
                if (class22.field336[var2] == null) {
                    class106.field1600++;
                    var1 = false;
                }
            }
            if (class240.field3737) {
                if (class101.field1526[var2] != -1 && class244.field3797[var2] == null) {
                    class244.field3797[var2] = class181.field2856.method187(class101.field1526[var2], 0, -1);
                    if (class244.field3797[var2] == null) {
                        class106.field1600++;
                        var1 = false;
                    }
                }
                if (class348.field5528[var2] != -1 && class46.field738[var2] == null) {
                    class46.field738[var2] = class181.field2856.method187(class348.field5528[var2], 0, -1);
                    if (class46.field738[var2] == null) {
                        class106.field1600++;
                        var1 = false;
                    }
                }
            }
            if (class109.field1671 != null && class252.field3884[var2] == null && class109.field1671[var2] != -1) {
                class252.field3884[var2] = class181.field2856.method192(0, 1, class109.field1671[var2], class320.field4938[var2]);
                if (class252.field3884[var2] == null) {
                    class106.field1600++;
                    var1 = false;
                }
            }
        }
        if (class327.field5027 == null) {
            if (class91.field1351 == null || !class266.field4129.method193(class91.field1351.field898 + "_labels", (byte) 99)) {
                class327.field5027 = new class59(0);
            } else if (class266.field4129.method211(class91.field1351.field898 + "_labels", 85)) {
                class327.field5027 = class185.method1427(true, class91.field1351.field898 + "_labels", class266.field4129, class42.field668);
            } else {
                class106.field1600++;
                var1 = false;
            }
        }
        if (!var1) {
            class164.field2608 = 1;
            return;
        }
        class148.field2432 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class37.field570.length; var4++) {
            byte[] var5 = class22.field336[var4];
            if (var5 != null) {
                int var6 = (class292.field4540[var4] & 0xFF) * 64 - class49.field755;
                int var7 = (class292.field4540[var4] >> 8) * 64 - class358.field5696;
                if (class293.field4555) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class150.method1247(var6, var7, var5, (byte) -16);
            }
            if (class240.field3737) {
                byte[] var8 = class46.field738[var4];
                if (var8 != null) {
                    int var9 = (class292.field4540[var4] >> 8) * 64 - class358.field5696;
                    int var10 = (class292.field4540[var4] & 0xFF) * 64 - class49.field755;
                    if (class293.field4555) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class150.method1247(var10, var9, var8, (byte) -16);
                }
            }
        }
        if (!var3) {
            class164.field2608 = 2;
            return;
        }
        if (class164.field2608 != 0) {
            class307.method2198(-1, class268.field4134 + "<br>(100%)", true);
        }
        class102.method886(true);
        class190.method1451((byte) -127);
        boolean var11 = false;
        if (class240.field3737 && class164.field2603) {
            for (int var12 = 0; var12 < class37.field570.length; var12++) {
                if (class46.field738[var12] != null || class244.field3797[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class263.method1931(4, 104, 104, class240.field3737 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class57.field905[var13].method2097(2097152);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class146.field2386[var14][var15][var16] = 0;
                }
            }
        }
        class71.method676((byte) 12, false);
        if (class240.field3737) {
            class127.field2117.method716();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class127.field2116[var17][var18].field1059 = true;
                }
            }
        }
        if (class240.field3737) {
            class299.method2145();
        }
        if (class240.field3737) {
            class349.method2450((byte) 5);
        }
        class102.method886(true);
        System.gc();
        class246.method1852(3, true);
        class94.method838(104, false);
        if (!class293.field4555) {
            class25.method259(-2180, false);
            class246.method1852(3, true);
            if (class240.field3737) {
                int var19 = class173.field2746.field1300[0] >> 3;
                int var20 = class173.field2746.field1290[0] >> 3;
                class6.method43(var20, (byte) -47, var19);
            }
            class176.method1373(false, 25863);
            if (class252.field3884 != null) {
                class197.method1496(false);
            }
        }
        if (class293.field4555) {
            class222.method1664(false, true);
            class246.method1852(3, true);
            if (class240.field3737) {
                int var21 = class173.field2746.field1300[0] >> 3;
                int var22 = class173.field2746.field1290[0] >> 3;
                class6.method43(var22, (byte) -26, var21);
            }
            class352.method2487(false, 4);
        }
        class190.method1451((byte) -126);
        class246.method1852(3, true);
        class86.method783(class57.field905, -102, class293.field4555 ? class74.field1090 : (int[][][]) null, false);
        if (class240.field3737) {
            class299.method2148();
        }
        class246.method1852(3, true);
        int var23 = class176.field2782;
        if (var23 > class119.field1826) {
            var23 = class119.field1826;
        }
        if (class119.field1826 - 1 > var23) {
            int var24 = class119.field1826 - 1;
        }
        if (class158.method1282(false)) {
            class74.method695(0);
        } else {
            class74.method695(class176.field2782);
        }
        class191.method1455((byte) 125);
        if (class240.field3737 && var11) {
            class181.method1401(true);
            class94.method838(104, true);
            if (!class293.field4555) {
                class25.method259(-2180, true);
                class246.method1852(3, true);
                class176.method1373(true, 25863);
            }
            if (class293.field4555) {
                class222.method1664(true, true);
                class246.method1852(3, true);
                class352.method2487(true, 4);
            }
            class190.method1451((byte) -124);
            class246.method1852(3, true);
            class86.method783(class57.field905, -91, class293.field4555 ? class74.field1090 : (int[][][]) null, true);
            class246.method1852(3, true);
            class191.method1455((byte) 122);
            class181.method1401(false);
        }
        if (class240.field3737) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class127.field2116[var25][var26].method670(class277.field4290[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class18.method207(var28, var27, true);
            }
        }
        class318.method2246((byte) 0);
        class102.method886(true);
        class135.method1140((byte) -64);
        class190.method1451((byte) 59);
        class140.field2333 = false;
        if (class240.field3737) {
            class104.method902(true, (byte) 36);
        }
        if (class67.field1028 != null && class188.field2950 != null && class295.field4578 == 25) {
            class72.field1085++;
            class99.field1491.method1628((byte) -22, 193);
            class99.field1491.method310(68, 1057001181);
        }
        if (!class293.field4555) {
            int var29 = (class311.field4843 + 6) / 8;
            int var30 = (class297.field4602 + 6) / 8;
            int var31 = (class297.field4602 - 6) / 8;
            int var32 = (class311.field4843 - 6) / 8;
            for (int var33 = var32 - 1; var33 <= var29 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= var30 + 1; var34++) {
                    if (var32 > var33 || var33 > var29 || var31 > var34 || var30 < var34) {
                        class181.field2856.method202("m" + var33 + "_" + var34, -1);
                        class181.field2856.method202("l" + var33 + "_" + var34, -1);
                    }
                }
            }
        }
        if (class295.field4578 == 28) {
            class175.method1370(10, (byte) -83);
        } else {
            class175.method1370(30, (byte) -83);
            if (class188.field2950 != null) {
                class99.field1491.method1628((byte) -65, 130);
            }
        }
        class303.method2187(-11826);
        class102.method886(true);
        class63.method627(-33);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLug;)V", line = 525)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.field3958 = arg2.method314((byte) 100);
        } else if (arg0 == 1) {
            this.field3957 = arg2.method314((byte) 51);
        } else if (arg0 == 2) {
            this.field3954 = arg2.method314((byte) 95);
        } else if (arg0 == 3) {
            this.field3953 = arg2.method314((byte) 72);
        } else if (arg0 == 4) {
            this.field3960 = arg2.method314((byte) 53);
        } else if (arg0 == 5) {
            this.field3950 = arg2.method314((byte) 67);
        } else if (arg0 == 6) {
            this.field3961 = arg2.method314((byte) 32);
        }
        field3964++;
        if (arg1) {
            method1901(-38, (class25) null);
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 870)
    public class258() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(III)Z", line = 591)
    private final boolean method1900(int arg0, int arg1, int arg2) {
        field3949++;
        int var4 = (arg1 - arg2) * this.field3960 >> 12;
        int var5 = class239.field3711[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3960;
        int var7 = (var6 << 12) / this.field3961;
        if (arg0 != 7404) {
            this.field3954 = 35;
        }
        int var8 = this.field3950 * var7 >> 12;
        return var8 > (arg1 + arg2) && (-var8) < (arg1 + arg2);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILug;)V", line = 613)
    public static final void method1901(int arg0, class25 arg1) {
        field3962++;
        int var2 = 121 % ((44 - arg0) / 40);
        int var3 = arg1.method270(false);
        class343.field5454 = new class78[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            class343.field5454[var4] = new class78();
            class343.field5454[var4].field1126 = arg1.method270(false);
            class343.field5454[var4].field1131 = arg1.method269(false);
        }
        class76.field1120 = arg1.method270(false);
        class168.field2671 = arg1.method270(false);
        class108.field1627 = arg1.method270(false);
        class85.field1217 = new class316[class168.field2671 + 1 - class76.field1120];
        for (int var5 = 0; var5 < class108.field1627; var5++) {
            int var6 = arg1.method270(false);
            class316 var7 = class85.field1217[var6] = new class316();
            var7.field5222 = arg1.method281(109);
            var7.field5215 = arg1.method262((byte) 94);
            var7.field4875 = class76.field1120 + var6;
            var7.field4869 = arg1.method269(false);
            var7.field4870 = arg1.method269(false);
        }
        class277.field4286 = arg1.method262((byte) 77);
        class339.field5220 = true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILpm;I)V", line = 666)
    public static final void method1902(int arg0, class112 arg1, int arg2) {
        field3963++;
        Object[] var3 = arg1.field1711;
        int var4 = (Integer) var3[0];
        if (arg0 != 28018) {
            field3951 = true;
        }
        class72 var5 = class61.method618((byte) 121, var4);
        if (var5 == null) {
            return;
        }
        class245.field3822 = new String[var5.field1078];
        class245.field3821 = new int[var5.field1071];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; var8 < var3.length; var8++) {
            if ((var3[var8] instanceof Integer)) {
                int var10 = (Integer) var3[var8];
                if (var10 == -2147483647) {
                    var10 = arg1.field1709;
                }
                if (var10 == -2147483646) {
                    var10 = arg1.field1708;
                }
                if (var10 == -2147483645) {
                    var10 = arg1.field1706 == null ? -1 : arg1.field1706.field5433;
                }
                if (var10 == -2147483644) {
                    var10 = arg1.field1707;
                }
                if (var10 == -2147483643) {
                    var10 = arg1.field1706 == null ? -1 : arg1.field1706.field5380;
                }
                if (var10 == -2147483642) {
                    var10 = arg1.field1716 == null ? -1 : arg1.field1716.field5433;
                }
                if (var10 == -2147483641) {
                    var10 = arg1.field1716 == null ? -1 : arg1.field1716.field5380;
                }
                if (var10 == -2147483640) {
                    var10 = arg1.field1705;
                }
                if (var10 == -2147483639) {
                    var10 = arg1.field1717;
                }
                class245.field3821[var6++] = var10;
            } else if (var3[var8] instanceof String) {
                String var9 = (String) var3[var8];
                if (var9.equals("event_opbase")) {
                    var9 = arg1.field1714;
                }
                class245.field3822[var7++] = var9;
            }
        }
        class358.method2519(123, arg2, var5);
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(III)Z", line = 760)
    private final boolean method1903(int arg0, int arg1, int arg2) {
        field3952++;
        int var4 = (arg0 + arg2) * this.field3960 >> 12;
        if (arg1 != -862985908) {
            return true;
        }
        int var5 = class239.field3711[(var4 * 255 & 0xFF487) >> 12];
        int var6 = (var5 << 12) / this.field3960;
        int var7 = (var6 << 12) / this.field3961;
        int var8 = this.field3950 * var7 >> 12;
        return (arg2 - arg0) < var8 && arg2 - arg0 > -var8;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V", line = 778)
    public static final void method1904(boolean arg0, int arg1) {
        field3959++;
        class138 var2 = class149.method1242(arg1, 0, 8);
        if (arg0) {
            field3948 = -4;
        }
        var2.method1152(126);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 799)
    public final void method476(int arg0) {
        field3947++;
        if (arg0 == 0) {
            class164.method1307((byte) 0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[I", line = 822)
    public final int[] method158(int arg0, int arg1) {
        field3955++;
        if (arg1 <= 7) {
            this.field3960 = -25;
        }
        int[] var3 = this.field1225.method1914(arg0, 105);
        if (this.field1225.field3995) {
            int var4 = class135.field2257[arg0] - 2048;
            for (int var5 = 0; var5 < class93.field1424; var5++) {
                int var6 = class347.field5515[var5] - 2048;
                int var7 = this.field3958 + var6;
                int var8 = var4 + this.field3957;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = var7 < -2048 ? var7 + 4096 : var7;
                int var11 = var9 <= 2048 ? var9 : var9 - 4096;
                int var12 = this.field3953 + var4;
                int var13 = this.field3954 + var6;
                int var14 = var12 >= -2048 ? var12 : var12 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                int var16 = var13 < -2048 ? var13 + 4096 : var13;
                int var17 = var16 <= 2048 ? var16 : var16 - 4096;
                int var18 = var10 > 2048 ? var10 - 4096 : var10;
                var3[var5] = this.method1900(7404, var11, var18) || this.method1903(var17, -862985908, var15) ? 4096 : 0;
            }
        }
        return var3;
    }
}
