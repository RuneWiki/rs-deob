import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class166 extends class81 {

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field2932;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Lpj;")
    public static class237 field2935 = class33.method353("Okay", 118);

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[Z")
    public static boolean[] field2941 = new boolean[100];

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[Loc;")
    public static class60[] field2942 = new class60[50];

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lwh;")
    public static class189 field2937;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2938++;
        if (arg4 != -58) {
            return;
        }
        if (class47.method434(0, arg0)) {
            class179.field3157 = null;
            class118.method857(arg5, arg2, arg6, arg7, class22.field406[arg0], arg8, arg3, -24008, -1, arg1);
            if (class179.field3157 != null) {
                class118.method857(arg5, arg2, class244.field4276, arg7, class179.field3157, arg8, class208.field3556, arg4 - 23950, -1412584499, arg1);
                class179.field3157 = null;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                field2941[var9] = true;
            }
        } else {
            field2941[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1160(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field2934++;
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class166() {
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lgj;")
    public static final class225 method1161(byte arg0) {
        field2939++;
        int var1 = class175.field3063[0] * class174.field3060[0];
        byte[] var2 = class127.field2221[0];
        int var3 = 37 % ((-arg0 - 16) / 39);
        class225 var6;
        if (class124.field2184[0]) {
            byte[] var7 = class69.field1364[0];
            int[] var8 = new int[var1];
            for (int var9 = 0; var9 < var1; var9++) {
                var8[var9] = class34.method362(class272.method1817(255, var7[var9]) << 24, class139.field2398[class272.method1817(var2[var9], 255)]);
            }
            var6 = new class109(class52.field1094, class43.field944, class252.field4341[0], class226.field3868[0], class174.field3060[0], class175.field3063[0], var8);
        } else {
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class139.field2398[class272.method1817(255, var2[var5])];
            }
            var6 = new class225(class52.field1094, class43.field944, class252.field4341[0], class226.field3868[0], class174.field3060[0], class175.field3063[0], var4);
        }
        class190.method1291((byte) 103);
        return var6;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
    public class166(int arg0) {
        this.field2932 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(ZI)Lld;")
    public static final class78 method1162(boolean arg0, int arg1) {
        field2944++;
        if (arg0) {
            field2937 = null;
        }
        class78 var2 = (class78) class128.field2248.method1549((long) arg1, 9447);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class17.field301.method1645(true, arg1, 0);
        } else {
            var3 = class182.field3196.method1645(!arg0, arg1 & 0x7FFF, 0);
        }
        class78 var4 = new class78();
        if (var3 != null) {
            var4.method602(true, new class32(var3));
        }
        if (arg1 >= 32768) {
            var4.method605((byte) -127);
        }
        class128.field2248.method1552((byte) -76, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILsb;)V")
    public static final void method1163(int arg0, class215 arg1) {
        field2945++;
        int var2 = arg1.field3729 - class241.field4246;
        int var3 = arg1.field3704 * 128 + arg1.method1441((byte) 87) * 64;
        int var4 = arg1.field3691 * 128 + arg1.method1441((byte) 71) * 64;
        arg1.field3700 += (var4 - arg1.field3700) / var2;
        arg1.field3710 += (var3 - arg1.field3710) / var2;
        arg1.field3701 = 0;
        if (arg1.field3708 == 0) {
            arg1.field3717 = 1024;
        }
        if (arg1.field3708 == 1) {
            arg1.field3717 = 1536;
        }
        if (arg1.field3708 == 2) {
            arg1.field3717 = 0;
        }
        if (arg1.field3708 == 3) {
            arg1.field3717 = 512;
        }
        if (arg0 <= 18) {
            field2940 = -58;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public static void method1164(int arg0) {
        field2935 = null;
        field2942 = null;
        field2937 = null;
        if (arg0 == 3) {
            field2941 = null;
        }
    }
}
