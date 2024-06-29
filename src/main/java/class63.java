import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class63 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1033 = "Loaded input handler";

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method445(String arg0, int arg1) {
        field1031++;
        if (arg1 != -19136) {
            return -77;
        } else if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class239.field3875; var2++) {
                if (arg0.equalsIgnoreCase(class86.field1379[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)[B")
    public abstract byte[] method446(int arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method447(long arg0, int arg1) {
        int var3 = 75 / ((80 - arg1) / 35);
        field1034++;
        return class141.method979(arg0, (byte) -78);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([BZ)V")
    public abstract void method448(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method449(byte arg0) {
        field1033 = null;
        int var1 = -41 / ((arg0 + 35) / 52);
    }
}
