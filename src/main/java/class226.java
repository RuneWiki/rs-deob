import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class226 extends class298 {

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "Z")
    private boolean field3130 = true;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "Z")
    private boolean field3137 = true;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "Z")
    public static volatile boolean field3133 = false;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lrc;")
    public static class107 field3136;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        if (arg0 != -24032) {
            return null;
        } else {
            ++field3134;
            int[][] var3 = super.field4454.method1638((byte) -113, arg1);
            if (super.field4454.field3886) {
                int[][] var4 = this.method1878(0, this.field3137 ? -arg1 + class208.field2886 : arg1, 122);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field3130) {
                    for (int var11 = 0; ~class158.field1877 < ~var11; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; ~class158.field1877 < ~var12; ++var12) {
                        var8[var12] = var5[-var12 + class474.field6656];
                        var9[var12] = var6[-var12 + class474.field6656];
                        var10[var12] = var7[-var12 + class474.field6656];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4449 = arg2.method895((byte) -80) == 1;
                }
            } else {
                this.field3137 = arg2.method895((byte) -89) == 1;
            }
        } else {
            this.field3130 = ~arg2.method895((byte) -100) == -2;
        }
        if (arg0 > -44) {
            field3139 = 21;
        }
        ++field3131;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)Z")
    public static final boolean method1245(int arg0, int arg1) {
        if (arg1 < 47) {
            method1245(-128, -19);
        }
        class444.field6332 = true;
        class315.field4613 = arg0 + 1 & 65535;
        ++field3132;
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z")
    public static final boolean method1246(int arg0) {
        if (arg0 != -17423) {
            method1247(false, 31);
        }
        ++field3135;
        return class414.field5904 != class145.field1754 || ~class369.field5285 <= -3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)I")
    public static final int method1247(boolean arg0, int arg1) {
        ++field3140;
        return arg0 ? -87 : arg1 & 255;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field3138;
        if (!arg1) {
            field3139 = 72;
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(0, -2594, !this.field3137 ? arg0 : -arg0 + class208.field2886);
            if (!this.field3130) {
                class268.method1620(var4, 0, var3, 0, class158.field1877);
            } else {
                for (int var5 = 0; ~var5 > ~class158.field1877; ++var5) {
                    var3[var5] = var4[-var5 + class474.field6656];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public static void method1248(int arg0) {
        field3136 = null;
        if (arg0 < 122) {
            field3136 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class226() {
        super(1, false);
    }
}
