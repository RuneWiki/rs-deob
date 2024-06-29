import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class612 extends class453 {

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
    public int field8695;

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "I")
    public int field8696;

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
    public int field8697;

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
    public int field8698;

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "J")
    public long field8699;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(B)I")
    public final int method1872(byte arg0) {
        int var2 = 92 % ((arg0 + 71) / 41);
        return this.field8697;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)I")
    public final int method1873(int arg0) {
        int var2 = 118 / ((arg0 + 60) / 33);
        return this.field8698;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)I")
    public final int method1869(byte arg0) {
        int var2 = 127 % ((67 - arg0) / 54);
        return this.field8695;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)J")
    public final long method1871(byte arg0) {
        if (arg0 != -126) {
            this.method1871((byte) -62);
        }
        return this.field8699;
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)I")
    public final int method1868(byte arg0) {
        int var2 = 38 / ((17 - arg0) / 40);
        return this.field8696;
    }
}
