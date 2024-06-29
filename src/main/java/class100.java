import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class100 {

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    private int field2248;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    private int field2247;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[[I")
    private int[][] field2235;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lkc;")
    private static class67 field2238 = class19.method144("Existing user", 70);

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lkc;")
    public static class67 field2237 = class19.method144("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>", 88);

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Lkc;")
    public static class67 field2253 = class19.method144("Name des Gegenstands eingeben:", 79);

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Lkc;")
    public static class67 field2256 = field2238;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2233 = 0;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "B")
    public static byte field2249 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Lbc;")
    public static class11 field2254;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Lab;")
    public static class3 field2241;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)I", line = 26)
    public final int method763(int arg0, boolean arg1) {
        field2258++;
        if (this.field2235 != null) {
            arg0 = (int) ((long) this.field2247 * (long) arg0 / (long) this.field2248) + 6;
        }
        return arg1 ? 53 : arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BZ)[B", line = 41)
    public final byte[] method764(byte[] arg0, boolean arg1) {
        if (this.field2235 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2247 / (long) this.field2248) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2235[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2247 + var6;
                int var14 = var13 / this.field2248;
                var6 = var13 - this.field2248 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        if (arg1) {
            field2253 = null;
        }
        field2243++;
        return arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z", line = 110)
    public static final boolean method765(int arg0, int arg1) {
        if (arg0 != -1) {
            field2237 = null;
        }
        field2234++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)I", line = 125)
    public final int method766(int arg0, int arg1) {
        if (this.field2235 != null) {
            arg1 = (int) ((long) this.field2247 * (long) arg1 / (long) this.field2248);
        }
        if (arg0 != 14) {
            this.method766(55, 32);
        }
        field2236++;
        return arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 141)
    public static final void method767(boolean arg0) {
        field2259++;
        class109.field2462 = new class10();
        if (arg0) {
            method768(69, true, false, (byte) -97, false);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZZBZ)Lje;", line = 152)
    public static final class63 method768(int arg0, boolean arg1, boolean arg2, byte arg3, boolean arg4) {
        field2257++;
        if (arg3 > -19) {
            return null;
        }
        class14 var5 = null;
        if (class125.field2911 != null) {
            var5 = new class14(arg0, class125.field2911, class5.field115[arg0], 1000000);
        }
        return new class63(var5, class125.field2924, arg0, arg2, arg1, arg4);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lac;Ldf;ILac;Z)V", line = 178)
    public static final void method769(class4 arg0, class28 arg1, int arg2, class4 arg3, boolean arg4) {
        class46.field1108 = arg0;
        class34.field836 = arg4;
        class52.field1272 = arg3;
        int var5 = -30 / ((-arg2 - 11) / 49);
        class135.field3248 = class46.field1108.method45(-106, 10);
        field2245++;
        class14.field306 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V", line = 208)
    public class100(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class45.method380(-60, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2248 = var4;
            this.field2247 = var5;
            this.field2235 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2235[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V", line = 273)
    public static void method770(boolean arg0) {
        field2241 = null;
        field2238 = null;
        field2237 = null;
        field2254 = null;
        field2253 = null;
        field2256 = null;
        if (arg0) {
            method771(27, -114, -30, -100, 33);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V", line = 292)
    public static final void method771(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -30243) {
            return;
        }
        field2250++;
        class102 var5 = (class102) class82.field1954.method462(false, (long) arg1);
        if (var5 == null) {
            var5 = new class102();
            class82.field1954.method469(arg0 + 30242, (long) arg1, var5);
        }
        if (arg4 >= var5.field2299.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field2299.length; var8++) {
                var6[var8] = var5.field2299[var8];
                var7[var8] = var5.field2298[var8];
            }
            for (int var9 = var5.field2299.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2299 = var6;
            var5.field2298 = var7;
        }
        var5.field2299[arg4] = arg2;
        var5.field2298[arg4] = arg3;
    }
}
