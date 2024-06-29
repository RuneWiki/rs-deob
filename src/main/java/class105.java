import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class105 extends class493 {

    @OriginalMember(owner = "client!co", name = "C", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1711;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field1705 = -1;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "J")
    public static long field1708;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "Lri;")
    public static class97 field1707;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lie;B)Lng;")
    public static final class314 method997(class6 arg0, byte arg1) {
        arg0.method70(-9059);
        int var2 = 28 / ((21 - arg1) / 41);
        field1703++;
        int var3 = arg0.method70(-9059);
        class314 var4 = class99.method963(var3, 21959);
        var4.field4925 = arg0.method70(-9059);
        int var5 = arg0.method70(-9059);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg0.method70(-9059);
            var4.method5((byte) -46, arg0, var7);
        }
        var4.method3((byte) -15);
        return var4;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BLr;)V")
    public static final void method998(byte arg0, class167 arg1) {
        field1709++;
        arg1.method352(0, 0, class56.field732, 350);
        arg1.method335(0, 0, class56.field732, 350, class385.field5986 << 24 | 0x332277, 1);
        int var2 = 350 / class475.field7033;
        if (class706.field9990 > 0) {
            int var3 = 346 - class475.field7033 - 4;
            int var4 = var2 * var3 / (class706.field9990 + var2 - 1);
            int var5 = 4;
            if (class706.field9990 > 1) {
                var5 += (class706.field9990 - class106.field1729 - 1) * (var3 - var4) / (class706.field9990 - 1);
            }
            arg1.method335(class56.field732 - 16, var5, 12, var4, class385.field5986 << 24 | 0x332277, 2);
            for (int var6 = class106.field1729; class106.field1729 + var2 > var6 && var6 < class706.field9990; var6++) {
                String[] var7 = class698.method3944('\b', class589.field8381[var6], -4);
                int var8 = (class56.field732 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method352(var10, 0, var8 + var10 - 8, 350);
                    class573.field8183.method2657(class474.method2944(8, var7[var9]), -16777216, var10, -1, 350 - (var6 - class106.field1729) * class475.field7033 - class615.field8742 - class125.field2057.field8893 - 2, (byte) -109);
                }
            }
        }
        class329.field5095.method2655(330, -16777216, class56.field732 - 25, -1, "Build: 625", (byte) 71);
        arg1.method352(0, 0, class56.field732, 350);
        arg1.method1348(-1, class56.field732, 0, 3, 350 - class615.field8742);
        class246.field3928.method2657("--> " + class474.method2944(8, class66.field855), -16777216, 10, -1, 349 - class35.field508.field8893, (byte) -71);
        if (arg0 <= 9) {
            field1705 = 44;
        }
        if (!class437.field6669) {
            return;
        }
        int var11 = -1;
        if (class562.field8084 % 30 > 15) {
            var11 = 16777215;
        }
        arg1.method1347(class35.field508.method3672("--> " + class474.method2944(8, class66.field855).substring(0, class384.field5944), false) + 10, -class35.field508.field8893 + -11 + 350, 12, 127, var11);
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public static void method999(int arg0) {
        if (arg0 != 350) {
            method997(null, (byte) -61);
        }
        field1707 = null;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
    public final void method1000(int arg0) {
        this.field1711.method3615();
        field1704++;
        if (arg0 != 8) {
            method998((byte) 46, null);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lkfa;IBII)V")
    public static final void method1001(class559 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1706++;
        long var5 = (long) (arg3 << 28 | arg1 << 14 | arg4);
        class138 var7 = (class138) class290.field4590.method1558(var5, (byte) -93);
        if (var7 == null) {
            class138 var8 = new class138();
            class290.field4590.method1564(var5, var8, (byte) 110);
            var8.field2332.method3463((byte) -87, arg0);
        } else if (arg2 == 8) {
            class117 var9 = class91.field1083.method2859(arg0.field8072, (byte) 123);
            int var10 = var9.field1828;
            if (var9.field1845 == 1) {
                var10 = (arg0.field8071 + 1) * var10;
            }
            for (class559 var11 = (class559) var7.field2332.method3465((byte) 126); var11 != null; var11 = (class559) var7.field2332.method3469(0)) {
                class117 var12 = class91.field1083.method2859(var11.field8072, (byte) 127);
                int var13 = var12.field1828;
                if (var12.field1845 == 1) {
                    var13 = (var11.field8071 + 1) * var13;
                }
                if (var13 < var10) {
                    class37.method474(arg0, false, var11);
                    return;
                }
            }
            var7.field2332.method3463((byte) -87, arg0);
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V")
    public class105(int arg0) {
        this.field1711 = new NativeHeap(arg0);
    }
}
