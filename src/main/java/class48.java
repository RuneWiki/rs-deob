import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class48 extends class260 {

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    private int field1031 = 1024;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    private int field1042 = 2048;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "I")
    private int field1049 = 3072;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "[I")
    public static int[] field1038 = new int[2500];

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "Loh;")
    public static class263 field1043 = class253.method1681(-119, "settings");

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "Loh;")
    public static class263 field1047 = class253.method1681(-126, "logo");

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "Ljava/lang/String;")
    public static String field1048;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "[Lw;")
    public static class141[] field1030;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILbi;)I")
    public static final int method307(int arg0, class90 arg1) {
        int var2 = 74 % ((arg0 - -58) / 49);
        ++field1036;
        class204 var3 = arg1.field1787;
        if (var3.field3691 != null) {
            var3 = var3.method1407((byte) -31);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field3714;
        if (arg1.field4687 != arg1.field4652) {
            if (~arg1.field4707 == ~arg1.field4652) {
                var4 = var3.field3654;
            }
        } else {
            var4 = var3.field3716;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field1035;
        if (arg1 != 5701) {
            method308(66, true);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4505 = arg2.method1301(-8317) == 1;
                }
            } else {
                this.field1049 = arg2.method1294((byte) 3);
            }
        } else {
            this.field1031 = arg2.method1294((byte) 3);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)I")
    public static final int method308(int arg0, boolean arg1) {
        ++field1034;
        if (arg1) {
            method313((byte) -83);
        }
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Loh;IBLoh;Loh;I)V")
    public static final void method309(class263 arg0, int arg1, byte arg2, class263 arg3, class263 arg4, int arg5) {
        if (arg2 != 7) {
            field1048 = null;
        }
        for (int var6 = 99; ~var6 < -1; --var6) {
            class46.field998[var6] = class46.field998[var6 - 1];
            class106.field2002[var6] = class106.field2002[var6 - 1];
            class244.field4310[var6] = class244.field4310[var6 + -1];
            class194.field3452[var6] = class194.field3452[var6 + -1];
            class18.field420[var6] = class18.field420[var6 + -1];
        }
        class46.field998[0] = arg1;
        class106.field2002[0] = arg3;
        ++class258.field4478;
        class188.field3393 = class112.field2108;
        ++field1045;
        class244.field4310[0] = arg0;
        class18.field420[0] = arg5;
        class194.field3452[0] = arg4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([IJII)Loh;")
    public static final class263 method310(int[] arg0, long arg1, int arg2, int arg3) {
        ++field1037;
        if (class251.field4376 != null) {
            class263 var5 = class251.field4376.method241((byte) -127, arg0, arg3, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg2 != -30953) {
            method314(88, 36, 123, -93);
        }
        return arg3 == 5 ? class233.method1565(37, arg1).method1761(122) : class98.method674(-25940, arg1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field1041;
        int[][] var3 = super.field4509.method1667(arg0, arg1 ^ arg1);
        if (super.field4509.field4346) {
            int[][] var4 = this.method1712((byte) 3, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class49.field1052 > var11; ++var11) {
                var8[var11] = this.field1031 - -(var6[var11] * this.field1042 >> 12);
                var9[var11] = (var5[var11] * this.field1042 >> 12) + this.field1031;
                var10[var11] = this.field1031 - -(var7[var11] * this.field1042 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILah;I)V")
    public static final void method311(int arg0, class267 arg1, int arg2) {
        if (~arg1.field4663 < ~class228.field4012) {
            class57.method359(false, arg1);
        } else if (~arg1.field4659 <= ~class228.field4012) {
            class87.method615(arg1, 16040);
        } else {
            class34.method221((byte) 6, arg1);
        }
        ++field1046;
        if (arg2 != 64) {
            field1032 = 116;
        }
        if (~arg1.field4688 > -129 || arg1.field4705 < 128 || ~arg1.field4688 <= -13185 || ~arg1.field4705 <= -13185) {
            arg1.field4694 = -1;
            arg1.field4659 = 0;
            arg1.field4663 = 0;
            arg1.field4689 = -1;
            arg1.field4688 = arg1.field4714[0] * 128 + 64 * arg1.method898(114);
            arg1.field4705 = arg1.field4713[0] * 128 + arg1.method898(arg2 ^ 5) * 64;
            arg1.method1803(-89);
        }
        if (class229.field4018 == arg1 && (~arg1.field4688 > -1537 || ~arg1.field4705 > -1537 || ~arg1.field4688 <= -11777 || arg1.field4705 >= 11776)) {
            arg1.field4659 = 0;
            arg1.field4689 = -1;
            arg1.field4694 = -1;
            arg1.field4663 = 0;
            arg1.field4688 = arg1.field4714[0] * 128 - -(64 * arg1.method898(122));
            arg1.field4705 = arg1.field4713[0] * 128 - -(64 * arg1.method898(94));
            arg1.method1803(-125);
        }
        class59.method362(arg1, (byte) -26);
        class249.method1670(arg1, 80);
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V")
    public static void method312(int arg0) {
        field1030 = null;
        field1047 = null;
        if (arg0 != 2) {
            method308(-67, true);
        }
        field1038 = null;
        field1043 = null;
        field1048 = null;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)Lha;")
    public static final class30 method313(byte arg0) {
        ++field1033;
        if (arg0 != -68) {
            field1038 = null;
        }
        try {
            return (class30) Class.forName("sd").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method88(90);
        }
        int[] var3 = super.field4511.method304(arg0, false);
        ++field1044;
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(arg0, 0, false);
            for (int var5 = 0; var5 < class49.field1052; ++var5) {
                var3[var5] = (var4[var5] * this.field1042 >> 12) + this.field1031;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        if (arg0 > 81) {
            this.field1042 = -this.field1031 + this.field1049;
            ++field1039;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)Z")
    public static final boolean method314(int arg0, int arg1, int arg2, int arg3) {
        if (!class162.method1065(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class216.method1469(var4 + 1, class112.field2102[arg0][arg1][arg2] + arg3, var5 + 1) && class216.method1469(var4 + 128 - 1, class112.field2102[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class216.method1469(var4 + 128 - 1, class112.field2102[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class216.method1469(var4 + 1, class112.field2102[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class48() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(B)Z")
    public static final boolean method315(byte arg0) {
        ++field1040;
        if (class260.field4515) {
            try {
                if ((Boolean) class161.field2938.method1785(-25092, class95.field1867.field4557)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = -41 / ((-48 - arg0) / 61);
        return true;
    }
}
