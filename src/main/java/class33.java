import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class33 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "Lw;")
    public static class38 field419 = class35.method219("Water Source", true);

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "Lw;")
    public static class38 field421 = class35.method219("b12_full", true);

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "Lw;")
    public static class38 field423 = class35.method219("Rare Trees", true);

    @OriginalMember(owner = "mapview!ra", name = "g", descriptor = "Lw;")
    public static class38 field425 = class35.method219("50(U", true);

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "Z")
    public static boolean field422 = false;

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "Lw;")
    public static class38 field424 = class35.method219("map", true);

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "[[Lu;")
    public static class36[][] field420;

    @OriginalMember(owner = "mapview!ra", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 11)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ra", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 29)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class27.field374 != null) {
            class18.field181 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(B)V", line = 64)
    public static void method198(byte arg0) {
        field419 = null;
        field421 = null;
        field425 = null;
        field424 = null;
        field423 = null;
        int var1 = -88 % ((-arg0 - 41) / 55);
        field420 = null;
    }

    @OriginalMember(owner = "mapview!ra", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 93)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class27.field374 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class34.field439.length) {
                var3 = class34.field439[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class37.method229(-1, arg0);
            }
            if (class18.field181 >= 0 && var3 >= 0) {
                class24.field346[class18.field181] = var3;
                class18.field181 = class18.field181 + 1 & 0x7F;
                if (class9.field76 == class18.field181) {
                    class18.field181 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class35.field483 + 1 & 0x7F;
                if (class24.field340 != var5) {
                    class4.field28[class35.field483] = var3;
                    class19.field205[class35.field483] = var4;
                    class35.field483 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IB)Lw;", line = 156)
    public static final class38 method199(int arg0, byte arg1) {
        if (arg1 != -59) {
            field421 = null;
        }
        class38 var2 = new class38();
        var2.field502 = 0;
        var2.field503 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "mapview!ra", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 175)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class27.field374 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class34.field439.length > var2) {
                var3 = class34.field439[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class18.field181 >= 0 && var3 >= 0) {
                class24.field346[class18.field181] = ~var3;
                class18.field181 = class18.field181 + 1 & 0x7F;
                if (class9.field76 == class18.field181) {
                    class18.field181 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IIIZ)Lw;", line = 261)
    public static final class38 method200(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        if (arg2 != -3466) {
            method200(-30, -13, 91, false);
        }
        for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg0 /= arg1;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class38 var10 = new class38();
        var10.field503 = var7;
        var10.field502 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!ra", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 322)
    public final void focusGained(FocusEvent arg0) {
    }
}
