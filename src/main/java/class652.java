import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class652 extends class530 {

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "[I")
    public static int[] field9212 = new int[200];

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "[Lon;")
    public static class504[] field9218 = new class504[37];

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "Lqk;")
    public static class148 field9220 = new class148(113, 6);

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field9224 = 0;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "Lcw;")
    public static class21 field9221;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fr", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field9225;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fr", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field9226;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public static void method3768(byte arg0) {
        field9220 = null;
        field9212 = null;
        field9218 = null;
        if (arg0 == -21) {
            field9221 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V")
    public static final void method3769(boolean arg0) {
        ++field9216;
        class147.field2030 = 0;
        if (arg0) {
            field9212 = null;
        }
        for (int var1 = 0; var1 < 2048; ++var1) {
            class383.field5386[var1] = null;
            class634.field9025[var1] = 1;
            class175.field2382[var1] = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(ILah;)V")
    public class652(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        ++field9219;
        if (arg1 <= -38) {
            super.field7419 = arg0;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)I")
    public static final int method3770(byte arg0) {
        ++field9215;
        if (arg0 != 46) {
            field9224 = -118;
        }
        int var1 = 0;
        Field[] var2 = (field9225 != null ? field9225 : (field9225 = method3775("ah"))).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
            Field var5 = var3[var4];
            if ((field9226 != null ? field9226 : (field9226 = method3775("kt"))).isAssignableFrom(var5.getType())) {
                ++var1;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIII)V")
    public static final void method3771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class333.field4271 = arg0;
        class584.field8361 = arg3;
        ++field9223;
        class590.field8466 = arg4;
        class93.field1343 = arg1;
        class641.field9111 = arg5;
        if (arg2 != 200) {
            method3773(1);
        }
        if (class641.field9111 >= 100) {
            int var6 = class584.field8361 * 512 + 256;
            int var7 = class93.field1343 * 512 + 256;
            int var8 = class438.method2628(var6, class392.field5459, var7, (byte) -94) + -class333.field4271;
            int var9 = -class24.field266 + var6;
            int var10 = var8 - class57.field798;
            int var11 = var7 - class235.field3250;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class403.field5594 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var10, (double) var12));
            class645.field9148 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11));
            if (~class403.field5594 > -1025) {
                class403.field5594 = 1024;
            }
            class520.field7268 = 0;
            if (class403.field5594 > 3072) {
                class403.field5594 = 3072;
            }
        }
        class665.field9377 = 2;
        class374.field5167 = -1;
        class13.field180 = -1;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(Z)Z")
    public final boolean method3772(boolean arg0) {
        ++field9213;
        if (!arg0) {
            return true;
        } else {
            return !super.field7418.method2253(120);
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lah;)V")
    public class652(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Z")
    public static final boolean method3773(int arg0) {
        ++field9210;
        if (arg0 <= 37) {
            field9224 = 56;
        }
        return class736.field10292 != 0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (super.field7418.method2253(127)) {
            super.field7419 = 2;
        }
        if (!arg0) {
            field9224 = -40;
        }
        ++field9217;
        if (super.field7419 < 0 || super.field7419 > 2) {
            super.field7419 = this.method74(0);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)I")
    public final int method3774(int arg0) {
        if (arg0 != 0) {
            method3768((byte) 67);
        }
        ++field9214;
        return super.field7419;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field9222;
        if (super.field7418.method2253(122)) {
            return 3;
        } else {
            int var3 = 106 / ((63 - arg1) / 60);
            return 1;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        ++field9211;
        if (arg0 != 0) {
            this.method75(-36, -106);
        }
        if (!super.field7418.method2253(-109)) {
            return super.field7418.field5158.method1005(-112) && class605.method3546(super.field7418.field5158.method1006(arg0), 21780) ? 1 : 0;
        } else {
            return 2;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3775(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
