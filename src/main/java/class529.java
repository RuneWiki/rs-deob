import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class529 implements class26 {

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
    public static boolean field7258 = false;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "Z")
    public static boolean field7284 = false;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    private int field7256;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    private int field7260;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    private int field7262;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    private int field7264;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    private int field7273;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    private int field7274;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    private int field7282;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    private int field7285;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    private int field7292;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "Ljava/awt/Color;")
    private Color field7298;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "Ljava/awt/Font;")
    private Font field7281;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field7288;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Ljava/awt/Image;")
    private Image field7257;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field7261;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field7272;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field7275;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field7277;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field7278;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field7279;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field7290;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field7294;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "Ljava/awt/Image;")
    private Image field7297;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "Z")
    private boolean field7268;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Z")
    private boolean field7283;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "Z")
    private boolean field7293;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 6)
    private final void method3139(byte arg0) {
        field7266++;
        class680.method3865(client.field1309[class391.field5566], class409.field5750.method959(1), (byte) 99, class524.field7212[class391.field5566], class409.field5750.method969(0), class751.field10368[class391.field5566]);
        if (arg0 > -88) {
            method3148(-39);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Z", line = 18)
    public static final boolean method3140(int arg0, int arg1) {
        field7271++;
        if (arg0 == -31534) {
            return arg1 == 20 || arg1 == 22 || arg1 == 1008 || arg1 == 57 || arg1 == 11;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/lang/Class;Ljava/lang/String;)I", line = 30)
    private final int method3141(Object arg0, boolean arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        if (!arg1) {
            this.method3146(-48, (byte) 9);
        }
        field7287++;
        Field var5 = arg2.getDeclaredField(arg3);
        return var5.getInt(arg0);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfea;I)Z", line = 43)
    public static final boolean method3142(class678 arg0, int arg1) {
        if (arg1 == 2) {
            field7267++;
            return class126.field1636 == arg0 || class273.field3939 == arg0 || class645.field9029 == arg0 || class243.field3602 == arg0 || class726.field10051 == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 57)
    public final void method109(int arg0) {
        class10.method26(false);
        if (arg0 > -103) {
            this.field7268 = false;
        }
        field7280++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;", line = 72)
    private final Object method3143(Class arg0, String arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        field7259++;
        int var4 = -28 / ((55 - arg2) / 60);
        Field var5 = arg0.getDeclaredField(arg1);
        Object var6 = var5.get(class511.field7007);
        var5.set(class511.field7007, null);
        return var6;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)I", line = 91)
    private final int method3144(byte arg0, int arg1) {
        field7289++;
        if (this.field7293) {
            return (class742.field10226 - arg1) / 2;
        } else {
            if (arg0 > -46) {
                this.method110((byte) -118, 64L);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)I", line = 120)
    public final int method111(int arg0) {
        field7263++;
        if (arg0 >= -67) {
            this.field7268 = true;
        }
        return 0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Class;)Z", line = 132)
    private final boolean method3145(String arg0, Object arg1, int arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg2 < 116) {
            return true;
        } else {
            field7276++;
            Field var5 = arg3.getDeclaredField(arg0);
            return var5.getBoolean(arg1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V", line = 145)
    public final void method114(boolean arg0, int arg1) {
        if (arg1 != 30453) {
            return;
        }
        if (!this.field7268) {
            if (class511.field7007 == null) {
                this.field7268 = true;
            } else if (this.field7281 == null) {
                try {
                    this.method3147(false);
                } catch (Exception var43) {
                    this.field7268 = true;
                }
            }
        }
        field7269++;
        if (this.field7268) {
            this.method3139((byte) -120);
            return;
        }
        Graphics var3 = class749.field10341.getGraphics();
        if (var3 == null) {
            class749.field10341.repaint();
            return;
        }
        try {
            int var4 = class409.field5750.method969(arg1 ^ 0x76F5);
            String var5 = class409.field5750.method959(1);
            if (class58.field674 == null) {
                class58.field674 = class749.field10341.createImage(class742.field10226, class249.field3700);
            }
            Graphics var6 = class58.field674.getGraphics();
            var6.clearRect(0, 0, class742.field10226, class249.field3700);
            int var7 = this.field7277.getWidth(null);
            int var8 = this.field7290.getWidth(null);
            int var9 = this.field7279.getWidth(null);
            int var10 = this.field7277.getHeight(null);
            int var11 = this.field7290.getHeight(null);
            int var12 = this.field7279.getHeight(null);
            var6.drawImage(this.field7277, this.method3144((byte) -54, var7) + (this.field7260 - this.field7264 / 2), this.method3146(var10, (byte) -63) + this.field7274, null);
            int var13 = this.field7260 - (this.field7264 / 2 - var7);
            int var14 = this.field7264 / 2 + this.field7260;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field7279, var15 + this.method3144((byte) -53, var7) + this.field7260, this.method3146(var12, (byte) -41) - -this.field7274, null);
            }
            var6.drawImage(this.field7290, this.method3144((byte) -120, var8) + this.field7260 + this.field7264 / 2, this.method3146(var11, (byte) -70) + this.field7274, null);
            int var16 = this.field7294.getWidth(null);
            int var17 = this.field7294.getHeight(null);
            int var18 = this.field7272.getWidth(null);
            int var19 = this.field7272.getHeight(null);
            int var20 = this.field7275.getHeight(null);
            int var21 = this.field7278.getWidth(null);
            int var22 = this.field7278.getHeight(null);
            int var23 = this.field7275.getWidth(null);
            int var24 = this.field7297.getWidth(null);
            int var25 = this.field7261.getWidth(null);
            int var26 = this.method3144((byte) -127, this.field7285) + this.field7273;
            int var27 = this.method3146(this.field7282, (byte) -52) + this.field7262;
            var6.drawImage(this.field7294, var26, var27 + ((this.field7282 - var17) / 2), null);
            var6.drawImage(this.field7272, this.field7285 + var26 - var18, var27 - -((this.field7282 - var19) / 2), null);
            if (this.field7257 == null) {
                this.field7257 = class749.field10341.createImage(this.field7285 - var18 - var16, this.field7282);
            }
            Graphics var28 = this.field7257.getGraphics();
            for (int var29 = 0; var29 < this.field7285 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field7278, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field7285 - var16 - var18); var30 += var23) {
                var28.drawImage(this.field7275, var30, this.field7282 - var20, null);
            }
            int var31 = (this.field7285 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class749.field10341.createImage(var31, this.field7282 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field7256 * class248.method1674((byte) -101) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field7297, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field7285 - var31 - var16 - var18;
            if (var38 > 0) {
                Image var39 = class749.field10341.createImage(var38, this.field7282 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field7261, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field7257, var16 + var26, var27, null);
            var6.setFont(this.field7281);
            var6.setColor(this.field7298);
            var6.drawString(var5, (this.field7285 - this.field7288.stringWidth(var5)) / 2 + var26, this.field7282 / 2 + var27 - -4 + this.field7292);
            var3.drawImage(class58.field674, 0, 0, null);
        } catch (Exception var44) {
            this.field7268 = true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BJ)Z", line = 342)
    public final boolean method110(byte arg0, long arg1) {
        field7286++;
        int var4 = 27 / ((arg0 - 71) / 42);
        return true;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V", line = 359)
    public final void method112(boolean arg0) {
        field7291++;
        if (arg0) {
            this.field7292 = 54;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)I", line = 369)
    private final int method3146(int arg0, byte arg1) {
        field7270++;
        if (this.field7283) {
            return (class249.field3700 - arg0) / 2;
        } else {
            if (arg1 >= -21) {
                this.field7262 = -16;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V", line = 386)
    private final void method3147(boolean arg0) throws IllegalAccessException, NoSuchFieldException {
        field7296++;
        Class var2 = class511.field7007.getClass();
        this.field7297 = (Image) this.method3143(var2, "bar", -40);
        this.field7261 = (Image) this.method3143(var2, "background", -111);
        this.field7294 = (Image) this.method3143(var2, "left", -21);
        this.field7272 = (Image) this.method3143(var2, "right", 117);
        this.field7278 = (Image) this.method3143(var2, "top", -57);
        this.field7275 = (Image) this.method3143(var2, "bottom", -36);
        if (arg0) {
            return;
        }
        this.field7277 = (Image) this.method3143(var2, "bodyLeft", -19);
        this.field7290 = (Image) this.method3143(var2, "bodyRight", 126);
        this.field7279 = (Image) this.method3143(var2, "bodyFill", -121);
        this.field7281 = (Font) this.method3143(var2, "bf", -27);
        this.field7288 = (FontMetrics) this.method3143(var2, "bfm", 120);
        this.field7298 = (Color) this.method3143(var2, "colourtext", 124);
        Object var3 = this.method3143(var2, "lb", -88);
        Class var4 = var3.getClass();
        this.field7293 = this.method3145("xMiddle", var3, 117, var4);
        this.field7283 = this.method3145("yMiddle", var3, 120, var4);
        this.field7273 = this.method3141(var3, true, var4, "xOffset");
        this.field7262 = this.method3141(var3, !arg0, var4, "yOffset");
        this.field7285 = this.method3141(var3, true, var4, "width");
        this.field7282 = this.method3141(var3, true, var4, "height");
        this.field7260 = this.method3141(var3, true, var4, "boxXOffset");
        this.field7274 = this.method3141(var3, true, var4, "boxYOffset");
        this.field7264 = this.method3141(var3, true, var4, "boxWidth");
        this.field7292 = this.method3141(var3, !arg0, var4, "textYOffset");
        this.field7256 = this.method3141(var3, true, var4, "offsetPerTenCycles");
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z", line = 425)
    public static final boolean method3148(int arg0) {
        field7295++;
        boolean var1 = true;
        if (arg0 != 0) {
            method3148(93);
        }
        if (class315.field4518 == null) {
            if (class149.field1968.method1860(class746.field10284, (byte) 124)) {
                class315.field4518 = class279.method1811(class149.field1968, class746.field10284);
            } else {
                var1 = false;
            }
        }
        if (class685.field9571 == null) {
            if (class149.field1968.method1860(class728.field10065, (byte) 124)) {
                class685.field9571 = class279.method1811(class149.field1968, class728.field10065);
            } else {
                var1 = false;
            }
        }
        if (class154.field2013 == null) {
            if (class149.field1968.method1860(class269.field3893, (byte) 124)) {
                class154.field2013 = class279.method1811(class149.field1968, class269.field3893);
            } else {
                var1 = false;
            }
        }
        if (class282.field4041 == null) {
            if (class170.field2160.method1860(class692.field9664, (byte) 124)) {
                class282.field4041 = class397.method2445(class170.field2160, (byte) -95, class692.field9664);
            } else {
                var1 = false;
            }
        }
        if (class554.field7680 == null) {
            if (class149.field1968.method1860(class692.field9664, (byte) 124)) {
                class554.field7680 = class279.method1823(class149.field1968, class692.field9664);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)I", line = 497)
    public final int method113(int arg0) {
        field7265++;
        if (arg0 != -7350) {
            this.method109(-48);
        }
        return 100;
    }
}
