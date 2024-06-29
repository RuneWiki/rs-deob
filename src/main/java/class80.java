import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class80 extends class82 {

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    private int field1552 = 0;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    private int field1543 = 0;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    private int field1558 = 0;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "Ldj;")
    public static class44 field1541 = class89.method650(255, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "Ldj;")
    public static class44 field1548 = class89.method650(255, "document)3cookie=(R");

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Ldj;")
    public static class44 field1549 = class89.method650(255, "k");

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Ldj;")
    public static class44 field1561 = class89.method650(255, "cookiehost");

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Lod;")
    public static class155 field1545;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "[I")
    public static int[] field1554;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
    private final void method609(int arg0, int arg1, int arg2, int arg3) {
        ++field1551;
        if (arg3 != 27726) {
            this.method610(-126, true, 3, -18);
        }
        int var5 = ~arg2 >= -2049 ? (4096 - -arg1) * arg2 >> 12 : arg1 - (arg1 * arg2 >> 12) + arg2;
        if (var5 <= 0) {
            this.field1544 = this.field1556 = this.field1559 = arg2;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg2 - (-arg2 - -var5);
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var7 - -var13;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field1556 = var7;
                                    this.field1544 = var5;
                                    this.field1559 = var14;
                                }
                            } else {
                                this.field1556 = var7;
                                this.field1559 = var5;
                                this.field1544 = var15;
                            }
                        } else {
                            this.field1544 = var7;
                            this.field1556 = var14;
                            this.field1559 = var5;
                        }
                    } else {
                        this.field1559 = var15;
                        this.field1544 = var7;
                        this.field1556 = var5;
                    }
                } else {
                    this.field1544 = var14;
                    this.field1559 = var7;
                    this.field1556 = var5;
                }
            } else {
                this.field1544 = var5;
                this.field1556 = var15;
                this.field1559 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII)V")
    private final void method610(int arg0, boolean arg1, int arg2, int arg3) {
        ++field1550;
        int var5 = arg3 < arg2 ? arg3 : arg2;
        int var6 = arg2 < arg3 ? arg3 : arg2;
        int var7 = var6 >= arg0 ? var6 : arg0;
        if (!arg1) {
            this.method2((class66) null, 29, (byte) -97);
        }
        int var8 = ~var5 >= ~arg0 ? var5 : arg0;
        int var9 = -var8 + var7;
        this.field1553 = (var8 - -var7) / 2;
        if (this.field1553 > 0 && this.field1553 < 4096) {
            this.field1546 = (var9 << 12) / (~this.field1553 < -2049 ? 8192 - this.field1553 * 2 : this.field1553 * 2);
        } else {
            this.field1546 = 0;
        }
        if (~var9 >= -1) {
            this.field1557 = 0;
        } else {
            int var10 = (-arg2 + var7 << 12) / var9;
            int var11 = (-arg3 + var7 << 12) / var9;
            int var12 = (-arg0 + var7 << 12) / var9;
            if (~arg3 != ~var7) {
                if (arg2 != var7) {
                    this.field1557 = arg3 != var8 ? -var11 + 20480 : var10 + 12288;
                } else {
                    this.field1557 = arg0 == var8 ? 4096 - -var11 : -var12 + 12288;
                }
            } else {
                this.field1557 = ~arg2 == ~var8 ? var12 + 20480 : -var10 + 4096;
            }
            this.field1557 /= 6;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class80() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        if (arg0 >= -59) {
            this.method2((class66) null, -30, (byte) 104);
        }
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[][] var4 = this.method619(arg1, true, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class129.field2287 < ~var11; ++var11) {
                this.method610(var6[var11], true, var5[var11], var7[var11]);
                this.field1546 += this.field1543;
                if (this.field1546 < 0) {
                    this.field1546 = 0;
                }
                this.field1553 += this.field1558;
                this.field1557 += this.field1552;
                if (this.field1553 < 0) {
                    this.field1553 = 0;
                }
                while (this.field1557 < 0) {
                    this.field1557 += 4096;
                }
                while (~this.field1557 < -4097) {
                    this.field1557 -= 4096;
                }
                if (~this.field1546 < -4097) {
                    this.field1546 = 4096;
                }
                if (this.field1553 > 4096) {
                    this.field1553 = 4096;
                }
                this.method609(this.field1557, this.field1546, this.field1553, 27726);
                var8[var11] = this.field1544;
                var9[var11] = this.field1556;
                var10[var11] = this.field1559;
            }
        }
        ++field1547;
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field1555;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1558 = (arg0.method505(false) << 12) / 100;
                }
            } else {
                this.field1543 = (arg0.method505(false) << 12) / 100;
            }
        } else {
            this.field1552 = arg0.method514((byte) -54);
        }
        if (arg2 != 68) {
            this.method6(-78, -28);
        }
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
    public static void method611(int arg0) {
        if (arg0 == 4096) {
            field1561 = null;
            field1541 = null;
            field1548 = null;
            field1545 = null;
            field1554 = null;
            field1549 = null;
        }
    }
}
