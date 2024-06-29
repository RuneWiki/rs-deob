import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class289 {

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    private int field3617 = 0;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lwa;")
    private class661 field3615;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lgga;")
    private class333 field3611;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field3614;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Lgga;")
    public final class333 method1683(int arg0) {
        field3610++;
        if (arg0 > ~this.field3617 && this.field3615.field9273[this.field3617 - 1] != this.field3611) {
            class333 var2 = this.field3611;
            this.field3611 = var2.field4181;
            return var2;
        }
        while (this.field3617 < this.field3615.field9270) {
            class333 var3 = this.field3615.field9273[this.field3617++].field4181;
            if (this.field3615.field9273[this.field3617 - 1] != var3) {
                this.field3611 = var3.field4181;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public static void method1684(int arg0) {
        field3614 = null;
        if (arg0 != -1) {
            field3612 = -106;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lwp;Lwp;B)V")
    public static final void method1685(class452 arg0, class452 arg1, byte arg2) {
        class74.field773++;
        field3616++;
        class653 var3 = class699.method3845((byte) 45, class39.field395, class309.field3816);
        var3.field9158.method660((byte) 54, arg0.field6339);
        if (arg2 >= -57) {
            return;
        }
        var3.field9158.method660((byte) 47, arg1.field6339);
        var3.field9158.method621(true, arg0.field6360);
        var3.field9158.method612(false, arg0.field6434);
        var3.field9158.method645(-672168216, arg1.field6360);
        var3.field9158.method612(false, arg1.field6434);
        class568.method3220(var3, (byte) 29);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Lgga;")
    public final class333 method1686(byte arg0) {
        field3613++;
        this.field3617 = 0;
        if (arg0 != -4) {
            this.field3617 = -76;
        }
        return this.method1683(-1);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
    public class289() {
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lwa;)V")
    public class289(class661 arg0) {
        this.field3615 = arg0;
    }
}
