import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class397 {

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Z")
    public boolean field5750 = false;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[[Z")
    public static boolean[][] field5753 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
    public static int[] field5752 = new int[1000];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Z", line = 5)
    public static final boolean method2409(byte arg0) {
        field5749++;
        try {
            class168 var1 = new class168();
            if (arg0 > -24) {
                method2409((byte) 115);
            }
            byte[] var2 = var1.method1265(class229.field3401, (byte) 101);
            class475.method2782(var2, -83);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILhea;I)V", line = 31)
    public final void method2410(int arg0, class374 arg1, int arg2) {
        field5746++;
        if (arg2 == -1) {
            return;
        }
        this.method427();
        if (!this.method472()) {
            this.method462();
            return;
        }
        class15 var4 = arg1.field5192[arg2];
        if (arg0 < 5) {
            this.method468();
        }
        class21 var5 = var4.field236;
        for (int var6 = 0; var6 < var4.field249; var6++) {
            short var7 = var4.field244[var6];
            if (var5.field283[var7]) {
                if (var4.field245[var6] != -1) {
                    this.method465(0, 0, 0, 0);
                }
                this.method465(var5.field280[var7], var4.field238[var6], var4.field242[var6], var4.field239[var6]);
            }
        }
        this.method435();
        this.method462();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Luv;ZII[ZLge;ZLge;[IIII)V", line = 81)
    private final void method2411(class21 arg0, boolean arg1, int arg2, int arg3, boolean[] arg4, class15 arg5, boolean arg6, class15 arg7, int[] arg8, int arg9, int arg10, int arg11) {
        if (arg11 != 2) {
            this.field5750 = true;
        }
        field5748++;
        if (arg7 == null || arg2 == 0) {
            for (int var38 = 0; var38 < arg5.field249; var38++) {
                short var39 = arg5.field244[var38];
                if (arg4 == null || arg4[var39] == arg6 || arg0.field280[var39] == 0) {
                    short var40 = arg5.field245[var38];
                    if (var40 != -1) {
                        this.method2414(0, arg0.field287[var40], arg8, arg0.field290[var40] & arg3, arg1, 0, 0, true, arg10, 0);
                    }
                    this.method2414(arg5.field242[var38], arg0.field287[var39], arg8, arg0.field290[var39] & arg3, arg1, arg5.field238[var38], arg0.field280[var39], true, arg10, arg5.field239[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg0.field282; var15++) {
            boolean var16 = false;
            if (var13 < arg5.field249 && arg5.field244[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg7.field249 && arg7.field244[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg4 == null || arg4[var15] == arg6 || arg0.field280[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field280[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg5.field245[var13];
                        var21 = arg5.field243[var13];
                        var22 = arg5.field239[var13];
                        var23 = arg5.field238[var13];
                        var24 = arg5.field242[var13];
                        var13++;
                    } else {
                        var22 = var18;
                        var21 = 0;
                        var24 = var18;
                        var23 = var18;
                        var20 = -1;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg7.field243[var14];
                        var26 = arg7.field239[var14];
                        var27 = arg7.field245[var14];
                        var28 = arg7.field242[var14];
                        var29 = arg7.field238[var14];
                        var14++;
                    } else {
                        var28 = var18;
                        var26 = var18;
                        var29 = var18;
                        var27 = -1;
                        var25 = 0;
                    }
                    if (var20 != -1) {
                        this.method2414(0, arg0.field287[var20], arg8, arg3 & arg0.field290[var20], arg1, 0, 0, true, arg10, 0);
                    } else if (var27 != -1) {
                        this.method2414(0, arg0.field287[var27], arg8, arg3 & arg0.field290[var27], arg1, 0, 0, true, arg10, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var34 = var24;
                        var33 = var23;
                        var35 = var22;
                    } else if (var19 == 2) {
                        int var30 = var29 - var23 & 0x3FFF;
                        int var31 = var28 - var24 & 0x3FFF;
                        int var32 = var26 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var33 = arg2 * var30 / arg9 + var23 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = var24 + (arg2 * var31 / arg9) & 0x3FFF;
                        var35 = arg2 * var32 / arg9 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var29 - var23 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = var23 + (arg2 * var37 / arg9) & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var36 = var29 - var23 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var33 = var23 + (arg2 * var36 / arg9) & 0x3F;
                        var35 = (var26 - var22) * arg2 / arg9 + var22;
                        var34 = (var28 - var24) * arg2 / arg9 + var24;
                    } else {
                        var34 = (var28 - var24) * arg2 / arg9 + var24;
                        var33 = var23 + ((var29 - var23) * arg2 / arg9);
                        var35 = var22 + ((var26 - var22) * arg2 / arg9);
                    }
                    this.method2414(var34, arg0.field287[var15], arg8, arg0.field290[var15] & arg3, arg1, var33, var19, true, arg10, var35);
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

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLhea;I[IIIIILhea;I)V", line = 291)
    public final void method2412(int arg0, boolean arg1, class374 arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, class374 arg9, int arg10) {
        field5743++;
        if (arg10 == -1) {
            return;
        }
        this.method427();
        if (!this.method472()) {
            this.method462();
            return;
        }
        class15 var12 = arg2.field5192[arg10];
        class21 var13 = var12.field236;
        class15 var14 = null;
        if (arg5 < 21) {
            field5751 = -56;
        }
        if (arg9 != null) {
            var14 = arg9.field5192[arg6];
            if (var14.field236 != var13) {
                var14 = null;
            }
        }
        this.method2411(var13, arg1, arg3, arg7, null, var12, false, var14, arg4, arg0, arg8, 2);
        this.method435();
        this.method462();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILi;IIIIIII)V", line = 333)
    public final void method2413(int arg0, class682 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5754++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg5 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg1.method3861((byte) 107, arg6 + var13, arg8 + var14);
        int var16 = arg5 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg1.method3861((byte) -117, arg6 + var16, arg8 + var17);
        int var19 = -arg5 / 2;
        int var20 = arg2 / 2;
        int var21 = arg1.method3861((byte) -75, arg6 + var19, arg8 + var20);
        int var22 = arg5 / 2;
        int var23 = arg2 / 2;
        int var24 = arg1.method3861((byte) 127, arg6 + var22, arg8 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 <= var18 ? var24 : var18;
        if (arg2 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg7 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg7;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > arg7) {
                        var28 = arg7;
                    }
                }
                this.method436(var28);
            }
        }
        int var30 = var15 < var21 ? var15 : var21;
        int var31 = var15 + var24;
        if (~arg5 != arg0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg4 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg4;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg4 < var32) {
                        var32 = arg4;
                    }
                }
                this.method458(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg3;
        if (var34 != 0) {
            this.method455(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I[IIZIIZII)V", line = 452)
    private final void method2414(int arg0, int[] arg1, int[] arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (!arg7) {
            this.field5750 = true;
        }
        field5742++;
        if (arg8 == 1) {
            if (arg6 == 0 || arg6 == 1) {
                int var13 = -arg5;
                arg5 = arg9;
                arg9 = var13;
            } else if (arg6 == 3) {
                int var12 = arg5;
                arg5 = arg9;
                arg9 = var12;
            } else if (arg6 == 2) {
                int var11 = arg5;
                arg5 = -arg9 & 0x3FFF;
                arg9 = var11 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg6 == 0 || arg6 == 1) {
                arg5 = -arg5;
                arg9 = -arg9;
            } else if (arg6 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg6 == 0 || arg6 == 1) {
                int var16 = arg5;
                arg5 = -arg9;
                arg9 = var16;
            } else if (arg6 == 3) {
                int var14 = arg5;
                arg5 = arg9;
                arg9 = var14;
            } else if (arg6 == 2) {
                int var15 = arg5;
                arg5 = arg9 & 0x3FFF;
                arg9 = -var15 & 0x3FFF;
            }
        }
        if (arg3 == 65535) {
            this.method440(arg6, arg1, arg5, arg0, arg9, arg8, arg4);
        } else {
            this.method439(arg6, arg1, arg5, arg0, arg9, arg4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V", line = 555)
    public static final void method2415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class260.field3750 = arg3;
        field5747++;
        class208.field3211 = arg0;
        if (arg4 != 5277) {
            method2415(5, -93, 107, 88, -65, 17);
        }
        class168.field2750 = arg2;
        class498.field7412 = arg5;
        class320.field4409 = arg1;
        if (class260.field3750 >= 100) {
            int var6 = class168.field2750 * 512 + 256;
            int var7 = class498.field7412 * 512 + 256;
            int var8 = class603.method3433(var7, class416.field5926, var6, -95) - class320.field4409;
            int var9 = var6 - class551.field8078;
            int var10 = var8 - class277.field3933;
            int var11 = var7 - class322.field4478;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class666.field9366 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class432.field6220 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class694.field9854 = 0;
            if (class666.field9366 < 1024) {
                class666.field9366 = 1024;
            }
            if (class666.field9366 > 3072) {
                class666.field9366 = 3072;
            }
        }
        class40.field544 = 2;
        class76.field1181 = -1;
        class294.field4104 = -1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 610)
    public static void method2416(boolean arg0) {
        field5753 = null;
        field5752 = null;
        if (arg0) {
            field5752 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ZLhea;Lhea;IZLhea;IIIIILhea;I)V", line = 625)
    public final void method2417(int arg0, int arg1, boolean[] arg2, class374 arg3, class374 arg4, int arg5, boolean arg6, class374 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class374 arg13, int arg14) {
        field5744++;
        if (arg9 == -1) {
            return;
        }
        if (arg2 == null || arg12 == -1) {
            this.method2418(0, arg6, arg10, arg13, arg14, arg5, -1, arg9, arg7);
            return;
        }
        this.method427();
        if (arg11 != 20580) {
            this.method2412(-100, true, null, -114, null, -71, 103, -44, -80, null, 0);
        }
        if (!this.method472()) {
            this.method462();
            return;
        }
        class15 var16 = arg7.field5192[arg9];
        class21 var17 = var16.field236;
        class15 var18 = null;
        if (arg13 != null) {
            var18 = arg13.field5192[arg14];
            if (var18.field236 != var17) {
                var18 = null;
            }
        }
        this.method2411(var17, arg6, arg5, 65535, arg2, var16, false, var18, null, arg10, 0, 2);
        class15 var19 = arg4.field5192[arg12];
        class15 var20 = null;
        if (arg3 != null) {
            var20 = arg3.field5192[arg1];
            if (var20.field236 != var17) {
                var20 = null;
            }
        }
        this.method440(0, new int[0], 0, 0, 0, 0, arg6);
        this.method2411(var19.field236, arg6, arg8, 65535, arg2, var19, true, var20, null, arg0, 0, 2);
        this.method435();
        this.method462();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZILhea;IIIILhea;)V", line = 725)
    public final void method2418(int arg0, boolean arg1, int arg2, class374 arg3, int arg4, int arg5, int arg6, int arg7, class374 arg8) {
        field5745++;
        if (arg6 == arg7) {
            return;
        }
        this.method427();
        if (!this.method472()) {
            this.method462();
            return;
        }
        class15 var10 = arg8.field5192[arg7];
        class21 var11 = var10.field236;
        class15 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field5192[arg4];
            if (var12.field236 != var11) {
                var12 = null;
            }
        }
        this.method2411(var11, arg1, arg5, 65535, null, var10, false, var12, null, arg2, arg0, arg6 + 3);
        this.method435();
        this.method462();
    }

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method438(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method471(class152 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public abstract void method427();

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method445();

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method430();

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method474(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;IZ)V")
    public abstract void method456(class152 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method468();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public abstract void method462();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method440(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method446();

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method472();

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lkw;")
    public abstract class7[] method480();

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class427 method483(class427 arg0);

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method479(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
    public abstract void method444();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method466(class397 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method484(int arg0, int arg1, class682 arg2, class682 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method439(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method450();

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method465(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lj;I)V")
    public abstract void method460(class152 arg0, class299 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method451(int arg0);

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method432();

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method488(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class397 method475(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method478();

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method461();

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method426(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method434();

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method431();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method442(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method435();

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method458(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method469(int arg0, int arg1, class152 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method449();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method482(int arg0, int arg1, class152 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method464(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method477();

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method452();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lj;II)V")
    public abstract void method448(class152 arg0, class299 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method487(int arg0);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
    public abstract boolean method485();

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()[Lcea;")
    public abstract class94[] method486();

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method455(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method436(int arg0);
}
