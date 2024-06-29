import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class52 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "J")
    public static long field759 = 0L;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field760 = "flash2:";

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field761 = 0;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method346(int arg0) {
        if (arg0 != -29149) {
            method346(-75);
        }
        field760 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Lug;")
    public static final class270 method347(int arg0) {
        field758++;
        if (arg0 != 0) {
            field761 = -100;
        }
        class270 var1 = (class270) class258.field3912.method1026((byte) 127);
        if (var1 != null) {
            var1.method1706(-113);
            var1.method609(-15747);
            return var1;
        }
        class270 var2;
        do {
            var2 = (class270) class88.field1352.method1026((byte) 125);
            if (var2 == null) {
                return null;
            }
            if (var2.method1810((byte) -125) > class287.method1928(27332)) {
                return null;
            }
            var2.method1706(arg0 ^ 0xFFFFFFAA);
            var2.method609(-15747);
        } while ((var2.field1376 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
