import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class162 extends class105 {

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    private int field2946 = 4096;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    private int field2950 = 4096;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    private int field2948 = 4096;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field2944 = 0;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "[I")
    public static int[] field2949 = new int[1000];

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "[Loe;")
    public static class108[] field2945;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field2951;
        int[][] var3 = super.field1870.method569((byte) -111, arg0);
        if (super.field1870.field1567) {
            int[][] var4 = this.method702((byte) 94, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class94.field1668; ++var11) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field2948 * var12 >> 12;
                    var9[var11] = this.field2946 * var13 >> 12;
                    var10[var11] = this.field2950 * var14 >> 12;
                } else {
                    var8[var11] = this.field2948;
                    var9[var11] = this.field2946;
                    var10[var11] = this.field2950;
                }
            }
        }
        if (arg1 > -110) {
            method1072(-87, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class162() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 == 255) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        this.field2950 = arg2.method927(arg1 ^ 130);
                    }
                } else {
                    this.field2946 = arg2.method927(125);
                }
            } else {
                this.field2948 = arg2.method927(arg1 ^ 129);
            }
            ++field2953;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZ)V")
    public static final void method1072(int arg0, boolean arg1) {
        ++field2947;
        class68.field1304 = arg1;
        class43.field964 = !class231.method1561(25088);
        int var2 = -72 % ((arg0 - 25) / 55);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static void method1073(byte arg0) {
        field2945 = null;
        field2949 = null;
        if (arg0 != -22) {
            method1073((byte) 85);
        }
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static final void method1074(int arg0) {
        ++class98.field1732;
        ++field2952;
        class55.field1133.method1863(true, 61);
        int var1 = 68 % ((-37 - arg0) / 38);
        for (class181 var2 = (class181) class49.field1042.method1851(false); var2 != null; var2 = (class181) class49.field1042.method1847(false)) {
            if (~var2.field3219 == -1) {
                class40.method338(var2, -2, true);
            }
        }
        if (class209.field3760 != null) {
            class176.method1145((byte) -74, class209.field3760);
            class209.field3760 = null;
        }
    }
}
