import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class268 extends class144 {

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    private int field3924 = -1;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    private int field3921;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "[I")
    private int[] field3918;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "[[I")
    public static int[][] field3919;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method1716(boolean arg0) {
        if (!arg0) {
            method1719(79, -100, -82);
        }
        field3919 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)V")
    public static final void method1717(byte arg0, boolean arg1) {
        if (arg0 != 8) {
            method1716(true);
        }
        class167.method1094(arg1, client.field4437, class123.field1776, false, class84.field1166);
        ++field3925;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)V")
    public static final void method1718(byte arg0) {
        if (arg0 != 105) {
            field3922 = -50;
        }
        ++field3914;
        if (~class33.field389 != 0) {
            class202.method1300(class33.field389, -1, arg0 + 7711, -1);
            class33.field389 = -1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)I")
    public final int method931(byte arg0) {
        if (arg0 >= -22) {
            return 83;
        } else {
            ++field3923;
            return this.field3924;
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public final void method23(int arg0) {
        ++field3915;
        super.method23(arg0);
        this.field3918 = null;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)J")
    public static final long method1719(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        return var3 != null && var3.field1917 != null ? var3.field1917.field575 : 0L;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class268() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field3926;
        if (arg2 != 20630) {
            field3922 = 33;
        }
        if (~arg0 == -1) {
            this.field3924 = arg1.method1380(true);
        }
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(B)Z")
    private final boolean method1720(byte arg0) {
        if (arg0 != -123) {
            return false;
        } else {
            ++field3913;
            if (this.field3918 != null) {
                return true;
            } else if (this.field3924 >= 0) {
                int var2 = class104.field1411;
                int var3 = class257.field3727;
                int var4 = !class60.field720.method419(this.field3924, -208).field1279 ? 128 : 64;
                this.field3918 = class60.field720.method420(1.0F, arg0 ^ -126, this.field3924, false, var4, var4);
                this.field3921 = var4;
                this.field3917 = var4;
                class80.method480(var3, 126, var2);
                return this.field3918 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field3920;
        int[][] var3 = super.field2053.method1542(arg0 ^ 127, arg1);
        if (arg0 != 5) {
            this.field3921 = 24;
        }
        if (super.field2053.field3408 && this.method1720((byte) -123)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = this.field3921 * (~class257.field3727 != ~this.field3917 ? this.field3917 * arg1 / class257.field3727 : arg1);
            int[] var7 = var3[2];
            if (class104.field1411 != this.field3921) {
                for (int var8 = 0; var8 < class104.field1411; ++var8) {
                    int var9 = this.field3921 * var8 / class104.field1411;
                    int var10 = this.field3918[var6 + var9];
                    var7[var8] = class5.method26(var10, 255) << 4;
                    var4[var8] = class5.method26(4080, var10 >> 4);
                    var5[var8] = class5.method26(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~class104.field1411 < ~var11; ++var11) {
                    int var12 = this.field3918[var6++];
                    var7[var11] = class5.method26(var12 << 4, 4080);
                    var4[var11] = class5.method26(var12 >> 4, 4080);
                    var5[var11] = class5.method26(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }
}
