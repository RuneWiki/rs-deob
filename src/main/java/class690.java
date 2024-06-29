import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class690 {

    @OriginalMember(owner = "client!jka", name = "c", descriptor = "D")
    public static double field9393;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!jka", name = "b", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!jka", name = "d", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!jka", name = "e", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!jka", name = "g", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!jka", name = "h", descriptor = "I")
    public static int field9398;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jka", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field9399;

    @OriginalMember(owner = "client!jka", name = "f", descriptor = "Z")
    public static boolean field9396;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3856(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZILkq;)V", line = 6)
    public static final void method3851(boolean arg0, int arg1, class620 arg2) {
        field9391++;
        int var3 = arg2.field8482 == 0 ? arg2.field8506 : arg2.field8482;
        int var4 = arg2.field8399 == 0 ? arg2.field8416 : arg2.field8399;
        class707.method4012(var3, arg1 ^ arg1, var4, arg2.field8515, arg0, class316.field3880[arg2.field8515 >> 16]);
        if (arg2.field8343 != null) {
            class707.method4012(var3, 0, var4, arg2.field8515, arg0, arg2.field8343);
        }
        class52 var5 = (class52) class728.field10205.method2121(arg1 ^ 0x4672, (long) arg2.field8515);
        if (var5 != null) {
            class135.method998(var4, var3, arg0, -112, var5.field713);
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(FFIFFZFF)F", line = 29)
    public static final float method3852(float arg0, float arg1, int arg2, float arg3, float arg4, boolean arg5, float arg6, float arg7) {
        field9397++;
        float var8 = 0.0F;
        float var9 = arg7 - arg4;
        float var10 = arg6 - arg3;
        if (!arg5) {
            field9396 = true;
        }
        float var11 = arg1 - arg0;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg4;
            float var16 = var8 * var10 + arg3;
            float var17 = var8 * var11 + arg0;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && class596.field8090 > var18 && var19 < class107.field1350) {
                int var20 = class300.field3596.field808;
                if (var20 < 3 && (class124.field1585[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class707.field9933[var20].method1730((int) var15, (int) var17, -1);
                if (var16 > (float) var21) {
                    if (arg2 >= 2) {
                        return var8 + method3852(var14, var17, arg2 + -1, var13, var12, true, var16, var15) * 0.1F - 0.1F;
                    }
                    return var8;
                }
            }
            var8 += 0.1F;
            var14 = var17;
            var12 = var15;
            var13 = var16;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(I)V", line = 96)
    public static final void method3853(int arg0) {
        if (class519.field7333 != arg0) {
            class456.method2763(-1, true, class519.field7333, -1, false);
            class519.field7333 = -1;
        }
        field9395++;
    }

    @OriginalMember(owner = "client!jka", name = "b", descriptor = "(I)V", line = 114)
    public static final void method3854(int arg0) {
        if (arg0 != 23341) {
            method3854(-41);
        }
        class733.field10259 = null;
        class482.field6736 = null;
        field9394++;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIBI)Z", line = 129)
    public static final boolean method3855(int arg0, int arg1, byte arg2, int arg3) {
        field9398++;
        if (arg2 <= 15) {
            return true;
        }
        class238 var4 = (class238) class253.method1504(arg3, arg1, arg0);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class629.method3562(var4, (byte) -108);
        }
        class238 var6 = (class238) class764.method4234(arg3, arg1, arg0, field9399 == null ? (field9399 = method3856("qb")) : field9399);
        if (var6 != null) {
            var5 &= class629.method3562(var6, (byte) -112);
        }
        class238 var7 = (class238) class662.method3720(arg3, arg1, arg0);
        if (var7 != null) {
            var5 &= class629.method3562(var7, (byte) -110);
        }
        return var5;
    }
}
