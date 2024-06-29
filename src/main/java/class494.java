import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class494 {

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public int field7011 = 0;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field7012 = 0;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lrv;B)V")
    public final void method2886(class120 arg0, byte arg1) {
        field7013++;
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                int var4 = 68 % ((-arg1 - 56) / 46);
                return;
            }
            this.method2887(var3, (byte) 104, arg0);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBLrv;)V")
    private final void method2887(int arg0, byte arg1, class120 arg2) {
        field7014++;
        int var4 = 14 % ((arg1 - 12) / 55);
        if (arg0 == 5) {
            this.field7011 = arg2.method898((byte) -78);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static final void method2888(int arg0) {
        class645.field9089 = arg0;
    }
}
