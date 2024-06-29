import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class159 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lh;")
    public static class572 field2361 = new class572("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lada;")
    public static class144 field2367 = new class144(112, -2);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[[I")
    public static int[][] field2371 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[[I")
    public static int[][] field2372;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()[Lia;")
    public abstract class506[] method57();

    @OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
    public abstract void method89(int arg0);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
    public abstract void method79(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lgm;Lgm;ILgm;ZIIII[ZIILgm;II)V")
    public final void method1139(class106 arg0, class106 arg1, int arg2, class106 arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, boolean[] arg9, int arg10, int arg11, class106 arg12, int arg13, int arg14) {
        field2370++;
        if (arg2 == -1) {
            return;
        }
        if (arg9 == null || arg5 == -1) {
            this.method1142(arg1, arg0, arg8, arg10, 0, arg2, -32238, arg13, arg4);
        } else if (this.method71()) {
            if (arg6 > -126) {
                this.method95((short) 39, (short) -59);
            }
            class439 var16 = arg1.field1527[arg2];
            class209 var17 = var16.field5867;
            class439 var18 = null;
            if (arg0 != null) {
                var18 = arg0.field1527[arg10];
                if (var18.field5867 != var17) {
                    var18 = null;
                }
            }
            this.method1146(arg8, var17, -111, false, 65535, var18, null, arg13, arg4, arg9, 0, var16);
            class439 var19 = arg3.field1527[arg5];
            class439 var20 = null;
            if (arg12 != null) {
                var20 = arg12.field1527[arg14];
                if (var20.field5867 != var17) {
                    var20 = null;
                }
            }
            this.method96(0, new int[0], 0, 0, 0, 0, arg4);
            this.method1146(arg11, var19.field5867, -60, true, 65535, var20, null, arg7, arg4, arg9, 0, var19);
            this.method91();
        }
    }

    @OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
    public abstract int method58();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IBII[IIZIII)V")
    private final void method1140(int[] arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg1 != 98) {
            return;
        }
        field2363++;
        if (arg3 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = -arg5;
                arg5 = arg9;
                arg9 = var13;
            } else if (arg8 == 3) {
                int var12 = arg5;
                arg5 = arg9;
                arg9 = var12;
            } else if (arg8 == 2) {
                int var11 = arg5;
                arg5 = -arg9 & 0x3FFF;
                arg9 = var11 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg9 = -arg9;
                arg5 = -arg5;
            } else if (arg8 == 2) {
                arg5 = -arg5 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = arg5;
                arg5 = -arg9;
                arg9 = var16;
            } else if (arg8 == 3) {
                int var15 = arg5;
                arg5 = arg9;
                arg9 = var15;
            } else if (arg8 == 2) {
                int var14 = arg5;
                arg5 = arg9 & 0x3FFF;
                arg9 = -var14 & 0x3FFF;
            }
        }
        if (arg7 == 65535) {
            this.method96(arg8, arg4, arg5, arg2, arg9, arg3, arg6);
        } else {
            this.method64(arg8, arg4, arg5, arg2, arg9, arg6, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
    public abstract void method56(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
    public abstract int method73();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method77(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static void method1141(boolean arg0) {
        field2372 = null;
        if (arg0) {
            field2367 = null;
            field2361 = null;
            field2371 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lgm;Lgm;IIIIIIZ)V")
    public final void method1142(class106 arg0, class106 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field2368++;
        if (arg5 == -1 || !this.method71()) {
            return;
        }
        if (arg6 != -32238) {
            field2369 = 111;
        }
        class439 var10 = arg0.field1527[arg5];
        class209 var11 = var10.field5867;
        class439 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field1527[arg3];
            if (var12.field5867 != var11) {
                var12 = null;
            }
        }
        this.method1146(arg2, var11, -102, false, 65535, var12, null, arg7, arg8, null, arg4, var10);
        this.method91();
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()[Llh;")
    public abstract class450[] method60();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method70(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lpr;II)V")
    public abstract void method74(class165 arg0, class381 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILgm;I[IIILgm;IZZI)V")
    public final void method1143(int arg0, class106 arg1, int arg2, int[] arg3, int arg4, int arg5, class106 arg6, int arg7, boolean arg8, boolean arg9, int arg10) {
        field2366++;
        if (arg10 == -1 || !this.method71()) {
            return;
        }
        class439 var12 = arg1.field1527[arg10];
        class209 var13 = var12.field5867;
        class439 var14 = null;
        if (arg6 != null) {
            var14 = arg6.field1527[arg2];
            if (var14.field5867 != var13) {
                var14 = null;
            }
        }
        if (!arg9) {
            this.method86();
        }
        this.method1146(arg7, var13, -47, false, arg0, var14, arg3, arg5, arg8, null, arg4, var12);
        this.method91();
    }

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
    public abstract void method91();

    @OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public abstract void method69(int arg0, int arg1, class176 arg2, class176 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
    public abstract void method96(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method75(int arg0);

    @OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
    public abstract boolean method71();

    @OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
    public abstract int method86();

    @OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
    public abstract void method87(int arg0);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
    public abstract int method88();

    @OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lk;)Lk;")
    public abstract class485 method92(class485 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILgm;I)V")
    public final void method1144(int arg0, class106 arg1, int arg2) {
        field2365++;
        if (arg2 == -1 || !this.method71()) {
            return;
        }
        class439 var4 = arg1.field1527[arg2];
        class209 var5 = var4.field5867;
        int var6 = 0;
        if (arg0 != 19258) {
            field2369 = -22;
        }
        while (var4.field5857 > var6) {
            short var7 = var4.field5871[var6];
            if (var5.field3094[var7]) {
                if (var4.field5861[var6] != -1) {
                    this.method56(0, 0, 0, 0);
                }
                this.method56(var5.field3099[var7], var4.field5863[var6], var4.field5859[var6], var4.field5864[var6]);
            }
            var6++;
        }
        this.method91();
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
    public abstract boolean method54();

    @OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
    public abstract void method82(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
    public abstract int method53();

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
    public abstract void method76(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILm;Z)Z")
    public abstract boolean method72(int arg0, int arg1, class165 arg2, boolean arg3);

    @OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
    public abstract void method61(int arg0);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method68();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lpr;I)V")
    public abstract void method93(class165 arg0, class381 arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
    public abstract int method85();

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
    public abstract void method95(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
    public abstract int method62();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public abstract void method55();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lr;")
    public abstract class159 method94(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhf;I[[B)V")
    public static final void method1145(class335 arg0, int arg1, byte[][] arg2) {
        field2362++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class148 var11 = new class148(var10);
                int var12 = class340.field4706[var5] >> 8;
                int var13 = class340.field4706[var5] & 0xFF;
                int var14 = var12 * 64 - class473.field6687;
                int var15 = var13 * 64 - class38.field463;
                class539.method3268(5);
                arg0.method1858(class38.field463, var15, class473.field6687, class127.field1774, true, var11, var14);
                arg0.method2048(-27786, class99.field1445, var3, var14, var15, var11);
                if (!arg0.field4139 && class188.field2802 / 8 == var12 && class291.field4029 / 8 == var13 && var3[0] != -1) {
                    class212.field3123 = class97.field1414.method3019(var3[0], var3[3], class351.field4786, var3[1], var3[2], (byte) 115);
                    class2.field8 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class340.field4706[var6] >> 8) * 64 - class473.field6687;
            int var8 = (class340.field4706[var6] & 0xFF) * 64 - class38.field463;
            byte[] var9 = arg2[var6];
            if (var9 == null && class291.field4029 < 800) {
                class539.method3268(5);
                arg0.method1855(64, var7, 64, -13111, var8);
            }
        }
        if (arg1 <= 115) {
            field2372 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
    public abstract void method80(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
    public abstract int method81();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILkw;IZILuca;[IIZ[ZILuca;)V")
    private final void method1146(int arg0, class209 arg1, int arg2, boolean arg3, int arg4, class439 arg5, int[] arg6, int arg7, boolean arg8, boolean[] arg9, int arg10, class439 arg11) {
        field2360++;
        if (arg5 == null || arg7 == 0) {
            for (int var38 = 0; var38 < arg11.field5857; var38++) {
                short var39 = arg11.field5871[var38];
                if (arg9 == null || arg3 == arg9[var39] || arg1.field3099[var39] == 0) {
                    short var40 = arg11.field5861[var38];
                    if (var40 != -1) {
                        this.method1140(arg6, (byte) 98, 0, arg10, arg1.field3100[var40], 0, arg8, arg4 & arg1.field3097[var40], 0, 0);
                    }
                    this.method1140(arg6, (byte) 98, arg11.field5859[var38], arg10, arg1.field3100[var39], arg11.field5863[var38], arg8, arg1.field3097[var39] & arg4, arg1.field3099[var39], arg11.field5864[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg2 >= -36) {
            field2361 = null;
        }
        while (arg1.field3096 > var15) {
            boolean var16 = false;
            if (arg11.field5857 > var13 && arg11.field5871[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg5.field5857 > var14 && arg5.field5871[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg9 == null || arg9[var15] == arg3 || arg1.field3099[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg1.field3099[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg11.field5868[var13];
                        var21 = arg11.field5861[var13];
                        var22 = arg11.field5863[var13];
                        var23 = arg11.field5859[var13];
                        var24 = arg11.field5864[var13];
                        var13++;
                    } else {
                        var23 = var18;
                        var20 = 0;
                        var22 = var18;
                        var21 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg5.field5861[var14];
                        var26 = arg5.field5864[var14];
                        var27 = arg5.field5868[var14];
                        var28 = arg5.field5863[var14];
                        var29 = arg5.field5859[var14];
                        var14++;
                    } else {
                        var28 = var18;
                        var25 = -1;
                        var27 = 0;
                        var29 = var18;
                        var26 = var18;
                    }
                    if (var21 != -1) {
                        this.method1140(arg6, (byte) 98, 0, arg10, arg1.field3100[var21], 0, arg8, arg1.field3097[var21] & arg4, 0, 0);
                    } else if (var25 != -1) {
                        this.method1140(arg6, (byte) 98, 0, arg10, arg1.field3100[var25], 0, arg8, arg1.field3097[var25] & arg4, 0, 0);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var20 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var32 = var23;
                        var33 = var22;
                        var31 = var24;
                    } else if (var19 == 2) {
                        int var35 = var28 - var22 & 0x3FFF;
                        int var36 = var29 - var23 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var26 - var24 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var32 = arg7 * var36 / arg0 + var23 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg7 * var35 / arg0 + var22 & 0x3FFF;
                        var31 = arg7 * var37 / arg0 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var28 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = arg7 * var30 / arg0 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var28 - var22 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var32 = var23 + ((var29 - var23) * arg7 / arg0);
                        var31 = (var26 - var24) * arg7 / arg0 + var24;
                        var33 = arg7 * var34 / arg0 + var22 & 0x3F;
                    } else {
                        var33 = (var28 - var22) * arg7 / arg0 + var22;
                        var32 = (var29 - var23) * arg7 / arg0 + var23;
                        var31 = (var26 - var24) * arg7 / arg0 + var24;
                    }
                    this.method1140(arg6, (byte) 98, var32, arg10, arg1.field3100[var15], var33, arg8, arg4 & arg1.field3097[var15], var19, var31);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lr;IIIZ)V")
    public abstract void method78(class159 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
    public abstract int method90();

    @OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
    public abstract void method67();

    @OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
    public abstract void method84(int arg0);

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public abstract void method64(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBIIIILsa;I)V")
    public final void method1147(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class176 arg7, int arg8) {
        field2364++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg1 / 2;
        int var14 = -arg0 / 2;
        int var15 = arg7.method1233(arg3 + var13, arg8 + var14);
        int var16 = arg1 / 2;
        int var17 = -arg0 / 2;
        int var18 = arg7.method1233(arg3 + var16, arg8 - -var17);
        int var19 = -arg1 / 2;
        int var20 = arg0 / 2;
        int var21 = arg7.method1233(arg3 + var19, arg8 + var20);
        int var22 = arg1 / 2;
        int var23 = arg0 / 2;
        int var24 = arg7.method1233(arg3 + var22, arg8 + var23);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        if (arg0 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg4 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg4;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg4) {
                        var28 = arg4;
                    }
                }
                this.method84(var28);
            }
        }
        int var30 = var15 < var21 ? var15 : var21;
        if (arg1 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg5 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg5;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg5) {
                        var31 = arg5;
                    }
                }
                this.method77(var31);
            }
        }
        int var33 = var15 + var24;
        if ((var18 + var21) < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg6;
        if (var34 != 0) {
            this.method82(0, var34, 0);
        }
        int var35 = 56 / ((arg2 - 45) / 39);
    }

    static {
        new class572("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field2372 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
    }
}
