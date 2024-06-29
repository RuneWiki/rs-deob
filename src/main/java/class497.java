import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class497 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Z")
    public boolean field6980 = false;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "[I")
    public static int[] field6986 = new int[2048];

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Ljb;")
    public static class519 field6987 = new class519(123, 10);

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Lqj;")
    public static class535 field6990 = new class535(30);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
    public abstract boolean method255();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method280();

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method285();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method287(class497 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method246();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lal;)V")
    public abstract void method259(class109 arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method269();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method278(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method260();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method294(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method264();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method266(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method265();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLvg;ZLcea;II[ZIZLvg;I[I)V")
    private final void method2915(boolean arg0, class60 arg1, boolean arg2, class226 arg3, int arg4, int arg5, boolean[] arg6, int arg7, boolean arg8, class60 arg9, int arg10, int[] arg11) {
        field6978++;
        if (arg1 == null || arg4 == 0) {
            for (int var38 = 0; var38 < arg9.field766; var38++) {
                short var39 = arg9.field768[var38];
                if (arg6 == null || arg8 == arg6[var39] || arg3.field2928[var39] == 0) {
                    short var40 = arg9.field772[var38];
                    if (var40 != -1) {
                        this.method2917(arg0, 0, true, arg3.field2924[var40], 0, arg11, arg5, 0, arg10 & arg3.field2927[var40], 0);
                    }
                    this.method2917(arg0, arg9.field776[var38], true, arg3.field2924[var39], arg3.field2928[var39], arg11, arg5, arg9.field765[var38], arg3.field2927[var39] & arg10, arg9.field774[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (!arg2) {
            return;
        }
        for (int var15 = 0; var15 < arg3.field2921; var15++) {
            boolean var16 = false;
            if (arg9.field766 > var13 && arg9.field768[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg1.field766 && arg1.field768[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg6 == null || arg8 == arg6[var15] || arg3.field2928[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg3.field2928[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var22 = arg9.field774[var13];
                        var20 = arg9.field780[var13];
                        var24 = arg9.field776[var13];
                        var21 = arg9.field765[var13];
                        var23 = arg9.field772[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = var18;
                        var22 = var18;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var25 = arg1.field774[var14];
                        var26 = arg1.field772[var14];
                        var27 = arg1.field776[var14];
                        var28 = arg1.field780[var14];
                        var29 = arg1.field765[var14];
                        var14++;
                    } else {
                        var29 = var18;
                        var25 = var18;
                        var26 = -1;
                        var27 = var18;
                        var28 = 0;
                    }
                    if (var23 != -1) {
                        this.method2917(arg0, 0, true, arg3.field2924[var23], 0, arg11, arg5, 0, arg3.field2927[var23] & arg10, 0);
                    } else if (var26 != -1) {
                        this.method2917(arg0, 0, true, arg3.field2924[var26], 0, arg11, arg5, 0, arg3.field2927[var26] & arg10, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var20 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var35 = var24;
                        var34 = var21;
                        var33 = var22;
                    } else if (var19 == 2) {
                        int var30 = var29 - var21 & 0x3FFF;
                        int var31 = var25 - var22 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var27 - var24 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg4 * var31 / arg7 + var22 & 0x3FFF;
                        var34 = var21 + (arg4 * var30 / arg7) & 0x3FFF;
                        var35 = var24 + (arg4 * var32 / arg7) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var29 - var21 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var35 = 0;
                        var33 = 0;
                        var34 = var21 + (arg4 * var37 / arg7) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var29 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var34 = arg4 * var36 / arg7 + var21 & 0x3F;
                        var35 = (var27 - var24) * arg4 / arg7 + var24;
                        var33 = var22 + ((var25 - var22) * arg4 / arg7);
                    } else {
                        var33 = (var25 - var22) * arg4 / arg7 + var22;
                        var35 = (var27 - var24) * arg4 / arg7 + var24;
                        var34 = (var29 - var21) * arg4 / arg7 + var21;
                    }
                    this.method2917(arg0, var35, true, arg3.field2924[var15], var19, arg11, arg5, var34, arg3.field2927[var15] & arg10, var33);
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
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method279(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method293(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lal;IZ)V")
    public abstract void method261(class109 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method290(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lha;I)V")
    public static final void method2916(class66 arg0, int arg1) {
        field6983++;
        if (class514.field7151 == class625.field8475.field2813 || class443.field6387 == null) {
            return;
        }
        if (arg1 != 1177) {
            method2918(-7, 126, -75, 74, 8, 116, -73, 73, -7, (byte) 64);
        }
        if (class456.method2710(arg0, 4, class625.field8475.field2813)) {
            class514.field7151 = class625.field8475.field2813;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIZ[II[IIIII)V")
    private final void method2917(boolean arg0, int arg1, boolean arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg2) {
            return;
        }
        field6989++;
        if (arg6 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = -arg7;
                arg7 = arg1;
                arg1 = var16;
            } else if (arg4 == 3) {
                int var15 = arg7;
                arg7 = arg1;
                arg1 = var15;
            } else if (arg4 == 2) {
                int var14 = arg7;
                arg7 = -arg1 & 0x3FFF;
                arg1 = var14 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg7 = -arg7;
                arg1 = -arg1;
            } else if (arg4 == 2) {
                arg7 = -arg7 & 0x3FFF;
                arg1 = -arg1 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = arg7;
                arg7 = -arg1;
                arg1 = var13;
            } else if (arg4 == 3) {
                int var11 = arg7;
                arg7 = arg1;
                arg1 = var11;
            } else if (arg4 == 2) {
                int var12 = arg7;
                arg7 = arg1 & 0x3FFF;
                arg1 = -var12 & 0x3FFF;
            }
        }
        if (arg8 == 65535) {
            this.method247(arg4, arg3, arg7, arg9, arg1, arg6, arg0);
        } else {
            this.method282(arg4, arg3, arg7, arg9, arg1, arg0, arg8, arg5);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method2918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field6988++;
        if (arg6 < 512 || arg5 < 512 || arg6 > (class102.field1467 - 2) * 512 || arg5 > (class393.field5663 - 2) * 512) {
            class548.field7567[0] = class548.field7567[1] = -1;
            return;
        }
        int var10 = -81 % ((-arg9 - 37) / 38);
        int var11 = class778.method4273(arg5, (byte) -73, arg6, arg3) - arg2;
        if (class24.field246) {
            class305.method1973(true, (byte) 77);
        } else {
            class33.field312.method818(arg8, 0, 0);
            class375.field5490.method509(class33.field312);
        }
        if (class408.field5786) {
            class375.field5490.method491(arg6, var11, arg5, class72.field972, class548.field7567);
        } else {
            class375.field5490.method530(arg6, var11, arg5, class548.field7567);
        }
        if (class24.field246) {
            class30.method173(21072);
        } else {
            class33.field312.method818(-arg8, 0, 0);
            class375.field5490.method509(class33.field312);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILbea;ZILbea;I)V")
    public final void method2919(int arg0, int arg1, int arg2, int arg3, class236 arg4, boolean arg5, int arg6, class236 arg7, int arg8) {
        field6985++;
        if (arg1 == -1) {
            return;
        }
        if (arg8 != 10) {
            field6987 = null;
        }
        this.method269();
        if (!this.method292()) {
            this.method286();
            return;
        }
        class60 var10 = arg7.field3141[arg1];
        class226 var11 = var10.field764;
        class60 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field3141[arg3];
            if (var12.field764 != var11) {
                var12 = null;
            }
        }
        this.method2915(arg5, var12, true, var11, arg6, arg0, null, arg2, false, var10, 65535, null);
        this.method268();
        this.method286();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lal;Lju;I)V")
    public abstract void method254(class109 arg0, class136 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class497 method271(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method286();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method281(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method273();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class195 method289(class195 arg0);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method284(int arg0);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method267(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILbea;ILbea;[ZIBILbea;Lbea;ZI)V")
    public final void method2920(int arg0, int arg1, int arg2, int arg3, class236 arg4, int arg5, class236 arg6, boolean[] arg7, int arg8, byte arg9, int arg10, class236 arg11, class236 arg12, boolean arg13, int arg14) {
        field6982++;
        if (arg10 == -1) {
            return;
        }
        if (arg7 == null || arg0 == -1) {
            this.method2919(0, arg10, arg8, arg3, arg6, arg13, arg5, arg4, 10);
            return;
        }
        this.method269();
        if (!this.method292()) {
            this.method286();
            return;
        }
        class60 var16 = arg4.field3141[arg10];
        class226 var17 = var16.field764;
        class60 var18 = null;
        if (arg6 != null) {
            var18 = arg6.field3141[arg3];
            if (var18.field764 != var17) {
                var18 = null;
            }
        }
        this.method2915(arg13, var18, true, var17, arg5, 0, arg7, arg8, false, var16, 65535, null);
        class60 var19 = arg11.field3141[arg0];
        class60 var20 = null;
        if (arg12 != null) {
            var20 = arg12.field3141[arg1];
            if (var20.field764 != var17) {
                var20 = null;
            }
        }
        if (arg9 <= -67) {
            this.method247(0, new int[0], 0, 0, 0, 0, arg13);
            this.method2915(arg13, var20, true, var19.field764, arg14, 0, arg7, arg2, true, var19, 65535, null);
            this.method268();
            this.method286();
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lrea;")
    public abstract class220[] method283();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILal;ZII)Z")
    public abstract boolean method245(int arg0, int arg1, class109 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbea;IB)V")
    public final void method2921(class236 arg0, int arg1, byte arg2) {
        field6984++;
        if (arg1 == -1) {
            return;
        }
        this.method269();
        if (!this.method292()) {
            this.method286();
            return;
        }
        class60 var4 = arg0.field3141[arg1];
        class226 var5 = var4.field764;
        for (int var6 = 0; var6 < var4.field766; var6++) {
            short var7 = var4.field768[var6];
            if (var5.field2926[var7]) {
                if (var4.field772[var6] != -1) {
                    this.method253(0, 0, 0, 0);
                }
                this.method253(var5.field2928[var7], var4.field765[var6], var4.field774[var6], var4.field776[var6]);
            }
        }
        if (arg2 != 13) {
            this.method283();
        }
        this.method268();
        this.method286();
    }

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method272();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method291();

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method262();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method288();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method253(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILs;IIIII)V")
    public final void method2922(int arg0, int arg1, int arg2, class295 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6991++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg8 / 2;
        int var14 = -arg1 / 2;
        int var15 = arg3.method1895(arg0 + var13, arg2 - -var14, arg6 ^ 0x53);
        int var16 = arg8 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg3.method1895(arg0 + var16, arg2 + var17, 75);
        int var19 = -arg8 / 2;
        int var20 = arg1 / 2;
        int var21 = arg3.method1895(arg0 + var19, arg2 - -var20, 77);
        int var22 = arg8 / 2;
        int var23 = arg1 / 2;
        int var24 = arg3.method1895(arg0 + var22, arg2 - -var23, 71);
        int var25 = var15 >= var18 ? var18 : var15;
        if (arg6 != 10) {
            this.method284(46);
        }
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        if (arg1 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
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
                this.method293(var28);
            }
        }
        int var30 = var21 > var15 ? var15 : var21;
        int var31 = var15 + var24;
        if (arg8 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg7 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg7;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg7 < var32) {
                        var32 = arg7;
                    }
                }
                this.method290(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg5;
        if (var34 != 0) {
            this.method266(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method252();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILbea;[IIILbea;ZI)V")
    public final void method2923(int arg0, int arg1, int arg2, int arg3, class236 arg4, int[] arg5, int arg6, int arg7, class236 arg8, boolean arg9, int arg10) {
        field6981++;
        if (arg1 == -1) {
            return;
        }
        this.method269();
        if (!this.method292()) {
            this.method286();
            return;
        }
        class60 var12 = arg4.field3141[arg1];
        if (arg6 >= -103) {
            field6986 = null;
        }
        class226 var13 = var12.field764;
        class60 var14 = null;
        if (arg8 != null) {
            var14 = arg8.field3141[arg10];
            if (var14.field764 != var13) {
                var14 = null;
            }
        }
        this.method2915(arg9, var14, true, var13, arg0, arg7, null, arg3, false, var12, arg2, arg5);
        this.method268();
        this.method286();
    }

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method268();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method282(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method292();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILal;ZI)Z")
    public abstract boolean method248(int arg0, int arg1, class109 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method295(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lvja;")
    public abstract class290[] method263();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method2924(int arg0) {
        field6987 = null;
        field6990 = null;
        field6986 = null;
        if (arg0 < 27) {
            field6986 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method277();

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method250();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lal;Lju;II)V")
    public abstract void method258(class109 arg0, class136 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method244(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method256(int arg0);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method274();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method247(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
