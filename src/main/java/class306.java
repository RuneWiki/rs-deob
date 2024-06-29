import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class306 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field4921 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[Lqj;")
    public static class248[] field4924 = new class248[0];

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field4925 = 0;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[Lel;")
    public static class82[] field4926 = new class82[14];

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4927 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Z")
    public static volatile boolean field4930 = true;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIILim;II)V")
    public static final void method2084(int arg0, int arg1, int arg2, int arg3, int arg4, class178 arg5, int arg6, int arg7) {
        field4928++;
        int var8 = -84 % ((arg6 - 58) / 37);
        if (class207.field3084) {
            class200.field3040 = 32;
        } else {
            class200.field3040 = 0;
        }
        class207.field3084 = false;
        if (class205.field3074 != 0) {
            if (arg7 >= arg3 && (arg3 + 16) > arg7 && arg0 >= arg4 && (arg4 + 16) > arg0) {
                arg5.field2701 -= 4;
                class312.method2108(false, arg5);
            } else if (arg3 <= arg7 && arg7 < (arg3 + 16) && arg4 - (16 - arg2) <= arg0 && arg0 < (arg2 + arg4)) {
                arg5.field2701 += 4;
                class312.method2108(false, arg5);
            } else if ((arg3 - class200.field3040) <= arg7 && arg3 + class200.field3040 + 16 > arg7 && arg0 >= (arg4 + 16) && arg2 + arg4 - 16 > arg0) {
                int var9 = (arg2 - 32) * arg2 / arg1;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg2 - (var9 + 32);
                int var11 = arg0 - (var9 / 2) - arg4 - 16;
                arg5.field2701 = (arg1 - arg2) * var11 / var10;
                class312.method2108(false, arg5);
                class207.field3084 = true;
            }
        }
        if (class157.field2161 == 0) {
            return;
        }
        int var12 = arg5.field2529;
        if (arg3 - var12 <= arg7 && arg4 <= arg0 && arg3 + 16 > arg7 && arg0 <= (arg2 + arg4)) {
            arg5.field2701 += class157.field2161 * 45;
            class312.method2108(false, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBIIII)V")
    public static final void method2085(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4929++;
        int var7 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg1);
        int var8 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg0);
        int var9 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg5);
        int var10 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg3);
        int var11 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg1 + arg4);
        int var12 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg0 - arg4);
        for (int var13 = var7; var13 < var11; var13++) {
            class129.method822(class247.field3876[var13], var9, -2426, arg6, var10);
        }
        if (arg2 <= 89) {
            method2086((byte) 30);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class129.method822(class247.field3876[var14], var9, -2426, arg6, var10);
        }
        int var15 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg4 + arg5);
        int var16 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg3 - arg4);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class247.field3876[var17];
            class129.method822(var18, var9, -2426, arg6, var15);
            class129.method822(var18, var16, -2426, arg6, var10);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method2086(byte arg0) {
        field4926 = null;
        field4927 = null;
        if (arg0 != 89) {
            field4925 = -50;
        }
        field4924 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
    public static final Object method2087(boolean arg0, byte arg1, byte[] arg2) {
        field4922++;
        if (arg2 == null) {
            return null;
        } else if (arg1 > -6) {
            return null;
        } else {
            if (arg2.length > 136 && !class302.field4806) {
                try {
                    class136 var3 = (class136) Class.forName("rk").getDeclaredConstructor().newInstance();
                    var3.method858(46, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class302.field4806 = true;
                }
            }
            return arg0 ? class272.method1777(arg2, 0) : arg2;
        }
    }
}
