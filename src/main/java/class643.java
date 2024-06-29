import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class643 {

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public int field8919 = 128;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
    public int field8916 = 128;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public int field8911;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public int field8913;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
    public int field8923;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public int field8914;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "Ljw;")
    public static class581 field8921 = new class581(84, 4);

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "Lee;")
    public static class706 field8925 = new class706(16);

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "I")
    public static int field8926 = 0;

    @OriginalMember(owner = "client!mfa", name = "s", descriptor = "Ljw;")
    public static class581 field8929 = new class581(90, 16);

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public int field8912;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public int field8917;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public int field8920;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public int field8922;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!mfa", name = "r", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!mfa", name = "t", descriptor = "I")
    public int field8930;

    @OriginalMember(owner = "client!mfa", name = "q", descriptor = "Laj;")
    public static class333 field8927;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
    public static void method3569(int arg0) {
        field8927 = null;
        field8921 = null;
        field8925 = null;
        field8929 = null;
        if (arg0 != 4) {
            field8928 = -54;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)Lmfa;")
    public final class643 method3570(int arg0) {
        field8915++;
        if (arg0 != 31738) {
            field8929 = null;
        }
        return new class643(this.field8911, this.field8919, this.field8916, this.field8914, this.field8913, this.field8923);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "([[F[[SB)[[S")
    public static final short[][] method3571(float[][] arg0, short[][] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            for (int var4 = 0; var4 < arg1[var3].length; var4++) {
                arg1[var3][var4] = (short) ((int) (arg0[var3][var4] * 16383.0F));
            }
        }
        field8918++;
        if (arg2 <= 42) {
            method3569(38);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILmfa;)V")
    public final void method3572(int arg0, class643 arg1) {
        this.field8914 = arg1.field8914;
        this.field8916 = arg1.field8916;
        this.field8923 = arg1.field8923;
        this.field8911 = arg1.field8911;
        if (arg0 != 6264) {
            this.field8922 = 68;
        }
        this.field8919 = arg1.field8919;
        field8924++;
        this.field8913 = arg1.field8913;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
    public class643(int arg0) {
        this.field8911 = arg0;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IIIIII)V")
    private class643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8913 = arg4;
        this.field8919 = arg1;
        this.field8923 = arg5;
        this.field8911 = arg0;
        this.field8914 = arg3;
        this.field8916 = arg2;
    }
}
