import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 extends class242 {

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    private int field400 = 0;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    private int field405 = 4096;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBZ)I")
    public static final int method172(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 >= -74) {
            method173(-2, 61, 27, -92, (class265) null, (class265) null, 61, -55, 91, 119, 80L);
        }
        ++field398;
        class201 var4 = (class201) class103.field1708.method150((long) arg1, -113);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field3511.length; ++var6) {
                if (~var4.field3511[var6] <= -1 && class231.field4015 > var4.field3511[var6]) {
                    class220 var7 = class23.method177((byte) -124, var4.field3511[var6]);
                    if (var7.field3812 != null) {
                        class190 var8 = (class190) var7.field3812.method150((long) arg0, 112);
                        if (var8 != null) {
                            if (arg3) {
                                var5 += var4.field3520[var6] * var8.field3329;
                            } else {
                                var5 += var8.field3329;
                            }
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field399;
        if (arg0 > -119) {
            field401 = -4;
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field405 = arg2.method193((byte) 77);
            }
        } else {
            this.field400 = arg2.method193((byte) 77);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILrk;Lrk;IIIIJ)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3, class265 arg4, class265 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class49 var12 = new class49();
            var12.field807 = arg10;
            var12.field796 = arg1 * 128 + 64;
            var12.field803 = arg2 * 128 + 64;
            var12.field813 = arg3;
            var12.field800 = arg4;
            var12.field798 = arg5;
            var12.field801 = arg6;
            var12.field799 = arg7;
            var12.field797 = arg8;
            var12.field802 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class220.field3787[var13][arg1][arg2] == null) {
                    class220.field3787[var13][arg1][arg2] = new class162(var13, arg1, arg2);
                }
            }
            class220.field3787[arg0][arg1][arg2].field2852 = var12;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field403;
        int[] var3 = super.field4251.method1417((byte) 111, arg0);
        if (super.field4251.field3655) {
            int[] var4 = this.method1647(0, arg0, 48);
            for (int var5 = 0; ~class264.field4654 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field400 && this.field405 >= var6 ? 4096 : 0;
            }
        }
        int var7 = -12 % ((arg1 - 73) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class22() {
        super(1, true);
    }
}
