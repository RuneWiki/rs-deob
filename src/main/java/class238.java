import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class238 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[Z")
    public static boolean[] field3570 = new boolean[5];

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[Lml;")
    public static class241[] field3569 = new class241[6];

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lvp;")
    public static class112 field3573 = new class112("", 10);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "J")
    public long field3568;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lah;")
    public class238 field3575;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lah;")
    public class238 field3576;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
    public static int[] field3578;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public final void method1510(byte arg0) {
        field3574++;
        if (this.field3576 == null) {
            return;
        }
        if (arg0 != -13) {
            method1511((Component) null, 90, true);
        }
        this.field3576.field3575 = this.field3575;
        this.field3575.field3576 = this.field3576;
        this.field3576 = null;
        this.field3575 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lak;")
    public static final class212 method1511(Component arg0, int arg1, boolean arg2) {
        field3571++;
        if (arg1 != -9201) {
            method1513(false);
        }
        return new class26(arg0, arg2);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)Z")
    public final boolean method1512(byte arg0) {
        field3572++;
        if (this.field3576 == null) {
            return false;
        } else {
            if (arg0 >= -20) {
                this.method1510((byte) 18);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method1513(boolean arg0) {
        field3578 = null;
        field3569 = null;
        field3573 = null;
        if (!arg0) {
            method1513(false);
        }
        field3570 = null;
    }
}
