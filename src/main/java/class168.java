import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class168 extends class43 {

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "[B")
    public byte[] field2339;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
    public boolean field2342;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lud;)Lpb;", line = 6)
    public final class168 method1249(class280 arg0) {
        this.field2339 = arg0.method1888((byte) -63, this.field2339);
        this.field2341 = arg0.method1885(this.field2341, (byte) -127);
        if (this.field2343 == this.field2340) {
            this.field2340 = this.field2343 = arg0.method1886(-125, this.field2340);
        } else {
            this.field2340 = arg0.method1886(-126, this.field2340);
            this.field2343 = arg0.method1886(-125, this.field2343);
            if (this.field2343 == this.field2340) {
                this.field2340--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class168(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2341 = arg0;
        this.field2339 = arg1;
        this.field2340 = arg2;
        this.field2343 = arg3;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class168(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2341 = arg0;
        this.field2339 = arg1;
        this.field2340 = arg2;
        this.field2343 = arg3;
        this.field2342 = arg4;
    }
}
