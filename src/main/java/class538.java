import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class538 extends class441 {

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public int field7694;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "[B")
    public byte[] field7695;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public int field7693;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public int field7692;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "Z")
    public boolean field7696;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lgaa;)Lso;", line = 3)
    public final class538 method3159(class68 arg0) {
        this.field7695 = arg0.method647(false, this.field7695);
        this.field7694 = arg0.method649(this.field7694, false);
        if (this.field7693 == this.field7692) {
            this.field7693 = this.field7692 = arg0.method648(20965, this.field7693);
        } else {
            this.field7693 = arg0.method648(20965, this.field7693);
            this.field7692 = arg0.method648(20965, this.field7692);
            if (this.field7693 == this.field7692) {
                this.field7693--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class538(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field7694 = arg0;
        this.field7695 = arg1;
        this.field7693 = arg2;
        this.field7692 = arg3;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class538(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field7694 = arg0;
        this.field7695 = arg1;
        this.field7693 = arg2;
        this.field7692 = arg3;
        this.field7696 = arg4;
    }
}
