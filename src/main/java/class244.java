import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class244 {

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "B")
    public byte field3150;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "Z")
    public boolean field3152;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "B")
    public byte field3156;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "S")
    public short field3159;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "S")
    public short field3158;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "S")
    public short field3151;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "Lfia;")
    public static class577 field3154 = new class577(10, 2, 2, 0);

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "Lkg;")
    public static class275 field3160 = new class275(59, 6);

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "J")
    public static long field3162 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "B")
    public static byte field3155;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "[Lria;")
    public static class288[] field3161;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILha;BLria;)V", line = 9)
    public static final void method1521(int arg0, int arg1, class60 arg2, byte arg3, class288 arg4) {
        field3148++;
        class489 var5 = arg4.method1726(arg2, arg3 ^ 0x6D);
        if (var5 == null) {
            return;
        }
        arg2.method534(arg1, arg0, arg4.field3617 + arg1, arg4.field3714 + arg0);
        if (class33.field547 == 2 || class33.field547 == 5 || class582.field8137 == null) {
            arg2.method450(-16777216, var5, arg1, arg0);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class650.field9023 == 4) {
                var6 = class289.field3789;
                var7 = 4096;
                var8 = class116.field1724;
                var9 = (int) (-class521.field7309) & 0x3FFF;
            } else {
                var8 = class380.field4847.field5797;
                var9 = (int) (-class521.field7309) + class683.field9519 & 0x3FFF;
                var7 = 4096 - class127.field1815 * 16;
                var6 = class380.field4847.field5801;
            }
            int var10 = (var6 / 128) + 48 - (class409.field5183 * 2 + -208);
            int var11 = class543.field7597 * 4 + 48 - (var8 / 128) - ((class543.field7597 + -104) * 2);
            class582.field8137.method2763((float) arg4.field3617 / 2.0F + (float) arg1, (float) arg4.field3714 / 2.0F + (float) arg0, (float) var10, (float) var11, var7, var9 << 2, var5, arg1, arg0);
            for (class393 var12 = (class393) class82.field1120.method3672(-1); var12 != null; var12 = (class393) class82.field1120.method3662(-1)) {
                int var58 = var12.field4992;
                int var59 = ((class583.field8162.field1067[var58] & 0xFFFD3F0) >> 14) - class332.field4232;
                int var60 = (class583.field8162.field1067[var58] & 0x3FFF) - class447.field5936;
                int var61 = var59 * 4 + 2 - (var6 / 128);
                int var62 = var60 * 4 + 2 - (var8 / 128);
                class310.method1860(var61, arg0, arg2, var62, var5, arg4, arg1, -15134, class583.field8162.field1069[var58]);
            }
            for (int var13 = 0; var13 < class412.field5240; var13++) {
                int var55 = class263.field3315[var13] * 4 + 2 - (var6 / 128);
                int var56 = class630.field8702[var13] * 4 + 2 - (var8 / 128);
                class543 var57 = client.field3995.method3384(class327.field4197[var13], false);
                if (var57.field7541 != null) {
                    var57 = var57.method3111(class516.field7236, arg3 - 14);
                    if (var57 == null || var57.field7546 == -1) {
                        continue;
                    }
                }
                class310.method1860(var55, arg0, arg2, var56, var5, arg4, arg1, -15134, var57.field7546);
            }
            for (class133 var14 = (class133) class342.field4322.method1156(0); var14 != null; var14 = (class133) class342.field4322.method1158(22706)) {
                int var50 = (int) (var14.field2333 >> 28 & 0x3L);
                if (class26.field474 == var50) {
                    int var51 = (int) (var14.field2333 & 0x3FFFL) - class332.field4232;
                    int var52 = (int) (var14.field2333 >> 14 & 0x3FFFL) - class447.field5936;
                    int var53 = var51 * 4 + 2 - (var6 / 128);
                    int var54 = var52 * 4 + 2 - var8 / 128;
                    class211.method1356(var53, var5, class84.field1145[0], arg1, (byte) -114, var54, arg4, arg0);
                }
            }
            for (int var15 = 0; var15 < class646.field8947; var15++) {
                class592 var45 = (class592) class207.field2745.method1160((long) class751.field10483[var15], arg3 + 218);
                if (var45 != null) {
                    class733 var46 = var45.field8280;
                    if (var46.method4095((byte) 114) && class380.field4847.field5796 == var46.field5796) {
                        class131 var47 = var46.field10192;
                        if (var47 != null && var47.field1899 != null) {
                            var47 = var47.method981(35, class516.field7236);
                        }
                        if (var47 != null && var47.field1856 && var47.field1881) {
                            int var48 = var46.field5801 / 128 - (var6 / 128);
                            int var49 = var46.field5797 / 128 - (var8 / 128);
                            if (var47.field1909 == -1) {
                                class211.method1356(var48, var5, class84.field1145[1], arg1, (byte) 117, var49, arg4, arg0);
                            } else {
                                class310.method1860(var48, arg0, arg2, var49, var5, arg4, arg1, -15134, var47.field1909);
                            }
                        }
                    }
                }
            }
            int var16 = class416.field5303;
            int[] var17 = class657.field9155;
            for (int var18 = 0; var18 < var16; var18++) {
                class724 var37 = class5.field49[var17[var18]];
                if (var37 != null && var37.method4044((byte) 114) && !var37.field10102 && class380.field4847 != var37 && class380.field4847.field5796 == var37.field5796) {
                    int var38 = var37.field5801 / 128 - (var6 / 128);
                    int var39 = var37.field5797 / 128 - (var8 / 128);
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class600.field8359; var41++) {
                        if (var37.field10062.equals(class207.field2748[var41]) && class698.field9713[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class194.field2654; var43++) {
                        if (var37.field10062.equals(class306.field4038[var43].field3072)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class380.field4847.field10094 != 0 && var37.field10094 != 0 && class380.field4847.field10094 == var37.field10094) {
                        var44 = true;
                    }
                    if (var37.field10074) {
                        class211.method1356(var38, var5, class84.field1145[6], arg1, (byte) -52, var39, arg4, arg0);
                    } else if (var40) {
                        class211.method1356(var38, var5, class84.field1145[3], arg1, (byte) -80, var39, arg4, arg0);
                    } else if (var42) {
                        class211.method1356(var38, var5, class84.field1145[5], arg1, (byte) 100, var39, arg4, arg0);
                    } else if (var44) {
                        class211.method1356(var38, var5, class84.field1145[4], arg1, (byte) 87, var39, arg4, arg0);
                    } else {
                        class211.method1356(var38, var5, class84.field1145[2], arg1, (byte) -52, var39, arg4, arg0);
                    }
                }
            }
            class323[] var19 = class98.field1369;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class323 var23 = var19[var20];
                if (var23 != null && var23.field4163 != 0 && (class463.field6224 % 20) < 10) {
                    if (var23.field4163 == 1) {
                        class592 var24 = (class592) class207.field2745.method1160((long) var23.field4156, 120);
                        if (var24 != null) {
                            class733 var25 = var24.field8280;
                            int var26 = var25.field5801 / 128 - (var6 / 128);
                            int var27 = var25.field5797 / 128 - (var8 / 128);
                            class67.method623(var26, arg0, (byte) -85, var5, arg1, 360000L, var27, var23.field4155, arg4);
                        }
                    }
                    if (var23.field4163 == 2) {
                        int var28 = var23.field4159 / 128 - (var6 / 128);
                        int var29 = var23.field4164 / 128 - (var8 / 128);
                        long var30 = (long) (var23.field4166 << 7);
                        long var32 = var30 * var30;
                        class67.method623(var28, arg0, (byte) -85, var5, arg1, var32, var29, var23.field4155, arg4);
                    }
                    if (var23.field4163 == 10 && var23.field4156 >= 0 && var23.field4156 < class5.field49.length) {
                        class724 var34 = class5.field49[var23.field4156];
                        if (var34 != null) {
                            int var35 = var34.field5801 / 128 - (var6 / 128);
                            int var36 = var34.field5797 / 128 - (var8 / 128);
                            class67.method623(var35, arg0, (byte) -85, var5, arg1, 360000L, var36, var23.field4155, arg4);
                        }
                    }
                }
            }
            if (class650.field9023 != 4) {
                if (class755.field10539 != 0) {
                    int var21 = class755.field10539 * 4 + 2 - (var6 / 128) - (-(class380.field4847.method82((byte) 49) * 2) - -2);
                    int var22 = (class366.field4727 * 4 - 2 - -(class380.field4847.method82((byte) 49) * 2)) + 2 - (var8 / 128);
                    class211.method1356(var21, var5, class258.field3274[class526.field7347 ? 1 : 0], arg1, (byte) 90, var22, arg4, arg0);
                }
                if (!class380.field4847.field10102) {
                    arg2.method544(-1, 3, arg4.field3617 / 2 + arg1 - 1, 18553, 3, arg4.field3714 / 2 + arg0 - 1);
                }
            }
        }
        if (arg3 != -99) {
            field3163 = -61;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 326)
    public static void method1522(int arg0) {
        field3154 = null;
        if (arg0 != -15803) {
            field3160 = null;
        }
        field3161 = null;
        field3160 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIILha;III)V", line = 342)
    public static final void method1523(int arg0, int arg1, int arg2, int arg3, class60 arg4, int arg5, int arg6, int arg7) {
        field3153++;
        class565.field7943 = arg4;
        class277.field3474 = class565.field7943.method502();
        class584.field8164 = class565.field7943.method502();
        class705.field9776 = class565.field7943.method502();
        class409.field5194 = arg2;
        class259.field3281 = 1;
        class405.field5127 = 0;
        class55.field761 = null;
        if (arg3 >= -12) {
            field3161 = null;
        }
        class543.field7592 = arg5;
        class208.field2762 = arg0;
        class124.field1784 = 0;
        class463.field6226 = arg1;
        class603.method3410(arg7, 33984, arg6);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 371)
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field3157 = arg10;
        this.field3150 = (byte) arg8;
        this.field3152 = arg9;
        this.field3156 = (byte) arg7;
        this.field3159 = (short) arg5;
        this.field3158 = (short) arg4;
        this.field3151 = (short) arg6;
        this.field3149 = arg0;
    }
}
