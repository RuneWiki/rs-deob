import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class231 {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lab;")
    public static class269 field3842 = new class269();

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z")
    public final boolean method1646(int arg0) {
        field3840++;
        if (arg0 != 4) {
            this.method1647(60);
        }
        return (this.field3844 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z")
    public final boolean method1647(int arg0) {
        int var2 = 12 % ((arg0 + 57) / 45);
        field3845++;
        return (this.field3844 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Z")
    public final boolean method1648(byte arg0) {
        field3841++;
        if (arg0 != 82) {
            method1649(false);
        }
        return (this.field3844 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method1649(boolean arg0) {
        field3842 = null;
        if (arg0) {
            field3848 = 89;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)Z")
    public final boolean method1650(byte arg0) {
        if (arg0 == -121) {
            field3847++;
            return (this.field3844 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
