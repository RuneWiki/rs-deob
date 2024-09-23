import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OYTUMBCI")
public class class38 {

    @OriginalMember(owner = "OYTUMBCI", name = "a", descriptor = "Z")
    private boolean field1217 = false;

    @OriginalMember(owner = "OYTUMBCI", name = "b", descriptor = "J")
    public long field1218;

    @OriginalMember(owner = "OYTUMBCI", name = "c", descriptor = "LOYTUMBCI;")
    public class38 field1219;

    @OriginalMember(owner = "OYTUMBCI", name = "d", descriptor = "LOYTUMBCI;")
    public class38 field1220;

    @OriginalMember(owner = "OYTUMBCI", name = "e", descriptor = "Z")
    public static boolean field1221;

    @OriginalMember(owner = "OYTUMBCI", name = "a", descriptor = "()V")
    public void method367() {
        if (this.field1220 != null) {
            this.field1220.field1219 = this.field1219;
            this.field1219.field1220 = this.field1220;
            this.field1219 = null;
            this.field1220 = null;
        }
    }
}
