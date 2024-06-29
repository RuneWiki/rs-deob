import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class52 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[Lel;")
    public static class77[] field936 = new class77[14];

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "J")
    public static volatile long field939 = 0L;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lic;")
    public static class160 field938 = new class160(200);

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field943 = 0;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
    public static int[] field944 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[S")
    public static short[] field945 = new short[256];

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Lsb;")
    public static class124 field942;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
    public static final int method434(int arg0) {
        field937++;
        if (class89.field1418) {
            return 0;
        }
        if (arg0 != -1176340616) {
            field943 = 70;
        }
        if (class9.method50(false)) {
            return class230.field3660 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method435(boolean arg0) {
        if (arg0) {
            return;
        }
        field944 = null;
        field945 = null;
        field938 = null;
        field942 = null;
        field936 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    public static final int method436(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
