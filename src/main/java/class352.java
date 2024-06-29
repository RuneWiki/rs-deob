import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class352 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    public static int[] field5057 = new int[6];

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "[Lrs;")
    public static class597[] field5059 = new class597[14];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field5054 = 1;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
    public abstract void method224(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()[Lbh;")
    public abstract class34[] method221();

    @OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
    public abstract void method208(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public abstract void method186(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
    public abstract int method227();

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
    public abstract void method238(int arg0);

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
    public abstract int method198();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILrs;IIBZIIILrs;[I)V")
    public final void method2085(int arg0, class597 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8, class597 arg9, int[] arg10) {
        field5063++;
        if (arg0 == -1 || !this.method210()) {
            return;
        }
        class204 var12 = arg9.field8290[arg0];
        if (arg4 != 122) {
            field5054 = 33;
        }
        class466 var13 = var12.field3000;
        class204 var14 = null;
        if (arg1 != null) {
            var14 = arg1.field8290[arg2];
            if (var14.field3000 != var13) {
                var14 = null;
            }
        }
        this.method2089(arg6, arg3, null, var12, arg5, arg7, arg10, var14, arg4 + 16261, var13, false, arg8);
        this.method232();
    }

    @OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILd;Ld;III)V")
    public abstract void method187(int arg0, int arg1, class136 arg2, class136 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method237(int arg0, int arg1, class391 arg2, boolean arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lrs;IIILrs;I[ZIZLrs;Lrs;IZII)V")
    public final void method2086(class597 arg0, int arg1, int arg2, int arg3, class597 arg4, int arg5, boolean[] arg6, int arg7, boolean arg8, class597 arg9, class597 arg10, int arg11, boolean arg12, int arg13, int arg14) {
        field5064++;
        if (arg2 == -1) {
            return;
        }
        if (arg6 == null || arg1 == -1) {
            this.method2090(arg3, arg2, arg8, arg5, 0, arg0, arg13, 16383, arg9);
        } else if (this.method210()) {
            class204 var16 = arg9.field8290[arg2];
            class466 var17 = var16.field3000;
            class204 var18 = null;
            if (arg0 != null) {
                var18 = arg0.field8290[arg5];
                if (var18.field3000 != var17) {
                    var18 = null;
                }
            }
            this.method2089(0, arg3, arg6, var16, arg8, 65535, null, var18, 16383, var17, arg12, arg13);
            class204 var19 = arg4.field8290[arg1];
            class204 var20 = null;
            if (arg10 != null) {
                var20 = arg10.field8290[arg11];
                if (var20.field3000 != var17) {
                    var20 = null;
                }
            }
            this.method202(0, new int[0], 0, 0, 0, 0, arg8);
            this.method2089(0, arg14, arg6, var19, arg8, 65535, null, var20, 16383, var19.field3000, true, arg7);
            this.method232();
        }
    }

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
    public abstract int method229();

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
    public abstract void method193();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;)V")
    public abstract void method211(class391 arg0);

    @OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
    public abstract void method233(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lba;IIIZ)V")
    public abstract void method230(class352 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
    public abstract void method223(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I")
    public static final int method2087(int arg0, int arg1) {
        field5055++;
        if (arg0 != -20675) {
            field5054 = 18;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
    public abstract int method219();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[IBII[IIZII)V")
    private final void method2088(int arg0, int[] arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field5058++;
        if (arg3 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = -arg4;
                arg4 = arg9;
                arg9 = var13;
            } else if (arg8 == 3) {
                int var11 = arg4;
                arg4 = arg9;
                arg9 = var11;
            } else if (arg8 == 2) {
                int var12 = arg4;
                arg4 = -arg9 & 0x3FFF;
                arg9 = var12 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg4 = -arg4;
                arg9 = -arg9;
            } else if (arg8 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = arg4;
                arg4 = -arg9;
                arg9 = var16;
            } else if (arg8 == 3) {
                int var15 = arg4;
                arg4 = arg9;
                arg9 = var15;
            } else if (arg8 == 2) {
                int var14 = arg4;
                arg4 = arg9 & 0x3FFF;
                arg9 = -var14 & 0x3FFF;
            }
        }
        if (arg6 == 65535) {
            this.method202(arg8, arg5, arg4, arg0, arg9, arg3, arg7);
        } else {
            this.method207(arg8, arg5, arg4, arg0, arg9, arg7, arg6, arg1);
        }
        if (arg2 != -127) {
            field5054 = -61;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lrc;II)V")
    public abstract void method199(class391 arg0, class494 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lrc;I)V")
    public abstract void method205(class391 arg0, class494 arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[ZLqb;ZI[ILqb;ILod;ZI)V")
    private final void method2089(int arg0, int arg1, boolean[] arg2, class204 arg3, boolean arg4, int arg5, int[] arg6, class204 arg7, int arg8, class466 arg9, boolean arg10, int arg11) {
        field5062++;
        if (arg7 == null || arg1 == 0) {
            for (int var38 = 0; var38 < arg3.field2993; var38++) {
                short var39 = arg3.field3002[var38];
                if (arg2 == null || arg10 == arg2[var39] || arg9.field6549[var39] == 0) {
                    short var40 = arg3.field2995[var38];
                    if (var40 != -1) {
                        this.method2088(0, arg6, (byte) -127, arg0, 0, arg9.field6548[var40], arg9.field6551[var40] & arg5, arg4, 0, 0);
                    }
                    this.method2088(arg3.field3004[var38], arg6, (byte) -127, arg0, arg3.field3005[var38], arg9.field6548[var39], arg9.field6551[var39] & arg5, arg4, arg9.field6549[var39], arg3.field2998[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg8 != 16383) {
            return;
        }
        for (int var15 = 0; var15 < arg9.field6553; var15++) {
            boolean var16 = false;
            if (var13 < arg3.field2993 && arg3.field3002[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg7.field2993 && arg7.field3002[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg2 == null || arg2[var15] == arg10 || arg9.field6549[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg9.field6549[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var23 = arg3.field2995[var13];
                        var22 = arg3.field2991[var13];
                        var24 = arg3.field3004[var13];
                        var21 = arg3.field2998[var13];
                        var20 = arg3.field3005[var13];
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
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg7.field3004[var14];
                        var26 = arg7.field2998[var14];
                        var27 = arg7.field2991[var14];
                        var28 = arg7.field3005[var14];
                        var29 = arg7.field2995[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var28 = var18;
                        var27 = 0;
                        var29 = -1;
                    }
                    int var30;
                    int var31;
                    int var32;
                    if ((var22 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var32 = var24;
                        var30 = var20;
                        var31 = var21;
                    } else if (var19 == 2) {
                        int var35 = var28 - var20 & 0x3FFF;
                        int var36 = var25 - var24 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var26 - var21 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg1 * var36 / arg11 + var24 & 0x3FFF;
                        var30 = arg1 * var35 / arg11 + var20 & 0x3FFF;
                        var31 = var21 + (arg1 * var37 / arg11) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var28 - var20 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var30 = arg1 * var34 / arg11 + var20 & 0x3FFF;
                        var31 = 0;
                        var32 = 0;
                    } else if (var19 == 7) {
                        int var33 = var28 - var20 & 0x3F;
                        if (var33 >= 32) {
                            var33 -= 64;
                        }
                        var30 = arg1 * var33 / arg11 + var20 & 0x3F;
                        var31 = (var26 - var21) * arg1 / arg11 + var21;
                        var32 = (var25 - var24) * arg1 / arg11 + var24;
                    } else {
                        var30 = (var28 - var20) * arg1 / arg11 + var20;
                        var31 = var21 + ((var26 - var21) * arg1 / arg11);
                        var32 = var24 + ((var25 - var24) * arg1 / arg11);
                    }
                    if (var23 != -1) {
                        this.method2088(0, arg6, (byte) -127, arg0, 0, arg9.field6548[var23], arg5 & arg9.field6551[var23], arg4, 0, 0);
                    } else if (var29 != -1) {
                        this.method2088(0, arg6, (byte) -127, arg0, 0, arg9.field6548[var29], arg5 & arg9.field6551[var29], arg4, 0, 0);
                    }
                    this.method2088(var32, arg6, (byte) -127, arg0, var30, arg9.field6548[var15], arg9.field6551[var15] & arg5, arg4, var19, var31);
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

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIILrs;IILrs;)V")
    public final void method2090(int arg0, int arg1, boolean arg2, int arg3, int arg4, class597 arg5, int arg6, int arg7, class597 arg8) {
        field5060++;
        if (arg1 == -1 || !this.method210() || arg7 != 16383) {
            return;
        }
        class204 var10 = arg8.field8290[arg1];
        class466 var11 = var10.field3000;
        class204 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field8290[arg3];
            if (var12.field3000 != var11) {
                var12 = null;
            }
        }
        this.method2089(arg4, arg0, null, var10, arg2, 65535, null, var12, arg7, var11, false, arg6);
        this.method232();
    }

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
    public abstract boolean method210();

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lw;)Lw;")
    public abstract class271 method201(class271 arg0);

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
    public abstract void method225(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIILd;)V")
    public final void method2091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class136 arg8) {
        field5056++;
        boolean var10 = false;
        boolean var11 = false;
        if (arg6 > -17) {
            field5059 = null;
        }
        boolean var12 = false;
        int var13 = -arg7 / 2;
        int var14 = -arg5 / 2;
        int var15 = arg8.method267(arg0 + var13, arg3 + var14);
        int var16 = arg7 / 2;
        int var17 = -arg5 / 2;
        int var18 = arg8.method267(arg0 + var16, arg3 + var17);
        int var19 = -arg7 / 2;
        int var20 = arg5 / 2;
        int var21 = arg8.method267(arg0 + var19, arg3 + var20);
        int var22 = arg7 / 2;
        int var23 = arg5 / 2;
        int var24 = arg8.method267(arg0 + var22, arg3 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg5 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg2 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg2;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg2 < var29) {
                        var29 = arg2;
                    }
                }
                this.method233(var29);
            }
        }
        if (arg7 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg4 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg4;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg4) {
                        var31 = arg4;
                    }
                }
                this.method223(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg1;
        if (var34 != 0) {
            this.method224(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()Z")
    public abstract boolean method209();

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
    public abstract void method202(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lba;")
    public abstract class352 method235(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
    public abstract int method196();

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
    public abstract void method232();

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
    public abstract void method204(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
    public abstract void method216(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method2092(byte arg0) {
        field5059 = null;
        field5057 = null;
        if (arg0 != 79) {
            field5059 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
    public abstract void method217(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
    public abstract void method207(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
    public abstract int method189();

    @OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
    public abstract int method239();

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
    public abstract void method188(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILrs;Z)V")
    public final void method2093(int arg0, class597 arg1, boolean arg2) {
        field5061++;
        if (!arg2) {
            this.method224(-36, -83, 76);
        }
        if (arg0 == -1 || !this.method210()) {
            return;
        }
        class204 var4 = arg1.field8290[arg0];
        class466 var5 = var4.field3000;
        for (int var6 = 0; var6 < var4.field2993; var6++) {
            short var7 = var4.field3002[var6];
            if (var5.field6552[var7]) {
                if (var4.field2995[var6] != -1) {
                    this.method240(0, 0, 0, 0);
                }
                this.method240(var5.field6549[var7], var4.field3005[var6], var4.field3004[var6], var4.field2998[var6]);
            }
        }
        this.method232();
    }

    @OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
    public abstract void method213(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
    public abstract int method220();

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()V")
    public abstract void method228();

    @OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
    public abstract void method240(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()[Lvp;")
    public abstract class171[] method206();

    @OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
    public abstract int method234();
}
