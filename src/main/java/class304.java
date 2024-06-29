import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class304 extends class329 {

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "Lph;")
    public static class229 field5077 = class266.method1858("Nehmen", 0);

    @OriginalMember(owner = "client!ui", name = "mb", descriptor = "Lph;")
    public static class229 field5086 = class266.method1858("Texturen geladen)3", 0);

    @OriginalMember(owner = "client!ui", name = "ib", descriptor = "Lph;")
    public static class229 field5082 = class266.method1858("Konfig geladen)3", 0);

    @OriginalMember(owner = "client!ui", name = "nb", descriptor = "Lph;")
    public static class229 field5087 = class266.method1858(" x ", 0);

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!ui", name = "hb", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!ui", name = "jb", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!ui", name = "lb", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ui", name = "ob", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!ui", name = "kb", descriptor = "[[[B")
    public static byte[][][] field5084;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I", line = 11)
    public final int[][] method116(int arg0, int arg1) {
        int[][] var3 = this.field838.method1796(true, arg0);
        field5080++;
        if (this.field838.field4334 && this.method2254((byte) 124)) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int var7 = arg0 % this.field5605 * this.field5605;
            for (int var8 = 0; var8 < class293.field4789; var8++) {
                int var9 = this.field5611[var8 % this.field5602 + var7];
                var4[var8] = class243.method1696(4080, var9 << 4);
                var5[var8] = class243.method1696(4080, var9 >> 4);
                var6[var8] = class243.method1696(var9 >> 12, 4080);
            }
        }
        if (arg1 != 4588) {
            field5082 = (class229) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V", line = 65)
    public static void method2051(boolean arg0) {
        field5077 = null;
        field5086 = null;
        field5087 = null;
        if (arg0) {
            method2055(-55, (byte) 112);
        }
        field5082 = null;
        field5084 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)V", line = 80)
    public static final void method2052(int arg0, boolean arg1) {
        class146.method1074(23227, class198.field3292, class273.field4567, arg1, class266.field4484);
        field5081++;
        if (arg0 < 57) {
            field5083 = -69;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IIB)Lph;", line = 97)
    public static final class229 method2053(int arg0, int arg1, byte arg2) {
        field5076++;
        int var3 = arg0 - arg1;
        if (arg2 != -87) {
            method2052(-74, false);
        }
        if (var3 < -9) {
            return class50.field724;
        } else if (var3 < -6) {
            return class113.field1924;
        } else if (var3 < -3) {
            return class17.field207;
        } else if (var3 < 0) {
            return class122.field2060;
        } else if (var3 > 9) {
            return class316.field5368;
        } else if (var3 > 6) {
            return class82.field1345;
        } else if (var3 <= 3) {
            return var3 > 0 ? class269.field4522 : class133.field2157;
        } else {
            return class155.field2520;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I", line = 146)
    public static final int method2054(byte arg0, int arg1) {
        int var2 = 2 / ((arg0 - 52) / 59);
        field5085++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IB)V", line = 156)
    public static final void method2055(int arg0, byte arg1) {
        if (arg1 != -5) {
            field5078 = -109;
        }
        field5088++;
        class241.field3984.method1418((byte) -17, arg0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIIII)V", line = 170)
    public static final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5079++;
        int var11 = arg5 - arg10;
        int var12 = arg4 - arg8;
        if (arg4 < class214.field3537) {
            var12++;
        }
        if (class50.field716 > arg5) {
            var11++;
        }
        int var13 = -50 / ((arg7 + 65) / 51);
        int var10000;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = arg2 * var14 + arg1 >> 16;
            int var16 = arg1 + ((var14 + 1) * arg2) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg10 + var14 >> 6;
                if (var18 >= 0 && var18 <= (class321.field5438.length - 1)) {
                    int var19 = arg6 + var16;
                    int var20 = arg6 + var15;
                    int[][] var21 = class321.field5438[var18];
                    byte[][] var22 = class186.field3029[var18];
                    byte[][] var23 = class243.field4012[var18];
                    byte[][] var24 = class5.field54[var18];
                    byte[][] var25 = class68.field1097[var18];
                    byte[][] var26 = class84.field1451[var18];
                    for (int var27 = 0; var27 < var12; var27++) {
                        int var28 = arg0 * var27 + arg9 >> 16;
                        int var29 = (var27 + 1) * arg0 + arg9 >> 16;
                        int var30 = var29 - var28;
                        if (var30 > 0) {
                            int var31 = arg8 + var27 >> 6;
                            int var32 = arg3 + var29;
                            int var33 = arg3 + var28;
                            int var34 = var27 + arg8 & 0x3F;
                            int var35 = arg10 + var14 & 0x3F;
                            int var36 = (var34 << 6) + var35;
                            int var37;
                            if (var31 < 0 || var21.length - 1 < var31 || var21[var31] == null) {
                                if (class169.field2795.field3878 != -1) {
                                    var37 = class169.field2795.field3878;
                                } else if ((var27 + arg8 & 0x4) == (arg10 + var14 & 0x4)) {
                                    var37 = class293.field4793[class129.field2123 + 1];
                                } else {
                                    var37 = 4936552;
                                }
                                if (var31 < 0 || var31 > var21.length - 1) {
                                    if (var37 == 0) {
                                        var37 = 1;
                                    }
                                    class210.method1465(var20, var33, var17, var30, var37);
                                    continue;
                                }
                            } else {
                                var37 = var21[var31][var36];
                            }
                            int var38 = var22[var31] == null ? 0 : class293.field4793[var22[var31][var36] & 0xFF];
                            if (var37 == 0) {
                                var37 = 1;
                            }
                            int var39 = var24[var31] == null ? 0 : class293.field4793[var24[var31][var36] & 0xFF];
                            if (var38 == 0 && var39 == 0) {
                                class210.method1465(var20, var33, var17, var30, var37);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var40 = var23[var31] == null ? 0 : var23[var31][var36];
                                    int var41 = var40 & 0xFC;
                                    if (var41 == 0 || var17 <= 1 || var30 <= 1) {
                                        class210.method1465(var20, var33, var17, var30, var38);
                                    } else {
                                        class63.method441(class210.field3485, true, var33, var17, var20, -23877, var40 & 0x3, var30, var41 >> 2, var38, var37);
                                    }
                                }
                                if (var39 != 0) {
                                    byte var42 = var26[var31][var36];
                                    if (var39 == -1) {
                                        var39 = var37;
                                    }
                                    int var43 = var42 & 0xFC;
                                    if (var43 == 0 || var17 <= 1 || var30 <= 1) {
                                        class210.method1465(var20, var33, var17, var30, var39);
                                    }
                                    class63.method441(class210.field3485, var38 == 0, var33, var17, var20, -23877, var42 & 0x3, var30, var43 >> 2, var39, 0);
                                }
                            }
                            if (var25[var31] != null) {
                                int var44 = var25[var31][var36] & 0xFF;
                                if (var44 != 0) {
                                    int var45;
                                    if (var17 == 1) {
                                        var45 = var20;
                                    } else {
                                        var45 = var19 - 1;
                                    }
                                    int var46;
                                    if (var30 == 1) {
                                        var46 = var33;
                                    } else {
                                        var46 = var32 - 1;
                                    }
                                    int var47 = 13421772;
                                    if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                        var44 -= 4;
                                        var47 = 13369344;
                                    }
                                    if (var44 == 1) {
                                        class210.method1477(var20, var33, var30, var47);
                                    } else if (var44 == 2) {
                                        class210.method1474(var20, var33, var17, var47);
                                    } else if (var44 == 3) {
                                        class210.method1477(var45, var33, var30, var47);
                                    } else if (var44 == 4) {
                                        class210.method1474(var20, var46, var17, var47);
                                    } else if (var44 == 9) {
                                        class210.method1477(var20, var33, var30, 16777215);
                                        class210.method1474(var20, var33, var17, var47);
                                    } else if (var44 == 10) {
                                        class210.method1477(var45, var33, var30, 16777215);
                                        class210.method1474(var20, var33, var17, var47);
                                    } else if (var44 == 11) {
                                        class210.method1477(var45, var33, var30, 16777215);
                                        class210.method1474(var20, var46, var17, var47);
                                    } else if (var44 == 12) {
                                        class210.method1477(var20, var33, var30, 16777215);
                                        class210.method1474(var20, var46, var17, var47);
                                    } else if (var44 == 17) {
                                        class210.method1474(var20, var33, 1, var47);
                                    } else if (var44 == 18) {
                                        class210.method1474(var45, var33, 1, var47);
                                    } else if (var44 == 19) {
                                        class210.method1474(var45, var46, 1, var47);
                                    } else if (var44 == 20) {
                                        class210.method1474(var20, var46, 1, var47);
                                    } else if (var44 == 25) {
                                        for (int var49 = 0; var49 < var30; var49++) {
                                            class210.method1474(var20 + var49, -var49 + var46, 1, var47);
                                        }
                                    } else if (var44 == 26) {
                                        for (int var48 = 0; var48 < var30; var48++) {
                                            class210.method1474(var20 + var48, var33 + var48, 1, var47);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg6 + var16;
                    int var51 = arg6 + var15;
                    for (int var52 = 0; var52 < var12; var52++) {
                        int var53;
                        if (class169.field2795.field3878 != -1) {
                            var53 = class169.field2795.field3878;
                        } else if ((arg8 + var52 & 0x4) == (arg10 + var14 & 0x4)) {
                            var53 = class293.field4793[class129.field2123 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        int var54 = (arg9 + (arg0 * var52) >> 16) + arg3;
                        int var55 = (arg9 + ((var52 + 1) * arg0) >> 16) + arg3;
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        int var56 = var55 - var54;
                        class210.method1465(var51, var54, var17, var56, var53);
                    }
                }
            }
        }
        for (int var57 = -2; var57 < (var11 + 2); var57++) {
            int var58 = arg2 * var57 + arg1 >> 16;
            int var59 = (var57 + 1) * arg2 + arg1 >> 16;
            int var60 = var59 - var58;
            if (var60 > 0) {
                var10000 = arg6 + var59;
                int var62 = arg6 + var58;
                int var63 = arg10 + var57 >> 6;
                if (var63 >= 0 && var63 <= (class38.field612.length - 1)) {
                    short[][] var64 = class38.field612[var63];
                    for (int var65 = -2; var65 < (var12 + 2); var65++) {
                        int var66 = arg0 * var65 + arg9 >> 16;
                        int var67 = (var65 + 1) * arg0 + arg9 >> 16;
                        int var68 = var67 - var66;
                        if (var68 > 0) {
                            var10000 = arg3 + var67;
                            int var70 = arg3 + var66;
                            int var71 = arg8 + var65 >> 6;
                            if (var71 >= 0 && var71 <= (var64.length - 1)) {
                                int var72 = (var65 + arg8 & 0x3F << 6) + (arg10 + var57 & 0x3F);
                                if (var64[var71] != null) {
                                    int var73 = var64[var71][var72] & 0x3FFF;
                                    int var74 = (var64[var71][var72] & 0xF782) >> 14;
                                    if (var73 != 0) {
                                        if (var74 == 0) {
                                            int var75 = class5.field65[var73 - 1].field3610 * var60 / 4;
                                            int var76 = class5.field65[var73 - 1].field3611 * var68 / 4;
                                            if (var75 != 0 && var76 != 0) {
                                                int var77 = class5.field65[var73 - 1].field3615 * var68 / 4;
                                                class5.field65[var73 - 1].method275(var62, var70 - var77, var75, var76);
                                            }
                                        } else if (var74 == 1) {
                                            int var84 = class68.field1088[var73 - 1].field3610 * var60 / 4;
                                            int var85 = class68.field1088[var73 - 1].field3611 * var68 / 4;
                                            if (var84 != 0 && var85 != 0) {
                                                int var86 = class68.field1088[var73 - 1].field3615 * var68 / 4;
                                                class68.field1088[var73 - 1].method275(var62, var70 - var86, var84, var85);
                                            }
                                        } else if (var74 == 2) {
                                            int var81 = class10.field129[var73 - 1].field3610 * var60 / 4;
                                            int var82 = class10.field129[var73 - 1].field3611 * var68 / 4;
                                            if (var81 != 0 && var82 != 0) {
                                                int var83 = class10.field129[var73 - 1].field3615 * var68 / 4;
                                                class10.field129[var73 - 1].method275(var62, var70 - var83, var81, var82);
                                            }
                                        } else if (var74 == 3) {
                                            int var78 = class135.field2200[var73 - 1].field3610 * var60 / 4;
                                            int var79 = class135.field2200[var73 - 1].field3611 * var68 / 4;
                                            if (var78 != 0 && var79 != 0) {
                                                int var80 = class135.field2200[var73 - 1].field3615 * var68 / 4;
                                                class135.field2200[var73 - 1].method275(var62, var70 - var80, var78, var79);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
