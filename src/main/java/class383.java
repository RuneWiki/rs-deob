import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class383 extends class65 {

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "[B")
    public byte[] field5470;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
    public boolean field5469;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lhr;)Lbc;")
    public final class383 method2349(class549 arg0) {
        this.field5470 = arg0.method3187(this.field5470, -123);
        this.field5468 = arg0.method3186((byte) -126, this.field5468);
        if (this.field5467 == this.field5466) {
            this.field5467 = this.field5466 = arg0.method3190(this.field5467, 113);
        } else {
            this.field5467 = arg0.method3190(this.field5467, 123);
            this.field5466 = arg0.method3190(this.field5466, 125);
            if (this.field5467 == this.field5466) {
                this.field5467--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I[BII)V")
    public class383(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5468 = arg0;
        this.field5470 = arg1;
        this.field5467 = arg2;
        this.field5466 = arg3;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class383(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5468 = arg0;
        this.field5470 = arg1;
        this.field5467 = arg2;
        this.field5466 = arg3;
        this.field5469 = arg4;
    }
}
