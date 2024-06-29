import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class7 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field61 = new String[100];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Lhg;")
    public static class182 field65;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBIII)V")
    public static final void method40(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field58++;
        class64.method398(arg2, arg3, arg2 + arg4, arg0 + arg3);
        class64.method401(arg2, arg3, arg4, arg0, 0);
        if (class279.field4327 < 100) {
            return;
        }
        if (class264.field3961 == null || class264.field3961.field1539 != arg4 || class264.field3961.field1538 != arg0) {
            class128 var5 = new class128(arg4, arg0);
            class64.method407(var5.field1820, arg4, arg0);
            class8.method53(0, 0, class138.field1929, arg0, arg4, 0, class41.field605, (byte) 5, 0);
            class264.field3961 = var5;
            class207.field2889.method1979((byte) -56);
        }
        int var6 = 16711680;
        class264.field3961.method706(arg2, arg3);
        if (class124.field1746 == 1) {
            var6 = 16777215;
        }
        int var7 = class284.field4435 * arg0 / class41.field605 + arg3;
        int var8 = class234.field3534 * arg4 / class138.field1929;
        int var9 = arg2 + (class62.field855 * arg4 / class138.field1929);
        int var10 = class266.field4084 * arg0 / class41.field605;
        class64.method395(var9, var7, var8, var10, var6, 128);
        class64.method393(var9, var7, var8, var10, var6);
        if (arg1 <= 105) {
            field65 = null;
        }
        if (class145.field2026 <= 0) {
            return;
        }
        int var11;
        if (class29.field393 > 10) {
            var11 = (20 - class29.field393) * 25;
        } else {
            var11 = class29.field393 * 25;
        }
        for (class294 var12 = (class294) class109.field1522.method990(-98); var12 != null; var12 = (class294) class109.field1522.method993(-98)) {
            if (class127.field1781 == var12.field4628) {
                int var13 = var12.field4626 * arg4 / class138.field1929 + arg2;
                int var14 = arg3 + (var12.field4622 * arg0 / class41.field605);
                class64.method395(var13 - 2, var14 - 2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Luj;")
    public abstract class287 method41(byte arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)V")
    public static final void method42(int arg0, byte arg1, int arg2) {
        class280 var3 = class181.method1180(arg2, 0, 13);
        var3.method1876(1840457248);
        if (arg1 != 7) {
            field61 = null;
        }
        var3.field4330 = arg0;
        field63++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)[Lke;")
    public static final class110[] method43(boolean arg0) {
        field62++;
        class110[] var1 = new class110[class175.field2465];
        for (int var2 = 0; var2 < class175.field2465; var2++) {
            int var3 = class50.field729[var2] * class39.field576[var2];
            byte[] var4 = class140.field1956[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class9.field79[class235.method1572(var4[var6], 255)];
            }
            var1[var2] = new class128(class21.field296, class287.field4535, class273.field4208[var2], class198.field2749[var2], class50.field729[var2], class39.field576[var2], var5);
        }
        if (!arg0) {
            method42(-128, (byte) -65, 106);
        }
        class15.method88(-15971);
        return var1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[B")
    public abstract byte[] method44(int arg0, int arg1);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ld;B)V")
    public static final void method45(class244 arg0, byte arg1) {
        class91 var2 = null;
        field64++;
        try {
            class117 var3 = arg0.method1635("runescape", false);
            while (var3.field1663 == 0) {
                class28.method182(1L, 123);
            }
            if (var3.field1663 == 1) {
                var2 = (class91) var3.field1665;
                class224 var4 = class213.method1389(11);
                var2.method592(var4.field3402, (byte) -70, 0, var4.field3336);
            }
        } catch (Exception var7) {
        }
        try {
            if (var2 != null) {
                var2.method593(0);
            }
            int var5 = 112 % ((-arg1 - 28) / 40);
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public static void method46(byte arg0) {
        field65 = null;
        if (arg0 <= 93) {
            field61 = null;
        }
        field61 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)V")
    public abstract void method47(int arg0, byte arg1);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method48(String arg0, int arg1) {
        if (arg1 != 255) {
            return -33;
        }
        field60++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class78.method503(arg0.charAt(var4), -383) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lai;ZII)V")
    public static final void method49(class88 arg0, boolean arg1, int arg2, int arg3) {
        field59++;
        if (!arg1) {
            field65 = null;
        }
        if (arg0.field4040 == arg3 && arg3 != -1) {
            class240 var4 = class132.method905(true, arg3);
            int var5 = var4.field3674;
            if (var5 == 1) {
                arg0.field4024 = 0;
                arg0.field3985 = arg2;
                arg0.field3994 = 1;
                arg0.field4002 = 0;
                arg0.field4080 = 0;
                class116.method781(arg0.field4085, 236, arg0.field4019, class217.field3280 == arg0, arg0.field4024, var4);
            }
            if (var5 == 2) {
                arg0.field4002 = 0;
                return;
            }
        } else if (arg3 == -1 || arg0.field4040 == -1 || class132.method905(true, arg3).field3671 >= class132.method905(true, arg0.field4040).field3671) {
            arg0.field3985 = arg2;
            arg0.field4040 = arg3;
            arg0.field4002 = 0;
            arg0.field4080 = 0;
            arg0.field3994 = 1;
            arg0.field4024 = 0;
            arg0.field4027 = arg0.field4052;
            if (arg0.field4040 != -1) {
                class116.method781(arg0.field4085, 236, arg0.field4019, class217.field3280 == arg0, arg0.field4024, class132.method905(arg1, arg0.field4040));
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IB)I")
    public abstract int method50(int arg0, byte arg1);
}
