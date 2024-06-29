import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class398 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[J")
    private long[] field5676 = new long[8];

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[J")
    private long[] field5673 = new long[8];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[B")
    private byte[] field5670 = new byte[32];

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[B")
    private byte[] field5683 = new byte[64];

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[J")
    private long[] field5679 = new long[8];

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[J")
    private long[] field5677 = new long[8];

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    private int field5682 = 0;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[J")
    private long[] field5678 = new long[8];

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    private int field5684 = 0;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lej;")
    public static class104 field5675 = new class104("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field5687 = 0;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field5686 = 0;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Lan;")
    public static class21 field5688;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public final void method2379(byte arg0) {
        field5672++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field5670[var2] = 0;
        }
        this.field5682 = this.field5684 = 0;
        this.field5683[0] = 0;
        int var3 = 107 / ((-arg0 - 67) / 42);
        for (int var4 = 0; var4 < 8; var4++) {
            this.field5673[var4] = 0L;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
    public static final void method2380(byte arg0, int arg1) {
        field5671++;
        if (class485.field6824 == null) {
            class485.field6824 = new byte[4][class32.field513][class611.field8786];
        }
        if (arg1 > -49) {
            method2380((byte) 21, -49);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class32.field513; var3++) {
                for (int var4 = 0; var4 < class611.field8786; var4++) {
                    class485.field6824[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    private final void method2381(byte arg0) {
        field5685++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field5679[var2] = class344.method2082(class344.method2082(class344.method2082(class253.method1580(255L, (long) this.field5683[var3 + 5]) << 16, class344.method2082(class344.method2082(class253.method1580(0xFFL << 32, (long) this.field5683[var3 + 3] << 32), class344.method2082(class344.method2082((long) this.field5683[var3] << 56, class253.method1580((long) this.field5683[var3 + 1], 255L) << 48), class253.method1580(255L, (long) this.field5683[var3 + 2]) << 40)), class253.method1580(255L, (long) this.field5683[var3 + 4]) << 24)), class253.method1580((long) this.field5683[var3 + 6] << 8, 0xFFL << 8)), class253.method1580(255L, (long) this.field5683[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field5676[var4] = class344.method2082(this.field5679[var4], this.field5678[var4] = this.field5673[var4]);
        }
        int var5 = 1;
        if (arg0 != -26) {
            this.method2383(40L, null, 100);
        }
        while (var5 <= 10) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field5677[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field5677[var7] = class344.method2082(this.field5677[var7], class421.field5911[var13][class589.method3454((int) (this.field5678[class589.method3454(7, var7 - var13)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field5678[var8] = this.field5677[var8];
            }
            this.field5678[0] = class344.method2082(this.field5678[0], class421.field5910[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field5677[var9] = this.field5678[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field5677[var9] = class344.method2082(this.field5677[var9], class421.field5911[var11][class589.method3454(255, (int) (this.field5676[class589.method3454(7, var9 - var11)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field5676[var10] = this.field5677[var10];
            }
            var5++;
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field5673[var6] = class344.method2082(this.field5673[var6], class344.method2082(this.field5676[var6], this.field5679[var6]));
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static final void method2382(boolean arg0) {
        if (arg0) {
            method2382(true);
        }
        class386.field5185 = new class46();
        field5681++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(J[BI)V")
    public final void method2383(long arg0, byte[] arg1, int arg2) {
        field5680++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field5682 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field5670[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field5670[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        if (arg2 >= -67) {
            this.field5677 = null;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field5683[this.field5684] = (byte) class73.method578(this.field5683[this.field5684], var15 >>> var7);
            this.field5682 += 8 - var7;
            this.field5684++;
            if (this.field5682 == 512) {
                this.method2381((byte) -26);
                this.field5682 = this.field5684 = 0;
            }
            this.field5683[this.field5684] = (byte) class589.method3454(var15 << 8 - var7, 255);
            var5++;
            this.field5682 += var7;
            arg0 -= 8L;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field5683[this.field5684] = (byte) class73.method578(this.field5683[this.field5684], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (((long) var7 + arg0) < 8L) {
            this.field5682 = (int) ((long) this.field5682 + arg0);
            return;
        }
        long var13 = arg0 - (long) (8 - var7);
        this.field5684++;
        this.field5682 += 8 - var7;
        if (this.field5682 == 512) {
            this.method2381((byte) -26);
            this.field5682 = this.field5684 = 0;
        }
        this.field5683[this.field5684] = (byte) class589.method3454(255, var12 << 8 - var7);
        this.field5682 += (int) var13;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BIB)V")
    public final void method2384(byte[] arg0, int arg1, byte arg2) {
        field5674++;
        this.field5683[this.field5684] = (byte) class73.method578(this.field5683[this.field5684], 0x80 >>> class589.method3454(this.field5682, 7));
        this.field5684++;
        if (arg2 != -19) {
            this.method2379((byte) 125);
        }
        if (this.field5684 > 32) {
            while (this.field5684 < 64) {
                this.field5683[this.field5684++] = 0;
            }
            this.method2381((byte) -26);
            this.field5684 = 0;
        }
        while (this.field5684 < 32) {
            this.field5683[this.field5684++] = 0;
        }
        class416.method2498(this.field5670, 0, this.field5683, 32, 32);
        this.method2381((byte) -26);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field5673[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method2385(int arg0) {
        if (arg0 <= 17) {
            field5675 = null;
        }
        field5675 = null;
        field5688 = null;
    }
}
