import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3131 = 0;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lhe;")
    public static class54 field3141 = class6.method58("blinken3:", false);

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lhe;")
    private static class54 field3144 = class6.method58("Existing User", false);

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Lhe;")
    public static class54 field3146 = field3144;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[I")
    public static int[] field3148 = new int[] { 4, 10, 4, 0, 0, 2, 0, 0, 4, 6, 0, 0, 0, 0, 0, 6, 2, 4, 0, 0, 0, 0, 0, -1, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 6, 0, 3, 5, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, -2, 0, 2, 0, -2, 0, 0, 6, 0, 0, 0, 5, 0, 0, -1, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 11, 0, 0, 0, -1, 0, 0, 0, 5, 6, 10, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 4, 0, 0, 4, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 2, 6, 0, 0, 1, 0, 0, 6, 0, 2, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 0, 6, 7, 0, 0, 0, 0, 0, -2, 0, 0, 0, 15, 0, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 3, 7, 14, 0, 0, 0, 0, 6, 3, 0, 0, 0, 0, 0, 0, -2, 0, 12, 0 };

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field3147 = 0;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static final void method1066(byte arg0) {
        class137 var1 = class149.field3357;
        synchronized (class149.field3357) {
            class22.field620 = class80.field1957;
            if (arg0 != 72) {
                field3146 = null;
            }
            class71.field1772 = class56.field1410;
            class7.field211 = class4.field132;
            class124.field2854 = class102.field2547;
            class71.field1763 = class139.field3185;
            class21.field582 = class65.field1574;
            class123.field2838 = class15.field462;
            class102.field2547 = 0;
        }
        field3132++;
    }

    @OriginalMember(owner = "client!te", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3137++;
    }

    @OriginalMember(owner = "client!te", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class149.field3357 != null) {
            class80.field1957 = 0;
        }
        field3149++;
    }

    @OriginalMember(owner = "client!te", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class149.field3357 != null) {
            class3.field45 = 0;
            class80.field1957 = 0;
        }
        field3134++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!te", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3138++;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public static void method1067(byte arg0) {
        field3148 = null;
        field3141 = null;
        field3146 = null;
        if (arg0 == -7) {
            field3144 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class149.field3357 != null) {
            class3.field45 = 0;
            class56.field1410 = arg0.getX();
            class4.field132 = arg0.getY();
        }
        field3143++;
    }

    @OriginalMember(owner = "client!te", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class149.field3357 != null) {
            class3.field45 = 0;
            class139.field3185 = arg0.getX();
            class65.field1574 = arg0.getY();
            class15.field462 = class102.method801((byte) -42);
            if (arg0.isMetaDown()) {
                class102.field2547 = 2;
                class80.field1957 = 2;
            } else {
                class102.field2547 = 1;
                class80.field1957 = 1;
            }
        }
        field3133++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILef;IIZ)V")
    public static final void method1068(int arg0, int arg1, class35 arg2, int arg3, int arg4, boolean arg5) {
        class132.field2989 = arg4;
        field3135++;
        class134.field3046 = arg2;
        class52.field1255 = arg5;
        class83.field2051 = 1;
        class50.field1201 = arg3;
        if (arg1 != -2) {
            field3148 = null;
        }
        class75.field1865 = arg0;
        class40.field1049 = 10000;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILvb;BLm;)V")
    public static final void method1069(int arg0, class148 arg1, byte arg2, class83 arg3) {
        field3145++;
        class39 var4 = new class39();
        var4.field1000 = arg3.method638(0);
        var4.field1021 = arg3.method641((byte) 73);
        var4.field1024 = new class46[var4.field1000];
        var4.field1010 = new int[var4.field1000];
        var4.field1011 = new class46[var4.field1000];
        var4.field1013 = new int[var4.field1000];
        var4.field1009 = new byte[var4.field1000][][];
        var4.field1004 = new int[var4.field1000];
        if (arg2 != 20) {
            return;
        }
        for (int var5 = 0; var5 < var4.field1000; var5++) {
            try {
                int var6 = arg3.method638(arg2 ^ 0x14);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method634(arg2 + 61).method415(-10650));
                    String var18 = new String(arg3.method634(126).method415(arg2 - 10670));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method641((byte) 73);
                    }
                    var4.field1004[var5] = var6;
                    var4.field1013[var5] = var19;
                    var4.field1024[var5] = arg1.method1120((byte) -104, class34.method255(false, var17), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method634(arg2 ^ 0x7F).method415(-10650));
                    String var8 = new String(arg3.method634(arg2 + 71).method415(-10650));
                    int var9 = arg3.method638(arg2 - 20);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method634(102).method415(arg2 - 10670));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method641((byte) 73);
                            var12[var13] = new byte[var14];
                            arg3.method675(0, (byte) -121, var14, var12[var13]);
                        }
                    }
                    var4.field1004[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class34.method255(false, var10[var16]);
                    }
                    var4.field1011[var5] = arg1.method1119(var15, (byte) 122, var8, class34.method255(false, var7));
                    var4.field1009[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1010[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1010[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1010[var5] = -3;
            } catch (Exception var23) {
                var4.field1010[var5] = -4;
            } catch (Throwable var24) {
                var4.field1010[var5] = -5;
            }
        }
        class13.field358.method976(var4, (byte) -125);
    }

    @OriginalMember(owner = "client!te", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class149.field3357 != null) {
            class3.field45 = 0;
            class56.field1410 = arg0.getX();
            class4.field132 = arg0.getY();
        }
        field3142++;
    }

    @OriginalMember(owner = "client!te", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3140++;
        if (class149.field3357 != null) {
            class3.field45 = 0;
            class56.field1410 = -1;
            class4.field132 = -1;
        }
    }

    @OriginalMember(owner = "client!te", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class149.field3357 != null) {
            class3.field45 = 0;
            class56.field1410 = arg0.getX();
            class4.field132 = arg0.getY();
        }
        field3139++;
    }
}
