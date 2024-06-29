import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class16 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field292 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Ljava/lang/String;")
    public static String field296 = "flash1:";

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
    public static final void method116(boolean arg0, int arg1) {
        class287.field4391 = 1;
        class280.field4299 = -1;
        class181.field2643 = 0;
        if (!arg0) {
            method120(44);
        }
        class11.field162 = null;
        field291++;
        class133.field1952 = -1;
        class141.field2034 = false;
        class37.field649 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Lqh;")
    public static final class29 method117(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        return var3 == null || var3.field3033 == null ? null : var3.field3033;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method118(byte arg0) {
        field292 = null;
        if (arg0 != 6) {
            field292 = null;
        }
        field296 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method119(String arg0, int arg1) {
        field295++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg1 != -1) {
            method118((byte) 75);
        }
        while (var2 < class3.field36) {
            if (arg0.equalsIgnoreCase(class22.field368[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static final void method120(int arg0) {
        class141.field2030.method944(65535);
        field294++;
        if (arg0 != -1) {
            field292 = null;
        }
    }
}
