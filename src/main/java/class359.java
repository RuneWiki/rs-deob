import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class359 {

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lwf;")
    private class117 field4881 = new class117(64);

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lkda;")
    private class328 field4880;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lbu;")
    public static class19 field4877 = new class19();

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field4885 = 0;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[[Z")
    public static boolean[][] field4886 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "F")
    public static float field4883;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public final void method2168(byte arg0) {
        class117 var2 = this.field4881;
        synchronized (this.field4881) {
            this.field4881.method846(0);
        }
        int var3 = 72 / ((62 - arg0) / 47);
        field4882++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V")
    public final void method2169(boolean arg0, int arg1) {
        field4878++;
        class117 var3 = this.field4881;
        synchronized (this.field4881) {
            if (!arg0) {
                method2173((byte) 119);
            }
            this.field4881.method834(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)Leu;")
    public final class409 method2170(byte arg0, int arg1) {
        field4884++;
        class117 var3 = this.field4881;
        class409 var4;
        synchronized (this.field4881) {
            var4 = (class409) this.field4881.method842(0, (long) arg1);
            int var5 = -50 / ((arg0 + 21) / 33);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var6 = this.field4880;
        byte[] var7;
        synchronized (this.field4880) {
            var7 = this.field4880.method1966(arg1, 35, true);
        }
        class409 var8 = new class409();
        if (var7 != null) {
            var8.method2405(-110, new class148(var7));
        }
        var8.method2406(21202);
        class117 var9 = this.field4881;
        synchronized (this.field4881) {
            this.field4881.method835((byte) 118, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLks;)V")
    public static final void method2171(byte arg0, class373 arg1) {
        field4876++;
        if (arg0 != 110) {
            field4883 = 0.88625383F;
        }
        class14 var2 = (class14) class276.field3879.method2799((long) arg1.field1904, true);
        if (var2 == null) {
            return;
        }
        if (var2.field139 != null) {
            class155.field2316.method258(var2.field139);
            var2.field139 = null;
        }
        var2.method2457(-8422);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public final void method2172(byte arg0) {
        if (arg0 > -30) {
            return;
        }
        field4879++;
        class117 var2 = this.field4881;
        synchronized (this.field4881) {
            this.field4881.method837(125);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    public static void method2173(byte arg0) {
        field4886 = null;
        field4877 = null;
        if (arg0 != 90) {
            field4883 = 0.5298308F;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class359(class39 arg0, int arg1, class328 arg2) {
        this.field4880 = arg2;
        if (this.field4880 != null) {
            this.field4880.method1975(97, 35);
        }
    }
}
