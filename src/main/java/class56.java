import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class56 extends class262 {

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field1000 = 0;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "Loh;")
    public static class15 field998;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "[I")
    public static int[] field994;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 10)
    public static void method448(boolean arg0) {
        if (!arg0) {
            field999 = -37;
        }
        field998 = null;
        field994 = null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V", line = 33)
    public static final void method449(int arg0, int arg1) {
        field995++;
        class158 var2 = class206.method1564(arg0, arg1, arg1 ^ 0xFFFFFF80);
        var2.method1238(-73);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 44)
    public class56() {
        super(0, true);
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V", line = 53)
    public static final void method450(int arg0) {
        if (arg0 != 5) {
            field994 = (int[]) null;
        }
        class245.field4052.method793((byte) -78);
        class187.field3108.method793((byte) -94);
        field996++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I", line = 68)
    public final int[] method38(int arg0, byte arg1) {
        field993++;
        if (arg1 >= -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 108);
        if (this.field4350.field3333) {
            class244.method1767(var3, 0, class98.field1598, class312.field5326[arg0]);
        }
        return var3;
    }
}
