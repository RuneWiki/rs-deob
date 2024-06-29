import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class214 extends class242 {

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    private int field3670 = 4096;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    private int field3675 = 409;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    private int field3676 = 4096;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "[I")
    private int[] field3678 = new int[3];

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    private int field3673 = 4096;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "Lbc;")
    public static class174 field3677;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "[Lp;")
    public static class280[] field3674;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            this.method49(-2, 10, (class25) null);
        }
        ++field3679;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int[][] var4 = this.method1648(26484, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; ~var11 > ~class264.field4654; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3678[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field3675) {
                    var8[var11] = var12;
                    var7[var11] = var6[var11];
                    var9[var11] = var10[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3678[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field3675) {
                        var8[var11] = var12;
                        var7[var11] = var14;
                        var9[var11] = var10[var11];
                    } else {
                        int var16 = var10[var11];
                        int var17 = -this.field3678[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field3675 > ~var17) {
                            var8[var11] = var12;
                            var7[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var8[var11] = this.field3673 * var12 >> 12;
                            var7[var11] = this.field3676 * var14 >> 12;
                            var9[var11] = this.field3670 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I")
    public static int method1432(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI[Lp;I[S)V")
    public static final void method1433(boolean arg0, int arg1, class280[] arg2, int arg3, short[] arg4) {
        if (arg3 < arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            class280 var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg3; ~arg1 < ~var9; ++var9) {
                if (var7 == null || arg2[var9] != null && ~(var9 & 1) < ~arg2[var9].method1886(var7, 121)) {
                    class280 var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method1433(true, var6 + -1, arg2, arg3, arg4);
            method1433(true, arg1, arg2, var6 + 1, arg4);
        }
        ++field3672;
        if (!arg0) {
            field3674 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)V")
    public static void method1434(int arg0) {
        if (arg0 != 25914) {
            field3677 = null;
        }
        field3677 = null;
        field3674 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field3669;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method230(15046);
                            this.field3678[0] = method1432(var5, 16711680) << 4;
                            this.field3678[1] = method1432(var5 >> 4, 4080);
                            this.field3678[2] = method1432(255, var5) >> 12;
                        }
                    } else {
                        this.field3673 = arg2.method193((byte) 77);
                    }
                } else {
                    this.field3676 = arg2.method193((byte) 77);
                }
            } else {
                this.field3670 = arg2.method193((byte) 77);
            }
        } else {
            this.field3675 = arg2.method193((byte) 77);
        }
        if (arg0 > -119) {
            this.field3673 = 54;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lud;")
    public static final class2 method1435(byte arg0) {
        ++field3671;
        if (arg0 != 35) {
            return null;
        } else {
            return class201.field3515 < class96.field1534.length ? class96.field1534[class201.field3515++] : null;
        }
    }
}
