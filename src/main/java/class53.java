import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class53 extends class447 {

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "Z")
    private boolean field698 = false;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Z")
    public boolean field690 = false;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    private int field694 = 0;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "Lmk;")
    public class336 field696;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "Ltr;")
    public class219 field701;

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "J")
    private long field709;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "Lgg;")
    public class192 field697;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "Ltm;")
    public class354 field689;

    @OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!mq", name = "S", descriptor = "[I")
    public static int[] field719;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    private int field686;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
    private int field706;

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "I")
    private int field708;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!mq", name = "P", descriptor = "I")
    private int field716;

    @OriginalMember(owner = "client!mq", name = "Q", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!mq", name = "R", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
    public static void method307(byte arg0) {
        field719 = null;
        if (arg0 < 104) {
            field718 = -117;
        }
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V")
    public final void method308(byte arg0) {
        this.field710 = this.field701.field3323;
        this.field708 = this.field701.field3319;
        this.field706 = this.field701.field3316;
        field687++;
        this.field692 = this.field701.field3333;
        this.field704 = this.field701.field3321;
        this.field691 = this.field701.field3324;
        if (arg0 < 9) {
            return;
        }
        this.field700 = this.field701.field3331;
        this.field686 = this.field701.field3317;
        this.field705 = this.field701.field3332;
        if (this.field708 == this.field706 && this.field706 == this.field691 && this.field710 == this.field704 && this.field710 == this.field700 && this.field692 == this.field686 && this.field705 == this.field692) {
            this.field698 = true;
            return;
        }
        this.field698 = false;
        int var2 = (this.field708 + this.field691 + this.field706) / 3;
        int var3 = (this.field704 + this.field700 + this.field710) / 3;
        int var4 = (this.field686 - (-this.field705 - this.field692)) / 3;
        if (this.field703 == var2 && this.field717 == var3 && this.field685 == var4) {
            return;
        }
        this.field685 = var4;
        this.field717 = var3;
        this.field703 = var2;
        int var5 = this.field706 - this.field708;
        int var6 = this.field710 - this.field704;
        int var7 = this.field692 - this.field686;
        int var8 = this.field691 - this.field708;
        int var9 = this.field700 - this.field704;
        int var10 = this.field705 - this.field686;
        this.field699 = var7 * var8 - var5 * var10;
        this.field702 = var6 * var10 - (var7 * var9);
        this.field695 = var5 * var9 - (var6 * var8);
        while (this.field702 > 32767 || this.field699 > 32767 || this.field695 > 32767 || this.field702 < -32767 || this.field699 < -32767 || this.field695 < -32767) {
            this.field699 >>= 0x1;
            this.field695 >>= 0x1;
            this.field702 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field695 * this.field695 + (this.field702 * this.field702 + (this.field699 * this.field699))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field699 = this.field699 * 32767 / var11;
        this.field702 = this.field702 * 32767 / var11;
        this.field695 = this.field695 * 32767 / var11;
        if (this.field697.field2856 <= 0 && this.field697.field2873 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field695, (double) this.field702) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field699, Math.sqrt((double) (this.field702 * this.field702 + (this.field695 * this.field695)))) * 2607.5945876176133D);
        this.field712 = this.field697.field2856 - this.field697.field2868;
        this.field713 = this.field697.field2868 + var12 - (this.field712 >> 1);
        this.field707 = this.field697.field2873 - this.field697.field2863;
        this.field716 = this.field697.field2863 + var13 - (this.field707 >> 1);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(JZLdr;ZI)V")
    public final void method309(long arg0, boolean arg1, class261 arg2, boolean arg3, int arg4) {
        if (this.field690) {
            arg3 = false;
        } else if (class25.field325 < this.field697.field2894) {
            arg3 = false;
        } else if (class162.field2255 > class426.field6261[class25.field325]) {
            arg3 = false;
        } else if (this.field698) {
            arg3 = false;
        } else if (this.field697.field2878 != -1) {
            int var7 = (int) (arg0 - this.field709);
            if (this.field697.field2879 || var7 <= this.field697.field2878) {
                var7 %= this.field697.field2878;
            } else {
                arg3 = false;
            }
            if (!this.field697.field2895 && var7 < this.field697.field2874) {
                arg3 = false;
            }
            if (this.field697.field2895 && this.field697.field2874 <= var7) {
                arg3 = false;
            }
        }
        field688++;
        if (arg1) {
            this.method308((byte) -94);
        }
        if (arg3) {
            this.field694 += (int) ((double) arg4 * (Math.random() * (double) (this.field697.field2922 - this.field697.field2914) + (double) this.field697.field2914));
            if (this.field694 > 63) {
                int var8 = this.field694 >> 6;
                this.field694 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field697.field2856 <= 0 && this.field697.field2873 <= 0) {
                        var10 = this.field699;
                        var11 = this.field702;
                        var12 = this.field695;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field712) + this.field713;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class110.field1450[var14];
                        int var16 = class110.field1452[var14];
                        int var17 = this.field716 + ((int) ((double) this.field707 * Math.random()));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class110.field1450[var18];
                        int var20 = class110.field1452[var18];
                        var11 = var16 * var19 >> 15;
                        var12 = var15 * var19 >> 15;
                        var10 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var21 = 65535 - var21;
                        var22 = 65535 - var22;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field708 * var21 + this.field706 * var22 + (this.field691 * var23) >> 16;
                    int var25 = this.field704 * var21 + (this.field710 * var22 + (this.field700 * var23)) >> 16;
                    int var26 = this.field692 * var22 + this.field686 * var21 + (this.field705 * var23) >> 16;
                    int var27 = (int) ((double) (this.field697.field2864 - this.field697.field2859) * Math.random()) + this.field697.field2859;
                    int var28 = this.field697.field2857 + (int) ((double) (this.field697.field2911 - this.field697.field2857) * Math.random());
                    int var29 = (int) ((double) (this.field697.field2872 - this.field697.field2855) * Math.random()) + this.field697.field2855;
                    int var30;
                    if (this.field697.field2860) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field697.field2889 * var31 + (double) this.field697.field2910) | (int) ((double) this.field697.field2869 * var31 + (double) this.field697.field2851) << 16 | (int) ((double) this.field697.field2876 * var31 + (double) this.field697.field2905) << 8 | (int) ((double) this.field697.field2921 * var31 + (double) this.field697.field2902) << 24;
                    } else {
                        var30 = (int) ((double) this.field697.field2902 + (double) this.field697.field2921 * Math.random()) << 24 | (int) ((double) this.field697.field2876 * Math.random() + (double) this.field697.field2905) << 8 | (int) ((double) this.field697.field2851 + Math.random() * (double) this.field697.field2869) << 16 | (int) ((double) this.field697.field2889 * Math.random() + (double) this.field697.field2910);
                    }
                    int var33 = this.field697.field2907;
                    if (!arg2.method345() && !this.field697.field2923) {
                        var33 = -1;
                    }
                    if (class414.field6157 == class151.field2091) {
                        new class370(this, var24, var25, var26, var11, var10, var12, var27, var28, var30, var29, var33, this.field697.field2924);
                    } else {
                        class370 var34 = class6.field66[class151.field2091];
                        class151.field2091 = class151.field2091 + 1 & 0x3FF;
                        var34.method2229(this, var24, var25, var26, var11, var10, var12, var27, var28, var30, var29, var33, this.field697.field2924);
                    }
                }
            }
        }
        this.field693 = 0;
        for (class370 var36 = (class370) this.field689.method2127(-1489721243); var36 != null; var36 = (class370) this.field689.method2126(-72)) {
            var36.method2228(arg0, arg4);
            this.field693++;
        }
        class388.field5742 += this.field693;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(JI)V")
    public final void method310(long arg0, int arg1) {
        field711++;
        if (arg1 != 625974703) {
            this.method308((byte) -98);
        }
        for (class370 var4 = (class370) this.field689.method2127(-1489721243); var4 != null; var4 = (class370) this.field689.method2126(-45)) {
            var4.method2226(arg0);
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Ldr;Ltr;Lmk;J)V")
    public class53(class261 arg0, class219 arg1, class336 arg2, long arg3) {
        this.field696 = arg2;
        this.field701 = arg1;
        this.field709 = arg3;
        this.field697 = class442.method2704(false, this.field701.field3335);
        if (!arg0.method345() && this.field697.field2908 != -1) {
            this.field697 = class442.method2704(false, this.field697.field2908);
        }
        this.field689 = new class354();
        this.field694 = (int) ((double) this.field694 + Math.random() * 64.0D);
        this.method308((byte) 65);
    }

    static {
        new class151("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field719 = new int[32];
    }
}
