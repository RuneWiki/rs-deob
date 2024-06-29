import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class25 {

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "Lpca;")
    private class714 field347 = new class714(64);

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "Lfp;")
    private class323 field350;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field341 = 0;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "Lqfa;")
    public static class98 field346 = new class98(38, -2);

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "Liq;")
    public static class605 field349;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)Lkca;")
    public final class82 method154(int arg0, byte arg1) {
        field343++;
        class714 var3 = this.field347;
        class82 var4;
        synchronized (this.field347) {
            var4 = (class82) this.field347.method4022((long) arg0, (byte) -82);
            if (arg1 > -68) {
                this.method157((byte) -40);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field350;
        byte[] var6;
        synchronized (this.field350) {
            var6 = this.field350.method2100(arg0, (byte) 112, 11);
        }
        class82 var7 = new class82();
        if (var6 != null) {
            var7.method636(new class675(var6), -1);
        }
        class714 var8 = this.field347;
        synchronized (this.field347) {
            this.field347.method4018((byte) 126, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public final void method155(int arg0) {
        if (arg0 != 0) {
            this.field350 = null;
        }
        class714 var2 = this.field347;
        synchronized (this.field347) {
            this.field347.method4023((byte) 109);
        }
        field342++;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
    public static void method156(int arg0) {
        if (arg0 != 0) {
            method159((byte) -26);
        }
        field349 = null;
        field346 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        field348++;
        class714 var2 = this.field347;
        synchronized (this.field347) {
            this.field347.method4024(0);
        }
        if (arg0 >= -48) {
            this.method158(52, (byte) 69);
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(IB)V")
    public final void method158(int arg0, byte arg1) {
        field345++;
        class714 var3 = this.field347;
        synchronized (this.field347) {
            this.field347.method4016(arg0, (byte) -73);
            if (arg1 < 24) {
                this.method158(-43, (byte) -39);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)V")
    public static final void method159(byte arg0) {
        field344++;
        if (arg0 < 72) {
            method159((byte) 89);
        }
        class263.field3799.method483(class274.field3912);
        class263.field3799.method391(class519.field7385, class596.field8383, class467.field6618, class195.field2603);
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lsaa;ILfp;)V")
    public class25(class326 arg0, int arg1, class323 arg2) {
        this.field350 = arg2;
        if (this.field350 != null) {
            this.field350.method2084(11, 0);
        }
    }
}
