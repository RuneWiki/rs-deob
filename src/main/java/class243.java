import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class243 extends class205 {

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3692 = "Loading world list data";

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "F")
    public static float field3695 = 0.0F;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "B")
    public byte field3697;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "Lwm;")
    public class254 field3694;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "Lkj;")
    public static class256 field3700;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)I", line = 8)
    public final int method1481(boolean arg0) {
        if (arg0) {
            method1680(-74, -60);
        }
        field3698++;
        return this.field3694 == null ? 0 : this.field3694.field3866 * 100 / (this.field3694.field3840.length - this.field3697);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 23)
    public static void method1679(int arg0) {
        field3692 = null;
        field3700 = null;
        if (arg0 != -1344) {
            method1680(62, -95);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)[B", line = 37)
    public final byte[] method1477(byte arg0) {
        field3699++;
        if (this.field3139 || this.field3694.field3840.length - this.field3697 > this.field3694.field3866) {
            throw new RuntimeException();
        } else if (arg0 == -9) {
            return this.field3694.field3840;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V", line = 59)
    public static final void method1680(int arg0, int arg1) {
        field3690++;
        class305.field4723.method741(arg0, (byte) 123);
        if (arg1 >= -103) {
            field3700 = (class256) null;
        }
    }
}
