import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class232 extends class273 {

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    private int field3670 = 4096;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    private int field3674 = 4096;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    private int field3680 = 4096;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public static int field3672 = 0;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "Z")
    public static boolean field3678 = false;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field3681 = 0;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "F")
    public static float field3673;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Z)V")
    public static final void method1533(boolean arg0) {
        ++field3671;
        class248.field3962.method1157(760);
        if (arg0) {
            class44.field805.method1157(760);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3670 = arg0.method996(65280);
                }
            } else {
                this.field3680 = arg0.method996(65280);
            }
        } else {
            this.field3674 = arg0.method996(65280);
        }
        ++field3669;
        if (arg2 != 5) {
            method1533(false);
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
    public static final void method1534(int arg0) {
        ++field3668;
        class29.field506.method1157(760);
        class136.field2259.method1157(760);
        if (arg0 != -27834) {
            method1534(69);
        }
        class80.field1327.method1157(760);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class232() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 < 122) {
            method1538(95, -118, -62, 60, 96, -93, -107);
        }
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int[][] var4 = this.method1853(0, arg1, (byte) 8);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[0];
            for (int var11 = 0; class26.field458 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var9[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var10[var11] = this.field3674 * var12 >> 12;
                    var8[var11] = this.field3680 * var13 >> 12;
                    var7[var11] = this.field3670 * var14 >> 12;
                } else {
                    var10[var11] = this.field3674;
                    var8[var11] = this.field3680;
                    var7[var11] = this.field3670;
                }
            }
        }
        ++field3675;
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BC)Z")
    public static final boolean method1535(byte arg0, char arg1) {
        ++field3676;
        if (arg0 != -30) {
            field3673 = -0.70057654F;
        }
        if ((arg1 <= 0 || ~arg1 <= -129) && (arg1 < 160 || arg1 > 255)) {
            if (arg1 != 0) {
                int var2 = 0;
                char[] var3 = class179.field2979;
                while (~var3.length < ~var2) {
                    char var4 = var3[var2];
                    if (arg1 == var4) {
                        return true;
                    }
                    ++var2;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)I")
    public static final int method1536(int arg0, int arg1, int arg2) {
        ++field3677;
        int var3 = class255.method1708(arg1 + -1, arg0 - 1, (byte) 60) + (class255.method1708(arg1 + 1, arg0 + -1, (byte) 60) - -class255.method1708(arg1 + -1, arg0 + 1, (byte) 60) - -class255.method1708(arg1 + 1, arg0 + 1, (byte) 60));
        int var4 = class255.method1708(arg1 + -1, arg0, (byte) 60) - (-class255.method1708(arg1 + 1, arg0, (byte) 60) - class255.method1708(arg1, arg0 + -1, (byte) 60) + -class255.method1708(arg1, arg0 + arg2, (byte) 60));
        int var5 = class255.method1708(arg1, arg0, (byte) 60);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)Z")
    public static final boolean method1537(int arg0, int arg1) {
        ++field3667;
        if (arg0 >= -39) {
            method1533(false);
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class228 var7 = new class228();
        var7.field3628 = arg1 / 128;
        var7.field3622 = arg2 / 128;
        var7.field3632 = arg3 / 128;
        var7.field3618 = arg4 / 128;
        var7.field3631 = arg0;
        var7.field3625 = arg1;
        var7.field3645 = arg2;
        var7.field3617 = arg3;
        var7.field3641 = arg4;
        var7.field3619 = arg5;
        var7.field3638 = arg6;
        class193.field3164[class272.field4349++] = var7;
    }
}
