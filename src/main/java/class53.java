import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TSSAWEFF")
public class class53 {

    @OriginalMember(owner = "TSSAWEFF", name = "a", descriptor = "J")
    public long field1326;

    @OriginalMember(owner = "TSSAWEFF", name = "b", descriptor = "LTSSAWEFF;")
    public class53 field1327;

    @OriginalMember(owner = "TSSAWEFF", name = "c", descriptor = "LTSSAWEFF;")
    public class53 field1328;

    @OriginalMember(owner = "TSSAWEFF", name = "d", descriptor = "Z")
    public static boolean field1329;

    @OriginalMember(owner = "TSSAWEFF", name = "a", descriptor = "()V")
    public void method492() {
        if (this.field1328 != null) {
            this.field1328.field1327 = this.field1327;
            this.field1327.field1328 = this.field1328;
            this.field1327 = null;
            this.field1328 = null;
        }
    }
}
