import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class128 extends class502 {

    @OriginalMember(owner = "client!op", name = "S", descriptor = "Z")
    public boolean field1869 = false;

    @OriginalMember(owner = "client!op", name = "ab", descriptor = "Z")
    public boolean field1877 = false;

    @OriginalMember(owner = "client!op", name = "U", descriptor = "Lhn;")
    public static class509 field1871 = new class509(75, -1);

    @OriginalMember(owner = "client!op", name = "bb", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!op", name = "R", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!op", name = "T", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!op", name = "V", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!op", name = "W", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!op", name = "X", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!op", name = "Y", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!op", name = "Z", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!op", name = "cb", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!op", name = "db", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Lhp;")
    public final class217 method932(int arg0) {
        ++field1866;
        class217 var2 = new class217(41);
        var2.method1545(17, arg0 ^ 1725);
        var2.method1545(super.field7253, -113);
        var2.method1545(super.field7238 ? 1 : 0, -47);
        var2.method1545(super.field7242 ? 1 : 0, -112);
        var2.method1545(super.field7224 ? 1 : 0, -39);
        var2.method1545(!super.field7216 ? 0 : 1, -125);
        var2.method1545(0, arg0 ^ 1668);
        var2.method1545(!super.field7215 ? 0 : 1, -59);
        var2.method1545(!super.field7220 ? 0 : 1, arg0 + 1747);
        var2.method1545(!super.field7241 ? 0 : 1, arg0 + 1744);
        var2.method1545(super.field7247, -85);
        var2.method1545(super.field7254, -38);
        var2.method1545(super.field7221 ? 1 : 0, -87);
        var2.method1545(!super.field7240 ? 0 : 1, -108);
        var2.method1545(super.field7245 ? 1 : 0, arg0 ^ 1701);
        var2.method1545(super.field7237 ? 1 : 0, -117);
        var2.method1545(super.field7217, -66);
        var2.method1545(super.field7246 ? 1 : 0, -105);
        var2.method1545(super.field7251, -90);
        var2.method1545(super.field7249, -54);
        var2.method1545(super.field7218, -95);
        if (arg0 != -1784) {
            this.method943(true, true);
        }
        var2.method1542(super.field7223, -2756);
        var2.method1542(super.field7231, -2756);
        var2.method1545(class384.method2399((byte) -101), -71);
        var2.method1566(true, super.field7234);
        var2.method1545(super.field7214, -31);
        var2.method1545(!super.field7252 ? 0 : 1, -118);
        var2.method1545(super.field7239 ? 1 : 0, arg0 + 1661);
        var2.method1545(super.field7235, -106);
        var2.method1545(super.field7228 ? 1 : 0, -97);
        var2.method1545(super.field7250 ? 1 : 0, arg0 + 1670);
        var2.method1545(super.field7219, -107);
        var2.method1545(!super.field7227 ? 0 : 1, -84);
        var2.method1545(super.field7230, arg0 ^ 1683);
        var2.method1545(super.field7243, -35);
        var2.method1545(!super.field7226 ? 0 : 1, -114);
        return var2;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLod;)V")
    public final void method933(byte arg0, class352 arg1) {
        ++field1867;
        class51 var3 = null;
        try {
            class449 var4 = arg1.method2194("", true, 0);
            if (arg0 != 78) {
                return;
            }
            while (var4.field6570 == 0) {
                class434.method2690(10, 1L);
            }
            if (~var4.field6570 == -2) {
                var3 = (class51) var4.field6569;
                class217 var5 = this.method932(arg0 + -1862);
                var3.method494(var5.field3556, -127, var5.field3572, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method496(-32307);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)V")
    public static final void method934(byte arg0, int arg1) {
        class431 var2 = class459.field6685.method2592(114);
        if (arg0 < -68) {
            while (var2 != null) {
                if ((long) arg1 == (var2.field6388 >> 48 & 65535L)) {
                    var2.method2677(-22491);
                }
                var2 = class459.field6685.method2589(-1);
            }
            ++field1868;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(II)I")
    public final int method935(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field1877 = false;
        }
        ++field1872;
        if (this.field1869) {
            return 0;
        } else if (!this.method938(arg0, -37)) {
            return 1;
        } else {
            return super.field7242 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public static final void method936(int arg0) {
        ++field1870;
        if (arg0 == 1) {
            class237.field3805.method93((byte) 106);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLhp;)V")
    private final void method937(byte arg0, class217 arg1) {
        ++field1875;
        if (arg0 != -101) {
            this.method937((byte) -88, (class217) null);
        }
        if (arg1.field3572.length + -arg1.field3556 >= 1) {
            int var3 = arg1.method1515((byte) 123);
            if (var3 >= 0 && var3 <= 17) {
                byte var4;
                if (var3 == 17) {
                    var4 = 40;
                } else if (~var3 != -17) {
                    if (var3 != 15) {
                        if (~var3 != -15) {
                            if (var3 != 13) {
                                if (var3 == 12) {
                                    var4 = 34;
                                } else if (~var3 == -12) {
                                    var4 = 33;
                                } else if (var3 != 10) {
                                    if (var3 == 9) {
                                        var4 = 31;
                                    } else if (~var3 != -9) {
                                        if (~var3 != -8) {
                                            if (var3 != 6) {
                                                if (~var3 != -6) {
                                                    if (var3 == 4) {
                                                        var4 = 24;
                                                    } else if (var3 == 3) {
                                                        var4 = 23;
                                                    } else if (~var3 == -3) {
                                                        var4 = 22;
                                                    } else if (~var3 == -2) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 29;
                                        }
                                    } else {
                                        var4 = 30;
                                    }
                                } else {
                                    var4 = 32;
                                }
                            } else {
                                var4 = 35;
                            }
                        } else {
                            var4 = 36;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 38;
                }
                if (arg1.field3572.length + -arg1.field3556 >= var4) {
                    super.field7253 = arg1.method1515((byte) 126);
                    if (super.field7253 < 1) {
                        super.field7253 = 1;
                    } else if (super.field7253 > 4) {
                        super.field7253 = 4;
                    }
                    this.method943(arg1.method1515((byte) 125) == 1, false);
                    super.field7242 = ~arg1.method1515((byte) 122) == -2;
                    super.field7224 = arg1.method1515((byte) 121) == 1;
                    super.field7216 = ~arg1.method1515((byte) 127) == -2;
                    super.field7219 = arg1.method1515((byte) 127) != 1 ? 0 : 1;
                    super.field7215 = arg1.method1515((byte) 125) == 1;
                    super.field7220 = ~arg1.method1515((byte) 122) == -2;
                    super.field7241 = arg1.method1515((byte) 125) == 1;
                    super.field7247 = arg1.method1515((byte) 122);
                    if (~super.field7247 < -3) {
                        super.field7247 = 2;
                    }
                    if (var3 >= 17) {
                        super.field7254 = arg1.method1515((byte) 124);
                    }
                    if (~var3 <= -3) {
                        super.field7221 = ~arg1.method1515((byte) 126) == -2;
                        if (var3 >= 17) {
                            super.field7240 = ~arg1.method1515((byte) 121) == -2;
                        }
                    } else {
                        super.field7221 = arg1.method1515((byte) 121) == 1;
                        arg1.method1515((byte) 121);
                    }
                    super.field7245 = ~arg1.method1515((byte) 121) == -2;
                    super.field7237 = arg1.method1515((byte) 124) == 1;
                    super.field7217 = arg1.method1515((byte) 121);
                    if (super.field7217 > 2) {
                        super.field7217 = 2;
                    }
                    super.field7248 = super.field7217;
                    super.field7246 = arg1.method1515((byte) 127) == 1;
                    super.field7251 = arg1.method1515((byte) 126);
                    if (~super.field7251 < -128) {
                        super.field7251 = 127;
                    }
                    super.field7249 = arg1.method1515((byte) 123);
                    super.field7218 = arg1.method1515((byte) 127);
                    if (~super.field7218 < -128) {
                        super.field7218 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field7223 = arg1.method1511(arg0 + 44);
                        super.field7231 = arg1.method1511(arg0 + 199);
                    }
                    if (var3 >= 3 && var3 < 6) {
                        arg1.method1515((byte) 124);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg1.method1515((byte) 126);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class494.field7129 < 96) {
                            var5 = 0;
                        }
                        class24.method178(var5, 103);
                    }
                    if (~var3 <= -6) {
                        super.field7234 = arg1.method1556(106);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field7214 = var6 = arg1.method1515((byte) 124);
                    }
                    if (super.field7214 != 1 && ~super.field7214 != -3) {
                        super.field7214 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field7252 = arg1.method1515((byte) 121) == 1;
                    }
                    if (var3 >= 8) {
                        super.field7239 = arg1.method1515((byte) 126) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field7235 = arg1.method1515((byte) 124);
                    }
                    if (super.field7235 < 0 || ~super.field7235 < ~class271.method1795(class494.field7129, 3)) {
                        super.field7235 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field7228 = ~arg1.method1515((byte) 125) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field7250 = ~arg1.method1515((byte) 125) != -1;
                    }
                    if (var3 >= 12) {
                        super.field7219 = arg1.method1515((byte) 126);
                    }
                    if (~super.field7219 > -1 || super.field7219 > 2) {
                        super.field7219 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field7227 = arg1.method1515((byte) 125) == 1;
                    }
                    if (var3 < 14) {
                        if (~var6 == -1) {
                            super.field7230 = 2;
                        } else {
                            super.field7230 = 1;
                        }
                    } else {
                        super.field7230 = arg1.method1515((byte) 121);
                    }
                    if (~super.field7230 > -1 || ~super.field7230 < -4) {
                        super.field7230 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field7243 = arg1.method1515((byte) 126);
                        if (~super.field7243 > -1 || ~super.field7243 < -5) {
                            super.field7243 = class277.field4221 == 1 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field7226 = ~arg1.method1515((byte) 127) == -2;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field7226 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field7230 == -1) {
                        super.field7230 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(II)Z")
    public final boolean method938(int arg0, int arg1) {
        ++field1874;
        if (arg1 > -24) {
            this.method933((byte) -64, (class352) null);
        }
        return ~arg0 == -1 && !this.field1877 ? super.field7238 : true;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)V")
    public static final void method939(int arg0, boolean arg1) {
        if (arg0 == 465824240) {
            ++field1873;
            class211.method1462(arg1, class80.field1163, (byte) -52, class76.field1105, class155.field2310);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lod;)V")
    public class128(class352 arg0) {
        super.field7253 = 3;
        this.method943(true, false);
        super.field7231 = 0;
        super.field7249 = 255;
        super.field7224 = true;
        super.field7221 = true;
        super.field7216 = true;
        super.field7217 = 0;
        super.field7247 = 2;
        super.field7240 = false;
        super.field7254 = 0;
        super.field7251 = 127;
        super.field7242 = true;
        super.field7241 = true;
        super.field7245 = true;
        super.field7246 = true;
        super.field7223 = 0;
        super.field7220 = true;
        super.field7237 = true;
        super.field7218 = 127;
        super.field7248 = 0;
        super.field7215 = true;
        super.field7219 = 1;
        if (class494.field7129 < 96) {
            class24.method178(0, 100);
        } else {
            class24.method178(2, 96);
        }
        super.field7227 = true;
        super.field7243 = class277.field4221 == 1 ? 2 : 4;
        super.field7214 = 2;
        super.field7230 = 2;
        super.field7252 = false;
        super.field7239 = false;
        super.field7228 = false;
        super.field7250 = true;
        super.field7235 = 0;
        super.field7234 = 0;
        class51 var2 = null;
        try {
            class449 var3 = arg0.method2194("", true, 0);
            while (var3.field6570 == 0) {
                class434.method2690(10, 1L);
            }
            if (var3.field6570 == 1) {
                var2 = (class51) var3.field6569;
                byte[] var4 = new byte[(int) var2.method492((byte) -35)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method491(var5, -1, var4, var4.length + -var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method937((byte) -101, new class217(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method496(-32307);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
    public static void method940(int arg0) {
        if (arg0 != -1) {
            field1878 = 4;
        }
        field1871 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B[S)[S")
    public static final short[] method941(byte arg0, short[] arg1) {
        ++field1876;
        if (arg1 == null) {
            return null;
        } else {
            if (arg0 < 70) {
                field1871 = null;
            }
            short[] var2 = new short[arg1.length];
            class414.method2601(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(II)Z")
    public final boolean method942(int arg0, int arg1) {
        if (arg1 != 5800) {
            this.method937((byte) 53, (class217) null);
        }
        ++field1879;
        return arg0 == 0 ? super.field7238 : true;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZZ)V")
    public final void method943(boolean arg0, boolean arg1) {
        super.field7238 = arg0;
        ++field1880;
        if (arg1) {
            this.field1877 = false;
        }
        if (class510.field7458 != null) {
            class510.field7458.method2980(-1, !this.method938(class96.field1384, -80));
        }
    }
}
