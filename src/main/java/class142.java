import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class142 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lqe;")
    private static class168 field2496 = class66.method448("Walk here", 22);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lqe;")
    public static class168 field2493 = field2496;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
    public static int[] field2497 = new int[256];

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Z")
    public static boolean field2502 = true;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lwc;")
    public static class232 field2503 = new class232(64);

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lqe;")
    private static class168 field2504 = class66.method448("Created gameworld", 103);

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lqe;")
    public static class168 field2506 = field2504;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lrd;")
    public static class207 field2500;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method968(byte arg0) {
        field2492++;
        int var1 = 16 % ((arg0 - 10) / 33);
        int var2 = class32.field385.method320(-106133305);
        if (var2 == 0) {
            return;
        }
        class137.field2421++;
        class87.field1348.method672(103, 238);
        int var3 = 0;
        class87.field1348.method768(0, 7295);
        int var4 = class87.field1348.field1821;
        class172 var5 = (class172) class32.field385.method321((byte) -111);
        class87.field1348.method753(var5.field2991, -242005080);
        int var6 = var5.field2991;
        class172 var7;
        while ((var7 = (class172) class32.field385.method321((byte) -127)) != null) {
            if (var3 < 255 && var6 + 1 == var7.field2991) {
                var3++;
            } else {
                class87.field1348.method768(var3, 7295);
                class87.field1348.method753(var7.field2991, -242005080);
                var3 = 0;
            }
            var6 = var7.field2991;
        }
        class87.field1348.method768(var3, 7295);
        class87.field1348.method729(class87.field1348.field1821 - var4, -43);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method969(int arg0) {
        if (class234.field3980 == null || class170.field2961 == null) {
            class234.field3980 = new int[256];
            class170.field2961 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class234.field3980[var1] = (int) (Math.sin(var2) * 4096.0D);
                class170.field2961[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 == -15046) {
            field2498++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)Z")
    public static final boolean method970(byte arg0, int arg1) {
        field2501++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            int var2 = 103 % ((arg0 + 5) / 60);
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lqe;")
    public static final class168 method971(int arg0, int arg1) {
        field2499++;
        if (arg1 <= 14) {
            field2506 = null;
        }
        return arg0 < 999999999 ? class128.method867((byte) 111, arg0) : class99.field1573;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Z")
    public static final boolean method972(int arg0, int arg1) {
        field2495++;
        if (arg0 != 4096) {
            method971(-67, 58);
        }
        if (arg1 < 0) {
            return false;
        }
        int var2 = class51.field701[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII[Lqe;)Lqe;")
    public static final class168 method973(byte arg0, int arg1, int arg2, class168[] arg3) {
        field2491++;
        int var4 = 0;
        if (arg0 >= -109) {
            method970((byte) -45, 37);
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class158.field2734;
            }
            var4 += arg3[arg2 + var5].field2870;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class168 var10 = arg3[arg2 + var8];
            class22.method114(var10.field2904, 0, var7, var6, var10.field2870);
            var6 += var10.field2870;
        }
        class168 var9 = new class168();
        var9.field2870 = var4;
        var9.field2904 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method974(byte arg0) {
        field2506 = null;
        if (arg0 != -6) {
            field2505 = -35;
        }
        field2500 = null;
        field2497 = null;
        field2503 = null;
        field2496 = null;
        field2504 = null;
        field2493 = null;
    }
}
