import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class276 extends class366 {

    @OriginalMember(owner = "client!so", name = "F", descriptor = "[I")
    public static int[] field3978 = new int[25];

    @OriginalMember(owner = "client!so", name = "B", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!so", name = "C", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!so", name = "D", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!so", name = "E", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!so", name = "G", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!so", name = "H", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!so", name = "J", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!so", name = "K", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "I")
    public int field3984;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!so", name = "N", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!so", name = "P", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "Ljava/lang/String;")
    public String field3981;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(B)I", line = 6)
    public final int method1869(byte arg0) {
        ++field3988;
        return arg0 < 80 ? 1 : (int) super.field6070;
    }

    @OriginalMember(owner = "client!so", name = "e", descriptor = "(B)V", line = 18)
    public final void method1870(byte arg0) {
        ++field3980;
        super.field5232 = 500L + class18.method107(arg0 + -16271) | Long.MIN_VALUE & super.field5232;
        if (arg0 != 126) {
            this.method1878((byte) -64);
        }
        class196.field2816.method1055(this, -100);
    }

    @OriginalMember(owner = "client!so", name = "f", descriptor = "(B)V", line = 30)
    public static void method1871(byte arg0) {
        if (arg0 != 112) {
            method1877(-18);
        }
        field3978 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;)I", line = 50)
    public static final int method1872(byte arg0, String arg1) {
        ++field3977;
        if (arg0 != 12) {
            method1871((byte) 62);
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            var3 = arg1.charAt(var4) + -var3 + (var3 << 5);
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 72)
    public static final int method1873(boolean arg0, String arg1) {
        if (!arg0) {
            return -68;
        } else {
            ++field3982;
            return arg1.length() - -1;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIZ)Z", line = 83)
    public static final boolean method1874(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return true;
        } else {
            ++field3976;
            if (!class359.field5185) {
                return false;
            } else {
                int var3 = arg1 >> 16;
                int var4 = arg1 & 65535;
                if (class186.field2657[var3] != null && class186.field2657[var3][var4] != null) {
                    class223 var5 = class186.field2657[var3][var4];
                    if (~arg0 == 0 && ~var5.field3208 == -1) {
                        for (class382 var6 = (class382) class228.field3392.method2752(-119); var6 != null; var6 = (class382) class228.field3392.method2754(-1)) {
                            if (~var6.field5420 == -24 || ~var6.field5420 == -1009 || var6.field5420 == 18 || ~var6.field5420 == -45 || var6.field5420 == 11) {
                                for (class223 var7 = class438.method2732(var6.field5424, 0); var7 != null; var7 = class186.method1335(0, var7)) {
                                    if (var5.field3227 == var7.field3227) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        for (class382 var8 = (class382) class228.field3392.method2752(-91); var8 != null; var8 = (class382) class228.field3392.method2754(-1)) {
                            if (~var8.field5429 == ~arg0 && var5.field3227 == var8.field5424 && (var8.field5420 == 23 || ~var8.field5420 == -1009 || var8.field5420 == 18 || ~var8.field5420 == -45 || var8.field5420 == 11)) {
                                return true;
                            }
                        }
                    }
                    return false;
                } else {
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)J", line = 153)
    public final long method1875(int arg0) {
        if (arg0 < 26) {
            this.method1870((byte) -90);
        }
        ++field3983;
        return Long.MAX_VALUE & super.field5232;
    }

    @OriginalMember(owner = "client!so", name = "g", descriptor = "(B)V", line = 167)
    public final void method1876(byte arg0) {
        ++field3974;
        super.field5232 |= Long.MIN_VALUE;
        if (arg0 > -113) {
            this.field3985 = 19;
        }
        if (this.method1875(94) == 0L) {
            class233.field3444.method1055(this, 74);
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V", line = 182)
    public static final void method1877(int arg0) {
        ++field3979;
        if (!class366.field5240) {
            if (arg0 != -27715) {
                field3978 = null;
            }
            if (class24.field304) {
                class358.field5176 = (float) (-128 & (int) class358.field5176 - -191);
            } else {
                class353.field5128 += (-class353.field5128 + 24.0F) / 2.0F;
            }
            class56.field744 = true;
            class366.field5240 = true;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(II)V", line = 208)
    public class276(int arg0, int arg1) {
        super.field6070 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!so", name = "h", descriptor = "(B)I", line = 218)
    public final int method1878(byte arg0) {
        int var2 = 103 % ((-28 - arg0) / 46);
        ++field3987;
        return (int) (super.field6070 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!so", name = "i", descriptor = "(B)V", line = 229)
    public static final void method1879(byte arg0) {
        ++field3975;
        if (arg0 <= 13) {
            method1874(34, 42, false);
        }
        class332.field4831 = null;
        class134.field2063 = -1;
    }
}
