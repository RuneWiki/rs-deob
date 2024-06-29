import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class14 extends class197 {

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    private int field183 = 0;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    private int field174 = 4096;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "Loh;")
    public static class258 field186 = class153.method1046("gelb:", 122);

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "Loh;")
    public static class258 field187 = class153.method1046("(U", 101);

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field176 = 2;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILhm;IIBII)V", line = 7)
    public static final void method95(int arg0, int arg1, int arg2, class101 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field179++;
        int var9 = arg2 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg3.field1790;
            var11 = arg3.field1839;
        } else {
            var10 = arg3.field1839;
            var11 = arg3.field1790;
        }
        int var12;
        int var13;
        if ((arg7 + var11) > 104) {
            var12 = arg7;
            var13 = arg7 + 1;
        } else {
            var13 = (var11 + 1 >> 1) + arg7;
            var12 = (var11 >> 1) + arg7;
        }
        int var14;
        int var15;
        if ((arg4 + var10) > 104) {
            var14 = arg4;
            var15 = arg4 + 1;
        } else {
            var15 = (var10 + 1 >> 1) + arg4;
            var14 = (var10 >> 1) + arg4;
        }
        int var16 = (arg7 << 7) + (var11 << 6);
        int var17 = (arg4 << 7) + (var10 << 6);
        if (arg6 >= -101) {
            method95(120, 87, -9, (class101) null, -82, -76, (byte) -49, 51, -62);
        }
        int[][] var18 = class201.field3482[arg8];
        int var19 = var18[var12][var14] + var18[var13][var14] + var18[var12][var15] + var18[var13][var15] >> 2;
        int var20 = 0;
        if (arg8 != 0) {
            int[][] var21 = class201.field3482[0];
            var20 = var19 - (var21[var12][var14] + var21[var13][var14] - (-var21[var12][var15] + -var21[var13][var15]) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg8 < 3) {
            var22 = class201.field3482[arg8 + 1];
        }
        class294 var23 = arg3.method756(true, var18, arg2, var22, true, false, var17, (class129) null, var19, arg1, var16);
        class9.method63(var23.field5049, var16 - arg0, var20, var17 - arg5);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[I", line = 102)
    public final int[] method96(int arg0, int arg1) {
        field185++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, arg0 ^ 0x3F33, arg1);
            for (int var5 = 0; var5 < class190.field3362; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field183 && var6 <= this.field174 ? 4096 : 0;
            }
        }
        if (arg0 != -16221) {
            this.field183 = -118;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(B)V", line = 141)
    public static void method97(byte arg0) {
        field186 = null;
        if (arg0 > -88) {
            field178 = 13;
        }
        field187 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILva;I)V", line = 153)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            return;
        }
        field173++;
        if (arg2 == 0) {
            this.field183 = arg1.method1615(arg0 - 7844);
        } else if (arg2 == 1) {
            this.field174 = arg1.method1615(arg0 - 8083);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 375)
    public class14() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIIIIII)V", line = 200)
    public static final void method99(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field180++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg5 - arg0;
        int var12 = arg5 * arg5;
        int var13 = arg4 - arg0;
        int var14 = arg4 * arg4;
        int var15 = var13 * var13;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var16 << 1;
        int var20 = var12 << 1;
        int var21 = var13 << 1;
        int var22 = arg4 << 1;
        int var23 = (1 - var22) * var12 + var17;
        int var24 = (1 - var21) * var16 + var18;
        int var25 = var14 - ((var22 - 1) * var20);
        int var26 = var15 - ((var21 - 1) * var19);
        int var27 = var14 << 2;
        int var28 = var12 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = (var22 - 3) * var20;
        if (arg1 != 100) {
            field177 = -67;
        }
        int var32 = var18 * 3;
        int var33 = var17 * 3;
        int var34 = (var21 - 3) * var19;
        int var35 = (arg4 - 1) * var28;
        int var36 = var27;
        int var37 = (var13 - 1) * var30;
        int[] var38 = class154.field2638[arg3];
        int var39 = var29;
        class19.method126(arg1 - 93, arg7, var38, arg2 - arg5, -var11 + arg2);
        class19.method126(arg1 - 93, arg6, var38, arg2 - var11, arg2 + var11);
        class19.method126(arg1 ^ 0x63, arg7, var38, arg2 + var11, arg2 + arg5);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var25 += var36;
                    var36 += var27;
                    var23 += var33;
                    var8++;
                    var33 += var27;
                }
            }
            boolean var40 = var9 <= var13;
            var9--;
            int var41 = arg3 + var9;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var32;
                        var26 += var39;
                        var39 += var29;
                        var10++;
                        var32 += var29;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var39;
                    var24 += var32;
                    var32 += var29;
                    var39 += var29;
                }
                var24 += -var37;
                var26 += -var34;
                var37 -= var30;
                var34 -= var30;
            }
            if (var25 < 0) {
                var25 += var36;
                var36 += var27;
                var8++;
                var23 += var33;
                var33 += var27;
            }
            var25 += -var31;
            int var42 = arg3 - var9;
            int var43 = arg2 + var8;
            int var44 = arg2 - var8;
            var23 += -var35;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class19.method126(7, arg7, class154.field2638[var42], var44, var46);
                class19.method126(arg1 ^ 0x63, arg6, class154.field2638[var42], var46, var45);
                class19.method126(7, arg7, class154.field2638[var42], var45, var43);
                class19.method126(7, arg7, class154.field2638[var41], var44, var46);
                class19.method126(7, arg6, class154.field2638[var41], var46, var45);
                class19.method126(arg1 - 93, arg7, class154.field2638[var41], var45, var43);
            } else {
                class19.method126(7, arg7, class154.field2638[var42], var44, var43);
                class19.method126(7, arg7, class154.field2638[var41], var44, var43);
            }
            var35 -= var28;
            var31 -= var28;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V", line = 383)
    public static final void method100(int arg0, int arg1) {
        field182++;
        if (arg0 > 118) {
            class286 var2 = class48.method389(arg1, 5, 10738);
            var2.method2010((byte) -38);
        }
    }
}
