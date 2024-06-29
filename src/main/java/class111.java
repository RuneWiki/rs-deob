import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class111 extends class264 {

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    private int field1639 = 0;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
    private int field1642 = 0;

    @OriginalMember(owner = "client!s", name = "ub", descriptor = "I")
    private int field1652 = 0;

    @OriginalMember(owner = "client!s", name = "sb", descriptor = "[Lkg;")
    public static class107[] field1650 = new class107[5000];

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Lma;")
    public static class5 field1637 = class12.method119("Lade Konfiguration )2 ", (byte) 87);

    @OriginalMember(owner = "client!s", name = "vb", descriptor = "Lma;")
    private static class5 field1653 = class12.method119("Choose Option", (byte) 108);

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "I")
    public static int field1648 = 0;

    @OriginalMember(owner = "client!s", name = "tb", descriptor = "Lma;")
    public static class5 field1651 = field1653;

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "[I")
    public static int[] field1649 = new int[4096];

    @OriginalMember(owner = "client!s", name = "xb", descriptor = "Lma;")
    public static class5 field1655 = class12.method119(" <col=ffff00>", (byte) 109);

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!s", name = "wb", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client!s", name = "yb", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!s", name = "Ab", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!s", name = "Bb", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!s", name = "Cb", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client!s", name = "Db", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!s", name = "Eb", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client!s", name = "zb", descriptor = "[[B")
    public static byte[][] field1657;

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "[[Z")
    public static boolean[][] field1645;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "[[[B")
    public static byte[][][] field1641;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method735(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -126 / ((arg3 + 29) / 50);
        class294.field4956 = arg4;
        class301.field5073 = arg1;
        class101.field1505 = arg0;
        class57.field899 = arg2;
        field1647++;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)[[I", line = 25)
    public final int[][] method138(byte arg0, int arg1) {
        int[][] var3 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[][] var4 = this.method1817(-77, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class226.field3716; var11++) {
                this.method736(var5[var11], var7[var11], var6[var11], -94);
                this.field1640 += this.field1652;
                if (this.field1640 < 0) {
                    this.field1640 = 0;
                }
                this.field1643 += this.field1639;
                if (this.field1640 > 4096) {
                    this.field1640 = 4096;
                }
                while (this.field1643 < 0) {
                    this.field1643 += 4096;
                }
                while (this.field1643 > 4096) {
                    this.field1643 -= 4096;
                }
                this.field1646 += this.field1642;
                if (this.field1646 < 0) {
                    this.field1646 = 0;
                }
                if (this.field1646 > 4096) {
                    this.field1646 = 4096;
                }
                this.method737(this.field1646, this.field1643, this.field1640, 25287);
                var8[var11] = this.field1662;
                var9[var11] = this.field1660;
                var10[var11] = this.field1654;
            }
        }
        field1661++;
        int var12 = -27 / ((-arg0 - 43) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 271)
    public class111() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V", line = 99)
    private final void method736(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -58 % ((arg3 + 44) / 44);
        field1644++;
        int var6 = arg0 <= arg1 ? arg0 : arg1;
        int var7 = arg0 < arg1 ? arg1 : arg0;
        int var8 = arg2 <= var7 ? var7 : arg2;
        int var9 = var6 <= arg2 ? var6 : arg2;
        this.field1640 = (var8 + var9) / 2;
        int var10 = var8 - var9;
        if (var10 <= 0) {
            this.field1643 = 0;
        } else {
            int var11 = (var8 - arg1 << 12) / var10;
            int var12 = (var8 - arg0 << 12) / var10;
            int var13 = (var8 - arg2 << 12) / var10;
            if (arg1 == var8) {
                this.field1643 = arg0 == var9 ? var13 + 20480 : -var12 + 4096;
            } else if (arg0 == var8) {
                this.field1643 = arg2 == var9 ? var11 + 4096 : 12288 - var13;
            } else {
                this.field1643 = arg1 == var9 ? var12 + 12288 : -var11 + 20480;
            }
            this.field1643 /= 6;
        }
        if (this.field1640 > 0 && this.field1640 < 4096) {
            this.field1646 = (var10 << 12) / (this.field1640 > 2048 ? 8192 - (this.field1640 * 2) : this.field1640 * 2);
        } else {
            this.field1646 = 0;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIII)V", line = 151)
    private final void method737(int arg0, int arg1, int arg2, int arg3) {
        field1656++;
        if (arg3 != 25287) {
            method735(78, 33, 66, -86, 16);
        }
        int var5 = arg2 <= 2048 ? (arg0 + 4096) * arg2 >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
        if (var5 <= 0) {
            this.field1662 = this.field1660 = this.field1654 = arg2;
            return;
        }
        int var6 = arg1 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var10 = var8 * var5 >> 12;
        int var11 = var6 >> 12;
        int var12 = var6 - (var11 << 12);
        int var13 = var10 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var11 == 0) {
            this.field1654 = var7;
            this.field1662 = var5;
            this.field1660 = var14;
        } else if (var11 == 1) {
            this.field1660 = var5;
            this.field1662 = var15;
            this.field1654 = var7;
        } else if (var11 == 2) {
            this.field1654 = var14;
            this.field1662 = var7;
            this.field1660 = var5;
        } else if (var11 == 3) {
            this.field1654 = var5;
            this.field1662 = var7;
            this.field1660 = var15;
        } else if (var11 == 4) {
            this.field1660 = var7;
            this.field1662 = var14;
            this.field1654 = var5;
        } else if (var11 == 5) {
            this.field1660 = var7;
            this.field1654 = var15;
            this.field1662 = var5;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[BII[Lmc;IIIIZ)V", line = 275)
    public static final void method738(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class50[] arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field1659++;
        class221 var11 = new class221(arg2);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1549((byte) -50);
            if (var13 == 0) {
                if (arg7 != 5101) {
                    method735(119, -79, -34, -127, -37);
                }
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1507(-98);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var11.method1509(true);
                int var19 = var14 >> 12;
                int var20 = var18 & 0x3;
                int var21 = var18 >> 2;
                if (arg9 == var19 && var16 >= arg4 && var16 < (arg4 + 8) && arg8 <= var17 && var17 < (arg8 + 8)) {
                    class185 var22 = class77.method536(var12, 121);
                    int var23 = arg6 + class81.method553(arg3, var22.field2840, var22.field2859, var20, var16 & 0x7, var17 & 0x7, 25353);
                    int var24 = arg1 + class197.method1305(var22.field2840, var17 & 0x7, 7, var16 & 0x7, var20, var22.field2859, arg3);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class50 var25 = null;
                        if (!arg10) {
                            int var26 = arg0;
                            if ((class18.field321[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class303.method2054(var25, var21, var12, var23, arg10, arg0, arg0, 426775073, var20 + arg3 & 0x3, !arg10, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V", line = 356)
    public static void method739(int arg0) {
        if (arg0 != -4097) {
            return;
        }
        field1657 = (byte[][]) null;
        field1637 = null;
        field1645 = (boolean[][]) null;
        field1649 = null;
        field1653 = null;
        field1651 = null;
        field1650 = null;
        field1655 = null;
        field1641 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILii;)V", line = 381)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field1638++;
        if (arg0 == 0) {
            this.field1639 = arg2.method1505(-13);
        } else if (arg0 == 1) {
            this.field1642 = (arg2.method1543(false) << 12) / 100;
        } else if (arg0 == 2) {
            this.field1652 = (arg2.method1543(false) << 12) / 100;
        }
        if (arg1 > -27) {
            this.method4(-35, 31, (class221) null);
        }
    }
}
