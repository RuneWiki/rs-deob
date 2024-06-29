import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class21 extends class273 {

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    private int field330 = 0;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    private int field331 = 0;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    private int field326 = 1;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "[I")
    public static int[] field332;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "[[Z")
    public static boolean[][] field324;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "[[[I")
    public static int[][][] field327;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)I")
    public static final int method171(int arg0, boolean arg1) {
        ++field321;
        if (arg1) {
            field324 = null;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)V")
    public static final void method172(boolean arg0) {
        if (!arg0) {
            method171(39, false);
        }
        ++field323;
        class294.field4664 = new class266();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field325;
        int[] var3 = super.field4359.method387((byte) -30, arg1);
        if (arg0) {
            field324 = null;
        }
        if (super.field4359.field833) {
            int var4 = class255.field4068[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class26.field458 < ~var6; ++var6) {
                int var7 = class265.field4234[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field330 == -1) {
                    var9 = (var7 - var4) * this.field326;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field326 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field331 != 0) {
                    if (~this.field331 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class116.field1957[(4091 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            ++field328;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 3) {
                        this.field326 = arg0.method1012(4);
                    }
                } else {
                    this.field331 = arg0.method1012(4);
                }
            } else {
                this.field330 = arg0.method1012(4);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field322;
        if (arg0 > -94) {
            method172(true);
        }
        class155.method1117(-70);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class21() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)V")
    public static final void method173(byte arg0, int arg1) {
        class23 var2 = class91.method694(arg1, 5, -14);
        var2.method183(-85);
        int var3 = -15 % ((arg0 - -67) / 53);
        ++field329;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static void method174(byte arg0) {
        field332 = null;
        field327 = null;
        field324 = null;
        if (arg0 > -41) {
            method174((byte) 116);
        }
    }
}
