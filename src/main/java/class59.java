import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class59 extends class32 {

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "J")
    public long field1062;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
    public final int method325(int arg0) {
        return arg0 == -19995 ? this.field1063 : -5;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)I")
    public final int method323(boolean arg0) {
        if (arg0) {
            this.method328((byte) 101);
        }
        return this.field1060;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)J")
    public final long method329(int arg0) {
        return arg0 == 120 ? this.field1062 : 2L;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
    public final int method324(int arg0) {
        if (arg0 != -5) {
            this.method325(-88);
        }
        return this.field1061;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
    public final int method328(byte arg0) {
        return arg0 >= -99 ? 71 : this.field1059;
    }
}
