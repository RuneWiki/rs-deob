import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class5 extends class305 {

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "[B")
    public byte[] field45;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "Z")
    public boolean field49;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lrm;)Lmca;")
    public final class5 method23(class104 arg0) {
        this.field45 = arg0.method600(this.field45, true);
        this.field46 = arg0.method601(this.field46, true);
        if (this.field48 == this.field47) {
            this.field48 = this.field47 = arg0.method602(this.field48, (byte) 96);
        } else {
            this.field48 = arg0.method602(this.field48, (byte) 39);
            this.field47 = arg0.method602(this.field47, (byte) 28);
            if (this.field48 == this.field47) {
                this.field48--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(I[BII)V")
    public class5(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field46 = arg0;
        this.field45 = arg1;
        this.field48 = arg2;
        this.field47 = arg3;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(I[BIIZ)V")
    public class5(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field46 = arg0;
        this.field45 = arg1;
        this.field48 = arg2;
        this.field47 = arg3;
        this.field49 = arg4;
    }
}
