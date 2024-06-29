import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class112 extends class190 {

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "[B")
    public byte[] field1780;

    @OriginalMember(owner = "client!nh", name = "lb", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field1781 = 2;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "Z")
    public static boolean field1809 = false;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "[I")
    public static int[] field1814 = new int[128];

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "Ll;")
    public static class101 field1815 = new class101(5000);

    @OriginalMember(owner = "client!nh", name = "Eb", descriptor = "[I")
    public static int[] field1840 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!nh", name = "Db", descriptor = "Lqe;")
    public static class168 field1839 = class66.method448("(U4", -124);

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!nh", name = "kb", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!nh", name = "mb", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!nh", name = "nb", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!nh", name = "ob", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!nh", name = "pb", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!nh", name = "qb", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!nh", name = "rb", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!nh", name = "sb", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!nh", name = "tb", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!nh", name = "ub", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!nh", name = "vb", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!nh", name = "wb", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!nh", name = "xb", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!nh", name = "yb", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!nh", name = "zb", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!nh", name = "Ab", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!nh", name = "Bb", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!nh", name = "Cb", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!nh", name = "Fb", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!nh", name = "Gb", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!nh", name = "Ib", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!nh", name = "Hb", descriptor = "Lnh;")
    public static class112 field1843;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lqe;Z)V")
    public final void method721(class168 arg0, boolean arg1) {
        if (!arg1) {
            this.method721(null, false);
        }
        field1808++;
        this.field1821 += arg0.method1113((byte) -126, this.field1821, arg0.method1109((byte) 101), this.field1780, 0);
        this.field1780[this.field1821++] = 0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JIB)V")
    public final void method722(long arg0, int arg1, byte arg2) {
        field1791++;
        int var6 = arg1 - 1;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        if (arg2 <= 97) {
            this.method743(127);
        }
        for (int var5 = var6 * 8; var5 >= 0; var5 -= 8) {
            this.field1780[this.field1821++] = (byte) (arg0 >> var5);
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)I")
    public final int method723(int arg0) {
        field1828++;
        if (arg0 != 4915) {
            this.method725(122, -110, null, 124);
        }
        this.field1821 += 2;
        int var2 = ((this.field1780[this.field1821 - 2] & 0xFF) << 8) + (this.field1780[this.field1821 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)Lqe;")
    public final class168 method724(byte arg0) {
        field1803++;
        int var2 = -125 / ((44 - arg0) / 53);
        if (this.field1780[this.field1821] == 0) {
            this.field1821++;
            return null;
        } else {
            return this.method751((byte) -84);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[BI)V")
    public final void method725(int arg0, int arg1, byte[] arg2, int arg3) {
        field1835++;
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            this.field1780[this.field1821++] = arg2[var5];
        }
        if (arg3 != 1926268184) {
            this.method778(-94);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
    public final void method726(int arg0, byte arg1) {
        if (arg1 < 42) {
            field1843 = null;
        }
        this.field1780[this.field1821++] = (byte) (arg0 >> 8);
        this.field1780[this.field1821++] = (byte) (arg0 + 128);
        field1834++;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)I")
    public final int method727(int arg0) {
        if (arg0 == -27619) {
            field1785++;
            this.field1821 += 3;
            return ((this.field1780[this.field1821 - 3] & 0xFF) << 16) + (((this.field1780[this.field1821 - 2] & 0xFF) << 8) + (this.field1780[this.field1821 - 1] & 0xFF));
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)I")
    public final int method728(byte arg0) {
        int var2 = -84 % ((arg0 + 6) / 56);
        field1830++;
        this.field1821 += 2;
        return ((this.field1780[this.field1821 - 1] & 0xFF) << 8) + (this.field1780[this.field1821 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
    public final void method729(int arg0, int arg1) {
        field1826++;
        if (arg1 >= -6) {
            this.method746(-33);
        }
        this.field1780[this.field1821 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)I")
    public final int method730(byte arg0) {
        this.field1821 += 4;
        field1811++;
        if (arg0 <= 60) {
            this.method756(-110, 63, null, 123);
        }
        return ((this.field1780[this.field1821 - 4] & 0xFF) << 8) + (this.field1780[this.field1821 - 3] & 0xFF) + ((this.field1780[this.field1821 + -1] & 0xFF) << 16) + ((this.field1780[this.field1821 - 2] & 0xFF) << 24);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I")
    public final int method731(boolean arg0) {
        field1800++;
        this.field1821 += 2;
        if (arg0) {
            this.method740(-45);
        }
        return ((this.field1780[this.field1821 - 2] & 0xFF) << 8) + (this.field1780[this.field1821 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public final void method732(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.method758(true);
        field1804++;
        if (arg2 != -3) {
            field1814 = null;
        }
        byte[] var5 = new byte[var4];
        this.method754(0, -4, var4, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field1821 = 0;
        this.method725(0, var8.length, var8, 1926268184);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)V")
    public final void method733(int arg0, int arg1) {
        this.field1780[this.field1821 - arg1 - 4] = (byte) (arg1 >> 24);
        field1818++;
        if (arg0 != 0) {
            this.method724((byte) -44);
        }
        this.field1780[this.field1821 - arg1 - 3] = (byte) (arg1 >> 16);
        this.field1780[this.field1821 - arg1 - 2] = (byte) (arg1 >> 8);
        this.field1780[this.field1821 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
    public final void method734(boolean arg0, int arg1) {
        if ((arg1 & 0xFFFFFF80) != 0) {
            if ((arg1 & 0xFFFFC000) != 0) {
                if ((arg1 & 0xFFE00000) != 0) {
                    if ((arg1 & 0xF0000000) != 0) {
                        this.method768(arg1 >>> 28 | 0x80, 7295);
                    }
                    this.method768(arg1 >>> 21 | 0x80, 7295);
                }
                this.method768(arg1 >>> 14 | 0x80, 7295);
            }
            this.method768(arg1 >>> 7 | 0x80, 7295);
        }
        if (!arg0) {
            this.method744(-29);
        }
        this.method768(arg1 & 0x7F, 7295);
        field1797++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)V")
    public final void method735(byte arg0, int arg1) {
        field1783++;
        this.field1780[this.field1821++] = (byte) (arg1 + 128);
        if (arg0 == 33) {
            this.field1780[this.field1821++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BBII)V")
    public final void method736(byte[] arg0, byte arg1, int arg2, int arg3) {
        field1807++;
        int var5 = arg2;
        if (arg1 >= -81) {
            this.method768(-117, 32);
        }
        while (var5 < arg2 + arg3) {
            arg0[var5] = (byte) (this.field1780[this.field1821++] - 128);
            var5++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)J")
    public final long method737(int arg0, int arg1) {
        field1816++;
        int var6 = arg1 - 1;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 255) {
            field1781 = -61;
        }
        int var3 = var6 * 8;
        long var4 = 0L;
        while (var3 >= 0) {
            var4 |= ((long) this.field1780[this.field1821++] & 0xFFL) << var3;
            var3 -= 8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
    public final void method738(int arg0, boolean arg1) {
        field1838++;
        this.field1780[this.field1821++] = (byte) (arg0 >> 16);
        this.field1780[this.field1821++] = (byte) (arg0 >> 24);
        this.field1780[this.field1821++] = (byte) arg0;
        if (!arg1) {
            this.method754(-25, 21, 88, null);
        }
        this.field1780[this.field1821++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
    public final void method739(long arg0, int arg1) {
        field1790++;
        this.field1780[this.field1821++] = (byte) (arg0 >> 56);
        if (arg1 != -23147) {
            this.method776(-20, 54);
        }
        this.field1780[this.field1821++] = (byte) (arg0 >> 48);
        this.field1780[this.field1821++] = (byte) (arg0 >> 40);
        this.field1780[this.field1821++] = (byte) (arg0 >> 32);
        this.field1780[this.field1821++] = (byte) (arg0 >> 24);
        this.field1780[this.field1821++] = (byte) (arg0 >> 16);
        this.field1780[this.field1821++] = (byte) (arg0 >> 8);
        this.field1780[this.field1821++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)I")
    public final int method740(int arg0) {
        field1782++;
        this.field1821 += 2;
        int var2 = ((this.field1780[this.field1821 - 2] & 0xFF) << 8) + (this.field1780[this.field1821 - 1] & 0xFF);
        if (arg0 == 16711680) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)I")
    public final int method741(int arg0) {
        field1788++;
        byte var2 = this.field1780[this.field1821++];
        int var3 = arg0;
        while (var2 < 0) {
            var3 = (var2 & 0x7F | var3) << 7;
            var2 = this.field1780[this.field1821++];
        }
        return var2 | var3;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)I")
    public final int method742(byte arg0) {
        field1829++;
        int var2 = 0;
        if (arg0 > -10) {
            field1815 = null;
        }
        int var3;
        for (var3 = this.method747((byte) -125); var3 == 32767; var3 = this.method747((byte) -125)) {
            var2 += 32767;
        }
        return var2 + var3;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)I")
    public final int method743(int arg0) {
        field1822++;
        if (arg0 != -30935) {
            this.method776(15, -111);
        }
        return -this.field1780[this.field1821++] & 0xFF;
    }

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)B")
    public final byte method744(int arg0) {
        int var2 = 125 % ((72 - arg0) / 49);
        field1836++;
        return (byte) -this.field1780[this.field1821++];
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(II)V")
    public final void method745(int arg0, int arg1) {
        this.field1780[this.field1821++] = (byte) (arg1 >> 8);
        field1844++;
        this.field1780[this.field1821++] = (byte) arg1;
        if (arg0 != -1529536968) {
            this.method742((byte) 126);
        }
        this.field1780[this.field1821++] = (byte) (arg1 >> 24);
        this.field1780[this.field1821++] = (byte) (arg1 >> 16);
    }

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "(I)B")
    public final byte method746(int arg0) {
        if (arg0 != -7506) {
            field1781 = -17;
        }
        field1794++;
        return (byte) (this.field1780[this.field1821++] - 128);
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(B)I")
    public final int method747(byte arg0) {
        if (arg0 != -125) {
            this.method777(-113, (byte) -40);
        }
        int var2 = this.field1780[this.field1821] & 0xFF;
        field1810++;
        return var2 < 128 ? this.method758(true) : this.method731(false) - 32768;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(II)V")
    public final void method748(int arg0, int arg1) {
        this.field1780[this.field1821++] = (byte) (arg1 >> 16);
        if (arg0 != 979698984) {
            field1809 = false;
        }
        field1792++;
        this.field1780[this.field1821++] = (byte) (arg1 >> 8);
        this.field1780[this.field1821++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public final void method749(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field1821;
        this.field1821 = 0;
        field1842++;
        byte[] var5 = new byte[var4];
        this.method754(0, -4, var4, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        if (arg0 != 2) {
            this.method729(-100, 18);
        }
        byte[] var8 = var7.toByteArray();
        this.field1821 = 0;
        this.method768(var8.length, 7295);
        this.method725(0, var8.length, var8, arg0 + 1926268182);
    }

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "(I)B")
    public final byte method750(int arg0) {
        int var2 = 28 / ((arg0 + 7) / 50);
        field1825++;
        return this.field1780[this.field1821++];
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(B)Lqe;")
    public final class168 method751(byte arg0) {
        field1832++;
        if (arg0 > -68) {
            this.method775(-85, -44);
        }
        int var2 = this.field1821;
        while (this.field1780[this.field1821++] != 0) {
        }
        return class119.method812((byte) -104, this.field1821 - var2 - 1, var2, this.field1780);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IJ)V")
    public final void method752(int arg0, long arg1) {
        field1799++;
        this.method745(-1529536968, (int) (arg1 >> 32));
        this.method745(-1529536968, (int) arg1);
        if (arg0 <= 95) {
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(II)V")
    public final void method753(int arg0, int arg1) {
        field1824++;
        this.field1780[this.field1821++] = (byte) (arg0 >> 8);
        this.field1780[this.field1821++] = (byte) arg0;
        if (arg1 != -242005080) {
            this.method758(false);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[B)V")
    public final void method754(int arg0, int arg1, int arg2, byte[] arg3) {
        field1812++;
        if (arg1 == -4) {
            for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
                arg3[var5] = this.field1780[this.field1821++];
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(II)V")
    public final void method755(int arg0, int arg1) {
        field1793++;
        this.field1780[this.field1821++] = (byte) arg1;
        this.field1780[this.field1821++] = (byte) (arg1 >> 8);
        int var3 = 47 / ((-arg0 - 62) / 57);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[II)V")
    public final void method756(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = this.field1821;
        int var6 = (arg3 - arg0) / 8;
        field1779++;
        this.field1821 = arg0;
        int var7 = 0;
        if (arg1 != 3) {
            field1815 = null;
        }
        while (var7 < var6) {
            int var8 = this.method769((byte) -86);
            int var9 = this.method769((byte) -86);
            int var10 = 32;
            int var11 = -1640531527;
            int var12 = -957401312;
            while (var10-- > 0) {
                var9 -= arg2[var12 >>> 11 & 0xF3400003] + var12 ^ (var8 >>> 5 ^ var8 << 4) + var8;
                var12 -= var11;
                var8 -= var12 + arg2[var12 & 0x3] ^ (var9 << 4 ^ var9 >>> 5) + var9;
            }
            this.field1821 -= 8;
            this.method770(var8, (byte) -10);
            this.method770(var9, (byte) -10);
            var7++;
        }
        this.field1821 = var5;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IZ)V")
    public final void method757(int arg0, boolean arg1) {
        this.field1780[this.field1821++] = (byte) (128 - arg0);
        if (arg1) {
            this.method770(-73, (byte) 75);
        }
        field1789++;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)I")
    public final int method758(boolean arg0) {
        field1833++;
        return arg0 ? this.field1780[this.field1821++] & 0xFF : 48;
    }

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "(I)J")
    public final long method759(int arg0) {
        field1805++;
        if (arg0 < 11) {
            this.method742((byte) -60);
        }
        long var2 = (long) this.method769((byte) -86) & 0xFFFFFFFFL;
        long var4 = (long) this.method769((byte) -86) & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(B)V")
    public static void method760(byte arg0) {
        field1815 = null;
        field1843 = null;
        field1814 = null;
        if (arg0 <= 93) {
            method760((byte) 49);
        }
        field1840 = null;
        field1839 = null;
    }

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(B)I")
    public final int method761(byte arg0) {
        this.field1821 += 2;
        field1798++;
        int var2 = ((this.field1780[this.field1821 - 1] & 0xFF) << 8) + (this.field1780[this.field1821 - 2] & 0xFF);
        if (arg0 != 11) {
            field1809 = false;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(Z)I")
    public final int method762(boolean arg0) {
        if (arg0) {
            field1781 = 71;
        }
        field1823++;
        return this.field1780[this.field1821++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method763(Throwable arg0, String arg1, int arg2) {
        field1806++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class196.method1264(-22715, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (arg2 < 65) {
                field1781 = 99;
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class52.field711.field4088 != null) {
                class5 var8 = class52.field711.method1564(new URL(class52.field711.field4088.getCodeBase(), "clienterror.ws?c=" + class51.field703 + "&u=" + class204.field3556 + "&v1=" + class239.field4099 + "&v2=" + class239.field4083 + "&e=" + var7), (byte) 111);
                while (var8.field57 == 0) {
                    class38.method259(1L, 31644);
                }
                if (var8.field57 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field59;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(II)V")
    public final void method764(int arg0, int arg1) {
        field1796++;
        this.field1780[this.field1821++] = (byte) (arg0 - arg1);
    }

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "(B)I")
    public final int method765(byte arg0) {
        field1801++;
        if (arg0 > -38) {
            return -116;
        } else {
            this.field1821 += 4;
            return ((this.field1780[this.field1821 - 3] & 0xFF) << 8) + (this.field1780[this.field1821 - 4] & 0xFF) + ((this.field1780[this.field1821 + -1] & 0xFF) << 24) + ((this.field1780[this.field1821 - 2] & 0xFF) << 16);
        }
    }

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "(I)I")
    public final int method766(int arg0) {
        this.field1821 += 2;
        if (arg0 != 22102) {
            field1839 = null;
        }
        field1820++;
        return ((this.field1780[this.field1821 - 1] & 0xFF) << 8) + (this.field1780[this.field1821 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "(I)I")
    public final int method767(int arg0) {
        this.field1821 += 4;
        int var2 = 116 % ((arg0 - 52) / 36);
        field1817++;
        return (this.field1780[this.field1821 - 2] & 0xFF) + (((this.field1780[this.field1821 - 3] & 0xFF) << 24) - (-((this.field1780[this.field1821 - 1] & 0xFF) << 8) - ((this.field1780[this.field1821 - 4] & 0xFF) << 16)));
    }

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "(II)V")
    public final void method768(int arg0, int arg1) {
        this.field1780[this.field1821++] = (byte) arg0;
        if (arg1 != 7295) {
            this.field1821 = -95;
        }
        field1827++;
    }

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "(B)I")
    public final int method769(byte arg0) {
        field1831++;
        this.field1821 += 4;
        if (arg0 != -86) {
            field1843 = null;
        }
        return ((this.field1780[this.field1821 - 2] & 0xFF) << 8) + (this.field1780[this.field1821 - 4] << 24 & 0xFF000000) + ((this.field1780[this.field1821 + -3] & 0xFF) << 16) + (this.field1780[this.field1821 + -1] & 0xFF);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
    public class112(int arg0) {
        this.field1780 = class254.method1673(false, arg0);
        this.field1821 = 0;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)V")
    public final void method770(int arg0, byte arg1) {
        if (arg1 != -10) {
            return;
        }
        field1787++;
        this.field1780[this.field1821++] = (byte) (arg0 >> 24);
        this.field1780[this.field1821++] = (byte) (arg0 >> 16);
        this.field1780[this.field1821++] = (byte) (arg0 >> 8);
        this.field1780[this.field1821++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "(I)I")
    public final int method771(int arg0) {
        field1795++;
        int var2 = this.field1780[this.field1821] & 0xFF;
        return var2 >= arg0 ? this.method731(false) - 49152 : this.method758(true) - 64;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "([B)V")
    public class112(byte[] arg0) {
        this.field1780 = arg0;
        this.field1821 = 0;
    }

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "(B)I")
    public final int method772(byte arg0) {
        this.field1821 += 2;
        if (arg0 != -50) {
            field1843 = null;
        }
        field1837++;
        return ((this.field1780[this.field1821 - 2] & 0xFF) << 8) + (this.field1780[this.field1821 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "(II)V")
    public final void method773(int arg0, int arg1) {
        this.field1780[this.field1821++] = (byte) (arg0 + 128);
        if (arg1 > -48) {
            this.method745(-126, 104);
        }
        field1786++;
    }

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "(I)I")
    public final int method774(int arg0) {
        if (arg0 != 3825) {
            this.method770(83, (byte) -122);
        }
        this.field1821 += 3;
        field1813++;
        return (this.field1780[this.field1821 - 2] & 0xFF) + ((this.field1780[this.field1821 - 3] & 0xFF) << 16) + ((this.field1780[this.field1821 + -1] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "(II)V")
    public final void method775(int arg0, int arg1) {
        field1784++;
        int var3 = 92 / ((-arg0 - 47) / 47);
        this.field1780[this.field1821++] = (byte) arg1;
        this.field1780[this.field1821++] = (byte) (arg1 >> 8);
        this.field1780[this.field1821++] = (byte) (arg1 >> 16);
        this.field1780[this.field1821++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "(II)V")
    public final void method776(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1780 = null;
        }
        field1819++;
        if (arg0 >= 0 && arg0 < 128) {
            this.method768(arg0, 7295);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method753(arg0 + 32768, -242005080);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(IB)I")
    public final int method777(int arg0, byte arg1) {
        field1802++;
        if (arg1 != -60) {
            field1815 = null;
        }
        int var3 = class36.method221(this.field1780, true, this.field1821, arg0);
        this.method770(var3, (byte) -10);
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "(I)I")
    public final int method778(int arg0) {
        field1841++;
        if (arg0 != 128) {
            this.method748(31, -21);
        }
        return 128 - this.field1780[this.field1821++] & 0xFF;
    }
}
