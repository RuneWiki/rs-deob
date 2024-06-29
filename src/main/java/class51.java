import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class22 {

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[B")
    public byte[] field1064;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Z")
    public boolean field1063;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lpc;)Lhb;")
    public final class51 method430(class107 arg0) {
        this.field1064 = arg0.method867(24, this.field1064);
        this.field1065 = arg0.method866(1, this.field1065);
        if (this.field1062 == this.field1061) {
            this.field1062 = this.field1061 = arg0.method863(this.field1062, true);
        } else {
            this.field1062 = arg0.method863(this.field1062, true);
            this.field1061 = arg0.method863(this.field1061, true);
            if (this.field1062 == this.field1061) {
                this.field1062--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[BII)V")
    public class51(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1065 = arg0;
        this.field1064 = arg1;
        this.field1062 = arg2;
        this.field1061 = arg3;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[BIIZ)V")
    public class51(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1065 = arg0;
        this.field1064 = arg1;
        this.field1062 = arg2;
        this.field1061 = arg3;
        this.field1063 = arg4;
    }
}
