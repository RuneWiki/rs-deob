import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class148 {

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "Lsw;")
    private class641 field1770 = new class641(16);

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "Ldn;")
    private class438 field1768;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "[[S")
    public static short[][] field1767 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
    public static int field1775 = 0;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "Lcea;")
    public static class180 field1769 = new class180("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "[[B")
    public static byte[][] field1777;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)Leu;")
    public final class405 method813(int arg0, int arg1) {
        field1771++;
        class641 var3 = this.field1770;
        class405 var4;
        synchronized (this.field1770) {
            var4 = (class405) this.field1770.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field1768;
        byte[] var6;
        synchronized (this.field1768) {
            var6 = this.field1768.method2558(100, arg1, arg0);
        }
        class405 var7 = new class405();
        if (var6 != null) {
            var7.method2310(new class374(var6), 0);
        }
        class641 var8 = this.field1770;
        synchronized (this.field1770) {
            this.field1770.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lfp;IIB)J")
    public static final long method814(class269 arg0, int arg1, int arg2, byte arg3) {
        field1774++;
        long var4 = 4194304L;
        if (arg3 >= -26) {
            field1769 = null;
        }
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class437 var10 = class16.field126.method1759(false, arg0.method342(-2329));
        long var11 = (long) (arg1 | arg2 << 7 | arg0.method337(true) << 14 | arg0.method333((byte) 70) << 20 | 0x40000000);
        if (var10.field5972 == 0) {
            var11 |= var8;
        }
        if (var10.field6007 == 1) {
            var11 |= var4;
        }
        if (var10.field5965) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method342(-2329) << 32;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
    public static void method815(int arg0) {
        field1767 = null;
        if (arg0 == 8076) {
            field1777 = null;
            field1769 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
    public final void method816(byte arg0) {
        class641 var2 = this.field1770;
        synchronized (this.field1770) {
            this.field1770.method3694(0);
        }
        field1773++;
        if (arg0 != -75) {
            method815(-42);
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)V")
    public final void method817(byte arg0) {
        class641 var2 = this.field1770;
        synchronized (this.field1770) {
            this.field1770.method3687(1402);
            if (arg0 != -68) {
                this.field1768 = null;
            }
        }
        field1772++;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lre;ILdn;)V")
    public class148(class515 arg0, int arg1, class438 arg2) {
        this.field1768 = arg2;
        this.field1768.method2554(30, 123);
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(II)V")
    public final void method818(int arg0, int arg1) {
        field1776++;
        class641 var3 = this.field1770;
        synchronized (this.field1770) {
            if (arg1 == -22691) {
                this.field1770.method3686((byte) 53, arg0);
            }
        }
    }
}
