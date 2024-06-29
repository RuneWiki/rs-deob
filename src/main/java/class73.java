import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class73 implements class211 {

    @OriginalMember(owner = "client!kca", name = "A", descriptor = "F")
    public static float field1298;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!kca", name = "u", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client!kca", name = "B", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!kca", name = "D", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client!kca", name = "E", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!kca", name = "F", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!kca", name = "G", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!kca", name = "H", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "Ljava/awt/Color;")
    private Color field1281;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "Ljava/awt/Font;")
    private Font field1279;

    @OriginalMember(owner = "client!kca", name = "t", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field1291;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field1272;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Ljava/awt/Image;")
    private Image field1274;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field1275;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field1276;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field1280;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field1283;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field1285;

    @OriginalMember(owner = "client!kca", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field1294;

    @OriginalMember(owner = "client!kca", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field1295;

    @OriginalMember(owner = "client!kca", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field1296;

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "Z")
    private boolean field1300;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;BLjava/lang/Class;)I", line = 3)
    private final int method694(String arg0, Object arg1, byte arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field1304++;
        Field var5 = arg3.getDeclaredField(arg0);
        if (arg2 != 81) {
            this.method703(119);
        }
        return var5.getInt(arg1);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V", line = 23)
    private final void method695(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field1290++;
        Class var2 = class421.field6129.getClass();
        this.field1280 = (Image) this.method698(var2, (byte) -122, "bar");
        this.field1275 = (Image) this.method698(var2, (byte) 118, "background");
        this.field1283 = (Image) this.method698(var2, (byte) -126, "left");
        this.field1296 = (Image) this.method698(var2, (byte) -121, "right");
        this.field1295 = (Image) this.method698(var2, (byte) -128, "top");
        if (arg0 != 30) {
            return;
        }
        this.field1285 = (Image) this.method698(var2, (byte) 101, "bottom");
        this.field1274 = (Image) this.method698(var2, (byte) -112, "bodyLeft");
        this.field1272 = (Image) this.method698(var2, (byte) -124, "bodyRight");
        this.field1276 = (Image) this.method698(var2, (byte) 94, "bodyFill");
        this.field1279 = (Font) this.method698(var2, (byte) 65, "bf");
        this.field1291 = (FontMetrics) this.method698(var2, (byte) 100, "bfm");
        this.field1281 = (Color) this.method698(var2, (byte) -117, "colourtext");
        Object var3 = this.method698(var2, (byte) 27, "lb");
        Class var4 = var3.getClass();
        this.field1293 = this.method694("xOffset", var3, (byte) 81, var4);
        this.field1278 = this.method694("yOffset", var3, (byte) 81, var4);
        this.field1302 = this.method694("width", var3, (byte) 81, var4);
        this.field1284 = this.method694("height", var3, (byte) 81, var4);
        this.field1273 = this.method694("boxXOffset", var3, (byte) 81, var4);
        this.field1287 = this.method694("boxYOffset", var3, (byte) 81, var4);
        this.field1277 = this.method694("boxWidth", var3, (byte) 81, var4);
        this.field1297 = this.method694("textYOffset", var3, (byte) 81, var4);
        this.field1301 = this.method694("offsetPerTenCycles", var3, (byte) 81, var4);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IJ)Z", line = 61)
    public final boolean method696(int arg0, long arg1) {
        if (arg0 >= -31) {
            this.field1296 = null;
        }
        field1289++;
        return true;
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V", line = 74)
    public static final void method697(int arg0) {
        if (arg0 == 0) {
            if (class179.field2550 == 2) {
                class513.field7248[0].method3058(class295.field4329[0]);
                class513.field7248[1].method3058(class295.field4329[1]);
            } else if (class179.field2550 == 3) {
                class513.field7248[0].method3058(class295.field4329[0]);
                class513.field7248[1].method3058(class295.field4329[1]);
                class513.field7248[2].method3058(class295.field4329[2]);
            } else {
                class513.field7248[0].method3058(class295.field4329[0]);
                class513.field7248[1].method3058(class295.field4329[1]);
                class513.field7248[2].method3058(class295.field4329[2]);
                class513.field7248[3].method3058(class295.field4329[3]);
            }
        } else if (arg0 == 1) {
            if (class179.field2550 == 2) {
                class513.field7248[0].method3058(class295.field4329[2]);
            } else if (class179.field2550 == 3) {
                class513.field7248[0].method3058(class295.field4329[3]);
                class513.field7248[1].method3058(class295.field4329[4]);
            } else {
                class513.field7248[0].method3058(class295.field4329[4]);
                class513.field7248[1].method3058(class295.field4329[5]);
                class513.field7248[2].method3058(class295.field4329[6]);
            }
        } else if (arg0 == 2) {
            if (class179.field2550 == 2) {
                class513.field7248[0].method3058(class295.field4329[3]);
                return;
            }
            if (class179.field2550 == 3) {
                class513.field7248[0].method3058(class295.field4329[5]);
                return;
            }
            class513.field7248[0].method3058(class295.field4329[7]);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Ljava/lang/Object;", line = 145)
    private final Object method698(Class arg0, byte arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        field1299++;
        Field var4 = arg0.getDeclaredField(arg2);
        Object var5 = var4.get(class421.field6129);
        var4.set(class421.field6129, null);
        int var6 = -42 % ((arg1 + 63) / 48);
        return var5;
    }

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "(I)V", line = 162)
    private final void method699(int arg0) {
        field1288++;
        if (arg0 <= 27) {
            this.field1274 = null;
        }
        class260.method1714(class36.field619[class340.field5001], class27.field400.method3387(0), class64.field1209[class340.field5001], class327.field4844[class340.field5001], class27.field400.method3386(false), 301);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)I", line = 181)
    public final int method700(boolean arg0) {
        field1282++;
        return arg0 ? 56 : 0;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)I", line = 198)
    public final int method701(int arg0) {
        field1292++;
        if (arg0 < 116) {
            this.field1287 = -11;
        }
        return 100;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V", line = 210)
    public final void method702(int arg0) {
        if (arg0 > -10) {
            this.method700(false);
        }
        field1305++;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V", line = 224)
    public final void method703(int arg0) {
        if (arg0 > 59) {
            class169.method1165(0);
            field1286++;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZB)V", line = 242)
    public final void method704(boolean arg0, byte arg1) {
        if (!this.field1300) {
            if (class421.field6129 == null) {
                this.field1300 = true;
            } else if (this.field1279 == null) {
                try {
                    this.method695((byte) 30);
                } catch (Exception var43) {
                    this.field1300 = true;
                }
            }
        }
        field1303++;
        if (this.field1300) {
            this.method699(arg1 ^ 0xFFFFFF86);
            return;
        }
        if (arg1 != -48) {
            method697(115);
        }
        Graphics var3 = class31.field486.getGraphics();
        if (var3 == null) {
            class31.field486.repaint();
            return;
        }
        try {
            int var4 = class27.field400.method3386(false);
            String var5 = class27.field400.method3387(0);
            if (class255.field3920 == null) {
                class255.field3920 = class31.field486.createImage(class487.field6930, class31.field494);
            }
            Graphics var6 = class255.field3920.getGraphics();
            int var7 = this.field1274.getWidth(null);
            int var8 = this.field1272.getWidth(null);
            int var9 = this.field1276.getWidth(null);
            int var10 = this.field1274.getHeight(null);
            int var11 = this.field1272.getHeight(null);
            int var12 = this.field1276.getHeight(null);
            var6.drawImage(this.field1274, (class487.field6930 - var7) / 2 + this.field1273 - (this.field1277 / 2), (-var10 + class31.field494) / 2 - -this.field1287, null);
            int var13 = this.field1273 + var7 - (this.field1277 / 2);
            int var14 = this.field1277 / 2 + this.field1273 - var8;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field1276, (class487.field6930 - var7) / 2 + this.field1273 + var15, (-var12 + class31.field494) / 2 + this.field1287, null);
            }
            var6.drawImage(this.field1272, (class487.field6930 - var8) / 2 + this.field1277 / 2 + this.field1273, (-var11 + class31.field494) / 2 + this.field1287, null);
            int var16 = this.field1283.getWidth(null);
            int var17 = this.field1283.getHeight(null);
            int var18 = this.field1296.getWidth(null);
            int var19 = this.field1296.getHeight(null);
            int var20 = this.field1285.getHeight(null);
            int var21 = this.field1295.getWidth(null);
            int var22 = this.field1295.getHeight(null);
            int var23 = this.field1285.getWidth(null);
            int var24 = this.field1280.getWidth(null);
            int var25 = this.field1275.getWidth(null);
            int var26 = (class487.field6930 - this.field1302) / 2 + this.field1293;
            int var27 = (class31.field494 - this.field1284) / 2 + this.field1278;
            var6.drawImage(this.field1283, var26, (this.field1284 - var17) / 2 + var27, null);
            var6.drawImage(this.field1296, this.field1302 + var26 - var18, (-var19 + this.field1284) / 2 + var27, null);
            if (this.field1294 == null) {
                this.field1294 = class31.field486.createImage(this.field1302 - var16 - var18, this.field1284);
            }
            Graphics var28 = this.field1294.getGraphics();
            for (int var29 = 0; var29 < (this.field1302 - var18 - var16); var29 += var21) {
                var28.drawImage(this.field1295, var29, 0, null);
            }
            for (int var30 = 0; var30 < this.field1302 - var16 - var18; var30 += var23) {
                var28.drawImage(this.field1285, var30, this.field1284 - var20, null);
            }
            int var31 = (this.field1302 - var16 - var18) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class31.field486.createImage(var31, this.field1284 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field1301 * class372.method2246(-116) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field1280, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field1302 - var31 - var16 - var18;
            if (var38 > 0) {
                Image var39 = class31.field486.createImage(var38, this.field1284 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field1275, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field1294, var16 + var26, var27, null);
            var6.setFont(this.field1279);
            var6.setColor(this.field1281);
            var6.drawString(var5, var26 + (this.field1302 - this.field1291.stringWidth(var5)) / 2, var27 - -(this.field1284 / 2) - -4 + this.field1297);
            var3.drawImage(class255.field3920, 0, 0, null);
        } catch (Exception var44) {
            this.field1300 = true;
        }
    }
}
