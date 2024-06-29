import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class116 {

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "Z")
    public static boolean field1757 = false;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1763 = "";

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "[I")
    public static int[] field1766 = new int[50];

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "F")
    public static float field1762;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "Lkr;")
    public static class6 field1759;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)I", line = 16)
    public static final int method870(int arg0, boolean arg1) {
        field1767++;
        if (!arg1) {
            return 7;
        }
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) + (var22 >> 1) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V", line = 124)
    public static void method875(int arg0) {
        if (arg0 == 27826) {
            field1766 = null;
            field1759 = null;
            field1763 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILin;I)V", line = 137)
    public final void method876(int arg0, class182 arg1, int arg2) {
        int var4 = -104 / ((44 - arg2) / 35);
        field1758++;
        if (arg0 == -1 || !this.method872()) {
            return;
        }
        class358 var5 = arg1.field2559[arg0];
        class221 var6 = var5.field4944;
        for (int var7 = 0; var7 < var5.field4930; var7++) {
            short var8 = var5.field4937[var7];
            if (var6.field3098[var8]) {
                if (var5.field4942[var7] != -1) {
                    this.method874(0, 0, 0, 0);
                }
                this.method874(var6.field3096[var8], var5.field4943[var7], var5.field4932[var7], var5.field4936[var7]);
            }
        }
        this.method888();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILin;ILin;ILin;III[ZZILin;BI)V", line = 177)
    public final void method878(int arg0, class182 arg1, int arg2, class182 arg3, int arg4, class182 arg5, int arg6, int arg7, int arg8, boolean[] arg9, boolean arg10, int arg11, class182 arg12, byte arg13, int arg14) {
        field1760++;
        if (arg11 == -1) {
            return;
        }
        if (arg9 == null || arg2 == -1) {
            this.method891(arg7, arg10, 0, arg11, arg6, arg12, arg5, 0, arg8);
        } else if (this.method872()) {
            class358 var16 = arg12.field2559[arg11];
            class221 var17 = var16.field4944;
            if (arg13 > -70) {
                field1763 = null;
            }
            class358 var18 = null;
            if (arg5 != null) {
                var18 = arg5.field2559[arg6];
                if (var18.field4944 != var17) {
                    var18 = null;
                }
            }
            class358 var19 = arg3.field2559[arg2];
            class358 var20 = null;
            if (arg1 != null) {
                var20 = arg1.field2559[arg4];
                if (var20.field4944 != var17) {
                    var20 = null;
                }
            }
            this.method895(false, 0, arg7, var17, arg10, arg8, (int[]) null, (byte) -105, arg9, var16, var18, 65535);
            this.method903(0, new int[0], 0, 0, 0, 0, arg10);
            this.method895(true, 0, arg0, var17, arg10, arg14, (int[]) null, (byte) -41, arg9, var19, var20, 65535);
            this.method888();
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILin;ZIIIILin;[III)V", line = 242)
    public final void method880(int arg0, class182 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class182 arg7, int[] arg8, int arg9, int arg10) {
        field1761++;
        if (arg5 == -1) {
            return;
        }
        int var12 = 78 % ((-arg9 - 53) / 34);
        if (!this.method872()) {
            return;
        }
        class358 var13 = arg7.field2559[arg5];
        class221 var14 = var13.field4944;
        class358 var15 = null;
        if (arg1 != null) {
            var15 = arg1.field2559[arg3];
            if (var15.field4944 != var14) {
                var15 = null;
            }
        }
        this.method895(false, arg0, arg4, var14, arg2, arg6, arg8, (byte) 108, (boolean[]) null, var13, var15, arg10);
        this.method888();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIILdn;III)V", line = 276)
    public final void method883(int arg0, int arg1, int arg2, class323 arg3, int arg4, int arg5, int arg6) {
        field1768++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg1 / 2;
        int var12 = -arg6 / 2;
        int var13 = arg3.method331(arg4 + var11, arg0 - -var12);
        int var14 = arg1 / 2;
        int var15 = -arg6 / 2;
        int var16 = arg3.method331(arg4 + var14, arg0 + var15);
        if (arg2 != 16383) {
            return;
        }
        int var17 = -arg1 / 2;
        int var18 = arg6 / 2;
        int var19 = arg3.method331(arg4 + var17, arg0 + var18);
        int var20 = arg1 / 2;
        int var21 = arg6 / 2;
        int var22 = arg3.method331(arg4 + var20, arg0 + var21);
        int var23 = var16 <= var13 ? var16 : var13;
        int var24 = var19 < var22 ? var19 : var22;
        int var25 = var22 <= var16 ? var22 : var16;
        int var26 = var19 > var13 ? var13 : var19;
        if (arg6 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method910(var27);
            }
        }
        int var28 = var13 + var22;
        if (arg1 != 0) {
            int var29 = (int) (Math.atan2((double) (var26 - var25), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method873(var29);
            }
        }
        if (var16 + var19 < var28) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg5;
        if (var30 != 0) {
            this.method882(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZIIILin;Lin;II)V", line = 361)
    public final void method891(int arg0, boolean arg1, int arg2, int arg3, int arg4, class182 arg5, class182 arg6, int arg7, int arg8) {
        field1770++;
        if (~arg3 == arg2 || !this.method872()) {
            return;
        }
        class358 var10 = arg5.field2559[arg3];
        class221 var11 = var10.field4944;
        class358 var12 = null;
        if (arg6 != null) {
            var12 = arg6.field2559[arg4];
            if (var12.field4944 != var11) {
                var12 = null;
            }
        }
        this.method895(false, arg7, arg0, var11, arg1, arg8, (int[]) null, (byte) 105, (boolean[]) null, var10, var12, 65535);
        this.method888();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V", line = 401)
    public static final void method894(int arg0, int arg1) {
        class132.field1985 = arg0;
        class318.field4336 = 3;
        int var2 = -56 % ((-arg1 - 65) / 53);
        class281.field3817 = -1;
        class432.field6098 = 100;
        field1769++;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZIILak;ZI[IB[ZLog;Log;I)V", line = 414)
    private final void method895(boolean arg0, int arg1, int arg2, class221 arg3, boolean arg4, int arg5, int[] arg6, byte arg7, boolean[] arg8, class358 arg9, class358 arg10, int arg11) {
        field1756++;
        if (arg10 == null || arg5 == 0) {
            for (int var38 = 0; var38 < arg9.field4930; var38++) {
                short var39 = arg9.field4937[var38];
                if (arg8 == null || arg8[var39] == arg0 || arg3.field3096[var39] == 0) {
                    short var40 = arg9.field4942[var38];
                    if (var40 != -1) {
                        this.method900(arg6, 0, arg1, arg3.field3095[var40], 0, arg11 & arg3.field3092[var40], 0, 0, 0, arg4);
                    }
                    this.method900(arg6, arg9.field4936[var38], arg1, arg3.field3095[var39], arg9.field4943[var38], arg11 & arg3.field3092[var39], arg3.field3096[var39], 0, arg9.field4932[var38], arg4);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = -64 % ((24 - arg7) / 61);
        for (int var16 = 0; var16 < arg3.field3091; var16++) {
            boolean var17 = false;
            if (var13 < arg9.field4930 && arg9.field4937[var13] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (var14 < arg10.field4930 && arg10.field4937[var14] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg8 == null || arg0 == arg8[var16] || arg3.field3096[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg3.field3096[var16];
                    if (var20 == 3) {
                        var19 = 128;
                    }
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    short var25;
                    if (var17) {
                        var21 = arg9.field4929[var13];
                        var22 = arg9.field4943[var13];
                        var23 = arg9.field4932[var13];
                        var24 = arg9.field4942[var13];
                        var25 = arg9.field4936[var13];
                        var13++;
                    } else {
                        var25 = var19;
                        var24 = -1;
                        var23 = var19;
                        var22 = var19;
                        var21 = 0;
                    }
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    short var30;
                    if (var18) {
                        var28 = arg10.field4943[var14];
                        var26 = arg10.field4942[var14];
                        var29 = arg10.field4936[var14];
                        var27 = arg10.field4929[var14];
                        var30 = arg10.field4932[var14];
                        var14++;
                    } else {
                        var26 = -1;
                        var27 = 0;
                        var28 = var19;
                        var29 = var19;
                        var30 = var19;
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var21 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var36 = var25;
                        var35 = var22;
                        var34 = var23;
                    } else if (var20 == 2) {
                        int var31 = var28 - var22 & 0x3FFF;
                        int var32 = var30 - var23 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var33 = var29 - var25 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg5 * var32 / arg2 + var23 & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var35 = arg5 * var31 / arg2 + var22 & 0x3FFF;
                        var36 = arg5 * var33 / arg2 + var25 & 0x3FFF;
                    } else if (var20 == 7) {
                        int var37 = var28 - var22 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var35 = arg5 * var37 / arg2 + var22 & 0x3F;
                        var36 = (var29 - var25) * arg5 / arg2 + var25;
                        var34 = (var30 - var23) * arg5 / arg2 + var23;
                    } else {
                        var35 = (var28 - var22) * arg5 / arg2 + var22;
                        var34 = var23 + ((var30 - var23) * arg5 / arg2);
                        var36 = var25 + ((var29 - var25) * arg5 / arg2);
                    }
                    if (var24 != -1) {
                        this.method900(arg6, 0, arg1, arg3.field3095[var24], 0, arg3.field3092[var24] & arg11, 0, 0, 0, arg4);
                    } else if (var26 != -1) {
                        this.method900(arg6, 0, arg1, arg3.field3095[var26], 0, arg3.field3092[var26] & arg11, 0, 0, 0, arg4);
                    }
                    this.method900(arg6, var36, arg1, arg3.field3095[var16], var35, arg3.field3092[var16] & arg11, var20, 0, var34, arg4);
                } else {
                    if (var17) {
                        var13++;
                    }
                    if (var18) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([III[IIIIIIZ)V", line = 618)
    private final void method900(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg2 == 1) {
            if (arg6 == 0 || arg6 == 1) {
                int var13 = -arg4;
                arg4 = arg1;
                arg1 = var13;
            } else if (arg6 == 3) {
                int var11 = arg4;
                arg4 = arg1;
                arg1 = var11;
            } else if (arg6 == 2) {
                int var12 = arg4;
                arg4 = -arg1 & 0x3FFF;
                arg1 = var12 & 0x3FFF;
            }
        } else if (arg2 == 2) {
            if (arg6 == 0 || arg6 == 1) {
                arg4 = -arg4;
                arg1 = -arg1;
            } else if (arg6 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg2 == 3) {
            if (arg6 == 0 || arg6 == 1) {
                int var16 = arg4;
                arg4 = -arg1;
                arg1 = var16;
            } else if (arg6 == 3) {
                int var14 = arg4;
                arg4 = arg1;
                arg1 = var14;
            } else if (arg6 == 2) {
                int var15 = arg4;
                arg4 = arg1 & 0x3FFF;
                arg1 = -var15 & 0x3FFF;
            }
        }
        if (arg7 != 0) {
            return;
        }
        field1764++;
        if (arg5 == 65535) {
            this.method903(arg6, arg3, arg4, arg8, arg1, arg2, arg9);
        } else {
            this.method902(arg6, arg3, arg4, arg8, arg1, arg9, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "()I")
    public abstract int method863();

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "()I")
    public abstract int method864();

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public abstract void method865(int arg0);

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "()I")
    public abstract int method866();

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public abstract void method867(int arg0);

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "()I")
    public abstract int method868();

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lts;IIIZ)V")
    public abstract void method869(class116 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "()I")
    public abstract int method871();

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "()Z")
    public abstract boolean method872();

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
    public abstract void method873(int arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)V")
    public abstract void method874(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(SS)V")
    public abstract void method877(short arg0, short arg1);

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "()[Lkg;")
    public abstract class217[] method879();

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lve;Luh;II)V")
    public abstract void method881(class309 arg0, class153 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
    public abstract void method882(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "()I")
    public abstract int method884();

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "()Z")
    public abstract boolean method885();

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
    public abstract void method886(int arg0);

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "()V")
    public abstract void method887();

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "()V")
    public abstract void method888();

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "()I")
    public abstract int method889();

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V")
    public abstract void method890(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "()[Lod;")
    public abstract class138[] method892();

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "()I")
    public abstract int method893();

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lve;Luh;I)V")
    public abstract void method896(class309 arg0, class153 arg1, int arg2);

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "(I)V")
    public abstract void method897(int arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILve;Z)Z")
    public abstract boolean method898(int arg0, int arg1, class309 arg2, boolean arg3);

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "()I")
    public abstract int method899();

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "()V")
    public abstract void method901();

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method902(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method903(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILdn;Ldn;III)V")
    public abstract void method904(int arg0, int arg1, class323 arg2, class323 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "()I")
    public abstract int method905();

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Llb;)Llb;")
    public abstract class210 method906(class210 arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BIZ)Lts;")
    public abstract class116 method907(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "(I)V")
    public abstract void method908(int arg0);

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(SS)V")
    public abstract void method909(short arg0, short arg1);

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "(I)V")
    public abstract void method910(int arg0);
}
