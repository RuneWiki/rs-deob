import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class383 extends class361 {

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "[B")
    public byte[] field5391;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field5388 = 0;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "Lkn;")
    public static class530 field5389 = new class530(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "F")
    public static float field5392;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIII)V")
    public static final void method2222(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5393++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        if (arg2 != 34) {
            return;
        }
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class303.field4422 <= arg5 && class353.field5062 >= arg5) {
            int var20 = class539.method3173(arg3 + arg4, (byte) 16, class392.field5514, class518.field7624);
            int var21 = class539.method3173(arg4 - arg3, (byte) 53, class392.field5514, class518.field7624);
            class447.method2605(-7, var21, arg0, var20, class112.field1523[arg5]);
        }
        int var22 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var7--;
            var22 -= var15;
            var18 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var24 >= class303.field4422 && var23 <= class353.field5062) {
                int var25 = class539.method3173(arg4 + var6, (byte) 50, class392.field5514, class518.field7624);
                int var26 = class539.method3173(arg4 - var6, (byte) 86, class392.field5514, class518.field7624);
                if (class303.field4422 <= var23) {
                    class447.method2605(-7, var26, arg0, var25, class112.field1523[var23]);
                }
                if (var24 <= class353.field5062) {
                    class447.method2605(arg2 - 41, var26, arg0, var25, class112.field1523[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
    public class383(byte[] arg0) {
        this.field5391 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method2223(int arg0) {
        if (arg0 == -1780) {
            field5389 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
    public static final void method2224() {
        class212.method1336(1, class409.field5785);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method2225(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5387++;
        class408 var10 = null;
        for (class408 var11 = (class408) class191.field2730.method2655(15152); var11 != null; var11 = (class408) class191.field2730.method2660((byte) 67)) {
            if (var11.field5777 == arg0 && var11.field5770 == arg6 && var11.field5773 == arg4 && var11.field5771 == arg7) {
                var10 = var11;
                break;
            }
        }
        int var12 = -98 % ((arg2 - 26) / 41);
        if (var10 == null) {
            var10 = new class408();
            var10.field5773 = arg4;
            var10.field5770 = arg6;
            var10.field5771 = arg7;
            var10.field5777 = arg0;
            if (arg6 >= 0 && arg4 >= 0 && class43.field494 > arg6 && arg4 < class500.field7068) {
                class60.method489((byte) 7, var10);
            }
            class191.field2730.method2657(8492, var10);
        }
        var10.field5779 = arg1;
        var10.field5766 = arg8;
        var10.field5776 = arg9;
        var10.field5781 = arg5;
        var10.field5778 = arg3;
    }
}
