import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class129 {

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Z")
    public boolean field1666 = false;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public int field1667 = 5;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public int field1676 = -1;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Z")
    public boolean field1672 = false;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Z")
    public boolean field1674 = false;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public int field1685 = -1;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public int field1673 = -1;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field1679 = 2;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public int field1688 = 99;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    public int field1692 = -1;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    public int field1694 = -1;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "Z")
    public boolean field1686 = false;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "Lke;")
    public static class622 field1675 = new class622(86, 0);

    @OriginalMember(owner = "client!co", name = "C", descriptor = "F")
    public static float field1693;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Lgf;")
    public class289 field1665;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "[I")
    public int[] field1668;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "[I")
    private int[] field1678;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
    public int[] field1682;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "[I")
    public int[] field1683;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "[I")
    public int[] field1684;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "[I")
    public int[] field1691;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "[Z")
    public boolean[] field1687;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "[[I")
    public int[][] field1670;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILka;IIII)Lka;")
    public final class495 method932(int arg0, class495 arg1, int arg2, int arg3, int arg4, int arg5) {
        field1680++;
        int var7 = this.field1668[arg5];
        int var8 = this.field1684[arg5];
        class520 var9 = this.field1665.method1935(984, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method81((byte) 1, arg2, true);
        }
        class520 var11 = null;
        if ((this.field1686 || class180.field2725) && arg3 != -1 && this.field1684.length > arg3) {
            int var12 = this.field1684[arg3];
            var11 = this.field1665.method1935(984, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class520 var13 = null;
        class520 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1678 != null) {
            if (this.field1678.length > arg5) {
                var15 = this.field1678[arg5];
                if (var15 != 65535) {
                    var13 = this.field1665.method1935(984, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1686 || class180.field2725) && arg3 != -1 && this.field1678.length > arg3) {
                var16 = this.field1678[arg3];
                if (var16 != 65535) {
                    var14 = this.field1665.method1935(984, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1674) {
            arg2 |= 0x200;
        }
        if (var9.method3033(true, var10)) {
            arg2 |= 0x80;
        }
        if (var9.method3029(false, var10)) {
            arg2 |= 0x100;
        }
        if (var9.method3034(var10, 0)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3033(true, var15)) {
                arg2 |= 0x80;
            }
            if (var13.method3029(false, var15)) {
                arg2 |= 0x100;
            }
            if (var13.method3034(var15, arg0 + 30322)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3033(true, arg3)) {
                arg2 |= 0x80;
            }
            if (var11.method3029(false, arg3)) {
                arg2 |= 0x100;
            }
            if (var11.method3034(arg3, 0)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3033(true, var16)) {
                arg2 |= 0x80;
            }
            if (var14.method3029(false, var16)) {
                arg2 |= 0x100;
            }
            if (var14.method3034(var16, 0)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        class495 var18 = arg1.method81((byte) 1, var17, true);
        var18.method2890(var7, arg3, -127, var9, var11, this.field1674, 0, var10, arg4 - 1);
        if (var13 != null) {
            var18.method2890(var7, var16, -125, var13, var14, this.field1674, 0, var15, arg4 - 1);
        }
        if (arg0 != -30322) {
            this.field1684 = null;
        }
        return var18;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public final void method933(boolean arg0) {
        if (this.field1673 == -1) {
            if (this.field1687 == null) {
                this.field1673 = 0;
            } else {
                this.field1673 = 2;
            }
        }
        if (!arg0) {
            return;
        }
        field1669++;
        if (this.field1685 != -1) {
            return;
        }
        if (this.field1687 == null) {
            this.field1685 = 0;
        } else {
            this.field1685 = 2;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIZ)I")
    public final int method934(int arg0, int arg1, int arg2, boolean arg3) {
        field1689++;
        int var5 = 0;
        if (arg1 != 256) {
            this.method932(-76, null, 11, -106, 88, -17);
        }
        int var6 = 0;
        int var7 = this.field1684[arg2];
        class520 var8 = null;
        class520 var9 = this.field1665.method1935(984, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1686 || class180.field2725) && arg0 != -1 && this.field1684.length > arg0) {
            int var11 = this.field1684[arg0];
            var8 = this.field1665.method1935(984, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1674) {
            var5 |= 0x200;
        }
        if (var9.method3033(true, var10)) {
            var5 |= 0x80;
        }
        if (var9.method3029(false, var10)) {
            var5 |= 0x100;
        }
        if (var9.method3034(var10, 0)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3033(true, var6)) {
                var5 |= 0x80;
            }
            if (var8.method3029(false, var6)) {
                var5 |= 0x100;
            }
            if (var8.method3034(var6, 0)) {
                var5 |= 0x400;
            }
        }
        if (this.field1678 != null && arg3) {
            if (this.field1678.length > arg2) {
                int var12 = this.field1678[arg2];
                if (var12 != 65535) {
                    class520 var13 = this.field1665.method1935(984, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3033(true, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3029(false, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3034(var14, arg1 ^ 0x100)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1686 || class180.field2725) && arg0 != -1 && arg0 < this.field1678.length) {
                int var15 = this.field1678[arg0];
                if (var15 != 65535) {
                    class520 var16 = this.field1665.method1935(984, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3033(true, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3029(false, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3034(var17, 0)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILrv;)V")
    public final void method935(int arg0, class120 arg1) {
        if (arg0 < 11) {
            this.field1674 = false;
        }
        field1677++;
        while (true) {
            int var3 = arg1.method842(2384);
            if (var3 == 0) {
                return;
            }
            this.method938(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public static void method936(byte arg0) {
        field1675 = null;
        if (arg0 < 105) {
            method936((byte) 34);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIBILka;II)Lka;")
    public final class495 method937(int arg0, int arg1, int arg2, byte arg3, int arg4, class495 arg5, int arg6, int arg7) {
        field1681++;
        int var9 = this.field1668[arg6];
        int var10 = this.field1684[arg6];
        class520 var11 = this.field1665.method1935(984, var10 >> 16);
        if (arg0 != 1827533136) {
            this.field1685 = 88;
        }
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method81(arg3, arg4, true);
        }
        class520 var13 = null;
        if ((this.field1686 || class180.field2725) && arg7 != -1 && this.field1684.length > arg7) {
            int var14 = this.field1684[arg7];
            var13 = this.field1665.method1935(984, var14 >> 16);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field1674) {
            arg4 |= 0x200;
        }
        if (var11.method3033(true, var12)) {
            arg4 |= 0x80;
        }
        if (var11.method3029(false, var12)) {
            arg4 |= 0x100;
        }
        if (var11.method3034(var12, 0)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3033(true, arg7)) {
                arg4 |= 0x80;
            }
            if (var13.method3029(false, arg7)) {
                arg4 |= 0x100;
            }
            if (var13.method3034(arg7, 0)) {
                arg4 |= 0x400;
            }
        }
        int var15 = arg4 | 0x20;
        class495 var16 = arg5.method81(arg3, var15, true);
        var16.method2890(var9, arg7, arg0 ^ 0x93120ED0, var11, var13, this.field1674, arg1, var12, arg2 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lrv;IZ)V")
    private final void method938(class120 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            int var16 = arg0.method898((byte) -89);
            this.field1668 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field1668[var17] = arg0.method898((byte) -109);
            }
            this.field1684 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field1684[var18] = arg0.method898((byte) -93);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field1684[var19] += arg0.method898((byte) -82) << 16;
            }
        } else if (arg1 == 2) {
            this.field1692 = arg0.method898((byte) -89);
        } else if (arg1 == 3) {
            this.field1687 = new boolean[256];
            int var4 = arg0.method842(2384);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1687[arg0.method842(2384)] = true;
            }
        } else if (arg1 == 5) {
            this.field1667 = arg0.method842(2384);
        } else if (arg1 == 6) {
            this.field1676 = arg0.method898((byte) -112);
        } else if (arg1 == 7) {
            this.field1694 = arg0.method898((byte) -92);
        } else if (arg1 == 8) {
            this.field1688 = arg0.method842(2384);
        } else if (arg1 == 9) {
            this.field1685 = arg0.method842(2384);
        } else if (arg1 == 10) {
            this.field1673 = arg0.method842(2384);
        } else if (arg1 == 11) {
            this.field1679 = arg0.method842(2384);
        } else if (arg1 == 12) {
            int var6 = arg0.method842(2384);
            this.field1678 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1678[var7] = arg0.method898((byte) -126);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field1678[var8] = (arg0.method898((byte) -79) << 16) + this.field1678[var8];
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method898((byte) -97);
            this.field1670 = new int[var12][];
            for (int var13 = 0; var13 < var12; var13++) {
                int var14 = arg0.method842(2384);
                if (var14 > 0) {
                    this.field1670[var13] = new int[var14];
                    this.field1670[var13][0] = arg0.method833(-3);
                    for (int var15 = 1; var15 < var14; var15++) {
                        this.field1670[var13][var15] = arg0.method898((byte) -98);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1674 = true;
        } else if (arg1 == 15) {
            this.field1686 = true;
        } else if (arg1 == 16) {
            this.field1672 = true;
        } else if (arg1 == 18) {
            this.field1666 = true;
        } else if (arg1 == 19) {
            if (this.field1683 == null) {
                this.field1683 = new int[this.field1670.length];
                for (int var11 = 0; var11 < this.field1670.length; var11++) {
                    this.field1683[var11] = 255;
                }
            }
            this.field1683[arg0.method842(2384)] = arg0.method842(2384);
        } else if (arg1 == 20) {
            if (this.field1691 == null || this.field1682 == null) {
                this.field1691 = new int[this.field1670.length];
                this.field1682 = new int[this.field1670.length];
                for (int var9 = 0; var9 < this.field1670.length; var9++) {
                    this.field1691[var9] = 256;
                    this.field1682[var9] = 256;
                }
            }
            int var10 = arg0.method842(2384);
            this.field1691[var10] = arg0.method898((byte) -90);
            this.field1682[var10] = arg0.method898((byte) -126);
        }
        if (!arg2) {
            this.method938(null, -66, false);
        }
        field1671++;
    }
}
