import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class269 extends class420 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "Lws;")
    private class333 field3408 = new class333();

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "Lws;")
    private class333 field3414 = new class333();

    @OriginalMember(owner = "client!jfa", name = "C", descriptor = "[Z")
    private boolean[] field3417 = new boolean[112];

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lffa;")
    public static class174 field3394 = new class174(128);

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3410 = new BigInteger("b10f43c90b04f222de60a23d3d923dc957324bd33fdff6d8ae8b54859b0e6baa640c45bf425d0562bc03a4667608651cc5576ba020a4985502a91635c8b94145", 16);

    @OriginalMember(owner = "client!jfa", name = "A", descriptor = "Lcga;")
    public static class449 field3415 = new class449(75, -1);

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!jfa", name = "x", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!jfa", name = "y", descriptor = "J")
    public static long field3413;

    @OriginalMember(owner = "client!jfa", name = "D", descriptor = "Ljava/awt/Component;")
    private Component field3418;

    @OriginalMember(owner = "client!jfa", name = "B", descriptor = "[I")
    public static int[] field3416;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V", line = 3)
    public final synchronized void method1591(int arg0) {
        this.field3408.method1913((byte) 86);
        field3406++;
        class102 var2 = (class102) this.field3414.method1906(81);
        if (arg0 < 26) {
            return;
        }
        while (var2 != null) {
            var2.field1306 = this.method1602(false);
            if (var2.field1305 == 0) {
                if (!this.field3417[var2.field1299]) {
                    class102 var5 = new class102();
                    var5.field1303 = '\u0000';
                    var5.field1306 = var2.field1306;
                    var5.field1302 = var2.field1302;
                    var5.field1299 = var2.field1299;
                    var5.field1305 = 0;
                    this.field3408.method1904(var5, -101);
                    this.field3417[var2.field1299] = true;
                }
                var2.field1305 = 2;
                this.field3408.method1904(var2, -67);
            } else if (var2.field1305 == 1) {
                if (this.field3417[var2.field1299]) {
                    this.field3408.method1904(var2, -84);
                    this.field3417[var2.field1299] = false;
                }
            } else if (var2.field1305 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field3417[var3]) {
                        class102 var4 = new class102();
                        var4.field1306 = var2.field1306;
                        var4.field1299 = var3;
                        var4.field1303 = '\u0000';
                        var4.field1305 = 1;
                        var4.field1302 = var2.field1302;
                        this.field3408.method1904(var4, -30);
                        this.field3417[var3] = false;
                    }
                }
            } else if (var2.field1305 == 3) {
                this.field3408.method1904(var2, -24);
            }
            var2 = (class102) this.field3414.method1906(51);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)Z", line = 95)
    public final boolean method1592(byte arg0, int arg1) {
        if (arg0 != -120) {
            field3416 = null;
        }
        field3395++;
        return arg1 >= 0 && arg1 < 112 ? this.field3417[arg1] : false;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)Lfs;", line = 109)
    public final class521 method1593(int arg0) {
        field3411++;
        if (arg0 != 7) {
            this.keyPressed(null);
        }
        return (class521) this.field3408.method1906(106);
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V", line = 126)
    private final void method1594(byte arg0) {
        if (arg0 != -122) {
            field3416 = null;
        }
        field3404++;
        if (this.field3418 == null) {
            return;
        }
        this.field3418.removeKeyListener(this);
        this.field3418.removeFocusListener(this);
        this.field3418 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3417[var2] = false;
        }
        this.field3408.method1913((byte) 124);
        this.field3414.method1913((byte) 59);
    }

    @OriginalMember(owner = "client!jfa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1600(0, -102, arg0);
        field3409++;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIII)V", line = 163)
    public static final void method1595(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1588775720) {
            method1596(null, -58, 108, 93);
        }
        field3398++;
        int var4 = class611.field8310.field8684 * arg0 >> 8;
        if (var4 != 0 && arg2 != -1) {
            class571.method3024(arg2, 0, false, var4, class391.field5005, -144);
            class89.field1160 = true;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 185)
    public static final String method1596(byte[] arg0, int arg1, int arg2, int arg3) {
        field3401++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = arg1 + arg2;
        if (arg3 != -129) {
            return null;
        }
        for (int var7 = arg1; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 >= 224) {
                if (var8 >= 240) {
                    if (var8 < 244) {
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                }
                if (var7 + 2 >= var6) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg0[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var7++;
                int var10 = arg0[var7] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class364.method2113(class109.method762(var10, -129), class364.method2113(class109.method762(var8, -225) << 12, class109.method762(var9, -129) << 6));
            } else if ((var7 + 1) < var6) {
                var7++;
                int var11 = arg0[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class364.method2113(class109.method762(var11, -129), class109.method762(var8 << 6, -12352));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(CIII)V", line = 260)
    private final void method1597(char arg0, int arg1, int arg2, int arg3) {
        field3407++;
        class102 var5 = new class102();
        var5.field1299 = arg2;
        var5.field1305 = arg3;
        if (arg1 != -15390) {
            field3394 = null;
        }
        var5.field1303 = arg0;
        var5.field1302 = class321.method1854(-128);
        this.field3414.method1904(var5, -32);
    }

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)V", line = 277)
    public static void method1598(int arg0) {
        if (arg0 < 93) {
            field3394 = null;
        }
        field3415 = null;
        field3410 = null;
        field3394 = null;
        field3416 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 290)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3402++;
        this.method1600(1, 70, arg0);
    }

    @OriginalMember(owner = "client!jfa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 302)
    public final void focusGained(FocusEvent arg0) {
        field3393++;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 310)
    private final void method1599(Component arg0, int arg1) {
        this.method1594((byte) -122);
        field3403++;
        this.field3418 = arg0;
        Method var3 = class476.field5906;
        if (arg1 != 0) {
            this.focusLost(null);
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field3418, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3418.addKeyListener(this);
        this.field3418.addFocusListener(this);
    }

    @OriginalMember(owner = "client!jfa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 335)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3396++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class374.method2163(var2, false)) {
            this.method1597(var2, -15390, -1, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V", line = 352)
    private final void method1600(int arg0, int arg1, KeyEvent arg2) {
        field3412++;
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class555.field6938.length > var4) {
            int var6 = class555.field6938[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        int var7 = 77 / ((-arg1 - 3) / 60);
        if (var5 != 0) {
            this.method1597('\u0000', -15390, var5, arg0);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!jfa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 386)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1597('\u0000', -15390, 0, -1);
        field3405++;
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 455)
    public class269(Component arg0) {
        class637.method3567((byte) -125);
        this.method1599(arg0, 0);
    }

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "(I)V", line = 401)
    public final void method1601(int arg0) {
        this.method1594((byte) -122);
        if (arg0 == 4096) {
            field3400++;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)I", line = 413)
    private final int method1602(boolean arg0) {
        field3397++;
        int var2 = 0;
        if (this.field3417[81]) {
            var2 |= 0x1;
        }
        if (this.field3417[82]) {
            var2 |= 0x4;
        }
        if (arg0) {
            return -102;
        } else {
            if (this.field3417[86]) {
                var2 |= 0x2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lpfa;BLe;)V", line = 464)
    public static final void method1603(class275 arg0, byte arg1, class498 arg2) {
        class474.field5870 = arg2;
        class563.field7029 = arg0;
        if (arg1 <= -26) {
            field3399++;
        }
    }
}
