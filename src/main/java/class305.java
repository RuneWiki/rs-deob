import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class305 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5253 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[F")
    public static float[] field5250 = new float[4];

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field5263 = 0;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lna;")
    public static class26 field5254 = class69.method505("weiss:", (byte) -118);

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field5266 = 0;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field5261 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    public static int[] field5252;

    @OriginalMember(owner = "client!ug", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5269++;
        if (class94.field1539 != null) {
            class94.field1536 = 0;
            class23.field331 = arg0.getX();
            class313.field5352 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 20)
    public static final void method2138(byte arg0) {
        field5260++;
        class69 var1 = (class69) class98.field1595.method264(-81);
        int var2 = -37 / ((-arg0 - 21) / 48);
        while (var1 != null) {
            if (var1.field1077 > 0) {
                var1.field1077--;
            }
            if (var1.field1077 != 0) {
                if (var1.field1079 > 0) {
                    var1.field1079--;
                }
                if (var1.field1079 == 0 && var1.field1082 >= 1 && var1.field1066 >= 1 && var1.field1082 <= 102 && var1.field1066 <= 102 && (var1.field1083 < 0 || class57.method418((byte) -34, var1.field1083, var1.field1080))) {
                    class153.method1038(var1.field1083, var1.field1082, var1.field1068, var1.field1074, var1.field1066, -65, var1.field1080, var1.field1081);
                    var1.field1079 = -1;
                    if (var1.field1083 == var1.field1072 && var1.field1072 == -1) {
                        var1.method1006(-1024);
                    } else if (var1.field1083 == var1.field1072 && var1.field1075 == var1.field1074 && var1.field1080 == var1.field1071) {
                        var1.method1006(-1024);
                    }
                }
            } else if (var1.field1072 < 0 || class57.method418((byte) -66, var1.field1072, var1.field1071)) {
                class153.method1038(var1.field1072, var1.field1082, var1.field1068, var1.field1075, var1.field1066, -71, var1.field1071, var1.field1081);
                var1.method1006(-1024);
            }
            var1 = (class69) class98.field1595.method263(4);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 77)
    public static void method2139(boolean arg0) {
        field5254 = null;
        field5252 = null;
        if (!arg0) {
            field5252 = (int[]) null;
        }
        field5250 = null;
    }

    @OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 99)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class94.field1539 != null) {
            class300.field5175 = 0;
        }
        field5262++;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 110)
    public static final void method2140(byte arg0) {
        class151.field2373.method1986((byte) -105);
        if (arg0 >= 84) {
            field5258++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 123)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class94.field1539 != null) {
            class94.field1536 = 0;
            class23.field331 = arg0.getX();
            class313.field5352 = arg0.getY();
        }
        field5267++;
    }

    @OriginalMember(owner = "client!ug", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 142)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5257++;
        if (class94.field1539 != null) {
            class94.field1536 = 0;
            class300.field5175 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 180)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5265++;
    }

    @OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 191)
    public final void focusGained(FocusEvent arg0) {
        field5270++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 199)
    public static final void method2141(int arg0) {
        if (class94.field1539 != null) {
            class305 var1 = class94.field1539;
            synchronized (class94.field1539) {
                class94.field1539 = null;
            }
        }
        if (arg0 == 8) {
            field5268++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 217)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class94.field1539 != null) {
            class94.field1536 = 0;
            class236.field3745 = arg0.getX();
            class110.field1756 = arg0.getY();
            class319.field5488 = class128.method869((byte) -55);
            if (arg0.isMetaDown()) {
                class109.field1733 = 2;
                class300.field5175 = 2;
            } else {
                class109.field1733 = 1;
                class300.field5175 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5251++;
    }

    @OriginalMember(owner = "client!ug", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 264)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5249++;
        if (class94.field1539 != null) {
            class94.field1536 = 0;
            class23.field331 = -1;
            class313.field5352 = -1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V", line = 308)
    public static final void method2142(int arg0, int arg1) {
        field5259++;
        if (class86.field1421 == null || class86.field1421.length < arg0) {
            class86.field1421 = new int[arg0];
        }
        if (arg1 != 4) {
            field5264 = -75;
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 331)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5271++;
        if (class94.field1539 != null) {
            class94.field1536 = 0;
            class23.field331 = arg0.getX();
            class313.field5352 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V", line = 350)
    public static final void method2143(int arg0, byte arg1) {
        if (arg1 != -47) {
            field5254 = (class26) null;
        }
        field5255++;
        class120 var2 = class293.method2059(4, 9, arg0);
        var2.method823(true);
    }
}
