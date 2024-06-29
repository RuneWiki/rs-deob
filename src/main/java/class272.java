import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class272 {

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[[I")
    public int[][] field3436;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field3442 = -50;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
    public static int[] field3439;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method1286(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
    public static final void method1561(int arg0, byte arg1) {
        field3435++;
        class472.field5995.method2411(true, arg0);
        class84.field1187.method2411(true, arg0);
        class376.field4740.method2411(true, arg0);
        if (arg1 != 70) {
            method1561(70, (byte) -41);
        }
        class376.field4747.method2411(true, arg0);
    }

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method1288();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)I")
    public final int method1562(int arg0, byte arg1, int arg2) {
        if (arg1 == 51) {
            field3438++;
            return this.field3436[arg2][arg0];
        } else {
            return 67;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method1563(byte arg0) {
        field3439 = null;
        if (arg0 <= 98) {
            field3442 = 92;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method1281(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lgga;[I)V")
    public abstract void method1289(class332 arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method1564(int arg0) {
        field3433++;
        if (arg0 != 2) {
            method1564(108);
        }
        for (int var1 = 0; var1 < class207.field2629; var1++) {
            class425.field5335[var1] = null;
        }
        class207.field2629 = 0;
        for (int var2 = 0; var2 < class391.field4927; var2++) {
            for (int var46 = 0; var46 < class429.field5383; var46++) {
                for (int var47 = 0; var47 < class37.field508; var47++) {
                    class75 var48 = class270.field3423[var2][var47][var46];
                    if (var48 != null) {
                        if (var48.field1033 > 0) {
                            var48.field1033 = (short) (var48.field1033 * -1);
                        }
                        if (var48.field1032 > 0) {
                            var48.field1032 = (short) (var48.field1032 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class391.field4927; var3++) {
            for (int var4 = 0; var4 < class429.field5383; var4++) {
                for (int var5 = 0; var5 < class37.field508; var5++) {
                    class75 var6 = class270.field3423[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class270.field3423[0][var5][var4] != null && class270.field3423[0][var5][var4].field1023 != null;
                        if (var6.field1033 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var10 = var3;
                            int var11 = var3;
                            class75 var12 = class270.field3423[var3][var5][var4 - 1];
                            int var13 = class256.field3127[var3].method1562(var4, (byte) 51, var5);
                            while (var8 > 0 && var12 != null && var12.field1033 < 0 && var6.field1033 == var12.field1033 && var6.field1029 == var12.field1029 && var13 == class256.field3127[var3].method1562(var8 - 1, (byte) 51, var5) && ((var8 - 1) <= 0 || class256.field3127[var3].method1562(var8 - 2, (byte) 51, var5) == var13)) {
                                var8--;
                                var12 = class270.field3423[var3][var5][var8 - 1];
                            }
                            for (class75 var14 = class270.field3423[var3][var5][var4 + 1]; class37.field508 > var9 && var14 != null && var14.field1033 < 0 && var6.field1033 == var14.field1033 && var6.field1029 == var14.field1029 && class256.field3127[var3].method1562(var9 + 1, (byte) 51, var5) == var13 && (var9 + 1 >= class37.field508 || class256.field3127[var3].method1562(var9 + 2, (byte) 51, var5) == var13); var14 = class270.field3423[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            label304: while (var10 > 0) {
                                for (int var15 = var8; var15 <= var9; var15++) {
                                    if (class270.field3423[var10 - 1][var5][var15] == null || class270.field3423[var10 - 1][var5][var15].field1033 != var6.field1033 || class270.field3423[var10 - 1][var5][var15].field1029 != var6.field1029) {
                                        break label304;
                                    }
                                }
                                var10--;
                            }
                            label321: while (var11 < (class391.field4927 - 1)) {
                                for (int var16 = var8; var16 <= var9; var16++) {
                                    if (class270.field3423[var11 + 1][var5][var16] == null || class270.field3423[var11 + 1][var5][var16].field1033 != var6.field1033 || class270.field3423[var11 + 1][var5][var16].field1029 != var6.field1029) {
                                        break label321;
                                    }
                                }
                                var11++;
                            }
                            int var17 = var11 + 1 - var10;
                            int var18 = class256.field3127[var7 ? var10 + 1 : var10].method1562(var8, (byte) 51, var5);
                            int var19 = var6.field1033 * var17 + var18;
                            int var20 = class256.field3127[var7 ? var10 + 1 : var10].method1562(var9 + 1, (byte) 51, var5);
                            int var21 = var6.field1033 * var17 + var20;
                            int var22 = var5 << class52.field775;
                            int var23 = var8 << class52.field775;
                            int var24 = (var9 << class52.field775) + class702.field9928;
                            class425.field5335[class207.field2629++] = new class199(1, var11, var6.field1029 + var22, var6.field1029 + var22, var6.field1029 + var22, var6.field1029 + var22, var18, var20, var21, var19, var23, var24, var24, var23);
                            for (int var25 = var10; var25 <= var11; var25++) {
                                for (int var26 = var8; var26 <= var9; var26++) {
                                    class270.field3423[var25][var5][var26].field1033 = (short) (class270.field3423[var25][var5][var26].field1033 * -1);
                                }
                            }
                        }
                        if (var6.field1032 < 0) {
                            int var27 = var5;
                            int var28 = var5;
                            int var29 = var3;
                            int var30 = var3;
                            class75 var31 = class270.field3423[var3][var5 - 1][var4];
                            int var32 = class256.field3127[var3].method1562(var4, (byte) 51, var5);
                            while (var27 > 0 && var31 != null && var31.field1032 < 0 && var6.field1032 == var31.field1032 && var6.field1027 == var31.field1027 && class256.field3127[var3].method1562(var4, (byte) 51, var27 - 1) == var32 && (var27 - 1 <= 0 || class256.field3127[var3].method1562(var4, (byte) 51, var27 - 2) == var32)) {
                                var27--;
                                var31 = class270.field3423[var3][var27 - 1][var4];
                            }
                            for (class75 var33 = class270.field3423[var3][var5 + 1][var4]; class429.field5383 > var28 && var33 != null && var33.field1032 < 0 && var6.field1032 == var33.field1032 && var6.field1027 == var33.field1027 && var32 == class256.field3127[var3].method1562(var4, (byte) 51, var28 + 1) && ((var28 + 1) >= class429.field5383 || class256.field3127[var3].method1562(var4, (byte) 51, var28 + 2) == var32); var33 = class270.field3423[var3][var28 + 1][var4]) {
                                var28++;
                            }
                            label220: while (var29 > 0) {
                                for (int var34 = var27; var34 <= var28; var34++) {
                                    if (class270.field3423[var29 - 1][var34][var4] == null || class270.field3423[var29 - 1][var34][var4].field1032 != var6.field1032 || class270.field3423[var29 - 1][var34][var4].field1027 != var6.field1027) {
                                        break label220;
                                    }
                                }
                                var29--;
                            }
                            label205: while (var30 < (class391.field4927 - 1)) {
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    if (class270.field3423[var30 + 1][var35][var4] == null || class270.field3423[var30 + 1][var35][var4].field1032 != var6.field1032 || class270.field3423[var30 + 1][var35][var4].field1027 != var6.field1027) {
                                        break label205;
                                    }
                                }
                                var30++;
                            }
                            int var36 = var30 + 1 - var29;
                            int var37 = class256.field3127[var7 ? var29 + 1 : var29].method1562(var4, (byte) 51, var27);
                            int var38 = var6.field1032 * var36 + var37;
                            int var39 = class256.field3127[var7 ? var29 + 1 : var29].method1562(var4, (byte) 51, var28 + 1);
                            int var40 = var6.field1032 * var36 + var39;
                            int var41 = var27 << class52.field775;
                            int var42 = (var28 << class52.field775) + class702.field9928;
                            int var43 = var4 << class52.field775;
                            class425.field5335[class207.field2629++] = new class199(2, var30, var41, var42, var42, var41, var37, var39, var40, var38, var43 + var6.field1027, var6.field1027 + var43, var6.field1027 + var43, var6.field1027 + var43);
                            for (int var44 = var29; var44 <= var30; var44++) {
                                for (int var45 = var27; var45 <= var28; var45++) {
                                    class270.field3423[var44][var45][var4].field1032 = (short) (class270.field3423[var44][var45][var4].field1032 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class269.field3404 = true;
    }

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class119 method1285(int arg0, int arg1, class119 arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZ)I")
    public final int method1565(int arg0, int arg1, boolean arg2) {
        field3434++;
        if (!arg2) {
            return -5;
        }
        int var4 = arg1 >> this.field3437;
        int var5 = arg0 >> this.field3437;
        if (var4 < 0 || var5 < 0 || var4 > (this.field3441 - 1) || (this.field3440 - 1) < var5) {
            return 0;
        }
        int var6 = this.field3432 - 1 & arg1;
        int var7 = arg0 & this.field3432 - 1;
        int var8 = (this.field3432 - var6) * this.field3436[var4][var5] + this.field3436[var4 + 1][var5] * var6 >> this.field3437;
        int var9 = (this.field3432 - var6) * this.field3436[var4][var5 + 1] + this.field3436[var4 + 1][var5 + 1] * var6 >> this.field3437;
        return (this.field3432 - var7) * var8 + var7 * var9 >> this.field3437;
    }

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method1284(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1277(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method1274(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1276(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1278(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method1282(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
    public class272(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3440 = arg1;
        this.field3441 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field3432 = 0x1 << var5;
        this.field3436 = arg3;
        this.field3437 = var5;
    }
}
