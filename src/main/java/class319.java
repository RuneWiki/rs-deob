import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class319 extends class423 {

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Z")
    public boolean field4679 = false;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    private int field4680 = 0;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Z")
    private boolean field4691 = false;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lai;")
    public class133 field4683;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "Ldj;")
    public class314 field4698;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "J")
    private long field4688;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Lmd;")
    public class370 field4689;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "Ltg;")
    public class304 field4693;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field4707 = -1;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "[[I")
    public static int[][] field4712 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Ljn;")
    public static class409 field4682 = new class409("M", "M", "M", "M");

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field4713 = 0;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field4714 = 1;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    private int field4677;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public int field4678;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    private int field4681;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public int field4684;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    private int field4686;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    private int field4690;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    private int field4692;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    private int field4695;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    private int field4696;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    private int field4699;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    private int field4700;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    private int field4701;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    private int field4702;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    private int field4703;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    private int field4704;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    private int field4708;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    private int field4710;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    private int field4711;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Lik;")
    public static final class422 method2098(int arg0, int arg1, int arg2) {
        class369 var3 = class178.field2530[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5335;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLia;)V")
    public static final void method2099(boolean arg0, class375 arg1) {
        field4685++;
        if (class286.field4210) {
            return;
        }
        arg1.method1820(-25246);
        class237.field3532--;
        if (arg0) {
            method2099(false, (class375) null);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
    public static void method2100(byte arg0) {
        field4712 = null;
        if (arg0 > -97) {
            method2105(false);
        }
        field4682 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IJLfp;IZ)V")
    public final void method2101(int arg0, long arg1, class9 arg2, int arg3, boolean arg4) {
        if (this.field4679) {
            arg4 = false;
        } else if (class202.field2855 < this.field4689.field5359) {
            arg4 = false;
        } else if (class248.field3652 > class283.field4168[class202.field2855]) {
            arg4 = false;
        } else if (this.field4691) {
            arg4 = false;
        } else if (this.field4689.field5406 != -1) {
            int var7 = (int) (arg1 - this.field4688);
            if (this.field4689.field5383 || this.field4689.field5406 >= var7) {
                var7 %= this.field4689.field5406;
            } else {
                arg4 = false;
            }
            if (!this.field4689.field5369 && var7 < this.field4689.field5355) {
                arg4 = false;
            }
            if (this.field4689.field5369 && var7 >= this.field4689.field5355) {
                arg4 = false;
            }
        }
        field4709++;
        if (arg4) {
            this.field4680 += (int) (((double) (this.field4689.field5365 - this.field4689.field5387) * Math.random() + (double) this.field4689.field5387) * (double) arg0);
            if (this.field4680 > 63) {
                int var8 = this.field4680 >> 6;
                this.field4680 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field4689.field5371 <= 0 && this.field4689.field5421 <= 0) {
                        var10 = this.field4703;
                        var11 = this.field4701;
                        var12 = this.field4677;
                    } else {
                        int var13 = this.field4708 + (int) (Math.random() * (double) this.field4686);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class327.field4863[var14];
                        int var16 = class327.field4862[var14];
                        int var17 = this.field4695 + (int) (Math.random() * (double) this.field4692);
                        int var18 = var17 & 0x1FFF;
                        int var19 = class327.field4863[var18];
                        var10 = var16 * var19 >> 15;
                        int var20 = class327.field4862[var18];
                        var11 = var20 * -1;
                        var12 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var21 = 65535 - var21;
                        var22 = 65535 - var22;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field4702 * var23 + this.field4700 * var22 + this.field4696 * var21 >> 16;
                    int var25 = this.field4690 * var23 + (this.field4699 * var21 + (this.field4681 * var22)) >> 16;
                    int var26 = this.field4711 * var22 + this.field4710 * var21 + (this.field4704 * var23) >> 16;
                    int var27 = (int) ((double) (this.field4689.field5361 - this.field4689.field5367) * Math.random()) + this.field4689.field5367;
                    int var28 = (int) ((double) (this.field4689.field5357 - this.field4689.field5399) * Math.random()) + this.field4689.field5399;
                    int var29 = this.field4689.field5423 + (int) ((double) (this.field4689.field5403 - this.field4689.field5423) * Math.random());
                    int var30;
                    if (this.field4689.field5390) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field4689.field5360 * var31 + (double) this.field4689.field5401) << 24 | (int) ((double) this.field4689.field5379 * var31 + (double) this.field4689.field5381) << 16 | (int) ((double) this.field4689.field5393 * var31 + (double) this.field4689.field5422) << 8 | (int) ((double) this.field4689.field5420 * var31 + (double) this.field4689.field5392);
                    } else {
                        var30 = (int) ((double) this.field4689.field5360 * Math.random() + (double) this.field4689.field5401) << 24 | (int) ((double) this.field4689.field5420 * Math.random() + (double) this.field4689.field5392) | (int) ((double) this.field4689.field5422 + (double) this.field4689.field5393 * Math.random()) << 8 | (int) ((double) this.field4689.field5379 * Math.random() + (double) this.field4689.field5381) << 16;
                    }
                    int var33 = this.field4689.field5364;
                    if (!arg2.method165() && !this.field4689.field5388) {
                        var33 = -1;
                    }
                    if (class295.field4294 == class204.field2871) {
                        new class290(this, var24, var25, var26, var10, var11, var12, var27, var28, var30, var29, var33, this.field4689.field5395);
                    } else {
                        class290 var34 = class452.field6675[class204.field2871];
                        class204.field2871 = class204.field2871 + 1 & 0x3FF;
                        var34.method1941(this, var24, var25, var26, var10, var11, var12, var27, var28, var30, var29, var33, this.field4689.field5395);
                    }
                }
            }
        }
        this.field4694 = 0;
        if (arg3 < 40) {
            this.field4711 = -121;
        }
        for (class290 var36 = (class290) this.field4693.method2026(100); var36 != null; var36 = (class290) this.field4693.method2022(10)) {
            var36.method1942(arg1, arg0);
            this.field4694++;
        }
        class115.field1567 += this.field4694;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public final void method2102(int arg0) {
        this.field4681 = this.field4683.field1816;
        this.field4710 = this.field4683.field1812;
        this.field4690 = this.field4683.field1822;
        this.field4696 = this.field4683.field1828;
        this.field4704 = this.field4683.field1827;
        this.field4699 = this.field4683.field1824;
        this.field4702 = this.field4683.field1826;
        this.field4711 = this.field4683.field1814;
        field4687++;
        this.field4700 = this.field4683.field1829;
        if (this.field4700 == this.field4696 && this.field4702 == this.field4700 && this.field4699 == this.field4681 && this.field4690 == this.field4681 && this.field4711 == this.field4710 && this.field4711 == this.field4704) {
            this.field4691 = true;
            return;
        }
        this.field4691 = false;
        int var2 = (this.field4700 + this.field4696 + this.field4702) / 3;
        int var3 = (this.field4690 + this.field4681 + this.field4699) / 3;
        if (arg0 != 32767) {
            method2099(false, (class375) null);
        }
        int var4 = (this.field4710 - (-this.field4711 - this.field4704)) / 3;
        if (this.field4706 == var2 && this.field4678 == var3 && this.field4684 == var4) {
            return;
        }
        this.field4678 = var3;
        this.field4706 = var2;
        this.field4684 = var4;
        int var5 = this.field4700 - this.field4696;
        int var6 = this.field4681 - this.field4699;
        int var7 = this.field4711 - this.field4710;
        int var8 = this.field4702 - this.field4696;
        int var9 = this.field4690 - this.field4699;
        int var10 = this.field4704 - this.field4710;
        this.field4677 = var5 * var9 - (var6 * var8);
        this.field4703 = var6 * var10 - var7 * var9;
        this.field4701 = var7 * var8 - (var5 * var10);
        while (this.field4703 > 32767 || this.field4701 > 32767 || this.field4677 > 32767 || this.field4703 < -32767 || this.field4701 < -32767 || this.field4677 < -32767) {
            this.field4701 >>= 0x1;
            this.field4677 >>= 0x1;
            this.field4703 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field4701 * this.field4701 + (this.field4703 * this.field4703 + (this.field4677 * this.field4677))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field4703 = this.field4703 * 32767 / var11;
        this.field4677 = this.field4677 * 32767 / var11;
        this.field4701 = this.field4701 * 32767 / var11;
        if (this.field4689.field5371 <= 0 && this.field4689.field5421 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field4677, (double) this.field4703) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field4701, Math.sqrt((double) (this.field4703 * this.field4703 + this.field4677 * this.field4677))) * 2607.5945876176133D);
        this.field4686 = this.field4689.field5371 - this.field4689.field5402;
        this.field4708 = var12 + this.field4689.field5402 - (this.field4686 >> 1);
        this.field4692 = this.field4689.field5421 - this.field4689.field5378;
        this.field4695 = this.field4689.field5378 + var13 - (this.field4692 >> 1);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)Z")
    public static final boolean method2103(boolean arg0) {
        for (int var1 = class440.field6411; var1 < class204.field2870; var1++) {
            class369[][] var2 = class178.field2530[var1];
            for (int var3 = -class31.field431; var3 <= 0; var3++) {
                int var4 = class145.field1969 + var3;
                int var5 = class145.field1969 - var3;
                if (var4 >= class93.field1161 || var5 < class454.field6704) {
                    for (int var6 = -class31.field431; var6 <= 0; var6++) {
                        int var7 = class189.field2651 + var6;
                        int var8 = class189.field2651 - var6;
                        if (var4 >= class93.field1161) {
                            if (var7 >= class316.field4631) {
                                class369 var9 = var2[var4][var7];
                                if (var9 != null && var9.field5338) {
                                    class325.field4783 = arg0;
                                    class71.field930.method43(var9, (byte) 124);
                                    class71.field930.method42((byte) -121);
                                }
                            }
                            if (var8 < class47.field619) {
                                class369 var10 = var2[var4][var8];
                                if (var10 != null && var10.field5338) {
                                    class325.field4783 = arg0;
                                    class71.field930.method43(var10, (byte) 112);
                                    class71.field930.method42((byte) -124);
                                }
                            }
                        }
                        if (var5 < class454.field6704) {
                            if (var7 >= class316.field4631) {
                                class369 var11 = var2[var5][var7];
                                if (var11 != null && var11.field5338) {
                                    class325.field4783 = arg0;
                                    class71.field930.method43(var11, (byte) 118);
                                    class71.field930.method42((byte) -123);
                                }
                            }
                            if (var8 < class47.field619) {
                                class369 var12 = var2[var5][var8];
                                if (var12 != null && var12.field5338) {
                                    class325.field4783 = arg0;
                                    class71.field930.method43(var12, (byte) 107);
                                    class71.field930.method42((byte) -123);
                                }
                            }
                        }
                        if (class328.field4888 == 0) {
                            if (class259.field3823) {
                                class71.field930.method37(24, 112);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(JI)V")
    public final void method2104(long arg0, int arg1) {
        field4705++;
        for (class290 var4 = (class290) this.field4693.method2026(100); var4 != null; var4 = (class290) this.field4693.method2022(10)) {
            var4.method1939(arg0);
        }
        int var5 = -15 % ((-arg1 - 59) / 50);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(Z)V")
    public static final void method2105(boolean arg0) {
        class363 var1 = class148.field2000;
        synchronized (class148.field2000) {
            class148.field2000.method2307(13);
        }
        if (arg0) {
            field4707 = 60;
        }
        field4697++;
        class363 var2 = class141.field1914;
        synchronized (class141.field1914) {
            class141.field1914.method2307(-92);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lfp;Lai;Ldj;J)V")
    public class319(class9 arg0, class133 arg1, class314 arg2, long arg3) {
        this.field4683 = arg1;
        this.field4698 = arg2;
        this.field4688 = arg3;
        this.field4689 = class437.method2689((byte) -115, this.field4683.field1819);
        if (!arg0.method165() && this.field4689.field5416 != -1) {
            this.field4689 = class437.method2689((byte) -110, this.field4689.field5416);
        }
        this.field4693 = new class304();
        this.field4680 = (int) ((double) this.field4680 + Math.random() * 64.0D);
        this.method2102(32767);
    }
}
