import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class325 implements class749 {

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field5308 = new String[] { method2768(method2767("X!!f$")), method2768(method2767("X!!l$")), method2768(method2767("U1cH")), method2768(method2767("@j!\nq")), method2768(method2767("d7{ExR'jHiV!aP\u007f")), method2768(method2767("X!!i$")), method2768(method2767("X!!h$")), method2768(method2767("X!!t$")), method2768(method2767("X!!n$")), method2768(method2767("X!!b$")), method2768(method2767("X!!o$")), method2768(method2767("X!!k$")), method2768(method2767("X!!c$")), method2768(method2767("X!!e$")), method2768(method2767("X!!g$")), method2768(method2767("X!!m$")), method2768(method2767("W&")), method2768(method2767("Y\"")), method2768(method2767("Y+k]^R#gP")), method2768(method2767("Y\"b")), method2768(method2767("Y+{PcV")), method2768(method2767("C\u000biB\u007f^0")), method2768(method2767("B\u000biB\u007f^0")), method2768(method2767("Y+w|C]\"|Ax")), method2768(method2767("Y+k]JR(c")), method2768(method2767("L-kPd")), method2768(method2767("O+\u007f")), method2768(method2767("Y+wse_0g")), method2768(method2767("B\tf@hW!")), method2768(method2767("Y%lOkI+zJh")), method2768(method2767("I-hLx")), method2768(method2767("X!!`$")), method2768(method2767("O!wPUt\"iWiO")), method2768(method2767("T\"iWiO\u0014jVX^*L]oW!|")), method2768(method2767("W!iP")), method2768(method2767("Y%}")), method2768(method2767("Y+k]@^\"{")), method2768(method2767("Y+w}C]\"|Ax")), method2768(method2767("S!fCdO")), method2768(method2767("C\tf@hW!")), method2768(method2767("X+cKyI0j\\x")), method2768(method2767("X!!u$")), method2768(method2767("X!!a$")), method2768(method2767("X!!j$")) };

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field5294 = -1;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Z")
    public static boolean field5296 = false;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    private int field5264;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    private int field5268;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    private int field5269;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    private int field5272;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    private int field5284;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    private int field5286;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    private int field5292;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    private int field5304;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljava/awt/Color;")
    private Color field5285;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Ljava/awt/Font;")
    private Font field5303;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field5281;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljava/awt/Image;")
    private Image field5265;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field5270;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field5271;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field5274;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field5275;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field5282;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Ljava/awt/Image;")
    private Image field5287;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field5289;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field5297;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field5302;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Z")
    private boolean field5273;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Z")
    private boolean field5278;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Z")
    private boolean field5307;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[I")
    public static int[] field5293;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Class;)Z", line = 3)
    private final boolean method2756(String arg0, int arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        try {
            int var5 = -53 / ((arg1 + 56) / 49);
            field5276++;
            Field var6 = arg3.getDeclaredField(arg0);
            return var6.getBoolean(arg2);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5308[10] + (arg0 == null ? field5308[2] : field5308[3]) + ',' + arg1 + ',' + (arg2 == null ? field5308[2] : field5308[3]) + ',' + (arg3 == null ? field5308[2] : field5308[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZB)V", line = 20)
    public final void method2362(boolean arg0, byte arg1) {
        try {
            if (!this.field5273) {
                if (class476.field7255 == null) {
                    this.field5273 = true;
                } else if (this.field5303 == null) {
                    try {
                        this.method2760(false);
                    } catch (Exception var44) {
                        this.field5273 = true;
                    }
                }
            }
            field5279++;
            if (arg1 >= -20) {
                method2765(-105);
            }
            if (this.field5273) {
                this.method2757(5);
            } else {
                Graphics var3 = class442.field6902.getGraphics();
                if (var3 == null) {
                    class442.field6902.repaint();
                } else {
                    try {
                        int var4 = class355.field5711.method4921(105);
                        String var5 = class355.field5711.method4926(-17786);
                        if (class52.field639 == null) {
                            class52.field639 = class442.field6902.createImage(class64.field881, class333.field5444);
                        }
                        Graphics var6 = class52.field639.getGraphics();
                        var6.clearRect(0, 0, class64.field881, class333.field5444);
                        int var7 = this.field5297.getWidth(null);
                        int var8 = this.field5270.getWidth(null);
                        int var9 = this.field5287.getWidth(null);
                        int var10 = this.field5297.getHeight(null);
                        int var11 = this.field5270.getHeight(null);
                        int var12 = this.field5287.getHeight(null);
                        var6.drawImage(this.field5297, this.method2759(var7, false) + this.field5284 - (this.field5264 / 2), this.method2761(var10, true) - -this.field5280, null);
                        int var13 = this.field5284 + var7 - (this.field5264 / 2);
                        int var14 = this.field5284 + (this.field5264 / 2);
                        for (int var15 = var13; var15 <= var14; var15 += var9) {
                            var6.drawImage(this.field5287, var15 + (this.method2759(var7, false) + this.field5284), this.method2761(var12, true) + this.field5280, null);
                        }
                        var6.drawImage(this.field5270, this.method2759(var8, false) + this.field5284 + (this.field5264 / 2), this.method2761(var11, true) + this.field5280, null);
                        int var16 = this.field5302.getWidth(null);
                        int var17 = this.field5302.getHeight(null);
                        int var18 = this.field5282.getWidth(null);
                        int var19 = this.field5282.getHeight(null);
                        int var20 = this.field5274.getHeight(null);
                        int var21 = this.field5289.getWidth(null);
                        int var22 = this.field5289.getHeight(null);
                        int var23 = this.field5274.getWidth(null);
                        int var24 = this.field5275.getWidth(null);
                        int var25 = this.field5265.getWidth(null);
                        int var26 = this.method2759(this.field5304, false) + this.field5272;
                        int var27 = this.method2761(this.field5292, true) + this.field5268;
                        var6.drawImage(this.field5302, var26, var27 + ((this.field5292 - var17) / 2), null);
                        var6.drawImage(this.field5282, this.field5304 + var26 - var18, (this.field5292 - var19) / 2 + var27, null);
                        if (this.field5271 == null) {
                            this.field5271 = class442.field6902.createImage(this.field5304 - var18 - var16, this.field5292);
                        }
                        Graphics var28 = this.field5271.getGraphics();
                        for (int var29 = 0; var29 < this.field5304 - var18 - var16; var29 += var21) {
                            var28.drawImage(this.field5289, var29, 0, null);
                        }
                        for (int var30 = 0; var30 < (this.field5304 - var18 - var16); var30 += var23) {
                            var28.drawImage(this.field5274, var30, this.field5292 - var20, null);
                        }
                        int var31 = (this.field5304 - var16 - var18) * var4 / 100;
                        if (var31 > 0) {
                            Image var32 = class442.field6902.createImage(var31, this.field5292 - var22 - var20);
                            int var33 = var32.getWidth(null);
                            Graphics var34 = var32.getGraphics();
                            int var35 = this.field5269 * class300.method2584((byte) 118) / 10 % var24;
                            for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                                var34.drawImage(this.field5275, var36, 0, null);
                            }
                            var28.drawImage(var32, 0, var22, null);
                        }
                        int var38 = this.field5304 - var18 - var31 - var16;
                        if (var38 > 0) {
                            Image var39 = class442.field6902.createImage(var38, this.field5292 - var20 - var22);
                            int var40 = var39.getWidth(null);
                            Graphics var41 = var39.getGraphics();
                            for (int var42 = 0; var42 < var40; var42 += var25) {
                                var41.drawImage(this.field5265, var42, 0, null);
                            }
                            var28.drawImage(var39, var31, var22, null);
                        }
                        var6.drawImage(this.field5271, var16 + var26, var27, null);
                        var6.setFont(this.field5303);
                        var6.setColor(this.field5285);
                        var6.drawString(var5, (this.field5304 - this.field5281.stringWidth(var5)) / 2 + var26, this.field5292 / 2 + this.field5286 + var27 + 4);
                        var3.drawImage(class52.field639, 0, 0, null);
                    } catch (Exception var45) {
                        this.field5273 = true;
                    }
                }
            }
        } catch (RuntimeException var46) {
            throw class590.method4333(var46, field5308[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 215)
    private final void method2757(int arg0) {
        try {
            class267.method2311(class494.field7425[class393.field6250], class355.field5711.method4926(-17786), 119, class266.field4310[class393.field6250], class428.field6750[class393.field6250], class355.field5711.method4921(arg0 + 71));
            field5277++;
            if (arg0 != 5) {
                method2764(53);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5308[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;", line = 228)
    private final Object method2758(Class arg0, String arg1, byte arg2) throws IllegalAccessException, NoSuchFieldException {
        try {
            field5305++;
            Field var4 = arg0.getDeclaredField(arg1);
            Object var5 = var4.get(class476.field7255);
            if (arg2 != 34) {
                this.method2757(125);
            }
            var4.set(class476.field7255, null);
            return var5;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5308[6] + (arg0 == null ? field5308[2] : field5308[3]) + ',' + (arg1 == null ? field5308[2] : field5308[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IZ)I", line = 244)
    private final int method2759(int arg0, boolean arg1) {
        try {
            field5290++;
            if (arg1) {
                this.method2759(-50, true);
            }
            return this.field5307 ? (class64.field881 - arg0) / 2 : 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5308[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V", line = 263)
    private final void method2760(boolean arg0) throws IllegalAccessException, NoSuchFieldException {
        try {
            field5300++;
            Class var2 = class476.field7255.getClass();
            this.field5275 = (Image) this.method2758(var2, field5308[35], (byte) 34);
            this.field5265 = (Image) this.method2758(var2, field5308[29], (byte) 34);
            this.field5302 = (Image) this.method2758(var2, field5308[34], (byte) 34);
            this.field5282 = (Image) this.method2758(var2, field5308[30], (byte) 34);
            this.field5289 = (Image) this.method2758(var2, field5308[26], (byte) 34);
            this.field5274 = (Image) this.method2758(var2, field5308[20], (byte) 34);
            this.field5297 = (Image) this.method2758(var2, field5308[36], (byte) 34);
            this.field5270 = (Image) this.method2758(var2, field5308[18], (byte) 34);
            this.field5287 = (Image) this.method2758(var2, field5308[24], (byte) 34);
            this.field5303 = (Font) this.method2758(var2, field5308[17], (byte) 34);
            this.field5281 = (FontMetrics) this.method2758(var2, field5308[19], (byte) 34);
            this.field5285 = (Color) this.method2758(var2, field5308[40], (byte) 34);
            Object var3 = this.method2758(var2, field5308[16], (byte) 34);
            Class var4 = var3.getClass();
            this.field5307 = this.method2756(field5308[39], -115, var3, var4);
            this.field5278 = this.method2756(field5308[28], -108, var3, var4);
            this.field5272 = this.method2763(var4, field5308[21], -1371436543, var3);
            this.field5268 = this.method2763(var4, field5308[22], -1371436543, var3);
            this.field5304 = this.method2763(var4, field5308[25], -1371436543, var3);
            this.field5292 = this.method2763(var4, field5308[38], -1371436543, var3);
            this.field5284 = this.method2763(var4, field5308[23], -1371436543, var3);
            this.field5280 = this.method2763(var4, field5308[37], -1371436543, var3);
            this.field5264 = this.method2763(var4, field5308[27], -1371436543, var3);
            if (!arg0) {
                this.field5286 = this.method2763(var4, field5308[32], -1371436543, var3);
                this.field5269 = this.method2763(var4, field5308[33], -1371436543, var3);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5308[31] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 303)
    public final void method2361(byte arg0) {
        try {
            if (arg0 <= 30) {
                this.field5303 = null;
            }
            field5291++;
            class393.method3191(9260);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5308[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I", line = 316)
    private final int method2761(int arg0, boolean arg1) {
        try {
            if (!arg1) {
                method2765(-3);
            }
            field5298++;
            return this.field5278 ? (class333.field5444 - arg0) / 2 : 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5308[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V", line = 334)
    public static final void method2762(int arg0, int arg1, int arg2) {
        try {
            field5306++;
            class551 var3 = class380.method3113(29, (long) arg2, 7);
            var3.method4086(72);
            var3.field8076 = arg0;
            if (arg1 != -23013) {
                method2764(77);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5308[41] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Object;)I", line = 356)
    private final int method2763(Class arg0, String arg1, int arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        try {
            field5267++;
            Field var5 = arg0.getDeclaredField(arg1);
            if (arg2 != -1371436543) {
                this.field5285 = null;
            }
            return var5.getInt(arg3);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5308[42] + (arg0 == null ? field5308[2] : field5308[3]) + ',' + (arg1 == null ? field5308[2] : field5308[3]) + ',' + arg2 + ',' + (arg3 == null ? field5308[2] : field5308[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V", line = 372)
    public static final void method2764(int arg0) {
        try {
            field5283++;
            if (arg0 != 100) {
                method2765(92);
            }
            class748.field11042.method3815((byte) 111);
            for (int var1 = 0; var1 < 32; var1++) {
                class71.field997[var1] = 0L;
            }
            for (int var2 = 0; var2 < 32; var2++) {
                class449.field6973[var2] = 0L;
            }
            class715.field10351 = 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5308[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V", line = 398)
    public static void method2765(int arg0) {
        try {
            field5293 = null;
            if (arg0 != -1116643318) {
                method2766(true, null, null);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5308[43] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 409)
    public final void method2356(int arg0) {
        try {
            int var2 = -18 / ((arg0 + 10) / 34);
            field5295++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5308[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I", line = 425)
    public final int method2357(boolean arg0) {
        try {
            if (arg0) {
                this.field5304 = 7;
            }
            field5301++;
            return 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5308[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(JI)Z", line = 440)
    public final boolean method2363(long arg0, int arg1) {
        try {
            if (arg1 == 31960) {
                field5266++;
                return true;
            } else {
                return true;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5308[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLha;Ld;)V", line = 452)
    public static final void method2766(boolean arg0, class63 arg1, class158 arg2) {
        try {
            field5288++;
            if (class770.field11258 != null) {
                if (class672.field9539 < 10) {
                    if (!class770.field11256.method592(83, class770.field11258.field451)) {
                        class672.field9539 = class40.field467.method605(class770.field11258.field451, true) / 10;
                        return;
                    }
                    class383.method3130(false);
                    class672.field9539 = 10;
                }
                if (class672.field9539 == 10) {
                    class770.field11276 = class770.field11258.field450 >> 6 << 6;
                    class770.field11270 = class770.field11258.field453 >> 6 << 6;
                    class770.field11272 = (class770.field11258.field448 >> 6 << 6) + 64 - class770.field11270;
                    class770.field11284 = (class770.field11258.field464 >> 6 << 6) + (64 - class770.field11276);
                    int[] var3 = new int[3];
                    int var4 = -1;
                    int var5 = -1;
                    if (class770.field11258.method381(-1, (class438.field6846.field9985 >> 9) + class397.field6289, class438.field6846.field9975, (class438.field6846.field9983 >> 9) + class141.field2011, var3)) {
                        var5 = var3[2] - class770.field11270;
                        var4 = var3[1] - class770.field11276;
                    }
                    if (!class76.field1099 && var4 >= 0 && var4 < class770.field11284 && var5 >= 0 && class770.field11272 > var5) {
                        int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                        int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                        class317.field5174 = var7;
                        class95.field1383 = var6;
                    } else if (class382.field6136 == -1 || class496.field7449 == -1) {
                        class770.field11258.method380((class770.field11258.field457 & 0xFFFF890) >> 14, class770.field11258.field457 & 0x3FFF, (byte) -111, var3);
                        class95.field1383 = var3[1] - class770.field11276;
                        class317.field5174 = var3[2] - class770.field11270;
                    } else {
                        class770.field11258.method380(class382.field6136, class496.field7449, (byte) -116, var3);
                        if (var3 != null) {
                            class317.field5174 = var3[2] - class770.field11270;
                            class95.field1383 = var3[1] - class770.field11276;
                        }
                        class76.field1099 = false;
                        class496.field7449 = -1;
                        class382.field6136 = -1;
                    }
                    if (class770.field11258.field465 == 37) {
                        class770.field11259 = 3.0F;
                        class770.field11265 = 3.0F;
                    } else if (class770.field11258.field465 == 50) {
                        class770.field11259 = 4.0F;
                        class770.field11265 = 4.0F;
                    } else if (class770.field11258.field465 == 75) {
                        class770.field11259 = 6.0F;
                        class770.field11265 = 6.0F;
                    } else if (class770.field11258.field465 == 100) {
                        class770.field11259 = 8.0F;
                        class770.field11265 = 8.0F;
                    } else if (class770.field11258.field465 == 200) {
                        class770.field11259 = 16.0F;
                        class770.field11265 = 16.0F;
                    } else {
                        class770.field11259 = 8.0F;
                        class770.field11265 = 8.0F;
                    }
                    class770.field11268 = (int) class770.field11259 >> 1;
                    class770.field11264 = class438.method3441(class770.field11268, (byte) 127);
                    class130.method1239((byte) -86);
                    class770.method5546();
                    class728.field10663 = new class398();
                    class770.field11261 += (int) (Math.random() * 5.0D) - 2;
                    if (class770.field11261 < -8) {
                        class770.field11261 = -8;
                    }
                    class770.field11263 += (int) (Math.random() * 5.0D) - 2;
                    if (class770.field11261 > 8) {
                        class770.field11261 = 8;
                    }
                    if (class770.field11263 < -16) {
                        class770.field11263 = -16;
                    }
                    if (class770.field11263 > 16) {
                        class770.field11263 = 16;
                    }
                    class770.method5545(arg2, class770.field11261 >> 2 << 10, class770.field11263 >> 1);
                    class770.field11257.method2327(256, 1024, 124);
                    class770.field11254.method3729(256, false, 256);
                    class770.field11255.method3997(500, 4096);
                    class581.field8375.method719(256, (byte) 19);
                    class672.field9539 = 20;
                } else if (class672.field9539 == 20) {
                    class290.method2447(123, true);
                    class770.method5555(arg1, class770.field11261, class770.field11263);
                    class672.field9539 = 60;
                    class290.method2447(118, true);
                    method2764(100);
                } else if (class672.field9539 == 60) {
                    if (class770.field11256.method593(-151, class770.field11258.field451 + field5308[4])) {
                        if (!class770.field11256.method592(-127, class770.field11258.field451 + field5308[4])) {
                            return;
                        }
                        class770.field11267 = class472.method3627(19521, class770.field11256, class115.field1686, class770.field11258.field451 + field5308[4]);
                    } else {
                        class770.field11267 = new class591(0);
                    }
                    class770.method5538();
                    class672.field9539 = 70;
                    class290.method2447(90, true);
                    method2764(100);
                } else if (class672.field9539 == 70) {
                    class696.field10030 = new class205(arg1, 11, true, class442.field6902);
                    class672.field9539 = 73;
                    class290.method2447(73, true);
                    method2764(100);
                } else if (class672.field9539 == 73) {
                    class634.field9105 = new class205(arg1, 12, true, class442.field6902);
                    class672.field9539 = 76;
                    class290.method2447(108, true);
                    method2764(100);
                } else if (class672.field9539 == 76) {
                    class628.field9045 = new class205(arg1, 14, true, class442.field6902);
                    class672.field9539 = 79;
                    class290.method2447(117, true);
                    method2764(100);
                } else if (class672.field9539 == 79) {
                    class618.field8929 = new class205(arg1, 17, true, class442.field6902);
                    class672.field9539 = 82;
                    class290.method2447(99, true);
                    method2764(100);
                } else if (class672.field9539 == 82) {
                    class197.field3135 = new class205(arg1, 19, true, class442.field6902);
                    class672.field9539 = 85;
                    class290.method2447(56, true);
                    method2764(100);
                } else if (class672.field9539 == 85) {
                    class499.field7486 = new class205(arg1, 22, true, class442.field6902);
                    class672.field9539 = 88;
                    class290.method2447(112, true);
                    method2764(100);
                } else if (class672.field9539 == 88) {
                    class786.field11498 = new class205(arg1, 26, true, class442.field6902);
                    class672.field9539 = 91;
                    class290.method2447(113, true);
                    method2764(100);
                } else {
                    class328.field5385 = new class205(arg1, 30, arg0, class442.field6902);
                    class672.field9539 = 100;
                    class290.method2447(81, true);
                    method2764(100);
                    System.gc();
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5308[5] + arg0 + ',' + (arg1 == null ? field5308[2] : field5308[3]) + ',' + (arg2 == null ? field5308[2] : field5308[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I", line = 682)
    public final int method2358(int arg0) {
        try {
            field5299++;
            if (arg0 <= 36) {
                method2762(-34, 117, -41);
            }
            return 100;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5308[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2767(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xC);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2768(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
