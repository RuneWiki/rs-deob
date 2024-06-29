import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class221 {

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "[I")
    public static int[] field3174 = new int[4];

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method1555(int arg0, boolean arg1) {
        field3175++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            if (!arg1) {
                field3176 = -116;
            }
            return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + class254.field3761.method2284((byte) -28, class373.field5313) + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class312.field4613.method2284((byte) 90, class373.field5313) + "</col>";
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public static void method1556(byte arg0) {
        if (arg0 < 0) {
            field3174 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)Laf;")
    public static final class250 method1557(byte arg0) {
        field3173++;
        try {
            return new class48();
        } catch (Throwable var2) {
            if (arg0 < 112) {
                method1555(-20, false);
            }
            try {
                return (class250) Class.forName("ha").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class81();
            }
        }
    }
}
