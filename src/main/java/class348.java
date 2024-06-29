import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class348 {

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Ljn;")
    private class86 field5428 = new class86();

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "Lkn;")
    private class233 field5431 = new class233();

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    private int field5433;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    private int field5430;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lqo;")
    private class141 field5432;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
    public static int[] field5423 = new int[1];

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5426 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(JI)Ljn;")
    public final class86 method2211(long arg0, int arg1) {
        if (arg1 != -128) {
            return null;
        }
        field5429++;
        class86 var4 = (class86) this.field5432.method943(arg0, -1);
        if (var4 != null) {
            this.field5431.method1582(var4, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)I")
    public static final int method2212(int arg0, byte arg1, int arg2) {
        field5425++;
        int var3 = class382.method2369(arg0 + 91923, -2210, arg2 + 45365, 4) - (-(class382.method2369(arg0 + 37821, arg1 ^ -2218, arg2 + 10294, 2) + -128 >> 1) + -(class382.method2369(arg0, -2210, arg2, 1) + -128 >> 2)) - 128;
        if (arg1 != 8) {
            return -63;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static void method2213(byte arg0) {
        field5423 = null;
        field5426 = null;
        int var1 = -28 / ((arg0 - 3) / 63);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
    public final void method2214(byte arg0) {
        field5424++;
        this.field5431.method1580(-5735);
        this.field5432.method937(0);
        this.field5428 = new class86();
        if (arg0 != -109) {
            this.field5428 = null;
        }
        this.field5433 = this.field5430;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class470.field6873[arg0][var8][var14] == -class168.field2444) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class386.field5882) + 1;
            int var10 = (arg3 << class386.field5882) + 2;
            int var11 = class455.field6683[arg0].method849(arg1, arg3) + arg5;
            if (!class421.method2537(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class386.field5882) - 1;
            if (!class421.method2537(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class386.field5882) - 1;
            if (!class421.method2537(var9, var11, var13)) {
                return false;
            } else if (class421.method2537(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class263.method1697(arg0, arg1, arg3)) {
            int var6 = arg1 << class386.field5882;
            int var7 = arg3 << class386.field5882;
            return class421.method2537(var6 + 1, class455.field6683[arg0].method849(arg1, arg3) + arg5, var7 + 1) && class421.method2537(class215.field2995 + var6 - 1, class455.field6683[arg0].method849(arg1 + 1, arg3) + arg5, var7 + 1) && class421.method2537(class215.field2995 + var6 - 1, class455.field6683[arg0].method849(arg1 + 1, arg3 + 1) + arg5, class215.field2995 + var7 - 1) && class421.method2537(var6 + 1, class455.field6683[arg0].method849(arg1, arg3 + 1) + arg5, class215.field2995 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljn;JI)V")
    public final void method2216(class86 arg0, long arg1, int arg2) {
        field5427++;
        if (arg2 != -25431) {
            this.field5428 = null;
        }
        if (this.field5433 == 0) {
            class86 var5 = this.field5431.method1583(arg2 + 25547);
            var5.method2785((byte) -120);
            var5.method560((byte) -47);
            if (this.field5428 == var5) {
                class86 var6 = this.field5431.method1583(arg2 ^ 0xFFFF9CF6);
                var6.method2785((byte) -120);
                var6.method560((byte) -63);
            }
        } else {
            this.field5433--;
        }
        this.field5432.method940(arg1, arg2 ^ 0x6312, arg0);
        this.field5431.method1582(arg0, -1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method2217(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 != 1) {
            method2215(-123, 16, -47, -82, -5, -104);
        }
        field5422++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class422.field6293) {
            try {
                class323 var3 = (class323) Class.forName("ir").getDeclaredConstructor().newInstance();
                var3.method1633((byte) 1, arg1);
                return var3;
            } catch (Throwable var4) {
                class422.field6293 = true;
            }
        }
        return arg0 ? class44.method339(-6145, arg1) : arg1;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
    public class348(int arg0) {
        this.field5433 = arg0;
        this.field5430 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5432 = new class141(var2);
    }
}
