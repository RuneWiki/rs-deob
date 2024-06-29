import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class209 extends class379 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "[Z")
    private boolean[] field3299 = new boolean[112];

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field3305 = 0;

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "[I")
    public static int[] field3312 = new int[500];

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "Z")
    public static volatile boolean field3318 = true;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "B")
    public static byte field3308;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "Ljm;")
    public static class297 field3313;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "Lrv;")
    private class41 field3297;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "Lrv;")
    private class41 field3303;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "Lrv;")
    private class41 field3310;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field3304;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "[[I")
    public static int[][] field3294;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
    public final void method1362(int arg0) {
        field3309++;
        this.method1368(-40);
        if (arg0 != -1) {
            this.field3304 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lza;I)V")
    public static final void method1363(class491 arg0, int arg1) {
        field3315++;
        arg0.method829(0, 0, class358.field5581, 350);
        arg0.method914(0, 0, class358.field5581, 350, class331.field5206 << 24 | 0x332277, 1);
        int var2 = arg1 / class479.field7067;
        if (class307.field4888 > 0) {
            int var3 = 342 - class479.field7067;
            int var4 = var2 * var3 / (class307.field4888 + var2 - 1);
            int var5 = 4;
            if (class307.field4888 > 1) {
                var5 += (var3 - var4) * (class307.field4888 - class265.field4425 - 1) / (class307.field4888 - 1);
            }
            arg0.method914(class358.field5581 - 16, var5, 12, var4, class331.field5206 << 24 | 0x332277, 2);
            for (int var6 = class265.field4425; var6 < class265.field4425 + var2 && class307.field4888 > var6; var6++) {
                String[] var7 = class241.method1661('\b', -20326, class383.field5913[var6]);
                int var8 = (class358.field5581 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method829(var10, 0, var8 + var10 - 8, 350);
                    class531.field7796.method1903(-16777216, var10, 350 - class442.field6599 - class136.field2303.field5202 - (2 - -((-class265.field4425 + var6) * class479.field7067)), arg1 ^ 0x15E, -1, var7[var9]);
                }
            }
        }
        arg0.method829(0, 0, class358.field5581, 350);
        arg0.method2865(-1, class358.field5581, 0, (byte) 87, 350 - class442.field6599);
        class127.field2188.method1903(-16777216, 10, 350 - class84.field1467.field5202 - 1, 0, -1, "--> " + class250.field4263);
        int var11 = -1;
        if (class504.field7348 % 30 > 15) {
            var11 = 16777215;
        }
        arg0.method2862(339 - class84.field1467.field5202, class84.field1467.method2085((byte) -91, "--> " + class250.field4263.substring(0, class158.field2549)) + 10, 12, var11, 102);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;B)V")
    private final void method1364(int arg0, KeyEvent arg1, byte arg2) {
        field3301++;
        if (arg2 != 63) {
            return;
        }
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class55.field882.length > var4) {
            int var5 = class55.field882[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method1372('\u0000', (byte) 52, arg0, var6);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!cq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3295++;
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
    public static void method1365(int arg0) {
        field3313 = null;
        field3294 = null;
        field3312 = null;
        int var1 = -70 % ((arg0 + 16) / 39);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method1366(byte arg0, Component arg1) {
        field3300++;
        this.method1368(-67);
        this.field3304 = arg1;
        int var3 = 45 % ((-arg0 - 13) / 49);
        Method var4 = class493.field7210;
        if (var4 != null) {
            try {
                var4.invoke(this.field3304, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field3304.addKeyListener(this);
        this.field3304.addFocusListener(this);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lpl;B)Ljava/lang/String;")
    public static final String method1367(class162 arg0, byte arg1) {
        field3296++;
        if (arg1 < 18) {
            method1365(108);
        }
        return arg0.field2572 == null || arg0.field2572.length() <= 0 ? arg0.field2566 : arg0.field2566 + class251.field4293.method1954(class300.field4813, -30366) + arg0.field2572;
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V")
    private final void method1368(int arg0) {
        field3319++;
        if (this.field3304 == null) {
            return;
        }
        this.field3304.removeKeyListener(this);
        int var2 = -2 / ((arg0 - 22) / 33);
        this.field3304.removeFocusListener(this);
        this.field3304 = null;
        for (int var3 = 0; var3 < 112; var3++) {
            this.field3299[var3] = false;
        }
        this.field3310 = null;
        this.field3297 = null;
        this.field3303 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Z")
    public final boolean method1369(int arg0, int arg1) {
        field3302++;
        if (arg1 == 26) {
            return arg0 >= 0 && arg0 < 112 ? this.field3299[arg0] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3307++;
        this.method1372('\u0000', (byte) 52, -1, 0);
    }

    @OriginalMember(owner = "client!cq", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3317++;
        this.method1364(1, arg0, (byte) 63);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
    public final synchronized void method1370(boolean arg0) {
        field3298++;
        if (arg0) {
            field3313 = null;
        }
        for (class41 var2 = this.field3303; var2 != null; var2 = var2.field681) {
            if (var2.field674 == 0) {
                if (var2.field680 >= 0) {
                    var2.field679 = !this.field3299[var2.field680];
                }
                this.field3299[var2.field680] = true;
            } else if (var2.field674 == 1) {
                this.field3299[var2.field680] = false;
            } else if (var2.field674 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field3299[var3] = false;
                }
            }
        }
        this.field3310 = this.field3303;
        this.field3297 = null;
        this.field3303 = null;
    }

    @OriginalMember(owner = "client!cq", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3316++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class199.method1322(6428, var2)) {
            this.method1372(var2, (byte) 52, 2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Lhu;")
    public final class472 method1371(byte arg0) {
        field3311++;
        class41 var2 = this.field3310;
        int var3 = 120 % ((-arg0 - 71) / 55);
        while (var2 != null && var2.field674 == -1) {
            var2 = var2.field681;
        }
        if (var2 == null) {
            this.field3310 = null;
        } else {
            this.field3310 = var2.field681;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class209(Component arg0) {
        class307.method1957(4619);
        this.method1366((byte) -113, arg0);
    }

    @OriginalMember(owner = "client!cq", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3314++;
        this.method1364(0, arg0, (byte) 63);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(CBII)V")
    private final void method1372(char arg0, byte arg1, int arg2, int arg3) {
        field3306++;
        if (arg1 != 52) {
            return;
        }
        class41 var5 = new class41();
        var5.field684 = arg0;
        var5.field680 = arg3;
        var5.field674 = arg2;
        var5.field671 = class19.method91((byte) 109);
        if (this.field3297 == null) {
            this.field3303 = var5;
        } else {
            this.field3297.field681 = var5;
        }
        this.field3297 = var5;
    }
}
