import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class114 {

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "B")
    public byte field1610;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lqo;")
    public class19 field1600;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Ljs;")
    public class217 field1602;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lum;")
    public class362 field1604;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Ldi;")
    public class83 field1601;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Luu;IIILya;)V")
    public static final void method917(class188 arg0, int arg1, int arg2, int arg3, class38 arg4) {
        field1613++;
        class10 var5 = arg0.method1320(0, arg4);
        if (arg2 > -14) {
            field1607 = 31;
        }
        if (var5 == null) {
            return;
        }
        arg4.method380(arg1, arg3, arg1 + arg0.field2711, arg0.field2672 + arg3);
        if (class144.field2023 == 2 || class144.field2023 == 5 || class257.field3781 == null) {
            arg4.method358(-16777216, var5, arg1, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class462.field6802 == 4) {
            var7 = 4096;
            var6 = class203.field2949;
            var9 = (int) (-class328.field4588) & 0x3FFF;
            var8 = class204.field2966;
        } else {
            var6 = class435.field6375.field6334;
            var7 = 4096 - class465.field6839 * 16;
            var8 = class435.field6375.field6335;
            var9 = (int) (-class328.field4588) + class455.field6702 & 0x3FFF;
        }
        int var10 = var8 / 32 + 208 + 48 - class397.field5828 * 2;
        int var11 = (class457.field6713 * 4) + 48 + 208 - (var6 / 32) - (class457.field6713 * 2);
        class257.field3781.method122((float) arg0.field2711 / 2.0F + (float) arg1, (float) arg0.field2672 / 2.0F + (float) arg3, (float) var10, (float) var11, var7, var9 << 2, var5, arg1, arg3);
        for (class389 var12 = (class389) class303.field4321.method1018(71); var12 != null; var12 = (class389) class303.field4321.method1022((byte) -112)) {
            int var54 = var12.field5750;
            int var55 = (class125.field1822.field166[var54] >> 14 & 0x3FFF) - class340.field4713;
            int var56 = (class125.field1822.field166[var54] & 0x3FFF) - class476.field7013;
            int var57 = var55 * 4 + 2 - (var8 / 32);
            int var58 = var56 * 4 + 2 - (var6 / 32);
            class450.method2720(var57, -14698, arg4, class125.field1822.field160[var54], arg0, var58, var5, arg1, arg3);
        }
        for (int var13 = 0; var13 < class340.field4723; var13++) {
            int var51 = class141.field1997[var13] * 4 + 2 - (var8 / 32);
            int var52 = class70.field904[var13] * 4 + 2 - (var6 / 32);
            class222 var53 = class384.field5645.method786(class280.field4093[var13], 0);
            if (var53.field3233 != null) {
                var53 = var53.method1509(class253.field3739, (byte) -21);
                if (var53 == null || var53.field3189 == -1) {
                    continue;
                }
            }
            class450.method2720(var51, -14698, arg4, var53.field3189, arg0, var52, var5, arg1, arg3);
        }
        for (class518 var14 = (class518) class89.field1216.method880((byte) -23); var14 != null; var14 = (class518) class89.field1216.method879((byte) -20)) {
            int var48 = (int) (var14.field3271 >> 28 & 0x3L);
            if (class265.field3904 == var48) {
                int var49 = (int) (var14.field3271 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                int var50 = (int) (var14.field3271 >> 14 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                class100.method859(arg1, true, class477.field7026[0], arg0, var5, var50, var49, arg3);
            }
        }
        for (int var15 = 0; var15 < class232.field3410; var15++) {
            class461 var44 = class250.field3690[class173.field2454[var15]];
            if (var44 != null && var44.method2767(104) && class435.field6375.field6328 == var44.field6328) {
                class100 var45 = var44.field6790;
                if (var45 != null && var45.field1364 != null) {
                    var45 = var45.method848(false, class253.field3739);
                }
                if (var45 != null && var45.field1339 && var45.field1366) {
                    int var46 = var44.field6335 / 32 - var8 / 32;
                    int var47 = var44.field6334 / 32 - (var6 / 32);
                    if (var45.field1410 == -1) {
                        class100.method859(arg1, true, class477.field7026[1], arg0, var5, var47, var46, arg3);
                    } else {
                        class450.method2720(var46, -14698, arg4, var45.field1410, arg0, var47, var5, arg1, arg3);
                    }
                }
            }
        }
        int var16 = class75.field1027;
        int[] var17 = class334.field4634;
        for (int var18 = 0; var18 < var16; var18++) {
            class364 var36 = class384.field5647[var17[var18]];
            if (var36 != null && var36.method2171(52) && class435.field6375 != var36 && class435.field6375.field6328 == var36.field6328) {
                int var37 = var36.field6335 / 32 - (var8 / 32);
                int var38 = var36.field6334 / 32 - (var6 / 32);
                boolean var39 = false;
                for (int var40 = 0; var40 < class91.field1257; var40++) {
                    if (var36.field5074.equals(class353.field4943[var40]) && class45.field508[var40] != 0) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                for (int var42 = 0; var42 < class221.field3177; var42++) {
                    if (var36.field5074.equals(class24.field288[var42].field3755)) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                if (class435.field6375.field5072 != 0 && var36.field5072 != 0 && class435.field6375.field5072 == var36.field5072) {
                    var43 = true;
                }
                if (var36.field5063) {
                    class100.method859(arg1, true, class477.field7026[6], arg0, var5, var38, var37, arg3);
                } else if (var39) {
                    class100.method859(arg1, true, class477.field7026[3], arg0, var5, var38, var37, arg3);
                } else if (var41) {
                    class100.method859(arg1, true, class477.field7026[5], arg0, var5, var38, var37, arg3);
                } else if (var43) {
                    class100.method859(arg1, true, class477.field7026[4], arg0, var5, var38, var37, arg3);
                } else {
                    class100.method859(arg1, true, class477.field7026[2], arg0, var5, var38, var37, arg3);
                }
            }
        }
        class452[] var19 = class133.field1922;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class452 var23 = var19[var20];
            if (var23 != null && var23.field6652 != 0 && class263.field3867 % 20 < 10) {
                if (var23.field6652 == 1 && var23.field6645 >= 0 && class250.field3690.length > var23.field6645) {
                    class461 var24 = class250.field3690[var23.field6645];
                    if (var24 != null) {
                        int var25 = var24.field6335 / 32 - (var8 / 32);
                        int var26 = var24.field6334 / 32 - (var6 / 32);
                        class180.method1263(arg0, var5, var25, arg1, var23.field6646, 256, arg3, var26, 360000L);
                    }
                }
                if (var23.field6652 == 2) {
                    int var27 = var23.field6653 / 32 - (var8 / 32);
                    int var28 = var23.field6655 / 32 - var6 / 32;
                    long var29 = (long) (var23.field6650 << 5);
                    long var31 = var29 * var29;
                    class180.method1263(arg0, var5, var27, arg1, var23.field6646, 256, arg3, var28, var31);
                }
                if (var23.field6652 == 10 && var23.field6645 >= 0 && class384.field5647.length > var23.field6645) {
                    class364 var33 = class384.field5647[var23.field6645];
                    if (var33 != null) {
                        int var34 = var33.field6335 / 32 - (var8 / 32);
                        int var35 = var33.field6334 / 32 - (var6 / 32);
                        class180.method1263(arg0, var5, var34, arg1, var23.field6646, 256, arg3, var35, 360000L);
                    }
                }
            }
        }
        if (class462.field6802 == 4) {
            return;
        }
        if (class74.field1012 != 0) {
            int var21 = class74.field1012 * 4 + ((class435.field6375.method963((byte) 127) * 2) + 2) - (var8 / 32) - 2;
            int var22 = class98.field1317 * 4 + (class435.field6375.method963((byte) 127) + -1) * 2 + 2 - (var6 / 32);
            class100.method859(arg1, true, class47.field522[class233.field3421 ? 1 : 0], arg0, var5, var22, var21, arg3);
        }
        arg4.method367(arg1 - (1 - (arg0.field2711 / 2)), 3, arg0.field2672 / 2 + arg3 - 1, (byte) 58, -1, 3);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)I")
    public static final int method918(int arg0, boolean arg1) {
        field1614++;
        if (!arg1) {
            method920((byte) 124);
        }
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIII)V")
    public static final void method919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var11 = arg2 + 1;
        class531.method3136(arg4, -25, arg3, arg1, class141.field1996[arg2]);
        field1606++;
        int var10 = arg0 - 1;
        class531.method3136(arg4, 120, arg3, arg1, class141.field1996[arg0]);
        int var6 = 75 % ((arg5 + 21) / 33);
        for (int var7 = var11; var7 <= var10; var7++) {
            int[] var8 = class141.field1996[var7];
            var8[arg4] = var8[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
    public static final int method920(byte arg0) {
        field1612++;
        if (class149.field2112 == null) {
            if (arg0 != -123) {
                field1607 = 76;
            }
            return class200.field2937 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(BIIIII)V")
    public class114(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1603 = arg3;
        this.field1611 = arg2;
        this.field1605 = arg4;
        this.field1608 = arg1;
        this.field1609 = arg5;
        this.field1610 = arg0;
    }
}
