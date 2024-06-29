import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class194 extends class51 {

    @OriginalMember(owner = "client!vf", name = "lb", descriptor = "I")
    private int field3825 = 4096;

    @OriginalMember(owner = "client!vf", name = "mb", descriptor = "I")
    private int field3826 = 0;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "[I")
    public static int[] field3815 = new int[4000];

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "Z")
    public static volatile boolean field3819 = true;

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!vf", name = "nb", descriptor = "I")
    public static int field3827 = 0;

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "Lea;")
    public static class38 field3823 = class9.method46((byte) 127, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!vf", name = "qb", descriptor = "[Z")
    public static boolean[] field3830 = new boolean[100];

    @OriginalMember(owner = "client!vf", name = "ob", descriptor = "Lea;")
    private static class38 field3828 = class9.method46((byte) 126, "New User");

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lea;")
    public static class38 field3820 = field3828;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!vf", name = "pb", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "[[I")
    public static int[][] field3816;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class194() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[Lfh;[BIIIIIB)V")
    public static final void method1285(int arg0, int arg1, class54[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        ++field3813;
        for (int var10 = 0; ~var10 > -9; ++var10) {
            for (int var16 = 0; ~var16 > -9; ++var16) {
                if (arg4 - -var10 > 0 && arg4 + var10 < 103 && arg5 + var16 > 0 && ~(arg5 + var16) > -104) {
                    arg2[arg8].field1389[arg4 + var10][arg5 + var16] = class52.method380(arg2[arg8].field1389[arg4 + var10][arg5 + var16], -16777217);
                }
            }
        }
        int var11 = 11 % ((arg9 - 61) / 41);
        class66 var12 = new class66(arg3);
        for (int var13 = 0; var13 < 4; ++var13) {
            for (int var14 = 0; var14 < 64; ++var14) {
                for (int var15 = 0; ~var15 > -65; ++var15) {
                    if (~arg6 == ~var13 && ~var14 <= ~arg0 && var14 < arg0 + 8 && var15 >= arg1 && arg1 - -8 > var15) {
                        class200.method1309(0, 0, arg7, arg4 - -class97.method808(7 & var14, 104, arg7, var15 & 7), arg8, -9890, var12, class166.method1181(arg7, 100, 7 & var14, var15 & 7) + arg5);
                    } else {
                        class200.method1309(0, 0, 0, -1, 0, -9890, var12, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
    public static void method1286(int arg0) {
        field3823 = null;
        field3830 = null;
        field3820 = null;
        field3815 = null;
        field3816 = null;
        field3828 = null;
        if (arg0 != 32258) {
            method1288(-6, -101, -102);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Lbb;")
    public static final class12 method1287(int arg0, int arg1) {
        ++field3818;
        class12 var2 = (class12) client.field542.method1078((byte) 80, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 != 8237) {
                field3822 = -60;
            }
            byte[] var3 = class96.field2154.method215(arg1, 3, 1);
            class12 var4 = new class12();
            if (var3 != null) {
                var4.method62(new class66(var3), (byte) -46);
            }
            client.field542.method1076((long) arg1, -4, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field3817;
        int[] var3 = super.field1312.method827(arg1, true);
        if (arg0 >= -125) {
            field3819 = true;
        }
        if (super.field1312.field2271) {
            int[] var4 = this.method376(arg1, 0, -48);
            for (int var5 = 0; var5 < class86.field2008; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field3826 && ~this.field3825 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)I")
    public static final int method1288(int arg0, int arg1, int arg2) {
        ++field3814;
        if (arg2 != -32594) {
            field3820 = null;
        }
        class105 var3 = (class105) class19.field410.method183((byte) 87, (long) arg1);
        if (var3 == null) {
            return -1;
        } else {
            return arg0 >= 0 && arg0 < var3.field2348.length ? var3.field2348[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILdd;Ldd;Ldd;Ldd;)V")
    public static final void method1289(int arg0, class32 arg1, class32 arg2, class32 arg3, class32 arg4) {
        class149.field3086 = arg3;
        ++field3829;
        class176.field3554 = arg1;
        class66.field1590 = arg4;
        class186.field3707 = arg2;
        class168.field3461 = new class43[class149.field3086.method192((byte) 93)][];
        if (arg0 == -23499) {
            class127.field2728 = new boolean[class149.field3086.method192((byte) 64)];
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field3821;
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field3825 = arg0.method511(81);
                }
            } else {
                this.field3826 = arg0.method511(-126);
            }
        }
    }
}
