import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class157 extends class512 {

    @OriginalMember(owner = "client!er", name = "P", descriptor = "I")
    private int field2548 = 4096;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    private int field2541 = 0;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field2547 = 0;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "Lvv;")
    public static class313 field2544;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(B)V")
    public static void method1098(byte arg0) {
        field2544 = null;
        if (arg0 < 14) {
            method1101(-109, (String) null, -78);
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
    public class157() {
        super(1, true);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field2543;
        if (arg0) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field2548 = arg2.method132(91);
                }
            } else {
                this.field2541 = arg2.method132(37);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(I)V")
    public static final void method1099(int arg0) {
        ++field2545;
        class262.field4366.method2525(0);
        client.field1183.method2525(0);
        if (arg0 <= 117) {
            method1099(5);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        ++field2546;
        int[] var3 = super.field7494.method232(arg0, true);
        int var4 = -13 % ((arg1 - 43) / 48);
        if (super.field7494.field474) {
            int[] var5 = this.method3013(false, 0, arg0);
            for (int var6 = 0; ~var6 > ~class402.field6113; ++var6) {
                int var7 = var5[var6];
                var3[var6] = var7 >= this.field2541 && ~var7 >= ~this.field2548 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[FIIZIIFI)V")
    public static final void method1100(int arg0, int arg1, float[] arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, float arg8, int arg9) {
        int var10 = arg4 - arg7;
        int var11 = arg6 - arg1;
        int var12 = arg0 - arg9;
        ++field2540;
        float var13 = arg2[2] * (float) var11 + arg2[1] * (float) var12 + arg2[0] * (float) var10;
        float var14 = arg2[5] * (float) var11 + arg2[3] * (float) var10 + arg2[4] * (float) var12;
        if (!arg5) {
            method1098((byte) -61);
        }
        float var15 = arg2[8] * (float) var11 + arg2[6] * (float) var10 + arg2[7] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = 0.5F + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg8;
        if (arg3 != 1) {
            if (arg3 != 2) {
                if (arg3 == 3) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                var17 = -var17;
                var18 = -var18;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class126.field2181 = var17;
        class244.field4190 = var18;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method1101(int arg0, String arg1, int arg2) {
        if (arg2 != 1) {
            field2544 = null;
        }
        ++field2542;
        return class180.method1214(arg1, (byte) -104, true, arg0);
    }
}
