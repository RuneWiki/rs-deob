import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class697 {

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "Lde;")
    private class534 field9700 = new class534(16);

    @OriginalMember(owner = "client!jha", name = "f", descriptor = "Lnd;")
    private class547 field9704;

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "Lkg;")
    public static class275 field9706 = new class275(103, 2);

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "Z")
    public static boolean field9709 = false;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!jha", name = "g", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "Ljl;")
    public static class274 field9708;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(BI)Lvd;", line = 3)
    private final class39 method3919(byte arg0, int arg1) {
        field9705++;
        class534 var3 = this.field9700;
        class39 var4;
        synchronized (this.field9700) {
            var4 = (class39) this.field9700.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 < 64) {
            field9708 = null;
        }
        class547 var5 = this.field9704;
        byte[] var6;
        synchronized (this.field9704) {
            var6 = this.field9704.method3153(arg1, 0, 29);
        }
        class39 var7 = new class39();
        if (var6 != null) {
            var7.method236((byte) -40, new class461(var6));
        }
        class534 var8 = this.field9700;
        synchronized (this.field9700) {
            this.field9700.method3077((byte) 116, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V", line = 33)
    public final void method3920(int arg0) {
        field9699++;
        class534 var2 = this.field9700;
        synchronized (this.field9700) {
            this.field9700.method3065(true);
        }
        if (arg0 != 20030) {
            this.field9700 = null;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)V", line = 51)
    public final void method3921(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method3920(-19);
        }
        class534 var3 = this.field9700;
        synchronized (this.field9700) {
            this.field9700.method3070(arg1, 127);
        }
        field9707++;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILmp;IIII)Lmha;", line = 64)
    public final class417 method3922(int arg0, class762 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 16) {
            this.method3919((byte) 114, -35);
        }
        field9703++;
        class519[] var7 = null;
        class39 var8 = this.method3919((byte) 80, arg0);
        if (var8.field600 != null) {
            var7 = new class519[var8.field600.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class2 var10 = arg1.method4234((byte) -117, var8.field600[var9]);
                var7[var9] = new class519(var10.field13, var10.field18, var10.field6, var10.field12, var10.field16, var10.field17, var10.field7, var10.field9);
            }
        }
        return new class417(var8.field598, var7, var8.field604, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)V", line = 96)
    public static void method3923(int arg0) {
        field9708 = null;
        field9706 = null;
        int var1 = 66 % ((31 - arg0) / 53);
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(BI)Z", line = 108)
    public static final boolean method3924(byte arg0, int arg1) {
        field9702++;
        if (arg0 >= -87) {
            field9709 = false;
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "(I)V", line = 128)
    public final void method3925(int arg0) {
        int var2 = 91 / ((arg0 + 13) / 56);
        field9701++;
        class534 var3 = this.field9700;
        synchronized (this.field9700) {
            this.field9700.method3064(false);
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 144)
    public class697(class102 arg0, int arg1, class547 arg2) {
        this.field9704 = arg2;
        this.field9704.method3178((byte) 121, 29);
    }
}
