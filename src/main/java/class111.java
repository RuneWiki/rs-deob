import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 extends class49 {

    @OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
    private int field2383;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
    private int field2374;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    private int field2370;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "Lne;")
    private class95 field2373;

    @OriginalMember(owner = "client!q", name = "mb", descriptor = "I")
    private int field2384;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "Lod;")
    public static class101 field2366 = class46.method335(-126, "Fertigkeit)2");

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field2378 = 0;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "Lod;")
    private static class101 field2371 = class46.method335(65, "flash1:");

    @OriginalMember(owner = "client!q", name = "kb", descriptor = "Lod;")
    public static class101 field2382 = field2371;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "Lod;")
    private static class101 field2379 = class46.method335(-49, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "Lod;")
    public static class101 field2381 = class46.method335(-82, "Versteckt");

    @OriginalMember(owner = "client!q", name = "ob", descriptor = "Lod;")
    public static class101 field2386 = field2379;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "Lod;")
    public static class101 field2375 = field2371;

    @OriginalMember(owner = "client!q", name = "pb", descriptor = "Lod;")
    private static class101 field2387 = class46.method335(122, "Checking for updates )2 ");

    @OriginalMember(owner = "client!q", name = "V", descriptor = "Lod;")
    public static class101 field2367 = field2387;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!q", name = "nb", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILod;ILod;)V")
    public static final void method818(int arg0, class101 arg1, int arg2, class101 arg3) {
        if (arg2 != 28960) {
            method818(-100, null, -27, null);
        }
        field2377++;
        class2.method8(null, arg1, -19, arg0, arg3);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBII)V")
    public static final void method819(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2368++;
        int var5 = 58 % ((-arg2 - 40) / 48);
        for (int var6 = 0; var6 < class157.field3626; var6++) {
            if (class126.field2818[var6] + class131.field2990[var6] > arg4 && arg3 + arg4 > class126.field2818[var6] && class96.field2076[var6] + class85.field1893[var6] > arg1 && arg0 + arg1 > class96.field2076[var6]) {
                class132.field3021[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lqb;")
    public final class113 method88(byte arg0) {
        field2380++;
        if (this.field2373 != null) {
            int var2 = class143.field3305 - this.field2369;
            if (var2 > 100 && this.field2373.field2057 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (this.field2373.field2066[this.field2384] >= var2) {
                            break label51;
                        }
                        var2 -= this.field2373.field2066[this.field2384];
                        this.field2384++;
                    } while (this.field2384 < this.field2373.field2055.length);
                    this.field2384 -= this.field2373.field2057;
                } while (this.field2384 >= 0 && this.field2373.field2055.length > this.field2384);
                this.field2373 = null;
            }
            this.field2369 = class143.field3305 - var2;
        }
        class24 var3 = class94.method652(this.field2374, arg0 ^ 0xFFFFFFA3);
        if (var3.field567 != null) {
            var3 = var3.method192(false);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field2376 == 1 || this.field2376 == 3) {
            var4 = var3.field613;
            var5 = var3.field599;
        } else {
            var4 = var3.field599;
            var5 = var3.field613;
        }
        int var6 = this.field2370 + (var5 + 1 >> 1);
        int var7 = (var5 >> 1) + this.field2370;
        int var8 = this.field2372 + (var4 >> 1);
        int[][] var9 = class20.field431[this.field2383];
        if (arg0 != -93) {
            return null;
        }
        int var10 = (var4 + 1 >> 1) + this.field2372;
        int var11 = var9[var6][var8] + var9[var7][var10] + var9[var6][var10] + var9[var7][var8] >> 2;
        int var12 = (this.field2372 << 7) + (var4 << 6);
        int var13 = (this.field2370 << 7) + (var5 << 6);
        return var3.method193(this.field2384, this.field2376, var11, this.field2373, this.field2365, true, var13, var9, var12);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
    public static void method820(byte arg0) {
        field2387 = null;
        field2367 = null;
        field2375 = null;
        int var1 = -111 % ((57 - arg0) / 62);
        field2366 = null;
        field2379 = null;
        field2371 = null;
        field2382 = null;
        field2386 = null;
        field2381 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIIIZLh;)V")
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class49 arg8) {
        this.field2383 = arg3;
        this.field2365 = arg1;
        this.field2374 = arg0;
        this.field2376 = arg2;
        this.field2372 = arg5;
        this.field2370 = arg4;
        if (arg6 != -1) {
            this.field2373 = class8.method39(arg6, (byte) -71);
            this.field2384 = 0;
            this.field2369 = class143.field3305 - 1;
            if (this.field2373.field2049 == 0 && arg8 != null && arg8 instanceof class111) {
                class111 var10 = (class111) arg8;
                if (this.field2373 == var10.field2373) {
                    this.field2384 = var10.field2384;
                    this.field2369 = var10.field2369;
                    return;
                }
            }
            if (arg7 && this.field2373.field2057 != -1) {
                this.field2384 = (int) (Math.random() * (double) this.field2373.field2055.length);
                this.field2369 -= (int) ((double) this.field2373.field2066[this.field2384] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIIII)V")
    public static final void method821(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2385++;
        if (class146.field3339 == arg0 && class53.field1213 == arg4 && (class112.field2414 == arg2 || !class10.field152)) {
            return;
        }
        class146.field3339 = arg0;
        class53.field1213 = arg4;
        class112.field2414 = arg2;
        if (!class10.field152) {
            class112.field2414 = 0;
        }
        class35.method262(0, 25);
        class125.method961(-74, true, class41.field993);
        int var6 = class56.field1260;
        class56.field1260 = arg0 * 8 - 48;
        int var7 = class56.field1260 - var6;
        int var8 = class75.field1597;
        int var9 = class56.field1260;
        class75.field1597 = (arg4 - 6) * 8;
        int var10 = class75.field1597 - var8;
        int var11 = class75.field1597;
        for (int var12 = 0; var12 < 32768; var12++) {
            class62 var29 = class18.field376[var12];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field1291[var30] -= var7;
                    var29.field1271[var30] -= var10;
                }
                var29.field1341 -= var7 * 128;
                var29.field1298 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class13 var27 = class94.field2032[var13];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field1291[var28] -= var7;
                    var27.field1271[var28] -= var10;
                }
                var27.field1298 -= var10 * 128;
                var27.field1341 -= var7 * 128;
            }
        }
        class95.field2040 = arg2;
        class82.field1778.method406(false, arg3, arg5, 29682);
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 0;
        byte var17 = 104;
        byte var18 = 1;
        byte var19 = 1;
        if (var10 < 0) {
            var16 = 103;
            var18 = -1;
            var17 = -1;
        }
        if (var7 < 0) {
            var14 = 103;
            var19 = -1;
            var15 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var19) {
            for (int var23 = var16; var23 != var17; var23 += var18) {
                int var24 = var7 + var20;
                int var25 = var10 + var23;
                for (int var26 = 0; var26 < 4; var26++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                        class54.field1219[var26][var20][var23] = class54.field1219[var26][var24][var25];
                    } else {
                        class54.field1219[var26][var20][var23] = null;
                    }
                }
            }
        }
        for (class156 var21 = (class156) class17.field345.method523(false); var21 != null; var21 = (class156) class17.field345.method527(true)) {
            var21.field3582 -= var7;
            var21.field3593 -= var10;
            if (var21.field3582 < 0 || var21.field3593 < 0 || var21.field3582 >= 104 || var21.field3593 >= 104) {
                var21.method959(11835);
            }
        }
        class84.field1823 = false;
        int var22 = -100 % ((-arg1 - 28) / 52);
        class143.field3290 = 0;
        class142.field3275 = -1;
        if (class130.field2973 != 0) {
            class152.field3470 -= var10;
            class130.field2973 -= var7;
        }
        class83.field1804.method525(true);
        class86.field1902.method525(true);
    }
}
