import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class9 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field69 = new String[100];

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Ljava/lang/String;")
    public static String field80 = "Starting 3d Library";

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Llm;")
    public static class210 field76;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lea;")
    public static class235 field67;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lmg;")
    public static class61 field71;

    @OriginalMember(owner = "client!n", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 10)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class60.field796 != null) {
            class123.field1927 = -1;
        }
        field74++;
    }

    @OriginalMember(owner = "client!n", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 22)
    public final void keyTyped(KeyEvent arg0) {
        if (class60.field796 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class129.method957(var2, (byte) 58)) {
                int var3 = class200.field2989 + 1 & 0x7F;
                if (class205.field3084 != var3) {
                    class3.field5[class200.field2989] = -1;
                    class160.field2391[class200.field2989] = var2;
                    class200.field2989 = var3;
                }
            }
        }
        field77++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lfh;I)V", line = 51)
    public static final void method39(class286 arg0, int arg1) {
        field82++;
        if (arg1 != 6514) {
            field83 = -95;
        }
        class258.method1759(200000, arg0, 2778);
    }

    @OriginalMember(owner = "client!n", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 66)
    public final void focusGained(FocusEvent arg0) {
        field72++;
    }

    @OriginalMember(owner = "client!n", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 75)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field85++;
        if (class60.field796 != null) {
            class58.field743 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class226.field3444.length > var2) {
                var3 = class226.field3444[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class123.field1927 >= 0 && var3 >= 0) {
                class37.field452[class123.field1927] = ~var3;
                class123.field1927 = class123.field1927 + 1 & 0x7F;
                if (class126.field1982 == class123.field1927) {
                    class123.field1927 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([[FIII[[F[[FIIIII[[IBLjf;ZB)V", line = 111)
    public static final void method40(float[][] arg0, int arg1, int arg2, int arg3, float[][] arg4, float[][] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[][] arg11, byte arg12, class86 arg13, boolean arg14, byte arg15) {
        field81++;
        int var16 = (arg6 << 8) + 255;
        int var17 = (arg2 << 8) + 255;
        int var18 = (arg7 << 8) + 255;
        int[] var19 = null;
        int var20 = (arg9 << 8) + 255;
        int[] var21 = class120.field1877[arg15];
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, var21[var23 + var23], false, arg1, false, arg10, var20, var21[var23 + var23 + 1], var16, (int[][]) null, var18);
        }
        if (arg14) {
            if (arg15 == 1) {
                var19 = new int[6];
                int var25 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 64, false, arg1, true, arg10, var20, 128, var16, (int[][]) null, var18);
                int var26 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 128, false, arg1, true, arg10, var20, 64, var16, (int[][]) null, var18);
                var19[0] = var26;
                var19[3] = var25;
                var19[2] = var22[2];
                var19[4] = var22[0];
                var19[1] = var25;
                var19[5] = var22[2];
            } else if (arg15 == 2) {
                var19 = new int[6];
                int var42 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 128, false, arg1, true, arg10, var20, 128, var16, (int[][]) null, var18);
                int var43 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 64, false, arg1, true, arg10, var20, 0, var16, (int[][]) null, var18);
                var19[2] = var42;
                var19[3] = var42;
                var19[1] = var43;
                var19[0] = var22[0];
                var19[4] = var22[1];
                var19[5] = var22[0];
            } else if (arg15 == 3) {
                var19 = new int[6];
                int var27 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 0, false, arg1, true, arg10, var20, 128, var16, (int[][]) null, var18);
                int var28 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 64, false, arg1, true, arg10, var20, 0, var16, (int[][]) null, var18);
                var19[0] = var22[2];
                var19[3] = var27;
                var19[1] = var22[1];
                var19[2] = var27;
                var19[4] = var28;
                var19[5] = var22[2];
            } else if (arg15 == 4) {
                var19 = new int[3];
                int var41 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 0, false, arg1, true, arg10, var20, 128, var16, (int[][]) null, var18);
                var19[0] = var22[3];
                var19[2] = var22[0];
                var19[1] = var41;
            } else if (arg15 == 5) {
                var19 = new int[3];
                int var40 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 128, false, arg1, true, arg10, var20, 128, var16, (int[][]) null, var18);
                var19[1] = var40;
                var19[0] = var22[2];
                var19[2] = var22[3];
            } else if (arg15 == 6) {
                var19 = new int[6];
                int var29 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 128, false, arg1, true, arg10, var20, 0, var16, (int[][]) null, var18);
                int var30 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 128, false, arg1, true, arg10, var20, 128, var16, (int[][]) null, var18);
                var19[0] = var22[3];
                var19[3] = var30;
                var19[5] = var22[3];
                var19[2] = var30;
                var19[4] = var22[0];
                var19[1] = var29;
            } else if (arg15 == 7) {
                var19 = new int[6];
                int var31 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 0, false, arg1, true, arg10, var20, 128, var16, (int[][]) null, var18);
                int var32 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 128, false, arg1, true, arg10, var20, 0, var16, (int[][]) null, var18);
                var19[0] = var22[1];
                var19[2] = var31;
                var19[1] = var32;
                var19[5] = var22[1];
                var19[4] = var22[2];
                var19[3] = var31;
            } else if (arg15 == 8) {
                var19 = new int[3];
                int var39 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 0, false, arg1, true, arg10, var20, 0, var16, (int[][]) null, var18);
                var19[2] = var22[4];
                var19[1] = var39;
                var19[0] = var22[3];
            } else if (arg15 == 9) {
                var19 = new int[15];
                int var36 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 128, false, arg1, true, arg10, var20, 64, var16, (int[][]) null, var18);
                int var37 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 96, false, arg1, true, arg10, var20, 32, var16, (int[][]) null, var18);
                int var38 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 64, false, arg1, true, arg10, var20, 0, var16, (int[][]) null, var18);
                var19[6] = var37;
                var19[14] = var38;
                var19[1] = var36;
                var19[13] = var22[1];
                var19[3] = var37;
                var19[2] = var22[4];
                var19[12] = var37;
                var19[9] = var37;
                var19[5] = var22[3];
                var19[10] = var22[2];
                var19[7] = var22[3];
                var19[4] = var22[4];
                var19[8] = var22[2];
                var19[11] = var22[1];
                var19[0] = var37;
            } else if (arg15 == 10) {
                int var35 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 0, false, arg1, true, arg10, var20, 128, var16, (int[][]) null, var18);
                var19 = new int[] { var22[2], var35, var22[3], var22[3], var35, var22[4], var22[4], var35, var22[0] };
            } else if (arg15 == 11) {
                var19 = new int[12];
                int var33 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 0, false, arg1, true, arg10, var20, 64, var16, (int[][]) null, var18);
                int var34 = class37.method254(arg13, 0.0F, arg4, arg0, arg5, arg12, var17, arg11, 128, false, arg1, true, arg10, var20, 64, var16, (int[][]) null, var18);
                var19[8] = var33;
                var19[7] = var34;
                var19[1] = var33;
                var19[10] = var22[1];
                var19[5] = var33;
                var19[11] = var34;
                var19[0] = var22[3];
                var19[2] = var22[0];
                var19[3] = var22[3];
                var19[9] = var22[2];
                var19[4] = var22[2];
                var19[6] = var22[2];
            }
        }
        arg13.method597(arg3, arg1, arg10, var22, var19, false);
        if (arg8 < 67) {
            field83 = -123;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V", line = 388)
    public static final void method41(boolean arg0) {
        class126.method922(32);
        class106.method754(1);
        class246.method1660(0);
        class194.method1341(0);
        class211.method1470((byte) 22);
        class22.method152(-15901);
        field73++;
        class214.method1476(false);
        class299.method2081(-9317);
        class261.method1765(!arg0);
        class189.method1294((byte) -36);
        class310.method2141(120);
        class120.method875(87);
        class307.method2116(90);
        class75.method481(19730);
        class150.method1085((byte) 68);
        class151.method1088((byte) -109);
        class249.method1681(arg0);
        class35.method249(false);
        class13.field146.method2176((byte) -52);
        class211.field3215.method2176((byte) -64);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIFIIIZII)[[I", line = 416)
    public static final int[][] method42(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field70++;
        int[][] var9 = new int[arg3][arg4];
        class142 var10 = new class142();
        var10.field2152 = arg7;
        var10.field2142 = arg0;
        var10.field2147 = arg5;
        var10.field2146 = arg6;
        var10.field2148 = (int) (arg2 * 4096.0F);
        var10.method47(-9);
        class257.method1741(arg3, 31497, arg4);
        for (int var11 = arg8; var11 < arg3; var11++) {
            var10.method1022(var9[var11], 0, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 455)
    public static void method43(byte arg0) {
        field80 = null;
        int var1 = 110 / ((arg0 - 27) / 61);
        field76 = null;
        field69 = null;
        field71 = null;
        field67 = null;
    }

    @OriginalMember(owner = "client!n", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 472)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field68++;
        if (class60.field796 == null) {
            return;
        }
        class58.field743 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class226.field3444.length > var2) {
            var3 = class226.field3444[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class123.field1927 >= 0 && var3 >= 0) {
            class37.field452[class123.field1927] = var3;
            class123.field1927 = class123.field1927 + 1 & 0x7F;
            if (class126.field1982 == class123.field1927) {
                class123.field1927 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class200.field2989 + 1 & 0x7F;
            if (class205.field3084 != var4) {
                class3.field5[class200.field2989] = var3;
                class160.field2391[class200.field2989] = '\u0000';
                class200.field2989 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
