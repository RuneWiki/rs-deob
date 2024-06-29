import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class383 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    private int field5370 = 0;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    private int field5380 = 0;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[B")
    private byte[] field5375 = new byte[32];

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "[J")
    private long[] field5379 = new long[8];

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "[J")
    private long[] field5383 = new long[8];

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "[J")
    private long[] field5381 = new long[8];

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[B")
    private byte[] field5376 = new byte[64];

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[J")
    private long[] field5382 = new long[8];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[J")
    private long[] field5371 = new long[8];

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field5378 = 0;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[Lvj;")
    public static class26[] field5386 = new class26[2048];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Luha;")
    public static class723 field5374;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 4)
    public static void method2339(int arg0) {
        if (arg0 == -11200) {
            field5374 = null;
            field5386 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BJB)V", line = 19)
    public final void method2340(byte[] arg0, long arg1, byte arg2) {
        field5372++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field5380 & 0x7;
        int var8 = -19 / ((arg2 - 39) / 36);
        long var9 = arg1;
        int var11 = 31;
        int var12 = 0;
        while (var11 >= 0) {
            int var17 = (this.field5375[var11] & 0xFF) + ((int) var9 & 0xFF) + var12;
            this.field5375[var11] = (byte) var17;
            var12 = var17 >>> 8;
            var9 >>>= 0x8;
            var11--;
        }
        while (arg1 > 8L) {
            int var16 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var16 < 0 || var16 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field5376[this.field5370] = (byte) class747.method4153(this.field5376[this.field5370], var16 >>> var7);
            this.field5380 += 8 - var7;
            this.field5370++;
            if (this.field5380 == 512) {
                this.method2343((byte) -39);
                this.field5380 = this.field5370 = 0;
            }
            this.field5376[this.field5370] = (byte) class136.method878(255, var16 << 8 - var7);
            var5++;
            this.field5380 += var7;
            arg1 -= 8L;
        }
        int var13;
        if (arg1 > 0L) {
            var13 = arg0[var5] << var6 & 0xFF;
            this.field5376[this.field5370] = (byte) class747.method4153(this.field5376[this.field5370], var13 >>> var7);
        } else {
            var13 = 0;
        }
        if (((long) var7 + arg1) < 8L) {
            this.field5380 = (int) ((long) this.field5380 + arg1);
            return;
        }
        long var14 = arg1 - (long) (8 - var7);
        this.field5380 += 8 - var7;
        this.field5370++;
        if (this.field5380 == 512) {
            this.method2343((byte) -112);
            this.field5380 = this.field5370 = 0;
        }
        this.field5376[this.field5370] = (byte) class136.method878(var13 << 8 - var7, 255);
        this.field5380 += (int) var14;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 112)
    public final void method2341(int arg0) {
        field5385++;
        if (arg0 > -90) {
            this.field5379 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            this.field5375[var2] = 0;
        }
        this.field5380 = this.field5370 = 0;
        this.field5376[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field5382[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIB)V", line = 142)
    public final void method2342(byte[] arg0, int arg1, byte arg2) {
        if (arg2 != -16) {
            this.method2340(null, 84L, (byte) 32);
        }
        field5377++;
        this.field5376[this.field5370] = (byte) class747.method4153(this.field5376[this.field5370], 0x80 >>> class136.method878(this.field5380, 7));
        this.field5370++;
        if (this.field5370 > 32) {
            while (this.field5370 < 64) {
                this.field5376[this.field5370++] = 0;
            }
            this.method2343((byte) -40);
            this.field5370 = 0;
        }
        while (this.field5370 < 32) {
            this.field5376[this.field5370++] = 0;
        }
        class34.method245(this.field5375, 0, this.field5376, 32, 32);
        this.method2343((byte) 104);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field5382[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 202)
    private final void method2343(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field5383[var2] = class158.method993(class158.method993(class379.method2316(0xFFL << 8, (long) this.field5376[var3 + 6] << 8), class158.method993(class158.method993(class158.method993(class158.method993(class379.method2316((long) this.field5376[var3 + 2], 255L) << 40, class158.method993(class379.method2316((long) this.field5376[var3 + 1], 255L) << 48, (long) this.field5376[var3] << 56)), class379.method2316(255L, (long) this.field5376[var3 + 3]) << 32), class379.method2316((long) this.field5376[var3 + 4], 255L) << 24), class379.method2316((long) this.field5376[var3 + 5], 255L) << 16)), class379.method2316((long) this.field5376[var3 + 7], 255L));
            var2++;
            var3 += 8;
        }
        field5373++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field5371[var4] = class158.method993(this.field5383[var4], this.field5381[var4] = this.field5382[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field5379[var8] = 0L;
                int var14 = 0;
                int var15 = 56;
                while (var14 < 8) {
                    this.field5379[var8] = class158.method993(this.field5379[var8], class389.field5420[var14][class136.method878((int) (this.field5381[class136.method878(7, var8 - var14)] >>> var15), 255)]);
                    var14++;
                    var15 -= 8;
                }
            }
            for (int var9 = 0; var9 < 8; var9++) {
                this.field5381[var9] = this.field5379[var9];
            }
            this.field5381[0] = class158.method993(this.field5381[0], class389.field5424[var5]);
            for (int var10 = 0; var10 < 8; var10++) {
                this.field5379[var10] = this.field5381[var10];
                int var12 = 0;
                int var13 = 56;
                while (var12 < 8) {
                    this.field5379[var10] = class158.method993(this.field5379[var10], class389.field5420[var12][class136.method878(255, (int) (this.field5371[class136.method878(var10 - var12, 7)] >>> var13))]);
                    var12++;
                    var13 -= 8;
                }
            }
            for (int var11 = 0; var11 < 8; var11++) {
                this.field5371[var11] = this.field5379[var11];
            }
        }
        int var6 = -69 % ((arg0 - 50) / 52);
        for (int var7 = 0; var7 < 8; var7++) {
            this.field5382[var7] = class158.method993(this.field5382[var7], class158.method993(this.field5371[var7], this.field5383[var7]));
        }
    }
}
