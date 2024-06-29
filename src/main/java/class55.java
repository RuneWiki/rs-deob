import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class55 {

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Z")
    public boolean field1072 = false;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Ldg;")
    public static class376 field1070 = new class376(83, 0);

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lff;")
    public static class9 field1074 = new class9(8, 0, 4, 1);

    @OriginalMember(owner = "client!da", name = "p", descriptor = "S")
    public static short field1076 = 1;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method517();

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method540(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lbba;III[IIILbba;ZII)V")
    public final void method594(class98 arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, class98 arg7, boolean arg8, int arg9, int arg10) {
        field1073++;
        if (~arg9 == arg3) {
            return;
        }
        this.method535();
        if (!this.method506()) {
            this.method511();
            return;
        }
        class365 var12 = arg0.field1541[arg9];
        class43 var13 = var12.field5227;
        class365 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field1541[arg10];
            if (var14.field5227 != var13) {
                var14 = null;
            }
        }
        this.method596(false, arg2, var14, false, var12, arg1, arg4, arg8, arg5, null, var13, arg6);
        this.method514();
        this.method511();
    }

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method506();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method538(class391 arg0);

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method496(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILbba;IIZIILbba;)V")
    public final void method595(int arg0, int arg1, class98 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class98 arg8) {
        field1067++;
        if (arg6 == -1) {
            return;
        }
        this.method535();
        if (!this.method506()) {
            this.method511();
            return;
        }
        class365 var10 = arg8.field1541[arg6];
        class43 var11 = var10.field5227;
        class365 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field1541[arg7];
            if (var12.field5227 != var11) {
                var12 = null;
            }
        }
        if (arg3 >= -64) {
            field1071 = -111;
        }
        this.method596(false, arg1, var12, false, var10, arg4, null, arg5, 65535, null, var11, arg0);
        this.method514();
        this.method511();
    }

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method527(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public abstract void method530();

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method502();

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method524();

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method549(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILdf;ZLdf;I[IZI[ZLna;I)V")
    private final void method596(boolean arg0, int arg1, class365 arg2, boolean arg3, class365 arg4, int arg5, int[] arg6, boolean arg7, int arg8, boolean[] arg9, class43 arg10, int arg11) {
        field1069++;
        if (arg2 == null || arg11 == 0) {
            for (int var38 = 0; var38 < arg4.field5221; var38++) {
                short var39 = arg4.field5215[var38];
                if (arg9 == null || arg9[var39] == arg3 || arg10.field695[var39] == 0) {
                    short var40 = arg4.field5229[var38];
                    if (var40 != -1) {
                        this.method597(0, 84, arg10.field692[var40], arg6, 0, arg7, arg5, arg8 & arg10.field689[var40], 0, 0);
                    }
                    this.method597(arg4.field5223[var38], 101, arg10.field692[var39], arg6, arg10.field695[var39], arg7, arg5, arg8 & arg10.field689[var39], arg4.field5224[var38], arg4.field5228[var38]);
                }
            }
            return;
        }
        if (arg0) {
            this.method509();
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg10.field694; var15++) {
            boolean var16 = false;
            if (var13 < arg4.field5221 && arg4.field5215[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg2.field5221 && arg2.field5215[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg9 == null || arg3 == arg9[var15] || arg10.field695[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg10.field695[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var22 = arg4.field5228[var13];
                        var20 = arg4.field5229[var13];
                        var23 = arg4.field5224[var13];
                        var21 = arg4.field5218[var13];
                        var24 = arg4.field5223[var13];
                        var13++;
                    } else {
                        var20 = -1;
                        var21 = 0;
                        var22 = var18;
                        var23 = var18;
                        var24 = var18;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg2.field5223[var14];
                        var26 = arg2.field5218[var14];
                        var27 = arg2.field5228[var14];
                        var28 = arg2.field5224[var14];
                        var29 = arg2.field5229[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = 0;
                        var27 = var18;
                        var28 = var18;
                        var29 = -1;
                    }
                    if (var20 != -1) {
                        this.method597(0, -41, arg10.field692[var20], arg6, 0, arg7, arg5, arg10.field689[var20] & arg8, 0, 0);
                    } else if (var29 != -1) {
                        this.method597(0, -79, arg10.field692[var29], arg6, 0, arg7, arg5, arg10.field689[var29] & arg8, 0, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var33 = var22;
                        var34 = var23;
                        var35 = var24;
                    } else if (var19 == 2) {
                        int var30 = var28 - var23 & 0x3FFF;
                        int var31 = var27 - var22 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var25 - var24 & 0x3FFF;
                        var33 = arg11 * var31 / arg1 + var22 & 0x3FFF;
                        var34 = arg11 * var30 / arg1 + var23 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg11 * var32 / arg1 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var28 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var35 = 0;
                        var33 = 0;
                        var34 = arg11 * var36 / arg1 + var23 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var37 = var28 - var23 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var33 = (var27 - var22) * arg11 / arg1 + var22;
                        var34 = var23 + (arg11 * var37 / arg1) & 0x3F;
                        var35 = (var25 - var24) * arg11 / arg1 + var24;
                    } else {
                        var35 = (var25 - var24) * arg11 / arg1 + var24;
                        var33 = (var27 - var22) * arg11 / arg1 + var22;
                        var34 = (var28 - var23) * arg11 / arg1 + var23;
                    }
                    this.method597(var35, -75, arg10.field692[var15], arg6, var19, arg7, arg5, arg10.field689[var15] & arg8, var34, var33);
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

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method514();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()[Lin;")
    public abstract class77[] method487();

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method522(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[IIZIIII)V")
    private final void method597(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -87 % ((arg1 - 17) / 51);
        if (arg6 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var17 = -arg8;
                arg8 = arg0;
                arg0 = var17;
            } else if (arg4 == 3) {
                int var15 = arg8;
                arg8 = arg0;
                arg0 = var15;
            } else if (arg4 == 2) {
                int var16 = arg8;
                arg8 = -arg0 & 0x3FFF;
                arg0 = var16 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg8 = -arg8;
                arg0 = -arg0;
            } else if (arg4 == 2) {
                arg0 = -arg0 & 0x3FFF;
                arg8 = -arg8 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var14 = arg8;
                arg8 = -arg0;
                arg0 = var14;
            } else if (arg4 == 3) {
                int var12 = arg8;
                arg8 = arg0;
                arg0 = var12;
            } else if (arg4 == 2) {
                int var13 = arg8;
                arg8 = arg0 & 0x3FFF;
                arg0 = -var13 & 0x3FFF;
            }
        }
        field1061++;
        if (arg7 == 65535) {
            this.method504(arg4, arg2, arg8, arg9, arg0, arg6, arg5);
        } else {
            this.method549(arg4, arg2, arg8, arg9, arg0, arg5, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method512();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method529(int arg0, int arg1, class391 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
    public static final void method598(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < arg0) {
            class58.method623(arg1, arg0, 23309, class651.field9125[arg3], arg4);
        } else {
            class58.method623(arg1, arg4, arg2 ^ 0x1ECB, class651.field9125[arg3], arg0);
        }
        field1066++;
        if (arg2 != 17862) {
            method599(false);
        }
    }

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method499(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method546(int arg0);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method534();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class55 method532(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method548(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method516(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method544();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method497(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method492(int arg0, int arg1, class391 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lkd;II)V")
    public abstract void method495(class391 arg0, class253 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()[Llea;")
    public abstract class568[] method501();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
    public abstract void method511();

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method531();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method539(class55 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method545();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method504(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method500(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static void method599(boolean arg0) {
        if (!arg0) {
            field1070 = null;
            field1074 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method494(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILbba;)V")
    public final void method600(int arg0, int arg1, class98 arg2) {
        field1063++;
        if (arg0 == -1) {
            return;
        }
        this.method535();
        if (!this.method506()) {
            this.method511();
            return;
        }
        class365 var4 = arg2.field1541[arg0];
        class43 var5 = var4.field5227;
        int var6 = -103 % ((arg1 + 10) / 61);
        for (int var7 = 0; var7 < var4.field5221; var7++) {
            short var8 = var4.field5215[var7];
            if (var5.field691[var8]) {
                if (var4.field5229[var7] != -1) {
                    this.method516(0, 0, 0, 0);
                }
                this.method516(var5.field695[var8], var4.field5224[var7], var4.field5228[var7], var4.field5223[var7]);
            }
        }
        this.method514();
        this.method511();
    }

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method503();

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method488();

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method510();

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class54 method519(class54 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZIIILi;II)V")
    public final void method601(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class37 arg6, int arg7, int arg8) {
        field1064++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg1 / 2;
        if (arg2) {
            field1074 = null;
        }
        int var15 = arg6.method442(arg4 + var13, !arg2, arg8 + var14);
        int var16 = arg0 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg6.method442(arg4 + var16, !arg2, arg8 + var17);
        int var19 = -arg0 / 2;
        int var20 = arg1 / 2;
        int var21 = arg6.method442(arg4 + var19, true, arg8 + var20);
        int var22 = arg0 / 2;
        int var23 = arg1 / 2;
        int var24 = arg6.method442(arg4 + var22, !arg2, arg8 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg1 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg3 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg3;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (arg3 < var28) {
                        var28 = arg3;
                    }
                }
                this.method522(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        if (arg0 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg7 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg7;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg7) {
                        var31 = arg7;
                    }
                }
                this.method494(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg5;
        if (var34 != 0) {
            this.method548(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method525();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
    public abstract void method535();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lkd;I)V")
    public abstract void method513(class391 arg0, class253 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
    public abstract boolean method509();

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method507();

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method523(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIIILbba;[ZLbba;Lbba;IIILbba;I)V")
    public final void method602(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class98 arg6, boolean[] arg7, class98 arg8, class98 arg9, int arg10, int arg11, int arg12, class98 arg13, int arg14) {
        field1062++;
        if (arg3 == -1) {
            return;
        }
        if (arg7 == null || arg14 == -1) {
            this.method595(arg11, arg2, arg6, arg4 - 65653, 0, arg0, arg3, arg10, arg13);
            return;
        }
        this.method535();
        if (!this.method506()) {
            this.method511();
            return;
        }
        class365 var16 = arg13.field1541[arg3];
        class43 var17 = var16.field5227;
        class365 var18 = null;
        if (arg6 != null) {
            var18 = arg6.field1541[arg10];
            if (var18.field5227 != var17) {
                var18 = null;
            }
        }
        this.method596(false, arg2, var18, false, var16, 0, null, arg0, 65535, arg7, var17, arg11);
        class365 var19 = arg9.field1541[arg14];
        class365 var20 = null;
        if (arg8 != null) {
            var20 = arg8.field1541[arg1];
            if (var20.field5227 != var17) {
                var20 = null;
            }
        }
        this.method504(0, new int[0], 0, 0, 0, 0, arg0);
        this.method596(false, arg12, var20, true, var19, 0, null, arg0, arg4, arg7, var19.field5227, arg5);
        this.method514();
        this.method511();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
    public static final boolean method603(int arg0, int arg1, int arg2) {
        field1068++;
        if (arg0 != 2048) {
            method604((byte) -80);
        }
        return (arg2 & 0x70000) != 0 | class36.method423((byte) -113, arg2, arg1) || class182.method1225(arg1, 114, arg2);
    }

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method533(int arg0);

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method536(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static final void method604(byte arg0) {
        int var1 = 0;
        int var2 = 64 % ((83 - arg0) / 43);
        while (class426.field6275 > var1) {
            int var3 = class242.field3762[var1];
            class577 var4 = ((class16) class189.field2723.method1405((long) var3, (byte) -73)).field174;
            int var5 = class523.field7392.method3826(false);
            if ((var5 & 0x20) != 0) {
                var5 += class523.field7392.method3826(false) << 8;
            }
            if ((var5 & 0x4) != 0) {
                int[] var6 = new int[4];
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] = class523.field7392.method3855(-2);
                    if (var6[var7] == 65535) {
                        var6[var7] = -1;
                    }
                }
                int var8 = class523.field7392.method3851((byte) 30);
                class590.method3339(var4, var6, var8, true);
            }
            if ((var5 & 0x8) != 0) {
                if (var4.field8121.method3349(-1337255088)) {
                    class84.method742((byte) 21, var4);
                }
                var4.method3275(class393.field5824.method362(class523.field7392.method3859((byte) 76), (byte) 90), (byte) -96);
                var4.method2548(0, var4.field8121.field8345);
                var4.field6195 = var4.field8121.field8312 << 3;
                if (var4.field8121.method3349(-1337255088)) {
                    class83.method738(var4.field6271[0], var4, var4.field3019, var4.field6262[0], null, -25535, 0, null);
                }
            }
            if ((var5 & 0x400) != 0) {
                int var9 = class523.field7392.method3848(-1333735960);
                var4.field6224 = class523.field7392.method3851((byte) 30);
                var4.field6238 = class523.field7392.method3826(false);
                var4.field6165 = var9 & 0x7FFF;
                var4.field6217 = (var9 & 0x8000) != 0;
                var4.field6204 = class564.field7962 + var4.field6165 + var4.field6224;
            }
            if ((var5 & 0x10) != 0) {
                int var10 = class523.field7392.method3848(-1333735960);
                int var11 = class523.field7392.method3813((byte) 111);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var12 = class523.field7392.method3818((byte) 113);
                var4.method2546(false, (byte) -40, var12, var11, var10);
            }
            if ((var5 & 0x1) != 0) {
                var4.field8116 = class523.field7392.method3848(-1333735960);
                var4.field8126 = class523.field7392.method3848(-1333735960);
            }
            if ((var5 & 0x100) != 0) {
                int var13 = class523.field7392.method3855(-2);
                int var14 = class523.field7392.method3813((byte) 94);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var15 = class523.field7392.method3851((byte) 30);
                var4.method2546(true, (byte) -46, var15, var14, var13);
            }
            if ((var5 & 0x80) != 0) {
                int var16 = class523.field7392.method3815(-32768);
                int var17 = class523.field7392.method3851((byte) 30);
                var4.method2556(var16, var17, class564.field7962, (byte) 54);
                var4.field6210 = class564.field7962 + 300;
                var4.field6254 = class523.field7392.method3851((byte) 30);
            }
            if ((var5 & 0x40) != 0) {
                var4.field6234 = class523.field7392.method3836(false);
                var4.field6208 = 100;
            }
            if ((var5 & 0x800) != 0) {
                int var18 = class523.field7392.method3815(-32768);
                int var19 = class523.field7392.method3869(-128);
                var4.method2556(var18, var19, class564.field7962, (byte) 58);
            }
            if ((var5 & 0x200) != 0) {
                int var20 = class523.field7392.method3851((byte) 30);
                int[] var21 = new int[var20];
                int[] var22 = new int[var20];
                int[] var23 = new int[var20];
                for (int var24 = 0; var24 < var20; var24++) {
                    int var25 = class523.field7392.method3855(-2);
                    if (var25 == 65535) {
                        var25 = -1;
                    }
                    var21[var24] = var25;
                    var22[var24] = class523.field7392.method3826(false);
                    var23[var24] = class523.field7392.method3859((byte) 76);
                }
                class351.method2158(var23, 0, var4, var21, var22);
            }
            if ((var5 & 0x1000) != 0) {
                var4.field6249 = class523.field7392.method3819((byte) -76);
                var4.field6187 = class523.field7392.method3844(118);
                var4.field6183 = class523.field7392.method3844(126);
                var4.field6178 = class523.field7392.method3838(false);
                var4.field6169 = class523.field7392.method3848(-1333735960) + class564.field7962;
                var4.field6203 = class523.field7392.method3848(-1333735960) + class564.field7962;
                var4.field6179 = class523.field7392.method3869(-128);
                var4.field6269 = 1;
                var4.field6249 += var4.field6271[0];
                var4.field6183 += var4.field6271[0];
                var4.field6187 += var4.field6262[0];
                var4.field6178 += var4.field6262[0];
                var4.field6268 = 0;
            }
            if ((var5 & 0x2) != 0) {
                var4.field6171 = class523.field7392.method3859((byte) 76);
                if (var4.field6171 == 65535) {
                    var4.field6171 = -1;
                }
            }
            if ((var5 & 0x2000) != 0) {
                var4.field6198 = class523.field7392.method3844(126);
                var4.field6215 = class523.field7392.method3844(114);
                var4.field6221 = class523.field7392.method3827((byte) 104);
                var4.field6252 = (byte) class523.field7392.method3851((byte) 30);
                var4.field6228 = class564.field7962 + class523.field7392.method3855(-2);
                var4.field6185 = class564.field7962 + class523.field7392.method3859((byte) 76);
            }
            var1++;
        }
        field1065++;
    }
}
