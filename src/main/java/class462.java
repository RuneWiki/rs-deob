import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class462 extends class469 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "[Z")
    private boolean[] field6488 = new boolean[112];

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Z")
    public static boolean field6478 = false;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lek;")
    private class323 field6468;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lek;")
    private class323 field6470;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lek;")
    private class323 field6477;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lii;")
    public static class358 field6466;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field6480;

    @OriginalMember(owner = "client!ge", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6476++;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public final synchronized void method2702(int arg0) {
        field6485++;
        for (class323 var2 = this.field6468; var2 != null; var2 = var2.field4661) {
            if (var2.field4670 == 0) {
                if (var2.field4667 >= 0) {
                    var2.field4664 = !this.field6488[var2.field4667];
                }
                this.field6488[var2.field4667] = true;
            } else if (var2.field4670 == 1) {
                this.field6488[var2.field4667] = false;
            } else if (var2.field4670 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    this.field6488[var4] = false;
                }
            }
        }
        int var3 = 70 / ((-arg0 - 66) / 34);
        this.field6477 = this.field6468;
        this.field6470 = null;
        this.field6468 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public final void method2703(boolean arg0) {
        field6474++;
        if (arg0) {
            this.field6488 = null;
        }
        this.method2707(-90);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public static final void method2704(int arg0) {
        class346.field5022 = 0;
        class249.field3685 = false;
        class367.field5271 = 0;
        if (arg0 > -87) {
            field6478 = true;
        }
        class22.field287 = -3;
        class267.field3909 = -1;
        class278.field4092 = 1;
        class99.field1275 = 0;
        field6469++;
    }

    @OriginalMember(owner = "client!ge", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6487++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class328.method2076(var2, 0)) {
            this.method2710((byte) 110, -1, 2, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public static final int method2705(int arg0, int arg1, int arg2) {
        field6482++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg1 != 0) {
                method2713(29);
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2706(byte arg0, Component arg1) {
        field6486++;
        this.method2707(-72);
        this.field6480 = arg1;
        Method var3 = class430.field6028;
        if (arg0 <= 55) {
            method2713(-43);
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field6480, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6480.addKeyListener(this);
        this.field6480.addFocusListener(this);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    private final void method2707(int arg0) {
        field6472++;
        if (this.field6480 == null) {
            return;
        }
        this.field6480.removeKeyListener(this);
        this.field6480.removeFocusListener(this);
        this.field6480 = null;
        int var2 = 43 / ((arg0 + 38) / 32);
        for (int var3 = 0; var3 < 112; var3++) {
            this.field6488[var3] = false;
        }
        this.field6470 = null;
        this.field6468 = null;
        this.field6477 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Lhk;")
    public final class59 method2708(int arg0) {
        if (arg0 != -26962) {
            field6478 = false;
        }
        field6475++;
        class323 var2;
        for (var2 = this.field6477; var2 != null && var2.field4670 == -1; var2 = var2.field4661) {
        }
        if (var2 == null) {
            this.field6477 = null;
        } else {
            this.field6477 = var2.field4661;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
    private final void method2709(KeyEvent arg0, int arg1, int arg2) {
        field6481++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (arg2 == var4) {
            var5 = 0;
        } else if (var4 >= 0 && class22.field277.length > var4) {
            int var6 = class22.field277[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method2710((byte) -3, var5, arg1, '\u0000');
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ge", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2710((byte) 121, 0, -1, '\u0000');
        field6473++;
    }

    @OriginalMember(owner = "client!ge", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2709(arg0, 1, 0);
        field6467++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIIC)V")
    private final void method2710(byte arg0, int arg1, int arg2, char arg3) {
        field6484++;
        class323 var5 = new class323();
        var5.field4670 = arg2;
        var5.field4667 = arg1;
        var5.field4663 = arg3;
        var5.field4673 = class433.method2562(-2039);
        if (this.field6470 == null) {
            this.field6468 = var5;
        } else {
            this.field6470.field4661 = var5;
        }
        this.field6470 = var5;
        int var6 = -36 % ((arg0 - 69) / 34);
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public static void method2711(int arg0) {
        if (arg0 != 2) {
            method2704(-107);
        }
        field6466 = null;
    }

    @OriginalMember(owner = "client!ge", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2709(arg0, 0, 0);
        field6483++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
    public final boolean method2712(int arg0, int arg1) {
        field6471++;
        if (arg0 != 2) {
            this.method2702(50);
        }
        return arg1 >= 0 && arg1 < 112 ? this.field6488[arg1] : false;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
    public static final void method2713(int arg0) {
        field6479++;
        if (class120.field1507 == 0) {
            return;
        }
        try {
            if (++class166.field2435 > 2000) {
                if (class58.field761 != null) {
                    class58.field761.method2118(1);
                    class58.field761 = null;
                }
                if (class42.field621 >= 1) {
                    class355.field5138 = -5;
                    class120.field1507 = 0;
                    return;
                }
                class166.field2435 = 0;
                if (class89.field1102 == class2.field24) {
                    class89.field1102 = class202.field2979;
                } else {
                    class89.field1102 = class2.field24;
                }
                class42.field621++;
                class120.field1507 = 1;
            }
            if (class120.field1507 == 1) {
                class178.field2553 = class252.field3718.method2527(class262.field3840, (byte) -127, class89.field1102);
                class120.field1507 = 2;
            }
            if (class120.field1507 == 2) {
                if (class178.field2553.field5253 == 2) {
                    throw new IOException();
                }
                if (class178.field2553.field5253 != 1) {
                    return;
                }
                class58.field761 = new class337((Socket) class178.field2553.field5255, class252.field3718);
                class178.field2553 = null;
                class58.field761.method2125(class225.field3415.field4021, class225.field3415.field4064, (byte) -36, 0);
                if (class28.field381 != null) {
                    class28.field381.method2477(-117);
                }
                if (class116.field1481 != null) {
                    class116.field1481.method2477(-90);
                }
                int var1 = class58.field761.method2119(true);
                if (class28.field381 != null) {
                    class28.field381.method2477(-127);
                }
                if (class116.field1481 != null) {
                    class116.field1481.method2477(-89);
                }
                if (var1 != 21) {
                    class120.field1507 = 0;
                    class355.field5138 = var1;
                    class58.field761.method2118(1);
                    class58.field761 = null;
                    return;
                }
                class120.field1507 = 3;
            }
            if (class120.field1507 == 3) {
                if (class58.field761.method2121(true) < 1) {
                    return;
                }
                class237.field3562 = new String[class58.field761.method2119(true)];
                class120.field1507 = 4;
            }
            int var2 = 118 / ((-arg0 - 15) / 51);
            if (class120.field1507 == 4 && class58.field761.method2121(true) >= class237.field3562.length * 8) {
                class345.field5016.field4021 = 0;
                class58.field761.method2123(114, 0, class345.field5016.field4064, class237.field3562.length * 8);
                for (int var3 = 0; var3 < class237.field3562.length; var3++) {
                    class237.field3562[var3] = class8.method32(class345.field5016.method1703(113), (byte) -104);
                }
                class120.field1507 = 0;
                class355.field5138 = 21;
                class58.field761.method2118(1);
                class58.field761 = null;
            }
        } catch (IOException var4) {
            if (class58.field761 != null) {
                class58.field761.method2118(1);
                class58.field761 = null;
            }
            if (class42.field621 >= 1) {
                class120.field1507 = 0;
                class355.field5138 = -4;
            } else {
                if (class89.field1102 == class2.field24) {
                    class89.field1102 = class202.field2979;
                } else {
                    class89.field1102 = class2.field24;
                }
                class166.field2435 = 0;
                class42.field621++;
                class120.field1507 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class462(Component arg0) {
        class291.method1822(false);
        this.method2706((byte) 79, arg0);
    }
}
