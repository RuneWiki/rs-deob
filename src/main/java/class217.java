import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class217 extends class25 {

    @OriginalMember(owner = "client!rc", name = "Kb", descriptor = "[S")
    public static short[] field3389 = new short[] { 48, 44, 17, 50, 13, 29, 8, 35 };

    @OriginalMember(owner = "client!rc", name = "Zb", descriptor = "[I")
    public static int[] field3404 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!rc", name = "Yb", descriptor = "Ljava/lang/String;")
    public static String field3403 = "Loaded sprites";

    @OriginalMember(owner = "client!rc", name = "Fb", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!rc", name = "Gb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!rc", name = "Hb", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!rc", name = "Ib", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!rc", name = "Mb", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!rc", name = "Nb", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!rc", name = "Ob", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!rc", name = "Pb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!rc", name = "Qb", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!rc", name = "Rb", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!rc", name = "Sb", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!rc", name = "Ub", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!rc", name = "Vb", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!rc", name = "Wb", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!rc", name = "Xb", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!rc", name = "Lb", descriptor = "Lle;")
    private class104 field3390;

    @OriginalMember(owner = "client!rc", name = "Tb", descriptor = "Lrn;")
    public static class18 field3398;

    @OriginalMember(owner = "client!rc", name = "Jb", descriptor = "Lqn;")
    public static class361 field3388;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B[I)V", line = 6)
    public final void method1620(byte arg0, int[] arg1) {
        field3397++;
        this.field3390 = new class104(arg1);
        if (arg0 != 75) {
            method1629(true);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILrg;Lho;II)V", line = 18)
    public static final void method1621(int arg0, int arg1, int arg2, class342 arg3, class215 arg4, int arg5, int arg6) {
        field3393++;
        if (arg4 == null) {
            return;
        }
        int var7;
        if (class314.field4858 == 4) {
            var7 = (int) class313.field4846 & 0x7FF;
        } else {
            var7 = (int) class313.field4846 + class290.field4513 & 0x7FF;
        }
        int var8 = Math.max(arg3.field5374 / 2, arg3.field5339 / 2) + 10;
        int var9 = arg1 * arg1 + arg6 * arg6;
        if ((var8 * var8) < var9) {
            return;
        }
        if (arg5 >= -21) {
            method1627((byte) -44);
        }
        int var10 = class107.field1605[var7];
        int var11 = class107.field1604[var7];
        if (class314.field4858 != 4) {
            var11 = var11 * 256 / (class236.field3676 + 256);
            var10 = var10 * 256 / (class236.field3676 + 256);
        }
        int var12 = arg1 * var10 + arg6 * var11 >> 16;
        int var13 = arg6 * var10 - arg1 * var11 >> 16;
        if (class240.field3737) {
            ((class2) arg4).method19(arg3.field5374 / 2 + var12 + arg2 - (arg4.field3360 / 2), arg3.field5339 / 2 + -(arg4.field3369 / 2) + -var13 + arg0, (class2) arg3.method2399(false, 0));
        } else {
            ((class361) arg4).method2529(arg3.field5374 / 2 + arg2 + var12 - arg4.field3360 / 2, arg3.field5339 / 2 + -var13 + arg0 + -(arg4.field3369 / 2), arg3.field5272, arg3.field5428);
        }
    }

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "(II)I", line = 65)
    public final int method1622(int arg0, int arg1) {
        field3385++;
        return arg1 == 0 ? arg0 * 8 - this.field3395 : 20;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([IIIIII)V", line = 77)
    public static final void method1623(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class329 var6 = class170.field2689[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class348 var7 = var6.field5049;
        if (var7 != null) {
            int var8 = var7.field5521;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class117 var10 = var6.field5072;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1789;
        int var12 = var10.field1807;
        int var13 = var10.field1803;
        int var14 = var10.field1791;
        int[] var15 = class13.field217[var11];
        int[] var16 = class158.field2525[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII[B)V", line = 169)
    public final void method1624(byte arg0, int arg1, int arg2, byte[] arg3) {
        field3402++;
        int var5 = 0;
        if (arg0 == -54) {
            while (var5 < arg1) {
                arg3[arg2 + var5] = (byte) (this.field448[this.field397++] - this.field3390.method906(arg0 + 10));
                var5++;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "(B)I", line = 192)
    public final int method1625(byte arg0) {
        field3392++;
        int var2 = 31 % ((-arg0 - 2) / 35);
        return this.field448[this.field397++] - this.field3390.method906(114) & 0xFF;
    }

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "(II)V", line = 210)
    public static final void method1626(int arg0, int arg1) {
        class62.field952 = -1;
        class37.field573 = arg0;
        class287.field4447 = false;
        class150.field2450 = -1;
        if (arg1 > 56) {
            field3400++;
            class42.field671 = 1;
            class110.field1693 = 0;
            class337.field5185 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "(B)Lvo;", line = 238)
    public static final class22 method1627(byte arg0) {
        if (arg0 != 35) {
            field3389 = (short[]) null;
        }
        field3396++;
        if (class351.field5599 == null) {
            return null;
        } else {
            class338.field5202.method2220(-2, class351.field5599);
            class22 var1 = (class22) class338.field5202.method2223(false);
            class181 var2 = class334.method2351(var1.field349, (byte) -105);
            return var2 != null && var2.field2827 && var2.method1403(true) ? var1 : class33.method344(0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(BI)V", line = 262)
    public final void method1628(byte arg0, int arg1) {
        if (arg0 >= -7) {
            method1626(-113, -108);
        }
        field3386++;
        this.field448[this.field397++] = (byte) (arg1 + this.field3390.method906(118));
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(Z)V", line = 275)
    public static void method1629(boolean arg0) {
        field3388 = null;
        if (!arg0) {
            field3389 = null;
            field3403 = null;
            field3398 = null;
            field3404 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V", line = 291)
    public class217(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "(B)V", line = 295)
    public final void method1630(byte arg0) {
        if (arg0 != 35) {
            this.field3390 = (class104) null;
        }
        this.field3395 = this.field397 * 8;
        field3387++;
    }

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "(B)V", line = 307)
    public final void method1631(byte arg0) {
        field3391++;
        this.field397 = (this.field3395 + 7) / 8;
        if (arg0 != 0) {
            method1621(26, -86, 98, (class342) null, (class215) null, 21, 79);
        }
    }

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "(II)I", line = 323)
    public final int method1632(int arg0, int arg1) {
        int var3 = this.field3395 >> 3;
        int var4 = 8 - (this.field3395 & 0x7);
        if (arg0 != 14538) {
            this.method1620((byte) 115, (int[]) null);
        }
        field3394++;
        this.field3395 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (class23.field363[var4] & this.field448[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field448[var3] & class23.field363[var4]) + var5;
        } else {
            var6 = (this.field448[var3] >> var4 - arg1 & class23.field363[arg1]) + var5;
        }
        return var6;
    }
}
