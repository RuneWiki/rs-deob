import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class76 implements class334 {

    @OriginalMember(owner = "client!sga", name = "y", descriptor = "Lmw;")
    public static class517 field1048 = new class517(25, 2);

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    private int field1025;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!sga", name = "s", descriptor = "I")
    private int field1042;

    @OriginalMember(owner = "client!sga", name = "t", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "client!sga", name = "u", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!sga", name = "v", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!sga", name = "w", descriptor = "I")
    private int field1046;

    @OriginalMember(owner = "client!sga", name = "x", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!sga", name = "B", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!sga", name = "D", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!sga", name = "E", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!sga", name = "F", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client!sga", name = "J", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!sga", name = "K", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!sga", name = "L", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!sga", name = "N", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "Ljava/awt/Color;")
    private Color field1028;

    @OriginalMember(owner = "client!sga", name = "A", descriptor = "Ljava/awt/Font;")
    private Font field1050;

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field1040;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field1027;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field1029;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field1031;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field1036;

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field1039;

    @OriginalMember(owner = "client!sga", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field1041;

    @OriginalMember(owner = "client!sga", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field1052;

    @OriginalMember(owner = "client!sga", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field1056;

    @OriginalMember(owner = "client!sga", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field1058;

    @OriginalMember(owner = "client!sga", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field1062;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "Z")
    private boolean field1024;

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "Z")
    private boolean field1049;

    @OriginalMember(owner = "client!sga", name = "H", descriptor = "Z")
    private boolean field1057;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)I")
    public final int method305(int arg0) {
        int var2 = -12 / ((-arg0 - 62) / 42);
        field1063++;
        return 100;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method608(int arg0, String arg1) {
        field1044++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        if (arg0 != 70) {
            method612(-107);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && var3 > var4 + 2) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' - 65;
                }
                char var9 = arg1.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - 48;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 + 10 - 97;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + 10 - (65 - var9);
                }
                var4 += 2;
                if (var11 != 0 && class221.method1411((byte) -112, (byte) var11)) {
                    var2.append(class207.method1357(true, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BJ)Z")
    public final boolean method309(byte arg0, long arg1) {
        field1037++;
        if (arg0 >= -73) {
            method608(-87, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)I")
    public final int method311(byte arg0) {
        if (arg0 != 14) {
            method612(-56);
        }
        field1034++;
        return 0;
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)V")
    private final void method609(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field1059++;
        Class var2 = class552.field7624.getClass();
        this.field1058 = (Image) this.method611(var2, 2, "bar");
        this.field1041 = (Image) this.method611(var2, 2, "background");
        this.field1056 = (Image) this.method611(var2, 2, "left");
        this.field1062 = (Image) this.method611(var2, 2, "right");
        this.field1036 = (Image) this.method611(var2, 2, "top");
        this.field1029 = (Image) this.method611(var2, 2, "bottom");
        this.field1039 = (Image) this.method611(var2, 2, "bodyLeft");
        this.field1052 = (Image) this.method611(var2, 2, "bodyRight");
        this.field1031 = (Image) this.method611(var2, 2, "bodyFill");
        this.field1050 = (Font) this.method611(var2, 2, "bf");
        this.field1040 = (FontMetrics) this.method611(var2, 2, "bfm");
        this.field1028 = (Color) this.method611(var2, 2, "colourtext");
        Object var3 = this.method611(var2, 2, "lb");
        Class var4 = var3.getClass();
        int var5 = 34 / ((56 - arg0) / 50);
        this.field1049 = this.method613(70, "xMiddle", var4, var3);
        this.field1024 = this.method613(70, "yMiddle", var4, var3);
        this.field1046 = this.method615(var4, var3, "xOffset", (byte) -109);
        this.field1042 = this.method615(var4, var3, "yOffset", (byte) -89);
        this.field1061 = this.method615(var4, var3, "width", (byte) -125);
        this.field1043 = this.method615(var4, var3, "height", (byte) -104);
        this.field1030 = this.method615(var4, var3, "boxXOffset", (byte) -122);
        this.field1055 = this.method615(var4, var3, "boxYOffset", (byte) -117);
        this.field1033 = this.method615(var4, var3, "boxWidth", (byte) -71);
        this.field1025 = this.method615(var4, var3, "textYOffset", (byte) -100);
        this.field1060 = this.method615(var4, var3, "offsetPerTenCycles", (byte) -102);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)V")
    private final void method610(byte arg0) {
        if (arg0 != 14) {
            this.field1025 = 84;
        }
        class732.method4040(class113.field1538[class253.field3719], class325.field4619[class253.field3719], class180.field2361.method1008(arg0 ^ 0xFFFFFFC0), class689.field9210[class253.field3719], class180.field2361.method999(-1), -111);
        field1051++;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;")
    private final Object method611(Class arg0, int arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        field1032++;
        Field var4 = arg0.getDeclaredField(arg2);
        Object var5 = var4.get(class552.field7624);
        if (arg1 == 2) {
            var4.set(class552.field7624, null);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)V")
    public final void method307(int arg0) {
        class286.method1851(2647);
        if (arg0 != 8883) {
            this.method614((byte) 124, 67);
        }
        field1026++;
    }

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "(I)V")
    public static void method612(int arg0) {
        field1048 = null;
        if (arg0 != 70) {
            field1048 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Z")
    private final boolean method613(int arg0, String arg1, Class arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field1053++;
        if (arg0 != 70) {
            this.method307(-42);
        }
        Field var5 = arg2.getDeclaredField(arg1);
        return var5.getBoolean(arg3);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BI)I")
    private final int method614(byte arg0, int arg1) {
        field1045++;
        int var3 = -110 % ((5 - arg0) / 36);
        return this.field1049 ? (class460.field6558 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZB)V")
    public final void method313(boolean arg0, byte arg1) {
        if (!this.field1057) {
            if (class552.field7624 == null) {
                this.field1057 = true;
            } else if (this.field1050 == null) {
                try {
                    this.method609(arg1 + 108);
                } catch (Exception var43) {
                    this.field1057 = true;
                }
            }
        }
        if (arg1 != 2) {
            return;
        }
        field1054++;
        if (this.field1057) {
            this.method610((byte) 14);
            return;
        }
        Graphics var3 = class669.field8962.getGraphics();
        if (var3 == null) {
            class669.field8962.repaint();
            return;
        }
        try {
            int var4 = class180.field2361.method999(-1);
            String var5 = class180.field2361.method1008(-90);
            if (class592.field8097 == null) {
                class592.field8097 = class669.field8962.createImage(class460.field6558, class693.field9222);
            }
            Graphics var6 = class592.field8097.getGraphics();
            var6.clearRect(0, 0, class460.field6558, class693.field9222);
            int var7 = this.field1039.getWidth(null);
            int var8 = this.field1052.getWidth(null);
            int var9 = this.field1031.getWidth(null);
            int var10 = this.field1039.getHeight(null);
            int var11 = this.field1052.getHeight(null);
            int var12 = this.field1031.getHeight(null);
            var6.drawImage(this.field1039, this.method614((byte) -115, var7) + (this.field1030 - this.field1033 / 2), this.method616((byte) -92, var10) + this.field1055, null);
            int var13 = this.field1030 + var7 - this.field1033 / 2;
            int var14 = this.field1033 / 2 + this.field1030;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field1031, this.method614((byte) -104, var7) + this.field1030 + var15, this.method616((byte) -80, var12) - -this.field1055, null);
            }
            var6.drawImage(this.field1052, this.method614((byte) -95, var8) + (this.field1030 + (this.field1033 / 2)), this.method616((byte) -93, var11) + this.field1055, null);
            int var16 = this.field1056.getWidth(null);
            int var17 = this.field1056.getHeight(null);
            int var18 = this.field1062.getWidth(null);
            int var19 = this.field1062.getHeight(null);
            int var20 = this.field1029.getHeight(null);
            int var21 = this.field1036.getWidth(null);
            int var22 = this.field1036.getHeight(null);
            int var23 = this.field1029.getWidth(null);
            int var24 = this.field1058.getWidth(null);
            int var25 = this.field1041.getWidth(null);
            int var26 = this.method614((byte) 53, this.field1061) + this.field1046;
            int var27 = this.method616((byte) -120, this.field1043) + this.field1042;
            var6.drawImage(this.field1056, var26, (this.field1043 - var17) / 2 + var27, null);
            var6.drawImage(this.field1062, this.field1061 + var26 - var18, var27 - -((this.field1043 - var19) / 2), null);
            if (this.field1027 == null) {
                this.field1027 = class669.field8962.createImage(this.field1061 - var16 - var18, this.field1043);
            }
            Graphics var28 = this.field1027.getGraphics();
            for (int var29 = 0; var29 < this.field1061 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field1036, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field1061 - var16 - var18); var30 += var23) {
                var28.drawImage(this.field1029, var30, this.field1043 - var20, null);
            }
            int var31 = (this.field1061 - var16 - var18) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class669.field8962.createImage(var31, this.field1043 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field1060 * class733.method4043(96) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field1058, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field1061 - var16 - var31 - var18;
            if (var38 > 0) {
                Image var39 = class669.field8962.createImage(var38, this.field1043 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field1041, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field1027, var16 + var26, var27, null);
            var6.setFont(this.field1050);
            var6.setColor(this.field1028);
            var6.drawString(var5, var26 + (this.field1061 - this.field1040.stringWidth(var5)) / 2, var27 - (-(this.field1043 / 2) - 4 + -this.field1025));
            var3.drawImage(class592.field8097, 0, 0, null);
        } catch (Exception var44) {
            this.field1057 = true;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;B)I")
    private final int method615(Class arg0, Object arg1, String arg2, byte arg3) throws IllegalAccessException, NoSuchFieldException {
        field1047++;
        Field var5 = arg0.getDeclaredField(arg2);
        if (arg3 > -55) {
            this.method311((byte) 16);
        }
        return var5.getInt(arg1);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(BI)I")
    private final int method616(byte arg0, int arg1) {
        field1035++;
        if (arg0 > -68) {
            this.method306(8);
        }
        return this.field1024 ? (class693.field9222 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
    public final void method306(int arg0) {
        if (arg0 == 11133) {
            field1038++;
        }
    }
}
