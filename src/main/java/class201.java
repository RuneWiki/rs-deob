import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public abstract class class201 extends class143 {

    @OriginalMember(owner = "client!hv", name = "H", descriptor = "Z")
    public volatile boolean field3107 = true;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "Lis;")
    public static class101 field3101 = null;

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "[I")
    public static int[] field3104 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
    public static int field3102 = 2;

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "Z")
    public boolean field3100;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "Z")
    public boolean field3103;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "(B)V", line = 5)
    public static void method1399(byte arg0) {
        if (arg0 != 74) {
            field3104 = null;
        }
        field3104 = null;
        field3101 = null;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)Ljava/lang/String;", line = 34)
    public static final String method1401(int arg0) {
        field3106++;
        if (class324.field4519 || class354.field4954 == null) {
            return "";
        } else {
            if (arg0 < 15) {
                field3104 = null;
            }
            return class354.field4954.field9542;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1400(int arg0);

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)I")
    public abstract int method1402(int arg0);
}
