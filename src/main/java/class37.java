import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OEHUIBBM")
public class class37 {

    @OriginalMember(owner = "OEHUIBBM", name = "a", descriptor = "I")
    private int field1079 = 49110;

    @OriginalMember(owner = "OEHUIBBM", name = "b", descriptor = "J")
    public long field1080;

    @OriginalMember(owner = "OEHUIBBM", name = "c", descriptor = "LOEHUIBBM;")
    public class37 field1081;

    @OriginalMember(owner = "OEHUIBBM", name = "d", descriptor = "LOEHUIBBM;")
    public class37 field1082;

    @OriginalMember(owner = "OEHUIBBM", name = "e", descriptor = "Z")
    public static boolean field1083;

    @OriginalMember(owner = "OEHUIBBM", name = "a", descriptor = "()V")
    public void method397() {
        if (this.field1082 != null) {
            this.field1082.field1081 = this.field1081;
            this.field1081.field1082 = this.field1082;
            this.field1081 = null;
            this.field1082 = null;
        }
    }
}
