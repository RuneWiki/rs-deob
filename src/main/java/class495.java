import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class495 extends class458 {

    @OriginalMember(owner = "client!iba", name = "m", descriptor = "I")
    public int field6652;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "I")
    public int field6653;

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "I")
    public int field6654;

    @OriginalMember(owner = "client!iba", name = "q", descriptor = "I")
    public int field6656;

    @OriginalMember(owner = "client!iba", name = "p", descriptor = "J")
    public long field6655;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I", line = 4)
    public final int method1650(int arg0) {
        if (arg0 != 0) {
            this.method1654((byte) -51);
        }
        return this.field6652;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(B)I", line = 14)
    public final int method1654(byte arg0) {
        if (arg0 != 96) {
            this.field6652 = 87;
        }
        return this.field6656;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)I", line = 28)
    public final int method1655(byte arg0) {
        if (arg0 != 29) {
            this.field6653 = 85;
        }
        return this.field6654;
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(B)J", line = 38)
    public final long method1651(byte arg0) {
        return arg0 < 79 ? 63L : this.field6655;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)I", line = 48)
    public final int method1649(int arg0) {
        return arg0 == -20210 ? this.field6653 : 8;
    }
}
