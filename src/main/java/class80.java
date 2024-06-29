import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lva;")
    public static class141 field1938 = null;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lwd;")
    public static class150 field1931 = class2.method9(true, "::fpson");

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lwd;")
    public static class150 field1943 = class2.method9(true, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lwd;")
    public static class150 field1937 = null;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lwd;")
    private static class150 field1953 = class2.method9(true, "flash1:");

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lwd;")
    public static class150 field1933 = field1953;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lwd;")
    public static class150 field1929 = field1953;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
    public static int[] field1948;

    @OriginalMember(owner = "client!ld", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class83.field1986 != null) {
            class38.field1047 = 0;
            class22.field638 = -1;
            class86.field2037 = -1;
        }
        field1941++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static final void method578(boolean arg0) {
        field1936++;
        int var1 = class121.field2783.method967(8, false);
        if (!arg0) {
            field1929 = null;
        }
        if (var1 < class109.field2533) {
            for (int var2 = var1; var2 < class109.field2533; var2++) {
                class49.field1293[class70.field1786++] = class61.field1574[var2];
            }
        }
        if (class109.field2533 < var1) {
            throw new RuntimeException("gppov1");
        }
        class109.field2533 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class61.field1574[var3];
            class111 var5 = class137.field3217[var4];
            int var6 = class121.field2783.method967(1, false);
            if (var6 == 0) {
                class61.field1574[class109.field2533++] = var4;
                var5.field2965 = class11.field280;
            } else {
                int var7 = class121.field2783.method967(2, false);
                if (var7 == 0) {
                    class61.field1574[class109.field2533++] = var4;
                    var5.field2965 = class11.field280;
                    class17.field468[class111.field2577++] = var4;
                } else if (var7 == 1) {
                    class61.field1574[class109.field2533++] = var4;
                    var5.field2965 = class11.field280;
                    int var8 = class121.field2783.method967(3, !arg0);
                    var5.method959((byte) -47, var8, false);
                    int var9 = class121.field2783.method967(1, false);
                    if (var9 == 1) {
                        class17.field468[class111.field2577++] = var4;
                    }
                } else if (var7 == 2) {
                    class61.field1574[class109.field2533++] = var4;
                    var5.field2965 = class11.field280;
                    int var10 = class121.field2783.method967(3, !arg0);
                    var5.method959((byte) -47, var10, true);
                    int var11 = class121.field2783.method967(3, false);
                    var5.method959((byte) -47, var11, true);
                    int var12 = class121.field2783.method967(1, false);
                    if (var12 == 1) {
                        class17.field468[class111.field2577++] = var4;
                    }
                } else if (var7 == 3) {
                    class49.field1293[class70.field1786++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILva;)Z")
    public static final boolean method579(int arg0, class141 arg1) {
        field1939++;
        if (arg0 <= 16) {
            field1937 = null;
        }
        if (class118.field2690) {
            if (class124.method942(arg1, true) != 0) {
                return false;
            }
            if (arg1.field3354 == 0) {
                return false;
            }
        }
        return arg1.field3348;
    }

    @OriginalMember(owner = "client!ld", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1935++;
        if (class83.field1986 != null) {
            class38.field1047 = 0;
            class22.field638 = arg0.getX();
            class86.field2037 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method580(int arg0) {
        field1945++;
        class68.field1724 = 0;
        int var1 = (class46.field1244.field3000 >> 7) + class66.field1686;
        int var2 = (class46.field1244.field2939 >> 7) + class77.field1905;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class68.field1724 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class68.field1724 = 1;
        }
        if (arg0 != -3157) {
            field1953 = null;
        }
        if (class68.field1724 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class68.field1724 = 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class83.field1986 != null) {
            class38.field1047 = 0;
            class137.field3208 = 0;
        }
        field1949++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1940++;
        if (class83.field1986 != null) {
            class137.field3208 = 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1944++;
        if (class83.field1986 != null) {
            class38.field1047 = 0;
            class88.field2042 = arg0.getX();
            class95.field2210 = arg0.getY();
            class10.field244 = class55.method430(0);
            if (arg0.isMetaDown()) {
                class72.field1802 = 2;
                class137.field3208 = 2;
            } else {
                class72.field1802 = 1;
                class137.field3208 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method581(int arg0) {
        if (arg0 != -23232) {
            return;
        }
        field1930++;
        while (true) {
            class103 var1 = class73.field1821;
            class91 var2;
            synchronized (class73.field1821) {
                var2 = (class91) class31.field916.method708(arg0 + 23232);
            }
            if (var2 == null) {
                return;
            }
            var2.field2118.method141(var2.field2133, false, (int) var2.field2228, (byte) 85, var2.field2123);
        }
    }

    @OriginalMember(owner = "client!ld", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1942++;
        if (class83.field1986 != null) {
            class38.field1047 = 0;
            class22.field638 = arg0.getX();
            class86.field2037 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ld", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class83.field1986 != null) {
            class38.field1047 = 0;
            class22.field638 = arg0.getX();
            class86.field2037 = arg0.getY();
        }
        field1950++;
    }

    @OriginalMember(owner = "client!ld", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1946++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method582(byte arg0) {
        field1938 = null;
        field1948 = null;
        field1931 = null;
        int var1 = 86 / ((arg0 + 81) / 37);
        field1929 = null;
        field1953 = null;
        field1943 = null;
        field1933 = null;
        field1937 = null;
    }

    @OriginalMember(owner = "client!ld", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1952++;
    }
}
