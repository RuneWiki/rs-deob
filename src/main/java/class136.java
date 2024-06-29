import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class136 extends class84 {

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "Z")
    private boolean field2227 = true;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    private int field2228 = 4096;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field2224 = -2;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2226 = "Unable to find ";

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class136() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 > 87) {
            ++field2222;
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    this.field2227 = ~arg0.method1111(255) == -2;
                }
            } else {
                this.field2228 = arg0.method1126(false);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILlc;)[Lmj;")
    public static final class115[] method974(int arg0, int arg1, int arg2, class86 arg3) {
        ++field2221;
        if (!class156.method1155(arg2, arg3, 91, arg0)) {
            return null;
        } else {
            int var4 = -106 % ((30 - arg1) / 52);
            return class245.method1749((byte) -67);
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(Z)V")
    public static final void method975(boolean arg0) {
        ++field2225;
        class52.field765.method1558(-57);
        if (arg0) {
            field2224 = -5;
        }
        class81.field1171.method1558(-77);
        class45.field651.method1558(-80);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field2223;
        if (arg1 != -18) {
            field2224 = 2;
        }
        int[][] var3 = super.field1211.method193((byte) -128, arg0);
        if (super.field1211.field321) {
            int[] var4 = this.method612(0, arg0 + -1 & class58.field822, false);
            int[] var5 = this.method612(0, arg0, false);
            int[] var6 = this.method612(0, arg0 - -1 & class58.field822, false);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class20.field221; ++var10) {
                int var11 = (var5[class36.field497 & var10 - -1] - var5[var10 + -1 & class36.field497]) * this.field2228;
                int var12 = (var6[var10] + -var4[var10]) * this.field2228;
                int var13 = var11 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var14 + var16 - -4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field2227) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var9[var10] = var19;
                var8[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "(I)V")
    public static void method976(int arg0) {
        field2226 = null;
        if (arg0 != 3) {
            field2226 = null;
        }
    }
}
