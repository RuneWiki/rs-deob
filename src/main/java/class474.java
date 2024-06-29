import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class474 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Z")
    public boolean field6014 = false;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field6010 = 0;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field6013 = -1;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[I")
    public static int[] field6018 = new int[4];

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Ljt;")
    public static class533 field6009;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[Ltq;")
    public static class93[] field6012;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILi;IIIIIII)V", line = 9)
    public final void method2501(int arg0, class272 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6022++;
        boolean var10 = false;
        boolean var11 = false;
        int var13 = -arg5 / 2;
        int var14 = -arg0 / 2;
        int var15 = arg1.method1565(arg8 + var14, arg2 + var13, true);
        int var16 = arg5 / 2;
        int var17 = -arg0 / 2;
        int var18 = arg1.method1565(arg8 + var17, arg2 + var16, true);
        int var19 = -arg5 / 2;
        int var20 = arg0 / 2;
        int var21 = arg1.method1565(arg8 + var20, arg2 + var19, true);
        int var22 = arg5 / 2;
        int var23 = arg0 / 2;
        int var24 = arg1.method1565(arg8 + var23, arg2 + var22, true);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 >= var24 ? var24 : var18;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg0 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg3 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg3;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg3) {
                        var29 = arg3;
                    }
                }
                this.method762(var29);
            }
        }
        if (arg5 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
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
                this.method715(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg6;
        if (var34 != 0) {
            this.method710(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 132)
    public static void method2502(int arg0) {
        field6018 = null;
        field6012 = null;
        if (arg0 != -1) {
            method2505(true);
        }
        field6009 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLgw;ILgw;IILjj;[IIZ[ZI)V", line = 145)
    private final void method2503(boolean arg0, class144 arg1, int arg2, class144 arg3, int arg4, int arg5, class67 arg6, int[] arg7, int arg8, boolean arg9, boolean[] arg10, int arg11) {
        field6016++;
        if (arg3 == null || arg8 == 0) {
            for (int var38 = 0; var38 < arg1.field1847; var38++) {
                short var39 = arg1.field1855[var38];
                if (arg10 == null || arg10[var39] == arg0 || arg6.field906[var39] == 0) {
                    short var40 = arg1.field1859[var38];
                    if (var40 != -1) {
                        this.method2510(0, arg7, 0, arg6.field912[var40] & arg5, 0, arg9, arg6.field914[var40], 2, arg2, 0);
                    }
                    this.method2510(arg1.field1856[var38], arg7, arg1.field1850[var38], arg5 & arg6.field912[var39], arg1.field1860[var38], arg9, arg6.field914[var39], 2, arg2, arg6.field906[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg11 != -8193) {
            field6009 = null;
        }
        for (int var15 = 0; var15 < arg6.field909; var15++) {
            boolean var16 = false;
            if (var13 < arg1.field1847 && arg1.field1855[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg3.field1847 > var14 && arg3.field1855[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg10 == null || arg10[var15] == arg0 || arg6.field906[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg6.field906[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg1.field1856[var13];
                        var21 = arg1.field1850[var13];
                        var22 = arg1.field1851[var13];
                        var23 = arg1.field1860[var13];
                        var24 = arg1.field1859[var13];
                        var13++;
                    } else {
                        var21 = var18;
                        var20 = var18;
                        var22 = 0;
                        var24 = -1;
                        var23 = var18;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg3.field1851[var14];
                        var26 = arg3.field1859[var14];
                        var27 = arg3.field1856[var14];
                        var28 = arg3.field1850[var14];
                        var29 = arg3.field1860[var14];
                        var14++;
                    } else {
                        var29 = var18;
                        var25 = 0;
                        var26 = -1;
                        var27 = var18;
                        var28 = var18;
                    }
                    if (var24 != -1) {
                        this.method2510(0, arg7, 0, arg6.field912[var24] & arg5, 0, arg9, arg6.field914[var24], 2, arg2, 0);
                    } else if (var26 != -1) {
                        this.method2510(0, arg7, 0, arg5 & arg6.field912[var26], 0, arg9, arg6.field914[var26], 2, arg2, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var35 = var23;
                        var33 = var21;
                        var34 = var20;
                    } else if (var19 == 2) {
                        int var30 = var28 - var21 & 0x3FFF;
                        int var31 = var27 - var20 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var29 - var23 & 0x3FFF;
                        var33 = var21 + (arg8 * var30 / arg4) & 0x3FFF;
                        var34 = arg8 * var31 / arg4 + var20 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = var23 + (arg8 * var32 / arg4) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var28 - var21 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var33 = arg8 * var36 / arg4 + var21 & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var37 = var28 - var21 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = var20 + ((var27 - var20) * arg8 / arg4);
                        var35 = (var29 - var23) * arg8 / arg4 + var23;
                        var33 = arg8 * var37 / arg4 + var21 & 0x3F;
                    } else {
                        var33 = (var28 - var21) * arg8 / arg4 + var21;
                        var35 = var23 + ((var29 - var23) * arg8 / arg4);
                        var34 = (var27 - var20) * arg8 / arg4 + var20;
                    }
                    this.method2510(var34, arg7, var33, arg6.field912[var15] & arg5, var35, arg9, arg6.field914[var15], 2, arg2, var19);
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

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lwa;II)V", line = 358)
    public final void method2504(class662 arg0, int arg1, int arg2) {
        field6023++;
        if (arg1 == -1) {
            return;
        }
        this.method702();
        if (!this.method742()) {
            this.method739();
            return;
        }
        class144 var4 = arg0.field9366[arg1];
        class67 var5 = var4.field1849;
        if (arg2 != 19093) {
            return;
        }
        for (int var6 = 0; var6 < var4.field1847; var6++) {
            short var7 = var4.field1855[var6];
            if (var5.field910[var7]) {
                if (var4.field1859[var6] != -1) {
                    this.method709(0, 0, 0, 0);
                }
                this.method709(var5.field906[var7], var4.field1850[var6], var4.field1856[var6], var4.field1860[var6]);
            }
        }
        this.method749();
        this.method739();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 440)
    public static final void method2505(boolean arg0) {
        field6015++;
        if (class591.field8310 == class408.field5117) {
            return;
        }
        if (arg0) {
            method2505(false);
        }
        try {
            class371.method2028(true, "tbrefresh", class520.field7094);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZBLwa;IILwa;III)V", line = 474)
    public final void method2506(boolean arg0, byte arg1, class662 arg2, int arg3, int arg4, class662 arg5, int arg6, int arg7, int arg8) {
        field6019++;
        if (arg4 == -1) {
            return;
        }
        this.method702();
        if (!this.method742()) {
            this.method739();
            return;
        }
        class144 var10 = arg2.field9366[arg4];
        if (arg1 != -11) {
            return;
        }
        class67 var11 = var10.field1849;
        class144 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field9366[arg3];
            if (var12.field1849 != var11) {
                var12 = null;
            }
        }
        this.method2503(false, var10, arg7, var12, arg8, 65535, var11, null, arg6, arg0, null, -8193);
        this.method749();
        this.method739();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLwa;III[IIIZILwa;)V", line = 515)
    public final void method2507(byte arg0, class662 arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, boolean arg8, int arg9, class662 arg10) {
        field6020++;
        if (arg4 == -1) {
            return;
        }
        this.method702();
        if (!this.method742()) {
            this.method739();
            return;
        }
        class144 var12 = arg10.field9366[arg4];
        class67 var13 = var12.field1849;
        class144 var14 = null;
        if (arg1 != null) {
            var14 = arg1.field9366[arg7];
            if (var14.field1849 != var13) {
                var14 = null;
            }
        }
        int var15 = -35 % ((-arg0 - 44) / 60);
        this.method2503(false, var12, arg3, var14, arg9, arg6, var13, arg5, arg2, arg8, null, -8193);
        this.method749();
        this.method739();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkp;BLkp;)V", line = 559)
    public static final void method2508(class507 arg0, byte arg1, class507 arg2) {
        class66.field898++;
        field6021++;
        if (arg1 != -65) {
            field6012 = null;
        }
        class704 var3 = class314.method1820(class515.field7029, class400.field5014, (byte) -127);
        var3.field9929.method3464(arg2.field6764, -127);
        var3.field9929.method3466(arg1 + 185, arg2.field6834);
        var3.field9929.method3466(106, arg0.field6832);
        var3.field9929.method3506(128, arg0.field6834);
        var3.field9929.method3526(arg2.field6832, arg1 ^ 0xFFFFCB22);
        var3.field9929.method3472(13412, arg0.field6764);
        class122.method654(var3, (byte) -36);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lwa;ILwa;IILwa;I[ZIIZILwa;II)V", line = 579)
    public final void method2509(class662 arg0, int arg1, class662 arg2, int arg3, int arg4, class662 arg5, int arg6, boolean[] arg7, int arg8, int arg9, boolean arg10, int arg11, class662 arg12, int arg13, int arg14) {
        if (arg13 > -23) {
            this.method747(-96, 120, null, null, -128, 30, -52);
        }
        field6011++;
        if (arg1 == -1) {
            return;
        }
        if (arg7 == null || arg11 == -1) {
            this.method2506(arg10, (byte) -11, arg12, arg4, arg1, arg0, arg3, 0, arg9);
            return;
        }
        this.method702();
        if (!this.method742()) {
            this.method739();
            return;
        }
        class144 var16 = arg12.field9366[arg1];
        class67 var17 = var16.field1849;
        class144 var18 = null;
        if (arg0 != null) {
            var18 = arg0.field9366[arg4];
            if (var18.field1849 != var17) {
                var18 = null;
            }
        }
        this.method2503(false, var16, 0, var18, arg9, 65535, var17, null, arg3, arg10, arg7, -8193);
        class144 var19 = arg5.field9366[arg11];
        class144 var20 = null;
        if (arg2 != null) {
            var20 = arg2.field9366[arg14];
            if (var20.field1849 != var17) {
                var20 = null;
            }
        }
        this.method732(0, new int[0], 0, 0, 0, 0, arg10);
        this.method2503(true, var19, 0, var20, arg6, 65535, var19.field1849, null, arg8, arg10, arg7, -8193);
        this.method749();
        this.method739();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIZ[IIII)V", line = 645)
    private final void method2510(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, int arg9) {
        field6017++;
        if (arg8 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = -arg2;
                arg2 = arg4;
                arg4 = var16;
            } else if (arg9 == 3) {
                int var15 = arg2;
                arg2 = arg4;
                arg4 = var15;
            } else if (arg9 == 2) {
                int var14 = arg2;
                arg2 = -arg4 & 0x3FFF;
                arg4 = var14 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg2 = -arg2;
                arg4 = -arg4;
            } else if (arg9 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg2 = -arg2 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = arg2;
                arg2 = -arg4;
                arg4 = var13;
            } else if (arg9 == 3) {
                int var11 = arg2;
                arg2 = arg4;
                arg4 = var11;
            } else if (arg9 == 2) {
                int var12 = arg2;
                arg2 = arg4 & 0x3FFF;
                arg4 = -var12 & 0x3FFF;
            }
        }
        if (arg3 == 65535) {
            this.method732(arg9, arg6, arg2, arg0, arg4, arg8, arg5);
        } else {
            this.method721(arg9, arg6, arg2, arg0, arg4, arg5, arg3, arg1);
        }
        if (arg7 != 2) {
            field6018 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method710(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method721(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method715(int arg0);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method723(int arg0);

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method705(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method744(int arg0, int arg1, class491 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method727();

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method709(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method696(int arg0);

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class119 method752(class119 arg0);

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method747(int arg0, int arg1, class272 arg2, class272 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method731(int arg0);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method764();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method732(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public abstract void method726();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method738(int arg0, int arg1, class491 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method746(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method755(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
    public abstract boolean method736();

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lhi;")
    public abstract class64[] method728();

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method762(int arg0);

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method749();

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method756();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class474 method711(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method704();

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method692();

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method754();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method720(class491 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method725(class474 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method734();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
    public abstract void method739();

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method765();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method703();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lpba;II)V")
    public abstract void method751(class491 arg0, class151 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
    public abstract void method702();

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method740();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method694(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method742();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lpba;I)V")
    public abstract void method717(class491 arg0, class151 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method699();

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method722(int arg0);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method757();

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method761(int arg0);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()[Lqg;")
    public abstract class214[] method706();

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method758();
}
