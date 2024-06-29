import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class33 extends class140 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lv;")
    private class165 field312 = new class165();

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "Lv;")
    private class165 field328 = new class165();

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "[Z")
    private boolean[] field330 = new boolean[112];

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "[I")
    public static int[] field319 = new int[2];

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "Ljava/util/Random;")
    public static Random field321 = new Random();

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "Ljn;")
    public static class134 field332 = new class134(118, 1);

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "Ljava/awt/Component;")
    private Component field331;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 9)
    public final void method267(int arg0) {
        this.method277(-62);
        field324++;
        if (arg0 >= -2) {
            field319 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 20)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field318++;
        this.method271((byte) -9, arg0, 1);
    }

    @OriginalMember(owner = "client!bo", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 28)
    public final synchronized void focusLost(FocusEvent arg0) {
        field310++;
        this.method268('\u0000', 0, (byte) 123, -1);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(CIBI)V", line = 36)
    private final void method268(char arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 123) {
            this.method273(-116, 116);
        }
        field320++;
        class104 var5 = new class104();
        var5.field1203 = arg1;
        var5.field1194 = arg0;
        var5.field1204 = arg3;
        var5.field1196 = class683.method3903((byte) 4);
        this.field328.method1039(var5, 0);
    }

    @OriginalMember(owner = "client!bo", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 53)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field316++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class206.method1319(0, var2)) {
            this.method268(var2, -1, (byte) 123, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)I", line = 68)
    private final int method269(int arg0) {
        field326++;
        int var2 = 0;
        if (this.field330[81]) {
            var2 |= 0x1;
        }
        if (arg0 != 18287) {
            return -92;
        }
        if (this.field330[82]) {
            var2 |= 0x4;
        }
        if (this.field330[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 92)
    public final synchronized void method270(int arg0) {
        this.field312.method1046((byte) 126);
        field314++;
        if (arg0 != 684998560) {
            this.field312 = null;
        }
        for (class104 var2 = (class104) this.field328.method1034(20791); var2 != null; var2 = (class104) this.field328.method1034(20791)) {
            var2.field1195 = this.method269(18287);
            if (var2.field1204 == 0) {
                if (!this.field330[var2.field1203]) {
                    class104 var5 = new class104();
                    var5.field1194 = '\u0000';
                    var5.field1195 = var2.field1195;
                    var5.field1196 = var2.field1196;
                    var5.field1204 = 0;
                    var5.field1203 = var2.field1203;
                    this.field312.method1039(var5, 0);
                    this.field330[var2.field1203] = true;
                }
                var2.field1204 = 2;
                this.field312.method1039(var2, 0);
            } else if (var2.field1204 == 1) {
                if (this.field330[var2.field1203]) {
                    this.field312.method1039(var2, 0);
                    this.field330[var2.field1203] = false;
                }
            } else if (var2.field1204 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field330[var3]) {
                        class104 var4 = new class104();
                        var4.field1194 = '\u0000';
                        var4.field1196 = var2.field1196;
                        var4.field1203 = var3;
                        var4.field1204 = 1;
                        var4.field1195 = var2.field1195;
                        this.field312.method1039(var4, 0);
                        this.field330[var3] = false;
                    }
                }
            } else if (var2.field1204 == 3) {
                this.field312.method1039(var2, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;I)V", line = 184)
    private final void method271(byte arg0, KeyEvent arg1, int arg2) {
        field322++;
        int var4 = arg1.getKeyCode();
        if (arg0 != -9) {
            this.method273(-25, 64);
        }
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class510.field6927.length > var4) {
            int var6 = class510.field6927[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method268('\u0000', var5, (byte) 123, arg2);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 380)
    public class33(Component arg0) {
        class728.method4048(57);
        this.method275(arg0, -128);
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Loj;", line = 227)
    public final class659 method272(byte arg0) {
        field311++;
        if (arg0 != 17) {
            this.field312 = null;
        }
        return (class659) this.field312.method1034(arg0 ^ 0x5126);
    }

    @OriginalMember(owner = "client!bo", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 240)
    public final void focusGained(FocusEvent arg0) {
        field313++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Z", line = 251)
    public final boolean method273(int arg0, int arg1) {
        field329++;
        if (arg0 >= 0 && arg0 < 112) {
            if (arg1 != Integer.MAX_VALUE) {
                method274(-119);
            }
            return this.field330[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V", line = 265)
    public static void method274(int arg0) {
        field319 = null;
        field332 = null;
        if (arg0 != -21336) {
            field319 = null;
        }
        field321 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 284)
    private final void method275(Component arg0, int arg1) {
        this.method277(-58);
        field323++;
        if (arg1 > -10) {
            return;
        }
        this.field331 = arg0;
        Method var3 = class768.field10555;
        if (var3 != null) {
            try {
                var3.invoke(this.field331, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field331.addKeyListener(this);
        this.field331.addFocusListener(this);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILtja;ZILka;I)V", line = 313)
    public static final void method276(int arg0, class491 arg1, boolean arg2, int arg3, class231 arg4, int arg5) {
        field327++;
        if (arg2) {
            method278(2L, true);
        }
        if (arg4 != null) {
            arg1.method2901(arg3, arg4.method1544(), arg5, arg4.method1566(), arg4.method1567(), 7418, arg4.method1576(), arg4.method1537(), arg4.method1577(), arg4.method1583(), arg0);
        }
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 327)
    private final void method277(int arg0) {
        field325++;
        if (this.field331 == null) {
            return;
        }
        this.field331.removeKeyListener(this);
        this.field331.removeFocusListener(this);
        this.field331 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field330[var2] = false;
        }
        int var3 = 95 % ((arg0 + 3) / 45);
        this.field312.method1046((byte) 125);
        this.field328.method1046((byte) 125);
    }

    @OriginalMember(owner = "client!bo", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 357)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method271((byte) -9, arg0, 0);
        field317++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(JZ)I", line = 369)
    public static final int method278(long arg0, boolean arg1) {
        if (arg1) {
            field332 = null;
        }
        class324.method2052(72, arg0);
        field315++;
        return class448.field6277.get(1);
    }
}
