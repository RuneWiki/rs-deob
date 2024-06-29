import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class175 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field2678 = 0;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[J")
    private long[] field2680 = new long[8];

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[J")
    private long[] field2687 = new long[8];

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[J")
    private long[] field2683 = new long[8];

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[J")
    private long[] field2684 = new long[8];

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field2690 = 0;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[B")
    private byte[] field2679 = new byte[64];

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[J")
    private long[] field2682 = new long[8];

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[B")
    private byte[] field2692 = new byte[32];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[[I")
    public static int[][] field2681 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 3)
    public final void method1224(int arg0) {
        field2688++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field2692[var2] = 0;
        }
        this.field2679[arg0] = 0;
        this.field2678 = this.field2690 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field2682[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIJ)V", line = 27)
    public final void method1225(byte[] arg0, int arg1, long arg2) {
        field2689++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field2678 & 0x7;
        long var8 = arg2;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field2692[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field2692[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        if (arg1 != 2) {
            this.method1225(null, 26, 17L);
        }
        while (arg2 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field2679[this.field2690] = (byte) class473.method2847(this.field2679[this.field2690], var15 >>> var7);
            this.field2678 += 8 - var7;
            this.field2690++;
            if (this.field2678 == 512) {
                this.method1228(false);
                this.field2678 = this.field2690 = 0;
            }
            this.field2679[this.field2690] = (byte) class37.method245(255, var15 << 8 - var7);
            var5++;
            arg2 -= 8L;
            this.field2678 += var7;
        }
        int var12;
        if (arg2 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field2679[this.field2690] = (byte) class473.method2847(this.field2679[this.field2690], var12 >>> var7);
        }
        if (((long) var7 + arg2) < 8L) {
            this.field2678 = (int) ((long) this.field2678 + arg2);
            return;
        }
        this.field2678 += 8 - var7;
        this.field2690++;
        long var13 = arg2 - (long) (8 - var7);
        if (this.field2678 == 512) {
            this.method1228(false);
            this.field2678 = this.field2690 = 0;
        }
        this.field2679[this.field2690] = (byte) class37.method245(255, var12 << 8 - var7);
        this.field2678 += (int) var13;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II[B)V", line = 131)
    public final void method1226(int arg0, int arg1, byte[] arg2) {
        field2685++;
        this.field2679[this.field2690] = (byte) class473.method2847(this.field2679[this.field2690], 0x80 >>> class37.method245(this.field2678, 7));
        this.field2690++;
        if (this.field2690 > 32) {
            while (true) {
                if (this.field2690 >= 64) {
                    this.method1228(false);
                    this.field2690 = 0;
                    break;
                }
                this.field2679[this.field2690++] = 0;
            }
        }
        while (this.field2690 < 32) {
            this.field2679[this.field2690++] = 0;
        }
        class648.method3737(this.field2692, 0, this.field2679, 32, 32);
        this.method1228(false);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field2682[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
        if (arg0 != -1) {
            this.method1224(-43);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 187)
    public static void method1227(byte arg0) {
        if (arg0 >= 71) {
            field2681 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 199)
    private final void method1228(boolean arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field2687[var2] = class68.method534(class209.method1384((long) this.field2679[var3 + 7], 255L), class68.method534(class68.method534(class68.method534(class68.method534(class68.method534(class209.method1384((long) this.field2679[var3 + 2] << 40, 0xFFL << 40), class68.method534(class209.method1384(255L, (long) this.field2679[var3 + 1]) << 48, (long) this.field2679[var3] << 56)), class209.method1384((long) this.field2679[var3 + 3], 255L) << 32), class209.method1384(255L, (long) this.field2679[var3 + 4]) << 24), class209.method1384(255L, (long) this.field2679[var3 + 5]) << 16), class209.method1384((long) this.field2679[var3 + 6] << 8, 0xFFL << 8)));
            var3 += 8;
            var2++;
        }
        field2686++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field2680[var4] = class68.method534(this.field2687[var4], this.field2683[var4] = this.field2682[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field2684[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field2684[var7] = class68.method534(this.field2684[var7], class270.field3828[var13][class37.method245(255, (int) (this.field2683[class37.method245(var7 - var13, 7)] >>> var14))]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field2683[var8] = this.field2684[var8];
            }
            this.field2683[0] = class68.method534(this.field2683[0], class270.field3823[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field2684[var9] = this.field2683[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field2684[var9] = class68.method534(this.field2684[var9], class270.field3828[var11][class37.method245(255, (int) (this.field2680[class37.method245(7, var9 - var11)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field2680[var10] = this.field2684[var10];
            }
        }
        int var6 = 0;
        if (!arg0) {
            while (var6 < 8) {
                this.field2682[var6] = class68.method534(this.field2682[var6], class68.method534(this.field2687[var6], this.field2680[var6]));
                var6++;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILfaa;)I", line = 315)
    public static final int method1229(int arg0, class136 arg1) {
        field2691++;
        if (arg1.field1851 == 0) {
            return 0;
        }
        if (arg1.field1923 != -1) {
            class136 var2 = null;
            if (arg1.field1923 < 32768) {
                class505 var3 = (class505) class510.field7260.method2799((long) arg1.field1923, true);
                if (var3 != null) {
                    var2 = var3.field7148;
                }
            } else if (arg1.field1923 >= 32768) {
                var2 = class293.field4036[arg1.field1923 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field8496 - var2.field8496;
                int var5 = arg1.field8500 - var2.field8500;
                if (var4 != 0 || var5 != 0) {
                    arg1.method955((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, -76);
                }
            }
        }
        if ((arg1 instanceof class373)) {
            class373 var9 = (class373) arg1;
            if (var9.field5120 != -1 && (var9.field1953 == 0 || var9.field1952 > 0)) {
                var9.method955(var9.field5120, -84);
                var9.field5120 = -1;
            }
        } else if (arg1 instanceof class571) {
            class571 var6 = (class571) arg1;
            if (var6.field8416 != -1 && (var6.field1953 == 0 || var6.field1952 > 0)) {
                int var7 = var6.field8496 - ((var6.field8416 - class473.field6687 - class473.field6687) * 64);
                int var8 = var6.field8500 - (var6.field8402 - class38.field463 - class38.field463) * 64;
                if (var7 != 0 || var8 != 0) {
                    var6.method955((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, 106);
                }
                var6.field8416 = -1;
            }
        }
        int var10 = 122 / ((-arg0 - 16) / 50);
        return arg1.method956(123);
    }
}
