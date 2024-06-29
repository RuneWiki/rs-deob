import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class697 implements class201 {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lgw;")
    public static class690 field9697 = new class690(4);

    @OriginalMember(owner = "client!v", name = "R", descriptor = "J")
    public static long field9735 = 0L;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Lmaa;")
    public static class508 field9733 = new class508(7, 7);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lkr;")
    public static class602 field9737 = new class602(67, 6);

    @OriginalMember(owner = "client!v", name = "V", descriptor = "Z")
    public static boolean field9739 = true;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "Lkr;")
    public static class602 field9740 = new class602(4, 3);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    private int field9694;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    private int field9699;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    private int field9701;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    private int field9711;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    private int field9716;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    private int field9717;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    private int field9722;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    private int field9726;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    private int field9730;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/awt/Color;")
    private Color field9702;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Ljava/awt/Font;")
    private Font field9710;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field9734;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Ljava/awt/Image;")
    private Image field9695;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Ljava/awt/Image;")
    private Image field9696;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field9698;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Ljava/awt/Image;")
    private Image field9703;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field9713;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field9714;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field9719;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field9723;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field9727;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Ljava/awt/Image;")
    private Image field9738;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Z")
    private boolean field9715;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Z")
    private boolean field9720;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Z")
    private boolean field9725;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I", line = 3)
    public final int method1226(int arg0) {
        field9705++;
        return arg0 > -118 ? -109 : 100;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 17)
    public final void method1224(int arg0) {
        if (arg0 != -19040) {
            field9742 = -123;
        }
        field9700++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILmfa;I)V", line = 33)
    public static final void method3930(int arg0, class409 arg1, int arg2) {
        field9708++;
        boolean var3 = arg1.method2560(-39, 1) == 1;
        if (var3) {
            class248.field3651[class385.field5530++] = arg0;
        }
        int var4 = arg1.method2560(arg2 - 139, 2);
        class96 var5 = class251.field3675[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field1354 = false;
            } else if (class145.field2037 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class721 var6 = class20.field198[arg0] = new class721();
                var6.field10027 = (var5.field7197[0] + class113.field1509 >> 6 << 14) + (var5.field4408 << 28) + (var5.field7198[0] + class587.field7995 >> 6);
                if (var5.field1326 == -1) {
                    var6.field10033 = var5.field7125.method168(false);
                } else {
                    var6.field10033 = var5.field1326;
                }
                var6.field10032 = var5.field7122;
                var6.field10034 = var5.field1351;
                if (var5.field1367 > 0) {
                    class715.method4014(var5, false);
                }
                class251.field3675[arg0] = null;
                if (arg1.method2560(-75, 1) != 0) {
                    class525.method3120(arg1, arg0, arg2 ^ 0x1F);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method2560(-110, 3);
            int var8 = var5.field7197[0];
            int var9 = var5.field7198[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field1362 = var8;
                var5.field1320 = var9;
                var5.field1354 = true;
            } else {
                var5.method652((byte) -90, var8, class346.field4924[arg0], var9);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method2560(-95, 4);
            int var11 = var5.field7197[0];
            int var12 = var5.field7198[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field1320 = var12;
                var5.field1362 = var11;
                var5.field1354 = true;
            } else {
                var5.method652((byte) -90, var11, class346.field4924[arg0], var12);
            }
        } else {
            int var13 = arg1.method2560(-77, 1);
            if (var13 == 0) {
                int var14 = arg1.method2560(-59, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field7197[0] + var16;
                int var19 = var5.field7198[0] + var17;
                if (var3) {
                    var5.field1320 = var19;
                    var5.field1362 = var18;
                    var5.field1354 = true;
                } else {
                    var5.method652((byte) -90, var18, class346.field4924[arg0], var19);
                }
                var5.field4408 = var5.field4419 = (byte) (var5.field4408 + var15 & 0x3);
                if (class479.method2918(var19, true, var18)) {
                    var5.field4419++;
                }
                if (class145.field2037 == arg0) {
                    if (class96.field1331 != var5.field4408) {
                        class569.field7870 = true;
                    }
                    class96.field1331 = var5.field4408;
                }
            } else {
                int var20 = arg1.method2560(arg2 - 125, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFD0CA) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field7197[0] + var22 + class113.field1509 & 0x3FFF) - class113.field1509;
                int var25 = (class587.field7995 + var23 + var5.field7198[0] & 0x3FFF) - class587.field7995;
                if (var3) {
                    var5.field1362 = var24;
                    var5.field1354 = true;
                    var5.field1320 = var25;
                } else {
                    var5.method652((byte) -90, var24, class346.field4924[arg0], var25);
                }
                var5.field4408 = var5.field4419 = (byte) (var5.field4408 + var21 & 0x3);
                if (class479.method2918(var25, true, var24)) {
                    var5.field4419++;
                }
                if (arg2 != 31) {
                    method3932((byte) -51);
                }
                if (class145.field2037 == arg0) {
                    class96.field1331 = var5.field4408;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I", line = 368)
    private final int method3931(int arg0, int arg1) {
        if (arg1 != 15) {
            this.method1221(false, (byte) 121);
        }
        field9731++;
        return this.field9725 ? (class118.field1561 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 386)
    public static void method3932(byte arg0) {
        field9733 = null;
        if (arg0 != -38) {
            field9742 = 12;
        }
        field9740 = null;
        field9737 = null;
        field9697 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ldc;I)Ljava/lang/String;", line = 404)
    public static final String method3933(class63 arg0, int arg1) {
        if (arg1 != 268423370) {
            field9733 = null;
        }
        field9709++;
        return class481.method2931(32767, arg0, -127);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)I", line = 417)
    private final int method3934(int arg0, byte arg1) {
        field9736++;
        if (arg1 != -51) {
            this.field9730 = 58;
        }
        return this.field9720 ? (class553.field7716 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Object;)Z", line = 432)
    private final boolean method3935(String arg0, int arg1, Class arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg1 != 6) {
            field9733 = null;
        }
        field9706++;
        Field var5 = arg2.getDeclaredField(arg0);
        return var5.getBoolean(arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)Z", line = 448)
    public final boolean method1222(long arg0, int arg1) {
        field9721++;
        return arg1 == -30471;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V", line = 459)
    private final void method3936(int arg0) {
        if (arg0 != -1349176836) {
            this.method3931(-49, 81);
        }
        class341.method2168(class155.field2184.method2775(0), class155.field2184.method2777(20), class315.field4357[class534.field7413], class477.field6638[class534.field7413], (byte) -90, class506.field7033[class534.field7413]);
        field9718++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)I", line = 471)
    public final int method1223(boolean arg0) {
        field9728++;
        if (arg0) {
            this.method3931(-66, 68);
        }
        return 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZB)V", line = 482)
    public final void method1221(boolean arg0, byte arg1) {
        field9729++;
        if (!this.field9715) {
            if (class320.field4445 == null) {
                this.field9715 = true;
            } else if (this.field9710 == null) {
                try {
                    this.method3940((byte) 50);
                } catch (Exception var43) {
                    this.field9715 = true;
                }
            }
        }
        if (this.field9715) {
            this.method3936(-1349176836);
            return;
        }
        Graphics var3 = class570.field7875.getGraphics();
        if (arg1 != 27) {
            return;
        }
        if (var3 == null) {
            class570.field7875.repaint();
            return;
        }
        try {
            int var4 = class155.field2184.method2777(20);
            String var5 = class155.field2184.method2775(arg1 - 27);
            if (class90.field1261 == null) {
                class90.field1261 = class570.field7875.createImage(class118.field1561, class553.field7716);
            }
            Graphics var6 = class90.field1261.getGraphics();
            var6.clearRect(0, 0, class118.field1561, class553.field7716);
            int var7 = this.field9719.getWidth(null);
            int var8 = this.field9696.getWidth(null);
            int var9 = this.field9727.getWidth(null);
            int var10 = this.field9719.getHeight(null);
            int var11 = this.field9696.getHeight(null);
            int var12 = this.field9727.getHeight(null);
            var6.drawImage(this.field9719, this.method3931(var7, arg1 ^ 0x14) - ((this.field9694 / 2) - this.field9716), this.method3934(var10, (byte) -51) + this.field9701, null);
            int var13 = this.field9716 + var7 - this.field9694 / 2;
            int var14 = this.field9694 / 2 + this.field9716;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field9727, this.method3931(var7, arg1 - 12) + this.field9716 + var15, this.method3934(var12, (byte) -51) - -this.field9701, null);
            }
            var6.drawImage(this.field9696, this.method3931(var8, 15) + this.field9694 / 2 + this.field9716, this.method3934(var11, (byte) -51) - -this.field9701, null);
            int var16 = this.field9698.getWidth(null);
            int var17 = this.field9698.getHeight(null);
            int var18 = this.field9695.getWidth(null);
            int var19 = this.field9695.getHeight(null);
            int var20 = this.field9703.getHeight(null);
            int var21 = this.field9714.getWidth(null);
            int var22 = this.field9714.getHeight(null);
            int var23 = this.field9703.getWidth(null);
            int var24 = this.field9738.getWidth(null);
            int var25 = this.field9713.getWidth(null);
            int var26 = this.method3931(this.field9730, 15) + this.field9699;
            int var27 = this.method3934(this.field9722, (byte) -51) + this.field9711;
            var6.drawImage(this.field9698, var26, (this.field9722 - var17) / 2 + var27, null);
            var6.drawImage(this.field9695, var26 + this.field9730 - var18, (-var19 + this.field9722) / 2 + var27, null);
            if (this.field9723 == null) {
                this.field9723 = class570.field7875.createImage(this.field9730 - var16 - var18, this.field9722);
            }
            Graphics var28 = this.field9723.getGraphics();
            for (int var29 = 0; var29 < this.field9730 - var16 - var18; var29 += var21) {
                var28.drawImage(this.field9714, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field9730 - var16 - var18); var30 += var23) {
                var28.drawImage(this.field9703, var30, this.field9722 - var20, null);
            }
            int var31 = (this.field9730 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class570.field7875.createImage(var31, this.field9722 - var20 - var22);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field9726 * class63.method450(false) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field9738, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field9730 - var18 - var16 - var31;
            if (var38 > 0) {
                Image var39 = class570.field7875.createImage(var38, this.field9722 - var20 - var22);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field9713, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field9723, var16 + var26, var27, null);
            var6.setFont(this.field9710);
            var6.setColor(this.field9702);
            var6.drawString(var5, (this.field9730 - this.field9734.stringWidth(var5)) / 2 + var26, this.field9722 / 2 + this.field9717 + 4 + var27);
            var3.drawImage(class90.field1261, 0, 0, null);
        } catch (Exception var44) {
            this.field9715 = true;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IC)Z", line = 679)
    public static final boolean method3937(int arg0, char arg1) {
        field9704++;
        if (arg0 == 31304) {
            return arg1 >= '0' && arg1 <= '9';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)I", line = 692)
    private final int method3938(byte arg0, Object arg1, String arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
        field9732++;
        if (arg0 < 45) {
            this.field9696 = null;
        }
        Field var5 = arg3.getDeclaredField(arg2);
        return var5.getInt(arg1);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 709)
    public final void method1225(int arg0) {
        class498.method3015(arg0 ^ 0xFFFFC9EB);
        if (arg0 != 13941) {
            method3933(null, 91);
        }
        field9707++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", line = 721)
    private final Object method3939(byte arg0, Class arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        field9724++;
        int var4 = 71 % ((-arg0 - 60) / 60);
        Field var5 = arg1.getDeclaredField(arg2);
        Object var6 = var5.get(class320.field4445);
        var5.set(class320.field4445, null);
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 741)
    private final void method3940(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field9712++;
        Class var2 = class320.field4445.getClass();
        this.field9738 = (Image) this.method3939((byte) 127, var2, "bar");
        this.field9713 = (Image) this.method3939((byte) 78, var2, "background");
        this.field9698 = (Image) this.method3939((byte) -120, var2, "left");
        this.field9695 = (Image) this.method3939((byte) -121, var2, "right");
        this.field9714 = (Image) this.method3939((byte) 62, var2, "top");
        this.field9703 = (Image) this.method3939((byte) 36, var2, "bottom");
        this.field9719 = (Image) this.method3939((byte) -125, var2, "bodyLeft");
        this.field9696 = (Image) this.method3939((byte) 94, var2, "bodyRight");
        this.field9727 = (Image) this.method3939((byte) 52, var2, "bodyFill");
        this.field9710 = (Font) this.method3939((byte) 103, var2, "bf");
        this.field9734 = (FontMetrics) this.method3939((byte) -124, var2, "bfm");
        this.field9702 = (Color) this.method3939((byte) -124, var2, "colourtext");
        Object var3 = this.method3939((byte) -125, var2, "lb");
        Class var4 = var3.getClass();
        this.field9725 = this.method3935("xMiddle", 6, var4, var3);
        this.field9720 = this.method3935("yMiddle", 6, var4, var3);
        this.field9699 = this.method3938((byte) 121, var3, "xOffset", var4);
        this.field9711 = this.method3938((byte) 116, var3, "yOffset", var4);
        this.field9730 = this.method3938((byte) 116, var3, "width", var4);
        this.field9722 = this.method3938((byte) 117, var3, "height", var4);
        this.field9716 = this.method3938((byte) 84, var3, "boxXOffset", var4);
        this.field9701 = this.method3938((byte) 89, var3, "boxYOffset", var4);
        if (arg0 < 32) {
            method3937(88, '\u0017');
        }
        this.field9694 = this.method3938((byte) 56, var3, "boxWidth", var4);
        this.field9717 = this.method3938((byte) 99, var3, "textYOffset", var4);
        this.field9726 = this.method3938((byte) 76, var3, "offsetPerTenCycles", var4);
    }
}
