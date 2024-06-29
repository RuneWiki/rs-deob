import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class159 extends class185 {

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[B")
    public byte[] field1859;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Z")
    public boolean field1861;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lik;)Lve;")
    public final class159 method1017(class451 arg0) {
        this.field1859 = arg0.method2788(-24533, this.field1859);
        this.field1860 = arg0.method2796(this.field1860, -106);
        if (this.field1863 == this.field1862) {
            this.field1862 = this.field1863 = arg0.method2797(false, this.field1862);
        } else {
            this.field1862 = arg0.method2797(false, this.field1862);
            this.field1863 = arg0.method2797(false, this.field1863);
            if (this.field1863 == this.field1862) {
                this.field1862--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I[BII)V")
    public class159(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1860 = arg0;
        this.field1859 = arg1;
        this.field1862 = arg2;
        this.field1863 = arg3;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I[BIIZ)V")
    public class159(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1860 = arg0;
        this.field1859 = arg1;
        this.field1862 = arg2;
        this.field1863 = arg3;
        this.field1861 = arg4;
    }
}
