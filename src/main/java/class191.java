import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class191 extends class248 {

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "Lij;")
    public static class50 field3168 = class78.method578(122, "<col=ffffff>");

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Lij;")
    private static class50 field3163 = class78.method578(127, "compass");

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field3171 = 0;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Lij;")
    private static class50 field3179 = class78.method578(125, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lij;")
    public static class50 field3165 = field3179;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "Lij;")
    private static class50 field3184 = class78.method578(124, "Loaded sprites");

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Lij;")
    public static class50 field3161 = field3184;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3164 = new CRC32();

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "Z")
    public static boolean field3185;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "[I")
    public int[] field3166;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "[I")
    private int[] field3177;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "[Lij;")
    private class50[] field3167;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "[[I")
    private int[][] field3173;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)Lij;")
    public final class50 method1285(int arg0) {
        field3172++;
        class50 var2 = class203.method1374((byte) 127, 80);
        if (this.field3167 == null) {
            return class109.field1962;
        }
        var2.method381((byte) -80, this.field3167[0]);
        for (int var3 = 1; var3 < this.field3167.length; var3++) {
            var2.method381((byte) -86, class99.field1823);
            var2.method381((byte) -109, this.field3167[var3]);
        }
        if (arg0 <= 120) {
            this.method1294(-65, -124);
        }
        return var2.method409(-1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLij;)V")
    public static final void method1286(byte arg0, class50 arg1) {
        if (arg0 != 38) {
            field3176 = 63;
        }
        field3157++;
        class129 var2 = class8.method49(true, arg1);
        if (var2 == null) {
            return;
        }
        class254.field4393 = class46.field847 + class140.field2460 - var2.field2258;
        class142.field2484 = var2.field2265 - class90.field1714;
        int var3 = class142.field2484 - ((int) ((double) class19.field398.field243 / class2.field20));
        int var4 = (int) ((double) class19.field398.field243 / class2.field20) + class142.field2484;
        if (var3 < 0) {
            class142.field2484 = (int) ((double) class19.field398.field243 / class2.field20);
        }
        int var5 = class254.field4393 - ((int) ((double) class19.field398.field242 / class2.field20));
        if (var4 > class155.field2701) {
            class142.field2484 = class155.field2701 - ((int) ((double) class19.field398.field243 / class2.field20));
        }
        int var6 = (int) ((double) class19.field398.field242 / class2.field20) + class254.field4393;
        if (var5 < 0) {
            class254.field4393 = (int) ((double) class19.field398.field242 / class2.field20);
        }
        if (class140.field2460 < var6) {
            class254.field4393 = class140.field2460 - ((int) ((double) class19.field398.field242 / class2.field20));
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLda;)V")
    public static final void method1287(byte arg0, class22 arg1) {
        if (arg0 != 23) {
            method1299(22, 76, -72, 81, 114, -15, -52, -88);
        }
        field3159++;
        class60.field1101 = arg1;
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public final void method1288(int arg0) {
        if (arg0 != 0) {
            this.method1285(63);
        }
        field3183++;
        if (this.field3166 != null) {
            for (int var2 = 0; var2 < this.field3166.length; var2++) {
                this.field3166[var2] = class29.method261(this.field3166[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
    public final int method1289(byte arg0) {
        if (arg0 >= -50) {
            return 91;
        } else {
            field3186++;
            return this.field3177 == null ? 0 : this.field3177.length;
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
    public static final void method1290(int arg0) {
        field3155++;
        if (arg0 != 28) {
            field3171 = -21;
        }
        if (class25.field537 == 30) {
            class120.method868(arg0 + 93, 25);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lwd;I)V")
    public final void method1291(class217 arg0, int arg1) {
        field3156++;
        if (arg1 > -99) {
            field3163 = null;
        }
        while (true) {
            int var3 = arg0.method1487(255);
            if (var3 == 0) {
                return;
            }
            this.method1292(arg0, var3, -7570);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lwd;II)V")
    private final void method1292(class217 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3167 = arg0.method1469((byte) -76).method389(60, false);
        } else if (arg1 == 2) {
            int var8 = arg0.method1487(255);
            this.field3166 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3166[var9] = arg0.method1441(98);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1487(255);
            this.field3173 = new int[var4][];
            this.field3177 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1441(arg2 + 7650);
                this.field3177[var5] = var6;
                this.field3173[var5] = new int[class241.field4160[var6]];
                for (int var7 = 0; var7 < class241.field4160[var6]; var7++) {
                    this.field3173[var5][var7] = arg0.method1441(109);
                }
            }
        }
        if (arg2 == -7570) {
            field3182++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public static final void method1293(int arg0, int arg1) {
        field3180++;
        if (arg0 == -1 || !class182.field2993[arg0]) {
            return;
        }
        class217.field3630.method173(-17961, arg0);
        if (class137.field2380[arg0] == null) {
            return;
        }
        boolean var2 = true;
        int var3 = 66 / ((arg1 - 60) / 59);
        for (int var4 = 0; var4 < class137.field2380[arg0].length; var4++) {
            if (class137.field2380[arg0][var4] != null) {
                if (class137.field2380[arg0][var4].field227 == 2) {
                    var2 = false;
                } else {
                    class137.field2380[arg0][var4] = null;
                }
            }
        }
        if (var2) {
            class137.field2380[arg0] = null;
        }
        class182.field2993[arg0] = false;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)I")
    public final int method1294(int arg0, int arg1) {
        field3160++;
        if (arg0 == 28400) {
            return this.field3177 == null || arg1 < 0 || arg1 > this.field3177.length ? -1 : this.field3177[arg1];
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILwd;)Lij;")
    public final class50 method1295(int arg0, class217 arg1) {
        field3181++;
        if (arg0 != -31800) {
            method1297((class22) null, -88);
        }
        class50 var3 = class203.method1374((byte) 75, 80);
        if (this.field3177 != null) {
            for (int var4 = 0; var4 < this.field3177.length; var4++) {
                var3.method381((byte) -103, this.field3167[var4]);
                var3.method381((byte) -44, class144.method1010(arg1.method1434(class28.field602[this.field3177[var4]], 8), this.field3177[var4], this.field3173[var4], false));
            }
        }
        var3.method381((byte) -112, this.field3167[this.field3167.length - 1]);
        return var3.method409(-1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)I")
    public static final int method1296(int arg0, int arg1, byte arg2) {
        field3169++;
        if (arg2 >= -3) {
            field3179 = null;
        }
        long var3 = (long) ((arg0 << 16) + arg1);
        return class54.field979 != null && class54.field979.field635 == var3 ? class260.field4525.field3581 * 99 / (class260.field4525.field3633.length - class54.field979.field2481) + 1 : 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lda;I)V")
    public static final void method1297(class22 arg0, int arg1) {
        field3162++;
        class260.field4516 = arg0.method186(32, class66.field1272);
        class115.field2017 = arg0.method186(66, class41.field756);
        class91.field1724 = arg0.method186(arg1 + 116, class245.field4262);
        class134.field2336 = arg0.method186(66, class148.field2549);
        field3158 = arg0.method186(123, class179.field2985);
        class164.field2803 = arg0.method186(25, class109.field1966);
        class211.field3510 = arg0.method186(arg1 ^ 0x2D, class96.field1782);
        class58.field1039 = arg0.method186(119, class179.field2986);
        class56.field1016 = arg0.method186(36, class238.field4040);
        class7.field86 = arg0.method186(57, class251.field4356);
        if (arg1 != 0) {
            method1287((byte) -72, (class22) null);
        }
        class251.field4354 = arg0.method186(36, class55.field983);
        class177.field2961 = arg0.method186(121, class213.field3538);
        class46.field848 = arg0.method186(62, class183.field3013);
        class8.field113 = arg0.method186(61, class132.field2310);
        class175.field2940 = arg0.method186(112, class207.field3441);
        class123.field2160 = arg0.method186(125, class241.field4165);
        arg0.method186(95, class205.field3402);
        class46.field840 = arg0.method186(arg1 ^ 0x63, field3163);
        class96.field1805 = arg0.method186(95, class123.field2165);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lwd;[II)V")
    public final void method1298(class217 arg0, int[] arg1, int arg2) {
        field3174++;
        if (this.field3177 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field3177.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = class151.field2627[this.method1294(arg2 + 28400, var4)];
            if (var5 > 0) {
                arg0.method1484((long) arg1[var4], -8, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)V")
    public static void method1300(int arg0) {
        field3168 = null;
        field3184 = null;
        field3161 = null;
        field3163 = null;
        if (arg0 != 0) {
            method1290(5);
        }
        field3165 = null;
        field3164 = null;
        field3179 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZI)I")
    public final int method1301(int arg0, boolean arg1, int arg2) {
        field3178++;
        if (this.field3177 == null || arg2 < 0 || this.field3177.length < arg2) {
            return -1;
        } else if (this.field3173[arg2] == null || arg0 < 0 || this.field3173[arg2].length < arg0) {
            return -1;
        } else {
            if (!arg1) {
                method1296(-125, -122, (byte) 75);
            }
            return this.field3173[arg2][arg0];
        }
    }
}
