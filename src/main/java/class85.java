import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class85 {

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "[J")
    private long[] field939 = new long[8];

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[J")
    private long[] field934 = new long[8];

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "[J")
    private long[] field938 = new long[8];

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "[J")
    private long[] field933 = new long[8];

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[B")
    private byte[] field941 = new byte[32];

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    private int field944 = 0;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "[B")
    private byte[] field942 = new byte[64];

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "[J")
    private long[] field945 = new long[8];

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[Lso;")
    public static class494[] field932 = new class494[2048];

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field935 = 0;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field937 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 5)
    private final void method642(boolean arg0) {
        field943++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field933[var2] = class764.method4233(class764.method4233(class167.method1248((long) this.field942[var3 + 6], 255L) << 8, class764.method4233(class764.method4233(class167.method1248((long) this.field942[var3 + 4] << 24, 0xFFL << 24), class764.method4233(class764.method4233(class764.method4233(class167.method1248(255L, (long) this.field942[var3 + 1]) << 48, (long) this.field942[var3] << 56), class167.method1248(255L, (long) this.field942[var3 + 2]) << 40), class167.method1248((long) this.field942[var3 + 3] << 32, 0xFFL << 32))), class167.method1248(255L, (long) this.field942[var3 + 5]) << 16)), class167.method1248((long) this.field942[var3 + 7], 255L));
            var3 += 8;
            var2++;
        }
        if (!arg0) {
            this.field934 = null;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field945[var4] = class764.method4233(this.field933[var4], this.field938[var4] = this.field939[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field934[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field934[var7] = class764.method4233(this.field934[var7], class576.field8124[var13][class702.method3977(255, (int) (this.field938[class702.method3977(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field938[var8] = this.field934[var8];
            }
            this.field938[0] = class764.method4233(this.field938[0], class576.field8125[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field934[var9] = this.field938[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field934[var9] = class764.method4233(this.field934[var9], class576.field8124[var11][class702.method3977(255, (int) (this.field945[class702.method3977(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field945[var10] = this.field934[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field939[var6] = class764.method4233(this.field939[var6], class764.method4233(this.field945[var6], this.field933[var6]));
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 112)
    public final void method643(int arg0) {
        field940++;
        int var2 = 0;
        int var3 = 45 % ((58 - arg0) / 53);
        while (var2 < 32) {
            this.field941[var2] = 0;
            var2++;
        }
        this.field942[0] = 0;
        this.field946 = this.field944 = 0;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field939[var4] = 0L;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BJ[B)V", line = 146)
    public final void method644(byte arg0, long arg1, byte[] arg2) {
        field931++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field946 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field941[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field941[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field942[this.field944] = (byte) class746.method4158(this.field942[this.field944], var15 >>> var7);
            this.field944++;
            this.field946 += 8 - var7;
            if (this.field946 == 512) {
                this.method642(true);
                this.field946 = this.field944 = 0;
            }
            this.field942[this.field944] = (byte) class702.method3977(var15 << 8 - var7, 255);
            arg1 -= 8L;
            var5++;
            this.field946 += var7;
        }
        int var12;
        if (arg1 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field942[this.field944] = (byte) class746.method4158(this.field942[this.field944], var12 >>> var7);
        }
        if (arg0 > -124) {
            this.method647((byte) -28, null, 53);
        }
        if (((long) var7 + arg1) < 8L) {
            this.field946 = (int) ((long) this.field946 + arg1);
            return;
        }
        this.field946 += 8 - var7;
        long var13 = arg1 - (long) (8 - var7);
        this.field944++;
        if (this.field946 == 512) {
            this.method642(true);
            this.field946 = this.field944 = 0;
        }
        this.field942[this.field944] = (byte) class702.method3977(var12 << 8 - var7, 255);
        this.field946 += (int) var13;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 240)
    public static void method645(int arg0) {
        field932 = null;
        if (arg0 != -786311592) {
            method646(-104, -15, 41);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Leba;", line = 265)
    public static final class613 method646(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        return var3 == null ? null : var3.field589;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B[BI)V", line = 275)
    public final void method647(byte arg0, byte[] arg1, int arg2) {
        if (arg0 >= -72) {
            this.method643(-4);
        }
        field936++;
        this.field942[this.field944] = (byte) class746.method4158(this.field942[this.field944], 0x80 >>> class702.method3977(7, this.field946));
        this.field944++;
        if (this.field944 > 32) {
            while (this.field944 < 64) {
                this.field942[this.field944++] = 0;
            }
            this.method642(true);
            this.field944 = 0;
        }
        while (this.field944 < 32) {
            this.field942[this.field944++] = 0;
        }
        class595.method3467(this.field941, 0, this.field942, 32, 32);
        this.method642(true);
        int var4 = 0;
        int var5 = arg2;
        while (var4 < 8) {
            long var6 = this.field939[var4];
            arg1[var5] = (byte) ((int) (var6 >>> 56));
            arg1[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg1[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg1[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg1[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg1[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg1[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg1[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }
}
