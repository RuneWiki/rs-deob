import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class282 extends class328 {

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    private int field4101 = 1024;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    private int field4102 = 2048;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    private int field4099 = 3072;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field4097;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = -6 / ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(0, arg0, (byte) 119);
            for (int var6 = 0; ~class449.field6539 < ~var6; ++var6) {
                var3[var6] = this.field4101 - -(var5[var6] * this.field4102 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        int var3 = -125 / ((arg1 - 46) / 54);
        ++field4104;
        int[][] var4 = super.field4725.method1886((byte) 116, arg0);
        if (super.field4725.field4371) {
            int[][] var5 = this.method2040(0, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class449.field6539; ++var12) {
                var9[var12] = (var6[var12] * this.field4102 >> 12) + this.field4101;
                var10[var12] = (var7[var12] * this.field4102 >> 12) + this.field4101;
                var11[var12] = (var8[var12] * this.field4102 >> 12) + this.field4101;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lgp;I)I")
    public static final int method1803(class561 arg0, int arg1) {
        ++field4096;
        int var2 = 0;
        if (arg0.method3186((byte) 57, class559.field7929)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class149.field2264)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class545.field7585)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class220.field3309)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class392.field5878)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class186.field2696)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class475.field6801)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class209.field2957)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class41.field568)) {
            ++var2;
        }
        if (arg1 != 5424) {
            method1804((class561) null, 38, 110);
        }
        if (arg0.method3186((byte) 57, class474.field6798)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class527.field7336)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class318.field4619)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class99.field1727)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class552.field7823)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class234.field3446)) {
            ++var2;
        }
        if (arg0.method3186((byte) 57, class449.field6541)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lgp;II)Lrl;")
    public static final class633 method1804(class561 arg0, int arg1, int arg2) {
        ++field4100;
        byte[] var3 = arg0.method3177(arg1, arg2);
        return var3 == null ? null : new class633(var3);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class282() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        this.field4102 = this.field4099 - this.field4101;
        if (arg0 > -97) {
            this.field4101 = -74;
        }
        ++field4103;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field4098;
        if (arg0 <= 75) {
            method1804((class561) null, -93, 36);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4728 = arg2.method1738(255) == 1;
                }
            } else {
                this.field4099 = arg2.method1745(32132);
            }
        } else {
            this.field4101 = arg2.method1745(32132);
        }
    }
}
