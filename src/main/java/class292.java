import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class292 implements class206 {

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
    private int field4167;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
    private int field4169;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "I")
    private int field4170;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    private int field4173;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    private int field4174;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "I")
    private int field4182;

    @OriginalMember(owner = "client!jfa", name = "x", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!jfa", name = "y", descriptor = "I")
    private int field4186;

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "I")
    private int field4187;

    @OriginalMember(owner = "client!jfa", name = "B", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!jfa", name = "E", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!jfa", name = "F", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!jfa", name = "G", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!jfa", name = "H", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!jfa", name = "K", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!jfa", name = "M", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "Lhf;")
    public static class400 field4177;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "Ljava/awt/Color;")
    private Color field4162;

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "Ljava/awt/Font;")
    private Font field4183;

    @OriginalMember(owner = "client!jfa", name = "L", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field4198;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field4168;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "Ljava/awt/Image;")
    private Image field4171;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field4172;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field4175;

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field4181;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field4184;

    @OriginalMember(owner = "client!jfa", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field4188;

    @OriginalMember(owner = "client!jfa", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field4196;

    @OriginalMember(owner = "client!jfa", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field4200;

    @OriginalMember(owner = "client!jfa", name = "O", descriptor = "Ljava/awt/Image;")
    private Image field4201;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "Z")
    private boolean field4176;

    @OriginalMember(owner = "client!jfa", name = "D", descriptor = "Z")
    private boolean field4190;

    @OriginalMember(owner = "client!jfa", name = "I", descriptor = "Z")
    private boolean field4195;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)V")
    public final void method1376(int arg0) {
        field4192++;
        class557.method3106(86);
        if (arg0 != 31639) {
            this.field4182 = 90;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V")
    public static void method1806(boolean arg0) {
        field4177 = null;
        if (!arg0) {
            field4177 = null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Z")
    private final boolean method1807(byte arg0, Object arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 != 107) {
            this.field4174 = -83;
        }
        field4166++;
        Field var5 = arg2.getDeclaredField(arg3);
        return var5.getBoolean(arg1);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)I")
    private final int method1808(byte arg0, int arg1) {
        field4185++;
        if (this.field4195) {
            return (class199.field2993 - arg1) / 2;
        } else {
            if (arg0 < 125) {
                this.method1375(93);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)I")
    private final int method1809(int arg0, int arg1) {
        field4197++;
        if (this.field4190) {
            return (class228.field3251 - arg1) / 2;
        } else {
            if (arg0 > -68) {
                method1810((byte) 91);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
    public static final void method1810(byte arg0) {
        field4163++;
        int var1 = -8 % ((38 - arg0) / 34);
        class243.field3401.method2131((byte) 72);
        class96.method721((byte) 86);
        class42.field552 = null;
        class513.field6809 = null;
        class397.field5539 = 0;
        class747.field10396 = null;
        class3.field63.field9419 = 0;
        class574.field7540 = 0;
        class378.method2241((byte) 51);
        class31.field492 = null;
        class97.field1204 = 0;
        class732.field10141 = null;
        client.field4355 = 0;
        class185.field2803 = 0;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
    public final void method1373(byte arg0) {
        if (arg0 != -2) {
            this.field4187 = -66;
        }
        field4193++;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V")
    private final void method1811(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field4199++;
        Class var2 = class514.field6818.getClass();
        this.field4196 = (Image) this.method1812(var2, 2, "bar");
        this.field4188 = (Image) this.method1812(var2, 2, "background");
        this.field4175 = (Image) this.method1812(var2, 2, "left");
        this.field4201 = (Image) this.method1812(var2, 2, "right");
        this.field4200 = (Image) this.method1812(var2, 2, "top");
        this.field4168 = (Image) this.method1812(var2, 2, "bottom");
        this.field4172 = (Image) this.method1812(var2, 2, "bodyLeft");
        this.field4181 = (Image) this.method1812(var2, 2, "bodyRight");
        this.field4171 = (Image) this.method1812(var2, 2, "bodyFill");
        this.field4183 = (Font) this.method1812(var2, 2, "bf");
        this.field4198 = (FontMetrics) this.method1812(var2, 2, "bfm");
        if (arg0 > -109) {
            this.method1376(89);
        }
        this.field4162 = (Color) this.method1812(var2, 2, "colourtext");
        Object var3 = this.method1812(var2, 2, "lb");
        Class var4 = var3.getClass();
        this.field4190 = this.method1807((byte) 107, var3, var4, "xMiddle");
        this.field4195 = this.method1807((byte) 107, var3, var4, "yMiddle");
        this.field4174 = this.method1813((byte) -122, var4, "xOffset", var3);
        this.field4169 = this.method1813((byte) -122, var4, "yOffset", var3);
        this.field4186 = this.method1813((byte) -122, var4, "width", var3);
        this.field4187 = this.method1813((byte) -122, var4, "height", var3);
        this.field4170 = this.method1813((byte) -122, var4, "boxXOffset", var3);
        this.field4167 = this.method1813((byte) -122, var4, "boxYOffset", var3);
        this.field4182 = this.method1813((byte) -122, var4, "boxWidth", var3);
        this.field4173 = this.method1813((byte) -122, var4, "textYOffset", var3);
        this.field4191 = this.method1813((byte) -122, var4, "offsetPerTenCycles", var3);
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)I")
    public final int method1375(int arg0) {
        if (arg0 == -11222) {
            field4164++;
            return 0;
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZB)V")
    public final void method1377(boolean arg0, byte arg1) {
        field4165++;
        if (!this.field4176) {
            if (class514.field6818 == null) {
                this.field4176 = true;
            } else if (this.field4183 == null) {
                try {
                    this.method1811((byte) -122);
                } catch (Exception var44) {
                    this.field4176 = true;
                }
            }
        }
        if (this.field4176) {
            this.method1814((byte) 90);
            return;
        }
        Graphics var3 = class295.field4217.getGraphics();
        if (var3 == null) {
            class295.field4217.repaint();
        } else {
            try {
                int var4 = class549.field7251.method1272((byte) 43);
                String var5 = class549.field7251.method1282((byte) 21);
                if (class281.field3984 == null) {
                    class281.field3984 = class295.field4217.createImage(class228.field3251, class199.field2993);
                }
                Graphics var6 = class281.field3984.getGraphics();
                var6.clearRect(0, 0, class228.field3251, class199.field2993);
                int var7 = this.field4172.getWidth(null);
                int var8 = this.field4181.getWidth(null);
                int var9 = this.field4171.getWidth(null);
                int var10 = this.field4172.getHeight(null);
                int var11 = this.field4181.getHeight(null);
                int var12 = this.field4171.getHeight(null);
                var6.drawImage(this.field4172, this.method1809(-82, var7) + this.field4170 - (this.field4182 / 2), this.method1808((byte) 127, var10) - -this.field4167, null);
                int var13 = this.field4170 + var7 - this.field4182 / 2;
                int var14 = this.field4170 + (this.field4182 / 2);
                for (int var15 = var13; var15 <= var14; var15 += var9) {
                    var6.drawImage(this.field4171, this.method1809(-91, var7) + this.field4170 + var15, this.method1808((byte) 126, var12) + this.field4167, null);
                }
                var6.drawImage(this.field4181, this.method1809(-93, var8) + this.field4182 / 2 + this.field4170, this.method1808((byte) 126, var11) - -this.field4167, null);
                int var16 = this.field4175.getWidth(null);
                int var17 = this.field4175.getHeight(null);
                int var18 = this.field4201.getWidth(null);
                int var19 = this.field4201.getHeight(null);
                int var20 = this.field4168.getHeight(null);
                int var21 = this.field4200.getWidth(null);
                int var22 = this.field4200.getHeight(null);
                int var23 = this.field4168.getWidth(null);
                int var24 = this.field4196.getWidth(null);
                int var25 = this.field4188.getWidth(null);
                int var26 = this.method1809(-95, this.field4186) + this.field4174;
                int var27 = this.method1808((byte) 127, this.field4187) + this.field4169;
                var6.drawImage(this.field4175, var26, (this.field4187 - var17) / 2 + var27, null);
                var6.drawImage(this.field4201, this.field4186 + var26 - var18, (-var19 + this.field4187) / 2 + var27, null);
                if (this.field4184 == null) {
                    this.field4184 = class295.field4217.createImage(this.field4186 - var18 - var16, this.field4187);
                }
                Graphics var28 = this.field4184.getGraphics();
                for (int var29 = 0; var29 < this.field4186 - var16 - var18; var29 += var21) {
                    var28.drawImage(this.field4200, var29, 0, null);
                }
                for (int var30 = 0; var30 < this.field4186 - var16 - var18; var30 += var23) {
                    var28.drawImage(this.field4168, var30, this.field4187 - var20, null);
                }
                int var31 = (this.field4186 - var18 - var16) * var4 / 100;
                if (var31 > 0) {
                    Image var32 = class295.field4217.createImage(var31, this.field4187 - var22 - var20);
                    int var33 = var32.getWidth(null);
                    Graphics var34 = var32.getGraphics();
                    int var35 = this.field4191 * class251.method1537(-16632) / 10 % var24;
                    for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                        var34.drawImage(this.field4196, var36, 0, null);
                    }
                    var28.drawImage(var32, 0, var22, null);
                }
                int var38 = this.field4186 - var16 - var18 - var31;
                if (var38 > 0) {
                    Image var39 = class295.field4217.createImage(var38, this.field4187 - var20 - var22);
                    int var40 = var39.getWidth(null);
                    Graphics var41 = var39.getGraphics();
                    for (int var42 = 0; var42 < var40; var42 += var25) {
                        var41.drawImage(this.field4188, var42, 0, null);
                    }
                    var28.drawImage(var39, var31, var22, null);
                }
                var6.drawImage(this.field4184, var26 + var16, var27, null);
                var6.setFont(this.field4183);
                var6.setColor(this.field4162);
                var6.drawString(var5, (this.field4186 - this.field4198.stringWidth(var5)) / 2 + var26, this.field4187 / 2 + var27 + 4 - -this.field4173);
                var3.drawImage(class281.field3984, 0, 0, null);
            } catch (Exception var45) {
                this.field4176 = true;
            }
        }
        int var43 = -98 / ((arg1 + 24) / 48);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;")
    private final Object method1812(Class arg0, int arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        field4189++;
        Field var4 = arg0.getDeclaredField(arg2);
        Object var5 = var4.get(class514.field6818);
        var4.set(class514.field6818, null);
        if (arg1 != 2) {
            this.method1376(-96);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)I")
    public final int method1374(int arg0) {
        if (arg0 != 26583) {
            this.method1373((byte) 2);
        }
        field4180++;
        return 100;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(JI)Z")
    public final boolean method1378(long arg0, int arg1) {
        if (arg1 != -3650) {
            this.field4196 = null;
        }
        field4194++;
        return true;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)I")
    private final int method1813(byte arg0, Class arg1, String arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        field4179++;
        Field var5 = arg1.getDeclaredField(arg2);
        if (arg0 != -122) {
            this.method1378(-3L, 26);
        }
        return var5.getInt(arg3);
    }

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "(B)V")
    private final void method1814(byte arg0) {
        class26.method248(class549.field7251.method1272((byte) 43), class74.field904[class287.field4064], (byte) 87, class5.field126[class287.field4064], class549.field7251.method1282((byte) 21), class567.field7455[class287.field4064]);
        if (arg0 >= 53) {
            field4178++;
        }
    }
}
