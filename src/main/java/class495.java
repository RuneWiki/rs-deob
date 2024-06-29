import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class495 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
    public boolean field7020 = false;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[B")
    public static byte[] field7019 = new byte[2048];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
    public static boolean field7023 = false;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "J")
    public static long field7025 = -1L;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Leh;IZ)V")
    public abstract void method110(class378 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method85(int arg0);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method112();

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method92();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lnha;")
    public abstract class338[] method54();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method98(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method62();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method71(class495 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IZZII[III)V")
    private final void method2889(int arg0, int arg1, int[] arg2, boolean arg3, boolean arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        field7017++;
        if (arg8 == 1) {
            if (arg5 == 0 || arg5 == 1) {
                int var16 = -arg1;
                arg1 = arg6;
                arg6 = var16;
            } else if (arg5 == 3) {
                int var15 = arg1;
                arg1 = arg6;
                arg6 = var15;
            } else if (arg5 == 2) {
                int var14 = arg1;
                arg1 = -arg6 & 0x3FFF;
                arg6 = var14 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg5 == 0 || arg5 == 1) {
                arg6 = -arg6;
                arg1 = -arg1;
            } else if (arg5 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg5 == 0 || arg5 == 1) {
                int var13 = arg1;
                arg1 = -arg6;
                arg6 = var13;
            } else if (arg5 == 3) {
                int var11 = arg1;
                arg1 = arg6;
                arg6 = var11;
            } else if (arg5 == 2) {
                int var12 = arg1;
                arg1 = arg6 & 0x3FFF;
                arg6 = -var12 & 0x3FFF;
            }
        }
        if (arg9 == 65535) {
            this.method64(arg5, arg7, arg1, arg0, arg6, arg8, arg4);
        } else {
            this.method66(arg5, arg7, arg1, arg0, arg6, arg4, arg9, arg2);
        }
        if (arg3) {
            field7019 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method58();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method72(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILva;Lva;ZIII)V")
    public final void method2890(int arg0, int arg1, int arg2, class520 arg3, class520 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field7018++;
        if (arg7 == -1) {
            return;
        }
        this.method109();
        if (!this.method112()) {
            this.method58();
            return;
        }
        class81 var10 = arg3.field7432[arg7];
        class414 var11 = var10.field1069;
        class81 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field7432[arg1];
            if (var12.field1069 != var11) {
                var12 = null;
            }
        }
        this.method2892(65535, arg8, arg5, -127, var11, false, null, arg6, var10, null, arg0, var12);
        this.method62();
        if (arg2 < -121) {
            this.method58();
        }
    }

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method65();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILeh;ZI)Z")
    public abstract boolean method83(int arg0, int arg1, class378 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method67();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
    public abstract boolean method99();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method102(int arg0, int arg1, class292 arg2, class292 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method66(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class192 method86(class192 arg0);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method60();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILs;III)V")
    public final void method2891(int arg0, int arg1, int arg2, int arg3, int arg4, class292 arg5, int arg6, int arg7, int arg8) {
        field7015++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg2 / 2;
        int var14 = -arg7 / 2;
        int var15 = arg5.method1977((byte) -33, arg8 + var13, arg3 + var14);
        int var16 = arg2 / 2;
        int var17 = -arg7 / 2;
        int var18 = arg5.method1977((byte) -73, arg8 + var16, arg3 - -var17);
        int var19 = -arg2 / 2;
        int var20 = arg7 / 2;
        int var21 = arg5.method1977((byte) 112, arg8 + var19, arg3 + var20);
        int var22 = arg2 / 2;
        int var23 = arg7 / arg4;
        int var24 = arg5.method1977((byte) 123, arg8 + var22, arg3 - -var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        if (arg7 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg0 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg0;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg0) {
                        var28 = arg0;
                    }
                }
                this.method114(var28);
            }
        }
        int var30 = var15 < var21 ? var15 : var21;
        if (arg2 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
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
                this.method59(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg6;
        if (var34 != 0) {
            this.method70(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method104(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILeh;ZII)Z")
    public abstract boolean method84(int arg0, int arg1, class378 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method97();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method76();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method111(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method101(int arg0);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method68();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method70(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method106(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method61(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Leh;Lsp;I)V")
    public abstract void method108(class378 arg0, class660 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method94();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZILmt;Z[IILu;[ZILu;)V")
    private final void method2892(int arg0, int arg1, boolean arg2, int arg3, class414 arg4, boolean arg5, int[] arg6, int arg7, class81 arg8, boolean[] arg9, int arg10, class81 arg11) {
        field7022++;
        if (arg11 == null || arg1 == 0) {
            for (int var38 = 0; var38 < arg8.field1072; var38++) {
                short var39 = arg8.field1080[var38];
                if (arg9 == null || arg9[var39] == arg5 || arg4.field5849[var39] == 0) {
                    short var40 = arg8.field1067[var38];
                    if (var40 != -1) {
                        this.method2889(0, 0, arg6, false, arg2, 0, 0, arg4.field5852[var40], arg7, arg0 & arg4.field5847[var40]);
                    }
                    this.method2889(arg8.field1073[var38], arg8.field1082[var38], arg6, false, arg2, arg4.field5849[var39], arg8.field1076[var38], arg4.field5852[var39], arg7, arg4.field5847[var39] & arg0);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg3 >= -126) {
            this.method115();
        }
        for (int var15 = 0; var15 < arg4.field5845; var15++) {
            boolean var16 = false;
            if (var13 < arg8.field1072 && arg8.field1080[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg11.field1072 && arg11.field1080[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg9 == null || arg5 == arg9[var15] || arg4.field5849[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg4.field5849[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var20 = arg8.field1082[var13];
                        var21 = arg8.field1073[var13];
                        var22 = arg8.field1076[var13];
                        var23 = arg8.field1067[var13];
                        var24 = arg8.field1081[var13];
                        var13++;
                    } else {
                        var21 = var18;
                        var20 = var18;
                        var24 = 0;
                        var23 = -1;
                        var22 = var18;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg11.field1081[var14];
                        var26 = arg11.field1073[var14];
                        var27 = arg11.field1076[var14];
                        var28 = arg11.field1067[var14];
                        var29 = arg11.field1082[var14];
                        var14++;
                    } else {
                        var26 = var18;
                        var29 = var18;
                        var25 = 0;
                        var27 = var18;
                        var28 = -1;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var24 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var34 = var21;
                        var33 = var20;
                        var35 = var22;
                    } else if (var19 == 2) {
                        int var30 = var29 - var20 & 0x3FFF;
                        int var31 = var26 - var21 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var27 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = var20 + (arg1 * var30 / arg10) & 0x3FFF;
                        var34 = var21 + (arg1 * var31 / arg10) & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = var22 + (arg1 * var32 / arg10) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var29 - var20 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var33 = var20 + (arg1 * var36 / arg10) & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var37 = var29 - var20 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var35 = (var27 - var22) * arg1 / arg10 + var22;
                        var34 = (var26 - var21) * arg1 / arg10 + var21;
                        var33 = arg1 * var37 / arg10 + var20 & 0x3F;
                    } else {
                        var33 = (var29 - var20) * arg1 / arg10 + var20;
                        var35 = (var27 - var22) * arg1 / arg10 + var22;
                        var34 = (var26 - var21) * arg1 / arg10 + var21;
                    }
                    if (var23 != -1) {
                        this.method2889(0, 0, arg6, false, arg2, 0, 0, arg4.field5852[var23], arg7, arg4.field5847[var23] & arg0);
                    } else if (var28 != -1) {
                        this.method2889(0, 0, arg6, false, arg2, 0, 0, arg4.field5852[var28], arg7, arg4.field5847[var28] & arg0);
                    }
                    this.method2889(var34, var33, arg6, false, arg2, var19, var35, arg4.field5852[var15], arg7, arg0 & arg4.field5847[var15]);
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILva;Lva;IIZLva;[ZILva;)V")
    public final void method2893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class520 arg6, class520 arg7, int arg8, int arg9, boolean arg10, class520 arg11, boolean[] arg12, int arg13, class520 arg14) {
        field7024++;
        if (arg0 == -1) {
            return;
        }
        if (arg12 == null || arg13 == -1) {
            this.method2890(arg1, arg4, -126, arg14, arg6, arg10, 0, arg0, arg2);
            return;
        }
        this.method109();
        if (!this.method112()) {
            this.method58();
            return;
        }
        class81 var16 = arg14.field7432[arg0];
        class414 var17 = var16.field1069;
        class81 var18 = null;
        if (arg6 != null) {
            var18 = arg6.field7432[arg4];
            if (var18.field1069 != var17) {
                var18 = null;
            }
        }
        this.method2892(65535, arg2, arg10, -128, var17, false, null, 0, var16, arg12, arg1, var18);
        class81 var19 = arg7.field7432[arg13];
        class81 var20 = null;
        if (arg11 != null) {
            var20 = arg11.field7432[arg9];
            if (var20.field1069 != var17) {
                var20 = null;
            }
        }
        this.method64(0, new int[0], 0, arg8, 0, 0, arg10);
        this.method2892(65535, arg5, arg10, -127, var19.field1069, true, null, 0, var19, arg12, arg3, var20);
        this.method62();
        this.method58();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IILva;ILva;ZIII)V")
    public final void method2894(int arg0, int arg1, int[] arg2, int arg3, class520 arg4, int arg5, class520 arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field7021++;
        if (arg8 != -1) {
            this.method69(44, -35, 6, -57);
        }
        if (arg0 == -1) {
            return;
        }
        this.method109();
        if (!this.method112()) {
            this.method58();
            return;
        }
        class81 var12 = arg6.field7432[arg0];
        class414 var13 = var12.field1069;
        class81 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field7432[arg9];
            if (var14.field1069 != var13) {
                var14 = null;
            }
        }
        this.method2892(arg10, arg1, arg7, -127, var13, false, arg2, arg3, var12, null, arg5, var14);
        this.method62();
        this.method58();
    }

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method115();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method55(int arg0);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method75();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method109();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method80();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lrf;")
    public abstract class92[] method116();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Leh;Lsp;II)V")
    public abstract void method91(class378 arg0, class660 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method2895(int arg0) {
        field7019 = null;
        int var1 = -81 % ((arg0 - 12) / 37);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method64(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class495 method81(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method79();

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method113();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Leh;)V")
    public abstract void method63(class378 arg0);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method114(int arg0);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method59(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLva;)V")
    public final void method2896(int arg0, byte arg1, class520 arg2) {
        field7016++;
        if (arg0 == -1) {
            return;
        }
        if (arg1 != -98) {
            this.method92();
        }
        this.method109();
        if (!this.method112()) {
            this.method58();
            return;
        }
        class81 var4 = arg2.field7432[arg0];
        class414 var5 = var4.field1069;
        for (int var6 = 0; var6 < var4.field1072; var6++) {
            short var7 = var4.field1080[var6];
            if (var5.field5850[var7]) {
                if (var4.field1067[var6] != -1) {
                    this.method69(0, 0, 0, 0);
                }
                this.method69(var5.field5849[var7], var4.field1082[var6], var4.field1073[var6], var4.field1076[var6]);
            }
        }
        this.method62();
        this.method58();
    }

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method88();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method69(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method117();
}
