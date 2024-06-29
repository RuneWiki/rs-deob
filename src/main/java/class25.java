import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class25 implements class526 {

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!as", name = "F", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!as", name = "J", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!as", name = "L", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!as", name = "M", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "Lga;")
    public static class332 field318;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "Ljava/awt/Color;")
    private Color field307;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "Ljava/awt/Font;")
    private Font field319;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field320;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field292;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field298;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field300;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field302;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field306;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field313;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field316;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field321;

    @OriginalMember(owner = "client!as", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field330;

    @OriginalMember(owner = "client!as", name = "O", descriptor = "Ljava/awt/Image;")
    private Image field331;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "Z")
    private boolean field311;

    @OriginalMember(owner = "client!as", name = "E", descriptor = "Z")
    private boolean field322;

    @OriginalMember(owner = "client!as", name = "I", descriptor = "Z")
    private boolean field326;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)I")
    private final int method142(int arg0, byte arg1) {
        field296++;
        if (arg1 != -74) {
            this.field315 = -102;
        }
        return this.field326 ? (class399.field5301 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V")
    public final void method143(int arg0, boolean arg1) {
        if (arg0 != -25156) {
            this.field311 = false;
        }
        field327++;
        if (!this.field311) {
            if (class516.field7178 == null) {
                this.field311 = true;
            } else if (this.field319 == null) {
                try {
                    this.method156(false);
                } catch (Exception var43) {
                    this.field311 = true;
                }
            }
        }
        if (this.field311) {
            this.method155((byte) 122);
            return;
        }
        Graphics var3 = class583.field7996.getGraphics();
        if (var3 == null) {
            class583.field7996.repaint();
            return;
        }
        try {
            int var4 = class540.field7407.method2869(false);
            String var5 = class540.field7407.method2858(true);
            if (class320.field4273 == null) {
                class320.field4273 = class583.field7996.createImage(class399.field5301, class60.field750);
            }
            Graphics var6 = class320.field4273.getGraphics();
            int var7 = this.field298.getWidth(null);
            int var8 = this.field321.getWidth(null);
            int var9 = this.field302.getWidth(null);
            int var10 = this.field298.getHeight(null);
            int var11 = this.field321.getHeight(null);
            int var12 = this.field302.getHeight(null);
            var6.drawImage(this.field298, this.method142(var7, (byte) -74) + this.field299 - (this.field294 / 2), this.method144(var10, 0) - -this.field303, null);
            int var13 = var7 + this.field299 - (this.field294 / 2);
            int var14 = this.field299 - (var8 - (this.field294 / 2));
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field302, this.method142(var7, (byte) -74) + this.field299 + var15, this.method144(var12, arg0 + 25156) + this.field303, null);
            }
            var6.drawImage(this.field321, this.method142(var8, (byte) -74) - (-this.field299 - this.field294 / 2), this.method144(var11, 0) - -this.field303, null);
            int var16 = this.field331.getWidth(null);
            int var17 = this.field331.getHeight(null);
            int var18 = this.field313.getWidth(null);
            int var19 = this.field313.getHeight(null);
            int var20 = this.field300.getHeight(null);
            int var21 = this.field316.getWidth(null);
            int var22 = this.field316.getHeight(null);
            int var23 = this.field300.getWidth(null);
            int var24 = this.field306.getWidth(null);
            int var25 = this.field330.getWidth(null);
            int var26 = this.method142(this.field305, (byte) -74) + this.field293;
            int var27 = this.method144(this.field315, 0) + this.field295;
            var6.drawImage(this.field331, var26, (this.field315 - var17) / 2 + var27, null);
            var6.drawImage(this.field313, var26 + this.field305 - var18, var27 - -((-var19 + this.field315) / 2), null);
            if (this.field292 == null) {
                this.field292 = class583.field7996.createImage(this.field305 - var16 - var18, this.field315);
            }
            Graphics var28 = this.field292.getGraphics();
            for (int var29 = 0; var29 < (this.field305 - var16 - var18); var29 += var21) {
                var28.drawImage(this.field316, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field305 - var16 - var18); var30 += var23) {
                var28.drawImage(this.field300, var30, this.field315 - var20, null);
            }
            int var31 = (this.field305 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class583.field7996.createImage(var31, this.field315 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field312 * class386.method2211(126) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field306, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field305 - var16 - var18 - var31;
            if (var38 > 0) {
                Image var39 = class583.field7996.createImage(var38, this.field315 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field330, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field292, var16 + var26, var27, null);
            var6.setFont(this.field319);
            var6.setColor(this.field307);
            var6.drawString(var5, var26 + ((this.field305 - this.field320.stringWidth(var5)) / 2), this.field315 / 2 + 4 + var27 + this.field317);
            var3.drawImage(class320.field4273, 0, 0, null);
        } catch (Exception var44) {
            this.field311 = true;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I")
    private final int method144(int arg0, int arg1) {
        field308++;
        if (this.field322) {
            return (class60.field750 - arg0) / 2;
        } else {
            if (arg1 != 0) {
                this.method143(-105, false);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
    public static final void method145(int arg0) {
        field304++;
        if (arg0 != 0) {
            field318 = null;
        }
        if (class146.field1963.method1065()) {
            class146.field1963.method1126(class583.field7996);
            class689.method3894((byte) -108);
            class146.field1963.method1132(class583.field7996);
            class146.field1963.method1143(class583.field7996);
        } else {
            class174.method1190(0, class618.field8566);
        }
        class398.method2275(-1);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public final void method146(int arg0) {
        if (arg0 > -107) {
            this.field320 = null;
        }
        field329++;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)V")
    public static void method147(boolean arg0) {
        if (!arg0) {
            field318 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Object;)Z")
    private final boolean method148(String arg0, int arg1, Class arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field301++;
        if (arg1 != 2) {
            this.method154(87);
        }
        Field var5 = arg2.getDeclaredField(arg0);
        return var5.getBoolean(arg3);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)I")
    private final int method149(byte arg0, String arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 != 123) {
            this.field316 = null;
        }
        field325++;
        Field var5 = arg3.getDeclaredField(arg1);
        return var5.getInt(arg2);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(JI)Z")
    public final boolean method150(long arg0, int arg1) {
        if (arg1 == 5607) {
            field309++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public final void method151(boolean arg0) {
        if (!arg0) {
            this.field315 = -59;
        }
        field323++;
        class295.method1743((byte) -67);
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
    public final int method152(int arg0) {
        if (arg0 != -3210) {
            this.method155((byte) -76);
        }
        field328++;
        return 0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Ljava/lang/Object;")
    private final Object method153(Class arg0, byte arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        field310++;
        Field var4 = arg0.getDeclaredField(arg2);
        Object var5 = var4.get(class516.field7178);
        var4.set(class516.field7178, null);
        int var6 = -36 / ((-arg1 - 21) / 52);
        return var5;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
    public final int method154(int arg0) {
        field314++;
        if (arg0 != 19115) {
            this.method155((byte) 26);
        }
        return 100;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
    private final void method155(byte arg0) {
        field297++;
        if (arg0 <= 117) {
            this.method151(false);
        }
        class670.method3807((byte) -119, class390.field5226[class482.field6705], class258.field3382[class482.field6705], class325.field4378[class482.field6705], class540.field7407.method2869(false), class540.field7407.method2858(true));
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(Z)V")
    private final void method156(boolean arg0) throws IllegalAccessException, NoSuchFieldException {
        field324++;
        Class var2 = class516.field7178.getClass();
        this.field306 = (Image) this.method153(var2, (byte) -85, "bar");
        this.field330 = (Image) this.method153(var2, (byte) -80, "background");
        this.field331 = (Image) this.method153(var2, (byte) -110, "left");
        this.field313 = (Image) this.method153(var2, (byte) -83, "right");
        this.field316 = (Image) this.method153(var2, (byte) -87, "top");
        this.field300 = (Image) this.method153(var2, (byte) -121, "bottom");
        this.field298 = (Image) this.method153(var2, (byte) 112, "bodyLeft");
        this.field321 = (Image) this.method153(var2, (byte) 121, "bodyRight");
        this.field302 = (Image) this.method153(var2, (byte) 45, "bodyFill");
        this.field319 = (Font) this.method153(var2, (byte) -76, "bf");
        this.field320 = (FontMetrics) this.method153(var2, (byte) -127, "bfm");
        this.field307 = (Color) this.method153(var2, (byte) 39, "colourtext");
        Object var3 = this.method153(var2, (byte) -118, "lb");
        Class var4 = var3.getClass();
        this.field326 = this.method148("xMiddle", 2, var4, var3);
        this.field322 = this.method148("yMiddle", 2, var4, var3);
        this.field293 = this.method149((byte) 123, "xOffset", var3, var4);
        this.field295 = this.method149((byte) 123, "yOffset", var3, var4);
        this.field305 = this.method149((byte) 123, "width", var3, var4);
        this.field315 = this.method149((byte) 123, "height", var3, var4);
        this.field299 = this.method149((byte) 123, "boxXOffset", var3, var4);
        this.field303 = this.method149((byte) 123, "boxYOffset", var3, var4);
        if (!arg0) {
            this.field294 = this.method149((byte) 123, "boxWidth", var3, var4);
            this.field317 = this.method149((byte) 123, "textYOffset", var3, var4);
            this.field312 = this.method149((byte) 123, "offsetPerTenCycles", var3, var4);
        }
    }
}
