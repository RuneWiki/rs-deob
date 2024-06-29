import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class29 extends class102 {

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[B")
    public byte[] field572;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lt;)Led;", line = 4)
    public final class29 method263(class109 arg0) {
        this.field572 = arg0.method851(-4, this.field572);
        this.field571 = arg0.method849(94, this.field571);
        if (this.field574 == this.field573) {
            this.field574 = this.field573 = arg0.method848(this.field574, 120);
        } else {
            this.field574 = arg0.method848(this.field574, 125);
            this.field573 = arg0.method848(this.field573, 122);
            if (this.field574 == this.field573) {
                this.field574--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class29(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field571 = arg0;
        this.field572 = arg1;
        this.field574 = arg2;
        this.field573 = arg3;
    }
}
