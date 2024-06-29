import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class156 {

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public int field2746 = -1;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lqk;")
    private static class207 field2742 = class24.method212(255, "red:");

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Lqk;")
    public static class207 field2745 = field2742;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Lqk;")
    public static class207 field2739 = class24.method212(255, "Lade Liste der Welten");

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field2737 = 0;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static volatile int field2752 = -1;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lqk;")
    private static class207 field2735 = class24.method212(255, "Use");

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Lqk;")
    public static class207 field2744 = field2735;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "Lqk;")
    public static class207 field2755 = field2742;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field2754 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "[I")
    public static int[] field2753;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;B)Lqk;")
    public static final class207 method1140(String arg0, byte arg1) {
        field2741++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class207 var3 = new class207();
        var3.field3652 = var2;
        if (arg1 != 22) {
            method1144(86);
        }
        var3.field3663 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field3663++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([IIIIII)V")
    public static final void method1141(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class174 var6 = class82.field1498[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class129 var7 = var6.field3141;
        if (var7 != null) {
            int var8 = var7.field2242;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class122 var10 = var6.field3135;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2101;
        int var12 = var10.field2104;
        int var13 = var10.field2120;
        int var14 = var10.field2117;
        int[] var15 = class67.field1186[var11];
        int[] var16 = class174.field3156[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method1142(int arg0) {
        field2753 = null;
        field2742 = null;
        field2739 = null;
        if (arg0 != 4) {
            field2745 = null;
        }
        field2755 = null;
        field2735 = null;
        field2745 = null;
        field2744 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(SIJIIILqk;Lqk;)V")
    public static final void method1143(short arg0, int arg1, long arg2, int arg3, int arg4, int arg5, class207 arg6, class207 arg7) {
        field2751++;
        if (class256.field4588) {
            return;
        }
        if (class268.field4751 < 500) {
            class110.field1926[class268.field4751] = arg6;
            class12.field167[class268.field4751] = arg7;
            class131.field2273[class268.field4751] = arg3 == -1 ? class175.field3166 : arg3;
            class82.field1494[class268.field4751] = arg0;
            class282.field4960[class268.field4751] = arg2;
            class85.field1551[class268.field4751] = arg4;
            class199.field3505[class268.field4751] = arg1;
            class268.field4751++;
        }
        if (arg5 != -28775) {
            method1143((short) -18, -34, -10L, 51, 54, -4, (class207) null, (class207) null);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static final void method1144(int arg0) {
        class92.field1628.method1390((byte) 125);
        field2731++;
        if (arg0 != -1) {
            field2753 = null;
        }
        class14.field232.method1390((byte) 111);
        class185.field3275.method1390((byte) 109);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public static final void method1145(int arg0) {
        field2734++;
        if (arg0 != 23680) {
            return;
        }
        while (class17.field262.method772(class245.field4437, (byte) 17) >= 11) {
            int var1 = class17.field262.method773(11, false);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class169.field2953[var1] == null) {
                var2 = true;
                class169.field2953[var1] = new class14();
                if (class119.field2064[var1] != null) {
                    class169.field2953[var1].method91(1, class119.field2064[var1]);
                }
            }
            class10.field149[class31.field629++] = var1;
            class14 var3 = class169.field2953[var1];
            var3.field5034 = class160.field2844;
            int var4 = class17.field262.method773(5, false);
            int var5 = class180.field3229[class17.field262.method773(3, false)];
            if (var2) {
                var3.field5098 = var3.field5062 = var5;
            }
            int var6 = class17.field262.method773(5, false);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class17.field262.method773(1, false);
            if (var7 == 1) {
                class180.field3233[class65.field1179++] = var1;
            }
            int var8 = class17.field262.method773(1, false);
            if (var4 > 15) {
                var4 -= 32;
            }
            var3.method88((byte) -99, var8 == 1, class202.field3565.field5074[0] + var4, class202.field3565.field5022[0] + var6);
        }
        class17.field262.method775((byte) 110);
    }
}
