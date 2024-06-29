import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class326 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ldc;")
    private class5 field4754 = new class5(64);

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lhe;")
    private class239 field4756;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[[I")
    public static int[][] field4757 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lwf;")
    public final class84 method1950(int arg0, int arg1) {
        field4755++;
        class5 var3 = this.field4754;
        class84 var4;
        synchronized (this.field4754) {
            var4 = (class84) this.field4754.method40(arg0 - 6, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4756.method1470(4, arg1, 35);
        class84 var6 = new class84();
        if (var5 != null) {
            var6.method531(true, new class156(var5));
        }
        var6.method527(117);
        if (arg0 != 6) {
            this.method1955(-47, (byte) 8);
        }
        class5 var7 = this.field4754;
        synchronized (this.field4754) {
            this.field4754.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLeq;J)V")
    public static final void method1951(byte arg0, class134 arg1, long arg2) {
        class26.field437 = class409.field6001;
        class363.field5462 = 0;
        field4758++;
        class409.field6001 = 0;
        long var4 = class109.method653(false);
        if (arg0 != 39) {
            return;
        }
        for (class332 var6 = (class332) class156.field1989.method242(false); var6 != null; var6 = (class332) class156.field1989.method244((byte) -73)) {
            if (var6.method2013(arg1, arg2)) {
                class363.field5462++;
            }
        }
        if (class103.field1389 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class156.field1989.method243(10692) + ", running: " + class363.field5462 + ". Particles: " + class409.field6001 + ". Time taken: " + (class109.method653(false) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public final void method1952(int arg0) {
        field4753++;
        class5 var2 = this.field4754;
        synchronized (this.field4754) {
            this.field4754.method38((byte) -30);
            if (arg0 != -17459) {
                this.method1950(79, 85);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public final void method1953(byte arg0) {
        field4760++;
        if (arg0 < 80) {
            this.method1950(14, 73);
        }
        class5 var2 = this.field4754;
        synchronized (this.field4754) {
            this.field4754.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static void method1954(byte arg0) {
        field4757 = null;
        if (arg0 > -34) {
            method1954((byte) 50);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
    public final void method1955(int arg0, byte arg1) {
        field4759++;
        class5 var3 = this.field4754;
        synchronized (this.field4754) {
            this.field4754.method39(false, arg0);
        }
        int var4 = 15 / ((-arg1 - 7) / 48);
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lci;ILhe;)V")
    public class326(class298 arg0, int arg1, class239 arg2) {
        this.field4756 = arg2;
        if (this.field4756 != null) {
            this.field4756.method1473(4309, 35);
        }
    }
}
