import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class261 {

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "Lqr;")
    private class65 field3637 = new class65(64);

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Lwu;")
    private class376 field3634;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field3633 = 0;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field3632 = 0;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "[B")
    public static byte[] field3636 = new byte[2048];

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "D")
    public static double field3631;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1579(int arg0) {
        field3639++;
        class705.field9779 = new class443(8);
        class407.field5660 = 0;
        for (class17 var1 = (class17) class543.field7191.method3874((byte) 107); var1 != null; var1 = (class17) class543.field7191.method3868(-24951)) {
            var1.method132();
        }
        int var2 = -58 / ((5 - arg0) / 62);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)Leba;", line = 45)
    public final class589 method1580(int arg0, byte arg1) {
        field3635++;
        class65 var3 = this.field3637;
        class589 var4;
        synchronized (this.field3637) {
            var4 = (class589) this.field3637.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field3634;
        byte[] var6;
        synchronized (this.field3634) {
            var6 = this.field3634.method2218((byte) 110, 19, arg0);
        }
        if (arg1 >= -70) {
            return null;
        }
        class589 var7 = new class589();
        if (var6 != null) {
            var7.method3214(new class677(var6), (byte) 49);
        }
        class65 var8 = this.field3637;
        synchronized (this.field3637) {
            this.field3637.method556((byte) 0, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V", line = 77)
    public static void method1581(boolean arg0) {
        field3636 = null;
        if (!arg0) {
            field3632 = -117;
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 96)
    public class261(class763 arg0, int arg1, class376 arg2) {
        this.field3634 = arg2;
        this.field3638 = this.field3634.method2195(19, 0);
    }
}
