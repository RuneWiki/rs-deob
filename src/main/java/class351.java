import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class351 implements class687 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    private int field4487;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    private int field4494;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    private int field4502;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    private int field4504;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    private int field4511;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "Ljava/awt/Color;")
    private Color field4512;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "Ljava/awt/Font;")
    private Font field4510;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field4496;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field4484;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field4491;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field4492;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Ljava/awt/Image;")
    private Image field4493;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field4495;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field4500;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field4501;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field4505;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field4506;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field4516;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "Z")
    private boolean field4509;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;")
    private final Object method2011(String arg0, Class arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        field4497++;
        if (arg2 == 214) {
            Field var4 = arg1.getDeclaredField(arg0);
            Object var5 = var4.get(class348.field4462);
            var4.set(class348.field4462, null);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZJ)Z")
    public final boolean method548(boolean arg0, long arg1) {
        field4486++;
        return !arg0;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public final void method549(int arg0) {
        field4498++;
        if (arg0 != 25742) {
            this.field4493 = null;
        }
        class223.method1409((byte) -64);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public final void method546(int arg0) {
        field4508++;
        if (arg0 != -369) {
            method2015(96, false, null, false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V")
    public final void method550(boolean arg0, int arg1) {
        if (!this.field4509) {
            if (class348.field4462 == null) {
                this.field4509 = true;
            } else if (this.field4510 == null) {
                try {
                    this.method2012(-13288);
                } catch (Exception var41) {
                    this.field4509 = true;
                }
            }
        }
        field4515++;
        if (this.field4509) {
            this.method2014(arg1 ^ 0xFFFFFB71);
            return;
        }
        Graphics var3 = class524.field6827.getGraphics();
        if (var3 == null) {
            class524.field6827.repaint();
        } else {
            try {
                int var4 = class412.field5313.method753((byte) -4);
                String var5 = class412.field5313.method750(121);
                if (class415.field5335 == null) {
                    class415.field5335 = class524.field6827.createImage(class519.field6796, class461.field6047);
                }
                Graphics var6 = class415.field5335.getGraphics();
                int var7 = this.field4493.getWidth(null);
                int var8 = this.field4492.getWidth(null);
                int var9 = this.field4505.getWidth(null);
                int var10 = this.field4493.getHeight(null);
                int var11 = this.field4492.getHeight(null);
                int var12 = this.field4505.getHeight(null);
                var6.drawImage(this.field4493, (class519.field6796 - var7) / 2 - 161, (-var10 + class461.field6047) / 2 + 214, null);
                for (int var13 = -144; var13 <= 144; var13 += 32) {
                    var6.drawImage(this.field4505, (class519.field6796 - var9) / 2 - var13, (class461.field6047 - var12) / 2 + 214, null);
                }
                var6.drawImage(this.field4492, (class519.field6796 - var8) / 2 + 161, (class461.field6047 - var11) / 2 + 214, null);
                int var14 = this.field4491.getWidth(null);
                int var15 = this.field4491.getHeight(null);
                int var16 = this.field4495.getWidth(null);
                int var17 = this.field4495.getHeight(null);
                int var18 = this.field4500.getHeight(null);
                int var19 = this.field4516.getWidth(null);
                int var20 = this.field4516.getHeight(null);
                int var21 = this.field4500.getWidth(null);
                int var22 = this.field4484.getWidth(null);
                int var23 = this.field4506.getWidth(null);
                int var24 = (class519.field6796 - this.field4494) / 2 + this.field4502;
                int var25 = (class461.field6047 - this.field4487) / 2 + this.field4504;
                var6.drawImage(this.field4491, var24, (this.field4487 - var15) / 2 + var25, null);
                var6.drawImage(this.field4495, this.field4494 + var24 - var16, var25 - -((-var17 + this.field4487) / 2), null);
                if (this.field4501 == null) {
                    this.field4501 = class524.field6827.createImage(this.field4494 - var14 - var16, this.field4487);
                }
                Graphics var26 = this.field4501.getGraphics();
                for (int var27 = 0; var27 < this.field4494 - var16 - var14; var27 += var19) {
                    var26.drawImage(this.field4516, var27, 0, null);
                }
                for (int var28 = 0; var28 < this.field4494 - var14 - var16; var28 += var21) {
                    var26.drawImage(this.field4500, var28, this.field4487 - var18, null);
                }
                int var29 = (this.field4494 - (var14 + var16)) * var4 / 100;
                if (var29 > 0) {
                    Image var30 = class524.field6827.createImage(var29, this.field4487 - var18 - var20);
                    int var31 = var30.getWidth(null);
                    Graphics var32 = var30.getGraphics();
                    int var33 = this.field4511 * class499.method2702(true) / 10 % var22;
                    for (int var34 = var33 - var22; var34 < var31; var34 += var22) {
                        var32.drawImage(this.field4484, var34, 0, null);
                    }
                    var26.drawImage(var30, 0, var20, null);
                }
                int var36 = this.field4494 - var16 - var29 - var14;
                if (var36 > 0) {
                    Image var37 = class524.field6827.createImage(var36, this.field4487 - var20 - var18);
                    int var38 = var37.getWidth(null);
                    Graphics var39 = var37.getGraphics();
                    for (int var40 = 0; var40 < var38; var40 += var23) {
                        var39.drawImage(this.field4506, var40, 0, null);
                    }
                    var26.drawImage(var37, var29, var20, null);
                }
                var6.drawImage(this.field4501, var14 + var24, var25, null);
                var6.setFont(this.field4510);
                var6.setColor(this.field4512);
                var6.drawString(var5, (this.field4494 - this.field4496.stringWidth(var5)) / 2 + var24, this.field4487 / 2 + this.field4503 + 4 + var25);
                var3.drawImage(class415.field5335, 0, 0, null);
            } catch (Exception var42) {
                this.field4509 = true;
            }
        }
        if (arg1 != 1277) {
            this.field4503 = 23;
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    private final void method2012(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field4485++;
        Class var2 = class348.field4462.getClass();
        this.field4484 = (Image) this.method2011("bar", var2, 214);
        this.field4506 = (Image) this.method2011("background", var2, 214);
        this.field4491 = (Image) this.method2011("left", var2, arg0 + 13502);
        this.field4495 = (Image) this.method2011("right", var2, 214);
        this.field4516 = (Image) this.method2011("top", var2, 214);
        this.field4500 = (Image) this.method2011("bottom", var2, 214);
        this.field4493 = (Image) this.method2011("bodyLeft", var2, 214);
        this.field4492 = (Image) this.method2011("bodyRight", var2, arg0 + 13502);
        if (arg0 != -13288) {
            this.field4511 = -75;
        }
        this.field4505 = (Image) this.method2011("bodyFill", var2, 214);
        this.field4510 = (Font) this.method2011("bf", var2, 214);
        this.field4496 = (FontMetrics) this.method2011("bfm", var2, 214);
        this.field4512 = (Color) this.method2011("colourtext", var2, arg0 + 13502);
        Object var3 = this.method2011("lb", var2, 214);
        Class var4 = var3.getClass();
        this.field4502 = this.method2016(-144, "xOffset", var4, var3);
        this.field4504 = this.method2016(-144, "yOffset", var4, var3);
        this.field4494 = this.method2016(-144, "width", var4, var3);
        this.field4487 = this.method2016(arg0 + 13144, "height", var4, var3);
        this.field4503 = this.method2016(-144, "textYOffset", var4, var3);
        this.field4511 = this.method2016(arg0 + 13144, "offsetPerTenCycles", var4, var3);
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
    public static final void method2013(int arg0) {
        class700.field9771.method1529((byte) -114);
        field4514++;
        class2.field9.method1373(-115);
        class120.field1550.method267(0);
        class348.field4436.method1902(19);
        class646.field8998.method518(5);
        class232.field3109.method1287((byte) -43);
        class552.field7163.method3036(94);
        class91.field1202.method982((byte) 126);
        class388.field4971.method2186(-1);
        class543.field7052.method3024(false);
        class536.field6983.method93(32156);
        class414.field5331.method2893(arg0 ^ 0xFFFFAC52);
        class650.field9060.method2287(10618);
        class97.field1307.method1745(1);
        class191.field2445.method1072((byte) -66);
        class382.field4898.method2021((byte) -118);
        class277.field3629.method2493((byte) 123);
        class64.field882.method3730((byte) -55);
        class122.field1588.method3639((byte) -120);
        if (arg0 != -17408) {
            return;
        }
        class671.field9319.method1801((byte) 127);
        class2.method5((byte) -103);
        class658.method3619(-3031);
        class138.method1039((byte) -2);
        class230.method1447(55);
        class242.method1521(-97);
        class149.field1923.method3658(0);
        class379.field4852.method3658(0);
        class425.field5516.method3658(0);
        class703.field9805.method3658(0);
        class709.field9913.method3658(arg0 + 17408);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I")
    public final int method545(int arg0) {
        field4488++;
        if (arg0 != -17121) {
            method2013(110);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
    private final void method2014(int arg0) {
        field4490++;
        if (arg0 <= -20) {
            class364.method2083(class581.field7911[class673.field9324], 2, class17.field194[class673.field9324], class536.field6981[class673.field9324], class412.field5313.method753((byte) -52), class412.field5313.method750(123));
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLoa;Z)Lta;")
    public static final class597 method2015(int arg0, boolean arg1, class43 arg2, boolean arg3) {
        field4489++;
        class435 var4 = class38.method306(false, arg3, arg2, arg0);
        if (var4 == null) {
            return null;
        } else if (arg1) {
            return var4.field5642;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)I")
    private final int method2016(int arg0, String arg1, Class arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field4507++;
        Field var5 = arg2.getDeclaredField(arg1);
        if (arg0 != -144) {
            this.field4505 = null;
        }
        return var5.getInt(arg3);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
    public final int method547(byte arg0) {
        field4513++;
        return arg0 == -17 ? 100 : -94;
    }
}
