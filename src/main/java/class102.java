import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class102 {

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public int field1721 = 0;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "B")
    public static byte field1717;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Ltl;")
    public static class197 field1713;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lph;")
    public static class71 field1719;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[Lve;")
    public static class255[] field1718;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 11)
    public static void method788(boolean arg0) {
        field1718 = null;
        if (!arg0) {
            method788(true);
        }
        field1719 = null;
        field1713 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLpb;)V", line = 40)
    public final void method789(byte arg0, class70 arg1) {
        if (arg0 <= 117) {
            return;
        }
        field1716++;
        while (true) {
            int var3 = arg1.method481(0);
            if (var3 == 0) {
                return;
            }
            this.method790(arg1, (byte) -27, var3);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lpb;BI)V", line = 66)
    private final void method790(class70 arg0, byte arg1, int arg2) {
        field1714++;
        int var4 = -109 / ((64 - arg1) / 59);
        if (arg2 == 5) {
            this.field1721 = arg0.method423(255);
        }
    }
}
