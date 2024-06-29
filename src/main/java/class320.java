import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class320 extends class245 {

    @OriginalMember(owner = "client!td", name = "n", descriptor = "[I")
    public static int[] field4628 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field4633 = 0;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Lni;")
    public static class367 field4636 = new class367(8, 8);

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field4639 = 1403;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "J")
    public long field4640;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
    public final int method1571(boolean arg0) {
        if (!arg0) {
            this.method1567(-125);
        }
        field4635++;
        return this.field4632;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)I")
    public final int method1570(int arg0) {
        field4630++;
        return arg0 == 3 ? 0 : -95;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)I")
    public final int method1567(int arg0) {
        if (arg0 != -20707) {
            field4633 = 8;
        }
        field4637++;
        return this.field4638;
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
    public static void method1998(int arg0) {
        field4636 = null;
        if (arg0 <= -43) {
            field4628 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
    public final int method1569(int arg0) {
        field4629++;
        if (arg0 != 3) {
            this.field4640 = 117L;
        }
        return this.field4631;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)J")
    public final long method1568(int arg0) {
        if (arg0 != -14188) {
            field4628 = null;
        }
        field4634++;
        return this.field4640;
    }
}
