import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class295 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field4669 = 0;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lgk;")
    public static class159 field4670 = new class159();

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Lsh;")
    public static class218 field4680 = new class218();

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field4682 = -1;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4681 = "Loading textures - ";

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public int field4671;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lpf;")
    public static class294 field4675;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Laf;")
    public class70 field4676;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[I")
    public int[] field4674;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static final void method1977(byte arg0) {
        field4668++;
        int var1 = class192.field2953.method1036(class96.field1514);
        for (int var2 = 0; var2 < class218.field3278; var2++) {
            int var6 = class192.field2953.method1036(class233.method1486(0, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        if (arg0 >= -103) {
            method1981((byte) -17);
        }
        int var3 = class119.field1792;
        int var4 = class218.field3278 * 15 + 21;
        var1 += 8;
        int var5 = class223.field3339 - var1 / 2;
        if (class77.field1245 < var1 + var5) {
            var5 = class77.field1245 - var1;
        }
        if (class180.field2748 < var3 + var4) {
            var3 = class180.field2748 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        if (class176.field2691 != 1) {
            if (class223.field3339 != class205.field3076 || class188.field2872 != class119.field1792) {
                field4669 = class188.field2872;
                class82.field1320 = class205.field3076;
                class176.field2691 = 1;
                return;
            }
            class236.field3558 = var3;
            class32.field470 = class218.field3278 * 15 + (class141.field2060 ? 26 : 22);
            class218.field3275 = true;
            class283.field4239 = var1;
            class213.field3190 = var5;
            class176.field2691 = 0;
        } else if (class82.field1320 == class223.field3339 && field4669 == class119.field1792) {
            class236.field3558 = var3;
            class176.field2691 = 0;
            class283.field4239 = var1;
            class213.field3190 = var5;
            class32.field470 = class218.field3278 * 15 + (class141.field2060 ? 26 : 22);
            class218.field3275 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static final void method1978(int arg0) {
        class139.field2039.method1782(arg0 - 20);
        field4673++;
        if (arg0 != 20) {
            field4670 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 > -101) {
            method1977((byte) -52);
        }
        int var7 = 0;
        class93[] var8 = class101.field1591;
        while (var7 < var8.length) {
            class93 var9 = var8[var7];
            if (var9 != null && var9.field1466 == 2) {
                class236.method1495(arg1, var9.field1465 * 2, (var9.field1474 - class147.field2141 << 7) + var9.field1476, arg6 >> 1, arg2, 2521, (var9.field1468 - class81.field1303 << 7) + var9.field1467, arg5 >> 1);
                if (class3.field65 > -1 && class270.field4058 % 20 < 10) {
                    class112.field1723[var9.field1473].method1274(class3.field65 + arg0 - 12, class262.field3971 + arg3 + -28);
                }
            }
            var7++;
        }
        field4677++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lrf;I)V")
    public static final void method1980(class289 arg0, int arg1) {
        if (arg1 == 0) {
            if (class30.field433 == arg0.field4508) {
                class7.field105[arg0.field4400] = true;
            }
            field4672++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static void method1981(byte arg0) {
        field4681 = null;
        if (arg0 < -107) {
            field4680 = null;
            field4670 = null;
            field4675 = null;
        }
    }
}
