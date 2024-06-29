import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class187 {

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "[J")
    public static long[] field2528 = new long[256];

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "F")
    public static float field2530;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)Lhr;")
    public static final class218 method1237(int arg0, byte arg1) {
        field2527++;
        class383[] var2 = class343.field5072;
        synchronized (class343.field5072) {
            if (arg1 <= 23) {
                method1239(-105);
            }
            class218 var3;
            if (arg0 >= class343.field5072.length || class343.field5072[arg0].method2365(32066)) {
                var3 = new class218();
                var3.field2902 = new class67[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field2902[var4] = new class67();
                }
            } else {
                var3 = (class218) class343.field5072[arg0].method2362((byte) 115);
                var3.method300((byte) 61);
                int var10002 = class270.field3537[arg0]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZIBIIF)[I")
    public static final int[] method1238(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, float arg7) {
        if (arg4 >= -74) {
            method1239(54);
        }
        field2529++;
        int[] var8 = new int[arg5];
        class68 var9 = new class68();
        var9.field1073 = arg0;
        var9.field1061 = arg6;
        var9.field1074 = arg1;
        var9.field1071 = arg3;
        var9.field1067 = (int) (arg7 * 4096.0F);
        var9.field1076 = arg2;
        var9.method2(6276);
        class435.method2586(0, arg5, 1);
        var9.method401(0, var8, 75);
        return var8;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field2528 = null;
        int var1 = -63 % ((arg0 - 27) / 35);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([Ljava/lang/String;B)V")
    public static final void method1240(String[] arg0, byte arg1) {
        field2526++;
        if (arg0.length > 1) {
            for (int var2 = 0; var2 < arg0.length; var2++) {
                if (arg0[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg0[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class600.method3415("Pausing for " + var3 + " seconds...", true);
                    class94.field1457 = var2 + 1;
                    class449.field6506 = arg0;
                    class332.field4822 = (long) (var3 * 1000) + class60.method371(false);
                    return;
                }
                class362.field5322 = arg0[var2];
                class512.method2898(false, 0);
            }
        } else {
            class362.field5322 = class362.field5322 + arg0[0];
        }
        if (arg1 != -128) {
            field2530 = -0.2548865F;
        }
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
            field2528[var0] = var1;
        }
    }
}
