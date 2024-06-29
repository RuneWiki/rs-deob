import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class10 {

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Lfn;")
    public static class52 field191 = new class52(74, 6);

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "[I")
    public static int[] field194 = new int[2048];

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[I")
    public static int[] field193 = new int[2048];

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Lkm;")
    public static class487 field192;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method98(int arg0, int arg1) {
        if (arg1 == -14) {
            field190++;
            return arg0 == 50 || arg0 == 23 || arg0 == 1004 || arg0 == 13 || arg0 == 59;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 17)
    public static final void method99(int arg0) {
        field189++;
        class169 var1 = null;
        try {
            if (arg0 <= 95) {
                method99(48);
            }
            class420 var2 = class343.field4703.method123(false);
            while (var2.field5789 == 0) {
                class258.method1603(-649, 1L);
            }
            if (var2.field5789 == 1) {
                var1 = (class169) var2.field5791;
                class425 var3 = new class425(class439.field6024 * 6 + 3);
                var3.method2470((byte) -74, 1);
                var3.method2462(class439.field6024, (byte) -123);
                for (int var4 = 0; var4 < class64.field975.length; var4++) {
                    if (class2.field19[var4]) {
                        var3.method2462(var4, (byte) -123);
                        var3.method2481(class64.field975[var4], true);
                    }
                }
                var1.method1048(0, var3.field5886, var3.field5830, false);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1044(true);
            }
        } catch (Exception var5) {
        }
        class30.field493 = class193.method1237(-9581);
        class146.field2067 = false;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILjava/util/Random;)I", line = 75)
    public static final int method100(byte arg0, int arg1, Random arg2) {
        field188++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class52.method411((byte) 120, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            if (arg0 > -50) {
                field194 = null;
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class240.method1506(arg1, var4, -1254419329);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 112)
    public static void method101(int arg0) {
        field194 = null;
        if (arg0 == 27523) {
            field192 = null;
            field193 = null;
            field191 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B[B)Lni;", line = 125)
    public static final class33 method102(byte arg0, byte[] arg1) {
        field187++;
        class33 var2 = new class33();
        class425 var3 = new class425(arg1);
        var3.field5830 = var3.field5886.length - 2;
        int var4 = var3.method2508(true);
        int var5 = var3.field5886.length - var4 - 2 - 12;
        var3.field5830 = var5;
        int var6 = var3.method2502((byte) -86);
        var2.field524 = var3.method2508(true);
        var2.field526 = var3.method2508(true);
        var2.field534 = var3.method2508(true);
        var2.field528 = var3.method2508(true);
        int var7 = var3.method2503(true);
        if (var7 > 0) {
            var2.field531 = new class454[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2508(true);
                class454 var10 = new class454(class406.method2388(var9, -124));
                var2.field531[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2502((byte) -86);
                    int var12 = var3.method2502((byte) -86);
                    var10.method2620((long) var11, new class128(var12), false);
                }
            }
        }
        var3.field5830 = 0;
        var2.field536 = var3.method2495(-161911157);
        var2.field527 = new int[var6];
        var2.field538 = new int[var6];
        var2.field529 = new String[var6];
        if (arg0 != 30) {
            return null;
        }
        int var13 = 0;
        while (var3.field5830 < var5) {
            int var14 = var3.method2508(true);
            if (var14 == 3) {
                var2.field529[var13] = var3.method2464(false).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field527[var13] = var3.method2503(true);
            } else {
                var2.field527[var13] = var3.method2502((byte) -86);
            }
            var2.field538[var13++] = var14;
        }
        return var2;
    }
}
