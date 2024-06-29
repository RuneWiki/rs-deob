import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class324 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lps;")
    public static class63 field4684 = new class63();

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "[I")
    public static int[] field4686 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLnj;)V", line = 5)
    public final void method2010(byte arg0, class164 arg1) {
        while (true) {
            int var3 = arg1.method1087(false);
            if (var3 == 0) {
                if (arg0 != -62) {
                    this.field4685 = 35;
                }
                field4682++;
                return;
            }
            this.method2012(arg0 ^ 0xFFFFFFB8, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 28)
    public static void method2011(boolean arg0) {
        field4684 = null;
        field4686 = null;
        if (!arg0) {
            field4684 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILnj;I)V", line = 49)
    private final void method2012(int arg0, class164 arg1, int arg2) {
        if (arg0 < 96) {
            this.field4685 = 6;
        }
        if (arg2 == 1) {
            this.field4687 = arg1.method1074(-635989152);
            this.field4685 = arg1.method1087(false);
            this.field4683 = arg1.method1087(false);
        }
        field4688++;
    }
}
