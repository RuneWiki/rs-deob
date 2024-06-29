import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class108 implements class189 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Z")
    private boolean field1857 = true;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1853 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "[B")
    public byte[] field1884;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)J", line = 23)
    public final long method743(boolean arg0) {
        field1871++;
        if (arg0) {
            this.field1884 = (byte[]) null;
        }
        long var2 = 0L;
        for (int var4 = 0; this.field1870 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1884[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)Lsf;", line = 66)
    public final class108 method744(boolean arg0, int arg1) {
        field1852++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field1857) {
            if (arg0) {
                this.method766(-101, (class108) null);
            }
            if (this.field1884.length == this.field1870) {
                int var3;
                for (var3 = 1; var3 <= this.field1870; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class23.method156(this.field1884, 0, var4, 0, this.field1870);
                this.field1884 = var4;
            }
            this.field1884[this.field1870++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lsf;", line = 108)
    public final class108 method745(int arg0) {
        if (arg0 != 0) {
            this.field1857 = true;
        }
        field1873++;
        if (!this.field1857) {
            throw new IllegalArgumentException();
        }
        if (this.field1884.length != this.field1870) {
            byte[] var2 = new byte[this.field1870];
            class23.method156(this.field1884, 0, var2, 0, this.field1870);
            this.field1884 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLsf;)Z", line = 146)
    public final boolean method746(boolean arg0, class108 arg1) {
        field1874++;
        if (arg1.field1870 > this.field1870) {
            return false;
        }
        if (arg0) {
            this.field1884 = (byte[]) null;
        }
        for (int var3 = 0; var3 < arg1.field1870; var3++) {
            if (this.field1884[var3] != arg1.field1884[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)I", line = 171)
    public final int method747(int arg0, int arg1, int arg2) {
        field1888++;
        if (arg1 != 1) {
            this.method771((byte) -103);
        }
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field1870; var5++) {
            if (this.field1884[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/applet/Applet;)Lsf;", line = 195)
    public final class108 method748(int arg0, Applet arg1) {
        field1882++;
        String var3 = new String(this.field1884, 0, this.field1870);
        String var4 = arg1.getParameter(var3);
        if (arg0 == 255) {
            return var4 == null ? null : class8.method46(2754, var4);
        } else {
            return (class108) null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lsf;", line = 219)
    public final class108 method749(int arg0) {
        if (arg0 > -41) {
            return (class108) null;
        } else {
            field1861++;
            class108 var2 = class330.method2259((byte) -105, this.method743(false));
            return var2 == null ? class155.field2789 : var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZII)Lsf;", line = 238)
    public final class108 method750(boolean arg0, int arg1, int arg2) {
        field1862++;
        if (arg0) {
            this.method773(false);
        }
        class108 var4 = new class108();
        var4.field1884 = new byte[arg2 - arg1];
        var4.field1870 = arg2 - arg1;
        class23.method156(this.field1884, arg1, var4.field1884, 0, var4.field1870);
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)Z", line = 255)
    public final boolean method751(boolean arg0) {
        field1887++;
        if (arg0) {
            field1853 = 24;
        }
        return this.method780((byte) -85, 10);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;", line = 268)
    public final Object method752(int arg0, Applet arg1) throws Throwable {
        if (arg0 != 30488) {
            this.method749(-83);
        }
        String var3 = new String(this.field1884, 0, this.field1870);
        Object var4 = class33.method224((byte) 40, arg1, (Object[]) null, var3);
        field1864++;
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class304.method2137((byte) 105, 0, var5, var5.length);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;B)Z", line = 298)
    public final boolean method753(class108 arg0, byte arg1) {
        field1880++;
        if (arg0.field1870 > this.field1870) {
            return false;
        }
        if (arg1 != 56) {
            this.field1857 = true;
        }
        for (int var3 = 0; var3 < arg0.field1870; var3++) {
            byte var4 = arg0.field1884[var3];
            byte var5 = this.field1884[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILsf;)I", line = 335)
    public final int method754(int arg0, class108 arg1) {
        field1866++;
        int var3 = 0;
        int var4 = 0;
        int var5 = this.field1870;
        int var6 = this.field1870;
        int var7 = arg1.field1870;
        int var8 = arg1.field1870;
        int var9 = 0;
        int var10 = 0;
        if (arg0 < 125) {
            return 121;
        }
        while (var5 != 0 && var8 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field1884[var9] & 0xFF;
                var9++;
            }
            if (class69.method462((byte) 114, var3)) {
                var6++;
            } else {
                var5--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg1.field1884[var10] & 0xFF;
                var10++;
            }
            if (class69.method462((byte) -12, var4)) {
                var7++;
            } else {
                var8--;
            }
            if (class120.field2051[var3] < class120.field2051[var4]) {
                return -1;
            }
            if (class120.field2051[var3] > class120.field2051[var4]) {
                return 1;
            }
        }
        if (var7 <= var6) {
            return var6 <= var7 ? 0 : 1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Lsf;", line = 426)
    public final class108 method755(int arg0) {
        field1885++;
        class108 var2 = new class108();
        boolean var3 = true;
        var2.field1870 = this.field1870;
        var2.field1884 = new byte[this.field1870];
        if (arg0 != 8975) {
            this.method761((byte) 113);
        }
        for (int var4 = 0; var4 < this.field1870; var4++) {
            byte var5 = this.field1884[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1884[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1884[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field1884[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lsf;", line = 472)
    public final class108 method756(int arg0) {
        long var2 = this.method773(true);
        field1872++;
        synchronized (sf.class) {
            if (class221.field3928 == null) {
                class221.field3928 = new class242(4096);
            } else {
                for (class324 var5 = (class324) class221.field3928.method1676(var2, (byte) -74); var5 != null; var5 = (class324) class221.field3928.method1677((byte) -52)) {
                    if (this.method779(var5.field5532, 87)) {
                        return var5.field5532;
                    }
                }
            }
            class324 var6 = new class324();
            this.field1857 = false;
            var6.field5532 = this;
            class221.field3928.method1681(1, var6, var2);
        }
        return arg0 <= 113 ? (class108) null : this;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z[BIII)I", line = 526)
    public final int method757(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        class23.method156(this.field1884, arg3, arg1, arg4, arg2 - arg3);
        field1869++;
        return arg0 ? arg2 - arg3 : 15;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;", line = 539)
    public final URL method758(int arg0, URL arg1) throws MalformedURLException {
        field1865++;
        return arg0 == -28019 ? new URL(arg1, new String(this.field1884, 0, this.field1870)) : (URL) null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;Z)Lsf;", line = 555)
    public final class108 method759(class108 arg0, boolean arg1) {
        field1875++;
        if (!this.field1857) {
            throw new IllegalArgumentException();
        }
        if (this.field1884.length < this.field1870 + arg0.field1870) {
            int var3;
            for (var3 = 1; var3 < this.field1870 + arg0.field1870; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class23.method156(this.field1884, 0, var4, 0, this.field1870);
            this.field1884 = var4;
        }
        class23.method156(arg0.field1884, 0, this.field1884, this.field1870, arg0.field1870);
        if (arg1) {
            this.method759((class108) null, false);
        }
        this.field1870 += arg0.field1870;
        return this;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)I", line = 589)
    public final int method760(int arg0, byte arg1) {
        field1906++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;
        if (arg1 < 10) {
            return 71;
        }
        while (this.field1870 > var6) {
            label87: {
                int var7 = this.field1884[var6] & 0xFF;
                if (var6 == 0) {
                    if (var7 == 45) {
                        var3 = true;
                        break label87;
                    }
                    if (var7 == 43) {
                        break label87;
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
                if (var7 >= arg0) {
                    throw new NumberFormatException();
                }
                if (var3) {
                    var7 = -var7;
                }
                int var8 = arg0 * var4 + var7;
                if (var8 / arg0 != var4) {
                    throw new NumberFormatException();
                }
                var4 = var8;
                var5 = true;
            }
            var6++;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Lsf;", line = 668)
    public final class108 method761(byte arg0) {
        field1876++;
        if (arg0 != -11) {
            this.field1857 = true;
        }
        class108 var2 = new class108();
        var2.field1870 = this.field1870;
        var2.field1884 = new byte[this.field1870];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field1870; var4++) {
            byte var5 = this.field1884[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
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
            var2.field1884[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;I)I", line = 731)
    public final int method762(class108 arg0, int arg1) {
        field1859++;
        int var3 = 120 / ((15 - arg1) / 33);
        return this.method783(arg0, 0, (byte) 110);
    }

    @OriginalMember(owner = "client!sf", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 750)
    public final boolean equals(Object arg0) {
        field1868++;
        if (!(arg0 instanceof class108)) {
            throw new IllegalArgumentException();
        }
        return this.method779((class108) arg0, 117);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;Lsf;Z)Lsf;", line = 769)
    public final class108 method763(class108 arg0, class108 arg1, boolean arg2) {
        field1860++;
        int var4 = this.field1870;
        int var5 = arg1.field1870 - arg0.field1870;
        int var6 = 0;
        while (true) {
            int var7 = this.method783(arg0, var6, (byte) -56);
            if (var7 < 0) {
                int var8 = 0;
                class108 var9 = class219.method1510(var4, arg2);
                while (true) {
                    int var10 = this.method783(arg0, var8, (byte) 84);
                    if (var10 < 0) {
                        while (var8 < this.field1870) {
                            var9.method744(!arg2, this.field1884[var8++] & 0xFF);
                        }
                        if (!arg2) {
                            return (class108) null;
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method744(!arg2, this.field1884[var8++] & 0xFF);
                    }
                    var9.method759(arg1, !arg2);
                    var8 += arg0.field1870;
                }
            }
            var4 += var5;
            var6 = arg0.field1870 + var7;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(Z)Lsf;", line = 826)
    public final class108 method764(boolean arg0) {
        class108 var2 = new class108();
        var2.field1870 = this.field1870;
        field1883++;
        var2.field1884 = new byte[this.field1870];
        if (arg0) {
            return (class108) null;
        }
        for (int var3 = 0; var3 < this.field1870; var3++) {
            byte var4 = this.field1884[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1884[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(Z)Ljava/net/URL;", line = 860)
    public final URL method765(boolean arg0) throws MalformedURLException {
        field1908++;
        return arg0 ? new URL(new String(this.field1884, 0, this.field1870)) : (URL) null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(ILsf;)I", line = 881)
    public final int method766(int arg0, class108 arg1) {
        field1896++;
        int var3;
        if (this.field1870 > arg1.field1870) {
            var3 = arg1.field1870;
        } else {
            var3 = this.field1870;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field1884[var4] & 0xFF) < (arg1.field1884[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field1884[var4] & 0xFF) > (arg1.field1884[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field1870 > this.field1870) {
            return -1;
        } else if (arg0 < 88) {
            return 115;
        } else if (arg1.field1870 >= this.field1870) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 924)
    public final void method767(int arg0, byte arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field1884, 0, this.field1870, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field1884, 0, this.field1870);
        }
        field1886++;
        if (arg1 >= 91) {
            arg3.drawString(var5, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I", line = 944)
    public final int method768(int arg0) {
        field1900++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1870; var3++) {
            var2 = (var2 << 5) + (this.field1884[var3] & 0xFF) - var2;
        }
        return arg0 == -17345 ? var2 : -89;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)Lsf;", line = 964)
    public final class108 method769(int arg0) {
        field1903++;
        int var2 = 0;
        int var3 = this.field1870;
        while (var2 < this.field1870 && (this.field1884[var2] >= 0 && this.field1884[var2] <= 32 || (this.field1884[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var2 < var3 && (this.field1884[var3 - 1] >= 0 && this.field1884[var3 - 1] <= 32 || (this.field1884[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field1870 == var3) {
            return this;
        }
        class108 var4 = new class108();
        var4.field1870 = var3 - var2;
        if (arg0 != -8001) {
            this.method753((class108) null, (byte) 108);
        }
        var4.field1884 = new byte[var4.field1870];
        for (int var5 = 0; var5 < var4.field1870; var5++) {
            var4.field1884[var5] = this.field1884[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;BII)Lsf;", line = 1000)
    public final class108 method770(class108 arg0, byte arg1, int arg2, int arg3) {
        field1856++;
        int var5 = 110 / ((arg1 - 75) / 43);
        if (!this.field1857) {
            throw new IllegalArgumentException();
        } else if (arg2 >= 0 && arg2 <= arg3 && arg3 <= arg0.field1870) {
            if (this.field1884.length < (this.field1870 + arg3 - arg2)) {
                int var6;
                for (var6 = 1; var6 < this.field1870 + arg0.field1870; var6 += var6) {
                }
                byte[] var7 = new byte[var6];
                class23.method156(this.field1884, 0, var7, 0, this.field1870);
                this.field1884 = var7;
            }
            class23.method156(arg0.field1884, arg2, this.field1884, this.field1870, arg3 - arg2);
            this.field1870 += arg3 - arg2;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)I", line = 1049)
    public final int method771(byte arg0) {
        if (arg0 >= -127) {
            this.method790((class108) null, 20);
        }
        field1904++;
        return this.method760(10, (byte) 108);
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)Lsf;", line = 1065)
    public final class108 method772(int arg0) {
        if (arg0 > -8) {
            field1853 = 91;
        }
        field1855++;
        class108 var2 = new class108();
        var2.field1870 = this.field1870;
        var2.field1884 = new byte[var2.field1870];
        for (int var3 = 0; var3 < this.field1870; var3++) {
            var2.field1884[this.field1870 - var3 - 1] = this.field1884[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(Z)J", line = 1087)
    public final long method773(boolean arg0) {
        field1881++;
        long var2 = 0L;
        if (!arg0) {
            this.method764(false);
        }
        for (int var4 = 0; var4 < this.field1870; var4++) {
            var2 = (var2 << 5) + (long) (this.field1884[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IB)[Lsf;", line = 1120)
    public final class108[] method774(int arg0, byte arg1) {
        field1867++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1870; var4++) {
            if (this.field1884[var4] == arg0) {
                var3++;
            }
        }
        class108[] var5 = new class108[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 >= -44) {
            this.field1884 = (byte[]) null;
        }
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field1884[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method750(false, var7, var7 + var9);
            var7 += var9 + 1;
        }
        var5[var3] = this.method750(false, var7, this.field1870);
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Lsf;", line = 1174)
    public final class108 method775(byte arg0, int arg1) {
        field1901++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class108 var3 = new class108();
        if (arg0 != -79) {
            this.field1884 = (byte[]) null;
        }
        var3.field1884 = new byte[this.field1870 + 1];
        var3.field1870 = this.field1870 + 1;
        class23.method156(this.field1884, 0, var3.field1884, 0, this.field1870);
        var3.field1884[this.field1870] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)I", line = 1194)
    public final int method776(int arg0) {
        if (arg0 == 0) {
            field1891++;
            return this.field1870;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 1215)
    public final int method777(FontMetrics arg0, int arg1) {
        field1897++;
        if (arg1 < 81) {
            return 99;
        }
        String var3;
        try {
            var3 = new String(this.field1884, 0, this.field1870, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field1884, 0, this.field1870);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!sf", name = "toString", descriptor = "()Ljava/lang/String;", line = 1234)
    public final String toString() {
        field1905++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)V", line = 1245)
    public final void method778(int arg0) {
        field1854++;
        String var2;
        try {
            var2 = new String(this.field1884, arg0, this.field1870, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field1884, 0, this.field1870);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Lsf;I)Z", line = 1261)
    public final boolean method779(class108 arg0, int arg1) {
        field1889++;
        if (arg0 == null) {
            return false;
        } else if (arg0 == this) {
            return true;
        } else if (this.field1870 == arg0.field1870) {
            byte[] var3 = this.field1884;
            byte[] var4 = arg0.field1884;
            int var5 = 0;
            if (arg1 < 55) {
                this.field1870 = -128;
            }
            while (this.field1870 > var5) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
                var5++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)Z", line = 1299)
    private final boolean method780(byte arg0, int arg1) {
        field1890++;
        boolean var3 = false;
        if (arg0 > -45) {
            this.method772(102);
        }
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field1870; var6++) {
            int var7 = this.field1884[var6] & 0xFF;
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
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if ((var8 / arg1) != var4) {
                return false;
            }
            var4 = var8;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(Lsf;I)Z", line = 1371)
    public final boolean method781(class108 arg0, int arg1) {
        if (arg1 != -26321) {
            this.field1870 = 89;
        }
        field1877++;
        if (arg0 == null) {
            return false;
        } else if (this.field1870 == arg0.field1870) {
            for (int var3 = 0; var3 < this.field1870; var3++) {
                byte var4 = this.field1884[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field1884[var3];
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

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(Z)[B", line = 1412)
    public final byte[] method782(boolean arg0) {
        field1879++;
        if (arg0) {
            this.field1884 = (byte[]) null;
        }
        byte[] var2 = new byte[this.field1870];
        class23.method156(this.field1884, 0, var2, 0, this.field1870);
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;IB)I", line = 1432)
    public final int method783(class108 arg0, int arg1, byte arg2) {
        field1858++;
        int var4 = arg0.field1870;
        if (this.field1870 <= arg1) {
            return var4 == 0 ? this.field1870 : -1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (var4 == 0) {
            return arg1;
        }
        byte[] var5 = arg0.field1884;
        byte var6 = var5[0];
        int var7 = -119 % ((18 - arg2) / 58);
        int var8 = this.field1870 - var4;
        for (int var9 = arg1; var9 <= var8; var9++) {
            if (this.field1884[var9] != var6) {
                do {
                    var9++;
                    if (var9 > var8) {
                        return -1;
                    }
                } while (this.field1884[var9] != var6);
            }
            boolean var10 = true;
            int var11 = var9 + 1;
            int var12 = 1;
            while (var4 > var12) {
                if (this.field1884[var11] != var5[var12]) {
                    var10 = false;
                    break;
                }
                var12++;
                var11++;
            }
            if (var10) {
                return var9;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I", line = 1514)
    public final int method784(int arg0, int arg1) {
        int var3 = 26 % ((arg1 - 26) / 56);
        field1878++;
        return this.field1884[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!sf", name = "hashCode", descriptor = "()I", line = 1527)
    public final int hashCode() {
        field1902++;
        return this.method768(-17345);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLjava/applet/Applet;)V", line = 1537)
    public final void method785(byte arg0, Applet arg1) throws Throwable {
        if (arg0 >= -38) {
            this.method754(-11, (class108) null);
        }
        field1895++;
        String var3 = new String(this.field1884, 0, this.field1870);
        class33.method225(4083, arg1, var3);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)I", line = 1550)
    public final int method786(int arg0, int arg1) {
        field1907++;
        int var3 = 0;
        byte var4 = (byte) arg0;
        if (arg1 >= -44) {
            this.method768(99);
        }
        for (int var5 = 0; var5 < this.field1870; var5++) {
            if (this.field1884[var5] == var4) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)Lsf;", line = 1576)
    public final class108 method787(int arg0, int arg1, int arg2) {
        field1894++;
        byte var4 = (byte) arg1;
        class108 var5 = new class108();
        var5.field1870 = this.field1870;
        if (arg2 != 17272) {
            this.method745(79);
        }
        var5.field1884 = new byte[this.field1870];
        byte var6 = (byte) arg0;
        for (int var7 = 0; var7 < this.field1870; var7++) {
            byte var8 = this.field1884[var7];
            if (var4 == var8) {
                var5.field1884[var7] = var6;
            } else {
                var5.field1884[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)Lsf;", line = 1620)
    public final class108 method788(int arg0, int arg1) {
        field1863++;
        if (arg1 != 32299) {
            this.method755(27);
        }
        return this.method750(false, arg0, this.field1870);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V", line = 1638)
    public final void method789(int arg0, boolean arg1) {
        field1898++;
        if (!this.field1857) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field1884.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class23.method156(this.field1884, 0, var4, 0, this.field1870);
                this.field1884 = var4;
            }
            if (arg1) {
                field1853 = 118;
            }
            for (int var5 = this.field1870; var5 < arg0; var5++) {
                this.field1884[var5] = 32;
            }
            this.field1870 = arg0;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(Lsf;I)Z", line = 1686)
    public final boolean method790(class108 arg0, int arg1) {
        field1893++;
        if (arg0.field1870 > this.field1870) {
            return false;
        }
        if (arg1 != -7803) {
            this.method774(-77, (byte) -100);
        }
        int var3 = this.field1870 - arg0.field1870;
        for (int var4 = 0; var4 < arg0.field1870; var4++) {
            if (this.field1884[var3 + var4] != arg0.field1884[var4]) {
                return false;
            }
        }
        return true;
    }
}
