import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class105 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Leb;")
    public static class230 field1906 = null;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[J")
    public static long[] field1907 = new long[256];

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[[B")
    public static byte[][] field1908;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lkk;")
    public static class223 field1909;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILge;)V")
    public static final void method878(int arg0, class69 arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class246.field4380.length; var3++) {
            class246.field4380[var3] = 0;
        }
        field1905++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class246.field4380[var16] = (int) (Math.random() * 284.0D);
        }
        if (arg0 != -808) {
            return;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class92.field1664[var15] = (class246.field4380[var15 - 128] + class246.field4380[var15 - 1] + class246.field4380[var15 - -1] + class246.field4380[var15 + 128]) / 4;
                }
            }
            int[] var13 = class246.field4380;
            class246.field4380 = class92.field1664;
            class92.field1664 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field867; var7++) {
            for (int var8 = 0; var8 < arg1.field861; var8++) {
                if (arg1.field1281[var6++] != 0) {
                    int var9 = var8 + arg1.field864 + 16;
                    int var10 = arg1.field862 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class246.field4380[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method879(int arg0) {
        field1908 = null;
        if (arg0 != 32) {
            field1909 = null;
        }
        field1906 = null;
        field1909 = null;
        field1907 = null;
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
            field1907[var0] = var1;
        }
        field1908 = new byte[250][];
        field1911 = 0;
    }
}
