import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class145 extends class466 {

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "J")
    public long field2301;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)J", line = 4)
    public final long method1096(int arg0) {
        return arg0 == 0 ? this.field2301 : 78L;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)I", line = 17)
    public final int method1097(int arg0) {
        if (arg0 != 19702) {
            this.method1100(-71);
        }
        return this.field2300;
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)I", line = 29)
    public final int method1098(int arg0) {
        return arg0 == -15204 ? this.field2299 : -4;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I", line = 40)
    public final int method1099(byte arg0) {
        int var2 = -39 % ((arg0 - 61) / 59);
        return this.field2298;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)I", line = 49)
    public final int method1100(int arg0) {
        int var2 = -40 / ((-arg0 - 70) / 55);
        return this.field2302;
    }
}
