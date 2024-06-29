import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class19 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljava/lang/String;")
    public static String field211 = "Loaded textures";

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Ljava/lang/String;")
    public static String field215 = "Prepared sound engine";

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field212 = -1;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "[I")
    public static int[] field214;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method128(int arg0) {
        if (arg0 == -64) {
            field211 = null;
            field215 = null;
            field214 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Lcg;")
    public static final class169 method129(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class169 var4 = var3.field4525;
            var3.field4525 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
    public static final boolean method130(int arg0, int arg1) {
        field209++;
        int var2 = 90 % ((2 - arg1) / 63);
        return arg0 >= 0 && class11.field132.length > arg0 ? class11.field132[arg0] : false;
    }
}
