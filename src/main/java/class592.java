import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class592 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "S")
    public short field7949;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "B")
    public byte field7947;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "B")
    public byte field7953;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "S")
    public short field7950;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public int field7954;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "S")
    public short field7952;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Z")
    public boolean field7955;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field7948 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZII)Ljk;", line = 12)
    public final class592 method3279(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            field7951++;
            return new class592(arg4, arg0, arg1, arg3, this.field7950, this.field7952, this.field7949, this.field7947, this.field7953, this.field7955);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 35)
    public class592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field7949 = (short) arg6;
        this.field7947 = (byte) arg7;
        this.field7953 = (byte) arg8;
        this.field7950 = (short) arg4;
        this.field7954 = arg0;
        this.field7952 = (short) arg5;
        this.field7955 = arg9;
    }
}
