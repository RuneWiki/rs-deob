import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class80 extends class82 {

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "[B")
    public byte[] field1112;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Z")
    public boolean field1113;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Las;)Lhh;", line = 5)
    public final class80 method518(class100 arg0) {
        this.field1112 = arg0.method602(this.field1112, (byte) -116);
        this.field1114 = arg0.method600(-14, this.field1114);
        if (this.field1116 == this.field1115) {
            this.field1116 = this.field1115 = arg0.method607(63, this.field1116);
        } else {
            this.field1116 = arg0.method607(-126, this.field1116);
            this.field1115 = arg0.method607(124, this.field1115);
            if (this.field1116 == this.field1115) {
                this.field1116--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class80(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1114 = arg0;
        this.field1112 = arg1;
        this.field1116 = arg2;
        this.field1115 = arg3;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class80(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1114 = arg0;
        this.field1112 = arg1;
        this.field1116 = arg2;
        this.field1115 = arg3;
        this.field1113 = arg4;
    }
}
