import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class22 implements class334 {

    @OriginalMember(owner = "client!ria", name = "t", descriptor = "I")
    public static int field287 = 0;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "Lus;")
    public static class328 field293 = new class328(64, -1);

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ria", name = "q", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!ria", name = "s", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ria", name = "u", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ria", name = "w", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ria", name = "x", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client!ria", name = "y", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ria", name = "A", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ria", name = "E", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!ria", name = "F", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ria", name = "I", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!ria", name = "J", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ria", name = "L", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!ria", name = "O", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ria", name = "P", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!ria", name = "Q", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "Ljava/awt/Color;")
    private Color field272;

    @OriginalMember(owner = "client!ria", name = "N", descriptor = "Ljava/awt/Font;")
    private Font field306;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field268;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "Ljava/awt/Image;")
    private Image field269;

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field279;

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field280;

    @OriginalMember(owner = "client!ria", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field285;

    @OriginalMember(owner = "client!ria", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field289;

    @OriginalMember(owner = "client!ria", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field295;

    @OriginalMember(owner = "client!ria", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field296;

    @OriginalMember(owner = "client!ria", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field297;

    @OriginalMember(owner = "client!ria", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field300;

    @OriginalMember(owner = "client!ria", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field305;

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "Z")
    private boolean field277;

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "Z")
    private boolean field282;

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "Z")
    private boolean field283;

    @OriginalMember(owner = "client!ria", name = "K", descriptor = "[Lac;")
    public static class712[] field303;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Ljava/lang/Object;", line = 5)
    private final Object method228(String arg0, byte arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
        if (arg1 != 1) {
            return null;
        }
        field288++;
        Field var4 = arg2.getDeclaredField(arg0);
        Object var5 = var4.get(class745.field10393);
        var4.set(class745.field10393, null);
        return var5;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V", line = 23)
    private final void method229(byte arg0) {
        field302++;
        if (arg0 != 111) {
            this.method236(8, (byte) -86);
        }
        class570.method3209(class583.field8091[class414.field5845], class733.field10249.method2370(true), class733.field10249.method2377(-1), class514.field7247[class414.field5845], class621.field8687[class414.field5845], (byte) 51);
    }

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "(I)V", line = 38)
    private final void method230(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field271++;
        Class var2 = class745.field10393.getClass();
        this.field295 = (Image) this.method228("bar", (byte) 1, var2);
        this.field305 = (Image) this.method228("background", (byte) 1, var2);
        this.field296 = (Image) this.method228("left", (byte) 1, var2);
        this.field297 = (Image) this.method228("right", (byte) 1, var2);
        this.field280 = (Image) this.method228("top", (byte) 1, var2);
        this.field279 = (Image) this.method228("bottom", (byte) 1, var2);
        this.field285 = (Image) this.method228("bodyLeft", (byte) 1, var2);
        this.field269 = (Image) this.method228("bodyRight", (byte) 1, var2);
        this.field289 = (Image) this.method228("bodyFill", (byte) 1, var2);
        this.field306 = (Font) this.method228("bf", (byte) 1, var2);
        this.field268 = (FontMetrics) this.method228("bfm", (byte) 1, var2);
        this.field272 = (Color) this.method228("colourtext", (byte) 1, var2);
        Object var3 = this.method228("lb", (byte) 1, var2);
        Class var4 = var3.getClass();
        this.field282 = this.method231("xMiddle", var3, -123, var4);
        this.field277 = this.method231("yMiddle", var3, -122, var4);
        this.field304 = this.method237("xOffset", var4, var3, arg0);
        this.field291 = this.method237("yOffset", var4, var3, 0);
        this.field308 = this.method237("width", var4, var3, 0);
        this.field278 = this.method237("height", var4, var3, 0);
        this.field298 = this.method237("boxXOffset", var4, var3, 0);
        this.field284 = this.method237("boxYOffset", var4, var3, arg0);
        this.field276 = this.method237("boxWidth", var4, var3, arg0);
        this.field301 = this.method237("textYOffset", var4, var3, 0);
        this.field309 = this.method237("offsetPerTenCycles", var4, var3, 0);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Class;)Z", line = 79)
    private final boolean method231(String arg0, Object arg1, int arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field275++;
        if (arg2 > -121) {
            this.method242(-1);
        }
        Field var5 = arg3.getDeclaredField(arg0);
        return var5.getBoolean(arg1);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZ)V", line = 92)
    public final void method232(int arg0, boolean arg1) {
        if (!this.field283) {
            if (class745.field10393 == null) {
                this.field283 = true;
            } else if (this.field306 == null) {
                try {
                    this.method230(0);
                } catch (Exception var43) {
                    this.field283 = true;
                }
            }
        }
        field292++;
        if (this.field283) {
            this.method229((byte) 111);
            return;
        }
        if (arg0 < 54) {
            this.field291 = 37;
        }
        Graphics var3 = class68.field939.getGraphics();
        if (var3 == null) {
            class68.field939.repaint();
            return;
        }
        try {
            int var4 = class733.field10249.method2370(true);
            String var5 = class733.field10249.method2377(-1);
            if (class218.field2774 == null) {
                class218.field2774 = class68.field939.createImage(class599.field8320, class84.field1083);
            }
            Graphics var6 = class218.field2774.getGraphics();
            var6.clearRect(0, 0, class599.field8320, class84.field1083);
            int var7 = this.field285.getWidth(null);
            int var8 = this.field269.getWidth(null);
            int var9 = this.field289.getWidth(null);
            int var10 = this.field285.getHeight(null);
            int var11 = this.field269.getHeight(null);
            int var12 = this.field289.getHeight(null);
            var6.drawImage(this.field285, this.method234(var7, 2) + this.field298 - (this.field276 / 2), this.method236(var10, (byte) 63) + this.field284, null);
            int var13 = this.field298 + var7 - (this.field276 / 2);
            int var14 = this.field276 / 2 + this.field298;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field289, this.method234(var7, 2) - (-this.field298 - var15), this.method236(var12, (byte) 117) + this.field284, null);
            }
            var6.drawImage(this.field269, this.method234(var8, 2) + this.field298 + (this.field276 / 2), this.method236(var11, (byte) 64) - -this.field284, null);
            int var16 = this.field296.getWidth(null);
            int var17 = this.field296.getHeight(null);
            int var18 = this.field297.getWidth(null);
            int var19 = this.field297.getHeight(null);
            int var20 = this.field279.getHeight(null);
            int var21 = this.field280.getWidth(null);
            int var22 = this.field280.getHeight(null);
            int var23 = this.field279.getWidth(null);
            int var24 = this.field295.getWidth(null);
            int var25 = this.field305.getWidth(null);
            int var26 = this.method234(this.field308, 2) + this.field304;
            int var27 = this.method236(this.field278, (byte) 51) + this.field291;
            var6.drawImage(this.field296, var26, (this.field278 - var17) / 2 + var27, null);
            var6.drawImage(this.field297, var26 + this.field308 - var18, (-var19 + this.field278) / 2 + var27, null);
            if (this.field300 == null) {
                this.field300 = class68.field939.createImage(this.field308 - var18 - var16, this.field278);
            }
            Graphics var28 = this.field300.getGraphics();
            for (int var29 = 0; var29 < (this.field308 - var16 - var18); var29 += var21) {
                var28.drawImage(this.field280, var29, 0, null);
            }
            for (int var30 = 0; var30 < this.field308 - var16 - var18; var30 += var23) {
                var28.drawImage(this.field279, var30, this.field278 - var20, null);
            }
            int var31 = (this.field308 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class68.field939.createImage(var31, this.field278 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field309 * class475.method2786(0) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field295, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field308 - var16 - var31 - var18;
            if (var38 > 0) {
                Image var39 = class68.field939.createImage(var38, this.field278 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field305, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field300, var26 + var16, var27, null);
            var6.setFont(this.field306);
            var6.setColor(this.field272);
            var6.drawString(var5, var26 + ((this.field308 - this.field268.stringWidth(var5)) / 2), var27 - (-(this.field278 / 2) - 4 - this.field301));
            var3.drawImage(class218.field2774, 0, 0, null);
        } catch (Exception var44) {
            this.field283 = true;
        }
    }

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "(I)V", line = 284)
    public static void method233(int arg0) {
        if (arg0 == 0) {
            field303 = null;
            field293 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(II)I", line = 297)
    private final int method234(int arg0, int arg1) {
        field294++;
        if (this.field282) {
            return (class599.field8320 - arg0) / 2;
        } else {
            if (arg1 != 2) {
                this.field284 = -99;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "(I)I", line = 327)
    public final int method235(int arg0) {
        if (arg0 != 9642) {
            this.method229((byte) 59);
        }
        field299++;
        return 100;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IB)I", line = 341)
    private final int method236(int arg0, byte arg1) {
        field307++;
        int var3 = -114 / ((arg1 + 25) / 45);
        return this.field277 ? (class84.field1083 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;I)I", line = 355)
    private final int method237(String arg0, Class arg1, Object arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg3 == 0) {
            field281++;
            Field var5 = arg1.getDeclaredField(arg0);
            return var5.getInt(arg2);
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)I", line = 369)
    public final int method238(boolean arg0) {
        field290++;
        if (arg0) {
            this.field300 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZZLub;I)V", line = 383)
    public static final void method239(boolean arg0, boolean arg1, class157 arg2, int arg3) {
        field274++;
        int var4 = arg2.field2028;
        int var5 = (int) arg2.field8746;
        arg2.method3426((byte) -48);
        if (arg0) {
            class156.method976(10, var4);
        }
        if (arg3 != 7799) {
            method233(-72);
        }
        class264.method1590(var4, 9128);
        class460 var6 = class102.method684(5025, var5);
        if (var6 != null) {
            class663.method3591(16886, var6);
        }
        class421.method2498(arg3 ^ 0x1E71);
        if (!arg1 && class638.field8834 != -1) {
            class677.method3641(1, class638.field8834, 31);
        }
        class700 var7 = new class700(class148.field1802);
        for (class157 var8 = (class157) var7.method3877(arg3 - 5368); var8 != null; var8 = (class157) var7.method3876(arg3 - 7800)) {
            if (!var8.method3425(-16972)) {
                var8 = (class157) var7.method3877(arg3 - 5368);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2027 == 3) {
                int var9 = (int) var8.field8746;
                if ((var9 >>> 16) == var4) {
                    method239(true, arg1, var8, 7799);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IJ)Z", line = 440)
    public final boolean method240(int arg0, long arg1) {
        if (arg0 == -2865) {
            field273++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)V", line = 457)
    public final void method241(int arg0) {
        field286++;
        int var2 = -1 % ((arg0 + 60) / 40);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V", line = 467)
    public final void method242(int arg0) {
        field270++;
        if (arg0 != -29379) {
            method239(false, true, null, -104);
        }
        class634.method3444(0);
    }
}
