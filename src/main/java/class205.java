import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class205 extends class214 {

    @OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
    private int field2945 = -1;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field2933 = 2;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "Z")
    public static boolean field2942 = false;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field2934 = 0;

    @OriginalMember(owner = "client!nq", name = "bb", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!nq", name = "ab", descriptor = "I")
    public static int field2949 = 0;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public int field2932;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
    public int field2939;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!nq", name = "Z", descriptor = "Lfb;")
    public static class96 field2948;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "[I")
    public int[] field2940;

    @OriginalMember(owner = "client!nq", name = "Y", descriptor = "[[[B")
    public static byte[][][] field2947;

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field2944;
        if (arg2 == 0) {
            this.field2945 = arg0.method2508(true);
        }
        if (arg1 >= -114) {
            this.method1297(false);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)[[I")
    public int[][] method11(int arg0, byte arg1) {
        ++field2938;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            this.method11(-26, (byte) 8);
        }
        if (super.field3030.field6644 && this.method1296(arg1 ^ -31625)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class490.field6924 != this.field2932 ? this.field2932 * arg0 / class490.field6924 : arg0) * this.field2939;
            if (~class399.field5585 == ~this.field2939) {
                for (int var8 = 0; ~class399.field5585 < ~var8; ++var8) {
                    int var9 = this.field2940[var7++];
                    var6[var8] = class347.method2074(var9, 255) << 4;
                    var5[var8] = class347.method2074(var9 >> 4, 4080);
                    var4[var8] = class347.method2074(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class399.field5585; ++var10) {
                    int var11 = this.field2939 * var10 / class399.field5585;
                    int var12 = this.field2940[var7 + var11];
                    var6[var10] = class347.method2074(var12, 255) << 4;
                    var5[var10] = class347.method2074(var12, 65280) >> 4;
                    var4[var10] = class347.method2074(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
    public static void method1294(int arg0) {
        field2947 = null;
        field2948 = null;
        if (arg0 != 0) {
            method1294(-50);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    public final void method1295(boolean arg0) {
        ++field2943;
        if (!arg0) {
            method1294(113);
        }
        super.method1295(arg0);
        this.field2940 = null;
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)Z")
    public final boolean method1296(int arg0) {
        ++field2941;
        if (this.field2940 != null) {
            return true;
        } else if (~this.field2945 <= -1) {
            class140 var2 = class225.field3189 < 0 ? class140.method866(class350.field4794, this.field2945) : class140.method854(class350.field4794, class225.field3189, this.field2945);
            var2.method856();
            this.field2940 = var2.method857();
            this.field2932 = var2.field1989;
            this.field2939 = var2.field1993;
            return true;
        } else {
            if (arg0 != -31701) {
                field2949 = 58;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)I")
    public final int method1297(boolean arg0) {
        if (arg0) {
            field2933 = -43;
        }
        ++field2935;
        return this.field2945;
    }
}
