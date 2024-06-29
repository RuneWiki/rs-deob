import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class213 extends class264 {

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Z")
    private boolean field3098 = true;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "Z")
    private boolean field3097 = true;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field3095 = 0;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "[I")
    public static int[] field3100 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Lrc;")
    public static class108 field3093 = new class108(10, 8);

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field3102 = 0;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "Lhq;")
    public static class30 field3103 = new class30("", 14);

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3101;
        int[] var3 = super.field3808.method958((byte) 41, arg0);
        if (arg1 != 21034) {
            this.field3098 = false;
        }
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(this.field3097 ? -arg0 + class301.field4265 : arg0, (byte) -121, 0);
            if (!this.field3098) {
                class214.method1451(var4, 0, var3, 0, class478.field6792);
            } else {
                for (int var5 = 0; var5 < class478.field6792; ++var5) {
                    var3[var5] = var4[-var5 + class205.field3007];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field3094;
        int[][] var3 = super.field3816.method1928((byte) 107, arg1);
        if (super.field3816.field4208) {
            int[][] var4 = this.method1782(this.field3097 ? -arg1 + class301.field4265 : arg1, (byte) 114, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field3098) {
                for (int var11 = 0; ~var11 > ~class478.field6792; ++var11) {
                    var8[var11] = var5[-var11 + class205.field3007];
                    var9[var11] = var6[-var11 + class205.field3007];
                    var10[var11] = var7[-var11 + class205.field3007];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class478.field6792; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        if (arg0 != 116) {
            field3102 = 114;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field3099;
        if (arg0 > 31) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field3794 = arg1.method1172((byte) -119) == 1;
                    }
                } else {
                    this.field3097 = ~arg1.method1172((byte) -8) == -2;
                }
            } else {
                this.field3098 = ~arg1.method1172((byte) -128) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static void method1446(boolean arg0) {
        field3100 = null;
        field3093 = null;
        if (arg0) {
            method1446(true);
        }
        field3103 = null;
    }
}
