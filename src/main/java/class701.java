import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class701 extends class19 {

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public int field9477;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public int field9479;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public int field9480;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public int field9481;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "J")
    public long field9478;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)I", line = 4)
    public final int method145(int arg0) {
        return arg0 < 50 ? 113 : this.field9480;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)J", line = 15)
    public final long method147(byte arg0) {
        if (arg0 > -79) {
            this.method143((byte) -8);
        }
        return this.field9478;
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)I", line = 27)
    public final int method146(int arg0) {
        int var2 = 48 % ((arg0 + 61) / 40);
        return this.field9477;
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(I)I", line = 37)
    public final int method150(int arg0) {
        return arg0 == 0 ? this.field9479 : 57;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I", line = 48)
    public final int method143(byte arg0) {
        return arg0 >= -126 ? -80 : this.field9481;
    }
}
