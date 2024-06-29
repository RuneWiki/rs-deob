import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class4 {

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    private int field96 = 0;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[Lwd;")
    private class136[] field91;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[[I")
    public static int[][] field79 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!a", name = "k", descriptor = "[[I")
    public static int[][] field84 = new int[104][104];

    @OriginalMember(owner = "client!a", name = "h", descriptor = "[I")
    public static int[] field81 = new int[25];

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[I")
    public static int[] field77 = new int[1000];

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field94 = 0;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Z")
    public static boolean field99 = false;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Lpd;")
    public static class94 field100 = class28.method249(-88, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field76 = new CRC32();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "J")
    private long field75;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Ls;")
    public static class111 field78;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lwd;")
    private class136 field82;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Lwd;")
    private class136 field98;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
    public static int[] field97;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IJ)Lwd;", line = 4)
    public final class136 method19(int arg0, long arg1) {
        field86++;
        if (arg0 != 25239) {
            method20(null, false);
        }
        this.field75 = arg1;
        class136 var4 = this.field91[(int) (arg1 & (long) (this.field80 - 1))];
        for (this.field82 = var4.field3340; this.field82 != var4; this.field82 = this.field82.field3340) {
            if (this.field82.field3345 == arg1) {
                class136 var5 = this.field82;
                this.field82 = this.field82.field3340;
                return var5;
            }
        }
        this.field82 = null;
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lpd;Z)Lpd;", line = 35)
    public static final class94 method20(class94[] arg0, boolean arg1) {
        field92++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg1) {
            return class67.method503(arg0.length, 0, 0, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 74)
    public static final void method21(int arg0) {
        field90++;
        if (!client.field476) {
            return;
        }
        class69.field1663 = null;
        class27.field738 = null;
        class92.field2360 = null;
        class87.field2226 = null;
        class87.field2201 = null;
        class105.field2622 = null;
        class38.field996 = null;
        class86.field2190 = null;
        class135.field3319 = null;
        class89.field2319 = null;
        class121.field3024 = null;
        class13.field319 = null;
        class79.field2003 = null;
        class115.field2909 = null;
        class41.field1046 = null;
        class12.field304 = null;
        class8.field235 = null;
        class75.field1823 = null;
        class55.field1402 = null;
        if (arg0 != -26883) {
            method20(null, false);
        }
        class40.field1026 = null;
        class75.field1836 = null;
        class134.field3264 = null;
        class46.field1140 = null;
        class31.field879 = null;
        class64.field1590 = null;
        class51.field1278 = null;
        class28.field815 = null;
        class14.field356 = null;
        client.field476 = false;
        class17.field431 = null;
        class87.field2206 = null;
        class38.field986 = null;
        class88.field2272 = null;
        class80.field2045 = null;
        class17.field425 = null;
        class74.field1806 = null;
        class108.field2689 = null;
        class86.field2198 = null;
        class81.field2061 = null;
        class86.field2199 = null;
        class52.field1305 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Lwd;", line = 130)
    public final class136 method22(int arg0) {
        if (arg0 != 13389) {
            this.method23((byte) 115);
        }
        this.field96 = 0;
        field83++;
        return this.method23((byte) -120);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lwd;", line = 149)
    private final class136 method23(byte arg0) {
        if (arg0 >= -114) {
            method27((byte) 13);
        }
        field95++;
        if (this.field96 > 0 && this.field91[this.field96 - 1] != this.field98) {
            class136 var2 = this.field98;
            this.field98 = var2.field3340;
            return var2;
        }
        while (this.field96 < this.field80) {
            class136 var3 = this.field91[this.field96++].field3340;
            if (this.field91[this.field96 - 1] != var3) {
                this.field98 = var3.field3340;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(JLwd;I)V", line = 182)
    public final void method24(long arg0, class136 arg1, int arg2) {
        field74++;
        if (arg1.field3346 != null) {
            arg1.method1074((byte) -28);
        }
        class136 var5 = this.field91[(int) (arg0 & (long) (this.field80 - 1))];
        arg1.field3340 = var5;
        arg1.field3346 = var5.field3346;
        arg1.field3345 = arg0;
        arg1.field3346.field3340 = arg1;
        arg1.field3340.field3346 = arg1;
        int var6 = 111 / ((49 - arg2) / 53);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 221)
    public static void method25(int arg0) {
        field77 = null;
        field100 = null;
        if (arg0 != 4574) {
            return;
        }
        field79 = null;
        field78 = null;
        field81 = null;
        field76 = null;
        field84 = null;
        field97 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Lwd;", line = 238)
    public final class136 method26(byte arg0) {
        field85++;
        if (arg0 != 23) {
            return null;
        } else if (this.field82 == null) {
            return null;
        } else {
            class136 var2 = this.field91[(int) (this.field75 & (long) (this.field80 - 1))];
            while (this.field82 != var2) {
                if (this.field82.field3345 == this.field75) {
                    class136 var3 = this.field82;
                    this.field82 = this.field82.field3340;
                    return var3;
                }
                this.field82 = this.field82.field3340;
            }
            this.field82 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V", line = 271)
    public static final void method27(byte arg0) {
        int var1 = class79.field2028;
        field89++;
        int var2 = class128.field3212;
        int var3 = class52.field1306;
        int var4 = 36 / ((48 - arg0) / 39);
        int var5 = 6116423;
        int var6 = class135.field3313;
        class130.method1028(var1, var2, var3, var6, var5);
        class130.method1028(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class130.method1032(var1 + 1, var2 + 18, var3 - 2, var6 + -19, 0);
        class115.field2913.method115(class50.field1246, var1 + 3, var2 + 14, var5);
        int var7 = class84.field2121;
        int var8 = class94.field2411;
        if (class40.field1035 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (class40.field1035 == 1) {
            var7 -= 205;
            var8 -= 553;
        }
        if (class40.field1035 == 2) {
            var8 -= 17;
            var7 -= 357;
        }
        for (int var9 = 0; var9 < class97.field2478; var9++) {
            int var10 = (class97.field2478 - var9 - 1) * 15 + var2 + 31;
            int var11 = 16777215;
            if (var8 > var1 && var1 + var3 > var8 && var7 > var10 - 13 && var10 + 3 > var7) {
                var11 = 16776960;
            }
            class115.field2913.method103(class39.field1008[var9], var1 + 3, var10, var11, true);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(I)V", line = 338)
    public class4(int arg0) {
        this.field80 = arg0;
        this.field91 = new class136[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class136 var3 = this.field91[var2] = new class136();
            var3.field3346 = var3;
            var3.field3340 = var3;
        }
    }
}
