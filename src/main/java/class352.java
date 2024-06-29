import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class352 extends class533 {

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Ltda;")
    public static class16 field4493 = new class16(0);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "[Lqd;")
    public static class378[] field4498;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "[Z")
    public static boolean[] field4495;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V", line = 11)
    public static final void method1933() {
        for (int var0 = class436.field5441; var0 < class391.field4927; var0++) {
            for (int var1 = 0; var1 < class429.field5383; var1++) {
                for (int var2 = 0; var2 < class37.field508; var2++) {
                    class75 var3 = class270.field3423[var0][var1][var2];
                    if (var3 != null) {
                        class597 var4 = var3.field1030;
                        class597 var5 = var3.field1026;
                        if (var4 != null && var4.method79((byte) -82)) {
                            class449.method2403(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method79((byte) -29)) {
                                class449.method2403(var5, var0, var1, var2, 1, 1);
                                var5.method77(false, 0, (byte) 106, class590.field8291, var4, 0, 0);
                                var5.method66(-1);
                            }
                            var4.method66(-1);
                        }
                        for (class138 var6 = var3.field1024; var6 != null; var6 = var6.field1789) {
                            class172 var8 = var6.field1786;
                            if (var8 != null && var8.method79((byte) -54)) {
                                class449.method2403(var8, var0, var1, var2, var8.field2254 + 1 - var8.field2247, var8.field2244 - var8.field2243 + 1);
                                var8.method66(-1);
                            }
                        }
                        class391 var7 = var3.field1031;
                        if (var7 != null && var7.method79((byte) -72)) {
                            class641.method3582(var7, var0, var1, var2);
                            var7.method66(-1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 87)
    public static void method1934(int arg0) {
        field4495 = null;
        field4493 = null;
        if (arg0 != 0) {
            field4498 = null;
        }
        field4498 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)Z", line = 104)
    public static final boolean method1935(byte arg0, int arg1, int arg2) {
        field4494++;
        if (arg0 != -55) {
            field4496 = -87;
        }
        return (arg1 & 0x70000) != 0 | class290.method1630((byte) 87, arg2, arg1) || class127.method678(68, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)Loq;")
    public abstract class660 method1794(boolean arg0);
}
