import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class534 extends class382 {

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public int field7702;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[B")
    public byte[] field7704;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public int field7701;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field7703;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Z")
    public boolean field7700;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lsn;)Lte;")
    public final class534 method3117(class547 arg0) {
        this.field7704 = arg0.method3182((byte) -75, this.field7704);
        this.field7702 = arg0.method3185(this.field7702, -22221);
        if (this.field7703 == this.field7701) {
            this.field7701 = this.field7703 = arg0.method3183(this.field7701, 2);
        } else {
            this.field7701 = arg0.method3183(this.field7701, 2);
            this.field7703 = arg0.method3183(this.field7703, 2);
            if (this.field7703 == this.field7701) {
                this.field7701--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I[BII)V")
    public class534(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field7702 = arg0;
        this.field7704 = arg1;
        this.field7701 = arg2;
        this.field7703 = arg3;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I[BIIZ)V")
    public class534(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field7702 = arg0;
        this.field7704 = arg1;
        this.field7701 = arg2;
        this.field7703 = arg3;
        this.field7700 = arg4;
    }
}
