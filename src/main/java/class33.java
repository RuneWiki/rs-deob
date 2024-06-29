import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class33 extends class211 {

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
    private int field428 = 0;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "Z")
    public boolean field434 = false;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "Z")
    private boolean field438 = false;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "Ldd;")
    public class477 field437;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "J")
    private long field422;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "Loo;")
    public class425 field442;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "Luo;")
    public class389 field432;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "Ljg;")
    public class215 field425;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "Lrp;")
    public static class288 field452 = new class288(260);

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "[I")
    public static int[] field454 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "Lnd;")
    public static class366 field453 = new class366(6, 4);

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 7)
    public static void method180(int arg0) {
        field454 = null;
        if (arg0 != 300) {
            field455 = 16;
        }
        field452 = null;
        field453 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BJ)V", line = 24)
    public final void method181(byte arg0, long arg1) {
        for (class81 var4 = (class81) this.field425.method1319(arg0 + 127); var4 != null; var4 = (class81) this.field425.method1320((byte) -110)) {
            var4.method587(arg1);
        }
        if (arg0 != -56) {
            this.method182(-96, -95L, -107, null, true);
        }
        field426++;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IJILqq;Z)V", line = 47)
    public final void method182(int arg0, long arg1, int arg2, class318 arg3, boolean arg4) {
        field421++;
        if (this.field434) {
            arg4 = false;
        } else if (this.field432.field5661 > class456.field7000) {
            arg4 = false;
        } else if (class439.field6449 > class433.field6356[class456.field7000]) {
            arg4 = false;
        } else if (this.field438) {
            arg4 = false;
        } else if (this.field432.field5628 != -1) {
            int var7 = (int) (arg1 - this.field422);
            if (this.field432.field5659 || var7 <= this.field432.field5628) {
                var7 %= this.field432.field5628;
            } else {
                arg4 = false;
            }
            if (!this.field432.field5645 && var7 < this.field432.field5633) {
                arg4 = false;
            }
            if (this.field432.field5645 && var7 >= this.field432.field5633) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field428 += (int) ((double) arg2 * ((double) (this.field432.field5679 - this.field432.field5625) * Math.random() + (double) this.field432.field5625));
            if (this.field428 > 63) {
                int var8 = this.field428 >> 6;
                this.field428 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field432.field5684 <= 0 && this.field432.field5656 <= 0) {
                        var10 = this.field424;
                        var11 = this.field423;
                        var12 = this.field433;
                    } else {
                        int var13 = this.field439 + ((int) (Math.random() * (double) this.field435));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class195.field3075[var14];
                        int var16 = class195.field3077[var14];
                        int var17 = this.field449 + ((int) (Math.random() * (double) this.field441));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class195.field3075[var18];
                        int var20 = class195.field3077[var18];
                        byte var21 = 15;
                        var11 = (var20 << 0) * -1;
                        var10 = var16 * var19 >> var21;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = this.field431 * var24 + (this.field444 * var22 + (this.field450 * var23)) >> 16;
                    int var26 = this.field443 * var24 + this.field440 * var22 + this.field427 * var23 >> 16;
                    int var27 = this.field446 * var22 + this.field430 * var23 + (this.field429 * var24) >> 16;
                    int var28 = (int) (Math.random() * (double) (this.field432.field5667 - this.field432.field5682)) + this.field432.field5682;
                    int var29 = (int) (Math.random() * (double) (this.field432.field5649 - this.field432.field5668)) + this.field432.field5668;
                    int var30 = (int) (Math.random() * (double) (this.field432.field5641 - this.field432.field5637)) + this.field432.field5637;
                    int var31;
                    if (this.field432.field5690) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field432.field5681 * var32 + (double) this.field432.field5651) | (int) ((double) this.field432.field5691 * var32 + (double) this.field432.field5675) << 8 | (int) ((double) this.field432.field5632 * var32 + (double) this.field432.field5646) << 16 | (int) (Math.random() * (double) this.field432.field5663 + (double) this.field432.field5677) << 24;
                    } else {
                        var31 = (int) ((double) this.field432.field5663 * Math.random() + (double) this.field432.field5677) << 24 | (int) (Math.random() * (double) this.field432.field5681 + (double) this.field432.field5651) | (int) ((double) this.field432.field5691 * Math.random() + (double) this.field432.field5675) << 8 | (int) (Math.random() * (double) this.field432.field5632 + (double) this.field432.field5646) << 16;
                    }
                    int var34 = this.field432.field5634;
                    if (!arg3.method1962() && !this.field432.field5688) {
                        var34 = -1;
                    }
                    if (class57.field978 == class391.field5727) {
                        new class81(this, var25, var26, var27, var10, var11, var12, var28, var29, var31, var30, var34, this.field432.field5643, this.field432.field5670);
                    } else {
                        class81 var35 = class442.field6683[class391.field5727];
                        class391.field5727 = class391.field5727 + 1 & 0x3FF;
                        var35.method585(this, var25, var26, var27, var10, var11, var12, var28, var29, var31, var30, var34, this.field432.field5643, this.field432.field5670);
                    }
                }
            }
        }
        this.field420 = 0;
        if (arg0 != 32766) {
            return;
        }
        for (class81 var37 = (class81) this.field425.method1319(arg0 ^ 0xFFFF8073); var37 != null; var37 = (class81) this.field425.method1320((byte) -78)) {
            var37.method588(arg1, arg2);
            this.field420++;
        }
        class263.field3982 += this.field420;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lqq;Loo;Ldd;J)V", line = 348)
    public class33(class318 arg0, class425 arg1, class477 arg2, long arg3) {
        this.field437 = arg2;
        this.field422 = arg3;
        this.field442 = arg1;
        this.field432 = this.field442.method2496(24623);
        if (!arg0.method1962() && this.field432.field5692 != -1) {
            this.field432 = class508.method3038(116, this.field432.field5692);
        }
        this.field425 = new class215();
        this.field428 = (int) ((double) this.field428 + Math.random() * 64.0D);
        this.method183(1);
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V", line = 231)
    public final void method183(int arg0) {
        this.field430 = this.field442.field6091;
        this.field450 = this.field442.field6096;
        if (arg0 != 1) {
            method184(89, null, null, -10, -116, true, 24);
        }
        this.field427 = this.field442.field6095;
        this.field444 = this.field442.field6106;
        this.field443 = this.field442.field6105;
        this.field440 = this.field442.field6108;
        this.field429 = this.field442.field6094;
        this.field446 = this.field442.field6103;
        field436++;
        this.field431 = this.field442.field6093;
        if (this.field450 == this.field444 && this.field450 == this.field431 && this.field440 == this.field427 && this.field443 == this.field427 && this.field446 == this.field430 && this.field430 == this.field429) {
            this.field438 = true;
            return;
        }
        this.field438 = false;
        int var2 = (this.field450 + this.field444 + this.field431) / 3;
        int var3 = (this.field443 + this.field427 + this.field440) / 3;
        int var4 = (this.field430 + this.field429 + this.field446) / 3;
        if (this.field445 == var2 && this.field448 == var3 && this.field447 == var4) {
            return;
        }
        this.field445 = var2;
        this.field448 = var3;
        this.field447 = var4;
        int var5 = this.field450 - this.field444;
        int var6 = this.field427 - this.field440;
        int var7 = this.field430 - this.field446;
        int var8 = this.field431 - this.field444;
        int var9 = this.field443 - this.field440;
        int var10 = this.field429 - this.field446;
        this.field433 = var5 * var9 - (var6 * var8);
        this.field424 = var6 * var10 - (var7 * var9);
        this.field423 = var7 * var8 - (var5 * var10);
        while (this.field424 > 32767 || this.field423 > 32767 || this.field433 > 32767 || this.field424 < -32767 || this.field423 < -32767 || this.field433 < -32767) {
            this.field433 >>= 0x1;
            this.field423 >>= 0x1;
            this.field424 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field424 * this.field424 + this.field423 * this.field423 + (this.field433 * this.field433)));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field433 = this.field433 * 32767 / var11;
        this.field423 = this.field423 * 32767 / var11;
        this.field424 = this.field424 * 32767 / var11;
        if (this.field432.field5684 <= 0 && this.field432.field5656 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field433, (double) this.field424) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field423, Math.sqrt((double) (this.field433 * this.field433 + this.field424 * this.field424))) * 2607.5945876176133D);
        this.field435 = this.field432.field5684 - this.field432.field5644;
        this.field439 = var12 + this.field432.field5644 - (this.field435 >> 1);
        this.field441 = this.field432.field5656 - this.field432.field5653;
        this.field449 = var13 + this.field432.field5653 - (this.field441 >> 1);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILqq;Lwn;IIZI)V", line = 322)
    public static final void method184(int arg0, class318 arg1, class488 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            class172.field2656.method994((class482.field7368 - class172.field2656.method988()) / 2, (class147.field2384 - class172.field2656.method989()) / 2);
            class25.field323.method994((class482.field7368 - class25.field323.method988()) / 2, 18);
        }
        field451++;
        int var7 = 59 / ((6 - arg3) / 44);
        arg2.method2933(class482.field7368 / 2, class147.field2384 / 2 - 26, arg6, -1, 11252, (class329.field4936 == class298.field4512 ? class238.field3594 : class18.field239).method2473(class406.field5898, -96));
        int var8 = class147.field2384 / 2 - 18;
        arg1.method1918(class482.field7368 / 2 - 152, var8, 304, 34, arg4, 0);
        arg1.method1918(class482.field7368 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg1.method1971(class482.field7368 / 2 - 150, var8 + 2, class108.field1880 * 3, 30, arg0, 0);
        arg1.method1971(class108.field1880 * 3 + class482.field7368 / 2 - 150, var8 - -2, 300 - (class108.field1880 * 3), 30, 0, 0);
        arg2.method2933(class482.field7368 / 2, class147.field2384 / 2 + 4, arg6, -1, 11252, class199.field3154);
    }
}
