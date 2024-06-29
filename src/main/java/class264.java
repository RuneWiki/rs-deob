import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class264 implements class409 {

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    private int field4083;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    private int field4087;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    private int field4094;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    private int field4110;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
    private int field4112;

    @OriginalMember(owner = "client!wba", name = "H", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!wba", name = "I", descriptor = "I")
    private int field4115;

    @OriginalMember(owner = "client!wba", name = "J", descriptor = "I")
    private int field4116;

    @OriginalMember(owner = "client!wba", name = "K", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!wba", name = "L", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!wba", name = "M", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!wba", name = "N", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "Lla;")
    public static class422 field4095;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "Ljava/awt/Color;")
    private Color field4093;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "Ljava/awt/Font;")
    private Font field4082;

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field4101;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field4085;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field4088;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field4089;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field4090;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field4096;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field4098;

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field4106;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field4107;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field4109;

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field4113;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Z")
    private boolean field4092;

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "Z")
    private boolean field4105;

    @OriginalMember(owner = "client!wba", name = "O", descriptor = "Z")
    private boolean field4121;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)I")
    public final int method1754(boolean arg0) {
        if (arg0) {
            field4103++;
            return 0;
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public static void method1755(int arg0) {
        field4095 = null;
        if (arg0 != 0) {
            method1755(-7);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I")
    public final int method1756(byte arg0) {
        if (arg0 == 56) {
            field4120++;
            return 100;
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
    public final void method1757(byte arg0) {
        if (arg0 > -83) {
            this.field4113 = null;
        }
        field4099++;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    private final void method1758(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field4104++;
        Class var2 = class351.field5138.getClass();
        this.field4096 = (Image) this.method1761(var2, "bar", 0);
        this.field4090 = (Image) this.method1761(var2, "background", 0);
        this.field4085 = (Image) this.method1761(var2, "left", 0);
        this.field4089 = (Image) this.method1761(var2, "right", 0);
        this.field4106 = (Image) this.method1761(var2, "top", 0);
        this.field4107 = (Image) this.method1761(var2, "bottom", 0);
        this.field4088 = (Image) this.method1761(var2, "bodyLeft", 0);
        this.field4098 = (Image) this.method1761(var2, "bodyRight", 0);
        this.field4109 = (Image) this.method1761(var2, "bodyFill", 0);
        this.field4082 = (Font) this.method1761(var2, "bf", 0);
        this.field4101 = (FontMetrics) this.method1761(var2, "bfm", 0);
        this.field4093 = (Color) this.method1761(var2, "colourtext", 0);
        Object var3 = this.method1761(var2, "lb", 0);
        Class var4 = var3.getClass();
        this.field4092 = this.method1766("xMiddle", var3, false, var4);
        if (arg0 < 60) {
            this.field4109 = null;
        }
        this.field4121 = this.method1766("yMiddle", var3, false, var4);
        this.field4116 = this.method1764("xOffset", var3, 0, var4);
        this.field4112 = this.method1764("yOffset", var3, 0, var4);
        this.field4094 = this.method1764("width", var3, 0, var4);
        this.field4083 = this.method1764("height", var3, 0, var4);
        this.field4108 = this.method1764("boxXOffset", var3, 0, var4);
        this.field4086 = this.method1764("boxYOffset", var3, 0, var4);
        this.field4087 = this.method1764("boxWidth", var3, 0, var4);
        this.field4110 = this.method1764("textYOffset", var3, 0, var4);
        this.field4115 = this.method1764("offsetPerTenCycles", var3, 0, var4);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)I")
    private final int method1759(int arg0, byte arg1) {
        field4118++;
        if (this.field4092) {
            return (class660.field9408 - arg0) / 2;
        } else {
            if (arg1 > -7) {
                this.method1756((byte) 0);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method1760(byte arg0, int arg1, String arg2) {
        field4084++;
        int var3 = class472.field6857;
        int[] var4 = class96.field1419;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class573 var7 = class279.field4271[var4[var6]];
            if (var7 != null && class145.field2251 != var7 && var7.field8146 != null && var7.field8146.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg1 == 1) {
                    class514.field7455++;
                    class540 var8 = class257.method1732(true, class680.field9609, class655.field9332);
                    var8.field7707.method1982((byte) -67, var4[var6]);
                    var8.field7707.method1955((byte) -95, 0);
                    class756.method4211(var8, 111);
                } else if (arg1 == 4) {
                    class178.field3051++;
                    class540 var9 = class257.method1732(true, class275.field4203, class655.field9332);
                    var9.field7707.method1925(var4[var6], (byte) -46);
                    var9.field7707.method1959(-20, 0);
                    class756.method4211(var9, 116);
                } else if (arg1 == 5) {
                    class466.field6799++;
                    class540 var12 = class257.method1732(true, class562.field7957, class655.field9332);
                    var12.field7707.method1982((byte) 18, var4[var6]);
                    var12.field7707.method1955((byte) -80, 0);
                    class756.method4211(var12, 110);
                } else if (arg1 == 6) {
                    class204.field3442++;
                    class540 var11 = class257.method1732(true, class659.field9377, class655.field9332);
                    var11.field7707.method1925(var4[var6], (byte) -33);
                    var11.field7707.method1926(0, 65280);
                    class756.method4211(var11, 126);
                } else if (arg1 == 7) {
                    class570.field8086++;
                    class540 var10 = class257.method1732(true, class691.field9804, class655.field9332);
                    var10.field7707.method1939(var4[var6], 1134947720);
                    var10.field7707.method1926(0, 65280);
                    class756.method4211(var10, 114);
                }
                break;
            }
        }
        int var13 = 52 / ((58 - arg0) / 58);
        if (!var5) {
            class564.method3268(class641.field9014.method3621(96, class467.field6804) + arg2, 17137, 4);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
    private final Object method1761(Class arg0, String arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        field4111++;
        Field var4 = arg0.getDeclaredField(arg1);
        Object var5 = var4.get(class351.field5138);
        if (arg2 == 0) {
            var4.set(class351.field5138, null);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IJ)Z")
    public final boolean method1762(int arg0, long arg1) {
        if (arg0 != -31640) {
            this.field4109 = null;
        }
        field4117++;
        return true;
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)V")
    public final void method1763(byte arg0) {
        field4119++;
        class702.method3904(arg0 ^ 0x2E74);
        if (arg0 != 100) {
            this.field4107 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Class;)I")
    private final int method1764(String arg0, Object arg1, int arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg2 != 0) {
            this.field4092 = true;
        }
        field4114++;
        Field var5 = arg3.getDeclaredField(arg0);
        return var5.getInt(arg1);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(IB)I")
    private final int method1765(int arg0, byte arg1) {
        if (arg1 != 9) {
            this.method1763((byte) -63);
        }
        field4100++;
        return this.field4121 ? (class412.field6066 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Class;)Z")
    private final boolean method1766(String arg0, Object arg1, boolean arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field4091++;
        Field var5 = arg3.getDeclaredField(arg0);
        return arg2 ? true : var5.getBoolean(arg1);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
    public final void method1767(boolean arg0, int arg1) {
        if (arg1 < 50) {
            this.field4109 = null;
        }
        field4102++;
        if (!this.field4105) {
            if (class351.field5138 == null) {
                this.field4105 = true;
            } else if (this.field4082 == null) {
                try {
                    this.method1758(119);
                } catch (Exception var43) {
                    this.field4105 = true;
                }
            }
        }
        if (this.field4105) {
            this.method1768((byte) -114);
            return;
        }
        Graphics var3 = class400.field5941.getGraphics();
        if (var3 == null) {
            class400.field5941.repaint();
            return;
        }
        try {
            int var4 = class346.field5112.method3981(true);
            String var5 = class346.field5112.method3978(123);
            if (class255.field4028 == null) {
                class255.field4028 = class400.field5941.createImage(class660.field9408, class412.field6066);
            }
            Graphics var6 = class255.field4028.getGraphics();
            var6.clearRect(0, 0, class660.field9408, class412.field6066);
            int var7 = this.field4088.getWidth(null);
            int var8 = this.field4098.getWidth(null);
            int var9 = this.field4109.getWidth(null);
            int var10 = this.field4088.getHeight(null);
            int var11 = this.field4098.getHeight(null);
            int var12 = this.field4109.getHeight(null);
            var6.drawImage(this.field4088, this.method1759(var7, (byte) -71) + this.field4108 - (this.field4087 / 2), this.method1765(var10, (byte) 9) - -this.field4086, null);
            int var13 = this.field4108 + var7 - (this.field4087 / 2);
            int var14 = this.field4087 / 2 + this.field4108;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field4109, this.method1759(var7, (byte) -59) - (-this.field4108 - var15), this.method1765(var12, (byte) 9) - -this.field4086, null);
            }
            var6.drawImage(this.field4098, this.method1759(var8, (byte) -101) - (-(this.field4087 / 2) - this.field4108), this.method1765(var11, (byte) 9) - -this.field4086, null);
            int var16 = this.field4085.getWidth(null);
            int var17 = this.field4085.getHeight(null);
            int var18 = this.field4089.getWidth(null);
            int var19 = this.field4089.getHeight(null);
            int var20 = this.field4107.getHeight(null);
            int var21 = this.field4106.getWidth(null);
            int var22 = this.field4106.getHeight(null);
            int var23 = this.field4107.getWidth(null);
            int var24 = this.field4096.getWidth(null);
            int var25 = this.field4090.getWidth(null);
            int var26 = this.method1759(this.field4094, (byte) -105) + this.field4116;
            int var27 = this.method1765(this.field4083, (byte) 9) + this.field4112;
            var6.drawImage(this.field4085, var26, var27 + ((this.field4083 - var17) / 2), null);
            var6.drawImage(this.field4089, var26 + this.field4094 - var18, (-var19 + this.field4083) / 2 + var27, null);
            if (this.field4113 == null) {
                this.field4113 = class400.field5941.createImage(this.field4094 - var16 - var18, this.field4083);
            }
            Graphics var28 = this.field4113.getGraphics();
            for (int var29 = 0; var29 < (this.field4094 - (var16 + var18)); var29 += var21) {
                var28.drawImage(this.field4106, var29, 0, null);
            }
            for (int var30 = 0; var30 < this.field4094 - (var16 + var18); var30 += var23) {
                var28.drawImage(this.field4107, var30, this.field4083 - var20, null);
            }
            int var31 = (this.field4094 - var16 - var18) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class400.field5941.createImage(var31, this.field4083 - var22 - var20);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field4115 * class236.method1627(1) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field4096, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field4094 - var18 - var31 - var16;
            if (var38 > 0) {
                Image var39 = class400.field5941.createImage(var38, this.field4083 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field4090, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field4113, var16 + var26, var27, null);
            var6.setFont(this.field4082);
            var6.setColor(this.field4093);
            var6.drawString(var5, (this.field4094 - this.field4101.stringWidth(var5)) / 2 + var26, this.field4083 / 2 + (var27 - -this.field4110) + 4);
            var3.drawImage(class255.field4028, 0, 0, null);
        } catch (Exception var44) {
            this.field4105 = true;
        }
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)V")
    private final void method1768(byte arg0) {
        field4097++;
        if (arg0 >= -62) {
            this.method1757((byte) 87);
        }
        class613.method3502(class624.field8741[class472.field6851], class4.field28[class472.field6851], class218.field3574[class472.field6851], class346.field5112.method3978(116), 54, class346.field5112.method3981(true));
    }
}
