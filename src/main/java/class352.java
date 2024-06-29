import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class352 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[S")
    public static short[] field5050 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Lid;")
    public static class260 field5060;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "[I")
    public static int[] field5066;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BIZ)Lqh;")
    public abstract class352 method1749(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
    public abstract void method1722();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1697(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLjj;IIIIII[ILjj;Z)V")
    public final void method2130(byte arg0, class170 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, class170 arg9, boolean arg10) {
        field5052++;
        if (arg4 == -1 || !this.method1704()) {
            return;
        }
        class410 var12 = arg9.field2014[arg4];
        class322 var13 = var12.field5814;
        if (arg0 != -128) {
            this.method2130((byte) 6, (class170) null, 77, 107, 9, 92, 111, 96, (int[]) null, (class170) null, false);
        }
        class410 var14 = null;
        if (arg1 != null) {
            var14 = arg1.field2014[arg6];
            if (var14.field5814 != var13) {
                var14 = null;
            }
        }
        this.method2131(arg10, arg5, arg8, var12, 36, false, arg3, var13, arg7, arg2, var14, (boolean[]) null);
        this.method1720();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILbd;Z)Z")
    public abstract boolean method1695(int arg0, int arg1, class327 arg2, boolean arg3);

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()I")
    public abstract int method1702();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lbd;Lqt;II)V")
    public abstract void method1713(class327 arg0, class465 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()I")
    public abstract int method1739();

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()I")
    public abstract int method1741();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI[ILos;IZILwm;IILos;[Z)V")
    private final void method2131(boolean arg0, int arg1, int[] arg2, class410 arg3, int arg4, boolean arg5, int arg6, class322 arg7, int arg8, int arg9, class410 arg10, boolean[] arg11) {
        field5059++;
        if (arg10 == null || arg8 == 0) {
            for (int var37 = 0; var37 < arg3.field5813; var37++) {
                short var38 = arg3.field5809[var37];
                if (arg11 == null || arg5 == arg11[var38] || arg7.field4658[var38] == 0) {
                    short var39 = arg3.field5811[var37];
                    if (var39 != -1) {
                        this.method2138(arg2, arg9, arg1 & arg7.field4657[var39], 0, 0, arg7.field4660[var39], 0, arg0, 0, (byte) -110);
                    }
                    this.method2138(arg2, arg9, arg1 & arg7.field4657[var38], arg7.field4658[var38], arg3.field5808[var37], arg7.field4660[var38], arg3.field5801[var37], arg0, arg3.field5802[var37], (byte) -123);
                }
            }
            return;
        }
        if (arg4 < 31) {
            field5064 = -31;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg7.field4656; var15++) {
            boolean var16 = false;
            if (arg3.field5813 > var13 && arg3.field5809[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg10.field5813 && arg10.field5809[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg11[var15] == arg5 || arg7.field4658[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg7.field4658[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var22 = arg3.field5802[var13];
                        var21 = arg3.field5801[var13];
                        var24 = arg3.field5811[var13];
                        var20 = arg3.field5808[var13];
                        var23 = arg3.field5807[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = var18;
                        var23 = 0;
                        var24 = -1;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg10.field5807[var14];
                        var26 = arg10.field5801[var14];
                        var27 = arg10.field5808[var14];
                        var28 = arg10.field5802[var14];
                        var29 = arg10.field5811[var14];
                        var14++;
                    } else {
                        var28 = var18;
                        var29 = -1;
                        var26 = var18;
                        var25 = 0;
                        var27 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var23 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var34 = var21;
                        var35 = var22;
                        var33 = var20;
                    } else if (var19 == 2) {
                        int var30 = var26 - var21 & 0x3FFF;
                        int var31 = var27 - var20 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var28 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg8 * var31 / arg6 + var20 & 0x3FFF;
                        var34 = arg8 * var30 / arg6 + var21 & 0x3FFF;
                        var35 = arg8 * var32 / arg6 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var26 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var33 = (var27 - var20) * arg8 / arg6 + var20;
                        var34 = arg8 * var36 / arg6 + var21 & 0x3F;
                        var35 = (var28 - var22) * arg8 / arg6 + var22;
                    } else {
                        var33 = (var27 - var20) * arg8 / arg6 + var20;
                        var35 = (var28 - var22) * arg8 / arg6 + var22;
                        var34 = var21 + ((var26 - var21) * arg8 / arg6);
                    }
                    if (var24 != -1) {
                        this.method2138(arg2, arg9, arg1 & arg7.field4657[var24], 0, 0, arg7.field4660[var24], 0, arg0, 0, (byte) -103);
                    } else if (var29 != -1) {
                        this.method2138(arg2, arg9, arg7.field4657[var29] & arg1, 0, 0, arg7.field4660[var29], 0, arg0, 0, (byte) 60);
                    }
                    this.method2138(arg2, arg9, arg1 & arg7.field4657[var15], var19, var33, arg7.field4660[var15], var34, arg0, var35, (byte) -116);
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

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lph;)Lph;")
    public abstract class125 method1734(class125 arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILvt;)V")
    public static final void method2132(int arg0, class179 arg1) {
        for (int var2 = 0; var2 < class362.field5219; var2++) {
            int var3 = arg1.method885(true);
            int var4 = arg1.method916(21933);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class427.field6158[var3] != null) {
                class427.field6158[var3].field5325 = var4;
            }
        }
        if (arg0 <= 31) {
            field5063 = 73;
        }
        field5049++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(SS)V")
    public abstract void method1728(short arg0, short arg1);

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "()V")
    public abstract void method1752();

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "()I")
    public abstract int method1733();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLmi;IIIII)V")
    public final void method2133(byte arg0, class443 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5053++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg3 / 2;
        int var12 = -arg5 / 2;
        int var13 = arg1.method1857(arg6 + var11, arg2 + var12);
        int var14 = arg3 / 2;
        int var15 = -arg5 / 2;
        int var16 = arg1.method1857(arg6 + var14, arg2 + var15);
        int var17 = -arg3 / 2;
        int var18 = arg5 / 2;
        int var19 = arg1.method1857(arg6 + var17, arg2 + var18);
        int var20 = arg3 / 2;
        int var21 = arg5 / 2;
        int var22 = arg1.method1857(arg6 + var20, arg2 + var21);
        int var23 = var16 <= var13 ? var16 : var13;
        int var24 = var19 < var22 ? var19 : var22;
        int var25 = var16 < var22 ? var16 : var22;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method1750(var26);
            }
        }
        int var27 = var19 > var13 ? var13 : var19;
        int var28 = var13 + var22;
        if (arg3 != 0) {
            int var29 = (int) (Math.atan2((double) (var27 - var25), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method1740(var29);
            }
        }
        if (arg0 != 22) {
            field5063 = 106;
        }
        if ((var16 + var19) < var28) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg4;
        if (var30 != 0) {
            this.method1700(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public abstract void method1731(int arg0);

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public static final void method2134(int arg0) {
        if (arg0 > -36) {
            field5050 = null;
        }
        field5057++;
        if (class355.field5100.toLowerCase().indexOf("microsoft") != -1) {
            class115.field1422[220] = 74;
            class115.field1422[219] = 42;
            class115.field1422[186] = 57;
            class115.field1422[221] = 43;
            class115.field1422[222] = 59;
            class115.field1422[191] = 73;
            class115.field1422[192] = 58;
            class115.field1422[187] = 27;
            class115.field1422[223] = 28;
            class115.field1422[188] = 71;
            class115.field1422[189] = 26;
            class115.field1422[190] = 72;
            return;
        }
        class115.field1422[92] = 74;
        class115.field1422[93] = 43;
        if (class355.field5111 == null) {
            class115.field1422[192] = 58;
            class115.field1422[222] = 59;
        } else {
            class115.field1422[520] = 59;
            class115.field1422[222] = 58;
            class115.field1422[192] = 28;
        }
        class115.field1422[45] = 26;
        class115.field1422[46] = 72;
        class115.field1422[91] = 42;
        class115.field1422[47] = 73;
        class115.field1422[44] = 71;
        class115.field1422[59] = 57;
        class115.field1422[61] = 27;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public abstract void method1700(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1725(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
    public abstract void method1692(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLvt;I)Ljava/lang/String;")
    public static final String method2135(byte arg0, class179 arg1, int arg2) {
        field5058++;
        try {
            int var3 = arg1.method885(true);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field2206 += class200.field2774.method722(arg1.field2159, var4, (byte) -9, 0, arg1.field2206, var3);
            String var5 = class442.method2611(var3, var4, -1638480020, 0);
            int var6 = -111 % ((arg0 + 48) / 45);
            return var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "()I")
    public abstract int method1708();

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public abstract void method1748(int arg0);

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "()I")
    public abstract int method1719();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lbd;Lqt;I)V")
    public abstract void method1716(class327 arg0, class465 arg1, int arg2);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
    public abstract void method1715(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
    public abstract void method1750(int arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBIZILjj;IILjj;)V")
    public final void method2136(int arg0, byte arg1, int arg2, boolean arg3, int arg4, class170 arg5, int arg6, int arg7, class170 arg8) {
        field5054++;
        if (arg7 == -1 || !this.method1704()) {
            return;
        }
        class410 var10 = arg8.field2014[arg7];
        class322 var11 = var10.field5814;
        class410 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field2014[arg2];
            if (var12.field5814 != var11) {
                var12 = null;
            }
        }
        int var13 = -4 / ((-arg1 - 43) / 47);
        this.method2131(arg3, 65535, (int[]) null, var10, 83, false, arg4, var11, arg6, arg0, var12, (boolean[]) null);
        this.method1720();
    }

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "()Z")
    public abstract boolean method1746();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILmi;Lmi;III)V")
    public abstract void method1691(int arg0, int arg1, class443 arg2, class443 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
    public abstract void method1732(int arg0);

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "()I")
    public abstract int method1730();

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "()[Lgp;")
    public abstract class282[] method1707();

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "()V")
    public abstract void method1720();

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "()[Ltn;")
    public abstract class118[] method1721();

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "()I")
    public abstract int method1742();

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(SS)V")
    public abstract void method1747(short arg0, short arg1);

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "()Z")
    public abstract boolean method1704();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method2137(boolean arg0) {
        field5066 = null;
        if (arg0) {
            method2137(false);
        }
        field5060 = null;
        field5050 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([IIIII[IIZIB)V")
    private final void method2138(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, byte arg9) {
        field5062++;
        if (arg1 == 1) {
            if (arg3 == 0 || arg3 == 1) {
                int var16 = -arg6;
                arg6 = arg8;
                arg8 = var16;
            } else if (arg3 == 3) {
                int var14 = arg6;
                arg6 = arg8;
                arg8 = var14;
            } else if (arg3 == 2) {
                int var15 = arg6;
                arg6 = -arg8 & 0x3FFF;
                arg8 = var15 & 0x3FFF;
            }
        } else if (arg1 == 2) {
            if (arg3 == 0 || arg3 == 1) {
                arg6 = -arg6;
                arg8 = -arg8;
            } else if (arg3 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg1 == 3) {
            if (arg3 == 0 || arg3 == 1) {
                int var13 = arg6;
                arg6 = -arg8;
                arg8 = var13;
            } else if (arg3 == 3) {
                int var11 = arg6;
                arg6 = arg8;
                arg8 = var11;
            } else if (arg3 == 2) {
                int var12 = arg6;
                arg6 = arg8 & 0x3FFF;
                arg8 = -var12 & 0x3FFF;
            }
        }
        if (arg2 == 65535) {
            this.method1697(arg3, arg5, arg6, arg4, arg8, arg1, arg7);
        } else {
            this.method1725(arg3, arg5, arg6, arg4, arg8, arg7, arg2, arg0);
        }
        int var17 = -49 / ((arg9 + 39) / 62);
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    public abstract void method1740(int arg0);

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V")
    public abstract void method1743(int arg0);

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "()I")
    public abstract int method1705();

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
    public abstract void method1699(int arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjj;I)V")
    public final void method2139(boolean arg0, class170 arg1, int arg2) {
        field5051++;
        if (arg2 == -1 || !this.method1704()) {
            return;
        }
        class410 var4 = arg1.field2014[arg2];
        if (arg0) {
            return;
        }
        class322 var5 = var4.field5814;
        for (int var6 = 0; var6 < var4.field5813; var6++) {
            short var7 = var4.field5809[var6];
            if (var5.field4654[var7]) {
                if (var4.field5811[var6] != -1) {
                    this.method1715(0, 0, 0, 0);
                }
                this.method1715(var5.field4658[var7], var4.field5801[var6], var4.field5808[var6], var4.field5802[var6]);
            }
        }
        this.method1720();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lqh;IIIZ)V")
    public abstract void method1745(class352 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljj;B[ZIILjj;Ljj;IIIZILjj;II)V")
    public final void method2140(class170 arg0, byte arg1, boolean[] arg2, int arg3, int arg4, class170 arg5, class170 arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, class170 arg12, int arg13, int arg14) {
        field5061++;
        if (arg13 == -1) {
            return;
        }
        if (arg2 == null || arg11 == -1) {
            this.method2136(0, (byte) -123, arg7, arg10, arg14, arg6, arg4, arg13, arg5);
        } else if (this.method1704()) {
            class410 var16 = arg5.field2014[arg13];
            class322 var17 = var16.field5814;
            class410 var18 = null;
            if (arg6 != null) {
                var18 = arg6.field2014[arg7];
                if (var18.field5814 != var17) {
                    var18 = null;
                }
            }
            class410 var19 = arg12.field2014[arg11];
            class410 var20 = null;
            if (arg0 != null) {
                var20 = arg0.field2014[arg9];
                if (var20.field5814 != var17) {
                    var20 = null;
                }
            }
            this.method2131(arg10, 65535, (int[]) null, var16, 45, false, arg14, var17, arg4, 0, var18, arg2);
            if (arg1 > -56) {
                this.method1750(-103);
            }
            this.method1697(0, new int[0], 0, 0, 0, 0, arg10);
            this.method2131(arg10, 65535, (int[]) null, var19, 126, true, arg8, var17, arg3, 0, var20, arg2);
            this.method1720();
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
    public static final void method2141(int arg0, byte arg1) {
        field5055++;
        class218.field3067 = arg0;
        int var2 = -54 % ((arg1 - 55) / 35);
        class77.field924.method1165((byte) 118);
    }

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "()I")
    public abstract int method1737();

    static {
        new class40("From", "Von:", "De", "De");
        field5063 = -1;
        field5060 = new class260(64);
        field5066 = new int[64];
    }
}
