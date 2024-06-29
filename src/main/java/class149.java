import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class149 extends class59 {

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public int field2319 = 0;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lok;")
    public static class41 field2325 = class137.method956("::tele ", 45);

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public int field2318;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "Lic;")
    public class171 field2321;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lo;")
    public class215 field2305;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "Lo;")
    public class215 field2314;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Lof;")
    public class245 field2313;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lie;")
    public class50 field2316;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Z")
    public boolean field2311;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "[I")
    public int[] field2315;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIFIZII)[I", line = 8)
    public static final int[] method1030(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2320++;
        if (arg1 != -24807) {
            method1032(41, -24, 7, -98, 90, 117, 12, 36, -40);
        }
        class201 var8 = new class201();
        var8.field3221 = arg7;
        var8.field3209 = arg5;
        int[] var9 = new int[arg4];
        var8.field3219 = arg0;
        var8.field3230 = (int) (arg3 * 4096.0F);
        var8.field3215 = arg2;
        var8.field3218 = arg6;
        var8.method31(arg1 ^ 0x1C8C);
        class306.method2112(-120, arg4, 1);
        var8.method1426(0, var9, arg1 ^ 0xFFFF9F5D);
        return var9;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V", line = 39)
    public final void method1031(int arg0) {
        field2309++;
        if (arg0 != -17223) {
            return;
        }
        int var2 = this.field2327;
        if (this.field2321 != null) {
            class171 var3 = this.field2321.method1230(false);
            if (var3 == null) {
                this.field2324 = 0;
                this.field2327 = -1;
                this.field2315 = null;
                this.field2306 = 0;
                this.field2322 = 0;
            } else {
                this.field2327 = var3.field2742;
                this.field2306 = var3.field2798 * 128;
                this.field2315 = var3.field2785;
                this.field2322 = var3.field2732;
                this.field2324 = var3.field2764;
            }
        } else if (this.field2316 != null) {
            int var4 = class174.method1245(this.field2316, (byte) 38);
            if (var2 != var4) {
                this.field2327 = var4;
                class147 var5 = this.field2316.field758;
                if (var5.field2284 != null) {
                    var5 = var5.method1015(arg0 ^ 0x4346);
                }
                if (var5 == null) {
                    this.field2306 = 0;
                } else {
                    this.field2306 = var5.field2260 * 128;
                }
            }
        } else if (this.field2313 != null) {
            this.field2327 = class281.method1983((byte) -92, this.field2313);
            this.field2306 = this.field2313.field3903 * 128;
        }
        if (this.field2327 != var2 && this.field2305 != null) {
            class225.field3596.method1421(this.field2305);
            this.field2305 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIII)V", line = 130)
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = arg3; var9 < class268.field4273.field4760; var9++) {
            int var10 = class268.field4273.field4762[var9] - class120.field1773;
            int var11 = (arg5 - arg4) * (var10 - arg8) / (arg7 - arg8) + arg4;
            int var12 = class212.field3414 + class177.field2876 - class268.field4273.field4759[var9] - 1;
            int var13 = class268.field4273.method2032(var9, -14180);
            int var14 = 16777215;
            int var15 = (arg0 - arg2) * (var12 - arg6) / (arg1 - arg6) + arg2;
            class154 var16 = null;
            if (var13 == 0) {
                if ((double) class178.field2886 == 3.0D) {
                    var16 = class275.field4506;
                }
                if ((double) class178.field2886 == 4.0D) {
                    var16 = class46.field730;
                }
                if ((double) class178.field2886 == 6.0D) {
                    var16 = class240.field3845;
                }
                if ((double) class178.field2886 == 8.0D) {
                    var16 = class70.field1056;
                }
            }
            if (var13 == 1) {
                if ((double) class178.field2886 == 3.0D) {
                    var16 = class240.field3845;
                }
                if ((double) class178.field2886 == 4.0D) {
                    var16 = class70.field1056;
                }
                if ((double) class178.field2886 == 6.0D) {
                    var16 = class23.field347;
                }
                if ((double) class178.field2886 == 8.0D) {
                    var16 = class256.field4110;
                }
            }
            if (var13 == 2) {
                if ((double) class178.field2886 == 3.0D) {
                    var16 = class23.field347;
                }
                var14 = 16755200;
                if ((double) class178.field2886 == 4.0D) {
                    var16 = class256.field4110;
                }
                if ((double) class178.field2886 == 6.0D) {
                    var16 = class217.field3482;
                }
                if ((double) class178.field2886 == 8.0D) {
                    var16 = class260.field4148;
                }
            }
            if (class268.field4273.field4768[var9] != -1) {
                var14 = class268.field4273.field4768[var9];
            }
            if (var16 != null) {
                class41[] var17 = new class41[class268.field4273.field4754[var9].method304(0, 60) + 1];
                class48.field749.method1784(class268.field4273.field4754[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var15 - (var18 - 1) * var16.method1100() / 2;
                int var20 = var19 + var16.method1099() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class41 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method308(var17[var21].method275(false) - 4, 0, 91);
                    var16.method1101(var22, var11, var20, var14, true);
                    var20 += var16.method1100();
                }
            }
        }
        field2329++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Lgg;", line = 241)
    public static final class130 method1033(byte arg0, int arg1) {
        if (arg0 != 0) {
            return (class130) null;
        }
        field2310++;
        class130 var2 = (class130) class66.field1003.method554((long) arg1, 88);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class212.field3408.method454(5, 0, arg1);
        class130 var4 = new class130();
        if (var3 != null) {
            var4.method916((byte) 127, new class112(var3));
        }
        class66.field1003.method555((long) arg1, (byte) -117, var4);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V", line = 270)
    public static void method1034(int arg0) {
        if (arg0 != 128) {
            field2325 = (class41) null;
        }
        field2325 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[[F[[I[[FIIBIIZ[[FF[[IIILdg;II)I", line = 284)
    public static final int method1035(int arg0, float[][] arg1, int[][] arg2, float[][] arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, boolean arg9, float[][] arg10, float arg11, int[][] arg12, int arg13, int arg14, class6 arg15, int arg16, int arg17) {
        field2304++;
        if (arg7 == 1) {
            int var18 = arg16;
            arg16 = arg17;
            arg17 = 128 - var18;
        } else if (arg7 == 2) {
            arg17 = 128 - arg17;
            arg16 = 128 - arg16;
        } else if (arg7 == 3) {
            int var19 = arg16;
            arg16 = 128 - arg17;
            arg17 = var19;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg16 == 0 && arg17 == 0) {
            var20 = arg1[arg0][arg8];
            var21 = arg3[arg0][arg8];
            var22 = arg10[arg0][arg8];
            var23 = arg4;
        } else if (arg16 == 128 && arg17 == 0) {
            var22 = arg10[arg0 + 1][arg8];
            var23 = arg5;
            var21 = arg3[arg0 + 1][arg8];
            var20 = arg1[arg0 + 1][arg8];
        } else if (arg16 == 128 && arg17 == 128) {
            var20 = arg1[arg0 + 1][arg8 + 1];
            var22 = arg10[arg0 + 1][arg8 + 1];
            var21 = arg3[arg0 + 1][arg8 + 1];
            var23 = arg14;
        } else if (arg16 == 0 && arg17 == 128) {
            var23 = arg13;
            var21 = arg3[arg0][arg8 + 1];
            var20 = arg1[arg0][arg8 + 1];
            var22 = arg10[arg0][arg8 + 1];
        } else {
            float var24 = arg10[arg0][arg8];
            float var25 = arg1[arg0][arg8];
            float var26 = arg3[arg0][arg8];
            float var27 = (float) arg17 / 128.0F;
            float var28 = (float) arg16 / 128.0F;
            float var29 = (arg3[arg0 + 1][arg8] - var26) * var28 + var26;
            float var30 = (arg1[arg0 + 1][arg8] - var25) * var28 + var25;
            float var31 = (arg10[arg0 + 1][arg8] - var24) * var28 + var24;
            float var32 = arg1[arg0][arg8 + 1];
            float var33 = arg10[arg0][arg8 + 1];
            float var34 = (arg1[arg0 + 1][arg8 + 1] - var32) * var28 + var32;
            var20 = (var34 - var30) * var27 + var30;
            float var35 = (arg10[arg0 + 1][arg8 + 1] - var33) * var28 + var33;
            var22 = (var35 - var31) * var27 + var31;
            float var36 = arg3[arg0][arg8 + 1];
            float var37 = (arg3[arg0 + 1][arg8 + 1] - var36) * var28 + var36;
            int var38 = class236.method1698(arg4, arg5, -116, arg16);
            var21 = (var37 - var29) * var27 + var29;
            int var39 = class236.method1698(arg13, arg14, -103, arg16);
            var23 = class236.method1698(var38, var39, -128, arg17);
        }
        int var40 = 42 % ((-arg6 - 43) / 33);
        int var41 = (arg0 << 7) + arg16;
        int var42 = class300.method2069(arg8, arg12, 1496591591, arg0, arg16, arg17);
        int var43 = (arg8 << 7) + arg17;
        return arg15.method24(var41, var42, var43, var20, var21, var22, arg9 ? var23 & 0xFFFFFF00 : var23, arg2 == null ? 0.0F : (float) (var42 - class300.method2069(arg8, arg2, 1496591591, arg0, arg16, arg17)) / arg11);
    }
}
