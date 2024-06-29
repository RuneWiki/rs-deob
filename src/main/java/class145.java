import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class145 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lr;")
    public static class66 field2640 = class93.method641(43, "www");

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lr;")
    private static class66 field2656 = class93.method641(43, "Connection lost)3");

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Lr;")
    public static class66 field2644 = field2656;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lc;")
    public static class125 field2650 = new class125();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Llb;")
    public static class228 field2643;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Ljava/awt/Image;")
    public Image field2652;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
    public int[] field2645;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[[[I")
    public static int[][][] field2649;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public static final void method993(boolean arg0) {
        field2651++;
        class4.field45 = 0;
        class240.field4170 = 0;
        class110.method743((byte) -67);
        class122.method832(19114);
        class86.method611((byte) -11);
        for (int var1 = 0; var1 < class4.field45; var1++) {
            int var3 = class70.field1404[var1];
            if (class75.field1501 != class178.field3112[var3].field2091) {
                if (class178.field3112[var3].field548.method1336(0)) {
                    class59.method390(class178.field3112[var3], 2);
                }
                class178.field3112[var3].field548 = null;
                class178.field3112[var3] = null;
            }
        }
        if (class61.field1033 != class84.field1627.field4335) {
            throw new RuntimeException("gnp1 pos:" + class84.field1627.field4335 + " psize:" + class61.field1033);
        }
        if (arg0) {
            field2640 = null;
        }
        for (int var2 = 0; var2 < class160.field2869; var2++) {
            if (class178.field3112[class49.field877[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class160.field2869);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method994(int arg0) {
        field2654++;
        int var1 = class242.field4240;
        int var2 = class164.field2939;
        if (arg0 != 0) {
            field2650 = null;
        }
        int var3 = class154.field2747 - class19.field257 - var1;
        int var4 = class28.field425 - class12.field143 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class7.field58 != null) {
                var6 = class7.field58;
            } else if (class158.field2857 == null) {
                var6 = class95.field1835.field2184;
            } else {
                var6 = class158.field2857;
            }
            int var7 = 0;
            if (class158.field2857 == var6) {
                Insets var8 = class158.field2857.getInsets();
                var7 = var8.left;
                var5 = var8.top;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var5, var1, class28.field425);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var5, class154.field2747, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class154.field2747 + var7 - var3, var5, var3, class28.field425);
            }
            if (var4 > 0) {
                var9.fillRect(var7, var5 + class28.field425 - var4, class154.field2747, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Leh;Z)I")
    public static final int method995(class37 arg0, boolean arg1) {
        field2647++;
        if (arg1) {
            field2659 = 75;
        }
        class206 var2 = arg0.field548;
        if (var2.field3541 != null) {
            var2 = var2.method1339(-94);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3540;
        if (arg0.field2046 == arg0.field2040) {
            var3 = var2.field3539;
        } else if (arg0.field2056 == arg0.field2040) {
            var3 = var2.field3581;
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method121(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method996(byte arg0) {
        field2644 = null;
        field2649 = null;
        field2650 = null;
        field2640 = null;
        field2643 = null;
        if (arg0 < 75) {
            method997(52);
        }
        field2656 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method997(int arg0) {
        field2642++;
        int var1 = -15 / ((arg0 - 7) / 57);
        class30.field448.method1614(-120);
        class242.field4227.method1614(-64);
        class182.field3179.method1614(-128);
        class188.field3261.method1614(-121);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2653++;
        int var8 = arg0 + arg4;
        int var9 = arg2 - arg0;
        int var10 = arg5 - arg0;
        int var11 = arg0 + arg1;
        for (int var12 = arg4; var12 < var8; var12++) {
            class194.method1266(arg1, (byte) -17, arg3, class15.field183[var12], arg5);
        }
        if (arg7 != -17229) {
            return;
        }
        for (int var13 = arg2; var13 > var9; var13--) {
            class194.method1266(arg1, (byte) -17, arg3, class15.field183[var13], arg5);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class15.field183[var14];
            class194.method1266(arg1, (byte) -17, arg3, var15, var11);
            class194.method1266(var11, (byte) -17, arg6, var15, var10);
            class194.method1266(var10, (byte) -17, arg3, var15, arg5);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lr;I)V")
    public static final void method999(class66 arg0, int arg1) {
        field2657++;
        int var2 = class180.method1200(64, arg0);
        if (arg1 == var2) {
            return;
        }
        class214.field3684 = class178.field3122.field2157[var2] - class73.field1439;
        int var3 = class214.field3684 - (int) ((float) class80.field1573.field1215 / class35.field527);
        int var4 = class214.field3684 + ((int) ((float) class80.field1573.field1215 / class35.field527));
        class15.field196 = class16.field208 + (class89.field1727 - 1) - class178.field3122.field2160[var2];
        int var5 = class15.field196 - ((int) ((float) class80.field1573.field1196 / class35.field527));
        if (var3 < 0) {
            class214.field3684 = (int) ((float) class80.field1573.field1215 / class35.field527);
        }
        if (var4 > class33.field500) {
            class214.field3684 = class33.field500 - ((int) ((float) class80.field1573.field1215 / class35.field527));
        }
        int var6 = (int) ((float) class80.field1573.field1196 / class35.field527) + class15.field196;
        if (var5 < 0) {
            class15.field196 = (int) ((float) class80.field1573.field1196 / class35.field527);
        }
        if (class89.field1727 < var6) {
            class15.field196 = class89.field1727 - ((int) ((float) class80.field1573.field1196 / class35.field527));
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BZZIZ)Lsg;")
    public static final class247 method1000(byte arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        int var5 = 28 % ((-arg0 - 13) / 59);
        field2648++;
        class86 var6 = null;
        if (class256.field4503 != null) {
            var6 = new class86(arg3, class256.field4503, class42.field691[arg3], 1000000);
        }
        return new class247(var6, class155.field2757, arg3, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method120(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II[B)I")
    public static final int method1001(int arg0, int arg1, byte[] arg2) {
        field2658++;
        return arg1 == -1 ? class47.method333(arg0, false, 0, arg2) : 65;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public final void method1002(int arg0) {
        field2641++;
        class235.method1551(this.field2645, this.field2660, this.field2646);
        if (arg0 < 7) {
            field2659 = 45;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public abstract void method124(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lsg;II)V")
    public static final void method1003(class247 arg0, int arg1, int arg2) {
        field2655++;
        if (class91.field1749 != null) {
            class91.field1749.field4335 = arg2 * 8 + 5;
            int var3 = class91.field1749.method1652(-5528);
            int var4 = class91.field1749.method1652(-5528);
            arg0.method1626(var4, (byte) 80, var3);
            return;
        }
        if (arg1 != -5720) {
            field2643 = null;
        }
        class244.method1609(true, 0, 255, (byte) 0, 255, (class247) null, (byte) 22);
        class102.field1986[arg2] = arg0;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Lhg;")
    public static final class91 method1004(int arg0) {
        if (arg0 >= -4) {
            method995((class37) null, false);
        }
        field2639++;
        try {
            return (class91) Class.forName("gf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class38();
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    protected class145() {
    }
}
