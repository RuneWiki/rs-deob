import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class178 extends class17 {

    @OriginalMember(owner = "client!rk", name = "db", descriptor = "[I")
    public static int[] field3231 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!rk", name = "gb", descriptor = "[[[I")
    public static int[][][] field3234 = new int[2][][];

    @OriginalMember(owner = "client!rk", name = "fb", descriptor = "I")
    public static int field3233 = 0;

    @OriginalMember(owner = "client!rk", name = "kb", descriptor = "[[S")
    public static short[][] field3238 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!rk", name = "eb", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!rk", name = "hb", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!rk", name = "ib", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rk", name = "lb", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "Lik;")
    public static class262 field3228;

    @OriginalMember(owner = "client!rk", name = "jb", descriptor = "Lik;")
    public static class262 field3237;

    @OriginalMember(owner = "client!rk", name = "cb", descriptor = "[Lvd;")
    public static class135[] field3230;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "(I)V", line = 4)
    public static void method1259(int arg0) {
        field3238 = (short[][]) null;
        field3237 = null;
        field3231 = null;
        if (arg0 != 5157) {
            method1262((class262) null, -19, (byte) -94, 36);
        }
        field3228 = null;
        field3230 = null;
        field3234 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(II)[I", line = 40)
    public final int[] method120(int arg0, int arg1) {
        field3236++;
        if (arg0 >= -95) {
            field3232 = 127;
        }
        int[] var3 = this.field217.method1698(115, arg1);
        if (this.field217.field4295) {
            int var4 = class36.field504[arg1];
            for (int var5 = 0; var5 < class116.field2008; var5++) {
                var3[var5] = this.method1260(var4, (byte) 108, class61.field979[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 80)
    public class178() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)I", line = 85)
    private final int method1260(int arg0, byte arg1, int arg2) {
        field3235++;
        if (arg1 < 42) {
            field3237 = (class262) null;
        }
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lla;ILjava/awt/Frame;)V", line = 105)
    public static final void method1261(class139 arg0, int arg1, Frame arg2) {
        if (arg1 < 12) {
            field3230 = (class135[]) null;
        }
        field3239++;
        while (true) {
            class205 var3 = arg0.method958(arg2, 0);
            while (var3.field3686 == 0) {
                class83.method556(10L, 125);
            }
            if (var3.field3686 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class83.method556(100L, 121);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lik;IBI)Lse;", line = 131)
    public static final class12 method1262(class262 arg0, int arg1, byte arg2, int arg3) {
        field3229++;
        if (class167.method1166(arg0, arg1, (byte) 103, arg3)) {
            return arg2 == -33 ? class191.method1359(arg2 + 35) : (class12) null;
        } else {
            return null;
        }
    }
}
