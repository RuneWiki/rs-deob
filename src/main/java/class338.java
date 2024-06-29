import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class338 {

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[J")
    public static long[] field5268 = new long[256];

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field5269 = 0;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5273;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5272;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Lak;")
    public static class172 field5274;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIII)V", line = 7)
    public static final void method2353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class20 var7 = new class20();
        var7.field279 = arg1 / 128;
        var7.field273 = arg2 / 128;
        var7.field296 = arg3 / 128;
        var7.field278 = arg4 / 128;
        var7.field280 = arg0;
        var7.field272 = arg1;
        var7.field285 = arg2;
        var7.field274 = arg3;
        var7.field294 = arg4;
        var7.field290 = arg5;
        var7.field275 = arg6;
        class261.field4167[class336.field5259++] = var7;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 25)
    public static final void method2354(int arg0) {
        for (int var1 = -1; var1 < class275.field4435; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class160.field2656[var1];
            }
            class334 var3 = class74.field1049[var2];
            if (var3 != null && var3.field4257 > 0) {
                var3.field4257--;
                if (var3.field4257 == 0) {
                    var3.field4240 = null;
                }
            }
        }
        if (arg0 != 2047) {
            method2354(86);
        }
        field5265++;
        for (int var4 = 0; var4 < class233.field3736; var4++) {
            int var5 = class142.field2225[var4];
            class234 var6 = class99.field1445[var5];
            if (var6 != null && var6.field4257 > 0) {
                var6.field4257--;
                if (var6.field4257 == 0) {
                    var6.field4240 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 84)
    public static void method2355(int arg0) {
        field5274 = null;
        field5273 = null;
        field5272 = null;
        field5268 = null;
        if (arg0 != 20930) {
            field5274 = (class172) null;
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
            field5268[var0] = var1;
        }
        field5273 = "Select";
        field5272 = "";
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V", line = 103)
    public static final void method2356(int arg0) {
        field5267++;
        class149.field2303++;
        class194.field3175.method2375(138, 0);
        int var1 = 91 / ((-arg0 - 74) / 44);
        class194.field3175.method287(0, class39.field502);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 115)
    public static final void method2357(boolean arg0) {
        field5266++;
        if (!arg0) {
            class303.field4754.method707(0);
            class83.field1170.method707(0);
            class195.field3188.method707(0);
            class169.field2799.method707(0);
        }
    }
}
