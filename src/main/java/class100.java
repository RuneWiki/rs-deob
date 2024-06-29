import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public abstract class class100 extends class404 {

    @OriginalMember(owner = "client!qfa", name = "B", descriptor = "S")
    public short field1800;

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1803 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!qfa", name = "D", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!qfa", name = "G", descriptor = "Lcba;")
    public static class550 field1805;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "([Lab;I)I", line = 4)
    public final int method935(class669[] arg0, int arg1) {
        ++field1799;
        int var3 = super.field5922 >> class130.field2185;
        int var4 = super.field5933 >> class130.field2185;
        int var5 = -103 / ((arg1 - -14) / 61);
        int var6 = 0;
        if (~class134.field2256 == ~var3) {
            ++var6;
        } else if (~var3 < ~class134.field2256) {
            var6 += 2;
        }
        if (class492.field6813 == var4) {
            var6 += 3;
        } else if (var4 < class492.field6813) {
            var6 += 6;
        }
        int var7 = class441.field6277[var6];
        if ((this.field1800 & var7) != 0) {
            return this.method2523(arg0, var3, -2, var4);
        } else if (this.field1800 == 1 && ~var3 < -1) {
            return this.method2523(arg0, var3 + -1, -2, var4);
        } else if (this.field1800 == 4 && var3 <= class434.field6208) {
            return this.method2523(arg0, var3 + 1, -2, var4);
        } else if (~this.field1800 == -9 && var4 > 0) {
            return this.method2523(arg0, var3, -2, var4 + -1);
        } else if (~this.field1800 == -3 && ~class432.field6185 <= ~var4) {
            return this.method2523(arg0, var3, -2, var4 + 1);
        } else if (this.field1800 == 16 && ~var3 < -1 && var4 <= class432.field6185) {
            return this.method2523(arg0, var3 + -1, -2, var4 + 1);
        } else if (~this.field1800 == -33 && class434.field6208 >= var3 && class432.field6185 >= var4) {
            return this.method2523(arg0, var3 + 1, -2, var4 + 1);
        } else if (this.field1800 == 128 && var3 > 0 && var4 > 0) {
            return this.method2523(arg0, var3 - 1, -2, var4 - 1);
        } else if (this.field1800 == 64 && ~class434.field6208 <= ~var3 && ~var4 < -1) {
            return this.method2523(arg0, var3 + 1, -2, var4 + -1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "(I)I", line = 85)
    public static final int method936(int arg0) {
        if (arg0 != 1000) {
            return -103;
        } else {
            ++field1804;
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (class689.field9299.field2525 && !class689.field9299.field2542) {
                var1 = true;
                if (class270.field3807.field3419 < 512 && class270.field3807.field3419 != 0) {
                    var1 = false;
                }
                if (!class158.field2551.startsWith("win")) {
                    var2 = true;
                } else {
                    var3 = true;
                    var2 = true;
                }
            }
            if (class95.field1662) {
                var1 = false;
            }
            if (class413.field5994) {
                var2 = false;
            }
            if (class669.field9129) {
                var3 = false;
            }
            if (!var1 && !var2 && !var3) {
                return class32.method432(-8454);
            } else {
                int var4 = -1;
                int var5 = -1;
                int var6 = -1;
                if (var1) {
                    try {
                        var4 = class394.method2476(2, -126, 1000);
                    } catch (Exception var15) {
                    }
                }
                if (var3) {
                    try {
                        var6 = class394.method2476(3, -70, 1000);
                        if (~class693.field9368.field4468.method1099(arg0 + -33350) == -4) {
                            class575 var7 = class272.field3822.method298();
                            long var8 = 281474976710655L & var7.field7890;
                            int var10 = var7.field7895;
                            if (var10 != 4318) {
                                if (var10 == 4098) {
                                    var2 &= ~var8 <= -60129613780L;
                                }
                            } else {
                                var2 &= ~var8 <= -64425238955L;
                            }
                        }
                    } catch (Exception var14) {
                    }
                }
                if (var2) {
                    try {
                        var5 = class394.method2476(1, arg0 ^ -940, 1000);
                    } catch (Exception var13) {
                    }
                }
                if (~var4 == 0 && var5 == -1 && var6 == -1) {
                    return class32.method432(arg0 + -9454);
                } else {
                    int var11 = (int) ((float) var6 * 1.1F);
                    int var12 = (int) ((float) var5 * 1.1F);
                    if (~var11 > ~var4 && var12 < var4) {
                        return class647.method3673(var4, (byte) -116);
                    } else {
                        return var11 <= var12 ? class554.method3191((byte) -59, 1, var12) : class554.method3191((byte) -80, 3, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)Z", line = 256)
    public final boolean method937(byte arg0) {
        if (arg0 >= -51) {
            return false;
        } else {
            ++field1801;
            return class508.method2984(super.field5933 >> class130.field2185, super.field5922 >> class130.field2185, super.field5921, this, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "(I)V", line = 268)
    public static void method938(int arg0) {
        if (arg0 == 19424) {
            field1803 = null;
            field1805 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IIIIII)V", line = 281)
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5922 = arg0;
        super.field5927 = arg1;
        super.field5921 = (byte) arg4;
        super.field5933 = arg2;
        super.field5926 = (byte) arg3;
        this.field1800 = (short) arg5;
    }

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "(I)Z", line = 298)
    public final boolean method939(int arg0) {
        ++field1798;
        if (arg0 != 0) {
            this.method939(-104);
        }
        return class196.field2890[(super.field5922 >> class130.field2185) + -class134.field2256 + class708.field9611][(super.field5933 >> class130.field2185) + -class492.field6813 + class708.field9611];
    }

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "(I)V", line = 309)
    public static final void method940(int arg0) {
        if (arg0 == -1) {
            ++field1802;
            class113.field1947 = new class168();
        }
    }
}
