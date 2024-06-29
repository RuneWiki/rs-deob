import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class157 extends class478 {

    @OriginalMember(owner = "client!efa", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field1756 = new String[100];

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!efa", name = "G", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!efa", name = "I", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!efa", name = "J", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!efa", name = "K", descriptor = "Ltf;")
    public static class701 field1759;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIIIIII)V", line = 4)
    public static final void method845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 == -857644382) {
            ++field1755;
            if (~arg4 == ~arg8 && ~arg1 == ~arg9 && ~arg0 == ~arg3 && arg2 == arg5) {
                class39.method205(arg6 ^ 857644293, arg7, arg0, arg8, arg5, arg9);
            } else {
                int var10 = arg8;
                int var11 = arg9;
                int var12 = arg8 * 3;
                int var13 = arg9 * 3;
                int var14 = arg4 * 3;
                int var15 = arg1 * 3;
                int var16 = arg3 * 3;
                int var17 = arg2 * 3;
                int var18 = arg0 - (var16 - (var14 - arg8));
                int var19 = -var17 + arg5 + var15 + -arg9;
                int var20 = var16 - var14 + -var14 + var12;
                int var21 = var17 - var15 + -var15 + var13;
                int var22 = var14 - var12;
                int var23 = -var13 + var15;
                for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var24 * var25 >> 12;
                    int var27 = var18 * var26;
                    int var28 = var19 * var26;
                    int var29 = var20 * var25;
                    int var30 = var21 * var25;
                    int var31 = var22 * var24;
                    int var32 = var23 * var24;
                    int var33 = (var27 - -var29 + var31 >> 12) + arg8;
                    int var34 = (var28 + var30 - -var32 >> 12) + arg9;
                    class39.method205(-68, arg7, var33, var10, var34, var11);
                    var11 = var34;
                    var10 = var33;
                }
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(II)[I", line = 79)
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -11323) {
            return null;
        } else {
            ++field1758;
            int[] var3 = super.field6886.method789(arg0, (byte) 122);
            if (super.field6886.field1592) {
                int var4 = class695.field9740[arg0];
                for (int var5 = 0; class436.field6154 > var5; ++var5) {
                    var3[var5] = this.method849(class684.field9645[var5], (byte) 103, var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BI)V", line = 112)
    public static final void method846(byte arg0, int arg1) {
        ++field1751;
        int var2 = -class181.field2034 + class678.field9539;
        if (var2 >= 100) {
            class538.field7572 = 1;
            class510.field7319 = -1;
            class307.field3791 = -1;
        } else {
            int var3 = (int) class654.field9173;
            if (~(class480.field6916 >> 8) < ~var3) {
                var3 = class480.field6916 >> 8;
            }
            if (class689.field9699[4] && var3 < class280.field3482[4] + 128) {
                var3 = class280.field3482[4] + 128;
            }
            if (arg0 == 14) {
                int var4 = (int) class508.field7300 - -class191.field2193 & 16383;
                class194.method1178(class593.method3335(class362.field4859.field5176, class169.field1888, 27648, class362.field4859.field5179) + -200, (byte) -62, class463.field6603, class307.field3793, var3, (var3 >> 3) * 3 + 600 << 2, var4, arg1);
                float var5 = 1.0F - (float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
                class44.field432 = (int) ((float) (-class684.field9646 + class44.field432) * var5 + (float) class684.field9646);
                class485.field6986 = (int) ((float) (-class554.field7917 + class485.field6986) * var5 + (float) class554.field7917);
                class516.field7360 = (int) ((float) (-class139.field1539 + class516.field7360) * var5 + (float) class139.field1539);
                class689.field9698 = (int) ((float) (class689.field9698 - class19.field158) * var5 + (float) class19.field158);
                int var6 = class505.field7273 - field1752;
                if (var6 > 8192) {
                    var6 -= 16384;
                } else if (var6 < -8192) {
                    var6 += 16384;
                }
                class505.field7273 = (int) ((float) var6 * var5 + (float) field1752);
                class505.field7273 &= 16383;
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BILjava/io/File;)[B", line = 161)
    public static final byte[] method847(byte arg0, int arg1, File arg2) {
        ++field1754;
        try {
            if (arg0 < 27) {
                return null;
            } else {
                byte[] var3 = new byte[arg1];
                class234.method1393(arg2, false, arg1, var3);
                return var3;
            }
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)V", line = 182)
    public static final void method848(byte arg0) {
        if (arg0 <= 48) {
            method850((byte) -73);
        }
        if (class421.field5601 == 9) {
            class585.method3308(5, 22731);
        } else if (~class421.field5601 != -6 && class421.field5601 != 6) {
            if (~class421.field5601 == -13) {
                class585.method3308(3, 22731);
            }
        } else {
            class585.method3308(3, 22731);
        }
        ++field1753;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IBI)I", line = 210)
    private final int method849(int arg0, byte arg1, int arg2) {
        if (arg1 != 103) {
            field1752 = -47;
        }
        ++field1757;
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 << 1 ^ var4;
        return 4096 - ((var5 * var5 * 15731 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V", line = 225)
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)V", line = 232)
    public static void method850(byte arg0) {
        field1756 = null;
        field1759 = null;
        if (arg0 >= -126) {
            field1756 = null;
        }
    }
}
