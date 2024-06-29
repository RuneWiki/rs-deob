import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class79 extends class189 {

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "[B")
    public byte[] field1887;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Z")
    public boolean field1886;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lic;)Lih;")
    public final class79 method677(class75 arg0) {
        this.field1887 = arg0.method595(-122, this.field1887);
        this.field1885 = arg0.method594(this.field1885, -49);
        if (this.field1889 == this.field1888) {
            this.field1888 = this.field1889 = arg0.method593(this.field1888, (byte) -17);
        } else {
            this.field1888 = arg0.method593(this.field1888, (byte) -17);
            this.field1889 = arg0.method593(this.field1889, (byte) -17);
            if (this.field1889 == this.field1888) {
                this.field1888--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I[BII)V")
    public class79(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1885 = arg0;
        this.field1887 = arg1;
        this.field1888 = arg2;
        this.field1889 = arg3;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I[BIIZ)V")
    public class79(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1885 = arg0;
        this.field1887 = arg1;
        this.field1888 = arg2;
        this.field1889 = arg3;
        this.field1886 = arg4;
    }
}
