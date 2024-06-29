import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class446 extends class53 {

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    private int field6234 = 0;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
    private int field6240 = 0;

    @OriginalMember(owner = "client!baa", name = "B", descriptor = "I")
    private int field6254 = 0;

    @OriginalMember(owner = "client!baa", name = "y", descriptor = "Z")
    private boolean field6251 = false;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
    private int field6248 = 0;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    private int field6227;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "Lcb;")
    private class444 field6239;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    private int field6238;

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "Ljb;")
    private class422 field6249;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "Z")
    private boolean field6243;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Z")
    private boolean field6231;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "Z")
    private boolean field6228;

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "Z")
    private boolean field6241;

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "Z")
    public static boolean field6245 = false;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!baa", name = "t", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!baa", name = "A", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!baa", name = "C", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!baa", name = "D", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!baa", name = "E", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!baa", name = "F", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IFFF)I")
    public static final int method2703(int arg0, float arg1, float arg2, float arg3) {
        field6250++;
        float var4 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (arg0 != 1) {
            field6245 = true;
        }
        if (var4 < var5 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if ((arg3 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "()I")
    public final int method325() {
        field6229++;
        return this.field6227;
    }

    @OriginalMember(owner = "client!baa", name = "ma", descriptor = "()I")
    public final int method322() {
        field6237++;
        return this.field6254 + this.field6234 + this.field6238;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IB)I")
    public static final int method2704(int arg0, byte arg1) {
        field6257++;
        if (arg1 < 88) {
            method2707(null, null, 83, -65, (byte) 33, -49);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!baa", name = "EA", descriptor = "()I")
    public final int method326() {
        field6230++;
        return this.field6240 + this.field6227 + this.field6248;
    }

    @OriginalMember(owner = "client!baa", name = "KA", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
        this.field6234 = arg3;
        this.field6248 = arg2;
        this.field6240 = arg0;
        this.field6254 = arg1;
        field6252++;
        this.field6251 = this.field6240 != 0 || this.field6254 != 0 || this.field6248 != 0 || this.field6234 != 0;
    }

    @OriginalMember(owner = "client!baa", name = "P", descriptor = "(IIIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6253++;
        int[] var7 = this.field6239.method456(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class473.method2847(var7[var8], -16777216);
            }
            this.method2705(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "(IIIIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6232++;
        class57 var8 = this.field6239.method2680(0);
        class57 var9 = this.field6239.method2653((byte) -110);
        this.field6249.method31(class192.field2855, 29557);
        this.field6239.method2682(true);
        this.field6239.method2632(this.field6249, 0);
        this.field6239.method2650(arg6, (byte) 35);
        this.field6239.method2698(arg4, 1);
        this.field6239.method2598(class314.field4331, 1, (byte) 59);
        this.field6239.method2655(1, -51, class314.field4331);
        this.field6239.method2688(arg5, 28366);
        boolean var10 = this.field6241 && this.field6254 == 0 && this.field6234 == 0;
        boolean var11 = this.field6228 && this.field6240 == 0 && this.field6248 == 0;
        if ((var11 & var10)) {
            var9.method381(1.0F, this.field6249.method1651((float) arg2, 32), this.field6249.method1653((float) arg3, (byte) -119), (byte) -60);
            var8.method381(0.0F, (float) arg2, (float) arg3, (byte) -60);
            var8.method338(arg0, arg1, 0);
            this.field6239.method2623(-65, class210.field3107);
            this.field6239.method2576((byte) 28);
            this.field6239.method2678(2);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method322();
            var9.method381(1.0F, this.field6249.method1651((float) arg2, 13), this.field6249.method1653((float) this.field6238, (byte) 116), (byte) -60);
            this.field6239.method2623(125, class210.field3107);
            int var32 = arg1 + this.field6254;
            int var33 = this.field6238 + var32;
            while (var30 >= var33) {
                var8.method381(0.0F, (float) arg2, (float) this.field6238, (byte) -60);
                var8.method338(arg0, var32, 0);
                this.field6239.method2576((byte) 28);
                var32 += var31;
                var33 += var31;
                this.field6239.method2678(2);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method381(1.0F, this.field6249.method1651((float) arg2, -107), this.field6249.method1653((float) var34, (byte) 69), (byte) -60);
                this.field6239.method2623(-81, class210.field3107);
                var8.method381(0.0F, (float) arg2, (float) var34, (byte) -60);
                var8.method338(arg0, var32, 0);
                this.field6239.method2576((byte) 28);
                this.field6239.method2678(2);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method326();
            var9.method381(1.0F, this.field6249.method1651((float) this.field6227, 70), this.field6249.method1653((float) arg3, (byte) 65), (byte) -60);
            this.field6239.method2623(-121, class210.field3107);
            int var27 = this.field6240 + arg0;
            for (int var28 = this.field6227 + var27; var28 <= var25; var28 += var26) {
                var8.method381(0.0F, (float) this.field6227, (float) arg3, (byte) -60);
                var8.method338(var27, arg1, 0);
                this.field6239.method2576((byte) 28);
                this.field6239.method2678(2);
                var27 += var26;
            }
            if (var25 > var27) {
                int var29 = var25 - var27;
                var9.method381(1.0F, this.field6249.method1651((float) var29, 79), this.field6249.method1653((float) arg3, (byte) 79), (byte) -60);
                this.field6239.method2623(-116, class210.field3107);
                var8.method381(0.0F, (float) var29, (float) arg3, (byte) -60);
                var8.method338(var27, arg1, 0);
                this.field6239.method2576((byte) 28);
                this.field6239.method2678(2);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method326();
            int var15 = this.method322();
            int var16 = this.field6254 + arg1;
            int var17 = var16 + this.field6238;
            while (var12 >= var17) {
                var9.method381(1.0F, this.field6249.method1651((float) this.field6227, 103), this.field6249.method1653((float) this.field6238, (byte) 94), (byte) -60);
                this.field6239.method2623(95, class210.field3107);
                int var22 = arg0 + this.field6240;
                int var23 = this.field6227 + var22;
                while (var13 >= var23) {
                    var8.method381(0.0F, (float) this.field6227, (float) this.field6238, (byte) -60);
                    var8.method338(var22, var16, 0);
                    this.field6239.method2576((byte) 28);
                    this.field6239.method2678(2);
                    var23 += var14;
                    var22 += var14;
                }
                if (var22 < var13) {
                    int var24 = var13 - var22;
                    var9.method381(1.0F, this.field6249.method1651((float) var24, 78), this.field6249.method1653((float) this.field6238, (byte) 69), (byte) -60);
                    this.field6239.method2623(-55, class210.field3107);
                    var8.method381(0.0F, (float) var24, (float) this.field6238, (byte) -60);
                    var8.method338(var22, var16, 0);
                    this.field6239.method2576((byte) 28);
                    this.field6239.method2678(2);
                }
                var17 += var15;
                var16 += var15;
            }
            if (var12 > var16) {
                int var18 = var12 - var16;
                var9.method381(1.0F, this.field6249.method1651((float) this.field6227, -109), this.field6249.method1653((float) var18, (byte) -121), (byte) -60);
                this.field6239.method2623(89, class210.field3107);
                int var19 = this.field6240 + arg0;
                for (int var20 = this.field6227 + var19; var20 <= var13; var20 += var14) {
                    var8.method381(0.0F, (float) this.field6227, (float) var18, (byte) -60);
                    var8.method338(var19, var16, 0);
                    this.field6239.method2576((byte) 28);
                    this.field6239.method2678(2);
                    var19 += var14;
                }
                if (var13 > var19) {
                    int var21 = var13 - var19;
                    var9.method381(1.0F, this.field6249.method1651((float) var21, 36), this.field6249.method1653((float) var18, (byte) 81), (byte) -60);
                    this.field6239.method2623(116, class210.field3107);
                    var8.method381(0.0F, (float) var21, (float) var18, (byte) -60);
                    var8.method338(var19, var16, 0);
                    this.field6239.method2576((byte) 28);
                    this.field6239.method2678(2);
                }
            }
        }
        this.field6239.method2664(65);
        this.field6239.method2598(class645.field9388, 1, (byte) 59);
        this.field6239.method2655(1, -120, class645.field9388);
    }

    @OriginalMember(owner = "client!baa", name = "DA", descriptor = "(IIIII)V")
    public final void method333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6233++;
        class57 var6 = this.field6239.method2680(0);
        class57 var7 = this.field6239.method2653((byte) -110);
        int var8 = this.field6254 + arg1;
        int var9 = this.field6240 + arg0;
        this.field6249.method31(class192.field2855, 29557);
        this.field6239.method2682(true);
        this.field6239.method2632(this.field6249, 0);
        this.field6239.method2650(arg4, (byte) 35);
        this.field6239.method2698(arg2, 1);
        this.field6239.method2598(class314.field4331, 1, (byte) 59);
        this.field6239.method2655(1, -80, class314.field4331);
        this.field6239.method2688(arg3, 28366);
        var6.method381(0.0F, (float) this.field6227, (float) this.field6238, (byte) -60);
        var6.method338(var9, var8, 0);
        var7.method381(1.0F, this.field6249.method1651((float) this.field6227, -121), this.field6249.method1653((float) this.field6238, (byte) 58), (byte) -60);
        this.field6239.method2623(-126, class210.field3107);
        this.field6239.method2576((byte) 28);
        this.field6239.method2678(2);
        this.field6239.method2664(78);
        this.field6239.method2598(class645.field9388, 1, (byte) 59);
        this.field6239.method2655(1, -127, class645.field9388);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method315(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8) {
        field6236++;
        class57 var10 = this.field6239.method2680(0);
        class57 var11 = this.field6239.method2653((byte) -110);
        class398 var12 = (class398) arg6;
        class422 var13 = var12.field5467;
        this.field6249.method31(class619.field9140, 29557);
        this.field6239.method2682(true);
        this.field6239.method2632(this.field6249, 0);
        this.field6239.method2650(1, (byte) 35);
        this.field6239.method2698(1, 1);
        if (this.field6251) {
            float var14 = (float) this.field6227 / (float) this.method326();
            float var15 = (float) this.field6238 / (float) this.method322();
            var10.method382(0.0F, (arg3 - arg1) * var14, (arg2 - arg0) * var14, 0.0F, 0.0F, (byte) -32, (arg4 - arg0) * var15, (arg5 - arg1) * var15, 0.0F, 1.0F);
            var10.method366(((float) this.field6254 + arg1) * var15, 0.0F, ((float) this.field6240 + arg0) * var14, -6701);
        } else {
            var10.method382(0.0F, arg3 - arg1, arg2 - arg0, 0.0F, 0.0F, (byte) -22, arg4 - arg0, -arg1 + arg5, 0.0F, 1.0F);
            var10.method366(arg1, 0.0F, arg0, -6701);
        }
        var11.method381(1.0F, this.field6249.method1651((float) this.field6227, -108), this.field6249.method1653((float) this.field6238, (byte) -91), (byte) -60);
        this.field6239.method2623(-84, class210.field3107);
        this.field6239.method2646(1, 117);
        this.field6239.method2632(var13, 0);
        this.field6239.method2643(class132.field1816, -10304, class296.field4074);
        this.field6239.method2598(class645.field9388, 0, (byte) 59);
        class57 var16 = this.field6239.method2653((byte) -110);
        var16.method337(var10);
        var16.method338(-arg7, -arg8, 0);
        var16.method373(var13.method1651(1.0F, 26), 16383, var13.method1653(1.0F, (byte) 69), 1.0F);
        this.field6239.method2623(-62, class210.field3107);
        this.field6239.method2576((byte) 28);
        this.field6239.method2678(2);
        this.field6239.method2664(70);
        this.field6239.method2598(class453.field6405, 0, (byte) 59);
        this.field6239.method2643(class132.field1816, -10304, class132.field1816);
        this.field6239.method2632(null, 0);
        this.field6239.method2646(0, 101);
        this.field6239.method2664(-106);
    }

    @OriginalMember(owner = "client!baa", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method331(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field6256++;
        class57 var10 = this.field6239.method2680(0);
        class57 var11 = this.field6239.method2653((byte) -110);
        this.field6249.method31(this.field6243 || this.field6231 ? class192.field2855 : class619.field9140, 29557);
        this.field6239.method2682(true);
        this.field6239.method2632(this.field6249, 0);
        this.field6239.method2650(arg8, (byte) 35);
        this.field6239.method2698(arg6, 1);
        this.field6239.method2598(class314.field4331, 1, (byte) 59);
        this.field6239.method2655(1, -95, class314.field4331);
        this.field6239.method2688(arg7, 28366);
        if (this.field6251) {
            float var12 = (float) this.method326();
            float var13 = (float) this.method322();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field6254 * var16;
            float var19 = (float) this.field6254 * var17;
            float var20 = (float) this.field6240 * var14;
            float var21 = (float) this.field6240 * var15;
            float var22 = (float) this.field6248 * -var14;
            float var23 = (float) this.field6248 * -var15;
            float var24 = (float) this.field6234 * -var16;
            arg3 = arg3 + var23 + var19;
            arg0 = arg0 + var20 + var18;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field6234 * -var17;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        var10.method382(0.0F, arg3 - arg1, arg2 - arg0, 0.0F, 0.0F, (byte) -62, arg4 - arg0, arg5 - arg1, 0.0F, 1.0F);
        var10.method366(arg1, 0.0F, arg0, -6701);
        var11.method381(1.0F, this.field6249.method1651((float) this.field6227, -112), this.field6249.method1653((float) this.field6238, (byte) -78), (byte) -60);
        this.field6239.method2623(-35, class210.field3107);
        this.field6239.method2576((byte) 28);
        this.field6239.method2678(2);
        this.field6239.method2664(-114);
        this.field6239.method2598(class645.field9388, 1, (byte) 59);
        this.field6239.method2655(1, -95, class645.field9388);
    }

    @OriginalMember(owner = "client!baa", name = "BA", descriptor = "(III)V")
    public final void method321(int arg0, int arg1, int arg2) {
        field6244++;
    }

    @OriginalMember(owner = "client!baa", name = "ra", descriptor = "(IIIIIII)V")
    public final void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6247++;
        class57 var8 = this.field6239.method2680(0);
        class57 var9 = this.field6239.method2653((byte) -110);
        this.field6249.method31(this.field6243 || this.field6231 ? class192.field2855 : class619.field9140, 29557);
        this.field6239.method2682(true);
        this.field6239.method2632(this.field6249, 0);
        this.field6239.method2650(arg6, (byte) 35);
        this.field6239.method2698(arg4, 1);
        this.field6239.method2598(class314.field4331, 1, (byte) 59);
        this.field6239.method2655(1, -42, class314.field4331);
        this.field6239.method2688(arg5, 28366);
        var9.method381(1.0F, this.field6249.method1651((float) this.field6227, -106), this.field6249.method1653((float) this.field6238, (byte) -115), (byte) -60);
        if (this.field6251) {
            arg2 = this.field6227 * arg2 / this.method326();
            arg3 = this.field6238 * arg3 / this.method322();
            arg0 += this.field6240 * arg2 / this.field6227;
            arg1 += this.field6254 * arg3 / this.field6238;
        }
        var8.method381(0.0F, (float) arg2, (float) arg3, (byte) -60);
        var8.method338(arg0, arg1, 0);
        this.field6239.method2623(106, class210.field3107);
        this.field6239.method2576((byte) 28);
        this.field6239.method2678(2);
        this.field6239.method2664(-110);
        this.field6239.method2598(class645.field9388, 1, (byte) 59);
        this.field6239.method2655(1, -109, class645.field9388);
    }

    @OriginalMember(owner = "client!baa", name = "la", descriptor = "()I")
    public final int method318() {
        field6258++;
        return this.field6238;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IILpa;II)V")
    public final void method323(int arg0, int arg1, class311 arg2, int arg3, int arg4) {
        field6235++;
        class398 var6 = (class398) arg2;
        class422 var7 = var6.field5467;
        int var8 = this.field6240 + arg0;
        int var9 = this.field6254 + arg1;
        this.field6249.method31(class192.field2855, 29557);
        this.field6239.method2682(true);
        this.field6239.method2632(this.field6249, 0);
        this.field6239.method2650(1, (byte) 35);
        this.field6239.method2698(1, 1);
        class57 var10 = this.field6239.method2680(0);
        var10.method381(0.0F, (float) this.field6227, (float) this.field6238, (byte) -60);
        var10.method338(var8, var9, 0);
        this.field6239.method2576((byte) 28);
        class57 var11 = this.field6239.method2653((byte) -110);
        var11.method381(1.0F, this.field6249.method1651((float) this.field6227, -105), this.field6249.method1653((float) this.field6238, (byte) -80), (byte) -60);
        this.field6239.method2623(-123, class210.field3107);
        this.field6239.method2646(1, 114);
        this.field6239.method2632(var7, 0);
        this.field6239.method2643(class132.field1816, -10304, class296.field4074);
        this.field6239.method2598(class645.field9388, 0, (byte) 59);
        class57 var12 = this.field6239.method2653((byte) -110);
        var12.method381(1.0F, var7.method1651((float) this.field6227, 98), var7.method1653((float) this.field6238, (byte) 84), (byte) -60);
        var12.method366(var7.method1653((float) (var9 - arg4), (byte) 126), 0.0F, var7.method1651((float) (var8 - arg3), 80), -6701);
        this.field6239.method2623(114, class210.field3107);
        this.field6239.method2678(2);
        this.field6239.method2664(-95);
        this.field6239.method2598(class453.field6405, 0, (byte) 59);
        this.field6239.method2643(class132.field1816, -10304, class132.field1816);
        this.field6239.method2632(null, 0);
        this.field6239.method2646(0, 100);
        this.field6239.method2664(38);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIII[III)V")
    private final void method2705(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field6249.method1654(arg3, arg1, arg6, arg4, arg5, arg0, arg2, true);
        field6242++;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Z")
    public static final boolean method2706(boolean arg0) {
        field6255++;
        if (!arg0) {
            method2706(true);
        }
        return class577.field8514 != class186.field2781 || class163.field2578 >= 2;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lqa;Luh;IIBI)V")
    public static final void method2707(class208 arg0, class145 arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6246++;
        if (arg4 < 86) {
            field6245 = true;
        }
        class554 var6 = class599.field8839.method545(arg1.field2110, 34);
        if (var6.field8255 == -1) {
            return;
        }
        int var8;
        if (arg1.field2107) {
            int var7 = arg1.field2071 + arg5;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class53 var9 = var6.method3348(var8, (byte) 103, arg1.field2046, arg0);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field2108;
        int var11 = arg1.field2067;
        if ((var8 & 0x1) == 1) {
            var11 = arg1.field2108;
            var10 = arg1.field2067;
        }
        int var12 = var9.method326();
        int var13 = var9.method322();
        if (var6.field8245) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field8246 == 0) {
            var9.method317(arg3, arg2 + 4 - var11 * 4, var12, var13);
        } else {
            var9.method314(arg3, arg2 - (var11 - 1) * 4, var12, var13, 0, var6.field8246 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lcb;IIZ)V")
    public class446(class444 arg0, int arg1, int arg2, boolean arg3) {
        this.field6227 = arg1;
        this.field6239 = arg0;
        this.field6238 = arg2;
        this.field6249 = arg0.method2695(arg2, arg1, class194.field2874, 0, arg3 ? class488.field6956 : class245.field3536);
        this.field6243 = arg1 != this.field6249.method1655((byte) -117);
        this.field6231 = this.field6249.method1650(10264) != arg2;
        this.field6228 = !this.field6243 && this.field6249.method1652((byte) 64);
        this.field6241 = !this.field6231 && this.field6249.method1652((byte) -116);
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lcb;II[III)V")
    public class446(class444 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6238 = arg2;
        this.field6239 = arg0;
        this.field6227 = arg1;
        this.field6249 = arg0.method2691(arg2, arg4, arg1, arg5, arg3, false, 12441);
        this.field6243 = this.field6249.method1655((byte) -100) != arg1;
        this.field6231 = arg2 != this.field6249.method1650(10264);
        this.field6228 = !this.field6243 && this.field6249.method1652((byte) 104);
        this.field6241 = !this.field6231 && this.field6249.method1652((byte) -92);
    }
}
