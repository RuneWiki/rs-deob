import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class553 extends class430 {

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "S")
    public static short field8050 = 1;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J")
    public abstract long method763(int arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
    public abstract int method759(byte arg0);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)I")
    public abstract int method760(int arg0);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
    public static final void method3324(boolean arg0) {
        field8049++;
        short var1 = 1024;
        short var2 = 3072;
        if (class100.field1447) {
            if (class223.field3285) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if (class112.field1584 < (float) var1) {
            class112.field1584 = var1;
        }
        while (class680.field9668 >= 16384.0F) {
            class680.field9668 -= 16384.0F;
        }
        if ((float) var2 < class112.field1584) {
            class112.field1584 = var2;
        }
        while (class680.field9668 < 0.0F) {
            class680.field9668 += 16384.0F;
        }
        int var3 = class646.field9302 >> 9;
        int var4 = class537.field7811 >> 9;
        int var5 = class530.method3211(class537.field7811, 2, class646.field9302, class687.field9758);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && class184.field2546 - 4 > var3 && var4 < class240.field3555 - 4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= (var4 + 4); var8++) {
                    int var9 = class687.field9758;
                    if (var9 < 3 && class547.method3292((byte) -98, var8, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class631.field8928.field7256 != null && class631.field8928.field7256[var9] != null) {
                        var10 = (class631.field8928.field7256[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class95.field1372 != null && class95.field1372[var9] != null) {
                        int var11 = var5 + var10 - class95.field1372[var9].method2087(119, var7, var8);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (arg0) {
            return;
        }
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class328.field4449 < var12) {
            class328.field4449 += (var12 - class328.field4449) / 24;
        } else if (var12 < class328.field4449) {
            class328.field4449 += (var12 - class328.field4449) / 80;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)I")
    public abstract int method762(int arg0);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)I")
    public abstract int method761(boolean arg0);
}
