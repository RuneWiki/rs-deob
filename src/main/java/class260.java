import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class260 {

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Ltl;")
    private class400 field3866 = new class400(128);

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Lui;")
    private class451 field3870;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "[J")
    public static long[] field3867 = new long[100];

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Lom;")
    public static class249 field3871 = null;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Lo;")
    public static class332 field3864 = new class332("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Lfl;")
    public static class131 field3872;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lda;")
    public static class325 field3869;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IB)Lqb;", line = 5)
    public final class480 method1715(int arg0, byte arg1) {
        field3865++;
        class400 var3 = this.field3866;
        class480 var4;
        synchronized (this.field3866) {
            var4 = (class480) this.field3866.method2393(-117, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3870.method2691(class464.method2730(255, arg0), class415.method2474(arg0, (byte) 27), 0);
        class480 var6 = new class480();
        int var7 = 54 % ((30 - arg1) / 51);
        if (var5 != null) {
            var6.method2818(new class446(var5), (byte) -91);
        }
        class400 var8 = this.field3866;
        synchronized (this.field3866) {
            this.field3866.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V", line = 32)
    public static final void method1716(boolean arg0, int arg1) {
        field3868++;
        if (arg0) {
            field3872 = null;
        }
        class303.field4512 = -1;
        class446.field6309 = arg1;
        class303.field4512 = -1;
        class174.method1195(-30);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 53)
    public static void method1717(int arg0) {
        field3869 = null;
        field3872 = null;
        if (arg0 != -16605) {
            field3871 = null;
        }
        field3871 = null;
        field3867 = null;
        field3864 = null;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 78)
    public class260(class430 arg0, int arg1, class451 arg2) {
        this.field3870 = arg2;
        if (this.field3870 != null) {
            int var4 = this.field3870.method2675(false) - 1;
            this.field3870.method2662(var4, (byte) -7);
        }
    }
}
