import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class156 {

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Leba;")
    public static class550 field2189 = new class550(89, -2);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "F")
    public static float field2186;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 6)
    public static void method904(boolean arg0) {
        field2189 = null;
        if (!arg0) {
            field2192 = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lnu;I[I[I[I)V", line = 17)
    public static final void method905(class351 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        field2188++;
        if (arg1 > -21) {
            field2192 = 26;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field3047.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field3047[var9] = null;
                    } else {
                        class186 var10 = class423.field5620.method1707(var6, 117);
                        int var11 = var10.field2584;
                        class405 var12 = arg0.field3047[var9];
                        if (var12 != null) {
                            if (var12.field5350 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field3047[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5348 = 0;
                                    var12.field5346 = var8;
                                    var12.field5347 = 0;
                                    var12.field5352 = 0;
                                    var12.field5351 = 1;
                                    class615.method3398(0, arg0.field398, var10, -1773, arg0.field397, arg0.field385, false);
                                } else if (var11 == 2) {
                                    var12.field5348 = 0;
                                }
                            } else if (var10.field2572 >= class423.field5620.method1707(var12.field5350, -89).field2572) {
                                var12 = arg0.field3047[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class405 var13 = arg0.field3047[var9] = new class405();
                            var13.field5352 = 0;
                            var13.field5350 = var6;
                            var13.field5351 = 1;
                            var13.field5348 = 0;
                            var13.field5346 = var8;
                            var13.field5347 = 0;
                            class615.method3398(0, arg0.field398, var10, -1773, arg0.field397, arg0.field385, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 116)
    public static final void method906(int arg0) {
        field2187++;
        class294 var1 = (class294) class58.field743.method2506(68);
        boolean var2 = class85.field1028 != null || class182.field2544 > 0;
        if (var2) {
            class152.field2092 = 1;
        }
        if (arg0 > -104) {
            return;
        }
        if (class482.field6723 && class643.field8914.method2106((byte) -114, 81) && class137.field1873 > 2) {
            if (var2) {
                class61.field759 = (class354) class101.field1211.field5887.field547.field547;
            } else {
                class342.method1988(var1.method451((byte) -60), (class354) class101.field1211.field5887.field547.field547, var1.method454(-3), -124);
            }
        } else if (var2) {
            class61.field759 = (class354) class101.field1211.field5887.field547;
        } else {
            class342.method1988(var1.method451((byte) -85), (class354) class101.field1211.field5887.field547, var1.method454(-3), -127);
        }
    }
}
