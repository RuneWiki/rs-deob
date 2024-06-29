import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class190 extends class114 {

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "[Lnfa;")
    public static class706[] field2829 = new class706[128];

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "I")
    public static int field2840 = 0;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "Lqda;")
    private class112 field2836;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "Ld;")
    public static class159 field2833;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "Lvaa;")
    public static class492 field2837;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2841;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V", line = 5)
    public static void method1400(int arg0) {
        field2837 = null;
        field2829 = null;
        field2833 = null;
        field2841 = null;
        if (arg0 != 100) {
            field2840 = 127;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)V", line = 18)
    public final void method811(boolean arg0) {
        ++field2839;
        super.method811(false);
        this.field2836 = class158.method1258(arg0, ((class419) super.field1443).field5900, super.field1438);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lcb;Lcb;Lje;)V", line = 27)
    public class190(class544 arg0, class544 arg1, class419 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)V", line = 30)
    public static final void method1401(byte arg0) {
        class673.method3820((byte) -46);
        ++field2834;
        int var1 = class145.field1852.field9032.method1723((byte) -126);
        if (var1 != 2) {
            if (var1 == 3) {
                class146.method1009(2, class638.field8980, (byte) 25, class488.field6905, class199.field2920, class638.field8979, class512.field7325, 2);
            }
        } else {
            class312.method2036(100, class512.field7325, 100, 81, class638.field8980, class638.field8979);
        }
        if (class145.field1852.field9032.method1724(-29355)) {
            class723.method4071(class359.field5219, 6412);
        }
        if (arg0 >= 95) {
            if (class638.field8979 != null) {
                class17.method145((byte) -13);
            }
            class475.field6760 = ~class145.field1852.field9032.method1723((byte) -105) != -1;
            class607.field8578 = class145.field1852.field9032.method1724(-29355);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZII)V", line = 75)
    public final void method812(int arg0, boolean arg1, int arg2, int arg3) {
        class638.field8979.method457(arg2 + -2, arg3, super.field1443.field3769 + 4, super.field1443.field3773 + 2, ((class419) super.field1443).field5897, 0);
        ++field2830;
        if (arg0 == 1026) {
            class638.field8979.method457(arg2 - 1, arg3 + 1, super.field1443.field3769 + 2, super.field1443.field3773, 0, 0);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIBZ)V", line = 93)
    public final void method810(int arg0, int arg1, byte arg2, boolean arg3) {
        ++field2831;
        int var5 = this.method813(100) * super.field1443.field3769 / 10000;
        int[] var6 = new int[4];
        class638.field8979.method428(var6);
        class638.field8979.method455(arg1, arg0 + 2, arg1 + var5, arg0 - -super.field1443.field3773);
        if (arg2 != 105) {
            this.method814((byte) -104);
        }
        this.field2836.method791(arg1, arg0 - -2, super.field1443.field3769, super.field1443.field3773);
        class638.field8979.method455(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Z", line = 114)
    public final boolean method814(byte arg0) {
        ++field2832;
        if (!super.method814((byte) -121)) {
            return false;
        } else {
            int var2 = 30 / ((-65 - arg0) / 37);
            return super.field1438.method3131(124, ((class419) super.field1443).field5900);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZBJ)Ljava/lang/String;", line = 127)
    public static final String method1402(int arg0, boolean arg1, byte arg2, long arg3) {
        ++field2835;
        Calendar var5;
        if (!arg1) {
            class527.method3060(-12477, arg3);
            var5 = class241.field3461;
        } else {
            class572.method3323(arg3, 10);
            var5 = class241.field3459;
        }
        int var6 = var5.get(5);
        int var7 = var5.get(2) - -1;
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        if (arg2 != -65) {
            method1402(-75, false, (byte) 119, -68L);
        }
        int var10 = var5.get(12);
        return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }
}
