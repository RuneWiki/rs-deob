import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class693 {

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
    private int[] field9370;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Ldh;")
    public static class322 field9368;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Ldb;")
    public static class324 field9372;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method3871(int arg0) {
        if (arg0 > -39) {
            return;
        }
        field9367++;
        if (!class197.method1405((byte) 106)) {
            return;
        }
        if (class23.field723 == null) {
            class407.method2533(2);
        }
        class445.field6326 = 0;
        class124.field2129 = true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 != 3) {
            return;
        }
        if (arg2 == arg4 && arg3 == arg7 && arg1 == arg6 && arg5 == arg9) {
            class501.method2951(arg2, (byte) 73, arg0, arg7, arg9, arg6);
        } else {
            int var10 = arg2;
            int var11 = arg7;
            int var12 = arg2 * 3;
            int var13 = arg7 * 3;
            int var14 = arg4 * 3;
            int var15 = arg3 * 3;
            int var16 = arg1 * 3;
            int var17 = arg5 * 3;
            int var18 = arg6 + var14 - arg2 - var16;
            int var19 = var15 + arg9 - var17 - arg7;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg2 + (var27 - (-var29 - var31) >> 12);
                int var34 = arg7 + (var28 + var32 + var30 >> 12);
                class501.method2951(var10, (byte) 109, arg0, var11, var34, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        field9373++;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([I)V")
    public class693(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field9370 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field9370[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field9370[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field9370[var5 + var5] = arg0[var4];
            this.field9370[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I")
    public final int method3873(int arg0, int arg1) {
        field9369++;
        if (arg0 != 1) {
            this.method3873(-74, 111);
        }
        int var3 = (this.field9370.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field9370[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9370[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method3874(boolean arg0) {
        field9372 = null;
        field9368 = null;
        if (!arg0) {
            method3876(46);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLdb;)Ljava/lang/String;")
    public static final String method3875(byte arg0, class324 arg1) {
        field9371++;
        int var2 = 9 / ((79 - arg0) / 46);
        if (arg1.field4492 == null || arg1.field4492.length() == 0) {
            return arg1.field4498 == null || arg1.field4498.length() <= 0 ? arg1.field4490 : arg1.field4490 + class497.field6923.method2936(class607.field8336, 544) + arg1.field4498;
        } else if (arg1.field4498 == null || arg1.field4498.length() <= 0) {
            return arg1.field4490 + class497.field6923.method2936(class607.field8336, 544) + arg1.field4492;
        } else {
            return arg1.field4490 + class497.field6923.method2936(class607.field8336, 544) + arg1.field4498 + class497.field6923.method2936(class607.field8336, 544) + arg1.field4492;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static final void method3876(int arg0) {
        class425.field6121.method999(0);
        field9374++;
        if (arg0 != -1) {
            field9368 = null;
        }
    }
}
