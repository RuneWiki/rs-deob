import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class97 {

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lac;")
    private class198 field1641 = new class198();

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "Lac;")
    private class198 field1649 = new class198();

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "Lac;")
    private class198 field1652 = new class198();

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "Lac;")
    private class198 field1653 = new class198();

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "Lrg;")
    private class239 field1655 = new class239(4);

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public volatile int field1660 = 0;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public volatile int field1661 = 0;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "B")
    private byte field1662 = 0;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "Lrg;")
    private class239 field1659 = new class239(8);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lmb;")
    private static class96 field1632 = class243.method1708("Walk here", (byte) 101);

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lmb;")
    public static class96 field1644 = class243.method1708("3D)2Softwarebibliothek gestartet)3", (byte) 120);

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field1639 = -1;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Lmb;")
    public static class96 field1650 = field1632;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "J")
    private long field1658;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Ljk;")
    private class236 field1657;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lff;")
    public static class3 field1634;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Lvf;")
    private class52 field1663;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([IIIIII)V")
    public static final void method724(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class187 var6 = class259.field4487[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class250 var7 = var6.field3283;
        if (var7 != null) {
            int var8 = var7.field4318;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class66 var10 = var6.field3266;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1129;
        int var12 = var10.field1124;
        int var13 = var10.field1120;
        int var14 = var10.field1126;
        int[] var15 = class114.field2116[var11];
        int[] var16 = class235.field4028[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Z")
    public final boolean method725(byte arg0) {
        if (arg0 > -91) {
            return true;
        } else {
            field1635++;
            return this.method736(123) >= 20;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)I")
    private final int method726(byte arg0) {
        if (arg0 != -28) {
            this.field1649 = null;
        }
        field1646++;
        return this.field1652.method1383(arg0 + 28) + this.field1653.method1383(0);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
    public static void method727(byte arg0) {
        field1650 = null;
        if (arg0 > -10) {
            method724((int[]) null, 54, -28, 83, -56, 2);
        }
        field1632 = null;
        field1644 = null;
        field1634 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method728(int arg0) {
        if (this.field1657 != null) {
            this.field1657.method1601((byte) 15);
        }
        int var2 = -53 % ((arg0 + 69) / 44);
        field1654++;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Z")
    public final boolean method729(int arg0) {
        if (arg0 != 4513) {
            this.field1649 = null;
        }
        if (this.field1657 != null) {
            long var2 = class155.method1133(123);
            int var4 = (int) (var2 - this.field1658);
            this.field1658 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1656 += var4;
            if (this.field1656 > 30000) {
                try {
                    this.field1657.method1605(arg0 ^ 0xFFFFEE3A);
                } catch (Exception var27) {
                }
                this.field1657 = null;
            }
        }
        field1642++;
        if (this.field1657 == null) {
            return this.method736(arg0 - 4411) == 0 && this.method726((byte) -28) == 0;
        }
        try {
            this.field1657.method1607(1);
            for (class52 var5 = (class52) this.field1641.method1391(arg0 - 4593); var5 != null; var5 = (class52) this.field1641.method1382(-1)) {
                this.field1655.field4124 = 0;
                this.field1655.method1652(1, (byte) 41);
                this.field1655.method1638((int) var5.field1664, (byte) 75);
                this.field1657.method1599(true, 4, this.field1655.field4144, 0);
                this.field1649.method1390(var5, arg0 ^ 0xFFFFEE3D);
            }
            for (class52 var6 = (class52) this.field1652.method1391(-74); var6 != null; var6 = (class52) this.field1652.method1382(-1)) {
                this.field1655.field4124 = 0;
                this.field1655.method1652(0, (byte) 41);
                this.field1655.method1638((int) var6.field1664, (byte) 73);
                this.field1657.method1599(true, 4, this.field1655.field4144, 0);
                this.field1653.method1390(var6, -120);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1657.method1598(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1656 = 0;
                byte var9 = 0;
                if (this.field1663 == null) {
                    var9 = 8;
                } else if (this.field1663.field913 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field1663.field904.field4144.length - this.field1663.field909;
                    int var11 = 512 - this.field1663.field913;
                    if (var11 > (var10 - this.field1663.field904.field4124)) {
                        var11 = var10 - this.field1663.field904.field4124;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field1657.method1603(2000, this.field1663.field904.field4144, this.field1663.field904.field4124, var11);
                    if (this.field1662 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1663.field904.field4144[this.field1663.field904.field4124 + var12] = (byte) class94.method657(this.field1663.field904.field4144[this.field1663.field904.field4124 + var12], this.field1662);
                        }
                    }
                    this.field1663.field904.field4124 += var11;
                    this.field1663.field913 += var11;
                    if (this.field1663.field904.field4124 == var10) {
                        this.field1663.method740(-22949);
                        this.field1663.field2403 = false;
                        this.field1663 = null;
                    } else if (this.field1663.field913 == 512) {
                        this.field1663.field913 = 0;
                    }
                } else {
                    int var13 = var9 - this.field1659.field4124;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field1657.method1603(2000, this.field1659.field4144, this.field1659.field4124, var13);
                    if (this.field1662 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field1659.field4144[this.field1659.field4124 + var14] = (byte) class94.method657(this.field1659.field4144[this.field1659.field4124 + var14], this.field1662);
                        }
                    }
                    this.field1659.field4124 += var13;
                    if (this.field1659.field4124 >= var9) {
                        if (this.field1663 == null) {
                            this.field1659.field4124 = 0;
                            int var15 = this.field1659.method1651(4139);
                            int var16 = this.field1659.method1663((byte) -50);
                            long var17 = (long) ((var15 << 16) + var16);
                            int var19 = this.field1659.method1651(arg0 ^ 0x18A);
                            boolean var20 = (var19 & 0x80) != 0;
                            int var21 = this.field1659.method1617((byte) -43);
                            int var22 = var19 & 0x7F;
                            Object var23 = null;
                            class52 var24;
                            if (var20) {
                                for (var24 = (class52) this.field1653.method1391(62); var24 != null && var24.field1664 != var17; var24 = (class52) this.field1653.method1382(-1)) {
                                }
                            } else {
                                for (var24 = (class52) this.field1649.method1391(-92); var24 != null && var24.field1664 != var17; var24 = (class52) this.field1649.method1382(-1)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field1663 = var24;
                            int var25 = var22 == 0 ? 5 : 9;
                            this.field1663.field904 = new class239(this.field1663.field909 + var21 + var25);
                            this.field1663.field904.method1652(var22, (byte) 41);
                            this.field1663.field904.method1625((byte) 48, var21);
                            this.field1659.field4124 = 0;
                            this.field1663.field913 = 8;
                        } else if (this.field1663.field913 != 0) {
                            throw new IOException();
                        } else if (this.field1659.field4144[0] == -1) {
                            this.field1659.field4124 = 0;
                            this.field1663.field913 = 1;
                        } else {
                            this.field1663 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1657.method1605(-112);
            } catch (Exception var26) {
            }
            this.field1661 = -2;
            this.field1660++;
            this.field1657 = null;
            return this.method736(72) == 0 && this.method726((byte) -28) == 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)Z")
    public final boolean method730(int arg0) {
        field1651++;
        if (arg0 == 20) {
            return this.method726((byte) -28) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    private final void method731(int arg0) {
        field1637++;
        if (this.field1657 == null) {
            return;
        }
        try {
            this.field1655.field4124 = arg0;
            this.field1655.method1652(6, (byte) 41);
            this.field1655.method1638(3, (byte) 99);
            this.field1657.method1599(true, 4, this.field1655.field4144, 0);
        } catch (IOException var3) {
            try {
                this.field1657.method1605(48);
            } catch (Exception var2) {
            }
            this.field1661 = -2;
            this.field1660++;
            this.field1657 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public final void method732(int arg0) {
        if (arg0 == 4096) {
            if (this.field1657 != null) {
                this.field1657.method1605(92);
            }
            field1645++;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBBZ)Lvf;")
    public final class52 method733(int arg0, int arg1, byte arg2, byte arg3, boolean arg4) {
        field1648++;
        long var6 = (long) ((arg0 << 16) + arg1);
        class52 var8 = new class52();
        var8.field2400 = arg4;
        var8.field1664 = var6;
        var8.field909 = arg2;
        if (arg3 != 120) {
            this.method734(false, 106);
        }
        if (arg4) {
            if (this.method736(104) >= 20) {
                throw new RuntimeException();
            }
            this.field1641.method1390(var8, -64);
        } else if (this.method726((byte) -28) < 20) {
            this.field1652.method1390(var8, -95);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
    public final void method734(boolean arg0, int arg1) {
        field1636++;
        if (this.field1657 == null) {
            return;
        }
        try {
            this.field1655.field4124 = 0;
            this.field1655.method1652(arg0 ? 2 : 3, (byte) 41);
            this.field1655.method1638(0, (byte) 75);
            this.field1657.method1599(true, 4, this.field1655.field4144, 0);
        } catch (IOException var4) {
            try {
                this.field1657.method1605(99);
            } catch (Exception var3) {
            }
            this.field1661 = -2;
            this.field1657 = null;
            this.field1660++;
        }
        if (arg1 <= 62) {
            this.field1660 = 6;
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
    public final void method735(int arg0) {
        field1640++;
        if (this.field1657 == null || arg0 != 820) {
            return;
        }
        try {
            this.field1655.field4124 = 0;
            this.field1655.method1652(7, (byte) 41);
            this.field1655.method1638(0, (byte) 76);
            this.field1657.method1599(true, 4, this.field1655.field4144, 0);
        } catch (IOException var3) {
            try {
                this.field1657.method1605(-88);
            } catch (Exception var2) {
            }
            this.field1660++;
            this.field1657 = null;
            this.field1661 = -2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)I")
    public final int method736(int arg0) {
        field1643++;
        if (arg0 <= 51) {
            field1634 = null;
        }
        return this.field1641.method1383(0) + this.field1649.method1383(0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLrg;)V")
    public static final void method737(boolean arg0, class239 arg1) {
        if (arg0) {
            return;
        }
        field1638++;
        while (true) {
            while (arg1.field4124 < arg1.field4144.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1651(4139) == 1) {
                    var2 = true;
                    var4 = arg1.method1651(4139);
                    var3 = arg1.method1651(4139);
                }
                int var5 = arg1.method1651(4139);
                int var6 = arg1.method1651(4139);
                int var7 = class146.field2592 + class176.field3068 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class179.field3091;
                if (var8 >= 0 && var7 - 63 >= 0 && class140.field2500 > var8 + 63 && var7 < class176.field3068) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var4 * 8 <= var11 && var4 * 8 + 8 > var11 && var3 * 8 <= var12 && var12 < var3 * 8 + 8) {
                                int var13 = arg1.method1651(4139);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1651(4139);
                                        if (class9.field159[var9][var10] == null) {
                                            class9.field159[var9][var10] = new byte[4096];
                                        }
                                        class9.field159[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1663((byte) -116);
                                        if (class106.field1807[var9][var10] == null) {
                                            class106.field1807[var9][var10] = new short[4096];
                                        }
                                        class106.field1807[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg1.method1651(4139) & 0xFF) << 16) + ((arg1.method1651(4139) & 0xFF << 8) + (arg1.method1651(4139) & 0xFF));
                                        if (class207.field3574[var9][var10] == null) {
                                            class207.field3574[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class196 var17 = class132.method995(var16, 0);
                                        if (var17.field3408 != null) {
                                            var17 = var17.method1377((byte) 31);
                                            if (var17 == null || var17.field3402 == -1) {
                                                continue;
                                            }
                                        }
                                        class207.field3574[var9][var10][(63 - var12 << 6) + var11] = var17.field3367 + 1;
                                        class224 var18 = new class224();
                                        var18.field3811 = var7;
                                        var18.field3809 = var17.field3402;
                                        var18.field3803 = var8;
                                        class54.field943.method1814(1, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1651(4139);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field4124++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field4124 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field4124 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljk;IZ)V")
    public final void method738(class236 arg0, int arg1, boolean arg2) {
        field1647++;
        if (this.field1657 != null) {
            try {
                this.field1657.method1605(72);
            } catch (Exception var8) {
            }
            this.field1657 = null;
        }
        if (arg1 < 72) {
            this.field1652 = null;
        }
        this.field1657 = arg0;
        this.method731(0);
        this.method734(arg2, 123);
        this.field1663 = null;
        this.field1659.field4124 = 0;
        while (true) {
            class52 var4 = (class52) this.field1649.method1385((byte) 51);
            if (var4 == null) {
                while (true) {
                    class52 var5 = (class52) this.field1653.method1385((byte) -67);
                    if (var5 == null) {
                        if (this.field1662 != 0) {
                            try {
                                this.field1655.field4124 = 0;
                                this.field1655.method1652(4, (byte) 41);
                                this.field1655.method1652(this.field1662, (byte) 41);
                                this.field1655.method1632(true, 0);
                                this.field1657.method1599(true, 4, this.field1655.field4144, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field1657.method1605(57);
                                } catch (Exception var6) {
                                }
                                this.field1657 = null;
                                this.field1660++;
                                this.field1661 = -2;
                            }
                        }
                        this.field1656 = 0;
                        this.field1658 = class155.method1133(123);
                        return;
                    }
                    this.field1652.method1390(var5, -116);
                }
            }
            this.field1641.method1390(var4, -97);
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V")
    public final void method739(byte arg0) {
        try {
            this.field1657.method1605(-95);
            if (arg0 != -14) {
                this.field1662 = -118;
            }
        } catch (Exception var2) {
        }
        this.field1661 = -1;
        this.field1660++;
        this.field1657 = null;
        field1631++;
        this.field1662 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }
}
