import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class161 extends class644 {

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "[B")
    public byte[] field2314;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Z")
    public boolean field2313;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lnp;)Lql;")
    public final class161 method993(class112 arg0) {
        this.field2314 = arg0.method664(this.field2314, (byte) 109);
        this.field2312 = arg0.method663((byte) 58, this.field2312);
        if (this.field2315 == this.field2311) {
            this.field2311 = this.field2315 = arg0.method661((byte) -100, this.field2311);
        } else {
            this.field2311 = arg0.method661((byte) -100, this.field2311);
            this.field2315 = arg0.method661((byte) -91, this.field2315);
            if (this.field2315 == this.field2311) {
                this.field2311--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I[BII)V")
    public class161(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2312 = arg0;
        this.field2314 = arg1;
        this.field2311 = arg2;
        this.field2315 = arg3;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I[BIIZ)V")
    public class161(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2312 = arg0;
        this.field2314 = arg1;
        this.field2311 = arg2;
        this.field2315 = arg3;
        this.field2313 = arg4;
    }
}
