import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class52 extends class43 {

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "[B")
    public byte[] field504;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "Z")
    public boolean field506;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lld;)Lwo;")
    public final class52 method250(class116 arg0) {
        this.field504 = arg0.method627(-128, this.field504);
        this.field508 = arg0.method631(true, this.field508);
        if (this.field507 == this.field505) {
            this.field507 = this.field505 = arg0.method624(-120, this.field507);
        } else {
            this.field507 = arg0.method624(-112, this.field507);
            this.field505 = arg0.method624(-125, this.field505);
            if (this.field507 == this.field505) {
                this.field507--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[BII)V")
    public class52(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field508 = arg0;
        this.field504 = arg1;
        this.field507 = arg2;
        this.field505 = arg3;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[BIIZ)V")
    public class52(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field508 = arg0;
        this.field504 = arg1;
        this.field507 = arg2;
        this.field505 = arg3;
        this.field506 = arg4;
    }
}
