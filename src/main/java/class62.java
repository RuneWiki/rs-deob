import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class62 extends class428 {

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "J")
    public long field794;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)I")
    public final int method375(int arg0) {
        if (arg0 < 108) {
            this.method377(83);
        }
        return this.field792;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
    public final int method376(byte arg0) {
        if (arg0 != -29) {
            this.method375(9);
        }
        return this.field793;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)I")
    public final int method377(int arg0) {
        int var2 = 31 % ((arg0 + 12) / 53);
        return this.field790;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)J")
    public final long method378(byte arg0) {
        int var2 = 25 % ((-arg0 - 26) / 54);
        return this.field794;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)I")
    public final int method379(boolean arg0) {
        return arg0 ? this.field791 : 31;
    }
}
