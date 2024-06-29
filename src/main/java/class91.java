import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class91 extends class591 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lbb;")
    public class196 field1336;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Leda;")
    public static class116 field1340 = new class116(8, 2);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[I")
    public static int[] field1341;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 3)
    public static void method674(byte arg0) {
        field1341 = null;
        field1340 = null;
        if (arg0 != 47) {
            field1337 = -122;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z", line = 15)
    public static final boolean method675(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1341 = null;
        }
        field1338++;
        return false;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lkfa;II[B)V", line = 30)
    public class91(class382 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1336 = class16.method195(6406, arg1, (byte) -27, 6406, arg0, arg2, false, arg3);
        this.field1336.method3379((byte) 102, false, false);
    }
}
