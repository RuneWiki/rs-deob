import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class50 {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lhc;")
    public static class368 field637 = new class368("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lvg;")
    public static class108 field640 = null;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lae;", line = 4)
    public static final class277 method407(int arg0) {
        field636++;
        if (class85.field1193.length > class419.field5817) {
            return class85.field1193[class419.field5817++];
        } else {
            int var1 = 59 / ((-arg0 - 12) / 58);
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)I", line = 19)
    public static final int method408(int arg0, int arg1, int arg2, int arg3) {
        field639++;
        if (arg3 != 16) {
            method407(-95);
        }
        if (class436.field6160 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class11.field107 - 1 || (class264.field3620 - 1) < var5) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class302.field4122[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class436.field6160[var6].method331(arg1, arg2);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V", line = 48)
    public static final void method409(int arg0, int arg1) {
        field635++;
        if (arg1 != -20243) {
            method411(75, (byte) -63);
        }
        class26 var2 = class217.method1445(true, arg0, 16);
        var2.method164(12);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 71)
    public static void method410(int arg0) {
        field637 = null;
        field640 = null;
        if (arg0 != -1) {
            method407(29);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V", line = 84)
    public static final void method411(int arg0, byte arg1) {
        if (arg1 == 112) {
            field634++;
            class26 var2 = class217.method1445(true, arg0, 11);
            var2.method164(12);
        }
    }
}
