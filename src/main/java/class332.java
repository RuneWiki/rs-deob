import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class332 implements class708 {

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field4619 = 0;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field4622 = -1;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    private int field4620;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    private int field4623;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    private int field4628;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    private int field4629;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    private int field4631;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    private int field4633;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    private int field4634;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    private int field4636;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Ljava/awt/Color;")
    private Color field4630;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "Ljava/awt/Font;")
    private Font field4646;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field4651;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field4617;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Ljava/awt/Image;")
    private Image field4621;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field4635;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field4637;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field4638;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field4640;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field4641;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Ljava/awt/Image;")
    private Image field4648;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field4649;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field4652;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Z")
    private boolean field4613;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
    private boolean field4614;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Z")
    private boolean field4642;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "[Lqaa;")
    public static class27[] field4625;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JI)Z", line = 10)
    public final boolean method185(long arg0, int arg1) {
        field4639++;
        return arg1 == 14320;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;", line = 21)
    private final Object method2169(Class arg0, String arg1, byte arg2) throws IllegalAccessException, NoSuchFieldException {
        field4627++;
        Field var4 = arg0.getDeclaredField(arg1);
        Object var5 = var4.get(class213.field2800);
        var4.set(class213.field2800, null);
        if (arg2 < 111) {
            field4619 = -22;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(ZI)I", line = 42)
    private final int method2170(boolean arg0, int arg1) {
        if (arg0) {
            this.field4621 = null;
        }
        field4645++;
        return this.field4613 ? (class446.field6323 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I", line = 57)
    public final int method184(int arg0) {
        field4643++;
        int var2 = -53 / ((-arg0 - 16) / 47);
        return 100;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V", line = 71)
    public final void method187(boolean arg0, int arg1) {
        field4615++;
        if (!this.field4614) {
            if (class213.field2800 == null) {
                this.field4614 = true;
            } else if (this.field4646 == null) {
                try {
                    this.method2174(arg1 ^ 0xFFFFCA34);
                } catch (Exception var43) {
                    this.field4614 = true;
                }
            }
        }
        if (this.field4614) {
            this.method2176((byte) -123);
            return;
        }
        Graphics var3 = class366.field5196.getGraphics();
        if (var3 == null) {
            class366.field5196.repaint();
        } else {
            try {
                int var4 = class268.field3824.method3993(arg1 - 13752);
                String var5 = class268.field3824.method3984((byte) -45);
                if (class296.field4170 == null) {
                    class296.field4170 = class366.field5196.createImage(class446.field6323, class172.field2348);
                }
                Graphics var6 = class296.field4170.getGraphics();
                var6.clearRect(0, 0, class446.field6323, class172.field2348);
                int var7 = this.field4635.getWidth(null);
                int var8 = this.field4640.getWidth(null);
                int var9 = this.field4641.getWidth(null);
                int var10 = this.field4635.getHeight(null);
                int var11 = this.field4640.getHeight(null);
                int var12 = this.field4641.getHeight(null);
                var6.drawImage(this.field4635, this.method2170(false, var7) + this.field4636 - this.field4623 / 2, this.method2172(var10, false) - -this.field4631, null);
                int var13 = this.field4636 + var7 - this.field4623 / 2;
                int var14 = this.field4623 / 2 + this.field4636;
                for (int var15 = var13; var15 <= var14; var15 += var9) {
                    var6.drawImage(this.field4641, var15 + this.method2170(false, var7) + this.field4636, this.method2172(var12, false) - -this.field4631, null);
                }
                var6.drawImage(this.field4640, this.method2170(false, var8) + this.field4636 + this.field4623 / 2, this.method2172(var11, false) - -this.field4631, null);
                int var16 = this.field4652.getWidth(null);
                int var17 = this.field4652.getHeight(null);
                int var18 = this.field4638.getWidth(null);
                int var19 = this.field4638.getHeight(null);
                int var20 = this.field4617.getHeight(null);
                int var21 = this.field4621.getWidth(null);
                int var22 = this.field4621.getHeight(null);
                int var23 = this.field4617.getWidth(null);
                int var24 = this.field4637.getWidth(null);
                int var25 = this.field4649.getWidth(null);
                int var26 = this.method2170(false, this.field4620) + this.field4634;
                int var27 = this.method2172(this.field4628, false) + this.field4629;
                var6.drawImage(this.field4652, var26, (this.field4628 - var17) / 2 + var27, null);
                var6.drawImage(this.field4638, var26 + this.field4620 - var18, (-var19 + this.field4628) / 2 + var27, null);
                if (this.field4648 == null) {
                    this.field4648 = class366.field5196.createImage(this.field4620 - var16 - var18, this.field4628);
                }
                Graphics var28 = this.field4648.getGraphics();
                for (int var29 = 0; var29 < (this.field4620 - var18 - var16); var29 += var21) {
                    var28.drawImage(this.field4621, var29, 0, null);
                }
                for (int var30 = 0; var30 < (this.field4620 - (var16 + var18)); var30 += var23) {
                    var28.drawImage(this.field4617, var30, this.field4628 - var20, null);
                }
                int var31 = (this.field4620 - var18 - var16) * var4 / 100;
                if (var31 > 0) {
                    Image var32 = class366.field5196.createImage(var31, this.field4628 - var20 - var22);
                    int var33 = var32.getWidth(null);
                    Graphics var34 = var32.getGraphics();
                    int var35 = this.field4618 * class103.method733((byte) -127) / 10 % var24;
                    for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                        var34.drawImage(this.field4637, var36, 0, null);
                    }
                    var28.drawImage(var32, 0, var22, null);
                }
                int var38 = this.field4620 - var18 - var31 - var16;
                if (var38 > 0) {
                    Image var39 = class366.field5196.createImage(var38, this.field4628 - var22 - var20);
                    int var40 = var39.getWidth(null);
                    Graphics var41 = var39.getGraphics();
                    for (int var42 = 0; var42 < var40; var42 += var25) {
                        var41.drawImage(this.field4649, var42, 0, null);
                    }
                    var28.drawImage(var39, var31, var22, null);
                }
                var6.drawImage(this.field4648, var16 + var26, var27, null);
                var6.setFont(this.field4646);
                var6.setColor(this.field4630);
                var6.drawString(var5, var26 + ((this.field4620 - this.field4651.stringWidth(var5)) / 2), this.field4628 / 2 - -4 + this.field4633 + var27);
                var3.drawImage(class296.field4170, 0, 0, null);
            } catch (Exception var44) {
                this.field4614 = true;
            }
        }
        if (arg1 != 13751) {
            this.field4614 = false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/Object;Ljava/lang/String;)I", line = 263)
    private final int method2171(Class arg0, int arg1, Object arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field4647++;
        Field var5 = arg0.getDeclaredField(arg3);
        if (arg1 != 0) {
            field4622 = 102;
        }
        return var5.getInt(arg2);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 286)
    public final void method190(boolean arg0) {
        class107.method764(!arg0);
        field4650++;
        if (!arg0) {
            method2175((byte) -88);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)I", line = 304)
    private final int method2172(int arg0, boolean arg1) {
        field4632++;
        if (this.field4642) {
            return (class172.field2348 - arg0) / 2;
        } else {
            if (arg1) {
                this.field4640 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;BLjava/lang/String;)Z", line = 323)
    private final boolean method2173(Class arg0, Object arg1, byte arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field4612++;
        if (arg2 == -23) {
            Field var5 = arg0.getDeclaredField(arg3);
            return var5.getBoolean(arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 342)
    private final void method2174(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field4624++;
        Class var2 = class213.field2800.getClass();
        if (arg0 > -103) {
            this.method184(80);
        }
        this.field4637 = (Image) this.method2169(var2, "bar", (byte) 122);
        this.field4649 = (Image) this.method2169(var2, "background", (byte) 116);
        this.field4652 = (Image) this.method2169(var2, "left", (byte) 116);
        this.field4638 = (Image) this.method2169(var2, "right", (byte) 120);
        this.field4621 = (Image) this.method2169(var2, "top", (byte) 126);
        this.field4617 = (Image) this.method2169(var2, "bottom", (byte) 115);
        this.field4635 = (Image) this.method2169(var2, "bodyLeft", (byte) 117);
        this.field4640 = (Image) this.method2169(var2, "bodyRight", (byte) 117);
        this.field4641 = (Image) this.method2169(var2, "bodyFill", (byte) 121);
        this.field4646 = (Font) this.method2169(var2, "bf", (byte) 119);
        this.field4651 = (FontMetrics) this.method2169(var2, "bfm", (byte) 119);
        this.field4630 = (Color) this.method2169(var2, "colourtext", (byte) 123);
        Object var3 = this.method2169(var2, "lb", (byte) 123);
        Class var4 = var3.getClass();
        this.field4613 = this.method2173(var4, var3, (byte) -23, "xMiddle");
        this.field4642 = this.method2173(var4, var3, (byte) -23, "yMiddle");
        this.field4634 = this.method2171(var4, 0, var3, "xOffset");
        this.field4629 = this.method2171(var4, 0, var3, "yOffset");
        this.field4620 = this.method2171(var4, 0, var3, "width");
        this.field4628 = this.method2171(var4, 0, var3, "height");
        this.field4636 = this.method2171(var4, 0, var3, "boxXOffset");
        this.field4631 = this.method2171(var4, 0, var3, "boxYOffset");
        this.field4623 = this.method2171(var4, 0, var3, "boxWidth");
        this.field4633 = this.method2171(var4, 0, var3, "textYOffset");
        this.field4618 = this.method2171(var4, 0, var3, "offsetPerTenCycles");
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 382)
    public final void method183(int arg0) {
        field4644++;
        int var2 = 101 / ((arg0 - 15) / 44);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 391)
    public static void method2175(byte arg0) {
        if (arg0 != 57) {
            method2175((byte) -9);
        }
        field4625 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I", line = 401)
    public final int method188(byte arg0) {
        if (arg0 < 114) {
            return -116;
        } else {
            field4626++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V", line = 413)
    private final void method2176(byte arg0) {
        int var2 = -8 % ((45 - arg0) / 52);
        field4616++;
        class244.method1559(class578.field8169[class55.field642], class268.field3824.method3993(-1), class709.field9838[class55.field642], 0, class268.field3824.method3984((byte) -45), class509.field7280[class55.field642]);
    }
}
