import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class84 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
    public static int[] field1231 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lgi;")
    public static class310 field1228;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lg;")
    public static class68 field1230;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
    public static int[] field1225;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[Lpa;")
    public static class163[] field1229;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 15)
    public static final void method636(byte arg0) {
        field1227++;
        if (arg0 < 45) {
            method637(-45);
        }
        class298.field4586.method750((byte) 119);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 32)
    public static void method637(int arg0) {
        field1231 = null;
        field1228 = null;
        field1225 = null;
        field1230 = null;
        field1229 = null;
        if (arg0 < 14) {
            method636((byte) 18);
        }
    }
}
