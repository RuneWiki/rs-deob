import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class315 extends class255 {

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "Lbd;")
    public static class37 field4951 = new class37();

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field4955 = new String[100];

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "[I")
    public static int[] field4954 = new int[4096];

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "B")
    public byte field4948;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public int field4953;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "Ljg;")
    public class186 field4949;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "Lbd;")
    public static class37 field4952;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "(I)[B")
    public final byte[] method814(int arg0) {
        ++field4950;
        if (arg0 != -30235) {
            this.method812(67);
        }
        if (!super.field4129 && ~(this.field4949.field3066.length + -this.field4948) >= ~this.field4949.field3044) {
            return this.field4949.field3066;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "(I)V")
    public static void method2103(int arg0) {
        field4951 = null;
        field4954 = null;
        field4952 = null;
        field4955 = null;
        if (arg0 <= 51) {
            method2103(24);
        }
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(I)I")
    public final int method812(int arg0) {
        ++field4947;
        int var2 = 101 % ((arg0 - 66) / 56);
        return this.field4949 == null ? 0 : this.field4949.field3044 * 100 / (this.field4949.field3066.length - this.field4948);
    }
}
