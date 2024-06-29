import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 implements class58 {

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Z")
    private boolean field2389 = true;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2386 = -1;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Lpd;")
    public static class94 field2400 = class28.method249(71, "(Y");

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lpd;")
    private static class94 field2407 = class28.method249(49, "Cancel");

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lpd;")
    public static class94 field2409 = class28.method249(-49, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lpd;")
    public static class94 field2391 = class28.method249(63, "redstone3");

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Lpd;")
    public static class94 field2417 = class28.method249(97, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field2411 = 0;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lpd;")
    public static class94 field2431 = class28.method249(38, " hat sich ausgeloggt)3");

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Lpd;")
    public static class94 field2428 = class28.method249(58, "(U5");

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "Lpd;")
    public static class94 field2430 = field2407;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "J")
    public static long field2404;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "Lbd;")
    public static class11 field2435;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field2436;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[B")
    public byte[] field2382;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method727(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 22)
    public static final void method685(byte arg0) {
        int var1 = 111 / ((55 - arg0) / 61);
        class24.field630 = true;
        class115.field2912 = true;
        field2380++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILpd;)Z", line = 35)
    public final boolean method686(int arg0, class94 arg1) {
        field2390++;
        if (arg0 >= -95) {
            this.method695(true, 34);
        }
        if (this.field2396 < arg1.field2396) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field2396; var3++) {
            if (this.field2382[var3] != arg1.field2382[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lpd;", line = 64)
    public final class94 method687(int arg0, int arg1) {
        field2405++;
        return arg1 == -123 ? this.method706(this.field2396, (byte) 116, arg0) : null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 76)
    public static final void method688(int arg0) {
        field2398++;
        class13.field332 = 0;
        class66.field1613 = arg0;
        class75.method558(-1);
        class19.method145((byte) 8);
        class112.method833(255);
        for (int var1 = 0; var1 < class13.field332; var1++) {
            int var3 = client.field479[var1];
            if (class26.field699 != class28.field803[var3].field163) {
                class28.field803[var3].field2037 = null;
                class28.field803[var3] = null;
            }
        }
        if (class95.field2443 != class99.field2502.field3047) {
            throw new RuntimeException("gnp1 pos:" + class99.field2502.field3047 + " psize:" + class95.field2443);
        }
        for (int var2 = 0; var2 < class115.field2906; var2++) {
            if (class28.field803[class95.field2442[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class115.field2906);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLpd;)Z", line = 122)
    public final boolean method689(byte arg0, class94 arg1) {
        field2401++;
        if (arg0 != 59) {
            this.field2396 = -24;
        }
        if (arg1 == null) {
            return false;
        } else if (this.field2396 == arg1.field2396) {
            if (!this.field2389 || !arg1.field2389) {
                if (this.field2381 == 0) {
                    this.field2381 = this.method705(false);
                    if (this.field2381 == 0) {
                        this.field2381 = 1;
                    }
                }
                if (arg1.field2381 == 0) {
                    arg1.field2381 = arg1.method705(false);
                    if (arg1.field2381 == 0) {
                        arg1.field2381 = 1;
                    }
                }
                if (this.field2381 != arg1.field2381) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field2396; var3++) {
                if (this.field2382[var3] != arg1.field2382[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(ILpd;)Lpd;", line = 181)
    public final class94 method690(int arg0, class94 arg1) {
        field2403++;
        if (!this.field2389) {
            throw new IllegalArgumentException();
        }
        this.field2381 = arg0;
        if (this.field2396 + arg1.field2396 > this.field2382.length) {
            int var3;
            for (var3 = 1; var3 < this.field2396 + arg1.field2396; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class32.method267(this.field2382, 0, var4, 0, this.field2396);
            this.field2382 = var4;
        }
        class32.method267(arg1.field2382, 0, this.field2382, this.field2396, arg1.field2396);
        this.field2396 += arg1.field2396;
        return this;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)Lpd;", line = 215)
    public final class94 method691(int arg0, int arg1) {
        field2425++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class94 var3 = new class94();
        var3.field2382 = new byte[this.field2396 + 1];
        if (arg1 != -17186) {
            field2435 = null;
        }
        var3.field2396 = this.field2396 + 1;
        class32.method267(this.field2382, 0, var3.field2382, 0, this.field2396);
        var3.field2382[this.field2396] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;", line = 235)
    public final String toString() {
        field2421++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lpd;B)Z", line = 246)
    public final boolean method692(class94 arg0, byte arg1) {
        field2397++;
        if (arg0 == null) {
            return false;
        } else if (this.field2396 == arg0.field2396) {
            int var3 = 0;
            if (arg1 != -38) {
                this.method704(-72);
            }
            while (var3 < this.field2396) {
                byte var4 = arg0.field2382[var3];
                byte var5 = this.field2382[var3];
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

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 288)
    public static final void method693(byte arg0) {
        if (arg0 != 95) {
            field2386 = -52;
        }
        field2410++;
        class134.field3269.method1013(arg0 ^ 0xFFFFFFA0);
    }

    @OriginalMember(owner = "client!pd", name = "hashCode", descriptor = "()I", line = 299)
    public final int hashCode() {
        field2377++;
        return this.method705(false);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 316)
    public static void method694(int arg0) {
        field2417 = null;
        field2409 = null;
        int var1 = -13 / ((arg0 + 50) / 33);
        field2391 = null;
        field2428 = null;
        field2431 = null;
        field2400 = null;
        field2435 = null;
        field2407 = null;
        field2430 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)I", line = 338)
    public final int method695(boolean arg0, int arg1) {
        field2418++;
        return arg0 ? 83 : this.field2382[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I", line = 355)
    private final int method696(byte arg0, int arg1, int arg2) {
        field2415++;
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field2396; var5++) {
            if (this.field2382[var5] == var4) {
                return var5;
            }
        }
        if (arg0 <= 109) {
            method688(57);
        }
        return -1;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)Lpd;", line = 384)
    public final class94 method697(byte arg0) {
        long var2 = this.method716(-54);
        field2408++;
        synchronized (field2436 == null ? (field2436 = method727("pd")) : field2436) {
            if (class17.field412 == null) {
                class17.field412 = new class4(4096);
            } else {
                for (class103 var5 = (class103) class17.field412.method19(25239, var2); var5 != null; var5 = (class103) class17.field412.method26((byte) 23)) {
                    if (this.method689((byte) 59, var5.field2599)) {
                        return var5.field2599;
                    }
                }
            }
            class103 var7 = new class103();
            var7.field2599 = this;
            this.field2389 = false;
            class17.field412.method24(var2, var7, 103);
            int var8 = 124 / ((arg0 + 45) / 49);
            return this;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)Z", line = 429)
    public final boolean method698(int arg0) {
        if (arg0 != 10) {
            field2430 = null;
        }
        field2429++;
        return this.method720(10, (byte) 28);
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)Lpd;", line = 440)
    public final class94 method699(byte arg0) {
        field2379++;
        if (!this.field2389) {
            throw new IllegalArgumentException();
        }
        this.field2381 = 0;
        int var2 = 113 / ((arg0 - 50) / 47);
        if (this.field2382.length != this.field2396) {
            byte[] var3 = new byte[this.field2396];
            class32.method267(this.field2382, 0, var3, 0, this.field2396);
            this.field2382 = var3;
        }
        return this;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(BLpd;)I", line = 469)
    public final int method700(byte arg0, class94 arg1) {
        field2388++;
        int var3;
        if (arg1.field2396 < this.field2396) {
            var3 = arg1.field2396;
        } else {
            var3 = this.field2396;
        }
        if (arg0 > -100) {
            return 7;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (this.field2382[var4] < arg1.field2382[var4]) {
                return -1;
            }
            if (arg1.field2382[var4] < this.field2382[var4]) {
                return 1;
            }
        }
        if (arg1.field2396 > this.field2396) {
            return -1;
        } else if (this.field2396 > arg1.field2396) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ls;I)V", line = 509)
    public static final void method701(class111 arg0, int arg1) {
        class63.field1550 = arg0;
        if (arg1 == 1753) {
            field2422++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(II)I", line = 522)
    public final int method702(int arg0, int arg1) {
        field2434++;
        return arg1 == 3557 ? this.method696((byte) 125, 0, arg0) : 108;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)I", line = 544)
    private final int method703(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field2402++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != -1) {
            return -28;
        }
        for (int var6 = 0; var6 < this.field2396; var6++) {
            int var7 = this.field2382[var6] & 0xFF;
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
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)Lpd;", line = 623)
    public final class94 method704(int arg0) {
        field2424++;
        class94 var2 = new class94();
        var2.field2396 = this.field2396;
        var2.field2382 = new byte[this.field2396];
        if (arg0 == 102) {
            for (int var3 = 0; var3 < this.field2396; var3++) {
                var2.field2382[var3] = 42;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)I", line = 645)
    public final int method705(boolean arg0) {
        field2414++;
        int var2 = 0;
        if (arg0) {
            this.field2382 = null;
        }
        for (int var3 = 0; var3 < this.field2396; var3++) {
            var2 = (this.field2382[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 666)
    public final boolean equals(Object arg0) {
        field2374++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)Lpd;", line = 676)
    public final class94 method706(int arg0, byte arg1, int arg2) {
        if (arg1 != 116) {
            field2428 = null;
        }
        class94 var4 = new class94();
        field2395++;
        var4.field2396 = arg0 - arg2;
        var4.field2382 = new byte[arg0 - arg2];
        class32.method267(this.field2382, arg2, var4.field2382, 0, var4.field2396);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)Lpd;", line = 692)
    public final class94 method707(int arg0) {
        if (arg0 != -14211) {
            this.method706(-34, (byte) 69, 96);
        }
        class94 var2 = new class94();
        var2.field2396 = this.field2396;
        field2393++;
        boolean var3 = true;
        var2.field2382 = new byte[this.field2396];
        for (int var4 = 0; var4 < this.field2396; var4++) {
            byte var5 = this.field2382[var4];
            if (var5 == 95) {
                var2.field2382[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field2382[var4] = (byte) (var5 - 32);
            } else {
                var2.field2382[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BILpd;)Lpd;", line = 745)
    public final class94 method708(byte arg0, int arg1, class94 arg2) {
        field2399++;
        if (!this.field2389) {
            throw new IllegalArgumentException();
        } else if (this.field2396 < arg1) {
            throw new IllegalArgumentException();
        } else {
            this.field2381 = 0;
            int var4 = 92 / ((46 - arg0) / 59);
            if (this.field2382.length < arg1 + arg2.field2396) {
                int var5;
                for (var5 = 1; var5 < arg1 + arg2.field2396; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class32.method267(this.field2382, 0, var6, 0, this.field2396);
                this.field2382 = var6;
            }
            class32.method267(arg2.field2382, 0, this.field2382, arg1, arg2.field2396);
            if (arg1 + arg2.field2396 > this.field2396) {
                this.field2396 = arg2.field2396 + arg1;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)J", line = 796)
    public final long method709(byte arg0) {
        long var2 = 0L;
        field2432++;
        if (arg0 < 52) {
            field2431 = null;
        }
        for (int var4 = 0; var4 < this.field2396 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2382[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 - 64;
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

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I", line = 836)
    public final int method710(int arg0) {
        if (arg0 != -123) {
            this.method699((byte) 32);
        }
        field2392++;
        return this.field2396;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(ILpd;)I", line = 857)
    public final int method711(int arg0, class94 arg1) {
        if (arg0 != -34) {
            field2428 = null;
        }
        field2387++;
        return this.method721((byte) -83, 0, arg1);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZZ)V", line = 869)
    public static final void method712(boolean arg0, boolean arg1) {
        field2419++;
        if (!arg1) {
            method693((byte) -35);
        }
        class7.field142 = arg0;
        if (!class7.field142) {
            int var25 = class99.field2502.method941(-957401312);
            int var26 = class99.field2502.method921((byte) -79);
            int var27 = class99.field2502.method921((byte) -80);
            int var28 = class99.field2502.method958((byte) -103);
            int var29 = class99.field2502.method941(-957401312);
            int var30 = (class95.field2443 - class99.field2502.field3047) / 16;
            class69.field1659 = new int[var30][4];
            for (int var31 = 0; var31 < var30; var31++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class69.field1659[var31][var37] = class99.field2502.method952(false);
                }
            }
            class123.field3128 = new int[var30];
            class134.field3305 = new byte[var30][];
            class89.field2297 = new int[var30];
            class111.field2781 = new int[var30];
            boolean var32 = false;
            if ((var27 / 8 == 48 || var27 / 8 == 49) && var26 / 8 == 48) {
                var32 = true;
            }
            client.field482 = new byte[var30][];
            if (var27 / 8 == 48 && var26 / 8 == 148) {
                var32 = true;
            }
            int var33 = 0;
            for (int var34 = (var27 - 6) / 8; var34 <= (var27 + 6) / 8; var34++) {
                for (int var35 = (var26 - 6) / 8; var35 <= (var26 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class89.field2297[var33] = var36;
                        class111.field2781[var33] = class8.field213.method815(class4.method20(new class94[] { class29.field842, class51.method403(var34, true), class21.field581, class51.method403(var35, true) }, true), (byte) 40);
                        class123.field3128[var33] = class8.field213.method815(class4.method20(new class94[] { class81.field2072, class51.method403(var34, true), class21.field581, class51.method403(var35, arg1) }, true), (byte) 87);
                        var33++;
                    }
                }
            }
            class6.method35(var27, (byte) -125, var26, var29, var25, var28);
            return;
        }
        class99.field2502.method323(28901);
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class99.field2502.method319(1, 8);
                    if (var24 == 1) {
                        class123.field3115[var2][var22][var23] = class99.field2502.method319(26, 8);
                    } else {
                        class123.field3115[var2][var22][var23] = -1;
                    }
                }
            }
        }
        class99.field2502.method327(7);
        int var3 = (class95.field2443 - class99.field2502.field3047) / 16;
        class69.field1659 = new int[var3][4];
        for (int var4 = 0; var4 < var3; var4++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class69.field1659[var4][var21] = class99.field2502.method952(false);
            }
        }
        int var5 = class99.field2502.method921((byte) -97);
        int var6 = class99.field2502.method958((byte) -102);
        int var7 = class99.field2502.method941(-957401312);
        int var8 = class99.field2502.method938((byte) 111);
        int var9 = class99.field2502.method961(-99);
        class111.field2781 = new int[var3];
        class123.field3128 = new int[var3];
        class89.field2297 = new int[var3];
        client.field482 = new byte[var3][];
        class134.field3305 = new byte[var3][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class123.field3115[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class89.field2297[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class89.field2297[var10] = var17;
                            int var19 = var17 & 0xFF;
                            int var20 = var17 >> 8 & 0xFF;
                            class111.field2781[var10] = class8.field213.method815(class4.method20(new class94[] { class29.field842, class51.method403(var20, true), class21.field581, class51.method403(var19, true) }, true), (byte) 42);
                            class123.field3128[var10] = class8.field213.method815(class4.method20(new class94[] { class81.field2072, class51.method403(var20, true), class21.field581, class51.method403(var19, arg1) }, true), (byte) 120);
                            var10++;
                        }
                    }
                }
            }
        }
        class6.method35(var9, (byte) 111, var8, var7, var5, var6);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)I", line = 1098)
    public final int method713(boolean arg0) {
        if (!arg0) {
            this.method699((byte) -124);
        }
        field2426++;
        return this.method703(-1, 10);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(B)Lpd;", line = 1112)
    public final class94 method714(byte arg0) {
        field2385++;
        int var2 = -111 / ((-arg0 - 23) / 49);
        class94 var3 = new class94();
        boolean var4 = true;
        var3.field2396 = this.field2396;
        var3.field2382 = new byte[this.field2396];
        for (int var5 = 0; var5 < this.field2396; var5++) {
            byte var6 = this.field2382[var5];
            if (var6 >= 97 && var6 <= 122 || !(var6 < -32 || var6 > -2 || var6 == -9)) {
                if (var4) {
                    var6 = (byte) (var6 - 32);
                }
                var4 = false;
            } else if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                if (!var4) {
                    var6 = (byte) (var6 + 32);
                }
                var4 = false;
            }
            if (var6 == 46 || var6 == 33 || var6 == 63) {
                var4 = true;
            }
            var3.field2382[var5] = var6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)[B", line = 1163)
    public final byte[] method715(int arg0) {
        if (arg0 != 0) {
            field2431 = null;
        }
        field2427++;
        byte[] var2 = new byte[this.field2396];
        class32.method267(this.field2382, 0, var2, 0, this.field2396);
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)J", line = 1182)
    private final long method716(int arg0) {
        field2420++;
        if (arg0 > -35) {
            return -75L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2396; var4++) {
            var2 = (var2 << 5) + (long) (this.field2382[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)Lpd;", line = 1209)
    public final class94 method717(int arg0) {
        field2412++;
        int var2 = 0;
        class94 var3 = new class94();
        var3.field2382 = new byte[12];
        var3.field2396 = 0;
        for (int var4 = 0; var4 < this.field2396; var4++) {
            if (this.field2382[var4] >= 65 && this.field2382[var4] <= 90) {
                var3.field2382[var2++] = (byte) (this.field2382[var4] + 97 - 65);
                var3.field2396 = var2;
            } else if (this.field2382[var4] >= 97 && this.field2382[var4] <= 122 || this.field2382[var4] >= 48 && this.field2382[var4] <= 57) {
                var3.field2382[var2++] = this.field2382[var4];
                var3.field2396 = var2;
            } else if (var2 > 0) {
                var3.field2382[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
        }
        if (arg0 != 16368) {
            this.method719(119, -110, null, -47);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "(I)Lpd;", line = 1255)
    public final class94 method718(int arg0) {
        int var2 = 0;
        field2433++;
        while (this.field2396 > var2 && (this.field2382[var2] >= 0 && this.field2382[var2] <= 32 || (this.field2382[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field2396; var2 < var3 && (this.field2382[var3 - 1] >= 0 && this.field2382[var3 - 1] <= 32 || (this.field2382[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field2396 == var3) {
            return this;
        }
        class94 var4 = new class94();
        var4.field2396 = var3 - var2;
        var4.field2382 = new byte[var4.field2396];
        for (int var5 = 0; var5 < var4.field2396; var5++) {
            var4.field2382[var5] = this.field2382[var2 + var5];
        }
        if (arg0 != 11083) {
            this.method725(-46, 44);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 1295)
    public final void method719(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 0) {
            this.method686(39, null);
        }
        String var5;
        try {
            var5 = new String(this.field2382, 0, this.field2396, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2382, 0, this.field2396);
        }
        arg2.drawString(var5, arg1, arg3);
        field2413++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Z", line = 1327)
    private final boolean method720(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        if (arg1 != 28) {
            field2407 = null;
        }
        field2423++;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field2396; var6++) {
            int var7 = this.field2382[var6] & 0xFF;
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
            if (arg0 <= var7) {
                return false;
            }
            if (var5) {
                var7 = -var7;
            }
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
                return false;
            }
            var4 = var8;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(BILpd;)I", line = 1400)
    private final int method721(byte arg0, int arg1, class94 arg2) {
        field2376++;
        int[] var4 = new int[arg2.field2396];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field2396];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field2396;
        }
        for (int var8 = 1; var8 <= arg2.field2396; var8++) {
            var4[var8 - 1] = (arg2.field2396 << 1) - var8;
            var5[class81.method605(arg2.field2382[var8 - 1], 255)] = arg2.field2396 - var8;
        }
        int var9 = arg2.field2396 + 1;
        int var10 = arg2.field2396;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg2.field2396 && arg2.field2382[var9 - 1] != arg2.field2382[var10 - 1]) {
                if (arg2.field2396 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field2396 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field2396 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        int var15 = 1;
        if (arg0 >= -75) {
            this.method687(114, 14);
        }
        while (var12 >= var15) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field2382[var14 - 1] != arg2.field2382[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg2.field2396) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= var11 + arg2.field2396 - var18) {
                    var4[var18 - 1] = var11 + arg2.field2396 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var6[var12 + -1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg2.field2396 + arg1 - 1; var16 < this.field2396; var16 += Math.max(var5[this.field2382[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field2396 - 1; var17 >= 0 && this.field2382[var16] == arg2.field2382[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Lpd;B)Z", line = 1512)
    public final boolean method722(class94 arg0, byte arg1) {
        field2375++;
        if (arg1 != 112) {
            return true;
        } else if (arg0.field2396 > this.field2396) {
            return false;
        } else {
            int var3 = this.field2396 - arg0.field2396;
            for (int var4 = 0; var4 < arg0.field2396; var4++) {
                if (this.field2382[var3 + var4] != arg0.field2382[var4]) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(B)Lpd;", line = 1548)
    public final class94 method723(byte arg0) {
        field2406++;
        class94 var2 = new class94();
        var2.field2396 = this.field2396;
        var2.field2382 = new byte[this.field2396];
        if (arg0 != 46) {
            return null;
        }
        for (int var3 = 0; var3 < this.field2396; var3++) {
            byte var4 = this.field2382[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2382[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 1598)
    public final int method724(int arg0, FontMetrics arg1) {
        field2416++;
        if (arg0 != 0) {
            this.method717(-50);
        }
        String var3;
        try {
            var3 = new String(this.field2382, 0, this.field2396, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2382, 0, this.field2396);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(II)Lpd;", line = 1631)
    public final class94 method725(int arg0, int arg1) {
        field2394++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field2389) {
            this.field2381 = arg1;
            if (this.field2382.length == this.field2396) {
                int var3;
                for (var3 = 1; var3 <= this.field2396; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class32.method267(this.field2382, 0, var4, 0, this.field2396);
                this.field2382 = var4;
            }
            this.field2382[this.field2396++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBII[B)I", line = 1683)
    public final int method726(int arg0, byte arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = 98 % ((arg1 - 34) / 53);
        field2383++;
        class32.method267(this.field2382, arg0, arg4, arg2, arg3 - arg0);
        return arg3 - arg0;
    }
}
