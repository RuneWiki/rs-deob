import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class627 extends class263 {

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "Liq;")
    private class568 field8522;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lbj;")
    private class227 field8500;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Lkea;")
    private class223 field8516;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    private int field8520;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    private int field8502;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    private int field8510;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    private int field8518;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "[[F")
    private float[][] field8511;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[[F")
    private float[][] field8504;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[[F")
    private float[][] field8499;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    private int field8519;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lhd;")
    private class694 field8508;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Lvl;")
    private class13 field8523;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8505;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8506;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lii;")
    private class519 field8507;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    private int field8503;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "[Lxa;")
    public static class468[] field8514;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method3497(int arg0, int arg1) {
        field8517++;
        class162.field1917.method1222(arg1 + 14564, arg0);
        if (arg1 != 0) {
            field8514 = null;
        }
        class185.field2189.method1222(14564, arg0);
        class89.field1161.method1222(14564, arg0);
        class106.field1334.method1222(14564, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBIII[FIFI)V")
    public static final void method3498(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8, int arg9) {
        int var10 = arg9 - arg4;
        int var11 = arg7 - arg1;
        if (arg2 >= -123) {
            method3499((byte) -70);
        }
        field8501++;
        int var12 = arg3 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[4] * (float) var11 + arg6[3] * (float) var10;
        float var15 = arg6[8] * (float) var12 + arg6[7] * (float) var11 + arg6[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg8 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg0 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg0 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg0 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class315.field3950 = var17;
        class672.field9182 = var18;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method3499(byte arg0) {
        if (arg0 <= 93) {
            field8514 = null;
        }
        field8515++;
        if (!class69.field904) {
            return;
        }
        while (true) {
            while (class704.field9858.length > class613.field8338) {
                class305 var1 = class704.field9858[class613.field8338];
                if (var1 != null && var1.field3864 == -1) {
                    if (class223.field2713 == null) {
                        class223.field2713 = class124.field1518.method738(var1.field3869, (byte) 120);
                    }
                    int var2 = class223.field2713.field7829;
                    if (var2 == -1) {
                        return;
                    }
                    class223.field2713 = null;
                    var1.field3864 = var2;
                    class613.field8338++;
                } else {
                    class613.field8338++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static final void method3500(boolean arg0) {
        field8512++;
        if (class90.field1174 != null || !arg0) {
            return;
        }
        Container var1;
        if (class338.field4326 != null) {
            var1 = class338.field4326;
        } else if (class95.field1241 == null) {
            var1 = class699.field9680;
        } else {
            var1 = class95.field1241;
        }
        class578.field7765 = var1.getSize().width;
        class200.field2327 = var1.getSize().height;
        if (class338.field4326 == var1) {
            Insets var2 = class338.field4326.getInsets();
            class200.field2327 -= var2.top + var2.bottom;
            class578.field7765 -= var2.left + var2.right;
        }
        if (class207.method1211(3) == 1) {
            class398.field5063 = 0;
            class491.field6129 = class634.field8596;
            class151.field1799 = (class578.field7765 - class696.field9640) / 2;
            class309.field3890 = class696.field9640;
        } else {
            class605.method3356((byte) 101);
        }
        if (class257.field3292 != class255.field3277) {
            boolean var10000;
            if (class309.field3890 < 1024 && class491.field6129 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class472.field5828.setSize(class309.field3890, class491.field6129);
        if (class309.field3898 != null) {
            class309.field3898.method405(class472.field5828);
        }
        if (class338.field4326 == var1) {
            Insets var3 = class338.field4326.getInsets();
            class472.field5828.setLocation(class151.field1799 + var3.left, var3.top - -class398.field5063);
        } else {
            class472.field5828.setLocation(class151.field1799, class398.field5063);
        }
        if (class305.field3866 != -1) {
            class602.method3309(true, 3);
        }
        class215.method1251(110);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
    public static void method3501(boolean arg0) {
        field8514 = null;
        if (!arg0) {
            method3500(true);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IS)V")
    private final void method3502(int arg0, short arg1) {
        field8513++;
        if (arg0 != 0) {
            this.field8508 = null;
        }
        if (Stream.method3525()) {
            this.field8506.method3526(arg1);
        } else {
            this.field8506.method3519(arg1);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([[ZIIII)V")
    public final void method3503(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field8509++;
        if (this.field8523 == null || arg4 != 1 || this.field8520 > arg2 + arg1 || (arg2 - arg1) > this.field8502 || (arg1 + arg3) < this.field8510 || this.field8518 < arg3 - arg1) {
            return;
        }
        for (int var6 = this.field8510; var6 <= this.field8518; var6++) {
            for (int var7 = this.field8520; var7 <= this.field8502; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg3;
                if ((-arg1) < var8 && arg1 > var8 && var9 > -arg1 && var9 < arg1 && arg0[arg1 + var8][arg1 + var9]) {
                    this.field8516.method1278(14354, (byte) ((int) (this.field8500.method1368(128) * 255.0F)));
                    this.field8516.method363(-123, 0, this.field8507);
                    this.field8516.method344(28303, this.field8516.field2889);
                    this.field8516.method375(0, (byte) 125, 0, this.field8503, this.field8519 / 3, class701.field9803, this.field8523);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
    private final void method3504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8521++;
        long var8 = -1L;
        int var10 = (arg0 << this.field8522.field1683) + arg3;
        int var11 = (arg2 << this.field8522.field1683) + arg1;
        int var12 = this.field8522.method194(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class263 var13 = this.field8508.method3828(var8, (byte) -91);
            if (var13 != null) {
                this.method3502(0, ((class517) var13).field6544);
                return;
            }
        }
        short var14 = (short) (this.field8503++);
        if (var8 != -1L) {
            this.field8508.method3832(new class517(var14), var8, 63);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg1 == 0) {
            var15 = this.field8511[arg4][arg5];
            var16 = this.field8504[arg4][arg5];
            var17 = this.field8499[arg4][arg5];
        } else if (this.field8522.field1686 == arg3 && arg1 == 0) {
            var16 = this.field8504[arg4 + 1][arg5];
            var15 = this.field8511[arg4 + 1][arg5];
            var17 = this.field8499[arg4 + 1][arg5];
        } else if (this.field8522.field1686 == arg3 && this.field8522.field1686 == arg1) {
            var16 = this.field8504[arg4 + 1][arg5 + 1];
            var15 = this.field8511[arg4 + 1][arg5 + 1];
            var17 = this.field8499[arg4 + 1][arg5 + 1];
        } else if (arg3 == 0 && this.field8522.field1686 == arg1) {
            var15 = this.field8511[arg4][arg5 + 1];
            var16 = this.field8504[arg4][arg5 + 1];
            var17 = this.field8499[arg4][arg5 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field8522.field1686;
            float var19 = (float) arg1 / (float) this.field8522.field1686;
            float var20 = this.field8499[arg4][arg5];
            float var21 = this.field8511[arg4][arg5];
            float var22 = this.field8504[arg4][arg5];
            float var23 = this.field8499[arg4 + 1][arg5];
            float var24 = this.field8511[arg4 + 1][arg5];
            float var25 = this.field8504[arg4 + 1][arg5];
            float var26 = (this.field8511[arg4][arg5 + 1] - var21) * var18 + var21;
            float var27 = (this.field8499[arg4][arg5 + 1] - var20) * var18 + var20;
            float var28 = (this.field8511[arg4 + 1][arg5 + 1] - var24) * var18 + var24;
            float var29 = (this.field8504[arg4][arg5 + 1] - var22) * var18 + var22;
            float var30 = (this.field8499[arg4 + 1][arg5 + 1] - var23) * var18 + var23;
            var17 = (var30 - var27) * var19 + var27;
            float var31 = (this.field8504[arg4 + 1][arg5 + 1] - var25) * var18 + var25;
            var15 = (var28 - var26) * var19 + var26;
            var16 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field8500.method1374((byte) 30) - var10);
        float var33 = (float) (this.field8500.method1373((byte) -62) - var12);
        float var34 = (float) (this.field8500.method1370((byte) -5) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field8500.method1367(12);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        if (arg6 <= 41) {
            method3500(false);
        }
        float var42 = var16 * var39 + var15 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8500.method1372(125);
        int var45 = (int) ((float) ((var44 & 0xFF09B9) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF44) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3525()) {
            this.field8505.method3517((float) var10);
            this.field8505.method3517((float) var12);
            this.field8505.method3517((float) var11);
        } else {
            this.field8505.method3527((float) var10);
            this.field8505.method3527((float) var12);
            this.field8505.method3527((float) var11);
        }
        if (this.field8516.field2856 == 0) {
            this.field8505.method3521(var47);
            this.field8505.method3521(var46);
            this.field8505.method3521(var45);
        } else {
            this.field8505.method3521(var45);
            this.field8505.method3521(var46);
            this.field8505.method3521(var47);
        }
        this.field8505.method3521(255);
        this.method3502(0, var14);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lkea;Liq;Lbj;[I)V")
    public class627(class223 arg0, class568 arg1, class227 arg2, int[] arg3) {
        this.field8522 = arg1;
        this.field8500 = arg2;
        this.field8516 = arg0;
        int var5 = this.field8500.method1367(126) - (arg1.field1686 >> 1);
        this.field8520 = this.field8500.method1374((byte) 124) - var5 >> arg1.field1683;
        this.field8502 = this.field8500.method1374((byte) 54) + var5 >> arg1.field1683;
        this.field8510 = this.field8500.method1370((byte) -5) - var5 >> arg1.field1683;
        this.field8518 = this.field8500.method1370((byte) -5) + var5 >> arg1.field1683;
        int var6 = this.field8502 + 1 - this.field8520;
        int var7 = this.field8518 + 1 - this.field8510;
        this.field8511 = new float[var6 + 1][var7 + 1];
        this.field8504 = new float[var6 + 1][var7 + 1];
        this.field8499 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field8510 + var8;
            if (var27 > 0 && var27 < (this.field8522.field1684 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field8520 + var28;
                    if (var29 > 0 && (this.field8522.field1685 - 1) > var29) {
                        int var30 = arg1.method201(var29 + 1, var27) - arg1.method201(var29 - 1, var27);
                        int var31 = arg1.method201(var29, var27 + 1) - arg1.method201(var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var31 * var31) + 65536)));
                        this.field8499[var28][var8] = (float) var30 * var32;
                        this.field8511[var28][var8] = var32 * -256.0F;
                        this.field8504[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8510; var10 <= this.field8518; var10++) {
            if (var10 >= 0 && var10 < arg1.field1684) {
                for (int var23 = this.field8520; var23 <= this.field8502; var23++) {
                    if (var23 >= 0 && arg1.field1685 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7128[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8519 += 3;
                                    }
                                }
                            } else {
                                this.field8519 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8502 - this.field8520;
            }
        }
        if (this.field8519 > 0) {
            this.field8508 = new class694(class560.method2979(this.field8519, (byte) 81));
            this.field8523 = this.field8516.method340((byte) 98, false);
            this.field8523.method59(-29529, this.field8519);
            NativeHeapBuffer var11 = this.field8516.method1288(false, this.field8519 * 16, -39);
            this.field8505 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8523.method62(true, true);
                } while (var12 == null);
                this.field8506 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8510; var15 <= this.field8518; var15++) {
                    if (var15 >= 0 && arg1.field1684 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field8520; var17 <= this.field8502; var17++) {
                            if (var17 >= 0 && var17 < arg1.field1685) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field7128[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7136[var17][var15];
                                        int[] var21 = arg1.field7127[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3504(var17, var21[var22], var15, var20[var22], var16, var13, 54);
                                                    var22++;
                                                    this.method3504(var17, var21[var22], var15, var20[var22], var16, var13, 61);
                                                    var22++;
                                                    this.method3504(var17, var21[var22], var15, var20[var22], var16, var13, 81);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3504(var17, 0, var15, 0, var16, var13, 68);
                                        this.method3504(var17, 0, var15, arg1.field1686, var16, var13, 126);
                                        this.method3504(var17, arg1.field1686, var15, 0, var16, var13, 50);
                                    } else if (var18 == 2) {
                                        this.method3504(var17, 0, var15, arg1.field1686, var16, var13, 111);
                                        this.method3504(var17, arg1.field1686, var15, arg1.field1686, var16, var13, 75);
                                        this.method3504(var17, 0, var15, 0, var16, var13, 104);
                                    } else if (var18 == 5) {
                                        this.method3504(var17, arg1.field1686, var15, arg1.field1686, var16, var13, 126);
                                        this.method3504(var17, arg1.field1686, var15, 0, var16, var13, 72);
                                        this.method3504(var17, 0, var15, arg1.field1686, var16, var13, 51);
                                    } else if (var18 == 4) {
                                        this.method3504(var17, arg1.field1686, var15, 0, var16, var13, 62);
                                        this.method3504(var17, 0, var15, 0, var16, var13, 95);
                                        this.method3504(var17, arg1.field1686, var15, arg1.field1686, var16, var13, 79);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field8502 - this.field8520;
                    }
                    var13++;
                }
                this.field8506.method3530();
                if (this.field8523.method61((byte) 96)) {
                    this.field8505.method3530();
                    this.field8507 = this.field8516.method341(111, false);
                    this.field8507.method2813(-50, var11, 16, this.field8503 * 16);
                    break;
                }
                this.field8505.method3529(0);
                this.field8508.method3839((byte) -97);
            }
        } else {
            this.field8523 = null;
            this.field8507 = null;
        }
        this.field8499 = this.field8511 = this.field8504 = null;
        this.field8508 = null;
        this.field8505 = null;
        this.field8506 = null;
    }
}
