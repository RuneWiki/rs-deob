import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class350 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field4584 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lro;Lro;ZIIIIIB)V")
    public final void method1938(class2 arg0, class2 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field4588++;
        if (arg6 == -1 || !this.method868()) {
            return;
        }
        class531 var10 = arg0.field13[arg6];
        if (arg8 != 5) {
            this.method903(-21);
        }
        class112 var11 = var10.field7609;
        class531 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field13[arg5];
            if (var12.field7609 != var11) {
                var12 = null;
            }
        }
        this.method1943(arg7, arg3, null, arg2, null, var12, var11, arg4, 65535, var10, 109, false);
        this.method879();
    }

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
    public abstract void method860(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
    public abstract void method916(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()Z")
    public abstract boolean method898();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIIIILro;Lro;IIIZ)V")
    public final void method1939(int[] arg0, int arg1, int arg2, int arg3, int arg4, class2 arg5, class2 arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field4591++;
        if (arg2 == -1 || !this.method868()) {
            return;
        }
        class531 var12 = arg5.field13[arg2];
        class112 var13 = var12.field7609;
        if (arg4 >= -61) {
            field4586 = 119;
        }
        class531 var14 = null;
        if (arg6 != null) {
            var14 = arg6.field13[arg7];
            if (var14.field7609 != var13) {
                var14 = null;
            }
        }
        this.method1943(arg9, arg8, arg0, arg10, null, var14, var13, arg1, arg3, var12, 111, false);
        this.method879();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lba;")
    public abstract class350 method602(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
    public abstract void method911(int arg0);

    @OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
    public abstract void method865(int arg0);

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
    public abstract void method870(int arg0);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
    public abstract void method888();

    @OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
    public abstract void method905(int arg0);

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
    public abstract void method915(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
    public abstract void method897(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
    public abstract void method862(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public abstract void method899(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
    public abstract boolean method868();

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
    public abstract int method872();

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
    public abstract void method892(int arg0);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()[Lhaa;")
    public abstract class73[] method882();

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
    public abstract int method861();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lba;IIIZ)V")
    public abstract void method885(class350 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
    public abstract void method903(int arg0);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
    public abstract int method902();

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
    public abstract void method889();

    @OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
    public abstract int method875();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method910(int arg0, int arg1, class389 arg2, boolean arg3);

    @OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
    public abstract int method912();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([III[IIIBIZI)V")
    private final void method1940(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte arg6, int arg7, boolean arg8, int arg9) {
        if (arg7 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = -arg4;
                arg4 = arg1;
                arg1 = var13;
            } else if (arg9 == 3) {
                int var12 = arg4;
                arg4 = arg1;
                arg1 = var12;
            } else if (arg9 == 2) {
                int var11 = arg4;
                arg4 = -arg1 & 0x3FFF;
                arg1 = var11 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg4 = -arg4;
                arg1 = -arg1;
            } else if (arg9 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg1 = -arg1 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = arg4;
                arg4 = -arg1;
                arg1 = var16;
            } else if (arg9 == 3) {
                int var14 = arg4;
                arg4 = arg1;
                arg1 = var14;
            } else if (arg9 == 2) {
                int var15 = arg4;
                arg4 = arg1 & 0x3FFF;
                arg1 = -var15 & 0x3FFF;
            }
        }
        if (arg6 < 46) {
            this.method876();
        }
        field4587++;
        if (arg5 == 65535) {
            this.method915(arg9, arg3, arg4, arg2, arg1, arg7, arg8);
        } else {
            this.method900(arg9, arg3, arg4, arg2, arg1, arg8, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
    public abstract int method876();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lmr;II)V")
    public abstract void method871(class389 arg0, class130 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILd;Ld;III)V")
    public abstract void method884(int arg0, int arg1, class137 arg2, class137 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
    public abstract void method863(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII[ZLro;Lro;Lro;ILro;IZII)V")
    public final void method1941(int arg0, int arg1, int arg2, int arg3, int arg4, boolean[] arg5, class2 arg6, class2 arg7, class2 arg8, int arg9, class2 arg10, int arg11, boolean arg12, int arg13, int arg14) {
        field4590++;
        if (arg2 == -1) {
            return;
        }
        if (arg5 == null || arg9 == -1) {
            this.method1938(arg6, arg8, arg12, arg3, arg4, arg14, arg2, 0, (byte) 5);
        } else if (this.method868()) {
            class531 var16 = arg6.field13[arg2];
            class112 var17 = var16.field7609;
            class531 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field13[arg14];
                if (var18.field7609 != var17) {
                    var18 = null;
                }
            }
            this.method1943(0, arg3, null, arg12, arg5, var18, var17, arg4, 65535, var16, 102, false);
            class531 var19 = arg7.field13[arg9];
            class531 var20 = null;
            if (arg10 != null) {
                var20 = arg10.field13[arg13];
                if (var20.field7609 != var17) {
                    var20 = null;
                }
            }
            this.method915(0, new int[0], 0, 0, 0, arg1, arg12);
            this.method1943(0, arg11, null, arg12, arg5, var20, var19.field7609, arg0, 65535, var19, 87, true);
            this.method879();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lmr;I)V")
    public abstract void method904(class389 arg0, class130 arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
    public abstract void method900(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
    public abstract int method880();

    @OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
    public abstract int method864();

    @OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
    public abstract void method874(int arg0);

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
    public abstract void method879();

    @OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
    public abstract int method913();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;)V")
    public abstract void method866(class389 arg0);

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lw;)Lw;")
    public abstract class269 method883(class269 arg0);

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
    public abstract int method869();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lro;II)V")
    public final void method1942(class2 arg0, int arg1, int arg2) {
        field4589++;
        if (arg2 == -1 || !this.method868()) {
            return;
        }
        class531 var4 = arg0.field13[arg2];
        if (arg1 != 16383) {
            this.method879();
        }
        class112 var5 = var4.field7609;
        for (int var6 = 0; var6 < var4.field7610; var6++) {
            short var7 = var4.field7601[var6];
            if (var5.field1295[var7]) {
                if (var4.field7605[var6] != -1) {
                    this.method897(0, 0, 0, 0);
                }
                this.method897(var5.field1297[var7], var4.field7602[var6], var4.field7604[var6], var4.field7600[var6]);
            }
        }
        this.method879();
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()[Ldg;")
    public abstract class375[] method886();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[IZ[ZLpf;Lju;IILpf;IZ)V")
    private final void method1943(int arg0, int arg1, int[] arg2, boolean arg3, boolean[] arg4, class531 arg5, class112 arg6, int arg7, int arg8, class531 arg9, int arg10, boolean arg11) {
        field4592++;
        if (arg5 == null || arg7 == 0) {
            for (int var38 = 0; var38 < arg9.field7610; var38++) {
                short var39 = arg9.field7601[var38];
                if (arg4 == null || arg4[var39] == arg11 || arg6.field1297[var39] == 0) {
                    short var40 = arg9.field7605[var38];
                    if (var40 != -1) {
                        this.method1940(arg2, 0, 0, arg6.field1299[var40], 0, arg8 & arg6.field1305[var40], (byte) 118, arg0, arg3, 0);
                    }
                    this.method1940(arg2, arg9.field7600[var38], arg9.field7604[var38], arg6.field1299[var39], arg9.field7602[var38], arg6.field1305[var39] & arg8, (byte) 116, arg0, arg3, arg6.field1297[var39]);
                }
            }
            return;
        }
        if (arg10 <= 86) {
            field4586 = 70;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg6.field1298; var15++) {
            boolean var16 = false;
            if (arg9.field7610 > var13 && arg9.field7601[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg5.field7610 > var14 && arg5.field7601[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg4 == null || arg11 == arg4[var15] || arg6.field1297[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg6.field1297[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg9.field7616[var13];
                        var21 = arg9.field7604[var13];
                        var22 = arg9.field7600[var13];
                        var23 = arg9.field7605[var13];
                        var24 = arg9.field7602[var13];
                        var13++;
                    } else {
                        var23 = -1;
                        var20 = 0;
                        var21 = var18;
                        var24 = var18;
                        var22 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var25 = arg5.field7605[var14];
                        var26 = arg5.field7604[var14];
                        var27 = arg5.field7600[var14];
                        var28 = arg5.field7616[var14];
                        var29 = arg5.field7602[var14];
                        var14++;
                    } else {
                        var25 = -1;
                        var27 = var18;
                        var26 = var18;
                        var29 = var18;
                        var28 = 0;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var20 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var32 = var22;
                        var33 = var21;
                        var31 = var24;
                    } else if (var19 == 2) {
                        int var35 = var29 - var24 & 0x3FFF;
                        int var36 = var26 - var21 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var27 - var22 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var31 = var24 + (arg7 * var35 / arg1) & 0x3FFF;
                        var33 = var21 + (arg7 * var36 / arg1) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg7 * var37 / arg1 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var29 - var24 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = arg7 * var30 / arg1 + var24 & 0x3FFF;
                        var32 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var34 = var29 - var24 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var32 = (var27 - var22) * arg7 / arg1 + var22;
                        var33 = var21 + ((var26 - var21) * arg7 / arg1);
                        var31 = arg7 * var34 / arg1 + var24 & 0x3F;
                    } else {
                        var32 = (var27 - var22) * arg7 / arg1 + var22;
                        var31 = (var29 - var24) * arg7 / arg1 + var24;
                        var33 = (var26 - var21) * arg7 / arg1 + var21;
                    }
                    if (var23 != -1) {
                        this.method1940(arg2, 0, 0, arg6.field1299[var23], 0, arg8 & arg6.field1305[var23], (byte) 82, arg0, arg3, 0);
                    } else if (var25 != -1) {
                        this.method1940(arg2, 0, 0, arg6.field1299[var25], 0, arg6.field1305[var25] & arg8, (byte) 61, arg0, arg3, 0);
                    }
                    this.method1940(arg2, var32, var33, arg6.field1299[var15], var31, arg6.field1305[var15] & arg8, (byte) 81, arg0, arg3, var19);
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

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILd;BIIIII)V")
    public final void method1944(int arg0, int arg1, class137 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4585++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg6 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg2.method242(arg5 + var13, arg1 + var14);
        int var16 = arg6 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg2.method242(arg5 + var16, arg1 + var17);
        int var19 = -arg6 / 2;
        int var20 = arg8 / 2;
        int var21 = arg2.method242(arg5 + var19, arg1 - -var20);
        int var22 = arg6 / 2;
        int var23 = arg8 / 2;
        int var24 = arg2.method242(arg5 + var22, arg1 + var23);
        if (arg3 >= -126) {
            return;
        }
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        int var28 = var15 >= var21 ? var21 : var15;
        if (arg8 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg4 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg4;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (arg4 < var29) {
                        var29 = arg4;
                    }
                }
                this.method865(var29);
            }
        }
        if (arg6 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg7 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg7;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (arg7 < var31) {
                        var31 = arg7;
                    }
                }
                this.method870(var31);
            }
        }
        int var33 = var15 + var24;
        if ((var18 + var21) < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg0;
        if (var34 != 0) {
            this.method862(0, var34, 0);
        }
    }
}
