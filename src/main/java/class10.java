import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class205 {

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
    private int field186 = -1;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "Lvd;")
    public static class222 field178 = class212.method1357("Cabbage", 10731);

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "Lvd;")
    public static class222 field188 = class212.method1357("(U0a )2 via: ", 10731);

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "Lvd;")
    public static class222 field180 = class212.method1357("Schlie-8en", 10731);

    @OriginalMember(owner = "client!ai", name = "mb", descriptor = "Lvd;")
    public static class222 field192 = class212.method1357("Ung-Ultiges Anmelde)2Paket)3", 10731);

    @OriginalMember(owner = "client!ai", name = "rb", descriptor = "[I")
    public static int[] field197 = new int[4000];

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!ai", name = "sb", descriptor = "Lvd;")
    private static class222 field198 = class212.method1357("glow2:", 10731);

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "Lvd;")
    public static class222 field190 = field198;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "Lvd;")
    public static class222 field179 = field198;

    @OriginalMember(owner = "client!ai", name = "tb", descriptor = "I")
    public static int field199 = -1;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ai", name = "nb", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ai", name = "ob", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ai", name = "pb", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!ai", name = "qb", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "Lof;")
    public static class154 field189;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "[I")
    public int[] field185;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)V")
    public static final void method91(byte arg0, int arg1) {
        ++field183;
        int var2 = 80 / ((-48 - arg0) / 45);
        if (arg1 != -1) {
            if (class27.method232(arg1, -7754)) {
                class13[] var3 = class220.field4066[arg1];
                for (int var4 = 0; var3.length > var4; ++var4) {
                    class13 var5 = var3[var4];
                    if (var5.field367 != null) {
                        class191 var6 = new class191();
                        var6.field3510 = var5.field367;
                        var6.field3521 = var5;
                        class31.method257(2000000, -1308, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = 20 / ((arg1 - -47) / 34);
        if (arg2 == 0) {
            this.field186 = arg0.method675(2);
        }
        ++field194;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Lba;")
    public static final class13 method92(int arg0, int arg1) {
        if (arg0 != 923) {
            field178 = null;
        }
        int var2 = arg1 & 65535;
        int var3 = arg1 >> 16;
        ++field182;
        if (class220.field4066[var3] == null || class220.field4066[var3][var2] == null) {
            boolean var4 = class27.method232(var3, -7754);
            if (!var4) {
                return null;
            }
        }
        return class220.field4066[var3][var2];
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZB)V")
    public static final void method93(boolean arg0, byte arg1) {
        if (arg1 != 90) {
            method91((byte) 59, -70);
        }
        for (int var2 = 0; ~class173.field3263 < ~var2; ++var2) {
            class193 var3 = class202.field3696[class113.field2123[var2]];
            long var4 = (long) class113.field2123[var2] << 32 | 536870912L;
            if (var3 != null && var3.method306(103) && !arg0 == !var3.field3558.field2166 && var3.field3558.method743((byte) 28)) {
                int var6 = var3.field1353 >> 7;
                int var7 = var3.field1360 >> 7;
                if (~var6 <= -1 && var6 < 104 && var7 >= 0 && ~var7 > -105) {
                    if (~var3.field1331 == -2 && ~(127 & var3.field1353) == -65 && ~(127 & var3.field1360) == -65) {
                        if (~class227.field4264[var6][var7] == ~class228.field4287) {
                            continue;
                        }
                        class227.field4264[var6][var7] = class228.field4287;
                    }
                    if (!var3.field3558.field2153) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field1308 = class71.method482(var3.field1360 - -((var3.field1331 - 1) * 64), (var3.field1331 - 1) * 64 + var3.field1353, class217.field4036, (byte) 122);
                    class6.method57(class217.field4036, var3.field1353, var3.field1360, var3.field1308, (var3.field1331 + -1) * 64 + 60, var3, var3.field1365, var4, var3.field1344);
                }
            }
        }
        ++field181;
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
    public static void method94(int arg0) {
        field197 = null;
        field178 = null;
        field188 = null;
        field190 = null;
        field180 = null;
        field198 = null;
        if (arg0 != 1) {
            method91((byte) -38, -64);
        }
        field179 = null;
        field192 = null;
        field189 = null;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
    public final void method95(int arg0) {
        ++field187;
        super.method95(arg0);
        this.field185 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I")
    public int[][] method96(int arg0, byte arg1) {
        if (arg1 <= 98) {
            this.method95(-119);
        }
        ++field193;
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015 && this.method99(-23838)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = (class134.field2598 == this.field184 ? arg0 : this.field184 * arg0 / class134.field2598) * this.field195;
            if (~class118.field2245 != ~this.field195) {
                for (int var8 = 0; class118.field2245 > var8; ++var8) {
                    int var9 = this.field195 * var8 / class118.field2245;
                    int var10 = this.field185[var7 - -var9];
                    var5[var8] = class139.method876(4080, var10 << 4);
                    var6[var8] = class139.method876(65280, var10) >> 4;
                    var4[var8] = class139.method876(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class118.field2245; ++var11) {
                    int var12 = this.field185[var7++];
                    var5[var11] = class139.method876(255, var12) << 4;
                    var6[var11] = class139.method876(65280, var12) >> 4;
                    var4[var11] = class139.method876(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class10() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)I")
    public final int method97(int arg0) {
        if (arg0 != 8521) {
            this.field185 = null;
        }
        ++field196;
        return this.field186;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([BI)V")
    public static final void method98(byte[] arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 21964) {
            field178 = null;
        }
        ++field176;
        while (true) {
            while (~var2 > ~arg0.length) {
                int var3 = -class167.field3184 + 64 * arg0[var2++];
                int var4 = 64 * arg0[var2++] - class59.field1107;
                if (var3 > 0 && var4 > 0 && ~class99.field1862 < ~(var3 - -64) && ~(var4 + 64) > ~class38.field852) {
                    int var5 = var3 >> 6;
                    int var6 = class38.field852 - 1 + -var4 >> 6;
                    for (int var7 = 0; var7 < 64; ++var7) {
                        for (int var8 = -64; var8 < 0; ++var8) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if ((1 & var9) == 1) {
                                    byte var10 = arg0[var2++];
                                    if (class205.field3808[var5][var6] == null) {
                                        class205.field3808[var5][var6] = new byte[4096];
                                    }
                                    class205.field3808[var5][var6][(-(1 - -var8) << 6) + var7] = (byte) var10;
                                }
                                if ((2 & var9) == 2) {
                                    byte var11 = arg0[var2++];
                                    if (class69.field1296[var5][var6] == null) {
                                        class69.field1296[var5][var6] = new byte[4096];
                                    }
                                    class69.field1296[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) (var11 + -28);
                                }
                                if (~(var9 & 4) == -5) {
                                    var2 += 3;
                                    int var12 = (255 & arg0[var2 + -1]) + (((arg0[var2 + -3] & 255) << 16) - -((255 & arg0[var2 + -2]) << 8));
                                    if (class114.field2182[var5][var6] == null) {
                                        class114.field2182[var5][var6] = new int[4096];
                                    }
                                    --var12;
                                    class65 var13 = class174.method1102(var12, 0);
                                    if (var13.field1197 != null) {
                                        var13 = var13.method439((byte) 73);
                                        if (var13 == null || var13.field1214 == -1) {
                                            continue;
                                        }
                                    }
                                    class114.field2182[var5][var6][(-(var8 + 1) << 6) + var7] = var13.field1179 + 1;
                                    class113 var14 = new class113();
                                    var14.field2125 = var3;
                                    var14.field2126 = var13.field1214;
                                    var14.field2122 = -var4 + class38.field852;
                                    class71.field1387.method235(var14, true);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; ~var15 > -65; ++var15) {
                        for (int var16 = -64; ~var16 > -1; ++var16) {
                            byte var17 = arg0[var2++];
                            if (~var17 != -1) {
                                if (~(var17 & 1) == -2) {
                                    ++var2;
                                }
                                if ((2 & var17) == 2) {
                                    ++var2;
                                }
                                if (~(4 & var17) == -5) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)Z")
    public final boolean method99(int arg0) {
        ++field175;
        if (this.field185 != null) {
            return true;
        } else {
            if (arg0 != -23838) {
                this.method99(108);
            }
            if (~this.field186 <= -1) {
                class19 var2 = class226.method1474(class138.field2679, 109, this.field186);
                var2.method162();
                this.field185 = var2.field445;
                this.field184 = var2.field446;
                this.field195 = var2.field448;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
    public static final void method100(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2302 = null;
        }
    }
}
