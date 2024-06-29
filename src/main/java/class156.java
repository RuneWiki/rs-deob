import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class156 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
    public static int[] field2284 = new int[14];

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2282 = -1;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lra;")
    public static class156 field2281 = new class156();

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lnc;")
    public static class89 field2289 = new class89(16);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ra", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2286++;
        if (field2281 == null) {
            return;
        }
        class267.field4161 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class162.field2343.length > var2) {
            var3 = class162.field2343[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class211.field3149 >= 0 && var3 >= 0) {
            class202.field3040[class211.field3149] = var3;
            class211.field3149 = class211.field3149 + 1 & 0x7F;
            if (class33.field592 == class211.field3149) {
                class211.field3149 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class14.field197 + 1 & 0x7F;
            if (class128.field1890 != var4) {
                class54.field861[class14.field197] = var3;
                class216.field3315[class14.field197] = '\u0000';
                class14.field197 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ra", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2287++;
        if (field2281 != null) {
            class211.field3149 = -1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2280++;
    }

    @OriginalMember(owner = "client!ra", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2285++;
        if (field2281 != null) {
            class267.field4161 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class162.field2343.length > var2) {
                var3 = class162.field2343[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class211.field3149 >= 0 && var3 >= 0) {
                class202.field3040[class211.field3149] = ~var3;
                class211.field3149 = class211.field3149 + 1 & 0x7F;
                if (class33.field592 == class211.field3149) {
                    class211.field3149 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public static final void method1057(int arg0, int arg1) {
        field2288++;
        class249.field3868.method938(arg1, (byte) -123);
        if (arg0 != -201) {
            field2282 = -119;
        }
    }

    @OriginalMember(owner = "client!ra", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field2283++;
        if (field2281 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class239.method1638(var2, 4)) {
                int var3 = class14.field197 + 1 & 0x7F;
                if (class128.field1890 != var3) {
                    class54.field861[class14.field197] = -1;
                    class216.field3315[class14.field197] = var2;
                    class14.field197 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method1058(int arg0) {
        field2289 = null;
        if (arg0 == -1) {
            field2284 = null;
            field2281 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([S[Ljava/lang/String;III)V")
    public static final void method1059(short[] arg0, String[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 < arg3) {
            int var5 = arg4;
            int var6 = (arg3 + arg4) / 2;
            String var7 = arg1[var6];
            arg1[var6] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg1[arg3] = arg1[var5];
            arg1[var5] = var7;
            arg0[arg3] = arg0[var5];
            arg0[var5] = var8;
            method1059(arg0, arg1, -125, var5 - 1, arg4);
            method1059(arg0, arg1, -127, arg3, var5 + 1);
        }
        if (arg2 >= -123) {
            field2284 = null;
        }
        field2279++;
    }
}
