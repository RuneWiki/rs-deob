import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class232 extends class335 {

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    private int field3671 = 3072;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    private int field3670 = 2048;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    private int field3676 = 1024;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "Z")
    public static boolean field3672 = true;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "Z")
    public static boolean field3674 = true;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "[[I")
    public static int[][] field3679 = new int[5][5000];

    @OriginalMember(owner = "client!le", name = "M", descriptor = "Z")
    public static boolean field3668 = false;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field3681 = "Loaded wordpack";

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 6)
    public final void method381(int arg0) {
        int var2 = -85 / ((arg0 - 44) / 35);
        field3682++;
        this.field3670 = this.field3671 - this.field3676;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ll;I)I", line = 17)
    public static final int method1633(class133 arg0, int arg1) {
        field3680++;
        if (arg1 != -19813) {
            field3679 = (int[][]) ((int[][]) null);
        }
        int var2 = 0;
        if (arg0.method956(class53.field900, true)) {
            var2++;
        }
        if (arg0.method956(class189.field2846, true)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V", line = 39)
    public static void method1634(int arg0) {
        if (arg0 == 1871015462) {
            field3681 = null;
            field3679 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 184)
    public class232() {
        super(1, false);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[[I", line = 64)
    public final int[][] method249(int arg0, byte arg1) {
        field3667++;
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (arg1 != 51) {
            this.method249(-53, (byte) -116);
        }
        if (this.field5232.field2446) {
            int[][] var4 = this.method2328(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class105.field1630; var11++) {
                var8[var11] = (var5[var11] * this.field3670 >> 12) + this.field3676;
                var9[var11] = this.field3676 + (var6[var11] * this.field3670 >> 12);
                var10[var11] = this.field3676 + (var7[var11] * this.field3670 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)I", line = 133)
    public static final int method1635(int arg0, boolean arg1) {
        int var2 = arg0 & 0x3F;
        field3673++;
        int var3 = (arg0 & 0xE8) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg1) {
            method1635(-9, true);
        }
        return 0;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[I", line = 194)
    public final int[] method149(int arg0, int arg1) {
        field3678++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(arg0, true, 0);
            for (int var5 = 0; var5 < class105.field1630; var5++) {
                var3[var5] = this.field3676 + (var4[var5] * this.field3670 >> 12);
            }
        }
        if (arg1 != 621) {
            field3679 = (int[][]) ((int[][]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILkh;I)V", line = 227)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field3669++;
        if (arg2 <= 51) {
            this.method381(-86);
        }
        if (arg0 == 0) {
            this.field3676 = arg1.method1151(-104);
        } else if (arg0 == 1) {
            this.field3671 = arg1.method1151(-71);
        } else if (arg0 == 2) {
            this.field5234 = arg1.method1178(0) == 1;
        }
    }
}
