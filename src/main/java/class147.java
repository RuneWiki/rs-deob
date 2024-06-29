import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class147 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public int field2492;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lve;")
    public static class255 field2494;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "[I")
    public static int[] field2497;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(JI)Lve;", line = 4)
    public static final class255 method1091(long arg0, int arg1) {
        if (arg1 >= -127) {
            return (class255) null;
        }
        field2486++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class187.field3026[(int) (var7 - (arg0 * 37L))];
            }
            class255 var9 = new class255();
            var9.field4297 = var6;
            var9.field4343 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 50)
    public static final void method1092(int arg0) {
        field2490++;
        int var1 = class160.field2692.method1513((byte) 45, 8);
        if (var1 < class309.field5269) {
            for (int var2 = var1; var2 < class309.field5269; var2++) {
                class87.field1413[class103.field1731++] = class259.field4398[var2];
            }
        }
        if (class309.field5269 < var1) {
            throw new RuntimeException("gppov1");
        }
        class309.field5269 = 0;
        int var3 = -102 % ((arg0 + 30) / 57);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class259.field4398[var4];
            class242 var6 = class151.field2555[var5];
            int var7 = class160.field2692.method1513((byte) 45, 1);
            if (var7 == 0) {
                class259.field4398[class309.field5269++] = var5;
                var6.field5122 = class277.field4768;
            } else {
                int var8 = class160.field2692.method1513((byte) 45, 2);
                if (var8 == 0) {
                    class259.field4398[class309.field5269++] = var5;
                    var6.field5122 = class277.field4768;
                    class10.field145[class118.field1985++] = var5;
                } else if (var8 == 1) {
                    class259.field4398[class309.field5269++] = var5;
                    var6.field5122 = class277.field4768;
                    int var9 = class160.field2692.method1513((byte) 45, 3);
                    var6.method2100(false, true, var9);
                    int var10 = class160.field2692.method1513((byte) 45, 1);
                    if (var10 == 1) {
                        class10.field145[class118.field1985++] = var5;
                    }
                } else if (var8 == 2) {
                    class259.field4398[class309.field5269++] = var5;
                    var6.field5122 = class277.field4768;
                    int var11 = class160.field2692.method1513((byte) 45, 3);
                    var6.method2100(true, true, var11);
                    int var12 = class160.field2692.method1513((byte) 45, 3);
                    var6.method2100(true, true, var12);
                    int var13 = class160.field2692.method1513((byte) 45, 1);
                    if (var13 == 1) {
                        class10.field145[class118.field1985++] = var5;
                    }
                } else if (var8 == 3) {
                    class87.field1413[class103.field1731++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)I", line = 170)
    public static final int method1093(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & arg3 - 1;
        int var5 = arg2 / arg3;
        field2487++;
        int var6 = 78 / ((36 - arg0) / 49);
        int var7 = arg1 / arg3;
        int var8 = arg3 - 1 & arg1;
        int var9 = class38.method228(var7, -112, var5);
        int var10 = class38.method228(var7, -111, var5 + 1);
        int var11 = class38.method228(var7 + 1, -123, var5);
        int var12 = class38.method228(var7 + 1, -120, var5 + 1);
        int var13 = class95.method744((byte) -117, arg3, var9, var10, var4);
        int var14 = class95.method744((byte) -122, arg3, var11, var12, var4);
        return class95.method744((byte) -126, arg3, var13, var14, var8);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 209)
    public static void method1094(byte arg0) {
        field2494 = null;
        if (arg0 >= -103) {
            method1094((byte) -68);
        }
        field2497 = null;
    }
}
