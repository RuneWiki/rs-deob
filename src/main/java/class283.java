import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class283 {

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
    public boolean field3753 = false;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[[B")
    public static byte[][] field3754 = new byte[250][];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field3758;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILnea;I)V", line = 22)
    public final void method1689(int arg0, class154 arg1, int arg2) {
        field3752++;
        if (arg2 == -1) {
            return;
        }
        this.method1123();
        if (!this.method1122()) {
            this.method1160();
            return;
        }
        class342 var4 = arg1.field2119[arg2];
        class41 var5 = var4.field4377;
        for (int var6 = arg0; var6 < var4.field4368; var6++) {
            short var7 = var4.field4371[var6];
            if (var5.field579[var7]) {
                if (var4.field4363[var6] != -1) {
                    this.method1166(0, 0, 0, 0);
                }
                this.method1166(var5.field577[var7], var4.field4365[var6], var4.field4370[var6], var4.field4364[var6]);
            }
        }
        this.method1116();
        this.method1160();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII[IZILnea;Lnea;II)V", line = 69)
    public final void method1690(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6, class154 arg7, class154 arg8, int arg9, int arg10) {
        field3759++;
        if (arg10 == -1) {
            return;
        }
        this.method1123();
        if (!this.method1122()) {
            this.method1160();
            return;
        }
        if (arg6 != 13175) {
            this.method1145();
        }
        class342 var12 = arg8.field2119[arg10];
        class41 var13 = var12.field4377;
        class342 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field2119[arg3];
            if (var14.field4377 != var13) {
                var14 = null;
            }
        }
        this.method1696(var13, arg9, arg0, 0, arg1, arg4, false, arg5, var14, null, var12, arg2);
        this.method1116();
        this.method1160();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnea;IIIILnea;IZI)V", line = 110)
    public final void method1691(class154 arg0, int arg1, int arg2, int arg3, int arg4, class154 arg5, int arg6, boolean arg7, int arg8) {
        field3750++;
        if (arg2 == -1) {
            return;
        }
        this.method1123();
        if (!this.method1122()) {
            this.method1160();
            return;
        }
        class342 var10 = arg0.field2119[arg2];
        class41 var11 = var10.field4377;
        class342 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field2119[arg4];
            if (var12.field4377 != var11) {
                var12 = null;
            }
        }
        this.method1696(var11, arg1, arg8, 0, arg6, null, false, arg7, var12, null, var10, arg3);
        this.method1116();
        this.method1160();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIIIIIZI[I)V", line = 148)
    private final void method1692(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int[] arg9) {
        field3755++;
        if (arg4 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = -arg5;
                arg5 = arg1;
                arg1 = var13;
            } else if (arg8 == 3) {
                int var12 = arg5;
                arg5 = arg1;
                arg1 = var12;
            } else if (arg8 == 2) {
                int var11 = arg5;
                arg5 = -arg1 & 0x3FFF;
                arg1 = var11 & 0x3FFF;
            }
        } else if (arg4 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg5 = -arg5;
                arg1 = -arg1;
            } else if (arg8 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg4 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = arg5;
                arg5 = -arg1;
                arg1 = var16;
            } else if (arg8 == 3) {
                int var15 = arg5;
                arg5 = arg1;
                arg1 = var15;
            } else if (arg8 == 2) {
                int var14 = arg5;
                arg5 = arg1 & 0x3FFF;
                arg1 = -var14 & 0x3FFF;
            }
        }
        if (arg3 <= 38) {
            return;
        }
        if (arg2 == 65535) {
            this.method1142(arg8, arg0, arg5, arg6, arg1, arg4, arg7);
        } else {
            this.method1138(arg8, arg0, arg5, arg6, arg1, arg7, arg2, arg9);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILnea;IBILnea;Lnea;IZII[ZLnea;)V", line = 249)
    public final void method1693(int arg0, int arg1, int arg2, class154 arg3, int arg4, byte arg5, int arg6, class154 arg7, class154 arg8, int arg9, boolean arg10, int arg11, int arg12, boolean[] arg13, class154 arg14) {
        field3760++;
        if (arg9 == -1) {
            return;
        }
        if (arg13 == null || arg6 == -1) {
            this.method1691(arg7, arg1, arg9, 0, arg0, arg3, 65535, arg10, arg4);
            return;
        }
        this.method1123();
        if (!this.method1122()) {
            this.method1160();
            return;
        }
        int var16 = -116 % ((arg5 + 54) / 33);
        class342 var17 = arg7.field2119[arg9];
        class41 var18 = var17.field4377;
        class342 var19 = null;
        if (arg3 != null) {
            var19 = arg3.field2119[arg0];
            if (var19.field4377 != var18) {
                var19 = null;
            }
        }
        this.method1696(var18, arg1, arg4, 0, 65535, null, false, arg10, var19, arg13, var17, 0);
        class342 var20 = arg14.field2119[arg6];
        class342 var21 = null;
        if (arg8 != null) {
            var21 = arg8.field2119[arg11];
            if (var21.field4377 != var18) {
                var21 = null;
            }
        }
        this.method1142(0, new int[0], 0, 0, 0, 0, arg10);
        this.method1696(var20.field4377, arg2, arg12, 0, 65535, null, true, arg10, var21, arg13, var20, 0);
        this.method1116();
        this.method1160();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBILs;IIII)V", line = 339)
    public final void method1694(int arg0, int arg1, byte arg2, int arg3, class339 arg4, int arg5, int arg6, int arg7, int arg8) {
        field3757++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg8 / 2;
        int var14 = -arg6 / 2;
        int var15 = arg4.method1960(arg7 + var13, arg0 + var14, 114);
        int var16 = arg8 / 2;
        int var17 = -arg6 / 2;
        int var18 = arg4.method1960(arg7 + var16, arg0 - -var17, 124);
        int var19 = -arg8 / 2;
        int var20 = arg6 / 2;
        if (arg2 != -53) {
            this.method1151(-84, 47, null, true, -125, 46);
        }
        int var21 = arg4.method1960(arg7 + var19, arg0 + var20, 114);
        int var22 = arg8 / 2;
        int var23 = arg6 / 2;
        int var24 = arg4.method1960(arg7 + var22, arg0 - -var23, arg2 + 167);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 >= var24 ? var24 : var18;
        int var28 = var21 > var15 ? var15 : var21;
        if (arg6 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg3 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg3;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (arg3 < var29) {
                        var29 = arg3;
                    }
                }
                this.method1165(var29);
            }
        }
        if (arg8 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg1 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg1;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg1) {
                        var31 = arg1;
                    }
                }
                this.method1167(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg5;
        if (var34 != 0) {
            this.method1117(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 462)
    public static void method1695(byte arg0) {
        if (arg0 != -6) {
            method1695((byte) -29);
        }
        field3754 = null;
        field3758 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkk;IIII[IZZLri;[ZLri;I)V", line = 484)
    private final void method1696(class41 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, boolean arg7, class342 arg8, boolean[] arg9, class342 arg10, int arg11) {
        field3756++;
        if (arg8 == null || arg1 == 0) {
            for (int var38 = 0; var38 < arg10.field4368; var38++) {
                short var39 = arg10.field4371[var38];
                if (arg9 == null || arg9[var39] == arg6 || arg0.field577[var39] == 0) {
                    short var40 = arg10.field4363[var38];
                    if (var40 != -1) {
                        this.method1692(arg0.field580[var40], 0, arg0.field583[var40] & arg4, 86, arg11, 0, 0, arg7, 0, arg5);
                    }
                    this.method1692(arg0.field580[var39], arg10.field4364[var38], arg0.field583[var39] & arg4, 57, arg11, arg10.field4365[var38], arg10.field4370[var38], arg7, arg0.field577[var39], arg5);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = arg3; var15 < arg0.field582; var15++) {
            boolean var16 = false;
            if (arg10.field4368 > var13 && arg10.field4371[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg8.field4368 > var14 && arg8.field4371[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg9 == null || arg9[var15] == arg6 || arg0.field577[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field577[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var24 = arg10.field4363[var13];
                        var22 = arg10.field4364[var13];
                        var21 = arg10.field4365[var13];
                        var23 = arg10.field4373[var13];
                        var20 = arg10.field4370[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = var18;
                        var23 = 0;
                        var24 = -1;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg8.field4370[var14];
                        var26 = arg8.field4373[var14];
                        var27 = arg8.field4364[var14];
                        var28 = arg8.field4363[var14];
                        var29 = arg8.field4365[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var29 = var18;
                        var28 = -1;
                        var27 = var18;
                        var26 = 0;
                    }
                    if (var24 != -1) {
                        this.method1692(arg0.field580[var24], 0, arg0.field583[var24] & arg4, 80, arg11, 0, 0, arg7, 0, arg5);
                    } else if (var28 != -1) {
                        this.method1692(arg0.field580[var28], 0, arg0.field583[var28] & arg4, 120, arg11, 0, 0, arg7, 0, arg5);
                    }
                    int var30;
                    int var31;
                    int var32;
                    if ((var23 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var30 = var20;
                        var31 = var22;
                        var32 = var21;
                    } else if (var19 == 2) {
                        int var35 = var29 - var21 & 0x3FFF;
                        int var36 = var25 - var20 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var27 - var22 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        var30 = arg1 * var36 / arg2 + var20 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg1 * var35 / arg2 + var21 & 0x3FFF;
                        var31 = arg1 * var37 / arg2 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var29 - var21 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var31 = 0;
                        var30 = 0;
                        var32 = arg1 * var34 / arg2 + var21 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var33 = var29 - var21 & 0x3F;
                        if (var33 >= 32) {
                            var33 -= 64;
                        }
                        var31 = (var27 - var22) * arg1 / arg2 + var22;
                        var30 = (var25 - var20) * arg1 / arg2 + var20;
                        var32 = var21 + (arg1 * var33 / arg2) & 0x3F;
                    } else {
                        var30 = (var25 - var20) * arg1 / arg2 + var20;
                        var31 = var22 + ((var27 - var22) * arg1 / arg2);
                        var32 = (var29 - var21) * arg1 / arg2 + var21;
                    }
                    this.method1692(arg0.field580[var15], var31, arg0.field583[var15] & arg4, arg3 + 107, arg11, var32, var30, arg7, var19, arg5);
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

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method1169();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class706 method1124(class706 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Luha;Lau;II)V")
    public abstract void method1164(class723 arg0, class247 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method1152(class283 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method1130();

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method1122();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method1150();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Loo;")
    public abstract class648[] method1145();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Luha;)V")
    public abstract void method1172(class723 arg0);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method1141();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1138(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method1116();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method1117(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method1126();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method1162(int arg0);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method1136();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method1128();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILuha;ZII)Z")
    public abstract boolean method1151(int arg0, int arg1, class723 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Luha;IZ)V")
    public abstract void method1129(class723 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILuha;ZI)Z")
    public abstract boolean method1155(int arg0, int arg1, class723 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method1161(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method1165(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Luha;Lau;I)V")
    public abstract void method1168(class723 arg0, class247 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method1114();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method1131(int arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
    public abstract boolean method1153();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class283 method1147(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method1160();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method1123();

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method1135();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method1166(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method1132();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method1167(int arg0);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method1140();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method1133(int arg0);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method1159(int arg0);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method1119();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method1112();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method1148(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1142(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method1118(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method1149(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method1154(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method1113();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method1134(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lhr;")
    public abstract class57[] method1158();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method1120();
}
