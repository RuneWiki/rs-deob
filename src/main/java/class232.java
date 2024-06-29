import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public abstract class class232 {

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "Lwk;")
    public class151 field3368;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "J")
    public static long field3364;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 7)
    public void method1265(int arg0) {
        field3367++;
        if (arg0 != -18866) {
            this.method571(42);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V", line = 19)
    public void method908(byte arg0) {
        field3370++;
        if (arg0 < 101) {
            this.field3368 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V", line = 31)
    public void method1268(int arg0) {
        if (arg0 <= 35) {
            this.method1266(-83);
        }
        field3371++;
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(B)V", line = 45)
    public void method1267(byte arg0) {
        if (arg0 <= 57) {
            this.field3368 = null;
        }
        field3366++;
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V", line = 55)
    public void method1266(int arg0) {
        if (arg0 != -9611) {
            this.method571(10);
        }
        field3369++;
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)V", line = 66)
    public void method1606(int arg0) {
        if (arg0 != 8261) {
            this.method1267((byte) 28);
        }
        field3365++;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lwk;)V", line = 77)
    public class232(class151 arg0) {
        this.field3368 = arg0;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)V")
    public abstract void method569(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZI)V")
    public abstract void method572(boolean arg0, int arg1);

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V")
    public abstract void method573(byte arg0);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILdr;I)V")
    public abstract void method570(int arg0, class749 arg1, int arg2);

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "(I)Z")
    public abstract boolean method571(int arg0);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZB)V")
    public abstract void method568(boolean arg0, byte arg1);
}
