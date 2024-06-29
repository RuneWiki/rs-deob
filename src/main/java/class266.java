import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class266 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4570 = 0;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lcd;")
    public static class64 field4573 = class44.method335((byte) 71, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field4576;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "[[[I")
    public static int[][][] field4571;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1860(int arg0) {
        int var2 = -35 / ((-arg0 - 77) / 37);
        field4577++;
        return (this.field4567 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 26)
    public static void method1861(byte arg0) {
        if (arg0 != -27) {
            field4570 = 97;
        }
        field4571 = (int[][][]) null;
        field4573 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)Z", line = 41)
    public final boolean method1862(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field4569++;
            return (this.field4567 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z", line = 67)
    public final boolean method1863(int arg0) {
        if (arg0 != 343) {
            this.method1864((byte) -106);
        }
        field4575++;
        return (this.field4567 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)Z", line = 81)
    public final boolean method1864(byte arg0) {
        if (arg0 < 3) {
            return false;
        } else {
            field4568++;
            return (this.field4567 & 0x1) != 0;
        }
    }
}
