import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class392 extends class136 {

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    private int field5766 = 409;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "[I")
    private int[] field5771 = new int[3];

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    private int field5770 = 4096;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    private int field5774 = 4096;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    private int field5775 = 4096;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Lvo;")
    public static class32 field5764 = new class32();

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field5773 = -1;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "Lga;")
    public static class277 field5772;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V", line = 6)
    public static void method2403(int arg0) {
        field5772 = null;
        if (arg0 == 3) {
            field5764 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 22)
    public class392() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIZ)I", line = 25)
    public static final int method2404(boolean arg0, int arg1, boolean arg2) {
        ++field5769;
        if (arg0) {
            return 0;
        } else {
            class110 var3 = class455.method2749(63, arg0, arg1);
            if (var3 == null) {
                return class156.field2223.method1458(5, arg1).field233;
            } else {
                int var4 = 0;
                for (int var5 = 0; ~var3.field1558.length < ~var5; ++var5) {
                    if (~var3.field1558[var5] == 0) {
                        ++var4;
                    }
                }
                if (!arg2) {
                    field5764 = null;
                }
                return var4 + class156.field2223.method1458(5, arg1).field233 + -var3.field1558.length;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)[[I", line = 63)
    public final int[][] method272(byte arg0, int arg1) {
        ++field5767;
        int[][] var3 = super.field1952.method3127((byte) -105, arg1);
        if (arg0 <= 33) {
            field5764 = null;
        }
        if (super.field1952.field7770) {
            int[][] var4 = this.method1036(3, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class467.field6889 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field5771[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field5766 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5771[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field5766 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field5771[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field5766 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5770 * var12 >> 12;
                            var9[var11] = this.field5774 * var14 >> 12;
                            var10[var11] = this.field5775 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[BIIIII[B)V", line = 155)
    public static final void method2405(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field5768;
        int var9 = -(arg3 >> 2);
        int var10 = -(3 & arg3);
        if (arg6 != -1) {
            field5772 = null;
        }
        for (int var11 = -arg0; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg1++;
                arg2[var10001] += arg8[arg4++];
                int var14 = arg1++;
                arg2[var14] += arg8[arg4++];
                int var15 = arg1++;
                arg2[var15] += arg8[arg4++];
                int var16 = arg1++;
                arg2[var16] += arg8[arg4++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg1++;
                arg2[var10001] += arg8[arg4++];
            }
            arg1 += arg7;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILiv;)V", line = 202)
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 == 4) {
            ++field5765;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (arg1 == 4) {
                                int var5 = arg2.method580((byte) 29);
                                this.field5771[1] = class345.method2089(65280, var5) >> 4;
                                this.field5771[0] = class345.method2089(var5, 16711680) << 4;
                                this.field5771[2] = class345.method2089(var5, 255) >> 12;
                            }
                        } else {
                            this.field5770 = arg2.method623((byte) 101);
                        }
                    } else {
                        this.field5774 = arg2.method623((byte) -62);
                    }
                } else {
                    this.field5775 = arg2.method623((byte) -122);
                }
            } else {
                this.field5766 = arg2.method623((byte) -96);
            }
        }
    }
}
