import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class440 extends class42 {

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    private int field6271;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    private int field6275;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public int field6267;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public int field6261;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    private int field6259;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    private int field6258;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    private int field6270;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public int field6264;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Z")
    public static boolean field6260 = false;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field6273 = new String[100];

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lbd;")
    public static class44 field6256 = new class44("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIIIII)V")
    public static final void method2585(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6268++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg5 * arg5;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        if (arg0 != -42) {
            method2592(-46, (byte) -100);
        }
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        if (arg2 >= class424.field5996 && arg2 <= class333.field4936) {
            int var21 = class252.method1631(class176.field2630, class465.field6763, arg3 + arg5, -105);
            int var22 = class252.method1631(class176.field2630, class465.field6763, arg3 - arg5, -25);
            class479.method2839(var21, var22, class271.field4078[arg2], 105, arg1);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (class424.field5996 <= var24 && var23 <= class333.field4936) {
                int var25 = class252.method1631(class176.field2630, class465.field6763, arg3 + var6, -40);
                int var26 = class252.method1631(class176.field2630, class465.field6763, arg3 - var6, -88);
                if (var23 >= class424.field5996) {
                    class479.method2839(var25, var26, class271.field4078[var23], 112, arg1);
                }
                if (class333.field4936 >= var24) {
                    class479.method2839(var25, var26, class271.field4078[var24], 85, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([IIII)V")
    public final void method2586(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[0] = this.field6271;
        arg0[2] = arg1 - (this.field6264 - this.field6258);
        int var5 = 77 % ((48 - arg2) / 38);
        field6269++;
        arg0[1] = arg3 + this.field6270 - this.field6272;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BII)Z")
    public final boolean method2587(byte arg0, int arg1, int arg2) {
        if (arg0 != -108) {
            this.field6275 = -25;
        }
        field6262++;
        return this.field6272 <= arg2 && this.field6261 >= arg2 && this.field6264 <= arg1 && this.field6267 >= arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)Z")
    public final boolean method2588(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 116 % ((-arg3 - 85) / 33);
        field6266++;
        return this.field6271 == arg1 && arg0 >= this.field6270 && arg0 <= this.field6275 && arg2 >= this.field6258 && arg2 <= this.field6259;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([IBII)V")
    public final void method2589(int[] arg0, byte arg1, int arg2, int arg3) {
        field6263++;
        arg0[1] = arg3 + this.field6272 - this.field6270;
        if (arg1 < 17) {
            method2585((byte) -39, -52, 123, -122, -20, -58);
        }
        arg0[2] = arg2 - (this.field6258 - this.field6264);
        arg0[0] = 0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ)Z")
    public final boolean method2590(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field6275 = 63;
        }
        field6274++;
        return arg0 >= this.field6270 && arg0 <= this.field6275 && arg1 >= this.field6258 && arg1 <= this.field6259;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method2591(int arg0) {
        field6256 = null;
        if (arg0 != -12366) {
            method2591(-60);
        }
        field6273 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method2592(int arg0, byte arg1) {
        field6257++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 < 61) {
            method2592(-98, (byte) -62);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class219.field3344.method426(class503.field7255, 95) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class274.field4096.method426(class503.field7255, 106) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6271 = arg0;
        this.field6275 = arg3;
        this.field6267 = arg8;
        this.field6261 = arg7;
        this.field6272 = arg5;
        this.field6259 = arg4;
        this.field6258 = arg2;
        this.field6270 = arg1;
        this.field6264 = arg6;
    }
}
