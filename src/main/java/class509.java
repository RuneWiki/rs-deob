import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class509 {

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    private int field7451;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field7450;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Luq;")
    public static class114 field7449 = null;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Lqu;")
    public static class65 field7452 = new class65(0, 2, 2, 1);

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "[I")
    public static int[] field7456 = new int[13];

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "Lob;")
    public static class521 field7455 = new class521(81, 8);

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Lob;")
    public static class521 field7457;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field7454;

    static {
        new class234("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field7457 = new class521(74, 7);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)I", line = 3)
    public final int method3031(boolean arg0) {
        field7453++;
        return arg0 ? -50 : this.field7451;
    }

    @OriginalMember(owner = "client!hn", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        field7447++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V", line = 25)
    public static final void method3032(boolean arg0) {
        field7448++;
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class407.field6059[var1] = false;
        }
        class197.field3290 = 0;
        class490.field7052 = class475.field6854;
        class360.field5346 = -1;
        class424.field6315 = class412.field6180;
        class334.field4989 = class473.field6831;
        class335.field4996 = class419.field6263;
        class412.field6175 = 0;
        class176.field2611 = 5;
        class239.field3826 = class396.field5932;
        class368.field5409 = -1;
        class524.field7675 = class71.field1024;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(II)V", line = 60)
    public class509(int arg0, int arg1) {
        this.field7451 = arg0;
        this.field7450 = arg1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 69)
    public static void method3033(int arg0) {
        field7455 = null;
        if (arg0 >= -86) {
            method3034(-14, -122, 57, 29, -11);
        }
        field7449 = null;
        field7452 = null;
        field7456 = null;
        field7457 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V", line = 83)
    public static final void method3034(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 1054) {
            field7455 = null;
        }
        class71.field1020.field3556 = 0;
        field7454++;
        class71.field1020.method1545(class518.field7551.field1077, arg3 ^ 0xFFFFFBA5);
        class71.field1020.method1545(arg2, -73);
        class71.field1020.method1545(arg4, -77);
        class71.field1020.method1542(arg1, arg3 ^ 0xFFFFF122);
        class71.field1020.method1542(arg0, arg3 - 3810);
        class517.field7517 = 0;
        class182.field2723 = -3;
        class490.field7043 = 0;
        class197.field3291 = 1;
    }
}
