import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class304 extends class62 {

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "Lok;")
    public static class41 field5068 = class137.method956("Loading world list data", 45);

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "Lok;")
    public static class41 field5069 = class137.method956("logo", 45);

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "[I")
    public static int[] field5066 = new int[99];

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!c", name = "vb", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IZ)[[I", line = 11)
    public final int[][] method168(int arg0, boolean arg1) {
        int[][] var3 = this.field1764.method876(arg1, arg0);
        field5070++;
        if (this.field1764.field1836 && this.method437(112)) {
            int[] var4 = var3[0];
            int var5 = arg0 % this.field911 * this.field911;
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class307.field5160; var8++) {
                int var9 = this.field914[var5 + (var8 % this.field922)];
                var6[var8] = class217.method1563(4080, var9 << 4);
                var7[var8] = class217.method1563(65280, var9) >> 4;
                var4[var8] = class217.method1563(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5066[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V", line = 69)
    public static void method2093(boolean arg0) {
        field5066 = null;
        field5068 = null;
        if (arg0) {
            field5069 = (class41) null;
        }
        field5069 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[B)I", line = 83)
    public static final int method2094(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = 62 / ((arg2 - 42) / 60);
        int var5 = -1;
        for (int var6 = arg0; var6 < arg1; var6++) {
            var5 = class193.field3113[(arg3[var6] ^ var5) & 0xFF] ^ var5 >>> 8;
        }
        int var7 = ~var5;
        field5071++;
        return var7;
    }
}
