import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class530 {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field7786 = 0;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lfr;")
    public static class231 field7787 = new class231(50);

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lvv;")
    public static class313 field7793 = new class313(88, 4);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lvv;")
    public static class313 field7794;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Ljc;")
    public static class356 field7795;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public abstract void method773(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public abstract void method748(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Ltq;I)V")
    public abstract void method736(class202 arg0, class273 arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([IZIIII[IIII)V")
    private final void method3134(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
        if (arg9 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = -arg3;
                arg3 = arg7;
                arg7 = var16;
            } else if (arg4 == 3) {
                int var15 = arg3;
                arg3 = arg7;
                arg7 = var15;
            } else if (arg4 == 2) {
                int var14 = arg3;
                arg3 = -arg7 & 0x3FFF;
                arg7 = var14 & 0x3FFF;
            }
        } else if (arg9 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg3 = -arg3;
                arg7 = -arg7;
            } else if (arg4 == 2) {
                arg7 = -arg7 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg9 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = arg3;
                arg3 = -arg7;
                arg7 = var13;
            } else if (arg4 == 3) {
                int var12 = arg3;
                arg3 = arg7;
                arg7 = var12;
            } else if (arg4 == 2) {
                int var11 = arg3;
                arg3 = arg7 & 0x3FFF;
                arg7 = -var11 & 0x3FFF;
            }
        }
        if (arg2 != 16383) {
            field7787 = null;
        }
        field7791++;
        if (arg5 == 65535) {
            this.method732(arg4, arg6, arg3, arg8, arg7, arg9, arg1);
        } else {
            this.method748(arg4, arg6, arg3, arg8, arg7, arg1, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
    public abstract void method764();

    @OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
    public abstract void method746(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III[ZIIILdl;ILdl;IZILdl;Ldl;)V")
    public final void method3135(int arg0, int arg1, int arg2, boolean[] arg3, int arg4, int arg5, int arg6, class48 arg7, int arg8, class48 arg9, int arg10, boolean arg11, int arg12, class48 arg13, class48 arg14) {
        field7785++;
        if (arg6 == -1) {
            return;
        }
        if (arg3 == null || arg0 == -1) {
            this.method3138(arg13, arg10, arg6, arg4, arg11, arg9, 0, arg8, arg1);
        } else if (this.method775()) {
            class233 var16 = arg13.field765[arg6];
            class191 var17 = var16.field4043;
            class233 var18 = null;
            if (arg9 != null) {
                var18 = arg9.field765[arg4];
                if (var18.field4043 != var17) {
                    var18 = null;
                }
            }
            this.method3140(1, arg10, null, arg11, false, var17, arg1, 0, var16, 65535, var18, arg3);
            class233 var19 = arg14.field765[arg0];
            class233 var20 = null;
            if (arg7 != null) {
                var20 = arg7.field765[arg2];
                if (var20.field4043 != var17) {
                    var20 = null;
                }
            }
            this.method732(0, new int[0], 0, arg8, 0, 0, arg11);
            this.method3140(1, arg5, null, arg11, true, var19.field4043, arg12, 0, var19, 65535, var20, arg3);
            this.method764();
        }
    }

    @OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
    public abstract void method733(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III[ILdl;ZLdl;IIII)V")
    public final void method3136(int arg0, int arg1, int arg2, int[] arg3, class48 arg4, boolean arg5, class48 arg6, int arg7, int arg8, int arg9, int arg10) {
        field7788++;
        if (arg1 == -1 || arg9 <= 57 || !this.method775()) {
            return;
        }
        class233 var12 = arg6.field765[arg1];
        class191 var13 = var12.field4043;
        class233 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field765[arg10];
            if (var14.field4043 != var13) {
                var14 = null;
            }
        }
        this.method3140(1, arg0, arg3, arg5, false, var13, arg7, arg2, var12, arg8, var14, null);
        this.method764();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static void method3137(boolean arg0) {
        field7793 = null;
        field7787 = null;
        field7794 = null;
        if (!arg0) {
            field7787 = null;
        }
        field7795 = null;
    }

    @OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
    public abstract int method726();

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
    public abstract int method751();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ldl;IIIZLdl;III)V")
    public final void method3138(class48 arg0, int arg1, int arg2, int arg3, boolean arg4, class48 arg5, int arg6, int arg7, int arg8) {
        field7790++;
        if (~arg2 == arg7 || !this.method775()) {
            return;
        }
        class233 var10 = arg0.field765[arg2];
        class191 var11 = var10.field4043;
        class233 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field765[arg3];
            if (var12.field4043 != var11) {
                var12 = null;
            }
        }
        this.method3140(1, arg1, null, arg4, false, var11, arg8, arg6, var10, 65535, var12, null);
        this.method764();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Ltq;II)V")
    public abstract void method738(class202 arg0, class273 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZILdl;)V")
    public final void method3139(boolean arg0, int arg1, class48 arg2) {
        field7784++;
        if (!arg0) {
            this.method3136(42, -34, -98, null, null, true, null, -93, -102, 41, -77);
        }
        if (arg1 == -1 || !this.method775()) {
            return;
        }
        class233 var4 = arg2.field765[arg1];
        class191 var5 = var4.field4043;
        for (int var6 = 0; var6 < var4.field4039; var6++) {
            short var7 = var4.field4040[var6];
            if (var5.field2969[var7]) {
                if (var4.field4033[var6] != -1) {
                    this.method733(0, 0, 0, 0);
                }
                this.method733(var5.field2967[var7], var4.field4036[var6], var4.field4038[var6], var4.field4032[var6]);
            }
        }
        this.method764();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public abstract void method755(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
    public abstract void method763(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public abstract void method743();

    @OriginalMember(owner = "client!e", name = "da", descriptor = "(IILya;Lya;III)V")
    public abstract void method767(int arg0, int arg1, class220 arg2, class220 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
    public abstract int method752();

    @OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
    public abstract int method760();

    @OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
    public abstract void method765(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
    public abstract void method762(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IIIZ)V")
    public abstract void method772(class530 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()Z")
    public abstract boolean method729();

    @OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
    public abstract void method756(int arg0);

    @OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
    public abstract int method741();

    @OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
    public abstract void method730();

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()[Lgh;")
    public abstract class345[] method777();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Le;")
    public abstract class530 method739(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public abstract int method769();

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
    public abstract boolean method775();

    @OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
    public abstract int method766();

    @OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
    public abstract void method761(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method776(int arg0, int arg1, class202 arg2, boolean arg3);

    @OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
    public abstract void method768(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "EA", descriptor = "(Li;)Li;")
    public abstract class515 method774(class515 arg0);

    @OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
    public abstract void method732(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
    public abstract void method744(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[IZZLae;IILpr;ILpr;[Z)V")
    private final void method3140(int arg0, int arg1, int[] arg2, boolean arg3, boolean arg4, class191 arg5, int arg6, int arg7, class233 arg8, int arg9, class233 arg10, boolean[] arg11) {
        field7789++;
        if (arg10 == null || arg6 == 0) {
            for (int var38 = 0; var38 < arg8.field4039; var38++) {
                short var39 = arg8.field4040[var38];
                if (arg11 == null || arg4 == arg11[var39] || arg5.field2967[var39] == 0) {
                    short var40 = arg8.field4033[var38];
                    if (var40 != -1) {
                        this.method3134(arg2, arg3, arg0 + 16382, 0, 0, arg9 & arg5.field2973[var40], arg5.field2975[var40], 0, 0, arg7);
                    }
                    this.method3134(arg2, arg3, 16383, arg8.field4036[var38], arg5.field2967[var39], arg9 & arg5.field2973[var39], arg5.field2975[var39], arg8.field4032[var38], arg8.field4038[var38], arg7);
                }
            }
            return;
        }
        if (arg0 != 1) {
            field7787 = null;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg5.field2976; var15++) {
            boolean var16 = false;
            if (var13 < arg8.field4039 && arg8.field4040[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg10.field4039 > var14 && arg10.field4040[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg11[var15] == arg4 || arg5.field2967[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg5.field2967[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg8.field4033[var13];
                        var24 = arg8.field4036[var13];
                        var22 = arg8.field4032[var13];
                        var23 = arg8.field4038[var13];
                        var21 = arg8.field4028[var13];
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
                        var29 = arg10.field4036[var14];
                        var25 = arg10.field4032[var14];
                        var27 = arg10.field4033[var14];
                        var26 = arg10.field4028[var14];
                        var28 = arg10.field4038[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = 0;
                        var27 = -1;
                        var28 = var18;
                        var29 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var35 = var22;
                        var34 = var23;
                        var33 = var24;
                    } else if (var19 == 2) {
                        int var30 = var29 - var24 & 0x3FFF;
                        int var31 = var28 - var23 & 0x3FFF;
                        int var32 = var25 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg6 * var30 / arg1 + var24 & 0x3FFF;
                        var34 = var23 + (arg6 * var31 / arg1) & 0x3FFF;
                        var35 = arg6 * var32 / arg1 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var29 - var24 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var33 = arg6 * var36 / arg1 + var24 & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var37 = var29 - var24 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = var23 + ((var28 - var23) * arg6 / arg1);
                        var33 = arg6 * var37 / arg1 + var24 & 0x3F;
                        var35 = (var25 - var22) * arg6 / arg1 + var22;
                    } else {
                        var33 = var24 + ((var29 - var24) * arg6 / arg1);
                        var35 = (var25 - var22) * arg6 / arg1 + var22;
                        var34 = (var28 - var23) * arg6 / arg1 + var23;
                    }
                    if (var20 != -1) {
                        this.method3134(arg2, arg3, 16383, 0, 0, arg9 & arg5.field2973[var20], arg5.field2975[var20], 0, 0, arg7);
                    } else if (var27 != -1) {
                        this.method3134(arg2, arg3, 16383, 0, 0, arg5.field2973[var27] & arg9, arg5.field2975[var27], 0, 0, arg7);
                    }
                    this.method3134(arg2, arg3, 16383, var33, var19, arg9 & arg5.field2973[var15], arg5.field2975[var15], var35, var34, arg7);
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

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
    public abstract int method745();

    @OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
    public abstract void method728(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
    public abstract int method749();

    @OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
    public abstract void method734(int arg0);

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()[Lhv;")
    public abstract class150[] method727();

    @OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
    public abstract int method735();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIILya;I)V")
    public final void method3141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class220 arg7, int arg8) {
        field7792++;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg7.method1517(arg6 + var13, arg1 + var14);
        int var16 = arg0 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg7.method1517(arg6 + var16, arg1 - -var17);
        int var19 = -arg0 / 2;
        int var20 = arg8 / 2;
        int var21 = arg7.method1517(arg6 + var19, arg1 + var20);
        int var22 = arg0 / 2;
        int var23 = arg8 / 2;
        int var24 = arg7.method1517(arg6 + var22, arg1 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = var18 >= var24 ? var24 : var18;
        if (arg8 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg2 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg2;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (arg2 < var28) {
                        var28 = arg2;
                    }
                }
                this.method734(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        int var31 = var15 + var24;
        if (arg0 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg5 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg5;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (var32 > arg5) {
                        var32 = arg5;
                    }
                }
                this.method761(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg4;
        if (var34 != 0) {
            this.method773(0, var34, 0);
        }
    }

    static {
        new class306("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field7794 = new class313(65, 3);
        field7795 = new class356(13, 6);
    }
}
