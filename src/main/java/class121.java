import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class121 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1823 = 0;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "F")
    public static float field1827;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
    public abstract void method735(int arg0);

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
    public abstract void method705(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
    public abstract void method700(int arg0);

    @OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
    public abstract int method698();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lu;")
    public abstract class52[] method747();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILlo;)V")
    public final void method791(int arg0, int arg1, class528 arg2) {
        field1822++;
        if (arg0 == -1 || arg1 < 100 || !this.method715()) {
            return;
        }
        class316 var4 = arg2.field7811[arg0];
        class36 var5 = var4.field4514;
        for (int var6 = 0; var6 < var4.field4505; var6++) {
            short var7 = var4.field4506[var6];
            if (var5.field375[var7]) {
                if (var4.field4513[var6] != -1) {
                    this.method741(0, 0, 0, 0);
                }
                this.method741(var5.field378[var7], var4.field4511[var6], var4.field4519[var6], var4.field4504[var6]);
            }
        }
        this.method736();
    }

    @OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
    public abstract int method746();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIZIII[I[III)V")
    private final void method792(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, int arg9) {
        if (!arg0) {
            this.method735(39);
        }
        field1828++;
        if (arg8 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = -arg9;
                arg9 = arg3;
                arg3 = var13;
            } else if (arg1 == 3) {
                int var11 = arg9;
                arg9 = arg3;
                arg3 = var11;
            } else if (arg1 == 2) {
                int var12 = arg9;
                arg9 = -arg3 & 0x3FFF;
                arg3 = var12 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg3 = -arg3;
                arg9 = -arg9;
            } else if (arg1 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = arg9;
                arg9 = -arg3;
                arg3 = var16;
            } else if (arg1 == 3) {
                int var14 = arg9;
                arg9 = arg3;
                arg3 = var14;
            } else if (arg1 == 2) {
                int var15 = arg9;
                arg9 = arg3 & 0x3FFF;
                arg3 = -var15 & 0x3FFF;
            }
        }
        if (arg4 == 65535) {
            this.method695(arg1, arg6, arg9, arg5, arg3, arg8, arg2);
        } else {
            this.method689(arg1, arg6, arg9, arg5, arg3, arg2, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lc;")
    public abstract class121 method723(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
    public abstract void method736();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;IIIZ)V")
    public abstract void method722(class121 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
    public abstract int method743();

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()[Lat;")
    public abstract class255[] method703();

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
    public abstract void method744(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
    public abstract void method685(int arg0);

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
    public abstract void method731();

    @OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
    public abstract void method719(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lvk;II)V")
    public abstract void method691(class414 arg0, class247 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()Z")
    public abstract boolean method748();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILna;IIII)V")
    public final void method793(int arg0, int arg1, int arg2, int arg3, class35 arg4, int arg5, int arg6, int arg7, int arg8) {
        field1825++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg4.method202(arg1 + var13, arg8 + var14);
        int var16 = arg0 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg4.method202(arg1 + var16, arg8 + var17);
        int var19 = -arg0 / 2;
        if (arg7 <= 96) {
            return;
        }
        int var20 = arg3 / 2;
        int var21 = arg4.method202(arg1 + var19, arg8 + var20);
        int var22 = arg0 / 2;
        int var23 = arg3 / 2;
        int var24 = arg4.method202(arg1 + var22, arg8 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var18 >= var24 ? var24 : var18;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg3 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg5 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg5;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg5 < var29) {
                        var29 = arg5;
                    }
                }
                this.method735(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg0 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg6 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg6;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg6 < var32) {
                        var32 = arg6;
                    }
                }
                this.method700(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg2;
        if (var34 != 0) {
            this.method739(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public abstract int method709();

    @OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
    public abstract int method724();

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
    public abstract int method694();

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
    public abstract int method738();

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
    public abstract void method741(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
    public abstract void method695(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lj;)Lj;")
    public abstract class377 method745(class377 arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public abstract void method742(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
    public abstract void method732(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
    public static final boolean method794(int arg0, int arg1, int arg2) {
        field1819++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class519 var3 = class252.field3743.method2686(arg2, (byte) 90);
        if (arg1 == 16384) {
            if (arg0 >= 5 && arg0 <= 8) {
                arg0 = 4;
            }
            return var3.method3062((byte) -59, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lvk;I)V")
    public abstract void method720(class414 arg0, class247 arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Llo;IZIILlo;BII)V")
    public final void method795(class528 arg0, int arg1, boolean arg2, int arg3, int arg4, class528 arg5, byte arg6, int arg7, int arg8) {
        field1826++;
        if (arg7 == -1) {
            return;
        }
        if (arg6 >= -63) {
            field1827 = 0.7921338F;
        }
        if (!this.method715()) {
            return;
        }
        class316 var10 = arg0.field7811[arg7];
        class36 var11 = var10.field4514;
        class316 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field7811[arg8];
            if (var12.field4514 != var11) {
                var12 = null;
            }
        }
        this.method796(arg2, var10, null, arg4, arg3, var11, 2, false, arg1, null, 65535, var12);
        this.method736();
    }

    @OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
    public abstract int method717();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLwr;[IIILgp;IZI[ZILwr;)V")
    private final void method796(boolean arg0, class316 arg1, int[] arg2, int arg3, int arg4, class36 arg5, int arg6, boolean arg7, int arg8, boolean[] arg9, int arg10, class316 arg11) {
        if (arg6 != 2) {
            this.method723((byte) 87, 24, false);
        }
        field1821++;
        if (arg11 == null || arg4 == 0) {
            for (int var38 = 0; var38 < arg1.field4505; var38++) {
                short var39 = arg1.field4506[var38];
                if (arg9 == null || arg9[var39] == arg7 || arg5.field378[var39] == 0) {
                    short var40 = arg1.field4513[var38];
                    if (var40 != -1) {
                        this.method792(true, 0, arg0, 0, arg10 & arg5.field376[var40], 0, arg5.field377[var40], arg2, arg8, 0);
                    }
                    this.method792(true, arg5.field378[var39], arg0, arg1.field4504[var38], arg5.field376[var39] & arg10, arg1.field4519[var38], arg5.field377[var39], arg2, arg8, arg1.field4511[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg5.field374; var15++) {
            boolean var16 = false;
            if (arg1.field4505 > var13 && arg1.field4506[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg11.field4505 > var14 && arg11.field4506[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg9 == null || arg7 == arg9[var15] || arg5.field378[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg5.field378[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var23 = arg1.field4519[var13];
                        var20 = arg1.field4504[var13];
                        var21 = arg1.field4508[var13];
                        var24 = arg1.field4513[var13];
                        var22 = arg1.field4511[var13];
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
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var29 = arg11.field4508[var14];
                        var27 = arg11.field4511[var14];
                        var28 = arg11.field4513[var14];
                        var26 = arg11.field4519[var14];
                        var25 = arg11.field4504[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = var18;
                        var28 = -1;
                        var29 = 0;
                    }
                    if (var24 != -1) {
                        this.method792(true, 0, arg0, 0, arg10 & arg5.field376[var24], 0, arg5.field377[var24], arg2, arg8, 0);
                    } else if (var28 != -1) {
                        this.method792(true, 0, arg0, 0, arg10 & arg5.field376[var28], 0, arg5.field377[var28], arg2, arg8, 0);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var21 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var32 = var23;
                        var33 = var22;
                        var31 = var20;
                    } else if (var19 == 2) {
                        int var35 = var27 - var22 & 0x3FFF;
                        int var36 = var26 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var25 - var20 & 0x3FFF;
                        var33 = arg4 * var35 / arg3 + var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg4 * var36 / arg3 + var23 & 0x3FFF;
                        var31 = arg4 * var37 / arg3 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var27 - var22 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var33 = arg4 * var34 / arg3 + var22 & 0x3FFF;
                        var31 = 0;
                        var32 = 0;
                    } else if (var19 == 7) {
                        int var30 = var27 - var22 & 0x3F;
                        if (var30 >= 32) {
                            var30 -= 64;
                        }
                        var31 = (var25 - var20) * arg4 / arg3 + var20;
                        var32 = (var26 - var23) * arg4 / arg3 + var23;
                        var33 = var22 + (arg4 * var30 / arg3) & 0x3F;
                    } else {
                        var32 = (var26 - var23) * arg4 / arg3 + var23;
                        var33 = (var27 - var22) * arg4 / arg3 + var22;
                        var31 = (var25 - var20) * arg4 / arg3 + var20;
                    }
                    this.method792(true, var19, arg0, var31, arg10 & arg5.field376[var15], var32, arg5.field377[var15], arg2, arg8, var33);
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

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZIIII[ILlo;Llo;)V")
    public final void method797(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, class528 arg9, class528 arg10) {
        field1820++;
        if (arg1 == arg6 || !this.method715()) {
            return;
        }
        class316 var12 = arg9.field7811[arg6];
        class36 var13 = var12.field4514;
        class316 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field7811[arg7];
            if (var14.field4514 != var13) {
                var14 = null;
            }
        }
        this.method796(arg3, var12, arg8, arg4, arg5, var13, 2, false, arg2, null, arg0, var14);
        this.method736();
    }

    @OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
    public abstract boolean method715();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILia;Z)Z")
    public abstract boolean method706(int arg0, int arg1, class414 arg2, boolean arg3);

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
    public abstract int method711();

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILna;Lna;III)V")
    public abstract void method687(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
    public abstract int method716();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBZLlo;IILlo;IILlo;[ZLlo;II)V")
    public final void method798(int arg0, int arg1, byte arg2, boolean arg3, class528 arg4, int arg5, int arg6, class528 arg7, int arg8, int arg9, class528 arg10, boolean[] arg11, class528 arg12, int arg13, int arg14) {
        field1824++;
        if (arg6 == -1) {
            return;
        }
        if (arg11 == null || arg8 == -1) {
            this.method795(arg4, 0, arg3, arg0, arg5, arg10, (byte) -105, arg6, arg1);
        } else if (this.method715()) {
            class316 var16 = arg4.field7811[arg6];
            class36 var17 = var16.field4514;
            class316 var18 = null;
            if (arg10 != null) {
                var18 = arg10.field7811[arg1];
                if (var18.field4514 != var17) {
                    var18 = null;
                }
            }
            this.method796(arg3, var16, null, arg5, arg0, var17, 2, false, 0, arg11, 65535, var18);
            class316 var19 = arg12.field7811[arg8];
            class316 var20 = null;
            if (arg7 != null) {
                var20 = arg7.field7811[arg13];
                if (var20.field4514 != var17) {
                    var20 = null;
                }
            }
            if (arg2 == 27) {
                this.method695(0, new int[0], 0, 0, 0, 0, arg3);
                this.method796(arg3, var19, null, arg14, arg9, var19.field4514, 2, true, 0, arg11, 65535, var20);
                this.method736();
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
    public abstract void method713(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
    public abstract void method697(int arg0);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
    public abstract void method721();

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
    public abstract void method689(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
    public abstract void method739(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
    public abstract void method688(int arg0);

    static {
        new class475("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field1827 = 1.0F;
    }
}
