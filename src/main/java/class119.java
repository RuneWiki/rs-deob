import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class119 extends class87 {

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    private int field1930 = 2048;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    private int field1934 = 1024;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    private int field1936 = 3072;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "Z")
    public static boolean field1933 = true;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "Z")
    public static boolean field1937 = false;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field1932 = 0;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "[S")
    public static short[] field1938 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field1924;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, arg0, !arg1);
            for (int var5 = 0; ~var5 > ~class206.field3032; ++var5) {
                var3[var5] = (var4[var5] * this.field1930 >> 12) + this.field1934;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        this.field1930 = -this.field1934 + this.field1936;
        ++field1929;
        if (arg0 != 0) {
            method888(-31);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public static final void method887(byte arg0) {
        class136.field2219.method1422((byte) 114);
        if (arg0 <= -91) {
            ++field1923;
            class275.field4452.method1422((byte) -78);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field1935;
        if (arg1 != 6) {
            field1932 = 69;
        }
        int[][] var3 = super.field1390.method1902(arg1 ^ -107, arg0);
        if (super.field1390.field4428) {
            int[][] var4 = this.method648(arg0, arg1 ^ 15, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class206.field3032; ++var11) {
                var9[var11] = (var5[var11] * this.field1930 >> 12) + this.field1934;
                var8[var11] = (var6[var11] * this.field1930 >> 12) + this.field1934;
                var10[var11] = (var7[var11] * this.field1930 >> 12) + this.field1934;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public static void method888(int arg0) {
        if (arg0 != 4626) {
            field1928 = -119;
        }
        field1938 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            method888(124);
        }
        ++field1925;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1381 = ~arg0.method366(-16505) == -2;
                }
            } else {
                this.field1936 = arg0.method331(-18);
            }
        } else {
            this.field1934 = arg0.method331(-124);
        }
    }
}
