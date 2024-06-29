import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class592 {

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    private int field8405 = 0;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    private int field8406 = 0;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
    private int field8410 = 0;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Lep;")
    private class386 field8404 = null;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "Ler;")
    private class92 field8399;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "Lfj;")
    private class609 field8400;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "[Ljba;")
    private class366[] field8396;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "Laj;")
    public class287 field8408;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "Lsba;")
    public static class200 field8395 = new class200(64);

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "[I")
    public static int[] field8409 = new int[5];

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "Lhga;")
    public static class158 field8412 = new class158(85, 8);

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 4)
    public static void method3452(int arg0) {
        field8412 = null;
        int var1 = -20 % ((-arg0 - 58) / 55);
        field8409 = null;
        field8395 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BIIZZI)V", line = 16)
    public final void method3453(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        boolean var7 = arg4 & this.field8399.method326();
        field8398++;
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg2 = arg1;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg3) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field8410 != arg5) {
            if (this.field8410 != 0) {
                this.field8396[Integer.MAX_VALUE & this.field8410].method1132(0);
            }
            if (arg5 != 0) {
                this.field8396[Integer.MAX_VALUE & arg5].method1133(arg3, 0);
                this.field8396[arg5 & Integer.MAX_VALUE].method1131(arg3, true);
                this.field8396[arg5 & Integer.MAX_VALUE].method1136(-6561, arg2, arg1);
            }
            this.field8406 = arg2;
            this.field8410 = arg5;
            this.field8405 = arg1;
            this.field8404 = null;
        } else if (this.field8410 != 0) {
            this.field8396[this.field8410 & Integer.MAX_VALUE].method1131(arg3, true);
            if (this.field8405 != arg1 || this.field8406 != arg2) {
                this.field8396[this.field8410 & Integer.MAX_VALUE].method1136(-6561, arg2, arg1);
                this.field8405 = arg1;
                this.field8406 = arg2;
            }
        }
        int var8 = 97 / ((-arg0 - 38) / 58);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIII)V", line = 72)
    public static final void method3454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8403++;
        class265.method1877((byte) 72, arg0);
        int var7 = arg6;
        int var8 = arg0 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class39.field527[arg2];
        int var16 = arg3 - var8;
        class367.method2427(3803, arg1, var16, var15, arg3 - arg0);
        int var17 = arg3 + var8;
        class367.method2427(arg6 + 3803, arg5, var17, var15, var16);
        class367.method2427(arg6 ^ 0xEDB, arg1, arg0 + arg3, var15, var17);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class613.field8706[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 <= var9) {
                    int[] var18 = class39.field527[arg2 + var9];
                    int[] var19 = class39.field527[arg2 - var9];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class367.method2427(3803, arg1, var20, var18, var21);
                    class367.method2427(3803, arg1, var20, var19, var21);
                } else {
                    int[] var22 = class39.field527[arg2 + var9];
                    int[] var23 = class39.field527[arg2 - var9];
                    int var24 = class613.field8706[var9];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class367.method2427(3803, arg1, var28, var22, var26);
                    class367.method2427(3803, arg5, var27, var22, var28);
                    class367.method2427(3803, arg1, var25, var22, var27);
                    class367.method2427(arg6 + 3803, arg1, var28, var23, var26);
                    class367.method2427(arg6 ^ 0xEDB, arg5, var27, var23, var28);
                    class367.method2427(3803, arg1, var25, var23, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class39.field527[arg2 + var7];
            int[] var30 = class39.field527[arg2 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 >= var8) {
                class367.method2427(arg6 + 3803, arg1, var31, var29, var32);
                class367.method2427(3803, arg1, var31, var30, var32);
            } else {
                int var33 = var7 > var11 ? class613.field8706[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class367.method2427(3803, arg1, var35, var29, var32);
                class367.method2427(arg6 + 3803, arg5, var34, var29, var35);
                class367.method2427(3803, arg1, var31, var29, var34);
                class367.method2427(3803, arg1, var35, var30, var32);
                class367.method2427(3803, arg5, var34, var30, var35);
                class367.method2427(3803, arg1, var31, var30, var34);
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([BLjava/lang/String;IIBI)I", line = 198)
    public static final int method3455(byte[] arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 119) {
            return 61;
        }
        field8401++;
        int var6 = arg3 - arg5;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg2 + var7] = -97;
            } else {
                arg0[arg2 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZLri;)Lf;", line = 334)
    public static final class702 method3456(int arg0, boolean arg1, class97 arg2) {
        if (!arg1) {
            return null;
        }
        field8411++;
        class702 var3 = (class702) class628.field8861.method560(false, (long) arg0);
        if (var3 == null) {
            if (class629.field8876) {
                var3 = class627.field8857.method265(class284.method2029(arg2, arg0), true);
            } else {
                var3 = class653.method3764((byte) -78, arg2.method952(69, arg0));
            }
            class628.field8861.method559(var3, (long) arg0, 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZIZ)V", line = 369)
    public static final void method3457(boolean arg0, int arg1, boolean arg2) {
        field8407++;
        class527 var3 = class605.method3523(arg2, (byte) 125, arg1);
        if (arg0 && var3 != null) {
            var3.method707((byte) -98);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILep;I)Z", line = 389)
    public final boolean method3458(int arg0, class386 arg1, int arg2) {
        field8397++;
        if (this.field8410 == 0) {
            return false;
        }
        if (this.field8404 != arg1) {
            this.field8396[this.field8410 & Integer.MAX_VALUE].method1130(1, arg1, arg0);
            this.field8404 = arg1;
        }
        return arg2 == -24382 ? true : true;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ler;)V", line = 445)
    public class592(class92 arg0) {
        this.field8399 = arg0;
        this.field8400 = new class609(arg0);
        this.field8396 = new class366[10];
        this.field8396[1] = new class130(arg0);
        this.field8396[2] = new class424(arg0, this.field8400);
        this.field8396[4] = new class373(arg0, this.field8400);
        this.field8396[5] = new class150(arg0, this.field8400);
        this.field8396[6] = new class663(arg0);
        this.field8396[7] = new class550(arg0);
        this.field8396[3] = this.field8408 = new class287(arg0);
        this.field8396[8] = new class556(arg0, this.field8400);
        this.field8396[9] = new class575(arg0, this.field8400);
        if (!this.field8396[8].method1137(false)) {
            this.field8396[8] = this.field8396[4];
        }
        if (!this.field8396[9].method1137(false)) {
            this.field8396[9] = this.field8396[8];
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)Z", line = 416)
    public final boolean method3459(int arg0, int arg1) {
        field8402++;
        return arg0 < 98 ? false : this.field8396[arg1].method1137(false);
    }
}
