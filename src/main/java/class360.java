import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class360 extends class791 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!hka", name = "F", descriptor = "Ltf;")
    private class524 field5251 = new class524();

    @OriginalMember(owner = "client!hka", name = "L", descriptor = "Ltf;")
    private class524 field5257 = new class524();

    @OriginalMember(owner = "client!hka", name = "r", descriptor = "Z")
    private boolean field5260;

    @OriginalMember(owner = "client!hka", name = "S", descriptor = "[Ljava/lang/String;")
    private static final String[] field5261 = new String[] { method2890(method2889("#s\u0002JJc")), method2890(method2889("#s\u0002JKc")), method2890(method2889("%m\u000f\b")), method2890(method2889("06MJt")), method2890(method2889("#s\u0002JBc")), method2890(method2889("#s\u0002Jd$m\u0010\u0001M9y\u0004\u0003l/0")), method2890(method2889("#s\u0002JLc")), method2890(method2889("#s\u0002JCc")), method2890(method2889("#s\u0002JGc")), method2890(method2889("#s\u0002JNc")), method2890(method2889("#s\u0002Jd$m\u0010\u0001[.t\u0006\u0005z.|K")), method2890(method2889("#s\u0002Jd$m\u0010\u0001D$n\u0006\u0000!")), method2890(method2889("#s\u0002JDc")), method2890(method2889("#s\u0002Jd$m\u0010\u0001L3q\u0017\u0001mc")), method2890(method2889("#s\u0002JMc")), method2890(method2889("#s\u0002JYc")), method2890(method2889("#s\u0002Jd$m\u0010\u0001J'q\u0000\u000fl/0")), method2890(method2889("#s\u0002Jd$m\u0010\u0001Y9}\u0010\u0017l/0")), method2890(method2889("#s\u0002JOc")), method2890(method2889("#s\u0002Jd$m\u0010\u0001L%l\u0006\u0016l/0")), method2890(method2889("#s\u0002JFc")), method2890(method2889("#s\u0002J5\"v\n\u00107c")), method2890(method2889("#s\u0002JAc")), method2890(method2889("#s\u0002JEc")), method2890(method2889("#s\u0002JHc")), method2890(method2889("#s\u0002J@c")) };

    @OriginalMember(owner = "client!hka", name = "C", descriptor = "Lmv;")
    public static class125 field5228 = new class125(82, 7);

    @OriginalMember(owner = "client!hka", name = "y", descriptor = "I")
    public static int field5241 = 0;

    @OriginalMember(owner = "client!hka", name = "H", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!hka", name = "M", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!hka", name = "q", descriptor = "I")
    private int field5229;

    @OriginalMember(owner = "client!hka", name = "A", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!hka", name = "u", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!hka", name = "p", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!hka", name = "j", descriptor = "I")
    private int field5234;

    @OriginalMember(owner = "client!hka", name = "E", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!hka", name = "R", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!hka", name = "x", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!hka", name = "w", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!hka", name = "t", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!hka", name = "J", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!hka", name = "o", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!hka", name = "K", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!hka", name = "m", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!hka", name = "O", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!hka", name = "P", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!hka", name = "k", descriptor = "I")
    private int field5248;

    @OriginalMember(owner = "client!hka", name = "I", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!hka", name = "n", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!hka", name = "N", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!hka", name = "G", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!hka", name = "D", descriptor = "I")
    private int field5254;

    @OriginalMember(owner = "client!hka", name = "v", descriptor = "I")
    private int field5255;

    @OriginalMember(owner = "client!hka", name = "s", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!hka", name = "Q", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!hka", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field5259;

    @OriginalMember(owner = "client!hka", name = "l", descriptor = "[I")
    public static int[] field5233;

    @OriginalMember(owner = "client!hka", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        try {
            field5230++;
            this.method2878(arg0.getY(), arg0.getX(), false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[13] + (arg0 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        try {
            field5243++;
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[16] + (arg0 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IIII)V")
    public static final void method2873(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 >= -88) {
                field5233 = null;
            }
            field5237++;
            int var6 = arg1 * class451.field6612.field9094.method2498(3) >> 8;
            if (arg3 == -1 && !class399.field5812) {
                class169.method1421(true);
            } else if (arg3 != -1 && (class291.field4106 != arg3 || !class628.method4611(121)) && var6 != 0 && !class399.field5812) {
                class288.method2338(var6, arg3, class379.field5540, arg2, false, 0, 12);
                class486.method3746((byte) -121);
            }
            if (class291.field4106 != arg3) {
                class732.field10452 = null;
            }
            class291.field4106 = arg3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5261[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "d", descriptor = "(I)Z")
    public final boolean method2874(int arg0) {
        try {
            field5231++;
            if (arg0 != -756041375) {
                this.field5257 = null;
            }
            return (this.field5234 & 0x2) != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Ljava/lang/String;IIILha;IBI)V")
    public static final void method2875(String arg0, int arg1, int arg2, int arg3, class18 arg4, int arg5, byte arg6, int arg7) {
        try {
            if (class137.field1766 == null || class608.field8719 == null) {
                if (class524.field7640.method530(false, class287.field4065) && class524.field7640.method530(false, class234.field3379)) {
                    class137.field1766 = arg4.method231(class66.method704(class524.field7640, class287.field4065, 0), true);
                    class66 var8 = class66.method704(class524.field7640, class234.field3379, 0);
                    class608.field8719 = arg4.method231(var8, true);
                    var8.method695();
                    class602.field8638 = arg4.method231(var8, true);
                } else {
                    arg4.method237(arg5, arg2, arg1, arg3, 255 - class485.field7122 << 24 | class37.field516, 1);
                }
            }
            field5226++;
            if (class137.field1766 != null && class608.field8719 != null) {
                int var9 = (arg1 - (class608.field8719.method1376() * 2)) / class137.field1766.method1376();
                for (int var10 = 0; var10 < var9; var10++) {
                    class137.field1766.method3074(arg5 + class608.field8719.method1376() + class137.field1766.method1376() * var10, arg2);
                }
                class608.field8719.method3074(arg5, arg2);
                class602.field8638.method3074(arg5 + arg1 - class602.field8638.method1376(), arg2);
            }
            class200.field2954.method1828(arg2 + 14, arg0, true, -1, arg5 + 3, class581.field8396 | 0xFF000000);
            if (arg6 == -35) {
                arg4.method237(arg5, arg2 + arg3, arg1, arg7 - arg3, 255 - class485.field7122 << 24 | class37.field516, 1);
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field5261[7] + (arg0 == null ? field5261[2] : field5261[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field5261[2] : field5261[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "e", descriptor = "(B)V")
    private final void method2876(byte arg0) {
        try {
            field5236++;
            if (this.field5259 != null) {
                this.field5259.removeMouseMotionListener(this);
                if (arg0 == -5) {
                    this.field5259.removeMouseListener(this);
                    this.field5257 = null;
                    this.field5256 = this.field5254 = this.field5255 = 0;
                    this.field5248 = this.field5229 = this.field5234 = 0;
                    this.field5259 = null;
                    this.field5251 = null;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "(B)V")
    public final synchronized void method2877(byte arg0) {
        try {
            field5240++;
            this.field5234 = this.field5255;
            this.field5229 = this.field5254;
            this.field5248 = this.field5256;
            class524 var2 = this.field5251;
            this.field5251 = this.field5257;
            this.field5257 = var2;
            if (arg0 != -35) {
                this.method2879(11);
            }
            this.field5257.method3982(-122);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5261[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IIZ)V")
    private final void method2878(int arg0, int arg1, boolean arg2) {
        try {
            this.field5254 = arg0;
            this.field5256 = arg1;
            if (arg2) {
                this.mouseReleased(null);
            }
            field5252++;
            if (this.field5260) {
                this.method2883(arg0, -1, (byte) 96, arg1, 0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5261[22] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "(I)I")
    public final int method2879(int arg0) {
        try {
            field5242++;
            if (arg0 != -237) {
                this.field5259 = null;
            }
            return this.field5229;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        try {
            field5246++;
            int var2 = this.method2884(4, arg0);
            if ((var2 & this.field5255) == 0) {
                var2 = this.field5255;
            }
            if ((var2 & 0x1) != 0) {
                this.method2883(arg0.getY(), 3, (byte) 75, arg0.getX(), arg0.getClickCount());
            }
            if ((var2 & 0x4) != 0) {
                this.method2883(arg0.getY(), 5, (byte) 102, arg0.getX(), arg0.getClickCount());
            }
            if ((var2 & 0x2) != 0) {
                this.method2883(arg0.getY(), 4, (byte) 102, arg0.getX(), arg0.getClickCount());
            }
            this.field5255 &= ~var2;
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5261[10] + (arg0 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2880(byte arg0, Component arg1) {
        try {
            if (arg0 < 117) {
                method2885((byte) 47);
            }
            this.method2876((byte) -5);
            field5245++;
            this.field5259 = arg1;
            this.field5259.addMouseListener(this);
            this.field5259.addMouseMotionListener(this);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5261[1] + arg0 + ',' + (arg1 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)I")
    public final int method2881(byte arg0) {
        try {
            field5235++;
            return arg0 == 121 ? this.field5248 : -92;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        try {
            this.method2878(arg0.getY(), arg0.getX(), false);
            field5244++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[11] + (arg0 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)Z")
    public final boolean method2882(boolean arg0) {
        try {
            if (arg0) {
                this.method2878(10, 67, false);
            }
            field5232++;
            return (this.field5234 & 0x1) != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IIBII)V")
    private final void method2883(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            field5238++;
            class390 var6 = new class390();
            var6.field5685 = arg4;
            if (arg2 <= 57) {
                this.field5234 = -24;
            }
            var6.field5681 = arg0;
            var6.field5683 = arg1;
            var6.field5679 = arg3;
            var6.field5680 = class614.method4531(-126);
            this.field5257.method3984(var6, 0);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5261[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2884(int arg0, MouseEvent arg1) {
        try {
            field5250++;
            int var3 = arg1.getModifiers();
            boolean var4 = (var3 & 0x10) != 0;
            boolean var5 = (var3 & 0x8) != 0;
            boolean var6 = (var3 & arg0) != 0;
            if (var5 && (var4 || var6)) {
                var5 = false;
            }
            if (var4 && var6) {
                return 4;
            } else if (var4) {
                return 1;
            } else if (var5) {
                return 2;
            } else if (var6) {
                return 4;
            } else {
                return 0;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5261[23] + arg0 + ',' + (arg1 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "d", descriptor = "(B)V")
    public static void method2885(byte arg0) {
        try {
            if (arg0 != -16) {
                method2885((byte) -52);
            }
            field5233 = null;
            field5228 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5261[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        try {
            field5247++;
            int var2 = this.method2884(4, arg0);
            if (var2 == 1) {
                this.method2883(arg0.getY(), 0, (byte) 74, arg0.getX(), arg0.getClickCount());
            } else if (var2 == 4) {
                this.method2883(arg0.getY(), 2, (byte) 114, arg0.getX(), arg0.getClickCount());
            } else if (var2 == 2) {
                this.method2883(arg0.getY(), 1, (byte) 66, arg0.getX(), arg0.getClickCount());
            }
            this.field5255 |= var2;
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5261[17] + (arg0 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "f", descriptor = "(I)Z")
    public final boolean method2886(int arg0) {
        try {
            field5227++;
            if (arg0 < 80) {
                field5228 = null;
            }
            return (this.field5234 & 0x4) != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        try {
            this.method2878(arg0.getY(), arg0.getX(), false);
            field5249++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[5] + (arg0 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)Lvha;")
    public final class682 method2887(int arg0) {
        try {
            if (arg0 == 210) {
                field5258++;
                return (class682) this.field5251.method3980(-27119);
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        try {
            field5239++;
            this.method2878(arg0.getY(), arg0.getX(), false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[19] + (arg0 == null ? field5261[2] : field5261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "(B)V")
    public final void method2888(byte arg0) {
        try {
            field5253++;
            if (arg0 > 79) {
                this.method2876((byte) -5);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5261[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class360(Component arg0, boolean arg1) {
        try {
            this.method2880((byte) 118, arg0);
            this.field5260 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5261[21] + (arg0 == null ? field5261[2] : field5261[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2889(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2890(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
