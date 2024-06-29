import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class67 extends class5 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "Lrh;")
    private class59 field886 = new class59();

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "Lrh;")
    private class59 field888 = new class59();

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "[Z")
    private boolean[] field893 = new boolean[112];

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "Ljava/lang/String;")
    public static String field885 = "";

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lvt;")
    public static class570 field876;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field890;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
    public final synchronized void method30(int arg0) {
        this.field886.method365(-1);
        if (arg0 != 0) {
            this.field890 = null;
        }
        field881++;
        for (class18 var2 = (class18) this.field888.method368(arg0 + 87); var2 != null; var2 = (class18) this.field888.method368(57)) {
            var2.field157 = this.method403((byte) 22);
            if (var2.field152 == 0) {
                if (!this.field893[var2.field159]) {
                    class18 var5 = new class18();
                    var5.field165 = '\u0000';
                    var5.field152 = 0;
                    var5.field157 = var2.field157;
                    var5.field159 = var2.field159;
                    var5.field153 = var2.field153;
                    this.field886.method378(var5, 31316);
                    this.field893[var2.field159] = true;
                }
                var2.field152 = 2;
                this.field886.method378(var2, 31316);
            } else if (var2.field152 == 1) {
                if (this.field893[var2.field159]) {
                    this.field886.method378(var2, arg0 + 31316);
                    this.field893[var2.field159] = false;
                }
            } else if (var2.field152 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field893[var3]) {
                        class18 var4 = new class18();
                        var4.field159 = var3;
                        var4.field165 = '\u0000';
                        var4.field157 = var2.field157;
                        var4.field153 = var2.field153;
                        var4.field152 = 1;
                        this.field886.method378(var4, 31316);
                        this.field893[var3] = false;
                    }
                }
            } else if (var2.field152 == 3) {
                this.field886.method378(var2, arg0 ^ 0x7A54);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)Z")
    public final boolean method32(int arg0, int arg1) {
        field891++;
        if (arg1 > -98) {
            field885 = null;
        }
        return arg0 >= 0 && arg0 < 112 ? this.field893[arg0] : false;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)Lnb;")
    public final class136 method31(byte arg0) {
        if (arg0 == -60) {
            field882++;
            return (class136) this.field886.method368(arg0 + 120);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIC)V")
    private final void method399(int arg0, int arg1, int arg2, char arg3) {
        field887++;
        class18 var5 = new class18();
        if (arg1 != 112) {
            return;
        }
        var5.field152 = arg0;
        var5.field159 = arg2;
        var5.field165 = arg3;
        var5.field153 = class669.method3713(0);
        this.field888.method378(var5, 31316);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method400(Component arg0, int arg1) {
        field892++;
        this.method402(3);
        this.field890 = arg0;
        Method var3 = class112.field1349;
        if (arg1 != -11901) {
            this.field886 = null;
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field890, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field890.addKeyListener(this);
        this.field890.addFocusListener(this);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
    public static void method401(boolean arg0) {
        field885 = null;
        field876 = null;
        if (!arg0) {
            field876 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field877++;
        this.method404((byte) -99, arg0, 1);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
    public final void method29(int arg0) {
        field879++;
        this.method402(3);
        if (arg0 != -1) {
            this.field893 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)V")
    private final void method402(int arg0) {
        field889++;
        if (this.field890 == null) {
            return;
        }
        this.field890.removeKeyListener(this);
        this.field890.removeFocusListener(this);
        this.field890 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field893[var2] = false;
        }
        if (arg0 == 3) {
            this.field886.method365(-1);
            this.field888.method365(-1);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)I")
    private final int method403(byte arg0) {
        field880++;
        int var2 = 0;
        if (arg0 != 22) {
            field884 = -57;
        }
        if (this.field893[81]) {
            var2 |= 0x1;
        }
        if (this.field893[82]) {
            var2 |= 0x4;
        }
        if (this.field893[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;I)V")
    private final void method404(byte arg0, KeyEvent arg1, int arg2) {
        field874++;
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class237.field3086.length > var4) {
            int var5 = class237.field3086[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        int var7 = 116 / ((arg0 + 52) / 36);
        if (var6 != 0) {
            this.method399(arg2, 112, var6, '\u0000');
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!rfa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method404((byte) -5, arg0, 0);
        field875++;
    }

    @OriginalMember(owner = "client!rfa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field878++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class652.method3616(var2, 23)) {
            this.method399(3, 112, -1, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rfa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field873++;
    }

    @OriginalMember(owner = "client!rfa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method399(-1, 112, 0, '\u0000');
        field883++;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class67(Component arg0) {
        class343.method2167((byte) 72);
        this.method400(arg0, -11901);
    }
}
