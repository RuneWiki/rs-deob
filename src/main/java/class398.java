import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class398 extends class686 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!afa", name = "w", descriptor = "Lfca;")
    private class661 field5254 = new class661();

    @OriginalMember(owner = "client!afa", name = "J", descriptor = "Lfca;")
    private class661 field5266 = new class661();

    @OriginalMember(owner = "client!afa", name = "P", descriptor = "Z")
    private boolean field5272;

    @OriginalMember(owner = "client!afa", name = "x", descriptor = "I")
    public static int field5255 = 1;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public static int field5240 = 503;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!afa", name = "q", descriptor = "I")
    private int field5248;

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "I")
    private int field5249;

    @OriginalMember(owner = "client!afa", name = "s", descriptor = "I")
    private int field5250;

    @OriginalMember(owner = "client!afa", name = "t", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!afa", name = "u", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!afa", name = "v", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!afa", name = "y", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!afa", name = "A", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!afa", name = "B", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!afa", name = "C", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!afa", name = "D", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!afa", name = "E", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!afa", name = "F", descriptor = "I")
    private int field5263;

    @OriginalMember(owner = "client!afa", name = "H", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!afa", name = "I", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!afa", name = "K", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!afa", name = "L", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!afa", name = "M", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!afa", name = "N", descriptor = "I")
    private int field5270;

    @OriginalMember(owner = "client!afa", name = "O", descriptor = "I")
    private int field5271;

    @OriginalMember(owner = "client!afa", name = "S", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!afa", name = "T", descriptor = "Lha;")
    public static class570 field5275;

    @OriginalMember(owner = "client!afa", name = "Q", descriptor = "Ljava/awt/Component;")
    private Component field5273;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "[I")
    public static int[] field5247;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public final void method217(int arg0) {
        this.method2304(true);
        field5244++;
        if (arg0 != 200) {
            this.method212(-29);
        }
    }

    @OriginalMember(owner = "client!afa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5239++;
        int var2 = this.method2300(arg0, (byte) 116);
        if ((var2 & this.field5263) == 0) {
            var2 = this.field5263;
        }
        if ((var2 & 0x1) != 0) {
            this.method2303(arg0.getClickCount(), arg0.getY(), arg0.getX(), (byte) -107, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method2303(arg0.getClickCount(), arg0.getY(), arg0.getX(), (byte) -116, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method2303(arg0.getClickCount(), arg0.getY(), arg0.getX(), (byte) -111, 4);
        }
        this.field5263 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZII)V")
    private final void method2298(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        field5269++;
        this.field5271 = arg1;
        this.field5270 = arg2;
        if (this.field5272) {
            this.method2303(0, arg1, arg2, (byte) -121, -1);
        }
    }

    @OriginalMember(owner = "client!afa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5264++;
        int var2 = this.method2300(arg0, (byte) 73);
        if (var2 == 1) {
            this.method2303(arg0.getClickCount(), arg0.getY(), arg0.getX(), (byte) -102, 0);
        } else if (var2 == 4) {
            this.method2303(arg0.getClickCount(), arg0.getY(), arg0.getX(), (byte) -107, 2);
        } else if (var2 == 2) {
            this.method2303(arg0.getClickCount(), arg0.getY(), arg0.getX(), (byte) -112, 1);
        }
        this.field5263 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "(I)I")
    public final int method208(int arg0) {
        field5253++;
        return arg0 > -20 ? 47 : this.field5250;
    }

    @OriginalMember(owner = "client!afa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2298(false, arg0.getY(), arg0.getX());
        field5265++;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lkl;)V")
    public static final void method2299(class739 arg0) {
        if (class451.field5892 >= 65535) {
            return;
        }
        class757 var1 = arg0.field10006;
        class491.field6306[class451.field5892] = arg0;
        class620.field7851[class451.field5892] = false;
        class451.field5892++;
        int var2 = arg0.field10005;
        if (arg0.field10010) {
            var2 = 0;
        }
        int var3 = arg0.field10005;
        if (arg0.field10003) {
            var3 = class78.field1121 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method4123(22290) + class686.field8834 - var1.method4122(43) >> class88.field1221;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method4123(22290) + var1.method4122(-123) - class686.field8834 >> class88.field1221;
            if (var7 >= class559.field7102) {
                var7 = class559.field7102 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field9997[var5++];
                int var10 = (var1.method4121((byte) -124) + class686.field8834 - var1.method4122(81) >> class88.field1221) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class330.field4039) {
                    var11 = class330.field4039 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class412.field5464[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class412.field5464[var4][var12][var8] = var13 | (long) class451.field5892;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class412.field5464[var4][var12][var8] = var13 | (long) class451.field5892 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class412.field5464[var4][var12][var8] = var13 | (long) class451.field5892 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class412.field5464[var4][var12][var8] = var13 | (long) class451.field5892 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)I")
    public final int method210(int arg0) {
        field5258++;
        if (arg0 != 0) {
            this.mouseMoved(null);
        }
        return this.field5248;
    }

    @OriginalMember(owner = "client!afa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2298(false, arg0.getY(), arg0.getX());
        field5251++;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
    private final int method2300(MouseEvent arg0, byte arg1) {
        field5246++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else {
            int var7 = -42 / ((arg1 + 18) / 56);
            if (var5) {
                return 2;
            } else if (var6) {
                return 4;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2298(false, arg0.getY(), arg0.getX());
        field5259++;
    }

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "(I)Z")
    public final boolean method213(int arg0) {
        field5267++;
        if (arg0 == 1) {
            return (this.field5249 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)Z")
    public final boolean method214(int arg0) {
        field5268++;
        if (arg0 == 1929) {
            return (this.field5249 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "(I)V")
    public static final void method2301(int arg0) {
        field5257++;
        client var1 = class102.field1382;
        synchronized (class102.field1382) {
            if (class9.field80 == null) {
                int var2 = 26 / ((arg0 + 60) / 49);
                Container var3;
                if (class340.field4176 != null) {
                    var3 = class340.field4176;
                } else if (class80.field1134 == null) {
                    var3 = class29.field265;
                } else {
                    var3 = class80.field1134;
                }
                class773.field10518 = var3.getSize().width;
                class310.field3886 = var3.getSize().height;
                if (class340.field4176 == var3) {
                    Insets var4 = class340.field4176.getInsets();
                    class773.field10518 -= var4.right + var4.left;
                    class310.field3886 -= var4.top + var4.bottom;
                }
                if (class400.method2313((byte) -101) == 1) {
                    class257.field3477 = 0;
                    class483.field6237 = (class773.field10518 - class719.field9443) / 2;
                    class372.field4550 = class719.field9443;
                    class463.field6021 = field5240;
                } else {
                    class757.method4125((byte) 28);
                }
                if (class611.field7718 != class290.field3701) {
                    boolean var10000;
                    if (class372.field4550 < 1024 && class463.field6021 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class678.field8763.setSize(class372.field4550, class463.field6021);
                if (class576.field7320 != null) {
                    if (class602.field7657) {
                        class249.method1622(class678.field8763, false);
                    } else {
                        class576.field7320.method881(class678.field8763, class372.field4550, class463.field6021);
                    }
                }
                if (class340.field4176 == var3) {
                    Insets var5 = class340.field4176.getInsets();
                    class678.field8763.setLocation(var5.left + class483.field6237, class257.field3477 + var5.top);
                } else {
                    class678.field8763.setLocation(class483.field6237, class257.field3477);
                }
                if (client.field6070 != -1) {
                    class575.method3093(true, (byte) 116);
                }
                class90.method544((byte) -89);
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5243++;
    }

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "(I)V")
    public static void method2302(int arg0) {
        field5275 = null;
        if (arg0 <= 24) {
            field5240 = 20;
        }
        field5247 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIBI)V")
    private final void method2303(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5260++;
        class268 var6 = new class268();
        if (arg3 >= -94) {
            return;
        }
        var6.field3540 = arg2;
        var6.field3548 = arg0;
        var6.field3549 = arg1;
        var6.field3546 = arg4;
        var6.field3541 = class502.method2786(-7114);
        this.field5266.method3593(var6, 15);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)Lvt;")
    public final class793 method219(byte arg0) {
        field5252++;
        int var2 = 36 / ((arg0 - 15) / 61);
        return (class793) this.field5254.method3599(-116);
    }

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "(I)Z")
    public final boolean method212(int arg0) {
        field5274++;
        if (arg0 != 1) {
            field5247 = null;
        }
        return (this.field5249 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)V")
    private final void method2304(boolean arg0) {
        field5241++;
        if (this.field5273 == null) {
            return;
        }
        this.field5273.removeMouseMotionListener(this);
        this.field5273.removeMouseListener(this);
        if (!arg0) {
            field5275 = null;
        }
        this.field5273 = null;
        this.field5266 = null;
        this.field5254 = null;
        this.field5248 = this.field5250 = this.field5249 = 0;
        this.field5270 = this.field5271 = this.field5263 = 0;
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)V")
    public final synchronized void method211(byte arg0) {
        this.field5250 = this.field5271;
        this.field5248 = this.field5270;
        field5261++;
        this.field5249 = this.field5263;
        class661 var2 = this.field5254;
        this.field5254 = this.field5266;
        this.field5266 = var2;
        if (arg0 != -94) {
            this.field5272 = true;
        }
        this.field5266.method3594(arg0 + 12);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method2305(Component arg0, byte arg1) {
        field5242++;
        this.method2304(true);
        this.field5273 = arg0;
        this.field5273.addMouseListener(this);
        this.field5273.addMouseMotionListener(this);
        if (arg1 > -27) {
            this.method210(76);
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class398(Component arg0, boolean arg1) {
        this.method2305(arg0, (byte) -80);
        this.field5272 = arg1;
    }

    @OriginalMember(owner = "client!afa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2298(false, arg0.getY(), arg0.getX());
        field5245++;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZB)Lnt;")
    public static final class148 method2306(int arg0, boolean arg1, byte arg2) {
        if (arg2 != 41) {
            method2306(88, true, (byte) -39);
        }
        field5256++;
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
        return (class148) class85.field1197.method2616(var3, (byte) 75);
    }
}
