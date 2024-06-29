import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class159 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2825 = 0;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static volatile int field2827 = -1;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BILik;)V")
    private final void method1083(byte arg0, int arg1, class261 arg2) {
        field2826++;
        int var4 = -62 % ((-arg0 - 64) / 33);
        if (arg1 == 1) {
            this.field2829 = arg2.method1740((byte) 84);
            this.field2832 = arg2.method1693((byte) -122);
            this.field2831 = arg2.method1693((byte) 27);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lik;I)V")
    public final void method1084(class261 arg0, int arg1) {
        if (arg1 != -7787) {
            return;
        }
        while (true) {
            int var3 = arg0.method1693((byte) 87);
            if (var3 == 0) {
                field2830++;
                return;
            }
            this.method1083((byte) -103, var3, arg0);
        }
    }
}
