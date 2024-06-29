import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class159 extends class231 {

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[J")
    public static long[] field2476 = new long[256];

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Lwd;")
    public static class232 field2478;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "[I")
    public static int[] field2477;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V", line = 8)
    public static final void method1100(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class322.field5024; var3++) {
            for (int var4 = 0; var4 < class228.field3650; var4++) {
                for (int var5 = 0; var5 < class84.field1276; var5++) {
                    class174 var6 = class90.field1375[var3][var4][var5];
                    if (var6 != null) {
                        class157 var7 = var6.field2672;
                        if (var7 != null && var7.field2454.method643()) {
                            class207.method1386(var7.field2454, var3, var4, var5, 1, 1);
                            if (var7.field2451 != null && var7.field2451.method643()) {
                                class207.method1386(var7.field2451, var3, var4, var5, 1, 1);
                                var7.field2454.method641(var7.field2451, 0, 0, 0, false);
                                var7.field2451 = var7.field2451.method642(arg0, arg1, arg2);
                            }
                            var7.field2454 = var7.field2454.method642(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2655; var8++) {
                            class272 var9 = var6.field2671[var8];
                            if (var9 != null && var9.field4173.method643()) {
                                class207.method1386(var9.field4173, var3, var4, var5, var9.field4185 + 1 - var9.field4169, var9.field4181 - var9.field4186 + 1);
                                var9.field4173 = var9.field4173.method642(arg0, arg1, arg2);
                            }
                        }
                        class23 var10 = var6.field2667;
                        if (var10 != null && var10.field285.method643()) {
                            method1101(var10.field285, var3, var4, var5);
                            var10.field285 = var10.field285.method642(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lfe;III)V", line = 77)
    private static final void method1101(class94 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class228.field3650) {
            class174 var4 = class90.field1375[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2667 != null && var4.field2667.field285.method643()) {
                arg0.method641(var4.field2667.field285, 128, 0, 0, true);
            }
        }
        if (arg3 < class228.field3650) {
            class174 var5 = class90.field1375[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2667 != null && var5.field2667.field285.method643()) {
                arg0.method641(var5.field2667.field285, 0, 0, 128, true);
            }
        }
        if (arg2 < class228.field3650 && arg3 < class84.field1276) {
            class174 var6 = class90.field1375[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2667 != null && var6.field2667.field285.method643()) {
                arg0.method641(var6.field2667.field285, 128, 0, 128, true);
            }
        }
        if (arg2 < class228.field3650 && arg3 > 0) {
            class174 var7 = class90.field1375[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2667 != null && var7.field2667.field285.method643()) {
                arg0.method641(var7.field2667.field285, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 125)
    public static void method1102(int arg0) {
        field2476 = null;
        field2478 = null;
        if (arg0 < -87) {
            field2477 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)J", line = 139)
    public static final long method1103(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        return var3 == null || var3.field2650 == null ? 0L : var3.field2650.field2392;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2476[var0] = var1;
        }
    }
}
