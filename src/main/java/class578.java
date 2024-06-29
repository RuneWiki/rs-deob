import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class578 extends class656 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lki;")
    private class364 field7875 = new class364();

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lki;")
    private class364 field7879 = new class364();

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "[Z")
    private boolean[] field7886 = new boolean[112];

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lra;")
    public static class361 field7874 = new class361(116, -2);

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "[F")
    public static float[] field7878 = new float[4];

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "Z")
    public static boolean field7883 = false;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "[C")
    public static char[] field7885 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field7882;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field7887;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3178(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 3)
    public static final void method3166(int arg0) {
        field7873++;
        int var1 = class230.field3069.method2393(-30727);
        boolean var2 = class230.field3069.method2396(86) == 1;
        int var3 = class230.field3069.method2396(-111);
        int var4 = class230.field3069.method2399(true);
        class105.field1383 = class230.field3069.method2363(-124);
        class445.method2520((byte) 77);
        class487.method2674((byte) 124, var3);
        class230.field3069.method2846(true);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class611.field8258 >> 3; var20++) {
                for (int var21 = 0; var21 < class656.field9155 >> 3; var21++) {
                    int var22 = class230.field3069.method2845(1, 8);
                    if (var22 == 1) {
                        class325.field4211[var5][var20][var21] = class230.field3069.method2845(26, 8);
                    } else {
                        class325.field4211[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class230.field3069.method2837((byte) 76);
        int var6 = (class88.field1169 - class230.field3069.field5367) / 16;
        class206.field2667 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class206.field2667[var7][var19] = class230.field3069.method2355(95);
            }
        }
        class545.field7072 = null;
        class594.field8029 = new byte[var6][];
        class515.field6753 = new int[var6];
        class229.field3047 = new byte[var6][];
        class124.field1607 = new byte[var6][];
        class266.field3568 = new int[var6];
        class547.field7096 = new int[var6];
        class602.field8103 = new int[var6];
        class441.field5704 = new int[var6];
        class117.field1507 = new byte[var6][];
        class214.field2754 = null;
        int var8 = 0;
        if (arg0 > -77) {
            field7883 = true;
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class611.field8258 >> 3; var10++) {
                for (int var11 = 0; var11 < (class656.field9155 >> 3); var11++) {
                    int var12 = class325.field4211[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class547.field7096[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class547.field7096[var8] = var15;
                            int var17 = (var15 & 0xFFA0) >> 8;
                            int var18 = var15 & 0xFF;
                            class266.field3568[var8] = class277.field3630.method3359("m" + var17 + "_" + var18, (byte) -113);
                            class515.field6753[var8] = class277.field3630.method3359("l" + var17 + "_" + var18, (byte) -117);
                            class602.field8103[var8] = class277.field3630.method3359("um" + var17 + "_" + var18, (byte) -110);
                            class441.field5704[var8] = class277.field3630.method3359("ul" + var17 + "_" + var18, (byte) -116);
                            var8++;
                        }
                    }
                }
            }
        }
        class512.method2759(11, var4, var1, (byte) 125, var2);
    }

    @OriginalMember(owner = "client!pd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field7870++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class666.method3643(var2, 0)) {
            this.method3175(-1, var2, 8250, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 170)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method3175(0, '\u0000', 8250, -1);
        field7876++;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 178)
    public static final void method3167(int arg0) {
        if (class688.field9413.field1841) {
            class331.field4308 = 96;
        } else {
            try {
                Method var1 = (field7887 == null ? (field7887 = method3178("java.lang.Runtime")) : field7887).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class331.field4308 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        }
        int var4 = -85 / ((-arg0 - 37) / 59);
        field7866++;
    }

    @OriginalMember(owner = "client!pd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 211)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field7884++;
        this.method3170(false, 1, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 219)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method3170(false, 0, arg0);
        field7867++;
    }

    @OriginalMember(owner = "client!pd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 227)
    public final void focusGained(FocusEvent arg0) {
        field7864++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Z", line = 234)
    public final boolean method3168(int arg0, int arg1) {
        field7871++;
        if (arg0 == 256) {
            return arg1 >= 0 && arg1 < 112 ? this.field7886[arg1] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I", line = 249)
    private final int method3169(int arg0) {
        field7863++;
        int var2 = 0;
        if (this.field7886[81]) {
            var2 |= 0x1;
        }
        if (this.field7886[82]) {
            var2 |= 0x4;
        }
        if (this.field7886[86]) {
            var2 |= 0x2;
        }
        if (arg0 != 2279) {
            this.method3174(-99);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZILjava/awt/event/KeyEvent;)V", line = 274)
    private final void method3170(boolean arg0, int arg1, KeyEvent arg2) {
        if (arg0) {
            return;
        }
        field7862++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class503.field6622.length > var4) {
            int var5 = class503.field6622[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method3175(var6, '\u0000', 8250, arg1);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 312)
    public final void method3171(int arg0) {
        field7880++;
        if (arg0 != 34) {
            this.field7886 = null;
        }
        this.method3173((byte) 108);
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V", line = 323)
    public static void method3172(int arg0) {
        field7878 = null;
        if (arg0 != 338) {
            field7874 = null;
        }
        field7885 = null;
        field7874 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 340)
    private final void method3173(byte arg0) {
        field7881++;
        if (this.field7882 == null) {
            return;
        }
        this.field7882.removeKeyListener(this);
        this.field7882.removeFocusListener(this);
        this.field7882 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field7886[var2] = false;
        }
        if (arg0 < 106) {
            field7874 = null;
        }
        this.field7875.method2085((byte) 9);
        this.field7879.method2085((byte) 9);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 373)
    public final synchronized void method3174(int arg0) {
        this.field7875.method2085((byte) 9);
        field7869++;
        if (arg0 != 3760) {
            method3166(47);
        }
        for (class40 var2 = (class40) this.field7879.method2092((byte) 92); var2 != null; var2 = (class40) this.field7879.method2092((byte) 92)) {
            var2.field570 = this.method3169(2279);
            if (var2.field566 == 0) {
                if (!this.field7886[var2.field567]) {
                    class40 var3 = new class40();
                    var3.field564 = var2.field564;
                    var3.field570 = var2.field570;
                    var3.field567 = var2.field567;
                    var3.field566 = 0;
                    var3.field562 = '\u0000';
                    this.field7875.method2087(var3, -107);
                    this.field7886[var2.field567] = true;
                }
                var2.field566 = 2;
                this.field7875.method2087(var2, arg0 ^ 0xEFB);
            } else if (var2.field566 == 1) {
                if (this.field7886[var2.field567]) {
                    this.field7875.method2087(var2, arg0 - 3884);
                    this.field7886[var2.field567] = false;
                }
            } else if (var2.field566 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field7886[var4]) {
                        class40 var5 = new class40();
                        var5.field567 = var4;
                        var5.field570 = var2.field570;
                        var5.field566 = 1;
                        var5.field562 = '\u0000';
                        var5.field564 = var2.field564;
                        this.field7875.method2087(var5, -113);
                        this.field7886[var4] = false;
                    }
                }
            } else if (var2.field566 == 3) {
                this.field7875.method2087(var2, 118);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ICII)V", line = 465)
    private final void method3175(int arg0, char arg1, int arg2, int arg3) {
        field7877++;
        class40 var5 = new class40();
        var5.field567 = arg0;
        if (arg2 != 8250) {
            this.method3170(false, 39, null);
        }
        var5.field566 = arg3;
        var5.field562 = arg1;
        var5.field564 = class584.method3191(1);
        this.field7879.method2087(var5, 74);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 546)
    public class578(Component arg0) {
        class57.method501((byte) 93);
        this.method3176(arg0, 26931);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 487)
    private final void method3176(Component arg0, int arg1) {
        this.method3173((byte) 114);
        field7865++;
        this.field7882 = arg0;
        if (arg1 != 26931) {
            field7878 = null;
        }
        Method var3 = class140.field1840;
        if (var3 != null) {
            try {
                var3.invoke(this.field7882, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field7882.addKeyListener(this);
        this.field7882.addFocusListener(this);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Lvr;", line = 517)
    public final class409 method3177(byte arg0) {
        if (arg0 <= 65) {
            return null;
        } else {
            field7872++;
            return (class409) this.field7875.method2092((byte) 92);
        }
    }
}
