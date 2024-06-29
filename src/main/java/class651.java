import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class651 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[[Z")
    public static boolean[][] field9090 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lin;")
    public static class97 field9092 = new class97();

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    public static int[] field9093 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field9094 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 3)
    public static void method3729(int arg0) {
        field9093 = null;
        field9090 = null;
        if (arg0 >= 69) {
            field9092 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I", line = 27)
    public static final int method3730(int arg0) {
        field9089++;
        if (arg0 <= 118) {
            field9090 = null;
        }
        byte var1;
        if (class54.field676 < 96) {
            var1 = 1;
            class142.method1016(104, true);
        } else {
            int var2 = class592.method3444((byte) 115);
            if (var2 <= 100) {
                class563.method3322((byte) 40);
                var1 = 4;
            } else if (var2 <= 500) {
                var1 = 3;
                class424.method2567(0);
            } else if (var2 <= 1000) {
                class474.method2821(106);
                var1 = 2;
            } else {
                var1 = 1;
                class142.method1016(41, true);
            }
        }
        if (class21.field353.field10098.method1588(-55) != 0) {
            class21.field353.method4080(true, class21.field353.field10076, 0);
            class9.method61(0, false, (byte) -40);
        }
        class580.method3397((byte) 13);
        return var1;
    }
}
