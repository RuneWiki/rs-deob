import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class736 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field10368 = 0;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[I")
    public static int[] field10371 = new int[5];

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lcb;")
    public static class631 field10370 = new class631(44, 8);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field10367;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZII)V", line = 5)
    public static final void method4105(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        field10366++;
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class289.field4446 - class550.field7844) * var6 / 100 + class550.field7844;
        if (class73.field1098 > var7) {
            var7 = class73.field1098;
        } else if (class49.field811 < var7) {
            var7 = class49.field811;
        }
        int var8 = arg5 * var7 * 512 / (arg4 * 334);
        if (class105.field1545 > var8) {
            short var9 = class105.field1545;
            var7 = arg4 * var9 * 334 / (arg5 * 512);
            if (var7 > class49.field811) {
                var7 = class49.field811;
                int var10 = var7 * 512 * arg5 / (var9 * 334);
                int var11 = (arg4 - var10) / 2;
                if (arg3) {
                    class364.field5573.method374();
                    class364.field5573.method3183(var11, arg5, -16777216, arg0, 92, arg2);
                    class364.field5573.method3183(var11, arg5, -16777216, arg0, -108, arg2 + arg4 - var11);
                }
                arg4 -= var11 * 2;
                arg2 += var11;
            }
        } else if (class1.field6 < var8) {
            short var12 = class1.field6;
            var7 = var12 * 334 * arg4 / (arg5 * 512);
            if (var7 < class73.field1098) {
                var7 = class73.field1098;
                int var13 = var12 * 334 * arg4 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg3) {
                    class364.field5573.method374();
                    class364.field5573.method3183(arg4, var14, -16777216, arg0, arg1 ^ 0x1B, arg2);
                    class364.field5573.method3183(arg4, var14, -16777216, arg0 + arg5 - var14, 3, arg2);
                }
                arg0 += var14;
                arg5 -= var14 * 2;
            }
        }
        class463.field6749 = arg0;
        class103.field1535 = (short) arg4;
        if (arg1 != 8) {
            field10370 = null;
        }
        class705.field9955 = arg2;
        class79.field1160 = arg5 * var7 / 334;
        class67.field1054 = (short) arg5;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 101)
    public static void method4106(boolean arg0) {
        field10370 = null;
        if (!arg0) {
            field10371 = null;
        }
        field10371 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V", line = 115)
    public static final void method4107(int arg0, int arg1, int arg2) {
        boolean var3 = class488.field7062[0][arg1][arg2] != null && class488.field7062[0][arg1][arg2].field1776 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class488.field7062[var4][arg1][arg2] == null) {
                class114 var5 = class488.field7062[var4][arg1][arg2] = new class114(var4);
                if (var3) {
                    var5.field1766++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILha;)V", line = 139)
    public static final void method4108(int arg0, int arg1, class544 arg2) {
        field10369++;
        if (!class432.field6336 || !class199.field3402) {
            class644.field9188 = 0;
            return;
        }
        if (arg1 != 24997) {
            method4110((byte) 3, -120, -45, -65, null, false);
        }
        if (class273.field4183) {
            class60.field941 = class289.field4442.method815(false);
        }
        class685.field9683 = 0;
        class331.field4876 = 0;
        class200.field3412 = 0;
        int[] var3 = arg2.method217();
        class330.field4872 = (int) ((float) var3[3] / 3.0F);
        class247.field3961 = (int) ((float) var3[2] / 3.0F);
        arg2.method280(class129.field2116);
        if ((int) ((float) class129.field2116[0] / 3.0F) != class124.field1907 || (int) ((float) class129.field2116[1] / 3.0F) != class753.field10491) {
            class124.field1907 = (int) ((float) class129.field2116[0] / 3.0F);
            class753.field10491 = (int) ((float) class129.field2116[1] / 3.0F);
            class117.field1804 = new int[class753.field10491 * class124.field1907];
            class378.field5682 = class124.field1907 >> 1;
            class324.field4787 = class753.field10491 >> 1;
        }
        class410.field6048 = arg2.method236();
        class644.field9188 = 0;
        for (int var4 = 0; var4 < class757.field10543; var4++) {
            class593.method3396((byte) -89, arg2, arg0, class478.field6940[var4]);
        }
        for (int var5 = 0; var5 < class19.field199; var5++) {
            class593.method3396((byte) -126, arg2, arg0, class666.field9463[var5]);
        }
        for (int var6 = 0; var6 < class304.field4624; var6++) {
            class593.method3396((byte) -73, arg2, arg0, class258.field4045[var6]);
        }
        class699.field9884 = 0;
        if (class644.field9188 > 0) {
            int var7 = class117.field1804.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class117.field1804[var9++] = Integer.MAX_VALUE;
                class117.field1804[var9++] = Integer.MAX_VALUE;
                class117.field1804[var9++] = Integer.MAX_VALUE;
                class117.field1804[var9++] = Integer.MAX_VALUE;
                class117.field1804[var9++] = Integer.MAX_VALUE;
                class117.field1804[var9++] = Integer.MAX_VALUE;
                class117.field1804[var9++] = Integer.MAX_VALUE;
                class117.field1804[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class117.field1804[var9++] = Integer.MAX_VALUE;
            }
            class445.field6456 = 1;
            for (int var10 = 0; var10 < class644.field9188; var10++) {
                class328 var11 = class573.field8132[var10];
                class641.method3623(var11.field4841[0], var11.field4841[1], var11.field4840[0], -13509, var11.field4841[3], var11.field4829[3], var11.field4840[3], var11.field4829[1], var11.field4829[0], var11.field4840[1]);
                class641.method3623(var11.field4841[1], var11.field4841[2], var11.field4840[1], -13509, var11.field4841[3], var11.field4829[3], var11.field4840[3], var11.field4829[2], var11.field4829[1], var11.field4840[2]);
            }
            class445.field6456 = 2;
        }
        if (class273.field4183) {
            class494.field7157 = class289.field4442.method815(false) - class60.field941;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lka;IILkn;II)V", line = 247)
    public static final void method4109(class282 arg0, int arg1, int arg2, class516 arg3, int arg4, int arg5) {
        field10365++;
        if (arg0 != null) {
            if (arg1 != -8631) {
                field10370 = null;
            }
            arg3.method3085(arg0.method1008(), arg0.method1005(), arg4, (byte) 59, arg0.method1033(), arg0.method1003(), arg2, arg0.method1024(), arg5, arg0.method996(), arg0.method999());
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BIIILla;Z)V", line = 261)
    public static final void method4110(byte arg0, int arg1, int arg2, int arg3, class422 arg4, boolean arg5) {
        field10367++;
        if (arg0 > -7) {
            method4107(-3, 104, -76);
        }
        class680.method3796(-96, arg3, arg4, 0L, arg1, arg2, arg5);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLeg;)Leg;")
    public abstract class317 method3039(byte arg0, class317 arg1);
}
