import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class352 extends class667 {

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    private int field4965 = 4096;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field4960 = 0;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "[I")
    public static int[] field4963;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field4959;
        if (arg0 >= -87) {
            this.method117((byte) -77, -112);
        }
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(arg1 - 1 & class77.field1453, (byte) -24, 0);
            int[] var5 = this.method3744(arg1, (byte) 124, 0);
            int[] var6 = this.method3744(class77.field1453 & arg1 + 1, (byte) 126, 0);
            for (int var7 = 0; class77.field1455 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4965;
                int var9 = (var5[class439.field6131 & var7 + 1] - var5[var7 + -1 & class439.field6131]) * this.field4965;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 - -var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method2209(int arg0) {
        field4963 = null;
        if (arg0 <= 57) {
            method2210(-27, -5, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class352() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)V")
    public static final void method2210(int arg0, int arg1, byte arg2) {
        ++field4966;
        class320.field4554 = arg1 - class542.field7644;
        class358.field5026 = -class542.field7632 + arg0;
        if (arg2 != -10) {
            field4960 = -10;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field4961;
        if (arg1 != 3) {
            this.method116((class35) null, -1, -13);
        }
        if (arg2 == 0) {
            this.field4965 = arg0.method253(arg1 + -13903);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
    public static final void method2211(byte arg0) {
        if (arg0 != 25) {
            field4963 = null;
        }
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class127.field1925[var1] = null;
        }
        ++field4962;
        class70.field1264 = 0;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static final void method2212(int arg0) {
        int var1 = 108 % ((-70 - arg0) / 42);
        class65.field1169.method3048(false);
        ++field4964;
    }
}
