import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class472 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Z")
    public boolean field6603 = false;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[I")
    public static int[] field6606 = new int[2];

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "F")
    public static float field6615;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lwda;")
    public static class639 field6610;

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method515(int arg0);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method508(int arg0, int arg1, class281 arg2, class281 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILraa;IZILgk;I[I[ZLgk;IZ)V")
    private final void method2777(int arg0, class607 arg1, int arg2, boolean arg3, int arg4, class475 arg5, int arg6, int[] arg7, boolean[] arg8, class475 arg9, int arg10, boolean arg11) {
        field6609++;
        if (arg5 == null || arg6 == 0) {
            for (int var39 = 0; var39 < arg9.field6627; var39++) {
                short var40 = arg9.field6631[var39];
                if (arg8 == null || arg8[var40] == arg3 || arg1.field8326[var40] == 0) {
                    short var41 = arg9.field6629[var39];
                    if (var41 != -1) {
                        this.method2787(arg1.field8328[var41], arg11, arg0, 0, 0, arg10 & arg1.field8329[var41], (byte) -93, 0, arg7, 0);
                    }
                    this.method2787(arg1.field8328[var40], arg11, arg0, arg9.field6638[var39], arg1.field8326[var40], arg1.field8329[var40] & arg10, (byte) -93, arg9.field6641[var39], arg7, arg9.field6636[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = -53 % ((arg2 - 76) / 41);
        while (arg1.field8334 > var15) {
            boolean var17 = false;
            if (var13 < arg9.field6627 && arg9.field6631[var13] == var15) {
                var17 = true;
            }
            boolean var18 = false;
            if (var14 < arg5.field6627 && arg5.field6631[var14] == var15) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg8 == null || arg3 == arg8[var15] || arg1.field8326[var15] == 0) {
                    short var19 = 0;
                    int var20 = arg1.field8326[var15];
                    if (var20 == 3 || var20 == 10) {
                        var19 = 128;
                    }
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    byte var25;
                    if (var17) {
                        var23 = arg9.field6636[var13];
                        var22 = arg9.field6629[var13];
                        var21 = arg9.field6638[var13];
                        var25 = arg9.field6633[var13];
                        var24 = arg9.field6641[var13];
                        var13++;
                    } else {
                        var21 = var19;
                        var22 = -1;
                        var23 = var19;
                        var24 = var19;
                        var25 = 0;
                    }
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    byte var30;
                    if (var18) {
                        var29 = arg5.field6638[var14];
                        var26 = arg5.field6636[var14];
                        var30 = arg5.field6633[var14];
                        var28 = arg5.field6641[var14];
                        var27 = arg5.field6629[var14];
                        var14++;
                    } else {
                        var26 = var19;
                        var27 = -1;
                        var28 = var19;
                        var29 = var19;
                        var30 = 0;
                    }
                    if (var22 != -1) {
                        this.method2787(arg1.field8328[var22], arg11, arg0, 0, 0, arg10 & arg1.field8329[var22], (byte) -93, 0, arg7, 0);
                    } else if (var27 != -1) {
                        this.method2787(arg1.field8328[var27], arg11, arg0, 0, 0, arg10 & arg1.field8329[var27], (byte) -93, 0, arg7, 0);
                    }
                    int var32;
                    int var33;
                    int var34;
                    if ((var25 & 0x2) != 0 || (var30 & 0x1) != 0) {
                        var32 = var24;
                        var33 = var23;
                        var34 = var21;
                    } else if (var20 == 2) {
                        int var36 = var28 - var24 & 0x3FFF;
                        int var37 = var29 - var21 & 0x3FFF;
                        int var38 = var26 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        if (var38 >= 8192) {
                            var38 -= 16384;
                        }
                        var32 = var24 + (arg6 * var36 / arg4) & 0x3FFF;
                        var34 = arg6 * var37 / arg4 + var21 & 0x3FFF;
                        var33 = var23 + (arg6 * var38 / arg4) & 0x3FFF;
                    } else if (var20 == 9) {
                        int var31 = var28 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var32 = arg6 * var31 / arg4 + var24 & 0x3FFF;
                        var33 = 0;
                        var34 = 0;
                    } else if (var20 == 7) {
                        int var35 = var28 - var24 & 0x3F;
                        if (var35 >= 32) {
                            var35 -= 64;
                        }
                        var32 = var24 + (arg6 * var35 / arg4) & 0x3F;
                        var34 = (var29 - var21) * arg6 / arg4 + var21;
                        var33 = (var26 - var23) * arg6 / arg4 + var23;
                    } else {
                        var32 = (var28 - var24) * arg6 / arg4 + var24;
                        var33 = var23 + ((var26 - var23) * arg6 / arg4);
                        var34 = (var29 - var21) * arg6 / arg4 + var21;
                    }
                    this.method2787(arg1.field8328[var15], arg11, arg0, var34, var20, arg10 & arg1.field8329[var15], (byte) -93, var32, arg7, var33);
                } else {
                    if (var18) {
                        var14++;
                    }
                    if (var17) {
                        var13++;
                    }
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI[IIIILgw;ILgw;ZI)V")
    public final void method2778(byte arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, class172 arg6, int arg7, class172 arg8, boolean arg9, int arg10) {
        field6612++;
        if (arg4 == -1) {
            return;
        }
        this.method520();
        if (!this.method487()) {
            this.method501();
            return;
        }
        class475 var12 = arg8.field2678[arg4];
        if (arg0 != -55) {
            this.field6603 = false;
        }
        class607 var13 = var12.field6635;
        class475 var14 = null;
        if (arg6 != null) {
            var14 = arg6.field2678[arg5];
            if (var14.field6635 != var13) {
                var14 = null;
            }
        }
        this.method2777(arg7, var13, -18, false, arg10, var14, arg1, arg2, null, var12, arg3, arg9);
        this.method495();
        this.method501();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Leca;")
    public abstract class755[] method525();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method481(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method511(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method2779(int arg0, boolean arg1, String arg2) {
        field6607++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class621.field8455.field5543 : class621.field8455.field5544) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class454 var11 = class621.field8455.method2411(var8, (byte) -102);
            if (var11.field6397 && var11.method2710(98).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class476.field6651 = null;
                    class440.field6265 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class440.field6265 = var5;
        class474.field6620 = 0;
        class476.field6651 = var4;
        String[] var9 = new String[class440.field6265];
        for (int var10 = 0; var10 < class440.field6265; var10++) {
            var9[var10] = class621.field8455.method2411(var4[var10], (byte) -91).method2710(class710.method3948(arg0, 81));
        }
        class558.method3205(class476.field6651, arg0 + 26073, var9);
    }

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method495();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method533(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method512();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[Ljava/lang/String;[SIZ)V")
    public static final void method2780(int arg0, String[] arg1, short[] arg2, int arg3, boolean arg4) {
        if (arg4) {
            field6615 = 0.5791872F;
        }
        if (arg0 > arg3) {
            int var5 = (arg3 + arg0) / 2;
            int var6 = arg3;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method2780(var6 - 1, arg1, arg2, arg3, false);
            method2780(arg0, arg1, arg2, var6 + 1, arg4);
        }
        field6613++;
    }

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method487();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method485(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbca;Liw;II)V")
    public abstract void method497(class661 arg0, class317 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method527();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method506();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method513();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method2781(byte arg0) {
        if (arg0 <= -7) {
            field6610 = null;
            field6606 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method488();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method483(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbca;IZ)V")
    public abstract void method519(class661 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method493();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILgw;)V")
    public final void method2782(int arg0, int arg1, class172 arg2) {
        field6605++;
        if (arg0 == -1) {
            return;
        }
        this.method520();
        if (!this.method487()) {
            this.method501();
            return;
        }
        class475 var4 = arg2.field2678[arg0];
        class607 var5 = var4.field6635;
        for (int var6 = 0; var6 < var4.field6627; var6++) {
            short var7 = var4.field6631[var6];
            if (var5.field8323[var7]) {
                if (var4.field6629[var6] != -1) {
                    this.method496(0, 0, 0, 0);
                }
                this.method496(var5.field8326[var7], var4.field6641[var6], var4.field6638[var6], var4.field6636[var6]);
            }
        }
        if (arg1 != -8700) {
            field6606 = null;
        }
        this.method495();
        this.method501();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method507();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method510();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method484(int arg0);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method532();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method490(class472 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method498();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class472 method504(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbca;Liw;I)V")
    public abstract void method521(class661 arg0, class317 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
    public static final boolean method2783(int arg0, int arg1, int arg2) {
        field6608++;
        if (arg0 == 2) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILgw;ILgw;ZZII)V")
    public final void method2784(int arg0, int arg1, class172 arg2, int arg3, class172 arg4, boolean arg5, boolean arg6, int arg7, int arg8) {
        field6604++;
        if (arg0 == -1) {
            return;
        }
        this.method520();
        if (!this.method487()) {
            this.method501();
            return;
        }
        class475 var10 = arg4.field2678[arg0];
        class607 var11 = var10.field6635;
        class475 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field2678[arg7];
            if (var12.field6635 != var11) {
                var12 = null;
            }
        }
        this.method2777(arg3, var11, 121, arg5, arg1, var12, arg8, null, null, var10, 65535, arg6);
        this.method495();
        this.method501();
    }

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method522();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
    public abstract boolean method500();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method486();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method524(int arg0);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lnn;")
    public abstract class417[] method494();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method509();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method528(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbca;)V")
    public abstract void method523(class661 arg0);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method501();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method520();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method482(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILbca;ZII)Z")
    public abstract boolean method492(int arg0, int arg1, class661 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method496(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method518();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method502(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method516(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method505();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lgw;IBILgw;IIILgw;ZILgw;I[ZI)V")
    public final void method2785(class172 arg0, int arg1, byte arg2, int arg3, class172 arg4, int arg5, int arg6, int arg7, class172 arg8, boolean arg9, int arg10, class172 arg11, int arg12, boolean[] arg13, int arg14) {
        field6614++;
        if (arg5 == -1) {
            return;
        }
        if (arg2 <= 103) {
            field6615 = 0.38855714F;
        }
        if (arg13 == null || arg6 == -1) {
            this.method2784(arg5, arg1, arg0, 0, arg8, false, arg9, arg10, arg7);
            return;
        }
        this.method520();
        if (!this.method487()) {
            this.method501();
            return;
        }
        class475 var16 = arg8.field2678[arg5];
        class607 var17 = var16.field6635;
        class475 var18 = null;
        if (arg0 != null) {
            var18 = arg0.field2678[arg10];
            if (var18.field6635 != var17) {
                var18 = null;
            }
        }
        this.method2777(0, var17, -70, false, arg1, var18, arg7, null, arg13, var16, 65535, arg9);
        class475 var19 = arg4.field2678[arg6];
        class475 var20 = null;
        if (arg11 != null) {
            var20 = arg11.field2678[arg14];
            if (var20.field6635 != var17) {
                var20 = null;
            }
        }
        this.method511(0, new int[0], 0, 0, 0, 0, arg9);
        this.method2777(0, var19.field6635, 122, true, arg3, var20, arg12, null, arg13, var19, 65535, arg9);
        this.method495();
        this.method501();
    }

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method517(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIILs;I)V")
    public final void method2786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class281 arg7, int arg8) {
        field6616++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg4 / 2;
        int var15 = arg7.method1853(arg3 + var13, arg8 + var14, (byte) 10);
        int var16 = arg0 / 2;
        int var17 = -arg4 / 2;
        int var18 = arg7.method1853(arg3 + var16, arg8 - -var17, (byte) -116);
        int var19 = -arg0 / 2;
        int var20 = arg4 / 2;
        int var21 = arg7.method1853(arg3 + var19, arg8 - -var20, (byte) -111);
        int var22 = arg0 / 2;
        if (arg1 != 10947) {
            this.method493();
        }
        int var23 = arg4 / 2;
        int var24 = arg7.method1853(arg3 + var22, arg8 + var23, (byte) 50);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg4 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
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
                this.method515(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        if (arg0 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg2 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg2;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (arg2 < var31) {
                        var31 = arg2;
                    }
                }
                this.method502(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > (var18 + var21)) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg5;
        if (var34 != 0) {
            this.method528(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IZIIIIBI[II)V")
    private final void method2787(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int[] arg8, int arg9) {
        field6611++;
        if (arg6 != -93) {
            return;
        }
        if (arg2 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = -arg7;
                arg7 = arg9;
                arg9 = var16;
            } else if (arg4 == 3) {
                int var15 = arg7;
                arg7 = arg9;
                arg9 = var15;
            } else if (arg4 == 2) {
                int var14 = arg7;
                arg7 = -arg9 & 0x3FFF;
                arg9 = var14 & 0x3FFF;
            }
        } else if (arg2 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg7 = -arg7;
                arg9 = -arg9;
            } else if (arg4 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg7 = -arg7 & 0x3FFF;
            }
        } else if (arg2 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = arg7;
                arg7 = -arg9;
                arg9 = var13;
            } else if (arg4 == 3) {
                int var12 = arg7;
                arg7 = arg9;
                arg9 = var12;
            } else if (arg4 == 2) {
                int var11 = arg7;
                arg7 = arg9 & 0x3FFF;
                arg9 = -var11 & 0x3FFF;
            }
        }
        if (arg5 == 65535) {
            this.method511(arg4, arg0, arg7, arg3, arg9, arg2, arg1);
        } else {
            this.method533(arg4, arg0, arg7, arg3, arg9, arg1, arg5, arg8);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILbca;ZI)Z")
    public abstract boolean method503(int arg0, int arg1, class661 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method491(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class184 method530(class184 arg0);
}
