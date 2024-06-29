import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class127 {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lhj;")
    public static class69 field2329 = class181.method1318("Ausw-=hlen", (byte) -107);

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lla;")
    public static class93 field2330 = new class93();

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lhj;")
    private static class69 field2331 = class181.method1318("FULL", (byte) -125);

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lhj;")
    public static class69 field2332 = field2331;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
    public static final int method903(int arg0, int arg1) {
        field2328++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0 < 19) {
            return -23;
        } else {
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static final void method904(int arg0) {
        if (arg0 == -1) {
            class166.field3055.method1709((byte) -117);
            class235.field4284.method1709((byte) -45);
            field2325++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method905(byte arg0) {
        if (arg0 < -88) {
            field2331 = null;
            field2332 = null;
            field2330 = null;
            field2329 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public static final void method906(byte arg0) {
        field2326++;
        class272 var1 = (class272) class38.field528.method1724(255);
        if (arg0 >= -30) {
            field2331 = null;
        }
        while (var1 != null) {
            if (var1.field4823 > 0) {
                var1.field4823--;
            }
            if (var1.field4823 != 0) {
                if (var1.field4812 > 0) {
                    var1.field4812--;
                }
                if (var1.field4812 == 0 && var1.field4809 >= 1 && var1.field4808 >= 1 && var1.field4809 <= 102 && var1.field4808 <= 102 && (var1.field4811 < 0 || class188.method1373((byte) 54, var1.field4811, var1.field4824))) {
                    class14.method74(var1.field4824, var1.field4822, var1.field4808, -62, var1.field4811, var1.field4809, var1.field4815, var1.field4817);
                    var1.field4812 = -1;
                    if (var1.field4813 == var1.field4811 && var1.field4813 == -1) {
                        var1.method632(-8296);
                    } else if (var1.field4813 == var1.field4811 && var1.field4822 == var1.field4810 && var1.field4824 == var1.field4819) {
                        var1.method632(-8296);
                    }
                }
            } else if (var1.field4813 < 0 || class188.method1373((byte) 54, var1.field4813, var1.field4819)) {
                class14.method74(var1.field4819, var1.field4810, var1.field4808, 17, var1.field4813, var1.field4809, var1.field4815, var1.field4817);
                var1.method632(-8296);
            }
            var1 = (class272) class38.field528.method1726(113);
        }
    }
}
