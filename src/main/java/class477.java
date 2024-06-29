import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class477 {

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field6943 = 1;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field6951 = 0;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field6940 = -1;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field6952 = 0;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "[I")
    public static int[] field6950 = new int[256];

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "[I")
    public static int[] field6944 = new int[2];

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Z")
    public static boolean field6949 = false;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "F")
    public static float field6946;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "[Lo;")
    public static class24[] field6942;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)V")
    public static final void method2820(int arg0, int arg1) {
        class473.field6895 = -1;
        if (arg0 != 3) {
            method2820(94, 75);
        }
        class94.field1501 = -1;
        class70.field1149 = arg1;
        field6948++;
        class521.method3091((byte) 70);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[FIFIIIIII)V")
    public static final void method2821(int arg0, float[] arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg5 - arg8;
        int var11 = arg6 - arg7;
        field6945++;
        int var12 = arg9 - arg0;
        float var13 = arg1[2] * (float) var10 + arg1[0] * (float) var12 + arg1[1] * (float) var11;
        float var14 = arg1[5] * (float) var10 + arg1[arg4] * (float) var11 + arg1[3] * (float) var12;
        float var15 = arg1[8] * (float) var10 + arg1[7] * (float) var11 + arg1[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg3 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg2 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg2 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg2 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class471.field6847 = var17;
        class330.field4896 = var18;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IJ)V")
    public static final void method2822(int arg0, long arg1) {
        class276.field4124.field7558 = 0;
        field6939++;
        class276.field4124.method3048(-2034159384, class195.field2845.field19);
        class276.field4124.method3014(arg1, -2);
        class276.field4124.method3048(-2034159384, class503.field7255);
        class77.field1269 = 0;
        class513.field7457 = -3;
        if (arg0 != -17585) {
            field6946 = -0.84768665F;
        }
        class211.field3189 = 0;
        class329.field4840 = 1;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public static void method2823(byte arg0) {
        field6942 = null;
        field6944 = null;
        field6950 = null;
        if (arg0 != -26) {
            method2820(50, 21);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZII)I")
    public static final int method2824(boolean arg0, int arg1, int arg2) {
        field6947++;
        if (arg2 == 4 || arg2 == 5) {
            return class231.field3467[arg1 & 0x3];
        } else {
            if (!arg0) {
                field6946 = 0.22895755F;
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2825(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class300.field4468 = 0L;
        if (arg2 != 3) {
            method2822(48, 8L);
        }
        field6941++;
        int var5 = class360.method2235(arg2 + 32394);
        if (arg3 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class76.field1256.method220()) {
            arg4 = true;
        }
        class224.method1513(var5, arg3, arg0, arg1, false, arg4);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(JI)V")
    public static final void method2826(long arg0, int arg1) {
        field6953++;
        if (arg0 <= (long) arg1) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class470.method2784(-1, arg0 - 1L);
            class470.method2784(-1, 1L);
        } else {
            class470.method2784(-1, arg0);
        }
    }
}
