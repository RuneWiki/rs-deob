import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YIGACPUG")
public class class67 {

    @OriginalMember(owner = "client!YIGACPUG", name = "c", descriptor = "I")
    private int field1646 = 865;

    @OriginalMember(owner = "client!YIGACPUG", name = "e", descriptor = "Z")
    private boolean field1648 = true;

    @OriginalMember(owner = "client!YIGACPUG", name = "s", descriptor = "I")
    private int field1662 = -6102;

    @OriginalMember(owner = "client!YIGACPUG", name = "z", descriptor = "I")
    private int field1669 = -42268;

    @OriginalMember(owner = "client!YIGACPUG", name = "E", descriptor = "I")
    private int field1674 = 48536;

    @OriginalMember(owner = "client!YIGACPUG", name = "j", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!YIGACPUG", name = "k", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client!YIGACPUG", name = "p", descriptor = "[[[I")
    private int[][][] field1659;

    @OriginalMember(owner = "client!YIGACPUG", name = "A", descriptor = "[[[B")
    private byte[][][] field1670;

    @OriginalMember(owner = "client!YIGACPUG", name = "r", descriptor = "[[[B")
    private byte[][][] field1661;

    @OriginalMember(owner = "client!YIGACPUG", name = "o", descriptor = "[[[B")
    private byte[][][] field1658;

    @OriginalMember(owner = "client!YIGACPUG", name = "G", descriptor = "[[[B")
    private byte[][][] field1676;

    @OriginalMember(owner = "client!YIGACPUG", name = "g", descriptor = "[[[B")
    private byte[][][] field1650;

    @OriginalMember(owner = "client!YIGACPUG", name = "t", descriptor = "[[[I")
    private int[][][] field1663;

    @OriginalMember(owner = "client!YIGACPUG", name = "h", descriptor = "[[[B")
    private byte[][][] field1651;

    @OriginalMember(owner = "client!YIGACPUG", name = "D", descriptor = "[[I")
    private int[][] field1673;

    @OriginalMember(owner = "client!YIGACPUG", name = "u", descriptor = "[I")
    private int[] field1664;

    @OriginalMember(owner = "client!YIGACPUG", name = "v", descriptor = "[I")
    private int[] field1665;

    @OriginalMember(owner = "client!YIGACPUG", name = "w", descriptor = "[I")
    private int[] field1666;

    @OriginalMember(owner = "client!YIGACPUG", name = "x", descriptor = "[I")
    private int[] field1667;

