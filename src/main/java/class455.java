import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class455 extends class106 {

    @OriginalMember(owner = "client!it", name = "C", descriptor = "Z")
    private boolean field6804 = false;

    @OriginalMember(owner = "client!it", name = "E", descriptor = "Z")
    private boolean field6806;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "[Lrd;")
    private class221[] field6796;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "F")
    public static float field6790 = 1024.0F;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Z")
    public static volatile boolean field6788 = true;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public static int field6794 = 0;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!it", name = "F", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "Lm;")
    public static class126 field6791;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "Lsc;")
    private class229 field6797;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "(I)V")
    private final void method2711(int arg0) {
        this.field6797 = new class229(super.field1770, 2);
        ++field6802;
        this.field6797.method1495(0, (byte) -115);
        int var2 = 54 / ((33 - arg0) / 55);
        super.field1770.method1929(1, (byte) 73);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field6806) {
            super.field1770.method1951((byte) 100, 7681, 8448);
            super.field1770.method1921(768, 34168, (byte) 125, 0);
            super.field1770.method1929(2, (byte) 114);
            super.field1770.method1951((byte) -127, 260, 7681);
            super.field1770.method1921(768, 34168, (byte) -123, 0);
            super.field1770.method1921(770, 34168, (byte) 36, 1);
            super.field1770.method1952(770, 34167, 115, 0);
        } else {
            super.field1770.method1951((byte) 100, 260, 7681);
            super.field1770.method1921(770, 5890, (byte) 107, 0);
            super.field1770.method1952(770, 34167, 120, 0);
        }
        super.field1770.method1929(0, (byte) 60);
        this.field6797.method1493((byte) -102);
        this.field6797.method1495(1, (byte) -115);
        super.field1770.method1929(1, (byte) 79);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field6806) {
            super.field1770.method1951((byte) -98, 8448, 8448);
            super.field1770.method1921(768, 5890, (byte) 124, 0);
            super.field1770.method1952(770, 5890, 127, 0);
        } else {
            super.field1770.method1951((byte) 110, 8448, 8448);
            super.field1770.method1921(768, 5890, (byte) -114, 0);
            super.field1770.method1929(2, (byte) 86);
            super.field1770.method1951((byte) -11, 8448, 8448);
            super.field1770.method1921(768, 5890, (byte) -101, 0);
            super.field1770.method1921(768, 34168, (byte) -117, 1);
            super.field1770.method1952(770, 5890, 126, 0);
        }
        super.field1770.method1929(0, (byte) 60);
        this.field6797.method1493((byte) -109);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        ++field6803;
        if (this.field6804) {
            if (!this.field6806) {
                super.field1770.method1929(2, (byte) 73);
                super.field1770.method1990((class492) null, 11864);
            }
            super.field1770.method1929(1, (byte) 71);
            super.field1770.method1990((class492) null, 11864);
            super.field1770.method1929(0, (byte) 62);
            this.field6797.method1494('\u0001', false);
            this.field6804 = false;
        } else {
            super.field1770.method1952(770, 5890, 124, 0);
        }
        super.field1770.method1951((byte) -26, 8448, 8448);
        if (arg0 != 3) {
            this.method343(true, 33);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII[FII)V")
    public static final void method2712(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        ++field6801;
        if (arg0 > 0 && !class354.method2243(0, arg0)) {
            throw new IllegalArgumentException("");
        } else if (~arg3 < -1 && !class354.method2243(0, arg3)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class370.method2318((byte) -89, arg2);
            int var8 = arg1;
            int var9 = arg3 > arg0 ? arg0 : arg3;
            int var10 = arg0 >> 1;
            int var11 = arg3 >> 1;
            float[] var12 = arg4;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg6, var8, arg5, arg0, arg3, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                float[] var15 = var13;
                for (int var16 = 0; ~var16 > ~var7; ++var16) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; ~var11 < ~var20; ++var20) {
                        for (int var21 = 0; var10 > var21; ++var21) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg0 = var10;
                arg3 = var11;
                ++var8;
                var11 >>= 1;
                var10 >>= 1;
                var9 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZLqa;)V")
    public static final void method2713(boolean arg0, class162 arg1) {
        ++field6807;
        int var2 = class106.field1766;
        int var3 = class215.field3104;
        int var4 = class499.field7375;
        int var5 = class87.field1529 + -3;
        byte var6 = 20;
        if (class232.field3382 == null || class410.field6144 == null) {
            if (class151.field2407.method129(true, class294.field4188) && class151.field2407.method129(true, class362.field5484)) {
                class232.field3382 = arg1.method304(class279.method1789(class151.field2407, class294.field4188, 0), true);
                class279 var7 = class279.method1789(class151.field2407, class362.field5484, 0);
                class410.field6144 = arg1.method304(var7, true);
                var7.method1784();
                class46.field856 = arg1.method304(var7, true);
            } else {
                arg1.method253(var2, var3, var4, var6, -class323.field4932 + 255 << 24 | class436.field6515, 1);
            }
        }
        if (class232.field3382 != null && class410.field6144 != null) {
            int var8 = (var4 + -(class410.field6144.method96() * 2)) / class232.field3382.method96();
            for (int var9 = 0; var8 > var9; ++var9) {
                class232.field3382.method3137(class410.field6144.method96() + var2 - -(var9 * class232.field3382.method96()), var3);
            }
            class410.field6144.method3137(var2, var3);
            class46.field856.method3137(-class46.field856.method96() + var2 + var4, var3);
        }
        class310.field4726.method2913(-1, class297.field4210.method2180(client.field2870, 29491), -96, class130.field2060 | -16777216, var2 + 3, var3 + 14);
        arg1.method253(var2, var3 + var6, var4, -var6 + var5, -class323.field4932 + 255 << 24 | class436.field6515, 1);
        int var10 = class166.field2579.method1024(arg0);
        int var11 = class166.field2579.method1019((byte) 3);
        int var12 = 0;
        for (class208 var13 = (class208) class339.field5122.method2427(126); var13 != null; var13 = (class208) class339.field5122.method2422(-127)) {
            int var30 = (-var12 + -1 + class363.field5500) * 16 + var3 - -var6 - -13;
            if (var10 > var2 && var10 < var2 + var4 && ~(var30 + -13) > ~var11 && ~(var30 + 4) < ~var11 && var13.field3002) {
                arg1.method253(var2, var30 + -12, var4, 16, -class265.field3819 + 255 << 24 | class348.field5206, 1);
            }
            ++var12;
        }
        if ((class195.field2867 == null || class480.field7140 == null || class151.field2406 == null) && class151.field2407.method129(true, class284.field4050) && class151.field2407.method129(true, class285.field4068) && class151.field2407.method129(true, class22.field459)) {
            class279 var14 = class279.method1789(class151.field2407, class285.field4068, 0);
            class480.field7140 = arg1.method304(var14, true);
            var14.method1784();
            class5.field128 = arg1.method304(var14, true);
            class195.field2867 = arg1.method304(class279.method1789(class151.field2407, class284.field4050, 0), true);
            class279 var15 = class279.method1789(class151.field2407, class22.field459, 0);
            class151.field2406 = arg1.method304(var15, true);
            var15.method1784();
            class214.field3089 = arg1.method304(var15, true);
        }
        int var16 = 0;
        if (class195.field2867 != null && class480.field7140 != null && class151.field2406 != null) {
            int var17 = (var4 + -(2 * class151.field2406.method96())) / class195.field2867.method96();
            for (int var18 = 0; var17 > var18; ++var18) {
                class195.field2867.method3137(class151.field2406.method96() + var2 - -(class195.field2867.method96() * var18), -class195.field2867.method109() + var3 + var5);
            }
            int var19 = (-var6 + var5 - class151.field2406.method109()) / class480.field7140.method109();
            for (int var20 = 0; var19 > var20; ++var20) {
                class480.field7140.method3137(var2, var3 + var6 + class480.field7140.method109() * var20);
                class5.field128.method3137(-class5.field128.method96() + var2 + var4, var3 - (-var6 - class480.field7140.method109() * var20));
            }
            class151.field2406.method3137(var2, var5 + var3 + -class151.field2406.method109());
            class214.field3089.method3137(var2 - -var4 - class151.field2406.method96(), -class151.field2406.method109() + var3 - -var5);
        }
        for (class208 var21 = (class208) class339.field5122.method2427(111); var21 != null; var21 = (class208) class339.field5122.method2422(-74)) {
            int var22 = var3 - (-var6 - (13 - -((-var16 + class363.field5500 - 1) * 16)));
            int var23 = class130.field2060 | -16777216;
            if (var2 < var10 && var10 < var2 + var4 && var22 - 13 < var11 && var22 - -4 > var11 && var21.field3002) {
                var23 = class483.field7199 | -16777216;
            }
            int[] var24 = null;
            if (!class2.method27(-45, var21.field3005)) {
                if (~var21.field3009 == 0) {
                    if (!class164.method1213(var21.field3005, (byte) -65)) {
                        if (class338.method2169(var21.field3005, 46)) {
                            Object var25 = null;
                            class79 var26;
                            if (~var21.field3005 != -1012) {
                                var26 = class319.field4807.method2874((int) (var21.field3012 >>> 32 & 2147483647L), -17045);
                            } else {
                                var26 = class319.field4807.method2874((int) var21.field3012, -17045);
                            }
                            if (var26.field1370 != null) {
                                var26 = var26.method631(6574, class335.field5059);
                            }
                            if (var26 != null) {
                                var24 = var26.field1374;
                            }
                        }
                    } else {
                        class255 var27 = class34.field668[(int) var21.field3012];
                        if (var27 != null) {
                            class42 var28 = var27.field3677;
                            if (var28.field797 != null) {
                                var28 = var28.method427(class335.field5059, (byte) -55);
                            }
                            if (var28 != null) {
                                var24 = var28.field799;
                            }
                        }
                    }
                } else {
                    var24 = class367.field5550.method1312((byte) 91, var21.field3009).field2126;
                }
            } else {
                var24 = class367.field5550.method1312((byte) 91, (int) var21.field3012).field2126;
            }
            String var29 = class170.method1247(var21, 36096);
            if (var24 != null) {
                var29 = var29 + class58.method517(var24, 88);
            }
            class310.field4726.method2914((byte) -11, var2 + 3, class11.field186, var23, class378.field5719, var29, var22, 0);
            ++var16;
            if (var21.field3004) {
                class377.field5711.method3137(class501.field7392.method2136(var29, 13216) + var2 + 5, var22 - 12);
            }
        }
        class259.method1672((byte) 59, class87.field1529, class215.field3104, class106.field1766, class499.field7375);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IILih;)V")
    public final void method346(int arg0, int arg1, class492 arg2) {
        if (arg0 != 128) {
            this.method2711(16);
        }
        ++field6798;
        super.field1770.method1990(arg2, 11864);
        super.field1770.method1989(-24145, arg1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)V")
    public final void method347(int arg0, byte arg1, int arg2) {
        ++field6799;
        if (this.field6804) {
            super.field1770.method1929(1, (byte) 83);
            super.field1770.method1990(this.field6796[arg0 + -1], 11864);
            super.field1770.method1929(0, (byte) 80);
        }
        if (arg1 != 43) {
            method2715(-59);
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lvj;)V")
    public class455(class303 arg0) {
        super(arg0);
        if (arg0.field4515) {
            this.field6806 = ~arg0.field4598 > -4;
            int var2 = this.field6806 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 == -2) {
                            var15 = var13;
                        } else if (~var14 == -3) {
                            var15 = var12;
                        } else if (~var14 == -4) {
                            var15 = -var12;
                        } else if (var14 != 4) {
                            var15 = -var11;
                        } else {
                            var15 = var11;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field6796 = new class221[3];
            this.field6796[0] = new class221(super.field1770, 6406, 64, false, var4, 6406);
            this.field6796[1] = new class221(super.field1770, 6406, 64, false, var5, 6406);
            this.field6796[2] = new class221(super.field1770, 6406, 64, false, var3, 6406);
            this.method2711(-54);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method2714(Random arg0, int arg1, int arg2) {
        ++field6795;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class354.method2243(0, arg1)) {
            return (int) (((long) arg0.nextInt() & 4294967295L) * (long) arg1 >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            if (arg2 != -13848) {
                return -40;
            } else {
                int var4;
                do {
                    var4 = arg0.nextInt();
                } while (var4 >= var3);
                return class516.method3079(-1387029345, arg1, var4);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        ++field6792;
        if (arg0 != -22884) {
            this.field6804 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)V")
    public final void method343(boolean arg0, int arg1) {
        if (this.field6797 != null && arg0) {
            if (!this.field6806) {
                super.field1770.method1929(2, (byte) 91);
                super.field1770.method1990(super.field1770.field4516, 11864);
                super.field1770.method1929(0, (byte) 118);
            }
            this.field6797.method1494('\u0000', false);
            this.field6804 = true;
        } else {
            super.field1770.method1952(770, 34168, 121, 0);
        }
        if (arg1 != 1) {
            this.field6804 = true;
        }
        ++field6808;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZB)V")
    public final void method344(boolean arg0, byte arg1) {
        if (arg1 > 102) {
            ++field6793;
            super.field1770.method1951((byte) 98, 8448, 7681);
        }
    }

    @OriginalMember(owner = "client!it", name = "g", descriptor = "(I)V")
    public static void method2715(int arg0) {
        field6791 = null;
        if (arg0 != 5890) {
            method2712(-4, 92, 79, -111, (float[]) null, -34, -66);
        }
    }
}
