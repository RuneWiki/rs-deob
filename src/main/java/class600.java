import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class600 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lde;")
    private class534 field8353 = new class534(64);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lnd;")
    private class547 field8357;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Ltba;")
    public static class165 field8352 = new class165(16);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field8359 = 0;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lfh;")
    public static class653 field8356 = new class653();

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lbk;", line = 5)
    public final class378 method3398(int arg0, int arg1) {
        field8355++;
        class534 var3 = this.field8353;
        class378 var4;
        synchronized (this.field8353) {
            var4 = (class378) this.field8353.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field8357;
        byte[] var6;
        synchronized (this.field8357) {
            var6 = this.field8357.method3153(class360.method2085(arg1, (byte) -81), 0, class42.method304(-344560822, arg1));
        }
        if (arg0 != -28718) {
            this.method3401((byte) -66, -112);
        }
        class378 var7 = new class378();
        if (var6 != null) {
            var7.method2160(-1, new class461(var6));
        }
        class534 var8 = this.field8353;
        synchronized (this.field8353) {
            this.field8353.method3077((byte) -104, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 36)
    public static void method3399(byte arg0) {
        if (arg0 < -84) {
            field8356 = null;
            field8352 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 47)
    public final void method3400(int arg0) {
        class534 var2 = this.field8353;
        synchronized (this.field8353) {
            this.field8353.method3064(false);
            if (arg0 != 64) {
                this.method3401((byte) -86, -50);
            }
        }
        field8354++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V", line = 61)
    public final void method3401(byte arg0, int arg1) {
        class534 var3 = this.field8353;
        synchronized (this.field8353) {
            this.field8353.method3065(true);
            this.field8353 = new class534(arg1);
        }
        field8351++;
        if (arg0 != 1) {
            this.method3398(92, 76);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V", line = 85)
    public final void method3402(boolean arg0, int arg1) {
        class534 var3 = this.field8353;
        synchronized (this.field8353) {
            this.field8353.method3070(arg1, 121);
            if (arg0) {
                field8352 = null;
            }
        }
        field8358++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V", line = 98)
    public final void method3403(byte arg0) {
        field8350++;
        class534 var2 = this.field8353;
        synchronized (this.field8353) {
            this.field8353.method3065(true);
        }
        if (arg0 < 86) {
            field8359 = 2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 122)
    public class600(class102 arg0, int arg1, class547 arg2) {
        this.field8357 = arg2;
        if (this.field8357 != null) {
            int var4 = this.field8357.method3155((byte) -59) - 1;
            this.field8357.method3178((byte) 94, var4);
        }
    }
}
