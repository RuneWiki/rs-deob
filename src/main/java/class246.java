import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class246 {

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[J")
    private long[] field3519 = new long[8];

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    private int field3520 = 0;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "[B")
    private byte[] field3527 = new byte[64];

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "[J")
    private long[] field3518 = new long[8];

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[J")
    private long[] field3523 = new long[8];

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[B")
    private byte[] field3528 = new byte[32];

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    private int field3521 = 0;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "[J")
    private long[] field3533 = new long[8];

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[J")
    private long[] field3534 = new long[8];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lgga;")
    public static class513 field3531;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I")
    public static final int method1631(int arg0, int arg1) {
        field3522++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (arg0 != -22173) {
            field3531 = null;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public final void method1632(byte arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field3528[var2] = 0;
        }
        if (arg0 != 22) {
            return;
        }
        field3526++;
        this.field3520 = this.field3521 = 0;
        this.field3527[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field3533[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILuf;I)V")
    public static final void method1633(boolean arg0, int arg1, class519 arg2, int arg3) {
        class741.field10261 = arg2;
        field3516++;
        class424.field5896 = arg3;
        class402.field5550 = arg1;
        if (arg0) {
            field3531 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1634(int arg0) {
        if (arg0 != 255) {
            field3531 = null;
        }
        field3531 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B[BI)V")
    public final void method1635(byte arg0, byte[] arg1, int arg2) {
        field3530++;
        int var4 = -52 / ((-arg0 - 41) / 49);
        this.field3527[this.field3521] = (byte) class694.method3895(this.field3527[this.field3521], 0x80 >>> class194.method1380(this.field3520, 7));
        this.field3521++;
        if (this.field3521 > 32) {
            while (true) {
                if (this.field3521 >= 64) {
                    this.method1637(-108);
                    this.field3521 = 0;
                    break;
                }
                this.field3527[this.field3521++] = 0;
            }
        }
        while (this.field3521 < 32) {
            this.field3527[this.field3521++] = 0;
        }
        class171.method1263(this.field3528, 0, this.field3527, 32, 32);
        this.method1637(-100);
        int var5 = 0;
        int var6 = arg2;
        while (var5 < 8) {
            long var7 = this.field3533[var5];
            arg1[var6] = (byte) ((int) (var7 >>> 56));
            arg1[var6 + 1] = (byte) ((int) (var7 >>> 48));
            arg1[var6 + 2] = (byte) ((int) (var7 >>> 40));
            arg1[var6 + 3] = (byte) ((int) (var7 >>> 32));
            arg1[var6 + 4] = (byte) ((int) (var7 >>> 24));
            arg1[var6 + 5] = (byte) ((int) (var7 >>> 16));
            arg1[var6 + 6] = (byte) ((int) (var7 >>> 8));
            arg1[var6 + 7] = (byte) ((int) var7);
            var6 += 8;
            var5++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIBIIIZI)Z")
    public static final boolean method1636(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field3525++;
        int var9 = class719.field10041.field4142[0];
        int var10 = class719.field10041.field4136[0];
        if (var9 < 0 || class192.field2891 <= var9 || var10 < 0 || class456.field6225 <= var10) {
            return false;
        } else if (arg4 >= 0 && class192.field2891 > arg4 && arg8 >= 0 && class456.field6225 > arg8) {
            int var11 = class454.method2663(class619.field8758, arg8, arg4, arg1, arg6, class635.field8954, arg7, arg2, arg5, var10, var9, class719.field10041.method209(true), class605.field8591[class719.field10041.field10361], -65, arg0);
            if (var11 < 1) {
                return false;
            }
            class263.field3717 = class635.field8954[var11 - 1];
            class104.field1516 = class619.field8758[var11 - 1];
            class687.field9717 = false;
            if (arg3 >= -85) {
                field3531 = null;
            }
            class91.method779((byte) -43);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    private final void method1637(int arg0) {
        field3529++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 > -99) {
            this.method1635((byte) -81, null, 77);
        }
        while (var2 < 8) {
            this.field3534[var2] = class112.method927(class112.method927(class112.method927(class561.method3266(255L, (long) this.field3527[var3 + 5]) << 16, class112.method927(class112.method927(class112.method927(class561.method3266(0xFFL << 40, (long) this.field3527[var3 + 2] << 40), class112.method927(class561.method3266((long) this.field3527[var3 + 1], 255L) << 48, (long) this.field3527[var3] << 56)), class561.method3266(255L, (long) this.field3527[var3 + 3]) << 32), class561.method3266(255L, (long) this.field3527[var3 + 4]) << 24)), class561.method3266((long) this.field3527[var3 + 6], 255L) << 8), class561.method3266(255L, (long) this.field3527[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field3523[var4] = class112.method927(this.field3534[var4], this.field3518[var4] = this.field3533[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field3519[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field3519[var7] = class112.method927(this.field3519[var7], class686.field9701[var13][class194.method1380((int) (this.field3518[class194.method1380(var7 - var13, 7)] >>> var14), 255)]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field3518[var8] = this.field3519[var8];
            }
            this.field3518[0] = class112.method927(this.field3518[0], class686.field9693[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field3519[var9] = this.field3518[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field3519[var9] = class112.method927(this.field3519[var9], class686.field9701[var11][class194.method1380(255, (int) (this.field3523[class194.method1380(var9 - var11, 7)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field3523[var10] = this.field3519[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field3533[var6] = class112.method927(this.field3533[var6], class112.method927(this.field3534[var6], this.field3523[var6]));
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lgga;I)V")
    public static final void method1638(class513 arg0, int arg1) {
        class395.field5468 = arg0;
        field3532++;
        if (arg1 != -9) {
            method1633(false, 71, null, -76);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
    public static final boolean method1639(int arg0, int arg1, int arg2) {
        field3517++;
        if (arg2 > -100) {
            return false;
        } else {
            return (arg1 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BJ[B)V")
    public final void method1640(byte arg0, long arg1, byte[] arg2) {
        field3524++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field3520 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field3528[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field3528[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field3527[this.field3521] = (byte) class694.method3895(this.field3527[this.field3521], var15 >>> var7);
            this.field3520 += 8 - var7;
            this.field3521++;
            if (this.field3520 == 512) {
                this.method1637(-102);
                this.field3520 = this.field3521 = 0;
            }
            this.field3527[this.field3521] = (byte) class194.method1380(255, var15 << 8 - var7);
            this.field3520 += var7;
            var5++;
            arg1 -= 8L;
        }
        int var12;
        if (arg1 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field3527[this.field3521] = (byte) class694.method3895(this.field3527[this.field3521], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg1 >= 8L) {
            this.field3520 += 8 - var7;
            long var13 = arg1 - (long) (8 - var7);
            this.field3521++;
            if (this.field3520 == 512) {
                this.method1637(-123);
                this.field3520 = this.field3521 = 0;
            }
            this.field3527[this.field3521] = (byte) class194.method1380(var12 << 8 - var7, 255);
            this.field3520 += (int) var13;
        } else {
            this.field3520 = (int) ((long) this.field3520 + arg1);
        }
        if (arg0 > -6) {
            this.field3527 = null;
        }
    }
}
