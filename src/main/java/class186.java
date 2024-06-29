import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class186 extends class286 {

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    private int field3188 = -1;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Ltf;")
    public static class242 field3183 = new class242(100);

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field3195 = 0;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "Lbe;")
    public static class283 field3197 = class153.method941(127, " loggt sich aus)3");

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "Lbe;")
    private static class283 field3194 = class153.method941(29, "wave2:");

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "Lbe;")
    public static class283 field3198 = field3194;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "Lbe;")
    public static class283 field3196 = field3194;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "[I")
    public int[] field3185;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)Z", line = 4)
    public final boolean method1221(byte arg0) {
        field3187++;
        if (this.field3185 != null) {
            return true;
        }
        if (arg0 != -10) {
            this.field3186 = 41;
        }
        if (this.field3188 < 0) {
            return false;
        }
        class204 var2 = class109.method727(100, this.field3188, class237.field3964);
        var2.method1302();
        this.field3186 = var2.field1821;
        this.field3199 = var2.field1828;
        this.field3185 = var2.field3484;
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 29)
    public class186() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)I", line = 40)
    public final int method1222(int arg0) {
        field3189++;
        if (arg0 > -98) {
            field3183 = (class242) null;
        }
        return this.field3188;
    }

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)V", line = 54)
    public static void method1223(int arg0) {
        field3194 = null;
        field3197 = null;
        field3198 = null;
        if (arg0 != 17446) {
            field3183 = (class242) null;
        }
        field3183 = null;
        field3196 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[[I", line = 82)
    public int[][] method16(int arg0, byte arg1) {
        if (arg1 != -19) {
            this.method1221((byte) -107);
        }
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        field3191++;
        if (this.field4878.field2524 && this.method1221((byte) -10)) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int var7 = this.field3199 * (class13.field124 == this.field3186 ? arg0 : this.field3186 * arg0 / class13.field124);
            if (class27.field410 == this.field3199) {
                for (int var11 = 0; var11 < class27.field410; var11++) {
                    int var12 = this.field3185[var7++];
                    var4[var11] = class178.method1174(var12 << 4, 4080);
                    var6[var11] = class178.method1174(var12, 65280) >> 4;
                    var5[var11] = class178.method1174(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class27.field410; var8++) {
                    int var9 = this.field3199 * var8 / class27.field410;
                    int var10 = this.field3185[var7 + var9];
                    var4[var8] = class178.method1174(var10 << 4, 4080);
                    var6[var8] = class178.method1174(var10 >> 4, 4080);
                    var5[var8] = class178.method1174(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[[I[Llg;[[B[[FB[[F[[B[[F[[B[[BI)V", line = 147)
    public static final void method1224(int arg0, int[][] arg1, class115[] arg2, byte[][] arg3, float[][] arg4, byte arg5, float[][] arg6, byte[][] arg7, float[][] arg8, byte[][] arg9, byte[][] arg10, int arg11) {
        if (arg5 < 12) {
            field3195 = 63;
        }
        for (int var12 = 0; var12 < arg11; var12++) {
            class115 var13 = arg2[var12];
            if (var13.field1944 == arg0) {
                class189 var14 = new class189();
                int var15 = (var13.field1936 >> 7) - var13.field1929;
                int var16 = (var13.field1947 >> 7) - var13.field1929;
                int var17 = (var13.field1947 >> 7) + var13.field1929;
                int var18 = 0;
                if (var17 > 103) {
                    var17 = 103;
                }
                if (var16 < 0) {
                    var18 -= var16;
                    var16 = 0;
                }
                for (int var19 = var16; var19 <= var17; var19++) {
                    short var20 = var13.field1924[var18];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg7[var23][var19] & 0xFF;
                        int var25 = arg9[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var25 == 0) {
                            if (var24 == 0) {
                                continue;
                            }
                            class145 var27 = class174.method1135(var24 - 1, 46);
                            if (var27.field2405 == -1) {
                                continue;
                            }
                            if (arg3[var23][var19] != 0) {
                                int[] var28 = class255.field4304[arg3[var23][var19]];
                                var14.field3227 += ((var28.length >> 1) - 2) * 3;
                                var14.field3226 += var28.length >> 1;
                                continue;
                            }
                        } else if (var24 != 0) {
                            class145 var29 = class174.method1135(var24 - 1, 119);
                            if (var29.field2405 == -1) {
                                byte var30 = arg3[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class67.field942[var30];
                                    var14.field3227 += (var31.length >> 1) * 3 - 6;
                                    var14.field3226 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg3[var23][var19];
                            if (var32 != 0) {
                                var26 = true;
                            }
                        }
                        class26 var33 = class58.method373(arg0, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field379 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var35 = (int) (var33.field379 >> 20) & 0x3;
                                int[] var36 = null;
                                if ((var35 & 0x1) == 0) {
                                    boolean var37 = (var23 - 1) >= var21;
                                    if (!var37 && var17 >= var19 + 1) {
                                        short var38 = var13.field1924[var18 + 1];
                                        int var39 = (var38 >> 8) + var15;
                                        int var40 = (var38 & 0xFF) + var39;
                                        var37 = var23 > var39 && var23 < var40;
                                    }
                                    boolean var41 = var22 >= (var23 + 1);
                                    if (!var41 && var16 <= var19 - 1) {
                                        short var42 = var13.field1924[var18 - 1];
                                        int var43 = (var42 >> 8) + var15;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var41 = var43 < var23 && var44 > var23;
                                    }
                                    if (var37 && var41) {
                                        var36 = class255.field4304[0];
                                    } else if (var37) {
                                        var36 = class255.field4304[1];
                                    } else if (var41) {
                                        var36 = class255.field4304[1];
                                    }
                                } else {
                                    boolean var45 = var21 <= (var23 - 1);
                                    if (!var45 && var16 <= var19 - 1) {
                                        short var46 = var13.field1924[var18 - 1];
                                        int var47 = var15 + (var46 >> 8);
                                        int var48 = (var46 & 0xFF) + var47;
                                        var45 = var47 < var23 && var48 > var23;
                                    }
                                    boolean var49 = var22 >= (var23 + 1);
                                    if (!var49 && var17 >= var19 + 1) {
                                        short var50 = var13.field1924[var18 + 1];
                                        int var51 = var15 + (var50 >> 8);
                                        int var52 = var51 + (var50 & 0xFF);
                                        var49 = var51 < var23 && var52 > var23;
                                    }
                                    if (var45 && var49) {
                                        var36 = class255.field4304[0];
                                    } else if (var45) {
                                        var36 = class255.field4304[1];
                                    } else if (var49) {
                                        var36 = class255.field4304[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field3227 += (var36.length >> 1) * 3 - 6;
                                    var14.field3226 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var53 = class255.field4304[arg3[var23][var19]];
                            int[] var54 = class67.field942[arg3[var23][var19]];
                            var14.field3227 += (var53.length >> 1) * 3 - 6;
                            var14.field3227 += ((var54.length >> 1) - 2) * 3;
                            var14.field3226 += var53.length >> 1;
                            var14.field3226 += var54.length >> 1;
                        } else {
                            int[] var55 = class255.field4304[0];
                            var14.field3227 += ((var55.length >> 1) - 2) * 3;
                            var14.field3226 += var55.length >> 1;
                        }
                    }
                    var18++;
                }
                var14.method1231();
                int var56 = 0;
                if ((var13.field1947 >> 7) - var13.field1929 < 0) {
                    var56 -= (var13.field1947 >> 7) - var13.field1929;
                }
                for (int var57 = var16; var57 <= var17; var57++) {
                    short var58 = var13.field1924[var56];
                    int var59 = (var58 >> 8) + var15;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg10[var61][var57];
                        int var63 = arg9[var61][var57] & 0xFF;
                        int var64 = arg7[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class145 var68 = class174.method1135(var64 - 1, 30);
                            if (var68.field2405 == -1) {
                                continue;
                            }
                            if (arg3[var61][var57] != 0) {
                                class168.method1062(var13, 1165, arg4, arg6, class255.field4304[arg3[var61][var57]], var61, var57, var14, arg8, arg1, arg10[var61][var57]);
                                continue;
                            }
                        } else if (var64 == 0) {
                            var62 = 0;
                        } else {
                            class145 var66 = class174.method1135(var64 - 1, 125);
                            if (var66.field2405 == -1) {
                                class168.method1062(var13, 1165, arg4, arg6, class67.field942[arg3[var61][var57]], var61, var57, var14, arg8, arg1, arg10[var61][var57]);
                                continue;
                            }
                            byte var67 = arg3[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class26 var69 = class58.method373(arg0, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field379 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field379 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var81 = (var61 - 1) >= var59;
                                    boolean var82 = (var61 + 1) <= var60;
                                    if (!var81 && var57 + 1 <= var17) {
                                        short var83 = var13.field1924[var56 + 1];
                                        int var84 = (var83 >> 8) + var15;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var84 < var61 && var85 > var61;
                                    }
                                    if (!var82 && var16 <= (var57 - 1)) {
                                        short var86 = var13.field1924[var56 - 1];
                                        int var87 = var15 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var61 > var87 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var72 = class255.field4304[0];
                                    } else if (var81) {
                                        var72 = class255.field4304[1];
                                        var62 = 1;
                                    } else if (var82) {
                                        var72 = class255.field4304[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var73 = var59 <= var61 - 1;
                                    boolean var74 = (var61 + 1) <= var60;
                                    if (!var73 && var16 <= (var57 - 1)) {
                                        short var75 = var13.field1924[var56 - 1];
                                        int var76 = (var75 >> 8) + var15;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var61 > var76 && var61 < var77;
                                    }
                                    if (!var74 && var57 + 1 <= var17) {
                                        short var78 = var13.field1924[var56 + 1];
                                        int var79 = (var78 >> 8) + var15;
                                        int var80 = var79 + (var78 & 0xFF);
                                        var74 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var72 = class255.field4304[0];
                                    } else if (var73) {
                                        var62 = 0;
                                        var72 = class255.field4304[1];
                                    } else if (var74) {
                                        var72 = class255.field4304[1];
                                        var62 = 2;
                                    }
                                }
                                if (var72 != null) {
                                    class168.method1062(var13, 1165, arg4, arg6, var72, var61, var57, var14, arg8, arg1, var62);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class168.method1062(var13, 1165, arg4, arg6, class67.field942[arg3[var61][var57]], var61, var57, var14, arg8, arg1, arg10[var61][var57]);
                            class168.method1062(var13, 1165, arg4, arg6, class255.field4304[arg3[var61][var57]], var61, var57, var14, arg8, arg1, arg10[var61][var57]);
                        } else {
                            class168.method1062(var13, 1165, arg4, arg6, class255.field4304[0], var61, var57, var14, arg8, arg1, var62);
                        }
                    }
                    var56++;
                }
                if (var14.field3235 > 0 && var14.field3238 > 0) {
                    var14.method1232();
                    var13.field1943 = var14;
                }
            }
        }
        field3184++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lfe;ZI)V", line = 676)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field3193++;
            if (arg2 == 0) {
                this.field3188 = arg0.method1496(true);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V", line = 691)
    public final void method536(int arg0) {
        if (arg0 < -55) {
            super.method536(-97);
            this.field3185 = null;
            field3190++;
        }
    }
}
