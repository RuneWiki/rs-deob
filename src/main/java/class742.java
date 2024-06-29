import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class742 {

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lmu;")
    public static class303 field9987 = new class303(77, 4);

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "J")
    public static long field9988 = 0L;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field9984++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 12)
    public static void method4069(int arg0) {
        if (arg0 != 4) {
            method4069(95);
        }
        field9987 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V", line = 23)
    public static final void method4070(int arg0, int arg1, int arg2) {
        field9986++;
        class594 var3 = class692.method3869(arg2, (byte) 105, 5);
        var3.method3378(-25490);
        if (arg1 != -19906) {
            method4069(71);
        }
        var3.field8126 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLjava/lang/Object;II)[B", line = 39)
    public static final byte[] method4071(byte arg0, Object arg1, int arg2, int arg3) {
        field9985++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class675.method3808(arg2, var4, arg3, -104);
        } else {
            if (arg0 < 89) {
                field9987 = null;
            }
            if (!arg1 instanceof class386) {
                throw new IllegalArgumentException();
            }
            class386 var5 = (class386) arg1;
            return var5.method2435(2, arg3, arg2);
        }
    }
}
