import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class688 implements class299 {

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field9670 = 0;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field9662 = -1;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[[B")
    public static byte[][] field9661 = new byte[250][];

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    private int field9663;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    private int field9671;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    private int field9673;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    private int field9675;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    private int field9677;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    private int field9685;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    private int field9691;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    private int field9692;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    private int field9697;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Lii;")
    public static class519 field9669;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Ljava/awt/Color;")
    private Color field9666;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "Ljava/awt/Font;")
    private Font field9678;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field9688;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field9659;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Ljava/awt/Image;")
    private Image field9660;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field9664;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field9674;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field9679;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field9682;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field9683;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field9684;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field9686;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field9695;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Z")
    private boolean field9668;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BIIIIII)V")
    public static final void method3818(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 <= 123) {
            method3821(-1.0669066F, (byte) -88);
        }
        field9700++;
        if (arg4 >= class600.field7959 && class366.field4956 >= arg1 && class310.field4279 <= arg6 && class442.field6058 >= arg5) {
            if (arg2 == 1) {
                class218.method1388(arg5, arg4, arg1, arg3, arg6, (byte) -119);
            } else {
                class216.method1378(arg3, arg2, arg4, arg5, arg1, 16711680, arg6);
            }
        } else if (arg2 == 1) {
            class376.method2213(arg4, 56, arg3, arg5, arg1, arg6);
        } else {
            class39.method301(arg5, arg4, arg6, arg2, -1, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)I")
    private final int method3819(int arg0, String arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 != 250) {
            field9680 = -100;
        }
        field9667++;
        Field var5 = arg3.getDeclaredField(arg1);
        return var5.getInt(arg2);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
    private final void method3820(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field9687++;
        Class var2 = class486.field6574.getClass();
        this.field9686 = (Image) this.method3823("bar", var2, false);
        this.field9660 = (Image) this.method3823("background", var2, false);
        this.field9674 = (Image) this.method3823("left", var2, false);
        this.field9679 = (Image) this.method3823("right", var2, false);
        this.field9695 = (Image) this.method3823("top", var2, false);
        this.field9659 = (Image) this.method3823("bottom", var2, false);
        this.field9664 = (Image) this.method3823("bodyLeft", var2, false);
        this.field9684 = (Image) this.method3823("bodyRight", var2, false);
        this.field9682 = (Image) this.method3823("bodyFill", var2, false);
        this.field9678 = (Font) this.method3823("bf", var2, false);
        this.field9688 = (FontMetrics) this.method3823("bfm", var2, false);
        if (arg0 != 2) {
            this.method1827(79);
        }
        this.field9666 = (Color) this.method3823("colourtext", var2, false);
        Object var3 = this.method3823("lb", var2, false);
        Class var4 = var3.getClass();
        this.field9671 = this.method3819(arg0 ^ 0xF8, "xOffset", var3, var4);
        this.field9663 = this.method3819(250, "yOffset", var3, var4);
        this.field9697 = this.method3819(250, "width", var3, var4);
        this.field9675 = this.method3819(250, "height", var3, var4);
        this.field9692 = this.method3819(250, "boxXOffset", var3, var4);
        this.field9673 = this.method3819(arg0 + 248, "boxYOffset", var3, var4);
        this.field9691 = this.method3819(250, "boxWidth", var3, var4);
        this.field9677 = this.method3819(250, "textYOffset", var3, var4);
        this.field9685 = this.method3819(250, "offsetPerTenCycles", var3, var4);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(FB)F")
    public static final float method3821(float arg0, byte arg1) {
        field9665++;
        if (arg1 < 31) {
            method3821(0.8941305F, (byte) -60);
        }
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(B)V")
    public static void method3822(byte arg0) {
        field9669 = null;
        if (arg0 > 87) {
            field9661 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Ljava/lang/Object;")
    private final Object method3823(String arg0, Class arg1, boolean arg2) throws IllegalAccessException, NoSuchFieldException {
        field9693++;
        if (arg2) {
            this.field9659 = null;
        }
        Field var4 = arg1.getDeclaredField(arg0);
        Object var5 = var4.get(class486.field6574);
        var4.set(class486.field6574, null);
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
    public final int method1827(int arg0) {
        if (arg0 != 8717) {
            this.field9668 = false;
        }
        field9689++;
        return 0;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
    private final void method3824(int arg0) {
        field9681++;
        if (arg0 == 2) {
            class441.method2497(-26, class2.field11.method1437((byte) -127), class2.field11.method1435((byte) 90), class153.field2413[class580.field7704], class244.field3418[class580.field7704], class265.field3683[class580.field7704]);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IJ)Z")
    public final boolean method1823(int arg0, long arg1) {
        field9676++;
        if (arg0 != -29765) {
            this.field9688 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public final void method1825(byte arg0) {
        field9672++;
        if (arg0 > 35) {
            class419.method2403(127);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZB)V")
    public final void method1824(boolean arg0, byte arg1) {
        field9694++;
        if (!this.field9668) {
            if (class486.field6574 == null) {
                this.field9668 = true;
            } else if (this.field9678 == null) {
                try {
                    this.method3820(2);
                } catch (Exception var43) {
                    this.field9668 = true;
                }
            }
        }
        if (this.field9668) {
            this.method3824(2);
            return;
        }
        Graphics var3 = class443.field6072.getGraphics();
        if (arg1 > -83) {
            this.method1823(13, 47L);
        }
        if (var3 == null) {
            class443.field6072.repaint();
            return;
        }
        try {
            int var4 = class2.field11.method1435((byte) 80);
            String var5 = class2.field11.method1437((byte) -72);
            if (class618.field8200 == null) {
                class618.field8200 = class443.field6072.createImage(class627.field8461, class149.field2387);
            }
            Graphics var6 = class618.field8200.getGraphics();
            int var7 = this.field9664.getWidth(null);
            int var8 = this.field9684.getWidth(null);
            int var9 = this.field9682.getWidth(null);
            int var10 = this.field9664.getHeight(null);
            int var11 = this.field9684.getHeight(null);
            int var12 = this.field9682.getHeight(null);
            var6.drawImage(this.field9664, (class627.field8461 - var7) / 2 - (this.field9691 / 2 - this.field9692), (-var10 + class149.field2387) / 2 + this.field9673, null);
            int var13 = this.field9692 + var7 - (this.field9691 / 2);
            int var14 = this.field9691 / 2 + this.field9692 - var8;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field9682, (class627.field8461 - var7) / 2 + this.field9692 + var15, (-var12 + class149.field2387) / 2 - -this.field9673, null);
            }
            var6.drawImage(this.field9684, this.field9691 / 2 + (class627.field8461 - var8) / 2 + this.field9692, (class149.field2387 - var11) / 2 + this.field9673, null);
            int var16 = this.field9674.getWidth(null);
            int var17 = this.field9674.getHeight(null);
            int var18 = this.field9679.getWidth(null);
            int var19 = this.field9679.getHeight(null);
            int var20 = this.field9659.getHeight(null);
            int var21 = this.field9695.getWidth(null);
            int var22 = this.field9695.getHeight(null);
            int var23 = this.field9659.getWidth(null);
            int var24 = this.field9686.getWidth(null);
            int var25 = this.field9660.getWidth(null);
            int var26 = (class627.field8461 - this.field9697) / 2 + this.field9671;
            int var27 = (class149.field2387 - this.field9675) / 2 + this.field9663;
            var6.drawImage(this.field9674, var26, (this.field9675 - var17) / 2 + var27, null);
            var6.drawImage(this.field9679, var26 + this.field9697 - var18, (this.field9675 - var19) / 2 + var27, null);
            if (this.field9683 == null) {
                this.field9683 = class443.field6072.createImage(this.field9697 - var16 - var18, this.field9675);
            }
            Graphics var28 = this.field9683.getGraphics();
            for (int var29 = 0; var29 < this.field9697 - var18 - var16; var29 += var21) {
                var28.drawImage(this.field9695, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field9697 - var16 - var18); var30 += var23) {
                var28.drawImage(this.field9659, var30, this.field9675 - var20, null);
            }
            int var31 = (this.field9697 - var16 - var18) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class443.field6072.createImage(var31, this.field9675 - var22 - var20);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field9685 * class413.method2367(-118) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field9686, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field9697 - var16 - var18 - var31;
            if (var38 > 0) {
                Image var39 = class443.field6072.createImage(var38, this.field9675 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field9660, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field9683, var16 + var26, var27, null);
            var6.setFont(this.field9678);
            var6.setColor(this.field9666);
            var6.drawString(var5, (this.field9697 - this.field9688.stringWidth(var5)) / 2 + var26, this.field9675 / 2 + (var27 - (-4 - this.field9677)));
            var3.drawImage(class618.field8200, 0, 0, null);
        } catch (Exception var44) {
            this.field9668 = true;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I")
    public final int method1826(int arg0) {
        field9690++;
        if (arg0 != 2265) {
            this.method1823(-92, 50L);
        }
        return 100;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
    public final void method1828(byte arg0) {
        if (arg0 < 29) {
            this.method3824(30);
        }
        field9696++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([Ljava/lang/Object;I[JZI)V")
    public static final void method3825(Object[] arg0, int arg1, long[] arg2, boolean arg3, int arg4) {
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg4; var11++) {
                if (((long) (var11 & var10) + var7) > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var9;
            method3825(arg0, arg1, arg2, arg3, var6 - 1);
            method3825(arg0, var6 + 1, arg2, false, arg4);
        }
        if (arg3) {
            method3822((byte) 80);
        }
        field9699++;
    }
}
