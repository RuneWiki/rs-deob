import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class225 extends class276 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!er", name = "s", descriptor = "[Z")
    private boolean[] field3125 = new boolean[112];

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Z")
    public static boolean field3117 = false;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Lbg;")
    private class375 field3119;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "Lbg;")
    private class375 field3133;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "Lbg;")
    private class375 field3137;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field3118;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lvg;IIB)V")
    public static final void method1471(class108 arg0, int arg1, int arg2, byte arg3) {
        field3120++;
        class1.field10 = arg0;
        if (arg3 > -9) {
            field3117 = true;
        }
        class80.field1122 = arg2;
        class71.field996 = arg1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
    public static final void method1472(int arg0, int arg1, int arg2) {
        field3130++;
        class26 var3 = class217.method1445(true, arg2, 7);
        var3.method158(28194);
        if (arg0 <= 71) {
            field3117 = true;
        }
        var3.field341 = arg1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(CIZI)V")
    private final void method1473(char arg0, int arg1, boolean arg2, int arg3) {
        field3132++;
        if (!arg2) {
            return;
        }
        class375 var5 = new class375();
        var5.field5203 = arg3;
        var5.field5215 = arg0;
        var5.field5217 = arg1;
        var5.field5214 = class199.method1372(30938);
        if (this.field3133 == null) {
            this.field3137 = var5;
        } else {
            this.field3133.field5207 = var5;
        }
        this.field3133 = var5;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Z")
    public final boolean method1474(int arg0, int arg1) {
        field3116++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 != -20986) {
                this.field3118 = null;
            }
            return this.field3125[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(B)V")
    private final void method1475(byte arg0) {
        field3134++;
        if (arg0 != 124) {
            this.field3119 = null;
        }
        if (this.field3118 == null) {
            return;
        }
        this.field3118.removeKeyListener(this);
        this.field3118.removeFocusListener(this);
        this.field3118 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3125[var2] = false;
        }
        this.field3137 = null;
        this.field3119 = null;
        this.field3133 = null;
    }

    @OriginalMember(owner = "client!er", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3122++;
        this.method1481(arg0, 1, (byte) 76);
    }

    @OriginalMember(owner = "client!er", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1481(arg0, 0, (byte) 116);
        field3123++;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
    public final void method1476(int arg0) {
        field3135++;
        this.method1475((byte) 124);
        if (arg0 != -18020) {
            method1482(123, -114, (byte) -114, -2, -17, -103, 40);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1477(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)Lmb;")
    public final class260 method1478(byte arg0) {
        field3121++;
        if (arg0 != -75) {
            return null;
        }
        class375 var2;
        for (var2 = this.field3119; var2 != null && var2.field5217 == -1; var2 = var2.field5207) {
        }
        if (var2 == null) {
            this.field3119 = null;
        } else {
            this.field3119 = var2.field5207;
        }
        return var2;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public final synchronized void method1479(byte arg0) {
        field3127++;
        int var2 = 66 % ((arg0 - 69) / 44);
        for (class375 var3 = this.field3137; var3 != null; var3 = var3.field5207) {
            if (var3.field5217 == 0) {
                if (var3.field5203 >= 0) {
                    var3.field5209 = !this.field3125[var3.field5203];
                }
                this.field3125[var3.field5203] = true;
            } else if (var3.field5217 == 1) {
                this.field3125[var3.field5203] = false;
            } else if (var3.field5217 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    this.field3125[var4] = false;
                }
            }
        }
        this.field3119 = this.field3137;
        this.field3137 = null;
        this.field3133 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method1480(byte arg0, Component arg1) {
        field3128++;
        this.method1475((byte) 124);
        this.field3118 = arg1;
        if (arg0 != -34) {
            this.keyPressed((KeyEvent) null);
        }
        Method var3 = class76.field1095;
        if (var3 != null) {
            try {
                var3.invoke(this.field3118, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3118.addKeyListener(this);
        this.field3118.addFocusListener(this);
    }

    @OriginalMember(owner = "client!er", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3129++;
        char var2 = arg0.getKeyChar();
        if (var2 == '\u0000') {
            var2 = '\u0000';
        }
        if (var2 > '\u0000' && class210.method1410(var2, 0)) {
            this.method1473(var2, 2, true, -1);
        }
    }

    @OriginalMember(owner = "client!er", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3136++;
    }

    @OriginalMember(owner = "client!er", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3124++;
        this.method1473('\u0000', -1, true, 0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
    private final void method1481(KeyEvent arg0, int arg1, byte arg2) {
        field3131++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class294.field3993.length) {
            int var5 = class294.field3993[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 > 0) {
            this.method1473('\u0000', arg1, true, var6);
        }
        if (arg2 < 71) {
            this.method1474(-127, -45);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1482(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class231.method1508((byte) 44, arg5);
        field3126++;
        int var7 = 0;
        int var8 = arg5 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class83.field1157[arg6];
        int var16 = arg4 - var8;
        class149.method1112(arg1, var16, 8, arg4 - arg5, var15);
        int var17 = arg4 + var8;
        class149.method1112(arg3, var17, arg2 ^ 0xFFFFFF9C, var16, var15);
        class149.method1112(arg1, arg4 + arg5, 8, var17, var15);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class1.field1[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class83.field1157[arg6 + var9];
                    int[] var19 = class83.field1157[arg6 - var9];
                    int var20 = arg4 + var7;
                    int var21 = arg4 - var7;
                    class149.method1112(arg1, var20, 8, var21, var18);
                    class149.method1112(arg1, var20, 8, var21, var19);
                } else {
                    int[] var22 = class83.field1157[arg6 + var9];
                    int[] var23 = class83.field1157[arg6 - var9];
                    int var24 = class1.field1[var9];
                    int var25 = arg4 + var7;
                    int var26 = arg4 - var7;
                    int var27 = arg4 + var24;
                    int var28 = arg4 - var24;
                    class149.method1112(arg1, var28, 8, var26, var22);
                    class149.method1112(arg3, var27, 8, var28, var22);
                    class149.method1112(arg1, var25, arg2 + 116, var27, var22);
                    class149.method1112(arg1, var28, 8, var26, var23);
                    class149.method1112(arg3, var27, arg2 ^ 0xFFFFFF9C, var28, var23);
                    class149.method1112(arg1, var25, arg2 + 116, var27, var23);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class83.field1157[arg6 + var7];
            int[] var30 = class83.field1157[arg6 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var8 <= var7) {
                class149.method1112(arg1, var31, 8, var32, var29);
                class149.method1112(arg1, var31, arg2 ^ 0xFFFFFF9C, var32, var30);
            } else {
                int var33 = var7 <= var11 ? var11 : class1.field1[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class149.method1112(arg1, var35, 8, var32, var29);
                class149.method1112(arg3, var34, 8, var35, var29);
                class149.method1112(arg1, var31, 8, var34, var29);
                class149.method1112(arg1, var35, arg2 ^ 0xFFFFFF9C, var32, var30);
                class149.method1112(arg3, var34, arg2 + 116, var35, var30);
                class149.method1112(arg1, var31, arg2 + 116, var34, var30);
            }
        }
        if (arg2 != -108) {
            field3117 = false;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class225(Component arg0) {
        class383.method2367(false);
        this.method1480((byte) -34, arg0);
    }
}
