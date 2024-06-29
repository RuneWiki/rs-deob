import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class98 extends class115 {

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    private int field1545 = 10;

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "I")
    private int field1553 = 2048;

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "I")
    private int field1554 = 0;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "Lqe;")
    public static class168 field1537 = class66.method448("<br>", -114);

    @OriginalMember(owner = "client!se", name = "V", descriptor = "[Lqe;")
    public static class168[] field1538 = new class168[100];

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "Z")
    public static boolean field1551 = true;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "Lmj;")
    public static class129 field1550;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "[I")
    private int[] field1541;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "[I")
    private int[] field1547;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
    public static final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1543;
        if (arg1 == 0) {
            if (class174.field3055 <= arg2 && arg5 <= class249.field4314 && ~class222.field3811 >= ~arg0 && class196.field3402 >= arg3) {
                class26.method178(true, arg2, arg4, arg0, arg5, arg3);
            } else {
                class16.method83(arg3, arg1, arg5, arg2, arg0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)[B")
    public static final byte[] method641(int arg0, int arg1) {
        int var2 = -57 % ((arg0 - 57) / 56);
        ++field1536;
        class149 var3 = (class149) class209.field3625.method1499(0, (long) arg1);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; ~var6 > -256; ++var6) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; ++var7) {
                int var8 = -var7 + 255;
                int var9 = class163.method1056(var5, var8, 116);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[-var7 + 511] = var10;
            }
            var3 = new class149(var4);
            class209.field3625.method1502((byte) -18, var3, (long) arg1);
        }
        return var3.field2588;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    private final void method642(byte arg0) {
        this.field1541 = new int[this.field1545 + 1];
        this.field1547 = new int[this.field1545 + 1];
        int var2 = 0;
        ++field1555;
        int var3 = 4096 / this.field1545;
        int var4 = this.field1553 * var3 >> 12;
        int var5 = 28 % ((76 - arg0) / 46);
        for (int var6 = 0; ~var6 > ~this.field1545; ++var6) {
            this.field1541[var6] = var2;
            this.field1547[var6] = var2 + var4;
            var2 += var3;
        }
        this.field1541[this.field1545] = 4096;
        this.field1547[this.field1545] = this.field1547[0] + 4096;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method643(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1546;
        if (class97.method636(arg4, -125)) {
            class247.field4275 = null;
            class69.method466(arg2, class108.field1741[arg4], arg1, arg8, arg3, arg0, arg5, arg7, -1, arg6);
            if (class247.field4275 != null) {
                class69.method466(false, class247.field4275, arg1, arg8, arg3, class97.field1524, arg5, class241.field4126, -1412584499, arg6);
                class247.field4275 = null;
            }
        } else if (arg8 != -1) {
            class194.field3372[arg8] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class194.field3372[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
    public static final int method644(byte arg0, int arg1) {
        ++field1535;
        int var7 = arg1 - 1;
        if (arg0 <= 18) {
            method645((class256) null, true);
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field1540;
        if (arg0 != 107) {
            this.field1541 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1554 = arg1.method758(true);
                }
            } else {
                this.field1553 = arg1.method731(false);
            }
        } else {
            this.field1545 = arg1.method758(true);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Loe;Z)V")
    public static final void method645(class256 arg0, boolean arg1) {
        ++field1534;
        if (!arg1) {
            method644((byte) 50, 120);
        }
        class96.field1518 = arg0.method1705(class47.field629, -1);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        this.method642((byte) 123);
        if (arg0 == 395462996) {
            ++field1552;
        }
    }

    @OriginalMember(owner = "client!se", name = "i", descriptor = "(I)V")
    public static final void method646(int arg0) {
        ++field1539;
        if (arg0 != 0) {
            method648(123);
        }
        if (class165.field2816 != null) {
            class234 var1 = class165.field2816;
            synchronized (class165.field2816) {
                class165.field2816 = null;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field1548;
        if (arg1 < 37) {
            method647(60, -68, 39, -56, (byte) -24, 14, -6);
        }
        int[] var3 = super.field1872.method182((byte) -119, arg0);
        if (super.field1872.field341) {
            int var4 = class170.field2963[arg0];
            if (~this.field1554 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~this.field1545 < ~var6; ++var6) {
                    if (var4 >= this.field1541[var6] && ~var4 > ~this.field1541[var6 + 1]) {
                        if (this.field1547[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class22.method115(var3, 0, class130.field2297, var5);
            } else {
                for (int var7 = 0; class130.field2297 > var7; ++var7) {
                    int var8 = 0;
                    int var9 = class193.field3367[var7];
                    short var10 = 0;
                    int var11 = this.field1554;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = 2048 - -(-var4 + var9 >> 1);
                            }
                        } else {
                            var8 = (var9 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var8 = var9;
                    }
                    for (int var12 = 0; this.field1545 > var12; ++var12) {
                        if (this.field1541[var12] <= var8 && ~this.field1541[var12 + 1] < ~var8) {
                            if (this.field1547[var12] > var8) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var10;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIBII)V")
    public static final void method647(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 <= 114) {
            field1551 = false;
        }
        ++field1544;
        if (-arg6 + arg0 >= class174.field3055 && class249.field4314 >= arg0 + arg6 && ~class222.field3811 >= ~(arg3 - arg6) && ~(arg3 + arg6) >= ~class196.field3402) {
            class245.method1606(arg1, arg2, arg6, (byte) 74, arg0, arg3, arg5);
        } else {
            class54.method382(arg3, arg0, (byte) 60, arg2, arg6, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!se", name = "j", descriptor = "(I)V")
    public static void method648(int arg0) {
        field1538 = null;
        if (arg0 < 16) {
            field1538 = null;
        }
        field1550 = null;
        field1537 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILoe;B)[Lfe;")
    public static final class15[] method649(int arg0, int arg1, class256 arg2, byte arg3) {
        ++field1549;
        if (!class9.method34(arg0, arg2, (byte) -16, arg1)) {
            return null;
        } else {
            if (arg3 > -93) {
                method640(-94, 83, 67, -87, -55, 22);
            }
            return class133.method899((byte) 8);
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }
}
