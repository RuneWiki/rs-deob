import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class355 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4735 = -1;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[[Z")
    public static boolean[][] field4736 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 6)
    public static void method2053(byte arg0) {
        if (arg0 >= -11) {
            method2053((byte) -111);
        }
        field4736 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 27)
    public static final void method2054(int arg0) {
        field4734++;
        class13 var1 = null;
        try {
            class107 var2 = class287.field3823.method4143("", true, arg0 + 27480);
            if (arg0 != -5964) {
                return;
            }
            while (var2.field1419 == 0) {
                class267.method1599(arg0 + 5964, 1L);
            }
            if (var2.field1419 == 1) {
                var1 = (class13) var2.field1418;
                class611 var3 = class11.field68.method2279(true);
                var1.method53(var3.field8529, 4657, 0, var3.field8520);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method51(true);
            }
        } catch (Exception var4) {
        }
    }
}
