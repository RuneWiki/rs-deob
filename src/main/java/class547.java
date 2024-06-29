import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class547 extends class189 {

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public int field7629 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public int field7631 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public int field7634 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field7635 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field7630 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field7632 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public int field7636 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field7633 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "Lek;")
    public class507 field7640;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Lqfa;")
    public static class98 field7628 = new class98(30, -1);

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field7639 = 0;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lek;)V", line = 75)
    public class547(class507 arg0) {
        this.field7640 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V", line = 20)
    public static void method3171(byte arg0) {
        if (arg0 <= 14) {
            method3171((byte) 50);
        }
        field7628 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)Z", line = 37)
    public final boolean method3172(byte arg0, int arg1, int arg2) {
        field7637++;
        if (this.field7635 <= arg2 && this.field7630 >= arg2 && this.field7633 <= arg1 && this.field7632 >= arg1) {
            return true;
        } else if (arg2 >= this.field7634 && this.field7636 >= arg2 && this.field7631 <= arg1 && this.field7629 >= arg1) {
            return true;
        } else {
            if (arg0 != 11) {
                this.field7636 = -89;
            }
            return false;
        }
    }
}
