import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class185 extends class747 {

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lwv;")
    public static class246 field2596;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)Z", line = 13)
    public static final boolean method1305(int arg0, int arg1, byte arg2) {
        if (arg2 > -32) {
            field2596 = null;
        }
        field2594++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(FFFIBFFF)F", line = 26)
    public static final float method1306(float arg0, float arg1, float arg2, int arg3, byte arg4, float arg5, float arg6, float arg7) {
        field2595++;
        float var8 = 0.0F;
        float var9 = arg0 - arg2;
        int var10 = -41 % ((arg4 - 39) / 32);
        float var11 = arg5 - arg7;
        float var12 = arg6 - arg1;
        float var13 = 0.0F;
        float var14 = 0.0F;
        float var15 = 0.0F;
        while (var8 < 1.1F) {
            float var16 = var8 * var9 + arg2;
            float var17 = var8 * var11 + arg7;
            float var18 = var8 * var12 + arg1;
            int var19 = (int) var16 >> 9;
            int var20 = (int) var18 >> 9;
            if (var19 > 0 && var20 > 0 && class240.field3280 > var19 && var20 < class276.field3602) {
                int var21 = class422.field5564.field2895;
                if (var21 < 3 && (class410.field5439[1][var19][var20] & 0x2) != 0) {
                    var21++;
                }
                int var22 = class383.field4790[var21].method2072((byte) 98, (int) var16, (int) var18);
                if (var17 > (float) var22) {
                    if (arg3 < 2) {
                        return var8;
                    }
                    return method1306(var16, var15, var13, arg3 - 1, (byte) 97, var17, var18, var14) * 0.1F + (var8 - 0.1F);
                }
            }
            var8 += 0.1F;
            var15 = var18;
            var14 = var17;
            var13 = var16;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 92)
    public static void method1307(int arg0) {
        field2596 = null;
        if (arg0 != 11563) {
            field2596 = null;
        }
    }
}
