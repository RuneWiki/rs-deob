import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class4 extends class195 {

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lck;")
    public static class119 field116 = class298.method1987((byte) 113, "logo");

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "Z")
    public static boolean field119 = false;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field120 = 127;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field114 = 128;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public static int field123 = 0;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "Z")
    public static boolean field121 = false;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "Lck;")
    private static class119 field115 = class298.method1987((byte) 69, "flash2:");

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "Lck;")
    public static class119 field122 = field115;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "Lck;")
    public static class119 field112 = field115;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "Lck;")
    public static class119 field125 = null;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)[I", line = 9)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            return (int[]) null;
        }
        field113++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            class213.method1340(var3, 0, class157.field2504, this.field111);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V", line = 44)
    private class4(int arg0) {
        super(0, true);
        this.field111 = 4096;
        this.field111 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V", line = 31)
    public static void method77(byte arg0) {
        field122 = null;
        if (arg0 > -5) {
            method78(-10, -22, 104, 3, 17, (int[][]) ((int[][]) null));
        }
        field116 = null;
        field115 = null;
        field125 = null;
        field112 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 65)
    public class4() {
        this(4096);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII[[I)I", line = 76)
    public static final int method78(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5) {
        field117++;
        if (arg4 >= -7) {
            field121 = true;
        }
        int var6 = (128 - arg1) * arg5[arg0][arg2] + arg5[arg0 + 1][arg2] * arg1 >> 7;
        int var7 = (128 - arg1) * arg5[arg0][arg2 + 1] + arg5[arg0 + 1][arg2 + 1] * arg1 >> 7;
        return (128 - arg3) * var6 + arg3 * var7 >> 7;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lfj;II)V", line = 91)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field124++;
        if (arg1 <= -117 && arg2 == 0) {
            this.field111 = (arg0.method64((byte) -85) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBLva;)Lke;", line = 118)
    public static final class177 method79(int arg0, byte arg1, class36 arg2) {
        field118++;
        if (arg1 != 106) {
            field120 = -10;
        }
        byte[] var3 = arg2.method280(arg0, (byte) 76);
        return var3 == null ? null : new class177(var3);
    }
}
