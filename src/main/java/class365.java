import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class365 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5196 = "flash1:";

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5195 = "glow1:";

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field5197 = 0;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field5202 = -1;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lof;")
    public static class421 field5209;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[S")
    public static short[] field5199;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIBIIIII)V", line = 7)
    public static final void method2330(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg6 && arg8 == arg9 && arg2 == arg3 && arg1 == arg7) {
            class288.method2026(arg8, -1, arg5, arg1, arg2, arg0);
        } else {
            int var10 = arg5;
            int var11 = arg8;
            int var12 = arg5 * 3;
            int var13 = arg8 * 3;
            int var14 = arg6 * 3;
            int var15 = arg9 * 3;
            int var16 = arg3 * 3;
            int var17 = arg7 * 3;
            int var18 = arg2 - var16 - (arg5 - var14);
            int var19 = arg1 + var15 - var17 - arg8;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = (var28 + var30 + var32 >> 12) + arg5;
                int var35 = (var31 + var33 + var29 >> 12) + arg8;
                class288.method2026(var11, -1, var10, var35, var34, arg0);
                var11 = var35;
                var10 = var34;
            }
        }
        field5203++;
        int var25 = -113 / ((arg4 - 91) / 32);
    }

    @OriginalMember(owner = "client!ui", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 93)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class193.field2851 != null) {
            class297.field4402 = -1;
        }
        field5207++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 108)
    public static final void method2331(int arg0, int arg1) {
        field5204++;
        class199.field2904.method104(arg0, (byte) -34);
        if (arg1 != -12267) {
            field5209 = null;
        }
        class450.field6534.method104(arg0, (byte) -34);
        class209.field3044.method104(arg0, (byte) -34);
        class306.field4467.method104(arg0, (byte) -34);
        class72.field1206.method104(arg0, (byte) -34);
    }

    @OriginalMember(owner = "client!ui", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 124)
    public final void focusGained(FocusEvent arg0) {
        field5206++;
    }

    @OriginalMember(owner = "client!ui", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 133)
    public final void keyTyped(KeyEvent arg0) {
        field5198++;
        if (class193.field2851 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class176.method1364(var2, true)) {
                int var3 = class397.field5849 + 1 & 0x7F;
                if (class157.field2401 != var3) {
                    class419.field6107[class397.field5849] = -1;
                    class122.field1936[class397.field5849] = var2;
                    class397.field5849 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lsr;III[Z)Z", line = 168)
    public static final boolean method2332(class135 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class50.field816 != class18.field262) {
            int var6 = class311.field4527[arg1].method809(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class126 var8 = class311.field4527[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method809(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method802(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method798(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILdp;)Ltg;", line = 207)
    public static final class294 method2333(int arg0, int arg1, int arg2, class174 arg3) {
        field5208++;
        class37 var4 = new class37(arg3.method1355(arg2, -12607, arg0));
        class294 var5 = new class294(arg2, var4.method322((byte) -34), var4.method322((byte) -34), var4.method278(-126), var4.method278(9), var4.method271((byte) 107) == 1, var4.method271((byte) 108));
        int var6 = var4.method271((byte) 113);
        for (int var7 = arg1; var7 < var6; var7++) {
            var5.field4369.method148((byte) 93, new class371(var4.method271((byte) 127), var4.method320((byte) -87), var4.method320((byte) -87), var4.method320((byte) -87), var4.method320((byte) -87), var4.method320((byte) -87), var4.method320((byte) -87), var4.method320((byte) -87), var4.method320((byte) -87)));
        }
        var5.method2062(12800);
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 234)
    public static void method2334(byte arg0) {
        field5196 = null;
        field5209 = null;
        field5195 = null;
        field5199 = null;
        if (arg0 != 50) {
            method2334((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ui", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 248)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class193.field2851 != null) {
            class356.field5062 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class50.field808.length) {
                var3 = class50.field808[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class297.field4402 >= 0 && var3 >= 0) {
                class107.field1766[class297.field4402] = var3;
                class297.field4402 = class297.field4402 + 1 & 0x7F;
                if (client.field3641 == class297.field4402) {
                    class297.field4402 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class397.field5849 + 1 & 0x7F;
                if (class157.field2401 != var4) {
                    class419.field6107[class397.field5849] = var3;
                    class122.field1936[class397.field5849] = '\u0000';
                    class397.field5849 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field5201++;
    }

    @OriginalMember(owner = "client!ui", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 307)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class193.field2851 != null) {
            class356.field5062 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class50.field808.length) {
                var3 = class50.field808[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class297.field4402 >= 0 && var3 >= 0) {
                class107.field1766[class297.field4402] = ~var3;
                class297.field4402 = class297.field4402 + 1 & 0x7F;
                if (client.field3641 == class297.field4402) {
                    class297.field4402 = -1;
                }
            }
        }
        field5200++;
        arg0.consume();
    }
}
