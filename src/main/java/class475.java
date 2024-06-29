import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class475 {

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Z")
    public boolean field6517 = false;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
    public static int[] field6511 = new int[32];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lkha;")
    public static class584 field6514 = new class584();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lwu;")
    public static class376 field6520;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
    public static int[] field6516;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field6519;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbe;Lbe;IIIIIZLbe;IB[ZLbe;II)V")
    public final void method2673(class37 arg0, class37 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class37 arg8, int arg9, byte arg10, boolean[] arg11, class37 arg12, int arg13, int arg14) {
        field6518++;
        if (arg2 == -1) {
            return;
        }
        if (arg11 == null || arg9 == -1) {
            this.method2675(-41, arg12, arg7, arg4, arg14, arg2, 0, arg5, arg8);
            return;
        }
        this.method187();
        if (!this.method145()) {
            this.method157();
            return;
        }
        class138 var16 = arg12.field530[arg2];
        class88 var17 = var16.field2203;
        class138 var18 = null;
        if (arg8 != null) {
            var18 = arg8.field530[arg4];
            if (var18.field2203 != var17) {
                var18 = null;
            }
        }
        this.method2683(var17, arg7, 0, var16, 65535, arg14, arg11, var18, false, null, (byte) 114, arg5);
        if (arg10 < 90) {
            this.method210(111);
        }
        class138 var19 = arg1.field530[arg9];
        class138 var20 = null;
        if (arg0 != null) {
            var20 = arg0.field530[arg6];
            if (var20.field2203 != var17) {
                var20 = null;
            }
        }
        this.method144(0, new int[0], 0, 0, 0, 0, arg7);
        this.method2683(var19.field2203, arg7, 0, var19, 65535, arg3, arg11, var20, true, null, (byte) 119, arg13);
        this.method178();
        this.method157();
    }

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method143(int arg0);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method159();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbe;BI)V")
    public final void method2674(class37 arg0, byte arg1, int arg2) {
        field6509++;
        if (arg2 == -1) {
            return;
        }
        this.method187();
        if (!this.method145()) {
            this.method157();
            return;
        }
        class138 var4 = arg0.field530[arg2];
        class88 var5 = var4.field2203;
        int var6 = 3 % ((-arg1 - 53) / 57);
        for (int var7 = 0; var7 < var4.field2192; var7++) {
            short var8 = var4.field2189[var7];
            if (var5.field1071[var8]) {
                if (var4.field2194[var7] != -1) {
                    this.method179(0, 0, 0, 0);
                }
                this.method179(var5.field1081[var8], var4.field2204[var7], var4.field2199[var7], var4.field2198[var7]);
            }
        }
        this.method178();
        this.method157();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILofa;ZII)Z")
    public abstract boolean method203(int arg0, int arg1, class333 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method146(int arg0);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method148();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILbe;ZIIIIILbe;)V")
    public final void method2675(int arg0, class37 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class37 arg8) {
        field6510++;
        if (arg5 == -1) {
            return;
        }
        this.method187();
        if (!this.method145()) {
            this.method157();
            return;
        }
        class138 var10 = arg1.field530[arg5];
        class88 var11 = var10.field2203;
        class138 var12 = null;
        if (arg8 != null) {
            var12 = arg8.field530[arg3];
            if (var12.field2203 != var11) {
                var12 = null;
            }
        }
        this.method2683(var11, arg2, arg6, var10, 65535, arg4, null, var12, false, null, (byte) 122, arg7);
        if (arg0 > -24) {
            this.method209();
        }
        this.method178();
        this.method157();
    }

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method163();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
    public abstract boolean method172();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method167();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbw;)V")
    public static final void method2676(class689 arg0) {
        class277.field3864 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method190(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIZIII[ILbe;Lbe;)V")
    public final void method2677(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int[] arg8, class37 arg9, class37 arg10) {
        field6513++;
        if (~arg5 == arg7) {
            return;
        }
        this.method187();
        if (!this.method145()) {
            this.method157();
            return;
        }
        class138 var12 = arg10.field530[arg5];
        class88 var13 = var12.field2203;
        class138 var14 = null;
        if (arg9 != null) {
            var14 = arg9.field530[arg3];
            if (var14.field2203 != var13) {
                var14 = null;
            }
        }
        this.method2683(var13, arg4, arg0, var12, arg6, arg2, null, var14, false, arg8, (byte) 117, arg1);
        this.method178();
        this.method157();
    }

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method185(int arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method157();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method206(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method178();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lhi;")
    public abstract class207[] method195();

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method192();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method210(int arg0);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method187();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method170(class475 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ls;IIIIIIII)V")
    public final void method2678(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6506++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg4 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg0.method1750((byte) 123, arg3 + var13, arg2 + var14);
        int var16 = arg4 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg0.method1750((byte) 117, arg3 + var16, arg2 - -var17);
        int var19 = -arg4 / 2;
        int var20 = arg8 / 2;
        int var21 = arg0.method1750((byte) 120, arg3 + var19, arg2 + var20);
        int var22 = arg4 / 2;
        int var23 = arg8 / 2;
        int var24 = arg0.method1750((byte) 124, arg3 + var22, arg2 + var23);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 >= var24 ? var24 : var18;
        if (arg8 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg1 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg1;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (arg1 < var28) {
                        var28 = arg1;
                    }
                }
                this.method143(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        if (arg4 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg6 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg6;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (arg6 < var31) {
                        var31 = arg6;
                    }
                }
                this.method210(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > (var18 + var21)) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg7;
        if (arg5 != var34) {
            this.method188(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZIB[I[III)V")
    private final void method2679(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int[] arg6, int[] arg7, int arg8, int arg9) {
        if (arg9 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = -arg1;
                arg1 = arg2;
                arg2 = var16;
            } else if (arg0 == 3) {
                int var15 = arg1;
                arg1 = arg2;
                arg2 = var15;
            } else if (arg0 == 2) {
                int var14 = arg1;
                arg1 = -arg2 & 0x3FFF;
                arg2 = var14 & 0x3FFF;
            }
        } else if (arg9 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg1 = -arg1;
                arg2 = -arg2;
            } else if (arg0 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg2 = -arg2 & 0x3FFF;
            }
        } else if (arg9 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = arg1;
                arg1 = -arg2;
                arg2 = var13;
            } else if (arg0 == 3) {
                int var11 = arg1;
                arg1 = arg2;
                arg2 = var11;
            } else if (arg0 == 2) {
                int var12 = arg1;
                arg1 = arg2 & 0x3FFF;
                arg2 = -var12 & 0x3FFF;
            }
        }
        field6515++;
        int var17 = 2 / ((arg5 + 82) / 41);
        if (arg4 == 65535) {
            this.method144(arg0, arg7, arg1, arg8, arg2, arg9, arg3);
        } else {
            this.method165(arg0, arg7, arg1, arg8, arg2, arg3, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lcm;")
    public abstract class730[] method150();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method180();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method156(int arg0);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method213();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method2680(byte arg0) {
        field6514 = null;
        field6516 = null;
        field6520 = null;
        if (arg0 <= -52) {
            field6511 = null;
            field6519 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method205();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method211();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method199(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method145();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method209();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;IZI)Z")
    public static final boolean method2681(String arg0, int arg1, boolean arg2, int arg3) {
        field6512++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        if (arg1 != 48) {
            method2676(null);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method181();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class475 method171(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method188(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method152(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILofa;ZI)Z")
    public abstract boolean method158(int arg0, int arg1, class333 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method202();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method183(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method194(int arg0);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method179(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method144(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method207(int arg0, int arg1, class282 arg2, class282 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkn;IIIIII)V")
    public static final void method2682(class742 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6507++;
        class180.method1245(arg1, arg4, arg3, arg0.field3508, arg6, arg0.field3505, arg0.field3502, arg2, arg5, 0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lofa;Lvh;I)V")
    public abstract void method155(class333 arg0, class364 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class184 method154(class184 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lofa;Lvh;II)V")
    public abstract void method160(class333 arg0, class364 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method217();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lofa;)V")
    public abstract void method200(class333 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lofa;IZ)V")
    public abstract void method191(class333 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method175();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Liia;ZILvr;II[ZLvr;Z[IBI)V")
    private final void method2683(class88 arg0, boolean arg1, int arg2, class138 arg3, int arg4, int arg5, boolean[] arg6, class138 arg7, boolean arg8, int[] arg9, byte arg10, int arg11) {
        field6508++;
        if (arg7 == null || arg11 == 0) {
            for (int var38 = 0; var38 < arg3.field2192; var38++) {
                short var39 = arg3.field2189[var38];
                if (arg6 == null || arg6[var39] == arg8 || arg0.field1081[var39] == 0) {
                    short var40 = arg3.field2194[var38];
                    if (var40 != -1) {
                        this.method2679(0, 0, 0, arg1, arg0.field1079[var40] & arg4, (byte) 126, arg9, arg0.field1073[var40], 0, arg2);
                    }
                    this.method2679(arg0.field1081[var39], arg3.field2204[var38], arg3.field2198[var38], arg1, arg0.field1079[var39] & arg4, (byte) -125, arg9, arg0.field1073[var39], arg3.field2199[var38], arg2);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg10 < 112) {
            this.method211();
        }
        for (int var15 = 0; var15 < arg0.field1072; var15++) {
            boolean var16 = false;
            if (var13 < arg3.field2192 && arg3.field2189[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg7.field2192 > var14 && arg7.field2189[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg6 == null || arg8 == arg6[var15] || arg0.field1081[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field1081[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg3.field2194[var13];
                        var21 = arg3.field2199[var13];
                        var22 = arg3.field2202[var13];
                        var23 = arg3.field2204[var13];
                        var24 = arg3.field2198[var13];
                        var13++;
                    } else {
                        var24 = var18;
                        var23 = var18;
                        var20 = -1;
                        var21 = var18;
                        var22 = 0;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var29 = arg7.field2202[var14];
                        var28 = arg7.field2194[var14];
                        var25 = arg7.field2199[var14];
                        var27 = arg7.field2204[var14];
                        var26 = arg7.field2198[var14];
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
                    if ((var22 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var35 = var24;
                        var34 = var23;
                        var33 = var21;
                    } else if (var19 == 2) {
                        int var30 = var27 - var23 & 0x3FFF;
                        int var31 = var25 - var21 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var26 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var33 = var21 + (arg11 * var31 / arg5) & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg11 * var30 / arg5 + var23 & 0x3FFF;
                        var35 = arg11 * var32 / arg5 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var27 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var35 = 0;
                        var33 = 0;
                        var34 = var23 + (arg11 * var36 / arg5) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var37 = var27 - var23 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var33 = var21 + ((var25 - var21) * arg11 / arg5);
                        var34 = arg11 * var37 / arg5 + var23 & 0x3F;
                        var35 = (var26 - var24) * arg11 / arg5 + var24;
                    } else {
                        var34 = (var27 - var23) * arg11 / arg5 + var23;
                        var35 = var24 + ((var26 - var24) * arg11 / arg5);
                        var33 = var21 + ((var25 - var21) * arg11 / arg5);
                    }
                    if (var20 != -1) {
                        this.method2679(0, 0, 0, arg1, arg0.field1079[var20] & arg4, (byte) 94, arg9, arg0.field1073[var20], 0, arg2);
                    } else if (var28 != -1) {
                        this.method2679(0, 0, 0, arg1, arg0.field1079[var28] & arg4, (byte) -126, arg9, arg0.field1073[var28], 0, arg2);
                    }
                    this.method2679(var19, var34, var35, arg1, arg0.field1079[var15] & arg4, (byte) 84, arg9, arg0.field1073[var15], var33, arg2);
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
