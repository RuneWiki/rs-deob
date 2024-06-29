import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class212 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
    public static int[] field3789 = new int[4096];

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Loh;")
    public static class263 field3790 = class253.method1681(-121, ")4p=");

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Loh;")
    public static class263 field3785 = class253.method1681(-126, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Loh;")
    private static class263 field3792 = class253.method1681(-128, "flash2:");

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Loh;")
    public static class263 field3786 = field3792;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Loh;")
    public static class263 field3794 = field3792;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Llb;")
    public static class127 field3795 = new class127(50);

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field3796 = 0;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Lti;")
    public static class5 field3797 = new class5(8);

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
    public abstract void method522(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
    public abstract void method528(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field3797 = null;
        field3794 = null;
        field3790 = null;
        field3789 = null;
        field3795 = null;
        field3785 = null;
        field3786 = null;
        if (arg0 < -74) {
            field3792 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V")
    public static final void method1443(byte arg0, int arg1) {
        field3787++;
        class64 var2 = class84.method563(12, arg1, 102);
        int var3 = 53 / ((arg0 + 22) / 47);
        var2.method393(-87);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZ)V")
    public abstract void method531(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V")
    public class212(int arg0, int arg1, int arg2) {
        this.field3784 = arg2;
        this.field3788 = arg1;
        this.field3793 = arg0;
    }
}
