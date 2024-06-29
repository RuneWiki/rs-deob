import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class348 extends class790 {

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "[B")
    public byte[] field5068;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public int field5066;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public int field5065;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Z")
    public boolean field5069;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lfc;)Lfk;", line = 8)
    public final class348 method2196(class641 arg0) {
        this.field5068 = arg0.method3682(0, this.field5068);
        this.field5067 = arg0.method3680(this.field5067, (byte) -128);
        if (this.field5066 == this.field5065) {
            this.field5066 = this.field5065 = arg0.method3683(-107, this.field5066);
        } else {
            this.field5066 = arg0.method3683(-102, this.field5066);
            this.field5065 = arg0.method3683(-92, this.field5065);
            if (this.field5066 == this.field5065) {
                this.field5066--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class348(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5067 = arg0;
        this.field5068 = arg1;
        this.field5066 = arg2;
        this.field5065 = arg3;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class348(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5067 = arg0;
        this.field5068 = arg1;
        this.field5066 = arg2;
        this.field5065 = arg3;
        this.field5069 = arg4;
    }
}
