import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class504 {

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "Lpn;")
    public static class49 field7321 = new class49(29, 0);

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field7324 = -1;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Lnv;")
    public static class44 field7322 = new class44();

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "F")
    public static float field7323;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "[B")
    public byte[] field7319;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "[S")
    public short[] field7315;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "[S")
    public short[] field7318;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[S")
    public short[] field7320;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 3)
    public static void method3003(int arg0) {
        field7322 = null;
        if (arg0 != 29) {
            method3004(68, -19, true);
        }
        field7321 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIZ)V", line = 18)
    public static final void method3004(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field7317++;
            class188 var3 = class10.method48((byte) 83, 12, arg0);
            var3.method1308(arg2);
            var3.field2873 = arg1;
        }
    }
}