    @OriginalMember(owner = "client!YIGACPUG", name = "y", descriptor = "[I")
    private int[] field1668;

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "[I")
    private static final int[] field1644 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!YIGACPUG", name = "b", descriptor = "[I")
    private static final int[] field1645 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!YIGACPUG", name = "d", descriptor = "B")
    private static byte field1647 = 62;

    @OriginalMember(owner = "client!YIGACPUG", name = "f", descriptor = "I")
    private static int field1649 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!YIGACPUG", name = "i", descriptor = "I")
    public static int field1652 = 99;

    @OriginalMember(owner = "client!YIGACPUG", name = "l", descriptor = "B")
    private static byte field1655 = 9;

    @OriginalMember(owner = "client!YIGACPUG", name = "m", descriptor = "Z")
    public static boolean field1656 = true;

    @OriginalMember(owner = "client!YIGACPUG", name = "q", descriptor = "I")
    private static int field1660 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!YIGACPUG", name = "B", descriptor = "[I")
    private static final int[] field1671 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!YIGACPUG", name = "C", descriptor = "[I")
    private static final int[] field1672 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!YIGACPUG", name = "F", descriptor = "Z")
    private static boolean field1675 = true;

    @OriginalMember(owner = "client!YIGACPUG", name = "H", descriptor = "I")
    private static int field1677 = 3;

    @OriginalMember(owner = "client!YIGACPUG", name = "n", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "([BIIIIIII[LZSRJFSKK;I)V")
    public final void method550(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class70[] arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg9 + var11 > 0 && arg9 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg8[arg7].field1716[arg9 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class13 var12 = new class13(arg0, (byte) 3);
        if (arg6 <= 0) {
            this.field1662 = 408;
        }
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg3 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg2 && var15 < arg2 + 8) {
                        this.method563(arg1 + class11.method195(arg5, var15 & 0x7, true, var14 & 0x7), arg7, arg5, arg9 + class11.method194(var14 & 0x7, 745, var15 & 0x7, arg5), var12, 21322, 0, 0);
                    } else {
                        this.method563(-1, 0, 0, -1, var12, 21322, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIB)V")
    public final void method551(int arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1659[arg1][arg2 + var5][arg0 + var8] = 0;
            }
        }
        if (arg3 != 42) {
            return;
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1659[arg1][arg2][arg0 + var6] = this.field1659[arg1][arg2 - 1][arg0 + var6];
            }
        }
        if (arg0 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1659[arg1][arg2 + var7][arg0] = this.field1659[arg1][arg2 + var7][arg0 - 1];
            }
        }
        if (arg2 > 0 && this.field1659[arg1][arg2 - 1][arg0] != 0) {
            this.field1659[arg1][arg2][arg0] = this.field1659[arg1][arg2 - 1][arg0];
        } else if (arg0 > 0 && this.field1659[arg1][arg2][arg0 - 1] != 0) {
            this.field1659[arg1][arg2][arg0] = this.field1659[arg1][arg2][arg0 - 1];
        } else if (arg2 > 0 && arg0 > 0 && this.field1659[arg1][arg2 - 1][arg0 - 1] != 0) {
            this.field1659[arg1][arg2][arg0] = this.field1659[arg1][arg2 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(ZLLVBGZMMP;LFTMSICIZ;)V")
    public static final void method552(boolean arg0, class30 arg1, class13 arg2) {
        if (!arg0) {
            return;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg2.method227();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class39 var5 = class39.method409(var3);
            var5.method414(-442, arg1);
            while (true) {
                int var6 = arg2.method227();
                if (var6 == 0) {
                    break;
                }
                arg2.method213();
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIII)I")
    public int method553(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1674 != arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field1670[arg0][arg1][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1670[1][arg1][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(II)I")
    private static final int method554(int arg0, int arg1) {
        int var2 = method558(arg0 + 45365, arg1 + 91923, 4) + (method558(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method558(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(III)I")
    private final int method555(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIIILXNSGYTEG;I[BI[LZSRJFSKK;I)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, class63 arg5, int arg6, byte[] arg7, int arg8, class70[] arg9, int arg10) {
        if (arg2 != -37619) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        class13 var13 = new class13(arg7, (byte) 3);
        int var14 = -1;
        while (true) {
            int var15 = var13.method227();
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var13.method227();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var13.method213();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg1 == var20 && var19 >= arg6 && var19 < arg6 + 8 && var18 >= arg10 && var18 < arg10 + 8) {
                    class39 var24 = class39.method409(var14);
                    int var25 = arg3 + class11.method196(var24.field1141, var19 & 0x7, var24.field1146, var23, var18 & 0x7, arg0, -40762);
                    int var26 = arg4 + class11.method197(var23, var24.field1141, var19 & 0x7, var18 & 0x7, 0, arg0, var24.field1146);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg8;
                        if ((this.field1670[1][var25][var26] & 0x2) == 2) {
                            var27 = arg8 - 1;
                        }
                        class70 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg9[var27];
                        }
                        this.method559(var14, -42268, arg8, var26, arg0 + var23 & 0x3, var28, var25, var22, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "<init>", descriptor = "([[[II[[[BBI)V")
    public class67(int[][][] arg0, int arg1, byte[][][] arg2, byte arg3, int arg4) {
        field1652 = 99;
        this.field1653 = arg1;
        this.field1654 = arg4;
        this.field1659 = arg0;
        this.field1670 = arg2;
        this.field1661 = new byte[4][this.field1653][this.field1654];
        this.field1658 = new byte[4][this.field1653][this.field1654];
        this.field1676 = new byte[4][this.field1653][this.field1654];
        this.field1650 = new byte[4][this.field1653][this.field1654];
        this.field1663 = new int[4][this.field1653 + 1][this.field1654 + 1];
        this.field1651 = new byte[4][this.field1653 + 1][this.field1654 + 1];
        this.field1673 = new int[this.field1653 + 1][this.field1654 + 1];
        this.field1664 = new int[this.field1654];
        this.field1665 = new int[this.field1654];
        if (arg3 != -61) {
            this.field1646 = -353;
        }
        this.field1666 = new int[this.field1654];
        this.field1667 = new int[this.field1654];
        this.field1668 = new int[this.field1654];
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "b", descriptor = "(II)I")
    private final int method557(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "b", descriptor = "(III)I")
    private static final int method558(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method570(var3, var5);
        int var8 = method570(var3 + 1, var5);
        int var9 = method570(var3, var5 + 1);
        int var10 = method570(var3 + 1, var5 + 1);
        int var11 = method560(var7, var8, var4, arg2);
        int var12 = method560(var9, var10, var4, arg2);
        return method560(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIIILZSRJFSKK;IILXNSGYTEG;)V")
    private final void method559(int arg0, int arg1, int arg2, int arg3, int arg4, class70 arg5, int arg6, int arg7, class63 arg8) {
        if (field1656 && (this.field1670[0][arg6][arg3] & 0x2) == 0) {
            if ((this.field1670[arg2][arg6][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method553(arg2, arg6, 48536, arg3) != field1657) {
                return;
            }
        }
        if (arg2 < field1652) {
            field1652 = arg2;
        }
        int var10 = this.field1659[arg2][arg6][arg3];
        int var11 = this.field1659[arg2][arg6 + 1][arg3];
        if (this.field1669 != arg1) {
            this.field1646 = 30;
        }
        int var12 = this.field1659[arg2][arg6 + 1][arg3 + 1];
        int var13 = this.field1659[arg2][arg6][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class39 var15 = class39.method409(arg0);
        int var16 = (arg0 << 14) + (arg3 << 7) + arg6 + 1073741824;
        if (!var15.field1144) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg4 << 6) + arg7);
        if (arg7 == 22) {
            if (!field1656 || var15.field1144 || var15.field1174) {
                class68 var18;
                if (var15.field1143 == -1 && var15.field1182 == null) {
                    var18 = var15.method413(22, arg4, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class15(arg0, var11, var10, 22, var15.field1143, var13, var12, arg4, 4, true);
                }
                arg8.method493(field1647, var14, var17, arg2, var16, var18, arg3, arg6);
                if (var15.field1140 && var15.field1144 && arg5 != null) {
                    arg5.method579(arg6, (byte) 8, arg3);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class68 var38;
            if (var15.field1143 == -1 && var15.field1182 == null) {
                var38 = var15.method413(10, arg4, var10, var11, var12, var13, -1);
            } else {
                var38 = new class15(arg0, var11, var10, 10, var15.field1143, var13, var12, arg4, 4, true);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg7 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg4 == 1 || arg4 == 3) {
                    var40 = var15.field1141;
                    var41 = var15.field1146;
                } else {
                    var40 = var15.field1146;
                    var41 = var15.field1141;
                }
                if (arg8.method497(var41, arg3, arg6, var16, var40, arg2, var38, var17, var14, (byte) 59, var39) && var15.field1163) {
                    class28 var42;
                    if (var38 instanceof class28) {
                        var42 = (class28) var38;
                    } else {
                        var42 = var15.method413(10, arg4, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field841 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1651[arg2][arg6 + var43][arg3 + var44]) {
                                    this.field1651[arg2][arg6 + var43][arg3 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1140 && arg5 != null) {
                arg5.method578(var15.field1141, arg6, arg3, field1655, var15.field1179, arg4, var15.field1146);
            }
        } else if (arg7 >= 12) {
            class68 var19;
            if (var15.field1143 == -1 && var15.field1182 == null) {
                var19 = var15.method413(arg7, arg4, var10, var11, var12, var13, -1);
            } else {
                var19 = new class15(arg0, var11, var10, arg7, var15.field1143, var13, var12, arg4, 4, true);
            }
            arg8.method497(1, arg3, arg6, var16, 1, arg2, var19, var17, var14, (byte) 59, 0);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
                this.field1663[arg2][arg6][arg3] |= 0x924;
            }
            if (var15.field1140 && arg5 != null) {
                arg5.method578(var15.field1141, arg6, arg3, field1655, var15.field1179, arg4, var15.field1146);
            }
        } else if (arg7 == 0) {
            class68 var20;
            if (var15.field1143 == -1 && var15.field1182 == null) {
                var20 = var15.method413(0, arg4, var10, var11, var12, var13, -1);
            } else {
                var20 = new class15(arg0, var11, var10, 0, var15.field1143, var13, var12, arg4, 4, true);
            }
            arg8.method495(var16, 47915, arg2, arg6, null, var17, var14, arg3, 0, field1672[arg4], var20);
            if (arg4 == 0) {
                if (var15.field1163) {
                    this.field1651[arg2][arg6][arg3] = 50;
                    this.field1651[arg2][arg6][arg3 + 1] = 50;
                }
                if (var15.field1157) {
                    this.field1663[arg2][arg6][arg3] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var15.field1163) {
                    this.field1651[arg2][arg6][arg3 + 1] = 50;
                    this.field1651[arg2][arg6 + 1][arg3 + 1] = 50;
                }
                if (var15.field1157) {
                    this.field1663[arg2][arg6][arg3 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var15.field1163) {
                    this.field1651[arg2][arg6 + 1][arg3] = 50;
                    this.field1651[arg2][arg6 + 1][arg3 + 1] = 50;
                }
                if (var15.field1157) {
                    this.field1663[arg2][arg6 + 1][arg3] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var15.field1163) {
                    this.field1651[arg2][arg6][arg3] = 50;
                    this.field1651[arg2][arg6 + 1][arg3] = 50;
                }
                if (var15.field1157) {
                    this.field1663[arg2][arg6][arg3] |= 0x492;
                }
            }
            if (var15.field1140 && arg5 != null) {
                arg5.method577(0, var15.field1179, arg6, arg3, arg4, arg7);
            }
            if (var15.field1166 != 16) {
                arg8.method503(arg6, 210, var15.field1166, arg2, arg3);
            }
        } else if (arg7 == 1) {
            class68 var21;
            if (var15.field1143 == -1 && var15.field1182 == null) {
                var21 = var15.method413(1, arg4, var10, var11, var12, var13, -1);
            } else {
                var21 = new class15(arg0, var11, var10, 1, var15.field1143, var13, var12, arg4, 4, true);
            }
            arg8.method495(var16, 47915, arg2, arg6, null, var17, var14, arg3, 0, field1671[arg4], var21);
            if (var15.field1163) {
                if (arg4 == 0) {
                    this.field1651[arg2][arg6][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field1651[arg2][arg6 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field1651[arg2][arg6 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    this.field1651[arg2][arg6][arg3] = 50;
                }
            }
            if (var15.field1140 && arg5 != null) {
                arg5.method577(0, var15.field1179, arg6, arg3, arg4, arg7);
            }
        } else if (arg7 == 2) {
            int var22 = arg4 + 1 & 0x3;
            class68 var23;
            class68 var24;
            if (var15.field1143 == -1 && var15.field1182 == null) {
                var23 = var15.method413(2, arg4 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method413(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class15(arg0, var11, var10, 2, var15.field1143, var13, var12, arg4 + 4, 4, true);
                var24 = new class15(arg0, var11, var10, 2, var15.field1143, var13, var12, var22, 4, true);
            }
            arg8.method495(var16, 47915, arg2, arg6, var24, var17, var14, arg3, field1672[var22], field1672[arg4], var23);
            if (var15.field1157) {
                if (arg4 == 0) {
                    this.field1663[arg2][arg6][arg3] |= 0x249;
                    this.field1663[arg2][arg6][arg3 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    this.field1663[arg2][arg6][arg3 + 1] |= 0x492;
                    this.field1663[arg2][arg6 + 1][arg3] |= 0x249;
                } else if (arg4 == 2) {
                    this.field1663[arg2][arg6 + 1][arg3] |= 0x249;
                    this.field1663[arg2][arg6][arg3] |= 0x492;
                } else if (arg4 == 3) {
                    this.field1663[arg2][arg6][arg3] |= 0x492;
                    this.field1663[arg2][arg6][arg3] |= 0x249;
                }
            }
            if (var15.field1140 && arg5 != null) {
                arg5.method577(0, var15.field1179, arg6, arg3, arg4, arg7);
            }
            if (var15.field1166 != 16) {
                arg8.method503(arg6, 210, var15.field1166, arg2, arg3);
            }
        } else if (arg7 == 3) {
            class68 var25;
            if (var15.field1143 == -1 && var15.field1182 == null) {
                var25 = var15.method413(3, arg4, var10, var11, var12, var13, -1);
            } else {
                var25 = new class15(arg0, var11, var10, 3, var15.field1143, var13, var12, arg4, 4, true);
            }
            arg8.method495(var16, 47915, arg2, arg6, null, var17, var14, arg3, 0, field1671[arg4], var25);
            if (var15.field1163) {
                if (arg4 == 0) {
                    this.field1651[arg2][arg6][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field1651[arg2][arg6 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field1651[arg2][arg6 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    this.field1651[arg2][arg6][arg3] = 50;
                }
            }
            if (var15.field1140 && arg5 != null) {
                arg5.method577(0, var15.field1179, arg6, arg3, arg4, arg7);
            }
        } else if (arg7 == 9) {
            class68 var26;
            if (var15.field1143 == -1 && var15.field1182 == null) {
                var26 = var15.method413(arg7, arg4, var10, var11, var12, var13, -1);
            } else {
                var26 = new class15(arg0, var11, var10, arg7, var15.field1143, var13, var12, arg4, 4, true);
            }
            arg8.method497(1, arg3, arg6, var16, 1, arg2, var26, var17, var14, (byte) 59, 0);
            if (var15.field1140 && arg5 != null) {
                arg5.method578(var15.field1141, arg6, arg3, field1655, var15.field1179, arg4, var15.field1146);
            }
        } else {
            if (var15.field1154) {
                if (arg4 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg4 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg4 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg7 == 4) {
                class68 var31;
                if (var15.field1143 == -1 && var15.field1182 == null) {
                    var31 = var15.method413(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class15(arg0, var11, var10, 4, var15.field1143, var13, var12, 0, 4, true);
                }
                arg8.method496(0, arg6, arg2, arg3, 0, var31, field1672[arg4], var16, -562, arg4 * 512, var17, var14);
            } else if (arg7 == 5) {
                int var32 = 16;
                int var33 = arg8.method513(arg2, arg6, arg3);
                if (var33 > 0) {
                    var32 = class39.method409(var33 >> 14 & 0x7FFF).field1166;
                }
                class68 var34;
                if (var15.field1143 == -1 && var15.field1182 == null) {
                    var34 = var15.method413(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class15(arg0, var11, var10, 4, var15.field1143, var13, var12, 0, 4, true);
                }
                arg8.method496(field1644[arg4] * var32, arg6, arg2, arg3, field1645[arg4] * var32, var34, field1672[arg4], var16, -562, arg4 * 512, var17, var14);
            } else if (arg7 == 6) {
                class68 var35;
                if (var15.field1143 == -1 && var15.field1182 == null) {
                    var35 = var15.method413(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class15(arg0, var11, var10, 4, var15.field1143, var13, var12, 0, 4, true);
                }
                arg8.method496(0, arg6, arg2, arg3, 0, var35, 256, var16, -562, arg4, var17, var14);
            } else if (arg7 == 7) {
                class68 var36;
                if (var15.field1143 == -1 && var15.field1182 == null) {
                    var36 = var15.method413(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class15(arg0, var11, var10, 4, var15.field1143, var13, var12, 0, 4, true);
                }
                arg8.method496(0, arg6, arg2, arg3, 0, var36, 512, var16, -562, arg4, var17, var14);
            } else if (arg7 == 8) {
                class68 var37;
                if (var15.field1143 == -1 && var15.field1182 == null) {
                    var37 = var15.method413(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class15(arg0, var11, var10, 4, var15.field1143, var13, var12, 0, 4, true);
                }
                arg8.method496(0, arg6, arg2, arg3, 0, var37, 768, var16, -562, arg4, var17, var14);
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "b", descriptor = "(IIII)I")
    private static final int method560(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class71.field1730[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "c", descriptor = "(II)I")
    private static final int method561(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "c", descriptor = "(III)Z")
    public static final boolean method562(int arg0, int arg1, int arg2) {
        if (arg2 != -38079) {
            throw new NullPointerException();
        }
        class39 var3 = class39.method409(arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method417(arg0, field1675);
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIILFTMSICIZ;III)V")
    private final void method563(int arg0, int arg1, int arg2, int arg3, class13 arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 21322) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg3 < 0 || arg3 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var12 = arg4.method213();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg4.method213();
                    return;
                }
                if (var12 <= 49) {
                    arg4.method213();
                }
            }
        }
        this.field1670[arg1][arg3][arg0] = 0;
        while (true) {
            int var10 = arg4.method213();
            if (var10 == 0) {
                if (arg1 == 0) {
                    this.field1659[0][arg3][arg0] = -method554(arg3 + arg6 + 932731, arg0 + 556238 + arg7) * 8;
                    return;
                } else {
                    this.field1659[arg1][arg3][arg0] = this.field1659[arg1 - 1][arg3][arg0] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg4.method213();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg1 == 0) {
                    this.field1659[0][arg3][arg0] = -var11 * 8;
                    return;
                }
                this.field1659[arg1][arg3][arg0] = this.field1659[arg1 - 1][arg3][arg0] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field1658[arg1][arg3][arg0] = arg4.method214();
                this.field1676[arg1][arg3][arg0] = (byte) ((var10 - 2) / 4);
                this.field1650[arg1][arg3][arg0] = (byte) (var10 + arg2 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field1670[arg1][arg3][arg0] = (byte) (var10 - 49);
            } else {
                this.field1661[arg1][arg3][arg0] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIII)V")
    public final void method564(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg4; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg2; var7++) {
                if (var7 >= 0 && var7 < this.field1653 && var6 >= 0 && var6 < this.field1654) {
                    this.field1651[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        this.field1659[0][var7][var6] = this.field1659[0][var7 - 1][var6];
                    }
                    if (arg1 + arg2 == var7 && var7 < this.field1653 - 1) {
                        this.field1659[0][var7][var6] = this.field1659[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field1659[0][var7][var6] = this.field1659[0][var7][var6 - 1];
                    }
                    if (arg0 + arg4 == var6 && var6 < this.field1654 - 1) {
                        this.field1659[0][var7][var6] = this.field1659[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg3 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "d", descriptor = "(II)I")
    private static final int method565(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "([LZSRJFSKK;II[BIII)V")
    public final void method566(class70[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg4 + var14 > 0 && arg4 + var14 < 103 && arg1 + var15 > 0 && arg1 + var15 < 103) {
                        arg0[var8].field1716[arg4 + var14][arg1 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class13 var9 = new class13(arg3, (byte) 3);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method563(arg1 + var13, var10, 0, arg4 + var12, var9, 21322, arg6, arg2);
                }
            }
        }
        while (arg5 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "([BIII)Z")
    public static final boolean method567(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var4 = true;
        if (arg2 != 1) {
            field1677 = -139;
        }
        class13 var5 = new class13(arg0, (byte) 3);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method227();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method227();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method213() >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class39 var17 = class39.method409(var6);
                        if (var14 != 22 || !field1656 || var17.field1144 || var17.field1174) {
                            var4 &= var17.method416(0);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method227();
                if (var10 == 0) {
                    break;
                }
                var5.method213();
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(ILXNSGYTEG;[LZSRJFSKK;)V")
    public final void method568(int arg0, class63 arg1, class70[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1670[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1670[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method579(var110, (byte) 8, var111);
                        }
                    }
                }
            }
        }
        field1649 += (int) (Math.random() * 5.0D) - 2;
        if (field1649 < -8) {
            field1649 = -8;
        }
        if (field1649 > 8) {
            field1649 = 8;
        }
        field1660 += (int) (Math.random() * 5.0D) - 2;
        if (field1660 < -16) {
            field1660 = -16;
        }
        if (field1660 > 16) {
            field1660 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1651[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1654 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1653 - 1; var101++) {
                    int var102 = this.field1659[var5][var101 + 1][var56] - this.field1659[var5][var101 - 1][var56];
                    int var103 = this.field1659[var5][var101][var56 + 1] - this.field1659[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1673[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1654; var57++) {
                this.field1664[var57] = 0;
                this.field1665[var57] = 0;
                this.field1666[var57] = 0;
                this.field1667[var57] = 0;
                this.field1668[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1653 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1654; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1653) {
                        int var96 = this.field1661[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class57 var97 = class57.field1491[var96 - 1];
                            this.field1664[var61] += var97.field1500;
                            this.field1665[var61] += var97.field1498;
                            this.field1666[var61] += var97.field1499;
                            this.field1667[var61] += var97.field1501;
                            var10002 = this.field1668[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1653) {
                        int var99 = this.field1661[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class57 var100 = class57.field1491[var99 - 1];
                            this.field1664[var61] -= var100.field1500;
                            this.field1665[var61] -= var100.field1498;
                            this.field1666[var61] -= var100.field1499;
                            this.field1667[var61] -= var100.field1501;
                            var10002 = this.field1668[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1653 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1654 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1654) {
                            var62 += this.field1664[var68];
                            var63 += this.field1665[var68];
                            var64 += this.field1666[var68];
                            var65 += this.field1667[var68];
                            var66 += this.field1668[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1654) {
                            var62 -= this.field1664[var69];
                            var63 -= this.field1665[var69];
                            var64 -= this.field1666[var69];
                            var65 -= this.field1667[var69];
                            var66 -= this.field1668[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1654 - 1 && (!field1656 || (this.field1670[0][var58][var67] & 0x2) != 0 || (this.field1670[var5][var58][var67] & 0x10) == 0 && this.method553(var5, var58, 48536, var67) == field1657)) {
                            if (var5 < field1652) {
                                field1652 = var5;
                            }
                            int var70 = this.field1661[var5][var58][var67] & 0xFF;
                            int var71 = this.field1658[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1659[var5][var58][var67];
                                int var73 = this.field1659[var5][var58 + 1][var67];
                                int var74 = this.field1659[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1659[var5][var58][var67 + 1];
                                int var76 = this.field1673[var58][var67];
                                int var77 = this.field1673[var58 + 1][var67];
                                int var78 = this.field1673[var58 + 1][var67 + 1];
                                int var79 = this.field1673[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method555(var82, var83, var84);
                                    int var85 = field1649 + var82 & 0xFF;
                                    int var86 = field1660 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method555(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1676[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class57.field1491[var71 - 1].field1496) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1663[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class71.field1741[method561(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method492(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method561(var80, var76), method561(var80, var77), method561(var80, var78), method561(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1676[var5][var58][var67] + 1;
                                    byte var90 = this.field1650[var5][var58][var67];
                                    class57 var91 = class57.field1491[var71 - 1];
                                    int var92 = var91.field1494;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class71.method594(9, var92);
                                        var94 = -1;
                                    } else if (var91.field1493 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class71.field1741[this.method557(var91.field1502, 96)];
                                    } else {
                                        var94 = this.method555(var91.field1497, var91.field1498, var91.field1499);
                                        var93 = class71.field1741[this.method557(var91.field1502, 96)];
                                    }
                                    arg1.method492(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method561(var80, var76), method561(var80, var77), method561(var80, var78), method561(var80, var79), this.method557(var94, var76), this.method557(var94, var77), this.method557(var94, var78), this.method557(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1654 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1653 - 1; var60++) {
                    arg1.method491(var5, var60, var59, this.method553(var5, var60, 48536, var59));
                }
            }
        }
        arg1.method518(-555, -10, -50, -50);
        for (int var6 = 0; var6 < this.field1653; var6++) {
            for (int var47 = 0; var47 < this.field1654; var47++) {
                if ((this.field1670[1][var6][var47] & 0x2) == 2) {
                    arg1.method489(var6, (byte) 3, var47);
                }
            }
        }
        if (arg0 != 0) {
            this.field1648 = !this.field1648;
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1654; var12++) {
                    for (int var13 = 0; var13 <= this.field1653; var13++) {
                        if ((this.field1663[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1663[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1654 && (this.field1663[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1663[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1663[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1659[var17][var13][var14] - var21;
                                int var23 = this.field1659[var16][var13][var14];
                                class63.method490(var23, var14 * 128, var15 * 128 + 128, var13 * 128, 4, var13 * 128, var10, var22, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1663[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1663[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1663[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1653 && (this.field1663[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1663[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1663[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1659[var29][var26][var12] - var33;
                                int var35 = this.field1659[var28][var26][var12];
                                class63.method490(var35, var12 * 128, var12 * 128, var26 * 128, 4, var27 * 128 + 128, var10, var34, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1663[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1663[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1663[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1654 && (this.field1663[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1663[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field1653) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1663[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1659[var11][var38][var40];
                                class63.method490(var44, var40 * 128, var41 * 128 + 128, var38 * 128, 4, var39 * 128 + 128, var10, var44, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1663[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(II[LZSRJFSKK;[BLXNSGYTEG;B)V")
    public final void method569(int arg0, int arg1, class70[] arg2, byte[] arg3, class63 arg4, byte arg5) {
        class13 var7 = new class13(arg3, (byte) 3);
        if (arg5 != 5) {
            return;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method227();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method227();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method213();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1670[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class70 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg2[var20];
                    }
                    this.method559(var8, -42268, var14, var19, var17, var21, var18, var16, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "e", descriptor = "(II)I")
    private static final int method570(int arg0, int arg1) {
        int var2 = method565(arg0 - 1, arg1 - 1) + method565(arg0 + 1, arg1 - 1) + method565(arg0 - 1, arg1 + 1) + method565(arg0 + 1, arg1 + 1);
        int var3 = method565(arg0 - 1, arg1) + method565(arg0 + 1, arg1) + method565(arg0, arg1 - 1) + method565(arg0, arg1 + 1);
        int var4 = method565(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(ILXNSGYTEG;IILZSRJFSKK;III[[[III)V")
    public static final void method571(int arg0, class63 arg1, int arg2, int arg3, class70 arg4, int arg5, int arg6, int arg7, int[][][] arg8, int arg9, int arg10) {
        if (arg5 != 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg8[arg7][arg0][arg6];
        int var13 = arg8[arg7][arg0 + 1][arg6];
        int var14 = arg8[arg7][arg0 + 1][arg6 + 1];
        int var15 = arg8[arg7][arg0][arg6 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        class39 var17 = class39.method409(arg10);
        int var18 = (arg10 << 14) + (arg6 << 7) + arg0 + 1073741824;
        if (!var17.field1144) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg2 << 6) + arg3);
        if (arg3 == 22) {
            class68 var20;
            if (var17.field1143 == -1 && var17.field1182 == null) {
                var20 = var17.method413(22, arg2, var12, var13, var14, var15, -1);
            } else {
                var20 = new class15(arg10, var13, var12, 22, var17.field1143, var15, var14, arg2, 4, true);
            }
            arg1.method493(field1647, var16, var19, arg9, var18, var20, arg6, arg0);
            if (var17.field1140 && var17.field1144) {
                arg4.method579(arg0, (byte) 8, arg6);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class68 var40;
            if (var17.field1143 == -1 && var17.field1182 == null) {
                var40 = var17.method413(10, arg2, var12, var13, var14, var15, -1);
            } else {
                var40 = new class15(arg10, var13, var12, 10, var17.field1143, var15, var14, arg2, 4, true);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg3 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg2 == 1 || arg2 == 3) {
                    var42 = var17.field1141;
                    var43 = var17.field1146;
                } else {
                    var42 = var17.field1146;
                    var43 = var17.field1141;
                }
                arg1.method497(var43, arg6, arg0, var18, var42, arg9, var40, var19, var16, (byte) 59, var41);
            }
            if (var17.field1140) {
                arg4.method578(var17.field1141, arg0, arg6, field1655, var17.field1179, arg2, var17.field1146);
            }
        } else if (arg3 >= 12) {
            class68 var21;
            if (var17.field1143 == -1 && var17.field1182 == null) {
                var21 = var17.method413(arg3, arg2, var12, var13, var14, var15, -1);
            } else {
                var21 = new class15(arg10, var13, var12, arg3, var17.field1143, var15, var14, arg2, 4, true);
            }
            arg1.method497(1, arg6, arg0, var18, 1, arg9, var21, var19, var16, (byte) 59, 0);
            if (var17.field1140) {
                arg4.method578(var17.field1141, arg0, arg6, field1655, var17.field1179, arg2, var17.field1146);
            }
        } else if (arg3 == 0) {
            class68 var22;
            if (var17.field1143 == -1 && var17.field1182 == null) {
                var22 = var17.method413(0, arg2, var12, var13, var14, var15, -1);
            } else {
                var22 = new class15(arg10, var13, var12, 0, var17.field1143, var15, var14, arg2, 4, true);
            }
            arg1.method495(var18, 47915, arg9, arg0, null, var19, var16, arg6, 0, field1672[arg2], var22);
            if (var17.field1140) {
                arg4.method577(0, var17.field1179, arg0, arg6, arg2, arg3);
            }
        } else if (arg3 == 1) {
            class68 var23;
            if (var17.field1143 == -1 && var17.field1182 == null) {
                var23 = var17.method413(1, arg2, var12, var13, var14, var15, -1);
            } else {
                var23 = new class15(arg10, var13, var12, 1, var17.field1143, var15, var14, arg2, 4, true);
            }
            arg1.method495(var18, 47915, arg9, arg0, null, var19, var16, arg6, 0, field1671[arg2], var23);
            if (var17.field1140) {
                arg4.method577(0, var17.field1179, arg0, arg6, arg2, arg3);
            }
        } else if (arg3 == 2) {
            int var24 = arg2 + 1 & 0x3;
            class68 var25;
            class68 var26;
            if (var17.field1143 == -1 && var17.field1182 == null) {
                var25 = var17.method413(2, arg2 + 4, var12, var13, var14, var15, -1);
                var26 = var17.method413(2, var24, var12, var13, var14, var15, -1);
            } else {
                var25 = new class15(arg10, var13, var12, 2, var17.field1143, var15, var14, arg2 + 4, 4, true);
                var26 = new class15(arg10, var13, var12, 2, var17.field1143, var15, var14, var24, 4, true);
            }
            arg1.method495(var18, 47915, arg9, arg0, var26, var19, var16, arg6, field1672[var24], field1672[arg2], var25);
            if (var17.field1140) {
                arg4.method577(0, var17.field1179, arg0, arg6, arg2, arg3);
            }
        } else if (arg3 == 3) {
            class68 var27;
            if (var17.field1143 == -1 && var17.field1182 == null) {
                var27 = var17.method413(3, arg2, var12, var13, var14, var15, -1);
            } else {
                var27 = new class15(arg10, var13, var12, 3, var17.field1143, var15, var14, arg2, 4, true);
            }
            arg1.method495(var18, 47915, arg9, arg0, null, var19, var16, arg6, 0, field1671[arg2], var27);
            if (var17.field1140) {
                arg4.method577(0, var17.field1179, arg0, arg6, arg2, arg3);
            }
        } else if (arg3 == 9) {
            class68 var28;
            if (var17.field1143 == -1 && var17.field1182 == null) {
                var28 = var17.method413(arg3, arg2, var12, var13, var14, var15, -1);
            } else {
                var28 = new class15(arg10, var13, var12, arg3, var17.field1143, var15, var14, arg2, 4, true);
            }
            arg1.method497(1, arg6, arg0, var18, 1, arg9, var28, var19, var16, (byte) 59, 0);
            if (var17.field1140) {
                arg4.method578(var17.field1141, arg0, arg6, field1655, var17.field1179, arg2, var17.field1146);
            }
        } else {
            if (var17.field1154) {
                if (arg2 == 1) {
                    int var29 = var15;
                    var15 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var29;
                } else if (arg2 == 2) {
                    int var30 = var15;
                    var15 = var13;
                    var13 = var30;
                    int var31 = var14;
                    var14 = var12;
                    var12 = var31;
                } else if (arg2 == 3) {
                    int var32 = var15;
                    var15 = var12;
                    var12 = var13;
                    var13 = var14;
                    var14 = var32;
                }
            }
            if (arg3 == 4) {
                class68 var33;
                if (var17.field1143 == -1 && var17.field1182 == null) {
                    var33 = var17.method413(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var33 = new class15(arg10, var13, var12, 4, var17.field1143, var15, var14, 0, 4, true);
                }
                arg1.method496(0, arg0, arg9, arg6, 0, var33, field1672[arg2], var18, -562, arg2 * 512, var19, var16);
            } else if (arg3 == 5) {
                int var34 = 16;
                int var35 = arg1.method513(arg9, arg0, arg6);
                if (var35 > 0) {
                    var34 = class39.method409(var35 >> 14 & 0x7FFF).field1166;
                }
                class68 var36;
                if (var17.field1143 == -1 && var17.field1182 == null) {
                    var36 = var17.method413(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var36 = new class15(arg10, var13, var12, 4, var17.field1143, var15, var14, 0, 4, true);
                }
                arg1.method496(field1644[arg2] * var34, arg0, arg9, arg6, field1645[arg2] * var34, var36, field1672[arg2], var18, -562, arg2 * 512, var19, var16);
            } else if (arg3 == 6) {
                class68 var37;
                if (var17.field1143 == -1 && var17.field1182 == null) {
                    var37 = var17.method413(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var37 = new class15(arg10, var13, var12, 4, var17.field1143, var15, var14, 0, 4, true);
                }
                arg1.method496(0, arg0, arg9, arg6, 0, var37, 256, var18, -562, arg2, var19, var16);
            } else if (arg3 == 7) {
                class68 var38;
                if (var17.field1143 == -1 && var17.field1182 == null) {
                    var38 = var17.method413(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var38 = new class15(arg10, var13, var12, 4, var17.field1143, var15, var14, 0, 4, true);
                }
                arg1.method496(0, arg0, arg9, arg6, 0, var38, 512, var18, -562, arg2, var19, var16);
            } else if (arg3 == 8) {
                class68 var39;
                if (var17.field1143 == -1 && var17.field1182 == null) {
                    var39 = var17.method413(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var39 = new class15(arg10, var13, var12, 4, var17.field1143, var15, var14, 0, 4, true);
                }
                arg1.method496(0, arg0, arg9, arg6, 0, var39, 768, var18, -562, arg2, var19, var16);
            }
        }
    }
}
