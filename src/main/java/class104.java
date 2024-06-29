import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class104 extends class43 {

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    private int field1946 = 4096;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    private int field1947 = 4096;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    private int field1949 = 4096;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "Llj;")
    public static class129 field1948 = new class129();

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "Lmb;")
    public static class132 field1953 = class166.method1092("(U0a )2 via: ", 121);

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field1951 = 255;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "Lmb;")
    public static class132 field1955 = class166.method1092(" GMT", 124);

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "Lpb;")
    public static class165 field1957;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "[I")
    public static int[] field1950;

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class104() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field1954;
        if (arg1 != -73) {
            this.method203(-93, 33);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1946 = arg2.method739(64);
                }
            } else {
                this.field1947 = arg2.method739(-125);
            }
        } else {
            this.field1949 = arg2.method739(-127);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        ++field1956;
        if (arg0 != -1893) {
            field1957 = null;
        }
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960) {
            int[][] var4 = this.method301(arg1, (byte) 102, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class131.field2427; ++var11) {
                int var12 = var8[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var7[var11] = this.field1949 * var12 >> 12;
                    var9[var11] = this.field1947 * var13 >> 12;
                    var10[var11] = this.field1946 * var14 >> 12;
                } else {
                    var7[var11] = this.field1949;
                    var9[var11] = this.field1947;
                    var10[var11] = this.field1946;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
    public static void method644(int arg0) {
        field1953 = null;
        field1948 = null;
        field1950 = null;
        if (arg0 != 22931) {
            method644(-54);
        }
        field1957 = null;
        field1955 = null;
    }
}
