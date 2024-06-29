import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class48 extends class33 {

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    private int field1020 = 0;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field1019 = 0;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "Lrd;")
    public static class173 field1023 = null;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "Lrd;")
    private static class173 field1030 = class133.method843("Prepared visibility map", -70);

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Lrd;")
    public static class173 field1016 = field1030;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "[I")
    private int[] field1017;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "[I")
    private int[] field1018;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "[Ldh;")
    public static class39[] field1029;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "[[I")
    private int[][] field1015;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        ++field1012;
        if (this.field1015 == null) {
            this.field1015 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 != -1) {
            this.method175(108, (byte) 110);
        }
        if (this.field1015.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1020 == -3) {
                this.method335(false);
            }
            class172.method1105(arg0 + 5001);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)[I")
    private final int[] method332(int arg0, int arg1) {
        ++field1026;
        if (~arg0 > -1) {
            return this.field1018;
        } else {
            if (arg1 != 192) {
                field1019 = -47;
            }
            return ~this.field1015.length >= ~arg0 ? this.field1017 : this.field1015[arg0];
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method333(boolean arg0) {
        if (!arg0) {
            method334((byte) 31, 127);
        }
        field1016 = null;
        field1023 = null;
        field1029 = null;
        field1030 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg0 == 0) {
            this.field1020 = arg2.method751((byte) -83);
            this.field1015 = new int[arg2.method751((byte) 112)][2];
            for (int var4 = 0; ~this.field1015.length < ~var4; ++var4) {
                this.field1015[var4][0] = arg2.method755((byte) -36);
                this.field1015[var4][1] = arg2.method755((byte) -35);
            }
        }
        ++field1021;
        if (arg1 > -99) {
            this.field1020 = 91;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Lv;")
    public static final class207 method334(byte arg0, int arg1) {
        ++field1011;
        class207 var2 = (class207) class193.field3757.method46((long) arg1, 26580);
        if (var2 != null) {
            return var2;
        } else if (arg0 != -6) {
            return null;
        } else {
            byte[] var3 = class98.field1789.method142(16, arg1, (byte) 2);
            class207 var4 = new class207();
            if (var3 != null) {
                var4.method1373((byte) -7, new class121(var3));
            }
            class193.field3757.method52(-3583, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class48() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
    private final void method335(boolean arg0) {
        ++field1025;
        int[] var2 = this.field1015[0];
        if (arg0) {
            method334((byte) 79, 40);
        }
        int[] var3 = this.field1015[1];
        int[] var4 = this.field1015[this.field1015.length + -2];
        int[] var5 = this.field1015[this.field1015.length - 1];
        this.field1018 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - -var2[1] + -var3[1] };
        this.field1017 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] - -var4[1] - var5[1] };
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = -108 / ((-65 - arg1) / 60);
        ++field1031;
        int[] var4 = super.field718.method514(arg0, -24);
        if (super.field718.field1615) {
            int[] var5 = this.method262(arg0, -101, 0);
            int var6 = this.field1020;
            if (~var6 != -3) {
                if (var6 == 1) {
                    for (int var7 = 0; var7 < class117.field2173; ++var7) {
                        int var8 = var5[var7];
                        int var9;
                        for (var9 = 1; var9 < this.field1015.length + -1 && ~var8 <= ~this.field1015[var9][0]; ++var9) {
                        }
                        int[] var10 = this.field1015[var9 + -1];
                        int[] var11 = this.field1015[var9];
                        int var12 = (-var10[0] + var8 << 12) / (var11[0] + -var10[0]);
                        int var13 = 4096 - class54.field1079[(8190 & var12) >> 5] >> 1;
                        int var14 = -var13 + 4096;
                        var4[var7] = var10[1] * var14 + var11[1] * var13 >> 12;
                    }
                } else {
                    for (int var15 = 0; class117.field2173 > var15; ++var15) {
                        int var16 = var5[var15];
                        int var17;
                        for (var17 = 1; var17 < this.field1015.length - 1 && var16 >= this.field1015[var17][0]; ++var17) {
                        }
                        int[] var18 = this.field1015[var17 + -1];
                        int[] var19 = this.field1015[var17];
                        int var20 = (-var18[0] + var16 << 12) / (var19[0] - var18[0]);
                        int var21 = -var20 + 4096;
                        var4[var15] = var18[1] * var21 + var19[1] * var20 >> 12;
                    }
                }
            } else {
                for (int var22 = 0; ~var22 > ~class117.field2173; ++var22) {
                    int var23 = var5[var22];
                    int var24;
                    for (var24 = 1; ~(this.field1015.length + -1) < ~var24 && var23 >= this.field1015[var24][0]; ++var24) {
                    }
                    int[] var25 = this.field1015[var24];
                    int[] var26 = this.field1015[var24 + -1];
                    int var27 = this.method332(var24 + -2, 192)[1];
                    int var28 = var26[1];
                    int var29 = var25[1];
                    int var30 = this.method332(var24 + 1, 192)[1];
                    int var32 = (-var26[0] + var23 << 12) / (var25[0] - var26[0]);
                    int var33 = -var27 + var30 + -var29 + var28;
                    int var34 = -var28 + -var33 + var27;
                    int var35 = -var27 + var29;
                    int var36 = var32 * var32 >> 12;
                    int var37 = (var32 * var33 >> 12) * var36 >> 12;
                    int var38 = var32 * var35 >> 12;
                    int var39 = var34 * var36 >> 12;
                    var4[var22] = var37 + var39 + var28 + var38;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
    public static final void method336(byte arg0) {
        ++field1024;
        if (!class13.field208[96]) {
            if (class13.field208[97]) {
                class33.field717 += (24 - class33.field717) / 2;
            } else {
                class33.field717 /= 2;
            }
        } else {
            class33.field717 += (-24 - class33.field717) / 2;
        }
        int var1 = class92.field1740 + class175.field3447.field2820;
        class140.field2614 = 2047 & class33.field717 / 2 + class140.field2614;
        if (!class13.field208[98]) {
            if (!class13.field208[99]) {
                class56.field1112 /= 2;
            } else {
                class56.field1112 += (-class56.field1112 + -12) / 2;
            }
        } else {
            class56.field1112 += (-class56.field1112 + 12) / 2;
        }
        int var2 = class21.field463 + class175.field3447.field2801;
        if (-var1 + class54.field1086 < -500 || ~(-var1 + class54.field1086) < -501 || -var2 + class103.field1908 < -500 || -var2 + class103.field1908 > 500) {
            class103.field1908 = var2;
            class54.field1086 = var1;
        }
        class203.field3928 += class56.field1112 / 2;
        int var3 = 0;
        if (~class54.field1086 != ~var1) {
            class54.field1086 += (-class54.field1086 + var1) / 16;
        }
        int var4 = class54.field1086 >> 7;
        if (~class103.field1908 != ~var2) {
            class103.field1908 += (-class103.field1908 + var2) / 16;
        }
        if (arg0 >= -90) {
            field1013 = -32;
        }
        if (class203.field3928 < 128) {
            class203.field3928 = 128;
        }
        int var5 = class103.field1908 >> 7;
        if (class203.field3928 > 383) {
            class203.field3928 = 383;
        }
        int var6 = class56.method361(class172.field3347, class103.field1908, (byte) -57, class54.field1086);
        if (var4 > 3 && var5 > 3 && ~var4 > -101 && ~var5 > -101) {
            for (int var7 = var4 + -4; var4 + 4 >= var7; ++var7) {
                for (int var8 = var5 - 4; var8 <= var5 - -4; ++var8) {
                    int var9 = class172.field3347;
                    if (~var9 > -4 && ~(class21.field462[1][var7][var8] & 2) == -3) {
                        ++var9;
                    }
                    int var10 = -class46.field975[var9][var7][var8] + var6;
                    if (~var3 > ~var10) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (~var11 > -32769) {
            var11 = 32768;
        }
        if (~class196.field3827 <= ~var11) {
            if (class196.field3827 > var11) {
                class196.field3827 += (var11 - class196.field3827) / 80;
                return;
            }
        } else {
            class196.field3827 += (-class196.field3827 + var11) / 24;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)V")
    public static final void method337(int arg0, byte arg1) {
        ++field1027;
        if (~arg0 != 0) {
            if (class144.field2689[arg0]) {
                class120.field2210.method139(arg0, 0);
                if (class63.field1232[arg0] != null) {
                    if (arg1 != 80) {
                        field1016 = null;
                    }
                    boolean var2 = true;
                    for (int var3 = 0; var3 < class63.field1232[arg0].length; ++var3) {
                        if (class63.field1232[arg0][var3] != null) {
                            if (class63.field1232[arg0][var3].field3077 == 2) {
                                var2 = false;
                            } else {
                                class63.field1232[arg0][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class63.field1232[arg0] = null;
                    }
                    class144.field2689[arg0] = false;
                }
            }
        }
    }
}
