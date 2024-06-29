import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OZZFMONJ")
public class class42 extends class7 {

    @OriginalMember(owner = "client!OZZFMONJ", name = "e", descriptor = "I")
    private int field1300 = 697;

    @OriginalMember(owner = "client!OZZFMONJ", name = "h", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!OZZFMONJ", name = "f", descriptor = "LOZZFMONJ;")
    public class42 field1301;

    @OriginalMember(owner = "client!OZZFMONJ", name = "g", descriptor = "LOZZFMONJ;")
    public class42 field1302;

    @OriginalMember(owner = "client!OZZFMONJ", name = "b", descriptor = "()V")
    public void method371() {
        if (this.field1302 != null) {
            this.field1302.field1301 = this.field1301;
            this.field1301.field1302 = this.field1302;
            this.field1301 = null;
            this.field1302 = null;
        }
    }
}
