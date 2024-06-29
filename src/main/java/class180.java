import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class180 {

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Lik;")
    public static class463 field2708 = new class463("", 11);

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "Lpf;")
    public static class425 field2711 = new class425(73, 8);

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Lns;")
    public static class55 field2712 = new class55(13, 17);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Liq;")
    public static class134 field2713;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[BBI)Z")
    public static final boolean method1091(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 > 0) {
            field2714 = 93;
        }
        field2706++;
        boolean var4 = true;
        class385 var5 = new class385(arg1);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method2339((byte) 40);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method2372(true);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method2343(255) >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < class115.field1522 - 1 && class198.field3004 - 1 > var16) {
                        class85 var17 = class411.method2575(0, var6);
                        if (var14 != 22 || class345.field5157 || var17.field1184 != 0 || var17.field1147 == 1 || var17.field1186) {
                            if (!var17.method558(0)) {
                                class360.field5319++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method2372(true);
                if (var10 == 0) {
                    break;
                }
                var5.method2343(255);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)Lnq;")
    public static final class433 method1092(boolean arg0, int arg1) {
        field2710++;
        class241 var2 = class427.field6296;
        class433 var3;
        synchronized (class427.field6296) {
            var3 = (class433) class427.field6296.method1491((long) arg1, 0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class377.field5503.method823(32, -20334, arg1);
        if (arg0) {
            method1094((class170[]) null, (byte) -16, 8);
        }
        class433 var5 = new class433();
        if (var4 != null) {
            var5.method2660((byte) 41, new class385(var4));
        }
        var5.method2657((byte) 125);
        class241 var6 = class427.field6296;
        synchronized (class427.field6296) {
            class427.field6296.method1488(128, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static void method1093(byte arg0) {
        field2712 = null;
        field2713 = null;
        field2708 = null;
        if (arg0 != 28) {
            field2712 = null;
        }
        field2711 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([Lfh;BI)V")
    public static final void method1094(class170[] arg0, byte arg1, int arg2) {
        field2707++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class170 var5 = arg0[var3];
            if (var5 != null) {
                if (var5.field2558 == 0) {
                    if (var5.field2625 != null) {
                        method1094(var5.field2625, (byte) 124, arg2);
                    }
                    class333 var6 = (class333) class308.field4647.method2302((long) var5.field2525, 23576);
                    if (var6 != null) {
                        class250.method1526((byte) -63, arg2, var6.field4965);
                    }
                }
                if (arg2 == 0 && var5.field2503 != null) {
                    class327 var7 = new class327();
                    var7.field4908 = var5.field2503;
                    var7.field4909 = var5;
                    class384.method2316(var7);
                }
                if (arg2 == 1 && var5.field2481 != null) {
                    if (var5.field2511 >= 0) {
                        class170 var8 = class168.method1020(var5.field2525, (byte) 111);
                        if (var8 == null || var8.field2625 == null || var5.field2511 >= var8.field2625.length || var8.field2625[var5.field2511] != var5) {
                            continue;
                        }
                    }
                    class327 var9 = new class327();
                    var9.field4908 = var5.field2481;
                    var9.field4909 = var5;
                    class384.method2316(var9);
                }
            }
        }
        int var4 = -52 % ((arg1 - 62) / 58);
    }
}
