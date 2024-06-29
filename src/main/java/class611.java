import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class611 extends class573 {

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
    private int field8889 = 0;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
    private int field8888 = 1365;

    @OriginalMember(owner = "client!qp", name = "S", descriptor = "I")
    private int field8897 = 0;

    @OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
    private int field8895 = 20;

    @OriginalMember(owner = "client!qp", name = "O", descriptor = "I")
    public static int field8893 = 0;

    @OriginalMember(owner = "client!qp", name = "P", descriptor = "B")
    public static byte field8894;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!qp", name = "R", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "[Loe;")
    public static class185[] field8891;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLom;Lfa;)V")
    public static final void method3508(byte arg0, class344 arg1, class214 arg2) {
        class575.field8348 = arg2;
        ++field8896;
        if (arg0 > 17) {
            class253.field3754 = arg1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 == 3) {
            ++field8887;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 == -4) {
                            this.field8897 = arg0.method723((byte) -25);
                        }
                    } else {
                        this.field8889 = arg0.method723((byte) -25);
                    }
                } else {
                    this.field8895 = arg0.method723((byte) -25);
                }
            } else {
                this.field8888 = arg0.method723((byte) -25);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
    public class611() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIBIZIII)Z")
    public static final boolean method3509(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field8892;
        int var9 = class532.field7456.field8787[0];
        int var10 = class532.field7456.field8785[0];
        if (var9 >= 0 && ~var9 > ~class675.field9604 && var10 >= 0 && ~var10 > ~class218.field3316) {
            if (arg0 >= 0 && ~arg0 > ~class675.field9604 && ~arg7 <= -1 && class218.field3316 > arg7) {
                int var11 = class96.method911(class394.field5761, arg4, arg2, arg5, arg1, arg8, arg7, arg6, class223.field3352[class532.field7456.field9814], var10, (byte) -55, class532.field7456.method3446(0), var9, arg0, class47.field1139);
                if (~var11 > -2) {
                    return false;
                } else {
                    class459.field6558 = class47.field1139[var11 + -1];
                    if (arg3 <= 74) {
                        method3508((byte) 23, (class344) null, (class214) null);
                    }
                    class51.field1189 = class394.field5761[var11 + -1];
                    class202.field3118 = false;
                    class703.method3925(126);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "(I)V")
    public static void method3510(int arg0) {
        field8891 = null;
        if (arg0 != 16384) {
            method3510(84);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field8890;
        if (arg1 != 1) {
            this.field8895 = 10;
        }
        int[] var3 = super.field8321.method3164(arg0, -107);
        if (super.field8321.field7825) {
            for (int var4 = 0; ~class540.field7555 < ~var4; ++var4) {
                int var5 = (class51.field1194[var4] << 12) / this.field8888 + this.field8889;
                int var6 = (class230.field3460[arg0] << 12) / this.field8888 + this.field8897;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~this.field8895 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 - var12;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field8895 + -1 <= var13 ? 0 : (var13 << 12) / this.field8895;
            }
        }
        return var3;
    }
}
