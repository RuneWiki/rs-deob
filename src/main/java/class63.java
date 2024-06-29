import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class63 extends class76 {

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "[I")
    public static int[] field942 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "B")
    public byte field947;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "Lv;")
    public class152 field946;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "Lph;")
    public static class80 field940;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBII)V")
    public static final void method460(int arg0, byte arg1, int arg2, int arg3) {
        ++field939;
        class82.method597(false, -126);
        class10.field91 = arg0;
        class232.field3722 = arg3;
        if (arg1 == -41) {
            class207.method1518(arg2, arg1 ^ -42);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
    public final int method461(byte arg0) {
        if (arg0 < 51) {
            method460(122, (byte) 106, 31, 75);
        }
        ++field945;
        return this.field946 == null ? 0 : this.field946.field2511 * 100 / (this.field946.field2523.length + -this.field947);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)[B")
    public final byte[] method462(int arg0) {
        ++field943;
        if (!super.field1090 && ~this.field946.field2511 <= ~(this.field946.field2523.length - this.field947)) {
            if (arg0 != 1) {
                this.field946 = null;
            }
            return this.field946.field2523;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)V")
    public static void method463(int arg0) {
        if (arg0 > -115) {
            field940 = null;
        }
        field942 = null;
        field940 = null;
    }
}
