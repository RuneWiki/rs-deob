import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class457 extends class354 {

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    private int field6748 = 4096;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    private int field6751 = 0;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "Lsv;")
    public static class467 field6752 = new class467(15, 0, 1, 0);

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "[B")
    public static byte[] field6753 = new byte[2048];

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 3)
    public static final int method2745(String arg0, boolean arg1) {
        if (!arg1) {
            return -88;
        } else {
            ++field6747;
            return class294.method1820(10, arg0, true, -6908);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lhh;II)Ljk;", line = 14)
    public static final class445 method2746(class84 arg0, int arg1, int arg2) {
        if (arg2 != -19520) {
            field6753 = null;
        }
        ++field6745;
        byte[] var3 = arg0.method680(true, arg1);
        return var3 == null ? null : new class445(var3);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILti;I)V", line = 31)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 != 15180) {
            field6752 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field5354 = arg1.method1918((byte) -81) == 1;
                }
            } else {
                this.field6748 = arg1.method1868(0);
            }
        } else {
            this.field6751 = arg1.method1868(arg0 ^ 15180);
        }
        ++field6750;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 74)
    public class457() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)[[I", line = 82)
    public final int[][] method207(byte arg0, int arg1) {
        ++field6746;
        if (arg0 > -40) {
            this.field6751 = 50;
        }
        int[][] var3 = super.field5351.method2819((byte) -18, arg1);
        if (super.field5351.field6959) {
            int[][] var4 = this.method2291(0, (byte) -99, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class404.field5952; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field6751 < ~var12) {
                    var8[var11] = this.field6751;
                } else if (~var12 >= ~this.field6748) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field6748;
                }
                if (var13 >= this.field6751) {
                    if (this.field6748 < var13) {
                        var9[var11] = this.field6748;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field6751;
                }
                if (this.field6751 <= var14) {
                    if (~this.field6748 > ~var14) {
                        var10[var11] = this.field6748;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field6751;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V", line = 159)
    public static void method2747(int arg0) {
        field6752 = null;
        field6753 = null;
        if (arg0 > -13) {
            method2747(-100);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)[I", line = 178)
    public final int[] method253(int arg0, byte arg1) {
        ++field6749;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            return null;
        } else {
            if (super.field5357.field1869) {
                int[] var4 = this.method2293(0, arg0, (byte) 69);
                for (int var5 = 0; ~class404.field5952 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (var6 < this.field6751) {
                        var3[var5] = this.field6751;
                    } else if (var6 <= this.field6748) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field6748;
                    }
                }
            }
            return var3;
        }
    }
}
