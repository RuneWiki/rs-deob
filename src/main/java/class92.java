import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class92 implements class201 {

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Z")
    private boolean field1834 = true;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field1832 = 0;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Ljd;")
    public static class92 field1842 = class202.method1325((byte) 90, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "Ljd;")
    public static class92 field1852 = class202.method1325((byte) 90, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1826 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[Ljd;")
    public static class92[] field1815 = new class92[500];

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    private int field1831;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    public static int field1868;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field1869;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "[B")
    public byte[] field1856;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "[I")
    public static int[] field1850;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method603(int arg0) {
        field1865++;
        int[] var1 = new int[class104.field2144];
        int var2 = 0;
        for (int var3 = 0; var3 < class104.field2144; var3++) {
            class107 var5 = method626((byte) 59, var3);
            if (var5.field2171 >= 0 || var5.field2218 >= 0) {
                var1[var2++] = var3;
            }
        }
        class61.field1262 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class61.field1262[var4] = var1[var4];
        }
        if (arg0 < 30) {
            method641(87, (byte) 68, 51, 4, 2, -75, 123, -119, -108);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Ljd;")
    public final class92 method604(byte arg0) {
        field1845++;
        if (arg0 != -83) {
            return null;
        } else if (this.field1834) {
            this.field1831 = 0;
            if (this.field1856.length != this.field1838) {
                byte[] var2 = new byte[this.field1838];
                class11.method75(this.field1856, 0, var2, 0, this.field1838);
                this.field1856 = var2;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLjd;)Ljd;")
    public final class92 method605(boolean arg0, class92 arg1) {
        field1864++;
        if (!this.field1834) {
            throw new IllegalArgumentException();
        }
        this.field1831 = 0;
        if (!arg0) {
            method641(-53, (byte) 34, -45, 104, 16, -88, 71, -2, 71);
        }
        if (this.field1838 + arg1.field1838 > this.field1856.length) {
            int var3;
            for (var3 = 1; var3 < this.field1838 + arg1.field1838; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class11.method75(this.field1856, 0, var4, 0, this.field1838);
            this.field1856 = var4;
        }
        class11.method75(arg1.field1856, 0, this.field1856, this.field1838, arg1.field1838);
        this.field1838 += arg1.field1838;
        return this;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Ljd;")
    public final class92 method606(int arg0, int arg1) {
        if (arg1 != 65) {
            this.method645(true, null);
        }
        field1814++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field1834) {
            this.field1831 = 0;
            if (this.field1856.length == this.field1838) {
                int var3;
                for (var3 = 1; var3 <= this.field1838; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class11.method75(this.field1856, 0, var4, 0, this.field1838);
                this.field1856 = var4;
            }
            this.field1856[this.field1838++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Ljd;")
    public final class92 method607(byte arg0) {
        field1822++;
        int var2;
        for (var2 = 0; this.field1838 > var2 && (this.field1856[var2] >= 0 && this.field1856[var2] <= 32 || (this.field1856[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field1838; var3 > var2 && (this.field1856[var3 - 1] >= 0 && this.field1856[var3 - 1] <= 32 || (this.field1856[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (arg0 > -79) {
            return null;
        } else if (var2 == 0 && this.field1838 == var3) {
            return this;
        } else {
            class92 var4 = new class92();
            var4.field1838 = var3 - var2;
            var4.field1856 = new byte[var4.field1838];
            for (int var5 = 0; var5 < var4.field1838; var5++) {
                var4.field1856[var5] = this.field1856[var2 + var5];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;I)I")
    public final int method608(class92 arg0, int arg1) {
        field1833++;
        int var3;
        if (this.field1838 <= arg0.field1838) {
            var3 = this.field1838;
        } else {
            var3 = arg0.field1838;
        }
        if (arg1 != 1) {
            field1832 = 120;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field1856[var4] & 0xFF) > (this.field1856[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field1856[var4] & 0xFF) < (this.field1856[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field1838 < arg0.field1838) {
            return -1;
        } else if (this.field1838 > arg0.field1838) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)J")
    public final long method609(int arg0) {
        long var2 = 0L;
        if (arg0 != 10354) {
            this.method623((byte) 3);
        }
        for (int var4 = 0; var4 < this.field1838 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1856[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        field1863++;
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Z")
    private final boolean method610(int arg0, boolean arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = arg1;
        int var4 = 0;
        field1841++;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field1838; var6++) {
            int var7 = this.field1856[var6] & 0xFF;
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
            if (var7 >= arg0) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
                return false;
            }
            var5 = true;
            var4 = var8;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
    public final int method611(int arg0) {
        field1854++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1838; var3++) {
            var2 = (var2 << 5) + (this.field1856[var3] & 0xFF) - var2;
        }
        if (arg0 < 75) {
            this.method632(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)J")
    private final long method612(int arg0) {
        field1847++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1838; var4++) {
            var2 = (var2 << 5) + (long) (this.field1856[var4] & 0xFF) - var2;
        }
        if (arg0 != -37) {
            this.field1838 = 17;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Ljd;")
    public final class92 method613(int arg0, int arg1) {
        field1825++;
        return arg0 == 0 ? this.method629(this.field1838, arg1, 0) : null;
    }

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1810++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)Ljd;")
    public final class92 method614(int arg0) {
        if (arg0 != 0) {
            field1826 = -12;
        }
        field1844++;
        class92 var2 = class129.method855(false, this.method609(10354));
        return var2 == null ? class111.field2258 : var2;
    }

    @OriginalMember(owner = "client!jd", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1851++;
        return this.method611(127);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;Z)I")
    public final int method615(class92 arg0, boolean arg1) {
        if (arg1) {
            field1855++;
            return this.method642(0, (byte) -115, arg0);
        } else {
            return 41;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjd;)I")
    public final int method616(byte arg0, class92 arg1) {
        int var3;
        if (this.field1838 > arg1.field1838) {
            var3 = arg1.field1838;
        } else {
            var3 = this.field1838;
        }
        field1824++;
        if (arg0 >= 0) {
            this.method604((byte) 119);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class131.field2631[arg1.field1856[var4] & 0xFF] > class131.field2631[this.field1856[var4] & 0xFF]) {
                return -1;
            }
            if (class131.field2631[arg1.field1856[var4] & 0xFF] < class131.field2631[this.field1856[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field1838 < arg1.field1838) {
            return -1;
        } else if (this.field1838 > arg1.field1838) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Ljd;")
    public final class92 method617(int arg0) {
        field1849++;
        class92 var2 = new class92();
        boolean var3 = true;
        var2.field1838 = this.field1838;
        var2.field1856 = new byte[this.field1838];
        for (int var4 = 0; var4 < this.field1838; var4++) {
            byte var5 = this.field1856[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1856[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1856[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field1856[var4] = var5;
            }
        }
        if (arg0 != 1) {
            this.field1834 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)Ljd;")
    public final class92 method618(int arg0, int arg1) {
        field1812++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class92 var3 = new class92();
        var3.field1856 = new byte[this.field1838 + 1];
        if (arg0 >= -20) {
            return null;
        } else {
            var3.field1838 = this.field1838 + 1;
            class11.method75(this.field1856, 0, var3.field1856, 0, this.field1838);
            var3.field1856[this.field1838] = (byte) arg1;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public static void method619(boolean arg0) {
        field1852 = null;
        field1815 = null;
        field1850 = null;
        if (arg0) {
            field1842 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method620(int arg0, int arg1, int arg2, Graphics arg3) {
        int var5 = 83 / ((20 - arg2) / 37);
        field1868++;
        String var6;
        try {
            var6 = new String(this.field1856, 0, this.field1838, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var6 = new String(this.field1856, 0, this.field1838);
        }
        arg3.drawString(var6, arg0, arg1);
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)I")
    public final int method621(int arg0) {
        int var2 = -113 / ((arg0 + 87) / 34);
        field1811++;
        return this.method624(-74, 10);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z")
    public final boolean method622(byte arg0) {
        if (arg0 >= -68) {
            this.field1834 = false;
        }
        field1840++;
        return this.method610(10, false);
    }

    @OriginalMember(owner = "client!jd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1858++;
        if (!(arg0 instanceof class92)) {
            throw new IllegalArgumentException();
        }
        return this.method631(5003, (class92) arg0);
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)[B")
    public final byte[] method623(byte arg0) {
        field1836++;
        byte[] var2 = new byte[this.field1838];
        if (arg0 != 99) {
            this.method627(false);
        }
        class11.method75(this.field1856, 0, var2, 0, this.field1838);
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)I")
    public final int method624(int arg0, int arg1) {
        int var3 = -112 % ((-arg0 - 21) / 37);
        field1867++;
        boolean var4 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = 0;
        boolean var6 = false;
        for (int var7 = 0; var7 < this.field1838; var7++) {
            int var8 = this.field1856[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var4 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var8) {
                throw new NumberFormatException();
            }
            if (var4) {
                var8 = -var8;
            }
            int var9 = arg1 * var5 + var8;
            if (var9 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var9;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(BLjd;)Z")
    public final boolean method625(byte arg0, class92 arg1) {
        field1839++;
        if (this.field1838 < arg1.field1838) {
            return false;
        }
        int var3 = this.field1838 - arg1.field1838;
        if (arg0 != 78) {
            return true;
        }
        for (int var4 = 0; var4 < arg1.field1838; var4++) {
            if (this.field1856[var3 + var4] != arg1.field1856[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Ll;")
    public static final class107 method626(byte arg0, int arg1) {
        field1843++;
        class107 var2 = (class107) class186.field3519.method930(arg0 - 157, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class27.field611.method899((byte) 87, class43.method267(arg1, (byte) 91), class70.method440(-125, arg1));
        class107 var4 = new class107();
        var4.field2211 = arg1;
        if (var3 != null) {
            var4.method739(78, new class70(var3));
        }
        var4.method735(-1);
        if (var4.field2181 != -1) {
            var4.method741(-58, method626((byte) 59, var4.field2182), method626((byte) 59, var4.field2181));
        }
        if (!class139.field2778 && var4.field2202) {
            var4.field2161 = null;
            var4.field2199 = null;
            var4.field2162 = class192.field3734;
            var4.field2200 = 0;
            var4.field2192 = false;
        }
        if (arg0 != 59) {
            method603(95);
        }
        class186.field3519.method927(arg0 + 24685, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)Ljd;")
    public final class92 method627(boolean arg0) {
        class92 var2 = new class92();
        field1848++;
        var2.field1838 = this.field1838;
        var2.field1856 = new byte[this.field1838];
        for (int var3 = 0; var3 < this.field1838; var3++) {
            var2.field1856[var3] = 42;
        }
        if (arg0) {
            field1832 = -118;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
    public final void method628(Applet arg0, byte arg1) throws Throwable {
        field1817++;
        if (arg1 < 46) {
            this.method606(-119, 105);
        }
        String var3 = new String(this.field1856, 0, this.field1838);
        class17.method97(var3, arg0, 7759);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Ljd;")
    public final class92 method629(int arg0, int arg1, int arg2) {
        field1866++;
        class92 var4 = new class92();
        var4.field1856 = new byte[arg0 - arg1];
        var4.field1838 = arg0 - arg1;
        class11.method75(this.field1856, arg1, var4.field1856, arg2, var4.field1838);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)I")
    public final int method630(int arg0, int arg1, int arg2) {
        field1859++;
        byte var4 = (byte) arg2;
        if (arg1 != -1) {
            field1860 = -21;
        }
        for (int var5 = arg0; var5 < this.field1838; var5++) {
            if (this.field1856[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjd;)Z")
    public final boolean method631(int arg0, class92 arg1) {
        field1818++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 5003) {
            this.method622((byte) 90);
        }
        if (this.field1838 != arg1.field1838) {
            return false;
        }
        if (!this.field1834 || !arg1.field1834) {
            if (this.field1831 == 0) {
                this.field1831 = this.method611(arg0 ^ 0x13EB);
                if (this.field1831 == 0) {
                    this.field1831 = 1;
                }
            }
            if (arg1.field1831 == 0) {
                arg1.field1831 = arg1.method611(93);
                if (arg1.field1831 == 0) {
                    arg1.field1831 = 1;
                }
            }
            if (this.field1831 != arg1.field1831) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field1838; var3++) {
            if (this.field1856[var3] != arg1.field1856[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(Z)Ljd;")
    public final class92 method632(boolean arg0) {
        class92 var2 = new class92();
        field1837++;
        var2.field1838 = this.field1838;
        var2.field1856 = new byte[this.field1838];
        if (!arg0) {
            this.equals(null);
        }
        for (int var3 = 0; var3 < this.field1838; var3++) {
            byte var4 = this.field1856[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1856[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)Ljd;")
    public final class92 method633(byte arg0) {
        field1835++;
        class92 var2 = new class92();
        if (arg0 != -57) {
            this.method624(-15, -16);
        }
        byte var3 = 2;
        var2.field1838 = this.field1838;
        var2.field1856 = new byte[this.field1838];
        for (int var4 = 0; var4 < this.field1838; var4++) {
            byte var5 = this.field1856[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field1856[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method634(FontMetrics arg0, int arg1) {
        field1819++;
        String var3;
        try {
            if (arg1 != 62) {
                return -110;
            }
            var3 = new String(this.field1856, 0, this.field1838, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1856, 0, this.field1838);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)I")
    public final int method635(byte arg0, int arg1) {
        int var3 = -58 % ((-arg0 - 31) / 38);
        field1830++;
        return this.field1856[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Ljd;Z)Z")
    public final boolean method636(class92 arg0, boolean arg1) {
        field1861++;
        if (this.field1838 < arg0.field1838) {
            return false;
        } else if (arg1) {
            for (int var3 = 0; var3 < arg0.field1838; var3++) {
                if (this.field1856[var3] != arg0.field1856[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)Z")
    public static final boolean method637(int arg0, byte arg1) {
        field1813++;
        int var2 = -118 % ((76 - arg1) / 33);
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[BII)I")
    public final int method638(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field1820++;
        int var6 = 50 % ((arg1 - 61) / 47);
        class11.method75(this.field1856, arg0, arg2, arg4, arg3 - arg0);
        return arg3 - arg0;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(B)Ljava/net/URL;")
    public final URL method639(byte arg0) throws MalformedURLException {
        if (arg0 == 108) {
            field1828++;
            return new URL(new String(this.field1856, 0, this.field1838));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(Z)I")
    public final int method640(boolean arg0) {
        field1816++;
        if (!arg0) {
            field1815 = null;
        }
        return this.field1838;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method641(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1862++;
        if (class188.method1210(-18040, arg3)) {
            class188.field3547 = null;
            class29.method182(true, arg6, arg5, arg4, class60.field1256[arg3], arg2, arg0, arg7, arg8, -1);
            if (class188.field3547 != null) {
                class29.method182(true, class188.field3571, arg5, arg4, class188.field3547, arg2, class29.field642, arg7, arg8, -1412584499);
                class188.field3547 = null;
            }
            if (arg1 <= 4) {
                field1852 = null;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class55.field1143[var9] = true;
            }
        } else {
            class55.field1143[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBLjd;)I")
    public final int method642(int arg0, byte arg1, class92 arg2) {
        field1823++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg2.field1838];
        int[] var6 = new int[arg2.field1838];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg2.field1838;
        }
        for (int var8 = 1; var8 <= arg2.field1838; var8++) {
            var6[var8 - 1] = (arg2.field1838 << 1) - var8;
            var4[class196.method1301(255, arg2.field1856[var8 - 1])] = arg2.field1838 - var8;
        }
        int var9 = arg2.field1838 + 1;
        int var10 = arg2.field1838;
        while (var10 > 0) {
            var5[var10 - 1] = var9;
            while (var9 <= arg2.field1838 && arg2.field1856[var9 - 1] != arg2.field1856[var10 - 1]) {
                if (var6[var9 - 1] >= arg2.field1838 - var10) {
                    var6[var9 - 1] = arg2.field1838 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg2.field1838 + 1 - var9;
        int var14 = 0;
        int var15 = 1;
        while (var15 <= var13) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field1856[var15 - 1] != arg2.field1856[var14 - 1]) {
                var14 = var5[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (arg2.field1838 > var11) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (var6[var18 - 1] >= arg2.field1838 + var11 - var18) {
                    var6[var18 - 1] = arg2.field1838 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 = var11 + var13 - var5[var13 + -1];
            var13 = var5[var13 - 1];
        }
        if (arg1 != -115) {
            this.method617(-15);
        }
        int var17;
        for (int var16 = arg0 + arg2.field1838 - 1; var16 < this.field1838; var16 += Math.max(var4[this.field1856[var16] & 0xFF], var6[var17])) {
            for (var17 = arg2.field1838 - 1; var17 >= 0 && this.field1856[var16] == arg2.field1856[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(II)Z")
    public static final boolean method643(int arg0, int arg1) {
        if (arg0 >= -29) {
            method626((byte) -127, 8);
        }
        field1857++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(B)Ljd;")
    public final class92 method644(byte arg0) {
        field1846++;
        long var2 = this.method612(-37);
        synchronized (field1869 == null ? (field1869 = method647("jd")) : field1869) {
            if (client.field683 == null) {
                client.field683 = new class33(4096);
            } else {
                for (class162 var5 = (class162) client.field683.method216(-92, var2); var5 != null; var5 = (class162) client.field683.method214(-1)) {
                    if (this.method631(5003, var5.field3179)) {
                        return var5.field3179;
                    }
                }
            }
            class162 var7 = new class162();
            if (arg0 < 8) {
                field1815 = null;
            }
            var7.field3179 = this;
            this.field1834 = false;
            client.field683.method210((byte) -125, var2, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLjava/applet/Applet;)Ljd;")
    public final class92 method645(boolean arg0, Applet arg1) {
        field1853++;
        if (arg0) {
            String var3 = new String(this.field1856, 0, this.field1838);
            String var4 = arg1.getParameter(var3);
            return var4 == null ? null : class44.method276(0, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(ILjd;)Z")
    public final boolean method646(int arg0, class92 arg1) {
        field1827++;
        if (arg0 < 90) {
            this.method627(false);
        }
        if (arg1 == null) {
            return false;
        } else if (this.field1838 == arg1.field1838) {
            for (int var3 = 0; var3 < this.field1838; var3++) {
                byte var4 = this.field1856[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field1856[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method647(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
