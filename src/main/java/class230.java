import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class230 {

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lpe;")
    private class102 field3975 = new class102();

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Lwh;")
    private class167 field3989 = new class167();

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field3985;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    private int field3986;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Ltg;")
    private class215 field3988;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lnj;")
    public static class230 field3967 = new class230(16);

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "[I")
    public static int[] field3979 = new int[2];

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lr;")
    private static class66 field3980 = class93.method641(43, "World");

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lr;")
    public static class66 field3976 = field3980;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Lr;")
    public static class66 field3982 = class93.method641(43, "Hidden)2");

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "[I")
    public static int[] field3984 = new int[50];

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Ltg;")
    public static class215 field3981 = new class215(8);

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Lr;")
    private static class66 field3991 = class93.method641(43, "Loaded config");

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "Lr;")
    public static class66 field3990 = field3991;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
    public static final void method1495(boolean arg0) {
        field3969++;
        if (class173.field3059 == 0 || class173.field3059 == 5) {
            return;
        }
        try {
            if ((++class144.field2632) > 2000) {
                if (class101.field1972 != null) {
                    class101.field1972.method1277(-64);
                    class101.field1972 = null;
                }
                if (class165.field2961 >= 1) {
                    class184.field3217 = -5;
                    class173.field3059 = 0;
                    return;
                }
                if (class89.field1732 == class111.field2136) {
                    class89.field1732 = class151.field2707;
                } else {
                    class89.field1732 = class111.field2136;
                }
                class165.field2961++;
                class173.field3059 = 1;
                class144.field2632 = 0;
            }
            if (arg0) {
                field3991 = null;
            }
            if (class173.field3059 == 1) {
                class160.field2881 = class95.field1835.method771(class35.field518, (byte) 116, class89.field1732);
                class173.field3059 = 2;
            }
            if (class173.field3059 == 2) {
                if (class160.field2881.field4066 == 2) {
                    throw new IOException();
                }
                if (class160.field2881.field4066 != 1) {
                    return;
                }
                class101.field1972 = new class196((Socket) class160.field2881.field4069, class95.field1835);
                class160.field2881 = null;
                long var1 = class27.field363 = class85.field1674.method479(10908);
                class28.field412.field4335 = 0;
                class28.field412.method1638(32, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class28.field412.method1638(32, var3);
                class101.field1972.method1273(0, (byte) 36, 2, class28.field412.field4350);
                if (class31.field461 != null) {
                    class31.field461.method1582(arg0);
                }
                if (class20.field277 != null) {
                    class20.field277.method1582(arg0);
                }
                int var4 = class101.field1972.method1276(112);
                if (class31.field461 != null) {
                    class31.field461.method1582(false);
                }
                if (class20.field277 != null) {
                    class20.field277.method1582(false);
                }
                if (var4 != 0) {
                    class184.field3217 = var4;
                    class173.field3059 = 0;
                    class101.field1972.method1277(-7);
                    class101.field1972 = null;
                    return;
                }
                class173.field3059 = 3;
            }
            if (class173.field3059 == 3) {
                if (class101.field1972.method1280((byte) 102) < 8) {
                    return;
                }
                class101.field1972.method1274(-44, 8, 0, class84.field1627.field4350);
                class84.field1627.field4335 = 0;
                class96.field1843 = class84.field1627.method1668(102);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class96.field1843 >> 32), 0 };
                class28.field412.field4335 = 0;
                var5[3] = (int) class96.field1843;
                class28.field412.method1638(32, 10);
                class28.field412.method1666(544537784, var5[0]);
                class28.field412.method1666(544537784, var5[1]);
                class28.field412.method1666(544537784, var5[2]);
                class28.field412.method1666(544537784, var5[3]);
                class28.field412.method1651(true, class85.field1674.method479(10908));
                class28.field412.method1641((byte) -9, class85.field1675);
                class28.field412.method1660(false, class17.field232, class15.field187);
                class93.field1800.field4335 = 0;
                if (class244.field4258 == 40) {
                    class93.field1800.method1638(32, 18);
                } else {
                    class93.field1800.method1638(32, 16);
                }
                class93.field1800.method1650(false, class28.field412.field4335 + class138.method950(class42.field692, -106) + 151);
                class93.field1800.method1666(544537784, 508);
                class93.field1800.method1638(32, class166.field2988);
                class93.field1800.method1638(32, 0);
                class93.field1800.method1638(32, class25.method109((byte) 97));
                class93.field1800.method1650(arg0, class19.field257);
                class93.field1800.method1650(false, class12.field143);
                class203.method1314(24, class93.field1800);
                class93.field1800.method1641((byte) -9, class42.field692);
                class93.field1800.method1666(544537784, class182.field3194);
                class93.field1800.method1666(544537784, class194.method1265((byte) 119));
                class158.field2855 = true;
                class93.field1800.method1666(544537784, class43.field758.field374);
                class93.field1800.method1666(544537784, class183.field3209.field374);
                class93.field1800.method1666(544537784, class33.field497.field374);
                class93.field1800.method1666(544537784, class176.field3106.field374);
                class93.field1800.method1666(544537784, class146.field2662.field374);
                class93.field1800.method1666(544537784, class29.field427.field374);
                class93.field1800.method1666(544537784, class28.field405.field374);
                class93.field1800.method1666(544537784, class115.field2173.field374);
                class93.field1800.method1666(544537784, class242.field4238.field374);
                class93.field1800.method1666(544537784, class161.field2892.field374);
                class93.field1800.method1666(544537784, class238.field4132.field374);
                class93.field1800.method1666(544537784, class28.field418.field374);
                class93.field1800.method1666(544537784, class50.field894.field374);
                class93.field1800.method1666(544537784, class251.field4420.field374);
                class93.field1800.method1666(544537784, class159.field2862.field374);
                class93.field1800.method1666(544537784, class88.field1713.field374);
                class93.field1800.method1666(544537784, class162.field2913.field374);
                class93.field1800.method1666(544537784, class9.field97.field374);
                class93.field1800.method1666(544537784, class80.field1570.field374);
                class93.field1800.method1666(544537784, class224.field3814.field374);
                class93.field1800.method1666(544537784, class140.field2583.field374);
                class93.field1800.method1666(544537784, class180.field3154.field374);
                class93.field1800.method1666(544537784, class133.field2476.field374);
                class93.field1800.method1666(544537784, class26.field327.field374);
                class93.field1800.method1666(544537784, class166.field2992.field374);
                class93.field1800.method1666(544537784, class165.field2954.field374);
                class93.field1800.method1666(544537784, class83.field1622.field374);
                class93.field1800.method1669(class28.field412.field4335, (byte) 118, 0, class28.field412.field4350);
                class101.field1972.method1273(0, (byte) 86, class93.field1800.field4335, class93.field1800.field4350);
                class28.field412.method569(var5, 3426);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class84.field1627.method569(var5, 3426);
                class173.field3059 = 4;
            }
            if (class173.field3059 == 4) {
                if (class101.field1972.method1280((byte) 102) < 1) {
                    return;
                }
                int var7 = class101.field1972.method1276(110);
                if (var7 == 21) {
                    class173.field3059 = 7;
                } else if (var7 == 1) {
                    class173.field3059 = 5;
                    class184.field3217 = var7;
                    return;
                } else if (var7 == 2) {
                    class173.field3059 = 8;
                } else if (var7 == 15) {
                    class184.field3217 = var7;
                    class173.field3059 = 0;
                    return;
                } else if (var7 == 23 && class165.field2961 < 1) {
                    class173.field3059 = 1;
                    class144.field2632 = 0;
                    class165.field2961++;
                    class101.field1972.method1277(-48);
                    class101.field1972 = null;
                    return;
                } else {
                    class184.field3217 = var7;
                    class173.field3059 = 0;
                    class101.field1972.method1277(-41);
                    class101.field1972 = null;
                    return;
                }
            }
            if (class173.field3059 == 6) {
                class28.field412.field4335 = 0;
                class28.field412.method578(115, 17);
                class101.field1972.method1273(0, (byte) 87, class28.field412.field4335, class28.field412.field4350);
                class173.field3059 = 4;
            } else if (class173.field3059 != 7) {
                if (class173.field3059 == 8) {
                    if (class101.field1972.method1280((byte) 102) < 11) {
                        return;
                    }
                    class101.field1972.method1274(-73, 11, 0, class84.field1627.field4350);
                    class84.field1627.field4335 = 0;
                    class130.field2430 = class84.field1627.method1677(-6677);
                    class259.field4559 = class84.field1627.method1677(-6677);
                    class171.field3035 = class84.field1627.method1677(-6677);
                    if (class171.field3035 == 1) {
                        try {
                            class17.field247.method474(class95.field1835.field2184, (byte) -123);
                        } catch (Throwable var8) {
                        }
                    } else {
                        try {
                            class41.field681.method474(class95.field1835.field2184, (byte) -123);
                        } catch (Throwable var9) {
                        }
                    }
                    class98.field1923 = class84.field1627.method1677(-6677);
                    class120.field2279 = class84.field1627.method1677(-6677) == 1;
                    class49.field882 = class84.field1627.method1674(1355769544);
                    class42.field690 = class84.field1627.method1677(-6677);
                    class129.field2400 = class84.field1627.method577(255);
                    class61.field1033 = class84.field1627.method1674(1355769544);
                    class173.field3059 = 9;
                }
                if (class173.field3059 == 9 && class101.field1972.method1280((byte) 102) >= class61.field1033) {
                    class84.field1627.field4335 = 0;
                    class101.field1972.method1274(88, class61.field1033, 0, class84.field1627.field4350);
                    class173.field3059 = 0;
                    class184.field3217 = 2;
                    class28.method155(10938);
                    class157.field2816 = -1;
                    class187.method1235((byte) 95, false);
                    class129.field2400 = -1;
                }
            } else if (class101.field1972.method1280((byte) 102) >= 1) {
                class3.field38 = class101.field1972.method1276(98) * 60 + 180;
                class173.field3059 = 0;
                class184.field3217 = 21;
                class101.field1972.method1277(-51);
                class101.field1972 = null;
            }
        } catch (IOException var10) {
            if (class101.field1972 != null) {
                class101.field1972.method1277(-94);
                class101.field1972 = null;
            }
            if (class165.field2961 < 1) {
                class173.field3059 = 1;
                class144.field2632 = 0;
                class165.field2961++;
                if (class89.field1732 == class111.field2136) {
                    class89.field1732 = class151.field2707;
                } else {
                    class89.field1732 = class111.field2136;
                }
            } else {
                class173.field3059 = 0;
                class184.field3217 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public static final void method1496(int arg0, int arg1) {
        field3971++;
        class84.field1628.method1611(-18767, arg1);
        int var2 = -47 % ((arg0 - 38) / 47);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JBLpe;)V")
    public final void method1497(long arg0, byte arg1, class102 arg2) {
        if (this.field3985 == 0) {
            class102 var5 = this.field3989.method1138(2265);
            var5.method560(-17554);
            var5.method704((byte) 73);
            if (this.field3975 == var5) {
                class102 var6 = this.field3989.method1138(2265);
                var6.method560(-17554);
                var6.method704((byte) 73);
            }
        } else {
            this.field3985--;
        }
        field3974++;
        this.field3988.method1380((byte) 9, arg2, arg0);
        int var7 = -84 % ((43 - arg1) / 39);
        this.field3989.method1135(48, arg2);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lli;")
    public final class80 method1498(int arg0) {
        field3968++;
        return arg0 <= 37 ? null : this.field3988.method1386((byte) -122);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method1499(byte arg0) {
        field3991 = null;
        field3982 = null;
        field3990 = null;
        if (arg0 != 69) {
            method1495(true);
        }
        field3981 = null;
        field3979 = null;
        field3976 = null;
        field3984 = null;
        field3980 = null;
        field3967 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ldd;Lcj;ZLcj;Lcj;)Z")
    public static final boolean method1500(class43 arg0, class28 arg1, boolean arg2, class28 arg3, class28 arg4) {
        class79.field1558 = arg4;
        class174.field3065 = arg3;
        if (arg2) {
            return true;
        } else {
            class7.field62 = arg0;
            field3970++;
            class41.field678 = arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static final void method1501(int arg0) {
        if (arg0 < 115) {
            method1499((byte) -105);
        }
        field3973++;
        class84.field1631 = new class215(32);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public final void method1502(byte arg0) {
        field3966++;
        this.field3989.method1131((byte) -56);
        this.field3988.method1387(false);
        this.field3975 = new class102();
        if (arg0 != -11) {
            field3980 = null;
        }
        this.field3985 = this.field3986;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V")
    public static final void method1503(int arg0, int arg1) {
        int var2 = 97 / ((63 - arg1) / 48);
        field3977++;
        class83.field1607.method1611(-18767, arg0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Z")
    public static final boolean method1504(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class260.field4572; var3++) {
            class259 var4 = class147.field2675[var3];
            if (var4.field4540 == 1) {
                int var5 = var4.field4558 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4537 * var5 >> 8) + var4.field4547;
                    int var7 = (var4.field4556 * var5 >> 8) + var4.field4546;
                    int var8 = (var4.field4552 * var5 >> 8) + var4.field4551;
                    int var9 = (var4.field4542 * var5 >> 8) + var4.field4549;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4540 == 2) {
                int var10 = arg0 - var4.field4558;
                if (var10 > 0) {
                    int var11 = (var4.field4537 * var10 >> 8) + var4.field4547;
                    int var12 = (var4.field4556 * var10 >> 8) + var4.field4546;
                    int var13 = (var4.field4552 * var10 >> 8) + var4.field4551;
                    int var14 = (var4.field4542 * var10 >> 8) + var4.field4549;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4540 == 3) {
                int var15 = var4.field4547 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4538 * var15 >> 8) + var4.field4558;
                    int var17 = (var4.field4543 * var15 >> 8) + var4.field4561;
                    int var18 = (var4.field4552 * var15 >> 8) + var4.field4551;
                    int var19 = (var4.field4542 * var15 >> 8) + var4.field4549;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4540 == 4) {
                int var20 = arg2 - var4.field4547;
                if (var20 > 0) {
                    int var21 = (var4.field4538 * var20 >> 8) + var4.field4558;
                    int var22 = (var4.field4543 * var20 >> 8) + var4.field4561;
                    int var23 = (var4.field4552 * var20 >> 8) + var4.field4551;
                    int var24 = (var4.field4542 * var20 >> 8) + var4.field4549;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4540 == 5) {
                int var25 = arg1 - var4.field4551;
                if (var25 > 0) {
                    int var26 = (var4.field4538 * var25 >> 8) + var4.field4558;
                    int var27 = (var4.field4543 * var25 >> 8) + var4.field4561;
                    int var28 = (var4.field4537 * var25 >> 8) + var4.field4547;
                    int var29 = (var4.field4556 * var25 >> 8) + var4.field4546;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JB)Lpe;")
    public final class102 method1505(long arg0, byte arg1) {
        if (arg1 != -76) {
            this.field3975 = null;
        }
        class102 var4 = (class102) this.field3988.method1381(arg0, -111);
        field3972++;
        if (var4 != null) {
            this.field3989.method1135(77, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Lli;")
    public final class80 method1506(int arg0) {
        field3987++;
        if (arg0 != 0) {
            field3976 = null;
        }
        return this.field3988.method1382(-32642);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
    public class230(int arg0) {
        this.field3985 = arg0;
        this.field3986 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3988 = new class215(var2);
    }
}
