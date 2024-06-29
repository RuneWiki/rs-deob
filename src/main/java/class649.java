import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class649 {

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "Ljava/lang/String;")
    public String field9168;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "Ljava/lang/String;")
    public String field9171;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "Ljava/lang/String;")
    public String field9170;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field9166 = 1405;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "B")
    public static byte field9167;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)Lqba;", line = 5)
    public static final class592 method3645(byte arg0) {
        field9169++;
        class592 var1 = (class592) class670.field9432.method1546((byte) -52);
        if (var1 != null) {
            var1.method1871(-96);
            var1.method2744((byte) -72);
            return var1;
        }
        if (arg0 <= 101) {
            method3645((byte) -103);
        }
        class592 var2;
        do {
            var2 = (class592) class169.field2209.method1546((byte) -108);
            if (var2 == null) {
                return null;
            }
            if (var2.method3255((byte) -108) > class571.method3150(125)) {
                return null;
            }
            var2.method1871(-103);
            var2.method2744((byte) -57);
        } while ((Long.MIN_VALUE & var2.field6874) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)V", line = 54)
    public static final void method3646(byte arg0) {
        if (arg0 > -26) {
            field9166 = 84;
        }
        if (class504.field6675 == 9) {
            class361.method1987(5, -15);
        } else if (class504.field6675 == 5 || class504.field6675 == 6) {
            class361.method1987(3, -117);
        } else if (class504.field6675 == 12) {
            class361.method1987(3, -124);
        }
        field9172++;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 82)
    public class649(String arg0, String arg1, String arg2) {
        this.field9168 = arg0;
        this.field9171 = arg1;
        this.field9170 = arg2;
    }
}
