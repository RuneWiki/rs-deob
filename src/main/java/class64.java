import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WYQNTERC")
public class class64 {

    @OriginalMember(owner = "WYQNTERC", name = "a", descriptor = "J")
    public long field1587;

    @OriginalMember(owner = "WYQNTERC", name = "b", descriptor = "LWYQNTERC;")
    public class64 field1588;

    @OriginalMember(owner = "WYQNTERC", name = "c", descriptor = "LWYQNTERC;")
    public class64 field1589;

    @OriginalMember(owner = "WYQNTERC", name = "d", descriptor = "Z")
    public static boolean field1590;

    @OriginalMember(owner = "WYQNTERC", name = "a", descriptor = "()V")
    public void method540() {
        if (this.field1589 != null) {
            this.field1589.field1588 = this.field1588;
            this.field1588.field1589 = this.field1589;
            this.field1588 = null;
            this.field1589 = null;
        }
    }
}
