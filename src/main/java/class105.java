import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class105 extends class310 {

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "[B")
    public byte[] field1804;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Z")
    public boolean field1806;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lnk;)Luk;")
    public final class105 method818(class300 arg0) {
        this.field1804 = arg0.method2049(0, this.field1804);
        this.field1807 = arg0.method2051(false, this.field1807);
        if (this.field1805 == this.field1803) {
            this.field1803 = this.field1805 = arg0.method2047(this.field1803, 72);
        } else {
            this.field1803 = arg0.method2047(this.field1803, 124);
            this.field1805 = arg0.method2047(this.field1805, 47);
            if (this.field1805 == this.field1803) {
                this.field1803--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I[BII)V")
    public class105(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1807 = arg0;
        this.field1804 = arg1;
        this.field1803 = arg2;
        this.field1805 = arg3;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I[BIIZ)V")
    public class105(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1807 = arg0;
        this.field1804 = arg1;
        this.field1803 = arg2;
        this.field1805 = arg3;
        this.field1806 = arg4;
    }
}
