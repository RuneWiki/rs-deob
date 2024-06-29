import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class427 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6347 = null;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lko;")
    public static class347 field6346 = new class347("RC", 1);

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    public static int[] field6351;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lng;")
    public static class226 field6352;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lkc;")
    public static class86 field6349;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method2563(byte arg0) {
        class295.field4197 = null;
        class369.field5593 = -1;
        if (arg0 != -64) {
            field6349 = null;
        }
        field6350++;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public static void method2564(byte arg0) {
        field6346 = null;
        if (arg0 == -16) {
            field6352 = null;
            field6347 = null;
            field6351 = null;
            field6349 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Lkl;")
    public static final class54 method2565(byte arg0) {
        field6348++;
        if (arg0 != 116) {
            return null;
        }
        class54 var1 = (class54) class148.field2360.method1679(255);
        if (var1 != null) {
            var1.method2090(-1);
            var1.method1382(7218);
            return var1;
        }
        class54 var2;
        do {
            var2 = (class54) class504.field7439.method1679(255);
            if (var2 == null) {
                return null;
            }
            if (var2.method478(arg0 ^ 0x2425) > class211.method1419(12921)) {
                return null;
            }
            var2.method2090(-1);
            var2.method1382(7218);
        } while ((var2.field2927 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    static {
        new class342(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field6351 = new int[5];
        field6353 = 1;
    }
}
