import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class49 implements class178 {

    @OriginalMember(owner = "client!wba", name = "L", descriptor = "Lej;")
    public static class124 field1039 = new class124(10, -1);

    @OriginalMember(owner = "client!wba", name = "M", descriptor = "[Lke;")
    public static class598[] field1040 = new class598[2048];

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!wba", name = "J", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!wba", name = "P", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "Ljava/awt/Color;")
    private Color field1016;

    @OriginalMember(owner = "client!wba", name = "H", descriptor = "Ljava/awt/Font;")
    private Font field1035;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field1006;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field1008;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field1012;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field1014;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field1017;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field1019;

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field1023;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field1029;

    @OriginalMember(owner = "client!wba", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field1036;

    @OriginalMember(owner = "client!wba", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field1038;

    @OriginalMember(owner = "client!wba", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field1041;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "Z")
    private boolean field1002;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "Z")
    private boolean field1004;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "Z")
    private boolean field1027;

    @OriginalMember(owner = "client!wba", name = "O", descriptor = "[Lea;")
    public static class546[] field1042;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V")
    private final void method554(boolean arg0) throws IllegalAccessException, NoSuchFieldException {
        field1037++;
        Class var2 = class675.field9193.getClass();
        this.field1029 = (Image) this.method556(var2, 2, "bar");
        this.field1017 = (Image) this.method556(var2, 2, "background");
        this.field1014 = (Image) this.method556(var2, 2, "left");
        this.field1019 = (Image) this.method556(var2, 2, "right");
        this.field1036 = (Image) this.method556(var2, 2, "top");
        this.field1023 = (Image) this.method556(var2, 2, "bottom");
        this.field1012 = (Image) this.method556(var2, 2, "bodyLeft");
        this.field1008 = (Image) this.method556(var2, 2, "bodyRight");
        this.field1038 = (Image) this.method556(var2, 2, "bodyFill");
        this.field1035 = (Font) this.method556(var2, 2, "bf");
        this.field1006 = (FontMetrics) this.method556(var2, 2, "bfm");
        this.field1016 = (Color) this.method556(var2, 2, "colourtext");
        Object var3 = this.method556(var2, 2, "lb");
        Class var4 = var3.getClass();
        this.field1002 = this.method564(var3, arg0, var4, "xMiddle");
        this.field1027 = this.method564(var3, arg0, var4, "yMiddle");
        this.field1003 = this.method555(var3, var4, "xOffset", 95);
        this.field1033 = this.method555(var3, var4, "yOffset", -124);
        this.field1005 = this.method555(var3, var4, "width", 104);
        this.field1018 = this.method555(var3, var4, "height", -45);
        this.field1011 = this.method555(var3, var4, "boxXOffset", -91);
        this.field1022 = this.method555(var3, var4, "boxYOffset", -74);
        this.field1032 = this.method555(var3, var4, "boxWidth", 120);
        this.field1028 = this.method555(var3, var4, "textYOffset", -47);
        this.field1024 = this.method555(var3, var4, "offsetPerTenCycles", 107);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;I)I")
    private final int method555(Object arg0, Class arg1, String arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        int var5 = -38 / ((arg3 - 24) / 60);
        field1021++;
        Field var6 = arg1.getDeclaredField(arg2);
        return var6.getInt(arg0);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;")
    private final Object method556(Class arg0, int arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        if (arg1 != 2) {
            return null;
        }
        field1020++;
        Field var4 = arg0.getDeclaredField(arg2);
        Object var5 = var4.get(class675.field9193);
        var4.set(class675.field9193, null);
        return var5;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I")
    public final int method557(byte arg0) {
        if (arg0 == -58) {
            field1034++;
            return 0;
        } else {
            return -26;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BJ)Z")
    public final boolean method558(byte arg0, long arg1) {
        if (arg0 < 30) {
            this.method561((byte) 25, -63);
        }
        field1043++;
        return true;
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(I)V")
    public static void method559(int arg0) {
        field1039 = null;
        if (arg0 != 0) {
            field1040 = null;
        }
        field1042 = null;
        field1040 = null;
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != -19079) {
            this.field1005 = -66;
        }
        field1031++;
        return 100;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)I")
    private final int method561(byte arg0, int arg1) {
        field1015++;
        if (arg0 < 23) {
            this.field1012 = null;
        }
        return this.field1002 ? (class467.field6559 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public final void method562(int arg0) {
        field1025++;
        if (arg0 <= 84) {
            this.field1005 = -93;
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public final void method563(int arg0) {
        class16.method122(true);
        field1007++;
        if (arg0 != -9719) {
            this.field1004 = false;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/lang/Class;Ljava/lang/String;)Z")
    private final boolean method564(Object arg0, boolean arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        if (!arg1) {
            method565(4, -90, 15);
        }
        field1030++;
        Field var5 = arg2.getDeclaredField(arg3);
        return var5.getBoolean(arg0);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(III)Z")
    public static final boolean method565(int arg0, int arg1, int arg2) {
        field1009++;
        if (arg2 != 0) {
            field1042 = null;
        }
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
    public final void method566(boolean arg0, int arg1) {
        field1026++;
        if (arg1 > -69) {
            this.method561((byte) -61, -24);
        }
        if (!this.field1004) {
            if (class675.field9193 == null) {
                this.field1004 = true;
            } else if (this.field1035 == null) {
                try {
                    this.method554(true);
                } catch (Exception var43) {
                    this.field1004 = true;
                }
            }
        }
        if (this.field1004) {
            this.method568(33);
            return;
        }
        Graphics var3 = class458.field6458.getGraphics();
        if (var3 == null) {
            class458.field6458.repaint();
            return;
        }
        try {
            int var4 = class99.field1732.method1713((byte) 103);
            String var5 = class99.field1732.method1711(-9324);
            if (class755.field10546 == null) {
                class755.field10546 = class458.field6458.createImage(class467.field6559, class582.field7968);
            }
            Graphics var6 = class755.field10546.getGraphics();
            var6.clearRect(0, 0, class467.field6559, class582.field7968);
            int var7 = this.field1012.getWidth(null);
            int var8 = this.field1008.getWidth(null);
            int var9 = this.field1038.getWidth(null);
            int var10 = this.field1012.getHeight(null);
            int var11 = this.field1008.getHeight(null);
            int var12 = this.field1038.getHeight(null);
            var6.drawImage(this.field1012, this.method561((byte) 84, var7) - (this.field1032 / 2 - this.field1011), this.method567(var10, -6277) + this.field1022, null);
            int var13 = var7 + this.field1011 - (this.field1032 / 2);
            int var14 = this.field1032 / 2 + this.field1011;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field1038, var15 + (this.method561((byte) 77, var7) + this.field1011), this.method567(var12, -6277) + this.field1022, null);
            }
            var6.drawImage(this.field1008, this.method561((byte) 25, var8) - (-this.field1011 - this.field1032 / 2), this.method567(var11, -6277) - -this.field1022, null);
            int var16 = this.field1014.getWidth(null);
            int var17 = this.field1014.getHeight(null);
            int var18 = this.field1019.getWidth(null);
            int var19 = this.field1019.getHeight(null);
            int var20 = this.field1023.getHeight(null);
            int var21 = this.field1036.getWidth(null);
            int var22 = this.field1036.getHeight(null);
            int var23 = this.field1023.getWidth(null);
            int var24 = this.field1029.getWidth(null);
            int var25 = this.field1017.getWidth(null);
            int var26 = this.method561((byte) 122, this.field1005) + this.field1003;
            int var27 = this.method567(this.field1018, -6277) + this.field1033;
            var6.drawImage(this.field1014, var26, var27 + ((this.field1018 - var17) / 2), null);
            var6.drawImage(this.field1019, this.field1005 + var26 - var18, (this.field1018 - var19) / 2 + var27, null);
            if (this.field1041 == null) {
                this.field1041 = class458.field6458.createImage(this.field1005 - var16 - var18, this.field1018);
            }
            Graphics var28 = this.field1041.getGraphics();
            for (int var29 = 0; var29 < (this.field1005 - var16 - var18); var29 += var21) {
                var28.drawImage(this.field1036, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field1005 - (var16 + var18)); var30 += var23) {
                var28.drawImage(this.field1023, var30, this.field1018 - var20, null);
            }
            int var31 = (this.field1005 - var16 - var18) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class458.field6458.createImage(var31, this.field1018 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field1024 * class393.method2470(512) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field1029, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field1005 - var18 - var31 - var16;
            if (var38 > 0) {
                Image var39 = class458.field6458.createImage(var38, this.field1018 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field1017, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field1041, var16 + var26, var27, null);
            var6.setFont(this.field1035);
            var6.setColor(this.field1016);
            var6.drawString(var5, var26 + (this.field1005 - this.field1006.stringWidth(var5)) / 2, this.field1018 / 2 + 4 + var27 + this.field1028);
            var3.drawImage(class755.field10546, 0, 0, null);
        } catch (Exception var44) {
            this.field1004 = true;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)I")
    private final int method567(int arg0, int arg1) {
        field1010++;
        if (this.field1027) {
            return (class582.field7968 - arg0) / 2;
        } else {
            if (arg1 != -6277) {
                this.field1008 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "(I)V")
    private final void method568(int arg0) {
        field1013++;
        class538.method3094(class99.field1732.method1713((byte) 78), class481.field6715[class260.field3724], class99.field1732.method1711(-9324), class512.field7135[class260.field3724], (byte) -100, class142.field2342[class260.field3724]);
        if (arg0 != 33) {
            this.method557((byte) 1);
        }
    }
}
