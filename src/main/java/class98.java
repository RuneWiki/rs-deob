import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class98 implements class65 {

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "Z")
    private boolean field1737 = true;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lsb;")
    public static class98 field1688 = null;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Lsb;")
    public static class98 field1693 = class47.method368("<col=00ff00>", 0);

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lsb;")
    public static class98 field1691 = class47.method368("Hidden)2use", 0);

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static volatile int field1703 = -1;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lsb;")
    public static class98 field1732 = class47.method368("RuneScape wird geladen )2 bitte warten)3)3)3", 0);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lq;")
    public static class148 field1674;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field1738;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "[B")
    public byte[] field1733;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Z")
    public final boolean method700(int arg0) {
        if (arg0 == -5422) {
            field1709++;
            return this.method752(10, -98);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)J")
    public final long method701(int arg0) {
        field1735++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1694; var4++) {
            var2 = (var2 << 5) + ((long) (this.field1733[var4] & 0xFF)) - var2;
        }
        if (arg0 != 16883) {
            this.field1737 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1701++;
        return this.method734(-97);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z[BI)I")
    private final int method702(boolean arg0, byte[] arg1, int arg2) {
        field1726++;
        int var4 = arg2;
        if (arg0) {
            this.method747(-72, -111, -114, 38, (byte[]) null);
        }
        for (int var5 = 0; var5 < this.field1694; var5 += 4) {
            int var6 = class230.method1587(arg0, this.field1733[var5]);
            int var7 = this.field1694 > (var5 + 1) ? class230.method1587(false, this.field1733[var5 + 1]) : -1;
            int var8 = this.field1694 > (var5 + 2) ? class230.method1587(false, this.field1733[var5 + 2]) : -1;
            int var9 = this.field1694 > (var5 + 3) ? class230.method1587(arg0, this.field1733[var5 + 3]) : -1;
            arg1[arg2++] = (byte) class67.method471(var6 << 2, var7 >>> 4);
            if (var8 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class67.method471(class214.method1427(var7 << 4, 240), var8 >>> 2);
            if (var9 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class67.method471(class214.method1427(var8 << 6, 192), var9);
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lsb;")
    public final class98 method703(byte arg0) {
        field1700++;
        class98 var2 = new class98();
        var2.field1694 = this.field1694;
        var2.field1733 = new byte[this.field1694];
        for (int var3 = 0; var3 < this.field1694; var3++) {
            byte var5 = this.field1733[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var2.field1733[var3] = var5;
        }
        int var4 = 47 % ((23 - arg0) / 50);
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lsb;")
    public final class98 method704(int arg0, int arg1) {
        field1719++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        }
        if (arg1 != 20097) {
            this.method734(113);
        }
        if (!this.field1737) {
            throw new IllegalArgumentException();
        }
        this.field1677 = 0;
        if (this.field1733.length == this.field1694) {
            int var3;
            for (var3 = 1; var3 <= this.field1694; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class66.method463(this.field1733, 0, var4, 0, this.field1694);
            this.field1733 = var4;
        }
        this.field1733[this.field1694++] = (byte) arg0;
        return this;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)I")
    public static final int method705(int arg0, int arg1) {
        field1695++;
        if (arg1 > -79) {
            method715(62);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Lsb;")
    public final class98 method706(byte arg0) {
        field1728++;
        long var2 = this.method701(16883);
        if (arg0 >= -89) {
            this.method716(-74, false);
        }
        synchronized (field1738 == null ? (field1738 = method753("sb")) : field1738) {
            if (class122.field2234 == null) {
                class122.field2234 = new class219(4096);
            } else {
                for (class97 var5 = (class97) class122.field2234.method1511((byte) -124, var2); var5 != null; var5 = (class97) class122.field2234.method1516(-113)) {
                    if (this.method748(true, var5.field1667)) {
                        return var5.field1667;
                    }
                }
            }
            class97 var7 = new class97();
            this.field1737 = false;
            var7.field1667 = this;
            class122.field2234.method1513(var2, var7, -1);
            return this;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method707(int arg0, Applet arg1) throws Throwable {
        field1676++;
        int var3 = -39 % ((arg0 + 22) / 53);
        String var4 = new String(this.field1733, 0, this.field1694);
        Object var5 = class39.method317(var4, (Object[]) null, arg1, -5878);
        if (var5 instanceof String) {
            byte[] var6 = ((String) var5).getBytes();
            var5 = class186.method1285(0, var6, var6.length, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lsb;I)Z")
    public final boolean method708(class98 arg0, int arg1) {
        field1714++;
        if (arg0.field1694 > this.field1694) {
            return false;
        }
        if (arg1 > -43) {
            this.method717(-24, (byte) -128);
        }
        for (int var3 = 0; var3 < arg0.field1694; var3++) {
            if (this.field1733[var3] != arg0.field1733[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1708++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)[B")
    public final byte[] method709(boolean arg0) {
        field1720++;
        if (!arg0) {
            field1732 = null;
        }
        if (this.field1694 == 0) {
            return new byte[0];
        }
        int var2 = this.field1694 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if ((var2 - 2) >= this.field1694 || class230.method1587(!arg0, this.field1733[var2 - 2]) == -1) {
            var3 -= 2;
        } else if (var2 - 1 >= this.field1694 || class230.method1587(!arg0, this.field1733[var2 - 1]) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method702(false, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILsb;)I")
    public final int method710(int arg0, class98 arg1) {
        field1722++;
        return arg0 >= -52 ? 81 : this.method743(127, arg1, 0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)I")
    public final int method711(int arg0, boolean arg1) {
        field1715++;
        return arg1 ? 67 : this.method732(!arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)Lsb;")
    public final class98 method712(int arg0, int arg1) {
        field1685++;
        if (arg0 != 57) {
            return null;
        } else if (arg1 > 0 && arg1 <= 255) {
            class98 var3 = new class98();
            var3.field1733 = new byte[this.field1694 + 1];
            var3.field1694 = this.field1694 + 1;
            class66.method463(this.field1733, 0, var3.field1733, 0, this.field1694);
            var3.field1733[this.field1694] = (byte) arg1;
            return var3;
        } else {
            throw new IllegalArgumentException("invalid char");
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Lsb;")
    public final class98 method713(int arg0) {
        field1690++;
        byte var2 = 2;
        class98 var3 = new class98();
        var3.field1694 = this.field1694;
        var3.field1733 = new byte[this.field1694];
        if (arg0 != 63) {
            this.field1737 = true;
        }
        for (int var4 = 0; var4 < this.field1694; var4++) {
            byte var5 = this.field1733[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field1733[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)Lsb;")
    public final class98 method714(int arg0) {
        int var2 = 111 % ((arg0 - 19) / 57);
        field1710++;
        class98 var3 = class106.method814(this.method727((byte) 36), (byte) -128);
        return var3 == null ? class248.field4346 : var3;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
    public static final void method715(int arg0) {
        field1734++;
        if (arg0 != 2) {
            field1693 = null;
        }
        while (true) {
            class48 var1 = class239.field4123;
            class99 var2;
            synchronized (class239.field4123) {
                var2 = (class99) class20.field366.method372(arg0 ^ 0x3D);
            }
            if (var2 == null) {
                return;
            }
            var2.field1741.method1296(false, var2.field1739, (int) var2.field4061, true, var2.field1748);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IZ)I")
    public final int method716(int arg0, boolean arg1) {
        field1673++;
        if (!arg1) {
            method705(-74, 33);
        }
        byte var3 = (byte) arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1694; var5++) {
            if (this.field1733[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
    public final void method717(int arg0, byte arg1) {
        this.field1677 = 0;
        field1678++;
        if (!this.field1737) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field1733.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class66.method463(this.field1733, 0, var4, 0, this.field1694);
                this.field1733 = var4;
            }
            if (arg1 == 75) {
                for (int var5 = this.field1694; var5 < arg0; var5++) {
                    this.field1733[var5] = 32;
                }
                this.field1694 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Lsb;")
    public final class98 method718(byte arg0) {
        field1713++;
        if (!this.field1737) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 93) {
            this.method706((byte) -91);
        }
        this.field1677 = 0;
        if (this.field1733.length != this.field1694) {
            byte[] var2 = new byte[this.field1694];
            class66.method463(this.field1733, 0, var2, 0, this.field1694);
            this.field1733 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)I")
    public final int method719(boolean arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1717++;
        boolean var3 = arg0;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1694; var6++) {
            int var7 = this.field1733[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if ((var8 / arg1) != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var3 = true;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
    public final void method720(int arg0) {
        field1736++;
        String var2;
        try {
            var2 = new String(this.field1733, arg0, this.field1694, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field1733, 0, this.field1694);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
    public static void method721(int arg0) {
        field1732 = null;
        if (arg0 != 10) {
            method705(68, 95);
        }
        field1693 = null;
        field1691 = null;
        field1674 = null;
        field1688 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/net/URL;)Ljava/net/URL;")
    public final URL method722(boolean arg0, URL arg1) throws MalformedURLException {
        if (!arg0) {
            this.method738(0, (Graphics) null, -80, -89);
        }
        field1729++;
        return new URL(arg1, new String(this.field1733, 0, this.field1694));
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)Lsb;")
    public final class98 method723(int arg0) {
        field1687++;
        int var2 = 0;
        if (arg0 != 255) {
            return null;
        }
        while (var2 < this.field1694 && (this.field1733[var2] >= 0 && this.field1733[var2] <= 32 || (this.field1733[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field1694; var2 < var3 && (this.field1733[var3 - 1] >= 0 && this.field1733[var3 - 1] <= 32 || (this.field1733[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field1694 == var3) {
            return this;
        }
        class98 var4 = new class98();
        var4.field1694 = var3 - var2;
        var4.field1733 = new byte[var4.field1694];
        for (int var5 = 0; var5 < var4.field1694; var5++) {
            var4.field1733[var5] = this.field1733[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)I")
    public final int method724(byte arg0) {
        if (arg0 != 25) {
            this.method711(58, false);
        }
        field1731++;
        return this.field1694;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)[B")
    public final byte[] method725(boolean arg0) {
        byte[] var2 = new byte[this.field1694];
        class66.method463(this.field1733, 0, var2, 0, this.field1694);
        field1711++;
        if (arg0) {
            this.method727((byte) 84);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)Lsb;")
    public final class98 method726(byte arg0) {
        class98 var2 = new class98();
        var2.field1694 = this.field1694;
        field1697++;
        var2.field1733 = new byte[this.field1694];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1694; var4++) {
            byte var5 = this.field1733[var4];
            if (var5 == 95) {
                var2.field1733[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1733[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field1733[var4] = var5;
            }
        }
        if (arg0 != -100) {
            this.method702(false, (byte[]) null, 94);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(B)J")
    public final long method727(byte arg0) {
        field1705++;
        if (arg0 != 36) {
            return -2L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1694 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1733[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (1 - (65 - var5));
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 - 96);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method728(int arg0, FontMetrics arg1) {
        field1698++;
        if (arg0 != 33) {
            return 83;
        }
        String var3;
        try {
            var3 = new String(this.field1733, 0, this.field1694, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1733, 0, this.field1694);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILsb;II)Lsb;")
    public final class98 method729(int arg0, class98 arg1, int arg2, int arg3) {
        field1702++;
        if (arg0 != -28556) {
            return null;
        } else if (!this.field1737) {
            throw new IllegalArgumentException();
        } else if (arg2 >= 0 && arg3 >= arg2 && arg3 <= arg1.field1694) {
            this.field1677 = 0;
            if (this.field1733.length < (this.field1694 + arg3 - arg2)) {
                int var5;
                for (var5 = 1; var5 < this.field1694 + arg1.field1694; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class66.method463(this.field1733, 0, var6, 0, this.field1694);
                this.field1733 = var6;
            }
            class66.method463(arg1.field1733, arg2, this.field1733, this.field1694, arg3 - arg2);
            this.field1694 += arg3 - arg2;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)I")
    public final int method730(int arg0, int arg1) {
        field1684++;
        return arg1 == -26815 ? this.field1733[arg0] & 0xFF : 94;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLsb;)Z")
    public final boolean method731(byte arg0, class98 arg1) {
        field1712++;
        if (arg1 == null) {
            return false;
        } else if (this.field1694 == arg1.field1694) {
            int var3 = -19 / ((arg0 - 47) / 60);
            for (int var4 = 0; var4 < this.field1694; var4++) {
                byte var5 = this.field1733[var4];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                byte var6 = arg1.field1733[var4];
                if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                    var6 = (byte) (var6 + 32);
                }
                if (var5 != var6) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)I")
    public final int method732(boolean arg0, int arg1, int arg2) {
        field1730++;
        byte var4 = (byte) arg2;
        if (!arg0) {
            field1693 = null;
        }
        for (int var5 = arg1; var5 < this.field1694; var5++) {
            if (this.field1733[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)I")
    public final int method733(int arg0) {
        field1680++;
        if (arg0 != -31805) {
            this.method712(11, 48);
        }
        return this.method719(false, 10);
    }

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "(I)I")
    public final int method734(int arg0) {
        field1686++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 > -34) {
            this.method712(-10, -113);
        }
        while (this.field1694 > var3) {
            var2 = (this.field1733[var3] & 0xFF) + (var2 << 5) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)Ljava/net/URL;")
    public final URL method735(boolean arg0) throws MalformedURLException {
        if (!arg0) {
            this.method717(-51, (byte) 16);
        }
        field1716++;
        return new URL(new String(this.field1733, 0, this.field1694));
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(ILsb;)Lsb;")
    public final class98 method736(int arg0, class98 arg1) {
        field1682++;
        if (!this.field1737) {
            throw new IllegalArgumentException();
        }
        this.field1677 = 0;
        if (arg0 != -11204) {
            return null;
        }
        if (this.field1733.length < (this.field1694 + arg1.field1694)) {
            int var3;
            for (var3 = 1; var3 < (this.field1694 + arg1.field1694); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class66.method463(this.field1733, 0, var4, 0, this.field1694);
            this.field1733 = var4;
        }
        class66.method463(arg1.field1733, 0, this.field1733, this.field1694, arg1.field1694);
        this.field1694 += arg1.field1694;
        return this;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IB)[Lsb;")
    public final class98[] method737(int arg0, byte arg1) {
        if (arg1 != 35) {
            this.field1733 = null;
        }
        field1704++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1694; var4++) {
            if (this.field1733[var4] == arg0) {
                var3++;
            }
        }
        class98[] var5 = new class98[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field1733[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method742(19, var7, var7 + var9);
            var7 += var9 + 1;
        }
        var5[var3] = this.method742(47, var7, this.field1694);
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method738(int arg0, Graphics arg1, int arg2, int arg3) {
        field1724++;
        if (arg2 < 121) {
            this.method719(true, 115);
        }
        String var5;
        try {
            var5 = new String(this.field1733, 0, this.field1694, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1733, 0, this.field1694);
        }
        arg1.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lsb;ILsb;)Lsb;")
    public final class98 method739(class98 arg0, int arg1, class98 arg2) {
        field1699++;
        if (arg1 != 9975) {
            this.method738(22, (Graphics) null, -123, -47);
        }
        int var4 = arg0.field1694 - arg2.field1694;
        int var5 = this.field1694;
        int var6 = 0;
        while (true) {
            int var7 = this.method743(102, arg2, var6);
            if (var7 < 0) {
                int var8 = 0;
                class98 var9 = class153.method1119(-51, var5);
                while (true) {
                    int var10 = this.method743(125, arg2, var8);
                    if (var10 < 0) {
                        while (this.field1694 > var8) {
                            var9.method704(this.field1733[var8++] & 0xFF, 20097);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method704(this.field1733[var8++] & 0xFF, 20097);
                    }
                    var9.method736(-11204, arg0);
                    var8 += arg2.field1694;
                }
            }
            var5 += var4;
            var6 = arg2.field1694 + var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(IZ)Lsb;")
    public final class98 method740(int arg0, boolean arg1) {
        field1725++;
        if (!arg1) {
            field1703 = 94;
        }
        return this.method742(-95, arg0, this.field1694);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(ILsb;)Z")
    public final boolean method741(int arg0, class98 arg1) {
        field1707++;
        if (this.field1694 < arg1.field1694) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field1694; var3++) {
            byte var5 = this.field1733[var3];
            byte var6 = arg1.field1733[var3];
            if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                var6 = (byte) (var6 + 32);
            }
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var5 != var6) {
                return false;
            }
        }
        int var4 = -26 / ((39 - arg0) / 43);
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Lsb;")
    public final class98 method742(int arg0, int arg1, int arg2) {
        field1721++;
        class98 var4 = new class98();
        var4.field1733 = new byte[arg2 - arg1];
        var4.field1694 = arg2 - arg1;
        int var5 = -45 / ((arg0 + 24) / 43);
        class66.method463(this.field1733, arg1, var4.field1733, 0, var4.field1694);
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1679++;
        if (!arg0 instanceof class98) {
            throw new IllegalArgumentException();
        }
        return this.method748(true, (class98) arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILsb;I)I")
    public final int method743(int arg0, class98 arg1, int arg2) {
        field1683++;
        int[] var4 = new int[arg1.field1694];
        if (arg0 <= 90) {
            return 64;
        }
        int[] var5 = new int[arg1.field1694];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg1.field1694;
        }
        for (int var8 = 1; var8 <= arg1.field1694; var8++) {
            var4[var8 - 1] = (arg1.field1694 << 1) - var8;
            var6[class214.method1427(arg1.field1733[var8 - 1], 255)] = arg1.field1694 - var8;
        }
        int var9 = arg1.field1694 + 1;
        for (int var10 = arg1.field1694; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (arg1.field1694 >= var9 && arg1.field1733[var10 - 1] != arg1.field1733[var9 - 1]) {
                if (var4[var9 - 1] >= (arg1.field1694 - var10)) {
                    var4[var9 - 1] = arg1.field1694 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg1.field1694 - (var9 - 1);
        int var14 = 0;
        int var15 = 1;
        while (var15 <= var13) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field1733[var14 - 1] != arg1.field1733[var15 - 1]) {
                var14 = var5[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg1.field1694) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= (arg1.field1694 + var11 - var18)) {
                    var4[var18 - 1] = arg1.field1694 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 = var11 + var13 - var5[var13 + -1];
            var13 = var5[var13 - 1];
        }
        int var17;
        for (int var16 = arg1.field1694 + arg2 - 1; var16 < this.field1694; var16 += Math.max(var6[this.field1733[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field1694 - 1; var17 >= 0 && this.field1733[var16] == arg1.field1733[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/applet/Applet;B)Lsb;")
    public final class98 method744(Applet arg0, byte arg1) {
        field1696++;
        int var3 = -48 / ((-arg1 - 84) / 35);
        String var4 = new String(this.field1733, 0, this.field1694);
        String var5 = arg0.getParameter(var4);
        return var5 == null ? null : class189.method1304(var5, -1);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(ILjava/applet/Applet;)V")
    public final void method745(int arg0, Applet arg1) throws Throwable {
        field1723++;
        String var3 = new String(this.field1733, 0, this.field1694);
        class39.method318(var3, 32342, arg1);
        if (arg0 != -1) {
            this.method738(-128, (Graphics) null, -6, -36);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(BLsb;)I")
    public final int method746(byte arg0, class98 arg1) {
        int var3;
        if (this.field1694 > arg1.field1694) {
            var3 = arg1.field1694;
        } else {
            var3 = this.field1694;
        }
        field1706++;
        int var4 = -53 % ((-arg0 - 16) / 54);
        for (int var5 = 0; var5 < var3; var5++) {
            if ((arg1.field1733[var5] & 0xFF) > (this.field1733[var5] & 0xFF)) {
                return -1;
            }
            if ((arg1.field1733[var5] & 0xFF) < (this.field1733[var5] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field1694 > this.field1694) {
            return -1;
        } else if (arg1.field1694 < this.field1694) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII[B)I")
    public final int method747(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        class66.method463(this.field1733, arg1, arg4, arg0, arg3 - arg1);
        if (arg2 <= 22) {
            method751(96);
        }
        field1675++;
        return arg3 - arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLsb;)Z")
    public final boolean method748(boolean arg0, class98 arg1) {
        field1681++;
        if (arg1 == null) {
            return false;
        } else if (this.field1694 == arg1.field1694) {
            if (!this.field1737 || !arg1.field1737) {
                if (this.field1677 == 0) {
                    this.field1677 = this.method734(-117);
                    if (this.field1677 == 0) {
                        this.field1677 = 1;
                    }
                }
                if (arg1.field1677 == 0) {
                    arg1.field1677 = arg1.method734(-114);
                    if (arg1.field1677 == 0) {
                        arg1.field1677 = 1;
                    }
                }
                if (this.field1677 != arg1.field1677) {
                    return false;
                }
            }
            if (!arg0) {
                this.method713(110);
            }
            for (int var3 = 0; var3 < this.field1694; var3++) {
                if (this.field1733[var3] != arg1.field1733[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(BLsb;)I")
    public final int method749(byte arg0, class98 arg1) {
        field1689++;
        int var3 = this.field1694;
        if (arg0 != 120) {
            field1688 = null;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = arg1.field1694;
        int var7 = this.field1694;
        int var8 = arg1.field1694;
        int var9 = 0;
        int var10 = 0;
        while (var3 != 0 && var6 != 0) {
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = this.field1733[var9] & 0xFF;
                var9++;
            }
            if (class142.method1060(false, var4)) {
                var7++;
            } else {
                var3--;
            }
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = arg1.field1733[var10] & 0xFF;
                var10++;
            }
            if (class142.method1060(false, var5)) {
                var8++;
            } else {
                var6--;
            }
            if (class90.field1579[var4] < class90.field1579[var5]) {
                return -1;
            }
            if (class90.field1579[var5] < class90.field1579[var4]) {
                return 1;
            }
        }
        if (var7 < var8) {
            return -1;
        } else if (var7 > var8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(BLsb;)Z")
    public final boolean method750(byte arg0, class98 arg1) {
        field1727++;
        if (arg1.field1694 > this.field1694) {
            return false;
        }
        if (arg0 < 119) {
            this.method740(-108, true);
        }
        int var3 = this.field1694 - arg1.field1694;
        for (int var4 = 0; var4 < arg1.field1694; var4++) {
            if (this.field1733[var4 + var3] != arg1.field1733[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "(I)Z")
    public static final boolean method751(int arg0) {
        if (arg0 != -33) {
            return true;
        }
        field1718++;
        try {
            return class225.method1551((byte) -124);
        } catch (IOException var4) {
            class139.method1050(-101);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class222.field3824 + "," + class16.field300 + "," + class255.field4498 + " - " + class47.field789 + "," + (class189.field3277 + class163.field2943.field4501[0]) + "," + (class163.field2943.field4491[0] + class182.field3143) + " - ";
            for (int var3 = 0; class47.field789 > var3 && var3 < 50; var3++) {
                var2 = var2 + class144.field2536.field3706[var3] + ",";
            }
            class243.method1678(var2, var5, (byte) -83);
            class12.method109(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(II)Z")
    private final boolean method752(int arg0, int arg1) {
        field1692++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        if (arg1 != -98) {
            method751(101);
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1694; var6++) {
            int var7 = this.field1733[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg0 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method753(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
