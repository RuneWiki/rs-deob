import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class500 extends class260 {

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public int field7369;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field7368;

    static {
        new class466("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBI)V", line = 12)
    public static final void method2935(int arg0, byte arg1, int arg2) {
        field7366++;
        if (arg1 != 60) {
            method2935(18, (byte) 14, 62);
        }
        class97 var3 = class348.method2064(arg2, 5, 127);
        var3.method712((byte) -109);
        var3.field1468 = arg0;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V", line = 30)
    public class500() {
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method2936(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field7368++;
            return (class483.method2834(-127, arg0, arg2) | (arg2 & 0x2000) != 0 | class234.method1441(arg2, arg0, (byte) 97)) & class338.method1972(true, arg2, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(I)V", line = 43)
    public class500(int arg0) {
        this.field7369 = arg0;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)V", line = 51)
    public static final void method2937(int arg0, int arg1) {
        class315.field4321 = 1000 / arg1;
        if (arg0 != 16222) {
            method2937(19, 40);
        }
        field7367++;
    }
}
