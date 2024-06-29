import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class83 {

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Z")
    public static boolean field1242 = false;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!di", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field1245++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)I", line = 12)
    public static final int method652(boolean arg0) {
        if (arg0) {
            method652(true);
        }
        field1243++;
        if ((double) class350.field5117 == 3.0D) {
            return 37;
        } else if ((double) class350.field5117 == 4.0D) {
            return 50;
        } else if ((double) class350.field5117 == 6.0D) {
            return 75;
        } else if ((double) class350.field5117 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I", line = 48)
    public final int method653(byte arg0) {
        field1244++;
        if (arg0 != -13) {
            this.method653((byte) 16);
        }
        return this.field1246;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(II)V", line = 59)
    public class83(int arg0, int arg1) {
        this.field1246 = arg0;
    }
}
