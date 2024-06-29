import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class class238 {

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lmc;")
    public static class170 field4000 = new class170();

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field4004 = 0;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Lwa;")
    public static class75 field4009 = class66.method560("www)2wtrc", false);

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "[[I")
    public static int[][] field4010 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Lwa;")
    public static class75 field4011 = class66.method560("<col=ffffff> )4 ", false);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Lsf;")
    public static class100 field4008;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "[I")
    public static int[] field4006;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lja;I)Lwa;", line = 32)
    public static final class75 method1724(class60 arg0, int arg1) {
        if (arg1 < 21) {
            return (class75) null;
        } else {
            field3998++;
            return class283.method2002(32767, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILah;)V", line = 73)
    public static final void method1725(int arg0, class194 arg1) {
        field4003++;
        if (arg1.field3219 == 0) {
            return;
        }
        if (arg1.field3237 != -1 && arg1.field3237 < 32768) {
            class295 var2 = class35.field521[arg1.field3237];
            if (var2 != null) {
                int var3 = arg1.field3218 - var2.field3218;
                int var4 = arg1.field3259 - var2.field3259;
                if (var4 != 0 || var3 != 0) {
                    arg1.field3206 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3237 >= 32768) {
            int var5 = arg1.field3237 - 32768;
            if (class88.field1460 == var5) {
                var5 = 2047;
            }
            class96 var6 = class169.field2842[var5];
            if (var6 != null) {
                int var7 = arg1.field3259 - var6.field3259;
                int var8 = arg1.field3218 - var6.field3218;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3206 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3213 != 0 || arg1.field3256 != 0) && (arg1.field3246 == 0 || arg1.field3231 > 0)) {
            int var9 = arg1.field3259 - ((-class275.field4737 + arg1.field3213 + -class275.field4737) * 64 + 64 - (arg1.method739(0) * 64));
            int var10 = arg1.field3218 - (-(arg1.method739(0) * 64) - -((-class175.field2939 + arg1.field3256 - class175.field2939) * 64)) - 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field3206 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field3256 = 0;
            arg1.field3213 = 0;
        }
        if (arg0 != 2048) {
            method1725(-16, (class194) null);
        }
        int var11 = arg1.field3206 - arg1.field3274 & 0x7FF;
        if (var11 == 0) {
            arg1.field3217 = 0;
            return;
        }
        arg1.field3217++;
        if (var11 > 1024) {
            arg1.field3274 -= arg1.field3219;
            boolean var12 = true;
            if (arg1.field3219 > var11 || var11 > 2048 - arg1.field3219) {
                arg1.field3274 = arg1.field3206;
                var12 = false;
            }
            if (arg1.field3228 == arg1.field3215 && (arg1.field3217 > 25 || var12)) {
                if (arg1.field3229 == -1) {
                    arg1.field3215 = arg1.field3269;
                } else {
                    arg1.field3215 = arg1.field3229;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field3274 += arg1.field3219;
            if (var11 < arg1.field3219 || 2048 - arg1.field3219 < var11) {
                var13 = false;
                arg1.field3274 = arg1.field3206;
            }
            if (arg1.field3228 == arg1.field3215 && (arg1.field3217 > 25 || var13)) {
                if (arg1.field3227 == -1) {
                    arg1.field3215 = arg1.field3269;
                } else {
                    arg1.field3215 = arg1.field3227;
                }
            }
        }
        arg1.field3274 &= 0x7FF;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 196)
    public static void method1726(byte arg0) {
        field4008 = null;
        field4000 = null;
        if (arg0 <= -98) {
            field4011 = null;
            field4010 = (int[][]) null;
            field4006 = null;
            field4009 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
    public abstract void method355(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
    public abstract void method351(int arg0, int arg1);
}
