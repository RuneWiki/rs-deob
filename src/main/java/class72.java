import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lpe;")
    public static class109 field1457 = class141.method1120("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 0);

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Lpe;")
    public static class109 field1476 = class141.method1120("title)3jpg", 0);

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lpe;")
    public static class109 field1473 = class141.method1120("", 0);

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lpe;")
    private static class109 field1470 = class141.method1120("You have only just left another world)3", 0);

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Lpe;")
    public static class109 field1475 = field1473;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lpe;")
    public static class109 field1468 = field1473;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lpe;")
    public static class109 field1477 = field1473;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Lpe;")
    public static class109 field1478 = field1473;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lpe;")
    public static class109 field1460 = field1473;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lpe;")
    public static class109 field1474 = field1470;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lpe;")
    public static class109 field1456 = field1473;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lre;")
    public static class123 field1459;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lna;")
    public static class91 field1455;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static final void method576(int arg0) {
        field1479++;
        while (class82.field1733.method533(class109.field2286, 31) >= 27) {
            int var1 = class82.field1733.method526((byte) 127, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class52.field1067[var1] == null) {
                var2 = true;
                class52.field1067[var1] = new class108();
            }
            class108 var3 = class52.field1067[var1];
            class139.field3035[class131.field2885++] = var1;
            var3.field3119 = class12.field264;
            int var4 = class82.field1733.method526((byte) 127, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class82.field1733.method526((byte) 127, 1);
            var3.field2265 = class138.method1095(class82.field1733.method526((byte) 127, 14), false);
            int var6 = class82.field1733.method526((byte) 127, 5);
            int var7 = class82.field1733.method526((byte) 127, 1);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class84.field1784[class42.field869++] = var1;
            }
            int var8 = class41.field856[class82.field1733.method526((byte) 127, 3)];
            var3.field3108 = var3.field2265.field2496;
            if (var2) {
                var3.field3111 = var3.field3114 = var8;
            }
            var3.field3055 = var3.field2265.field2459;
            var3.field3073 = var3.field2265.field2448;
            var3.field3076 = var3.field2265.field2500;
            if (var3.field3073 == 0) {
                var3.field3114 = 0;
            }
            var3.field3075 = var3.field2265.field2460;
            var3.field3064 = var3.field2265.field2493;
            var3.field3109 = var3.field2265.field2481;
            var3.field3113 = var3.field2265.field2461;
            var3.field3071 = var3.field2265.field2490;
            var3.method1125(var5 == 1, class136.field2975.field3120[0] + var6, 4683, class136.field2975.field3121[0] + var4);
        }
        if (arg0 != -1) {
            field1459 = null;
        }
        class82.field1733.method536((byte) 37);
    }

    @OriginalMember(owner = "client!kc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class115.field2562 != null) {
            class46.field972 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class41.field857.length > var2) {
                var3 = class41.field857[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class60.field1164 >= 0 && var3 >= 0) {
                class64.field1313[class60.field1164] = ~var3;
                class60.field1164 = class60.field1164 + 1 & 0x7F;
                if (class60.field1164 == class35.field776) {
                    class60.field1164 = -1;
                }
            }
        }
        arg0.consume();
        field1466++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)V")
    public static final void method577(byte arg0, int arg1, int arg2) {
        class63.field1299.method535(68, -25013);
        field1464++;
        class63.field1299.method118(arg1, 675269912);
        class71.field1427++;
        class63.field1299.method146(arg0 ^ 0xFFFF9521, arg2);
        if (arg0 != 120) {
            field1456 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1463++;
        if (class115.field2562 != null) {
            class60.field1164 = -1;
        }
    }

    @OriginalMember(owner = "client!kc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class115.field2562 != null) {
            class46.field972 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class41.field857.length) {
                var3 = class41.field857[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class60.field1164 >= 0 && var3 >= 0) {
                class64.field1313[class60.field1164] = var3;
                class60.field1164 = class60.field1164 + 1 & 0x7F;
                if (class60.field1164 == class35.field776) {
                    class60.field1164 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class158.field3649 + 1 & 0x7F;
                if (class84.field1783 != var4) {
                    class86.field1844[class158.field3649] = var3;
                    class156.field3592[class158.field3649] = -1;
                    class158.field3649 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1471++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lpe;Lna;Lpe;ZLna;)Lwf;")
    public static final class159 method578(class109 arg0, class91 arg1, class109 arg2, boolean arg3, class91 arg4) {
        field1465++;
        int var5 = arg1.method766(107, arg2);
        if (!arg3) {
            field1457 = null;
        }
        int var6 = arg1.method743((byte) 126, arg0, var5);
        return class123.method1004((byte) -95, var6, var5, arg1, arg4);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
    public static final void method579(boolean arg0, int arg1) {
        field1480++;
        if (class136.field2975.field3094 >> 7 == class88.field1865 && class136.field2975.field3106 >> 7 == class143.field3145) {
            class88.field1865 = 0;
        }
        int var2 = class44.field927;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = arg1; var3 < var2; var3++) {
            class50 var4;
            int var5;
            if (arg0) {
                var4 = class136.field2975;
                var5 = 33538048;
            } else {
                var5 = class92.field1973[var3] << 14;
                var4 = class104.field2194[class92.field1973[var3]];
            }
            if (var4 != null && var4.method426(false)) {
                int var6 = var4.field3094 >> 7;
                var4.field1048 = false;
                if ((class62.field1269 && class44.field927 > 50 || class44.field927 > 200) && !arg0 && var4.field3113 == var4.field3060) {
                    var4.field1048 = true;
                }
                int var7 = var4.field3106 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1031 == null || var4.field1044 > class12.field264 || var4.field1055 <= class12.field264) {
                        if ((var4.field3094 & 0x7F) == 64 && (var4.field3106 & 0x7F) == 64) {
                            if (class64.field1314[var6][var7] == class93.field2000) {
                                continue;
                            }
                            class64.field1314[var6][var7] = class93.field2000;
                        }
                        var4.field1054 = class126.method1019(var4.field3106, var4.field3094, 1, class75.field1513);
                        class147.field3201.method660(class75.field1513, var4.field3094, var4.field3106, var4.field1054, 60, var4, var4.field3114, var5, var4.field3102);
                    } else {
                        var4.field1048 = false;
                        var4.field1054 = class126.method1019(var4.field3106, var4.field3094, 1, class75.field1513);
                        class147.field3201.method692(class75.field1513, var4.field3094, var4.field3106, var4.field1054, 60, var4, var4.field3114, var5, var4.field1042, var4.field1033, var4.field1059, var4.field1058);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
    public static final void method580(int arg0, int arg1, int arg2, int arg3) {
        field1467++;
        if (arg1 != 1) {
            field1458 = 71;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class83.field1775[arg0][arg3 + var4][arg2 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class83.field1775[arg0][arg3][arg2 + var5] = class83.field1775[arg0][arg3 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class83.field1775[arg0][arg3 + var6][arg2] = class83.field1775[arg0][arg3 + var6][arg2 - 1];
            }
        }
        if (arg3 > 0 && class83.field1775[arg0][arg3 - 1][arg2] != 0) {
            class83.field1775[arg0][arg3][arg2] = class83.field1775[arg0][arg3 - 1][arg2];
        } else if (arg2 > 0 && class83.field1775[arg0][arg3][arg2 - 1] != 0) {
            class83.field1775[arg0][arg3][arg2] = class83.field1775[arg0][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class83.field1775[arg0][arg3 - 1][arg2 - 1] != 0) {
            class83.field1775[arg0][arg3][arg2] = class83.field1775[arg0][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!kc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1462++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method581(byte arg0) {
        field1457 = null;
        field1474 = null;
        field1468 = null;
        field1470 = null;
        field1473 = null;
        if (arg0 > -119) {
            field1457 = null;
        }
        field1459 = null;
        field1476 = null;
        field1460 = null;
        field1477 = null;
        field1456 = null;
        field1455 = null;
        field1475 = null;
        field1478 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZJ)Lpe;")
    public static final class109 method582(boolean arg0, long arg1) {
        field1472++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class64.field1308[(int) (var8 - arg1 * 37L)];
            }
            class109 var7 = new class109();
            if (arg0) {
                return null;
            } else {
                var7.field2279 = var6;
                var7.field2295 = var6.length;
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1469++;
        int var2 = class89.method739(-10331, arg0);
        if (var2 >= 0) {
            int var3 = class158.field3649 + 1 & 0x7F;
            if (class84.field1783 != var3) {
                class86.field1844[class158.field3649] = -1;
                class156.field3592[class158.field3649] = var2;
                class158.field3649 = var3;
            }
        }
        arg0.consume();
    }
}
