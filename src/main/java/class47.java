import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class47 extends class34 {

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
    private int field790 = 0;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    private int field789 = 4096;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "Ldb;")
    public static class39 field797 = new class39(16);

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field799 = null;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "[I")
    public static int[] field795;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "[Lqf;")
    public static class293[] field788;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "[[Z")
    public static boolean[][] field798;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([BB)Lwi;")
    public static final class192 method371(byte[] arg0, byte arg1) {
        ++field796;
        if (arg0 == null) {
            return null;
        } else {
            class52 var2 = new class52(arg0, class135.field1973, class5.field69, class27.field525, class173.field2530, class209.field3125);
            int var3 = 89 / ((arg1 - -56) / 56);
            class293.method1936(-74);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field792;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field604 = ~arg2.method407(255) == -2;
                }
            } else {
                this.field789 = arg2.method423(88);
            }
        } else {
            this.field790 = arg2.method423(-127);
        }
        if (arg0 != 6) {
            field799 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    public static final void method372(int arg0) {
        int var1 = 30 / ((arg0 - -33) / 44);
        class92.field1384.method940(20);
        ++field793;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class47() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int var3 = -18 % ((-54 - arg0) / 44);
        ++field787;
        int[][] var4 = super.field618.method91(106, arg1);
        if (super.field618.field211) {
            int[][] var5 = this.method231(arg1, (byte) 78, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class226.field3527 > var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (var13 >= this.field790) {
                    if (var13 <= this.field789) {
                        var9[var12] = var13;
                    } else {
                        var9[var12] = this.field789;
                    }
                } else {
                    var9[var12] = this.field790;
                }
                if (~this.field790 >= ~var15) {
                    if (var15 > this.field789) {
                        var10[var12] = this.field789;
                    } else {
                        var10[var12] = var15;
                    }
                } else {
                    var10[var12] = this.field790;
                }
                if (var14 >= this.field790) {
                    if (~this.field789 > ~var14) {
                        var11[var12] = this.field789;
                    } else {
                        var11[var12] = var14;
                    }
                } else {
                    var11[var12] = this.field790;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZIILpk;)[Lwh;")
    public static final class289[] method373(boolean arg0, int arg1, int arg2, class237 arg3) {
        ++field794;
        if (!class223.method1526(arg2, arg1, (byte) 112, arg3)) {
            return null;
        } else {
            if (arg0) {
                field795 = null;
            }
            return class191.method1276(31608);
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)V")
    public static void method374(byte arg0) {
        if (arg0 != -99) {
            method373(true, 5, -21, (class237) null);
        }
        field798 = null;
        field797 = null;
        field795 = null;
        field788 = null;
        field799 = null;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int[] var4 = this.method230(arg1, -15337, 0);
            for (int var5 = 0; ~class226.field3527 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field790 < ~var6) {
                    var3[var5] = this.field790;
                } else if (this.field789 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field789;
                }
            }
        }
        ++field791;
        if (arg0 < 75) {
            method372(-58);
        }
        return var3;
    }
}
