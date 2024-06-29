import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class97 extends class200 {

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    private int field1720 = 0;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    private int field1719 = 0;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    private int field1721 = 0;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field1708 = 0;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lid;")
    public static class149 field1726 = class60.method382("Clientscript error in: ", (byte) 24);

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "Lid;")
    public static class149 field1731 = class60.method382("M-Bmoire en cours d(Wattribution", (byte) 11);

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lid;")
    public static class149 field1725 = class60.method382(":duelstake:", (byte) 42);

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "Lid;")
    public static class149 field1732 = class60.method382("showingVideoAd", (byte) 12);

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "Lid;")
    public static class149 field1714 = class60.method382(")0", (byte) 49);

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    private int field1710;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    private int field1724;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "[[[B")
    public static byte[][][] field1716;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)I")
    public static final int method704(int arg0, byte arg1, int arg2) {
        if (~arg0 > ~arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        ++field1729;
        if (arg1 != -97) {
            field1714 = null;
        }
        while (~arg2 != -1) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V")
    private final void method705(int arg0, int arg1, int arg2, int arg3) {
        ++field1723;
        int var5 = arg1 > arg3 ? arg1 : arg3;
        int var6 = arg3 > arg1 ? arg1 : arg3;
        int var7 = ~arg0 < ~var5 ? arg0 : var5;
        int var8 = arg0 >= var6 ? var6 : arg0;
        int var9 = var7 - var8;
        this.field1724 = (var7 + var8) / 2;
        if (this.field1724 > arg2 && this.field1724 < 4096) {
            this.field1722 = (var9 << 12) / (this.field1724 <= 2048 ? this.field1724 * 2 : -(this.field1724 * 2) + 8192);
        } else {
            this.field1722 = 0;
        }
        if (var9 > 0) {
            int var10 = (var7 - arg3 << 12) / var9;
            int var11 = (-arg1 + var7 << 12) / var9;
            int var12 = (-arg0 + var7 << 12) / var9;
            if (arg1 != var7) {
                if (~arg3 != ~var7) {
                    this.field1710 = arg1 != var8 ? -var11 + 20480 : var10 + 12288;
                } else {
                    this.field1710 = ~arg0 != ~var8 ? -var12 + 12288 : var11 + 4096;
                }
            } else {
                this.field1710 = arg3 == var8 ? 20480 - -var12 : -var10 + 4096;
            }
            this.field1710 /= 6;
        } else {
            this.field1710 = 0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public static void method706(int arg0) {
        field1731 = null;
        field1726 = null;
        field1716 = null;
        field1732 = null;
        field1725 = null;
        if (arg0 == 0) {
            field1714 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        int[][] var3 = super.field3632.method965(arg1, 112);
        ++field1712;
        if (!arg0) {
            return null;
        } else {
            if (super.field3632.field2550) {
                int[][] var4 = this.method1366(arg1, !arg0, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                int[] var9 = var3[1];
                int[] var10 = var4[2];
                for (int var11 = 0; var11 < class137.field2515; ++var11) {
                    this.method705(var10[var11], var6[var11], 0, var5[var11]);
                    this.field1724 += this.field1720;
                    if (~this.field1724 > -1) {
                        this.field1724 = 0;
                    }
                    this.field1710 += this.field1721;
                    if (this.field1724 > 4096) {
                        this.field1724 = 4096;
                    }
                    this.field1722 += this.field1719;
                    if (this.field1722 < 0) {
                        this.field1722 = 0;
                    }
                    while (this.field1710 < 0) {
                        this.field1710 += 4096;
                    }
                    while (~this.field1710 < -4097) {
                        this.field1710 -= 4096;
                    }
                    if (~this.field1722 < -4097) {
                        this.field1722 = 4096;
                    }
                    this.method709(this.field1722, -28837, this.field1710, this.field1724);
                    var7[var11] = this.field1715;
                    var9[var11] = this.field1711;
                    var8[var11] = this.field1718;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field1728;
        if (arg1) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field1720 = (arg0.method514((byte) 1) << 12) / 100;
                    }
                } else {
                    this.field1719 = (arg0.method514((byte) 1) << 12) / 100;
                }
            } else {
                this.field1721 = arg0.method526((byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)I")
    public static final int method707(boolean arg0, int arg1, int arg2) {
        ++field1713;
        if (~arg2 == 0) {
            return 12345678;
        } else {
            if (arg0) {
                method704(31, (byte) -2, 121);
            }
            int var3 = (127 & arg2) * arg1 >> 7;
            if (~var3 <= -3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (65408 & arg2) + var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([SI[Lid;)V")
    public static final void method708(short[] arg0, int arg1, class149[] arg2) {
        class211.method1439(arg2, arg0, 0, true, arg2.length + -1);
        if (arg1 == -4097) {
            ++field1727;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIII)V")
    private final void method709(int arg0, int arg1, int arg2, int arg3) {
        ++field1709;
        int var5 = ~arg3 >= -2049 ? (arg0 + 4096) * arg3 >> 12 : arg0 + arg3 + -(arg0 * arg3 >> 12);
        if (~var5 < -1) {
            int var6 = arg3 + arg3 + -var5;
            int var7 = (-var6 + var5 << 12) / var5;
            int var8 = arg2 * 6;
            int var9 = var8 >> 12;
            int var11 = var7 * var5 >> 12;
            int var12 = -(var9 << 12) + var8;
            int var13 = var11 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var6 - -var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field1715 = var5;
                                    this.field1711 = var6;
                                    this.field1718 = var14;
                                }
                            } else {
                                this.field1718 = var5;
                                this.field1711 = var6;
                                this.field1715 = var15;
                            }
                        } else {
                            this.field1715 = var6;
                            this.field1711 = var14;
                            this.field1718 = var5;
                        }
                    } else {
                        this.field1718 = var15;
                        this.field1715 = var6;
                        this.field1711 = var5;
                    }
                } else {
                    this.field1715 = var14;
                    this.field1711 = var5;
                    this.field1718 = var6;
                }
            } else {
                this.field1711 = var15;
                this.field1715 = var5;
                this.field1718 = var6;
            }
        } else {
            this.field1715 = this.field1711 = this.field1718 = arg3;
        }
        if (arg1 != -28837) {
            field1726 = null;
        }
    }
}
