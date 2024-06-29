import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class107 extends class25 {

    @OriginalMember(owner = "client!re", name = "H", descriptor = "[J")
    private long[] field2663 = new long[10];

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Lpd;")
    public static class94 field2655 = class28.method249(102, "backhmid2");

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lpd;")
    public static class94 field2649 = class28.method249(-78, "scrollbar");

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Lpd;")
    public static class94 field2661 = class28.method249(-55, "Absender:");

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field2660 = 0;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Lvc;")
    public static class128 field2652 = new class128(100);

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static volatile int field2665 = 0;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field2668 = 0;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Lhb;")
    public static class43 field2670 = new class43(5000);

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    private int field2651;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    private int field2656;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    private int field2657;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    private int field2659;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "J")
    private long field2648;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "[[[I")
    public static int[][][] field2671;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)I", line = 23)
    public static final int method782(byte arg0) {
        if (arg0 != -112) {
            field2671 = null;
        }
        field2664++;
        return class36.field944++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)I", line = 39)
    public static final int method783(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - class124.field3146[arg1 * 1024 / arg3] >> 1;
        field2662++;
        return ((65536 - var5) * arg4 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 55)
    public static void method784(int arg0) {
        field2661 = null;
        field2670 = null;
        field2671 = null;
        field2652 = null;
        field2649 = null;
        if (arg0 != 11210) {
            field2661 = null;
        }
        field2655 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 71)
    public final void method224(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2663[var2] = 0L;
        }
        if (arg0 == 33) {
            field2650++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)I", line = 100)
    public static final int method785(int arg0, int arg1, int arg2, int arg3) {
        field2647++;
        if (arg0 > 179) {
            arg2 /= 2;
        }
        if (arg0 > 192) {
            arg2 /= 2;
        }
        if (arg0 > 217) {
            arg2 /= 2;
        }
        if (arg0 > 243) {
            arg2 /= 2;
        }
        return arg3 == -10232 ? (arg1 / 4 << 10) + arg0 / 2 + (arg2 / 32 << 7) : -15;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)I", line = 129)
    public final int method228(int arg0, int arg1, int arg2) {
        int var4 = this.field2656;
        field2654++;
        int var5 = this.field2657;
        this.field2656 = 300;
        this.field2657 = 1;
        this.field2648 = class115.method856(true);
        if (this.field2663[this.field2651] == 0L) {
            this.field2657 = var5;
            this.field2656 = var4;
        } else if (this.field2648 > this.field2663[this.field2651]) {
            this.field2656 = (int) ((long) (arg1 * 2560) / (this.field2648 - this.field2663[this.field2651]));
        }
        if (this.field2656 < 25) {
            this.field2656 = 25;
        }
        if (this.field2656 > 256) {
            this.field2656 = 256;
            this.field2657 = (int) ((long) arg1 - (this.field2648 - this.field2663[this.field2651]) / 10L);
        }
        if (arg1 < this.field2657) {
            this.field2657 = arg1;
        }
        this.field2663[this.field2651] = this.field2648;
        this.field2651 = (this.field2651 + 1) % 10;
        if (this.field2657 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2663[var6] != 0L) {
                    this.field2663[var6] += this.field2657;
                }
            }
        }
        if (arg0 > this.field2657) {
            this.field2657 = arg0;
        }
        class127.method1004((long) this.field2657, -107);
        int var7 = arg2;
        while (this.field2659 < 256) {
            var7++;
            this.field2659 += this.field2656;
        }
        this.field2659 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 200)
    public final void method225(byte arg0) {
        field2653++;
        this.field2659 = 0;
        this.field2656 = 256;
        this.field2657 = 1;
        this.field2648 = class115.method856(true);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2663[var2] = this.field2648;
        }
        int var3 = -52 / ((arg0 - 85) / 34);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 254)
    public class107() {
        this.method225((byte) -29);
    }
}
