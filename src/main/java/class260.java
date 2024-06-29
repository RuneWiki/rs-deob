import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class260 extends class183 {

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    private int field3539 = 0;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Z")
    private boolean field3552 = false;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Z")
    public boolean field3536 = false;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Ldp;")
    public class174 field3537;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "J")
    private long field3528;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lmd;")
    public class357 field3529;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "Lhi;")
    public class353 field3565;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Lum;")
    public class184 field3553;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3548 = "Face here";

    @OriginalMember(owner = "client!l", name = "I", descriptor = "S")
    public static short field3551 = 205;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field3566 = new String[200];

    @OriginalMember(owner = "client!l", name = "r", descriptor = "F")
    public static float field3534;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    private int field3527;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    private int field3540;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    private int field3542;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    private int field3544;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    private int field3546;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    private int field3555;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    private int field3564;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 11)
    public static final void method1452(int arg0, int arg1) {
        field3560++;
        class40 var2 = class162.method872(arg1, (byte) 92, 10);
        if (arg0 == -7825) {
            var2.method193(-75);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)V", line = 30)
    public final void method1453(int arg0, long arg1) {
        for (class4 var4 = (class4) this.field3553.method986((byte) -109); var4 != null; var4 = (class4) this.field3553.method984((byte) 126)) {
            var4.method19(arg1);
        }
        if (arg0 <= -119) {
            field3541++;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 54)
    public static void method1454(int arg0) {
        field3566 = null;
        if (arg0 != 32767) {
            field3551 = -109;
        }
        field3548 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ltq;I)V", line = 74)
    public static final void method1455(class250 arg0, int arg1) {
        for (int var2 = 0; var2 < class303.field4119; var2++) {
            int var3 = arg0.method1383(255);
            int var4 = arg0.method1374(-2);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class193.field2437[var3] != null) {
                class193.field2437[var3].field3482 = var4;
            }
        }
        field3532++;
        if (arg1 != -25160) {
            field3562 = -56;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lvm;Lmd;Ldp;J)V", line = 394)
    public class260(class322 arg0, class357 arg1, class174 arg2, long arg3) {
        this.field3537 = arg2;
        this.field3528 = arg3;
        this.field3529 = arg1;
        this.field3565 = class440.method2728(0, this.field3529.field5060);
        if (!arg0.method1625() && this.field3565.field4970 != -1) {
            this.field3565 = class440.method2728(0, this.field3565.field4970);
        }
        this.field3553 = new class184();
        this.field3539 = (int) ((double) this.field3539 + Math.random() * 64.0D);
        this.method1457((byte) -22);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BJIZLvm;)V", line = 122)
    public final void method1456(byte arg0, long arg1, int arg2, boolean arg3, class322 arg4) {
        if (this.field3536) {
            arg3 = false;
        } else if (class235.field3247 < this.field3565.field4992) {
            arg3 = false;
        } else if (class227.field3111[class235.field3247] < class205.field2770) {
            arg3 = false;
        } else if (this.field3552) {
            arg3 = false;
        } else if (this.field3565.field4997 != -1) {
            int var7 = (int) (arg1 - this.field3528);
            if (this.field3565.field5002 || var7 <= this.field3565.field4997) {
                var7 %= this.field3565.field4997;
            } else {
                arg3 = false;
            }
            if (!this.field3565.field4995 && this.field3565.field4981 > var7) {
                arg3 = false;
            }
            if (this.field3565.field4995 && var7 >= this.field3565.field4981) {
                arg3 = false;
            }
        }
        field3535++;
        if (arg3) {
            this.field3539 += (int) ((double) arg2 * ((double) this.field3565.field4994 + Math.random() * (double) (this.field3565.field4946 - this.field3565.field4994)));
            if (this.field3539 > 63) {
                int var8 = this.field3539 >> 6;
                this.field3539 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3565.field5000 <= 0 && this.field3565.field4953 <= 0) {
                        var10 = this.field3527;
                        var11 = this.field3533;
                        var12 = this.field3549;
                    } else {
                        int var13 = this.field3540 + (int) ((double) this.field3559 * Math.random());
                        int var14 = var13 & 0x3FFF;
                        int var15 = class356.field5037[var14];
                        int var16 = class356.field5025[var14];
                        int var17 = this.field3555 + ((int) (Math.random() * (double) this.field3547));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class356.field5037[var18];
                        int var20 = class356.field5025[var18];
                        var11 = var16 * var19 >> 15;
                        var10 = var15 * var19 >> 15;
                        var12 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field3563 * var21 + this.field3543 * var22 + (this.field3558 * var23) >> 16;
                    int var25 = this.field3538 * var21 + this.field3564 * var22 + this.field3545 * var23 >> 16;
                    int var26 = this.field3546 * var22 + this.field3544 * var21 + this.field3542 * var23 >> 16;
                    int var27 = (int) ((double) (this.field3565.field4999 - this.field3565.field5003) * Math.random()) + this.field3565.field5003;
                    int var28 = (int) (Math.random() * (double) (this.field3565.field4966 - this.field3565.field4936)) + this.field3565.field4936;
                    int var29 = (int) ((double) (this.field3565.field4987 - this.field3565.field4963) * Math.random()) + this.field3565.field4963;
                    int var30;
                    if (this.field3565.field4989) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field3565.field4937 * var31 + (double) this.field3565.field4971) << 24 | (int) ((double) this.field3565.field4943 * var31 + (double) this.field3565.field4947) << 8 | (int) ((double) this.field3565.field4959 * var31 + (double) this.field3565.field4961) << 16 | (int) ((double) this.field3565.field4942 * var31 + (double) this.field3565.field4979);
                    } else {
                        var30 = (int) (Math.random() * (double) this.field3565.field4937 + (double) this.field3565.field4971) << 24 | (int) (Math.random() * (double) this.field3565.field4943 + (double) this.field3565.field4947) << 8 | (int) ((double) this.field3565.field4959 * Math.random() + (double) this.field3565.field4961) << 16 | (int) ((double) this.field3565.field4979 + Math.random() * (double) this.field3565.field4942);
                    }
                    int var33 = this.field3565.field4941;
                    if (!arg4.method1625() && !this.field3565.field4954) {
                        var33 = -1;
                    }
                    if (class243.field3317 == class149.field1901) {
                        new class4(this, var24, var25, var26, var11, var12, var10, var27, var28, var30, var29, var33, this.field3565.field4945);
                    } else {
                        class4 var35 = class149.field1890[class243.field3317];
                        class243.field3317 = class243.field3317 + 1 & 0x3FF;
                        var35.method18(this, var24, var25, var26, var11, var12, var10, var27, var28, var30, var29, var33, this.field3565.field4945);
                    }
                }
            }
        }
        this.field3530 = 0;
        int var36 = -28 % ((1 - arg0) / 35);
        for (class4 var37 = (class4) this.field3553.method986((byte) 92); var37 != null; var37 = (class4) this.field3553.method984((byte) 123)) {
            var37.method17(arg1, arg2);
            this.field3530++;
        }
        field3531 += this.field3530;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 282)
    public final void method1457(byte arg0) {
        field3556++;
        if (arg0 != -22) {
            this.field3561 = -108;
        }
        this.field3563 = this.field3529.field5054;
        this.field3544 = this.field3529.field5041;
        this.field3564 = this.field3529.field5049;
        this.field3545 = this.field3529.field5053;
        this.field3546 = this.field3529.field5051;
        this.field3542 = this.field3529.field5045;
        this.field3558 = this.field3529.field5044;
        this.field3543 = this.field3529.field5059;
        this.field3538 = this.field3529.field5046;
        if (this.field3563 == this.field3543 && this.field3558 == this.field3543 && this.field3564 == this.field3538 && this.field3564 == this.field3545 && this.field3546 == this.field3544 && this.field3546 == this.field3542) {
            this.field3552 = true;
            return;
        }
        this.field3552 = false;
        int var2 = (this.field3563 + this.field3558 + this.field3543) / 3;
        int var3 = (this.field3564 + this.field3538 + this.field3545) / 3;
        int var4 = (this.field3546 + this.field3544 + this.field3542) / 3;
        if (this.field3550 == var2 && this.field3557 == var3 && this.field3561 == var4) {
            return;
        }
        this.field3561 = var4;
        this.field3557 = var3;
        this.field3550 = var2;
        int var5 = this.field3543 - this.field3563;
        int var6 = this.field3564 - this.field3538;
        int var7 = this.field3546 - this.field3544;
        int var8 = this.field3558 - this.field3563;
        int var9 = this.field3545 - this.field3538;
        int var10 = this.field3542 - this.field3544;
        this.field3533 = var6 * var10 - var7 * var9;
        this.field3527 = var5 * var9 - var6 * var8;
        this.field3549 = var7 * var8 - (var5 * var10);
        while (this.field3533 > 32767 || this.field3549 > 32767 || this.field3527 > 32767 || this.field3533 < -32767 || this.field3549 < -32767 || this.field3527 < -32767) {
            this.field3549 >>= 0x1;
            this.field3527 >>= 0x1;
            this.field3533 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field3533 * this.field3533 + this.field3549 * this.field3549 + this.field3527 * this.field3527));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field3533 = this.field3533 * 32767 / var11;
        this.field3527 = this.field3527 * 32767 / var11;
        this.field3549 = this.field3549 * 32767 / var11;
        if (this.field3565.field5000 <= 0 && this.field3565.field4953 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field3527, (double) this.field3533) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field3549, Math.sqrt((double) (this.field3533 * this.field3533 + this.field3527 * this.field3527))) * 2607.5945876176133D);
        this.field3559 = this.field3565.field5000 - this.field3565.field4958;
        this.field3547 = this.field3565.field4953 - this.field3565.field4998;
        this.field3540 = this.field3565.field4958 + var12 - (this.field3559 >> 1);
        this.field3555 = var13 + this.field3565.field4998 - (this.field3547 >> 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V", line = 374)
    public static final void method1458(int arg0, int arg1, int arg2) {
        if (arg1 != 11904) {
            field3566 = null;
        }
        class162.field2073 = new class114(arg0);
        field3554++;
        class321.field4295 = new class114(arg2);
    }
}
