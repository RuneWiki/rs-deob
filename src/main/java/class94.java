import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class94 extends class151 {

    @OriginalMember(owner = "client!b", name = "X", descriptor = "[B")
    public byte[] field1681;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "Lbd;")
    public static class162 field1669 = class17.method142(0, "details");

    @OriginalMember(owner = "client!b", name = "U", descriptor = "Lbd;")
    public static class162 field1678 = class17.method142(0, "Fps:");

    @OriginalMember(owner = "client!b", name = "S", descriptor = "Lbd;")
    private static class162 field1676 = class17.method142(0, "Thu");

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "Lbd;")
    private static class162 field1683 = class17.method142(0, "Sun");

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lbd;")
    private static class162 field1650 = class17.method142(0, "Wed");

    @OriginalMember(owner = "client!b", name = "T", descriptor = "Lbd;")
    private static class162 field1677 = class17.method142(0, "Tue");

    @OriginalMember(owner = "client!b", name = "W", descriptor = "Lbd;")
    private static class162 field1680 = class17.method142(0, "Sat");

    @OriginalMember(owner = "client!b", name = "Gb", descriptor = "Lbd;")
    private static class162 field1716 = class17.method142(0, "Mon");

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!b", name = "Bb", descriptor = "Lbd;")
    private static class162 field1711 = class17.method142(0, "Fri");

    @OriginalMember(owner = "client!b", name = "Ib", descriptor = "Lbd;")
    public static class162 field1718 = class17.method142(0, "<col=ffff00>");

    @OriginalMember(owner = "client!b", name = "Qb", descriptor = "I")
    public static int field1726 = -1;

    @OriginalMember(owner = "client!b", name = "Hb", descriptor = "[Lbd;")
    public static class162[] field1717 = new class162[] { field1683, field1716, field1677, field1650, field1676, field1711, field1680 };

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!b", name = "zb", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!b", name = "Ab", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!b", name = "Eb", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!b", name = "Fb", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!b", name = "Jb", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!b", name = "Kb", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!b", name = "Lb", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!b", name = "Mb", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!b", name = "Nb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!b", name = "Ob", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!b", name = "Pb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!b", name = "Rb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!b", name = "Sb", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "Lra;")
    public static class204 field1702;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I", line = 13)
    public final int method702(int arg0) {
        if (arg0 >= -31) {
            this.method745(59L, (byte) 41);
        }
        field1684++;
        int var2 = this.field1681[this.field1653] & 0xFF;
        return var2 >= 128 ? this.method761((byte) 108) - 49152 : this.method756(915905888) + -64;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V", line = 30)
    public final void method703(int arg0, byte arg1) {
        field1673++;
        this.field1681[this.field1653 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1681[this.field1653 - (arg0 + 3)] = (byte) (arg0 >> 16);
        if (arg1 != -103) {
            this.method718((byte) 44, 28);
        }
        this.field1681[this.field1653 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1681[this.field1653 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V", line = 45)
    public final void method704(boolean arg0, int arg1) {
        this.field1681[this.field1653++] = (byte) (arg1 >> 16);
        if (arg0) {
            field1716 = (class162) null;
        }
        field1652++;
        this.field1681[this.field1653++] = (byte) (arg1 >> 24);
        this.field1681[this.field1653++] = (byte) arg1;
        this.field1681[this.field1653++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)J", line = 59)
    public final long method705(int arg0, int arg1) {
        field1662++;
        if (arg0 != 7606) {
            field1683 = (class162) null;
        }
        int var6 = arg1 - 1;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        int var3 = var6 * 8;
        long var4 = 0L;
        while (var3 >= 0) {
            var4 |= ((long) this.field1681[this.field1653++] & 0xFFL) << var3;
            var3 -= 8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lbd;IZ)V", line = 90)
    public static final void method706(class162 arg0, int arg1, boolean arg2) {
        field1720++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class286.field4831.method1892(arg0, 250);
        int var7 = class286.field4831.method1879(arg0, 250) * 13;
        if (class117.field2159) {
            class16.method124(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var7 + var3, 0);
            class16.method128(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3, 16777215);
        } else {
            class316.method2174(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 + var3, 0);
            class316.method2160(var5 - var3, -var3 + var4, var6 + var3 + var3, var3 + var7 - -var3, 16777215);
        }
        class286.field4831.method1887(arg0, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        int var8 = -18 / ((arg1 + 79) / 33);
        class222.method1608(var4 - var3, var3 + var7 + var3, 107, var6 + var3 + var3, -var3 + var5);
        if (!arg2) {
            class32.method261(var4, 0, var7, var5, var6);
        } else if (class117.field2159) {
            class117.method965();
        } else {
            try {
                Graphics var9 = class308.field5173.getGraphics();
                class139.field2484.method10((byte) 114, var9, 0, 0);
            } catch (Exception var11) {
                class308.field5173.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I", line = 145)
    public final int method707(int arg0) {
        if (arg0 != 2) {
            this.method705(-97, -42);
        }
        field1688++;
        return this.field1681[this.field1653++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V", line = 162)
    public final void method708(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field1653;
        this.field1653 = 0;
        field1693++;
        byte[] var5 = new byte[var4];
        this.method726(arg0 - 35363, var5, 0, var4);
        if (arg0 != 4096) {
            return;
        }
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field1653 = 0;
        this.method753(var8.length, true);
        this.method720(var8.length, var8, 0, -112);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V", line = 187)
    public final void method709(byte arg0, int arg1) {
        field1704++;
        if (arg0 > -86) {
            field1669 = (class162) null;
        }
        if ((arg1 & 0xFFFFFF80) != 0) {
            if ((arg1 & 0xFFFFC000) != 0) {
                if ((arg1 & 0xFFE00000) != 0) {
                    if ((arg1 & 0xF0000000) != 0) {
                        this.method753(arg1 >>> 28 | 0x80, true);
                    }
                    this.method753(arg1 >>> 21 | 0x80, true);
                }
                this.method753((arg1 | 0x2034F6) >>> 14, true);
            }
            this.method753((arg1 | 0x4072) >>> 7, true);
        }
        this.method753(arg1 & 0x7F, true);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(FI)V", line = 220)
    public final void method710(float arg0, int arg1) {
        field1670++;
        int var3 = Float.floatToRawIntBits(arg0);
        this.field1681[this.field1653++] = (byte) (var3 >> 24);
        this.field1681[this.field1653++] = (byte) (var3 >> 16);
        if (arg1 > -94) {
            this.method705(-63, -128);
        }
        this.field1681[this.field1653++] = (byte) (var3 >> 8);
        this.field1681[this.field1653++] = (byte) var3;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)I", line = 235)
    public final int method711(int arg0) {
        field1657++;
        this.field1653 += 2;
        return arg0 == 255 ? (this.field1681[this.field1653 - 1] & 0xFF << 8) + (this.field1681[this.field1653 - 2] - 128 & 0xFF) : -123;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)Lbd;", line = 252)
    public final class162 method712(byte arg0) {
        byte var2 = this.field1681[this.field1653++];
        int var3 = -53 % ((arg0 - 56) / 59);
        field1659++;
        if (var2 != 0) {
            throw new IllegalStateException("Bad version number in gjstr2");
        }
        int var4 = this.field1653;
        while (this.field1681[this.field1653++] != 0) {
        }
        return class95.method768(this.field1653 - var4 - 1, var4, this.field1681, (byte) 117);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V", line = 274)
    public final void method713(int arg0, int arg1) {
        field1675++;
        if (arg0 != 255) {
            field1711 = (class162) null;
        }
        if (arg1 >= 0 && arg1 < 128) {
            this.method753(arg1, true);
        } else if (arg1 >= 0 && arg1 < 32768) {
            this.method751(arg1 + 32768, -1044017976);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)I", line = 299)
    public final int method714(byte arg0) {
        field1686++;
        return arg0 == 34 ? 128 - this.field1681[this.field1653++] & 0xFF : -93;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I", line = 310)
    public final int method715(int arg0) {
        this.field1653 += 2;
        field1703++;
        if (arg0 != 250) {
            field1718 = (class162) null;
        }
        return (this.field1681[this.field1653 - 2] & 0xFF << 8) + (this.field1681[this.field1653 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)I", line = 325)
    public final int method716(boolean arg0) {
        field1687++;
        this.field1653 += 2;
        if (!arg0) {
            return -38;
        }
        int var2 = ((this.field1681[this.field1653 - 1] & 0xFF) << 8) + (this.field1681[this.field1653 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)I", line = 345)
    public final int method717(int arg0, boolean arg1) {
        field1719++;
        int var3 = class133.method1053((byte) -126, this.field1681, this.field1653, arg0);
        this.method730(false, var3);
        return arg1 ? var3 : -10;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(BI)V", line = 363)
    public final void method718(byte arg0, int arg1) {
        if (arg0 > -78) {
            field1702 = (class204) null;
        }
        this.field1681[this.field1653++] = (byte) arg1;
        field1663++;
        this.field1681[this.field1653++] = (byte) (arg1 >> 8);
        this.field1681[this.field1653++] = (byte) (arg1 >> 16);
        this.field1681[this.field1653++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(B)B", line = 378)
    public final byte method719(byte arg0) {
        if (arg0 != -42) {
            field1676 = (class162) null;
        }
        field1695++;
        return this.field1681[this.field1653++];
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[BII)V", line = 391)
    public final void method720(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = arg2;
        if (arg3 >= -1) {
            this.method715(-20);
        }
        while (arg0 + arg2 > var5) {
            this.field1681[this.field1653++] = arg1[var5];
            var5++;
        }
        field1661++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([IIBI)V", line = 407)
    public final void method721(int[] arg0, int arg1, byte arg2, int arg3) {
        field1723++;
        int var5 = this.field1653;
        this.field1653 = arg3;
        int var6 = (arg1 - arg3) / 8;
        int var7 = 0;
        if (arg2 != -97) {
            field1726 = 109;
        }
        while (var6 > var7) {
            int var8 = this.method747(false);
            int var9 = -1640531527;
            int var10 = this.method747(false);
            int var11 = -957401312;
            int var12 = 32;
            while ((var12--) > 0) {
                var10 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg0[(var11 & 0x1BE4) >>> 11] + var11;
                var11 -= var9;
                var8 -= (var10 << 4 ^ var10 >>> 5) + var10 ^ arg0[var11 & 0x3] + var11;
            }
            this.field1653 -= 8;
            this.method730(false, var8);
            this.method730(false, var10);
            var7++;
        }
        this.field1653 = var5;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)J", line = 452)
    public final long method722(int arg0) {
        field1710++;
        long var2 = (long) this.method747(false) & 0xFFFFFFFFL;
        if (arg0 != 1285103432) {
            field1702 = (class204) null;
        }
        long var4 = (long) this.method747(false) & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 466)
    public static final byte[] method723(boolean arg0, Object arg1, int arg2) {
        field1668++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg1);
            return arg0 ? class303.method2064(var3, (byte) 67) : var3;
        } else {
            if (arg2 != -13949) {
                method757((class143) null, -112, -14, -59);
            }
            if (!(arg1 instanceof class13)) {
                throw new IllegalArgumentException();
            }
            class13 var4 = (class13) arg1;
            return var4.method111(1132255303);
        }
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)I", line = 504)
    public final int method724(int arg0) {
        if (arg0 != -1) {
            field1683 = (class162) null;
        }
        field1701++;
        this.field1653 += 3;
        return (this.field1681[this.field1653 - 1] & 0xFF) + ((this.field1681[this.field1653 - 3] & 0xFF) << 8) + (this.field1681[this.field1653 + -2] & 0xFF << 16);
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(I)I", line = 520)
    public final int method725(int arg0) {
        field1667++;
        int var2 = 0;
        int var3;
        for (var3 = this.method755((byte) -101); var3 == 32767; var3 = this.method755((byte) -101)) {
            var2 += 32767;
        }
        if (arg0 != 8) {
            this.method733(-39, 0.2682299F);
        }
        return var2 + var3;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I[BII)V", line = 543)
    public final void method726(int arg0, byte[] arg1, int arg2, int arg3) {
        field1672++;
        for (int var5 = arg2; var5 < (arg2 + arg3); var5++) {
            arg1[var5] = this.field1681[this.field1653++];
        }
        if (arg0 != -31267) {
            field1650 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lbd;I)V", line = 573)
    public final void method727(class162 arg0, int arg1) {
        this.field1653 += arg0.method1261(this.field1681, this.field1653, arg0.method1249((byte) -118), 0, 93);
        if (arg1 != -253) {
            field1711 = (class162) null;
        }
        this.field1681[this.field1653++] = 0;
        field1722++;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(B)V", line = 585)
    public static void method728(byte arg0) {
        field1717 = null;
        if (arg0 != -3) {
            return;
        }
        field1676 = null;
        field1678 = null;
        field1702 = null;
        field1711 = null;
        field1680 = null;
        field1718 = null;
        field1677 = null;
        field1716 = null;
        field1683 = null;
        field1650 = null;
        field1669 = null;
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(B)I", line = 607)
    public final int method729(byte arg0) {
        this.field1653 += 4;
        if (arg0 < 101) {
            this.method710(-0.45349893F, 104);
        }
        field1725++;
        return (this.field1681[this.field1653 - 3] & 0xFF) + ((this.field1681[this.field1653 - 2] & 0xFF) << 24) + ((this.field1681[this.field1653 + -1] & 0xFF) << 16) + (this.field1681[this.field1653 + -4] & 0xFF << 8);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(ZI)V", line = 624)
    public final void method730(boolean arg0, int arg1) {
        field1689++;
        this.field1681[this.field1653++] = (byte) (arg1 >> 24);
        if (arg0) {
            method706((class162) null, 106, true);
        }
        this.field1681[this.field1653++] = (byte) (arg1 >> 16);
        this.field1681[this.field1653++] = (byte) (arg1 >> 8);
        this.field1681[this.field1653++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V", line = 651)
    public final void method731(int arg0, int arg1) {
        if (arg0 == -4) {
            this.field1681[this.field1653++] = (byte) (arg1 >> 8);
            field1690++;
            this.field1681[this.field1653++] = (byte) (arg1 + 128);
        }
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)I", line = 669)
    public final int method732(int arg0) {
        if (arg0 != -1) {
            this.method750((byte) 55);
        }
        field1665++;
        this.field1653 += 3;
        return (this.field1681[this.field1653 - 1] & 0xFF) + (this.field1681[this.field1653 - 2] & 0xFF << 8) + (this.field1681[this.field1653 + -3] & 0xFF << 16);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V", line = 683)
    public class94(int arg0) {
        this.field1681 = class120.method976(arg0, true);
        this.field1653 = 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IF)V", line = 693)
    public final void method733(int arg0, float arg1) {
        if (arg0 != 128) {
            this.method719((byte) -52);
        }
        field1728++;
        int var3 = Float.floatToRawIntBits(arg1);
        this.field1681[this.field1653++] = (byte) var3;
        this.field1681[this.field1653++] = (byte) (var3 >> 8);
        this.field1681[this.field1653++] = (byte) (var3 >> 16);
        this.field1681[this.field1653++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!b", name = "i", descriptor = "(I)I", line = 709)
    public final int method734(int arg0) {
        this.field1653 += arg0;
        field1685++;
        return ((this.field1681[this.field1653 - 1] & 0xFF) << 8) + (this.field1681[this.field1653 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(B)I", line = 720)
    public final int method735(byte arg0) {
        int var2 = -125 % ((-arg0 - 66) / 48);
        field1654++;
        return -this.field1681[this.field1653++] & 0xFF;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I[BII)V", line = 736)
    public final void method736(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg0; var5 < (arg0 + arg3); var5++) {
            arg1[var5] = (byte) (this.field1681[this.field1653++] - 128);
        }
        if (arg2 != 671376144) {
            field1680 = (class162) null;
        }
        field1696++;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V", line = 755)
    public final void method737(int arg0, int arg1) {
        this.field1681[this.field1653++] = (byte) (arg1 + 128);
        this.field1681[this.field1653++] = (byte) (arg1 >> 8);
        field1697++;
        if (arg0 > -115) {
            this.method712((byte) -124);
        }
    }

    @OriginalMember(owner = "client!b", name = "i", descriptor = "(B)I", line = 767)
    public final int method738(byte arg0) {
        if (arg0 < 125) {
            return -24;
        }
        field1700++;
        this.field1653 += 2;
        int var2 = ((this.field1681[this.field1653 - 1] & 0xFF) << 8) + (this.field1681[this.field1653 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(II)V", line = 790)
    public final void method739(int arg0, int arg1) {
        field1727++;
        int var3 = -63 % ((15 - arg0) / 32);
        this.field1681[this.field1653++] = (byte) (128 - arg1);
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(II)V", line = 803)
    public final void method740(int arg0, int arg1) {
        field1708++;
        this.field1681[this.field1653++] = (byte) (arg1 >> 16);
        this.field1681[this.field1653++] = (byte) (arg1 >> 8);
        this.field1681[this.field1653++] = (byte) arg1;
        if (arg0 != 28918) {
            this.method758((byte[]) null, 25, -23, -4);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V", line = 827)
    public class94(byte[] arg0) {
        this.field1653 = 0;
        this.field1681 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "j", descriptor = "(I)B", line = 839)
    public final byte method741(int arg0) {
        field1712++;
        if (arg0 != 0) {
            this.method715(-127);
        }
        return (byte) (-this.field1681[this.field1653++]);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(BI)V", line = 854)
    public final void method742(byte arg0, int arg1) {
        field1694++;
        this.field1681[this.field1653 - arg1 - 1] = (byte) arg1;
        int var3 = 98 / ((18 - arg0) / 39);
    }

    @OriginalMember(owner = "client!b", name = "k", descriptor = "(I)I", line = 869)
    public final int method743(int arg0) {
        if (arg0 >= -45) {
            field1702 = (class204) null;
        }
        field1713++;
        byte var2 = this.field1681[this.field1653++];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 0x7F | var3) << 7;
            var2 = this.field1681[this.field1653++];
        }
        return var2 | var3;
    }

    @OriginalMember(owner = "client!b", name = "j", descriptor = "(B)Lbd;", line = 891)
    public final class162 method744(byte arg0) {
        field1706++;
        if (arg0 <= 38) {
            this.method738((byte) 32);
        }
        int var2 = this.field1653;
        while (this.field1681[this.field1653++] != 0) {
        }
        return class95.method768(this.field1653 - var2 - 1, var2, this.field1681, (byte) 119);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(JB)V", line = 908)
    public final void method745(long arg0, byte arg1) {
        this.field1681[this.field1653++] = (byte) ((int) (arg0 >> 56));
        field1714++;
        this.field1681[this.field1653++] = (byte) ((int) (arg0 >> 48));
        this.field1681[this.field1653++] = (byte) ((int) (arg0 >> 40));
        if (arg1 != -124) {
            this.method716(false);
        }
        this.field1681[this.field1653++] = (byte) ((int) (arg0 >> 32));
        this.field1681[this.field1653++] = (byte) ((int) (arg0 >> 24));
        this.field1681[this.field1653++] = (byte) ((int) (arg0 >> 16));
        this.field1681[this.field1653++] = (byte) ((int) (arg0 >> 8));
        this.field1681[this.field1653++] = (byte) ((int) arg0);
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(II)V", line = 926)
    public final void method746(int arg0, int arg1) {
        field1715++;
        this.field1681[this.field1653++] = (byte) arg1;
        int var3 = 60 % ((arg0 - 68) / 54);
        this.field1681[this.field1653++] = (byte) (arg1 >> 8);
        this.field1681[this.field1653++] = (byte) (arg1 >> 16);
        this.field1681[this.field1653++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(Z)I", line = 947)
    public final int method747(boolean arg0) {
        this.field1653 += 4;
        field1699++;
        return arg0 ? 8 : (this.field1681[this.field1653 - 3] & 0xFF << 16) + ((this.field1681[this.field1653 - 4] & 0xFF) << 24) + ((this.field1681[this.field1653 + -2] & 0xFF) << 8) + (this.field1681[this.field1653 + -1] & 0xFF);
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(II)V", line = 964)
    public final void method748(int arg0, int arg1) {
        field1691++;
        if (arg1 != -793216136) {
            this.method739(-73, 83);
        }
        this.field1681[this.field1653++] = (byte) (arg0 >> 8);
        this.field1681[this.field1653++] = (byte) arg0;
        this.field1681[this.field1653++] = (byte) (arg0 >> 24);
        this.field1681[this.field1653++] = (byte) (arg0 >> 16);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(JII)V", line = 978)
    public final void method749(long arg0, int arg1, int arg2) {
        field1655++;
        int var6 = arg2 - 1;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        for (int var5 = var6 * 8; var5 >= 0; var5 -= 8) {
            this.field1681[this.field1653++] = (byte) ((int) (arg0 >> var5));
        }
        if (arg1 != 10990) {
            field1680 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!b", name = "k", descriptor = "(B)I", line = 1009)
    public final int method750(byte arg0) {
        if (arg0 != -24) {
            field1678 = (class162) null;
        }
        this.field1653 += 2;
        field1724++;
        int var2 = (this.field1681[this.field1653 - 2] & 0xFF << 8) + (this.field1681[this.field1653 - 1] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "i", descriptor = "(II)V", line = 1038)
    public final void method751(int arg0, int arg1) {
        field1658++;
        this.field1681[this.field1653++] = (byte) (arg0 >> 8);
        this.field1681[this.field1653++] = (byte) arg0;
        if (arg1 != -1044017976) {
            field1683 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLb;)V", line = 1051)
    public static final void method752(byte arg0, class94 arg1) {
        field1709++;
        if (arg0 != 59) {
            field1676 = (class162) null;
        }
        while (true) {
            while (arg1.field1681.length > arg1.field1653) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method756(915905888) == 1) {
                    var3 = true;
                    var2 = arg1.method756(915905888);
                    var4 = arg1.method756(arg0 ^ 0x36979D5B);
                }
                int var5 = arg1.method756(arg0 ^ 0x36979D5B);
                int var6 = arg1.method756(arg0 ^ 0x36979D5B);
                int var7 = var5 * 64 - class290.field4893;
                int var8 = class9.field114 + class87.field1536 - (var6 * 64 + 1);
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class304.field5132 && var8 < class9.field114) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && var2 * 8 + 8 > var11 && (var4 * 8) <= var12 && (var4 * 8 + 8) > var12) {
                                int var13 = arg1.method756(arg0 ^ 0x36979D5B);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method756(915905888);
                                        if (class269.field4503[var9][var10] == null) {
                                            class269.field4503[var9][var10] = new byte[4096];
                                        }
                                        class269.field4503[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method761((byte) 108);
                                        if (class194.field3271[var9][var10] == null) {
                                            class194.field3271[var9][var10] = new short[4096];
                                        }
                                        class194.field3271[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method756(915905888) & 0xFF << 16) + ((arg1.method756(arg0 + 915905829) & 0xFF) << 8) + (arg1.method756(915905888) & 0xFF);
                                        if (class206.field3474[var9][var10] == null) {
                                            class206.field3474[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class311 var17 = class229.method1637(var16, (byte) 93);
                                        if (var17.field5191 != null) {
                                            var17 = var17.method2105((byte) -127);
                                            if (var17 == null || var17.field5239 == -1) {
                                                continue;
                                            }
                                        }
                                        class206.field3474[var9][var10][(63 - var12 << 6) + var11] = var17.field5219 + 1;
                                        class133 var18 = new class133();
                                        var18.field2379 = var8;
                                        var18.field2384 = var17.field5239;
                                        var18.field2382 = var7;
                                        class106.field1924.method167(false, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg1.method756(915905888);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field1653++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field1653 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field1653 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IZ)V", line = 1205)
    public final void method753(int arg0, boolean arg1) {
        field1698++;
        this.field1681[this.field1653++] = (byte) arg0;
        if (!arg1) {
            this.method762((byte) -1);
        }
    }

    @OriginalMember(owner = "client!b", name = "l", descriptor = "(I)I", line = 1221)
    public final int method754(int arg0) {
        if (arg0 != 1100946928) {
            this.method727((class162) null, 74);
        }
        this.field1653 += 4;
        field1721++;
        return (this.field1681[this.field1653 - 2] & 0xFF) + (this.field1681[this.field1653 - 1] & 0xFF << 8) + ((this.field1681[this.field1653 + -4] & 0xFF) << 16) + (this.field1681[this.field1653 - 3] & 0xFF << 24);
    }

    @OriginalMember(owner = "client!b", name = "l", descriptor = "(B)I", line = 1240)
    public final int method755(byte arg0) {
        if (arg0 != -101) {
            this.method714((byte) 114);
        }
        int var2 = this.field1681[this.field1653] & 0xFF;
        field1656++;
        return var2 >= 128 ? this.method761((byte) 108) - 32768 : this.method756(arg0 + 915905989);
    }

    @OriginalMember(owner = "client!b", name = "m", descriptor = "(I)I", line = 1266)
    public final int method756(int arg0) {
        if (arg0 == 915905888) {
            field1664++;
            return this.field1681[this.field1653++] & 0xFF;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lda;III)Z", line = 1284)
    public static final boolean method757(class143 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method1128(arg1, 0, arg3);
        field1682++;
        if (arg2 != -1908303920) {
            field1717 = (class162[]) null;
        }
        if (var4 == null) {
            return false;
        } else {
            class178.method1345(-67, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BIII)V", line = 1303)
    public final void method758(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg1 - (1 - arg2); var5 >= arg1; var5--) {
            arg0[var5] = (byte) (this.field1681[this.field1653++] - 128);
        }
        if (arg3 != 24107) {
            this.method749(82L, 114, -59);
        }
        field1660++;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(ZI)V", line = 1321)
    public final void method759(boolean arg0, int arg1) {
        this.field1681[this.field1653++] = (byte) arg1;
        field1671++;
        this.field1681[this.field1653++] = (byte) (arg1 >> 8);
        if (arg0) {
            field1726 = -10;
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(Z)I", line = 1333)
    public final int method760(boolean arg0) {
        if (arg0) {
            return 119;
        } else {
            field1705++;
            this.field1653 += 4;
            return (this.field1681[this.field1653 - 2] & 0xFF << 16) + ((this.field1681[this.field1653 - 1] & 0xFF) << 24) + (this.field1681[this.field1653 + -3] & 0xFF << 8) + (this.field1681[this.field1653 + -4] & 0xFF);
        }
    }

    @OriginalMember(owner = "client!b", name = "m", descriptor = "(B)I", line = 1350)
    public final int method761(byte arg0) {
        field1651++;
        this.field1653 += 2;
        if (arg0 != 108) {
            field1711 = (class162) null;
        }
        return ((this.field1681[this.field1653 - 2] & 0xFF) << 8) + (this.field1681[this.field1653 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!b", name = "n", descriptor = "(B)Lbd;", line = 1365)
    public final class162 method762(byte arg0) {
        field1692++;
        if (arg0 != -28) {
            field1711 = (class162) null;
        }
        if (this.field1681[this.field1653] == 0) {
            this.field1653++;
            return null;
        } else {
            return this.method744((byte) 78);
        }
    }
}
