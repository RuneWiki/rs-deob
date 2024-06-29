import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 implements class107 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
    private boolean field2249 = true;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public static int[] field2251 = new int[256];

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2258 = 0;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Loa;")
    public static class98 field2282 = class38.method349(255, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Loa;")
    public static class98 field2275 = class38.method349(255, "Privater Chat");

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Loa;")
    private static class98 field2287 = class38.method349(255, "Take");

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Loa;")
    public static class98 field2267 = field2287;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "Loa;")
    public static class98 field2298 = class38.method349(255, "gleiten:");

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Loa;")
    private static class98 field2266 = class38.method349(255, "Checking for updates )2 ");

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    public static volatile int field2302 = -1;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Loa;")
    public static class98 field2278 = field2266;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    private int field2269;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "Lkd;")
    public static class73 field2299;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field2309;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[B")
    public byte[] field2255;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    public static int[] field2272;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Loa;")
    public final class98 method779(int arg0, int arg1) {
        field2265++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field2249) {
            this.field2269 = 0;
            if (arg1 <= 122) {
                return null;
            }
            if (this.field2255.length == this.field2277) {
                int var3;
                for (var3 = 1; var3 <= this.field2277; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class9.method108(this.field2255, 0, var4, 0, this.field2277);
                this.field2255 = var4;
            }
            this.field2255[this.field2277++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)I")
    public final int method780(int arg0) {
        field2300++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field2277; var3++) {
            var2 = (this.field2255[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Loa;")
    public final class98 method781(int arg0, int arg1) {
        if (arg0 == 0) {
            field2291++;
            return this.method815(this.field2277, arg0 ^ 0xFFFFFFA5, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILoa;)Z")
    public final boolean method782(int arg0, class98 arg1) {
        field2306++;
        if (arg1 == null) {
            return false;
        } else if (this.field2277 == arg1.field2277) {
            for (int var3 = 0; var3 < this.field2277; var3++) {
                byte var4 = arg1.field2255[var3];
                byte var5 = this.field2255[var3];
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
            if (arg0 != -1) {
                field2275 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Loa;")
    public final class98 method783(int arg0) {
        field2307++;
        byte var2 = 2;
        class98 var3 = new class98();
        var3.field2277 = this.field2277;
        var3.field2255 = new byte[this.field2277];
        if (arg0 != 255) {
            this.method787(null, (byte) 96);
        }
        for (int var4 = 0; var4 < this.field2277; var4++) {
            byte var5 = this.field2255[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
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
            var3.field2255[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static void method784(int arg0) {
        field2272 = null;
        field2299 = null;
        field2298 = null;
        field2251 = null;
        if (arg0 > -27) {
            field2299 = null;
        }
        field2275 = null;
        field2266 = null;
        field2278 = null;
        field2287 = null;
        field2282 = null;
        field2267 = null;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)Loa;")
    public final class98 method785(int arg0) {
        field2264++;
        class98 var2 = new class98();
        boolean var3 = true;
        var2.field2277 = this.field2277;
        var2.field2255 = new byte[this.field2277];
        if (arg0 != 10) {
            this.field2277 = 50;
        }
        for (int var4 = 0; var4 < this.field2277; var4++) {
            byte var5 = this.field2255[var4];
            if (var5 == 95) {
                var2.field2255[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field2255[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field2255[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)Loa;")
    public final class98 method786(int arg0) {
        class98 var2 = new class98();
        var2.field2277 = this.field2277;
        if (arg0 != -2820) {
            this.method799(-67, -98, (byte) -107);
        }
        var2.field2255 = new byte[this.field2277];
        field2295++;
        for (int var3 = 0; var3 < this.field2277; var3++) {
            byte var4 = this.field2255[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2255[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loa;B)Z")
    public final boolean method787(class98 arg0, byte arg1) {
        field2252++;
        if (this.field2277 < arg0.field2277) {
            return false;
        }
        int var3 = this.field2277 - arg0.field2277;
        int var4 = 65 / ((37 - arg1) / 35);
        for (int var5 = 0; var5 < arg0.field2277; var5++) {
            if (this.field2255[var3 + var5] != arg0.field2255[var5]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLoa;)I")
    public final int method788(byte arg0, class98 arg1) {
        if (arg0 == -65) {
            field2294++;
            return this.method791(0, arg1, (byte) 97);
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Loa;")
    public final class98 method789(boolean arg0) {
        int var2 = 0;
        field2286++;
        while (this.field2277 > var2 && (this.field2255[var2] >= 0 && this.field2255[var2] <= 32 || (this.field2255[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field2277; var3 > var2 && (this.field2255[var3 - 1] >= 0 && this.field2255[var3 - 1] <= 32 || (this.field2255[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field2277 == var3) {
            return this;
        }
        class98 var4 = new class98();
        var4.field2277 = var3 - var2;
        var4.field2255 = new byte[var4.field2277];
        if (!arg0) {
            this.method779(-53, 44);
        }
        for (int var5 = 0; var5 < var4.field2277; var5++) {
            var4.field2255[var5] = this.field2255[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)I")
    public final int method790(int arg0) {
        field2262++;
        return arg0 < 81 ? -70 : this.field2277;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILoa;B)I")
    private final int method791(int arg0, class98 arg1, byte arg2) {
        field2270++;
        int[] var4 = new int[256];
        if (arg2 != 97) {
            return -93;
        }
        int[] var5 = new int[arg1.field2277];
        int[] var6 = new int[arg1.field2277];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg1.field2277;
        }
        for (int var8 = 1; var8 <= arg1.field2277; var8++) {
            var6[var8 - 1] = (arg1.field2277 << 1) - var8;
            var4[class150.method1211(255, arg1.field2255[var8 - 1])] = arg1.field2277 - var8;
        }
        int var9 = arg1.field2277 + 1;
        for (int var10 = arg1.field2277; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (var9 <= arg1.field2277 && arg1.field2255[var9 - 1] != arg1.field2255[var10 - 1]) {
                if (var6[var9 - 1] >= arg1.field2277 - var10) {
                    var6[var9 - 1] = arg1.field2277 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field2277 + 1 - var9;
        int var13 = 0;
        int var14 = 1;
        int var15 = 1;
        while (var15 <= var12) {
            var5[var15 - 1] = var13;
            while (var13 >= 1 && arg1.field2255[var13 - 1] != arg1.field2255[var15 - 1]) {
                var13 = var5[var13 - 1];
            }
            var15++;
            var13++;
        }
        while (arg1.field2277 > var11) {
            for (int var18 = var14; var18 <= var11; var18++) {
                if (var6[var18 - 1] >= arg1.field2277 + var11 - var18) {
                    var6[var18 - 1] = var11 + arg1.field2277 - var18;
                }
            }
            var14 = var11 + 1;
            var11 = var11 + var12 - var5[var12 + -1];
            var12 = var5[var12 - 1];
        }
        int var17;
        for (int var16 = arg1.field2277 + arg0 - 1; var16 < this.field2277; var16 += Math.max(var4[this.field2255[var16] & 0xFF], var6[var17])) {
            for (var17 = arg1.field2277 - 1; var17 >= 0 && this.field2255[var16] == arg1.field2255[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(BLoa;)Z")
    public final boolean method792(byte arg0, class98 arg1) {
        if (arg0 != -84) {
            return true;
        }
        field2276++;
        if (this.field2277 < arg1.field2277) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field2277; var3++) {
            if (this.field2255[var3] != arg1.field2255[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2274++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)I")
    public final int method793(int arg0) {
        field2283++;
        if (arg0 != 10) {
            field2287 = null;
        }
        return this.method803(10, (byte) -115);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIZILtb;)V")
    public static final void method794(int arg0, int arg1, int arg2, boolean arg3, int arg4, class130 arg5) {
        client.field510 = arg0;
        class139.field3400 = arg2;
        class71.field1481 = arg4;
        field2303++;
        class71.field1483 = 1;
        class3.field36 = arg3;
        class55.field1213 = arg5;
        client.field513 = arg1;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)Loa;")
    public final class98 method795(int arg0) {
        int var2 = 0;
        class98 var3 = new class98();
        field2285++;
        var3.field2255 = new byte[12];
        var3.field2277 = 0;
        int var4 = 0;
        int var5 = -13 % ((arg0 + 1) / 56);
        while (var4 < this.field2277) {
            if (this.field2255[var4] >= 65 && this.field2255[var4] <= 90) {
                var3.field2255[var2++] = (byte) (this.field2255[var4] + 97 - 65);
                var3.field2277 = var2;
            } else if (this.field2255[var4] >= 97 && this.field2255[var4] <= 122 || this.field2255[var4] >= 48 && this.field2255[var4] <= 57) {
                var3.field2255[var2++] = this.field2255[var4];
                var3.field2277 = var2;
            } else if (var2 > 0) {
                var3.field2255[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method796(int arg0, byte arg1, int arg2, Graphics arg3) {
        field2289++;
        if (arg1 != 38) {
            field2268 = -102;
        }
        String var5;
        try {
            var5 = new String(this.field2255, 0, this.field2277, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2255, 0, this.field2277);
        }
        arg3.drawString(var5, arg2, arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)Loa;")
    public final class98 method797(byte arg0) {
        field2253++;
        if (!this.field2249) {
            throw new IllegalArgumentException();
        }
        this.field2269 = 0;
        if (this.field2255.length != this.field2277) {
            byte[] var2 = new byte[this.field2277];
            class9.method108(this.field2255, 0, var2, 0, this.field2277);
            this.field2255 = var2;
        }
        return arg0 < 110 ? null : this;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(BLoa;)Loa;")
    public final class98 method798(byte arg0, class98 arg1) {
        field2301++;
        if (!this.field2249) {
            throw new IllegalArgumentException();
        }
        this.field2269 = 0;
        if (this.field2277 + arg1.field2277 > this.field2255.length) {
            int var3;
            for (var3 = 1; var3 < this.field2277 + arg1.field2277; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class9.method108(this.field2255, 0, var4, 0, this.field2277);
            this.field2255 = var4;
        }
        if (arg0 != 62) {
            field2302 = -14;
        }
        class9.method108(arg1.field2255, 0, this.field2255, this.field2277, arg1.field2277);
        this.field2277 += arg1.field2277;
        return this;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIB)I")
    private final int method799(int arg0, int arg1, byte arg2) {
        field2297++;
        byte var4 = (byte) arg0;
        if (arg2 <= 28) {
            field2302 = -37;
        }
        for (int var5 = arg1; var5 < this.field2277; var5++) {
            if (this.field2255[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLoa;I)Loa;")
    public final class98 method800(byte arg0, class98 arg1, int arg2) {
        field2293++;
        if (!this.field2249) {
            throw new IllegalArgumentException();
        } else if (this.field2277 < arg2) {
            throw new IllegalArgumentException();
        } else {
            this.field2269 = 0;
            if (arg1.field2277 + arg2 > this.field2255.length) {
                int var4;
                for (var4 = 1; var4 < arg1.field2277 + arg2; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class9.method108(this.field2255, 0, var5, 0, this.field2277);
                this.field2255 = var5;
            }
            int var6 = -72 / ((arg0 + 13) / 41);
            class9.method108(arg1.field2255, 0, this.field2255, arg2, arg1.field2277);
            if (this.field2277 < arg2 + arg1.field2277) {
                this.field2277 = arg1.field2277 + arg2;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(BLoa;)Z")
    public final boolean method801(byte arg0, class98 arg1) {
        field2263++;
        if (arg0 >= -49) {
            this.method814(113, (byte) -109, null, 59, 70);
        }
        if (arg1 == null) {
            return false;
        } else if (this.field2277 == arg1.field2277) {
            if (!this.field2249 || !arg1.field2249) {
                if (this.field2269 == 0) {
                    this.field2269 = this.method780(0);
                    if (this.field2269 == 0) {
                        this.field2269 = 1;
                    }
                }
                if (arg1.field2269 == 0) {
                    arg1.field2269 = arg1.method780(0);
                    if (arg1.field2269 == 0) {
                        arg1.field2269 = 1;
                    }
                }
                if (this.field2269 != arg1.field2269) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field2277; var3++) {
                if (this.field2255[var3] != arg1.field2255[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)[B")
    public final byte[] method802(int arg0) {
        field2254++;
        if (arg0 == -11) {
            byte[] var2 = new byte[this.field2277];
            class9.method108(this.field2255, 0, var2, 0, this.field2277);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)I")
    private final int method803(int arg0, byte arg1) {
        field2292++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 != -115) {
            return 69;
        }
        for (int var6 = 0; var6 < this.field2277; var6++) {
            int var7 = this.field2255[var6] & 0xFF;
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
            if (arg0 <= var7) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
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

    @OriginalMember(owner = "client!oa", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2288++;
        if (!(arg0 instanceof class98)) {
            throw new IllegalArgumentException();
        }
        return this.method801((byte) -58, (class98) arg0);
    }

    @OriginalMember(owner = "client!oa", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2271++;
        return this.method780(0);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)J")
    private final long method804(byte arg0) {
        field2279++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2277; var4++) {
            var2 = (var2 << 5) + ((long) (this.field2255[var4] & 0xFF)) - var2;
        }
        return arg0 == -1 ? var2 : 93L;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Loa;")
    public final class98 method805(byte arg0) {
        if (arg0 > -78) {
            this.method781(-68, 63);
        }
        long var2 = this.method804((byte) -1);
        field2304++;
        synchronized (field2309 == null ? (field2309 = method820("oa")) : field2309) {
            if (class127.field2842 == null) {
                class127.field2842 = new class3(4096);
            } else {
                for (class83 var5 = (class83) class127.field2842.method17(-16, var2); var5 != null; var5 = (class83) class127.field2842.method13(45)) {
                    if (this.method801((byte) -61, var5.field1935)) {
                        return var5.field1935;
                    }
                }
            }
            class83 var7 = new class83();
            this.field2249 = false;
            var7.field1935 = this;
            class127.field2842.method12(var7, -31636, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)Loa;")
    public final class98 method806(byte arg0) {
        field2281++;
        if (arg0 != -97) {
            return null;
        }
        class98 var2 = new class98();
        var2.field2277 = this.field2277;
        var2.field2255 = new byte[this.field2277];
        for (int var3 = 0; var3 < this.field2277; var3++) {
            var2.field2255[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IB)I")
    public final int method807(int arg0, byte arg1) {
        field2308++;
        int var3 = 125 / ((31 - arg1) / 49);
        return this.method799(arg0, 0, (byte) 42);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)Ljava/net/URL;")
    public final URL method808(byte arg0) throws MalformedURLException {
        field2280++;
        if (arg0 < 71) {
            this.method814(-127, (byte) 11, null, 42, 64);
        }
        return new URL(new String(this.field2255, 0, this.field2277));
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)J")
    public final long method809(int arg0) {
        field2284++;
        long var2 = 0L;
        for (int var4 = arg0; this.field2277 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2255[var4];
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
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Loa;")
    public final class98 method810(int arg0, int arg1) {
        field2257++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class98 var3 = new class98();
        var3.field2255 = new byte[this.field2277 + 1];
        var3.field2277 = this.field2277 + 1;
        class9.method108(this.field2255, 0, var3.field2255, 0, this.field2277);
        var3.field2255[this.field2277] = (byte) arg1;
        if (arg0 >= -80) {
            this.method797((byte) -43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)V")
    public static final void method811(int arg0) {
        if (arg0 != 28944) {
            field2258 = -48;
        }
        class19.field417.method734(arg0 - 224808072);
        class49.field1110.method734(-224779128);
        field2296++;
        class44.field1011.method734(-224779128);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Z")
    private final boolean method812(int arg0, int arg1) {
        field2273++;
        boolean var3 = false;
        if (arg1 != -918210458) {
            this.method793(-85);
        }
        int var4 = 0;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field2277; var6++) {
            int var7 = this.field2255[var6] & 0xFF;
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
            var4 = var8;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method813(int arg0, int arg1) {
        if (arg1 != -9128) {
            field2268 = -45;
        }
        field2250++;
        return this.field2255[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB[BII)I")
    public final int method814(int arg0, byte arg1, byte[] arg2, int arg3, int arg4) {
        class9.method108(this.field2255, arg0, arg2, arg3, arg4 - arg0);
        if (arg1 != 61) {
            this.method810(-1, 28);
        }
        field2260++;
        return arg4 - arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Loa;")
    public final class98 method815(int arg0, int arg1, int arg2) {
        field2305++;
        class98 var4 = new class98();
        var4.field2255 = new byte[arg0 - arg2];
        var4.field2277 = arg0 - arg2;
        int var5 = -108 % ((-arg1 - 20) / 60);
        class9.method108(this.field2255, arg2, var4.field2255, 0, var4.field2277);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)Z")
    public static final boolean method816(int arg0, int arg1) {
        field2261++;
        if (arg1 < 0) {
            return false;
        } else if (arg0 <= 80) {
            return false;
        } else {
            int var2 = class11.field227[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 18;
        }
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "(I)Z")
    public final boolean method817(int arg0) {
        if (arg0 <= 33) {
            this.method814(-6, (byte) -76, null, -98, 62);
        }
        field2290++;
        return this.method812(10, -918210458);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Loa;B)I")
    public final int method818(class98 arg0, byte arg1) {
        field2256++;
        int var3;
        if (this.field2277 <= arg0.field2277) {
            var3 = this.field2277;
        } else {
            var3 = arg0.field2277;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class6.field94[this.field2255[var4] & 0xFF] < class6.field94[arg0.field2255[var4] & 0xFF]) {
                return -1;
            }
            if (class6.field94[this.field2255[var4] & 0xFF] > class6.field94[arg0.field2255[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field2277 < arg0.field2277) {
            return -1;
        } else if (arg0.field2277 < this.field2277) {
            return 1;
        } else {
            if (arg1 != 59) {
                field2266 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method819(int arg0, FontMetrics arg1) {
        field2259++;
        String var4;
        try {
            int var3 = 78 / ((-arg0 - 23) / 63);
            var4 = new String(this.field2255, 0, this.field2277, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var4 = new String(this.field2255, 0, this.field2277);
        }
        return arg1.stringWidth(var4);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method820(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
