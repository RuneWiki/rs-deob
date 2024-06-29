import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field321 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
    public static int[] field322 = new int[] { 0, 0, 0, -1, 0, 0, 0, 8, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 0, 0, 14, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 6, 0, 2, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, -2, -2, 0, 5, 0, 10, 0, 0, 0, 5, 7, 0, 0, 1, 0, 0, 15, 2, -1, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, -1, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 4, 0, 2, 0, -2, 0, 0, 0, -2, 0, -2, 4, 0, 0, 6, 6, 0, 6, 4, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 10, 0, -2, 0, 0, 0, 0, 6, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 1, 0, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 4, 0, 0, 0, 0, 2, 5, 0, 3, 0, 0, 4 };

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field323 = 0;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Llc;")
    public static class69 field329 = class69.method470((byte) -120, "You last logged in @red@");

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Llc;")
    public static class69 field336 = class69.method470((byte) -125, "Loading textures )2 ");

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field334 = 0;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Llc;")
    public static class69 field340 = class69.method470((byte) -124, "redstone1");

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
    public static int[] field335;

    @OriginalMember(owner = "client!cd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class18.field348 != null) {
            class93.field2044 = -1;
        }
        field330++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILib;)V")
    public static final void method97(int arg0, class50 arg1) {
        field331++;
        arg1.field1034 = arg1.field1060;
        if (arg1.field1048 == arg0) {
            arg1.field1035 = 0;
            return;
        }
        if (arg1.field1070 != -1 && arg1.field1032 == 0) {
            class74 var2 = class67.method435(77, arg1.field1070);
            if (arg1.field1044 > 0 && var2.field1660 == 0) {
                arg1.field1035++;
                return;
            }
            if (arg1.field1044 <= 0 && var2.field1673 == 0) {
                arg1.field1035++;
                return;
            }
        }
        int var3 = arg1.field1058;
        int var4 = arg1.field1041[arg1.field1048 - 1] * 128 + arg1.field1042 * 64;
        int var5 = arg1.field1065;
        int var6 = arg1.field1097[arg1.field1048 - 1] * 128 + arg1.field1042 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg1.field1065 = var6;
            arg1.field1058 = var4;
            return;
        }
        if (var3 < var4) {
            if (var6 > var5) {
                arg1.field1080 = 1280;
            } else if (var6 < var5) {
                arg1.field1080 = 1792;
            } else {
                arg1.field1080 = 1536;
            }
        } else if (var3 <= var4) {
            if (var5 < var6) {
                arg1.field1080 = 1024;
            } else {
                arg1.field1080 = 0;
            }
        } else if (var5 < var6) {
            arg1.field1080 = 768;
        } else if (var5 <= var6) {
            arg1.field1080 = 512;
        } else {
            arg1.field1080 = 256;
        }
        int var7 = arg1.field1080 - arg1.field1037 & 0x7FF;
        int var8 = arg1.field1079;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1053;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1029;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1099;
        }
        if (var8 == -1) {
            var8 = arg1.field1053;
        }
        arg1.field1034 = var8;
        int var9 = 4;
        if (arg1.field1080 != arg1.field1037 && arg1.field1076 == -1 && arg1.field1087 != 0) {
            var9 = 2;
        }
        if (arg1.field1048 > 2) {
            var9 = 6;
        }
        if (arg1.field1048 > 3) {
            var9 = 8;
        }
        if (arg1.field1035 > 0 && arg1.field1048 > 1) {
            arg1.field1035--;
            var9 = 8;
        }
        if (arg1.field1063[arg1.field1048 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 > var3) {
            arg1.field1058 += var9;
            if (arg1.field1058 > var4) {
                arg1.field1058 = var4;
            }
        } else if (var3 > var4) {
            arg1.field1058 -= var9;
            if (var4 > arg1.field1058) {
                arg1.field1058 = var4;
            }
        }
        if (var9 >= 8 && arg1.field1053 == arg1.field1034 && arg1.field1082 != -1) {
            arg1.field1034 = arg1.field1082;
        }
        if (var5 < var6) {
            arg1.field1065 += var9;
            if (var6 < arg1.field1065) {
                arg1.field1065 = var6;
            }
        } else if (var6 < var5) {
            arg1.field1065 -= var9;
            if (var6 > arg1.field1065) {
                arg1.field1065 = var6;
            }
        }
        if (arg1.field1058 != var4 || arg1.field1065 != var6) {
            return;
        }
        arg1.field1048--;
        if (arg1.field1044 > 0) {
            arg1.field1044--;
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field328++;
        if (class18.field348 != null) {
            class49.field1008 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class78.field1770.length > var2) {
                var3 = class78.field1770[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class93.field2044 >= 0 && var3 >= 0) {
                class36.field726[class93.field2044] = ~var3;
                class93.field2044 = class93.field2044 + 1 & 0x7F;
                if (class93.field2044 == class114.field2479) {
                    class93.field2044 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method98(int arg0) {
        field336 = null;
        field322 = null;
        if (arg0 == 0) {
            field340 = null;
            field329 = null;
            field335 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field324++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIB)V")
    public static final void method99(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -124) {
            field322 = null;
        }
        for (int var5 = arg3; var5 <= arg1 + arg3; var5++) {
            for (int var6 = arg2; var6 <= arg2 + arg0; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class91.field1987[0][var6][var5] = 127;
                    if (arg2 == var6 && var6 > 0) {
                        class22.field451[0][var6][var5] = class22.field451[0][var6 - 1][var5];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class22.field451[0][var6][var5] = class22.field451[0][var6 + 1][var5];
                    }
                    if (arg3 == var5 && var5 > 0) {
                        class22.field451[0][var6][var5] = class22.field451[0][var6][var5 - 1];
                    }
                    if (arg1 + arg3 == var5 && var5 < 103) {
                        class22.field451[0][var6][var5] = class22.field451[0][var6][var5 + 1];
                    }
                }
            }
        }
        field332++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static final void method100(boolean arg0) {
        class39.field769.method606(-2);
        field320++;
        if (arg0) {
            field336 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field341++;
        if (class18.field348 != null) {
            class49.field1008 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class78.field1770.length > var2) {
                var3 = class78.field1770[var2];
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
                var4 = class78.method554((byte) 73, arg0);
            }
            if (class93.field2044 >= 0 && var3 >= 0) {
                class36.field726[class93.field2044] = var3;
                class93.field2044 = class93.field2044 + 1 & 0x7F;
                if (class93.field2044 == class114.field2479) {
                    class93.field2044 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class91.field1995 + 1 & 0x7F;
                if (class47.field991 != var5) {
                    class22.field456[class91.field1995] = var3;
                    class93.field2032[class91.field1995] = var4;
                    class91.field1995 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Lvc;")
    public static final class123 method101(int arg0) {
        if (arg0 != 1) {
            field335 = null;
        }
        field333++;
        try {
            return (class123) Class.forName("db").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class10();
        }
    }

    @OriginalMember(owner = "client!cd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field325++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZZLcc;)V")
    public static final void method102(int arg0, boolean arg1, boolean arg2, class16 arg3) {
        field326++;
        class80 var4 = class91.field1986;
        synchronized (class91.field1986) {
            boolean var5 = false;
            for (class23 var6 = (class23) class91.field1986.method580((byte) 70); var6 != null; var6 = (class23) class91.field1986.method576((byte) 59)) {
                if (var6.field472 == arg0 && var6.field485 == arg3) {
                    if (var6.field490 == 1) {
                        return;
                    }
                    if (var6.field490 == 0) {
                        var5 = true;
                    }
                }
                if (var6.field490 == 2) {
                    var5 = true;
                }
            }
            if (arg2 && !var5 && class96.field2133) {
                arg3.field1300[arg0] = arg3.field285.method355(arg0, (byte) -82);
                if (arg3.field1300[arg0] == null) {
                    arg3.field288[arg0] = false;
                }
                return;
            }
            class23 var7 = new class23();
            var7.field490 = 1;
            var7.field485 = arg3;
            var7.field472 = arg0;
            if (!arg1) {
                method100(true);
            }
            class91.field1986.method577(var7, -125);
        }
        class63.method404((byte) -120);
    }
}
