import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class26 extends class125 {

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[B")
    public byte[] field429;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Z")
    public boolean field425;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lra;)Lda;", line = 4)
    public final class26 method190(class40 arg0) {
        this.field429 = arg0.method284(this.field429, 6);
        this.field428 = arg0.method286(false, this.field428);
        if (this.field427 == this.field426) {
            this.field426 = this.field427 = arg0.method285((byte) 101, this.field426);
        } else {
            this.field426 = arg0.method285((byte) 82, this.field426);
            this.field427 = arg0.method285((byte) 110, this.field427);
            if (this.field427 == this.field426) {
                this.field426--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class26(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field428 = arg0;
        this.field429 = arg1;
        this.field426 = arg2;
        this.field427 = arg3;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class26(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field428 = arg0;
        this.field429 = arg1;
        this.field426 = arg2;
        this.field427 = arg3;
        this.field425 = arg4;
    }
}
