import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class212 extends class272 {

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
    private int field3878 = 0;

    @OriginalMember(owner = "client!tk", name = "mb", descriptor = "I")
    private int field3894 = 0;

    @OriginalMember(owner = "client!tk", name = "ab", descriptor = "I")
    private int field3882 = 0;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "Z")
    public static boolean field3864 = false;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "Lli;")
    private static class185 field3872 = class245.method1649("Thu", 127);

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "Lli;")
    private static class185 field3869 = class245.method1649("Wed", 127);

    @OriginalMember(owner = "client!tk", name = "bb", descriptor = "Lli;")
    private static class185 field3883 = class245.method1649("Sun", -61);

    @OriginalMember(owner = "client!tk", name = "ib", descriptor = "Lli;")
    private static class185 field3890 = class245.method1649("Mon", 122);

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "Lli;")
    private static class185 field3879 = class245.method1649("Sat", 125);

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "J")
    public static volatile long field3875 = 0L;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "Lli;")
    private static class185 field3870 = class245.method1649("Fri", 122);

    @OriginalMember(owner = "client!tk", name = "ob", descriptor = "Lli;")
    private static class185 field3896 = class245.method1649("Tue", 122);

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "[Lli;")
    public static class185[] field3877 = new class185[] { field3883, field3890, field3896, field3869, field3872, field3870, field3879 };

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "Lgf;")
    public static class7 field3868 = new class7(64);

    @OriginalMember(owner = "client!tk", name = "qb", descriptor = "I")
    public static int field3898 = 0;

    @OriginalMember(owner = "client!tk", name = "rb", descriptor = "I")
    public static int field3899 = 0;

    @OriginalMember(owner = "client!tk", name = "pb", descriptor = "Lli;")
    public static class185 field3897 = class245.method1649("hint_mapmarkers", 124);

    @OriginalMember(owner = "client!tk", name = "sb", descriptor = "Lli;")
    public static class185 field3900 = class245.method1649("::tele ", 122);

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    private int field3866;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
    private int field3871;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!tk", name = "Z", descriptor = "I")
    private int field3881;

    @OriginalMember(owner = "client!tk", name = "cb", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!tk", name = "db", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!tk", name = "eb", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!tk", name = "fb", descriptor = "I")
    private int field3887;

    @OriginalMember(owner = "client!tk", name = "gb", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!tk", name = "hb", descriptor = "I")
    private int field3889;

    @OriginalMember(owner = "client!tk", name = "jb", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!tk", name = "kb", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!tk", name = "lb", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!tk", name = "nb", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field3867;
        int[][] var3 = super.field4818.method1514(-2, arg0);
        int var4 = -103 % ((arg1 - -60) / 45);
        if (super.field4818.field3954) {
            int[][] var5 = this.method1860(arg0, 3, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var3[1];
            int[] var9 = var5[2];
            int[] var10 = var3[2];
            int[] var11 = var3[0];
            for (int var12 = 0; ~class246.field4385 < ~var12; ++var12) {
                this.method1492(var6[var12], var9[var12], 1, var7[var12]);
                this.field3871 += this.field3878;
                this.field3866 += this.field3894;
                if (~this.field3866 > -1) {
                    this.field3866 = 0;
                }
                if (this.field3866 > 4096) {
                    this.field3866 = 4096;
                }
                this.field3889 += this.field3882;
                while (this.field3871 < 0) {
                    this.field3871 += 4096;
                }
                while (~this.field3871 < -4097) {
                    this.field3871 -= 4096;
                }
                if (~this.field3889 > -1) {
                    this.field3889 = 0;
                }
                if (this.field3889 > 4096) {
                    this.field3889 = 4096;
                }
                this.method1489((byte) -127, this.field3866, this.field3889, this.field3871);
                var11[var12] = this.field3885;
                var8[var12] = this.field3881;
                var10[var12] = this.field3887;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1484(int arg0, Throwable arg1) throws IOException {
        ++field3891;
        String var2;
        if (!(arg1 instanceof class161)) {
            var2 = "";
        } else {
            class161 var3 = (class161) arg1;
            var2 = var3.field3044 + " | ";
            arg1 = var3.field3042;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        if (arg0 != 4) {
            return null;
        } else {
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                while (true) {
                    String var9 = var7.readLine();
                    if (var9 == null) {
                        return var2 + "| " + var8;
                    }
                    int var10 = var9.indexOf(40);
                    int var11 = var9.indexOf(41, var10 - -1);
                    if (var10 >= 0 && ~var11 <= -1) {
                        String var12 = var9.substring(var10 - -1, var11);
                        int var13 = var12.indexOf(".java:");
                        if (~var13 <= -1) {
                            String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                            var2 = var2 + var14 + ' ';
                            continue;
                        }
                        var9 = var9.substring(0, var10);
                    }
                    String var15 = var9.trim();
                    String var16 = var15.substring(1 + var15.lastIndexOf(32));
                    String var17 = var16.substring(1 + var16.lastIndexOf(9));
                    var2 = var2 + var17 + ' ';
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZIILhi;IZ)V")
    public static final void method1485(int arg0, boolean arg1, int arg2, int arg3, class250 arg4, int arg5, boolean arg6) {
        class78.field1360 = arg3;
        class241.field4303 = arg4;
        class248.field4400 = arg0;
        class23.field381 = arg2;
        class32.field527 = 1;
        ++field3892;
        class133.field2381 = arg1;
        if (arg6) {
            field3899 = 77;
        }
        class248.field4408 = arg5;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lie;I)I")
    public static final int method1486(class71 arg0, int arg1) {
        class81 var2 = arg0.field1236;
        ++field3888;
        if (var2.field1411 != null) {
            var2 = var2.method525((byte) -88);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = -31 % ((-30 - arg1) / 46);
        int var4 = var2.field1462;
        if (~arg0.field2693 == ~arg0.field2654) {
            var4 = var2.field1433;
        } else if (arg0.field2667 == arg0.field2654) {
            var4 = var2.field1431;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(Z)I")
    public static final int method1487(boolean arg0) {
        ++field3895;
        if (!arg0) {
            field3877 = null;
        }
        return class227.field4137 && class139.field2615[81] && class127.field2283 > 2 ? class158.field3004[class127.field2283 + -2] : class158.field3004[class127.field2283 + -1];
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(JI)V")
    public static final void method1488(long arg0, int arg1) {
        ++field3876;
        if (~arg0 < -1L) {
            if (arg1 > -15) {
                method1491((byte) -127);
            }
            if (~(arg0 % 10L) == -1L) {
                class217.method1519(arg0 - 1L, 2);
                class217.method1519(1L, 2);
            } else {
                class217.method1519(arg0, 2);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BIII)V")
    private final void method1489(byte arg0, int arg1, int arg2, int arg3) {
        ++field3874;
        int var5 = arg1 > 2048 ? arg1 + arg2 + -(arg1 * arg2 >> 12) : (arg2 + 4096) * arg1 >> 12;
        if (~var5 >= -1) {
            this.field3885 = this.field3881 = this.field3887 = arg1;
        } else {
            int var6 = arg1 + arg1 + -var5;
            int var7 = (-var6 + var5 << 12) / var5;
            int var8 = arg3 * 6;
            int var9 = var8 >> 12;
            int var10 = -(var9 << 12) + var8;
            int var12 = var7 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 - -var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field3885 = var5;
                                    this.field3887 = var15;
                                    this.field3881 = var6;
                                }
                            } else {
                                this.field3885 = var14;
                                this.field3887 = var5;
                                this.field3881 = var6;
                            }
                        } else {
                            this.field3887 = var5;
                            this.field3881 = var15;
                            this.field3885 = var6;
                        }
                    } else {
                        this.field3881 = var5;
                        this.field3885 = var6;
                        this.field3887 = var14;
                    }
                } else {
                    this.field3881 = var5;
                    this.field3885 = var15;
                    this.field3887 = var6;
                }
            } else {
                this.field3887 = var6;
                this.field3881 = var14;
                this.field3885 = var5;
            }
        }
        if (arg0 >= -110) {
            this.method32(-103, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field3893;
        int var4 = 59 / ((arg1 - -21) / 55);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3894 = (arg0.method838(1275919136) << 12) / 100;
                }
            } else {
                this.field3882 = (arg0.method838(1275919136) << 12) / 100;
            }
        } else {
            this.field3878 = arg0.method876(65280);
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(Z)V")
    public static final void method1490(boolean arg0) {
        ++field3886;
        if (arg0) {
            if (!(class274.field4859 < class169.field3129)) {
                if (class274.field4859 > class169.field3129) {
                    class274.field4859 = (float) ((double) class274.field4859 - (double) class274.field4859 / 30.0D);
                    if (class274.field4859 < class169.field3129) {
                        class274.field4859 = class169.field3129;
                    }
                    class268.method1820(-13248);
                }
            } else {
                class274.field4859 = (float) ((double) class274.field4859 / 30.0D + (double) class274.field4859);
                if (class274.field4859 > class169.field3129) {
                    class274.field4859 = class169.field3129;
                }
                class268.method1820(-13248);
            }
            if (class251.field4472 != -1 && ~class149.field2824 != 0) {
                int var1 = -class66.field1146 + class251.field4472;
                if (~var1 > -3 || var1 > 2) {
                    var1 >>= 4;
                }
                int var2 = class149.field2824 - field3884;
                if (~var2 > -3 || ~var2 < -3) {
                    var2 >>= 4;
                }
                field3884 += var2;
                class66.field1146 += var1;
                if (var1 == 0 && ~var2 == -1) {
                    class251.field4472 = -1;
                    class149.field2824 = -1;
                }
                class268.method1820(-13248);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public static void method1491(byte arg0) {
        field3883 = null;
        field3868 = null;
        field3869 = null;
        field3900 = null;
        field3872 = null;
        field3897 = null;
        int var1 = -29 / ((arg0 - 55) / 51);
        field3870 = null;
        field3877 = null;
        field3879 = null;
        field3896 = null;
        field3890 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class212() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V")
    private final void method1492(int arg0, int arg1, int arg2, int arg3) {
        ++field3873;
        int var5 = arg0 <= arg3 ? arg3 : arg0;
        int var6 = var5 >= arg1 ? var5 : arg1;
        int var7 = ~arg3 < ~arg0 ? arg0 : arg3;
        int var8 = var7 <= arg1 ? var7 : arg1;
        this.field3866 = (var8 - -var6) / 2;
        int var9 = -var8 + var6;
        if (var9 <= 0) {
            this.field3871 = 0;
        } else {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (arg0 != var6) {
                if (arg3 == var6) {
                    this.field3871 = arg1 != var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field3871 = ~arg0 != ~var8 ? -var10 + 20480 : 12288 - -var11;
                }
            } else {
                this.field3871 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field3871 /= 6;
        }
        if (this.field3866 > 0 && ~this.field3866 > -4097) {
            this.field3889 = (var9 << 12) / (~this.field3866 >= -2049 ? this.field3866 * 2 : -(this.field3866 * 2) + 8192);
        } else {
            this.field3889 = 0;
        }
        if (arg2 != 1) {
            field3875 = -67L;
        }
    }
}
