import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class111 extends class21 {

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "Z")
    private volatile boolean field2046 = false;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
    private int field2061 = -1;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "Z")
    private boolean field2048 = false;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lje;")
    private class87 field2053;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lje;")
    private class87 field2056;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    private int field2043;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
    public static int field2057 = 0;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "Lai;")
    public static class10 field2059 = class44.method278("weiss:", 111);

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lai;")
    public static class10 field2055 = class44.method278("Suche nach Updates )2 ", 102);

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    private int field2060;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "[Z")
    private volatile boolean[] field2054;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
    public final void method152(boolean arg0, int arg1) {
        if (arg0) {
            field2059 = null;
        }
        if (this.field2053 != null && this.field2054 != null && this.field2054[arg1]) {
            class115.method815(this, arg1, this.field2053, 16910);
        } else {
            class96.method633(super.field345[arg1], this.field2043, -1469261520, true, (byte) 2, this, arg1);
        }
        ++field2041;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)I")
    private final int method709(byte arg0, int arg1) {
        ++field2052;
        if (super.field309[arg1] != null) {
            return 100;
        } else if (this.field2054[arg1]) {
            return 100;
        } else {
            if (arg0 <= 120) {
                field2059 = null;
            }
            return class45.method281(this.field2043, 117, arg1);
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
    public static final void method710(int arg0, int arg1) {
        ++field2047;
        if (class174.field3353 != arg1) {
            if (class174.field3353 == 0) {
                class20.method131((byte) 118);
            }
            if (arg1 == 20 || arg1 == 40) {
                class157.field3030 = 0;
                class170.field3285 = 0;
                class47.field793 = 0;
            }
            if (arg1 != 20 && ~arg1 != -41 && class75.field1289 != null) {
                class75.field1289.method552(-5034);
                class75.field1289 = null;
            }
            if (class174.field3353 == 25) {
                class89.field1573 = 1;
                class75.field1284 = 1;
                class83.field1455 = 0;
                class61.field1037 = 0;
                class136.field2553 = 0;
            }
            if (~arg1 != -6 && arg1 != 10 && arg1 != 20) {
                class129.method903(2);
            } else {
                class4.method11(class6.field75, class146.field2800, false, class134.field2513);
            }
            if (arg0 <= 49) {
                method713(-82);
            }
            class174.field3353 = arg1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BZLje;I)V")
    public final void method711(int arg0, byte[] arg1, boolean arg2, class87 arg3, int arg4) {
        ++field2050;
        if (arg4 == 255) {
            if (this.field2056 != arg3) {
                if (!arg2 && ~this.field2061 == ~arg0) {
                    this.field2046 = true;
                }
                if (arg1 != null && arg1.length > 2) {
                    class192.field3641.reset();
                    class192.field3641.update(arg1, 0, arg1.length + -2);
                    int var6 = (int) class192.field3641.getValue();
                    int var7 = ((255 & arg1[arg1.length + -2]) << 8) - -(255 & arg1[arg1.length + -1]);
                    if (super.field345[arg0] == var6 && super.field335[arg0] == var7) {
                        this.field2054[arg0] = true;
                        if (arg2) {
                            super.field309[arg0] = class11.method77(class34.method227(arg4, 119), false, arg1);
                        }
                    } else {
                        this.field2054[arg0] = false;
                        if (this.field2048 || arg2) {
                            class96.method633(super.field345[arg0], this.field2043, -1469261520, arg2, (byte) 2, this, arg0);
                        }
                    }
                } else {
                    this.field2054[arg0] = false;
                    if (this.field2048 || arg2) {
                        class96.method633(super.field345[arg0], this.field2043, -1469261520, arg2, (byte) 2, this, arg0);
                    }
                }
            } else if (this.field2046) {
                throw new RuntimeException();
            } else if (arg1 == null) {
                class96.method633(this.field2060, 255, -1469261520, true, (byte) 0, this, this.field2043);
            } else {
                class192.field3641.reset();
                class192.field3641.update(arg1, 0, arg1.length);
                int var8 = (int) class192.field3641.getValue();
                class114 var9 = new class114(class180.method1159(7731, arg1));
                int var10 = var9.method767(true);
                if (var10 != 5 && ~var10 != -7) {
                    throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
                } else {
                    int var11 = 0;
                    if (var10 >= 6) {
                        var11 = var9.method761(arg4);
                    }
                    if (~this.field2060 != ~var8 || this.field2058 != var11) {
                        class96.method633(this.field2060, 255, -1469261520, true, (byte) 0, this, this.field2043);
                    } else {
                        this.method137(1, arg1);
                        this.method712(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    private final void method712(boolean arg0) {
        this.field2054 = new boolean[super.field309.length];
        int var2 = 0;
        if (arg0) {
            while (~var2 > ~this.field2054.length) {
                this.field2054[var2] = false;
                ++var2;
            }
            ++field2040;
            if (this.field2053 == null) {
                this.field2046 = true;
            } else {
                this.field2061 = -1;
                for (int var3 = 0; var3 < this.field2054.length; ++var3) {
                    if (~super.field348[var3] < -1) {
                        class97.method642(this.field2053, this, true, var3);
                        this.field2061 = var3;
                    }
                }
                if (this.field2061 == -1) {
                    this.field2046 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lje;Lje;IZZZ)V")
    public class111(class87 arg0, class87 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2053 = arg0;
        this.field2048 = arg5;
        this.field2056 = arg1;
        this.field2043 = arg2;
        class99.method647((byte) 104, this, this.field2043);
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public static void method713(int arg0) {
        if (arg0 == 0) {
            field2055 = null;
            field2059 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
    public final void method714(int arg0, int arg1, int arg2) {
        if (arg1 < 111) {
            field2057 = 32;
        }
        this.field2058 = arg2;
        ++field2044;
        this.field2060 = arg0;
        if (this.field2056 != null) {
            class115.method815(this, this.field2043, this.field2056, 16910);
        } else {
            class96.method633(this.field2060, 255, -1469261520, true, (byte) 0, this, this.field2043);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
    public final int method715(byte arg0) {
        ++field2042;
        if (this.field2046) {
            return 100;
        } else if (super.field309 != null) {
            return 99;
        } else {
            int var2 = class45.method281(255, 125, this.field2043);
            if (~var2 <= -101) {
                var2 = 99;
            }
            int var3 = -69 / ((20 - arg0) / 55);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)I")
    public final int method716(byte arg0) {
        int var2 = 0;
        ++field2049;
        if (arg0 <= 8) {
            this.field2048 = true;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < super.field309.length; ++var4) {
            if (super.field348[var4] > 0) {
                var2 += 100;
                var3 += this.method709((byte) 122, var4);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BZZBI)V")
    public final void method717(byte[] arg0, boolean arg1, boolean arg2, byte arg3, int arg4) {
        ++field2045;
        if (arg3 != -126) {
            this.method714(-72, 127, 19);
        }
        if (!arg2) {
            arg0[arg0.length + -2] = (byte) (super.field335[arg4] >> 8);
            arg0[arg0.length + -1] = (byte) super.field335[arg4];
            if (this.field2053 != null) {
                class82.method508(arg4, arg0, this.field2053, (byte) 41);
                this.field2054[arg4] = true;
            }
            if (arg1) {
                super.field309[arg4] = class11.method77(class34.method227(arg3, -246), false, arg0);
                return;
            }
        } else {
            if (this.field2046) {
                throw new RuntimeException();
            }
            if (this.field2056 != null) {
                class82.method508(this.field2043, arg0, this.field2056, (byte) 115);
            }
            this.method137(1, arg0);
            this.method712(true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
    public final void method148(int arg0, byte arg1) {
        class166.method1100(arg0, (byte) 106, this.field2043);
        ++field2039;
        if (arg1 < 92) {
            field2059 = null;
        }
    }
}
