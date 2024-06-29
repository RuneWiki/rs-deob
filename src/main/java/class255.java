import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class255 extends class12 {

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "J")
    public long field3508;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(B)J", line = 4)
    public final long method68(byte arg0) {
        if (arg0 != -47) {
            this.field3510 = 19;
        }
        return this.field3508;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)I", line = 16)
    public final int method67(byte arg0) {
        int var2 = 110 / ((arg0 - 21) / 43);
        return this.field3507;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)I", line = 25)
    public final int method64(int arg0) {
        if (arg0 != -1) {
            this.field3509 = 1;
        }
        return this.field3510;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)I", line = 37)
    public final int method63(int arg0) {
        return arg0 == 5245 ? this.field3506 : 122;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)I", line = 47)
    public final int method62(byte arg0) {
        return arg0 >= -26 ? 28 : this.field3509;
    }
}
