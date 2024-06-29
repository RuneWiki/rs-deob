import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class28 extends class423 {

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "J")
    public static volatile long field395 = 0L;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lbn;")
    public static class160 field396 = new class160(63, -1);

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Ljava/lang/String;")
    public String field394;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[Lui;")
    public static class378[] field401;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 4)
    public static void method288(int arg0) {
        int var1 = 61 % ((79 - arg0) / 37);
        field401 = null;
        field396 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLct;)V", line = 14)
    public static final void method289(byte arg0, class104 arg1) {
        class165.field2175 = arg1;
        field405++;
        if (arg0 <= 63) {
            method290(-39, -83, -24, 84, 30, (class9) null, -12, -28, -70, (byte) 66, 82, (byte[][][]) null, 20);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIILfp;IIIBI[[[BI)V", line = 25)
    public static final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, class9 arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, byte[][][] arg11, int arg12) {
        field390++;
        int var13 = -123 / ((5 - arg9) / 60);
        if (arg7 == 0 || arg8 == 0) {
            return;
        }
        if (arg7 == 9) {
            arg7 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 8;
        }
        arg5.method169(arg4, arg6, arg3, arg0, arg10, arg2, arg11[arg7 - 1][arg1], arg8, arg12);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)Lva;", line = 59)
    public static final class58 method291(int arg0, int arg1, int arg2, int arg3) {
        field404++;
        class369 var4 = class178.field2530[arg0][arg3][arg1];
        if (var4 == null) {
            return null;
        }
        class58 var5 = null;
        if (arg2 != 0) {
            field402 = 71;
        }
        int var6 = -1;
        for (class206 var7 = var4.field5345; var7 != null; var7 = var7.field2882) {
            class336 var8 = var7.field2880;
            if (var8 instanceof class58) {
                class58 var9 = (class58) var8;
                int var10 = (var9.method446(10) - 1) * 64 + 60;
                int var11 = var9.field4954 - var10 >> 7;
                int var12 = var9.field4951 - var10 >> 7;
                int var13 = var9.field4954 + var10 >> 7;
                int var14 = var9.field4951 + var10 >> 7;
                if (arg3 >= var11 && arg1 >= var12 && var13 >= arg3 && arg1 <= var14) {
                    int var15 = (var13 + 1 - arg3) * (var14 + 1 - arg1);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBII)V", line = 120)
    public static final void method292(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field398++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg0 * arg0;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class248.field3659 <= arg5 && class146.field1978 >= arg5) {
            int var20 = class382.method2423(arg0 + arg4, class63.field838, 49, class9.field128);
            int var21 = class382.method2423(arg4 - arg0, class63.field838, 28, class9.field128);
            class381.method2419((byte) 74, arg1, var21, class323.field4774[arg5], var20);
        }
        int var22 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (class248.field3659 <= var24 && var23 <= class146.field1978) {
                int var25 = class382.method2423(arg4 + var6, class63.field838, 47, class9.field128);
                int var26 = class382.method2423(arg4 - var6, class63.field838, 91, class9.field128);
                if (var23 >= class248.field3659) {
                    class381.method2419((byte) 35, arg1, var26, class323.field4774[var23], var25);
                }
                if (class146.field1978 >= var24) {
                    class381.method2419((byte) 35, arg1, var26, class323.field4774[var24], var25);
                }
            }
        }
        if (arg3 >= -66) {
            method288(-98);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 229)
    public static final void method293() {
        for (int var0 = 0; var0 < class302.field4425; var0++) {
            class336 var1 = class93.field1163[var0];
            class195.method1354(var1);
            class93.field1163[var0] = null;
        }
        class302.field4425 = 0;
    }
}
