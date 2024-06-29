import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class222 implements class613 {

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "I")
    public static int field3160 = -1;

    @OriginalMember(owner = "client!cea", name = "J", descriptor = "[Lra;")
    public static class118[] field3188 = new class118[100];

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "I")
    private int field3161;

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "I")
    private int field3163;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "I")
    private int field3176;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!cea", name = "B", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!cea", name = "E", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!cea", name = "F", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!cea", name = "G", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!cea", name = "M", descriptor = "I")
    private int field3191;

    @OriginalMember(owner = "client!cea", name = "O", descriptor = "I")
    private int field3193;

    @OriginalMember(owner = "client!cea", name = "Q", descriptor = "I")
    private int field3195;

    @OriginalMember(owner = "client!cea", name = "R", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!cea", name = "P", descriptor = "Ljava/awt/Color;")
    private Color field3194;

    @OriginalMember(owner = "client!cea", name = "L", descriptor = "Ljava/awt/Font;")
    private Font field3190;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field3170;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field3159;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field3168;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field3171;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field3172;

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field3173;

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field3175;

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field3182;

    @OriginalMember(owner = "client!cea", name = "H", descriptor = "Ljava/awt/Image;")
    private Image field3186;

    @OriginalMember(owner = "client!cea", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field3189;

    @OriginalMember(owner = "client!cea", name = "S", descriptor = "Ljava/awt/Image;")
    private Image field3197;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "Z")
    private boolean field3165;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "Z")
    private boolean field3166;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "Z")
    private boolean field3177;

    @OriginalMember(owner = "client!cea", name = "N", descriptor = "[[Lwq;")
    public static class176[][] field3192;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V", line = 6)
    public final void method1528(int arg0) {
        field3157++;
        if (arg0 != -28323) {
            this.method1540(-80, 92);
        }
        class790.method4321((byte) -91);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ)V", line = 18)
    public final void method1529(int arg0, boolean arg1) {
        if (!this.field3165) {
            if (class535.field7544 == null) {
                this.field3165 = true;
            } else if (this.field3190 == null) {
                try {
                    this.method1531(arg0 ^ 0xFFFF93F6);
                } catch (Exception var43) {
                    this.field3165 = true;
                }
            }
        }
        field3174++;
        if (this.field3165) {
            this.method1535(-113);
            return;
        }
        Graphics var3 = class359.field5219.getGraphics();
        if (var3 == null) {
            class359.field5219.repaint();
        } else {
            try {
                int var4 = class203.field2976.method617(16777215);
                String var5 = class203.field2976.method623((byte) -104);
                if (class760.field10483 == null) {
                    class760.field10483 = class359.field5219.createImage(class638.field8980, class512.field7325);
                }
                Graphics var6 = class760.field10483.getGraphics();
                var6.clearRect(0, 0, class638.field8980, class512.field7325);
                int var7 = this.field3197.getWidth(null);
                int var8 = this.field3172.getWidth(null);
                int var9 = this.field3186.getWidth(null);
                int var10 = this.field3197.getHeight(null);
                int var11 = this.field3172.getHeight(null);
                int var12 = this.field3186.getHeight(null);
                var6.drawImage(this.field3197, this.method1540(var7, arg0 ^ 0x3332) + this.field3191 - this.field3176 / 2, this.method1543(-127, var10) - -this.field3196, null);
                int var13 = this.field3191 + var7 - this.field3176 / 2;
                int var14 = this.field3176 / 2 + this.field3191;
                for (int var15 = var13; var15 <= var14; var15 += var9) {
                    var6.drawImage(this.field3186, var15 + (this.method1540(var7, arg0 + 3378) + this.field3191), this.method1543(-128, var12) + this.field3196, null);
                }
                var6.drawImage(this.field3172, this.method1540(var8, -24385) - (-(this.field3176 / 2) - this.field3191), this.method1543(-127, var11) + this.field3196, null);
                int var16 = this.field3182.getWidth(null);
                int var17 = this.field3182.getHeight(null);
                int var18 = this.field3168.getWidth(null);
                int var19 = this.field3168.getHeight(null);
                int var20 = this.field3171.getHeight(null);
                int var21 = this.field3159.getWidth(null);
                int var22 = this.field3159.getHeight(null);
                int var23 = this.field3171.getWidth(null);
                int var24 = this.field3175.getWidth(null);
                int var25 = this.field3173.getWidth(null);
                int var26 = this.method1540(this.field3163, -24385) + this.field3195;
                int var27 = this.method1543(-128, this.field3155) + this.field3193;
                var6.drawImage(this.field3182, var26, (this.field3155 - var17) / 2 + var27, null);
                var6.drawImage(this.field3168, this.field3163 + var26 - var18, (-var19 + this.field3155) / 2 + var27, null);
                if (this.field3189 == null) {
                    this.field3189 = class359.field5219.createImage(this.field3163 - var16 - var18, this.field3155);
                }
                Graphics var28 = this.field3189.getGraphics();
                for (int var29 = 0; var29 < this.field3163 - var16 - var18; var29 += var21) {
                    var28.drawImage(this.field3159, var29, 0, null);
                }
                for (int var30 = 0; var30 < (this.field3163 - var16 - var18); var30 += var23) {
                    var28.drawImage(this.field3171, var30, this.field3155 - var20, null);
                }
                int var31 = (this.field3163 - (var16 + var18)) * var4 / 100;
                if (var31 > 0) {
                    Image var32 = class359.field5219.createImage(var31, this.field3155 - var22 - var20);
                    int var33 = var32.getWidth(null);
                    Graphics var34 = var32.getGraphics();
                    int var35 = this.field3180 * class416.method2494(0) / 10 % var24;
                    for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                        var34.drawImage(this.field3175, var36, 0, null);
                    }
                    var28.drawImage(var32, 0, var22, null);
                }
                int var38 = this.field3163 - var16 - var31 - var18;
                if (var38 > 0) {
                    Image var39 = class359.field5219.createImage(var38, this.field3155 - var22 - var20);
                    int var40 = var39.getWidth(null);
                    Graphics var41 = var39.getGraphics();
                    for (int var42 = 0; var42 < var40; var42 += var25) {
                        var41.drawImage(this.field3173, var42, 0, null);
                    }
                    var28.drawImage(var39, var31, var22, null);
                }
                var6.drawImage(this.field3189, var16 + var26, var27, null);
                var6.setFont(this.field3190);
                var6.setColor(this.field3194);
                var6.drawString(var5, var26 + ((this.field3163 - this.field3170.stringWidth(var5)) / 2), var27 + 4 - -(this.field3155 / 2) + this.field3161);
                var3.drawImage(class760.field10483, 0, 0, null);
            } catch (Exception var44) {
                this.field3165 = true;
            }
        }
        if (arg0 != -27763) {
            this.field3191 = 2;
        }
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "(I)V", line = 210)
    public static void method1530(int arg0) {
        field3188 = null;
        int var1 = 120 % ((-arg0 - 38) / 46);
        field3192 = null;
    }

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)V", line = 221)
    private final void method1531(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field3183++;
        Class var2 = class535.field7544.getClass();
        this.field3175 = (Image) this.method1539("bar", var2, 127);
        this.field3173 = (Image) this.method1539("background", var2, 127);
        this.field3182 = (Image) this.method1539("left", var2, 127);
        this.field3168 = (Image) this.method1539("right", var2, 127);
        this.field3159 = (Image) this.method1539("top", var2, 127);
        this.field3171 = (Image) this.method1539("bottom", var2, 127);
        int var3 = -125 / ((79 - arg0) / 40);
        this.field3197 = (Image) this.method1539("bodyLeft", var2, 127);
        this.field3172 = (Image) this.method1539("bodyRight", var2, 127);
        this.field3186 = (Image) this.method1539("bodyFill", var2, 127);
        this.field3190 = (Font) this.method1539("bf", var2, 127);
        this.field3170 = (FontMetrics) this.method1539("bfm", var2, 127);
        this.field3194 = (Color) this.method1539("colourtext", var2, 127);
        Object var4 = this.method1539("lb", var2, 127);
        Class var5 = var4.getClass();
        this.field3177 = this.method1538((byte) -70, var5, "xMiddle", var4);
        this.field3166 = this.method1538((byte) -70, var5, "yMiddle", var4);
        this.field3195 = this.method1534(var4, (byte) 89, var5, "xOffset");
        this.field3193 = this.method1534(var4, (byte) -93, var5, "yOffset");
        this.field3163 = this.method1534(var4, (byte) -37, var5, "width");
        this.field3155 = this.method1534(var4, (byte) 89, var5, "height");
        this.field3191 = this.method1534(var4, (byte) 119, var5, "boxXOffset");
        this.field3196 = this.method1534(var4, (byte) -70, var5, "boxYOffset");
        this.field3176 = this.method1534(var4, (byte) -91, var5, "boxWidth");
        this.field3161 = this.method1534(var4, (byte) 115, var5, "textYOffset");
        this.field3180 = this.method1534(var4, (byte) -86, var5, "offsetPerTenCycles");
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IF[FIIIIZI[FI)V", line = 260)
    public static final void method1532(int arg0, float arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, float[] arg9, int arg10) {
        field3181++;
        int var11 = arg3 - arg6;
        int var12 = arg8 - arg0;
        int var13 = arg5 - arg4;
        float var14 = arg9[2] * (float) var13 + arg9[1] * (float) var12 + arg9[0] * (float) var11;
        float var15 = arg9[5] * (float) var13 + arg9[4] * (float) var12 + arg9[3] * (float) var11;
        if (arg7) {
            method1530(-125);
        }
        float var16 = arg9[8] * (float) var13 + arg9[7] * (float) var12 + arg9[6] * (float) var11;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = arg1 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg10 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg10 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg2[1] = var19;
        arg2[0] = var18;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(JB)Z", line = 311)
    public final boolean method1533(long arg0, byte arg1) {
        if (arg1 == 104) {
            field3169++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/Object;BLjava/lang/Class;Ljava/lang/String;)I", line = 326)
    private final int method1534(Object arg0, byte arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field3185++;
        Field var5 = arg2.getDeclaredField(arg3);
        int var6 = 8 % ((arg1 - 22) / 59);
        return var5.getInt(arg0);
    }

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "(I)V", line = 340)
    private final void method1535(int arg0) {
        class575.method3343(class120.field1527[class108.field1311], class203.field2976.method623((byte) -104), class185.field2786[class108.field1311], 2, class358.field5206[class108.field1311], class203.field2976.method617(16777215));
        field3162++;
        if (arg0 > -102) {
            this.field3197 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)I", line = 354)
    public final int method1536(int arg0) {
        field3178++;
        if (arg0 != 9657) {
            method1542((byte) -31, 18, 115);
        }
        return 100;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)I", line = 369)
    public final int method1537(byte arg0) {
        int var2 = 42 / ((86 - arg0) / 39);
        field3164++;
        return 0;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z", line = 379)
    private final boolean method1538(byte arg0, Class arg1, String arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 == -70) {
            field3184++;
            Field var5 = arg1.getDeclaredField(arg2);
            return var5.getBoolean(arg3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;", line = 395)
    private final Object method1539(String arg0, Class arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        if (arg2 < 126) {
            return null;
        }
        field3154++;
        Field var4 = arg1.getDeclaredField(arg0);
        Object var5 = var4.get(class535.field7544);
        var4.set(class535.field7544, null);
        return var5;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I", line = 427)
    private final int method1540(int arg0, int arg1) {
        if (arg1 == -24385) {
            field3156++;
            return this.field3177 ? (class638.field8980 - arg0) / 2 : 0;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V", line = 449)
    public final void method1541(int arg0) {
        field3158++;
        int var2 = 1 / ((21 - arg0) / 45);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BII)Z", line = 458)
    public static final boolean method1542(byte arg0, int arg1, int arg2) {
        if (arg0 > -94) {
            return true;
        } else {
            field3167++;
            return (class148.method1024(-73, arg1, arg2) | class359.method2253(arg2, arg1, false) | class581.method3382(arg1, arg2, (byte) 19)) & class310.method2031(2048, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(II)I", line = 475)
    private final int method1543(int arg0, int arg1) {
        field3187++;
        if (this.field3166) {
            return (class512.field7325 - arg1) / 2;
        } else {
            if (arg0 >= -126) {
                field3192 = null;
            }
            return 0;
        }
    }
}
