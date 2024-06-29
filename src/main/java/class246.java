import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class246 implements class549 {

    @OriginalMember(owner = "client!cca", name = "y", descriptor = "Z")
    public static boolean field3441 = false;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "Lqaa;")
    public static class27 field3423 = new class27(35, 7);

    @OriginalMember(owner = "client!cca", name = "T", descriptor = "Z")
    public static boolean field3462 = false;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    private int field3419;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    private int field3421;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    private int field3429;

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!cca", name = "u", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!cca", name = "w", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!cca", name = "B", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!cca", name = "C", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!cca", name = "E", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!cca", name = "F", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!cca", name = "G", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!cca", name = "H", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!cca", name = "J", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!cca", name = "L", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!cca", name = "N", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!cca", name = "O", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!cca", name = "P", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!cca", name = "R", descriptor = "I")
    private int field3460;

    @OriginalMember(owner = "client!cca", name = "S", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!cca", name = "Q", descriptor = "Lsfa;")
    public static class693 field3459;

    @OriginalMember(owner = "client!cca", name = "U", descriptor = "Ljava/awt/Color;")
    private Color field3463;

    @OriginalMember(owner = "client!cca", name = "t", descriptor = "Ljava/awt/Font;")
    private Font field3436;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field3432;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "Ljava/awt/Image;")
    private Image field3417;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field3420;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field3430;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field3431;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field3433;

    @OriginalMember(owner = "client!cca", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field3438;

    @OriginalMember(owner = "client!cca", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field3440;

    @OriginalMember(owner = "client!cca", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field3443;

    @OriginalMember(owner = "client!cca", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field3451;

    @OriginalMember(owner = "client!cca", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field3453;

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "Z")
    private boolean field3435;

    @OriginalMember(owner = "client!cca", name = "D", descriptor = "Z")
    private boolean field3446;

    @OriginalMember(owner = "client!cca", name = "M", descriptor = "Z")
    private boolean field3455;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(Z)V", line = 3)
    public static final void method1631(boolean arg0) {
        if (arg0) {
            method1640(42, null);
        }
        field3462 = true;
        field3457++;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)I", line = 15)
    private final int method1632(int arg0, int arg1) {
        field3456++;
        if (this.field3455) {
            return (class363.field5105 - arg1) / 2;
        } else {
            if (arg0 != 0) {
                this.field3449 = -128;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IB)I", line = 41)
    private final int method1633(int arg0, byte arg1) {
        field3428++;
        if (this.field3446) {
            return (class206.field2956 - arg0) / 2;
        } else {
            int var3 = -82 % ((-arg1 - 62) / 50);
            return 0;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V", line = 58)
    public final void method1634(boolean arg0) {
        if (arg0) {
            this.method1635((byte) 6);
        }
        field3427++;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)I", line = 72)
    public final int method1635(byte arg0) {
        if (arg0 != 30) {
            this.field3421 = -122;
        }
        field3422++;
        return 100;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZZ)V", line = 85)
    public final void method1636(boolean arg0, boolean arg1) {
        field3424++;
        if (!this.field3435) {
            if (class476.field6812 == null) {
                this.field3435 = true;
            } else if (this.field3436 == null) {
                try {
                    this.method1645((byte) -128);
                } catch (Exception var43) {
                    this.field3435 = true;
                }
            }
        }
        if (this.field3435) {
            this.method1643(2);
            return;
        }
        Graphics var3 = class567.field8085.getGraphics();
        if (var3 == null) {
            class567.field8085.repaint();
        } else {
            try {
                int var4 = class750.field10477.method2260(!arg0);
                String var5 = class750.field10477.method2259(-42);
                if (class158.field2369 == null) {
                    class158.field2369 = class567.field8085.createImage(class206.field2956, class363.field5105);
                }
                Graphics var6 = class158.field2369.getGraphics();
                int var7 = this.field3438.getWidth(null);
                int var8 = this.field3451.getWidth(null);
                int var9 = this.field3440.getWidth(null);
                int var10 = this.field3438.getHeight(null);
                int var11 = this.field3451.getHeight(null);
                int var12 = this.field3440.getHeight(null);
                var6.drawImage(this.field3438, this.method1633(var7, (byte) -112) + this.field3429 - (this.field3460 / 2), this.method1632(0, var10) + this.field3454, null);
                int var13 = this.field3429 + var7 - this.field3460 / 2;
                int var14 = this.field3460 / 2 + this.field3429;
                for (int var15 = var13; var15 <= var14; var15 += var9) {
                    var6.drawImage(this.field3440, this.method1633(var7, (byte) -113) + this.field3429 + var15, this.method1632(0, var12) + this.field3454, null);
                }
                var6.drawImage(this.field3451, this.method1633(var8, (byte) -127) + this.field3429 + (this.field3460 / 2), this.method1632(0, var11) + this.field3454, null);
                int var16 = this.field3417.getWidth(null);
                int var17 = this.field3417.getHeight(null);
                int var18 = this.field3453.getWidth(null);
                int var19 = this.field3453.getHeight(null);
                int var20 = this.field3420.getHeight(null);
                int var21 = this.field3431.getWidth(null);
                int var22 = this.field3431.getHeight(null);
                int var23 = this.field3420.getWidth(null);
                int var24 = this.field3430.getWidth(null);
                int var25 = this.field3443.getWidth(null);
                int var26 = this.method1633(this.field3419, (byte) 91) + this.field3434;
                int var27 = this.method1632(0, this.field3442) + this.field3421;
                var6.drawImage(this.field3417, var26, var27 + ((this.field3442 - var17) / 2), null);
                var6.drawImage(this.field3453, var26 + this.field3419 - var18, var27 - -((this.field3442 - var19) / 2), null);
                if (this.field3433 == null) {
                    this.field3433 = class567.field8085.createImage(this.field3419 - var16 - var18, this.field3442);
                }
                Graphics var28 = this.field3433.getGraphics();
                for (int var29 = 0; var29 < (this.field3419 - (var16 + var18)); var29 += var21) {
                    var28.drawImage(this.field3431, var29, 0, null);
                }
                for (int var30 = 0; var30 < this.field3419 - var16 - var18; var30 += var23) {
                    var28.drawImage(this.field3420, var30, this.field3442 - var20, null);
                }
                int var31 = (this.field3419 - var16 - var18) * var4 / 100;
                if (var31 > 0) {
                    Image var32 = class567.field8085.createImage(var31, this.field3442 - var20 - var22);
                    int var33 = var32.getWidth(null);
                    Graphics var34 = var32.getGraphics();
                    int var35 = this.field3449 * class742.method4129(1) / 10 % var24;
                    for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                        var34.drawImage(this.field3430, var36, 0, null);
                    }
                    var28.drawImage(var32, 0, var22, null);
                }
                int var38 = this.field3419 - var16 - var18 - var31;
                if (var38 > 0) {
                    Image var39 = class567.field8085.createImage(var38, this.field3442 - var22 - var20);
                    int var40 = var39.getWidth(null);
                    Graphics var41 = var39.getGraphics();
                    for (int var42 = 0; var42 < var40; var42 += var25) {
                        var41.drawImage(this.field3443, var42, 0, null);
                    }
                    var28.drawImage(var39, var31, var22, null);
                }
                var6.drawImage(this.field3433, var16 + var26, var27, null);
                var6.setFont(this.field3436);
                var6.setColor(this.field3463);
                var6.drawString(var5, var26 + (this.field3419 - this.field3432.stringWidth(var5)) / 2, this.field3442 / 2 - -4 + var27 + this.field3458);
                var3.drawImage(class158.field2369, 0, 0, null);
            } catch (Exception var44) {
                this.field3435 = true;
            }
        }
        if (!arg0) {
            this.field3458 = 41;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(JI)Z", line = 277)
    public final boolean method1637(long arg0, int arg1) {
        if (arg1 > -38) {
            field3462 = false;
        }
        field3444++;
        return true;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;I)I", line = 293)
    private final int method1638(String arg0, Class arg1, Object arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        field3418++;
        Field var5 = arg1.getDeclaredField(arg0);
        return arg3 == -28647 ? var5.getInt(arg2) : -5;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(JB)V", line = 307)
    public static final void method1639(long arg0, byte arg1) {
        field3425++;
        if (arg1 > -54) {
            field3459 = null;
        }
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class36.method293(arg0 - 1L, true);
            class36.method293(1L, true);
        } else {
            class36.method293(arg0, true);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILrca;)V", line = 330)
    public static final void method1640(int arg0, class452 arg1) {
        for (int var2 = arg0; var2 < class401.field5603; var2++) {
            int var3 = class498.field7097[var2];
            class349 var4 = class165.field2442[var3];
            int var5 = arg1.method273(255);
            if ((var5 & 0x1) != 0) {
                var5 += arg1.method273(255) << 8;
            }
            if ((var5 & 0x8000) != 0) {
                var5 += arg1.method273(arg0 + 255) << 16;
            }
            class255.method1736(var5, arg1, true, var3, var4);
        }
        field3426++;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Z", line = 368)
    private final boolean method1641(int arg0, Object arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field3445++;
        Field var5 = arg2.getDeclaredField(arg3);
        return arg0 <= 74 ? false : var5.getBoolean(arg1);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V", line = 381)
    public final void method1642(int arg0) {
        if (arg0 != 18105) {
            this.field3430 = null;
        }
        field3439++;
        class289.method1868(arg0 - 18105);
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)V", line = 392)
    private final void method1643(int arg0) {
        if (arg0 != 2) {
            this.method1632(-125, -66);
        }
        class427.method2598(class668.field9368[class54.field1035], class369.field5172[class54.field1035], false, class750.field10477.method2260(false), class750.field10477.method2259(arg0 - 32), class34.field446[class54.field1035]);
        field3450++;
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(B)V", line = 405)
    public static void method1644(byte arg0) {
        field3459 = null;
        int var1 = -14 / ((-arg0 - 2) / 46);
        field3423 = null;
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(B)V", line = 415)
    private final void method1645(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field3447++;
        Class var2 = class476.field6812.getClass();
        this.field3430 = (Image) this.method1646("bar", var2, true);
        this.field3443 = (Image) this.method1646("background", var2, true);
        this.field3417 = (Image) this.method1646("left", var2, true);
        this.field3453 = (Image) this.method1646("right", var2, true);
        this.field3431 = (Image) this.method1646("top", var2, true);
        this.field3420 = (Image) this.method1646("bottom", var2, true);
        this.field3438 = (Image) this.method1646("bodyLeft", var2, true);
        this.field3451 = (Image) this.method1646("bodyRight", var2, true);
        this.field3440 = (Image) this.method1646("bodyFill", var2, true);
        this.field3436 = (Font) this.method1646("bf", var2, true);
        this.field3432 = (FontMetrics) this.method1646("bfm", var2, true);
        this.field3463 = (Color) this.method1646("colourtext", var2, true);
        Object var3 = this.method1646("lb", var2, true);
        Class var4 = var3.getClass();
        this.field3446 = this.method1641(125, var3, var4, "xMiddle");
        this.field3455 = this.method1641(arg0 ^ 0xFFFFFFE3, var3, var4, "yMiddle");
        if (arg0 != -128) {
            this.field3442 = 36;
        }
        this.field3434 = this.method1638("xOffset", var4, var3, -28647);
        this.field3421 = this.method1638("yOffset", var4, var3, -28647);
        this.field3419 = this.method1638("width", var4, var3, -28647);
        this.field3442 = this.method1638("height", var4, var3, -28647);
        this.field3429 = this.method1638("boxXOffset", var4, var3, -28647);
        this.field3454 = this.method1638("boxYOffset", var4, var3, -28647);
        this.field3460 = this.method1638("boxWidth", var4, var3, arg0 - 28519);
        this.field3458 = this.method1638("textYOffset", var4, var3, -28647);
        this.field3449 = this.method1638("offsetPerTenCycles", var4, var3, -28647);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Ljava/lang/Object;", line = 454)
    private final Object method1646(String arg0, Class arg1, boolean arg2) throws IllegalAccessException, NoSuchFieldException {
        field3448++;
        Field var4 = arg1.getDeclaredField(arg0);
        Object var5 = var4.get(class476.field6812);
        if (arg2) {
            var4.set(class476.field6812, null);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)I", line = 471)
    public final int method1647(int arg0) {
        if (arg0 != -4332) {
            this.method1636(true, true);
        }
        field3452++;
        return 0;
    }
}
