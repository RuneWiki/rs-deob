import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class339 extends class228 {

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Luv;")
    public static class3 field4728 = new class3(33, 7);

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "F")
    public static float field4731;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field4732;
        if (arg1 > -83) {
            method2141(-106, -1.4336928F, 0.33082008F, 86, -1.0991054F);
        }
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618 && this.method1443((byte) 94)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field2916 * super.field2916;
            for (int var8 = 0; ~var8 > ~class132.field1627; ++var8) {
                int var9 = super.field2912[var8 % super.field2921 + var7];
                var6[var8] = class143.method783(var9, 255) << 4;
                var5[var8] = class143.method783(var9, 65280) >> 4;
                var4[var8] = class143.method783(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)V")
    public static void method2139(int arg0) {
        field4728 = null;
        if (arg0 != 1406) {
            field4731 = 1.49647F;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(FBFF)I")
    public static final int method2140(float arg0, byte arg1, float arg2, float arg3) {
        if (arg1 <= 62) {
            field4729 = 109;
        }
        ++field4727;
        float var4 = !(arg2 < 0.0F) ? arg2 : -arg2;
        float var5 = !(arg3 < 0.0F) ? arg3 : -arg3;
        float var6 = !(arg0 < 0.0F) ? arg0 : -arg0;
        if (var4 < var5 && var5 > var6) {
            return !(arg3 > 0.0F) ? 1 : 0;
        } else if (var6 > var4 && var6 > var5) {
            return arg0 > 0.0F ? 2 : 3;
        } else {
            return arg2 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFFIF)F")
    public static final float method2141(int arg0, float arg1, float arg2, int arg3, float arg4) {
        if (arg0 != 958404324) {
            field4728 = null;
        }
        ++field4730;
        float[] var5 = class478.field6719[arg3];
        return var5[2] * arg2 + var5[1] * arg1 + var5[0] * arg4;
    }
}
