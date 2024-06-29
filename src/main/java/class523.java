import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class523 {

    @OriginalMember(owner = "client!us", name = "b", descriptor = "S")
    public short field7746;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public int field7753;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public int field7758;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "B")
    public byte field7747;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "S")
    public short field7757;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "S")
    public short field7750;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "B")
    public byte field7754;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public int field7756;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public int field7751;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "Z")
    public boolean field7752;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public int field7745;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field7748 = 0;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "Lbj;")
    public static class440 field7755;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V")
    public static void method3091(boolean arg0) {
        if (!arg0) {
            method3091(true);
        }
        field7755 = null;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field7746 = (short) arg5;
        this.field7753 = arg0;
        this.field7758 = arg11;
        this.field7747 = (byte) arg7;
        this.field7757 = (short) arg4;
        this.field7750 = (short) arg6;
        this.field7754 = (byte) arg8;
        this.field7756 = arg2;
        this.field7751 = arg3;
        this.field7752 = arg10;
        this.field7745 = arg1;
    }
}
