import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class517 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lwf;")
    private class117 field7364 = new class117(128);

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lwf;")
    public class117 field7375 = new class117(64);

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lkda;")
    public class328 field7372;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lkda;")
    private class328 field7373;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field7363 = 0;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Llb;")
    public static class465 field7365 = new class465(16);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lbc;")
    public final class308 method3058(int arg0, int arg1) {
        field7367++;
        class117 var3 = this.field7364;
        class308 var4;
        synchronized (this.field7364) {
            var4 = (class308) this.field7364.method842(arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field7373;
        byte[] var6;
        synchronized (this.field7373) {
            var6 = this.field7373.method1966(arg0, 36, true);
        }
        class308 var7 = new class308();
        var7.field4226 = arg0;
        var7.field4233 = this;
        if (var6 != null) {
            var7.method1887(new class148(var6), 12018);
        }
        var7.method1878((byte) -108);
        class117 var8 = this.field7364;
        synchronized (this.field7364) {
            this.field7364.method835((byte) 125, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
    public final void method3059(int arg0, int arg1) {
        class117 var3 = this.field7364;
        synchronized (this.field7364) {
            this.field7364.method834(arg0, arg1 ^ arg1);
        }
        field7374++;
        class117 var4 = this.field7375;
        synchronized (this.field7375) {
            this.field7375.method834(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method3060(int arg0) {
        if (arg0 != -1133) {
            method3061(-67);
        }
        class396.field5453.method846(0);
        field7369++;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method3061(int arg0) {
        if (arg0 < 38) {
            field7365 = null;
        }
        field7365 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
    public final void method3062(int arg0, int arg1, int arg2) {
        this.field7364 = new class117(arg2);
        if (arg1 == 36) {
            field7368++;
            this.field7375 = new class117(arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public final void method3063(int arg0) {
        class117 var2 = this.field7364;
        synchronized (this.field7364) {
            this.field7364.method837(127);
        }
        field7370++;
        class117 var3 = this.field7375;
        synchronized (this.field7375) {
            this.field7375.method837(125);
            if (arg0 != 20725) {
                method3061(-12);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public final void method3064(boolean arg0) {
        field7366++;
        class117 var2 = this.field7364;
        synchronized (this.field7364) {
            this.field7364.method846(0);
        }
        if (!arg0) {
            this.field7372 = null;
        }
        class117 var3 = this.field7375;
        synchronized (this.field7375) {
            this.field7375.method846(0);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lbt;ILkda;Lkda;)V")
    public class517(class39 arg0, int arg1, class328 arg2, class328 arg3) {
        this.field7372 = arg3;
        this.field7373 = arg2;
        this.field7373.method1975(74, 36);
    }
}
