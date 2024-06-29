import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class472 {

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Z")
    public boolean field6538 = false;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lea;")
    public static class547 field6534 = new class547(84, 4);

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lwr;")
    public static class459 field6537 = new class459(64);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lmu;")
    public static class303 field6539 = new class303("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field6540;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6541;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2661(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILjea;Ljea;[ZIIILjea;IIZLjea;II)V", line = 12)
    public final void method2652(int arg0, int arg1, class452 arg2, class452 arg3, boolean[] arg4, int arg5, int arg6, int arg7, class452 arg8, int arg9, int arg10, boolean arg11, class452 arg12, int arg13, int arg14) {
        field6529++;
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg7 == -1) {
            this.method2659(arg10, arg2, arg1, arg3, arg11, 0, 112, arg0, arg14);
            return;
        }
        this.method223();
        if (!this.method220()) {
            this.method242();
            return;
        }
        class683 var16 = arg2.field6301[arg1];
        class388 var17 = var16.field9493;
        class683 var18 = null;
        if (arg3 != null) {
            var18 = arg3.field6301[arg14];
            if (var18.field9493 != var17) {
                var18 = null;
            }
        }
        this.method2655(var16, var17, false, var18, null, arg4, arg11, (byte) 77, arg10, 65535, 0, arg0);
        if (arg6 != 28777) {
            this.method240();
        }
        class683 var19 = arg8.field6301[arg7];
        class683 var20 = null;
        if (arg12 != null) {
            var20 = arg12.field6301[arg9];
            if (var20.field9493 != var17) {
                var20 = null;
            }
        }
        this.method239(0, new int[0], 0, 0, 0, 0, arg11);
        this.method2655(var19, var19.field9493, true, var20, null, arg4, arg11, (byte) 69, arg13, 65535, 0, arg5);
        this.method221();
        this.method242();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILjea;IILjea;ZI[III)V", line = 82)
    public final void method2653(int arg0, int arg1, class452 arg2, int arg3, int arg4, class452 arg5, boolean arg6, int arg7, int[] arg8, int arg9, int arg10) {
        field6531++;
        if (arg0 == -1) {
            return;
        }
        this.method223();
        if (!this.method220()) {
            this.method242();
            return;
        }
        if (arg3 != -27033) {
            field6539 = null;
        }
        class683 var12 = arg5.field6301[arg0];
        class388 var13 = var12.field9493;
        class683 var14 = null;
        if (arg2 != null) {
            var14 = arg2.field6301[arg7];
            if (var14.field9493 != var13) {
                var14 = null;
            }
        }
        this.method2655(var12, var13, false, var14, arg8, null, arg6, (byte) 126, arg1, arg4, arg9, arg10);
        this.method221();
        this.method242();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 129)
    public static void method2654(int arg0) {
        field6534 = null;
        field6537 = null;
        if (arg0 != 0) {
            field6539 = null;
        }
        field6539 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lag;Lah;ZLag;[I[ZZBIIII)V", line = 144)
    private final void method2655(class683 arg0, class388 arg1, boolean arg2, class683 arg3, int[] arg4, boolean[] arg5, boolean arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        field6532++;
        if (arg3 == null || arg8 == 0) {
            for (int var38 = 0; var38 < arg0.field9500; var38++) {
                short var39 = arg0.field9508[var38];
                if (arg5 == null || arg5[var39] == arg2 || arg1.field5472[var39] == 0) {
                    short var40 = arg0.field9507[var38];
                    if (var40 != -1) {
                        this.method2656(0, arg6, 0, 0, arg9 & arg1.field5477[var40], (byte) 74, arg10, 0, arg1.field5478[var40], arg4);
                    }
                    this.method2656(arg1.field5472[var39], arg6, arg0.field9494[var38], arg0.field9506[var38], arg9 & arg1.field5477[var39], (byte) 64, arg10, arg0.field9505[var38], arg1.field5478[var39], arg4);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg7 < 52) {
            this.method208(null, -74, false);
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg1.field5469; var15++) {
            boolean var16 = false;
            if (var13 < arg0.field9500 && arg0.field9508[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg3.field9500 && arg3.field9508[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg5 == null || arg5[var15] == arg2 || arg1.field5472[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg1.field5472[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg0.field9507[var13];
                        var21 = arg0.field9499[var13];
                        var22 = arg0.field9506[var13];
                        var23 = arg0.field9505[var13];
                        var24 = arg0.field9494[var13];
                        var13++;
                    } else {
                        var22 = var18;
                        var20 = -1;
                        var23 = var18;
                        var21 = 0;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var26 = arg3.field9505[var14];
                        var25 = arg3.field9506[var14];
                        var29 = arg3.field9499[var14];
                        var28 = arg3.field9507[var14];
                        var27 = arg3.field9494[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = var18;
                        var28 = -1;
                        var29 = 0;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var34 = var23;
                        var35 = var22;
                        var33 = var24;
                    } else if (var19 == 2) {
                        int var30 = var27 - var24 & 0x3FFF;
                        int var31 = var26 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var25 - var22 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var33 = arg8 * var30 / arg11 + var24 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg8 * var31 / arg11 + var23 & 0x3FFF;
                        var35 = arg8 * var32 / arg11 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var27 - var24 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg8 * var37 / arg11 + var24 & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var36 = var27 - var24 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var33 = arg8 * var36 / arg11 + var24 & 0x3F;
                        var35 = (var25 - var22) * arg8 / arg11 + var22;
                        var34 = (var26 - var23) * arg8 / arg11 + var23;
                    } else {
                        var34 = (var26 - var23) * arg8 / arg11 + var23;
                        var33 = var24 + ((var27 - var24) * arg8 / arg11);
                        var35 = (var25 - var22) * arg8 / arg11 + var22;
                    }
                    if (var20 != -1) {
                        this.method2656(0, arg6, 0, 0, arg1.field5477[var20] & arg9, (byte) 73, arg10, 0, arg1.field5478[var20], arg4);
                    } else if (var28 != -1) {
                        this.method2656(0, arg6, 0, 0, arg9 & arg1.field5477[var28], (byte) 82, arg10, 0, arg1.field5478[var28], arg4);
                    }
                    this.method2656(var19, arg6, var33, var35, arg1.field5477[var15] & arg9, (byte) 70, arg10, var34, arg1.field5478[var15], arg4);
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIIIBII[I[I)V", line = 362)
    private final void method2656(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        field6535++;
        if (arg6 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = -arg2;
                arg2 = arg3;
                arg3 = var13;
            } else if (arg0 == 3) {
                int var11 = arg2;
                arg2 = arg3;
                arg3 = var11;
            } else if (arg0 == 2) {
                int var12 = arg2;
                arg2 = -arg3 & 0x3FFF;
                arg3 = var12 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg3 = -arg3;
                arg2 = -arg2;
            } else if (arg0 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = arg2;
                arg2 = -arg3;
                arg3 = var16;
            } else if (arg0 == 3) {
                int var15 = arg2;
                arg2 = arg3;
                arg3 = var15;
            } else if (arg0 == 2) {
                int var14 = arg2;
                arg2 = arg3 & 0x3FFF;
                arg3 = -var14 & 0x3FFF;
            }
        }
        if (arg5 < 51) {
            field6537 = null;
        }
        if (arg4 == 65535) {
            this.method239(arg0, arg8, arg2, arg7, arg3, arg6, arg1);
        } else {
            this.method222(arg0, arg8, arg2, arg7, arg3, arg1, arg4, arg9);
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V", line = 462)
    public static final void method2657() {
        for (int var0 = 0; var0 < class474.field6562; var0++) {
            if (!class284.field3760[var0]) {
                class669 var1 = class85.field1176[var0];
                class551 var2 = var1.field9295;
                int var3 = var1.field9298;
                int var4 = var2.method3133(5) - class522.field7044;
                int var5 = (var4 * 2 >> class443.field6172) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3130(7019) - var4 >> class443.field6172;
                int var9 = var2.method3136(28699) - var4 >> class443.field6172;
                int var10 = var2.method3136(28699) + var4 >> class443.field6172;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class480.field6629) {
                    var10 = class480.field6629 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field9300[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class68.field743) {
                        var16 = class68.field743 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class752 var19 = class300.method1797(var3, var17, var11, field6541 == null ? (field6541 = method2661("lr")) : field6541);
                        if (var19 != null && var19.field10427 != 0) {
                            if (var19.field10427 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field9300[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field9300[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field9300[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field9300[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class284.field3760[var0] = true;
                class25.field188[var3].method1538(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILs;IIIIII)V", line = 635)
    public final void method2658(int arg0, int arg1, class281 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6533++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg1 / 2;
        int var14 = -arg0 / 2;
        int var15 = arg2.method1683(arg4 + var13, arg5 + var14, true);
        int var16 = arg1 / 2;
        int var17 = -arg0 / 2;
        int var18 = arg2.method1683(arg4 + var16, arg5 + var17, true);
        int var19 = -arg1 / 2;
        int var20 = arg0 / 2;
        int var21 = arg2.method1683(arg4 + var19, arg5 + var20, true);
        int var22 = arg1 / 2;
        int var23 = arg0 / arg7;
        int var24 = arg2.method1683(arg4 + var22, arg5 + var23, true);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        if (arg0 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg6 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg6;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg6) {
                        var28 = arg6;
                    }
                }
                this.method229(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        if (arg1 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg8 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg8;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (arg8 < var31) {
                        var31 = arg8;
                    }
                }
                this.method216(var31);
            }
        }
        int var33 = var15 + var24;
        if ((var18 + var21) < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg3;
        if (var34 != 0) {
            this.method237(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjea;ILjea;ZIIII)V", line = 750)
    public final void method2659(int arg0, class452 arg1, int arg2, class452 arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field6536++;
        if (arg2 == -1) {
            return;
        }
        this.method223();
        if (!this.method220()) {
            this.method242();
            return;
        }
        class683 var10 = arg1.field6301[arg2];
        int var11 = 109 % ((53 - arg6) / 58);
        class388 var12 = var10.field9493;
        class683 var13 = null;
        if (arg3 != null) {
            var13 = arg3.field6301[arg8];
            if (var13.field9493 != var12) {
                var13 = null;
            }
        }
        this.method2655(var10, var12, false, var13, null, null, arg4, (byte) 124, arg0, 65535, arg5, arg7);
        this.method221();
        this.method242();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljea;II)V", line = 794)
    public final void method2660(class452 arg0, int arg1, int arg2) {
        field6530++;
        if (arg2 == -1) {
            return;
        }
        this.method223();
        if (!this.method220()) {
            this.method242();
            return;
        }
        class683 var4 = arg0.field6301[arg2];
        class388 var5 = var4.field9493;
        for (int var6 = arg1; var6 < var4.field9500; var6++) {
            short var7 = var4.field9508[var6];
            if (var5.field5470[var7]) {
                if (var4.field9507[var6] != -1) {
                    this.method235(0, 0, 0, 0);
                }
                this.method235(var5.field5472[var7], var4.field9494[var6], var4.field9505[var6], var4.field9506[var6]);
            }
        }
        this.method221();
        this.method242();
    }

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method236(int arg0);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method209();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lfk;")
    public abstract class653[] method218();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method229(int arg0);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method203();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method207(int arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lcia;")
    public abstract class614[] method201();

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method204();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class184 method215(class184 arg0);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method238();

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method225();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
    public abstract boolean method226();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhba;Llda;I)V")
    public abstract void method230(class10 arg0, class486 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method237(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method240();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method216(int arg0);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method242();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method205();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhba;Llda;II)V")
    public abstract void method243(class10 arg0, class486 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method211(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhba;IZ)V")
    public abstract void method208(class10 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method221();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method246();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method232(class472 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method228();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILhba;ZII)Z")
    public abstract boolean method196(int arg0, int arg1, class10 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method227(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method213();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method202(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method233(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method234();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILhba;ZI)Z")
    public abstract boolean method206(int arg0, int arg1, class10 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method245();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method235(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method222(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method195(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method231(int arg0);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method214(int arg0, int arg1, class281 arg2, class281 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class472 method241(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
    public abstract void method223();

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method220();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method224();

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method219();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhba;)V")
    public abstract void method217(class10 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method239(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method212();
}
