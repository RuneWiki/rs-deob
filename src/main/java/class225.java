import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class225 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3025 = 0;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lbe;")
    public static class25 field3024;

    @OriginalMember(owner = "client!hf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3017++;
        if (class237.field3228 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class398.method2573(var2, -126)) {
                int var3 = class28.field443 + 1 & 0x7F;
                if (class73.field1142 != var3) {
                    class197.field2738[class28.field443] = -1;
                    class6.field95[class28.field443] = var2;
                    class28.field443 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIIIFIIII)[[I")
    public static final int[][] method1426(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field3020++;
        int[][] var9 = new int[arg7][arg5];
        class76 var10 = new class76();
        var10.field1188 = arg0;
        var10.field1176 = arg1;
        var10.field1181 = (int) (arg4 * 4096.0F);
        var10.field1182 = arg8;
        var10.field1175 = arg2;
        var10.method44(-14);
        class63.method427(arg7, arg5, (byte) 36);
        if (arg3 < 86) {
            method1429((byte) -87);
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method540(var9[var11], (byte) 10, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!hf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class237.field3228 != null) {
            class146.field2122 = -1;
        }
        field3023++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lrg;III)V")
    public static final void method1427(class383 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return;
        }
        field3021++;
        class220 var4 = arg0.method2496(arg3 - 16243, class408.field5920);
        if (var4 == null) {
            return;
        }
        class408.field5920.method1735(arg2, arg1, arg0.field5431 + arg2, arg0.field5491 + arg1);
        if (class254.field3486 < 3) {
            class382.field5408.method879((float) arg0.field5431 / 2.0F + (float) arg2, (float) arg0.field5491 / 2.0F + (float) arg1, 4096, ((int) (-class6.field98) & 0x3FFF) << 2, var4, arg2, arg1);
        } else {
            class408.field5920.method1819(-16777216, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3026++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method1428(boolean arg0) {
        if (!arg0) {
            field3022 = 76;
        }
        field3024 = null;
    }

    @OriginalMember(owner = "client!hf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class237.field3228 != null) {
            class307.field4213 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class327.field4470.length) {
                var3 = class327.field4470[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class146.field2122 >= 0 && var3 >= 0) {
                class381.field5399[class146.field2122] = ~var3;
                class146.field2122 = class146.field2122 + 1 & 0x7F;
                if (class35.field547 == class146.field2122) {
                    class146.field2122 = -1;
                }
            }
        }
        field3027++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!hf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3019++;
        if (class237.field3228 == null) {
            return;
        }
        class307.field4213 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class327.field4470.length > var2) {
            var3 = class327.field4470[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class146.field2122 >= 0 && var3 >= 0) {
            class381.field5399[class146.field2122] = var3;
            class146.field2122 = class146.field2122 + 1 & 0x7F;
            if (class35.field547 == class146.field2122) {
                class146.field2122 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class28.field443 + 1 & 0x7F;
            if (class73.field1142 != var4) {
                class197.field2738[class28.field443] = var3;
                class6.field95[class28.field443] = '\u0000';
                class28.field443 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method1429(byte arg0) {
        field3018++;
        for (class331 var1 = (class331) class140.field2004.method2314((byte) 84); var1 != null; var1 = (class331) class140.field2004.method2314((byte) 89)) {
            class189.method1240(var1, true);
        }
        if (arg0 < 71) {
            field3022 = 93;
        }
        client.method1098();
        client.method1103();
        client.method1095();
        client.method1104();
        client.method1114();
        client.method1117();
    }
}
