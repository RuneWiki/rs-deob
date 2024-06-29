import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class233 {

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "[B")
    private byte[] field3489 = new byte[32];

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "[J")
    private long[] field3496 = new long[8];

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "[J")
    private long[] field3491 = new long[8];

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "[J")
    private long[] field3502 = new long[8];

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "[J")
    private long[] field3504 = new long[8];

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    private int field3499 = 0;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    private int field3505 = 0;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "[J")
    private long[] field3493 = new long[8];

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "[B")
    private byte[] field3490 = new byte[64];

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Llc;")
    public static class435 field3495 = new class435(60, 6);

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public static int field3503 = 0;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 7)
    private final void method1623(int arg0) {
        field3487++;
        int var2 = 0;
        int var3 = arg0;
        while (var2 < 8) {
            this.field3502[var2] = class82.method659(class666.method3806((long) this.field3490[var3 + 7], 255L), class82.method659(class82.method659(class666.method3806((long) this.field3490[var3 + 5] << 16, 0xFFL << 16), class82.method659(class82.method659(class666.method3806((long) this.field3490[var3 + 3], 255L) << 32, class82.method659(class666.method3806((long) this.field3490[var3 + 2] << 40, 0xFFL << 40), class82.method659((long) this.field3490[var3] << 56, class666.method3806((long) this.field3490[var3 + 1] << 48, 0xFFL << 48)))), class666.method3806(255L, (long) this.field3490[var3 + 4]) << 24)), class666.method3806(255L, (long) this.field3490[var3 + 6]) << 8));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field3493[var4] = class82.method659(this.field3502[var4], this.field3504[var4] = this.field3491[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field3496[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field3496[var7] = class82.method659(this.field3496[var7], class456.field6504[var13][class368.method2314((int) (this.field3504[class368.method2314(7, var7 - var13)] >>> var14), 255)]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field3504[var8] = this.field3496[var8];
            }
            this.field3504[0] = class82.method659(this.field3504[0], class456.field6503[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field3496[var9] = this.field3504[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field3496[var9] = class82.method659(this.field3496[var9], class456.field6504[var11][class368.method2314((int) (this.field3493[class368.method2314(var9 - var11, 7)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field3493[var10] = this.field3496[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field3491[var6] = class82.method659(this.field3491[var6], class82.method659(this.field3502[var6], this.field3493[var6]));
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)I", line = 110)
    public static final int method1624(int arg0) {
        if (arg0 != 4) {
            method1630((byte) -36, -45, 27, false);
        }
        field3494++;
        return class401.method2438(66, false);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lha;I)V", line = 133)
    public static final void method1625(class543 arg0, int arg1) {
        field3500++;
        int var2 = 0;
        int var3 = 0;
        if (class416.field5919) {
            var2 = class352.method2243(62);
            var3 = class695.method3915((byte) 86);
        }
        int var4 = class132.field1820 + var2;
        int var5 = class388.field5606 + var3;
        int var6 = class314.field4246;
        int var7 = class731.field10246 - 3;
        byte var8 = 20;
        class500.method3039(class132.field1820 + var2, arg0, class608.field8644.method3543(-24350, class45.field748), var8, class314.field4246, class388.field5606 + var3, class731.field10246, 0);
        int var9 = class535.field7789.method2459(-32213) + var2;
        if (arg1 >= -67) {
            field3495 = null;
        }
        int var10 = var3 + class535.field7789.method2452(-104);
        if (class34.field311) {
            int var14 = 0;
            for (class194 var15 = (class194) class225.field3348.method3025(false); var15 != null; var15 = (class194) class225.field3348.method3026(true)) {
                int var28 = var14 * 16 + (var5 - (-var8 - 13));
                var14++;
                if (var9 > class132.field1820 + var2 && class314.field4246 + class132.field1820 + var2 > var9 && var10 > var28 - 13 && var10 < (var28 + 4) && (var15.field2845 > 1 || ((class304) var15.field2841.field7165.field5596).field4145)) {
                    arg0.method397(class132.field1820 + var2, var28 + -12, class314.field4246, 16, class714.field10063 | 255 - class227.field3396 << 24, 1);
                }
            }
            if (class537.field7799 != null) {
                class500.method3039(class327.field4441, arg0, class537.field7799.field2847, var8, class666.field9521, class90.field1279, class702.field9898, 0);
                int var16 = 0;
                for (class304 var17 = (class304) class537.field7799.field2841.method3025(false); var17 != null; var17 = (class304) class537.field7799.field2841.method3026(true)) {
                    int var18 = var16 * 16 + class90.field1279 + var8 + 13;
                    if (var9 > class327.field4441 && var9 < (class666.field9521 + class327.field4441) && var10 > (var18 - 13) && var10 < var18 + 4 && var17.field4145) {
                        arg0.method397(class327.field4441, var18 - 12, class666.field9521, 16, 255 - class227.field3396 << 24 | class714.field10063, 1);
                    }
                    var16++;
                }
                class513.method3119(class90.field1279, (byte) -98, class702.field9898, arg0, class327.field4441, var8, class666.field9521);
            }
        } else {
            int var11 = 0;
            for (class304 var12 = (class304) class303.field4137.method3565(-118); var12 != null; var12 = (class304) class303.field4137.method3561((byte) 62)) {
                int var13 = var8 + ((class456.field6499 - (var11 + 1)) * 16) + var5 + 13;
                if (class132.field1820 + var2 < var9 && var9 < var2 + class314.field4246 + class132.field1820 && (var13 - 13) < var10 && var10 < (var13 + 4) && var12.field4145) {
                    arg0.method397(class132.field1820 + var2, var13 + -12, class314.field4246, 16, 255 - class227.field3396 << 24 | class714.field10063, 1);
                }
                var11++;
            }
        }
        class513.method3119(class388.field5606 + var3, (byte) 116, class731.field10246, arg0, class132.field1820 + var2, var8, class314.field4246);
        if (class34.field311) {
            int var22 = 0;
            for (class194 var23 = (class194) class225.field3348.method3025(false); var23 != null; var23 = (class194) class225.field3348.method3026(true)) {
                int var27 = var3 + (var22 * 16) + class388.field5606 + var8 + 13;
                if (var23.field2845 == 1) {
                    class257.method1710(class132.field1820 + var2, class388.field5606 + var3, (byte) 40, var27, class314.field4246, var10, arg0, class484.field6981 | 0xFF000000, class731.field10246, var9, class45.field755 | 0xFF000000, (class304) var23.field2841.field7165.field5596);
                } else {
                    class288.method1829(var10, class45.field755 | 0xFF000000, arg0, var9, class388.field5606 + var3, class132.field1820 + var2, class314.field4246, var23, class484.field6981 | 0xFF000000, (byte) 109, class731.field10246, var27);
                }
                var22++;
            }
            if (class537.field7799 != null) {
                int var24 = 0;
                for (class304 var25 = (class304) class537.field7799.field2841.method3025(false); var25 != null; var25 = (class304) class537.field7799.field2841.method3026(true)) {
                    int var26 = var24 * 16 + var8 + class90.field1279 + 13;
                    var24++;
                    class257.method1710(class327.field4441, class90.field1279, (byte) 40, var26, class666.field9521, var10, arg0, class484.field6981 | 0xFF000000, class702.field9898, var9, class45.field755 | 0xFF000000, var25);
                }
                class629.method3621(class90.field1279, class702.field9898, class327.field4441, (byte) 123, class666.field9521);
            }
        } else {
            int var19 = 0;
            for (class304 var20 = (class304) class303.field4137.method3565(-24); var20 != null; var20 = (class304) class303.field4137.method3561((byte) 126)) {
                int var21 = var5 + var8 + ((class456.field6499 + -1 + -var19) * 16) + 13;
                class257.method1710(var4, var5, (byte) 40, var21, var6, var10, arg0, class484.field6981 | 0xFF000000, var7, var9, class45.field755 | 0xFF000000, var20);
                var19++;
            }
        }
        class629.method3621(class388.field5606 + var3, class731.field10246, class132.field1820 + var2, (byte) 69, class314.field4246);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILdk;II)V", line = 302)
    public static final void method1626(int arg0, int arg1, class88 arg2, int arg3, int arg4) {
        arg2.field1260.method2926((byte) -126, arg0);
        field3498++;
        arg2.field1260.method2862(arg3, -1166933656);
        if (arg4 != 852) {
            method1629((byte) -104);
        }
        arg2.field1260.method2914(arg1, (byte) 81);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II[B)V", line = 319)
    public final void method1627(int arg0, int arg1, byte[] arg2) {
        field3492++;
        this.field3490[this.field3499] = (byte) class430.method2658(this.field3490[this.field3499], 0x80 >>> class368.method2314(this.field3505, 7));
        this.field3499++;
        if (this.field3499 > 32) {
            while (true) {
                if (this.field3499 >= 64) {
                    this.method1623(0);
                    this.field3499 = 0;
                    break;
                }
                this.field3490[this.field3499++] = 0;
            }
        }
        while (this.field3499 < 32) {
            this.field3490[this.field3499++] = 0;
        }
        class85.method683(this.field3489, 0, this.field3490, 32, 32);
        this.method1623(0);
        if (arg0 >= -39) {
            this.method1631((byte) -70, -83L, null);
        }
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field3491[var4];
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
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V", line = 372)
    public final void method1628(int arg0) {
        field3488++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field3489[var2] = 0;
        }
        this.field3505 = this.field3499 = arg0;
        this.field3490[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field3491[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 395)
    public static void method1629(byte arg0) {
        field3495 = null;
        int var1 = 48 / ((arg0 - 72) / 48);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BIIZ)V", line = 404)
    public static final void method1630(byte arg0, int arg1, int arg2, boolean arg3) {
        field3501++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class685.field9730 = arg2;
        class147.field2155 = arg3;
        if (arg0 != 79) {
            field3503 = -94;
        }
        class132.field1821 = arg1;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BJ[B)V", line = 420)
    public final void method1631(byte arg0, long arg1, byte[] arg2) {
        field3497++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field3505 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field3489[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field3489[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        if (arg0 <= 1) {
            this.method1631((byte) 43, 34L, null);
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field3490[this.field3499] = (byte) class430.method2658(this.field3490[this.field3499], var15 >>> var7);
            this.field3499++;
            this.field3505 += 8 - var7;
            if (this.field3505 == 512) {
                this.method1623(0);
                this.field3505 = this.field3499 = 0;
            }
            this.field3490[this.field3499] = (byte) class368.method2314(255, var15 << 8 - var7);
            arg1 -= 8L;
            this.field3505 += var7;
            var5++;
        }
        int var12;
        if (arg1 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field3490[this.field3499] = (byte) class430.method2658(this.field3490[this.field3499], var12 >>> var7);
        }
        if ((long) var7 + arg1 < 8L) {
            this.field3505 = (int) ((long) this.field3505 + arg1);
            return;
        }
        long var13 = arg1 - (long) (8 - var7);
        this.field3505 += 8 - var7;
        this.field3499++;
        if (this.field3505 == 512) {
            this.method1623(0);
            this.field3505 = this.field3499 = 0;
        }
        this.field3490[this.field3499] = (byte) class368.method2314(var12 << 8 - var7, 255);
        this.field3505 += (int) var13;
    }
}
