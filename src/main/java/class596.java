import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class596 {

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field8331 = new Rectangle[100];

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[I")
    public static int[] field8335;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lqga;")
    public static class168 field8333;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
    public static final void method3366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8328++;
        int var8 = arg0 + 1;
        class470.method2660(arg3, arg5, class344.field4599[arg0], (byte) 11, arg1);
        int var9 = arg4 - 1;
        class470.method2660(arg3, arg5, class344.field4599[arg4], (byte) 11, arg1);
        if (arg2 == 0) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class344.field4599[var6];
                var7[arg3] = var7[arg5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method3367(int arg0) {
        field8333 = null;
        field8335 = null;
        field8331 = null;
        int var1 = 52 / ((80 - arg0) / 45);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
    public static final int method3368(int arg0, int arg1) {
        if (arg0 != 0) {
            method3368(112, 82);
        }
        field8330++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8332++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lui;IZLr;)V")
    public static final void method3369(class209 arg0, int arg1, boolean arg2, class166 arg3) {
        field8329++;
        if (class219.field3069 != null && arg0.field2954 >= arg1) {
            for (int var4 = 0; var4 < class219.field3069.length; var4++) {
                if (class219.field3069[var4] != -1000000 && (arg0.field2948[0] <= class219.field3069[var4] || class219.field3069[var4] >= arg0.field2948[1] || arg0.field2948[2] <= class219.field3069[var4] || class219.field3069[var4] >= arg0.field2948[3]) && (arg0.field2947[0] <= class16.field168[var4] || arg0.field2947[1] <= class16.field168[var4] || class16.field168[var4] >= arg0.field2947[2] || class16.field168[var4] >= arg0.field2947[3]) && (arg0.field2947[0] >= class171.field2478[var4] || class171.field2478[var4] <= arg0.field2947[1] || class171.field2478[var4] <= arg0.field2947[2] || arg0.field2947[3] >= class171.field2478[var4]) && (class532.field7195[var4] >= arg0.field2944[0] || arg0.field2944[1] <= class532.field7195[var4] || arg0.field2944[2] <= class532.field7195[var4] || arg0.field2944[3] <= class532.field7195[var4]) && (arg0.field2944[0] >= class367.field4940[var4] || arg0.field2944[1] >= class367.field4940[var4] || class367.field4940[var4] <= arg0.field2944[2] || class367.field4940[var4] <= arg0.field2944[3])) {
                    return;
                }
            }
        }
        if (arg0.field2952 == 1) {
            int var5 = class36.field428 + arg0.field2940 - class167.field2435;
            if (var5 >= 0 && (class36.field428 + class36.field428) >= var5) {
                int var6 = arg0.field2958 + class36.field428 - class353.field4699;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > (class36.field428 + class36.field428)) {
                    return;
                }
                int var7 = arg0.field2955 + class36.field428 - class353.field4699;
                if (class36.field428 + class36.field428 < var7) {
                    var7 = class36.field428 + class36.field428;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class147.field2093[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class703.field9952 - arg0.field2947[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class103.field1453) && class51.method401(0, (byte) 110, arg0) && class51.method401(1, (byte) -44, arg0) && class51.method401(2, (byte) -104, arg0) && class51.method401(3, (byte) -38, arg0)) {
                        class63.field713[class547.field7414++] = arg0;
                    }
                }
            }
        } else if (arg0.field2952 == 2) {
            int var10 = class36.field428 + arg0.field2958 - class353.field4699;
            if (var10 >= 0 && var10 <= class36.field428 + class36.field428) {
                int var11 = class36.field428 + arg0.field2940 - class167.field2435;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > (class36.field428 + class36.field428)) {
                    return;
                }
                int var12 = class36.field428 + arg0.field2953 - class167.field2435;
                if (var12 > class36.field428 + class36.field428) {
                    var12 = class36.field428 + class36.field428;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var11 <= var12) {
                    if (class147.field2093[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class33.field416 - arg0.field2944[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class103.field1453 > var14) && class51.method401(0, (byte) 104, arg0) && class51.method401(1, (byte) 105, arg0) && class51.method401(2, (byte) 104, arg0) && class51.method401(3, (byte) 119, arg0)) {
                        class63.field713[class547.field7414++] = arg0;
                    }
                }
            }
        } else if (arg0.field2952 == 16 || arg0.field2952 == 8) {
            int var23 = arg0.field2940 - (class167.field2435 - class36.field428);
            if (var23 >= 0 && (class36.field428 + class36.field428) >= var23) {
                int var24 = arg0.field2958 + class36.field428 - class353.field4699;
                if (var24 >= 0 && (class36.field428 + class36.field428) >= var24 && class147.field2093[var23][var24]) {
                    float var25 = (float) (class703.field9952 - arg0.field2947[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class33.field416 - arg0.field2944[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!(var25 < (float) class103.field1453) || !((float) class103.field1453 > var26) && class51.method401(0, (byte) -94, arg0) && class51.method401(1, (byte) 120, arg0) && class51.method401(2, (byte) -5, arg0) && class51.method401(3, (byte) -123, arg0)) {
                        class63.field713[class547.field7414++] = arg0;
                    }
                }
            }
        } else if (arg0.field2952 == 4) {
            float var15 = (float) (arg0.field2948[0] - class599.field8372);
            if (!(var15 <= (float) class276.field3817)) {
                int var16 = class36.field428 + arg0.field2958 - class353.field4699;
                if (var16 < 0) {
                    var16 = 0;
                } else if (class36.field428 + class36.field428 < var16) {
                    return;
                }
                int var17 = arg0.field2955 + class36.field428 - class353.field4699;
                if (var17 > (class36.field428 + class36.field428)) {
                    var17 = class36.field428 + class36.field428;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = arg0.field2940 + class36.field428 - class167.field2435;
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > (class36.field428 + class36.field428)) {
                    return;
                }
                int var19 = arg0.field2953 + class36.field428 - class167.field2435;
                if ((class36.field428 + class36.field428) < var19) {
                    var19 = class36.field428 + class36.field428;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label296: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class147.field2093[var21][var22]) {
                            var20 = true;
                            break label296;
                        }
                    }
                }
                if (var20 && class51.method401(0, (byte) -84, arg0) && class51.method401(1, (byte) 114, arg0) && class51.method401(2, (byte) 119, arg0) && class51.method401(3, (byte) -52, arg0)) {
                    class63.field713[class547.field7414++] = arg0;
                }
            }
        } else if (!arg2) {
            field8333 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(II)V")
    public class596(int arg0, int arg1) {
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field8331[var0] = new Rectangle();
        }
        field8334 = 1405;
        field8335 = new int[6];
    }
}
