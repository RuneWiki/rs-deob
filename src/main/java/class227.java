import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class227 {

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    private int field3641 = 0;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    private int field3647 = -1;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Led;")
    private class187 field3645 = new class187();

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Z")
    public boolean field3651 = false;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "[Lbl;")
    private class34[] field3650;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[[I")
    private int[][] field3639;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "[I")
    public static int[] field3644 = new int[25];

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3642 = "Please remove ";

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3638 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method1622(int arg0) {
        field3644 = null;
        if (arg0 < 89) {
            method1622(123);
        }
        field3642 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)[[I")
    public final int[][] method1623(int arg0) {
        field3635++;
        if (arg0 != -15578) {
            this.field3651 = true;
        }
        if (this.field3646 != this.field3637) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3646; var2++) {
            this.field3650[var2] = class160.field2618;
        }
        return this.field3639;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2 - arg7;
        if (class85.field1245 > arg2) {
            var11++;
        }
        field3649++;
        int var12 = arg3 - arg5;
        if (arg3 < class52.field753) {
            var12++;
        }
        if (arg9 != 16777215) {
            return;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var41 = (var13 + 1) * arg8 + arg4 >> 16;
            int var42 = arg4 + (arg8 * var13) >> 16;
            int var43 = var41 - var42;
            if (var43 > 0) {
                int var44 = arg7 + var13 >> 6;
                if (var44 >= 0 && var44 <= class24.field280.length - 1) {
                    int var45 = arg0 + var41;
                    int[][] var46 = class24.field280[var44];
                    byte[][] var47 = class122.field1784[var44];
                    int var48 = arg0 + var42;
                    byte[][] var49 = class253.field4183[var44];
                    byte[][] var50 = class267.field4310[var44];
                    byte[][] var51 = class33.field417[var44];
                    byte[][] var52 = class252.field4162[var44];
                    for (int var53 = 0; var53 < var12; var53++) {
                        int var54 = arg1 * var53 + arg10 >> 16;
                        int var55 = (var53 + 1) * arg1 + arg10 >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg6 + var55;
                            int var58 = arg6 + var54;
                            int var59 = arg5 + var53 >> 6;
                            int var60 = arg5 + var53 & 0x3F;
                            int var61 = arg7 + var13 & 0x3F;
                            int var62 = (var60 << 6) + var61;
                            int var63;
                            if (var59 < 0 || var46.length - 1 < var59 || var46[var59] == null) {
                                if (class222.field3551.field3548 != -1) {
                                    var63 = class222.field3551.field3548;
                                } else if ((arg5 + var53 & 0x4) == (arg7 + var13 & 0x4)) {
                                    var63 = class121.field1767[class82.field1195 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var59 < 0 || var46.length - 1 < var59) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class70.method508(var48, var58, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var46[var59][var62];
                            }
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            int var64 = var47[var59] == null ? 0 : class121.field1767[var47[var59][var62] & 0xFF];
                            int var65 = var50[var59] == null ? 0 : class121.field1767[var50[var59][var62] & 0xFF];
                            if (var64 == 0 && var65 == 0) {
                                class70.method508(var48, var58, var43, var56, var63);
                            } else {
                                if (var64 != 0) {
                                    byte var66 = var49[var59] == null ? 0 : var49[var59][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var64 == -1) {
                                        var64 = 1;
                                    }
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class70.method508(var48, var58, var43, var56, var64);
                                    } else {
                                        class124.method899(var64, var48, var58, (byte) 124, var63, var67 >> 2, var56, var66 & 0x3, true, var43, class70.field1031);
                                    }
                                }
                                if (var65 != 0) {
                                    if (var65 == -1) {
                                        var65 = var63;
                                    }
                                    byte var68 = var51[var59][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class70.method508(var48, var58, var43, var56, var65);
                                    }
                                    class124.method899(var65, var48, var58, (byte) 50, 0, var69 >> 2, var56, var68 & 0x3, var64 == 0, var43, class70.field1031);
                                }
                            }
                            if (var52[var59] != null) {
                                int var70 = var52[var59][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var48;
                                    } else {
                                        var71 = var45 - 1;
                                    }
                                    int var72;
                                    if (var56 == 1) {
                                        var72 = var58;
                                    } else {
                                        var72 = var57 - 1;
                                    }
                                    int var73 = 13421772;
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var70 -= 4;
                                        var73 = 13369344;
                                    }
                                    if (var70 == 1) {
                                        class70.method510(var48, var58, var56, var73);
                                    } else if (var70 == 2) {
                                        class70.method492(var48, var58, var43, var73);
                                    } else if (var70 == 3) {
                                        class70.method510(var71, var58, var56, var73);
                                    } else if (var70 == 4) {
                                        class70.method492(var48, var72, var43, var73);
                                    } else if (var70 == 9) {
                                        class70.method510(var48, var58, var56, 16777215);
                                        class70.method492(var48, var58, var43, var73);
                                    } else if (var70 == 10) {
                                        class70.method510(var71, var58, var56, 16777215);
                                        class70.method492(var48, var58, var43, var73);
                                    } else if (var70 == 11) {
                                        class70.method510(var71, var58, var56, 16777215);
                                        class70.method492(var48, var72, var43, var73);
                                    } else if (var70 == 12) {
                                        class70.method510(var48, var58, var56, 16777215);
                                        class70.method492(var48, var72, var43, var73);
                                    } else if (var70 == 17) {
                                        class70.method492(var48, var58, 1, var73);
                                    } else if (var70 == 18) {
                                        class70.method492(var71, var58, 1, var73);
                                    } else if (var70 == 19) {
                                        class70.method492(var71, var72, 1, var73);
                                    } else if (var70 == 20) {
                                        class70.method492(var48, var72, 1, var73);
                                    } else if (var70 == 25) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class70.method492(var48 + var75, var72 - var75, 1, var73);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class70.method492(var48 + var74, var58 + var74, 1, var73);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var76 = arg0 + var42;
                    var10000 = arg0 + var41;
                    for (int var78 = 0; var78 < var12; var78++) {
                        int var79;
                        if (class222.field3551.field3548 != -1) {
                            var79 = class222.field3551.field3548;
                        } else if ((var78 + arg5 & 0x4) == (var13 + arg7 & 0x4)) {
                            var79 = class121.field1767[class82.field1195 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var80 = ((var78 + 1) * arg1 + arg10 >> 16) + arg6;
                        int var81 = (arg1 * var78 + arg10 >> 16) + arg6;
                        int var82 = var80 - var81;
                        class70.method508(var76, var81, var43, var82, var79);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < (var11 + 2); var14++) {
            int var15 = arg8 * var14 + arg4 >> 16;
            int var16 = arg4 + ((var14 + 1) * arg8) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg0 + var15;
                var10000 = arg0 + var16;
                int var20 = var14 + arg7 >> 6;
                if (var20 >= 0 && var20 <= (class208.field3338.length - 1)) {
                    int[][] var21 = class208.field3338[var20];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg1 * var22 + arg10 >> 16;
                        int var24 = (var22 + 1) * arg1 + arg10 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg6 + var24;
                            int var27 = arg6 + var23;
                            int var28 = var22 + arg5 >> 6;
                            if (var28 >= 0 && var21.length - 1 >= var28) {
                                int var29 = (var22 + arg5 & 0x3F << 6) + (var14 + arg7 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        int var32 = var30 >> 13 & 0x3;
                                        class101 var33 = class80.method582(var31 - 1, arg9 ^ 0xFF00006C);
                                        boolean var34 = (var30 & 0xB195) >> 15 == 1;
                                        class4 var35 = var33.method768(var32, (byte) -115, var34);
                                        if (var35 != null) {
                                            int var36 = var35.field1656 * var17 / 4;
                                            int var37 = var35.field1655 * var25 / 4;
                                            if (var33.field1475) {
                                                int var38 = var30 >> 16 & 0xF;
                                                int var39 = (var30 & 0xF74B33) >> 20;
                                                if ((var32 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var36 = var17 * var38;
                                                var37 = var25 * var39;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var33.field1480 == 0) {
                                                    var35.method15(var18, var25 + var27 - var37, var36, var37);
                                                } else {
                                                    var35.method18(var18, var27 + var25 - var37, var36, var37, var33.field1480);
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

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
    public static final void method1625(int arg0, boolean arg1) {
        class11.field125 = new int[104];
        class266.field4305 = new int[104];
        field3643++;
        class29.field357 = 99;
        class51.field741 = new int[arg0];
        class110.field1581 = new int[5];
        class126.field1859 = new int[104];
        class297.field4689 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class145.field2371 = new byte[var2][104][104];
        class240.field3832 = new byte[var2][104][104];
        class163.field2647 = new byte[var2][104][104];
        class94.field1402 = new byte[var2][104][104];
        class26.field302 = new int[var2][105][105];
        class59.field830 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public final void method1626(int arg0) {
        for (int var2 = 0; var2 < this.field3646; var2++) {
            this.field3639[var2] = null;
        }
        field3640++;
        this.field3639 = null;
        this.field3650 = null;
        this.field3645.method1382(0);
        if (arg0 <= 48) {
            this.field3651 = false;
        }
        this.field3645 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
    public final int[] method1627(int arg0, int arg1) {
        field3648++;
        if (arg0 != -1) {
            field3638 = -113;
        }
        if (this.field3646 == this.field3637) {
            this.field3651 = this.field3650[arg1] == null;
            this.field3650[arg1] = class160.field2618;
            return this.field3639[arg1];
        } else if (this.field3646 == 1) {
            this.field3651 = this.field3647 != arg1;
            this.field3647 = arg1;
            return this.field3639[0];
        } else {
            class34 var3 = this.field3650[arg1];
            if (var3 == null) {
                this.field3651 = true;
                if (this.field3646 <= this.field3641) {
                    class34 var4 = (class34) this.field3645.method1390((byte) -118);
                    var3 = new class34(arg1, var4.field435);
                    this.field3650[var4.field438] = null;
                    var4.method1922(-1);
                } else {
                    var3 = new class34(arg1, this.field3641);
                    this.field3641++;
                }
                this.field3650[arg1] = var3;
            } else {
                this.field3651 = false;
            }
            this.field3645.method1391(2, var3);
            return this.field3639[var3.field435];
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V")
    public class227(int arg0, int arg1, int arg2) {
        this.field3637 = arg1;
        this.field3650 = new class34[this.field3637];
        this.field3646 = arg0;
        this.field3639 = new int[this.field3646][arg2];
    }
}
