import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class473 {

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
    public boolean field6887 = false;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lega;")
    public static class713 field6886 = new class713();

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "[C")
    public static char[] field6891 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2850(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field6882++;
            return (arg2 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILtca;IZ[IBLps;Lps;IZI[Z)V", line = 17)
    private final void method2851(int arg0, class173 arg1, int arg2, boolean arg3, int[] arg4, byte arg5, class97 arg6, class97 arg7, int arg8, boolean arg9, int arg10, boolean[] arg11) {
        field6881++;
        if (arg6 == null || arg8 == 0) {
            for (int var38 = 0; var38 < arg7.field1371; var38++) {
                short var39 = arg7.field1364[var38];
                if (arg11 == null || arg11[var39] == arg3 || arg1.field2683[var39] == 0) {
                    short var40 = arg7.field1365[var38];
                    if (var40 != -1) {
                        this.method2856(0, 0, true, arg0, 0, arg1.field2675[var40], arg9, arg4, 0, arg1.field2680[var40] & arg2);
                    }
                    this.method2856(arg7.field1372[var38], arg1.field2683[var39], true, arg0, arg7.field1370[var38], arg1.field2675[var39], arg9, arg4, arg7.field1376[var38], arg1.field2680[var39] & arg2);
                }
            }
            return;
        }
        if (arg5 >= -82) {
            this.field6887 = true;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg1.field2682; var15++) {
            boolean var16 = false;
            if (var13 < arg7.field1371 && arg7.field1364[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg6.field1371 && arg6.field1364[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg11[var15] == arg3 || arg1.field2683[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg1.field2683[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var21 = arg7.field1373[var13];
                        var22 = arg7.field1376[var13];
                        var20 = arg7.field1372[var13];
                        var23 = arg7.field1365[var13];
                        var24 = arg7.field1370[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var22 = var18;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg6.field1372[var14];
                        var26 = arg6.field1376[var14];
                        var27 = arg6.field1373[var14];
                        var28 = arg6.field1370[var14];
                        var29 = arg6.field1365[var14];
                        var14++;
                    } else {
                        var26 = var18;
                        var25 = var18;
                        var27 = 0;
                        var29 = -1;
                        var28 = var18;
                    }
                    if (var23 != -1) {
                        this.method2856(0, 0, true, arg0, 0, arg1.field2675[var23], arg9, arg4, 0, arg1.field2680[var23] & arg2);
                    } else if (var29 != -1) {
                        this.method2856(0, 0, true, arg0, 0, arg1.field2675[var29], arg9, arg4, 0, arg2 & arg1.field2680[var29]);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var34 = var22;
                        var35 = var24;
                        var33 = var20;
                    } else if (var19 == 2) {
                        int var30 = var26 - var22 & 0x3FFF;
                        int var31 = var25 - var20 & 0x3FFF;
                        int var32 = var28 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg8 * var31 / arg10 + var20 & 0x3FFF;
                        var34 = arg8 * var30 / arg10 + var22 & 0x3FFF;
                        var35 = arg8 * var32 / arg10 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var26 - var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var35 = 0;
                        var33 = 0;
                        var34 = arg8 * var37 / arg10 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var26 - var22 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = var24 + ((var28 - var24) * arg8 / arg10);
                        var34 = arg8 * var36 / arg10 + var22 & 0x3F;
                        var33 = var20 + ((var25 - var20) * arg8 / arg10);
                    } else {
                        var34 = (var26 - var22) * arg8 / arg10 + var22;
                        var33 = (var25 - var20) * arg8 / arg10 + var20;
                        var35 = (var28 - var24) * arg8 / arg10 + var24;
                    }
                    this.method2856(var33, var19, true, arg0, var35, arg1.field2675[var15], arg9, arg4, var34, arg2 & arg1.field2680[var15]);
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILs;II)V", line = 239)
    public final void method2852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class280 arg6, int arg7, int arg8) {
        field6883++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg1 / 2;
        int var15 = arg6.method1786(arg8 + var14, (byte) 113, arg7 + var13);
        int var16 = arg0 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg6.method1786(arg8 + var17, (byte) 113, arg7 + var16);
        int var19 = -arg0 / 2;
        int var20 = arg1 / 2;
        int var21 = arg6.method1786(arg8 + var20, (byte) 113, arg7 + var19);
        int var22 = arg0 / 2;
        int var23 = arg1 / 2;
        int var24 = arg6.method1786(arg8 + var23, (byte) 113, arg7 + var22);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = 92 / ((arg5 + 48) / 39);
        int var28 = var18 >= var24 ? var24 : var18;
        int var29 = var15 >= var21 ? var21 : var15;
        if (arg1 != 0) {
            int var30 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var30 != 0) {
                if (arg3 != 0) {
                    if (var30 > 8192) {
                        int var31 = 16384 - arg3;
                        if (var30 < var31) {
                            var30 = var31;
                        }
                    } else if (var30 > arg3) {
                        var30 = arg3;
                    }
                }
                this.method243(var30);
            }
        }
        int var32 = var15 + var24;
        if (arg0 != 0) {
            int var33 = (int) (Math.atan2((double) (var29 - var28), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var33 != 0) {
                if (arg2 != 0) {
                    if (var33 > 8192) {
                        int var34 = 16384 - arg2;
                        if (var33 < var34) {
                            var33 = var34;
                        }
                    } else if (var33 > arg2) {
                        var33 = arg2;
                    }
                }
                this.method279(var33);
            }
        }
        if (var32 > var18 + var21) {
            var32 = var18 + var21;
        }
        int var35 = (var32 >> 1) - arg4;
        if (var35 != 0) {
            this.method238(0, var35, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZLae;[IIIIILae;I)V", line = 359)
    public final void method2853(int arg0, int arg1, boolean arg2, class253 arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, class253 arg9, int arg10) {
        field6885++;
        if (arg0 == -1) {
            return;
        }
        this.method260();
        if (!this.method273()) {
            this.method280();
        } else if (arg7 == -24446) {
            class97 var12 = arg3.field3650[arg0];
            class173 var13 = var12.field1374;
            class97 var14 = null;
            if (arg9 != null) {
                var14 = arg9.field3650[arg1];
                if (var14.field1374 != var13) {
                    var14 = null;
                }
            }
            this.method2851(arg10, var13, arg8, false, arg4, (byte) -89, var14, var12, arg6, arg2, arg5, null);
            this.method241();
            this.method280();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILae;IIILae;ZII)V", line = 412)
    public final void method2854(int arg0, class253 arg1, int arg2, int arg3, int arg4, class253 arg5, boolean arg6, int arg7, int arg8) {
        field6879++;
        if (~arg2 == arg3) {
            return;
        }
        this.method260();
        if (!this.method273()) {
            this.method280();
            return;
        }
        class97 var10 = arg5.field3650[arg2];
        class173 var11 = var10.field1374;
        class97 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field3650[arg0];
            if (var12.field1374 != var11) {
                var12 = null;
            }
        }
        this.method2851(arg8, var11, 65535, false, null, (byte) -109, var12, var10, arg7, arg6, arg4, null);
        this.method241();
        this.method280();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILae;)V", line = 459)
    public final void method2855(byte arg0, int arg1, class253 arg2) {
        if (arg0 != -122) {
            this.method2855((byte) 71, -9, null);
        }
        field6884++;
        if (arg1 == -1) {
            return;
        }
        this.method260();
        if (!this.method273()) {
            this.method280();
            return;
        }
        class97 var4 = arg2.field3650[arg1];
        class173 var5 = var4.field1374;
        for (int var6 = 0; var6 < var4.field1371; var6++) {
            short var7 = var4.field1364[var6];
            if (var5.field2676[var7]) {
                if (var4.field1365[var6] != -1) {
                    this.method245(0, 0, 0, 0);
                }
                this.method245(var5.field2683[var7], var4.field1376[var6], var4.field1372[var6], var4.field1370[var6]);
            }
        }
        this.method241();
        this.method280();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZII[IZ[III)V", line = 511)
    private final void method2856(int arg0, int arg1, boolean arg2, int arg3, int arg4, int[] arg5, boolean arg6, int[] arg7, int arg8, int arg9) {
        field6880++;
        if (arg3 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = -arg8;
                arg8 = arg4;
                arg4 = var16;
            } else if (arg1 == 3) {
                int var15 = arg8;
                arg8 = arg4;
                arg4 = var15;
            } else if (arg1 == 2) {
                int var14 = arg8;
                arg8 = -arg4 & 0x3FFF;
                arg4 = var14 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg4 = -arg4;
                arg8 = -arg8;
            } else if (arg1 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = arg8;
                arg8 = -arg4;
                arg4 = var13;
            } else if (arg1 == 3) {
                int var12 = arg8;
                arg8 = arg4;
                arg4 = var12;
            } else if (arg1 == 2) {
                int var11 = arg8;
                arg8 = arg4 & 0x3FFF;
                arg4 = -var11 & 0x3FFF;
            }
        }
        if (arg9 == 65535) {
            this.method248(arg1, arg5, arg8, arg0, arg4, arg3, arg6);
        } else {
            this.method278(arg1, arg5, arg8, arg0, arg4, arg6, arg9, arg7);
        }
        if (!arg2) {
            field6891 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 610)
    public static void method2857(int arg0) {
        field6886 = null;
        field6891 = null;
        if (arg0 != -1) {
            field6890 = -17;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII[B)Z", line = 642)
    public static final boolean method2858(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6888++;
        boolean var6 = true;
        class645 var7 = new class645(arg5);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method3738((byte) 114);
            if (var9 == 0) {
                if (arg4 != -23) {
                    method2858(-75, 44, 51, -120, 117, null);
                }
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class211 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method3728((byte) 88);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method3745(-6314);
                                    }
                                    int var12 = var7.method3728((byte) 88);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = (var10 & 0xFE2) >> 6;
                                    var15 = var7.method3745(-6314) >> 2;
                                    var16 = var14 + arg1;
                                    var17 = arg2 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= arg0 - 1);
                    } while (var17 >= arg3 - 1);
                    var18 = class239.field3470.method388(var8, 100);
                } while (var15 == 22 && class63.field916.field10193.method2446(17503) == 0 && var18.field3113 == 0 && var18.field3145 != 1 && !var18.field3151);
                var11 = true;
                if (!var18.method1432(-126)) {
                    var6 = false;
                    class44.field477++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZIILae;IILae;Lae;[ZLae;II)V", line = 729)
    public final void method2859(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class253 arg6, int arg7, int arg8, class253 arg9, class253 arg10, boolean[] arg11, class253 arg12, int arg13, int arg14) {
        field6889++;
        if (~arg7 == arg1) {
            return;
        }
        if (arg11 == null || arg8 == -1) {
            this.method2854(arg13, arg9, arg7, 0, arg5, arg12, arg3, arg0, 0);
            return;
        }
        this.method260();
        if (!this.method273()) {
            this.method280();
            return;
        }
        class97 var16 = arg12.field3650[arg7];
        class173 var17 = var16.field1374;
        class97 var18 = null;
        if (arg9 != null) {
            var18 = arg9.field3650[arg13];
            if (var18.field1374 != var17) {
                var18 = null;
            }
        }
        this.method2851(0, var17, 65535, false, null, (byte) -113, var18, var16, arg0, arg3, arg5, arg11);
        class97 var19 = arg10.field3650[arg8];
        class97 var20 = null;
        if (arg6 != null) {
            var20 = arg6.field3650[arg14];
            if (var20.field1374 != var17) {
                var20 = null;
            }
        }
        this.method248(0, new int[0], 0, 0, 0, 0, arg3);
        this.method2851(0, var19.field1374, 65535, true, null, (byte) -122, var20, var19, arg2, arg3, arg4, arg11);
        this.method241();
        this.method280();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lql;Leda;II)V")
    public abstract void method235(class738 arg0, class102 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lql;IZ)V")
    public abstract void method276(class738 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method238(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method267(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method269();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class183 method242(class183 arg0);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method255();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class473 method251(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method268();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method246();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method247(int arg0);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method262();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method240();

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method275();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lwr;")
    public abstract class459[] method266();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method256();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method264(class473 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method286(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILql;ZI)Z")
    public abstract boolean method277(int arg0, int arg1, class738 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method280();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method250();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method236();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method279(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method248(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method272();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method287(int arg0);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method259(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method257(int arg0);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method270(int arg0, int arg1, class280 arg2, class280 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lql;)V")
    public abstract void method244(class738 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lql;Leda;I)V")
    public abstract void method265(class738 arg0, class102 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method258();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method253();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method245(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method271(int arg0);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method273();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lol;")
    public abstract class285[] method285();

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method239();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method254(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method282(int arg0);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method263();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method278(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method243(int arg0);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
    public abstract boolean method284();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILql;ZII)Z")
    public abstract boolean method283(int arg0, int arg1, class738 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method260();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method241();
}
