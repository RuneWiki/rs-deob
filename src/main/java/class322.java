import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class322 extends class264 {

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "Lbt;")
    public static class363 field4751;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "Lvq;")
    public static class24 field4758;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "Z")
    public static boolean field4760;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public int field4738;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public int field4745;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public int field4746;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public int field4747;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public int field4754;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "Lua;")
    public class179 field4756;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lhh;")
    public class190 field4730;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "Lag;")
    public class311 field4741;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "Lbk;")
    public class34 field4757;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field4763;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "Z")
    public static boolean field4759;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "[I")
    public static int[] field4761;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "[[B")
    public static byte[][] field4762;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2120(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class409("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field4739 = 2;
        field4751 = new class363(8);
        field4758 = new class24(84, 12);
        field4760 = false;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 5)
    public final void method2111(int arg0) {
        this.field4741 = null;
        this.field4756 = null;
        int var2 = -83 / ((-arg0 - 34) / 38);
        field4735++;
        this.field4730 = null;
        this.field4757 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([I[Ljava/lang/Object;III)V", line = 29)
    public static final void method2112(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -31706) {
            field4762 = null;
        }
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if (arg0[var9] < var7 + (var9 & 0x1)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method2112(arg0, arg1, arg2, -31706, var6 - 1);
            method2112(arg0, arg1, var6 + 1, -31706, arg4);
        }
        field4734++;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V", line = 85)
    public static void method2113(int arg0) {
        field4762 = null;
        field4758 = null;
        if (arg0 != -26680) {
            method2117((byte) 62);
        }
        field4761 = null;
        field4751 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 98)
    public static final void method2114(byte arg0) {
        if (class341.field5007 == 2) {
            class451.field6661 = 96;
        } else {
            try {
                Method var1 = (field4763 == null ? (field4763 = method2120("java.lang.Runtime")) : field4763).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class451.field6661 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field4737++;
        if (arg0 >= -125) {
            method2113(-122);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIII)V", line = 132)
    public static final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class381.method2419((byte) 38, arg1, arg5, class323.field4774[arg0], arg3);
        field4742++;
        int var9 = arg2 - 1;
        class381.method2419((byte) 71, arg1, arg5, class323.field4774[arg2], arg3);
        if (arg4 != 304) {
            field4739 = 21;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class323.field4774[var6];
            var7[arg5] = var7[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII)V", line = 158)
    public static final void method2116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4748++;
        class459.field6801 = arg3;
        class131.field1791 = arg1;
        class252.field3708 = arg5;
        class344.field5058 = arg0;
        if (arg6 != 6469) {
            field4739 = -125;
        }
        class383.field5617 = arg2;
        class160.field2137 = arg4;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 193)
    public static final void method2117(byte arg0) {
        class378.field5537 = class233.field3502.field5284 + class233.field3502.field5268 + 2;
        class86.field1066 = class328.field4885.field5284 + class328.field4885.field5268 + 2;
        field4732++;
        if (arg0 == 120) {
            class206.field2886 = new String[500];
            for (int var1 = 0; var1 < class206.field2886.length; var1++) {
                class206.field2886[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V", line = 213)
    public static final void method2118(int arg0) {
        if (arg0 >= -122) {
            field4758 = null;
        }
        field4752++;
        for (class265 var1 = (class265) class276.field4087.method2478(1603); var1 != null; var1 = (class265) class276.field4087.method2486((byte) -82)) {
            if (var1.field3934 == -1) {
                var1.field3926 = 0;
                class230.method1567(var1, true);
            } else {
                var1.method1820(-25246);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;IZ)V", line = 256)
    public static final void method2119(int arg0, String arg1, Color arg2, Color arg3, Color arg4, int arg5, boolean arg6) {
        try {
            Graphics var7 = class270.field4004.getGraphics();
            if (class148.field2006 == null) {
                class148.field2006 = new Font("Helvetica", 1, 13);
            }
            if (arg6) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class214.field3016, class375.field5473);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class31.field432 == null) {
                    class31.field432 = class270.field4004.createImage(304, 34);
                }
                Graphics var8 = class31.field432.getGraphics();
                var8.setColor(arg2);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg5 + (arg0 * 3), 2, 300 - arg0 * 3, 30);
                var8.setFont(class148.field2006);
                var8.setColor(arg4);
                var8.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
                var7.drawImage(class31.field432, class214.field3016 / 2 - 152, class375.field5473 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class214.field3016 / 2 - 152;
                int var10 = class375.field5473 / 2 - 18;
                var7.setColor(arg2);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - (arg0 * 3), 30);
                var7.setFont(class148.field2006);
                var7.setColor(arg4);
                var7.drawString(arg1, (304 - (arg1.length() * 6)) / 2 + var9, var10 + 22);
            }
            if (class385.field5635 != null) {
                var7.setFont(class148.field2006);
                var7.setColor(arg4);
                var7.drawString(class385.field5635, class214.field3016 / 2 - (class385.field5635.length() * 6 / 2), class375.field5473 / 2 + -26);
            }
        } catch (Exception var12) {
            class270.field4004.repaint();
        }
        field4744++;
    }
}
