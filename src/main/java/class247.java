import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class247 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[[I")
    public static int[][] field4370 = new int[104][104];

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
    public static int[] field4372 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lha;")
    public static class46 field4369 = class271.method1828("huffman", -46);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lpi;")
    public static class181 field4371;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lfa;")
    public static class211 field4374;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    public static int[] field4373;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZJII)Lha;")
    public static final class46 method1682(boolean arg0, long arg1, int arg2, int arg3) {
        field4368++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var5 = 1;
        for (long var6 = arg1 / (long) arg2; var6 != 0L; var6 /= (long) arg2) {
            var5++;
        }
        int var8 = var5;
        if (arg1 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg1 % (long) arg2);
            arg1 /= (long) arg2;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        if (arg3 != 39) {
            method1683((byte) -110);
        }
        class46 var11 = new class46();
        var11.field762 = var8;
        var11.field768 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method1683(byte arg0) {
        if (arg0 < 5) {
            field4374 = null;
        }
        field4369 = null;
        field4371 = null;
        field4370 = null;
        field4372 = null;
        field4374 = null;
        field4373 = null;
    }
}
