import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 implements class534 {

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Z")
    public static boolean field126 = true;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field150 = 0;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Ljda;")
    public static class239 field138 = new class239(64);

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "D")
    public static double field137;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ljava/awt/Color;")
    private Color field114;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "Ljava/awt/Font;")
    private Font field153;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field129;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field118;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field119;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field121;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field125;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field128;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field130;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field133;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "Ljava/awt/Image;")
    private Image field144;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field145;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Ljava/awt/Image;")
    private Image field151;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
    private boolean field139;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "Z")
    private boolean field148;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Z")
    private boolean field152;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;I)Z")
    private final boolean method67(String arg0, Object arg1, Class arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        field117++;
        if (arg3 != 31245) {
            this.field134 = 12;
        }
        Field var5 = arg2.getDeclaredField(arg0);
        return var5.getBoolean(arg1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public final void method68(boolean arg0) {
        field143++;
        class42.method290(26016);
        if (!arg0) {
            this.field146 = 67;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
    public final int method69(int arg0) {
        field132++;
        if (arg0 != -31784) {
            this.method72(-68, -76);
        }
        return 100;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static void method70(int arg0) {
        field138 = null;
        if (arg0 != 0) {
            method71(114, null, (byte) -125, null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILaj;BLaj;)V")
    public static final void method71(int arg0, class333 arg1, byte arg2, class333 arg3) {
        class685.field9633 = arg3;
        class394.field5810 = arg1;
        field122++;
        if (arg2 != -32) {
            field138 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    private final int method72(int arg0, int arg1) {
        field142++;
        if (arg1 >= -111) {
            this.field115 = 120;
        }
        return this.field148 ? (class593.field8019 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;B)I")
    private final int method73(String arg0, Class arg1, Object arg2, byte arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg3 != 123) {
            this.method72(46, 80);
        }
        field124++;
        Field var5 = arg1.getDeclaredField(arg0);
        return var5.getInt(arg2);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
    private final Object method74(Class arg0, String arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        field120++;
        Field var4 = arg0.getDeclaredField(arg1);
        Object var5 = var4.get(class735.field10183);
        var4.set(class735.field10183, null);
        return arg2 > -58 ? null : var5;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    private final void method75(int arg0) {
        field135++;
        class563.method3155(class120.field1757[class184.field2461], 124, class407.field5888[class184.field2461], class209.field2778.method4265(-122), class209.field2778.method4259(47), class93.field1328[class184.field2461]);
        int var2 = -36 % ((-arg0 - 41) / 34);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public final void method76(boolean arg0) {
        if (arg0) {
            field123++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)I")
    private final int method77(int arg0, byte arg1) {
        int var3 = 106 % ((arg1 + 31) / 44);
        field155++;
        return this.field139 ? (class140.field2048 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)Z")
    public final boolean method78(int arg0, long arg1) {
        field140++;
        if (arg0 != -18419) {
            method71(-9, null, (byte) 29, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
    public final int method79(int arg0) {
        field131++;
        return arg0 == -4076 ? 0 : -88;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZ)V")
    public final void method80(boolean arg0, boolean arg1) {
        field149++;
        if (!this.field152) {
            if (class735.field10183 == null) {
                this.field152 = true;
            } else if (this.field153 == null) {
                try {
                    this.method81((byte) -128);
                } catch (Exception var43) {
                    this.field152 = true;
                }
            }
        }
        if (this.field152) {
            this.method75(36);
        } else if (arg0) {
            Graphics var3 = class706.field9894.getGraphics();
            if (var3 == null) {
                class706.field9894.repaint();
            } else {
                try {
                    int var4 = class209.field2778.method4259(97);
                    String var5 = class209.field2778.method4265(-112);
                    if (class214.field2819 == null) {
                        class214.field2819 = class706.field9894.createImage(class593.field8019, class140.field2048);
                    }
                    Graphics var6 = class214.field2819.getGraphics();
                    var6.clearRect(0, 0, class593.field8019, class140.field2048);
                    int var7 = this.field151.getWidth(null);
                    int var8 = this.field125.getWidth(null);
                    int var9 = this.field133.getWidth(null);
                    int var10 = this.field151.getHeight(null);
                    int var11 = this.field125.getHeight(null);
                    int var12 = this.field133.getHeight(null);
                    var6.drawImage(this.field151, this.method72(var7, -128) + this.field147 - this.field134 / 2, this.method77(var10, (byte) -127) - -this.field146, null);
                    int var13 = this.field147 + var7 - (this.field134 / 2);
                    int var14 = this.field134 / 2 + this.field147;
                    for (int var15 = var13; var15 <= var14; var15 += var9) {
                        var6.drawImage(this.field133, var15 + this.method72(var7, -117) + this.field147, this.method77(var12, (byte) -79) + this.field146, null);
                    }
                    var6.drawImage(this.field125, this.method72(var8, -112) + this.field147 + this.field134 / 2, this.method77(var11, (byte) -128) - -this.field146, null);
                    int var16 = this.field145.getWidth(null);
                    int var17 = this.field145.getHeight(null);
                    int var18 = this.field121.getWidth(null);
                    int var19 = this.field121.getHeight(null);
                    int var20 = this.field118.getHeight(null);
                    int var21 = this.field144.getWidth(null);
                    int var22 = this.field144.getHeight(null);
                    int var23 = this.field118.getWidth(null);
                    int var24 = this.field119.getWidth(null);
                    int var25 = this.field130.getWidth(null);
                    int var26 = this.method72(this.field141, -126) + this.field136;
                    int var27 = this.method77(this.field116, (byte) -100) + this.field115;
                    var6.drawImage(this.field145, var26, (this.field116 - var17) / 2 + var27, null);
                    var6.drawImage(this.field121, this.field141 + var26 - var18, (-var19 + this.field116) / 2 + var27, null);
                    if (this.field128 == null) {
                        this.field128 = class706.field9894.createImage(this.field141 - (var16 + var18), this.field116);
                    }
                    Graphics var28 = this.field128.getGraphics();
                    for (int var29 = 0; var29 < (this.field141 - var16 - var18); var29 += var21) {
                        var28.drawImage(this.field144, var29, 0, null);
                    }
                    for (int var30 = 0; var30 < (this.field141 - var16 - var18); var30 += var23) {
                        var28.drawImage(this.field118, var30, this.field116 - var20, null);
                    }
                    int var31 = (this.field141 - (var16 + var18)) * var4 / 100;
                    if (var31 > 0) {
                        Image var32 = class706.field9894.createImage(var31, this.field116 - var20 - var22);
                        int var33 = var32.getWidth(null);
                        Graphics var34 = var32.getGraphics();
                        int var35 = this.field127 * class438.method2638(13363) / 10 % var24;
                        for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                            var34.drawImage(this.field119, var36, 0, null);
                        }
                        var28.drawImage(var32, 0, var22, null);
                    }
                    int var38 = this.field141 - var16 - var18 - var31;
                    if (var38 > 0) {
                        Image var39 = class706.field9894.createImage(var38, this.field116 - var20 - var22);
                        int var40 = var39.getWidth(null);
                        Graphics var41 = var39.getGraphics();
                        for (int var42 = 0; var42 < var40; var42 += var25) {
                            var41.drawImage(this.field130, var42, 0, null);
                        }
                        var28.drawImage(var39, var31, var22, null);
                    }
                    var6.drawImage(this.field128, var16 + var26, var27, null);
                    var6.setFont(this.field153);
                    var6.setColor(this.field114);
                    var6.drawString(var5, var26 + ((this.field141 - this.field129.stringWidth(var5)) / 2), this.field116 / 2 + var27 + 4 + this.field154);
                    var3.drawImage(class214.field2819, 0, 0, null);
                } catch (Exception var44) {
                    this.field152 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    private final void method81(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field156++;
        Class var2 = class735.field10183.getClass();
        this.field119 = (Image) this.method74(var2, "bar", -79);
        this.field130 = (Image) this.method74(var2, "background", -117);
        this.field145 = (Image) this.method74(var2, "left", -127);
        this.field121 = (Image) this.method74(var2, "right", -110);
        this.field144 = (Image) this.method74(var2, "top", -116);
        this.field118 = (Image) this.method74(var2, "bottom", -68);
        this.field151 = (Image) this.method74(var2, "bodyLeft", -98);
        this.field125 = (Image) this.method74(var2, "bodyRight", -76);
        this.field133 = (Image) this.method74(var2, "bodyFill", -108);
        if (arg0 > -86) {
            return;
        }
        this.field153 = (Font) this.method74(var2, "bf", -120);
        this.field129 = (FontMetrics) this.method74(var2, "bfm", -90);
        this.field114 = (Color) this.method74(var2, "colourtext", -88);
        Object var3 = this.method74(var2, "lb", -112);
        Class var4 = var3.getClass();
        this.field148 = this.method67("xMiddle", var3, var4, 31245);
        this.field139 = this.method67("yMiddle", var3, var4, 31245);
        this.field136 = this.method73("xOffset", var4, var3, (byte) 123);
        this.field115 = this.method73("yOffset", var4, var3, (byte) 123);
        this.field141 = this.method73("width", var4, var3, (byte) 123);
        this.field116 = this.method73("height", var4, var3, (byte) 123);
        this.field147 = this.method73("boxXOffset", var4, var3, (byte) 123);
        this.field146 = this.method73("boxYOffset", var4, var3, (byte) 123);
        this.field134 = this.method73("boxWidth", var4, var3, (byte) 123);
        this.field154 = this.method73("textYOffset", var4, var3, (byte) 123);
        this.field127 = this.method73("offsetPerTenCycles", var4, var3, (byte) 123);
    }
}
