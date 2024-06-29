import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class336 {

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field4975 = 52;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field4979 = 0;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Liu;")
    public static class415 field4966 = new class415(5000);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Lqt;")
    public static class459 field4980 = new class459(49, 12);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "F")
    public static float field4968;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Ldb;")
    public static class217 field4972;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lo;IIIIIBII)V", line = 6)
    public final void method2127(class24 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field4967++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg5 / 2;
        int var14 = -arg1 / 2;
        int var15 = arg0.method143(arg4 + var13, arg3 + var14);
        int var16 = arg5 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg0.method143(arg4 + var16, arg3 - -var17);
        int var19 = -arg5 / 2;
        int var20 = arg1 / 2;
        int var21 = arg0.method143(arg4 + var19, arg3 + var20);
        int var22 = arg5 / 2;
        if (arg6 != -95) {
            return;
        }
        int var23 = arg1 / 2;
        int var24 = arg0.method143(arg4 + var22, arg3 - -var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg1 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg7 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg7;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (arg7 < var28) {
                        var28 = arg7;
                    }
                }
                this.method1135(var28);
            }
        }
        int var30 = var21 > var15 ? var15 : var21;
        int var31 = var15 + var24;
        if (arg5 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg2 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg2;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg2 < var32) {
                        var32 = arg2;
                    }
                }
                this.method1145(var32);
            }
        }
        if ((var18 + var21) < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg8;
        if (var34 != 0) {
            this.method1167(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[I[IIIZII)V", line = 130)
    private final void method2128(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        int var11 = 81 % ((-arg1 - 39) / 55);
        field4976++;
        if (arg0 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var14 = -arg6;
                arg6 = arg8;
                arg8 = var14;
            } else if (arg9 == 3) {
                int var13 = arg6;
                arg6 = arg8;
                arg8 = var13;
            } else if (arg9 == 2) {
                int var12 = arg6;
                arg6 = -arg8 & 0x3FFF;
                arg8 = var12 & 0x3FFF;
            }
        } else if (arg0 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg6 = -arg6;
                arg8 = -arg8;
            } else if (arg9 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg0 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var17 = arg6;
                arg6 = -arg8;
                arg8 = var17;
            } else if (arg9 == 3) {
                int var15 = arg6;
                arg6 = arg8;
                arg8 = var15;
            } else if (arg9 == 2) {
                int var16 = arg6;
                arg6 = arg8 & 0x3FFF;
                arg8 = -var16 & 0x3FFF;
            }
        }
        if (arg5 == 65535) {
            this.method1134(arg9, arg4, arg6, arg2, arg8, arg0, arg7);
        } else {
            this.method1143(arg9, arg4, arg6, arg2, arg8, arg7, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILrw;Z)V", line = 227)
    public final void method2129(int arg0, class543 arg1, boolean arg2) {
        field4965++;
        if (arg0 == -1 || !this.method1149()) {
            return;
        }
        class155 var4 = arg1.field7967[arg0];
        class251 var5 = var4.field2359;
        if (!arg2) {
            this.method1136();
        }
        for (int var6 = 0; var6 < var4.field2365; var6++) {
            short var7 = var4.field2367[var6];
            if (var5.field3729[var7]) {
                if (var4.field2368[var6] != -1) {
                    this.method1152(0, 0, 0, 0);
                }
                this.method1152(var5.field3730[var7], var4.field2357[var6], var4.field2360[var6], var4.field2355[var6]);
            }
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqa;Lee;IIIII)V", line = 277)
    public static final void method2130(class167 arg0, class487 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class251.field3740 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class394.field5608) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class337.field5000 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class188 var15 = class461.field6675[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class146.field2262[var12].method156(var13, var14) + class146.field2262[var12].method156(var13 + 1, var14) + class146.field2262[var12].method156(var13, var14 + 1) + class146.field2262[var12].method156(var13 + 1, var14 + 1)) / 4 - (class146.field2262[arg2].method156(arg3, arg4) + class146.field2262[arg2].method156(arg3 + 1, arg4) + class146.field2262[arg2].method156(arg3, arg4 + 1) + class146.field2262[arg2].method156(arg3 + 1, arg4 + 1)) / 4;
                                    class468 var17 = var15.field2764;
                                    class468 var18 = var15.field2751;
                                    if (var17 != null && var17.method556(-1)) {
                                        arg1.method558(var16, (var14 - arg4) * class291.field4317 + (1 - arg6) * class185.field2738, (var13 - arg3) * class291.field4317 + (1 - arg5) * class185.field2738, arg0, false, var17, var7);
                                    }
                                    if (var18 != null && var18.method556(-1)) {
                                        arg1.method558(var16, (var14 - arg4) * class291.field4317 + (1 - arg6) * class185.field2738, (var13 - arg3) * class291.field4317 + (1 - arg5) * class185.field2738, arg0, false, var18, var7);
                                    }
                                    for (class317 var19 = var15.field2773; var19 != null; var19 = var19.field4709) {
                                        class478 var20 = var19.field4711;
                                        if (var20 != null && var20.method556(-1) && (var20.field6971 == var13 || var8 == var13) && (var20.field6962 == var14 || var10 == var14)) {
                                            int var21 = var20.field6970 + 1 - var20.field6971;
                                            int var22 = var20.field6959 + 1 - var20.field6962;
                                            arg1.method558(var16, (var20.field6962 - arg4) * class291.field4317 + (var22 - arg6) * class185.field2738, (var20.field6971 - arg3) * class291.field4317 + (var21 - arg5) * class185.field2738, arg0, false, var20, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIIILrw;ZLrw;I)V", line = 377)
    public final void method2131(int arg0, byte arg1, int arg2, int arg3, int arg4, class543 arg5, boolean arg6, class543 arg7, int arg8) {
        field4974++;
        if (arg8 == -1 || !this.method1149()) {
            return;
        }
        if (arg1 > -94) {
            field4968 = 1.08746F;
        }
        class155 var10 = arg5.field7967[arg8];
        class251 var11 = var10.field2359;
        class155 var12 = null;
        if (arg7 != null) {
            var12 = arg7.field7967[arg0];
            if (var12.field2359 != var11) {
                var12 = null;
            }
        }
        this.method2133(arg4, var12, var11, arg3, 3252, null, null, 65535, var10, arg6, false, arg2);
        this.method1158();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;BLwn;)I", line = 427)
    public static final int method2132(String arg0, byte arg1, class519 arg2) {
        field4973++;
        int var3 = arg2.field7558;
        byte[] var4 = class364.method2242(arg0, (byte) -99);
        arg2.method3067(107, var4.length);
        if (arg1 <= 94) {
            return -95;
        } else {
            arg2.field7558 += class194.field2811.method1701(var4, arg2.field7545, arg2.field7558, var4.length, -16025, 0);
            return arg2.field7558 - var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILrt;Lll;II[I[ZILrt;ZZI)V", line = 448)
    private final void method2133(int arg0, class155 arg1, class251 arg2, int arg3, int arg4, int[] arg5, boolean[] arg6, int arg7, class155 arg8, boolean arg9, boolean arg10, int arg11) {
        field4977++;
        if (arg1 == null || arg0 == 0) {
            for (int var38 = 0; var38 < arg8.field2365; var38++) {
                short var39 = arg8.field2367[var38];
                if (arg6 == null || arg6[var39] == arg10 || arg2.field3730[var39] == 0) {
                    short var40 = arg8.field2368[var38];
                    if (var40 != -1) {
                        this.method2128(arg11, 115, 0, arg5, arg2.field3733[var40], arg2.field3734[var40] & arg7, 0, arg9, 0, 0);
                    }
                    this.method2128(arg11, 23, arg8.field2360[var38], arg5, arg2.field3733[var39], arg2.field3734[var39] & arg7, arg8.field2357[var38], arg9, arg8.field2355[var38], arg2.field3730[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg2.field3731; var15++) {
            boolean var16 = false;
            if (arg8.field2365 > var13 && arg8.field2367[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg1.field2365 && arg1.field2367[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg6 == null || arg10 == arg6[var15] || arg2.field3730[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg2.field3730[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg8.field2355[var13];
                        var21 = arg8.field2357[var13];
                        var22 = arg8.field2362[var13];
                        var23 = arg8.field2360[var13];
                        var24 = arg8.field2368[var13];
                        var13++;
                    } else {
                        var21 = var18;
                        var20 = var18;
                        var22 = 0;
                        var24 = -1;
                        var23 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var29 = arg1.field2360[var14];
                        var25 = arg1.field2355[var14];
                        var28 = arg1.field2362[var14];
                        var26 = arg1.field2368[var14];
                        var27 = arg1.field2357[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = -1;
                        var27 = var18;
                        var28 = 0;
                        var29 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var34 = var21;
                        var33 = var23;
                        var35 = var20;
                    } else if (var19 == 2) {
                        int var30 = var27 - var21 & 0x3FFF;
                        int var31 = var29 - var23 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var25 - var20 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = arg0 * var31 / arg3 + var23 & 0x3FFF;
                        var34 = arg0 * var30 / arg3 + var21 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg0 * var32 / arg3 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var27 - var21 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var34 = arg0 * var37 / arg3 + var21 & 0x3FFF;
                        var35 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var36 = var27 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var25 - var20) * arg0 / arg3 + var20;
                        var34 = arg0 * var36 / arg3 + var21 & 0x3F;
                        var33 = (var29 - var23) * arg0 / arg3 + var23;
                    } else {
                        var34 = (var27 - var21) * arg0 / arg3 + var21;
                        var35 = (var25 - var20) * arg0 / arg3 + var20;
                        var33 = (var29 - var23) * arg0 / arg3 + var23;
                    }
                    if (var24 != -1) {
                        this.method2128(arg11, 122, 0, arg5, arg2.field3733[var24], arg2.field3734[var24] & arg7, 0, arg9, 0, 0);
                    } else if (var26 != -1) {
                        this.method2128(arg11, 92, 0, arg5, arg2.field3733[var26], arg7 & arg2.field3734[var26], 0, arg9, 0, 0);
                    }
                    this.method2128(arg11, 47, var33, arg5, arg2.field3733[var15], arg7 & arg2.field3734[var15], var34, arg9, var35, var19);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
        if (arg4 != 3252) {
            this.method1131(52, -37, null, false);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V", line = 661)
    public static final void method2134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= -50) {
            method2134(104, 79, 37, -29, -58);
        }
        field4971++;
        if (arg4 >= class424.field5996 && class333.field4936 >= arg4) {
            int var5 = class252.method1631(class176.field2630, class465.field6763, arg3, -105);
            int var6 = class252.method1631(class176.field2630, class465.field6763, arg0, -77);
            class221.method1505(var5, var6, arg4, (byte) 71, arg1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lrw;IIIZI[IIIILrw;)V", line = 683)
    public final void method2135(class543 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, class543 arg10) {
        field4978++;
        if (~arg5 == arg3 || !this.method1149()) {
            return;
        }
        class155 var12 = arg0.field7967[arg5];
        class251 var13 = var12.field2359;
        class155 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field7967[arg8];
            if (var14.field2359 != var13) {
                var14 = null;
            }
        }
        this.method2133(arg2, var14, var13, arg7, arg3 ^ 0xCB4, arg6, null, arg1, var12, arg4, false, arg9);
        this.method1158();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lrw;[ZLrw;Lrw;IIIIIIIILrw;IZ)V", line = 716)
    public final void method2136(class543 arg0, boolean[] arg1, class543 arg2, class543 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class543 arg12, int arg13, boolean arg14) {
        field4970++;
        if (arg5 == -1) {
            return;
        }
        if (arg1 == null || arg6 == -1) {
            this.method2131(arg9, (byte) -95, 0, arg8, arg4, arg12, arg14, arg3, arg5);
        } else if (this.method1149()) {
            class155 var16 = arg12.field7967[arg5];
            class251 var17 = var16.field2359;
            class155 var18 = null;
            if (arg3 != null) {
                var18 = arg3.field7967[arg9];
                if (var18.field2359 != var17) {
                    var18 = null;
                }
            }
            if (arg10 != 3564) {
                field4979 = 115;
            }
            this.method2133(arg4, var18, var17, arg8, 3252, null, arg1, 65535, var16, arg14, false, 0);
            class155 var19 = arg2.field7967[arg6];
            class155 var20 = null;
            if (arg0 != null) {
                var20 = arg0.field7967[arg7];
                if (var20.field2359 != var17) {
                    var20 = null;
                }
            }
            this.method1134(0, new int[0], 0, 0, 0, 0, arg14);
            this.method2133(arg13, var20, var19.field2359, arg11, 3252, null, arg1, 65535, var19, arg14, true, 0);
            this.method1158();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 775)
    public static void method2137(int arg0) {
        field4972 = null;
        if (arg0 != 0) {
            field4972 = null;
        }
        field4966 = null;
        field4980 = null;
    }

    @OriginalMember(owner = "client!ka", name = "IA", descriptor = "(I)V")
    public abstract void method1140(int arg0);

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(SS)V")
    public abstract void method1163(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "()I")
    public abstract int method1160();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method1162();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILn;Z)Z")
    public abstract boolean method1131(int arg0, int arg1, class15 arg2, boolean arg3);

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "(I)V")
    public abstract void method1135(int arg0);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(Lia;)Lia;")
    public abstract class424 method1171(class424 arg0);

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "(I)V")
    public abstract void method1145(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ln;Lwc;I)V")
    public abstract void method1142(class15 arg0, class48 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1143(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "YA", descriptor = "()V")
    public abstract void method1159();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method1166();

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()I")
    public abstract int method1147();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I[IIIIIZ)V")
    public abstract void method1134(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(IILo;Lo;III)V")
    public abstract void method1165(int arg0, int arg1, class24 arg2, class24 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "(I)V")
    public abstract void method1151(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class336 method1154(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "()I")
    public abstract int method1150();

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "(I)V")
    public abstract void method1170(int arg0);

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "()I")
    public abstract int method1139();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Leh;")
    public abstract class248[] method1172();

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "()I")
    public abstract int method1168();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "(SS)V")
    public abstract void method1138(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "la", descriptor = "(IIII)V")
    public abstract void method1152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method1137();

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "(I)V")
    public abstract void method1169(int arg0);

    @OriginalMember(owner = "client!ka", name = "ha", descriptor = "()V")
    public abstract void method1158();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
    public abstract boolean method1141();

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "(III)V")
    public abstract void method1156(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "()I")
    public abstract int method1164();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method1146(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method1157(class336 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "AA", descriptor = "()Z")
    public abstract boolean method1149();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Ltb;")
    public abstract class280[] method1144();

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "(I)V")
    public abstract void method1133(int arg0);

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "(III)V")
    public abstract void method1167(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ja", descriptor = "()I")
    public abstract int method1130();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ln;Lwc;II)V")
    public abstract void method1153(class15 arg0, class48 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()I")
    public abstract int method1136();
}
