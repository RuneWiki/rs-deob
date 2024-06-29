import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class279 {

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field4600 = -1;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4596 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lui;")
    public static class98 field4594 = new class98(64);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Llk;")
    public class280 field4599;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
    public int[] field4598;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field4595;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lsi;IIIIII)V", line = 12)
    public static final void method1984(class264 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4593++;
        if (arg5 != 2) {
            return;
        }
        class312 var7 = class165.method1150(arg3, (byte) 61);
        if (var7 == null || !var7.field5079 || !var7.method2179(11902)) {
            return;
        }
        if (var7.field5100 != null) {
            int[] var8 = new int[var7.field5100.length];
            for (int var9 = 0; var9 < (var8.length / 2); var9++) {
                int var10 = (int) class355.field5628 + class322.field5284 & 0x7FF;
                int var11 = class272.field4480[var10];
                int var12 = var11 * 256 / (class196.field3008 + 256);
                int var13 = class272.field4470[var10];
                int var14 = var13 * 256 / (class196.field3008 + 256);
                var8[var9 * 2] = ((arg2 + (var7.field5100[var9 * 2 + 1] * 4)) * var14 + (var7.field5100[var9 * 2] * 4 + arg6) * var12 >> 16) + arg0.field4223 / 2 + arg1;
                var8[var9 * 2 + 1] = arg4 - (((var7.field5100[var9 * 2 + 1] * 4 + arg2) * var12 - (var7.field5100[var9 * 2] * 4 + arg6) * var14 >> 16) - (arg0.field4236 / 2));
            }
            if (class245.field3886) {
                class188.method1298(var8, var7.field5097, var7.field5097 >>> 24, arg0.field4260, arg0.field4338);
            } else {
                class303.method2122(var8, var7.field5097, var7.field5097 >>> 24, arg0.field4260, arg0.field4338);
            }
            for (int var15 = 0; var15 < var8.length / 2 - 1; var15++) {
                if (class245.field3886) {
                    class335.method2369(var8[var15 * 2], var8[var15 * 2 + 1], var8[var15 * 2 + 2], var8[(var15 + 1) * 2 + 1], var7.field5071, var7.field5071 >>> 24, (class232) arg0.method1859(-1, false));
                } else {
                    class317.method2268(var8[var15 * 2], var8[var15 * 2 + 1], var8[var15 * 2 + 2], var8[(var15 + 1) * 2 + 1], var7.field5071, var7.field5071 >>> 24, arg0.field4260, arg0.field4338);
                }
            }
            if (class245.field3886) {
                class335.method2369(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field5071, var7.field5071 >>> 24, (class232) arg0.method1859(-1, false));
            } else {
                class317.method2268(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field5071, var7.field5071 >>> 24, arg0.field4260, arg0.field4338);
            }
        }
        class187 var16 = null;
        if (var7.field5080 != -1) {
            var16 = var7.method2176(false, false, -18);
            if (var16 != null) {
                class269.method1900(arg2, arg6, arg4, arg1, arg0, (byte) 93, var16);
            }
        }
        if (var7.field5104 == null) {
            return;
        }
        class175 var17 = class302.field4967;
        if (var7.field5073 == 1) {
            var17 = class287.field4740;
        }
        if (var7.field5073 == 2) {
            var17 = class31.field471;
        }
        int var18 = 0;
        if (var16 != null) {
            var18 = var16.field2913;
        }
        class268.method1887(arg0, arg2, arg6, arg4, (byte) 37, var18, var7.field5087, arg1, var7.field5104, var17);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 110)
    public static void method1985(byte arg0) {
        field4594 = null;
        if (arg0 != 36) {
            field4596 = 14;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V", line = 126)
    public static final void method1986(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4597++;
        if (arg4 != 27960) {
            field4596 = 13;
        }
        for (int var5 = 0; var5 < class60.field916; var5++) {
            if (class21.field263[var5] + class138.field2179[var5] > arg2 && class21.field263[var5] < arg2 + arg3 && arg0 < (class265.field4360[var5] + class189.field2926[var5]) && class265.field4360[var5] < arg0 + arg1) {
                class116.field1694[var5] = true;
            }
        }
    }
}
