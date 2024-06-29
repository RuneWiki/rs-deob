import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class410 extends class674 {

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field5850;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public int field5851;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public int field5852;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public int field5853;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "J")
    public long field5854;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I", line = 5)
    public final int method2571(boolean arg0) {
        if (!arg0) {
            this.method2572(-62);
        }
        return this.field5851;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)I", line = 16)
    public final int method2572(int arg0) {
        return arg0 == 12122 ? this.field5850 : -37;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I", line = 26)
    public final int method2573(byte arg0) {
        if (arg0 != -111) {
            this.method2572(64);
        }
        return this.field5853;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)I", line = 36)
    public final int method2574(byte arg0) {
        if (arg0 != 2) {
            this.method2573((byte) -9);
        }
        return this.field5852;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)J", line = 46)
    public final long method2575(byte arg0) {
        return arg0 >= -13 ? 49L : this.field5854;
    }
}
