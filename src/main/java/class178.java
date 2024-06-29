import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class178 extends class51 {

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
    private int field3598 = 4096;

    @OriginalMember(owner = "client!th", name = "gb", descriptor = "I")
    private int field3604 = 0;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "[I")
    public static int[] field3600 = new int[200];

    @OriginalMember(owner = "client!th", name = "db", descriptor = "[I")
    public static int[] field3601 = new int[128];

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!th", name = "hb", descriptor = "Lrc;")
    public static class155 field3605 = new class155(30);

    @OriginalMember(owner = "client!th", name = "kb", descriptor = "Lea;")
    private static class38 field3608 = class9.method46((byte) 123, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!th", name = "lb", descriptor = "Lea;")
    private static class38 field3609 = class9.method46((byte) 114, "Please remove ");

    @OriginalMember(owner = "client!th", name = "mb", descriptor = "Lea;")
    public static class38 field3610 = field3609;

    @OriginalMember(owner = "client!th", name = "jb", descriptor = "Lea;")
    public static class38 field3607 = field3609;

    @OriginalMember(owner = "client!th", name = "ob", descriptor = "Lea;")
    public static class38 field3612 = field3608;

    @OriginalMember(owner = "client!th", name = "nb", descriptor = "I")
    public static int field3611 = 0;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!th", name = "ib", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public static void method1226(byte arg0) {
        field3608 = null;
        field3605 = null;
        field3610 = null;
        field3612 = null;
        field3600 = null;
        field3607 = null;
        field3601 = null;
        if (arg0 == 28) {
            field3609 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3599;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int[][] var4 = this.method377(0, arg1, (byte) -93);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class86.field2008; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field3604) {
                    var8[var11] = this.field3604;
                } else if (var12 <= this.field3598) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field3598;
                }
                if (this.field3604 > var13) {
                    var10[var11] = this.field3604;
                } else if (~var13 >= ~this.field3598) {
                    var10[var11] = var13;
                } else {
                    var10[var11] = this.field3598;
                }
                if (~this.field3604 < ~var14) {
                    var9[var11] = this.field3604;
                } else if (var14 > this.field3598) {
                    var9[var11] = this.field3598;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        if (arg0 < 111) {
            this.method52((byte) -14, 74);
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field3602;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1289 = arg0.method509(120) == 1;
                }
            } else {
                this.field3598 = arg0.method511(54);
            }
        } else {
            this.field3604 = arg0.method511(57);
        }
        if (!arg2) {
            field3605 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field3597;
        if (arg0 >= -125) {
            return null;
        } else {
            int[] var3 = super.field1312.method827(arg1, true);
            if (super.field1312.field2271) {
                int[] var4 = this.method376(arg1, 0, -89);
                for (int var5 = 0; ~var5 > ~class86.field2008; ++var5) {
                    int var6 = var4[var5];
                    if (~this.field3604 < ~var6) {
                        var3[var5] = this.field3604;
                    } else if (~this.field3598 <= ~var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field3598;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, false);
    }
}
