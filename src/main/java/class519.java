import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class519 implements class688 {

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "Luf;")
    public static class414 field7612 = new class414();

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "[I")
    public static int[] field7617 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tv", name = "N", descriptor = "Lgfa;")
    public static class696 field7616 = new class696(10, 2, 2, 0);

    @OriginalMember(owner = "client!tv", name = "R", descriptor = "Ljk;")
    public static class585 field7620 = new class585(45, 18);

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    private int field7579;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    private int field7582;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    private int field7583;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    private int field7585;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    private int field7594;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    private int field7604;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    private int field7605;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
    private int field7610;

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!tv", name = "M", descriptor = "I")
    private int field7615;

    @OriginalMember(owner = "client!tv", name = "P", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "Ljava/awt/Color;")
    private Color field7603;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Ljava/awt/Font;")
    private Font field7578;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field7606;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field7581;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field7584;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field7586;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "Ljava/awt/Image;")
    private Image field7587;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field7595;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field7599;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field7602;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field7607;

    @OriginalMember(owner = "client!tv", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field7613;

    @OriginalMember(owner = "client!tv", name = "Q", descriptor = "Ljava/awt/Image;")
    private Image field7619;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "Z")
    private boolean field7588;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "Z")
    private boolean field7593;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "Z")
    private boolean field7596;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
    private final void method3070(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field7598++;
        Class var2 = class627.field8991.getClass();
        this.field7587 = (Image) this.method3075(11921, var2, "bar");
        this.field7586 = (Image) this.method3075(11921, var2, "background");
        this.field7602 = (Image) this.method3075(arg0 + 7495, var2, "left");
        this.field7619 = (Image) this.method3075(11921, var2, "right");
        this.field7599 = (Image) this.method3075(11921, var2, "top");
        this.field7607 = (Image) this.method3075(11921, var2, "bottom");
        this.field7584 = (Image) this.method3075(11921, var2, "bodyLeft");
        this.field7581 = (Image) this.method3075(11921, var2, "bodyRight");
        if (arg0 != 4426) {
            this.method3076(118);
        }
        this.field7613 = (Image) this.method3075(11921, var2, "bodyFill");
        this.field7578 = (Font) this.method3075(arg0 ^ 0x3FDB, var2, "bf");
        this.field7606 = (FontMetrics) this.method3075(11921, var2, "bfm");
        this.field7603 = (Color) this.method3075(arg0 + 7495, var2, "colourtext");
        Object var3 = this.method3075(arg0 + 7495, var2, "lb");
        Class var4 = var3.getClass();
        this.field7588 = this.method3082(var3, var4, "xMiddle", (byte) -103);
        this.field7593 = this.method3082(var3, var4, "yMiddle", (byte) -105);
        this.field7585 = this.method3079(var3, var4, "xOffset", -1);
        this.field7582 = this.method3079(var3, var4, "yOffset", -1);
        this.field7604 = this.method3079(var3, var4, "width", -1);
        this.field7610 = this.method3079(var3, var4, "height", -1);
        this.field7615 = this.method3079(var3, var4, "boxXOffset", -1);
        this.field7583 = this.method3079(var3, var4, "boxYOffset", arg0 - 4427);
        this.field7579 = this.method3079(var3, var4, "boxWidth", -1);
        this.field7605 = this.method3079(var3, var4, "textYOffset", -1);
        this.field7594 = this.method3079(var3, var4, "offsetPerTenCycles", -1);
    }

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)Lio;")
    public static final class404 method3071(int arg0) {
        field7589++;
        if (arg0 > -50) {
            field7617 = null;
        }
        return class228.field2973 < class501.field7005.length ? class501.field7005[class228.field2973++] : null;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)V")
    public static void method3072(boolean arg0) {
        field7620 = null;
        field7612 = null;
        field7617 = null;
        if (!arg0) {
            method3072(false);
        }
        field7616 = null;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
    public final void method3073(int arg0) {
        if (arg0 != -16775) {
            this.method3083((byte) -18, true);
        }
        class702.method3938((byte) 94);
        field7618++;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BJ)Z")
    public final boolean method3074(byte arg0, long arg1) {
        if (arg0 != 117) {
            this.method3077(111);
        }
        field7597++;
        return true;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;")
    private final Object method3075(int arg0, Class arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        field7600++;
        Field var4 = arg1.getDeclaredField(arg2);
        Object var5 = var4.get(class627.field8991);
        var4.set(class627.field8991, null);
        return arg0 == 11921 ? var5 : null;
    }

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "(I)V")
    private final void method3076(int arg0) {
        class299.method1781(class156.field1908[class675.field9686], 2, class91.field1282.method3288((byte) -123), class91.field1282.method3281((byte) -66), class678.field9724[class675.field9686], class24.field578[class675.field9686]);
        if (arg0 == 18) {
            field7580++;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)I")
    public final int method3077(int arg0) {
        field7611++;
        if (arg0 != 14949) {
            method3072(true);
        }
        return 100;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)I")
    private final int method3078(byte arg0, int arg1) {
        field7590++;
        if (this.field7588) {
            return (class467.field6533 - arg1) / 2;
        } else {
            int var3 = 69 / ((8 - arg0) / 47);
            return 0;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;I)I")
    private final int method3079(Object arg0, Class arg1, String arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        field7608++;
        Field var5 = arg1.getDeclaredField(arg2);
        if (arg3 != -1) {
            this.field7596 = false;
        }
        return var5.getInt(arg0);
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(BI)I")
    private final int method3080(byte arg0, int arg1) {
        field7609++;
        if (arg0 >= -52) {
            this.method3080((byte) 99, 50);
        }
        return this.field7593 ? (class300.field4038 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)I")
    public final int method3081(boolean arg0) {
        field7601++;
        return arg0 ? -45 : 0;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;B)Z")
    private final boolean method3082(Object arg0, Class arg1, String arg2, byte arg3) throws IllegalAccessException, NoSuchFieldException {
        field7592++;
        if (arg3 >= -101) {
            this.method3080((byte) -5, -107);
        }
        Field var5 = arg1.getDeclaredField(arg2);
        return var5.getBoolean(arg0);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BZ)V")
    public final void method3083(byte arg0, boolean arg1) {
        if (!this.field7596) {
            if (class627.field8991 == null) {
                this.field7596 = true;
            } else if (this.field7578 == null) {
                try {
                    this.method3070(4426);
                } catch (Exception var43) {
                    this.field7596 = true;
                }
            }
        }
        field7591++;
        if (arg0 >= -30) {
            this.field7603 = null;
        }
        if (this.field7596) {
            this.method3076(18);
            return;
        }
        Graphics var3 = class646.field9190.getGraphics();
        if (var3 == null) {
            class646.field9190.repaint();
            return;
        }
        try {
            int var4 = class91.field1282.method3281((byte) -120);
            String var5 = class91.field1282.method3288((byte) -123);
            if (class228.field2955 == null) {
                class228.field2955 = class646.field9190.createImage(class467.field6533, class300.field4038);
            }
            Graphics var6 = class228.field2955.getGraphics();
            int var7 = this.field7584.getWidth(null);
            int var8 = this.field7581.getWidth(null);
            int var9 = this.field7613.getWidth(null);
            int var10 = this.field7584.getHeight(null);
            int var11 = this.field7581.getHeight(null);
            int var12 = this.field7613.getHeight(null);
            var6.drawImage(this.field7584, this.method3078((byte) 107, var7) - (this.field7579 / 2 - this.field7615), this.method3080((byte) -87, var10) - -this.field7583, null);
            int var13 = this.field7615 + var7 - (this.field7579 / 2);
            int var14 = this.field7579 / 2 + this.field7615;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field7613, var15 + this.method3078((byte) -88, var7) + this.field7615, this.method3080((byte) -127, var12) + this.field7583, null);
            }
            var6.drawImage(this.field7581, this.method3078((byte) 110, var8) + this.field7615 + this.field7579 / 2, this.method3080((byte) -67, var11) + this.field7583, null);
            int var16 = this.field7602.getWidth(null);
            int var17 = this.field7602.getHeight(null);
            int var18 = this.field7619.getWidth(null);
            int var19 = this.field7619.getHeight(null);
            int var20 = this.field7607.getHeight(null);
            int var21 = this.field7599.getWidth(null);
            int var22 = this.field7599.getHeight(null);
            int var23 = this.field7607.getWidth(null);
            int var24 = this.field7587.getWidth(null);
            int var25 = this.field7586.getWidth(null);
            int var26 = this.method3078((byte) -50, this.field7604) + this.field7585;
            int var27 = this.method3080((byte) -90, this.field7610) + this.field7582;
            var6.drawImage(this.field7602, var26, var27 + ((this.field7610 - var17) / 2), null);
            var6.drawImage(this.field7619, this.field7604 + var26 - var18, (this.field7610 - var19) / 2 + var27, null);
            if (this.field7595 == null) {
                this.field7595 = class646.field9190.createImage(this.field7604 - var18 - var16, this.field7610);
            }
            Graphics var28 = this.field7595.getGraphics();
            for (int var29 = 0; var29 < this.field7604 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field7599, var29, 0, null);
            }
            for (int var30 = 0; var30 < this.field7604 - var16 - var18; var30 += var23) {
                var28.drawImage(this.field7607, var30, this.field7610 - var20, null);
            }
            int var31 = (this.field7604 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class646.field9190.createImage(var31, this.field7610 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field7594 * class48.method542(54) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field7587, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field7604 - var16 - var18 - var31;
            if (var38 > 0) {
                Image var39 = class646.field9190.createImage(var38, this.field7610 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field7586, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field7595, var26 + var16, var27, null);
            var6.setFont(this.field7578);
            var6.setColor(this.field7603);
            var6.drawString(var5, var26 + (this.field7604 - this.field7606.stringWidth(var5)) / 2, var27 - -(this.field7610 / 2) + 4 + this.field7605);
            var3.drawImage(class228.field2955, 0, 0, null);
        } catch (Exception var44) {
            this.field7596 = true;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public final void method3084(int arg0) {
        if (arg0 != 2280) {
            this.field7593 = false;
        }
        field7614++;
    }
}
