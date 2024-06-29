import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class80 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Ln;")
    public static class282 field1252 = new class282(100);

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field1259 = 0;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Lna;")
    public static class26 field1257 = class69.method505("Cabbage", (byte) -128);

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "[I")
    public static int[] field1256 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "[I")
    public static int[] field1260 = new int[2];

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field1261 = 0;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field1263 = 0;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Lve;")
    public static class266 field1258;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lbm;", line = 7)
    public static final class137 method569(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class137 var4 = var3.field886;
            var3.field886 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z", line = 22)
    public static final boolean method570(int arg0) {
        field1255++;
        if (class277.field4634) {
            try {
                return !(Boolean) class74.field1133.method208(arg0 - 2112, class45.field712.field2431);
            } catch (Throwable var2) {
            }
        }
        return arg0 == 255 ? true : true;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 46)
    public static final void method571(int arg0, int arg1) {
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        field1254++;
        class149.field2327 += arg0 * 128;
        if (class154.field2400.length < class149.field2327) {
            class149.field2327 -= class154.field2400.length;
            int var3 = (int) (Math.random() * 12.0D);
            class198.method1334((byte) -119, class252.field4149[var3]);
        }
        int var4 = arg1;
        int var5 = (var2 - arg0) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class68.field1063[var4 + var6] - class154.field2400[class154.field2400.length - 1 & class149.field2327 + var4] * arg0 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class68.field1063[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class68.field1063[var10 + var11] = 255;
                } else {
                    class68.field1063[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class132.field2015[var13] = class132.field2015[var13 + arg0];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class132.field2015[var14] = (int) (Math.sin((double) class273.field4573 / 14.0D) * 16.0D + Math.sin((double) class273.field4573 / 15.0D) * 14.0D + Math.sin((double) class273.field4573 / 16.0D) * 12.0D);
            class273.field4573++;
        }
        class108.field1700 += arg0;
        int var15 = (arg0 + (class229.field3626 & 0x1)) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class108.field1700; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class68.field1063[var17 + (var18 << 7)] = 192;
        }
        class108.field1700 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var21 += class68.field1063[var22 + var15 + var20];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var21 -= class68.field1063[var20 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class214.field3340[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class214.field3340[var15 * 128 + (var23 + var26)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class214.field3340[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class68.field1063[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 222)
    public static final void method572(int arg0) {
        class126.field1952.method1986((byte) -107);
        field1253++;
        if (arg0 != 128) {
            field1263 = 111;
        }
        class194.field3016.method1986((byte) -110);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 234)
    public static void method573(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1260 = null;
        field1257 = null;
        field1256 = null;
        field1258 = null;
        field1252 = null;
    }
}
