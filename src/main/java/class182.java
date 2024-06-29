import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class182 {

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "[I")
    public static int[] field2229 = new int[250];

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field2225 = 1337;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "F")
    public static float field2228;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "Lrfa;")
    public class182 field2226;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "Lna;")
    public class43 field2227;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
    public static void method1127(byte arg0) {
        if (arg0 != 15) {
            field2229 = null;
        }
        field2229 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
    public final void method1128(int arg0) {
        field2230++;
        if (class516.field7548 >= 500) {
            return;
        }
        this.field2227 = null;
        this.field2226 = class557.field8062;
        class516.field7548++;
        int var2 = 79 % ((-arg0 - 53) / 60);
        class557.field8062 = this;
    }
}
