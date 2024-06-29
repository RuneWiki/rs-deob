import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class127 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[Z")
    public static boolean[] field2267 = new boolean[200];

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lli;")
    public static class185 field2274 = class245.method1649("(Z", 124);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Z")
    public static boolean field2266 = false;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Lae;")
    public static class238 field2269 = new class238(64);

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field2283 = 0;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lli;")
    public static class185 field2282 = class245.method1649("Spielwelt erstellt)3", 126);

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Lli;")
    public static class185 field2284 = class245.method1649("<col=ffff00>", 122);

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!di", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2273++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)Z")
    public static final boolean method912(int arg0, byte arg1) {
        if (arg1 != -110) {
            method913((byte[]) null, 106, 68, -81, false, (class47[]) null, -46, 30, true, 12, 9);
        }
        field2272++;
        if (class27.field461[arg0]) {
            return true;
        } else if (class142.field2725.method1678(arg0, 0)) {
            int var2 = class142.field2725.method1693(arg0, arg1 ^ 0xFFFFFF92);
            if (var2 == 0) {
                class27.field461[arg0] = true;
                return true;
            }
            if (class136.field2557[arg0] == null) {
                class136.field2557[arg0] = new class82[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class136.field2557[arg0][var3] == null) {
                    byte[] var4 = class142.field2725.method1688(0, var3, arg0);
                    if (var4 != null) {
                        class82 var5 = class136.field2557[arg0][var3] = new class82();
                        var5.field1579 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method537(116, new class118(var4));
                        } else {
                            var5.method546((byte) -90, new class118(var4));
                        }
                    }
                }
            }
            class27.field461[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BIIIZ[Lwf;IIZII)V")
    public static final void method913(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4, class47[] arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        if (!arg8) {
            field2269 = null;
        }
        class118 var11 = new class118(arg0);
        field2277++;
        int var12 = -1;
        while (true) {
            int var13 = var11.method823((byte) -116);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method836((byte) 117);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFCD) >> 6;
                int var18 = var11.method867(!arg8);
                int var19 = var18 >> 2;
                int var20 = var14 >> 12;
                int var21 = var18 & 0x3;
                if (arg9 == var20 && var17 >= arg1 && (arg1 + 8) > var17 && var16 >= arg7 && var16 < arg7 + 8) {
                    class135 var22 = class184.method1294(var12, -28916);
                    int var23 = arg3 + class156.method1109(var17 & 0x7, var21, arg2, -1, var16 & 0x7, var22.field2500, var22.field2536);
                    int var24 = arg6 + class46.method284(var21, var17 & 0x7, arg2, var16 & 0x7, 12239, var22.field2536, var22.field2500);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class47 var25 = null;
                        if (!arg4) {
                            int var26 = arg10;
                            if ((class239.field4262[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class254.method1720(arg10, var23, arg4, (byte) 17, arg10, var12, !arg4, arg2 + var21 & 0x3, var19, var25, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field2278++;
        if (class241.field4308 != null) {
            int var2 = class145.method1039(arg0, true);
            if (var2 >= 0) {
                int var3 = class142.field2724 + 1 & 0x7F;
                if (class14.field243 != var3) {
                    class149.field2817[class142.field2724] = -1;
                    class82.field1478[class142.field2724] = var2;
                    class142.field2724 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!di", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class241.field4308 != null) {
            class104.field1880 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class194.field3577.length > var2) {
                var3 = class194.field3577[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class221.field4022 >= 0 && var3 >= 0) {
                class65.field1130[class221.field4022] = var3;
                class221.field4022 = class221.field4022 + 1 & 0x7F;
                if (class221.field4022 == class181.field3327) {
                    class221.field4022 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class142.field2724 + 1 & 0x7F;
                if (class14.field243 != var4) {
                    class149.field2817[class142.field2724] = var3;
                    class82.field1478[class142.field2724] = -1;
                    class142.field2724 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2271++;
    }

    @OriginalMember(owner = "client!di", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2270++;
        if (class241.field4308 != null) {
            class104.field1880 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class194.field3577.length) {
                var3 = class194.field3577[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class221.field4022 >= 0 && var3 >= 0) {
                class65.field1130[class221.field4022] = ~var3;
                class221.field4022 = class221.field4022 + 1 & 0x7F;
                if (class221.field4022 == class181.field3327) {
                    class221.field4022 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Lse;")
    public static final class10 method914(int arg0) {
        if (arg0 != -13526) {
            field2276 = -60;
        }
        field2280++;
        class34 var1 = new class34(class87.field1716, class210.field3839, class145.field2766[0], class249.field4418[0], class55.field940[0], class258.field4591[0], class174.field3182[0], class211.field3842);
        class269.method1827((byte) -100);
        return var1;
    }

    @OriginalMember(owner = "client!di", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2279++;
        if (class241.field4308 != null) {
            class221.field4022 = -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static void method915(boolean arg0) {
        field2284 = null;
        field2282 = null;
        field2267 = null;
        field2274 = null;
        field2269 = null;
        if (!arg0) {
            field2283 = 96;
        }
    }
}
