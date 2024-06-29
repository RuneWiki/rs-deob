import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class354 extends class261 {

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lmf;")
    public class291 field5220 = new class291();

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field5222 = 1407;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
    public static final int method2188(byte arg0) {
        field5223++;
        if ((double) class319.field4856 == 3.0D) {
            return 37;
        } else if ((double) class319.field4856 == 4.0D) {
            return 50;
        } else if ((double) class319.field4856 == 6.0D) {
            return 75;
        } else if ((double) class319.field4856 == 8.0D) {
            return 100;
        } else if (arg0 == -127) {
            return 200;
        } else {
            return 22;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lub;")
    public static final class18 method2189(int arg0) {
        field5219++;
        class18 var1 = (class18) class150.field2465.method779(1);
        if (var1 != null) {
            var1.method1676(true);
            var1.method1289((byte) 123);
            return var1;
        } else if (arg0 == 100) {
            class18 var2;
            do {
                var2 = (class18) class20.field318.method779(1);
                if (var2 == null) {
                    return null;
                }
                if (var2.method118((byte) 12) > class423.method2578(-19698)) {
                    return null;
                }
                var2.method1676(true);
                var2.method1289((byte) 118);
            } while ((var2.field3034 & Long.MIN_VALUE) == 0L);
            return var2;
        } else {
            return null;
        }
    }
}
