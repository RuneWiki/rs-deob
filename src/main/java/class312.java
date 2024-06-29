import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class312 extends class117 {

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field4979 = 0;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int field4980 = 0;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "Loa;")
    public static class101 field4981 = new class101(64);

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    public static int field4982 = 0;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field4978;
        if (arg0 != 2) {
            method2084(42, 58);
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 126);
        if (super.field1883.field1313) {
            class157.method1070(var3, 0, class168.field2737, class173.field2835[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)Lwl;")
    public static final class304 method2084(int arg0, int arg1) {
        ++field4976;
        class304 var2 = (class304) class160.field2547.method1261(arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            class304 var3 = class214.method1491(arg0, false, false, class1.field20, class203.field3244);
            if (var3 != null) {
                class160.field2547.method1264(-1, (long) arg0, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class312() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
    public static void method2085(byte arg0) {
        field4981 = null;
        if (arg0 <= 17) {
            field4982 = -118;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public static final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4977;
        float var5 = (float) class275.field4416 / (float) class275.field4408;
        class68.field1132 = -1;
        class301.field4815 = -1;
        int var6 = arg2;
        int var7 = arg0;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg4 - (-var7 + arg0) / 2;
        class129.field2029 = class275.field4416 * var8 / var7;
        int var9 = arg1 - (-var6 + arg2) / 2;
        class247.field3934 = class275.field4408 * var9 / var6;
        class132.method934(arg3);
    }
}
