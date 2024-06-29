import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class404 {

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lmga;")
    private class666 field5413 = new class666(64);

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lbi;")
    private class449 field5410;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field5409 = 0;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Lgu;")
    public final class543 method2319(int arg0, byte arg1) {
        field5411++;
        class666 var3 = this.field5413;
        class543 var4;
        synchronized (this.field5413) {
            var4 = (class543) this.field5413.method3750((long) arg0, false);
            if (arg1 != -88) {
                this.field5410 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field5410;
        byte[] var6;
        synchronized (this.field5410) {
            var6 = this.field5410.method2537(false, 32, arg0);
        }
        class543 var7 = new class543();
        if (var6 != null) {
            var7.method3001(-127, new class335(var6));
        }
        class666 var8 = this.field5413;
        synchronized (this.field5413) {
            this.field5413.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public final void method2320(int arg0) {
        field5406++;
        class666 var2 = this.field5413;
        synchronized (this.field5413) {
            int var3 = 84 % ((arg0 + 40) / 40);
            this.field5413.method3748(6);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)V")
    public final void method2321(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        class666 var3 = this.field5413;
        synchronized (this.field5413) {
            this.field5413.method3740((byte) 60, arg0);
        }
        field5412++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)I")
    public static final int method2322(int arg0, int arg1) {
        return class600.field7970 == null ? 0 : class600.field7970[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public final void method2323(byte arg0) {
        class666 var2 = this.field5413;
        synchronized (this.field5413) {
            this.field5413.method3739(0);
        }
        if (arg0 != 112) {
            this.method2321(80, false);
        }
        field5407++;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class404(class671 arg0, int arg1, class449 arg2) {
        this.field5410 = arg2;
        this.field5410.method2527(0, 32);
    }
}
