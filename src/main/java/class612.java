import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class612 extends class28 {

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "Lhj;")
    private class329 field8340;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "Lsv;")
    private class312 field8342;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "Lua;")
    private class303 field8328;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    private int field8324;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    private int field8329;

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "I")
    private int field8343;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    private int field8330;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "[[F")
    private float[][] field8341;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "[[F")
    private float[][] field8332;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "[[F")
    private float[][] field8347;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    private int field8335;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "Lnj;")
    private class436 field8331;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "Lgo;")
    private class526 field8336;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8338;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8337;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "Lvp;")
    private class467 field8325;

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
    private int field8345;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Lcb;")
    public static class318 field8326 = new class318(11, -2);

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "Lcb;")
    public static class318 field8346 = new class318(62, 12);

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "Lvi;")
    public static class560 field8348 = new class560(4);

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field8349 = 0;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "Lcb;")
    public static class318 field8351 = new class318(41, -1);

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
    public static int field8353 = 0;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "Lrh;")
    public static class59 field8352 = new class59();

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "[I")
    public static int[] field8354 = new int[500];

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IS)V", line = 6)
    private final void method3366(int arg0, short arg1) {
        if (arg0 != 15520) {
            this.method3370(25, 63, -115, 90, 82, 14, -122);
        }
        if (Stream.method1519()) {
            this.field8337.method1531(arg1);
        } else {
            this.field8337.method1525(arg1);
        }
        field8344++;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIII[B)Z", line = 23)
    public static final boolean method3367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field8333++;
        int var7 = arg0 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg2 + arg5 - 1) / arg2);
        int var10 = -((arg0 + arg2 - 1) / arg2);
        int var11 = var9;
        if (arg4 < 65) {
            return true;
        }
        while (var11 < 0) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg3] == 0) {
                    return true;
                }
                arg3 += arg2;
            }
            int var13 = arg3 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg1 + var13;
            var11++;
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)[I", line = 76)
    public static final int[] method3368(int arg0) {
        if (arg0 != 1) {
            field8349 = -15;
        }
        field8327++;
        return new int[] { class213.field2765, class627.field8529, class290.field3886 };
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V", line = 93)
    public static void method3369(int arg0) {
        field8348 = null;
        if (arg0 != 16) {
            field8350 = 108;
        }
        field8326 = null;
        field8346 = null;
        field8351 = null;
        field8354 = null;
        field8352 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIII)V", line = 120)
    private final void method3370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8339++;
        long var8 = -1L;
        int var10 = (arg1 << this.field8328.field2212) + arg3;
        int var11 = (arg6 << this.field8328.field2212) + arg2;
        int var12 = this.field8328.method159(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class28 var13 = this.field8331.method2506(61, var8);
            if (var13 != null) {
                this.method3366(15520, ((class396) var13).field5661);
                return;
            }
        }
        short var14 = (short) (this.field8345++);
        if (var8 != -1L) {
            this.field8331.method2504(var8, -55, new class396(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg2 == 0) {
            var15 = this.field8347[arg0][arg4];
            var16 = this.field8332[arg0][arg4];
            var17 = this.field8341[arg0][arg4];
        } else if (this.field8328.field2210 == arg3 && arg2 == 0) {
            var16 = this.field8332[arg0 + 1][arg4];
            var17 = this.field8341[arg0 + 1][arg4];
            var15 = this.field8347[arg0 + 1][arg4];
        } else if (this.field8328.field2210 == arg3 && this.field8328.field2210 == arg2) {
            var16 = this.field8332[arg0 + 1][arg4 + 1];
            var17 = this.field8341[arg0 + 1][arg4 + 1];
            var15 = this.field8347[arg0 + 1][arg4 + 1];
        } else if (arg3 == 0 && this.field8328.field2210 == arg2) {
            var15 = this.field8347[arg0][arg4 + 1];
            var16 = this.field8332[arg0][arg4 + 1];
            var17 = this.field8341[arg0][arg4 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field8328.field2210;
            float var19 = (float) arg2 / (float) this.field8328.field2210;
            float var20 = this.field8347[arg0][arg4];
            float var21 = this.field8332[arg0][arg4];
            float var22 = this.field8341[arg0][arg4];
            float var23 = this.field8347[arg0 + 1][arg4];
            float var24 = this.field8332[arg0 + 1][arg4];
            float var25 = (this.field8332[arg0][arg4 + 1] - var21) * var18 + var21;
            float var26 = this.field8341[arg0 + 1][arg4];
            float var27 = (this.field8341[arg0][arg4 + 1] - var22) * var18 + var22;
            float var28 = (this.field8332[arg0 + 1][arg4 + 1] - var24) * var18 + var24;
            float var29 = (this.field8347[arg0][arg4 + 1] - var20) * var18 + var20;
            float var30 = (this.field8347[arg0 + 1][arg4 + 1] - var23) * var18 + var23;
            var15 = (var30 - var29) * var19 + var29;
            var16 = (var28 - var25) * var19 + var25;
            float var31 = (this.field8341[arg0 + 1][arg4 + 1] - var26) * var18 + var26;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field8340.method2112(0) - var10);
        float var33 = (float) (this.field8340.method2115((byte) -63) - var12);
        float var34 = (float) (this.field8340.method2114((byte) -97) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field8340.method2110(true);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8340.method2109(14463);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method1519()) {
            this.field8338.method1530((float) var10);
            this.field8338.method1530((float) var12);
            this.field8338.method1530((float) var11);
        } else {
            this.field8338.method1520((float) var10);
            this.field8338.method1520((float) var12);
            this.field8338.method1520((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field8342.field4462 == arg5) {
            this.field8338.method1526(var47);
            this.field8338.method1526(var46);
            this.field8338.method1526(var45);
        } else {
            this.field8338.method1526(var45);
            this.field8338.method1526(var46);
            this.field8338.method1526(var47);
        }
        this.field8338.method1526(255);
        this.method3366(15520, var14);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[[ZI)V", line = 295)
    public final void method3371(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field8334++;
        if (this.field8336 == null || (arg0 + arg2) < this.field8324 || this.field8329 < arg0 - arg2 || this.field8343 > arg2 + arg4 || (arg4 - arg2) > this.field8330) {
            return;
        }
        int var6 = this.field8343;
        if (arg1 != 0) {
            this.field8325 = null;
        }
        while (var6 <= this.field8330) {
            for (int var7 = this.field8324; var7 <= this.field8329; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg4;
                if ((-arg2) < var8 && var8 < arg2 && var9 > -arg2 && var9 < arg2 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field8342.method1968(false, (byte) ((int) (this.field8340.method2113((byte) 57) * 255.0F)));
                    this.field8342.method809(1, 0, this.field8325);
                    this.field8342.method849((byte) 43, this.field8342.field4498);
                    this.field8342.method818(0, this.field8345, this.field8336, this.field8335 / 3, ~arg1, class319.field4687, 0);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lsv;Lua;Lhj;[I)V", line = 353)
    public class612(class312 arg0, class303 arg1, class329 arg2, int[] arg3) {
        this.field8340 = arg2;
        this.field8342 = arg0;
        this.field8328 = arg1;
        int var5 = this.field8340.method2110(true) - (arg1.field2210 >> 1);
        this.field8324 = this.field8340.method2112(0) - var5 >> arg1.field2212;
        this.field8329 = var5 + this.field8340.method2112(0) >> arg1.field2212;
        this.field8343 = this.field8340.method2114((byte) -110) - var5 >> arg1.field2212;
        this.field8330 = var5 + this.field8340.method2114((byte) -115) >> arg1.field2212;
        int var6 = this.field8329 + 1 - this.field8324;
        int var7 = this.field8330 + 1 - this.field8343;
        this.field8341 = new float[var6 + 1][var7 + 1];
        this.field8332 = new float[var6 + 1][var7 + 1];
        this.field8347 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field8343 + var8;
            if (var27 > 0 && var27 < (this.field8328.field2215 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field8324 + var28;
                    if (var29 > 0 && (this.field8328.field2214 - 1) > var29) {
                        int var30 = arg1.method150(var29 + 1, var27) - arg1.method150(var29 - 1, var27);
                        int var31 = arg1.method150(var29, var27 + 1) - arg1.method150(var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var31 * var31) + 65536)));
                        this.field8347[var28][var8] = (float) var30 * var32;
                        this.field8332[var28][var8] = var32 * -256.0F;
                        this.field8341[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8343; var10 <= this.field8330; var10++) {
            if (var10 >= 0 && var10 < arg1.field2215) {
                for (int var23 = this.field8324; var23 <= this.field8329; var23++) {
                    if (var23 >= 0 && var23 < arg1.field2214) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field4065[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8335 += 3;
                                    }
                                }
                            } else {
                                this.field8335 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8329 - this.field8324;
            }
        }
        if (this.field8335 > 0) {
            this.field8331 = new class436(class306.method1837((byte) -127, this.field8335));
            this.field8336 = this.field8342.method850(true, false);
            this.field8336.method1446(this.field8335, 30419);
            NativeHeapBuffer var11 = this.field8342.method1923(false, this.field8335 * 16, 1);
            this.field8338 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8336.method1025(true, (byte) 67);
                } while (var12 == null);
                this.field8337 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8343; var15 <= this.field8330; var15++) {
                    if (var15 >= 0 && var15 < arg1.field2215) {
                        int var16 = 0;
                        for (int var17 = this.field8324; var17 <= this.field8329; var17++) {
                            if (var17 >= 0 && arg1.field2214 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field4065[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field4062[var17][var15];
                                        int[] var21 = arg1.field4041[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3370(var16, var17, var21[var22], var20[var22], var13, 0, var15);
                                                    var22++;
                                                    this.method3370(var16, var17, var21[var22], var20[var22], var13, 0, var15);
                                                    var22++;
                                                    this.method3370(var16, var17, var21[var22], var20[var22], var13, 0, var15);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3370(var16, var17, 0, 0, var13, 0, var15);
                                        this.method3370(var16, var17, 0, arg1.field2210, var13, 0, var15);
                                        this.method3370(var16, var17, arg1.field2210, 0, var13, 0, var15);
                                    } else if (var18 == 2) {
                                        this.method3370(var16, var17, 0, arg1.field2210, var13, 0, var15);
                                        this.method3370(var16, var17, arg1.field2210, arg1.field2210, var13, 0, var15);
                                        this.method3370(var16, var17, 0, 0, var13, 0, var15);
                                    } else if (var18 == 5) {
                                        this.method3370(var16, var17, arg1.field2210, arg1.field2210, var13, 0, var15);
                                        this.method3370(var16, var17, arg1.field2210, 0, var13, 0, var15);
                                        this.method3370(var16, var17, 0, arg1.field2210, var13, 0, var15);
                                    } else if (var18 == 4) {
                                        this.method3370(var16, var17, arg1.field2210, 0, var13, 0, var15);
                                        this.method3370(var16, var17, 0, 0, var13, 0, var15);
                                        this.method3370(var16, var17, arg1.field2210, arg1.field2210, var13, 0, var15);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field8329 - this.field8324;
                    }
                    var13++;
                }
                this.field8337.method1523();
                if (this.field8336.method1021(true)) {
                    this.field8338.method1523();
                    this.field8325 = this.field8342.method819(false, (byte) 79);
                    this.field8325.method1023(var11, 16, this.field8345 * 16, 102);
                    break;
                }
                this.field8338.method1529(0);
                this.field8331.method2510(-1);
            }
        } else {
            this.field8336 = null;
            this.field8325 = null;
        }
        this.field8347 = this.field8332 = this.field8341 = null;
        this.field8337 = null;
        this.field8331 = null;
        this.field8338 = null;
    }
}
