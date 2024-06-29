import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class66 extends class411 {

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    private int field813 = 0;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "Leba;")
    public static class550 field815 = new class550(22, -1);

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method374(boolean arg0, byte arg1) {
        ++field816;
        int var3 = super.field5401.field9876.method3139((byte) -128, super.field5411.method523(), class666.field9479) + super.field5401.field9880;
        int var4 = super.field5401.field9882.method1697(-108, super.field5411.method532(), class399.field5293) + super.field5401.field9881;
        if (arg1 <= -85) {
            super.field5411.method2989((float) (var3 - -(super.field5411.method523() / 2)), (float) (var4 + super.field5411.method532() / 2), 4096, this.field813);
            this.field813 += ((class302) super.field5401).field3996;
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lga;Lpda;)V", line = 21)
    public class66(class332 arg0, class302 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V", line = 30)
    public static void method375(int arg0) {
        if (arg0 != 0) {
            field815 = null;
        }
        field815 = null;
    }
}
