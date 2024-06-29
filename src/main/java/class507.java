import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class507 extends class14 {

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "Lcu;")
    public static class145 field7040 = new class145(62, -1);

    @OriginalMember(owner = "client!wn", name = "Q", descriptor = "Lwv;")
    public static class26 field7042 = new class26("WTI", 5);

    @OriginalMember(owner = "client!wn", name = "U", descriptor = "Z")
    public static boolean field7046 = false;

    @OriginalMember(owner = "client!wn", name = "T", descriptor = "Lsl;")
    public static class317 field7045 = new class317("", 16);

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!wn", name = "R", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!wn", name = "S", descriptor = "Lte;")
    public static class434 field7044;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (~arg0 == -1) {
            super.field263 = ~arg2.method2238(255) == -2;
        }
        int var4 = -80 / ((arg1 - -51) / 37);
        ++field7039;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(BII)Lcl;")
    public static final class173 method2896(byte arg0, int arg1, int arg2) {
        if (arg0 >= -14) {
            return null;
        } else {
            ++field7037;
            class173 var3 = new class173();
            var3.field2512 = -1;
            var3.field2522 = -1;
            var3.field2524 = arg1 + 6;
            var3.field2527 = arg2 - -1 + 5;
            var3.field2519 = new int[var3.field2524][var3.field2527];
            var3.method1155(true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field7041;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 >= -2) {
            field7042 = null;
        }
        if (super.field270.field5222) {
            int[] var4 = this.method145(arg0, 0, -18596);
            for (int var5 = 0; ~class115.field1637 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(B)V")
    public static void method2897(byte arg0) {
        field7040 = null;
        field7045 = null;
        if (arg0 > 64) {
            field7042 = null;
            field7044 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)V")
    public static final void method2898(int arg0, int arg1) {
        ++field7043;
        if (~class454.field6161 != ~arg1) {
            if (~class454.field6161 == -1) {
                class520.method3063((byte) 124);
            }
            if (arg1 == 40) {
                class99.method706((byte) -67);
            }
            if (arg0 == 1) {
                if (~arg1 != -41 && class297.field3880 != null) {
                    class297.field3880.method1886(-1);
                    class297.field3880 = null;
                }
                if (~class454.field6161 == -26 || class454.field6161 == 28) {
                    class258.field3420.field6535 = 2;
                    class149.field2130.field6535 = 2;
                    class347.field4685.field6535 = 2;
                    class280.field3677.field6535 = 2;
                    class277.field3630.field6535 = 2;
                    class435.field5973.field6535 = 2;
                    class48.field753.field6535 = 2;
                }
                if (arg1 == 25 || arg1 == 28) {
                    class286.field3743 = 0;
                    class496.field6881 = 0;
                    class191.field2694 = 1;
                    class128.field1869 = 1;
                    class523.field7734 = 0;
                    class148.method1023(true, true);
                    class258.field3420.field6535 = 1;
                    class149.field2130.field6535 = 1;
                    class347.field4685.field6535 = 1;
                    class280.field3677.field6535 = 1;
                    class277.field3630.field6535 = 1;
                    class435.field5973.field6535 = 1;
                    class48.field753.field6535 = 1;
                }
                if (arg1 == 25 || ~arg1 == -11) {
                    class441.method2543((byte) 99);
                }
                if (arg1 == 5) {
                    class21.method198(class71.field1082, class370.field4984, 2);
                } else {
                    class102.method716(3);
                }
                boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
                boolean var3 = class454.field6161 == 5 || ~class454.field6161 == -11 || class454.field6161 == 28;
                if (!var2 != !var3) {
                    if (var2) {
                        class153.field2234 = class400.field5371;
                        if (~class154.field2244.field7775 == -1) {
                            client.method1258(2, (byte) 98);
                        } else {
                            class413.method2396(-16224, class154.field2244.field7775, class449.field6118, class400.field5371, 2, 0, false);
                        }
                        class287.field3760.method1557((byte) -89, false);
                    } else {
                        client.method1258(2, (byte) 29);
                        class287.field3760.method1557((byte) -89, true);
                    }
                }
                if (~arg1 == -26 || ~arg1 == -29 || ~arg1 == -41) {
                    class370.field4984.method615();
                }
                class454.field6161 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
    public class507() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class370[] var7 = class335.field4395;
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class370 var9 = var7[var8];
            if (var9 != null && ~var9.field4980 == -3) {
                class54.method396(var9.field4976, arg4, var9.field4974 * 2, -18510, arg6 >> 1, arg0 >> 1, var9.field4982, var9.field4985, arg5);
                if (~class80.field1181[0] < 0 && class31.field516 % 20 < 10) {
                    class44.field662[var9.field4977].method3109(arg3 + -12 + class80.field1181[0], class80.field1181[1] + arg1 + -28);
                }
            }
        }
        if (arg2 != 10) {
            field7045 = null;
        }
        ++field7038;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB[BI)[B")
    public static final byte[] method2900(int arg0, byte arg1, byte[] arg2, int arg3) {
        ++field7036;
        byte[] var4 = new byte[arg3];
        if (arg1 != 53) {
            field7046 = true;
        }
        class254.method1529(arg2, arg0, var4, 0, arg3);
        return var4;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field7035;
        if (arg0 != -30909) {
            field7042 = null;
        }
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int[][] var4 = this.method139(0, 2, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class115.field1637 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
