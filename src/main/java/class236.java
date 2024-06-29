import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class236 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[[I")
    public static int[][] field3144 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ab", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 3)
    public final void focusGained(FocusEvent arg0) {
        field3140++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V", line = 11)
    public static final void method1413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class365 var5 = (class365) class185.field2509.method332(arg3 - 2130841184); var5 != null; var5 = (class365) class185.field2509.method343((byte) -95)) {
            class349.method2289(arg2, arg4, arg0, arg1, true, var5);
        }
        field3143++;
        for (class365 var6 = (class365) class22.field291.method332(arg3 - 2130841184); var6 != null; var6 = (class365) class22.field291.method343((byte) -97)) {
            byte var11 = 1;
            class396 var12 = var6.field5277.method2040(false);
            if (var6.field5277.field4285) {
                var11 = 0;
            } else if (var6.field5277.field4298 == var12.field5859 || var6.field5277.field4298 == var12.field5862 || var6.field5277.field4298 == var12.field5861 || var6.field5277.field4298 == var12.field5860) {
                var11 = 2;
            } else if (var6.field5277.field4298 == var12.field5867 || var6.field5277.field4298 == var12.field5877 || var6.field5277.field4298 == var12.field5885 || var6.field5277.field4298 == var12.field5844) {
                var11 = 3;
            }
            if (var6.field5273 != var11) {
                int var13 = class181.method1105(var6.field5277, arg3 ^ 0x3);
                if (var6.field5271 != var13) {
                    if (var6.field5275 != null) {
                        class156.field2122.method2502(var6.field5275);
                        var6.field5275 = null;
                    }
                    var6.field5271 = var13;
                }
                var6.field5273 = var11;
            }
            var6.field5264 = var6.field5277.field740;
            var6.field5270 = var6.field5277.field740 + var6.field5277.method168(arg3 ^ 0xFFFFFF82) * 64;
            var6.field5293 = var6.field5277.field734;
            var6.field5284 = var6.field5277.field734 + (var6.field5277.method168(arg3 - 117) * 64);
            class349.method2289(arg2, arg4, arg0, arg1, true, var6);
        }
        for (class365 var7 = (class365) class254.field3522.method389(arg3); var7 != null; var7 = (class365) class254.field3522.method388(0)) {
            byte var8 = 1;
            class396 var9 = var7.field5269.method2040(false);
            if (var7.field5269.field4285) {
                var8 = 0;
            } else if (var7.field5269.field4298 == var9.field5859 || var7.field5269.field4298 == var9.field5862 || var7.field5269.field4298 == var9.field5861 || var7.field5269.field4298 == var9.field5860) {
                var8 = 2;
            } else if (var7.field5269.field4298 == var9.field5867 || var7.field5269.field4298 == var9.field5877 || var7.field5269.field4298 == var9.field5885 || var7.field5269.field4298 == var9.field5844) {
                var8 = 3;
            }
            if (var7.field5273 != var8) {
                int var10 = class349.method2291(true, var7.field5269);
                if (var7.field5271 != var10) {
                    if (var7.field5275 != null) {
                        class156.field2122.method2502(var7.field5275);
                        var7.field5275 = null;
                    }
                    var7.field5271 = var10;
                }
                var7.field5273 = var8;
            }
            var7.field5264 = var7.field5269.field740;
            var7.field5270 = var7.field5269.field740 + (var7.field5269.method168(arg3 - 122) * 64);
            var7.field5293 = var7.field5269.field734;
            var7.field5284 = var7.field5269.field734 + var7.field5269.method168(-110) * 64;
            class349.method2289(arg2, arg4, arg0, arg1, true, var7);
        }
    }

    @OriginalMember(owner = "client!ab", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 127)
    public final void keyTyped(KeyEvent arg0) {
        field3141++;
        if (class445.field6523 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class105.method710(var2, true)) {
                int var3 = class125.field1748 + 1 & 0x7F;
                if (class213.field2846 != var3) {
                    class103.field1418[class125.field1748] = -1;
                    class223.field2940[class125.field1748] = var2;
                    class125.field1748 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 154)
    public static void method1414(int arg0) {
        if (arg0 != 3) {
            method1415((byte) -28);
        }
        field3144 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lln;", line = 164)
    public static final class252 method1415(byte arg0) {
        if (arg0 != -69) {
            field3139 = -1;
        }
        field3145++;
        return class293.field4174;
    }

    @OriginalMember(owner = "client!ab", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 177)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3146++;
        if (class445.field6523 == null) {
            return;
        }
        class75.field1077 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class331.field4816.length) {
            var3 = class331.field4816[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class349.field5048 >= 0 && var3 >= 0) {
            class162.field2163[class349.field5048] = var3;
            class349.field5048 = class349.field5048 + 1 & 0x7F;
            if (class349.field5048 == class329.field4799) {
                class349.field5048 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class125.field1748 + 1 & 0x7F;
            if (class213.field2846 != var4) {
                class103.field1418[class125.field1748] = var3;
                class223.field2940[class125.field1748] = '\u0000';
                class125.field1748 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I", line = 235)
    public static final int method1416(int arg0, int arg1) {
        return class282.field4111 == null ? 0 : class282.field4111[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ab", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 243)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3142++;
        if (class445.field6523 != null) {
            class349.field5048 = -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 265)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class445.field6523 != null) {
            class75.field1077 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class331.field4816.length) {
                var3 = class331.field4816[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class349.field5048 >= 0 && var3 >= 0) {
                class162.field2163[class349.field5048] = ~var3;
                class349.field5048 = class349.field5048 + 1 & 0x7F;
                if (class349.field5048 == class329.field4799) {
                    class349.field5048 = -1;
                }
            }
        }
        field3138++;
        arg0.consume();
    }
}
