import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class390 extends class648 {

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "Lsr;")
    public static class228 field5465 = new class228();

    @OriginalMember(owner = "client!ifa", name = "D", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!ifa", name = "I", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "Lfo;")
    public class476 field5468;

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "[B")
    public byte[] field5469;

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "[B")
    public static byte[] field5470;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(Z)[B", line = 3)
    public final byte[] method2239(boolean arg0) {
        ++field5466;
        if (!arg0) {
            return null;
        } else if (super.field9187) {
            throw new RuntimeException();
        } else {
            return this.field5469;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "(I)V", line = 22)
    public static void method2240(int arg0) {
        field5465 = null;
        field5470 = null;
        if (arg0 != 0) {
            method2240(-6);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)I", line = 36)
    public final int method2241(int arg0) {
        if (arg0 != 100) {
            this.field5469 = null;
        }
        ++field5471;
        return super.field9187 ? 0 : 100;
    }
}
