import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class198 implements class715 {

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    private int field2309;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    private int field2312;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    private int field2319;

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!wfa", name = "s", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!wfa", name = "x", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!wfa", name = "y", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!wfa", name = "A", descriptor = "I")
    private int field2331;

    @OriginalMember(owner = "client!wfa", name = "C", descriptor = "I")
    private int field2332;

    @OriginalMember(owner = "client!wfa", name = "D", descriptor = "I")
    private int field2333;

    @OriginalMember(owner = "client!wfa", name = "G", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!wfa", name = "J", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!wfa", name = "L", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!wfa", name = "M", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!wfa", name = "O", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!wfa", name = "Q", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "Ljava/awt/Color;")
    private Color field2320;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "Ljava/awt/Font;")
    private Font field2313;

    @OriginalMember(owner = "client!wfa", name = "P", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field2345;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field2311;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field2315;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field2316;

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field2322;

    @OriginalMember(owner = "client!wfa", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field2335;

    @OriginalMember(owner = "client!wfa", name = "H", descriptor = "Ljava/awt/Image;")
    private Image field2337;

    @OriginalMember(owner = "client!wfa", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field2338;

    @OriginalMember(owner = "client!wfa", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field2340;

    @OriginalMember(owner = "client!wfa", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field2343;

    @OriginalMember(owner = "client!wfa", name = "R", descriptor = "Ljava/awt/Image;")
    private Image field2347;

    @OriginalMember(owner = "client!wfa", name = "t", descriptor = "Z")
    private boolean field2324;

    @OriginalMember(owner = "client!wfa", name = "v", descriptor = "Z")
    private boolean field2326;

    @OriginalMember(owner = "client!wfa", name = "w", descriptor = "Z")
    private boolean field2327;

    @OriginalMember(owner = "client!wfa", name = "E", descriptor = "[Lhu;")
    public static class131[] field2334;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)V")
    private final void method1185(int arg0) {
        class577.method3331(class163.field1824[class302.field3783], 3, class681.field9644[class302.field3783], class188.field2237.method4052(99), class188.field2237.method4045(78), class261.field3239[class302.field3783]);
        if (arg0 == 0) {
            field2342++;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)I")
    public final int method1186(int arg0) {
        if (arg0 != 31867) {
            this.method1190(0);
        }
        field2346++;
        return 100;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/Object;")
    private final Object method1187(Class arg0, String arg1, boolean arg2) throws IllegalAccessException, NoSuchFieldException {
        if (arg2) {
            return null;
        }
        field2328++;
        Field var4 = arg0.getDeclaredField(arg1);
        Object var5 = var4.get(class255.field3123);
        var4.set(class255.field3123, null);
        return var5;
    }

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "(I)V")
    private final void method1188(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field2341++;
        Class var2 = class255.field3123.getClass();
        this.field2347 = (Image) this.method1187(var2, "bar", false);
        this.field2311 = (Image) this.method1187(var2, "background", false);
        this.field2343 = (Image) this.method1187(var2, "left", false);
        this.field2337 = (Image) this.method1187(var2, "right", false);
        this.field2338 = (Image) this.method1187(var2, "top", false);
        this.field2335 = (Image) this.method1187(var2, "bottom", false);
        this.field2340 = (Image) this.method1187(var2, "bodyLeft", false);
        this.field2315 = (Image) this.method1187(var2, "bodyRight", false);
        this.field2316 = (Image) this.method1187(var2, "bodyFill", false);
        this.field2313 = (Font) this.method1187(var2, "bf", false);
        this.field2345 = (FontMetrics) this.method1187(var2, "bfm", false);
        this.field2320 = (Color) this.method1187(var2, "colourtext", false);
        Object var3 = this.method1187(var2, "lb", false);
        Class var4 = var3.getClass();
        this.field2324 = this.method1195(arg0, var3, "xMiddle", var4);
        this.field2327 = this.method1195(arg0 + arg0, var3, "yMiddle", var4);
        this.field2307 = this.method1194(var3, 12985, "xOffset", var4);
        this.field2309 = this.method1194(var3, 12985, "yOffset", var4);
        this.field2339 = this.method1194(var3, 12985, "width", var4);
        this.field2333 = this.method1194(var3, arg0 ^ 0x32B9, "height", var4);
        this.field2332 = this.method1194(var3, 12985, "boxXOffset", var4);
        this.field2319 = this.method1194(var3, 12985, "boxYOffset", var4);
        this.field2331 = this.method1194(var3, 12985, "boxWidth", var4);
        this.field2344 = this.method1194(var3, 12985, "textYOffset", var4);
        this.field2312 = this.method1194(var3, arg0 + 12985, "offsetPerTenCycles", var4);
    }

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "(I)V")
    public static void method1189(int arg0) {
        field2334 = null;
        if (arg0 != 15572) {
            field2314 = 97;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
    public final void method1190(int arg0) {
        field2321++;
        if (arg0 != 4046) {
            this.field2340 = null;
        }
        class308.method1840(0);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)I")
    private final int method1191(int arg0, int arg1) {
        field2336++;
        if (this.field2327) {
            return (class476.field6777 - arg0) / 2;
        } else if (arg1 == 0) {
            return 0;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(JI)Z")
    public final boolean method1192(long arg0, int arg1) {
        field2308++;
        if (arg1 != -3762) {
            this.field2337 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)V")
    public final void method1193(boolean arg0, int arg1) {
        field2325++;
        if (!this.field2326) {
            if (class255.field3123 == null) {
                this.field2326 = true;
            } else if (this.field2313 == null) {
                try {
                    this.method1188(0);
                } catch (Exception var43) {
                    this.field2326 = true;
                }
            }
        }
        if (arg1 != 23552) {
            this.field2335 = null;
        }
        if (this.field2326) {
            this.method1185(0);
            return;
        }
        Graphics var3 = class618.field8849.getGraphics();
        if (var3 == null) {
            class618.field8849.repaint();
            return;
        }
        try {
            int var4 = class188.field2237.method4045(125);
            String var5 = class188.field2237.method4052(99);
            if (class340.field4400 == null) {
                class340.field4400 = class618.field8849.createImage(class705.field9926, class476.field6777);
            }
            Graphics var6 = class340.field4400.getGraphics();
            var6.clearRect(0, 0, class705.field9926, class476.field6777);
            int var7 = this.field2340.getWidth(null);
            int var8 = this.field2315.getWidth(null);
            int var9 = this.field2316.getWidth(null);
            int var10 = this.field2340.getHeight(null);
            int var11 = this.field2315.getHeight(null);
            int var12 = this.field2316.getHeight(null);
            var6.drawImage(this.field2340, this.method1198(-110, var7) - ((this.field2331 / 2) - this.field2332), this.method1191(var10, arg1 ^ 0x5C00) - -this.field2319, null);
            int var13 = this.field2332 + var7 - (this.field2331 / 2);
            int var14 = this.field2332 + (this.field2331 / 2);
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field2316, var15 + this.method1198(-127, var7) + this.field2332, this.method1191(var12, arg1 + -23552) + this.field2319, null);
            }
            var6.drawImage(this.field2315, this.method1198(-126, var8) + this.field2332 + this.field2331 / 2, this.method1191(var11, 0) + this.field2319, null);
            int var16 = this.field2343.getWidth(null);
            int var17 = this.field2343.getHeight(null);
            int var18 = this.field2337.getWidth(null);
            int var19 = this.field2337.getHeight(null);
            int var20 = this.field2335.getHeight(null);
            int var21 = this.field2338.getWidth(null);
            int var22 = this.field2338.getHeight(null);
            int var23 = this.field2335.getWidth(null);
            int var24 = this.field2347.getWidth(null);
            int var25 = this.field2311.getWidth(null);
            int var26 = this.method1198(-128, this.field2339) + this.field2307;
            int var27 = this.method1191(this.field2333, arg1 - 23552) + this.field2309;
            var6.drawImage(this.field2343, var26, var27 + ((this.field2333 - var17) / 2), null);
            var6.drawImage(this.field2337, this.field2339 + var26 - var18, (this.field2333 - var19) / 2 + var27, null);
            if (this.field2322 == null) {
                this.field2322 = class618.field8849.createImage(this.field2339 - var16 - var18, this.field2333);
            }
            Graphics var28 = this.field2322.getGraphics();
            for (int var29 = 0; var29 < this.field2339 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field2338, var29, 0, null);
            }
            for (int var30 = 0; var30 < this.field2339 - var16 - var18; var30 += var23) {
                var28.drawImage(this.field2335, var30, this.field2333 - var20, null);
            }
            int var31 = (this.field2339 - var16 - var18) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class618.field8849.createImage(var31, this.field2333 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field2312 * class668.method3794(arg1 - 23552) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field2347, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field2339 - var16 - var31 - var18;
            if (var38 > 0) {
                Image var39 = class618.field8849.createImage(var38, this.field2333 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field2311, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field2322, var16 + var26, var27, null);
            var6.setFont(this.field2313);
            var6.setColor(this.field2320);
            var6.drawString(var5, (this.field2339 - this.field2345.stringWidth(var5)) / 2 + var26, this.field2333 / 2 + var27 + this.field2344 + 4);
            var3.drawImage(class340.field4400, 0, 0, null);
        } catch (Exception var44) {
            this.field2326 = true;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)I")
    private final int method1194(Object arg0, int arg1, String arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field2330++;
        if (arg1 != 12985) {
            method1189(-34);
        }
        Field var5 = arg3.getDeclaredField(arg2);
        return var5.getInt(arg0);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Z")
    private final boolean method1195(int arg0, Object arg1, String arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 != 0) {
            this.method1193(false, -82);
        }
        field2329++;
        Field var5 = arg3.getDeclaredField(arg2);
        return var5.getBoolean(arg1);
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)I")
    public final int method1196(byte arg0) {
        if (arg0 < 26) {
            return -87;
        } else {
            field2323++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
    public final void method1197(byte arg0) {
        field2317++;
        if (arg0 != -3) {
            this.method1192(18L, 14);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)I")
    private final int method1198(int arg0, int arg1) {
        field2310++;
        if (this.field2324) {
            return (class705.field9926 - arg1) / 2;
        } else {
            if (arg0 > -66) {
                this.method1196((byte) -111);
            }
            return 0;
        }
    }
}
