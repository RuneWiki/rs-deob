import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class329 implements class126 {

    @OriginalMember(owner = "client!hfa", name = "r", descriptor = "Lvg;")
    public static class622 field4764 = new class622(46, -2);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
    private int field4755;

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
    private int field4758;

    @OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!hfa", name = "n", descriptor = "I")
    private int field4760;

    @OriginalMember(owner = "client!hfa", name = "o", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!hfa", name = "p", descriptor = "I")
    private int field4762;

    @OriginalMember(owner = "client!hfa", name = "q", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!hfa", name = "t", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!hfa", name = "u", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!hfa", name = "v", descriptor = "I")
    private int field4768;

    @OriginalMember(owner = "client!hfa", name = "w", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!hfa", name = "x", descriptor = "I")
    private int field4770;

    @OriginalMember(owner = "client!hfa", name = "y", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!hfa", name = "A", descriptor = "I")
    private int field4773;

    @OriginalMember(owner = "client!hfa", name = "B", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!hfa", name = "D", descriptor = "I")
    private int field4775;

    @OriginalMember(owner = "client!hfa", name = "F", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!hfa", name = "I", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!hfa", name = "N", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!hfa", name = "P", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!hfa", name = "Q", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!hfa", name = "R", descriptor = "I")
    private int field4789;

    @OriginalMember(owner = "client!hfa", name = "H", descriptor = "Lrs;")
    public static class649 field4779;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Ljava/awt/Color;")
    private Color field4750;

    @OriginalMember(owner = "client!hfa", name = "s", descriptor = "Ljava/awt/Font;")
    private Font field4765;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field4749;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Ljava/awt/Image;")
    private Image field4748;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field4751;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field4753;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field4754;

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field4757;

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field4772;

    @OriginalMember(owner = "client!hfa", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field4782;

    @OriginalMember(owner = "client!hfa", name = "L", descriptor = "Ljava/awt/Image;")
    private Image field4783;

    @OriginalMember(owner = "client!hfa", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field4784;

    @OriginalMember(owner = "client!hfa", name = "O", descriptor = "Ljava/awt/Image;")
    private Image field4786;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hfa", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4790;

    @OriginalMember(owner = "client!hfa", name = "E", descriptor = "Z")
    private boolean field4776;

    @OriginalMember(owner = "client!hfa", name = "G", descriptor = "Z")
    private boolean field4778;

    @OriginalMember(owner = "client!hfa", name = "J", descriptor = "Z")
    private boolean field4781;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V")
    private final void method2025(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field4780++;
        Class var2 = class551.field8116.getClass();
        this.field4772 = (Image) this.method2029((byte) 120, var2, "bar");
        this.field4784 = (Image) this.method2029((byte) 120, var2, "background");
        this.field4757 = (Image) this.method2029((byte) 120, var2, "left");
        this.field4751 = (Image) this.method2029((byte) 120, var2, "right");
        this.field4783 = (Image) this.method2029((byte) 120, var2, "top");
        this.field4748 = (Image) this.method2029((byte) 120, var2, "bottom");
        this.field4786 = (Image) this.method2029((byte) 120, var2, "bodyLeft");
        this.field4782 = (Image) this.method2029((byte) 120, var2, "bodyRight");
        this.field4753 = (Image) this.method2029((byte) 120, var2, "bodyFill");
        this.field4765 = (Font) this.method2029((byte) 120, var2, "bf");
        this.field4749 = (FontMetrics) this.method2029((byte) 120, var2, "bfm");
        this.field4750 = (Color) this.method2029((byte) 120, var2, "colourtext");
        Object var3 = this.method2029((byte) 120, var2, "lb");
        Class var4 = var3.getClass();
        this.field4781 = this.method2036((byte) -44, var4, "xMiddle", var3);
        this.field4778 = this.method2036((byte) -44, var4, "yMiddle", var3);
        if (arg0 != 10) {
            this.field4751 = null;
        }
        this.field4773 = this.method2031(var3, "xOffset", 126, var4);
        this.field4775 = this.method2031(var3, "yOffset", 117, var4);
        this.field4768 = this.method2031(var3, "width", arg0 + 116, var4);
        this.field4770 = this.method2031(var3, "height", 126, var4);
        this.field4760 = this.method2031(var3, "boxXOffset", arg0 + 113, var4);
        this.field4755 = this.method2031(var3, "boxYOffset", 120, var4);
        this.field4758 = this.method2031(var3, "boxWidth", arg0 ^ 0x7C, var4);
        this.field4789 = this.method2031(var3, "textYOffset", 118, var4);
        this.field4762 = this.method2031(var3, "offsetPerTenCycles", 120, var4);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)I")
    public final int method900(byte arg0) {
        field4759++;
        int var2 = 123 / ((-arg0 - 69) / 48);
        return 100;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I")
    public final int method903(int arg0) {
        if (arg0 == 32342) {
            field4766++;
            return 0;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(B)V")
    public static void method2026(byte arg0) {
        field4764 = null;
        field4779 = null;
        if (arg0 <= 19) {
            method2026((byte) 122);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(B)V")
    public final void method902(byte arg0) {
        int var2 = 94 % ((arg0 - 37) / 38);
        field4752++;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILgk;)Lsm;")
    public static final class96 method2027(int arg0, class540 arg1) {
        field4774++;
        if (arg0 != 29115) {
            return null;
        }
        String var2 = arg1.method3145((byte) -121);
        class545 var3 = class9.method64((byte) -116)[arg1.method3115(arg0 ^ 0x514)];
        class305 var4 = class62.method384(true)[arg1.method3115(29871)];
        int var5 = arg1.method3129(arg0 - 29030);
        int var6 = arg1.method3129(108);
        int var7 = arg1.method3115(29871);
        int var8 = arg1.method3115(29871);
        int var9 = arg1.method3115(29871);
        int var10 = arg1.method3169(26488);
        int var11 = arg1.method3169(26488);
        int var12 = arg1.method3160(false);
        int var13 = arg1.method3160(false);
        int var14 = arg1.method3160(false);
        return new class96(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)I")
    private final int method2028(int arg0, int arg1) {
        field4763++;
        if (arg0 < 42) {
            this.field4773 = -18;
        }
        return this.field4778 ? (class425.field6218 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;")
    private final Object method2029(byte arg0, Class arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        field4771++;
        Field var4 = arg1.getDeclaredField(arg2);
        Object var5 = var4.get(class551.field8116);
        var4.set(class551.field8116, null);
        if (arg0 != 120) {
            method2032();
        }
        return var5;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
    public final void method905(boolean arg0) {
        field4767++;
        class679.method3815((byte) -119);
        if (!arg0) {
            this.method2030(-9, -118);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(II)I")
    private final int method2030(int arg0, int arg1) {
        field4777++;
        if (arg1 != 1033) {
            this.method2028(-94, -2);
        }
        return this.field4781 ? (class454.field6538 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Class;)I")
    private final int method2031(Object arg0, String arg1, int arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg2 <= 116) {
            return -106;
        } else {
            field4756++;
            Field var5 = arg3.getDeclaredField(arg1);
            return var5.getInt(arg0);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "()V")
    public static final void method2032() {
        for (int var0 = 0; var0 < class291.field4276; var0++) {
            if (!class638.field9172[var0]) {
                class471 var1 = class324.field4707[var0];
                class334 var2 = var1.field6773;
                int var3 = var1.field6775;
                int var4 = var2.method2051(-520326527) - class41.field615;
                int var5 = (var4 * 2 >> class125.field1831) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2050((byte) -30) - var4 >> class125.field1831;
                int var9 = var2.method2046(true) - var4 >> class125.field1831;
                int var10 = var2.method2046(true) + var4 >> class125.field1831;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class575.field8372) {
                    var10 = class575.field8372 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field6767[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class91.field1390) {
                        var16 = class91.field1390 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class293 var19 = class434.method2583(var3, var17, var11, field4790 == null ? (field4790 = method2037("wo")) : field4790);
                        if (var19 != null && var19.field4302 != 0) {
                            if (var19.field4302 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6767[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6767[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field6767[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6767[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class638.field9172[var0] = true;
                class178.field2480[var3].method2185(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZZ)V")
    public final void method901(boolean arg0, boolean arg1) {
        field4769++;
        if (!this.field4776) {
            if (class551.field8116 == null) {
                this.field4776 = true;
            } else if (this.field4765 == null) {
                try {
                    this.method2025(10);
                } catch (Exception var43) {
                    this.field4776 = true;
                }
            }
        }
        if (!arg1) {
            this.field4782 = null;
        }
        if (this.field4776) {
            this.method2033((byte) 102);
            return;
        }
        Graphics var3 = class410.field6110.getGraphics();
        if (var3 == null) {
            class410.field6110.repaint();
            return;
        }
        try {
            int var4 = class199.field2714.method3312(true);
            String var5 = class199.field2714.method3310((byte) -74);
            if (class79.field1284 == null) {
                class79.field1284 = class410.field6110.createImage(class454.field6538, class425.field6218);
            }
            Graphics var6 = class79.field1284.getGraphics();
            int var7 = this.field4786.getWidth(null);
            int var8 = this.field4782.getWidth(null);
            int var9 = this.field4753.getWidth(null);
            int var10 = this.field4786.getHeight(null);
            int var11 = this.field4782.getHeight(null);
            int var12 = this.field4753.getHeight(null);
            var6.drawImage(this.field4786, this.method2030(var7, 1033) + (this.field4760 - this.field4758 / 2), this.method2028(121, var10) + this.field4755, null);
            int var13 = this.field4760 + var7 - this.field4758 / 2;
            int var14 = this.field4758 / 2 + this.field4760;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field4753, var15 + this.method2030(var7, 1033) + this.field4760, this.method2028(83, var12) - -this.field4755, null);
            }
            var6.drawImage(this.field4782, this.method2030(var8, 1033) - (-(this.field4758 / 2) - this.field4760), this.method2028(94, var11) - -this.field4755, null);
            int var16 = this.field4757.getWidth(null);
            int var17 = this.field4757.getHeight(null);
            int var18 = this.field4751.getWidth(null);
            int var19 = this.field4751.getHeight(null);
            int var20 = this.field4748.getHeight(null);
            int var21 = this.field4783.getWidth(null);
            int var22 = this.field4783.getHeight(null);
            int var23 = this.field4748.getWidth(null);
            int var24 = this.field4772.getWidth(null);
            int var25 = this.field4784.getWidth(null);
            int var26 = this.method2030(this.field4768, 1033) + this.field4773;
            int var27 = this.method2028(88, this.field4770) + this.field4775;
            var6.drawImage(this.field4757, var26, (this.field4770 - var17) / 2 + var27, null);
            var6.drawImage(this.field4751, this.field4768 + var26 - var18, (-var19 + this.field4770) / 2 + var27, null);
            if (this.field4754 == null) {
                this.field4754 = class410.field6110.createImage(this.field4768 - var16 - var18, this.field4770);
            }
            Graphics var28 = this.field4754.getGraphics();
            for (int var29 = 0; var29 < this.field4768 - var18 - var16; var29 += var21) {
                var28.drawImage(this.field4783, var29, 0, null);
            }
            for (int var30 = 0; var30 < this.field4768 - var16 - var18; var30 += var23) {
                var28.drawImage(this.field4748, var30, this.field4770 - var20, null);
            }
            int var31 = (this.field4768 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class410.field6110.createImage(var31, this.field4770 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field4762 * class194.method1259(89) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field4772, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field4768 - var16 - var31 - var18;
            if (var38 > 0) {
                Image var39 = class410.field6110.createImage(var38, this.field4770 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field4784, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field4754, var26 + var16, var27, null);
            var6.setFont(this.field4765);
            var6.setColor(this.field4750);
            var6.drawString(var5, (this.field4768 - this.field4749.stringWidth(var5)) / 2 + var26, var27 + 4 - (-(this.field4770 / 2) + -this.field4789));
            var3.drawImage(class79.field1284, 0, 0, null);
        } catch (Exception var44) {
            this.field4776 = true;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "(B)V")
    private final void method2033(byte arg0) {
        if (arg0 > 59) {
            class142.method994(class199.field2714.method3310((byte) -128), class29.field498[class2.field18], (byte) -105, class580.field8448[class2.field18], class199.field2714.method3312(true), class436.field6359[class2.field18]);
            field4788++;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIZ)I")
    public static final int method2034(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return 98;
        }
        field4747++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZJ)Z")
    public final boolean method904(boolean arg0, long arg1) {
        field4787++;
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2035(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2034(-28, -72, false);
        }
        field4761++;
        return class338.method2092(-16, arg1, arg2) & class675.method3789(arg2, 28, arg1);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z")
    private final boolean method2036(byte arg0, Class arg1, String arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field4785++;
        if (arg0 != -44) {
            this.field4768 = -16;
        }
        Field var5 = arg1.getDeclaredField(arg2);
        return var5.getBoolean(arg3);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2037(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
