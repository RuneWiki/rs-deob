import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class83 implements class204 {

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field1247 = 1;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "Lin;")
    public static class380 field1257 = new class380(18, 6);

    @OriginalMember(owner = "client!lp", name = "R", descriptor = "Z")
    public static boolean field1263 = true;

    @OriginalMember(owner = "client!lp", name = "S", descriptor = "[Lsk;")
    public static class495[] field1264 = new class495[14];

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    private int field1230;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Ljava/awt/Color;")
    private Color field1227;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Ljava/awt/Font;")
    private Font field1234;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field1226;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field1223;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Ljava/awt/Image;")
    private Image field1225;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field1235;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field1237;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field1239;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field1241;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field1244;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field1249;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field1251;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field1253;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "Z")
    private boolean field1242;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "Z")
    private boolean field1250;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "Z")
    private boolean field1254;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
    public static void method730(int arg0) {
        field1264 = null;
        field1257 = null;
        int var1 = 41 % ((-arg0 - 30) / 59);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(JZ)Z")
    public final boolean method731(long arg0, boolean arg1) {
        if (!arg1) {
            this.method738(71);
        }
        field1262++;
        return true;
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)V")
    private final void method732(int arg0) {
        class628.method3590(class521.field7308[class263.field3712], class138.field2289.method2699(-1), class330.field4711[class263.field3712], -23902, class384.field5392[class263.field3712], class138.field2289.method2711((byte) 66));
        if (arg0 == 100) {
            field1224++;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)I")
    public final int method733(boolean arg0) {
        if (arg0) {
            return 16;
        } else {
            field1232++;
            return 100;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;Ljava/lang/Object;)Z")
    private final boolean method734(String arg0, byte arg1, Class arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field1228++;
        if (arg1 == 122) {
            Field var5 = arg2.getDeclaredField(arg0);
            return var5.getBoolean(arg3);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public final void method735(byte arg0) {
        if (arg0 >= -44) {
            field1264 = null;
        }
        field1246++;
        class562.method3274(111);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
    public final int method736(int arg0) {
        if (arg0 == 14383) {
            field1243++;
            return 0;
        } else {
            return 31;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)I")
    private final int method737(byte arg0, int arg1) {
        if (arg0 > -114) {
            field1257 = null;
        }
        field1261++;
        return this.field1242 ? (class448.field6174 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
    public final void method738(int arg0) {
        if (arg0 != 23978) {
            this.method737((byte) 3, -26);
        }
        field1229++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
    private final int method739(int arg0, int arg1) {
        field1256++;
        if (arg1 != 0) {
            this.method736(23);
        }
        return this.field1250 ? (class709.field9923 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
    public final void method740(int arg0, boolean arg1) {
        field1258++;
        if (!this.field1254) {
            if (class343.field4881 == null) {
                this.field1254 = true;
            } else if (this.field1234 == null) {
                try {
                    this.method743((byte) -18);
                } catch (Exception var43) {
                    this.field1254 = true;
                }
            }
        }
        if (this.field1254) {
            this.method732(arg0 ^ 0xFFFFA20C);
            return;
        }
        Graphics var3 = class213.field3128.getGraphics();
        if (var3 == null) {
            class213.field3128.repaint();
        } else {
            try {
                int var4 = class138.field2289.method2699(-1);
                String var5 = class138.field2289.method2711((byte) 30);
                if (class174.field2619 == null) {
                    class174.field2619 = class213.field3128.createImage(class709.field9923, class448.field6174);
                }
                Graphics var6 = class174.field2619.getGraphics();
                var6.clearRect(0, 0, class709.field9923, class448.field6174);
                int var7 = this.field1223.getWidth(null);
                int var8 = this.field1241.getWidth(null);
                int var9 = this.field1251.getWidth(null);
                int var10 = this.field1223.getHeight(null);
                int var11 = this.field1241.getHeight(null);
                int var12 = this.field1251.getHeight(null);
                var6.drawImage(this.field1223, this.method739(var7, 0) + this.field1231 - this.field1236 / 2, this.method737((byte) -123, var10) - -this.field1233, null);
                int var13 = this.field1231 - (this.field1236 / 2 - var7);
                int var14 = this.field1236 / 2 + this.field1231;
                for (int var15 = var13; var15 <= var14; var15 += var9) {
                    var6.drawImage(this.field1251, var15 + (this.method739(var7, 0) + this.field1231), this.method737((byte) -127, var12) + this.field1233, null);
                }
                var6.drawImage(this.field1241, this.method739(var8, 0) + (this.field1231 + (this.field1236 / 2)), this.method737((byte) -121, var11) + this.field1233, null);
                int var16 = this.field1253.getWidth(null);
                int var17 = this.field1253.getHeight(null);
                int var18 = this.field1225.getWidth(null);
                int var19 = this.field1225.getHeight(null);
                int var20 = this.field1249.getHeight(null);
                int var21 = this.field1244.getWidth(null);
                int var22 = this.field1244.getHeight(null);
                int var23 = this.field1249.getWidth(null);
                int var24 = this.field1239.getWidth(null);
                int var25 = this.field1237.getWidth(null);
                int var26 = this.method739(this.field1248, 0) + this.field1240;
                int var27 = this.method737((byte) -123, this.field1230) + this.field1245;
                var6.drawImage(this.field1253, var26, (this.field1230 - var17) / 2 + var27, null);
                var6.drawImage(this.field1225, var26 + this.field1248 - var18, (this.field1230 - var19) / 2 + var27, null);
                if (this.field1235 == null) {
                    this.field1235 = class213.field3128.createImage(this.field1248 - var16 - var18, this.field1230);
                }
                Graphics var28 = this.field1235.getGraphics();
                for (int var29 = 0; var29 < this.field1248 - var16 - var18; var29 += var21) {
                    var28.drawImage(this.field1244, var29, 0, null);
                }
                for (int var30 = 0; var30 < this.field1248 - var16 - var18; var30 += var23) {
                    var28.drawImage(this.field1249, var30, this.field1230 - var20, null);
                }
                int var31 = (this.field1248 - var16 - var18) * var4 / 100;
                if (var31 > 0) {
                    Image var32 = class213.field3128.createImage(var31, this.field1230 - var20 - var22);
                    int var33 = var32.getWidth(null);
                    Graphics var34 = var32.getGraphics();
                    int var35 = this.field1238 * class526.method3077((byte) -38) / 10 % var24;
                    for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                        var34.drawImage(this.field1239, var36, 0, null);
                    }
                    var28.drawImage(var32, 0, var22, null);
                }
                int var38 = this.field1248 - (var16 + var18 + var31);
                if (var38 > 0) {
                    Image var39 = class213.field3128.createImage(var38, this.field1230 - (var20 + var22));
                    int var40 = var39.getWidth(null);
                    Graphics var41 = var39.getGraphics();
                    for (int var42 = 0; var42 < var40; var42 += var25) {
                        var41.drawImage(this.field1237, var42, 0, null);
                    }
                    var28.drawImage(var39, var31, var22, null);
                }
                var6.drawImage(this.field1235, var16 + var26, var27, null);
                var6.setFont(this.field1234);
                var6.setColor(this.field1227);
                var6.drawString(var5, var26 + (this.field1248 - this.field1226.stringWidth(var5)) / 2, this.field1230 / 2 + var27 - (-4 - this.field1259));
                var3.drawImage(class174.field2619, 0, 0, null);
            } catch (Exception var44) {
                this.field1254 = true;
            }
        }
        if (arg0 != -23960) {
            this.method733(true);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
    private final Object method741(Class arg0, String arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        field1252++;
        if (arg2 != 0) {
            this.method733(false);
        }
        Field var4 = arg0.getDeclaredField(arg1);
        Object var5 = var4.get(class343.field4881);
        var4.set(class343.field4881, null);
        return var5;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)I")
    private final int method742(int arg0, Class arg1, String arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field1260++;
        Field var5 = arg1.getDeclaredField(arg2);
        return arg0 == 28023 ? var5.getInt(arg3) : -45;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
    private final void method743(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field1255++;
        if (arg0 != -18) {
            this.method737((byte) 34, 21);
        }
        Class var2 = class343.field4881.getClass();
        this.field1239 = (Image) this.method741(var2, "bar", 0);
        this.field1237 = (Image) this.method741(var2, "background", 0);
        this.field1253 = (Image) this.method741(var2, "left", arg0 ^ 0xFFFFFFEE);
        this.field1225 = (Image) this.method741(var2, "right", arg0 + 18);
        this.field1244 = (Image) this.method741(var2, "top", 0);
        this.field1249 = (Image) this.method741(var2, "bottom", 0);
        this.field1223 = (Image) this.method741(var2, "bodyLeft", 0);
        this.field1241 = (Image) this.method741(var2, "bodyRight", 0);
        this.field1251 = (Image) this.method741(var2, "bodyFill", arg0 ^ 0xFFFFFFEE);
        this.field1234 = (Font) this.method741(var2, "bf", 0);
        this.field1226 = (FontMetrics) this.method741(var2, "bfm", 0);
        this.field1227 = (Color) this.method741(var2, "colourtext", 0);
        Object var3 = this.method741(var2, "lb", 0);
        Class var4 = var3.getClass();
        this.field1250 = this.method734("xMiddle", (byte) 122, var4, var3);
        this.field1242 = this.method734("yMiddle", (byte) 122, var4, var3);
        this.field1240 = this.method742(28023, var4, "xOffset", var3);
        this.field1245 = this.method742(28023, var4, "yOffset", var3);
        this.field1248 = this.method742(28023, var4, "width", var3);
        this.field1230 = this.method742(28023, var4, "height", var3);
        this.field1231 = this.method742(arg0 ^ 0xFFFF9299, var4, "boxXOffset", var3);
        this.field1233 = this.method742(28023, var4, "boxYOffset", var3);
        this.field1236 = this.method742(28023, var4, "boxWidth", var3);
        this.field1259 = this.method742(28023, var4, "textYOffset", var3);
        this.field1238 = this.method742(arg0 + 28041, var4, "offsetPerTenCycles", var3);
    }
}
