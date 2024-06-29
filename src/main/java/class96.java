import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class96 extends class578 {

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "[B")
    public byte[] field1342;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "[Z")
    public static boolean[] field1339 = new boolean[8];

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "[S")
    public static short[] field1344 = new short[256];

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method698(int arg0, int arg1, int arg2) {
        field1341++;
        if (arg2 != 256) {
            method698(-40, 57, -101);
        }
        return (arg1 & 0x60000) != 0 | class671.method3790(-1, arg1, arg0) || class66.method559(arg1, arg0, false) || class14.method70(arg0, 28, arg1);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Ljava/lang/String;", line = 17)
    public static final String method699(byte arg0) {
        field1340++;
        if (class541.field7327 || class84.field1244 == null) {
            return "";
        } else {
            int var1 = 16 / ((arg0 + 39) / 43);
            return class84.field1244.field6778;
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V", line = 30)
    public static void method700(int arg0) {
        if (arg0 != -16332) {
            method699((byte) -6);
        }
        field1339 = null;
        field1344 = null;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "([B)V", line = 43)
    public class96(byte[] arg0) {
        this.field1342 = arg0;
    }
}
