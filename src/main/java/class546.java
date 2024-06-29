import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class546 {

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lbu;")
    public static class21 field7860 = new class21(59, 0);

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "[F")
    public static float[] field7861 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "C")
    public char field7853;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public int field7854;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public int field7857;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public int field7858;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILso;)V", line = 7)
    private final void method3266(byte arg0, int arg1, class494 arg2) {
        int var4 = 44 % ((arg0 - 12) / 55);
        field7859++;
        if (arg1 == 1) {
            this.field7853 = class583.method3412(arg2.method2943((byte) 16), (byte) 90);
        } else if (arg1 == 2) {
            this.field7857 = arg2.method2998(true);
            this.field7854 = arg2.method2964((byte) 89);
            this.field7858 = arg2.method2964((byte) 67);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lso;I)V", line = 31)
    public final void method3267(class494 arg0, int arg1) {
        field7855++;
        while (true) {
            int var3 = arg0.method2964((byte) 73);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    field7860 = null;
                    return;
                }
            }
            this.method3266((byte) 78, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lka;ILrn;III)V", line = 55)
    public static final void method3268(class496 arg0, int arg1, class281 arg2, int arg3, int arg4, int arg5) {
        field7856++;
        int var6 = -121 % ((arg3 - 6) / 63);
        if (arg0 != null) {
            arg2.method1823(arg0.method116(), arg0.method120(), arg0.method69(), arg0.method118(), false, arg4, arg5, arg1, arg0.method113(), arg0.method100(), arg0.method102());
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 78)
    public static void method3269(byte arg0) {
        field7860 = null;
        if (arg0 > 106) {
            field7861 = null;
        }
    }
}
