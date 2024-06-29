import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class371 {

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "B")
    public byte field5627;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Z")
    public boolean field5628;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "S")
    public short field5633;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public int field5631;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "S")
    public short field5630;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "S")
    public short field5626;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "B")
    public byte field5629;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5624 = 100;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Ltm;")
    public static class334 field5625 = new class334(70, 1);

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "Lla;")
    public static class422 field5635;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "Z")
    public static boolean field5634;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2365(int arg0) {
        class26.field267 = arg0;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 22)
    public static void method2366(int arg0) {
        if (arg0 != 1) {
            field5634 = true;
        }
        field5635 = null;
        field5625 = null;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 40)
    public class371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field5627 = (byte) arg8;
        this.field5628 = arg9;
        this.field5633 = (short) arg4;
        this.field5632 = arg0;
        this.field5631 = arg10;
        this.field5630 = (short) arg6;
        this.field5626 = (short) arg5;
        this.field5629 = (byte) arg7;
    }
}
