import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class321 extends class301 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "[B")
    public byte[] field5282;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Z")
    public boolean field5281;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lfk;)Lpc;", line = 3)
    public final class321 method2307(class314 arg0) {
        this.field5282 = arg0.method2257(-32768, this.field5282);
        this.field5280 = arg0.method2255((byte) -110, this.field5280);
        if (this.field5283 == this.field5279) {
            this.field5283 = this.field5279 = arg0.method2260(22011, this.field5283);
        } else {
            this.field5283 = arg0.method2260(22011, this.field5283);
            this.field5279 = arg0.method2260(22011, this.field5279);
            if (this.field5283 == this.field5279) {
                this.field5283--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class321(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5280 = arg0;
        this.field5282 = arg1;
        this.field5283 = arg2;
        this.field5279 = arg3;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class321(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5280 = arg0;
        this.field5282 = arg1;
        this.field5283 = arg2;
        this.field5279 = arg3;
        this.field5281 = arg4;
    }
}
