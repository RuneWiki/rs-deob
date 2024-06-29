import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OGGHOMII")
public class class33 extends class4 {

    @OriginalMember(owner = "client!OGGHOMII", name = "e", descriptor = "I")
    private int field1176 = -7597;

    @OriginalMember(owner = "client!OGGHOMII", name = "h", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!OGGHOMII", name = "f", descriptor = "LOGGHOMII;")
    public class33 field1177;

    @OriginalMember(owner = "client!OGGHOMII", name = "g", descriptor = "LOGGHOMII;")
    public class33 field1178;

    @OriginalMember(owner = "client!OGGHOMII", name = "b", descriptor = "()V")
    public void method384() {
        if (this.field1178 != null) {
            this.field1178.field1177 = this.field1177;
            this.field1177.field1178 = this.field1178;
            this.field1177 = null;
            this.field1178 = null;
        }
    }
}
