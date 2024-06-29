import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class293 extends class468 {

    @OriginalMember(owner = "client!dr", name = "Bb", descriptor = "I")
    public static int field4385 = 0;

    @OriginalMember(owner = "client!dr", name = "Hb", descriptor = "S")
    public static short field4391 = 1;

    @OriginalMember(owner = "client!dr", name = "zb", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!dr", name = "Ab", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!dr", name = "Db", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!dr", name = "Eb", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!dr", name = "Fb", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!dr", name = "Gb", descriptor = "I")
    private int field4390;

    @OriginalMember(owner = "client!dr", name = "Ib", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!dr", name = "Kb", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!dr", name = "Lb", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!dr", name = "Mb", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!dr", name = "Nb", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!dr", name = "Ob", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!dr", name = "Qb", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!dr", name = "Cb", descriptor = "Lsv;")
    public static class320 field4386;

    @OriginalMember(owner = "client!dr", name = "Jb", descriptor = "Lfi;")
    private class38 field4393;

    @OriginalMember(owner = "client!dr", name = "Pb", descriptor = "[Lju;")
    public static class170[] field4399;

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(I)V", line = 8)
    public class293(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(Z)I", line = 12)
    public final int method1815(boolean arg0) {
        if (arg0) {
            return -83;
        } else {
            ++field4392;
            int var2 = super.field6868[super.field6830++] - this.field4393.method312((byte) 113) & 255;
            return var2 < 128 ? var2 : (super.field6868[super.field6830++] + -this.field4393.method312((byte) 65) & 255) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(II)I", line = 33)
    public final int method1816(int arg0, int arg1) {
        int var3 = -108 / ((6 - arg0) / 62);
        ++field4400;
        return arg1 * 8 + -this.field4390;
    }

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(BI)V", line = 51)
    public static final void method1817(byte arg0, int arg1) {
        ++field4387;
        class506 var2 = class14.method185(-1304589728, arg1, 5);
        var2.method2986(-119);
        if (arg0 >= -89) {
            field4385 = -11;
        }
    }

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "(I)V", line = 66)
    public final void method1818(int arg0) {
        ++field4388;
        super.field6830 = (this.field4390 + 7) / 8;
        int var2 = 99 % ((arg0 - -3) / 63);
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(ZI)V", line = 79)
    public final void method1819(boolean arg0, int arg1) {
        super.field6868[super.field6830++] = (byte) (arg1 + this.field4393.method312((byte) 44));
        ++field4384;
        if (arg0) {
            this.method1818(-23);
        }
    }

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "(Z)Z", line = 92)
    public final boolean method1820(boolean arg0) {
        if (!arg0) {
            field4391 = 68;
        }
        ++field4396;
        int var2 = super.field6868[super.field6830] - this.field4393.method319(89) & 255;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "(B)V", line = 110)
    public static void method1821(byte arg0) {
        field4399 = null;
        if (arg0 != 107) {
            field4391 = -97;
        }
        field4386 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([BIIZ)V", line = 123)
    public final void method1822(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.method1823(-89, -28);
        }
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field6868[super.field6830++] + -this.field4393.method312((byte) 69));
        }
        ++field4398;
    }

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "(II)I", line = 151)
    public final int method1823(int arg0, int arg1) {
        if (arg1 != 13255) {
            this.method1819(false, -94);
        }
        ++field4395;
        int var3 = this.field4390 >> 3;
        int var4 = -(7 & this.field4390) + 8;
        int var5 = 0;
        this.field4390 += arg0;
        while (~arg0 < ~var4) {
            var5 += (super.field6868[var3++] & class374.field5647[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field6868[var3] & class374.field5647[var4]) + var5;
        } else {
            var6 = (super.field6868[var3] >> var4 - arg0 & class374.field5647[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "(I)V", line = 183)
    public static final void method1824(int arg0) {
        if (arg0 > -56) {
            method1817((byte) 123, 25);
        }
        ++field4394;
        if (class407.field6147 != null) {
            class268.field3989.method3085((byte) 48);
            class517.method3064();
            class464.method2684(-1);
            class31.method276(true);
            class286.method1772(100);
            class56.method411((byte) -81);
            if (class89.field1394 != null) {
                class89.field1394.method2378(43);
            }
            class65.method461((byte) 88);
            class147.method1068((byte) -124);
            class128.method944(-1342173185);
            class151.method1090(false, (byte) 91);
            class326.method2029(false);
            for (int var1 = 0; var1 < 2048; ++var1) {
                class480 var5 = class83.field1327[var1];
                if (var5 != null) {
                    var5.field6058 = null;
                    for (int var6 = 0; var6 < var5.field6063.length; ++var6) {
                        var5.field6063[var6] = null;
                    }
                }
            }
            for (int var2 = 0; class88.field1375.length > var2; ++var2) {
                class351 var3 = class88.field1375[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field6063.length; ++var4) {
                        var3.field6063[var4] = null;
                    }
                }
            }
            class398.field5943 = null;
            class151.field2293 = null;
            class407.field6147.method111(1);
            class407.field6147 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B[I)V", line = 260)
    public final void method1825(byte arg0, int[] arg1) {
        ++field4397;
        this.field4393 = new class38(arg1);
        if (arg0 != 19) {
            this.method1823(104, 6);
        }
    }

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "(I)V", line = 271)
    public final void method1826(int arg0) {
        ++field4389;
        if (arg0 != 30273) {
            field4391 = 111;
        }
        this.field4390 = super.field6830 * 8;
    }
}
