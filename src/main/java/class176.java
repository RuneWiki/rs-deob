import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class176 extends class748 {

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Lfg;")
    public static class436 field2392;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Lcba;")
    public static class53 field2397;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIZIBI)Z")
    public static final boolean method1104(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7, int arg8) {
        ++field2396;
        int var9 = class473.field6483.field8421[0];
        int var10 = class473.field6483.field8414[0];
        if (~var9 <= -1 && class514.field7179 > var9 && var10 >= 0 && class456.field6281 > var10) {
            if (~arg6 <= -1 && class514.field7179 > arg6 && arg2 >= 0 && class456.field6281 > arg2) {
                if (arg7 != -76) {
                    field2392 = null;
                }
                int var11 = class49.method335(arg8, (byte) 106, class300.field3920, class745.field10380, arg3, arg6, arg5, class464.field6351[class473.field6483.field9501], arg0, var9, arg1, class473.field6483.method3470(-1), arg2, var10, arg4);
                if (~var11 > -2) {
                    return false;
                } else {
                    class729.field10226 = class745.field10380[var11 + -1];
                    class93.field1329 = class300.field3920[var11 + -1];
                    class557.field7912 = false;
                    class463.method2767(90);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field2394;
        if (arg1 != 255) {
            this.method20(90, true, (class26) null);
        }
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            for (int var4 = 0; class424.field5889 > var4; ++var4) {
                this.method1106(false, arg0, var4);
                int[] var5 = this.method4157(0, (byte) -100, class331.field4244);
                var3[var4] = var5[class631.field8995];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field2393;
        if (arg1 != 0) {
            this.method1106(true, -15, 91);
        }
        int[][] var3 = super.field10420.method930(arg1 + 29784, arg0);
        if (super.field10420.field1979) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class424.field5889; ++var7) {
                this.method1106(false, arg0, var7);
                int[][] var8 = this.method4159(0, arg1, class331.field4244);
                var4[var7] = var8[0][class631.field8995];
                var5[var7] = var8[1][class631.field8995];
                var6[var7] = var8[2][class631.field8995];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
    public static void method1105(byte arg0) {
        field2392 = null;
        if (arg0 != -124) {
            method1105((byte) 118);
        }
        field2397 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field2391;
        if (arg0 == 0) {
            super.field10414 = ~arg2.method194((byte) 119) == -2;
        }
        if (arg1) {
            this.method1106(true, 66, -85);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZII)V")
    private final void method1106(boolean arg0, int arg1, int arg2) {
        ++field2395;
        int var4 = class237.field3298[arg2];
        int var5 = class370.field4727[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class331.field4244 = arg1;
            class631.field8995 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class631.field8995 = arg1;
            class331.field4244 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class331.field4244 = arg2;
            class631.field8995 = -arg1 + class424.field5889;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class331.field4244 = -arg1 + class245.field3400;
            class631.field8995 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class631.field8995 = class424.field5889 - arg2;
            class331.field4244 = -arg1 + class245.field3400;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class331.field4244 = -arg2 + class245.field3400;
            class631.field8995 = -arg1 + class424.field5889;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class331.field4244 = -arg2 + class245.field3400;
            class631.field8995 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class331.field4244 = arg1;
            class631.field8995 = class424.field5889 - arg2;
        }
        class331.field4244 &= class150.field2077;
        if (arg0) {
            field2392 = null;
        }
        class631.field8995 &= class354.field4552;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class176() {
        super(1, false);
    }
}
