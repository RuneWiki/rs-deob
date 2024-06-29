import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class352 implements class381 {

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lbh;")
    public static class538 field4523 = new class538(3000000, 200);

    @OriginalMember(owner = "client!b", name = "N", descriptor = "Lqk;")
    public static class148 field4546 = new class148(14, 3);

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field4547 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    private int field4530;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    private int field4537;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    private int field4539;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    private int field4540;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    private int field4542;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/awt/Color;")
    private Color field4518;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Ljava/awt/Font;")
    private Font field4508;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field4526;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field4507;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field4510;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field4514;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field4515;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field4531;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field4532;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field4533;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field4538;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "Ljava/awt/Image;")
    private Image field4544;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field4545;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
    private boolean field4517;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Z")
    private boolean field4525;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Z")
    private boolean field4534;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "[I")
    public static int[] field4548;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "[[[Lch;")
    public static class38[][][] field4549;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    private final void method2000(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field4541++;
        Class var2 = class622.field8847.getClass();
        this.field4510 = (Image) this.method2006((byte) 62, var2, "bar");
        this.field4515 = (Image) this.method2006((byte) 84, var2, "background");
        this.field4532 = (Image) this.method2006((byte) 73, var2, "left");
        this.field4514 = (Image) this.method2006((byte) 39, var2, "right");
        this.field4538 = (Image) this.method2006((byte) 29, var2, "top");
        this.field4507 = (Image) this.method2006((byte) 56, var2, "bottom");
        this.field4531 = (Image) this.method2006((byte) 111, var2, "bodyLeft");
        this.field4544 = (Image) this.method2006((byte) 95, var2, "bodyRight");
        this.field4545 = (Image) this.method2006((byte) 97, var2, "bodyFill");
        this.field4508 = (Font) this.method2006((byte) 38, var2, "bf");
        this.field4526 = (FontMetrics) this.method2006((byte) 117, var2, "bfm");
        this.field4518 = (Color) this.method2006((byte) 46, var2, "colourtext");
        Object var3 = this.method2006((byte) 66, var2, "lb");
        if (arg0 != 100) {
            this.field4544 = null;
        }
        Class var4 = var3.getClass();
        this.field4517 = this.method2007("xMiddle", -16101, var3, var4);
        this.field4525 = this.method2007("yMiddle", -16101, var3, var4);
        this.field4522 = this.method2002(var3, (byte) -125, var4, "xOffset");
        this.field4509 = this.method2002(var3, (byte) -75, var4, "yOffset");
        this.field4530 = this.method2002(var3, (byte) 121, var4, "width");
        this.field4537 = this.method2002(var3, (byte) -78, var4, "height");
        this.field4539 = this.method2002(var3, (byte) -50, var4, "boxXOffset");
        this.field4542 = this.method2002(var3, (byte) 121, var4, "boxYOffset");
        this.field4540 = this.method2002(var3, (byte) 100, var4, "boxWidth");
        this.field4524 = this.method2002(var3, (byte) -49, var4, "textYOffset");
        this.field4527 = this.method2002(var3, (byte) -36, var4, "offsetPerTenCycles");
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
    private final void method2001(byte arg0) {
        class93.method561(class282.field3739[class225.field3153], class562.field7995.method1584((byte) -125), class562.field7995.method1578(-71), -2, class337.field4334[class225.field3153], class408.field5670[class225.field3153]);
        if (arg0 >= -32) {
            this.field4508 = null;
        }
        field4516++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Object;BLjava/lang/Class;Ljava/lang/String;)I")
    private final int method2002(Object arg0, byte arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field4519++;
        int var5 = -101 / ((37 - arg1) / 37);
        Field var6 = arg2.getDeclaredField(arg3);
        return var6.getInt(arg0);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method2003(int arg0) {
        int var1 = -118 / ((50 - arg0) / 49);
        field4523 = null;
        field4548 = null;
        field4546 = null;
        field4549 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
    public final void method255(boolean arg0, int arg1) {
        if (!this.field4534) {
            if (class622.field8847 == null) {
                this.field4534 = true;
            } else if (this.field4508 == null) {
                try {
                    this.method2000(100);
                } catch (Exception var43) {
                    this.field4534 = true;
                }
            }
        }
        field4511++;
        if (this.field4534) {
            this.method2001((byte) -84);
            return;
        }
        if (arg1 != -21878) {
            this.method2004((byte) -68, 70);
        }
        Graphics var3 = class438.field6016.getGraphics();
        if (var3 == null) {
            class438.field6016.repaint();
            return;
        }
        try {
            int var4 = class562.field7995.method1578(-83);
            String var5 = class562.field7995.method1584((byte) 0);
            if (class216.field3067 == null) {
                class216.field3067 = class438.field6016.createImage(class58.field807, class582.field8281);
            }
            Graphics var6 = class216.field3067.getGraphics();
            int var7 = this.field4531.getWidth(null);
            int var8 = this.field4544.getWidth(null);
            int var9 = this.field4545.getWidth(null);
            int var10 = this.field4531.getHeight(null);
            int var11 = this.field4544.getHeight(null);
            int var12 = this.field4545.getHeight(null);
            var6.drawImage(this.field4531, this.method2005(arg1 + 21878, var7) + this.field4539 - this.field4540 / 2, this.method2004((byte) 6, var10) + this.field4542, null);
            int var13 = this.field4539 + var7 - (this.field4540 / 2);
            int var14 = this.field4540 / 2 + this.field4539;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field4545, this.method2005(0, var7) + (this.field4539 + var15), this.method2004((byte) 6, var12) - -this.field4542, null);
            }
            var6.drawImage(this.field4544, this.method2005(0, var8) + (this.field4539 + (this.field4540 / 2)), this.method2004((byte) 6, var11) + this.field4542, null);
            int var16 = this.field4532.getWidth(null);
            int var17 = this.field4532.getHeight(null);
            int var18 = this.field4514.getWidth(null);
            int var19 = this.field4514.getHeight(null);
            int var20 = this.field4507.getHeight(null);
            int var21 = this.field4538.getWidth(null);
            int var22 = this.field4538.getHeight(null);
            int var23 = this.field4507.getWidth(null);
            int var24 = this.field4510.getWidth(null);
            int var25 = this.field4515.getWidth(null);
            int var26 = this.method2005(0, this.field4530) + this.field4522;
            int var27 = this.method2004((byte) 6, this.field4537) + this.field4509;
            var6.drawImage(this.field4532, var26, var27 + ((this.field4537 - var17) / 2), null);
            var6.drawImage(this.field4514, this.field4530 + var26 - var18, (-var19 + this.field4537) / 2 + var27, null);
            if (this.field4533 == null) {
                this.field4533 = class438.field6016.createImage(this.field4530 - var16 - var18, this.field4537);
            }
            Graphics var28 = this.field4533.getGraphics();
            for (int var29 = 0; var29 < this.field4530 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field4538, var29, 0, null);
            }
            for (int var30 = 0; var30 < this.field4530 - (var16 + var18); var30 += var23) {
                var28.drawImage(this.field4507, var30, this.field4537 - var20, null);
            }
            int var31 = (this.field4530 - var16 - var18) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class438.field6016.createImage(var31, this.field4537 - var22 - var20);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field4527 * class162.method1010(-33) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field4510, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field4530 - var16 - var18 - var31;
            if (var38 > 0) {
                Image var39 = class438.field6016.createImage(var38, this.field4537 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field4515, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field4533, var26 + var16, var27, null);
            var6.setFont(this.field4508);
            var6.setColor(this.field4518);
            var6.drawString(var5, var26 + ((this.field4530 - this.field4526.stringWidth(var5)) / 2), this.field4537 / 2 + 4 + this.field4524 + var27);
            var3.drawImage(class216.field3067, 0, 0, null);
        } catch (Exception var44) {
            this.field4534 = true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
    public final int method253(int arg0) {
        if (arg0 != -4505) {
            this.field4542 = -80;
        }
        field4521++;
        return 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I")
    private final int method2004(byte arg0, int arg1) {
        if (arg0 != 6) {
            this.field4533 = null;
        }
        field4543++;
        return this.field4525 ? (class582.field8281 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
    private final int method2005(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2004((byte) -65, 96);
        }
        field4528++;
        return this.field4517 ? (class58.field807 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;")
    private final Object method2006(byte arg0, Class arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        field4513++;
        if (arg0 < 24) {
            return null;
        } else {
            Field var4 = arg1.getDeclaredField(arg2);
            Object var5 = var4.get(class622.field8847);
            var4.set(class622.field8847, null);
            return var5;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Class;)Z")
    private final boolean method2007(String arg0, int arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field4529++;
        if (arg1 == -16101) {
            Field var5 = arg3.getDeclaredField(arg0);
            return var5.getBoolean(arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public final void method254(byte arg0) {
        if (arg0 >= -1) {
            this.field4530 = -96;
        }
        class317.method1834((byte) -106);
        field4520++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I")
    public final int method252(byte arg0) {
        if (arg0 != 40) {
            this.method256((byte) 36);
        }
        field4512++;
        return 100;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(JI)Z")
    public final boolean method258(long arg0, int arg1) {
        if (arg1 == -20712) {
            field4535++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public final void method256(byte arg0) {
        if (arg0 != -105) {
            this.method2004((byte) -3, -106);
        }
        field4536++;
    }
}
