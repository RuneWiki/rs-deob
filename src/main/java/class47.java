import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class34 {

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "[J")
    private long[] field969 = new long[10];

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "[I")
    public static int[] field965 = new int[256];

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lrd;")
    public static class114 field982;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lrd;")
    private static class114 field983;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "Lrd;")
    private static class114 field975;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "Lrd;")
    public static class114 field974;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "Lrd;")
    private static class114 field986;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Lrd;")
    public static class114 field979;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lrd;")
    public static class114 field985;

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "Lrd;")
    public static class114 field987;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "[B")
    public static byte[] field978;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Lrd;")
    public static class114 field976;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "J")
    private long field960;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "J")
    public static long field980;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Lke;")
    public static class73 field963;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "[[I")
    public static int[][] field984;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lrd;Lpb;ZLrd;)Loa;")
    public static final class93 method343(class114 arg0, class100 arg1, boolean arg2, class114 arg3) {
        int var4 = arg1.method766(arg0, (byte) -96);
        if (arg2) {
            field985 = null;
        }
        int var5 = arg1.method752(arg3, -31757, var4);
        field970++;
        return class64.method520(64, arg1, var4, var5);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public final void method8(int arg0) {
        field971++;
        this.field966 = 256;
        this.field959 = 0;
        this.field973 = 1;
        this.field960 = class99.method747(arg0 - 15);
        int var2 = 0;
        if (arg0 == 15) {
            while (var2 < 10) {
                this.field969[var2] = this.field960;
                var2++;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)I")
    public static final int method344(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 255) {
            return -21;
        }
        int var4 = arg3 & 0x3;
        field961++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
    public static void method345(int arg0) {
        field982 = null;
        field987 = null;
        field965 = null;
        field978 = null;
        field963 = null;
        field983 = null;
        field974 = null;
        field986 = null;
        field979 = null;
        field985 = null;
        field976 = null;
        field984 = null;
        field975 = null;
        if (arg0 != 25) {
            field980 = -10L;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != -2982) {
            this.field966 = -101;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field969[var2] = 0L;
        }
        field977++;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class47() {
        this.method8(15);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Loa;B)V")
    public static final void method346(class93 arg0, byte arg1) {
        if (arg1 != 36) {
            return;
        }
        field962++;
        for (int var2 = 0; var2 < class8.field123.length; var2++) {
            class8.field123[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class8.field123[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class63.field1354[var15] = (class8.field123[var15 - 1] + class8.field123[var15 - 128] + class8.field123[var15 + 1] + class8.field123[var15 + 128]) / 4;
                }
            }
            int[] var13 = class8.field123;
            class8.field123 = class63.field1354;
            class63.field1354 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2175; var7++) {
            for (int var8 = 0; var8 < arg0.field2174; var8++) {
                if (arg0.field2171[var6++] != 0) {
                    int var9 = var7 + arg0.field2172 + 16;
                    int var10 = var8 + arg0.field2169 + 16;
                    int var11 = (var9 << 7) + var10;
                    class8.field123[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)I")
    public final int method6(int arg0, int arg1, int arg2) {
        if (arg2 != 64) {
            return 25;
        }
        int var4 = this.field966;
        int var5 = this.field973;
        field964++;
        this.field966 = 300;
        this.field973 = 1;
        this.field960 = class99.method747(arg2 - 64);
        if (this.field969[this.field968] == 0L) {
            this.field973 = var5;
            this.field966 = var4;
        } else if (this.field969[this.field968] < this.field960) {
            this.field966 = (int) ((long) (arg1 * 2560) / (this.field960 - this.field969[this.field968]));
        }
        if (this.field966 < 25) {
            this.field966 = 25;
        }
        if (this.field966 > 256) {
            this.field966 = 256;
            this.field973 = (int) ((long) arg1 - (this.field960 - this.field969[this.field968]) / 10L);
        }
        if (this.field973 > arg1) {
            this.field973 = arg1;
        }
        this.field969[this.field968] = this.field960;
        this.field968 = (this.field968 + 1) % 10;
        if (this.field973 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field969[var6] != 0L) {
                    this.field969[var6] += this.field973;
                }
            }
        }
        if (arg0 > this.field973) {
            this.field973 = arg0;
        }
        int var7 = 0;
        class141.method1122(17525, (long) this.field973);
        while (this.field959 < 256) {
            var7++;
            this.field959 += this.field966;
        }
        this.field959 &= 0xFF;
        return var7;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field965[var0] = var1;
        }
        field982 = class84.method656("Wen m-Ochten Sie von der Liste entfernen?", (byte) 125);
        field983 = class84.method656("Existing user", (byte) 122);
        field975 = class84.method656("Loaded update list", (byte) 121);
        field974 = class84.method656("Musik)2Engine vorbereitet)3", (byte) 114);
        field986 = class84.method656("Cancel", (byte) 117);
        field979 = class84.method656("Suche nach Updates )2 ", (byte) 123);
        field985 = field983;
        field987 = field986;
        field978 = new byte[520];
        field976 = field975;
    }
}
