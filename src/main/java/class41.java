import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QEPVMESX")
public class class41 {

    @OriginalMember(owner = "client!QEPVMESX", name = "a", descriptor = "Z")
    private boolean field1191 = false;

    @OriginalMember(owner = "client!QEPVMESX", name = "b", descriptor = "J")
    public long field1192;

    @OriginalMember(owner = "client!QEPVMESX", name = "c", descriptor = "LQEPVMESX;")
    public class41 field1193;

    @OriginalMember(owner = "client!QEPVMESX", name = "d", descriptor = "LQEPVMESX;")
    public class41 field1194;

    @OriginalMember(owner = "client!QEPVMESX", name = "e", descriptor = "Z")
    public static boolean field1195;

    @OriginalMember(owner = "client!QEPVMESX", name = "a", descriptor = "()V")
    public void method418() {
        if (this.field1194 != null) {
            this.field1194.field1193 = this.field1193;
            this.field1193.field1194 = this.field1194;
            this.field1193 = null;
            this.field1194 = null;
        }
    }
}
