import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class408 extends class166 {

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "Z")
    public boolean field5758 = false;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    private int field5754 = 0;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "Lnt;")
    public class224 field5753 = new class224();

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "Lnt;")
    private class224 field5762 = new class224();

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "Z")
    private boolean field5770 = false;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "Llba;")
    public class550 field5749;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "Lfk;")
    public class653 field5746;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "J")
    private long field5751;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "Lfp;")
    public class327 field5747;

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "Lo;")
    public class29 field5759;

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "[[I")
    public static int[][] field5761 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "Lfc;")
    public static class262 field5757 = new class262(64);

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public int field5752;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
    private int field5763;

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "I")
    private int field5764;

    @OriginalMember(owner = "client!qba", name = "C", descriptor = "I")
    private int field5765;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
    private int field5766;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
    private int field5767;

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    private int field5768;

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
    private int field5769;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(JLha;B)V")
    public final void method2354(long arg0, class60 arg1, byte arg2) {
        field5760++;
        int var5 = 64 % ((arg2 + 63) / 41);
        for (class254 var6 = (class254) this.field5759.method113((byte) 15); var6 != null; var6 = (class254) this.field5759.method119(false)) {
            var6.method1513(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lha;ZJII)V")
    public final void method2355(class60 arg0, boolean arg1, long arg2, int arg3, int arg4) {
        field5750++;
        if (this.field5758) {
            arg1 = false;
        } else if (this.field5747.field4388 > class658.field9179) {
            arg1 = false;
        } else if (class263.field3442[class658.field9179] < class79.field1090) {
            arg1 = false;
        } else if (this.field5770) {
            arg1 = false;
        } else if (this.field5747.field4401 != -1) {
            int var7 = (int) (arg2 - this.field5751);
            if (this.field5747.field4424 || var7 <= this.field5747.field4401) {
                var7 %= this.field5747.field4401;
            } else {
                arg1 = false;
            }
            if (!this.field5747.field4367 && var7 < this.field5747.field4381) {
                arg1 = false;
            }
            if (this.field5747.field4367 && this.field5747.field4381 <= var7) {
                arg1 = false;
            }
        }
        if (arg1) {
            class98.field1310++;
            int var8 = (this.field5753.field2897 + this.field5753.field2889 + this.field5753.field2895) / 3;
            int var9 = (this.field5753.field2900 + this.field5753.field2891 + this.field5753.field2898) / 3;
            int var10 = (this.field5753.field2902 + this.field5753.field2901 + this.field5753.field2899) / 3;
            if (this.field5753.field2886 != var8 || this.field5753.field2888 != var9 || this.field5753.field2892 != var10) {
                this.field5753.field2886 = var8;
                this.field5753.field2888 = var9;
                this.field5753.field2892 = var10;
                int var11 = this.field5753.field2897 - this.field5753.field2889;
                int var12 = this.field5753.field2900 - this.field5753.field2891;
                int var13 = this.field5753.field2901 - this.field5753.field2902;
                int var14 = this.field5753.field2895 - this.field5753.field2889;
                int var15 = this.field5753.field2898 - this.field5753.field2891;
                int var16 = this.field5753.field2899 - this.field5753.field2902;
                this.field5764 = var11 * var15 - (var12 * var14);
                this.field5766 = var12 * var16 - (var13 * var15);
                this.field5763 = var13 * var14 - var11 * var16;
                while (true) {
                    if (this.field5766 <= 32767 && this.field5763 <= 32767 && this.field5764 <= 32767 && this.field5766 >= -32767 && this.field5763 >= -32767 && this.field5764 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field5766 * this.field5766 + this.field5764 * this.field5764 + (this.field5763 * this.field5763)));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field5764 = this.field5764 * 32767 / var17;
                        this.field5763 = this.field5763 * 32767 / var17;
                        this.field5766 = this.field5766 * 32767 / var17;
                        if (this.field5747.field4427 > 0 || this.field5747.field4391 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field5764, (double) this.field5766) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field5763, Math.sqrt((double) (this.field5766 * this.field5766 + this.field5764 * this.field5764))) * 2607.5945876176133D);
                            this.field5768 = this.field5747.field4427 - this.field5747.field4382;
                            this.field5769 = var18 + this.field5747.field4382 - (this.field5768 >> 1);
                            this.field5765 = this.field5747.field4391 - this.field5747.field4402;
                            this.field5767 = var19 + this.field5747.field4402 - (this.field5765 >> 1);
                        }
                        break;
                    }
                    this.field5764 >>= 0x1;
                    this.field5766 >>= 0x1;
                    this.field5763 >>= 0x1;
                }
            }
            this.field5754 += (int) ((double) arg4 * (Math.random() * (double) (this.field5747.field4432 - this.field5747.field4385) + (double) this.field5747.field4385));
            if (this.field5754 > 63) {
                int var20 = this.field5754 >> 6;
                this.field5754 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field5747.field4427 <= 0 && this.field5747.field4391 <= 0) {
                        var22 = this.field5766;
                        var23 = this.field5763;
                        var24 = this.field5764;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field5768) + this.field5769;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class15.field113[var26];
                        int var28 = class15.field115[var26];
                        int var29 = (int) ((double) this.field5765 * Math.random()) + this.field5767;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class15.field113[var30];
                        int var32 = class15.field115[var30];
                        byte var33 = 13;
                        var22 = var28 * var31 >> var33;
                        var23 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field5753.field2895 * var36 + (float) this.field5753.field2897 * var35 + (float) this.field5753.field2889 * var34);
                    int var38 = (int) ((float) this.field5753.field2898 * var36 + (float) this.field5753.field2900 * var35 + (float) this.field5753.field2891 * var34);
                    int var39 = (int) ((float) this.field5753.field2899 * var36 + (float) this.field5753.field2902 * var34 + (float) this.field5753.field2901 * var35);
                    int var40 = (int) ((float) this.field5762.field2895 * var36 + (float) this.field5762.field2897 * var35 + (float) this.field5762.field2889 * var34);
                    int var41 = (int) ((float) this.field5762.field2898 * var36 + (float) this.field5762.field2900 * var35 + (float) this.field5762.field2891 * var34);
                    int var42 = (int) ((float) this.field5762.field2899 * var36 + (float) this.field5762.field2902 * var34 + (float) this.field5762.field2901 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = (int) (Math.random() * (double) (this.field5747.field4366 - this.field5747.field4409)) + this.field5747.field4409;
                    int var50 = (int) (Math.random() * (double) (this.field5747.field4428 - this.field5747.field4405)) + this.field5747.field4405;
                    int var51 = this.field5747.field4420 + ((int) (Math.random() * (double) (this.field5747.field4429 - this.field5747.field4420)));
                    int var52;
                    if (this.field5747.field4398) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field5747.field4365 * var53 + (double) this.field5747.field4376) << 16 | (int) ((double) this.field5747.field4369 * var53 + (double) this.field5747.field4395) << 8 | (int) ((double) this.field5747.field4372 * var53 + (double) this.field5747.field4410) | (int) (Math.random() * (double) this.field5747.field4404 + (double) this.field5747.field4394) << 24;
                    } else {
                        var52 = (int) (Math.random() * (double) this.field5747.field4404 + (double) this.field5747.field4394) << 24 | (int) ((double) this.field5747.field4376 + Math.random() * (double) this.field5747.field4365) << 16 | (int) (Math.random() * (double) this.field5747.field4369 + (double) this.field5747.field4395) << 8 | (int) ((double) this.field5747.field4410 + (double) this.field5747.field4372 * Math.random());
                    }
                    int var55 = this.field5747.field4364;
                    if (!arg0.method392() && !this.field5747.field4433) {
                        var55 = -1;
                    }
                    if (class363.field4806 == class306.field4164) {
                        new class254(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field5747.field4390, this.field5747.field4418);
                    } else {
                        class254 var56 = class150.field1910[class363.field4806];
                        class363.field4806 = class363.field4806 + 1 & 0x3FF;
                        var56.method1514(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field5747.field4390, this.field5747.field4418);
                    }
                }
            }
        }
        if (!this.field5753.method1274(this.field5762, true)) {
            class224 var58 = this.field5762;
            this.field5762 = this.field5753;
            this.field5753 = var58;
            this.field5753.field2891 = this.field5746.field9095;
            this.field5753.field2899 = this.field5746.field9088;
            this.field5753.field2892 = this.field5762.field2892;
            this.field5753.field2895 = this.field5746.field9084;
            this.field5753.field2889 = this.field5746.field9098;
            this.field5753.field2901 = this.field5746.field9080;
            this.field5753.field2902 = this.field5746.field9099;
            this.field5753.field2900 = this.field5746.field9090;
            this.field5753.field2886 = this.field5762.field2886;
            this.field5753.field2898 = this.field5746.field9097;
            this.field5753.field2888 = this.field5762.field2888;
            this.field5753.field2897 = this.field5746.field9089;
        }
        if (arg3 != -64) {
            return;
        }
        this.field5752 = 0;
        for (class254 var59 = (class254) this.field5759.method113((byte) 15); var59 != null; var59 = (class254) this.field5759.method119(false)) {
            var59.method1511(arg2, arg4);
            this.field5752++;
        }
        class750.field10397 += this.field5752;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lac;Z[IIBIII)Liaa;")
    public static final class495 method2356(class541 arg0, boolean arg1, int[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field5755++;
        if (arg4 != 120) {
            return null;
        } else if (!arg0.field7637 && (!class143.method891(arg3, arg4 - 120) || !class143.method891(arg7, arg4 - 120))) {
            return arg0.field7589 ? new class495(arg0, 34037, arg3, arg7, arg1, arg2, arg5, arg6) : new class495(arg0, arg3, arg7, class128.method814(423660257, arg3), class128.method814(423660257, arg7), arg2);
        } else {
            return new class495(arg0, 3553, arg3, arg7, arg1, arg2, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public static void method2357(int arg0) {
        if (arg0 == -6086) {
            field5757 = null;
            field5761 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
    public final void method2358(int arg0) {
        this.field5753.field2902 = this.field5746.field9099;
        this.field5753.field2897 = this.field5746.field9089;
        this.field5753.field2899 = this.field5746.field9088;
        if (arg0 != -1) {
            return;
        }
        this.field5753.field2891 = this.field5746.field9095;
        this.field5753.field2889 = this.field5746.field9098;
        this.field5753.field2900 = this.field5746.field9090;
        field5756++;
        this.field5753.field2898 = this.field5746.field9097;
        this.field5753.field2895 = this.field5746.field9084;
        this.field5753.field2901 = this.field5746.field9080;
        if (this.field5753.field2897 == this.field5753.field2889 && this.field5753.field2897 == this.field5753.field2895 && this.field5753.field2900 == this.field5753.field2891 && this.field5753.field2900 == this.field5753.field2898 && this.field5753.field2902 == this.field5753.field2901 && this.field5753.field2901 == this.field5753.field2899) {
            this.field5770 = true;
        } else if (this.field5770) {
            this.field5762.field2895 = this.field5753.field2895;
            this.field5762.field2898 = this.field5753.field2898;
            this.field5762.field2897 = this.field5753.field2897;
            this.field5762.field2891 = this.field5753.field2891;
            this.field5762.field2902 = this.field5753.field2902;
            this.field5762.field2900 = this.field5753.field2900;
            this.field5762.field2899 = this.field5753.field2899;
            this.field5762.field2889 = this.field5753.field2889;
            this.field5762.field2901 = this.field5753.field2901;
            this.field5770 = false;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BII)Lsba;")
    public static final class218 method2359(byte arg0, int arg1, int arg2) {
        field5748++;
        class218 var3 = class357.method2056(arg1, -9820);
        if (arg0 != 72) {
            field5761 = null;
        }
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field2816 == null || arg2 >= var3.field2816.length) {
            return null;
        } else {
            return var3.field2816[arg2];
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lha;Lfk;Llba;J)V")
    public class408(class60 arg0, class653 arg1, class550 arg2, long arg3) {
        this.field5749 = arg2;
        this.field5746 = arg1;
        this.field5751 = arg3;
        this.field5747 = this.field5746.method3686(0);
        if (!arg0.method392() && this.field5747.field4403 != -1) {
            this.field5747 = class270.method1615(this.field5747.field4403, 14883);
        }
        this.field5759 = new class29();
        this.field5754 = (int) ((double) this.field5754 + Math.random() * 64.0D);
        this.method2358(-1);
        this.field5762.field2891 = this.field5753.field2891;
        this.field5762.field2889 = this.field5753.field2889;
        this.field5762.field2902 = this.field5753.field2902;
        this.field5762.field2898 = this.field5753.field2898;
        this.field5762.field2900 = this.field5753.field2900;
        this.field5762.field2895 = this.field5753.field2895;
        this.field5762.field2897 = this.field5753.field2897;
        this.field5762.field2899 = this.field5753.field2899;
        this.field5762.field2901 = this.field5753.field2901;
    }
}
