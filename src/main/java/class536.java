import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class536 {

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "Lde;")
    private class534 field7426 = new class534(128);

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "Lde;")
    public class534 field7436 = new class534(64);

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "Lnd;")
    public class547 field7432;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Lnd;")
    private class547 field7434;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "Lfia;")
    public static class577 field7429 = new class577(12, 0, 1, 0);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method3080(int arg0, byte arg1, int arg2) {
        if (arg1 != 78) {
            method3081(-97, -16);
        }
        field7430++;
        this.field7426 = new class534(arg2);
        this.field7436 = new class534(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V", line = 25)
    public static final void method3081(int arg0, int arg1) {
        if (arg0 == 64) {
            field7425++;
            class37 var2 = class636.method3571(9, arg1, -69);
            var2.method230(-120);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V", line = 45)
    public final void method3082(byte arg0) {
        class534 var2 = this.field7426;
        synchronized (this.field7426) {
            this.field7426.method3064(false);
        }
        field7433++;
        class534 var3 = this.field7436;
        synchronized (this.field7436) {
            int var4 = -123 % ((arg0 + 10) / 38);
            this.field7436.method3064(false);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V", line = 60)
    public static void method3083(byte arg0) {
        field7429 = null;
        if (arg0 <= 102) {
            field7429 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V", line = 70)
    public final void method3084(byte arg0, int arg1) {
        class534 var3 = this.field7426;
        synchronized (this.field7426) {
            this.field7426.method3070(arg1, 127);
        }
        field7424++;
        class534 var4 = this.field7436;
        synchronized (this.field7436) {
            this.field7436.method3070(arg1, 126);
        }
        int var5 = -71 % ((-arg0 - 35) / 52);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(BI)Lup;", line = 85)
    public final class278 method3085(byte arg0, int arg1) {
        field7431++;
        class534 var3 = this.field7426;
        class278 var4;
        synchronized (this.field7426) {
            var4 = (class278) this.field7426.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field7434;
        byte[] var6;
        synchronized (this.field7434) {
            var6 = this.field7434.method3153(arg1, arg0 ^ 0xFFFFFF86, 36);
        }
        class278 var7 = new class278();
        var7.field3529 = this;
        var7.field3518 = arg1;
        if (arg0 != -122) {
            return null;
        }
        if (var6 != null) {
            var7.method1643(105, new class461(var6));
        }
        var7.method1639((byte) 18);
        class534 var8 = this.field7426;
        synchronized (this.field7426) {
            this.field7426.method3077((byte) -80, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lal;ILnd;Lnd;)V", line = 126)
    public class536(class102 arg0, int arg1, class547 arg2, class547 arg3) {
        this.field7432 = arg3;
        this.field7434 = arg2;
        this.field7434.method3178((byte) 88, 36);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 142)
    public final void method3086(int arg0) {
        class534 var2 = this.field7426;
        synchronized (this.field7426) {
            if (arg0 != 0) {
                return;
            }
            this.field7426.method3065(true);
        }
        field7435++;
        class534 var3 = this.field7436;
        synchronized (this.field7436) {
            this.field7436.method3065(true);
        }
    }
}
