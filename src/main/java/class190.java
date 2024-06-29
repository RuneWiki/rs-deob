import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class190 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3101 = "flash1:";

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3103 = -2;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
    public static boolean field3107;

    @OriginalMember(owner = "client!dj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 3)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class312.field4907 != null) {
            class40.field505 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class421.field6219.length > var2) {
                var3 = class421.field6219[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class441.field6459 >= 0 && var3 >= 0) {
                class275.field4397[class441.field6459] = var3;
                class441.field6459 = class441.field6459 + 1 & 0x7F;
                if (class441.field6459 == class129.field2042) {
                    class441.field6459 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class42.field528 + 1 & 0x7F;
                if (class271.field4346 != var4) {
                    class121.field1712[class42.field528] = var3;
                    class143.field2257[class42.field528] = '\u0000';
                    class42.field528 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3104++;
    }

    @OriginalMember(owner = "client!dj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 62)
    public final void focusGained(FocusEvent arg0) {
        field3109++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V", line = 75)
    public static final void method1334() {
        if (class309.field4886 != null) {
            for (int var0 = 0; var0 < class309.field4886.length; var0++) {
                for (int var1 = 0; var1 < class156.field2449; var1++) {
                    for (int var2 = 0; var2 < class361.field5513; var2++) {
                        if (class309.field4886[var0][var1][var2] != null) {
                            class309.field4886[var0][var1][var2].method1648(-8596);
                        }
                        class309.field4886[var0][var1][var2] = null;
                    }
                }
            }
        }
        class309.field4886 = null;
        class181.field2961 = null;
        if (class179.field2923 != null) {
            for (int var3 = 0; var3 < class179.field2923.length; var3++) {
                for (int var4 = 0; var4 < class156.field2449; var4++) {
                    for (int var5 = 0; var5 < class361.field5513; var5++) {
                        if (class179.field2923[var3][var4][var5] != null) {
                            class179.field2923[var3][var4][var5].method1648(-8596);
                        }
                        class179.field2923[var3][var4][var5] = null;
                    }
                }
            }
        }
        class179.field2923 = null;
        class364.field5542 = null;
        class423.field6252 = null;
        class275.field4396 = null;
        class414.field6122 = 0;
        if (class432.field6364 != null) {
            for (int var6 = 0; var6 < class414.field6122; var6++) {
                class432.field6364[var6] = null;
            }
        }
        if (class429.field6320 != null) {
            for (int var7 = 0; var7 < class422.field6233; var7++) {
                class429.field6320[var7] = null;
            }
            class422.field6233 = 0;
        }
        if (class27.field317 != null) {
            for (int var8 = 0; var8 < class134.field2101; var8++) {
                class27.field317[var8] = null;
            }
            for (int var9 = 0; var9 < class81.field1006; var9++) {
                for (int var10 = 0; var10 < class156.field2449; var10++) {
                    for (int var11 = 0; var11 < class361.field5513; var11++) {
                        class411.field6089[var9][var10][var11] = 0;
                    }
                }
            }
            class134.field2101 = 0;
        }
        class79.field989 = null;
        class417.method2602(2);
        class449.field6542.method2439(-119);
        class264.field4255 = null;
        class381.field5763 = null;
        class407.field6043 = null;
        class67.field847 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 215)
    public static final void method1335(int arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field3102++;
        class33 var2 = (class33) class126.field1937.method1770(arg1 ^ 0x36F, (long) arg0);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field417.length; var3++) {
                var2.field417[var3] = -1;
                var2.field412[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 245)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class312.field4907 != null) {
            class441.field6459 = -1;
        }
        field3110++;
    }

    @OriginalMember(owner = "client!dj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 258)
    public final void keyTyped(KeyEvent arg0) {
        if (class312.field4907 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class42.method277((byte) 71, var2)) {
                int var3 = class42.field528 + 1 & 0x7F;
                if (class271.field4346 != var3) {
                    class121.field1712[class42.field528] = -1;
                    class143.field2257[class42.field528] = var2;
                    class42.field528 = var3;
                }
            }
        }
        field3108++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 288)
    public static void method1336(int arg0) {
        if (arg0 != 0) {
            method1335(-39, -20);
        }
        field3101 = null;
    }

    @OriginalMember(owner = "client!dj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 299)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class312.field4907 != null) {
            class40.field505 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class421.field6219.length > var2) {
                var3 = class421.field6219[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class441.field6459 >= 0 && var3 >= 0) {
                class275.field4397[class441.field6459] = ~var3;
                class441.field6459 = class441.field6459 + 1 & 0x7F;
                if (class441.field6459 == class129.field2042) {
                    class441.field6459 = -1;
                }
            }
        }
        field3106++;
        arg0.consume();
    }
}
