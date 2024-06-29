import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class212 extends class278 {

    @OriginalMember(owner = "client!vv", name = "P", descriptor = "I")
    private int field3024 = 0;

    @OriginalMember(owner = "client!vv", name = "Q", descriptor = "I")
    private int field3025 = 4096;

    @OriginalMember(owner = "client!vv", name = "N", descriptor = "[[I")
    public static int[][] field3022 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    public static int field3019 = 1;

    @OriginalMember(owner = "client!vv", name = "I", descriptor = "Luf;")
    public static class310 field3018 = new class310(39, -1);

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!vv", name = "O", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Llh;II)V", line = 4)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 != -30446) {
            this.method324(113, 91);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field3754 = ~arg0.method2099(255) == -2;
                }
            } else {
                this.field3025 = arg0.method2062((byte) 14);
            }
        } else {
            this.field3024 = arg0.method2062((byte) 14);
        }
        ++field3021;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)[I", line = 50)
    public final int[] method208(int arg0, int arg1) {
        ++field3020;
        if (arg0 != -9) {
            return null;
        } else {
            int[] var3 = super.field3750.method256(arg1, -30359);
            if (super.field3750.field554) {
                int[] var4 = this.method1570(0, 0, arg1);
                for (int var5 = 0; ~var5 > ~class507.field7456; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 > ~this.field3024) {
                        var3[var5] = this.field3024;
                    } else if (~this.field3025 > ~var6) {
                        var3[var5] = this.field3025;
                    } else {
                        var3[var5] = var6;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)[[I", line = 97)
    public final int[][] method324(int arg0, int arg1) {
        if (arg0 <= 75) {
            field3022 = null;
        }
        ++field3023;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int[][] var4 = this.method1568(5426, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class507.field7456 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field3024 > var12) {
                    var8[var11] = this.field3024;
                } else if (this.field3025 < var12) {
                    var8[var11] = this.field3025;
                } else {
                    var8[var11] = var12;
                }
                if (var13 < this.field3024) {
                    var9[var11] = this.field3024;
                } else if (~this.field3025 <= ~var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field3025;
                }
                if (~var14 > ~this.field3024) {
                    var10[var11] = this.field3024;
                } else if (~var14 >= ~this.field3025) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field3025;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V", line = 174)
    public class212() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)V", line = 178)
    public static void method1277(boolean arg0) {
        field3018 = null;
        field3022 = null;
        if (arg0) {
            field3019 = -69;
        }
    }
}
