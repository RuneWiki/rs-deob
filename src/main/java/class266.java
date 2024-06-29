import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class266 extends class227 {

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[B")
    public byte[] field4153;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Z")
    public boolean field4152;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lca;)Lid;", line = 4)
    public final class266 method1898(class131 arg0) {
        this.field4153 = arg0.method966(27, this.field4153);
        this.field4150 = arg0.method968(this.field4150, (byte) -128);
        if (this.field4151 == this.field4149) {
            this.field4149 = this.field4151 = arg0.method972((byte) 89, this.field4149);
        } else {
            this.field4149 = arg0.method972((byte) 125, this.field4149);
            this.field4151 = arg0.method972((byte) 82, this.field4151);
            if (this.field4151 == this.field4149) {
                this.field4149--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class266(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4150 = arg0;
        this.field4153 = arg1;
        this.field4149 = arg2;
        this.field4151 = arg3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class266(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4150 = arg0;
        this.field4153 = arg1;
        this.field4149 = arg2;
        this.field4151 = arg3;
        this.field4152 = arg4;
    }
}
