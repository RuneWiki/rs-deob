import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class30 implements class658 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Ldj;")
    public static class362 field444 = new class362(64);

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "F")
    public static float field479;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Ljava/awt/Color;")
    private Color field475;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Ljava/awt/Font;")
    private Font field471;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field453;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field448;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field449;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field451;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field454;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field459;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field462;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field483;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "Ljava/awt/Image;")
    private Image field484;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field485;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "Ljava/awt/Image;")
    private Image field487;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
    private boolean field445;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Z")
    private boolean field450;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Z")
    private boolean field486;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 3)
    public static final void method277(int arg0) {
        field456++;
        if (arg0 != 24121) {
            method283(true, -76);
        }
        if (class691.field9417 != null) {
            class691.field9417.method3647((byte) -55);
        }
        if (class462.field6488 == null) {
            return;
        }
        while (true) {
            try {
                class462.field6488.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)I", line = 35)
    private final int method278(int arg0, byte arg1) {
        field464++;
        if (this.field445) {
            return (class705.field9921 - arg0) / 2;
        } else {
            int var3 = -3 / ((48 - arg1) / 49);
            return 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V", line = 48)
    private final void method279(boolean arg0) throws IllegalAccessException, NoSuchFieldException {
        field458++;
        Class var2 = class345.field4331.getClass();
        this.field487 = (Image) this.method280("bar", var2, -64);
        this.field448 = (Image) this.method280("background", var2, -70);
        this.field485 = (Image) this.method280("left", var2, -101);
        this.field484 = (Image) this.method280("right", var2, -128);
        this.field454 = (Image) this.method280("top", var2, -122);
        this.field449 = (Image) this.method280("bottom", var2, -72);
        this.field462 = (Image) this.method280("bodyLeft", var2, -126);
        this.field459 = (Image) this.method280("bodyRight", var2, -127);
        this.field451 = (Image) this.method280("bodyFill", var2, -106);
        this.field471 = (Font) this.method280("bf", var2, -98);
        this.field453 = (FontMetrics) this.method280("bfm", var2, -74);
        this.field475 = (Color) this.method280("colourtext", var2, -94);
        Object var3 = this.method280("lb", var2, -86);
        Class var4 = var3.getClass();
        this.field450 = this.method292(var4, "xMiddle", (byte) 116, var3);
        this.field445 = this.method292(var4, "yMiddle", (byte) 116, var3);
        this.field457 = this.method284("xOffset", 34037, var3, var4);
        this.field466 = this.method284("yOffset", 34037, var3, var4);
        this.field481 = this.method284("width", 34037, var3, var4);
        this.field460 = this.method284("height", 34037, var3, var4);
        this.field463 = this.method284("boxXOffset", 34037, var3, var4);
        this.field476 = this.method284("boxYOffset", 34037, var3, var4);
        this.field473 = this.method284("boxWidth", 34037, var3, var4);
        this.field478 = this.method284("textYOffset", 34037, var3, var4);
        if (!arg0) {
            this.method281(true);
        }
        this.field470 = this.method284("offsetPerTenCycles", 34037, var3, var4);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;", line = 89)
    private final Object method280(String arg0, Class arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        if (arg2 >= -49) {
            this.field454 = null;
        }
        field468++;
        Field var4 = arg1.getDeclaredField(arg0);
        Object var5 = var4.get(class345.field4331);
        var4.set(class345.field4331, null);
        return var5;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)I", line = 111)
    public final int method281(boolean arg0) {
        if (arg0) {
            return 119;
        } else {
            field455++;
            return 100;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 126)
    private final void method282(int arg0) {
        field461++;
        class483.method2868(class691.field9417.method3640(arg0 ^ 0x7D3E), class666.field9149[class86.field1152], -101, class730.field10228[class86.field1152], class691.field9417.method3653(arg0 ^ arg0), class363.field4527[class86.field1152]);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I", line = 136)
    public static final int method283(boolean arg0, int arg1) {
        field446++;
        if (!arg0) {
            field479 = 0.15655579F;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Class;)I", line = 150)
    private final int method284(String arg0, int arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field472++;
        if (arg1 == 34037) {
            Field var5 = arg3.getDeclaredField(arg0);
            return var5.getInt(arg2);
        } else {
            return 68;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 168)
    public final void method285(int arg0) {
        if (arg0 == 4088) {
            field447++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JI)Z", line = 179)
    public final boolean method286(long arg0, int arg1) {
        field477++;
        int var4 = -8 / ((arg1 - 83) / 36);
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIILpc;I[BI)Lqt;", line = 192)
    public static final class664 method287(boolean arg0, int arg1, int arg2, int arg3, class700 arg4, int arg5, byte[] arg6, int arg7) {
        field474++;
        if (arg2 != 2) {
            field444 = null;
        }
        if (!arg4.field9846 && (!class152.method1091(arg5, -17) || !class152.method1091(arg7, -98))) {
            return arg4.field9842 ? new class664(arg4, 34037, arg1, arg5, arg7, arg0, arg6, arg3) : new class664(arg4, arg1, arg5, arg7, class783.method4337(arg5, (byte) 84), class783.method4337(arg7, (byte) 21), arg6, arg3);
        } else {
            return new class664(arg4, 3553, arg1, arg5, arg7, arg0, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I", line = 214)
    private final int method288(byte arg0, int arg1) {
        field467++;
        if (this.field450) {
            return (class701.field9880 - arg1) / 2;
        } else {
            if (arg0 != 26) {
                this.method291((byte) -22);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 234)
    public static void method289(int arg0) {
        field444 = null;
        if (arg0 != 2) {
            field479 = -0.057654087F;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 245)
    public final void method290(int arg0) {
        class690.method3854(23341);
        if (arg0 >= -84) {
            this.method291((byte) -12);
        }
        field480++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I", line = 259)
    public final int method291(byte arg0) {
        field452++;
        return arg0 < 86 ? 61 : 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Object;)Z", line = 270)
    private final boolean method292(Class arg0, String arg1, byte arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field482++;
        if (arg2 <= 111) {
            return false;
        } else {
            Field var5 = arg0.getDeclaredField(arg1);
            return var5.getBoolean(arg3);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V", line = 286)
    public final void method293(boolean arg0, boolean arg1) {
        field469++;
        if (!this.field486) {
            if (class345.field4331 == null) {
                this.field486 = true;
            } else if (this.field471 == null) {
                try {
                    this.method279(true);
                } catch (Exception var43) {
                    this.field486 = true;
                }
            }
        }
        if (arg1) {
            method277(-122);
        }
        if (this.field486) {
            this.method282(32062);
            return;
        }
        Graphics var3 = class109.field1370.getGraphics();
        if (var3 == null) {
            class109.field1370.repaint();
            return;
        }
        try {
            int var4 = class691.field9417.method3653(0);
            String var5 = class691.field9417.method3640(0);
            if (class733.field10259 == null) {
                class733.field10259 = class109.field1370.createImage(class701.field9880, class705.field9921);
            }
            Graphics var6 = class733.field10259.getGraphics();
            var6.clearRect(0, 0, class701.field9880, class705.field9921);
            int var7 = this.field462.getWidth(null);
            int var8 = this.field459.getWidth(null);
            int var9 = this.field451.getWidth(null);
            int var10 = this.field462.getHeight(null);
            int var11 = this.field459.getHeight(null);
            int var12 = this.field451.getHeight(null);
            var6.drawImage(this.field462, this.method288((byte) 26, var7) - ((this.field473 / 2) - this.field463), this.method278(var10, (byte) 110) - -this.field476, null);
            int var13 = this.field463 + var7 - (this.field473 / 2);
            int var14 = this.field473 / 2 + this.field463;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field451, this.method288((byte) 26, var7) + this.field463 + var15, this.method278(var12, (byte) 117) - -this.field476, null);
            }
            var6.drawImage(this.field459, this.method288((byte) 26, var8) + this.field463 + (this.field473 / 2), this.method278(var11, (byte) -72) - -this.field476, null);
            int var16 = this.field485.getWidth(null);
            int var17 = this.field485.getHeight(null);
            int var18 = this.field484.getWidth(null);
            int var19 = this.field484.getHeight(null);
            int var20 = this.field449.getHeight(null);
            int var21 = this.field454.getWidth(null);
            int var22 = this.field454.getHeight(null);
            int var23 = this.field449.getWidth(null);
            int var24 = this.field487.getWidth(null);
            int var25 = this.field448.getWidth(null);
            int var26 = this.method288((byte) 26, this.field481) + this.field457;
            int var27 = this.method278(this.field460, (byte) 119) + this.field466;
            var6.drawImage(this.field485, var26, (this.field460 - var17) / 2 + var27, null);
            var6.drawImage(this.field484, var26 + this.field481 - var18, (-var19 + this.field460) / 2 + var27, null);
            if (this.field483 == null) {
                this.field483 = class109.field1370.createImage(this.field481 - var18 - var16, this.field460);
            }
            Graphics var28 = this.field483.getGraphics();
            for (int var29 = 0; var29 < this.field481 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field454, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field481 - var18 - var16); var30 += var23) {
                var28.drawImage(this.field449, var30, this.field460 - var20, null);
            }
            int var31 = (this.field481 - (var16 + var18)) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class109.field1370.createImage(var31, this.field460 - var22 - var20);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field470 * class136.method1007(-6775) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field487, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field481 - var31 - (var16 + var18);
            if (var38 > 0) {
                Image var39 = class109.field1370.createImage(var38, this.field460 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field448, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field483, var16 + var26, var27, null);
            var6.setFont(this.field471);
            var6.setColor(this.field475);
            var6.drawString(var5, var26 + ((this.field481 - this.field453.stringWidth(var5)) / 2), this.field460 / 2 + var27 + 4 + this.field478);
            var3.drawImage(class733.field10259, 0, 0, null);
        } catch (Exception var44) {
            this.field486 = true;
        }
    }
}
