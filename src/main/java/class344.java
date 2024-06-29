import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class344 extends class600 {

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Z")
    public boolean field4823 = false;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    private int field4817 = 0;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Lak;")
    public class677 field4831 = new class677();

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Lak;")
    private class677 field4832 = new class677();

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Z")
    private boolean field4835 = false;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Lkw;")
    public class7 field4825;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Lhda;")
    public class635 field4828;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "J")
    private long field4819;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Lgi;")
    public class571 field4818;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Liv;")
    public class565 field4822;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "S")
    public static short field4815 = 256;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field4829 = 0;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    private int field4833;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    private int field4837;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    private int field4838;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    private int field4839;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    private int field4840;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lud;")
    public static class86 field4826;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2061(int arg0, int arg1, byte arg2) {
        if (arg2 == -71) {
            field4827++;
            return (arg1 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(JZLr;II)V")
    public final void method2062(long arg0, boolean arg1, class98 arg2, int arg3, int arg4) {
        field4820++;
        if (this.field4823) {
            arg1 = false;
        } else if (this.field4818.field8354 > class201.field3102) {
            arg1 = false;
        } else if (class121.field1978 > class201.field3104[class201.field3102]) {
            arg1 = false;
        } else if (this.field4835) {
            arg1 = false;
        } else if (this.field4818.field8352 != -1) {
            int var7 = (int) (arg0 - this.field4819);
            if (this.field4818.field8377 || this.field4818.field8352 >= var7) {
                var7 %= this.field4818.field8352;
            } else {
                arg1 = false;
            }
            if (!this.field4818.field8342 && this.field4818.field8334 > var7) {
                arg1 = false;
            }
            if (this.field4818.field8342 && this.field4818.field8334 <= var7) {
                arg1 = false;
            }
        }
        if (arg1) {
            class357.field4987++;
            int var8 = (this.field4831.field9639 + this.field4831.field9634 + this.field4831.field9645) / 3;
            int var9 = (this.field4831.field9642 + this.field4831.field9635 + this.field4831.field9638) / 3;
            int var10 = (this.field4831.field9643 + this.field4831.field9641 + this.field4831.field9637) / 3;
            if (this.field4831.field9648 != var8 || this.field4831.field9646 != var9 || this.field4831.field9640 != var10) {
                this.field4831.field9646 = var9;
                this.field4831.field9648 = var8;
                this.field4831.field9640 = var10;
                int var11 = this.field4831.field9634 - this.field4831.field9645;
                int var12 = this.field4831.field9635 - this.field4831.field9642;
                int var13 = this.field4831.field9643 - this.field4831.field9637;
                int var14 = this.field4831.field9639 - this.field4831.field9645;
                int var15 = this.field4831.field9638 - this.field4831.field9642;
                int var16 = this.field4831.field9641 - this.field4831.field9637;
                this.field4840 = var12 * var16 - (var13 * var15);
                this.field4834 = var13 * var14 - var11 * var16;
                this.field4836 = var11 * var15 - (var12 * var14);
                while (true) {
                    if (this.field4840 <= 32767 && this.field4834 <= 32767 && this.field4836 <= 32767 && this.field4840 >= -32767 && this.field4834 >= -32767 && this.field4836 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field4836 * this.field4836 + this.field4840 * this.field4840 + this.field4834 * this.field4834));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field4834 = this.field4834 * 32767 / var17;
                        this.field4836 = this.field4836 * 32767 / var17;
                        this.field4840 = this.field4840 * 32767 / var17;
                        if (this.field4818.field8393 > 0 || this.field4818.field8356 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field4836, (double) this.field4840) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field4834, Math.sqrt((double) (this.field4840 * this.field4840 + this.field4836 * this.field4836))) * 2607.5945876176133D);
                            this.field4833 = this.field4818.field8393 - this.field4818.field8337;
                            this.field4839 = this.field4818.field8356 - this.field4818.field8402;
                            this.field4838 = this.field4818.field8337 + var18 - (this.field4833 >> 1);
                            this.field4837 = this.field4818.field8402 + var19 - (this.field4839 >> 1);
                        }
                        break;
                    }
                    this.field4840 >>= 0x1;
                    this.field4836 >>= 0x1;
                    this.field4834 >>= 0x1;
                }
            }
            this.field4817 += (int) ((double) arg3 * ((double) this.field4818.field8358 + Math.random() * (double) (this.field4818.field8394 - this.field4818.field8358)));
            if (this.field4817 > 63) {
                int var20 = this.field4817 >> 6;
                this.field4817 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field4818.field8393 <= 0 && this.field4818.field8356 <= 0) {
                        var22 = this.field4840;
                        var23 = this.field4836;
                        var24 = this.field4834;
                    } else {
                        int var25 = this.field4838 + ((int) ((double) this.field4833 * Math.random()));
                        int var26 = var25 & 0x3FFF;
                        int var27 = class302.field4241[var26];
                        int var28 = class302.field4242[var26];
                        int var29 = (int) ((double) this.field4839 * Math.random()) + this.field4837;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class302.field4241[var30];
                        int var32 = class302.field4242[var30];
                        byte var33 = 13;
                        var24 = (var32 << 1) * -1;
                        var22 = var28 * var31 >> var33;
                        var23 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field4831.field9639 * var36 + (float) this.field4831.field9645 * var34 + (float) this.field4831.field9634 * var35);
                    int var38 = (int) ((float) this.field4831.field9638 * var36 + (float) this.field4831.field9642 * var34 + (float) this.field4831.field9635 * var35);
                    int var39 = (int) ((float) this.field4831.field9641 * var36 + (float) this.field4831.field9643 * var35 + (float) this.field4831.field9637 * var34);
                    int var40 = (int) ((float) this.field4832.field9639 * var36 + (float) this.field4832.field9645 * var34 + (float) this.field4832.field9634 * var35);
                    int var41 = (int) ((float) this.field4832.field9638 * var36 + (float) this.field4832.field9642 * var34 + (float) this.field4832.field9635 * var35);
                    int var42 = (int) ((float) this.field4832.field9641 * var36 + (float) this.field4832.field9643 * var35 + (float) this.field4832.field9637 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) (Math.random() * (double) var43 + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = (int) ((double) (this.field4818.field8405 - this.field4818.field8367) * Math.random()) + this.field4818.field8367;
                    int var50 = (int) (Math.random() * (double) (this.field4818.field8386 - this.field4818.field8403)) + this.field4818.field8403;
                    int var51 = (int) (Math.random() * (double) (this.field4818.field8392 - this.field4818.field8389)) + this.field4818.field8389;
                    int var52;
                    if (this.field4818.field8335) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field4818.field8343 * var53 + (double) this.field4818.field8357) << 16 | (int) ((double) this.field4818.field8387 * var53 + (double) this.field4818.field8375) << 8 | (int) ((double) this.field4818.field8349 * var53 + (double) this.field4818.field8391) | (int) (Math.random() * (double) this.field4818.field8344 + (double) this.field4818.field8384) << 24;
                    } else {
                        var52 = (int) ((double) this.field4818.field8384 + Math.random() * (double) this.field4818.field8344) << 24 | (int) ((double) this.field4818.field8391 + (double) this.field4818.field8349 * Math.random()) | (int) ((double) this.field4818.field8387 * Math.random() + (double) this.field4818.field8375) << 8 | (int) (Math.random() * (double) this.field4818.field8343 + (double) this.field4818.field8357) << 16;
                    }
                    int var55 = this.field4818.field8346;
                    if (!arg2.method814() && !this.field4818.field8370) {
                        var55 = -1;
                    }
                    if (class7.field74 == class676.field9630) {
                        new class32(this, var46, var47, var48, var22, var24, var23, var49, var50, var52, var51, var55, this.field4818.field8401, this.field4818.field8368);
                    } else {
                        class32 var57 = class117.field1867[class676.field9630];
                        class676.field9630 = class676.field9630 + 1 & 0x3FF;
                        var57.method294(this, var46, var47, var48, var22, var24, var23, var49, var50, var52, var51, var55, this.field4818.field8401, this.field4818.field8368);
                    }
                }
            }
        }
        if (!this.field4831.method3828(47, this.field4832)) {
            class677 var58 = this.field4832;
            this.field4832 = this.field4831;
            this.field4831 = var58;
            this.field4831.field9634 = this.field4825.field57;
            this.field4831.field9645 = this.field4825.field71;
            this.field4831.field9643 = this.field4825.field54;
            this.field4831.field9641 = this.field4825.field53;
            this.field4831.field9642 = this.field4825.field59;
            this.field4831.field9635 = this.field4825.field68;
            this.field4831.field9638 = this.field4825.field73;
            this.field4831.field9637 = this.field4825.field56;
            this.field4831.field9639 = this.field4825.field60;
        }
        this.field4824 = 0;
        if (arg4 != 29437) {
            this.field4832 = null;
        }
        for (class32 var59 = (class32) this.field4822.method3313((byte) 65); var59 != null; var59 = (class32) this.field4822.method3308(23)) {
            var59.method293(arg0, arg3);
            this.field4824++;
        }
        class41.field550 += this.field4824;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lpba;")
    public static final class49 method2063(boolean arg0, Canvas arg1) {
        field4821++;
        try {
            if (!arg0) {
                method2065(-56);
            }
            Class var2 = Class.forName("ev");
            class49 var3 = (class49) var2.getDeclaredConstructor().newInstance();
            var3.method389(arg1, (byte) 3);
            return var3;
        } catch (Throwable var5) {
            class443 var4 = new class443();
            var4.method389(arg1, (byte) 3);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public final void method2064(int arg0) {
        this.field4831.field9642 = this.field4825.field59;
        field4830++;
        this.field4831.field9645 = this.field4825.field71;
        this.field4831.field9637 = this.field4825.field56;
        this.field4831.field9634 = this.field4825.field57;
        this.field4831.field9641 = this.field4825.field53;
        this.field4831.field9643 = this.field4825.field54;
        if (arg0 != -1) {
            return;
        }
        this.field4831.field9639 = this.field4825.field60;
        this.field4831.field9638 = this.field4825.field73;
        this.field4831.field9635 = this.field4825.field68;
        if (this.field4831.field9645 == this.field4831.field9634 && this.field4831.field9639 == this.field4831.field9634 && this.field4831.field9642 == this.field4831.field9635 && this.field4831.field9638 == this.field4831.field9635 && this.field4831.field9643 == this.field4831.field9637 && this.field4831.field9643 == this.field4831.field9641) {
            this.field4835 = true;
        } else if (this.field4835) {
            this.field4832.field9634 = this.field4831.field9634;
            this.field4832.field9642 = this.field4831.field9642;
            this.field4832.field9643 = this.field4831.field9643;
            this.field4832.field9641 = this.field4831.field9641;
            this.field4832.field9637 = this.field4831.field9637;
            this.field4832.field9639 = this.field4831.field9639;
            this.field4832.field9645 = this.field4831.field9645;
            this.field4835 = false;
            this.field4832.field9635 = this.field4831.field9635;
            this.field4832.field9638 = this.field4831.field9638;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static void method2065(int arg0) {
        if (arg0 >= -93) {
            method2065(-57);
        }
        field4826 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILr;J)V")
    public final void method2066(int arg0, class98 arg1, long arg2) {
        for (class32 var5 = (class32) this.field4822.method3313((byte) 117); var5 != null; var5 = (class32) this.field4822.method3308(-108)) {
            var5.method291(arg1, arg2);
        }
        field4816++;
        int var6 = -125 % ((36 - arg0) / 52);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lr;Lkw;Lhda;J)V")
    public class344(class98 arg0, class7 arg1, class635 arg2, long arg3) {
        this.field4825 = arg1;
        this.field4828 = arg2;
        this.field4819 = arg3;
        this.field4818 = this.field4825.method30(2);
        if (!arg0.method814() && this.field4818.field8396 != -1) {
            this.field4818 = class127.method1008(this.field4818.field8396, 29127);
        }
        this.field4822 = new class565();
        this.field4817 = (int) ((double) this.field4817 + Math.random() * 64.0D);
        this.method2064(-1);
        this.field4832.field9643 = this.field4831.field9643;
        this.field4832.field9639 = this.field4831.field9639;
        this.field4832.field9645 = this.field4831.field9645;
        this.field4832.field9638 = this.field4831.field9638;
        this.field4832.field9637 = this.field4831.field9637;
        this.field4832.field9642 = this.field4831.field9642;
        this.field4832.field9641 = this.field4831.field9641;
        this.field4832.field9635 = this.field4831.field9635;
        this.field4832.field9634 = this.field4831.field9634;
    }
}
