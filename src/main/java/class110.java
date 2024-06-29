import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class110 extends class33 {

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Z")
    public static boolean field2045 = false;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "Lrd;")
    private static class173 field2042 = class133.method843("purple:", 39);

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field2041 = 0;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "Lrd;")
    public static class173 field2046 = field2042;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "Lrd;")
    public static class173 field2049 = field2042;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "Lbc;")
    public static class14 field2043;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = -9 / ((arg1 - -65) / 60);
        ++field2048;
        int[] var4 = super.field718.method514(arg0, 125);
        if (super.field718.field1615) {
            int[] var5 = this.method262(arg0, -103, 0);
            for (int var6 = 0; var6 < class117.field2173; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field2044;
        int[][] var3 = super.field731.method1340(-126, arg1);
        if (super.field731.field3925) {
            int[][] var4 = this.method259(0, -9, arg1);
            int[] var5 = var3[0];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class117.field2173 > var11; ++var11) {
                var5[var11] = -var6[var11] + 4096;
                var9[var11] = -var7[var11] + 4096;
                var10[var11] = -var8[var11] + 4096;
            }
        }
        if (arg0 < 112) {
            field2041 = 21;
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V")
    public static void method667(int arg0) {
        field2046 = null;
        field2049 = null;
        field2043 = null;
        if (arg0 != 0) {
            field2041 = -12;
        }
        field2042 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field2040;
        if (arg1 >= -99) {
            field2043 = null;
        }
        if (~arg0 == -1) {
            super.field729 = arg2.method751((byte) -21) == 1;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)V")
    public static final void method668(int arg0, int arg1) {
        int var2 = 16 % ((arg0 - -40) / 35);
        if (arg1 == -1 && !class138.field2588) {
            class214.method1408((byte) -46);
        } else if (~arg1 != 0 && (~class170.field3282 != ~arg1 || !class114.method705(false)) && class211.field4079 != 0 && !class138.field2588) {
            class46.method325(0, 2, class114.field2106, arg1, 1, class211.field4079, false);
        }
        ++field2039;
        class170.field3282 = arg1;
    }
}
