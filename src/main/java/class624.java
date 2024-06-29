import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class624 {

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "Lbfa;")
    public class368 field8974 = new class368();

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "[Lbh;")
    public static class36[] field8970 = new class36[8];

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "Lqu;")
    public static class96 field8975 = new class96();

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "Lqca;")
    public static class115 field8976 = new class115(12, 0, 1, 0);

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lak;I[I[I[I)V")
    public static final void method3608(class349 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg1 >= -119) {
            field8970 = null;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && arg0.field937.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field937[var9] = null;
                    } else {
                        class718 var10 = class698.field9806.method851(var6, -2);
                        int var11 = var10.field10061;
                        class114 var12 = arg0.field937[var9];
                        if (var12 != null) {
                            if (var12.field1824 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field937[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1822 = 0;
                                    var12.field1825 = 0;
                                    var12.field1831 = 1;
                                    var12.field1827 = 0;
                                    var12.field1823 = var8;
                                    if (!arg0.field892) {
                                        class749.method4165(0, (byte) 80, var10, arg0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1825 = 0;
                                }
                            } else if (var10.field10064 >= class698.field9806.method851(var12.field1824, -2).field10064) {
                                var12 = arg0.field937[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class114 var13 = arg0.field937[var9] = new class114();
                            var13.field1823 = var8;
                            var13.field1831 = 1;
                            var13.field1825 = 0;
                            var13.field1822 = 0;
                            var13.field1824 = var6;
                            var13.field1827 = 0;
                            if (!arg0.field892) {
                                class749.method4165(0, (byte) 121, var10, arg0);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field8972++;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public static void method3609(boolean arg0) {
        if (!arg0) {
            method3608(null, 92, null, null, null);
        }
        field8975 = null;
        field8970 = null;
        field8976 = null;
    }
}
