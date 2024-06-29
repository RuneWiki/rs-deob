import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class234 extends class398 {

    @OriginalMember(owner = "client!w", name = "K", descriptor = "Z")
    public static boolean field3122 = false;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3125 = "Allocated memory";

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Lar;")
    public static class47 field3126 = new class47();

    @OriginalMember(owner = "client!w", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3127 = "red:";

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIB)I")
    private final int method1402(int arg0, int arg1, byte arg2) {
        ++field3124;
        int var4 = arg1 - -(arg0 * 57);
        int var5 = var4 ^ var4 << 1;
        if (arg2 >= -93) {
            field3125 = null;
        }
        return -(((var5 * 15731 * var5 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class234() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public static void method1403(int arg0) {
        field3127 = null;
        field3126 = null;
        field3125 = null;
        if (arg0 != 0) {
            field3125 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field3123;
        int[] var3 = super.field5927.method305(arg0, (byte) 110);
        if (arg1 != 0) {
            method1404(-102, -93, -11);
        }
        if (super.field5927.field591) {
            int var4 = class84.field1206[arg0];
            for (int var5 = 0; var5 < class140.field1922; ++var5) {
                var3[var5] = this.method1402(var4, class375.field5448[var5], (byte) -95) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V")
    public static final void method1404(int arg0, int arg1, int arg2) {
        ++field3121;
        class263 var3 = class47.method337(13, 0, arg0);
        var3.method1807((byte) -128);
        var3.field3813 = arg2;
        if (arg1 != -789221) {
            field3127 = null;
        }
    }
}
