import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class723 {

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    private int field10099 = 0;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "[J")
    private long[] field10103 = new long[8];

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[J")
    private long[] field10094 = new long[8];

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "[J")
    private long[] field10101 = new long[8];

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "[B")
    private byte[] field10090 = new byte[64];

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[J")
    private long[] field10091 = new long[8];

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    private int field10106 = 0;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "[J")
    private long[] field10100 = new long[8];

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "[B")
    private byte[] field10107 = new byte[32];

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[I")
    public static int[] field10092 = new int[1];

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "[J")
    public static long[] field10105 = new long[256];

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field10095 = 0;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "[Lkb;")
    public static class690[] field10093;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field10105[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 4)
    public static final void method4058(byte arg0) {
        field10097++;
        if (arg0 >= 120) {
            class202.field2392 = true;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([BIJ)V", line = 22)
    public final void method4059(byte[] arg0, int arg1, long arg2) {
        field10098++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        if (arg1 != 64) {
            method4058((byte) 113);
        }
        int var7 = this.field10106 & 0x7;
        long var8 = arg2;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field10107[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field10107[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg2 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field10090[this.field10099] = (byte) class344.method2020(this.field10090[this.field10099], var15 >>> var7);
            this.field10099++;
            this.field10106 += 8 - var7;
            if (this.field10106 == 512) {
                this.method4062((byte) 105);
                this.field10106 = this.field10099 = 0;
            }
            this.field10090[this.field10099] = (byte) class321.method1919(var15 << 8 - var7, 255);
            this.field10106 += var7;
            arg2 -= 8L;
            var5++;
        }
        int var12;
        if (arg2 > 0L) {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field10090[this.field10099] = (byte) class344.method2020(this.field10090[this.field10099], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg2 < 8L) {
            this.field10106 = (int) ((long) this.field10106 + arg2);
            return;
        }
        this.field10099++;
        long var13 = arg2 - (long) (8 - var7);
        this.field10106 += 8 - var7;
        if (this.field10106 == 512) {
            this.method4062((byte) 125);
            this.field10106 = this.field10099 = 0;
        }
        this.field10090[this.field10099] = (byte) class321.method1919(255, var12 << 8 - var7);
        this.field10106 += (int) var13;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI[B)V", line = 118)
    public final void method4060(byte arg0, int arg1, byte[] arg2) {
        int var4 = -79 / ((arg0 - 17) / 60);
        this.field10090[this.field10099] = (byte) class344.method2020(this.field10090[this.field10099], 0x80 >>> class321.method1919(7, this.field10106));
        field10096++;
        this.field10099++;
        if (this.field10099 > 32) {
            while (true) {
                if (this.field10099 >= 64) {
                    this.method4062((byte) 99);
                    this.field10099 = 0;
                    break;
                }
                this.field10090[this.field10099++] = 0;
            }
        }
        while (this.field10099 < 32) {
            this.field10090[this.field10099++] = 0;
        }
        class373.method2194(this.field10107, 0, this.field10090, 32, 32);
        this.method4062((byte) 103);
        int var5 = 0;
        int var6 = arg1;
        while (var5 < 8) {
            long var7 = this.field10094[var5];
            arg2[var6] = (byte) ((int) (var7 >>> 56));
            arg2[var6 + 1] = (byte) ((int) (var7 >>> 48));
            arg2[var6 + 2] = (byte) ((int) (var7 >>> 40));
            arg2[var6 + 3] = (byte) ((int) (var7 >>> 32));
            arg2[var6 + 4] = (byte) ((int) (var7 >>> 24));
            arg2[var6 + 5] = (byte) ((int) (var7 >>> 16));
            arg2[var6 + 6] = (byte) ((int) (var7 >>> 8));
            arg2[var6 + 7] = (byte) ((int) var7);
            var6 += 8;
            var5++;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V", line = 173)
    public final void method4061(byte arg0) {
        field10102++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field10107[var2] = 0;
        }
        this.field10090[0] = 0;
        this.field10106 = this.field10099 = 0;
        int var3 = 0;
        if (arg0 != -77) {
            method4058((byte) 86);
        }
        while (var3 < 8) {
            this.field10094[var3] = 0L;
            var3++;
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V", line = 199)
    private final void method4062(byte arg0) {
        field10104++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field10100[var2] = class705.method3974(class614.method3458((long) this.field10090[var3 + 7], 255L), class705.method3974(class614.method3458(0xFFL << 8, (long) this.field10090[var3 + 6] << 8), class705.method3974(class614.method3458(255L, (long) this.field10090[var3 + 5]) << 16, class705.method3974(class614.method3458((long) this.field10090[var3 + 4], 255L) << 24, class705.method3974(class705.method3974(class614.method3458(0xFFL << 40, (long) this.field10090[var3 + 2] << 40), class705.method3974(class614.method3458(255L, (long) this.field10090[var3 + 1]) << 48, (long) this.field10090[var3] << 56)), class614.method3458(0xFFL << 32, (long) this.field10090[var3 + 3] << 32))))));
            var2++;
            var3 += 8;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field10103[var4] = class705.method3974(this.field10100[var4], this.field10091[var4] = this.field10094[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field10101[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field10101[var7] = class705.method3974(this.field10101[var7], class188.field2267[var13][class321.method1919(255, (int) (this.field10091[class321.method1919(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field10091[var8] = this.field10101[var8];
            }
            this.field10091[0] = class705.method3974(this.field10091[0], class188.field2268[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field10101[var9] = this.field10091[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field10101[var9] = class705.method3974(this.field10101[var9], class188.field2267[var11][class321.method1919(255, (int) (this.field10103[class321.method1919(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field10103[var10] = this.field10101[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field10094[var6] = class705.method3974(this.field10094[var6], class705.method3974(this.field10100[var6], this.field10103[var6]));
        }
        if (arg0 < 98) {
            this.method4060((byte) 104, -78, null);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 309)
    public static void method4063(int arg0) {
        field10093 = null;
        field10092 = null;
        field10105 = null;
        if (arg0 != 0) {
            field10093 = null;
        }
    }
}
