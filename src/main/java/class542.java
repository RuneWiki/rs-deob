import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class542 extends class176 {

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public int field7538 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public int field7541 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public int field7542 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public int field7543 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public int field7544 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public int field7546 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public int field7545 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public int field7548 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Ldu;")
    public class299 field7540;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "Ldv;")
    public static class566 field7547 = new class566(73, 16);

    @OriginalMember(owner = "client!am", name = "x", descriptor = "[I")
    public static int[] field7549;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static void method3105(int arg0) {
        field7549 = null;
        if (arg0 < 8) {
            field7547 = null;
        }
        field7547 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)Z")
    public final boolean method3106(byte arg0, int arg1, int arg2) {
        int var4 = -32 / ((-arg0 - 86) / 39);
        field7539++;
        if (this.field7546 <= arg2 && arg2 <= this.field7543 && this.field7545 <= arg1 && arg1 <= this.field7538) {
            return true;
        } else {
            return this.field7544 <= arg2 && this.field7542 >= arg2 && this.field7548 <= arg1 && arg1 <= this.field7541;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ldu;)V")
    public class542(class299 arg0) {
        this.field7540 = arg0;
    }

    static {
        new class104(" days.", " Tage.", " jours.", " dias.");
        field7549 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
    }
}
