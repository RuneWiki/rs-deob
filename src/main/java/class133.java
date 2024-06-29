import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class133 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lid;")
    private static class60 field3014 = class11.method72("Free world", (byte) -52);

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Lid;")
    public static class60 field3029 = class11.method72("Fertigkeit)2", (byte) 102);

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lid;")
    private static class60 field3021 = class11.method72("Loaded interfaces", (byte) -118);

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "[Lpb;")
    public static class106[] field3030 = new class106[4];

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lid;")
    public static class60 field3013 = field3021;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lid;")
    public static class60 field3026 = field3014;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Lqd;")
    public static class115 field3032 = new class115(128);

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lid;")
    public static class60 field3034 = class11.method72("m-Ochte mit Ihnen handeln)3", (byte) 127);

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "Z")
    public static boolean field3037 = false;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[I")
    public static int[] field3036 = new int[256];

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "Lid;")
    public static class60 field3038;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "[[I")
    public static int[][] field3039;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "Lid;")
    public static class60 field3040;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[I")
    public static int[] field3042;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "Luf;")
    public static class145 field3041;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Lid;")
    private static class60 field3045;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "Lid;")
    public static class60 field3043;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Lid;")
    public static class60 field3046;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lic;")
    public static class59 field3035;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lq;")
    public static final class111 method1049(int arg0, int arg1) {
        field3022++;
        class111 var2 = (class111) class124.field2866.method918(95, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class19.field467.method473((byte) 121, arg1, arg0);
        class111 var4 = new class111();
        if (var3 != null) {
            var4.method898(new class103(var3), 4096);
        }
        class124.field2866.method914(var4, (long) arg0, (byte) 80);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3017++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILef;)V")
    public static final void method1050(int arg0, class35 arg1) {
        field3020++;
        if (arg0 != -12385) {
            field3034 = null;
        }
        if (arg1.field859 == 0) {
            return;
        }
        if (arg1.field807 != -1 && arg1.field807 < 32768) {
            class53 var2 = class5.field83[arg1.field807];
            if (var2 != null) {
                int var3 = arg1.field854 - var2.field854;
                int var4 = arg1.field828 - var2.field828;
                if (var3 != 0 || var4 != 0) {
                    arg1.field822 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field807 >= 32768) {
            int var5 = arg1.field807 - 32768;
            if (class140.field3197 == var5) {
                var5 = 2047;
            }
            class1 var6 = class81.field2016[var5];
            if (var6 != null) {
                int var7 = arg1.field854 - var6.field854;
                int var8 = arg1.field828 - var6.field828;
                if (var7 != 0 || var8 != 0) {
                    arg1.field822 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field887 != 0 || arg1.field848 != 0) && (arg1.field843 == 0 || arg1.field836 > 0)) {
            int var9 = arg1.field828 - (arg1.field848 - class144.field3240 - class144.field3240) * 64;
            int var10 = arg1.field854 - (arg1.field887 - class41.field1095 - class41.field1095) * 64;
            if (var10 != 0 || var9 != 0) {
                arg1.field822 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg1.field848 = 0;
            arg1.field887 = 0;
        }
        int var11 = arg1.field822 - arg1.field864 & 0x7FF;
        if (var11 == 0) {
            arg1.field823 = 0;
            return;
        }
        arg1.field823++;
        if (var11 > 1024) {
            arg1.field864 -= arg1.field859;
            boolean var12 = true;
            if (var11 < arg1.field859 || 2048 - arg1.field859 < var11) {
                arg1.field864 = arg1.field822;
                var12 = false;
            }
            if (arg1.field875 == arg1.field832 && (arg1.field823 > 25 || var12)) {
                if (arg1.field816 == -1) {
                    arg1.field875 = arg1.field871;
                } else {
                    arg1.field875 = arg1.field816;
                }
            }
        } else {
            arg1.field864 += arg1.field859;
            boolean var13 = true;
            if (arg1.field859 > var11 || 2048 - arg1.field859 < var11) {
                arg1.field864 = arg1.field822;
                var13 = false;
            }
            if (arg1.field875 == arg1.field832 && (arg1.field823 > 25 || var13)) {
                if (arg1.field810 == -1) {
                    arg1.field875 = arg1.field871;
                } else {
                    arg1.field875 = arg1.field810;
                }
            }
        }
        arg1.field864 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static void method1051(boolean arg0) {
        field3039 = null;
        field3032 = null;
        field3021 = null;
        field3026 = null;
        field3045 = null;
        field3043 = null;
        field3030 = null;
        field3046 = null;
        field3029 = null;
        field3040 = null;
        field3014 = null;
        field3034 = null;
        field3041 = null;
        field3036 = null;
        field3042 = null;
        field3035 = null;
        field3013 = null;
        field3038 = null;
        if (arg0) {
            field3013 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3025++;
        if (class145.field3268 != null) {
            class32.field753 = 0;
            class120.field2754 = -1;
            class19.field462 = -1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class145.field3268 != null) {
            class136.field3084 = 0;
        }
        field3033++;
    }

    @OriginalMember(owner = "client!ta", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3031++;
        if (class145.field3268 != null) {
            class32.field753 = 0;
            class87.field2173 = arg0.getX();
            class61.field1536 = arg0.getY();
            class136.field3085 = class39.method307(8);
            if (arg0.isMetaDown()) {
                class45.field1189 = 2;
                class136.field3084 = 2;
            } else {
                class45.field1189 = 1;
                class136.field3084 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ta", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3018++;
        if (class145.field3268 != null) {
            class32.field753 = 0;
            class136.field3084 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ta", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class145.field3268 != null) {
            class32.field753 = 0;
            class120.field2754 = arg0.getX();
            class19.field462 = arg0.getY();
        }
        field3015++;
    }

    @OriginalMember(owner = "client!ta", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3016++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILid;)Z")
    public static final boolean method1052(int arg0, class60 arg1) {
        field3011++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class103.field2502; var2++) {
            if (arg1.method426(class67.field1639[var2], (byte) 37)) {
                return true;
            }
        }
        if (arg0 != 12560) {
            field3013 = null;
        }
        return arg1.method426(class107.field2640.field21, (byte) 37);
    }

    @OriginalMember(owner = "client!ta", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class145.field3268 != null) {
            class32.field753 = 0;
            class120.field2754 = arg0.getX();
            class19.field462 = arg0.getY();
        }
        field3028++;
    }

    @OriginalMember(owner = "client!ta", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3024++;
        if (class145.field3268 != null) {
            class32.field753 = 0;
            class120.field2754 = arg0.getX();
            class19.field462 = arg0.getY();
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3036[var0] = var1;
        }
        field3038 = class11.method72("<img=0>", (byte) -98);
        field3039 = new int[5][5000];
        field3040 = class11.method72("Schlie-8en", (byte) -119);
        field3042 = new int[50];
        field3041 = new class145();
        field3045 = class11.method72("Loading wordpack )2 ", (byte) 114);
        field3043 = field3045;
        field3044 = 0;
        field3046 = class11.method72(")3", (byte) -24);
    }
}
