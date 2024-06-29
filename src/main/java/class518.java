import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class518 extends class362 {

    @OriginalMember(owner = "client!np", name = "A", descriptor = "[J")
    public static long[] field7038 = new long[32];

    @OriginalMember(owner = "client!np", name = "E", descriptor = "Laca;")
    public static class758 field7041 = new class758(5, 1);

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BB)Z")
    public static final boolean method2952(byte arg0, byte arg1) {
        int var2 = 120 % ((arg0 - 5) / 57);
        ++field7037;
        int var3 = arg1 & 255;
        if (var3 == 0) {
            return false;
        } else {
            return var3 < 128 || var3 >= 160 || ~class762.field10525[var3 + -128] != -1;
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(B)V")
    public static final void method2953(byte arg0) {
        class205.field3095.method480(((float) class111.field1911.field6726.method53((byte) 118) * 0.1F + 0.7F) * class454.field6197);
        ++field7040;
        if (arg0 != -26) {
            field7041 = null;
        }
        class205.field3095.method590(class339.field4580, class177.field2786, class65.field932, (float) (class752.field10378 << 2), (float) (class680.field9469 << 2), (float) (class571.field8134 << 2));
        class205.field3095.method596(class408.field5594);
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
    public class518() {
        super(1, true);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        if (arg0 != -2026769311) {
            field7038 = null;
        }
        ++field7036;
        int[] var3 = super.field4927.method808(arg0 ^ 2026769379, arg1);
        if (super.field4927.field1471) {
            int[][] var4 = this.method2222(0, arg1, 28008);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class769.field10597; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(B)V")
    public static void method2954(byte arg0) {
        field7041 = null;
        field7038 = null;
        if (arg0 >= -71) {
            field7038 = null;
        }
    }
}
