import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class348 extends class80 {

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    private int field5180 = -1;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field5179 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[I")
    public int[] field5172;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
    public final void method715(byte arg0) {
        super.method715(arg0);
        ++field5178;
        this.field5172 = null;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I")
    public final int method714(int arg0) {
        if (arg0 != 0) {
            return 42;
        } else {
            ++field5177;
            return this.field5180;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
    public static final void method2171(byte arg0) {
        class45.field956 = null;
        class129.field2198 = null;
        class347.field5168 = null;
        class198.field3195 = null;
        class171.field2773 = null;
        class265.field4035 = null;
        class365.field5333 = null;
        class51.field1073 = null;
        if (arg0 == -24) {
            class87.field1783 = null;
            ++field5176;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V")
    public static void method2172(byte arg0) {
        field5179 = null;
        if (arg0 != 5) {
            method2171((byte) -56);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    public class348() {
        super(0, false);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)Z")
    public final boolean method2173(int arg0) {
        ++field5170;
        if (this.field5172 != null) {
            return true;
        } else if (arg0 <= this.field5180) {
            class340 var2 = class473.field7012 >= 0 ? class340.method2139(class64.field1311, class473.field7012, this.field5180) : class340.method2137(class64.field1311, this.field5180);
            var2.method2144();
            this.field5172 = var2.method2149();
            this.field5174 = var2.field5115;
            this.field5175 = var2.field5114;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)[[I")
    public int[][] method29(int arg0, int arg1) {
        ++field5171;
        if (arg0 != 255) {
            this.method715((byte) -53);
        }
        int[][] var3 = super.field1589.method859(arg1, arg0 + -370);
        if (super.field1589.field1884 && this.method2173(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class278.field4199 == this.field5174 ? arg1 : this.field5174 * arg1 / class278.field4199) * this.field5175;
            if (~class137.field2308 == ~this.field5175) {
                for (int var8 = 0; ~class137.field2308 < ~var8; ++var8) {
                    int var9 = this.field5172[var7++];
                    var6[var8] = class490.method2960(var9 << 4, 4080);
                    var5[var8] = class490.method2960(4080, var9 >> 4);
                    var4[var8] = class490.method2960(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class137.field2308; ++var10) {
                    int var11 = this.field5175 * var10 / class137.field2308;
                    int var12 = this.field5172[var7 + var11];
                    var6[var10] = class490.method2960(4080, var12 << 4);
                    var5[var10] = class490.method2960(65280, var12) >> 4;
                    var4[var10] = class490.method2960(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = 43 % ((arg1 - 28) / 53);
        if (~arg0 == -1) {
            this.field5180 = arg2.method1841((byte) -123);
        }
        ++field5173;
    }
}
