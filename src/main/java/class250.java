import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class250 {

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I[B)Z", line = 3)
    public static final boolean method1494(int arg0, byte[] arg1) {
        field3237++;
        class611 var2 = new class611(arg1);
        int var3 = var2.method3428((byte) -100);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3428((byte) -123) == 1;
        if (var4) {
            class541.method2996(2, var2);
        }
        int var5 = -95 % ((-arg0 - 30) / 48);
        class757.method4214(104, var2);
        return true;
    }
}
