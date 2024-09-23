import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TLIWLEHU")
public class class54 {

    @OriginalMember(owner = "TLIWLEHU", name = "a", descriptor = "Z")
    private boolean field1468 = false;

    @OriginalMember(owner = "TLIWLEHU", name = "b", descriptor = "J")
    public long field1469;

    @OriginalMember(owner = "TLIWLEHU", name = "c", descriptor = "LTLIWLEHU;")
    public class54 field1470;

    @OriginalMember(owner = "TLIWLEHU", name = "d", descriptor = "LTLIWLEHU;")
    public class54 field1471;

    @OriginalMember(owner = "TLIWLEHU", name = "e", descriptor = "Z")
    public static boolean field1472;

    @OriginalMember(owner = "TLIWLEHU", name = "a", descriptor = "()V")
    public void method471() {
        if (this.field1471 != null) {
            this.field1471.field1470 = this.field1470;
            this.field1470.field1471 = this.field1471;
            this.field1470 = null;
            this.field1471 = null;
        }
    }
}
