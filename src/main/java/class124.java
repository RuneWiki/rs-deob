import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class124 extends class130 {

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "[J")
    private long[] field2666 = new long[10];

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    private int field2661 = 1;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    private int field2671 = 0;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    private int field2657 = 256;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "J")
    private long field2659 = class166.method1184((byte) -80);

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lrc;")
    public static class155 field2663 = new class155(64);

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Lea;")
    public static class38 field2668 = class9.method46((byte) 118, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    private int field2664;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Lob;")
    public static class127 field2673;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[I")
    public static int[] field2662;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "[[[B")
    public static byte[][][] field2670;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2672++;
        class105 var5 = (class105) class19.field410.method183((byte) 98, (long) arg2);
        if (var5 == null) {
            var5 = new class105();
            class19.field410.method184(var5, false, (long) arg2);
        }
        if (arg3 <= 10) {
            field2662 = null;
        }
        if (arg1 >= var5.field2348.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field2348.length; var8++) {
                var6[var8] = var5.field2348[var8];
                var7[var8] = var5.field2340[var8];
            }
            for (int var9 = var5.field2348.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2348 = var6;
            var5.field2340 = var7;
        }
        var5.field2348[arg1] = arg4;
        var5.field2340[arg1] = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBI)I")
    public final int method926(int arg0, byte arg1, int arg2) {
        field2665++;
        int var4 = this.field2657;
        this.field2657 = 300;
        int var5 = this.field2661;
        this.field2661 = 1;
        this.field2659 = class166.method1184((byte) -80);
        if (arg1 != 119) {
            return -127;
        }
        if (this.field2666[this.field2664] == 0L) {
            this.field2657 = var4;
            this.field2661 = var5;
        } else if (this.field2659 > this.field2666[this.field2664]) {
            this.field2657 = (int) ((long) (arg2 * 2560) / (this.field2659 - this.field2666[this.field2664]));
        }
        if (this.field2657 < 25) {
            this.field2657 = 25;
        }
        if (this.field2657 > 256) {
            this.field2657 = 256;
            this.field2661 = (int) ((long) arg2 - (this.field2659 - this.field2666[this.field2664]) / 10L);
        }
        if (this.field2661 > arg2) {
            this.field2661 = arg2;
        }
        this.field2666[this.field2664] = this.field2659;
        this.field2664 = (this.field2664 + 1) % 10;
        if (this.field2661 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2666[var6] != 0L) {
                    this.field2666[var6] += this.field2661;
                }
            }
        }
        int var7 = 0;
        if (this.field2661 < arg0) {
            this.field2661 = arg0;
        }
        class132.method969((long) this.field2661, (byte) 58);
        while (this.field2671 < 256) {
            this.field2671 += this.field2657;
            var7++;
        }
        this.field2671 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIBII)I")
    public static final int method927(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        field2660++;
        int var8 = arg0 & 0x3;
        if (arg4 <= 48) {
            return -107;
        } else if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 8 - arg5 - arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg6;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method928(int arg0) {
        field2658++;
        if (arg0 != 5) {
            method927(-93, -70, 65, 103, (byte) -59, 27, -88);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2666[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public static void method929(int arg0) {
        field2668 = null;
        field2663 = null;
        int var1 = 96 / ((arg0 - 63) / 50);
        field2662 = null;
        field2670 = null;
        field2673 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class124() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2666[var1] = this.field2659;
        }
    }
}
