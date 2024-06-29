import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class78 implements class646 {

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "B")
    public static byte field1107 = -6;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Ljava/awt/Color;")
    private Color field1098;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "Ljava/awt/Font;")
    private Font field1115;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field1118;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field1090;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Ljava/awt/Image;")
    private Image field1093;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field1094;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field1095;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field1101;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field1110;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field1112;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Ljava/awt/Image;")
    private Image field1114;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "Ljava/awt/Image;")
    private Image field1117;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field1119;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Z")
    private boolean field1100;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Z")
    private boolean field1106;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "Z")
    private boolean field1124;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/Object;Ljava/lang/String;)I", line = 3)
    private final int method477(Class arg0, boolean arg1, Object arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field1087++;
        Field var5 = arg0.getDeclaredField(arg3);
        return arg1 ? 99 : var5.getInt(arg2);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BJ)Z", line = 17)
    public final boolean method478(byte arg0, long arg1) {
        field1089++;
        return arg0 >= 40;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 30)
    public final void method479(int arg0) {
        if (arg0 != 21324) {
            this.field1114 = null;
        }
        field1097++;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 40)
    private final void method480(int arg0) {
        class205.method1387(class601.field7648.method1335(arg0), class601.field7648.method1327(123), -3251, class13.field136[class673.field8709], class256.field3475[class673.field8709], class496.field6337[class673.field8709]);
        field1105++;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V", line = 48)
    private final void method481(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field1086++;
        Class var2 = class80.field1134.getClass();
        this.field1119 = (Image) this.method490(var2, "bar", true);
        this.field1093 = (Image) this.method490(var2, "background", true);
        this.field1095 = (Image) this.method490(var2, "left", true);
        this.field1110 = (Image) this.method490(var2, "right", true);
        this.field1114 = (Image) this.method490(var2, "top", true);
        this.field1090 = (Image) this.method490(var2, "bottom", true);
        this.field1101 = (Image) this.method490(var2, "bodyLeft", true);
        this.field1117 = (Image) this.method490(var2, "bodyRight", true);
        this.field1094 = (Image) this.method490(var2, "bodyFill", true);
        this.field1115 = (Font) this.method490(var2, "bf", true);
        if (arg0 != 0) {
            this.method478((byte) 104, -107L);
        }
        this.field1118 = (FontMetrics) this.method490(var2, "bfm", true);
        this.field1098 = (Color) this.method490(var2, "colourtext", true);
        Object var3 = this.method490(var2, "lb", true);
        Class var4 = var3.getClass();
        this.field1106 = this.method491((byte) -6, var4, "xMiddle", var3);
        this.field1124 = this.method491((byte) -6, var4, "yMiddle", var3);
        this.field1116 = this.method477(var4, false, var3, "xOffset");
        this.field1111 = this.method477(var4, false, var3, "yOffset");
        this.field1123 = this.method477(var4, false, var3, "width");
        this.field1103 = this.method477(var4, false, var3, "height");
        this.field1108 = this.method477(var4, false, var3, "boxXOffset");
        this.field1102 = this.method477(var4, false, var3, "boxYOffset");
        this.field1091 = this.method477(var4, false, var3, "boxWidth");
        this.field1096 = this.method477(var4, false, var3, "textYOffset");
        this.field1099 = this.method477(var4, false, var3, "offsetPerTenCycles");
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 96)
    public static final void method482() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class166.field2206.length; var1++) {
                if (class166.field2206[var1].method3838()) {
                    class634.field8053[var1] = class166.field2206[var1].method3835();
                } else {
                    synchronized (class166.field2206[var1]) {
                        class166.field2206[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class166.field2206[class166.field2206.length - 1].method3833();
                class490.method2736(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class166.field2206.length - 1; var4++) {
                        if (!class166.field2206[var4].method3838()) {
                            synchronized (class166.field2206[var4]) {
                                class166.field2206[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class166.field2206.length - 2; var6++) {
                            class166.field2206[var6].method3833();
                        }
                        class490.method2736(2);
                        while (!class166.field2206[0].method3838()) {
                            synchronized (class166.field2206[0]) {
                                class166.field2206[0].notify();
                            }
                            try {
                                class591.method3181(1L, 0);
                            } catch (Exception var9) {
                            }
                        }
                        class166.field2206[0].method3833();
                        return;
                    }
                    try {
                        class591.method3181(1L, 0);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class591.method3181(1L, 0);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)I", line = 195)
    private final int method483(boolean arg0, int arg1) {
        field1120++;
        if (this.field1124) {
            return (class463.field6021 - arg1) / 2;
        } else {
            if (!arg0) {
                this.field1099 = -104;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIILdg;IIBILpf;)V", line = 213)
    public static final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class20 arg6, int arg7, int arg8, byte arg9, int arg10, class759 arg11) {
        if (arg9 > -118) {
            field1107 = -60;
        }
        class719.field9457 = arg7;
        class100.field1338 = arg1;
        class570.field7204 = arg8;
        class785.field10774 = arg11;
        field1104++;
        class405.field5376 = arg0;
        class730.field9572 = arg2;
        class81.field1147 = null;
        class246.field3378 = arg10;
        class23.field201 = arg6;
        class188.field2617 = arg4;
        class63.field829 = arg5;
        class164.field2174 = null;
        class196.field2732 = null;
        class518.field6596 = arg3;
        class425.method2450(3);
        class536.field6762 = true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I", line = 240)
    private final int method485(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1091 = -64;
        }
        field1085++;
        return this.field1106 ? (class372.field4550 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 259)
    public final void method486(int arg0) {
        field1084++;
        if (arg0 <= 18) {
            this.method480(86);
        }
        class463.method2602(1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I", line = 273)
    public final int method487(byte arg0) {
        field1109++;
        if (arg0 != -87) {
            this.field1093 = null;
        }
        return 100;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Z", line = 284)
    public static final boolean method488(boolean arg0) {
        if (!arg0) {
            method484(117, -81, -39, 55, -24, -110, null, 51, -112, (byte) -107, -78, null);
        }
        field1092++;
        return class332.field4052 >= 1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V", line = 305)
    public final void method489(int arg0, boolean arg1) {
        field1122++;
        if (!this.field1100) {
            if (class80.field1134 == null) {
                this.field1100 = true;
            } else if (this.field1115 == null) {
                try {
                    this.method481(0);
                } catch (Exception var44) {
                    this.field1100 = true;
                }
            }
        }
        int var3 = -46 / ((-arg0 - 60) / 61);
        if (this.field1100) {
            this.method480(0);
            return;
        }
        Graphics var4 = class678.field8763.getGraphics();
        if (var4 == null) {
            class678.field8763.repaint();
            return;
        }
        try {
            int var5 = class601.field7648.method1327(-118);
            String var6 = class601.field7648.method1335(0);
            if (class594.field7548 == null) {
                class594.field7548 = class678.field8763.createImage(class372.field4550, class463.field6021);
            }
            Graphics var7 = class594.field7548.getGraphics();
            var7.clearRect(0, 0, class372.field4550, class463.field6021);
            int var8 = this.field1101.getWidth(null);
            int var9 = this.field1117.getWidth(null);
            int var10 = this.field1094.getWidth(null);
            int var11 = this.field1101.getHeight(null);
            int var12 = this.field1117.getHeight(null);
            int var13 = this.field1094.getHeight(null);
            var7.drawImage(this.field1101, this.method485(0, var8) + (this.field1108 - this.field1091 / 2), this.method483(true, var11) + this.field1102, null);
            int var14 = this.field1108 + var8 - (this.field1091 / 2);
            int var15 = this.field1091 / 2 + this.field1108;
            for (int var16 = var14; var16 <= var15; var16 += var10) {
                var7.drawImage(this.field1094, this.method485(0, var8) + this.field1108 + var16, this.method483(true, var13) - -this.field1102, null);
            }
            var7.drawImage(this.field1117, this.method485(0, var9) + (this.field1108 + (this.field1091 / 2)), this.method483(true, var12) - -this.field1102, null);
            int var17 = this.field1095.getWidth(null);
            int var18 = this.field1095.getHeight(null);
            int var19 = this.field1110.getWidth(null);
            int var20 = this.field1110.getHeight(null);
            int var21 = this.field1090.getHeight(null);
            int var22 = this.field1114.getWidth(null);
            int var23 = this.field1114.getHeight(null);
            int var24 = this.field1090.getWidth(null);
            int var25 = this.field1119.getWidth(null);
            int var26 = this.field1093.getWidth(null);
            int var27 = this.method485(0, this.field1123) + this.field1116;
            int var28 = this.method483(true, this.field1103) + this.field1111;
            var7.drawImage(this.field1095, var27, var28 + ((this.field1103 - var18) / 2), null);
            var7.drawImage(this.field1110, var27 + this.field1123 - var19, (this.field1103 - var20) / 2 + var28, null);
            if (this.field1112 == null) {
                this.field1112 = class678.field8763.createImage(this.field1123 - var17 - var19, this.field1103);
            }
            Graphics var29 = this.field1112.getGraphics();
            for (int var30 = 0; var30 < (this.field1123 - var17 - var19); var30 += var22) {
                var29.drawImage(this.field1114, var30, 0, null);
            }
            for (int var31 = 0; var31 < this.field1123 - (var17 + var19); var31 += var24) {
                var29.drawImage(this.field1090, var31, this.field1103 - var21, null);
            }
            int var32 = (this.field1123 - var17 - var19) * var5 / 100;
            if (var32 > 0) {
                Image var33 = class678.field8763.createImage(var32, this.field1103 - var23 - var21);
                int var34 = var33.getWidth(null);
                Graphics var35 = var33.getGraphics();
                int var36 = this.field1099 * class120.method713((byte) 110) / 10 % var25;
                for (int var37 = var36 - var25; var37 < var34; var37 += var25) {
                    var35.drawImage(this.field1119, var37, 0, null);
                }
                var29.drawImage(var33, 0, var23, null);
            }
            int var39 = this.field1123 - var17 - var19 - var32;
            if (var39 > 0) {
                Image var40 = class678.field8763.createImage(var39, this.field1103 - var23 - var21);
                int var41 = var40.getWidth(null);
                Graphics var42 = var40.getGraphics();
                for (int var43 = 0; var43 < var41; var43 += var26) {
                    var42.drawImage(this.field1093, var43, 0, null);
                }
                var29.drawImage(var40, var32, var23, null);
            }
            var7.drawImage(this.field1112, var17 + var27, var28, null);
            var7.setFont(this.field1115);
            var7.setColor(this.field1098);
            var7.drawString(var6, var27 + ((this.field1123 - this.field1118.stringWidth(var6)) / 2), this.field1103 / 2 + this.field1096 + 4 + var28);
            var4.drawImage(class594.field7548, 0, 0, null);
        } catch (Exception var45) {
            this.field1100 = true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/Object;", line = 498)
    private final Object method490(Class arg0, String arg1, boolean arg2) throws IllegalAccessException, NoSuchFieldException {
        if (!arg2) {
            method488(true);
        }
        field1088++;
        Field var4 = arg0.getDeclaredField(arg1);
        Object var5 = var4.get(class80.field1134);
        var4.set(class80.field1134, null);
        return var5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z", line = 519)
    private final boolean method491(byte arg0, Class arg1, String arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 != -6) {
            method482();
        }
        field1125++;
        Field var5 = arg1.getDeclaredField(arg2);
        return var5.getBoolean(arg3);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I", line = 535)
    public final int method492(int arg0) {
        field1113++;
        int var2 = -91 / ((-arg0 - 88) / 33);
        return 0;
    }
}
