import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class635 {

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Lba;")
    public static class607 field9234 = new class607(16);

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Lim;")
    public static class353 field9235 = new class353(102, -1);

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "[B")
    public static byte[] field9236 = new byte[2048];

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
    public static void method3668(byte arg0) {
        if (arg0 <= 47) {
            method3668((byte) -83);
        }
        field9234 = null;
        field9235 = null;
        field9236 = null;
    }

    @OriginalMember(owner = "client!gn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9233++;
        throw new IllegalStateException();
    }
}
