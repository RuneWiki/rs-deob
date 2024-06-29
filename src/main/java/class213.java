import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class213 implements class196 {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
    public static boolean field2981 = true;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lor;")
    public static class594 field2982;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Llo;")
    public static class700 field2984;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method1371(byte arg0) {
        field2984 = null;
        if (arg0 == -121) {
            field2982 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lll;")
    public static final class333 method1372(Canvas arg0, int arg1) {
        field2983++;
        try {
            if (arg1 >= -70) {
                return null;
            } else {
                Class var2 = Class.forName("bfa");
                class333 var3 = (class333) var2.getDeclaredConstructor().newInstance();
                var3.method864(0, arg0);
                return var3;
            }
        } catch (Throwable var5) {
            class120 var4 = new class120();
            var4.method864(0, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Loh;")
    public final class370 method640(int arg0) {
        field2987++;
        return arg0 == 58 ? client.field3715 : null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
    public class213(int arg0) {
        this.field2985 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1373(int arg0, int arg1, boolean arg2) {
        field2986++;
        if (arg2) {
            field2981 = true;
        }
        return (arg0 & 0x84080) != 0;
    }
}
