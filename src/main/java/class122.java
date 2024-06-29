import java.awt.Canvas;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class122 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3040 = -1;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3033 = -1;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lcb;")
    public static class15 field3038 = new class15(50);

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "La;")
    private static class1 field3047 = class113.method934(-11538, " is already on your friend list");

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "La;")
    public static class1 field3048 = field3047;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[Ljd;")
    public static class58[] field3049 = new class58[1000];

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "La;")
    private static class1 field3046 = class113.method934(-11538, "wave2:");

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field3053 = 0;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field3055 = 78;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "La;")
    public static class1 field3054 = class113.method934(-11538, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "La;")
    public static class1 field3057 = field3046;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "J")
    public static long field3039;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "J")
    public static long field3050;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3052;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "[[[B")
    public static byte[][][] field3056;

    @OriginalMember(owner = "client!ub", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3044++;
        if (class54.field1415 != null) {
            class92.field2296 = 0;
            class23.field711 = arg0.getX();
            class15.field497 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ub", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 21)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3034++;
        if (class54.field1415 != null) {
            class92.field2296 = 0;
            class23.field711 = -1;
            class15.field497 = -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 42)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class54.field1415 != null) {
            class15.field495 = 0;
        }
        field3042++;
    }

    @OriginalMember(owner = "client!ub", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 58)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class54.field1415 != null) {
            class92.field2296 = 0;
            class23.field711 = arg0.getX();
            class15.field497 = arg0.getY();
        }
        field3037++;
    }

    @OriginalMember(owner = "client!ub", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 75)
    public final void focusGained(FocusEvent arg0) {
        field3041++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 85)
    public static void method994(boolean arg0) {
        field3054 = null;
        field3049 = null;
        field3048 = null;
        if (!arg0) {
            method996(null, null, 31);
        }
        field3046 = null;
        field3038 = null;
        field3052 = null;
        field3047 = null;
        field3057 = null;
        field3056 = null;
    }

    @OriginalMember(owner = "client!ub", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 108)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class54.field1415 != null) {
            class92.field2296 = 0;
            class108.field2714 = arg0.getX();
            class97.field2399 = arg0.getY();
            class34.field920 = class103.method872(1);
            if (arg0.isMetaDown()) {
                class80.field2020 = 2;
                class15.field495 = 2;
            } else {
                class80.field2020 = 1;
                class15.field495 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3036++;
    }

    @OriginalMember(owner = "client!ub", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 143)
    public final void mouseClicked(MouseEvent arg0) {
        field3031++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ub", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 159)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3032++;
        if (class54.field1415 != null) {
            class92.field2296 = 0;
            class23.field711 = arg0.getX();
            class15.field497 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 194)
    public static final void method995(int arg0) {
        field3043++;
        if (class32.field858 != 0) {
            return;
        }
        if (arg0 > -60) {
            field3053 = -90;
        }
        int var1 = field3053;
        if (client.field595 == 1 && class112.field2765 >= 516 && class1.field14 >= 160 && class112.field2765 <= 765 && class1.field14 <= 205) {
            var1 = 0;
        }
        if (!class6.field225) {
            if (var1 == 1 && class42.field1105 > 0) {
                int var2 = class79.field1935[class42.field1105 - 1];
                if (var2 == 53 || var2 == 25 || var2 == 55 || var2 == 48 || var2 == 24 || var2 == 52 || var2 == 6 || var2 == 31 || var2 == 43 || var2 == 11 || var2 == 19 || var2 == 1006) {
                    int var3 = class37.field995[class42.field1105 - 1];
                    int var4 = class117.field2928[class42.field1105 - 1];
                    class100 var5 = class134.method1056(var4, (byte) -58);
                    if (var5.field2512 || var5.field2532) {
                        class128.field3146 = class112.field2765;
                        class114.field2818 = false;
                        class32.field858 = 2;
                        class98.field2413 = var4;
                        class115.field2832 = class1.field14;
                        class113.field2779 = var3;
                        if (var4 >> 16 == class132.field3230) {
                            class32.field858 = 1;
                        }
                        if (var4 >> 16 == class86.field2169) {
                            class32.field858 = 3;
                        }
                        class8.field299 = 0;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class134.field3300 == 1 || class72.method679((byte) 46, class42.field1105 - 1)) && class42.field1105 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class42.field1105 > 0) {
                class63.method607(59, class42.field1105 - 1);
            }
            if (var1 == 2 && class42.field1105 > 0) {
                class118.method971(11451);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class24.field742;
            int var7 = class102.field2571;
            if (class19.field641 == 0) {
                var6 -= 4;
                var7 -= 4;
            }
            if (class19.field641 == 1) {
                var7 -= 205;
                var6 -= 553;
            }
            if (class19.field641 == 2) {
                var7 -= 357;
                var6 -= 17;
            }
            if (class37.field987 - 10 > var6 || class93.field2309 + class37.field987 + 10 < var6 || var7 < client.field580 - 10 || var7 > client.field580 + class5.field220 + 10) {
                if (class19.field641 == 1) {
                    class39.field1056 = true;
                }
                class6.field225 = false;
                if (class19.field641 == 2) {
                    class105.field2640 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class37.field987;
        int var9 = client.field580;
        int var10 = class93.field2309;
        int var11 = class112.field2765;
        int var12 = -1;
        int var13 = class1.field14;
        if (class19.field641 == 0) {
            var11 -= 4;
            var13 -= 4;
        }
        if (class19.field641 == 1) {
            var11 -= 553;
            var13 -= 205;
        }
        if (class19.field641 == 2) {
            var11 -= 17;
            var13 -= 357;
        }
        for (int var14 = 0; var14 < class42.field1105; var14++) {
            int var15 = (class42.field1105 - var14 - 1) * 15 + var9 + 31;
            if (var11 > var8 && var11 < var8 + var10 && var13 > var15 - 13 && var13 < var15 + 3) {
                var12 = var14;
            }
        }
        if (var12 != -1) {
            class63.method607(109, var12);
        }
        if (class19.field641 == 1) {
            class39.field1056 = true;
        }
        class6.field225 = false;
        if (class19.field641 != 2) {
            return;
        }
        class105.field2640 = true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Llc;Ljava/awt/Component;I)Lb;", line = 375)
    public static final class7 method996(class69 arg0, Component arg1, int arg2) {
        if (arg2 != 29914) {
            field3056 = null;
        }
        class134.method1053(arg1, 0, arg0);
        class7 var3 = new class7();
        class14.method262(var3, -125);
        field3030++;
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 396)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3045++;
        if (class54.field1415 != null) {
            class92.field2296 = 0;
            class15.field495 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
