import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class333 extends class40 {

    @OriginalMember(owner = "client!po", name = "M", descriptor = "Z")
    private boolean field4834 = true;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "Z")
    private boolean field4838 = true;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "Z")
    public static boolean field4837 = false;

    @OriginalMember(owner = "client!po", name = "S", descriptor = "[I")
    public static int[] field4840 = new int[50];

    @OriginalMember(owner = "client!po", name = "K", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!po", name = "R", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!po", name = "T", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!po", name = "U", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!po", name = "V", descriptor = "Ltj;")
    public static class108 field4843;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V", line = 6)
    public static void method2182(int arg0) {
        field4843 = null;
        field4840 = null;
        if (arg0 != 16594) {
            field4837 = false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)[I", line = 20)
    public final int[] method44(byte arg0, int arg1) {
        ++field4839;
        if (arg0 >= -20) {
            this.method44((byte) 111, -55);
        }
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int[] var4 = this.method266((byte) -116, this.field4834 ? -arg1 + class169.field2395 : arg1, 0);
            if (this.field4838) {
                for (int var5 = 0; ~class410.field5886 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class84.field1067];
                }
            } else {
                class271.method1856(var4, 0, var3, 0, class410.field5886);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 59)
    public class333() {
        super(1, false);
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V", line = 63)
    public static final void method2183(int arg0) {
        class72.field944 = -1;
        class259.field3833 = 0;
        class218.field3132 = -1;
        if (arg0 > -57) {
            field4837 = true;
        }
        ++field4832;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IILlf;)V", line = 76)
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field550 = ~arg2.method837(true) == -2;
                }
            } else {
                this.field4834 = ~arg2.method837(true) == -2;
            }
        } else {
            this.field4838 = arg2.method837(true) == 1;
        }
        if (arg1 < 79) {
            method2182(89);
        }
        ++field4836;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;)I", line = 122)
    public static final int method2184(int arg0, String arg1) {
        ++field4841;
        if (arg0 != -1) {
            method2184(-127, (String) null);
        }
        return class127.method768(arg1, true, (byte) 59, 10);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)[[I", line = 134)
    public final int[][] method112(int arg0, int arg1) {
        ++field4835;
        if (arg0 != 1) {
            field4843 = null;
        }
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int[][] var4 = this.method261(0, arg0 + 28551, this.field4834 ? -arg1 + class169.field2395 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4838) {
                for (int var11 = 0; class410.field5886 > var11; ++var11) {
                    var8[var11] = var5[class84.field1067 - var11];
                    var9[var11] = var6[-var11 + class84.field1067];
                    var10[var11] = var7[class84.field1067 - var11];
                }
            } else {
                for (int var12 = 0; class410.field5886 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIIIII)V", line = 212)
    public static final void method2185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4833;
        if (arg5 >= 1 && arg1 >= 1 && ~arg5 >= ~(class80.field1034 + -2) && class381.field5414 + -2 >= arg1) {
            if (!class296.method2000((byte) -83) && !class173.method1232(arg6, arg1, arg5, 120, class40.field558)) {
                return;
            }
            if (class385.field5449 == null) {
                return;
            }
            int var9 = arg6;
            if (~arg6 > -4 && class183.method1317(-28499, arg1, arg5)) {
                var9 = arg6 + 1;
            }
            class63.method406(-1, class85.field1090[arg6], var9, arg8, class59.field786, arg5, arg6, arg1);
            if (~arg3 <= -1) {
                boolean var10 = class247.field3703;
                class247.field3703 = true;
                class3.method7(arg0, arg3, class85.field1090[arg6], arg1, false, arg5, arg2, arg6, 120, class59.field786, arg7, false, var9);
                class247.field3703 = var10;
            }
        }
        int var11 = -50 % ((arg4 - -14) / 33);
    }
}
