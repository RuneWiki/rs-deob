import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class261 extends class86 {

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "[B")
    public byte[] field3726;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field3728 = -1;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lgn;")
    public static class475 field3725 = new class475(42, 8);

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final void method1615(int arg0) {
        class378.field5657 = new class262(class499.field7639.method1220(arg0 ^ 0xB85, class81.field1122), "", class450.field6553, 1007, -1, 0L, 0, 0, true, false);
        if (arg0 != 28) {
            method1616((byte) 22);
        }
        field3729++;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)V")
    public static void method1616(byte arg0) {
        int var1 = 75 % ((36 - arg0) / 38);
        field3725 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([B)V")
    public class261(byte[] arg0) {
        this.field3726 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public static final void method1617(int arg0) {
        if (arg0 != -31395) {
            return;
        }
        field3724++;
        if (class44.field659.toLowerCase().indexOf("microsoft") != -1) {
            class467.field6752[187] = 27;
            class467.field6752[188] = 71;
            class467.field6752[222] = 59;
            class467.field6752[221] = 43;
            class467.field6752[189] = 26;
            class467.field6752[186] = 57;
            class467.field6752[192] = 58;
            class467.field6752[190] = 72;
            class467.field6752[220] = 74;
            class467.field6752[223] = 28;
            class467.field6752[219] = 42;
            class467.field6752[191] = 73;
            return;
        }
        class467.field6752[91] = 42;
        class467.field6752[61] = 27;
        class467.field6752[93] = 43;
        if (class44.field674 == null) {
            class467.field6752[192] = 58;
            class467.field6752[222] = 59;
        } else {
            class467.field6752[520] = 59;
            class467.field6752[192] = 28;
            class467.field6752[222] = 58;
        }
        class467.field6752[59] = 57;
        class467.field6752[47] = 73;
        class467.field6752[45] = 26;
        class467.field6752[46] = 72;
        class467.field6752[44] = 71;
        class467.field6752[92] = 74;
    }
}
