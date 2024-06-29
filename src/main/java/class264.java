import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class264 {

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field3845 = 1;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3838 = "wave:";

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    private int field3847;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)I")
    public final int method1650(byte arg0) {
        field3839++;
        int var2 = -21 / ((arg0 - 63) / 63);
        return this.field3846 & 0x3FFF;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)Z")
    public final boolean method1651(int arg0, int arg1, int arg2, int arg3) {
        field3840++;
        int var5 = this.field3847;
        if (this.field3846 == arg1 && this.field3847 == 0) {
            return false;
        }
        boolean var8;
        if (this.field3847 == 0) {
            if (arg1 > this.field3846 && (this.field3846 + arg3) >= arg1 || this.field3846 > arg1 && (this.field3846 - arg3) <= arg1) {
                this.field3846 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field3847 > 0 && this.field3846 < arg1) {
            int var6 = this.field3847 * this.field3847 / (arg3 * 2);
            int var7 = this.field3846 + var6;
            if (var7 < arg1 && this.field3846 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field3847 < 0 && arg1 < this.field3846) {
            int var9 = this.field3847 * this.field3847 / (arg3 * 2);
            int var10 = this.field3846 - var9;
            if (var10 > arg1 && this.field3846 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field3846 >= arg1) {
                this.field3847 -= arg3;
                if (arg2 != 0 && -arg2 > this.field3847) {
                    this.field3847 = -arg2;
                }
            } else {
                this.field3847 += arg3;
                if (arg2 != 0 && this.field3847 > arg2) {
                    this.field3847 = arg2;
                }
            }
            if (this.field3847 != var5) {
                int var11 = this.field3847 * this.field3847 / (arg3 * 2);
                if (this.field3846 >= arg1) {
                    if (this.field3846 > arg1 && this.field3846 - var11 < arg1) {
                        this.field3847 = var5;
                    }
                } else if (arg1 < this.field3846 + var11) {
                    this.field3847 = var5;
                }
            }
        } else if (this.field3847 > 0) {
            this.field3847 -= arg3;
            if (this.field3847 < 0) {
                this.field3847 = 0;
            }
        } else {
            this.field3847 += arg3;
            if (this.field3847 > 0) {
                this.field3847 = 0;
            }
        }
        this.field3846 += this.field3847 + var5 >> 1;
        return arg0 == 1 ? var8 : false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z[Lro;IIII)V")
    public static final void method1652(boolean arg0, class249[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -23) {
            method1653(-86);
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class249 var7 = arg1[var6];
            if (var7 != null && var7.field3623 == arg5) {
                class108.method759(255, arg4, arg3, arg0, var7);
                class321.method1989(arg3, true, arg4, var7);
                if (var7.field3594 > var7.field3611 - var7.field3578) {
                    var7.field3594 = var7.field3611 - var7.field3578;
                }
                if (var7.field3594 < 0) {
                    var7.field3594 = 0;
                }
                if (var7.field3646 - var7.field3604 < var7.field3582) {
                    var7.field3582 = var7.field3646 - var7.field3604;
                }
                if (var7.field3582 < 0) {
                    var7.field3582 = 0;
                }
                if (var7.field3637 == 0) {
                    class272.method1743(91, var7, arg0);
                }
            }
        }
        field3843++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static void method1653(int arg0) {
        if (arg0 != 30262) {
            method1653(-8);
        }
        field3838 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public final void method1654(int arg0) {
        if (arg0 == 128) {
            field3849++;
            this.field3846 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
    public final void method1655(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1655(false, 50);
        }
        field3848++;
        this.field3846 = arg1;
        this.field3847 = 0;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
    public static final void method1656(int arg0) {
        field3842++;
        if (~class88.field1227 == arg0) {
            class88.field1227 = 6;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[[I[[BLgm;Lgm;II[[B[[BLnr;I[[BZ)V")
    public static final void method1657(int arg0, int[][] arg1, byte[][] arg2, class337 arg3, class337 arg4, int arg5, int arg6, byte[][] arg7, byte[][] arg8, class437 arg9, int arg10, byte[][] arg11, boolean arg12) {
        for (int var13 = 0; var13 < arg0; var13++) {
            int var15 = arg0 - 1 <= var13 ? var13 : var13 + 1;
            for (int var16 = 0; var16 < arg5; var16++) {
                int var17 = var16 >= (arg5 - 1) ? var16 : var16 + 1;
                if (class116.method810((byte) -103) || class226.method1404(var13, true, var16, arg10, class431.field6368)) {
                    boolean var18 = false;
                    boolean var19 = false;
                    boolean[] var20 = new boolean[4];
                    int var21 = arg2[var13][var16];
                    int var22 = arg8[var13][var16];
                    int var23 = arg7[var13][var16] & 0xFF;
                    int var24 = arg11[var13][var16] & 0xFF;
                    int var25 = arg11[var13][var17] & 0xFF;
                    int var26 = arg11[var15][var17] & 0xFF;
                    int var27 = arg11[var15][var16] & 0xFF;
                    if (var23 != 0 || var24 != 0) {
                        class291 var28 = var23 == 0 ? null : class404.method2623(false, var23 - 1);
                        if (var21 == 0 && var28 == null) {
                            var21 = 12;
                        }
                        class340 var29 = var24 == 0 ? null : class135.method907(-114, var24 - 1);
                        class291 var30 = var28;
                        if (var28 != null) {
                            if (var28.field4209 == -1 && var28.field4219 == -1) {
                                var30 = var28;
                                var28 = null;
                            } else if (var29 != null && var21 != 0) {
                                var19 = var28.field4218;
                            }
                        }
                        if ((var21 == 0 || var21 == 12) && var13 > 0 && var16 > 0 && var13 < arg0 && var16 < arg5) {
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            int var34 = var33 + (arg11[var15][var17] == var24 ? 1 : -1);
                            int var35 = var32 + (arg11[var15][var16 - 1] == var24 ? 1 : -1);
                            int var36 = var31 + (arg11[var13 - 1][var16 - 1] == var24 ? 1 : -1);
                            byte var37 = 0;
                            int var38 = var37 + (arg11[var13 - 1][var17] == var24 ? 1 : -1);
                            if (arg11[var13][var16 - 1] == var24) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (arg11[var15][var16] == var24) {
                                var34++;
                                var35++;
                            } else {
                                var34--;
                                var35--;
                            }
                            if (arg11[var13][var17] == var24) {
                                var38++;
                                var34++;
                            } else {
                                var34--;
                                var38--;
                            }
                            if (arg11[var13 - 1][var16] == var24) {
                                var36++;
                                var38++;
                            } else {
                                var36--;
                                var38--;
                            }
                            int var39 = var36 - var34;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            int var40 = var35 - var38;
                            if (var40 < 0) {
                                var40 = -var40;
                            }
                            if (var39 == var40) {
                                var39 = arg3.method781(var13, var16) - arg3.method781(var15, var17);
                                var40 = arg3.method781(var15, var16) - arg3.method781(var13, var17);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                                if (var40 < 0) {
                                    var40 = -var40;
                                }
                            }
                            var22 = var40 <= var39 ? 0 : 1;
                        }
                        for (int var41 = 0; var41 < 13; var41++) {
                            class23.field387[var41] = -1;
                            class308.field4399[var41] = 1;
                        }
                        boolean[] var42 = var28 != null && var28.field4218 ? class226.field3187[var21] : class171.field2255[var21];
                        class309.method1931(arg2, var21, arg9, var20, var28, arg7, var22, arg5, arg8, var16, arg0, var29, 1, var13);
                        boolean var43 = var28 != null && var28.field4219 != var28.field4209;
                        if (!var43) {
                            for (int var44 = 0; var44 < 8; var44++) {
                                if (class23.field387[var44] >= 0 && class6.field63[var44] != class219.field3109[var44]) {
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var42[var22 + 1 & 0x3]) {
                            var20[1] = class369.method2433(var20[1], class401.method2606(class308.field4399[4], class308.field4399[2]) == 0);
                        }
                        if (!var42[var22 + 3 & 0x3]) {
                            var20[3] = class369.method2433(var20[3], class401.method2606(class308.field4399[0], class308.field4399[6]) == 0);
                        }
                        if (!var42[var22 & 0x3]) {
                            var20[0] = class369.method2433(var20[0], class401.method2606(class308.field4399[2], class308.field4399[0]) == 0);
                        }
                        if (!var42[var22 + 2 & 0x3]) {
                            var20[2] = class369.method2433(var20[2], class401.method2606(class308.field4399[4], class308.field4399[6]) == 0);
                        }
                        if (!var19 && (var21 == 0 || var21 == 12)) {
                            if (var20[0] && !var20[1] && !var20[2] && var20[3]) {
                                var21 = var21 == 0 ? 13 : 14;
                                var20[0] = var20[3] = false;
                                var22 = 0;
                            } else if (var20[0] && var20[1] && !var20[2] && !var20[3]) {
                                var21 = var21 == 0 ? 13 : 14;
                                var22 = 3;
                                var20[0] = var20[1] = false;
                            } else if (!var20[0] && var20[1] && var20[2] && !var20[3]) {
                                var20[1] = var20[2] = false;
                                var22 = 2;
                                var21 = var21 == 0 ? 13 : 14;
                            } else if (!var20[0] && !var20[1] && var20[2] && var20[3]) {
                                var21 = var21 == 0 ? 13 : 14;
                                var22 = 1;
                                var20[2] = var20[3] = false;
                            }
                        }
                        boolean var45 = !var19 && !var20[0] && !var20[2] && !var20[1] && !var20[3];
                        int[] var46 = null;
                        int[] var47;
                        int var48;
                        int[] var49;
                        int var50;
                        int[] var51;
                        if (var45) {
                            var47 = class314.field4502[var21];
                            var48 = var28 == null ? 0 : class323.field4625[var21];
                            var49 = class157.field2071[var21];
                            var51 = class417.field6216[var21];
                            var50 = var29 == null ? 0 : class162.field2112[var21];
                        } else if (var19) {
                            var48 = var28 == null ? 0 : class340.field4993[var21];
                            var47 = class312.field4469[var21];
                            var46 = class11.field127[var21];
                            var50 = var29 == null ? 0 : class285.field4160[var21];
                            var51 = class116.field1567[var21];
                            var49 = class27.field481[var21];
                        } else {
                            var47 = class75.field1014[var21];
                            var48 = var28 == null ? 0 : class64.field910[var21];
                            var49 = class404.field6073[var21];
                            var50 = var29 == null ? 0 : class345.field5117[var21];
                            var46 = class190.field2653[var21];
                            var51 = class194.field2797[var21];
                        }
                        int var52 = var48 + var50;
                        if (var52 <= 0) {
                            class433.method2749(arg10, var13, var16);
                        } else {
                            if (var20[0]) {
                                var52++;
                            }
                            if (var20[2]) {
                                var52++;
                            }
                            if (var20[1]) {
                                var52++;
                            }
                            if (var20[3]) {
                                var52++;
                            }
                            int var53 = 0;
                            int var54 = 0;
                            int var55 = var52 * 3;
                            int[] var56 = arg12 ? new int[var55] : null;
                            int[] var57 = var43 ? new int[var55] : null;
                            int[] var58 = new int[var55];
                            int[] var59 = new int[var55];
                            int[] var60 = new int[var55];
                            int[] var61 = new int[var55];
                            int[] var62 = new int[var55];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var28 != null) {
                                var63 = var28.field4209;
                                var64 = arg9.method2112() ? var28.field4203 : var28.field4208;
                                var65 = var28.field4216;
                                int var66 = class451.method2820((byte) 50, arg9, var28);
                                for (int var67 = 0; var67 < var48; var67++) {
                                    boolean var93 = false;
                                    byte var94;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = 1;
                                        class93.field1278[2] = var51[var53];
                                        class93.field1278[3] = 1;
                                        class93.field1278[4] = var49[var53];
                                        class93.field1278[5] = var51[var53];
                                        var94 = 6;
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = 5;
                                        class93.field1278[2] = var51[var53];
                                        class93.field1278[3] = 5;
                                        class93.field1278[4] = var49[var53];
                                        var94 = 6;
                                        class93.field1278[5] = var51[var53];
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = 3;
                                        class93.field1278[2] = var51[var53];
                                        class93.field1278[3] = 3;
                                        class93.field1278[4] = var49[var53];
                                        class93.field1278[5] = var51[var53];
                                        var94 = 6;
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = 7;
                                        class93.field1278[2] = var51[var53];
                                        class93.field1278[3] = 7;
                                        class93.field1278[4] = var49[var53];
                                        var94 = 6;
                                        class93.field1278[5] = var51[var53];
                                    } else {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = var49[var53];
                                        var94 = 3;
                                        class93.field1278[2] = var51[var53];
                                    }
                                    for (int var95 = 0; var95 < var94; var95++) {
                                        int var96 = class93.field1278[var95];
                                        int var97 = var96 - (var22 * 2) & 0x7;
                                        int var98 = class310.field4441[var96];
                                        int var99 = class40.field634[var96];
                                        if (var22 == 1) {
                                            var58[var54] = var99;
                                            var59[var54] = 128 - var98;
                                        } else if (var22 == 2) {
                                            var58[var54] = 128 - var98;
                                            var59[var54] = 128 - var99;
                                        } else if (var22 == 3) {
                                            var58[var54] = 128 - var99;
                                            var59[var54] = var98;
                                        } else {
                                            var58[var54] = var98;
                                            var59[var54] = var99;
                                        }
                                        if (arg12 && class97.field1328[var21][var96]) {
                                            int var100 = (var13 << 7) + var58[var54];
                                            int var101 = (var16 << 7) + var59[var54];
                                            var56[var54] = arg4.method797(var100, var101) - arg3.method797(var100, var101);
                                        }
                                        if (var96 < 8 && var28.field4221 < class23.field387[var97]) {
                                            if (var57 != null) {
                                                var57[var54] = class6.field63[var97];
                                            }
                                            var62[var54] = class74.field1002[var97];
                                            var61[var54] = class184.field2494[var97];
                                            var60[var54] = class219.field3109[var97];
                                        } else {
                                            if (var57 != null) {
                                                var57[var54] = var66;
                                            }
                                            var61[var54] = arg9.method2112() ? var28.field4203 : var28.field4208;
                                            var62[var54] = var28.field4216;
                                            var60[var54] = var63;
                                        }
                                        var54++;
                                    }
                                    var53++;
                                }
                                if (!arg12 && arg10 == 0) {
                                    class143.method957(var13, var16, var28.field4220, var28.field4213 * 8);
                                }
                                if (var21 != 12 && var28.field4209 != -1 && var28.field4217) {
                                    var18 = true;
                                }
                            } else if (var45) {
                                var53 += class323.field4625[var21];
                            } else if (var19) {
                                var53 += class340.field4993[var21];
                            } else {
                                var53 += class64.field910[var21];
                            }
                            if (var29 != null) {
                                if (var27 == 0) {
                                    var27 = var24;
                                }
                                if (var25 == 0) {
                                    var25 = var24;
                                }
                                if (var26 == 0) {
                                    var26 = var24;
                                }
                                class340 var68 = class135.method907(-124, var24 - 1);
                                class340 var69 = class135.method907(-128, var25 - 1);
                                class340 var70 = class135.method907(-120, var26 - 1);
                                class340 var71 = class135.method907(-126, var27 - 1);
                                for (int var72 = 0; var72 < var50; var72++) {
                                    boolean var73 = false;
                                    byte var74;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = 1;
                                        class93.field1278[2] = var51[var53];
                                        class93.field1278[3] = 1;
                                        class93.field1278[4] = var49[var53];
                                        class93.field1278[5] = var51[var53];
                                        var74 = 6;
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = 5;
                                        class93.field1278[2] = var51[var53];
                                        class93.field1278[3] = 5;
                                        class93.field1278[4] = var49[var53];
                                        class93.field1278[5] = var51[var53];
                                        var74 = 6;
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = 3;
                                        class93.field1278[2] = var51[var53];
                                        class93.field1278[3] = 3;
                                        class93.field1278[4] = var49[var53];
                                        var74 = 6;
                                        class93.field1278[5] = var51[var53];
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = 7;
                                        class93.field1278[2] = var51[var53];
                                        class93.field1278[3] = 7;
                                        class93.field1278[4] = var49[var53];
                                        class93.field1278[5] = var51[var53];
                                        var74 = 6;
                                    } else {
                                        class93.field1278[0] = var47[var53];
                                        class93.field1278[1] = var49[var53];
                                        var74 = 3;
                                        class93.field1278[2] = var51[var53];
                                    }
                                    for (int var75 = 0; var75 < var74; var75++) {
                                        int var76 = class93.field1278[var75];
                                        int var77 = var76 - (var22 * 2) & 0x7;
                                        int var78 = class310.field4441[var76];
                                        int var79 = class40.field634[var76];
                                        int var80;
                                        int var81;
                                        if (var22 == 1) {
                                            var81 = 128 - var78;
                                            var80 = var79;
                                        } else if (var22 == 2) {
                                            var80 = 128 - var78;
                                            var81 = 128 - var79;
                                        } else if (var22 == 3) {
                                            var80 = 128 - var79;
                                            var81 = var78;
                                        } else {
                                            var80 = var78;
                                            var81 = var79;
                                        }
                                        var58[var54] = var80;
                                        var59[var54] = var81;
                                        if (arg12 && class97.field1328[var21][var76]) {
                                            int var82 = (var13 << 7) + var80;
                                            int var83 = (var16 << 7) + var81;
                                            var56[var54] = arg4.method797(var82, var83) - arg3.method797(var82, var83);
                                        }
                                        if (var76 < 8 && class23.field387[var77] >= 0) {
                                            if (var57 != null) {
                                                var57[var54] = class6.field63[var77];
                                            }
                                            var62[var54] = class74.field1002[var77];
                                            var61[var54] = class184.field2494[var77];
                                            var60[var54] = class219.field3109[var77];
                                        } else {
                                            if (var19 && class97.field1328[var21][var76]) {
                                                var61[var54] = var64;
                                                var62[var54] = var65;
                                                var60[var54] = var63;
                                            } else if (var80 == 0 && var81 == 0) {
                                                var60[var54] = arg1[var13][var16];
                                                var61[var54] = var68.field4997;
                                                var62[var54] = var68.field5004;
                                            } else if (var80 == 0 && var81 == 128) {
                                                var60[var54] = arg1[var13][var17];
                                                var61[var54] = var69.field4997;
                                                var62[var54] = var69.field5004;
                                            } else if (var80 == 128 && var81 == 128) {
                                                var60[var54] = arg1[var15][var17];
                                                var61[var54] = var70.field4997;
                                                var62[var54] = var70.field5004;
                                            } else if (var80 == 128 && var81 == 0) {
                                                var60[var54] = arg1[var15][var16];
                                                var61[var54] = var71.field4997;
                                                var62[var54] = var71.field5004;
                                            } else {
                                                if (var80 >= 64) {
                                                    if (var81 >= 64) {
                                                        var61[var54] = var70.field4997;
                                                        var62[var54] = var70.field5004;
                                                    } else {
                                                        var61[var54] = var71.field4997;
                                                        var62[var54] = var71.field5004;
                                                    }
                                                } else if (var81 >= 64) {
                                                    var61[var54] = var69.field4997;
                                                    var62[var54] = var69.field5004;
                                                } else {
                                                    var61[var54] = var68.field4997;
                                                    var62[var54] = var68.field5004;
                                                }
                                                int var84 = class7.method55(true, arg1[var15][var16], var80 << 7 >> 7, arg1[var13][var16]);
                                                int var85 = class7.method55(true, arg1[var15][var17], var80 << 7 >> 7, arg1[var13][var17]);
                                                var60[var54] = class7.method55(true, var85, var81 << 7 >> 7, var84);
                                            }
                                            if (var57 != null) {
                                                var57[var54] = var60[var54];
                                            }
                                        }
                                        var54++;
                                    }
                                    var53++;
                                }
                                if (var21 != 0 && var29.field4992) {
                                    var18 = true;
                                }
                            }
                            int var86 = arg3.method781(var13, var16);
                            int var87 = arg3.method781(var15, var16);
                            int var88 = arg3.method781(var15, var17);
                            int var89 = arg3.method781(var13, var17);
                            if (arg10 > 0) {
                                boolean var90 = true;
                                if (var24 == 0 && var21 != 0) {
                                    var90 = false;
                                }
                                if (var23 > 0 && var30 != null && !var30.field4205) {
                                    var90 = false;
                                }
                                if (var90 && var86 == var87 && var86 == var88 && var86 == var89) {
                                    class451.field6578[arg10][var13][var16] = (byte) class128.method871(class451.field6578[arg10][var13][var16], 4);
                                }
                            }
                            int var91 = 0;
                            int var92 = 0;
                            if (arg12) {
                                var91 = class436.method2759(var13, var16);
                                var92 = class26.method238(var13, var16);
                            }
                            arg3.method779(var13, var16, var58, var56, var59, var60, var57, var61, var62, var91, var92, var18);
                            class433.method2749(arg10, var13, var16);
                        }
                    }
                }
            }
        }
        int var14 = 11 % ((13 - arg6) / 48);
        field3844++;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
    public static final void method1658(int arg0) {
        field3841++;
        class116.field1568 = new class259(class73.field994, "", class19.field314, 1001, 0L, 0, 0);
        if (arg0 != 1) {
            method1656(-93);
        }
    }
}
