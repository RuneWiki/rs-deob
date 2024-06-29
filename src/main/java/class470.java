import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class470 {

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
    public boolean field6559 = false;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field6560 = 2;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILws;II[ZLms;Z[IZILws;I)V", line = 19)
    private final void method2705(int arg0, class578 arg1, int arg2, int arg3, boolean[] arg4, class108 arg5, boolean arg6, int[] arg7, boolean arg8, int arg9, class578 arg10, int arg11) {
        field6551++;
        if (arg1 == null || arg0 == 0) {
            for (int var39 = 0; var39 < arg10.field7908; var39++) {
                short var40 = arg10.field7900[var39];
                if (arg4 == null || arg6 == arg4[var40] || arg5.field1279[var40] == 0) {
                    short var41 = arg10.field7909[var39];
                    if (var41 != -1) {
                        this.method2709(arg8, 0, arg5.field1276[var41], arg7, 0, true, 0, arg3, arg5.field1280[var41] & arg2, 0);
                    }
                    this.method2709(arg8, arg10.field7899[var39], arg5.field1276[var40], arg7, arg5.field1279[var40], true, arg10.field7905[var39], arg3, arg5.field1280[var40] & arg2, arg10.field7912[var39]);
                }
            }
            return;
        }
        int var13 = 23 % ((arg11 - 19) / 41);
        int var14 = 0;
        int var15 = 0;
        for (int var16 = 0; var16 < arg5.field1283; var16++) {
            boolean var17 = false;
            if (arg10.field7908 > var14 && arg10.field7900[var14] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (var15 < arg1.field7908 && arg1.field7900[var15] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg4 == null || arg4[var16] == arg6 || arg5.field1279[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg5.field1279[var16];
                    if (var20 == 3 || var20 == 10) {
                        var19 = 128;
                    }
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    short var25;
                    if (var17) {
                        var23 = arg10.field7915[var14];
                        var25 = arg10.field7912[var14];
                        var24 = arg10.field7905[var14];
                        var21 = arg10.field7899[var14];
                        var22 = arg10.field7909[var14];
                        var14++;
                    } else {
                        var21 = var19;
                        var22 = -1;
                        var23 = 0;
                        var24 = var19;
                        var25 = var19;
                    }
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    short var30;
                    if (var18) {
                        var26 = arg1.field7905[var15];
                        var27 = arg1.field7915[var15];
                        var28 = arg1.field7909[var15];
                        var29 = arg1.field7899[var15];
                        var30 = arg1.field7912[var15];
                        var15++;
                    } else {
                        var29 = var19;
                        var28 = -1;
                        var27 = 0;
                        var26 = var19;
                        var30 = var19;
                    }
                    if (var22 != -1) {
                        this.method2709(arg8, 0, arg5.field1276[var22], arg7, 0, true, 0, arg3, arg2 & arg5.field1280[var22], 0);
                    } else if (var28 != -1) {
                        this.method2709(arg8, 0, arg5.field1276[var28], arg7, 0, true, 0, arg3, arg2 & arg5.field1280[var28], 0);
                    }
                    int var32;
                    int var33;
                    int var34;
                    if ((var23 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var34 = var21;
                        var33 = var25;
                        var32 = var24;
                    } else if (var20 == 2) {
                        int var36 = var26 - var24 & 0x3FFF;
                        int var37 = var29 - var21 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        int var38 = var30 - var25 & 0x3FFF;
                        if (var38 >= 8192) {
                            var38 -= 16384;
                        }
                        var32 = arg0 * var36 / arg9 + var24 & 0x3FFF;
                        var34 = arg0 * var37 / arg9 + var21 & 0x3FFF;
                        var33 = arg0 * var38 / arg9 + var25 & 0x3FFF;
                    } else if (var20 == 9) {
                        int var35 = var26 - var24 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        var32 = arg0 * var35 / arg9 + var24 & 0x3FFF;
                        var33 = 0;
                        var34 = 0;
                    } else if (var20 == 7) {
                        int var31 = var26 - var24 & 0x3F;
                        if (var31 >= 32) {
                            var31 -= 64;
                        }
                        var32 = arg0 * var31 / arg9 + var24 & 0x3F;
                        var33 = (var30 - var25) * arg0 / arg9 + var25;
                        var34 = (var29 - var21) * arg0 / arg9 + var21;
                    } else {
                        var34 = (var29 - var21) * arg0 / arg9 + var21;
                        var32 = (var26 - var24) * arg0 / arg9 + var24;
                        var33 = (var30 - var25) * arg0 / arg9 + var25;
                    }
                    this.method2709(arg8, var34, arg5.field1276[var16], arg7, var20, true, var32, arg3, arg5.field1280[var16] & arg2, var33);
                } else {
                    if (var18) {
                        var15++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILnt;)V", line = 225)
    public final void method2706(byte arg0, int arg1, class493 arg2) {
        field6561++;
        if (arg1 == -1) {
            return;
        }
        this.method606();
        if (!this.method640()) {
            this.method620();
            return;
        }
        if (arg0 != -108) {
            this.method644(-14);
        }
        class578 var4 = arg2.field6801[arg1];
        class108 var5 = var4.field7910;
        for (int var6 = 0; var6 < var4.field7908; var6++) {
            short var7 = var4.field7900[var6];
            if (var5.field1282[var7]) {
                if (var4.field7909[var6] != -1) {
                    this.method619(0, 0, 0, 0);
                }
                this.method619(var5.field1279[var7], var4.field7905[var6], var4.field7899[var6], var4.field7912[var6]);
            }
        }
        this.method635();
        this.method620();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z", line = 271)
    public static final boolean method2707(int arg0, int arg1, int arg2) {
        if (arg2 < 116) {
            return true;
        } else {
            field6558++;
            return (arg0 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 287)
    public static final void method2708(int arg0, byte arg1, String arg2) {
        class191.method1256(13788);
        field6556++;
        class580.method3199(arg1 ^ 0xFFFFFFA7);
        class689.method3894((byte) 69);
        class651.method3680((byte) -106, arg0, arg2);
        class163.method1005(-31312);
        class327.method1907(0, class146.field1963);
        if (arg1 != 5) {
            method2710(2, (byte) 23);
        }
        class590.method3263((byte) 115, class146.field1963);
        class590.method3266(class146.field1963, class390.field5228, -65534);
        class237.method1466(2048);
        class413.method2339(class369.field4849, 0);
        class398.method2275(-1);
        class595.method3305((byte) 91);
        if (class576.field7861 == 3) {
            class28.method182(4, 29697);
        } else if (class576.field7861 == 7) {
            class28.method182(8, 29697);
        } else if (class576.field7861 == 10) {
            class28.method182(11, 29697);
        } else if (class576.field7861 == 1 || class576.field7861 == 2) {
            class208.method1322(arg1 - 31769);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI[I[IIZIIII)V", line = 325)
    private final void method2709(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field6557++;
        if (arg7 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg6;
                arg6 = arg9;
                arg9 = var13;
            } else if (arg4 == 3) {
                int var11 = arg6;
                arg6 = arg9;
                arg9 = var11;
            } else if (arg4 == 2) {
                int var12 = arg6;
                arg6 = -arg9 & 0x3FFF;
                arg9 = var12 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg6 = -arg6;
                arg9 = -arg9;
            } else if (arg4 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg6;
                arg6 = -arg9;
                arg9 = var16;
            } else if (arg4 == 3) {
                int var15 = arg6;
                arg6 = arg9;
                arg9 = var15;
            } else if (arg4 == 2) {
                int var14 = arg6;
                arg6 = arg9 & 0x3FFF;
                arg9 = -var14 & 0x3FFF;
            }
        }
        if (arg8 == 65535) {
            this.method646(arg4, arg2, arg6, arg1, arg9, arg7, arg0);
        } else {
            this.method614(arg4, arg2, arg6, arg1, arg9, arg0, arg8, arg3);
        }
        if (!arg5) {
            field6552 = -98;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)V", line = 429)
    public static final void method2710(int arg0, byte arg1) {
        field6562++;
        class256 var2 = class592.method3279((byte) -54, 11, arg0);
        var2.method1546((byte) 111);
        if (arg1 != 100) {
            method2710(48, (byte) 11);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILi;IIIIIII)V", line = 453)
    public final void method2711(int arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6555++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg7 / 2;
        int var14 = -arg0 / 2;
        if (arg3 != 23452) {
            field6552 = -50;
        }
        int var15 = arg1.method1609(arg6 + var13, arg2 + var14, -123);
        int var16 = arg7 / 2;
        int var17 = -arg0 / 2;
        int var18 = arg1.method1609(arg6 + var16, arg2 + var17, arg3 ^ 0x5BC0);
        int var19 = -arg7 / 2;
        int var20 = arg0 / 2;
        int var21 = arg1.method1609(arg6 + var19, arg2 + var20, -128);
        int var22 = arg7 / 2;
        int var23 = arg0 / 2;
        int var24 = arg1.method1609(arg6 + var22, arg2 - -var23, 61);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var18 >= var24 ? var24 : var18;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg0 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg4 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg4;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg4 < var29) {
                        var29 = arg4;
                    }
                }
                this.method643(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg7 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg8 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg8;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (arg8 < var32) {
                        var32 = arg8;
                    }
                }
                this.method616(var32);
            }
        }
        if ((var18 + var21) < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg5;
        if (var34 != 0) {
            this.method605(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZBIIILnt;Lnt;ILnt;IIILnt;I[Z)V", line = 596)
    public final void method2712(boolean arg0, byte arg1, int arg2, int arg3, int arg4, class493 arg5, class493 arg6, int arg7, class493 arg8, int arg9, int arg10, int arg11, class493 arg12, int arg13, boolean[] arg14) {
        field6553++;
        if (arg2 == -1) {
            return;
        }
        if (arg14 == null || arg9 == -1) {
            this.method2714(arg0, -12224, arg7, arg2, 0, arg6, arg5, arg4, arg13);
            return;
        }
        this.method606();
        if (!this.method640()) {
            this.method620();
            return;
        }
        class578 var16 = arg5.field6801[arg2];
        class108 var17 = var16.field7910;
        if (arg1 != -9) {
            return;
        }
        class578 var18 = null;
        if (arg6 != null) {
            var18 = arg6.field6801[arg4];
            if (var18.field7910 != var17) {
                var18 = null;
            }
        }
        this.method2705(arg7, var18, 65535, 0, arg14, var17, false, null, arg0, arg13, var16, 77);
        class578 var19 = arg8.field6801[arg9];
        class578 var20 = null;
        if (arg12 != null) {
            var20 = arg12.field6801[arg10];
            if (var20.field7910 != var17) {
                var20 = null;
            }
        }
        this.method646(0, new int[0], 0, 0, 0, 0, arg0);
        this.method2705(arg3, var20, 65535, 0, arg14, var19.field7910, true, null, arg0, arg11, var19, arg1 ^ 0x3A);
        this.method635();
        this.method620();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILnt;I[IIZLnt;II)V", line = 665)
    public final void method2713(int arg0, int arg1, int arg2, class493 arg3, int arg4, int[] arg5, int arg6, boolean arg7, class493 arg8, int arg9, int arg10) {
        if (arg10 != -1) {
            return;
        }
        field6554++;
        if (arg9 == -1) {
            return;
        }
        this.method606();
        if (!this.method640()) {
            this.method620();
            return;
        }
        class578 var12 = arg8.field6801[arg9];
        class108 var13 = var12.field7910;
        class578 var14 = null;
        if (arg3 != null) {
            var14 = arg3.field6801[arg2];
            if (var14.field7910 != var13) {
                var14 = null;
            }
        }
        this.method2705(arg1, var14, arg4, arg0, null, var13, false, arg5, arg7, arg6, var12, 117);
        this.method635();
        this.method620();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIILnt;Lnt;II)V", line = 705)
    public final void method2714(boolean arg0, int arg1, int arg2, int arg3, int arg4, class493 arg5, class493 arg6, int arg7, int arg8) {
        field6550++;
        if (arg3 == -1) {
            return;
        }
        this.method606();
        if (!this.method640()) {
            this.method620();
            return;
        }
        class578 var10 = arg6.field6801[arg3];
        class108 var11 = var10.field7910;
        if (arg1 != -12224) {
            return;
        }
        class578 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field6801[arg7];
            if (var12.field7910 != var11) {
                var12 = null;
            }
        }
        this.method2705(arg2, var12, 65535, arg4, null, var11, false, null, arg0, arg8, var10, 97);
        this.method635();
        this.method620();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lbc;I)V")
    public abstract void method625(class487 arg0, class667 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method610(class487 arg0);

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method631(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public abstract void method634();

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method613();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method655(int arg0, int arg1, class487 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method635();

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method642();

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method636();

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class117 method654(class117 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class470 method649(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lbc;II)V")
    public abstract void method648(class487 arg0, class667 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method647();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()[Lmp;")
    public abstract class140[] method652();

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method644(int arg0);

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method616(int arg0);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lfk;")
    public abstract class118[] method628();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method646(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method611(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method602(int arg0);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
    public abstract boolean method615();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
    public abstract void method606();

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method660();

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
    public abstract void method620();

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method650();

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method626();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method603(int arg0, int arg1, class487 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method638(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method621();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method627();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method651(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method624(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method645(int arg0, int arg1, class270 arg2, class270 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method612(int arg0);

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method605(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method619(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method643(int arg0);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method657();

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method640();

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method614(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method604();

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method653(int arg0);

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method637();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method617(class470 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method656();
}
