import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class564 extends class597 {

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Lau;")
    public static class692 field8239 = new class692(64);

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Lwu;")
    public static class149 field8245 = new class149(4);

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "[I")
    public static int[] field8246 = new int[5];

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field8248 = 0;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "Lnb;")
    public static class318 field8247 = new class318("WTRC", 1);

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "Z")
    public static boolean field8249 = false;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public int field8242;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Lnr;")
    public class19 field8244;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "Lfa;")
    public static class615 field8243;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "[B")
    public byte[] field8241;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V", line = 3)
    public static void method3255(byte arg0) {
        field8239 = null;
        field8243 = null;
        field8247 = null;
        field8245 = null;
        field8246 = null;
        if (arg0 != -71) {
            field8243 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)I", line = 24)
    public final int method2646(int arg0) {
        if (arg0 != 15862) {
            return -57;
        } else {
            ++field8240;
            return super.field8640 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)[B", line = 38)
    public final byte[] method2648(int arg0) {
        ++field8238;
        if (arg0 <= 36) {
            this.method2646(-28);
        }
        if (super.field8640) {
            throw new RuntimeException();
        } else {
            return this.field8241;
        }
    }
}
