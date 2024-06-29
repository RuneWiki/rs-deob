import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class451 {

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "[[Z")
    public static boolean[][] field6178 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "Lju;")
    public static class137 field6175 = new class137(9, 2);

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "[Lcn;")
    public static class543[] field6179;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILuv;)V", line = 5)
    public static final void method2612(int arg0, int arg1, class385 arg2) {
        field6177++;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field5254 > class440.field5977) {
            class476.method2730(1957, arg2);
        } else if (arg2.field5269 < class440.field5977) {
            class650.method3641((byte) -110, false, arg2);
            var4 = class93.field1431;
            var3 = client.field4357;
        } else {
            class567.method3273(119, arg2);
        }
        if (arg2.field7396 < 512 || arg2.field7398 < 512 || class483.field6515 * 512 - 512 <= arg2.field7396 || arg2.field7398 >= class65.field926 * 512 - 512) {
            arg2.field5254 = 0;
            arg2.field5230 = -1;
            arg2.field5214 = null;
            arg2.field5269 = 0;
            var3 = -1;
            var4 = 0;
            arg2.field7396 = arg2.field5304[0] * 512 + (arg2.method2342((byte) -125) * 256);
            arg2.field7398 = arg2.field5308[0] * 512 + (arg2.method2342((byte) -46) * 256);
            arg2.method2333(7);
            for (int var5 = 0; var5 < arg2.field5234.length; var5++) {
                arg2.field5234[var5].field6324 = -1;
            }
        }
        if (arg0 < 20) {
            field6175 = null;
        }
        if (class235.field3379 == arg2 && (arg2.field7396 < 6144 || arg2.field7398 < 6144 || arg2.field7396 >= ((class483.field6515 - 12) * 512) || (class65.field926 - 12) * 512 <= arg2.field7398)) {
            var4 = 0;
            var3 = -1;
            arg2.field5269 = 0;
            arg2.field5230 = -1;
            arg2.field5214 = null;
            arg2.field5254 = 0;
            arg2.field7396 = arg2.field5304[0] * 512 + (arg2.method2342((byte) 92) * 256);
            arg2.field7398 = arg2.field5308[0] * 512 + (arg2.method2342((byte) -29) * 256);
            arg2.method2333(7);
            for (int var6 = 0; var6 < arg2.field5234.length; var6++) {
                arg2.field5234[var6].field6324 = -1;
            }
        }
        int var7 = class790.method4312(arg2, false);
        class479.method2744(arg2, false);
        class179.method1353((byte) -110, var4, var3, arg2, var7);
        class579.method3335(arg2, var3, 124);
        class566.method3270(arg2, 0);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 113)
    public static void method2613(int arg0) {
        field6179 = null;
        field6175 = null;
        if (arg0 > -12) {
            method2612(68, -111, null);
        }
        field6178 = null;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "()V", line = 129)
    public static final void method2614() {
        byte var0 = 10;
        byte var1 = 30;
        if (class35.field576 == 0 || class82.field1137 == null) {
            return;
        }
        class112.field2107.method580(class429.field5857);
        for (int var2 = 0; var2 < class324.field4438.length; var2++) {
            class112.field2107.method526(class720.field9895[var2] + class324.field4438[var2], class429.field5857[3] - class429.field5857[1], -256, class429.field5857[1], 1);
        }
        for (int var3 = 0; var3 < class682.field9500; var3++) {
            class616 var11 = class339.field4581[var3];
            class112.field2107.method490(var11.field8581[0], var11.field8583[0], var11.field8588[0], class455.field6208);
            class112.field2107.method490(var11.field8581[1], var11.field8583[1], var11.field8588[1], class383.field5197);
            class112.field2107.method490(var11.field8581[2], var11.field8583[2], var11.field8588[2], class681.field9490);
            class112.field2107.method490(var11.field8581[3], var11.field8583[3], var11.field8588[3], class270.field3787);
            if (class455.field6208[2] != -1 && class383.field5197[2] != -1 && class681.field9490[2] != -1 && class270.field3787[2] != -1) {
                int var12 = -65536;
                if (var11.field8578 == 4) {
                    var12 = -16776961;
                }
                class112.field2107.method510(class383.field5197[1], class383.field5197[0], class455.field6208[1], class455.field6208[0], 65, var12);
                class112.field2107.method510(class681.field9490[1], class681.field9490[0], class383.field5197[1], class383.field5197[0], 121, var12);
                class112.field2107.method510(class270.field3787[1], class270.field3787[0], class681.field9490[1], class681.field9490[0], 87, var12);
                class112.field2107.method510(class455.field6208[1], class455.field6208[0], class270.field3787[1], class270.field3787[0], 44, var12);
                class112.field2107.method510(class681.field9490[1], class681.field9490[0], class455.field6208[1], class455.field6208[0], 107, var12);
            }
        }
        class82.field1137.method598(var1 + 45, -256, -16777216, "Dynamic: " + class171.field2726 + "/" + 5000, var0, (byte) -19);
        class82.field1137.method598(var1 + 60, -256, -16777216, "Total Opaque Onscreen: " + class590.field8308 + "/" + 10000, var0, (byte) -19);
        class82.field1137.method598(var1 + 75, -256, -16777216, "Total Trans Onscreen: " + class28.field530 + "/" + 5000, var0, (byte) -19);
        class82.field1137.method598(var1 + 90, -256, -16777216, "Occluders: " + (class3.field39 + class250.field3524) + " Active: " + class682.field9500, var0, (byte) -19);
        class82.field1137.method598(var1 + 105, -256, -16777216, "Occluded: Ground:" + class137.field2345 + " Walls: " + class640.field8802 + " CPs: " + class608.field8485 + " Pixels: " + class22.field461, var0, (byte) -19);
        class82.field1137.method598(var1 + 120, -256, -16777216, "Occlude Calc Took: " + class452.field6182 / 1000L + "us", var0, (byte) -19);
        if (class35.field576 != 2 || class336.field4533 == null) {
            return;
        }
        for (int var4 = 0; var4 < class336.field4533.length; var4++) {
            float var6 = (float) class336.field4533[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class336.field4533[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class604 var5 = class112.field2107.method495(0, class679.field9453, class336.field4533, class322.field4421, class679.field9453, true);
        var5.method215(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILlu;III)Ljava/awt/Frame;", line = 219)
    public static final Frame method2615(int arg0, int arg1, class742 arg2, int arg3, int arg4, int arg5) {
        field6176++;
        if (!arg2.method4113((byte) -128)) {
            return null;
        }
        if (arg5 == 0) {
            class277[] var6 = class422.method2498(arg2, (byte) -21);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3832 == arg0 && var6[var8].field3831 == arg4 && (arg1 == 0 || var6[var8].field3840 == arg1) && (!var7 || arg5 < var6[var8].field3842)) {
                    var7 = true;
                    arg5 = var6[var8].field3842;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class545 var9 = arg2.method4110(-12658, arg5, arg1, arg4, arg0);
        int var10 = 124 % ((-arg3 - 41) / 54);
        while (var9.field7412 == 0) {
            class643.method3577(10L, 0);
        }
        Frame var11 = (Frame) var9.field7416;
        if (var11 == null) {
            return null;
        } else if (var9.field7412 == 2) {
            class315.method1989(1, var11, arg2);
            return null;
        } else {
            return var11;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(CI)Z", line = 293)
    public static final boolean method2616(char arg0, int arg1) {
        if (arg1 == -21343) {
            field6180++;
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } else {
            return false;
        }
    }
}
