import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class469 extends class730 {

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
    public int field6551;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    public int field6552;

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
    public int field6553;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
    public int field6555;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "J")
    public long field6554;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)J", line = 5)
    public final long method1938(int arg0) {
        int var2 = 32 % ((arg0 + 34) / 32);
        return this.field6554;
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)I", line = 17)
    public final int method1937(int arg0) {
        int var2 = -90 / ((32 - arg0) / 39);
        return this.field6553;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)I", line = 26)
    public final int method1944(byte arg0) {
        if (arg0 < 114) {
            this.method1944((byte) -30);
        }
        return this.field6552;
    }

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)I", line = 37)
    public final int method1936(int arg0) {
        return arg0 == -564899352 ? this.field6551 : 19;
    }

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "(I)I", line = 49)
    public final int method1941(int arg0) {
        if (arg0 != 65280) {
            this.field6551 = -67;
        }
        return this.field6555;
    }
}
