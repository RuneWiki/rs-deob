import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class687 {

    @OriginalMember(owner = "client!vha", name = "m", descriptor = "Lde;")
    private class534 field9578 = new class534(64);

    @OriginalMember(owner = "client!vha", name = "o", descriptor = "Lde;")
    public class534 field9580 = new class534(50);

    @OriginalMember(owner = "client!vha", name = "q", descriptor = "Lde;")
    public class534 field9582 = new class534(5);

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "Lnd;")
    public class547 field9568;

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "Lnd;")
    private class547 field9567;

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "Z")
    public boolean field9575;

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "Lal;")
    public class102 field9572;

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "Lde;")
    public static class534 field9574 = new class534(3000000, 200);

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!vha", name = "h", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!vha", name = "k", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!vha", name = "l", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!vha", name = "n", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!vha", name = "p", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!vha", name = "r", descriptor = "I")
    public int field9583;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
    public final void method3858(int arg0) {
        field9579++;
        class534 var2 = this.field9578;
        synchronized (this.field9578) {
            this.field9578.method3064(false);
        }
        class534 var3 = this.field9580;
        synchronized (this.field9580) {
            this.field9580.method3064(false);
        }
        int var4 = 122 % ((41 - arg0) / 40);
        class534 var5 = this.field9582;
        synchronized (this.field9582) {
            this.field9582.method3064(false);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IB)Lfg;")
    public final class131 method3859(int arg0, byte arg1) {
        field9566++;
        class534 var3 = this.field9578;
        class131 var4;
        synchronized (this.field9578) {
            var4 = (class131) this.field9578.method3079((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -108 / ((47 - arg1) / 50);
        class547 var6 = this.field9567;
        byte[] var7;
        synchronized (this.field9567) {
            var7 = this.field9567.method3153(class469.method2670(arg0, 127), 0, class679.method3827(9216, arg0));
        }
        class131 var8 = new class131();
        var8.field1877 = arg0;
        var8.field1871 = this;
        if (var7 != null) {
            var8.method977(new class461(var7), (byte) -128);
        }
        var8.method970(32768);
        class534 var9 = this.field9578;
        synchronized (this.field9578) {
            this.field9578.method3077((byte) 103, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)V")
    public final void method3860(byte arg0) {
        field9570++;
        class534 var2 = this.field9578;
        synchronized (this.field9578) {
            if (arg0 != 20) {
                this.field9583 = -113;
            }
            this.field9578.method3065(true);
        }
        class534 var3 = this.field9580;
        synchronized (this.field9580) {
            this.field9580.method3065(true);
        }
        class534 var4 = this.field9582;
        synchronized (this.field9582) {
            this.field9582.method3065(true);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Leha;IIIIIIIBLoea;II)V")
    public static final void method3861(class91 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, class599 arg9, int arg10, int arg11) {
        class358.field4620 = null;
        class21.field385 = arg7;
        field9573++;
        class638.field8797 = arg0;
        if (arg8 != -10) {
            method3866((byte) -91);
        }
        class662.field9317 = arg6;
        class122.field1765 = arg2;
        class322.field4151 = arg3;
        class607.field8427 = arg4;
        class528.field7362 = null;
        class599.field8346 = arg1;
        class660.field9190 = arg9;
        class699.field9731 = arg10;
        class652.field9069 = arg5;
        client.field3987 = arg11;
        class282.field3562 = null;
        class134.method986(arg8 + 10);
        class3.field32 = true;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZB)V")
    public final void method3862(boolean arg0, byte arg1) {
        field9581++;
        if (this.field9575 != arg0) {
            this.field9575 = arg0;
            int var3 = -25 / ((1 - arg1) / 60);
            this.method3860((byte) 20);
        }
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(IB)V")
    public final void method3863(int arg0, byte arg1) {
        class534 var3 = this.field9578;
        synchronized (this.field9578) {
            this.field9578.method3070(arg0, 120);
        }
        field9576++;
        class534 var4 = this.field9580;
        synchronized (this.field9580) {
            this.field9580.method3070(arg0, 126);
            int var5 = 27 % ((arg1 - 8) / 50);
        }
        class534 var6 = this.field9582;
        synchronized (this.field9582) {
            this.field9582.method3070(arg0, 121);
        }
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V")
    public final void method3864(int arg0) {
        class534 var2 = this.field9580;
        synchronized (this.field9580) {
            this.field9580.method3065(true);
        }
        field9569++;
        if (arg0 != 64) {
            this.method3860((byte) 64);
        }
        class534 var3 = this.field9582;
        synchronized (this.field9582) {
            this.field9582.method3065(true);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZI)V")
    public final void method3865(boolean arg0, int arg1) {
        field9577++;
        this.field9583 = arg1;
        class534 var3 = this.field9580;
        synchronized (this.field9580) {
            this.field9580.method3065(arg0);
        }
        class534 var4 = this.field9582;
        synchronized (this.field9582) {
            this.field9582.method3065(true);
        }
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V")
    public static void method3866(byte arg0) {
        field9574 = null;
        if (arg0 != 79) {
            method3866((byte) -68);
        }
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lal;IZLnd;Lnd;)V")
    public class687(class102 arg0, int arg1, boolean arg2, class547 arg3, class547 arg4) {
        this.field9568 = arg4;
        this.field9567 = arg3;
        this.field9575 = arg2;
        this.field9572 = arg0;
        if (this.field9567 != null) {
            int var6 = this.field9567.method3155((byte) -8) - 1;
            this.field9567.method3178((byte) 120, var6);
        }
    }
}
