import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 extends class505 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "Lgw;")
    private class118 field166 = new class118();

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "Lgw;")
    private class118 field167 = new class118();

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "[Z")
    private boolean[] field169 = new boolean[112];

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lbd;")
    public static class44 field145 = new class44("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "Lgw;")
    public static class118 field157 = new class118();

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "Lsn;")
    public static class453 field163 = null;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "Z")
    public static boolean field165 = false;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "Ljava/awt/Component;")
    private Component field168;

    static {
        new class44("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method74(int arg0, int arg1) {
        field146++;
        if (arg1 != 64) {
            this.field169 = null;
        }
        return arg0 >= 0 && arg0 < 112 ? this.field169[arg0] : false;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 22)
    private final void method75(int arg0) {
        field151++;
        if (this.field168 == null) {
            return;
        }
        this.field168.removeKeyListener(this);
        this.field168.removeFocusListener(this);
        this.field168 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field169[var2] = false;
        }
        this.field166.method861(arg0 - 1);
        this.field167.method861(-1);
    }

    @OriginalMember(owner = "client!qk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 47)
    public final synchronized void focusLost(FocusEvent arg0) {
        field155++;
        this.method82('\u0000', 1, -1, 0);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILqa;)V", line = 58)
    public static final void method76(int arg0, class167 arg1) {
        field160++;
        int var2 = class252.field3743;
        if (arg0 != 31566) {
            return;
        }
        int var3 = class291.field4322;
        int var4 = class415.field5887;
        int var5 = class517.field7487;
        int var6 = -10660793;
        arg1.method1193(1, var3, var2, var4, var5, var6);
        arg1.method1193(1, var3 + 1, var2 + 1, var4 - 2, 16, -16777216);
        arg1.method1200(true, var3 + 18, var2 + 1, -16777216, var4 - 2, var5 + -19);
        class270.field4072.method1743(class136.field2113.method426(class503.field7255, arg0 ^ 0x7B17), var2 + 3, -1, var3 + 14, var6, (byte) 121);
        int var7 = class49.field909.method639((byte) 70);
        int var8 = class49.field909.method644(101);
        int var9 = 0;
        for (class341 var10 = (class341) class258.field3829.method863(-1); var10 != null; var10 = (class341) class258.field3829.method865(-1)) {
            int var11 = (class430.field6184 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && (var2 + var4) > var7 && (var11 - 13) < var8 && var11 + 3 > var8 && var10.field5041) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class303.method1937(arg0 - 31566, var10.field5039)) {
                var13 = class58.field1052.method1646(21708, (int) var10.field5037).field1799;
            } else if (var10.field5035 != -1) {
                var13 = class58.field1052.method1646(21708, var10.field5035).field1799;
            } else if (class15.method85(var10.field5039, -20)) {
                class193 var16 = (class193) class390.field5539.method2284(true, (long) ((int) var10.field5037));
                if (var16 != null) {
                    class279 var17 = var16.field2805;
                    class311 var18 = var17.field4157;
                    if (var18.field4631 != null) {
                        var18 = var18.method1972(class84.field1335, (byte) -114);
                    }
                    if (var18 != null) {
                        var13 = var18.field4582;
                    }
                }
            } else if (class116.method833(var10.field5039, (byte) 56)) {
                Object var14 = null;
                class261 var15;
                if (var10.field5039 == 1007) {
                    var15 = class277.field4139.method569((byte) 104, (int) var10.field5037);
                } else {
                    var15 = class277.field4139.method569((byte) 108, (int) (var10.field5037 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field3926 != null) {
                    var15 = var15.method1679(class84.field1335, 1349439392);
                }
                if (var15 != null) {
                    var13 = var15.field3891;
                }
            }
            String var19 = class136.method991(arg0 ^ 0x7B30, var10);
            if (var13 != null) {
                var19 = var19 + class176.method1233(112, var13);
            }
            class270.field4072.method1738(class7.field40, (byte) 19, var12, var19, var2 + 3, 0, class175.field2613, var11);
            var9++;
            if (var10.field5042) {
                class375.field5393.method2175(var2 + class425.field6028.method875(var19, (byte) 5) + 5, var11 + -12);
            }
        }
        class154.method1084(arg0 - 31455, class517.field7487, class415.field5887, class252.field3743, class291.field4322);
    }

    @OriginalMember(owner = "client!qk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 166)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field154++;
        this.method83(arg0, 0, (byte) -88);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)I", line = 175)
    private final int method77(boolean arg0) {
        field150++;
        int var2 = 0;
        if (this.field169[81]) {
            var2 |= 0x1;
        }
        if (this.field169[82]) {
            var2 |= 0x4;
        }
        if (this.field169[86]) {
            var2 |= 0x2;
        }
        if (!arg0) {
            field163 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 198)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method83(arg0, 1, (byte) -103);
        field153++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 209)
    private final void method78(int arg0, Component arg1) {
        field149++;
        this.method75(0);
        this.field168 = arg1;
        Method var3 = class411.field5825;
        if (var3 != null) {
            try {
                var3.invoke(this.field168, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field168.addKeyListener(this);
        this.field168.addFocusListener(this);
        if (arg0 != -13157) {
            field145 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 234)
    public static void method79(boolean arg0) {
        if (arg0) {
            field165 = true;
        }
        field157 = null;
        field145 = null;
        field163 = null;
    }

    @OriginalMember(owner = "client!qk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 249)
    public final void focusGained(FocusEvent arg0) {
        field159++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lmh;", line = 258)
    public final class454 method80(byte arg0) {
        field158++;
        int var2 = 90 / (arg0 / 53);
        return (class454) this.field166.method862(-81);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 269)
    public final void method81(int arg0) {
        field144++;
        this.method75(0);
        if (arg0 != -14859) {
            this.method81(-24);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(CIII)V", line = 281)
    private final void method82(char arg0, int arg1, int arg2, int arg3) {
        field148++;
        class517 var5 = new class517();
        var5.field7483 = arg3;
        var5.field7496 = arg0;
        var5.field7494 = arg2;
        var5.field7485 = class165.method1188((byte) 26);
        this.field167.method866((byte) 10, var5);
        if (arg1 != 1) {
            method79(false);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V", line = 302)
    private final void method83(KeyEvent arg0, int arg1, byte arg2) {
        field152++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class176.field2633.length) {
            int var5 = class176.field2633[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (arg2 >= -77) {
            this.method83(null, 6, (byte) -70);
        }
        if (var6 != 0) {
            this.method82('\u0000', 1, arg1, var6);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 338)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field147++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class123.method911(-23219, var2)) {
            this.method82(var2, 1, 3, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 352)
    public final synchronized void method84(int arg0) {
        field162++;
        this.field166.method861(-1);
        int var2 = 111 % ((arg0 - 9) / 62);
        for (class517 var3 = (class517) this.field167.method862(-94); var3 != null; var3 = (class517) this.field167.method862(-111)) {
            var3.field7493 = this.method77(true);
            if (var3.field7494 == 0) {
                if (!this.field169[var3.field7483]) {
                    class517 var4 = new class517();
                    var4.field7483 = var3.field7483;
                    var4.field7494 = 0;
                    var4.field7496 = '\u0000';
                    var4.field7493 = var3.field7493;
                    var4.field7485 = var3.field7485;
                    this.field166.method866((byte) 10, var4);
                    this.field169[var3.field7483] = true;
                }
                var3.field7494 = 2;
                this.field166.method866((byte) 10, var3);
            } else if (var3.field7494 == 1) {
                if (this.field169[var3.field7483]) {
                    this.field166.method866((byte) 10, var3);
                    this.field169[var3.field7483] = false;
                }
            } else if (var3.field7494 == -1) {
                for (int var5 = 0; var5 < 112; var5++) {
                    if (this.field169[var5]) {
                        class517 var6 = new class517();
                        var6.field7496 = '\u0000';
                        var6.field7493 = var3.field7493;
                        var6.field7494 = 1;
                        var6.field7483 = var5;
                        var6.field7485 = var3.field7485;
                        this.field166.method866((byte) 10, var6);
                        this.field169[var5] = false;
                    }
                }
            } else if (var3.field7494 == 3) {
                this.field166.method866((byte) 10, var3);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 472)
    public class14(Component arg0) {
        class147.method1041((byte) -103);
        this.method78(-13157, arg0);
    }
}
