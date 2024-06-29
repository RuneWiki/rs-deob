import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class381 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
    public static int[] field5513 = new int[5];

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lao;")
    public static class191 field5516 = new class191(78, 2);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Ld;")
    public static class104 field5520 = null;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field5519 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lfq;")
    public static class137 field5518;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2327(int arg0) {
        class48.field530 = class47.method267(35, arg0, true, 4, 8, (byte) -42, 0.4F, 8);
        field5515++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 18)
    public static void method2328(boolean arg0) {
        field5520 = null;
        field5518 = null;
        if (!arg0) {
            method2330(true, 84, -37);
        }
        field5516 = null;
        field5513 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method2329(int arg0, int arg1, int arg2) {
        if (arg2 >= -64) {
            return false;
        } else {
            field5514++;
            return class93.method520(-81, arg0, arg1) | (arg1 & 0x70000) != 0 || class317.method1891(arg1, (byte) 68, arg0);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)Z", line = 48)
    public static final boolean method2330(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return true;
        } else {
            field5517++;
            return (class252.field3358[1][arg2][arg1] & 0x2) != 0;
        }
    }
}
