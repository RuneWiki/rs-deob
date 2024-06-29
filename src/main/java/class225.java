import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class225 extends class84 {

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    private int field3624 = 0;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "[S")
    private short[] field3623 = new short[257];

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "[Z")
    public static boolean[] field3616 = new boolean[100];

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field3622 = 0;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "Llc;")
    public static class86 field3618;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "[I")
    private int[] field3612;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "[I")
    private int[] field3625;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "[[I")
    private int[][] field3620;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLsl;II)V")
    public static final void method1611(byte arg0, class18 arg1, int arg2, int arg3) {
        if (arg0 != 74) {
            method1613((byte) 89);
        }
        ++field3617;
        if (~arg1.field1932 == ~arg2 && ~arg2 != 0) {
            class141 var4 = class285.method1939(arg2, 112);
            int var5 = var4.field2273;
            if (~var5 == -2) {
                arg1.field1937 = 1;
                arg1.field1941 = arg3;
                arg1.field1970 = 0;
                arg1.field1969 = 0;
                arg1.field1921 = 0;
                class263.method1845(arg1.field1921, arg1.field1910, false, arg1.field1979, (byte) -59, var4);
            }
            if (~var5 == -3) {
                arg1.field1969 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field1932 == -1 || ~class285.method1939(arg2, 112).field2278 <= ~class285.method1939(arg1.field1932, 112).field2278) {
            arg1.field1941 = arg3;
            arg1.field1932 = arg2;
            arg1.field1970 = 0;
            arg1.field1969 = 0;
            arg1.field1937 = 1;
            arg1.field1920 = arg1.field1933;
            arg1.field1921 = 0;
            if (arg1.field1932 == -1) {
                return;
            }
            class263.method1845(arg1.field1921, arg1.field1910, false, arg1.field1979, (byte) -83, class285.method1939(arg1.field1932, 112));
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        if (arg0) {
            field3616 = null;
        }
        ++field3627;
        if (this.field3620 == null) {
            this.field3620 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field3620.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3624 == -3) {
                this.method1617((byte) 49);
            }
            class239.method1677((byte) 52);
            this.method1616((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        int[] var3 = super.field1228.method1627(-1, arg1);
        ++field3614;
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, arg1, false);
            for (int var5 = 0; ~var5 > ~class20.field221; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3623[var6];
            }
        }
        if (arg0 >= -125) {
            this.field3612 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public static final void method1612(byte arg0) {
        if (class180.field2901 != null) {
            class180.field2901.method728((byte) -84);
            class180.field2901 = null;
        }
        ++field3613;
        class210.method1531(103);
        class224.method1608();
        for (int var1 = 0; var1 < 4; ++var1) {
            class138.field2237[var1].method827((byte) -60);
        }
        class82.method597(false, 127);
        System.gc();
        class59.method425(-127, 2);
        class92.field1372 = -1;
        class195.field3136 = false;
        class118.method864(false, true);
        class44.field647 = 0;
        class282.field4487 = 0;
        class99.field1465 = 0;
        class245.field4024 = 0;
        class100.field1467 = false;
        for (int var2 = 0; ~var2 > ~class96.field1425.length; ++var2) {
            class96.field1425[var2] = null;
        }
        class121.field1772 = 0;
        class21.field235 = 0;
        for (int var3 = 0; var3 < 2048; ++var3) {
            class92.field1374[var3] = null;
            class239.field3812[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; ++var4) {
            class169.field2730[var4] = null;
        }
        int var5 = -125 % ((19 - arg0) / 37);
        for (int var6 = 0; ~var6 > -5; ++var6) {
            for (int var7 = 0; ~var7 > -105; ++var7) {
                for (int var8 = 0; var8 < 104; ++var8) {
                    class43.field627[var6][var7][var8] = null;
                }
            }
        }
        class250.method1786(-127);
        class210.field3373 = 0;
        class88.method667(true);
        class273.method1890(true, (byte) 72);
        try {
            class54.method405((byte) 54, class138.field2241.field63, "loggedout");
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field3628;
        if (arg2 == 0) {
            this.field3624 = arg0.method1111(255);
            this.field3620 = new int[arg0.method1111(255)][2];
            for (int var4 = 0; this.field3620.length > var4; ++var4) {
                this.field3620[var4][0] = arg0.method1126(false);
                this.field3620[var4][1] = arg0.method1126(false);
            }
        }
        if (arg1 < 87) {
            method1612((byte) 4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public static final void method1613(byte arg0) {
        class297.field4689 = null;
        class163.field2647 = null;
        class51.field741 = null;
        class59.field830 = null;
        class26.field302 = null;
        class266.field4305 = null;
        class110.field1581 = null;
        class126.field1859 = null;
        class94.field1402 = null;
        class240.field3832 = null;
        ++field3619;
        class145.field2371 = null;
        if (arg0 == 81) {
            class11.field125 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)V")
    public static final void method1614(int arg0) {
        ++field3615;
        class52.field765.method1556((byte) 114);
        class81.field1171.method1556((byte) 85);
        if (arg0 > -50) {
            field3618 = null;
        }
        class45.field651.method1556((byte) 127);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)V")
    public static void method1615(boolean arg0) {
        field3618 = null;
        if (arg0) {
            field3618 = null;
        }
        field3616 = null;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
    private final void method1616(byte arg0) {
        int var2 = this.field3624;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field3620.length + -1) && this.field3620[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field3620[var5];
                    int[] var7 = this.field3620[var5 + -1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] - var7[0]);
                    int var9 = -class24.field282[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var7[1] * var10 - -(var6[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3623[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3620.length + -1 > var14 && var13 >= this.field3620[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3620[var14];
                    int[] var16 = this.field3620[var14 - 1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3623[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field3620.length - 1 > var22 && this.field3620[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field3620[var22 + -1];
                int[] var24 = this.field3620[var22];
                int var25 = this.method1618(var22 - 2, 87)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1618(var22 - -1, 100)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var28 - -var27 + -var26 + -var25;
                int var31 = var29 * var29 >> 12;
                int var32 = -var25 + var26;
                int var33 = var25 - var30 + -var27;
                int var35 = var31 * var33 >> 12;
                int var36 = var29 * var32 >> 12;
                int var37 = (var29 * var30 >> 12) * var31 >> 12;
                int var38 = var36 + var37 + var35 + var27;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3623[var20] = (short) var38;
            }
        }
        if (arg0 != -108) {
            this.field3623 = null;
        }
        ++field3611;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
    private final void method1617(byte arg0) {
        ++field3626;
        int[] var2 = this.field3620[0];
        if (arg0 != 49) {
            this.method1616((byte) 19);
        }
        int[] var3 = this.field3620[this.field3620.length - 2];
        int[] var4 = this.field3620[1];
        int[] var5 = this.field3620[this.field3620.length + -1];
        this.field3625 = new int[] { var2[0] - (var4[0] + -var2[0]), var2[1] - (var4[1] + -var2[1]) };
        this.field3612 = new int[] { var3[0] + -var5[0] + var3[0], var3[1] + var3[1] + -var5[1] };
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class225() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
    private final int[] method1618(int arg0, int arg1) {
        if (arg1 <= 86) {
            this.method1616((byte) -125);
        }
        ++field3621;
        if (arg0 < 0) {
            return this.field3625;
        } else {
            return arg0 >= this.field3620.length ? this.field3612 : this.field3620[arg0];
        }
    }
}
