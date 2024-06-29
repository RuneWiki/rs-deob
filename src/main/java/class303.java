import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class303 extends class193 {

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "Z")
    public boolean field4550 = false;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Z")
    public boolean field4554 = true;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    private int field4556 = 0;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Lfd;")
    public class219 field4534;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Lko;")
    public class155 field4532;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Ltf;")
    public class116 field4539;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "Lqk;")
    public class1 field4553;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "J")
    private long field4555;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[J")
    public static long[] field4526 = new long[32];

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    private int field4523;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    private int field4525;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    private int field4528;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    private int field4533;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    private int field4538;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    private int field4540;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    private int field4541;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    private int field4542;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    private int field4543;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    private int field4544;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    private int field4545;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    private int field4546;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
    private int field4547;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    private int field4551;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    private int field4552;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 8)
    public static final void method2135(int arg0, int arg1) {
        field4549++;
        class95 var2 = class227.method1699(3, -1855723168, arg0);
        if (arg1 != -32768) {
            method2135(-71, 13);
        }
        var2.method743(0);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 46)
    public static void method2136(int arg0) {
        int var1 = 103 % ((arg0 + 10) / 53);
        field4526 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BIIZJI)V", line = 56)
    public final void method2137(byte arg0, int arg1, int arg2, boolean arg3, long arg4, int arg5) {
        field4524++;
        if (arg0 <= 88) {
            return;
        }
        if (this.field4550) {
            arg3 = false;
        } else if (class155.field2251 < this.field4553.field26) {
            arg3 = false;
        } else if (class331.field5032[class155.field2251] < class155.field2211) {
            arg3 = false;
        } else if (this.field4547 == this.field4544 && this.field4544 == this.field4538 && this.field4528 == this.field4523 && this.field4540 == this.field4523 && this.field4551 == this.field4545 && this.field4551 == this.field4541) {
            arg3 = false;
        } else if (this.field4553.field41 != -1) {
            int var8 = (int) (arg4 - this.field4555);
            if (this.field4553.field25 || this.field4553.field41 >= var8) {
                var8 %= this.field4553.field41;
            } else {
                arg3 = false;
            }
            if (!this.field4553.field64 && this.field4553.field6 > var8) {
                arg3 = false;
            }
            if (this.field4553.field64 && var8 >= this.field4553.field6) {
                arg3 = false;
            }
        }
        if (arg3) {
            this.field4556 += (int) (((double) (this.field4553.field46 - this.field4553.field43) * Math.random() + (double) this.field4553.field43) * (double) arg5);
            if (this.field4556 > 63) {
                int var9 = this.field4556 >> 6;
                this.field4556 &= 0x3F;
                if (this.field4554) {
                    int var10 = this.field4544 - this.field4547;
                    int var11 = this.field4551 - this.field4545;
                    int var12 = this.field4523 - this.field4528;
                    int var13 = this.field4538 - this.field4547;
                    int var14 = this.field4540 - this.field4528;
                    this.field4533 = var10 * var14 - (var12 * var13);
                    int var15 = this.field4541 - this.field4545;
                    this.field4552 = var12 * var15 - (var11 * var14);
                    this.field4529 = var11 * var13 - (var10 * var15);
                    while (true) {
                        if (this.field4552 <= 32767 && this.field4529 <= 32767 && this.field4533 <= 32767 && this.field4552 >= -32767 && this.field4529 >= -32767 && this.field4533 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field4529 * this.field4529 + this.field4552 * this.field4552 + this.field4533 * this.field4533));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field4529 = this.field4529 * 32767 / var16;
                            this.field4533 = this.field4533 * 32767 / var16;
                            this.field4552 = this.field4552 * 32767 / var16;
                            if (this.field4553.field51 > 0 || this.field4553.field29 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field4533, (double) this.field4552) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field4529, Math.sqrt((double) (this.field4552 * this.field4552 + this.field4533 * this.field4533))) * 2047.0D / 6.283185307179586D);
                                this.field4543 = this.field4553.field29 - this.field4553.field34;
                                int var20 = var18 - this.field4532.field2252;
                                this.field4525 = this.field4553.field51 - this.field4553.field63;
                                this.field4546 = var19 + this.field4553.field34 - this.field4543 / 2;
                                this.field4542 = var20 + this.field4553.field63 - (this.field4525 / 2);
                            } else if (this.field4532.field2252 != 0) {
                                int var17 = this.field4552 * arg1 + this.field4533 * arg2 >> 16;
                                this.field4533 = this.field4533 * arg1 - (this.field4552 * arg2) >> 16;
                                this.field4552 = var17;
                            }
                            this.field4554 = false;
                            break;
                        }
                        this.field4533 >>= 0x1;
                        this.field4529 >>= 0x1;
                        this.field4552 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field4553.field51 <= 0 && this.field4553.field29 <= 0) {
                        var22 = this.field4529;
                        var23 = this.field4533;
                        var24 = this.field4552;
                    } else {
                        int var25 = this.field4546 + (int) (Math.random() * (double) this.field4543);
                        int var26 = this.field4542 + (int) ((double) this.field4525 * Math.random());
                        int var27 = var25 & 0x3FF;
                        int var28 = var26 & 0x7FF;
                        int var29 = class345.field5339[var28] >> 1;
                        int var30 = class345.field5339[var27] >> 1;
                        var23 = var29 * var30 >> 15;
                        int var31 = class345.field5343[var28] >> 1;
                        int var32 = class345.field5343[var27] >> 1;
                        var22 = var32 * -1;
                        var24 = var30 * var31 >> 15;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var35 - var33;
                    int var37 = this.field4528 * var33 + this.field4540 * var36 + this.field4523 * var35 >> 8;
                    int var38 = this.field4551 * var35 + this.field4545 * var33 + this.field4541 * var36 >> 8;
                    int var39 = this.field4538 * var36 + this.field4547 * var33 + this.field4544 * var35 >> 8;
                    if (this.field4532.field2252 != 0) {
                        int var40 = arg2 * var38 + (arg1 * var39) >> 16;
                        var38 = arg1 * var38 - (arg2 * var39) >> 16;
                        var39 = var40;
                    }
                    int var41 = (int) ((double) (this.field4553.field17 - this.field4553.field20) * Math.random()) + this.field4553.field20;
                    int var42;
                    if (this.field4553.field1) {
                        double var43 = Math.random();
                        var42 = (int) ((double) this.field4553.field65 * var43 + (double) this.field4553.field67) << 24 | (int) ((double) this.field4553.field2 * var43 + (double) this.field4553.field11) | (int) ((double) this.field4553.field40 * var43 + (double) this.field4553.field23) << 16 | (int) ((double) this.field4553.field15 * var43 + (double) this.field4553.field22) << 8;
                    } else {
                        var42 = (int) (Math.random() * (double) this.field4553.field40 + (double) this.field4553.field23) << 16 | (int) ((double) this.field4553.field22 + (double) this.field4553.field15 * Math.random()) << 8 | (int) ((double) this.field4553.field11 + (double) this.field4553.field2 * Math.random()) | (int) ((double) this.field4553.field67 + (double) this.field4553.field65 * Math.random()) << 24;
                    }
                    int var45 = this.field4553.field30 + ((int) (Math.random() * (double) (this.field4553.field13 - this.field4553.field30)));
                    if (class155.field2224 == class155.field2212) {
                        new class341(this, this.field4532.field2250 + var39, this.field4532.field2242 + var37, this.field4532.field2248 + var38, var24, var22, var23, var45, var41, var42);
                    } else {
                        class341 var46 = class155.field2208[class155.field2212];
                        class155.field2212 = class155.field2212 + 1 & 0x3FF;
                        var46.method2381(this, this.field4532.field2250 + var39, this.field4532.field2242 + var37, this.field4532.field2248 + var38, var24, var22, var23, var45, var41, var42);
                    }
                }
            }
        }
        this.field4548 = 0;
        for (class341 var48 = (class341) this.field4539.method869(false); var48 != null; var48 = (class341) this.field4539.method872(32767)) {
            var48.method2380(arg4, arg5);
            this.field4548++;
        }
        class155.field2221 += this.field4548;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 288)
    public static final void method2138(int arg0) {
        while (true) {
            if (class83.field1194.method1916(arg0 ^ 0xD, class358.field5481) >= 11) {
                int var1 = class83.field1194.method1911(11, 16811);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class343.field5312[var1] == null) {
                        class343.field5312[var1] = new class228();
                        var2 = true;
                        if (class299.field4478[var1] != null) {
                            class343.field5312[var1].method1708(class299.field4478[var1], (byte) -78, var1);
                        }
                    }
                    class227.field3426[class265.field4053++] = var1;
                    class228 var3 = class343.field5312[var1];
                    var3.field5153 = class304.field4560;
                    int var4 = class83.field1194.method1911(5, 16811);
                    int var5 = class83.field1194.method1911(5, 16811);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class359.field5559[class83.field1194.method1911(3, arg0 ^ 0x41AE)];
                    if (var2) {
                        var3.field5089 = var3.field5199 = var6;
                    }
                    int var7 = class83.field1194.method1911(1, 16811);
                    if (var7 == 1) {
                        class5.field125[class95.field1336++] = var1;
                    }
                    int var8 = class83.field1194.method1911(1, arg0 ^ 0x41AE);
                    var3.method1701(6476, class1.field55.field5186[0] + var4, class1.field55.field5162[0] + var5, var8 == 1);
                    continue;
                }
            }
            field4537++;
            class83.field1194.method1917(-126);
            if (arg0 != 5) {
                field4526 = (long[]) null;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lfd;Lko;J)V", line = 413)
    public class303(class219 arg0, class155 arg1, long arg2) {
        this.field4534 = arg0;
        this.field4532 = arg1;
        this.field4539 = new class116();
        this.field4553 = this.field4534.field3274;
        this.field4555 = arg2;
        this.field4556 = (int) ((double) this.field4556 + Math.random() * 64.0D);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V", line = 357)
    public static final void method2139(int arg0) {
        class279.field4243 = -1;
        class272.field4126 = 0;
        if (arg0 != -1490424168) {
            return;
        }
        field4531++;
        class229.field3467 = 0;
        class289.field4378 = 1;
        class318.field4792 = 0;
        class158.field2278 = -3;
        class313.field4658 = false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)V", line = 377)
    public final void method2140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4547 = arg7;
        this.field4523 = arg4;
        this.field4541 = arg8;
        this.field4538 = arg1;
        this.field4544 = arg9;
        this.field4540 = arg6;
        if (arg2 != 8169) {
            method2136(-128);
        }
        field4536++;
        this.field4528 = arg5;
        this.field4551 = arg0;
        this.field4545 = arg3;
        int var11 = (this.field4547 + this.field4544 + this.field4538) / 3 + this.field4532.field2250;
        int var12 = (this.field4545 + this.field4551 + this.field4541) / 3 + this.field4532.field2248;
        int var13 = (this.field4540 + this.field4528 + this.field4523) / 3 + this.field4532.field2242;
        if (this.field4522 != var11 || this.field4521 != var13 || this.field4527 != var12) {
            this.field4554 = true;
            this.field4521 = var13;
            this.field4522 = var11;
            this.field4527 = var12;
        }
    }
}
