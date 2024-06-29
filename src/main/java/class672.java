import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class672 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Lqfa;")
    public static class85 field9571 = new class85(30, -1);

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field9574 = 0;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IC)Z")
    public static final boolean method3790(int arg0, char arg1) {
        field9572++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else {
            if (arg0 != -27929) {
                field9571 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Lbu;")
    public static final class19 method3791(int arg0) {
        field9573++;
        class19 var1 = (class19) class33.field963.method3024(arg0 + 5572);
        if (var1 != null) {
            var1.method2588(300);
            var1.method3813(123);
            return var1;
        }
        if (arg0 != 0) {
            field9574 = -39;
        }
        class19 var2;
        do {
            var2 = (class19) class512.field7234.method3024(5572);
            if (var2 == null) {
                return null;
            }
            if (var2.method436(-10989) > class525.method3074((byte) -101)) {
                return null;
            }
            var2.method2588(300);
            var2.method3813(-98);
        } while ((var2.field9628 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public static void method3792(int arg0) {
        field9571 = null;
        if (arg0 != 24407) {
            method3790(-35, 't');
        }
    }
}
