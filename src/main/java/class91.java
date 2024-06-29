import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class91 extends class97 {

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lpf;")
    public static class425 field1284 = new class425(40, 3);

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "[I")
    public static int[] field1287 = new int[100];

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Lkr;")
    public static class234 field1289;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field1292;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
    public static final void method593(boolean arg0, int arg1) {
        class79.field1042++;
        class177.method1082(class327.field4920, 0);
        field1283++;
        if (arg1 <= 122) {
            method593(true, 121);
        }
        for (class333 var2 = (class333) class308.field4647.method2296(5773); var2 != null; var2 = (class333) class308.field4647.method2304(100)) {
            if (!var2.method624(18651)) {
                var2 = (class333) class308.field4647.method2296(5773);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4962 == 0) {
                class367.method2204(true, (byte) -98, arg0, var2);
            }
        }
        if (class98.field1359 != null) {
            class405.method2543(class98.field1359, 125);
            class98.field1359 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public static final void method594(int arg0) {
        field1281++;
        class235 var1 = null;
        try {
            if (arg0 <= 100) {
                method594(-128);
            }
            class211 var2 = class79.field1043.method1453(19204);
            while (var2.field3172 == 0) {
                class109.method674((byte) 99, 1L);
            }
            if (var2.field3172 == 1) {
                var1 = (class235) var2.field3175;
                byte[] var3 = new byte[(int) var1.method1421((byte) 71)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1419(0, var3, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class198.method1193(new class385(var3), -14859);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1420((byte) 73);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lqi;I)V")
    public static final void method595(class343 arg0, int arg1) {
        field1285++;
        if (class277.field4216 == null) {
            return;
        }
        class18 var2 = null;
        if (arg0.field5124 == arg1) {
            var2 = (class18) class37.method211(arg0.field5137, arg0.field5129, arg0.field5135);
        }
        if (arg0.field5124 == 1) {
            var2 = (class18) class213.method1245(arg0.field5137, arg0.field5129, arg0.field5135);
        }
        if (arg0.field5124 == 2) {
            var2 = (class18) class51.method293(arg0.field5137, arg0.field5129, arg0.field5135, field1292 == null ? (field1292 = method599("rc")) : field1292);
        }
        if (arg0.field5124 == 3) {
            var2 = (class18) class386.method2385(arg0.field5137, arg0.field5129, arg0.field5135);
        }
        if (var2 == null) {
            arg0.field5134 = 0;
            arg0.field5132 = -1;
            arg0.field5136 = 0;
        } else {
            arg0.field5132 = var2.method7(true);
            arg0.field5136 = var2.method9(arg1 ^ 0x6D);
            arg0.field5134 = var2.method3((byte) -42);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -1) {
            return;
        }
        field1288++;
        int var8 = class198.method1192(class189.field2831, class204.field3060, arg7, arg6 ^ 0x2);
        int var9 = class198.method1192(class189.field2831, class204.field3060, arg2, -3);
        int var10 = class198.method1192(class192.field2917, class39.field497, arg1, -3);
        int var11 = class198.method1192(class192.field2917, class39.field497, arg5, arg6 - 2);
        int var12 = class198.method1192(class189.field2831, class204.field3060, arg7 + arg0, -3);
        int var13 = class198.method1192(class189.field2831, class204.field3060, arg2 - arg0, -3);
        for (int var14 = var8; var14 < var12; var14++) {
            class379.method2285(127, class292.field4448[var14], var11, arg3, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class379.method2285(124, class292.field4448[var15], var11, arg3, var10);
        }
        int var16 = class198.method1192(class192.field2917, class39.field497, arg1 + arg0, -3);
        int var17 = class198.method1192(class192.field2917, class39.field497, arg5 - arg0, -3);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class292.field4448[var18];
            class379.method2285(127, var19, var16, arg3, var10);
            class379.method2285(126, var19, var17, arg4, var16);
            class379.method2285(127, var19, var11, arg3, var17);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method597(int arg0, int arg1) {
        field1291++;
        class32 var2 = class136.method854(12, (byte) 122, arg0);
        var2.method192(-17451);
        if (arg1 != 18551) {
            field1286 = 47;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static void method598(byte arg0) {
        field1284 = null;
        field1287 = null;
        int var1 = 8 % ((arg0 - 6) / 44);
        field1289 = null;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
    public class91(int arg0, int arg1) {
        this.field1282 = arg0;
        this.field1280 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method599(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
