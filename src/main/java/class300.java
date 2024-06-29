import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class300 {

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public int field4269 = 0;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "[I")
    public static int[] field4267 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "[I")
    public static int[] field4270 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Liv;")
    public static class64 field4268 = new class64(63, -2);

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field4272 = 0;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public static void method1894(byte arg0) {
        int var1 = 117 / ((14 - arg0) / 55);
        field4267 = null;
        field4268 = null;
        field4270 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILcu;)V")
    public final void method1895(int arg0, class145 arg1) {
        while (true) {
            int var3 = arg1.method1063((byte) 110);
            if (var3 == 0) {
                field4266++;
                if (arg0 != -16800) {
                    field4268 = null;
                    return;
                }
                return;
            }
            this.method1896(var3, -6, arg1);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILcu;)V")
    private final void method1896(int arg0, int arg1, class145 arg2) {
        field4265++;
        if (~arg0 == arg1) {
            this.field4269 = arg2.method1069((byte) -48);
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
    public static final void method1897(byte arg0) {
        field4271++;
        int var1 = -62 / ((-arg0 - 49) / 49);
        if (class237.field3426 == null) {
            return;
        }
        if (class237.field3426.field4940 == 1) {
            class237.field3426 = null;
            return;
        }
        if (class237.field3426.field4940 == 2) {
            class110.method822(class398.field6007, (byte) -79, 2, class518.field7711);
            class237.field3426 = null;
            return;
        }
    }
}
