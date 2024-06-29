import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class296 {

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lnh;")
    public class778 field4304 = new class778();

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lpf;")
    public static class607[] field4299 = new class607[14];

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field4307 = 503;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method1925(int arg0, byte arg1) {
        field4303++;
        class244 var2 = (class244) class87.field961.method2242((long) arg0, -1);
        if (var2 != null) {
            var2.field3630 = !var2.field3630;
            var2.field3625.method1964(61, var2.field3630);
        }
        int var3 = 110 / ((84 - arg1) / 42);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 20)
    public static void method1926(int arg0) {
        if (arg0 != 2) {
            method1929(75);
        }
        field4299 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)[Lls;", line = 32)
    public static final class149[] method1927(boolean arg0) {
        field4302++;
        if (!arg0) {
            method1927(false);
        }
        return new class149[] { class407.field5548, class361.field5059, class723.field10013 };
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FIIFFFFF)F", line = 43)
    public static final float method1928(float arg0, int arg1, int arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
        field4305++;
        float var8 = 0.0F;
        float var9 = arg5 - arg6;
        float var10 = arg7 - arg0;
        if (arg2 != -20504) {
            return -1.6689084F;
        }
        float var11 = arg3 - arg4;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg6;
            float var16 = var8 * var10 + arg0;
            float var17 = var8 * var11 + arg4;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && class768.field10571 > var18 && var19 < class350.field4898) {
                int var20 = class210.field3250.field5755;
                if (var20 < 3 && (class190.field2932[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class411.field5572[var20].method1918((int) var15, (byte) 126, (int) var17);
                if (var16 > (float) var21) {
                    if (arg1 < 2) {
                        return var8;
                    }
                    return method1928(var13, arg1 - 1, arg2, var17, var14, var15, var12, var16) * 0.1F + var8 - 0.1F;
                }
            }
            var12 = var15;
            var13 = var16;
            var14 = var17;
            var8 += 0.1F;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z", line = 119)
    public static final boolean method1929(int arg0) {
        field4306++;
        if (class762.field10498 == null) {
            return false;
        }
        if (arg0 != 2000) {
            field4299 = null;
        }
        if (class762.field10498.field10340 >= 2000) {
            class762.field10498.field10340 -= 2000;
        }
        return class762.field10498.field10340 == 1004;
    }
}
