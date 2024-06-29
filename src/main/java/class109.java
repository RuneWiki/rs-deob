import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 implements class58 {

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Z")
    private boolean field2278 = true;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field2286 = 0;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field2291 = 0;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "Lpe;")
    public static class109 field2301 = class141.method1120("Hidden)2use", 0);

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "[Lla;")
    public static class77[] field2318 = new class77[4];

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lpe;")
    private static class109 field2321 = class141.method1120("Password: ", 0);

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "Lpe;")
    private static class109 field2325 = class141.method1120("Loading textures )2 ", 0);

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Lpe;")
    public static class109 field2316 = field2325;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Lpe;")
    public static class109 field2313 = field2321;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    private int field2282;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lre;")
    public static class123 field2293;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field2326;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[B")
    public byte[] field2279;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "[Lwa;")
    public static class154[] field2300;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lpe;")
    public final class109 method870(int arg0) {
        int var2 = 0;
        field2320++;
        while (var2 < this.field2295 && (this.field2279[var2] >= 0 && this.field2279[var2] <= 32 || (this.field2279[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field2295; var2 < var3 && (this.field2279[var3 - 1] >= 0 && this.field2279[var3 - 1] <= 32 || (this.field2279[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field2295 == var3) {
            return this;
        }
        if (arg0 >= -22) {
            this.field2295 = -71;
        }
        class109 var4 = new class109();
        var4.field2295 = var3 - var2;
        var4.field2279 = new byte[var4.field2295];
        for (int var5 = 0; var5 < var4.field2295; var5++) {
            var4.field2279[var5] = this.field2279[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)Lpe;")
    public final class109 method871(boolean arg0, int arg1) {
        field2310++;
        if (arg0) {
            this.method899(39);
        }
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class109 var3 = new class109();
        var3.field2279 = new byte[this.field2295 + 1];
        var3.field2295 = this.field2295 + 1;
        class26.method237(this.field2279, 0, var3.field2279, 0, this.field2295);
        var3.field2279[this.field2295] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lpe;")
    public final class109 method872(int arg0, int arg1, int arg2) {
        field2307++;
        class109 var4 = new class109();
        int var5 = -114 % ((-arg1 - 78) / 44);
        var4.field2279 = new byte[arg0 - arg2];
        var4.field2295 = arg0 - arg2;
        class26.method237(this.field2279, arg2, var4.field2279, 0, var4.field2295);
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILpe;I)I")
    private final int method873(int arg0, class109 arg1, int arg2) {
        int[] var4 = new int[arg1.field2295];
        field2303++;
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field2295];
        if (arg0 != -123) {
            return -122;
        }
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field2295;
        }
        for (int var8 = 1; var8 <= arg1.field2295; var8++) {
            var4[var8 - 1] = (arg1.field2295 << 1) - var8;
            var5[class4.method34(255, arg1.field2279[var8 - 1])] = arg1.field2295 - var8;
        }
        int var9 = arg1.field2295 + 1;
        for (int var10 = arg1.field2295; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field2295 && arg1.field2279[var9 - 1] != arg1.field2279[var10 - 1]) {
                if (arg1.field2295 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg1.field2295 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = 1;
        int var12 = var9;
        int var13 = arg1.field2295 + 1 - var9;
        int var14 = 0;
        for (int var15 = 1; var15 <= var13; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field2279[var14 - 1] != arg1.field2279[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (var12 < arg1.field2295) {
            for (int var18 = var11; var18 <= var12; var18++) {
                if (var4[var18 - 1] >= arg1.field2295 + var12 - var18) {
                    var4[var18 - 1] = arg1.field2295 + var12 - var18;
                }
            }
            var11 = var12 + 1;
            var12 = var12 + var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg1.field2295 + arg2 - 1; var16 < this.field2295; var16 += Math.max(var5[this.field2279[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field2295 - 1; var17 >= 0 && this.field2279[var16] == arg1.field2279[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)[B")
    public final byte[] method874(int arg0) {
        if (arg0 < 90) {
            this.equals(null);
        }
        field2292++;
        byte[] var2 = new byte[this.field2295];
        class26.method237(this.field2279, 0, var2, 0, this.field2295);
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z")
    public final boolean method875(int arg0) {
        field2323++;
        return arg0 > -24 ? true : this.method904(10, -111);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILpe;)I")
    public final int method876(int arg0, class109 arg1) {
        int var3;
        if (this.field2295 > arg1.field2295) {
            var3 = arg1.field2295;
        } else {
            var3 = this.field2295;
        }
        field2272++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field2279[var4] & 0xFF) > (this.field2279[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field2279[var4] & 0xFF) > (arg1.field2279[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field2295 > this.field2295) {
            return -1;
        }
        if (arg0 != -10156) {
            this.method883((byte) 57);
        }
        if (this.field2295 > arg1.field2295) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Lpe;")
    public final class109 method877(int arg0) {
        class109 var2 = new class109();
        var2.field2279 = new byte[12];
        int var3 = 0;
        var2.field2295 = 0;
        field2324++;
        for (int var4 = 0; var4 < this.field2295; var4++) {
            if (this.field2279[var4] >= 65 && this.field2279[var4] <= 90) {
                var2.field2279[var3++] = (byte) (this.field2279[var4] + 97 - 65);
                var2.field2295 = var3;
            } else if (this.field2279[var4] >= 97 && this.field2279[var4] <= 122 || this.field2279[var4] >= 48 && this.field2279[var4] <= 57) {
                var2.field2279[var3++] = this.field2279[var4];
                var2.field2295 = var3;
            } else if (var3 > 0) {
                var2.field2279[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return arg0 <= 85 ? null : var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public final int method878(int arg0, int arg1) {
        field2299++;
        boolean var3 = false;
        if (arg0 != 57) {
            return -113;
        }
        boolean var4 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2295; var6++) {
            int var7 = this.field2279[var6] & 0xFF;
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

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I")
    public final int method879(byte arg0, int arg1) {
        if (arg0 < 120) {
            this.field2282 = 29;
        }
        field2290++;
        return this.method891(0, true, arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J")
    private final long method880(byte arg0) {
        field2275++;
        long var2 = 0L;
        if (arg0 != -48) {
            this.method875(-41);
        }
        for (int var4 = 0; var4 < this.field2295; var4++) {
            var2 = (var2 << 5) + (((long) (this.field2279[var4] & 0xFF)) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Lpe;")
    public final class109 method881(boolean arg0) {
        field2308++;
        if (!this.field2278) {
            throw new IllegalArgumentException();
        }
        this.field2282 = 0;
        if (arg0) {
            return null;
        }
        if (this.field2279.length != this.field2295) {
            byte[] var2 = new byte[this.field2295];
            class26.method237(this.field2279, 0, var2, 0, this.field2295);
            this.field2279 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Lpe;")
    public final class109 method882(byte arg0) {
        field2312++;
        class109 var2 = new class109();
        var2.field2295 = this.field2295;
        var2.field2279 = new byte[this.field2295];
        if (arg0 != -89) {
            return null;
        }
        for (int var3 = 0; var3 < this.field2295; var3++) {
            byte var4 = this.field2279[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2279[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)Lpe;")
    public final class109 method883(byte arg0) {
        class109 var2 = new class109();
        var2.field2295 = this.field2295;
        var2.field2279 = new byte[this.field2295];
        field2298++;
        byte var3 = 2;
        if (arg0 > -59) {
            return null;
        }
        for (int var4 = 0; var4 < this.field2295; var4++) {
            byte var5 = this.field2279[var4];
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
            var2.field2279[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lpe;I)Z")
    public final boolean method884(class109 arg0, int arg1) {
        field2317++;
        if (arg0 == null) {
            return false;
        } else if (this.field2295 == arg0.field2295) {
            int var3 = 0;
            if (arg1 <= 96) {
                field2293 = null;
            }
            while (this.field2295 > var3) {
                byte var4 = this.field2279[var3];
                byte var5 = arg0.field2279[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
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

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)Lpe;")
    public final class109 method885(byte arg0) {
        field2302++;
        long var2 = this.method880((byte) -48);
        synchronized (field2326 == null ? (field2326 = method909("pe")) : field2326) {
            if (class14.field357 == null) {
                class14.field357 = new class64(4096);
            } else {
                for (class121 var5 = (class121) class14.field357.method505((byte) -46, var2); var5 != null; var5 = (class121) class14.field357.method504((byte) 109)) {
                    if (this.method908(var5.field2678, (byte) 124)) {
                        return var5.field2678;
                    }
                }
            }
            class121 var7 = new class121();
            var7.field2678 = this;
            if (arg0 < 108) {
                return null;
            } else {
                this.field2278 = false;
                class14.field357.method503(-1, var7, var2);
                return this;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2280++;
        return this.method895((byte) -78);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lpe;I)Z")
    public final boolean method886(class109 arg0, int arg1) {
        field2284++;
        if (this.field2295 < arg0.field2295) {
            return false;
        }
        if (arg1 <= 75) {
            field2300 = null;
        }
        for (int var3 = 0; var3 < arg0.field2295; var3++) {
            if (this.field2279[var3] != arg0.field2279[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public final void method887(int arg0, Graphics arg1, byte arg2, int arg3) {
        if (arg2 != 108) {
            return;
        }
        field2273++;
        String var5;
        try {
            var5 = new String(this.field2279, 0, this.field2295, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2279, 0, this.field2295);
        }
        arg1.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Lpe;")
    public final class109 method888(int arg0, byte arg1) {
        field2315++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field2278) {
            this.field2282 = 0;
            if (this.field2279.length == this.field2295) {
                int var3;
                for (var3 = 1; var3 <= this.field2295; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class26.method237(this.field2279, 0, var4, 0, this.field2295);
                this.field2279 = var4;
            }
            this.field2279[this.field2295++] = (byte) arg0;
            int var5 = 55 / ((arg1 - 23) / 52);
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)J")
    public final long method889(boolean arg0) {
        field2314++;
        long var2 = 0L;
        if (!arg0) {
            this.method902((byte) -47);
        }
        for (int var4 = 0; var4 < this.field2295 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2279[var4];
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

    @OriginalMember(owner = "client!pe", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2294++;
        if (!(arg0 instanceof class109)) {
            throw new IllegalArgumentException();
        }
        return this.method908((class109) arg0, (byte) 126);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
    public static void method890(byte arg0) {
        field2301 = null;
        field2321 = null;
        field2293 = null;
        if (arg0 != -6) {
            field2316 = null;
        }
        field2318 = null;
        field2300 = null;
        field2316 = null;
        field2313 = null;
        field2325 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZI)I")
    private final int method891(int arg0, boolean arg1, int arg2) {
        field2287++;
        byte var4 = (byte) arg2;
        if (!arg1) {
            this.method906(75, false);
        }
        for (int var5 = arg0; var5 < this.field2295; var5++) {
            if (this.field2279[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
    public final int method892(boolean arg0, FontMetrics arg1) {
        if (!arg0) {
            return -1;
        }
        String var3;
        try {
            var3 = new String(this.field2279, 0, this.field2295, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2279, 0, this.field2295);
        }
        field2288++;
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
    public final int method893(int arg0) {
        if (arg0 == 48) {
            field2297++;
            return this.method878(arg0 ^ 0x9, 10);
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(B)Ljava/net/URL;")
    public final URL method894(byte arg0) throws MalformedURLException {
        field2289++;
        if (arg0 <= 7) {
            this.field2295 = 25;
        }
        return new URL(new String(this.field2279, 0, this.field2295));
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(B)I")
    public final int method895(byte arg0) {
        if (arg0 != -78) {
            field2293 = null;
        }
        field2322++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2295; var3++) {
            var2 = (var2 << 5) - (var2 - (this.field2279[var3] & 0xFF));
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Lpe;I)I")
    public final int method896(class109 arg0, int arg1) {
        field2281++;
        if (arg1 != -1) {
            field2293 = null;
        }
        return this.method873(-123, arg0, 0);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(ZI)Lpe;")
    public final class109 method897(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            field2276++;
            return this.method872(this.field2295, -128, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(B)I")
    public final int method898(byte arg0) {
        if (arg0 <= 120) {
            this.method891(-111, false, -84);
        }
        field2270++;
        return this.field2295;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)Lpe;")
    public final class109 method899(int arg0) {
        field2277++;
        class109 var2 = new class109();
        var2.field2295 = this.field2295;
        if (arg0 > -38) {
            method907(11, 14, -126, -32, 14);
        }
        var2.field2279 = new byte[this.field2295];
        for (int var3 = 0; var3 < this.field2295; var3++) {
            var2.field2279[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLpe;)Lpe;")
    public final class109 method900(byte arg0, class109 arg1) {
        field2274++;
        if (!this.field2278) {
            throw new IllegalArgumentException();
        }
        this.field2282 = 0;
        if (arg0 != -98) {
            return null;
        }
        if (this.field2295 + arg1.field2295 > this.field2279.length) {
            int var3;
            for (var3 = 1; var3 < this.field2295 + arg1.field2295; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class26.method237(this.field2279, 0, var4, 0, this.field2295);
            this.field2279 = var4;
        }
        class26.method237(arg1.field2279, 0, this.field2279, this.field2295, arg1.field2295);
        this.field2295 += arg1.field2295;
        return this;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(Lpe;I)I")
    public final int method901(class109 arg0, int arg1) {
        field2283++;
        int var3;
        if (arg0.field2295 >= this.field2295) {
            var3 = this.field2295;
        } else {
            var3 = arg0.field2295;
        }
        if (arg1 != 12) {
            this.method875(-58);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class62.field1279[this.field2279[var4] & 0xFF] < class62.field1279[arg0.field2279[var4] & 0xFF]) {
                return -1;
            }
            if (class62.field1279[this.field2279[var4] & 0xFF] > class62.field1279[arg0.field2279[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field2295 < arg0.field2295) {
            return -1;
        } else if (this.field2295 > arg0.field2295) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(B)Lpe;")
    public final class109 method902(byte arg0) {
        class109 var2 = new class109();
        var2.field2295 = this.field2295;
        field2296++;
        var2.field2279 = new byte[this.field2295];
        boolean var3 = true;
        if (arg0 != 42) {
            this.method871(true, -121);
        }
        for (int var4 = 0; var4 < this.field2295; var4++) {
            byte var5 = this.field2279[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field2279[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field2279[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field2279[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BLpe;)Z")
    public final boolean method903(byte arg0, class109 arg1) {
        if (arg0 >= -78) {
            this.method888(37, (byte) 87);
        }
        field2271++;
        if (this.field2295 < arg1.field2295) {
            return false;
        }
        int var3 = this.field2295 - arg1.field2295;
        for (int var4 = 0; var4 < arg1.field2295; var4++) {
            if (this.field2279[var3 + var4] != arg1.field2279[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z")
    private final boolean method904(int arg0, int arg1) {
        boolean var3 = false;
        field2305++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        if (arg1 >= -26) {
            return true;
        }
        for (int var6 = 0; var6 < this.field2295; var6++) {
            int var7 = this.field2279[var6] & 0xFF;
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
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[BI)I")
    public final int method905(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field2306++;
        class26.method237(this.field2279, arg0, arg3, arg2, arg1 - arg0);
        if (arg4 != -66) {
            this.method895((byte) 12);
        }
        return arg1 - arg0;
    }

    @OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2319++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)I")
    public final int method906(int arg0, boolean arg1) {
        field2311++;
        return arg1 ? -48 : this.field2279[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 1) {
            method890((byte) -93);
        }
        class145 var5 = (class145) class25.field613.method505((byte) -46, (long) arg1);
        if (var5 == null) {
            var5 = new class145();
            class25.field613.method503(-1, var5, (long) arg1);
        }
        field2304++;
        if (arg0 >= var5.field3188.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field3188.length; var8++) {
                var6[var8] = var5.field3188[var8];
                var7[var8] = var5.field3174[var8];
            }
            for (int var9 = var5.field3188.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3188 = var6;
            var5.field3174 = var7;
        }
        var5.field3188[arg0] = arg4;
        var5.field3174[arg0] = arg3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lpe;B)Z")
    public final boolean method908(class109 arg0, byte arg1) {
        field2269++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 < 54) {
            field2301 = null;
        }
        if (this.field2295 != arg0.field2295) {
            return false;
        }
        if (!this.field2278 || !arg0.field2278) {
            if (this.field2282 == 0) {
                this.field2282 = this.method895((byte) -78);
                if (this.field2282 == 0) {
                    this.field2282 = 1;
                }
            }
            if (arg0.field2282 == 0) {
                arg0.field2282 = arg0.method895((byte) -78);
                if (arg0.field2282 == 0) {
                    arg0.field2282 = 1;
                }
            }
            if (this.field2282 != arg0.field2282) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field2295; var3++) {
            if (this.field2279[var3] != arg0.field2279[var3]) {
                return false;
            }
        }
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method909(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
