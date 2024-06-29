import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class385 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    private int field5517;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Ljt;")
    private class38 field5521;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public int field5519;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public int field5516;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lqf;")
    public static class385 field5515 = new class385(0, 3, class38.field476);

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lqf;")
    public static class385 field5522 = new class385(1, 3, class38.field476);

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lqf;")
    public static class385 field5523 = new class385(2, 4, class38.field472);

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lqf;")
    public static class385 field5524 = new class385(3, 1, class38.field476);

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Lqf;")
    public static class385 field5526 = new class385(4, 2, class38.field476);

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lqf;")
    public static class385 field5527 = new class385(5, 3, class38.field476);

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Lqf;")
    public static class385 field5528 = new class385(6, 4, class38.field476);

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field5529 = class200.method1219(16, 8);

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field5530 = 0;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lhe;")
    public static class577 field5532;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lkaa;", line = 5)
    public static final class583 method2413(int arg0) {
        field5518++;
        class583 var1 = class231.method1374((byte) 10);
        var1.field7965 = arg0;
        var1.field7966 = null;
        var1.field7963 = new class409(5000);
        return var1;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 20)
    public static void method2414(int arg0) {
        field5522 = null;
        field5526 = null;
        field5523 = null;
        field5524 = null;
        field5532 = null;
        field5527 = null;
        field5515 = null;
        if (arg0 <= 108) {
            method2414(122);
        }
        field5528 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lqf;", line = 37)
    public static final class385 method2415(int arg0, byte arg1) {
        field5520++;
        if (arg0 == 0) {
            return field5515;
        } else if (arg0 == 1) {
            return field5522;
        } else if (arg0 == 2) {
            return field5523;
        } else if (arg0 == 3) {
            return field5524;
        } else if (arg0 == 4) {
            return field5526;
        } else if (arg0 == 5) {
            return field5527;
        } else if (arg0 == 6) {
            return field5528;
        } else if (arg1 >= -6) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;", line = 108)
    public final String toString() {
        field5525++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IILjt;)V", line = 133)
    private class385(int arg0, int arg1, class38 arg2) {
        this.field5517 = arg1;
        this.field5521 = arg2;
        this.field5519 = arg0;
        this.field5516 = this.field5521.field460 * this.field5517;
        if (this.field5519 >= 16) {
            throw new RuntimeException();
        }
    }
}
