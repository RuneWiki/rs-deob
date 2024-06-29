import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class571 implements class143 {

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "[J")
    public static long[] field7239 = new long[32];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    private int field7229;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    private int field7231;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    private int field7244;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    private int field7246;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    private int field7250;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    private int field7258;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/awt/Color;")
    private Color field7227;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Ljava/awt/Font;")
    private Font field7248;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field7251;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field7232;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field7233;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field7241;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field7243;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field7247;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field7249;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field7254;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "Ljava/awt/Image;")
    private Image field7255;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field7256;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field7257;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Z")
    private boolean field7252;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I", line = 5)
    public final int method905(int arg0) {
        if (arg0 != -15038) {
            this.field7233 = null;
        }
        field7253++;
        return 100;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 20)
    public final void method901(boolean arg0) {
        if (!arg0) {
            this.method3023(-28);
        }
        field7236++;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 34)
    private final void method3023(int arg0) {
        field7234++;
        if (arg0 == -8088) {
            class594.method3284(class185.field2182.method2425((byte) 89), class424.field5369[class130.field1573], class3.field25[class130.field1573], class185.field2182.method2429((byte) -64), class334.field4137[class130.field1573], 301);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZILpfa;I)V", line = 47)
    public static final void method3024(int arg0, int arg1, boolean arg2, int arg3, class275 arg4, int arg5) {
        class60.field757 = arg3;
        class334.field4134 = arg4;
        class618.field8381 = arg0;
        if (arg5 != -144) {
            return;
        }
        class76.field1000 = 1;
        class15.field150 = arg2;
        class662.field8973 = 10000;
        field7240++;
        class687.field9410 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I", line = 68)
    public final int method904(int arg0) {
        field7226++;
        if (arg0 != -26721) {
            this.field7233 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V", line = 87)
    public static final void method3025(byte arg0) {
        if (arg0 != 84) {
            return;
        }
        field7230++;
        for (class232 var1 = (class232) class659.field8945.method1909(true); var1 != null; var1 = (class232) class659.field8945.method1916((byte) 118)) {
            class487 var2 = var1.field3012;
            if (var2.field6083 < class665.field9027) {
                var1.method1566(arg0 ^ 0xFFFFFFF3);
                var2.method2644(121);
            } else if (class665.field9027 >= var2.field6059) {
                if (var2.field6065 > 0) {
                    class704 var3 = (class704) class168.field1973.method3828((long) (var2.field6065 - 1), (byte) -91);
                    if (var3 != null) {
                        class506 var4 = var3.field9854;
                        if (var4.field8018 >= 0 && var4.field8018 < (class85.field1090 * 512) && var4.field8011 >= 0 && class656.field8932 * 512 > var4.field8011) {
                            var2.method2645(var4.field8011, class665.field9027, false, class514.method2798(var4.field8011, var4.field8018, var2.field8010, (byte) 51) - var2.field6057, var4.field8018);
                        }
                    }
                }
                if (var2.field6065 < 0) {
                    int var5 = -var2.field6065 - 1;
                    class365 var6;
                    if (class350.field4523 == var5) {
                        var6 = class67.field815;
                    } else {
                        var6 = class132.field1601[var5];
                    }
                    if (var6 != null && var6.field8018 >= 0 && (class85.field1090 * 512) > var6.field8018 && var6.field8011 >= 0 && var6.field8011 < class656.field8932 * 512) {
                        var2.method2645(var6.field8011, class665.field9027, false, class514.method2798(var6.field8011, var6.field8018, var2.field8010, (byte) 52) - var2.field6057, var6.field8018);
                    }
                }
                var2.method2648(class231.field3008, -1);
                class223.method1332(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Ljava/lang/Object;", line = 150)
    private final Object method3026(String arg0, Class arg1, boolean arg2) throws IllegalAccessException, NoSuchFieldException {
        if (arg2) {
            this.field7232 = null;
        }
        field7228++;
        Field var4 = arg1.getDeclaredField(arg0);
        Object var5 = var4.get(class95.field1241);
        var4.set(class95.field1241, null);
        return var5;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V", line = 167)
    public static void method3027(boolean arg0) {
        field7239 = null;
        if (arg0) {
            field7239 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 178)
    private final void method3028(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field7242++;
        Class var2 = class95.field1241.getClass();
        this.field7249 = (Image) this.method3026("bar", var2, false);
        this.field7255 = (Image) this.method3026("background", var2, false);
        this.field7254 = (Image) this.method3026("left", var2, false);
        this.field7256 = (Image) this.method3026("right", var2, false);
        this.field7257 = (Image) this.method3026("top", var2, false);
        this.field7247 = (Image) this.method3026("bottom", var2, false);
        this.field7243 = (Image) this.method3026("bodyLeft", var2, false);
        this.field7232 = (Image) this.method3026("bodyRight", var2, false);
        this.field7241 = (Image) this.method3026("bodyFill", var2, false);
        this.field7248 = (Font) this.method3026("bf", var2, false);
        this.field7251 = (FontMetrics) this.method3026("bfm", var2, false);
        this.field7227 = (Color) this.method3026("colourtext", var2, false);
        Object var3 = this.method3026("lb", var2, false);
        int var4 = 23 % ((arg0 + 60) / 55);
        Class var5 = var3.getClass();
        this.field7229 = this.method3030(1337, var3, "xOffset", var5);
        this.field7244 = this.method3030(1337, var3, "yOffset", var5);
        this.field7258 = this.method3030(1337, var3, "width", var5);
        this.field7250 = this.method3030(1337, var3, "height", var5);
        this.field7246 = this.method3030(1337, var3, "textYOffset", var5);
        this.field7231 = this.method3030(1337, var3, "offsetPerTenCycles", var5);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V", line = 211)
    public static final void method3029(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class611.field8310.field8684 * arg3 >> 8;
        if (arg2 <= 4) {
            field7239 = null;
        }
        field7237++;
        if (arg0 == -1 && !class89.field1160) {
            class213.method1244((byte) 94);
        } else if (arg0 != -1 && (class640.field8675 != arg0 || !class534.method2877(true)) && var4 != 0 && !class89.field1160) {
            class352.method2023(class353.field4567, 121, var4, 0, arg0, arg1, false);
        }
        class640.field8675 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)I", line = 241)
    private final int method3030(int arg0, Object arg1, String arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 != 1337) {
            this.field7232 = null;
        }
        field7245++;
        Field var5 = arg3.getDeclaredField(arg2);
        return var5.getInt(arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)Z", line = 254)
    public final boolean method902(long arg0, int arg1) {
        field7225++;
        return arg1 < 125 ? true : true;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 265)
    public final void method903(byte arg0) {
        class81.method621(0);
        field7238++;
        if (arg0 != 67) {
            this.field7249 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZ)V", line = 279)
    public final void method900(boolean arg0, boolean arg1) {
        if (!this.field7252) {
            if (class95.field1241 == null) {
                this.field7252 = true;
            } else if (this.field7248 == null) {
                try {
                    this.method3028(35);
                } catch (Exception var41) {
                    this.field7252 = true;
                }
            }
        }
        field7235++;
        if (this.field7252) {
            this.method3023(-8088);
            return;
        }
        Graphics var3 = class472.field5828.getGraphics();
        if (!arg1) {
            this.field7250 = 39;
        }
        if (var3 == null) {
            class472.field5828.repaint();
            return;
        }
        try {
            int var4 = class185.field2182.method2425((byte) 83);
            String var5 = class185.field2182.method2429((byte) -74);
            if (class210.field2486 == null) {
                class210.field2486 = class472.field5828.createImage(class309.field3890, class491.field6129);
            }
            Graphics var6 = class210.field2486.getGraphics();
            int var7 = this.field7243.getWidth(null);
            int var8 = this.field7232.getWidth(null);
            int var9 = this.field7241.getWidth(null);
            int var10 = this.field7243.getHeight(null);
            int var11 = this.field7232.getHeight(null);
            int var12 = this.field7241.getHeight(null);
            var6.drawImage(this.field7243, (class309.field3890 - var7) / 2 - 161, (-var10 + class491.field6129) / 2 - -214, null);
            for (int var13 = -144; var13 <= 144; var13 += 32) {
                var6.drawImage(this.field7241, (class309.field3890 - var9) / 2 - var13, (-var12 + class491.field6129) / 2 + 214, null);
            }
            var6.drawImage(this.field7232, (class309.field3890 - var8) / 2 + 161, (-var11 + class491.field6129) / 2 + 214, null);
            int var14 = this.field7254.getWidth(null);
            int var15 = this.field7254.getHeight(null);
            int var16 = this.field7256.getWidth(null);
            int var17 = this.field7256.getHeight(null);
            int var18 = this.field7247.getHeight(null);
            int var19 = this.field7257.getWidth(null);
            int var20 = this.field7257.getHeight(null);
            int var21 = this.field7247.getWidth(null);
            int var22 = this.field7249.getWidth(null);
            int var23 = this.field7255.getWidth(null);
            int var24 = (class309.field3890 - this.field7258) / 2 + this.field7229;
            int var25 = (class491.field6129 - this.field7250) / 2 + this.field7244;
            var6.drawImage(this.field7254, var24, (this.field7250 - var15) / 2 + var25, null);
            var6.drawImage(this.field7256, this.field7258 + var24 - var16, (this.field7250 - var17) / 2 + var25, null);
            if (this.field7233 == null) {
                this.field7233 = class472.field5828.createImage(this.field7258 - var14 - var16, this.field7250);
            }
            Graphics var26 = this.field7233.getGraphics();
            for (int var27 = 0; var27 < this.field7258 - var14 - var16; var27 += var19) {
                var26.drawImage(this.field7257, var27, 0, null);
            }
            for (int var28 = 0; var28 < this.field7258 - var14 - var16; var28 += var21) {
                var26.drawImage(this.field7247, var28, this.field7250 - var18, null);
            }
            int var29 = (this.field7258 - var14 - var16) * var4 / 100;
            if (var29 > 0) {
                Image var30 = class472.field5828.createImage(var29, this.field7250 - var18 - var20);
                int var31 = var30.getWidth(null);
                Graphics var32 = var30.getGraphics();
                int var33 = this.field7231 * class637.method3565(-3452) / 10 % var22;
                for (int var34 = var33 - var22; var34 < var31; var34 += var22) {
                    var32.drawImage(this.field7249, var34, 0, null);
                }
                var26.drawImage(var30, 0, var20, null);
            }
            int var36 = this.field7258 - var14 - var16 - var29;
            if (var36 > 0) {
                Image var37 = class472.field5828.createImage(var36, this.field7250 - var18 - var20);
                int var38 = var37.getWidth(null);
                Graphics var39 = var37.getGraphics();
                for (int var40 = 0; var40 < var38; var40 += var23) {
                    var39.drawImage(this.field7255, var40, 0, null);
                }
                var26.drawImage(var37, var29, var20, null);
            }
            var6.drawImage(this.field7233, var14 + var24, var25, null);
            var6.setFont(this.field7248);
            var6.setColor(this.field7227);
            var6.drawString(var5, (this.field7258 - this.field7251.stringWidth(var5)) / 2 + var24, this.field7250 / 2 + 4 + this.field7246 + var25);
            var3.drawImage(class210.field2486, 0, 0, null);
        } catch (Exception var42) {
            this.field7252 = true;
        }
    }
}
