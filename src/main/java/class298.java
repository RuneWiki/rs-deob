import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class298 extends class38 {

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "I")
    private int field4223 = 0;

    @OriginalMember(owner = "client!gaa", name = "J", descriptor = "I")
    private int field4226 = 1365;

    @OriginalMember(owner = "client!gaa", name = "L", descriptor = "I")
    private int field4228 = 0;

    @OriginalMember(owner = "client!gaa", name = "N", descriptor = "I")
    private int field4230 = 20;

    @OriginalMember(owner = "client!gaa", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4229 = null;

    @OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!gaa", name = "K", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!gaa", name = "O", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!gaa", name = "P", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!gaa", name = "H", descriptor = "Lda;")
    public static class61 field4225;

    @OriginalMember(owner = "client!gaa", name = "Q", descriptor = "[I")
    public static int[] field4233;

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "()V")
    public class298() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
    public static void method1881(int arg0) {
        field4233 = null;
        field4225 = null;
        if (arg0 != 0) {
            method1881(59);
        }
        field4229 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field4231;
        int[] var3 = super.field397.method1376(arg1, (byte) -57);
        if (arg0 >= -43) {
            this.field4228 = 58;
        }
        if (super.field397.field3005) {
            for (int var4 = 0; class729.field10216 > var4; ++var4) {
                int var5 = (class255.field3666[var4] << 12) / this.field4226 + this.field4228;
                int var6 = (class136.field1816[arg1] << 12) / this.field4226 + this.field4223;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field4230 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 + -var12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 < this.field4230 + -1 ? (var13 << 12) / this.field4230 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field4227;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field4223 = arg2.method3712((byte) -2);
                    }
                } else {
                    this.field4228 = arg2.method3712((byte) 107);
                }
            } else {
                this.field4230 = arg2.method3712((byte) -105);
            }
        } else {
            this.field4226 = arg2.method3712((byte) 51);
        }
        if (arg0 < 34) {
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)[Lnd;")
    public static final class546[] method1882(boolean arg0) {
        if (!arg0) {
            method1882(true);
        }
        ++field4232;
        return new class546[] { class725.field10114, class725.field10120, class725.field10121, class725.field10123, class725.field10124, class725.field10125, class725.field10126, class725.field10127, class725.field10128, class725.field10129, class725.field10130, class725.field10131 };
    }
}
