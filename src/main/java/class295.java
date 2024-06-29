import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class295 extends class219 {

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    private int field4937 = 0;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "I")
    private int field4942 = 0;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    private int field4941 = 20;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    private int field4950 = 1365;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "[I")
    public static int[] field4943 = new int[100];

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field4946 = 0;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "Z")
    public static boolean field4945 = true;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "[S")
    public static short[] field4940 = new short[256];

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "F")
    public static float field4947;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "Loa;")
    public static class141 field4948;

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 30)
    public class295() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V", line = 12)
    public static final void method2025(int arg0, boolean arg1) {
        if (arg1) {
            field4944 = -26;
        }
        class63 var2 = class46.method332(5, arg0, -12770);
        var2.method427(-22507);
        field4938++;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 39)
    public static void method2026(int arg0) {
        field4940 = null;
        field4948 = null;
        int var1 = 34 / ((arg0 + 7) / 42);
        field4943 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILb;)V", line = 54)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            return;
        }
        field4949++;
        if (arg0 == 0) {
            this.field4950 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field4941 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field4942 = arg2.method761((byte) 108);
        } else if (arg0 == 3) {
            this.field4937 = arg2.method761((byte) 108);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)[I", line = 122)
    public final int[] method41(boolean arg0, int arg1) {
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            for (int var4 = 0; var4 < class128.field2326; var4++) {
                int var5 = (class280.field4762[var4] << 12) / this.field4950 + this.field4942;
                int var6 = var5;
                int var7 = var5;
                int var8 = (class53.field842[arg1] << 12) / this.field4950 + this.field4937;
                int var9 = var8;
                int var10 = var5 * var5 >> 12;
                int var11 = 0;
                int var12 = var8;
                int var13 = var8 * var8 >> 12;
                while (var10 + var13 < 16384 && this.field4941 > var11) {
                    var12 = (var7 * var12 >> 12) * 2 + var9;
                    var7 = var6 + var10 - var13;
                    var10 = var7 * var7 >> 12;
                    var13 = var12 * var12 >> 12;
                    var11++;
                }
                var3[var4] = (this.field4941 - 1) <= var11 ? 0 : (var11 << 12) / this.field4941;
            }
        }
        if (arg0) {
            field4936++;
            return var3;
        } else {
            return (int[]) null;
        }
    }
}
