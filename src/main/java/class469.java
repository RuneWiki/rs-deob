import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class469 implements class374 {

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field6466 = 0;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Lin;")
    public static class78 field6472 = null;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    private int field6440;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    private int field6442;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    private int field6450;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    private int field6452;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    private int field6459;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    private int field6461;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    private int field6469;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    private int field6475;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lla;")
    public static class417 field6441;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Ljava/awt/Color;")
    private Color field6483;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "Ljava/awt/Font;")
    private Font field6468;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field6464;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field6445;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field6446;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field6455;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field6456;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field6457;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field6458;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field6462;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field6463;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "Ljava/awt/Image;")
    private Image field6470;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field6480;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Z")
    private boolean field6448;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "Z")
    private boolean field6479;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "Z")
    private boolean field6481;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)V")
    private final void method2647(boolean arg0) throws IllegalAccessException, NoSuchFieldException {
        field6471++;
        Class var2 = class59.field668.getClass();
        this.field6463 = (Image) this.method2649("bar", var2, -26363);
        this.field6470 = (Image) this.method2649("background", var2, -26363);
        this.field6480 = (Image) this.method2649("left", var2, -26363);
        this.field6445 = (Image) this.method2649("right", var2, -26363);
        this.field6458 = (Image) this.method2649("top", var2, -26363);
        this.field6456 = (Image) this.method2649("bottom", var2, -26363);
        this.field6462 = (Image) this.method2649("bodyLeft", var2, -26363);
        this.field6446 = (Image) this.method2649("bodyRight", var2, -26363);
        this.field6455 = (Image) this.method2649("bodyFill", var2, -26363);
        this.field6468 = (Font) this.method2649("bf", var2, -26363);
        this.field6464 = (FontMetrics) this.method2649("bfm", var2, -26363);
        this.field6483 = (Color) this.method2649("colourtext", var2, -26363);
        Object var3 = this.method2649("lb", var2, -26363);
        Class var4 = var3.getClass();
        this.field6448 = this.method2652(var3, var4, "xMiddle", 122);
        this.field6479 = this.method2652(var3, var4, "yMiddle", -113);
        this.field6440 = this.method2650(var4, -19898, "xOffset", var3);
        this.field6452 = this.method2650(var4, -19898, "yOffset", var3);
        this.field6475 = this.method2650(var4, -19898, "width", var3);
        this.field6469 = this.method2650(var4, -19898, "height", var3);
        this.field6461 = this.method2650(var4, -19898, "boxXOffset", var3);
        if (arg0) {
            method2648((byte) 54, -15, -106, 106);
        }
        this.field6459 = this.method2650(var4, -19898, "boxYOffset", var3);
        this.field6450 = this.method2650(var4, -19898, "boxWidth", var3);
        this.field6443 = this.method2650(var4, -19898, "textYOffset", var3);
        this.field6442 = this.method2650(var4, -19898, "offsetPerTenCycles", var3);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method2150(int arg0) {
        if (arg0 != -25602) {
            this.field6463 = null;
        }
        class442.method2517(34479);
        field6465++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIII)Z")
    public static final boolean method2648(byte arg0, int arg1, int arg2, int arg3) {
        field6477++;
        if (!class539.field7280) {
            return false;
        } else if (class676.field9648 < 100) {
            return false;
        } else {
            int var4 = class91.field1307[arg2][arg3][arg1];
            if (-class207.field2908 == var4) {
                return false;
            } else if (class207.field2908 == var4) {
                return true;
            } else if (class52.field606 == class409.field5812) {
                return false;
            } else {
                int var5 = 95 % ((arg0 + 72) / 35);
                int var6 = arg3 << class588.field8259;
                int var7 = arg1 << class588.field8259;
                if (class39.method350(class631.field8750 + var6 - 1, var7 - -class631.field8750 + -1, class409.field5812[arg2].method332(arg1 + 1, 1, arg3), var7 + class631.field8750 - 1, var6 + 1, class409.field5812[arg2].method332(arg1, 1, arg3), true, var7 + 1, class409.field5812[arg2].method332(arg1 + 1, 1, arg3 - -1), var6 + 1) && class39.method350(var6 + class631.field8750 - 1, var7 - -1, class409.field5812[arg2].method332(arg1 + 1, 1, arg3 + 1), var7 + class631.field8750 - 1, var6 + 1, class409.field5812[arg2].method332(arg1, 1, arg3), true, var7 + 1, class409.field5812[arg2].method332(arg1, 1, arg3 + 1), class631.field8750 + var6 - 1)) {
                    class607.field8445++;
                    class91.field1307[arg2][arg3][arg1] = class207.field2908;
                    return true;
                } else {
                    class91.field1307[arg2][arg3][arg1] = -class207.field2908;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;")
    private final Object method2649(String arg0, Class arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        field6453++;
        if (arg2 == -26363) {
            Field var4 = arg1.getDeclaredField(arg0);
            Object var5 = var4.get(class59.field668);
            var4.set(class59.field668, null);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Object;)I")
    private final int method2650(Class arg0, int arg1, String arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg1 != -19898) {
            this.field6459 = -102;
        }
        field6451++;
        Field var5 = arg0.getDeclaredField(arg2);
        return var5.getInt(arg3);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public final void method2151(byte arg0) {
        int var2 = 34 % ((arg0 + 33) / 38);
        field6482++;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static void method2651(int arg0) {
        if (arg0 >= -26) {
            field6472 = null;
        }
        field6441 = null;
        field6472 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;I)Z")
    private final boolean method2652(Object arg0, Class arg1, String arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        field6460++;
        Field var5 = arg1.getDeclaredField(arg2);
        int var6 = 8 % ((-arg3 - 47) / 57);
        return var5.getBoolean(arg0);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IZ)I")
    private final int method2653(int arg0, boolean arg1) {
        if (arg1) {
            method2657(-28, '\u0006');
        }
        field6447++;
        return this.field6448 ? (class222.field3096 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBILhd;)V")
    public static final void method2654(int arg0, byte arg1, int arg2, class689 arg3) {
        class187.field2718[arg0][arg2] = arg3;
        if (arg1 < -116) {
            field6454++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)I")
    private final int method2655(boolean arg0, int arg1) {
        field6476++;
        if (this.field6479) {
            return (class340.field4553 - arg1) / 2;
        } else if (arg0) {
            return 0;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    private final void method2656(int arg0) {
        if (arg0 > 33) {
            field6444++;
            class623.method3460(class618.field8608.method273(13084), class193.field2742[class52.field607], class283.field3878[class52.field607], class618.field8608.method277(-46), 2, class205.field2869[class52.field607]);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
    public final int method2153(int arg0) {
        field6474++;
        if (arg0 != -5525) {
            this.method2151((byte) -4);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZJ)Z")
    public final boolean method2154(boolean arg0, long arg1) {
        if (arg0) {
            return false;
        } else {
            field6473++;
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IC)I")
    public static final int method2657(int arg0, char arg1) {
        field6478++;
        if (arg0 == 14198) {
            return arg1 >= '\u0000' && class154.field2266.length > arg1 ? class154.field2266[arg1] : -1;
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
    public final void method2149(int arg0, boolean arg1) {
        if (!this.field6481) {
            if (class59.field668 == null) {
                this.field6481 = true;
            } else if (this.field6468 == null) {
                try {
                    this.method2647(false);
                } catch (Exception var43) {
                    this.field6481 = true;
                }
            }
        }
        field6449++;
        if (this.field6481) {
            this.method2656(arg0 ^ 0x5014);
            return;
        }
        if (arg0 != 20582) {
            field6466 = -49;
        }
        Graphics var3 = class611.field8473.getGraphics();
        if (var3 == null) {
            class611.field8473.repaint();
            return;
        }
        try {
            int var4 = class618.field8608.method273(13084);
            String var5 = class618.field8608.method277(-33);
            if (class261.field3550 == null) {
                class261.field3550 = class611.field8473.createImage(class222.field3096, class340.field4553);
            }
            Graphics var6 = class261.field3550.getGraphics();
            int var7 = this.field6462.getWidth(null);
            int var8 = this.field6446.getWidth(null);
            int var9 = this.field6455.getWidth(null);
            int var10 = this.field6462.getHeight(null);
            int var11 = this.field6446.getHeight(null);
            int var12 = this.field6455.getHeight(null);
            var6.drawImage(this.field6462, this.method2653(var7, false) + this.field6461 - this.field6450 / 2, this.method2655(true, var10) + this.field6459, null);
            int var13 = this.field6461 + var7 - this.field6450 / 2;
            int var14 = this.field6450 / 2 + this.field6461;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field6455, var15 + this.method2653(var7, false) + this.field6461, this.method2655(true, var12) - -this.field6459, null);
            }
            var6.drawImage(this.field6446, this.method2653(var8, false) + this.field6461 + (this.field6450 / 2), this.method2655(true, var11) + this.field6459, null);
            int var16 = this.field6480.getWidth(null);
            int var17 = this.field6480.getHeight(null);
            int var18 = this.field6445.getWidth(null);
            int var19 = this.field6445.getHeight(null);
            int var20 = this.field6456.getHeight(null);
            int var21 = this.field6458.getWidth(null);
            int var22 = this.field6458.getHeight(null);
            int var23 = this.field6456.getWidth(null);
            int var24 = this.field6463.getWidth(null);
            int var25 = this.field6470.getWidth(null);
            int var26 = this.method2653(this.field6475, false) + this.field6440;
            int var27 = this.method2655(true, this.field6469) + this.field6452;
            var6.drawImage(this.field6480, var26, var27 + ((this.field6469 - var17) / 2), null);
            var6.drawImage(this.field6445, this.field6475 + var26 - var18, (-var19 + this.field6469) / 2 + var27, null);
            if (this.field6457 == null) {
                this.field6457 = class611.field8473.createImage(this.field6475 - var16 - var18, this.field6469);
            }
            Graphics var28 = this.field6457.getGraphics();
            for (int var29 = 0; var29 < (this.field6475 - var18 - var16); var29 += var21) {
                var28.drawImage(this.field6458, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field6475 - var16 - var18); var30 += var23) {
                var28.drawImage(this.field6456, var30, this.field6469 - var20, null);
            }
            int var31 = (this.field6475 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class611.field8473.createImage(var31, this.field6469 - var22 - var20);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field6442 * class143.method1007((byte) -57) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field6463, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field6475 - var16 - (var18 + var31);
            if (var38 > 0) {
                Image var39 = class611.field8473.createImage(var38, this.field6469 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field6470, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field6457, var26 + var16, var27, null);
            var6.setFont(this.field6468);
            var6.setColor(this.field6483);
            var6.drawString(var5, var26 + (this.field6475 - this.field6464.stringWidth(var5)) / 2, this.field6469 / 2 + 4 + var27 + this.field6443);
            var3.drawImage(class261.field3550, 0, 0, null);
        } catch (Exception var44) {
            this.field6481 = true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)I")
    public final int method2152(boolean arg0) {
        field6467++;
        return arg0 ? 100 : 41;
    }
}
