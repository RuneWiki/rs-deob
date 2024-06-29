import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZUOIJLRD")
public class Linkable {

    @OriginalMember(owner = "client!ZUOIJLRD", name = "a", descriptor = "J")
    public long field1769;

    @OriginalMember(owner = "client!ZUOIJLRD", name = "b", descriptor = "LZUOIJLRD;")
    public Linkable field1770;

    @OriginalMember(owner = "client!ZUOIJLRD", name = "c", descriptor = "LZUOIJLRD;")
    public Linkable field1771;

    @OriginalMember(owner = "client!ZUOIJLRD", name = "d", descriptor = "Z")
    public static boolean field1772;

    @OriginalMember(owner = "client!ZUOIJLRD", name = "a", descriptor = "()V")
    public void method604() {
        if (this.field1771 != null) {
            this.field1771.field1770 = this.field1770;
            this.field1770.field1771 = this.field1771;
            this.field1770 = null;
            this.field1771 = null;
        }
    }
}
