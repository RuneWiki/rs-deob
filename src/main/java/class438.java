import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class438 {

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Ljk;")
    private class449 field6285 = new class449(64);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lqn;")
    private class47 field6284;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Ldq;")
    public static class493 field6288;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lpp;")
    public static class269 field6289;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "F")
    public static float field6287;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)Lcp;")
    public final class511 method2573(int arg0, byte arg1) {
        field6290++;
        class449 var3 = this.field6285;
        class511 var4;
        synchronized (this.field6285) {
            var4 = (class511) this.field6285.method2647(-104, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field6284;
        byte[] var6;
        synchronized (this.field6284) {
            var6 = this.field6284.method481(32, arg0, -96);
        }
        class511 var7 = new class511();
        if (var6 != null) {
            var7.method3055(new class463(var6), -76);
        }
        if (arg1 != 14) {
            this.field6284 = null;
        }
        class449 var8 = this.field6285;
        synchronized (this.field6285) {
            this.field6285.method2635((long) arg0, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public final void method2574(int arg0, int arg1) {
        class449 var3 = this.field6285;
        synchronized (this.field6285) {
            this.field6285.method2648(false, arg1);
        }
        field6282++;
        if (arg0 >= -90) {
            field6291 = 101;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method2575(int arg0) {
        if (arg0 != -19643) {
            field6287 = -0.0499783F;
        }
        field6288 = null;
        field6289 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public final void method2576(int arg0) {
        class449 var2 = this.field6285;
        synchronized (this.field6285) {
            this.field6285.method2642(0);
        }
        if (arg0 != 32) {
            field6287 = 2.3486972F;
        }
        field6281++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public final void method2577(byte arg0) {
        class449 var2 = this.field6285;
        synchronized (this.field6285) {
            this.field6285.method2640(127);
            int var3 = -114 / ((arg0 + 26) / 54);
        }
        field6283++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method2578(String arg0, int arg1, String arg2) {
        field6286++;
        if (arg1 != 32) {
            method2578(null, -15, null);
        }
        class325.field4122 = 1;
        class233.field2976 = -1;
        class147.method978(arg0, 102, arg2);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lae;ILqn;)V")
    public class438(class165 arg0, int arg1, class47 arg2) {
        this.field6284 = arg2;
        this.field6284.method469(30322, 32);
    }

    static {
        new class335("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field6288 = new class493(87, -2);
        field6289 = new class269("WIP", 2);
        field6291 = 0;
    }
}
