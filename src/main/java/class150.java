import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class150 extends class34 {

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[B")
    public byte[] field2510;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public int field2508;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Z")
    public boolean field2511;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lsd;)Lee;")
    public final class150 method972(class38 arg0) {
        this.field2510 = arg0.method277((byte) -25, this.field2510);
        this.field2509 = arg0.method275(0, this.field2509);
        if (this.field2512 == this.field2508) {
            this.field2508 = this.field2512 = arg0.method280(20952, this.field2508);
        } else {
            this.field2508 = arg0.method280(20952, this.field2508);
            this.field2512 = arg0.method280(20952, this.field2512);
            if (this.field2512 == this.field2508) {
                this.field2508--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I[BII)V")
    public class150(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2509 = arg0;
        this.field2510 = arg1;
        this.field2508 = arg2;
        this.field2512 = arg3;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I[BIIZ)V")
    public class150(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2509 = arg0;
        this.field2510 = arg1;
        this.field2508 = arg2;
        this.field2512 = arg3;
        this.field2511 = arg4;
    }
}
