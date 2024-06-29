import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class204 extends class743 {

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    private int field2902 = 0;

    @OriginalMember(owner = "client!dga", name = "q", descriptor = "I")
    private int field2914 = 0;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
    private int field2912 = 0;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "Z")
    private boolean field2906 = false;

    @OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
    private int field2926 = 0;

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "Lgt;")
    private class453 field2925;

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
    private int field2923;

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "I")
    private int field2909;

    @OriginalMember(owner = "client!dga", name = "u", descriptor = "Lwda;")
    private class636 field2918;

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "Z")
    private boolean field2929;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "Z")
    private boolean field2910;

    @OriginalMember(owner = "client!dga", name = "r", descriptor = "Z")
    private boolean field2915;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "Z")
    private boolean field2905;

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "Lqaa;")
    public static class27 field2919 = new class27(78, 16);

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!dga", name = "s", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!dga", name = "t", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!dga", name = "A", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[B)Lwga;")
    public static final class745 method1421(int arg0, byte[] arg1) {
        field2900++;
        class745 var2 = new class745();
        class35 var3 = new class35(arg1);
        var3.field469 = var3.field483.length - 2;
        int var4 = var3.method253(-13900);
        int var5 = var3.field483.length - var4 - 12 - 2;
        var3.field469 = var5;
        int var6 = var3.method234((byte) -104);
        var2.field10428 = var3.method253(-13900);
        var2.field10437 = var3.method253(-13900);
        var2.field10430 = var3.method253(-13900);
        var2.field10432 = var3.method253(-13900);
        int var7 = var3.method273(255);
        if (var7 > 0) {
            var2.field10439 = new class758[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method253(-13900);
                class758 var10 = new class758(class613.method3530(false, var9));
                var2.field10439[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method234((byte) -99);
                    int var12 = var3.method234((byte) -107);
                    var10.method4211(new class528(var12), (byte) 61, (long) var11);
                }
            }
        }
        var3.field469 = 0;
        var2.field10435 = var3.method258(255);
        var2.field10427 = new int[var6];
        var2.field10433 = new int[var6];
        var2.field10429 = new String[var6];
        int var13 = 0;
        if (arg0 <= 106) {
            method1426(false, true, null);
        }
        while (var5 > var3.field469) {
            int var14 = var3.method253(-13900);
            if (var14 == 3) {
                var2.field10429[var13] = var3.method272(2).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field10433[var13] = var3.method273(255);
            } else {
                var2.field10433[var13] = var3.method234((byte) -107);
            }
            var2.field10427[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V")
    public final void method81(int arg0, int arg1, int arg2) {
        field2924++;
        int[] var4 = this.field2925.method574(arg0, arg1, this.field2909, this.field2923);
        int[] var5 = new int[this.field2923 * this.field2909];
        this.field2918.method422(var5, 0, this.field2909, (byte) 110, 0, this.field2923, 0);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field2923; var6++) {
                int var7 = this.field2909 * var6;
                for (int var8 = 0; var8 < this.field2909; var8++) {
                    var5[var7 + var8] = class164.method1221(class555.method3246(var5[var7 + var8], 16777215), class555.method3246(1593769984, var4[var7 + var8]) << 8);
                }
            }
        } else if (arg2 == 1) {
            for (int var15 = 0; var15 < this.field2923; var15++) {
                int var16 = this.field2909 * var15;
                for (int var17 = 0; var17 < this.field2909; var17++) {
                    var5[var16 + var17] = class164.method1221(class555.method3246(-594870528, var4[var16 + var17]) << 16, class555.method3246(var5[var16 + var17], 16777215));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field2923; var9++) {
                int var10 = this.field2909 * var9;
                for (int var11 = 0; var11 < this.field2909; var11++) {
                    var5[var10 + var11] = class164.method1221(class555.method3246(var4[var10 + var11] << 24, -504545), class555.method3246(16777215, var5[var10 + var11]));
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field2923; var12++) {
                int var13 = this.field2909 * var12;
                for (int var14 = 0; var14 < this.field2909; var14++) {
                    var5[var13 + var14] = class164.method1221(class555.method3246(var5[var13 + var14], 16777215), var4[var13 + var14] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method1423(0, 0, this.field2909, this.field2923, var5, 0, this.field2909);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)I")
    public static final int method1422(int arg0) {
        int var1 = 41 % ((71 - arg0) / 48);
        field2907++;
        return class70.field1264;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIII[III)V")
    private final void method1423(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field2903++;
        this.field2918.method434(arg3, arg0, arg1, true, arg6, arg2, arg4, arg5);
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V")
    public static void method1424(int arg0) {
        field2919 = null;
        if (arg0 > -69) {
            field2919 = null;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2927++;
        int[] var7 = this.field2925.method574(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class164.method1221(var7[var8], -16777216);
            }
            this.method1423(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2901++;
        class25 var9 = this.field2925.method2765((byte) -105);
        class25 var10 = this.field2925.method2773((byte) -30);
        this.field2918.method979(this.field2929 || this.field2910 || (arg7 & 0x1) == 0 ? class514.field7326 : class267.field3864, -107);
        this.field2925.method2777((byte) 45);
        this.field2925.method2732(-123, this.field2918);
        this.field2925.method2738(-49, arg6);
        this.field2925.method2721(arg4, true);
        this.field2925.method2767(1, 25103, class142.field2176);
        this.field2925.method2755(false, 1, class142.field2176);
        this.field2925.method2730(arg5, -32755);
        var10.method179(1.0F, this.field2918.method423(31272, (float) this.field2909), false, this.field2918.method432((float) this.field2923, -12086));
        if (this.field2906) {
            arg2 = this.field2909 * arg2 / this.method82();
            arg3 = this.field2923 * arg3 / this.method83();
            arg1 += this.field2912 * arg3 / this.field2923;
            arg0 += this.field2914 * arg2 / this.field2909;
        }
        var9.method179(0.0F, (float) arg2, false, (float) arg3);
        var9.method149(arg0, arg1, 0);
        this.field2925.method2699(class56.field1049, 124);
        this.field2925.method2698(0);
        this.field2925.method2757(2);
        this.field2925.method2763((byte) -116);
        this.field2925.method2767(1, 25103, class44.field665);
        this.field2925.method2755(false, 1, class44.field665);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method92(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class484 arg7, int arg8, int arg9) {
        field2911++;
        class25 var11 = this.field2925.method2765((byte) -83);
        class25 var12 = this.field2925.method2773((byte) -30);
        class613 var13 = (class613) arg7;
        class636 var14 = var13.field8869;
        this.field2918.method979(this.field2929 || this.field2910 || (arg6 & 0x1) == 0 ? class514.field7326 : class267.field3864, -88);
        this.field2925.method2777((byte) 45);
        this.field2925.method2732(-84, this.field2918);
        this.field2925.method2738(-94, 1);
        this.field2925.method2721(1, true);
        if (this.field2906) {
            float var15 = (float) this.field2909 / (float) this.method82();
            float var16 = (float) this.field2923 / (float) this.method83();
            var11.method167(0.0F, (arg5 - arg1) * var16, (byte) -49, (arg4 - arg0) * var16, (arg2 - arg0) * var15, 0.0F, 1.0F, 0.0F, (arg3 - arg1) * var15, 0.0F);
            var11.method170(((float) this.field2912 + arg1) * var16, (byte) 95, ((float) this.field2914 + arg0) * var15, 0.0F);
        } else {
            var11.method167(0.0F, arg5 - arg1, (byte) -49, arg4 - arg0, -arg0 + arg2, 0.0F, 1.0F, 0.0F, arg3 - arg1, 0.0F);
            var11.method170(arg1, (byte) 95, arg0, 0.0F);
        }
        var12.method179(1.0F, this.field2918.method423(31272, (float) this.field2909), false, this.field2918.method432((float) this.field2923, -12086));
        this.field2925.method2699(class56.field1049, -50);
        this.field2925.method2753((byte) -17, 1);
        this.field2925.method2732(-73, var14);
        this.field2925.method2769(class571.field8118, class140.field2165, 18721);
        this.field2925.method2767(0, 25103, class44.field665);
        class25 var17 = this.field2925.method2773((byte) -30);
        var17.method160(var11);
        var17.method149(-arg8, -arg9, 0);
        var17.method178(var14.method423(31272, 1.0F), var14.method432(1.0F, -12086), 1.0F, (byte) 65);
        this.field2925.method2699(class56.field1049, -29);
        this.field2925.method2698(0);
        this.field2925.method2757(2);
        this.field2925.method2763((byte) -67);
        this.field2925.method2767(0, 25103, class68.field1225);
        this.field2925.method2769(class571.field8118, class571.field8118, 18721);
        this.field2925.method2732(-69, null);
        this.field2925.method2753((byte) -17, 0);
        this.field2925.method2763((byte) -87);
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "()I")
    public final int method95() {
        field2898++;
        return this.field2923;
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "()I")
    public final int method82() {
        field2913++;
        return this.field2909 + this.field2914 + this.field2926;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2904++;
        class25 var8 = this.field2925.method2765((byte) -83);
        class25 var9 = this.field2925.method2773((byte) -30);
        this.field2918.method979(class514.field7326, -107);
        this.field2925.method2777((byte) 45);
        this.field2925.method2732(-52, this.field2918);
        this.field2925.method2738(-79, arg6);
        this.field2925.method2721(arg4, true);
        this.field2925.method2767(1, 25103, class142.field2176);
        this.field2925.method2755(false, 1, class142.field2176);
        this.field2925.method2730(arg5, -32755);
        boolean var10 = this.field2905 && this.field2912 == 0 && this.field2902 == 0;
        boolean var11 = this.field2915 && this.field2914 == 0 && this.field2926 == 0;
        if ((var11 & var10)) {
            var9.method179(1.0F, this.field2918.method423(31272, (float) arg2), false, this.field2918.method432((float) arg3, -12086));
            var8.method179(0.0F, (float) arg2, false, (float) arg3);
            var8.method149(arg0, arg1, 0);
            this.field2925.method2699(class56.field1049, -121);
            this.field2925.method2698(0);
            this.field2925.method2757(2);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method83();
            var9.method179(1.0F, this.field2918.method423(31272, (float) arg2), false, this.field2918.method432((float) this.field2923, -12086));
            this.field2925.method2699(class56.field1049, -15);
            int var14 = arg1 + this.field2912;
            int var15 = this.field2923 + var14;
            while (var15 <= var12) {
                var8.method179(0.0F, (float) arg2, false, (float) this.field2923);
                var8.method149(arg0, var14, 0);
                this.field2925.method2698(0);
                this.field2925.method2757(2);
                var15 += var13;
                var14 += var13;
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method179(1.0F, this.field2918.method423(31272, (float) arg2), false, this.field2918.method432((float) var16, -12086));
                this.field2925.method2699(class56.field1049, -96);
                var8.method179(0.0F, (float) arg2, false, (float) var16);
                var8.method149(arg0, var14, 0);
                this.field2925.method2698(0);
                this.field2925.method2757(2);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method82();
            var9.method179(1.0F, this.field2918.method423(31272, (float) this.field2909), false, this.field2918.method432((float) arg3, -12086));
            this.field2925.method2699(class56.field1049, 125);
            int var32 = this.field2914 + arg0;
            for (int var33 = this.field2909 + var32; var33 <= var30; var33 += var31) {
                var8.method179(0.0F, (float) this.field2909, false, (float) arg3);
                var8.method149(var32, arg1, 0);
                this.field2925.method2698(0);
                this.field2925.method2757(2);
                var32 += var31;
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method179(1.0F, this.field2918.method423(31272, (float) var34), false, this.field2918.method432((float) arg3, -12086));
                this.field2925.method2699(class56.field1049, -1);
                var8.method179(0.0F, (float) var34, false, (float) arg3);
                var8.method149(var32, arg1, 0);
                this.field2925.method2698(0);
                this.field2925.method2757(2);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method82();
            int var20 = this.method83();
            int var21 = arg1 + this.field2912;
            int var22 = this.field2923 + var21;
            while (var17 >= var22) {
                var9.method179(1.0F, this.field2918.method423(31272, (float) this.field2909), false, this.field2918.method432((float) this.field2923, -12086));
                this.field2925.method2699(class56.field1049, 113);
                int var27 = this.field2914 + arg0;
                int var28 = this.field2909 + var27;
                while (var18 >= var28) {
                    var8.method179(0.0F, (float) this.field2909, false, (float) this.field2923);
                    var8.method149(var27, var21, 0);
                    this.field2925.method2698(0);
                    var28 += var19;
                    var27 += var19;
                    this.field2925.method2757(2);
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method179(1.0F, this.field2918.method423(31272, (float) var29), false, this.field2918.method432((float) this.field2923, -12086));
                    this.field2925.method2699(class56.field1049, 118);
                    var8.method179(0.0F, (float) var29, false, (float) this.field2923);
                    var8.method149(var27, var21, 0);
                    this.field2925.method2698(0);
                    this.field2925.method2757(2);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method179(1.0F, this.field2918.method423(31272, (float) this.field2909), false, this.field2918.method432((float) var23, -12086));
                this.field2925.method2699(class56.field1049, 115);
                int var24 = this.field2914 + arg0;
                int var25 = this.field2909 + var24;
                while (var18 >= var25) {
                    var8.method179(0.0F, (float) this.field2909, false, (float) var23);
                    var8.method149(var24, var21, 0);
                    this.field2925.method2698(0);
                    var25 += var19;
                    this.field2925.method2757(2);
                    var24 += var19;
                }
                if (var18 > var24) {
                    int var26 = var18 - var24;
                    var9.method179(1.0F, this.field2918.method423(31272, (float) var26), false, this.field2918.method432((float) var23, -12086));
                    this.field2925.method2699(class56.field1049, 117);
                    var8.method179(0.0F, (float) var26, false, (float) var23);
                    var8.method149(var24, var21, 0);
                    this.field2925.method2698(0);
                    this.field2925.method2757(2);
                }
            }
        }
        this.field2925.method2763((byte) -108);
        this.field2925.method2767(1, 25103, class44.field665);
        this.field2925.method2755(false, 1, class44.field665);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lha;Z)V")
    public static final void method1425(class58 arg0, boolean arg1) {
        field2899++;
        if (class265.field3857.method1531(0) == 0) {
            return;
        }
        if (class471.field6781.field6684.method1843(27669) == 0) {
            for (class176 var4 = (class176) class265.field3857.method1522(true); var4 != null; var4 = (class176) class265.field3857.method1527((byte) 97)) {
                class558.field7942.method722(class242.field3393, var4.field2552, var4.field2549, false, var4.field2554 ? class468.field6748.field4932 : null, false, var4.field2547, var4.field2551, arg0, (byte) -79, arg0, var4.field2550);
                var4.method3617(1);
            }
            class237.method1608(!arg1);
        } else {
            if (class226.field3227 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class226.field3227 = class464.method2824(var2, class345.field4863, 0, class679.field9571, 0, 0);
                class181.field2591 = class226.field3227.method632(class226.method1560(0, 255, class722.field10091, class299.field4155), class55.method507(class501.field7161, class299.field4155, 0), true);
            }
            for (class176 var3 = (class176) class265.field3857.method1522(true); var3 != null; var3 = (class176) class265.field3857.method1527((byte) 99)) {
                class558.field7942.method722(class181.field2591, var3.field2552, var3.field2549, false, var3.field2554 ? class468.field6748.field4932 : null, false, var3.field2547, var3.field2551, arg0, (byte) -93, class226.field3227, var3.field2550);
                var3.method3617(1);
            }
        }
        if (arg1) {
            method1422(100);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "()I")
    public final int method83() {
        field2908++;
        return this.field2912 + this.field2902 + this.field2923;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method96(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field2920++;
        class25 var11 = this.field2925.method2765((byte) -39);
        class25 var12 = this.field2925.method2773((byte) -30);
        this.field2918.method979(this.field2929 || this.field2910 || (arg9 & 0x1) == 0 ? class514.field7326 : class267.field3864, -109);
        this.field2925.method2777((byte) 45);
        this.field2925.method2732(-123, this.field2918);
        this.field2925.method2738(-119, arg8);
        this.field2925.method2721(arg6, true);
        this.field2925.method2767(1, 25103, class142.field2176);
        this.field2925.method2755(false, 1, class142.field2176);
        this.field2925.method2730(arg7, -32755);
        if (this.field2906) {
            float var13 = (float) this.method82();
            float var14 = (float) this.method83();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field2912 * var17;
            float var20 = (float) this.field2912 * var18;
            float var21 = (float) this.field2914 * var15;
            float var22 = (float) this.field2914 * var16;
            float var23 = (float) this.field2926 * -var15;
            float var24 = (float) this.field2926 * -var16;
            float var25 = (float) this.field2902 * -var17;
            arg2 = arg2 + var23 + var19;
            float var26 = (float) this.field2902 * -var18;
            arg3 = arg3 + var24 + var20;
            arg4 = arg4 + var21 + var25;
            arg1 = arg1 + var22 + var20;
            arg0 = arg0 + var21 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method167(0.0F, arg5 - arg1, (byte) -49, arg4 - arg0, arg2 - arg0, 0.0F, 1.0F, 0.0F, arg3 - arg1, 0.0F);
        var11.method170(arg1, (byte) 95, arg0, 0.0F);
        var12.method179(1.0F, this.field2918.method423(31272, (float) this.field2909), false, this.field2918.method432((float) this.field2923, -12086));
        this.field2925.method2699(class56.field1049, 121);
        this.field2925.method2698(0);
        this.field2925.method2757(2);
        this.field2925.method2763((byte) -118);
        this.field2925.method2767(1, 25103, class44.field665);
        this.field2925.method2755(false, 1, class44.field665);
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(IIII)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3) {
        this.field2912 = arg1;
        field2917++;
        this.field2902 = arg3;
        this.field2926 = arg2;
        this.field2914 = arg0;
        this.field2906 = this.field2914 != 0 || this.field2912 != 0 || this.field2926 != 0 || this.field2902 != 0;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZZLvg;)V")
    public static final void method1426(boolean arg0, boolean arg1, class52 arg2) {
        field2921++;
        class500 var3 = arg2.method464((byte) -118);
        if (arg2.field992 == 0) {
            class21.field266 = 0;
            arg2.field989 = 0;
            class668.field9381 = -1;
            return;
        }
        if (arg2.field944 != -1 && arg2.field911 == 0) {
            class718 var4 = class698.field9806.method851(arg2.field944, -2);
            if (arg2.field988 > 0 && var4.field10051 == 0) {
                class21.field266 = 0;
                arg2.field989++;
                class668.field9381 = -1;
                return;
            }
            if (arg2.field988 <= 0 && var4.field10062 == 0) {
                arg2.field989++;
                class21.field266 = 0;
                class668.field9381 = -1;
                return;
            }
        }
        if (arg2.field957 != -1 && arg2.field960 <= class605.field8787) {
            class164 var5 = class638.field9104.method3753(110, arg2.field957);
            if (var5.field2412 && var5.field2427 != -1) {
                class718 var6 = class698.field9806.method851(var5.field2427, -2);
                if (arg2.field988 > 0 && var6.field10051 == 0) {
                    class21.field266 = 0;
                    class668.field9381 = -1;
                    arg2.field989++;
                    return;
                }
                if (arg2.field988 <= 0 && var6.field10062 == 0) {
                    arg2.field989++;
                    class21.field266 = 0;
                    class668.field9381 = -1;
                    return;
                }
            }
        }
        if (arg2.field957 != -1 && class605.field8787 >= arg2.field960) {
            class164 var7 = class638.field9104.method3753(-72, arg2.field957);
            if (var7.field2412 && var7.field2427 != -1) {
                class718 var8 = class698.field9806.method851(var7.field2427, -2);
                if (arg2.field988 > 0 && var8.field10051 == 0) {
                    arg2.field989++;
                    class21.field266 = 0;
                    class668.field9381 = -1;
                    return;
                }
                if (arg2.field988 <= 0 && var8.field10062 == 0) {
                    class668.field9381 = -1;
                    class21.field266 = 0;
                    arg2.field989++;
                    return;
                }
            }
        }
        int var9 = arg2.field644;
        int var10 = arg2.field648;
        int var11 = arg2.field991[arg2.field992 - 1] * 512 + (arg2.method482(arg1) * 256);
        int var12 = arg2.field995[arg2.field992 - 1] * 512 + (arg2.method482(arg1) * 256);
        if (var9 < var11) {
            if (var12 > var10) {
                arg2.method474(-1, 10240);
            } else if (var12 < var10) {
                arg2.method474(-1, 14336);
            } else {
                arg2.method474(-1, 12288);
            }
        } else if (var9 > var11) {
            if (var12 > var10) {
                arg2.method474(-1, 6144);
            } else if (var12 >= var10) {
                arg2.method474(-1, 4096);
            } else {
                arg2.method474(-1, 2048);
            }
        } else if (var10 < var12) {
            arg2.method474(-1, 8192);
        } else if (var12 < var10) {
            arg2.method474(-1, 0);
        }
        byte var13 = arg2.field986[arg2.field992 - 1];
        if (!arg0 && var11 - var9 > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024) {
            arg2.field648 = var12;
            arg2.field644 = var11;
            arg2.method462(arg2.field920, false, -1);
            arg2.field992--;
            class668.field9381 = -1;
            class21.field266 = 0;
            if (arg2.field988 > 0) {
                arg2.field988--;
            }
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg2 instanceof class84) {
            var15 = ((class84) arg2).field1523.field6960;
        }
        if (var15) {
            int var16 = arg2.field920 - arg2.field888.field7100;
            if (var16 != 0 && arg2.field967 == -1 && arg2.field878 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg2.field992 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg2.field992 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg2.field992 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg2.field992 > 2) {
                var14 = 32;
            }
        }
        if (arg2.field989 > 0 && arg2.field992 > 1) {
            var14 = 32;
            arg2.field989--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class21.field266 = 0;
        if (var3.field7153 != -1) {
            int var17 = var14 << 9;
            if (arg2.field992 == 1) {
                int var18 = arg2.field987 * arg2.field987;
                int var19 = (var11 >= arg2.field644 ? var11 - arg2.field644 : -var11 + arg2.field644) << 9;
                int var20 = (var12 >= arg2.field648 ? var12 - arg2.field648 : -var12 + arg2.field648) << 9;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field7153 * 2 * var21;
                if (var18 > var22) {
                    arg2.field987 /= 2;
                } else if (var18 / 2 > var21) {
                    arg2.field987 -= var3.field7153;
                    if (arg2.field987 < 0) {
                        arg2.field987 = 0;
                    }
                } else if (var17 > arg2.field987) {
                    arg2.field987 += var3.field7153;
                    if (var17 < arg2.field987) {
                        arg2.field987 = var17;
                    }
                }
            } else if (var17 > arg2.field987) {
                arg2.field987 += var3.field7153;
                if (var17 < arg2.field987) {
                    arg2.field987 = var17;
                }
            } else if (arg2.field987 > 0) {
                arg2.field987 -= var3.field7153;
                if (arg2.field987 < 0) {
                    arg2.field987 = 0;
                }
            }
            var14 = arg2.field987 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class668.field9381 = -1;
        } else {
            if (var11 > var9) {
                arg2.field644 += var14;
                class21.field266 |= 0x4;
                if (var11 < arg2.field644) {
                    arg2.field644 = var11;
                }
            } else if (var11 < var9) {
                arg2.field644 -= var14;
                class21.field266 |= 0x8;
                if (arg2.field644 < var11) {
                    arg2.field644 = var11;
                }
            }
            if (var14 >= 32) {
                class668.field9381 = 2;
            } else {
                class668.field9381 = var13;
            }
            if (var10 < var12) {
                arg2.field648 += var14;
                class21.field266 |= 0x1;
                if (var12 < arg2.field648) {
                    arg2.field648 = var12;
                }
            } else if (var12 < var10) {
                class21.field266 |= 0x2;
                arg2.field648 -= var14;
                if (var12 > arg2.field648) {
                    arg2.field648 = var12;
                }
            }
        }
        if (arg2.field644 == var11 && arg2.field648 == var12) {
            if (arg2.field988 > 0) {
                arg2.field988--;
            }
            arg2.field992--;
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "()I")
    public final int method93() {
        field2928++;
        return this.field2909;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILaa;II)V")
    public final void method90(int arg0, int arg1, class484 arg2, int arg3, int arg4) {
        field2922++;
        class613 var6 = (class613) arg2;
        class636 var7 = var6.field8869;
        int var8 = this.field2914 + arg0;
        int var9 = this.field2912 + arg1;
        this.field2918.method979(class514.field7326, -100);
        this.field2925.method2777((byte) 45);
        this.field2925.method2732(-105, this.field2918);
        this.field2925.method2738(-31, 1);
        this.field2925.method2721(1, true);
        class25 var10 = this.field2925.method2765((byte) -82);
        var10.method179(0.0F, (float) this.field2909, false, (float) this.field2923);
        var10.method149(var8, var9, 0);
        this.field2925.method2698(0);
        class25 var11 = this.field2925.method2773((byte) -30);
        var11.method179(1.0F, this.field2918.method423(31272, (float) this.field2909), false, this.field2918.method432((float) this.field2923, -12086));
        this.field2925.method2699(class56.field1049, -88);
        this.field2925.method2753((byte) -17, 1);
        this.field2925.method2732(-119, var7);
        this.field2925.method2769(class571.field8118, class140.field2165, 18721);
        this.field2925.method2767(0, 25103, class44.field665);
        class25 var12 = this.field2925.method2773((byte) -30);
        var12.method179(1.0F, var7.method423(31272, (float) this.field2909), false, var7.method432((float) this.field2923, -12086));
        var12.method170(var7.method432((float) (var9 - arg4), -12086), (byte) 95, var7.method423(31272, (float) (var8 - arg3)), 0.0F);
        this.field2925.method2699(class56.field1049, 17);
        this.field2925.method2757(2);
        this.field2925.method2763((byte) -93);
        this.field2925.method2767(0, 25103, class68.field1225);
        this.field2925.method2769(class571.field8118, class571.field8118, 18721);
        this.field2925.method2732(-73, null);
        this.field2925.method2753((byte) -17, 0);
        this.field2925.method2763((byte) -69);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lgt;IIZ)V")
    public class204(class453 arg0, int arg1, int arg2, boolean arg3) {
        this.field2925 = arg0;
        this.field2923 = arg2;
        this.field2909 = arg1;
        this.field2918 = arg0.method1024(arg1, arg3 ? class282.field4019 : class369.field5177, class438.field6117, 0, arg2);
        this.field2918.method427(true, (byte) 66, true);
        this.field2929 = arg1 != this.field2918.method429(112);
        this.field2910 = this.field2918.method426(true) != arg2;
        this.field2915 = !this.field2929 && this.field2918.method428(-12720);
        this.field2905 = !this.field2910 && this.field2918.method428(-12720);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIII)V")
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2916++;
        class25 var6 = this.field2925.method2765((byte) -97);
        class25 var7 = this.field2925.method2773((byte) -30);
        int var8 = this.field2914 + arg0;
        int var9 = this.field2912 + arg1;
        this.field2918.method979(class514.field7326, -101);
        this.field2925.method2777((byte) 45);
        this.field2925.method2732(-56, this.field2918);
        this.field2925.method2738(-37, arg4);
        this.field2925.method2721(arg2, true);
        this.field2925.method2767(1, 25103, class142.field2176);
        this.field2925.method2755(false, 1, class142.field2176);
        this.field2925.method2730(arg3, -32755);
        var6.method179(0.0F, (float) this.field2909, false, (float) this.field2923);
        var6.method149(var8, var9, 0);
        var7.method179(1.0F, this.field2918.method423(31272, (float) this.field2909), false, this.field2918.method432((float) this.field2923, -12086));
        this.field2925.method2699(class56.field1049, 125);
        this.field2925.method2698(0);
        this.field2925.method2757(2);
        this.field2925.method2763((byte) -85);
        this.field2925.method2767(1, 25103, class44.field665);
        this.field2925.method2755(false, 1, class44.field665);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lgt;II[III)V")
    public class204(class453 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2923 = arg2;
        this.field2925 = arg0;
        this.field2909 = arg1;
        this.field2918 = arg0.method1049(arg5, arg4, arg1, arg3, false, arg2, false);
        this.field2918.method427(true, (byte) 66, true);
        this.field2929 = arg1 != this.field2918.method429(126);
        this.field2910 = arg2 != this.field2918.method426(true);
        this.field2915 = !this.field2929 && this.field2918.method428(-12720);
        this.field2905 = !this.field2910 && this.field2918.method428(-12720);
    }
}
