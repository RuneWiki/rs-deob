import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class154 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lqj;")
    public static class196 field2493 = class80.method502("Update)2Liste geladen)3", -48);

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    public static int[] field2492 = new int[1000];

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lqj;")
    private static class196 field2500 = class80.method502("Drop", -48);

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field2502 = 0;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lqj;")
    public static class196 field2497 = field2500;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "B")
    public static byte field2491;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[I")
    public static int[] field2487;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
    public static final boolean method978(int arg0, int arg1) {
        field2501++;
        if (arg1 <= 53) {
            return true;
        } else {
            return (arg0 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class105.field1522 != null) {
            int var2 = class81.method510((byte) 80, arg0);
            if (var2 >= 0) {
                int var3 = class146.field2296 + 1 & 0x7F;
                if (class58.field794 != var3) {
                    class41.field466[class146.field2296] = -1;
                    class149.field2387[class146.field2296] = var2;
                    class146.field2296 = var3;
                }
            }
        }
        arg0.consume();
        field2495++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Lci;")
    public static final class187 method979(int arg0) {
        field2498++;
        try {
            if (arg0 != -9834) {
                method979(57);
            }
            return (class187) Class.forName("di").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class113();
        }
    }

    @OriginalMember(owner = "client!jh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2490++;
    }

    @OriginalMember(owner = "client!jh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class105.field1522 != null) {
            class60.field802 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class10.field109.length > var2) {
                var3 = class10.field109[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class116.field1672 >= 0 && var3 >= 0) {
                class230.field4090[class116.field1672] = var3;
                class116.field1672 = class116.field1672 + 1 & 0x7F;
                if (class220.field3948 == class116.field1672) {
                    class116.field1672 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class146.field2296 + 1 & 0x7F;
                if (class58.field794 != var4) {
                    class41.field466[class146.field2296] = var3;
                    class149.field2387[class146.field2296] = -1;
                    class146.field2296 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2496++;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static void method980(int arg0) {
        field2493 = null;
        field2487 = null;
        field2500 = null;
        field2492 = null;
        field2497 = null;
        if (arg0 != 0) {
            field2502 = -99;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLbk;Lbk;IB)Lsf;")
    public static final class218 method981(boolean arg0, class136 arg1, class136 arg2, int arg3, byte arg4) {
        field2499++;
        boolean var5 = true;
        int[] var6 = arg1.method826(arg3, (byte) -36);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method835(1, arg3, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg2.method835(1, 0, var9);
                } else {
                    var10 = arg2.method835(1, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        if (arg4 != 51) {
            field2497 = null;
        }
        try {
            return new class218(arg1, arg2, arg3, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class105.field1522 != null) {
            class60.field802 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class10.field109.length > var2) {
                var3 = class10.field109[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class116.field1672 >= 0 && var3 >= 0) {
                class230.field4090[class116.field1672] = ~var3;
                class116.field1672 = class116.field1672 + 1 & 0x7F;
                if (class220.field3948 == class116.field1672) {
                    class116.field1672 = -1;
                }
            }
        }
        arg0.consume();
        field2494++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static final void method982(boolean arg0) {
        field2488++;
        if (class50.field595 != null) {
            class50.field595.method481(true);
        }
        if (!arg0) {
            field2497 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2489++;
        if (class105.field1522 != null) {
            class116.field1672 = -1;
        }
    }
}
