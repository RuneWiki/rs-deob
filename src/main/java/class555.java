import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class555 extends class328 {

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    private int field7841 = 8192;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    private int field7843 = 2048;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    private int field7840 = 4096;

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
    private int field7849 = 2048;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
    private int field7852 = 0;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
    private int field7854 = 0;

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    private int field7853 = 12288;

    @OriginalMember(owner = "client!hr", name = "R", descriptor = "Lbg;")
    public static class340 field7855 = new class340();

    @OriginalMember(owner = "client!hr", name = "T", descriptor = "I")
    public static int field7857 = -1;

    @OriginalMember(owner = "client!hr", name = "S", descriptor = "Liu;")
    public static class517 field7856 = new class517(34, -2);

    @OriginalMember(owner = "client!hr", name = "W", descriptor = "[Lak;")
    public static class50[] field7860 = new class50[100];

    @OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
    public static int field7861 = 64;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!hr", name = "U", descriptor = "Lgp;")
    public static class561 field7858;

    @OriginalMember(owner = "client!hr", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field7859;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method3108(long arg0, int arg1) {
        ++field7851;
        if ((long) arg1 < arg0 && arg0 < 6582952005840035281L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class449.field6538[(int) (-(arg0 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(III)Z")
    private final boolean method3109(int arg0, int arg1, int arg2) {
        ++field7842;
        if (arg2 != -2049) {
            this.method3110(-12, false, 27);
        }
        int var4 = (arg0 + arg1) * this.field7853 >> 12;
        int var5 = class38.field514[(var4 * 255 & 1044705) >> 12];
        int var6 = (var5 << 12) / this.field7853;
        int var7 = (var6 << 12) / this.field7841;
        int var8 = this.field7840 * var7 >> 12;
        return -arg1 + arg0 < var8 && ~(-var8) > ~(-arg1 + arg0);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field7845;
        class83.method761(true);
        if (arg0 >= -97) {
            this.field7841 = 73;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field7848;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field7841 = arg2.method1745(32132);
                                }
                            } else {
                                this.field7840 = arg2.method1745(32132);
                            }
                        } else {
                            this.field7853 = arg2.method1745(32132);
                        }
                    } else {
                        this.field7849 = arg2.method1745(32132);
                    }
                } else {
                    this.field7852 = arg2.method1745(32132);
                }
            } else {
                this.field7854 = arg2.method1745(32132);
            }
        } else {
            this.field7843 = arg2.method1745(32132);
        }
        if (arg0 < 75) {
            field7855 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZI)Z")
    private final boolean method3110(int arg0, boolean arg1, int arg2) {
        ++field7850;
        int var4 = (-arg2 + arg0) * this.field7853 >> 12;
        int var5 = class38.field514[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field7853;
        int var7 = (var6 << 12) / this.field7841;
        if (arg1) {
            return false;
        } else {
            int var8 = this.field7840 * var7 >> 12;
            return ~(arg0 + arg2) > ~var8 && arg0 + arg2 > -var8;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field7844;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = 7 / ((arg1 - 48) / 56);
        if (super.field4720.field7109) {
            int var5 = class638.field9258[arg0] + -2048;
            for (int var6 = 0; var6 < class449.field6539; ++var6) {
                int var7 = class206.field2924[var6] + -2048;
                int var8 = this.field7843 + var7;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var11 = this.field7854 + var5;
                int var12 = var11 < -2048 ? var11 + 4096 : var11;
                int var13 = ~var12 >= -2049 ? var12 : var12 + -4096;
                int var14 = var7 - -this.field7852;
                int var15 = var14 < -2048 ? var14 + 4096 : var14;
                int var16 = var15 > 2048 ? var15 + -4096 : var15;
                int var17 = var5 - -this.field7849;
                int var18 = ~var17 <= 2047 ? var17 : var17 - -4096;
                int var19 = ~var18 >= -2049 ? var18 : var18 + -4096;
                var3[var6] = !this.method3110(var13, false, var10) && !this.method3109(var19, var16, -2049) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
    public static final void method3111(boolean arg0) {
        if (arg0) {
            class277.field4051 = class245.field3546;
            class88.field1594 = class73.field1360;
        } else {
            class277.field4051 = class598.field8507;
            class88.field1594 = class587.field8363;
        }
        class146.field2246 = class277.field4051.length;
    }

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
    public static final void method3112(int arg0) {
        if (arg0 >= 121) {
            if (class565.method3216(true)) {
                if (field7859 == null) {
                    class128.method1007(1);
                }
                class217.field3276 = 0;
                class262.field3823 = true;
                try {
                    class644.field9363 = class454.field6574.getToolkit().getSystemClipboard();
                } catch (Exception var1) {
                }
            }
            ++field7846;
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
    public class555() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
    public static void method3113(int arg0) {
        field7860 = null;
        field7855 = null;
        field7858 = null;
        field7856 = null;
        field7859 = null;
        if (arg0 != 255) {
            field7855 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIBIIII[[[BIIILqa;I)V")
    public static final void method3114(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int arg8, int arg9, int arg10, class167 arg11, int arg12) {
        ++field7839;
        if (~arg0 != -1 && arg8 != 0) {
            if (arg0 == 9) {
                arg3 = arg3 - -1 & 3;
                arg0 = 1;
            }
            if (arg0 == 10) {
                arg3 = arg3 + 3 & 3;
                arg0 = 1;
            }
            if (~arg0 == -12) {
                arg0 = 8;
                arg3 = arg3 + 3 & 3;
            }
            if (arg2 > -40) {
                method3111(false);
            }
            arg11.method661(arg6, arg12, arg1, arg4, arg10, arg5, arg7[arg0 + -1][arg3], arg8, arg9);
        }
    }
}
