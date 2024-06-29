import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class120 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lqj;")
    public static class196 field1733 = class80.method502("Fps:", -48);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Z")
    public static boolean field1736 = false;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field1737 = -1;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[Lsc;")
    public static class212[] field1732;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZJ)V")
    public static final void method745(boolean arg0, long arg1) {
        field1738++;
        if (arg1 == 0L) {
            return;
        }
        class85.field1252++;
        class44.field520.method1173(140, 14592);
        class44.field520.method346(arg1, (byte) 72);
        if (arg0) {
            field1733 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLbk;Lbk;)I")
    public static final int method746(byte arg0, class136 arg1, class136 arg2) {
        field1739++;
        int var3 = 0;
        if (arg2.method838((byte) 23, class189.field3310)) {
            var3++;
        }
        if (arg2.method838((byte) 23, class108.field1547)) {
            var3++;
        }
        if (arg2.method838((byte) 23, class214.field3829)) {
            var3++;
        }
        if (arg1.method838((byte) 23, class189.field3310)) {
            var3++;
        }
        if (arg1.method838((byte) 23, class108.field1547)) {
            var3++;
        }
        if (arg1.method838((byte) 23, class214.field3829)) {
            var3++;
        }
        if (arg0 >= -50) {
            field1734 = 44;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method747(boolean arg0) {
        if (!arg0) {
            field1732 = null;
            field1733 = null;
        }
    }
}
