import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class436 extends class233 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "[Z")
    private boolean[] field6373 = new boolean[112];

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6359 = null;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lao;")
    public static class191 field6356 = new class191(19, -1);

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lrs;")
    private class465 field6355;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lrs;")
    private class465 field6362;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "Lrs;")
    private class465 field6371;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field6360;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static void method2676(int arg0) {
        field6356 = null;
        if (arg0 >= 57) {
            field6359 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6361++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class74.method433(var2, true)) {
            this.method2682(2, -1, var2, (byte) 39);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method2677(Component arg0, byte arg1) {
        field6368++;
        this.method2681((byte) -17);
        if (arg1 <= 10) {
            method2678(55, (byte) -19, -110);
        }
        this.field6360 = arg0;
        Method var3 = class137.field1842;
        if (var3 != null) {
            try {
                var3.invoke(this.field6360, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6360.addKeyListener(this);
        this.field6360.addFocusListener(this);
    }

    @OriginalMember(owner = "client!ji", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field6374++;
        this.method2682(-1, 0, '\u0000', (byte) 39);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2678(int arg0, byte arg1, int arg2) {
        int var3 = 33 / ((-arg1 - 40) / 47);
        field6365++;
        return class268.method1635(arg2, -1596595220, arg0) || class452.method2802(arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2679(byte arg0, char arg1, String arg2) {
        field6358++;
        int var3 = class281.method1703(0, arg1, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg0 <= 51) {
            field6359 = null;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public final void method1477(byte arg0) {
        this.method2681((byte) -17);
        field6364++;
        if (arg0 != 82) {
            field6359 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6369++;
    }

    @OriginalMember(owner = "client!ji", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field6372++;
        this.method2680(-23339, arg0, 1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Z")
    public final boolean method1472(int arg0, int arg1) {
        if (arg0 != 28251) {
            this.keyTyped(null);
        }
        field6366++;
        return arg1 >= 0 && arg1 < 112 ? this.field6373[arg1] : false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
    private final void method2680(int arg0, KeyEvent arg1, int arg2) {
        field6363++;
        if (arg0 != -23339) {
            this.focusGained(null);
        }
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class497.field7252.length > var4) {
            int var5 = class497.field7252[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method2682(arg2, var6, '\u0000', (byte) 39);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!ji", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field6357++;
        this.method2680(-23339, arg0, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Ljv;")
    public final class57 method1473(int arg0) {
        field6367++;
        class465 var2 = this.field6355;
        if (arg0 != 350) {
            this.field6371 = null;
        }
        while (var2 != null && var2.field6921 == -1) {
            var2 = var2.field6923;
        }
        if (var2 == null) {
            this.field6355 = null;
        } else {
            this.field6355 = var2.field6923;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    private final void method2681(byte arg0) {
        if (arg0 != -17) {
            this.field6355 = null;
        }
        field6376++;
        if (this.field6360 == null) {
            return;
        }
        this.field6360.removeKeyListener(this);
        this.field6360.removeFocusListener(this);
        this.field6360 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field6373[var2] = false;
        }
        this.field6355 = null;
        this.field6371 = null;
        this.field6362 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IICB)V")
    private final void method2682(int arg0, int arg1, char arg2, byte arg3) {
        field6370++;
        class465 var5 = new class465();
        var5.field6911 = arg1;
        var5.field6921 = arg0;
        var5.field6922 = arg2;
        var5.field6913 = class45.method252((byte) -8);
        if (this.field6371 == null) {
            this.field6362 = var5;
        } else {
            this.field6371.field6923 = var5;
        }
        if (arg3 != 39) {
            this.field6371 = null;
        }
        this.field6371 = var5;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public final synchronized void method1479(int arg0) {
        field6375++;
        if (arg0 != -25961) {
            field6359 = null;
        }
        for (class465 var2 = this.field6362; var2 != null; var2 = var2.field6923) {
            if (var2.field6921 == 0) {
                if (var2.field6911 >= 0) {
                    var2.field6920 = !this.field6373[var2.field6911];
                }
                this.field6373[var2.field6911] = true;
            } else if (var2.field6921 == 1) {
                this.field6373[var2.field6911] = false;
            } else if (var2.field6921 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field6373[var3] = false;
                }
            }
        }
        this.field6355 = this.field6362;
        this.field6362 = null;
        this.field6371 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class436(Component arg0) {
        class365.method2171(-32007);
        this.method2677(arg0, (byte) 37);
    }
}
