import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class503 extends class388 {

    @OriginalMember(owner = "client!hha", name = "D", descriptor = "S")
    public static short field7317 = 256;

    @OriginalMember(owner = "client!hha", name = "r", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!hha", name = "s", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!hha", name = "t", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!hha", name = "u", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!hha", name = "v", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!hha", name = "w", descriptor = "I")
    public int field7310;

    @OriginalMember(owner = "client!hha", name = "x", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!hha", name = "y", descriptor = "I")
    public int field7312;

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "I")
    public int field7313;

    @OriginalMember(owner = "client!hha", name = "B", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!hha", name = "C", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!hha", name = "E", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!hha", name = "F", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!hha", name = "G", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!hha", name = "A", descriptor = "Ljava/lang/String;")
    public String field7314;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)J", line = 5)
    public final long method3071(int arg0) {
        if (arg0 < 88) {
            return 48L;
        } else {
            ++field7319;
            return Long.MAX_VALUE & super.field5602;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "([[BB[B[I[II[[BI)I", line = 18)
    public static final int method3072(byte[][] arg0, byte arg1, byte[] arg2, int[] arg3, int[] arg4, int arg5, byte[][] arg6, int arg7) {
        ++field7306;
        int var8 = arg4[arg7];
        int var9 = arg3[arg7] + var8;
        int var10 = arg4[arg5];
        int var11 = arg3[arg5] + var10;
        int var12 = var8;
        if (~var8 > ~var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg2[arg7] & 255;
        if (~(255 & arg2[arg5]) > ~var14) {
            var14 = 255 & arg2[arg5];
        }
        byte[] var15 = arg6[arg7];
        byte[] var16 = arg0[arg5];
        int var17 = -var8 + var12;
        if (arg1 != -121) {
            field7317 = 29;
        }
        int var18 = -var10 + var12;
        for (int var19 = var12; var19 < var13; ++var19) {
            int var20 = var15[var17++] - -var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I[BIZII)V", line = 81)
    public static final void method3073(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field7318;
        if (arg3) {
            if (~arg5 > ~arg4) {
                int var6 = -arg5 + arg4 >> 2;
                int var7 = arg2 + arg5;
                while (true) {
                    --var6;
                    if (var6 < 0) {
                        int var8 = 3 & arg4 - arg5;
                        while (true) {
                            --var8;
                            if (~var8 > -1) {
                                return;
                            }
                            arg1[var7++] = 1;
                        }
                    }
                    arg1[var7++] = 1;
                    arg1[var7++] = 1;
                    arg1[var7++] = 1;
                    arg1[var7++] = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "(I)V", line = 111)
    public final void method3074(int arg0) {
        super.field5602 = Long.MIN_VALUE & super.field5602 | 500L + class465.method2818(255);
        ++field7309;
        if (arg0 >= -86) {
            this.field7313 = 11;
        }
        class412.field5871.method3029(0, this);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V", line = 123)
    public final void method3075(byte arg0) {
        int var2 = -123 / ((-6 - arg0) / 45);
        super.field5602 |= Long.MIN_VALUE;
        ++field7316;
        if (~this.method3071(100) == -1L) {
            class57.field967.method3029(0, this);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IB)Z", line = 138)
    public static final boolean method3076(int arg0, byte arg1) {
        ++field7307;
        if (arg1 < 101) {
            return true;
        } else if (arg0 != 6 && arg0 != 15 && ~arg0 != -31 && arg0 != 44 && arg0 != 1012) {
            return ~arg0 == -9 || arg0 == 1009;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "(B)I", line = 157)
    public final int method3077(byte arg0) {
        ++field7315;
        if (arg0 != -55) {
            method3072((byte[][]) null, (byte) 36, (byte[]) null, (int[]) null, (int[]) null, -107, (byte[][]) null, 86);
        }
        return (int) (255L & super.field6188 >>> 32);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(CI)Z", line = 168)
    public static final boolean method3078(char arg0, int arg1) {
        if (arg1 != 1009) {
            return false;
        } else {
            ++field7320;
            if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || ~arg0 < -256)) {
                if (~arg0 != -1) {
                    char[] var2 = class93.field1328;
                    for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                        char var4 = var2[var3];
                        if (~arg0 == ~var4) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(Z)I", line = 205)
    public final int method3079(boolean arg0) {
        if (arg0) {
            this.method3079(true);
        }
        ++field7311;
        return (int) super.field6188;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILjava/lang/String;)I", line = 218)
    public static final int method3080(int arg0, int arg1, String arg2) {
        ++field7308;
        return arg1 != -3290 ? -110 : class208.method1484(arg0, arg2, true, (byte) -128);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIIIIII)V", line = 230)
    public static final void method3081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7305;
        for (class741 var7 = (class741) class562.field8147.method1527(78); var7 != null; var7 = (class741) class562.field8147.method1523(true)) {
            if (~var7.field10345 >= ~class703.field9918) {
                var7.method814(44);
            } else {
                class733.method4080(var7.field10342, arg5 ^ -16068, arg4, arg1 >> 1, var7.field10340 * 2, arg2 >> 1, arg0, (var7.field10339 << 9) + 256, (var7.field10343 << 9) + 256);
                class193.field2838.method2424((byte) 106, 0, class90.field1273[1] + arg6, class90.field1273[0] + arg3, var7.field10337, -16777216 | var7.field10344);
            }
        }
        if (arg5 != -16068) {
            method3073(-36, (byte[]) null, -74, true, 114, -36);
        }
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(II)V", line = 256)
    public class503(int arg0, int arg1) {
        super.field6188 = (long) arg0 << 32 | (long) arg1;
    }
}
