import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class20 extends class54 {

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "[B")
    public byte[] field504;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Z")
    public boolean field503;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lcc;)Lda;", line = 3)
    public final class20 method226(class16 arg0) {
        this.field504 = arg0.method175(this.field504, 27285);
        this.field506 = arg0.method171(this.field506, -44);
        if (this.field505 == this.field502) {
            this.field505 = this.field502 = arg0.method176(this.field505, 126);
        } else {
            this.field505 = arg0.method176(this.field505, 124);
            this.field502 = arg0.method176(this.field502, 124);
            if (this.field505 == this.field502) {
                this.field505--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class20(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field506 = arg0;
        this.field504 = arg1;
        this.field505 = arg2;
        this.field502 = arg3;
    }
}
