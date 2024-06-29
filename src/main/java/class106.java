import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class106 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lsb;")
    public static class98 field1896 = class47.method368("Ablegen", 0);

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field1899 = 100;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lgj;")
    public static class226 field1882 = new class226(64);

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Z")
    public static boolean field1900 = false;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Lsb;")
    public static class98 field1904 = class47.method368("0(U", 0);

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static volatile int field1906 = 0;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Lsb;")
    private static class98 field1903 = class47.method368("Loading )2 please wait)3", 0);

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Lsb;")
    private static class98 field1907 = class47.method368("RuneScape is loading )2 please wait)3)3)3", 0);

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lsb;")
    public static class98 field1909 = field1903;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "Lsb;")
    public static class98 field1910 = field1907;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lq;")
    public static class148 field1901;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILtg;Ltg;II)Lui;")
    public static final class73 method811(int arg0, class75 arg1, class75 arg2, int arg3, int arg4) {
        field1884++;
        if (arg4 == -18824) {
            return class43.method341(arg2, arg4 + 18823, arg3, arg0) ? class12.method108((byte) 75, arg1.method571(arg3, arg0, -25)) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1898++;
        if (class71.field1129 != null) {
            class258.field4548 = 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1897++;
        if (class71.field1129 != null) {
            class134.field2366 = 0;
            class99.field1742 = arg0.getX();
            class98.field1703 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIII)V")
    public static final void method812(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = class129.method984(arg5, arg4, arg3);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 14 & 0x1F;
            int var9 = ((int) var6 & 0x328642) >> 20;
            int var10 = arg0;
            int[] var11 = class128.field2286;
            if (var6 > 0L) {
                var10 = arg2;
            }
            int var12 = (52736 - (arg3 * 512)) * 4 + (arg4 * 4) + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class21 var14 = class125.method929(var13, (byte) -112);
            if (var14.field437 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 1027] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class24 var15 = null;
                if (!var14.field408) {
                    var15 = class246.field4335[var14.field437];
                } else if (var9 == 0) {
                    var15 = class246.field4335[var14.field437];
                } else if (var9 == 1) {
                    var15 = class220.field3792[var14.field437];
                } else if (var9 == 2) {
                    var15 = class13.field250[var14.field437];
                } else if (var9 == 3) {
                    var15 = class243.field4218[var14.field437];
                }
                if (var15 != null) {
                    int var16 = (var14.field398 * 4 - var15.field3038) / 2;
                    int var17 = (var14.field397 * 4 - var15.field3044) / 2;
                    var15.method259(arg4 * 4 + var16 + 48, (104 - var14.field397 + -arg3) * 4 + var17 + 48);
                }
            }
        }
        if (arg1 > -110) {
            return;
        }
        long var18 = class48.method379(arg5, arg4, arg3);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class21 var23 = class125.method929(var22, (byte) -115);
            if (var23.field437 != -1) {
                class24 var27 = null;
                if (!var23.field408) {
                    var27 = class246.field4335[var23.field437];
                } else if (var20 == 0) {
                    var27 = class246.field4335[var23.field437];
                } else if (var20 == 1) {
                    var27 = class220.field3792[var23.field437];
                } else if (var20 == 2) {
                    var27 = class13.field250[var23.field437];
                } else if (var20 == 3) {
                    var27 = class243.field4218[var23.field437];
                }
                if (var27 != null) {
                    int var28 = (var23.field397 * 4 - var27.field3044) / 2;
                    int var29 = (var23.field398 * 4 - var27.field3038) / 2;
                    var27.method259(arg4 * 4 + var29 + 48, (-arg3 + 104 - var23.field397) * 4 + 48 + var28);
                }
            } else if (var21 == 9) {
                int[] var24 = class128.field2286;
                int var25 = 15658734;
                if (var18 > 0L) {
                    var25 = 15597568;
                }
                int var26 = arg4 * 4 + (((103 - arg3) * 4 * 512) + 24624);
                if (var20 == 0 || var20 == 2) {
                    var24[var26 + 1536] = var25;
                    var24[var26 + 1024 + 1] = var25;
                    var24[var26 + 2 + 512] = var25;
                    var24[var26 + 3] = var25;
                } else {
                    var24[var26] = var25;
                    var24[var26 + 512 + 1] = var25;
                    var24[var26 + 2 + 1024] = var25;
                    var24[var26 + 1536 + 3] = var25;
                }
            }
        }
        long var30 = class221.method1527(arg5, arg4, arg3);
        field1895++;
        if (var30 == 0L) {
            return;
        }
        int var32 = ((int) var30 & 0x3FEFF2) >> 20;
        int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class21 var34 = class125.method929(var33, (byte) -84);
        if (var34.field437 == -1) {
            return;
        }
        class24 var35 = null;
        if (!var34.field408) {
            var35 = class246.field4335[var34.field437];
        } else if (var32 == 0) {
            var35 = class246.field4335[var34.field437];
        } else if (var32 == 1) {
            var35 = class220.field3792[var34.field437];
        } else if (var32 == 2) {
            var35 = class13.field250[var34.field437];
        } else if (var32 == 3) {
            var35 = class243.field4218[var34.field437];
        }
        if (var35 != null) {
            int var36 = (var34.field398 * 4 - var35.field3038) / 2;
            int var37 = (var34.field397 * 4 - var35.field3044) / 2;
            var35.method259(48 - (-(arg4 * 4) - var36), (-arg3 + 104 - var34.field397) * 4 + 48 + var37);
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Llj;B)V")
    public static final void method813(class216 arg0, byte arg1) {
        field1885++;
        if (arg1 != -117) {
            field1882 = null;
        }
        while (true) {
            while (arg0.field3728 < arg0.field3706.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1446(5350) == 1) {
                    var2 = true;
                    var4 = arg0.method1446(arg1 + 5467);
                    var3 = arg0.method1446(5350);
                }
                int var5 = arg0.method1446(5350);
                int var6 = arg0.method1446(arg1 ^ 0xFFFFEB6D);
                int var7 = class148.field2743 + class255.field4470 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class51.field830;
                if (var8 >= 0 && (var7 - 63) >= 0 && class140.field2488 > (var8 + 63) && class148.field2743 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var4 * 8 <= var11 && (var4 * 8 + 8) > var11 && var3 * 8 <= var12 && var12 < var3 * 8 + 8) {
                                byte var13 = arg0.method1472(121);
                                if (var13 != 0) {
                                    if (class102.field1805[var9][var10] == null) {
                                        class102.field1805[var9][var10] = new byte[4096];
                                    }
                                    class102.field1805[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1472(arg1 ^ 0xFFFFFFF2);
                                    if (class166.field2975[var9][var10] == null) {
                                        class166.field2975[var9][var10] = new byte[4096];
                                    }
                                    class166.field2975[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1472(arg1 ^ 0xFFFFFFEA);
                        if (var16 != 0) {
                            arg0.field3728++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JB)Lsb;")
    public static final class98 method814(long arg0, byte arg1) {
        field1887++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        if (arg1 > -127) {
            method816(120);
        }
        if ((arg0 % 37L) == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = arg0;
        while (var4 != 0L) {
            var4 /= 37L;
            var3++;
        }
        byte[] var6 = new byte[var3];
        while (arg0 != 0L) {
            long var8 = arg0;
            arg0 /= 37L;
            var3--;
            var6[var3] = class136.field2403[(int) (var8 - (arg0 * 37L))];
        }
        class98 var7 = new class98();
        var7.field1733 = var6;
        var7.field1694 = var6.length;
        return var7;
    }

    @OriginalMember(owner = "client!cd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1891++;
        if (class71.field1129 != null) {
            class134.field2366 = 0;
            class258.field4548 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Z")
    public static final boolean method815(int arg0, boolean arg1) {
        if (!arg1) {
            field1901 = null;
        }
        field1889++;
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1888++;
    }

    @OriginalMember(owner = "client!cd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class71.field1129 != null) {
            class134.field2366 = 0;
            class99.field1742 = -1;
            class98.field1703 = -1;
        }
        field1894++;
    }

    @OriginalMember(owner = "client!cd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class71.field1129 != null) {
            class134.field2366 = 0;
            class99.field1742 = arg0.getX();
            class98.field1703 = arg0.getY();
        }
        field1892++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method816(int arg0) {
        field1904 = null;
        field1903 = null;
        field1909 = null;
        if (arg0 != -1536) {
            field1909 = null;
        }
        field1901 = null;
        field1910 = null;
        field1907 = null;
        field1896 = null;
        field1882 = null;
    }

    @OriginalMember(owner = "client!cd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1890++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1886++;
        if (class71.field1129 != null) {
            class134.field2366 = 0;
            class99.field1742 = arg0.getX();
            class98.field1703 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!cd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1893++;
        if (class71.field1129 != null) {
            class134.field2366 = 0;
            field1906 = arg0.getX();
            class185.field3185 = arg0.getY();
            class21.field381 = class164.method1183((byte) 80);
            if (arg0.isMetaDown()) {
                class117.field2108 = 2;
                class258.field4548 = 2;
            } else {
                class117.field2108 = 1;
                class258.field4548 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
