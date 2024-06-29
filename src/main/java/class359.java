import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class359 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[I[ZIBILpi;ZILsm;ZLsm;)V", line = 5)
    private final void method2047(int arg0, int[] arg1, boolean[] arg2, int arg3, byte arg4, int arg5, class465 arg6, boolean arg7, int arg8, class264 arg9, boolean arg10, class264 arg11) {
        field4619++;
        if (arg11 == null || arg0 == 0) {
            for (int var38 = 0; var38 < arg9.field3337; var38++) {
                short var39 = arg9.field3339[var38];
                if (arg2 == null || arg2[var39] == arg10 || arg6.field5766[var39] == 0) {
                    short var40 = arg9.field3329[var38];
                    if (var40 != -1) {
                        this.method2087(arg5, arg7, -4, 0, arg6.field5771[var40], arg1, 0, arg8 & arg6.field5765[var40], 0, 0);
                    }
                    this.method2087(arg5, arg7, -4, arg9.field3336[var38], arg6.field5771[var39], arg1, arg9.field3323[var38], arg8 & arg6.field5765[var39], arg9.field3338[var38], arg6.field5766[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg4 <= 87) {
            return;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg6.field5768; var15++) {
            boolean var16 = false;
            if (arg9.field3337 > var13 && arg9.field3339[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg11.field3337 > var14 && arg11.field3339[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg2 == null || arg10 == arg2[var15] || arg6.field5766[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg6.field5766[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg9.field3338[var13];
                        var21 = arg9.field3329[var13];
                        var22 = arg9.field3325[var13];
                        var23 = arg9.field3336[var13];
                        var24 = arg9.field3323[var13];
                        var13++;
                    } else {
                        var22 = 0;
                        var23 = var18;
                        var24 = var18;
                        var20 = var18;
                        var21 = -1;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg11.field3336[var14];
                        var26 = arg11.field3329[var14];
                        var27 = arg11.field3325[var14];
                        var28 = arg11.field3323[var14];
                        var29 = arg11.field3338[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = -1;
                        var28 = var18;
                        var29 = var18;
                        var27 = 0;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var34 = var24;
                        var35 = var23;
                        var33 = var20;
                    } else if (var19 == 2) {
                        int var30 = var28 - var24 & 0x3FFF;
                        int var31 = var29 - var20 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var25 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = arg0 * var31 / arg3 + var20 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg0 * var30 / arg3 + var24 & 0x3FFF;
                        var35 = arg0 * var32 / arg3 + var23 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var28 - var24 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var35 = 0;
                        var33 = 0;
                        var34 = arg0 * var37 / arg3 + var24 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var28 - var24 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var25 - var23) * arg0 / arg3 + var23;
                        var33 = (var29 - var20) * arg0 / arg3 + var20;
                        var34 = arg0 * var36 / arg3 + var24 & 0x3F;
                    } else {
                        var35 = (var25 - var23) * arg0 / arg3 + var23;
                        var34 = (var28 - var24) * arg0 / arg3 + var24;
                        var33 = (var29 - var20) * arg0 / arg3 + var20;
                    }
                    if (var21 != -1) {
                        this.method2087(arg5, arg7, -4, 0, arg6.field5771[var21], arg1, 0, arg6.field5765[var21] & arg8, 0, 0);
                    } else if (var26 != -1) {
                        this.method2087(arg5, arg7, -4, 0, arg6.field5771[var26], arg1, 0, arg6.field5765[var26] & arg8, 0, 0);
                    }
                    this.method2087(arg5, arg7, -4, var35, arg6.field5771[var15], arg1, var34, arg8 & arg6.field5765[var15], var33, var19);
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

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBLtn;)V", line = 219)
    public final void method2051(int arg0, byte arg1, class81 arg2) {
        field4616++;
        if (arg0 == -1 || !this.method2091()) {
            return;
        }
        class264 var4 = arg2.field1045[arg0];
        class465 var5 = var4.field3327;
        for (int var6 = 0; var6 < var4.field3337; var6++) {
            short var7 = var4.field3339[var6];
            if (var5.field5764[var7]) {
                if (var4.field3329[var6] != -1) {
                    this.method2076(0, 0, 0, 0);
                }
                this.method2076(var5.field5766[var7], var4.field3323[var6], var4.field3338[var6], var4.field3336[var6]);
            }
        }
        if (arg1 != -11) {
            this.method2077();
        }
        this.method2056();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ltn;ZIIILtn;III)V", line = 278)
    public final void method2065(class81 arg0, boolean arg1, int arg2, int arg3, int arg4, class81 arg5, int arg6, int arg7, int arg8) {
        field4614++;
        if (arg4 == -1 || !this.method2091()) {
            return;
        }
        if (arg8 >= -82) {
            this.method2068();
        }
        class264 var10 = arg0.field1045[arg4];
        class465 var11 = var10.field3327;
        class264 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field1045[arg2];
            if (var12.field3327 != var11) {
                var12 = null;
            }
        }
        this.method2047(arg6, null, null, arg3, (byte) 101, arg7, var11, arg1, 65535, var10, false, var12);
        this.method2056();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ltn;ZLtn;Ltn;IZII[ZIIIIILtn;)V", line = 325)
    public final void method2073(class81 arg0, boolean arg1, class81 arg2, class81 arg3, int arg4, boolean arg5, int arg6, int arg7, boolean[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class81 arg14) {
        field4617++;
        if (arg11 == -1) {
            return;
        }
        if (arg8 == null || arg7 == -1) {
            this.method2065(arg0, arg1, arg4, arg6, arg11, arg3, arg9, 0, -105);
        } else if (this.method2091()) {
            class264 var16 = arg0.field1045[arg11];
            class465 var17 = var16.field3327;
            class264 var18 = null;
            if (arg3 != null) {
                var18 = arg3.field1045[arg4];
                if (var18.field3327 != var17) {
                    var18 = null;
                }
            }
            this.method2047(arg9, null, arg8, arg6, (byte) 111, 0, var17, arg1, 65535, var16, arg5, var18);
            class264 var19 = arg14.field1045[arg7];
            class264 var20 = null;
            if (arg2 != null) {
                var20 = arg2.field1045[arg12];
                if (var20.field3327 != var17) {
                    var20 = null;
                }
            }
            this.method2081(0, new int[0], 0, 0, 0, 0, arg1);
            this.method2047(arg10, null, arg8, arg13, (byte) 110, 0, var19.field3327, arg1, 65535, var19, true, var20);
            this.method2056();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([ILtn;IIIIIZLtn;II)V", line = 386)
    public final void method2078(int[] arg0, class81 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class81 arg8, int arg9, int arg10) {
        field4615++;
        if (arg2 == -1 || !this.method2091()) {
            return;
        }
        class264 var12 = arg1.field1045[arg2];
        class465 var13 = var12.field3327;
        if (arg9 > -34) {
            this.method2055(null);
        }
        class264 var14 = null;
        if (arg8 != null) {
            var14 = arg8.field1045[arg10];
            if (var14.field3327 != var13) {
                var14 = null;
            }
        }
        this.method2047(arg6, arg0, null, arg5, (byte) 125, arg4, var13, arg7, arg3, var12, false, var14);
        this.method2056();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIIILd;III)V", line = 426)
    public final void method2082(int arg0, byte arg1, int arg2, int arg3, int arg4, class140 arg5, int arg6, int arg7, int arg8) {
        field4613++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg3 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg5.method194(arg8 + var13, arg7 + var14);
        int var16 = arg3 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg5.method194(arg8 + var16, arg7 + var17);
        int var19 = -arg3 / 2;
        int var20 = arg2 / 2;
        int var21 = arg5.method194(arg8 + var19, arg7 + var20);
        int var22 = arg3 / 2;
        int var23 = arg2 / 2;
        int var24 = arg5.method194(arg8 + var22, arg7 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = 43 % ((-arg1 - 63) / 42);
        int var28 = var24 <= var18 ? var24 : var18;
        if (arg2 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg0 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg0;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg0) {
                        var29 = arg0;
                    }
                }
                this.method2083(var29);
            }
        }
        int var31 = var15 < var21 ? var15 : var21;
        int var32 = var15 + var24;
        if (arg3 != 0) {
            int var33 = (int) (Math.atan2((double) (var31 - var28), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var33 != 0) {
                if (arg6 != 0) {
                    if (var33 > 8192) {
                        int var34 = 16384 - arg6;
                        if (var33 < var34) {
                            var33 = var34;
                        }
                    } else if (var33 > arg6) {
                        var33 = arg6;
                    }
                }
                this.method2070(var33);
            }
        }
        if (var32 > (var18 + var21)) {
            var32 = var18 + var21;
        }
        int var35 = (var32 >> 1) - arg4;
        if (var35 != 0) {
            this.method2066(0, var35, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZII[I[IIIII)V", line = 550)
    private final void method2087(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field4618++;
        if (arg2 != -4) {
            return;
        }
        if (arg0 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = -arg6;
                arg6 = arg3;
                arg3 = var16;
            } else if (arg9 == 3) {
                int var14 = arg6;
                arg6 = arg3;
                arg3 = var14;
            } else if (arg9 == 2) {
                int var15 = arg6;
                arg6 = -arg3 & 0x3FFF;
                arg3 = var15 & 0x3FFF;
            }
        } else if (arg0 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg3 = -arg3;
                arg6 = -arg6;
            } else if (arg9 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg0 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = arg6;
                arg6 = -arg3;
                arg3 = var13;
            } else if (arg9 == 3) {
                int var12 = arg6;
                arg6 = arg3;
                arg3 = var12;
            } else if (arg9 == 2) {
                int var11 = arg6;
                arg6 = arg3 & 0x3FFF;
                arg3 = -var11 & 0x3FFF;
            }
        }
        if (arg7 == 65535) {
            this.method2081(arg9, arg4, arg6, arg8, arg3, arg0, arg1);
        } else {
            this.method2050(arg9, arg4, arg6, arg8, arg3, arg1, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()Z")
    public abstract boolean method2046();

    @OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
    public abstract void method2048(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lpo;I)V")
    public abstract void method2049(class396 arg0, class524 arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
    public abstract void method2050(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
    public abstract void method2052();

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
    public abstract void method2053(int arg0);

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
    public abstract int method2054();

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lw;)Lw;")
    public abstract class279 method2055(class279 arg0);

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
    public abstract void method2056();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lba;IIIZ)V")
    public abstract void method2057(class359 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
    public abstract void method2058(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lpo;II)V")
    public abstract void method2059(class396 arg0, class524 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public abstract void method2060(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
    public abstract int method2061();

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
    public abstract int method2062();

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()[Lfd;")
    public abstract class493[] method2063();

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
    public abstract int method2064();

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
    public abstract void method2066(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;)V")
    public abstract void method2067(class396 arg0);

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
    public abstract int method2068();

    @OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
    public abstract void method2069(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lba;")
    public abstract class359 method951(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
    public abstract void method2070(int arg0);

    @OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
    public abstract int method2071();

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
    public abstract void method2072(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method2074(int arg0, int arg1, class396 arg2, boolean arg3);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
    public abstract int method2075();

    @OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
    public abstract void method2076(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()[Let;")
    public abstract class556[] method2077();

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
    public abstract void method2079(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
    public abstract void method2080(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
    public abstract void method2081(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
    public abstract void method2083(int arg0);

    @OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
    public abstract int method2084();

    @OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
    public abstract int method2085();

    @OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILd;Ld;III)V")
    public abstract void method2086(int arg0, int arg1, class140 arg2, class140 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
    public abstract void method2088(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
    public abstract int method2089();

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()V")
    public abstract void method2090();

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
    public abstract boolean method2091();
}
