import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class624 extends class89 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "Lau;")
    private class692 field8897 = new class692();

    @OriginalMember(owner = "client!kaa", name = "A", descriptor = "Lau;")
    private class692 field8901 = new class692();

    @OriginalMember(owner = "client!kaa", name = "G", descriptor = "[Z")
    private boolean[] field8906 = new boolean[112];

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "Leda;")
    public static class116 field8887 = new class116(38, -2);

    @OriginalMember(owner = "client!kaa", name = "x", descriptor = "Lmo;")
    public static class482 field8898 = new class482(32);

    @OriginalMember(owner = "client!kaa", name = "D", descriptor = "Lvh;")
    public static class125 field8903 = new class125(49, 1);

    @OriginalMember(owner = "client!kaa", name = "E", descriptor = "F")
    public static float field8904;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!kaa", name = "t", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!kaa", name = "v", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!kaa", name = "y", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!kaa", name = "B", descriptor = "Lok;")
    public static class229 field8902;

    @OriginalMember(owner = "client!kaa", name = "F", descriptor = "Ljava/awt/Component;")
    private Component field8905;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BIIIZII)Z", line = 3)
    public static final boolean method3517(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field8888++;
        int var7 = arg2 % arg5;
        if (arg4) {
            field8887 = null;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg3 + arg5 - 1) / arg5);
        int var10 = -((arg5 + arg2 - 1) / arg5);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg6] == 0) {
                    return true;
                }
                arg6 += arg5;
            }
            int var13 = arg6 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[FIIIIFIII)V", line = 52)
    public static final void method3518(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9) {
        int var10 = arg0 - arg7;
        int var11 = arg4 - arg3;
        field8882++;
        int var12 = arg8 - arg5;
        float var13 = arg1[2] * (float) var11 + arg1[0] * (float) var12 + arg1[1] * (float) var10;
        float var14 = arg1[5] * (float) var11 + arg1[3] * (float) var12 + arg1[4] * (float) var10;
        if (arg2 < 60) {
            method3523((byte) -111);
        }
        float var15 = arg1[8] * (float) var11 + arg1[7] * (float) var10 + arg1[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg6 + 0.5F;
        if (arg9 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg9 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg9 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class276.field3918 = var17;
        field8904 = var18;
    }

    @OriginalMember(owner = "client!kaa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 104)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field8900++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class640.method3600(true, var2)) {
            this.method3525(var2, -1, 80, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 118)
    private final void method3519(int arg0, Component arg1) {
        this.method3522(4);
        field8893++;
        this.field8905 = arg1;
        Method var3 = class705.field9982;
        if (var3 != null) {
            try {
                var3.invoke(this.field8905, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field8905.addKeyListener(this);
        this.field8905.addFocusListener(this);
        if (arg0 <= 7) {
            this.focusGained(null);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 145)
    public final void focusGained(FocusEvent arg0) {
        field8894++;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIIBII)V", line = 153)
    public static final void method3520(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field8892++;
        if (arg0 == arg4) {
            class77.method608(arg6, arg2, arg0, arg5 ^ 0x27E31127, arg7, arg1, arg3);
            return;
        }
        if (class512.field7620 <= (arg6 - arg0) && arg0 + arg6 <= class94.field1398 && class198.field3084 <= (arg1 - arg4) && (arg1 + arg4) <= class627.field8931) {
            class260.method1646(arg3, arg2, arg7, arg0, arg1, arg4, arg6, (byte) 4);
        } else {
            class648.method3637(arg2, arg3, arg0, arg7, arg1, arg4, arg6, 252019426);
        }
        if (arg5 != -23) {
            method3523((byte) -23);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)I", line = 178)
    private final int method3521(int arg0) {
        field8896++;
        int var2 = 0;
        if (arg0 >= -69) {
            return -18;
        }
        if (this.field8906[81]) {
            var2 |= 0x1;
        }
        if (this.field8906[82]) {
            var2 |= 0x4;
        }
        if (this.field8906[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kaa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 203)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method3526(128, 1, arg0);
        field8880++;
    }

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "(I)V", line = 212)
    private final void method3522(int arg0) {
        field8881++;
        if (this.field8905 == null) {
            return;
        }
        if (arg0 != 4) {
            this.method3522(24);
        }
        this.field8905.removeKeyListener(this);
        this.field8905.removeFocusListener(this);
        this.field8905 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field8906[var2] = false;
        }
        this.field8897.method3896(3);
        this.field8901.method3896(arg0 - 1);
    }

    @OriginalMember(owner = "client!kaa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 239)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method3526(128, 0, arg0);
        field8889++;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Lri;", line = 247)
    public final class414 method666(byte arg0) {
        field8885++;
        if (arg0 <= 9) {
            this.field8897 = null;
        }
        return (class414) this.field8897.method3906(0);
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)V", line = 259)
    public static final void method3523(byte arg0) {
        class696.method3918(class525.field7713.field5988, (byte) 92);
        field8884++;
        int var1 = (class551.field8078 >> 12) + (class143.field2474 >> 3);
        class416.field5926 = class103.field1708.field3158 = 0;
        int var2 = (class322.field4478 >> 12) + (class63.field917 >> 3);
        class103.field1708.method1699(8, false, 8);
        byte var3 = 18;
        class204.field3165 = new int[var3];
        class113.field1805 = new byte[var3][];
        class556.field8139 = new byte[var3][];
        class223.field3352 = new int[var3];
        class648.field9181 = new byte[var3][];
        class623.field8876 = new int[var3];
        class221.field3306 = new int[var3];
        class436.field6271 = new byte[var3][];
        class500.field7433 = new int[var3][4];
        class297.field4200 = new int[var3];
        class395.field5713 = new byte[var3][];
        class694.field9865 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class430.field6136 >> 4)) / 8; var5 <= (var1 + (class430.field6136 >> 4)) / 8; var5++) {
            for (int var8 = (var2 - (class580.field8504 >> 4)) / 8; var8 <= ((class580.field8504 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class221.field3306[var4] = var9;
                class297.field4200[var4] = class466.field6733.method2083(2, "m" + var5 + "_" + var8);
                class623.field8876[var4] = class466.field6733.method2083(2, "l" + var5 + "_" + var8);
                class223.field3352[var4] = class466.field6733.method2083(2, "n" + var5 + "_" + var8);
                class204.field3165[var4] = class466.field6733.method2083(2, "um" + var5 + "_" + var8);
                class694.field9865[var4] = class466.field6733.method2083(2, "ul" + var5 + "_" + var8);
                if (class223.field3352[var4] == -1) {
                    class297.field4200[var4] = -1;
                    class623.field8876[var4] = -1;
                    class204.field3165[var4] = -1;
                    class694.field9865[var4] = -1;
                }
                var4++;
            }
        }
        if (arg0 < 85) {
            return;
        }
        for (int var6 = var4; var6 < class223.field3352.length; var6++) {
            class223.field3352[var6] = -1;
            class297.field4200[var6] = -1;
            class623.field8876[var6] = -1;
            class204.field3165[var6] = -1;
            class694.field9865[var6] = -1;
        }
        byte var7;
        if (class515.field7636 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class613.method3465(false, var7, false, var2, var1);
    }

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "(I)V", line = 344)
    public static void method3524(int arg0) {
        if (arg0 >= 102) {
            field8887 = null;
            field8898 = null;
            field8902 = null;
            field8903 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V", line = 357)
    public final synchronized void method669(byte arg0) {
        this.field8897.method3896(3);
        field8891++;
        for (class703 var2 = (class703) this.field8901.method3906(0); var2 != null; var2 = (class703) this.field8901.method3906(0)) {
            var2.field9942 = this.method3521(arg0 - 195);
            if (var2.field9944 == 0) {
                if (!this.field8906[var2.field9948]) {
                    class703 var5 = new class703();
                    var5.field9938 = '\u0000';
                    var5.field9942 = var2.field9942;
                    var5.field9948 = var2.field9948;
                    var5.field9944 = 0;
                    var5.field9937 = var2.field9937;
                    this.field8897.method3904(var5, 0);
                    this.field8906[var2.field9948] = true;
                }
                var2.field9944 = 2;
                this.field8897.method3904(var2, 0);
            } else if (var2.field9944 == 1) {
                if (this.field8906[var2.field9948]) {
                    this.field8897.method3904(var2, 0);
                    this.field8906[var2.field9948] = false;
                }
            } else if (var2.field9944 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field8906[var3]) {
                        class703 var4 = new class703();
                        var4.field9938 = '\u0000';
                        var4.field9944 = 1;
                        var4.field9937 = var2.field9937;
                        var4.field9942 = var2.field9942;
                        var4.field9948 = var3;
                        this.field8897.method3904(var4, 0);
                        this.field8906[var3] = false;
                    }
                }
            } else if (var2.field9944 == 3) {
                this.field8897.method3904(var2, 0);
            }
        }
        if (arg0 != 68) {
            this.method666((byte) -124);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(CIII)V", line = 457)
    private final void method3525(char arg0, int arg1, int arg2, int arg3) {
        field8886++;
        class703 var5 = new class703();
        var5.field9938 = arg0;
        var5.field9944 = arg3;
        var5.field9948 = arg1;
        if (arg2 <= 69) {
            method3520(126, -45, -113, -79, 111, (byte) -125, -79, -30);
        }
        var5.field9937 = class254.method1619(true);
        this.field8901.method3904(var5, 0);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)Z", line = 479)
    public final boolean method668(int arg0, int arg1) {
        field8883++;
        if (arg0 > -38) {
            this.method669((byte) -71);
        }
        return arg1 >= 0 && arg1 < 112 ? this.field8906[arg1] : false;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V", line = 497)
    public final void method664(int arg0) {
        this.method3522(4);
        field8890++;
        if (arg0 <= 42) {
            field8903 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 576)
    public class624(Component arg0) {
        class541.method3185(26);
        this.method3519(99, arg0);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V", line = 514)
    private final void method3526(int arg0, int arg1, KeyEvent arg2) {
        field8895++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class12.field146.length) {
            int var5 = class12.field146[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 == 0) {
            return;
        }
        this.method3525('\u0000', var6, 87, arg1);
        arg2.consume();
        if (arg0 != 128) {
            this.method669((byte) 24);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 551)
    public final synchronized void focusLost(FocusEvent arg0) {
        field8899++;
        this.method3525('\u0000', 0, 125, -1);
    }
}
