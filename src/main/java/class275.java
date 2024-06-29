import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class275 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3728 = 0;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field3730 = 64;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lrh;")
    public class144 field3732;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
    public static int[] field3727;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    public int[] field3729;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(CIZ)I", line = 3)
    public static final int method1688(char arg0, int arg1, boolean arg2) {
        field3731++;
        int var3 = arg0 << 4;
        if (arg2) {
            return 65;
        }
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Liq;Lqj;Lqj;B)V", line = 31)
    public static final void method1689(class360 arg0, class296 arg1, class296 arg2, byte arg3) {
        class20.field255 = arg0;
        field3733++;
        class401.field5849 = arg2;
        class141.field2008 = arg1;
        if (class141.field2008 != null) {
            class366.field5135 = class141.field2008.method1911(arg3 ^ 0x13, 1);
        }
        if (arg3 != 19) {
            method1691(39, 76);
        }
        if (class401.field5849 != null) {
            class31.field489 = class401.field5849.method1911(0, 1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 51)
    public static void method1690(int arg0) {
        field3727 = null;
        if (arg0 != 1762) {
            method1689((class360) null, (class296) null, (class296) null, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V", line = 80)
    public static final void method1691(int arg0, int arg1) {
        if (arg0 != 1437815908) {
            method1689((class360) null, (class296) null, (class296) null, (byte) 91);
        }
        field3734++;
        class240.field3335.method1254(arg1, 122);
        class167.field2391.method1254(arg1, arg0 - 1437815786);
    }
}
