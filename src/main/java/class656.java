import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class656 extends class573 {

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    private int field9424 = 3072;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    private int field9432 = 1024;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    private int field9435 = 2048;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Lsb;")
    public static class266 field9433 = new class266(78, 3);

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "[Lgfa;")
    public static class697[] field9427;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field9434;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (arg0 > -116) {
            this.field9432 = 69;
        }
        if (super.field8320.field3295) {
            int[][] var4 = this.method3293(0, 126, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class540.field7555; ++var11) {
                var8[var11] = this.field9432 - -(var5[var11] * this.field9435 >> 12);
                var9[var11] = this.field9432 - -(var6[var11] * this.field9435 >> 12);
                var10[var11] = (var7[var11] * this.field9435 >> 12) + this.field9432;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class656() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field8334 = ~arg0.method732(-559537960) == -2;
                }
            } else {
                this.field9424 = arg0.method723((byte) -25);
            }
        } else {
            this.field9432 = arg0.method723((byte) -25);
        }
        ++field9428;
        if (arg2 != 3) {
            this.method442(105, 118);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field9431;
        int[] var3 = super.field8321.method3164(arg0, -128);
        if (arg1 != 1) {
            method3734(true);
        }
        if (super.field8321.field7825) {
            int[] var4 = this.method3292(0, 0, arg0);
            for (int var5 = 0; ~var5 > ~class540.field7555; ++var5) {
                var3[var5] = (var4[var5] * this.field9435 >> 12) + this.field9432;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z[IIILus;I)Ldea;")
    public static final class225 method3731(boolean arg0, int[] arg1, int arg2, int arg3, class1 arg4, int arg5) {
        ++field9425;
        if (arg2 != 34037) {
            return null;
        } else if (!arg4.field350 && (!class141.method1144(0, arg5) || !class141.method1144(arg2 + -34037, arg3))) {
            return !arg4.field259 ? new class225(arg4, arg5, arg3, class455.method2740(-1675135295, arg5), class455.method2740(arg2 + -1675169332, arg3), arg1) : new class225(arg4, 34037, arg5, arg3, arg0, arg1);
        } else {
            return new class225(arg4, 3553, arg5, arg3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)I")
    public static final int method3732(byte arg0, int arg1, int arg2) {
        ++field9426;
        int var3 = arg1 >>> 31;
        int var4 = -18 % ((24 - arg0) / 57);
        return (arg1 + var3) / arg2 + -var3;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public static final void method3733(byte arg0) {
        if (class636.field9176 == null) {
            class636.field9176 = class310.method2025((byte) 69);
            class30.field938 = class636.field9176[0];
            class540.field7550 = class525.method3074((byte) -101);
        }
        ++field9423;
        if (class119.field2122 == null) {
            class680.method3825((byte) 66);
        }
        int var1 = 42 % ((arg0 - 24) / 49);
        class310 var2 = class30.field938;
        int var3 = class75.method805(false);
        if (class30.field938 == var2) {
            class150.field2575 = class30.field938.field4595.method1733(255, class140.field2466);
            if (class30.field938.field4601) {
                class457.field6512 = (-class30.field938.field4591 + class30.field938.field4598) * var3 / 100 + class30.field938.field4591;
            }
            if (class30.field938.field4593) {
                class150.field2575 = class150.field2575 + class457.field6512 + "%";
            }
        } else if (class310.field4623 == class30.field938) {
            class119.field2122 = null;
            class118.method1038(3, 1);
        } else {
            class150.field2575 = var2.field4602.method1733(255, class140.field2466);
            class457.field6512 = var2.field4598;
            if (class30.field938.field4593) {
                class150.field2575 = class150.field2575 + var2.field4598 + "%";
            }
            if (class30.field938.field4601 || var2.field4601) {
                class540.field7550 = class525.method3074((byte) -101);
            }
        }
        if (class119.field2122 != null) {
            class119.field2122.method1875(class30.field938, -22010, class457.field6512, class150.field2575, class540.field7550);
            if (class495.field7061 != null) {
                for (int var4 = class29.field934 + 1; var4 < class495.field7061.length; ++var4) {
                    if (~class495.field7061[var4].method1767(-4979) <= -101 && var4 + -1 == class29.field934 && ~class199.field3098 <= -2 && class119.field2122.method1873((byte) -74)) {
                        try {
                            class495.field7061[var4].method1766(32363);
                        } catch (Exception var5) {
                            class495.field7061 = null;
                            return;
                        }
                        class119.field2122.method1874(-23547, class495.field7061[var4]);
                        ++class29.field934;
                        if (class29.field934 >= class495.field7061.length + -1 && class495.field7061.length > 1) {
                            class29.field934 = !class444.field6401.method3003(true) ? -1 : 0;
                        }
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method3734(boolean arg0) {
        field9433 = null;
        field9427 = null;
        if (arg0) {
            method3733((byte) 60);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field9429;
        this.field9435 = -this.field9432 + this.field9424;
        if (arg0 != 4095) {
            this.method443((class61) null, 27, 46);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3735(String arg0, String arg1, String arg2, int arg3) {
        ++field9422;
        int var4 = arg1.indexOf(arg2);
        if (arg3 != 1163) {
            return null;
        } else {
            while (var4 != -1) {
                arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(arg2.length() + var4);
                var4 = arg1.indexOf(arg2, arg0.length() + var4);
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method3736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9430;
        if (arg0 >= -24) {
            return false;
        } else {
            for (int var6 = arg5; ~var6 >= ~arg1; ++var6) {
                for (int var7 = arg3; arg4 >= var7; ++var7) {
                    if (class198.field3080[var6][var7] == arg2 && class388.field5670[var6][var7] <= 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
