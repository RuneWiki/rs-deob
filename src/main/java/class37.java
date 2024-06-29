import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class37 extends class103 {

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "J")
    public long field380;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I", line = 7)
    public final int method192(int arg0) {
        if (arg0 != -58) {
            this.field376 = -23;
        }
        return this.field376;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)I", line = 17)
    public final int method193(byte arg0) {
        if (arg0 >= -53) {
            this.field376 = 48;
        }
        return this.field379;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)I", line = 27)
    public final int method194(byte arg0) {
        if (arg0 != -106) {
            this.field379 = -112;
        }
        return this.field377;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)J", line = 38)
    public final long method195(boolean arg0) {
        return arg0 ? 25L : this.field380;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)I", line = 48)
    public final int method196(byte arg0) {
        if (arg0 != 49) {
            this.method193((byte) 3);
        }
        return this.field378;
    }
}
