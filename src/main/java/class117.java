import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class117 implements class126 {

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "Z")
    private boolean field2206 = true;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lkh;")
    private static class117 field2156 = class224.method1450((byte) 106, "Jun");

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lkh;")
    private static class117 field2165 = class224.method1450((byte) 24, "Apr");

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "Lkh;")
    private static class117 field2175 = class224.method1450((byte) 122, "Mar");

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "Lkh;")
    private static class117 field2182 = class224.method1450((byte) -123, "Oct");

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "Lkh;")
    private static class117 field2191 = class224.method1450((byte) 106, "Dec");

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Lkh;")
    private static class117 field2168 = class224.method1450((byte) 108, "May");

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "Lkh;")
    private static class117 field2179 = class224.method1450((byte) 1, "Aug");

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "Lkh;")
    private static class117 field2211 = class224.method1450((byte) 118, "Feb");

    @OriginalMember(owner = "client!kh", name = "ob", descriptor = "Lkh;")
    private static class117 field2219 = class224.method1450((byte) 126, "Nov");

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Lkh;")
    private static class117 field2170 = class224.method1450((byte) 125, "Sep");

    @OriginalMember(owner = "client!kh", name = "ub", descriptor = "Lkh;")
    private static class117 field2225 = class224.method1450((byte) 4, "Jan");

    @OriginalMember(owner = "client!kh", name = "wb", descriptor = "Lkh;")
    private static class117 field2227 = class224.method1450((byte) 123, "Jul");

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[Lkh;")
    public static class117[] field2162 = new class117[] { field2225, field2211, field2175, field2165, field2168, field2156, field2227, field2179, field2170, field2182, field2219, field2191 };

    @OriginalMember(owner = "client!kh", name = "rb", descriptor = "Lkh;")
    public static class117 field2222 = class224.method1450((byte) -54, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    private int field2184;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!kh", name = "lb", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!kh", name = "mb", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!kh", name = "nb", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!kh", name = "pb", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!kh", name = "qb", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!kh", name = "sb", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!kh", name = "tb", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!kh", name = "vb", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "Lvb;")
    public static class232 field2187;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kh", name = "xb", descriptor = "Ljava/lang/Class;")
    public static Class field2228;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "[B")
    public byte[] field2196;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Lkh;")
    public final class117 method776(int arg0) {
        if (arg0 < 90) {
            this.method789(null, -30);
        }
        class117 var2 = class162.method1156(this.method813((byte) 93), (byte) 117);
        field2173++;
        return var2 == null ? class95.field1744 : var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)I")
    public final int method777(boolean arg0, int arg1) {
        field2153++;
        return arg0 ? this.field2196[arg1] & 0xFF : 44;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
    public final int method778(byte arg0, int arg1) {
        field2203++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        if (arg0 != -102) {
            return -53;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2213; var6++) {
            int var7 = this.field2196[var6] & 0xFF;
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
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var3 = true;
            var5 = var8;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Lkh;")
    public final class117 method779(int arg0) {
        field2185++;
        if (!this.field2206) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 26553) {
            this.method794(81, null);
        }
        this.field2184 = 0;
        if (this.field2196.length != this.field2213) {
            byte[] var2 = new byte[this.field2213];
            class2.method9(this.field2196, 0, var2, 0, this.field2213);
            this.field2196 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)Z")
    public static final boolean method780(byte arg0, int arg1) {
        if (arg0 > -110) {
            method812((byte) 94);
        }
        field2215++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZII)Lkh;")
    public final class117 method781(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field2187 = null;
        }
        class117 var4 = new class117();
        field2183++;
        var4.field2213 = arg2 - arg1;
        var4.field2196 = new byte[arg2 - arg1];
        class2.method9(this.field2196, arg1, var4.field2196, 0, var4.field2213);
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static void method782(boolean arg0) {
        field2187 = null;
        field2162 = null;
        field2227 = null;
        field2191 = null;
        field2156 = null;
        if (!arg0) {
            field2219 = null;
        }
        field2165 = null;
        field2170 = null;
        field2175 = null;
        field2182 = null;
        field2168 = null;
        field2179 = null;
        field2225 = null;
        field2211 = null;
        field2219 = null;
        field2222 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lkh;")
    public final class117 method783(int arg0, int arg1) {
        if (arg0 != 65) {
            field2182 = null;
        }
        field2164++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class117 var3 = new class117();
        var3.field2196 = new byte[this.field2213 + 1];
        var3.field2213 = this.field2213 + 1;
        class2.method9(this.field2196, 0, var3.field2196, 0, this.field2213);
        var3.field2196[this.field2213] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
    public final URL method784(URL arg0, int arg1) throws MalformedURLException {
        field2224++;
        int var3 = -11 / ((arg1 - 57) / 61);
        return new URL(arg0, new String(this.field2196, 0, this.field2213));
    }

    @OriginalMember(owner = "client!kh", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2176++;
        if (!(arg0 instanceof class117)) {
            throw new IllegalArgumentException();
        }
        return this.method810((byte) -50, (class117) arg0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[BI)I")
    public final int method785(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        class2.method9(this.field2196, arg1, arg3, arg2, arg0 - arg1);
        field2201++;
        return arg4 == 1 ? arg0 - arg1 : 45;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)Lkh;")
    public final class117 method786(int arg0) {
        field2223++;
        class117 var2 = new class117();
        var2.field2213 = this.field2213;
        var2.field2196 = new byte[this.field2213];
        if (arg0 > -74) {
            field2219 = null;
        }
        for (int var3 = 0; var3 < this.field2213; var3++) {
            var2.field2196[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;")
    public final Object method787(Applet arg0, int arg1) throws Throwable {
        String var3 = new String(this.field2196, arg1, this.field2213);
        Object var4 = class63.method463(24774, var3, null, arg0);
        field2217++;
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class111.method749(var5.length, 30000, 0, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/applet/Applet;)Lkh;")
    public final class117 method788(int arg0, Applet arg1) {
        field2218++;
        String var3 = new String(this.field2196, 0, this.field2213);
        String var4 = arg1.getParameter(var3);
        if (arg0 >= -66) {
            this.method777(true, -14);
        }
        return var4 == null ? null : class210.method1374(0, var4);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lkh;I)Z")
    public final boolean method789(class117 arg0, int arg1) {
        if (arg1 >= -87) {
            return false;
        }
        field2160++;
        if (arg0 == null) {
            return false;
        } else if (this.field2213 == arg0.field2213) {
            for (int var3 = 0; var3 < this.field2213; var3++) {
                byte var4 = arg0.field2196[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field2196[var3];
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

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Lkh;I)Z")
    public final boolean method790(class117 arg0, int arg1) {
        field2154++;
        if (this.field2213 < arg0.field2213) {
            return false;
        }
        if (arg1 < 1) {
            this.method791((byte) 13, -49);
        }
        for (int var3 = 0; var3 < arg0.field2213; var3++) {
            byte var4 = this.field2196[var3];
            byte var5 = arg0.field2196[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(BI)[Lkh;")
    public final class117[] method791(byte arg0, int arg1) {
        field2216++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2213; var4++) {
            if (this.field2196[var4] == arg1) {
                var3++;
            }
        }
        int var5 = 48 % ((arg0 - 42) / 61);
        class117[] var6 = new class117[var3 + 1];
        if (var3 == 0) {
            var6[0] = this;
            return var6;
        }
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            int var10;
            for (var10 = 0; this.field2196[var8 + var10] != arg1; var10++) {
            }
            var6[var7++] = this.method781(true, var8, var8 + var10);
            var8 += var10 + 1;
        }
        var6[var3] = this.method781(true, var8, this.field2213);
        return var6;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lkh;B)Z")
    public final boolean method792(class117 arg0, byte arg1) {
        field2194++;
        if (this.field2213 < arg0.field2213) {
            return false;
        }
        int var3 = this.field2213 - arg0.field2213;
        if (arg1 != 85) {
            field2227 = null;
        }
        for (int var4 = 0; var4 < arg0.field2213; var4++) {
            if (this.field2196[var3 + var4] != arg0.field2196[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Lkh;")
    public final class117 method793(int arg0) {
        long var2 = this.method804((byte) 92);
        field2208++;
        synchronized (field2228 == null ? (field2228 = method827("kh")) : field2228) {
            if (class214.field3890 == null) {
                class214.field3890 = new class62(4096);
            } else {
                for (class33 var5 = (class33) class214.field3890.method460(var2, arg0 - 4095); var5 != null; var5 = (class33) class214.field3890.method458((byte) 96)) {
                    if (this.method810((byte) -50, var5.field768)) {
                        return var5.field768;
                    }
                }
            }
            class33 var7 = new class33();
            this.field2206 = false;
            var7.field768 = this;
            class214.field3890.method461(var2, (byte) -19, var7);
            if (arg0 != 4096) {
                field2179 = null;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILkh;)I")
    public final int method794(int arg0, class117 arg1) {
        field2199++;
        int var3;
        if (this.field2213 <= arg1.field2213) {
            var3 = this.field2213;
        } else {
            var3 = arg1.field2213;
        }
        if (arg0 >= -75) {
            field2168 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class82.field1560[this.field2196[var4] & 0xFF] < class82.field1560[arg1.field2196[var4] & 0xFF]) {
                return -1;
            }
            if (class82.field1560[this.field2196[var4] & 0xFF] > class82.field1560[arg1.field2196[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1.field2213 > this.field2213) {
            return -1;
        } else if (this.field2213 > arg1.field2213) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Z")
    public final boolean method795(byte arg0) {
        field2190++;
        if (arg0 != -112) {
            field2187 = null;
        }
        return this.method809(7877, 10);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Lkh;")
    public final class117 method796(byte arg0) {
        field2220++;
        class117 var2 = new class117();
        var2.field2213 = this.field2213;
        boolean var3 = true;
        var2.field2196 = new byte[this.field2213];
        for (int var4 = 0; var4 < this.field2213; var4++) {
            byte var5 = this.field2196[var4];
            if (var5 == 95) {
                var2.field2196[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field2196[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field2196[var4] = var5;
            }
        }
        if (arg0 == -40) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Lkh;")
    public final class117 method797(int arg0, int arg1, int arg2) {
        field2214++;
        class117 var4 = new class117();
        var4.field2213 = this.field2213;
        var4.field2196 = new byte[this.field2213];
        byte var5 = (byte) arg0;
        byte var6 = (byte) arg1;
        if (arg2 != 5996) {
            field2165 = null;
        }
        for (int var7 = 0; var7 < this.field2213; var7++) {
            byte var8 = this.field2196[var7];
            if (var5 == var8) {
                var4.field2196[var7] = var6;
            } else {
                var4.field2196[var7] = var8;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Lkh;")
    public final class117 method798(byte arg0) {
        int var2 = 0;
        if (arg0 != 113) {
            field2187 = null;
        }
        field2193++;
        while (var2 < this.field2213 && (this.field2196[var2] >= 0 && this.field2196[var2] <= 32 || (this.field2196[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field2213; var2 < var3 && (this.field2196[var3 - 1] >= 0 && this.field2196[var3 - 1] <= 32 || (this.field2196[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field2213 == var3) {
            return this;
        }
        class117 var4 = new class117();
        var4.field2213 = var3 - var2;
        var4.field2196 = new byte[var4.field2213];
        for (int var5 = 0; var5 < var4.field2213; var5++) {
            var4.field2196[var5] = this.field2196[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(Lkh;I)I")
    public final int method799(class117 arg0, int arg1) {
        field2226++;
        return arg1 == 0 ? this.method821(arg0, 0, false) : -15;
    }

    @OriginalMember(owner = "client!kh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2197++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Lkh;")
    public final class117 method800(int arg0, byte arg1) {
        field2171++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (!this.field2206) {
            throw new IllegalArgumentException();
        } else if (arg1 < 15) {
            return null;
        } else {
            this.field2184 = 0;
            if (this.field2196.length == this.field2213) {
                int var3;
                for (var3 = 1; var3 <= this.field2213; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class2.method9(this.field2196, 0, var4, 0, this.field2213);
                this.field2196 = var4;
            }
            this.field2196[this.field2213++] = (byte) arg0;
            return this;
        }
    }

    @OriginalMember(owner = "client!kh", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2202++;
        return this.method818((byte) 24);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class86.field1623 == 0 && !class82.field1543) {
            int var7 = class170.field3056;
            class67.field1285++;
            int var8 = class151.field2745;
            int var9 = class205.field3695;
            int var10 = (arg6 - arg1) * (var8 - var7) / arg3 + var7;
            int var11 = class200.field3616;
            int var12 = (arg2 - arg0) * (var9 - var11) / arg5 + var11;
            class61.method450(-25300, 0L, class103.field1886, var12, (short) 11, var10, class169.field3042);
        }
        field2186++;
        if (arg4 < 60) {
            return;
        }
        long var13 = -1L;
        for (int var15 = 0; var15 < class158.field2867; var15++) {
            long var16 = class86.field1631[var15];
            int var18 = (int) var16 >> 7 & 0x7F;
            int var19 = (int) var16 & 0x7F;
            int var20 = (int) (var16 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var16 >> 29 & 0x3;
            if (var13 != var16) {
                var13 = var16;
                if (var21 == 2 && class199.method1329(class203.field3675, var19, var18, var16)) {
                    class211 var22 = class48.method379(116, var20);
                    if (var22.field3792 != null) {
                        var22 = var22.method1378((byte) 113);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class86.field1623 == 1) {
                        class61.method450(-25300, var16, class10.field358, var18, (short) 37, var19, class36.method316((byte) -34, new class117[] { class120.field2264, class224.field4042, var22.field3809 }));
                        class5.field64++;
                    } else if (!class82.field1543) {
                        class148.field2707++;
                        class117[] var23 = var22.field3819;
                        if (class159.field2909) {
                            var23 = class149.method1067(true, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    class201.field3644++;
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 14;
                                    }
                                    if (var24 == 1) {
                                        var25 = 45;
                                    }
                                    if (var24 == 2) {
                                        var25 = 10;
                                    }
                                    if (var24 == 3) {
                                        var25 = 36;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1002;
                                    }
                                    class61.method450(-25300, var16, var23[var24], var18, var25, var19, class36.method316((byte) -34, new class117[] { class204.field3685, var22.field3809 }));
                                }
                            }
                        }
                        class61.method450(-25300, (long) var22.field3830, class36.field828, var18, (short) 1007, var19, class36.method316((byte) -34, new class117[] { class204.field3685, var22.field3809 }));
                    } else if ((class234.field4231 & 0x4) == 4) {
                        class154.field2762++;
                        class61.method450(-25300, var16, class38.field878, var18, (short) 30, var19, class36.method316((byte) -34, new class117[] { class80.field1509, class224.field4042, var22.field3809 }));
                    }
                }
                if (var21 == 1) {
                    class207 var26 = class1.field18[var20];
                    if (var26.field3718.field2055 == 1 && (var26.field4244 & 0x7F) == 64 && (var26.field4221 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class61.field1229; var27++) {
                            class207 var30 = class1.field18[class21.field565[var27]];
                            if (var30 != null && var26 != var30 && var30.field3718.field2055 == 1 && var26.field4244 == var30.field4244 && var26.field4221 == var30.field4221) {
                                class162.method1158(false, var30.field3718, var19, var18, class21.field565[var27]);
                            }
                        }
                        for (int var28 = 0; var28 < class229.field4121; var28++) {
                            class56 var29 = class43.field950[class139.field2539[var28]];
                            if (var29 != null && var26.field4244 == var29.field4244 && var26.field4221 == var29.field4221) {
                                class244.method1571(class139.field2539[var28], var18, 0, var19, var29);
                            }
                        }
                    }
                    class162.method1158(false, var26.field3718, var19, var18, var20);
                }
                if (var21 == 0) {
                    class56 var31 = class43.field950[var20];
                    if ((var31.field4244 & 0x7F) == 64 && (var31.field4221 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class61.field1229; var32++) {
                            class207 var35 = class1.field18[class21.field565[var32]];
                            if (var35 != null && var35.field3718.field2055 == 1 && var31.field4244 == var35.field4244 && var31.field4221 == var35.field4221) {
                                class162.method1158(false, var35.field3718, var19, var18, class21.field565[var32]);
                            }
                        }
                        for (int var33 = 0; var33 < class229.field4121; var33++) {
                            class56 var34 = class43.field950[class139.field2539[var33]];
                            if (var34 != null && var31 != var34 && var31.field4244 == var34.field4244 && var31.field4221 == var34.field4221) {
                                class244.method1571(class139.field2539[var33], var18, 0, var19, var34);
                            }
                        }
                    }
                    class244.method1571(var20, var18, 0, var19, var31);
                }
                if (var21 == 3) {
                    class36 var36 = class143.field2597[class203.field3675][var19][var18];
                    if (var36 != null) {
                        for (class143 var37 = (class143) var36.method318(-68); var37 != null; var37 = (class143) var36.method322((byte) -105)) {
                            int var38 = var37.field2586.field1286;
                            class154 var39 = class214.method1408((byte) 102, var38);
                            if (class86.field1623 == 1) {
                                class206.field3707++;
                                class61.method450(-25300, (long) var38, class10.field358, var18, (short) 46, var19, class36.method316((byte) -34, new class117[] { class120.field2264, class212.field3855, var39.field2812 }));
                            } else if (!class82.field1543) {
                                class246.field4534++;
                                class117[] var40 = var39.field2761;
                                if (class159.field2909) {
                                    var40 = class149.method1067(true, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class231.field4150++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 44;
                                        }
                                        if (var41 == 1) {
                                            var42 = 42;
                                        }
                                        if (var41 == 2) {
                                            var42 = 57;
                                        }
                                        if (var41 == 3) {
                                            var42 = 23;
                                        }
                                        if (var41 == 4) {
                                            var42 = 15;
                                        }
                                        class61.method450(-25300, (long) var38, var40[var41], var18, var42, var19, class36.method316((byte) -34, new class117[] { class237.field4287, var39.field2812 }));
                                    } else if (var41 == 2) {
                                        class217.field3939++;
                                        class61.method450(-25300, (long) var38, class122.field2288, var18, (short) 57, var19, class36.method316((byte) -34, new class117[] { class237.field4287, var39.field2812 }));
                                    }
                                }
                                class61.method450(-25300, (long) var38, class36.field828, var18, (short) 1005, var19, class36.method316((byte) -34, new class117[] { class237.field4287, var39.field2812 }));
                            } else if ((class234.field4231 & 0x1) == 1) {
                                class88.field1640++;
                                class61.method450(-25300, (long) var38, class38.field878, var18, (short) 40, var19, class36.method316((byte) -34, new class117[] { class80.field1509, class212.field3855, var39.field2812 }));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Lkh;")
    public final class117 method802(int arg0, int arg1) {
        field2188++;
        if (arg1 != 1176819746) {
            field2182 = null;
        }
        return this.method781(true, arg0, this.field2213);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
    public final void method803(Applet arg0, byte arg1) throws Throwable {
        field2221++;
        String var3 = new String(this.field2196, 0, this.field2213);
        class63.method462(var3, -113, arg0);
        if (arg1 >= -97) {
            this.field2206 = false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)J")
    private final long method804(byte arg0) {
        if (arg0 != 92) {
            this.method821(null, -6, true);
        }
        field2157++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2213; var4++) {
            var2 = (var2 << 5) + (long) (this.field2196[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLkh;)I")
    public final int method805(boolean arg0, class117 arg1) {
        field2212++;
        int var3;
        if (this.field2213 > arg1.field2213) {
            var3 = arg1.field2213;
        } else {
            var3 = this.field2213;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field2196[var4] & 0xFF) < (arg1.field2196[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field2196[var4] & 0xFF) > (arg1.field2196[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field2213 < arg1.field2213) {
            return -1;
        }
        if (arg0) {
            this.method819((byte) -103);
        }
        if (arg1.field2213 < this.field2213) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZZ[Lah;II)V")
    public static final void method806(int arg0, boolean arg1, boolean arg2, class9[] arg3, int arg4, int arg5) {
        if (!arg2) {
            field2175 = null;
        }
        field2209++;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class9 var7 = arg3[var6];
            if (var7 != null && var7.field175 == arg0) {
                class76.method534(var7, arg5, arg1, arg4, -108);
                class44.method369(var7, arg5, -114, arg4);
                if (var7.field170 - var7.field256 < var7.field255) {
                    var7.field255 = var7.field170 - var7.field256;
                }
                if (var7.field255 < 0) {
                    var7.field255 = 0;
                }
                if (var7.field294 - var7.field207 < var7.field247) {
                    var7.field247 = var7.field294 - var7.field207;
                }
                if (var7.field247 < 0) {
                    var7.field247 = 0;
                }
                if (var7.field225 == 0) {
                    class201.method1338((byte) -87, arg1, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLkh;)Lkh;")
    public final class117 method807(byte arg0, class117 arg1) {
        field2198++;
        if (!this.field2206) {
            throw new IllegalArgumentException();
        }
        this.field2184 = 0;
        if (this.field2196.length < this.field2213 + arg1.field2213) {
            int var3;
            for (var3 = 1; var3 < this.field2213 + arg1.field2213; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class2.method9(this.field2196, 0, var4, 0, this.field2213);
            this.field2196 = var4;
        }
        class2.method9(arg1.field2196, 0, this.field2196, this.field2213, arg1.field2213);
        this.field2213 += arg1.field2213;
        if (arg0 != -8) {
            field2179 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method808(int arg0, int arg1, int arg2, Graphics arg3) {
        field2177++;
        if (arg1 != -18800) {
            this.method798((byte) 120);
        }
        String var5;
        try {
            var5 = new String(this.field2196, 0, this.field2213, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2196, 0, this.field2213);
        }
        arg3.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)Z")
    private final boolean method809(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field2163++;
        if (arg0 != 7877) {
            this.field2213 = -106;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field2213; var6++) {
            int var7 = this.field2196[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var5 = true;
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
            if (var7 >= arg1) {
                return false;
            }
            if (var5) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if (var8 / arg1 != var4) {
                return false;
            }
            var3 = true;
            var4 = var8;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(BLkh;)Z")
    public final boolean method810(byte arg0, class117 arg1) {
        field2189++;
        if (arg1 == null) {
            return false;
        } else if (this.field2213 == arg1.field2213) {
            if (!this.field2206 || !arg1.field2206) {
                if (this.field2184 == 0) {
                    this.field2184 = this.method818((byte) 24);
                    if (this.field2184 == 0) {
                        this.field2184 = 1;
                    }
                }
                if (arg1.field2184 == 0) {
                    arg1.field2184 = arg1.method818((byte) 24);
                    if (arg1.field2184 == 0) {
                        arg1.field2184 = 1;
                    }
                }
                if (this.field2184 != arg1.field2184) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field2213; var3++) {
                if (this.field2196[var3] != arg1.field2196[var3]) {
                    return false;
                }
            }
            if (arg0 != -50) {
                field2170 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Lkh;")
    public final class117 method811(int arg0) {
        field2210++;
        class117 var2 = new class117();
        var2.field2213 = this.field2213;
        var2.field2196 = new byte[this.field2213];
        byte var3 = 2;
        int var4 = 0;
        if (arg0 != -14443) {
            return null;
        }
        while (this.field2213 > var4) {
            byte var5 = this.field2196[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || !(var5 < -64 || var5 > -34 || var5 == -41)) {
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
            var2.field2196[var4] = var5;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
    public static final void method812(byte arg0) {
        if (arg0 > -125) {
            method782(false);
        }
        field2195++;
        class159.field2889.method503(10);
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)J")
    public final long method813(byte arg0) {
        if (arg0 != 93) {
            this.method802(71, 99);
        }
        long var2 = 0L;
        for (int var4 = 0; this.field2213 > var4 && var4 < 12; var4++) {
            byte var5 = this.field2196[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        field2169++;
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method814(int arg0, FontMetrics arg1) {
        field2158++;
        String var3;
        try {
            var3 = new String(this.field2196, 0, this.field2213, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2196, 0, this.field2213);
        }
        return arg0 == -31705 ? arg1.stringWidth(var3) : 123;
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(B)[B")
    public final byte[] method815(byte arg0) {
        field2166++;
        if (arg0 < 75) {
            field2225 = null;
        }
        byte[] var2 = new byte[this.field2213];
        class2.method9(this.field2196, 0, var2, 0, this.field2213);
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)I")
    public final int method816(int arg0, int arg1, int arg2) {
        field2167++;
        byte var4 = (byte) arg1;
        if (arg0 != 16323) {
            field2172 = 114;
        }
        for (int var5 = arg2; var5 < this.field2213; var5++) {
            if (this.field2196[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBIIIZ[Lab;[B)V")
    public static final void method817(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, class3[] arg6, byte[] arg7) {
        field2159++;
        if (!arg5) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg0 + var10 > 0 && arg0 + var10 < 103) {
                            arg6[var8].field45[arg2 + var9][arg0 + var10] = class209.method1370(arg6[var8].field45[arg2 + var9][arg0 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg5) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class145 var12 = new class145(arg7);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class48.method381(var12, arg5, 0, arg3, var13, arg4, arg0 + var15, (byte) 88, arg2 + var14);
                }
            }
        }
        if (arg1 != -127) {
            field2225 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(B)I")
    public final int method818(byte arg0) {
        field2174++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2213; var3++) {
            var2 = (var2 << 5) + (this.field2196[var3] & 0xFF) - var2;
        }
        if (arg0 != 24) {
            this.method819((byte) -108);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "(B)I")
    public final int method819(byte arg0) {
        field2180++;
        if (arg0 > -83) {
            this.field2206 = false;
        }
        return this.field2213;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)Lkh;")
    public final class117 method820(int arg0) {
        field2200++;
        class117 var2 = new class117();
        var2.field2213 = this.field2213;
        int var3 = 126 % ((-arg0 - 87) / 33);
        var2.field2196 = new byte[this.field2213];
        for (int var4 = 0; var4 < this.field2213; var4++) {
            byte var5 = this.field2196[var4];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var2.field2196[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lkh;IZ)I")
    public final int method821(class117 arg0, int arg1, boolean arg2) {
        field2178++;
        int[] var4 = new int[arg0.field2213];
        int[] var5 = new int[256];
        int[] var6 = new int[arg0.field2213];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg0.field2213;
        }
        for (int var8 = 1; var8 <= arg0.field2213; var8++) {
            var4[var8 - 1] = (arg0.field2213 << 1) - var8;
            var5[class209.method1370(255, arg0.field2196[var8 - 1])] = arg0.field2213 - var8;
        }
        int var9 = arg0.field2213 + 1;
        for (int var10 = arg0.field2213; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg0.field2213 && arg0.field2196[var9 - 1] != arg0.field2196[var10 - 1]) {
                if (var4[var9 - 1] >= arg0.field2213 - var10) {
                    var4[var9 - 1] = arg0.field2213 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = 1;
        int var12 = var9;
        int var13 = arg0.field2213 + 1 - var9;
        int var14 = 0;
        if (arg2) {
            this.method815((byte) -10);
        }
        for (int var15 = 1; var15 <= var13; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field2196[var14 - 1] != arg0.field2196[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (var12 < arg0.field2213) {
            for (int var18 = var11; var18 <= var12; var18++) {
                if (var4[var18 - 1] >= arg0.field2213 + var12 - var18) {
                    var4[var18 - 1] = arg0.field2213 + var12 - var18;
                }
            }
            var11 = var12 + 1;
            var12 = var12 + var13 - var6[var13 + -1];
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg0.field2213 + arg1 - 1; var16 < this.field2213; var16 += Math.max(var5[this.field2196[var16] & 0xFF], var4[var17])) {
            for (var17 = arg0.field2213 - 1; var17 >= 0 && this.field2196[var16] == arg0.field2196[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(ILkh;)Z")
    public final boolean method822(int arg0, class117 arg1) {
        field2155++;
        if (arg1.field2213 > this.field2213) {
            return false;
        }
        if (arg0 != 33) {
            field2179 = null;
        }
        for (int var3 = 0; var3 < arg1.field2213; var3++) {
            if (this.field2196[var3] != arg1.field2196[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)Ljava/net/URL;")
    public final URL method823(int arg0) throws MalformedURLException {
        if (arg0 != -2) {
            field2175 = null;
        }
        field2192++;
        return new URL(new String(this.field2196, 0, this.field2213));
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
    public static final void method824(int arg0) {
        class232.field4184.method503(10);
        field2205++;
        class90.field1680.method410((byte) 71);
        if (arg0 != -1) {
            method817(45, (byte) 60, 70, 64, 34, false, null, null);
        }
        class38.field874.method410((byte) 71);
        class12.field391.method410((byte) 71);
    }

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "(B)I")
    public final int method825(byte arg0) {
        field2181++;
        return arg0 >= -46 ? -119 : this.method778((byte) -102, 10);
    }

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "(B)V")
    public final void method826(byte arg0) {
        field2161++;
        String var2;
        try {
            var2 = new String(this.field2196, 0, this.field2213, "ISO-8859-1");
            if (arg0 != -99) {
                this.field2196 = null;
            }
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field2196, 0, this.field2213);
        }
        System.out.println(var2);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method827(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
