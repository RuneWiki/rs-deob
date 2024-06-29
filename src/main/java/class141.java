import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class141 extends class252 {

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    private int field2432 = 2048;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    private int field2433 = 0;

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "I")
    private int field2441 = 10;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "[B")
    public static byte[] field2434 = new byte[32896];

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "[I")
    public static int[] field2442;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!kj", name = "gb", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "[I")
    private int[] field2431;

    @OriginalMember(owner = "client!kj", name = "fb", descriptor = "[I")
    private int[] field2443;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V")
    private final void method923(boolean arg0) {
        if (!arg0) {
            this.field2432 = -98;
        }
        this.field2443 = new int[this.field2441 + 1];
        this.field2431 = new int[this.field2441 + 1];
        int var2 = 0;
        ++field2438;
        int var3 = 4096 / this.field2441;
        int var4 = this.field2432 * var3 >> 12;
        for (int var5 = 0; var5 < this.field2441; ++var5) {
            this.field2443[var5] = var2;
            this.field2431[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2443[this.field2441] = 4096;
        this.field2431[this.field2441] = this.field2431[0] + 4096;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)V")
    public static final void method924(int arg0, int arg1) {
        ++field2437;
        --class115.field2058;
        if (class115.field2058 != arg1) {
            class248.method1726(class124.field2198, arg1 + 1, class124.field2198, arg1, -arg1 + class115.field2058);
            class248.method1726(class184.field3161, arg1 + 1, class184.field3161, arg1, -arg1 + class115.field2058);
            if (arg0 == -11953) {
                class248.method1727(class90.field1659, arg1 + 1, class90.field1659, arg1, class115.field2058 - arg1);
                class248.method1721(class268.field4767, arg1 + 1, class268.field4767, arg1, -arg1 + class115.field2058);
                class248.method1725(class251.field4313, arg1 + 1, class251.field4313, arg1, class115.field2058 - arg1);
                class248.method1725(class193.field3292, arg1 + 1, class193.field3292, arg1, -arg1 + class115.field2058);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            field2442 = null;
        }
        ++field2435;
        int[] var3 = super.field4356.method868(arg0, (byte) -33);
        if (super.field4356.field2258) {
            int var4 = class39.field622[arg0];
            if (this.field2433 != 0) {
                for (int var5 = 0; ~var5 > ~class5.field63; ++var5) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class105.field1838[var5];
                    int var9 = this.field2433;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var7 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var7 = (var4 - (4096 - var8) >> 1) + 2048;
                        }
                    } else {
                        var7 = var8;
                    }
                    for (int var10 = 0; var10 < this.field2441; ++var10) {
                        if (this.field2443[var10] <= var7 && this.field2443[var10 + 1] > var7) {
                            if (this.field2431[var10] > var7) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field2441 < ~var12; ++var12) {
                    if (this.field2443[var12] <= var4 && this.field2443[var12 - -1] > var4) {
                        if (this.field2431[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class248.method1723(var3, 0, class5.field63, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class141() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        if (arg0 != 3906) {
            this.method923(true);
        }
        this.method923(true);
        ++field2436;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)Z")
    public static final boolean method925(int arg0, int arg1, int arg2) {
        int var3 = class76.field1415[arg0][arg1][arg2];
        if (-class134.field2343 == var3) {
            return false;
        } else if (class134.field2343 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class264.method1817(var4 + 1, class245.field4193[arg0][arg1][arg2], var5 + 1) && class264.method1817(var4 + 128 - 1, class245.field4193[arg0][arg1 + 1][arg2], var5 + 1) && class264.method1817(var4 + 128 - 1, class245.field4193[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class264.method1817(var4 + 1, class245.field4193[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class76.field1415[arg0][arg1][arg2] = class134.field2343;
                return true;
            } else {
                class76.field1415[arg0][arg1][arg2] = -class134.field2343;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg2 != -99) {
            this.field2433 = 105;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2433 = arg0.method1711((byte) -67);
                }
            } else {
                this.field2432 = arg0.method1694((byte) -100);
            }
        } else {
            this.field2441 = arg0.method1711((byte) -67);
        }
        ++field2440;
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
    public static void method926(int arg0) {
        field2442 = null;
        if (arg0 != 19228) {
            method924(44, 114);
        }
        field2434 = null;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public static final void method927(byte arg0) {
        if (arg0 != 77) {
            method926(-59);
        }
        ++field2444;
        class252.field4360.method1270((byte) 107);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIBZLge;)V")
    public static final void method928(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, class68 arg6) {
        class1.field7 = arg2;
        class269.field4788 = arg6;
        class230.field3983 = 1;
        class146.field2489 = arg5;
        class61.field1087 = arg3;
        class40.field635 = arg1;
        if (arg4 != -22) {
            field2434 = null;
        }
        ++field2439;
        class3.field36 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var5 = 0; ~var1 <= ~var5; ++var5) {
                field2434[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var5 * var5 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field2442 = new int[256];
        for (int var2 = 0; ~var2 > -257; ++var2) {
            int var3 = var2;
            for (int var4 = 0; ~var4 > -9; ++var4) {
                if ((1 & var3) == 1) {
                    var3 = -306674912 ^ var3 >>> 1;
                } else {
                    var3 >>>= 1;
                }
            }
            field2442[var2] = var3;
        }
    }
}
