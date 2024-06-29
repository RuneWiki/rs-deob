import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class126 extends class223 {

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    private int field1898 = 4096;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field1889 = 0;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1893 = "flash3:";

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Lnf;")
    public static class162 field1897 = new class162(100);

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "Lub;")
    public static class92 field1899;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        int[] var3 = super.field3588.method1611(0, arg1);
        ++field1892;
        if (super.field3588.field3722) {
            int[] var4 = this.method1533(0, class75.field1168 & arg1 - 1, -95);
            int[] var5 = this.method1533(0, arg1, -127);
            int[] var6 = this.method1533(0, class75.field1168 & arg1 + 1, -71);
            for (int var7 = 0; ~var7 > ~class250.field4008; ++var7) {
                int var8 = (var5[class280.field4430 & var7 + 1] + -var5[var7 - 1 & class280.field4430]) * this.field1898;
                int var9 = var8 >> 12;
                int var10 = var9 * var9 >> 12;
                int var11 = (var6[var7] + -var4[var7]) * this.field1898;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var10 - -var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg0 < 14) {
            method942(true, (class31) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLha;)V")
    public static final void method942(boolean arg0, class31 arg1) {
        if (arg0) {
            field1897 = null;
        }
        while (true) {
            while (arg1.field560.length > arg1.field541) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method265(-108) == 1) {
                    var2 = true;
                    var4 = arg1.method265(-112);
                    var3 = arg1.method265(-100);
                }
                int var5 = arg1.method265(-128);
                int var6 = arg1.method265(-92);
                int var7 = var5 * 64 - class147.field2165;
                int var8 = -(var6 * 64) + class141.field2107 + -1 + class92.field1475;
                if (var7 >= 0 && var8 + -63 >= 0 && ~(var7 - -63) > ~class152.field2247 && ~class92.field1475 < ~var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        for (int var12 = 0; ~var12 > -65; ++var12) {
                            if (!var2 || ~(var4 * 8) >= ~var11 && var11 < var4 * 8 + 8 && ~(var3 * 8) >= ~var12 && var12 < var3 * 8 + 8) {
                                byte var13 = arg1.method266(-129);
                                if (~var13 != -1) {
                                    if (class45.field764[var10][var9] == null) {
                                        class45.field764[var10][var9] = new byte[4096];
                                    }
                                    class45.field764[var10][var9][(-var12 + 63 << 6) + var11] = var13;
                                    byte var14 = arg1.method266(-129);
                                    if (class116.field1773[var10][var9] == null) {
                                        class116.field1773[var10][var9] = new byte[4096];
                                    }
                                    class116.field1773[var10][var9][(-var12 + 63 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; (var2 ? 64 : 4096) > var15; ++var15) {
                        byte var16 = arg1.method266(-129);
                        if (~var16 != -1) {
                            ++arg1.field541;
                        }
                    }
                }
            }
            ++field1888;
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public static void method943(int arg0) {
        field1893 = null;
        field1897 = null;
        field1899 = null;
        if (arg0 != 63) {
            method942(true, (class31) null);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLub;)V")
    public static final void method944(byte arg0, class92 arg1) {
        if (arg0 < 106) {
            method945(-101, false);
        }
        ++field1891;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field1896;
        if (arg2 != 102) {
            method942(true, (class31) null);
        }
        if (arg1 == 0) {
            this.field1898 = arg0.method260((byte) -67);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)I")
    public static final int method945(int arg0, boolean arg1) {
        ++field1890;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (!arg1) {
            field1893 = null;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class126() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
    public static final void method946(byte arg0) {
        if (~class8.field127 != -3) {
            if (~class73.field1126 == ~class121.field1831 && ~class9.field156 == ~class240.field3829) {
                class8.field127 = 0;
                if (class101.field1582 && class292.field4537[81] && ~class14.field174 < -3) {
                    class48.method406(110, class14.field174 + -2);
                } else {
                    class48.method406(126, class14.field174 + -1);
                }
            } else {
                class64.field1017 = class240.field3829;
                class9.field162 = class73.field1126;
                class8.field127 = 2;
            }
        } else if (class9.field162 == class121.field1831 && class9.field156 == class64.field1017) {
            class8.field127 = 0;
            if (class101.field1582 && class292.field4537[81] && class14.field174 > 2) {
                class48.method406(120, class14.field174 + -2);
            } else {
                class48.method406(118, class14.field174 + -1);
            }
        }
        ++field1894;
        int var1 = 66 / ((-41 - arg0) / 54);
    }
}
