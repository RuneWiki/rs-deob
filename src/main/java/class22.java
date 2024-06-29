import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 {

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "[S")
    public static short[] field307 = new short[] { 13, 22, 16, 25, 49, 21, 47, 2 };

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static void method135(int arg0) {
        if (arg0 != -1) {
            method135(56);
        }
        field307 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI)B")
    public static final byte method136(int arg0, byte arg1, int arg2) {
        int var3 = 124 % ((arg1 - 49) / 43);
        field305++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
