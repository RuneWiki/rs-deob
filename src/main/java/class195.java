import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class195 {

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "[B")
    public static byte[] field2646 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Z")
    public static volatile boolean field2648 = false;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2649 = "scroll:";

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Lcs;")
    public static class189 field2647 = new class189(8);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLre;)V", line = 5)
    public static final void method1238(boolean arg0, class358 arg1) {
        field2645++;
        if (class433.field6324 >= 400) {
            return;
        }
        if (!arg0) {
            method1240(14);
        }
        class335 var2 = arg1.field5229;
        if (var2.field4984 != null) {
            var2 = var2.method2162(0);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field4921) {
            return;
        }
        String var3 = var2.field4968;
        if (var2.field4960 != 0) {
            String var4 = class136.field1912 == 1 ? class206.field2807 : class433.field6328;
            var3 = var3 + class301.method1902(class390.field5715.field1827, -55, var2.field4960) + " (" + var4 + var2.field4960 + ")";
        }
        if (class423.field6070 == 1) {
            class70.method411(39, class179.field2467, class318.field4526 + " -> <col=ffff00>" + var3, class423.field6069, 0, 0, 0, (long) arg1.field6279);
            class184.field2519++;
        } else if (class271.field3842) {
            class176 var12 = class43.field535 == -1 ? null : class349.method2223(!arg0, class43.field535);
            if ((class289.field4103 & 0x2) != 0) {
                if (var12 == null || var2.method2161(var12.field2451, 124, class43.field535) != var12.field2451) {
                    class160.field2271++;
                    class70.method411(12, class110.field1275, class75.field825 + " -> <col=ffff00>" + var3, class338.field5007, 0, 0, 0, (long) arg1.field6279);
                }
                return;
            }
        } else {
            String[] var5 = var2.field4959;
            if (class166.field2322) {
                var5 = class310.method1941(var5, (byte) 109);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && (class136.field1912 != 0 || !var5[var6].equalsIgnoreCase(class52.field596))) {
                        byte var7 = 0;
                        if (var6 == 0) {
                            var7 = 15;
                        }
                        int var8 = class207.field2818;
                        if (var6 == 1) {
                            var7 = 51;
                        }
                        if (var6 == 2) {
                            var7 = 6;
                        }
                        if (var6 == 3) {
                            var7 = 13;
                        }
                        if (var2.field4928 == var6) {
                            var8 = var2.field4970;
                        }
                        if (var6 == 4) {
                            var7 = 46;
                        }
                        if (var2.field4976 == var6) {
                            var8 = var2.field4933;
                        }
                        class70.method411(var7, var5[var6], "<col=ffff00>" + var3, var8, 0, 0, 0, (long) arg1.field6279);
                        class249.field3376++;
                    }
                }
            }
            if (class136.field1912 == 0 && var5 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var5[var9] != null && var5[var9].equalsIgnoreCase(class52.field596)) {
                        short var10 = 0;
                        if (class390.field5715.field1827 < var2.field4960) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 15;
                        }
                        if (var9 == 1) {
                            var11 = 51;
                        }
                        if (var9 == 2) {
                            var11 = 6;
                        }
                        if (var9 == 3) {
                            var11 = 13;
                        }
                        if (var9 == 4) {
                            var11 = 46;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class57.field646++;
                        class70.method411(var11, var5[var9], "<col=ffff00>" + var3, var2.field4962, 0, 0, 0, (long) arg1.field6279);
                    }
                }
            }
            class70.method411(1009, class291.field4175, "<col=ffff00>" + var3, class438.field6424, 0, 0, 0, (long) arg1.field6279);
            class248.field3370++;
            return;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)V", line = 177)
    public static final void method1239(boolean arg0, int arg1) {
        class433.field6248 = -1;
        class379.field5570 = arg0;
        class419.field6026 = -1;
        class30.field272 = 1;
        class397.field5794 = null;
        field2650++;
        class246.field3349 = 0;
        class337.field5001 = arg1;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V", line = 193)
    public static void method1240(int arg0) {
        if (arg0 == 46) {
            field2649 = null;
            field2647 = null;
            field2646 = null;
        }
    }
}
