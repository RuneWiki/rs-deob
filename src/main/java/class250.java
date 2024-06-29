import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class250 extends class221 {

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Lsb;")
    public static class98 field4383 = class47.method368("hitmarks", 0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field4384 = 0;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[J")
    public static long[] field4385 = new long[32];

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lsb;")
    private static class98 field4390 = class47.method368("", 0);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lsb;")
    public static class98 field4386 = field4390;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public static void method1733(byte arg0) {
        field4385 = null;
        field4383 = null;
        if (arg0 != 87) {
            method1733((byte) 85);
        }
        field4390 = null;
        field4386 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B[[I)V")
    public static final void method1734(byte arg0, int[][] arg1) {
        field4382++;
        if (arg0 <= -110) {
            class43.field721 = arg1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1735(int arg0, Component arg1) {
        field4381++;
        Method var2 = class5.field85;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class197.field3394);
        if (arg0 >= 125) {
            arg1.addFocusListener(class197.field3394);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
    public static final void method1736(byte arg0) {
        class181.field3122++;
        field4389++;
        class237.field4084.method490(86, -61);
        if (arg0 != 7) {
            return;
        }
        for (class34 var1 = (class34) class243.field4209.method1514((byte) 37); var1 != null; var1 = (class34) class243.field4209.method1515(109)) {
            if (var1.field590 == 0) {
                class181.method1250((byte) 65, true, var1);
            }
        }
        if (class188.field3244 != null) {
            class72.method512(class188.field3244, 2);
            class188.field3244 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method1737(int arg0) {
        field4388++;
        if (class181.field3128 != null || class199.field3427 != null) {
            return;
        }
        int var1 = class48.field810;
        if (arg0 != -1) {
            method1736((byte) -40);
        }
        if (class97.field1672) {
            if (var1 != 1) {
                int var2 = class199.field3426;
                int var3 = class75.field1322;
                if (var3 < class81.field1434 - 10 || class81.field1434 + class14.field258 + 10 < var3 || (class88.field1553 - 10) > var2 || var2 > class88.field1553 + class41.field670 + 10) {
                    class97.field1672 = false;
                    class92.method681(arg0 ^ 0x7C, class88.field1553, class81.field1434, class41.field670, class14.field258);
                }
            }
            if (var1 == 1) {
                int var4 = class88.field1553;
                int var5 = field4384;
                int var6 = class81.field1434;
                int var7 = class14.field258;
                int var8 = -1;
                int var9 = class139.field2471;
                for (int var10 = 0; var10 < class226.field3894; var10++) {
                    int var11 = (class226.field3894 - var10 - 1) * 15 + var4 + 31;
                    if (var6 < var9 && (var6 + var7) > var9 && var5 > var11 - 13 && var5 < var11 + 3) {
                        var8 = var10;
                    }
                }
                if (var8 != -1) {
                    class227.method1569(var8, ~arg0);
                }
                class97.field1672 = false;
                class92.method681(-126, class88.field1553, class81.field1434, class41.field670, class14.field258);
                return;
            }
            return;
        }
        if (var1 == 1 && class226.field3894 > 0) {
            short var12 = class212.field3630[class226.field3894 - 1];
            if (var12 == 9 || var12 == 58 || var12 == 4 || var12 == 29 || var12 == 37 || var12 == 15 || var12 == 5 || var12 == 36 || var12 == 6 || var12 == 23 || var12 == 30 || var12 == 1005) {
                int var13 = class182.field3138[class226.field3894 - 1];
                int var14 = class129.field2309[class226.field3894 - 1];
                class148 var15 = class62.method455(-854073200, var14);
                if (class197.method1350((byte) -33, client.method761(var15)) || class45.method359(118, client.method761(var15))) {
                    class191.field3308 = 0;
                    class252.field4419 = false;
                    if (class181.field3128 != null) {
                        class72.method512(class181.field3128, arg0 + 3);
                    }
                    class181.field3128 = class62.method455(-854073200, var14);
                    class198.field3409 = field4384;
                    class232.field3990 = class139.field2471;
                    class228.field3919 = var13;
                    class72.method512(class181.field3128, 2);
                    return;
                }
            }
        }
        if (var1 == 1 && (class164.field2953 == 1 && class226.field3894 > 2 || class233.method1599((byte) 91, class226.field3894 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class226.field3894 > 0 || class20.field362 == 1) {
            class92.method676(0);
        }
        if ((var1 != 1 || class226.field3894 <= 0) && class20.field362 != 2) {
            return;
        }
        class144.method1070((byte) -84);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILsc;JZ)V")
    public static final void method1738(int arg0, int arg1, int arg2, int arg3, class119 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class53 var8 = new class53();
        var8.field851 = arg4;
        var8.field848 = arg1 * 128 + 64;
        var8.field850 = arg2 * 128 + 64;
        var8.field853 = arg3;
        var8.field852 = arg5;
        if (class31.field553[arg0][arg1][arg2] == null) {
            class31.field553[arg0][arg1][arg2] = new class71(arg0, arg1, arg2);
        }
        class31.field553[arg0][arg1][arg2].field1132 = var8;
    }
}
