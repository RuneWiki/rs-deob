import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class542 extends class191 {

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public int field7961;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public int field7962;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public int field7963;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public int field7965;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "J")
    public long field7964;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I", line = 4)
    public final int method1301(byte arg0) {
        return arg0 == 39 ? this.field7963 : 14;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)I", line = 18)
    public final int method1302(int arg0) {
        return arg0 == -6 ? this.field7962 : 125;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)J", line = 28)
    public final long method1303(byte arg0) {
        if (arg0 <= 124) {
            this.field7962 = 67;
        }
        return this.field7964;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I", line = 38)
    public final int method1300(int arg0) {
        if (arg0 != 0) {
            this.method1302(83);
        }
        return this.field7965;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(B)I", line = 48)
    public final int method1305(byte arg0) {
        return arg0 == 126 ? this.field7961 : 12;
    }
}
