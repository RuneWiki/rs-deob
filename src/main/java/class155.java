import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class155 extends class338 {

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "[B")
    public byte[] field1995;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Z")
    public boolean field1993;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ltg;)Lib;")
    public final class155 method947(class233 arg0) {
        this.field1995 = arg0.method1392(true, this.field1995);
        this.field1991 = arg0.method1393(this.field1991, 1);
        if (this.field1994 == this.field1992) {
            this.field1994 = this.field1992 = arg0.method1388(6, this.field1994);
        } else {
            this.field1994 = arg0.method1388(6, this.field1994);
            this.field1992 = arg0.method1388(6, this.field1992);
            if (this.field1994 == this.field1992) {
                this.field1994--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[BII)V")
    public class155(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1991 = arg0;
        this.field1995 = arg1;
        this.field1994 = arg2;
        this.field1992 = arg3;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[BIIZ)V")
    public class155(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1991 = arg0;
        this.field1995 = arg1;
        this.field1994 = arg2;
        this.field1992 = arg3;
        this.field1993 = arg4;
    }
}
