import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class79 {

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    private int field1615 = 0;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    private int field1595 = 0;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[[I")
    public int[][] field1592;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Lob;")
    public static class141 field1584 = class175.method1195(40, "me");

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "Lob;")
    public static class141 field1598 = class175.method1195(40, "sch-Utteln:");

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Lob;")
    private static class141 field1599 = class175.method1195(40, "Error loading your profile)3");

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "Lob;")
    private static class141 field1605 = class175.method1195(40, "Members only world");

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Lob;")
    public static class141 field1608 = field1599;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "Lob;")
    private static class141 field1611 = class175.method1195(40, "Loaded update list");

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lob;")
    public static class141 field1589 = field1605;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lob;")
    public static class141 field1591 = field1611;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "Lob;")
    public static class141 field1614 = class175.method1195(40, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "Lca;")
    public static class22 field1612;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public final void method544(byte arg0) {
        int var2 = -64 / ((arg0 - 55) / 55);
        for (int var3 = 0; var3 < this.field1606; var3++) {
            for (int var4 = 0; var4 < this.field1613; var4++) {
                if (var3 == 0 || var4 == 0 || this.field1606 - 5 <= var3 || var4 >= this.field1613 - 5) {
                    this.field1592[var3][var4] = 16777215;
                } else {
                    this.field1592[var3][var4] = 16777216;
                }
            }
        }
        field1590++;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
    public static void method545(byte arg0) {
        field1589 = null;
        field1611 = null;
        field1605 = null;
        field1598 = null;
        field1614 = null;
        field1591 = null;
        field1599 = null;
        field1608 = null;
        field1612 = null;
        field1584 = null;
        if (arg0 > -58) {
            field1584 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([IIIIIII)V")
    public static final void method546(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class12.field230 = arg5;
        class1.field4 = new boolean[8][32][class12.field230 + class12.field230 + 1][class12.field230 + class12.field230 + 1];
        class30.field579 = 0;
        class10.field188 = 0;
        class169.field3256 = arg3;
        class116.field2245 = arg4;
        class210.field3996 = arg3 / 2;
        class5.field62 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class12.field230 + class12.field230 + 3][class12.field230 + class12.field230 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class104.field2005 = class44.field854[var8];
                class119.field2311 = class44.field843[var8];
                class215.field4095 = class44.field854[var16];
                class151.field2903 = class44.field843[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class12.field230 + 1); var19 <= class12.field230 + 1; var19++) {
                    for (int var20 = -(class12.field230 + 1); var20 <= class12.field230 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class172.method1183(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class12.field230 + var19 + 1][class12.field230 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class12.field230; var11 < class12.field230; var11++) {
                    for (int var12 = -class12.field230; var12 < class12.field230; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class12.field230 + 1][var12 + var15 + class12.field230 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class12.field230 + 1][var12 + var15 + class12.field230 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class12.field230 + 1][var12 + var15 + class12.field230 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class12.field230 + 1][var12 + var15 + class12.field230 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class1.field4[var9][var10][class12.field230 + var11][class12.field230 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V")
    private final void method547(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 102 / ((78 - arg3) / 35);
        this.field1592[arg0][arg2] = class15.method94(this.field1592[arg0][arg2], ~arg1);
        field1607++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V")
    public final void method548(byte arg0, int arg1, int arg2) {
        field1604++;
        int var4 = arg1 - this.field1615;
        if (arg0 != 70) {
            this.field1606 = 63;
        }
        int var5 = arg2 - this.field1595;
        this.field1592[var4][var5] = class57.method389(this.field1592[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZIIB)V")
    public final void method549(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        int var7 = arg3 - this.field1595;
        int var8 = arg4 - this.field1615;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        field1610++;
        if (arg5 >= -14) {
            this.method555(-44, -59, true, -107, -37, -61);
        }
        for (int var10 = var8; var10 < arg0 + var8; var10++) {
            if (var10 >= 0 && var10 < this.field1606) {
                for (int var11 = var7; var11 < arg1 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field1613) {
                        this.method553((byte) -86, var9, var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIZIII)V")
    public final void method550(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field1615;
        field1600++;
        if (arg6 == 1 || arg6 == 3) {
            int var9 = arg4;
            arg4 = arg5;
            arg5 = var9;
        }
        int var10 = 256;
        if (arg1) {
            var10 += 131072;
        }
        int var11 = arg0 - this.field1595;
        if (!arg3) {
            field1594 = 29;
        }
        for (int var12 = var8; var12 < arg4 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field1606) {
                for (int var13 = var11; var13 < arg5 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field1613) {
                        this.method547(var12, var10, var13, -11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1601++;
        if (arg3 != 16816) {
            this.method549(103, -42, false, -46, -86, (byte) -78);
        }
        if (arg0 == arg4 && arg2 == arg6) {
            return true;
        }
        int var8 = arg4 - this.field1615;
        int var9 = arg2 - this.field1595;
        int var10 = arg0 - this.field1615;
        int var11 = arg6 - this.field1595;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var8 + 1 == var10 && var9 == var11 && (this.field1592[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1592[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1592[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1592[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1592[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1592[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 + 1 == var10 && var9 == var11 && (this.field1592[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1592[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1592[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1592[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field1592[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field1592[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1588++;
        int var9 = arg0 + arg7 + arg4;
        int var10 = arg1 + arg3 - 1;
        if (arg2 >= arg3 && arg2 <= var10 && arg4 <= arg5 && var9 >= arg5) {
            return true;
        } else if (arg3 - 1 == arg2 && arg5 >= arg4 && arg5 <= var9 && (this.field1592[arg2 - this.field1615][arg5 - this.field1595] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg4 <= arg5 && arg5 <= var9 && (this.field1592[arg2 - this.field1615][arg5 - this.field1595] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg5 && arg3 <= arg2 && var10 >= arg2 && (this.field1592[arg2 - this.field1615][arg5 - this.field1595] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg5 && arg3 <= arg2 && var10 >= arg2 && (this.field1592[arg2 - this.field1615][arg5 - this.field1595] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIII)V")
    private final void method553(byte arg0, int arg1, int arg2, int arg3) {
        field1587++;
        this.field1592[arg2][arg3] = class57.method389(this.field1592[arg2][arg3], arg1);
        if (arg0 > -42) {
            method546(null, -122, -55, -72, 86, -36, 79);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILob;)I")
    public static final int method554(int arg0, class141 arg1) {
        int var2 = 24 / ((28 - arg0) / 49);
        field1596++;
        return arg1.method908(false) + 1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZIII)V")
    public final void method555(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field1615;
        field1602++;
        int var8 = arg4 - this.field1595;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method553((byte) -120, 128, var7, var8);
                this.method553((byte) -62, 8, var7 - 1, var8);
            }
            if (arg1 == 1) {
                this.method553((byte) -76, 2, var7, var8);
                this.method553((byte) -86, 32, var7, var8 + 1);
            }
            if (arg1 == 2) {
                this.method553((byte) -97, 8, var7, var8);
                this.method553((byte) -126, 128, var7 + 1, var8);
            }
            if (arg1 == 3) {
                this.method553((byte) -76, 32, var7, var8);
                this.method553((byte) -64, 2, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method553((byte) -125, 1, var7, var8);
                this.method553((byte) -88, 16, var7 - 1, var8 - -1);
            }
            if (arg1 == 1) {
                this.method553((byte) -76, 4, var7, var8);
                this.method553((byte) -85, 64, var7 + 1, var8 - -1);
            }
            if (arg1 == 2) {
                this.method553((byte) -44, 16, var7, var8);
                this.method553((byte) -105, 1, var7 + 1, var8 + -1);
            }
            if (arg1 == 3) {
                this.method553((byte) -72, 64, var7, var8);
                this.method553((byte) -46, 4, var7 - 1, var8 - 1);
            }
        }
        if (arg5 != -4) {
            field1605 = null;
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method553((byte) -110, 130, var7, var8);
                this.method553((byte) -102, 8, var7 - 1, var8);
                this.method553((byte) -127, 32, var7, var8 + 1);
            }
            if (arg1 == 1) {
                this.method553((byte) -92, 10, var7, var8);
                this.method553((byte) -100, 32, var7, var8 + 1);
                this.method553((byte) -126, 128, var7 + 1, var8);
            }
            if (arg1 == 2) {
                this.method553((byte) -125, 40, var7, var8);
                this.method553((byte) -76, 128, var7 + 1, var8);
                this.method553((byte) -52, 2, var7, var8 - 1);
            }
            if (arg1 == 3) {
                this.method553((byte) -50, 160, var7, var8);
                this.method553((byte) -73, 2, var7, var8 - 1);
                this.method553((byte) -95, 8, var7 - 1, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method553((byte) -66, 65536, var7, var8);
                this.method553((byte) -50, 4096, var7 - 1, var8);
            }
            if (arg1 == 1) {
                this.method553((byte) -93, 1024, var7, var8);
                this.method553((byte) -111, 16384, var7, var8 + 1);
            }
            if (arg1 == 2) {
                this.method553((byte) -74, 4096, var7, var8);
                this.method553((byte) -113, 65536, var7 + 1, var8);
            }
            if (arg1 == 3) {
                this.method553((byte) -120, 16384, var7, var8);
                this.method553((byte) -105, 1024, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method553((byte) -43, 512, var7, var8);
                this.method553((byte) -64, 8192, var7 - 1, var8 + 1);
            }
            if (arg1 == 1) {
                this.method553((byte) -59, 2048, var7, var8);
                this.method553((byte) -124, 32768, var7 + 1, var8 - -1);
            }
            if (arg1 == 2) {
                this.method553((byte) -115, 8192, var7, var8);
                this.method553((byte) -64, 512, var7 + 1, var8 + -1);
            }
            if (arg1 == 3) {
                this.method553((byte) -52, 32768, var7, var8);
                this.method553((byte) -59, 2048, var7 - 1, var8 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method553((byte) -106, 66560, var7, var8);
            this.method553((byte) -100, 4096, var7 - 1, var8);
            this.method553((byte) -124, 16384, var7, var8 + 1);
        }
        if (arg1 == 1) {
            this.method553((byte) -82, 5120, var7, var8);
            this.method553((byte) -53, 16384, var7, var8 + 1);
            this.method553((byte) -125, 65536, var7 + 1, var8);
        }
        if (arg1 == 2) {
            this.method553((byte) -117, 20480, var7, var8);
            this.method553((byte) -99, 65536, var7 + 1, var8);
            this.method553((byte) -45, 1024, var7, var8 - 1);
        }
        if (arg1 == 3) {
            this.method553((byte) -45, 81920, var7, var8);
            this.method553((byte) -84, 1024, var7, var8 - 1);
            this.method553((byte) -62, 4096, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public final void method556(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1615;
        field1616++;
        int var5 = arg2 - this.field1595;
        this.field1592[var4][var5] = class15.method94(this.field1592[var4][var5], -262145);
        if (arg0 != 31260) {
            field1614 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZIZI)V")
    public final void method557(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field1595;
        if (!arg2) {
            this.method544((byte) 29);
        }
        field1585++;
        int var8 = arg5 - this.field1615;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method547(var8, 128, var7, 15);
                this.method547(var8 - 1, 8, var7, 37);
            }
            if (arg1 == 1) {
                this.method547(var8, 2, var7, -27);
                this.method547(var8, 32, var7 + 1, -101);
            }
            if (arg1 == 2) {
                this.method547(var8, 8, var7, 120);
                this.method547(var8 + 1, 128, var7, 126);
            }
            if (arg1 == 3) {
                this.method547(var8, 32, var7, 122);
                this.method547(var8, 2, var7 - 1, 115);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method547(var8, 1, var7, -66);
                this.method547(var8 - 1, 16, var7 + 1, -127);
            }
            if (arg1 == 1) {
                this.method547(var8, 4, var7, 22);
                this.method547(var8 + 1, 64, var7 + 1, -24);
            }
            if (arg1 == 2) {
                this.method547(var8, 16, var7, -92);
                this.method547(var8 + 1, 1, var7 - 1, 123);
            }
            if (arg1 == 3) {
                this.method547(var8, 64, var7, 25);
                this.method547(var8 - 1, 4, var7 - 1, 117);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method547(var8, 130, var7, -99);
                this.method547(var8 - 1, 8, var7, -23);
                this.method547(var8, 32, var7 + 1, -127);
            }
            if (arg1 == 1) {
                this.method547(var8, 10, var7, 122);
                this.method547(var8, 32, var7 + 1, -24);
                this.method547(var8 + 1, 128, var7, -107);
            }
            if (arg1 == 2) {
                this.method547(var8, 40, var7, -83);
                this.method547(var8 + 1, 128, var7, -103);
                this.method547(var8, 2, var7 - 1, 116);
            }
            if (arg1 == 3) {
                this.method547(var8, 160, var7, 121);
                this.method547(var8, 2, var7 - 1, 127);
                this.method547(var8 - 1, 8, var7, -35);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method547(var8, 65536, var7, -118);
                this.method547(var8 - 1, 4096, var7, 115);
            }
            if (arg1 == 1) {
                this.method547(var8, 1024, var7, 122);
                this.method547(var8, 16384, var7 + 1, -84);
            }
            if (arg1 == 2) {
                this.method547(var8, 4096, var7, 123);
                this.method547(var8 + 1, 65536, var7, 124);
            }
            if (arg1 == 3) {
                this.method547(var8, 16384, var7, 118);
                this.method547(var8, 1024, var7 - 1, -114);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method547(var8, 512, var7, 125);
                this.method547(var8 - 1, 8192, var7 + 1, 123);
            }
            if (arg1 == 1) {
                this.method547(var8, 2048, var7, -118);
                this.method547(var8 + 1, 32768, var7 + 1, 121);
            }
            if (arg1 == 2) {
                this.method547(var8, 8192, var7, 125);
                this.method547(var8 + 1, 512, var7 - 1, -54);
            }
            if (arg1 == 3) {
                this.method547(var8, 32768, var7, -46);
                this.method547(var8 - 1, 2048, var7 - 1, -76);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method547(var8, 66560, var7, 119);
            this.method547(var8 - 1, 4096, var7, 121);
            this.method547(var8, 16384, var7 + 1, 119);
        }
        if (arg1 == 1) {
            this.method547(var8, 5120, var7, 118);
            this.method547(var8, 16384, var7 + 1, -18);
            this.method547(var8 + 1, 65536, var7, -5);
        }
        if (arg1 == 2) {
            this.method547(var8, 20480, var7, -115);
            this.method547(var8 + 1, 65536, var7, 117);
            this.method547(var8, 1024, var7 - 1, 114);
        }
        if (arg1 == 3) {
            this.method547(var8, 81920, var7, -43);
            this.method547(var8, 1024, var7 - 1, 113);
            this.method547(var8 - 1, 4096, var7, 34);
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZI)V")
    public final void method558(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            int var4 = arg2 - this.field1615;
            field1603++;
            int var5 = arg0 - this.field1595;
            this.field1592[var4][var5] = class57.method389(this.field1592[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
    public static final void method559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class35.field698 <= arg0 && arg0 <= class130.field2470) {
            int var5 = class106.method703(class68.field1323, class136.field2590, true, arg2);
            int var6 = class106.method703(class68.field1323, class136.field2590, true, arg3);
            class59.method398(arg0, var6, true, var5, arg4);
        }
        field1609++;
        if (arg1 <= 111) {
            field1608 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIZ)Z")
    public final boolean method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1586++;
        if (arg0 == arg3 && arg1 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field1595;
        if (!arg6) {
            field1591 = null;
        }
        int var9 = arg0 - this.field1615;
        int var10 = arg5 - this.field1595;
        int var11 = arg3 - this.field1615;
        if (arg2 == 0) {
            if (arg4 == 0) {
                if (var9 - 1 == var11 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field1592[var11][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field1592[var11][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 == var11 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var9 + 1 == var11 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field1592[var11][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field1592[var11][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 == var11 && var10 - 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                if (var9 - 1 == var11 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field1592[var11][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var11 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field1592[var11][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field1592[var11][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 - 1 == var11 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field1592[var11][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var9 == var11 && var10 + 1 == var8 && (this.field1592[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var10 - 1 == var8 && (this.field1592[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var11 && var8 == var10 && (this.field1592[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V")
    public class79(int arg0, int arg1) {
        this.field1606 = arg0;
        this.field1613 = arg1;
        this.field1592 = new int[this.field1606][this.field1613];
        this.method544((byte) -107);
    }
}
