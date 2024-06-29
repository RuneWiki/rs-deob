import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class237 {

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "B")
    public byte field3045;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "S")
    public short field3036;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "S")
    public short field3040;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "S")
    public short field3039;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Z")
    public boolean field3037;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "Lpaa;")
    public static class317 field3041 = new class317(5, 17);

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    public static int field3044 = 0;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public static void method1490(int arg0) {
        field3041 = null;
        if (arg0 != 5) {
            field3044 = -67;
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3038 = arg2;
        this.field3047 = arg0;
        this.field3046 = arg11;
        this.field3043 = arg1;
        this.field3045 = (byte) arg8;
        this.field3036 = (short) arg5;
        this.field3042 = arg3;
        this.field3040 = (short) arg4;
        this.field3039 = (short) arg6;
        this.field3037 = arg10;
    }
}
