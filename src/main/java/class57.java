import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class class57 {

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lsc;")
    public static class250 field794 = new class250();

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)I", line = 4)
    public static final int method401(byte arg0, int arg1, int arg2) {
        field792++;
        if (arg2 == 1 || arg2 == 3) {
            return class109.field1551[arg1 & 0x3];
        } else {
            if (arg0 != -59) {
                method406(86);
            }
            return class31.field410[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 23)
    public static void method406(int arg0) {
        if (arg0 == 0) {
            field794 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lun;ILun;IIZIII)V", line = 41)
    public final void method410(class110 arg0, int arg1, class110 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field791++;
        if (arg6 == -1 || !this.method432()) {
            return;
        }
        class113 var10 = arg0.field1557[arg6];
        class191 var11 = var10.field1581;
        class113 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field1557[arg3];
            if (var12.field1581 != var11) {
                var12 = null;
            }
        }
        this.method412(var11, arg5, arg7, 65535, var12, false, arg1, arg8, var10, (boolean[]) null, (int[]) null, arg4 ^ 0x1042);
        if (arg4 != -4222) {
            field794 = null;
        }
        this.method429();
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Llr;ZIILaf;ZIILaf;[Z[II)V", line = 78)
    private final void method412(class191 arg0, boolean arg1, int arg2, int arg3, class113 arg4, boolean arg5, int arg6, int arg7, class113 arg8, boolean[] arg9, int[] arg10, int arg11) {
        field795++;
        if (arg4 == null || arg7 == 0) {
            for (int var37 = 0; var37 < arg8.field1575; var37++) {
                short var38 = arg8.field1579[var37];
                if (arg9 == null || arg5 == arg9[var38] || arg0.field2928[var38] == 0) {
                    short var39 = arg8.field1577[var37];
                    if (var39 != -1) {
                        this.method438(arg0.field2923[var39] & arg3, arg1, 0, 0, arg10, arg6, 0, arg0.field2927[var39], (byte) -81, 0);
                    }
                    this.method438(arg0.field2923[var38] & arg3, arg1, arg8.field1576[var37], arg8.field1578[var37], arg10, arg6, arg8.field1580[var37], arg0.field2927[var38], (byte) -81, arg0.field2928[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg11 >= -37) {
            field794 = null;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg0.field2929; var15++) {
            boolean var16 = false;
            if (var13 < arg8.field1575 && arg8.field1579[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg4.field1575 > var14 && arg4.field1579[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg9 == null || arg5 == arg9[var15] || arg0.field2928[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field2928[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var20 = arg8.field1577[var13];
                        var21 = arg8.field1578[var13];
                        var22 = arg8.field1576[var13];
                        var23 = arg8.field1582[var13];
                        var24 = arg8.field1580[var13];
                        var13++;
                    } else {
                        var24 = var18;
                        var22 = var18;
                        var20 = -1;
                        var23 = 0;
                        var21 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg4.field1576[var14];
                        var26 = arg4.field1578[var14];
                        var27 = arg4.field1577[var14];
                        var28 = arg4.field1580[var14];
                        var29 = arg4.field1582[var14];
                        var14++;
                    } else {
                        var26 = var18;
                        var25 = var18;
                        var29 = 0;
                        var27 = -1;
                        var28 = var18;
                    }
                    if (var20 != -1) {
                        this.method438(arg3 & arg0.field2923[var20], arg1, 0, 0, arg10, arg6, 0, arg0.field2927[var20], (byte) -81, 0);
                    } else if (var27 != -1) {
                        this.method438(arg3 & arg0.field2923[var27], arg1, 0, 0, arg10, arg6, 0, arg0.field2927[var27], (byte) -81, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var23 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var33 = var24;
                        var34 = var21;
                        var35 = var22;
                    } else if (var19 == 2) {
                        int var30 = var26 - var21 & 0x3FFF;
                        int var31 = var28 - var24 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var25 - var22 & 0x3FFF;
                        var33 = var24 + (arg7 * var31 / arg2) & 0x3FFF;
                        var34 = arg7 * var30 / arg2 + var21 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg7 * var32 / arg2 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var26 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var34 = arg7 * var36 / arg2 + var21 & 0x3F;
                        var33 = var24 + ((var28 - var24) * arg7 / arg2);
                        var35 = var22 + ((var25 - var22) * arg7 / arg2);
                    } else {
                        var34 = (var26 - var21) * arg7 / arg2 + var21;
                        var35 = (var25 - var22) * arg7 / arg2 + var22;
                        var33 = (var28 - var24) * arg7 / arg2 + var24;
                    }
                    this.method438(arg3 & arg0.field2923[var15], arg1, var35, var34, arg10, arg6, var33, arg0.field2927[var15], (byte) -81, var19);
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

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[BI)I", line = 276)
    public static final int method414(int arg0, int arg1, byte[] arg2, int arg3) {
        field796++;
        if (arg0 >= -53) {
            field794 = null;
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = class23.field305[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILun;I)V", line = 311)
    public final void method424(int arg0, class110 arg1, int arg2) {
        field789++;
        if (arg0 == -1 || arg2 != -25823 || !this.method432()) {
            return;
        }
        class113 var4 = arg1.field1557[arg0];
        class191 var5 = var4.field1581;
        for (int var6 = 0; var6 < var4.field1575; var6++) {
            short var7 = var4.field1579[var6];
            if (var5.field2926[var7]) {
                if (var4.field1577[var6] != -1) {
                    this.method442(0, 0, 0, 0);
                }
                this.method442(var5.field2928[var7], var4.field1578[var6], var4.field1580[var6], var4.field1576[var6]);
            }
        }
        this.method429();
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lun;I[IZIIBIIILun;)V", line = 356)
    public final void method427(class110 arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, class110 arg10) {
        field797++;
        if (arg1 == -1 || !this.method432()) {
            return;
        }
        class113 var12 = arg10.field1557[arg1];
        if (arg6 < 16) {
            this.method402();
        }
        class191 var13 = var12.field1581;
        class113 var14 = null;
        if (arg0 != null) {
            var14 = arg0.field1557[arg7];
            if (var14.field1581 != var13) {
                var14 = null;
            }
        }
        this.method412(var13, arg3, arg9, arg4, var14, false, arg5, arg8, var12, (boolean[]) null, arg2, -56);
        this.method429();
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BIIILcl;II)V", line = 400)
    public final void method434(byte arg0, int arg1, int arg2, int arg3, class48 arg4, int arg5, int arg6) {
        field790++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg6 / 2;
        int var12 = -arg3 / 2;
        int var13 = arg4.method204(arg5 + var11, arg2 - -var12);
        int var14 = arg6 / 2;
        int var15 = -arg3 / 2;
        int var16 = arg4.method204(arg5 + var14, arg2 - -var15);
        int var17 = -arg6 / 2;
        int var18 = arg3 / 2;
        int var19 = arg4.method204(arg5 + var17, arg2 + var18);
        int var20 = arg6 / 2;
        int var21 = arg3 / 2;
        int var22 = arg4.method204(arg5 + var20, arg2 + var21);
        int var23 = var16 > var13 ? var13 : var16;
        int var24 = var22 > var19 ? var19 : var22;
        if (arg0 != 46) {
            field794 = null;
        }
        int var25 = var16 < var22 ? var16 : var22;
        if (arg3 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method421(var26);
            }
        }
        int var27 = var13 >= var19 ? var19 : var13;
        if (arg6 != 0) {
            int var28 = (int) (Math.atan2((double) (var27 - var25), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                this.method419(var28);
            }
        }
        int var29 = var13 + var22;
        if ((var16 + var19) < var29) {
            var29 = var16 + var19;
        }
        int var30 = (var29 >> 1) - arg1;
        if (var30 != 0) {
            this.method407(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZII[III[IBI)V", line = 483)
    private final void method438(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, byte arg8, int arg9) {
        field798++;
        if (arg5 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = -arg3;
                arg3 = arg2;
                arg2 = var16;
            } else if (arg9 == 3) {
                int var15 = arg3;
                arg3 = arg2;
                arg2 = var15;
            } else if (arg9 == 2) {
                int var14 = arg3;
                arg3 = -arg2 & 0x3FFF;
                arg2 = var14 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg2 = -arg2;
                arg3 = -arg3;
            } else if (arg9 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg2 = -arg2 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = arg3;
                arg3 = -arg2;
                arg2 = var13;
            } else if (arg9 == 3) {
                int var11 = arg3;
                arg3 = arg2;
                arg2 = var11;
            } else if (arg9 == 2) {
                int var12 = arg3;
                arg3 = arg2 & 0x3FFF;
                arg2 = -var12 & 0x3FFF;
            }
        }
        if (arg8 != -81) {
            return;
        }
        if (arg0 == 65535) {
            this.method409(arg9, arg7, arg3, arg6, arg2, arg5, arg1);
        } else {
            this.method403(arg9, arg7, arg3, arg6, arg2, arg1, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lun;[ZILun;IIIILun;ZILun;III)V", line = 580)
    public final void method440(class110 arg0, boolean[] arg1, int arg2, class110 arg3, int arg4, int arg5, int arg6, int arg7, class110 arg8, boolean arg9, int arg10, class110 arg11, int arg12, int arg13, int arg14) {
        field793++;
        if (arg2 == -1) {
            return;
        }
        if (arg1 == null || arg7 == -1) {
            this.method410(arg0, 0, arg11, arg10, -4222, arg9, arg2, arg4, arg13);
        } else if (this.method432()) {
            class113 var16 = arg0.field1557[arg2];
            class191 var17 = var16.field1581;
            class113 var18 = null;
            if (arg11 != null) {
                var18 = arg11.field1557[arg10];
                if (var18.field1581 != var17) {
                    var18 = null;
                }
            }
            class113 var19 = arg8.field1557[arg7];
            class113 var20 = null;
            if (arg3 != null) {
                var20 = arg3.field1557[arg6];
                if (var20.field1581 != var17) {
                    var20 = null;
                }
            }
            this.method412(var17, arg9, arg4, 65535, var18, false, 0, arg13, var16, arg1, (int[]) null, -87);
            this.method409(0, new int[0], 0, 0, 0, 0, arg9);
            this.method412(var17, arg9, arg5, arg14, var20, true, 0, arg12, var19, arg1, (int[]) null, -103);
            this.method429();
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "()I")
    public abstract int method400();

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "()I")
    public abstract int method402();

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method403(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lmu;Lro;I)V")
    public abstract void method404(class315 arg0, class117 arg1, int arg2);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lmu;Lro;II)V")
    public abstract void method405(class315 arg0, class117 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
    public abstract void method407(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lfq;)Lfq;")
    public abstract class87 method408(class87 arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method409(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "()I")
    public abstract int method411();

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "()I")
    public abstract int method413();

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(SS)V")
    public abstract void method415(short arg0, short arg1);

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "()I")
    public abstract int method416();

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "()I")
    public abstract int method417();

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "()I")
    public abstract int method418();

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public abstract void method419(int arg0);

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(SS)V")
    public abstract void method420(short arg0, short arg1);

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
    public abstract void method421(int arg0);

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "()V")
    public abstract void method422();

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILmu;Z)Z")
    public abstract boolean method423(int arg0, int arg1, class315 arg2, boolean arg3);

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "()I")
    public abstract int method425();

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "()I")
    public abstract int method426();

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "()[Lam;")
    public abstract class493[] method428();

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "()V")
    public abstract void method429();

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "()[Lqt;")
    public abstract class275[] method430();

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "()I")
    public abstract int method431();

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "()Z")
    public abstract boolean method432();

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)V")
    public abstract void method433(int arg0);

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "()Z")
    public abstract boolean method435();

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V")
    public abstract void method436(int arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BIZ)Lns;")
    public abstract class57 method437(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)V")
    public abstract void method439(int arg0);

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)V")
    public abstract void method441(int arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)V")
    public abstract void method442(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILcl;Lcl;III)V")
    public abstract void method443(int arg0, int arg1, class48 arg2, class48 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)V")
    public abstract void method444(int arg0);

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "()V")
    public abstract void method445();

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)V")
    public abstract void method446(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lns;IIIZ)V")
    public abstract void method447(class57 arg0, int arg1, int arg2, int arg3, boolean arg4);
}
