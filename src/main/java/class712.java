import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class712 {

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    public int field9641;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "I")
    public int field9642;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "I")
    public int field9648;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public int field9644;

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "B")
    public byte field9649;

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "Z")
    public boolean field9651;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "S")
    public short field9645;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public int field9643;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "S")
    public short field9647;

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "S")
    public short field9650;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "[I")
    public static int[] field9646 = null;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V", line = 16)
    public static void method3952(byte arg0) {
        field9646 = null;
        if (arg0 != 17) {
            field9646 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 28)
    public class712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9641 = arg1;
        this.field9642 = arg3;
        this.field9648 = arg2;
        this.field9644 = arg11;
        this.field9649 = (byte) arg8;
        this.field9651 = arg10;
        this.field9645 = (short) arg4;
        this.field9643 = arg0;
        this.field9647 = (short) arg6;
        this.field9650 = (short) arg5;
    }
}
