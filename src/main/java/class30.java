import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 extends class535 {

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    private int field402 = 0;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    private int field406 = 4096;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Lqv;")
    public static class316 field405 = null;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Lrj;")
    public static class430 field408 = new class430("WTRC", 1);

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 75)
    public class30() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 10)
    public static void method172(int arg0) {
        field405 = null;
        field408 = null;
        if (arg0 > -79) {
            field405 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILwn;I)V", line = 31)
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field404;
        if (arg2 == -6232) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        super.field7878 = ~arg1.method3072((byte) -128) == -2;
                    }
                } else {
                    this.field406 = arg1.method3018(566990904);
                }
            } else {
                this.field402 = arg1.method3018(arg2 ^ -566984816);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[I", line = 78)
    public final int[] method65(int arg0, int arg1) {
        ++field407;
        if (arg1 != 1) {
            field405 = null;
        }
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int[] var4 = this.method3158(arg1 + -93, 0, arg0);
            for (int var5 = 0; ~class174.field2597 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field402) {
                    if (var6 > this.field406) {
                        var3[var5] = this.field406;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field402;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I", line = 121)
    public final int[][] method61(int arg0, int arg1) {
        ++field403;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[][] var4 = this.method3157((byte) 67, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class174.field2597 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 >= this.field402) {
                    if (~var12 < ~this.field406) {
                        var8[var11] = this.field406;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field402;
                }
                if (~var13 > ~this.field402) {
                    var9[var11] = this.field402;
                } else if (this.field406 >= var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field406;
                }
                if (var14 >= this.field402) {
                    if (this.field406 >= var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field406;
                    }
                } else {
                    var10[var11] = this.field402;
                }
            }
        }
        if (arg0 > -116) {
            this.method65(-70, 67);
        }
        return var3;
    }
}
