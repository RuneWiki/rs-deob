import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class183 extends Canvas {

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field2995;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "Z")
    public static boolean field2983 = false;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "Z")
    public static boolean field2984 = true;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field2987 = 0;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2994 = "flash1:";

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field2996 = 2;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
    public static int[] field2986;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lmo;Le;I)V")
    public static final void method1248(class447 arg0, class312 arg1, int arg2) {
        field2989++;
        class100[] var3 = class100.method750(arg0, class189.field3100, 0);
        class379.field5741 = new class356[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class379.field5741[var4] = arg1.method641(var3[var4], true);
        }
        class100[] var5 = class100.method750(arg0, class223.field3710, 0);
        class241.field4008 = new class356[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class241.field4008[var6] = arg1.method641(var5[var6], true);
        }
        class100[] var7 = class100.method750(arg0, class73.field933, 0);
        class359.field5499 = new class356[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class359.field5499[var8] = arg1.method641(var7[var8], true);
        }
        class100[] var9 = class100.method750(arg0, class21.field276, 0);
        class254.field4122 = new class356[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class254.field4122[var10] = arg1.method641(var9[var10], true);
        }
        class100[] var11 = class100.method750(arg0, class328.field5143, 0);
        class248.field4062 = new class356[var11.length];
        int var12 = 0;
        if (arg2 < 106) {
            field2996 = 54;
        }
        while (var12 < var11.length) {
            class248.field4062[var12] = arg1.method641(var11[var12], true);
            var12++;
        }
        class100[] var13 = class100.method750(arg0, class298.field4747, 0);
        class245.field4021 = new class356[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class245.field4021[var14] = arg1.method641(var13[var14], true);
        }
        class100[] var15 = class100.method750(arg0, class61.field800, 0);
        class152.field2373 = new class356[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class152.field2373[var16] = arg1.method641(var15[var16], true);
        }
        class100[] var17 = class100.method750(arg0, class156.field2451, 0);
        class269.field4321 = new class356[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class269.field4321[var18] = arg1.method641(var17[var18], true);
        }
        class100[] var19 = class100.method750(arg0, class298.field4741, 0);
        class405.field6027 = new class356[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class405.field6027[var20] = arg1.method641(var19[var20], true);
        }
        class100[] var21 = class100.method750(arg0, class348.field5358, 0);
        class329.field5157 = new class356[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class329.field5157[var22] = arg1.method641(var21[var22], true);
        }
        class100[] var23 = class100.method750(arg0, class397.field5938, 0);
        class388.field5850 = new class356[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class388.field5850[var24] = arg1.method641(var23[var24], true);
        }
        class100[] var25 = class100.method750(arg0, class74.field943, 0);
        class181.field2960 = new class356[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class181.field2960[var26] = arg1.method641(var25[var26], true);
        }
        class100[] var27 = class100.method750(arg0, class372.field5622, 0);
        class267.field4309 = new class356[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class267.field4309[var28] = arg1.method641(var27[var28], true);
        }
        class369.field5612 = arg1.method641(class100.method756(arg0, class50.field619, 0), true);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    public static final void method1249(int arg0, int arg1) {
        field2992++;
        class211 var2 = class281.method1921(1, arg0, (byte) -111);
        if (arg1 != 22630) {
            field2987 = 10;
        }
        var2.method1489((byte) -100);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZIII)V")
    public static final void method1250(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 < (arg1 + arg4); var6++) {
            for (int var9 = arg5; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && class80.field1003 > var9 && var6 >= 0 && class380.field5751 > var6) {
                    class281.field4509[arg0][var9][var6] = arg0 <= 0 ? 0 : class281.field4509[arg0 - 1][var9][var6] - 240;
                }
            }
        }
        if (!arg2) {
            method1253((byte) 125);
        }
        field2991++;
        if (arg5 > 0 && class80.field1003 > arg5) {
            for (int var7 = arg4 + 1; var7 < arg4 + arg1; var7++) {
                if (var7 >= 0 && class380.field5751 > var7) {
                    class281.field4509[arg0][arg5][var7] = class281.field4509[arg0][arg5 - 1][var7];
                }
            }
        }
        if (arg4 > 0 && arg4 < class380.field5751) {
            for (int var8 = arg5 + 1; var8 < (arg3 + arg5); var8++) {
                if (var8 >= 0 && var8 < class80.field1003) {
                    class281.field4509[arg0][var8][arg4] = class281.field4509[arg0][var8][arg4 - 1];
                }
            }
        }
        if (arg5 < 0 || arg4 < 0 || class80.field1003 <= arg5 || class380.field5751 <= arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 <= 0 || class281.field4509[arg0][arg5 - 1][arg4] == 0) {
                if (arg4 > 0 && class281.field4509[arg0][arg5][arg4 - 1] != 0) {
                    class281.field4509[arg0][arg5][arg4] = class281.field4509[arg0][arg5][arg4 - 1];
                    return;
                }
                if (arg5 > 0 && arg4 > 0 && class281.field4509[arg0][arg5 - 1][arg4 - 1] != 0) {
                    class281.field4509[arg0][arg5][arg4] = class281.field4509[arg0][arg5 - 1][arg4 - 1];
                    return;
                }
                return;
            }
            class281.field4509[arg0][arg5][arg4] = class281.field4509[arg0][arg5 - 1][arg4];
        } else if (arg5 <= 0 || class281.field4509[arg0 - 1][arg5 - 1][arg4] == class281.field4509[arg0][arg5 - 1][arg4]) {
            if (arg4 > 0 && class281.field4509[arg0 - 1][arg5][arg4 - 1] != class281.field4509[arg0][arg5][arg4 - 1]) {
                class281.field4509[arg0][arg5][arg4] = class281.field4509[arg0][arg5][arg4 - 1];
                return;
            }
            if (arg5 > 0 && arg4 > 0 && class281.field4509[arg0][arg5 - 1][arg4 - 1] != class281.field4509[arg0 - 1][arg5 - 1][arg4 - 1]) {
                class281.field4509[arg0][arg5][arg4] = class281.field4509[arg0][arg5 - 1][arg4 - 1];
                return;
            }
        } else {
            class281.field4509[arg0][arg5][arg4] = class281.field4509[arg0][arg5 - 1][arg4];
            return;
        }
    }

    @OriginalMember(owner = "client!jo", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2995.paint(arg0);
        field2993++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public static void method1251(byte arg0) {
        field2986 = null;
        field2994 = null;
        if (arg0 <= 119) {
            field2996 = -108;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lsd;I)V")
    public static final void method1252(class50 arg0, int arg1) {
        field2997++;
        if (class144.field2267 >= 400) {
            return;
        }
        if (arg1 != 0) {
            method1252((class50) null, 26);
        }
        class226 var2 = arg0.field615;
        if (var2.field3771 != null) {
            var2 = var2.method1619(-103);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field3762) {
            return;
        }
        String var3 = var2.field3773;
        if (var2.field3769 != 0) {
            String var4 = class61.field787 == 1 ? class235.field3941 : class60.field771;
            var3 = var3 + class447.method2763((byte) -5, var2.field3769, class261.field4201.field3603) + " (" + var4 + var2.field3769 + ")";
        }
        if (class374.field5639 == 1) {
            class126.field1935++;
            class413.method2587((long) arg0.field1868, class318.field4986, 0, class71.field878, 39, 0, class287.field4606 + " -> <col=ffff00>" + var3, -233);
        } else if (class449.field6546) {
            class309 var5 = class264.field4251 == -1 ? null : class255.method1760(class264.field4251, 63);
            if ((class379.field5737 & 0x2) != 0) {
                if (var5 == null || var2.method1618(var5.field4893, false, class264.field4251) != var5.field4893) {
                    class413.method2587((long) arg0.field1868, class306.field4854, 0, class248.field4058, 38, 0, class213.field3414 + " -> <col=ffff00>" + var3, -233);
                    class27.field312++;
                }
                return;
            }
        } else {
            String[] var6 = var2.field3758;
            if (class38.field482) {
                var6 = class444.method2749(arg1 ^ 0xFFFFFFD8, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class61.field787 != 0 || !var6[var7].equalsIgnoreCase(class354.field5450))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 13;
                        }
                        int var9 = class32.field398;
                        if (var7 == 1) {
                            var8 = 48;
                        }
                        if (var7 == 2) {
                            var8 = 60;
                        }
                        if (var7 == 3) {
                            var8 = 36;
                        }
                        if (var7 == 4) {
                            var8 = 1;
                        }
                        if (var2.field3802 == var7) {
                            var9 = var2.field3749;
                        }
                        if (var2.field3785 == var7) {
                            var9 = var2.field3787;
                        }
                        class140.field2171++;
                        class413.method2587((long) arg0.field1868, var6[var7], 0, var9, var8, 0, "<col=ffff00>" + var3, -233);
                    }
                }
            }
            if (class61.field787 == 0 && var6 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var6[var10] != null && var6[var10].equalsIgnoreCase(class354.field5450)) {
                        short var11 = 0;
                        if (class261.field4201.field3603 < var2.field3769) {
                            var11 = 2000;
                        }
                        short var12 = 0;
                        if (var10 == 0) {
                            var12 = 13;
                        }
                        if (var10 == 1) {
                            var12 = 48;
                        }
                        if (var10 == 2) {
                            var12 = 60;
                        }
                        if (var10 == 3) {
                            var12 = 36;
                        }
                        if (var10 == 4) {
                            var12 = 1;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class413.method2587((long) arg0.field1868, var6[var10], 0, var2.field3755, var12, 0, "<col=ffff00>" + var3, -233);
                        class359.field5496++;
                    }
                }
            }
            class413.method2587((long) arg0.field1868, class252.field4102, 0, class216.field3522, 1011, 0, "<col=ffff00>" + var3, -233);
            class30.field378++;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V")
    public static final void method1253(byte arg0) {
        class296.field4710.method692(class412.field6102, class241.field3987 ? class246.field4038 + 256 : -1);
        int var1 = 122 / ((arg0 + 27) / 50);
        field2988++;
    }

    @OriginalMember(owner = "client!jo", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2995.update(arg0);
        field2982++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Le;JZ)V")
    public static final void method1254(class312 arg0, long arg1, boolean arg2) {
        class441.field6455 = 0;
        class179.field2927 = class386.field5836;
        field2985++;
        class386.field5836 = 0;
        if (!arg2) {
            return;
        }
        long var4 = class46.method297(27104);
        for (class78 var6 = (class78) class43.field535.method2430(67); var6 != null; var6 = (class78) class43.field535.method2435(-224)) {
            if (var6.method496(arg0, arg1)) {
                class441.field6455++;
            }
        }
        if (class303.field4785 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class43.field535.method2434((byte) 62) + ", running: " + class441.field6455 + ". Particles: " + class386.field5836 + ". Time taken: " + (class46.method297(27104) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class183(Component arg0) {
        this.field2995 = arg0;
    }
}
