import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class703 extends class701 {

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    private int field9926 = 0;

    @OriginalMember(owner = "client!eca", name = "t", descriptor = "I")
    private int field9939 = 0;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    private int field9921 = 0;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "Z")
    private boolean field9932 = false;

    @OriginalMember(owner = "client!eca", name = "w", descriptor = "I")
    private int field9942 = 0;

    @OriginalMember(owner = "client!eca", name = "B", descriptor = "Lifa;")
    private class393 field9947;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    private int field9922;

    @OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
    private int field9938;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "Lco;")
    private class103 field9936;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "Z")
    private boolean field9944;

    @OriginalMember(owner = "client!eca", name = "r", descriptor = "Z")
    private boolean field9937;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "Z")
    private boolean field9933;

    @OriginalMember(owner = "client!eca", name = "C", descriptor = "Z")
    private boolean field9948;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "Lhf;")
    public static class363 field9927 = new class363();

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!eca", name = "v", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
    public static int field9943;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "I")
    public static int field9945;

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!eca", name = "D", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)V")
    public static void method3940(boolean arg0) {
        if (!arg0) {
            field9927 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILua;II)V")
    public final void method6(int arg0, int arg1, class616 arg2, int arg3, int arg4) {
        field9930++;
        class482 var6 = (class482) arg2;
        int var7 = this.field9926 + arg0;
        int var8 = this.field9939 + arg1;
        class103 var9 = var6.field6738;
        this.field9936.method798(-13883, class512.field7495);
        this.field9947.method2337(false);
        this.field9947.method2316((byte) 108, this.field9936);
        this.field9947.method2353(1, (byte) -124);
        this.field9947.method2362(1, false);
        class653 var10 = this.field9947.method2329(32639);
        var10.method3683((byte) -128, (float) this.field9938, 0.0F, (float) this.field9922);
        var10.method723(var7, var8, 0);
        this.field9947.method2325(false);
        class653 var11 = this.field9947.method2373((byte) -118);
        var11.method3683((byte) -45, this.field9936.method761((float) this.field9938, -22297), 1.0F, this.field9936.method758(12943, (float) this.field9922));
        this.field9947.method2319((byte) 78, class148.field1809);
        this.field9947.method2318(1, -30954);
        this.field9947.method2316((byte) 105, var9);
        this.field9947.method2303((byte) -110, class652.field9230, class231.field3011);
        this.field9947.method2301(0, class141.field1760, 2);
        class653 var12 = this.field9947.method2373((byte) -77);
        var12.method3683((byte) -33, var9.method761((float) this.field9938, -22297), 1.0F, var9.method758(12943, (float) this.field9922));
        var12.method3695((byte) 76, 0.0F, var9.method758(12943, (float) (var7 - arg3)), var9.method761((float) (var8 - arg4), -22297));
        this.field9947.method2319((byte) 109, class148.field1809);
        this.field9947.method2315((byte) 21);
        this.field9947.method2305(20921);
        this.field9947.method2301(0, class519.field7612, 2);
        this.field9947.method2303((byte) -126, class652.field9230, class652.field9230);
        this.field9947.method2316((byte) 97, null);
        this.field9947.method2318(0, -30954);
        this.field9947.method2305(20921);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method899(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class616 arg7, int arg8, int arg9) {
        field9949++;
        class653 var11 = this.field9947.method2329(32639);
        class653 var12 = this.field9947.method2373((byte) -77);
        class482 var13 = (class482) arg7;
        class103 var14 = var13.field6738;
        this.field9936.method798(-13883, this.field9944 || this.field9937 || ~(arg6 & 0x1) == -1 ? class512.field7495 : class151.field1872);
        this.field9947.method2337(false);
        this.field9947.method2316((byte) 91, this.field9936);
        this.field9947.method2353(1, (byte) -118);
        this.field9947.method2362(1, false);
        if (this.field9932) {
            float var15 = (float) this.field9922 / (float) this.method896();
            float var16 = (float) this.field9938 / (float) this.method901();
            var11.method3690(0.0F, 0.0F, 0.0F, (arg3 - arg1) * var15, (arg5 - arg1) * var16, 1.0F, -68, (arg2 - arg0) * var15, 0.0F, (arg4 - arg0) * var16);
            var11.method3695((byte) 121, 0.0F, ((float) this.field9926 + arg0) * var15, ((float) this.field9939 + arg1) * var16);
        } else {
            var11.method3690(0.0F, 0.0F, 0.0F, arg3 - arg1, arg5 - arg1, 1.0F, 41, arg2 - arg0, 0.0F, arg4 - arg0);
            var11.method3695((byte) 124, 0.0F, arg0, arg1);
        }
        var12.method3683((byte) -69, this.field9936.method761((float) this.field9938, -22297), 1.0F, this.field9936.method758(12943, (float) this.field9922));
        this.field9947.method2319((byte) 80, class148.field1809);
        this.field9947.method2318(1, -30954);
        this.field9947.method2316((byte) 101, var14);
        this.field9947.method2303((byte) 91, class652.field9230, class231.field3011);
        this.field9947.method2301(0, class141.field1760, 2);
        class653 var17 = this.field9947.method2373((byte) -80);
        var17.method711(var11);
        var17.method723(-arg8, -arg9, 0);
        var17.method3701(1.0F, (byte) 113, var14.method758(12943, 1.0F), var14.method761(1.0F, -22297));
        this.field9947.method2319((byte) 108, class148.field1809);
        this.field9947.method2325(false);
        this.field9947.method2315((byte) 35);
        this.field9947.method2305(20921);
        this.field9947.method2301(0, class519.field7612, 2);
        this.field9947.method2303((byte) 74, class652.field9230, class652.field9230);
        this.field9947.method2316((byte) 106, null);
        this.field9947.method2318(0, -30954);
        this.field9947.method2305(20921);
    }

    @OriginalMember(owner = "client!eca", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9945++;
        class653 var9 = this.field9947.method2329(32639);
        class653 var10 = this.field9947.method2373((byte) -84);
        this.field9936.method798(-13883, this.field9944 || this.field9937 || ~(arg7 & 0x1) == -1 ? class512.field7495 : class151.field1872);
        this.field9947.method2337(false);
        this.field9947.method2316((byte) 121, this.field9936);
        this.field9947.method2353(arg6, (byte) -123);
        this.field9947.method2362(arg4, false);
        this.field9947.method2301(1, class308.field4083, 2);
        this.field9947.method2348(1, 6655, class308.field4083);
        this.field9947.method2331(true, arg5);
        var10.method3683((byte) -91, this.field9936.method761((float) this.field9938, -22297), 1.0F, this.field9936.method758(12943, (float) this.field9922));
        if (this.field9932) {
            arg2 = this.field9922 * arg2 / this.method896();
            arg3 = this.field9938 * arg3 / this.method901();
            arg1 += this.field9939 * arg3 / this.field9938;
            arg0 += this.field9926 * arg2 / this.field9922;
        }
        var9.method3683((byte) -88, (float) arg3, 0.0F, (float) arg2);
        var9.method723(arg0, arg1, 0);
        this.field9947.method2319((byte) 81, class148.field1809);
        this.field9947.method2325(false);
        this.field9947.method2315((byte) 71);
        this.field9947.method2305(20921);
        this.field9947.method2301(1, class141.field1760, 2);
        this.field9947.method2348(1, 6655, class141.field1760);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(CI)Z")
    public static final boolean method3941(char arg0, int arg1) {
        field9940++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg1 != -18479) {
            return false;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZIILkga;I[BI)Leb;")
    public static final class577 method3942(int arg0, boolean arg1, int arg2, int arg3, class506 arg4, int arg5, byte[] arg6, int arg7) {
        if (arg7 != -127) {
            method3940(true);
        }
        field9924++;
        if (!arg4.field7360 && (!class326.method1894(arg0, 32) || !class326.method1894(arg2, 32))) {
            return arg4.field7355 ? new class577(arg4, 34037, arg5, arg0, arg2, arg1, arg6, arg3) : new class577(arg4, arg5, arg0, arg2, class698.method3915(arg0, (byte) 93), class698.method3915(arg2, (byte) 93), arg6, arg3);
        } else {
            return new class577(arg4, 3553, arg5, arg0, arg2, arg1, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!eca", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method895(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field9935++;
        class653 var11 = this.field9947.method2329(32639);
        class653 var12 = this.field9947.method2373((byte) -127);
        this.field9936.method798(-13883, this.field9944 || this.field9937 || ~(arg9 & 0x1) == -1 ? class512.field7495 : class151.field1872);
        this.field9947.method2337(false);
        this.field9947.method2316((byte) 124, this.field9936);
        this.field9947.method2353(arg8, (byte) -121);
        this.field9947.method2362(arg6, false);
        this.field9947.method2301(1, class308.field4083, 2);
        this.field9947.method2348(1, 6655, class308.field4083);
        this.field9947.method2331(true, arg7);
        if (this.field9932) {
            float var13 = (float) this.method896();
            float var14 = (float) this.method901();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field9939 * var17;
            float var20 = (float) this.field9939 * var18;
            float var21 = (float) this.field9926 * var15;
            float var22 = (float) this.field9926 * var16;
            float var23 = (float) this.field9921 * -var15;
            float var24 = (float) this.field9921 * -var16;
            float var25 = (float) this.field9942 * -var17;
            arg4 = arg4 + var21 + var25;
            arg2 = arg2 + var23 + var19;
            float var26 = (float) this.field9942 * -var18;
            arg0 = arg0 + var21 + var19;
            arg3 = arg3 + var24 + var20;
            arg1 = arg1 + var22 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method3690(0.0F, 0.0F, 0.0F, arg3 - arg1, arg5 - arg1, 1.0F, -98, arg2 - arg0, 0.0F, arg4 - arg0);
        var11.method3695((byte) 125, 0.0F, arg0, arg1);
        var12.method3683((byte) -100, this.field9936.method761((float) this.field9938, -22297), 1.0F, this.field9936.method758(12943, (float) this.field9922));
        this.field9947.method2319((byte) 112, class148.field1809);
        this.field9947.method2325(false);
        this.field9947.method2315((byte) -126);
        this.field9947.method2305(20921);
        this.field9947.method2301(1, class141.field1760, 2);
        this.field9947.method2348(1, 6655, class141.field1760);
    }

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "()I")
    public final int method900() {
        field9920++;
        return this.field9938;
    }

    @OriginalMember(owner = "client!eca", name = "xa", descriptor = "(III)V")
    public final void method4(int arg0, int arg1, int arg2) {
        field9923++;
    }

    @OriginalMember(owner = "client!eca", name = "Q", descriptor = "(IIII)V")
    public final void method894(int arg0, int arg1, int arg2, int arg3) {
        this.field9942 = arg3;
        this.field9921 = arg2;
        this.field9939 = arg1;
        field9943++;
        this.field9926 = arg0;
        this.field9932 = this.field9926 != 0 || this.field9939 != 0 || this.field9921 != 0 || this.field9942 != 0;
    }

    @OriginalMember(owner = "client!eca", name = "DA", descriptor = "(IIIIIII)V")
    public final void method898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9946++;
        class653 var8 = this.field9947.method2329(32639);
        class653 var9 = this.field9947.method2373((byte) -127);
        this.field9936.method798(-13883, class512.field7495);
        this.field9947.method2337(false);
        this.field9947.method2316((byte) 89, this.field9936);
        this.field9947.method2353(arg6, (byte) -124);
        this.field9947.method2362(arg4, false);
        this.field9947.method2301(1, class308.field4083, 2);
        this.field9947.method2348(1, 6655, class308.field4083);
        this.field9947.method2331(true, arg5);
        boolean var10 = this.field9948 && this.field9939 == 0 && this.field9942 == 0;
        boolean var11 = this.field9933 && this.field9926 == 0 && this.field9921 == 0;
        if (var11 & var10) {
            var9.method3683((byte) -57, this.field9936.method761((float) arg3, -22297), 1.0F, this.field9936.method758(12943, (float) arg2));
            var8.method3683((byte) -34, (float) arg3, 0.0F, (float) arg2);
            var8.method723(arg0, arg1, 0);
            this.field9947.method2319((byte) 124, class148.field1809);
            this.field9947.method2325(false);
            this.field9947.method2315((byte) -117);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method901();
            var9.method3683((byte) -34, this.field9936.method761((float) this.field9938, -22297), 1.0F, this.field9936.method758(12943, (float) arg2));
            this.field9947.method2319((byte) 92, class148.field1809);
            int var32 = this.field9939 + arg1;
            int var33 = var32 + this.field9938;
            while (var33 <= var30) {
                var8.method3683((byte) -58, (float) this.field9938, 0.0F, (float) arg2);
                var8.method723(arg0, var32, 0);
                this.field9947.method2325(false);
                var33 += var31;
                this.field9947.method2315((byte) -74);
                var32 += var31;
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method3683((byte) -71, this.field9936.method761((float) var34, -22297), 1.0F, this.field9936.method758(12943, (float) arg2));
                this.field9947.method2319((byte) 81, class148.field1809);
                var8.method3683((byte) -44, (float) var34, 0.0F, (float) arg2);
                var8.method723(arg0, var32, 0);
                this.field9947.method2325(false);
                this.field9947.method2315((byte) -125);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method896();
            var9.method3683((byte) -63, this.field9936.method761((float) arg3, -22297), 1.0F, this.field9936.method758(12943, (float) this.field9922));
            this.field9947.method2319((byte) 119, class148.field1809);
            int var27 = this.field9926 + arg0;
            for (int var28 = this.field9922 + var27; var28 <= var25; var28 += var26) {
                var8.method3683((byte) -118, (float) arg3, 0.0F, (float) this.field9922);
                var8.method723(var27, arg1, 0);
                this.field9947.method2325(false);
                this.field9947.method2315((byte) -104);
                var27 += var26;
            }
            if (var25 > var27) {
                int var29 = var25 - var27;
                var9.method3683((byte) -104, this.field9936.method761((float) arg3, -22297), 1.0F, this.field9936.method758(12943, (float) var29));
                this.field9947.method2319((byte) 93, class148.field1809);
                var8.method3683((byte) -104, (float) arg3, 0.0F, (float) var29);
                var8.method723(var27, arg1, 0);
                this.field9947.method2325(false);
                this.field9947.method2315((byte) 89);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method896();
            int var15 = this.method901();
            int var16 = this.field9939 + arg1;
            for (int var17 = var16 + this.field9938; var17 <= var12; var17 += var15) {
                var9.method3683((byte) -78, this.field9936.method761((float) this.field9938, -22297), 1.0F, this.field9936.method758(12943, (float) this.field9922));
                this.field9947.method2319((byte) 125, class148.field1809);
                int var22 = this.field9926 + arg0;
                int var23 = this.field9922 + var22;
                while (var13 >= var23) {
                    var8.method3683((byte) -85, (float) this.field9938, 0.0F, (float) this.field9922);
                    var8.method723(var22, var16, 0);
                    this.field9947.method2325(false);
                    this.field9947.method2315((byte) 24);
                    var23 += var14;
                    var22 += var14;
                }
                if (var22 < var13) {
                    int var24 = var13 - var22;
                    var9.method3683((byte) -92, this.field9936.method761((float) this.field9938, -22297), 1.0F, this.field9936.method758(12943, (float) var24));
                    this.field9947.method2319((byte) 98, class148.field1809);
                    var8.method3683((byte) -111, (float) this.field9938, 0.0F, (float) var24);
                    var8.method723(var22, var16, 0);
                    this.field9947.method2325(false);
                    this.field9947.method2315((byte) -104);
                }
                var16 += var15;
            }
            if (var16 < var12) {
                int var18 = var12 - var16;
                var9.method3683((byte) -46, this.field9936.method761((float) var18, -22297), 1.0F, this.field9936.method758(12943, (float) this.field9922));
                this.field9947.method2319((byte) 80, class148.field1809);
                int var19 = this.field9926 + arg0;
                for (int var20 = this.field9922 + var19; var20 <= var13; var20 += var14) {
                    var8.method3683((byte) -122, (float) var18, 0.0F, (float) this.field9922);
                    var8.method723(var19, var16, 0);
                    this.field9947.method2325(false);
                    var19 += var14;
                    this.field9947.method2315((byte) 88);
                }
                if (var19 < var13) {
                    int var21 = var13 - var19;
                    var9.method3683((byte) -71, this.field9936.method761((float) var18, -22297), 1.0F, this.field9936.method758(12943, (float) var21));
                    this.field9947.method2319((byte) 79, class148.field1809);
                    var8.method3683((byte) -104, (float) var18, 0.0F, (float) var21);
                    var8.method723(var19, var16, 0);
                    this.field9947.method2325(false);
                    this.field9947.method2315((byte) 79);
                }
            }
        }
        this.field9947.method2305(20921);
        this.field9947.method2301(1, class141.field1760, 2);
        this.field9947.method2348(1, 6655, class141.field1760);
    }

    @OriginalMember(owner = "client!eca", name = "ca", descriptor = "()I")
    public final int method901() {
        field9925++;
        return this.field9942 + this.field9938 + this.field9939;
    }

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "()I")
    public final int method896() {
        field9941++;
        return this.field9926 + this.field9921 + this.field9922;
    }

    @OriginalMember(owner = "client!eca", name = "da", descriptor = "(IIIIII)V")
    public final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9931++;
        int[] var7 = this.field9947.method325(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class242.method1474(var7[var8], -16777216);
            }
            this.method3943(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!eca", name = "V", descriptor = "(IIIII)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9934++;
        class653 var6 = this.field9947.method2329(32639);
        class653 var7 = this.field9947.method2373((byte) -70);
        int var8 = this.field9926 + arg0;
        int var9 = this.field9939 + arg1;
        this.field9936.method798(-13883, class512.field7495);
        this.field9947.method2337(false);
        this.field9947.method2316((byte) 126, this.field9936);
        this.field9947.method2353(arg4, (byte) -121);
        this.field9947.method2362(arg2, false);
        this.field9947.method2301(1, class308.field4083, 2);
        this.field9947.method2348(1, 6655, class308.field4083);
        this.field9947.method2331(true, arg3);
        var6.method3683((byte) -106, (float) this.field9938, 0.0F, (float) this.field9922);
        var6.method723(var8, var9, 0);
        var7.method3683((byte) -52, this.field9936.method761((float) this.field9938, -22297), 1.0F, this.field9936.method758(12943, (float) this.field9922));
        this.field9947.method2319((byte) 89, class148.field1809);
        this.field9947.method2325(false);
        this.field9947.method2315((byte) -110);
        this.field9947.method2305(20921);
        this.field9947.method2301(1, class141.field1760, 2);
        this.field9947.method2348(1, 6655, class141.field1760);
    }

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "()I")
    public final int method902() {
        field9929++;
        return this.field9922;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII[III)V")
    private final void method3943(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field9928++;
        this.field9936.method763(-28726, arg3, arg0, arg2, arg4, arg1, arg6, arg5);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lifa;IIZ)V")
    public class703(class393 arg0, int arg1, int arg2, boolean arg3) {
        this.field9947 = arg0;
        this.field9922 = arg1;
        this.field9938 = arg2;
        this.field9936 = arg0.method496(arg1, arg3 ? class391.field5229 : class666.field9494, (byte) -83, arg2, class279.field3793);
        this.field9936.method757(true, true, -96);
        this.field9944 = this.field9936.method760((byte) -128) != arg1;
        this.field9937 = this.field9936.method764(false) != arg2;
        this.field9933 = !this.field9944 && this.field9936.method759(18483);
        this.field9948 = !this.field9937 && this.field9936.method759(18483);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lifa;II[III)V")
    public class703(class393 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9947 = arg0;
        this.field9922 = arg1;
        this.field9938 = arg2;
        this.field9936 = arg0.method525(arg3, 1, arg5, arg2, arg4, false, arg1);
        this.field9936.method757(true, true, -84);
        this.field9944 = arg1 != this.field9936.method760((byte) -57);
        this.field9937 = this.field9936.method764(false) != arg2;
        this.field9933 = !this.field9944 && this.field9936.method759(18483);
        this.field9948 = !this.field9937 && this.field9936.method759(18483);
    }
}
