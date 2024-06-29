import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class193 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lcfa;")
    public class188 field2892 = null;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "[Lwi;")
    public class504[] field2898 = null;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Lcfa;")
    public class188 field2897 = null;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Lcfa;")
    public class188 field2900 = null;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "[Lwi;")
    public class504[] field2904 = null;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Z")
    public boolean field2901;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2893 = null;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field2902 = 0;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Z")
    public static boolean field2899 = false;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Lin;")
    public static class380 field2895 = new class380(2, 5);

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Ldm;")
    public static class765 field2894;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method1376(int arg0, int arg1, boolean arg2) {
        if (arg1 != 16) {
            field2894 = null;
        }
        field2896++;
        return arg2 && arg0 >= 0 ? class41.method304((byte) 51, arg0, arg2, 10) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(FFZFIFFF)F")
    public static final float method1377(float arg0, float arg1, boolean arg2, float arg3, int arg4, float arg5, float arg6, float arg7) {
        field2903++;
        float var8 = 0.0F;
        float var9 = arg7 - arg6;
        float var10 = arg0 - arg5;
        float var11 = arg3 - arg1;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        if (arg2) {
            field2893 = null;
        }
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg6;
            float var16 = var8 * var10 + arg5;
            float var17 = var8 * var11 + arg1;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && class192.field2891 > var18 && var19 < class456.field6225) {
                int var20 = class719.field10041.field10361;
                if (var20 < 3 && (class336.field4782[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class495.field6799[var20].method2478(!arg2, (int) var17, (int) var15);
                if (var16 > (float) var21) {
                    if (arg4 < 2) {
                        return var8;
                    }
                    return var8 + method1377(var16, var14, false, var17, arg4 - 1, var13, var12, var15) * 0.1F - 0.1F;
                }
            }
            var12 = var15;
            var8 += 0.1F;
            var14 = var17;
            var13 = var16;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public static final void method1378(int arg0) {
        if (class646.field9183 != null) {
            class646.field9183.method3617((byte) -36);
        }
        field2905++;
        if (class500.field6868 != null) {
            class500.field6868.method3617((byte) -114);
        }
        int var1 = -89 / ((arg0 - 68) / 39);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
    public static void method1379(int arg0) {
        if (arg0 == 0) {
            field2893 = null;
            field2895 = null;
            field2894 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Llea;)V")
    public class193(class573 arg0) {
        this.field2901 = arg0.field8182;
        class43.method325(-3754, arg0);
        if (this.field2901) {
            byte[] var2 = class197.method1407((byte) 123, class769.field10621, false);
            this.field2897 = new class188(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class197.method1407((byte) 47, class639.field9005, false);
            this.field2900 = new class188(arg0, 6410, 128, 128, 16, var3, 6410);
            class436 var4 = arg0.field8136;
            if (var4.method2604(3)) {
                byte[] var5 = class197.method1407((byte) 98, class7.field92, false);
                this.field2892 = new class188(arg0, 6408, 128, 128, 16);
                class188 var6 = new class188(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method2603(-124, this.field2892, 2.0F, var6)) {
                    this.field2892.method2274(false);
                } else {
                    this.field2892.method2272((byte) 27);
                    this.field2892 = null;
                }
                var6.method2272((byte) 27);
                return;
            }
        } else {
            this.field2904 = new class504[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class667.method3738(var7 * 128 * 128 * 2, class769.field10621, (byte) 95, 32768);
                this.field2904[var7] = new class504(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field2898 = new class504[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class667.method3738(var8 * 16384 * 2, class639.field9005, (byte) 95, 32768);
                this.field2898[var8] = new class504(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
