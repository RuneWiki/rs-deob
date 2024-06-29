import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class178 extends class312 {

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Z")
    private boolean field2747 = false;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    private int field2733 = 0;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Z")
    public boolean field2729 = false;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Lod;")
    public class476 field2755;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "J")
    private long field2721;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "Ltd;")
    public class382 field2754;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "Llv;")
    public class534 field2745;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "Lhv;")
    public class150 field2734;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Z")
    public static boolean field2725 = false;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    private int field2720;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    private int field2723;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    private int field2724;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    private int field2727;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    private int field2728;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    private int field2738;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    private int field2739;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    private int field2741;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    private int field2743;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    private int field2746;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    private int field2749;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    private int field2750;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "Lwk;")
    public static class329 field2740;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Z")
    public static final boolean method1256(int arg0, int arg1, int arg2) {
        if (arg0 != 13775) {
            field2722 = -24;
        }
        field2742++;
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(JB)V")
    public final void method1257(long arg0, byte arg1) {
        field2748++;
        int var4 = -7 % ((20 - arg1) / 41);
        for (class217 var5 = (class217) this.field2734.method1076((byte) 98); var5 != null; var5 = (class217) this.field2734.method1077(-1)) {
            var5.method1499(arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)V")
    public static final void method1258(boolean arg0, int arg1, int arg2) {
        if (class91.field1471 != arg2) {
            class78.field1298 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class78.field1298[var3] = (var3 << 12) / arg2;
            }
            class228.field3447 = arg2 - 1;
            class46.field727 = arg2 * 32;
            class91.field1471 = arg2;
        }
        if (!arg0) {
            return;
        }
        field2752++;
        if (class537.field7884 == arg1) {
            return;
        }
        if (class91.field1471 == arg1) {
            class301.field4614 = class78.field1298;
        } else {
            class301.field4614 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class301.field4614[var4] = (var4 << 12) / arg1;
            }
        }
        class537.field7884 = arg1;
        class236.field3551 = arg1 - 1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IJLza;ZB)V")
    public final void method1259(int arg0, long arg1, class299 arg2, boolean arg3, byte arg4) {
        if (this.field2729) {
            arg3 = false;
        } else if (this.field2745.field7837 > class268.field4260) {
            arg3 = false;
        } else if (class250.field4083[class268.field4260] < class499.field7271) {
            arg3 = false;
        } else if (this.field2747) {
            arg3 = false;
        } else if (this.field2745.field7809 != -1) {
            int var7 = (int) (arg1 - this.field2721);
            if (this.field2745.field7825 || var7 <= this.field2745.field7809) {
                var7 %= this.field2745.field7809;
            } else {
                arg3 = false;
            }
            if (!this.field2745.field7789 && this.field2745.field7805 > var7) {
                arg3 = false;
            }
            if (this.field2745.field7789 && this.field2745.field7805 <= var7) {
                arg3 = false;
            }
        }
        field2719++;
        int var8 = -121 % ((arg4 + 34) / 55);
        if (arg3) {
            this.field2733 += (int) ((double) arg0 * ((double) (this.field2745.field7808 - this.field2745.field7838) * Math.random() + (double) this.field2745.field7838));
            if (this.field2733 > 63) {
                int var9 = this.field2733 >> 6;
                this.field2733 &= 0x3F;
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11;
                    int var12;
                    int var13;
                    if (this.field2745.field7835 <= 0 && this.field2745.field7832 <= 0) {
                        var11 = this.field2732;
                        var12 = this.field2750;
                        var13 = this.field2737;
                    } else {
                        int var14 = (int) (Math.random() * (double) this.field2723) + this.field2743;
                        int var15 = var14 & 0x3FFF;
                        int var16 = class58.field891[var15];
                        int var17 = class58.field889[var15];
                        int var18 = (int) (Math.random() * (double) this.field2746) + this.field2728;
                        int var19 = var18 & 0x1FFF;
                        int var20 = class58.field891[var19];
                        int var21 = class58.field889[var19];
                        byte var22 = 15;
                        var12 = var17 * var20 >> var22;
                        var11 = (var21 << 0) * -1;
                        var13 = var16 * var20 >> var22;
                    }
                    int var23 = (int) (Math.random() * 65535.0D);
                    int var24 = (int) (Math.random() * 65535.0D);
                    if (var23 + var24 > 65535) {
                        var24 = 65535 - var24;
                        var23 = 65535 - var23;
                    }
                    int var25 = 65535 - (var23 + var24);
                    int var26 = (int) ((long) this.field2751 * (long) var24 + (long) this.field2730 * (long) var23 + ((long) this.field2739 * (long) var25) >> 16);
                    int var27 = (int) ((long) this.field2741 * (long) var23 + (long) this.field2749 * (long) var25 + (long) this.field2720 * (long) var24 >> 16);
                    int var28 = (int) ((long) this.field2727 * (long) var24 + (long) this.field2738 * (long) var25 + (long) this.field2724 * (long) var23 >> 16);
                    int var29 = (int) ((double) (this.field2745.field7803 - this.field2745.field7848) * Math.random()) + this.field2745.field7848;
                    int var30 = this.field2745.field7840 + (int) (Math.random() * (double) (this.field2745.field7851 - this.field2745.field7840));
                    int var31 = this.field2745.field7790 + ((int) ((double) (this.field2745.field7820 - this.field2745.field7790) * Math.random()));
                    int var32;
                    if (this.field2745.field7834) {
                        double var33 = Math.random();
                        var32 = (int) ((double) this.field2745.field7842 * Math.random() + (double) this.field2745.field7812) << 24 | (int) ((double) this.field2745.field7855 * var33 + (double) this.field2745.field7826) | (int) ((double) this.field2745.field7811 * var33 + (double) this.field2745.field7845) << 16 | (int) ((double) this.field2745.field7854 * var33 + (double) this.field2745.field7804) << 8;
                    } else {
                        var32 = (int) (Math.random() * (double) this.field2745.field7855 + (double) this.field2745.field7826) | (int) ((double) this.field2745.field7845 + Math.random() * (double) this.field2745.field7811) << 16 | (int) (Math.random() * (double) this.field2745.field7854 + (double) this.field2745.field7804) << 8 | (int) ((double) this.field2745.field7812 + Math.random() * (double) this.field2745.field7842) << 24;
                    }
                    int var35 = this.field2745.field7818;
                    if (!arg2.method510() && !this.field2745.field7821) {
                        var35 = -1;
                    }
                    if (class155.field2386 == class129.field1918) {
                        new class217(this, var26, var27, var28, var12, var11, var13, var29, var30, var32, var31, var35, this.field2745.field7839, this.field2745.field7824);
                    } else {
                        class217 var36 = class443.field6593[class155.field2386];
                        class155.field2386 = class155.field2386 + 1 & 0x3FF;
                        var36.method1501(this, var26, var27, var28, var12, var11, var13, var29, var30, var32, var31, var35, this.field2745.field7839, this.field2745.field7824);
                    }
                }
            }
        }
        this.field2731 = 0;
        for (class217 var38 = (class217) this.field2734.method1076((byte) 56); var38 != null; var38 = (class217) this.field2734.method1077(-1)) {
            var38.method1500(arg1, arg0);
            this.field2731++;
        }
        class285.field4447 += this.field2731;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static void method1260(int arg0) {
        if (arg0 != 1859610384) {
            field2740 = null;
        }
        field2740 = null;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)Lem;")
    public static final class501 method1261(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4390;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)I")
    public static final int method1262(byte arg0, int arg1) {
        field2744++;
        if (arg0 >= -50) {
            method1262((byte) -11, 67);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public final void method1263(int arg0) {
        this.field2749 = this.field2755.field6968;
        this.field2727 = this.field2755.field6960;
        this.field2730 = this.field2755.field6953;
        this.field2724 = this.field2755.field6954;
        field2753++;
        this.field2720 = this.field2755.field6972;
        if (arg0 != -1) {
            method1258(false, 66, -2);
        }
        this.field2741 = this.field2755.field6969;
        this.field2738 = this.field2755.field6971;
        this.field2751 = this.field2755.field6967;
        this.field2739 = this.field2755.field6961;
        if (this.field2751 == this.field2730 && this.field2751 == this.field2739 && this.field2741 == this.field2720 && this.field2749 == this.field2720 && this.field2727 == this.field2724 && this.field2738 == this.field2727) {
            this.field2747 = true;
            return;
        }
        this.field2747 = false;
        int var2 = (this.field2730 + this.field2739 + this.field2751) / 3;
        int var3 = (this.field2720 + this.field2749 + this.field2741) / 3;
        int var4 = (this.field2738 + this.field2724 + this.field2727) / 3;
        if (this.field2726 == var2 && this.field2735 == var3 && this.field2736 == var4) {
            return;
        }
        this.field2736 = var4;
        this.field2726 = var2;
        this.field2735 = var3;
        int var5 = this.field2751 - this.field2730;
        int var6 = this.field2720 - this.field2741;
        int var7 = this.field2727 - this.field2724;
        int var8 = this.field2739 - this.field2730;
        int var9 = this.field2749 - this.field2741;
        int var10 = this.field2738 - this.field2724;
        this.field2737 = var5 * var9 - (var6 * var8);
        this.field2732 = var7 * var8 - (var5 * var10);
        for (this.field2750 = var6 * var10 - var7 * var9; this.field2750 > 32767 || this.field2732 > 32767 || this.field2737 > 32767 || this.field2750 < -32767 || this.field2732 < -32767 || this.field2737 < -32767; this.field2750 >>= 0x1) {
            this.field2737 >>= 0x1;
            this.field2732 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field2737 * this.field2737 + this.field2750 * this.field2750 + this.field2732 * this.field2732));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field2737 = this.field2737 * 32767 / var11;
        this.field2750 = this.field2750 * 32767 / var11;
        this.field2732 = this.field2732 * 32767 / var11;
        if (this.field2745.field7835 <= 0 && this.field2745.field7832 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field2737, (double) this.field2750) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field2732, Math.sqrt((double) (this.field2750 * this.field2750 + this.field2737 * this.field2737))) * 2607.5945876176133D);
        this.field2723 = this.field2745.field7835 - this.field2745.field7817;
        this.field2743 = this.field2745.field7817 + var12 - (this.field2723 >> 1);
        this.field2746 = this.field2745.field7832 - this.field2745.field7793;
        this.field2728 = this.field2745.field7793 + var13 - (this.field2746 >> 1);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lza;Lod;Ltd;J)V")
    public class178(class299 arg0, class476 arg1, class382 arg2, long arg3) {
        this.field2755 = arg1;
        this.field2721 = arg3;
        this.field2754 = arg2;
        this.field2745 = this.field2755.method2877(-588750556);
        if (!arg0.method510() && this.field2745.field7828 != -1) {
            this.field2745 = class40.method275(0, this.field2745.field7828);
        }
        this.field2734 = new class150();
        this.field2733 = (int) ((double) this.field2733 + Math.random() * 64.0D);
        this.method1263(-1);
    }
}
