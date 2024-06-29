import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class272 {

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lt;")
    private class239 field4581 = new class239(256);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lt;")
    private class239 field4583 = new class239(256);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lek;")
    private class172 field4566;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lek;")
    private class172 field4578;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lbe;")
    public static class283 field4567 = class153.method941(-103, "scrollbar");

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lbe;")
    public static class283 field4575 = class153.method941(125, "Ausw-=hlen");

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lni;")
    public static class23 field4571;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lnd;")
    public static class299 field4577;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lok;IIIIIIIZ)V", line = 10)
    public static final void method1826(class141 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class231.field3926;
        int var11;
        int var12 = var11 = (arg7 << 7) - class160.field2635;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class65.field890[arg1][arg6][arg7] - class232.field3930;
        int var18 = class65.field890[arg1][arg6 + 1][arg7] - class232.field3930;
        int var19 = class65.field890[arg1][arg6 + 1][arg7 + 1] - class232.field3930;
        int var20 = class65.field890[arg1][arg6][arg7 + 1] - class232.field3930;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class139.field2325;
        int var46 = (var24 << 9) / var25 + class139.field2320;
        int var47 = (var27 << 9) / var31 + class139.field2325;
        int var48 = (var30 << 9) / var31 + class139.field2320;
        int var49 = (var33 << 9) / var37 + class139.field2325;
        int var50 = (var36 << 9) / var37 + class139.field2320;
        int var51 = (var39 << 9) / var43 + class139.field2325;
        int var52 = (var42 << 9) / var43 + class139.field2320;
        class139.field2314 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0 && class34.field511 && class229.method1559(class36.field536 + class139.field2325, class197.field3358 + class139.field2320, var50, var52, var48, var49, var51, var47)) {
            class263.field4473 = arg6;
            class27.field411 = arg7;
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0 && class34.field511 && class229.method1559(class36.field536 + class139.field2325, class197.field3358 + class139.field2320, var46, var48, var52, var45, var47, var51)) {
            class263.field4473 = arg6;
            class27.field411 = arg7;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V", line = 114)
    public static final void method1827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4580++;
        int var6 = (arg1 - 32) * arg1 / arg0;
        class44.field605[0].method560(arg5, arg4);
        if (var6 < 8) {
            var6 = 8;
        }
        class44.field605[1].method560(arg5, arg4 + arg1 - 16);
        int var7 = (arg1 - var6 - 32) * arg3 / (arg0 - arg1);
        class311.method2116(arg5, arg4 + 16, 16, arg1 - 32, class199.field3397);
        class311.method2116(arg5, var7 + arg4 + 16, 16, var6, class52.field709);
        class311.method2104(arg5, var7 + arg4 + 16, var6, class307.field5269);
        class311.method2104(arg5 + 1, var7 + 16 + arg4, var6, class307.field5269);
        class311.method2108(arg5, arg4 + var7 + 16, 16, class307.field5269);
        class311.method2108(arg5, arg4 + var7 + 17, 16, class307.field5269);
        class311.method2104(arg5 + 15, arg4 - -var7 + 16, var6, class159.field2607);
        class311.method2104(arg5 + 14, var7 + 17 + arg4, var6 - 1, class159.field2607);
        class311.method2108(arg5, arg4 + var7 + var6 + 15, 16, class159.field2607);
        class311.method2108(arg5 + 1, arg4 - -var7 + 14 - -var6, 15, class159.field2607);
        if (arg2 != 12617) {
            field4576 = 70;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[II)Lhb;", line = 149)
    private final class32 method1828(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = arg0 ^ (arg1 >>> 12 | arg3 & arg1 << 4);
        int var6 = var5 | arg1 << 16;
        field4579++;
        long var7 = (long) var6;
        class32 var9 = (class32) this.field4583.method1612(var7, 110);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class147 var10 = class147.method915(this.field4578, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class32 var11 = var10.method916();
            this.field4583.method1611(var11, -1, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field482.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbe;I)V", line = 184)
    public static final void method1829(class283 arg0, int arg1) {
        field4574++;
        if (arg1 != 30089) {
            field4576 = -48;
        }
        if (class299.field5067 >= 2) {
            if (arg0.method1910(16369, class16.field182)) {
                class14.method74(4550);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class60.method394(0, class299.method2022(new class283[] { class13.field126, class296.method2012(var4, (byte) 107), class18.field228 }, (byte) 54), (class283) null, (byte) 91);
            }
            if (arg0.method1910(16369, class76.field1329)) {
                System.out.println("oncard_geometry:" + class101.field1724);
                System.out.println("oncard_2d:" + class101.field1722);
                System.out.println("oncard_texture:" + class101.field1720);
            }
            if (arg0.method1910(arg1 ^ 0x4A78, class137.field2290)) {
                class171.method1088(arg1 - 26293);
            }
            if (arg0.method1910(arg1 - 13720, class69.field1145)) {
                class77.method506(25, -30354);
            }
            if (arg0.method1910(16369, class155.field2556)) {
                class65.field906 = true;
            }
            if (arg0.method1910(16369, class99.field1682)) {
                class65.field906 = false;
            }
            if (arg0.method1910(16369, class249.field4249)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class180.field3102[var5].field1765[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method1899(class162.field2653, (byte) 38) && class256.field4325 != 0) {
                class77.method504(126, arg0.method1914((byte) -88, 6).method1930(10));
            }
            if (arg0.method1910(arg1 - 13720, class35.field518) && class256.field4325 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1899(class180.field3111, (byte) 38)) {
                class194.field3313 = arg0.method1914((byte) -72, 12).method1946((byte) -32).method1930(10);
                class60.method394(0, class299.method2022(new class283[] { class175.field3020, class296.method2012(class194.field3313, (byte) 106) }, (byte) 96), (class283) null, (byte) 56);
            }
            if (arg0.method1910(16369, class246.field4179)) {
                class297.field5037 = true;
            }
            if (arg0.method1926(-16620, class171.field2886)) {
                if (class1.field2 == null) {
                    class87.method559(768, false, 1024);
                } else {
                    class143.method903((byte) -128);
                }
            }
        }
        class54.field720++;
        class228.field3831.method621(113, 8);
        class228.field3831.method1499(true, arg0.method1925((byte) -44) - 1);
        class228.field3831.method1520(arg0.method1914((byte) -122, 2), arg1 ^ 0x75E5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lek;B)V", line = 304)
    public static final void method1830(class172 arg0, byte arg1) {
        class96.field1602 = arg0;
        int var2 = -12 / ((-arg1 - 59) / 58);
        field4582++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 322)
    public static final void method1831(byte arg0) {
        class87.field1466.method1636(121);
        if (arg0 != -106) {
            field4575 = (class283) null;
        }
        class150.field2445.method1636(arg0 ^ 0xFFFFFFFA);
        field4569++;
        class104.field1779.method1636(127);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)Lhb;", line = 339)
    public final class32 method1832(int[] arg0, int arg1, int arg2) {
        if (arg2 > -59) {
            field4571 = (class23) null;
        }
        field4573++;
        if (this.field4578.method1117(-1) == 1) {
            return this.method1828(arg1, 0, arg0, 65523);
        } else if (this.field4578.method1108(arg1, -121) == 1) {
            return this.method1828(0, arg1, arg0, 65523);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B[II)Lhb;", line = 360)
    public final class32 method1833(byte arg0, int[] arg1, int arg2) {
        field4570++;
        if (this.field4566.method1117(-1) == 1) {
            return this.method1835(0, (byte) -115, arg2, arg1);
        } else if (this.field4566.method1108(arg2, -99) == 1) {
            return this.method1835(arg2, (byte) -41, 0, arg1);
        } else {
            if (arg0 > -23) {
                method1827(-42, 5, 42, -26, -105, 67);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkg;I)V", line = 382)
    public static final void method1834(class69 arg0, int arg1) {
        field4568++;
        if (class160.field2625 == arg0.field1124) {
            class201.field3434[arg0.field1053] = true;
        }
        if (arg1 != 0) {
            method1827(-96, 0, -80, -127, 98, -80);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI[I)Lhb;", line = 398)
    private final class32 method1835(int arg0, byte arg1, int arg2, int[] arg3) {
        field4572++;
        int var5 = arg2 ^ (arg0 << 4 & 0xFFF8 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class32 var9 = (class32) this.field4583.method1612(var7, 126);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class173 var10 = (class173) this.field4581.method1612(var7, 123);
            int var11 = 52 % ((arg1 - 5) / 35);
            if (var10 == null) {
                var10 = class173.method1131(this.field4566, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4581.method1611(var10, -1, var7);
            }
            class32 var12 = var10.method1125(arg3);
            if (var12 == null) {
                return null;
            } else {
                var10.method557((byte) -89);
                this.field4583.method1611(var12, -1, var7);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lek;Lek;)V", line = 478)
    public class272(class172 arg0, class172 arg1) {
        this.field4566 = arg1;
        this.field4578 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 467)
    public static void method1836(int arg0) {
        field4577 = null;
        if (arg0 < -86) {
            field4567 = null;
            field4575 = null;
            field4571 = null;
        }
    }
}
