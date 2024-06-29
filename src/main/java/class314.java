import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class314 extends class30 {

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    private int field4946 = -1;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field4933 = -1;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field4941 = 0;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public int field4934;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public int field4937;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "[I")
    public int[] field4943;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field4939;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "[[[B")
    public static byte[][][] field4936;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V", line = 3)
    public static void method2101(int arg0) {
        field4939 = null;
        int var1 = -87 / ((arg0 - 56) / 53);
        field4936 = null;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V", line = 16)
    public final void method207(byte arg0) {
        super.method207(arg0);
        ++field4940;
        this.field4943 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)[[I", line = 30)
    public int[][] method203(byte arg0, int arg1) {
        if (arg0 != -93) {
            this.field4934 = 76;
        }
        ++field4942;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566 && this.method2102(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class312.field4921 == ~this.field4934 ? arg1 : this.field4934 * arg1 / class312.field4921) * this.field4937;
            if (~class369.field5610 != ~this.field4937) {
                for (int var8 = 0; ~var8 > ~class369.field5610; ++var8) {
                    int var9 = this.field4937 * var8 / class369.field5610;
                    int var10 = this.field4943[var7 + var9];
                    var6[var8] = class37.method242(var10 << 4, 4080);
                    var5[var8] = class37.method242(var10 >> 4, 4080);
                    var4[var8] = class37.method242(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~class369.field5610 < ~var11; ++var11) {
                    int var12 = this.field4943[var7++];
                    var6[var11] = class37.method242(4080, var12 << 4);
                    var5[var11] = class37.method242(var12, 65280) >> 4;
                    var4[var11] = class37.method242(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I", line = 103)
    public final int method204(int arg0) {
        if (arg0 <= 75) {
            return 101;
        } else {
            ++field4944;
            return this.field4946;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 125)
    public class314() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)Z", line = 129)
    public final boolean method2102(boolean arg0) {
        ++field4938;
        if (this.field4943 != null) {
            return true;
        } else if (~this.field4946 <= -1) {
            class100 var2 = class431.field6355 < 0 ? class100.method755(class422.field6242, this.field4946) : class100.method756(class422.field6242, class431.field6355, this.field4946);
            var2.method749();
            this.field4943 = var2.method754();
            this.field4934 = var2.field1399;
            this.field4937 = var2.field1401;
            return true;
        } else {
            if (!arg0) {
                this.method207((byte) 88);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljg;II)V", line = 157)
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            this.method203((byte) 46, -36);
        }
        ++field4935;
        if (arg2 == 0) {
            this.field4946 = arg0.method1272((byte) -76);
        }
    }
}
