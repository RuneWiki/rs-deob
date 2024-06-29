import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class250 extends class325 {

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    private int field3696 = 4096;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "[I")
    private int[] field3700 = new int[3];

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    private int field3707 = 3216;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    private int field3701 = 3216;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lsw;")
    public static class787 field3704 = new class787(1);

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field3708 = 0;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 6)
    public static final boolean method1676(String arg0, int arg1) {
        ++field3699;
        if (arg1 != 4096) {
            method1680(47, -9, -93, -43, 118, -126, -83);
        }
        return class587.field7824.containsKey(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljp;IB)V", line = 22)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field3697;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3707 = arg0.method2359(-1);
                }
            } else {
                this.field3701 = arg0.method2359(-1);
            }
        } else {
            this.field3696 = arg0.method2359(-1);
        }
        if (arg2 >= -41) {
            method1679((class376) null, -76);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 320)
    public class250() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I", line = 75)
    public final int[] method100(byte arg0, int arg1) {
        if (arg0 < 21) {
            return null;
        } else {
            ++field3706;
            int[] var3 = super.field4727.method2603(arg1, -13476);
            if (super.field4727.field6067) {
                int var4 = class27.field409 * this.field3696 >> 12;
                int[] var5 = this.method2062(class566.field7574 & arg1 + -1, 0, (byte) 33);
                int[] var6 = this.method2062(arg1, 0, (byte) 33);
                int[] var7 = this.method2062(class566.field7574 & arg1 - -1, 0, (byte) 33);
                for (int var8 = 0; ~var8 > ~class261.field3874; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class625.field8423] - var6[var8 + 1 & class625.field8423]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class438.field6168[((var12 - -1) * var12 >> 1) + var11];
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field3700[2] * var14 >> 12;
                    int var18 = this.field3700[1] * var16 >> 12;
                    int var19 = this.field3700[0] * var15 >> 12;
                    var3[var8] = var18 - -var17 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V", line = 147)
    public static final void method1677(int arg0, int arg1) {
        if (arg0 != 200) {
            method1679((class376) null, 104);
        }
        if (arg1 != 37) {
            if (~arg1 != -51) {
                if (~arg1 != -76) {
                    if (arg1 != 100) {
                        if (arg1 == 200) {
                            class375.field5422 = 16.0F;
                        }
                    } else {
                        class375.field5422 = 8.0F;
                    }
                } else {
                    class375.field5422 = 6.0F;
                }
            } else {
                class375.field5422 = 4.0F;
            }
        } else {
            class375.field5422 = 3.0F;
        }
        ++field3698;
        class232.field3167 = -1;
        class232.field3167 = -1;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V", line = 183)
    private final void method1678(byte arg0) {
        ++field3703;
        double var2 = Math.cos((double) ((float) this.field3707 / 4096.0F));
        this.field3700[0] = (int) (Math.sin((double) ((float) this.field3701 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 != -13) {
            method1680(45, 93, 32, 115, -71, -52, -97);
        }
        this.field3700[1] = (int) (var2 * Math.cos((double) ((float) this.field3701 / 4096.0F)) * 4096.0D);
        this.field3700[2] = (int) (Math.sin((double) ((float) this.field3707 / 4096.0F)) * 4096.0D);
        int var4 = this.field3700[0] * this.field3700[0] >> 12;
        int var5 = this.field3700[1] * this.field3700[1] >> 12;
        int var6 = this.field3700[2] * this.field3700[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field3700[0] = (this.field3700[0] << 12) / var7;
            this.field3700[2] = (this.field3700[2] << 12) / var7;
            this.field3700[1] = (this.field3700[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 214)
    public final void method101(boolean arg0) {
        ++field3702;
        this.method1678((byte) -13);
        if (!arg0) {
            this.method95((class376) null, -111, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljp;I)Lmo;", line = 225)
    public static final class780 method1679(class376 arg0, int arg1) {
        ++field3705;
        int var2 = arg0.method2359(-1);
        class564 var3 = class706.method3954(113)[arg0.method2398(-1372747256)];
        class631 var4 = class709.method3970(-1)[arg0.method2398(-1372747256)];
        int var5 = arg0.method2355(3);
        if (arg1 >= -42) {
            return null;
        } else {
            int var6 = arg0.method2355(3);
            return new class780(var2, var3, var4, var5, var6);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V", line = 249)
    public static final void method1680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 == -15768) {
            if (arg4 != 8 && arg4 != 16) {
                class243 var7 = class626.field8501[arg1][arg5][arg2];
                if (var7 == null) {
                    var7 = new class243(arg1);
                }
                if (~arg4 == -2) {
                    var7.field3273 = (short) arg3;
                    var7.field3271 = (short) arg0;
                } else if (~arg4 == -3) {
                    var7.field3279 = (short) arg3;
                    var7.field3276 = (short) arg0;
                }
                if (class226.field3097) {
                    class610.method3376(1);
                }
            } else if (~arg4 == -9) {
                int var8 = arg5 << class26.field388;
                int var9 = var8 - -class48.field722;
                int var10 = arg2 << class26.field388;
                int var11 = var10 - -class48.field722;
                int var12 = class412.field5933[arg1].method1880(arg5, false, arg2);
                int var13 = class412.field5933[arg1].method1880(arg5 + 1, false, arg2 - -1);
                class537.field7312[class743.field10262++] = new class723(arg4, arg1, var8, var9, var9, var8, var12, var13, -arg0 + var13, -arg0 + var12, var10, var11, var11, var10);
            } else {
                int var14 = (arg5 << class26.field388) + class48.field722;
                int var15 = -class48.field722 + var14;
                int var16 = arg2 << class26.field388;
                int var17 = class48.field722 + var16;
                int var18 = class412.field5933[arg1].method1880(arg5 + 1, false, arg2);
                int var19 = class412.field5933[arg1].method1880(arg5, false, arg2 + 1);
                class537.field7312[class743.field10262++] = new class723(arg4, arg1, var14, var15, var15, var14, var18, var19, var19 - arg0, -arg0 + var18, var16, var17, var17, var16);
            }
            ++field3710;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 331)
    public static void method1681(int arg0) {
        field3704 = null;
        if (arg0 != -636) {
            field3709 = 115;
        }
    }
}
