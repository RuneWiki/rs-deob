import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class381 extends class573 {

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "[I")
    public static int[] field5633 = new int[8];

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "[F")
    public static float[] field5637 = new float[4];

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "Lbc;")
    public static class337 field5641;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[Lf;")
    public static class702[] field5638;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field5636;
        int[] var3 = super.field8321.method3164(arg0, arg1 + -116);
        if (arg1 != 1) {
            field5633 = null;
        }
        if (super.field8321.field7825) {
            int[] var4 = this.method3292(0, 0, arg0);
            for (int var5 = 0; ~var5 > ~class540.field7555; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
    public static void method2372(byte arg0) {
        if (arg0 >= -102) {
            method2373(-67, 86, 104);
        }
        field5638 = null;
        field5633 = null;
        field5637 = null;
        field5641 = null;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)Z")
    public static final boolean method2373(int arg0, int arg1, int arg2) {
        if (arg2 != 3164) {
            field5637 = null;
        }
        ++field5634;
        return ~(arg1 & 16) != -1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Low;Z)I")
    public static final int method2374(class319 arg0, boolean arg1) {
        ++field5631;
        if (arg1) {
            return -60;
        } else if (class435.field6296 != arg0) {
            if (class20.field843 == arg0) {
                return 34167;
            } else if (class661.field9521 != arg0) {
                if (class370.field5487 == arg0) {
                    return 34166;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 34168;
            }
        } else {
            return 5890;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field5639;
        if (arg0 > -116) {
            return null;
        } else {
            int[][] var3 = super.field8320.method1504(arg1, -2);
            if (super.field8320.field3295) {
                int[][] var4 = this.method3293(0, 127, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class540.field7555 > var11; ++var11) {
                    var8[var11] = 4096 - var5[var11];
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field5635;
        if (arg2 == 3) {
            if (~arg1 == -1) {
                super.field8334 = arg0.method732(-559537960) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)Lwf;")
    public static final class121 method2375(int arg0, int arg1) {
        ++field5632;
        class121 var2 = (class121) class523.field7396.method1900((long) arg0, 76);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class517.field7302.method2216(arg1, arg0, true);
            class121 var4 = new class121();
            if (var3 != null) {
                var4.method1051((byte) 107, new class61(var3));
            }
            var4.method1055(-1);
            class523.field7396.method1904(var4, (long) arg0, -1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class381() {
        super(1, false);
    }
}
