import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class75 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Z")
    public static boolean field1162 = false;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1163 = "Loading - please wait.";

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1166 = "Ok";

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lrg;")
    public static class383 field1168;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 7)
    public static void method496(int arg0) {
        if (arg0 != 3) {
            field1168 = null;
        }
        field1166 = null;
        field1163 = null;
        field1168 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIBLsm;II)V", line = 19)
    public final void method497(int arg0, int arg1, int arg2, byte arg3, class156 arg4, int arg5, int arg6) {
        field1171++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        if (arg3 != 122) {
            return;
        }
        int var11 = -arg5 / 2;
        int var12 = -arg6 / 2;
        int var13 = arg4.method278(arg1 + var11, arg0 - -var12);
        int var14 = arg5 / 2;
        int var15 = -arg6 / 2;
        int var16 = arg4.method278(arg1 + var14, arg0 + var15);
        int var17 = -arg5 / 2;
        int var18 = arg6 / 2;
        int var19 = arg4.method278(arg1 + var17, arg0 + var18);
        int var20 = arg5 / 2;
        int var21 = arg6 / 2;
        int var22 = arg4.method278(arg1 + var20, arg0 - -var21);
        int var23 = var16 <= var13 ? var16 : var13;
        int var24 = var22 > var19 ? var19 : var22;
        int var25 = var22 <= var16 ? var22 : var16;
        if (arg6 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method504(var26);
            }
        }
        int var27 = var19 <= var13 ? var19 : var13;
        if (arg5 != 0) {
            int var28 = (int) (Math.atan2((double) (var27 - var25), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                this.method524(var28);
            }
        }
        int var29 = var13 + var22;
        if ((var16 + var19) < var29) {
            var29 = var16 + var19;
        }
        int var30 = (var29 >> 1) - arg2;
        if (var30 != 0) {
            this.method534(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lbl;II)V", line = 98)
    public final void method499(class387 arg0, int arg1, int arg2) {
        field1170++;
        if (arg1 == -1 || !this.method527()) {
            return;
        }
        class343 var4 = arg0.field5644[arg1];
        class346 var5 = var4.field4803;
        if (arg2 < 62) {
            this.method509((short) -35, (short) -25);
        }
        for (int var6 = 0; var6 < var4.field4800; var6++) {
            short var7 = var4.field4789[var6];
            if (var5.field4845[var7]) {
                if (var4.field4796[var6] != -1) {
                    this.method510(0, 0, 0, 0);
                }
                this.method510(var5.field4853[var7], var4.field4802[var6], var4.field4798[var6], var4.field4799[var6]);
            }
        }
        this.method537();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ[IIIIIII[I)V", line = 142)
    private final void method502(int arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        field1169++;
        if (arg5 == 1) {
            if (arg3 == 0 || arg3 == 1) {
                int var13 = -arg7;
                arg7 = arg4;
                arg4 = var13;
            } else if (arg3 == 3) {
                int var12 = arg7;
                arg7 = arg4;
                arg4 = var12;
            } else if (arg3 == 2) {
                int var11 = arg7;
                arg7 = -arg4 & 0x3FFF;
                arg4 = var11 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg3 == 0 || arg3 == 1) {
                arg4 = -arg4;
                arg7 = -arg7;
            } else if (arg3 == 2) {
                arg7 = -arg7 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg3 == 0 || arg3 == 1) {
                int var16 = arg7;
                arg7 = -arg4;
                arg4 = var16;
            } else if (arg3 == 3) {
                int var15 = arg7;
                arg7 = arg4;
                arg4 = var15;
            } else if (arg3 == 2) {
                int var14 = arg7;
                arg7 = arg4 & 0x3FFF;
                arg4 = -var14 & 0x3FFF;
            }
        }
        if (arg8 > -101) {
            return;
        }
        if (arg0 == 65535) {
            this.method530(arg3, arg2, arg7, arg6, arg4, arg5, arg1);
        } else {
            this.method501(arg3, arg2, arg7, arg6, arg4, arg1, arg0, arg9);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Luo;Luo;Lpf;I[IIIIZZ[ZB)V", line = 247)
    private final void method506(class343 arg0, class343 arg1, class346 arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, boolean arg8, boolean arg9, boolean[] arg10, byte arg11) {
        field1173++;
        if (arg1 == null || arg3 == 0) {
            for (int var37 = 0; var37 < arg0.field4800; var37++) {
                short var38 = arg0.field4789[var37];
                if (arg10 == null || arg8 == arg10[var38] || arg2.field4853[var38] == 0) {
                    short var39 = arg0.field4796[var37];
                    if (var39 != -1) {
                        this.method502(arg2.field4851[var39] & arg5, arg9, arg2.field4847[var39], 0, 0, arg7, 0, 0, -122, arg4);
                    }
                    this.method502(arg2.field4851[var38] & arg5, arg9, arg2.field4847[var38], arg2.field4853[var38], arg0.field4799[var37], arg7, arg0.field4798[var37], arg0.field4802[var37], -117, arg4);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg11 <= 66) {
            field1166 = null;
        }
        for (int var15 = 0; var15 < arg2.field4849; var15++) {
            boolean var16 = false;
            if (arg0.field4800 > var13 && arg0.field4789[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg1.field4800 > var14 && arg1.field4789[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg10 == null || arg10[var15] == arg8 || arg2.field4853[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg2.field4853[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg0.field4796[var13];
                        var21 = arg0.field4792[var13];
                        var22 = arg0.field4798[var13];
                        var23 = arg0.field4802[var13];
                        var24 = arg0.field4799[var13];
                        var13++;
                    } else {
                        var22 = var18;
                        var23 = var18;
                        var24 = var18;
                        var20 = -1;
                        var21 = 0;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var25 = arg1.field4802[var14];
                        var26 = arg1.field4796[var14];
                        var27 = arg1.field4799[var14];
                        var28 = arg1.field4792[var14];
                        var29 = arg1.field4798[var14];
                        var14++;
                    } else {
                        var26 = -1;
                        var27 = var18;
                        var29 = var18;
                        var28 = 0;
                        var25 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var34 = var22;
                        var35 = var24;
                        var33 = var23;
                    } else if (var19 == 2) {
                        int var30 = var25 - var23 & 0x3FFF;
                        int var31 = var29 - var22 & 0x3FFF;
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
                        var33 = var23 + (arg3 * var30 / arg6) & 0x3FFF;
                        var34 = arg3 * var31 / arg6 + var22 & 0x3FFF;
                        var35 = arg3 * var32 / arg6 + var24 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var25 - var23 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var27 - var24) * arg3 / arg6 + var24;
                        var34 = var22 + ((var29 - var22) * arg3 / arg6);
                        var33 = arg3 * var36 / arg6 + var23 & 0x3F;
                    } else {
                        var35 = (var27 - var24) * arg3 / arg6 + var24;
                        var34 = var22 + ((var29 - var22) * arg3 / arg6);
                        var33 = (var25 - var23) * arg3 / arg6 + var23;
                    }
                    if (var20 != -1) {
                        this.method502(arg2.field4851[var20] & arg5, arg9, arg2.field4847[var20], 0, 0, arg7, 0, 0, -123, arg4);
                    } else if (var26 != -1) {
                        this.method502(arg5 & arg2.field4851[var26], arg9, arg2.field4847[var26], 0, 0, arg7, 0, 0, -117, arg4);
                    }
                    this.method502(arg2.field4851[var15] & arg5, arg9, arg2.field4847[var15], var19, var35, arg7, var34, var33, -125, arg4);
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

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZLbl;IILbl;B)V", line = 470)
    public final void method517(int arg0, int arg1, int arg2, boolean arg3, class387 arg4, int arg5, int arg6, class387 arg7, byte arg8) {
        field1165++;
        if (arg1 == -1) {
            return;
        }
        int var10 = 6 / ((27 - arg8) / 41);
        if (!this.method527()) {
            return;
        }
        class343 var11 = arg4.field5644[arg1];
        class346 var12 = var11.field4803;
        class343 var13 = null;
        if (arg7 != null) {
            var13 = arg7.field5644[arg0];
            if (var13.field4803 != var12) {
                var13 = null;
            }
        }
        this.method506(var11, var13, var12, arg6, (int[]) null, 65535, arg2, arg5, false, arg3, (boolean[]) null, (byte) 95);
        this.method537();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLbl;[IILbl;IIIIII)V", line = 529)
    public final void method532(boolean arg0, class387 arg1, int[] arg2, int arg3, class387 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1172++;
        if (arg5 == -1) {
            return;
        }
        if (arg8 != -2) {
            field1161 = -72;
        }
        if (!this.method527()) {
            return;
        }
        class343 var12 = arg1.field5644[arg5];
        class346 var13 = var12.field4803;
        class343 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field5644[arg7];
            if (var14.field4803 != var13) {
                var14 = null;
            }
        }
        this.method506(var12, var14, var13, arg6, arg2, arg10, arg9, arg3, false, arg0, (boolean[]) null, (byte) 92);
        this.method537();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILbl;IZLbl;ILbl;Lbl;III[ZIII)V", line = 568)
    public final void method536(int arg0, class387 arg1, int arg2, boolean arg3, class387 arg4, int arg5, class387 arg6, class387 arg7, int arg8, int arg9, int arg10, boolean[] arg11, int arg12, int arg13, int arg14) {
        field1167++;
        if (arg2 == -1) {
            return;
        }
        if (arg11 == null || arg12 == -1) {
            this.method517(arg8, arg2, arg9, arg3, arg4, 0, arg13, arg1, (byte) 94);
        } else if (this.method527()) {
            class343 var16 = arg4.field5644[arg2];
            class346 var17 = var16.field4803;
            class343 var18 = null;
            if (arg1 != null) {
                var18 = arg1.field5644[arg8];
                if (var18.field4803 != var17) {
                    var18 = null;
                }
            }
            class343 var19 = arg7.field5644[arg12];
            class343 var20 = null;
            if (arg6 != null) {
                var20 = arg6.field5644[arg14];
                if (var20.field4803 != var17) {
                    var20 = null;
                }
            }
            this.method506(var16, var18, var17, arg13, (int[]) null, 65535, arg9, 0, false, arg3, arg11, (byte) 96);
            this.method530(0, new int[0], arg5, 0, 0, 0, arg3);
            this.method506(var19, var20, var17, arg0, (int[]) null, 65535, arg10, 0, true, arg3, arg11, (byte) 77);
            this.method537();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
    public abstract void method494();

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
    public abstract void method495();

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()I")
    public abstract int method498();

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()I")
    public abstract int method500();

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method501(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "()I")
    public abstract int method503();

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public abstract void method504(int arg0);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "()Z")
    public abstract boolean method505();

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public abstract void method507(int arg0);

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public abstract void method508(int arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(SS)V")
    public abstract void method509(short arg0, short arg1);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
    public abstract void method510(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "()[Lhp;")
    public abstract class179[] method511();

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
    public abstract void method512(int arg0);

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "()I")
    public abstract int method513();

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lci;Lbd;I)V")
    public abstract void method514(class261 arg0, class38 arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
    public abstract void method515(int arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILci;Z)Z")
    public abstract boolean method516(int arg0, int arg1, class261 arg2, boolean arg3);

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "()[Lpd;")
    public abstract class140[] method518();

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lci;Lbd;II)V")
    public abstract void method519(class261 arg0, class38 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "()I")
    public abstract int method520();

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
    public abstract void method521(int arg0);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "()I")
    public abstract int method522();

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "()I")
    public abstract int method523();

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V")
    public abstract void method524(int arg0);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "()I")
    public abstract int method525();

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "()I")
    public abstract int method526();

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "()Z")
    public abstract boolean method527();

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public abstract void method528(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIZ)Lhc;")
    public abstract class75 method529(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method530(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILsm;Lsm;III)V")
    public abstract void method531(int arg0, int arg1, class156 arg2, class156 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "()I")
    public abstract int method533();

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public abstract void method534(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lhc;IIIZ)V")
    public abstract void method535(class75 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "()V")
    public abstract void method537();

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lek;)Lek;")
    public abstract class294 method538(class294 arg0);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(SS)V")
    public abstract void method539(short arg0, short arg1);
}
