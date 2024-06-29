import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class363 extends class194 {

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    private int field4919 = 10;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    private int field4928 = 0;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    private int field4922 = 2048;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "[I")
    public static int[] field4917 = new int[16384];

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "[I")
    public static int[] field4927 = new int[16384];

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field4934;

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "S")
    public static short field4937;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "Lhq;")
    public static class365 field4932;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "Lwo;")
    public static class285 field4935;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "Lwo;")
    public static class285 field4936;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "Lak;")
    public static class31 field4933;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "[I")
    private int[] field4920;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "[I")
    private int[] field4921;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIZLak;Luo;I)V")
    public static final void method2278(int arg0, int arg1, int arg2, boolean arg3, class31 arg4, class118 arg5, int arg6) {
        if (arg3) {
            class347.field4724.method2659((class39.field457 + -class347.field4724.method235()) / 2, (class28.field315 - class347.field4724.method236()) / 2);
            class104.field1221.method2659((class39.field457 - class104.field1221.method235()) / 2, 18);
        }
        ++field4918;
        arg4.method204(-1, class39.field457 / 2, arg2, class28.field315 / 2 + -26, false, class31.field356 == 1 ? class191.field2248.method434(class373.field5057, -8192) : class379.field5158.method434(class373.field5057, arg6 ^ -8162));
        int var7 = class28.field315 / 2 + -18;
        arg5.method748(class39.field457 / 2 - 152, var7, 304, 34, arg1, 0);
        arg5.method748(class39.field457 / 2 + -151, var7 - -1, 302, 32, 0, 0);
        arg5.method789(class39.field457 / 2 - 150, var7 + 2, class298.field3965 * 3, arg6, arg0, 0);
        arg5.method789(class39.field457 / 2 + class298.field3965 * 3 + -150, var7 - -2, -(class298.field3965 * 3) + 300, 30, 0, 0);
        arg4.method204(-1, class39.field457 / 2, arg2, class28.field315 / 2 + 4, false, class263.field3378);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;IZ)Z")
    public static final boolean method2279(int arg0, String arg1, int arg2, boolean arg3) {
        ++field4923;
        if (~arg2 <= -3 && ~arg2 >= -37) {
            boolean var4 = false;
            if (arg0 != 1309) {
                method2279(-120, (String) null, -50, true);
            }
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg1.length();
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                char var9 = arg1.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg3) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || var9 > 'z') {
                        return false;
                    }
                    var11 = var9 - 'W';
                }
                if (~arg2 >= ~var11) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if (~(var10 / arg2) != ~var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field4926;
        int var3 = -15 / ((arg1 - 57) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int var5 = class249.field3283[arg0];
            if (this.field4928 == 0) {
                short var6 = 0;
                for (int var7 = 0; var7 < this.field4919; ++var7) {
                    if (~var5 <= ~this.field4921[var7] && this.field4921[var7 - -1] > var5) {
                        if (var5 < this.field4920[var7]) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class114.method665(var4, 0, class138.field1579, var6);
            } else {
                for (int var8 = 0; class138.field1579 > var8; ++var8) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class277.field3585[var8];
                    int var12 = this.field4928;
                    if (~var12 != -2) {
                        if (~var12 != -3) {
                            if (var12 == 3) {
                                var9 = 2048 - -(-var5 + var11 >> 1);
                            }
                        } else {
                            var9 = (var5 + -4096 + var11 >> 1) + 2048;
                        }
                    } else {
                        var9 = var11;
                    }
                    for (int var13 = 0; ~var13 > ~this.field4919; ++var13) {
                        if (~var9 <= ~this.field4921[var13] && ~this.field4921[var13 - -1] < ~var9) {
                            if (~this.field4920[var13] < ~var9) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var8] = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public final void method280(int arg0) {
        this.method2281(304);
        ++field4931;
        int var2 = 67 / ((arg0 - 28) / 63);
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V")
    public static void method2280(int arg0) {
        field4936 = null;
        field4934 = null;
        field4935 = null;
        field4933 = null;
        if (arg0 > -2) {
            field4917 = null;
        }
        field4917 = null;
        field4927 = null;
        field4932 = null;
    }

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)V")
    private final void method2281(int arg0) {
        ++field4930;
        this.field4920 = new int[this.field4919 + 1];
        int var2 = 0;
        this.field4921 = new int[this.field4919 + 1];
        int var3 = 4096 / this.field4919;
        if (arg0 != 304) {
            this.field4919 = 24;
        }
        int var4 = this.field4922 * var3 >> 12;
        for (int var5 = 0; var5 < this.field4919; ++var5) {
            this.field4921[var5] = var2;
            this.field4920[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4921[this.field4919] = 4096;
        this.field4920[this.field4919] = this.field4920[0] + 4096;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class363() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = 42 / ((52 - arg1) / 61);
        ++field4924;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field4928 = arg2.method1563(-128);
                }
            } else {
                this.field4922 = arg2.method1587((byte) -102);
            }
        } else {
            this.field4919 = arg2.method1563(-128);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static final void method2282(byte arg0) {
        ++field4925;
        class365 var1 = class287.field3780;
        synchronized (class287.field3780) {
            if (arg0 == -91) {
                class287.field3780.method2298(arg0 ^ -91);
            }
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field4927[var2] = (int) (32768.0D * Math.sin((double) var2 * var0));
            field4917[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field4934 = null;
        field4937 = 320;
        field4932 = new class365(30);
    }
}
