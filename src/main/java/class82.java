import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 extends class124 {

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field1374 = 204;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field1375 = 1;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    private int field1384 = 1;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Le;")
    public static class191 field1377 = class54.method368(":clanreq:", 2047);

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Lwe;")
    public static class147 field1381 = new class147(50);

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "[Lai;")
    public static class220[] field1383 = new class220[4];

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "[I")
    public static int[] field1386 = new int[2];

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lng;")
    public static class121 field1385;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (arg2) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field1374 = arg1.method1593(true);
                    }
                } else {
                    this.field1375 = arg1.method1580(-111);
                }
            } else {
                this.field1384 = arg1.method1580(-32);
            }
            ++field1376;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBIII)V")
    public static final void method518(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field1378;
        if (arg5 <= class99.field1584 && ~arg3 <= ~class242.field4314) {
            boolean var6;
            if (~arg0 > ~class37.field678) {
                var6 = false;
                arg0 = class37.field678;
            } else if (~arg0 >= ~class207.field3680) {
                var6 = true;
            } else {
                var6 = false;
                arg0 = class207.field3680;
            }
            boolean var7;
            if (~arg4 <= ~class37.field678) {
                if (arg4 > class207.field3680) {
                    var7 = false;
                    arg4 = class207.field3680;
                } else {
                    var7 = true;
                }
            } else {
                arg4 = class37.field678;
                var7 = false;
            }
            if (arg5 >= class242.field4314) {
                class242.method1700(7, arg1, arg4, class232.field4151[arg5++], arg0);
            } else {
                arg5 = class242.field4314;
            }
            if (~arg3 < ~class99.field1584) {
                arg3 = class99.field1584;
            } else {
                class242.method1700(7, arg1, arg4, class232.field4151[arg3--], arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg3; ++var8) {
                    int[] var9 = class232.field4151[var8];
                    var9[arg0] = var9[arg4] = arg1;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg5; var10 <= arg3; ++var10) {
                        class232.field4151[var10][arg4] = arg1;
                    }
                }
            } else {
                for (int var11 = arg5; var11 <= arg3; ++var11) {
                    class232.field4151[var11][arg0] = arg1;
                }
            }
        }
        int var12 = -35 / ((-41 - arg2) / 56);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field1379;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (arg0 < 68) {
            this.field1374 = -123;
        }
        if (super.field2064.field1035) {
            for (int var4 = 0; ~var4 > ~class64.field1132; ++var4) {
                int var5 = class257.field4559[var4];
                int var6 = class236.field4202[arg1];
                int var7 = this.field1375 * var6 >> 12;
                int var8 = this.field1384 * var5 >> 12;
                int var9 = var5 % (4096 / this.field1384) * this.field1384;
                int var10 = var6 % (4096 / this.field1375) * this.field1375;
                if (var10 < this.field1374) {
                    for (var8 -= var7; ~var8 > -1; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field1374) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field1374) {
                    int var11;
                    for (var11 = var8 - var7; ~var11 > -1; var11 += 4) {
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

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V")
    public static void method519(int arg0) {
        if (arg0 == -9230) {
            field1383 = null;
            field1385 = null;
            field1386 = null;
            field1381 = null;
            field1377 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)V")
    public static final void method520(int arg0) {
        class253.field4486 = 0;
        ++field1382;
        class172.field2889 = 0;
        class18.field235 = -1;
        class218.field3840 = -1;
        class258.field4575 = false;
        class211.field3753 = 0;
        class205.field3635 = -1;
        class167.field2824 = 0;
        if (arg0 > 116) {
            class269.field4747 = -1;
            class53.field963.field3996 = 0;
            class146.field2459 = 0;
            class107.field1776.field3996 = 0;
            class267.field4726 = 0;
            for (int var1 = 0; ~var1 > ~class245.field4357.length; ++var1) {
                if (class245.field4357[var1] != null) {
                    class245.field4357[var1].field2988 = -1;
                }
            }
            for (int var2 = 0; ~var2 > ~class115.field1901.length; ++var2) {
                if (class115.field1901[var2] != null) {
                    class115.field1901[var2].field2988 = -1;
                }
            }
            class43.method280(-1357453968);
            class243.field4345 = 1;
            class188.method1293(30, -30211);
            for (int var3 = 0; ~var3 > -101; ++var3) {
                class189.field3324[var3] = true;
            }
            class141.method927((byte) -59);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILng;)Lli;")
    public static final class155 method521(int arg0, int arg1, class121 arg2) {
        ++field1380;
        if (arg0 <= 119) {
            field1385 = null;
        }
        return !class179.method1202(16748257, arg2, arg1) ? null : class258.method1781(8639);
    }
}
