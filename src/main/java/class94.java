import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("k")
public class class94 extends class25 {

    @OriginalMember(owner = "k", name = "s", descriptor = "I")
    public int field1931;

    @OriginalMember(owner = "k", name = "q", descriptor = "[B")
    public byte[] field1929;

    @OriginalMember(owner = "k", name = "p", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "k", name = "r", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "k", name = "o", descriptor = "Z")
    public boolean field1927;

    @OriginalMember(owner = "k", name = "a", descriptor = "(Lpa;)Lk;")
    public final class94 method680(class140 arg0) {
        this.field1929 = arg0.method1004(25709, this.field1929);
        this.field1931 = arg0.method1005(-23741, this.field1931);
        if (this.field1930 == this.field1928) {
            this.field1928 = this.field1930 = arg0.method1001((byte) 63, this.field1928);
        } else {
            this.field1928 = arg0.method1001((byte) 63, this.field1928);
            this.field1930 = arg0.method1001((byte) 63, this.field1930);
            if (this.field1930 == this.field1928) {
                this.field1928--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "k", name = "<init>", descriptor = "(I[BII)V")
    public class94(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1931 = arg0;
        this.field1929 = arg1;
        this.field1928 = arg2;
        this.field1930 = arg3;
    }

    @OriginalMember(owner = "k", name = "<init>", descriptor = "(I[BIIZ)V")
    public class94(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1931 = arg0;
        this.field1929 = arg1;
        this.field1928 = arg2;
        this.field1930 = arg3;
        this.field1927 = arg4;
    }
}
