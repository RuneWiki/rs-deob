import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 implements class34 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lcd;")
    private class19 field4 = new class19();

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    private int field19 = 128;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    private int field13 = 0;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "D")
    private double field25 = 1.0D;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lna;")
    private class91 field22;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "[Lnf;")
    private class96[] field10;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lpe;")
    public static class109 field5 = class141.method1120("blinken2:", 0);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lpe;")
    public static class109 field6 = class141.method1120("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 0);

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lpe;")
    public static class109 field23 = class141.method1120("<col=ffffff> )4 ", 0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lk;")
    public static class69 field2;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public final void method1(int arg0) {
        field20++;
        if (arg0 != -8676) {
            this.method1(-19);
        }
        for (int var2 = 0; var2 < this.field10.length; var2++) {
            if (this.field10[var2] != null) {
                this.field10[var2].method787();
            }
        }
        this.field4 = new class19();
        this.field13 = this.field16;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        field7++;
        class96 var3 = this.field10[arg1];
        if (arg0 < 30) {
            method12(-85, -51, -41, -65, 125, 60);
        }
        if (var3 != null) {
            if (var3.field2061 != null) {
                this.field4.method194(22, var3);
                var3.field2057 = true;
                return var3.field2061;
            }
            boolean var4 = var3.method789(this.field25, this.field19, this.field22);
            if (var4) {
                if (this.field13 == 0) {
                    class96 var5 = (class96) this.field4.method199((byte) 102);
                    var5.method787();
                } else {
                    this.field13--;
                }
                this.field4.method194(22, var3);
                var3.field2057 = true;
                return var3.field2061;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static final void method3(int arg0) {
        field12++;
        if (class151.field3334 == 0) {
            class147.field3201 = new class81(4, 104, 104, class83.field1775);
            for (int var1 = 0; var1 < 4; var1++) {
                class109.field2318[var1] = new class77(104, 104);
            }
            class136.field2969 = new class29(512, 512);
            class151.field3334 = 20;
            class72.field1460 = class45.field948;
            class11.field248 = 5;
        } else if (class151.field3334 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class105.field2221[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class81.method673(var2, 500, 800, 512, 334);
            class11.field248 = 10;
            class72.field1460 = class126.field2808;
            class151.field3334 = 30;
        } else if (arg0 == 22779) {
            if (class151.field3334 == 30) {
                class17.field434 = class67.method521((byte) -125, true, true, 0, false);
                class84.field1788 = class67.method521((byte) -127, true, true, 1, false);
                class66.field1330 = class67.method521((byte) -128, false, true, 2, true);
                class109.field2293 = class67.method521((byte) -126, true, true, 3, false);
                class18.field456 = class67.method521((byte) -128, true, true, 4, false);
                class114.field2503 = class67.method521((byte) -127, true, true, 5, true);
                class107.field2241 = class67.method521((byte) -127, true, false, 6, true);
                class72.field1459 = class67.method521((byte) -128, true, true, 7, false);
                class18.field453 = class67.method521((byte) -126, true, true, 8, false);
                class50.field1036 = class67.method521((byte) -126, true, true, 9, false);
                class19.field481 = class67.method521((byte) -125, true, true, 10, false);
                class101.field2105 = class67.method521((byte) -127, true, true, 11, false);
                class44.field935 = class67.method521((byte) -125, true, true, 12, false);
                class104.field2207 = class67.method521((byte) -128, false, true, 13, true);
                class125.field2775 = class67.method521((byte) -125, true, false, 14, false);
                class137.field2984 = class67.method521((byte) -126, true, true, 15, false);
                class72.field1460 = class60.field1165;
                class151.field3334 = 40;
                class11.field248 = 20;
            } else if (class151.field3334 == 40) {
                byte var7 = 0;
                int var8 = var7 + class17.field434.method995(false) * 4 / 100;
                int var9 = var8 + class84.field1788.method995(false) * 4 / 100;
                int var10 = var9 + class66.field1330.method995(false) * 2 / 100;
                int var11 = var10 + class109.field2293.method995(false) * 2 / 100;
                int var12 = var11 + class18.field456.method995(false) * 6 / 100;
                int var13 = var12 + class114.field2503.method995(false) * 4 / 100;
                int var14 = var13 + class107.field2241.method995(false) * 2 / 100;
                int var15 = var14 + class72.field1459.method995(false) * 60 / 100;
                int var16 = var15 + class18.field453.method995(false) * 2 / 100;
                int var17 = var16 + class50.field1036.method995(false) * 2 / 100;
                int var18 = var17 + class19.field481.method995(false) * 2 / 100;
                int var19 = var18 + class101.field2105.method995(false) * 2 / 100;
                int var20 = var19 + class44.field935.method995(false) * 2 / 100;
                int var21 = var20 + class104.field2207.method995(false) * 2 / 100;
                int var22 = var21 + class125.field2775.method995(false) * 2 / 100;
                int var23 = var22 + class137.field2984.method995(false) * 2 / 100;
                if (var23 == 100) {
                    class72.field1460 = class86.field1841;
                    class11.field248 = 30;
                    class151.field3334 = 45;
                } else {
                    if (var23 != 0) {
                        class72.field1460 = class44.method405(new class109[] { class134.field2928, class143.method1132(var23, 92), class112.field2386 }, (byte) -74);
                    }
                    class11.field248 = 30;
                }
            } else if (class151.field3334 == 45) {
                class137.method1086(22050, !class62.field1269, -48001, 2);
                class61 var24 = new class61();
                var24.method487(-30276, 128, 9);
                class49.field1013 = class156.method1222(-1, class137.field2980, 22050, class35.field755, 0);
                class49.field1013.method30((byte) 87, var24);
                class135.method1078(class18.field456, false, class137.field2984, var24, class125.field2775);
                class147.field3210 = class156.method1222(-1, class137.field2980, 2048, class35.field755, 1);
                class124.field2746 = new class130();
                class147.field3210.method30((byte) 92, class124.field2746);
                class88.field1869 = new class107(22050, class127.field2816);
                class11.field248 = 35;
                class72.field1460 = class147.field3217;
                class151.field3334 = 50;
            } else if (class151.field3334 == 50) {
                int var25 = 0;
                if (class127.field2833 == null) {
                    class127.field2833 = class72.method578(class131.field2866, class18.field453, class49.field1017, true, class104.field2207);
                } else {
                    var25++;
                }
                if (class151.field3319 == null) {
                    class151.field3319 = class72.method578(class131.field2866, class18.field453, class119.field2634, true, class104.field2207);
                } else {
                    var25++;
                }
                if (class2.field46 == null) {
                    class2.field46 = class72.method578(class131.field2866, class18.field453, class108.field2264, true, class104.field2207);
                } else {
                    var25++;
                }
                if (var25 < 3) {
                    class72.field1460 = class44.method405(new class109[] { class123.field2711, class143.method1132(var25 * 100 / 3, 91), class112.field2386 }, (byte) -74);
                    class11.field248 = 40;
                } else {
                    class72.field1460 = class92.field1988;
                    class11.field248 = 40;
                    class151.field3334 = 60;
                }
            } else if (class151.field3334 == 60) {
                int var26 = class101.method810(class19.field481, false, class18.field453);
                int var27 = class126.method1017(arg0 - 22773);
                if (var26 < var27) {
                    class72.field1460 = class44.method405(new class109[] { class112.field2440, class143.method1132(var26 * 100 / var27, 93), class112.field2386 }, (byte) -74);
                    class11.field248 = 50;
                } else {
                    class72.field1460 = class104.field2204;
                    class11.field248 = 50;
                    class118.method958(false, 5);
                    class151.field3334 = 70;
                }
            } else if (class151.field3334 == 70) {
                if (class66.field1330.method744(arg0 - 50677)) {
                    class78.method630((byte) 127, class66.field1330);
                    class141.method1122(class66.field1330, false);
                    class149.method1165(class66.field1330, class72.field1459, false);
                    class118.method969(class72.field1459, class66.field1330, false, class62.field1269);
                    class83.method707(21401, class72.field1459, class66.field1330);
                    class124.method1010(class63.field1291, class72.field1459, class127.field2833, 0, class66.field1330);
                    class158.method1230(class84.field1788, class66.field1330, class17.field434, -1);
                    class127.method1028(class72.field1459, false, class66.field1330);
                    class101.method819(class66.field1330, (byte) -108);
                    class9.method82((byte) -126, class66.field1330);
                    class143.method1134(class104.field2207, class72.field1459, 10, class109.field2293, class18.field453);
                    class144.method1135(class66.field1330, 94);
                    class115.method951(class66.field1330, 15);
                    class151.field3334 = 80;
                    class11.field248 = 60;
                    class72.field1460 = class43.field906;
                } else {
                    class72.field1460 = class44.method405(new class109[] { class53.field1100, class143.method1132(class66.field1330.method999(arg0 ^ 0xFFFF97F8), 99), class112.field2386 }, (byte) -74);
                    class11.field248 = 60;
                }
            } else if (class151.field3334 == 80) {
                int var28 = 0;
                if (class25.field617 == null) {
                    class25.field617 = class102.method823(class88.field1857, class18.field453, class131.field2866, 125);
                } else {
                    var28++;
                }
                if (class6.field155 == null) {
                    class6.field155 = class102.method823(class76.field1534, class18.field453, class131.field2866, 120);
                } else {
                    var28++;
                }
                if (class62.field1281 == null) {
                    class62.field1281 = class50.method427(class18.field453, class27.field629, class131.field2866, 71);
                } else {
                    var28++;
                }
                if (class128.field2847 == null) {
                    class128.field2847 = class139.method1097(class68.field1380, -21104, class131.field2866, class18.field453);
                } else {
                    var28++;
                }
                if (class60.field1176 == null) {
                    class60.field1176 = class139.method1097(class153.field3377, -21104, class131.field2866, class18.field453);
                } else {
                    var28++;
                }
                if (class49.field1024 == null) {
                    class49.field1024 = class139.method1097(class104.field2206, -21104, class131.field2866, class18.field453);
                } else {
                    var28++;
                }
                if (class19.field475 == null) {
                    class19.field475 = class139.method1097(class41.field860, -21104, class131.field2866, class18.field453);
                } else {
                    var28++;
                }
                if (class102.field2143 == null) {
                    class102.field2143 = class139.method1097(class110.field2345, arg0 ^ 0xFFFFF56B, class131.field2866, class18.field453);
                } else {
                    var28++;
                }
                if (class18.field452 == null) {
                    class18.field452 = class139.method1097(class122.field2686, -21104, class131.field2866, class18.field453);
                } else {
                    var28++;
                }
                if (class85.field1810 == null) {
                    class85.field1810 = class139.method1097(class60.field1179, arg0 ^ 0xFFFFF56B, class131.field2866, class18.field453);
                } else {
                    var28++;
                }
                if (class43.field904 == null) {
                    class43.field904 = class139.method1097(class141.field3115, arg0 ^ 0xFFFFF56B, class131.field2866, class18.field453);
                } else {
                    var28++;
                }
                if (class66.field1335 == null) {
                    class66.field1335 = class50.method427(class18.field453, class136.field2970, class131.field2866, arg0 - 22652);
                } else {
                    var28++;
                }
                if (class119.field2632 == null) {
                    class119.field2632 = class50.method427(class18.field453, class41.field848, class131.field2866, 74);
                } else {
                    var28++;
                }
                if (class84.field1789 == null) {
                    class84.field1789 = class71.method575(class18.field453, class131.field2866, class71.field1448, arg0 ^ 0xFFFFA76B);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class72.field1460 = class44.method405(new class109[] { class143.field3152, class143.method1132(var28 * 100 / 14, 103), class112.field2386 }, (byte) -74);
                    class11.field248 = 70;
                } else {
                    class70.field1393 = class119.field2632;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    class6.field155.method266();
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 41.0D) - 20;
                    for (int var33 = 0; var33 < class128.field2847.length; var33++) {
                        class128.field2847[var33].method278(var29 + var32, var30 - -var32, var31 + var32);
                    }
                    class62.field1281[0].method537(var29 + var32, var30 - -var32, var31 + var32);
                    class112.method925((byte) 38);
                    class151.field3334 = 90;
                    class11.field248 = 70;
                    class72.field1460 = class89.field1892;
                }
            } else if (class151.field3334 == 90) {
                if (class50.field1036.method744(-27898)) {
                    class1 var34 = new class1(class50.field1036, class18.field453, 20, 0.8D, class62.field1269 ? 64 : 128);
                    class105.method857(var34);
                    class105.method853(0.8D);
                    class151.field3334 = 110;
                    class11.field248 = 90;
                    class72.field1460 = class153.field3368;
                } else {
                    class72.field1460 = class44.method405(new class109[] { class109.field2316, class143.method1132(class50.field1036.method999(-12541), 120), class112.field2386 }, (byte) -74);
                    class11.field248 = 90;
                }
            } else if (class151.field3334 == 110) {
                class19.field477 = new class49();
                class35.field755.method252(10, (byte) 34, class19.field477);
                class72.field1460 = class122.field2696;
                class11.field248 = 94;
                class151.field3334 = 120;
            } else if (class151.field3334 == 120) {
                if (class19.field481.method745(class131.field2866, class48.field994, 126)) {
                    class20 var35 = new class20(class19.field481.method758(class131.field2866, class48.field994, (byte) 124));
                    class114.method946(7, var35);
                    class72.field1460 = class104.field2195;
                    class11.field248 = 96;
                    class151.field3334 = 130;
                } else {
                    class72.field1460 = class44.method405(new class109[] { class46.field965, class108.field2260 }, (byte) -74);
                    class11.field248 = 96;
                }
            } else if (class151.field3334 == 130) {
                if (!class109.field2293.method744(-27898)) {
                    class72.field1460 = class44.method405(new class109[] { class84.field1777, class143.method1132(class109.field2293.method999(-12541) * 4 / 5, 101), class112.field2386 }, (byte) -74);
                    class11.field248 = 100;
                } else if (!class44.field935.method744(-27898)) {
                    class72.field1460 = class44.method405(new class109[] { class84.field1777, class143.method1132(class44.field935.method999(arg0 - 35320) / 6 + 80, 88), class112.field2386 }, (byte) -74);
                    class11.field248 = 100;
                } else if (class104.field2207.method744(arg0 - 50677)) {
                    class151.field3334 = 140;
                    class11.field248 = 100;
                    class72.field1460 = class151.field3316;
                } else {
                    class72.field1460 = class44.method405(new class109[] { class84.field1777, class143.method1132(class104.field2207.method999(-12541) / 20 + 96, 119), class112.field2386 }, (byte) -74);
                    class11.field248 = 100;
                }
            } else if (class151.field3334 == 140) {
                class118.method958(false, 10);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
    public final void method4(byte arg0, int arg1) {
        if (arg0 >= -125) {
            field2 = null;
        }
        for (int var3 = 0; var3 < this.field10.length; var3++) {
            class96 var4 = this.field10[var3];
            if (var4 != null && var4.field2051 != 0 && var4.field2057) {
                var4.method788(arg1);
                var4.field2057 = false;
            }
        }
        field26++;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(II)Z")
    public final boolean method5(int arg0, int arg1) {
        if (arg1 >= -57) {
            this.method4((byte) 119, -124);
        }
        field18++;
        return this.field19 == 64;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I")
    public final int method6(int arg0, int arg1) {
        field14++;
        if (arg1 == -32361) {
            return this.field10[arg0] == null ? 0 : this.field10[arg0].field2059;
        } else {
            return -75;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BD)V")
    public final void method7(byte arg0, double arg1) {
        this.field25 = arg1;
        field11++;
        this.method1(-8676);
        int var4 = -6 % ((arg0 - 1) / 42);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public static void method8(int arg0) {
        field6 = null;
        field2 = null;
        field23 = null;
        if (arg0 != -16713) {
            method10((byte) 28, 39, 90, -30);
        }
        field5 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILwa;)Lwa;")
    public static final class154 method9(int arg0, class154 arg1) {
        if (arg0 != -28) {
            field15 = 12;
        }
        field3++;
        class154 var2 = class114.method943((byte) 120, arg1);
        if (var2 == null) {
            var2 = arg1.field3428;
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BIII)Z")
    public static final boolean method10(byte arg0, int arg1, int arg2, int arg3) {
        field17++;
        int var4 = arg2 >> 14 & 0x7FFF;
        int var5 = class147.field3201.method661(class75.field1513, arg3, arg1, arg2);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 >> 6 & 0x3;
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class148 var8 = class89.method736(var4, 11893);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field3268;
                var9 = var8.field3240;
            } else {
                var9 = var8.field3268;
                var10 = var8.field3240;
            }
            int var11 = var8.field3223;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class86.method722(arg1, var10, 127, 0, var9, class136.field2975.field3120[0], var11, 2, 0, class136.field2975.field3121[0], arg3, true);
        } else {
            class86.method722(arg1, 0, 127, var6, 0, class136.field2975.field3120[0], 0, 2, var7 + 1, class136.field2975.field3121[0], arg3, true);
        }
        class16.field408 = 0;
        class63.field1303 = class115.field2538;
        if (arg0 != -25) {
            field6 = null;
        }
        class116.field2590 = class120.field2671;
        class16.field400 = 2;
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
    public static final void method11(int arg0, int arg1, int arg2) {
        field9++;
        if (class32.field696 != 2) {
            return;
        }
        class153.method1181((class32.field694 - class82.field1736 << 7) + class91.field1959, class7.field172 * 2, 120, (class92.field1990 - class43.field917 << 7) + class107.field2247);
        if (arg2 != 32765) {
            method11(-101, 109, 45);
        }
        if (class134.field2918 > -1 && class12.field264 % 20 < 10) {
            class102.field2143[0].method279(class134.field2918 + arg0 - 12, class102.field2142 + arg1 + -28);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field27++;
        int var6 = class147.field3201.method677(arg4, arg3, arg0);
        if (var6 != 0) {
            int var7 = class147.field3201.method661(arg4, arg3, arg0, var6);
            int var8 = var7 & 0x1F;
            int var9 = var7 >> 6 & 0x3;
            int[] var10 = class136.field2969.field659;
            int var11 = arg3 * 4 + (-(arg0 * 512) + 52736) * 4 + 24624;
            int var12 = arg5;
            if (var6 > 0) {
                var12 = arg1;
            }
            int var13 = var6 >> 14 & 0x7FFF;
            class148 var14 = class89.method736(var13, 11893);
            if (var14.field3271 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var10[var11] = var12;
                        var10[var11 + 512] = var12;
                        var10[var11 + 1024] = var12;
                        var10[var11 + 1536] = var12;
                    } else if (var9 == 1) {
                        var10[var11] = var12;
                        var10[var11 + 1] = var12;
                        var10[var11 + 2] = var12;
                        var10[var11 + 3] = var12;
                    } else if (var9 == 2) {
                        var10[var11 + 3] = var12;
                        var10[var11 + 515] = var12;
                        var10[var11 + 1024 + 3] = var12;
                        var10[var11 + 1536 + 3] = var12;
                    } else if (var9 == 3) {
                        var10[var11 + 1536] = var12;
                        var10[var11 + 1 + 1536] = var12;
                        var10[var11 + 2 + 1536] = var12;
                        var10[var11 + 1539] = var12;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var10[var11] = var12;
                    } else if (var9 == 1) {
                        var10[var11 + 3] = var12;
                    } else if (var9 == 2) {
                        var10[var11 + 1539] = var12;
                    } else if (var9 == 3) {
                        var10[var11 + 1536] = var12;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var10[var11] = var12;
                        var10[var11 + 512] = var12;
                        var10[var11 + 1024] = var12;
                        var10[var11 + 1536] = var12;
                    } else if (var9 == 0) {
                        var10[var11] = var12;
                        var10[var11 + 1] = var12;
                        var10[var11 + 2] = var12;
                        var10[var11 + 3] = var12;
                    } else if (var9 == 1) {
                        var10[var11 + 3] = var12;
                        var10[var11 + 3 + 512] = var12;
                        var10[var11 + 3 + 1024] = var12;
                        var10[var11 + 1536 + 3] = var12;
                    } else if (var9 == 2) {
                        var10[var11 + 1536] = var12;
                        var10[var11 + 1536 + 1] = var12;
                        var10[var11 + 2 + 1536] = var12;
                        var10[var11 + 1536 + 3] = var12;
                    }
                }
            } else {
                class69 var15 = class62.field1281[var14.field3271];
                if (var15 != null) {
                    int var16 = (var14.field3240 * 4 - var15.field1386) / 2;
                    int var17 = (var14.field3268 * 4 - var15.field1382) / 2;
                    var15.method539(arg3 * 4 + var16 + 48, (-var14.field3268 + 104 + -arg0) * 4 + var17 + 48);
                }
            }
        }
        int var18 = class147.field3201.method678(arg4, arg3, arg0);
        if (var18 != 0) {
            int var19 = class147.field3201.method661(arg4, arg3, arg0, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class148 var23 = class89.method736(var22, 11893);
            if (var23.field3271 != -1) {
                class69 var24 = class62.field1281[var23.field3271];
                if (var24 != null) {
                    int var25 = (var23.field3268 * 4 - var24.field1382) / 2;
                    int var26 = (var23.field3240 * 4 - var24.field1386) / 2;
                    var24.method539(arg3 * 4 + var26 + 48, 48 - (-((-arg0 + 104 + -var23.field3268) * 4) - var25));
                }
            } else if (var21 == 9) {
                int[] var27 = class136.field2969.field659;
                int var28 = 15658734;
                int var29 = (52736 - arg0 * 512) * 4 + arg3 * 4 + 24624;
                if (var18 > 0) {
                    var28 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1024 + 1] = var28;
                    var27[var29 + 512 + 2] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 512 + 1] = var28;
                    var27[var29 + 1026] = var28;
                    var27[var29 + 1539] = var28;
                }
            }
        }
        int var30 = class147.field3201.method672(arg4, arg3, arg0);
        if (arg2 != -31082) {
            method3(-24);
        }
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class148 var32 = class89.method736(var31, 11893);
        if (var32.field3271 == -1) {
            return;
        }
        class69 var33 = class62.field1281[var32.field3271];
        if (var33 != null) {
            int var34 = (var32.field3268 * 4 - var33.field1382) / 2;
            int var35 = (var32.field3240 * 4 - var33.field1386) / 2;
            var33.method539(arg3 * 4 + var35 + 48, (-var32.field3268 + 104 + -arg0) * 4 + var34 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
    public final boolean method13(int arg0, int arg1) {
        field24++;
        if (arg0 != -2655) {
            field5 = null;
        }
        return this.field10[arg1].field2053;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lna;Lna;IDI)V")
    private class1(class91 arg0, class91 arg1, int arg2, double arg3, int arg4) {
        this.field19 = arg4;
        this.field22 = arg1;
        this.field25 = arg3;
        this.field16 = arg2;
        this.field13 = this.field16;
        int[] var7 = arg0.method749(0, -1);
        int var8 = var7.length;
        this.field10 = new class96[arg0.method754(0, (byte) 108)];
        for (int var9 = 0; var9 < var8; var9++) {
            class13 var10 = new class13(arg0.method742(var7[var9], -25, 0));
            this.field10[var7[var9]] = new class96(var10);
        }
    }
}
