import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class271 implements class516 {

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4054 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "[I")
    public static int[] field4062 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "Lhga;")
    public static class158 field4065 = new class158();

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4067 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!eo", name = "S", descriptor = "Lsb;")
    public static class266 field4069 = new class266(65, -1);

    @OriginalMember(owner = "client!eo", name = "T", descriptor = "[Lnr;")
    public static class53[] field4070 = new class53[75];

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    private int field4034;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    private int field4035;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    private int field4046;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
    private int field4048;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
    private int field4049;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
    private int field4051;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    private int field4059;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    private int field4064;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "Ljava/awt/Color;")
    private Color field4061;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "Ljava/awt/Font;")
    private Font field4044;

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field4055;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field4028;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field4031;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field4033;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field4038;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field4041;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field4042;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field4043;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field4045;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field4053;

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field4066;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Z")
    private boolean field4036;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Z")
    private boolean field4037;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "Z")
    private boolean field4060;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)I")
    private final int method1758(Object arg0, int arg1, String arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg1 == 10) {
            field4025++;
            Field var5 = arg3.getDeclaredField(arg2);
            return var5.getInt(arg0);
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V")
    private final void method1759(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field4032++;
        Class var2 = class416.field6017.getClass();
        this.field4045 = (Image) this.method1769(-127, "bar", var2);
        this.field4043 = (Image) this.method1769(-128, "background", var2);
        this.field4053 = (Image) this.method1769(arg0 ^ 0xFFFFFFC0, "left", var2);
        this.field4031 = (Image) this.method1769(-126, "right", var2);
        this.field4042 = (Image) this.method1769(-127, "top", var2);
        this.field4041 = (Image) this.method1769(arg0 - 192, "bottom", var2);
        this.field4038 = (Image) this.method1769(-127, "bodyLeft", var2);
        if (arg0 != 67) {
            this.field4049 = -100;
        }
        this.field4066 = (Image) this.method1769(-126, "bodyRight", var2);
        this.field4028 = (Image) this.method1769(-126, "bodyFill", var2);
        this.field4044 = (Font) this.method1769(-125, "bf", var2);
        this.field4055 = (FontMetrics) this.method1769(arg0 - 192, "bfm", var2);
        this.field4061 = (Color) this.method1769(arg0 ^ 0xFFFFFFC2, "colourtext", var2);
        Object var3 = this.method1769(-125, "lb", var2);
        Class var4 = var3.getClass();
        this.field4060 = this.method1771(var4, var3, -12712, "xMiddle");
        this.field4036 = this.method1771(var4, var3, -12712, "yMiddle");
        this.field4059 = this.method1758(var3, 10, "xOffset", var4);
        this.field4034 = this.method1758(var3, 10, "yOffset", var4);
        this.field4046 = this.method1758(var3, 10, "width", var4);
        this.field4048 = this.method1758(var3, arg0 - 57, "height", var4);
        this.field4049 = this.method1758(var3, 10, "boxXOffset", var4);
        this.field4051 = this.method1758(var3, 10, "boxYOffset", var4);
        this.field4064 = this.method1758(var3, arg0 ^ 0x49, "boxWidth", var4);
        this.field4040 = this.method1758(var3, 10, "textYOffset", var4);
        this.field4035 = this.method1758(var3, arg0 ^ 0x49, "offsetPerTenCycles", var4);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)I")
    private final int method1760(int arg0, int arg1) {
        if (arg1 > -89) {
            return 4;
        } else {
            field4057++;
            return this.field4060 ? (class506.field7173 - arg0) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([BZ)V")
    public static final void method1761(byte[] arg0, boolean arg1) {
        field4030++;
        if (!arg1) {
            field4065 = null;
        }
        class61 var2 = new class61(arg0);
        while (true) {
            while (true) {
                int var3 = var2.method732(-559537960);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class406.field5862 = new int[6];
                    var4[0] = var2.method723((byte) -25);
                    var4[1] = var2.method723((byte) -25);
                    var4[2] = var2.method723((byte) -25);
                    var4[3] = var2.method723((byte) -25);
                    var4[4] = var2.method723((byte) -25);
                    var4[5] = var2.method723((byte) -25);
                } else if (var3 == 4) {
                    int var5 = var2.method732(-559537960);
                    class54.field1203 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class54.field1203[var6] = var2.method723((byte) -25);
                        if (class54.field1203[var6] == 65535) {
                            class54.field1203[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method732(-559537960);
                    class287.field4277 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class287.field4277[var8] = var2.method723((byte) -25);
                        if (class287.field4277[var8] == 65535) {
                            class287.field4277[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    public static void method1762(int arg0) {
        field4054 = null;
        if (arg0 >= -108) {
            method1761(null, true);
        }
        field4067 = null;
        field4070 = null;
        field4069 = null;
        field4062 = null;
        field4065 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V")
    public final void method1763(boolean arg0, byte arg1) {
        if (!this.field4037) {
            if (class416.field6017 == null) {
                this.field4037 = true;
            } else if (this.field4044 == null) {
                try {
                    this.method1759((byte) 67);
                } catch (Exception var43) {
                    this.field4037 = true;
                }
            }
        }
        field4039++;
        if (this.field4037) {
            this.method1772((byte) 58);
            return;
        }
        Graphics var3 = class699.field9853.getGraphics();
        if (var3 == null) {
            class699.field9853.repaint();
        } else {
            try {
                int var4 = class119.field2122.method1882(arg1 ^ 0xFFFFFFBC);
                String var5 = class119.field2122.method1872(89);
                if (class394.field5759 == null) {
                    class394.field5759 = class699.field9853.createImage(class506.field7173, class310.field4626);
                }
                Graphics var6 = class394.field5759.getGraphics();
                int var7 = this.field4038.getWidth(null);
                int var8 = this.field4066.getWidth(null);
                int var9 = this.field4028.getWidth(null);
                int var10 = this.field4038.getHeight(null);
                int var11 = this.field4066.getHeight(null);
                int var12 = this.field4028.getHeight(null);
                var6.drawImage(this.field4038, this.method1760(var7, arg1 ^ 0x3D) + this.field4049 - (this.field4064 / 2), this.method1764(var10, -4) - -this.field4051, null);
                int var13 = this.field4049 + var7 - this.field4064 / 2;
                int var14 = this.field4064 / 2 + this.field4049 - var8;
                for (int var15 = var13; var15 <= var14; var15 += var9) {
                    var6.drawImage(this.field4028, this.method1760(var7, -123) + this.field4049 + var15, this.method1764(var12, -4) + this.field4051, null);
                }
                var6.drawImage(this.field4066, this.method1760(var8, -108) + this.field4049 + this.field4064 / 2, this.method1764(var11, -4) - -this.field4051, null);
                int var16 = this.field4053.getWidth(null);
                int var17 = this.field4053.getHeight(null);
                int var18 = this.field4031.getWidth(null);
                int var19 = this.field4031.getHeight(null);
                int var20 = this.field4041.getHeight(null);
                int var21 = this.field4042.getWidth(null);
                int var22 = this.field4042.getHeight(null);
                int var23 = this.field4041.getWidth(null);
                int var24 = this.field4045.getWidth(null);
                int var25 = this.field4043.getWidth(null);
                int var26 = this.method1760(this.field4046, -105) + this.field4059;
                int var27 = this.method1764(this.field4048, -4) + this.field4034;
                var6.drawImage(this.field4053, var26, (this.field4048 - var17) / 2 + var27, null);
                var6.drawImage(this.field4031, this.field4046 + var26 - var18, (-var19 + this.field4048) / 2 + var27, null);
                if (this.field4033 == null) {
                    this.field4033 = class699.field9853.createImage(this.field4046 - (var16 + var18), this.field4048);
                }
                Graphics var28 = this.field4033.getGraphics();
                for (int var29 = 0; var29 < (this.field4046 - var16 - var18); var29 += var21) {
                    var28.drawImage(this.field4042, var29, 0, null);
                }
                for (int var30 = 0; var30 < (this.field4046 - var16 - var18); var30 += var23) {
                    var28.drawImage(this.field4041, var30, this.field4048 - var20, null);
                }
                int var31 = (this.field4046 - var16 - var18) * var4 / 100;
                if (var31 > 0) {
                    Image var32 = class699.field9853.createImage(var31, this.field4048 - var22 - var20);
                    int var33 = var32.getWidth(null);
                    Graphics var34 = var32.getGraphics();
                    int var35 = this.field4035 * class14.method370(-3055) / 10 % var24;
                    for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                        var34.drawImage(this.field4045, var36, 0, null);
                    }
                    var28.drawImage(var32, 0, var22, null);
                }
                int var38 = this.field4046 - var16 - var18 - var31;
                if (var38 > 0) {
                    Image var39 = class699.field9853.createImage(var38, this.field4048 - var22 - var20);
                    int var40 = var39.getWidth(null);
                    Graphics var41 = var39.getGraphics();
                    for (int var42 = 0; var42 < var40; var42 += var25) {
                        var41.drawImage(this.field4043, var42, 0, null);
                    }
                    var28.drawImage(var39, var31, var22, null);
                }
                var6.drawImage(this.field4033, var16 + var26, var27, null);
                var6.setFont(this.field4044);
                var6.setColor(this.field4061);
                var6.drawString(var5, (this.field4046 - this.field4055.stringWidth(var5)) / 2 + var26, this.field4048 / 2 + var27 - -4 + this.field4040);
                var3.drawImage(class394.field5759, 0, 0, null);
            } catch (Exception var44) {
                this.field4037 = true;
            }
        }
        if (arg1 != -91) {
            this.field4043 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)I")
    private final int method1764(int arg0, int arg1) {
        if (arg1 == -4) {
            field4027++;
            return this.field4036 ? (class310.field4626 - arg0) / 2 : 0;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
    public final void method1765(byte arg0) {
        field4029++;
        class148.method1173(79);
        int var2 = -3 / ((arg0 + 24) / 34);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public final void method1766(int arg0) {
        if (arg0 == 32363) {
            field4050++;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I")
    public final int method1767(int arg0) {
        if (arg0 != -4979) {
            this.method1770((byte) 68);
        }
        field4063++;
        return 100;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(JI)Z")
    public final boolean method1768(long arg0, int arg1) {
        int var4 = 97 % ((17 - arg1) / 47);
        field4026++;
        return true;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
    private final Object method1769(int arg0, String arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
        field4058++;
        if (arg0 >= -124) {
            this.field4053 = null;
        }
        Field var4 = arg2.getDeclaredField(arg1);
        Object var5 = var4.get(class416.field6017);
        var4.set(class416.field6017, null);
        return var5;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
    public final int method1770(byte arg0) {
        if (arg0 > -27) {
            this.field4035 = -86;
        }
        field4052++;
        return 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;ILjava/lang/String;)Z")
    private final boolean method1771(Class arg0, Object arg1, int arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field4056++;
        Field var5 = arg0.getDeclaredField(arg3);
        if (arg2 != -12712) {
            this.method1766(-106);
        }
        return var5.getBoolean(arg1);
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(B)V")
    private final void method1772(byte arg0) {
        int var2 = -100 / ((-arg0 - 32) / 43);
        class74.method799((byte) -57, class119.field2122.method1882(25), field4067[class568.field8280], class384.field5652[class568.field8280], field4054[class568.field8280], class119.field2122.method1872(106));
        field4047++;
    }
}
