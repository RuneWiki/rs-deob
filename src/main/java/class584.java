import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class584 extends class626 {

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[B")
    public byte[] field8238;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lqe;")
    public static class465 field8239 = new class465(84, 6);

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "[I")
    public static int[] field8242;

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V")
    public class584(byte[] arg0) {
        this.field8238 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method3375(int arg0, String arg1, int arg2) {
        field8241++;
        class354 var3 = class501.method3012(arg0, 2, 2145997216);
        var3.method2222(-43);
        if (arg2 != -26769) {
            field8240 = -82;
        }
        var3.field4988 = arg1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method3376(byte arg0) {
        field8239 = null;
        int var1 = -55 % ((-arg0 - 11) / 42);
        field8242 = null;
    }
}
