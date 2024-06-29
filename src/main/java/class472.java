import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class472 {

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public int field6728;

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "I")
    public int field6733;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public int field6724;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
    public int field6731;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "Lsf;")
    public class547 field6729;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "B")
    public byte field6730;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public int field6727;

    @OriginalMember(owner = "client!jea", name = "u", descriptor = "I")
    public int field6740;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "Ljo;")
    public static class351 field6726 = new class351(53, 8);

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "I")
    public static int field6737 = -1;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!jea", name = "p", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!jea", name = "s", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!jea", name = "t", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "Lct;")
    public class154 field6723;

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "Lvp;")
    public class198 field6736;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "Lbc;")
    public class383 field6722;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "Loia;")
    public class97 field6720;

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "[Lsf;")
    public static class547[] field6734;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(FIFFIFFF)F")
    public static final float method2788(float arg0, int arg1, float arg2, float arg3, int arg4, float arg5, float arg6, float arg7) {
        if (arg4 >= -22) {
            field6734 = null;
        }
        field6739++;
        float var8 = 0.0F;
        float var9 = arg7 - arg3;
        float var10 = arg6 - arg5;
        float var11 = arg0 - arg2;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg3;
            float var16 = var8 * var10 + arg5;
            float var17 = var8 * var11 + arg2;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && var18 < class109.field1314 && class760.field10479 > var19) {
                int var20 = class251.field3549.field7710;
                if (var20 < 3 && (class617.field8700[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class750.field10395[var20].method1977((byte) -96, (int) var15, (int) var17);
                if (var16 > (float) var21) {
                    if (arg1 < 2) {
                        return var8;
                    }
                    return method2788(var17, arg1 - 1, var14, var12, -93, var13, var16, var15) * 0.1F + var8 - 0.1F;
                }
            }
            var13 = var16;
            var12 = var15;
            var8 += 0.1F;
            var14 = var17;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIII)V")
    public static final void method2789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 1520) {
            field6726 = null;
        }
        field6732++;
        class678 var5 = class630.method3597(29636, 4, (long) arg3);
        var5.method3834((byte) -116);
        var5.field9649 = arg0;
        var5.field9651 = arg4;
        var5.field9639 = arg1;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
    public static final void method2790(byte arg0) {
        field6738++;
        class600.field8464 = new class420();
        if (arg0 > -62) {
            field6735 = 46;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
    public static void method2791(int arg0) {
        field6726 = null;
        if (arg0 != 53) {
            field6737 = 45;
        }
        field6734 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)Z")
    public static final boolean method2792(int arg0, int arg1, int arg2) {
        if (arg2 >= -9) {
            method2788(0.525171F, -127, 0.41527164F, -0.7577406F, 67, 1.2394804F, 1.4203317F, 0.009908731F);
        }
        field6721++;
        return (arg1 & 0x40000) != 0 | class671.method3804(arg1, -1, arg0) || class777.method4273(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(BIIIIIILsf;)V")
    public class472(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class547 arg7) {
        this.field6728 = arg3;
        this.field6733 = arg4;
        this.field6724 = arg1;
        this.field6731 = arg2;
        this.field6729 = arg7;
        this.field6730 = arg0;
        this.field6727 = arg6;
        this.field6740 = arg5;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)Z")
    public final boolean method2793(int arg0) {
        field6725++;
        if (arg0 > -41) {
            this.field6728 = 54;
        }
        return this.field6730 == 2 || this.field6730 == 3;
    }
}
