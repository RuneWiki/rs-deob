import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class265 extends class261 {

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    private int field4476 = 1;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    private int field4479 = 2;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "[B")
    private byte[] field4485 = new byte[512];

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    private int field4487 = 2048;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    private int field4490 = 5;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "[S")
    private short[] field4494 = new short[512];

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    private int field4483 = 0;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    private int field4492 = 5;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "[I")
    public static int[] field4477 = new int[128];

    @OriginalMember(owner = "client!re", name = "L", descriptor = "Lve;")
    public static class255 field4482 = class87.method607(115, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field4484 = 99;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field4488 = 0;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static volatile int field4491 = 0;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "[I")
    public static int[] field4495 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Lve;")
    public static class255 field4496 = class87.method607(96, "");

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILme;Lme;IIJ)V", line = 3)
    public static final void method1844(int arg0, int arg1, int arg2, int arg3, class177 arg4, class177 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class216 var10 = new class216();
        var10.field3674 = arg8;
        var10.field3662 = arg1 * 128 + 64;
        var10.field3667 = arg2 * 128 + 64;
        var10.field3665 = arg3;
        var10.field3663 = arg4;
        var10.field3668 = arg5;
        var10.field3676 = arg6;
        var10.field3673 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class118.field1984[var11][arg1][arg2] == null) {
                class118.field1984[var11][arg1][arg2] = new class249(var11, arg1, arg2);
            }
        }
        class118.field1984[arg0][arg1][arg2].field4192 = var10;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 33)
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpb;BI)V", line = 55)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field4492 = this.field4490 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field4483 = arg0.method481(0);
        } else if (arg2 == 2) {
            this.field4487 = arg0.method423(255);
        } else if (arg2 == 3) {
            this.field4479 = arg0.method481(0);
        } else if (arg2 == 4) {
            this.field4476 = arg0.method481(0);
        } else if (arg2 == 5) {
            this.field4492 = arg0.method481(0);
        } else if (arg2 == 6) {
            this.field4490 = arg0.method481(0);
        }
        field4489++;
        if (arg1 >= -115) {
            this.method21((byte) -19, -48);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I", line = 114)
    public static final int method1845(int arg0, int arg1) {
        if (arg1 != -1274626424) {
            field4477 = (int[]) null;
        }
        field4481++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 148)
    public static void method1846(int arg0) {
        field4477 = null;
        field4495 = null;
        field4496 = null;
        if (arg0 != 326807948) {
            field4484 = 45;
        }
        field4482 = null;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V", line = 167)
    public static final void method1847(boolean arg0) {
        class186.field2998 = 0;
        class255.field4318.field1068 = 0;
        class313.field5299 = -1;
        class136.field2272 = 0;
        class30.field494 = -1;
        class160.field2692.field1068 = 0;
        if (!arg0) {
            field4488 = -61;
        }
        class282.field4861 = 0;
        class235.field3866 = -1;
        class125.field2084 = 0;
        class113.field1918 = 0;
        field4478++;
        class103.field1738 = 0;
        class75.field1230 = -1;
        class156.field2651 = false;
        for (int var1 = 0; var1 < class151.field2555.length; var1++) {
            if (class151.field2555[var1] != null) {
                class151.field2555[var1].field5137 = -1;
            }
        }
        for (int var2 = 0; var2 < class82.field1334.length; var2++) {
            if (class82.field1334[var2] != null) {
                class82.field1334[var2].field5137 = -1;
            }
        }
        class70.method453(111);
        class3.field50 = 1;
        class256.method1798(-108, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class187.field3008[var3] = true;
        }
        class136.method1023(7498);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)[I", line = 233)
    public final int[] method21(byte arg0, int arg1) {
        int var3 = -103 / ((-arg0 - 49) / 33);
        field4493++;
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int var5 = (class20.field324[arg1] * this.field4490) + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; var8 < class92.field1576; var8++) {
                class218.field3695 = Integer.MAX_VALUE;
                class275.field4734 = Integer.MAX_VALUE;
                class101.field1703 = Integer.MAX_VALUE;
                class112.field1901 = Integer.MAX_VALUE;
                int var9 = class245.field4120[var8] * this.field4492 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 - 1; var12 <= var7; var12++) {
                    int var13 = this.field4485[(var12 >= this.field4490 ? var12 - this.field4490 : var12) & 0xFF] & 0xFF;
                    for (int var14 = var10 - 1; var14 <= var11; var14++) {
                        int var15 = (this.field4485[(var14 >= this.field4492 ? var14 - this.field4492 : var14) + var13 & 0xFF] & 0xFF) * 2;
                        int var28 = var15 + 1;
                        int var16 = var9 - this.field4494[var15] - (var14 << 12);
                        int var17 = var5 - (var12 << 12) - this.field4494[var28];
                        int var18 = this.field4476;
                        int var19;
                        if (var18 == 1) {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        } else if (var18 == 3) {
                            int var20 = var17 < 0 ? -var17 : var17;
                            int var21 = var16 >= 0 ? var16 : -var16;
                            var19 = var20 < var21 ? var21 : var20;
                        } else if (var18 == 4) {
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var25 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                            int var26 = var24 + var25;
                            var19 = var26 * var26 >> 12;
                        } else if (var18 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var17 * var17;
                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var18 == 2) {
                            var19 = (var17 >= 0 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class112.field1901 > var19) {
                            class218.field3695 = class275.field4734;
                            class275.field4734 = class101.field1703;
                            class101.field1703 = class112.field1901;
                            class112.field1901 = var19;
                        } else if (class101.field1703 > var19) {
                            class218.field3695 = class275.field4734;
                            class275.field4734 = class101.field1703;
                            class101.field1703 = var19;
                        } else if (class275.field4734 > var19) {
                            class218.field3695 = class275.field4734;
                            class275.field4734 = var19;
                        } else if (class218.field3695 > var19) {
                            class218.field3695 = var19;
                        }
                    }
                }
                int var27 = this.field4479;
                if (var27 == 0) {
                    var4[var8] = class112.field1901;
                } else if (var27 == 1) {
                    var4[var8] = class101.field1703;
                } else if (var27 == 3) {
                    var4[var8] = class275.field4734;
                } else if (var27 == 4) {
                    var4[var8] = class218.field3695;
                } else if (var27 == 2) {
                    var4[var8] = class101.field1703 - class112.field1901;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(B)V", line = 461)
    public final void method111(byte arg0) {
        this.field4485 = class251.method1721((byte) -105, this.field4483);
        field4480++;
        if (arg0 != -57) {
            this.field4476 = -102;
        }
        this.method1848(8455);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V", line = 481)
    private final void method1848(int arg0) {
        if (arg0 != 8455) {
            return;
        }
        field4486++;
        Random var2 = new Random((long) this.field4483);
        this.field4494 = new short[512];
        if (this.field4487 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4494[var3] = (short) class212.method1522(var2, this.field4487, (byte) 108);
            }
        }
    }
}
