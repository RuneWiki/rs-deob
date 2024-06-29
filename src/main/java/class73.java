import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class class73 {

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field1095 = 3;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lij;")
    public static class315 field1089 = new class315(0, 0);

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1098 = "level: ";

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "F")
    public static float field1099;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field1100;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field1101;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "[[[Ldg;")
    public static class224[][][] field1097;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method637(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILok;I)V", line = 6)
    public final void method625(int arg0, class61 arg1, int arg2) {
        field1096++;
        if (arg0 == -1 || !this.method470()) {
            return;
        }
        class120 var4 = arg1.field947[arg0];
        class215 var5 = var4.field1678;
        if (arg2 != 1) {
            field1097 = null;
        }
        for (int var6 = 0; var6 < var4.field1680; var6++) {
            short var7 = var4.field1683[var6];
            if (var5.field2979[var7]) {
                if (var4.field1675[var6] != -1) {
                    this.method452(0, 0, 0, 0);
                }
                this.method452(var5.field2981[var7], var4.field1676[var6], var4.field1677[var6], var4.field1687[var6]);
            }
        }
        this.method450();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIILsa;)V", line = 58)
    public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class411 arg6) {
        field1100++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        if (arg4 != -7438) {
            field1099 = -0.8486919F;
        }
        int var11 = -arg5 / 2;
        int var12 = -arg3 / 2;
        int var13 = arg6.method1515(arg0 + var11, arg1 - -var12);
        int var14 = arg5 / 2;
        int var15 = -arg3 / 2;
        int var16 = arg6.method1515(arg0 + var14, arg1 + var15);
        int var17 = -arg5 / 2;
        int var18 = arg3 / 2;
        int var19 = arg6.method1515(arg0 + var17, arg1 + var18);
        int var20 = arg5 / 2;
        int var21 = arg3 / 2;
        int var22 = arg6.method1515(arg0 + var20, arg1 + var21);
        int var23 = var13 < var16 ? var13 : var16;
        int var24 = var19 < var22 ? var19 : var22;
        int var25 = var16 < var22 ? var16 : var22;
        int var26 = var19 <= var13 ? var19 : var13;
        if (arg3 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method467(var27);
            }
        }
        if (arg5 != 0) {
            int var28 = (int) (Math.atan2((double) (var26 - var25), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                this.method442(var28);
            }
        }
        int var29 = var13 + var22;
        if (var16 + var19 < var29) {
            var29 = var16 + var19;
        }
        int var30 = (var29 >> 1) - arg2;
        if (var30 != 0) {
            this.method460(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILap;)V", line = 145)
    public static final void method627(int arg0, class289 arg1) {
        field1092++;
        int var2 = arg1.method1821(-27);
        class368.field5052 = new class260[var2];
        if (arg0 != 28586) {
            field1099 = -0.6956442F;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class368.field5052[var3] = new class260();
            class368.field5052[var3].field3506 = arg1.method1821(-125);
            class368.field5052[var3].field3512 = arg1.method1859(true);
        }
        class192.field2766 = arg1.method1821(-128);
        class227.field3155 = arg1.method1821(arg0 ^ 0xFFFF9047);
        class38.field583 = arg1.method1821(-127);
        class378.field5322 = new class187[class227.field3155 + 1 - class192.field2766];
        for (int var4 = 0; var4 < class38.field583; var4++) {
            int var5 = arg1.method1821(-88);
            class187 var6 = class378.field5322[var5] = new class187();
            var6.field1856 = arg1.method1861((byte) -72);
            var6.field1845 = arg1.method1856((byte) 125);
            var6.field2701 = class192.field2766 + var5;
            var6.field2713 = arg1.method1859(true);
            var6.field2700 = arg1.method1859(true);
        }
        class298.field4009 = arg1.method1856((byte) 43);
        class132.field1875 = true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILok;IBLok;IIZI)V", line = 204)
    public final void method628(int arg0, class61 arg1, int arg2, byte arg3, class61 arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field1094++;
        if (arg6 == -1 || !this.method470()) {
            return;
        }
        class120 var10 = arg1.field947[arg6];
        if (arg3 <= 110) {
            return;
        }
        class215 var11 = var10.field1678;
        class120 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field947[arg5];
            if (var12.field1678 != var11) {
                var12 = null;
            }
        }
        this.method635((boolean[]) null, (int[]) null, false, arg0, var10, (byte) 73, 65535, arg8, var11, arg7, var12, arg2);
        this.method450();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lqo;I)I", line = 251)
    public static final int method629(class127 arg0, int arg1) {
        field1091++;
        class15 var2 = arg0.field1784;
        if (var2.field177 != null) {
            var2 = var2.method78(0);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = -1 % ((arg1 + 18) / 56);
        int var4 = var2.field123;
        class434 var5 = arg0.method2280(121);
        if (arg0.field4982) {
            var4 = var2.field147;
        } else if (arg0.field4941 == var5.field6190 || arg0.field4941 == var5.field6148 || arg0.field4941 == var5.field6176 || arg0.field4941 == var5.field6154) {
            var4 = var2.field130;
        } else if (arg0.field4941 == var5.field6174 || arg0.field4941 == var5.field6153 || arg0.field4941 == var5.field6172 || arg0.field4941 == var5.field6195) {
            var4 = var2.field183;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIILpe;IIII)V", line = 290)
    public static final void method630(int arg0, int arg1, int arg2, int arg3, class391 arg4, int arg5, int arg6, int arg7, int arg8) {
        field1093++;
        if (arg3 != 0) {
            method636(111, (byte) -96);
        }
        class111 var9 = (class111) class194.method1394(arg0, arg7, arg8);
        if (var9 != null) {
            class372 var10 = class10.method53(var9.method582((byte) 22), true);
            int var11 = var9.method580(24493) & 0x3;
            int var12 = var9.method575(-15863);
            if (var10.field5161 == -1) {
                int var13 = arg1;
                if (var10.field5204 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg4.method2410(var13, arg2, 4, (byte) 122, arg6);
                    } else if (var11 == 1) {
                        arg4.method2411(arg2, 4, arg6, var13, true);
                    } else if (var11 == 2) {
                        arg4.method2410(var13, arg2 + 3, 4, (byte) 115, arg6);
                    } else if (var11 == 3) {
                        arg4.method2411(arg2, 4, arg6 + 3, var13, true);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method2414(arg6, arg2, 1, true, 1, var13);
                    } else if (var11 == 1) {
                        arg4.method2414(arg6, arg2 + 3, 1, true, 1, var13);
                    } else if (var11 == 2) {
                        arg4.method2414(arg6 + 3, arg2 + 3, 1, true, 1, var13);
                    } else if (var11 == 3) {
                        arg4.method2414(arg6 + 3, arg2, 1, true, 1, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method2411(arg2, 4, arg6, var13, true);
                    } else if (var11 == 1) {
                        arg4.method2410(var13, arg2 + 3, 4, (byte) -98, arg6);
                    } else if (var11 == 2) {
                        arg4.method2411(arg2, 4, arg6 + 3, var13, true);
                    } else if (var11 == 3) {
                        arg4.method2410(var13, arg2, 4, (byte) 115, arg6);
                    }
                }
            } else {
                class163.method1222(arg2, (byte) -58, var11, arg6, arg4, var10);
            }
        }
        class111 var14 = (class111) class95.method815(arg0, arg7, arg8, field1101 == null ? (field1101 = method637("gd")) : field1101);
        if (var14 != null) {
            class372 var15 = class10.method53(var14.method582((byte) 22), true);
            int var16 = var14.method580(arg3 ^ 0x5FAD) & 0x3;
            int var17 = var14.method575(-15863);
            if (var15.field5161 != -1) {
                class163.method1222(arg2, (byte) -58, var16, arg6, arg4, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5204 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg4.method2407(arg2, arg6, arg2 + 3, var18, arg6 + 3, 91);
                } else {
                    arg4.method2407(arg2, arg6 + 3, arg2 + 3, var18, arg6, 125);
                }
            }
        }
        class111 var19 = (class111) class314.method2001(arg0, arg7, arg8);
        if (var19 == null) {
            return;
        }
        class372 var20 = class10.method53(var19.method582((byte) 22), true);
        int var21 = var19.method580(24493) & 0x3;
        if (var20.field5161 != -1) {
            class163.method1222(arg2, (byte) -58, var21, arg6, arg4, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILok;IILok;ZIII[II)V", line = 431)
    public final void method631(int arg0, class61 arg1, int arg2, int arg3, class61 arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        field1090++;
        if (arg3 == -1 || !this.method470()) {
            return;
        }
        if (arg0 != 20116) {
            this.method448();
        }
        class120 var12 = arg1.field947[arg3];
        class215 var13 = var12.field1678;
        class120 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field947[arg6];
            if (var14.field1678 != var13) {
                var14 = null;
            }
        }
        this.method635((boolean[]) null, arg9, false, arg10, var12, (byte) -111, arg8, arg7, var13, arg5, var14, arg2);
        this.method450();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZILok;ILok;[ZIIIIILok;ILok;)V", line = 463)
    public final void method632(int arg0, boolean arg1, int arg2, class61 arg3, int arg4, class61 arg5, boolean[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class61 arg12, int arg13, class61 arg14) {
        field1087++;
        if (arg13 == -1) {
            return;
        }
        if (arg6 == null || arg0 == -1) {
            this.method628(arg4, arg3, arg8, (byte) 117, arg12, arg7, arg13, arg1, 0);
        } else if (this.method470()) {
            class120 var16 = arg3.field947[arg13];
            class215 var17 = var16.field1678;
            class120 var18 = null;
            int var19 = 125 / ((-arg10 - 27) / 63);
            if (arg12 != null) {
                var18 = arg12.field947[arg7];
                if (var18.field1678 != var17) {
                    var18 = null;
                }
            }
            class120 var20 = arg14.field947[arg0];
            class120 var21 = null;
            if (arg5 != null) {
                var21 = arg5.field947[arg9];
                if (var21.field1678 != var17) {
                    var21 = null;
                }
            }
            this.method635(arg6, (int[]) null, false, arg4, var16, (byte) 21, 65535, 0, var17, arg1, var18, arg8);
            this.method423(0, new int[0], 0, 0, 0, 0, arg1);
            this.method635(arg6, (int[]) null, true, arg2, var20, (byte) 50, 65535, 0, var17, arg1, var21, arg11);
            this.method450();
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([IIII[IIIZBI)V", line = 525)
    private final void method633(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7, byte arg8, int arg9) {
        if (arg3 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = -arg5;
                arg5 = arg1;
                arg1 = var16;
            } else if (arg9 == 3) {
                int var14 = arg5;
                arg5 = arg1;
                arg1 = var14;
            } else if (arg9 == 2) {
                int var15 = arg5;
                arg5 = -arg1 & 0x3FFF;
                arg1 = var15 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg1 = -arg1;
                arg5 = -arg5;
            } else if (arg9 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = arg5;
                arg5 = -arg1;
                arg1 = var13;
            } else if (arg9 == 3) {
                int var12 = arg5;
                arg5 = arg1;
                arg1 = var12;
            } else if (arg9 == 2) {
                int var11 = arg5;
                arg5 = arg1 & 0x3FFF;
                arg1 = -var11 & 0x3FFF;
            }
        }
        field1086++;
        if (arg2 == 65535) {
            this.method423(arg9, arg0, arg5, arg6, arg1, arg3, arg7);
        } else {
            this.method433(arg9, arg0, arg5, arg6, arg1, arg7, arg2, arg4);
        }
        if (arg8 > -105) {
            field1099 = 0.41175017F;
        }
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V", line = 621)
    public static void method634(int arg0) {
        field1089 = null;
        field1098 = null;
        field1097 = null;
        if (arg0 != 9725) {
            field1095 = 121;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([Z[IZILoq;BIILwi;ZLoq;I)V", line = 633)
    private final void method635(boolean[] arg0, int[] arg1, boolean arg2, int arg3, class120 arg4, byte arg5, int arg6, int arg7, class215 arg8, boolean arg9, class120 arg10, int arg11) {
        field1088++;
        if (arg10 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg4.field1680; var38++) {
                short var39 = arg4.field1683[var38];
                if (arg0 == null || arg0[var39] == arg2 || arg8.field2981[var39] == 0) {
                    short var40 = arg4.field1675[var38];
                    if (var40 != -1) {
                        this.method633(arg8.field2980[var40], 0, arg6 & arg8.field2985[var40], arg7, arg1, 0, 0, arg9, (byte) -114, 0);
                    }
                    this.method633(arg8.field2980[var39], arg4.field1687[var38], arg6 & arg8.field2985[var39], arg7, arg1, arg4.field1676[var38], arg4.field1677[var38], arg9, (byte) -123, arg8.field2981[var39]);
                }
            }
            return;
        }
        int var13 = 71 / ((arg5 + 52) / 57);
        int var14 = 0;
        int var15 = 0;
        for (int var16 = 0; var16 < arg8.field2977; var16++) {
            boolean var17 = false;
            if (var14 < arg4.field1680 && arg4.field1683[var14] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (arg10.field1680 > var15 && arg10.field1683[var15] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg0 == null || arg2 == arg0[var16] || arg8.field2981[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg8.field2981[var16];
                    if (var20 == 3) {
                        var19 = 128;
                    }
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    short var25;
                    if (var17) {
                        var23 = arg4.field1687[var14];
                        var21 = arg4.field1674[var14];
                        var24 = arg4.field1677[var14];
                        var25 = arg4.field1676[var14];
                        var22 = arg4.field1675[var14];
                        var14++;
                    } else {
                        var21 = 0;
                        var22 = -1;
                        var23 = var19;
                        var24 = var19;
                        var25 = var19;
                    }
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    short var30;
                    if (var18) {
                        var26 = arg10.field1677[var15];
                        var27 = arg10.field1674[var15];
                        var28 = arg10.field1675[var15];
                        var29 = arg10.field1687[var15];
                        var30 = arg10.field1676[var15];
                        var15++;
                    } else {
                        var29 = var19;
                        var30 = var19;
                        var28 = -1;
                        var27 = 0;
                        var26 = var19;
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var21 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var34 = var25;
                        var36 = var23;
                        var35 = var24;
                    } else if (var20 == 2) {
                        int var31 = var30 - var25 & 0x3FFF;
                        int var32 = var26 - var24 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        int var33 = var29 - var23 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var34 = var25 + (arg3 * var31 / arg11) & 0x3FFF;
                        var35 = arg3 * var32 / arg11 + var24 & 0x3FFF;
                        var36 = var23 + (arg3 * var33 / arg11) & 0x3FFF;
                    } else if (var20 == 7) {
                        int var37 = var30 - var25 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var36 = (var29 - var23) * arg3 / arg11 + var23;
                        var34 = arg3 * var37 / arg11 + var25 & 0x3F;
                        var35 = (var26 - var24) * arg3 / arg11 + var24;
                    } else {
                        var34 = (var30 - var25) * arg3 / arg11 + var25;
                        var36 = (var29 - var23) * arg3 / arg11 + var23;
                        var35 = (var26 - var24) * arg3 / arg11 + var24;
                    }
                    if (var22 != -1) {
                        this.method633(arg8.field2980[var22], 0, arg8.field2985[var22] & arg6, arg7, arg1, 0, 0, arg9, (byte) -125, 0);
                    } else if (var28 != -1) {
                        this.method633(arg8.field2980[var28], 0, arg8.field2985[var28] & arg6, arg7, arg1, 0, 0, arg9, (byte) -113, 0);
                    }
                    this.method633(arg8.field2980[var16], var36, arg8.field2985[var16] & arg6, arg7, arg1, var34, var35, arg9, (byte) -120, var20);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var18) {
                        var15++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Lnd;", line = 840)
    public static final class414 method636(int arg0, byte arg1) {
        field1085++;
        class414 var2 = (class414) class438.field6268.method2537(-60, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -19) {
            field1099 = 0.98863083F;
        }
        byte[] var3 = class420.field5888.method2633(arg0, -1, 31);
        class414 var4 = new class414();
        if (var3 != null) {
            var4.method2562(arg0, (byte) -63, new class289(var3));
        }
        class438.field6268.method2542(var4, (byte) -109, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public abstract void method463(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()Z")
    public abstract boolean method469();

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public abstract void method477(int arg0);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()I")
    public abstract int method426();

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public abstract void method467(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lsj;IIIZ)V")
    public abstract void method419(class73 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public abstract void method460(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method433(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIZ)Lsj;")
    public abstract class73 method440(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "()I")
    public abstract int method437();

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "()I")
    public abstract int method420();

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "()V")
    public abstract void method458();

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILsa;Lsa;III)V")
    public abstract void method466(int arg0, int arg1, class411 arg2, class411 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public abstract void method442(int arg0);

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "()Z")
    public abstract boolean method470();

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
    public abstract void method445(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "()I")
    public abstract int method416();

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lmk;Lmo;I)V")
    public abstract void method478(class156 arg0, class197 arg1, int arg2);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(SS)V")
    public abstract void method424(short arg0, short arg1);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lug;)Lug;")
    public abstract class325 method471(class325 arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILmk;Z)Z")
    public abstract boolean method455(int arg0, int arg1, class156 arg2, boolean arg3);

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "()I")
    public abstract int method422();

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
    public abstract void method425(int arg0);

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "()I")
    public abstract int method417();

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)V")
    public abstract void method452(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "()I")
    public abstract int method448();

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method423(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lmk;Lmo;II)V")
    public abstract void method428(class156 arg0, class197 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(SS)V")
    public abstract void method418(short arg0, short arg1);

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "()[Lds;")
    public abstract class227[] method447();

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "()V")
    public abstract void method450();

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "()I")
    public abstract int method441();

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "()I")
    public abstract int method451();

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "()[Lae;")
    public abstract class276[] method472();

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
    public abstract void method427(int arg0);

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "()V")
    public abstract void method430();

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)V")
    public abstract void method439(int arg0);

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "()I")
    public abstract int method449();
}
