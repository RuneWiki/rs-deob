import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class586 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!si", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7986++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)[Ltu;")
    public static final class369[] method3366(boolean arg0) {
        field7987++;
        if (!arg0) {
            method3367(-62, 86, null, (byte) -115);
        }
        return new class369[] { class778.field10745, class111.field1404, class187.field2260 };
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II[BB)[B")
    public static final byte[] method3367(int arg0, int arg1, byte[] arg2, byte arg3) {
        field7984++;
        if (arg3 == 63) {
            byte[] var4 = new byte[arg1];
            class211.method1330(arg2, arg0, var4, 0, arg1);
            return var4;
        } else {
            return null;
        }
    }
}
