import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class249 extends class266 {

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public static int field4119 = 0;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "[I")
    public static int[] field4118 = new int[5];

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Lma;")
    public static class5 field4117 = class12.method119(":duelstake:", (byte) 94);

    @OriginalMember(owner = "client!a", name = "J", descriptor = "J")
    public static long field4121 = 0L;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "Ltj;")
    public static class73 field4123 = new class73(64);

    @OriginalMember(owner = "client!a", name = "N", descriptor = "[[[I")
    public static int[][][] field4124 = new int[2][][];

    @OriginalMember(owner = "client!a", name = "S", descriptor = "[I")
    public static int[] field4128 = new int[1000];

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Lma;")
    private static class5 field4125 = class12.method119("Allocated memory", (byte) 66);

    @OriginalMember(owner = "client!a", name = "T", descriptor = "Lma;")
    public static class5 field4129 = class12.method119(" x ", (byte) 81);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Lma;")
    public static class5 field4127 = field4125;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[Lpk;")
    public static class74[] field4122;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lek;Z)V", line = 5)
    public static final void method1737(class198 arg0, boolean arg1) {
        class197.field3128.method1485(-8564, arg0);
        while (true) {
            class198 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class198[][] var7;
            class198 var79;
            do {
                class198 var78;
                do {
                    class198 var77;
                    do {
                        class198 var76;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class198) class197.field3128.method1481(true);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3143);
                                            var3 = var2.field3148;
                                            var4 = var2.field3151;
                                            var5 = var2.field3155;
                                            var6 = var2.field3167;
                                            var7 = class43.field646[var5];
                                            float var8 = 0.0F;
                                            float var13;
                                            if (class208.field3304 == class181.field2769) {
                                                int var9 = class150.field2162[var3][var4];
                                                int var10 = var9 & 0xFFFFFF;
                                                if (class69.field1093 != var10) {
                                                    class69.field1093 = var10;
                                                    class116.method760(var10, -116);
                                                    class293.method1977(class141.method905(false));
                                                }
                                                int var11 = var9 >>> 24 << 3;
                                                if (class170.field2617 != var11) {
                                                    class170.field2617 = var11;
                                                    class105.method666(false, var11);
                                                }
                                                int var12 = class88.field1318[0][var3 + 1][var4] + class88.field1318[0][var3][var4] + class88.field1318[0][var3][var4 + 1] + class88.field1318[0][var3 + 1][var4 + 1] >> 2;
                                                class264.method1814(3, -var12, (byte) 50);
                                                var13 = 201.5F;
                                                class45.method315(var13);
                                            } else {
                                                var13 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                class45.method315(var13);
                                            }
                                            if (!var2.field3157) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class198 var14 = class43.field646[var5 - 1][var3][var4];
                                                    if (var14 != null && var14.field3143) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class195.field3038 && var3 > class70.field1111) {
                                                    class198 var15 = var7[var3 - 1][var4];
                                                    if (var15 != null && var15.field3143 && (var15.field3157 || (var2.field3168 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class195.field3038 && var3 < class72.field1132 - 1) {
                                                    class198 var16 = var7[var3 + 1][var4];
                                                    if (var16 != null && var16.field3143 && (var16.field3157 || (var2.field3168 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class103.field1537 && var4 > class74.field1159) {
                                                    class198 var17 = var7[var3][var4 - 1];
                                                    if (var17 != null && var17.field3143 && (var17.field3157 || (var2.field3168 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class103.field1537 && var4 < class80.field1242 - 1) {
                                                    class198 var18 = var7[var3][var4 + 1];
                                                    if (var18 != null && var18.field3143 && (var18.field3157 || (var2.field3168 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3157 = false;
                                            if (var2.field3160 != null) {
                                                class198 var19 = var2.field3160;
                                                class45.method315(201.5F - (float) (var19.field3167 + 1) * 50.0F);
                                                if (var19.field3161 == null) {
                                                    if (var19.field3154 != null) {
                                                        if (class24.method188(0, var3, var4)) {
                                                            class55.method420(var19.field3154, class111.field1658, class259.field4423, class61.field952, class171.field2633, var3, var4, true);
                                                        } else {
                                                            class55.method420(var19.field3154, class111.field1658, class259.field4423, class61.field952, class171.field2633, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class24.method188(0, var3, var4)) {
                                                    class207.method1363(var19.field3161, 0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var3, var4, true);
                                                } else {
                                                    class207.method1363(var19.field3161, 0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var3, var4, false);
                                                }
                                                class89 var20 = var19.field3149;
                                                if (var20 != null) {
                                                    if ((var20.field1339 & var2.field3165) == 0) {
                                                        class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                    } else {
                                                        class53.method411(var20.field1339, class211.field3365, class67.field1038, class57.field898, var6, var3, var4);
                                                    }
                                                    var20.field1337.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var20.field1330 - class211.field3365, var20.field1324 - class67.field1038, var20.field1331 - class57.field898, var20.field1335);
                                                }
                                                for (int var21 = 0; var21 < var19.field3162; var21++) {
                                                    class107 var22 = var19.field3166[var21];
                                                    if (var22 != null) {
                                                        class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                        var22.field1589.method242(var22.field1602, class111.field1658, class259.field4423, class61.field952, class171.field2633, var22.field1603 - class211.field3365, var22.field1591 - class67.field1038, var22.field1604 - class57.field898, var22.field1590);
                                                    }
                                                }
                                                class45.method315(var13);
                                            }
                                            boolean var23 = false;
                                            if (var2.field3161 == null) {
                                                if (var2.field3154 != null) {
                                                    if (class24.method188(var6, var3, var4)) {
                                                        class55.method420(var2.field3154, class111.field1658, class259.field4423, class61.field952, class171.field2633, var3, var4, true);
                                                    } else {
                                                        var23 = true;
                                                        class55.method420(var2.field3154, class111.field1658, class259.field4423, class61.field952, class171.field2633, var3, var4, false);
                                                    }
                                                }
                                            } else if (class24.method188(var6, var3, var4)) {
                                                class207.method1363(var2.field3161, var6, class111.field1658, class259.field4423, class61.field952, class171.field2633, var3, var4, true);
                                            } else {
                                                var23 = true;
                                                if (var2.field3161.field1434 != 12345678 || class101.field1516 && var5 <= class11.field168) {
                                                    class207.method1363(var2.field3161, var6, class111.field1658, class259.field4423, class61.field952, class171.field2633, var3, var4, false);
                                                }
                                            }
                                            if (var23) {
                                                class51 var24 = var2.field3158;
                                                if (var24 != null && (var24.field813 & 0x80000000L) != 0L) {
                                                    if (var24.field815) {
                                                        class45.method315(var13 + 50.0F - 1.5F);
                                                    }
                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                    var24.field809.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var24.field812 - class211.field3365, var24.field811 - class67.field1038, var24.field810 - class57.field898, var24.field813);
                                                    if (var24.field815) {
                                                        class45.method315(var13);
                                                    }
                                                }
                                            }
                                            int var25 = 0;
                                            int var26 = 0;
                                            class89 var27 = var2.field3149;
                                            class133 var28 = var2.field3144;
                                            if (var27 != null || var28 != null) {
                                                if (class195.field3038 == var3) {
                                                    var25++;
                                                } else if (class195.field3038 < var3) {
                                                    var25 += 2;
                                                }
                                                if (class103.field1537 == var4) {
                                                    var25 += 3;
                                                } else if (class103.field1537 > var4) {
                                                    var25 += 6;
                                                }
                                                var26 = class137.field2035[var25];
                                                var2.field3165 = class257.field4403[var25];
                                            }
                                            if (var27 != null) {
                                                if ((var27.field1339 & class300.field5065[var25]) == 0) {
                                                    var2.field3147 = 0;
                                                } else if (var27.field1339 == 16) {
                                                    var2.field3147 = 3;
                                                    var2.field3142 = class250.field4149[var25];
                                                    var2.field3145 = 3 - var2.field3142;
                                                } else if (var27.field1339 == 32) {
                                                    var2.field3147 = 6;
                                                    var2.field3142 = class175.field2678[var25];
                                                    var2.field3145 = 6 - var2.field3142;
                                                } else if (var27.field1339 == 64) {
                                                    var2.field3147 = 12;
                                                    var2.field3142 = class113.field1688[var25];
                                                    var2.field3145 = 12 - var2.field3142;
                                                } else {
                                                    var2.field3147 = 9;
                                                    var2.field3142 = class280.field4747[var25];
                                                    var2.field3145 = 9 - var2.field3142;
                                                }
                                                if ((var27.field1339 & var26) != 0 && !class296.method1996(var6, var3, var4, var27.field1339)) {
                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                    var27.field1337.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var27.field1330 - class211.field3365, var27.field1324 - class67.field1038, var27.field1331 - class57.field898, var27.field1335);
                                                }
                                                if ((var27.field1325 & var26) != 0 && !class296.method1996(var6, var3, var4, var27.field1325)) {
                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                    var27.field1326.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var27.field1330 - class211.field3365, var27.field1324 - class67.field1038, var27.field1331 - class57.field898, var27.field1335);
                                                }
                                            }
                                            if (var28 != null && !class59.method443(var6, var3, var4, var28.field1971.method248())) {
                                                class45.method315(var13 - 0.5F);
                                                if ((var28.field1975 & var26) != 0) {
                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                    var28.field1971.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var28.field1973 + var28.field1974 - class211.field3365, var28.field1978 - class67.field1038, var28.field1972 + var28.field1976 - class57.field898, var28.field1980);
                                                } else if (var28.field1975 == 256) {
                                                    int var29 = var28.field1973 - class211.field3365;
                                                    int var30 = var28.field1978 - class67.field1038;
                                                    int var31 = var28.field1972 - class57.field898;
                                                    int var32 = var28.field1984;
                                                    int var33;
                                                    if (var32 == 1 || var32 == 2) {
                                                        var33 = -var29;
                                                    } else {
                                                        var33 = var29;
                                                    }
                                                    int var34;
                                                    if (var32 == 2 || var32 == 3) {
                                                        var34 = -var31;
                                                    } else {
                                                        var34 = var31;
                                                    }
                                                    if (var34 < var33) {
                                                        class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                        var28.field1971.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var28.field1974 + var29, var30, var28.field1976 + var31, var28.field1980);
                                                    } else if (var28.field1977 != null) {
                                                        class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                        var28.field1977.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var29, var30, var31, var28.field1980);
                                                    }
                                                }
                                                class45.method315(var13);
                                            }
                                            if (var23) {
                                                class51 var35 = var2.field3158;
                                                if (var35 != null && (var35.field813 & 0x80000000L) == 0L) {
                                                    if (var35.field815) {
                                                        class45.method315(var13 + 50.0F - 1.5F);
                                                    }
                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                    var35.field809.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var35.field812 - class211.field3365, var35.field811 - class67.field1038, var35.field810 - class57.field898, var35.field813);
                                                    if (var35.field815) {
                                                        class45.method315(var13);
                                                    }
                                                }
                                                class139 var36 = var2.field3156;
                                                if (var36 != null && var36.field2061 == 0) {
                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                    if (var36.field2060 != null) {
                                                        var36.field2060.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var36.field2058 - class211.field3365, var36.field2056 - class67.field1038, var36.field2064 - class57.field898, var36.field2062);
                                                    }
                                                    if (var36.field2067 != null) {
                                                        var36.field2067.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var36.field2058 - class211.field3365, var36.field2056 - class67.field1038, var36.field2064 - class57.field898, var36.field2062);
                                                    }
                                                    if (var36.field2051 != null) {
                                                        var36.field2051.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var36.field2058 - class211.field3365, var36.field2056 - class67.field1038, var36.field2064 - class57.field898, var36.field2062);
                                                    }
                                                }
                                            }
                                            int var37 = var2.field3168;
                                            if (var37 != 0) {
                                                if (var3 < class195.field3038 && (var37 & 0x4) != 0) {
                                                    class198 var38 = var7[var3 + 1][var4];
                                                    if (var38 != null && var38.field3143) {
                                                        class197.field3128.method1485(-8564, var38);
                                                    }
                                                }
                                                if (var4 < class103.field1537 && (var37 & 0x2) != 0) {
                                                    class198 var39 = var7[var3][var4 + 1];
                                                    if (var39 != null && var39.field3143) {
                                                        class197.field3128.method1485(-8564, var39);
                                                    }
                                                }
                                                if (var3 > class195.field3038 && (var37 & 0x1) != 0) {
                                                    class198 var40 = var7[var3 - 1][var4];
                                                    if (var40 != null && var40.field3143) {
                                                        class197.field3128.method1485(-8564, var40);
                                                    }
                                                }
                                                if (var4 > class103.field1537 && (var37 & 0x8) != 0) {
                                                    class198 var41 = var7[var3][var4 - 1];
                                                    if (var41 != null && var41.field3143) {
                                                        class197.field3128.method1485(-8564, var41);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3147 != 0) {
                                            boolean var42 = true;
                                            for (int var43 = 0; var43 < var2.field3162; var43++) {
                                                if (class172.field2645 != var2.field3166[var43].field1601 && (var2.field3146[var43] & var2.field3147) == var2.field3142) {
                                                    var42 = false;
                                                    break;
                                                }
                                            }
                                            if (var42) {
                                                class89 var44 = var2.field3149;
                                                if (!class296.method1996(var6, var3, var4, var44.field1339)) {
                                                    label593: {
                                                        if ((var44.field1335 & 0xFC000L) == 16384L) {
                                                            int var45 = var44.field1330 - class211.field3365;
                                                            int var46 = var44.field1331 - class57.field898;
                                                            int var47 = (int) (var44.field1335 >> 20 & 0x3L);
                                                            if (var47 == 0) {
                                                                var45 -= 64;
                                                                var46 += 64;
                                                                if (var46 < var45 && var3 > 0 && var4 < class179.field2708 - 1) {
                                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3 - 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 1) {
                                                                var45 += 64;
                                                                var46 += 64;
                                                                if (var46 < -var45 && var3 < class115.field1721 - 1 && var4 < class179.field2708 - 1) {
                                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3 + 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 2) {
                                                                var45 += 64;
                                                                var46 -= 64;
                                                                if (var46 > var45 && var3 < class115.field1721 - 1 && var4 > 0) {
                                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3 + 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 3) {
                                                                var45 -= 64;
                                                                var46 -= 64;
                                                                if (var46 > -var45 && var3 > 0 && var4 > 0) {
                                                                    class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3 - 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            }
                                                        }
                                                        class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                    }
                                                    var44.field1337.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var44.field1330 - class211.field3365, var44.field1324 - class67.field1038, var44.field1331 - class57.field898, var44.field1335);
                                                }
                                                var2.field3147 = 0;
                                            }
                                        }
                                        if (!var2.field3163) {
                                            break;
                                        }
                                        try {
                                            int var48 = var2.field3162;
                                            var2.field3163 = false;
                                            int var49 = 0;
                                            label677: for (int var50 = 0; var50 < var48; var50++) {
                                                class107 var51 = var2.field3166[var50];
                                                if (class172.field2645 != var51.field1601) {
                                                    for (int var52 = var51.field1597; var52 <= var51.field1587; var52++) {
                                                        for (int var53 = var51.field1595; var53 <= var51.field1598; var53++) {
                                                            class198 var54 = var7[var52][var53];
                                                            if (var54.field3157) {
                                                                var2.field3163 = true;
                                                                continue label677;
                                                            }
                                                            if (var54.field3147 != 0) {
                                                                int var55 = 0;
                                                                if (var52 > var51.field1597) {
                                                                    var55++;
                                                                }
                                                                if (var52 < var51.field1587) {
                                                                    var55 += 4;
                                                                }
                                                                if (var53 > var51.field1595) {
                                                                    var55 += 8;
                                                                }
                                                                if (var53 < var51.field1598) {
                                                                    var55 += 2;
                                                                }
                                                                if ((var55 & var54.field3147) == var2.field3145) {
                                                                    var2.field3163 = true;
                                                                    continue label677;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class266.field4550[var49++] = var51;
                                                    int var56 = class195.field3038 - var51.field1597;
                                                    int var57 = var51.field1587 - class195.field3038;
                                                    if (var57 > var56) {
                                                        var56 = var57;
                                                    }
                                                    int var58 = class103.field1537 - var51.field1595;
                                                    int var59 = var51.field1598 - class103.field1537;
                                                    if (var59 > var58) {
                                                        var51.field1600 = var56 + var59;
                                                    } else {
                                                        var51.field1600 = var56 + var58;
                                                    }
                                                }
                                            }
                                            while (var49 > 0) {
                                                int var60 = -50;
                                                int var61 = -1;
                                                for (int var62 = 0; var62 < var49; var62++) {
                                                    class107 var63 = class266.field4550[var62];
                                                    if (class172.field2645 != var63.field1601) {
                                                        if (var63.field1600 > var60) {
                                                            var60 = var63.field1600;
                                                            var61 = var62;
                                                        } else if (var63.field1600 == var60) {
                                                            int var64 = var63.field1603 - class211.field3365;
                                                            int var65 = var63.field1604 - class57.field898;
                                                            int var66 = class266.field4550[var61].field1603 - class211.field3365;
                                                            int var67 = class266.field4550[var61].field1604 - class57.field898;
                                                            if (var64 * var64 + var65 * var65 > var66 * var66 + var67 * var67) {
                                                                var61 = var62;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var61 == -1) {
                                                    break;
                                                }
                                                class107 var68 = class266.field4550[var61];
                                                var68.field1601 = class172.field2645;
                                                if (!class200.method1312(var6, var68.field1597, var68.field1587, var68.field1595, var68.field1598, var68.field1589.method248())) {
                                                    if ((var68.field1590 & 0xFC000L) == 147456L) {
                                                        class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                                                        int var69 = var68.field1603 - class211.field3365;
                                                        int var70 = var68.field1604 - class57.field898;
                                                        int var71 = (int) (var68.field1590 >> 20 & 0x3L);
                                                        if (var71 == 1 || var71 == 3) {
                                                            if (var70 > -var69) {
                                                                class53.method405(var5, var3, var4 - 1, var3 - 1, var4);
                                                            } else {
                                                                class53.method405(var5, var3, var4 + 1, var3 + 1, var4);
                                                            }
                                                        } else if (var70 > var69) {
                                                            class53.method405(var5, var3, var4 - 1, var3 + 1, var4);
                                                        } else {
                                                            class53.method405(var5, var3, var4 + 1, var3 - 1, var4);
                                                        }
                                                    } else {
                                                        class53.method401(class211.field3365, class67.field1038, class57.field898, var5, var68.field1597, var68.field1595, var68.field1587, var68.field1598);
                                                    }
                                                    var68.field1589.method242(var68.field1602, class111.field1658, class259.field4423, class61.field952, class171.field2633, var68.field1603 - class211.field3365, var68.field1591 - class67.field1038, var68.field1604 - class57.field898, var68.field1590);
                                                }
                                                for (int var72 = var68.field1597; var72 <= var68.field1587; var72++) {
                                                    for (int var73 = var68.field1595; var73 <= var68.field1598; var73++) {
                                                        class198 var74 = var7[var72][var73];
                                                        if (var74.field3147 != 0) {
                                                            class197.field3128.method1485(-8564, var74);
                                                        } else if ((var3 != var72 || var4 != var73) && var74.field3143) {
                                                            class197.field3128.method1485(-8564, var74);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3163) {
                                                break;
                                            }
                                        } catch (Exception var94) {
                                            var2.field3163 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3143);
                            } while (var2.field3147 != 0);
                            if (var3 > class195.field3038 || var3 <= class70.field1111) {
                                break;
                            }
                            var76 = var7[var3 - 1][var4];
                        } while (var76 != null && var76.field3143);
                        if (var3 < class195.field3038 || var3 >= class72.field1132 - 1) {
                            break;
                        }
                        var77 = var7[var3 + 1][var4];
                    } while (var77 != null && var77.field3143);
                    if (var4 > class103.field1537 || var4 <= class74.field1159) {
                        break;
                    }
                    var78 = var7[var3][var4 - 1];
                } while (var78 != null && var78.field3143);
                if (var4 < class103.field1537 || var4 >= class80.field1242 - 1) {
                    break;
                }
                var79 = var7[var3][var4 + 1];
            } while (var79 != null && var79.field3143);
            var2.field3143 = false;
            class77.field1205--;
            class139 var80 = var2.field3156;
            if (var80 != null && var80.field2061 != 0) {
                class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                if (var80.field2060 != null) {
                    var80.field2060.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var80.field2058 - class211.field3365, var80.field2056 - class67.field1038 - var80.field2061, var80.field2064 - class57.field898, var80.field2062);
                }
                if (var80.field2067 != null) {
                    var80.field2067.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var80.field2058 - class211.field3365, var80.field2056 - class67.field1038 - var80.field2061, var80.field2064 - class57.field898, var80.field2062);
                }
                if (var80.field2051 != null) {
                    var80.field2051.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var80.field2058 - class211.field3365, var80.field2056 - class67.field1038 - var80.field2061, var80.field2064 - class57.field898, var80.field2062);
                }
            }
            if (var2.field3165 != 0) {
                class133 var81 = var2.field3144;
                if (var81 != null && !class59.method443(var6, var3, var4, var81.field1971.method248())) {
                    if ((var81.field1975 & var2.field3165) != 0) {
                        class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                        var81.field1971.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var81.field1973 + var81.field1974 - class211.field3365, var81.field1978 - class67.field1038, var81.field1972 + var81.field1976 - class57.field898, var81.field1980);
                    } else if (var81.field1975 == 256) {
                        int var82 = var81.field1973 - class211.field3365;
                        int var83 = var81.field1978 - class67.field1038;
                        int var84 = var81.field1972 - class57.field898;
                        int var85 = var81.field1984;
                        int var86;
                        if (var85 == 1 || var85 == 2) {
                            var86 = -var82;
                        } else {
                            var86 = var82;
                        }
                        int var87;
                        if (var85 == 2 || var85 == 3) {
                            var87 = -var84;
                        } else {
                            var87 = var84;
                        }
                        if (var87 >= var86) {
                            class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                            var81.field1971.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var81.field1974 + var82, var83, var81.field1976 + var84, var81.field1980);
                        } else if (var81.field1977 != null) {
                            class53.method410(class211.field3365, class67.field1038, class57.field898, var5, var3, var4);
                            var81.field1977.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var82, var83, var84, var81.field1980);
                        }
                    }
                }
                class89 var88 = var2.field3149;
                if (var88 != null) {
                    if ((var88.field1325 & var2.field3165) != 0 && !class296.method1996(var6, var3, var4, var88.field1325)) {
                        class53.method411(var88.field1325, class211.field3365, class67.field1038, class57.field898, var6, var3, var4);
                        var88.field1326.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var88.field1330 - class211.field3365, var88.field1324 - class67.field1038, var88.field1331 - class57.field898, var88.field1335);
                    }
                    if ((var88.field1339 & var2.field3165) != 0 && !class296.method1996(var6, var3, var4, var88.field1339)) {
                        class53.method411(var88.field1339, class211.field3365, class67.field1038, class57.field898, var6, var3, var4);
                        var88.field1337.method242(0, class111.field1658, class259.field4423, class61.field952, class171.field2633, var88.field1330 - class211.field3365, var88.field1324 - class67.field1038, var88.field1331 - class57.field898, var88.field1335);
                    }
                }
            }
            if (var5 < class168.field2570 - 1) {
                class198 var89 = class43.field646[var5 + 1][var3][var4];
                if (var89 != null && var89.field3143) {
                    class197.field3128.method1485(-8564, var89);
                }
            }
            if (var3 < class195.field3038) {
                class198 var90 = var7[var3 + 1][var4];
                if (var90 != null && var90.field3143) {
                    class197.field3128.method1485(-8564, var90);
                }
            }
            if (var4 < class103.field1537) {
                class198 var91 = var7[var3][var4 + 1];
                if (var91 != null && var91.field3143) {
                    class197.field3128.method1485(-8564, var91);
                }
            }
            if (var3 > class195.field3038) {
                class198 var92 = var7[var3 - 1][var4];
                if (var92 != null && var92.field3143) {
                    class197.field3128.method1485(-8564, var92);
                }
            }
            if (var4 > class103.field1537) {
                class198 var93 = var7[var3][var4 - 1];
                if (var93 != null && var93.field3143) {
                    class197.field3128.method1485(-8564, var93);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(III)I", line = 990)
    public static final int method1738(int arg0, int arg1, int arg2) {
        if (arg1 == -24788) {
            field4115++;
            int var3 = arg2 - 1 & arg0 >> 31;
            return ((arg0 >>> 31) + arg0) % arg2 + var3;
        } else {
            return 62;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIB)I", line = 1011)
    public static final int method1739(int arg0, int arg1, byte arg2) {
        field4116++;
        int var3 = class208.method1369(4, arg1 + 91923, arg0 + 45365, (byte) -69) - (-(class208.method1369(2, arg1 + 37821, arg0 - -10294, (byte) -110) + -128 >> 1) - (class208.method1369(1, arg1, arg0, (byte) -105) + -128 >> 2)) - 128;
        if (arg2 <= 11) {
            return 46;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V", line = 1061)
    public static void method1740(boolean arg0) {
        field4124 = (int[][][]) null;
        field4123 = null;
        field4118 = null;
        if (arg0) {
            return;
        }
        field4128 = null;
        field4125 = null;
        field4117 = null;
        field4127 = null;
        field4122 = null;
        field4129 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V", line = 1079)
    public static final void method1741(int arg0, byte arg1) {
        class281.field4751.method517(false, arg0);
        if (arg1 != -25) {
            method1737((class198) null, false);
        }
        field4120++;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Z")
    public abstract boolean method147(int arg0);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method146(int arg0);
}
