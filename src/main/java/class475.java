import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class475 {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field6854 = 0;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Ltr;")
    public static class195 field6848 = new class195(8, 2);

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field6862 = 0;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field6863 = 0;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "[I")
    public static int[] field6864 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lga;")
    public static class279 field6861;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6865;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
    public abstract void method438(int arg0);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
    public abstract void method458();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method440(int arg0, int arg1, class125 arg2, boolean arg3);

    @OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
    public abstract void method420(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
    public static final void method2854(String arg0, int arg1, String arg2, int arg3, String arg4, int arg5) {
        class398.method2507(arg2, arg4, arg0, arg5, false, null, -1, arg1);
        if (arg3 <= -125) {
            field6850++;
        }
    }

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
    public abstract void method435(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILta;IIIIII)V")
    public final void method2855(int arg0, int arg1, class145 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6858++;
        boolean var10 = false;
        int var11 = -107 % ((-arg4 - 13) / 57);
        boolean var12 = false;
        boolean var13 = false;
        int var14 = -arg1 / 2;
        int var15 = -arg8 / 2;
        int var16 = arg2.method412(arg7 + var14, arg3 - -var15);
        int var17 = arg1 / 2;
        int var18 = -arg8 / 2;
        int var19 = arg2.method412(arg7 + var17, arg3 - -var18);
        int var20 = -arg1 / 2;
        int var21 = arg8 / 2;
        int var22 = arg2.method412(arg7 + var20, arg3 + var21);
        int var23 = arg1 / 2;
        int var24 = arg8 / 2;
        int var25 = arg2.method412(arg7 + var23, arg3 + var24);
        int var26 = var16 < var19 ? var16 : var19;
        int var27 = var25 > var22 ? var22 : var25;
        int var28 = var19 < var25 ? var19 : var25;
        if (arg8 != 0) {
            int var29 = (int) (Math.atan2((double) (var26 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg0 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg0;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (var29 > arg0) {
                        var29 = arg0;
                    }
                }
                this.method441(var29);
            }
        }
        int var31 = var16 >= var22 ? var22 : var16;
        if (arg1 != 0) {
            int var32 = (int) (Math.atan2((double) (var31 - var28), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg6 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg6;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (var32 > arg6) {
                        var32 = arg6;
                    }
                }
                this.method420(var32);
            }
        }
        int var34 = var16 + var25;
        if (var34 > var19 + var22) {
            var34 = var19 + var22;
        }
        int var35 = (var34 >> 1) - arg5;
        if (var35 != 0) {
            this.method450(0, var35, 0);
        }
    }

    @OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
    public abstract int method433();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILkk;)V")
    public static final void method2856(int arg0, class129 arg1) {
        if (arg0 != 2099) {
            method2865(49);
        }
        field6847++;
        if (arg1 instanceof class116) {
            class116 var2 = (class116) arg1;
            if (var2.field1763 != null) {
                class338.method2134(class398.field5947.field5826 != var2.field5826, var2, (byte) 111);
                return;
            }
        } else if ((arg1 instanceof class177)) {
            class177 var3 = (class177) arg1;
            class395.method2482(true, class398.field5947.field5826 != var3.field5826, var3);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
    public abstract int method428();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()[Ldv;")
    public abstract class471[] method456();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lnr;Lrq;ZLrq;I[ZZIIII[I)V")
    private final void method2857(class42 arg0, class235 arg1, boolean arg2, class235 arg3, int arg4, boolean[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11) {
        field6860++;
        if (arg1 == null || arg9 == 0) {
            for (int var38 = 0; var38 < arg3.field3779; var38++) {
                short var39 = arg3.field3794[var38];
                if (arg5 == null || arg6 == arg5[var39] || arg0.field551[var39] == 0) {
                    short var40 = arg3.field3786[var38];
                    if (var40 != -1) {
                        this.method2858(0, 0, arg0.field552[var40] & arg4, arg7, -2, 0, arg0.field547[var40], arg11, 0, arg2);
                    }
                    this.method2858(arg3.field3788[var38], arg3.field3781[var38], arg0.field552[var39] & arg4, arg7, -2, arg3.field3778[var38], arg0.field547[var39], arg11, arg0.field551[var39], arg2);
                }
            }
        } else if (arg10 >= 7) {
            int var13 = 0;
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field546; var15++) {
                boolean var16 = false;
                if (arg3.field3779 > var13 && arg3.field3794[var13] == var15) {
                    var16 = true;
                }
                boolean var17 = false;
                if (var14 < arg1.field3779 && arg1.field3794[var14] == var15) {
                    var17 = true;
                }
                if (var16 || var17) {
                    if (arg5 == null || arg5[var15] == arg6 || arg0.field551[var15] == 0) {
                        short var18 = 0;
                        int var19 = arg0.field551[var15];
                        if (var19 == 3 || var19 == 10) {
                            var18 = 128;
                        }
                        short var20;
                        short var21;
                        short var22;
                        short var23;
                        byte var24;
                        if (var16) {
                            var21 = arg3.field3781[var13];
                            var20 = arg3.field3778[var13];
                            var24 = arg3.field3789[var13];
                            var22 = arg3.field3788[var13];
                            var23 = arg3.field3786[var13];
                            var13++;
                        } else {
                            var20 = var18;
                            var21 = var18;
                            var22 = var18;
                            var23 = -1;
                            var24 = 0;
                        }
                        short var25;
                        short var26;
                        short var27;
                        byte var28;
                        short var29;
                        if (var17) {
                            var25 = arg1.field3788[var14];
                            var26 = arg1.field3778[var14];
                            var27 = arg1.field3786[var14];
                            var28 = arg1.field3789[var14];
                            var29 = arg1.field3781[var14];
                            var14++;
                        } else {
                            var27 = -1;
                            var29 = var18;
                            var28 = 0;
                            var25 = var18;
                            var26 = var18;
                        }
                        int var33;
                        int var34;
                        int var35;
                        if ((var24 & 0x2) != 0 || (var28 & 0x1) != 0) {
                            var33 = var21;
                            var35 = var20;
                            var34 = var22;
                        } else if (var19 == 2) {
                            int var30 = var29 - var21 & 0x3FFF;
                            int var31 = var25 - var22 & 0x3FFF;
                            if (var31 >= 8192) {
                                var31 -= 16384;
                            }
                            if (var30 >= 8192) {
                                var30 -= 16384;
                            }
                            int var32 = var26 - var20 & 0x3FFF;
                            var33 = var21 + (arg9 * var30 / arg8) & 0x3FFF;
                            var34 = arg9 * var31 / arg8 + var22 & 0x3FFF;
                            if (var32 >= 8192) {
                                var32 -= 16384;
                            }
                            var35 = arg9 * var32 / arg8 + var20 & 0x3FFF;
                        } else if (var19 == 9) {
                            int var36 = var29 - var21 & 0x3FFF;
                            if (var36 >= 8192) {
                                var36 -= 16384;
                            }
                            var35 = 0;
                            var34 = 0;
                            var33 = arg9 * var36 / arg8 + var21 & 0x3FFF;
                        } else if (var19 == 7) {
                            int var37 = var29 - var21 & 0x3F;
                            if (var37 >= 32) {
                                var37 -= 64;
                            }
                            var34 = (var25 - var22) * arg9 / arg8 + var22;
                            var35 = (var26 - var20) * arg9 / arg8 + var20;
                            var33 = arg9 * var37 / arg8 + var21 & 0x3F;
                        } else {
                            var35 = (var26 - var20) * arg9 / arg8 + var20;
                            var33 = var21 + ((var29 - var21) * arg9 / arg8);
                            var34 = (var25 - var22) * arg9 / arg8 + var22;
                        }
                        if (var23 != -1) {
                            this.method2858(0, 0, arg4 & arg0.field552[var23], arg7, -2, 0, arg0.field547[var23], arg11, 0, arg2);
                        } else if (var27 != -1) {
                            this.method2858(0, 0, arg0.field552[var27] & arg4, arg7, -2, 0, arg0.field547[var27], arg11, 0, arg2);
                        }
                        this.method2858(var34, var33, arg0.field552[var15] & arg4, arg7, -2, var35, arg0.field547[var15], arg11, var19, arg2);
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
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lt;IIIZ)V")
    public abstract void method422(class475 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(IILta;Lta;III)V")
    public abstract void method425(int arg0, int arg1, class145 arg2, class145 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
    public abstract void method417(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIII[I[IIZ)V")
    private final void method2858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, boolean arg9) {
        if (arg3 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = -arg1;
                arg1 = arg5;
                arg5 = var13;
            } else if (arg8 == 3) {
                int var12 = arg1;
                arg1 = arg5;
                arg5 = var12;
            } else if (arg8 == 2) {
                int var11 = arg1;
                arg1 = -arg5 & 0x3FFF;
                arg5 = var11 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg5 = -arg5;
                arg1 = -arg1;
            } else if (arg8 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = arg1;
                arg1 = -arg5;
                arg5 = var16;
            } else if (arg8 == 3) {
                int var15 = arg1;
                arg1 = arg5;
                arg5 = var15;
            } else if (arg8 == 2) {
                int var14 = arg1;
                arg1 = arg5 & 0x3FFF;
                arg5 = -var14 & 0x3FFF;
            }
        }
        field6856++;
        if (arg2 == 65535) {
            this.method442(arg8, arg6, arg1, arg0, arg5, arg3, arg9);
        } else {
            this.method448(arg8, arg6, arg1, arg0, arg5, arg9, arg2, arg7);
        }
        if (arg4 != -2) {
            field6864 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
    public abstract void method442(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lju;I)V")
    public abstract void method439(class125 arg0, class83 arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
    public abstract int method423();

    @OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
    public abstract int method429();

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
    public abstract int method451();

    @OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
    public abstract void method457(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
    public abstract void method450(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()[Luj;")
    public abstract class262[] method431();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BILir;)V")
    public final void method2859(byte arg0, int arg1, class22 arg2) {
        field6849++;
        if (arg1 == -1 || !this.method418()) {
            return;
        }
        class235 var4 = arg2.field263[arg1];
        if (arg0 >= -9) {
            return;
        }
        class42 var5 = var4.field3787;
        for (int var6 = 0; var6 < var4.field3779; var6++) {
            short var7 = var4.field3794[var6];
            if (var5.field555[var7]) {
                if (var4.field3786[var6] != -1) {
                    this.method426(0, 0, 0, 0);
                }
                this.method426(var5.field551[var7], var4.field3781[var6], var4.field3788[var6], var4.field3778[var6]);
            }
        }
        this.method447();
    }

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lba;)Lba;")
    public abstract class265 method443(class265 arg0);

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
    public abstract int method432();

    @OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
    public abstract void method446(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    public abstract void method434(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
    public abstract int method416();

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()Z")
    public abstract boolean method445();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lir;IIBIZIILir;)V")
    public final void method2860(class22 arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, int arg7, class22 arg8) {
        field6857++;
        if (arg6 == -1 || !this.method418()) {
            return;
        }
        if (arg3 < 20) {
            field6854 = 50;
        }
        class235 var10 = arg8.field263[arg6];
        class42 var11 = var10.field3787;
        class235 var12 = null;
        if (arg0 != null) {
            var12 = arg0.field263[arg7];
            if (var12.field3787 != var11) {
                var12 = null;
            }
        }
        this.method2857(var11, var12, arg5, var10, 65535, null, false, arg2, arg4, arg1, 28, null);
        this.method447();
    }

    @OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
    public abstract int method427();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
    public abstract boolean method418();

    @OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
    public abstract void method447();

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
    public abstract void method426(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
    public abstract void method424(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public abstract void method454(int arg0);

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
    public abstract void method441(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static final void method2861(byte arg0) {
        field6846++;
        if (class193.field3258.method935(class96.field1384, 1) != 2) {
            return;
        }
        byte var1 = (byte) (class448.field6562 - 4 & 0xFF);
        int var2 = 25 / ((arg0 - 66) / 32);
        int var3 = class448.field6562 % class69.field976;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var17 = 0; var17 < class285.field4328; var17++) {
                class221.field3633[var4][var3][var17] = var1;
            }
        }
        if (class154.field2286 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class255.field3909[var5] = -1000000;
            class220.field3617[var5] = 1000000;
            class233.field3770[var5] = 0;
            class488.field7034[var5] = 1000000;
            class520.field7618[var5] = 0;
        }
        if (class176.field2611 != 1) {
            int var16 = class172.method1153(class154.field2286, -4, class412.field6180, class71.field1024);
            if (var16 - class473.field6831 >= 800 || (class476.field6873[class154.field2286][class412.field6180 >> 7][class71.field1024 >> 7] & 0x4) == 0) {
                return;
            }
            class474.method2852(false, 1, client.field3311, class71.field1024 >> 7, -1, class412.field6180 >> 7);
            return;
        }
        if ((class476.field6873[class154.field2286][class398.field5947.field5837 >> 7][class398.field5947.field5833 >> 7] & 0x4) != 0) {
            class474.method2852(false, 0, client.field3311, class398.field5947.field5833 >> 7, -1, class398.field5947.field5837 >> 7);
        }
        if (class419.field6263 >= 2560) {
            return;
        }
        int var6 = class412.field6180 >> 7;
        int var7 = class71.field1024 >> 7;
        int var8 = class398.field5947.field5837 >> 7;
        int var9 = class398.field5947.field5833 >> 7;
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var7 < var9) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if ((var10 != 0 || var11 != 0) && var10 > (-class69.field976) && class69.field976 > var10 && var11 > (-class285.field4328) && var11 < class285.field4328) {
            if (var11 >= var10) {
                int var12 = var10 * 65536 / var11;
                int var13 = 32768;
                while (var7 != var9) {
                    if (var7 < var9) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    if ((class476.field6873[class154.field2286][var6][var7] & 0x4) != 0) {
                        class474.method2852(false, 1, client.field3311, var7, -1, var6);
                        return;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var8 > var6) {
                            var6++;
                        } else if (var6 > var8) {
                            var6--;
                        }
                        if ((class476.field6873[class154.field2286][var6][var7] & 0x4) != 0) {
                            class474.method2852(false, 1, client.field3311, var7, -1, var6);
                            return;
                        }
                    }
                }
                return;
            }
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class476.field6873[class154.field2286][var6][var7] & 0x4) != 0) {
                    class474.method2852(false, 1, client.field3311, var7, -1, var6);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 > var7) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class476.field6873[class154.field2286][var6][var7] & 0x4) != 0) {
                        class474.method2852(false, 1, client.field3311, var7, -1, var6);
                        return;
                    }
                }
            }
            return;
        }
        class88.method727(null, -89, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class390.field5842 + "," + class176.field2613);
        return;
    }

    @OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
    public abstract int method430();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIILir;Lir;[ZILir;Lir;BIIZ)V")
    public final void method2862(int arg0, int arg1, int arg2, int arg3, int arg4, class22 arg5, class22 arg6, boolean[] arg7, int arg8, class22 arg9, class22 arg10, byte arg11, int arg12, int arg13, boolean arg14) {
        field6859++;
        if (arg11 >= -97) {
            field6864 = null;
        }
        if (arg12 == -1) {
            return;
        }
        if (arg7 == null || arg2 == -1) {
            this.method2860(arg10, arg3, 0, (byte) 35, arg13, arg14, arg12, arg0, arg9);
        } else if (this.method418()) {
            class235 var16 = arg9.field263[arg12];
            class42 var17 = var16.field3787;
            class235 var18 = null;
            if (arg10 != null) {
                var18 = arg10.field263[arg0];
                if (var18.field3787 != var17) {
                    var18 = null;
                }
            }
            this.method2857(var17, var18, arg14, var16, 65535, arg7, false, 0, arg13, arg3, 115, null);
            class235 var19 = arg6.field263[arg2];
            class235 var20 = null;
            if (arg5 != null) {
                var20 = arg5.field263[arg1];
                if (var20.field3787 != var17) {
                    var20 = null;
                }
            }
            this.method442(0, new int[0], 0, 0, 0, 0, arg14);
            this.method2857(var19.field3787, var20, arg14, var19, 65535, arg7, true, 0, arg4, arg8, 126, null);
            this.method447();
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
    public abstract void method455();

    @OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
    public abstract int method419();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static void method2863(boolean arg0) {
        field6848 = null;
        field6864 = null;
        field6865 = null;
        field6861 = null;
        if (arg0) {
            method2856(-83, null);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)Luq;")
    public static final class114 method2864(boolean arg0, int arg1) {
        field6852++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class200.field3326[var2] == null || class200.field3326[var2][var3] == null) {
            boolean var4 = class184.method1223((byte) -66, var2);
            if (!var4) {
                return null;
            }
        }
        if (!arg0) {
            field6861 = null;
        }
        return class200.field3326[var2][var3];
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method2865(int arg0) {
        field6855++;
        for (int var1 = 0; var1 < class384.field5774; var1++) {
            class85 var3 = class522.field7636[var1];
            if (var3.field1227 == 2) {
                if (var3.field1225 == null) {
                    var3.field1217 = Integer.MIN_VALUE;
                } else {
                    class359.field5328.method385(var3.field1225);
                }
            }
        }
        int var2 = 100 / ((arg0 - 53) / 40);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lju;II)V")
    public abstract void method437(class125 arg0, class83 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
    public abstract void method436(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
    public abstract void method448(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILir;I[IILir;IZ)V")
    public final void method2866(int arg0, int arg1, int arg2, int arg3, class22 arg4, int arg5, int[] arg6, int arg7, class22 arg8, int arg9, boolean arg10) {
        field6853++;
        if (arg9 == -1 || !this.method418()) {
            return;
        }
        class235 var12 = arg8.field263[arg9];
        class42 var13 = var12.field3787;
        class235 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field263[arg0];
            if (var14.field3787 != var13) {
                var14 = null;
            }
        }
        this.method2857(var13, var14, arg10, var12, arg7, null, false, arg5, arg3, arg1, 97, arg6);
        if (arg2 == 2) {
            this.method447();
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lt;")
    public abstract class475 method449(byte arg0, int arg1, boolean arg2);
}
