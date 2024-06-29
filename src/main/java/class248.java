import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class248 extends class21 {

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    private int field3860 = 1;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    private int field3863 = 0;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    private int field3864 = 0;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3861 = null;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field3865 = 0;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "[I")
    public static int[] field3866 = new int[25];

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "[J")
    public static long[] field3859 = new long[200];

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "F")
    public static float field3867;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "F")
    public static float field3870;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 4)
    public class248() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILag;)V", line = 21)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            return;
        }
        if (arg1 == 0) {
            this.field3863 = arg2.method1317((byte) -80);
        } else if (arg1 == 1) {
            this.field3864 = arg2.method1317((byte) -104);
        } else if (arg1 == 3) {
            this.field3860 = arg2.method1317((byte) -70);
        }
        field3869++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[I", line = 78)
    public final int[] method177(int arg0, int arg1) {
        field3868++;
        int[] var3 = this.field443.method1040(arg1, false);
        int var4 = -72 % ((arg0 - 33) / 36);
        if (this.field443.field2637) {
            int var5 = class330.field5058[arg1];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; var7 < class294.field4489; var7++) {
                int var8 = class51.field1027[var7];
                int var9 = var8 - 2048 >> 1;
                int var10;
                if (this.field3863 == 0) {
                    var10 = (var8 - var5) * this.field3860;
                } else {
                    int var11 = var6 * var6 + var9 * var9 >> 12;
                    int var12 = (int) (Math.sqrt((double) ((float) var11 / 4096.0F)) * 4096.0D);
                    var10 = (int) ((double) (this.field3860 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (var10 & 0xFFFFF000);
                if (this.field3864 == 0) {
                    var13 = class46.field953[var13 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field3864 == 2) {
                    var13 -= 2048;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    var13 = 2048 - var13 << 1;
                }
                var3[var7] = var13;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(Z)V", line = 145)
    public static void method1645(boolean arg0) {
        if (arg0) {
            field3867 = 0.70218474F;
        }
        field3866 = null;
        field3861 = null;
        field3859 = null;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V", line = 157)
    public final void method183(byte arg0) {
        field3858++;
        class233.method1546(17431);
        if (arg0 < 82) {
            this.method177(-46, 92);
        }
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V", line = 170)
    public static final void method1646(byte arg0) {
        int var1 = 87 / ((71 - arg0) / 36);
        class128.field2198.method1884(-22054);
        field3862++;
    }
}
