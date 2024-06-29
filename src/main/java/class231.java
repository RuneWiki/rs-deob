import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class231 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljd;")
    public static class85 field3988 = class221.method1499("Eingabeprozedur geladen)3", (byte) -74);

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[I")
    public static int[] field3993 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[Ljd;")
    public static class85[] field3990;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static void method1545(boolean arg0) {
        field3993 = null;
        field3988 = null;
        if (!arg0) {
            field3990 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
    public static final int method1546(int arg0, int arg1) {
        field3991++;
        return arg0 == -8959 ? arg1 & 0x7F : -54;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1547(int arg0, int arg1, int arg2, long arg3) {
        class208 var5 = class99.field1780[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3656 != null && var5.field3656.field4028 == arg3) {
            return true;
        } else if (var5.field3641 != null && var5.field3641.field4751 == arg3) {
            return true;
        } else if (var5.field3653 != null && var5.field3653.field1708 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3646; var6++) {
                if (var5.field3650[var6].field3728 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZB)V")
    public static final void method1548(boolean arg0, byte arg1) {
        if (arg1 != 127) {
            field3990 = null;
        }
        class74.method522(class129.field2267, arg1 - 126, class154.field2664, arg0, class154.field2662);
        field3989++;
    }
}
