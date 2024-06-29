import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class110 extends class219 {

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "[B")
    public byte[] field1808;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
    public boolean field1807;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbi;)Lh;", line = 9)
    public final class110 method840(class73 arg0) {
        this.field1808 = arg0.method616(32768, this.field1808);
        this.field1809 = arg0.method615(this.field1809, false);
        if (this.field1806 == this.field1805) {
            this.field1806 = this.field1805 = arg0.method617((byte) 93, this.field1806);
        } else {
            this.field1806 = arg0.method617((byte) 115, this.field1806);
            this.field1805 = arg0.method617((byte) 94, this.field1805);
            if (this.field1806 == this.field1805) {
                this.field1806--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class110(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1809 = arg0;
        this.field1808 = arg1;
        this.field1806 = arg2;
        this.field1805 = arg3;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class110(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1809 = arg0;
        this.field1808 = arg1;
        this.field1806 = arg2;
        this.field1805 = arg3;
        this.field1807 = arg4;
    }
}
