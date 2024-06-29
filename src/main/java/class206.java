import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class206 implements class187 {

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Llga;")
    public static class712 field2454 = new class712(75, 0);

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "J")
    public static long field2477 = -1L;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "[I")
    public static int[] field2476 = new int[14];

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field2483 = 64;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    private int field2442;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    private int field2443;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    private int field2446;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    private int field2453;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    private int field2468;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    private int field2469;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    private int field2473;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Ljava/awt/Color;")
    private Color field2451;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Ljava/awt/Font;")
    private Font field2467;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field2484;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field2445;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field2447;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field2457;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field2458;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field2461;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field2462;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field2463;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field2470;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "Ljava/awt/Image;")
    private Image field2471;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field2472;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Z")
    private boolean field2464;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Z")
    private boolean field2480;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Z")
    private boolean field2481;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Class;)I", line = 6)
    private final int method1147(String arg0, int arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field2479++;
        Field var5 = arg3.getDeclaredField(arg0);
        return arg1 == 2235 ? var5.getInt(arg2) : -79;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V", line = 25)
    public static final void method1148(int arg0) {
        for (class101 var1 = (class101) class197.field2353.method724(32); var1 != null; var1 = (class101) class197.field2353.method723(88)) {
            if (var1.field1326) {
                var1.method696(true);
            }
        }
        field2441++;
        if (arg0 != 3) {
            field2477 = 44L;
        }
        for (class101 var2 = (class101) class315.field4251.method724(32); var2 != null; var2 = (class101) class315.field4251.method723(103)) {
            if (var2.field1326) {
                var2.method696(true);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IJ)Z", line = 59)
    public final boolean method1054(int arg0, long arg1) {
        field2449++;
        int var4 = 105 % ((-arg0 - 13) / 50);
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 69)
    private final void method1149(int arg0) {
        field2466++;
        if (arg0 != 2) {
            this.field2484 = null;
        }
        class412.method2376(class633.field8786.method1159(-119), class182.field2231[class11.field67], class728.field10167[class11.field67], class557.field7846[class11.field67], class633.field8786.method1162((byte) -46), 90);
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V", line = 80)
    public static void method1150(int arg0) {
        if (arg0 != 1) {
            method1150(-1);
        }
        field2454 = null;
        field2476 = null;
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V", line = 91)
    private final void method1151(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field2460++;
        Class var2 = class144.field1868.getClass();
        this.field2471 = (Image) this.method1156(var2, "bar", (byte) 60);
        this.field2445 = (Image) this.method1156(var2, "background", (byte) 121);
        this.field2462 = (Image) this.method1156(var2, "left", (byte) -107);
        this.field2470 = (Image) this.method1156(var2, "right", (byte) 86);
        this.field2447 = (Image) this.method1156(var2, "top", (byte) 79);
        this.field2472 = (Image) this.method1156(var2, "bottom", (byte) -116);
        this.field2461 = (Image) this.method1156(var2, "bodyLeft", (byte) 33);
        this.field2457 = (Image) this.method1156(var2, "bodyRight", (byte) -113);
        this.field2458 = (Image) this.method1156(var2, "bodyFill", (byte) -116);
        this.field2467 = (Font) this.method1156(var2, "bf", (byte) -125);
        this.field2484 = (FontMetrics) this.method1156(var2, "bfm", (byte) 49);
        if (arg0 != 2) {
            return;
        }
        this.field2451 = (Color) this.method1156(var2, "colourtext", (byte) -125);
        Object var3 = this.method1156(var2, "lb", (byte) -116);
        Class var4 = var3.getClass();
        this.field2480 = this.method1154(var4, (byte) 103, "xMiddle", var3);
        this.field2464 = this.method1154(var4, (byte) 97, "yMiddle", var3);
        this.field2469 = this.method1147("xOffset", 2235, var3, var4);
        this.field2455 = this.method1147("yOffset", 2235, var3, var4);
        this.field2443 = this.method1147("width", 2235, var3, var4);
        this.field2446 = this.method1147("height", 2235, var3, var4);
        this.field2442 = this.method1147("boxXOffset", arg0 + 2233, var3, var4);
        this.field2473 = this.method1147("boxYOffset", 2235, var3, var4);
        this.field2459 = this.method1147("boxWidth", 2235, var3, var4);
        this.field2468 = this.method1147("textYOffset", arg0 ^ 0x8B9, var3, var4);
        this.field2453 = this.method1147("offsetPerTenCycles", arg0 ^ 0x8B9, var3, var4);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I", line = 132)
    private final int method1152(int arg0, int arg1) {
        if (arg1 == 0) {
            field2456++;
            return this.field2464 ? (class512.field6932 - arg0) / 2 : 0;
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 152)
    public final void method1050(int arg0) {
        field2452++;
        class450.method2519(3796);
        if (arg0 != -26363) {
            method1150(65);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZIIII)I", line = 164)
    public static final int method1153(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        field2475++;
        if (arg2) {
            field2483 = -70;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg5;
        } else {
            return 1 + 7 - arg6 - arg3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Object;)Z", line = 195)
    private final boolean method1154(Class arg0, byte arg1, String arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field2465++;
        int var5 = -18 % ((51 - arg1) / 37);
        Field var6 = arg0.getDeclaredField(arg2);
        return var6.getBoolean(arg3);
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V", line = 212)
    public final void method1053(int arg0) {
        if (arg0 != -31295) {
            this.method1155(-13, 77);
        }
        field2444++;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)I", line = 225)
    public final int method1052(int arg0) {
        if (arg0 != -794) {
            this.field2462 = null;
        }
        field2478++;
        return 100;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I", line = 246)
    public final int method1051(int arg0) {
        field2448++;
        if (arg0 != -24591) {
            method1153(-96, 3, true, -103, -108, -61, -101);
        }
        return 0;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I", line = 260)
    private final int method1155(int arg0, int arg1) {
        field2482++;
        if (this.field2480) {
            return (class546.field7710 - arg0) / 2;
        } else if (arg1 == 7) {
            return 0;
        } else {
            return -28;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;", line = 284)
    private final Object method1156(Class arg0, String arg1, byte arg2) throws IllegalAccessException, NoSuchFieldException {
        int var4 = -110 / ((-arg2 - 40) / 62);
        field2474++;
        Field var5 = arg0.getDeclaredField(arg1);
        Object var6 = var5.get(class144.field1868);
        var5.set(class144.field1868, null);
        return var6;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)V", line = 299)
    public final void method1049(int arg0, boolean arg1) {
        if (!this.field2481) {
            if (class144.field1868 == null) {
                this.field2481 = true;
            } else if (this.field2467 == null) {
                try {
                    this.method1151(arg0 ^ 0x7DD0);
                } catch (Exception var43) {
                    this.field2481 = true;
                }
            }
        }
        field2450++;
        if (this.field2481) {
            this.method1149(2);
            return;
        }
        if (arg0 != 32210) {
            this.method1052(51);
        }
        Graphics var3 = class725.field10121.getGraphics();
        if (var3 == null) {
            class725.field10121.repaint();
            return;
        }
        try {
            int var4 = class633.field8786.method1159(-127);
            String var5 = class633.field8786.method1162((byte) -46);
            if (class165.field2066 == null) {
                class165.field2066 = class725.field10121.createImage(class546.field7710, class512.field6932);
            }
            Graphics var6 = class165.field2066.getGraphics();
            var6.clearRect(0, 0, class546.field7710, class512.field6932);
            int var7 = this.field2461.getWidth(null);
            int var8 = this.field2457.getWidth(null);
            int var9 = this.field2458.getWidth(null);
            int var10 = this.field2461.getHeight(null);
            int var11 = this.field2457.getHeight(null);
            int var12 = this.field2458.getHeight(null);
            var6.drawImage(this.field2461, this.method1155(var7, 7) - ((this.field2459 / 2) - this.field2442), this.method1152(var10, 0) + this.field2473, null);
            int var13 = this.field2442 + var7 - (this.field2459 / 2);
            int var14 = this.field2459 / 2 + this.field2442;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field2458, this.method1155(var7, 7) + this.field2442 + var15, this.method1152(var12, 0) + this.field2473, null);
            }
            var6.drawImage(this.field2457, this.method1155(var8, 7) - (-(this.field2459 / 2) - this.field2442), this.method1152(var11, 0) + this.field2473, null);
            int var16 = this.field2462.getWidth(null);
            int var17 = this.field2462.getHeight(null);
            int var18 = this.field2470.getWidth(null);
            int var19 = this.field2470.getHeight(null);
            int var20 = this.field2472.getHeight(null);
            int var21 = this.field2447.getWidth(null);
            int var22 = this.field2447.getHeight(null);
            int var23 = this.field2472.getWidth(null);
            int var24 = this.field2471.getWidth(null);
            int var25 = this.field2445.getWidth(null);
            int var26 = this.method1155(this.field2443, arg0 ^ 0x7DD5) + this.field2469;
            int var27 = this.method1152(this.field2446, 0) + this.field2455;
            var6.drawImage(this.field2462, var26, var27 + ((this.field2446 - var17) / 2), null);
            var6.drawImage(this.field2470, var26 + this.field2443 - var18, (-var19 + this.field2446) / 2 + var27, null);
            if (this.field2463 == null) {
                this.field2463 = class725.field10121.createImage(this.field2443 - var16 - var18, this.field2446);
            }
            Graphics var28 = this.field2463.getGraphics();
            for (int var29 = 0; var29 < this.field2443 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field2447, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field2443 - var16 - var18); var30 += var23) {
                var28.drawImage(this.field2472, var30, this.field2446 - var20, null);
            }
            int var31 = (this.field2443 - var16 - var18) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class725.field10121.createImage(var31, this.field2446 - var22 - var20);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field2453 * class194.method1080(true) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field2471, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field2443 - var18 - var31 - var16;
            if (var38 > 0) {
                Image var39 = class725.field10121.createImage(var38, this.field2446 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field2445, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field2463, var16 + var26, var27, null);
            var6.setFont(this.field2467);
            var6.setColor(this.field2451);
            var6.drawString(var5, (this.field2443 - this.field2484.stringWidth(var5)) / 2 + var26, this.field2446 / 2 + this.field2468 + var27 - -4);
            var3.drawImage(class165.field2066, 0, 0, null);
        } catch (Exception var44) {
            this.field2481 = true;
        }
    }
}
