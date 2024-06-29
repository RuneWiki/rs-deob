import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class355 extends class200 {

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "[B")
    public byte[] field5261;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field5254 = 0;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Lfi;")
    public static class38 field5260 = null;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "F")
    public static float field5262;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public int field5253;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public int field5263;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field5265;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field5266;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIILza;III)V")
    public static final void method2261(int arg0, int arg1, int arg2, int arg3, int arg4, class299 arg5, int arg6, int arg7, int arg8) {
        field5256++;
        if (arg1 != -13326) {
            field5262 = 1.1974367F;
        }
        class161 var9 = (class161) class454.method2781(arg0, arg6, arg2);
        if (var9 != null) {
            class395 var10 = class247.field3693.method2281(var9.method99((byte) -107), -9380);
            int var11 = var9.method97(113) & 0x3;
            int var12 = var9.method103(-42);
            if (var10.field5814 == -1) {
                int var13 = arg8;
                if (var10.field5840 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg5.method1987((byte) -125, var13, 4, arg4, arg7);
                    } else if (var11 == 1) {
                        arg5.method1986(1, var13, arg7, 4, arg4);
                    } else if (var11 == 2) {
                        arg5.method1987((byte) -73, var13, 4, arg4, arg7 + 3);
                    } else if (var11 == 3) {
                        arg5.method1986(1, var13, arg7, 4, arg4 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg5.method1991(arg4, var13, 1, 1, 35, arg7);
                    } else if (var11 == 1) {
                        arg5.method1991(arg4, var13, 1, 1, arg1 + 13447, arg7 - -3);
                    } else if (var11 == 2) {
                        arg5.method1991(arg4 + 3, var13, 1, 1, 91, arg7 + 3);
                    } else if (var11 == 3) {
                        arg5.method1991(arg4 + 3, var13, 1, 1, 43, arg7);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg5.method1986(1, var13, arg7, 4, arg4);
                    } else if (var11 == 1) {
                        arg5.method1987((byte) -112, var13, 4, arg4, arg7 + 3);
                    } else if (var11 == 2) {
                        arg5.method1986(1, var13, arg7, 4, arg4 + 3);
                    } else if (var11 == 3) {
                        arg5.method1987((byte) -94, var13, 4, arg4, arg7);
                    }
                }
            } else {
                class169.method1204(arg4, var10, var11, arg5, arg1 ^ 0xFFFFCBF2, arg7);
            }
        }
        class161 var14 = (class161) class35.method217(arg0, arg6, arg2, field5266 == null ? (field5266 = method2270("bs")) : field5266);
        if (var14 != null) {
            class395 var15 = class247.field3693.method2281(var14.method99((byte) -107), -9380);
            int var16 = var14.method97(arg1 ^ 0xFFFFCBAD) & 0x3;
            int var17 = var14.method103(-39);
            if (var15.field5814 != -1) {
                class169.method1204(arg4, var15, var16, arg5, arg1 ^ 0xFFFFCBF2, arg7);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5840 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg5.method1996(arg4, arg4 + 3, arg7 + 3, arg7, var18, arg1 + 20179);
                } else {
                    arg5.method1996(arg4 + 3, arg4, arg7 + 3, arg7, var18, 6853);
                }
            }
        }
        class161 var19 = (class161) class404.method2542(arg0, arg6, arg2);
        if (var19 == null) {
            return;
        }
        class395 var20 = class247.field3693.method2281(var19.method99((byte) -107), -9380);
        int var21 = var19.method97(98) & 0x3;
        if (var20.field5814 != -1) {
            class169.method1204(arg4, var20, var21, arg5, 0, arg7);
            return;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
    public final void method2262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5249++;
        int var8 = 0;
        if (arg1 != arg5) {
            var8 = (arg6 - arg4 << 16) / (arg5 - arg1);
        }
        int var9 = 0;
        if (arg2 != arg5) {
            var9 = (arg3 - arg6 << 16) / (arg2 - arg5);
        }
        int var10 = arg0;
        if (arg1 != arg2) {
            var10 = (arg4 - arg3 << 16) / (arg1 - arg2);
        }
        if (arg1 <= arg5 && arg2 >= arg1) {
            if (arg5 >= arg2) {
                int var11;
                int var12 = var11 = arg4 << 16;
                int var13 = arg3 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg1 == arg2 || var8 <= var10) && (arg1 != arg2 || var8 >= var9)) {
                    int var17 = arg5 - arg2;
                    int var18 = arg2 - arg1;
                    int var19 = this.field5263 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class531.method3138((byte) -51, var11 >> 16, var19, 0, this.field5261, var13 >> 16);
                                var19 += this.field5263;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class531.method3138((byte) -51, var11 >> 16, var19, 0, this.field5261, var12 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field5263;
                    }
                } else {
                    int var14 = arg5 - arg2;
                    int var15 = arg2 - arg1;
                    int var16 = this.field5263 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class531.method3138((byte) -51, var13 >> 16, var16, 0, this.field5261, var11 >> 16);
                                var16 += this.field5263;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class531.method3138((byte) -51, var12 >> 16, var16, 0, this.field5261, var11 >> 16);
                        var16 += this.field5263;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                int var22 = arg6 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg1 != arg5 && var10 < var8 || arg1 == arg5 && var9 < var10) {
                    int var23 = arg2 - arg5;
                    int var24 = arg5 - arg1;
                    int var25 = this.field5263 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class531.method3138((byte) -51, var21 >> 16, var25, 0, this.field5261, var22 >> 16);
                                var25 += this.field5263;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class531.method3138((byte) -51, var21 >> 16, var25, 0, this.field5261, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field5263;
                    }
                } else {
                    int var26 = arg2 - arg5;
                    int var27 = arg5 - arg1;
                    int var28 = this.field5263 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class531.method3138((byte) -51, var22 >> 16, var28, 0, this.field5261, var21 >> 16);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field5263;
                            }
                        }
                        class531.method3138((byte) -51, var20 >> 16, var28, 0, this.field5261, var21 >> 16);
                        var28 += this.field5263;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg5 > arg2) {
            if (arg5 <= arg1) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var9;
                    var29 -= arg2 * var10;
                    arg2 = 0;
                }
                int var31 = arg6 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg1 - arg5;
                    int var33 = arg5 - arg2;
                    int var34 = this.field5263 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class531.method3138((byte) -51, var29 >> 16, var34, 0, this.field5261, var31 >> 16);
                                var29 += var10;
                                var31 += var8;
                                var34 += this.field5263;
                            }
                        }
                        class531.method3138((byte) -51, var29 >> 16, var34, 0, this.field5261, var30 >> 16);
                        var34 += this.field5263;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg1 - arg5;
                    int var36 = arg5 - arg2;
                    int var37 = this.field5263 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class531.method3138((byte) -51, var31 >> 16, var37, 0, this.field5261, var29 >> 16);
                                var29 += var10;
                                var31 += var8;
                                var37 += this.field5263;
                            }
                        }
                        class531.method3138((byte) -51, var30 >> 16, var37, 0, this.field5261, var29 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field5263;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                int var40 = arg4 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var9;
                    var38 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg5 - arg1;
                    int var42 = arg1 - arg2;
                    int var43 = this.field5263 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class531.method3138((byte) -51, var40 >> 16, var43, 0, this.field5261, var39 >> 16);
                                var39 += var9;
                                var40 += var8;
                                var43 += this.field5263;
                            }
                        }
                        class531.method3138((byte) -51, var38 >> 16, var43, 0, this.field5261, var39 >> 16);
                        var43 += this.field5263;
                        var39 += var9;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg5 - arg1;
                    int var45 = arg1 - arg2;
                    int var46 = this.field5263 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class531.method3138((byte) -51, var39 >> 16, var46, 0, this.field5261, var40 >> 16);
                                var46 += this.field5263;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        class531.method3138((byte) -51, var39 >> 16, var46, 0, this.field5261, var38 >> 16);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field5263;
                    }
                }
            }
        } else if (arg2 >= arg1) {
            int var47;
            int var48 = var47 = arg6 << 16;
            int var49 = arg4 << 16;
            if (arg5 < 0) {
                var48 -= arg5 * var8;
                var47 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if (var8 >= var9) {
                int var50 = arg2 - arg1;
                int var51 = arg1 - arg5;
                int var52 = this.field5263 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class531.method3138((byte) -51, var47 >> 16, var52, 0, this.field5261, var49 >> 16);
                            var47 += var9;
                            var49 += var10;
                            var52 += this.field5263;
                        }
                    }
                    class531.method3138((byte) -51, var47 >> 16, var52, 0, this.field5261, var48 >> 16);
                    var47 += var9;
                    var52 += this.field5263;
                    var48 += var8;
                }
            } else {
                int var53 = arg2 - arg1;
                int var54 = arg1 - arg5;
                int var55 = this.field5263 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class531.method3138((byte) -51, var49 >> 16, var55, 0, this.field5261, var47 >> 16);
                            var55 += this.field5263;
                            var47 += var9;
                            var49 += var10;
                        }
                    }
                    class531.method3138((byte) -51, var48 >> 16, var55, 0, this.field5261, var47 >> 16);
                    var55 += this.field5263;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            int var58 = arg3 << 16;
            if (arg5 < 0) {
                var56 -= arg5 * var9;
                var57 -= arg5 * var8;
                arg5 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg2 != arg5 && var8 < var9 || arg2 == arg5 && var10 < var8) {
                int var59 = arg1 - arg2;
                int var60 = arg2 - arg5;
                int var61 = this.field5263 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class531.method3138((byte) -51, var57 >> 16, var61, 0, this.field5261, var58 >> 16);
                            var57 += var8;
                            var58 += var10;
                            var61 += this.field5263;
                        }
                    }
                    class531.method3138((byte) -51, var57 >> 16, var61, 0, this.field5261, var56 >> 16);
                    var56 += var9;
                    var61 += this.field5263;
                    var57 += var8;
                }
            } else {
                int var62 = arg1 - arg2;
                int var63 = arg2 - arg5;
                int var64 = this.field5263 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class531.method3138((byte) -51, var58 >> 16, var64, 0, this.field5261, var57 >> 16);
                            var58 += var10;
                            var64 += this.field5263;
                            var57 += var8;
                        }
                    }
                    class531.method3138((byte) -51, var56 >> 16, var64, 0, this.field5261, var57 >> 16);
                    var57 += var8;
                    var56 += var9;
                    var64 += this.field5263;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIZ)Z")
    public final boolean method2263(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field5259 = 86;
        }
        field5265++;
        return arg0 * arg1 <= this.field5261.length;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
    public static final void method2264(byte arg0) {
        field5252++;
        if (arg0 != -89) {
            method2267(-45, 34, null, (byte) -81);
        }
        if (class66.field1040.toLowerCase().indexOf("microsoft") != -1) {
            class402.field5945[188] = 71;
            class402.field5945[186] = 57;
            class402.field5945[221] = 43;
            class402.field5945[189] = 26;
            class402.field5945[190] = 72;
            class402.field5945[187] = 27;
            class402.field5945[191] = 73;
            class402.field5945[223] = 28;
            class402.field5945[220] = 74;
            class402.field5945[222] = 59;
            class402.field5945[192] = 58;
            class402.field5945[219] = 42;
            return;
        }
        class402.field5945[92] = 74;
        class402.field5945[61] = 27;
        if (class66.field1059 == null) {
            class402.field5945[192] = 58;
            class402.field5945[222] = 59;
        } else {
            class402.field5945[222] = 58;
            class402.field5945[192] = 28;
            class402.field5945[520] = 59;
        }
        class402.field5945[47] = 73;
        class402.field5945[59] = 57;
        class402.field5945[93] = 43;
        class402.field5945[91] = 42;
        class402.field5945[46] = 72;
        class402.field5945[45] = 26;
        class402.field5945[44] = 71;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method2265(int arg0) {
        if (arg0 == 58) {
            field5260 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIII)V")
    public final void method2266(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        this.field5263 = arg2 - arg3;
        if (!arg1) {
            this.field5250 = arg3;
            this.field5253 = arg4;
            field5251++;
            this.field5259 = arg0 - arg4;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
    public static final String method2267(int arg0, int arg1, byte[] arg2, byte arg3) {
        field5258++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg2[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class348.field5198[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg3 >= -85) {
            field5262 = -2.3058615F;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public static final void method2268(boolean arg0) {
        field5264++;
        class242 var1 = class98.field1525;
        synchronized (class98.field1525) {
            if (!arg0) {
                field5260 = null;
            }
            class98.field1525.method1637((byte) 13);
        }
        class242 var2 = class162.field2439;
        synchronized (class162.field2439) {
            class162.field2439.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
    public final void method2269(byte arg0) {
        field5255++;
        if (arg0 < 27) {
            this.field5253 = 83;
        }
        int var2 = -1;
        int var3 = this.field5261.length - 8;
        while (var3 > var2) {
            var2++;
            this.field5261[var2] = 0;
            var2++;
            this.field5261[var2] = 0;
            var2++;
            this.field5261[var2] = 0;
            var2++;
            this.field5261[var2] = 0;
            var2++;
            this.field5261[var2] = 0;
            var2++;
            this.field5261[var2] = 0;
            var2++;
            this.field5261[var2] = 0;
            var2++;
            this.field5261[var2] = 0;
        }
        while (var2 < (this.field5261.length - 1)) {
            var2++;
            this.field5261[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ltt;II)V")
    public class355(class249 arg0, int arg1, int arg2) {
        this.field5261 = new byte[arg1 * arg2];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2270(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
