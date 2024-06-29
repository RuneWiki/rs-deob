import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class121 extends class739 {

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    private int field1757 = 4096;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "Lhg;")
    public static class693 field1759 = new class693(79, -1);

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "Lkg;")
    public static class275 field1761 = new class275(25, -2);

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 3)
    public class121() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZIIIIIFI)[[I", line = 9)
    public static final int[][] method928(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8) {
        if (arg8 != -2) {
            return null;
        } else {
            ++field1758;
            int[][] var9 = new int[arg3][arg0];
            class503 var10 = new class503();
            var10.field7102 = arg4;
            var10.field7107 = arg1;
            var10.field7111 = arg6;
            var10.field7105 = arg2;
            var10.field7106 = (int) (arg7 * 4096.0F);
            var10.method216(arg8 + -21771);
            class611.method3430((byte) -72, arg3, arg0);
            for (int var11 = 0; ~var11 > ~arg3; ++var11) {
                var10.method2942(-8346, var9[var11], var11);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)V", line = 40)
    public static final void method929(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1756;
        class37 var5 = class636.method3571(8, arg2, -31);
        if (arg4) {
            method929(-104, 52, -60, -5, true);
        }
        var5.method232(-3);
        var5.field582 = arg1;
        var5.field585 = arg0;
        var5.field579 = arg3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Ltq;", line = 59)
    public static final class630 method930(int arg0, boolean arg1) {
        if (arg1) {
            method931(-77);
        }
        ++field1755;
        return arg0 >= 0 && arg0 < 100 ? class669.field9390[arg0] : null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lsl;II)V", line = 73)
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field1760;
        if (arg2 == -3) {
            if (arg1 == 0) {
                this.field1757 = arg0.method2566(-2);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I", line = 89)
    public final int[] method215(int arg0, int arg1) {
        if (arg0 != -23347) {
            this.method215(-36, 115);
        }
        ++field1753;
        int[] var3 = super.field10311.method2116(arg1, (byte) 85);
        if (super.field10311.field4728) {
            int[] var4 = this.method4115(-123, arg1 - 1 & class683.field9515, 0);
            int[] var5 = this.method4115(-116, arg1, 0);
            int[] var6 = this.method4115(-128, class683.field9515 & arg1 + 1, 0);
            for (int var7 = 0; var7 < class29.field523; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field1757;
                int var9 = (var5[class346.field4366 & var7 + 1] + -var5[var7 - 1 & class346.field4366]) * this.field1757;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V", line = 144)
    public static void method931(int arg0) {
        if (arg0 == -17780) {
            field1761 = null;
            field1759 = null;
        }
    }
}
