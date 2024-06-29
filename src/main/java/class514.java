import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class514 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[Loga;")
    public static class502[] field7038 = new class502[4];

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Ljw;")
    public static class581 field7041 = new class581(15, -1);

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[F")
    public static float[] field7043 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field7042 = new int[6];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lvr;")
    public static class147[] field7044;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lor;BLha;II)V", line = 4)
    public static final void method2987(class668 arg0, byte arg1, class65 arg2, int arg3, int arg4) {
        field7040++;
        byte var5 = 63;
        if (arg1 != -33) {
            method2987(null, (byte) -78, null, -83, -14);
        }
        byte var6 = 7;
        for (int var7 = 63; var7 >= 0; var7--) {
            class679.method3753(true, false, true);
            int var8 = var5 & 0x7F | (var7 & 0x3F) << 10 | (var6 & 0x7) << 7;
            int var9 = class145.field2069[var8];
            class182.method1269(true, -11692, false);
            arg2.method563(arg4, ((63 - var7) * arg0.field9297 >> 6) + arg3, arg0.field9282, (arg0.field9297 >> 6) + 1, var9, 0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 34)
    public static void method2988(byte arg0) {
        field7041 = null;
        field7038 = null;
        field7043 = null;
        field7044 = null;
        if (arg0 != 116) {
            field7043 = null;
        }
        field7042 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)I", line = 48)
    public static final int method2989(byte arg0, int arg1, int arg2) {
        field7039++;
        if (arg1 == 1 || arg1 == 3) {
            return class518.field7068[arg2 & 0x3];
        } else {
            int var3 = -3 % ((arg0 - 15) / 48);
            return class778.field10686[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIILha;Loba;IIIIIZ)V", line = 68)
    public static final void method2990(int arg0, int arg1, int arg2, int arg3, class65 arg4, class275 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field7037++;
        if (arg6 > arg8 && arg6 < arg0 + arg8 && arg2 > (arg1 - 13) && (arg1 + 3) > arg2 && arg5.field4081) {
            arg9 = arg7;
        }
        int[] var12 = null;
        if (class403.method2514((byte) 6, arg5.field4080)) {
            var12 = class770.field10602.method2467(-86, (int) arg5.field4079).field4663;
        } else if (arg5.field4085 != -1) {
            var12 = class770.field10602.method2467(-111, arg5.field4085).field4663;
        } else if (class18.method146(arg5.field4080, -13)) {
            class174 var15 = (class174) class234.field3169.method3953((long) ((int) arg5.field4079), 14);
            if (var15 != null) {
                class192 var16 = var15.field2336;
                class220 var17 = var16.field2577;
                if (var17.field2995 != null) {
                    var17 = var17.method1449(class382.field5602, -1);
                }
                if (var17 != null) {
                    var12 = var17.field2938;
                }
            }
        } else if (class33.method236(arg5.field4080, -1)) {
            Object var13 = null;
            class589 var14;
            if (arg5.field4080 == 1008) {
                var14 = class350.field5132.method3732((byte) 41, (int) arg5.field4079);
            } else {
                var14 = class350.field5132.method3732((byte) 58, (int) (arg5.field4079 >>> 32 & 0x7FFFFFFFL));
            }
            if (var14.field7865 != null) {
                var14 = var14.method3290(1, class382.field5602);
            }
            if (var14 != null) {
                var12 = var14.field7850;
            }
        }
        String var18 = class383.method2440(arg5, false);
        if (var12 != null) {
            var18 = var18 + class94.method754((byte) 115, var12);
        }
        if (!arg11) {
            method2987(null, (byte) 20, null, -55, 68);
        }
        class251.field3716.method580(0, arg9, arg1, class630.field8819, class688.field9677, arg8 + 3, var18, 0);
        if (arg5.field4074) {
            class337.field4884.method1102(arg8 + class548.field7413.method1696(var18, 0) + 5, arg1 + -12);
        }
    }
}
