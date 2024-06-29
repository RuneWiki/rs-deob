import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class401 {

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public int field5484;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "F")
    public static float field5485;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Lkr;")
    public static class329 field5486;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static void method2404(int arg0) {
        field5486 = null;
        if (arg0 != -9549) {
            method2405(null, null, -18);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([[BLjda;I)V")
    public static final void method2405(byte[][] arg0, class277 arg1, int arg2) {
        field5483++;
        for (int var3 = arg2; var3 < arg1.field1271; var3++) {
            class147.method802((byte) 49);
            for (int var4 = 0; var4 < class139.field1760 >> 3; var4++) {
                for (int var5 = 0; var5 < (class369.field5135 >> 3); var5++) {
                    int var6 = class270.field3439[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg1.field1257 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFE913) >> 14;
                            int var10 = (var6 & 0x3FFA) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class258.field3206.length; var12++) {
                                if (class258.field3206[var12] == var11 && arg0[var12] != null) {
                                    arg1.method1712((var10 & 0x7) * 8, (byte) 123, var5 * 8, arg0[var12], var8, class301.field3918, (var9 & 0x7) * 8, var7, class15.field154, var3, var4 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5487++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class401(String arg0, int arg1) {
        this.field5484 = arg1;
    }
}
