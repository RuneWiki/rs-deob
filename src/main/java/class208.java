import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class208 implements class254 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
    public static boolean field3329 = false;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Z")
    public static boolean field3332 = false;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lbj;")
    public static class162 field3334 = new class162(67, 7);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "[I")
    public static int[] field3336;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lso;")
    public static class331 field3331;

    static {
        new class309("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field3336 = new int[32];
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1426(boolean arg0) {
        field3333++;
        class199.field3242 = new class181(8);
        if (arg0) {
            class524.field7617 = 0;
            for (class53 var1 = (class53) class63.field1296.method533((byte) -64); var1 != null; var1 = (class53) class63.field1296.method536(-35)) {
                var1.method492();
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILgh;)V", line = 28)
    public static final void method1427(int arg0, int arg1, int arg2, class388 arg3) {
        field3335++;
        class172.field2779 = arg0;
        class521.field7567 = arg2;
        class533.field7745 = arg3;
        if (arg1 != 29000) {
            field3336 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 52)
    public static void method1428(byte arg0) {
        field3336 = null;
        field3331 = null;
        if (arg0 != -80) {
            field3329 = false;
        }
        field3334 = null;
    }

    @OriginalMember(owner = "client!cd", name = "toString", descriptor = "()Ljava/lang/String;", line = 67)
    public final String toString() {
        field3330++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 80)
    public class208(String arg0, int arg1) {
        this.field3328 = arg1;
    }
}
