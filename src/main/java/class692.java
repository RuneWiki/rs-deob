import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class692 {

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field9741 = new String[5];

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!jha", name = "f", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "Lg;")
    public static class154 field9743;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(III)I")
    public final int method3892(int arg0, int arg1, int arg2) {
        field9739++;
        int var4 = class363.field5105 <= arg1 ? arg1 : class363.field5105;
        if (class505.field7210 == this) {
            return 0;
        } else if (class633.field9062 == this) {
            return var4 - arg0;
        } else if (class556.field7784 == this) {
            return (var4 - arg0) / 2;
        } else {
            if (arg2 != 4) {
                field9743 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!jha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9740++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)V")
    public static final void method3893(int arg0, int arg1) {
        field9744++;
        int var2 = class605.field8787 - class395.field5534;
        if (var2 >= 100) {
            class411.field5689 = -1;
            class679.field9569 = -1;
            class666.field9338 = 1;
            return;
        }
        int var3 = (int) class432.field6035;
        if (var3 < (class359.field5048 >> 8)) {
            var3 = class359.field5048 >> 8;
        }
        if (class104.field1732[4] && (class539.field7589[4] + 128) > var3) {
            var3 = class539.field7589[4] + 128;
        }
        int var4 = (int) class321.field4568 + class535.field7552 & 0x3FFF;
        class166.method1230(var3, class701.field9841, var4, arg0, class246.field3437, class534.method3136(arg1, class312.field4409, class468.field6748.field644, class468.field6748.field648) - 200, (byte) -87, (var3 >> 3) * 3 + 600 << 2);
        float var5 = (float) arg1 - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class685.field9660 = (int) ((float) (class685.field9660 - class215.field3079) * var5 + (float) class215.field3079);
        class260.field3810 = (int) ((float) (class260.field3810 - class589.field8280) * var5 + (float) class589.field8280);
        class694.field9754 = (int) ((float) (class694.field9754 - class517.field7351) * var5 + (float) class517.field7351);
        class136.field2118 = (int) ((float) (class136.field2118 - class641.field9118) * var5 + (float) class641.field9118);
        int var6 = class239.field3371 - class259.field3807;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class239.field3371 = (int) ((float) var6 * var5 + (float) class259.field3807);
        class239.field3371 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
    public static final void method3894(int arg0) {
        class747.method4153((byte) -86);
        field9742++;
        class618.field8927 = null;
        class385.field5381 = null;
        if (arg0 != 20433) {
            method3894(64);
        }
        class359.field5033 = null;
        class246.field3459 = null;
        class532.field7530 = null;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)V")
    public static void method3895(byte arg0) {
        if (arg0 != 28) {
            field9743 = null;
        }
        field9743 = null;
        field9741 = null;
    }
}
