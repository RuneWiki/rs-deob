import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class254 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4234 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lok;")
    public static class146 field4236 = class235.method1724(-12908, "null");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lok;")
    public static class146 field4235 = class235.method1724(-12908, "Fps:");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1848(int arg0, int arg1) {
        if (arg0 != 255) {
            return;
        }
        field4238++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class137.field2285 += arg1 * 128;
        if (class137.field2285 > class234.field3918.length) {
            class137.field2285 -= class234.field3918.length;
            int var3 = (int) (Math.random() * 12.0D);
            class224.method1657(class114.field1839[var3], (byte) 118);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class100.field1612[var4 + var5] - (class234.field3918[class137.field2285 + var4 & class234.field3918.length + -1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class100.field1612[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class100.field1612[var10 + var11] = 255;
                } else {
                    class100.field1612[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            class318.field5377[var13] = class318.field5377[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class318.field5377[var14] = (int) (Math.sin((double) class279.field4790 / 14.0D) * 16.0D + Math.sin((double) class279.field4790 / 15.0D) * 14.0D + Math.sin((double) class279.field4790 / 16.0D) * 12.0D);
            class279.field4790++;
        }
        int var15 = (arg1 + (class203.field3385 & 0x1)) / 2;
        class143.field2382 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class143.field2382; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class100.field1612[(var18 << 7) + var17] = 192;
        }
        class143.field2382 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class100.field1612[var21 + var22 + var15];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class100.field1612[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class73.field1198[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var2) {
                    var24 += class73.field1198[var15 * 128 + var23 + var26];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class73.field1198[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class100.field1612[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 180)
    public static void method1849(int arg0) {
        field4236 = null;
        if (arg0 == 1) {
            field4235 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIFZII)[[I", line = 208)
    public static final int[][] method1850(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6, int arg7, int arg8) {
        field4239++;
        int[][] var9 = new int[arg8][arg2];
        class93 var10 = new class93();
        var10.field1495 = arg6;
        var10.field1502 = arg0;
        var10.field1499 = arg3;
        if (arg7 != 29048) {
            method1849(-52);
        }
        var10.field1487 = arg1;
        var10.field1485 = (int) (arg5 * 4096.0F);
        var10.method43(-2);
        class206.method1560(arg8, (byte) 58, arg2);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method639(255, var9[var11], var11);
        }
        return var9;
    }
}
