import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class199 implements class234 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lla;")
    private class422 field3401;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field3403 = 0;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[J")
    public static long[] field3399 = new long[10];

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    public static boolean field3402 = true;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field3398 = -1;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
    public static final void method1490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class487.field7049 != null) {
            class487.field7049[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class233.field3752 != null) {
            class233.field3752[arg0][arg1] = (short) arg3;
        }
        if (class500.field7266 != null) {
            class500.field7266[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I")
    public final int method1161(byte arg0) {
        field3405++;
        if (arg0 != 123) {
            field3399 = null;
        }
        return this.field3401.method2632(arg0 ^ 0x7B) ? 100 : this.field3401.method2637(arg0 ^ 0xFFFFFFFD);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public static void method1491(byte arg0) {
        field3399 = null;
        if (arg0 != 87) {
            method1491((byte) 39);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Loi;")
    public final class696 method1156(boolean arg0) {
        if (!arg0) {
            method1490(100, -111, -60, -120, 109);
        }
        field3404++;
        return class696.field9866;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lla;)V")
    public class199(class422 arg0) {
        this.field3401 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(FFFFIFFZ)F")
    public static final float method1492(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, float arg6, boolean arg7) {
        field3400++;
        float var8 = 0.0F;
        float var9 = arg2 - arg6;
        float var10 = arg1 - arg0;
        float var11 = arg3 - arg5;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        if (!arg7) {
            method1490(-124, -81, 93, -115, 35);
        }
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg6;
            float var16 = var8 * var10 + arg0;
            float var17 = var8 * var11 + arg5;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && class191.field3229 > var18 && class314.field4720 > var19) {
                int var20 = class145.field2251.field9470;
                if (var20 < 3 && (class434.field6341[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class121.field1867[var20].method2162((int) var17, 1, (int) var15);
                if (var16 > (float) var21) {
                    if (arg4 >= 2) {
                        return method1492(var13, var16, var15, var17, arg4 - 1, var14, var12, true) * 0.1F + (var8 - 0.1F);
                    }
                    return var8;
                }
            }
            var14 = var17;
            var12 = var15;
            var8 += 0.1F;
            var13 = var16;
        }
        return -1.0F;
    }
}
