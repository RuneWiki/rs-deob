import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class78 extends class288 {

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "[B")
    public byte[] field1084;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "Z")
    public boolean field1081;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Llt;)Lpv;", line = 7)
    public final class78 method631(class702 arg0) {
        this.field1084 = arg0.method3830(-7977, this.field1084);
        this.field1082 = arg0.method3833(this.field1082, true);
        if (this.field1083 == this.field1080) {
            this.field1083 = this.field1080 = arg0.method3834(this.field1083, (byte) -100);
        } else {
            this.field1083 = arg0.method3834(this.field1083, (byte) 102);
            this.field1080 = arg0.method3834(this.field1080, (byte) -105);
            if (this.field1083 == this.field1080) {
                this.field1083--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class78(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1082 = arg0;
        this.field1084 = arg1;
        this.field1083 = arg2;
        this.field1080 = arg3;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class78(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1082 = arg0;
        this.field1084 = arg1;
        this.field1083 = arg2;
        this.field1080 = arg3;
        this.field1081 = arg4;
    }
}
