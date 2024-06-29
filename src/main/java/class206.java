import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class206 extends class28 {

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Lgj;")
    public class654 field2651;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "Lbn;")
    public static class465 field2649 = new class465(14, 1);

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lbn;")
    public static class465 field2653 = new class465(15, 4);

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "Lbn;")
    public static class465 field2654 = new class465(16, -2);

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "Lbn;")
    public static class465 field2655 = new class465(17, 0);

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "Lbn;")
    public static class465 field2656 = new class465(18, -2);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "Lbn;")
    public static class465 field2657 = new class465(19, -2);

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "Lbn;")
    public static class465 field2658 = new class465(20, 6);

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "Lbn;")
    public static class465 field2659 = new class465(21, 9);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "Lbn;")
    public static class465 field2660 = new class465(22, -2);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "Lbn;")
    public static class465 field2661 = new class465(23, 4);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "Lbn;")
    public static class465 field2662 = new class465(24, -1);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "Lbn;")
    public static class465 field2663 = new class465(25, -2);

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Lbn;")
    public static class465 field2664 = new class465(26, 0);

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "Lbn;")
    public static class465 field2665 = new class465(27, 0);

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "[Lbn;")
    private static class465[] field2666 = new class465[32];

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "[[I")
    public static int[][] field2667;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1326(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
    public static final void method1327(boolean arg0, int arg1) {
        while (true) {
            if (class230.field3069.method2841(8, class88.field1169) >= 15) {
                int var2 = class230.field3069.method2845(15, arg1 + 24);
                if (var2 != 32767) {
                    boolean var3 = false;
                    class234 var4 = (class234) class505.field6640.method39((long) var2, 31750);
                    if (var4 == null) {
                        class532 var5 = new class532();
                        var5.field2960 = var2;
                        var4 = new class234(var5);
                        class505.field6640.method38(var4, arg1 - 105, (long) var2);
                        var3 = true;
                        class93.field1230[class480.field6406++] = var4;
                    }
                    class532 var6 = var4.field3131;
                    class40.field558[class248.field3351++] = var2;
                    var6.field2994 = class424.field5503;
                    if (var6.field6914 != null && var6.field6914.method3822(true)) {
                        class438.method2488(var6, 22299);
                    }
                    int var7 = class230.field3069.method2845(1, 8);
                    int var8 = class230.field3069.method2845(1, 8);
                    if (var8 == 1) {
                        class604.field8188[class642.field8933++] = var2;
                    }
                    int var9;
                    if (arg0) {
                        var9 = class230.field3069.method2845(8, 8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = class230.field3069.method2845(5, arg1 ^ 0xFFFFFFF8);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    int var10 = class230.field3069.method2845(2, 8);
                    var6.method2830((byte) -75, class646.field8998.method519(class230.field3069.method2845(14, 8), 0));
                    int var11;
                    if (arg0) {
                        var11 = class230.field3069.method2845(8, 8);
                        if (var11 > 127) {
                            var11 -= 256;
                        }
                    } else {
                        var11 = class230.field3069.method2845(5, 8);
                        if (var11 > 15) {
                            var11 -= 32;
                        }
                    }
                    int var12 = class230.field3069.method2845(3, arg1 + 24) + 4 << 11 & 0x3F0F;
                    var6.method1434(0, var6.field6914.field9711);
                    var6.field2946 = var6.field6914.field9695 << 3;
                    if (var3) {
                        var6.method1422(var12, -115, true);
                    }
                    var6.method2828(var6.method1265(67), class233.field3130.field3039[0] + var9, class233.field3130.field3030[0] + var11, 4, var7 == 1, var10);
                    if (var6.field6914.method3822(true)) {
                        class64.method535((byte) -109, var6.field3030[0], null, var6, 0, null, var6.field508, var6.field3039[0]);
                    }
                    continue;
                }
            }
            if (arg1 != -16) {
                return;
            }
            field2650++;
            class230.field3069.method2837((byte) -66);
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method1328(byte arg0) {
        field2659 = null;
        field2655 = null;
        field2663 = null;
        field2664 = null;
        field2657 = null;
        field2653 = null;
        field2654 = null;
        field2662 = null;
        field2665 = null;
        field2661 = null;
        field2666 = null;
        field2660 = null;
        if (arg0 != -40) {
            field2659 = null;
        }
        field2649 = null;
        field2658 = null;
        field2667 = null;
        field2656 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)Z")
    public abstract boolean method1329(byte arg0);

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lgj;I)V")
    public class206(class654 arg0, int arg1) {
        this.field2651 = arg0;
        this.field2652 = arg1;
    }

    static {
        class465[] var0 = class629.method3490(570293128);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2666[var0[var1].field6068] = var0[var1];
        }
    }
}
