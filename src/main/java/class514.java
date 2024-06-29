import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class514 {

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Lkaa;")
    public static class47 field6820 = new class47(70, -1);

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "Lwu;")
    public static class376 field6821;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Ljava/applet/Applet;")
    public static Applet field6818;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[Ll;")
    public static class17[] field6814;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != class411.field5711.field3887.method2432(true) && arg4 != 0 && class501.field6728 < 50 && arg5 != -1) {
            class503.field6751[class501.field6728++] = new class121((byte) 1, arg5, arg4, arg2, arg6, arg3, arg1, null);
        }
        field6816++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZ)I")
    public static final int method2869(int arg0, int arg1, int arg2, boolean arg3) {
        field6817++;
        int var4 = arg1 / arg2;
        int var5 = arg2 - 1 & arg1;
        int var6 = arg0 / arg2;
        int var7 = arg0 & arg2 - 1;
        if (arg3) {
            return 28;
        }
        int var8 = class323.method1956(var4, true, var6);
        int var9 = class323.method1956(var4 + 1, true, var6);
        int var10 = class323.method1956(var4, true, var6 + 1);
        int var11 = class323.method1956(var4 + 1, true, var6 + 1);
        int var12 = class24.method237((byte) -88, arg2, var9, var5, var8);
        int var13 = class24.method237((byte) -115, arg2, var11, var5, var10);
        return class24.method237((byte) -81, arg2, var13, var7, var12);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method2870(int arg0) {
        field6818 = null;
        if (arg0 != 29142) {
            field6821 = null;
        }
        field6820 = null;
        field6821 = null;
        field6814 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lla;ILkf;Z)V")
    public static final void method2871(class456 arg0, int arg1, class256 arg2, boolean arg3) {
        field6815++;
        if (class501.field6728 >= 50 || arg0 == null || arg0.field6243 == null || arg1 >= arg0.field6243.length || arg0.field6243[arg1] == null) {
            return;
        }
        int var4 = arg0.field6243[arg1][0];
        if (!arg3) {
            method2869(-118, -101, -123, false);
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        if (arg0.field6243[arg1].length > 1) {
            int var7 = (int) (Math.random() * (double) arg0.field6243[arg1].length);
            if (var7 > 0) {
                var5 = arg0.field6243[arg1][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg0.field6221 != null && arg0.field6230 != null) {
            var9 = arg0.field6221[arg1] + (int) (Math.random() * (double) (arg0.field6230[arg1] - arg0.field6221[arg1]));
        }
        int var10 = arg0.field6241 == null ? 255 : arg0.field6241[arg1];
        if (var8 == 0) {
            if (class472.field6475 == arg2) {
                if (!arg0.field6247) {
                    class594.method3228(var9, (byte) -106, var5, 0, var10, var6);
                    return;
                }
                class291.method1804(!arg3, var10, var6, var5, var9, false, 0);
            }
        } else if (class411.field5711.field3880.method2432(arg3) != 0) {
            int var11 = arg2.field3505 - 256 >> 9;
            int var12 = arg2.field3502 - 256 >> 9;
            int var13 = class472.field6475 == arg2 ? 0 : (var12 << 8) + (arg2.field3508 << 24) + (var11 << 16) + var8;
            class503.field6751[class501.field6728++] = new class121((byte) (arg0.field6247 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
    public static final void method2872(int arg0) {
        field6819++;
        if (class20.field337 == -1 || class5.field132 == -1) {
            return;
        }
        int var1 = ((class525.field6964 - class727.field10097) * class465.field6408 >> 16) + class727.field10097;
        class465.field6408 += var1;
        if (class465.field6408 < 65535) {
            class507.field6767 = false;
            class462.field6358 = false;
        } else {
            class465.field6408 = 65535;
            if (class507.field6767) {
                class462.field6358 = false;
            } else {
                class462.field6358 = true;
            }
            class507.field6767 = true;
        }
        float var2 = (float) class465.field6408 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class284.field4015 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class347.field4869[class20.field337][var4][var5] * 3;
            int var22 = class347.field4869[class20.field337][var4 + 1][var5] * 3;
            int var23 = (class347.field4869[class20.field337][var4 + 2][var5] - (class347.field4869[class20.field337][var4 + 3][var5] - class347.field4869[class20.field337][var4 + 2][var5])) * 3;
            int var24 = class347.field4869[class20.field337][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class347.field4869[class20.field337][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class222.field3162 = (int) var3[1] * -1;
        class314.field4488 = (int) var3[2] - (class334.field4757 * 512);
        class694.field9662 = (int) var3[0] - (class503.field6752 * 512);
        float[] var6 = new float[3];
        int var7 = class41.field549 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class347.field4869[class5.field132][var7][var8] * 3;
            int var15 = class347.field4869[class5.field132][var7 + 1][var8] * 3;
            int var16 = (class347.field4869[class5.field132][var7 + 2][var8] + class347.field4869[class5.field132][var7 - -2][var8] - class347.field4869[class5.field132][var7 + 3][var8]) * 3;
            int var17 = class347.field4869[class5.field132][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class347.field4869[class5.field132][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class332.field4729 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class372.field5175 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class22.field400 = class347.field4869[class20.field337][var4][3] + ((class347.field4869[class20.field337][arg0 + var4][3] - class347.field4869[class20.field337][var4][3]) * class465.field6408 >> 16);
    }
}
