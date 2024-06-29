import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class500 implements class502 {

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field7063 = -1;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    private int field7055;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    private int field7057;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    private int field7061;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    private int field7074;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    private int field7076;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    private int field7078;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    private int field7080;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    private int field7083;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    private int field7084;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Ljava/awt/Color;")
    private Color field7070;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Ljava/awt/Font;")
    private Font field7079;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field7073;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Ljava/awt/Image;")
    private Image field7056;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field7058;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field7059;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field7062;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field7066;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field7067;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field7068;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field7069;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field7081;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field7089;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Z")
    private boolean field7054;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Z")
    private boolean field7072;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "Z")
    private boolean field7092;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
    private final Object method2929(int arg0, String arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
        field7077++;
        Field var4 = arg2.getDeclaredField(arg1);
        if (arg0 == 25803) {
            Object var5 = var4.get(class64.field900);
            var4.set(class64.field900, null);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    private final void method2930(boolean arg0) {
        if (arg0) {
            this.field7067 = null;
        }
        field7082++;
        class501.method2939((byte) -12, class14.field273.method1080((byte) 81), class527.field7357[class758.field10583], class14.field273.method1086((byte) 82), class16.field317[class758.field10583], class69.field972[class758.field10583]);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    private final int method2931(int arg0, int arg1) {
        if (arg1 < 116) {
            return -2;
        } else {
            field7071++;
            return this.field7072 ? (class356.field4586 - arg0) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)I")
    public final int method1939(int arg0) {
        field7064++;
        if (arg0 <= 99) {
            this.method2931(-70, 118);
        }
        return 100;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public final void method1941(int arg0) {
        class276.method1633(-106);
        if (arg0 == 30861) {
            field7090++;
        }
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
    private final void method2932(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field7086++;
        Class var2 = class64.field900.getClass();
        this.field7068 = (Image) this.method2929(25803, "bar", var2);
        this.field7081 = (Image) this.method2929(25803, "background", var2);
        this.field7058 = (Image) this.method2929(arg0 ^ 0x64AF, "left", var2);
        this.field7089 = (Image) this.method2929(arg0 + 25703, "right", var2);
        this.field7062 = (Image) this.method2929(25803, "top", var2);
        this.field7066 = (Image) this.method2929(25803, "bottom", var2);
        this.field7056 = (Image) this.method2929(25803, "bodyLeft", var2);
        this.field7067 = (Image) this.method2929(25803, "bodyRight", var2);
        this.field7069 = (Image) this.method2929(25803, "bodyFill", var2);
        this.field7079 = (Font) this.method2929(arg0 + 25703, "bf", var2);
        this.field7073 = (FontMetrics) this.method2929(25803, "bfm", var2);
        this.field7070 = (Color) this.method2929(25803, "colourtext", var2);
        Object var3 = this.method2929(25803, "lb", var2);
        Class var4 = var3.getClass();
        this.field7072 = this.method2933(var4, "xMiddle", var3, arg0 - 98);
        this.field7092 = this.method2933(var4, "yMiddle", var3, 2);
        this.field7076 = this.method2934(var3, (byte) 32, var4, "xOffset");
        this.field7083 = this.method2934(var3, (byte) 32, var4, "yOffset");
        this.field7061 = this.method2934(var3, (byte) 32, var4, "width");
        this.field7055 = this.method2934(var3, (byte) 32, var4, "height");
        this.field7074 = this.method2934(var3, (byte) 32, var4, "boxXOffset");
        this.field7084 = this.method2934(var3, (byte) 32, var4, "boxYOffset");
        if (arg0 == 100) {
            this.field7078 = this.method2934(var3, (byte) 32, var4, "boxWidth");
            this.field7080 = this.method2934(var3, (byte) 32, var4, "textYOffset");
            this.field7057 = this.method2934(var3, (byte) 32, var4, "offsetPerTenCycles");
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;I)Z")
    private final boolean method2933(Class arg0, String arg1, Object arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        field7065++;
        if (arg3 != 2) {
            this.method2931(-58, 22);
        }
        Field var5 = arg0.getDeclaredField(arg1);
        return var5.getBoolean(arg2);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Object;BLjava/lang/Class;Ljava/lang/String;)I")
    private final int method2934(Object arg0, byte arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg1 != 32) {
            field7063 = 31;
        }
        field7075++;
        Field var5 = arg2.getDeclaredField(arg3);
        return var5.getInt(arg0);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
    public final int method1936(int arg0) {
        if (arg0 < 28) {
            return -108;
        } else {
            field7087++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public final void method1938(int arg0) {
        if (arg0 > -124) {
            this.field7076 = -119;
        }
        field7060++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IJ)Z")
    public final boolean method1937(int arg0, long arg1) {
        field7091++;
        if (arg0 < 74) {
            this.method1938(-68);
        }
        return true;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I")
    private final int method2935(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field7072 = false;
        }
        field7088++;
        return this.field7092 ? (class466.field6263 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
    public final void method1935(int arg0, boolean arg1) {
        field7085++;
        if (!this.field7054) {
            if (class64.field900 == null) {
                this.field7054 = true;
            } else if (this.field7079 == null) {
                try {
                    this.method2932(100);
                } catch (Exception var43) {
                    this.field7054 = true;
                }
            }
        }
        if (this.field7054) {
            this.method2930(false);
        } else if (arg0 < -51) {
            Graphics var3 = class262.field3311.getGraphics();
            if (var3 == null) {
                class262.field3311.repaint();
            } else {
                try {
                    int var4 = class14.field273.method1080((byte) -117);
                    String var5 = class14.field273.method1086((byte) 95);
                    if (class595.field8306 == null) {
                        class595.field8306 = class262.field3311.createImage(class356.field4586, class466.field6263);
                    }
                    Graphics var6 = class595.field8306.getGraphics();
                    var6.clearRect(0, 0, class356.field4586, class466.field6263);
                    int var7 = this.field7056.getWidth(null);
                    int var8 = this.field7067.getWidth(null);
                    int var9 = this.field7069.getWidth(null);
                    int var10 = this.field7056.getHeight(null);
                    int var11 = this.field7067.getHeight(null);
                    int var12 = this.field7069.getHeight(null);
                    var6.drawImage(this.field7056, this.method2931(var7, 126) - ((this.field7078 / 2) - this.field7074), this.method2935(var10, 0) - -this.field7084, null);
                    int var13 = this.field7074 + var7 - (this.field7078 / 2);
                    int var14 = this.field7078 / 2 + this.field7074;
                    for (int var15 = var13; var15 <= var14; var15 += var9) {
                        var6.drawImage(this.field7069, var15 + this.method2931(var7, 121) + this.field7074, this.method2935(var12, 0) - -this.field7084, null);
                    }
                    var6.drawImage(this.field7067, this.method2931(var8, 120) + this.field7074 + (this.field7078 / 2), this.method2935(var11, 0) - -this.field7084, null);
                    int var16 = this.field7058.getWidth(null);
                    int var17 = this.field7058.getHeight(null);
                    int var18 = this.field7089.getWidth(null);
                    int var19 = this.field7089.getHeight(null);
                    int var20 = this.field7066.getHeight(null);
                    int var21 = this.field7062.getWidth(null);
                    int var22 = this.field7062.getHeight(null);
                    int var23 = this.field7066.getWidth(null);
                    int var24 = this.field7068.getWidth(null);
                    int var25 = this.field7081.getWidth(null);
                    int var26 = this.method2931(this.field7061, 124) + this.field7076;
                    int var27 = this.method2935(this.field7055, 0) + this.field7083;
                    var6.drawImage(this.field7058, var26, var27 + ((this.field7055 - var17) / 2), null);
                    var6.drawImage(this.field7089, this.field7061 + var26 - var18, (-var19 + this.field7055) / 2 + var27, null);
                    if (this.field7059 == null) {
                        this.field7059 = class262.field3311.createImage(this.field7061 - var16 - var18, this.field7055);
                    }
                    Graphics var28 = this.field7059.getGraphics();
                    for (int var29 = 0; var29 < (this.field7061 - var16 - var18); var29 += var21) {
                        var28.drawImage(this.field7062, var29, 0, null);
                    }
                    for (int var30 = 0; var30 < (this.field7061 - var16 - var18); var30 += var23) {
                        var28.drawImage(this.field7066, var30, this.field7055 - var20, null);
                    }
                    int var31 = (this.field7061 - var16 - var18) * var4 / 100;
                    if (var31 > 0) {
                        Image var32 = class262.field3311.createImage(var31, this.field7055 - var22 - var20);
                        int var33 = var32.getWidth(null);
                        Graphics var34 = var32.getGraphics();
                        int var35 = this.field7057 * class287.method1708(255) / 10 % var24;
                        for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                            var34.drawImage(this.field7068, var36, 0, null);
                        }
                        var28.drawImage(var32, 0, var22, null);
                    }
                    int var38 = this.field7061 - (var16 + var18) - var31;
                    if (var38 > 0) {
                        Image var39 = class262.field3311.createImage(var38, this.field7055 - var20 - var22);
                        int var40 = var39.getWidth(null);
                        Graphics var41 = var39.getGraphics();
                        for (int var42 = 0; var42 < var40; var42 += var25) {
                            var41.drawImage(this.field7081, var42, 0, null);
                        }
                        var28.drawImage(var39, var31, var22, null);
                    }
                    var6.drawImage(this.field7059, var26 + var16, var27, null);
                    var6.setFont(this.field7079);
                    var6.setColor(this.field7070);
                    var6.drawString(var5, var26 + (this.field7061 - this.field7073.stringWidth(var5)) / 2, this.field7055 / 2 + var27 + this.field7080 + 4);
                    var3.drawImage(class595.field8306, 0, 0, null);
                } catch (Exception var44) {
                    this.field7054 = true;
                }
            }
        }
    }
}
