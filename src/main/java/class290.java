import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class290 implements class47 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Lsea;")
    public static class648 field3993;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 7)
    public static void method1785(byte arg0) {
        if (arg0 >= 41) {
            field3993 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILni;Llh;)Lba;", line = 18)
    public static final class352 method1786(int arg0, class482 arg1, class487 arg2) {
        field3991++;
        class352 var3 = class125.method900(0);
        var3.field4682 = arg2.field6684;
        var3.field4685 = arg2;
        if (var3.field4682 == -1) {
            var3.field4686 = new class455(260);
        } else if (var3.field4682 == -2) {
            var3.field4686 = new class455(10000);
        } else if (var3.field4682 <= 18) {
            var3.field4686 = new class455(20);
        } else if (var3.field4682 <= 98) {
            var3.field4686 = new class455(100);
        } else {
            var3.field4686 = new class455(260);
        }
        var3.field4686.method2589((byte) 82, arg1);
        if (arg0 != 98) {
            method1786(-68, null, null);
        }
        var3.field4686.method2588(-7065, var3.field4685.method2766(0));
        var3.field4681 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!en", name = "toString", descriptor = "()Ljava/lang/String;", line = 57)
    public final String toString() {
        field3994++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 70)
    public class290(String arg0, int arg1) {
        this.field3992 = arg1;
    }
}
