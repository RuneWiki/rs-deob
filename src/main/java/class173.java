import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class173 extends class28 {

    @OriginalMember(owner = "client!i", name = "j", descriptor = "F")
    public static float field2159 = 0.25F;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method1150(byte arg0) {
        field2161++;
        if (arg0 < 93) {
            method1150((byte) -35);
        }
        for (class192 var1 = (class192) class234.field3049.method374((byte) 51); var1 != null; var1 = (class192) class234.field3049.method372(-20740)) {
            if (var1.field2504 > 0) {
                var1.field2504--;
            }
            if (var1.field2504 != 0) {
                if (var1.field2501 > 0) {
                    var1.field2501--;
                }
                if (var1.field2501 == 0 && var1.field2493 >= 1 && var1.field2487 >= 1 && (class588.field8082 - 2) >= var1.field2493 && (class12.field113 - 2) >= var1.field2487 && (var1.field2502 < 0 || class518.method2946(var1.field2502, var1.field2500, -12))) {
                    class622.method3404(var1.field2493, var1.field2494, -1, var1.field2487, (byte) -57, var1.field2502, var1.field2500, var1.field2497, var1.field2496);
                    var1.field2501 = -1;
                    if (var1.field2502 == var1.field2498 && var1.field2498 == -1) {
                        var1.method175(30604);
                    } else if (var1.field2502 == var1.field2498 && var1.field2497 == var1.field2495 && var1.field2500 == var1.field2499) {
                        var1.method175(30604);
                    }
                }
            } else if (var1.field2498 < 0 || class518.method2946(var1.field2498, var1.field2499, -12)) {
                class622.method3404(var1.field2493, var1.field2494, -1, var1.field2487, (byte) -95, var1.field2498, var1.field2499, var1.field2495, var1.field2496);
                var1.method175(30604);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)I")
    public static final int method1151(byte arg0) {
        if (arg0 < 93) {
            return 13;
        } else {
            field2162++;
            return class511.field6888;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)[Lsaa;")
    public static final class507[] method1152(boolean arg0) {
        if (!arg0) {
            field2159 = 0.39732155F;
        }
        field2160++;
        return new class507[] { class333.field4859, class164.field2067, class577.field7972, class335.field4924, class667.field9492, class75.field952 };
    }
}
