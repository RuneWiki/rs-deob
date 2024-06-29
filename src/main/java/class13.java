import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class13 extends class544 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!dka", name = "k", descriptor = "Lef;")
    private class513 field155 = new class513();

    @OriginalMember(owner = "client!dka", name = "w", descriptor = "Lef;")
    private class513 field157 = new class513();

    @OriginalMember(owner = "client!dka", name = "i", descriptor = "[Z")
    private boolean[] field171 = new boolean[112];

    @OriginalMember(owner = "client!dka", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field172 = new String[] { method100(method99("/LjX^c")), method100(method99("0\t%Xo")), method100(method99("%Rg\u001a")), method100(method99("/LjX.\"Ib\u0002,c")), method100(method99("/LjXt$D~\u0005U*Ne\u0013vc")), method100(method99("/LjXy.^Y\u0013~.Fx\u0013vc")), method100(method99("/LjXTc")), method100(method99("/LjXBc")), method100(method99("/LjX]c")), method100(method99("/LjXYc")), method100(method99("/LjXSc")), method100(method99("/LjXy.^_\u000fb.C#")), method100(method99("/Hh\u0003\u007f.I\u007fXq$H`\u001fwv\u0005")), method100(method99("/LjX_c")), method100(method99("p\u0007}\u0013`8Nd\u0018/z\u001c+\u0006s?O6Y)kCd\u001bs\"I6")), method100(method99(">Ty\u0012})\u001a")), method100(method99("(Hd\u001d{.Od\u0005f")), method100(method99("/LjX\\c")), method100(method99("/LjXWc")), method100(method99("/LjXt$D~\u0005^$T\u007f^")), method100(method99("/LjXQc")), method100(method99("/LjXXc")), method100(method99("/LjXy.^[\u0004w8Tn\u0012:")) };

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "Lel;")
    public static class573 field156 = new class573(70, 8);

    @OriginalMember(owner = "client!dka", name = "g", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!dka", name = "j", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!dka", name = "m", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!dka", name = "u", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!dka", name = "s", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!dka", name = "p", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!dka", name = "r", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!dka", name = "o", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!dka", name = "v", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!dka", name = "A", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!dka", name = "t", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!dka", name = "x", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!dka", name = "q", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!dka", name = "l", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!dka", name = "h", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!dka", name = "n", descriptor = "Lsja;")
    public static class11 field162;

    @OriginalMember(owner = "client!dka", name = "y", descriptor = "Lff;")
    public static class9 field160;

    @OriginalMember(owner = "client!dka", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field170;

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
    private final void method88(byte arg0, int arg1, KeyEvent arg2) {
        try {
            field169++;
            int var4 = arg2.getKeyCode();
            int var5;
            if (var4 == 0) {
                var5 = 0;
            } else if (var4 >= 0 && class530.field7730.length > var4) {
                int var6 = class530.field7730[var4];
                if (arg1 == 0 && (var6 & 0x80) != 0) {
                    var5 = 0;
                } else {
                    var5 = var6 & 0xFFFFFF7F;
                }
            } else {
                var5 = 0;
            }
            if (var5 != 0) {
                this.method92(var5, '\u0000', (byte) 127, arg1);
                arg2.consume();
                if (arg0 != 2) {
                    this.field170 = null;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field172[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field172[2] : field172[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        try {
            field150++;
            this.method92(0, '\u0000', (byte) 127, -1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field172[19] + (arg0 == null ? field172[2] : field172[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(ZI)Z")
    public final boolean method89(boolean arg0, int arg1) {
        try {
            field161++;
            if (arg0) {
                this.method95(null, false);
            }
            return arg1 >= 0 && arg1 < 112 ? this.field171[arg1] : false;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field172[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        try {
            field154++;
            this.method88((byte) 2, 1, arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field172[5] + (arg0 == null ? field172[2] : field172[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "e", descriptor = "(B)V")
    public static final void method90(byte arg0) {
        try {
            field153++;
            if (class629.field9206 != null) {
                try {
                    String var1 = class629.field9206.getParameter(field172[16]);
                    int var2 = (int) (class430.method3299(78) / 86400000L) - 11745;
                    String var3 = field172[15] + var2 + field172[14] + var1;
                    class600.method4459(field172[12] + var3 + "\"", class629.field9206, 125);
                } catch (Throwable var5) {
                }
                if (arg0 != 94) {
                    field160 = null;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field172[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "(I)V")
    private final void method91(int arg0) {
        try {
            field152++;
            if (this.field170 != null) {
                this.field170.removeKeyListener(this);
                this.field170.removeFocusListener(this);
                if (arg0 == 0) {
                    this.field170 = null;
                    for (int var2 = 0; var2 < 112; var2++) {
                        this.field171[var2] = false;
                    }
                    this.field155.method3879(121);
                    this.field157.method3879(107);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field172[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(ICBI)V")
    private final void method92(int arg0, char arg1, byte arg2, int arg3) {
        try {
            field159++;
            if (arg2 < 123) {
                this.method94((byte) 26);
            }
            class676 var5 = new class676();
            var5.field9794 = arg3;
            var5.field9802 = arg1;
            var5.field9806 = arg0;
            var5.field9795 = class430.method3299(127);
            this.field157.method3868(106, var5);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field172[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        try {
            field166++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field172[4] + (arg0 == null ? field172[2] : field172[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        try {
            this.method88((byte) 2, 0, arg0);
            field158++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field172[22] + (arg0 == null ? field172[2] : field172[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "d", descriptor = "(B)V")
    public static void method93(byte arg0) {
        try {
            field160 = null;
            field162 = null;
            int var1 = 45 / ((-arg0 - 61) / 53);
            field156 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field172[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "(B)V")
    public final synchronized void method94(byte arg0) {
        try {
            field165++;
            this.field155.method3879(121);
            if (arg0 > -97) {
                this.keyPressed(null);
            }
            for (class676 var2 = (class676) this.field157.method3875(92); var2 != null; var2 = (class676) this.field157.method3875(-104)) {
                var2.field9796 = this.method98(true);
                if (var2.field9794 == 0) {
                    if (!this.field171[var2.field9806]) {
                        class676 var5 = new class676();
                        var5.field9796 = var2.field9796;
                        var5.field9794 = 0;
                        var5.field9802 = '\u0000';
                        var5.field9795 = var2.field9795;
                        var5.field9806 = var2.field9806;
                        this.field155.method3868(71, var5);
                        this.field171[var2.field9806] = true;
                    }
                    var2.field9794 = 2;
                    this.field155.method3868(-124, var2);
                } else if (var2.field9794 == 1) {
                    if (this.field171[var2.field9806]) {
                        this.field155.method3868(115, var2);
                        this.field171[var2.field9806] = false;
                    }
                } else if (var2.field9794 == -1) {
                    for (int var3 = 0; var3 < 112; var3++) {
                        if (this.field171[var3]) {
                            class676 var4 = new class676();
                            var4.field9806 = var3;
                            var4.field9802 = '\u0000';
                            var4.field9796 = var2.field9796;
                            var4.field9795 = var2.field9795;
                            var4.field9794 = 1;
                            this.field155.method3868(112, var4);
                            this.field171[var3] = false;
                        }
                    }
                } else if (var2.field9794 == 3) {
                    this.field155.method3868(76, var2);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field172[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        try {
            field151++;
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && class426.method3282(49, var2)) {
                this.method92(-1, var2, (byte) 125, 3);
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field172[11] + (arg0 == null ? field172[2] : field172[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method95(Component arg0, boolean arg1) {
        try {
            this.method91(0);
            field168++;
            this.field170 = arg0;
            Method var3 = class33.field380;
            if (var3 != null) {
                try {
                    var3.invoke(this.field170, Boolean.FALSE);
                } catch (Throwable var5) {
                }
            }
            this.field170.addKeyListener(this);
            if (!arg1) {
                this.field170.addFocusListener(this);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field172[17] + (arg0 == null ? field172[2] : field172[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(B)V")
    public final void method96(byte arg0) {
        try {
            if (arg0 >= -28) {
                this.keyTyped(null);
            }
            this.method91(0);
            field163++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field172[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)Lks;")
    public final class462 method97(int arg0) {
        try {
            field167++;
            if (arg0 != 5) {
                this.field155 = null;
            }
            return (class462) this.field155.method3875(arg0 ^ 0x48);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field172[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(Z)I")
    private final int method98(boolean arg0) {
        try {
            if (!arg0) {
                this.method91(-113);
            }
            field164++;
            int var2 = 0;
            if (this.field171[81]) {
                var2 |= 0x1;
            }
            if (this.field171[82]) {
                var2 |= 0x4;
            }
            if (this.field171[86]) {
                var2 |= 0x2;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field172[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class13(Component arg0) {
        try {
            class152.method1276(65);
            this.method95(arg0, false);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field172[3] + (arg0 == null ? field172[2] : field172[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method99(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method100(char[] arg0) {
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
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
