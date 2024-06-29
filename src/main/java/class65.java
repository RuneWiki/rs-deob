import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class65 extends class456 {

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "Lo;")
    public static class332 field896 = new class332("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "Lsh;")
    public static class472 field899 = new class472(65, 2);

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "Lsh;")
    public static class472 field900 = new class472(31, 14);

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "Lsh;")
    public static class472 field901 = new class472(27, -1);

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "[I")
    public static int[] field902;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method212(int arg0, int arg1) {
        ++field895;
        if (arg0 != 0) {
            return null;
        } else {
            int[][] var3 = super.field6468.method1090(-2, arg1);
            if (super.field6468.field2227) {
                int[][] var4 = this.method2709(false, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class156.field2169; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLre;)V", line = 53)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.method210(7, (byte) 101, (class446) null);
        }
        ++field894;
        if (arg0 == 0) {
            super.field6486 = arg2.method2628(49152) == 1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 66)
    public class65() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 69)
    public static void method595(byte arg0) {
        field902 = null;
        field901 = null;
        field900 = null;
        field896 = null;
        if (arg0 > 107) {
            field899 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I", line = 86)
    public final int[] method33(int arg0, int arg1) {
        ++field897;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            this.method210(123, (byte) 126, (class446) null);
        }
        if (super.field6466.field6153) {
            int[] var4 = this.method2707(arg1, arg0 ^ 31796, 0);
            for (int var5 = 0; var5 < class156.field2169; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }
}
