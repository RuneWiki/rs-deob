import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class210 extends class160 {

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    private int field3268 = 4096;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    private int field3269 = 4096;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    private int field3262 = 4096;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "[Lwc;")
    public static class236[] field3267 = new class236[2048];

    @OriginalMember(owner = "client!se", name = "U", descriptor = "Z")
    public static boolean field3264 = true;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3270 = "level: ";

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Lhc;")
    public static class235 field3266;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3269 = arg0.method645(11596);
                }
            } else {
                this.field3262 = arg0.method645(11596);
            }
        } else {
            this.field3268 = arg0.method645(11596);
        }
        ++field3271;
        if (arg1 < 11) {
            this.field3268 = 71;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public static void method1408(int arg0) {
        field3266 = null;
        if (arg0 == 0) {
            field3270 = null;
            field3267 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field3263;
        int[][] var3 = super.field2476.method839(!arg1, arg0);
        if (super.field2476.field1950) {
            int[][] var4 = this.method1079(arg0, 106, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class240.field3896 < ~var11; ++var11) {
                int var12 = var8[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var7[var11] = this.field3268 * var12 >> 12;
                    var9[var11] = this.field3262 * var13 >> 12;
                    var10[var11] = this.field3269 * var14 >> 12;
                } else {
                    var7[var11] = this.field3268;
                    var9[var11] = this.field3262;
                    var10[var11] = this.field3269;
                }
            }
        }
        if (!arg1) {
            this.method3(-30, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIB)V")
    public static final void method1409(int arg0, int arg1, byte arg2) {
        ++field3265;
        class41 var3 = class221.method1492((byte) -42, arg0, 5);
        if (arg2 != -69) {
            field3267 = null;
        }
        var3.method301(arg2 + 8861);
        var3.field584 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class210() {
        super(1, false);
    }
}
