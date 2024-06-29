import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class497 extends class747 {

    @OriginalMember(owner = "client!iga", name = "M", descriptor = "I")
    private int field6959 = 4096;

    @OriginalMember(owner = "client!iga", name = "J", descriptor = "I")
    private int field6956 = 4096;

    @OriginalMember(owner = "client!iga", name = "G", descriptor = "I")
    private int field6954 = 4096;

    @OriginalMember(owner = "client!iga", name = "F", descriptor = "I")
    public static int field6953 = 0;

    @OriginalMember(owner = "client!iga", name = "N", descriptor = "Ljn;")
    public static class324 field6960 = new class324(9, 0, 4, 1);

    @OriginalMember(owner = "client!iga", name = "O", descriptor = "Lbk;")
    public static class446 field6961 = new class446("LIVE", 0);

    @OriginalMember(owner = "client!iga", name = "E", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!iga", name = "H", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!iga", name = "K", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!iga", name = "L", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(II)Ldf;")
    public static final class623 method3010(int arg0, int arg1) {
        ++field6958;
        class623 var2 = (class623) class220.field2973.method3898((byte) -42, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = -44 / ((arg1 - -14) / 43);
            byte[] var4 = class686.field9533.method1572(0, 0, arg0);
            class623 var5 = new class623();
            if (var4 != null) {
                var5.method3517((byte) 123, new class63(var4));
            }
            var5.method3513(-10);
            class220.field2973.method3899(82, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        int var3 = -128 / ((arg0 - 35) / 58);
        ++field6955;
        int[][] var4 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[][] var5 = this.method4158(0, arg1, 2);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class73.field1095 > var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (var13 == var14 && ~var14 == ~var15) {
                    var9[var12] = this.field6956 * var13 >> 12;
                    var10[var12] = this.field6954 * var14 >> 12;
                    var11[var12] = this.field6959 * var15 >> 12;
                } else {
                    var9[var12] = this.field6956;
                    var10[var12] = this.field6954;
                    var11[var12] = this.field6959;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V")
    public static void method3011(int arg0) {
        field6961 = null;
        field6960 = null;
        if (arg0 != -27847) {
            field6953 = -28;
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V")
    public class497() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            field6961 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field6959 = arg0.method482(-772591672);
                }
            } else {
                this.field6954 = arg0.method482(arg1 + -772603280);
            }
        } else {
            this.field6956 = arg0.method482(-772591672);
        }
        ++field6952;
    }
}
