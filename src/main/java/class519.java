import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class519 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Led;")
    public static class115 field7205 = new class115();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "F")
    public static float field7207;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lmb;II)V", line = 4)
    public final void method2931(class285 arg0, int arg1, int arg2) {
        field7210++;
        if (arg2 == -1 || !this.method1404()) {
            return;
        }
        class385 var4 = arg0.field4155[arg2];
        class393 var5 = var4.field5729;
        if (arg1 <= 106) {
            return;
        }
        for (int var6 = 0; var6 < var4.field5723; var6++) {
            short var7 = var4.field5728[var6];
            if (var5.field5882[var7]) {
                if (var4.field5733[var6] != -1) {
                    this.method1402(0, 0, 0, 0);
                }
                this.method1402(var5.field5889[var7], var4.field5738[var6], var4.field5726[var6], var4.field5724[var6]);
            }
        }
        this.method1358();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 52)
    public static void method2932(int arg0) {
        if (arg0 != -19378) {
            method2932(-50);
        }
        field7205 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lob;Z[ILsg;Lob;BIZIII[Z)V", line = 65)
    private final void method2933(class385 arg0, boolean arg1, int[] arg2, class393 arg3, class385 arg4, byte arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, boolean[] arg11) {
        field7211++;
        if (arg4 == null || arg6 == 0) {
            for (int var38 = 0; var38 < arg0.field5723; var38++) {
                short var39 = arg0.field5728[var38];
                if (arg11 == null || arg11[var39] == arg1 || arg3.field5889[var39] == 0) {
                    short var40 = arg0.field5733[var38];
                    if (var40 != -1) {
                        this.method2939(arg3.field5883[var40] & arg9, arg7, 0, 0, arg3.field5888[var40], arg2, 0, 0, arg8, 0);
                    }
                    this.method2939(arg9 & arg3.field5883[var39], arg7, 0, arg0.field5726[var38], arg3.field5888[var39], arg2, arg0.field5724[var38], arg3.field5889[var39], arg8, arg0.field5738[var38]);
                }
            }
            return;
        }
        if (arg5 != -44) {
            field7205 = null;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg3.field5887; var15++) {
            boolean var16 = false;
            if (var13 < arg0.field5723 && arg0.field5728[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg4.field5723 > var14 && arg4.field5728[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg11[var15] == arg1 || arg3.field5889[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg3.field5889[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var21 = arg0.field5734[var13];
                        var23 = arg0.field5738[var13];
                        var22 = arg0.field5733[var13];
                        var20 = arg0.field5726[var13];
                        var24 = arg0.field5724[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var22 = -1;
                        var23 = var18;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var27 = arg4.field5738[var14];
                        var28 = arg4.field5734[var14];
                        var25 = arg4.field5726[var14];
                        var26 = arg4.field5724[var14];
                        var29 = arg4.field5733[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = var18;
                        var28 = 0;
                        var29 = -1;
                    }
                    if (var22 != -1) {
                        this.method2939(arg3.field5883[var22] & arg9, arg7, 0, 0, arg3.field5888[var22], arg2, 0, 0, arg8, 0);
                    } else if (var29 != -1) {
                        this.method2939(arg9 & arg3.field5883[var29], arg7, arg5 + 44, 0, arg3.field5888[var29], arg2, 0, 0, arg8, 0);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var21 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var31 = var24;
                        var33 = var23;
                        var32 = var20;
                    } else if (var19 == 2) {
                        int var35 = var27 - var23 & 0x3FFF;
                        int var36 = var25 - var20 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var26 - var24 & 0x3FFF;
                        var32 = arg6 * var36 / arg10 + var20 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg6 * var35 / arg10 + var23 & 0x3FFF;
                        var31 = arg6 * var37 / arg10 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var27 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = arg6 * var30 / arg10 + var23 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var27 - var23 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var33 = arg6 * var34 / arg10 + var23 & 0x3F;
                        var32 = (var25 - var20) * arg6 / arg10 + var20;
                        var31 = (var26 - var24) * arg6 / arg10 + var24;
                    } else {
                        var32 = var20 + ((var25 - var20) * arg6 / arg10);
                        var31 = var24 + ((var26 - var24) * arg6 / arg10);
                        var33 = (var27 - var23) * arg6 / arg10 + var23;
                    }
                    this.method2939(arg3.field5883[var15] & arg9, arg7, arg5 + 44, var32, arg3.field5888[var15], arg2, var31, var19, arg8, var33);
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

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILmb;IILmb;ZIB)V", line = 277)
    public final void method2934(int arg0, int arg1, class285 arg2, int arg3, int arg4, class285 arg5, boolean arg6, int arg7, byte arg8) {
        field7214++;
        if (arg3 == -1 || !this.method1404()) {
            return;
        }
        class385 var10 = arg5.field4155[arg3];
        class393 var11 = var10.field5729;
        class385 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field4155[arg1];
            if (var12.field5729 != var11) {
                var12 = null;
            }
        }
        this.method2933(var10, false, null, var11, var12, (byte) -44, arg4, arg6, arg0, 65535, arg7, null);
        if (arg8 == 122) {
            this.method1358();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILmb;IIILmb;B[ZIZLmb;ILmb;II)V", line = 318)
    public final void method2935(int arg0, class285 arg1, int arg2, int arg3, int arg4, class285 arg5, byte arg6, boolean[] arg7, int arg8, boolean arg9, class285 arg10, int arg11, class285 arg12, int arg13, int arg14) {
        field7209++;
        if (arg8 == -1) {
            return;
        }
        if (arg7 == null || arg14 == -1) {
            this.method2934(0, arg11, arg5, arg8, arg3, arg1, arg9, arg0, (byte) 122);
        } else if (this.method1404()) {
            class385 var16 = arg1.field4155[arg8];
            class393 var17 = var16.field5729;
            class385 var18 = null;
            if (arg5 != null) {
                var18 = arg5.field4155[arg11];
                if (var18.field5729 != var17) {
                    var18 = null;
                }
            }
            this.method2933(var16, false, null, var17, var18, (byte) -44, arg3, arg9, 0, 65535, arg0, arg7);
            class385 var19 = arg12.field4155[arg14];
            if (arg6 == 119) {
                class385 var20 = null;
                if (arg10 != null) {
                    var20 = arg10.field4155[arg13];
                    if (var20.field5729 != var17) {
                        var20 = null;
                    }
                }
                this.method1354(0, new int[0], 0, 0, 0, 0, arg9);
                this.method2933(var19, true, null, var19.field5729, var20, (byte) -44, arg4, arg9, 0, 65535, arg2, arg7);
                this.method1358();
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)I", line = 387)
    public static final int method2936(byte arg0, int arg1, int arg2) {
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        field7208++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 <= 72) {
            method2936((byte) -44, 7, -38);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lmb;IILmb;ZIIIII[I)V", line = 407)
    public final void method2937(class285 arg0, int arg1, int arg2, class285 arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        field7212++;
        if (arg5 == -1 || !this.method1404()) {
            return;
        }
        if (arg7 != -9454) {
            field7204 = 56;
        }
        class385 var12 = arg0.field4155[arg5];
        class393 var13 = var12.field5729;
        class385 var14 = null;
        if (arg3 != null) {
            var14 = arg3.field4155[arg6];
            if (var14.field5729 != var13) {
                var14 = null;
            }
        }
        this.method2933(var12, false, arg10, var13, var14, (byte) -44, arg2, arg4, arg1, arg8, arg9, null);
        this.method1358();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIILsa;III)V", line = 451)
    public final void method2938(int arg0, int arg1, int arg2, int arg3, int arg4, class542 arg5, int arg6, int arg7, int arg8) {
        field7213++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg8 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg5.method695(arg2 + var13, arg1 - -var14);
        int var16 = arg8 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg5.method695(arg2 + var16, arg1 - -var17);
        int var19 = -arg8 / 2;
        int var20 = arg3 / 2;
        int var21 = arg5.method695(arg2 + var19, arg1 + var20);
        int var22 = arg8 / 2;
        int var23 = arg3 / 2;
        int var24 = arg5.method695(arg2 + var22, arg1 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var15 >= var21 ? var21 : var15;
        if (arg3 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg6 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg6;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (arg6 < var29) {
                        var29 = arg6;
                    }
                }
                this.method1383(var29);
            }
        }
        if (~arg8 != arg4) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg0 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg0;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg0) {
                        var31 = arg0;
                    }
                }
                this.method1400(var31);
            }
        }
        int var33 = var15 + var24;
        if (var18 + var21 < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg7;
        if (var34 != 0) {
            this.method1368(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZII[I[IIIII)V", line = 584)
    private final void method2939(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 == 1) {
            if (arg7 == 0 || arg7 == 1) {
                int var13 = -arg9;
                arg9 = arg6;
                arg6 = var13;
            } else if (arg7 == 3) {
                int var11 = arg9;
                arg9 = arg6;
                arg6 = var11;
            } else if (arg7 == 2) {
                int var12 = arg9;
                arg9 = -arg6 & 0x3FFF;
                arg6 = var12 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg7 == 0 || arg7 == 1) {
                arg9 = -arg9;
                arg6 = -arg6;
            } else if (arg7 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg7 == 0 || arg7 == 1) {
                int var16 = arg9;
                arg9 = -arg6;
                arg6 = var16;
            } else if (arg7 == 3) {
                int var14 = arg9;
                arg9 = arg6;
                arg6 = var14;
            } else if (arg7 == 2) {
                int var15 = arg9;
                arg9 = arg6 & 0x3FFF;
                arg6 = -var15 & 0x3FFF;
            }
        }
        field7206++;
        if (arg0 == 65535) {
            this.method1354(arg7, arg4, arg9, arg3, arg6, arg8, arg1);
        } else {
            this.method1398(arg7, arg4, arg9, arg3, arg6, arg1, arg0, arg5);
        }
        if (arg2 != 0) {
            field7205 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
    public abstract void method1387(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
    public abstract void method1401(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method1400(int arg0);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
    public abstract int method1406();

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method1366(int arg0);

    @OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
    public abstract int method1386();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lpaa;II)V")
    public abstract void method1374(class105 arg0, class315 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lr;IIIZ)V")
    public abstract void method1363(class519 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
    public abstract void method1383(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()[Lon;")
    public abstract class595[] method1375();

    @OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
    public abstract void method1351();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method1381(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method1362();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()Z")
    public abstract boolean method1388();

    @OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
    public abstract int method1376();

    @OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public abstract void method1395(int arg0, int arg1, class542 arg2, class542 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
    public abstract int method1378();

    @OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lk;)Lk;")
    public abstract class88 method1403(class88 arg0);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
    public abstract void method1349(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lr;")
    public abstract class519 method765(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
    public abstract void method1391(int arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
    public abstract void method1357();

    @OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
    public abstract boolean method1404();

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
    public abstract void method1358();

    @OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
    public abstract int method1390();

    @OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
    public abstract void method1367(int arg0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
    public abstract int method1382();

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1398(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
    public abstract void method1368(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
    public abstract void method1402(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILm;Z)Z")
    public abstract boolean method1399(int arg0, int arg1, class105 arg2, boolean arg3);

    @OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
    public abstract int method1373();

    @OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
    public abstract void method1354(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
    public abstract void method1407(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lpaa;I)V")
    public abstract void method1379(class105 arg0, class315 arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
    public abstract void method1405(int arg0);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()[Ltf;")
    public abstract class643[] method1372();

    @OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
    public abstract int method1392();

    @OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
    public abstract int method1394();
}
