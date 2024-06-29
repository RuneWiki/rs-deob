import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class176 extends class400 {

    @OriginalMember(owner = "client!pha", name = "D", descriptor = "Lcea;")
    public class227 field2776;

    @OriginalMember(owner = "client!pha", name = "H", descriptor = "S")
    private short field2780;

    @OriginalMember(owner = "client!pha", name = "E", descriptor = "S")
    private short field2777;

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "S")
    private short field2772;

    @OriginalMember(owner = "client!pha", name = "A", descriptor = "S")
    private short field2773;

    @OriginalMember(owner = "client!pha", name = "C", descriptor = "S")
    private short field2775;

    @OriginalMember(owner = "client!pha", name = "B", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!pha", name = "G", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!pha", name = "F", descriptor = "S")
    private short field2778;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(JI)V")
    public final void method1330(long arg0, int arg1) {
        this.field2780 = (short) (this.field2780 - arg1);
        if (this.field2780 <= 0) {
            this.method1332();
        } else {
            int var4 = super.field5516 >> 12;
            int var5 = super.field5514 >> 12;
            int var6 = super.field5509 >> 12;
            class788 var7 = this.field2776.field3306;
            class506 var8 = this.field2776.field3298;
            if (var8.field6945 != 0) {
                if (this.field2777 - this.field2780 <= var8.field6932) {
                    int var9 = var8.field6934 * arg1 + (super.field5517 >> 8 & 65280) + (this.field2779 >> 16 & 255);
                    int var10 = var8.field6923 * arg1 + (this.field2779 >> 8 & 255) + (super.field5517 & 65280);
                    int var11 = var8.field6927 * arg1 + (super.field5517 << 8 & 65280) + (this.field2779 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field5517 &= -16777216;
                    super.field5517 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2779 &= -16777216;
                    this.field2779 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2777 - this.field2780 <= var8.field6960) {
                    int var12 = var8.field6920 * arg1 + (super.field5517 >> 16 & 65280) + (this.field2779 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5517 &= 16777215;
                    super.field5517 |= (var12 & 65280) << 16;
                    this.field2779 &= 16777215;
                    this.field2779 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6939 != -1 && this.field2777 - this.field2780 <= var8.field6902) {
                this.field2774 += var8.field6924 * arg1;
            }
            if (var8.field6917 != -1 && this.field2777 - this.field2780 <= var8.field6949) {
                super.field5518 += var8.field6914 * arg1;
            }
            double var13 = (double) this.field2772;
            double var15 = (double) this.field2773;
            double var17 = (double) this.field2775;
            boolean var19 = false;
            if (var8.field6930 == 1) {
                int var20 = var4 - this.field2776.field3308.field2742;
                int var21 = var5 - this.field2776.field3308.field2745;
                int var22 = var6 - this.field2776.field3308.field2747;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field6895 * var23 * arg1);
                this.field2774 = (int) ((long) this.field2774 - ((long) this.field2774 * var24 >> 18));
            } else if (var8.field6930 == 2) {
                int var26 = var4 - this.field2776.field3308.field2742;
                int var27 = var5 - this.field2776.field3308.field2745;
                int var28 = var6 - this.field2776.field3308.field2747;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field6895 * var29 * arg1);
                this.field2774 = (int) ((long) this.field2774 - ((long) this.field2774 * var30 >> 28));
            }
            if (var8.field6954 != null) {
                class154 var32 = var7.field10813.field8920;
                for (class154 var33 = var32.field2524; var32 != var33; var33 = var33.field2524) {
                    class566 var34 = (class566) var33;
                    class395 var35 = var34.field8011;
                    if (var35.field5450 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field6954.length; ++var37) {
                            if (var8.field6954[var37] == var35.field5456) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8007);
                            double var40 = (double) (var5 - var34.field8008);
                            double var42 = (double) (var6 - var34.field8010);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field5458)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8009 * var42 + (double) var34.field8006 * var38 + (double) var35.field5449 * var40) * 65535.0D / ((double) var35.field5454 * var46);
                                if (!(var48 < (double) var35.field5461)) {
                                    double var50 = 0.0D;
                                    if (var35.field5462 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field5445;
                                    } else if (var35.field5462 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field5445;
                                    }
                                    if (var35.field5446 == 0) {
                                        if (var35.field5460 == 0) {
                                            var13 += ((double) var34.field8006 - var50) * (double) arg1;
                                            var15 += ((double) var35.field5449 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8009 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field5516 = (int) ((double) super.field5516 + ((double) var34.field8006 - var50) * (double) arg1);
                                            super.field5514 = (int) ((double) super.field5514 + ((double) var35.field5449 - var50) * (double) arg1);
                                            super.field5509 = (int) ((double) super.field5509 + ((double) var34.field8009 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field5454;
                                        double var54 = var40 / var46 * (double) var35.field5454;
                                        double var56 = var42 / var46 * (double) var35.field5454;
                                        if (var35.field5460 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field5516 = (int) ((double) super.field5516 + (double) arg1 * var52);
                                            super.field5514 = (int) ((double) super.field5514 + (double) arg1 * var54);
                                            super.field5509 = (int) ((double) super.field5509 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6941 != null) {
                for (int var58 = 0; var58 < var8.field6941.length; ++var58) {
                    class566 var59 = (class566) class381.field5182.method3536(-3, (long) var8.field6941[var58]);
                    while (var59 != null) {
                        class395 var60 = var59.field8011;
                        double var61 = (double) (var4 - var59.field8007);
                        double var63 = (double) (var5 - var59.field8008);
                        double var65 = (double) (var6 - var59.field8010);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field5458) {
                            var59 = (class566) class381.field5182.method3541(121);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8009 * var65 + (double) var59.field8006 * var61 + (double) var60.field5449 * var63) * 65535.0D / ((double) var60.field5454 * var69);
                            if (var71 < (double) var60.field5461) {
                                var59 = (class566) class381.field5182.method3541(108);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field5462 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field5445;
                                } else if (var60.field5462 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field5445;
                                }
                                if (var60.field5446 == 0) {
                                    if (var60.field5460 == 0) {
                                        var13 += ((double) var59.field8006 - var73) * (double) arg1;
                                        var15 += ((double) var60.field5449 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8009 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field5516 = (int) ((double) super.field5516 + ((double) var59.field8006 - var73) * (double) arg1);
                                        super.field5514 = (int) ((double) super.field5514 + ((double) var60.field5449 - var73) * (double) arg1);
                                        super.field5509 = (int) ((double) super.field5509 + ((double) var59.field8009 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field5454;
                                    double var77 = var63 / var69 * (double) var60.field5454;
                                    double var79 = var65 / var69 * (double) var60.field5454;
                                    if (var60.field5460 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field5516 = (int) ((double) super.field5516 + (double) arg1 * var75);
                                        super.field5514 = (int) ((double) super.field5514 + (double) arg1 * var77);
                                        super.field5509 = (int) ((double) super.field5509 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class566) class381.field5182.method3541(91);
                            }
                        }
                    }
                }
            }
            if (var8.field6915 != null) {
                if (var8.field6891 == null) {
                    var8.field6891 = new int[var8.field6915.length];
                    for (int var81 = 0; var81 < var8.field6915.length; ++var81) {
                        class336.method2104(var8.field6915[var81], false);
                        var8.field6891[var81] = ((class345) class87.field1195.method337((long) var8.field6915[var81], 1)).field4640;
                    }
                }
                for (int var82 = 0; var82 < var8.field6891.length; ++var82) {
                    class395 var83 = class530.field7186[var8.field6891[var82]];
                    if (var83.field5460 == 0) {
                        var13 += (double) (var83.field5464 * arg1);
                        var15 += (double) (var83.field5449 * arg1);
                        var17 += (double) (var83.field5453 * arg1);
                        var19 = true;
                    } else {
                        super.field5516 += var83.field5464 * arg1;
                        super.field5514 += var83.field5449 * arg1;
                        super.field5509 += var83.field5453 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field2772 = (short) ((int) var13);
                        this.field2773 = (short) ((int) var15);
                        this.field2775 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field2774 <<= 1;
                }
            }
            super.field5516 = (int) ((long) super.field5516 + ((long) (this.field2774 << 2) * (long) this.field2772 >> 23) * (long) arg1);
            super.field5514 = (int) ((long) super.field5514 + ((long) (this.field2774 << 2) * (long) this.field2773 >> 23) * (long) arg1);
            super.field5509 = (int) ((long) super.field5509 + ((long) (this.field2774 << 2) * (long) this.field2775 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lha;J)V")
    public final void method1331(class66 arg0, long arg1) {
        int var4 = super.field5516 >> class654.field9055 + 12;
        int var5 = super.field5509 >> class654.field9055 + 12;
        int var6 = super.field5514 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class441.field5980 && var5 >= 0 && var5 < class375.field5083) {
            class788 var7 = this.field2776.field3306;
            class506 var8 = this.field2776.field3298;
            class296[] var9 = class745.field10286;
            int var10 = var7.field10816;
            class549 var11 = class325.field4448[var7.field10816][var4][var5];
            if (var11 != null) {
                var10 = var11.field7459;
            }
            int var12 = var9[var10].method1897((byte) -34, var5, var4);
            int var13;
            if (var10 < class62.field856 - 1) {
                var13 = var9[var10 + 1].method1897((byte) -34, var5, var4);
            } else {
                var13 = var12 - (8 << class654.field9055);
            }
            if (var8.field6961) {
                if (var8.field6943 == -1 && var6 > var12) {
                    this.method1332();
                    return;
                }
                if (var8.field6943 >= 0 && var6 > var9[var8.field6943].method1897((byte) -34, var5, var4)) {
                    this.method1332();
                    return;
                }
                if (var8.field6926 == -1 && var6 < var13) {
                    this.method1332();
                    return;
                }
                if (var8.field6926 >= 0 && var6 < var9[var8.field6926 + 1].method1897((byte) -34, var5, var4)) {
                    this.method1332();
                    return;
                }
            }
            int var14;
            for (var14 = class62.field856 - 1; var14 > 0 && var6 > var9[var14].method1897((byte) -34, var5, var4); --var14) {
            }
            if (var8.field6905 && var14 == 0 && var6 > var9[0].method1897((byte) -34, var5, var4)) {
                this.method1332();
            } else if (class62.field856 - 1 == var14 && var9[var14].method1897((byte) -34, var5, var4) - var6 > 8 << class654.field9055) {
                this.method1332();
            } else {
                class549 var15 = class325.field4448[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class325.field4448[0][var4][var5] == null) {
                        var15 = class325.field4448[0][var4][var5] = new class549(0);
                    }
                    boolean var16 = class325.field4448[0][var4][var5].field7465 != null;
                    if (var14 == 3 && var16) {
                        this.method1332();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class325.field4448[var17][var4][var5] == null) {
                            var15 = class325.field4448[var17][var4][var5] = new class549(var17);
                            if (var16) {
                                ++var15.field7459;
                            }
                        }
                    }
                }
                if (var8.field6950) {
                    int var18 = super.field5516 >> 12;
                    int var19 = super.field5509 >> 12;
                    if (var15.field7462 != null) {
                        class435 var20 = var15.field7462.method894(arg0, (byte) -88);
                        if (var20 != null && var20.method2545(var19, -30876, var6, var18)) {
                            this.method1332();
                            return;
                        }
                    }
                    if (var15.field7463 != null) {
                        class435 var21 = var15.field7463.method894(arg0, (byte) -58);
                        if (var21 != null && var21.method2545(var19, -30876, var6, var18)) {
                            this.method1332();
                            return;
                        }
                    }
                    if (var15.field7471 != null) {
                        class435 var22 = var15.field7471.method894(arg0, (byte) -127);
                        if (var22 != null && var22.method2545(var19, -30876, var6, var18)) {
                            this.method1332();
                            return;
                        }
                    }
                    for (class58 var23 = var15.field7466; var23 != null; var23 = var23.field811) {
                        class435 var24 = var23.field815.method894(arg0, (byte) -54);
                        if (var24 != null && var24.method2545(var19, -30876, var6, var18)) {
                            this.method1332();
                            return;
                        }
                    }
                }
                var7.field10815.field5985.method3851(13246, this);
            }
        } else {
            this.method1332();
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "()V")
    public final void method1332() {
        this.field2776.field3306.field10806[this.field2778] = null;
        class425.field5810[class315.field4313] = this;
        class315.field4313 = class315.field4313 + 1 & 1023;
        this.method731((byte) 39);
        this.method2987(122);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lcea;IIIIIIIIIIIZZ)V")
    public final void method1333(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2776 = arg0;
        super.field5516 = arg1 << 12;
        super.field5514 = arg2 << 12;
        super.field5509 = arg3 << 12;
        super.field5517 = arg9;
        this.field2777 = this.field2780 = (short) arg8;
        super.field5518 = arg10;
        super.field5511 = arg11;
        super.field5519 = arg13;
        this.field2772 = (short) arg4;
        this.field2773 = (short) arg5;
        this.field2775 = (short) arg6;
        this.field2774 = arg7;
        super.field5513 = this.field2776.field3297.field8705;
        this.method1334();
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "()V")
    private final void method1334() {
        int var1 = this.field2776.field3306.field10808;
        if (this.field2776.field3306.field10806[var1] != null) {
            this.field2776.field3306.field10806[var1].method1332();
        }
        this.field2776.field3306.field10806[var1] = this;
        this.field2778 = (short) this.field2776.field3306.field10808;
        this.field2776.field3306.field10808 = var1 + 1 & 8191;
        this.field2776.field3301.method1600(this, -3);
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lcea;IIIIIIIIIIIZZ)V")
    public class176(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2776 = arg0;
        super.field5516 = arg1 << 12;
        super.field5514 = arg2 << 12;
        super.field5509 = arg3 << 12;
        super.field5517 = arg9;
        this.field2777 = this.field2780 = (short) arg8;
        super.field5518 = arg10;
        super.field5511 = arg11;
        super.field5519 = arg13;
        this.field2772 = (short) arg4;
        this.field2773 = (short) arg5;
        this.field2775 = (short) arg6;
        this.field2774 = arg7;
        super.field5513 = this.field2776.field3297.field8705;
        this.method1334();
    }
}
