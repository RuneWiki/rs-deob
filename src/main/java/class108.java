import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class108 {

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "Lbja;")
    public static class34 field1356 = new class34(6, 0, 4, 2);

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "Llja;")
    public static class744 field1359 = new class744(26, -1);

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field1360 = 0;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "Lfj;")
    public static class684 field1361 = new class684(3, 4);

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "Lbia;")
    public class525 field1357;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
    public static void method874(int arg0) {
        field1361 = null;
        if (arg0 < 80) {
            field1359 = null;
        }
        field1359 = null;
        field1356 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
    public static final void method875(int arg0) {
        class118.field1503.method4295(class118.field1503.field10676, 1, false);
        field1354++;
        class118.field1503.method4295(class118.field1503.field10632, 1, false);
        class118.field1503.method4295(class118.field1503.field10652, 2, false);
        class118.field1503.method4295(class118.field1503.field10650, 2, false);
        class118.field1503.method4295(class118.field1503.field10649, 1, false);
        class118.field1503.method4295(class118.field1503.field10677, 1, false);
        class118.field1503.method4295(class118.field1503.field10659, 1, false);
        class118.field1503.method4295(class118.field1503.field10660, 1, false);
        class118.field1503.method4295(class118.field1503.field10664, 1, false);
        class118.field1503.method4295(class118.field1503.field10641, 1, false);
        class118.field1503.method4295(class118.field1503.field10672, 2, false);
        class118.field1503.method4295(class118.field1503.field10628, 1, false);
        class118.field1503.method4295(class118.field1503.field10675, 2, false);
        class118.field1503.method4295(class118.field1503.field10657, 1, false);
        class118.field1503.method4295(class118.field1503.field10631, 0, false);
        class118.field1503.method4295(class118.field1503.field10648, 0, false);
        if (arg0 != 28007) {
            return;
        }
        class118.field1503.method4295(class118.field1503.field10643, 2, false);
        class118.field1503.method4295(class118.field1503.field10658, 0, false);
        class118.field1503.method4295(class118.field1503.field10667, 0, false);
        class573.method3325(arg0 ^ 0xFFFF9298);
        class118.field1503.method4295(class118.field1503.field10639, 0, false);
        class118.field1503.method4295(class118.field1503.field10647, 4, false);
        class725.method4110((byte) 114);
        class185.method1233(arg0 - 52504);
        class723.field10141 = true;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
    public static final void method876(byte arg0) {
        field1355++;
        class250.field2935.method1690(0);
        if (arg0 != 85) {
            field1356 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)V")
    public static final void method877(byte arg0) {
        field1358++;
        if (arg0 != -128) {
            method874(-14);
        }
        for (int var1 = 0; var1 < class124.field1585.length; var1++) {
            for (int var2 = 0; var2 < class124.field1585[0].length; var2++) {
                for (int var3 = 0; var3 < class124.field1585[0][0].length; var3++) {
                    class124.field1585[var1][var2][var3] = 0;
                }
            }
        }
    }
}
