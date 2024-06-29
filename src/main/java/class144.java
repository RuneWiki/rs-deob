import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class144 extends class451 {

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Lro;")
    public static class249 field1896 = null;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static volatile int field1897 = -1;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static void method963(int arg0) {
        if (arg0 >= 21) {
            field1896 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public static final void method964(int arg0) {
        if (arg0 <= -27) {
            class16.field185 = true;
            field1900++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V")
    public static final void method965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1899++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = arg1;
        int var9 = class143.method950(-15543, class297.field4268, class203.field2942, arg3 + arg0);
        int var10 = class143.method950(-15543, class297.field4268, class203.field2942, arg3 - arg0);
        class370.method2440(var9, class227.field3201[arg4], arg2, var10, arg1 ^ 0xFFFFFFB0);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class180.field2375 && var11 <= class50.field695) {
                    int var13 = class143.method950(-15543, class297.field4268, class203.field2942, arg3 + var5);
                    int var14 = class143.method950(-15543, class297.field4268, class203.field2942, arg3 - var5);
                    if (var12 <= class50.field695) {
                        class370.method2440(var13, class227.field3201[var12], arg2, var14, 86);
                    }
                    if (class180.field2375 <= var11) {
                        class370.method2440(var13, class227.field3201[var11], arg2, var14, arg1 + 61);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class180.field2375 <= var16 && var15 <= class50.field695) {
                int var17 = class143.method950(-15543, class297.field4268, class203.field2942, arg3 + var6);
                int var18 = class143.method950(-15543, class297.field4268, class203.field2942, arg3 - var6);
                if (var16 <= class50.field695) {
                    class370.method2440(var17, class227.field3201[var16], arg2, var18, 88);
                }
                if (class180.field2375 <= var15) {
                    class370.method2440(var17, class227.field3201[var15], arg2, var18, 86);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lqj;Lqj;IZ)V")
    public static final void method966(class238 arg0, class238 arg1, int arg2, boolean arg3) {
        class129.field1715 = arg1;
        field1898++;
        class316.field4520 = arg0;
        class212.field3006 = arg3;
        if (arg2 != -2437) {
            method965(49, 72, -30, 29, -17);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIFIZIII)[[I")
    public static final int[][] method967(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field1895++;
        int[][] var9 = new int[arg2][arg6];
        class360 var10 = new class360();
        if (arg0 != -11590) {
            field1896 = null;
        }
        var10.field5275 = (int) (arg3 * 4096.0F);
        var10.field5263 = arg8;
        var10.field5271 = arg4;
        var10.field5262 = arg5;
        var10.field5274 = arg1;
        var10.method440(arg0 + 11590);
        class361.method2372(arg2, arg6, 104);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method2365(6967, var9[var11], var11);
        }
        return var9;
    }
}
