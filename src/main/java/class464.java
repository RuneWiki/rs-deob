import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class464 {

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "Lcca;")
    public static class464 field6457 = new class464();

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "Lcca;")
    public static class464 field6458 = new class464();

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "Lcca;")
    public static class464 field6459 = new class464();

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "Lcca;")
    public static class464 field6460 = new class464();

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "Z")
    public static boolean field6463 = false;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "[[I")
    public static int[][] field6462 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "Ljn;")
    public static class324 field6464 = new class324(2, 4, 4, 0);

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    public static int field6465 = 0;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "Lgaa;")
    public static class72 field6461;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V", line = 4)
    public static void method2843(int arg0) {
        field6459 = null;
        field6464 = null;
        field6462 = null;
        field6461 = null;
        field6457 = null;
        if (arg0 == 7373) {
            field6458 = null;
            field6460 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "toString", descriptor = "()Ljava/lang/String;", line = 26)
    public final String toString() {
        field6456++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)V", line = 34)
    public static final void method2844(int arg0, int arg1, int arg2, int arg3) {
        field6455++;
        int var4 = -16 % ((arg1 - 2) / 45);
        int var5 = class113.field1509 + arg3;
        int var6 = class587.field7995 + arg2;
        if (class137.field1948 == null || arg3 < 0 || arg2 < 0 || arg3 >= class277.field4036 || arg2 >= class667.field9202 || class332.field4707.field4774.method1242(0) == 0 && class388.field5601.field4408 != arg0) {
            return;
        }
        long var7 = (long) (var5 | arg0 << 28 | var6 << 14);
        class662 var9 = (class662) class541.field7521.method812(127, var7);
        if (var9 == null) {
            class396.method2469(arg0, arg3, arg2);
            return;
        }
        class520 var10 = (class520) var9.field8785.method3618(-109);
        if (var10 == null) {
            class396.method2469(arg0, arg3, arg2);
            return;
        }
        class394 var11 = (class394) class396.method2469(arg0, arg3, arg2);
        if (var11 == null) {
            var11 = new class394(arg3 << 9, class433.field6043[arg0].method2171(arg2, arg3, 31), arg2 << 9, arg0, arg0);
        } else {
            var11.field5664 = var11.field5650 = -1;
        }
        var11.field5670 = var10.field7251;
        var11.field5672 = var10.field7246;
        label57: while (true) {
            class520 var12 = (class520) var9.field8785.method3619(0);
            if (var12 == null) {
                break;
            }
            if (var11.field5672 != var12.field7246) {
                var11.field5664 = var12.field7246;
                var11.field5661 = var12.field7251;
                while (true) {
                    class520 var13 = (class520) var9.field8785.method3619(0);
                    if (var13 == null) {
                        break label57;
                    }
                    if (var11.field5672 != var13.field7246 && var11.field5664 != var13.field7246) {
                        var11.field5658 = var13.field7251;
                        var11.field5650 = var13.field7246;
                    }
                }
            }
        }
        int var14 = class737.method4102((byte) 19, (arg3 << 9) + 256, (arg2 << 9) + 256, arg0);
        var11.field4410 = arg3 << 9;
        var11.field4419 = (byte) arg0;
        var11.field4413 = var14;
        var11.field4408 = (byte) arg0;
        var11.field5668 = 0;
        var11.field4418 = arg2 << 9;
        if (class479.method2918(arg2, true, arg3)) {
            var11.field4419++;
        }
        class538.method3186(arg0, arg3, arg2, var14, var11);
    }
}
