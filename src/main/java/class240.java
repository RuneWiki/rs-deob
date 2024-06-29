import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class240 {

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lde;")
    private class534 field3111 = new class534(64);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lnd;")
    private class547 field3105;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public final void method1498(byte arg0) {
        class534 var2 = this.field3111;
        synchronized (this.field3111) {
            if (arg0 != -6) {
                return;
            }
            this.field3111.method3065(true);
        }
        field3110++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
    public final void method1499(int arg0, byte arg1) {
        if (arg1 != -73) {
            return;
        }
        field3112++;
        class534 var3 = this.field3111;
        synchronized (this.field3111) {
            this.field3111.method3070(arg0, arg1 + 197);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)[Lbf;")
    public static final class539[] method1500(byte arg0) {
        if (arg0 >= -70) {
            return null;
        } else {
            field3109++;
            return new class539[] { class262.field3298, class262.field3299, class262.field3300, class262.field3301, class262.field3302, class262.field3303, class262.field3304, class262.field3305, class262.field3306, class262.field3307, class262.field3308, class262.field3309 };
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lgw;")
    public final class173 method1501(int arg0, int arg1) {
        field3113++;
        class534 var3 = this.field3111;
        class173 var4;
        synchronized (this.field3111) {
            var4 = (class173) this.field3111.method3079((long) arg0, arg1 ^ arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field3105;
        byte[] var6;
        synchronized (this.field3105) {
            var6 = this.field3105.method3153(arg0, arg1 ^ 0x23, 35);
        }
        class173 var7 = new class173();
        if (var6 != null) {
            var7.method1195(new class461(var6), -1);
        }
        var7.method1193(-81);
        class534 var8 = this.field3111;
        synchronized (this.field3111) {
            this.field3111.method3077((byte) 115, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public final void method1502(int arg0) {
        class534 var2 = this.field3111;
        synchronized (this.field3111) {
            int var3 = -52 / ((arg0 + 62) / 63);
            this.field3111.method3064(false);
        }
        field3107++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lvea;I)V")
    public static final void method1503(class277 arg0, int arg1) {
        field3108++;
        if (arg1 <= 6) {
            method1503(null, 85);
        }
        if (class14.field276) {
            return;
        }
        arg0.method1175(-2);
        class159.field2181--;
        if (!arg0.field3470) {
            long var2 = arg0.field3472;
            class184 var4;
            for (var4 = (class184) class543.field7569.method1160(var2, 119); var4 != null && !var4.field2552.equals(arg0.field3475); var4 = (class184) class543.field7569.method1162(111)) {
            }
            if (var4 != null && var4.method1244(arg0, 0)) {
                class669.method3760(var4, -23719);
                return;
            }
            return;
        }
        for (class184 var5 = (class184) class330.field4215.method118(-30553); var5 != null; var5 = (class184) class330.field4215.method111(22548)) {
            if (var5.field2552.equals(arg0.field3475)) {
                boolean var6 = false;
                for (class277 var7 = (class277) var5.field2556.method118(-30553); var7 != null; var7 = (class277) var5.field2556.method111(22548)) {
                    if (arg0 == var7) {
                        var6 = true;
                        if (var5.method1244(arg0, 0)) {
                            class669.method3760(var5, -23719);
                        }
                        break;
                    }
                }
                if (var6) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lal;ILnd;)V")
    public class240(class102 arg0, int arg1, class547 arg2) {
        this.field3105 = arg2;
        if (this.field3105 != null) {
            this.field3105.method3178((byte) 117, 35);
        }
    }
}
