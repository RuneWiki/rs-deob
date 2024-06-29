import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class352 extends class665 {

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public volatile int field5075 = -1;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field5076;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "S")
    public static short field5074 = 256;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lnea;")
    public static class664 field5073 = new class664(35, 7);

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Lmn;")
    public static class333 field5077;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2161(int arg0, boolean arg1, int arg2) {
        field5078++;
        if (!class302.method1936(arg2, arg0, 0)) {
            return false;
        } else if ((arg0 & 0xB000) != 0 | class518.method2960(arg2, (byte) -37, arg0) | class695.method3875(arg0, 256, arg2)) {
            return true;
        } else if (arg1) {
            return (arg2 & 0x37) == 0 & (class334.method2106(119, arg2, arg0) | class678.method3762(arg2, 95, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method2162(int arg0) {
        field5073 = null;
        int var1 = 57 % ((-arg0 - 76) / 34);
        field5077 = null;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class352(String arg0) {
        this.field5076 = arg0;
    }
}
