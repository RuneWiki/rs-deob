import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class503 implements class200 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Leda;")
    public static class116 field7457 = new class116(33, -1);

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    private int field7464;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    private int field7469;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    private int field7472;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    private int field7477;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
    private int field7479;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "I")
    private int field7485;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
    private int field7486;

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
    private int field7487;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
    private int field7492;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "Ljava/awt/Color;")
    private Color field7495;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "Ljava/awt/Font;")
    private Font field7474;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field7470;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "Ljava/awt/Image;")
    private Image field7458;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Ljava/awt/Image;")
    private Image field7459;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field7462;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field7463;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field7467;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field7468;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field7471;

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field7483;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field7491;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field7496;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "Z")
    private boolean field7465;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "Z")
    private boolean field7475;

    @OriginalMember(owner = "client!gu", name = "P", descriptor = "Z")
    private boolean field7498;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;ILjava/lang/String;)Z")
    private final boolean method3000(Object arg0, Class arg1, int arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field7476++;
        Field var5 = arg1.getDeclaredField(arg3);
        if (arg2 != -59679344) {
            this.method3004(42, 101);
        }
        return var5.getBoolean(arg0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
    public final int method1145(boolean arg0) {
        if (!arg0) {
            this.method3008(126, -5);
        }
        field7480++;
        return 0;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIII)I")
    public static final int method3001(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        if (arg3 != 6) {
            method3001(43, 30, 66, -74);
        }
        field7488++;
        return (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BZ)V")
    public final void method1138(byte arg0, boolean arg1) {
        field7482++;
        if (!this.field7475) {
            if (class492.field7063 == null) {
                this.field7475 = true;
            } else if (this.field7474 == null) {
                try {
                    this.method3006(-16546);
                } catch (Exception var44) {
                    this.field7475 = true;
                }
            }
        }
        int var3 = 2 / ((84 - arg0) / 34);
        if (this.field7475) {
            this.method3007(7);
            return;
        }
        Graphics var4 = class126.field2061.getGraphics();
        if (var4 == null) {
            class126.field2061.repaint();
            return;
        }
        try {
            int var5 = class406.field5827.method260(0);
            String var6 = class406.field5827.method255(100);
            if (class105.field1750 == null) {
                class105.field1750 = class126.field2061.createImage(class465.field6689, class597.field8633);
            }
            Graphics var7 = class105.field1750.getGraphics();
            int var8 = this.field7458.getWidth(null);
            int var9 = this.field7496.getWidth(null);
            int var10 = this.field7467.getWidth(null);
            int var11 = this.field7458.getHeight(null);
            int var12 = this.field7496.getHeight(null);
            int var13 = this.field7467.getHeight(null);
            var7.drawImage(this.field7458, this.method3008(124, var8) + this.field7486 - (this.field7472 / 2), this.method3004(var11, -24211) + this.field7485, null);
            int var14 = this.field7486 + var8 - (this.field7472 / 2);
            int var15 = this.field7486 + (this.field7472 / 2);
            for (int var16 = var14; var16 <= var15; var16 += var10) {
                var7.drawImage(this.field7467, this.method3008(65, var8) - (-this.field7486 - var16), this.method3004(var13, -24211) + this.field7485, null);
            }
            var7.drawImage(this.field7496, this.method3008(42, var9) + (this.field7486 + (this.field7472 / 2)), this.method3004(var12, -24211) - -this.field7485, null);
            int var17 = this.field7483.getWidth(null);
            int var18 = this.field7483.getHeight(null);
            int var19 = this.field7491.getWidth(null);
            int var20 = this.field7491.getHeight(null);
            int var21 = this.field7463.getHeight(null);
            int var22 = this.field7462.getWidth(null);
            int var23 = this.field7462.getHeight(null);
            int var24 = this.field7463.getWidth(null);
            int var25 = this.field7459.getWidth(null);
            int var26 = this.field7468.getWidth(null);
            int var27 = this.method3008(120, this.field7492) + this.field7477;
            int var28 = this.method3004(this.field7464, -24211) + this.field7479;
            var7.drawImage(this.field7483, var27, (this.field7464 - var18) / 2 + var28, null);
            var7.drawImage(this.field7491, this.field7492 + var27 - var19, var28 - -((-var20 + this.field7464) / 2), null);
            if (this.field7471 == null) {
                this.field7471 = class126.field2061.createImage(this.field7492 - var17 - var19, this.field7464);
            }
            Graphics var29 = this.field7471.getGraphics();
            for (int var30 = 0; var30 < (this.field7492 - var17 - var19); var30 += var22) {
                var29.drawImage(this.field7462, var30, 0, null);
            }
            for (int var31 = 0; var31 < (this.field7492 - var19 - var17); var31 += var24) {
                var29.drawImage(this.field7463, var31, this.field7464 - var21, null);
            }
            int var32 = (this.field7492 - var17 - var19) * var5 / 100;
            if (var32 > 0) {
                Image var33 = class126.field2061.createImage(var32, this.field7464 - (var21 + var23));
                int var34 = var33.getWidth(null);
                Graphics var35 = var33.getGraphics();
                int var36 = this.field7469 * class640.method3602(0) / 10 % var25;
                for (int var37 = var36 - var25; var37 < var34; var37 += var25) {
                    var35.drawImage(this.field7459, var37, 0, null);
                }
                var29.drawImage(var33, 0, var23, null);
            }
            int var39 = this.field7492 - var19 - (var17 - -var32);
            if (var39 > 0) {
                Image var40 = class126.field2061.createImage(var39, this.field7464 - var23 - var21);
                int var41 = var40.getWidth(null);
                Graphics var42 = var40.getGraphics();
                for (int var43 = 0; var43 < var41; var43 += var26) {
                    var42.drawImage(this.field7468, var43, 0, null);
                }
                var29.drawImage(var40, var32, var23, null);
            }
            var7.drawImage(this.field7471, var17 + var27, var28, null);
            var7.setFont(this.field7474);
            var7.setColor(this.field7495);
            var7.drawString(var6, var27 + (this.field7492 - this.field7470.stringWidth(var6)) / 2, this.field7464 / 2 + var28 + this.field7487 + 4);
            var4.drawImage(class105.field1750, 0, 0, null);
        } catch (Exception var45) {
            this.field7475 = true;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILsj;I)Z")
    public static final boolean method3002(int arg0, class373 arg1, int arg2) {
        field7466++;
        int var3 = arg1.method2231(2, -113);
        if (arg2 <= 45) {
            return false;
        } else if (var3 == 0) {
            if (arg1.method2231(1, -40) != 0) {
                method3002(arg0, arg1, 50);
            }
            int var4 = arg1.method2231(6, 115);
            int var5 = arg1.method2231(6, -54);
            boolean var6 = arg1.method2231(1, 109) == 1;
            if (var6) {
                class657.field9276[class3.field38++] = arg0;
            }
            if (class76.field1186[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class359 var7 = class340.field4725[arg0];
            class270 var8 = class76.field1186[arg0] = new class270();
            var8.field2427 = arg0;
            if (class565.field8277[arg0] != null) {
                var8.method1709((byte) -111, class565.field8277[arg0]);
            }
            var8.method1109(true, var7.field5006, (byte) 96);
            var8.field2434 = var7.field5007;
            int var9 = var7.field5010;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class143.field2474;
            int var14 = (var12 << 6) + var5 - class63.field917;
            var8.field3886 = var7.field5008;
            var8.field2457[0] = class569.field8317[arg0];
            var8.field3158 = var8.field3163 = (byte) var10;
            if (class151.method1151(var14, var13, (byte) -49)) {
                var8.field3163++;
            }
            var8.method1699(var13, false, var14);
            var8.field3887 = false;
            class340.field4725[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg1.method2231(2, -59);
            int var16 = class340.field4725[arg0].field5010;
            class340.field4725[arg0].field5010 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg1.method2231(5, 109);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class340.field4725[arg0].field5010;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FDE1F) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var23--;
                var22++;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class340.field4725[arg0].field5010 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg1.method2231(18, 83);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class340.field4725[arg0].field5010;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            class340.field4725[arg0].field5010 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public final void method1141(byte arg0) {
        if (arg0 >= 18) {
            field7481++;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)I")
    public final int method1143(int arg0) {
        if (arg0 != -12150) {
            this.field7483 = null;
        }
        field7493++;
        return 100;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;BLjava/lang/Class;)I")
    private final int method3003(String arg0, Object arg1, byte arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field7473++;
        if (arg2 != 49) {
            this.field7487 = 47;
        }
        Field var5 = arg3.getDeclaredField(arg0);
        return var5.getInt(arg1);
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
    public final void method1139(int arg0) {
        field7490++;
        class363.method2180(113);
        int var2 = -42 / ((-arg0 - 82) / 43);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I")
    private final int method3004(int arg0, int arg1) {
        if (arg1 != -24211) {
            this.method1141((byte) 17);
        }
        field7478++;
        return this.field7498 ? (class597.field8633 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
    private final Object method3005(int arg0, String arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 != 3) {
            this.field7462 = null;
        }
        field7461++;
        Field var4 = arg2.getDeclaredField(arg1);
        Object var5 = var4.get(class492.field7063);
        var4.set(class492.field7063, null);
        return var5;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
    private final void method3006(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field7460++;
        Class var2 = class492.field7063.getClass();
        this.field7459 = (Image) this.method3005(arg0 ^ 0xFFFFBF5D, "bar", var2);
        this.field7468 = (Image) this.method3005(3, "background", var2);
        this.field7483 = (Image) this.method3005(3, "left", var2);
        this.field7491 = (Image) this.method3005(3, "right", var2);
        if (arg0 != -16546) {
            return;
        }
        this.field7462 = (Image) this.method3005(3, "top", var2);
        this.field7463 = (Image) this.method3005(3, "bottom", var2);
        this.field7458 = (Image) this.method3005(3, "bodyLeft", var2);
        this.field7496 = (Image) this.method3005(3, "bodyRight", var2);
        this.field7467 = (Image) this.method3005(arg0 + 16549, "bodyFill", var2);
        this.field7474 = (Font) this.method3005(3, "bf", var2);
        this.field7470 = (FontMetrics) this.method3005(3, "bfm", var2);
        this.field7495 = (Color) this.method3005(3, "colourtext", var2);
        Object var3 = this.method3005(3, "lb", var2);
        Class var4 = var3.getClass();
        this.field7465 = this.method3000(var3, var4, -59679344, "xMiddle");
        this.field7498 = this.method3000(var3, var4, arg0 ^ 0x38EE2CE, "yMiddle");
        this.field7477 = this.method3003("xOffset", var3, (byte) 49, var4);
        this.field7479 = this.method3003("yOffset", var3, (byte) 49, var4);
        this.field7492 = this.method3003("width", var3, (byte) 49, var4);
        this.field7464 = this.method3003("height", var3, (byte) 49, var4);
        this.field7486 = this.method3003("boxXOffset", var3, (byte) 49, var4);
        this.field7485 = this.method3003("boxYOffset", var3, (byte) 49, var4);
        this.field7472 = this.method3003("boxWidth", var3, (byte) 49, var4);
        this.field7487 = this.method3003("textYOffset", var3, (byte) 49, var4);
        this.field7469 = this.method3003("offsetPerTenCycles", var3, (byte) 49, var4);
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
    private final void method3007(int arg0) {
        field7494++;
        if (arg0 != 7) {
            method3001(-9, 115, 103, 59);
        }
        class591.method3392(class82.field1258[class446.field6456], 30, class505.field7506[class446.field6456], class16.field254[class446.field6456], class406.field5827.method260(0), class406.field5827.method255(100));
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)I")
    private final int method3008(int arg0, int arg1) {
        if (arg0 <= 39) {
            this.field7463 = null;
        }
        field7489++;
        return this.field7465 ? (class465.field6689 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BILjava/net/Socket;)Lbj;")
    public static final class404 method3009(byte arg0, int arg1, Socket arg2) throws IOException {
        field7497++;
        if (arg0 >= -33) {
            field7457 = null;
        }
        return new class113(arg2, arg1);
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V")
    public static void method3010(boolean arg0) {
        if (arg0) {
            method3001(-121, -111, -75, -76);
        }
        field7457 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(JB)Z")
    public final boolean method1146(long arg0, byte arg1) {
        if (arg1 > -41) {
            return false;
        } else {
            field7484++;
            return true;
        }
    }
}
