import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class111 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lsd;")
    private static class166 field2140 = class135.method935("Invalid loginserver requested)3", 0);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
    public static int[] field2153 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lsd;")
    public static class166 field2156 = class135.method935("Versteckt", 0);

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lsd;")
    public static class166 field2158 = class135.method935("<col=ffff00>*V", 0);

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[[[Lsc;")
    public static class165[][][] field2144 = new class165[4][104][104];

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2145 = 0;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lsd;")
    public static class166 field2161 = class135.method935("Hidden)2", 0);

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Z")
    public static boolean field2149 = true;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lsd;")
    public static class166 field2151 = field2140;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Lsd;")
    private static class166 field2169 = class135.method935("Attack", 0);

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Lsd;")
    public static class166 field2166 = field2169;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    private int field2141;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "J")
    private long field2160;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "J")
    private long field2167;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Z")
    public static boolean field2148;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Z")
    public boolean field2159;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "[I")
    private int[] field2146;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "[I")
    private int[] field2163;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "[Lre;")
    public static class158[] field2164;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([IZ[III)V")
    public final void method799(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        field2154++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class42.field745; var7++) {
                    class64 var8 = class177.method1204(99, var7);
                    if (var8 != null && !var8.field1324 && var8.field1334 == (arg1 ? 7 : 0) + var6) {
                        arg0[class35.field654[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        if (arg3 > -47) {
            this.method806(true, 19);
        }
        this.field2163 = arg0;
        this.field2146 = arg2;
        this.field2159 = arg1;
        this.field2141 = arg4;
        this.method803(119);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILgg;Lgg;I)Lo;")
    public final class126 method800(int arg0, int arg1, class62 arg2, class62 arg3, int arg4) {
        field2150++;
        if (this.field2141 != -1) {
            return class185.method1252(this.field2141, arg0 + 25364).method641(true, arg2, arg3, arg1, arg4);
        }
        int[] var6 = this.field2163;
        long var7 = this.field2167;
        if (arg2 != null && (arg2.field1263 >= 0 || arg2.field1261 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field2163[var9];
            }
            if (arg2.field1263 >= 0) {
                var7 += arg2.field1263 - this.field2163[5] << 8;
                var6[5] = arg2.field1263;
            }
            if (arg2.field1261 >= 0) {
                var7 += arg2.field1261 - this.field2163[3] << 16;
                var6[3] = arg2.field1261;
            }
        }
        class126 var10 = (class126) class14.field252.method64((byte) 28, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if (var21 >= 256 && var21 < 512 && !class177.method1204(101, var21 - 256).method535(arg0 ^ 0xFFFFFDFF)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class3.method19(var21 - 512, true).method489(this.field2159, false)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2160 != -1L) {
                    var10 = (class126) class14.field252.method64((byte) 28, this.field2160);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class101[] var13 = new class101[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class101 var19 = class177.method1204(116, var18 - 256).method539((byte) 37);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class101 var20 = class3.method19(var18 - 512, true).method486(this.field2159, arg0 ^ 0x224);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class101 var16 = new class101(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class5.field113[var17].length > this.field2146[var17]) {
                        var16.method749(class115.field2228[var17], class5.field113[var17][this.field2146[var17]]);
                    }
                    if (class177.field3357[var17].length > this.field2146[var17]) {
                        var16.method749(class31.field568[var17], class177.field3357[var17][this.field2146[var17]]);
                    }
                }
                var10 = var16.method755(64, 850, -30, -50, -30, true, true);
                class14.field252.method67(var10, arg0 ^ 0xFFFFC65D, var7);
                this.field2160 = var7;
            }
        }
        if (arg2 == null && arg3 == null) {
            return var10;
        }
        class126 var22;
        if (arg2 != null && arg3 != null) {
            var22 = arg2.method515(arg3, arg4, var10, (byte) 52, arg1);
        } else if (arg2 == null) {
            var22 = arg3.method524(arg4, var10, (byte) 30);
        } else {
            var22 = arg2.method524(arg1, var10, (byte) 60);
        }
        if (arg0 != -513) {
            this.method799(null, false, null, -8, 16);
        }
        return var22;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
    public static final int method801(int arg0, int arg1, int arg2) {
        field2155++;
        class134 var3 = (class134) class79.field1606.method224(arg2 - 1, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= arg2 && arg1 < var3.field2594.length) {
            return var3.field2594[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZII)V")
    public final void method802(boolean arg0, int arg1, int arg2) {
        int var4 = this.field2146[arg1];
        if (arg0) {
            var4++;
            if (class5.field113[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class5.field113[arg1].length - 1;
            }
        }
        this.field2146[arg1] = var4;
        field2152++;
        if (arg2 < 70) {
            this.method802(true, -127, -21);
        }
        this.method803(115);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    private final void method803(int arg0) {
        field2142++;
        long var2 = this.field2167;
        this.field2167 = 0L;
        int var4 = this.field2163[5];
        int var5 = this.field2163[9];
        this.field2163[9] = var4;
        this.field2163[5] = var5;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2167 <<= 0x4;
            if (this.field2163[var6] >= 256) {
                this.field2167 += this.field2163[var6] - 256;
            }
        }
        if (this.field2163[0] >= 256) {
            this.field2167 += this.field2163[0] - 256 >> 4;
        }
        if (this.field2163[1] >= 256) {
            this.field2167 += this.field2163[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field2167 <<= 0x3;
            this.field2167 += this.field2146[var7];
        }
        this.field2163[5] = var4;
        this.field2163[9] = var5;
        this.field2167 <<= 0x1;
        this.field2167 += this.field2159 ? 1 : 0;
        if (arg0 <= 108) {
            this.method804(null, (byte) -21);
        }
        if (var2 != 0L && this.field2167 != var2) {
            class14.field252.method70(0, var2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lff;B)V")
    public final void method804(class53 arg0, byte arg1) {
        field2165++;
        arg0.method429(this.field2159 ? 1 : 0, (byte) 114);
        int var3 = 0;
        if (arg1 != -48) {
            this.field2146 = null;
        }
        while (var3 < 7) {
            int var5 = this.field2163[class35.field654[var3]];
            if (var5 == 0) {
                arg0.method429(-1, (byte) 108);
            } else {
                arg0.method429(var5 - 256, (byte) 104);
            }
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method429(this.field2146[var4], (byte) 114);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLgg;I)Lo;")
    public final class126 method805(boolean arg0, class62 arg1, int arg2) {
        field2157++;
        if (arg0) {
            this.method802(true, 27, 8);
        }
        if (this.field2141 != -1) {
            return class185.method1252(this.field2141, 24851).method640((byte) -113, arg1, arg2);
        }
        class126 var4 = (class126) class90.field1765.method64((byte) 28, this.field2167);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2163[var6];
                if (var15 >= 256 && var15 < 512 && !class177.method1204(93, var15 - 256).method537(0)) {
                    var5 = true;
                }
                if (var15 >= 512 && !class3.method19(var15 - 512, true).method487(this.field2159, false)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class101[] var7 = new class101[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2163[var9];
                if (var12 >= 256 && var12 < 512) {
                    class101 var13 = class177.method1204(123, var12 - 256).method542(20499);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
                if (var12 >= 512) {
                    class101 var14 = class3.method19(var12 - 512, true).method483((byte) 62, this.field2159);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class101 var10 = new class101(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class5.field113[var11].length > this.field2146[var11]) {
                    var10.method749(class115.field2228[var11], class5.field113[var11][this.field2146[var11]]);
                }
                if (class177.field3357[var11].length > this.field2146[var11]) {
                    var10.method749(class31.field568[var11], class177.field3357[var11][this.field2146[var11]]);
                }
            }
            var4 = var10.method755(64, 768, -50, -10, -50, true, true);
            class90.field1765.method67(var4, 15266, this.field2167);
        }
        if (arg1 != null) {
            var4 = arg1.method519(-25747, var4, arg2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
    public final void method806(boolean arg0, int arg1) {
        field2143++;
        if (this.field2159 != arg0 && arg1 == 16502) {
            this.method799(null, arg0, this.field2146, arg1 ^ 0xFFFFBFDA, -1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(ZII)V")
    public final void method807(boolean arg0, int arg1, int arg2) {
        field2139++;
        if (arg1 == 1 && this.field2159) {
            return;
        }
        int var4 = this.field2163[class35.field654[arg1]];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 - arg2;
        class64 var6;
        do {
            if (arg0) {
                var5++;
                if (class42.field745 <= var5) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class42.field745 - 1;
                }
            }
            var6 = class177.method1204(107, var5);
        } while (var6 == null || var6.field1324 || (this.field2159 ? 7 : 0) + arg1 != var6.field1334);
        this.field2163[class35.field654[arg1]] = var5 + 256;
        this.method803(116);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method808(int arg0) {
        class156.field2989.field1000 = 0;
        class67.field1366 = 0;
        class106.field2074 = 0;
        class19.field335 = 0;
        class179.field3377.field1000 = 0;
        class145.field2841 = -1;
        class113.field2209 = -1;
        class192.field3654 = false;
        class160.field3064 = 0;
        class162.field3088 = -1;
        class16.field276 = arg0;
        field2147++;
        class112.field2195 = 0;
        class64.field1327 = -1;
        for (int var1 = 0; var1 < class182.field3451.length; var1++) {
            if (class182.field3451[var1] != null) {
                class182.field3451[var1].field3497 = -1;
            }
        }
        for (int var2 = 0; var2 < class124.field2434.length; var2++) {
            if (class124.field2434[var2] != null) {
                class124.field2434[var2].field3497 = -1;
            }
        }
        class29.method223(-4);
        class88.method695((byte) -125, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class30.field556[var3] = true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static void method809(int arg0) {
        field2153 = null;
        field2166 = null;
        field2140 = null;
        field2156 = null;
        field2151 = null;
        field2144 = null;
        if (arg0 == 0) {
            field2158 = null;
            field2164 = null;
            field2161 = null;
            field2169 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static final void method810(int arg0) {
        for (int var1 = -1; var1 < class6.field131; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class53.field967[var1];
            }
            class123 var3 = class182.field3451[var2];
            if (var3 != null) {
                class200.method1321(128, 1, var3);
            }
        }
        if (arg0 <= 64) {
            field2145 = 60;
        }
        field2162++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)I")
    public final int method811(byte arg0) {
        if (arg0 <= 16) {
            this.field2167 = -111L;
        }
        field2168++;
        return this.field2141 == -1 ? (this.field2146[4] << 20) + (this.field2163[8] << 10) + (this.field2163[11] << 5) + (this.field2163[0] << 15) + (this.field2146[0] << 25) + this.field2163[1] : 305419896 - -class185.method1252(this.field2141, 24851).field1579;
    }
}
