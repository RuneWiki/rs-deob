import java.awt.Canvas;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class105 extends class287 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[Z")
    private boolean[] field1241 = new boolean[112];

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "Lhk;")
    private class238 field1239;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Lhk;")
    private class238 field1245;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "Lhk;")
    private class238 field1251;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field1250;

    static {
        new class72("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field1254 = 64;
        new class72("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }

    @OriginalMember(owner = "client!ql", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 3)
    public final void focusGained(FocusEvent arg0) {
        field1244++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Z", line = 11)
    public final boolean method623(int arg0, int arg1) {
        field1238++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 != 9) {
                this.focusGained((FocusEvent) null);
            }
            return this.field1241[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 29)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method627(14562, '\u0000', -1, 0);
        field1246++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 41)
    private final void method624(Component arg0, byte arg1) {
        this.method631(82);
        field1237++;
        this.field1250 = arg0;
        Method var3 = class441.field6096;
        if (var3 != null) {
            try {
                var3.invoke(this.field1250, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field1250.addKeyListener(this);
        if (arg1 >= 46) {
            this.field1250.addFocusListener(this);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V", line = 66)
    public final void method625(int arg0) {
        if (arg0 != 1) {
            this.method626((KeyEvent) null, 36, -107);
        }
        this.method631(61);
        field1233++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 77)
    private final void method626(KeyEvent arg0, int arg1, int arg2) {
        field1249++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class209.field2542.length > var4) {
            int var5 = class209.field2542[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 == 0) {
            return;
        }
        this.method627(14562, '\u0000', arg2, var6);
        arg0.consume();
        if (arg1 != -1) {
            this.method624((Component) null, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 396)
    public class105(Component arg0) {
        class62.method359(-25820);
        this.method624(arg0, (byte) 53);
    }

    @OriginalMember(owner = "client!ql", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 120)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1235++;
        this.method626(arg0, -1, 1);
    }

    @OriginalMember(owner = "client!ql", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 128)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field1240++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class310.method1967(var2, (byte) -43)) {
            this.method627(14562, var2, 2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ql", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 144)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method626(arg0, -1, 0);
        field1252++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ICII)V", line = 152)
    private final void method627(int arg0, char arg1, int arg2, int arg3) {
        field1236++;
        class238 var5 = new class238();
        if (arg0 != 14562) {
            this.keyReleased((KeyEvent) null);
        }
        var5.field3133 = arg1;
        var5.field3138 = arg3;
        var5.field3130 = arg2;
        var5.field3141 = class164.method1038(arg0 ^ 0x1959);
        if (this.field1239 == null) {
            this.field1245 = var5;
        } else {
            this.field1239.field3145 = var5;
        }
        this.field1239 = var5;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZI)Z", line = 174)
    public static final boolean method628(int arg0, boolean arg1, int arg2) {
        field1243++;
        if (arg1) {
            method632(-3);
        }
        if (!class49.field574) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class362.field4903[var3] == null || class362.field4903[var3][var4] == null) {
            return false;
        }
        class453 var5 = class362.field4903[var3][var4];
        if (arg0 == -1 && var5.field6383 == 0) {
            for (class266 var6 = (class266) class97.field1138.method1690((byte) -122); var6 != null; var6 = (class266) class97.field1138.method1699((byte) 39)) {
                if (var6.field3424 == 57 || var6.field3424 == 1010 || var6.field3424 == 10 || var6.field3424 == 58 || var6.field3424 == 2) {
                    for (class453 var7 = class195.method1212(var6.field3426, (byte) 49); var7 != null; var7 = class389.method2417(var7, 94)) {
                        if (var5.field6475 == var7.field6475) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class266 var8 = (class266) class97.field1138.method1690((byte) -126); var8 != null; var8 = (class266) class97.field1138.method1699((byte) 122)) {
                if (var8.field3423 == arg0 && var5.field6475 == var8.field3426 && (var8.field3424 == 57 || var8.field3424 == 1010 || var8.field3424 == 10 || var8.field3424 == 58 || var8.field3424 == 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Lhn;", line = 245)
    public final class57 method629(byte arg0) {
        if (arg0 < 117) {
            this.field1241 = null;
        }
        field1242++;
        class238 var2;
        for (var2 = this.field1251; var2 != null && var2.field3130 == -1; var2 = var2.field3145) {
        }
        if (var2 == null) {
            this.field1251 = null;
        } else {
            this.field1251 = var2.field3145;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 266)
    public final synchronized void method630(int arg0) {
        field1234++;
        for (class238 var2 = this.field1245; var2 != null; var2 = var2.field3145) {
            if (var2.field3130 == 0) {
                if (var2.field3138 >= 0) {
                    var2.field3135 = !this.field1241[var2.field3138];
                }
                this.field1241[var2.field3138] = true;
            } else if (var2.field3130 == 1) {
                this.field1241[var2.field3138] = false;
            } else if (var2.field3130 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field1241[var3] = false;
                }
            }
        }
        this.field1251 = this.field1245;
        this.field1245 = null;
        this.field1239 = null;
        if (arg0 != 2) {
            field1248 = 32;
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V", line = 324)
    private final void method631(int arg0) {
        field1253++;
        if (this.field1250 == null) {
            return;
        }
        this.field1250.removeKeyListener(this);
        this.field1250.removeFocusListener(this);
        this.field1250 = null;
        if (arg0 <= 42) {
            this.field1239 = null;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field1241[var2] = false;
        }
        this.field1239 = null;
        this.field1245 = null;
        this.field1251 = null;
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I", line = 354)
    public static final int method632(int arg0) {
        field1247++;
        class118 var1 = class267.field3454;
        boolean var2 = false;
        if (class20.field220 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class118.method700((byte) 67, (class172) null, 0, var3, (class441) null, 0);
            var2 = true;
        }
        long var4 = class164.method1038(arg0 + 8635);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method744(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class164.method1038(arg0 ^ 0x21BB) - var4);
        var1.method739((byte) -124, -16777216, 0, 100, arg0, 100);
        if (var2) {
            var1.method745(2);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 405)
    public static final void method633(int[] arg0, Object[] arg1, int arg2) {
        class163.method1036(arg1, 0, arg0.length + arg2, arg0, true);
        field1232++;
    }
}
