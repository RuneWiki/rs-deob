import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class604 {

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[J")
    private long[] field8593 = new long[8];

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[J")
    private long[] field8587 = new long[8];

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    private int field8598 = 0;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[J")
    private long[] field8588 = new long[8];

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    private int field8597 = 0;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "[B")
    private byte[] field8603 = new byte[64];

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[J")
    private long[] field8594 = new long[8];

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[J")
    private long[] field8589 = new long[8];

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "[B")
    private byte[] field8606 = new byte[32];

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Z")
    public static boolean field8590 = false;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Liu;")
    public static class517 field8604 = new class517(50, 2);

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "[[Z")
    public static boolean[][] field8600;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    private final void method3439(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field8588[var2] = class146.method1068(class146.method1068(class104.method871(0xFFL << 8, (long) this.field8603[var3 + 6] << 8), class146.method1068(class104.method871(255L, (long) this.field8603[var3 + 5]) << 16, class146.method1068(class146.method1068(class104.method871(255L, (long) this.field8603[var3 + 3]) << 32, class146.method1068(class104.method871(255L, (long) this.field8603[var3 + 2]) << 40, class146.method1068((long) this.field8603[var3] << 56, class104.method871((long) this.field8603[var3 + 1], 255L) << 48))), class104.method871(255L, (long) this.field8603[var3 + 4]) << 24))), class104.method871((long) this.field8603[var3 + 7], 255L));
            var2++;
            var3 += 8;
        }
        field8592++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field8587[var4] = class146.method1068(this.field8588[var4], this.field8593[var4] = this.field8594[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field8589[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field8589[var7] = class146.method1068(this.field8589[var7], class215.field3258[var13][class424.method2540(255, (int) (this.field8593[class424.method2540(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field8593[var8] = this.field8589[var8];
            }
            this.field8593[0] = class146.method1068(this.field8593[0], class215.field3259[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field8589[var9] = this.field8593[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field8589[var9] = class146.method1068(this.field8589[var9], class215.field3258[var11][class424.method2540((int) (this.field8587[class424.method2540(var9 - var11, 7)] >>> var12), 255)]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field8587[var10] = this.field8589[var10];
            }
        }
        if (arg0 >= 35) {
            for (int var6 = 0; var6 < 8; var6++) {
                this.field8594[var6] = class146.method1068(this.field8594[var6], class146.method1068(this.field8587[var6], this.field8588[var6]));
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3440(int arg0, int arg1, byte arg2) {
        field8605++;
        if (arg2 != 0) {
            field8600 = null;
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public static void method3441(byte arg0) {
        field8604 = null;
        if (arg0 == -70) {
            field8600 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
    public static final void method3442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8599++;
        int var6 = arg4 - arg0;
        int var7 = arg1 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class373.method2264(arg3, arg1, arg0, (byte) 96, arg2);
            }
        } else if (var7 == 0) {
            class497.method2834((byte) 62, arg4, arg0, arg3, arg2);
        } else if (arg5 < -11) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg4 < class183.field2638) {
                var11 = class183.field2638;
                var10 = (class183.field2638 * var8 >> 12) + var9;
            } else if (arg4 > class268.field3911) {
                var10 = (class268.field3911 * var8 >> 12) + var9;
                var11 = class268.field3911;
            } else {
                var11 = arg4;
                var10 = arg1;
            }
            int var12;
            int var13;
            if (class183.field2638 > arg0) {
                var12 = class183.field2638;
                var13 = (class183.field2638 * var8 >> 12) + var9;
            } else if (arg0 > class268.field3911) {
                var12 = class268.field3911;
                var13 = (class268.field3911 * var8 >> 12) + var9;
            } else {
                var13 = arg2;
                var12 = arg0;
            }
            if (class222.field3350 > var10) {
                var11 = (class222.field3350 - var9 << 12) / var8;
                var10 = class222.field3350;
            } else if (class409.field6071 < var10) {
                var10 = class409.field6071;
                var11 = (class409.field6071 - var9 << 12) / var8;
            }
            if (class222.field3350 > var13) {
                var12 = (class222.field3350 - var9 << 12) / var8;
                var13 = class222.field3350;
            } else if (class409.field6071 < var13) {
                var13 = class409.field6071;
                var12 = (class409.field6071 - var9 << 12) / var8;
            }
            class109.method914(var12, -17852, var10, var11, arg3, var13);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JI[B)V")
    public final void method3443(long arg0, int arg1, byte[] arg2) {
        field8601++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field8598 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field8606[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field8606[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field8603[this.field8597] = (byte) class188.method1258(this.field8603[this.field8597], var15 >>> var7);
            this.field8597++;
            this.field8598 += 8 - var7;
            if (this.field8598 == 512) {
                this.method3439((byte) 110);
                this.field8598 = this.field8597 = 0;
            }
            this.field8603[this.field8597] = (byte) class424.method2540(var15 << 8 - var7, 255);
            var5++;
            arg0 -= 8L;
            this.field8598 += var7;
        }
        int var12;
        if (arg0 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field8603[this.field8597] = (byte) class188.method1258(this.field8603[this.field8597], var12 >>> var7);
        }
        if (arg1 != 255) {
            this.field8598 = -27;
        }
        if (((long) var7 + arg0) < 8L) {
            this.field8598 = (int) ((long) this.field8598 + arg0);
            return;
        }
        this.field8598 += 8 - var7;
        long var13 = arg0 - (long) (8 - var7);
        this.field8597++;
        if (this.field8598 == 512) {
            this.method3439((byte) 126);
            this.field8598 = this.field8597 = 0;
        }
        this.field8603[this.field8597] = (byte) class424.method2540(255, var12 << 8 - var7);
        this.field8598 += (int) var13;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BII)V")
    public final void method3444(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 512) {
            return;
        }
        field8595++;
        this.field8603[this.field8597] = (byte) class188.method1258(this.field8603[this.field8597], 0x80 >>> class424.method2540(this.field8598, 7));
        this.field8597++;
        if (this.field8597 > 32) {
            while (this.field8597 < 64) {
                this.field8603[this.field8597++] = 0;
            }
            this.method3439((byte) 38);
            this.field8597 = 0;
        }
        while (this.field8597 < 32) {
            this.field8603[this.field8597++] = 0;
        }
        class164.method1151(this.field8606, 0, this.field8603, 32, 32);
        this.method3439((byte) 77);
        int var4 = 0;
        int var5 = arg2;
        while (var4 < 8) {
            long var6 = this.field8594[var4];
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

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final void method3445(int arg0) {
        field8596++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field8606[var2] = 0;
        }
        this.field8598 = this.field8597 = 0;
        this.field8603[0] = 0;
        if (arg0 != 8) {
            method3441((byte) 100);
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field8594[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method3446(boolean arg0) {
        field8602++;
        if (class2.field20 || class634.field9212 == null) {
            return "";
        } else if (arg0) {
            return class634.field9212.field8370;
        } else {
            return null;
        }
    }
}
