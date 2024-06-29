import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class120 extends class682 {

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "J")
    public long field1518;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)I", line = 6)
    public final int method1084(int arg0) {
        if (arg0 != 128) {
            this.field1520 = 39;
        }
        return this.field1520;
    }

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)J", line = 16)
    public final long method1085(int arg0) {
        return arg0 == -6709 ? this.field1518 : 51L;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)I", line = 28)
    public final int method1086(byte arg0) {
        int var2 = 45 % ((60 - arg0) / 63);
        return this.field1517;
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)I", line = 36)
    public final int method1087(int arg0) {
        return arg0 == 24700 ? this.field1519 : -110;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)I", line = 47)
    public final int method1088(int arg0) {
        return arg0 == -6 ? this.field1516 : 45;
    }
}
