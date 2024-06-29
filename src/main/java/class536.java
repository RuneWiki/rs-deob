import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class536 {

    @OriginalMember(owner = "client!e", name = "g", descriptor = "[I")
    public static int[] field7849 = new int[13];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Llm;")
    public static class31 field7843 = new class31(12, 19);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lqu;")
    public static class219 field7853 = new class219(52, 4);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
    public abstract int method279();

    @OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
    public abstract void method319(int arg0);

    @OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
    public abstract void method302(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()Z")
    public abstract boolean method306();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII[IIIZI[I)V")
    private final void method3172(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg1 == 1) {
            if (arg3 == 0 || arg3 == 1) {
                int var13 = -arg2;
                arg2 = arg0;
                arg0 = var13;
            } else if (arg3 == 3) {
                int var11 = arg2;
                arg2 = arg0;
                arg0 = var11;
            } else if (arg3 == 2) {
                int var12 = arg2;
                arg2 = -arg0 & 0x3FFF;
                arg0 = var12 & 0x3FFF;
            }
        } else if (arg1 == 2) {
            if (arg3 == 0 || arg3 == 1) {
                arg2 = -arg2;
                arg0 = -arg0;
            } else if (arg3 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg0 = -arg0 & 0x3FFF;
            }
        } else if (arg1 == 3) {
            if (arg3 == 0 || arg3 == 1) {
                int var16 = arg2;
                arg2 = -arg0;
                arg0 = var16;
            } else if (arg3 == 3) {
                int var15 = arg2;
                arg2 = arg0;
                arg0 = var15;
            } else if (arg3 == 2) {
                int var14 = arg2;
                arg2 = arg0 & 0x3FFF;
                arg0 = -var14 & 0x3FFF;
            }
        }
        field7848++;
        if (arg6 == 65535) {
            this.method288(arg3, arg4, arg2, arg8, arg0, arg1, arg7);
        } else {
            this.method293(arg3, arg4, arg2, arg8, arg0, arg7, arg6, arg9);
        }
        int var17 = 91 / ((arg5 - 33) / 51);
    }

    @OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
    public abstract void method288(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
    public abstract void method275(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public abstract void method324(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public abstract void method293(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
    public abstract void method328();

    @OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
    public abstract int method308();

    @OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
    public abstract void method278(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZIIILnb;Lnb;ILnb;Lnb;B[ZII)V")
    public final void method3173(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class249 arg6, class249 arg7, int arg8, class249 arg9, class249 arg10, byte arg11, boolean[] arg12, int arg13, int arg14) {
        field7851++;
        if (arg5 == -1) {
            return;
        }
        if (arg12 == null || arg8 == -1) {
            this.method3181(0, arg5, arg3, 114, arg9, arg13, arg2, arg0, arg10);
        } else if (this.method271()) {
            class124 var16 = arg10.field4046[arg5];
            class231 var17 = var16.field1687;
            class124 var18 = null;
            if (arg9 != null) {
                var18 = arg9.field4046[arg3];
                if (var18.field1687 != var17) {
                    var18 = null;
                }
            }
            this.method3180(var16, arg12, arg0, 0, false, null, arg2, 84, arg13, var17, var18, 65535);
            if (arg11 > -7) {
                field7843 = null;
            }
            class124 var19 = arg6.field4046[arg8];
            class124 var20 = null;
            if (arg7 != null) {
                var20 = arg7.field4046[arg14];
                if (var20.field1687 != var17) {
                    var20 = null;
                }
            }
            this.method288(0, new int[0], 0, 0, 0, 0, arg2);
            this.method3180(var19, arg12, arg1, 0, true, null, arg2, 103, arg4, var19.field1687, var20, 65535);
            this.method328();
        }
    }

    @OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
    public abstract int method287();

    @OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
    public abstract void method269(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
    public abstract int method305();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IIIZ)V")
    public abstract void method268(class536 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILnb;Z)V")
    public final void method3174(int arg0, class249 arg1, boolean arg2) {
        field7844++;
        if (arg0 == -1 || !this.method271()) {
            return;
        }
        class124 var4 = arg1.field4046[arg0];
        class231 var5 = var4.field1687;
        for (int var6 = 0; var6 < var4.field1693; var6++) {
            short var7 = var4.field1686[var6];
            if (var5.field3818[var7]) {
                if (var4.field1682[var6] != -1) {
                    this.method302(0, 0, 0, 0);
                }
                this.method302(var5.field3820[var7], var4.field1677[var6], var4.field1692[var6], var4.field1691[var6]);
            }
        }
        this.method328();
        if (!arg2) {
            field7853 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIILya;I)V")
    public final void method3175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class223 arg7, int arg8) {
        field7846++;
        if (arg2 != 2196) {
            this.method289();
        }
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg8 / 2;
        int var14 = -arg6 / 2;
        int var15 = arg7.method692(arg4 + var13, arg3 + var14);
        int var16 = arg8 / 2;
        int var17 = -arg6 / 2;
        int var18 = arg7.method692(arg4 + var16, arg3 + var17);
        int var19 = -arg8 / 2;
        int var20 = arg6 / 2;
        int var21 = arg7.method692(arg4 + var19, arg3 + var20);
        int var22 = arg8 / 2;
        int var23 = arg6 / 2;
        int var24 = arg7.method692(arg4 + var22, arg3 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 > var18 ? var18 : var24;
        if (arg6 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg0 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg0;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (arg0 < var28) {
                        var28 = arg0;
                    }
                }
                this.method278(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        if (arg8 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg1 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg1;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg1) {
                        var31 = arg1;
                    }
                }
                this.method319(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > (var18 + var21)) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg5;
        if (var34 != 0) {
            this.method325(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
    public abstract int method323();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lkk;II)V")
    public abstract void method313(class205 arg0, class182 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "EA", descriptor = "(Li;)Li;")
    public abstract class521 method330(class521 arg0);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()[Lol;")
    public abstract class293[] method292();

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
    public abstract int method314();

    @OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
    public abstract void method272();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method3176(byte arg0) {
        if (arg0 != -56) {
            field7849 = null;
        }
        field7853 = null;
        field7849 = null;
        field7843 = null;
    }

    @OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
    public abstract void method291(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILnb;[IBLnb;ZIIII)V")
    public final void method3177(int arg0, int arg1, class249 arg2, int[] arg3, byte arg4, class249 arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field7845++;
        if (arg10 == -1 || !this.method271()) {
            return;
        }
        int var12 = 32 % ((arg4 + 25) / 56);
        class124 var13 = arg2.field4046[arg10];
        class231 var14 = var13.field1687;
        class124 var15 = null;
        if (arg5 != null) {
            var15 = arg5.field4046[arg8];
            if (var15.field1687 != var14) {
                var15 = null;
            }
        }
        this.method3180(var13, null, arg0, arg9, false, arg3, arg6, 120, arg7, var14, var15, arg1);
        this.method328();
    }

    @OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
    public abstract int method270();

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()[Lvc;")
    public abstract class100[] method326();

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
    public abstract int method289();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method298(int arg0, int arg1, class205 arg2, boolean arg3);

    @OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
    public abstract void method280(int arg0);

    @OriginalMember(owner = "client!e", name = "da", descriptor = "(IILya;Lya;III)V")
    public abstract void method307(int arg0, int arg1, class223 arg2, class223 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lkk;I)V")
    public abstract void method295(class205 arg0, class182 arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
    public abstract void method309(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
    public abstract boolean method271();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method3178(int arg0, byte arg1, String arg2) {
        field7850++;
        class456 var3 = class233.method1654(arg0, 3, 123);
        if (arg1 != 88) {
            method3179(-107, 43, -8, null);
        }
        var3.method2858(10250);
        var3.field7037 = arg2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3179(int arg0, int arg1, int arg2, Class arg3) {
        class409 var4 = class217.field3699[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class192 var5 = var4.field6175; var5 != null; var5 = var5.field2841) {
            class423 var6 = var5.field2845;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6423 == arg1 && var6.field6424 == arg2) {
                class250.method1728(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Le;")
    public abstract class536 method329(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
    public abstract void method290(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public abstract void method325(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ltn;[ZIIZ[IZIILwo;Ltn;I)V")
    private final void method3180(class124 arg0, boolean[] arg1, int arg2, int arg3, boolean arg4, int[] arg5, boolean arg6, int arg7, int arg8, class231 arg9, class124 arg10, int arg11) {
        field7847++;
        if (arg10 == null || arg2 == 0) {
            for (int var38 = 0; var38 < arg0.field1693; var38++) {
                short var39 = arg0.field1686[var38];
                if (arg1 == null || arg4 == arg1[var39] || arg9.field3820[var39] == 0) {
                    short var40 = arg0.field1682[var38];
                    if (var40 != -1) {
                        this.method3172(0, arg3, 0, 0, arg9.field3824[var40], -38, arg11 & arg9.field3826[var40], arg6, 0, arg5);
                    }
                    this.method3172(arg0.field1691[var38], arg3, arg0.field1677[var38], arg9.field3820[var39], arg9.field3824[var39], -57, arg9.field3826[var39] & arg11, arg6, arg0.field1692[var38], arg5);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg9.field3827; var15++) {
            boolean var16 = false;
            if (var13 < arg0.field1693 && arg0.field1686[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg10.field1693 > var14 && arg10.field1686[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg1 == null || arg1[var15] == arg4 || arg9.field3820[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg9.field3820[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg0.field1682[var13];
                        var21 = arg0.field1685[var13];
                        var22 = arg0.field1692[var13];
                        var23 = arg0.field1677[var13];
                        var24 = arg0.field1691[var13];
                        var13++;
                    } else {
                        var24 = var18;
                        var21 = 0;
                        var20 = -1;
                        var22 = var18;
                        var23 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg10.field1682[var14];
                        var26 = arg10.field1692[var14];
                        var27 = arg10.field1691[var14];
                        var28 = arg10.field1677[var14];
                        var29 = arg10.field1685[var14];
                        var14++;
                    } else {
                        var26 = var18;
                        var29 = 0;
                        var28 = var18;
                        var25 = -1;
                        var27 = var18;
                    }
                    int var30;
                    int var31;
                    int var32;
                    if ((var21 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var30 = var24;
                        var31 = var23;
                        var32 = var22;
                    } else if (var19 == 2) {
                        int var35 = var28 - var23 & 0x3FFF;
                        int var36 = var26 - var22 & 0x3FFF;
                        int var37 = var27 - var24 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        var32 = arg2 * var36 / arg8 + var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = arg2 * var35 / arg8 + var23 & 0x3FFF;
                        var30 = arg2 * var37 / arg8 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var28 - var23 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var30 = 0;
                        var32 = 0;
                        var31 = arg2 * var34 / arg8 + var23 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var33 = var28 - var23 & 0x3F;
                        if (var33 >= 32) {
                            var33 -= 64;
                        }
                        var31 = var23 + (arg2 * var33 / arg8) & 0x3F;
                        var32 = (var26 - var22) * arg2 / arg8 + var22;
                        var30 = (var27 - var24) * arg2 / arg8 + var24;
                    } else {
                        var30 = (var27 - var24) * arg2 / arg8 + var24;
                        var31 = (var28 - var23) * arg2 / arg8 + var23;
                        var32 = (var26 - var22) * arg2 / arg8 + var22;
                    }
                    if (var20 != -1) {
                        this.method3172(0, arg3, 0, 0, arg9.field3824[var20], -82, arg9.field3826[var20] & arg11, arg6, 0, arg5);
                    } else if (var25 != -1) {
                        this.method3172(0, arg3, 0, 0, arg9.field3824[var25], -70, arg9.field3826[var25] & arg11, arg6, 0, arg5);
                    }
                    this.method3172(var30, arg3, var31, var19, arg9.field3824[var15], 98, arg11 & arg9.field3826[var15], arg6, var32, arg5);
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
        if (arg7 <= 44) {
            method3179(-54, 67, 24, null);
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
    public abstract void method303();

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public abstract int method318();

    @OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
    public abstract void method317(int arg0);

    @OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
    public abstract int method310();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIILnb;IZILnb;)V")
    public final void method3181(int arg0, int arg1, int arg2, int arg3, class249 arg4, int arg5, boolean arg6, int arg7, class249 arg8) {
        field7852++;
        if (arg1 == -1) {
            return;
        }
        if (arg3 < 97) {
            this.method269(-94, -92, 68);
        }
        if (!this.method271()) {
            return;
        }
        class124 var10 = arg8.field4046[arg1];
        class231 var11 = var10.field1687;
        class124 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field4046[arg2];
            if (var12.field1687 != var11) {
                var12 = null;
            }
        }
        this.method3180(var10, null, arg7, arg0, false, null, arg6, 81, arg5, var11, var12, 65535);
        this.method328();
    }

    @OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
    public abstract void method273(short arg0, short arg1);
}
