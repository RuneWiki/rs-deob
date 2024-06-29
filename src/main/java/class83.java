import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class83 extends class173 {

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "[[B")
    public byte[][] field1685 = new byte[256][];

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
    public int field1688 = 0;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "[I")
    private int[] field1678;

    @OriginalMember(owner = "client!ie", name = "Eb", descriptor = "[I")
    private int[] field1711;

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "[I")
    private int[] field1698;

    @OriginalMember(owner = "client!ie", name = "zb", descriptor = "[I")
    private int[] field1706;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Lrf;")
    private static class163 field1667 = class53.method392(63, "img=");

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Lrf;")
    private static class163 field1672 = class53.method392(112, "times");

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "Lrf;")
    private static class163 field1668 = class53.method392(44, "u=");

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Lrf;")
    private static class163 field1677 = class53.method392(127, ")4col");

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private static int field1673 = 0;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    private static int field1674 = 0;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Lrf;")
    private static class163 field1675 = class53.method392(-65, "br");

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lrf;")
    private static class163 field1682 = class53.method392(120, "trans=");

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "Lrf;")
    private static class163 field1686 = class53.method392(122, "shy");

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    private static int field1687 = 0;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lrf;")
    private static class163 field1681 = class53.method392(48, ")4str");

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "Lrf;")
    private static class163 field1695 = class53.method392(92, "str");

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    private static int field1689 = 0;

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "Lrf;")
    private static class163 field1696 = class53.method392(67, "lt");

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "Lrf;")
    private static class163 field1691 = class53.method392(69, "nbsp");

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "[Lrf;")
    private static class163[] field1684 = new class163[100];

    @OriginalMember(owner = "client!ie", name = "sb", descriptor = "Lrf;")
    private static class163 field1699 = class53.method392(93, "euro");

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    private static int field1692 = -1;

    @OriginalMember(owner = "client!ie", name = "wb", descriptor = "I")
    private static int field1703 = -1;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lrf;")
    private static class163 field1679 = class53.method392(73, "u");

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    private static int field1694 = -1;

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "I")
    private static int field1697 = 256;

    @OriginalMember(owner = "client!ie", name = "vb", descriptor = "Lrf;")
    private static class163 field1702 = class53.method392(-50, ")4u");

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
    private static int field1690 = 256;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "Lrf;")
    private static class163 field1671 = class53.method392(60, "str=");

    @OriginalMember(owner = "client!ie", name = "ub", descriptor = "Lrf;")
    private static class163 field1701 = class53.method392(-103, ")4trans");

    @OriginalMember(owner = "client!ie", name = "Ab", descriptor = "Lrf;")
    private static class163 field1707 = class53.method392(-59, "reg");

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    private static int field1680 = -1;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lrf;")
    private static class163 field1669 = class53.method392(124, ")4shad");

    @OriginalMember(owner = "client!ie", name = "tb", descriptor = "Lrf;")
    private static class163 field1700 = class53.method392(-43, "copy");

    @OriginalMember(owner = "client!ie", name = "Cb", descriptor = "Lrf;")
    private static class163 field1709 = class53.method392(56, "col=");

    @OriginalMember(owner = "client!ie", name = "Db", descriptor = "Lrf;")
    private static class163 field1710 = class53.method392(-43, "gt");

    @OriginalMember(owner = "client!ie", name = "Fb", descriptor = "Lrf;")
    private static class163 field1712 = class53.method392(-127, "shad");

    @OriginalMember(owner = "client!ie", name = "yb", descriptor = "Lrf;")
    private static class163 field1705 = class53.method392(-57, "shad=");

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "[B")
    private byte[] field1670;

    @OriginalMember(owner = "client!ie", name = "xb", descriptor = "[I")
    private int[] field1704;

    @OriginalMember(owner = "client!ie", name = "Bb", descriptor = "[I")
    private int[] field1708;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "[Lpf;")
    private class145[] field1693;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)I")
    private final int method555(int arg0) {
        return this.field1708[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()V")
    public static void method556() {
        field1696 = null;
        field1710 = null;
        field1691 = null;
        field1686 = null;
        field1672 = null;
        field1699 = null;
        field1700 = null;
        field1707 = null;
        field1667 = null;
        field1675 = null;
        field1709 = null;
        field1677 = null;
        field1682 = null;
        field1701 = null;
        field1668 = null;
        field1679 = null;
        field1702 = null;
        field1705 = null;
        field1712 = null;
        field1669 = null;
        field1671 = null;
        field1695 = null;
        field1681 = null;
        field1684 = null;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(IIIIII)V")
    public abstract void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;IIIII)V")
    public final void method558(class163 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method581(arg3, arg4);
        int[] var7 = new int[arg0.field3341];
        int[] var8 = new int[arg0.field3341];
        for (int var9 = 0; var9 < arg0.field3341; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method574(arg0, arg1 - this.method560(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
    private final void method559(int arg0, int arg1, int arg2) {
        field1680 = -1;
        field1694 = -1;
        field1692 = arg1;
        field1703 = arg1;
        field1673 = arg0;
        field1689 = arg0;
        field1690 = arg2;
        field1697 = arg2;
        field1674 = 0;
        field1687 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;)I")
    public final int method560(class163 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field3341; var5++) {
            int var6 = arg0.field3320[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class163 var7 = arg0.method1036(var5, (byte) 108, var2 + 1);
                    var2 = -1;
                    if (var7.method1043(81, field1696)) {
                        var6 = 60;
                    } else if (var7.method1043(118, field1710)) {
                        var6 = 62;
                    } else if (var7.method1043(85, field1691)) {
                        var6 = 160;
                    } else if (var7.method1043(112, field1686)) {
                        var6 = 173;
                    } else if (var7.method1043(115, field1672)) {
                        var6 = 215;
                    } else if (var7.method1043(121, field1699)) {
                        var6 = 128;
                    } else if (var7.method1043(92, field1700)) {
                        var6 = 169;
                    } else {
                        if (!var7.method1043(125, field1707)) {
                            if (var7.method1024(122, field1667)) {
                                try {
                                    int var8 = var7.method1039(4, -94).method1025(20559);
                                    var4 += this.field1693[var8].field2973;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 174;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field1708[var6];
                    if (this.field1670 != null && var3 != -1) {
                        var4 += this.field1670[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;I)V")
    private final void method561(class163 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method1029(119); var5++) {
            int var6 = arg0.method1032(var5, (byte) 6);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field1674 = (arg1 - this.method560(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([B)V")
    private final void method562(byte[] arg0) {
        this.field1708 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field1708.length; var2++) {
                this.field1708[var2] = arg0[var2] & 0xFF;
            }
            this.field1688 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field1708[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field1670 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field1670[(var13 << 8) + var14] = (byte) method564(var9, var11, var6, this.field1708, var5, var13, var14);
                    }
                }
            }
        }
        this.field1688 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method564(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;IIIIIIIIII)I")
    private final int method565(class163 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method559(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field1688;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field1683 + this.field1676 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method572(arg0, var12, field1684);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field1676 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field1676 - this.field1683 - (var13 - 1) * arg10) / 2 + this.field1676 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field1683 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field1676 - this.field1683 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field1676 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method584(field1684[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method584(field1684[var16], arg1 + (arg3 - this.method560(field1684[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method584(field1684[var16], arg1 + arg3 - this.method560(field1684[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method584(field1684[var16], arg1, var14);
            } else {
                this.method561(field1684[var16], arg3);
                this.method584(field1684[var16], arg1, var14);
                field1674 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;IIIILjava/util/Random;I)I")
    public final int method566(class163 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method559(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field3341];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3341; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method574(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lrf;)V")
    private final void method567(class163 arg0) {
        try {
            if (arg0.method1024(121, field1709)) {
                field1689 = arg0.method1039(4, -107).method1041(16, 67);
                return;
            }
            if (arg0.method1043(105, field1677)) {
                field1689 = field1673;
                return;
            }
            if (arg0.method1024(115, field1682)) {
                field1697 = arg0.method1039(6, 124).method1025(20559);
                return;
            }
            if (arg0.method1043(122, field1701)) {
                field1697 = field1690;
                return;
            }
            if (arg0.method1024(103, field1671)) {
                field1680 = arg0.method1039(4, 80).method1041(16, 59);
                return;
            }
            if (arg0.method1043(95, field1695)) {
                field1680 = 8388608;
                return;
            }
            if (arg0.method1043(119, field1681)) {
                field1680 = -1;
                return;
            }
            if (arg0.method1024(104, field1668)) {
                field1694 = arg0.method1039(2, -128).method1041(16, 89);
                return;
            }
            if (arg0.method1043(91, field1679)) {
                field1694 = 0;
                return;
            }
            if (arg0.method1043(127, field1702)) {
                field1694 = -1;
                return;
            }
            if (arg0.method1024(104, field1705)) {
                field1703 = arg0.method1039(5, 122).method1041(16, 46);
                return;
            }
            if (arg0.method1043(82, field1712)) {
                field1703 = 0;
                return;
            }
            if (arg0.method1043(97, field1669)) {
                field1703 = field1692;
                return;
            }
            if (arg0.method1043(93, field1675)) {
                this.method559(field1673, field1692, field1690);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;IIIIIIIII)I")
    public final int method568(class163 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method565(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method569(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method570(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lrf;I)I")
    public final int method571(class163 arg0, int arg1) {
        return this.method572(arg0, new int[] { arg1 }, field1684);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;[I[Lrf;)I")
    private final int method572(class163 arg0, int[] arg1, class163[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class163 var6 = class90.method625(-66, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method1029(112);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method1032(var14, (byte) 126);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class163 var16 = arg0.method1036(var14, (byte) 127, var10 + 1);
                    var10 = -1;
                    var6.method1022(60, true);
                    var6.method1034(var16, -101);
                    var6.method1022(62, true);
                    if (var16.method1043(105, field1675)) {
                        arg2[var12++] = var6.method1036(var6.method1029(115), (byte) 99, var5);
                        var5 = var6.method1029(116);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method1043(78, field1696)) {
                        var4 += this.method555(60);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method1043(94, field1710)) {
                        var4 += this.method555(62);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method1043(109, field1691)) {
                        var4 += this.method555(160);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + 160];
                        }
                        var11 = 160;
                    } else if (var16.method1043(113, field1686)) {
                        var4 += this.method555(173);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + 173];
                        }
                        var11 = 173;
                    } else if (var16.method1043(76, field1672)) {
                        var4 += this.method555(215);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + 215];
                        }
                        var11 = 215;
                    } else if (var16.method1043(92, field1699)) {
                        var4 += this.method555(128);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + 128];
                        }
                        var11 = 128;
                    } else if (var16.method1043(125, field1700)) {
                        var4 += this.method555(169);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + 169];
                        }
                        var11 = 169;
                    } else if (var16.method1043(76, field1707)) {
                        var4 += this.method555(174);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + 174];
                        }
                        var11 = 174;
                    } else if (var16.method1024(101, field1667)) {
                        try {
                            int var17 = var16.method1039(4, -119).method1025(20559);
                            var4 += this.field1693[var17].field2973;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method1022(var15, true);
                        var4 += this.method555(var15);
                        if (this.field1670 != null && var11 != -1) {
                            var4 += this.field1670[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method1029(126);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method1036(var7 - var9, (byte) 92, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method1029(119);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method1029(124) > var5) {
            arg2[var12++] = var6.method1036(var6.method1029(114), (byte) 107, var5);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;IIII)V")
    public final void method573(class163 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method581(arg3, arg4);
            this.method584(arg0, arg1 - this.method560(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;II[I[I)V")
    private final void method574(class163 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field1688;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3341; var10++) {
            int var11 = arg0.field3320[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class163 var12 = arg0.method1036(var10, (byte) 112, var7 + 1);
                    var7 = -1;
                    if (var12.method1043(84, field1696)) {
                        var11 = 60;
                    } else if (var12.method1043(109, field1710)) {
                        var11 = 62;
                    } else if (var12.method1043(112, field1691)) {
                        var11 = 160;
                    } else if (var12.method1043(119, field1686)) {
                        var11 = 173;
                    } else if (var12.method1043(81, field1672)) {
                        var11 = 215;
                    } else if (var12.method1043(105, field1699)) {
                        var11 = 128;
                    } else if (var12.method1043(81, field1700)) {
                        var11 = 169;
                    } else {
                        if (!var12.method1043(97, field1707)) {
                            if (var12.method1024(96, field1667)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method1039(4, 74).method1025(20559);
                                    class145 var16 = this.field1693[var15];
                                    int var17 = this.field1704 == null ? var16.field2971 : this.field1704[var15];
                                    if (field1697 == 256) {
                                        var16.method944(arg1 + var13, this.field1688 + var6 - var17 + var14);
                                    } else {
                                        var16.method942(arg1 + var13, this.field1688 + var6 - var17 + var14, field1697);
                                    }
                                    arg1 += var16.field2973;
                                    var8 = -1;
                                } catch (Exception var23) {
                                }
                            } else {
                                this.method567(var12);
                            }
                            continue;
                        }
                        var11 = 174;
                    }
                }
                if (var7 == -1) {
                    if (this.field1670 != null && var8 != -1) {
                        arg1 += this.field1670[(var8 << 8) + var11];
                    }
                    int var18 = this.field1698[var11];
                    int var19 = this.field1706[var11];
                    int var20;
                    if (arg3 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg3[var9];
                    }
                    int var21;
                    if (arg4 == null) {
                        var21 = 0;
                    } else {
                        var21 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field1674 > 0) {
                            field1687 += field1674;
                            arg1 += field1687 >> 8;
                            field1687 &= 0xFF;
                        }
                    } else if (field1697 == 256) {
                        if (field1703 != -1) {
                            this.method575(var11, this.field1678[var11] + arg1 + var20 + 1, this.field1711[var11] + var6 + 1 + var21, var18, var19, field1703);
                        }
                        this.method557(var11, this.field1678[var11] + arg1 + var20, this.field1711[var11] + var6 + var21, var18, var19, field1689);
                    } else {
                        if (field1703 != -1) {
                            this.method578(var11, this.field1678[var11] + arg1 + var20 + 1, this.field1711[var11] + var6 + 1 + var21, var18, var19, field1703, field1697);
                        }
                        this.method563(var11, this.field1678[var11] + arg1 + var20, this.field1711[var11] + var6 + var21, var18, var19, field1689, field1697);
                    }
                    int var22 = this.field1708[var11];
                    if (field1680 != -1) {
                        class173.method1163(arg1, (int) ((double) this.field1688 * 0.7D) + var6, var22, field1680);
                    }
                    if (field1694 != -1) {
                        class173.method1163(arg1, this.field1688 + var6, var22, field1694);
                    }
                    arg1 += var22;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(IIIIII)V")
    private final void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class173.field3504 * arg2 + arg1;
        int var8 = class173.field3504 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class173.field3506) {
            int var11 = class173.field3506 - arg2;
            arg4 -= var11;
            arg2 = class173.field3506;
            var10 += arg3 * var11;
            var7 += class173.field3504 * var11;
        }
        if (arg2 + arg4 > class173.field3501) {
            arg4 -= arg2 + arg4 - class173.field3501;
        }
        if (arg1 < class173.field3503) {
            int var12 = class173.field3503 - arg1;
            arg3 -= var12;
            arg1 = class173.field3503;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class173.field3507) {
            int var13 = arg1 + arg3 - class173.field3507;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method570(class173.field3502, this.field1685[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([Lpf;[I)V")
    public final void method576(class145[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field1693 = arg0;
        this.field1704 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lrf;IIII)V")
    public final void method577(class163 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method581(arg3, arg4);
            this.method584(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIIIIII)V")
    private final void method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class173.field3504 * arg2 + arg1;
        int var9 = class173.field3504 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class173.field3506) {
            int var12 = class173.field3506 - arg2;
            arg4 -= var12;
            arg2 = class173.field3506;
            var11 += arg3 * var12;
            var8 += class173.field3504 * var12;
        }
        if (arg2 + arg4 > class173.field3501) {
            arg4 -= arg2 + arg4 - class173.field3501;
        }
        if (arg1 < class173.field3503) {
            int var13 = class173.field3503 - arg1;
            arg3 -= var13;
            arg1 = class173.field3503;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class173.field3507) {
            int var14 = arg1 + arg3 - class173.field3507;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method569(class173.field3502, this.field1685[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;IIIIII)V")
    public final void method579(class163 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method581(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field3341];
        for (int var11 = 0; var11 < arg0.field3341; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method574(arg0, arg1 - this.method560(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lrf;)Lrf;")
    public static final class163 method580(class163 arg0) {
        int var1 = arg0.method1029(125);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field3320[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class163 var4 = new class163();
        var4.field3341 = var1 + var2;
        var4.field3320 = new byte[var4.field3341];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field3320[var6];
            if (var7 == 60) {
                var4.field3320[var5++] = 60;
                var4.field3320[var5++] = 108;
                var4.field3320[var5++] = 116;
                var4.field3320[var5++] = 62;
            } else if (var7 == 62) {
                var4.field3320[var5++] = 60;
                var4.field3320[var5++] = 103;
                var4.field3320[var5++] = 116;
                var4.field3320[var5++] = 62;
            } else {
                var4.field3320[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
    private final void method581(int arg0, int arg1) {
        field1680 = -1;
        field1694 = -1;
        field1692 = arg1;
        field1703 = arg1;
        field1673 = arg0;
        field1689 = arg0;
        field1690 = 256;
        field1697 = 256;
        field1674 = 0;
        field1687 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lrf;I)I")
    public final int method582(class163 arg0, int arg1) {
        int var3 = this.method572(arg0, new int[] { arg1 }, field1684);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method560(field1684[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lrf;IIII)V")
    public final void method583(class163 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method581(arg3, arg4);
            this.method584(arg0, arg1 - this.method560(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrf;II)V")
    private final void method584(class163 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1688;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field3341; var7++) {
            int var8 = arg0.field3320[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class163 var9 = arg0.method1036(var7, (byte) 119, var5 + 1);
                    var5 = -1;
                    if (var9.method1043(87, field1696)) {
                        var8 = 60;
                    } else if (var9.method1043(93, field1710)) {
                        var8 = 62;
                    } else if (var9.method1043(117, field1691)) {
                        var8 = 160;
                    } else if (var9.method1043(115, field1686)) {
                        var8 = 173;
                    } else if (var9.method1043(80, field1672)) {
                        var8 = 215;
                    } else if (var9.method1043(113, field1699)) {
                        var8 = 128;
                    } else if (var9.method1043(87, field1700)) {
                        var8 = 169;
                    } else {
                        if (!var9.method1043(86, field1707)) {
                            if (var9.method1024(92, field1667)) {
                                try {
                                    int var10 = var9.method1039(4, 69).method1025(20559);
                                    class145 var11 = this.field1693[var10];
                                    int var12 = this.field1704 == null ? var11.field2971 : this.field1704[var10];
                                    if (field1697 == 256) {
                                        var11.method944(arg1, this.field1688 + var4 - var12);
                                    } else {
                                        var11.method942(arg1, this.field1688 + var4 - var12, field1697);
                                    }
                                    arg1 += var11.field2973;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method567(var9);
                            }
                            continue;
                        }
                        var8 = 174;
                    }
                }
                if (var5 == -1) {
                    if (this.field1670 != null && var6 != -1) {
                        arg1 += this.field1670[(var6 << 8) + var8];
                    }
                    int var13 = this.field1698[var8];
                    int var14 = this.field1706[var8];
                    if (var8 == 32) {
                        if (field1674 > 0) {
                            field1687 += field1674;
                            arg1 += field1687 >> 8;
                            field1687 &= 0xFF;
                        }
                    } else if (field1697 == 256) {
                        if (field1703 != -1) {
                            this.method575(var8, this.field1678[var8] + arg1 + 1, this.field1711[var8] + var4 + 1, var13, var14, field1703);
                        }
                        this.method557(var8, this.field1678[var8] + arg1, this.field1711[var8] + var4, var13, var14, field1689);
                    } else {
                        if (field1703 != -1) {
                            this.method578(var8, this.field1678[var8] + arg1 + 1, this.field1711[var8] + var4 + 1, var13, var14, field1703, field1697);
                        }
                        this.method563(var8, this.field1678[var8] + arg1, this.field1711[var8] + var4, var13, var14, field1689, field1697);
                    }
                    int var15 = this.field1708[var8];
                    if (field1680 != -1) {
                        class173.method1163(arg1, (int) ((double) this.field1688 * 0.7D) + var4, var15, field1680);
                    }
                    if (field1694 != -1) {
                        class173.method1163(arg1, this.field1688 + var4 + 1, var15, field1694);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class83(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field1678 = arg1;
        this.field1711 = arg2;
        this.field1698 = arg3;
        this.field1706 = arg4;
        this.method562(arg0);
        this.field1685 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1711[var10] < var8 && this.field1706[var10] != 0) {
                var8 = this.field1711[var10];
            }
            if (this.field1711[var10] + this.field1706[var10] > var9) {
                var9 = this.field1711[var10] + this.field1706[var10];
            }
        }
        this.field1676 = this.field1688 - var8;
        this.field1683 = var9 - this.field1688;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V")
    public class83(byte[] arg0) {
        this.method562(arg0);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lrf;IIIII)V")
    public final void method585(class163 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method581(arg3, arg4);
        int[] var7 = new int[arg0.field3341];
        for (int var8 = 0; var8 < arg0.field3341; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method574(arg0, arg1 - this.method560(arg0) / 2, arg2, null, var7);
    }
}
