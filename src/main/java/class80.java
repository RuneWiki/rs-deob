import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class80 extends class50 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1087 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "J")
    public static volatile long field1091 = 0L;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "[I")
    public static int[] field1092 = new int[4];

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lvc;")
    public static class137 field1090;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V", line = 5)
    public static final void method590(boolean arg0, boolean arg1) {
        class184.field2982 = arg1;
        class130.field1927 = !class154.method1119((byte) 16);
        field1089++;
        if (!arg0) {
            field1087 = (BigInteger) null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 20)
    public static void method591(boolean arg0) {
        if (!arg0) {
            field1087 = (BigInteger) null;
        }
        field1092 = null;
        field1087 = null;
        field1090 = null;
    }
}
