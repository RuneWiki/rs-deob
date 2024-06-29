import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class299 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
    public boolean field3786 = false;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Ltq;")
    public static class536 field3785 = new class536(20);

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3789 = -1;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field3794 = -1;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
    public static int[] field3792 = new int[50];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lim;")
    public static class652 field3795;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
    public static int[] field3790;

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method1270(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method1279();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method1238(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lsba;")
    public abstract class581[] method1247();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method1271(int arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
    public abstract boolean method1230();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILis;I[IIZZLis;)V")
    public final void method1778(int arg0, int arg1, int arg2, int arg3, class350 arg4, int arg5, int[] arg6, int arg7, boolean arg8, boolean arg9, class350 arg10) {
        field3784++;
        if (arg5 == -1) {
            return;
        }
        this.method1299();
        if (!this.method1257()) {
            this.method1267();
            return;
        }
        if (!arg8) {
            field3792 = null;
        }
        class153 var12 = arg10.field4277[arg5];
        class359 var13 = var12.field1945;
        class153 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field4277[arg2];
            if (var14.field1945 != var13) {
                var14 = null;
            }
        }
        this.method1783(arg0, arg3, arg6, 6625, var12, false, var13, arg1, arg7, var14, null, arg9);
        this.method1268();
        this.method1267();
    }

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method1235();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method1289(int arg0);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method1252(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Loha;IZ)V")
    public abstract void method1258(class465 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII[B)Z")
    public static final boolean method1779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field3797++;
        if (arg5 != 2) {
            method1789(-123);
        }
        int var7 = arg4 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg2 + arg3 - 1) / arg3);
        int var10 = -((arg3 + arg4 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg1] == 0) {
                    return true;
                }
                arg1 += arg3;
            }
            int var13 = arg1 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class299 method1284(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public static final void method1780(int arg0, int arg1, int arg2) {
        field3798++;
        class614 var3 = class497.method2759(6, 5977, (long) arg0);
        if (arg1 >= 91) {
            var3.method3277(639);
            var3.field7742 = arg2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method1239();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method1265(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method1295();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method1285(class299 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lis;IZ)V")
    public final void method1781(class350 arg0, int arg1, boolean arg2) {
        field3783++;
        if (arg2) {
            this.method1272();
        }
        if (arg1 == -1) {
            return;
        }
        this.method1299();
        if (!this.method1257()) {
            this.method1267();
            return;
        }
        class153 var4 = arg0.field4277[arg1];
        class359 var5 = var4.field1945;
        for (int var6 = 0; var6 < var4.field1947; var6++) {
            short var7 = var4.field1953[var6];
            if (var5.field4380[var7]) {
                if (var4.field1942[var6] != -1) {
                    this.method1238(0, 0, 0, 0);
                }
                this.method1238(var5.field4382[var7], var4.field1952[var6], var4.field1954[var6], var4.field1943[var6]);
            }
        }
        this.method1268();
        this.method1267();
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method1259();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method1261();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1256(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Loha;Lvu;I)V")
    public abstract void method1297(class465 arg0, class706 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1782(String arg0, int arg1) {
        field3782++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        if (arg1 != 4118) {
            method1788(107, (byte) 55);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method1228();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lld;")
    public abstract class49[] method1246();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IILuo;ZLwha;IILuo;[ZZ)V")
    private final void method1783(int arg0, int arg1, int[] arg2, int arg3, class153 arg4, boolean arg5, class359 arg6, int arg7, int arg8, class153 arg9, boolean[] arg10, boolean arg11) {
        field3788++;
        if (arg9 == null || arg8 == 0) {
            for (int var38 = 0; var38 < arg4.field1947; var38++) {
                short var39 = arg4.field1953[var38];
                if (arg10 == null || arg10[var39] == arg5 || arg6.field4382[var39] == 0) {
                    short var40 = arg4.field1942[var38];
                    if (var40 != -1) {
                        this.method1786(0, arg1 & arg6.field4385[var40], 0, arg6.field4387[var40], arg3 ^ 0x19E1, 0, 0, arg2, arg0, arg11);
                    }
                    this.method1786(arg4.field1943[var38], arg6.field4385[var39] & arg1, arg4.field1954[var38], arg6.field4387[var39], 0, arg6.field4382[var39], arg4.field1952[var38], arg2, arg0, arg11);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg3 != 6625) {
            field3792 = null;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg6.field4381; var15++) {
            boolean var16 = false;
            if (var13 < arg4.field1947 && arg4.field1953[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg9.field1947 > var14 && arg9.field1953[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg10 == null || arg10[var15] == arg5 || arg6.field4382[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg6.field4382[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg4.field1939[var13];
                        var23 = arg4.field1952[var13];
                        var21 = arg4.field1943[var13];
                        var24 = arg4.field1954[var13];
                        var22 = arg4.field1942[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = var18;
                        var22 = -1;
                        var23 = var18;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var27 = arg9.field1942[var14];
                        var26 = arg9.field1952[var14];
                        var29 = arg9.field1954[var14];
                        var28 = arg9.field1939[var14];
                        var25 = arg9.field1943[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = -1;
                        var28 = 0;
                        var29 = var18;
                    }
                    if (var22 != -1) {
                        this.method1786(0, arg1 & arg6.field4385[var22], 0, arg6.field4387[var22], 0, 0, 0, arg2, arg0, arg11);
                    } else if (var27 != -1) {
                        this.method1786(0, arg1 & arg6.field4385[var27], 0, arg6.field4387[var27], arg3 ^ 0x19E1, 0, 0, arg2, arg0, arg11);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var20 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var31 = var21;
                        var33 = var23;
                        var32 = var24;
                    } else if (var19 == 2) {
                        int var35 = var26 - var23 & 0x3FFF;
                        int var36 = var29 - var24 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var25 - var21 & 0x3FFF;
                        var32 = arg8 * var36 / arg7 + var24 & 0x3FFF;
                        var33 = var23 + (arg8 * var35 / arg7) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = arg8 * var37 / arg7 + var21 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var26 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = var23 + (arg8 * var30 / arg7) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var26 - var23 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = var21 + ((var25 - var21) * arg8 / arg7);
                        var32 = var24 + ((var29 - var24) * arg8 / arg7);
                        var33 = arg8 * var34 / arg7 + var23 & 0x3F;
                    } else {
                        var32 = (var29 - var24) * arg8 / arg7 + var24;
                        var31 = (var25 - var21) * arg8 / arg7 + var21;
                        var33 = (var26 - var23) * arg8 / arg7 + var23;
                    }
                    this.method1786(var31, arg6.field4385[var15] & arg1, var32, arg6.field4387[var15], 0, var19, var33, arg2, arg0, arg11);
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

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method1296();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Loha;)V")
    public abstract void method1273(class465 arg0);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method1229(int arg0);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method1234(int arg0, int arg1, class358 arg2, class358 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILoha;ZII)Z")
    public abstract boolean method1233(int arg0, int arg1, class465 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lis;Lis;Lis;IIIIZLis;B[ZIIII)V")
    public final void method1784(class350 arg0, class350 arg1, class350 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class350 arg8, byte arg9, boolean[] arg10, int arg11, int arg12, int arg13, int arg14) {
        field3793++;
        if (arg5 == -1) {
            return;
        }
        if (arg10 == null || arg12 == -1) {
            this.method1787(arg11, arg13, arg8, 0, arg5, arg4, 0, arg7, arg0);
        } else if (arg9 == 56) {
            this.method1299();
            if (this.method1257()) {
                class153 var16 = arg0.field4277[arg5];
                class359 var17 = var16.field1945;
                class153 var18 = null;
                if (arg8 != null) {
                    var18 = arg8.field4277[arg4];
                    if (var18.field1945 != var17) {
                        var18 = null;
                    }
                }
                this.method1783(0, 65535, null, 6625, var16, false, var17, arg13, arg11, var18, arg10, arg7);
                class153 var19 = arg2.field4277[arg12];
                class153 var20 = null;
                if (arg1 != null) {
                    var20 = arg1.field4277[arg14];
                    if (var20.field1945 != var17) {
                        var20 = null;
                    }
                }
                this.method1302(0, new int[0], 0, 0, 0, 0, arg7);
                this.method1783(0, 65535, null, arg9 + 6569, var19, true, var19.field1945, arg6, arg3, var20, arg10, arg7);
                this.method1268();
                this.method1267();
            } else {
                this.method1267();
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method1282(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method1267();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class736 method1286(class736 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILoha;ZI)Z")
    public abstract boolean method1264(int arg0, int arg1, class465 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method1268();

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method1272();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method1281(int arg0);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method1260();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Loha;Lvu;II)V")
    public abstract void method1292(class465 arg0, class706 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILs;IIIIII)V")
    public final void method1785(int arg0, int arg1, class358 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3791++;
        boolean var10 = false;
        if (arg8 >= -84) {
            return;
        }
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg6 / 2;
        int var14 = -arg4 / 2;
        int var15 = arg2.method2072((byte) -73, arg5 + var13, arg7 + var14);
        int var16 = arg6 / 2;
        int var17 = -arg4 / 2;
        int var18 = arg2.method2072((byte) -116, arg5 + var16, arg7 - -var17);
        int var19 = -arg6 / 2;
        int var20 = arg4 / 2;
        int var21 = arg2.method2072((byte) -96, arg5 + var19, arg7 - -var20);
        int var22 = arg6 / 2;
        int var23 = arg4 / 2;
        int var24 = arg2.method2072((byte) -30, arg5 + var22, arg7 + var23);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = var18 >= var24 ? var24 : var18;
        if (arg4 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg0 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg0;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (arg0 < var28) {
                        var28 = arg0;
                    }
                }
                this.method1271(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        int var31 = var15 + var24;
        if (arg6 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg3 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg3;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (arg3 < var32) {
                        var32 = arg3;
                    }
                }
                this.method1289(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg1;
        if (var34 != 0) {
            this.method1263(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1302(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method1263(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method1290();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method1251(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method1257();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[IIII[IIZ)V")
    private final void method1786(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, boolean arg9) {
        field3781++;
        if (arg8 == 1) {
            if (arg5 == 0 || arg5 == 1) {
                int var13 = -arg6;
                arg6 = arg0;
                arg0 = var13;
            } else if (arg5 == 3) {
                int var11 = arg6;
                arg6 = arg0;
                arg0 = var11;
            } else if (arg5 == 2) {
                int var12 = arg6;
                arg6 = -arg0 & 0x3FFF;
                arg0 = var12 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg5 == 0 || arg5 == 1) {
                arg0 = -arg0;
                arg6 = -arg6;
            } else if (arg5 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg0 = -arg0 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg5 == 0 || arg5 == 1) {
                int var16 = arg6;
                arg6 = -arg0;
                arg0 = var16;
            } else if (arg5 == 3) {
                int var15 = arg6;
                arg6 = arg0;
                arg0 = var15;
            } else if (arg5 == 2) {
                int var14 = arg6;
                arg6 = arg0 & 0x3FFF;
                arg0 = -var14 & 0x3FFF;
            }
        }
        if (arg1 == 65535) {
            this.method1302(arg5, arg3, arg6, arg2, arg0, arg8, arg9);
        } else {
            this.method1256(arg5, arg3, arg6, arg2, arg0, arg9, arg1, arg7);
        }
        if (arg4 != 0) {
            this.method1786(-105, 70, 35, null, 125, 14, 109, null, -60, false);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILis;IIIIZLis;)V")
    public final void method1787(int arg0, int arg1, class350 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class350 arg8) {
        field3796++;
        if (~arg4 == arg6) {
            return;
        }
        this.method1299();
        if (!this.method1257()) {
            this.method1267();
            return;
        }
        class153 var10 = arg8.field4277[arg4];
        class359 var11 = var10.field1945;
        class153 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field4277[arg5];
            if (var12.field1945 != var11) {
                var12 = null;
            }
        }
        this.method1783(arg3, 65535, null, 6625, var10, false, var11, arg1, arg0, var12, null, arg7);
        this.method1268();
        this.method1267();
    }

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method1293(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
    public static final void method1788(int arg0, byte arg1) {
        class490.field6304 = -1;
        field3787++;
        class669.field8692 = arg0;
        if (arg1 <= -76) {
            class774.field10556 = -1;
            class401.method2327(-1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method1789(int arg0) {
        field3785 = null;
        field3790 = null;
        if (arg0 != 0) {
            field3790 = null;
        }
        field3792 = null;
        field3795 = null;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method1299();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)Lbj;")
    public static final class569 method1790(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        return var3 == null ? null : var3.field10431;
    }

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method1245();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method1253(int arg0);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method1231();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method1274();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method1300();
}
