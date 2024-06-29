import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class396 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field5695 = -1;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5698 = "Loaded wordpack";

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field5702 = 0;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Lph;")
    public static class114 field5700 = new class114(64);

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5709 = "Hidden";

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Lud;")
    public static class2 field5701;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "[[[I")
    public static int[][][] field5706;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lfh;ZIIIIBLdb;[ZZ[ILdb;)V", line = 6)
    private final void method2471(class210 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class26 arg7, boolean[] arg8, boolean arg9, int[] arg10, class26 arg11) {
        field5707++;
        if (arg11 == null || arg4 == 0) {
            for (int var37 = 0; var37 < arg7.field236; var37++) {
                short var38 = arg7.field246[var37];
                if (arg8 == null || arg8[var38] == arg1 || arg0.field2852[var38] == 0) {
                    short var39 = arg7.field244[var37];
                    if (var39 != -1) {
                        this.method2482(true, arg5, arg0.field2856[var39] & arg3, arg9, 0, 0, 0, 0, arg0.field2850[var39], arg10);
                    }
                    this.method2482(true, arg5, arg3 & arg0.field2856[var38], arg9, arg7.field241[var37], arg7.field243[var37], arg7.field238[var37], arg0.field2852[var38], arg0.field2850[var38], arg10);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg6 <= 68) {
            return;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg0.field2853; var15++) {
            boolean var16 = false;
            if (var13 < arg7.field236 && arg7.field246[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg11.field236 && arg11.field246[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg8 == null || arg8[var15] == arg1 || arg0.field2852[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field2852[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var22 = arg7.field245[var13];
                        var21 = arg7.field241[var13];
                        var20 = arg7.field243[var13];
                        var23 = arg7.field244[var13];
                        var24 = arg7.field238[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = 0;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg11.field238[var14];
                        var26 = arg11.field243[var14];
                        var27 = arg11.field244[var14];
                        var28 = arg11.field241[var14];
                        var29 = arg11.field245[var14];
                        var14++;
                    } else {
                        var26 = var18;
                        var25 = var18;
                        var29 = 0;
                        var27 = -1;
                        var28 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var33 = var20;
                        var35 = var21;
                        var34 = var24;
                    } else if (var19 == 2) {
                        int var30 = var25 - var24 & 0x3FFF;
                        int var31 = var26 - var20 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var28 - var21 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = arg4 * var31 / arg2 + var20 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg4 * var30 / arg2 + var24 & 0x3FFF;
                        var35 = var21 + (arg4 * var32 / arg2) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var25 - var24 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var28 - var21) * arg4 / arg2 + var21;
                        var33 = var20 + ((var26 - var20) * arg4 / arg2);
                        var34 = arg4 * var36 / arg2 + var24 & 0x3F;
                    } else {
                        var35 = var21 + ((var28 - var21) * arg4 / arg2);
                        var33 = var20 + ((var26 - var20) * arg4 / arg2);
                        var34 = var24 + ((var25 - var24) * arg4 / arg2);
                    }
                    if (var23 != -1) {
                        this.method2482(true, arg5, arg0.field2856[var23] & arg3, arg9, 0, 0, 0, 0, arg0.field2850[var23], arg10);
                    } else if (var27 != -1) {
                        this.method2482(true, arg5, arg3 & arg0.field2856[var27], arg9, 0, 0, 0, 0, arg0.field2850[var27], arg10);
                    }
                    this.method2482(true, arg5, arg3 & arg0.field2856[var15], arg9, var35, var33, var34, var19, arg0.field2850[var15], arg10);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lom;IIILom;ILom;ILom;ZZIII[Z)V", line = 206)
    public final void method2472(class127 arg0, int arg1, int arg2, int arg3, class127 arg4, int arg5, class127 arg6, int arg7, class127 arg8, boolean arg9, boolean arg10, int arg11, int arg12, int arg13, boolean[] arg14) {
        field5697++;
        if (arg1 == -1) {
            return;
        }
        if (arg14 == null || arg11 == -1) {
            this.method2474(arg8, arg5, arg0, 0, 65535, arg10, arg1, arg7, arg2);
        } else if (this.method2305()) {
            class26 var16 = arg0.field1640[arg1];
            class210 var17 = var16.field237;
            class26 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field1640[arg2];
                if (var18.field237 != var17) {
                    var18 = null;
                }
            }
            class26 var19 = arg6.field1640[arg11];
            class26 var20 = null;
            if (arg4 != null) {
                var20 = arg4.field1640[arg12];
                if (var20.field237 != var17) {
                    var20 = null;
                }
            }
            this.method2471(var17, arg9, arg7, 65535, arg5, 0, (byte) 108, var16, arg14, arg10, (int[]) null, var18);
            this.method2309(0, new int[0], 0, 0, 0, 0, arg10);
            this.method2471(var17, true, arg3, 65535, arg13, 0, (byte) 77, var19, arg14, arg10, (int[]) null, var20);
            this.method2260();
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lor;Le;)V", line = 268)
    public static final void method2473(class295 arg0, class96 arg1) {
        if (!arg1.field1143) {
            return;
        }
        short var2 = arg1.field1132;
        short var3 = arg1.field1134;
        byte var4 = arg1.field1141;
        byte var5 = arg1.field1137;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class96[][] var8 = class176.field2209[var4];
        float var10;
        if (class98.field1161 == class275.field3707) {
            int var9 = class116.field1450[var2][var3];
            class191.field2407.method1630(class272.field3682[0].method265(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 201.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class191.field2407.method1583(3000.0F, var10 * 1.5F);
        if (arg1.field1131) {
            if (class244.field3325) {
                if (var4 > 0) {
                    class96 var11 = class176.field2209[var4 - 1][var2][var3];
                    if (var11 != null && var11.field1143) {
                        return;
                    }
                }
                if (var2 <= class98.field1164 && var2 > class231.field3183) {
                    class96 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field1143 && (var12.field1131 || (arg1.field1133 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class98.field1164 && var2 < class105.field1290 - 1) {
                    class96 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field1143 && (var13.field1131 || (arg1.field1133 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class419.field6103 && var3 > class312.field4193) {
                    class96 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field1143 && (var14.field1131 || (arg1.field1133 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class419.field6103 && var3 < class207.field2797 - 1) {
                    class96 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field1143 && (var15.field1131 || (arg1.field1133 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class244.field3325 = true;
            }
            arg1.field1131 = false;
            if (arg1.field1139 != null) {
                class96 var16 = arg1.field1139;
                class191.field2407.method1583(3000.0F, (201.5F - (float) (var16.field1137 + 1) * 50.0F) * 1.5F);
                if (!class198.method1060(var16.field1137, var2, var3)) {
                    class98.field1161[var16.field1137].method276(var2, var3);
                }
                class449 var17 = var16.field1128;
                if (var17 != null) {
                    if (class160.field2064) {
                        if ((var17.field6524 & arg1.field1121) == 0) {
                            class63.method342(arg0, var4, var2, var3);
                        } else {
                            class368.method2231(arg0, var17.field6524, var5, var2, var3);
                        }
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    var17.method355(class191.field2407, false);
                }
                for (class122 var18 = var16.field1130; var18 != null; var18 = var18.field1511) {
                    class17 var19 = var18.field1505;
                    if (var19 != null) {
                        if (class160.field2064) {
                            class63.method342(arg0, var4, var2, var3);
                            class191.field2407.method1607(arg0.field4008, arg0.field3999);
                        }
                        var19.method355(class191.field2407, false);
                    }
                }
                class191.field2407.method1583(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class198.method1060(var5, var2, var3);
            if (var20) {
                class98.field1161[var5].method276(var2, var3);
                class206 var21 = arg1.field1135;
                if (var21 != null && var21.field2777) {
                    if (var21.field2784) {
                        class191.field2407.method1583(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class321 var22 = var21.method355(class191.field2407, false);
                    if (var22 != null) {
                        var22.field4289 = var21;
                        var22.field4291 = var4;
                        var22.field4294 = var2;
                        var22.field4288 = var3;
                        class171.field2154.method992(var22, -78);
                    }
                    if (var21.field2784) {
                        class191.field2407.method1583(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class449 var25 = arg1.field1128;
            class274 var26 = arg1.field1126;
            if (var25 != null || var26 != null) {
                if (class98.field1164 == var2) {
                    var23++;
                } else if (class98.field1164 < var2) {
                    var23 += 2;
                }
                if (class419.field6103 == var3) {
                    var23 += 3;
                } else if (class419.field6103 > var3) {
                    var23 += 6;
                }
                var24 = class395.field5692[var23];
                arg1.field1121 = class122.field1503[var23];
            }
            if (var25 != null) {
                if ((var25.field6524 & class395.field5693[var23]) == 0) {
                    arg1.field1123 = 0;
                } else if (var25.field6524 == 16) {
                    arg1.field1123 = 3;
                    arg1.field1122 = class300.field4095[var23];
                    arg1.field1125 = (byte) (3 - arg1.field1122);
                } else if (var25.field6524 == 32) {
                    arg1.field1123 = 6;
                    arg1.field1122 = class427.field6255[var23];
                    arg1.field1125 = (byte) (6 - arg1.field1122);
                } else if (var25.field6524 == 64) {
                    arg1.field1123 = 12;
                    arg1.field1122 = class123.field1587[var23];
                    arg1.field1125 = (byte) (12 - arg1.field1122);
                } else {
                    arg1.field1123 = 9;
                    arg1.field1122 = class96.field1138[var23];
                    arg1.field1125 = (byte) (9 - arg1.field1122);
                }
                if ((var25.field6524 & var24) != 0 && !class142.method771(var5, var2, var3, var25.field6524)) {
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class321 var27 = var25.method355(class191.field2407, false);
                    if (var27 != null) {
                        var27.field4289 = var25;
                        var27.field4291 = var4;
                        var27.field4294 = var2;
                        var27.field4288 = var3;
                        class171.field2154.method992(var27, -91);
                    }
                }
                class449 var28 = arg1.field1136;
                if (var28 != null && (var28.field6524 & var24) != 0 && !class142.method771(var5, var2, var3, var28.field6524)) {
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class321 var29 = var28.method355(class191.field2407, false);
                    if (var29 != null) {
                        var29.field4289 = var28;
                        var29.field4291 = var4;
                        var29.field4294 = var2;
                        var29.field4288 = var3;
                        class171.field2154.method992(var29, -102);
                    }
                }
            }
            if (var26 != null && !class370.method2233(var5, var2, var3, var26.method588(false))) {
                class274 var30 = arg1.field1140;
                class191.field2407.method1583(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field3704 & var24) != 0) {
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class321 var31 = var26.method355(class191.field2407, false);
                    if (var31 != null) {
                        var31.field4289 = var26;
                        var31.field4291 = var4;
                        var31.field4294 = var2;
                        var31.field4288 = var3;
                        class171.field2154.method992(var31, -85);
                    }
                } else if (var26.field3704 == 256) {
                    int var32 = var26.field3688 - class62.field638;
                    int var33 = var26.field3703 - class390.field5596;
                    int var34 = var26.field3700;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    if (var36 < var35) {
                        class321 var37 = var26.method355(class191.field2407, false);
                        if (var37 != null) {
                            var37.field4289 = var26;
                            var37.field4291 = var4;
                            var37.field4294 = var2;
                            var37.field4288 = var3;
                            class171.field2154.method992(var37, 122);
                        }
                    } else if (var30 != null) {
                        class321 var38 = var30.method355(class191.field2407, false);
                        if (var38 != null) {
                            var38.field4289 = var30;
                            var38.field4291 = var4;
                            var38.field4294 = var2;
                            var38.field4288 = var3;
                            class171.field2154.method992(var38, -49);
                        }
                    }
                }
                class191.field2407.method1583(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class206 var39 = arg1.field1135;
                if (var39 != null && !var39.field2777) {
                    if (var39.field2784) {
                        class191.field2407.method1583(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class321 var40 = var39.method355(class191.field2407, false);
                    if (var40 != null) {
                        var40.field4289 = var39;
                        var40.field4291 = var4;
                        var40.field4294 = var2;
                        var40.field4288 = var3;
                        class171.field2154.method992(var40, 117);
                    }
                    if (var39.field2784) {
                        class191.field2407.method1583(3000.0F, var10 * 1.5F);
                    }
                }
                class420 var41 = arg1.field1124;
                if (var41 != null && !var41.field6133) {
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class321 var42 = var41.method355(class191.field2407, false);
                    if (var42 != null) {
                        var42.field4289 = var41;
                        var42.field4291 = var4;
                        var42.field4294 = var2;
                        var42.field4288 = var3;
                        class171.field2154.method992(var42, -99);
                    }
                }
            }
            byte var43 = arg1.field1133;
            if (var43 != 0) {
                if (var2 < class98.field1164 && (var43 & 0x4) != 0) {
                    class96 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field1143) {
                        class211.field2862.method1079(0, var44);
                    }
                }
                if (var3 < class419.field6103 && (var43 & 0x2) != 0) {
                    class96 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field1143) {
                        class211.field2862.method1079(0, var45);
                    }
                }
                if (var2 > class98.field1164 && (var43 & 0x1) != 0) {
                    class96 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field1143) {
                        class211.field2862.method1079(0, var46);
                    }
                }
                if (var3 > class419.field6103 && (var43 & 0x8) != 0) {
                    class96 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field1143) {
                        class211.field2862.method1079(0, var47);
                    }
                }
            }
        }
        if (arg1.field1123 != 0) {
            boolean var48 = true;
            for (class122 var49 = arg1.field1130; var49 != null; var49 = var49.field1511) {
                if (class14.field137 != var49.field1505.field163 && (var49.field1507 & arg1.field1123) == arg1.field1122) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class449 var50 = arg1.field1128;
                if (!class142.method771(var5, var2, var3, var50.field6524)) {
                    if (class160.field2064) {
                        label687: {
                            if (var50.field6524 >= 16) {
                                int var51 = var2 - class98.field1164;
                                int var52 = var3 - class419.field6103;
                                if (var50.field6524 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class209.field2840) {
                                        class63.method342(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field6524 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class231.field3184 && var3 < class209.field2840) {
                                        class63.method342(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field6524 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class231.field3184 && var3 > 0) {
                                        class63.method342(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field6524 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class63.method342(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class63.method342(arg0, var4, var2, var3);
                        }
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class321 var53 = var50.method355(class191.field2407, false);
                    if (var53 != null) {
                        var53.field4289 = var50;
                        var53.field4291 = var4;
                        var53.field4294 = var2;
                        var53.field4288 = var3;
                        class171.field2154.method992(var53, 112);
                    }
                }
                arg1.field1123 = 0;
            }
        }
        if (arg1.field1120) {
            try {
                arg1.field1120 = false;
                int var54 = 0;
                label630: for (class122 var55 = arg1.field1130; var55 != null; var55 = var55.field1511) {
                    class17 var56 = var55.field1505;
                    if (class14.field137 != var56.field163) {
                        for (int var57 = var56.field168; var57 <= var56.field158; var57++) {
                            for (int var58 = var56.field159; var58 <= var56.field153; var58++) {
                                class96 var59 = var8[var57][var58];
                                if (var59.field1131) {
                                    arg1.field1120 = true;
                                    continue label630;
                                }
                                if (var59.field1123 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field168) {
                                        var60++;
                                    }
                                    if (var57 < var56.field158) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field159) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field153) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field1123) == arg1.field1125) {
                                        arg1.field1120 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class98.field1164 - var56.field168;
                        int var62 = var56.field158 - class98.field1164;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class419.field6103 - var56.field159;
                        int var64 = var56.field153 - class419.field6103;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field3997[var54] = var56;
                        arg0.field4007[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class17 var68 = arg0.field3997[var67];
                        if (class14.field137 != var68.field163) {
                            int var69 = arg0.field4007[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field152 - class62.field638;
                                int var71 = var68.field154 - class390.field5596;
                                int var72 = arg0.field3997[var66].field152 - class62.field638;
                                int var73 = arg0.field3997[var66].field154 - class390.field5596;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class17 var74 = arg0.field3997[var66];
                    var74.field163 = class14.field137;
                    if (!class123.method660(var5, var74.field168, var74.field158, var74.field159, var74.field153, var74.method76(20765))) {
                        if (class160.field2064) {
                            if (var74.field160 == 0) {
                                class319.method1839(arg0, var4, var74.field168, var74.field159, var74.field158, var74.field153);
                            } else {
                                class63.method342(arg0, var4, var2, var3);
                                int var75 = var2 - class98.field1164;
                                int var76 = var3 - class419.field6103;
                                if (var74.field160 == 2) {
                                    if (var76 > -var75) {
                                        class87.method472(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class87.method472(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class87.method472(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class87.method472(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class191.field2407.method1607(arg0.field4008, arg0.field3999);
                        }
                        class321 var77 = var74.method355(class191.field2407, false);
                        if (var77 != null) {
                            var77.field4289 = var74;
                            var77.field4291 = var4;
                            var77.field4294 = var74.field168;
                            var77.field4288 = var74.field159;
                            class171.field2154.method992(var77, 62);
                        }
                    }
                    for (int var78 = var74.field168; var78 <= var74.field158; var78++) {
                        for (int var79 = var74.field159; var79 <= var74.field153; var79++) {
                            class96 var80 = var8[var78][var79];
                            if (var80.field1123 != 0) {
                                class211.field2862.method1079(0, var80);
                            } else if ((var2 != var78 || var3 != var79) && var80.field1143) {
                                class211.field2862.method1079(0, var80);
                            }
                        }
                    }
                }
                if (arg1.field1120) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field1120 = false;
            }
        }
        if (arg1.field1127 != null) {
            if ((byte) (class80.field887 & 0xFF) == arg1.field1129) {
                class366 var81 = arg1.field1127;
                int var82 = class98.field1161[var4].method271(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class98.field1161[var4].method271(var2, var3) - class98.field1161[var4 + 1].method271(var2, var3);
                } else {
                    var83 = 1024;
                }
                class390.field5604.method745(var6, var82, var7, arg0.field3996);
                int var84 = arg0.field3996[2];
                class390.field5604.method745(var6, var82 - var83, var7, arg0.field3996);
                int var85 = arg0.field3996[2];
                int var86 = var84;
                int var87 = var85;
                if (var84 > var85) {
                    var86 = var85;
                    var87 = var84;
                }
                var86 -= 91;
                var87 += 91;
                if (var86 < var87 - 1597) {
                    var86 = var87 - 1597;
                }
                var81.field5134 = var86;
                var81.field5132 = var87;
                var81.field5133 = true;
                class191.field2407.method1635(var81);
            } else {
                arg1.field1127 = null;
            }
        }
        if (!arg1.field1143) {
            return;
        }
        if (arg1.field1123 != 0) {
            return;
        }
        if (var2 <= class98.field1164 && var2 > class231.field3183) {
            class96 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field1143) {
                return;
            }
        }
        if (var2 >= class98.field1164 && var2 < class105.field1290 - 1) {
            class96 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field1143) {
                return;
            }
        }
        if (var3 <= class419.field6103 && var3 > class312.field4193) {
            class96 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field1143) {
                return;
            }
        }
        if (var3 >= class419.field6103 && var3 < class207.field2797 - 1) {
            class96 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field1143) {
                return;
            }
        }
        arg1.field1143 = false;
        class140.field1798--;
        class420 var92 = arg1.field1124;
        if (var92 != null && var92.field6133) {
            if (class160.field2064) {
                class63.method342(arg0, var4, var2, var3);
                class191.field2407.method1607(arg0.field4008, arg0.field3999);
            }
            class321 var93 = var92.method355(class191.field2407, false);
            if (var93 != null) {
                var93.field4289 = var92;
                var93.field4291 = var4;
                var93.field4294 = var2;
                var93.field4288 = var3;
                class171.field2154.method992(var93, 77);
            }
        }
        if (arg1.field1121 != 0) {
            class274 var94 = arg1.field1126;
            if (var94 != null && !class370.method2233(var5, var2, var3, var94.method588(false))) {
                if ((var94.field3704 & arg1.field1121) != 0) {
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class321 var95 = var94.method355(class191.field2407, false);
                    if (var95 != null) {
                        var95.field4289 = var94;
                        var95.field4291 = var4;
                        var95.field4294 = var2;
                        var95.field4288 = var3;
                        class171.field2154.method992(var95, 81);
                    }
                } else if (var94.field3704 == 256) {
                    int var96 = var94.field3688 - class62.field638;
                    int var97 = var94.field3703 - class390.field5596;
                    int var98 = var94.field3700;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class160.field2064) {
                        class63.method342(arg0, var4, var2, var3);
                        class191.field2407.method1607(arg0.field4008, arg0.field3999);
                    }
                    class274 var101 = arg1.field1140;
                    if (var100 > var99) {
                        class321 var102 = var94.method355(class191.field2407, false);
                        if (var102 != null) {
                            var102.field4289 = var94;
                            var102.field4291 = var4;
                            var102.field4294 = var2;
                            var102.field4288 = var3;
                            class171.field2154.method992(var102, -32);
                        }
                    } else if (var101 != null) {
                        class321 var103 = var101.method355(class191.field2407, false);
                        if (var103 != null) {
                            var103.field4289 = var101;
                            var103.field4291 = var4;
                            var103.field4294 = var2;
                            var103.field4288 = var3;
                            class171.field2154.method992(var103, -68);
                        }
                    }
                }
            }
            class449 var104 = arg1.field1128;
            class449 var105 = arg1.field1136;
            if (var105 != null && (var105.field6524 & arg1.field1121) != 0 && !class142.method771(var5, var2, var3, var105.field6524)) {
                if (class160.field2064) {
                    class368.method2231(arg0, var105.field6524, var4, var2, var3);
                    class191.field2407.method1607(arg0.field4008, arg0.field3999);
                }
                class321 var106 = var105.method355(class191.field2407, false);
                if (var106 != null) {
                    var106.field4289 = var105;
                    var106.field4291 = var4;
                    var106.field4294 = var2;
                    var106.field4288 = var3;
                    class171.field2154.method992(var106, -76);
                }
            }
            if (var104 != null && (var104.field6524 & arg1.field1121) != 0 && !class142.method771(var5, var2, var3, var104.field6524)) {
                if (class160.field2064) {
                    class368.method2231(arg0, var104.field6524, var4, var2, var3);
                    class191.field2407.method1607(arg0.field4008, arg0.field3999);
                }
                class321 var107 = var104.method355(class191.field2407, false);
                if (var107 != null) {
                    var107.field4289 = var104;
                    var107.field4291 = var4;
                    var107.field4294 = var2;
                    var107.field4288 = var3;
                    class171.field2154.method992(var107, -78);
                }
            }
        }
        if (var4 < class366.field5129 - 1) {
            class96 var108 = class176.field2209[var4 + 1][var2][var3];
            if (var108 != null && var108.field1143) {
                class211.field2862.method1085(var108, (byte) -97);
            }
        }
        if (var2 < class98.field1164) {
            class96 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field1143) {
                class211.field2862.method1079(0, var109);
            }
        }
        if (var3 < class419.field6103) {
            class96 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field1143) {
                class211.field2862.method1079(0, var110);
            }
        }
        if (var2 > class98.field1164) {
            class96 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field1143) {
                class211.field2862.method1079(0, var111);
            }
        }
        if (var3 > class419.field6103) {
            class96 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field1143) {
                class211.field2862.method1079(0, var112);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lom;ILom;IIZIII)V", line = 1395)
    public final void method2474(class127 arg0, int arg1, class127 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field5699++;
        if (arg6 == -1 || !this.method2305()) {
            return;
        }
        class26 var10 = arg2.field1640[arg6];
        class210 var11 = var10.field237;
        class26 var12 = null;
        if (arg0 != null) {
            var12 = arg0.field1640[arg8];
            if (var12.field237 != var11) {
                var12 = null;
            }
        }
        this.method2471(var11, false, arg7, arg4, arg1, arg3, (byte) 124, var10, (boolean[]) null, arg5, (int[]) null, var12);
        this.method2260();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBLom;ZILom;IIII[I)V", line = 1428)
    public final void method2475(int arg0, byte arg1, class127 arg2, boolean arg3, int arg4, class127 arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        field5711++;
        if (arg4 == -1 || !this.method2305()) {
            return;
        }
        class26 var12 = arg2.field1640[arg4];
        class210 var13 = var12.field237;
        class26 var14 = null;
        if (arg5 != null) {
            var14 = arg5.field1640[arg9];
            if (var14.field237 != var13) {
                var14 = null;
            }
        }
        this.method2471(var13, false, arg6, arg7, arg8, arg0, (byte) 97, var12, (boolean[]) null, arg3, arg10, var14);
        if (arg1 != -42) {
            field5695 = -53;
        }
        this.method2260();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILom;)V", line = 1473)
    public final void method2476(int arg0, int arg1, class127 arg2) {
        field5696++;
        if (arg1 == -1 || arg0 != 1 || !this.method2305()) {
            return;
        }
        class26 var4 = arg2.field1640[arg1];
        class210 var5 = var4.field237;
        for (int var6 = 0; var6 < var4.field236; var6++) {
            short var7 = var4.field246[var6];
            if (var5.field2855[var7]) {
                if (var4.field244[var6] != -1) {
                    this.method2313(0, 0, 0, 0);
                }
                this.method2313(var5.field2852[var7], var4.field238[var6], var4.field243[var6], var4.field241[var6]);
            }
        }
        this.method2260();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 1515)
    public static final void method2477(boolean arg0) {
        class114 var1 = class272.field3672;
        synchronized (class272.field3672) {
            class272.field3672.method613(true);
            if (arg0) {
                method2480(-19, 78);
            }
        }
        field5710++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIILbl;)V", line = 1538)
    public final void method2478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class54 arg6) {
        field5703++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg5 / 2;
        int var12 = -arg2 / 2;
        int var13 = arg6.method265(arg3 + var11, arg0 - -var12);
        int var14 = arg5 / 2;
        int var15 = -arg2 / 2;
        int var16 = arg6.method265(arg3 + var14, arg0 + var15);
        int var17 = -arg5 / 2;
        int var18 = arg2 / 2;
        int var19 = arg6.method265(arg3 + var17, arg0 + var18);
        int var20 = arg5 / 2;
        int var21 = arg2 / 2;
        int var22 = arg6.method265(arg3 + var20, arg0 - -var21);
        int var23 = var16 > var13 ? var13 : var16;
        int var24 = var19 >= var22 ? var22 : var19;
        int var25 = var16 < var22 ? var16 : var22;
        if (arg2 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method2317(var26);
            }
        }
        int var27 = var13 >= var19 ? var19 : var13;
        int var28 = var13 + var22;
        if (arg4 <= 70) {
            return;
        }
        if (arg5 != 0) {
            int var29 = (int) (Math.atan2((double) (var27 - var25), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method2266(var29);
            }
        }
        if (var28 > (var16 + var19)) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg1;
        if (var30 != 0) {
            this.method2286(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 1617)
    public static final void method2479(int arg0, int arg1) {
        field5708++;
        class40 var2 = class162.method872(arg1, (byte) 92, 1);
        var2.method193(-70);
        if (arg0 > -65) {
            method2473((class295) null, (class96) null);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)I", line = 1630)
    public static final int method2480(int arg0, int arg1) {
        field5705++;
        if (arg1 != 0) {
            method2479(-54, 90);
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)V", line = 1641)
    public static void method2481(int arg0) {
        field5701 = null;
        field5698 = null;
        field5700 = null;
        if (arg0 != 5527) {
            method2473((class295) null, (class96) null);
        }
        field5706 = null;
        field5709 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIIZIIII[I[I)V", line = 1674)
    private final void method2482(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        if (!arg0) {
            this.method2312();
        }
        field5704++;
        if (arg1 == 1) {
            if (arg7 == 0 || arg7 == 1) {
                int var13 = -arg6;
                arg6 = arg4;
                arg4 = var13;
            } else if (arg7 == 3) {
                int var11 = arg6;
                arg6 = arg4;
                arg4 = var11;
            } else if (arg7 == 2) {
                int var12 = arg6;
                arg6 = -arg4 & 0x3FFF;
                arg4 = var12 & 0x3FFF;
            }
        } else if (arg1 == 2) {
            if (arg7 == 0 || arg7 == 1) {
                arg6 = -arg6;
                arg4 = -arg4;
            } else if (arg7 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg1 == 3) {
            if (arg7 == 0 || arg7 == 1) {
                int var16 = arg6;
                arg6 = -arg4;
                arg4 = var16;
            } else if (arg7 == 3) {
                int var14 = arg6;
                arg6 = arg4;
                arg4 = var14;
            } else if (arg7 == 2) {
                int var15 = arg6;
                arg6 = arg4 & 0x3FFF;
                arg4 = -var15 & 0x3FFF;
            }
        }
        if (arg2 == 65535) {
            this.method2309(arg7, arg8, arg6, arg5, arg4, arg1, arg3);
        } else {
            this.method2301(arg7, arg8, arg6, arg5, arg4, arg3, arg2, arg9);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()I")
    public abstract int method2290();

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()I")
    public abstract int method2263();

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "()I")
    public abstract int method2276();

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILbl;Lbl;III)V")
    public abstract void method2282(int arg0, int arg1, class54 arg2, class54 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lib;Lpf;II)V")
    public abstract void method2303(class247 arg0, class447 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public abstract void method2266(int arg0);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public abstract void method2267(int arg0);

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "()[Lmd;")
    public abstract class357[] method2311();

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "()I")
    public abstract int method2287();

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "()I")
    public abstract int method2312();

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILib;Z)Z")
    public abstract boolean method2300(int arg0, int arg1, class247 arg2, boolean arg3);

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "()I")
    public abstract int method2298();

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
    public abstract void method2269(int arg0);

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V")
    public abstract void method2271(int arg0);

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "()V")
    public abstract void method2314();

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "()[Loa;")
    public abstract class149[] method2296();

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)V")
    public abstract void method2317(int arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lve;)Lve;")
    public abstract class307 method2265(class307 arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljn;IIIZ)V")
    public abstract void method2293(class396 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "()Z")
    public abstract boolean method2305();

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "()I")
    public abstract int method2279();

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(SS)V")
    public abstract void method2310(short arg0, short arg1);

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "()I")
    public abstract int method2304();

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
    public abstract void method2313(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
    public abstract void method2264(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "()V")
    public abstract void method2260();

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "()Z")
    public abstract boolean method2272();

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIZ)Ljn;")
    public abstract class396 method2297(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "()I")
    public abstract int method2299();

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method2309(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(SS)V")
    public abstract void method2307(short arg0, short arg1);

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "(I)V")
    public abstract void method2275(int arg0);

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "()V")
    public abstract void method2308();

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "()I")
    public abstract int method2315();

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V")
    public abstract void method2286(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)V")
    public abstract void method2268(int arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method2301(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lib;Lpf;I)V")
    public abstract void method2284(class247 arg0, class447 arg1, int arg2);
}
