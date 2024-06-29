import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class118 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field1648 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lee;")
    public static class441 field1642;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Lp;")
    public static class446 field1650;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lkb;")
    public static class80 field1645;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "[[[Ldg;")
    public static class224[][][] field1653;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 16711680) {
            return;
        }
        if (class134.field1917 >= arg2 && class39.field595 <= arg5) {
            boolean var6;
            if (arg3 < class433.field6144) {
                var6 = false;
                arg3 = class433.field6144;
            } else if (class69.field1047 >= arg3) {
                var6 = true;
            } else {
                var6 = false;
                arg3 = class69.field1047;
            }
            boolean var7;
            if (class433.field6144 > arg1) {
                arg1 = class433.field6144;
                var7 = false;
            } else if (class69.field1047 >= arg1) {
                var7 = true;
            } else {
                arg1 = class69.field1047;
                var7 = false;
            }
            if (class39.field595 <= arg2) {
                class396.method2436(-1070, arg4, arg3, class186.field2697[arg2++], arg1);
            } else {
                arg2 = class39.field595;
            }
            if (class134.field1917 >= arg5) {
                class396.method2436(-1070, arg4, arg3, class186.field2697[arg5--], arg1);
            } else {
                arg5 = class134.field1917;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg5; var8++) {
                    int[] var9 = class186.field2697[var8];
                    var9[arg3] = var9[arg1] = arg4;
                }
            } else if (var6) {
                for (int var10 = arg2; var10 <= arg5; var10++) {
                    class186.field2697[var10][arg3] = arg4;
                }
            } else if (var7) {
                for (int var11 = arg2; var11 <= arg5; var11++) {
                    class186.field2697[var11][arg1] = arg4;
                }
            }
        }
        field1652++;
    }

    @OriginalMember(owner = "client!oi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 114)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class446.field6419 != null) {
            class30.field501 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class241.field3332.length) {
                var3 = class241.field3332[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class151.field2324 >= 0 && var3 >= 0) {
                class91.field1353[class151.field2324] = var3;
                class151.field2324 = class151.field2324 + 1 & 0x7F;
                if (class176.field2602 == class151.field2324) {
                    class151.field2324 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class264.field3541 + 1 & 0x7F;
                if (class68.field1017 != var4) {
                    class288.field3854[class264.field3541] = var3;
                    class352.field4813[class264.field3541] = '\u0000';
                    class264.field3541 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1643++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Ldd;", line = 174)
    public static final class213 method938(int arg0, int arg1) {
        field1649++;
        class213 var2 = (class213) class88.field1300.method361((long) arg0, (byte) -108);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class297.field4006.method2633(0, -1, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class213 var4 = class374.method2337(38, var3);
        class88.field1300.method360(false, var4, (long) arg0);
        if (arg1 != -28029) {
            method946((class139) null, 107);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILr;)V", line = 198)
    public static final void method939(int arg0, class63 arg1) {
        field1637++;
        if (class94.field1369) {
            return;
        }
        arg1.method2367(5);
        if (arg0 != 16) {
            field1645 = null;
        }
        class415.field5808--;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIIIIIIIII)V", line = 216)
    public static final void method940(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 52) {
            return;
        }
        field1646++;
        if (arg6 >= class433.field6144 && arg6 <= class69.field1047 && class433.field6144 <= arg8 && class69.field1047 >= arg8 && arg3 >= class433.field6144 && arg3 <= class69.field1047 && class433.field6144 <= arg5 && arg5 <= class69.field1047 && class39.field595 <= arg2 && class134.field1917 >= arg2 && class39.field595 <= arg9 && arg9 <= class134.field1917 && class39.field595 <= arg1 && arg1 <= class134.field1917 && class39.field595 <= arg7 && class134.field1917 >= arg7) {
            class255.method1662(arg9, arg5, arg7, arg8, arg0 - 169, arg2, arg6, arg1, arg4, arg3);
        } else {
            class21.method277(arg1, arg9, arg2, arg5, arg4, arg7, arg3, arg6, (byte) -124, arg8);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lmp;)V", line = 235)
    public static final void method941(class21 arg0) {
        if (class339.field4631 >= 255) {
            return;
        }
        class30.field511[class339.field4631] = arg0;
        class183.field2663[class339.field4631] = false;
        class339.field4631++;
        int var1 = arg0.field389;
        if (arg0.field382) {
            var1 = 0;
        }
        int var2 = arg0.field389;
        if (arg0.field397) {
            var2 = class388.field5464 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field3620 + 64 - arg0.field3625 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field3625 + arg0.field3620 - 64 >> 7;
            if (var6 >= class16.field190) {
                var6 = class16.field190 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field399[var4++];
                int var9 = (var8 >>> 8) + (arg0.field3618 + 64 - arg0.field3625 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class368.field5054) {
                    var10 = class368.field5054 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class39.field603[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class39.field603[var3][var11][var7] = var12 | class339.field4631;
                    } else if ((var12 & 0xFF00) == 0) {
                        class39.field603[var3][var11][var7] = var12 | class339.field4631 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class39.field603[var3][var11][var7] = var12 | class339.field4631 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class39.field603[var3][var11][var7] = var12 | class339.field4631 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Lwn;", line = 327)
    public static final class77 method942(int arg0) {
        if (arg0 != 137) {
            return null;
        }
        field1654++;
        try {
            return (class77) Class.forName("gf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 345)
    public final void keyTyped(KeyEvent arg0) {
        field1638++;
        if (class446.field6419 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class52.method503(-122, var2)) {
                int var3 = class264.field3541 + 1 & 0x7F;
                if (class68.field1017 != var3) {
                    class288.field3854[class264.field3541] = -1;
                    class352.field4813[class264.field3541] = var2;
                    class264.field3541 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V", line = 374)
    public static final void method943(int arg0, int arg1) {
        field1651++;
        class173.field2528 = arg1;
        class410 var2 = class443.field6386;
        synchronized (class443.field6386) {
            class443.field6386.method2533(0);
        }
        class410 var3 = class431.field6128;
        synchronized (class431.field6128) {
            class431.field6128.method2533(0);
        }
        if (arg0 != 16974) {
            method938(-99, -19);
        }
        class410 var4 = class68.field1026;
        synchronized (class68.field1026) {
            class68.field1026.method2533(0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 395)
    public static final void method944(int arg0) {
        if (class249.field3415.method91()) {
            class138.method1084((byte) -101);
            class249.field3415.method194(class418.field5867);
            class125.method973(arg0 ^ 0xFFFFCCB7);
        } else {
            class447.method2785(class243.field3355, (byte) 109);
        }
        if (arg0 != -13129) {
            field1650 = null;
        }
        field1635++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V", line = 414)
    public static final void method945(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg3 << 3;
        int var6 = arg0 << 3;
        field1639++;
        class47.field810 = (float) var6;
        if (class184.field2675 == 2) {
            class450.field6502 = var5;
            class286.field3837 = var4;
            class167.field2488 = var6;
        }
        class313.field4229 = (float) var4;
        if (arg2 <= 111) {
            method944(95);
        }
        class314.method1997(-29452);
        class287.field3847 = true;
    }

    @OriginalMember(owner = "client!oi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 444)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1647++;
        if (class446.field6419 != null) {
            class30.field501 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class241.field3332.length > var2) {
                var3 = class241.field3332[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class151.field2324 >= 0 && var3 >= 0) {
                class91.field1353[class151.field2324] = ~var3;
                class151.field2324 = class151.field2324 + 1 & 0x7F;
                if (class176.field2602 == class151.field2324) {
                    class151.field2324 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lbi;I)V", line = 475)
    public static final void method946(class139 arg0, int arg1) {
        field1640++;
        int var2 = -113 / ((arg1 - 10) / 47);
        class139 var3 = class301.method1933(arg0, (byte) -55);
        int var4;
        int var5;
        if (var3 == null) {
            var5 = class258.field3488;
            var4 = class249.field3414;
        } else {
            var4 = var3.field2027;
            var5 = var3.field2011;
        }
        class401.method2458(arg0, false, (byte) -99, var4, var5);
        class450.method2799(-5, var5, arg0, var4);
    }

    @OriginalMember(owner = "client!oi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 505)
    public final void focusGained(FocusEvent arg0) {
        field1636++;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 513)
    public static void method947(int arg0) {
        field1650 = null;
        field1645 = null;
        if (arg0 != 8) {
            field1644 = -33;
        }
        field1653 = null;
        field1642 = null;
    }

    @OriginalMember(owner = "client!oi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 527)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class446.field6419 != null) {
            class151.field2324 = -1;
        }
        field1641++;
    }
}
