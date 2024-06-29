import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 implements class77 {

    @OriginalMember(owner = "client!od", name = "R", descriptor = "Z")
    private boolean field2217 = true;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Lod;")
    public static class101 field2195 = class46.method335(101, "headicons_pk");

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field2205 = 0;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lod;")
    public static class101 field2188 = class46.method335(119, "<col=80ff00>");

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lod;")
    public static class101 field2181 = class46.method335(124, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Lod;")
    public static class101 field2213 = class46.method335(104, "T");

    @OriginalMember(owner = "client!od", name = "K", descriptor = "Lod;")
    private static class101 field2210 = class46.method335(-79, "Use");

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Lod;")
    public static class101 field2224 = class46.method335(89, "Untersuchen");

    @OriginalMember(owner = "client!od", name = "I", descriptor = "Lod;")
    public static class101 field2208 = field2210;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lod;")
    private static class101 field2185 = class46.method335(89, " ");

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lod;")
    public static class101 field2176 = field2185;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "Lod;")
    public static class101 field2227 = class46.method335(120, ":duelreq:");

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    private int field2204;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field2234;

    // $FF: synthetic field
    @OriginalMember(owner = "client!od", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field2235;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "[B")
    public byte[] field2223;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Lod;")
    public final class101 method699(byte arg0) {
        field2178++;
        if (arg0 > -13) {
            field2176 = null;
        }
        class101 var2 = new class101();
        var2.field2231 = this.field2231;
        var2.field2223 = new byte[this.field2231];
        for (int var3 = 0; var3 < this.field2231; var3++) {
            var2.field2223[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Lod;")
    public final class101 method700(int arg0, byte arg1) {
        field2203++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field2217) {
            this.field2204 = 0;
            if (this.field2223.length == this.field2231) {
                int var3;
                for (var3 = 1; var3 <= this.field2231; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class60.method417(this.field2223, 0, var4, 0, this.field2231);
                this.field2223 = var4;
            }
            this.field2223[this.field2231++] = (byte) arg0;
            if (arg1 != -11) {
                this.method729((byte) 91);
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lod;B)I")
    public final int method701(class101 arg0, byte arg1) {
        field2184++;
        if (arg1 != 56) {
            field2210 = null;
        }
        int var3;
        if (arg0.field2231 >= this.field2231) {
            var3 = this.field2231;
        } else {
            var3 = arg0.field2231;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field2223[var4] & 0xFF) > (this.field2223[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field2223[var4] & 0xFF) < (this.field2223[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field2231 > this.field2231) {
            return -1;
        } else if (arg0.field2231 < this.field2231) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)I")
    public final int method702(byte arg0, int arg1) {
        if (arg0 > -34) {
            this.field2231 = 56;
        }
        field2228++;
        return this.method706(0, (byte) -16, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILod;)Z")
    public final boolean method703(int arg0, class101 arg1) {
        field2216++;
        if (arg1 == null) {
            return false;
        } else if (this.field2231 == arg1.field2231) {
            if (!this.field2217 || !arg1.field2217) {
                if (this.field2204 == 0) {
                    this.field2204 = this.method734(true);
                    if (this.field2204 == 0) {
                        this.field2204 = 1;
                    }
                }
                if (arg1.field2204 == 0) {
                    arg1.field2204 = arg1.method734(true);
                    if (arg1.field2204 == 0) {
                        arg1.field2204 = 1;
                    }
                }
                if (this.field2204 != arg1.field2204) {
                    return false;
                }
            }
            for (int var3 = arg0; var3 < this.field2231; var3++) {
                if (this.field2223[var3] != arg1.field2223[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static final void method704(int arg0) {
        class92.field1979.method135(arg0 + 28346);
        if (arg0 != -28346) {
            field2189 = -114;
        }
        class112.field2398.method135(0);
        class42.field1013.method135(0);
        field2222++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Ljava/net/URL;")
    public final URL method705(byte arg0) throws MalformedURLException {
        field2198++;
        return arg0 == -125 ? new URL(new String(this.field2223, 0, this.field2231)) : null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)I")
    private final int method706(int arg0, byte arg1, int arg2) {
        field2174++;
        byte var4 = (byte) arg2;
        int var5 = arg0;
        if (arg1 != -16) {
            field2181 = null;
        }
        while (var5 < this.field2231) {
            if (this.field2223[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(BI)Lod;")
    public final class101 method707(byte arg0, int arg1) {
        if (arg0 != 101) {
            this.method735(false, null);
        }
        field2219++;
        return this.method725(arg1, -114, this.field2231);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLod;)I")
    public final int method708(byte arg0, class101 arg1) {
        if (arg0 <= 56) {
            return -30;
        } else {
            field2179++;
            return this.method736(0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lod;")
    public final class101 method709(int arg0) {
        field2177++;
        class101 var2 = new class101();
        if (arg0 != 18419) {
            this.method700(-68, (byte) 49);
        }
        int var3 = 0;
        var2.field2231 = 0;
        var2.field2223 = new byte[12];
        for (int var4 = 0; var4 < this.field2231; var4++) {
            if (this.field2223[var4] >= 65 && this.field2223[var4] <= 90) {
                var2.field2223[var3++] = (byte) (this.field2223[var4] + 97 - 65);
                var2.field2231 = var3;
            } else if (this.field2223[var4] >= 97 && this.field2223[var4] <= 122 || this.field2223[var4] >= 48 && this.field2223[var4] <= 57) {
                var2.field2223[var3++] = this.field2223[var4];
                var2.field2231 = var3;
            } else if (var3 > 0) {
                var2.field2223[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lod;I)Z")
    public final boolean method710(class101 arg0, int arg1) {
        field2186++;
        if (arg0 == null) {
            return false;
        } else if (this.field2231 == arg0.field2231) {
            int var3 = 0;
            if (arg1 != 6587) {
                field2188 = null;
            }
            while (this.field2231 > var3) {
                byte var4 = this.field2223[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field2223[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method711(int arg0, Graphics arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field2223, arg3, this.field2231, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2223, 0, this.field2231);
        }
        arg1.drawString(var5, arg2, arg0);
        field2199++;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)[B")
    public final byte[] method712(byte arg0) {
        byte[] var2 = new byte[this.field2231];
        class60.method417(this.field2223, 0, var2, 0, this.field2231);
        field2221++;
        return arg0 > -20 ? null : var2;
    }

    @OriginalMember(owner = "client!od", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2211++;
        if (!(arg0 instanceof class101)) {
            throw new IllegalArgumentException();
        }
        return this.method703(0, (class101) arg0);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Lod;I)Z")
    public final boolean method713(class101 arg0, int arg1) {
        field2209++;
        if (arg0.field2231 > this.field2231) {
            return false;
        }
        if (arg1 != -22411) {
            this.method709(-22);
        }
        for (int var3 = 0; var3 < arg0.field2231; var3++) {
            if (this.field2223[var3] != arg0.field2223[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Lod;")
    public final class101 method714(int arg0) {
        if (arg0 > -112) {
            return null;
        }
        field2192++;
        boolean var2 = true;
        class101 var3 = new class101();
        var3.field2231 = this.field2231;
        var3.field2223 = new byte[this.field2231];
        for (int var4 = 0; var4 < this.field2231; var4++) {
            byte var5 = this.field2223[var4];
            if (var5 == 95) {
                var3.field2223[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var2 = false;
                var3.field2223[var4] = (byte) (var5 - 32);
            } else {
                var3.field2223[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(BI)Lod;")
    public final class101 method715(byte arg0, int arg1) {
        field2232++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        int var3 = 123 / ((37 - arg0) / 50);
        class101 var4 = new class101();
        var4.field2223 = new byte[this.field2231 + 1];
        var4.field2231 = this.field2231 + 1;
        class60.method417(this.field2223, 0, var4.field2223, 0, this.field2231);
        var4.field2223[this.field2231] = (byte) arg1;
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)I")
    public final int method716(int arg0) {
        field2218++;
        if (arg0 != 7987) {
            this.method712((byte) -84);
        }
        return this.method723((byte) 112, 10);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)J")
    public final long method717(int arg0) {
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != -96) {
            this.method735(false, null);
        }
        while (var4 < this.field2231 && var4 < 12) {
            var2 *= 37L;
            byte var5 = this.field2223[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
            var4++;
        }
        field2233++;
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)Z")
    public static final boolean method718(int arg0, int arg1, int arg2, int arg3) {
        field2214++;
        int var4 = arg1 >> 14 & 0x7FFF;
        int var5 = class33.field857.method554(class95.field2040, arg0, arg2, arg1);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class24 var8 = class94.method652(var4, 0);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field613;
                var9 = var8.field599;
            } else {
                var9 = var8.field613;
                var10 = var8.field599;
            }
            int var11 = var8.field609;
            if (var7 != 0) {
                var11 = (var11 << var7 & 0xF) + (var11 >> 4 - var7);
            }
            class40.method306(arg2, var10, 0, var9, true, class82.field1778.field1291[0], class82.field1778.field1271[0], var11, 0, arg0, 2, (byte) 47);
        } else {
            class40.method306(arg2, 0, var7, 0, true, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, var6 + 1, arg0, 2, (byte) 47);
        }
        class83.field1817 = arg3;
        class140.field3228 = class80.field1684;
        class86.field1909 = 2;
        class27.field718 = class147.field3369;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIZZZ)Lt;")
    public static final class132 method719(boolean arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        if (!arg0) {
            field2210 = null;
        }
        class96 var5 = null;
        field2175++;
        if (class49.field1165 != null) {
            var5 = new class96(arg1, class49.field1165, class155.field3525[arg1], 1000000);
        }
        return new class132(var5, class125.field2725, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(BI)Z")
    private final boolean method720(byte arg0, int arg1) {
        field2180++;
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 12 % ((-arg0 - 56) / 54);
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2231; var7++) {
            int var8 = this.field2223[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
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
                return false;
            }
            if (var8 >= arg1) {
                return false;
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var6 + var8;
            if (var9 / arg1 != var6) {
                return false;
            }
            var6 = var9;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method721(FontMetrics arg0, int arg1) {
        if (arg1 <= 68) {
            field2227 = null;
        }
        field2196++;
        String var3;
        try {
            var3 = new String(this.field2223, 0, this.field2231, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2223, 0, this.field2231);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)Z")
    public final boolean method722(int arg0) {
        field2215++;
        int var2 = 41 % ((arg0 - 45) / 32);
        return this.method720((byte) -125, 10);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(BI)I")
    public final int method723(byte arg0, int arg1) {
        field2187++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        if (arg0 <= 82) {
            this.method734(true);
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2231; var6++) {
            int var7 = this.field2223[var6] & 0xFF;
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
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lod;Z)Lod;")
    public final class101 method724(class101 arg0, boolean arg1) {
        field2202++;
        if (!this.field2217) {
            throw new IllegalArgumentException();
        }
        if (!arg1) {
            field2189 = -45;
        }
        this.field2204 = 0;
        if (this.field2231 + arg0.field2231 > this.field2223.length) {
            int var3;
            for (var3 = 1; var3 < this.field2231 + arg0.field2231; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class60.method417(this.field2223, 0, var4, 0, this.field2231);
            this.field2223 = var4;
        }
        class60.method417(arg0.field2223, 0, this.field2223, this.field2231, arg0.field2231);
        this.field2231 += arg0.field2231;
        return this;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Lod;")
    public final class101 method725(int arg0, int arg1, int arg2) {
        field2212++;
        if (arg1 >= -98) {
            return null;
        }
        class101 var4 = new class101();
        var4.field2231 = arg2 - arg0;
        var4.field2223 = new byte[arg2 - arg0];
        class60.method417(this.field2223, arg0, var4.field2223, 0, var4.field2231);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lod;")
    public final class101 method726(boolean arg0) {
        field2220++;
        int var2;
        for (var2 = 0; var2 < this.field2231 && (this.field2223[var2] >= 0 && this.field2223[var2] <= 32 || (this.field2223[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field2231; var2 < var3 && (this.field2223[var3 - 1] >= 0 && this.field2223[var3 - 1] <= 32 || (this.field2223[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field2231 == var3) {
            return this;
        }
        class101 var4 = new class101();
        var4.field2231 = var3 - var2;
        var4.field2223 = new byte[var4.field2231];
        for (int var5 = 0; var5 < var4.field2231; var5++) {
            var4.field2223[var5] = this.field2223[var2 + var5];
        }
        return arg0 ? null : var4;
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Lod;")
    public final class101 method727(int arg0) {
        field2225++;
        if (arg0 != 2) {
            return null;
        } else if (this.field2217) {
            this.field2204 = 0;
            if (this.field2223.length != this.field2231) {
                byte[] var2 = new byte[this.field2231];
                class60.method417(this.field2223, 0, var2, 0, this.field2231);
                this.field2223 = var2;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILbe;)V")
    public static final void method728(int arg0, int arg1, int arg2, class13 arg3) {
        if (arg3.field1300 == arg0 && arg0 != -1) {
            int var4 = class8.method39(arg0, (byte) -65).field2049;
            if (var4 == 1) {
                arg3.field1272 = 0;
                arg3.field1303 = arg2;
                arg3.field1321 = 0;
                arg3.field1301 = 0;
            }
            if (var4 == 2) {
                arg3.field1272 = 0;
            }
        } else if (arg0 == -1 || arg3.field1300 == -1 || class8.method39(arg0, (byte) -63).field2043 >= class8.method39(arg3.field1300, (byte) -74).field2043) {
            arg3.field1321 = 0;
            arg3.field1272 = 0;
            arg3.field1303 = arg2;
            arg3.field1286 = arg3.field1333;
            arg3.field1301 = 0;
            arg3.field1300 = arg0;
        }
        field2182++;
        if (arg1 != 0) {
            field2205 = -115;
        }
    }

    @OriginalMember(owner = "client!od", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2191++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)Lod;")
    public final class101 method729(byte arg0) {
        field2234++;
        class101 var2 = new class101();
        int var3 = 60 / ((-arg0 - 11) / 56);
        byte var4 = 2;
        var2.field2231 = this.field2231;
        var2.field2223 = new byte[this.field2231];
        for (int var5 = 0; var5 < this.field2231; var5++) {
            byte var6 = this.field2223[var5];
            if (var6 >= 97 && var6 <= 122 || var6 >= -32 && var6 <= -2 && var6 != -9) {
                if (var4 == 2) {
                    var6 = (byte) (var6 - 32);
                }
                var4 = 0;
            } else if (var6 >= 65 && var6 <= 90 || !(var6 < -64 || var6 > -34 || var6 == -41)) {
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
            var2.field2223[var5] = var6;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public final int method730(int arg0, int arg1) {
        if (arg0 > -106) {
            field2224 = null;
        }
        field2226++;
        return this.field2223[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Lod;")
    public final class101 method731(int arg0) {
        field2183++;
        class101 var2 = new class101();
        var2.field2231 = this.field2231;
        var2.field2223 = new byte[this.field2231];
        int var3 = 0;
        if (arg0 != -5840) {
            field2189 = 45;
        }
        while (var3 < this.field2231) {
            byte var4 = this.field2223[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2223[var3] = var4;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(BLod;)I")
    public final int method732(byte arg0, class101 arg1) {
        int var3;
        if (this.field2231 > arg1.field2231) {
            var3 = arg1.field2231;
        } else {
            var3 = this.field2231;
        }
        if (arg0 >= -30) {
            field2210 = null;
        }
        field2193++;
        for (int var4 = 0; var4 < var3; var4++) {
            if (class108.field2300[this.field2223[var4] & 0xFF] < class108.field2300[arg1.field2223[var4] & 0xFF]) {
                return -1;
            }
            if (class108.field2300[this.field2223[var4] & 0xFF] > class108.field2300[arg1.field2223[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field2231 < arg1.field2231) {
            return -1;
        } else if (this.field2231 > arg1.field2231) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2197++;
        return this.method734(true);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII[BI)I")
    public final int method733(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field2206++;
        if (!arg0) {
            this.field2231 = 104;
        }
        class60.method417(this.field2223, arg4, arg3, arg2, arg1 - arg4);
        return arg1 - arg4;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)I")
    public final int method734(boolean arg0) {
        field2230++;
        if (!arg0) {
            return -7;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2231; var3++) {
            var2 = (this.field2223[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLod;)Z")
    public final boolean method735(boolean arg0, class101 arg1) {
        field2200++;
        if (arg1.field2231 > this.field2231) {
            return false;
        }
        int var3 = this.field2231 - arg1.field2231;
        if (arg0) {
            field2189 = -100;
        }
        for (int var4 = 0; var4 < arg1.field2231; var4++) {
            if (this.field2223[var4 + var3] != arg1.field2223[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILod;)I")
    private final int method736(int arg0, int arg1, class101 arg2) {
        int[] var4 = new int[arg2.field2231];
        int[] var5 = new int[256];
        field2201++;
        int[] var6 = new int[arg2.field2231];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field2231;
        }
        for (int var8 = 1; var8 <= arg2.field2231; var8++) {
            var4[var8 - 1] = (arg2.field2231 << 1) - var8;
            var5[class41.method307(255, arg2.field2223[var8 - 1])] = arg2.field2231 - var8;
        }
        int var9 = arg2.field2231 + 1;
        for (int var10 = arg2.field2231; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg2.field2231 && arg2.field2223[var10 - 1] != arg2.field2223[var9 - 1]) {
                if (arg2.field2231 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field2231 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg2.field2231 + 1 - var9;
        int var14 = arg1;
        int var15 = 1;
        while (var13 >= var15) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field2223[var14 - 1] != arg2.field2223[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (arg2.field2231 > var11) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (arg2.field2231 + var11 - var18 <= var4[var18 + -1]) {
                    var4[var18 - 1] = arg2.field2231 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 = var11 + var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg0 + arg2.field2231 - 1; var16 < this.field2231; var16 += Math.max(var5[this.field2223[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field2231 - 1; var17 >= 0 && this.field2223[var16] == arg2.field2223[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "(I)I")
    public final int method737(int arg0) {
        if (arg0 != 0) {
            this.method716(109);
        }
        field2190++;
        return this.field2231;
    }

    @OriginalMember(owner = "client!od", name = "j", descriptor = "(I)Lod;")
    public final class101 method738(int arg0) {
        long var2 = this.method740(-102);
        field2194++;
        synchronized (field2235 == null ? (field2235 = method741("od")) : field2235) {
            if (class52.field1178 == null) {
                class52.field1178 = new class143(4096);
            } else {
                for (class39 var5 = (class39) class52.field1178.method1141(var2, -1); var5 != null; var5 = (class39) class52.field1178.method1144((byte) -119)) {
                    if (this.method703(0, var5.field934)) {
                        return var5.field934;
                    }
                }
            }
            class39 var7 = new class39();
            var7.field934 = this;
            this.field2217 = false;
            if (arg0 == -64) {
                class52.field1178.method1137((byte) -89, var2, var7);
                return this;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
    public static void method739(byte arg0) {
        field2185 = null;
        field2188 = null;
        field2208 = null;
        field2224 = null;
        field2213 = null;
        field2176 = null;
        field2195 = null;
        field2210 = null;
        field2227 = null;
        if (arg0 != -61) {
            field2205 = 107;
        }
        field2181 = null;
    }

    @OriginalMember(owner = "client!od", name = "k", descriptor = "(I)J")
    private final long method740(int arg0) {
        if (arg0 > -2) {
            method739((byte) 124);
        }
        field2229++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2231; var4++) {
            var2 = (var2 << 5) + (long) (this.field2223[var4] & 0xFF) - var2;
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method741(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
