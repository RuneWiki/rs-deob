import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class466 {

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "[[Z")
    public static boolean[][] field6938 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "[I")
    public static int[] field6937 = new int[14];

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Lrl;")
    public static class672 field6940 = new class672(76, 7);

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "F")
    public static float field6946;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZ)Z", line = 4)
    public static final boolean method2901(int arg0, int arg1, boolean arg2) {
        field6934++;
        if (!class453.field6808) {
            return false;
        }
        if (!arg2) {
            method2906(11, -25, 42, (byte) -99, -126, 80, 47, -37, -20, -40);
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class564.field8105[var3] == null || class564.field8105[var3][var4] == null) {
            return false;
        }
        class665 var5 = class564.field8105[var3][var4];
        if (arg0 == -1 && var5.field9309 == 0) {
            for (class295 var6 = (class295) class307.field4831.method3465((byte) -29); var6 != null; var6 = (class295) class307.field4831.method3469(0)) {
                if (var6.field4631 == 5 || var6.field4631 == 1006 || var6.field4631 == 58 || var6.field4631 == 12 || var6.field4631 == 57) {
                    for (class665 var7 = class326.method2197(false, var6.field4620); var7 != null; var7 = class140.method1196(-71, var7)) {
                        if (var5.field9400 == var7.field9400) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class295 var8 = (class295) class307.field4831.method3465((byte) -57); var8 != null; var8 = (class295) class307.field4831.method3469(0)) {
                if (var8.field4628 == arg0 && var5.field9400 == var8.field4620 && (var8.field4631 == 5 || var8.field4631 == 1006 || var8.field4631 == 58 || var8.field4631 == 12 || var8.field4631 == 57)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBC)I", line = 82)
    public static final int method2902(int arg0, byte arg1, char arg2) {
        if (arg1 <= 73) {
            return -28;
        }
        field6941++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V", line = 102)
    public static void method2903(boolean arg0) {
        field6938 = null;
        if (arg0) {
            method2904((byte) 9);
        }
        field6937 = null;
        field6940 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 114)
    public static final void method2904(byte arg0) {
        field6943++;
        class11.field183.method442(-201);
        int var1 = 95 / ((-arg0 - 37) / 59);
        for (int var2 = 0; var2 < 32; var2++) {
            class426.field6471[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class485.field7106[var3] = 0L;
        }
        class607.field8624 = 0;
    }

    @OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;", line = 139)
    public final String toString() {
        field6942++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 148)
    public static final void method2905(int arg0) {
        class246.field3928 = null;
        class487.field7143 = null;
        class234.field3719 = null;
        class573.field8183 = null;
        if (arg0 != 0) {
            return;
        }
        class329.field5095 = null;
        class65.field834 = null;
        class350.field5591 = null;
        class597.field8469 = null;
        class262.field4278 = null;
        class706.field9991 = null;
        class220.field3579 = null;
        class575.field8195 = null;
        class545.field7932 = null;
        class672.field9480 = null;
        class330.field5109 = null;
        class56.field733 = null;
        field6935++;
        class70.field888 = null;
        class149.field2479 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIBIIIIII)V", line = 178)
    public static final void method2906(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6939++;
        if (arg6 < 512 || arg5 < 512 || (class275.field4426 * 512 - 1024) < arg6 || arg5 > (class417.field6374 * 512 - 1024)) {
            class321.field5031[0] = class321.field5031[1] = -1;
        } else if (arg3 == -29) {
            int var10 = class202.method1568(arg6, arg2, arg5, 2) - arg9;
            class183.field3093.method505(arg8, 0, 0);
            class627.field8857.method346(class183.field3093);
            class627.field8857.method292(arg6, var10, arg5, class321.field5031);
            class183.field3093.method505(-arg8, 0, 0);
            class627.field8857.method346(class183.field3093);
        }
    }
}
