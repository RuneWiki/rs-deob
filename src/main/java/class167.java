import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class167 extends class62 {

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Lvb;")
    public static class60 field2568 = new class60(0, 0);

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "[I")
    public static int[] field2572 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2574 = null;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "[I")
    public static int[] field2575 = new int[4];

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "B")
    public byte field2570;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "Llj;")
    public class25 field2571;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(Z)V")
    public static final void method1144(boolean arg0) {
        if (arg0) {
            class90.field1382 = class173.field2712;
            class200.field3128 = class235.field3772;
        } else {
            class90.field1382 = class266.field4273;
            class200.field3128 = class198.field3108;
        }
        class194.field3046 = class90.field1382.length;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I")
    public final int method434(byte arg0) {
        ++field2577;
        if (this.field2571 == null) {
            return 0;
        } else {
            if (arg0 != -104) {
                this.field2569 = 28;
            }
            return this.field2571.field349 * 100 / (this.field2571.field339.length + -this.field2570);
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
    public static void method1145(int arg0) {
        field2574 = null;
        field2568 = null;
        field2572 = null;
        field2575 = null;
        if (arg0 != -11878) {
            field2574 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Llj;I)Lil;")
    public static final class162 method1146(class25 arg0, int arg1) {
        ++field2573;
        class162 var2 = new class162(arg0.method189(false), arg0.method189(false), arg0.method190(-3), arg0.method190(-3), arg0.method214((byte) 44), ~arg0.method201(255) == -2, arg0.method201(255));
        int var3 = arg0.method201(255);
        int var4 = 120 / ((56 - arg1) / 53);
        for (int var5 = 0; ~var3 < ~var5; ++var5) {
            var2.field2516.method349(new class65(arg0.method190(-3), arg0.method190(-3), arg0.method190(-3), arg0.method190(-3)), true);
        }
        var2.method1115(0);
        return var2;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)[B")
    public final byte[] method432(int arg0) {
        if (arg0 != 24977) {
            return null;
        } else {
            ++field2576;
            if (!super.field854 && this.field2571.field349 >= this.field2571.field339.length + -this.field2570) {
                return this.field2571.field339;
            } else {
                throw new RuntimeException();
            }
        }
    }
}
