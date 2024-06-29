import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 {

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    private int field1708 = 0;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[Lvd;")
    private class148[] field1690;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1693 = 0;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lja;")
    public static class62 field1696 = class30.method243(43, "mn");

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lja;")
    public static class62 field1689 = class30.method243(43, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1688 = -1;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1694 = 0;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Lde;")
    public static class27 field1699 = null;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field1711 = 0;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lja;")
    public static class62 field1700 = class30.method243(43, "(U(Y");

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lc;")
    public static class18 field1685 = new class18(64);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "J")
    private long field1687;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lvd;")
    private class148 field1704;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Lvd;")
    private class148 field1710;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lfe;")
    public static class41 field1684;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[I")
    public static int[] field1697;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLhe;)Z")
    public static final boolean method529(byte arg0, class54 arg1) {
        field1682++;
        if (arg1.field1301 == null) {
            return false;
        }
        int var2 = -120 % ((64 - arg0) / 38);
        for (int var3 = 0; var3 < arg1.field1301.length; var3++) {
            int var4 = class138.method1104(var3, arg1, -30);
            int var5 = arg1.field1238[var3];
            if (arg1.field1301[var3] == 2) {
                if (var4 >= var5) {
                    return false;
                }
            } else if (arg1.field1301[var3] == 3) {
                if (var4 <= var5) {
                    return false;
                }
            } else if (arg1.field1301[var3] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIIIII[Lwe;II[B)V")
    public static final void method530(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class155[] arg6, int arg7, int arg8, byte[] arg9) {
        if (arg0 >= -88) {
            method541((byte) 55);
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg5 + var15 > 0 && arg5 + var15 < 103) {
                    arg6[arg2].field3591[arg3 + var10][arg5 + var15] = class24.method192(arg6[arg2].field3591[arg3 + var10][arg5 + var15], -16777217);
                }
            }
        }
        class128 var11 = new class128(arg9);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 == var12 && var13 >= arg7 && var13 < arg7 + 8 && var14 >= arg4 && arg4 + 8 > var14) {
                        class13.method96(arg8, arg2, 22, var11, arg5 + class4.method18(arg8, var13 & 0x7, (byte) 126, var14 & 0x7), 0, 0, arg3 + class15.method106(arg8, var13 & 0x7, (byte) 105, var14 & 0x7));
                    } else {
                        class13.method96(0, 0, 22, var11, -1, 0, 0, -1);
                    }
                }
            }
        }
        field1683++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lvd;")
    public final class148 method531(int arg0) {
        field1686++;
        this.field1708 = 0;
        if (arg0 < 98) {
            method540(-77);
        }
        return this.method536(98);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Lic;")
    public static final class58 method532(int arg0) {
        class58 var1 = new class58();
        var1.field1433 = class23.field539[0];
        var1.field1436 = class17.field395[0];
        field1705++;
        var1.field1437 = class16.field377;
        var1.field1435 = class57.field1397[0];
        var1.field1434 = class10.field256;
        byte[] var2 = class82.field1986[0];
        var1.field1431 = class143.field3335[arg0];
        int var3 = var1.field1436 * var1.field1433;
        var1.field1432 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field1432[var4] = class136.field3146[class24.method192(255, var2[var4])];
        }
        class142.method1125(arg0 ^ 0x86D);
        return var1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BII)Lhe;")
    public static final class54 method533(byte arg0, int arg1, int arg2) {
        field1709++;
        int var3 = 61 % ((-arg0 - 25) / 47);
        class54 var4 = class62.method456(arg2, (byte) 109);
        if (arg1 == -1) {
            return var4;
        } else if (var4 == null || var4.field1325 == null || arg1 >= var4.field1325.length) {
            return null;
        } else {
            return var4.field1325[arg1];
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)Lvd;")
    public final class148 method534(byte arg0) {
        field1695++;
        if (arg0 > -73) {
            method532(-125);
        }
        if (this.field1704 == null) {
            return null;
        }
        class148 var2 = this.field1690[(int) (this.field1687 & (long) (this.field1702 - 1))];
        while (this.field1704 != var2) {
            if (this.field1704.field3493 == this.field1687) {
                class148 var3 = this.field1704;
                this.field1704 = this.field1704.field3485;
                return var3;
            }
            this.field1704 = this.field1704.field3485;
        }
        this.field1704 = null;
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lqe;")
    public static final class116 method535(int arg0) {
        field1703++;
        try {
            int var1 = 18 / ((arg0 + 75) / 36);
            return (class116) Class.forName("gb").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)Lvd;")
    public final class148 method536(int arg0) {
        field1698++;
        if (arg0 != 98) {
            return null;
        } else if (this.field1708 <= 0 || this.field1690[this.field1708 - 1] == this.field1710) {
            while (this.field1708 < this.field1702) {
                class148 var3 = this.field1690[this.field1708++].field3485;
                if (this.field1690[this.field1708 - 1] != var3) {
                    this.field1710 = var3.field3485;
                    return var3;
                }
            }
            return null;
        } else {
            class148 var2 = this.field1710;
            this.field1710 = var2.field3485;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IJ)Lvd;")
    public final class148 method537(int arg0, long arg1) {
        field1701++;
        this.field1687 = arg1;
        class148 var4 = this.field1690[(int) ((long) (this.field1702 + arg0) & arg1)];
        for (this.field1704 = var4.field3485; this.field1704 != var4; this.field1704 = this.field1704.field3485) {
            if (this.field1704.field3493 == arg1) {
                class148 var5 = this.field1704;
                this.field1704 = this.field1704.field3485;
                return var5;
            }
        }
        this.field1704 = null;
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lvd;BJ)V")
    public final void method538(class148 arg0, byte arg1, long arg2) {
        field1691++;
        if (arg0.field3491 != null) {
            arg0.method1176((byte) -125);
        }
        if (arg1 != -27) {
            return;
        }
        class148 var5 = this.field1690[(int) ((long) (this.field1702 - 1) & arg2)];
        arg0.field3491 = var5.field3491;
        arg0.field3485 = var5;
        arg0.field3493 = arg2;
        arg0.field3491.field3485 = arg0;
        arg0.field3485.field3491 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static final void method539(boolean arg0) {
        class94.field2215.method50((byte) -102);
        class43.field1011 = 1;
        class15.field368 = null;
        field1706++;
        if (arg0) {
            field1685 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static void method540(int arg0) {
        field1697 = null;
        int var1 = -24 % ((arg0 + 53) / 48);
        field1696 = null;
        field1685 = null;
        field1689 = null;
        field1684 = null;
        field1700 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static final void method541(byte arg0) {
        if (class113.field2603[98]) {
            class141.field3306 += (12 - class141.field3306) / 2;
        } else if (class113.field2603[99]) {
            class141.field3306 += (-class141.field3306 - 12) / 2;
        } else {
            class141.field3306 /= 2;
        }
        if (class113.field2603[96]) {
            class31.field756 += (-class31.field756 - 24) / 2;
        } else if (class113.field2603[97]) {
            class31.field756 += (24 - class31.field756) / 2;
        } else {
            class31.field756 /= 2;
        }
        field1707++;
        class65.field1597 += class141.field3306 / 2;
        class62.field1495 = class62.field1495 + class31.field756 / 2 & 0x7FF;
        int var1 = class70.field1772 + class40.field936.field136;
        int var2 = class40.field936.field134 + class97.field2253;
        if (class47.field1079 - var1 < -500 || class47.field1079 - var1 > 500 || class23.field567 - var2 < -500 || class23.field567 - var2 > 500) {
            class47.field1079 = var1;
            class23.field567 = var2;
        }
        int var3 = 0;
        if (class65.field1597 < 128) {
            class65.field1597 = 128;
        }
        if (arg0 > -115) {
            return;
        }
        if (class23.field567 != var2) {
            class23.field567 += (var2 - class23.field567) / 16;
        }
        int var4 = class23.field567 >> 7;
        if (class65.field1597 > 383) {
            class65.field1597 = 383;
        }
        if (class47.field1079 != var1) {
            class47.field1079 += (var1 - class47.field1079) / 16;
        }
        int var5 = class47.field1079 >> 7;
        int var6 = class111.method908(128, class47.field1079, class23.field567, class155.field3598);
        if (var5 > 3 && var4 > 3 && var5 < 100 && var4 < 100) {
            for (int var7 = var5 - 4; var7 <= var5 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class155.field3598;
                    if (var9 < 3 && (class155.field3581[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class7.field214[var9][var7][var8];
                    if (var3 < var10) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class80.field1948 < var11) {
            class80.field1948 += (var11 - class80.field1948) / 24;
        } else if (class80.field1948 > var11) {
            class80.field1948 += (var11 - class80.field1948) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
    public class68(int arg0) {
        this.field1702 = arg0;
        this.field1690 = new class148[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class148 var3 = this.field1690[var2] = new class148();
            var3.field3485 = var3;
            var3.field3491 = var3;
        }
    }
}
