import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 extends class74 {

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "I")
    private int field133 = -1;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "Ljava/lang/String;")
    public static String field124 = "rating: ";

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "[I")
    public int[] field128;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field131;
        if (arg0 != -79) {
            method88(31, 33, 2, (class188[]) null, 14, -124, 25, -32, -45, -24);
        }
        if (arg2 == 0) {
            this.field133 = arg1.method293(102);
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(Z)V")
    public static void method81(boolean arg0) {
        if (arg0) {
            field124 = null;
        }
        field124 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)[[I")
    public int[][] method82(int arg0, byte arg1) {
        int[][] var3 = super.field1248.method269(false, arg0);
        if (arg1 > -112) {
            field124 = null;
        }
        ++field118;
        if (super.field1248.field550 && this.method90(32)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class209.field3248 != this.field121 ? this.field121 * arg0 / class209.field3248 : arg0) * this.field123;
            if (~class178.field2662 != ~this.field123) {
                for (int var8 = 0; ~var8 > ~class178.field2662; ++var8) {
                    int var9 = this.field123 * var8 / class178.field2662;
                    int var10 = this.field128[var7 + var9];
                    var6[var8] = class3.method48(var10 << 4, 4080);
                    var5[var8] = class3.method48(var10, 65280) >> 4;
                    var4[var8] = class3.method48(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class178.field2662 > var11; ++var11) {
                    int var12 = this.field128[var7++];
                    var6[var11] = class3.method48(var12, 255) << 4;
                    var5[var11] = class3.method48(var12, 65280) >> 4;
                    var4[var11] = class3.method48(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZIIIIIIIIZLng;)V")
    public static final void method83(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class77 arg10) {
        ++field126;
        if (arg9 && !class223.method1487(-66) && (class191.field3041[0][arg7][arg4] & 2) == 0) {
            if (~(class191.field3041[arg5][arg7][arg4] & 16) != -1) {
                return;
            }
            if (class224.method1499(arg4, arg5, arg7, 12545) != class210.field3264) {
                return;
            }
        }
        if (class273.field4308 > arg5) {
            class273.field4308 = arg5;
        }
        if (arg8 > -73) {
            field119 = -93;
        }
        class73 var11 = class85.method690(2276, arg1);
        int var12;
        int var13;
        if (arg2 != 1 && ~arg2 != -4) {
            var12 = var11.field1232;
            var13 = var11.field1227;
        } else {
            var13 = var11.field1232;
            var12 = var11.field1227;
        }
        int var14;
        int var15;
        if (~(arg7 + var12) >= -105) {
            var14 = (var12 >> 1) + arg7;
            var15 = (var12 + 1 >> 1) + arg7;
        } else {
            var15 = arg7 + 1;
            var14 = arg7;
        }
        int var16;
        int var17;
        if (arg4 + var13 <= 104) {
            var16 = (var13 - -1 >> 1) + arg4;
            var17 = (var13 >> 1) + arg4;
        } else {
            var16 = arg4 + 1;
            var17 = arg4;
        }
        int[][] var18 = class68.field1079[arg3];
        int var19 = (arg7 << 7) + (var12 << 6);
        int var20 = var18[var14][var17] + var18[var15][var16] - -var18[var15][var17] + var18[var14][var16] >> 2;
        int[][] var21 = null;
        if (arg0) {
            var21 = class214.field3307[0];
        } else if (arg3 < 3) {
            var21 = class68.field1079[arg3 + 1];
        }
        int var22 = (arg4 << 7) - -(var13 << 6);
        long var23 = (long) (arg2 << 20 | arg7 | arg4 << 7 | arg6 << 14 | 1073741824);
        if (~var11.field1206 == -1 || arg0) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field1180 == 1) {
            var23 |= 4194304L;
        }
        if (var11.field1216) {
            var23 |= 2147483648L;
        }
        long var25 = var23 | (long) arg1 << 32;
        if (var11.method578(false)) {
            class184.method1237((class28) null, arg2, (class32) null, 128, var11, arg4, arg7, arg5);
        }
        int var27 = var11.field1207;
        boolean var28 = var11.field1221 & !arg0;
        if (~arg6 == -23) {
            if (class1.field16 || var11.field1206 != 0 || ~var11.field1208 == -2 || var11.field1166) {
                class205 var30;
                if (var27 == -1 && var11.field1189 == null && !var11.field1161) {
                    class249 var29 = var11.method569(arg9, var18, var21, 0, arg2, var20, var22, (class168) null, var28, var19, 22);
                    var30 = var29.field3836;
                } else {
                    var30 = new class296(arg1, 22, arg2, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class5.method68(arg5, arg7, arg4, var20, var30, var25, var11.field1174);
                if (~var11.field1208 == -2 && arg10 != null) {
                    arg10.method619(arg7, arg4, 262144);
                }
            }
        } else if (arg6 != 10 && ~arg6 != -12) {
            if (~arg6 <= -13) {
                class205 var32;
                if (~var27 == 0 && var11.field1189 == null && !var11.field1161) {
                    class249 var31 = var11.method569(arg9, var18, var21, 0, arg2, var20, var22, (class168) null, var28, var19, arg6);
                    var32 = var31.field3836;
                } else {
                    var32 = new class296(arg1, arg6, arg2, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class256.method1706(arg5, arg7, arg4, var20, 1, 1, var32, 0, var25);
                if (arg9 && arg6 >= 12 && ~arg6 >= -18 && ~arg6 != -14 && ~arg5 < -1 && ~var11.field1168 != -1) {
                    class245.field3799[arg5][arg7][arg4] = class115.method840(class245.field3799[arg5][arg7][arg4], 4);
                }
                if (var11.field1208 != 0 && arg10 != null) {
                    arg10.method615(var11.field1197, !var11.field1158, arg4, false, var13, arg7, var12);
                }
            } else if (~arg6 == -1) {
                class205 var34;
                if (var27 == -1 && var11.field1189 == null && !var11.field1161) {
                    class249 var33 = var11.method569(arg9, var18, var21, 0, arg2, var20, var22, (class168) null, var28, var19, 0);
                    var34 = var33.field3836;
                } else {
                    var34 = new class296(arg1, 0, arg2, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class239.method1612(arg5, arg7, arg4, var20, var34, (class205) null, class260.field3990[arg2], 0, var25);
                if (arg9) {
                    if (arg2 == 0) {
                        if (var11.field1162) {
                            class113.field1782[arg5][arg7][arg4] = 50;
                            class113.field1782[arg5][arg7][arg4 + 1] = 50;
                        }
                        if (~var11.field1168 == -2) {
                            class245.field3799[arg5][arg7][arg4] = class115.method840(class245.field3799[arg5][arg7][arg4], 1);
                        }
                    } else if (~arg2 != -2) {
                        if (~arg2 == -3) {
                            if (var11.field1162) {
                                class113.field1782[arg5][arg7 - -1][arg4] = 50;
                                class113.field1782[arg5][arg7 + 1][arg4 + 1] = 50;
                            }
                            if (~var11.field1168 == -2) {
                                class245.field3799[arg5][arg7 + 1][arg4] = class115.method840(class245.field3799[arg5][arg7 + 1][arg4], 1);
                            }
                        } else if (arg2 == 3) {
                            if (var11.field1162) {
                                class113.field1782[arg5][arg7][arg4] = 50;
                                class113.field1782[arg5][arg7 + 1][arg4] = 50;
                            }
                            if (var11.field1168 == 1) {
                                class245.field3799[arg5][arg7][arg4] = class115.method840(class245.field3799[arg5][arg7][arg4], 2);
                            }
                        }
                    } else {
                        if (var11.field1162) {
                            class113.field1782[arg5][arg7][arg4 - -1] = 50;
                            class113.field1782[arg5][arg7 + 1][arg4 - -1] = 50;
                        }
                        if (~var11.field1168 == -2) {
                            class245.field3799[arg5][arg7][arg4 - -1] = class115.method840(class245.field3799[arg5][arg7][arg4 - -1], 2);
                        }
                    }
                }
                if (~var11.field1208 != -1 && arg10 != null) {
                    arg10.method613(var11.field1197, arg4, arg6, !var11.field1158, arg7, arg2, -91);
                }
                if (var11.field1173 != 16) {
                    class121.method867(arg5, arg7, arg4, var11.field1173);
                }
            } else if (~arg6 == -2) {
                class205 var36;
                if (var27 == -1 && var11.field1189 == null && !var11.field1161) {
                    class249 var35 = var11.method569(arg9, var18, var21, 0, arg2, var20, var22, (class168) null, var28, var19, 1);
                    var36 = var35.field3836;
                } else {
                    var36 = new class296(arg1, 1, arg2, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class239.method1612(arg5, arg7, arg4, var20, var36, (class205) null, class260.field3995[arg2], 0, var25);
                if (var11.field1162 && arg9) {
                    if (~arg2 == -1) {
                        class113.field1782[arg5][arg7][arg4 + 1] = 50;
                    } else if (arg2 == 1) {
                        class113.field1782[arg5][arg7 + 1][arg4 + 1] = 50;
                    } else if (~arg2 != -3) {
                        if (~arg2 == -4) {
                            class113.field1782[arg5][arg7][arg4] = 50;
                        }
                    } else {
                        class113.field1782[arg5][arg7 - -1][arg4] = 50;
                    }
                }
                if (var11.field1208 != 0 && arg10 != null) {
                    arg10.method613(var11.field1197, arg4, arg6, !var11.field1158, arg7, arg2, -91);
                }
            } else if (~arg6 == -3) {
                int var37 = 3 & arg2 + 1;
                class205 var39;
                class205 var41;
                if (~var27 == 0 && var11.field1189 == null && !var11.field1161) {
                    class249 var38 = var11.method569(arg9, var18, var21, 0, arg2 + 4, var20, var22, (class168) null, var28, var19, 2);
                    var39 = var38.field3836;
                    class249 var40 = var11.method569(arg9, var18, var21, 0, var37, var20, var22, (class168) null, var28, var19, 2);
                    var41 = var40.field3836;
                } else {
                    var39 = new class296(arg1, 2, arg2 + 4, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                    var41 = new class296(arg1, 2, var37, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class239.method1612(arg5, arg7, arg4, var20, var39, var41, class260.field3990[arg2], class260.field3990[var37], var25);
                if (~var11.field1168 == -2 && arg9) {
                    if (arg2 == 0) {
                        class245.field3799[arg5][arg7][arg4] = class115.method840(class245.field3799[arg5][arg7][arg4], 1);
                        class245.field3799[arg5][arg7][arg4 - -1] = class115.method840(class245.field3799[arg5][arg7][arg4 - -1], 2);
                    } else if (~arg2 != -2) {
                        if (~arg2 != -3) {
                            if (~arg2 == -4) {
                                class245.field3799[arg5][arg7][arg4] = class115.method840(class245.field3799[arg5][arg7][arg4], 2);
                                class245.field3799[arg5][arg7][arg4] = class115.method840(class245.field3799[arg5][arg7][arg4], 1);
                            }
                        } else {
                            class245.field3799[arg5][arg7 + 1][arg4] = class115.method840(class245.field3799[arg5][arg7 + 1][arg4], 1);
                            class245.field3799[arg5][arg7][arg4] = class115.method840(class245.field3799[arg5][arg7][arg4], 2);
                        }
                    } else {
                        class245.field3799[arg5][arg7][arg4 + 1] = class115.method840(class245.field3799[arg5][arg7][arg4 + 1], 2);
                        class245.field3799[arg5][arg7 + 1][arg4] = class115.method840(class245.field3799[arg5][arg7 + 1][arg4], 1);
                    }
                }
                if (var11.field1208 != 0 && arg10 != null) {
                    arg10.method613(var11.field1197, arg4, arg6, !var11.field1158, arg7, arg2, -91);
                }
                if (var11.field1173 != 16) {
                    class121.method867(arg5, arg7, arg4, var11.field1173);
                }
            } else if (~arg6 == -4) {
                class205 var43;
                if (var27 == -1 && var11.field1189 == null && !var11.field1161) {
                    class249 var42 = var11.method569(arg9, var18, var21, 0, arg2, var20, var22, (class168) null, var28, var19, 3);
                    var43 = var42.field3836;
                } else {
                    var43 = new class296(arg1, 3, arg2, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class239.method1612(arg5, arg7, arg4, var20, var43, (class205) null, class260.field3995[arg2], 0, var25);
                if (var11.field1162 && arg9) {
                    if (arg2 != 0) {
                        if (arg2 != 1) {
                            if (~arg2 != -3) {
                                if (arg2 == 3) {
                                    class113.field1782[arg5][arg7][arg4] = 50;
                                }
                            } else {
                                class113.field1782[arg5][arg7 + 1][arg4] = 50;
                            }
                        } else {
                            class113.field1782[arg5][arg7 + 1][arg4 + 1] = 50;
                        }
                    } else {
                        class113.field1782[arg5][arg7][arg4 - -1] = 50;
                    }
                }
                if (~var11.field1208 != -1 && arg10 != null) {
                    arg10.method613(var11.field1197, arg4, arg6, !var11.field1158, arg7, arg2, -91);
                }
            } else if (arg6 == 9) {
                class205 var45;
                if (var27 == -1 && var11.field1189 == null && !var11.field1161) {
                    class249 var44 = var11.method569(arg9, var18, var21, 0, arg2, var20, var22, (class168) null, var28, var19, arg6);
                    var45 = var44.field3836;
                } else {
                    var45 = new class296(arg1, arg6, arg2, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class256.method1706(arg5, arg7, arg4, var20, 1, 1, var45, 0, var25);
                if (~var11.field1208 != -1 && arg10 != null) {
                    arg10.method615(var11.field1197, !var11.field1158, arg4, false, var13, arg7, var12);
                }
                if (~var11.field1173 != -17) {
                    class121.method867(arg5, arg7, arg4, var11.field1173);
                }
            } else if (~arg6 == -5) {
                class205 var47;
                if (~var27 == 0 && var11.field1189 == null && !var11.field1161) {
                    class249 var46 = var11.method569(arg9, var18, var21, 0, arg2, var20, var22, (class168) null, var28, var19, 4);
                    var47 = var46.field3836;
                } else {
                    var47 = new class296(arg1, 4, arg2, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class57.method459(arg5, arg7, arg4, var20, var47, (class205) null, class260.field3990[arg2], 0, 0, 0, var25);
            } else if (~arg6 == -6) {
                int var48 = 16;
                long var49 = class280.method1875(arg5, arg7, arg4);
                if (var49 != 0L) {
                    var48 = class85.method690(2276, (int) (var49 >>> 32) & Integer.MAX_VALUE).field1173;
                }
                class205 var52;
                if (var27 == -1 && var11.field1189 == null && !var11.field1161) {
                    class249 var51 = var11.method569(arg9, var18, var21, 0, arg2, var20, var22, (class168) null, var28, var19, 4);
                    var52 = var51.field3836;
                } else {
                    var52 = new class296(arg1, 4, arg2, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class57.method459(arg5, arg7, arg4, var20, var52, (class205) null, class260.field3990[arg2], 0, class139.field2144[arg2] * var48, class55.field849[arg2] * var48, var25);
            } else if (arg6 == 6) {
                int var53 = 8;
                long var54 = class280.method1875(arg5, arg7, arg4);
                if (var54 != 0L) {
                    var53 = class85.method690(2276, (int) (var54 >>> 32) & Integer.MAX_VALUE).field1173 / 2;
                }
                class205 var57;
                if (~var27 == 0 && var11.field1189 == null && !var11.field1161) {
                    class249 var56 = var11.method569(arg9, var18, var21, 0, arg2 + 4, var20, var22, (class168) null, var28, var19, 4);
                    var57 = var56.field3836;
                } else {
                    var57 = new class296(arg1, 4, arg2 - -4, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class57.method459(arg5, arg7, arg4, var20, var57, (class205) null, 256, arg2, class33.field527[arg2] * var53, class204.field3177[arg2] * var53, var25);
            } else if (~arg6 == -8) {
                int var58 = arg2 - -2 & 3;
                class205 var60;
                if (~var27 == 0 && var11.field1189 == null && !var11.field1161) {
                    class249 var59 = var11.method569(arg9, var18, var21, 0, var58 + 4, var20, var22, (class168) null, var28, var19, 4);
                    var60 = var59.field3836;
                } else {
                    var60 = new class296(arg1, 4, var58 + 4, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class57.method459(arg5, arg7, arg4, var20, var60, (class205) null, 256, var58, 0, 0, var25);
            } else if (arg6 == 8) {
                int var61 = 8;
                long var62 = class280.method1875(arg5, arg7, arg4);
                if (~var62 != -1L) {
                    var61 = class85.method690(2276, Integer.MAX_VALUE & (int) (var62 >>> 32)).field1173 / 2;
                }
                int var64 = 3 & arg2 - -2;
                class205 var66;
                class205 var68;
                if (~var27 == 0 && var11.field1189 == null && !var11.field1161) {
                    class249 var65 = var11.method569(arg9, var18, var21, 0, arg2 + 4, var20, var22, (class168) null, var28, var19, 4);
                    var66 = var65.field3836;
                    class249 var67 = var11.method569(arg9, var18, var21, 0, var64 + 4, var20, var22, (class168) null, var28, var19, 4);
                    var68 = var67.field3836;
                } else {
                    var66 = new class296(arg1, 4, arg2 + 4, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                    var68 = new class296(arg1, 4, var64 + 4, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
                }
                class57.method459(arg5, arg7, arg4, var20, var66, var68, 256, arg2, class33.field527[arg2] * var61, class204.field3177[arg2] * var61, var25);
            }
        } else {
            class205 var70;
            if (var27 == -1 && var11.field1189 == null && !var11.field1161) {
                class249 var69 = var11.method569(arg9, var18, var21, 0, ~arg6 != -12 ? arg2 : arg2 + 4, var20, var22, (class168) null, var28, var19, 10);
                var70 = var69.field3836;
            } else {
                var70 = new class296(arg1, 10, arg6 != 11 ? arg2 : arg2 + 4, arg3, arg7, arg4, var27, var11.field1228, (class205) null);
            }
            if (var70 != null) {
                boolean var71 = class256.method1706(arg5, arg7, arg4, var20, var12, var13, var70, 0, var25);
                if (var11.field1162 && var71 && arg9) {
                    int var72 = 15;
                    if (var70 instanceof class233) {
                        var72 = ((class233) var70).method1542() / 4;
                        if (~var72 < -31) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; ~var12 <= ~var73; ++var73) {
                        for (int var74 = 0; var74 <= var13; ++var74) {
                            if (class113.field1782[arg5][arg7 - -var73][arg4 + var74] < var72) {
                                class113.field1782[arg5][arg7 + var73][arg4 - -var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (~var11.field1208 != -1 && arg10 != null) {
                arg10.method615(var11.field1197, !var11.field1158, arg4, false, var13, arg7, var12);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V")
    public static final void method84(int arg0, int arg1) {
        if (arg1 != 0) {
            method86((byte[]) null, false);
        }
        ++field120;
        class70.field1120.method1778(arg0, arg1 ^ -98);
        class39.field649.method1778(arg0, -96);
        class203.field3169.method1778(arg0, -108);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILna;)I")
    public static final int method85(int arg0, class32 arg1) {
        ++field127;
        class217 var2 = arg1.field518;
        if (arg0 != -1) {
            method84(-75, 106);
        }
        if (var2.field3405 != null) {
            var2 = var2.method1446(-118);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3381;
        class8 var4 = arg1.method1801((byte) 123);
        if (arg1.field4148 != var4.field142) {
            if (~arg1.field4148 != ~var4.field167 && arg1.field4148 != var4.field144 && arg1.field4148 != var4.field155 && ~arg1.field4148 != ~var4.field164) {
                if (~arg1.field4148 == ~var4.field148 || arg1.field4148 == var4.field159 || arg1.field4148 == var4.field166 || ~arg1.field4148 == ~var4.field153) {
                    var3 = var2.field3386;
                }
            } else {
                var3 = var2.field3373;
            }
        } else {
            var3 = var2.field3344;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BZ)Z")
    public static final boolean method86(byte[] arg0, boolean arg1) {
        ++field129;
        class37 var2 = new class37(arg0);
        int var3 = var2.method333((byte) -59);
        if (var3 != 1) {
            return false;
        } else {
            boolean var4 = var2.method333((byte) -59) == 1;
            if (var4) {
                class69.method540(var2, (byte) 112);
            }
            if (!arg1) {
                method84(3, 43);
            }
            class293.method1969(-100, var2);
            return true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)I")
    public final int method87(int arg0) {
        ++field117;
        if (arg0 != 128) {
            method88(83, 68, -37, (class188[]) null, 77, 39, -55, -31, -57, 23);
        }
        return this.field133;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[Lag;IIIIII)V")
    public static final void method88(int arg0, int arg1, int arg2, class188[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class201.method1351(arg0, arg6, arg1, arg7);
        class97.method765();
        ++field132;
        for (int var10 = arg2; arg3.length > var10; ++var10) {
            class188 var11 = arg3[var10];
            if (var11 != null && (~var11.field2870 == ~arg5 || arg5 == -1412584499 && class292.field4606 == var11)) {
                int var12;
                if (~arg9 == 0) {
                    class228.field3568[class145.field2254] = var11.field3003 - -arg4;
                    class148.field2291[class145.field2254] = var11.field2961 + arg8;
                    class249.field3841[class145.field2254] = var11.field2922;
                    class237.field3675[class145.field2254] = var11.field2928;
                    var12 = class145.field2254++;
                } else {
                    var12 = arg9;
                }
                var11.field2839 = var12;
                var11.field2960 = class267.field4256;
                if (!var11.field2852 || !client.method1062(var11)) {
                    if (var11.field2950 > 0) {
                        class237.method1592((byte) -17, var11);
                    }
                    int var13 = var11.field3003 + arg4;
                    int var14 = var11.field2961 + arg8;
                    int var15 = var11.field2894;
                    if (class102.field1626 && (~client.method1063(var11).field3429 != -1 || var11.field2937 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class292.field4606 == var11) {
                        if (arg5 != -1412584499 && !var11.field2981) {
                            class294.field4621 = arg4;
                            class172.field2555 = arg3;
                            class6.field115 = arg8;
                            continue;
                        }
                        if (class34.field548 && class224.field3521) {
                            int var16 = class188.field3012;
                            int var17 = var16 - class184.field2781;
                            int var18 = class108.field1719;
                            int var19 = var18 - class210.field3255;
                            if (class8.field179 > var17) {
                                var17 = class8.field179;
                            }
                            if (class21.field319 > var19) {
                                var19 = class21.field319;
                            }
                            if (~(var17 - -var11.field2922) < ~(class8.field179 - -class53.field822.field2922)) {
                                var17 = class8.field179 + class53.field822.field2922 + -var11.field2922;
                            }
                            if (~(var11.field2928 + var19) < ~(class21.field319 + class53.field822.field2928)) {
                                var19 = class21.field319 + class53.field822.field2928 + -var11.field2928;
                            }
                            var14 = var19;
                            var13 = var17;
                        }
                        if (!var11.field2981) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (~var11.field2937 != -3) {
                        var20 = arg0 < var13 ? var13 : arg0;
                        var21 = var14 > arg6 ? var14 : arg6;
                        int var22 = var11.field2922 + var13;
                        int var23 = var14 - -var11.field2928;
                        if (var11.field2937 == 9) {
                            ++var22;
                            ++var23;
                        }
                        var24 = ~var23 > ~arg7 ? var23 : arg7;
                        var25 = arg1 > var22 ? var22 : arg1;
                    } else {
                        var24 = arg7;
                        var25 = arg1;
                        var21 = arg6;
                        var20 = arg0;
                    }
                    if (!var11.field2852 || var25 > var20 && var24 > var21) {
                        if (~var11.field2950 != -1) {
                            if (~var11.field2950 == -1338 || var11.field2950 == 1403) {
                                class123.field1929 = var14;
                                class79.field1320 = var11;
                                class45.field722 = var13;
                                class126.method896(var11.field2928, 4091, var11.field2950 == 1403, var11.field2922, var14, var13);
                                class37.field632[var12] = true;
                                class201.method1351(arg0, arg6, arg1, arg7);
                                continue;
                            }
                            if (var11.field2950 == 1338) {
                                if (!var11.method1277(117)) {
                                    continue;
                                }
                                class139.method964(var14, var13, (byte) -107, var12, var11);
                                class201.method1351(arg0, arg6, arg1, arg7);
                                if (~class119.field1837 != -1 && class119.field1837 != 3 || class64.field1025 || ~class155.field2362 > ~var20 || var21 > class287.field4525 || class155.field2362 >= var25 || var24 <= class287.field4525) {
                                    continue;
                                }
                                int var26 = -var13 + class155.field2362;
                                int var27 = class287.field4525 - var14;
                                int var28 = var11.field2850[var27];
                                if (~var26 > ~var28 || var11.field2858[var27] + var28 < var26) {
                                    continue;
                                }
                                int var29 = var26 - var11.field2922 / 2;
                                int var30 = 2047 & (int) class276.field4334 - -class133.field2060;
                                int var31 = class97.field1556[var30];
                                int var32 = class97.field1557[var30];
                                int var33 = (class296.field4674 + 256) * var31 >> 8;
                                int var34 = var27 - var11.field2928 / 2;
                                int var35 = (class296.field4674 + 256) * var32 >> 8;
                                int var36 = var33 * var34 + -(var29 * var35) >> 11;
                                int var37 = var34 * var35 - -(var29 * var33) >> 11;
                                int var38 = class261.field4058.field4176 + var37 + -(64 * (class261.field4058.method226((byte) -97) - 1)) >> 7;
                                int var39 = class261.field4058.field4123 - (var36 + 64 * (class261.field4058.method226((byte) -97) - 1)) >> 7;
                                if (class179.field2678 && (class71.field1135 & 64) != 0) {
                                    class188 var40 = class32.method261(class10.field197, class217.field3369, arg2 + 90);
                                    if (var40 != null) {
                                        class155.method1045(" ->", (short) 15, class78.field1316, var38, class87.field1421, 1L, (byte) 78, var39);
                                    } else {
                                        class270.method1824(64512);
                                    }
                                    continue;
                                }
                                if (~class154.field2352 == -2) {
                                    class155.method1045("", (short) 9, class218.field3417, var38, -1, 1L, (byte) 78, var39);
                                }
                                class155.method1045("", (short) 44, class203.field3171, var38, -1, 1L, (byte) 78, var39);
                                continue;
                            }
                            if (~var11.field2950 == -1340) {
                                if (var11.method1277(108)) {
                                    class71.method556(var14, var11, var12, -4, var13);
                                    class201.method1351(arg0, arg6, arg1, arg7);
                                }
                                continue;
                            }
                            if (var11.field2950 == 1400) {
                                class177.method1186(var13, var14, var11.field2922, (byte) 34, var11.field2928);
                                class37.field632[var12] = true;
                                class222.field3476[var12] = true;
                                class201.method1351(arg0, arg6, arg1, arg7);
                                continue;
                            }
                            if (~var11.field2950 == -1402) {
                                class272.method1837((byte) 64, var11.field2928, var14, var11.field2922, var13);
                                class37.field632[var12] = true;
                                class222.field3476[var12] = true;
                                class201.method1351(arg0, arg6, arg1, arg7);
                                continue;
                            }
                            if (~var11.field2950 == -1403) {
                                class188.method1261(arg2 + 27718, var14, var13);
                                class37.field632[var12] = true;
                                class222.field3476[var12] = true;
                                continue;
                            }
                            if (~var11.field2950 == -1406) {
                                if (!class186.field2799) {
                                    continue;
                                }
                                int var41 = var11.field2922 + var13;
                                int var42 = var14 + 15;
                                class124.field1953.method9("Fps:" + class175.field2607, var41, var42, 16776960, -1);
                                int var131 = var42 + 15;
                                int var43 = 16776960;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = 0;
                                int var46 = (int) ((var44.totalMemory() + -var44.freeMemory()) / 1024L);
                                if (var46 > 65536) {
                                    var43 = 16711680;
                                }
                                int var47 = 0;
                                class124.field1953.method9("Mem:" + var46 + "k", var41, var131, var43, -1);
                                int var48 = 0;
                                int var49 = 16776960;
                                for (int var50 = 0; var50 < 29; ++var50) {
                                    var45 += class295.field4627[var50].method984(false);
                                    var47 += class295.field4627[var50].method985(2);
                                    var48 += class295.field4627[var50].method989((byte) 2);
                                }
                                var42 = var131 + 15;
                                int var51 = var48 * 100 / var45;
                                int var52 = var47 * 10000 / var45;
                                String var53 = "Cache:" + class176.method1178(0, 2, true, true, (long) var52) + "% (" + var51 + "%)";
                                class143.field2189.method9(var53, var41, var42, var49, -1);
                                class37.field632[var12] = true;
                                class222.field3476[var12] = true;
                                var42 += 12;
                                continue;
                            }
                            if (~var11.field2950 == -1407) {
                                class73.field1157 = var11;
                                class13.field227 = var13;
                                class62.field998 = var14;
                                continue;
                            }
                        }
                        if (!class64.field1025) {
                            if (~var11.field2937 == -1 && var11.field2910 && class155.field2362 >= var20 && class287.field4525 >= var21 && ~var25 < ~class155.field2362 && ~class287.field4525 > ~var24 && !class102.field1626) {
                                class220.field3450 = 1;
                                class80.field1341[0] = 1002;
                                class231.field3597[0] = class180.field2691;
                                class42.field686[0] = class119.field1835;
                                class63.field1008[0] = "";
                            }
                            if (var20 <= class155.field2362 && var21 <= class287.field4525 && var25 > class155.field2362 && ~class287.field4525 > ~var24) {
                                class88.method703(var11, -1, class155.field2362 - var13, -var14 + class287.field4525);
                            }
                        }
                        if (var11.field2937 == 0) {
                            if (!var11.field2852 && client.method1062(var11) && class260.field3988 != var11) {
                                continue;
                            }
                            if (!var11.field2852) {
                                if (~(-var11.field2928 + var11.field2900) > ~var11.field2887) {
                                    var11.field2887 = -var11.field2928 + var11.field2900;
                                }
                                if (var11.field2887 < 0) {
                                    var11.field2887 = 0;
                                }
                            }
                            method88(var20, var25, 0, arg3, -var11.field3008 + var13, var11.field2977, var21, var24, -var11.field2887 + var14, var12);
                            if (var11.field2968 != null) {
                                method88(var20, var25, 0, var11.field2968, -var11.field3008 + var13, var11.field2977, var21, var24, -var11.field2887 + var14, var12);
                            }
                            class120 var54 = (class120) class13.field230.method1414(true, (long) var11.field2977);
                            if (var54 != null) {
                                if (~var54.field1853 == -1 && !class64.field1025 && ~var20 >= ~class155.field2362 && var21 <= class287.field4525 && ~class155.field2362 > ~var25 && ~class287.field4525 > ~var24 && !class102.field1626) {
                                    class231.field3597[0] = class180.field2691;
                                    class63.field1008[0] = "";
                                    class80.field1341[0] = 1002;
                                    class42.field686[0] = class119.field1835;
                                    class220.field3450 = 1;
                                }
                                class31.method251(var20, 100, var25, var54.field1852, var12, var14, var21, var13, var24);
                            }
                            class201.method1351(arg0, arg6, arg1, arg7);
                            class97.method765();
                        }
                        if (class9.field185[var12] || class181.field2699 > 1) {
                            if (var11.field2937 == 0 && !var11.field2852 && var11.field2900 > var11.field2928) {
                                class109.method816(var11.field2928, var11.field2900, var11.field2922 + var13, var11.field2887, (byte) 97, var14);
                            }
                            if (var11.field2937 != 1) {
                                if (~var11.field2937 == -3) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field2893; ++var56) {
                                        for (int var57 = 0; var57 < var11.field2924; ++var57) {
                                            int var58 = (var11.field2955 + 32) * var57 + var13;
                                            int var59 = (var11.field2909 + 32) * var56 + var14;
                                            if (~var55 > -21) {
                                                var59 += var11.field2904[var55];
                                                var58 += var11.field2920[var55];
                                            }
                                            if (~var11.field2944[var55] >= -1) {
                                                if (var11.field2886 != null && var55 < 20) {
                                                    class3 var71 = var11.method1266(var55, 32056);
                                                    if (var71 != null) {
                                                        var71.method45(var58, var59);
                                                    } else if (class3.field49) {
                                                        class246.method1663(arg2 ^ 255, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var60 = false;
                                                boolean var61 = false;
                                                int var62 = var11.field2944[var55] + -1;
                                                if (~(var58 + 32) < ~arg0 && var58 < arg1 && ~arg6 > ~(var59 + 32) && ~arg7 < ~var59 || class28.field438 == var11 && ~class272.field4290 == ~var55) {
                                                    class3 var63;
                                                    if (class90.field1458 == 1 && class291.field4583 == var55 && class149.field2308 == var11.field2977) {
                                                        var63 = class256.method1703(var11.field2991, var11.field2897[var55], var62, 2, arg2 ^ -30235, (class242) null, 0);
                                                    } else {
                                                        var63 = class256.method1703(var11.field2991, var11.field2897[var55], var62, 1, -30235, (class242) null, 3153952);
                                                    }
                                                    if (class97.field1562) {
                                                        class37.field632[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class246.method1663(255, var11);
                                                    } else if (class28.field438 == var11 && class272.field4290 == var55) {
                                                        int var64 = -class227.field3559 + class188.field3012;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        int var65 = -class171.field2546 + class108.field1719;
                                                        if (~var65 > -6 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class68.field1087 < 5) {
                                                            var64 = 0;
                                                            var65 = 0;
                                                        }
                                                        var63.method40(var58 + var64, var59 + var65, 128);
                                                        if (arg5 != -1) {
                                                            class188 var66 = arg3[65535 & arg5];
                                                            int var67 = class201.field3149;
                                                            int var68 = class201.field3143;
                                                            if (~var67 < ~(var59 + var65) && ~var66.field2887 < -1) {
                                                                int var69 = (-var59 + -var65 + var67) * class127.field1996 / 3;
                                                                if (var69 > class127.field1996 * 10) {
                                                                    var69 = class127.field1996 * 10;
                                                                }
                                                                if (var69 > var66.field2887) {
                                                                    var69 = var66.field2887;
                                                                }
                                                                var66.field2887 -= var69;
                                                                class171.field2546 += var69;
                                                                class246.method1663(255, var66);
                                                            }
                                                            if (~var68 > ~(var65 + 32 + var59) && -var66.field2928 + var66.field2900 > var66.field2887) {
                                                                int var70 = (var59 - -var65 + -var68 + 32) * class127.field1996 / 3;
                                                                if (var70 > class127.field1996 * 10) {
                                                                    var70 = class127.field1996 * 10;
                                                                }
                                                                if (var66.field2900 - var66.field2928 + -var66.field2887 < var70) {
                                                                    var70 = -var66.field2887 + var66.field2900 - var66.field2928;
                                                                }
                                                                class171.field2546 -= var70;
                                                                var66.field2887 += var70;
                                                                class246.method1663(255, var66);
                                                            }
                                                        }
                                                    } else if (class238.field3682 == var11 && ~class61.field985 == ~var55) {
                                                        var63.method40(var58, var59, 128);
                                                    } else {
                                                        var63.method45(var58, var59);
                                                    }
                                                }
                                            }
                                            ++var55;
                                        }
                                    }
                                } else if (var11.field2937 == 3) {
                                    int var72;
                                    if (!class254.method1693(var11, (byte) 59)) {
                                        var72 = var11.field2934;
                                        if (class260.field3988 == var11 && ~var11.field2946 != -1) {
                                            var72 = var11.field2946;
                                        }
                                    } else {
                                        var72 = var11.field2876;
                                        if (class260.field3988 == var11 && var11.field2907 != 0) {
                                            var72 = var11.field2907;
                                        }
                                    }
                                    if (var15 != 0) {
                                        if (var11.field2843) {
                                            class201.method1352(var13, var14, var11.field2922, var11.field2928, var72, -(var15 & 255) + 256);
                                        } else {
                                            class201.method1335(var13, var14, var11.field2922, var11.field2928, var72, -(var15 & 255) + 256);
                                        }
                                    } else if (!var11.field2843) {
                                        class201.method1340(var13, var14, var11.field2922, var11.field2928, var72);
                                    } else {
                                        class201.method1333(var13, var14, var11.field2922, var11.field2928, var72);
                                    }
                                } else if (var11.field2937 == 4) {
                                    class2 var73 = var11.method1272((byte) -112, class111.field1746);
                                    if (var73 == null) {
                                        if (class3.field49) {
                                            class246.method1663(255, var11);
                                        }
                                    } else {
                                        String var74 = var11.field2831;
                                        int var75;
                                        if (class254.method1693(var11, (byte) 59)) {
                                            var75 = var11.field2876;
                                            if (class260.field3988 == var11 && ~var11.field2907 != -1) {
                                                var75 = var11.field2907;
                                            }
                                            if (~var11.field2903.length() < -1) {
                                                var74 = var11.field2903;
                                            }
                                        } else {
                                            var75 = var11.field2934;
                                            if (class260.field3988 == var11 && ~var11.field2946 != -1) {
                                                var75 = var11.field2946;
                                            }
                                        }
                                        if (var11.field2852 && var11.field2835 != -1) {
                                            class123 var76 = class32.method260(var11.field2835, true);
                                            var74 = var76.field1885;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((~var76.field1906 == -2 || var11.field2995 != 1) && ~var11.field2995 != 0) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + client.method1053(arg2 + -16950, var11.field2995);
                                            }
                                        }
                                        if (class174.field2577 == var11) {
                                            var74 = class160.field2445;
                                            var75 = var11.field2934;
                                        }
                                        if (!var11.field2852) {
                                            var74 = class287.method1931(var11, var74, (byte) 19);
                                        }
                                        var73.method28(var74, var13, var14, var11.field2922, var11.field2928, var75, !var11.field2984 ? -1 : 0, var11.field2914, var11.field2844, var11.field2825);
                                    }
                                } else if (~var11.field2937 == -6) {
                                    if (var11.field2852) {
                                        if (~var11.field2999 <= -1) {
                                            class96 var85 = var11.method1275((byte) 120);
                                            var85.method745(0, var13, var14, var11.field2922, var11.field2928, var11.field2830, var11.field2986, 0);
                                        } else {
                                            class3 var77;
                                            if (var11.field2835 != -1) {
                                                if (var11.field2877 && class261.field4058.field440 != null) {
                                                    var77 = class256.method1703(var11.field2991, var11.field2995, var11.field2835, var11.field2891, arg2 + -30235, class261.field4058.field440, var11.field2879);
                                                } else {
                                                    var77 = class256.method1703(var11.field2991, var11.field2995, var11.field2835, var11.field2891, arg2 ^ -30235, (class242) null, var11.field2879);
                                                }
                                            } else {
                                                var77 = var11.method1274(false, 0);
                                            }
                                            if (var77 == null) {
                                                if (class3.field49) {
                                                    class246.method1663(255, var11);
                                                }
                                            } else {
                                                int var78 = var77.field46;
                                                int var79 = var77.field43;
                                                if (!var11.field2882) {
                                                    int var80 = var11.field2922 * 4096 / var78;
                                                    if (var11.field2828 != 0) {
                                                        var77.method37((byte) 76, var80, var11.field2828, var11.field2922 / 2 + var13, var11.field2928 / 2 + var14);
                                                    } else if (var15 != 0) {
                                                        var77.method41(var13, var14, var11.field2922, var11.field2928, -(var15 & 255) + 256);
                                                    } else if (var11.field2922 == var78 && ~var11.field2928 == ~var79) {
                                                        var77.method45(var13, var14);
                                                    } else {
                                                        var77.method39(var13, var14, var11.field2922, var11.field2928);
                                                    }
                                                } else {
                                                    int var81 = (var11.field2928 + -1 + var79) / var79;
                                                    int var82 = (-1 - (-var78 - var11.field2922)) / var78;
                                                    class201.method1347(var13, var14, var11.field2922 + var13, var11.field2928 + var14);
                                                    for (int var83 = 0; var82 > var83; ++var83) {
                                                        for (int var84 = 0; var81 > var84; ++var84) {
                                                            if (var11.field2828 == 0) {
                                                                if (~var15 != -1) {
                                                                    var77.method40(var78 * var83 + var13, var79 * var84 + var14, 256 - (255 & var15));
                                                                } else {
                                                                    var77.method45(var78 * var83 + var13, var79 * var84 + var14);
                                                                }
                                                            } else {
                                                                var77.method37((byte) 78, 4096, var11.field2828, var78 / 2 + var78 * var83 + var13, var79 / 2 + var79 * var84 + var14);
                                                            }
                                                        }
                                                    }
                                                    class201.method1351(arg0, arg6, arg1, arg7);
                                                }
                                            }
                                        }
                                    } else {
                                        class3 var86 = var11.method1274(class254.method1693(var11, (byte) 59), 0);
                                        if (var86 != null) {
                                            var86.method45(var13, var14);
                                        } else if (class3.field49) {
                                            class246.method1663(arg2 ^ 255, var11);
                                        }
                                    }
                                } else if (~var11.field2937 == -7) {
                                    boolean var87 = class254.method1693(var11, (byte) 59);
                                    int var88;
                                    if (!var87) {
                                        var88 = var11.field2857;
                                    } else {
                                        var88 = var11.field2919;
                                    }
                                    class233 var89 = null;
                                    int var90 = 0;
                                    if (~var11.field2835 == 0) {
                                        if (~var11.field2947 != -6) {
                                            if (~var88 != 0) {
                                                class223 var91 = class28.method224(var88, 61);
                                                var89 = var11.method1267(class261.field4058.field440, var11.field2974, var11.field2833, var91, 88, var87, var11.field2868);
                                                if (var89 == null && class3.field49) {
                                                    class246.method1663(255, var11);
                                                }
                                            } else {
                                                var89 = var11.method1267(class261.field4058.field440, 0, -1, (class223) null, 55, var87, -1);
                                                if (var89 == null && class3.field49) {
                                                    class246.method1663(255, var11);
                                                }
                                            }
                                        } else if (~var11.field2993 != 0) {
                                            int var92 = 2047 & var11.field2993;
                                            if (~class294.field4623 == ~var92) {
                                                var92 = 2047;
                                            }
                                            class28 var93 = class41.field675[var92];
                                            class223 var94 = ~var88 == 0 ? null : class28.method224(var88, arg2 ^ 119);
                                            if (var93 != null && (int) class247.method1668(var93.field446, true) << 11 == (-2048 & var11.field2993)) {
                                                var89 = var93.field440.method1640((class223) null, var94, 5118, var11.field2833, 0, -1, (class85[]) null, true, 0, 0, -1);
                                            }
                                        } else {
                                            var89 = class296.field4670.method1640((class223) null, (class223) null, 5118, -1, -1, -1, (class85[]) null, true, 0, 0, -1);
                                        }
                                    } else {
                                        class123 var95 = class32.method260(var11.field2835, true);
                                        if (var95 != null) {
                                            class123 var96 = var95.method886(true, var11.field2995);
                                            class223 var97 = ~var88 == 0 ? null : class28.method224(var88, 89);
                                            if (var11.field2877 && class261.field4058.field440 != null) {
                                                var89 = var96.method872(var11.field2974, class261.field4058.field440, 0, var97, var11.field2833, 1, var11.field2868);
                                            } else {
                                                var89 = var96.method872(var11.field2974, (class242) null, 0, var97, var11.field2833, 1, var11.field2868);
                                            }
                                            if (var89 != null) {
                                                var90 = -var89.method223() / 2;
                                            } else {
                                                class246.method1663(255, var11);
                                            }
                                        }
                                    }
                                    if (var89 != null) {
                                        int var98;
                                        if (var11.field2859 > 0) {
                                            var98 = (var11.field2928 << 8) / var11.field2859;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99;
                                        if (var11.field2837 > 0) {
                                            var99 = (var11.field2922 << 8) / var11.field2837;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = (var11.field2881 * var99 >> 8) + var11.field2922 / 2 + var13;
                                        int var101 = var14 - (-(var11.field2928 / 2) - (var11.field2841 * var98 >> 8));
                                        class97.method758(var100, var101);
                                        int var102 = class97.field1557[var11.field2945] * var11.field2908 >> 16;
                                        int var103 = class97.field1556[var11.field2945] * var11.field2908 >> 16;
                                        if (!var11.field2852) {
                                            var89.method1533(0, var11.field2933, 0, var11.field2945, 0, var102, var103, -1L);
                                        } else if (var11.field2880) {
                                            ((class281) var89).method1883(0, var11.field2933, var11.field2990, var11.field2945, var11.field2869, var11.field2953 + var102 + var90, var11.field2953 + var103, var11.field2908);
                                        } else {
                                            var89.method1533(0, var11.field2933, var11.field2990, var11.field2945, var11.field2869, var11.field2953 + var102 - -var90, var11.field2953 + var103, -1L);
                                        }
                                        class97.method748();
                                    }
                                } else {
                                    if (var11.field2937 == 7) {
                                        class2 var104 = var11.method1272((byte) -59, class111.field1746);
                                        if (var104 == null) {
                                            if (class3.field49) {
                                                class246.method1663(arg2 ^ 255, var11);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; ~var106 > ~var11.field2893; ++var106) {
                                            for (int var107 = 0; ~var11.field2924 < ~var107; ++var107) {
                                                if (var11.field2944[var105] > 0) {
                                                    class123 var108 = class32.method260(var11.field2944[var105] + -1, true);
                                                    String var109;
                                                    if (~var108.field1906 != -2 && ~var11.field2897[var105] == -2) {
                                                        var109 = "<col=ff9040>" + var108.field1885 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field1885 + "</col> x" + client.method1053(-16950, var11.field2897[var105]);
                                                    }
                                                    int var110 = (115 - -var11.field2955) * var107 + var13;
                                                    int var111 = var14 - -((var11.field2909 + 12) * var106);
                                                    if (var11.field2914 != 0) {
                                                        if (~var11.field2914 == -2) {
                                                            var104.method12(var109, var110 - -57, var111, var11.field2934, !var11.field2984 ? -1 : 0);
                                                        } else {
                                                            var104.method9(var109, var110 + 115 - 1, var111, var11.field2934, !var11.field2984 ? -1 : 0);
                                                        }
                                                    } else {
                                                        var104.method13(var109, var110, var111, var11.field2934, !var11.field2984 ? -1 : 0);
                                                    }
                                                }
                                                ++var105;
                                            }
                                        }
                                    }
                                    if (~var11.field2937 == -9 && class56.field878 == var11 && class289.field4556 == class134.field2085) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class2 var114 = class124.field1953;
                                        String var115 = var11.field2831;
                                        String var116 = class287.method1931(var11, var115, (byte) 124);
                                        while (~var116.length() < -1) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (~var124 == 0) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var114.method10(var125);
                                            var113 += var114.field21 - -1;
                                            if (~var112 > ~var126) {
                                                var112 = var126;
                                            }
                                        }
                                        var113 += 7;
                                        var112 += 6;
                                        int var117 = var13 - -var11.field2922 + -var112 + -5;
                                        int var118 = var14 - (-var11.field2928 - 5);
                                        if (var13 - -5 > var117) {
                                            var117 = var13 + 5;
                                        }
                                        if (arg7 < var113 + var118) {
                                            var118 = -var113 + arg7;
                                        }
                                        if (~(var112 + var117) < ~arg1) {
                                            var117 = -var112 + arg1;
                                        }
                                        class201.method1333(var117, var118, var112, var113, 16777120);
                                        class201.method1340(var117, var118, var112, var113, 0);
                                        int var119 = var118 + 2 + var114.field21;
                                        String var120 = var11.field2831;
                                        String var121 = class287.method1931(var11, var120, (byte) 28);
                                        while (~var121.length() < -1) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var114.method13(var123, var117 + 3, var119, 0, -1);
                                            var119 += var114.field21 + 1;
                                        }
                                    }
                                    if (~var11.field2937 == -10) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (!var11.field2954) {
                                            var127 = var13;
                                            var128 = var14 - -var11.field2928;
                                            var129 = var11.field2922 + var13;
                                            var130 = var14;
                                        } else {
                                            var129 = var13 - -var11.field2922;
                                            var127 = var13;
                                            var130 = var11.field2928 + var14;
                                            var128 = var14;
                                        }
                                        if (~var11.field2838 == -2) {
                                            class201.method1332(var127, var130, var129, var128, var11.field2934);
                                        } else {
                                            class201.method1348(var127, var130, var129, var128, var11.field2934, var11.field2838);
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

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public static final void method89(byte arg0) {
        if (arg0 <= 71) {
            field124 = null;
        }
        boolean var1 = false;
        ++field116;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~(class220.field3450 + -1) < ~var2; ++var2) {
                if (class80.field1341[var2] < 1000 && ~class80.field1341[var2 + 1] < -1001) {
                    var1 = false;
                    String var3 = class63.field1008[var2];
                    class63.field1008[var2] = class63.field1008[var2 + 1];
                    class63.field1008[var2 - -1] = var3;
                    String var4 = class231.field3597[var2];
                    class231.field3597[var2] = class231.field3597[var2 + 1];
                    class231.field3597[var2 + 1] = var4;
                    int var5 = class211.field3279[var2];
                    class211.field3279[var2] = class211.field3279[var2 + 1];
                    class211.field3279[var2 - -1] = var5;
                    int var6 = class290.field4570[var2];
                    class290.field4570[var2] = class290.field4570[var2 + 1];
                    class290.field4570[var2 + 1] = var6;
                    int var7 = class42.field686[var2];
                    class42.field686[var2] = class42.field686[var2 - -1];
                    class42.field686[var2 + 1] = var7;
                    short var8 = class80.field1341[var2];
                    class80.field1341[var2] = class80.field1341[var2 - -1];
                    class80.field1341[var2 + 1] = var8;
                    long var9 = class13.field222[var2];
                    class13.field222[var2] = class13.field222[var2 + 1];
                    class13.field222[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)Z")
    public final boolean method90(int arg0) {
        ++field122;
        if (arg0 != 32) {
            method89((byte) -14);
        }
        if (this.field128 != null) {
            return true;
        } else if (this.field133 >= 0) {
            class49 var2 = class6.field112 >= 0 ? class23.method193(2, class245.field3798, this.field133, class6.field112) : class136.method956(class245.field3798, 107, this.field133);
            var2.method404();
            this.field128 = var2.field795;
            this.field121 = var2.field52;
            this.field123 = var2.field54;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    public final void method91(int arg0) {
        super.method91(arg0);
        this.field128 = null;
        ++field125;
    }
}
