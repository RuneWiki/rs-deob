import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class347 {

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Z")
    public static boolean field4935 = true;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lin;")
    public static class380 field4936 = new class380(42, 9);

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field4939 = -1;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "J")
    public static long field4937 = 0L;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method2116(boolean arg0, byte[] arg1) {
        if (!arg0) {
            method2116(false, null);
        }
        field4934++;
        class431 var2 = new class431(arg1);
        int var3 = var2.method2557(14929);
        int var4 = var2.method2526(17);
        if (var4 < 0 || !(class459.field6269 == 0 || var4 <= class459.field6269)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2530(-79, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method2526(17);
            if (var6 < 0 || class459.field6269 != 0 && var6 > class459.field6269) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class196.method1390(var7, var6, arg1, var4, 9);
            } else {
                class631 var8 = class442.field6123;
                synchronized (class442.field6123) {
                    class442.field6123.method3603(var2, 116, var7);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lnfa;)V")
    public static final void method2117(class745 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class745 var2 = null;
            for (class745 var3 = class5.field74[var1]; var3 != null; var3 = var3.field10360) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class5.field74[var1] = var3.field10360;
                    } else {
                        var2.field10360 = var3.field10360;
                    }
                    class87.field1297 = true;
                    return;
                }
                var2 = var3;
            }
            class745 var4 = null;
            for (class745 var5 = class277.field3997[var1]; var5 != null; var5 = var5.field10360) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class277.field3997[var1] = var5.field10360;
                    } else {
                        var4.field10360 = var5.field10360;
                    }
                    class87.field1297 = true;
                    return;
                }
                var4 = var5;
            }
            class745 var6 = null;
            for (class745 var7 = class407.field5602[var1]; var7 != null; var7 = var7.field10360) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class407.field5602[var1] = var7.field10360;
                    } else {
                        var6.field10360 = var7.field10360;
                    }
                    class87.field1297 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public static void method2118(byte arg0) {
        field4936 = null;
        if (arg0 >= -18) {
            method2118((byte) 93);
        }
    }
}
