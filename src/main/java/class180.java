import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class180 {

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2691 = "Cancel";

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "J")
    public long field2686;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lbf;")
    public class205 field2689;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Laa;")
    public static final class172 method1193(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field360; var4++) {
            class172 var5 = var3.field358[var4];
            if ((var5.field2569 >> 29 & 0x3L) == 2L && var5.field2558 == arg1 && var5.field2560 == arg2) {
                class75.method595(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lba;")
    public static final class169 method1194(byte arg0) {
        field2690++;
        if (arg0 != -56) {
            return null;
        }
        try {
            return (class169) Class.forName("ij").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public static void method1195(boolean arg0) {
        if (arg0) {
            field2691 = null;
        }
    }
}
