import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class414 extends class62 {

    @OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
    private int field5621 = 32768;

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "I")
    public static int field5625 = -1;

    @OriginalMember(owner = "client!lda", name = "D", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!lda", name = "H", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!lda", name = "I", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!lda", name = "J", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V", line = 236)
    public class414() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "(I)V", line = 11)
    public final void method395(int arg0) {
        ++field5624;
        if (arg0 <= -37) {
            class380.method2269(21815);
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(II)[I", line = 22)
    public final int[] method13(int arg0, int arg1) {
        ++field5626;
        if (arg1 != 656024161) {
            return null;
        } else {
            int[] var3 = super.field774.method3086(arg0, -2);
            if (super.field774.field7499) {
                int[] var4 = this.method408(arg0, 1, (byte) -69);
                int[] var5 = this.method408(arg0, 2, (byte) -69);
                for (int var6 = 0; var6 < class438.field5847; ++var6) {
                    int var7 = var4[var6] >> 4 & 255;
                    int var8 = var5[var6] * this.field5621 >> 12;
                    int var9 = class321.field4429[var7] * var8 >> 12;
                    int var10 = class48.field568[var7] * var8 >> 12;
                    int var11 = (var9 >> 12) + var6 & class410.field5604;
                    int var12 = class285.field3989 & arg0 - -(var10 >> 12);
                    int[] var13 = this.method408(var12, 0, (byte) -69);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIBLqa;I)Lr;", line = 71)
    public static final class159 method2443(int arg0, int arg1, int arg2, int arg3, byte arg4, class208 arg5, int arg6) {
        ++field5622;
        long var7 = (long) arg3;
        class159 var9 = (class159) class396.field5453.method842(0, var7);
        short var10 = 2055;
        if (arg4 != 98) {
            field5625 = 75;
        }
        if (var9 == null) {
            class451 var11 = class537.method3254(arg3, (byte) 1, class511.field7275, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field6378 < 13) {
                var11.method2730(0, 0);
            }
            var9 = arg5.method491(var11, var10, class322.field4443, 64, 768);
            class396.field5453.method835((byte) 127, var7, var9);
        }
        class159 var12 = var9.method94((byte) 2, var10, true);
        if (arg0 != 0) {
            var12.method61(arg0);
        }
        if (~arg6 != -1) {
            var12.method84(arg6);
        }
        if (arg1 != 0) {
            var12.method77(arg1);
        }
        if (~arg2 != -1) {
            var12.method82(0, arg2, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lgw;II)V", line = 120)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field5621 = 98;
        }
        ++field5623;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field788 = arg0.method1032((byte) -33) == 1;
            }
        } else {
            this.field5621 = arg0.method1045(true) << 4;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IB)[[I", line = 157)
    public final int[][] method409(int arg0, byte arg1) {
        ++field5627;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[] var4 = this.method408(arg0, 1, (byte) -69);
            int[] var5 = this.method408(arg0, 2, (byte) -69);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class438.field5847 < ~var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field5621 >> 12;
                int var12 = class321.field4429[var10] * var11 >> 12;
                int var13 = class48.field568[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class410.field5604;
                int var15 = class285.field3989 & (var13 >> 12) + arg0;
                int[][] var16 = this.method407(0, (byte) 41, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg1 > -20) {
            field5625 = -25;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(III)I", line = 217)
    public static final int method2444(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            method2443(16, -45, -61, -77, (byte) 48, (class208) null, 123);
        }
        ++field5628;
        return arg1 != 4 && arg1 != 5 ? 256 : class616.field9114[arg0 & 3];
    }
}
