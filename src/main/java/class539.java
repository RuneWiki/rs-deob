import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class539 extends class530 {

    @OriginalMember(owner = "client!so", name = "h", descriptor = "Lqk;")
    public static class148 field7538 = new class148(8, -2);

    @OriginalMember(owner = "client!so", name = "m", descriptor = "Z")
    public static boolean field7543 = false;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field7545 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "Lcw;")
    public static class21 field7546;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Lqc;")
    public static class379 field7539;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "Lda;")
    public static class400 field7547;

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(ILah;)V", line = 4)
    public class539(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lah;)V", line = 7)
    public class539(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 14)
    public static void method3215(int arg0) {
        if (arg0 > -96) {
            method3215(-69);
        }
        field7538 = null;
        field7539 = null;
        field7547 = null;
        field7546 = null;
        field7545 = null;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(II)V", line = 28)
    public final void method70(int arg0, int arg1) {
        ++field7542;
        super.field7419 = arg0;
        if (arg1 >= -38) {
            field7546 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V", line = 39)
    public final void method73(boolean arg0) {
        if (!arg0) {
            field7543 = false;
        }
        if (~super.field7419 > -1 && ~super.field7419 < -128) {
            super.field7419 = this.method74(0);
        }
        ++field7540;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)I", line = 57)
    public final int method75(int arg0, int arg1) {
        int var3 = -58 / ((63 - arg1) / 60);
        ++field7544;
        return 1;
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)I", line = 67)
    public final int method3216(int arg0) {
        ++field7541;
        if (arg0 != 0) {
            field7546 = null;
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I", line = 82)
    public final int method74(int arg0) {
        if (arg0 != 0) {
            this.method70(24, -102);
        }
        ++field7537;
        return 127;
    }
}
