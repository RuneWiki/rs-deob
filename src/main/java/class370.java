import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class370 implements class775 {

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "[B")
    public static byte[] field5026 = new byte[520];

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    private int field5006;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    private int field5024;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
    private int field5029;

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "I")
    private int field5033;

    @OriginalMember(owner = "client!tu", name = "D", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!tu", name = "E", descriptor = "I")
    private int field5035;

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!tu", name = "H", descriptor = "I")
    private int field5038;

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "I")
    private int field5041;

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!tu", name = "N", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "I")
    private int field5045;

    @OriginalMember(owner = "client!tu", name = "M", descriptor = "Ljava/awt/Color;")
    private Color field5043;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "Ljava/awt/Font;")
    private Font field5012;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field5013;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field5005;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field5008;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field5010;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field5018;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field5019;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field5020;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field5023;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field5025;

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field5037;

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field5039;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "Z")
    private boolean field5011;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "Z")
    private boolean field5014;

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "Z")
    private boolean field5031;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
    public final void method880(int arg0) {
        field5032++;
        int var2 = -111 / ((arg0 + 86) / 35);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZZ)V")
    public final void method879(boolean arg0, boolean arg1) {
        field5015++;
        if (!this.field5031) {
            if (class286.field3936 == null) {
                this.field5031 = true;
            } else if (this.field5012 == null) {
                try {
                    this.method2252((byte) 20);
                } catch (Exception var43) {
                    this.field5031 = true;
                }
            }
        }
        if (arg0) {
            method2254(true);
        }
        if (this.field5031) {
            this.method2255((byte) 34);
            return;
        }
        Graphics var3 = class558.field7896.getGraphics();
        if (var3 == null) {
            class558.field7896.repaint();
            return;
        }
        try {
            int var4 = class695.field9619.method3421(-14079);
            String var5 = class695.field9619.method3415((byte) -74);
            if (class95.field1473 == null) {
                class95.field1473 = class558.field7896.createImage(class732.field10098, class108.field1697);
            }
            Graphics var6 = class95.field1473.getGraphics();
            var6.clearRect(0, 0, class732.field10098, class108.field1697);
            int var7 = this.field5023.getWidth(null);
            int var8 = this.field5037.getWidth(null);
            int var9 = this.field5020.getWidth(null);
            int var10 = this.field5023.getHeight(null);
            int var11 = this.field5037.getHeight(null);
            int var12 = this.field5020.getHeight(null);
            var6.drawImage(this.field5023, this.method2257(-541, var7) + (this.field5029 - this.field5045 / 2), this.method2249(0, var10) - -this.field5041, null);
            int var13 = var7 + this.field5029 - (this.field5045 / 2);
            int var14 = this.field5045 / 2 + this.field5029;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field5020, var15 + this.method2257(-541, var7) + this.field5029, this.method2249(0, var12) + this.field5041, null);
            }
            var6.drawImage(this.field5037, this.method2257(-541, var8) + (this.field5029 + (this.field5045 / 2)), this.method2249(0, var11) + this.field5041, null);
            int var16 = this.field5018.getWidth(null);
            int var17 = this.field5018.getHeight(null);
            int var18 = this.field5019.getWidth(null);
            int var19 = this.field5019.getHeight(null);
            int var20 = this.field5010.getHeight(null);
            int var21 = this.field5005.getWidth(null);
            int var22 = this.field5005.getHeight(null);
            int var23 = this.field5010.getWidth(null);
            int var24 = this.field5008.getWidth(null);
            int var25 = this.field5025.getWidth(null);
            int var26 = this.method2257(-541, this.field5006) + this.field5035;
            int var27 = this.method2249(0, this.field5017) + this.field5024;
            var6.drawImage(this.field5018, var26, (this.field5017 - var17) / 2 + var27, null);
            var6.drawImage(this.field5019, this.field5006 + var26 - var18, (-var19 + this.field5017) / 2 + var27, null);
            if (this.field5039 == null) {
                this.field5039 = class558.field7896.createImage(this.field5006 - var18 - var16, this.field5017);
            }
            Graphics var28 = this.field5039.getGraphics();
            for (int var29 = 0; var29 < (this.field5006 - var18 - var16); var29 += var21) {
                var28.drawImage(this.field5005, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field5006 - var18 - var16); var30 += var23) {
                var28.drawImage(this.field5010, var30, this.field5017 - var20, null);
            }
            int var31 = (this.field5006 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class558.field7896.createImage(var31, this.field5017 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field5038 * class192.method1400(255) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field5008, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field5006 - var18 - var31 - var16;
            if (var38 > 0) {
                Image var39 = class558.field7896.createImage(var38, this.field5017 - (var22 + var20));
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field5025, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field5039, var16 + var26, var27, null);
            var6.setFont(this.field5012);
            var6.setColor(this.field5043);
            var6.drawString(var5, (this.field5006 - this.field5013.stringWidth(var5)) / 2 + var26, this.field5017 / 2 + (var27 - -4) - -this.field5033);
            var3.drawImage(class95.field1473, 0, 0, null);
        } catch (Exception var44) {
            this.field5031 = true;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(JB)Z")
    public final boolean method877(long arg0, byte arg1) {
        field5016++;
        return arg1 == -58;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I")
    private final int method2249(int arg0, int arg1) {
        field5030++;
        if (this.field5014) {
            return (class108.field1697 - arg1) / 2;
        } else if (arg0 == 0) {
            return 0;
        } else {
            return 44;
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
    public static final void method2250(int arg0) {
        if (arg0 <= -20) {
            field5034++;
            class667.method3773();
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;")
    private final Object method2251(Class arg0, String arg1, byte arg2) throws IllegalAccessException, NoSuchFieldException {
        field5042++;
        Field var4 = arg0.getDeclaredField(arg1);
        Object var5 = var4.get(class286.field3936);
        var4.set(class286.field3936, null);
        int var6 = 79 / ((5 - arg2) / 37);
        return var5;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    private final void method2252(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field5044++;
        Class var2 = class286.field3936.getClass();
        this.field5008 = (Image) this.method2251(var2, "bar", (byte) -106);
        this.field5025 = (Image) this.method2251(var2, "background", (byte) -53);
        this.field5018 = (Image) this.method2251(var2, "left", (byte) -123);
        this.field5019 = (Image) this.method2251(var2, "right", (byte) 100);
        this.field5005 = (Image) this.method2251(var2, "top", (byte) 51);
        this.field5010 = (Image) this.method2251(var2, "bottom", (byte) 120);
        this.field5023 = (Image) this.method2251(var2, "bodyLeft", (byte) 64);
        this.field5037 = (Image) this.method2251(var2, "bodyRight", (byte) 103);
        this.field5020 = (Image) this.method2251(var2, "bodyFill", (byte) -99);
        this.field5012 = (Font) this.method2251(var2, "bf", (byte) 54);
        this.field5013 = (FontMetrics) this.method2251(var2, "bfm", (byte) -43);
        this.field5043 = (Color) this.method2251(var2, "colourtext", (byte) -92);
        Object var3 = this.method2251(var2, "lb", (byte) -53);
        if (arg0 != 20) {
            this.field5029 = 7;
        }
        Class var4 = var3.getClass();
        this.field5011 = this.method2253(var3, "xMiddle", var4, false);
        this.field5014 = this.method2253(var3, "yMiddle", var4, false);
        this.field5035 = this.method2256(true, var3, "xOffset", var4);
        this.field5024 = this.method2256(true, var3, "yOffset", var4);
        this.field5006 = this.method2256(true, var3, "width", var4);
        this.field5017 = this.method2256(true, var3, "height", var4);
        this.field5029 = this.method2256(true, var3, "boxXOffset", var4);
        this.field5041 = this.method2256(true, var3, "boxYOffset", var4);
        this.field5045 = this.method2256(true, var3, "boxWidth", var4);
        this.field5033 = this.method2256(true, var3, "textYOffset", var4);
        this.field5038 = this.method2256(true, var3, "offsetPerTenCycles", var4);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)I")
    public final int method876(boolean arg0) {
        field5036++;
        return arg0 ? 100 : -106;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Z)Z")
    private final boolean method2253(Object arg0, String arg1, Class arg2, boolean arg3) throws IllegalAccessException, NoSuchFieldException {
        field5028++;
        if (arg3) {
            return true;
        } else {
            Field var5 = arg2.getDeclaredField(arg1);
            return var5.getBoolean(arg0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
    public final void method882(int arg0) {
        if (arg0 != 14289) {
            this.field5018 = null;
        }
        field5040++;
        class118.method1044(true);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)V")
    public static void method2254(boolean arg0) {
        if (!arg0) {
            field5022 = 34;
        }
        field5026 = null;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
    private final void method2255(byte arg0) {
        field5009++;
        if (arg0 != 34) {
            this.method2249(-93, -92);
        }
        class483.method2764(class695.field9619.method3421(arg0 ^ 0xFFFFC923), class753.field10391[class289.field3986], class615.field8567[class289.field3986], class695.field9619.method3415((byte) -74), class236.field3393[class289.field3986], -109);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)I")
    private final int method2256(boolean arg0, Object arg1, String arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field5021++;
        Field var5 = arg3.getDeclaredField(arg2);
        if (!arg0) {
            this.field5023 = null;
        }
        return var5.getInt(arg1);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
    public final int method881(int arg0) {
        field5027++;
        return arg0 == -10641 ? 0 : -74;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)I")
    private final int method2257(int arg0, int arg1) {
        if (arg0 == -541) {
            field5007++;
            return this.field5011 ? (class732.field10098 - arg1) / 2 : 0;
        } else {
            return 79;
        }
    }
}
