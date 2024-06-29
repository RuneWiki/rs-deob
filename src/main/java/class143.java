import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class143 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Lil;")
    public static class274 field1940 = new class274(8, 7);

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
    public static int[] field1947 = new int[25];

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "[B")
    public static byte[] field1949 = new byte[2048];

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Ljn;")
    public static class409 field1943 = new class409("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIILnp;ZILnp;B[I)V", line = 26)
    public final void method952(int arg0, int arg1, int arg2, int arg3, int arg4, class213 arg5, boolean arg6, int arg7, class213 arg8, byte arg9, int[] arg10) {
        field1950++;
        if (arg3 == -1 || !this.method956()) {
            return;
        }
        class94 var12 = arg5.field3005[arg3];
        class307 var13 = var12.field1170;
        if (arg9 != 98) {
            return;
        }
        class94 var14 = null;
        if (arg8 != null) {
            var14 = arg8.field3005[arg2];
            if (var14.field1170 != var13) {
                var14 = null;
            }
        }
        this.method976(arg9 ^ 0xFFFFFFBD, arg4, false, arg6, (boolean[]) null, arg10, var13, arg1, arg7, var14, var12, arg0);
        this.method964();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZLnp;)V", line = 70)
    public final void method959(int arg0, boolean arg1, class213 arg2) {
        field1938++;
        if (arg0 == -1 || !this.method956()) {
            return;
        }
        class94 var4 = arg2.field3005[arg0];
        class307 var5 = var4.field1170;
        if (!arg1) {
            return;
        }
        for (int var6 = 0; var6 < var4.field1178; var6++) {
            short var7 = var4.field1167[var6];
            if (var5.field4534[var7]) {
                if (var4.field1166[var6] != -1) {
                    this.method962(0, 0, 0, 0);
                }
                this.method962(var5.field4526[var7], var4.field1176[var6], var4.field1173[var6], var4.field1171[var6]);
            }
        }
        this.method964();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lui;IIIBII)V", line = 127)
    public final void method971(class378 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1939++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg5 / 2;
        int var12 = -39 % ((arg4 + 22) / 37);
        int var13 = -arg6 / 2;
        int var14 = arg0.method1427(arg2 + var11, arg3 + var13);
        int var15 = arg5 / 2;
        int var16 = -arg6 / 2;
        int var17 = arg0.method1427(arg2 + var15, arg3 + var16);
        int var18 = -arg5 / 2;
        int var19 = arg6 / 2;
        int var20 = arg0.method1427(arg2 + var18, arg3 + var19);
        int var21 = arg5 / 2;
        int var22 = arg6 / 2;
        int var23 = arg0.method1427(arg2 + var21, arg3 + var22);
        int var24 = var14 < var17 ? var14 : var17;
        int var25 = var23 <= var20 ? var23 : var20;
        int var26 = var23 <= var17 ? var23 : var17;
        if (arg6 != 0) {
            int var27 = (int) (Math.atan2((double) (var24 - var25), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method944(var27);
            }
        }
        int var28 = var20 <= var14 ? var20 : var14;
        int var29 = var14 + var23;
        if (arg5 != 0) {
            int var30 = (int) (Math.atan2((double) (var28 - var26), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var30 != 0) {
                this.method958(var30);
            }
        }
        if ((var17 + var20) < var29) {
            var29 = var17 + var20;
        }
        int var31 = (var29 >> 1) - arg1;
        if (var31 != 0) {
            this.method946(0, var31, 0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZZ[Z[ILed;IILvb;Lvb;I)V", line = 206)
    private final void method976(int arg0, int arg1, boolean arg2, boolean arg3, boolean[] arg4, int[] arg5, class307 arg6, int arg7, int arg8, class94 arg9, class94 arg10, int arg11) {
        field1944++;
        if (arg9 == null || arg7 == 0) {
            for (int var37 = 0; var37 < arg10.field1178; var37++) {
                short var38 = arg10.field1167[var37];
                if (arg4 == null || arg4[var38] == arg2 || arg6.field4526[var38] == 0) {
                    short var39 = arg10.field1166[var37];
                    if (var39 != -1) {
                        this.method985(arg3, 0, (byte) -10, 0, arg6.field4529[var39], arg5, 0, 0, arg11 & arg6.field4527[var39], arg8);
                    }
                    this.method985(arg3, arg10.field1173[var37], (byte) -10, arg10.field1171[var37], arg6.field4529[var38], arg5, arg10.field1176[var37], arg6.field4526[var38], arg6.field4527[var38] & arg11, arg8);
                }
            }
            return;
        }
        if (arg0 != -33) {
            this.method953();
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg6.field4530; var15++) {
            boolean var16 = false;
            if (arg10.field1178 > var13 && arg10.field1167[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg9.field1178 > var14 && arg9.field1167[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg4 == null || arg2 == arg4[var15] || arg6.field4526[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg6.field4526[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var21 = arg10.field1177[var13];
                        var20 = arg10.field1171[var13];
                        var23 = arg10.field1176[var13];
                        var22 = arg10.field1173[var13];
                        var24 = arg10.field1166[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var22 = var18;
                        var23 = var18;
                        var24 = -1;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg9.field1173[var14];
                        var26 = arg9.field1171[var14];
                        var27 = arg9.field1177[var14];
                        var28 = arg9.field1166[var14];
                        var29 = arg9.field1176[var14];
                        var14++;
                    } else {
                        var29 = var18;
                        var26 = var18;
                        var27 = 0;
                        var28 = -1;
                        var25 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var35 = var20;
                        var33 = var22;
                        var34 = var23;
                    } else if (var19 == 2) {
                        int var30 = var29 - var23 & 0x3FFF;
                        int var31 = var25 - var22 & 0x3FFF;
                        int var32 = var26 - var20 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = arg7 * var31 / arg1 + var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg7 * var30 / arg1 + var23 & 0x3FFF;
                        var35 = arg7 * var32 / arg1 + var20 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var29 - var23 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var26 - var20) * arg7 / arg1 + var20;
                        var33 = (var25 - var22) * arg7 / arg1 + var22;
                        var34 = arg7 * var36 / arg1 + var23 & 0x3F;
                    } else {
                        var33 = (var25 - var22) * arg7 / arg1 + var22;
                        var34 = (var29 - var23) * arg7 / arg1 + var23;
                        var35 = (var26 - var20) * arg7 / arg1 + var20;
                    }
                    if (var24 != -1) {
                        this.method985(arg3, 0, (byte) -10, 0, arg6.field4529[var24], arg5, 0, 0, arg11 & arg6.field4527[var24], arg8);
                    } else if (var28 != -1) {
                        this.method985(arg3, 0, (byte) -10, 0, arg6.field4529[var28], arg5, 0, 0, arg6.field4527[var28] & arg11, arg8);
                    }
                    this.method985(arg3, var33, (byte) -10, var35, arg6.field4529[var15], arg5, var34, var19, arg11 & arg6.field4527[var15], arg8);
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

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V", line = 408)
    public static void method979(int arg0) {
        field1943 = null;
        field1940 = null;
        field1949 = null;
        if (arg0 <= -124) {
            field1947 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIIILnp;[ZILnp;Lnp;Lnp;IIIII)V", line = 427)
    public final void method983(boolean arg0, int arg1, int arg2, int arg3, class213 arg4, boolean[] arg5, int arg6, class213 arg7, class213 arg8, class213 arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field1942++;
        if (arg13 == -1) {
            return;
        }
        if (arg5 == null || arg11 == -1) {
            this.method984(arg13, arg9, arg2, 27867, arg12, arg0, 0, arg14, arg4);
        } else if (this.method956()) {
            class94 var16 = arg9.field3005[arg13];
            class307 var17 = var16.field1170;
            class94 var18 = null;
            if (arg4 != null) {
                var18 = arg4.field3005[arg2];
                if (var18.field1170 != var17) {
                    var18 = null;
                }
            }
            class94 var19 = arg8.field3005[arg11];
            int var20 = -37 % ((arg6 - 75) / 43);
            class94 var21 = null;
            if (arg7 != null) {
                var21 = arg7.field3005[arg1];
                if (var21.field1170 != var17) {
                    var21 = null;
                }
            }
            this.method976(-33, arg14, false, arg0, arg5, (int[]) null, var17, arg12, 0, var18, var16, 65535);
            this.method968(0, new int[0], 0, 0, 0, 0, arg0);
            this.method976(-33, arg10, true, arg0, arg5, (int[]) null, var17, arg3, 0, var21, var19, 65535);
            this.method964();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILnp;IIIZIILnp;)V", line = 486)
    public final void method984(int arg0, class213 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class213 arg8) {
        field1948++;
        if (arg0 == -1 || !this.method956()) {
            return;
        }
        class94 var10 = arg1.field3005[arg0];
        class307 var11 = var10.field1170;
        if (arg3 != 27867) {
            this.method960();
        }
        class94 var12 = null;
        if (arg8 != null) {
            var12 = arg8.field3005[arg2];
            if (var12.field1170 != var11) {
                var12 = null;
            }
        }
        this.method976(-33, arg7, false, arg5, (boolean[]) null, (int[]) null, var11, arg4, arg6, var12, var10, 65535);
        this.method964();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIBI[I[IIIII)V", line = 520)
    private final void method985(boolean arg0, int arg1, byte arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 == 1) {
            if (arg7 == 0 || arg7 == 1) {
                int var16 = -arg6;
                arg6 = arg3;
                arg3 = var16;
            } else if (arg7 == 3) {
                int var15 = arg6;
                arg6 = arg3;
                arg3 = var15;
            } else if (arg7 == 2) {
                int var14 = arg6;
                arg6 = -arg3 & 0x3FFF;
                arg3 = var14 & 0x3FFF;
            }
        } else if (arg9 == 2) {
            if (arg7 == 0 || arg7 == 1) {
                arg3 = -arg3;
                arg6 = -arg6;
            } else if (arg7 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg9 == 3) {
            if (arg7 == 0 || arg7 == 1) {
                int var13 = arg6;
                arg6 = -arg3;
                arg3 = var13;
            } else if (arg7 == 3) {
                int var11 = arg6;
                arg6 = arg3;
                arg3 = var11;
            } else if (arg7 == 2) {
                int var12 = arg6;
                arg6 = arg3 & 0x3FFF;
                arg3 = -var12 & 0x3FFF;
            }
        }
        if (arg2 != -10) {
            this.method943(-85, (int[]) null, -95, -124, 6, false, 35, (int[]) null);
        }
        field1945++;
        if (arg8 == 65535) {
            this.method968(arg7, arg4, arg6, arg1, arg3, arg9, arg0);
        } else {
            this.method943(arg7, arg4, arg6, arg1, arg3, arg0, arg8, arg5);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V", line = 614)
    public static final void method986(int arg0, byte arg1, int arg2) {
        if (arg1 != 71) {
            method987(26);
        }
        field1946++;
        int var3 = class187.field2619.field793[0];
        int var4 = class187.field2619.field784[0];
        if (class408.field5869 == class166.field2191) {
            if (!class35.method329(0, arg2, -2, 1, false, arg0, var3, 1, 0, var4, 91)) {
                class35.method329(0, arg2, -3, 1, false, arg0, var3, 1, 0, var4, arg1 ^ 0xF);
            }
        } else if (!class35.method329(0, arg2, -3, 1, false, arg0, var3, 1, 0, var4, 60)) {
            class35.method329(0, arg2, -2, 1, false, arg0, var3, 1, 0, var4, 98);
        }
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)I", line = 646)
    public static final int method987(int arg0) {
        field1941++;
        if (arg0 != -3) {
            field1947 = null;
        }
        class363 var1 = class283.field4166;
        synchronized (class283.field4166) {
            return class283.field4166.method2311(121);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()I")
    public abstract int method941();

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(SS)V")
    public abstract void method942(short arg0, short arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method943(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public abstract void method944(int arg0);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()[Lai;")
    public abstract class133[] method945();

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    public abstract void method946(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lm;Loo;I)V")
    public abstract void method947(class187 arg0, class396 arg1, int arg2);

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "()V")
    public abstract void method948();

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lm;Loo;II)V")
    public abstract void method949(class187 arg0, class396 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()I")
    public abstract int method950();

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "()[Ljo;")
    public abstract class226[] method951();

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "()I")
    public abstract int method953();

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public abstract void method954(int arg0);

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "()I")
    public abstract int method955();

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "()Z")
    public abstract boolean method956();

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
    public abstract void method957(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
    public abstract void method958(int arg0);

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "()I")
    public abstract int method960();

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "()I")
    public abstract int method961();

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
    public abstract void method962(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lbi;IIIZ)V")
    public abstract void method963(class143 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "()V")
    public abstract void method964();

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(SS)V")
    public abstract void method965(short arg0, short arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BIZ)Lbi;")
    public abstract class143 method966(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "()Z")
    public abstract boolean method967();

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method968(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "()I")
    public abstract int method969();

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "()V")
    public abstract void method970();

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILui;Lui;III)V")
    public abstract void method972(int arg0, int arg1, class378 arg2, class378 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public abstract void method973(int arg0);

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "()I")
    public abstract int method974();

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
    public abstract void method975(int arg0);

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
    public abstract void method977(int arg0);

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V")
    public abstract void method978(int arg0);

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "()I")
    public abstract int method980();

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "()I")
    public abstract int method981();

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqh;)Lqh;")
    public abstract class337 method982(class337 arg0);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILm;Z)Z")
    public abstract boolean method988(int arg0, int arg1, class187 arg2, boolean arg3);
}
