import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class65 {

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[B")
    public byte[] field169;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Z")
    public boolean field171;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lai;)Lwe;")
    public final class15 method109(class88 arg0) {
        this.field169 = arg0.method666(0, this.field169);
        this.field170 = arg0.method664(97, this.field170);
        if (this.field173 == this.field172) {
            this.field172 = this.field173 = arg0.method669(6, this.field172);
        } else {
            this.field172 = arg0.method669(6, this.field172);
            this.field173 = arg0.method669(6, this.field173);
            if (this.field173 == this.field172) {
                this.field172--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I[BII)V")
    public class15(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field170 = arg0;
        this.field169 = arg1;
        this.field172 = arg2;
        this.field173 = arg3;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I[BIIZ)V")
    public class15(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field170 = arg0;
        this.field169 = arg1;
        this.field172 = arg2;
        this.field173 = arg3;
        this.field171 = arg4;
    }
}
