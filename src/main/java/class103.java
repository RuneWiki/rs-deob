import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class103 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2162 = 1;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field2163 = 3;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "[Lgd;")
    public static class60[] field2166 = new class60[5000];

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "[[[I")
    public static int[][][] field2171 = new int[4][105][105];

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lah;")
    public static class9 field2164;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIILkb;IJ)Z")
    public static final boolean method844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class92 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class106.method864(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ld", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class160.field3105 != null) {
            class154.field3024 = 0;
            class120.field2433 = arg0.getX();
            class83.field1769 = arg0.getY();
        }
        field2157++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        if (arg0 != 0) {
            field2163 = -52;
        }
        field2171 = null;
        field2166 = null;
        field2164 = null;
    }

    @OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class160.field3105 != null) {
            class31.field590 = 0;
        }
        field2172++;
    }

    @OriginalMember(owner = "client!ld", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2160++;
        if (class160.field3105 != null) {
            class154.field3024 = 0;
            class120.field2433 = -1;
            class83.field1769 = -1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2159++;
        if (class160.field3105 != null) {
            class154.field3024 = 0;
            class120.field2433 = arg0.getX();
            class83.field1769 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ld", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2173++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILve;)V")
    public static final void method846(int arg0, class194 arg1) {
        field2165++;
        if (class100.field2105 == 1) {
            short var2 = 280;
            if (class3.field29 >= var2 && var2 + 14 >= class3.field29 && class185.field3546 >= 4 && class185.field3546 <= 18) {
                class31.method276(-422071548, 0, 0);
                return;
            }
            if (class3.field29 >= var2 + 15 && class3.field29 <= var2 + 80 && class185.field3546 >= 4 && class185.field3546 <= 18) {
                class31.method276(-422071548, 1, 0);
                return;
            }
            short var3 = 390;
            if (class3.field29 >= var3 && var3 + 14 >= class3.field29 && class185.field3546 >= 4 && class185.field3546 <= 18) {
                class31.method276(-422071548, 0, 1);
                return;
            }
            if (class3.field29 >= var3 + 15 && class3.field29 <= var3 + 80 && class185.field3546 >= 4 && class185.field3546 <= 18) {
                class31.method276(-422071548, 1, 1);
                return;
            }
            short var4 = 500;
            if (var4 <= class3.field29 && class3.field29 <= var4 + 14 && class185.field3546 >= 4 && class185.field3546 <= 18) {
                class31.method276(-422071548, 0, 2);
                return;
            }
            if (var4 + 15 <= class3.field29 && var4 + 80 >= class3.field29 && class185.field3546 >= 4 && class185.field3546 <= 18) {
                class31.method276(-422071548, 1, 2);
                return;
            }
            short var5 = 610;
            if (class3.field29 >= var5 && var5 + 14 >= class3.field29 && class185.field3546 >= 4 && class185.field3546 <= 18) {
                class31.method276(-422071548, 0, 3);
                return;
            }
            if (class3.field29 >= var5 + 15 && var5 + 80 >= class3.field29 && class185.field3546 >= 4 && class185.field3546 <= 18) {
                class31.method276(-422071548, 1, 3);
                return;
            }
            if (class3.field29 >= 708 && class185.field3546 >= 4 && class3.field29 <= 758 && class185.field3546 <= 20) {
                class125.field2512 = false;
                class70.field1538.method429(0, 0);
                class19.field377.method429(382, 0);
                class138.field2714.method327(382 - class138.field2714.field749 / 2, 18);
                return;
            }
            if (class118.field2393 != -1) {
                class149 var6 = class69.field1520[class118.field2393];
                if (class99.field2096 == var6.field2916) {
                    byte[] var7 = class5.method24(new class47[] { var6.field2923, class19.field380 }, (byte) 92).method410(9262);
                    class94.field1945 = new String(var7, 0, var7.length);
                    class125.field2512 = false;
                    if (class94.field1954 != 0) {
                        class94.field1954 = 0;
                        class27.field520 = 443;
                        class148.field2909 = 43594;
                        class85.field1800 = 43594;
                    }
                    class195.field3805 = var6.field2917;
                    class70.field1538.method429(0, 0);
                    class19.field377.method429(382, 0);
                    class138.field2714.method327(382 - class138.field2714.field749 / 2, 18);
                    return;
                }
                class47 var8 = class5.method24(new class47[] { class57.field1118, var6.field2923, class19.field380, class181.field3469, class12.field232, class167.method1133(class204.field4029 ? 1 : 0, (byte) -109), class149.field2924, class167.method1133(class161.field3129, (byte) -104), class195.field3794, class167.method1133(class52.field999, (byte) -103) }, (byte) 90);
                try {
                    arg1.getAppletContext().showDocument(var8.method384(127), "_self");
                } catch (Exception var9) {
                }
            }
        }
        if (arg0 >= -42) {
            field2166 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2168++;
    }

    @OriginalMember(owner = "client!ld", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2170++;
        if (class160.field3105 != null) {
            class154.field3024 = 0;
            class120.field2433 = arg0.getX();
            class83.field1769 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ld", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2169++;
        if (class160.field3105 != null) {
            class154.field3024 = 0;
            class141.field2757 = arg0.getX();
            class84.field1786 = arg0.getY();
            class99.field2099 = class201.method1313(29);
            if (arg0.isMetaDown()) {
                class178.field3406 = 2;
                class31.field590 = 2;
            } else {
                class178.field3406 = 1;
                class31.field590 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ld", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2158++;
        if (class160.field3105 != null) {
            class154.field3024 = 0;
            class31.field590 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
