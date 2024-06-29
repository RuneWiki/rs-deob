import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class569 extends class101 {

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public int field7581;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public int field7582;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lmga;")
    public static class739 field7580 = new class739(80, 8);

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Laj;")
    public static class333 field7583;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 4)
    public static void method3188(int arg0) {
        field7583 = null;
        field7580 = null;
        if (arg0 <= 111) {
            field7583 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lvh;I)V", line = 16)
    public static final void method3189(class381 arg0, int arg1) {
        arg0.field5562 = null;
        field7584++;
        if (class492.field6822 < 20) {
            class220.field2967.method106(arg0, (byte) 119);
            class492.field6822++;
        }
        int var2 = -22 % ((arg1 + 74) / 35);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BZ)[B", line = 34)
    public static final byte[] method3190(int arg0, byte[] arg1, boolean arg2) {
        field7579++;
        byte[] var3 = new byte[arg0];
        if (!arg2) {
            field7580 = null;
        }
        class278.method1796(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V", line = 51)
    public class569(int arg0, int arg1) {
        this.field7581 = arg1;
        this.field7582 = arg0;
    }
}
