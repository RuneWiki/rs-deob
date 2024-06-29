import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class171 extends class169 {

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "[B")
    public byte[] field3220;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Z")
    public boolean field3224;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lcc;)Lqc;")
    public final class171 method1087(class25 arg0) {
        this.field3220 = arg0.method223(this.field3220, (byte) 75);
        this.field3222 = arg0.method221(this.field3222, 452313488);
        if (this.field3223 == this.field3221) {
            this.field3223 = this.field3221 = arg0.method220(65536, this.field3223);
        } else {
            this.field3223 = arg0.method220(65536, this.field3223);
            this.field3221 = arg0.method220(65536, this.field3221);
            if (this.field3223 == this.field3221) {
                this.field3223--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[BII)V")
    public class171(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3222 = arg0;
        this.field3220 = arg1;
        this.field3223 = arg2;
        this.field3221 = arg3;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class171(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3222 = arg0;
        this.field3220 = arg1;
        this.field3223 = arg2;
        this.field3221 = arg3;
        this.field3224 = arg4;
    }
}
