import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class377 {

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Ljt;")
    private class67 field5301;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lht;")
    private class410 field5299;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    private int field5304;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    private int field5295;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[B")
    public byte[] field5298;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    private int field5297;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Llg;")
    public static class284 field5308 = new class284(7, 16);

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "[I")
    public static int[] field5311 = new int[100];

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[I")
    public static int[] field5315 = new int[16384];

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "J")
    public static long field5310 = 0L;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[I")
    public static int[] field5316 = new int[16384];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
    public static int[] field5312;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[Lvq;")
    public static class320[] field5317;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[Lf;")
    public static class529[] field5313;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[[Lsh;")
    private class49[][] field5306;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5316[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field5315[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILj;II)V", line = 4)
    public final void method2171(int arg0, class378 arg1, int arg2, int arg3) {
        field5294++;
        class418 var5 = (class418) arg1;
        int var6 = var5.field6105 + arg3 + 1;
        int var7 = var5.field6108 + arg0 + 1;
        int var8 = this.field5307 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field6116;
        int var11 = var5.field6111;
        int var12 = this.field5307 - var11;
        int var13 = 0;
        if (arg2 != 5598) {
            field5311 = null;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field5307 * var14;
        }
        if (this.field5304 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field5304;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var12 += var16;
            var7 = 1;
            var13 += var16;
            var9 += var16;
            var11 -= var16;
        }
        if (this.field5307 <= (var7 + var11)) {
            int var17 = var7 + var11 - (-1 - -this.field5307);
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class167.method1037(var12, -3, var11, var8, var13, var9, var10, this.field5298, var5.field6115);
            this.method2174(var10, var6, var11, var7, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lj;III)Z", line = 80)
    public final boolean method2172(class378 arg0, int arg1, int arg2, int arg3) {
        field5309++;
        class418 var5 = (class418) arg0;
        int var6 = var5.field6108 + arg1 + 1;
        int var7 = var5.field6105 + arg3 + arg2;
        int var8 = this.field5307 * var7 + var6;
        int var9 = var5.field6116;
        int var10 = var5.field6111;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var7 = 1;
            var8 += this.field5307 * var11;
        }
        int var12 = this.field5307 - var10;
        if (this.field5304 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field5304;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var12 += var14;
            var8 += var14;
        }
        if (this.field5307 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field5307;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5307 + var12;
            return class78.method575(this.field5298, var17, var10, var16, var9, (byte) -110, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 156)
    public final void method2173(byte arg0) {
        field5314++;
        this.field5306 = new class49[this.field5297][this.field5300];
        if (arg0 != -77) {
            field5311 = null;
        }
        for (int var2 = 0; var2 < this.field5300; var2++) {
            for (int var3 = 0; var3 < this.field5297; var3++) {
                this.field5306[var3][var2] = new class49(this.field5299, this, this.field5301, var3, var2, this.field5295, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIB)V", line = 189)
    private final void method2174(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5302++;
        if (this.field5306 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg2 + arg3 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg0 - 1 - 1 >> 7;
        if (arg4 < 55) {
            field5313 = null;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class49[] var11 = this.field5306[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field664 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 228)
    public static void method2175(byte arg0) {
        field5315 = null;
        if (arg0 > -82) {
            return;
        }
        field5308 = null;
        field5313 = null;
        field5311 = null;
        field5312 = null;
        field5317 = null;
        field5316 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z", line = 244)
    public static final boolean method2176(int arg0) {
        field5293++;
        if (class205.field2911) {
            try {
                if ((Boolean) class484.method2855(class282.field3804.field5516, "showingVideoAd", -29222)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == 16;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[[ZZI)V", line = 264)
    public final void method2177(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        field5296++;
        this.field5299.method2433(false, (byte) -81);
        if (arg0 > -107) {
            field5317 = null;
        }
        this.field5299.method2431(false, -31688);
        this.field5299.method2366(-2, 1874);
        this.field5299.method2365(true, 1);
        this.field5299.method2356((byte) -21, 1);
        float var7 = 1.0F / (float) (this.field5299.field5865 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field5300; var22++) {
                int var23 = var22 << this.field5295;
                int var24 = var22 + 1 << this.field5295;
                label88: for (int var25 = 0; var25 < this.field5297; var25++) {
                    int var26 = var25 << this.field5295;
                    int var27 = var25 + 1 << this.field5295;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((-arg1) <= (var28 - arg2) && (var28 - arg2) <= arg1) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (-arg1 <= var29 - arg5 && var29 - arg5 <= arg1 && arg3[var28 + arg1 - arg2][var29 + arg1 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field5306[var25][var22].method308((byte) 96);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field5300; var8++) {
                int var9 = var8 << this.field5295;
                int var10 = var8 + 1 << this.field5295;
                for (int var11 = 0; var11 < this.field5297; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field5295;
                    int var14 = var11 + 1 << this.field5295;
                    class365 var15 = class170.field2403;
                    var15.field5069 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (var16 - arg5 >= -arg1 && var16 - arg5 <= arg1) {
                            int var17 = this.field5301.field495 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg2 >= -arg1 && (var18 - arg2) <= arg1 && arg3[arg1 + var18 - arg2][var16 + arg1 - arg5]) {
                                    short[] var19 = this.field5301.field943[var17];
                                    if (var19 != null) {
                                        if (this.field5299.field5931) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method2070(81954016, var19[var21] & 0xFFFF);
                                                var12++;
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method2115((byte) 42, var19[var20] & 0xFFFF);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field5306[var11][var8].method310(5123, -1, var15.field5073, var12);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lqa;I)V", line = 447)
    public static final void method2178(class162 arg0, int arg1) {
        arg0.method462(0, 0, class177.field2513, 350);
        field5303++;
        arg0.method459(0, 0, class177.field2513, 350, class408.field5646 << 24 | 0x332277, 1);
        int var2 = 350 / class52.field695;
        if (class307.field4213 > 0) {
            int var3 = 346 - class52.field695 - 4;
            int var4 = var2 * var3 / (class307.field4213 + var2 - 1);
            int var5 = 4;
            if (class307.field4213 > 1) {
                var5 += (class307.field4213 - class233.field3231 - 1) * (var3 - var4) / (class307.field4213 - 1);
            }
            arg0.method459(class177.field2513 - 16, var5, 12, var4, class408.field5646 << 24 | 0x332277, 2);
            for (int var6 = class233.field3231; var6 < class233.field3231 + var2 && var6 < class307.field4213; var6++) {
                String[] var7 = class96.method654(class306.field4199[var6], '\b', false);
                int var8 = (class177.field2513 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method462(var10, 0, var8 + var10 - 8, 350);
                    class117.field1579.method2881(var7[var9], (byte) -121, -1, var10, -16777216, 348 - class342.field4720 - class68.field987.field774 - ((-class233.field3231 + var6) * class52.field695));
                }
            }
        }
        arg0.method462(0, 0, class177.field2513, 350);
        arg0.method999(350 - class342.field4720, -1, 0, 20754, class177.field2513);
        class34.field487.method2881("--> " + class452.field6564, (byte) -115, -1, 10, -16777216, 350 - class105.field1430.field774 - 1);
        int var11 = -1;
        if (arg1 > 77) {
            if ((class393.field5484 % 30) > 15) {
                var11 = 16777215;
            }
            arg0.method1002(350 - (class105.field1430.field774 + 11), 12, var11, class105.field1430.method362("--> " + class452.field6564.substring(0, class29.field436), (byte) 90) + 10, -124);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lj;IIZ)V", line = 509)
    public final void method2179(class378 arg0, int arg1, int arg2, boolean arg3) {
        field5305++;
        class418 var5 = (class418) arg0;
        int var6 = var5.field6108 + arg1 + 1;
        int var7 = var5.field6105 + arg2 + 1;
        int var8 = this.field5307 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6116;
        int var11 = var5.field6111;
        int var12 = this.field5307 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field5307 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field5304) {
            int var15 = var7 + var10 - (-1 - -this.field5304);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var6 = 1;
            var14 += var16;
        }
        if ((var6 + var11) >= this.field5307) {
            int var17 = var6 + var11 + 1 - this.field5307;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class167.method1032(var14, var10, var8, this.field5298, var9, var11, var5.field6115, (byte) -103, var12);
        this.method2174(var10, var7, var11, var6, (byte) 105);
        if (!arg3) {
            this.method2172(null, -60, -33, -38);
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lht;Ljt;)V", line = 594)
    public class377(class410 arg0, class67 arg1) {
        this.field5301 = arg1;
        this.field5299 = arg0;
        this.field5307 = (this.field5301.field495 * this.field5301.field494 >> this.field5299.field5866) + 2;
        this.field5304 = (this.field5301.field497 * this.field5301.field494 >> this.field5299.field5866) + 2;
        this.field5295 = this.field5299.field5866 + 7 - this.field5301.field492;
        this.field5298 = new byte[this.field5307 * this.field5304];
        this.field5297 = this.field5301.field495 >> this.field5295;
        this.field5300 = this.field5301.field497 >> this.field5295;
    }
}
