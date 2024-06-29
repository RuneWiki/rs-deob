import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZZBPVHZB")
public class class72 {

    @OriginalMember(owner = "client!ZZBPVHZB", name = "a", descriptor = "J")
    public long field1734;

    @OriginalMember(owner = "client!ZZBPVHZB", name = "b", descriptor = "LZZBPVHZB;")
    public class72 field1735;

    @OriginalMember(owner = "client!ZZBPVHZB", name = "c", descriptor = "LZZBPVHZB;")
    public class72 field1736;

    @OriginalMember(owner = "client!ZZBPVHZB", name = "d", descriptor = "Z")
    public static boolean field1737;

    @OriginalMember(owner = "client!ZZBPVHZB", name = "a", descriptor = "()V")
    public void method591() {
        if (this.field1736 != null) {
            this.field1736.field1735 = this.field1735;
            this.field1735.field1736 = this.field1736;
            this.field1735 = null;
            this.field1736 = null;
        }
    }
}
