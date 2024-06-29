import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class402 implements class409 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ltu;")
    private class366 field5693;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Laba;")
    public static class185 field5694 = new class185();

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field5697 = -1;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lke;")
    public static class622 field5696 = new class622(1, 3);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public final void method811(boolean arg0) {
        if (arg0) {
            this.method374(true, (byte) 81);
        }
        field5691++;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ltu;)V")
    public class402(class366 arg0) {
        this.field5693 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
    public final void method374(boolean arg0, byte arg1) {
        if (arg1 != -105) {
            field5697 = -89;
        }
        field5692++;
        if (arg0) {
            class638.field8979.method474(0, 0, class638.field8980, class512.field7325, this.field5693.field5279, 0);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method2430(int arg0) {
        field5694 = null;
        field5696 = null;
        if (arg0 != 3) {
            field5697 = 118;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        int var2 = -63 % ((-arg0 - 65) / 37);
        field5695++;
        return true;
    }
}
