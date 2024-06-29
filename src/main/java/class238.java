import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class238 extends class107 {

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    private int field3739 = 4096;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3734 = "wave2:";

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "[Z")
    public static boolean[] field3736 = new boolean[8];

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Lgi;")
    public static class164 field3738;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (~arg0 == -1) {
            this.field3739 = arg1.method1837(252);
        }
        ++field3735;
        if (arg2 != 28) {
            this.method195(-13, (class274) null, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
    public static void method1628(int arg0) {
        field3738 = null;
        if (arg0 != 886854860) {
            field3742 = 61;
        }
        field3736 = null;
        field3734 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field3740;
        int[] var3 = super.field1661.method894(126, arg1);
        if (super.field1661.field2115) {
            int[] var4 = this.method756(0, class107.field1677 & arg1 - 1, -29053);
            int[] var5 = this.method756(0, arg1, -29053);
            int[] var6 = this.method756(0, arg1 + 1 & class107.field1677, -29053);
            for (int var7 = 0; class24.field443 > var7; ++var7) {
                int var8 = (var5[var7 + 1 & class128.field2053] - var5[var7 - 1 & class128.field2053]) * this.field3739;
                int var9 = var8 >> 12;
                int var10 = (var6[var7] + -var4[var7]) * this.field3739;
                int var11 = var9 * var9 >> 12;
                int var12 = var10 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        int var16 = 42 % ((arg0 - -34) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class238() {
        super(1, true);
    }
}
