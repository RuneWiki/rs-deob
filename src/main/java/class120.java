import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class120 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2901 = 3353893;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[I")
    public static int[] field2895 = new int[25];

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lu;")
    public static class135 field2904 = class87.method676((byte) -83, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field2908 = 2;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field2912 = 20;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lu;")
    private static class135 field2914 = class87.method676((byte) -55, " has logged in)3");

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lu;")
    public static class135 field2913 = field2914;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lu;")
    public static class135 field2897 = class87.method676((byte) -115, "Fps:");

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lre;")
    public static class122 field2903;

    @OriginalMember(owner = "client!rc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class131.field3158 != null) {
            class148.field3701 = 0;
            class37.field845 = -1;
            class12.field272 = -1;
        }
        field2896++;
    }

    @OriginalMember(owner = "client!rc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2911++;
        if (class131.field3158 != null) {
            class148.field3701 = 0;
            class37.field845 = arg0.getX();
            class12.field272 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class131.field3158 != null) {
            class148.field3701 = 0;
            class37.field845 = arg0.getX();
            class12.field272 = arg0.getY();
        }
        field2910++;
    }

    @OriginalMember(owner = "client!rc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class131.field3158 != null) {
            class148.field3701 = 0;
            class37.field845 = arg0.getX();
            class12.field272 = arg0.getY();
        }
        field2902++;
    }

    @OriginalMember(owner = "client!rc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2909++;
        if (class131.field3158 != null) {
            class148.field3701 = 0;
            class128.field3083 = arg0.getX();
            class106.field2550 = arg0.getY();
            class104.field2503 = class14.method95(11);
            if (arg0.isMetaDown()) {
                class21.field501 = 2;
                class152.field3739 = 2;
            } else {
                class21.field501 = 1;
                class152.field3739 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2905++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLve;Lu;)Lu;")
    public static final class135 method956(boolean arg0, class146 arg1, class135 arg2) {
        if (arg0) {
            return null;
        }
        field2898++;
        if (arg2.method1090((byte) 64, class40.field922) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method1090((byte) 64, class9.field211);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method1090((byte) 64, class50.field1184);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method1090((byte) 64, class23.field582);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method1090((byte) 64, class65.field1641);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method1090((byte) 64, class83.field1964);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method1090((byte) 64, class136.field3290);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class135 var9 = class113.field2742;
                                                    if (class22.field546 != null) {
                                                        var9 = class84.method655(true, class22.field546.field1594);
                                                        try {
                                                            if (class22.field546.field1596 != null) {
                                                                byte[] var10 = ((String) class22.field546.field1596).getBytes("ISO-8859-1");
                                                                var9 = class98.method801(var10, 22060, var10.length, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class107.method867(2, new class135[] { arg2.method1074(0, var8, -27090), var9, arg2.method1065((byte) -56, var8 + 4) });
                                                }
                                            }
                                            arg2 = class107.method867(2, new class135[] { arg2.method1074(0, var7, -27090), class119.method938(class141.method1142(arg1, 4, -16647), 0), arg2.method1065((byte) -48, var7 + 2) });
                                        }
                                    }
                                    arg2 = class107.method867(2, new class135[] { arg2.method1074(0, var6, -27090), class119.method938(class141.method1142(arg1, 3, -16647), 0), arg2.method1065((byte) -74, var6 + 2) });
                                }
                            }
                            arg2 = class107.method867(2, new class135[] { arg2.method1074(0, var5, -27090), class119.method938(class141.method1142(arg1, 2, -16647), 0), arg2.method1065((byte) -108, var5 + 2) });
                        }
                    }
                    arg2 = class107.method867(2, new class135[] { arg2.method1074(0, var4, -27090), class119.method938(class141.method1142(arg1, 1, -16647), 0), arg2.method1065((byte) -61, var4 + 2) });
                }
            }
            arg2 = class107.method867(2, new class135[] { arg2.method1074(0, var3, -27090), class119.method938(class141.method1142(arg1, 0, -16647), 0), arg2.method1065((byte) -40, var3 + 2) });
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
    public static final void method957(int arg0, byte arg1) {
        if (arg1 > -12) {
            method958(78);
        }
        field2899++;
        class69 var2 = (class69) class103.field2490.method842((long) arg0, 123);
        if (var2 != null) {
            var2.method302(4071);
        }
    }

    @OriginalMember(owner = "client!rc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2906++;
        if (class131.field3158 != null) {
            class148.field3701 = 0;
            class152.field3739 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        field2903 = null;
        field2895 = null;
        int var1 = 9 % ((-arg0 - 5) / 36);
        field2897 = null;
        field2914 = null;
        field2904 = null;
        field2913 = null;
    }

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2907++;
    }

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class131.field3158 != null) {
            class152.field3739 = 0;
        }
        field2900++;
    }
}
