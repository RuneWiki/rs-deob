import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class391 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Ld;")
    public static class270 field5627;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    public static int[] field5626;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2454(int arg0) {
        field5625++;
        short var1 = 1024;
        short var2 = 3072;
        if (class301.field4261) {
            if (class701.field9780) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if (class589.field8028 < (float) var1) {
            class589.field8028 = var1;
        }
        while (class596.field8093 >= 16384.0F) {
            class596.field8093 -= 16384.0F;
        }
        if ((float) var2 < class589.field8028) {
            class589.field8028 = var2;
        }
        while (class596.field8093 < 0.0F) {
            class596.field8093 += 16384.0F;
        }
        int var3 = class316.field4388 >> 9;
        int var4 = class357.field5123 >> 9;
        int var5 = class737.method4102((byte) 19, class316.field4388, class357.field5123, class96.field1331);
        int var6 = 0;
        if (arg0 > -54) {
            return;
        }
        if (var3 > 3 && var4 > 3 && (class277.field4036 - 4) > var3 && (class667.field9202 - 4) > var4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class96.field1331;
                    if (var9 < 3 && class479.method2918(var8, true, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class647.field8683.field5471 != null && class647.field8683.field5471[var9] != null) {
                        var10 = (class647.field8683.field5471[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class433.field6043 != null && class433.field6043[var9] != null) {
                        int var11 = var5 + var10 - class433.field6043[var9].method2171(var8, var7, 31);
                        if (var6 < var11) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class302.field4268 < var12) {
            class302.field4268 += (var12 - class302.field4268) / 24;
        } else if (class302.field4268 > var12) {
            class302.field4268 += (var12 - class302.field4268) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 116)
    public static void method2455(int arg0) {
        if (arg0 <= 20) {
            method2456(53, -78);
        }
        field5627 = null;
        field5626 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I", line = 128)
    public static final int method2456(int arg0, int arg1) {
        return class644.field8632 == null ? 0 : class644.field8632[arg0][arg1] & 0xFFFFFF;
    }
}
