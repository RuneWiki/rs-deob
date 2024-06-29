import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class50 extends class8 {

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    private int field882 = 4096;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    private int field881 = 0;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "Ljava/lang/String;")
    public static String field885 = "Loading sprites - ";

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "Lvj;")
    public static class115 field886 = new class115();

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILqh;)V")
    public static final void method390(int arg0, class201 arg1) {
        int var2 = -35 / ((31 - arg0) / 58);
        class115.field1919 = arg1;
        ++field880;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            return null;
        } else {
            ++field878;
            int[] var3 = super.field110.method1585(0, arg1);
            if (super.field110.field3734) {
                int[] var4 = this.method61(arg1, 124, 0);
                for (int var5 = 0; ~class231.field3798 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (var6 < this.field881) {
                        var3[var5] = this.field881;
                    } else if (var6 > this.field882) {
                        var3[var5] = this.field882;
                    } else {
                        var3[var5] = var6;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = 68 % ((-48 - arg1) / 46);
        int[][] var4 = super.field93.method248(arg0, 17416);
        ++field876;
        if (super.field93.field470) {
            int[][] var5 = this.method60(arg0, 0, 93);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var5[2];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; ~class231.field3798 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var9[var12];
                if (~var13 > ~this.field881) {
                    var8[var12] = this.field881;
                } else if (~this.field882 > ~var13) {
                    var8[var12] = this.field882;
                } else {
                    var8[var12] = var13;
                }
                if (~this.field881 >= ~var14) {
                    if (~this.field882 > ~var14) {
                        var11[var12] = this.field882;
                    } else {
                        var11[var12] = var14;
                    }
                } else {
                    var11[var12] = this.field881;
                }
                if (var15 < this.field881) {
                    var10[var12] = this.field881;
                } else if (~var15 < ~this.field882) {
                    var10[var12] = this.field882;
                } else {
                    var10[var12] = var15;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V")
    public static void method391(int arg0) {
        if (arg0 != 0) {
            method391(10);
        }
        field885 = null;
        field886 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 > 62) {
            ++field879;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field115 = arg1.method1517((byte) -96) == 1;
                    }
                } else {
                    this.field882 = arg1.method1521((byte) 113);
                }
            } else {
                this.field881 = arg1.method1521((byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)I")
    public static final int method392(byte arg0, int arg1) {
        ++field883;
        return arg0 != -59 ? 85 : arg1 >>> 7;
    }
}
