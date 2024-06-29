import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class442 {

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Ljp;")
    private class236 field6058 = new class236(64);

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "Ljp;")
    public class236 field6069 = new class236(50);

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Ljp;")
    public class236 field6070 = new class236(5);

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "Z")
    public boolean field6059;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Lpc;")
    public class473 field6057;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "Lpc;")
    private class473 field6068;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public int field6071;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public final void method2546(int arg0) {
        class236 var2 = this.field6069;
        synchronized (this.field6069) {
            this.field6069.method1458((byte) 86);
            if (arg0 != 0) {
                this.field6058 = null;
            }
        }
        field6063++;
        class236 var3 = this.field6070;
        synchronized (this.field6070) {
            this.field6070.method1458((byte) -75);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
    public final void method2547(int arg0, int arg1) {
        field6067++;
        this.field6071 = arg0;
        if (arg1 != 4096) {
            return;
        }
        class236 var3 = this.field6069;
        synchronized (this.field6069) {
            this.field6069.method1458((byte) -106);
        }
        class236 var4 = this.field6070;
        synchronized (this.field6070) {
            this.field6070.method1458((byte) -62);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZ)V")
    public final void method2548(int arg0, boolean arg1) {
        field6056++;
        if (arg1 == this.field6059) {
            return;
        }
        if (arg0 != 11353) {
            this.field6068 = null;
        }
        this.field6059 = arg1;
        this.method2553((byte) 42);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final void method2549(byte arg0) {
        class236 var2 = this.field6058;
        synchronized (this.field6058) {
            if (arg0 != 58) {
                this.field6069 = null;
            }
            this.field6058.method1459(19088);
        }
        field6064++;
        class236 var3 = this.field6069;
        synchronized (this.field6069) {
            this.field6069.method1459(19088);
        }
        class236 var4 = this.field6070;
        synchronized (this.field6070) {
            this.field6070.method1459(19088);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V")
    public final void method2550(int arg0, int arg1) {
        if (arg0 > -16) {
            return;
        }
        field6062++;
        class236 var3 = this.field6058;
        synchronized (this.field6058) {
            this.field6058.method1461(-5, arg1);
        }
        class236 var4 = this.field6069;
        synchronized (this.field6069) {
            this.field6069.method1461(-5, arg1);
        }
        class236 var5 = this.field6070;
        synchronized (this.field6070) {
            this.field6070.method1461(-5, arg1);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILhq;)V")
    public static final void method2551(int arg0, class108 arg1) {
        for (int var2 = 0; var2 < class371.field4995; var2++) {
            int var3 = class191.field2695[var2];
            class515 var4 = class499.field6901[var3];
            int var5 = arg1.method2238(255);
            if ((var5 & 0x8) != 0) {
                var5 += arg1.method2238(255) << 8;
            }
            if ((var5 & 0x1000) != 0) {
                var5 += arg1.method2238(255) << 16;
            }
            class421.method2425(var4, var5, arg1, -1225, var3);
        }
        field6066++;
        if (arg0 == 64) {
            ;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZB)V")
    public static final void method2552(boolean arg0, byte arg1) {
        field6060++;
        if (arg1 != -13) {
            return;
        }
        for (class219 var2 = (class219) class201.field2786.method1672((byte) -107); var2 != null; var2 = (class219) class201.field2786.method1668(-1)) {
            if (var2.field2959 != null) {
                class318.field4175.method3070(var2.field2959);
                var2.field2959 = null;
            }
            if (var2.field2945 != null) {
                class318.field4175.method3070(var2.field2945);
                var2.field2945 = null;
            }
            var2.method300(false);
        }
        if (!arg0) {
            return;
        }
        for (class219 var3 = (class219) class225.field3039.method1672((byte) -88); var3 != null; var3 = (class219) class225.field3039.method1668(arg1 + 12)) {
            if (var3.field2959 != null) {
                class318.field4175.method3070(var3.field2959);
                var3.field2959 = null;
            }
            var3.method300(false);
        }
        for (class219 var4 = (class219) class368.field4965.method181((byte) -70); var4 != null; var4 = (class219) class368.field4965.method179(1)) {
            if (var4.field2959 != null) {
                class318.field4175.method3070(var4.field2959);
                var4.field2959 = null;
            }
            var4.method300(false);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
    public final void method2553(byte arg0) {
        field6065++;
        class236 var2 = this.field6058;
        synchronized (this.field6058) {
            if (arg0 <= 12) {
                this.field6070 = null;
            }
            this.field6058.method1458((byte) 123);
        }
        class236 var3 = this.field6069;
        synchronized (this.field6069) {
            this.field6069.method1458((byte) 59);
        }
        class236 var4 = this.field6070;
        synchronized (this.field6070) {
            this.field6070.method1458((byte) 102);
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)Lrl;")
    public final class506 method2554(int arg0, int arg1) {
        field6061++;
        class236 var3 = this.field6058;
        class506 var4;
        synchronized (this.field6058) {
            var4 = (class506) this.field6058.method1456((long) arg1, 106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6068.method2708(class373.method2160(-28485, arg1), class290.method1701((byte) -65, arg1), (byte) 54);
        class506 var6 = new class506();
        if (arg0 <= 116) {
            this.field6058 = null;
        }
        var6.field6979 = arg1;
        var6.field7001 = this;
        if (var5 != null) {
            var6.method2886(142, new class379(var5));
        }
        var6.method2893(0);
        class236 var7 = this.field6058;
        synchronized (this.field6058) {
            this.field6058.method1462(var6, (long) arg1, -75);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lrb;IZLpc;Lpc;)V")
    public class442(class234 arg0, int arg1, boolean arg2, class473 arg3, class473 arg4) {
        this.field6059 = arg2;
        this.field6057 = arg4;
        this.field6068 = arg3;
        if (this.field6068 != null) {
            int var6 = this.field6068.method2724(0) - 1;
            this.field6068.method2710(var6, (byte) -126);
        }
    }

    static {
        new class304("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
    }
}
