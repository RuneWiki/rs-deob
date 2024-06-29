import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class300 {

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "[Lrr;")
    public static class361[] field3729;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method1771(int arg0, int arg1) {
        if (arg0 != -3163) {
            method1773(-22);
        }
        field3730++;
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lig;I)V", line = 17)
    public final void method1772(class244 arg0, int arg1) {
        field3728++;
        if (arg1 != 27696) {
            this.field3727 = -121;
        }
        while (true) {
            int var3 = arg0.method1423(arg1 ^ 0xFFFF93C3);
            if (var3 == 0) {
                return;
            }
            this.method1774(var3, 25706, arg0);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 40)
    public static final void method1773(int arg0) {
        class557.field7978 = null;
        field3731++;
        class327.field4243 = null;
        class126.field1322 = null;
        class309.field3842 = null;
        if (arg0 != -9) {
            return;
        }
        class675.field9564 = null;
        class743.field10379 = null;
        class525.field7490 = null;
        class286.field3511 = null;
        class22.field200 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILig;)V", line = 59)
    private final void method1774(int arg0, int arg1, class244 arg2) {
        if (arg0 == 1) {
            this.field3726 = arg2.method1476(123);
            this.field3727 = arg2.method1423(-58);
            this.field3725 = arg2.method1423(-57);
        }
        if (arg1 != 25706) {
            method1771(-84, 57);
        }
        field3732++;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 83)
    public static void method1775(int arg0) {
        field3729 = null;
        int var1 = 57 / ((-arg0 - 8) / 44);
    }
}
