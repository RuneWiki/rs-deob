import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class427 extends class337 {

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public int field6402;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field6405;

    static {
        new class475("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2558(int arg0, int arg1) {
        class352.method2207((byte) 64);
        field6404++;
        if (arg0 != -10492) {
            method2560(true, (byte) 62);
        }
        int var2 = class377.field5753.method1668(arg1, (byte) 108).field6135;
        if (var2 == 0) {
            return;
        }
        int var3 = class49.field796.field2619[arg1];
        if (var2 == 6) {
            class314.field4471 = var3;
        }
        if (var2 == 5) {
            class242.field3574 = var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 36)
    public static final void method2559(byte arg0) {
        if (arg0 > -75) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class189.field2793[var1] = false;
        }
        field6403++;
        class227.field3328 = 0;
        class19.field216 = class259.field3812;
        class228.field3379 = 0;
        class86.field1320 = class317.field4559;
        class261.field3838 = class18.field195;
        class337.field4743 = -1;
        class38.field465 = class24.field258;
        class438.field6539 = -1;
        class140.field2103 = 5;
        class235.field3485 = class260.field3827;
        class485.field7116 = class291.field4175;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZB)Z", line = 69)
    public static final boolean method2560(boolean arg0, byte arg1) {
        field6405++;
        boolean var2 = class348.field5015.method1025();
        int var3 = -108 / ((15 - arg1) / 49);
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class348.field5015.method1041();
        } else if (!class348.field5015.method1109()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class426.field6401.field980 = arg0;
            class426.field6401.method2523(class483.field7077, -90);
            return true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 105)
    public class427() {
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V", line = 107)
    public class427(int arg0) {
        this.field6402 = arg0;
    }
}
