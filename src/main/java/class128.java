import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class128 implements class35 {

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "Z")
    private boolean field2195 = true;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lmh;")
    private static class128 field2172 = class22.method156(125, "Drop");

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field2205 = -1;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "Lmh;")
    public static class128 field2211 = field2172;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lmh;")
    public static class128 field2166 = class22.method156(125, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "[I")
    public static int[] field2219 = new int[25];

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Lmh;")
    private static class128 field2200 = class22.method156(127, "Allocating memory");

    @OriginalMember(owner = "client!mh", name = "mb", descriptor = "[[I")
    public static int[][] field2229 = new int[104][104];

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lmh;")
    public static class128 field2218 = field2200;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    private int field2212;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!mh", name = "jb", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!mh", name = "kb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!mh", name = "lb", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!mh", name = "nb", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!mh", name = "ob", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "J")
    public static long field2186;

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "[B")
    public byte[] field2224;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "[I")
    public static int[] field2177;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "[I")
    public static int[] field2222;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)I", line = 9)
    public final int method816(int arg0, boolean arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = arg1;
        field2185++;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2181; var6++) {
            int var7 = this.field2224[var6] & 0xFF;
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
                throw new NumberFormatException();
            }
            if (arg0 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILmh;)I", line = 90)
    public final int method817(int arg0, int arg1, class128 arg2) {
        int[] var4 = new int[256];
        int[] var5 = new int[arg2.field2181];
        field2202++;
        int[] var6 = new int[arg2.field2181];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg2.field2181;
        }
        for (int var8 = 1; var8 <= arg2.field2181; var8++) {
            var6[var8 - 1] = (arg2.field2181 << 1) - var8;
            var4[class238.method1622(arg2.field2224[var8 - 1], 255)] = arg2.field2181 - var8;
        }
        int var9 = arg2.field2181 + 1;
        int var10 = arg2.field2181;
        while (var10 > 0) {
            var5[var10 - 1] = var9;
            while (arg2.field2181 >= var9 && arg2.field2224[var9 - 1] != arg2.field2224[var10 - 1]) {
                if (arg2.field2181 - var10 <= var6[var9 + -1]) {
                    var6[var9 - 1] = arg2.field2181 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field2181 + 1 - var9;
        int var13 = 1;
        int var14 = arg0;
        int var15 = 1;
        while (var12 >= var15) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field2224[var15 - 1] != arg2.field2224[var14 - 1]) {
                var14 = var5[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg2.field2181) {
            for (int var16 = var13; var16 <= var11; var16++) {
                if (arg2.field2181 + var11 - var16 <= var6[var16 + -1]) {
                    var6[var16 - 1] = arg2.field2181 + var11 - var16;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var5[var12 + -1];
            var12 = var5[var12 - 1];
        }
        int var18;
        for (int var17 = arg2.field2181 + arg1 - 1; var17 < this.field2181; var17 += Math.max(var4[this.field2224[var17] & 0xFF], var6[var18])) {
            for (var18 = arg2.field2181 - 1; var18 >= 0 && this.field2224[var17] == arg2.field2224[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mh", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 196)
    public final boolean equals(Object arg0) {
        field2217++;
        if (!arg0 instanceof class128) {
            throw new IllegalArgumentException();
        }
        return this.method855((class128) arg0, 255);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Lmh;", line = 210)
    public final class128 method818(int arg0) {
        field2213++;
        if (arg0 != -8206) {
            this.method827((byte) -65);
        }
        class128 var2 = class260.method1827(true, this.method819((byte) 118));
        return var2 == null ? class70.field1313 : var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)J", line = 227)
    public final long method819(byte arg0) {
        field2227++;
        if (arg0 <= 90) {
            this.method851(-36, 33);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2181 && var4 < 12; var4++) {
            byte var5 = this.field2224[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 - 64);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 - 96);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (27 - (48 - var5));
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)Lmh;", line = 266)
    public final class128 method820(byte arg0) {
        field2209++;
        class128 var2 = new class128();
        var2.field2181 = this.field2181;
        var2.field2224 = new byte[var2.field2181];
        int var3 = 0;
        if (arg0 != -114) {
            return (class128) null;
        }
        while (this.field2181 > var3) {
            var2.field2224[this.field2181 - var3 - 1] = this.field2224[var3];
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Z", line = 287)
    public final boolean method821(int arg0) {
        field2184++;
        if (arg0 != -3677) {
            this.method826(72, (class128) null);
        }
        return this.method851(10, 126);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILmh;)Z", line = 301)
    public final boolean method822(int arg0, class128 arg1) {
        field2198++;
        if (this.field2181 < arg1.field2181) {
            return false;
        } else if (arg0 == 12806) {
            for (int var3 = 0; var3 < arg1.field2181; var3++) {
                byte var4 = this.field2224[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field2224[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;Z)I", line = 350)
    public final int method823(class128 arg0, boolean arg1) {
        if (!arg1) {
            method864(32);
        }
        field2168++;
        return this.method817(0, 0, arg0);
    }

    @OriginalMember(owner = "client!mh", name = "toString", descriptor = "()Ljava/lang/String;", line = 363)
    public final String toString() {
        field2215++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([BIIBI)I", line = 383)
    public final int method824(byte[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2175++;
        if (arg3 <= 119) {
            return -79;
        } else {
            class224.method1546(this.field2224, arg1, arg0, arg2, arg4 - arg1);
            return arg4 - arg1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)[B", line = 395)
    public final byte[] method825(int arg0) {
        if (arg0 != -24750) {
            this.method839((byte) -105);
        }
        field2208++;
        byte[] var2 = new byte[this.field2181];
        class224.method1546(this.field2224, 0, var2, 0, this.field2181);
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(ILmh;)Z", line = 409)
    public final boolean method826(int arg0, class128 arg1) {
        field2216++;
        if (arg0 != -15181) {
            return false;
        } else if (this.field2181 >= arg1.field2181) {
            int var3 = this.field2181 - arg1.field2181;
            for (int var4 = 0; var4 < arg1.field2181; var4++) {
                if (this.field2224[var3 + var4] != arg1.field2224[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)J", line = 442)
    public final long method827(byte arg0) {
        field2203++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2181; var4++) {
            var2 = (var2 << 5) + (long) (this.field2224[var4] & 0xFF) - var2;
        }
        int var5 = -30 % ((arg0 - 74) / 49);
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)I", line = 462)
    public final int method828(byte arg0, int arg1) {
        if (arg0 == 48) {
            field2189++;
            return this.field2224[arg1] & 0xFF;
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)Lmh;", line = 474)
    public final class128 method829(int arg0, byte arg1) {
        field2196++;
        return arg1 < 103 ? (class128) null : this.method848(arg0, 113, this.field2181);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Lmh;", line = 487)
    public final class128 method830(int arg0, int arg1) {
        field2190++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class128 var3 = new class128();
        var3.field2224 = new byte[this.field2181 + arg0];
        var3.field2181 = this.field2181 + 1;
        class224.method1546(this.field2224, 0, var3.field2224, 0, this.field2181);
        var3.field2224[this.field2181] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)Lmh;", line = 505)
    public final class128 method831(boolean arg0, int arg1) {
        field2169++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field2195) {
            this.field2212 = 0;
            if (this.field2224.length == this.field2181) {
                int var3;
                for (var3 = 1; var3 <= this.field2181; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class224.method1546(this.field2224, 0, var4, 0, this.field2181);
                this.field2224 = var4;
            }
            this.field2224[this.field2181++] = (byte) arg1;
            return arg0 ? (class128) null : this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)Lmh;", line = 548)
    public final class128 method832(int arg0) {
        field2170++;
        int var2 = this.field2181;
        int var3;
        for (var3 = 0; var3 < this.field2181 && (this.field2224[var3] >= 0 && this.field2224[var3] <= 32 || (this.field2224[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field2224[var2 - 1] >= 0 && this.field2224[var2 - 1] <= 32 || (this.field2224[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (~var3 == arg0 && this.field2181 == var2) {
            return this;
        }
        class128 var4 = new class128();
        var4.field2181 = var2 - var3;
        var4.field2224 = new byte[var4.field2181];
        for (int var5 = 0; var5 < var4.field2181; var5++) {
            var4.field2224[var5] = this.field2224[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)[Lmh;", line = 585)
    public final class128[] method833(int arg0, byte arg1) {
        field2187++;
        if (arg1 <= 36) {
            this.method823((class128) null, true);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2181; var4++) {
            if (this.field2224[var4] == arg0) {
                var3++;
            }
        }
        class128[] var5 = new class128[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field2224[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method848(var7, 75, var7 + var9);
            var7 += var9 + 1;
        }
        var5[var3] = this.method848(var7, 93, this.field2181);
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/applet/Applet;Z)V", line = 638)
    public final void method834(Applet arg0, boolean arg1) throws Throwable {
        field2214++;
        String var3 = new String(this.field2224, 0, this.field2181);
        if (!arg1) {
            class131.method879(arg0, (byte) 70, var3);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;B)I", line = 652)
    public final int method835(class128 arg0, byte arg1) {
        int var3 = 32 / ((-arg1 - 4) / 57);
        int var4;
        if (arg0.field2181 >= this.field2181) {
            var4 = this.field2181;
        } else {
            var4 = arg0.field2181;
        }
        field2192++;
        for (int var5 = 0; var5 < var4; var5++) {
            if ((this.field2224[var5] & 0xFF) < (arg0.field2224[var5] & 0xFF)) {
                return -1;
            }
            if ((arg0.field2224[var5] & 0xFF) < (this.field2224[var5] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field2181 > this.field2181) {
            return -1;
        } else if (arg0.field2181 < this.field2181) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)Lmh;", line = 695)
    public final class128 method836(byte arg0) {
        field2165++;
        if (arg0 != 72) {
            this.method846(-96);
        }
        class128 var2 = new class128();
        var2.field2181 = this.field2181;
        var2.field2224 = new byte[this.field2181];
        for (int var3 = 0; var3 < this.field2181; var3++) {
            byte var4 = this.field2224[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2224[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLem;)V", line = 728)
    public static final void method837(byte arg0, class10 arg1) {
        field2199++;
        class10 var2 = class225.method1552(-127, arg1);
        int var3 = 77 % ((arg0 + 44) / 56);
        int var4;
        int var5;
        if (var2 == null) {
            var5 = class199.field3465;
            var4 = class16.field420;
        } else {
            var4 = var2.field226;
            var5 = var2.field260;
        }
        class216.method1491(arg1, false, var4, -5348, var5);
        class147.method984(var5, var4, arg1, -126);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;I)Z", line = 758)
    public final boolean method838(class128 arg0, int arg1) {
        field2197++;
        if (arg0.field2181 > this.field2181) {
            return false;
        }
        if (arg1 != -9650) {
            field2186 = 79L;
        }
        for (int var3 = 0; var3 < arg0.field2181; var3++) {
            if (this.field2224[var3] != arg0.field2224[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "hashCode", descriptor = "()I", line = 786)
    public final int hashCode() {
        field2206++;
        return this.method863(5889);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)V", line = 806)
    public final void method839(byte arg0) {
        field2182++;
        String var2;
        try {
            var2 = new String(this.field2224, 0, this.field2181, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field2224, 0, this.field2181);
        }
        if (arg0 == -61) {
            System.out.println(var2);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)Lmh;", line = 826)
    public final class128 method840(byte arg0, int arg1, int arg2) {
        if (arg0 >= -49) {
            this.method865((byte) -2);
        }
        field2204++;
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg1;
        class128 var6 = new class128();
        var6.field2181 = this.field2181;
        var6.field2224 = new byte[this.field2181];
        for (int var7 = 0; var7 < this.field2181; var7++) {
            byte var8 = this.field2224[var7];
            if (var4 == var8) {
                var6.field2224[var7] = var5;
            } else {
                var6.field2224[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)Ljava/net/URL;", line = 860)
    public final URL method841(boolean arg0) throws MalformedURLException {
        field2171++;
        if (arg0) {
            field2177 = (int[]) null;
        }
        return new URL(new String(this.field2224, 0, this.field2181));
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;ILmh;)Lmh;", line = 871)
    public final class128 method842(class128 arg0, int arg1, class128 arg2) {
        field2180++;
        int var4 = this.field2181;
        int var5 = arg1;
        int var6 = arg0.field2181 - arg2.field2181;
        while (true) {
            int var7 = this.method817(0, var5, arg2);
            if (var7 < 0) {
                int var8 = 0;
                class128 var9 = class4.method25(arg1 ^ 0x68, var4);
                while (true) {
                    int var10 = this.method817(0, var8, arg2);
                    if (var10 < 0) {
                        while (var8 < this.field2181) {
                            var9.method831(false, this.field2224[var8++] & 0xFF);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method831(false, this.field2224[var8++] & 0xFF);
                    }
                    var9.method847(true, arg0);
                    var8 += arg2.field2181;
                }
            }
            var4 += var6;
            var5 = arg2.field2181 + var7;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLjava/applet/Applet;)Ljava/lang/Object;", line = 938)
    public final Object method843(boolean arg0, Applet arg1) throws Throwable {
        field2188++;
        if (!arg0) {
            field2172 = (class128) null;
        }
        String var3 = new String(this.field2224, 0, this.field2181);
        Object var4 = class131.method880(var3, (byte) -37, arg1, (Object[]) null);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class220.method1520(var5.length, (byte) 101, 0, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/net/URL;)Ljava/net/URL;", line = 961)
    public final URL method844(byte arg0, URL arg1) throws MalformedURLException {
        field2183++;
        return arg0 < 11 ? (URL) null : new URL(arg1, new String(this.field2224, 0, this.field2181));
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)I", line = 991)
    public final int method845(byte arg0) {
        field2221++;
        if (arg0 >= -117) {
            field2218 = (class128) null;
        }
        return this.method816(10, false);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)Lmh;", line = 1015)
    public final class128 method846(int arg0) {
        if (arg0 < 114) {
            field2166 = (class128) null;
        }
        field2179++;
        if (!this.field2195) {
            throw new IllegalArgumentException();
        }
        this.field2212 = 0;
        if (this.field2224.length != this.field2181) {
            byte[] var2 = new byte[this.field2181];
            class224.method1546(this.field2224, 0, var2, 0, this.field2181);
            this.field2224 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLmh;)Lmh;", line = 1044)
    public final class128 method847(boolean arg0, class128 arg1) {
        field2231++;
        if (!arg0) {
            this.method840((byte) -71, 94, 88);
        }
        if (!this.field2195) {
            throw new IllegalArgumentException();
        }
        this.field2212 = 0;
        if (this.field2224.length < this.field2181 + arg1.field2181) {
            int var3;
            for (var3 = 1; var3 < this.field2181 + arg1.field2181; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class224.method1546(this.field2224, 0, var4, 0, this.field2181);
            this.field2224 = var4;
        }
        class224.method1546(arg1.field2224, 0, this.field2224, this.field2181, arg1.field2181);
        this.field2181 += arg1.field2181;
        return this;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Lmh;", line = 1081)
    public final class128 method848(int arg0, int arg1, int arg2) {
        if (arg1 < 74) {
            return (class128) null;
        }
        field2193++;
        class128 var4 = new class128();
        var4.field2181 = arg2 - arg0;
        var4.field2224 = new byte[arg2 - arg0];
        class224.method1546(this.field2224, arg0, var4.field2224, 0, var4.field2181);
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)Lmh;", line = 1099)
    public final class128 method849(boolean arg0) {
        field2201++;
        long var2 = this.method827((byte) 126);
        synchronized (mh.class) {
            if (class306.field5214 == null) {
                class306.field5214 = new class120(4096);
            } else {
                for (class57 var5 = (class57) class306.field5214.method728(!arg0, var2); var5 != null; var5 = (class57) class306.field5214.method734(3069)) {
                    if (this.method855(var5.field1096, 255)) {
                        return var5.field1096;
                    }
                }
            }
            class57 var6 = new class57();
            this.field2195 = false;
            var6.field1096 = this;
            class306.field5214.method730(var6, var2, (byte) 126);
            if (!arg0) {
                this.method850(86);
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)Lmh;", line = 1138)
    public final class128 method850(int arg0) {
        if (arg0 != 55) {
            this.equals((Object) null);
        }
        class128 var2 = new class128();
        field2167++;
        var2.field2181 = this.field2181;
        boolean var3 = true;
        var2.field2224 = new byte[this.field2181];
        for (int var4 = 0; var4 < this.field2181; var4++) {
            byte var5 = this.field2224[var4];
            if (var5 == 95) {
                var2.field2224[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field2224[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field2224[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Z", line = 1184)
    private final boolean method851(int arg0, int arg1) {
        field2210++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 < 120) {
            return false;
        }
        for (int var6 = 0; var6 < this.field2181; var6++) {
            int var7 = this.field2224[var6] & 0xFF;
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
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IB)V", line = 1258)
    public final void method852(int arg0, byte arg1) {
        if (arg1 <= 5) {
            return;
        }
        this.field2212 = 0;
        field2174++;
        if (!this.field2195) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field2224.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class224.method1546(this.field2224, 0, var4, 0, this.field2181);
                this.field2224 = var4;
            }
            for (int var5 = this.field2181; var5 < arg0; var5++) {
                this.field2224[var5] = 32;
            }
            this.field2181 = arg0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Lmh;I)I", line = 1318)
    public final int method853(class128 arg0, int arg1) {
        field2207++;
        int var3 = 0;
        int var4 = this.field2181;
        int var5 = arg0.field2181;
        int var6 = 0;
        int var7 = this.field2181;
        int var8 = arg0.field2181;
        int var9 = 0;
        int var10 = 0;
        while (var4 != 0 && var5 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field2224[var9] & 0xFF;
                var9++;
            }
            if (class196.method1361(6, var3)) {
                var7++;
            } else {
                var4--;
            }
            if (var6 == 156 || var6 == 230) {
                var6 = 101;
            } else if (var6 == 140 || var6 == 198) {
                var6 = 69;
            } else if (var6 == 223) {
                var6 = 115;
            } else {
                var6 = arg0.field2224[var10] & 0xFF;
                var10++;
            }
            if (class196.method1361(arg1 ^ 0xFFFFA90E, var6)) {
                var8++;
            } else {
                var5--;
            }
            if (class290.field4967[var6] > class290.field4967[var3]) {
                return -1;
            }
            if (class290.field4967[var6] < class290.field4967[var3]) {
                return 1;
            }
        }
        if (arg1 != -22264) {
            this.field2195 = false;
        }
        if (var7 >= var8) {
            return var8 < var7 ? 1 : 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(IB)I", line = 1407)
    public final int method854(int arg0, byte arg1) {
        field2225++;
        byte var3 = (byte) arg0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 >= -41) {
            return 35;
        }
        while (var5 < this.field2181) {
            if (this.field2224[var5] == var3) {
                var4++;
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Lmh;I)Z", line = 1436)
    public final boolean method855(class128 arg0, int arg1) {
        field2226++;
        if (arg1 != 255) {
            this.method866((byte) 51, (Applet) null);
        }
        if (arg0 == null) {
            return false;
        } else if (this.field2181 == arg0.field2181) {
            if (!this.field2195 || !arg0.field2195) {
                if (this.field2212 == 0) {
                    this.field2212 = this.method863(5889);
                    if (this.field2212 == 0) {
                        this.field2212 = 1;
                    }
                }
                if (arg0.field2212 == 0) {
                    arg0.field2212 = arg0.method863(5889);
                    if (arg0.field2212 == 0) {
                        arg0.field2212 = 1;
                    }
                }
                if (this.field2212 != arg0.field2212) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field2181; var3++) {
                if (this.field2224[var3] != arg0.field2224[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)Lmh;", line = 1501)
    public final class128 method856(int arg0) {
        field2230++;
        int var2 = -75 / ((-arg0 - 45) / 43);
        class128 var3 = new class128();
        var3.field2181 = this.field2181;
        var3.field2224 = new byte[this.field2181];
        byte var4 = 2;
        for (int var5 = 0; var5 < this.field2181; var5++) {
            byte var6 = this.field2224[var5];
            if (!(var6 < 97 || var6 > 122) || !(var6 < -32 || var6 > -2 || var6 == -9)) {
                if (var4 == 2) {
                    var6 = (byte) (var6 - 32);
                }
                var4 = 0;
            } else if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                if (var4 == 0) {
                    var6 = (byte) (var6 + 32);
                }
                var4 = 0;
            } else if (var6 == 46 || var6 == 33 || var6 == 63) {
                var4 = 2;
            } else if (var6 != 32) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3.field2224[var5] = var6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 1563)
    public final int method857(byte arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field2224, 0, this.field2181, "ISO-8859-1");
            if (arg0 != 67) {
                this.method856(5);
            }
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field2224, 0, this.field2181);
        }
        field2228++;
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILmh;)Lmh;", line = 1581)
    public final class128 method858(int arg0, int arg1, int arg2, class128 arg3) {
        field2173++;
        if (!this.field2195) {
            throw new IllegalArgumentException();
        }
        if (arg1 != 48) {
            this.method820((byte) 111);
        }
        if (arg2 < 0 || arg0 < arg2 || arg0 > arg3.field2181) {
            throw new IllegalArgumentException();
        }
        this.field2212 = 0;
        if (this.field2224.length < (arg0 + this.field2181 - arg2)) {
            int var5;
            for (var5 = 1; var5 < (this.field2181 + arg3.field2181); var5 += var5) {
            }
            byte[] var6 = new byte[var5];
            class224.method1546(this.field2224, 0, var6, 0, this.field2181);
            this.field2224 = var6;
        }
        class224.method1546(arg3.field2224, arg2, this.field2224, this.field2181, arg0 - arg2);
        this.field2181 += arg0 - arg2;
        return this;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 1626)
    public final void method859(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -24650) {
            this.field2181 = -104;
        }
        field2194++;
        String var5;
        try {
            var5 = new String(this.field2224, 0, this.field2181, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field2224, 0, this.field2181);
        }
        arg0.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V", line = 1651)
    public static final void method860(int arg0, int arg1) {
        class150 var2 = class182.field3184[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class150 var4 = class182.field3184[var3][arg0][arg1] = class182.field3184[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2590--;
                for (int var5 = 0; var5 < var4.field2576; var5++) {
                    class5 var6 = var4.field2575[var5];
                    if ((var6.field89 >> 29 & 0x3L) == 2L && var6.field92 == arg0 && var6.field88 == arg1) {
                        var6.field100--;
                    }
                }
            }
        }
        if (class182.field3184[0][arg0][arg1] == null) {
            class182.field3184[0][arg0][arg1] = new class150(0, arg0, arg1);
        }
        class182.field3184[0][arg0][arg1].field2589 = var2;
        class182.field3184[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(ILmh;)Z", line = 1704)
    public final boolean method861(int arg0, class128 arg1) {
        field2220++;
        if (arg1 == null) {
            return false;
        } else if (this.field2181 != arg1.field2181) {
            return false;
        } else if (arg0 == 10362) {
            for (int var3 = 0; var3 < this.field2181; var3++) {
                byte var4 = this.field2224[var3];
                byte var5 = arg1.field2224[var3];
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
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)I", line = 1753)
    public final int method862(int arg0, int arg1, int arg2) {
        field2176++;
        byte var4 = (byte) arg0;
        int var5 = arg2;
        if (arg1 >= -4) {
            return -6;
        }
        while (var5 < this.field2181) {
            if (this.field2224[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)I", line = 1786)
    public final int method863(int arg0) {
        if (arg0 != 5889) {
            this.method824((byte[]) null, 62, -27, (byte) -4, 49);
        }
        field2223++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2181; var3++) {
            var2 = (var2 << 5) + (this.field2224[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "(I)V", line = 1807)
    public static void method864(int arg0) {
        field2166 = null;
        field2172 = null;
        field2222 = null;
        field2177 = null;
        field2200 = null;
        if (arg0 >= -2) {
            method837((byte) -35, (class10) null);
        }
        field2211 = null;
        field2218 = null;
        field2219 = null;
        field2229 = (int[][]) null;
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(B)I", line = 1827)
    public final int method865(byte arg0) {
        int var2 = 124 % ((-arg0) / 56);
        field2191++;
        return this.field2181;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/applet/Applet;)Lmh;", line = 1849)
    public final class128 method866(byte arg0, Applet arg1) {
        field2178++;
        String var3 = new String(this.field2224, 0, this.field2181);
        String var4 = arg1.getParameter(var3);
        if (arg0 > -105) {
            field2200 = (class128) null;
        }
        return var4 == null ? null : class143.method952(var4, (byte) 99);
    }
}
