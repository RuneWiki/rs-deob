import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class694 extends class720 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "Lat;")
    private class398 field10011 = new class398();

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "Lat;")
    private class398 field10023 = new class398();

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "Z")
    private boolean field10024;

    @OriginalMember(owner = "client!ica", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field10026 = new String[] { method5056(method5055("La \u0005]\r")), method5056(method5055("Kw-G")), method5056(method5055("La \u0005bJw2NKWc&LjA*")), method5056(method5055("^,o\u0005r")), method5056(method5055("La \u0005bJw2NJKv$YjA*")), method5056(method5055("La \u0005E\r")), method5056(method5055("La \u0005B\r")), method5056(method5055("La \u0005D\r")), method5056(method5055("La \u0005G\r")), method5056(method5055("La \u0005\\\r")), method5056(method5055("La \u0005F\r")), method5056(method5055("La \u0005^\r")), method5056(method5055("La \u0005C\r")), method5056(method5055("Bl1Dy\u0014")), method5056(method5055("La \u0005J\r")), method5056(method5055("La \u0005L\r")), method5056(method5055("La \u00053Ll(_1\r")), method5056(method5055("La \u0005A\r")), method5056(method5055("La \u0005I\r")), method5056(method5055("La \u0005bJw2NBJt$O'")), method5056(method5055("La \u0005bJw2NLIk\"@jA*")), method5056(method5055("La \u0005bJw2N_Wg2XjA*")), method5056(method5055("La \u0005_\r")), method5056(method5055("La \u0005K\r")), method5056(method5055("La \u0005bJw2N]@n$J|@fi")), method5056(method5055("La \u0005bJw2NJ]k5Nk\r")), method5056(method5055("La \u0005N\r")) };

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public static int field9991 = 1338;

    @OriginalMember(owner = "client!ica", name = "J", descriptor = "I")
    public static int field10009 = 0;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public static int field9998 = 0;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "F")
    public static float field10008;

    @OriginalMember(owner = "client!ica", name = "y", descriptor = "I")
    private int field10000;

    @OriginalMember(owner = "client!ica", name = "M", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!ica", name = "O", descriptor = "I")
    private int field10003;

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!ica", name = "w", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!ica", name = "H", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!ica", name = "F", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!ica", name = "L", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!ica", name = "K", descriptor = "I")
    public static int field10018;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    private int field10019;

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
    private int field10020;

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
    private int field10022;

    @OriginalMember(owner = "client!ica", name = "I", descriptor = "I")
    private int field9989;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    public static int field9992;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!ica", name = "N", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
    public static int field9997;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!ica", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field10025;

    @OriginalMember(owner = "client!ica", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mousePressed(MouseEvent arg0) {
        try {
            field10014++;
            int var2 = this.method5052(-29936, arg0);
            if (var2 == 1) {
                this.method5049((byte) -126, arg0.getClickCount(), arg0.getX(), arg0.getY(), 0);
            } else if (var2 == 4) {
                this.method5049((byte) 125, arg0.getClickCount(), arg0.getX(), arg0.getY(), 2);
            } else if (var2 == 2) {
                this.method5049((byte) -54, arg0.getClickCount(), arg0.getX(), arg0.getY(), 1);
            }
            this.field10022 |= var2;
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10026[21] + (arg0 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILwq;)Ljava/lang/String;", line = 34)
    public static final String method5038(int arg0, class176 arg1) {
        try {
            if (arg0 != -14318) {
                field9991 = -29;
            }
            field10013++;
            return class244.method2103(true, 32767, arg1);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[22] + arg0 + ',' + (arg1 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 45)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        try {
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
            field10002++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[20] + (arg0 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIII)I", line = 57)
    public static final int method5039(int arg0, int arg1, int arg2, int arg3) {
        try {
            field10010++;
            if (arg2 != 0) {
                field10008 = -0.3597307F;
            }
            if (arg1 <= arg3) {
                return arg3 > arg0 ? arg0 : arg3;
            } else {
                return arg1;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10026[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(Z)Z", line = 71)
    public final boolean method5040(boolean arg0) {
        try {
            if (arg0) {
                this.mouseReleased(null);
            }
            field10005++;
            return (this.field9989 & 0x1) != 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 82)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        try {
            this.method5043(arg0.getY(), arg0.getX(), -90);
            field10006++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[4] + (arg0 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "(I)V", line = 94)
    public static final void method5041(int arg0) {
        try {
            if (arg0 <= 68) {
                field10008 = -0.24128601F;
            }
            field10015++;
            class117 var1 = class185.field2948.field2660;
            var1.method1156(-122);
            int var2 = var1.method1163(8, -104);
            if (class632.field9088 > var2) {
                for (int var3 = var2; var3 < class632.field9088; var3++) {
                    class609.field8770[class263.field4275++] = class263.field4278[var3];
                }
            }
            if (class632.field9088 < var2) {
                throw new RuntimeException(field10026[13]);
            }
            class632.field9088 = 0;
            for (int var4 = 0; var4 < var2; var4++) {
                int var5 = class263.field4278[var4];
                class426 var6 = ((class19) class176.field2797.method737((byte) -39, (long) var5)).field194;
                int var7 = var1.method1163(1, 107);
                if (var7 == 0) {
                    class263.field4278[class632.field9088++] = var5;
                    var6.field1106 = class245.field3794;
                } else {
                    int var8 = var1.method1163(2, -118);
                    if (var8 == 0) {
                        class263.field4278[class632.field9088++] = var5;
                        var6.field1106 = class245.field3794;
                        class794.field11606[class149.field2088++] = var5;
                    } else if (var8 == 1) {
                        class263.field4278[class632.field9088++] = var5;
                        var6.field1106 = class245.field3794;
                        int var9 = var1.method1163(3, 27);
                        var6.method3379(1, -1, var9);
                        int var10 = var1.method1163(1, 51);
                        if (var10 == 1) {
                            class794.field11606[class149.field2088++] = var5;
                        }
                    } else if (var8 == 2) {
                        class263.field4278[class632.field9088++] = var5;
                        var6.field1106 = class245.field3794;
                        if (var1.method1163(1, -113) == 1) {
                            int var11 = var1.method1163(3, -119);
                            var6.method3379(2, -1, var11);
                            int var12 = var1.method1163(3, -119);
                            var6.method3379(2, -1, var12);
                        } else {
                            int var13 = var1.method1163(3, -93);
                            var6.method3379(0, -1, var13);
                        }
                        int var14 = var1.method1163(1, -86);
                        if (var14 == 1) {
                            class794.field11606[class149.field2088++] = var5;
                        }
                    } else if (var8 == 3) {
                        class609.field8770[class263.field4275++] = var5;
                    }
                }
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field10026[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)Z", line = 208)
    public final boolean method5042(byte arg0) {
        try {
            field9996++;
            if (arg0 <= 83) {
                this.method5040(false);
            }
            return (this.field9989 & 0x2) != 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 220)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        try {
            this.method5043(arg0.getY(), arg0.getX(), 109);
            field9994++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[2] + (arg0 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 228)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        try {
            field10021++;
            int var2 = this.method5052(-29936, arg0);
            if ((var2 & this.field10022) == 0) {
                var2 = this.field10022;
            }
            if ((var2 & 0x1) != 0) {
                this.method5049((byte) 117, arg0.getClickCount(), arg0.getX(), arg0.getY(), 3);
            }
            if ((var2 & 0x4) != 0) {
                this.method5049((byte) -62, arg0.getClickCount(), arg0.getX(), arg0.getY(), 5);
            }
            if ((var2 & 0x2) != 0) {
                this.method5049((byte) 114, arg0.getClickCount(), arg0.getX(), arg0.getY(), 4);
            }
            this.field10022 &= ~var2;
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10026[24] + (arg0 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(III)V", line = 254)
    private final void method5043(int arg0, int arg1, int arg2) {
        try {
            int var4 = -128 % ((arg2 + 20) / 35);
            this.field10020 = arg0;
            this.field10019 = arg1;
            field9999++;
            if (this.field10024) {
                this.method5049((byte) -38, 0, arg1, arg0, -1);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10026[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 275)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        try {
            field9995++;
            this.method5043(arg0.getY(), arg0.getX(), 97);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[19] + (arg0 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V", line = 283)
    public final void method5044(int arg0) {
        try {
            field9997++;
            this.method5046(arg0 + arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 291)
    private final void method5045(int arg0, Component arg1) {
        try {
            if (arg0 <= 74) {
                this.field9989 = 85;
            }
            this.method5046(0);
            field10001++;
            this.field10025 = arg1;
            this.field10025.addMouseListener(this);
            this.field10025.addMouseMotionListener(this);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10026[7] + arg0 + ',' + (arg1 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)V", line = 307)
    private final void method5046(int arg0) {
        try {
            field10017++;
            if (this.field10025 != null) {
                this.field10025.removeMouseMotionListener(this);
                this.field10025.removeMouseListener(this);
                this.field10025 = null;
                this.field10019 = this.field10020 = this.field10022 = arg0;
                this.field10011 = null;
                this.field10003 = this.field10000 = this.field9989 = 0;
                this.field10023 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "(I)V", line = 335)
    public final synchronized void method5047(int arg0) {
        try {
            this.field10003 = this.field10019;
            this.field9989 = this.field10022;
            field9993++;
            if (arg0 != 0) {
                field10008 = -0.7341221F;
            }
            this.field10000 = this.field10020;
            class398 var2 = this.field10011;
            this.field10011 = this.field10023;
            this.field10023 = var2;
            this.field10023.method3224(false);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10026[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)I", line = 357)
    public final int method5048(boolean arg0) {
        try {
            field9992++;
            if (!arg0) {
                this.method5049((byte) -39, 109, -1, 25, -14);
            }
            return this.field10000;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BIIII)V", line = 370)
    private final void method5049(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10012++;
            class217 var6 = new class217();
            var6.field3395 = arg4;
            var6.field3398 = arg3;
            var6.field3394 = arg1;
            int var7 = -91 / ((41 - arg0) / 50);
            var6.field3389 = arg2;
            var6.field3393 = class712.method5167(-2334);
            this.field10023.method3220(var6, 0);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10026[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)Lva;", line = 388)
    public final class524 method5050(int arg0) {
        try {
            field10007++;
            if (arg0 != 0) {
                field10008 = 0.48438486F;
            }
            return (class524) this.field10011.method3219(arg0 ^ 0xFFFFFFAF);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)I", line = 402)
    public final int method5051(int arg0) {
        try {
            if (arg0 != 0) {
                field9998 = -13;
            }
            field9990++;
            return this.field10003;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 413)
    private final int method5052(int arg0, MouseEvent arg1) {
        try {
            field10004++;
            int var3 = arg1.getModifiers();
            boolean var4 = (var3 & 0x10) != 0;
            boolean var5 = (var3 & 0x8) != 0;
            if (arg0 != -29936) {
                this.method5048(true);
            }
            boolean var6 = (var3 & 0x4) != 0;
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
            throw class590.method4333(var8, field10026[9] + arg0 + ',' + (arg1 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 506)
    public class694(Component arg0, boolean arg1) {
        try {
            this.method5045(113, arg0);
            this.field10024 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10026[16] + (arg0 == null ? field10026[1] : field10026[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 452)
    public final synchronized void mouseExited(MouseEvent arg0) {
        try {
            field10016++;
            this.method5043(arg0.getY(), arg0.getX(), -55);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[25] + (arg0 == null ? field10026[1] : field10026[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "(I)I", line = 466)
    public static final int method5053(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class582.field8380 - 1; var2++) {
            if (arg0 < class721.field10578[var2] + class498.field7471[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class582.field8380 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)Z", line = 487)
    public final boolean method5054(byte arg0) {
        try {
            if (arg0 != -72) {
                this.method5049((byte) 23, 82, 124, 19, -48);
            }
            field10018++;
            return (this.field9989 & 0x4) != 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10026[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5055(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5056(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
