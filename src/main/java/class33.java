import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class33 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "[I")
    public static int[] field460 = new int[128];

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "[I")
    public static int[] field462 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!ra", name = "i", descriptor = "Lt;")
    public static class36 field466 = class3.method8(13631, "Fur Trader");

    @OriginalMember(owner = "mapview!ra", name = "g", descriptor = "I")
    public static int field464 = 0;

    @OriginalMember(owner = "mapview!ra", name = "h", descriptor = "Lt;")
    public static class36 field465 = class3.method8(13631, "Altar");

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "Lt;")
    public static class36 field463 = class3.method8(13631, "Short)2cut");

    @OriginalMember(owner = "mapview!ra", name = "j", descriptor = "Lt;")
    public static class36 field467 = class3.method8(13631, "sprites");

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "mapview!ra", name = "k", descriptor = "Lda;")
    public static class7 field468;

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "[I")
    public static int[] field459;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method187(boolean arg0) {
        class29 var1 = class6.field63;
        synchronized (class6.field63) {
            class15.field179 = class21.field271;
            class36.field498 = class34.field475;
            if (!arg0) {
                method188(-81);
            }
            class35.field482 = class36.field494;
            class32.field447 = class34.field472;
            class3.field23 = class27.field403;
            class41.field542 = class2.field8;
            class34.field472 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 58)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class20.field248 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && field462.length > var2) {
                var3 = field462[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class2.field16 >= 0 && var3 >= 0) {
                class32.field450[class2.field16] = ~var3;
                class2.field16 = class2.field16 + 1 & 0x7F;
                if (class27.field409 == class2.field16) {
                    class2.field16 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ra", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 100)
    public final void keyTyped(KeyEvent arg0) {
        if (class20.field248 != null) {
            int var2 = class14.method82(0, arg0);
            if (var2 >= 0) {
                int var3 = class2.field14 + 1 & 0x7F;
                if (class29.field430 != var3) {
                    class26.field397[class2.field14] = -1;
                    field460[class2.field14] = var2;
                    class2.field14 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ra", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 139)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class20.field248 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field462.length) {
            var3 = field462[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class2.field16 >= 0 && var3 >= 0) {
            class32.field450[class2.field16] = var3;
            class2.field16 = class2.field16 + 1 & 0x7F;
            if (class27.field409 == class2.field16) {
                class2.field16 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class2.field14 + 1 & 0x7F;
            if (class29.field430 != var4) {
                class26.field397[class2.field14] = var3;
                field460[class2.field14] = -1;
                class2.field14 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)V", line = 215)
    public static void method188(int arg0) {
        field466 = null;
        field465 = null;
        field463 = null;
        field468 = null;
        field459 = null;
        int var1 = -104 / ((15 - arg0) / 40);
        field460 = null;
        field467 = null;
        field462 = null;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IIIZ)Lt;", line = 276)
    public static final class36 method189(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        int var5 = 87 % ((70 - arg1) / 40);
        for (int var6 = arg0 / arg2; var6 != 0; var6 /= arg2) {
            var4++;
        }
        int var7 = var4;
        if (arg0 < 0 || arg3) {
            var7 = var4 + 1;
        }
        byte[] var8 = new byte[var7];
        if (arg0 < 0) {
            var8[0] = 45;
        } else if (arg3) {
            var8[0] = 43;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = arg0 % arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg0 /= arg2;
            if (var10 > 9) {
                var10 += 39;
            }
            var8[var7 - var9 - 1] = (byte) (var10 + 48);
        }
        class36 var11 = new class36();
        var11.field491 = var8;
        var11.field492 = var7;
        return var11;
    }

    @OriginalMember(owner = "mapview!ra", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 354)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ra", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 359)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class20.field248 != null) {
            class2.field16 = -1;
        }
    }
}
