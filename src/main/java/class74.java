import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class118 {

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "[B")
    public byte[] field1745;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Z")
    public boolean field1743;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lhc;)Lke;")
    public final class74 method597(class52 arg0) {
        this.field1745 = arg0.method397((byte) -101, this.field1745);
        this.field1741 = arg0.method401(this.field1741, (byte) 120);
        if (this.field1744 == this.field1742) {
            this.field1742 = this.field1744 = arg0.method402(-109, this.field1742);
        } else {
            this.field1742 = arg0.method402(-97, this.field1742);
            this.field1744 = arg0.method402(-118, this.field1744);
            if (this.field1744 == this.field1742) {
                this.field1742--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BII)V")
    public class74(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1741 = arg0;
        this.field1745 = arg1;
        this.field1742 = arg2;
        this.field1744 = arg3;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BIIZ)V")
    public class74(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1741 = arg0;
        this.field1745 = arg1;
        this.field1742 = arg2;
        this.field1744 = arg3;
        this.field1743 = arg4;
    }
}
