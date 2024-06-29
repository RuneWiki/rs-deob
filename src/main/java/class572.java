import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class572 extends class615 {

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    private int field7599 = -1;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "[Lst;")
    public static class403[] field7601 = new class403[2048];

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    private int field7596;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    private int field7597;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "[I")
    private int[] field7600;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "[[I")
    public static int[][] field7595;

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class572() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[[I")
    public final int[][] method223(int arg0, int arg1) {
        ++field7589;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int var4 = this.field7597 * (~class471.field6301 == ~this.field7596 ? arg1 : this.field7596 * arg1 / class471.field6301);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class505.field6740 != ~this.field7597) {
                for (int var8 = 0; ~var8 > ~class505.field6740; ++var8) {
                    int var9 = this.field7597 * var8 / class505.field6740;
                    int var10 = this.field7600[var4 - -var9];
                    var7[var8] = class571.method3139(4080, var10 << 4);
                    var6[var8] = class571.method3139(var10, 65280) >> 4;
                    var5[var8] = class571.method3139(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~class505.field6740 < ~var11; ++var11) {
                    int var12 = this.field7600[var4++];
                    var7[var11] = class571.method3139(4080, var12 << 4);
                    var6[var11] = class571.method3139(4080, var12 >> 4);
                    var5[var11] = class571.method3139(var12 >> 12, 4080);
                }
            }
        }
        if (arg0 != 2) {
            this.method223(10, 70);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;")
    public static final String[] method3141(String arg0, char arg1, byte arg2) {
        ++field7594;
        int var3 = class641.method3533(arg0, true, arg1);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; ~var3 < ~var7; ++var7) {
            int var8;
            for (var8 = var6; ~arg0.charAt(var8) != ~arg1; ++var8) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 - -1;
        }
        if (arg2 != 12) {
            method3142(39, 56, 34);
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg1 == 0) {
            this.field7599 = arg2.method2001((byte) -83);
        }
        if (arg0 < 44) {
            this.field7596 = 37;
        }
        ++field7593;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(III)Z")
    public static final boolean method3142(int arg0, int arg1, int arg2) {
        int var3 = class137.field2226[arg0][arg1][arg2];
        if (-class109.field1593 == var3) {
            return false;
        } else if (class109.field1593 == var3) {
            return true;
        } else {
            int var4 = arg1 << class348.field4782;
            int var5 = arg2 << class348.field4782;
            if (class312.method1861(var4 + 1, class218.field3099[arg0].method195(arg1, arg2), var5 + 1) && class312.method1861(class587.field7787 + var4 - 1, class218.field3099[arg0].method195(arg1 + 1, arg2), var5 + 1) && class312.method1861(class587.field7787 + var4 - 1, class218.field3099[arg0].method195(arg1 + 1, arg2 + 1), class587.field7787 + var5 - 1) && class312.method1861(var4 + 1, class218.field3099[arg0].method195(arg1, arg2 + 1), class587.field7787 + var5 - 1) && class312.method1861(class16.field256 + var4, class218.field3099[arg0].method195(arg1, arg2), var5 + 1) && class312.method1861(class587.field7787 + var4 - 1, class218.field3099[arg0].method195(arg1 + 1, arg2), class16.field256 + var5) && class312.method1861(class16.field256 + var4, class218.field3099[arg0].method195(arg1, arg2 + 1), class587.field7787 + var5 - 1) && class312.method1861(class587.field7787 + var4 - 1, class218.field3099[arg0].method195(arg1, arg2), class16.field256 + var5) && class312.method1861(class16.field256 + var4, class218.field3099[arg0].method195(arg1, arg2), class16.field256 + var5)) {
                class137.field2226[arg0][arg1][arg2] = class109.field1593;
                return true;
            } else {
                class137.field2226[arg0][arg1][arg2] = -class109.field1593;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public static void method3143(int arg0) {
        if (arg0 == 25087) {
            field7595 = null;
            field7601 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public final void method3144(byte arg0) {
        ++field7598;
        super.method3144(arg0);
        this.field7600 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public final void method3145(int arg0, int arg1, int arg2) {
        ++field7590;
        super.method3145(arg0, arg1, arg2);
        if (this.field7599 >= 0 && class570.field7572 != null) {
            int var4 = !class570.field7572.method2760(this.field7599, arg1 ^ -21401).field4933 ? 128 : 64;
            this.field7600 = class570.field7572.method2761((byte) 73, var4, false, this.field7599, 1.0F, var4);
            this.field7597 = var4;
            this.field7596 = var4;
        }
        if (arg1 != -256) {
            this.field7597 = 103;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)I")
    public final int method3146(byte arg0) {
        if (arg0 < 46) {
            method3142(97, 71, 76);
        }
        ++field7591;
        return this.field7599;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public static final void method3147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7592;
        if (~arg3 <= ~class600.field7959 && arg3 <= class366.field4956) {
            int var5 = class300.method1829(class310.field4279, arg1, 113, class442.field6058);
            int var6 = class300.method1829(class310.field4279, arg4, arg0 ^ 112, class442.field6058);
            class473.method2664(var6, arg3, var5, (byte) -36, arg2);
        }
        if (arg0 != 0) {
            method3142(-38, -103, -83);
        }
    }
}
