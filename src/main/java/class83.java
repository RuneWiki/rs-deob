import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class83 extends class77 {

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "[B")
    public byte[] field1783;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Z")
    public boolean field1784;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ld;)Ljc;")
    public final class83 method558(class28 arg0) {
        this.field1783 = arg0.method216(this.field1783, (byte) -60);
        this.field1786 = arg0.method212(true, this.field1786);
        if (this.field1785 == this.field1782) {
            this.field1785 = this.field1782 = arg0.method214(105, this.field1785);
        } else {
            this.field1785 = arg0.method214(87, this.field1785);
            this.field1782 = arg0.method214(70, this.field1782);
            if (this.field1785 == this.field1782) {
                this.field1785--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I[BII)V")
    public class83(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1786 = arg0;
        this.field1783 = arg1;
        this.field1785 = arg2;
        this.field1782 = arg3;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class83(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1786 = arg0;
        this.field1783 = arg1;
        this.field1785 = arg2;
        this.field1782 = arg3;
        this.field1784 = arg4;
    }
}
