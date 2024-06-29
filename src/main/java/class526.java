import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class526 {

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "[B")
    private byte[] field7205 = new byte[32];

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "[J")
    private long[] field7206 = new long[8];

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    private int field7207 = 0;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "[J")
    private long[] field7204 = new long[8];

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    private int field7209 = 0;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "[J")
    private long[] field7213 = new long[8];

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "[B")
    private byte[] field7214 = new byte[64];

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "[J")
    private long[] field7215 = new long[8];

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "[J")
    private long[] field7218 = new long[8];

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "[I")
    public static int[] field7211 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field7212 = 104;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "[Lgm;")
    public static class109[] field7216 = new class109[128];

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Llaa;")
    public static class106 field7210 = new class106(1, 2, 2, 0);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    private final void method2921(int arg0) {
        field7203++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field7206[var2] = class491.method2749(class491.method2749(class491.method2749(class610.method3371((long) this.field7214[var3 + 5], 255L) << 16, class491.method2749(class491.method2749(class491.method2749(class610.method3371((long) this.field7214[var3 + 2] << 40, 0xFFL << 40), class491.method2749((long) this.field7214[var3] << 56, class610.method3371(0xFFL << 48, (long) this.field7214[var3 + 1] << 48))), class610.method3371((long) this.field7214[var3 + 3], 255L) << 32), class610.method3371((long) this.field7214[var3 + 4] << 24, 0xFFL << 24))), class610.method3371(0xFFL << 8, (long) this.field7214[var3 + 6] << 8)), class610.method3371(255L, (long) this.field7214[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field7204[var4] = class491.method2749(this.field7206[var4], this.field7215[var4] = this.field7218[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field7213[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field7213[var7] = class491.method2749(this.field7213[var7], class232.field3294[var13][class249.method1537(255, (int) (this.field7215[class249.method1537(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field7215[var8] = this.field7213[var8];
            }
            this.field7215[0] = class491.method2749(this.field7215[0], class232.field3296[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field7213[var9] = this.field7215[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field7213[var9] = class491.method2749(this.field7213[var9], class232.field3294[var11][class249.method1537((int) (this.field7204[class249.method1537(7, var9 - var11)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field7204[var10] = this.field7213[var10];
            }
        }
        if (arg0 != -14531) {
            this.method2922(87, null, -20L);
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field7218[var6] = class491.method2749(this.field7218[var6], class491.method2749(this.field7206[var6], this.field7204[var6]));
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BJ)V")
    public final void method2922(int arg0, byte[] arg1, long arg2) {
        field7202++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field7209 & 0x7;
        long var8 = arg2;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field7205[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field7205[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg2 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field7214[this.field7207] = (byte) class266.method1624(this.field7214[this.field7207], var15 >>> var7);
            this.field7207++;
            this.field7209 += 8 - var7;
            if (this.field7209 == 512) {
                this.method2921(-14531);
                this.field7209 = this.field7207 = 0;
            }
            this.field7214[this.field7207] = (byte) class249.method1537(var15 << 8 - var7, 255);
            var5++;
            arg2 -= 8L;
            this.field7209 += var7;
        }
        int var12;
        if (arg2 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field7214[this.field7207] = (byte) class266.method1624(this.field7214[this.field7207], var12 >>> var7);
        }
        if ((long) var7 + arg2 < (long) arg0) {
            this.field7209 = (int) ((long) this.field7209 + arg2);
            return;
        }
        this.field7209 += 8 - var7;
        this.field7207++;
        long var13 = arg2 - (long) (8 - var7);
        if (this.field7209 == 512) {
            this.method2921(arg0 - 14539);
            this.field7209 = this.field7207 = 0;
        }
        this.field7214[this.field7207] = (byte) class249.method1537(var12 << 8 - var7, 255);
        this.field7209 += (int) var13;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI[B)V")
    public final void method2923(byte arg0, int arg1, byte[] arg2) {
        this.field7214[this.field7207] = (byte) class266.method1624(this.field7214[this.field7207], 0x80 >>> class249.method1537(this.field7209, 7));
        field7208++;
        this.field7207++;
        if (this.field7207 > 32) {
            while (true) {
                if (this.field7207 >= 64) {
                    this.method2921(-14531);
                    this.field7207 = 0;
                    break;
                }
                this.field7214[this.field7207++] = 0;
            }
        }
        while (this.field7207 < 32) {
            this.field7214[this.field7207++] = 0;
        }
        class282.method1706(this.field7205, 0, this.field7214, 32, 32);
        this.method2921(-14531);
        int var4 = 0;
        if (arg0 < 93) {
            this.field7206 = null;
        }
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field7218[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static void method2924(byte arg0) {
        if (arg0 <= 0) {
            method2924((byte) -114);
        }
        field7216 = null;
        field7211 = null;
        field7210 = null;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    public final void method2925(int arg0) {
        field7217++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field7205[var2] = 0;
        }
        this.field7214[0] = 0;
        this.field7209 = this.field7207 = 0;
        if (arg0 == -20310) {
            for (int var3 = 0; var3 < 8; var3++) {
                this.field7218[var3] = 0L;
            }
        }
    }
}
