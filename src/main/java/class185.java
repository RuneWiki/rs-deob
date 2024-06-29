import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class185 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lqc;")
    private class325 field2801 = new class325(128);

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Lqc;")
    public class325 field2811 = new class325(64);

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Ldda;")
    private class597 field2810;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Ldda;")
    public class597 field2804;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2807 = -50;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "Lm;")
    public static class105 field2812;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 3)
    public static void method1212(byte arg0) {
        field2812 = null;
        if (arg0 >= -9) {
            method1215(-0.79098827F, 63, -1.8634629F, 47, 24, -43, 1.9316757F, 57);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lmaa;", line = 20)
    public final class42 method1213(int arg0, int arg1) {
        field2808++;
        class325 var3 = this.field2801;
        class42 var4;
        synchronized (this.field2801) {
            var4 = (class42) this.field2801.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field2810;
        byte[] var6;
        synchronized (this.field2810) {
            var6 = this.field2810.method3486((byte) -55, arg0, 36);
        }
        class42 var7 = new class42();
        if (arg1 != 6) {
            this.field2801 = null;
        }
        var7.field480 = this;
        var7.field509 = arg0;
        if (var6 != null) {
            var7.method223((byte) -126, new class428(var6));
        }
        var7.method217(true);
        class325 var8 = this.field2801;
        synchronized (this.field2801) {
            this.field2801.method2029(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 53)
    public final void method1214(byte arg0) {
        class325 var2 = this.field2801;
        synchronized (this.field2801) {
            this.field2801.method2037(true);
        }
        field2814++;
        class325 var3 = this.field2811;
        synchronized (this.field2811) {
            this.field2811.method2037(true);
        }
        if (arg0 != -58) {
            this.method1219(-25, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(FIFIIIFI)[F", line = 76)
    public static final float[] method1215(float arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6, int arg7) {
        field2806++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[8] = var10;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[6] = -var11;
        var8[0] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg7 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + (arg3 * arg3)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg5 / var19;
                var14 = (float) (-arg3) / var19;
            }
            var13[5] = var14 * var18;
            var13[4] = var15;
            var13[3] = -var16 * var18;
            var13[2] = var14 * var16 * var17;
            var13[7] = -var14 * var18;
            var13[8] = var16 * var16 * var17 + var15;
            var13[6] = var14 * var16 * var17;
            var13[1] = var16 * var18;
            var13[0] = var14 * var14 * var17 + var15;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[6] *= arg6;
        var9[3] *= arg0;
        var9[2] *= arg2;
        var9[7] *= arg6;
        var9[4] *= arg0;
        var9[0] *= arg2;
        var9[5] *= arg0;
        var9[8] *= arg6;
        var9[1] *= arg2;
        return arg4 >= 0 ? null : var9;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V", line = 159)
    public final void method1216(byte arg0) {
        field2803++;
        class325 var2 = this.field2801;
        synchronized (this.field2801) {
            this.field2801.method2024((byte) -82);
        }
        if (arg0 != 12) {
            this.method1213(6, 26);
        }
        class325 var3 = this.field2811;
        synchronized (this.field2811) {
            this.field2811.method2024((byte) -97);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 177)
    public final void method1217(int arg0, int arg1, int arg2) {
        this.field2801 = new class325(arg0);
        int var4 = 109 / ((arg2 + 55) / 60);
        field2802++;
        this.field2811 = new class325(arg1);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Loda;ILdda;Ldda;)V", line = 277)
    public class185(class559 arg0, int arg1, class597 arg2, class597 arg3) {
        this.field2810 = arg2;
        this.field2804 = arg3;
        this.field2810.method3462(36, -93);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIILjava/lang/String;Ldd;ILra;Lpa;Lwca;BI)V", line = 200)
    public static final void method1218(int arg0, int arg1, int arg2, int arg3, String arg4, class166 arg5, int arg6, class262 arg7, class594 arg8, class311 arg9, byte arg10, int arg11) {
        field2813++;
        int var12;
        if (class287.field4232 == 4) {
            var12 = (int) class591.field8752 & 0x3FFF;
        } else {
            var12 = (int) class591.field8752 + class225.field3322 & 0x3FFF;
        }
        int var13 = Math.max(arg9.field4543 / 2, arg9.field4620 / 2) + 10;
        if (arg10 != 99) {
            method1212((byte) 122);
        }
        int var14 = arg0 * arg0 + arg2 * arg2;
        if (var14 > var13 * var13) {
            return;
        }
        int var15 = class14.field129[var12];
        int var16 = class14.field130[var12];
        if (class287.field4232 != 4) {
            var16 = var16 * 256 / (class99.field1254 + 256);
            var15 = var15 * 256 / (class99.field1254 + 256);
        }
        int var17 = arg0 * var15 + arg2 * var16 >> 15;
        int var18 = arg0 * var16 - (arg2 * var15) >> 15;
        int var19 = arg5.method1055(null, (byte) 98, arg4, 100);
        int var20 = var17 - var19 / 2;
        int var21 = arg5.method1060(93, 0, null, arg4, 100);
        if (var20 >= (-arg9.field4543) && var20 <= arg9.field4543 && var18 >= (-arg9.field4620) && var18 <= arg9.field4620) {
            arg7.method1679(50, arg3 - var21 - (var18 - -arg1 + -(arg9.field4620 / 2)), null, arg3, 1, var19, arg4, arg9.field4543 / 2 + arg6 + var20, 30478, 0, arg8, 0, null, arg11, 0, arg6);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V", line = 248)
    public final void method1219(int arg0, byte arg1) {
        class325 var3 = this.field2801;
        synchronized (this.field2801) {
            this.field2801.method2028(arg0, true);
        }
        field2805++;
        class325 var4 = this.field2811;
        synchronized (this.field2811) {
            this.field2811.method2028(arg0, true);
            if (arg1 != 94) {
                field2815 = 102;
            }
        }
    }
}
