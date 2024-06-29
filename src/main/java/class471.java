import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class471 {

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lqp;")
    public static class466 field6882 = new class466(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Z")
    public static boolean field6883 = false;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[BIII)V", line = 7)
    public static final void method2769(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field6884++;
        if (arg3 >= arg5) {
            return;
        }
        int var6 = arg1 + arg3;
        if (arg4 != 32058) {
            field6883 = false;
        }
        int var7 = arg5 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg5 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLcq;)V", line = 53)
    public final void method2770(int arg0, boolean arg1, class327 arg2) {
        field6875++;
        if (arg0 == -1 || !this.method379()) {
            return;
        }
        class478 var4 = arg2.field4471[arg0];
        class367 var5 = var4.field6977;
        for (int var6 = 0; var6 < var4.field6983; var6++) {
            short var7 = var4.field6991[var6];
            if (var5.field5387[var7]) {
                if (var4.field6988[var6] != -1) {
                    this.method387(0, 0, 0, 0);
                }
                this.method387(var5.field5392[var7], var4.field6985[var6], var4.field6992[var6], var4.field6984[var6]);
            }
        }
        if (!arg1) {
            this.method373();
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lqf;IIILqf;[I[ZILhl;ZBZ)V", line = 98)
    private final void method2771(class478 arg0, int arg1, int arg2, int arg3, class478 arg4, int[] arg5, boolean[] arg6, int arg7, class367 arg8, boolean arg9, byte arg10, boolean arg11) {
        field6877++;
        if (arg4 == null || arg1 == 0) {
            for (int var38 = 0; var38 < arg0.field6983; var38++) {
                short var39 = arg0.field6991[var38];
                if (arg6 == null || arg6[var39] == arg11 || arg8.field5392[var39] == 0) {
                    short var40 = arg0.field6988[var38];
                    if (var40 != -1) {
                        this.method2773(0, arg2 & arg8.field5381[var40], 0, 0, arg9, -126, arg3, arg5, arg8.field5389[var40], 0);
                    }
                    this.method2773(arg8.field5392[var39], arg8.field5381[var39] & arg2, arg0.field6984[var38], arg0.field6985[var38], arg9, -128, arg3, arg5, arg8.field5389[var39], arg0.field6992[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg8.field5384; var15++) {
            boolean var16 = false;
            if (var13 < arg0.field6983 && arg0.field6991[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg4.field6983 && arg4.field6991[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg6 == null || arg11 == arg6[var15] || arg8.field5392[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg8.field5392[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg0.field6986[var13];
                        var21 = arg0.field6985[var13];
                        var22 = arg0.field6992[var13];
                        var23 = arg0.field6988[var13];
                        var24 = arg0.field6984[var13];
                        var13++;
                    } else {
                        var24 = var18;
                        var20 = 0;
                        var22 = var18;
                        var21 = var18;
                        var23 = -1;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg4.field6986[var14];
                        var26 = arg4.field6988[var14];
                        var27 = arg4.field6992[var14];
                        var28 = arg4.field6984[var14];
                        var29 = arg4.field6985[var14];
                        var14++;
                    } else {
                        var28 = var18;
                        var27 = var18;
                        var25 = 0;
                        var29 = var18;
                        var26 = -1;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var20 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var33 = var21;
                        var32 = var24;
                        var31 = var22;
                    } else if (var19 == 2) {
                        int var35 = var29 - var21 & 0x3FFF;
                        int var36 = var27 - var22 & 0x3FFF;
                        int var37 = var28 - var24 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var33 = arg1 * var35 / arg7 + var21 & 0x3FFF;
                        var31 = arg1 * var36 / arg7 + var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg1 * var37 / arg7 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var29 - var21 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var33 = arg1 * var34 / arg7 + var21 & 0x3FFF;
                        var32 = 0;
                        var31 = 0;
                    } else if (var19 == 7) {
                        int var30 = var29 - var21 & 0x3F;
                        if (var30 >= 32) {
                            var30 -= 64;
                        }
                        var31 = (var27 - var22) * arg1 / arg7 + var22;
                        var32 = (var28 - var24) * arg1 / arg7 + var24;
                        var33 = arg1 * var30 / arg7 + var21 & 0x3F;
                    } else {
                        var31 = (var27 - var22) * arg1 / arg7 + var22;
                        var32 = (var28 - var24) * arg1 / arg7 + var24;
                        var33 = var21 + ((var29 - var21) * arg1 / arg7);
                    }
                    if (var23 != -1) {
                        this.method2773(0, arg8.field5381[var23] & arg2, 0, 0, arg9, -126, arg3, arg5, arg8.field5389[var23], 0);
                    } else if (var26 != -1) {
                        this.method2773(0, arg8.field5381[var26] & arg2, 0, 0, arg9, -126, arg3, arg5, arg8.field5389[var26], 0);
                    }
                    this.method2773(var19, arg2 & arg8.field5381[var15], var32, var33, arg9, -126, arg3, arg5, arg8.field5389[var15], var31);
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
        if (arg10 <= 13) {
            field6883 = false;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 311)
    public static void method2772(byte arg0) {
        field6882 = null;
        if (arg0 != 1) {
            method2769(15, 4, null, 65, -16, -97);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIZII[I[II)V", line = 322)
    private final void method2773(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int[] arg7, int[] arg8, int arg9) {
        if (arg6 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = -arg3;
                arg3 = arg2;
                arg2 = var16;
            } else if (arg0 == 3) {
                int var15 = arg3;
                arg3 = arg2;
                arg2 = var15;
            } else if (arg0 == 2) {
                int var14 = arg3;
                arg3 = -arg2 & 0x3FFF;
                arg2 = var14 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg3 = -arg3;
                arg2 = -arg2;
            } else if (arg0 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = arg3;
                arg3 = -arg2;
                arg2 = var13;
            } else if (arg0 == 3) {
                int var11 = arg3;
                arg3 = arg2;
                arg2 = var11;
            } else if (arg0 == 2) {
                int var12 = arg3;
                arg3 = arg2 & 0x3FFF;
                arg2 = -var12 & 0x3FFF;
            }
        }
        field6878++;
        if (arg1 == 65535) {
            this.method410(arg0, arg8, arg3, arg9, arg2, arg6, arg4);
        } else {
            this.method378(arg0, arg8, arg3, arg9, arg2, arg4, arg1, arg7);
        }
        if (arg5 > -125) {
            this.method393(25);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILcq;Lcq;ZIIIZLcq;Lcq;II[ZI)V", line = 420)
    public final void method2774(int arg0, int arg1, class327 arg2, class327 arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8, class327 arg9, class327 arg10, int arg11, int arg12, boolean[] arg13, int arg14) {
        field6876++;
        if (arg6 == -1) {
            return;
        }
        if (arg13 == null || arg5 == -1) {
            this.method2777(arg9, arg11, arg8, arg6, arg10, arg0, 65535, arg7, 0);
        } else if (this.method379()) {
            class478 var16 = arg9.field4471[arg6];
            class367 var17 = var16.field6977;
            class478 var18 = null;
            if (arg10 != null) {
                var18 = arg10.field4471[arg0];
                if (var18.field6977 != var17) {
                    var18 = null;
                }
            }
            this.method2771(var16, arg7, 65535, 0, var18, null, arg13, arg11, var17, arg8, (byte) 109, false);
            class478 var19 = arg2.field4471[arg5];
            class478 var20 = null;
            if (arg3 != null) {
                var20 = arg3.field4471[arg14];
                if (var20.field6977 != var17) {
                    var20 = null;
                }
            }
            this.method410(0, new int[0], 0, 0, 0, 0, arg8);
            this.method2771(var19, arg12, 65535, 0, var20, null, arg13, arg1, var19.field6977, arg8, (byte) 102, arg4);
            this.method373();
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILcq;IILcq;[IIIIZ)V", line = 474)
    public final void method2775(int arg0, int arg1, class327 arg2, int arg3, int arg4, class327 arg5, int[] arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field6879++;
        if (arg0 == -1 || !this.method379()) {
            return;
        }
        class478 var12 = arg2.field4471[arg0];
        class367 var13 = var12.field6977;
        class478 var14 = null;
        if (arg4 != -15711) {
            field6882 = null;
        }
        if (arg5 != null) {
            var14 = arg5.field4471[arg3];
            if (var14.field6977 != var13) {
                var14 = null;
            }
        }
        this.method2771(var12, arg1, arg7, arg9, var14, arg6, null, arg8, var13, arg10, (byte) 51, false);
        this.method373();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILta;IIII)V", line = 533)
    public final void method2776(int arg0, int arg1, int arg2, int arg3, class142 arg4, int arg5, int arg6, int arg7, int arg8) {
        field6881++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg3 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg4.method361(arg6 + var13, arg7 + var14);
        if (arg0 <= 26) {
            return;
        }
        int var16 = arg3 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg4.method361(arg6 + var16, arg7 + var17);
        int var19 = -arg3 / 2;
        int var20 = arg2 / 2;
        int var21 = arg4.method361(arg6 + var19, arg7 + var20);
        int var22 = arg3 / 2;
        int var23 = arg2 / 2;
        int var24 = arg4.method361(arg6 + var22, arg7 + var23);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg2 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg5 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg5;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (var29 > arg5) {
                        var29 = arg5;
                    }
                }
                this.method396(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg3 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg8 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg8;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg8 < var32) {
                        var32 = arg8;
                    }
                }
                this.method409(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg1;
        if (var34 != 0) {
            this.method392(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lcq;IZILcq;IIII)V", line = 655)
    public final void method2777(class327 arg0, int arg1, boolean arg2, int arg3, class327 arg4, int arg5, int arg6, int arg7, int arg8) {
        field6880++;
        if (arg3 == -1 || !this.method379()) {
            return;
        }
        class478 var10 = arg0.field4471[arg3];
        class367 var11 = var10.field6977;
        class478 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field4471[arg5];
            if (var12.field6977 != var11) {
                var12 = null;
            }
        }
        this.method2771(var10, arg7, arg6, arg8, var12, null, null, arg1, var11, arg2, (byte) 70, false);
        this.method373();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lii;I)V")
    public abstract void method397(class122 arg0, class387 arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
    public abstract void method387(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
    public abstract int method395();

    @OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
    public abstract int method372();

    @OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
    public abstract int method404();

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public abstract void method376(int arg0);

    @OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
    public abstract void method378(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()[Lpd;")
    public abstract class169[] method374();

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
    public abstract void method383(int arg0);

    @OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
    public abstract int method389();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
    public abstract boolean method379();

    @OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
    public abstract void method400(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
    public abstract void method402(int arg0);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
    public abstract void method392(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lii;II)V")
    public abstract void method384(class122 arg0, class387 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
    public abstract void method409(int arg0);

    @OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
    public abstract int method380();

    @OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
    public abstract void method385(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lt;")
    public abstract class471 method381(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
    public abstract int method370();

    @OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
    public abstract int method386();

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Z")
    public abstract boolean method388();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method391(int arg0, int arg1, class122 arg2, boolean arg3);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
    public abstract void method373();

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
    public abstract int method394();

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
    public abstract int method368();

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
    public abstract void method408(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lba;)Lba;")
    public abstract class263 method369(class263 arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lt;IIIZ)V")
    public abstract void method375(class471 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()[Lqc;")
    public abstract class521[] method406();

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(IILta;Lta;III)V")
    public abstract void method405(int arg0, int arg1, class142 arg2, class142 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    public abstract void method390(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
    public abstract void method371();

    @OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
    public abstract void method410(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
    public abstract void method396(int arg0);

    @OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
    public abstract int method382();

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
    public abstract void method393(int arg0);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
    public abstract void method403(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
    public abstract void method398();
}
