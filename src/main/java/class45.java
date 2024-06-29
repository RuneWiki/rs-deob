import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class45 extends class59 {

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    private int field807 = 4;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    private int field815 = 4;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "Lsd;")
    private static class166 field809 = class135.method935("Your account has been disabled)3", 0);

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "Lsd;")
    public static class166 field805 = class135.method935("(Y", 0);

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "Lsd;")
    public static class166 field816 = field809;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Ld;")
    public static class29 field808 = new class29(4096);

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class45() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        int[][] var3 = super.field1207.method528(65, arg1);
        if (!arg0) {
            this.method37(true, -40);
        }
        ++field810;
        if (super.field1207.field1320) {
            int var4 = class171.field3285 / this.field807;
            int var5 = class98.field1879 / this.field815;
            int[][] var6;
            if (~var4 >= -1) {
                var6 = this.method498(0, 0, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method498(class171.field3285 * var7 / var4, 0, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class98.field1879; ++var14) {
                int var15;
                if (var5 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class98.field1879 * var16 / var5;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILvd;)V")
    public static final void method343(int arg0, int arg1, int arg2, class193 arg3) {
        ++field813;
        if (class18.field298 == null && !class192.field3654) {
            if (arg3 != null && class184.method1248(false, arg3) != null) {
                class18.field298 = arg3;
                if (arg0 >= -126) {
                    field808 = null;
                }
                class64.field1328 = class184.method1248(false, arg3);
                class41.field731 = arg1;
                class196.field3874 = false;
                class35.field660 = arg2;
                class184.field3481 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[BI)Lsd;")
    public static final class166 method344(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field811;
        class166 var4 = new class166();
        var4.field3187 = 0;
        if (arg3 != -1) {
            field816 = null;
        }
        var4.field3162 = new byte[arg0];
        for (int var5 = arg1; ~(arg0 + arg1) < ~var5; ++var5) {
            if (~arg2[var5] != -1) {
                var4.field3162[var4.field3187++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 > -124) {
            return null;
        } else {
            ++field806;
            int[] var3 = super.field1219.method721(arg0, -127);
            if (super.field1219.field1816) {
                int var4 = class98.field1879 / this.field815;
                int var5 = class171.field3285 / this.field807;
                int[] var7;
                if (var5 > 0) {
                    int var6 = arg0 % var5;
                    var7 = this.method499(0, class171.field3285 * var6 / var5, 0);
                } else {
                    var7 = this.method499(0, 0, 0);
                }
                for (int var8 = 0; var8 < class98.field1879; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class98.field1879 * var9 / var4];
                    } else {
                        var3[var8] = var7[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field807 = arg0.method400(255);
            }
        } else {
            this.field815 = arg0.method400(255);
        }
        if (arg1 <= 18) {
            field816 = null;
        }
        ++field812;
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V")
    public static void method345(int arg0) {
        field808 = null;
        field809 = null;
        field805 = null;
        field816 = null;
        if (arg0 >= -126) {
            method343(77, 4, 62, (class193) null);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)V")
    public static final void method346(int arg0, int arg1, int arg2, int arg3) {
        ++field814;
        for (int var4 = 0; var4 < 8; ++var4) {
            for (int var7 = 0; var7 < 8; ++var7) {
                class74.field1511[arg3][arg2 - -var4][arg1 - -var7] = 0;
            }
        }
        if (~arg2 < -1) {
            for (int var5 = 1; ~var5 > -9; ++var5) {
                class74.field1511[arg3][arg2][arg1 + var5] = class74.field1511[arg3][arg2 + -1][arg1 + var5];
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; ++var6) {
                class74.field1511[arg3][arg2 + var6][arg1] = class74.field1511[arg3][arg2 + var6][arg1 + -1];
            }
        }
        if (arg2 > 0 && class74.field1511[arg3][arg2 - 1][arg1] != 0) {
            class74.field1511[arg3][arg2][arg1] = class74.field1511[arg3][arg2 + -1][arg1];
        } else if (~arg1 < -1 && class74.field1511[arg3][arg2][arg1 - 1] != 0) {
            class74.field1511[arg3][arg2][arg1] = class74.field1511[arg3][arg2][arg1 + -1];
        } else if (~arg2 < -1 && ~arg1 < -1 && ~class74.field1511[arg3][arg2 + -1][arg1 - 1] != -1) {
            class74.field1511[arg3][arg2][arg1] = class74.field1511[arg3][arg2 + -1][arg1 + -1];
        }
        if (arg0 != -25172) {
            method343(67, 85, 29, (class193) null);
        }
    }
}
