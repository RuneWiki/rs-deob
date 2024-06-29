import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class243 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lsc;")
    private class259 field3996 = new class259(256);

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Lsc;")
    private class259 field4004 = new class259(256);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lve;")
    private class266 field3994;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lve;")
    private class266 field4001;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3997 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
    public static boolean field4003 = false;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lrf;")
    public static class274 field3995;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIIII)V", line = 5)
    public static final void method1676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3998++;
        int var11 = arg4 - arg6;
        int var12 = arg2 - arg3;
        if (class38.field623 > arg4) {
            var11++;
        }
        if (class317.field5436 > arg2) {
            var12++;
        }
        if (arg10 != -12541) {
            method1677(-14);
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg8 * var13 + arg1 >> 16;
            int var15 = (var13 + 1) * arg8 + arg1 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = var13 + arg6 >> 6;
                if (var17 >= 0 && (class189.field2970.length - 1) >= var17) {
                    int var18 = arg5 + var14;
                    int[][] var19 = class189.field2970[var17];
                    byte[][] var20 = class236.field3770[var17];
                    byte[][] var21 = class35.field578[var17];
                    byte[][] var22 = class260.field4257[var17];
                    byte[][] var23 = class263.field4310[var17];
                    int var24 = arg5 + var15;
                    byte[][] var25 = class315.field5386[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg7 * var26 + arg9 >> 16;
                        int var28 = arg9 + ((var26 + 1) * arg7) >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg0 + var28;
                            int var31 = arg3 + var26 >> 6;
                            int var32 = arg3 + var26 & 0x3F;
                            int var33 = arg0 + var27;
                            int var34 = arg6 + var13 & 0x3F;
                            int var35 = (var32 << 6) + var34;
                            int var36;
                            if (var31 < 0 || var19.length - 1 < var31 || var19[var31] == null) {
                                if (class82.field1328.field1031 != -1) {
                                    var36 = class82.field1328.field1031;
                                } else if ((arg3 + var26 & 0x4) == (arg6 + var13 & 0x4)) {
                                    var36 = class124.field1924[class98.field1601 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || var31 > var19.length - 1) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class34.method286(var18, var33, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var31][var35];
                            }
                            int var37 = var20[var31] == null ? 0 : class124.field1924[var20[var31][var35] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var38 = var25[var31] == null ? 0 : class124.field1924[var25[var31][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class34.method286(var18, var33, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var21[var31] == null ? 0 : var21[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class34.method286(var18, var33, var16, var29, var37);
                                    } else {
                                        class89.method696(class34.field571, var37, var18, var39 & 0x3, var36, var40 >> 2, var29, var16, var33, true, (byte) 21);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var23[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class34.method286(var18, var33, var16, var29, var38);
                                    }
                                    class89.method696(class34.field571, var38, var18, var41 & 0x3, 0, var42 >> 2, var29, var16, var33, var37 == 0, (byte) 21);
                                }
                            }
                            if (var22[var31] != null) {
                                int var43 = var22[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var24 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var33;
                                    } else {
                                        var45 = var30 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class34.method281(var18, var33, var29, var46);
                                    } else if (var43 == 2) {
                                        class34.method280(var18, var33, var16, var46);
                                    } else if (var43 == 3) {
                                        class34.method281(var44, var33, var29, var46);
                                    } else if (var43 == 4) {
                                        class34.method280(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class34.method281(var18, var33, var29, 16777215);
                                        class34.method280(var18, var33, var16, var46);
                                    } else if (var43 == 10) {
                                        class34.method281(var44, var33, var29, 16777215);
                                        class34.method280(var18, var33, var16, var46);
                                    } else if (var43 == 11) {
                                        class34.method281(var44, var33, var29, 16777215);
                                        class34.method280(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class34.method281(var18, var33, var29, 16777215);
                                        class34.method280(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class34.method280(var18, var33, 1, var46);
                                    } else if (var43 == 18) {
                                        class34.method280(var44, var33, 1, var46);
                                    } else if (var43 == 19) {
                                        class34.method280(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class34.method280(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class34.method280(var18 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class34.method280(var18 + var48, var33 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg5 + var14;
                    for (int var50 = 0; var50 < var12; var50++) {
                        int var51;
                        if (class82.field1328.field1031 != -1) {
                            var51 = class82.field1328.field1031;
                        } else if ((var13 + arg6 & 0x4) == (arg3 + var50 & 0x4)) {
                            var51 = class124.field1924[class98.field1601 + 1];
                        } else {
                            var51 = 4936552;
                        }
                        if (var51 == 0) {
                            var51 = 1;
                        }
                        int var52 = (arg7 * var50 + arg9 >> 16) + arg0;
                        int var53 = ((var50 + 1) * arg7 + arg9 >> 16) + arg0;
                        int var54 = var53 - var52;
                        class34.method286(var49, var52, var16, var54, var51);
                    }
                    var10000 = arg5 + var15;
                }
            }
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = arg1 + (arg8 * var56) >> 16;
            int var58 = (var56 + 1) * arg8 + arg1 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg5 + var57;
                int var61 = arg6 + var56 >> 6;
                var10000 = arg5 + var58;
                if (var61 >= 0 && class167.field2588.length - 1 >= var61) {
                    int[][] var63 = class167.field2588[var61];
                    for (int var64 = -2; var64 < (var12 + 2); var64++) {
                        int var65 = arg9 + (arg7 * var64) >> 16;
                        int var66 = arg9 + ((var64 + 1) * arg7) >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = arg0 + var65;
                            int var69 = var64 + arg3 >> 6;
                            var10000 = arg0 + var66;
                            if (var69 >= 0 && var69 <= var63.length - 1) {
                                int var71 = ((arg3 + var64 & 0x3F) << 6) + (var56 + arg6 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = var63[var69][var71];
                                    int var73 = var72 & 0x3FFF;
                                    if (var73 != 0) {
                                        int var74 = (var72 & 0xD228) >> 14;
                                        class9 var75 = class120.method829(var73 - 1, 0);
                                        class183 var76 = var75.method59(var74, (byte) -71);
                                        if (var76 != null) {
                                            int var77 = var76.field2351 * var67 / 4;
                                            int var78 = var76.field2341 * var59 / 4;
                                            if (var75.field120) {
                                                int var79 = var72 >> 16 & 0xF;
                                                int var80 = (var72 & 0xF5B710) >> 20;
                                                if ((var74 & 0x1) == 1) {
                                                    int var81 = var79;
                                                    var79 = var80;
                                                    var80 = var81;
                                                }
                                                var78 = var59 * var79;
                                                var77 = var67 * var80;
                                            }
                                            if (var78 != 0 && var77 != 0) {
                                                if (var75.field107 == 0) {
                                                    var76.method1268(var60, var68 + var67 - var77, var78, var77);
                                                } else {
                                                    var76.method1260(var60, var68 - (var77 - var67), var78, var77, var75.field107);
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

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I", line = 462)
    public static final int method1677(int arg0) {
        field3993++;
        if (class198.field3075 != null) {
            return 3;
        } else if (class255.field4184 && class88.field1446) {
            return 2;
        } else {
            if (arg0 != 0) {
                field4003 = false;
            }
            return class255.field4184 && !class88.field1446 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lve;Lve;)V", line = 635)
    public class243(class266 arg0, class266 arg1) {
        this.field3994 = arg0;
        this.field4001 = arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([IIII)Lkj;", line = 488)
    private final class176 method1678(int[] arg0, int arg1, int arg2, int arg3) {
        field3999++;
        if (arg1 != 31947) {
            return (class176) null;
        }
        int var5 = arg3 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF3);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class176 var9 = (class176) this.field4004.method1827(var7, 0);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class99 var10 = class99.method734(this.field3994, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class176 var11 = var10.method735();
            this.field4004.method1826(1, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2776.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II[I)Lkj;", line = 525)
    public final class176 method1679(int arg0, int arg1, int[] arg2) {
        field4000++;
        if (this.field3994.method1877(0) == 1) {
            return this.method1678(arg2, 31947, 0, arg0);
        } else if (this.field3994.method1898(arg0, (byte) 83) == 1) {
            return this.method1678(arg2, 31947, arg0, 0);
        } else {
            if (arg1 < 0) {
                this.field4004 = (class259) null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 547)
    public static void method1680(int arg0) {
        if (arg0 < 86) {
            method1676(73, 59, 119, 60, 89, -42, -25, 37, 88, -62, 69);
        }
        field3995 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[IIB)Lkj;", line = 559)
    private final class176 method1681(int arg0, int[] arg1, int arg2, byte arg3) {
        field4005++;
        int var5 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF3);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class176 var9 = (class176) this.field4004.method1827(var7, 0);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class296 var10 = (class296) this.field3996.method1827(var7, 0);
            if (var10 == null) {
                var10 = class296.method2082(this.field4001, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3996.method1826(1, var10, var7);
            }
            class176 var11 = var10.method2078(arg1);
            if (var11 == null) {
                return null;
            }
            var10.method1006(-1024);
            this.field4004.method1826(1, var11, var7);
            if (arg3 != 11) {
                this.method1679(64, -18, (int[]) null);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II[I)Lkj;", line = 605)
    public final class176 method1682(int arg0, int arg1, int[] arg2) {
        if (arg0 != 10089) {
            return (class176) null;
        }
        field4002++;
        if (this.field4001.method1877(0) == 1) {
            return this.method1681(0, arg2, arg1, (byte) 11);
        } else if (this.field4001.method1898(arg1, (byte) 99) == 1) {
            return this.method1681(arg1, arg2, 0, (byte) 11);
        } else {
            throw new RuntimeException();
        }
    }
}
