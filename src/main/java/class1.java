import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AGCGSOQI")
public class class1 extends class29 {

    @OriginalMember(owner = "AGCGSOQI", name = "e", descriptor = "B")
    private byte field1 = 8;

    @OriginalMember(owner = "AGCGSOQI", name = "h", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "AGCGSOQI", name = "f", descriptor = "LAGCGSOQI;")
    public class1 field2;

    @OriginalMember(owner = "AGCGSOQI", name = "g", descriptor = "LAGCGSOQI;")
    public class1 field3;

    @OriginalMember(owner = "AGCGSOQI", name = "b", descriptor = "()V")
    public void method1() {
        if (this.field3 != null) {
            this.field3.field2 = this.field2;
            this.field2.field3 = this.field3;
            this.field2 = null;
            this.field3 = null;
        }
    }
}
