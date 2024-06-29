import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class122 extends class346 {

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    private int field1575 = 204;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    private int field1580 = 1;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    private int field1579 = 1;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "Ltr;")
    public static class173 field1581 = new class173();

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1583 = "cyan:";

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Lir;")
    public static class185 field1582;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([J[IIIB)V", line = 4)
    public static final void method874(long[] arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        ++field1572;
        if (arg4 < -65) {
            if (arg2 < arg3) {
                int var5 = (arg2 - -arg3) / 2;
                int var6 = arg2;
                long var7 = arg0[var5];
                arg0[var5] = arg0[arg3];
                arg0[arg3] = var7;
                int var9 = arg1[var5];
                arg1[var5] = arg1[arg3];
                arg1[arg3] = var9;
                for (int var10 = arg2; var10 < arg3; ++var10) {
                    if (~arg0[var10] > ~((long) (1 & var10) + var7)) {
                        long var11 = arg0[var10];
                        arg0[var10] = arg0[var6];
                        arg0[var6] = var11;
                        int var13 = arg1[var10];
                        arg1[var10] = arg1[var6];
                        arg1[var6++] = var13;
                    }
                }
                arg0[arg3] = arg0[var6];
                arg0[var6] = var7;
                arg1[arg3] = arg1[var6];
                arg1[var6] = var9;
                method874(arg0, arg1, arg2, var6 + -1, (byte) -99);
                method874(arg0, arg1, var6 + 1, arg3, (byte) -106);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIC)I", line = 59)
    public static final int method875(int arg0, int arg1, char arg2) {
        ++field1576;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) - -1;
        }
        if (~arg2 == arg1 && ~arg0 == -1) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lfb;ZI)V", line = 85)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1575 = arg0.method2239(-1076227960);
                }
            } else {
                this.field1579 = arg0.method2233((byte) 104);
            }
        } else {
            this.field1580 = arg0.method2233((byte) 104);
        }
        if (arg1) {
            field1584 = 71;
        }
        ++field1577;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V", line = 129)
    public static void method876(byte arg0) {
        int var1 = -120 / ((-65 - arg0) / 38);
        field1582 = null;
        field1583 = null;
        field1581 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIII)Z", line = 142)
    public static final boolean method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1578;
        if (arg4 < arg1 + arg6 && arg6 < arg2 + arg4) {
            if (~arg8 > ~(arg3 + arg7) && ~(arg5 + arg8) < ~arg3) {
                return arg0 != 1 ? true : true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 162)
    public class122() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[I", line = 181)
    public final int[] method45(int arg0, int arg1) {
        ++field1571;
        if (arg1 != 3) {
            return null;
        } else {
            int[] var3 = super.field5152.method1409((byte) 48, arg0);
            if (super.field5152.field3004) {
                for (int var4 = 0; ~var4 > ~class134.field1753; ++var4) {
                    int var5 = class361.field5340[var4];
                    int var6 = class436.field6337[arg0];
                    int var7 = this.field1580 * var5 >> 12;
                    int var8 = this.field1579 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field1580) * this.field1580;
                    int var10 = var6 % (4096 / this.field1579) * this.field1579;
                    if (var10 < this.field1575) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field1575) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~this.field1575 < ~var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }
}
