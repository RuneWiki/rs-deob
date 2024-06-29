import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class190 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field3351 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lsc;")
    public static class181 field3348 = class149.method967(255, "leuchten3:");

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lsc;")
    public static class181 field3362 = null;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
    public static int[] field3352 = new int[200];

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Z")
    public static boolean field3356 = false;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lbe;")
    public static class218 field3353;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[Ltg;")
    public static class107[] field3350;

    @OriginalMember(owner = "client!ob", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3354++;
        if (class2.field57 != null) {
            class195.field3406 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class61.field939.length) {
                var3 = class61.field939[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class59.field894 >= 0 && var3 >= 0) {
                class198.field3445[class59.field894] = ~var3;
                class59.field894 = class59.field894 + 1 & 0x7F;
                if (class59.field894 == class194.field3399) {
                    class59.field894 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method1315(int arg0) {
        if (arg0 != -3) {
            field3350 = null;
        }
        field3350 = null;
        field3352 = null;
        field3362 = null;
        field3348 = null;
        field3353 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static final void method1316(boolean arg0) {
        field3358++;
        if ((class108.field1775 > class22.field388)) {
            class22.field388 = (float) ((double) class22.field388 / 30.0D + (double) class22.field388);
            if (class108.field1775 < class22.field388) {
                class22.field388 = class108.field1775;
            }
            class25.method218(126);
        } else if (class22.field388 > class108.field1775) {
            class22.field388 = (float) ((double) class22.field388 - (double) class22.field388 / 30.0D);
            if (class22.field388 < class108.field1775) {
                class22.field388 = class108.field1775;
            }
            class25.method218(124);
        }
        if (class98.field1584 != -1 && class76.field1222 != -1) {
            int var1 = class98.field1584 - class152.field2537;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class152.field2537 += var1;
            int var2 = class76.field1222 - class203.field3489;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class98.field1584 = -1;
                class76.field1222 = -1;
            }
            class203.field3489 += var2;
            class25.method218(124);
        }
        if (!arg0) {
            method1317(55, -48, -11, 68, -110, (byte) 92, 20);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1317(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field3360++;
        if (arg5 != -14) {
            field3352 = null;
        }
        int var7 = class144.method931(-88, class125.field2056, class23.field408, arg6);
        int var8 = class144.method931(94, class125.field2056, class23.field408, arg2);
        int var9 = class144.method931(104, class124.field2032, class11.field219, arg0);
        int var10 = class144.method931(-103, class124.field2032, class11.field219, arg3);
        int var11 = class144.method931(94, class125.field2056, class23.field408, arg1 + arg6);
        int var12 = class144.method931(-15, class125.field2056, class23.field408, arg2 - arg1);
        for (int var13 = var7; var13 < var11; var13++) {
            class171.method1133(class149.field2507[var13], var9, arg4, var10, (byte) 126);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class171.method1133(class149.field2507[var14], var9, arg4, var10, (byte) 126);
        }
        int var15 = class144.method931(-19, class124.field2032, class11.field219, arg0 + arg1);
        int var16 = class144.method931(-50, class124.field2032, class11.field219, arg3 - arg1);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class149.field2507[var17];
            class171.method1133(var18, var9, arg4, var15, (byte) 125);
            class171.method1133(var18, var16, arg4, var10, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!ob", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class2.field57 != null) {
            class59.field894 = -1;
        }
        field3359++;
    }

    @OriginalMember(owner = "client!ob", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3357++;
    }

    @OriginalMember(owner = "client!ob", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3355++;
        if (class2.field57 != null) {
            int var2 = class86.method580(8364, arg0);
            if (var2 >= 0) {
                int var3 = class239.field4158 + 1 & 0x7F;
                if (class148.field2475 != var3) {
                    class259.field4519[class239.field4158] = -1;
                    class222.field3846[class239.field4158] = var2;
                    class239.field4158 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ob", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3349++;
        if (class2.field57 == null) {
            return;
        }
        class195.field3406 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class61.field939.length > var2) {
            var3 = class61.field939[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class59.field894 >= 0 && var3 >= 0) {
            class198.field3445[class59.field894] = var3;
            class59.field894 = class59.field894 + 1 & 0x7F;
            if (class59.field894 == class194.field3399) {
                class59.field894 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class239.field4158 + 1 & 0x7F;
            if (class148.field2475 != var4) {
                class259.field4519[class239.field4158] = var3;
                class222.field3846[class239.field4158] = -1;
                class239.field4158 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
